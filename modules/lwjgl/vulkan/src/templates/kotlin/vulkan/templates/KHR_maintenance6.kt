/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance6 = "KHRMaintenance6".nativeClassVK("KHR_maintenance6", type = "device", postfix = "KHR") {
    documentation =
        """
        {@link KHRMaintenance6 VK_KHR_maintenance6} adds a collection of minor features, none of which would warrant an entire extension of their own.

        The new features are as follows:

        <ul>
            <li>##VkBindMemoryStatusKHR may be included in the {@code pNext} chain of ##VkBindBufferMemoryInfo and ##VkBindImageMemoryInfo, allowing applications to identify individual resources for which memory binding failed during calls to #BindBufferMemory2() and #BindImageMemory2().</li>
            <li>A new property {@code fragmentShadingRateClampCombinerInputs} to indicate if an implementation clamps the inputs to fragment shading rate combiner operations.</li>
            <li>#NULL_HANDLE is allowed to be used when binding an index buffer, instead of a valid {@code VkBuffer} handle. When the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-nullDescriptor">{@code nullDescriptor}</a> feature is enabled, every index fetched results in a value of zero.</li>
            <li>A new property {@code maxCombinedImageSamplerDescriptorCount} to indicate the maximum number of descriptors needed for any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">formats that require a sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> supported by the implementation.</li>
            <li>A new property {@code blockTexelViewCompatibleMultipleLayers} indicating whether #IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT is allowed to be used with {@code layerCount} &gt; 1</li>
            <li>{@code pNext} extensible *2 versions of all descriptor binding commands.</li>
        </ul>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_maintenance6}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>546</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_EXT_descriptor_buffer</li>
                <li>Interacts with VK_KHR_push_descriptor</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jon Leech <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance6]%20@oddhack%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance6%20extension*">oddhack</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_maintenance6.adoc">VK_KHR_maintenance6</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-08-03</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Interacts with {@link EXTRobustness2 VK_EXT_robustness2}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jon Leech, Khronos</li>
                <li>Stu Smith, AMD</li>
                <li>Mike Blumenkrantz, Valve</li>
                <li>Ralph Potter, Samsung</li>
                <li>James Fitzpatrick, Imagination Technologies</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Daniel Story, Nintendo</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_MAINTENANCE_6_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_MAINTENANCE_6_EXTENSION_NAME".."VK_KHR_maintenance6"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR".."1000545000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR".."1000545001",
        "STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR".."1000545002",
        "STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR".."1000545003",
        "STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR".."1000545004"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR".."1000545005",
        "STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR".."1000545006"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT".."1000545007",
        "STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT".."1000545008"
    )

    void(
        "CmdBindDescriptorSets2KHR",
        """
        Binds descriptor sets to a command buffer.

        <h5>C Specification</h5>
        Alternatively, to bind one or more descriptor sets to a command buffer, call:

        <pre><code>
￿void vkCmdBindDescriptorSets2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkBindDescriptorSetsInfoKHR*          pBindDescriptorSetsInfo);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>Each bit in {@code pBindDescriptorSetsInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBindDescriptorSetsInfo} <b>must</b> be a valid pointer to a valid ##VkBindDescriptorSetsInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBindDescriptorSetsInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptor sets will be bound to."),
        VkBindDescriptorSetsInfoKHR.const.p("pBindDescriptorSetsInfo", "a pointer to a ##VkBindDescriptorSetsInfoKHR structure.")
    )

    void(
        "CmdPushConstants2KHR",
        """
        Update the values of push constants.

        <h5>C Specification</h5>
        Alternatively, to update push constants, call:

        <pre><code>
￿void vkCmdPushConstants2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkPushConstantsInfoKHR*               pPushConstantsInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pPushConstantsInfo} <b>must</b> be a valid pointer to a valid ##VkPushConstantsInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkPushConstantsInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which the push constant update will be recorded."),
        VkPushConstantsInfoKHR.const.p("pPushConstantsInfo", "a pointer to a ##VkPushConstantsInfoKHR structure.")
    )

    DependsOn("VK_KHR_push_descriptor")..void(
        "CmdPushDescriptorSet2KHR",
        """
        Pushes descriptor updates into a command buffer.

        <h5>C Specification</h5>
        Alternatively, to push descriptor updates into a command buffer, call:

        <pre><code>
￿void vkCmdPushDescriptorSet2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkPushDescriptorSetInfoKHR*           pPushDescriptorSetInfo);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>Each bit in {@code pPushDescriptorSetInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pPushDescriptorSetInfo} <b>must</b> be a valid pointer to a valid ##VkPushDescriptorSetInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkPushDescriptorSetInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkPushDescriptorSetInfoKHR.const.p("pPushDescriptorSetInfo", "a pointer to a ##VkPushDescriptorSetInfoKHR structure.")
    )

    DependsOn("VK_KHR_push_descriptor")..void(
        "CmdPushDescriptorSetWithTemplate2KHR",
        """
        Pushes descriptor updates into a command buffer using a descriptor update template.

        <h5>C Specification</h5>
        Alternatively, to use a descriptor update template to specify the push descriptors to update, call:

        <pre><code>
￿void vkCmdPushDescriptorSetWithTemplate2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkPushDescriptorSetWithTemplateInfoKHR* pPushDescriptorSetWithTemplateInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pPushDescriptorSetWithTemplateInfo} <b>must</b> be a valid pointer to a valid ##VkPushDescriptorSetWithTemplateInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkPushDescriptorSetWithTemplateInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkPushDescriptorSetWithTemplateInfoKHR.const.p("pPushDescriptorSetWithTemplateInfo", "a pointer to a ##VkPushDescriptorSetWithTemplateInfoKHR structure.")
    )

    DependsOn("VK_EXT_descriptor_buffer")..void(
        "CmdSetDescriptorBufferOffsets2EXT",
        """
        Setting descriptor buffer offsets in a command buffer.

        <h5>C Specification</h5>
        Alternatively, to set descriptor buffer offsets in a command buffer, call:

        <pre><code>
￿void vkCmdSetDescriptorBufferOffsets2EXT(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkSetDescriptorBufferOffsetsInfoEXT*  pSetDescriptorBufferOffsetsInfo);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
            <li>Each bit in {@code pSetDescriptorBufferOffsetsInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pSetDescriptorBufferOffsetsInfo} <b>must</b> be a valid pointer to a valid ##VkSetDescriptorBufferOffsetsInfoEXT structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkSetDescriptorBufferOffsetsInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which the descriptor buffer offsets will be set."),
        VkSetDescriptorBufferOffsetsInfoEXT.const.p("pSetDescriptorBufferOffsetsInfo", "a pointer to a ##VkSetDescriptorBufferOffsetsInfoEXT structure.")
    )

    DependsOn("VK_EXT_descriptor_buffer")..void(
        "CmdBindDescriptorBufferEmbeddedSamplers2EXT",
        """
        Setting embedded immutable samplers offsets in a command buffer.

        <h5>C Specification</h5>
        Alternatively, to bind an embedded immutable sampler set to a command buffer, call:

        <pre><code>
￿void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkBindDescriptorBufferEmbeddedSamplersInfoEXT* pBindDescriptorBufferEmbeddedSamplersInfo);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
            <li>Each bit in {@code pBindDescriptorBufferEmbeddedSamplersInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBindDescriptorBufferEmbeddedSamplersInfo} <b>must</b> be a valid pointer to a valid ##VkBindDescriptorBufferEmbeddedSamplersInfoEXT structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBindDescriptorBufferEmbeddedSamplersInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the embedded immutable samplers will be bound to."),
        VkBindDescriptorBufferEmbeddedSamplersInfoEXT.const.p("pBindDescriptorBufferEmbeddedSamplersInfo", "a pointer to a ##VkBindDescriptorBufferEmbeddedSamplersInfoEXT structure.")
    )
}