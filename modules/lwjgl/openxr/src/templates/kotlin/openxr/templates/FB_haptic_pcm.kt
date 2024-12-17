/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_haptic_pcm = "FBHapticPcm".nativeClassXR("FB_haptic_pcm", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_haptic_pcm_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_HAPTIC_PCM_EXTENSION_NAME".."XR_FB_haptic_pcm"
    )

    EnumConstant(
        "TYPE_HAPTIC_PCM_VIBRATION_FB".."1000209001",
        "TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB".."1000209002",
        "TYPE_DEVICE_PCM_SAMPLE_RATE_GET_INFO_FB".."1000209002"
    )

    XrResult(
        "GetDeviceSampleRateFB",

        XrSession("session"),
        XrHapticActionInfo.const.p("hapticActionInfo"),
        XrDevicePcmSampleRateGetInfoFB.p("deviceSampleRate")
    )
}