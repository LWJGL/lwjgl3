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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_source_latency.txt">SOFT_source_latency</a> extension.
 * 
 * <p>This extension provides a method for applications to more accurately measure the playback latency of sources. Unextended OpenAL allows apps to retrieve
 * a source's playback offset in bytes, samples, or seconds, but this is (typically) where the AL is processing the audio data.</p>
 * 
 * <p>Often, more processing is done outside of the AL. Audio servers are common and they can introduce a bit of latency, increasing the time between when the
 * AL is done with a piece of audio data until it gets heard by the user. If the OpenAL implementation uses its own mixer, that can also add to the
 * latency. This can ultimately cause a not-insignificant delay between where the AL is processing and what is actually being heard.</p>
 * 
 * <p>Although this delay may not be very noticeable for general gaming, if the app is trying to keep a video or animation syncronized with the playback of an
 * OpenAL source this extra delay can cause the audio and video to appear of out sync.</p>
 * 
 * <p>Luckily, most audio systems have a way of measuring the latency it takes for sound to actually get to the physical output device (the DAC or speakers).
 * By providing this information through the AL, an application can more accurately tell what a user is hearing and thus synchronize better with the audio
 * output.</p>
 */
public class SOFTSourceLatency {

    /**
     * The playback position, expressed in fixed-point samples, along with the playback latency, expressed in nanoseconds (1/1000000000ths of a second). This
     * attribute is read-only.
     * 
     * <p>The first value in the returned vector is the sample offset, which is a 32.32 fixed-point value. The whole number is stored in the upper 32 bits and
     * the fractional component is in the lower 32 bits. The value is similar to that returned by {@link AL11#AL_SAMPLE_OFFSET SAMPLE_OFFSET}, just with more precision.</p>
     * 
     * <p>The second value is the latency, in nanoseconds. It represents the length of time it will take for the audio at the current offset to actually reach
     * the speakers or DAC. This value should be considered volatile, as it may change very often during playback (it can depend on a number of factors,
     * including how full the mixing buffer OpenAL may be using is timer jitter, or other changes deeper in the audio pipeline).</p>
     * 
     * <p>The retrieved offset and latency should be considered atomic, with respect to one another. This means the returned latency was measured exactly when
     * the source was at the returned offset.</p>
     */
    public static final int AL_SAMPLE_OFFSET_LATENCY_SOFT = 0x1200;

    /**
     * The playback position, along with the playback latency, both expressed in seconds. This attribute is read-only.
     * 
     * <p>The first value in the returned vector is the offset in seconds. The value is similar to that returned by {@link AL11#AL_SEC_OFFSET SEC_OFFSET}, just with more precision.</p>
     * 
     * <p>The second value is the latency, in seconds. It represents the length of time it will take for the audio at the current offset to actually reach the
     * speakers or DAC. This value should be considered volatile, as it may change very often during playback (it can depend on a number of factors, including
     * how full the mixing buffer OpenAL may be using is, timer jitter, or other changes deeper in the audio pipeline).</p>
     * 
     * <p>The retrieved offset and latency should be considered atomic with respect to one another. This means the returned latency was measured exactly when the
     * source was at the returned offset.</p>
     */
    public static final int AL_SEC_OFFSET_LATENCY_SOFT = 0x1201;

    protected SOFTSourceLatency() {
        throw new UnsupportedOperationException();
    }

    // --- [ alSourcedSOFT ] ---

    /**
     * Sets the double value of a source parameter.
     *
     * @param source the source to modify
     * @param param  the parameter to modify
     * @param value  the parameter value
     */
    @NativeType("ALvoid")
    public static void alSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble") double value) {
        long __functionAddress = AL.getICD().alSourcedSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(source, param, value, __functionAddress);
    }

    // --- [ alSource3dSOFT ] ---

    /**
     * Sets the 3 dimensional double values of a source parameter.
     *
     * @param source the source to modify
     * @param param  the parameter to modify
     * @param value1 the first value
     * @param value2 the second value
     * @param value3 the third value
     */
    @NativeType("ALvoid")
    public static void alSource3dSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble") double value1, @NativeType("ALdouble") double value2, @NativeType("ALdouble") double value3) {
        long __functionAddress = AL.getICD().alSource3dSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(source, param, value1, value2, value3, __functionAddress);
    }

    // --- [ alSourcedvSOFT ] ---

    /** Unsafe version of: {@link #alSourcedvSOFT SourcedvSOFT} */
    public static void nalSourcedvSOFT(int source, int param, long value) {
        long __functionAddress = AL.getICD().alSourcedvSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /**
     * pointer version of {@link #alSourcedSOFT SourcedSOFT}
     *
     * @param source the source to modify
     * @param param  the parameter to modify
     * @param value  the parameter values
     */
    @NativeType("ALvoid")
    public static void alSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble const *") DoubleBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalSourcedvSOFT(source, param, memAddress(value));
    }

    // --- [ alGetSourcedSOFT ] ---

    /** Unsafe version of: {@link #alGetSourcedSOFT GetSourcedSOFT} */
    public static void nalGetSourcedSOFT(int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcedSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /**
     * Gets the double value of a source parameter.
     *
     * @param source the source to query
     * @param param  the parameter to query
     * @param value  the parameter values
     */
    @NativeType("ALvoid")
    public static void alGetSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetSourcedSOFT(source, param, memAddress(value));
    }

    /**
     * Gets the double value of a source parameter.
     *
     * @param source the source to query
     * @param param  the parameter to query
     */
    @NativeType("ALvoid")
    public static double alGetSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer value = stack.callocDouble(1);
            nalGetSourcedSOFT(source, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetSource3dSOFT ] ---

    /** Unsafe version of: {@link #alGetSource3dSOFT GetSource3dSOFT} */
    public static void nalGetSource3dSOFT(int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3dSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    /**
     * Gets the 3 dimensional double values of a source parameter.
     *
     * @param source the source to query
     * @param param  the parameter to query
     * @param value1 the first value
     * @param value2 the second value
     * @param value3 the third value
     */
    @NativeType("ALvoid")
    public static void alGetSource3dSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer value1, @NativeType("ALdouble *") DoubleBuffer value2, @NativeType("ALdouble *") DoubleBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetSource3dSOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetSourcedvSOFT ] ---

    /** Unsafe version of: {@link #alGetSourcedvSOFT GetSourcedvSOFT} */
    public static void nalGetSourcedvSOFT(int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcedvSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /**
     * Array version of {@link #alGetSourcedSOFT GetSourcedSOFT}
     *
     * @param source the source to query
     * @param param  the parameter to query
     * @param values the parameter values
     */
    @NativeType("ALvoid")
    public static void alGetSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetSourcedvSOFT(source, param, memAddress(values));
    }

    // --- [ alSourcei64SOFT ] ---

    /**
     * Sets the 64 bit integer value of a source parameter.
     *
     * @param source the source to modify
     * @param param  the parameter to modify
     * @param value  the parameter values
     */
    @NativeType("ALvoid")
    public static void alSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT") long value) {
        long __functionAddress = AL.getICD().alSourcei64SOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeJV(source, param, value, __functionAddress);
    }

    // --- [ alSource3i64SOFT ] ---

    /**
     * Sets the 3 dimensional 64 bit integer values of a source parameter.
     *
     * @param source the source to modify
     * @param param  the parameter to modify
     * @param value1 the first value
     * @param value2 the second value
     * @param value3 the third value
     */
    @NativeType("ALvoid")
    public static void alSource3i64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT") long value1, @NativeType("ALint64SOFT") long value2, @NativeType("ALint64SOFT") long value3) {
        long __functionAddress = AL.getICD().alSource3i64SOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeJJJV(source, param, value1, value2, value3, __functionAddress);
    }

    // --- [ alSourcei64vSOFT ] ---

    /** Unsafe version of: {@link #alSourcei64vSOFT Sourcei64vSOFT} */
    public static void nalSourcei64vSOFT(int source, int param, long values) {
        long __functionAddress = AL.getICD().alSourcei64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /**
     * Array version of {@link #alSourcei64SOFT Sourcei64SOFT}
     *
     * @param source the source to modify
     * @param param  the parameter to modify
     * @param values the parameter values
     */
    @NativeType("ALvoid")
    public static void alSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT const *") LongBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalSourcei64vSOFT(source, param, memAddress(values));
    }

    // --- [ alGetSourcei64SOFT ] ---

    /** Unsafe version of: {@link #alGetSourcei64SOFT GetSourcei64SOFT} */
    public static void nalGetSourcei64SOFT(int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcei64SOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /**
     * Gets the 64 bit integer value of a source parameter.
     *
     * @param source the source to query
     * @param param  the parameter to query
     * @param value  the parameter values
     */
    @NativeType("ALvoid")
    public static void alGetSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetSourcei64SOFT(source, param, memAddress(value));
    }

    /**
     * Gets the 64 bit integer value of a source parameter.
     *
     * @param source the source to query
     * @param param  the parameter to query
     */
    @NativeType("ALvoid")
    public static long alGetSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer value = stack.callocLong(1);
            nalGetSourcei64SOFT(source, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetSource3i64SOFT ] ---

    /** Unsafe version of: {@link #alGetSource3i64SOFT GetSource3i64SOFT} */
    public static void nalGetSource3i64SOFT(int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3i64SOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    /**
     * Gets the 3 dimensional 64 bit integer values of a source parameter.
     *
     * @param source the source to query
     * @param param  the parameter to query
     * @param value1 the first value
     * @param value2 the second value
     * @param value3 the third value
     */
    @NativeType("ALvoid")
    public static void alGetSource3i64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer value1, @NativeType("ALint64SOFT *") LongBuffer value2, @NativeType("ALint64SOFT *") LongBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetSource3i64SOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetSourcei64vSOFT ] ---

    /** Unsafe version of: {@link #alGetSourcei64vSOFT GetSourcei64vSOFT} */
    public static void nalGetSourcei64vSOFT(int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcei64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /**
     * Array version of {@link #alGetSourcei64SOFT GetSourcei64SOFT}
     *
     * @param source the source to query
     * @param param  the parameter to query
     * @param values the parameter values
     */
    @NativeType("ALvoid")
    public static void alGetSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetSourcei64vSOFT(source, param, memAddress(values));
    }

    /** Array version of: {@link #alSourcedvSOFT SourcedvSOFT} */
    @NativeType("ALvoid")
    public static void alSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble const *") double[] value) {
        long __functionAddress = AL.getICD().alSourcedvSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** Array version of: {@link #alGetSourcedSOFT GetSourcedSOFT} */
    @NativeType("ALvoid")
    public static void alGetSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] value) {
        long __functionAddress = AL.getICD().alGetSourcedSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** Array version of: {@link #alGetSource3dSOFT GetSource3dSOFT} */
    @NativeType("ALvoid")
    public static void alGetSource3dSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] value1, @NativeType("ALdouble *") double[] value2, @NativeType("ALdouble *") double[] value3) {
        long __functionAddress = AL.getICD().alGetSource3dSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    /** Array version of: {@link #alGetSourcedvSOFT GetSourcedvSOFT} */
    @NativeType("ALvoid")
    public static void alGetSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] values) {
        long __functionAddress = AL.getICD().alGetSourcedvSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** Array version of: {@link #alSourcei64vSOFT Sourcei64vSOFT} */
    @NativeType("ALvoid")
    public static void alSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT const *") long[] values) {
        long __functionAddress = AL.getICD().alSourcei64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** Array version of: {@link #alGetSourcei64SOFT GetSourcei64SOFT} */
    @NativeType("ALvoid")
    public static void alGetSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] value) {
        long __functionAddress = AL.getICD().alGetSourcei64SOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** Array version of: {@link #alGetSource3i64SOFT GetSource3i64SOFT} */
    @NativeType("ALvoid")
    public static void alGetSource3i64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] value1, @NativeType("ALint64SOFT *") long[] value2, @NativeType("ALint64SOFT *") long[] value3) {
        long __functionAddress = AL.getICD().alGetSource3i64SOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    /** Array version of: {@link #alGetSourcei64vSOFT GetSourcei64vSOFT} */
    @NativeType("ALvoid")
    public static void alGetSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] values) {
        long __functionAddress = AL.getICD().alGetSourcei64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(source, param, values, __functionAddress);
    }

}