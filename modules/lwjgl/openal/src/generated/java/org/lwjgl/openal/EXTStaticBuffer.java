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

public class EXTStaticBuffer {

    protected EXTStaticBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ alBufferDataStatic ] ---

    /** {@code ALvoid alBufferDataStatic(ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    public static void nalBufferDataStatic(int buffer, int format, long data, int len, int freq) {
        long __functionAddress = AL.getICD().alBufferDataStatic;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, len, freq, __functionAddress);
    }

    /** {@code ALvoid alBufferDataStatic(ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") ByteBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStatic(buffer, format, memAddress(data), data.remaining(), freq);
    }

    /** {@code ALvoid alBufferDataStatic(ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") ShortBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStatic(buffer, format, memAddress(data), data.remaining() << 1, freq);
    }

    /** {@code ALvoid alBufferDataStatic(ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") IntBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStatic(buffer, format, memAddress(data), data.remaining() << 2, freq);
    }

    /** {@code ALvoid alBufferDataStatic(ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") FloatBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStatic(buffer, format, memAddress(data), data.remaining() << 2, freq);
    }

    // --- [ alBufferDataStaticDirect ] ---

    /** {@code ALvoid alBufferDataStaticDirect(ALCcontext * context, ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    public static void nalBufferDataStaticDirect(long context, int buffer, int format, long data, int len, int freq) {
        long __functionAddress = AL.getICD().alBufferDataStaticDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, format, data, len, freq, __functionAddress);
    }

    /** {@code ALvoid alBufferDataStaticDirect(ALCcontext * context, ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStaticDirect(@NativeType("ALCcontext *") long context, @NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") ByteBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStaticDirect(context, buffer, format, memAddress(data), data.remaining(), freq);
    }

    /** {@code ALvoid alBufferDataStaticDirect(ALCcontext * context, ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStaticDirect(@NativeType("ALCcontext *") long context, @NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") ShortBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStaticDirect(context, buffer, format, memAddress(data), data.remaining() << 1, freq);
    }

    /** {@code ALvoid alBufferDataStaticDirect(ALCcontext * context, ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStaticDirect(@NativeType("ALCcontext *") long context, @NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") IntBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStaticDirect(context, buffer, format, memAddress(data), data.remaining() << 2, freq);
    }

    /** {@code ALvoid alBufferDataStaticDirect(ALCcontext * context, ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStaticDirect(@NativeType("ALCcontext *") long context, @NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") FloatBuffer data, @NativeType("ALsizei") int freq) {
        nalBufferDataStaticDirect(context, buffer, format, memAddress(data), data.remaining() << 2, freq);
    }

    /** {@code ALvoid alBufferDataStatic(ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") short[] data, @NativeType("ALsizei") int freq) {
        long __functionAddress = AL.getICD().alBufferDataStatic;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, data.length << 1, freq, __functionAddress);
    }

    /** {@code ALvoid alBufferDataStatic(ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") int[] data, @NativeType("ALsizei") int freq) {
        long __functionAddress = AL.getICD().alBufferDataStatic;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, data.length << 2, freq, __functionAddress);
    }

    /** {@code ALvoid alBufferDataStatic(ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStatic(@NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") float[] data, @NativeType("ALsizei") int freq) {
        long __functionAddress = AL.getICD().alBufferDataStatic;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, data.length << 2, freq, __functionAddress);
    }

    /** {@code ALvoid alBufferDataStaticDirect(ALCcontext * context, ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStaticDirect(@NativeType("ALCcontext *") long context, @NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") short[] data, @NativeType("ALsizei") int freq) {
        long __functionAddress = AL.getICD().alBufferDataStaticDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, format, data, data.length << 1, freq, __functionAddress);
    }

    /** {@code ALvoid alBufferDataStaticDirect(ALCcontext * context, ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStaticDirect(@NativeType("ALCcontext *") long context, @NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") int[] data, @NativeType("ALsizei") int freq) {
        long __functionAddress = AL.getICD().alBufferDataStaticDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, format, data, data.length << 2, freq, __functionAddress);
    }

    /** {@code ALvoid alBufferDataStaticDirect(ALCcontext * context, ALint buffer, ALenum format, ALvoid * data, ALsizei len, ALsizei freq)} */
    @NativeType("ALvoid")
    public static void alBufferDataStaticDirect(@NativeType("ALCcontext *") long context, @NativeType("ALint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid *") float[] data, @NativeType("ALsizei") int freq) {
        long __functionAddress = AL.getICD().alBufferDataStaticDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, format, data, data.length << 2, freq, __functionAddress);
    }

}