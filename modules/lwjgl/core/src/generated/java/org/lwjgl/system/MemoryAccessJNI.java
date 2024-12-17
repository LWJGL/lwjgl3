/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system;


import static org.lwjgl.system.Checks.*;

final class MemoryAccessJNI {

    static { Library.initialize(); }

    private MemoryAccessJNI() {
        throw new UnsupportedOperationException();
    }

    // --- [ getPointerSize ] ---

    /** {@code int getPointerSize(void)} */
    static native int getPointerSize();

    // --- [ malloc ] ---

    @NativeType("void * (*) (size_t)")
    private static native long malloc();

    /** {@code void * (*) (size_t) malloc(void)} */
    static final long malloc = malloc();

    // --- [ calloc ] ---

    @NativeType("void * (*) (size_t, size_t)")
    private static native long calloc();

    /** {@code void * (*) (size_t, size_t) calloc(void)} */
    static final long calloc = calloc();

    // --- [ realloc ] ---

    @NativeType("void * (*) (void *, size_t)")
    private static native long realloc();

    /** {@code void * (*) (void *, size_t) realloc(void)} */
    static final long realloc = realloc();

    // --- [ free ] ---

    @NativeType("void (*) (void *)")
    private static native long free();

    /** {@code void (*) (void *) free(void)} */
    static final long free = free();

    // --- [ aligned_alloc ] ---

    @NativeType("void * (*) (size_t, size_t)")
    private static native long aligned_alloc();

    /** {@code void * (*) (size_t, size_t) aligned_alloc(void)} */
    static final long aligned_alloc = aligned_alloc();

    // --- [ aligned_free ] ---

    @NativeType("void (*) (void *)")
    private static native long aligned_free();

    /** {@code void (*) (void *) aligned_free(void)} */
    static final long aligned_free = aligned_free();

    // --- [ getByte ] ---

    /** {@code int8_t getByte(void * ptr)} */
    static native byte ngetByte(long ptr);

    /** {@code int8_t getByte(void * ptr)} */
    @NativeType("int8_t")
    static byte getByte(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetByte(ptr);
    }

    // --- [ getShort ] ---

    /** {@code int16_t getShort(void * ptr)} */
    static native short ngetShort(long ptr);

    /** {@code int16_t getShort(void * ptr)} */
    @NativeType("int16_t")
    static short getShort(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetShort(ptr);
    }

    // --- [ getInt ] ---

    /** {@code int32_t getInt(void * ptr)} */
    static native int ngetInt(long ptr);

    /** {@code int32_t getInt(void * ptr)} */
    @NativeType("int32_t")
    static int getInt(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetInt(ptr);
    }

    // --- [ getLong ] ---

    /** {@code int64_t getLong(void * ptr)} */
    static native long ngetLong(long ptr);

    /** {@code int64_t getLong(void * ptr)} */
    @NativeType("int64_t")
    static long getLong(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetLong(ptr);
    }

    // --- [ getFloat ] ---

    /** {@code float getFloat(void * ptr)} */
    static native float ngetFloat(long ptr);

    /** {@code float getFloat(void * ptr)} */
    static float getFloat(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetFloat(ptr);
    }

    // --- [ getDouble ] ---

    /** {@code double getDouble(void * ptr)} */
    static native double ngetDouble(long ptr);

    /** {@code double getDouble(void * ptr)} */
    static double getDouble(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetDouble(ptr);
    }

    // --- [ getAddress ] ---

    /** {@code uintptr_t getAddress(void * ptr)} */
    static native long ngetAddress(long ptr);

    /** {@code uintptr_t getAddress(void * ptr)} */
    @NativeType("uintptr_t")
    static long getAddress(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetAddress(ptr);
    }

    // --- [ putByte ] ---

    /** {@code void putByte(void * ptr, int8_t value)} */
    static native void nputByte(long ptr, byte value);

    /** {@code void putByte(void * ptr, int8_t value)} */
    static void putByte(@NativeType("void *") long ptr, @NativeType("int8_t") byte value) {
        if (CHECKS) {
            check(ptr);
        }
        nputByte(ptr, value);
    }

    // --- [ putShort ] ---

    /** {@code void putShort(void * ptr, int16_t value)} */
    static native void nputShort(long ptr, short value);

    /** {@code void putShort(void * ptr, int16_t value)} */
    static void putShort(@NativeType("void *") long ptr, @NativeType("int16_t") short value) {
        if (CHECKS) {
            check(ptr);
        }
        nputShort(ptr, value);
    }

    // --- [ putInt ] ---

    /** {@code void putInt(void * ptr, int32_t value)} */
    static native void nputInt(long ptr, int value);

    /** {@code void putInt(void * ptr, int32_t value)} */
    static void putInt(@NativeType("void *") long ptr, @NativeType("int32_t") int value) {
        if (CHECKS) {
            check(ptr);
        }
        nputInt(ptr, value);
    }

    // --- [ putLong ] ---

    /** {@code void putLong(void * ptr, int64_t value)} */
    static native void nputLong(long ptr, long value);

    /** {@code void putLong(void * ptr, int64_t value)} */
    static void putLong(@NativeType("void *") long ptr, @NativeType("int64_t") long value) {
        if (CHECKS) {
            check(ptr);
        }
        nputLong(ptr, value);
    }

    // --- [ putFloat ] ---

    /** {@code void putFloat(void * ptr, float value)} */
    static native void nputFloat(long ptr, float value);

    /** {@code void putFloat(void * ptr, float value)} */
    static void putFloat(@NativeType("void *") long ptr, float value) {
        if (CHECKS) {
            check(ptr);
        }
        nputFloat(ptr, value);
    }

    // --- [ putDouble ] ---

    /** {@code void putDouble(void * ptr, double value)} */
    static native void nputDouble(long ptr, double value);

    /** {@code void putDouble(void * ptr, double value)} */
    static void putDouble(@NativeType("void *") long ptr, double value) {
        if (CHECKS) {
            check(ptr);
        }
        nputDouble(ptr, value);
    }

    // --- [ putAddress ] ---

    /** {@code void putAddress(void * ptr, uintptr_t value)} */
    static native void nputAddress(long ptr, long value);

    /** {@code void putAddress(void * ptr, uintptr_t value)} */
    static void putAddress(@NativeType("void *") long ptr, @NativeType("uintptr_t") long value) {
        if (CHECKS) {
            check(ptr);
        }
        nputAddress(ptr, value);
    }

}