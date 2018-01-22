/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val intel_planar_yuv = "INTELPlanarYUV".nativeClassCL("intel_planar_yuv", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        The purpose of this extension is to provide OpenCL support for the Planar YUV (YCbCr) image formats. #NV12_INTEL format must be supported; support for
        other Planar YUV formats that may be defined in this extension is optional.

        The extension introduces two new cl_mem_flags:
        ${ul(
            """
            #MEM_NO_ACCESS_INTEL which should be used together with image formats for which device does not support reading from or writing to at OpenCL
            kernels level, but are still useful in other use cases.
            """,
            """
            #MEM_ACCESS_FLAGS_UNRESTRICTED_INTEL which may be used to relax the memory access rights specified in {@code cl_mem_flags} at memory object
            creation time and allow to access and modify the contents of the underlying data storage in unrestricted way e.g. by creating another memory object
            from that memory object or using dedicated device mechanisms.
            """
        )}

        Requires ${CL12.link}.
        """

    IntConstant(
        "Accepted as {@code cl_mem_flags}.",

        "MEM_NO_ACCESS_INTEL".."1 << 24",
        "MEM_ACCESS_FLAGS_UNRESTRICTED_INTEL".."1 << 25"
    )

    IntConstant(
        "Accepted as {@code image_channel_order} of ##CLImageFormat.",

        "NV12_INTEL"..0x410E
    )

    IntConstant(
        "Accepted as arguments passed to #GetDeviceInfo().",

        "DEVICE_PLANAR_YUV_MAX_WIDTH_INTEL"..0x417E,
        "DEVICE_PLANAR_YUV_MAX_HEIGHT_INTEL"..0x417F
    )
}