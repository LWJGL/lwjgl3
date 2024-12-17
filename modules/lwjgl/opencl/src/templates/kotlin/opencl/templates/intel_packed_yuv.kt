/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_packed_yuv = "INTELPackedYUV".nativeClassCL("intel_packed_yuv", INTEL) {
    IntConstant(
        "YUYV_INTEL"..0x4076,
        "UYVY_INTEL"..0x4077,
        "YVYU_INTEL"..0x4078,
        "VYUY_INTEL"..0x4079
    )
}