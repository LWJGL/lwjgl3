/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class SOFTPauseDevice {

    protected SOFTPauseDevice() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcDevicePauseSOFT ] ---

    /** {@code ALCvoid alcDevicePauseSOFT(ALCdevice * device)} */
    @NativeType("ALCvoid")
    public static void alcDevicePauseSOFT(@NativeType("ALCdevice *") long device) {
		long __functionAddress = ALC.getICD().alcDevicePauseSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePV(device, __functionAddress);
    }

    // --- [ alcDeviceResumeSOFT ] ---

    /** {@code ALCvoid alcDeviceResumeSOFT(ALCdevice * device)} */
    @NativeType("ALCvoid")
    public static void alcDeviceResumeSOFT(@NativeType("ALCdevice *") long device) {
		long __functionAddress = ALC.getICD().alcDeviceResumeSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        invokePV(device, __functionAddress);
    }

}