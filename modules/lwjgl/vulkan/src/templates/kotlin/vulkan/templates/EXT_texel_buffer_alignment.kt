/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_texel_buffer_alignment = "EXTTexelBufferAlignment".nativeClassVK("EXT_texel_buffer_alignment", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_TEXEL_BUFFER_ALIGNMENT_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_TEXEL_BUFFER_ALIGNMENT_EXTENSION_NAME".."VK_EXT_texel_buffer_alignment"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT".."1000281000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES_EXT".."1000281001"
    )
}