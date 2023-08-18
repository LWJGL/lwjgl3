/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_image_from_buffer = "EXTImageFromBuffer".nativeClassCL("ext_image_from_buffer", EXT) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension enables all types of images to be created from an existing buffer object.
        """

    IntConstant(
        "Accepted value for the {@code param_name parameter} to #GetImageRequirementsInfoEXT()",

        "IMAGE_REQUIREMENTS_SLICE_PITCH_ALIGNMENT_EXT"..0x1291
    )
}