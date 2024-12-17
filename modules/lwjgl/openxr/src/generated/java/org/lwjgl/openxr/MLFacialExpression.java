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

public class MLFacialExpression {

    public static final int XR_ML_facial_expression_SPEC_VERSION = 1;

    public static final String XR_ML_FACIAL_EXPRESSION_EXTENSION_NAME = "XR_ML_facial_expression";

    public static final int XR_ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML = 1000482000;

    public static final int XR_OBJECT_TYPE_FACIAL_EXPRESSION_CLIENT_ML = 1000482000;

    public static final int
        XR_TYPE_SYSTEM_FACIAL_EXPRESSION_PROPERTIES_ML      = 1000482004,
        XR_TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML     = 1000482005,
        XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML   = 1000482006,
        XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML = 1000482007;

    public static final int
        XR_FACIAL_BLEND_SHAPE_BROW_LOWERER_L_ML         = 0,
        XR_FACIAL_BLEND_SHAPE_BROW_LOWERER_R_ML         = 1,
        XR_FACIAL_BLEND_SHAPE_CHEEK_RAISER_L_ML         = 2,
        XR_FACIAL_BLEND_SHAPE_CHEEK_RAISER_R_ML         = 3,
        XR_FACIAL_BLEND_SHAPE_CHIN_RAISER_ML            = 4,
        XR_FACIAL_BLEND_SHAPE_DIMPLER_L_ML              = 5,
        XR_FACIAL_BLEND_SHAPE_DIMPLER_R_ML              = 6,
        XR_FACIAL_BLEND_SHAPE_EYES_CLOSED_L_ML          = 7,
        XR_FACIAL_BLEND_SHAPE_EYES_CLOSED_R_ML          = 8,
        XR_FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_L_ML    = 9,
        XR_FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_R_ML    = 10,
        XR_FACIAL_BLEND_SHAPE_JAW_DROP_ML               = 11,
        XR_FACIAL_BLEND_SHAPE_LID_TIGHTENER_L_ML        = 12,
        XR_FACIAL_BLEND_SHAPE_LID_TIGHTENER_R_ML        = 13,
        XR_FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_L_ML = 14,
        XR_FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_R_ML = 15,
        XR_FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_L_ML    = 16,
        XR_FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_R_ML    = 17,
        XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_LB_ML        = 18,
        XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_LT_ML        = 19,
        XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_RB_ML        = 20,
        XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_RT_ML        = 21,
        XR_FACIAL_BLEND_SHAPE_LIP_PRESSOR_L_ML          = 22,
        XR_FACIAL_BLEND_SHAPE_LIP_PRESSOR_R_ML          = 23,
        XR_FACIAL_BLEND_SHAPE_LIP_PUCKER_L_ML           = 24,
        XR_FACIAL_BLEND_SHAPE_LIP_PUCKER_R_ML           = 25,
        XR_FACIAL_BLEND_SHAPE_LIP_STRETCHER_L_ML        = 26,
        XR_FACIAL_BLEND_SHAPE_LIP_STRETCHER_R_ML        = 27,
        XR_FACIAL_BLEND_SHAPE_LIP_SUCK_LB_ML            = 28,
        XR_FACIAL_BLEND_SHAPE_LIP_SUCK_LT_ML            = 29,
        XR_FACIAL_BLEND_SHAPE_LIP_SUCK_RB_ML            = 30,
        XR_FACIAL_BLEND_SHAPE_LIP_SUCK_RT_ML            = 31,
        XR_FACIAL_BLEND_SHAPE_LIP_TIGHTENER_L_ML        = 32,
        XR_FACIAL_BLEND_SHAPE_LIP_TIGHTENER_R_ML        = 33,
        XR_FACIAL_BLEND_SHAPE_LIPS_TOWARD_ML            = 34,
        XR_FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_L_ML  = 35,
        XR_FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_R_ML  = 36,
        XR_FACIAL_BLEND_SHAPE_NOSE_WRINKLER_L_ML        = 37,
        XR_FACIAL_BLEND_SHAPE_NOSE_WRINKLER_R_ML        = 38,
        XR_FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_L_ML    = 39,
        XR_FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_R_ML    = 40,
        XR_FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_L_ML     = 41,
        XR_FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_R_ML     = 42,
        XR_FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_L_ML     = 43,
        XR_FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_R_ML     = 44,
        XR_FACIAL_BLEND_SHAPE_TONGUE_OUT_ML             = 45;

    public static final int
        XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML   = 0x1,
        XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML = 0x2;

    protected MLFacialExpression() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateFacialExpressionClientML ] ---

    /** {@code XrResult xrCreateFacialExpressionClientML(XrSession session, XrFacialExpressionClientCreateInfoML const * createInfo, XrFacialExpressionClientML * facialExpressionClient)} */
    public static int nxrCreateFacialExpressionClientML(XrSession session, long createInfo, long facialExpressionClient) {
        long __functionAddress = session.getCapabilities().xrCreateFacialExpressionClientML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, facialExpressionClient, __functionAddress);
    }

    /** {@code XrResult xrCreateFacialExpressionClientML(XrSession session, XrFacialExpressionClientCreateInfoML const * createInfo, XrFacialExpressionClientML * facialExpressionClient)} */
    @NativeType("XrResult")
    public static int xrCreateFacialExpressionClientML(XrSession session, @NativeType("XrFacialExpressionClientCreateInfoML const *") XrFacialExpressionClientCreateInfoML createInfo, @NativeType("XrFacialExpressionClientML *") PointerBuffer facialExpressionClient) {
        if (CHECKS) {
            check(facialExpressionClient, 1);
        }
        return nxrCreateFacialExpressionClientML(session, createInfo.address(), memAddress(facialExpressionClient));
    }

    // --- [ xrDestroyFacialExpressionClientML ] ---

    /** {@code XrResult xrDestroyFacialExpressionClientML(XrFacialExpressionClientML facialExpressionClient)} */
    @NativeType("XrResult")
    public static int xrDestroyFacialExpressionClientML(XrFacialExpressionClientML facialExpressionClient) {
        long __functionAddress = facialExpressionClient.getCapabilities().xrDestroyFacialExpressionClientML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(facialExpressionClient.address(), __functionAddress);
    }

    // --- [ xrGetFacialExpressionBlendShapePropertiesML ] ---

    /** {@code XrResult xrGetFacialExpressionBlendShapePropertiesML(XrFacialExpressionClientML facialExpressionClient, XrFacialExpressionBlendShapeGetInfoML const * blendShapeGetInfo, uint32_t blendShapeCount, XrFacialExpressionBlendShapePropertiesML * blendShapes)} */
    public static int nxrGetFacialExpressionBlendShapePropertiesML(XrFacialExpressionClientML facialExpressionClient, long blendShapeGetInfo, int blendShapeCount, long blendShapes) {
        long __functionAddress = facialExpressionClient.getCapabilities().xrGetFacialExpressionBlendShapePropertiesML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(facialExpressionClient.address(), blendShapeGetInfo, blendShapeCount, blendShapes, __functionAddress);
    }

    /** {@code XrResult xrGetFacialExpressionBlendShapePropertiesML(XrFacialExpressionClientML facialExpressionClient, XrFacialExpressionBlendShapeGetInfoML const * blendShapeGetInfo, uint32_t blendShapeCount, XrFacialExpressionBlendShapePropertiesML * blendShapes)} */
    @NativeType("XrResult")
    public static int xrGetFacialExpressionBlendShapePropertiesML(XrFacialExpressionClientML facialExpressionClient, @NativeType("XrFacialExpressionBlendShapeGetInfoML const *") XrFacialExpressionBlendShapeGetInfoML blendShapeGetInfo, @NativeType("XrFacialExpressionBlendShapePropertiesML *") XrFacialExpressionBlendShapePropertiesML.Buffer blendShapes) {
        return nxrGetFacialExpressionBlendShapePropertiesML(facialExpressionClient, blendShapeGetInfo.address(), blendShapes.remaining(), blendShapes.address());
    }

}