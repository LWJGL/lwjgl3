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
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_reopen_device.txt">SOFT_reopen_device</a> extension.
 * 
 * <p>This extension provides a mechanism for applications to move the output of a device from one endpoint to another. Standard OpenAL devices are
 * associated with an output on the system upon being opened, but if the endpoint should no longer be the desired output, there is no method for the
 * application to easily change it. The only option for the application is to delete all AL objects, destroy the context, close the device handle, open a
 * new device, and reload/recreate the necessary resources. A method to more simply move the device with its existing resources to a different output is
 * easier, requiring less management from the application.</p>
 */
public class SOFTReopenDevice {

    protected SOFTReopenDevice() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcReopenDeviceSOFT ] ---

    /** Unsafe version of: {@link #alcReopenDeviceSOFT ReopenDeviceSOFT} */
    public static boolean nalcReopenDeviceSOFT(long device, long deviceName, long attribs) {
		long __functionAddress = ALC.getICD().alcReopenDeviceSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return invokePPPZ(device, deviceName, attribs, __functionAddress);
    }

    /**
     * Once a playback device is opened, it becomes associated with a particular output endpoint. When this output is no longer the desired output, the
     * playback device can be reopened to re-associate it with a potentially different output endpoint using {@code alcReopenDeviceSOFT}.
     *
     * @param device     a non-{@code NULL} handle for an existing device
     * @param deviceName the device name to open, or {@code NULL} for the default (same as would be passed to {@link ALC10#alcOpenDevice OpenDevice})
     * @param attribs    an attribute list to configure the device with, with the same attribute list that would be passed to {@link ALC10#alcCreateContext CreateContext}.
     */
    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @Nullable @NativeType("ALCchar const *") ByteBuffer deviceName, @Nullable @NativeType("ALCint const *") IntBuffer attribs) {
        if (CHECKS) {
            checkNT1Safe(deviceName);
            checkNTSafe(attribs);
        }
        return nalcReopenDeviceSOFT(device, memAddressSafe(deviceName), memAddressSafe(attribs));
    }

    /**
     * Once a playback device is opened, it becomes associated with a particular output endpoint. When this output is no longer the desired output, the
     * playback device can be reopened to re-associate it with a potentially different output endpoint using {@code alcReopenDeviceSOFT}.
     *
     * @param device     a non-{@code NULL} handle for an existing device
     * @param deviceName the device name to open, or {@code NULL} for the default (same as would be passed to {@link ALC10#alcOpenDevice OpenDevice})
     * @param attribs    an attribute list to configure the device with, with the same attribute list that would be passed to {@link ALC10#alcCreateContext CreateContext}.
     */
    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @Nullable @NativeType("ALCchar const *") CharSequence deviceName, @Nullable @NativeType("ALCint const *") IntBuffer attribs) {
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

    /** Array version of: {@link #alcReopenDeviceSOFT ReopenDeviceSOFT} */
    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @Nullable @NativeType("ALCchar const *") ByteBuffer deviceName, @Nullable @NativeType("ALCint const *") int[] attribs) {
		long __functionAddress = ALC.getICD().alcReopenDeviceSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            checkNT1Safe(deviceName);
            checkNTSafe(attribs);
        }
        return invokePPPZ(device, memAddressSafe(deviceName), attribs, __functionAddress);
    }

    /** Array version of: {@link #alcReopenDeviceSOFT ReopenDeviceSOFT} */
    @NativeType("ALCboolean")
    public static boolean alcReopenDeviceSOFT(@NativeType("ALCdevice *") long device, @Nullable @NativeType("ALCchar const *") CharSequence deviceName, @Nullable @NativeType("ALCint const *") int[] attribs) {
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