/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_facial_tracking = "HTCFacialTracking".nativeClassXR("HTC_facial_tracking", type = "instance", postfix = "HTC") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "HTC_facial_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "HTC_FACIAL_TRACKING_EXTENSION_NAME".."XR_HTC_facial_tracking"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_FACIAL_TRACKER_HTC".."1000104000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC".."1000104000",
        "TYPE_FACIAL_TRACKER_CREATE_INFO_HTC".."1000104001",
        "TYPE_FACIAL_EXPRESSIONS_HTC".."1000104002"
    )

    EnumConstant(
        """
        XrEyeExpressionHTC - The blend shapes of eye expression
        """,

        "EYE_EXPRESSION_LEFT_BLINK_HTC".."0",
        "EYE_EXPRESSION_LEFT_WIDE_HTC".."1",
        "EYE_EXPRESSION_RIGHT_BLINK_HTC".."2",
        "EYE_EXPRESSION_RIGHT_WIDE_HTC".."3",
        "EYE_EXPRESSION_LEFT_SQUEEZE_HTC".."4",
        "EYE_EXPRESSION_RIGHT_SQUEEZE_HTC".."5",
        "EYE_EXPRESSION_LEFT_DOWN_HTC".."6",
        "EYE_EXPRESSION_RIGHT_DOWN_HTC".."7",
        "EYE_EXPRESSION_LEFT_OUT_HTC".."8",
        "EYE_EXPRESSION_RIGHT_IN_HTC".."9",
        "EYE_EXPRESSION_LEFT_IN_HTC".."10",
        "EYE_EXPRESSION_RIGHT_OUT_HTC".."11",
        "EYE_EXPRESSION_LEFT_UP_HTC".."12",
        "EYE_EXPRESSION_RIGHT_UP_HTC".."13"
    )

    EnumConstant(
        """
        XrLipExpressionHTC - The blend shapes of lip expression
        """,

        "LIP_EXPRESSION_JAW_RIGHT_HTC".."0",
        "LIP_EXPRESSION_JAW_LEFT_HTC".."1",
        "LIP_EXPRESSION_JAW_FORWARD_HTC".."2",
        "LIP_EXPRESSION_JAW_OPEN_HTC".."3",
        "LIP_EXPRESSION_MOUTH_APE_SHAPE_HTC".."4",
        "LIP_EXPRESSION_MOUTH_UPPER_RIGHT_HTC".."5",
        "LIP_EXPRESSION_MOUTH_UPPER_LEFT_HTC".."6",
        "LIP_EXPRESSION_MOUTH_LOWER_RIGHT_HTC".."7",
        "LIP_EXPRESSION_MOUTH_LOWER_LEFT_HTC".."8",
        "LIP_EXPRESSION_MOUTH_UPPER_OVERTURN_HTC".."9",
        "LIP_EXPRESSION_MOUTH_LOWER_OVERTURN_HTC".."10",
        "LIP_EXPRESSION_MOUTH_POUT_HTC".."11",
        "LIP_EXPRESSION_MOUTH_SMILE_RIGHT_HTC".."12",
        "LIP_EXPRESSION_MOUTH_SMILE_LEFT_HTC".."13",
        "LIP_EXPRESSION_MOUTH_SAD_RIGHT_HTC".."14",
        "LIP_EXPRESSION_MOUTH_SAD_LEFT_HTC".."15",
        "LIP_EXPRESSION_CHEEK_PUFF_RIGHT_HTC".."16",
        "LIP_EXPRESSION_CHEEK_PUFF_LEFT_HTC".."17",
        "LIP_EXPRESSION_CHEEK_SUCK_HTC".."18",
        "LIP_EXPRESSION_MOUTH_UPPER_UPRIGHT_HTC".."19",
        "LIP_EXPRESSION_MOUTH_UPPER_UPLEFT_HTC".."20",
        "LIP_EXPRESSION_MOUTH_LOWER_DOWNRIGHT_HTC".."21",
        "LIP_EXPRESSION_MOUTH_LOWER_DOWNLEFT_HTC".."22",
        "LIP_EXPRESSION_MOUTH_UPPER_INSIDE_HTC".."23",
        "LIP_EXPRESSION_MOUTH_LOWER_INSIDE_HTC".."24",
        "LIP_EXPRESSION_MOUTH_LOWER_OVERLAY_HTC".."25",
        "LIP_EXPRESSION_TONGUE_LONGSTEP1_HTC".."26",
        "LIP_EXPRESSION_TONGUE_LEFT_HTC".."27",
        "LIP_EXPRESSION_TONGUE_RIGHT_HTC".."28",
        "LIP_EXPRESSION_TONGUE_UP_HTC".."29",
        "LIP_EXPRESSION_TONGUE_DOWN_HTC".."30",
        "LIP_EXPRESSION_TONGUE_ROLL_HTC".."31",
        "LIP_EXPRESSION_TONGUE_LONGSTEP2_HTC".."32",
        "LIP_EXPRESSION_TONGUE_UPRIGHT_MORPH_HTC".."33",
        "LIP_EXPRESSION_TONGUE_UPLEFT_MORPH_HTC".."34",
        "LIP_EXPRESSION_TONGUE_DOWNRIGHT_MORPH_HTC".."35",
        "LIP_EXPRESSION_TONGUE_DOWNLEFT_MORPH_HTC".."36"
    )

    EnumConstant(
        """
        XrFacialTrackingTypeHTC - Describes the type of facial tracking.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC — Specifies this handle will observe eye expressions, with values indexed by {@code XrEyeExpressionHTC} whose count is #FACIAL_EXPRESSION_EYE_COUNT_HTC.</li>
            <li>#FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC — Specifies this handle will observe lip expressions, with values indexed by {@code XrLipExpressionHTC} whose count is #FACIAL_EXPRESSION_LIP_COUNT_HTC.</li>
        </ul>

        <h5>See Also</h5>
        ##XrFacialTrackerCreateInfoHTC
        """,

        "FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC".."1",
        "FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC".."2"
    )

    XrResult(
        "CreateFacialTrackerHTC",
        """
        Create an facial tracker handle.

        <h5>C Specification</h5>
        The #CreateFacialTrackerHTC() function is defined as

        <pre><code>
￿XrResult xrCreateFacialTrackerHTC(
￿    XrSession                                   session,
￿    const XrFacialTrackerCreateInfoHTC*         createInfo,
￿    XrFacialTrackerHTC*                         facialTracker);</code></pre>

        <h5>Description</h5>
        An application <b>can</b> create an {@code XrFacialTrackerHTC} handle using #CreateFacialTrackerHTC().

        If the system does not support eye tracking or lip tracking, runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateFacialTrackerHTC() according to the corresponding case. In this case, the runtime <b>must</b> return #FALSE for {@code supportEyeFacialTracking} or {@code supportLipFacialTracking} in ##XrSystemFacialTrackingPropertiesHTC when the function #GetSystemProperties() is called, so that the application <b>may</b> avoid creating a facial tracker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to calling #CreateFacialTrackerHTC()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrFacialTrackerCreateInfoHTC structure</li>
            <li>{@code facialTracker} <b>must</b> be a pointer to an {@code XrFacialTrackerHTC} handle</li>
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
        ##XrFacialTrackerCreateInfoHTC, #DestroyFacialTrackerHTC()
        """,

        XrSession("session", "an {@code XrSession} in which the facial expression will be active."),
        XrFacialTrackerCreateInfoHTC.const.p("createInfo", "the ##XrFacialTrackerCreateInfoHTC used to specify the facial tracking type."),
        Check(1)..XrFacialTrackerHTC.p("facialTracker", "the returned {@code XrFacialTrackerHTC} handle.")
    )

    XrResult(
        "DestroyFacialTrackerHTC",
        """
        Destroy a facial tracker handle.

        <h5>C Specification</h5>
        The #DestroyFacialTrackerHTC() function is defined as:

        <pre><code>
￿XrResult xrDestroyFacialTrackerHTC(
￿    XrFacialTrackerHTC                          facialTracker);</code></pre>

        <h5>Description</h5>
        #DestroyFacialTrackerHTC() releases the {@code facialTracker} and the underlying resources when finished with facial tracking experiences.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to calling #DestroyFacialTrackerHTC()</li>
            <li>{@code facialTracker} <b>must</b> be a valid {@code XrFacialTrackerHTC} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code facialTracker}, and any child handles, <b>must</b> be externally synchronized</li>
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

        XrFacialTrackerHTC("facialTracker", "an {@code XrFacialTrackerHTC} previously created by #CreateFacialTrackerHTC().")
    )

    XrResult(
        "GetFacialExpressionsHTC",
        """
        Retrieve facial expressions.

        <h5>C Specification</h5>
        The #GetFacialExpressionsHTC() function is defined as:

        <pre><code>
￿XrResult xrGetFacialExpressionsHTC(
￿    XrFacialTrackerHTC                          facialTracker,
￿    XrFacialExpressionsHTC*                     facialExpressions);</code></pre>

        <h5>Description</h5>
        #GetFacialExpressionsHTC() retrieves an array of values of blend shapes for a facial expression on a given time.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to calling #GetFacialExpressionsHTC()</li>
            <li>{@code facialTracker} <b>must</b> be a valid {@code XrFacialTrackerHTC} handle</li>
            <li>{@code facialExpressions} <b>must</b> be a pointer to an ##XrFacialExpressionsHTC structure</li>
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
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_TIME_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFacialExpressionsHTC
        """,

        XrFacialTrackerHTC("facialTracker", "an {@code XrFacialTrackerHTC} previously created by #CreateFacialTrackerHTC()."),
        XrFacialExpressionsHTC.p("facialExpressions", "a pointer to ##XrFacialExpressionsHTC receiving the returned facial expressions.")
    )
}