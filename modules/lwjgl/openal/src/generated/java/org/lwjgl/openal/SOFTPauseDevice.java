/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_pause_device.txt">SOFT_pause_device</a> extension.
 * 
 * <p>This extension allows applications to pause a playback device. The main purpose of this is to silence output, stop processing, and allow the audio
 * hardware to go into a low-power mode. On a mobile device, for instance, apps may want to silence output and not waste battery life with unneeded
 * processing when in the background.</p>
 */
public class SOFTPauseDevice {

    protected SOFTPauseDevice() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcDevicePauseSOFT ] ---

    /**
     * Pauses a playback device.
     * 
     * <p>When paused, no contexts associated with the device will be processed or updated. Playing sources will not produce sound, have their offsets
     * incremented, or process any more buffers, until the device is resumed. Pausing a device that is already paused is a legal no-op.</p>
     *
     * @param device the device to pause
     */
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

    /**
     * Resumes playback of a paused device.
     * 
     * <p>This will restart processing on the device -- sources will resume playing sound as normal. Resuming playback on a device that is not paused is a legal
     * no-op.</p>
     * 
     * <p>These functions are not reference counted. alcDeviceResumeSOFT only needs to be called once to resume playback, regardless of how many times
     * {@link #alcDevicePauseSOFT DevicePauseSOFT} was called.</p>
     *
     * @param device the device to resume
     */
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