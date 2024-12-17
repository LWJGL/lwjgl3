/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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

    public static final int
        JEMALLOC_VERSION_MAJOR  = 5,
        JEMALLOC_VERSION_MINOR  = 2,
        JEMALLOC_VERSION_BUGFIX = 1,
        JEMALLOC_VERSION_NREV   = 0;

    public static final String JEMALLOC_VERSION_GID = "ea6b3e973b477b8061e0076bb257dbd7f3faa756";

    public static final String JEMALLOC_VERSION = JEMALLOC_VERSION_MAJOR + "." + JEMALLOC_VERSION_MINOR + "." + JEMALLOC_VERSION_BUGFIX + "-" + JEMALLOC_VERSION_NREV + "-g" + JEMALLOC_VERSION_GID;

    public static final int
        MALLOCX_ZERO        = 0x40,
        MALLOCX_TCACHE_NONE = MALLOCX_TCACHE(-1);

    public static final int
        MALLCTL_ARENAS_ALL       = 0x1000,
        MALLCTL_ARENAS_DESTROYED = 0x1001;

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

    /** {@code void (*) (void *, char const *) * je_malloc_message(void)} */
    @NativeType("void (*) (void *, char const *) *")
    public static PointerBuffer je_malloc_message() {
        long __result = Functions.malloc_message;
        return memPointerBuffer(__result, 1);
    }

    // --- [ je_malloc ] ---

    /** {@code void * je_malloc(size_t size)} */
    public static long nje_malloc(long size) {
        long __functionAddress = Functions.malloc;
        return invokePP(size, __functionAddress);
    }

    /** {@code void * je_malloc(size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer je_malloc(@NativeType("size_t") long size) {
        long __result = nje_malloc(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_calloc ] ---

    /** {@code void * je_calloc(size_t num, size_t size)} */
    public static long nje_calloc(long num, long size) {
        long __functionAddress = Functions.calloc;
        return invokePPP(num, size, __functionAddress);
    }

    /** {@code void * je_calloc(size_t num, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer je_calloc(@NativeType("size_t") long num, @NativeType("size_t") long size) {
        long __result = nje_calloc(num, size);
        return memByteBufferSafe(__result, (int)num * (int)size);
    }

    // --- [ je_posix_memalign ] ---

    /** {@code int je_posix_memalign(void ** memptr, size_t alignment, size_t size)} */
    public static int nje_posix_memalign(long memptr, long alignment, long size) {
        long __functionAddress = Functions.posix_memalign;
        return invokePPPI(memptr, alignment, size, __functionAddress);
    }

    /** {@code int je_posix_memalign(void ** memptr, size_t alignment, size_t size)} */
    public static int je_posix_memalign(@NativeType("void **") PointerBuffer memptr, @NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(memptr, 1);
        }
        return nje_posix_memalign(memAddress(memptr), alignment, size);
    }

    // --- [ je_aligned_alloc ] ---

    /** {@code void * je_aligned_alloc(size_t alignment, size_t size)} */
    public static long nje_aligned_alloc(long alignment, long size) {
        long __functionAddress = Functions.aligned_alloc;
        return invokePPP(alignment, size, __functionAddress);
    }

    /** {@code void * je_aligned_alloc(size_t alignment, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer je_aligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nje_aligned_alloc(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_realloc ] ---

    /** {@code void * je_realloc(void * ptr, size_t size)} */
    public static long nje_realloc(long ptr, long size) {
        long __functionAddress = Functions.realloc;
        return invokePPP(ptr, size, __functionAddress);
    }

    /** {@code void * je_realloc(void * ptr, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer je_realloc(@NativeType("void *") @Nullable ByteBuffer ptr, @NativeType("size_t") long size) {
        long __result = nje_realloc(memAddressSafe(ptr), size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_free ] ---

    /** {@code void je_free(void * ptr)} */
    public static void nje_free(long ptr) {
        long __functionAddress = Functions.free;
        invokePV(ptr, __functionAddress);
    }

    /** {@code void je_free(void * ptr)} */
    public static void je_free(@NativeType("void *") @Nullable ByteBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /** {@code void je_free(void * ptr)} */
    public static void je_free(@NativeType("void *") @Nullable ShortBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /** {@code void je_free(void * ptr)} */
    public static void je_free(@NativeType("void *") @Nullable IntBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /** {@code void je_free(void * ptr)} */
    public static void je_free(@NativeType("void *") @Nullable LongBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /** {@code void je_free(void * ptr)} */
    public static void je_free(@NativeType("void *") @Nullable FloatBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /** {@code void je_free(void * ptr)} */
    public static void je_free(@NativeType("void *") @Nullable DoubleBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    /** {@code void je_free(void * ptr)} */
    public static void je_free(@NativeType("void *") @Nullable PointerBuffer ptr) {
        nje_free(memAddressSafe(ptr));
    }

    // --- [ je_free_sized ] ---

    /** {@code void je_free_sized(void * ptr, size_t size)} */
    public static void nje_free_sized(long ptr, long size) {
        long __functionAddress = Functions.free_sized;
        invokePPV(ptr, size, __functionAddress);
    }

    /** {@code void je_free_sized(void * ptr, size_t size)} */
    public static void je_free_sized(@NativeType("void *") @Nullable ByteBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), remainingSafe(ptr));
    }

    /** {@code void je_free_sized(void * ptr, size_t size)} */
    public static void je_free_sized(@NativeType("void *") @Nullable ShortBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << 1);
    }

    /** {@code void je_free_sized(void * ptr, size_t size)} */
    public static void je_free_sized(@NativeType("void *") @Nullable IntBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << 2);
    }

    /** {@code void je_free_sized(void * ptr, size_t size)} */
    public static void je_free_sized(@NativeType("void *") @Nullable LongBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << 3);
    }

    /** {@code void je_free_sized(void * ptr, size_t size)} */
    public static void je_free_sized(@NativeType("void *") @Nullable FloatBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << 2);
    }

    /** {@code void je_free_sized(void * ptr, size_t size)} */
    public static void je_free_sized(@NativeType("void *") @Nullable DoubleBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << 3);
    }

    /** {@code void je_free_sized(void * ptr, size_t size)} */
    public static void je_free_sized(@NativeType("void *") @Nullable PointerBuffer ptr) {
        nje_free_sized(memAddressSafe(ptr), Integer.toUnsignedLong(remainingSafe(ptr)) << POINTER_SHIFT);
    }

    // --- [ je_free_aligned_sized ] ---

    /** {@code void je_free_aligned_sized(void * ptr, size_t alignment, size_t size)} */
    public static void nje_free_aligned_sized(long ptr, long alignment, long size) {
        long __functionAddress = Functions.free_aligned_sized;
        invokePPPV(ptr, alignment, size, __functionAddress);
    }

    /** {@code void je_free_aligned_sized(void * ptr, size_t alignment, size_t size)} */
    public static void je_free_aligned_sized(@NativeType("void *") @Nullable ByteBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, remainingSafe(ptr));
    }

    /** {@code void je_free_aligned_sized(void * ptr, size_t alignment, size_t size)} */
    public static void je_free_aligned_sized(@NativeType("void *") @Nullable ShortBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << 1);
    }

    /** {@code void je_free_aligned_sized(void * ptr, size_t alignment, size_t size)} */
    public static void je_free_aligned_sized(@NativeType("void *") @Nullable IntBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << 2);
    }

    /** {@code void je_free_aligned_sized(void * ptr, size_t alignment, size_t size)} */
    public static void je_free_aligned_sized(@NativeType("void *") @Nullable LongBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << 3);
    }

    /** {@code void je_free_aligned_sized(void * ptr, size_t alignment, size_t size)} */
    public static void je_free_aligned_sized(@NativeType("void *") @Nullable FloatBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << 2);
    }

    /** {@code void je_free_aligned_sized(void * ptr, size_t alignment, size_t size)} */
    public static void je_free_aligned_sized(@NativeType("void *") @Nullable DoubleBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << 3);
    }

    /** {@code void je_free_aligned_sized(void * ptr, size_t alignment, size_t size)} */
    public static void je_free_aligned_sized(@NativeType("void *") @Nullable PointerBuffer ptr, @NativeType("size_t") long alignment) {
        nje_free_aligned_sized(memAddressSafe(ptr), alignment, Integer.toUnsignedLong(remainingSafe(ptr)) << POINTER_SHIFT);
    }

    // --- [ je_mallocx ] ---

    /** {@code void * je_mallocx(size_t size, int flags)} */
    public static long nje_mallocx(long size, int flags) {
        long __functionAddress = Functions.mallocx;
        return invokePP(size, flags, __functionAddress);
    }

    /** {@code void * je_mallocx(size_t size, int flags)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer je_mallocx(@NativeType("size_t") long size, int flags) {
        long __result = nje_mallocx(size, flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_rallocx ] ---

    /** {@code void * je_rallocx(void * ptr, size_t size, int flags)} */
    public static long nje_rallocx(long ptr, long size, int flags) {
        long __functionAddress = Functions.rallocx;
        return invokePPP(ptr, size, flags, __functionAddress);
    }

    /** {@code void * je_rallocx(void * ptr, size_t size, int flags)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer je_rallocx(@NativeType("void *") @Nullable ByteBuffer ptr, @NativeType("size_t") long size, int flags) {
        long __result = nje_rallocx(memAddressSafe(ptr), size, flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_xallocx ] ---

    /** {@code size_t je_xallocx(void * ptr, size_t size, size_t extra, int flags)} */
    public static long nje_xallocx(long ptr, long size, long extra, int flags) {
        long __functionAddress = Functions.xallocx;
        return invokePPPP(ptr, size, extra, flags, __functionAddress);
    }

    /** {@code size_t je_xallocx(void * ptr, size_t size, size_t extra, int flags)} */
    @NativeType("size_t")
    public static long je_xallocx(@NativeType("void *") @Nullable ByteBuffer ptr, @NativeType("size_t") long size, @NativeType("size_t") long extra, int flags) {
        return nje_xallocx(memAddressSafe(ptr), size, extra, flags);
    }

    // --- [ je_sallocx ] ---

    /** {@code size_t je_sallocx(void const * ptr, int flags)} */
    public static long nje_sallocx(long ptr, int flags) {
        long __functionAddress = Functions.sallocx;
        return invokePP(ptr, flags, __functionAddress);
    }

    /** {@code size_t je_sallocx(void const * ptr, int flags)} */
    @NativeType("size_t")
    public static long je_sallocx(@NativeType("void const *") ByteBuffer ptr, int flags) {
        return nje_sallocx(memAddress(ptr), flags);
    }

    // --- [ je_dallocx ] ---

    /** {@code void je_dallocx(void * ptr, int flags)} */
    public static void nje_dallocx(long ptr, int flags) {
        long __functionAddress = Functions.dallocx;
        invokePV(ptr, flags, __functionAddress);
    }

    /** {@code void je_dallocx(void * ptr, int flags)} */
    public static void je_dallocx(@NativeType("void *") ByteBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /** {@code void je_dallocx(void * ptr, int flags)} */
    public static void je_dallocx(@NativeType("void *") ShortBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /** {@code void je_dallocx(void * ptr, int flags)} */
    public static void je_dallocx(@NativeType("void *") IntBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /** {@code void je_dallocx(void * ptr, int flags)} */
    public static void je_dallocx(@NativeType("void *") LongBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /** {@code void je_dallocx(void * ptr, int flags)} */
    public static void je_dallocx(@NativeType("void *") FloatBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /** {@code void je_dallocx(void * ptr, int flags)} */
    public static void je_dallocx(@NativeType("void *") DoubleBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    /** {@code void je_dallocx(void * ptr, int flags)} */
    public static void je_dallocx(@NativeType("void *") PointerBuffer ptr, int flags) {
        nje_dallocx(memAddress(ptr), flags);
    }

    // --- [ je_sdallocx ] ---

    /** {@code void je_sdallocx(void * ptr, size_t size, int flags)} */
    public static void nje_sdallocx(long ptr, long size, int flags) {
        long __functionAddress = Functions.sdallocx;
        invokePPV(ptr, size, flags, __functionAddress);
    }

    /** {@code void je_sdallocx(void * ptr, size_t size, int flags)} */
    public static void je_sdallocx(@NativeType("void *") ByteBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), ptr.remaining(), flags);
    }

    /** {@code void je_sdallocx(void * ptr, size_t size, int flags)} */
    public static void je_sdallocx(@NativeType("void *") ShortBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << 1, flags);
    }

    /** {@code void je_sdallocx(void * ptr, size_t size, int flags)} */
    public static void je_sdallocx(@NativeType("void *") IntBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << 2, flags);
    }

    /** {@code void je_sdallocx(void * ptr, size_t size, int flags)} */
    public static void je_sdallocx(@NativeType("void *") LongBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << 3, flags);
    }

    /** {@code void je_sdallocx(void * ptr, size_t size, int flags)} */
    public static void je_sdallocx(@NativeType("void *") FloatBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << 2, flags);
    }

    /** {@code void je_sdallocx(void * ptr, size_t size, int flags)} */
    public static void je_sdallocx(@NativeType("void *") DoubleBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << 3, flags);
    }

    /** {@code void je_sdallocx(void * ptr, size_t size, int flags)} */
    public static void je_sdallocx(@NativeType("void *") PointerBuffer ptr, int flags) {
        nje_sdallocx(memAddress(ptr), Integer.toUnsignedLong(ptr.remaining()) << POINTER_SHIFT, flags);
    }

    // --- [ je_nallocx ] ---

    /** {@code void * je_nallocx(size_t size, int flags)} */
    public static long nje_nallocx(long size, int flags) {
        long __functionAddress = Functions.nallocx;
        return invokePP(size, flags, __functionAddress);
    }

    /** {@code void * je_nallocx(size_t size, int flags)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer je_nallocx(@NativeType("size_t") long size, int flags) {
        long __result = nje_nallocx(size, flags);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ je_mallctl ] ---

    /** {@code int je_mallctl(char const * name, void * oldp, size_t * oldlenp, void * newp, size_t newlen)} */
    public static int nje_mallctl(long name, long oldp, long oldlenp, long newp, long newlen) {
        long __functionAddress = Functions.mallctl;
        return invokePPPPPI(name, oldp, oldlenp, newp, newlen, __functionAddress);
    }

    /** {@code int je_mallctl(char const * name, void * oldp, size_t * oldlenp, void * newp, size_t newlen)} */
    public static int je_mallctl(@NativeType("char const *") ByteBuffer name, @NativeType("void *") @Nullable ByteBuffer oldp, @NativeType("size_t *") @Nullable PointerBuffer oldlenp, @NativeType("void *") @Nullable ByteBuffer newp) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(oldlenp, 1);
        }
        return nje_mallctl(memAddress(name), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), remainingSafe(newp));
    }

    /** {@code int je_mallctl(char const * name, void * oldp, size_t * oldlenp, void * newp, size_t newlen)} */
    public static int je_mallctl(@NativeType("char const *") CharSequence name, @NativeType("void *") @Nullable ByteBuffer oldp, @NativeType("size_t *") @Nullable PointerBuffer oldlenp, @NativeType("void *") @Nullable ByteBuffer newp) {
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

    /** {@code int je_mallctlnametomib(char const * name, size_t * mibp, size_t * miblenp)} */
    public static int nje_mallctlnametomib(long name, long mibp, long miblenp) {
        long __functionAddress = Functions.mallctlnametomib;
        return invokePPPI(name, mibp, miblenp, __functionAddress);
    }

    /** {@code int je_mallctlnametomib(char const * name, size_t * mibp, size_t * miblenp)} */
    public static int je_mallctlnametomib(@NativeType("char const *") ByteBuffer name, @NativeType("size_t *") PointerBuffer mibp, @NativeType("size_t *") PointerBuffer miblenp) {
        if (CHECKS) {
            checkNT1(name);
            check(miblenp, 1);
            check(mibp, miblenp.get(miblenp.position()));
        }
        return nje_mallctlnametomib(memAddress(name), memAddress(mibp), memAddress(miblenp));
    }

    /** {@code int je_mallctlnametomib(char const * name, size_t * mibp, size_t * miblenp)} */
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

    /** {@code int je_mallctlbymib(size_t const * mib, size_t miblen, void * oldp, size_t * oldlenp, void * newp, size_t newlen)} */
    public static int nje_mallctlbymib(long mib, long miblen, long oldp, long oldlenp, long newp, long newlen) {
        long __functionAddress = Functions.mallctlbymib;
        return invokePPPPPPI(mib, miblen, oldp, oldlenp, newp, newlen, __functionAddress);
    }

    /** {@code int je_mallctlbymib(size_t const * mib, size_t miblen, void * oldp, size_t * oldlenp, void * newp, size_t newlen)} */
    public static int je_mallctlbymib(@NativeType("size_t const *") PointerBuffer mib, @NativeType("void *") @Nullable ByteBuffer oldp, @NativeType("size_t *") @Nullable PointerBuffer oldlenp, @NativeType("void *") @Nullable ByteBuffer newp) {
        if (CHECKS) {
            checkSafe(oldlenp, 1);
        }
        return nje_mallctlbymib(memAddress(mib), mib.remaining(), memAddressSafe(oldp), memAddressSafe(oldlenp), memAddressSafe(newp), remainingSafe(newp));
    }

    // --- [ je_malloc_stats_print ] ---

    /** {@code void je_malloc_stats_print(void (*) (void *, char const *) write_cb, void * cbopaque, char const * opts)} */
    public static void nje_malloc_stats_print(long write_cb, long cbopaque, long opts) {
        long __functionAddress = Functions.malloc_stats_print;
        invokePPPV(write_cb, cbopaque, opts, __functionAddress);
    }

    /** {@code void je_malloc_stats_print(void (*) (void *, char const *) write_cb, void * cbopaque, char const * opts)} */
    public static void je_malloc_stats_print(@NativeType("void (*) (void *, char const *)") @Nullable MallocMessageCallbackI write_cb, @NativeType("void *") long cbopaque, @NativeType("char const *") @Nullable ByteBuffer opts) {
        if (CHECKS) {
            checkNT1Safe(opts);
        }
        nje_malloc_stats_print(memAddressSafe(write_cb), cbopaque, memAddressSafe(opts));
    }

    /** {@code void je_malloc_stats_print(void (*) (void *, char const *) write_cb, void * cbopaque, char const * opts)} */
    public static void je_malloc_stats_print(@NativeType("void (*) (void *, char const *)") @Nullable MallocMessageCallbackI write_cb, @NativeType("void *") long cbopaque, @NativeType("char const *") @Nullable CharSequence opts) {
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

    /** {@code size_t je_malloc_usable_size(void const * ptr)} */
    public static long nje_malloc_usable_size(long ptr) {
        long __functionAddress = Functions.malloc_usable_size;
        return invokePP(ptr, __functionAddress);
    }

    /** {@code size_t je_malloc_usable_size(void const * ptr)} */
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