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
 * Native bindings to the <a target="_blank" href="https://github.com/rampantpixels/rpmalloc">rpmalloc</a> library. rpmalloc is a public domain cross platform lock free
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
 */
public class RPmalloc {

    /** Flag to {@link #rpaligned_realloc aligned_realloc} to not preserve content in reallocation. */
    public static final int RPMALLOC_NO_PRESERVE = 0x1;

    static { LibRPmalloc.initialize(); }

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

    /** Finalizes allocator for calling thread. */
    public static native void rpmalloc_thread_finalize();

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

    /**
     * Gets per-thread statistics.
     *
     * @param stats 
     */
    public static void rpmalloc_thread_statistics(@NativeType("rpmalloc_thread_statistics_t *") RPmallocThreadStatistics stats) {
        nrpmalloc_thread_statistics(stats.address());
    }

    // --- [ rpmalloc_global_statistics ] ---

    /** Unsafe version of: {@link #rpmalloc_global_statistics malloc_global_statistics} */
    public static native void nrpmalloc_global_statistics(long stats);

    /**
     * Gets global statistics.
     *
     * @param stats 
     */
    public static void rpmalloc_global_statistics(@NativeType("rpmalloc_global_statistics_t *") RPmallocGlobalStatistics stats) {
        nrpmalloc_global_statistics(stats.address());
    }

    // --- [ rpmalloc ] ---

    /** Unsafe version of: {@link #rpmalloc malloc} */
    public static native long nrpmalloc(long size);

    /**
     * Allocates a memory block of at least the given size.
     *
     * @param size 
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpmalloc(@NativeType("size_t") long size) {
        long __result = nrpmalloc(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpfree ] ---

    /** Unsafe version of: {@link #rpfree free} */
    public static native void nrpfree(long ptr);

    /**
     * Frees the given memory block.
     *
     * @param ptr 
     */
    public static void rpfree(@Nullable @NativeType("void *") ByteBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block.
     *
     * @param ptr 
     */
    public static void rpfree(@Nullable @NativeType("void *") ShortBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block.
     *
     * @param ptr 
     */
    public static void rpfree(@Nullable @NativeType("void *") IntBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block.
     *
     * @param ptr 
     */
    public static void rpfree(@Nullable @NativeType("void *") LongBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block.
     *
     * @param ptr 
     */
    public static void rpfree(@Nullable @NativeType("void *") FloatBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block.
     *
     * @param ptr 
     */
    public static void rpfree(@Nullable @NativeType("void *") DoubleBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    /**
     * Frees the given memory block.
     *
     * @param ptr 
     */
    public static void rpfree(@Nullable @NativeType("void *") PointerBuffer ptr) {
        nrpfree(memAddressSafe(ptr));
    }

    // --- [ rpcalloc ] ---

    /** Unsafe version of: {@link #rpcalloc calloc} */
    public static native long nrpcalloc(long num, long size);

    /**
     * Allocates a memory block of at least the given size and zero initializes it.
     *
     * @param num  
     * @param size 
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpcalloc(@NativeType("size_t") long num, @NativeType("size_t") long size) {
        long __result = nrpcalloc(num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ rprealloc ] ---

    /** Unsafe version of: {@link #rprealloc realloc} */
    public static native long nrprealloc(long ptr, long size);

    /**
     * Reallocates the given block to at least the given size.
     *
     * @param ptr  
     * @param size 
     */
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
     * Reallocates the given block to at least the given size and alignment, with optional control flags (see {@link #RPMALLOC_NO_PRESERVE MALLOC_NO_PRESERVE})
     *
     * @param ptr       
     * @param alignment 
     * @param size      
     * @param flags     
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
     * @param alignment 
     * @param size      
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer rpaligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nrpaligned_alloc(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ rpmemalign ] ---

    /** Unsafe version of: {@link #rpmemalign memalign} */
    public static native long nrpmemalign(long alignment, long size);

    /**
     * Allocates a memory block of at least the given size and alignment.
     *
     * @param alignment 
     * @param size      
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
     * @param memptr    
     * @param alignment 
     * @param size      
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

    /**
     * Queries the usable size of the given memory block (from given pointer to the end of block).
     *
     * @param ptr 
     */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") ByteBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /**
     * Queries the usable size of the given memory block (from given pointer to the end of block).
     *
     * @param ptr 
     */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") ShortBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /**
     * Queries the usable size of the given memory block (from given pointer to the end of block).
     *
     * @param ptr 
     */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") IntBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /**
     * Queries the usable size of the given memory block (from given pointer to the end of block).
     *
     * @param ptr 
     */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") LongBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /**
     * Queries the usable size of the given memory block (from given pointer to the end of block).
     *
     * @param ptr 
     */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") FloatBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /**
     * Queries the usable size of the given memory block (from given pointer to the end of block).
     *
     * @param ptr 
     */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") DoubleBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

    /**
     * Queries the usable size of the given memory block (from given pointer to the end of block).
     *
     * @param ptr 
     */
    @NativeType("size_t")
    public static long rpmalloc_usable_size(@NativeType("void *") PointerBuffer ptr) {
        return nrpmalloc_usable_size(memAddress(ptr));
    }

}