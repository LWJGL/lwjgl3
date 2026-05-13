/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_split_barrier = "EXTShaderSplitBarrier".nativeClassVK("EXT_shader_split_barrier", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_SPLIT_BARRIER_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_SPLIT_BARRIER_EXTENSION_NAME".."VK_EXT_shader_split_barrier"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SPLIT_BARRIER_FEATURES_EXT".."1000305000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SPLIT_BARRIER_PROPERTIES_EXT".."1000305001"
    )
}