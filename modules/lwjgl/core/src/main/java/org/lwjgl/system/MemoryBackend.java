/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;
import java.util.*;

import static java.nio.charset.StandardCharsets.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this interface provide direct/unsafe off-heap memory access.
 *
 * <p>Use {@link Configuration#MEMORY_BACKEND} to configure or override the memory backed used by LWJGL.</p>
 *
 * <p>LWJGL does not guarantee API stability for this interface.</p>
 */
public interface MemoryBackend {

    /**
     * Returns the default {@code MemoryBackend} instance.
     *
     * <p>May be used to delegate memory access operations from a custom {@code MemoryBackend} implementation.</p>
     */
    static MemoryBackend getDefaultInstance() {
        int javaVersion = Platform.getJavaVersion();

        List<String> backendClasses = new ArrayList<>();

        if (27 <= javaVersion) {
            backendClasses.add("org.lwjgl.system.MemoryBackendUnsafe27");
            backendClasses.add("org.lwjgl.system.MemoryBackendUnsafeLegacy27");
        }

        if (26 <= javaVersion) {
            backendClasses.add("org.lwjgl.system.MemoryBackendUnsafe26");
            backendClasses.add("org.lwjgl.system.MemoryBackendUnsafeLegacy26");
        }

        if (25 <= javaVersion) {
            backendClasses.add("org.lwjgl.system.MemoryBackendUnsafe");
            backendClasses.add("org.lwjgl.system.MemoryBackendUnsafeLegacy25");
        }

        if (22 <= javaVersion) {
            backendClasses.add("org.lwjgl.system.MemoryBackendUnsafeLegacy22");
        }
        if (17 <= javaVersion) {
            backendClasses.add("org.lwjgl.system.MemoryBackendUnsafeLegacy17");
        }
        if (9 <= javaVersion) {
            // start from 9 for compact string support
            backendClasses.add("org.lwjgl.system.MemoryBackendUnsafeLegacy9");
        }

        backendClasses.add("org.lwjgl.system.MemoryBackendUnsafeLegacy");

        if (27 <= javaVersion) {
            backendClasses.add("org.lwjgl.system.MemoryBackendFFM27");
        }
        if (26 <= javaVersion) {
            backendClasses.add("org.lwjgl.system.MemoryBackendFFM26");
        }
        if (25 <= javaVersion) {
            backendClasses.add("org.lwjgl.system.MemoryBackendFFM");
        }

        List<Throwable> suppressedExceptions = new ArrayList<>();

        String suffix = getMemoryBackendSuffix();
        for (String backendClass : backendClasses) {
            try {
                return (MemoryBackend)Class.forName(backendClass + suffix)
                    .getDeclaredConstructor()
                    .newInstance();
            } catch (Throwable t) {
                suppressedExceptions.add(t);
            }
        }

        for (Throwable t : suppressedExceptions) {
            t.printStackTrace();
            if (t.getCause() != null) {
                t.getCause().printStackTrace();
            }
        }

        throw new Error("Failed to initialize a backend for MemoryUtil");
    }

    boolean getBoolean(long ptr);

    byte getByte(long ptr);

    char getChar(long ptr);
    char getCharUnaligned(long ptr);

    short getShort(long ptr);
    short getShortUnaligned(long ptr);

    int getInt(long ptr);
    int getIntUnaligned(long ptr);

    long getLong(long ptr);
    long getLongUnaligned(long ptr);

    long getLong(byte[] o, long offset);

    float getFloat(long ptr);
    float getFloatUnaligned(long ptr);

    double getDouble(long ptr);
    double getDoubleUnaligned(long ptr);

    long getCLong(long ptr);
    long getCLongUnaligned(long ptr);

    long getAddress(long ptr);
    long getAddressUnaligned(long ptr);

    void putBoolean(long ptr, boolean value);

    void putByte(long ptr, byte value);

    void putChar(long ptr, char value);
    void putCharUnaligned(long ptr, char value);

    void putShort(long ptr, short value);
    void putShortUnaligned(long ptr, short value);

    void putInt(long ptr, int value);
    void putIntUnaligned(long ptr, int value);

    void putLong(long ptr, long value);
    void putLongUnaligned(long ptr, long value);

    void putFloat(long ptr, float value);
    void putFloatUnaligned(long ptr, float value);

    void putDouble(long ptr, double value);
    void putDoubleUnaligned(long ptr, double value);

    void putCLong(long ptr, long value);
    void putCLongUnaligned(long ptr, long value);

    void putAddress(long ptr, long value);
    void putAddressUnaligned(long ptr, long value);

    long getAddress0(Buffer buffer);
    long getAddress0(ByteBuffer buffer);
    long getAddress0(CharBuffer buffer);
    long getAddress0(ShortBuffer buffer);
    long getAddress0(IntBuffer buffer);
    long getAddress0(LongBuffer buffer);
    long getAddress0(FloatBuffer buffer);
    long getAddress0(DoubleBuffer buffer);

    long getAddress(Buffer buffer);
    long getAddress(Buffer buffer, int position);

    long getAddress(ByteBuffer buffer);
    long getAddress(ByteBuffer buffer, int position);

    long getAddress(CharBuffer buffer);
    long getAddress(CharBuffer buffer, int position);

    long getAddress(ShortBuffer buffer);
    long getAddress(ShortBuffer buffer, int position);

    long getAddress(IntBuffer buffer);
    long getAddress(IntBuffer buffer, int position);

    long getAddress(LongBuffer buffer);
    long getAddress(LongBuffer buffer, int position);

    long getAddress(FloatBuffer buffer);
    long getAddress(FloatBuffer buffer, int position);

    long getAddress(DoubleBuffer buffer);
    long getAddress(DoubleBuffer buffer, int position);

    ByteBuffer wrapBufferByte(long address, int capacity);
    CharBuffer wrapBufferChar(long address, int capacity);
    ShortBuffer wrapBufferShort(long address, int capacity);
    IntBuffer wrapBufferInt(long address, int capacity);
    LongBuffer wrapBufferLong(long address, int capacity);
    FloatBuffer wrapBufferFloat(long address, int capacity);
    DoubleBuffer wrapBufferDouble(long address, int capacity);

    ByteBuffer duplicate(ByteBuffer buffer);
    CharBuffer duplicate(CharBuffer buffer);
    ShortBuffer duplicate(ShortBuffer buffer);
    IntBuffer duplicate(IntBuffer buffer);
    LongBuffer duplicate(LongBuffer buffer);
    FloatBuffer duplicate(FloatBuffer buffer);
    DoubleBuffer duplicate(DoubleBuffer buffer);

    ByteBuffer slice(ByteBuffer buffer);
    ByteBuffer slice(ByteBuffer buffer, int offset, int length);

    CharBuffer slice(CharBuffer buffer);
    CharBuffer slice(CharBuffer buffer, int offset, int length);

    ShortBuffer slice(ShortBuffer buffer);
    ShortBuffer slice(ShortBuffer buffer, int offset, int length);

    IntBuffer slice(IntBuffer buffer);
    IntBuffer slice(IntBuffer buffer, int offset, int length);

    LongBuffer slice(LongBuffer buffer);
    LongBuffer slice(LongBuffer buffer, int offset, int length);

    FloatBuffer slice(FloatBuffer buffer);
    FloatBuffer slice(FloatBuffer buffer, int offset, int length);

    DoubleBuffer slice(DoubleBuffer buffer);
    DoubleBuffer slice(DoubleBuffer buffer, int offset, int length);

    void memset(long ptr, int value, long bytes);
    void memcpy(long src, long dst, long bytes);

    void memcpy(byte[] src, long dst, int offset, int size);
    void memcpy(char[] src, long dst, int offset, int size);
    void memcpy(short[] src, long dst, int offset, int size);
    void memcpy(int[] src, long dst, int offset, int size);
    void memcpy(long[] src, long dst, int offset, int size);
    void memcpy(float[] src, long dst, int offset, int size);
    void memcpy(double[] src, long dst, int offset, int size);

    void memcpy(long src, byte[] dst, int offset, int size);
    void memcpy(long src, char[] dst, int offset, int size);
    void memcpy(long src, short[] dst, int offset, int size);
    void memcpy(long src, int[] dst, int offset, int size);
    void memcpy(long src, long[] dst, int offset, int size);
    void memcpy(long src, float[] dst, int offset, int size);
    void memcpy(long src, double[] dst, int offset, int size);

    default String getStringASCII(long source) {
        return getStringASCII(source, strlenNT1Checked(source, Integer.MAX_VALUE));
    }
    default String getStringASCII(long source, int length) {
        byte[] bytes = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[length];
        memcpy(source, bytes, 0, length);
        return new String(bytes, 0, length, ISO_8859_1);
    }

    default String getStringUTF8(long source) {
        return getStringUTF8(source, strlenNT1Checked(source, Integer.MAX_VALUE));
    }
    default String getStringUTF8(long source, int length) {
        byte[] bytes = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[length];
        memcpy(source, bytes, 0, length);
        return new String(bytes, 0, length, UTF_8);
    }

    default String getStringUTF16(long source) {
        return getStringUTF16(source, strlenNT2Checked(source, Integer.MAX_VALUE - 1) >> 1);
    }
    default String getStringUTF16(long source, int length) {
        char[] chars = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_CHAR.get() : new char[length];
        memcpy(source, chars, 0, length);
        return new String(chars, 0, length);
    }

    void putStringASCII(String text, boolean nullTerminated, long target);
    void putStringASCII(CharSequence text, boolean nullTerminated, long target);
    // used by runtime generated bindings (org.lwjgl.system.ffm)
    default int putStringASCII(String text, boolean nullTerminated, long target, int maxLength) {
        int length = memLengthASCII(text, nullTerminated);
        if (maxLength < length) {
            throw new BufferOverflowException();
        }
        putStringASCII(text, nullTerminated, target);
        return length;
    }

    ByteBuffer allocateUTF8(String text, boolean nullTerminated, MemoryAllocator allocator);

    void putStringUTF8(CharSequence text, boolean nullTerminated, long target);
    // also used by runtime generated bindings (org.lwjgl.system.ffm)
    int putStringUTF8(String text, boolean nullTerminated, long target, int maxLength);

    void putStringUTF16(String text, boolean nullTerminated, long target);
    void putStringUTF16(CharSequence text, boolean nullTerminated, long target);
    // used by runtime generated bindings (org.lwjgl.system.ffm)
    default int putStringUTF16(String text, boolean nullTerminated, long target, int maxLength) {
        int length = memLengthUTF16(text, nullTerminated);
        if (maxLength < length) {
            throw new BufferOverflowException();
        }
        putStringUTF16(text, nullTerminated, target);
        return length;
    }

}
