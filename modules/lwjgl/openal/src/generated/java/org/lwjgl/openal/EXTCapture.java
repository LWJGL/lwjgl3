/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the {@code ALC_EXT_CAPTURE} extension.
 * 
 * <p>An OpenAL 1.1 implementation will always support the {@code ALC_EXT_CAPTURE} extension. This allows an application written to the OpenAL 1.0 specification to
 * access the capture abilities.</p>
 */
public class EXTCapture {

    /** String queries. */
    public static final int
        ALC_CAPTURE_DEVICE_SPECIFIER         = 0x310,
        ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;

    /** Integer queries. */
    public static final int ALC_CAPTURE_SAMPLES = 0x312;

    protected EXTCapture() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcCaptureOpenDevice ] ---

    /** Unsafe version of: {@link #alcCaptureOpenDevice CaptureOpenDevice} */
    public static long nalcCaptureOpenDevice(long deviceName, int frequency, int format, int samples) {
        return ALC11.nalcCaptureOpenDevice(deviceName, frequency, format, samples);
    }

    /**
     * Allows the application to connect to a capture device.
     * 
     * <p>The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If {@code NULL} is specified, the implementation
     * will provide an implementation specific default.</p>
     *
     * @param deviceName the device or device configuration
     * @param frequency  the audio frequency
     * @param format     the audio format
     * @param samples    the number of sample frames to buffer in the AL
     */
    @NativeType("ALCdevice *")
    public static long alcCaptureOpenDevice(@Nullable @NativeType("ALCchar const *") ByteBuffer deviceName, @NativeType("ALCuint") int frequency, @NativeType("ALCenum") int format, @NativeType("ALCsizei") int samples) {
        return ALC11.alcCaptureOpenDevice(deviceName, frequency, format, samples);
    }

    /**
     * Allows the application to connect to a capture device.
     * 
     * <p>The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If {@code NULL} is specified, the implementation
     * will provide an implementation specific default.</p>
     *
     * @param deviceName the device or device configuration
     * @param frequency  the audio frequency
     * @param format     the audio format
     * @param samples    the number of sample frames to buffer in the AL
     */
    @NativeType("ALCdevice *")
    public static long alcCaptureOpenDevice(@Nullable @NativeType("ALCchar const *") CharSequence deviceName, @NativeType("ALCuint") int frequency, @NativeType("ALCenum") int format, @NativeType("ALCsizei") int samples) {
        return ALC11.alcCaptureOpenDevice(deviceName, frequency, format, samples);
    }

    // --- [ alcCaptureCloseDevice ] ---

    /**
     * Allows the application to disconnect from a capture device.
     *
     * @param device the capture device to close
     */
    @NativeType("ALCboolean")
    public static boolean alcCaptureCloseDevice(@NativeType("ALCdevice *") long device) {
        return ALC11.alcCaptureCloseDevice(device);
    }

    // --- [ alcCaptureStart ] ---

    /**
     * Starts recording audio on the specific capture device.
     * 
     * <p>Once started, the device will record audio to an internal ring buffer, the size of which was specified when opening the device. The application may
     * query the capture device to discover how much data is currently available via the alcGetInteger with the ALC_CAPTURE_SAMPLES token. This will report the
     * number of sample frames currently available.</p>
     *
     * @param device the capture device
     */
    @NativeType("ALCvoid")
    public static void alcCaptureStart(@NativeType("ALCdevice *") long device) {
        ALC11.alcCaptureStart(device);
    }

    // --- [ alcCaptureStop ] ---

    /**
     * Halts audio capturing without closing the capture device.
     * 
     * <p>The implementation is encouraged to optimize for this case. The amount of audio samples available after restarting a stopped capture device is reset to
     * zero. The application does not need to stop the capture device to read from it.</p>
     *
     * @param device the capture device
     */
    @NativeType("ALCvoid")
    public static void alcCaptureStop(@NativeType("ALCdevice *") long device) {
        ALC11.alcCaptureStop(device);
    }

    // --- [ alcCaptureSamples ] ---

    /** Unsafe version of: {@link #alcCaptureSamples CaptureSamples} */
    public static void nalcCaptureSamples(long device, long buffer, int samples) {
        ALC11.nalcCaptureSamples(device, buffer, samples);
    }

    /**
     * Obtains captured audio samples from the AL.
     * 
     * <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>
     *
     * @param device  the capture device
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to obtain
     */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") ByteBuffer buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /**
     * Obtains captured audio samples from the AL.
     * 
     * <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>
     *
     * @param device  the capture device
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to obtain
     */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") ShortBuffer buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /**
     * Obtains captured audio samples from the AL.
     * 
     * <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>
     *
     * @param device  the capture device
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to obtain
     */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") IntBuffer buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /**
     * Obtains captured audio samples from the AL.
     * 
     * <p>The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.</p>
     *
     * @param device  the capture device
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to obtain
     */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") FloatBuffer buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /** Array version of: {@link #alcCaptureSamples CaptureSamples} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") short[] buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /** Array version of: {@link #alcCaptureSamples CaptureSamples} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") int[] buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

    /** Array version of: {@link #alcCaptureSamples CaptureSamples} */
    @NativeType("ALCvoid")
    public static void alcCaptureSamples(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") float[] buffer, @NativeType("ALCsizei") int samples) {
        ALC11.alcCaptureSamples(device, buffer, samples);
    }

}