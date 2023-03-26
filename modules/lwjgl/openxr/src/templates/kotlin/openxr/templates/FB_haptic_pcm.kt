/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_haptic_pcm = "FBHapticPcm".nativeClassXR("FB_haptic_pcm", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_haptic_pcm">XR_FB_haptic_pcm</a> extension.

        This extension enables applications to trigger haptic effects using Pulse Code Modulation (PCM) buffers.
        """

    IntConstant(
        "The extension specification version.",

        "FB_haptic_pcm_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_HAPTIC_PCM_EXTENSION_NAME".."XR_FB_haptic_pcm"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_HAPTIC_PCM_VIBRATION_FB".."1000209001",
        "TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB".."1000209002",
        "TYPE_DEVICE_PCM_SAMPLE_RATE_GET_INFO_FB".."1000209002"
    )

    XrResult(
        "GetDeviceSampleRateFB",
        """
        Get device sample rate.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrGetDeviceSampleRateFB(
￿    XrSession                                   session,
￿    const XrHapticActionInfo*                   hapticActionInfo,
￿    XrDevicePcmSampleRateGetInfoFB*             deviceSampleRate);</code></pre>

        <h5>Description</h5>
        The runtime <b>must</b> use the {@code hapticActionInfo} to get the sample rate of the currently bound device on which haptics is triggered and populate the {@code deviceSampleRate} structure. The device is determined by the {@code action} and {@code subaction} of ##XrHapticActionInfo. If the {@code hapticActionInfo} is bound to more than one device, then runtime <b>should</b> assume that the all these bound devices have the same {@code deviceSampleRate} and the runtime <b>should</b> return the sampleRate for any of those bound devices. If the device is invalid, the runtime <b>must</b> populate the {@code sampleRate} of ##XrDevicePcmSampleRateStateFB as 0. A device can be invalid if the runtime does not find any device (which can play haptics) connected to the headset, or if the device does not support PCM haptic effect.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBHapticPcm XR_FB_haptic_pcm} extension <b>must</b> be enabled prior to calling #GetDeviceSampleRateFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code hapticActionInfo} <b>must</b> be a pointer to a valid ##XrHapticActionInfo structure</li>
            <li>{@code deviceSampleRate} <b>must</b> be a pointer to an ##XrDevicePcmSampleRateGetInfoFB structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_ACTION_TYPE_MISMATCH</li>
                <li>#ERROR_ACTIONSET_NOT_ATTACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrDevicePcmSampleRateGetInfoFB, ##XrDevicePcmSampleRateStateFB, ##XrHapticActionInfo
        """,

        XrSession("session", "the specified {@code XrSession}."),
        XrHapticActionInfo.const.p("hapticActionInfo", "the ##XrHapticActionInfo used to provide action and subaction paths"),
        XrDevicePcmSampleRateGetInfoFB.p("deviceSampleRate", "a pointer to ##XrDevicePcmSampleRateStateFB which is populated by the runtime.")
    )
}