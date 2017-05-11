/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val intel_packed_yuv = "INTELPackedYUV".nativeClassCL("intel_packed_yuv", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        The purpose of this extension is to provide OpenCL support for packed YUV images.

        Requires ${CL12.link}.
        """

    IntConstant(
        "Accepted as {@code image_channel_order} of {@code cl_image_format}.",

        "YUYV_INTEL"..0x4076,
        "UYVY_INTEL"..0x4077,
        "YVYU_INTEL"..0x4078,
        "VYUY_INTEL"..0x4079
    )
}