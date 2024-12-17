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

public class SOFTReopenDevice {

    protected SOFTReopenDevice() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcReopenDeviceSOFT ] ---

    /** {@code ALCboolean alcReopenDeviceSOFT(ALCdevice * device, ALCchar const * deviceName, ALCint const * attribs)} */
    public static boolean nalcReopenDeviceSOFT(long device, long deviceName, long attribs) {
		long __functionAddress = ALC.getICD().alcReopenDeviceSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return invokePPPZ(device, deviceName, attribs, __functionAddress);
    }

    /** {@code ALCboolean alcReopenDeviceSOFT(ALCdevice * device, ALCchar const * deviceName, ALCint const * attribs)} */
    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCchar const *") @Nullable ByteBuffer deviceName, @NativeType("ALCint const *") @Nullable IntBuffer attribs) {
        if (CHECKS) {
            checkNT1Safe(deviceName);
            checkNTSafe(attribs);
        }
        return nalcReopenDeviceSOFT(device, memAddressSafe(deviceName), memAddressSafe(attribs));
    }

    /** {@code ALCboolean alcReopenDeviceSOFT(ALCdevice * device, ALCchar const * deviceName, ALCint const * attribs)} */
    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCchar const *") @Nullable CharSequence deviceName, @NativeType("ALCint const *") @Nullable IntBuffer attribs) {
        if (CHECKS) {
            checkNTSafe(attribs);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(deviceName, true);
            long deviceNameEncoded = deviceName == null ? NULL : stack.getPointerAddress();
            return nalcReopenDeviceSOFT(device, deviceNameEncoded, memAddressSafe(attribs));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code ALCboolean alcReopenDeviceSOFT(ALCdevice * device, ALCchar const * deviceName, ALCint const * attribs)} */
    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCchar const *") @Nullable ByteBuffer deviceName, @NativeType("ALCint const *") int @Nullable [] attribs) {
		long __functionAddress = ALC.getICD().alcReopenDeviceSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            checkNT1Safe(deviceName);
            checkNTSafe(attribs);
        }
        return invokePPPZ(device, memAddressSafe(deviceName), attribs, __functionAddress);
    }

    /** {@code ALCboolean alcReopenDeviceSOFT(ALCdevice * device, ALCchar const * deviceName, ALCint const * attribs)} */
    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCchar const *") @Nullable CharSequence deviceName, @NativeType("ALCint const *") int @Nullable [] attribs) {
		long __functionAddress = ALC.getICD().alcReopenDeviceSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            checkNTSafe(attribs);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(deviceName, true);
            long deviceNameEncoded = deviceName == null ? NULL : stack.getPointerAddress();
            return invokePPPZ(device, deviceNameEncoded, attribs, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}