/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_dynamic_rendering_local_read = "KHRDynamicRenderingLocalRead".nativeClassVK("KHR_dynamic_rendering_local_read", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension enables reads from attachments and resources written by previous fragment shaders within a dynamic render pass.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_dynamic_rendering_local_read}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>233</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRDynamicRendering VK_KHR_dynamic_rendering} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3">Version 1.3</a></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_dynamic_rendering_local_read]%20@tobski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_dynamic_rendering_local_read%20extension*">tobski</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_dynamic_rendering_local_read.adoc">VK_KHR_dynamic_rendering_local_read</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-11-03</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Hans-Kristian Arntzen, Valve</li>
                <li>Connor Abbott, Valve</li>
                <li>Pan Gao, Huawei</li>
                <li>Lionel Landwerlin, Intel</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>Alyssa Rosenzweig, Valve</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Mike Blumenkrantz, Valve</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Piers Daniell, Nvidia</li>
                <li>Stuart Smith, AMD</li>
                <li>Daniel Story, Nintendo</li>
                <li>James Fitzpatrick, Imagination</li>
                <li>Piotr Byszewski, Mobica</li>
                <li>Spencer Fricke, LunarG</li>
                <li>Tom Olson, Arm</li>
                <li>Michal Pietrasiuk, Intel</li>
                <li>Matthew Netsch, Qualcomm</li>
                <li>Marty Johnson, Khronos</li>
                <li>Wyvern Wang, Huawei</li>
                <li>Jeff Bolz, Nvidia</li>
                <li>Samuel (Sheng-Wen) Huang, MediaTek</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DYNAMIC_RENDERING_LOCAL_READ_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_DYNAMIC_RENDERING_LOCAL_READ_EXTENSION_NAME".."VK_KHR_dynamic_rendering_local_read"
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR".."1000232000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR".."1000232000",
        "STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR".."1000232001",
        "STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR".."1000232002"
    )

    void(
        "CmdSetRenderingAttachmentLocationsKHR",
        """
        Set color attachment location mappings for a command buffer.

        <h5>C Specification</h5>
        To set the fragment output location mappings during rendering, call:

        <pre><code>
￿void vkCmdSetRenderingAttachmentLocationsKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderingAttachmentLocationInfoKHR* pLocationInfo);</code></pre>

        <h5>Description</h5>
        This command sets the attachment location mappings for subsequent drawing commands, and <b>must</b> match the mappings provided to the currently bound pipeline, if one is bound, which <b>can</b> be set by chaining ##VkRenderingAttachmentLocationInfoKHR to ##VkGraphicsPipelineCreateInfo.

        Until this command is called, mappings in the command buffer state are treated as each color attachment specified in #CmdBeginRendering() having a location equal to its index in ##VkRenderingInfo{@code ::pColorAttachments}. This state is reset whenever #CmdBeginRendering() is called.

        <h5>Valid Usage</h5>
        <ul>
            <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> <b>must</b> be enabled</li>
            <li>{@code pLocationInfo→colorAttachmentCount} <b>must</b> be equal to the value of ##VkRenderingInfo{@code ::colorAttachmentCount} used to begin the current render pass instance</li>
            <li>The current render pass instance <b>must</b> have been started or resumed by #CmdBeginRendering() in this {@code commandBuffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pLocationInfo} <b>must</b> be a valid pointer to a valid ##VkRenderingAttachmentLocationInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRenderingAttachmentLocationInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkRenderingAttachmentLocationInfoKHR.const.p("pLocationInfo", "a ##VkRenderingAttachmentLocationInfoKHR structure indicating the new mappings.")
    )

    void(
        "CmdSetRenderingInputAttachmentIndicesKHR",
        """
        Set input attachment index mappings for a command buffer.

        <h5>C Specification</h5>
        To set the input attachment index mappings during dynamic rendering, call:

        <pre><code>
￿void vkCmdSetRenderingInputAttachmentIndicesKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderingInputAttachmentIndexInfoKHR* pLocationInfo);</code></pre>

        <h5>Description</h5>
        This command sets the input attachment index mappings for subsequent drawing commands, and <b>must</b> match the mappings provided to the currently bound pipeline, if one is bound, which <b>can</b> be set by chaining ##VkRenderingInputAttachmentIndexInfoKHR to ##VkGraphicsPipelineCreateInfo.

        Until this command is called, mappings in the command buffer state are treated as each color attachment specified in #CmdBeginRendering() mapping to subpass inputs with a {@code InputAttachmentIndex} equal to its index in ##VkRenderingInfo{@code ::pColorAttachments}, and depth/stencil attachments mapping to input attachments without these decorations. This state is reset whenever #CmdBeginRendering() is called.

        <h5>Valid Usage</h5>
        <ul>
            <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> <b>must</b> be enabled</li>
            <li>{@code pInputAttachmentIndexInfo→colorAttachmentCount} <b>must</b> be equal to the value of ##VkRenderingInfo{@code ::colorAttachmentCount} used to begin the current render pass instance</li>
            <li>The current render pass instance <b>must</b> have been started or resumed by #CmdBeginRendering() in this {@code commandBuffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pLocationInfo} <b>must</b> be a valid pointer to a valid ##VkRenderingInputAttachmentIndexInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRenderingInputAttachmentIndexInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkRenderingInputAttachmentIndexInfoKHR.const.p("pLocationInfo", "")
    )
}