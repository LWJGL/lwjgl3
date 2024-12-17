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

public class FBFaceTracking2 {

    public static final int XR_FB_face_tracking2_SPEC_VERSION = 1;

    public static final String XR_FB_FACE_TRACKING2_EXTENSION_NAME = "XR_FB_face_tracking2";

    public static final int XR_OBJECT_TYPE_FACE_TRACKER2_FB = 1000287012;

    public static final int
        XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB = 1000287013,
        XR_TYPE_FACE_TRACKER_CREATE_INFO2_FB        = 1000287014,
        XR_TYPE_FACE_EXPRESSION_INFO2_FB            = 1000287015,
        XR_TYPE_FACE_EXPRESSION_WEIGHTS2_FB         = 1000287016;

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

    public static final int XR_FACE_EXPRESSION_SET2_DEFAULT_FB = 0;

    public static final int
        XR_FACE_TRACKING_DATA_SOURCE2_VISUAL_FB = 0,
        XR_FACE_TRACKING_DATA_SOURCE2_AUDIO_FB  = 1;

    public static final int
        XR_FACE_CONFIDENCE2_LOWER_FACE_FB = 0,
        XR_FACE_CONFIDENCE2_UPPER_FACE_FB = 1,
        XR_FACE_CONFIDENCE2_COUNT_FB      = 2;

    protected FBFaceTracking2() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateFaceTracker2FB ] ---

    /** {@code XrResult xrCreateFaceTracker2FB(XrSession session, XrFaceTrackerCreateInfo2FB const * createInfo, XrFaceTracker2FB * faceTracker)} */
    public static int nxrCreateFaceTracker2FB(XrSession session, long createInfo, long faceTracker) {
        long __functionAddress = session.getCapabilities().xrCreateFaceTracker2FB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, faceTracker, __functionAddress);
    }

    /** {@code XrResult xrCreateFaceTracker2FB(XrSession session, XrFaceTrackerCreateInfo2FB const * createInfo, XrFaceTracker2FB * faceTracker)} */
    @NativeType("XrResult")
    public static int xrCreateFaceTracker2FB(XrSession session, @NativeType("XrFaceTrackerCreateInfo2FB const *") XrFaceTrackerCreateInfo2FB createInfo, @NativeType("XrFaceTracker2FB *") PointerBuffer faceTracker) {
        if (CHECKS) {
            check(faceTracker, 1);
        }
        return nxrCreateFaceTracker2FB(session, createInfo.address(), memAddress(faceTracker));
    }

    // --- [ xrDestroyFaceTracker2FB ] ---

    /** {@code XrResult xrDestroyFaceTracker2FB(XrFaceTracker2FB faceTracker)} */
    @NativeType("XrResult")
    public static int xrDestroyFaceTracker2FB(XrFaceTracker2FB faceTracker) {
        long __functionAddress = faceTracker.getCapabilities().xrDestroyFaceTracker2FB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(faceTracker.address(), __functionAddress);
    }

    // --- [ xrGetFaceExpressionWeights2FB ] ---

    /** {@code XrResult xrGetFaceExpressionWeights2FB(XrFaceTracker2FB faceTracker, XrFaceExpressionInfo2FB const * expressionInfo, XrFaceExpressionWeights2FB * expressionWeights)} */
    public static int nxrGetFaceExpressionWeights2FB(XrFaceTracker2FB faceTracker, long expressionInfo, long expressionWeights) {
        long __functionAddress = faceTracker.getCapabilities().xrGetFaceExpressionWeights2FB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(faceTracker.address(), expressionInfo, expressionWeights, __functionAddress);
    }

    /** {@code XrResult xrGetFaceExpressionWeights2FB(XrFaceTracker2FB faceTracker, XrFaceExpressionInfo2FB const * expressionInfo, XrFaceExpressionWeights2FB * expressionWeights)} */
    @NativeType("XrResult")
    public static int xrGetFaceExpressionWeights2FB(XrFaceTracker2FB faceTracker, @NativeType("XrFaceExpressionInfo2FB const *") XrFaceExpressionInfo2FB expressionInfo, @NativeType("XrFaceExpressionWeights2FB *") XrFaceExpressionWeights2FB expressionWeights) {
        return nxrGetFaceExpressionWeights2FB(faceTracker, expressionInfo.address(), expressionWeights.address());
    }

}