/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_image_raw10_raw12 = "EXTImageRaw10Raw12".nativeClassCL("ext_image_raw10_raw12", EXT) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension adds support for single channel RAW10 and RAW12 images typically used to represent Bayer pattern images coming from an image sensor.
        """

    IntConstant(
        "New values for {@code cl_channel_type}:",

        "UNSIGNED_INT_RAW10_EXT"..0x10E3,
        "UNSIGNED_INT_RAW12_EXT"..0x10E4
    )
}