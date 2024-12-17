/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_image_from_buffer = "EXTImageFromBuffer".nativeClassCL("ext_image_from_buffer", EXT) {
    IntConstant(
        "IMAGE_REQUIREMENTS_SLICE_PITCH_ALIGNMENT_EXT"..0x1291
    )
}