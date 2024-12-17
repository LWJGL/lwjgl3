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

public class EXTCapture {

    public static final int
        ALC_CAPTURE_DEVICE_SPECIFIER         = 0x310,
        ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;

    public static final int ALC_CAPTURE_SAMPLES = 0x312;

    protected EXTCapture() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcCaptureOpenDevice ] ---

    /** {@code ALCdevice * alcCaptureOpenDevice(ALCchar const * deviceName, ALCuint frequency, ALCenum format, ALCsizei samples)} */
    public static long nalcCaptureOpenDevice(long deviceName, int frequency, int format, int samples) {
        return ALC11.nalcCaptureOpenDevice(deviceName, frequency, format, samples);
    }

    /** {@code ALCdevice * alcCaptureOpenDevice(ALCchar const * deviceName, ALCuint frequency, ALCenum format, ALCsizei samples)} */
    @NativeType("ALCdevice *")
    public static long alcCaptureOpenDevice(@NativeType("ALCchar const *") @Nullable ByteBuffer deviceName, @NativeType("ALCuint") int frequency, @NativeType("ALCenum") int format, @NativeType("ALCsizei") int samples) {
        return ALC11.alcCaptureOpenDevice(deviceName, frequency, format, samples);
    }

    /** {@code ALCdevice * alcCaptureOpenDevice(ALCchar const * deviceName, ALCuint frequency, ALCenum format, ALCsizei samples)} */
    @NativeType("ALCdevice *")
    public static long alcCaptureOpenDevice(@NativeType("ALCchar const *") @Nullable CharSequence deviceName, @NativeType("ALCuint") int frequency, @NativeType("ALCenum") int format, @NativeType("ALCsizei") int samples) {
        return ALC11.alcCaptureOpenDevice(deviceName, frequency, format, samples);
    }

    // --- [ alcCaptureCloseDevice ] ---

    /** {@code ALCboolean alcCaptureCloseDevice(ALCdevice * device)} */
    @NativeType("ALCboolean")
    public static boolean alcCaptureCloseDevice(@NativeType("ALCdevice *") long device) {
        return ALC11.alcCaptureCloseDevice(device);
    }

    // --- [ alcCaptureStart ] ---

    /** {@code ALCvoid alcCaptureStart(ALCdevice * device)} */
    @NativeType("ALCvoid")
    public static void alcCaptureStart(@NativeType("ALCdevice *") long device) {
        ALC11.alcCaptureStart(device);
    }

    // --- [ alcCaptureStop ] ---

    /** {@code ALCvoid alcCaptureStop(ALCdevice * device)} */
    @NativeType("ALCvoid")
    public static void alcCaptureStop(@NativeType("ALCdevice *") long device) {
        ALC11.alcCaptureStop(device);
    }

    // --- [ alcCaptureSamples ] ---

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    public static void nalcCaptureSamples(long device, long buffer, int samples) {
        ALC11.nalcCaptureSamples(device, buffer, samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") ByteBuffer buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") ShortBuffer buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") IntBuffer buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") FloatBuffer buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") short[] buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") int[] buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /** {@code ALCvoid alcCaptureSamples(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") float[] buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

}