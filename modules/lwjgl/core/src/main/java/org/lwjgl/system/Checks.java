/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

import javax.annotation.*;
import java.nio.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.CheckIntrinsics.*;
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
     * buffer capacity checks for texture images (GL &amp; CL), etc. LWJGL will also print additional information, mainly during start-up.</p>
     *
     * <p>Can be enabled by setting {@link Configuration#DEBUG} to true.</p>
     */
    public static final boolean DEBUG = Configuration.DEBUG.get(false);

    /**
     * Debug functions flag.
     *
     * <p>When enabled, a warning message will be output to the debug stream when LWJGL fails to retrieve a function pointer.</p>
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

    public static int lengthSafe(@Nullable short[] array)             { return array == null ? 0 : array.length;}
    public static int lengthSafe(@Nullable int[] array)               { return array == null ? 0 : array.length;}
    public static int lengthSafe(@Nullable long[] array)              { return array == null ? 0 : array.length; }
    public static int lengthSafe(@Nullable float[] array)             { return array == null ? 0 : array.length;}
    public static int lengthSafe(@Nullable double[] array)            { return array == null ? 0 : array.length;}
    public static int remainingSafe(@Nullable Buffer buffer)          { return buffer == null ? 0 : buffer.remaining(); }
    public static int remainingSafe(@Nullable CustomBuffer<?> buffer) { return buffer == null ? 0 : buffer.remaining(); }

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
     * Checks if all functions are available in the function provider.
     *
     * @param provider  the function address provider
     * @param caps      the function address buffer
     * @param indices   the function indices
     * @param functions the function names
     *
     * @return true if all functions are available, false otherwise
     */
    public static boolean checkFunctions(FunctionProvider provider, PointerBuffer caps, int[] indices, String... functions) {
        boolean available = true;
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            if (index < 0 || caps.get(index) != NULL) {
                continue;
            }
            long address = provider.getFunctionAddress(functions[i]);
            if (address == NULL) {
                available = false;
                continue;
            }
            caps.put(index, address);
        }
        return available;
    }

    /**
     * Checks if all functions are available in the function provider.
     *
     * @param provider  the function address provider
     * @param handle    the handle to a platform/device/context
     * @param caps      the function address buffer
     * @param indices   the function indices
     * @param functions the function names
     *
     * @return true if all functions are available, false otherwise
     */
    public static boolean checkFunctions(FunctionProviderLocal provider, long handle, PointerBuffer caps, int[] indices, String... functions) {
        boolean available = true;
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            if (index < 0 || caps.get(index) != NULL) {
                continue;
            }
            long address = provider.getFunctionAddress(handle, functions[i]);
            if (address != NULL) {
                caps.put(index, address);
                continue;
            }
            available = false;
        }
        return available;
    }

    /**
     * Checks if all functions are available in the function provider.
     *
     * @param provider  the function address provider
     * @param caps      the function address buffer
     * @param indices   the function indices
     * @param functions the function names
     *
     * @return true if all functions are available, false otherwise
     */
    public static boolean checkFunctions(FunctionProvider provider, long[] caps, int[] indices, String... functions) {
        boolean available = true;
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            if (index < 0 || caps[index] != NULL) {
                continue;
            }
            long address = provider.getFunctionAddress(functions[i]);
            if (address == NULL) {
                available = false;
                continue;
            }
            caps[index] = address;
        }
        return available;
    }

    public static boolean reportMissing(String api, String extension) {
        apiLog("[" + api + "] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

    /**
     * Ensures that the specified pointer is not {@code NULL} (0L).
     *
     * @param pointer the pointer to check
     *
     * @throws NullPointerException if {@code pointer} is {@code NULL}
     */
    public static long check(long pointer) {
        if (pointer == NULL) {
            throw new NullPointerException();
        }

        return pointer;
    }

    private static void assertNT(boolean found) {
        if (!found) {
            throw new IllegalArgumentException("Missing termination");
        }
    }

    /** Ensures that the specified array is null-terminated. */
    public static void checkNT(int[] buf) {
        checkBuffer(buf.length, 1);
        assertNT(buf[buf.length - 1] == 0);
    }

    /** Ensures that the specified array is terminated with the specified terminator. */
    public static void checkNT(int[] buf, int terminator) {
        checkBuffer(buf.length, 1);
        assertNT(buf[buf.length - 1] == terminator);
    }

    /** Ensures that the specified array is null-terminated. */
    public static void checkNT(long[] buf) {
        checkBuffer(buf.length, 1);
        assertNT(buf[buf.length - 1] == NULL);
    }

    /** Ensures that the specified array is null-terminated. */
    public static void checkNT(float[] buf) {
        checkBuffer(buf.length, 1);
        assertNT(buf[buf.length - 1] == 0.0f);
    }

    /** Ensures that the specified ByteBuffer is null-terminated (last byte equal to 0). */
    public static void checkNT1(ByteBuffer buf) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == 0);
    }

    /** Ensures that the specified ByteBuffer is null-terminated (last 2 bytes equal to 0). */
    public static void checkNT2(ByteBuffer buf) {
        checkBuffer(buf.remaining(), 2);
        assertNT(buf.get(buf.limit() - 2) == 0);
    }

    /** Ensures that the specified IntBuffer is null-terminated. */
    public static void checkNT(IntBuffer buf) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == 0);
    }

    /** Ensures that the specified IntBuffer is terminated with the specified terminator. */
    public static void checkNT(IntBuffer buf, int terminator) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == terminator);
    }

    /** Ensures that the specified LongBuffer is null-terminated. */
    public static void checkNT(LongBuffer buf) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == NULL);
    }

    /** Ensures that the specified FloatBuffer is null-terminated. */
    public static void checkNT(FloatBuffer buf) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == 0.0f);
    }

    /** Ensures that the specified PointerBuffer is null-terminated. */
    public static void checkNT(PointerBuffer buf) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == NULL);
    }

    /** Ensures that the specified PointerBuffer is terminated with the specified terminator. */
    public static void checkNT(PointerBuffer buf, long terminator) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == terminator);
    }

    public static void checkNTSafe(@Nullable int[] buf) {
        if (buf != null) {
            checkBuffer(buf.length, 1);
            assertNT(buf[buf.length - 1] == 0);
        }
    }
    public static void checkNTSafe(@Nullable int[] buf, int terminator) {
        if (buf != null) {
            checkBuffer(buf.length, 1);
            assertNT(buf[buf.length - 1] == terminator);
        }
    }
    public static void checkNTSafe(@Nullable long[] buf) {
        if (buf != null) {
            checkBuffer(buf.length, 1);
            assertNT(buf[buf.length - 1] == NULL);
        }
    }
    public static void checkNTSafe(@Nullable float[] buf) {
        if (buf != null) {
            checkBuffer(buf.length, 1);
            assertNT(buf[buf.length - 1] == 0.0f);
        }
    }
    public static void checkNT1Safe(@Nullable ByteBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == 0);
        }
    }
    public static void checkNT2Safe(@Nullable ByteBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 2);
            assertNT(buf.get(buf.limit() - 2) == 0);
        }
    }
    public static void checkNTSafe(@Nullable IntBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == 0);
        }
    }
    public static void checkNTSafe(@Nullable IntBuffer buf, int terminator) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == terminator);
        }
    }
    public static void checkNTSafe(@Nullable LongBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == NULL);
        }
    }
    public static void checkNTSafe(@Nullable FloatBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == 0.0f);
        }
    }
    public static void checkNTSafe(@Nullable PointerBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == NULL);
        }
    }
    public static void checkNTSafe(@Nullable PointerBuffer buf, long terminator) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == terminator);
        }
    }

    private static void checkBuffer(int bufferSize, int minimumSize) {
        if (bufferSize < minimumSize) {
            throwIAE(bufferSize, minimumSize);
        }
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException if {@code buf.length < size}
     */
    public static void check(byte[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException if {@code buf.length < size}
     */
    public static void check(short[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException if {@code buf.length < size}
     */
    public static void check(int[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException if {@code buf.length < size}
     */
    public static void check(long[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException if {@code buf.length < size}
     */
    public static void check(float[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    /**
     * Helper method to ensure a array has enough capacity.
     *
     * @param buf  the array to check
     * @param size the minimum array capacity
     *
     * @throws IllegalArgumentException if {@code buf.length < size}
     */
    public static void check(double[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    /**
     * Helper method to ensure a CharSequence has enough characters.
     *
     * @param text the text to check
     * @param size the minimum number of characters
     *
     * @throws IllegalArgumentException if {@code text.length() < size}
     */
    public static void check(CharSequence text, int size) {
        checkBuffer(text.length(), size);
    }

    /**
     * Helper method to ensure a buffer has enough capacity.
     *
     * @param buf  the buffer to check
     * @param size the minimum buffer capacity
     *
     * @throws IllegalArgumentException if {@code buf.remaining() < size}
     */
    public static void check(Buffer buf, int size) {
        checkBuffer(buf.remaining(), size);
    }

    /** @see #check(Buffer, int) */
    public static void check(Buffer buf, long size) {
        checkBuffer(buf.remaining(), (int)size);
    }

    /**
     * Helper method to ensure a {@link CustomBuffer} has enough capacity.
     *
     * @param buf  the buffer to check
     * @param size the minimum buffer capacity
     *
     * @throws IllegalArgumentException if {@code buf.remaining() < size}
     */
    public static void check(CustomBuffer<?> buf, int size) {
        checkBuffer(buf.remaining(), size);
    }

    /** @see #check(CustomBuffer, int) */
    public static void check(CustomBuffer<?> buf, long size) {
        checkBuffer(buf.remaining(), (int)size);
    }

    public static void checkSafe(@Nullable short[] buf, int size) {
        if (buf != null) {
            checkBuffer(buf.length, size);
        }
    }
    public static void checkSafe(@Nullable int[] buf, int size) {
        if (buf != null) {
            checkBuffer(buf.length, size);
        }
    }
    public static void checkSafe(@Nullable long[] buf, int size) {
        if (buf != null) {
            checkBuffer(buf.length, size);
        }
    }
    public static void checkSafe(@Nullable float[] buf, int size) {
        if (buf != null) {
            checkBuffer(buf.length, size);
        }
    }
    public static void checkSafe(@Nullable double[] buf, int size) {
        if (buf != null) {
            checkBuffer(buf.length, size);
        }
    }
    public static void checkSafe(@Nullable Buffer buf, int size) {
        if (buf != null) {
            checkBuffer(buf.remaining(), size);
        }
    }
    public static void checkSafe(@Nullable Buffer buf, long size) {
        if (buf != null) {
            checkBuffer(buf.remaining(), (int)size);
        }
    }
    public static void checkSafe(@Nullable CustomBuffer<?> buf, int size) {
        if (buf != null) {
            checkBuffer(buf.remaining(), size);
        }
    }
    public static void checkSafe(@Nullable CustomBuffer<?> buf, long size) {
        if (buf != null) {
            checkBuffer(buf.remaining(), (int)size);
        }
    }

    public static void check(Object[] array, int size) {
        checkBuffer(array.length, size);
    }

    private static void checkBufferGT(int bufferSize, int maximumSize) {
        if (maximumSize < bufferSize) {
            throwIAEGT(bufferSize, maximumSize);
        }
    }

    public static void checkGT(Buffer buf, int size) {
        checkBufferGT(buf.remaining(), size);
    }

    public static void checkGT(CustomBuffer<?> buf, int size) {
        checkBufferGT(buf.remaining(), size);
    }

    public static long check(int index, int length) {
        if (CHECKS) {
            checkIndex(index, length);
        }
        // Convert to long to support addressing up to 2^31-1 elements, regardless of sizeof(element).
        // The unsigned conversion helps the JIT produce code that is as fast as if int was returned.
        return Integer.toUnsignedLong(index);
    }

    // Separate calls to help inline check.

    private static void throwIAE(int bufferSize, int minimumSize) {
        throw new IllegalArgumentException("Number of remaining elements is " + bufferSize + ", must be at least " + minimumSize);
    }

    private static void throwIAEGT(int bufferSize, int maximumSize) {
        throw new IllegalArgumentException("Number of remaining buffer elements is " + bufferSize + ", must be at most " + maximumSize);
    }

}