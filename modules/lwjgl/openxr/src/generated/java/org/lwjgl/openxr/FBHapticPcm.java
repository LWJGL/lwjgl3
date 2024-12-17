/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class FBHapticPcm {

    public static final int XR_FB_haptic_pcm_SPEC_VERSION = 1;

    public static final String XR_FB_HAPTIC_PCM_EXTENSION_NAME = "XR_FB_haptic_pcm";

    public static final int
        XR_TYPE_HAPTIC_PCM_VIBRATION_FB            = 1000209001,
        XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB    = 1000209002,
        XR_TYPE_DEVICE_PCM_SAMPLE_RATE_GET_INFO_FB = 1000209002;

    public static final int XR_MAX_HAPTIC_PCM_BUFFER_SIZE_FB = 0xFA0;

    protected FBHapticPcm() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetDeviceSampleRateFB ] ---

    /** {@code XrResult xrGetDeviceSampleRateFB(XrSession session, XrHapticActionInfo const * hapticActionInfo, XrDevicePcmSampleRateGetInfoFB * deviceSampleRate)} */
    public static int nxrGetDeviceSampleRateFB(XrSession session, long hapticActionInfo, long deviceSampleRate) {
        long __functionAddress = session.getCapabilities().xrGetDeviceSampleRateFB;
        if (CHECKS) {
            check(__functionAddress);
            XrHapticActionInfo.validate(hapticActionInfo);
        }
        return callPPPI(session.address(), hapticActionInfo, deviceSampleRate, __functionAddress);
    }

    /** {@code XrResult xrGetDeviceSampleRateFB(XrSession session, XrHapticActionInfo const * hapticActionInfo, XrDevicePcmSampleRateGetInfoFB * deviceSampleRate)} */
    @NativeType("XrResult")
    public static int xrGetDeviceSampleRateFB(XrSession session, @NativeType("XrHapticActionInfo const *") XrHapticActionInfo hapticActionInfo, @NativeType("XrDevicePcmSampleRateGetInfoFB *") XrDevicePcmSampleRateGetInfoFB deviceSampleRate) {
        return nxrGetDeviceSampleRateFB(session, hapticActionInfo.address(), deviceSampleRate.address());
    }

}