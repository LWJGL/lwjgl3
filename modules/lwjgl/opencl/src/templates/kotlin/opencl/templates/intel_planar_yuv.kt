/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_planar_yuv = "INTELPlanarYUV".nativeClassCL("intel_planar_yuv", INTEL) {
    LongConstant(
        "MEM_NO_ACCESS_INTEL".."1L << 24",
        "MEM_ACCESS_FLAGS_UNRESTRICTED_INTEL".."1L << 25"
    )

    IntConstant(
        "NV12_INTEL"..0x410E
    )

    IntConstant(
        "DEVICE_PLANAR_YUV_MAX_WIDTH_INTEL"..0x417E,
        "DEVICE_PLANAR_YUV_MAX_HEIGHT_INTEL"..0x417F
    )
}