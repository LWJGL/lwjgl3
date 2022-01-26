/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_create_renderpass2 = "KHRCreateRenderpass2".nativeClassVK("KHR_create_renderpass2", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension provides a new entry point to create render passes in a way that can be easily extended by other extensions through the substructures of render pass creation. The Vulkan 1.0 render pass creation sub-structures do not include {@code sType}/{@code pNext} members. Additionally, the render pass begin/next/end commands have been augmented with new extensible structures for passing additional subpass information.

        The ##VkRenderPassMultiviewCreateInfo and ##VkInputAttachmentAspectReference structures that extended the original ##VkRenderPassCreateInfo are not accepted into the new creation functions, and instead their parameters are folded into this extension as follows:

        <ul>
            <li>Elements of ##VkRenderPassMultiviewCreateInfo{@code ::pViewMasks} are now specified in ##VkSubpassDescription2KHR{@code ::viewMask}.</li>
            <li>Elements of ##VkRenderPassMultiviewCreateInfo{@code ::pViewOffsets} are now specified in ##VkSubpassDependency2KHR{@code ::viewOffset}.</li>
            <li>##VkRenderPassMultiviewCreateInfo{@code ::correlationMaskCount} and ##VkRenderPassMultiviewCreateInfo{@code ::pCorrelationMasks} are directly specified in ##VkRenderPassCreateInfo2KHR.</li>
            <li>##VkInputAttachmentAspectReference{@code ::aspectMask} is now specified in the relevant input attachment description in ##VkAttachmentDescription2KHR{@code ::aspectMask}</li>
        </ul>

        The details of these mappings are explained fully in the new structures.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_create_renderpass2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_create_renderpass2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>110</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRMultiview VK_KHR_multiview}</li>
                <li>Requires {@link KHRMaintenance2 VK_KHR_maintenance2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_create_renderpass2]%20@tobias%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_create_renderpass2%20extension%3E%3E">tobias</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-02-07</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector</li>
                <li>Jeff Bolz</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_CREATE_RENDERPASS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_CREATE_RENDERPASS_2_EXTENSION_NAME".."VK_KHR_create_renderpass2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

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
        "See #CreateRenderPass2().",

        VkDevice("device", "the logical device that creates the render pass."),
        VkRenderPassCreateInfo2.const.p("pCreateInfo", "a pointer to a ##VkRenderPassCreateInfo2 structure describing the parameters of the render pass."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkRenderPass.p("pRenderPass", "a pointer to a {@code VkRenderPass} handle in which the resulting render pass object is returned.")
    )

    void(
        "CmdBeginRenderPass2KHR",
        "See #CmdBeginRenderPass2().",

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkRenderPassBeginInfo.const.p("pRenderPassBegin", "a pointer to a ##VkRenderPassBeginInfo structure specifying the render pass to begin an instance of, and the framebuffer the instance uses."),
        VkSubpassBeginInfo.const.p("pSubpassBeginInfo", "a pointer to a ##VkSubpassBeginInfo structure containing information about the subpass which is about to begin rendering.")
    )

    void(
        "CmdNextSubpass2KHR",
        "See #CmdNextSubpass2().",

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkSubpassBeginInfo.const.p("pSubpassBeginInfo", "a pointer to a ##VkSubpassBeginInfo structure containing information about the subpass which is about to begin rendering."),
        VkSubpassEndInfo.const.p("pSubpassEndInfo", "a pointer to a ##VkSubpassEndInfo structure containing information about how the previous subpass will be ended.")
    )

    void(
        "CmdEndRenderPass2KHR",
        "See #CmdEndRenderPass2().",

        VkCommandBuffer("commandBuffer", "the command buffer in which to end the current render pass instance."),
        VkSubpassEndInfo.const.p("pSubpassEndInfo", "a pointer to a ##VkSubpassEndInfo structure containing information about how the previous subpass will be ended.")
    )
}