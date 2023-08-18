/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_image_requirements_info = "EXTImageRequirementsInfo".nativeClassCL("ext_image_requirements_info", EXT) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension enables applications to query requirements for an image without having to create the image.
        """

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #GetImageRequirementsInfoEXT()",

        "IMAGE_REQUIREMENTS_ROW_PITCH_ALIGNMENT_EXT"..0x1290,
        "IMAGE_REQUIREMENTS_BASE_ADDRESS_ALIGNMENT_EXT"..0x1292,
        "IMAGE_REQUIREMENTS_SIZE_EXT"..0x12B2,
        "IMAGE_REQUIREMENTS_MAX_WIDTH_EXT"..0x12B3,
        "IMAGE_REQUIREMENTS_MAX_HEIGHT_EXT"..0x12B4,
        "IMAGE_REQUIREMENTS_MAX_DEPTH_EXT"..0x12B5,
        "IMAGE_REQUIREMENTS_MAX_ARRAY_SIZE_EXT"..0x12B6
    )

    cl_int(
        "GetImageRequirementsInfoEXT",
        "",

        cl_context("context", ""),
        nullable..NullTerminated..cl_mem_properties.const.p("properties", ""),
        cl_mem_flags("flags", ""),
        cl_image_format.const.p("image_format", ""),
        cl_image_desc.const.p("image_desc", ""),
        cl_image_requirements_info_ext("param_name", ""),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER)..nullable..void.p("param_value", param_value),
        PARAM_VALUE_SIZE_RET
    )
}