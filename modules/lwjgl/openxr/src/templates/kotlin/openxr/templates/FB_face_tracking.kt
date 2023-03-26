/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_face_tracking = "FBFaceTracking".nativeClassXR("FB_face_tracking", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_face_tracking">XR_FB_face_tracking</a> extension.

        This extension enables applications to get weights of blend shapes. It also enables applications to render facial expressions in XR experiences.

        Face tracking data is sensitive personal information and is closely linked to personal privacy and integrity. It is strongly recommended that applications storing or transferring face tracking data always ask the user for active and specific acceptance to do so.

        If a runtime supports a permission system to control application access to the face tracker, then the runtime <b>must</b> set the {@code isValid} field to #FALSE on the supplied ##XrFaceExpressionStatusFB structure until the user allows the application to access the face tracker. When the application access has been allowed, the runtime <b>may</b> set {@code isValid} on the supplied ##XrFaceExpressionStatusFB structure to #TRUE.

        Some permission systems may control access to the eye tracking separately from access to the face tracking, even though the eyes are part of the face. In case the user denied tracking of the eyes, yet, allowed tracking of the face, then the runtime <b>must</b> set the {@code isEyeFollowingBlendshapesValid} field to #FALSE on the supplied ##XrFaceExpressionStatusFB for indicating that eye tracking data is not available, but at the same time <b>may</b> set the {@code isValid} field to #TRUE on the supplied ##XrFaceExpressionStatusFB for indicating that another part of the face is tracked properly.
        """

    IntConstant(
        "The extension specification version.",

        "FB_face_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_FACE_TRACKING_EXTENSION_NAME".."XR_FB_face_tracking"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_FACE_TRACKER_FB".."1000201000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_FB".."1000201004",
        "TYPE_FACE_TRACKER_CREATE_INFO_FB".."1000201005",
        "TYPE_FACE_EXPRESSION_INFO_FB".."1000201002",
        "TYPE_FACE_EXPRESSION_WEIGHTS_FB".."1000201006"
    )

    EnumConstant(
        """
        XrFaceExpressionFB - The name of blend shapes that can be tracked
        """,

        "FACE_EXPRESSION_BROW_LOWERER_L_FB".."0",
        "FACE_EXPRESSION_BROW_LOWERER_R_FB".."1",
        "FACE_EXPRESSION_CHEEK_PUFF_L_FB".."2",
        "FACE_EXPRESSION_CHEEK_PUFF_R_FB".."3",
        "FACE_EXPRESSION_CHEEK_RAISER_L_FB".."4",
        "FACE_EXPRESSION_CHEEK_RAISER_R_FB".."5",
        "FACE_EXPRESSION_CHEEK_SUCK_L_FB".."6",
        "FACE_EXPRESSION_CHEEK_SUCK_R_FB".."7",
        "FACE_EXPRESSION_CHIN_RAISER_B_FB".."8",
        "FACE_EXPRESSION_CHIN_RAISER_T_FB".."9",
        "FACE_EXPRESSION_DIMPLER_L_FB".."10",
        "FACE_EXPRESSION_DIMPLER_R_FB".."11",
        "FACE_EXPRESSION_EYES_CLOSED_L_FB".."12",
        "FACE_EXPRESSION_EYES_CLOSED_R_FB".."13",
        "FACE_EXPRESSION_EYES_LOOK_DOWN_L_FB".."14",
        "FACE_EXPRESSION_EYES_LOOK_DOWN_R_FB".."15",
        "FACE_EXPRESSION_EYES_LOOK_LEFT_L_FB".."16",
        "FACE_EXPRESSION_EYES_LOOK_LEFT_R_FB".."17",
        "FACE_EXPRESSION_EYES_LOOK_RIGHT_L_FB".."18",
        "FACE_EXPRESSION_EYES_LOOK_RIGHT_R_FB".."19",
        "FACE_EXPRESSION_EYES_LOOK_UP_L_FB".."20",
        "FACE_EXPRESSION_EYES_LOOK_UP_R_FB".."21",
        "FACE_EXPRESSION_INNER_BROW_RAISER_L_FB".."22",
        "FACE_EXPRESSION_INNER_BROW_RAISER_R_FB".."23",
        "FACE_EXPRESSION_JAW_DROP_FB".."24",
        "FACE_EXPRESSION_JAW_SIDEWAYS_LEFT_FB".."25",
        "FACE_EXPRESSION_JAW_SIDEWAYS_RIGHT_FB".."26",
        "FACE_EXPRESSION_JAW_THRUST_FB".."27",
        "FACE_EXPRESSION_LID_TIGHTENER_L_FB".."28",
        "FACE_EXPRESSION_LID_TIGHTENER_R_FB".."29",
        "FACE_EXPRESSION_LIP_CORNER_DEPRESSOR_L_FB".."30",
        "FACE_EXPRESSION_LIP_CORNER_DEPRESSOR_R_FB".."31",
        "FACE_EXPRESSION_LIP_CORNER_PULLER_L_FB".."32",
        "FACE_EXPRESSION_LIP_CORNER_PULLER_R_FB".."33",
        "FACE_EXPRESSION_LIP_FUNNELER_LB_FB".."34",
        "FACE_EXPRESSION_LIP_FUNNELER_LT_FB".."35",
        "FACE_EXPRESSION_LIP_FUNNELER_RB_FB".."36",
        "FACE_EXPRESSION_LIP_FUNNELER_RT_FB".."37",
        "FACE_EXPRESSION_LIP_PRESSOR_L_FB".."38",
        "FACE_EXPRESSION_LIP_PRESSOR_R_FB".."39",
        "FACE_EXPRESSION_LIP_PUCKER_L_FB".."40",
        "FACE_EXPRESSION_LIP_PUCKER_R_FB".."41",
        "FACE_EXPRESSION_LIP_STRETCHER_L_FB".."42",
        "FACE_EXPRESSION_LIP_STRETCHER_R_FB".."43",
        "FACE_EXPRESSION_LIP_SUCK_LB_FB".."44",
        "FACE_EXPRESSION_LIP_SUCK_LT_FB".."45",
        "FACE_EXPRESSION_LIP_SUCK_RB_FB".."46",
        "FACE_EXPRESSION_LIP_SUCK_RT_FB".."47",
        "FACE_EXPRESSION_LIP_TIGHTENER_L_FB".."48",
        "FACE_EXPRESSION_LIP_TIGHTENER_R_FB".."49",
        "FACE_EXPRESSION_LIPS_TOWARD_FB".."50",
        "FACE_EXPRESSION_LOWER_LIP_DEPRESSOR_L_FB".."51",
        "FACE_EXPRESSION_LOWER_LIP_DEPRESSOR_R_FB".."52",
        "FACE_EXPRESSION_MOUTH_LEFT_FB".."53",
        "FACE_EXPRESSION_MOUTH_RIGHT_FB".."54",
        "FACE_EXPRESSION_NOSE_WRINKLER_L_FB".."55",
        "FACE_EXPRESSION_NOSE_WRINKLER_R_FB".."56",
        "FACE_EXPRESSION_OUTER_BROW_RAISER_L_FB".."57",
        "FACE_EXPRESSION_OUTER_BROW_RAISER_R_FB".."58",
        "FACE_EXPRESSION_UPPER_LID_RAISER_L_FB".."59",
        "FACE_EXPRESSION_UPPER_LID_RAISER_R_FB".."60",
        "FACE_EXPRESSION_UPPER_LIP_RAISER_L_FB".."61",
        "FACE_EXPRESSION_UPPER_LIP_RAISER_R_FB".."62",
        "FACE_EXPRESSION_COUNT_FB".."63"
    )

    EnumConstant(
        """
        XrFaceExpressionSetFB - The set of blend shapes of a facial expression to track.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FACE_EXPRESSION_SET_DEFAULT_FB — indicates that the created {@code XrFaceTrackerFB} tracks the set of blend shapes described by {@code XrFaceExpressionFB} enum, i.e. the #GetFaceExpressionWeightsFB() function returns an array of blend shapes with the count of #FACE_EXPRESSION_COUNT_FB and <b>can</b> be indexed using {@code XrFaceExpressionFB}.</li>
        </ul>

        <h5>See Also</h5>
        ##XrFaceTrackerCreateInfoFB
        """,

        "FACE_EXPRESSION_SET_DEFAULT_FB".."0"
    )

    EnumConstant(
        """
        XrFaceConfidenceFB - The name of face areas where confidence is known

        <h5>Description</h5>
        The "upper face" area represents everything above the upper lip, including eye, eyebrows + cheek, and nose. The "lower face" area represents everything under eyes, including mouth, chin + cheek, and nose. Cheek and nose areas contribute to both "upper face" and "lower face" areas.
        """,

        "FACE_CONFIDENCE_LOWER_FACE_FB".."0",
        "FACE_CONFIDENCE_UPPER_FACE_FB".."1",
        "FACE_CONFIDENCE_COUNT_FB".."2"
    )

    XrResult(
        "CreateFaceTrackerFB",
        """
        Create a face tracking handle.

        <h5>C Specification</h5>
        The #CreateFaceTrackerFB() function is defined as:

        <pre><code>
￿XrResult xrCreateFaceTrackerFB(
￿    XrSession                                   session,
￿    const XrFaceTrackerCreateInfoFB*            createInfo,
￿    XrFaceTrackerFB*                            faceTracker);</code></pre>

        <h5>Description</h5>
        An application <b>can</b> create an {@code XrFaceTrackerFB} handle using #CreateFaceTrackerFB() function.

        If the system does not support face tracking, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateFaceTrackerFB(). In this case, the runtime <b>must</b> return #FALSE for {@code supportsFaceTracking} in ##XrSystemFaceTrackingPropertiesFB when the function #GetSystemProperties() is called, so that the application <b>can</b> avoid creating a face tracker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to calling #CreateFaceTrackerFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrFaceTrackerCreateInfoFB structure</li>
            <li>{@code faceTracker} <b>must</b> be a pointer to an {@code XrFaceTrackerFB} handle</li>
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
        ##XrFaceTrackerCreateInfoFB
        """,

        XrSession("session", "an {@code XrSession} in which the face tracker will be active."),
        XrFaceTrackerCreateInfoFB.const.p("createInfo", "the ##XrFaceTrackerCreateInfoFB used to specify the face tracker."),
        Check(1)..XrFaceTrackerFB.p("faceTracker", "the returned {@code XrFaceTrackerFB} handle.")
    )

    XrResult(
        "DestroyFaceTrackerFB",
        """
        Destroy a facial expressions handle.

        <h5>C Specification</h5>
        The #DestroyFaceTrackerFB() function releases the {@code faceTracker} and the underlying resources when face tracking experience is over.

        <pre><code>
￿XrResult xrDestroyFaceTrackerFB(
￿    XrFaceTrackerFB                             faceTracker);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to calling #DestroyFaceTrackerFB()</li>
            <li>{@code faceTracker} <b>must</b> be a valid {@code XrFaceTrackerFB} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code faceTracker}, and any child handles, <b>must</b> be externally synchronized</li>
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

        XrFaceTrackerFB("faceTracker", "an {@code XrFaceTrackerFB} previously created by #CreateFaceTrackerFB().")
    )

    XrResult(
        "GetFaceExpressionWeightsFB",
        """
        Obtain blend shapes of facial expression.

        <h5>C Specification</h5>
        The #GetFaceExpressionWeightsFB() function return blend shapes of facial expression at a given time.

        <pre><code>
￿XrResult xrGetFaceExpressionWeightsFB(
￿    XrFaceTrackerFB                             faceTracker,
￿    const XrFaceExpressionInfoFB*               expressionInfo,
￿    XrFaceExpressionWeightsFB*                  expressionWeights);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to calling #GetFaceExpressionWeightsFB()</li>
            <li>{@code faceTracker} <b>must</b> be a valid {@code XrFaceTrackerFB} handle</li>
            <li>{@code expressionInfo} <b>must</b> be a pointer to a valid ##XrFaceExpressionInfoFB structure</li>
            <li>{@code expressionWeights} <b>must</b> be a pointer to an ##XrFaceExpressionWeightsFB structure</li>
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
        ##XrFaceExpressionInfoFB, ##XrFaceExpressionWeightsFB
        """,

        XrFaceTrackerFB("faceTracker", "an {@code XrFaceTrackerFB} previously created by #CreateFaceTrackerFB()."),
        XrFaceExpressionInfoFB.const.p("expressionInfo", "a pointer to ##XrFaceExpressionInfoFB describing information to obtain face expression."),
        XrFaceExpressionWeightsFB.p("expressionWeights", "a pointer to ##XrFaceExpressionWeightsFB receiving the returned facial expression weights.")
    )
}