/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://github.com/mjansson/rpmalloc">rpmalloc</a> library. rpmalloc is a public domain cross platform lock free
 * thread caching 16-byte aligned memory allocator implemented in C.
 * 
 * <p>You are required to call these functions from your own code in order to initialize and finalize the allocator in your process and threads:</p>
 * 
 * <ul>
 * <li>{@link #rpmalloc_initialize malloc_initialize}: Call at process start to initialize the allocator</li>
 * <li>{@link #rpmalloc_finalize malloc_finalize}: Call at process exit to finalize the allocator</li>
 * <li>{@link #rpmalloc_thread_initialize malloc_thread_initialize}: Call at each thread start to initialize the thread local data for the allocator</li>
 * <li>{@link #rpmalloc_thread_finalize malloc_thread_finalize}: Call at each thread exit to finalize and release thread cache back to global cache</li>
 * </ul>
 * 
 * <p>Then simply use the {@link #rpmalloc malloc}/{@link #rpfree free} and the other malloc style replacement functions. Remember all allocations are 16-byte aligned, so no need to
 * call the explicit {@link #rpmemalign memalign}/{@link #rpaligned_alloc aligned_alloc}/{@link #rpposix_memalign posix_memalign} functions unless you need greater alignment, they are simply wrappers to make it
 * easier to replace in existing code.</p>
 * 
 * <p>The rpmalloc build in LWJGL is configured with {@code RPMALLOC_CONFIGURABLE=1} and {@code ENABLE_STATISTICS=0}.</p>
 */
public class RPmalloc {

    static { LibRPmalloc.initialize(); }

    /** Flag to {@link #rpaligned_realloc aligned_realloc} to not preserve content in reallocation. */
    public static final int RPMALLOC_NO_PRESERVE = 1;

    /**
     * Flag to {@link #rpaligned_realloc aligned_realloc} to fail and return null pointer if grow cannot be done in-place, in which case the original pointer is still valid (just
     * like a call to realloc which failes to allocate a new block).
     */
    public static final int RPMALLOC_GROW_OR_FAIL = 2;

    protected RPmalloc() {
        throw new UnsupportedOperationException();
    }

    // --- [ rpmalloc_address ] ---

    /** The {@link #rpmalloc malloc} function address. */
    @NativeType("void *")
    static native long rpmalloc_address();

    // --- [ rpcalloc_address ] ---

    /** The {@link #rpcalloc calloc} function address. */
    @NativeType("void *")
    static native long rpcalloc_address();

    // --- [ rprealloc_address ] ---

    /** The {@link #rprealloc realloc} function address. */
    @NativeType("void *")
    static native long rprealloc_address();

    // --- [ rpfree_address ] ---

    /** The {@link #rpfree free} function address. */
    @NativeType("void *")
    static native long rpfree_address();

    // --- [ rpaligned_alloc_address ] ---

    /** The {@link #rpaligned_alloc aligned_alloc} function address. */
    @NativeType("void *")
    static native long rpaligned_alloc_address();

    // --- [ rpmalloc_initialize ] ---

    /** Unsafe version of: {@link #rpmalloc_initialize malloc_initialize} */
    public static native int nrpmalloc_initialize();

    /** Initializes allocator with default configuration. */
    @NativeType("int")
    public static boolean rpmalloc_initialize() {
        return nrpmalloc_initialize() != 0;
    }

    // --- [ rpmalloc_initialize_config ] ---

    /** Unsafe version of: {@link #rpmalloc_initialize_config malloc_initialize_config} */
    public static native int nrpmalloc_initialize_config(long config);

    /**
     * Initializes allocator with given configuration.
     *
     * @param config an optional {@link RPMallocConfig} instance
     */
    @NativeType("int")
    public static boolean rpmalloc_initialize_config(@Nullable @NativeType("rpmalloc_config_t const *") RPMallocConfig config) {
        return nrpmalloc_initialize_config(memAddressSafe(config)) != 0;
    }

    // --- [ rpmalloc_config ] ---

    /** Unsafe version of: {@link #rpmalloc_config malloc_config} */
    public static native long nrpmalloc_config();

    /** Gets allocator configuration. */
    @NativeType("rpmalloc_config_t const *")
    public static RPMallocConfig rpmalloc_config() {
        long __result = nrpmalloc_config();
        return RPMallocConfig.create(__result);
    }

    // --- [ rpmalloc_finalize ] ---

    /** Finalizes allocator. */
    public static native void rpmalloc_finalize();

    // --- [ rpmalloc_thread_initialize ] ---

    /** Initializes allocator for calling thread. */
    public static native void rpmalloc_thread_initialize();

    // --- [ rpmalloc_thread_finalize ] ---

    /** Unsafe version of: {@link #rpmalloc_thread_finalize malloc_thread_finalize} */
    public static native void nrpmalloc_thread_finalize(int release_caches);

    /**
     * Finalizes allocator for calling thread.
     *
     * @param release_caches pass non-zero to release thread caches to global cache
     */
    public static void rpmalloc_thread_finalize(@NativeType("int") boolean release_caches) {
        nrpmalloc_thread_finalize(release_caches ? 1 : 0);
    }

    // --- [ rpmalloc_thread_collect ] ---

    /** Performs deferred deallocations pending for the calling thread heap. */
    public static native void rpmalloc_thread_collect();

    // --- [ rpmalloc_is_thread_initialized ] ---

    /** Unsafe version of: {@link #rpmalloc_is_thread_initialized malloc_is_thread_initialized} */
    public static native int nrpmalloc_is_thread_initialized();

    /** Query if allocator is initialized for calling thread. */
    @NativeType("int")
    public static boolean rpmalloc_is_thread_initialized() {
        return nrpmalloc_is_thread_initialized() != 0;
    }

    // --- [ rpmalloc_thread_statistics ] ---

    /** Unsafe version of: {@link #rpmalloc_thread_statistics malloc_thread_statistics} */
    public static native void nrpmalloc_thread_statistics(long stats);

    /** Gets per-thread statistics. */
    public static void rpmalloc_thread_statistics(@NativeType("rpmalloc_thread_statistics_t *") RPmallocThreadStatistics stats) {
        nrpmalloc_thread_statistics(stats.address());
    }

    // --- [ rpmalloc_global_statistics ] ---

    /** Unsafe version of: {@link #rpmalloc_global_statistics malloc_global_statistics} */
    public static native void nrpmalloc_global_statistics(long stats);

    /** Gets global statistics. */
    public static void rpmalloc_global_statistics(@NativeType("rpmalloc_global_statistics_t *") RPmallocGlobalStatistics stats) {
        nrpmalloc_global_statistics(stats.address());
    }

    // --- [ rpmalloc ] ---

    /** Unsafe version of: {@link #rpmalloc malloc} */
    public static native long nrpmalloc(long size);

    /** Allocates a memory block of at least the given size. */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpmalloc(@NativeType("size_t") long size) {
        long __result = nrpmalloc(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpfree ] ---

    /** Unsafe version of: {@link #rpfree free} */
    public static native void nrpfree(long ptr);

    /** Frees the given memory block. */
    public static void rpfree(@Nullable @NativeType("void *") ByteBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** Frees the given memory block. */
    public static void rpfree(@Nullable @NativeType("void *") ShortBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** Frees the given memory block. */
    public static void rpfree(@Nullable @NativeType("void *") IntBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** Frees the given memory block. */
    public static void rpfree(@Nullable @NativeType("void *") LongBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** Frees the given memory block. */
    public static void rpfree(@Nullable @NativeType("void *") FloatBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** Frees the given memory block. */
    public static void rpfree(@Nullable @NativeType("void *") DoubleBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** Frees the given memory block. */
    public static void rpfree(@Nullable @NativeType("void *") PointerBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    // --- [ rpcalloc ] ---

    /** Unsafe version of: {@link #rpcalloc calloc} */
    public static native long nrpcalloc(long num, long size);

    /** Allocates a memory block of at least the given size and zero initializes it. */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpcalloc(@NativeType("size_t") long num, @NativeType("size_t") long size) {
        long __result = nrpcalloc(num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ rprealloc ] ---

    /** Unsafe version of: {@link #rprealloc realloc} */
    public static native long nrprealloc(long ptr, long size);

    /** Reallocates the given block to at least the given size. */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rprealloc(@Nullable @NativeType("void *") ByteBuffer ptr, @NativeType("size_t") long size) {
        long __result = nrprealloc(memAddressSafe(ptr), size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpaligned_realloc ] ---

    /** Unsafe version of: {@link #rpaligned_realloc aligned_realloc} */
    public static native long nrpaligned_realloc(long ptr, long alignment, long size, long oldsize, int flags);

    /**
     * Reallocates the given block to at least the given size and alignment, with optional control flags (see {@link #RPMALLOC_NO_PRESERVE MALLOC_NO_PRESERVE}).
     * 
     * <p>Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
     * internals is that this must also be strictly less than the span size (default {@code 64KiB}).</p>
     *
     * @param flags {@link #RPMALLOC_NO_PRESERVE MALLOC_NO_PRESERVE} {@link #RPMALLOC_GROW_OR_FAIL MALLOC_GROW_OR_FAIL}
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpaligned_realloc(@Nullable @NativeType("void *") ByteBuffer ptr, @NativeType("size_t") long alignment, @NativeType("size_t") long size, @NativeType("unsigned int") int flags) {
        long __result = nrpaligned_realloc(memAddressSafe(ptr), alignment, size, remainingSafe(ptr), flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpaligned_alloc ] ---

    /** Unsafe version of: {@link #rpaligned_alloc aligned_alloc} */
    public static native long nrpaligned_alloc(long alignment, long size);

    /**
     * Allocates a memory block of at least the given size and alignment.
     * 
     * <p>Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
     * internals is that this must also be strictly less than the span size (default {@code 64KiB}).</p>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpaligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nrpaligned_alloc(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpaligned_calloc ] ---

    /** Unsafe version of: {@link #rpaligned_calloc aligned_calloc} */
    public static native long nrpaligned_calloc(long alignment, long num, long size);

    /**
     * Allocates a memory block of at least the given size and alignment, and zero initializes it.
     * 
     * <p>Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
     * internals is that this must also be strictly less than the span size (default {@code 64KiB}).</p>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpaligned_calloc(@NativeType("size_t") long alignment, @NativeType("size_t") long num, @NativeType("size_t") long size) {
        long __result = nrpaligned_calloc(alignment, num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ rpmemalign ] ---

    /** Unsafe version of: {@link #rpmemalign memalign} */
    public static native long nrpmemalign(long alignment, long size);

    /**
     * Allocates a memory block of at least the given size and alignment.
     * 
     * <p>Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
     * internals is that this must also be strictly less than the span size (default {@code 64KiB}).</p>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpmemalign(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nrpmemalign(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpposix_memalign ] ---

    /** Unsafe version of: {@link #rpposix_memalign posix_memalign} */
    public static native int nrpposix_memalign(long memptr, long alignment, long size);

    /**
     * Allocates a memory block of at least the given size and alignment.
     * 
     * <p>Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
     * internals is that this must also be strictly less than the span size (default {@code 64KiB}).</p>
     */
    public static int rpposix_memalign(@NativeType("void **") PointerBuffer memptr, @NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(memptr, 1);
        }
        return nrpposix_memalign(memAddress(memptr), alignment, size);
    }

    // --- [ rpmalloc_usable_size ] ---

    /** Unsafe version of: {@link #rpmalloc_usable_size malloc_usable_size} */
    public static native long nrpmalloc_usable_size(long ptr);

    /** Queries the usable size of the given memory block (from given pointer to the end of block). */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") ByteBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** Queries the usable size of the given memory block (from given pointer to the end of block). */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") ShortBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** Queries the usable size of the given memory block (from given pointer to the end of block). */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") IntBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** Queries the usable size of the given memory block (from given pointer to the end of block). */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") LongBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** Queries the usable size of the given memory block (from given pointer to the end of block). */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") FloatBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** Queries the usable size of the given memory block (from given pointer to the end of block). */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") DoubleBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** Queries the usable size of the given memory block (from given pointer to the end of block). */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") PointerBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    // --- [ rpmalloc_heap_acquire ] ---

    /**
     * Acquires a new heap.
     * 
     * <p>Will reuse existing released heaps or allocate memory for a new heap if none available. Heap API is implemented with the strict assumption that only
     * one single thread will call heap functions for a given heap at any given time, no functions are thread safe.</p>
     */
    @NativeType("rpmalloc_heap_t *")
    public static native long rpmalloc_heap_acquire();

    // --- [ rpmalloc_heap_release ] ---

    /**
     * Releases a heap (does NOT free the memory allocated by the heap, use {@link #rpmalloc_heap_free_all malloc_heap_free_all} before destroying the heap).
     * 
     * <p>Releasing a heap will enable it to be reused by other threads. Safe to pass a null pointer.</p>
     */
    public static native void rpmalloc_heap_release(@NativeType("rpmalloc_heap_t *") long heap);

    // --- [ rpmalloc_heap_alloc ] ---

    /** Unsafe version of: {@link #rpmalloc_heap_alloc malloc_heap_alloc} */
    public static native long nrpmalloc_heap_alloc(long heap, long size);

    /** Allocates a memory block of at least the given size using the given heap. */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpmalloc_heap_alloc(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_alloc(heap, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpmalloc_heap_aligned_alloc ] ---

    /** Unsafe version of: {@link #rpmalloc_heap_aligned_alloc malloc_heap_aligned_alloc} */
    public static native long nrpmalloc_heap_aligned_alloc(long heap, long alignment, long size);

    /**
     * Allocates a memory block of at least the given size using the given heap.
     * 
     * <p>The returned block will have the requested alignment. Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be
     * less than memory page size. A caveat of rpmalloc internals is that this must also be strictly less than the span size (default {@code 64KiB}).</p>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpmalloc_heap_aligned_alloc(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_aligned_alloc(heap, alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpmalloc_heap_calloc ] ---

    /** Unsafe version of: {@link #rpmalloc_heap_calloc malloc_heap_calloc} */
    public static native long nrpmalloc_heap_calloc(long heap, long num, long size);

    /** Allocates a memory block of at least the given size using the given heap and zero initializes it. */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpmalloc_heap_calloc(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("size_t") long num, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_calloc(heap, num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ rpmalloc_heap_aligned_calloc ] ---

    /** Unsafe version of: {@link #rpmalloc_heap_aligned_calloc malloc_heap_aligned_calloc} */
    public static native long nrpmalloc_heap_aligned_calloc(long heap, long alignment, long num, long size);

    /**
     * Allocates a memory block of at least the given size using the given heap and zero initializes it.
     * 
     * <p>The returned block will have the requested alignment. Alignment must either be zero, or a power of two and a multiple of {@code sizeof(void*)}, and
     * should ideally be less than memory page size. A caveat of rpmalloc internals is that this must also be strictly less than the span size (default
     * {@code 64KiB}).</p>
     *
     * @param num '
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpmalloc_heap_aligned_calloc(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("size_t") long alignment, @NativeType("size_t") long num, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_aligned_calloc(heap, alignment, num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ rpmalloc_heap_realloc ] ---

    /** Unsafe version of: {@link #rpmalloc_heap_realloc malloc_heap_realloc} */
    public static native long nrpmalloc_heap_realloc(long heap, long ptr, long size, int flags);

    /**
     * Reallocates the given block to at least the given size.
     * 
     * <p>The memory block MUST be allocated by the same heap given to this function.</p>
     *
     * @param flags {@link #RPMALLOC_NO_PRESERVE MALLOC_NO_PRESERVE} {@link #RPMALLOC_GROW_OR_FAIL MALLOC_GROW_OR_FAIL}
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpmalloc_heap_realloc(@NativeType("rpmalloc_heap_t *") long heap, @Nullable @NativeType("void *") ByteBuffer ptr, @NativeType("size_t") long size, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_realloc(heap, memAddressSafe(ptr), size, flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpmalloc_heap_aligned_realloc ] ---

    /** Unsafe version of: {@link #rpmalloc_heap_aligned_realloc malloc_heap_aligned_realloc} */
    public static native long nrpmalloc_heap_aligned_realloc(long heap, long ptr, long alignment, long size, int flags);

    /**
     * Reallocates the given block to at least the given size.
     * 
     * <p>The memory block MUST be allocated by the same heap given to this function. The returned block will have the requested alignment. Alignment must be
     * either zero, or a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
     * internals is that this must also be strictly less than the span size (default {@code 64KiB}).</p>
     *
     * @param flags {@link #RPMALLOC_NO_PRESERVE MALLOC_NO_PRESERVE} {@link #RPMALLOC_GROW_OR_FAIL MALLOC_GROW_OR_FAIL}
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpmalloc_heap_aligned_realloc(@NativeType("rpmalloc_heap_t *") long heap, @Nullable @NativeType("void *") ByteBuffer ptr, @NativeType("size_t") long alignment, @NativeType("size_t") long size, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_aligned_realloc(heap, memAddressSafe(ptr), alignment, size, flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpmalloc_heap_free ] ---

    /** Unsafe version of: {@link #rpmalloc_heap_free malloc_heap_free} */
    public static native void nrpmalloc_heap_free(long heap, long ptr);

    /**
     * Frees the given memory block from the given heap.
     * 
     * <p>The memory block MUST be allocated by the same heap given to this function.</p>
     */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @Nullable @NativeType("void *") ByteBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block from the given heap.
     * 
     * <p>The memory block MUST be allocated by the same heap given to this function.</p>
     */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @Nullable @NativeType("void *") ShortBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block from the given heap.
     * 
     * <p>The memory block MUST be allocated by the same heap given to this function.</p>
     */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @Nullable @NativeType("void *") IntBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block from the given heap.
     * 
     * <p>The memory block MUST be allocated by the same heap given to this function.</p>
     */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @Nullable @NativeType("void *") LongBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block from the given heap.
     * 
     * <p>The memory block MUST be allocated by the same heap given to this function.</p>
     */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @Nullable @NativeType("void *") FloatBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block from the given heap.
     * 
     * <p>The memory block MUST be allocated by the same heap given to this function.</p>
     */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @Nullable @NativeType("void *") DoubleBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block from the given heap.
     * 
     * <p>The memory block MUST be allocated by the same heap given to this function.</p>
     */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @Nullable @NativeType("void *") PointerBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    // --- [ rpmalloc_heap_free_all ] ---

    /** Unsafe version of: {@link #rpmalloc_heap_free_all malloc_heap_free_all} */
    public static native void nrpmalloc_heap_free_all(long heap);

    /** Frees all memory allocated by the heap. */
    public static void rpmalloc_heap_free_all(@NativeType("rpmalloc_heap_t *") long heap) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free_all(heap);
    }

    // --- [ rpmalloc_heap_thread_set_current ] ---

    /**
     * Sets the given heap as the current heap for the calling thread.
     * 
     * <p>A heap MUST only be current heap for a single thread, a heap can never be shared between multiple threads. The previous current heap for the calling
     * thread is released to be reused by other threads.</p>
     */
    public static native void rpmalloc_heap_thread_set_current(@NativeType("rpmalloc_heap_t *") long heap);

}