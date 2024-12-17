/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_create_renderpass2 = "KHRCreateRenderpass2".nativeClassVK("KHR_create_renderpass2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_CREATE_RENDERPASS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_CREATE_RENDERPASS_2_EXTENSION_NAME".."VK_KHR_create_renderpass2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR".."1000109000",
        "STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR".."1000109001",
        "STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR".."1000109002",
        "STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR".."1000109003",
        "STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR".."1000109004",
        "STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR".."1000109005",
        "STRUCTURE_TYPE_SUBPASS_END_INFO_KHR".."1000109006"
    )

    VkResult(
        "CreateRenderPass2KHR",

        VkDevice("device"),
        VkRenderPassCreateInfo2.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkRenderPass.p("pRenderPass")
    )

    void(
        "CmdBeginRenderPass2KHR",

        VkCommandBuffer("commandBuffer"),
        VkRenderPassBeginInfo.const.p("pRenderPassBegin"),
        VkSubpassBeginInfo.const.p("pSubpassBeginInfo")
    )

    void(
        "CmdNextSubpass2KHR",

        VkCommandBuffer("commandBuffer"),
        VkSubpassBeginInfo.const.p("pSubpassBeginInfo"),
        VkSubpassEndInfo.const.p("pSubpassEndInfo")
    )

    void(
        "CmdEndRenderPass2KHR",

        VkCommandBuffer("commandBuffer"),
        VkSubpassEndInfo.const.p("pSubpassEndInfo")
    )
}