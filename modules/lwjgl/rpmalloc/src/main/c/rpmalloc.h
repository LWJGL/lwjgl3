/* rpmalloc.h  -  Memory allocator  -  Public Domain  -  2016 Mattias Jansson / Rampant Pixels
 *
 * This library provides a cross-platform lock free thread caching malloc implementation in C11.
 * The latest source code is always available at
 *
 * https://github.com/rampantpixels/rpmalloc
 *
 * This library is put in the public domain; you can redistribute it and/or modify it without any restrictions.
 *
 */

#pragma once

#include <stddef.h>

#ifdef __cplusplus
extern "C" {
#endif

#if defined(__clang__) || defined(__GNUC__)
# define RPMALLOC_ATTRIBUTE __attribute__((__malloc__))
# define RPMALLOC_RESTRICT
# define RPMALLOC_CDECL
#elif defined(_MSC_VER)
# define RPMALLOC_ATTRIBUTE
# define RPMALLOC_RESTRICT __declspec(restrict)
# define RPMALLOC_CDECL __cdecl
#else
# define RPMALLOC_ATTRIBUTE
# define RPMALLOC_RESTRICT
# define RPMALLOC_CDECL
#endif

//! Flag to rpaligned_realloc to not preserve content in reallocation
#define RPMALLOC_NO_PRESERVE    1

typedef struct rpmalloc_global_statistics_t {
	//! Current amount of virtual memory mapped (only if ENABLE_STATISTICS=1)
	size_t mapped;
	//! Current amount of memory in global caches for small and medium sizes (<64KiB)
	size_t cached;
	//! Total amount of memory mapped (only if ENABLE_STATISTICS=1)
	size_t mapped_total;
	//! Total amount of memory unmapped (only if ENABLE_STATISTICS=1)
	size_t unmapped_total;
} rpmalloc_global_statistics_t;

typedef struct rpmalloc_thread_statistics_t {
	//! Current number of bytes available for allocation from active spans
	size_t active;
	//! Current number of bytes available in thread size class caches
	size_t sizecache;
	//! Current number of bytes available in thread span caches
	size_t spancache;
	//! Current number of bytes in pending deferred deallocations
	size_t deferred;
	//! Total number of bytes transitioned from thread cache to global cache
	size_t thread_to_global;
	//! Total number of bytes transitioned from global cache to thread cache
	size_t global_to_thread;
} rpmalloc_thread_statistics_t;

typedef struct rpmalloc_config_t {
	//! Map memory pages for the given number of bytes. The returned address MUST be
	//  aligned to the rpmalloc span size, which will always be a power of two.
	//  Optionally the function can store an alignment offset in the offset variable
	//  in case it performs alignment and the returned pointer is offset from the
	//  actual start of the memory region due to this alignment. The alignment offset
	//  will be passed to the memory unmap function. The alignment offset MUST NOT be
	//  larger than 65535 (storable in an uint16_t), if it is you must use natural
	//  alignment to shift it into 16 bits. If you set a memory_map function, you
	//  must also set a memory_unmap function or else the default implementation will
	//  be used for both.
	void* (*memory_map)(size_t size, size_t* offset);
	//! Unmap the memory pages starting at address and spanning the given number of bytes.
	//  If release is set to non-zero, the unmap is for an entire span range as returned by
	//  a previous call to memory_map and that the entire range should be released. The
	//  release argument holds the size of the entire span range. If release is set to 0,
	//  the unmap is a partial decommit of a subset of the mapped memory range.
	//  If you set a memory_unmap function, you must also set a memory_map function or
	//  else the default implementation will be used for both.
	void (*memory_unmap)(void* address, size_t size, size_t offset, size_t release);
	//! Size of memory pages. The page size MUST be a power of two. All memory mapping
	//  requests to memory_map will be made with size set to a multiple of the page size.
	size_t page_size;
	//! Size of a span of memory blocks. MUST be a power of two, and in [4096,262144]
	//  range (unless 0 - set to 0 to use the default span size).
	size_t span_size;
	//! Number of spans to map at each request to map new virtual memory blocks. This can
	//  be used to minimize the system call overhead at the cost of virtual memory address
	//  space. The extra mapped pages will not be written until actually used, so physical
	//  committed memory should not be affected in the default implementation. Will be
	//  aligned to a multiple of spans that match memory page size in case of huge pages.
	size_t span_map_count;
	//! Enable use of large/huge pages
	int enable_huge_pages;
} rpmalloc_config_t;

//! Initialize allocator with default configuration
extern int
rpmalloc_initialize(void);

//! Initialize allocator with given configuration
extern int
rpmalloc_initialize_config(const rpmalloc_config_t* config);

//! Get allocator configuration
extern const rpmalloc_config_t*
rpmalloc_config(void);

//! Finalize allocator
extern void
rpmalloc_finalize(void);

//! Initialize allocator for calling thread
extern void
rpmalloc_thread_initialize(void);

//! Finalize allocator for calling thread
extern void
rpmalloc_thread_finalize(void);

//! Perform deferred deallocations pending for the calling thread heap
extern void
rpmalloc_thread_collect(void);

//! Query if allocator is initialized for calling thread
extern int
rpmalloc_is_thread_initialized(void);

//! Get per-thread statistics
extern void
rpmalloc_thread_statistics(rpmalloc_thread_statistics_t* stats);

//! Get global statistics
extern void
rpmalloc_global_statistics(rpmalloc_global_statistics_t* stats);

//! Allocate a memory block of at least the given size
extern RPMALLOC_RESTRICT void*
rpmalloc(size_t size) RPMALLOC_ATTRIBUTE;

//! Free the given memory block
extern void
rpfree(void* ptr);

//! Allocate a memory block of at least the given size and zero initialize it
extern RPMALLOC_RESTRICT void*
rpcalloc(size_t num, size_t size) RPMALLOC_ATTRIBUTE;

//! Reallocate the given block to at least the given size
extern void*
rprealloc(void* ptr, size_t size);

//! Reallocate the given block to at least the given size and alignment, with optional control flags (see RPMALLOC_NO_PRESERVE)
extern void*
rpaligned_realloc(void* ptr, size_t alignment, size_t size, size_t oldsize, unsigned int flags);

//! Allocate a memory block of at least the given size and alignment
extern RPMALLOC_RESTRICT void*
rpaligned_alloc(size_t alignment, size_t size) RPMALLOC_ATTRIBUTE;

//! Allocate a memory block of at least the given size and alignment
extern RPMALLOC_RESTRICT void*
rpmemalign(size_t alignment, size_t size) RPMALLOC_ATTRIBUTE;

//! Allocate a memory block of at least the given size and alignment
extern int
rpposix_memalign(void **memptr, size_t alignment, size_t size);

//! Query the usable size of the given memory block (from given pointer to the end of block)
extern size_t
rpmalloc_usable_size(void* ptr);

#ifdef __cplusplus
}
#endif
