/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

public final class INTELAdvancedMotionEstimation {

    public static final int CL_DEVICE_ME_VERSION_INTEL = 0x407E;

    public static final int
        CL_ME_CHROMA_INTRA_PREDICT_ENABLED_INTEL = 0x1,
        CL_ME_LUMA_INTRA_PREDICT_ENABLED_INTEL   = 0x2,
        CL_ME_COST_PENALTY_NONE_INTEL            = 0x0,
        CL_ME_COST_PENALTY_LOW_INTEL             = 0x1,
        CL_ME_COST_PENALTY_NORMAL_INTEL          = 0x2,
        CL_ME_COST_PENALTY_HIGH_INTEL            = 0x3,
        CL_ME_COST_PRECISION_QPEL_INTEL          = 0x0,
        CL_ME_COST_PRECISION_HEL_INTEL           = 0x1,
        CL_ME_COST_PRECISION_PEL_INTEL           = 0x2,
        CL_ME_COST_PRECISION_DPEL_INTEL          = 0x3;

    public static final int
        CL_ME_LUMA_PREDICTOR_MODE_VERTICAL_INTEL            = 0x0,
        CL_ME_LUMA_PREDICTOR_MODE_HORIZONTAL_INTEL          = 0x1,
        CL_ME_LUMA_PREDICTOR_MODE_DC_INTEL                  = 0x2,
        CL_ME_LUMA_PREDICTOR_MODE_DIAGONAL_DOWN_LEFT_INTEL  = 0x3,
        CL_ME_LUMA_PREDICTOR_MODE_DIAGONAL_DOWN_RIGHT_INTEL = 0x4,
        CL_ME_LUMA_PREDICTOR_MODE_PLANE_INTEL               = 0x4,
        CL_ME_LUMA_PREDICTOR_MODE_VERTICAL_RIGHT_INTEL      = 0x5,
        CL_ME_LUMA_PREDICTOR_MODE_HORIZONTAL_DOWN_INTEL     = 0x6,
        CL_ME_LUMA_PREDICTOR_MODE_VERTICAL_LEFT_INTEL       = 0x7,
        CL_ME_LUMA_PREDICTOR_MODE_HORIZONTAL_UP_INTEL       = 0x8,
        CL_ME_CHROMA_PREDICTOR_MODE_DC_INTEL                = 0x0,
        CL_ME_CHROMA_PREDICTOR_MODE_HORIZONTAL_INTEL        = 0x1,
        CL_ME_CHROMA_PREDICTOR_MODE_VERTICAL_INTEL          = 0x2,
        CL_ME_CHROMA_PREDICTOR_MODE_PLANE_INTEL             = 0x3;

    public static final int CL_ME_VERSION_ADVANCED_VER_1_INTEL = 0x1;

    public static final int
        CL_ME_MB_TYPE_16x16_INTEL = 0x0,
        CL_ME_MB_TYPE_8x8_INTEL   = 0x1,
        CL_ME_MB_TYPE_4x4_INTEL   = 0x2;

    private INTELAdvancedMotionEstimation() {}

}