/* rpmalloc.c  -  Memory allocator  -  Public Domain  -  2016 Mattias Jansson / Rampant Pixels
 *
 * This library provides a cross-platform lock free thread caching malloc implementation in C11.
 * The latest source code is always available at
 *
 * https://github.com/rampantpixels/rpmalloc
 *
 * This library is put in the public domain; you can redistribute it and/or modify it without any restrictions.
 *
 */

#include "rpmalloc.h"

// Build time configurable limits

// Presets, if none is defined it will default to performance priority
//#define ENABLE_UNLIMITED_CACHE
//#define DISABLE_CACHE
//#define ENABLE_SPACE_PRIORITY_CACHE

// Presets for cache limits
#if defined(ENABLE_UNLIMITED_CACHE)
// Unlimited caches
#define MIN_SPAN_CACHE_RELEASE 16
#define MAX_SPAN_CACHE_DIVISOR 1
#elif defined(DISABLE_CACHE)
//Disable cache
#define MIN_SPAN_CACHE_RELEASE 1
#define MAX_SPAN_CACHE_DIVISOR 0
#elif defined(ENABLE_SPACE_PRIORITY_CACHE)
// Space priority cache limits
#define MIN_SPAN_CACHE_SIZE 8
#define MIN_SPAN_CACHE_RELEASE 8
#define MAX_SPAN_CACHE_DIVISOR 16
#define GLOBAL_SPAN_CACHE_MULTIPLIER 1
#else
// Default - performance priority cache limits
//! Limit of thread cache in number of spans for each page count class (undefine for unlimited cache - i.e never release spans to global cache unless thread finishes)
//! Minimum cache size to remain after a release to global cache
#define MIN_SPAN_CACHE_SIZE 8
//! Minimum number of spans to transfer between thread and global cache
#define MIN_SPAN_CACHE_RELEASE 16
//! Maximum cache size divisor (max cache size will be max allocation count divided by this divisor)
#define MAX_SPAN_CACHE_DIVISOR 8
//! Multiplier for global span cache limit (max cache size will be calculated like thread cache and multiplied with this)
#define GLOBAL_SPAN_CACHE_MULTIPLIER 4
#endif

//! Size of heap hashmap
#define HEAP_ARRAY_SIZE           79

#ifndef ENABLE_VALIDATE_ARGS
//! Enable validation of args to public entry points
#define ENABLE_VALIDATE_ARGS      0
#endif

#ifndef ENABLE_STATISTICS
//! Enable statistics collection
#define ENABLE_STATISTICS         0
#endif

#ifndef ENABLE_ASSERTS
//! Enable asserts
#define ENABLE_ASSERTS            0
#endif

#ifndef ENABLE_PRELOAD
//! Support preloading
#define ENABLE_PRELOAD            0
#endif

#ifndef ENABLE_GUARDS
//! Enable overwrite/underwrite guards
#define ENABLE_GUARDS             0
#endif

// Platform and arch specifics

#ifdef _MSC_VER
#  define ALIGNED_STRUCT(name, alignment) __declspec(align(alignment)) struct name
#  define FORCEINLINE __forceinline
#  define _Static_assert static_assert
#  define atomic_thread_fence_acquire() //_ReadWriteBarrier()
#  define atomic_thread_fence_release() //_ReadWriteBarrier()
#  if ENABLE_VALIDATE_ARGS
#    include <Intsafe.h>
#  endif
#else
#  include <unistd.h>
#  if defined(__APPLE__) && ENABLE_PRELOAD
#    include <pthread.h>
#  endif
#  define ALIGNED_STRUCT(name, alignment) struct __attribute__((__aligned__(alignment))) name
#  define FORCEINLINE inline __attribute__((__always_inline__))
#  ifdef __arm__
#    define atomic_thread_fence_acquire() __asm volatile("dmb ish" ::: "memory")
#    define atomic_thread_fence_release() __asm volatile("dmb ishst" ::: "memory")
#  else
#    define atomic_thread_fence_acquire() //__asm volatile("" ::: "memory")
#    define atomic_thread_fence_release() //__asm volatile("" ::: "memory")
#  endif
#endif

#if defined( __x86_64__ ) || defined( _M_AMD64 ) || defined( _M_X64 ) || defined( _AMD64_ ) || defined( __arm64__ ) || defined( __aarch64__ )
#  define ARCH_64BIT 1
#else
#  define ARCH_64BIT 0
#endif

#if defined( _WIN32 ) || defined( __WIN32__ ) || defined( _WIN64 )
#  define PLATFORM_WINDOWS 1
#endif

#include <stdint.h>
#include <string.h>

#if ENABLE_ASSERTS
#  include <assert.h>
#else
#  undef  assert
#  define assert(x) do {} while(0)
#endif

#if ENABLE_GUARDS
#  define MAGIC_GUARD 0xDEADBAAD
#endif

// Atomic access abstraction
ALIGNED_STRUCT(atomic32_t, 4) {
	int32_t nonatomic;
};
typedef struct atomic32_t atomic32_t;

ALIGNED_STRUCT(atomic64_t, 8) {
	int64_t nonatomic;
};
typedef struct atomic64_t atomic64_t;

ALIGNED_STRUCT(atomicptr_t, 8) {
	void* nonatomic;
};
typedef struct atomicptr_t atomicptr_t;

static FORCEINLINE int32_t
atomic_load32(atomic32_t* src) {
	return src->nonatomic;
}

static FORCEINLINE void
atomic_store32(atomic32_t* dst, int32_t val) {
	dst->nonatomic = val;
}

static FORCEINLINE int32_t
atomic_incr32(atomic32_t* val) {
#ifdef _MSC_VER
	int32_t old = (int32_t)_InterlockedExchangeAdd((volatile long*)&val->nonatomic, 1);
	return (old + 1);
#else
	return __sync_add_and_fetch(&val->nonatomic, 1);
#endif
}

static FORCEINLINE int32_t
atomic_add32(atomic32_t* val, int32_t add) {
#ifdef _MSC_VER
	int32_t old = (int32_t)_InterlockedExchangeAdd((volatile long*)&val->nonatomic, add);
	return (old + add);
#else
	return __sync_add_and_fetch(&val->nonatomic, add);
#endif
}

static FORCEINLINE void*
atomic_load_ptr(atomicptr_t* src) {
	return src->nonatomic;
}

static FORCEINLINE void
atomic_store_ptr(atomicptr_t* dst, void* val) {
	dst->nonatomic = val;
}

static FORCEINLINE int
atomic_cas_ptr(atomicptr_t* dst, void* val, void* ref) {
#ifdef _MSC_VER
#  if ARCH_64BIT
	return (_InterlockedCompareExchange64((volatile long long*)&dst->nonatomic,
	                                      (long long)val, (long long)ref) == (long long)ref) ? 1 : 0;
#  else
	return (_InterlockedCompareExchange((volatile long*)&dst->nonatomic,
	                                      (long)val, (long)ref) == (long)ref) ? 1 : 0;
#  endif
#else
	return __sync_bool_compare_and_swap(&dst->nonatomic, ref, val);
#endif
}

static void
thread_yield(void);

// Preconfigured limits and sizes

//! Memory page size
static size_t _memory_page_size;
//! Shift to divide by page size
static size_t _memory_page_size_shift;
//! Maximum number of pages in a span (span max size divided by page size)
static size_t _memory_max_page_count;

//! Granularity of all memory page spans for small & medium block allocations
#define SPAN_ADDRESS_GRANULARITY  65536

//! Maximum size of a span of memory pages
#define SPAN_MAX_SIZE             (SPAN_ADDRESS_GRANULARITY)
//! Mask for getting the start of a span of memory pages
#define SPAN_MASK                 (~((uintptr_t)SPAN_MAX_SIZE - 1))
//! Maximum number of memory pages in a span
#define SPAN_MAX_PAGE_COUNT       (SPAN_MAX_SIZE >> _memory_page_size_shift)
//! Number of size classes for spans
#define SPAN_CLASS_COUNT          4
//! Span size class granularity
#define SPAN_CLASS_GRANULARITY    ((SPAN_ADDRESS_GRANULARITY >> _memory_page_size_shift) / SPAN_CLASS_COUNT)

//! Granularity of a small allocation block
#define SMALL_GRANULARITY         16
//! Small granularity shift count
#define SMALL_GRANULARITY_SHIFT   4
//! Maximum size of a small block
#define SMALL_SIZE_LIMIT          2032
//! Number of small block size classes
#define SMALL_CLASS_COUNT         (SMALL_SIZE_LIMIT / SMALL_GRANULARITY)

//! Granularity of a medium allocation block
#define MEDIUM_GRANULARITY        512
//! Medium granularity shift count
#define MEDIUM_GRANULARITY_SHIFT  9
//! Number of medium block size classes
#define MEDIUM_CLASS_COUNT        60
//! Maximum size of a medium block
#define MEDIUM_SIZE_LIMIT         (SMALL_SIZE_LIMIT + (MEDIUM_GRANULARITY * MEDIUM_CLASS_COUNT) - SPAN_HEADER_SIZE)

//! Total number of small + medium size classes
#define SIZE_CLASS_COUNT          (SMALL_CLASS_COUNT + MEDIUM_CLASS_COUNT)

//! Number of large block size classes
#define LARGE_CLASS_COUNT         32
//! Maximum size of a large block
#define LARGE_SIZE_LIMIT          ((LARGE_CLASS_COUNT * SPAN_MAX_SIZE) - SPAN_HEADER_SIZE)

#define SPAN_LIST_LOCK_TOKEN      ((void*)1)

#define pointer_offset(ptr, ofs) (void*)((char*)(ptr) + (ptrdiff_t)(ofs))
#define pointer_diff(first, second) (ptrdiff_t)((const char*)(first) - (const char*)(second))

//! Size of a span header
#define SPAN_HEADER_SIZE          32

#if ARCH_64BIT
typedef int64_t offset_t;
#else
typedef int32_t offset_t;
#endif
typedef uint32_t count_t;

#if ENABLE_VALIDATE_ARGS
//! Maximum allocation size to avoid integer overflow
#undef  MAX_ALLOC_SIZE
#define MAX_ALLOC_SIZE            (((size_t)-1) - SPAN_ADDRESS_GRANULARITY)
#endif

// Data types

//! A memory heap, per thread
typedef struct heap_t heap_t;
//! Span of memory pages
typedef struct span_t span_t;
//! Size class definition
typedef struct size_class_t size_class_t;
//! Span block bookkeeping 
typedef struct span_block_t span_block_t;
//! Span list bookkeeping 
typedef struct span_list_t span_list_t;
//! Span data union, usage depending on span state
typedef union span_data_t span_data_t;
//! Cache data
typedef struct span_counter_t span_counter_t;

//Alignment offset must match in both structures
//to keep the data when transitioning between being
//used for blocks and being part of a list
struct span_block_t {
	//! Free list
	uint16_t    free_list;
	//! First autolinked block
	uint16_t    first_autolink;
	//! Free count
	uint16_t    free_count;
	//! Alignment offset
	uint16_t    align_offset;
};

struct span_list_t {
	//! List size
	uint32_t    size;
	//! Unused in lists
	uint16_t    unused;
	//! Alignment offset
	uint16_t    align_offset;
};

union span_data_t {
	//! Span data when used as blocks
	span_block_t block;
	//! Span data when used in lists
	span_list_t list;
};

struct span_t {
	//!	Heap ID
	atomic32_t  heap_id;
	//! Size class
	count_t     size_class;
	//! Span data
	span_data_t data;
	//! Next span
	span_t*     next_span;
	//! Previous span
	span_t*     prev_span;
};
_Static_assert(sizeof(span_t) <= SPAN_HEADER_SIZE, "span size mismatch");

struct span_counter_t {
	//! Allocation high water mark
	uint32_t  max_allocations;
	//! Current number of allocations
	uint32_t  current_allocations;
	//! Cache limit
	uint32_t  cache_limit;
};

struct heap_t {
	//! Heap ID
	int32_t      id;
	//! Deferred deallocation
	atomicptr_t  defer_deallocate;
	//! Free count for each size class active span
	span_block_t active_block[SIZE_CLASS_COUNT];
	//! Active span for each size class
	span_t*      active_span[SIZE_CLASS_COUNT];
	//! List of demi-used spans with free blocks for each size class (double linked list)
	span_t*      size_cache[SIZE_CLASS_COUNT];
	//! List of free spans for each page count (single linked list)
	span_t*      span_cache[SPAN_CLASS_COUNT];
	//! Allocation counters
	span_counter_t span_counter[SPAN_CLASS_COUNT];
	//! List of free spans for each large class count (single linked list)
	span_t*      large_cache[LARGE_CLASS_COUNT];
	//! Allocation counters for large blocks
	span_counter_t large_counter[LARGE_CLASS_COUNT];
	//! Next heap in id list
	heap_t*      next_heap;
	//! Next heap in orphan list
	heap_t*      next_orphan;
	//! Memory pages alignment offset
	size_t       align_offset;
#if ENABLE_STATISTICS
	//! Number of bytes currently requested in allocations
	size_t       requested;
	//! Number of bytes current allocated
	size_t       allocated;
	//! Number of bytes transitioned thread -> global
	size_t       thread_to_global;
	//! Number of bytes transitioned global -> thread
	size_t       global_to_thread;
#endif
};

struct size_class_t {
	//! Size of blocks in this class
	uint16_t size;
	//! Number of pages to allocate for a chunk
	uint16_t page_count;
	//! Number of blocks in each chunk
	uint16_t block_count;
	//! Class index this class is merged with
	uint16_t class_idx;
};
_Static_assert(sizeof(size_class_t) == 8, "Size class size mismatch");

//! Configuration
static rpmalloc_config_t _memory_config;

//! Global size classes
static size_class_t _memory_size_class[SIZE_CLASS_COUNT];

//! Heap ID counter
static atomic32_t _memory_heap_id;

//! Global span cache
static atomicptr_t _memory_span_cache[SPAN_CLASS_COUNT];

//! Global large cache
static atomicptr_t _memory_large_cache[LARGE_CLASS_COUNT];

//! All heaps
static atomicptr_t _memory_heaps[HEAP_ARRAY_SIZE];

//! Orphaned heaps
static atomicptr_t _memory_orphan_heaps;

//! Running orphan counter to avoid ABA issues in linked list
static atomic32_t _memory_orphan_counter;

//! Active heap count
static atomic32_t _memory_active_heaps;

//! Adaptive cache max allocation count
static uint32_t _memory_max_allocation[SPAN_CLASS_COUNT];

//! Adaptive cache max allocation count
static uint32_t _memory_max_allocation_large[LARGE_CLASS_COUNT];

#if ENABLE_STATISTICS
//! Total number of mapped memory pages
static atomic32_t _mapped_pages;
//! Running counter of total number of mapped memory pages since start
static atomic32_t _mapped_total;
//! Running counter of total number of unmapped memory pages since start
static atomic32_t _unmapped_total;
#endif

//! Current thread heap
#if defined(__APPLE__) && ENABLE_PRELOAD
static pthread_key_t _memory_thread_heap;
#else
#  ifdef _MSC_VER
#    define _Thread_local __declspec(thread)
#    define TLS_MODEL
#  else
#    define TLS_MODEL __attribute__((tls_model("initial-exec")))
#    if !defined(__clang__) && defined(__GNUC__)
#      define _Thread_local __thread
#    endif
#  endif
static _Thread_local heap_t* _memory_thread_heap TLS_MODEL;
#endif

static FORCEINLINE heap_t*
get_thread_heap(void) {
#if defined(__APPLE__) && ENABLE_PRELOAD
	return pthread_getspecific(_memory_thread_heap);
#else
	return _memory_thread_heap;
#endif
}

static void
set_thread_heap(heap_t* heap) {
#if defined(__APPLE__) && ENABLE_PRELOAD
	pthread_setspecific(_memory_thread_heap, heap);
#else
	_memory_thread_heap = heap;
#endif
}

static void*
_memory_map_os(size_t page_count);

static void
_memory_unmap_os(void* ptr, size_t page_count);

static int
_memory_deallocate_deferred(heap_t* heap, size_t size_class);

//! Lookup a memory heap from heap ID
static heap_t*
_memory_heap_lookup(int32_t id) {
	uint32_t list_idx = id % HEAP_ARRAY_SIZE;
	heap_t* heap = atomic_load_ptr(&_memory_heaps[list_idx]);
	while (heap && (heap->id != id))
		heap = heap->next_heap;
	return heap;
}

//! Get the span size class from page count
static size_t
_span_class_from_page_count(size_t page_count) {
	assert((page_count > 0) && (page_count <= _memory_max_page_count));
	return ((page_count + SPAN_CLASS_GRANULARITY - 1) / SPAN_CLASS_GRANULARITY) - 1;
}

//! Increase an allocation counter
static void
_memory_counter_increase(span_counter_t* counter, uint32_t* global_counter) {
	if (++counter->current_allocations > counter->max_allocations) {
		counter->max_allocations = counter->current_allocations;
#if MAX_SPAN_CACHE_DIVISOR > 0
		counter->cache_limit = counter->max_allocations / MAX_SPAN_CACHE_DIVISOR;
#endif
		if (counter->max_allocations > *global_counter)
			*global_counter = counter->max_allocations;
	}
}

static void*
_memory_map(size_t page_count, size_t* align_offset) {
	void* mapped_address;
	void* aligned_address;
	size_t size = page_count * _memory_page_size;

	mapped_address = _memory_config.memory_map(size);

	if (!((uintptr_t)mapped_address & ~(uintptr_t)SPAN_MASK)) {
		aligned_address = mapped_address;
		*align_offset = 0;
	}
	else {
		//Retry with space for alignment
		_memory_config.memory_unmap(mapped_address, size);

		size_t padding = SPAN_ADDRESS_GRANULARITY;
		mapped_address = _memory_config.memory_map(size + padding);
		padding -= (uintptr_t)mapped_address % SPAN_ADDRESS_GRANULARITY;
		aligned_address = pointer_offset(mapped_address, padding);
		//Offset could be 0x10000 (64KiB) if mapped pages are aligned, divide by 2 to fit in uint16_t
		assert(padding <= SPAN_ADDRESS_GRANULARITY);
		assert(!((uintptr_t)mapped_address & ~(uintptr_t)SPAN_MASK));
		*align_offset = (size_t)padding / 2;
	}

#if ENABLE_STATISTICS
	atomic_add32(&_mapped_pages, (int32_t)(size >> _memory_page_size_shift));
	atomic_add32(&_mapped_total, (int32_t)(size >> _memory_page_size_shift));
#endif
 
 	return aligned_address;
}

static void
_memory_unmap(void* address, size_t page_count, size_t align_offset) {
	size_t size = page_count * _memory_page_size;
	void* mapped_address = pointer_offset(address, -(offset_t)(align_offset * 2));
	if (align_offset)
		size += SPAN_ADDRESS_GRANULARITY;
	_memory_config.memory_unmap(mapped_address, size);
}

//! Insert the given list of memory page spans in the global cache for small/medium blocks
static void
_memory_global_cache_insert(span_t* first_span, size_t list_size, size_t page_count) {
	assert((list_size == 1) || (first_span->next_span != 0));
#if MAX_SPAN_CACHE_DIVISOR > 0
	while (1) {
		size_t span_class_idx = _span_class_from_page_count(page_count);
		void* global_span_ptr = atomic_load_ptr(&_memory_span_cache[span_class_idx]);
		if (global_span_ptr != SPAN_LIST_LOCK_TOKEN) {
			uintptr_t global_list_size = (uintptr_t)global_span_ptr & ~SPAN_MASK;
			span_t* global_span = (span_t*)((void*)((uintptr_t)global_span_ptr & SPAN_MASK));

#ifdef GLOBAL_SPAN_CACHE_MULTIPLIER
			size_t cache_limit = GLOBAL_SPAN_CACHE_MULTIPLIER * (_memory_max_allocation[span_class_idx] / MAX_SPAN_CACHE_DIVISOR);
			if ((global_list_size >= cache_limit) && (global_list_size > MIN_SPAN_CACHE_SIZE))
				break;
#endif
			//We only have 16 bits for size of list, avoid overflow
			if ((global_list_size + list_size) > 0xFFFF)
				break;

			//Use prev_span as skip pointer over this sublist range of spans
			first_span->data.list.size = (uint32_t)list_size;
			first_span->prev_span = global_span;

			//Insert sublist into global cache
			global_list_size += list_size;
			void* first_span_ptr = (void*)((uintptr_t)first_span | global_list_size);
			if (atomic_cas_ptr(&_memory_span_cache[span_class_idx], first_span_ptr, global_span_ptr))
				return;
		}
		else {
			//Atomic operation failed, yield timeslice and retry
			thread_yield();
			atomic_thread_fence_acquire();
		}
	}
#endif
	//Global cache full, release pages
	for (size_t ispan = 0; ispan < list_size; ++ispan) {
		assert(first_span);
		span_t* next_span = first_span->next_span;
		_memory_unmap(first_span, page_count, first_span->data.list.align_offset);
		first_span = next_span;
	}
}

//! Extract a number of memory page spans from the global cache for small/medium blocks
static span_t*
_memory_global_cache_extract(size_t page_count) {
	span_t* span = 0;
	size_t span_class_idx = _span_class_from_page_count(page_count);
	atomicptr_t* cache = &_memory_span_cache[span_class_idx];
	atomic_thread_fence_acquire();
	void* global_span_ptr = atomic_load_ptr(cache);
	while (global_span_ptr) {
		if ((global_span_ptr != SPAN_LIST_LOCK_TOKEN) &&
		        atomic_cas_ptr(cache, SPAN_LIST_LOCK_TOKEN, global_span_ptr)) {
			//Grab a number of thread cache spans, using the skip span pointer
			//stored in prev_span to quickly skip ahead in the list to get the new head
			uintptr_t global_span_count = (uintptr_t)global_span_ptr & ~SPAN_MASK;
			span = (span_t*)((void*)((uintptr_t)global_span_ptr & SPAN_MASK));
			assert((span->data.list.size == 1) || (span->next_span != 0));

			span_t* new_global_span = span->prev_span;
			global_span_count -= span->data.list.size;

			//Set new head of global cache list
			void* new_cache_head = global_span_count ?
			                       ((void*)((uintptr_t)new_global_span | global_span_count)) :
			                       0;
			atomic_store_ptr(cache, new_cache_head);
			atomic_thread_fence_release();
			break;
		}

		//List busy, yield timeslice and retry
		thread_yield();
		atomic_thread_fence_acquire();
		global_span_ptr = atomic_load_ptr(cache);
	}

	return span;
}

/*! Insert the given list of memory page spans in the global cache for large blocks,
    similar to _memory_global_cache_insert */
static void
_memory_global_cache_large_insert(span_t* span_list, size_t list_size, size_t span_count) {
	assert((list_size == 1) || (span_list->next_span != 0));
	assert(span_list->size_class == (SIZE_CLASS_COUNT + (span_count - 1)));
#if MAX_SPAN_CACHE_DIVISOR > 0
	atomicptr_t* cache = &_memory_large_cache[span_count - 1];
	while (1) {
		void* global_span_ptr = atomic_load_ptr(cache);
		if (global_span_ptr != SPAN_LIST_LOCK_TOKEN) {
			uintptr_t global_list_size = (uintptr_t)global_span_ptr & ~SPAN_MASK;
			span_t* global_span = (span_t*)((void*)((uintptr_t)global_span_ptr & SPAN_MASK));

#ifdef GLOBAL_SPAN_CACHE_MULTIPLIER
			size_t cache_limit = GLOBAL_SPAN_CACHE_MULTIPLIER * (_memory_max_allocation_large[span_count-1] / MAX_SPAN_CACHE_DIVISOR);
			if ((global_list_size >= cache_limit) && (global_list_size > MIN_SPAN_CACHE_SIZE))
				break;
#endif
			if ((global_list_size + list_size) > 0xFFFF)
				break;

			span_list->data.list.size = (uint32_t)list_size;
			span_list->prev_span = global_span;

			global_list_size += list_size;
			void* new_global_span_ptr = (void*)((uintptr_t)span_list | global_list_size);
			if (atomic_cas_ptr(cache, new_global_span_ptr, global_span_ptr))
				return;
		}
		else {
			thread_yield();
			atomic_thread_fence_acquire();
		}
	}
#endif
	//Global cache full, release spans
	for (size_t ispan = 0; ispan < list_size; ++ispan) {
		assert(span_list);
		span_t* next_span = span_list->next_span;
		_memory_unmap(span_list, span_count * SPAN_MAX_PAGE_COUNT, span_list->data.list.align_offset);
		span_list = next_span;
	}
}

/*! Extract a number of memory page spans from the global cache for large blocks,
    similar to _memory_global_cache_extract */
static span_t*
_memory_global_cache_large_extract(size_t span_count) {
	span_t* span = 0;
	atomicptr_t* cache = &_memory_large_cache[span_count - 1];
	atomic_thread_fence_acquire();
	void* global_span_ptr = atomic_load_ptr(cache);
	while (global_span_ptr) {
		if ((global_span_ptr != SPAN_LIST_LOCK_TOKEN) &&
			atomic_cas_ptr(cache, SPAN_LIST_LOCK_TOKEN, global_span_ptr)) {
			uintptr_t global_list_size = (uintptr_t)global_span_ptr & ~SPAN_MASK;
			span = (span_t*)((void*)((uintptr_t)global_span_ptr & SPAN_MASK));
			assert((span->data.list.size == 1) || (span->next_span != 0));
			assert(span->size_class == (SIZE_CLASS_COUNT + (span_count - 1)));

			span_t* new_global_span = span->prev_span;
			global_list_size -= span->data.list.size;

			void* new_global_span_ptr = global_list_size ?
			                            ((void*)((uintptr_t)new_global_span | global_list_size)) :
			                            0;
			atomic_store_ptr(cache, new_global_span_ptr);
			atomic_thread_fence_release();
			break;
		}

		thread_yield();
		atomic_thread_fence_acquire();
		global_span_ptr = atomic_load_ptr(cache);
	}
	return span;
}

//! Allocate a small/medium sized memory block from the given heap
static void*
_memory_allocate_from_heap(heap_t* heap, size_t size) {
#if ENABLE_STATISTICS
	//For statistics we need to store the requested size in the memory block
	size += sizeof(size_t);
#endif

	//Calculate the size class index and do a dependent lookup of the final class index (in case of merged classes)
	const size_t class_idx = _memory_size_class[(size <= SMALL_SIZE_LIMIT) ?
		((size + (SMALL_GRANULARITY - 1)) >> SMALL_GRANULARITY_SHIFT) - 1 :
		SMALL_CLASS_COUNT + ((size - SMALL_SIZE_LIMIT + (MEDIUM_GRANULARITY - 1)) >> MEDIUM_GRANULARITY_SHIFT) - 1].class_idx;

	span_block_t* active_block = heap->active_block + class_idx;
	size_class_t* size_class = _memory_size_class + class_idx;
	const count_t class_size = size_class->size;

#if ENABLE_STATISTICS
	heap->allocated += class_size;
	heap->requested += size;
#endif

	//Step 1: Try to get a block from the currently active span. The span block bookkeeping
	//        data for the active span is stored in the heap for faster access
use_active:
	if (active_block->free_count) {
		//Happy path, we have a span with at least one free block
		span_t* span = heap->active_span[class_idx];
		count_t offset = class_size * active_block->free_list;
		uint32_t* block = pointer_offset(span, SPAN_HEADER_SIZE + offset);
		assert(span);

		--active_block->free_count;
		if (!active_block->free_count) {
			//Span is now completely allocated, set the bookkeeping data in the
			//span itself and reset the active span pointer in the heap
			span->data.block.free_count = 0;
			span->data.block.first_autolink = (uint16_t)size_class->block_count;
			heap->active_span[class_idx] = 0;
		}
		else {
			//Get the next free block, either from linked list or from auto link
			if (active_block->free_list < active_block->first_autolink) {
				active_block->free_list = (uint16_t)(*block);
			}
			else {
				++active_block->free_list;
				++active_block->first_autolink;
			}
			assert(active_block->free_list < size_class->block_count);
		}

#if ENABLE_STATISTICS
		//Store the requested size for statistics
		*(size_t*)pointer_offset(block, class_size - sizeof(size_t)) = size;
#endif

		return block;
	}

	//Step 2: No active span, try executing deferred deallocations and try again if there
	//        was at least one of the requested size class
	if (_memory_deallocate_deferred(heap, class_idx)) {
		if (active_block->free_count)
			goto use_active;
	}

	//Step 3: Check if there is a semi-used span of the requested size class available
	if (heap->size_cache[class_idx]) {
		//Promote a pending semi-used span to be active, storing bookkeeping data in
		//the heap structure for faster access
		span_t* span = heap->size_cache[class_idx];
		*active_block = span->data.block;
		assert(active_block->free_count > 0);
		span_t* next_span = span->next_span;
		heap->size_cache[class_idx] = next_span;
		heap->active_span[class_idx] = span;
		goto use_active;
	}

	//Step 4: No semi-used span available, try grab a span from the thread cache
	size_t span_class_idx = _span_class_from_page_count(size_class->page_count);
	span_t* span = heap->span_cache[span_class_idx];
	if (!span) {
		//Step 5: No span available in the thread cache, try grab a list of spans from the global cache
		span = _memory_global_cache_extract(size_class->page_count);
#if ENABLE_STATISTICS
		if (span)
			heap->global_to_thread += (size_t)span->data.list.size * size_class->page_count * _memory_page_size;
#endif
	}
	if (span) {
		if (span->data.list.size > 1) {
			//We got a list of spans, we will use first as active and store remainder in thread cache
			span_t* next_span = span->next_span;
			assert(next_span);
			next_span->data.list.size = span->data.list.size - 1;
			heap->span_cache[span_class_idx] = next_span;
		}
		else {
			heap->span_cache[span_class_idx] = 0;
		}
	}
	else {
		//Step 6: All caches empty, map in new memory pages
		size_t align_offset = 0;
		span = _memory_map(size_class->page_count, &align_offset);
		span->data.block.align_offset = (uint16_t)align_offset;
	}

	//Mark span as owned by this heap and set base data
	atomic_store32(&span->heap_id, heap->id);
	atomic_thread_fence_release();

	span->size_class = (count_t)class_idx;

	//If we only have one block we will grab it, otherwise
	//set span as new span to use for next allocation
	if (size_class->block_count > 1) {
		//Reset block order to sequential auto linked order
		active_block->free_count = (uint16_t)(size_class->block_count - 1);
		active_block->free_list = 1;
		active_block->first_autolink = 1;
		heap->active_span[class_idx] = span;
	}
	else {
		span->data.block.free_count = 0;
		span->data.block.first_autolink = (uint16_t)size_class->block_count;
	}

	//Track counters
	_memory_counter_increase(&heap->span_counter[span_class_idx], &_memory_max_allocation[span_class_idx]);

#if ENABLE_STATISTICS
	//Store the requested size for statistics
	*(size_t*)pointer_offset(span, SPAN_HEADER_SIZE + class_size - sizeof(size_t)) = size;
#endif

	//Return first block if memory page span
	return pointer_offset(span, SPAN_HEADER_SIZE);
}

//! Allocate a large sized memory block from the given heap
static void*
_memory_allocate_large_from_heap(heap_t* heap, size_t size) {
	//Calculate number of needed max sized spans (including header)
	size += SPAN_HEADER_SIZE;
	size_t num_spans = size / SPAN_MAX_SIZE;
	if (size % SPAN_MAX_SIZE)
		++num_spans;
	size_t idx = num_spans - 1;

	if (!idx) {
		//Shared with medium/small spans
		size_t span_class_idx = _span_class_from_page_count(SPAN_MAX_PAGE_COUNT);
		//Step 1: Check span cache
		span_t* span = heap->span_cache[span_class_idx];
		if (!span) {
			_memory_deallocate_deferred(heap, 0);
			span = heap->span_cache[span_class_idx];
		}
		if (!span) {
			//Step 2: No span available in the thread cache, try grab a list of spans from the global cache
			span = _memory_global_cache_extract(SPAN_MAX_PAGE_COUNT);
#if ENABLE_STATISTICS
			if (span)
				heap->global_to_thread += (size_t)span->data.list.size * SPAN_MAX_PAGE_COUNT * _memory_page_size;
#endif
		}
		if (span) {
			if (span->data.list.size > 1) {
				//We got a list of spans, we will use first as active and store remainder in thread cache
				span_t* next_span = span->next_span;
				assert(next_span);
				next_span->data.list.size = span->data.list.size - 1;
				heap->span_cache[span_class_idx] = next_span;
			}
			else {
				heap->span_cache[span_class_idx] = 0;
			}
		}
		else {
			//Step 3: All caches empty, map in new memory pages
			size_t align_offset = 0;
			span = _memory_map(SPAN_MAX_PAGE_COUNT, &align_offset);
			span->data.block.align_offset = (uint16_t)align_offset;
		}

		//Mark span as owned by this heap and set base data
		atomic_store32(&span->heap_id, heap->id);
		atomic_thread_fence_release();

		span->size_class = SIZE_CLASS_COUNT;

		//Track counters
		_memory_counter_increase(&heap->span_counter[span_class_idx], &_memory_max_allocation[span_class_idx]);

		return pointer_offset(span, SPAN_HEADER_SIZE);
	}

use_cache:
	//Step 1: Check if cache for this large size class (or the following, unless first class) has a span
	while (!heap->large_cache[idx] && (idx < LARGE_CLASS_COUNT) && (idx < num_spans + 1))
		++idx;
	span_t* span = heap->large_cache[idx];
	if (span) {
		//Happy path, use from cache
		if (span->data.list.size > 1) {
			span_t* new_head = span->next_span;
			assert(new_head);
			new_head->data.list.size = span->data.list.size - 1;
			heap->large_cache[idx] = new_head;
		}
		else {
			heap->large_cache[idx] = 0;
		}

		span->size_class = SIZE_CLASS_COUNT + (count_t)idx;

		//Increase counter
		_memory_counter_increase(&heap->large_counter[idx], &_memory_max_allocation_large[idx]);

		return pointer_offset(span, SPAN_HEADER_SIZE);
	}

	//Restore index, we're back to smallest fitting span count
	idx = num_spans - 1;

	//Step 2: Process deferred deallocation
	if (_memory_deallocate_deferred(heap, SIZE_CLASS_COUNT + idx))
		goto use_cache;
	assert(!heap->large_cache[idx]);

	//Step 3: Extract a list of spans from global cache
	span = _memory_global_cache_large_extract(num_spans);
	if (span) {
#if ENABLE_STATISTICS
		heap->global_to_thread += (size_t)span->data.list.size * num_spans * SPAN_MAX_SIZE;
#endif
		//We got a list from global cache, store remainder in thread cache
		if (span->data.list.size > 1) {
			span_t* new_head = span->next_span;
			assert(new_head);
			new_head->prev_span = 0;
			new_head->data.list.size = span->data.list.size - 1;
			heap->large_cache[idx] = new_head;
		}
	}
	else {
		//Step 4: Map in more memory pages
		size_t align_offset = 0;
		span = _memory_map(num_spans * SPAN_MAX_PAGE_COUNT, &align_offset);
		span->data.block.align_offset = (uint16_t)align_offset;
	}
	//Mark span as owned by this heap
	atomic_store32(&span->heap_id, heap->id);
	atomic_thread_fence_release();

	span->size_class = SIZE_CLASS_COUNT + (count_t)idx;

	//Increase counter
	_memory_counter_increase(&heap->large_counter[idx], &_memory_max_allocation_large[idx]);

	return pointer_offset(span, SPAN_HEADER_SIZE);
}

//! Allocate a new heap
static heap_t*
_memory_allocate_heap(void) {
	void* raw_heap;
	void* next_raw_heap;
	uintptr_t orphan_counter;
	heap_t* heap;
	heap_t* next_heap;
	//Try getting an orphaned heap
	atomic_thread_fence_acquire();
	do {
		raw_heap = atomic_load_ptr(&_memory_orphan_heaps);
		heap = (void*)((uintptr_t)raw_heap & ~(uintptr_t)0xFFFF);
		if (!heap)
			break;
		next_heap = heap->next_orphan;
		orphan_counter = (uintptr_t)atomic_incr32(&_memory_orphan_counter);
		next_raw_heap = (void*)((uintptr_t)next_heap | (orphan_counter & 0xFFFF));
	}
	while (!atomic_cas_ptr(&_memory_orphan_heaps, next_raw_heap, raw_heap));

	if (heap) {
		heap->next_orphan = 0;
		return heap;
	}

	//Map in pages for a new heap
	size_t align_offset = 0;
	heap = _memory_map(1 + (sizeof(heap_t) >> _memory_page_size_shift), &align_offset);
	memset(heap, 0, sizeof(heap_t));
	heap->align_offset = align_offset;

	//Get a new heap ID
	do {
		heap->id = atomic_incr32(&_memory_heap_id);
		if (_memory_heap_lookup(heap->id))
			heap->id = 0;
	}
	while (!heap->id);

	//Link in heap in heap ID map
	size_t list_idx = heap->id % HEAP_ARRAY_SIZE;
	do {
		next_heap = atomic_load_ptr(&_memory_heaps[list_idx]);
		heap->next_heap = next_heap;
	}
	while (!atomic_cas_ptr(&_memory_heaps[list_idx], heap, next_heap));

	return heap;
}

//! Add a span to a double linked list
static void
_memory_list_add(span_t** head, span_t* span) {
	if (*head) {
		(*head)->prev_span = span;
		span->next_span = *head;
	}
	else {
		span->next_span = 0;
	}
	*head = span;
}

//! Remove a span from a double linked list
static void
_memory_list_remove(span_t** head, span_t* span) {
	if (*head == span) {
		*head = span->next_span;
	}
	else {
		if (span->next_span)
			span->next_span->prev_span = span->prev_span;
		span->prev_span->next_span = span->next_span;
	}
}

//! Insert span into thread cache, releasing to global cache if overflow
static void
_memory_heap_cache_insert(heap_t* heap, span_t* span, size_t page_count) {
#if MAX_SPAN_CACHE_DIVISOR == 0
	(void)sizeof(heap);
	_memory_global_cache_insert(span, 1, page_count);
#else
	size_t span_class_idx = _span_class_from_page_count(page_count);
	span_t** cache = &heap->span_cache[span_class_idx];
	span->next_span = *cache;
	if (*cache)
		span->data.list.size = (*cache)->data.list.size + 1;
	else
		span->data.list.size = 1;
	*cache = span;
#if MAX_SPAN_CACHE_DIVISOR > 1
	//Check if cache exceeds limit
	if ((span->data.list.size >= (MIN_SPAN_CACHE_RELEASE + MIN_SPAN_CACHE_SIZE)) &&
			(span->data.list.size > heap->span_counter[span_class_idx].cache_limit)) {
		//Release to global cache
		count_t list_size = 1;
		span_t* next = span->next_span;
		span_t* last = span;
		while (list_size < MIN_SPAN_CACHE_RELEASE) {
			last = next;
			next = next->next_span;
			++list_size;
		}
		next->data.list.size = span->data.list.size - list_size;
		last->next_span = 0; //Terminate list
		*cache = next;
		_memory_global_cache_insert(span, list_size, page_count);
#if ENABLE_STATISTICS
		heap->thread_to_global += list_size * page_count * _memory_page_size;
#endif
	}
#endif
#endif
}

//! Deallocate the given small/medium memory block from the given heap
static void
_memory_deallocate_to_heap(heap_t* heap, span_t* span, void* p) {
	//Check if span is the currently active span in order to operate
	//on the correct bookkeeping data
	const count_t class_idx = span->size_class;
	size_class_t* size_class = _memory_size_class + class_idx;
	int is_active = (heap->active_span[class_idx] == span);
	span_block_t* block_data = is_active ?
		heap->active_block + class_idx :
		&span->data.block;

#if ENABLE_STATISTICS
	heap->allocated -= size_class->size;
	heap->requested -= *(size_t*)pointer_offset(p, size_class->size - sizeof(size_t));
#endif

	//Check if the span will become completely free
	if (block_data->free_count == ((count_t)size_class->block_count - 1)) {
		//Track counters
		size_t span_class_idx = _span_class_from_page_count(size_class->page_count);
		assert(heap->span_counter[span_class_idx].current_allocations > 0);
		--heap->span_counter[span_class_idx].current_allocations;

		//If it was active, reset counter. Otherwise, if not active, remove from
		//partial free list if we had a previous free block (guard for classes with only 1 block)
		if (is_active)
			block_data->free_count = 0;
		else if (block_data->free_count > 0)
			_memory_list_remove(&heap->size_cache[class_idx], span);

		//Add to span cache
		_memory_heap_cache_insert(heap, span, size_class->page_count);
		return;
	}

	//Check if first free block for this span (previously fully allocated)
	if (block_data->free_count == 0) {
		//add to free list and disable autolink
		_memory_list_add(&heap->size_cache[class_idx], span);
		block_data->first_autolink = (uint16_t)size_class->block_count;
	}
	++block_data->free_count;
	//Span is not yet completely free, so add block to the linked list of free blocks
	void* blocks_start = pointer_offset(span, SPAN_HEADER_SIZE);
	count_t block_offset = (count_t)pointer_diff(p, blocks_start);
	count_t block_idx = block_offset / (count_t)size_class->size;
	uint32_t* block = pointer_offset(blocks_start, block_idx * size_class->size);
	*block = block_data->free_list;
	block_data->free_list = (uint16_t)block_idx;
}

//! Deallocate the given large memory block from the given heap
static void
_memory_deallocate_large_to_heap(heap_t* heap, span_t* span) {
	//Check if aliased with 64KiB small/medium spans
	if (span->size_class == SIZE_CLASS_COUNT) {
		//Track counters
		size_t span_class_idx = _span_class_from_page_count(SPAN_MAX_PAGE_COUNT);
		--heap->span_counter[span_class_idx].current_allocations;
		//Add to span cache
		_memory_heap_cache_insert(heap, span, SPAN_MAX_PAGE_COUNT);
		return;
	}

	//Decrease counter
	size_t idx = span->size_class - SIZE_CLASS_COUNT;
	span_counter_t* counter = heap->large_counter + idx;
	assert(counter->current_allocations > 0);
	--counter->current_allocations;

#if MAX_SPAN_CACHE_DIVISOR == 0
	_memory_global_cache_large_insert(span, 1, idx + 1);
#else
	//Insert into cache list
	span_t** cache = heap->large_cache + idx;
	span->next_span = *cache;
	if (*cache)
		span->data.list.size = (*cache)->data.list.size + 1;
	else
		span->data.list.size = 1;
	*cache = span;
#if MAX_SPAN_CACHE_DIVISOR > 1
	//Check if cache exceeds limit
	if ((span->data.list.size >= (MIN_SPAN_CACHE_RELEASE + MIN_SPAN_CACHE_SIZE)) &&
			(span->data.list.size > counter->cache_limit)) {
		//Release to global cache
		count_t list_size = 1;
		span_t* next = span->next_span;
		span_t* last = span;
		while (list_size < MIN_SPAN_CACHE_RELEASE) {
			last = next;
			next = next->next_span;
			++list_size;
		}
		assert(next->next_span);
		next->data.list.size = span->data.list.size - list_size;
		last->next_span = 0; //Terminate list
		*cache = next;
		_memory_global_cache_large_insert(span, list_size, idx + 1);
#if ENABLE_STATISTICS
		heap->thread_to_global += list_size * (idx + 1) * SPAN_MAX_SIZE;
#endif
	}
#endif
#endif
}

//! Process pending deferred cross-thread deallocations
static int
_memory_deallocate_deferred(heap_t* heap, size_t size_class) {
	//Grab the current list of deferred deallocations
	atomic_thread_fence_acquire();
	void* p = atomic_load_ptr(&heap->defer_deallocate);
	if (!p)
		return 0;
	if (!atomic_cas_ptr(&heap->defer_deallocate, 0, p))
		return 0;
	//Keep track if we deallocate in the given size class
	int got_class = 0;
	do {
		void* next = *(void**)p;
		//Get span and check which type of block
		span_t* span = (void*)((uintptr_t)p & SPAN_MASK);
		if (span->size_class < SIZE_CLASS_COUNT) {
			//Small/medium block
			got_class |= (span->size_class == size_class);
			_memory_deallocate_to_heap(heap, span, p);
		}
		else {
			//Large block
			got_class |= ((span->size_class >= size_class) && (span->size_class <= (size_class + 2)));
			_memory_deallocate_large_to_heap(heap, span);
		}
		//Loop until all pending operations in list are processed
		p = next;
	} while (p);
	return got_class;
}

//! Defer deallocation of the given block to the given heap
static void
_memory_deallocate_defer(int32_t heap_id, void* p) {
	//Get the heap and link in pointer in list of deferred operations
	heap_t* heap = _memory_heap_lookup(heap_id);
	if (!heap)
		return;
	void* last_ptr;
	do {
		last_ptr = atomic_load_ptr(&heap->defer_deallocate);
		*(void**)p = last_ptr; //Safe to use block, it's being deallocated
	} while (!atomic_cas_ptr(&heap->defer_deallocate, p, last_ptr));
}

//! Allocate a block of the given size
static void*
_memory_allocate(size_t size) {
	if (size <= MEDIUM_SIZE_LIMIT)
		return _memory_allocate_from_heap(get_thread_heap(), size);
	else if (size <= LARGE_SIZE_LIMIT)
		return _memory_allocate_large_from_heap(get_thread_heap(), size);

	//Oversized, allocate pages directly
	size += SPAN_HEADER_SIZE;
	size_t num_pages = size >> _memory_page_size_shift;
	if (size % _memory_page_size)
		++num_pages;
	size_t align_offset = 0;
	span_t* span = _memory_map(num_pages, &align_offset);
	atomic_store32(&span->heap_id, 0);
	//Store page count in next_span
	span->next_span = (span_t*)((uintptr_t)num_pages);
	span->data.list.align_offset = (uint16_t)align_offset;

	return pointer_offset(span, SPAN_HEADER_SIZE);
}

//! Deallocate the given block
static void
_memory_deallocate(void* p) {
	if (!p)
		return;

	//Grab the span (always at start of span, using 64KiB alignment)
	span_t* span = (void*)((uintptr_t)p & SPAN_MASK);
	int32_t heap_id = atomic_load32(&span->heap_id);
	heap_t* heap = get_thread_heap();
	//Check if block belongs to this heap or if deallocation should be deferred
	if (heap_id == heap->id) {
		if (span->size_class < SIZE_CLASS_COUNT)
			_memory_deallocate_to_heap(heap, span, p);
		else
			_memory_deallocate_large_to_heap(heap, span);
	}
	else if (heap_id > 0) {
		_memory_deallocate_defer(heap_id, p);
	}
	else {
		//Oversized allocation, page count is stored in next_span
		size_t num_pages = (size_t)span->next_span;
		_memory_unmap(span, num_pages, span->data.list.align_offset);
	}
}

//! Reallocate the given block to the given size
static void*
_memory_reallocate(void* p, size_t size, size_t oldsize, unsigned int flags) {
	if (p) {
		//Grab the span (always at start of span, using 64KiB alignment)
		span_t* span = (void*)((uintptr_t)p & SPAN_MASK);
		int32_t heap_id = atomic_load32(&span->heap_id);
		if (heap_id) {
			if (span->size_class < SIZE_CLASS_COUNT) {
				//Small/medium sized block
				size_class_t* size_class = _memory_size_class + span->size_class;
				if ((size_t)size_class->size >= size)
					return p; //Still fits in block, never mind trying to save memory
				if (!oldsize)
					oldsize = size_class->size;
			}
			else {
				//Large block
				size_t total_size = size + SPAN_HEADER_SIZE;
				size_t num_spans = total_size / SPAN_MAX_SIZE;
				if (total_size % SPAN_MAX_SIZE)
					++num_spans;
				size_t current_spans = (span->size_class - SIZE_CLASS_COUNT) + 1;
				if ((current_spans >= num_spans) && (num_spans >= (current_spans / 2)))
					return p; //Still fits and less than half of memory would be freed
				if (!oldsize)
					oldsize = (current_spans * (size_t)SPAN_MAX_SIZE) - SPAN_HEADER_SIZE;
			}
		}
		else {
			//Oversized block
			size_t total_size = size + SPAN_HEADER_SIZE;
			size_t num_pages = total_size >> _memory_page_size_shift;
			if (total_size % _memory_page_size)
				++num_pages;
			//Page count is stored in next_span
			size_t current_pages = (size_t)span->next_span;
			if ((current_pages >= num_pages) && (num_pages >= (current_pages / 2)))
				return p; //Still fits and less than half of memory would be freed
			if (!oldsize)
				oldsize = (current_pages * _memory_page_size) - SPAN_HEADER_SIZE;
		}
	}

	//Size is greater than block size, need to allocate a new block and deallocate the old
	//Avoid hysteresis by overallocating if increase is small (below 37%)
	size_t lower_bound = oldsize + (oldsize >> 2) + (oldsize >> 3);
	void* block = _memory_allocate(size > lower_bound ? size : lower_bound);
	if (p) {
		if (!(flags & RPMALLOC_NO_PRESERVE))
			memcpy(block, p, oldsize < size ? oldsize : size);
		_memory_deallocate(p);
	}

	return block;
}

//! Get the usable size of the given block
static size_t
_memory_usable_size(void* p) {
	//Grab the span (always at start of span, using 64KiB alignment)
	span_t* span = (void*)((uintptr_t)p & SPAN_MASK);
	int32_t heap_id = atomic_load32(&span->heap_id);
	if (heap_id) {
		if (span->size_class < SIZE_CLASS_COUNT) {
			//Small/medium block
			size_class_t* size_class = _memory_size_class + span->size_class;
			return size_class->size;
		}

		//Large block
		size_t current_spans = (span->size_class - SIZE_CLASS_COUNT) + 1;
		return (current_spans * (size_t)SPAN_MAX_SIZE) - SPAN_HEADER_SIZE;
	}

	//Oversized block, page count is stored in next_span
	size_t current_pages = (size_t)span->next_span;
	return (current_pages * _memory_page_size) - SPAN_HEADER_SIZE;
}

//! Adjust and optimize the size class properties for the given class
static void
_memory_adjust_size_class(size_t iclass) {
	//Calculate how many pages are needed for 255 blocks
	size_t block_size = _memory_size_class[iclass].size;
	size_t page_count = (block_size * 255) >> _memory_page_size_shift;
	page_count = (page_count == 0) ? 1 : ((page_count > _memory_max_page_count) ? _memory_max_page_count : page_count);
	//Merge page counts to span size class granularity
	page_count = ((page_count + (SPAN_CLASS_GRANULARITY - 1)) / SPAN_CLASS_GRANULARITY) * SPAN_CLASS_GRANULARITY;
	if (page_count > _memory_max_page_count)
		page_count = _memory_max_page_count;
	size_t block_count = ((page_count * _memory_page_size) - SPAN_HEADER_SIZE) / block_size;
	//Store the final configuration
	_memory_size_class[iclass].page_count = (uint16_t)page_count;
	_memory_size_class[iclass].block_count = (uint16_t)block_count;
	_memory_size_class[iclass].class_idx = (uint16_t)iclass;
	
	//Check if previous size classes can be merged
	size_t prevclass = iclass;
	while (prevclass > 0) {
		--prevclass;
		//A class can be merged if number of pages and number of blocks are equal
		if ((_memory_size_class[prevclass].page_count == _memory_size_class[iclass].page_count) &&
		        (_memory_size_class[prevclass].block_count == _memory_size_class[iclass].block_count)) {
			memcpy(_memory_size_class + prevclass, _memory_size_class + iclass, sizeof(_memory_size_class[iclass]));
		}
		else {
			break;
		}
	}
}

#if defined( _WIN32 ) || defined( __WIN32__ ) || defined( _WIN64 )
#  include <windows.h>
#else
#  include <sys/mman.h>
#  include <sched.h>
#  ifndef MAP_UNINITIALIZED
#    define MAP_UNINITIALIZED 0
#  endif
#endif
#include <errno.h>

//! Initialize the allocator and setup global data
int
rpmalloc_initialize(void) {
	memset(&_memory_config, 0, sizeof(rpmalloc_config_t));
	return rpmalloc_initialize_config(0);
}

int
rpmalloc_initialize_config(const rpmalloc_config_t* config) {
	if (config)
		memcpy(&_memory_config, config, sizeof(rpmalloc_config_t));
	if (!_memory_config.memory_map)
		_memory_config.memory_map = _memory_map_os;
	if (!_memory_config.memory_unmap)
		_memory_config.memory_unmap = _memory_unmap_os;
	
	_memory_page_size = _memory_config.page_size;
	if (!_memory_page_size) {
#ifdef PLATFORM_WINDOWS
		SYSTEM_INFO system_info;
		memset(&system_info, 0, sizeof(system_info));
		GetSystemInfo(&system_info);
		if (system_info.dwAllocationGranularity < SPAN_ADDRESS_GRANULARITY)
			return -1;
		_memory_page_size = system_info.dwPageSize;
#else
		_memory_page_size = (size_t)sysconf(_SC_PAGESIZE);
#endif
	}
	if (_memory_page_size < 512)
		_memory_page_size = 512;
	if (_memory_page_size > 16384)
		_memory_page_size = 16384;

	_memory_page_size_shift = 0;
	size_t page_size_bit = _memory_page_size;
	while (page_size_bit != 1) {
		++_memory_page_size_shift;
		page_size_bit >>= 1;
	}

	_memory_page_size = ((size_t)1 << _memory_page_size_shift);
	_memory_max_page_count = (SPAN_MAX_SIZE >> _memory_page_size_shift);

#if defined(__APPLE__) && ENABLE_PRELOAD
	if (pthread_key_create(&_memory_thread_heap, 0))
		return -1;
#endif

	atomic_store32(&_memory_heap_id, 0);
	atomic_store32(&_memory_orphan_counter, 0);

	//Setup all small and medium size classes
	size_t iclass;
	for (iclass = 0; iclass < SMALL_CLASS_COUNT; ++iclass) {
		size_t size = (iclass + 1) * SMALL_GRANULARITY;
		_memory_size_class[iclass].size = (uint16_t)size;
		_memory_adjust_size_class(iclass);
	}
	for (iclass = 0; iclass < MEDIUM_CLASS_COUNT; ++iclass) {
		size_t size = SMALL_SIZE_LIMIT + ((iclass + 1) * MEDIUM_GRANULARITY);
		if (size > MEDIUM_SIZE_LIMIT)
			size = MEDIUM_SIZE_LIMIT;
		_memory_size_class[SMALL_CLASS_COUNT + iclass].size = (uint16_t)size;
		_memory_adjust_size_class(SMALL_CLASS_COUNT + iclass);
	}

	//Initialize this thread
	rpmalloc_thread_initialize();
	return 0;
}

//! Finalize the allocator
void
rpmalloc_finalize(void) {
	atomic_thread_fence_acquire();

	rpmalloc_thread_finalize();

	//Free all thread caches
	for (size_t list_idx = 0; list_idx < HEAP_ARRAY_SIZE; ++list_idx) {
		heap_t* heap = atomic_load_ptr(&_memory_heaps[list_idx]);
		while (heap) {
			_memory_deallocate_deferred(heap, 0);

			for (size_t iclass = 0; iclass < SPAN_CLASS_COUNT; ++iclass) {
				const size_t page_count = (iclass + 1) * SPAN_CLASS_GRANULARITY;
				span_t* span = heap->span_cache[iclass];
				unsigned int span_count = span ? span->data.list.size : 0;
				for (unsigned int ispan = 0; ispan < span_count; ++ispan) {
					span_t* next_span = span->next_span;
					_memory_unmap(span, page_count, span->data.list.align_offset);
					span = next_span;
				}
			}

			//Free large spans
			for (size_t iclass = 0; iclass < LARGE_CLASS_COUNT; ++iclass) {
				const size_t span_count = iclass + 1;
				span_t* span = heap->large_cache[iclass];
				while (span) {
					span_t* next_span = span->next_span;
					_memory_unmap(span, span_count * SPAN_MAX_PAGE_COUNT, span->data.list.align_offset);
					span = next_span;
				}
			}

			heap_t* next_heap = heap->next_heap;
			_memory_unmap(heap, 1 + (sizeof(heap_t) >> _memory_page_size_shift), heap->align_offset);
			heap = next_heap;
		}

		atomic_store_ptr(&_memory_heaps[list_idx], 0);
	}
	atomic_store_ptr(&_memory_orphan_heaps, 0);

	//Free global caches
	for (size_t iclass = 0; iclass < SPAN_CLASS_COUNT; ++iclass) {
		void* span_ptr = atomic_load_ptr(&_memory_span_cache[iclass]);
		size_t cache_count = (uintptr_t)span_ptr & ~SPAN_MASK;
		span_t* span = (span_t*)((void*)((uintptr_t)span_ptr & SPAN_MASK));
		while (cache_count) {
			span_t* skip_span = span->prev_span;
			unsigned int span_count = span->data.list.size;
			for (unsigned int ispan = 0; ispan < span_count; ++ispan) {
				span_t* next_span = span->next_span;
				_memory_unmap(span, (iclass + 1) * SPAN_CLASS_GRANULARITY, span->data.list.align_offset);
				span = next_span;
			}
			span = skip_span;
			cache_count -= span_count;
		}
		atomic_store_ptr(&_memory_span_cache[iclass], 0);
	}

	for (size_t iclass = 0; iclass < LARGE_CLASS_COUNT; ++iclass) {
		void* span_ptr = atomic_load_ptr(&_memory_large_cache[iclass]);
		size_t cache_count = (uintptr_t)span_ptr & ~SPAN_MASK;
		span_t* span = (span_t*)((void*)((uintptr_t)span_ptr & SPAN_MASK));
		while (cache_count) {
			span_t* skip_span = span->prev_span;
			unsigned int span_count = span->data.list.size;
			for (unsigned int ispan = 0; ispan < span_count; ++ispan) {
				span_t* next_span = span->next_span;
				_memory_unmap(span, (iclass + 1) * SPAN_MAX_PAGE_COUNT, span->data.list.align_offset);
				span = next_span;
			}
			span = skip_span;
			cache_count -= span_count;
		}
		atomic_store_ptr(&_memory_large_cache[iclass], 0);
	}

	atomic_thread_fence_release();

#if defined(__APPLE__) && ENABLE_PRELOAD
	pthread_key_delete(_memory_thread_heap);
#endif
}

//! Initialize thread, assign heap
void
rpmalloc_thread_initialize(void) {
	if (!get_thread_heap()) {
		heap_t* heap =  _memory_allocate_heap();
#if ENABLE_STATISTICS
		heap->thread_to_global = 0;
		heap->global_to_thread = 0;
#endif
		set_thread_heap(heap);
		atomic_incr32(&_memory_active_heaps);
	}
}

//! Finalize thread, orphan heap
void
rpmalloc_thread_finalize(void) {
	heap_t* heap = get_thread_heap();
	if (!heap)
		return;

	atomic_add32(&_memory_active_heaps, -1);

	_memory_deallocate_deferred(heap, 0);

	//Release thread cache spans back to global cache
	for (size_t iclass = 0; iclass < SPAN_CLASS_COUNT; ++iclass) {
		const size_t page_count = (iclass + 1) * SPAN_CLASS_GRANULARITY;
		span_t* span = heap->span_cache[iclass];
		while (span) {
			if (span->data.list.size > MIN_SPAN_CACHE_RELEASE) {
				count_t list_size = 1;
				span_t* next = span->next_span;
				span_t* last = span;
				while (list_size < MIN_SPAN_CACHE_RELEASE) {
					last = next;
					next = next->next_span;
					++list_size;
				}
				last->next_span = 0; //Terminate list
				next->data.list.size = span->data.list.size - list_size;
				_memory_global_cache_insert(span, list_size, page_count);
				span = next;
			}
			else {
				_memory_global_cache_insert(span, span->data.list.size, page_count);
				span = 0;
			}
		}
		heap->span_cache[iclass] = 0;
	}

	for (size_t iclass = 0; iclass < LARGE_CLASS_COUNT; ++iclass) {
		const size_t span_count = iclass + 1;
		span_t* span = heap->large_cache[iclass];
		while (span) {
			if (span->data.list.size > MIN_SPAN_CACHE_RELEASE) {
				count_t list_size = 1;
				span_t* next = span->next_span;
				span_t* last = span;
				while (list_size < MIN_SPAN_CACHE_RELEASE) {
					last = next;
					next = next->next_span;
					++list_size;
				}
				last->next_span = 0; //Terminate list
				next->data.list.size = span->data.list.size - list_size;
				_memory_global_cache_large_insert(span, list_size, span_count);
				span = next;
			}
			else {
				_memory_global_cache_large_insert(span, span->data.list.size, span_count);
				span = 0;
			}
		}
		heap->large_cache[iclass] = 0;
	}

	//Reset allocation counters
	memset(heap->span_counter, 0, sizeof(heap->span_counter));
	memset(heap->large_counter, 0, sizeof(heap->large_counter));
#if ENABLE_STATISTICS
	heap->requested = 0;
	heap->allocated = 0;
	heap->thread_to_global = 0;
	heap->global_to_thread = 0;
#endif

	//Orphan the heap
	void* raw_heap;
	uintptr_t orphan_counter;
	heap_t* last_heap;
	do {
		last_heap = atomic_load_ptr(&_memory_orphan_heaps);
		heap->next_orphan = (void*)((uintptr_t)last_heap & ~(uintptr_t)0xFFFF);
		orphan_counter = (uintptr_t)atomic_incr32(&_memory_orphan_counter);
		raw_heap = (void*)((uintptr_t)heap | (orphan_counter & 0xFFFF));
	}
	while (!atomic_cas_ptr(&_memory_orphan_heaps, raw_heap, last_heap));

	set_thread_heap(0);
}

int
rpmalloc_is_thread_initialized(void) {
	return (get_thread_heap() != 0) ? 1 : 0;
}

//! Map new pages to virtual memory
static void*
_memory_map_os(size_t size) {
	void* ptr;

#if ENABLE_STATISTICS
	atomic_add32(&_mapped_pages, (int32_t)(size >> _memory_page_size_shift));
	atomic_add32(&_mapped_total, (int32_t)(size >> _memory_page_size_shift));
#endif

#ifdef PLATFORM_WINDOWS
	ptr = VirtualAlloc(0, size, MEM_RESERVE | MEM_COMMIT, PAGE_READWRITE);
#else
	size_t padding = SPAN_ADDRESS_GRANULARITY;

	ptr = mmap(0, size + padding, PROT_READ | PROT_WRITE, MAP_PRIVATE | MAP_ANONYMOUS | MAP_UNINITIALIZED, -1, 0);
	if (ptr == MAP_FAILED)
		return 0;

	padding -= (uintptr_t)ptr % SPAN_ADDRESS_GRANULARITY;
	ptr = pointer_offset(ptr, padding);
#endif

	return ptr;
}

//! Unmap pages from virtual memory
static void
_memory_unmap_os(void* ptr, size_t size) {
#if ENABLE_STATISTICS
	atomic_add32(&_mapped_pages, -(int32_t)(size >> _memory_page_size_shift));
	atomic_add32(&_unmapped_total, (int32_t)(size >> _memory_page_size_shift));
#endif

#ifdef PLATFORM_WINDOWS
	VirtualFree(ptr, 0, MEM_RELEASE);
	(void)sizeof(size);
#else
	munmap(ptr, size);
#endif
}

//! Yield the thread remaining timeslice
static void
thread_yield(void) {
#ifdef PLATFORM_WINDOWS
	YieldProcessor();
#else
	sched_yield();
#endif
}

// Extern interface

RPMALLOC_RESTRICT void*
rpmalloc(size_t size) {
#if ENABLE_VALIDATE_ARGS
	if (size >= MAX_ALLOC_SIZE) {
		errno = EINVAL;
		return 0;
	}
#endif
#if ENABLE_GUARDS
	size += 32;
#endif
	void* block = _memory_allocate(size);
#if ENABLE_GUARDS
	if (block) {
		size_t block_size = _memory_usable_size(block);
		uint32_t* deadzone = block;
		deadzone[0] = deadzone[1] = deadzone[2] = deadzone[3] = MAGIC_GUARD;
		deadzone = (uint32_t*)pointer_offset(block, block_size - 16);
		deadzone[0] = deadzone[1] = deadzone[2] = deadzone[3] = MAGIC_GUARD;
		block = pointer_offset(block, 16);
	}
#endif
	return block;
}

#if ENABLE_GUARDS
static void
_memory_validate_integrity(void* p) {
	if (!p)
		return;
	void* block_start;
	size_t block_size = _memory_usable_size(p);
	span_t* span = (void*)((uintptr_t)p & SPAN_MASK);
	int32_t heap_id = atomic_load32(&span->heap_id);
	if (heap_id) {
		if (span->size_class < SIZE_CLASS_COUNT) {
			void* span_blocks_start = pointer_offset(span, SPAN_HEADER_SIZE);
			size_class_t* size_class = _memory_size_class + span->size_class;
			count_t block_offset = (count_t)pointer_diff(p, span_blocks_start);
			count_t block_idx = block_offset / (count_t)size_class->size;
	 		block_start = pointer_offset(span_blocks_start, block_idx * size_class->size);
	 	}
	 	else {
			block_start = pointer_offset(span, SPAN_HEADER_SIZE);
	 	}
  	}
	else {
		block_start = pointer_offset(span, SPAN_HEADER_SIZE);
	}
	uint32_t* deadzone = block_start;
	//If these asserts fire, you have written to memory before the block start
	for (int i = 0; i < 4; ++i) {
		if (deadzone[i] == MAGIC_GUARD)
			continue;
		if (_memory_config.memory_overwrite)
			_memory_config.memory_overwrite(p);
		else
			assert(deadzone[i] == MAGIC_GUARD && "Memory overwrite before block start");
		return;
	}
	deadzone = (uint32_t*)pointer_offset(block_start, block_size - 16);
	//If these asserts fire, you have written to memory after the block end
	for (int i = 0; i < 4; ++i) {
		if (deadzone[i] == MAGIC_GUARD)
			continue;
		if (_memory_config.memory_overwrite)
			_memory_config.memory_overwrite(p);
		else
			assert(deadzone[i] == MAGIC_GUARD && "Memory overwrite after block end");
		return;
	}
}
#endif

void
rpfree(void* ptr) {
#if ENABLE_GUARDS
	_memory_validate_integrity(ptr);
#endif	
	_memory_deallocate(ptr);
}

RPMALLOC_RESTRICT void*
rpcalloc(size_t num, size_t size) {
	size_t total;
#if ENABLE_VALIDATE_ARGS
#ifdef PLATFORM_WINDOWS
	int err = SizeTMult(num, size, &total);
	if ((err != S_OK) || (total >= MAX_ALLOC_SIZE)) {
		errno = EINVAL;
		return 0;
	}
#else
	int err = __builtin_umull_overflow(num, size, &total);
	if (err || (total >= MAX_ALLOC_SIZE)) {
		errno = EINVAL;
		return 0;
	}
#endif
#else
	total = num * size;
#endif
#if ENABLE_GUARDS
	total += 32;
#endif
	void* block = _memory_allocate(total);
#if ENABLE_GUARDS
	if (block) {
		size_t block_size = _memory_usable_size(block);
		uint32_t* deadzone = block;
		deadzone[0] = deadzone[1] = deadzone[2] = deadzone[3] = MAGIC_GUARD;
		deadzone = (uint32_t*)pointer_offset(block, block_size - 16);
		deadzone[0] = deadzone[1] = deadzone[2] = deadzone[3] = MAGIC_GUARD;
		block = pointer_offset(block, 16);
		total -= 32;
	}
#endif
	memset(block, 0, total);
	return block;
}

void*
rprealloc(void* ptr, size_t size) {
#if ENABLE_VALIDATE_ARGS
	if (size >= MAX_ALLOC_SIZE) {
		errno = EINVAL;
		return ptr;
	}
#endif
#if ENABLE_GUARDS
	_memory_validate_integrity(ptr);
	size += 32;
#endif
	void* block = _memory_reallocate(ptr, size, 0, 0);
#if ENABLE_GUARDS
	if (block) {
		size_t block_size = _memory_usable_size(block);
		uint32_t* deadzone = block;
		deadzone[0] = deadzone[1] = deadzone[2] = deadzone[3] = MAGIC_GUARD;
		deadzone = (uint32_t*)pointer_offset(block, block_size - 16);
		deadzone[0] = deadzone[1] = deadzone[2] = deadzone[3] = MAGIC_GUARD;
		block = pointer_offset(block, 16);
	}
#endif
	return block;
}

void*
rpaligned_realloc(void* ptr, size_t alignment, size_t size, size_t oldsize,
                  unsigned int flags) {
#if ENABLE_VALIDATE_ARGS
	if ((size + alignment < size) || (alignment > PAGE_SIZE)) {
		errno = EINVAL;
		return 0;
	}
#endif
	void* block;
	if (alignment > 16) {
		block = rpaligned_alloc(alignment, size);
		if (!(flags & RPMALLOC_NO_PRESERVE))
			memcpy(block, ptr, oldsize < size ? oldsize : size);
		rpfree(ptr);
	}
	else {
#if ENABLE_GUARDS
		_memory_validate_integrity(ptr);
		size += 32;
#endif
		block = _memory_reallocate(ptr, size, oldsize, flags);
#if ENABLE_GUARDS
		if (block) {
			size_t block_size = _memory_usable_size(block);
			uint32_t* deadzone = block;
			deadzone[0] = deadzone[1] = deadzone[2] = deadzone[3] = MAGIC_GUARD;
			deadzone = (uint32_t*)pointer_offset(block, block_size - 16);
			deadzone[0] = deadzone[1] = deadzone[2] = deadzone[3] = MAGIC_GUARD;
			block = pointer_offset(block, 16);
		}
#endif
	}
	return block;
}

RPMALLOC_RESTRICT void*
rpaligned_alloc(size_t alignment, size_t size) {
	if (alignment <= 16)
		return rpmalloc(size);

#if ENABLE_VALIDATE_ARGS
	if ((size + alignment < size) || (alignment > PAGE_SIZE)) {
		errno = EINVAL;
		return 0;
	}
#endif

	void* ptr = rpmalloc(size + alignment);
	if ((uintptr_t)ptr & (alignment - 1))
		ptr = (void*)(((uintptr_t)ptr & ~((uintptr_t)alignment - 1)) + alignment);
	return ptr;
}

RPMALLOC_RESTRICT void*
rpmemalign(size_t alignment, size_t size) {
	return rpaligned_alloc(alignment, size);
}

int
rpposix_memalign(void **memptr, size_t alignment, size_t size) {
	if (memptr)
		*memptr = rpaligned_alloc(alignment, size);
	else
		return EINVAL;
	return *memptr ? 0 : ENOMEM;
}

size_t
rpmalloc_usable_size(void* ptr) {
	size_t size = 0;
	if (ptr) {
		size = _memory_usable_size(ptr);
#if ENABLE_GUARDS
		size -= 32;
#endif
	}
	return size;
}

void
rpmalloc_thread_collect(void) {
	_memory_deallocate_deferred(get_thread_heap(), 0);
}

void
rpmalloc_thread_statistics(rpmalloc_thread_statistics_t* stats) {
	memset(stats, 0, sizeof(rpmalloc_thread_statistics_t));
	heap_t* heap = get_thread_heap();
#if ENABLE_STATISTICS
	stats->allocated = heap->allocated;
	stats->requested = heap->requested;
#endif
	void* p = atomic_load_ptr(&heap->defer_deallocate);
	while (p) {
		void* next = *(void**)p;
		span_t* span = (void*)((uintptr_t)p & SPAN_MASK);
		stats->deferred += _memory_size_class[span->size_class].size;
		p = next;
	}

	for (size_t isize = 0; isize < SIZE_CLASS_COUNT; ++isize) {
		if (heap->active_block[isize].free_count)
			stats->active += heap->active_block[isize].free_count * _memory_size_class[heap->active_span[isize]->size_class].size;

		span_t* cache = heap->size_cache[isize];
		while (cache) {
			stats->sizecache = cache->data.block.free_count * _memory_size_class[cache->size_class].size;
			cache = cache->next_span;
		}
	}

	for (size_t isize = 0; isize < SPAN_CLASS_COUNT; ++isize) {
		if (heap->span_cache[isize])
			stats->spancache = (size_t)heap->span_cache[isize]->data.list.size * (isize + 1) * SPAN_CLASS_GRANULARITY * _memory_page_size;
	}
}

void
rpmalloc_global_statistics(rpmalloc_global_statistics_t* stats) {
	memset(stats, 0, sizeof(rpmalloc_global_statistics_t));
#if ENABLE_STATISTICS
	stats->mapped = (size_t)atomic_load32(&_mapped_pages) * _memory_page_size;
	stats->mapped_total = (size_t)atomic_load32(&_mapped_total) * _memory_page_size;
	stats->unmapped_total = (size_t)atomic_load32(&_unmapped_total) * _memory_page_size;
#endif
	for (size_t iclass = 0; iclass < SPAN_CLASS_COUNT; ++iclass) {
		void* global_span_ptr = atomic_load_ptr(&_memory_span_cache[iclass]);
		while (global_span_ptr == SPAN_LIST_LOCK_TOKEN) {
			thread_yield();
			global_span_ptr = atomic_load_ptr(&_memory_span_cache[iclass]);
		}
		uintptr_t global_span_count = (uintptr_t)global_span_ptr & ~SPAN_MASK;
		size_t list_bytes = global_span_count * (iclass + 1) * SPAN_CLASS_GRANULARITY * _memory_page_size;
		stats->cached += list_bytes;
	}
	for (size_t iclass = 0; iclass < LARGE_CLASS_COUNT; ++iclass) {
		void* global_span_ptr = atomic_load_ptr(&_memory_large_cache[iclass]);
		while (global_span_ptr == SPAN_LIST_LOCK_TOKEN) {
			thread_yield();
			global_span_ptr = atomic_load_ptr(&_memory_large_cache[iclass]);
		}
		uintptr_t global_span_count = (uintptr_t)global_span_ptr & ~SPAN_MASK;
		size_t list_bytes = global_span_count * (iclass + 1) * SPAN_MAX_PAGE_COUNT * _memory_page_size;
		stats->cached_large += list_bytes;
	}
}
