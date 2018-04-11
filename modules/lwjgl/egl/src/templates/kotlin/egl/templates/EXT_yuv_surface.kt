/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_yuv_surface = "EXTYUVSurface".nativeClassEGL("EXT_yuv_surface", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a set of new EGL configuration attributes and values which allows EGL to create and use YUV surfaces.

        YUV formats can be described using a few simple parameters, and every format can be given with these six parameters. These parameters include the color
        order, the number of planes, subsample, plane depth, color conversion and depth range.

        This extension describes how EGL will handle YUV surfaces, but requires that the client API describe how to fill such a surface. An example of such an
        extension would be GL_EXT_yuv_target.

        Requires ${EGL14.core}.
        """

        IntConstant(
        "A new set of {@code EGLConfig} attributes are available.",

        "YUV_ORDER_EXT"..0x3301,
        "YUV_NUMBER_OF_PLANES_EXT"..0x3311,
        "YUV_SUBSAMPLE_EXT"..0x3312,
        "YUV_DEPTH_RANGE_EXT"..0x3317,
        "YUV_CSC_STANDARD_EXT"..0x330A,
        "YUV_PLANE_BPP_EXT"..0x331A
    )

    IntConstant(
        "Accepted as a new value for the #COLOR_BUFFER_TYPE attribute.",

        "YUV_BUFFER_EXT"..0x3300
    )

    IntConstant(
        "Accepted values for the #YUV_ORDER_EXT attribute.",

        "YUV_ORDER_YUV_EXT"..0x3302,
        "YUV_ORDER_YVU_EXT"..0x3303,
        "YUV_ORDER_YUYV_EXT"..0x3304,
        "YUV_ORDER_UYVY_EXT"..0x3305,
        "YUV_ORDER_YVYU_EXT"..0x3306,
        "YUV_ORDER_VYUY_EXT"..0x3307,
        "YUV_ORDER_AYUV_EXT"..0x3308
    )

    IntConstant(
        "Accepted values for the #YUV_SUBSAMPLE_EXT attribute.",

        "YUV_SUBSAMPLE_4_2_0_EXT"..0x3313,
        "YUV_SUBSAMPLE_4_2_2_EXT"..0x3314,
        "YUV_SUBSAMPLE_4_4_4_EXT"..0x3315
    )

    IntConstant(
        "Accepted values for the #YUV_DEPTH_RANGE_EXT attribute.",

        "YUV_DEPTH_RANGE_LIMITED_EXT"..0x3318,
        "YUV_DEPTH_RANGE_FULL_EXT"..0x3319
    )

    IntConstant(
        "Accepted values for the #YUV_CSC_STANDARD_EXT attribute.",

        "YUV_CSC_STANDARD_601_EXT"..0x330B,
        "YUV_CSC_STANDARD_709_EXT"..0x330C,
        "YUV_CSC_STANDARD_2020_EXT"..0x330D
    )

    IntConstant(
        "Accepted values for the #YUV_PLANE_BPP_EXT attribute.",

        "YUV_PLANE_BPP_0_EXT"..0x331B,
        "YUV_PLANE_BPP_8_EXT"..0x331C,
        "YUV_PLANE_BPP_10_EXT"..0x331D
    )
}