/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_dynamic_rendering = "KHRDynamicRendering".nativeClassVK("KHR_dynamic_rendering", type = "device", postfix = KHR) {
    documentation =
        """
        This extension allows applications to create single-pass render pass instances without needing to create render pass objects or framebuffers. Dynamic render passes can also span across multiple primary command buffers, rather than relying on secondary command buffers.

        This extension also incorporates #ATTACHMENT_STORE_OP_NONE_KHR from {@link QCOMRenderPassStoreOps VK_QCOM_render_pass_store_ops}, enabling applications to avoid unnecessary synchronization when an attachment is not written during a render pass.

        <h5>VK_KHR_dynamic_rendering</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_dynamic_rendering}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>45</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_dynamic_rendering]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_dynamic_rendering%20extension%3E%3E">tobski</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_dynamic_rendering.asciidoc">VK_KHR_dynamic_rendering</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-10-06</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Arseny Kapoulkine, Roblox</li>
                <li>François Duranleau, Gameloft</li>
                <li>Stuart Smith, AMD</li>
                <li>Hai Nguyen, Google</li>
                <li>Jean-François Roy, Google</li>
                <li>Jeff Leger, Qualcomm</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Piers Daniell, Nvidia</li>
                <li>James Fitzpatrick, Imagination</li>
                <li>Piotr Byszewski, Mobica</li>
                <li>Jesse Hall, Google</li>
                <li>Mike Blumenkrantz, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DYNAMIC_RENDERING_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_DYNAMIC_RENDERING_EXTENSION_NAME".."VK_KHR_dynamic_rendering"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RENDERING_INFO_KHR".."1000044000",
        "STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR".."1000044001",
        "STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR".."1000044002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR".."1000044003",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR".."1000044004"
    )

    EnumConstant(
        "Extends {@code VkAttachmentStoreOp}.",

        "ATTACHMENT_STORE_OP_NONE_KHR".."1000301000"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00200000),
        "PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00200000)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR".."1000044006"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT".enum(0x00400000),
        "PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT".enum(0x00400000)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT".."1000044007"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD".."1000044008"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_NV".."1000044008"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX".."1000044009"
    )

    EnumConstant(
        """
        VkRenderingFlagBitsKHR - Bitmask specifying additional properties of a dynamic render pass instance

        <h5>Description</h5>
        <ul>
            <li>#RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR specifies that draw calls for the render pass instance will be recorded in secondary command buffers.</li>
            <li>#RENDERING_RESUMING_BIT_KHR specifies that the render pass instance is resuming an earlier suspended render pass instance.</li>
            <li>#RENDERING_SUSPENDING_BIT_KHR specifies that the render pass instance will be suspended.</li>
        </ul>

        The contents of {@code pRenderingInfo} <b>must</b> match between suspended render pass instances and the render pass instances that resume them, other than the presence or absence of the #RENDERING_RESUMING_BIT_KHR, #RENDERING_SUSPENDING_BIT_KHR, and #RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR flags. No action or synchronization commands, or other render pass instances, are allowed between suspending and resuming render pass instances.
        """,

        "RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR".enum(0x00000001),
        "RENDERING_SUSPENDING_BIT_KHR".enum(0x00000002),
        "RENDERING_RESUMING_BIT_KHR".enum(0x00000004)
    )

    void(
        "CmdBeginRenderingKHR",
        """
        Begin a dynamic render pass instance.

        <h5>C Specification</h5>
        To begin a render pass instance, call:

        <pre><code>
￿void vkCmdBeginRenderingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderingInfoKHR*                   pRenderingInfo);</code></pre>

        <h5>Description</h5>
        After beginning a render pass instance, the command buffer is ready to record <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#drawing">draw commands</a>.

        If {@code pRenderingInfo→flags} includes #RENDERING_RESUMING_BIT_KHR then this render pass is resumed from a render pass instance that has been suspended earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-dynamicRendering">{@code dynamicRendering}</a> feature <b>must</b> be enabled</li>
            <li>If {@code commandBuffer} is a secondary command buffer, {@code pRenderingInfo→flags} <b>must</b> not include #RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pRenderingInfo} <b>must</b> be a valid pointer to a valid ##VkRenderingInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRenderingInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkRenderingInfoKHR.const.p("pRenderingInfo", "a pointer to a ##VkRenderingInfoKHR structure specifying details of the render pass instance to begin.")
    )

    void(
        "CmdEndRenderingKHR",
        """
        End a dynamic render pass instance.

        <h5>C Specification</h5>
        To end a render pass instance, call:

        <pre><code>
￿void vkCmdEndRenderingKHR(
￿    VkCommandBuffer                             commandBuffer);</code></pre>

        <h5>Description</h5>
        If the value of {@code pRenderingInfo→flags} used to begin this render pass instance included #RENDERING_SUSPENDING_BIT_KHR, then this render pass is suspended and will be resumed later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current render pass instance <b>must</b> have been begun with #CmdBeginRenderingKHR()</li>
            <li>The current render pass instance <b>must</b> have been begun in {@code commandBuffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command.")
    )
}