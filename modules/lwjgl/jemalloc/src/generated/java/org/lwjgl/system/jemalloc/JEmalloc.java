/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a href="https://jemalloc.net/">jemalloc</a>.
 * 
 * <p>jemalloc is a general purpose malloc implementation that emphasizes fragmentation avoidance and scalable concurrency support. jemalloc first came into
 * use as the FreeBSD libc allocator in 2005, and since then it has found its way into numerous applications that rely on its predictable behavior. In
 * 2010 jemalloc development efforts broadened to include developer support features such as heap profiling, Valgrind integration, and extensive
 * monitoring/tuning hooks. Modern jemalloc releases continue to be integrated back into FreeBSD, and therefore versatility remains critical. Ongoing
 * development efforts trend toward making jemalloc among the best allocators for a broad range of demanding applications, and eliminating/mitigating
 * weaknesses that have practical repercussions for real world applications.</p>
 */
public class JEmalloc {

    private static final SharedLibrary JEMALLOC = Library.loadNative(JEmalloc.class, "org.lwjgl.jemalloc", Configuration.JEMALLOC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("jemalloc")), true);

    /** Contains the function pointers loaded from the jemalloc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            malloc_message     = apiGetFunctionAddress(JEMALLOC, "je_malloc_message"),
            malloc             = apiGetFunctionAddress(JEMALLOC, "je_malloc"),
            calloc             = apiGetFunctionAddress(JEMALLOC, "je_calloc"),
            posix_memalign     = apiGetFunctionAddress(JEMALLOC, "je_posix_memalign"),
            aligned_alloc      = apiGetFunctionAddress(JEMALLOC, "je_aligned_alloc"),
            realloc            = apiGetFunctionAddress(JEMALLOC, "je_realloc"),
            free               = apiGetFunctionAddress(JEMALLOC, "je_free"),
            free_sized         = apiGetFunctionAddress(JEMALLOC, "je_free_sized"),
            free_aligned_sized = apiGetFunctionAddress(JEMALLOC, "je_free_aligned_sized"),
            mallocx            = apiGetFunctionAddress(JEMALLOC, "je_mallocx"),
            rallocx            = apiGetFunctionAddress(JEMALLOC, "je_rallocx"),
            xallocx            = apiGetFunctionAddress(JEMALLOC, "je_xallocx"),
            sallocx            = apiGetFunctionAddress(JEMALLOC, "je_sallocx"),
            dallocx            = apiGetFunctionAddress(JEMALLOC, "je_dallocx"),
            sdallocx           = apiGetFunctionAddress(JEMALLOC, "je_sdallocx"),
            nallocx            = apiGetFunctionAddress(JEMALLOC, "je_nallocx"),
            mallctl            = apiGetFunctionAddress(JEMALLOC, "je_mallctl"),
            mallctlnametomib   = apiGetFunctionAddress(JEMALLOC, "je_mallctlnametomib"),
            mallctlbymib       = apiGetFunctionAddress(JEMALLOC, "je_mallctlbymib"),
            malloc_stats_print = apiGetFunctionAddress(JEMALLOC, "je_malloc_stats_print"),
            malloc_usable_size = apiGetFunctionAddress(JEMALLOC, "je_malloc_usable_size");

    }

    /** Returns the jemalloc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return JEMALLOC;
    }

    /** The major version. */
    public static final int JEMALLOC_VERSION_MAJOR = 5;

    /** The minor version. */
    public static final int JEMALLOC_VERSION_MINOR = 2;

    /** The bugfix version. */
    public static final int JEMALLOC_VERSION_BUGFIX = 1;

    /** The revision number. */
    public static final int JEMALLOC_VERSION_NREV = 0;

    /** The globally unique identifier (git commit hash). */
    public static final String JEMALLOC_VERSION_GID = "ea6b3e973b477b8061e0076bb257dbd7f3faa756";

    /** The version string. */
    public static final String JEMALLOC_VERSION = JEMALLOC_VERSION_MAJOR + "." + JEMALLOC_VERSION_MINOR + "." + JEMALLOC_VERSION_BUGFIX + "-" + JEMALLOC_VERSION_NREV + "-g" + JEMALLOC_VERSION_GID;

    /**
     * Initialize newly allocated memory to contain zero bytes. In the growing reallocation case, the real size prior to reallocation defines the boundary
     * between untouched bytes and those that are initialized to contain zero bytes. If this macro is absent, newly allocated memory is uninitialized.
     */
    public static final int MALLOCX_ZERO = 0x40;

    /**
     * Do not use a thread-specific cache (tcache). Unless {@link #MALLOCX_TCACHE} or {@code MALLOCX_TCACHE_NONE} is specified, an automatically managed
     * tcache will be used under many circumstances. This macro cannot be used in the same {@code flags} argument as {@code MALLOCX_TCACHE(tc)}.
     */
    public static final int MALLOCX_TCACHE_NONE = MALLOCX_TCACHE(-1);

    /** Use as arena index in "arena.&lt;i&gt;.{purge,decay,dss}" and "stats.arenas.&lt;i&gt;.*" mallctl interfaces to select all arenas. */
    public static final int MALLCTL_ARENAS_ALL = 0x1000;

    /** Use as arena index in "stats.arenas.&lt;i&gt;.*" mallctl interfaces to select destroyed arenas. */
    public static final int MALLCTL_ARENAS_DESTROYED = 0x1001;

    static {
        // Force jemalloc to initialize before anyone else uses it.
        // This avoids a dangerous race when the first jemalloc functions are called concurrently.
        if (Platform.get() == Platform.WINDOWS) {
            invokePV(invokePP(8L, apiGetFunctionAddress(JEMALLOC, "je_malloc")), apiGetFunctionAddress(JEMALLOC, "je_free"));
        }
    }

    protected JEmalloc() {
        throw new UnsupportedOperationException();
    }

    // --- [ je_malloc_message ] ---

    /** Returns the {@code je_malloc_message} variable. */
    @NativeType("void (*) (void *, char const *) *")
    public static PointerBuffer je_malloc_message() {
        long __result = Functions.malloc_message;
        return memPointerBuffer(__result, 1);
    }

    // --- [ je_malloc ] ---

    /** Unsafe version of: {@link #je_malloc malloc} */
    public static long nje_malloc(long size) {
        long __functionAddress = Functions.malloc;
        return invokePP(size, __functionAddress);
    }

    /**
     * Allocates {@code size} bytes of uninitialized memory. The allocated space is suitably aligned (after possible pointer coercion) for storage of any type
     * of object.
     *
     * @param size the number of bytes to allocate
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer je_malloc(@NativeType("size_t") long size) {
        long __result = nje_malloc(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_calloc ] ---

    /** Unsafe version of: {@link #je_calloc calloc} */
    public static long nje_calloc(long num, long size) {
        long __functionAddress = Functions.calloc;
        return invokePPP(num, size, __functionAddress);
    }

    /**
     * Allocates space for {@code num} objects, each {@code size} bytes in length. The result is identical to calling {@link #je_malloc malloc} with an argument of
     * {@code num * size}, with the exception that the allocated memory is explicitly initialized to zero bytes.
     *
     * @param num  the number of objects to allocate
     * @param size the size of each object, in bytes
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer je_calloc(@NativeType("size_t") long num, @NativeType("size_t") long size) {
        long __result = nje_calloc(num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ je_posix_memalign ] ---

    /** Unsafe version of: {@link #je_posix_memalign posix_memalign} */
    public static int nje_posix_memalign(long memptr, long alignment, long size) {
        long __functionAddress = Functions.posix_memalign;
        return invokePPPI(memptr, alignment, size, __functionAddress);
    }

    /**
     * Allocates {@code size} bytes of memory such that the allocation's base address is an even multiple of {@code alignment}, and returns the allocation in
     * the value pointed to by {@code memptr}. The requested alignment must be a power of 2 at least as large as {@code sizeof(void *)}.
     *
     * @param memptr    returns the allocated memory
     * @param alignment the allocation alignment, in bytes
     * @param size      the number of bytes to allocate
     */
    public static int je_posix_memalign(@NativeType("void **") PointerBuffer memptr, @NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(memptr, 1);
        }
        return nje_posix_memalign(memAddress(memptr), alignment, size);
    }

    // --- [ je_aligned_alloc ] ---

    /** Unsafe version of: {@link #je_aligned_alloc aligned_alloc} */
    public static long nje_aligned_alloc(long alignment, long size) {
        long __functionAddress = Functions.aligned_alloc;
        return invokePPP(alignment, size, __functionAddress);
    }

    /**
     * Allocates {@code size} bytes of memory such that the allocation's base address is an even multiple of {@code alignment}. The requested alignment must
     * be a power of 2. Behavior is undefined if {@code size} is not an integral multiple of {@code alignment}.
     *
     * @param alignment the allocation alignment, in bytes
     * @param size      the number of bytes to allocate
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer je_aligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nje_aligned_alloc(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_realloc ] ---

    /** Unsafe version of: {@link #je_realloc realloc} */
    public static long nje_realloc(long ptr, long size) {
        long __functionAddress = Functions.realloc;
        return invokePPP(ptr, size, __functionAddress);
    }

    /**
     * Changes the size of the previously allocated memory referenced by {@code ptr} to {@code size} bytes. The contents of the memory are unchanged up to the
     * lesser of the new and old sizes. If the new size is larger, the contents of the newly allocated portion of the memory are undefined. Upon success, the
     * memory referenced by {@code ptr} is freed and a pointer to the newly allocated memory is returned. Note that realloc() may move the memory allocation,
     * resulting in a different return value than {@code ptr}. If {@code ptr} is {@code NULL}, the realloc() function behaves identically to malloc() for the
     * specified size.
     *
     * @param ptr  the previously allocated memory or {@code NULL}
     * @param size the number of bytes to allocate
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer je_realloc(@Nullable @NativeType("void *") ByteBuffer ptr, @NativeType("size_t") long size) {
        long __result = nje_realloc(memAddressSafe(ptr), size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_free ] ---

    /** Unsafe version of: {@link #je_free free} */
    public static void nje_free(long ptr) {
        long __functionAddress = Functions.free;
        invokePV(ptr, __functionAddress);
    }

    /**
     * Causes the allocated memory referenced by {@code ptr} to be made available for future allocations. If {@code ptr} is {@code NULL}, no action occurs.
     *
     * @param ptr the allocated memory to free
     */
    public static void je_free(@Nullable @NativeType("void *") ByteBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /**
     * Causes the allocated memory referenced by {@code ptr} to be made available for future allocations. If {@code ptr} is {@code NULL}, no action occurs.
     *
     * @param ptr the allocated memory to free
     */
    public static void je_free(@Nullable @NativeType("void *") ShortBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /**
     * Causes the allocated memory referenced by {@code ptr} to be made available for future allocations. If {@code ptr} is {@code NULL}, no action occurs.
     *
     * @param ptr the allocated memory to free
     */
    public static void je_free(@Nullable @NativeType("void *") IntBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /**
     * Causes the allocated memory referenced by {@code ptr} to be made available for future allocations. If {@code ptr} is {@code NULL}, no action occurs.
     *
     * @param ptr the allocated memory to free
     */
    public static void je_free(@Nullable @NativeType("void *") LongBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /**
     * Causes the allocated memory referenced by {@code ptr} to be made available for future allocations. If {@code ptr} is {@code NULL}, no action occurs.
     *
     * @param ptr the allocated memory to free
     */
    public static void je_free(@Nullable @NativeType("void *") FloatBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /**
     * Causes the allocated memory referenced by {@code ptr} to be made available for future allocations. If {@code ptr} is {@code NULL}, no action occurs.
     *
     * @param ptr the allocated memory to free
     */
    public static void je_free(@Nullable @NativeType("void *") DoubleBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /**
     * Causes the allocated memory referenced by {@code ptr} to be made available for future allocations. If {@code ptr} is {@code NULL}, no action occurs.
     *
     * @param ptr the allocated memory to free
     */
    public static void je_free(@Nullable @NativeType("void *") PointerBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    // --- [ je_free_sized ] ---

    /** Unsafe version of: {@link #je_free_sized free_sized} */
    public static void nje_free_sized(long ptr, long size) {
        long __functionAddress = Functions.free_sized;
        invokePPV(ptr, size, __functionAddress);
    }

    /**
     * The {@code free_sized()} function is an extension of {@link #je_free free} with a {@code size} parameter to allow the caller to pass in the allocation size as an
     * optimization.
     */
    public static void je_free_sized(@Nullable @NativeType("void *") ByteBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), remainingSafe(ptr));
    }

    /**
     * The {@code free_sized()} function is an extension of {@link #je_free free} with a {@code size} parameter to allow the caller to pass in the allocation size as an
     * optimization.
     */
    public static void je_free_sized(@Nullable @NativeType("void *") ShortBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << 1);
    }

    /**
     * The {@code free_sized()} function is an extension of {@link #je_free free} with a {@code size} parameter to allow the caller to pass in the allocation size as an
     * optimization.
     */
    public static void je_free_sized(@Nullable @NativeType("void *") IntBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << 2);
    }

    /**
     * The {@code free_sized()} function is an extension of {@link #je_free free} with a {@code size} parameter to allow the caller to pass in the allocation size as an
     * optimization.
     */
    public static void je_free_sized(@Nullable @NativeType("void *") LongBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << 3);
    }

    /**
     * The {@code free_sized()} function is an extension of {@link #je_free free} with a {@code size} parameter to allow the caller to pass in the allocation size as an
     * optimization.
     */
    public static void je_free_sized(@Nullable @NativeType("void *") FloatBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << 2);
    }

    /**
     * The {@code free_sized()} function is an extension of {@link #je_free free} with a {@code size} parameter to allow the caller to pass in the allocation size as an
     * optimization.
     */
    public static void je_free_sized(@Nullable @NativeType("void *") DoubleBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << 3);
    }

    /**
     * The {@code free_sized()} function is an extension of {@link #je_free free} with a {@code size} parameter to allow the caller to pass in the allocation size as an
     * optimization.
     */
    public static void je_free_sized(@Nullable @NativeType("void *") PointerBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << POINTER_SHIFT);
    }

    // --- [ je_free_aligned_sized ] ---

    /** Unsafe version of: {@link #je_free_aligned_sized free_aligned_sized} */
    public static void nje_free_aligned_sized(long ptr, long alignment, long size) {
        long __functionAddress = Functions.free_aligned_sized;
        invokePPPV(ptr, alignment, size, __functionAddress);
    }

    /**
     * The {@code free_aligned_sized()} function accepts a {@code ptr} which was allocated with a requested {@code size} and {@code alignment}, causing the
     * allocated memory referenced by {@code ptr} to be made available for future allocations.
     */
    public static void je_free_aligned_sized(@Nullable @NativeType("void *") ByteBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, remainingSafe(ptr));
    }

    /**
     * The {@code free_aligned_sized()} function accepts a {@code ptr} which was allocated with a requested {@code size} and {@code alignment}, causing the
     * allocated memory referenced by {@code ptr} to be made available for future allocations.
     */
    public static void je_free_aligned_sized(@Nullable @NativeType("void *") ShortBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << 1);
    }

    /**
     * The {@code free_aligned_sized()} function accepts a {@code ptr} which was allocated with a requested {@code size} and {@code alignment}, causing the
     * allocated memory referenced by {@code ptr} to be made available for future allocations.
     */
    public static void je_free_aligned_sized(@Nullable @NativeType("void *") IntBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << 2);
    }

    /**
     * The {@code free_aligned_sized()} function accepts a {@code ptr} which was allocated with a requested {@code size} and {@code alignment}, causing the
     * allocated memory referenced by {@code ptr} to be made available for future allocations.
     */
    public static void je_free_aligned_sized(@Nullable @NativeType("void *") LongBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << 3);
    }

    /**
     * The {@code free_aligned_sized()} function accepts a {@code ptr} which was allocated with a requested {@code size} and {@code alignment}, causing the
     * allocated memory referenced by {@code ptr} to be made available for future allocations.
     */
    public static void je_free_aligned_sized(@Nullable @NativeType("void *") FloatBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << 2);
    }

    /**
     * The {@code free_aligned_sized()} function accepts a {@code ptr} which was allocated with a requested {@code size} and {@code alignment}, causing the
     * allocated memory referenced by {@code ptr} to be made available for future allocations.
     */
    public static void je_free_aligned_sized(@Nullable @NativeType("void *") DoubleBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << 3);
    }

    /**
     * The {@code free_aligned_sized()} function accepts a {@code ptr} which was allocated with a requested {@code size} and {@code alignment}, causing the
     * allocated memory referenced by {@code ptr} to be made available for future allocations.
     */
    public static void je_free_aligned_sized(@Nullable @NativeType("void *") PointerBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << POINTER_SHIFT);
    }

    // --- [ je_mallocx ] ---

    /** Unsafe version of: {@link #je_mallocx mallocx} */
    public static long nje_mallocx(long size, int flags) {
        long __functionAddress = Functions.mallocx;
        return invokePP(size, flags, __functionAddress);
    }

    /**
     * Allocates at least {@code size} bytes of memory, and returns a pointer to the base address of the allocation. Behavior is undefined if {@code size} is
     * 0, or if request size overflows due to size class and/or alignment constraints.
     *
     * @param size  the number of bytes to allocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer je_mallocx(@NativeType("size_t") long size, int flags) {
        long __result = nje_mallocx(size, flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_rallocx ] ---

    /** Unsafe version of: {@link #je_rallocx rallocx} */
    public static long nje_rallocx(long ptr, long size, int flags) {
        long __functionAddress = Functions.rallocx;
        return invokePPP(ptr, size, flags, __functionAddress);
    }

    /**
     * Resizes the allocation at {@code ptr} to be at least {@code size} bytes, and returns a pointer to the base address of the resulting allocation, which
     * may or may not have moved from its original location. Behavior is undefined if {@code size} is 0, or if request size overflows due to size class and/or
     * alignment constraints.
     *
     * @param ptr   the previously allocated memory or {@code NULL}
     * @param size  the number of bytes to allocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer je_rallocx(@Nullable @NativeType("void *") ByteBuffer ptr, @NativeType("size_t") long size, int flags) {
        long __result = nje_rallocx(memAddressSafe(ptr), size, flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_xallocx ] ---

    /** Unsafe version of: {@link #je_xallocx xallocx} */
    public static long nje_xallocx(long ptr, long size, long extra, int flags) {
        long __functionAddress = Functions.xallocx;
        return invokePPPP(ptr, size, extra, flags, __functionAddress);
    }

    /**
     * Resizes the allocation at {@code ptr} in place to be at least size bytes, and returns the real size of the allocation. If {@code extra} is non-zero, an
     * attempt is made to resize the allocation to be at least {@code (size + extra)} bytes, though inability to allocate the extra byte(s) will not by itself
     * result in failure to resize. Behavior is undefined if {@code size} is 0, or if {@code (size + extra > SIZE_T_MAX)}.
     *
     * @param ptr   the previously allocated memory or {@code NULL}
     * @param size  the number of bytes to allocate
     * @param extra the number of extra bytes to allocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    @NativeType("size_t")
    public static long je_xallocx(@Nullable @NativeType("void *") ByteBuffer ptr, @NativeType("size_t") long size, @NativeType("size_t") long extra, int flags) {
        return nje_xallocx(memAddressSafe(ptr), size, extra, flags);
    }

    // --- [ je_sallocx ] ---

    /** Unsafe version of: {@link #je_sallocx sallocx} */
    public static long nje_sallocx(long ptr, int flags) {
        long __functionAddress = Functions.sallocx;
        return invokePP(ptr, flags, __functionAddress);
    }

    /**
     * Returns the real size of the allocation at {@code ptr}.
     *
     * @param ptr   the allocated memory to query
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    @NativeType("size_t")
    public static long je_sallocx(@NativeType("void const *") ByteBuffer ptr, int flags) {
        return nje_sallocx(memAddress(ptr), flags);
    }

    // --- [ je_dallocx ] ---

    /** Unsafe version of: {@link #je_dallocx dallocx} */
    public static void nje_dallocx(long ptr, int flags) {
        long __functionAddress = Functions.dallocx;
        invokePV(ptr, flags, __functionAddress);
    }

    /**
     * Causes the memory referenced by {@code ptr} to be made available for future allocations.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_dallocx(@NativeType("void *") ByteBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /**
     * Causes the memory referenced by {@code ptr} to be made available for future allocations.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_dallocx(@NativeType("void *") ShortBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /**
     * Causes the memory referenced by {@code ptr} to be made available for future allocations.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_dallocx(@NativeType("void *") IntBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /**
     * Causes the memory referenced by {@code ptr} to be made available for future allocations.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_dallocx(@NativeType("void *") LongBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /**
     * Causes the memory referenced by {@code ptr} to be made available for future allocations.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_dallocx(@NativeType("void *") FloatBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /**
     * Causes the memory referenced by {@code ptr} to be made available for future allocations.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_dallocx(@NativeType("void *") DoubleBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /**
     * Causes the memory referenced by {@code ptr} to be made available for future allocations.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_dallocx(@NativeType("void *") PointerBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    // --- [ je_sdallocx ] ---

    /**
     * Unsafe version of: {@link #je_sdallocx sdallocx}
     *
     * @param size the number of bytes in {@code ptr}
     */
    public static void nje_sdallocx(long ptr, long size, int flags) {
        long __functionAddress = Functions.sdallocx;
        invokePPV(ptr, size, flags, __functionAddress);
    }

    /**
     * Sized version of {@link #je_dallocx dallocx}. The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_sdallocx(@NativeType("void *") ByteBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), ptr.remaining(), flags);
    }

    /**
     * Sized version of {@link #je_dallocx dallocx}. The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_sdallocx(@NativeType("void *") ShortBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << 1, flags);
    }

    /**
     * Sized version of {@link #je_dallocx dallocx}. The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_sdallocx(@NativeType("void *") IntBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << 2, flags);
    }

    /**
     * Sized version of {@link #je_dallocx dallocx}. The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_sdallocx(@NativeType("void *") LongBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << 3, flags);
    }

    /**
     * Sized version of {@link #je_dallocx dallocx}. The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_sdallocx(@NativeType("void *") FloatBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << 2, flags);
    }

    /**
     * Sized version of {@link #je_dallocx dallocx}. The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_sdallocx(@NativeType("void *") DoubleBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << 3, flags);
    }

    /**
     * Sized version of {@link #je_dallocx dallocx}. The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.
     *
     * @param ptr   the allocated memory to deallocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    public static void je_sdallocx(@NativeType("void *") PointerBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << POINTER_SHIFT, flags);
    }

    // --- [ je_nallocx ] ---

    /** Unsafe version of: {@link #je_nallocx nallocx} */
    public static long nje_nallocx(long size, int flags) {
        long __functionAddress = Functions.nallocx;
        return invokePP(size, flags, __functionAddress);
    }

    /**
     * Allocates no memory, but it performs the same size computation as the {@link #je_mallocx mallocx} function, and returns the real size of the allocation that would
     * result from the equivalent {@code mallocx()} function call. Behavior is undefined if {@code size} is 0, or if request size overflows due to size class
     * and/or alignment constraints.
     *
     * @param size  the number of bytes to allocate
     * @param flags a bitfield of zero or more of the {@code MALLOCX} macros
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer je_nallocx(@NativeType("size_t") long size, int flags) {
        long __result = nje_nallocx(size, flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_mallctl ] ---

    /**
     * Unsafe version of: {@link #je_mallctl mallctl}
     *
     * @param newlen the new value length
     */
    public static int nje_mallctl(long name, long oldp, long oldlenp, long newp, long newlen) {
        long __functionAddress = Functions.mallctl;
        return invokePPPPPI(name, oldp, oldlenp, newp, newlen, __functionAddress);
    }

    /**
     * Provides a general interface for introspecting the memory allocator, as well as setting modifiable parameters and triggering actions. The
     * period-separated {@code name} argument specifies a location in a tree-structured namespace; see the
     * <a href="https://jemalloc.net/jemalloc.3.html#mallctl_namespace">MALLCTL NAMESPACE</a> section for
     * documentation on the tree contents. To read a value, pass a pointer via {@code oldp} to adequate space to contain the value, and a pointer to its
     * length via {@code oldlenp}; otherwise pass {@code NULL} and {@code NULL}. Similarly, to write a value, pass a pointer to the value via {@code newp}, and its length
     * via {@code newlen}; otherwise pass {@code NULL} and {@code 0}.
     *
     * @param name    the namespace location
     * @param oldp    returns a value
     * @param oldlenp returns the value length
     * @param newp    the new value
     */
    public static int je_mallctl(@NativeType("char const *") ByteBuffer name, @Nullable @NativeType("void *") ByteBuffer oldp, @Nullable @NativeType("size_t *") PointerBuffer oldlenp, @Nullable @NativeType("void *") ByteBuffer newp) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(oldlenp, 1);
        }
        return nje_mallctl(memAddress(name), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), remainingSafe(newp));
    }

    /**
     * Provides a general interface for introspecting the memory allocator, as well as setting modifiable parameters and triggering actions. The
     * period-separated {@code name} argument specifies a location in a tree-structured namespace; see the
     * <a href="https://jemalloc.net/jemalloc.3.html#mallctl_namespace">MALLCTL NAMESPACE</a> section for
     * documentation on the tree contents. To read a value, pass a pointer via {@code oldp} to adequate space to contain the value, and a pointer to its
     * length via {@code oldlenp}; otherwise pass {@code NULL} and {@code NULL}. Similarly, to write a value, pass a pointer to the value via {@code newp}, and its length
     * via {@code newlen}; otherwise pass {@code NULL} and {@code 0}.
     *
     * @param name    the namespace location
     * @param oldp    returns a value
     * @param oldlenp returns the value length
     * @param newp    the new value
     */
    public static int je_mallctl(@NativeType("char const *") CharSequence name, @Nullable @NativeType("void *") ByteBuffer oldp, @Nullable @NativeType("size_t *") PointerBuffer oldlenp, @Nullable @NativeType("void *") ByteBuffer newp) {
        if (CHECKS) {
            checkSafe(oldlenp, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nje_mallctl(nameEncoded, memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), remainingSafe(newp));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ je_mallctlnametomib ] ---

    /**
     * Unsafe version of: {@link #je_mallctlnametomib mallctlnametomib}
     *
     * @param miblenp the number of components in {@code mibp}
     */
    public static int nje_mallctlnametomib(long name, long mibp, long miblenp) {
        long __functionAddress = Functions.mallctlnametomib;
        return invokePPPI(name, mibp, miblenp, __functionAddress);
    }

    /**
     * Provides a way to avoid repeated name lookups for applications that repeatedly query the same portion of the namespace, by translating a name to a
     * “Management Information Base” (MIB) that can be passed repeatedly to {@link #je_mallctlbymib mallctlbymib}. Upon successful return from {@code mallctlnametomib()},
     * {@code mibp} contains an array of {@code *miblenp} integers, where {@code *miblenp} is the lesser of the number of components in name and the input
     * value of {@code *miblenp}. Thus it is possible to pass a {@code *miblenp} that is smaller than the number of period-separated name components, which
     * results in a partial MIB that can be used as the basis for constructing a complete MIB. For name components that are integers (e.g. the 2 in
     * "arenas.bin.2.size"), the corresponding MIB component will always be that integer. Therefore, it is legitimate to construct code like the following:
     * 
     * <pre><code>
     * unsigned nbins, i;
     * size_t mib[4];
     * size_t len, miblen;
     * 
     * len = sizeof(nbins);
     * mallctl("arenas.nbins", &amp;nbins, &amp;len, NULL, 0);
     * 
     * miblen = 4;
     * mallctlnametomib("arenas.bin.0.size", mib, &amp;miblen);
     * for (i = 0; i &lt; nbins; i++) {
     *     size_t bin_size;
     * 
     *     mib[2] = i;
     *     len = sizeof(bin_size);
     *     mallctlbymib(mib, miblen, &amp;bin_size, &amp;len, NULL, 0);
     *     // Do something with bin_size...
     * }</code></pre>
     *
     * @param name    the namespace location
     * @param mibp    an array of integers
     * @param miblenp the number of components in {@code mibp}
     */
    public static int je_mallctlnametomib(@NativeType("char const *") ByteBuffer name, @NativeType("size_t *") PointerBuffer mibp, @NativeType("size_t *") PointerBuffer miblenp) {
        if (CHECKS) {
            checkNT1(name);
            check(miblenp, 1);
            check(mibp, miblenp.get(miblenp.position()));
        }
        return nje_mallctlnametomib(memAddress(name), memAddress(mibp), memAddress(miblenp));
    }

    /**
     * Provides a way to avoid repeated name lookups for applications that repeatedly query the same portion of the namespace, by translating a name to a
     * “Management Information Base” (MIB) that can be passed repeatedly to {@link #je_mallctlbymib mallctlbymib}. Upon successful return from {@code mallctlnametomib()},
     * {@code mibp} contains an array of {@code *miblenp} integers, where {@code *miblenp} is the lesser of the number of components in name and the input
     * value of {@code *miblenp}. Thus it is possible to pass a {@code *miblenp} that is smaller than the number of period-separated name components, which
     * results in a partial MIB that can be used as the basis for constructing a complete MIB. For name components that are integers (e.g. the 2 in
     * "arenas.bin.2.size"), the corresponding MIB component will always be that integer. Therefore, it is legitimate to construct code like the following:
     * 
     * <pre><code>
     * unsigned nbins, i;
     * size_t mib[4];
     * size_t len, miblen;
     * 
     * len = sizeof(nbins);
     * mallctl("arenas.nbins", &amp;nbins, &amp;len, NULL, 0);
     * 
     * miblen = 4;
     * mallctlnametomib("arenas.bin.0.size", mib, &amp;miblen);
     * for (i = 0; i &lt; nbins; i++) {
     *     size_t bin_size;
     * 
     *     mib[2] = i;
     *     len = sizeof(bin_size);
     *     mallctlbymib(mib, miblen, &amp;bin_size, &amp;len, NULL, 0);
     *     // Do something with bin_size...
     * }</code></pre>
     *
     * @param name    the namespace location
     * @param mibp    an array of integers
     * @param miblenp the number of components in {@code mibp}
     */
    public static int je_mallctlnametomib(@NativeType("char const *") CharSequence name, @NativeType("size_t *") PointerBuffer mibp, @NativeType("size_t *") PointerBuffer miblenp) {
        if (CHECKS) {
            check(miblenp, 1);
            check(mibp, miblenp.get(miblenp.position()));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nje_mallctlnametomib(nameEncoded, memAddress(mibp), memAddress(miblenp));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ je_mallctlbymib ] ---

    /**
     * Unsafe version of: {@link #je_mallctlbymib mallctlbymib}
     *
     * @param miblen the number of elements in {@code mib}
     * @param newlen the new value length
     */
    public static int nje_mallctlbymib(long mib, long miblen, long oldp, long oldlenp, long newp, long newlen) {
        long __functionAddress = Functions.mallctlbymib;
        return invokePPPPPPI(mib, miblen, oldp, oldlenp, newp, newlen, __functionAddress);
    }

    /**
     * Similar to {@link #je_mallctl mallctl}, but uses MIBs instead of names. See {@link #je_mallctlnametomib mallctlnametomib} for details.
     *
     * @param mib     a MIB
     * @param oldp    returns a value
     * @param oldlenp returns the value length
     * @param newp    the new value
     */
    public static int je_mallctlbymib(@NativeType("size_t const *") PointerBuffer mib, @Nullable @NativeType("void *") ByteBuffer oldp, @Nullable @NativeType("size_t *") PointerBuffer oldlenp, @Nullable @NativeType("void *") ByteBuffer newp) {
        if (CHECKS) {
            checkSafe(oldlenp, 1);
        }
        return nje_mallctlbymib(memAddress(mib), mib.remaining(), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), remainingSafe(newp));
    }

    // --- [ je_malloc_stats_print ] ---

    /** Unsafe version of: {@link #je_malloc_stats_print malloc_stats_print} */
    public static void nje_malloc_stats_print(long write_cb, long cbopaque, long opts) {
        long __functionAddress = Functions.malloc_stats_print;
        invokePPPV(write_cb, cbopaque, opts, __functionAddress);
    }

    /**
     * Writes human-readable summary statistics via the {@code write_cb} callback function pointer and {@code cbopaque} data passed to {@code write_cb}, or
     * {@code malloc_message()} if {@code write_cb} is {@code NULL}. This function can be called repeatedly. General information that never changes during execution
     * can be omitted by specifying "g" as a character within the {@code opts} string. Note that {@code malloc_message()} uses the {@code mallctl*()}
     * functions internally, so inconsistent statistics can be reported if multiple threads use these functions simultaneously. If {@code --enable-stats} is
     * specified during configuration, “m” and “a” can be specified to omit merged arena and per arena statistics, respectively; “b” and “l” can be specified to
     * omit per size class statistics for bins and large objects, respectively. Unrecognized characters are silently ignored. Note that thread caching may
     * prevent some statistics from being completely up to date, since extra locking would be required to merge counters that track thread cache operations.
     *
     * @param write_cb the print callback, or {@code NULL} to use {@code malloc_message()}
     * @param cbopaque an opaque pointer that will be passed to {@code write_cb}
     * @param opts     an options string
     */
    public static void je_malloc_stats_print(@Nullable @NativeType("void (*) (void *, char const *)") MallocMessageCallbackI write_cb, @NativeType("void *") long cbopaque, @Nullable @NativeType("char const *") ByteBuffer opts) {
        if (CHECKS) {
            checkNT1Safe(opts);
        }
        nje_malloc_stats_print(memAddressSafe(write_cb), cbopaque, memAddressSafe(opts));
    }

    /**
     * Writes human-readable summary statistics via the {@code write_cb} callback function pointer and {@code cbopaque} data passed to {@code write_cb}, or
     * {@code malloc_message()} if {@code write_cb} is {@code NULL}. This function can be called repeatedly. General information that never changes during execution
     * can be omitted by specifying "g" as a character within the {@code opts} string. Note that {@code malloc_message()} uses the {@code mallctl*()}
     * functions internally, so inconsistent statistics can be reported if multiple threads use these functions simultaneously. If {@code --enable-stats} is
     * specified during configuration, “m” and “a” can be specified to omit merged arena and per arena statistics, respectively; “b” and “l” can be specified to
     * omit per size class statistics for bins and large objects, respectively. Unrecognized characters are silently ignored. Note that thread caching may
     * prevent some statistics from being completely up to date, since extra locking would be required to merge counters that track thread cache operations.
     *
     * @param write_cb the print callback, or {@code NULL} to use {@code malloc_message()}
     * @param cbopaque an opaque pointer that will be passed to {@code write_cb}
     * @param opts     an options string
     */
    public static void je_malloc_stats_print(@Nullable @NativeType("void (*) (void *, char const *)") MallocMessageCallbackI write_cb, @NativeType("void *") long cbopaque, @Nullable @NativeType("char const *") CharSequence opts) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCIISafe(opts, true);
            long optsEncoded = opts == null ? NULL : stack.getPointerAddress();
            nje_malloc_stats_print(memAddressSafe(write_cb), cbopaque, optsEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ je_malloc_usable_size ] ---

    /** Unsafe version of: {@link #je_malloc_usable_size malloc_usable_size} */
    public static long nje_malloc_usable_size(long ptr) {
        long __functionAddress = Functions.malloc_usable_size;
        return invokePP(ptr, __functionAddress);
    }

    /**
     * Returns the usable size of the allocation pointed to by {@code ptr}. The return value may be larger than the size that was requested during allocation.
     * The {@code malloc_usable_size()} function is not a mechanism for in-place {@link #je_realloc realloc}; rather it is provided solely as a tool for introspection
     * purposes. Any discrepancy between the requested allocation size and the size reported by {@code malloc_usable_size()} should not be depended on, since
     * such behavior is entirely implementation-dependent.
     *
     * @param ptr the allocated memory to query
     */
    @NativeType("size_t")
    public static long je_malloc_usable_size(@NativeType("void const *") ByteBuffer ptr) {
        return nje_malloc_usable_size(memAddress(ptr));
    }

    /**
     * Align the memory allocation to start at an address that is a multiple of {@code (1 << la)}. This macro does not validate that {@code la} is within the
     * valid range.
     *
     * @param la the alignment shift
     */
    public static int MALLOCX_LG_ALIGN(int la) {
        return la;
    }

    /**
     * Align the memory allocation to start at an address that is a multiple of {@code a}, where {@code a} is a power of two. This macro does not validate
     * that {@code a} is a power of 2.
     *
     * @param a the alignment
     */
    public static int MALLOCX_ALIGN(int a) {
        return Integer.numberOfTrailingZeros(a);
    }

    /**
     * Use the thread-specific cache (tcache) specified by the identifier {@code tc}, which must have been acquired via the {@code tcache.create} mallctl.
     * This macro does not validate that {@code tc} specifies a valid identifier.
     *
     * @param tc the thread-specific cache
     */
    public static int MALLOCX_TCACHE(int tc) {
        return (tc + 2) << 8;
    }

    /**
     * Use the arena specified by the index {@code a} (and by necessity bypass the thread cache). This macro has no effect for huge regions, nor for regions
     * that were allocated via an arena other than the one specified. This macro does not validate that {@code a} specifies an arena index in the valid range.
     *
     * @param a the arena index
     */
    public static int MALLOCX_ARENA(int a) {
        return (a + 1) << 20;
    }

}