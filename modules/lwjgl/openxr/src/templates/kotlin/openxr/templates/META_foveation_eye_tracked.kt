/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_foveation_eye_tracked = "METAFoveationEyeTracked".nativeClassXR("META_foveation_eye_tracked", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_META_foveation_eye_tracked">XR_META_foveation_eye_tracked</a> extension.

        Eye tracked foveated rendering renders lower pixel density in the periphery of the user’s gaze, taking advantage of low peripheral acuity.

        This extension allows:

        <ul>
            <li>An application to query eye tracked foveation availability.</li>
            <li>An application to request eye tracked foveation profile supported by the runtime and apply them to foveation-supported swapchains.</li>
            <li>An application to query foveation center position every frame.</li>
            <li>An application to request a foveation pattern update from the runtime. As a consequence, runtime knows how to adjust the eye tracking camera exposure start time in order to optimize the total pipeline latency.</li>
        </ul>

        In order to enable the functionality of this extension, the application <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "META_foveation_eye_tracked_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_FOVEATION_EYE_TRACKED_EXTENSION_NAME".."XR_META_foveation_eye_tracked"
    )

    EnumConstant(
        "XR_FOVEATION_CENTER_SIZE_META",

        "FOVEATION_CENTER_SIZE_META".."2"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META".."1000200000",
        "TYPE_FOVEATION_EYE_TRACKED_STATE_META".."1000200001",
        "TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META".."1000200002"
    )

    EnumConstant(
        """
        XrFoveationEyeTrackedStateFlagBitsMETA - XrFoveationEyeTrackedStateFlagBitsMETA

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#FOVEATION_EYE_TRACKED_STATE_VALID_BIT_META — Indicates whether or not foveation data is valid. This can happen if the eye tracker is obscured, the camera has dirt, or eye lid is closed, etc.</li>
        </ul>
        """,

        "FOVEATION_EYE_TRACKED_STATE_VALID_BIT_META".enum(0x00000001)
    )

    XrResult(
        "GetFoveationEyeTrackedStateMETA",
        """
        Get the current eye tracked foveation state.

        <h5>C Specification</h5>
        The #GetFoveationEyeTrackedStateMETA() function is defined as:

        <pre><code>
￿XrResult xrGetFoveationEyeTrackedStateMETA(
￿    XrSession                                   session,
￿    XrFoveationEyeTrackedStateMETA*             foveationState);</code></pre>

        <h5>Description</h5>
        The #GetFoveationEyeTrackedStateMETA() function returns the current eye tracked foveation state including the center of the foveal region, validity of the foveation data, etc.

        Note that #UpdateSwapchainFB() <b>should</b> be called right before the #GetFoveationEyeTrackedStateMETA() function in order to (1) request a foveation pattern update by the runtime (2) optionally instruct the runtime to adjust the eye tracking camera capture start time in order to optimize for pipeline latency.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAFoveationEyeTracked XR_META_foveation_eye_tracked} extension <b>must</b> be enabled prior to calling #GetFoveationEyeTrackedStateMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code foveationState} <b>must</b> be a pointer to an ##XrFoveationEyeTrackedStateMETA structure</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFoveationEyeTrackedStateMETA
        """,

        XrSession("session", "the {@code XrSession} in which the eye tracked foveation profile is applied."),
        XrFoveationEyeTrackedStateMETA.p("foveationState", "a pointer to an ##XrFoveationEyeTrackedStateMETA structure returning the current eye tracked foveation state.")
    )
}