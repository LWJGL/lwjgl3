/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val intel_advanced_motion_estimation = "INTELAdvancedMotionEstimation".nativeClassCL("intel_advanced_motion_estimation", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension builds upon the cl_intel_motion_estimation extension by providing block-based estimation and greater control over the estimation
        algorithm.

        This extension reuses the set of host-callable functions and "motion estimation accelerator objects" defined in the cl_intel_motion_estimation
        extension. This extension depends on the OpenCL 1.2 built-in kernel infrastructure and on the cl_intel_accelerator extension, which provides an
        abstraction for domain-specific acceleration in the OpenCL runtime.

        Requires ${intel_motion_estimation.link}.
        """

    IntConstant(
        "Accepted as arguments to clGetDeviceInfo.",

        "DEVICE_ME_VERSION_INTEL"..0x407E
    )

    IntConstant(
        "Accepted as flags passed to the kernel.",

        "ME_CHROMA_INTRA_PREDICT_ENABLED_INTEL"..0x1,
        "ME_LUMA_INTRA_PREDICT_ENABLED_INTEL"..0x2,
        "ME_COST_PENALTY_NONE_INTEL"..0x0,
        "ME_COST_PENALTY_LOW_INTEL"..0x1,
        "ME_COST_PENALTY_NORMAL_INTEL"..0x2,
        "ME_COST_PENALTY_HIGH_INTEL"..0x3,
        "ME_COST_PRECISION_QPEL_INTEL"..0x0,
        "ME_COST_PRECISION_HEL_INTEL"..0x1,
        "ME_COST_PRECISION_PEL_INTEL"..0x2,
        "ME_COST_PRECISION_DPEL_INTEL"..0x3
    )

    IntConstant(
        "Valid intra-search predictor mode constants.",

        "ME_LUMA_PREDICTOR_MODE_VERTICAL_INTEL"..0x0,
        "ME_LUMA_PREDICTOR_MODE_HORIZONTAL_INTEL"..0x1,
        "ME_LUMA_PREDICTOR_MODE_DC_INTEL"..0x2,
        "ME_LUMA_PREDICTOR_MODE_DIAGONAL_DOWN_LEFT_INTEL"..0x3,
        "ME_LUMA_PREDICTOR_MODE_DIAGONAL_DOWN_RIGHT_INTEL"..0x4,
        "ME_LUMA_PREDICTOR_MODE_PLANE_INTEL"..0x4,
        "ME_LUMA_PREDICTOR_MODE_VERTICAL_RIGHT_INTEL"..0x5,
        "ME_LUMA_PREDICTOR_MODE_HORIZONTAL_DOWN_INTEL"..0x6,
        "ME_LUMA_PREDICTOR_MODE_VERTICAL_LEFT_INTEL"..0x7,
        "ME_LUMA_PREDICTOR_MODE_HORIZONTAL_UP_INTEL"..0x8,
        "ME_CHROMA_PREDICTOR_MODE_DC_INTEL"..0x0,
        "ME_CHROMA_PREDICTOR_MODE_HORIZONTAL_INTEL"..0x1,
        "ME_CHROMA_PREDICTOR_MODE_VERTICAL_INTEL"..0x2,
        "ME_CHROMA_PREDICTOR_MODE_PLANE_INTEL"..0x3
    )

    IntConstant(
        "Valid constant values returned by clGetDeviceInfo.",

        "ME_VERSION_ADVANCED_VER_1_INTEL"..0x1
    )

    IntConstant(
        "Valid macroblock type constants.",

        "ME_MB_TYPE_16x16_INTEL"..0x0,
        "ME_MB_TYPE_8x8_INTEL"..0x1,
        "ME_MB_TYPE_4x4_INTEL"..0x2
    )
}