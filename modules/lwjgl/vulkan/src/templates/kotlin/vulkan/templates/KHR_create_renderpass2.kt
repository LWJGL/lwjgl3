/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_create_renderpass2 = "KHRCreateRenderpass2".nativeClassVK("KHR_create_renderpass2", type = "device", postfix = KHR) {
    documentation =
        """
        This extension provides a new entry point to create render passes in a way that can be easily extended by other extensions through the substructures of render pass creation. The Vulkan 1.0 render pass creation sub-structures do not include {@code sType}/{@code pNext} members. Additionally, the renderpass begin/next/end commands have been augmented with new extensible structures for passing additional subpass information.

        Parameters from the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VK_KHR_multiview">VK_KHR_multiview</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VK_KHR_maintenance2">VK_KHR_maintenance2</a> extensions which previously extended ##VkRenderPassCreateInfo are folded into the new structures in more appropriate locations.

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

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector @tobias</li>
            </ul></dd>

            <dt>Last Modified Date</dt>
            <dd>2018-02-07</dd>

            <dt>Contributors</dt>
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
        """
        Create a new render pass object.

        <h5>C Specification</h5>
        To create a render pass, call:

        <pre><code>
￿VkResult vkCreateRenderPass2KHR(
￿    VkDevice                                    device,
￿    const VkRenderPassCreateInfo2KHR*           pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkRenderPass*                               pRenderPass);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CreateRenderPass(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkRenderPassCreateInfo2KHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pRenderPass} <b>must</b> be a valid pointer to a {@code VkRenderPass} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkRenderPassCreateInfo2KHR
        """,

        VkDevice.IN("device", "the logical device that creates the render pass."),
        VkRenderPassCreateInfo2KHR.const.p.IN("pCreateInfo", "a pointer to an instance of the ##VkRenderPassCreateInfo2KHR structure that describes the parameters of the render pass."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkRenderPass.p.OUT("pRenderPass", "points to a {@code VkRenderPass} handle in which the resulting render pass object is returned.")
    )

    void(
        "CmdBeginRenderPass2KHR",
        """
        Begin a new render pass.

        <h5>C Specification</h5>
        Alternatively to begin a render pass, call:

        <pre><code>
￿void vkCmdBeginRenderPass2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderPassBeginInfo*                pRenderPassBegin,
￿    const VkSubpassBeginInfoKHR*                pSubpassBeginInfo);</code></pre>

        <h5>Description</h5>
        After beginning a render pass instance, the command buffer is ready to record the commands for the first subpass of that render pass.

        <h5>Valid Usage</h5>
        <ul>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with #IMAGE_USAGE_COLOR_ATTACHMENT_BIT set</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL, #IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL, #IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL, or #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT set</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with #IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT set</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT set</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT set</li>
            <li>If any of the {@code initialLayout} members of the ##VkAttachmentDescription structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is not #IMAGE_LAYOUT_UNDEFINED, then each such {@code initialLayout} <b>must</b> be equal to the current layout of the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin}</li>
            <li>The {@code srcStageMask} and {@code dstStageMask} members of any element of the {@code pDependencies} member of ##VkRenderPassCreateInfo used to create {@code renderPass} <b>must</b> be supported by the capabilities of the queue family identified by the {@code queueFamilyIndex} member of the ##VkCommandPoolCreateInfo used to create the command pool which {@code commandBuffer} was allocated from.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pRenderPassBegin} <b>must</b> be a valid pointer to a valid ##VkRenderPassBeginInfo structure</li>
            <li>{@code pSubpassBeginInfo} <b>must</b> be a valid pointer to a valid ##VkSubpassBeginInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRenderPassBeginInfo, ##VkSubpassBeginInfoKHR
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer in which to record the command."),
        VkRenderPassBeginInfo.const.p.IN("pRenderPassBegin", "a pointer to a ##VkRenderPassBeginInfo structure (defined below) which indicates the render pass to begin an instance of, and the framebuffer the instance uses."),
        VkSubpassBeginInfoKHR.const.p.IN("pSubpassBeginInfo", "a pointer to a ##VkSubpassBeginInfoKHR structure which contains information about the subpass which is about to begin rendering.")
    )

    void(
        "CmdNextSubpass2KHR",
        """
        Transition to the next subpass of a render pass.

        <h5>C Specification</h5>
        To transition to the next subpass in the render pass instance after recording the commands for a subpass, call:

        <pre><code>
￿void vkCmdNextSubpass2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkSubpassBeginInfoKHR*                pSubpassBeginInfo,
￿    const VkSubpassEndInfoKHR*                  pSubpassEndInfo);</code></pre>

        <h5>Description</h5>
        #CmdNextSubpass2KHR() is semantically identical to #CmdNextSubpass(), except that it is extensible, and that {@code contents} is provided as part of an extensible structure instead of as a flat parameter.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current subpass index <b>must</b> be less than the number of subpasses in the render pass minus one</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pSubpassBeginInfo} <b>must</b> be a valid pointer to a valid ##VkSubpassBeginInfoKHR structure</li>
            <li>{@code pSubpassEndInfo} <b>must</b> be a valid pointer to a valid ##VkSubpassEndInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkSubpassBeginInfoKHR, ##VkSubpassEndInfoKHR
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer in which to record the command."),
        VkSubpassBeginInfoKHR.const.p.IN("pSubpassBeginInfo", "a pointer to a ##VkSubpassBeginInfoKHR structure which contains information about the subpass which is about to begin rendering."),
        VkSubpassEndInfoKHR.const.p.IN("pSubpassEndInfo", "a pointer to a ##VkSubpassEndInfoKHR structure which contains information about how the previous subpass will be ended.")
    )

    void(
        "CmdEndRenderPass2KHR",
        """
        End the current render pass.

        <h5>C Specification</h5>
        To record a command to end a render pass instance after recording the commands for the last subpass, call:

        <pre><code>
￿void vkCmdEndRenderPass2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkSubpassEndInfoKHR*                  pSubpassEndInfo);</code></pre>

        <h5>Description</h5>
        #CmdEndRenderPass2KHR() is semantically identical to #CmdEndRenderPass(), except that it is extensible.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current subpass index <b>must</b> be equal to the number of subpasses in the render pass minus one</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pSubpassEndInfo} <b>must</b> be a valid pointer to a valid ##VkSubpassEndInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkSubpassEndInfoKHR
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer in which to end the current render pass instance."),
        VkSubpassEndInfoKHR.const.p.IN("pSubpassEndInfo", "a pointer to a ##VkSubpassEndInfoKHR structure which contains information about how the previous subpass will be ended.")
    )
}