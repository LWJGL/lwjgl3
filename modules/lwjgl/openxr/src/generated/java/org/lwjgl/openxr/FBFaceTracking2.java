/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_FB_face_tracking2">XR_FB_face_tracking2</a> extension.
 * 
 * <p>This extension enables applications to get weights of blend shapes. It also enables applications to render facial expressions in XR experiences.</p>
 * 
 * <p>It is recommended to choose this extension over the {@link FBFaceTracking XR_FB_face_tracking} extension, if it is supported by the runtime, because this extension provides the following two additional capabilities to the application:</p>
 * 
 * <ul>
 * <li>This extension provides additional seven blend shapes that estimate tongue movement.</li>
 * <li>This extension allows an application and the runtime to communicate about the data sources that are used to estimate facial expression in a cooperative manner.</li>
 * </ul>
 * 
 * <p>Face tracking data is sensitive personal information and is closely linked to personal privacy and integrity. Applications storing or transferring face tracking data <b>should</b> always ask the user for active and specific acceptance to do so.</p>
 * 
 * <p>If the runtime supports a permission system to control application access to the face tracker, then the runtime <b>must</b> set the {@code isValid} field to {@link XR10#XR_FALSE FALSE} on the supplied {@link XrFaceExpressionWeights2FB} structure until the user allows the application to access the face tracker. When the application access has been allowed, the runtime <b>should</b> set {@code isValid} on the supplied {@link XrFaceExpressionWeights2FB} structure to {@link XR10#XR_TRUE TRUE}.</p>
 * 
 * <p>Some permission systems <b>may</b> control access to the eye tracking separately from access to the face tracking, even though the eyes are part of the face. In case the user denied tracking of the eyes, yet, allowed tracking of the face, then the runtime <b>must</b> set the {@code isEyeFollowingBlendshapesValid} field to {@link XR10#XR_FALSE FALSE} on the supplied {@link XrFaceExpressionWeights2FB} for indicating that eye tracking data is not available, but at the same time <b>may</b> set the {@code isValid} field to {@link XR10#XR_TRUE TRUE} on the supplied {@link XrFaceExpressionWeights2FB} for indicating that another part of the face is tracked properly.</p>
 */
public class FBFaceTracking2 {

    /** The extension specification version. */
    public static final int XR_FB_face_tracking2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_FACE_TRACKING2_EXTENSION_NAME = "XR_FB_face_tracking2";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_FACE_TRACKER2_FB = 1000287012;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB}</li>
     * <li>{@link #XR_TYPE_FACE_TRACKER_CREATE_INFO2_FB TYPE_FACE_TRACKER_CREATE_INFO2_FB}</li>
     * <li>{@link #XR_TYPE_FACE_EXPRESSION_INFO2_FB TYPE_FACE_EXPRESSION_INFO2_FB}</li>
     * <li>{@link #XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB TYPE_FACE_EXPRESSION_WEIGHTS2_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB = 1000287013,
        XR_TYPE_FACE_TRACKER_CREATE_INFO2_FB        = 1000287014,
        XR_TYPE_FACE_EXPRESSION_INFO2_FB            = 1000287015,
        XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB         = 1000287016;

    /**
     * XrFaceExpression2FB - The name of blend shapes that are trackable
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_FACE_EXPRESSION2_BROW_LOWERER_L_FB FACE_EXPRESSION2_BROW_LOWERER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_BROW_LOWERER_R_FB FACE_EXPRESSION2_BROW_LOWERER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_CHEEK_PUFF_L_FB FACE_EXPRESSION2_CHEEK_PUFF_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_CHEEK_PUFF_R_FB FACE_EXPRESSION2_CHEEK_PUFF_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_CHEEK_RAISER_L_FB FACE_EXPRESSION2_CHEEK_RAISER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_CHEEK_RAISER_R_FB FACE_EXPRESSION2_CHEEK_RAISER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_CHEEK_SUCK_L_FB FACE_EXPRESSION2_CHEEK_SUCK_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_CHEEK_SUCK_R_FB FACE_EXPRESSION2_CHEEK_SUCK_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_CHIN_RAISER_B_FB FACE_EXPRESSION2_CHIN_RAISER_B_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_CHIN_RAISER_T_FB FACE_EXPRESSION2_CHIN_RAISER_T_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_DIMPLER_L_FB FACE_EXPRESSION2_DIMPLER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_DIMPLER_R_FB FACE_EXPRESSION2_DIMPLER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_EYES_CLOSED_L_FB FACE_EXPRESSION2_EYES_CLOSED_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_EYES_CLOSED_R_FB FACE_EXPRESSION2_EYES_CLOSED_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_EYES_LOOK_DOWN_L_FB FACE_EXPRESSION2_EYES_LOOK_DOWN_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_EYES_LOOK_DOWN_R_FB FACE_EXPRESSION2_EYES_LOOK_DOWN_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_EYES_LOOK_LEFT_L_FB FACE_EXPRESSION2_EYES_LOOK_LEFT_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_EYES_LOOK_LEFT_R_FB FACE_EXPRESSION2_EYES_LOOK_LEFT_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_EYES_LOOK_RIGHT_L_FB FACE_EXPRESSION2_EYES_LOOK_RIGHT_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_EYES_LOOK_RIGHT_R_FB FACE_EXPRESSION2_EYES_LOOK_RIGHT_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_EYES_LOOK_UP_L_FB FACE_EXPRESSION2_EYES_LOOK_UP_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_EYES_LOOK_UP_R_FB FACE_EXPRESSION2_EYES_LOOK_UP_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_INNER_BROW_RAISER_L_FB FACE_EXPRESSION2_INNER_BROW_RAISER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_INNER_BROW_RAISER_R_FB FACE_EXPRESSION2_INNER_BROW_RAISER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_JAW_DROP_FB FACE_EXPRESSION2_JAW_DROP_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_JAW_SIDEWAYS_LEFT_FB FACE_EXPRESSION2_JAW_SIDEWAYS_LEFT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_JAW_SIDEWAYS_RIGHT_FB FACE_EXPRESSION2_JAW_SIDEWAYS_RIGHT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_JAW_THRUST_FB FACE_EXPRESSION2_JAW_THRUST_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LID_TIGHTENER_L_FB FACE_EXPRESSION2_LID_TIGHTENER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LID_TIGHTENER_R_FB FACE_EXPRESSION2_LID_TIGHTENER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_CORNER_DEPRESSOR_L_FB FACE_EXPRESSION2_LIP_CORNER_DEPRESSOR_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_CORNER_DEPRESSOR_R_FB FACE_EXPRESSION2_LIP_CORNER_DEPRESSOR_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_CORNER_PULLER_L_FB FACE_EXPRESSION2_LIP_CORNER_PULLER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_CORNER_PULLER_R_FB FACE_EXPRESSION2_LIP_CORNER_PULLER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_FUNNELER_LB_FB FACE_EXPRESSION2_LIP_FUNNELER_LB_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_FUNNELER_LT_FB FACE_EXPRESSION2_LIP_FUNNELER_LT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_FUNNELER_RB_FB FACE_EXPRESSION2_LIP_FUNNELER_RB_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_FUNNELER_RT_FB FACE_EXPRESSION2_LIP_FUNNELER_RT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_PRESSOR_L_FB FACE_EXPRESSION2_LIP_PRESSOR_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_PRESSOR_R_FB FACE_EXPRESSION2_LIP_PRESSOR_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_PUCKER_L_FB FACE_EXPRESSION2_LIP_PUCKER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_PUCKER_R_FB FACE_EXPRESSION2_LIP_PUCKER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_STRETCHER_L_FB FACE_EXPRESSION2_LIP_STRETCHER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_STRETCHER_R_FB FACE_EXPRESSION2_LIP_STRETCHER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_SUCK_LB_FB FACE_EXPRESSION2_LIP_SUCK_LB_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_SUCK_LT_FB FACE_EXPRESSION2_LIP_SUCK_LT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_SUCK_RB_FB FACE_EXPRESSION2_LIP_SUCK_RB_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_SUCK_RT_FB FACE_EXPRESSION2_LIP_SUCK_RT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_TIGHTENER_L_FB FACE_EXPRESSION2_LIP_TIGHTENER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIP_TIGHTENER_R_FB FACE_EXPRESSION2_LIP_TIGHTENER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LIPS_TOWARD_FB FACE_EXPRESSION2_LIPS_TOWARD_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LOWER_LIP_DEPRESSOR_L_FB FACE_EXPRESSION2_LOWER_LIP_DEPRESSOR_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_LOWER_LIP_DEPRESSOR_R_FB FACE_EXPRESSION2_LOWER_LIP_DEPRESSOR_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_MOUTH_LEFT_FB FACE_EXPRESSION2_MOUTH_LEFT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_MOUTH_RIGHT_FB FACE_EXPRESSION2_MOUTH_RIGHT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_NOSE_WRINKLER_L_FB FACE_EXPRESSION2_NOSE_WRINKLER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_NOSE_WRINKLER_R_FB FACE_EXPRESSION2_NOSE_WRINKLER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_OUTER_BROW_RAISER_L_FB FACE_EXPRESSION2_OUTER_BROW_RAISER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_OUTER_BROW_RAISER_R_FB FACE_EXPRESSION2_OUTER_BROW_RAISER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_UPPER_LID_RAISER_L_FB FACE_EXPRESSION2_UPPER_LID_RAISER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_UPPER_LID_RAISER_R_FB FACE_EXPRESSION2_UPPER_LID_RAISER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_UPPER_LIP_RAISER_L_FB FACE_EXPRESSION2_UPPER_LIP_RAISER_L_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_UPPER_LIP_RAISER_R_FB FACE_EXPRESSION2_UPPER_LIP_RAISER_R_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_TONGUE_TIP_INTERDENTAL_FB FACE_EXPRESSION2_TONGUE_TIP_INTERDENTAL_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_TONGUE_TIP_ALVEOLAR_FB FACE_EXPRESSION2_TONGUE_TIP_ALVEOLAR_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_TONGUE_FRONT_DORSAL_PALATE_FB FACE_EXPRESSION2_TONGUE_FRONT_DORSAL_PALATE_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_TONGUE_MID_DORSAL_PALATE_FB FACE_EXPRESSION2_TONGUE_MID_DORSAL_PALATE_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_TONGUE_BACK_DORSAL_VELAR_FB FACE_EXPRESSION2_TONGUE_BACK_DORSAL_VELAR_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_TONGUE_OUT_FB FACE_EXPRESSION2_TONGUE_OUT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_TONGUE_RETREAT_FB FACE_EXPRESSION2_TONGUE_RETREAT_FB}</li>
     * <li>{@link #XR_FACE_EXPRESSION2_COUNT_FB FACE_EXPRESSION2_COUNT_FB}</li>
     * </ul>
     */
    public static final int
        XR_FACE_EXPRESSION2_BROW_LOWERER_L_FB             = 0,
        XR_FACE_EXPRESSION2_BROW_LOWERER_R_FB             = 1,
        XR_FACE_EXPRESSION2_CHEEK_PUFF_L_FB               = 2,
        XR_FACE_EXPRESSION2_CHEEK_PUFF_R_FB               = 3,
        XR_FACE_EXPRESSION2_CHEEK_RAISER_L_FB             = 4,
        XR_FACE_EXPRESSION2_CHEEK_RAISER_R_FB             = 5,
        XR_FACE_EXPRESSION2_CHEEK_SUCK_L_FB               = 6,
        XR_FACE_EXPRESSION2_CHEEK_SUCK_R_FB               = 7,
        XR_FACE_EXPRESSION2_CHIN_RAISER_B_FB              = 8,
        XR_FACE_EXPRESSION2_CHIN_RAISER_T_FB              = 9,
        XR_FACE_EXPRESSION2_DIMPLER_L_FB                  = 10,
        XR_FACE_EXPRESSION2_DIMPLER_R_FB                  = 11,
        XR_FACE_EXPRESSION2_EYES_CLOSED_L_FB              = 12,
        XR_FACE_EXPRESSION2_EYES_CLOSED_R_FB              = 13,
        XR_FACE_EXPRESSION2_EYES_LOOK_DOWN_L_FB           = 14,
        XR_FACE_EXPRESSION2_EYES_LOOK_DOWN_R_FB           = 15,
        XR_FACE_EXPRESSION2_EYES_LOOK_LEFT_L_FB           = 16,
        XR_FACE_EXPRESSION2_EYES_LOOK_LEFT_R_FB           = 17,
        XR_FACE_EXPRESSION2_EYES_LOOK_RIGHT_L_FB          = 18,
        XR_FACE_EXPRESSION2_EYES_LOOK_RIGHT_R_FB          = 19,
        XR_FACE_EXPRESSION2_EYES_LOOK_UP_L_FB             = 20,
        XR_FACE_EXPRESSION2_EYES_LOOK_UP_R_FB             = 21,
        XR_FACE_EXPRESSION2_INNER_BROW_RAISER_L_FB        = 22,
        XR_FACE_EXPRESSION2_INNER_BROW_RAISER_R_FB        = 23,
        XR_FACE_EXPRESSION2_JAW_DROP_FB                   = 24,
        XR_FACE_EXPRESSION2_JAW_SIDEWAYS_LEFT_FB          = 25,
        XR_FACE_EXPRESSION2_JAW_SIDEWAYS_RIGHT_FB         = 26,
        XR_FACE_EXPRESSION2_JAW_THRUST_FB                 = 27,
        XR_FACE_EXPRESSION2_LID_TIGHTENER_L_FB            = 28,
        XR_FACE_EXPRESSION2_LID_TIGHTENER_R_FB            = 29,
        XR_FACE_EXPRESSION2_LIP_CORNER_DEPRESSOR_L_FB     = 30,
        XR_FACE_EXPRESSION2_LIP_CORNER_DEPRESSOR_R_FB     = 31,
        XR_FACE_EXPRESSION2_LIP_CORNER_PULLER_L_FB        = 32,
        XR_FACE_EXPRESSION2_LIP_CORNER_PULLER_R_FB        = 33,
        XR_FACE_EXPRESSION2_LIP_FUNNELER_LB_FB            = 34,
        XR_FACE_EXPRESSION2_LIP_FUNNELER_LT_FB            = 35,
        XR_FACE_EXPRESSION2_LIP_FUNNELER_RB_FB            = 36,
        XR_FACE_EXPRESSION2_LIP_FUNNELER_RT_FB            = 37,
        XR_FACE_EXPRESSION2_LIP_PRESSOR_L_FB              = 38,
        XR_FACE_EXPRESSION2_LIP_PRESSOR_R_FB              = 39,
        XR_FACE_EXPRESSION2_LIP_PUCKER_L_FB               = 40,
        XR_FACE_EXPRESSION2_LIP_PUCKER_R_FB               = 41,
        XR_FACE_EXPRESSION2_LIP_STRETCHER_L_FB            = 42,
        XR_FACE_EXPRESSION2_LIP_STRETCHER_R_FB            = 43,
        XR_FACE_EXPRESSION2_LIP_SUCK_LB_FB                = 44,
        XR_FACE_EXPRESSION2_LIP_SUCK_LT_FB                = 45,
        XR_FACE_EXPRESSION2_LIP_SUCK_RB_FB                = 46,
        XR_FACE_EXPRESSION2_LIP_SUCK_RT_FB                = 47,
        XR_FACE_EXPRESSION2_LIP_TIGHTENER_L_FB            = 48,
        XR_FACE_EXPRESSION2_LIP_TIGHTENER_R_FB            = 49,
        XR_FACE_EXPRESSION2_LIPS_TOWARD_FB                = 50,
        XR_FACE_EXPRESSION2_LOWER_LIP_DEPRESSOR_L_FB      = 51,
        XR_FACE_EXPRESSION2_LOWER_LIP_DEPRESSOR_R_FB      = 52,
        XR_FACE_EXPRESSION2_MOUTH_LEFT_FB                 = 53,
        XR_FACE_EXPRESSION2_MOUTH_RIGHT_FB                = 54,
        XR_FACE_EXPRESSION2_NOSE_WRINKLER_L_FB            = 55,
        XR_FACE_EXPRESSION2_NOSE_WRINKLER_R_FB            = 56,
        XR_FACE_EXPRESSION2_OUTER_BROW_RAISER_L_FB        = 57,
        XR_FACE_EXPRESSION2_OUTER_BROW_RAISER_R_FB        = 58,
        XR_FACE_EXPRESSION2_UPPER_LID_RAISER_L_FB         = 59,
        XR_FACE_EXPRESSION2_UPPER_LID_RAISER_R_FB         = 60,
        XR_FACE_EXPRESSION2_UPPER_LIP_RAISER_L_FB         = 61,
        XR_FACE_EXPRESSION2_UPPER_LIP_RAISER_R_FB         = 62,
        XR_FACE_EXPRESSION2_TONGUE_TIP_INTERDENTAL_FB     = 63,
        XR_FACE_EXPRESSION2_TONGUE_TIP_ALVEOLAR_FB        = 64,
        XR_FACE_EXPRESSION2_TONGUE_FRONT_DORSAL_PALATE_FB = 65,
        XR_FACE_EXPRESSION2_TONGUE_MID_DORSAL_PALATE_FB   = 66,
        XR_FACE_EXPRESSION2_TONGUE_BACK_DORSAL_VELAR_FB   = 67,
        XR_FACE_EXPRESSION2_TONGUE_OUT_FB                 = 68,
        XR_FACE_EXPRESSION2_TONGUE_RETREAT_FB             = 69,
        XR_FACE_EXPRESSION2_COUNT_FB                      = 70;

    /**
     * XrFaceExpressionSet2FB - The set of blend shapes of a facial expression to track.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FACE_EXPRESSION_SET2_DEFAULT_FB FACE_EXPRESSION_SET2_DEFAULT_FB} — indicates that the created {@code XrFaceTracker2FB} tracks the set of blend shapes described by {@code XrFaceExpression2FB} enum, i.e. the {@link #xrGetFaceExpressionWeights2FB GetFaceExpressionWeights2FB} function returns an array of blend shapes with the count of {@link #XR_FACE_EXPRESSION2_COUNT_FB FACE_EXPRESSION2_COUNT_FB} and <b>can</b> be indexed using {@code XrFaceExpression2FB}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFaceTrackerCreateInfo2FB}</p>
     */
    public static final int XR_FACE_EXPRESSION_SET2_DEFAULT_FB = 0;

    /**
     * XrFaceTrackingDataSource2FB - Data source that is used to estimate facial expression.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FACE_TRACKING_DATA_SOURCE2_VISUAL_FB FACE_TRACKING_DATA_SOURCE2_VISUAL_FB} - This value indicates that the face tracking data source supports using visual data to estimate facial expression. The runtime <b>may</b> also use audio to further improve the quality of the tracking.</li>
     * <li>{@link #XR_FACE_TRACKING_DATA_SOURCE2_AUDIO_FB FACE_TRACKING_DATA_SOURCE2_AUDIO_FB} - This value indicates that the face tracking data source supports using audio data to estimate facial expression. The runtime <b>must</b> not use visual data for this data source.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFaceExpressionWeights2FB}, {@link XrFaceTrackerCreateInfo2FB}</p>
     */
    public static final int
        XR_FACE_TRACKING_DATA_SOURCE2_VISUAL_FB = 0,
        XR_FACE_TRACKING_DATA_SOURCE2_AUDIO_FB  = 1;

    /**
     * XrFaceConfidence2FB - The name of face areas where confidence is known
     * 
     * <h5>Description</h5>
     * 
     * <p>The "upper face" area represents everything above the upper lip, including the eyes and eyebrows. The "lower face" area represents everything under the eyes, including the mouth and chin. Cheek and nose areas contribute to both "upper face" and "lower face" areas.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_FACE_CONFIDENCE2_LOWER_FACE_FB FACE_CONFIDENCE2_LOWER_FACE_FB}</li>
     * <li>{@link #XR_FACE_CONFIDENCE2_UPPER_FACE_FB FACE_CONFIDENCE2_UPPER_FACE_FB}</li>
     * <li>{@link #XR_FACE_CONFIDENCE2_COUNT_FB FACE_CONFIDENCE2_COUNT_FB}</li>
     * </ul>
     */
    public static final int
        XR_FACE_CONFIDENCE2_LOWER_FACE_FB = 0,
        XR_FACE_CONFIDENCE2_UPPER_FACE_FB = 1,
        XR_FACE_CONFIDENCE2_COUNT_FB      = 2;

    protected FBFaceTracking2() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateFaceTracker2FB ] ---

    /** Unsafe version of: {@link #xrCreateFaceTracker2FB CreateFaceTracker2FB} */
    public static int nxrCreateFaceTracker2FB(XrSession session, long createInfo, long faceTracker) {
        long __functionAddress = session.getCapabilities().xrCreateFaceTracker2FB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, faceTracker, __functionAddress);
    }

    /**
     * Create a face tracking handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateFaceTracker2FB CreateFaceTracker2FB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateFaceTracker2FB(
     *     XrSession                                   session,
     *     const XrFaceTrackerCreateInfo2FB*           createInfo,
     *     XrFaceTracker2FB*                           faceTracker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>An application <b>can</b> create an {@code XrFaceTracker2FB} handle using {@link #xrCreateFaceTracker2FB CreateFaceTracker2FB} function.</p>
     * 
     * <p>If the system does not support face tracking, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrCreateFaceTracker2FB CreateFaceTracker2FB}. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for both {@link XrSystemFaceTrackingProperties2FB}{@code ::supportsVisualFaceTracking} and {@link XrSystemFaceTrackingProperties2FB}{@code ::supportsAudioFaceTracking} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application <b>can</b> avoid creating a face tracker.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBFaceTracking2 XR_FB_face_tracking2} extension <b>must</b> be enabled prior to calling {@link #xrCreateFaceTracker2FB CreateFaceTracker2FB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrFaceTrackerCreateInfo2FB} structure</li>
     * <li>{@code faceTracker} <b>must</b> be a pointer to an {@code XrFaceTracker2FB} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFaceTrackerCreateInfo2FB}</p>
     *
     * @param session     an {@code XrSession} in which the face tracker will be active.
     * @param createInfo  the {@link XrFaceTrackerCreateInfo2FB} used to specify the face tracker.
     * @param faceTracker the returned {@code XrFaceTracker2FB} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateFaceTracker2FB(XrSession session, @NativeType("XrFaceTrackerCreateInfo2FB const *") XrFaceTrackerCreateInfo2FB createInfo, @NativeType("XrFaceTracker2FB *") PointerBuffer faceTracker) {
        if (CHECKS) {
            check(faceTracker, 1);
        }
        return nxrCreateFaceTracker2FB(session, createInfo.address(), memAddress(faceTracker));
    }

    // --- [ xrDestroyFaceTracker2FB ] ---

    /**
     * Destroy a facial expressions handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyFaceTracker2FB DestroyFaceTracker2FB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyFaceTracker2FB(
     *     XrFaceTracker2FB                            faceTracker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrDestroyFaceTracker2FB DestroyFaceTracker2FB} function releases the {@code faceTracker} and the underlying resources when face tracking experience is over.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBFaceTracking2 XR_FB_face_tracking2} extension <b>must</b> be enabled prior to calling {@link #xrDestroyFaceTracker2FB DestroyFaceTracker2FB}</li>
     * <li>{@code faceTracker} <b>must</b> be a valid {@code XrFaceTracker2FB} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code faceTracker}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     *
     * @param faceTracker an {@code XrFaceTracker2FB} previously created by {@link #xrCreateFaceTracker2FB CreateFaceTracker2FB}.
     */
    @NativeType("XrResult")
    public static int xrDestroyFaceTracker2FB(XrFaceTracker2FB faceTracker) {
        long __functionAddress = faceTracker.getCapabilities().xrDestroyFaceTracker2FB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(faceTracker.address(), __functionAddress);
    }

    // --- [ xrGetFaceExpressionWeights2FB ] ---

    /** Unsafe version of: {@link #xrGetFaceExpressionWeights2FB GetFaceExpressionWeights2FB} */
    public static int nxrGetFaceExpressionWeights2FB(XrFaceTracker2FB faceTracker, long expressionInfo, long expressionWeights) {
        long __functionAddress = faceTracker.getCapabilities().xrGetFaceExpressionWeights2FB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(faceTracker.address(), expressionInfo, expressionWeights, __functionAddress);
    }

    /**
     * Obtain blend shapes of facial expression.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetFaceExpressionWeights2FB GetFaceExpressionWeights2FB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetFaceExpressionWeights2FB(
     *     XrFaceTracker2FB                            faceTracker,
     *     const XrFaceExpressionInfo2FB*              expressionInfo,
     *     XrFaceExpressionWeights2FB*                 expressionWeights);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetFaceExpressionWeights2FB GetFaceExpressionWeights2FB} function return blend shapes of facial expression at a given time.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBFaceTracking2 XR_FB_face_tracking2} extension <b>must</b> be enabled prior to calling {@link #xrGetFaceExpressionWeights2FB GetFaceExpressionWeights2FB}</li>
     * <li>{@code faceTracker} <b>must</b> be a valid {@code XrFaceTracker2FB} handle</li>
     * <li>{@code expressionInfo} <b>must</b> be a pointer to a valid {@link XrFaceExpressionInfo2FB} structure</li>
     * <li>{@code expressionWeights} <b>must</b> be a pointer to an {@link XrFaceExpressionWeights2FB} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFaceExpressionInfo2FB}, {@link XrFaceExpressionWeights2FB}</p>
     *
     * @param faceTracker       an {@code XrFaceTracker2FB} previously created by {@link #xrCreateFaceTracker2FB CreateFaceTracker2FB}.
     * @param expressionInfo    a pointer to {@link XrFaceExpressionInfo2FB} describing information to obtain face expression.
     * @param expressionWeights a pointer to {@link XrFaceExpressionWeights2FB} receiving the returned facial expression weights.
     */
    @NativeType("XrResult")
    public static int xrGetFaceExpressionWeights2FB(XrFaceTracker2FB faceTracker, @NativeType("XrFaceExpressionInfo2FB const *") XrFaceExpressionInfo2FB expressionInfo, @NativeType("XrFaceExpressionWeights2FB *") XrFaceExpressionWeights2FB expressionWeights) {
        return nxrGetFaceExpressionWeights2FB(faceTracker, expressionInfo.address(), expressionWeights.address());
    }

}