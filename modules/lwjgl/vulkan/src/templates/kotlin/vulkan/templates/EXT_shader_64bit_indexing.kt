/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_64bit_indexing = "EXTShader64bitIndexing".nativeClassVK("EXT_shader_64bit_indexing", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_64BIT_INDEXING_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_64BIT_INDEXING_EXTENSION_NAME".."VK_EXT_shader_64bit_indexing"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_64_BIT_INDEXING_FEATURES_EXT".."1000627000"
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_64_BIT_INDEXING_BIT_EXT".enum(0x80000000000L)
    )

    EnumConstant(
        "SHADER_CREATE_64_BIT_INDEXING_BIT_EXT".enum(0x00008000)
    )
}