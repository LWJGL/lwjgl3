/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_inline_uniform_block = "EXTInlineUniformBlock".nativeClassVK("EXT_inline_uniform_block", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_INLINE_UNIFORM_BLOCK_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_INLINE_UNIFORM_BLOCK_EXTENSION_NAME".."VK_EXT_inline_uniform_block"
    )

    EnumConstant(
        "DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT".."1000138000"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES_EXT".."1000138000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES_EXT".."1000138001",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK_EXT".."1000138002",
        "STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO_EXT".."1000138003"
    )
}