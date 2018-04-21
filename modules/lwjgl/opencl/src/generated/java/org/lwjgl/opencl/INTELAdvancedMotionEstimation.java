/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_advanced_motion_estimation.txt">intel_advanced_motion_estimation</a> extension.
 * 
 * <p>This extension builds upon the cl_intel_motion_estimation extension by providing block-based estimation and greater control over the estimation
 * algorithm.</p>
 * 
 * <p>This extension reuses the set of host-callable functions and "motion estimation accelerator objects" defined in the cl_intel_motion_estimation
 * extension. This extension depends on the OpenCL 1.2 built-in kernel infrastructure and on the cl_intel_accelerator extension, which provides an
 * abstraction for domain-specific acceleration in the OpenCL runtime.</p>
 * 
 * <p>Requires {@link INTELMotionEstimation intel_motion_estimation}.</p>
 */
public final class INTELAdvancedMotionEstimation {

    /** Accepted as arguments to clGetDeviceInfo. */
    public static final int CL_DEVICE_ME_VERSION_INTEL = 0x407E;

    /** Accepted as flags passed to the kernel. */
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

    /** Valid intra-search predictor mode constants. */
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

    /** Valid constant values returned by clGetDeviceInfo. */
    public static final int CL_ME_VERSION_ADVANCED_VER_1_INTEL = 0x1;

    /** Valid macroblock type constants. */
    public static final int
        CL_ME_MB_TYPE_16x16_INTEL = 0x0,
        CL_ME_MB_TYPE_8x8_INTEL   = 0x1,
        CL_ME_MB_TYPE_4x4_INTEL   = 0x2;

    private INTELAdvancedMotionEstimation() {}

}