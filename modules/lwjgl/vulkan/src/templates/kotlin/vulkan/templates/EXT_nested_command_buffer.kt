/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_nested_command_buffer = "EXTNestedCommandBuffer".nativeClassVK("EXT_nested_command_buffer", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_NESTED_COMMAND_BUFFER_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_NESTED_COMMAND_BUFFER_EXTENSION_NAME".."VK_EXT_nested_command_buffer"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT".."1000451000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT".."1000451001"
    )

    EnumConstant(
        "SUBPASS_CONTENTS_INLINE_AND_SECONDARY_COMMAND_BUFFERS_EXT".."1000451000"
    )

    EnumConstant(
        "RENDERING_CONTENTS_INLINE_BIT_EXT".enum(0x00000010)
    )
}