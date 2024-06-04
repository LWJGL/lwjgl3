/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_face_tracking2 = "FBFaceTracking2".nativeClassXR("FB_face_tracking2", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_FB_face_tracking2">XR_FB_face_tracking2</a> extension.

        This extension enables applications to get weights of blend shapes. It also enables applications to render facial expressions in XR experiences.

        It is recommended to choose this extension over the {@link FBFaceTracking XR_FB_face_tracking} extension, if it is supported by the runtime, because this extension provides the following two additional capabilities to the application:

        <ul>
            <li>This extension provides additional seven blend shapes that estimate tongue movement.</li>
            <li>This extension allows an application and the runtime to communicate about the data sources that are used to estimate facial expression in a cooperative manner.</li>
        </ul>

        Face tracking data is sensitive personal information and is closely linked to personal privacy and integrity. Applications storing or transferring face tracking data <b>should</b> always ask the user for active and specific acceptance to do so.

        If the runtime supports a permission system to control application access to the face tracker, then the runtime <b>must</b> set the {@code isValid} field to #FALSE on the supplied ##XrFaceExpressionWeights2FB structure until the user allows the application to access the face tracker. When the application access has been allowed, the runtime <b>should</b> set {@code isValid} on the supplied ##XrFaceExpressionWeights2FB structure to #TRUE.

        Some permission systems <b>may</b> control access to the eye tracking separately from access to the face tracking, even though the eyes are part of the face. In case the user denied tracking of the eyes, yet, allowed tracking of the face, then the runtime <b>must</b> set the {@code isEyeFollowingBlendshapesValid} field to #FALSE on the supplied ##XrFaceExpressionWeights2FB for indicating that eye tracking data is not available, but at the same time <b>may</b> set the {@code isValid} field to #TRUE on the supplied ##XrFaceExpressionWeights2FB for indicating that another part of the face is tracked properly.
        """

    IntConstant(
        "The extension specification version.",

        "FB_face_tracking2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_FACE_TRACKING2_EXTENSION_NAME".."XR_FB_face_tracking2"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_FACE_TRACKER2_FB".."1000287012"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB".."1000287013",
        "TYPE_FACE_TRACKER_CREATE_INFO2_FB".."1000287014",
        "TYPE_FACE_EXPRESSION_INFO2_FB".."1000287015",
        "TYPE_FACE_EXPRESSION_WEIGHTS2_FB".."1000287016"
    )

    EnumConstant(
        """
        XrFaceExpression2FB - The name of blend shapes that are trackable
        """,

        "FACE_EXPRESSION2_BROW_LOWERER_L_FB".."0",
        "FACE_EXPRESSION2_BROW_LOWERER_R_FB".."1",
        "FACE_EXPRESSION2_CHEEK_PUFF_L_FB".."2",
        "FACE_EXPRESSION2_CHEEK_PUFF_R_FB".."3",
        "FACE_EXPRESSION2_CHEEK_RAISER_L_FB".."4",
        "FACE_EXPRESSION2_CHEEK_RAISER_R_FB".."5",
        "FACE_EXPRESSION2_CHEEK_SUCK_L_FB".."6",
        "FACE_EXPRESSION2_CHEEK_SUCK_R_FB".."7",
        "FACE_EXPRESSION2_CHIN_RAISER_B_FB".."8",
        "FACE_EXPRESSION2_CHIN_RAISER_T_FB".."9",
        "FACE_EXPRESSION2_DIMPLER_L_FB".."10",
        "FACE_EXPRESSION2_DIMPLER_R_FB".."11",
        "FACE_EXPRESSION2_EYES_CLOSED_L_FB".."12",
        "FACE_EXPRESSION2_EYES_CLOSED_R_FB".."13",
        "FACE_EXPRESSION2_EYES_LOOK_DOWN_L_FB".."14",
        "FACE_EXPRESSION2_EYES_LOOK_DOWN_R_FB".."15",
        "FACE_EXPRESSION2_EYES_LOOK_LEFT_L_FB".."16",
        "FACE_EXPRESSION2_EYES_LOOK_LEFT_R_FB".."17",
        "FACE_EXPRESSION2_EYES_LOOK_RIGHT_L_FB".."18",
        "FACE_EXPRESSION2_EYES_LOOK_RIGHT_R_FB".."19",
        "FACE_EXPRESSION2_EYES_LOOK_UP_L_FB".."20",
        "FACE_EXPRESSION2_EYES_LOOK_UP_R_FB".."21",
        "FACE_EXPRESSION2_INNER_BROW_RAISER_L_FB".."22",
        "FACE_EXPRESSION2_INNER_BROW_RAISER_R_FB".."23",
        "FACE_EXPRESSION2_JAW_DROP_FB".."24",
        "FACE_EXPRESSION2_JAW_SIDEWAYS_LEFT_FB".."25",
        "FACE_EXPRESSION2_JAW_SIDEWAYS_RIGHT_FB".."26",
        "FACE_EXPRESSION2_JAW_THRUST_FB".."27",
        "FACE_EXPRESSION2_LID_TIGHTENER_L_FB".."28",
        "FACE_EXPRESSION2_LID_TIGHTENER_R_FB".."29",
        "FACE_EXPRESSION2_LIP_CORNER_DEPRESSOR_L_FB".."30",
        "FACE_EXPRESSION2_LIP_CORNER_DEPRESSOR_R_FB".."31",
        "FACE_EXPRESSION2_LIP_CORNER_PULLER_L_FB".."32",
        "FACE_EXPRESSION2_LIP_CORNER_PULLER_R_FB".."33",
        "FACE_EXPRESSION2_LIP_FUNNELER_LB_FB".."34",
        "FACE_EXPRESSION2_LIP_FUNNELER_LT_FB".."35",
        "FACE_EXPRESSION2_LIP_FUNNELER_RB_FB".."36",
        "FACE_EXPRESSION2_LIP_FUNNELER_RT_FB".."37",
        "FACE_EXPRESSION2_LIP_PRESSOR_L_FB".."38",
        "FACE_EXPRESSION2_LIP_PRESSOR_R_FB".."39",
        "FACE_EXPRESSION2_LIP_PUCKER_L_FB".."40",
        "FACE_EXPRESSION2_LIP_PUCKER_R_FB".."41",
        "FACE_EXPRESSION2_LIP_STRETCHER_L_FB".."42",
        "FACE_EXPRESSION2_LIP_STRETCHER_R_FB".."43",
        "FACE_EXPRESSION2_LIP_SUCK_LB_FB".."44",
        "FACE_EXPRESSION2_LIP_SUCK_LT_FB".."45",
        "FACE_EXPRESSION2_LIP_SUCK_RB_FB".."46",
        "FACE_EXPRESSION2_LIP_SUCK_RT_FB".."47",
        "FACE_EXPRESSION2_LIP_TIGHTENER_L_FB".."48",
        "FACE_EXPRESSION2_LIP_TIGHTENER_R_FB".."49",
        "FACE_EXPRESSION2_LIPS_TOWARD_FB".."50",
        "FACE_EXPRESSION2_LOWER_LIP_DEPRESSOR_L_FB".."51",
        "FACE_EXPRESSION2_LOWER_LIP_DEPRESSOR_R_FB".."52",
        "FACE_EXPRESSION2_MOUTH_LEFT_FB".."53",
        "FACE_EXPRESSION2_MOUTH_RIGHT_FB".."54",
        "FACE_EXPRESSION2_NOSE_WRINKLER_L_FB".."55",
        "FACE_EXPRESSION2_NOSE_WRINKLER_R_FB".."56",
        "FACE_EXPRESSION2_OUTER_BROW_RAISER_L_FB".."57",
        "FACE_EXPRESSION2_OUTER_BROW_RAISER_R_FB".."58",
        "FACE_EXPRESSION2_UPPER_LID_RAISER_L_FB".."59",
        "FACE_EXPRESSION2_UPPER_LID_RAISER_R_FB".."60",
        "FACE_EXPRESSION2_UPPER_LIP_RAISER_L_FB".."61",
        "FACE_EXPRESSION2_UPPER_LIP_RAISER_R_FB".."62",
        "FACE_EXPRESSION2_TONGUE_TIP_INTERDENTAL_FB".."63",
        "FACE_EXPRESSION2_TONGUE_TIP_ALVEOLAR_FB".."64",
        "FACE_EXPRESSION2_TONGUE_FRONT_DORSAL_PALATE_FB".."65",
        "FACE_EXPRESSION2_TONGUE_MID_DORSAL_PALATE_FB".."66",
        "FACE_EXPRESSION2_TONGUE_BACK_DORSAL_VELAR_FB".."67",
        "FACE_EXPRESSION2_TONGUE_OUT_FB".."68",
        "FACE_EXPRESSION2_TONGUE_RETREAT_FB".."69",
        "FACE_EXPRESSION2_COUNT_FB".."70"
    )

    EnumConstant(
        """
        XrFaceExpressionSet2FB - The set of blend shapes of a facial expression to track.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FACE_EXPRESSION_SET2_DEFAULT_FB — indicates that the created {@code XrFaceTracker2FB} tracks the set of blend shapes described by {@code XrFaceExpression2FB} enum, i.e. the #GetFaceExpressionWeights2FB() function returns an array of blend shapes with the count of #FACE_EXPRESSION2_COUNT_FB and <b>can</b> be indexed using {@code XrFaceExpression2FB}.</li>
        </ul>

        <h5>See Also</h5>
        ##XrFaceTrackerCreateInfo2FB
        """,

        "FACE_EXPRESSION_SET2_DEFAULT_FB".."0"
    )

    EnumConstant(
        """
        XrFaceTrackingDataSource2FB - Data source that is used to estimate facial expression.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FACE_TRACKING_DATA_SOURCE2_VISUAL_FB - This value indicates that the face tracking data source supports using visual data to estimate facial expression. The runtime <b>may</b> also use audio to further improve the quality of the tracking.</li>
            <li>#FACE_TRACKING_DATA_SOURCE2_AUDIO_FB - This value indicates that the face tracking data source supports using audio data to estimate facial expression. The runtime <b>must</b> not use visual data for this data source.</li>
        </ul>

        <h5>See Also</h5>
        ##XrFaceExpressionWeights2FB, ##XrFaceTrackerCreateInfo2FB
        """,

        "FACE_TRACKING_DATA_SOURCE2_VISUAL_FB".."0",
        "FACE_TRACKING_DATA_SOURCE2_AUDIO_FB".."1"
    )

    EnumConstant(
        """
        XrFaceConfidence2FB - The name of face areas where confidence is known

        <h5>Description</h5>
        The "upper face" area represents everything above the upper lip, including the eyes and eyebrows. The "lower face" area represents everything under the eyes, including the mouth and chin. Cheek and nose areas contribute to both "upper face" and "lower face" areas.
        """,

        "FACE_CONFIDENCE2_LOWER_FACE_FB".."0",
        "FACE_CONFIDENCE2_UPPER_FACE_FB".."1",
        "FACE_CONFIDENCE2_COUNT_FB".."2"
    )

    XrResult(
        "CreateFaceTracker2FB",
        """
        Create a face tracking handle.

        <h5>C Specification</h5>
        The #CreateFaceTracker2FB() function is defined as:

        <pre><code>
￿XrResult xrCreateFaceTracker2FB(
￿    XrSession                                   session,
￿    const XrFaceTrackerCreateInfo2FB*           createInfo,
￿    XrFaceTracker2FB*                           faceTracker);</code></pre>

        <h5>Description</h5>
        An application <b>can</b> create an {@code XrFaceTracker2FB} handle using #CreateFaceTracker2FB() function.

        If the system does not support face tracking, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateFaceTracker2FB(). In this case, the runtime <b>must</b> return #FALSE for both ##XrSystemFaceTrackingProperties2FB{@code ::supportsVisualFaceTracking} and ##XrSystemFaceTrackingProperties2FB{@code ::supportsAudioFaceTracking} when the function #GetSystemProperties() is called, so that the application <b>can</b> avoid creating a face tracker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking2 XR_FB_face_tracking2} extension <b>must</b> be enabled prior to calling #CreateFaceTracker2FB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrFaceTrackerCreateInfo2FB structure</li>
            <li>{@code faceTracker} <b>must</b> be a pointer to an {@code XrFaceTracker2FB} handle</li>
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
        ##XrFaceTrackerCreateInfo2FB
        """,

        XrSession("session", "an {@code XrSession} in which the face tracker will be active."),
        XrFaceTrackerCreateInfo2FB.const.p("createInfo", "the ##XrFaceTrackerCreateInfo2FB used to specify the face tracker."),
        Check(1)..XrFaceTracker2FB.p("faceTracker", "the returned {@code XrFaceTracker2FB} handle.")
    )

    XrResult(
        "DestroyFaceTracker2FB",
        """
        Destroy a facial expressions handle.

        <h5>C Specification</h5>
        The #DestroyFaceTracker2FB() function is defined as:

        <pre><code>
￿XrResult xrDestroyFaceTracker2FB(
￿    XrFaceTracker2FB                            faceTracker);</code></pre>

        <h5>Description</h5>
        The #DestroyFaceTracker2FB() function releases the {@code faceTracker} and the underlying resources when face tracking experience is over.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking2 XR_FB_face_tracking2} extension <b>must</b> be enabled prior to calling #DestroyFaceTracker2FB()</li>
            <li>{@code faceTracker} <b>must</b> be a valid {@code XrFaceTracker2FB} handle</li>
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

        XrFaceTracker2FB("faceTracker", "an {@code XrFaceTracker2FB} previously created by #CreateFaceTracker2FB().")
    )

    XrResult(
        "GetFaceExpressionWeights2FB",
        """
        Obtain blend shapes of facial expression.

        <h5>C Specification</h5>
        The #GetFaceExpressionWeights2FB() function is defined as:

        <pre><code>
￿XrResult xrGetFaceExpressionWeights2FB(
￿    XrFaceTracker2FB                            faceTracker,
￿    const XrFaceExpressionInfo2FB*              expressionInfo,
￿    XrFaceExpressionWeights2FB*                 expressionWeights);</code></pre>

        <h5>Description</h5>
        The #GetFaceExpressionWeights2FB() function return blend shapes of facial expression at a given time.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFaceTracking2 XR_FB_face_tracking2} extension <b>must</b> be enabled prior to calling #GetFaceExpressionWeights2FB()</li>
            <li>{@code faceTracker} <b>must</b> be a valid {@code XrFaceTracker2FB} handle</li>
            <li>{@code expressionInfo} <b>must</b> be a pointer to a valid ##XrFaceExpressionInfo2FB structure</li>
            <li>{@code expressionWeights} <b>must</b> be a pointer to an ##XrFaceExpressionWeights2FB structure</li>
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
        ##XrFaceExpressionInfo2FB, ##XrFaceExpressionWeights2FB
        """,

        XrFaceTracker2FB("faceTracker", "an {@code XrFaceTracker2FB} previously created by #CreateFaceTracker2FB()."),
        XrFaceExpressionInfo2FB.const.p("expressionInfo", "a pointer to ##XrFaceExpressionInfo2FB describing information to obtain face expression."),
        XrFaceExpressionWeights2FB.p("expressionWeights", "a pointer to ##XrFaceExpressionWeights2FB receiving the returned facial expression weights.")
    )
}