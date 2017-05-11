/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A class to check buffer boundaries in general. If there is insufficient space in the buffer when the call is made then a buffer overflow would otherwise
 * occur and cause unexpected behaviour, a crash, or worse, a security risk.
 *
 * <p>Internal class, don't use.</p>
 *
 * @see Configuration#DISABLE_CHECKS
 * @see Configuration#DEBUG
 * @see Configuration#DEBUG_FUNCTIONS
 */
public final class Checks {

    /**
     * Runtime checks flag.
     *
     * <p>When enabled, LWJGL will perform basic checks during its operation, mainly to avoid crashes in native code. Examples of such checks are:
     * context-specific function address validation, buffer capacity checks, null-termination checks, etc. These checks are generally low-overhead and should
     * not have a measurable effect on performance, so its recommended to have them enabled both during development and in production releases.</p>
     *
     * <p>If maximum performance is required, they can be disabled by setting {@link Configuration#DISABLE_CHECKS} to true.</p>
     */
    public static final boolean CHECKS = !Configuration.DISABLE_CHECKS.get(false);

    /**
     * Debug mode flag.
     *
     * <p>When enabled, LWJGL will perform additional checks during its operation. These checks are more expensive than the ones enabled with {@link #CHECKS}
     * and will have a noticeable effect on performance, so they are disabled by default. Examples of such checks are: buffer object binding state check (GL),
     * buffer capacity checks for texture images (GL & CL), etc. LWJGL will also print additional information, mainly during start-up.</p>
     *
     * <p>Can be enabled by setting {@link Configuration#DEBUG} to true.</p>
     */
    public static final boolean DEBUG = Configuration.DEBUG.get(false);

    /**
     * Debug functions flag.
     *
     * <p>When enabled, capabilities classes will print an error message when they fail to retrieve a function pointer.</p>
     *
     * <p>Can be enabled by setting {@link Configuration#DEBUG_FUNCTIONS} to true.</p>
     */
    public static final boolean DEBUG_FUNCTIONS = Configuration.DEBUG_FUNCTIONS.get(false);

    static {
        if (DEBUG_FUNCTIONS && !DEBUG) {
            APIUtil.DEBUG_STREAM.println("[LWJGL] The DEBUG_FUNCTIONS option requires DEBUG to produce output.");
        }
    }

    private Checks() {
    }

    public static int lengthSafe(short[] array)             { return array == null ? 0 : array.length;}
    public static int lengthSafe(int[] array)               { return array == null ? 0 : array.length;}
    public static int lengthSafe(long[] array)              { return array == null ? 0 : array.length; }
    public static int remainingSafe(Buffer buffer)          { return buffer == null ? 0 : buffer.remaining(); }
    public static int remainingSafe(CustomBuffer<?> buffer) { return buffer == null ? 0 : buffer.remaining(); }

    /**
     * Checks if any of the specified functions pointers is {@code NULL}.
     *
     * @param functions the function pointers to check
     *
     * @return true if all function pointers are valid, false otherwise.
     */
    public static boolean checkFunctions(long... functions) {
        for (long pointer : functions) {
            if (pointer == NULL) {
                return false;
            }
        }
        return true;
    }

    /**
     * Ensures that the specified pointer is not {@code NULL} (0L).
     *
     * @param pointer the pointer to check
     *
     * @throws NullPointerException
     */
    public static long check(long pointer) {
        if (pointer == NULL) {
            throw new NullPointerException();
        }

        return pointer;
    }

    /** Ensures that the specified array is null-terminated. */
    public static void checkNT(int[] buf) {
        checkNT(buf, 0);
    }

    /** Ensures that the specified array is terminated with the specified terminator. */
    public static void checkNT(int[] buf, int terminator) {
        check(buf, 1);
        if (buf[buf.length - 1] != terminator) {
            throw new IllegalArgumentException("Missing termination");
        }
    }

    /** Ensures that the specified array is null-terminated. */
    public static void checkNT(long[] buf) {
        check(buf, 1);
        if (buf[buf.length - 1] != NULL) {
            throw new IllegalArgumentException("Missing termination");
        }
    }

    /** Ensures that the specified array is null-terminated. */
    public static void checkNT(float[] buf) {
        check(buf, 1);
        if (buf[buf.length - 1] != 0.0f) {
            throw new IllegalArgumentException("Missing termination");
        }
    }

    /** Ensures that the specified ByteBuffer is null-terminated (last byte equal to 0). */
    public static void checkNT1(ByteBuffer buf) {
        check(buf, 1);
        if (buf.get(buf.limit() - 1) != 0) {
            throw new IllegalArgumentException("Missing null termination");
        }
    }

    /** Ensures that the specified ByteBuffer is null-terminated (last 2 bytes equal to 0). */
    public static void checkNT2(ByteBuffer buf) {
        check(buf, 2);
        if (buf.getShort(buf.limit() - 2) != 0) {
            throw new IllegalArgumentException("Missing null termination");
        }
    }

    /** Ensures that the specified IntBuffer is null-terminated. */
    public static void checkNT(IntBuffer buf) {
        checkNT(buf, 0);
    }

    /** Ensures that the specified IntBuffer is terminated with the specified terminator. */
    public static void checkNT(IntBuffer buf, int terminator) {
        check(buf, 1);
        if (buf.get(buf.limit() - 1) != terminator) {
            throw new IllegalArgumentException("Missing termination");
        }
    }

    /** Ensures that the specified LongBuffer is null-terminated. */
    public static void checkNT(LongBuffer buf) {
        check(buf, 1);
        if (buf.get(buf.limit() - 1) != NULL) {
            throw new IllegalArgumentException("Missing termination");
        }
    }

    /** Ensures that the specified FloatBuffer is null-terminated. */
    public static void checkNT(FloatBuffer buf) {
        check(buf, 1);
        if (buf.get(buf.limit() - 1) != 0.0f) {
            throw new IllegalArgumentException("Missing termination");
        }
    }

    /** Ensures that the specified PointerBuffer is null-terminated. */
    public static void checkNT(PointerBuffer buf) {
        checkNT(buf, NULL);
    }

    /** Ensures that the specified PointerBuffer is terminated with the specified terminator. */
    public static void checkNT(PointerBuffer buf, long terminator) {
        check(buf, 1);
        if (buf.get(buf.limit() - 1) != terminator) {
            throw new IllegalArgumentException("Missing termination");
        }
    }

    public static void checkNTSafe(int[] buf) {
        if (buf != null) {
            checkNT(buf);
        }
    }
    public static void checkNTSafe(int[] buf, int terminator) {
        if (buf != null) {
            checkNT(buf, terminator);
        }
    }
    public static void checkNTSafe(long[] buf) {
        if (buf != null) {
            checkNT(buf);
        }
    }
    public static void checkNTSafe(float[] buf) {
        if (buf != null) {
            checkNT(buf);
        }
    }
    public static void checkNT1Safe(ByteBuffer buf) {
        if (buf != null) {
            checkNT1(buf);
        }
    }
    public static void checkNT2Safe(ByteBuffer buf) {
        if (buf != null) {
            checkNT2(buf);
        }
    }
    public static void checkNTSafe(IntBuffer buf) {
        if (buf != null) {
            checkNT(buf);
        }
    }
    public static void checkNTSafe(IntBuffer buf, int terminator) {
        if (buf != null) {
            checkNT(buf, terminator);
        }
    }
    public static void checkNTSafe(LongBuffer buf) {
        if (buf != null) {
            checkNT(buf);
        }
    }
    public static void checkNTSafe(FloatBuffer buf) {
        if (buf != null) {
            checkNT(buf);
        }
    }
    public static void checkNTSafe(PointerBuffer buf) {
        if (buf != null) {
            checkNT(buf);
        }
    }
    public static void checkNTSafe(PointerBuffer buf, long terminator) {
        if (buf != null) {
            checkNT(buf, terminator);
        }
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException
     */
    public static void check(byte[] buf, int size) {
        if (buf.length < size) {
            throwIAE(buf, size);
        }
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException
     */
    public static void check(short[] buf, int size) {
        if (buf.length < size) {
            throwIAE(buf, size);
        }
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException
     */
    public static void check(int[] buf, int size) {
        if (buf.length < size) {
            throwIAE(buf, size);
        }
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException
     */
    public static void check(long[] buf, int size) {
        if (buf.length < size) {
            throwIAE(buf, size);
        }
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException
     */
    public static void check(float[] buf, int size) {
        if (buf.length < size) {
            throwIAE(buf, size);
        }
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException
     */
    public static void check(double[] buf, int size) {
        if (buf.length < size) {
            throwIAE(buf, size);
        }
    }

    /**
     * Helper method to ensure a CharSequence has enough characters.
     *
     * @param text the text to check
     * @param size the minimum number of characters
     */
    public static void check(CharSequence text, int size) {
        if (text.length() < size) {
            throwIAE(text, size);
        }
    }

    /**
     * Helper method to ensure a buffer has enough capacity.
     *
     * @param buf  the buffer to check
     * @param size the minimum buffer capacity
     *
     * @throws IllegalArgumentException
     */
    public static void check(Buffer buf, int size) {
        if (buf.remaining() < size) {
            throwIAE(buf, size);
        }
    }

    /** @see #check(Buffer, int) */
    public static void check(Buffer buf, long size) {
        check(buf, (int)size);
    }

    /**
     * Helper method to ensure a {@link CustomBuffer} has enough capacity.
     *
     * @param buf  the buffer to check
     * @param size the minimum buffer capacity
     *
     * @throws IllegalArgumentException
     */
    public static void check(CustomBuffer<?> buf, int size) {
        if (buf.remaining() < size) {
            throwIAE(buf, size);
        }
    }

    /** @see #check(CustomBuffer, int) */
    public static void check(CustomBuffer<?> buf, long size) {
        check(buf, (int)size);
    }

    public static void checkSafe(short[] buf, int size) {
        if (buf != null) {
            check(buf, size);
        }
    }
    public static void checkSafe(int[] buf, int size) {
        if (buf != null) {
            check(buf, size);
        }
    }
    public static void checkSafe(long[] buf, int size) {
        if (buf != null) {
            check(buf, size);
        }
    }
    public static void checkSafe(float[] buf, int size) {
        if (buf != null) {
            check(buf, size);
        }
    }
    public static void checkSafe(double[] buf, int size) {
        if (buf != null) {
            check(buf, size);
        }
    }
    public static void checkSafe(Buffer buf, int size) {
        if (buf != null) {
            check(buf, size);
        }
    }
    public static void checkSafe(Buffer buf, long size) {
        if (buf != null) {
            check(buf, size);
        }
    }
    public static void checkSafe(CustomBuffer<?> buf, int size) {
        if (buf != null) {
            check(buf, size);
        }
    }

    public static void check(Object[] array, int size) {
        if (array.length < size) {
            throwIAE(array, size);
        }
    }

    public static void checkGT(Buffer buf, int size) {
        if (size < buf.remaining()) {
            throwIAEGT(buf, size);
        }
    }

    public static void checkGT(CustomBuffer<?> buf, int size) {
        if (size < buf.remaining()) {
            throwIAEGT(buf, size);
        }
    }

    public static void checkGT(StructBuffer<?, ?> buf, int size) {
        if (size < buf.remaining()) {
            throwIAEGT(buf, size);
        }
    }

    public static void check(int index, int size) {
        if (index < 0 || size <= index) {
            throwIOBE(index, size);
        }
    }

    // Separate calls to help inline check.

    private static void throwIAE(Buffer buf, int size) {
        throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at least " + size);
    }

    private static void throwIAE(CustomBuffer<?> buf, int size) {
        throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at least " + size);
    }

    private static void throwIAE(Object[] array, int size) {
        throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
    }

    private static void throwIAE(byte[] array, int size) {
        throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
    }

    private static void throwIAE(short[] array, int size) {
        throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
    }

    private static void throwIAE(int[] array, int size) {
        throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
    }

    private static void throwIAE(long[] array, int size) {
        throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
    }

    private static void throwIAE(float[] array, int size) {
        throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
    }

    private static void throwIAE(double[] array, int size) {
        throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
    }

    private static void throwIAE(CharSequence text, int size) {
        throw new IllegalArgumentException("Number of characters is " + text.length() + ", must be at least " + size);
    }

    private static void throwIAEGT(Buffer buf, int size) {
        throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at most " + size + ".");
    }

    private static void throwIAEGT(CustomBuffer<?> buf, int size) {
        throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at most " + size + ".");
    }

    private static void throwIOBE(int index, int size) {
        throw new IndexOutOfBoundsException("Index is " + index + ", must be between 0 and  " + (size - 1));
    }

}