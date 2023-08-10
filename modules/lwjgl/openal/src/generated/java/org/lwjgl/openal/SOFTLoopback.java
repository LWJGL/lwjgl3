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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_loopback.txt">SOFT_loopback</a> extension.
 * 
 * <p>This extension allows an application to read back OpenAL's rendered audio instead of having it output to an audio device on the system. Unextended
 * OpenAL will output audio to an audio device, with no mechanism to allow an application to divert the audio somewhere else.</p>
 */
public class SOFTLoopback {

    /** Accepted by the {@code type} parameter of {@link #alcIsRenderFormatSupportedSOFT IsRenderFormatSupportedSOFT}. */
    public static final int
        ALC_BYTE_SOFT           = 0x1400,
        ALC_UNSIGNED_BYTE_SOFT  = 0x1401,
        ALC_SHORT_SOFT          = 0x1402,
        ALC_UNSIGNED_SHORT_SOFT = 0x1403,
        ALC_INT_SOFT            = 0x1404,
        ALC_UNSIGNED_INT_SOFT   = 0x1405,
        ALC_FLOAT_SOFT          = 0x1406;

    /** Accepted by the {@code channels} parameter of {@link #alcIsRenderFormatSupportedSOFT IsRenderFormatSupportedSOFT}. */
    public static final int
        ALC_MONO_SOFT    = 0x1500,
        ALC_STEREO_SOFT  = 0x1501,
        ALC_QUAD_SOFT    = 0x1503,
        ALC_5POINT1_SOFT = 0x1504,
        ALC_6POINT1_SOFT = 0x1505,
        ALC_7POINT1_SOFT = 0x1506;

    /** Accepted as part of the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext}. */
    public static final int
        ALC_FORMAT_CHANNELS_SOFT = 0x1990,
        ALC_FORMAT_TYPE_SOFT     = 0x1991;

    protected SOFTLoopback() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcLoopbackOpenDeviceSOFT ] ---

    /** Unsafe version of: {@link #alcLoopbackOpenDeviceSOFT LoopbackOpenDeviceSOFT} */
    public static long nalcLoopbackOpenDeviceSOFT(long deviceName) {
		long __functionAddress = ALC.getICD().alcLoopbackOpenDeviceSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(deviceName, __functionAddress);
    }

    /**
     * Loopback devices provide a way for applications to "read back" rendered audio without it being sent to an actual audio device. It allows applications to
     * render audio as fast or slow as it needs, making it suitable for non-real-time rendering, and so it can be passed to an audio codec or something for
     * further processing.
     * 
     * <p>To open a loopback device, use this function.</p>
     * 
     * <p>A loopback device behaves largely the same as a playback device. You may query playback state and error codes, and create contexts, which can then be
     * set as current to generate sources and buffers like normal.</p>
     * 
     * <p>Note that loopback devices do not have either the {@link ALC10#ALC_SYNC SYNC} or {@link ALC10#ALC_REFRESH REFRESH} attributes. Attempting to query them will result in an {@link ALC10#ALC_INVALID_ENUM INVALID_ENUM}
     * error.</p>
     *
     * @param deviceName which device or device driver to use for subsequent rendering. This may be {@code NULL} for an implementation-defined default, otherwise it must be a
     *                   valid name returned by enumeration (and further must be a device capable of loopback rendering).
     */
    @NativeType("ALCdevice *")
    public static long alcLoopbackOpenDeviceSOFT(@Nullable @NativeType("ALCchar const *") ByteBuffer deviceName) {
        if (CHECKS) {
            checkNT1Safe(deviceName);
        }
        return nalcLoopbackOpenDeviceSOFT(memAddressSafe(deviceName));
    }

    /**
     * Loopback devices provide a way for applications to "read back" rendered audio without it being sent to an actual audio device. It allows applications to
     * render audio as fast or slow as it needs, making it suitable for non-real-time rendering, and so it can be passed to an audio codec or something for
     * further processing.
     * 
     * <p>To open a loopback device, use this function.</p>
     * 
     * <p>A loopback device behaves largely the same as a playback device. You may query playback state and error codes, and create contexts, which can then be
     * set as current to generate sources and buffers like normal.</p>
     * 
     * <p>Note that loopback devices do not have either the {@link ALC10#ALC_SYNC SYNC} or {@link ALC10#ALC_REFRESH REFRESH} attributes. Attempting to query them will result in an {@link ALC10#ALC_INVALID_ENUM INVALID_ENUM}
     * error.</p>
     *
     * @param deviceName which device or device driver to use for subsequent rendering. This may be {@code NULL} for an implementation-defined default, otherwise it must be a
     *                   valid name returned by enumeration (and further must be a device capable of loopback rendering).
     */
    @NativeType("ALCdevice *")
    public static long alcLoopbackOpenDeviceSOFT(@Nullable @NativeType("ALCchar const *") CharSequence deviceName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(deviceName, true);
            long deviceNameEncoded = deviceName == null ? NULL : stack.getPointerAddress();
            return nalcLoopbackOpenDeviceSOFT(deviceNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alcIsRenderFormatSupportedSOFT ] ---

    /**
     * When creating contexts, the attribute list must specify the format used for rendering. This is done with the {@link #ALC_FORMAT_CHANNELS_SOFT FORMAT_CHANNELS_SOFT}, {@link #ALC_FORMAT_TYPE_SOFT FORMAT_TYPE_SOFT},
     * and {@link ALC10#ALC_FREQUENCY FREQUENCY} attributes. This controls the format of the audio subsequently rendered by the device.
     * 
     * <p>To check if a particular rendering format is available, use this function.</p>
     *
     * @param device    the loopback device to query
     * @param frequency the sample rate of the rendered audio
     * @param channels  the channel configuration used for rendering. One of:<br><table><tr><td>{@link #ALC_MONO_SOFT MONO_SOFT}</td><td>{@link #ALC_STEREO_SOFT STEREO_SOFT}</td><td>{@link #ALC_QUAD_SOFT QUAD_SOFT}</td><td>{@link #ALC_5POINT1_SOFT 5POINT1_SOFT}</td><td>{@link #ALC_6POINT1_SOFT 6POINT1_SOFT}</td><td>{@link #ALC_7POINT1_SOFT 7POINT1_SOFT}</td></tr></table>
     * @param type      sample type of the written audio. One of:<br><table><tr><td>{@link #ALC_BYTE_SOFT BYTE_SOFT}</td><td>{@link #ALC_UNSIGNED_BYTE_SOFT UNSIGNED_BYTE_SOFT}</td><td>{@link #ALC_SHORT_SOFT SHORT_SOFT}</td><td>{@link #ALC_UNSIGNED_SHORT_SOFT UNSIGNED_SHORT_SOFT}</td><td>{@link #ALC_INT_SOFT INT_SOFT}</td><td>{@link #ALC_UNSIGNED_INT_SOFT UNSIGNED_INT_SOFT}</td></tr><tr><td>{@link #ALC_FLOAT_SOFT FLOAT_SOFT}</td></tr></table>
     */
    @NativeType("ALCboolean")
    public static boolean alcIsRenderFormatSupportedSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCsizei") int frequency, @NativeType("ALCenum") int channels, @NativeType("ALCenum") int type) {
		long __functionAddress = ALC.getICD().alcIsRenderFormatSupportedSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return invokePZ(device, frequency, channels, type, __functionAddress);
    }

    // --- [ alcRenderSamplesSOFT ] ---

    /** Unsafe version of: {@link #alcRenderSamplesSOFT RenderSamplesSOFT} */
    public static void nalcRenderSamplesSOFT(long device, long buffer, int samples) {
		long __functionAddress = ALC.getICD().alcRenderSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

    /**
     * The state of various objects on loopback devices (including processed buffers and source offsets) is processed only when new samples are rendered. To
     * render samples, use this function.
     *
     * @param device  the loopback device which samples are rendered from, using its contexts and associated buffers and sources
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to render
     */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") ByteBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcRenderSamplesSOFT(device, memAddress(buffer), samples);
    }

    /**
     * The state of various objects on loopback devices (including processed buffers and source offsets) is processed only when new samples are rendered. To
     * render samples, use this function.
     *
     * @param device  the loopback device which samples are rendered from, using its contexts and associated buffers and sources
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to render
     */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") ShortBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcRenderSamplesSOFT(device, memAddress(buffer), samples);
    }

    /**
     * The state of various objects on loopback devices (including processed buffers and source offsets) is processed only when new samples are rendered. To
     * render samples, use this function.
     *
     * @param device  the loopback device which samples are rendered from, using its contexts and associated buffers and sources
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to render
     */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") IntBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcRenderSamplesSOFT(device, memAddress(buffer), samples);
    }

    /**
     * The state of various objects on loopback devices (including processed buffers and source offsets) is processed only when new samples are rendered. To
     * render samples, use this function.
     *
     * @param device  the loopback device which samples are rendered from, using its contexts and associated buffers and sources
     * @param buffer  the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames.
     * @param samples the number of sample frames to render
     */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") FloatBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcRenderSamplesSOFT(device, memAddress(buffer), samples);
    }

    /** Array version of: {@link #alcRenderSamplesSOFT RenderSamplesSOFT} */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") short[] buffer, @NativeType("ALCsizei") int samples) {
		long __functionAddress = ALC.getICD().alcRenderSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

    /** Array version of: {@link #alcRenderSamplesSOFT RenderSamplesSOFT} */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") int[] buffer, @NativeType("ALCsizei") int samples) {
		long __functionAddress = ALC.getICD().alcRenderSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

    /** Array version of: {@link #alcRenderSamplesSOFT RenderSamplesSOFT} */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") float[] buffer, @NativeType("ALCsizei") int samples) {
		long __functionAddress = ALC.getICD().alcRenderSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

}