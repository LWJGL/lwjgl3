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

    // --- [ alListener3iDirect ] ---

    /**
     * Sets the 3 dimensional integer values of a listener parameter.
     *
     * @param paramName the parameter to modify
     * @param value1    the first value
     * @param value2    the second value
     * @param value3    the third value
     */
    @NativeType("ALvoid")
    public static void alListener3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alListener3iDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, paramName, value1, value2, value3, __functionAddress);
    }

    // --- [ alGetListener3i ] ---

    public static void nalGetListener3i(int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetListener3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetListener3i(@NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetListener3i(param, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetListener3iDirect ] ---

    public static void nalGetListener3iDirect(long context, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetListener3iDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPPV(context, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetListener3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetListener3iDirect(context, param, memAddress(value1), memAddress(value2), memAddress(value3));
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

    // --- [ alGetListenerivDirect ] ---

    /** Unsafe version of: {@link #alGetListenerivDirect} */
    public static void nalGetListenerivDirect(long context, int param, long values) {
        long __functionAddress = AL.getICD().alGetListenerivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, param, values, __functionAddress);
    }

    /**
     * Returns the integer values of the specified listener parameter.
     *
     * @param param  the parameter to query
     * @param values the parameter values
     */
    @NativeType("ALvoid")
    public static void alGetListenerivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetListenerivDirect(context, param, memAddress(values));
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

    // --- [ alSource3iDirect ] ---

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
    public static void alSource3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alSource3iDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, source, paramName, value1, value2, value3, __functionAddress);
    }

    // --- [ alGetSource3i ] ---

    public static void nalGetSource3i(int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3i(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetSource3i(source, param, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetSource3iDirect ] ---

    public static void nalGetSource3iDirect(long context, int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3iDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPPV(context, source, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetSource3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetSource3iDirect(context, source, param, memAddress(value1), memAddress(value2), memAddress(value3));
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

    // --- [ alListenerivDirect ] ---

    /** Unsafe version of: {@link #alListenerivDirect} */
    public static void nalListenerivDirect(long context, int listener, long value) {
        long __functionAddress = AL.getICD().alListenerivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, listener, value, __functionAddress);
    }

    /**
     * Pointer version.
     *
     * @param listener the parameter to modify
     * @param value    the parameter values
     */
    @NativeType("ALvoid")
    public static void alListenerivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int listener, @NativeType("ALint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalListenerivDirect(context, listener, memAddress(value));
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

    // --- [ alSourceivDirect ] ---

    /** Unsafe version of: {@link #alSourceivDirect} */
    public static void nalSourceivDirect(long context, int source, int paramName, long value) {
        long __functionAddress = AL.getICD().alSourceivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, paramName, value, __functionAddress);
    }

    /**
     * Pointer version.
     *
     * @param source    the source to modify
     * @param paramName the parameter to modify
     * @param value     the parameter values
     */
    @NativeType("ALvoid")
    public static void alSourceivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalSourceivDirect(context, source, paramName, memAddress(value));
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

    // --- [ alBufferfDirect ] ---

    /**
     * Sets the float value of a buffer parameter.
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the value
     */
    @NativeType("ALvoid")
    public static void alBufferfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alBufferfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, buffer, paramName, value, __functionAddress);
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

    // --- [ alBuffer3fDirect ] ---

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
    public static void alBuffer3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat") float value1, @NativeType("ALfloat") float value2, @NativeType("ALfloat") float value3) {
        long __functionAddress = AL.getICD().alBuffer3fDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, buffer, paramName, value1, value2, value3, __functionAddress);
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

    // --- [ alBufferfvDirect ] ---

    /** Unsafe version of: {@link #alBufferfvDirect} */
    public static void nalBufferfvDirect(long context, int buffer, int paramName, long value) {
        long __functionAddress = AL.getICD().alBufferfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, paramName, value, __functionAddress);
    }

    /**
     * the pointer version of {@link #alBufferf Bufferf}
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the parameter values
     */
    @NativeType("ALvoid")
    public static void alBufferfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat const *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalBufferfvDirect(context, buffer, paramName, memAddress(value));
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

    // --- [ alBufferiDirect ] ---

    /**
     * Sets the integer value of a buffer parameter.
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the value
     */
    @NativeType("ALvoid")
    public static void alBufferiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alBufferiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, buffer, paramName, value, __functionAddress);
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

    // --- [ alBuffer3iDirect ] ---

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
    public static void alBuffer3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint") int value1, @NativeType("ALint") int value2, @NativeType("ALint") int value3) {
        long __functionAddress = AL.getICD().alBuffer3iDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, buffer, paramName, value1, value2, value3, __functionAddress);
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

    // --- [ alBufferivDirect ] ---

    /** Unsafe version of: {@link #alBufferivDirect} */
    public static void nalBufferivDirect(long context, int buffer, int paramName, long value) {
        long __functionAddress = AL.getICD().alBufferivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, paramName, value, __functionAddress);
    }

    /**
     * the pointer version of {@link #alBufferi Bufferi}
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the parameter values
     */
    @NativeType("ALvoid")
    public static void alBufferivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalBufferivDirect(context, buffer, paramName, memAddress(value));
    }

    // --- [ alGetBuffer3i ] ---

    public static void nalGetBuffer3i(int buffer, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetBuffer3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3i(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetBuffer3i(buffer, param, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetBuffer3iDirect ] ---

    public static void nalGetBuffer3iDirect(long context, int buffer, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetBuffer3iDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPPV(context, buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value1, @NativeType("ALint *") IntBuffer value2, @NativeType("ALint *") IntBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetBuffer3iDirect(context, buffer, param, memAddress(value1), memAddress(value2), memAddress(value3));
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

    // --- [ alGetBufferivDirect ] ---

    /** Unsafe version of: {@link #alGetBufferivDirect} */
    public static void nalGetBufferivDirect(long context, int buffer, int param, long values) {
        long __functionAddress = AL.getICD().alGetBufferivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, param, values, __functionAddress);
    }

    /**
     * Returns the integer values of the specified buffer parameter.
     *
     * @param buffer the buffer to query
     * @param param  the parameter to query
     * @param values the parameter values
     */
    @NativeType("ALvoid")
    public static void alGetBufferivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetBufferivDirect(context, buffer, param, memAddress(values));
    }

    // --- [ alGetBuffer3f ] ---

    public static void nalGetBuffer3f(int buffer, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetBuffer3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3f(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value1, @NativeType("ALfloat *") FloatBuffer value2, @NativeType("ALfloat *") FloatBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetBuffer3f(buffer, param, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetBuffer3fDirect ] ---

    public static void nalGetBuffer3fDirect(long context, int buffer, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetBuffer3fDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPPV(context, buffer, param, value1, value2, value3, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetBuffer3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value1, @NativeType("ALfloat *") FloatBuffer value2, @NativeType("ALfloat *") FloatBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetBuffer3fDirect(context, buffer, param, memAddress(value1), memAddress(value2), memAddress(value3));
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

    // --- [ alGetBufferfvDirect ] ---

    /** Unsafe version of: {@link #alGetBufferfvDirect} */
    public static void nalGetBufferfvDirect(long context, int buffer, int param, long values) {
        long __functionAddress = AL.getICD().alGetBufferfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, param, values, __functionAddress);
    }

    /**
     * Returns the float values of the specified buffer parameter.
     *
     * @param buffer the buffer to query
     * @param param  the parameter to query
     * @param values the parameter values
     */
    @NativeType("ALvoid")
    public static void alGetBufferfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetBufferfvDirect(context, buffer, param, memAddress(values));
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

    // --- [ alSpeedOfSoundDirect ] ---

    /**
     * Sets the speed of sound.
     *
     * @param value the speed of sound
     */
    @NativeType("ALvoid")
    public static void alSpeedOfSoundDirect(@NativeType("ALCcontext *") long context, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alSpeedOfSoundDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, value, __functionAddress);
    }

    /** Array version of: {@link #alGetListener3i GetListener3i} */
    @NativeType("ALvoid")
    public static void alGetListener3i(@NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetListener3i;
        if (CHECKS) {
            check(__functionAddress);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPV(param, value1, value2, value3, __functionAddress);
    }

    /** Array version of: {@link #alGetListener3iDirect} */
    @NativeType("ALvoid")
    public static void alGetListener3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetListener3iDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPPV(context, param, value1, value2, value3, __functionAddress);
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

    /** Array version of: {@link #alGetListenerivDirect} */
    @NativeType("ALvoid")
    public static void alGetListenerivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetListenerivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, param, values, __functionAddress);
    }

    /** Array version of: {@link #alGetSource3i GetSource3i} */
    @NativeType("ALvoid")
    public static void alGetSource3i(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetSource3i;
        if (CHECKS) {
            check(__functionAddress);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    /** Array version of: {@link #alGetSource3iDirect} */
    @NativeType("ALvoid")
    public static void alGetSource3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetSource3iDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPPV(context, source, param, value1, value2, value3, __functionAddress);
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

    /** Array version of: {@link #alListenerivDirect} */
    @NativeType("ALvoid")
    public static void alListenerivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int listener, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alListenerivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, listener, value, __functionAddress);
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

    /** Array version of: {@link #alSourceivDirect} */
    @NativeType("ALvoid")
    public static void alSourceivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int paramName, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alSourceivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, source, paramName, value, __functionAddress);
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

    /** Array version of: {@link #alBufferfvDirect} */
    @NativeType("ALvoid")
    public static void alBufferfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALfloat const *") float[] value) {
        long __functionAddress = AL.getICD().alBufferfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, buffer, paramName, value, __functionAddress);
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

    /** Array version of: {@link #alBufferivDirect} */
    @NativeType("ALvoid")
    public static void alBufferivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int paramName, @NativeType("ALint const *") int[] value) {
        long __functionAddress = AL.getICD().alBufferivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, buffer, paramName, value, __functionAddress);
    }

    /** Array version of: {@link #alGetBuffer3i GetBuffer3i} */
    @NativeType("ALvoid")
    public static void alGetBuffer3i(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetBuffer3i;
        if (CHECKS) {
            check(__functionAddress);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPV(buffer, param, value1, value2, value3, __functionAddress);
    }

    /** Array version of: {@link #alGetBuffer3iDirect} */
    @NativeType("ALvoid")
    public static void alGetBuffer3iDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value1, @NativeType("ALint *") int[] value2, @NativeType("ALint *") int[] value3) {
        long __functionAddress = AL.getICD().alGetBuffer3iDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPPV(context, buffer, param, value1, value2, value3, __functionAddress);
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

    /** Array version of: {@link #alGetBufferivDirect} */
    @NativeType("ALvoid")
    public static void alGetBufferivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetBufferivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, buffer, param, values, __functionAddress);
    }

    /** Array version of: {@link #alGetBuffer3f GetBuffer3f} */
    @NativeType("ALvoid")
    public static void alGetBuffer3f(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value1, @NativeType("ALfloat *") float[] value2, @NativeType("ALfloat *") float[] value3) {
        long __functionAddress = AL.getICD().alGetBuffer3f;
        if (CHECKS) {
            check(__functionAddress);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPV(buffer, param, value1, value2, value3, __functionAddress);
    }

    /** Array version of: {@link #alGetBuffer3fDirect} */
    @NativeType("ALvoid")
    public static void alGetBuffer3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value1, @NativeType("ALfloat *") float[] value2, @NativeType("ALfloat *") float[] value3) {
        long __functionAddress = AL.getICD().alGetBuffer3fDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPPV(context, buffer, param, value1, value2, value3, __functionAddress);
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

    /** Array version of: {@link #alGetBufferfvDirect} */
    @NativeType("ALvoid")
    public static void alGetBufferfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetBufferfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, buffer, param, values, __functionAddress);
    }

}