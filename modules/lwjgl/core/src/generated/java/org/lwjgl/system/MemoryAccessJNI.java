/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system;


import static org.lwjgl.system.Checks.*;

/** Memory access utilities. */
final class MemoryAccessJNI {

    static { Library.initialize(); }

    private MemoryAccessJNI() {
        throw new UnsupportedOperationException();
    }

    // --- [ getPointerSize ] ---

    /** Returns the {@code sizeof(void *)}. */
    static native int getPointerSize();

    // --- [ malloc ] ---

    @NativeType("void * (*) (size_t)")
    private static native long malloc();

    /** Returns the address of the stdlib {@code malloc} function. */
    static final long malloc = malloc();

    // --- [ calloc ] ---

    @NativeType("void * (*) (size_t, size_t)")
    private static native long calloc();

    /** Returns the address of the stdlib {@code calloc} function. */
    static final long calloc = calloc();

    // --- [ realloc ] ---

    @NativeType("void * (*) (void *, size_t)")
    private static native long realloc();

    /** Returns the address of the stdlib {@code realloc} function. */
    static final long realloc = realloc();

    // --- [ free ] ---

    @NativeType("void (*) (void *)")
    private static native long free();

    /** Returns the address of the stdlib {@code free} function. */
    static final long free = free();

    // --- [ aligned_alloc ] ---

    @NativeType("void * (*) (size_t, size_t)")
    private static native long aligned_alloc();

    /** Returns the address of the stdlib {@code aligned_alloc} function. */
    static final long aligned_alloc = aligned_alloc();

    // --- [ aligned_free ] ---

    @NativeType("void (*) (void *)")
    private static native long aligned_free();

    /** Returns the address of the stdlib {@code aligned_free} function. */
    static final long aligned_free = aligned_free();

    // --- [ getByte ] ---

    /** Unsafe version of: {@link #getByte} */
    static native byte ngetByte(long ptr);

    /**
     * Reads a byte value from the specified memory address.
     *
     * @param ptr the memory address to read
     */
    @NativeType("int8_t")
    static byte getByte(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetByte(ptr);
    }

    // --- [ getShort ] ---

    /** Unsafe version of: {@link #getShort} */
    static native short ngetShort(long ptr);

    /**
     * Reads a short value from the specified memory address.
     *
     * @param ptr the memory address to read
     */
    @NativeType("int16_t")
    static short getShort(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetShort(ptr);
    }

    // --- [ getInt ] ---

    /** Unsafe version of: {@link #getInt} */
    static native int ngetInt(long ptr);

    /**
     * Reads an int value from the specified memory address.
     *
     * @param ptr the memory address to read
     */
    @NativeType("int32_t")
    static int getInt(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetInt(ptr);
    }

    // --- [ getLong ] ---

    /** Unsafe version of: {@link #getLong} */
    static native long ngetLong(long ptr);

    /**
     * Reads a long value from the specified memory address.
     *
     * @param ptr the memory address to read
     */
    @NativeType("int64_t")
    static long getLong(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetLong(ptr);
    }

    // --- [ getFloat ] ---

    /** Unsafe version of: {@link #getFloat} */
    static native float ngetFloat(long ptr);

    /**
     * Reads a float value from the specified memory address.
     *
     * @param ptr the memory address to read
     */
    static float getFloat(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetFloat(ptr);
    }

    // --- [ getDouble ] ---

    /** Unsafe version of: {@link #getDouble} */
    static native double ngetDouble(long ptr);

    /**
     * Reads a double value from the specified memory address.
     *
     * @param ptr the memory address to read
     */
    static double getDouble(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetDouble(ptr);
    }

    // --- [ getAddress ] ---

    /** Unsafe version of: {@link #getAddress} */
    static native long ngetAddress(long ptr);

    /**
     * Reads a pointer address from the specified memory address.
     *
     * @param ptr the memory address to read
     */
    @NativeType("uintptr_t")
    static long getAddress(@NativeType("void *") long ptr) {
        if (CHECKS) {
            check(ptr);
        }
        return ngetAddress(ptr);
    }

    // --- [ putByte ] ---

    /** Unsafe version of: {@link #putByte} */
    static native void nputByte(long ptr, byte value);

    /**
     * Writes a byte value to the specified memory address.
     *
     * @param ptr   the memory address to write
     * @param value the value to write
     */
    static void putByte(@NativeType("void *") long ptr, @NativeType("int8_t") byte value) {
        if (CHECKS) {
            check(ptr);
        }
        nputByte(ptr, value);
    }

    // --- [ putShort ] ---

    /** Unsafe version of: {@link #putShort} */
    static native void nputShort(long ptr, short value);

    /**
     * Writes a short value to the specified memory address.
     *
     * @param ptr   the memory address to write
     * @param value the value to write
     */
    static void putShort(@NativeType("void *") long ptr, @NativeType("int16_t") short value) {
        if (CHECKS) {
            check(ptr);
        }
        nputShort(ptr, value);
    }

    // --- [ putInt ] ---

    /** Unsafe version of: {@link #putInt} */
    static native void nputInt(long ptr, int value);

    /**
     * Writes an int value to the specified memory address.
     *
     * @param ptr   the memory address to write
     * @param value the value to write
     */
    static void putInt(@NativeType("void *") long ptr, @NativeType("int32_t") int value) {
        if (CHECKS) {
            check(ptr);
        }
        nputInt(ptr, value);
    }

    // --- [ putLong ] ---

    /** Unsafe version of: {@link #putLong} */
    static native void nputLong(long ptr, long value);

    /**
     * Writes a long value to the specified memory address.
     *
     * @param ptr   the memory address to write
     * @param value the value to write
     */
    static void putLong(@NativeType("void *") long ptr, @NativeType("int64_t") long value) {
        if (CHECKS) {
            check(ptr);
        }
        nputLong(ptr, value);
    }

    // --- [ putFloat ] ---

    /** Unsafe version of: {@link #putFloat} */
    static native void nputFloat(long ptr, float value);

    /**
     * Writes a float value to the specified memory address.
     *
     * @param ptr   the memory address to write
     * @param value the value to write
     */
    static void putFloat(@NativeType("void *") long ptr, float value) {
        if (CHECKS) {
            check(ptr);
        }
        nputFloat(ptr, value);
    }

    // --- [ putDouble ] ---

    /** Unsafe version of: {@link #putDouble} */
    static native void nputDouble(long ptr, double value);

    /**
     * Writes a double value to the specified memory address.
     *
     * @param ptr   the memory address to write
     * @param value the value to write
     */
    static void putDouble(@NativeType("void *") long ptr, double value) {
        if (CHECKS) {
            check(ptr);
        }
        nputDouble(ptr, value);
    }

    // --- [ putAddress ] ---

    /** Unsafe version of: {@link #putAddress} */
    static native void nputAddress(long ptr, long value);

    /**
     * Writes a pointer address to the specified memory address.
     *
     * @param ptr   the memory address to write
     * @param value the value to write
     */
    static void putAddress(@NativeType("void *") long ptr, @NativeType("uintptr_t") long value) {
        if (CHECKS) {
            check(ptr);
        }
        nputAddress(ptr, value);
    }

}