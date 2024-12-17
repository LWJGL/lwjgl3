/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val IMG_relaxed_line_rasterization = "IMGRelaxedLineRasterization".nativeClassVK("IMG_relaxed_line_rasterization", type = "device", postfix = "IMG") {
    IntConstant(
        "IMG_RELAXED_LINE_RASTERIZATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "IMG_RELAXED_LINE_RASTERIZATION_EXTENSION_NAME".."VK_IMG_relaxed_line_rasterization"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG".."1000110000"
    )
}