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

public class SOFTLoopback {

    public static final int
        ALC_BYTE_SOFT           = 0x1400,
        ALC_UNSIGNED_BYTE_SOFT  = 0x1401,
        ALC_SHORT_SOFT          = 0x1402,
        ALC_UNSIGNED_SHORT_SOFT = 0x1403,
        ALC_INT_SOFT            = 0x1404,
        ALC_UNSIGNED_INT_SOFT   = 0x1405,
        ALC_FLOAT_SOFT          = 0x1406;

    public static final int
        ALC_MONO_SOFT    = 0x1500,
        ALC_STEREO_SOFT  = 0x1501,
        ALC_QUAD_SOFT    = 0x1503,
        ALC_5POINT1_SOFT = 0x1504,
        ALC_6POINT1_SOFT = 0x1505,
        ALC_7POINT1_SOFT = 0x1506;

    public static final int
        ALC_FORMAT_CHANNELS_SOFT = 0x1990,
        ALC_FORMAT_TYPE_SOFT     = 0x1991;

    protected SOFTLoopback() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcLoopbackOpenDeviceSOFT ] ---

    /** {@code ALCdevice * alcLoopbackOpenDeviceSOFT(ALCchar const * deviceName)} */
    public static long nalcLoopbackOpenDeviceSOFT(long deviceName) {
		long __functionAddress = ALC.getICD().alcLoopbackOpenDeviceSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(deviceName, __functionAddress);
    }

    /** {@code ALCdevice * alcLoopbackOpenDeviceSOFT(ALCchar const * deviceName)} */
    @NativeType("ALCdevice *")
    public static long alcLoopbackOpenDeviceSOFT(@NativeType("ALCchar const *") @Nullable ByteBuffer deviceName) {
        if (CHECKS) {
            checkNT1Safe(deviceName);
        }
        return nalcLoopbackOpenDeviceSOFT(memAddressSafe(deviceName));
    }

    /** {@code ALCdevice * alcLoopbackOpenDeviceSOFT(ALCchar const * deviceName)} */
    @NativeType("ALCdevice *")
    public static long alcLoopbackOpenDeviceSOFT(@NativeType("ALCchar const *") @Nullable CharSequence deviceName) {
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

    /** {@code ALCboolean alcIsRenderFormatSupportedSOFT(ALCdevice * device, ALCsizei frequency, ALCenum channels, ALCenum type)} */
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

    /** {@code ALCvoid alcRenderSamplesSOFT(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    public static void nalcRenderSamplesSOFT(long device, long buffer, int samples) {
		long __functionAddress = ALC.getICD().alcRenderSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

    /** {@code ALCvoid alcRenderSamplesSOFT(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") ByteBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcRenderSamplesSOFT(device, memAddress(buffer), samples);
    }

    /** {@code ALCvoid alcRenderSamplesSOFT(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") ShortBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcRenderSamplesSOFT(device, memAddress(buffer), samples);
    }

    /** {@code ALCvoid alcRenderSamplesSOFT(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") IntBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcRenderSamplesSOFT(device, memAddress(buffer), samples);
    }

    /** {@code ALCvoid alcRenderSamplesSOFT(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") FloatBuffer buffer, @NativeType("ALCsizei") int samples) {
        nalcRenderSamplesSOFT(device, memAddress(buffer), samples);
    }

    /** {@code ALCvoid alcRenderSamplesSOFT(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") short[] buffer, @NativeType("ALCsizei") int samples) {
		long __functionAddress = ALC.getICD().alcRenderSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

    /** {@code ALCvoid alcRenderSamplesSOFT(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
    @NativeType("ALCvoid")
    public static void alcRenderSamplesSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCvoid *") int[] buffer, @NativeType("ALCsizei") int samples) {
		long __functionAddress = ALC.getICD().alcRenderSamplesSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePPV(device, buffer, samples, __functionAddress);
    }

    /** {@code ALCvoid alcRenderSamplesSOFT(ALCdevice * device, ALCvoid * buffer, ALCsizei samples)} */
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