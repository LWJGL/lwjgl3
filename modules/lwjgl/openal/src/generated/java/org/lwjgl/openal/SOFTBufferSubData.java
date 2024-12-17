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

public class SOFTBufferSubData {

    public static final int
        AL_BYTE_RW_OFFSETS_SOFT   = 0x1031,
        AL_SAMPLE_RW_OFFSETS_SOFT = 0x1032;

    protected SOFTBufferSubData() {
        throw new UnsupportedOperationException();
    }

    // --- [ alBufferSubDataSOFT ] ---

    /** {@code void alBufferSubDataSOFT(ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void nalBufferSubDataSOFT(int buffer, int format, long data, int offset, int length) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, offset, length, __functionAddress);
    }

    /** {@code void alBufferSubDataSOFT(ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ByteBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining());
    }

    /** {@code void alBufferSubDataSOFT(ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ShortBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining() << 1);
    }

    /** {@code void alBufferSubDataSOFT(ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") IntBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining() << 2);
    }

    /** {@code void alBufferSubDataSOFT(ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") FloatBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining() << 2);
    }

    // --- [ alBufferSubDataDirectSOFT ] ---

    /** {@code void alBufferSubDataDirectSOFT(ALCcontext * context, ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void nalBufferSubDataDirectSOFT(long context, int buffer, int format, long data, int offset, int length) {
        long __functionAddress = AL.getICD().alBufferSubDataDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, format, data, offset, length, __functionAddress);
    }

    /** {@code void alBufferSubDataDirectSOFT(ALCcontext * context, ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ByteBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataDirectSOFT(context, buffer, format, memAddress(data), offset, data.remaining());
    }

    /** {@code void alBufferSubDataDirectSOFT(ALCcontext * context, ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ShortBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataDirectSOFT(context, buffer, format, memAddress(data), offset, data.remaining() << 1);
    }

    /** {@code void alBufferSubDataDirectSOFT(ALCcontext * context, ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") IntBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataDirectSOFT(context, buffer, format, memAddress(data), offset, data.remaining() << 2);
    }

    /** {@code void alBufferSubDataDirectSOFT(ALCcontext * context, ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") FloatBuffer data, @NativeType("ALsizei") int offset) {
        nalBufferSubDataDirectSOFT(context, buffer, format, memAddress(data), offset, data.remaining() << 2);
    }

    /** {@code void alBufferSubDataSOFT(ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") short[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, offset, data.length << 1, __functionAddress);
    }

    /** {@code void alBufferSubDataSOFT(ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") int[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, offset, data.length << 2, __functionAddress);
    }

    /** {@code void alBufferSubDataSOFT(ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") float[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, format, data, offset, data.length << 2, __functionAddress);
    }

    /** {@code void alBufferSubDataDirectSOFT(ALCcontext * context, ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") short[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, format, data, offset, data.length << 1, __functionAddress);
    }

    /** {@code void alBufferSubDataDirectSOFT(ALCcontext * context, ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") int[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, format, data, offset, data.length << 2, __functionAddress);
    }

    /** {@code void alBufferSubDataDirectSOFT(ALCcontext * context, ALuint buffer, ALenum format, ALvoid const * data, ALsizei offset, ALsizei length)} */
    public static void alBufferSubDataDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALvoid const *") float[] data, @NativeType("ALsizei") int offset) {
        long __functionAddress = AL.getICD().alBufferSubDataDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, format, data, offset, data.length << 2, __functionAddress);
    }

}