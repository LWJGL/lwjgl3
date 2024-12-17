/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_motion_estimation = "INTELMotionEstimation".nativeClassCL("intel_motion_estimation", INTEL) {
    IntConstant(
        "ACCELERATOR_TYPE_MOTION_ESTIMATION_INTEL"..0x0
    )

    IntConstant(
        "ME_MB_TYPE_16x16_INTEL"..0x0,
        "ME_MB_TYPE_8x8_INTEL"..0x1,
        "ME_MB_TYPE_4x4_INTEL"..0x2,
        "ME_SUBPIXEL_MODE_INTEGER_INTEL"..0x0,
        "ME_SUBPIXEL_MODE_HPEL_INTEL"..0x1,
        "ME_SUBPIXEL_MODE_QPEL_INTEL"..0x2,
        "ME_SAD_ADJUST_MODE_NONE_INTEL"..0x0,
        "ME_SAD_ADJUST_MODE_HAAR_INTEL"..0x1,
        "ME_SEARCH_PATH_RADIUS_2_2_INTEL"..0x0,
        "ME_SEARCH_PATH_RADIUS_4_4_INTEL"..0x1,
        "ME_SEARCH_PATH_RADIUS_16_12_INTEL"..0x5
    )
}