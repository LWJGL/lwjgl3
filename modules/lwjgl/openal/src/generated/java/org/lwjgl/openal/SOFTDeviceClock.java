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
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_device_clock.txt">SOFT_device_clock</a> extension.
 * 
 * <p>This extension allows applications to query the timing clock from the audio device. This clock lets applications measure the passage of time as the
 * audio device sees it, which may be slightly different than the system clock's tick rate (the infamous timer drift).</p>
 * 
 * <p>If the {@link SOFTPauseDevice SOFT_pause_device} extension is available, the device clock does not increment while the device playback is paused. It is
 * implementation-defined whether or not the device clock increments while no contexts are allocated. The initial clock time value of an opened device is
 * also implementation-defined, except that it must not be negative and should be low enough to avoid wrapping during program execution.</p>
 * 
 * <p>Requires {@link SOFTSourceLatency SOFT_source_latency}</p>
 */
public class SOFTDeviceClock {

    /** Accepted as the {@code pname} parameter of {@link #alcGetInteger64vSOFT GetInteger64vSOFT}. */
    public static final int
        ALC_DEVICE_CLOCK_SOFT         = 0x1600,
        ALC_DEVICE_LATENCY_SOFT       = 0x1601,
        ALC_DEVICE_CLOCK_LATENCY_SOFT = 0x1602;

    /**
     * Accepted as the {@code param} parameter of {@link SOFTSourceLatency#alGetSourcei64vSOFT GetSourcei64vSOFT}.
     * 
     * <p>Returns the playback position, expressed in fixed-point samples, along with the device clock, expressed in nanoseconds. This attribute is read-only.</p>
     * 
     * <p>The first value in the returned vector is the sample offset, which is a 32.32 fixed-point value. The whole number is stored in the upper 32 bits and
     * the fractional component is in the lower 32 bits. The value is similar to that returned by {@link AL11#AL_SAMPLE_OFFSET SAMPLE_OFFSET}, just with more precision.</p>
     * 
     * <p>The second value is the device clock, in nanoseconds. This updates at the same rate as the offset, and both are measured atomically with respect to one
     * another.</p>
     */
    public static final int AL_SAMPLE_OFFSET_CLOCK_SOFT = 0x1202;

    /**
     * Accepted as the {@code param} parameter of {@link SOFTSourceLatency#alGetSourcedvSOFT GetSourcedvSOFT}.
     * 
     * <p>Returns the playback position, along with the device clock, both expressed in seconds. This attribute is read-only.</p>
     * 
     * <p>The first value in the returned vector is the offset in seconds. The value is similar to that returned by {@link AL11#AL_SEC_OFFSET SEC_OFFSET}, just with more precision.</p>
     * 
     * <p>The second value is the device clock, in seconds. This updates at the same rate as the offset, and both are measured atomically with respect to one
     * another. Be aware that this value may be subtly different from the other device clock queries due to the variable precision of floating-point values.</p>
     */
    public static final int AL_SEC_OFFSET_CLOCK_SOFT = 0x1203;

    protected SOFTDeviceClock() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcGetInteger64vSOFT ] ---

    /** Unsafe version of: {@link #alcGetInteger64vSOFT GetInteger64vSOFT} */
    public static void nalcGetInteger64vSOFT(long device, int pname, int size, long values) {
		long __functionAddress = ALC.getICD().alcGetInteger64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(device, pname, size, values, __functionAddress);
    }

    /**
     * Accepts all the same {@link AL10#alGetIntegerv GetIntegerv} queries, in addition to some new ones.
     * 
     * <p>Note that the size parameter is the number of {@code ALCint64SOFT} elements in the buffer provided, not the number of bytes.</p>
     *
     * @param pname <table class=striped>
     *              <tr><td>{@link #ALC_DEVICE_CLOCK_SOFT DEVICE_CLOCK_SOFT}</td><td>The audio device clock time, expressed in nanoseconds. {@code NULL} is an invalid device.</td></tr>
     *              <tr><td>{@link #ALC_DEVICE_LATENCY_SOFT DEVICE_LATENCY_SOFT}</td><td>The current audio device latency, in nanoseconds. This is effectively the delay for the samples rendered at the the device's current
     *              clock time fromreaching the physical output. {@code NULL} is an invalid device.</td></tr>
     *              <tr><td>{@link #ALC_DEVICE_CLOCK_LATENCY_SOFT DEVICE_CLOCK_LATENCY_SOFT}</td><td>Expects a destination size of 2, and provides both the audio device clock time and latency, both in nanoseconds. The two values are
     *              measured atomically with respect to one another (i.e. the latency value was measured at the same time the device clock value was
     *              retrieved). {@code NULL} is an invalid device.</td></tr>
     *              </table>
     */
    @NativeType("ALCvoid")
    public static void alcGetInteger64vSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCenum") int pname, @NativeType("ALCint64SOFT *") LongBuffer values) {
        nalcGetInteger64vSOFT(device, pname, values.remaining(), memAddress(values));
    }

    /**
     * Accepts all the same {@link AL10#alGetIntegerv GetIntegerv} queries, in addition to some new ones.
     * 
     * <p>Note that the size parameter is the number of {@code ALCint64SOFT} elements in the buffer provided, not the number of bytes.</p>
     *
     * @param pname <table class=striped>
     *              <tr><td>{@link #ALC_DEVICE_CLOCK_SOFT DEVICE_CLOCK_SOFT}</td><td>The audio device clock time, expressed in nanoseconds. {@code NULL} is an invalid device.</td></tr>
     *              <tr><td>{@link #ALC_DEVICE_LATENCY_SOFT DEVICE_LATENCY_SOFT}</td><td>The current audio device latency, in nanoseconds. This is effectively the delay for the samples rendered at the the device's current
     *              clock time fromreaching the physical output. {@code NULL} is an invalid device.</td></tr>
     *              <tr><td>{@link #ALC_DEVICE_CLOCK_LATENCY_SOFT DEVICE_CLOCK_LATENCY_SOFT}</td><td>Expects a destination size of 2, and provides both the audio device clock time and latency, both in nanoseconds. The two values are
     *              measured atomically with respect to one another (i.e. the latency value was measured at the same time the device clock value was
     *              retrieved). {@code NULL} is an invalid device.</td></tr>
     *              </table>
     */
    @NativeType("ALCvoid")
    public static long alcGetInteger64vSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer values = stack.callocLong(1);
            nalcGetInteger64vSOFT(device, pname, 1, memAddress(values));
            return values.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #alcGetInteger64vSOFT GetInteger64vSOFT} */
    @NativeType("ALCvoid")
    public static void alcGetInteger64vSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCenum") int pname, @NativeType("ALCint64SOFT *") long[] values) {
		long __functionAddress = ALC.getICD().alcGetInteger64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(device, pname, values.length, values, __functionAddress);
    }

}