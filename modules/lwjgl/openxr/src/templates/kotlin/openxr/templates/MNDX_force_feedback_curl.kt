/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MNDX_force_feedback_curl = "MNDXForceFeedbackCurl".nativeClassXR("MNDX_force_feedback_curl", type = "instance", postfix = "MNDX") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_MNDX_force_feedback_curl">XR_MNDX_force_feedback_curl</a> extension.

        This extension provides APIs for force feedback devices capable of restricting physical movement in a single direction along a single dimension.

        The intended use for this extension is to provide simple force feedback capabilities to restrict finger movement for VR Gloves.

        The application <b>must</b> also enable the {@link EXTHandTracking XR_EXT_hand_tracking} extension in order to use this extension.
        """

    IntConstant(
        "The extension specification version.",

        "MNDX_force_feedback_curl_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MNDX_FORCE_FEEDBACK_CURL_EXTENSION_NAME".."XR_MNDX_force_feedback_curl"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX".."1000375000",
        "TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX".."1000375001"
    )

    EnumConstant(
        """
        XrForceFeedbackCurlLocationMNDX - Describes which location to apply force feedback

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FORCE_FEEDBACK_CURL_LOCATION_THUMB_CURL_MNDX — force feedback for thumb curl</li>
            <li>#FORCE_FEEDBACK_CURL_LOCATION_INDEX_CURL_MNDX — force feedback for index finger curl</li>
            <li>#FORCE_FEEDBACK_CURL_LOCATION_MIDDLE_CURL_MNDX — force feedback for middle finger curl</li>
            <li>#FORCE_FEEDBACK_CURL_LOCATION_RING_CURL_MNDX — force feedback for ring finger curl</li>
            <li>#FORCE_FEEDBACK_CURL_LOCATION_LITTLE_CURL_MNDX — force feedback for little finger curl</li>
        </ul>

        <h5>See Also</h5>
        ##XrForceFeedbackCurlApplyLocationMNDX
        """,

        "FORCE_FEEDBACK_CURL_LOCATION_THUMB_CURL_MNDX".."0",
        "FORCE_FEEDBACK_CURL_LOCATION_INDEX_CURL_MNDX".."1",
        "FORCE_FEEDBACK_CURL_LOCATION_MIDDLE_CURL_MNDX".."2",
        "FORCE_FEEDBACK_CURL_LOCATION_RING_CURL_MNDX".."3",
        "FORCE_FEEDBACK_CURL_LOCATION_LITTLE_CURL_MNDX".."4"
    )

    XrResult(
        "ApplyForceFeedbackCurlMNDX",
        """
        Applies force feedback to a set of locations.

        <h5>C Specification</h5>
        The #ApplyForceFeedbackCurlMNDX() function is defined as:

        <pre><code>
￿XrResult xrApplyForceFeedbackCurlMNDX(
￿    XrHandTrackerEXT                            handTracker,
￿    const XrForceFeedbackCurlApplyLocationsMNDX* locations);</code></pre>

        <h5>Description</h5>
        The #ApplyForceFeedbackCurlMNDX() function applies force feedback to the set locations listed in ##XrForceFeedbackCurlApplyLocationsMNDX.

        #ApplyForceFeedbackCurlMNDX() <b>should</b> be called every time an application wishes to update a set of force feedback locations.

        Submits a request for force feedback for a set of locations. The runtime <b>should</b> deliver this request to the {@code handTracker} device. If the {@code handTracker} device is not available, the runtime <b>may</b> ignore this request for force feedback.

        If the session associated with {@code handTracker} is not focused, the runtime <b>must</b> return #SESSION_NOT_FOCUSED, and not apply force feedback.

        When an application submits force feedback for a set of locations, the runtime <b>must</b> update the set of locations to that specified by the application. A runtime <b>must</b> set any locations not specified by the application when submitting force feedback to 0.

        The runtime <b>may</b> discontinue force feedback if the application that set it loses focus. An application <b>should</b> call the function again after regaining focus if force feedback is still desired.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MNDXForceFeedbackCurl XR_MNDX_force_feedback_curl} extension <b>must</b> be enabled prior to calling #ApplyForceFeedbackCurlMNDX()</li>
            <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
            <li>{@code locations} <b>must</b> be a pointer to a valid ##XrForceFeedbackCurlApplyLocationsMNDX structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
                <li>#SESSION_NOT_FOCUSED</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrForceFeedbackCurlApplyLocationsMNDX
        """,

        XrHandTrackerEXT("handTracker", "an {@code XrHandTrackerEXT} handle previously created with #CreateHandTrackerEXT()."),
        XrForceFeedbackCurlApplyLocationsMNDX.const.p("locations", "an ##XrForceFeedbackCurlApplyLocationsMNDX containing a set of locations to apply force feedback to.")
    )
}