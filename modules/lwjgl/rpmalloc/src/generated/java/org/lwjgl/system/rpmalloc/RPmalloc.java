/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class RPmalloc {

    static { LibRPmalloc.initialize(); }

    public static final int
        RPMALLOC_NO_PRESERVE  = 1,
        RPMALLOC_GROW_OR_FAIL = 2;

    protected RPmalloc() {
        throw new UnsupportedOperationException();
    }

    // --- [ rpmalloc_address ] ---

    /** {@code void * rpmalloc_address(void)} */
    @NativeType("void *")
    static native long rpmalloc_address();

    // --- [ rpcalloc_address ] ---

    /** {@code void * rpcalloc_address(void)} */
    @NativeType("void *")
    static native long rpcalloc_address();

    // --- [ rprealloc_address ] ---

    /** {@code void * rprealloc_address(void)} */
    @NativeType("void *")
    static native long rprealloc_address();

    // --- [ rpfree_address ] ---

    /** {@code void * rpfree_address(void)} */
    @NativeType("void *")
    static native long rpfree_address();

    // --- [ rpaligned_alloc_address ] ---

    /** {@code void * rpaligned_alloc_address(void)} */
    @NativeType("void *")
    static native long rpaligned_alloc_address();

    // --- [ rpmalloc_initialize ] ---

    /** {@code int rpmalloc_initialize(void)} */
    public static native int nrpmalloc_initialize();

    /** {@code int rpmalloc_initialize(void)} */
    @NativeType("int")
    public static boolean rpmalloc_initialize() {
        return nrpmalloc_initialize() != 0;
    }

    // --- [ rpmalloc_initialize_config ] ---

    /** {@code int rpmalloc_initialize_config(rpmalloc_config_t const * config)} */
    public static native int nrpmalloc_initialize_config(long config);

    /** {@code int rpmalloc_initialize_config(rpmalloc_config_t const * config)} */
    @NativeType("int")
    public static boolean rpmalloc_initialize_config(@NativeType("rpmalloc_config_t const *") @Nullable RPMallocConfig config) {
        return nrpmalloc_initialize_config(memAddressSafe(config)) != 0;
    }

    // --- [ rpmalloc_config ] ---

    /** {@code rpmalloc_config_t const * rpmalloc_config(void)} */
    public static native long nrpmalloc_config();

    /** {@code rpmalloc_config_t const * rpmalloc_config(void)} */
    @NativeType("rpmalloc_config_t const *")
    public static RPMallocConfig rpmalloc_config() {
        long __result = nrpmalloc_config();
        return RPMallocConfig.create(__result);
    }

    // --- [ rpmalloc_finalize ] ---

    /** {@code void rpmalloc_finalize(void)} */
    public static native void rpmalloc_finalize();

    // --- [ rpmalloc_thread_initialize ] ---

    /** {@code void rpmalloc_thread_initialize(void)} */
    public static native void rpmalloc_thread_initialize();

    // --- [ rpmalloc_thread_finalize ] ---

    /** {@code void rpmalloc_thread_finalize(int release_caches)} */
    public static native void nrpmalloc_thread_finalize(int release_caches);

    /** {@code void rpmalloc_thread_finalize(int release_caches)} */
    public static void rpmalloc_thread_finalize(@NativeType("int") boolean release_caches) {
        nrpmalloc_thread_finalize(release_caches ? 1 : 0);
    }

    // --- [ rpmalloc_thread_collect ] ---

    /** {@code void rpmalloc_thread_collect(void)} */
    public static native void rpmalloc_thread_collect();

    // --- [ rpmalloc_is_thread_initialized ] ---

    /** {@code int rpmalloc_is_thread_initialized(void)} */
    public static native int nrpmalloc_is_thread_initialized();

    /** {@code int rpmalloc_is_thread_initialized(void)} */
    @NativeType("int")
    public static boolean rpmalloc_is_thread_initialized() {
        return nrpmalloc_is_thread_initialized() != 0;
    }

    // --- [ rpmalloc_thread_statistics ] ---

    /** {@code void rpmalloc_thread_statistics(rpmalloc_thread_statistics_t * stats)} */
    public static native void nrpmalloc_thread_statistics(long stats);

    /** {@code void rpmalloc_thread_statistics(rpmalloc_thread_statistics_t * stats)} */
    public static void rpmalloc_thread_statistics(@NativeType("rpmalloc_thread_statistics_t *") RPmallocThreadStatistics stats) {
        nrpmalloc_thread_statistics(stats.address());
    }

    // --- [ rpmalloc_global_statistics ] ---

    /** {@code void rpmalloc_global_statistics(rpmalloc_global_statistics_t * stats)} */
    public static native void nrpmalloc_global_statistics(long stats);

    /** {@code void rpmalloc_global_statistics(rpmalloc_global_statistics_t * stats)} */
    public static void rpmalloc_global_statistics(@NativeType("rpmalloc_global_statistics_t *") RPmallocGlobalStatistics stats) {
        nrpmalloc_global_statistics(stats.address());
    }

    // --- [ rpmalloc ] ---

    /** {@code void * rpmalloc(size_t size)} */
    public static native long nrpmalloc(long size);

    /** {@code void * rpmalloc(size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpmalloc(@NativeType("size_t") long size) {
        long __result = nrpmalloc(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpfree ] ---

    /** {@code void rpfree(void * ptr)} */
    public static native void nrpfree(long ptr);

    /** {@code void rpfree(void * ptr)} */
    public static void rpfree(@NativeType("void *") @Nullable ByteBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** {@code void rpfree(void * ptr)} */
    public static void rpfree(@NativeType("void *") @Nullable ShortBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** {@code void rpfree(void * ptr)} */
    public static void rpfree(@NativeType("void *") @Nullable IntBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** {@code void rpfree(void * ptr)} */
    public static void rpfree(@NativeType("void *") @Nullable LongBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** {@code void rpfree(void * ptr)} */
    public static void rpfree(@NativeType("void *") @Nullable FloatBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** {@code void rpfree(void * ptr)} */
    public static void rpfree(@NativeType("void *") @Nullable DoubleBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /** {@code void rpfree(void * ptr)} */
    public static void rpfree(@NativeType("void *") @Nullable PointerBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    // --- [ rpcalloc ] ---

    /** {@code void * rpcalloc(size_t num, size_t size)} */
    public static native long nrpcalloc(long num, long size);

    /** {@code void * rpcalloc(size_t num, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpcalloc(@NativeType("size_t") long num, @NativeType("size_t") long size) {
        long __result = nrpcalloc(num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ rprealloc ] ---

    /** {@code void * rprealloc(void * ptr, size_t size)} */
    public static native long nrprealloc(long ptr, long size);

    /** {@code void * rprealloc(void * ptr, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rprealloc(@NativeType("void *") @Nullable ByteBuffer ptr, @NativeType("size_t") long size) {
        long __result = nrprealloc(memAddressSafe(ptr), size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpaligned_realloc ] ---

    /** {@code void * rpaligned_realloc(void * ptr, size_t alignment, size_t size, size_t oldsize, unsigned int flags)} */
    public static native long nrpaligned_realloc(long ptr, long alignment, long size, long oldsize, int flags);

    /** {@code void * rpaligned_realloc(void * ptr, size_t alignment, size_t size, size_t oldsize, unsigned int flags)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpaligned_realloc(@NativeType("void *") @Nullable ByteBuffer ptr, @NativeType("size_t") long alignment, @NativeType("size_t") long size, @NativeType("unsigned int") int flags) {
        long __result = nrpaligned_realloc(memAddressSafe(ptr), alignment, size, remainingSafe(ptr), flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpaligned_alloc ] ---

    /** {@code void * rpaligned_alloc(size_t alignment, size_t size)} */
    public static native long nrpaligned_alloc(long alignment, long size);

    /** {@code void * rpaligned_alloc(size_t alignment, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpaligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nrpaligned_alloc(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpaligned_calloc ] ---

    /** {@code void * rpaligned_calloc(size_t alignment, size_t num, size_t size)} */
    public static native long nrpaligned_calloc(long alignment, long num, long size);

    /** {@code void * rpaligned_calloc(size_t alignment, size_t num, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpaligned_calloc(@NativeType("size_t") long alignment, @NativeType("size_t") long num, @NativeType("size_t") long size) {
        long __result = nrpaligned_calloc(alignment, num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ rpmemalign ] ---

    /** {@code void * rpmemalign(size_t alignment, size_t size)} */
    public static native long nrpmemalign(long alignment, long size);

    /** {@code void * rpmemalign(size_t alignment, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpmemalign(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nrpmemalign(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpposix_memalign ] ---

    /** {@code int rpposix_memalign(void ** memptr, size_t alignment, size_t size)} */
    public static native int nrpposix_memalign(long memptr, long alignment, long size);

    /** {@code int rpposix_memalign(void ** memptr, size_t alignment, size_t size)} */
    public static int rpposix_memalign(@NativeType("void **") PointerBuffer memptr, @NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(memptr, 1);
        }
        return nrpposix_memalign(memAddress(memptr), alignment, size);
    }

    // --- [ rpmalloc_usable_size ] ---

    /** {@code size_t rpmalloc_usable_size(void * ptr)} */
    public static native long nrpmalloc_usable_size(long ptr);

    /** {@code size_t rpmalloc_usable_size(void * ptr)} */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") ByteBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** {@code size_t rpmalloc_usable_size(void * ptr)} */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") ShortBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** {@code size_t rpmalloc_usable_size(void * ptr)} */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") IntBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** {@code size_t rpmalloc_usable_size(void * ptr)} */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") LongBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** {@code size_t rpmalloc_usable_size(void * ptr)} */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") FloatBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** {@code size_t rpmalloc_usable_size(void * ptr)} */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") DoubleBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /** {@code size_t rpmalloc_usable_size(void * ptr)} */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") PointerBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    // --- [ rpmalloc_heap_acquire ] ---

    /** {@code rpmalloc_heap_t * rpmalloc_heap_acquire(void)} */
    @NativeType("rpmalloc_heap_t *")
    public static native long rpmalloc_heap_acquire();

    // --- [ rpmalloc_heap_release ] ---

    /** {@code void rpmalloc_heap_release(rpmalloc_heap_t * heap)} */
    public static native void rpmalloc_heap_release(@NativeType("rpmalloc_heap_t *") long heap);

    // --- [ rpmalloc_heap_alloc ] ---

    /** {@code void * rpmalloc_heap_alloc(rpmalloc_heap_t * heap, size_t size)} */
    public static native long nrpmalloc_heap_alloc(long heap, long size);

    /** {@code void * rpmalloc_heap_alloc(rpmalloc_heap_t * heap, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpmalloc_heap_alloc(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_alloc(heap, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpmalloc_heap_aligned_alloc ] ---

    /** {@code void * rpmalloc_heap_aligned_alloc(rpmalloc_heap_t * heap, size_t alignment, size_t size)} */
    public static native long nrpmalloc_heap_aligned_alloc(long heap, long alignment, long size);

    /** {@code void * rpmalloc_heap_aligned_alloc(rpmalloc_heap_t * heap, size_t alignment, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpmalloc_heap_aligned_alloc(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_aligned_alloc(heap, alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpmalloc_heap_calloc ] ---

    /** {@code void * rpmalloc_heap_calloc(rpmalloc_heap_t * heap, size_t num, size_t size)} */
    public static native long nrpmalloc_heap_calloc(long heap, long num, long size);

    /** {@code void * rpmalloc_heap_calloc(rpmalloc_heap_t * heap, size_t num, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpmalloc_heap_calloc(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("size_t") long num, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_calloc(heap, num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ rpmalloc_heap_aligned_calloc ] ---

    /** {@code void * rpmalloc_heap_aligned_calloc(rpmalloc_heap_t * heap, size_t alignment, size_t num, size_t size)} */
    public static native long nrpmalloc_heap_aligned_calloc(long heap, long alignment, long num, long size);

    /** {@code void * rpmalloc_heap_aligned_calloc(rpmalloc_heap_t * heap, size_t alignment, size_t num, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpmalloc_heap_aligned_calloc(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("size_t") long alignment, @NativeType("size_t") long num, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_aligned_calloc(heap, alignment, num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ rpmalloc_heap_realloc ] ---

    /** {@code void * rpmalloc_heap_realloc(rpmalloc_heap_t * heap, void * ptr, size_t size, unsigned int flags)} */
    public static native long nrpmalloc_heap_realloc(long heap, long ptr, long size, int flags);

    /** {@code void * rpmalloc_heap_realloc(rpmalloc_heap_t * heap, void * ptr, size_t size, unsigned int flags)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpmalloc_heap_realloc(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer ptr, @NativeType("size_t") long size, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_realloc(heap, memAddressSafe(ptr), size, flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpmalloc_heap_aligned_realloc ] ---

    /** {@code void * rpmalloc_heap_aligned_realloc(rpmalloc_heap_t * heap, void * ptr, size_t alignment, size_t size, unsigned int flags)} */
    public static native long nrpmalloc_heap_aligned_realloc(long heap, long ptr, long alignment, long size, int flags);

    /** {@code void * rpmalloc_heap_aligned_realloc(rpmalloc_heap_t * heap, void * ptr, size_t alignment, size_t size, unsigned int flags)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer rpmalloc_heap_aligned_realloc(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer ptr, @NativeType("size_t") long alignment, @NativeType("size_t") long size, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(heap);
        }
        long __result = nrpmalloc_heap_aligned_realloc(heap, memAddressSafe(ptr), alignment, size, flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpmalloc_heap_free ] ---

    /** {@code void rpmalloc_heap_free(rpmalloc_heap_t * heap, void * ptr)} */
    public static native void nrpmalloc_heap_free(long heap, long ptr);

    /** {@code void rpmalloc_heap_free(rpmalloc_heap_t * heap, void * ptr)} */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /** {@code void rpmalloc_heap_free(rpmalloc_heap_t * heap, void * ptr)} */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("void *") @Nullable ShortBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /** {@code void rpmalloc_heap_free(rpmalloc_heap_t * heap, void * ptr)} */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("void *") @Nullable IntBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /** {@code void rpmalloc_heap_free(rpmalloc_heap_t * heap, void * ptr)} */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("void *") @Nullable LongBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /** {@code void rpmalloc_heap_free(rpmalloc_heap_t * heap, void * ptr)} */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("void *") @Nullable FloatBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /** {@code void rpmalloc_heap_free(rpmalloc_heap_t * heap, void * ptr)} */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("void *") @Nullable DoubleBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    /** {@code void rpmalloc_heap_free(rpmalloc_heap_t * heap, void * ptr)} */
    public static void rpmalloc_heap_free(@NativeType("rpmalloc_heap_t *") long heap, @NativeType("void *") @Nullable PointerBuffer ptr) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free(heap, memAddressSafe(ptr));
    }

    // --- [ rpmalloc_heap_free_all ] ---

    /** {@code void rpmalloc_heap_free_all(rpmalloc_heap_t * heap)} */
    public static native void nrpmalloc_heap_free_all(long heap);

    /** {@code void rpmalloc_heap_free_all(rpmalloc_heap_t * heap)} */
    public static void rpmalloc_heap_free_all(@NativeType("rpmalloc_heap_t *") long heap) {
        if (CHECKS) {
            check(heap);
        }
        nrpmalloc_heap_free_all(heap);
    }

    // --- [ rpmalloc_heap_thread_set_current ] ---

    /** {@code void rpmalloc_heap_thread_set_current(rpmalloc_heap_t * heap)} */
    public static native void rpmalloc_heap_thread_set_current(@NativeType("rpmalloc_heap_t *") long heap);

    // --- [ rpmalloc_get_heap_for_ptr ] ---

    /** {@code rpmalloc_heap_t * rpmalloc_get_heap_for_ptr(void * ptr)} */
    public static native long nrpmalloc_get_heap_for_ptr(long ptr);

    /** {@code rpmalloc_heap_t * rpmalloc_get_heap_for_ptr(void * ptr)} */
    @NativeType("rpmalloc_heap_t *")
    public static long rpmalloc_get_heap_for_ptr(@NativeType("void *") @Nullable ByteBuffer ptr) {
        return nrpmalloc_get_heap_for_ptr(memAddressSafe(ptr));
    }

    /** {@code rpmalloc_heap_t * rpmalloc_get_heap_for_ptr(void * ptr)} */
    @NativeType("rpmalloc_heap_t *")
    public static long rpmalloc_get_heap_for_ptr(@NativeType("void *") @Nullable ShortBuffer ptr) {
        return nrpmalloc_get_heap_for_ptr(memAddressSafe(ptr));
    }

    /** {@code rpmalloc_heap_t * rpmalloc_get_heap_for_ptr(void * ptr)} */
    @NativeType("rpmalloc_heap_t *")
    public static long rpmalloc_get_heap_for_ptr(@NativeType("void *") @Nullable IntBuffer ptr) {
        return nrpmalloc_get_heap_for_ptr(memAddressSafe(ptr));
    }

    /** {@code rpmalloc_heap_t * rpmalloc_get_heap_for_ptr(void * ptr)} */
    @NativeType("rpmalloc_heap_t *")
    public static long rpmalloc_get_heap_for_ptr(@NativeType("void *") @Nullable LongBuffer ptr) {
        return nrpmalloc_get_heap_for_ptr(memAddressSafe(ptr));
    }

    /** {@code rpmalloc_heap_t * rpmalloc_get_heap_for_ptr(void * ptr)} */
    @NativeType("rpmalloc_heap_t *")
    public static long rpmalloc_get_heap_for_ptr(@NativeType("void *") @Nullable FloatBuffer ptr) {
        return nrpmalloc_get_heap_for_ptr(memAddressSafe(ptr));
    }

    /** {@code rpmalloc_heap_t * rpmalloc_get_heap_for_ptr(void * ptr)} */
    @NativeType("rpmalloc_heap_t *")
    public static long rpmalloc_get_heap_for_ptr(@NativeType("void *") @Nullable DoubleBuffer ptr) {
        return nrpmalloc_get_heap_for_ptr(memAddressSafe(ptr));
    }

    /** {@code rpmalloc_heap_t * rpmalloc_get_heap_for_ptr(void * ptr)} */
    @NativeType("rpmalloc_heap_t *")
    public static long rpmalloc_get_heap_for_ptr(@NativeType("void *") @Nullable PointerBuffer ptr) {
        return nrpmalloc_get_heap_for_ptr(memAddressSafe(ptr));
    }

}