/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_conditional_rendering = "EXTConditionalRendering".nativeClassVK("EXT_conditional_rendering", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_CONDITIONAL_RENDERING_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_CONDITIONAL_RENDERING_EXTENSION_NAME".."VK_EXT_conditional_rendering"
    )

    EnumConstant(
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT".."1000081000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT".."1000081001",
        "STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT".."1000081002"
    )

    EnumConstant(
        "ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT".enum(0x00100000)
    )

    EnumConstant(
        "BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT".enum(0x00000200)
    )

    EnumConstant(
        "PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT".enum(0x00040000)
    )

    EnumConstant(
        "CONDITIONAL_RENDERING_INVERTED_BIT_EXT".enum(0x00000001)
    )

    void(
        "CmdBeginConditionalRenderingEXT",

        VkCommandBuffer("commandBuffer"),
        VkConditionalRenderingBeginInfoEXT.const.p("pConditionalRenderingBegin")
    )

    void(
        "CmdEndConditionalRenderingEXT",

        VkCommandBuffer("commandBuffer")
    )
}