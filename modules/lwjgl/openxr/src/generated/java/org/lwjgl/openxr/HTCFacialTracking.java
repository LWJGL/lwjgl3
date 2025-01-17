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

public class HTCFacialTracking {

    public static final int XR_HTC_facial_tracking_SPEC_VERSION = 3;

    public static final String XR_HTC_FACIAL_TRACKING_EXTENSION_NAME = "XR_HTC_facial_tracking";

    public static final int XR_OBJECT_TYPE_FACIAL_TRACKER_HTC = 1000104000;

    public static final int
        XR_TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC = 1000104000,
        XR_TYPE_FACIAL_TRACKER_CREATE_INFO_HTC        = 1000104001,
        XR_TYPE_FACIAL_EXPRESSIONS_HTC                = 1000104002;

    public static final int
        XR_LIP_EXPRESSION_JAW_RIGHT_HTC              = 0,
        XR_LIP_EXPRESSION_JAW_LEFT_HTC               = 1,
        XR_LIP_EXPRESSION_JAW_FORWARD_HTC            = 2,
        XR_LIP_EXPRESSION_JAW_OPEN_HTC               = 3,
        XR_LIP_EXPRESSION_MOUTH_APE_SHAPE_HTC        = 4,
        XR_LIP_EXPRESSION_MOUTH_UPPER_RIGHT_HTC      = 5,
        XR_LIP_EXPRESSION_MOUTH_UPPER_LEFT_HTC       = 6,
        XR_LIP_EXPRESSION_MOUTH_LOWER_RIGHT_HTC      = 7,
        XR_LIP_EXPRESSION_MOUTH_LOWER_LEFT_HTC       = 8,
        XR_LIP_EXPRESSION_MOUTH_UPPER_OVERTURN_HTC   = 9,
        XR_LIP_EXPRESSION_MOUTH_LOWER_OVERTURN_HTC   = 10,
        XR_LIP_EXPRESSION_MOUTH_POUT_HTC             = 11,
        XR_LIP_EXPRESSION_MOUTH_SMILE_RIGHT_HTC      = 12,
        XR_LIP_EXPRESSION_MOUTH_RAISER_RIGHT_HTC     = 12,
        XR_LIP_EXPRESSION_MOUTH_SMILE_LEFT_HTC       = 13,
        XR_LIP_EXPRESSION_MOUTH_RAISER_LEFT_HTC      = 13,
        XR_LIP_EXPRESSION_MOUTH_SAD_RIGHT_HTC        = 14,
        XR_LIP_EXPRESSION_MOUTH_STRETCHER_RIGHT_HTC  = 14,
        XR_LIP_EXPRESSION_MOUTH_SAD_LEFT_HTC         = 15,
        XR_LIP_EXPRESSION_MOUTH_STRETCHER_LEFT_HTC   = 15,
        XR_LIP_EXPRESSION_CHEEK_PUFF_RIGHT_HTC       = 16,
        XR_LIP_EXPRESSION_CHEEK_PUFF_LEFT_HTC        = 17,
        XR_LIP_EXPRESSION_CHEEK_SUCK_HTC             = 18,
        XR_LIP_EXPRESSION_MOUTH_UPPER_UPRIGHT_HTC    = 19,
        XR_LIP_EXPRESSION_MOUTH_UPPER_UPLEFT_HTC     = 20,
        XR_LIP_EXPRESSION_MOUTH_LOWER_DOWNRIGHT_HTC  = 21,
        XR_LIP_EXPRESSION_MOUTH_LOWER_DOWNLEFT_HTC   = 22,
        XR_LIP_EXPRESSION_MOUTH_UPPER_INSIDE_HTC     = 23,
        XR_LIP_EXPRESSION_MOUTH_LOWER_INSIDE_HTC     = 24,
        XR_LIP_EXPRESSION_MOUTH_LOWER_OVERLAY_HTC    = 25,
        XR_LIP_EXPRESSION_TONGUE_LONGSTEP1_HTC       = 26,
        XR_LIP_EXPRESSION_TONGUE_LEFT_HTC            = 27,
        XR_LIP_EXPRESSION_TONGUE_RIGHT_HTC           = 28,
        XR_LIP_EXPRESSION_TONGUE_UP_HTC              = 29,
        XR_LIP_EXPRESSION_TONGUE_DOWN_HTC            = 30,
        XR_LIP_EXPRESSION_TONGUE_ROLL_HTC            = 31,
        XR_LIP_EXPRESSION_TONGUE_LONGSTEP2_HTC       = 32,
        XR_LIP_EXPRESSION_TONGUE_UPRIGHT_MORPH_HTC   = 33,
        XR_LIP_EXPRESSION_TONGUE_UPLEFT_MORPH_HTC    = 34,
        XR_LIP_EXPRESSION_TONGUE_DOWNRIGHT_MORPH_HTC = 35,
        XR_LIP_EXPRESSION_TONGUE_DOWNLEFT_MORPH_HTC  = 36;

    public static final int
        XR_EYE_EXPRESSION_LEFT_BLINK_HTC    = 0,
        XR_EYE_EXPRESSION_LEFT_WIDE_HTC     = 1,
        XR_EYE_EXPRESSION_RIGHT_BLINK_HTC   = 2,
        XR_EYE_EXPRESSION_RIGHT_WIDE_HTC    = 3,
        XR_EYE_EXPRESSION_LEFT_SQUEEZE_HTC  = 4,
        XR_EYE_EXPRESSION_RIGHT_SQUEEZE_HTC = 5,
        XR_EYE_EXPRESSION_LEFT_DOWN_HTC     = 6,
        XR_EYE_EXPRESSION_RIGHT_DOWN_HTC    = 7,
        XR_EYE_EXPRESSION_LEFT_OUT_HTC      = 8,
        XR_EYE_EXPRESSION_RIGHT_IN_HTC      = 9,
        XR_EYE_EXPRESSION_LEFT_IN_HTC       = 10,
        XR_EYE_EXPRESSION_RIGHT_OUT_HTC     = 11,
        XR_EYE_EXPRESSION_LEFT_UP_HTC       = 12,
        XR_EYE_EXPRESSION_RIGHT_UP_HTC      = 13;

    public static final int
        XR_FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC = 1,
        XR_FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC = 2;

    public static final int
        XR_FACIAL_EXPRESSION_EYE_COUNT_HTC = 0xE,
        XR_FACIAL_EXPRESSION_LIP_COUNT_HTC = 0x25;

    protected HTCFacialTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateFacialTrackerHTC ] ---

    /** {@code XrResult xrCreateFacialTrackerHTC(XrSession session, XrFacialTrackerCreateInfoHTC const * createInfo, XrFacialTrackerHTC * facialTracker)} */
    public static int nxrCreateFacialTrackerHTC(XrSession session, long createInfo, long facialTracker) {
        long __functionAddress = session.getCapabilities().xrCreateFacialTrackerHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, facialTracker, __functionAddress);
    }

    /** {@code XrResult xrCreateFacialTrackerHTC(XrSession session, XrFacialTrackerCreateInfoHTC const * createInfo, XrFacialTrackerHTC * facialTracker)} */
    @NativeType("XrResult")
    public static int xrCreateFacialTrackerHTC(XrSession session, @NativeType("XrFacialTrackerCreateInfoHTC const *") XrFacialTrackerCreateInfoHTC createInfo, @NativeType("XrFacialTrackerHTC *") PointerBuffer facialTracker) {
        if (CHECKS) {
            check(facialTracker, 1);
        }
        return nxrCreateFacialTrackerHTC(session, createInfo.address(), memAddress(facialTracker));
    }

    // --- [ xrDestroyFacialTrackerHTC ] ---

    /** {@code XrResult xrDestroyFacialTrackerHTC(XrFacialTrackerHTC facialTracker)} */
    @NativeType("XrResult")
    public static int xrDestroyFacialTrackerHTC(XrFacialTrackerHTC facialTracker) {
        long __functionAddress = facialTracker.getCapabilities().xrDestroyFacialTrackerHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(facialTracker.address(), __functionAddress);
    }

    // --- [ xrGetFacialExpressionsHTC ] ---

    /** {@code XrResult xrGetFacialExpressionsHTC(XrFacialTrackerHTC facialTracker, XrFacialExpressionsHTC * facialExpressions)} */
    public static int nxrGetFacialExpressionsHTC(XrFacialTrackerHTC facialTracker, long facialExpressions) {
        long __functionAddress = facialTracker.getCapabilities().xrGetFacialExpressionsHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(facialTracker.address(), facialExpressions, __functionAddress);
    }

    /** {@code XrResult xrGetFacialExpressionsHTC(XrFacialTrackerHTC facialTracker, XrFacialExpressionsHTC * facialExpressions)} */
    @NativeType("XrResult")
    public static int xrGetFacialExpressionsHTC(XrFacialTrackerHTC facialTracker, @NativeType("XrFacialExpressionsHTC *") XrFacialExpressionsHTC facialExpressions) {
        return nxrGetFacialExpressionsHTC(facialTracker, facialExpressions.address());
    }

}