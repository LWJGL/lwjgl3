/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the {@code AL_EXT_STATIC_BUFFER} extension.
 * 
 * <p>This extension provides a means for the caller to avoid the overhead associated with the {@link AL10#alBufferData BufferData} call which performs a physical copy of the
 * data provided by the caller to internal buffers. When using the {@code AL_EXT_STATIC_BUFFER} extension, OpenAL's internal buffers use the data pointer provided by
 * the caller for all data access.</p>
 */
public class EXTStaticBuffer {

    protected EXTStaticBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ alBufferDataStatic ] ---

    /**
     * Unsafe version of: {@link #alBufferDataStatic BufferDataStatic}
     *
     * @param len the data buffer size, in bytes
     */
    public static void nalBufferDataStatic(int buffer, int format, long data, int len, int freq) {
        long __functionAddress = AL.getICD().alBufferDataStatic;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, len, freq, __functionAddress);
    }

    /**
     * Sets the sample data of the specified buffer.
     *
     * @param buffer the buffer handle
     * @param format the data format
     * @param data   the sample data
     * @param freq   the data frequency
     */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") ByteBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStatic(buffer, format, memAddress(data), data.remaining(), freq);
    }

    /**
     * Sets the sample data of the specified buffer.
     *
     * @param buffer the buffer handle
     * @param format the data format
     * @param data   the sample data
     * @param freq   the data frequency
     */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") ShortBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStatic(buffer, format, memAddress(data), data.remaining() << 1, freq);
    }

    /**
     * Sets the sample data of the specified buffer.
     *
     * @param buffer the buffer handle
     * @param format the data format
     * @param data   the sample data
     * @param freq   the data frequency
     */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") IntBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStatic(buffer, format, memAddress(data), data.remaining() << 2, freq);
    }

    /**
     * Sets the sample data of the specified buffer.
     *
     * @param buffer the buffer handle
     * @param format the data format
     * @param data   the sample data
     * @param freq   the data frequency
     */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") FloatBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStatic(buffer, format, memAddress(data), data.remaining() << 2, freq);
    }

    /** Array version of: {@link #alBufferDataStatic BufferDataStatic} */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") short[] data, @NativeType("ALsizei") int freq) {
        long __functionAddress = AL.getICD().alBufferDataStatic;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, data.length << 1, freq, __functionAddress);
    }

    /** Array version of: {@link #alBufferDataStatic BufferDataStatic} */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") int[] data, @NativeType("ALsizei") int freq) {
        long __functionAddress = AL.getICD().alBufferDataStatic;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, data.length << 2, freq, __functionAddress);
    }

    /** Array version of: {@link #alBufferDataStatic BufferDataStatic} */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") float[] data, @NativeType("ALsizei") int freq) {
        long __functionAddress = AL.getICD().alBufferDataStatic;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, data.length << 2, freq, __functionAddress);
    }

}