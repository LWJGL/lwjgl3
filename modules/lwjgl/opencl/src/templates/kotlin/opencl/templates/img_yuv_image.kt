/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_yuv_image = "IMGYUVImage".nativeClassCL("img_yuv_image", IMG) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension provides new image formats to read YUV images, such as those provided by cameras on mobile devices.

        Requires ${CL12.link}.
        """

    IntConstant(
        "New values accepted for the {@code image_channel_order} member in ##CLImageFormat.",

        "NV21_IMG"..0x40D0,
        "YV12_IMG"..0x40D1
    )
}