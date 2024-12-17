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

public class SOFTBufferSamples {

    public static final int
        AL_MONO8_SOFT       = 0x1100,
        AL_MONO16_SOFT      = 0x1101,
        AL_MONO32F_SOFT     = 0x10010,
        AL_STEREO8_SOFT     = 0x1102,
        AL_STEREO16_SOFT    = 0x1103,
        AL_STEREO32F_SOFT   = 0x10011,
        AL_QUAD8_SOFT       = 0x1204,
        AL_QUAD16_SOFT      = 0x1205,
        AL_QUAD32F_SOFT     = 0x1206,
        AL_REAR8_SOFT       = 0x1207,
        AL_REAR16_SOFT      = 0x1208,
        AL_REAR32F_SOFT     = 0x1209,
        AL_5POINT1_8_SOFT   = 0x120A,
        AL_5POINT1_16_SOFT  = 0x120B,
        AL_5POINT1_32F_SOFT = 0x120C,
        AL_6POINT1_8_SOFT   = 0x120D,
        AL_6POINT1_16_SOFT  = 0x120E,
        AL_6POINT1_32F_SOFT = 0x120F,
        AL_7POINT1_8_SOFT   = 0x1210,
        AL_7POINT1_16_SOFT  = 0x1211,
        AL_7POINT1_32F_SOFT = 0x1212;

    public static final int
        AL_MONO_SOFT    = 0x1500,
        AL_STEREO_SOFT  = 0x1501,
        AL_QUAD_SOFT    = 0x1502,
        AL_REAR_SOFT    = 0x1503,
        AL_5POINT1_SOFT = 0x1504,
        AL_6POINT1_SOFT = 0x1505,
        AL_7POINT1_SOFT = 0x1506;

    public static final int
        AL_BYTE_SOFT           = 0x1400,
        AL_UNSIGNED_BYTE_SOFT  = 0x1401,
        AL_SHORT_SOFT          = 0x1402,
        AL_UNSIGNED_SHORT_SOFT = 0x1403,
        AL_INT_SOFT            = 0x1404,
        AL_UNSIGNED_INT_SOFT   = 0x1405,
        AL_FLOAT_SOFT          = 0x1406,
        AL_DOUBLE_SOFT         = 0x1407,
        AL_BYTE3_SOFT          = 0x1408,
        AL_UNSIGNED_BYTE3_SOFT = 0x1409;

    public static final int
        AL_INTERNAL_FORMAT_SOFT = 0x2008,
        AL_BYTE_LENGTH_SOFT     = 0x2009,
        AL_SAMPLE_LENGTH_SOFT   = 0x200A;

    public static final int AL_SEC_LENGTH_SOFT = 0x200B;

    public static final int
        AL_BYTE_RW_OFFSETS_SOFT   = 0x1031,
        AL_SAMPLE_RW_OFFSETS_SOFT = 0x1032;

    protected SOFTBufferSamples() {
        throw new UnsupportedOperationException();
    }

    // --- [ alBufferSamplesSOFT ] ---

    /** {@code void alBufferSamplesSOFT(ALuint buffer, ALuint samplerate, ALenum internalformat, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void nalBufferSamplesSOFT(int buffer, int samplerate, int internalformat, int samples, int channels, int type, long data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alBufferSamplesSOFT(ALuint buffer, ALuint samplerate, ALenum internalformat, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ByteBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
    }

    /** {@code void alBufferSamplesSOFT(ALuint buffer, ALuint samplerate, ALenum internalformat, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ShortBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
    }

    /** {@code void alBufferSamplesSOFT(ALuint buffer, ALuint samplerate, ALenum internalformat, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") IntBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
    }

    /** {@code void alBufferSamplesSOFT(ALuint buffer, ALuint samplerate, ALenum internalformat, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") FloatBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
    }

    /** {@code void alBufferSamplesSOFT(ALuint buffer, ALuint samplerate, ALenum internalformat, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") DoubleBuffer data) {
        nalBufferSamplesSOFT(buffer, samplerate, internalformat, samples, channels, type, memAddress(data));
    }

    // --- [ alBufferSubSamplesSOFT ] ---

    /** {@code void alBufferSubSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void nalBufferSubSamplesSOFT(int buffer, int offset, int samples, int channels, int type, long data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alBufferSubSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ByteBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /** {@code void alBufferSubSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") ShortBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /** {@code void alBufferSubSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") IntBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /** {@code void alBufferSubSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") FloatBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /** {@code void alBufferSubSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") DoubleBuffer data) {
        nalBufferSubSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    // --- [ alGetBufferSamplesSOFT ] ---

    /** {@code void alGetBufferSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid * data)} */
    public static void nalGetBufferSamplesSOFT(int buffer, int offset, int samples, int channels, int type, long data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alGetBufferSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid * data)} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") ByteBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /** {@code void alGetBufferSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid * data)} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") ShortBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /** {@code void alGetBufferSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid * data)} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") IntBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /** {@code void alGetBufferSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid * data)} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") FloatBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    /** {@code void alGetBufferSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid * data)} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") DoubleBuffer data) {
        nalGetBufferSamplesSOFT(buffer, offset, samples, channels, type, memAddress(data));
    }

    // --- [ alIsBufferFormatSupportedSOFT ] ---

    /** {@code ALboolean alIsBufferFormatSupportedSOFT(ALenum format)} */
    @NativeType("ALboolean")
    public static boolean alIsBufferFormatSupportedSOFT(@NativeType("ALenum") int format) {
        long __functionAddress = AL.getICD().alIsBufferFormatSupportedSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeZ(format, __functionAddress);
    }

    /** {@code void alBufferSamplesSOFT(ALuint buffer, ALuint samplerate, ALenum internalformat, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") short[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alBufferSamplesSOFT(ALuint buffer, ALuint samplerate, ALenum internalformat, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") int[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alBufferSamplesSOFT(ALuint buffer, ALuint samplerate, ALenum internalformat, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") float[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alBufferSamplesSOFT(ALuint buffer, ALuint samplerate, ALenum internalformat, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALuint") int samplerate, @NativeType("ALenum") int internalformat, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") double[] data) {
        long __functionAddress = AL.getICD().alBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, samplerate, internalformat, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alBufferSubSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") short[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alBufferSubSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") int[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alBufferSubSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") float[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alBufferSubSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid const * data)} */
    public static void alBufferSubSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid const *") double[] data) {
        long __functionAddress = AL.getICD().alBufferSubSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alGetBufferSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid * data)} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") short[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alGetBufferSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid * data)} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") int[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alGetBufferSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid * data)} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") float[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

    /** {@code void alGetBufferSamplesSOFT(ALuint buffer, ALsizei offset, ALsizei samples, ALenum channels, ALenum type, ALvoid * data)} */
    public static void alGetBufferSamplesSOFT(@NativeType("ALuint") int buffer, @NativeType("ALsizei") int offset, @NativeType("ALsizei") int samples, @NativeType("ALenum") int channels, @NativeType("ALenum") int type, @NativeType("ALvoid *") double[] data) {
        long __functionAddress = AL.getICD().alGetBufferSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, offset, samples, channels, type, data, __functionAddress);
    }

}