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

/** Native bindings to AL 1.1 functionality. */
public class AL11 extends AL10 {

    /** General tokens. */
    public static final int
        AL_SEC_OFFSET                = 0x1024,
        AL_SAMPLE_OFFSET             = 0x1025,
        AL_BYTE_OFFSET               = 0x1026,
        AL_STATIC                    = 0x1028,
        AL_STREAMING                 = 0x1029,
        AL_UNDETERMINED              = 0x1030,
        AL_ILLEGAL_COMMAND           = 0xA004,
        AL_SPEED_OF_SOUND            = 0xC003,
        AL_LINEAR_DISTANCE           = 0xD003,
        AL_LINEAR_DISTANCE_CLAMPED   = 0xD004,
        AL_EXPONENT_DISTANCE         = 0xD005,
        AL_EXPONENT_DISTANCE_CLAMPED = 0xD006;

    protected AL11() {
        throw new UnsupportedOperationException();
    }

    // --- [ alListener3i ] ---

    /**
     * Sets the 3 dimensional integer values of a listener parameter.
     *
     * @param paramName the parameter to modify
     * @param value1    the first value
     * @param value2    the second value
     * @param value3    the third value
     */
    @NativeType("ALvoid")
    public static void alListener3i(@NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alListener3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(paramName, value1, value2, value3, __functionAddress);
    }

    // --- [ alGetListeneriv ] ---

    /** Unsafe version of: {@link #alGetListeneriv GetListeneriv} */
    public static void nalGetListeneriv(int param, long values) {
        long __functionAddress = AL.getICD().alGetListeneriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(param, values, __functionAddress);
    }

    /**
     * Returns the integer values of the specified listener parameter.
     *
     * @param param  the parameter to query
     * @param values the parameter values
     */
    @NativeType("ALvoid")
    public static void alGetListeneriv(@NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetListeneriv(param, memAddress(values));
    }

    // --- [ alSource3i ] ---

    /**
     * Sets the 3 dimensional integer values of a source parameter.
     *
     * @param source    the source to modify
     * @param paramName the parameter to modify
     * @param value1    the first value
     * @param value2    the second value
     * @param value3    the third value
     */
    @NativeType("ALvoid")
    public static void alSource3i(@NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alSource3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(source, paramName, value1, value2, value3, __functionAddress);
    }

    // --- [ alListeneriv ] ---

    /** Unsafe version of: {@link #alListeneriv Listeneriv} */
    public static void nalListeneriv(int listener, long value) {
        long __functionAddress = AL.getICD().alListeneriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(listener, value, __functionAddress);
    }

    /**
     * Pointer version.
     *
     * @param listener the parameter to modify
     * @param value    the parameter values
     */
    @NativeType("ALvoid")
    public static void alListeneriv(@NativeType("ALenum") int listener, @NativeType("ALint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalListeneriv(listener, memAddress(value));
    }

    // --- [ alSourceiv ] ---

    /** Unsafe version of: {@link #alSourceiv Sourceiv} */
    public static void nalSourceiv(int source, int paramName, long value) {
        long __functionAddress = AL.getICD().alSourceiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, paramName, value, __functionAddress);
    }

    /**
     * Pointer version.
     *
     * @param source    the source to modify
     * @param paramName the parameter to modify
     * @param value     the parameter values
     */
    @NativeType("ALvoid")
    public static void alSourceiv(@NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalSourceiv(source, paramName, memAddress(value));
    }

    // --- [ alBufferf ] ---

    /**
     * Sets the float value of a buffer parameter.
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the value
     */
    @NativeType("ALvoid")
    public static void alBufferf(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alBufferf;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(buffer, paramName, value, __functionAddress);
    }

    // --- [ alBuffer3f ] ---

    /**
     * Sets the dimensional value of a buffer parameter.
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value1    the first value
     * @param value2    the second value
     * @param value3    the third value
     */
    @NativeType("ALvoid")
    public static void alBuffer3f(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat") float value1, @NativeType("ALfloat") float value2, @NativeType("ALfloat") float value3) {
        long __functionAddress = AL.getICD().alBuffer3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(buffer, paramName, value1, value2, value3, __functionAddress);
    }

    // --- [ alBufferfv ] ---

    /** Unsafe version of: {@link #alBufferfv Bufferfv} */
    public static void nalBufferfv(int buffer, int paramName, long value) {
        long __functionAddress = AL.getICD().alBufferfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, paramName, value, __functionAddress);
    }

    /**
     * the pointer version of {@link #alBufferf Bufferf}
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the parameter values
     */
    @NativeType("ALvoid")
    public static void alBufferfv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat const *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalBufferfv(buffer, paramName, memAddress(value));
    }

    // --- [ alBufferi ] ---

    /**
     * Sets the integer value of a buffer parameter.
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the value
     */
    @NativeType("ALvoid")
    public static void alBufferi(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alBufferi;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(buffer, paramName, value, __functionAddress);
    }

    // --- [ alBuffer3i ] ---

    /**
     * Sets the integer 3 dimensional value of a buffer parameter.
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value1    the first value
     * @param value2    the second value
     * @param value3    the third value
     */
    @NativeType("ALvoid")
    public static void alBuffer3i(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alBuffer3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(buffer, paramName, value1, value2, value3, __functionAddress);
    }

    // --- [ alBufferiv ] ---

    /** Unsafe version of: {@link #alBufferiv Bufferiv} */
    public static void nalBufferiv(int buffer, int paramName, long value) {
        long __functionAddress = AL.getICD().alBufferiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, paramName, value, __functionAddress);
    }

    /**
     * the pointer version of {@link #alBufferi Bufferi}
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the parameter values
     */
    @NativeType("ALvoid")
    public static void alBufferiv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalBufferiv(buffer, paramName, memAddress(value));
    }

    // --- [ alGetBufferiv ] ---

    /** Unsafe version of: {@link #alGetBufferiv GetBufferiv} */
    public static void nalGetBufferiv(int buffer, int param, long values) {
        long __functionAddress = AL.getICD().alGetBufferiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, param, values, __functionAddress);
    }

    /**
     * Returns the integer values of the specified buffer parameter.
     *
     * @param buffer the buffer to query
     * @param param  the parameter to query
     * @param values the parameter values
     */
    @NativeType("ALvoid")
    public static void alGetBufferiv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetBufferiv(buffer, param, memAddress(values));
    }

    // --- [ alGetBufferfv ] ---

    /** Unsafe version of: {@link #alGetBufferfv GetBufferfv} */
    public static void nalGetBufferfv(int buffer, int param, long values) {
        long __functionAddress = AL.getICD().alGetBufferfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, param, values, __functionAddress);
    }

    /**
     * Returns the float values of the specified buffer parameter.
     *
     * @param buffer the buffer to query
     * @param param  the parameter to query
     * @param values the parameter values
     */
    @NativeType("ALvoid")
    public static void alGetBufferfv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetBufferfv(buffer, param, memAddress(values));
    }

    // --- [ alSpeedOfSound ] ---

    /**
     * Sets the speed of sound.
     *
     * @param value the speed of sound
     */
    @NativeType("ALvoid")
    public static void alSpeedOfSound(@NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alSpeedOfSound;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(value, __functionAddress);
    }

    /** Array version of: {@link #alGetListeneriv GetListeneriv} */
    @NativeType("ALvoid")
    public static void alGetListeneriv(@NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetListeneriv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(param, values, __functionAddress);
    }

    /** Array version of: {@link #alListeneriv Listeneriv} */
    @NativeType("ALvoid")
    public static void alListeneriv(@NativeType("ALenum") int listener, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alListeneriv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(listener, value, __functionAddress);
    }

    /** Array version of: {@link #alSourceiv Sourceiv} */
    @NativeType("ALvoid")
    public static void alSourceiv(@NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alSourceiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(source, paramName, value, __functionAddress);
    }

    /** Array version of: {@link #alBufferfv Bufferfv} */
    @NativeType("ALvoid")
    public static void alBufferfv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat const *") float[] value) {
        long __functionAddress = AL.getICD().alBufferfv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(buffer, paramName, value, __functionAddress);
    }

    /** Array version of: {@link #alBufferiv Bufferiv} */
    @NativeType("ALvoid")
    public static void alBufferiv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alBufferiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(buffer, paramName, value, __functionAddress);
    }

    /** Array version of: {@link #alGetBufferiv GetBufferiv} */
    @NativeType("ALvoid")
    public static void alGetBufferiv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetBufferiv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(buffer, param, values, __functionAddress);
    }

    /** Array version of: {@link #alGetBufferfv GetBufferfv} */
    @NativeType("ALvoid")
    public static void alGetBufferfv(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetBufferfv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(buffer, param, values, __functionAddress);
    }

}