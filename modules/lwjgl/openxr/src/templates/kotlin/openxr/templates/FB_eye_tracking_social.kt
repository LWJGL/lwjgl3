/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_eye_tracking_social = "FBEyeTrackingSocial".nativeClassXR("FB_eye_tracking_social", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_eye_tracking_social">XR_FB_eye_tracking_social</a> extension.

        This extension enables applications to obtain position and orientation of the user’s eyes. It enables applications to render eyes in XR experiences.

        This extension is intended to drive animation of avatar eyes. So, for that purpose, the runtimes <b>may</b> filter the poses in ways that are suitable for avatar eye interaction but detrimental to other use cases. This extension <b>should</b> not be used for other eye tracking purposes. For interaction, {@link EXTEyeGazeInteraction XR_EXT_eye_gaze_interaction} <b>should</b> be used.

        Eye tracking data is sensitive personal information and is closely linked to personal privacy and integrity. It is strongly recommended that applications that store or transfer eye tracking data always ask the user for active and specific acceptance to do so.

        If a runtime supports a permission system to control application access to the eye tracker, then the runtime <b>must</b> set the {@code isValid} field to #FALSE on the supplied ##XrEyeGazeFB structure until the application has been allowed access to the eye tracker. When the application access has been allowed, the runtime <b>may</b> set {@code isValid} on the supplied ##XrEyeGazeFB structure to #TRUE.
        """

    IntConstant(
        "The extension specification version.",

        "FB_eye_tracking_social_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_EYE_TRACKING_SOCIAL_EXTENSION_NAME".."XR_FB_eye_tracking_social"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_EYE_TRACKER_FB".."1000202000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_EYE_TRACKER_CREATE_INFO_FB".."1000202001",
        "TYPE_EYE_GAZES_INFO_FB".."1000202002",
        "TYPE_EYE_GAZES_FB".."1000202003",
        "TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB".."1000202004"
    )

    EnumConstant(
        """
        XrEyePositionFB - Enumerates eyes.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#EYE_POSITION_LEFT_FB — Specifies the position of the left eye.</li>
            <li>#EYE_POSITION_RIGHT_FB — Specifies the position of the right eye.</li>
        </ul>

        <h5>See Also</h5>
        ##XrEyeGazesFB
        """,

        "EYE_POSITION_LEFT_FB".."0",
        "EYE_POSITION_RIGHT_FB".."1",
        "EYE_POSITION_COUNT_FB".."2"
    )

    XrResult(
        "CreateEyeTrackerFB",
        """
        Create an eye gaze handle.

        <h5>C Specification</h5>
        An application creates an {@code XrEyeTrackerFB} handle using #CreateEyeTrackerFB() function.

        <pre><code>
￿XrResult xrCreateEyeTrackerFB(
￿    XrSession                                   session,
￿    const XrEyeTrackerCreateInfoFB*             createInfo,
￿    XrEyeTrackerFB*                             eyeTracker);</code></pre>

        <h5>Description</h5>
        If the system does not support eye tracking, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateEyeTrackerFB(). In this case, the runtime <b>must</b> return #FALSE for {@code supportsEyeTracking} in ##XrSystemEyeTrackingPropertiesFB when the function #GetSystemProperties() is called, so that the application <b>can</b> avoid creating an eye tracker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to calling #CreateEyeTrackerFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrEyeTrackerCreateInfoFB structure</li>
            <li>{@code eyeTracker} <b>must</b> be a pointer to an {@code XrEyeTrackerFB} handle</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrEyeTrackerCreateInfoFB
        """,

        XrSession("session", "an {@code XrSession} in which the eye tracker will be active."),
        XrEyeTrackerCreateInfoFB.const.p("createInfo", "the ##XrEyeTrackerCreateInfoFB used to specify the eye tracker."),
        Check(1)..XrEyeTrackerFB.p("eyeTracker", "the returned {@code XrEyeTrackerFB} handle.")
    )

    XrResult(
        "DestroyEyeTrackerFB",
        """
        Destroy an eye gaze handle.

        <h5>C Specification</h5>
        #DestroyEyeTrackerFB() function releases the {@code eyeTracker} and the underlying resources when the eye tracking experience is over.

        <pre><code>
￿XrResult xrDestroyEyeTrackerFB(
￿    XrEyeTrackerFB                              eyeTracker);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to calling #DestroyEyeTrackerFB()</li>
            <li>{@code eyeTracker} <b>must</b> be a valid {@code XrEyeTrackerFB} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code eyeTracker}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>
        """,

        XrEyeTrackerFB("eyeTracker", "an {@code XrEyeTrackerFB} previously created by #CreateEyeTrackerFB().")
    )

    XrResult(
        "GetEyeGazesFB",
        """
        Locate eye gaze directions.

        <h5>C Specification</h5>
        The #GetEyeGazesFB() function is defined as:

        <pre><code>
￿XrResult xrGetEyeGazesFB(
￿    XrEyeTrackerFB                              eyeTracker,
￿    const XrEyeGazesInfoFB*                     gazeInfo,
￿    XrEyeGazesFB*                               eyeGazes);</code></pre>

        <h5>Description</h5>
        The #GetEyeGazesFB() function obtains pose for a user’s eyes at a specific time and within a specific coordinate system.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to calling #GetEyeGazesFB()</li>
            <li>{@code eyeTracker} <b>must</b> be a valid {@code XrEyeTrackerFB} handle</li>
            <li>{@code gazeInfo} <b>must</b> be a pointer to a valid ##XrEyeGazesInfoFB structure</li>
            <li>{@code eyeGazes} <b>must</b> be a pointer to an ##XrEyeGazesFB structure</li>
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
                <li>#ERROR_TIME_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrEyeGazesFB, ##XrEyeGazesInfoFB
        """,

        XrEyeTrackerFB("eyeTracker", """an {@code XrEyeTrackerFB} previously created by #CreateEyeTrackerFB().

        a pointer to ##XrEyeGazesFB receiving the returned eye poses and confidence."""),
        XrEyeGazesInfoFB.const.p("gazeInfo", "the information to get eye gaze."),
        XrEyeGazesFB.p("eyeGazes", "")
    )
}