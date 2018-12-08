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

/// Build time configurable limits
#ifndef HEAP_ARRAY_SIZE
//! Size of heap hashmap
#define HEAP_ARRAY_SIZE           47
#endif
#ifndef ENABLE_THREAD_CACHE
//! Enable per-thread cache
#define ENABLE_THREAD_CACHE       1
#endif
#ifndef ENABLE_GLOBAL_CACHE
//! Enable global cache shared between all threads, requires thread cache
#define ENABLE_GLOBAL_CACHE       1
#endif
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
#ifndef DISABLE_UNMAP
//! Disable unmapping memory pages
#define DISABLE_UNMAP             0
#endif
#ifndef DEFAULT_SPAN_MAP_COUNT
//! Default number of spans to map in call to map more virtual memory
#define DEFAULT_SPAN_MAP_COUNT    32
#endif

#if ENABLE_THREAD_CACHE
#ifndef ENABLE_UNLIMITED_CACHE
//! Unlimited thread and global cache unified control
#define ENABLE_UNLIMITED_CACHE    0
#endif
#ifndef ENABLE_UNLIMITED_THREAD_CACHE
//! Unlimited cache disables any thread cache limitations
#define ENABLE_UNLIMITED_THREAD_CACHE ENABLE_UNLIMITED_CACHE
#endif
#if !ENABLE_UNLIMITED_THREAD_CACHE
//! Multiplier for thread cache (cache limit will be span release count multiplied by this value)
#define THREAD_CACHE_MULTIPLIER 16
#endif
#endif

#if ENABLE_GLOBAL_CACHE && ENABLE_THREAD_CACHE
#ifndef ENABLE_UNLIMITED_GLOBAL_CACHE
//! Unlimited cache disables any global cache limitations
#define ENABLE_UNLIMITED_GLOBAL_CACHE ENABLE_UNLIMITED_CACHE
#endif
#if !ENABLE_UNLIMITED_GLOBAL_CACHE
//! Multiplier for global cache (cache limit will be span release count multiplied by this value)
#define GLOBAL_CACHE_MULTIPLIER 64
#endif
#else
#  undef ENABLE_GLOBAL_CACHE
#  define ENABLE_GLOBAL_CACHE 0
#endif

#if DISABLE_UNMAP && !ENABLE_GLOBAL_CACHE
#  error Must use global cache if unmap is disabled
#endif

#if defined( _WIN32 ) || defined( __WIN32__ ) || defined( _WIN64 )
#  define PLATFORM_WINDOWS 1
#  define PLATFORM_POSIX 0
#else
#  define PLATFORM_WINDOWS 0
#  define PLATFORM_POSIX 1
#endif

/// Platform and arch specifics
#if defined(_MSC_VER) && !defined(__clang__)
#  define FORCEINLINE __forceinline
#  define _Static_assert static_assert
#else
#  define FORCEINLINE inline __attribute__((__always_inline__))
#endif
#if PLATFORM_WINDOWS
#  if ENABLE_VALIDATE_ARGS
#    include <Intsafe.h>
#  endif
#else
#  include <unistd.h>
#  include <stdio.h>
#  include <stdlib.h>
#  if defined(__APPLE__)
#    include <mach/mach_vm.h>
#    include <pthread.h>
#  endif
#  if defined(__HAIKU__)
#    include <OS.h>
#    include <pthread.h>
#  endif
#endif

#if defined( __x86_64__ ) || defined( _M_AMD64 ) || defined( _M_X64 ) || defined( _AMD64_ ) || defined( __arm64__ ) || defined( __aarch64__ )
#  define ARCH_64BIT 1
#else
#  define ARCH_64BIT 0
#endif

#include <stdint.h>
#include <string.h>

#if ENABLE_ASSERTS
#  undef NDEBUG
#  if defined(_MSC_VER) && !defined(_DEBUG)
#    define _DEBUG
#  endif
#  include <assert.h>
#else
#  undef  assert
#  define assert(x) do {} while(0)
#endif

/// Atomic access abstraction
#if defined(_MSC_VER) && !defined(__clang__)

typedef volatile long      atomic32_t;
typedef volatile long long atomic64_t;
typedef volatile void*     atomicptr_t;

#define atomic_thread_fence_acquire()
#define atomic_thread_fence_release()

static FORCEINLINE int32_t atomic_load32(atomic32_t* src) { return *src; }
static FORCEINLINE void    atomic_store32(atomic32_t* dst, int32_t val) { *dst = val; }
static FORCEINLINE int32_t atomic_incr32(atomic32_t* val) { return (int32_t)_InterlockedExchangeAdd(val, 1) + 1; }
static FORCEINLINE int32_t atomic_add32(atomic32_t* val, int32_t add) { return (int32_t)_InterlockedExchangeAdd(val, add) + add; }
static FORCEINLINE void*   atomic_load_ptr(atomicptr_t* src) { return (void*)*src; }
static FORCEINLINE void    atomic_store_ptr(atomicptr_t* dst, void* val) { *dst = val; }
#if ARCH_64BIT
static FORCEINLINE int     atomic_cas_ptr(atomicptr_t* dst, void* val, void* ref) { return (_InterlockedCompareExchange64((volatile long long*)dst, (long long)val, (long long)ref) == (long long)ref) ? 1 : 0; }
#else
static FORCEINLINE int     atomic_cas_ptr(atomicptr_t* dst, void* val, void* ref) { return (_InterlockedCompareExchange((volatile long*)dst, (long)val, (long)ref) == (long)ref) ? 1 : 0; }
#endif

#else

#include <stdatomic.h>

typedef volatile _Atomic(int32_t) atomic32_t;
typedef volatile _Atomic(int64_t) atomic64_t;
typedef volatile _Atomic(void*) atomicptr_t;

#define atomic_thread_fence_acquire() atomic_thread_fence(memory_order_acquire)
#define atomic_thread_fence_release() atomic_thread_fence(memory_order_release)

static FORCEINLINE int32_t atomic_load32(atomic32_t* src) { return atomic_load_explicit(src, memory_order_relaxed); }
static FORCEINLINE void    atomic_store32(atomic32_t* dst, int32_t val) { atomic_store_explicit(dst, val, memory_order_relaxed); }
static FORCEINLINE int32_t atomic_incr32(atomic32_t* val) { return atomic_fetch_add_explicit(val, 1, memory_order_relaxed) + 1; }
static FORCEINLINE int32_t atomic_add32(atomic32_t* val, int32_t add) { return atomic_fetch_add_explicit(val, add, memory_order_relaxed) + add; }
static FORCEINLINE void*   atomic_load_ptr(atomicptr_t* src) { return atomic_load_explicit(src, memory_order_relaxed); }
static FORCEINLINE void    atomic_store_ptr(atomicptr_t* dst, void* val) { atomic_store_explicit(dst, val, memory_order_relaxed); }
static FORCEINLINE int     atomic_cas_ptr(atomicptr_t* dst, void* val, void* ref) { return atomic_compare_exchange_weak_explicit(dst, &ref, val, memory_order_release, memory_order_acquire); }

#endif

/// Preconfigured limits and sizes
//! Granularity of a small allocation block
#define SMALL_GRANULARITY         32
//! Small granularity shift count
#define SMALL_GRANULARITY_SHIFT   5
//! Number of small block size classes
#define SMALL_CLASS_COUNT         63
//! Maximum size of a small block
#define SMALL_SIZE_LIMIT          (SMALL_GRANULARITY * SMALL_CLASS_COUNT)
//! Granularity of a medium allocation block
#define MEDIUM_GRANULARITY        512
//! Medium granularity shift count
#define MEDIUM_GRANULARITY_SHIFT  9
//! Number of medium block size classes
#define MEDIUM_CLASS_COUNT        63
//! Total number of small + medium size classes
#define SIZE_CLASS_COUNT          (SMALL_CLASS_COUNT + MEDIUM_CLASS_COUNT)
//! Number of large block size classes
#define LARGE_CLASS_COUNT         32
//! Maximum size of a medium block
#define MEDIUM_SIZE_LIMIT         (SMALL_SIZE_LIMIT + (MEDIUM_GRANULARITY * MEDIUM_CLASS_COUNT))
//! Maximum size of a large block
#define LARGE_SIZE_LIMIT          ((LARGE_CLASS_COUNT * _memory_span_size) - SPAN_HEADER_SIZE)
//! Size of a span header
#define SPAN_HEADER_SIZE          64

#define pointer_offset(ptr, ofs) (void*)((char*)(ptr) + (ptrdiff_t)(ofs))
#define pointer_diff(first, second) (ptrdiff_t)((const char*)(first) - (const char*)(second))

#if ARCH_64BIT
typedef int64_t offset_t;
#else
typedef int32_t offset_t;
#endif
typedef uint32_t count_t;

#if ENABLE_VALIDATE_ARGS
//! Maximum allocation size to avoid integer overflow
#undef  MAX_ALLOC_SIZE
#define MAX_ALLOC_SIZE            (((size_t)-1) - _memory_span_size)
#endif

/// Data types
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
//! Global cache
typedef struct global_cache_t global_cache_t;

//! Flag indicating span is the first (master) span of a split superspan
#define SPAN_FLAG_MASTER 1
//! Flag indicating span is a secondary (sub) span of a split superspan
#define SPAN_FLAG_SUBSPAN 2

struct span_block_t {
	//! Free list
	uint16_t    free_list;
	//! First autolinked block
	uint16_t    first_autolink;
	//! Free count
	uint16_t    free_count;
};

struct span_list_t {
	//! List size
	uint32_t    size;
};

union span_data_t {
	//! Span data when used as blocks
	span_block_t block;
	//! Span data when used in lists
	span_list_t list;
	//! Dummy
	uint64_t compound;
};

//A span can either represent a single span of memory pages with size declared by span_map_count configuration variable,
//or a set of spans in a continuous region, a super span. Any reference to the term "span" usually refers to both a single
//span or a super span. A super span can further be divided into multiple spans (or this, super spans), where the first
//(super)span is the master and subsequent (super)spans are subspans. The master span keeps track of how many subspans
//that are still alive and mapped in virtual memory, and once all subspans and master have been unmapped the entire
//superspan region is released and unmapped (on Windows for example, the entire superspan range has to be released
//in the same call to release the virtual memory range, but individual subranges can be decommitted individually
//to reduce physical memory use).
struct span_t {
	//!	Heap ID
	atomic32_t  heap_id;
	//! Size class
	uint16_t    size_class;
	//! Flags and counters
	uint16_t    flags;
	//! Span data depending on use
	span_data_t data;
	//! Total span counter for master spans, distance for subspans
	uint32_t    total_spans_or_distance;
	//! Number of spans
	uint32_t    span_count;
	//! Remaining span counter, for master spans
	atomic32_t  remaining_spans;
	//! Alignment offset
	uint32_t    align_offset;
	//! Next span
	span_t*     next_span;
	//! Previous span
	span_t*     prev_span;
};
_Static_assert(sizeof(span_t) <= SPAN_HEADER_SIZE, "span size mismatch");

struct heap_t {
	//! Heap ID
	int32_t      id;
	//! Free count for each size class active span
	span_block_t active_block[SIZE_CLASS_COUNT];
	//! Active span for each size class
	span_t*      active_span[SIZE_CLASS_COUNT];
	//! List of semi-used spans with free blocks for each size class (double linked list)
	span_t*      size_cache[SIZE_CLASS_COUNT];
#if ENABLE_THREAD_CACHE
	//! List of free spans (single linked list)
	span_t*      span_cache[LARGE_CLASS_COUNT];
#endif
	//! Mapped but unused spans
	span_t*      span_reserve;
	//! Master span for mapped but unused spans
	span_t*      span_reserve_master;
	//! Number of mapped but unused spans
	size_t       spans_reserved;
	//! Deferred deallocation
	atomicptr_t  defer_deallocate;
	//! Next heap in id list
	heap_t*      next_heap;
	//! Next heap in orphan list
	heap_t*      next_orphan;
	//! Memory pages alignment offset
	size_t       align_offset;
#if ENABLE_STATISTICS
	//! Number of bytes transitioned thread -> global
	size_t       thread_to_global;
	//! Number of bytes transitioned global -> thread
	size_t       global_to_thread;
#endif
};

struct size_class_t {
	//! Size of blocks in this class
	uint32_t size;
	//! Number of blocks in each chunk
	uint16_t block_count;
	//! Class index this class is merged with
	uint16_t class_idx;
};
_Static_assert(sizeof(size_class_t) == 8, "Size class size mismatch");

struct global_cache_t {
	//! Cache list pointer
	atomicptr_t cache;
	//! Cache size
	atomic32_t size;
	//! ABA counter
	atomic32_t counter;
};

/// Global data
//! Configuration
static rpmalloc_config_t _memory_config;
//! Memory page size
static size_t _memory_page_size;
//! Shift to divide by page size
static size_t _memory_page_size_shift;
//! Granularity at which memory pages are mapped by OS
static size_t _memory_map_granularity;
//! Size of a span of memory pages
static size_t _memory_span_size;
//! Shift to divide by span size
static size_t _memory_span_size_shift;
//! Mask to get to start of a memory span
static uintptr_t _memory_span_mask;
//! Number of spans to map in each map call
static size_t _memory_span_map_count;
//! Number of spans to release from thread cache to global cache (single spans)
static size_t _memory_span_release_count;
//! Number of spans to release from thread cache to global cache (large multiple spans)
static size_t _memory_span_release_count_large;
//! Global size classes
static size_class_t _memory_size_class[SIZE_CLASS_COUNT];
//! Run-time size limit of medium blocks
static size_t _memory_medium_size_limit;
//! Heap ID counter
static atomic32_t _memory_heap_id;
//! Huge page support
static int _memory_huge_pages;
#if ENABLE_GLOBAL_CACHE
//! Global span cache
static global_cache_t _memory_span_cache[LARGE_CLASS_COUNT];
#endif
//! All heaps
static atomicptr_t _memory_heaps[HEAP_ARRAY_SIZE];
//! Orphaned heaps
static atomicptr_t _memory_orphan_heaps;
//! Running orphan counter to avoid ABA issues in linked list
static atomic32_t _memory_orphan_counter;
//! Active heap count
static atomic32_t _memory_active_heaps;
#if ENABLE_STATISTICS
//! Total number of currently mapped memory pages
static atomic32_t _mapped_pages;
//! Total number of currently lost spans
static atomic32_t _reserved_spans;
//! Running counter of total number of mapped memory pages since start
static atomic32_t _mapped_total;
//! Running counter of total number of unmapped memory pages since start
static atomic32_t _unmapped_total;
//! Total number of currently mapped memory pages in OS calls
static atomic32_t _mapped_pages_os;
#endif

//! Current thread heap
#if (defined(__APPLE__) || defined(__HAIKU__)) && ENABLE_PRELOAD
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

//! Get the current thread heap
static FORCEINLINE heap_t*
get_thread_heap(void) {
#if (defined(__APPLE__) || defined(__HAIKU__)) && ENABLE_PRELOAD
	return pthread_getspecific(_memory_thread_heap);
#else
	return _memory_thread_heap;
#endif
}

//! Set the current thread heap
static void
set_thread_heap(heap_t* heap) {
#if (defined(__APPLE__) || defined(__HAIKU__)) && ENABLE_PRELOAD
	pthread_setspecific(_memory_thread_heap, heap);
#else
	_memory_thread_heap = heap;
#endif
}

//! Default implementation to map more virtual memory
static void*
_memory_map_os(size_t size, size_t* offset);

//! Default implementation to unmap virtual memory
static void
_memory_unmap_os(void* address, size_t size, size_t offset, size_t release);

//! Deallocate any deferred blocks and check for the given size class
static void
_memory_deallocate_deferred(heap_t* heap);

//! Lookup a memory heap from heap ID
static heap_t*
_memory_heap_lookup(int32_t id) {
	uint32_t list_idx = id % HEAP_ARRAY_SIZE;
	heap_t* heap = atomic_load_ptr(&_memory_heaps[list_idx]);
	while (heap && (heap->id != id))
		heap = heap->next_heap;
	return heap;
}

#if ENABLE_STATISTICS
#  define _memory_statistics_add(atomic_counter, value) atomic_add32(atomic_counter, (int32_t)(value))
#  define _memory_statistics_sub(atomic_counter, value) atomic_add32(atomic_counter, -(int32_t)(value))
#else
#  define _memory_statistics_add(atomic_counter, value) do {} while(0)
#  define _memory_statistics_sub(atomic_counter, value) do {} while(0)
#endif

static void
_memory_heap_cache_insert(heap_t* heap, span_t* span);

//! Map more virtual memory
static void*
_memory_map(size_t size, size_t* offset) {
	assert(!(size % _memory_page_size));
	assert(size >= _memory_page_size);
	_memory_statistics_add(&_mapped_pages, (size >> _memory_page_size_shift));
	_memory_statistics_add(&_mapped_total, (size >> _memory_page_size_shift));
	return _memory_config.memory_map(size, offset);
}

//! Unmap virtual memory
static void
_memory_unmap(void* address, size_t size, size_t offset, size_t release) {
	assert(!release || (release >= size));
	assert(!release || (release >= _memory_page_size));
	if (release) {
		assert(!(release % _memory_page_size));
		_memory_statistics_sub(&_mapped_pages, (release >> _memory_page_size_shift));
		_memory_statistics_add(&_unmapped_total, (release >> _memory_page_size_shift));
	}
	_memory_config.memory_unmap(address, size, offset, release);
}

//! Map in memory pages for the given number of spans (or use previously reserved pages)
static span_t*
_memory_map_spans(heap_t* heap, size_t span_count) {
	if (span_count <= heap->spans_reserved) {
		span_t* span = heap->span_reserve;
		heap->span_reserve = pointer_offset(span, span_count * _memory_span_size);
		heap->spans_reserved -= span_count;
		if (span == heap->span_reserve_master) {
			assert(span->flags & SPAN_FLAG_MASTER);
		}
		else {
			//Declare the span to be a subspan with given distance from master span
			uint32_t distance = (uint32_t)((uintptr_t)pointer_diff(span, heap->span_reserve_master) >> _memory_span_size_shift);
			span->flags = SPAN_FLAG_SUBSPAN;
			span->total_spans_or_distance = distance;
			span->align_offset = 0;
		}
		span->span_count = (uint32_t)span_count;
		return span;
	}

	//If we already have some, but not enough, reserved spans, release those to heap cache and map a new
	//full set of spans. Otherwise we would waste memory if page size > span size (huge pages)
	size_t request_spans = (span_count > _memory_span_map_count) ? span_count : _memory_span_map_count;
	if ((_memory_page_size > _memory_span_size) && ((request_spans * _memory_span_size) % _memory_page_size))
		request_spans += _memory_span_map_count - (request_spans % _memory_span_map_count);
	size_t align_offset = 0;
	span_t* span = _memory_map(request_spans * _memory_span_size, &align_offset);
	if (!span)
		return span;
	span->align_offset = (uint32_t)align_offset;
	span->total_spans_or_distance = (uint32_t)request_spans;
	span->span_count = (uint32_t)span_count;
	span->flags = SPAN_FLAG_MASTER;
	atomic_store32(&span->remaining_spans, (int32_t)request_spans);
	_memory_statistics_add(&_reserved_spans, request_spans);
	if (request_spans > span_count) {
		if (heap->spans_reserved) {
			span_t* prev_span = heap->span_reserve;
			if (prev_span == heap->span_reserve_master) {
				assert(prev_span->flags & SPAN_FLAG_MASTER);
			}
			else {
				uint32_t distance = (uint32_t)((uintptr_t)pointer_diff(prev_span, heap->span_reserve_master) >> _memory_span_size_shift);
				prev_span->flags = SPAN_FLAG_SUBSPAN;
				prev_span->total_spans_or_distance = distance;
				prev_span->align_offset = 0;
			}
			prev_span->span_count = (uint32_t)heap->spans_reserved;
			atomic_store32(&prev_span->heap_id, heap->id);
			_memory_heap_cache_insert(heap, prev_span);
		}
		heap->span_reserve_master = span;
		heap->span_reserve = pointer_offset(span, span_count * _memory_span_size);
		heap->spans_reserved = request_spans - span_count;
	}
	return span;
}

//! Unmap memory pages for the given number of spans (or mark as unused if no partial unmappings)
static void
_memory_unmap_span(span_t* span) {
	size_t span_count = span->span_count;
	assert((span->flags & SPAN_FLAG_MASTER) || (span->flags & SPAN_FLAG_SUBSPAN));
	assert(!(span->flags & SPAN_FLAG_MASTER) || !(span->flags & SPAN_FLAG_SUBSPAN));

	int is_master = !!(span->flags & SPAN_FLAG_MASTER);
	span_t* master = is_master ? span : (pointer_offset(span, -(int32_t)(span->total_spans_or_distance * _memory_span_size)));

	assert(is_master || (span->flags & SPAN_FLAG_SUBSPAN));
	assert(master->flags & SPAN_FLAG_MASTER);

	if (!is_master) {
		//Directly unmap subspans (unless huge pages, in which case we defer and unmap entire page range with master)
		assert(span->align_offset == 0);
		if (_memory_span_size >= _memory_page_size) {
			_memory_unmap(span, span_count * _memory_span_size, 0, 0);
			_memory_statistics_sub(&_reserved_spans, span_count);
		}
	}
	else {
		//Special double flag to denote an unmapped master
		//It must be kept in memory since span header must be used
		span->flags |= SPAN_FLAG_MASTER | SPAN_FLAG_SUBSPAN;
	}

	if (atomic_add32(&master->remaining_spans, -(int32_t)span_count) <= 0) {
		//Everything unmapped, unmap the master span with release flag to unmap the entire range of the super span
		assert(!!(master->flags & SPAN_FLAG_MASTER) && !!(master->flags & SPAN_FLAG_SUBSPAN));
		size_t unmap_count = master->span_count;
		if (_memory_span_size < _memory_page_size)
			unmap_count = master->total_spans_or_distance;
		_memory_statistics_sub(&_reserved_spans, unmap_count);
		_memory_unmap(master, unmap_count * _memory_span_size, master->align_offset, master->total_spans_or_distance * _memory_span_size);
	}
}

#if ENABLE_THREAD_CACHE

//! Unmap a single linked list of spans
static void
_memory_unmap_span_list(span_t* span) {
	size_t list_size = span->data.list.size;
	for (size_t ispan = 0; ispan < list_size; ++ispan) {
		span_t* next_span = span->next_span;
		_memory_unmap_span(span);
		span = next_span;
	}
	assert(!span);
}

//! Split a super span in two
static span_t*
_memory_span_split(span_t* span, size_t use_count) {
	size_t current_count = span->span_count;
	uint32_t distance = 0;
	assert(current_count > use_count);
	assert(!(span->flags & SPAN_FLAG_MASTER) || !(span->flags & SPAN_FLAG_SUBSPAN));
	assert(!(span->flags & SPAN_FLAG_MASTER) || !(span->flags & SPAN_FLAG_SUBSPAN));

	span->span_count = (uint32_t)use_count;
	if (span->flags & SPAN_FLAG_SUBSPAN)
		distance = span->total_spans_or_distance;

	//Setup remainder as a subspan
	span_t* subspan = pointer_offset(span, use_count * _memory_span_size);
	subspan->flags = SPAN_FLAG_SUBSPAN;
	subspan->total_spans_or_distance = (uint32_t)(distance + use_count);
	subspan->span_count = (uint32_t)(current_count - use_count);
	subspan->align_offset = 0;
	return subspan;
}

//! Add span to head of single linked span list
static size_t
_memory_span_list_push(span_t** head, span_t* span) {
	span->next_span = *head;
	if (*head)
		span->data.list.size = (*head)->data.list.size + 1;
	else
		span->data.list.size = 1;
	*head = span;
	return span->data.list.size;
}

//! Remove span from head of single linked span list, returns the new list head
static span_t*
_memory_span_list_pop(span_t** head) {
	span_t* span = *head;
	span_t* next_span = 0;
	if (span->data.list.size > 1) {
		next_span = span->next_span;
		assert(next_span);
		next_span->data.list.size = span->data.list.size - 1;
	}
	*head = next_span;
	return span;
}

#endif
#if ENABLE_THREAD_CACHE

//! Split a single linked span list
static span_t*
_memory_span_list_split(span_t* span, size_t limit) {
	span_t* next = 0;
	if (limit < 2)
		limit = 2;
	if (span->data.list.size > limit) {
		count_t list_size = 1;
		span_t* last = span;
		next = span->next_span;
		while (list_size < limit) {
			last = next;
			next = next->next_span;
			++list_size;
		}
		last->next_span = 0;
		assert(next);
		next->data.list.size = span->data.list.size - list_size;
		span->data.list.size = list_size;
		span->prev_span = 0;
	}
	return next;
}

#endif

//! Add a span to a double linked list
static void
_memory_span_list_doublelink_add(span_t** head, span_t* span) {
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
_memory_span_list_doublelink_remove(span_t** head, span_t* span) {
	if (*head == span) {
		*head = span->next_span;
	}
	else {
		span_t* next_span = span->next_span;
		span_t* prev_span = span->prev_span;
		if (next_span)
			next_span->prev_span = prev_span;
		prev_span->next_span = next_span;
	}
}

#if ENABLE_GLOBAL_CACHE

//! Insert the given list of memory page spans in the global cache
static void
_memory_cache_insert(global_cache_t* cache, span_t* span, size_t cache_limit) {
	assert((span->data.list.size == 1) || (span->next_span != 0));
	int32_t list_size = (int32_t)span->data.list.size;
	//Unmap if cache has reached the limit
	if (atomic_add32(&cache->size, list_size) > (int32_t)cache_limit) {
#if !ENABLE_UNLIMITED_GLOBAL_CACHE
		_memory_unmap_span_list(span);
		atomic_add32(&cache->size, -list_size);
		return;
#endif
	}
	void* current_cache, *new_cache;
	do {
		current_cache = atomic_load_ptr(&cache->cache);
		span->prev_span = (void*)((uintptr_t)current_cache & _memory_span_mask);
		new_cache = (void*)((uintptr_t)span | ((uintptr_t)atomic_incr32(&cache->counter) & ~_memory_span_mask));
	} while (!atomic_cas_ptr(&cache->cache, new_cache, current_cache));
}

//! Extract a number of memory page spans from the global cache
static span_t*
_memory_cache_extract(global_cache_t* cache) {
	uintptr_t span_ptr;
	do {
		void* global_span = atomic_load_ptr(&cache->cache);
		span_ptr = (uintptr_t)global_span & _memory_span_mask;
		if (span_ptr) {
			span_t* span = (void*)span_ptr;
			//By accessing the span ptr before it is swapped out of list we assume that a contending thread
			//does not manage to traverse the span to being unmapped before we access it
			void* new_cache = (void*)((uintptr_t)span->prev_span | ((uintptr_t)atomic_incr32(&cache->counter) & ~_memory_span_mask));
			if (atomic_cas_ptr(&cache->cache, new_cache, global_span)) {
				atomic_add32(&cache->size, -(int32_t)span->data.list.size);
				return span;
			}
		}
	} while (span_ptr);
	return 0;
}

//! Finalize a global cache, only valid from allocator finalization (not thread safe)
static void
_memory_cache_finalize(global_cache_t* cache) {
	void* current_cache = atomic_load_ptr(&cache->cache);
	span_t* span = (void*)((uintptr_t)current_cache & _memory_span_mask);
	while (span) {
		span_t* skip_span = (void*)((uintptr_t)span->prev_span & _memory_span_mask);
		atomic_add32(&cache->size, -(int32_t)span->data.list.size);
		_memory_unmap_span_list(span);
		span = skip_span;
	}
	assert(!atomic_load32(&cache->size));
	atomic_store_ptr(&cache->cache, 0);
	atomic_store32(&cache->size, 0);
}

//! Insert the given list of memory page spans in the global cache
static void
_memory_global_cache_insert(span_t* span) {
	size_t span_count = span->span_count;
#if ENABLE_UNLIMITED_GLOBAL_CACHE
	_memory_cache_insert(&_memory_span_cache[span_count - 1], span, 0);
#else
	const size_t cache_limit = (GLOBAL_CACHE_MULTIPLIER * ((span_count == 1) ? _memory_span_release_count : _memory_span_release_count_large));
	_memory_cache_insert(&_memory_span_cache[span_count - 1], span, cache_limit);
#endif
}

//! Extract a number of memory page spans from the global cache for large blocks
static span_t*
_memory_global_cache_extract(size_t span_count) {
	span_t* span = _memory_cache_extract(&_memory_span_cache[span_count - 1]);
	assert(!span || (span->span_count == span_count));
	return span;
}

#endif

//! Insert a single span into thread heap cache, releasing to global cache if overflow
static void
_memory_heap_cache_insert(heap_t* heap, span_t* span) {
#if ENABLE_THREAD_CACHE
	size_t span_count = span->span_count;
	size_t idx = span_count - 1;
#if ENABLE_UNLIMITED_THREAD_CACHE
	_memory_span_list_push(&heap->span_cache[idx], span);
#else
	const size_t release_count = (!idx ? _memory_span_release_count : _memory_span_release_count_large);
	if (_memory_span_list_push(&heap->span_cache[idx], span) <= (release_count * THREAD_CACHE_MULTIPLIER))
		return;
	heap->span_cache[idx] = _memory_span_list_split(span, release_count);
	assert(span->data.list.size == release_count);
#if ENABLE_STATISTICS
	heap->thread_to_global += (size_t)span->data.list.size * span_count * _memory_span_size;
#endif
#if ENABLE_GLOBAL_CACHE
	_memory_global_cache_insert(span);
#else
	_memory_unmap_span_list(span);
#endif
#endif
#else
	(void)sizeof(heap);
	_memory_unmap_span(span);
#endif
}

//! Extract the given number of spans from the different cache levels
static span_t*
_memory_heap_cache_extract(heap_t* heap, size_t span_count) {
#if ENABLE_THREAD_CACHE
	size_t idx = span_count - 1;
	//Step 1: check thread cache
	if (heap->span_cache[idx])
		return _memory_span_list_pop(&heap->span_cache[idx]);
#endif
	//Step 2: Check reserved spans
	if (heap->spans_reserved >= span_count)
		return _memory_map_spans(heap, span_count);
#if ENABLE_THREAD_CACHE
	//Step 3: Check larger super spans and split if we find one
	span_t* span = 0;
	for (++idx; idx < LARGE_CLASS_COUNT; ++idx) {
		if (heap->span_cache[idx]) {
			span = _memory_span_list_pop(&heap->span_cache[idx]);
			break;
		}
	}
	if (span) {
		//Mark the span as owned by this heap before splitting
		size_t got_count = span->span_count;
		assert(got_count > span_count);
		atomic_store32(&span->heap_id, heap->id);
		atomic_thread_fence_release();

		//Split the span and store as reserved if no previously reserved spans, or in thread cache otherwise
		span_t* subspan = _memory_span_split(span, span_count);
		assert((span->span_count + subspan->span_count) == got_count);
		assert(span->span_count == span_count);
		if (!heap->spans_reserved) {
			heap->spans_reserved = got_count - span_count;
			heap->span_reserve = subspan;
			heap->span_reserve_master = pointer_offset(subspan, -(int32_t)(subspan->total_spans_or_distance * _memory_span_size));
		}
		else {
			_memory_heap_cache_insert(heap, subspan);
		}
		return span;
	}
#if ENABLE_GLOBAL_CACHE
	//Step 4: Extract from global cache
	idx = span_count - 1;
	heap->span_cache[idx] = _memory_global_cache_extract(span_count);
	if (heap->span_cache[idx]) {
#if ENABLE_STATISTICS
		heap->global_to_thread += (size_t)heap->span_cache[idx]->data.list.size * span_count * _memory_span_size;
#endif
		return _memory_span_list_pop(&heap->span_cache[idx]);
	}
#endif
#endif
	return 0;
}

//! Allocate a small/medium sized memory block from the given heap
static void*
_memory_allocate_from_heap(heap_t* heap, size_t size) {
	//Calculate the size class index and do a dependent lookup of the final class index (in case of merged classes)
	const size_t base_idx = (size <= SMALL_SIZE_LIMIT) ?
	                        ((size + (SMALL_GRANULARITY - 1)) >> SMALL_GRANULARITY_SHIFT) :
	                        SMALL_CLASS_COUNT + ((size - SMALL_SIZE_LIMIT + (MEDIUM_GRANULARITY - 1)) >> MEDIUM_GRANULARITY_SHIFT);
	assert(!base_idx || ((base_idx - 1) < SIZE_CLASS_COUNT));
	const size_t class_idx = _memory_size_class[base_idx ? (base_idx - 1) : 0].class_idx;

	span_block_t* active_block = heap->active_block + class_idx;
	size_class_t* size_class = _memory_size_class + class_idx;
	const count_t class_size = size_class->size;

	//Step 1: Try to get a block from the currently active span. The span block bookkeeping
	//        data for the active span is stored in the heap for faster access
use_active:
	if (active_block->free_count) {
		//Happy path, we have a span with at least one free block
		span_t* span = heap->active_span[class_idx];
		count_t offset = class_size * active_block->free_list;
		uint32_t* block = pointer_offset(span, SPAN_HEADER_SIZE + offset);
		assert(span && (atomic_load32(&span->heap_id) == heap->id));

		if (active_block->free_count == 1) {
			//Span is now completely allocated, set the bookkeeping data in the
			//span itself and reset the active span pointer in the heap
			span->data.block.free_count = active_block->free_count = 0;
			span->data.block.first_autolink = 0xFFFF;
			heap->active_span[class_idx] = 0;
		}
		else {
			//Get the next free block, either from linked list or from auto link
			++active_block->free_list;
			if (active_block->free_list <= active_block->first_autolink)
				active_block->free_list = (uint16_t)(*block);
			assert(active_block->free_list < size_class->block_count);
			--active_block->free_count;
		}
		return block;
	}

	//Step 2: No active span, try executing deferred deallocations and try again if there
	//        was at least one of the requested size class
	_memory_deallocate_deferred(heap);

	//Step 3: Check if there is a semi-used span of the requested size class available
	if (heap->size_cache[class_idx]) {
		//Promote a pending semi-used span to be active, storing bookkeeping data in
		//the heap structure for faster access
		span_t* span = heap->size_cache[class_idx];
		//Mark span as owned by this heap
		atomic_store32(&span->heap_id, heap->id);
		atomic_thread_fence_release();

		*active_block = span->data.block;
		assert(active_block->free_count > 0);
		heap->size_cache[class_idx] = span->next_span;
		heap->active_span[class_idx] = span;

		goto use_active;
	}

	//Step 4: Find a span in one of the cache levels
	span_t* span = _memory_heap_cache_extract(heap, 1);
	if (!span) {
		//Step 5: Map in more virtual memory
		span = _memory_map_spans(heap, 1);
		if (!span)
			return span;
	}

	//Mark span as owned by this heap and set base data
	assert(span->span_count == 1);
	span->size_class = (uint16_t)class_idx;
	atomic_store32(&span->heap_id, heap->id);
	atomic_thread_fence_release();

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
		span->data.block.first_autolink = 0xFFFF;
	}

	//Return first block if memory page span
	return pointer_offset(span, SPAN_HEADER_SIZE);
}

//! Allocate a large sized memory block from the given heap
static void*
_memory_allocate_large_from_heap(heap_t* heap, size_t size) {
	//Calculate number of needed max sized spans (including header)
	//Since this function is never called if size > LARGE_SIZE_LIMIT
	//the span_count is guaranteed to be <= LARGE_CLASS_COUNT
	size += SPAN_HEADER_SIZE;
	size_t span_count = size >> _memory_span_size_shift;
	if (size & (_memory_span_size - 1))
		++span_count;
	size_t idx = span_count - 1;

	//Step 1: Find span in one of the cache levels
	span_t* span = _memory_heap_cache_extract(heap, span_count);
	if (!span) {
		//Step 2: Map in more virtual memory
		span = _memory_map_spans(heap, span_count);
		if (!span)
			return span;
	}

	//Mark span as owned by this heap and set base data
	assert(span->span_count == span_count);
	span->size_class = (uint16_t)(SIZE_CLASS_COUNT + idx);
	atomic_store32(&span->heap_id, heap->id);
	atomic_thread_fence_release();

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
		heap = (void*)((uintptr_t)raw_heap & ~(uintptr_t)0xFF);
		if (!heap)
			break;
		next_heap = heap->next_orphan;
		orphan_counter = (uintptr_t)atomic_incr32(&_memory_orphan_counter);
		next_raw_heap = (void*)((uintptr_t)next_heap | (orphan_counter & (uintptr_t)0xFF));
	}
	while (!atomic_cas_ptr(&_memory_orphan_heaps, next_raw_heap, raw_heap));

	if (!heap) {
		//Map in pages for a new heap
		size_t align_offset = 0;
		heap = _memory_map((1 + (sizeof(heap_t) >> _memory_page_size_shift)) * _memory_page_size, &align_offset);
		if (!heap)
			return heap;
		memset(heap, 0, sizeof(heap_t));
		heap->align_offset = align_offset;

		//Get a new heap ID
		do {
			heap->id = atomic_incr32(&_memory_heap_id);
			if (_memory_heap_lookup(heap->id))
				heap->id = 0;
		} while (!heap->id);

		//Link in heap in heap ID map
		size_t list_idx = heap->id % HEAP_ARRAY_SIZE;
		do {
			next_heap = atomic_load_ptr(&_memory_heaps[list_idx]);
			heap->next_heap = next_heap;
		} while (!atomic_cas_ptr(&_memory_heaps[list_idx], heap, next_heap));
	}

	//Clean up any deferred operations
	_memory_deallocate_deferred(heap);

	return heap;
}

//! Deallocate the given small/medium memory block from the given heap
static void
_memory_deallocate_to_heap(heap_t* heap, span_t* span, void* p) {
	//Check if span is the currently active span in order to operate
	//on the correct bookkeeping data
	assert(span->span_count == 1);
	const count_t class_idx = span->size_class;
	size_class_t* size_class = _memory_size_class + class_idx;
	int is_active = (heap->active_span[class_idx] == span);
	span_block_t* block_data = is_active ?
	                           heap->active_block + class_idx :
	                           &span->data.block;

	//Check if the span will become completely free
	if (block_data->free_count == ((count_t)size_class->block_count - 1)) {
		//If it was active, reset counter. Otherwise, if not active, remove from
		//partial free list if we had a previous free block (guard for classes with only 1 block)
		if (is_active)
			block_data->free_count = 0;
		else if (block_data->free_count > 0)
			_memory_span_list_doublelink_remove(&heap->size_cache[class_idx], span);

		//Add to heap span cache
		_memory_heap_cache_insert(heap, span);
		return;
	}

	//Check if first free block for this span (previously fully allocated)
	if (block_data->free_count == 0) {
		//add to free list and disable autolink
		_memory_span_list_doublelink_add(&heap->size_cache[class_idx], span);
		block_data->first_autolink = 0xFFFF;
	}
	++block_data->free_count;
	//Span is not yet completely free, so add block to the linked list of free blocks
	void* blocks_start = pointer_offset(span, SPAN_HEADER_SIZE);
	count_t block_offset = (count_t)pointer_diff(p, blocks_start);
	count_t block_idx = block_offset / (count_t)size_class->size;
	uint32_t* block = pointer_offset(blocks_start, block_idx * size_class->size);
	*block = block_data->free_list;
	if (block_data->free_list > block_data->first_autolink)
		block_data->first_autolink = block_data->free_list;
	block_data->free_list = (uint16_t)block_idx;
}

//! Deallocate the given large memory block to the given heap
static void
_memory_deallocate_large_to_heap(heap_t* heap, span_t* span) {
	//Decrease counter
	assert(span->span_count == ((size_t)span->size_class - SIZE_CLASS_COUNT + 1));
	assert(span->size_class >= SIZE_CLASS_COUNT);
	assert(span->size_class - SIZE_CLASS_COUNT < LARGE_CLASS_COUNT);
	assert(!(span->flags & SPAN_FLAG_MASTER) || !(span->flags & SPAN_FLAG_SUBSPAN));
	assert((span->flags & SPAN_FLAG_MASTER) || (span->flags & SPAN_FLAG_SUBSPAN));
	if ((span->span_count > 1) && !heap->spans_reserved) {
		heap->span_reserve = span;
		heap->spans_reserved = span->span_count;
		if (span->flags & SPAN_FLAG_MASTER) {
			heap->span_reserve_master = span;
		}
		else { //SPAN_FLAG_SUBSPAN
			uint32_t distance = span->total_spans_or_distance;
			span_t* master = pointer_offset(span, -(int32_t)(distance * _memory_span_size));
			heap->span_reserve_master = master;
			assert(master->flags & SPAN_FLAG_MASTER);
			assert(atomic_load32(&master->remaining_spans) >= (int32_t)span->span_count);
		}
	}
	else {
		//Insert into cache list
		_memory_heap_cache_insert(heap, span);
	}
}

//! Process pending deferred cross-thread deallocations
static void
_memory_deallocate_deferred(heap_t* heap) {
	//Grab the current list of deferred deallocations
	atomic_thread_fence_acquire();
	void* p = atomic_load_ptr(&heap->defer_deallocate);
	if (!p || !atomic_cas_ptr(&heap->defer_deallocate, 0, p))
		return;
	do {
		void* next = *(void**)p;
		span_t* span = (void*)((uintptr_t)p & _memory_span_mask);
		_memory_deallocate_to_heap(heap, span, p);
		p = next;
	} while (p);
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
	if (size <= _memory_medium_size_limit)
		return _memory_allocate_from_heap(get_thread_heap(), size);
	else if (size <= LARGE_SIZE_LIMIT)
		return _memory_allocate_large_from_heap(get_thread_heap(), size);

	//Oversized, allocate pages directly
	size += SPAN_HEADER_SIZE;
	size_t num_pages = size >> _memory_page_size_shift;
	if (size & (_memory_page_size - 1))
		++num_pages;
	size_t align_offset = 0;
	span_t* span = _memory_map(num_pages * _memory_page_size, &align_offset);
	if (!span)
		return span;
	atomic_store32(&span->heap_id, 0);
	//Store page count in span_count
	span->span_count = (uint32_t)num_pages;
	span->align_offset = (uint32_t)align_offset;

	return pointer_offset(span, SPAN_HEADER_SIZE);
}

//! Deallocate the given block
static void
_memory_deallocate(void* p) {
	if (!p)
		return;

	//Grab the span (always at start of span, using span alignment)
	span_t* span = (void*)((uintptr_t)p & _memory_span_mask);
	int32_t heap_id = atomic_load32(&span->heap_id);
	if (heap_id) {
		heap_t* heap = get_thread_heap();
		if (span->size_class < SIZE_CLASS_COUNT) {
			//Check if block belongs to this heap or if deallocation should be deferred
			if (heap->id == heap_id)
				_memory_deallocate_to_heap(heap, span, p);
			else
				_memory_deallocate_defer(heap_id, p);
		}
		else {
			//Large blocks can always be deallocated and transferred between heaps
			_memory_deallocate_large_to_heap(heap, span);
		}
	}
	else {
		//Oversized allocation, page count is stored in span_count
		size_t num_pages = span->span_count;
		_memory_unmap(span, num_pages * _memory_page_size, span->align_offset, num_pages * _memory_page_size);
	}
}

//! Reallocate the given block to the given size
static void*
_memory_reallocate(void* p, size_t size, size_t oldsize, unsigned int flags) {
	if (p) {
		//Grab the span using guaranteed span alignment
		span_t* span = (void*)((uintptr_t)p & _memory_span_mask);
		int32_t heap_id = atomic_load32(&span->heap_id);
		if (heap_id) {
			if (span->size_class < SIZE_CLASS_COUNT) {
				//Small/medium sized block
				assert(span->span_count == 1);
				size_class_t* size_class = _memory_size_class + span->size_class;
				void* blocks_start = pointer_offset(span, SPAN_HEADER_SIZE);
				count_t block_offset = (count_t)pointer_diff(p, blocks_start);
				count_t block_idx = block_offset / (count_t)size_class->size;
				void* block = pointer_offset(blocks_start, block_idx * size_class->size);
				if ((size_t)size_class->size >= size)
					return block; //Still fits in block, never mind trying to save memory
				if (!oldsize)
					oldsize = size_class->size - (uint32_t)pointer_diff(p, block);
			}
			else {
				//Large block
				size_t total_size = size + SPAN_HEADER_SIZE;
				size_t num_spans = total_size >> _memory_span_size_shift;
				if (total_size & (_memory_span_mask - 1))
					++num_spans;
				size_t current_spans = (span->size_class - SIZE_CLASS_COUNT) + 1;
				assert(current_spans == span->span_count);
				void* block = pointer_offset(span, SPAN_HEADER_SIZE);
				if ((current_spans >= num_spans) && (num_spans >= (current_spans / 2)))
					return block; //Still fits and less than half of memory would be freed
				if (!oldsize)
					oldsize = (current_spans * _memory_span_size) - (size_t)pointer_diff(p, span);
			}
		}
		else {
			//Oversized block
			size_t total_size = size + SPAN_HEADER_SIZE;
			size_t num_pages = total_size >> _memory_page_size_shift;
			if (total_size & (_memory_page_size - 1))
				++num_pages;
			//Page count is stored in span_count
			size_t current_pages = span->span_count;
			void* block = pointer_offset(span, SPAN_HEADER_SIZE);
			if ((current_pages >= num_pages) && (num_pages >= (current_pages / 2)))
				return block; //Still fits and less than half of memory would be freed
			if (!oldsize)
				oldsize = (current_pages * _memory_page_size) - (size_t)pointer_diff(p, span);
		}
	}

	//Size is greater than block size, need to allocate a new block and deallocate the old
	//Avoid hysteresis by overallocating if increase is small (below 37%)
	size_t lower_bound = oldsize + (oldsize >> 2) + (oldsize >> 3);
	void* block = _memory_allocate((size > lower_bound) ? size : ((size > oldsize) ? lower_bound : size));
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
	//Grab the span using guaranteed span alignment
	span_t* span = (void*)((uintptr_t)p & _memory_span_mask);
	int32_t heap_id = atomic_load32(&span->heap_id);
	if (heap_id) {
		//Small/medium block
		if (span->size_class < SIZE_CLASS_COUNT) {
			size_class_t* size_class = _memory_size_class + span->size_class;
			void* blocks_start = pointer_offset(span, SPAN_HEADER_SIZE);
			return size_class->size - (pointer_diff(p, blocks_start) % size_class->size);
		}

		//Large block
		size_t current_spans = (span->size_class - SIZE_CLASS_COUNT) + 1;
		return (current_spans * _memory_span_size) - (size_t)pointer_diff(p, span);
	}

	//Oversized block, page count is stored in span_count
	size_t current_pages = span->span_count;
	return (current_pages * _memory_page_size) - (size_t)pointer_diff(p, span);
}

//! Adjust and optimize the size class properties for the given class
static void
_memory_adjust_size_class(size_t iclass) {
	size_t block_size = _memory_size_class[iclass].size;
	size_t block_count = (_memory_span_size - SPAN_HEADER_SIZE) / block_size;

	_memory_size_class[iclass].block_count = (uint16_t)block_count;
	_memory_size_class[iclass].class_idx = (uint16_t)iclass;

	//Check if previous size classes can be merged
	size_t prevclass = iclass;
	while (prevclass > 0) {
		--prevclass;
		//A class can be merged if number of pages and number of blocks are equal
		if (_memory_size_class[prevclass].block_count == _memory_size_class[iclass].block_count) {
			memcpy(_memory_size_class + prevclass, _memory_size_class + iclass, sizeof(_memory_size_class[iclass]));
		}
		else {
			break;
		}
	}
}

#if defined(_WIN32) || defined(__WIN32__) || defined(_WIN64)
#  include <Windows.h>
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

	if (!_memory_config.memory_map || !_memory_config.memory_unmap) {
		_memory_config.memory_map = _memory_map_os;
		_memory_config.memory_unmap = _memory_unmap_os;
	}

	_memory_huge_pages = 0;
	_memory_page_size = _memory_config.page_size;
	_memory_map_granularity = _memory_page_size;
	if (!_memory_page_size) {
#if PLATFORM_WINDOWS
		SYSTEM_INFO system_info;
		memset(&system_info, 0, sizeof(system_info));
		GetSystemInfo(&system_info);
		_memory_page_size = system_info.dwPageSize;
		_memory_map_granularity = system_info.dwAllocationGranularity;
		if (config && config->enable_huge_pages) {
			HANDLE token = 0;
			size_t large_page_minimum = GetLargePageMinimum();
			if (large_page_minimum)
				OpenProcessToken(GetCurrentProcess(), TOKEN_ADJUST_PRIVILEGES | TOKEN_QUERY, &token);
			if (token) {
				LUID luid;
				if (LookupPrivilegeValue(0, SE_LOCK_MEMORY_NAME, &luid)) {
					TOKEN_PRIVILEGES token_privileges;
					memset(&token_privileges, 0, sizeof(token_privileges));
					token_privileges.PrivilegeCount = 1;
					token_privileges.Privileges[0].Luid = luid;
					token_privileges.Privileges[0].Attributes = SE_PRIVILEGE_ENABLED;
					if (AdjustTokenPrivileges(token, FALSE, &token_privileges, 0, 0, 0)) {
						DWORD err = GetLastError();
						if (err == ERROR_SUCCESS) {
							_memory_huge_pages = 1;
							_memory_page_size = large_page_minimum;
							_memory_map_granularity = large_page_minimum;
						}
					}
				}
				CloseHandle(token);
			}
		}
#else
		_memory_page_size = (size_t)sysconf(_SC_PAGESIZE);
		_memory_map_granularity = _memory_page_size;
		if (config && config->enable_huge_pages) {
#if defined(__linux__)
			size_t huge_page_size = 0;
			FILE* meminfo = fopen("/proc/meminfo", "r");
			if (meminfo) {
				char line[128];
				while (!huge_page_size && fgets(line, sizeof(line) - 1, meminfo)) {
					line[sizeof(line) - 1] = 0;
					if (strstr(line, "Hugepagesize:"))
						huge_page_size = (size_t)strtol(line + 13, 0, 10) * 1024;
				}
				fclose(meminfo);
			}
			if (huge_page_size) {
				_memory_huge_pages = 1;
				_memory_page_size = huge_page_size;
				_memory_map_granularity = huge_page_size;
			}
#elif defined(__APPLE__)
			_memory_huge_pages = 1;
			_memory_page_size = 2 * 1024 * 1024;
			_memory_map_granularity = _memory_page_size;
#endif
		}
#endif
	}
	else {
		if (config && config->enable_huge_pages)
			_memory_huge_pages = 1;
	}

	if (_memory_page_size < 512)
		_memory_page_size = 512;
	if (_memory_page_size > (64 * 1024 * 1024))
		_memory_page_size = (64 * 1024 * 1024);
	_memory_page_size_shift = 0;
	size_t page_size_bit = _memory_page_size;
	while (page_size_bit != 1) {
		++_memory_page_size_shift;
		page_size_bit >>= 1;
	}
	_memory_page_size = ((size_t)1 << _memory_page_size_shift);

	size_t span_size = _memory_config.span_size;
	if (!span_size)
		span_size = (64 * 1024);
	if (span_size > (256 * 1024))
		span_size = (256 * 1024);
	_memory_span_size = 4096;
	_memory_span_size = 4096;
	_memory_span_size_shift = 12;
	while (_memory_span_size < span_size) {
		_memory_span_size <<= 1;
		++_memory_span_size_shift;
	}
	_memory_span_mask = ~(uintptr_t)(_memory_span_size - 1);

	_memory_span_map_count = ( _memory_config.span_map_count ? _memory_config.span_map_count : DEFAULT_SPAN_MAP_COUNT);
	if ((_memory_span_size * _memory_span_map_count) < _memory_page_size)
		_memory_span_map_count = (_memory_page_size / _memory_span_size);
	if ((_memory_page_size >= _memory_span_size) && ((_memory_span_map_count * _memory_span_size) % _memory_page_size))
		_memory_span_map_count = (_memory_page_size / _memory_span_size);

	_memory_config.page_size = _memory_page_size;
	_memory_config.span_size = _memory_span_size;
	_memory_config.span_map_count = _memory_span_map_count;
	_memory_config.enable_huge_pages = _memory_huge_pages;

	_memory_span_release_count = (_memory_span_map_count > 4 ? ((_memory_span_map_count < 64) ? _memory_span_map_count : 64) : 4);
	_memory_span_release_count_large = (_memory_span_release_count > 4 ? (_memory_span_release_count / 2) : 2);

#if (defined(__APPLE__) || defined(__HAIKU__)) && ENABLE_PRELOAD
	if (pthread_key_create(&_memory_thread_heap, 0))
		return -1;
#endif

	atomic_store32(&_memory_heap_id, 0);
	atomic_store32(&_memory_orphan_counter, 0);
	atomic_store32(&_memory_active_heaps, 0);
#if ENABLE_STATISTICS
	atomic_store32(&_reserved_spans, 0);
	atomic_store32(&_mapped_pages, 0);
	atomic_store32(&_mapped_total, 0);
	atomic_store32(&_unmapped_total, 0);
	atomic_store32(&_mapped_pages_os, 0);
#endif

	//Setup all small and medium size classes
	size_t iclass;
	for (iclass = 0; iclass < SMALL_CLASS_COUNT; ++iclass) {
		size_t size = (iclass + 1) * SMALL_GRANULARITY;
		_memory_size_class[iclass].size = (uint16_t)size;
		_memory_adjust_size_class(iclass);
	}

	_memory_medium_size_limit = _memory_span_size - SPAN_HEADER_SIZE;
	if (_memory_medium_size_limit > MEDIUM_SIZE_LIMIT)
		_memory_medium_size_limit = MEDIUM_SIZE_LIMIT;
	for (iclass = 0; iclass < MEDIUM_CLASS_COUNT; ++iclass) {
		size_t size = SMALL_SIZE_LIMIT + ((iclass + 1) * MEDIUM_GRANULARITY);
		if (size > _memory_medium_size_limit)
			size = _memory_medium_size_limit;
		_memory_size_class[SMALL_CLASS_COUNT + iclass].size = (uint16_t)size;
		_memory_adjust_size_class(SMALL_CLASS_COUNT + iclass);
	}

	for (size_t list_idx = 0; list_idx < HEAP_ARRAY_SIZE; ++list_idx)
		atomic_store_ptr(&_memory_heaps[list_idx], 0);

	//Initialize this thread
	rpmalloc_thread_initialize();
	return 0;
}

//! Finalize the allocator
void
rpmalloc_finalize(void) {
	atomic_thread_fence_acquire();

	rpmalloc_thread_finalize();
	//If you hit this assert, you still have active threads or forgot to finalize some thread(s)
	assert(atomic_load32(&_memory_active_heaps) == 0);

	//Free all thread caches
	for (size_t list_idx = 0; list_idx < HEAP_ARRAY_SIZE; ++list_idx) {
		heap_t* heap = atomic_load_ptr(&_memory_heaps[list_idx]);
		while (heap) {
			_memory_deallocate_deferred(heap);

			if (heap->spans_reserved) {
				span_t* span = _memory_map_spans(heap, heap->spans_reserved);
				_memory_unmap_span(span);
			}

			//Free span caches (other thread might have deferred after the thread using this heap finalized)
#if ENABLE_THREAD_CACHE
			for (size_t iclass = 0; iclass < LARGE_CLASS_COUNT; ++iclass) {
				if (heap->span_cache[iclass])
					_memory_unmap_span_list(heap->span_cache[iclass]);
			}
#endif
			heap_t* next_heap = heap->next_heap;
			size_t heap_size = (1 + (sizeof(heap_t) >> _memory_page_size_shift)) * _memory_page_size;
			_memory_unmap(heap, heap_size, heap->align_offset, heap_size);
			heap = next_heap;
		}
	}

#if ENABLE_GLOBAL_CACHE
	//Free global caches
	for (size_t iclass = 0; iclass < LARGE_CLASS_COUNT; ++iclass)
		_memory_cache_finalize(&_memory_span_cache[iclass]);
#endif

	atomic_store_ptr(&_memory_orphan_heaps, 0);
	atomic_thread_fence_release();

#if ENABLE_STATISTICS
	//If you hit these asserts you probably have memory leaks or double frees in your code
	assert(!atomic_load32(&_mapped_pages));
	assert(!atomic_load32(&_reserved_spans));
	assert(!atomic_load32(&_mapped_pages_os));
#endif

#if (defined(__APPLE__) || defined(__HAIKU__)) && ENABLE_PRELOAD
	pthread_key_delete(_memory_thread_heap);
#endif
}

//! Initialize thread, assign heap
void
rpmalloc_thread_initialize(void) {
	if (!get_thread_heap()) {
		atomic_incr32(&_memory_active_heaps);
		heap_t* heap = _memory_allocate_heap();
#if ENABLE_STATISTICS
		heap->thread_to_global = 0;
		heap->global_to_thread = 0;
#endif
		set_thread_heap(heap);
	}
}

//! Finalize thread, orphan heap
void
rpmalloc_thread_finalize(void) {
	heap_t* heap = get_thread_heap();
	if (!heap)
		return;

	_memory_deallocate_deferred(heap);

	//Release thread cache spans back to global cache
#if ENABLE_THREAD_CACHE
	for (size_t iclass = 0; iclass < LARGE_CLASS_COUNT; ++iclass) {
		span_t* span = heap->span_cache[iclass];
#if ENABLE_GLOBAL_CACHE
		while (span) {
			assert(span->span_count == (iclass + 1));
			size_t release_count = (!iclass ? _memory_span_release_count : _memory_span_release_count_large);
			span_t* next = _memory_span_list_split(span, (uint32_t)release_count);
			_memory_global_cache_insert(span);
			span = next;
		}
#else
		if (span)
			_memory_unmap_span_list(span);
#endif
		heap->span_cache[iclass] = 0;
	}
#endif

	//Orphan the heap
	void* raw_heap;
	uintptr_t orphan_counter;
	heap_t* last_heap;
	do {
		last_heap = atomic_load_ptr(&_memory_orphan_heaps);
		heap->next_orphan = (void*)((uintptr_t)last_heap & ~(uintptr_t)0xFF);
		orphan_counter = (uintptr_t)atomic_incr32(&_memory_orphan_counter);
		raw_heap = (void*)((uintptr_t)heap | (orphan_counter & (uintptr_t)0xFF));
	}
	while (!atomic_cas_ptr(&_memory_orphan_heaps, raw_heap, last_heap));

	set_thread_heap(0);
	atomic_add32(&_memory_active_heaps, -1);
}

int
rpmalloc_is_thread_initialized(void) {
	return (get_thread_heap() != 0) ? 1 : 0;
}

const rpmalloc_config_t*
rpmalloc_config(void) {
	return &_memory_config;
}

//! Map new pages to virtual memory
static void*
_memory_map_os(size_t size, size_t* offset) {
	//Either size is a heap (a single page) or a (multiple) span - we only need to align spans, and only if larger than map granularity
	size_t padding = ((size >= _memory_span_size) && (_memory_span_size > _memory_map_granularity)) ? _memory_span_size : 0;
	assert(size >= _memory_page_size);
#if PLATFORM_WINDOWS
	//Ok to MEM_COMMIT - according to MSDN, "actual physical pages are not allocated unless/until the virtual addresses are actually accessed"
	void* ptr = VirtualAlloc(0, size + padding, (_memory_huge_pages ? MEM_LARGE_PAGES : 0) | MEM_RESERVE | MEM_COMMIT, PAGE_READWRITE);
	if (!ptr) {
		assert("Failed to map virtual memory block" == 0);
		return 0;
	}
#else
#  if defined(__APPLE__)
	void* ptr = mmap(0, size + padding, PROT_READ | PROT_WRITE, MAP_PRIVATE | MAP_ANONYMOUS | MAP_UNINITIALIZED, (_memory_huge_pages ? VM_FLAGS_SUPERPAGE_SIZE_2MB : -1), 0);
#  elif defined(MAP_HUGETLB)
	void* ptr = mmap(0, size + padding, PROT_READ | PROT_WRITE, (_memory_huge_pages ? MAP_HUGETLB : 0) | MAP_PRIVATE | MAP_ANONYMOUS | MAP_UNINITIALIZED, -1, 0);
#  else
	void* ptr = mmap(0, size + padding, PROT_READ | PROT_WRITE, MAP_PRIVATE | MAP_ANONYMOUS | MAP_UNINITIALIZED, -1, 0);
#  endif
	if ((ptr == MAP_FAILED) || !ptr) {
		assert("Failed to map virtual memory block" == 0);
		return 0;
	}
#endif
#if ENABLE_STATISTICS
	atomic_add32(&_mapped_pages_os, (int32_t)((size + padding) >> _memory_page_size_shift));
#endif
	if (padding) {
		size_t final_padding = padding - ((uintptr_t)ptr & ~_memory_span_mask);
		assert(final_padding <= _memory_span_size);
		assert(final_padding <= padding);
		assert(!(final_padding % 8));
		ptr = pointer_offset(ptr, final_padding);
		*offset = final_padding >> 3;
	}
	assert((size < _memory_span_size) || !((uintptr_t)ptr & ~_memory_span_mask));
	return ptr;
}

//! Unmap pages from virtual memory
static void
_memory_unmap_os(void* address, size_t size, size_t offset, size_t release) {
	assert(release || (offset == 0));
	assert(!release || (release >= _memory_page_size));
	assert(size >= _memory_page_size);
	if (release && offset) {
		offset <<= 3;
		address = pointer_offset(address, -(int32_t)offset);
#if PLATFORM_POSIX
		//Padding is always one span size
		release += _memory_span_size;
#endif
	}
#if !DISABLE_UNMAP
#if PLATFORM_WINDOWS
	if (!VirtualFree(address, release ? 0 : size, release ? MEM_RELEASE : MEM_DECOMMIT)) {
		assert("Failed to unmap virtual memory block" == 0);
	}
#else
	if (release) {
		if (munmap(address, release)) {
			assert("Failed to unmap virtual memory block" == 0);
		}
	}
	else {
#if defined(POSIX_MADV_FREE)
		if (posix_madvise(address, size, POSIX_MADV_FREE))
#endif
		if (posix_madvise(address, size, POSIX_MADV_DONTNEED)) {
			assert("Failed to madvise virtual memory block as free" == 0);
		}
	}
#endif
#endif
#if ENABLE_STATISTICS
	if (release)
		atomic_add32(&_mapped_pages_os, -(int32_t)(release >> _memory_page_size_shift));
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
	return _memory_allocate(size);
}

void
rpfree(void* ptr) {
	_memory_deallocate(ptr);
}

RPMALLOC_RESTRICT void*
rpcalloc(size_t num, size_t size) {
	size_t total;
#if ENABLE_VALIDATE_ARGS
#if PLATFORM_WINDOWS
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
	void* block = _memory_allocate(total);
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
	return _memory_reallocate(ptr, size, 0, 0);
}

void*
rpaligned_realloc(void* ptr, size_t alignment, size_t size, size_t oldsize,
                  unsigned int flags) {
#if ENABLE_VALIDATE_ARGS
	if ((size + alignment < size) || (alignment > _memory_page_size)) {
		errno = EINVAL;
		return 0;
	}
#endif
	void* block;
	if (alignment > 32) {
		size_t usablesize = _memory_usable_size(ptr);
		if ((usablesize >= size) && (size >= (usablesize / 2)) && !((uintptr_t)ptr & (alignment - 1)))
			return ptr;

		block = rpaligned_alloc(alignment, size);
		if (ptr) {
			if (!oldsize)
				oldsize = usablesize;
			if (!(flags & RPMALLOC_NO_PRESERVE))
				memcpy(block, ptr, oldsize < size ? oldsize : size);
			rpfree(ptr);
		}
	}
	else {
		block = _memory_reallocate(ptr, size, oldsize, flags);
	}
	return block;
}

RPMALLOC_RESTRICT void*
rpaligned_alloc(size_t alignment, size_t size) {
	if (alignment <= 32)
		return rpmalloc(size);

#if ENABLE_VALIDATE_ARGS
	if ((size + alignment < size) || (alignment > _memory_page_size)) {
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
	return (ptr ? _memory_usable_size(ptr) : 0);
}

void
rpmalloc_thread_collect(void) {
	heap_t* heap = get_thread_heap();
	if (heap)
		_memory_deallocate_deferred(heap);
}

void
rpmalloc_thread_statistics(rpmalloc_thread_statistics_t* stats) {
	memset(stats, 0, sizeof(rpmalloc_thread_statistics_t));
	heap_t* heap = get_thread_heap();
	void* p = atomic_load_ptr(&heap->defer_deallocate);
	while (p) {
		void* next = *(void**)p;
		span_t* span = (void*)((uintptr_t)p & _memory_span_mask);
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

#if ENABLE_THREAD_CACHE
	for (size_t iclass = 0; iclass < LARGE_CLASS_COUNT; ++iclass) {
		if (heap->span_cache[iclass])
			stats->spancache = (size_t)heap->span_cache[iclass]->data.list.size * (iclass + 1) * _memory_span_size;
	}
#endif
}

void
rpmalloc_global_statistics(rpmalloc_global_statistics_t* stats) {
	memset(stats, 0, sizeof(rpmalloc_global_statistics_t));
#if ENABLE_STATISTICS
	stats->mapped = (size_t)atomic_load32(&_mapped_pages) * _memory_page_size;
	stats->mapped_total = (size_t)atomic_load32(&_mapped_total) * _memory_page_size;
	stats->unmapped_total = (size_t)atomic_load32(&_unmapped_total) * _memory_page_size;
#endif
#if ENABLE_GLOBAL_CACHE
	for (size_t iclass = 0; iclass < LARGE_CLASS_COUNT; ++iclass) {
		stats->cached += (size_t)atomic_load32(&_memory_span_cache[iclass].size) * (iclass + 1) * _memory_span_size;
	}
#endif
}
