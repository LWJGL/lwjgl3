/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ALC11 extends ALC10 {

    public static final int
        ALC_MONO_SOURCES   = 0x1010,
        ALC_STEREO_SOURCES = 0x1011;

    public static final int
        ALC_DEFAULT_ALL_DEVICES_SPECIFIER    = 0x1012,
        ALC_ALL_DEVICES_SPECIFIER            = 0x1013,
        ALC_CAPTURE_DEVICE_SPECIFIER         = 0x310,
        ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;

    public static final int ALC_CAPTURE_SAMPLES = 0x312;

    protected ALC11() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcCaptureOpenDevice ] ---

    /** {@code ALCdevice * alcCaptureOpenDevice(ALCchar const * deviceName, ALCuint frequency, ALCenum format, ALCsizei samples)} */
    public static long nalcCaptureOpenDevice(long deviceName, int frequency, int format, int samples) {
		long __functionAddress = ALC.getICD().alcCaptureOpenDevice;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(deviceName, frequency, format, samples, __functionAddress);
    }

    /** {@code ALCdevice * alcCaptureOpenDevice(ALCchar const * deviceName, ALCuint frequency, ALCenum format, ALCsizei samples)} */
    @NativeType("ALCdevice *")
    public static long alcCaptureOpenDevice(@NativeType("ALCchar const *") @Nullable ByteBuffer deviceName, @NativeType("ALCuint") int frequency, @NativeType("ALCenum") int format, @NativeType("ALCsizei") int samples) {
        if (CHECKS) {
            checkNT1Safe(deviceName);
        }
        return nalcCaptureOpenDevice(memAddressSafe(deviceName), frequency, format, samples);
    }

    /** {@code ALCdevice * alcCaptureOpenDevice(ALCchar const * deviceName, ALCuint frequency, ALCenum format, ALCsizei samples)} */
    @NativeType("ALCdevice *")
    public static long alcCaptureOpenDevice(@NativeType("ALCchar const *") @Nullable CharSequence deviceName, @NativeType("ALCuint") int frequency, @NativeType("ALCenum") int format, @NativeType("ALCsizei") int samples) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(deviceName, true);
            long deviceNameEncoded = deviceName == null ? NULL : stack.getPointerAddress();
            return nalcCaptureOpenDevice(deviceNameEncoded, frequency, format, samples);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alcCaptureCloseDevice ] ---

    /** {@code ALCboolean alcCaptureCloseDevice(ALCdevice * device)} */
    @NativeType("ALCboolean")
    public static boolean alcCaptureCloseDevice(@NativeType("ALCdevice *") long device) {
		long __functionAddress = ALC.getICD().alcCaptureCloseDevice;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return invokePZ(device, __functionAddress);
    }

    // --- [ alcCaptureStart ] ---

    /** {@code ALCvoid alcCaptureStart(ALCdevice * device)} */
    @NativeType("ALCvoid")
    public static void alcCaptureStart(@NativeType("ALCdevice *") long device) {
		long __functionAddress = ALC.getICD().alcCaptureStart;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePV(device, __functionAddress);
    }

    // --- [ alcCaptureStop ] ---

    /** {@code ALCvoid alcCaptureStop(ALCdevice * device)} */
    @NativeType("ALCvoid")
    public static void alcCaptureStop(@NativeType("ALCdevice *") long device) {
		long __functionAddress = ALC.getICD().alcCaptureStop;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePV(device, __functionAddress);
    }

    // --- [ alcCaptureSamples ] ---

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    public static void nalcCaptureSamples(long device, long buffer, int samples) {
		long __functionAddress = ALC.getICD().alcCaptureSamples;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") ByteBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcCaptureSamples(device, memAddress(buffer), samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") ShortBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcCaptureSamples(device, memAddress(buffer), samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") IntBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcCaptureSamples(device, memAddress(buffer), samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") FloatBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcCaptureSamples(device, memAddress(buffer), samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") short[] buffer, @NativeType("ALCsizei") int samples) {
		long __functionAddress = ALC.getICD().alcCaptureSamples;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") int[] buffer, @NativeType("ALCsizei") int samples) {
		long __functionAddress = ALC.getICD().alcCaptureSamples;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") float[] buffer, @NativeType("ALCsizei") int samples) {
		long __functionAddress = ALC.getICD().alcCaptureSamples;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

}