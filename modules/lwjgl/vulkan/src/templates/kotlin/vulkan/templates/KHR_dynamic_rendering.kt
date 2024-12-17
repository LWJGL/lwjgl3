/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_dynamic_rendering = "KHRDynamicRendering".nativeClassVK("KHR_dynamic_rendering", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DYNAMIC_RENDERING_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_DYNAMIC_RENDERING_EXTENSION_NAME".."VK_KHR_dynamic_rendering"
    )

    EnumConstant(
        "STRUCTURE_TYPE_RENDERING_INFO_KHR".."1000044000",
        "STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR".."1000044001",
        "STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR".."1000044002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR".."1000044003",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR".."1000044004"
    )

    EnumConstant(
        "ATTACHMENT_STORE_OP_NONE_KHR".."1000301000"
    )

    EnumConstant(
        "RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR".enum(0x00000001),
        "RENDERING_SUSPENDING_BIT_KHR".enum(0x00000002),
        "RENDERING_RESUMING_BIT_KHR".enum(0x00000004)
    )

    void(
        "CmdBeginRenderingKHR",

        VkCommandBuffer("commandBuffer"),
        VkRenderingInfo.const.p("pRenderingInfo")
    )

    void(
        "CmdEndRenderingKHR",

        VkCommandBuffer("commandBuffer")
    )
}