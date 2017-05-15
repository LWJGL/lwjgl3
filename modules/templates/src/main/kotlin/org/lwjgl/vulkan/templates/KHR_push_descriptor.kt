/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_push_descriptor = "KHRPushDescriptor".nativeClassVK("KHR_push_descriptor", type = "device", postfix = KHR) {
    documentation =
        """
        This extension allows descriptors to be written into the command buffer, with the implementation being responsible for managing their memory. Push descriptors may enable easier porting from older APIs and in some cases can be more efficient than writing descriptors into descriptor sets.

        <h5>Examples</h5>
        None.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHR_push_descriptor</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>81</dd>

            <dt><b>Status</b></dt>
            <dd>Draft.</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-15</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires VK_KHR_get_physical_device_properties2.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Michael Worcester, Imagination Technologies</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Jeff Bolz (jbolz 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_PUSH_DESCRIPTOR_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_PUSH_DESCRIPTOR_EXTENSION_NAME".."VK_KHR_push_descriptor"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR".."1000080000"
    )

    EnumConstant(
        "Extends {@code VkDescriptorSetLayoutCreateFlagBits}.",

        "DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR".enum(0x00000001)
    )

    void(
        "CmdPushDescriptorSetKHR",
        """
        Pushes descriptor updates into a command buffer.

        <h5>C Specification</h5>
        In addition to allocating descriptor sets and binding them to a command buffer, an application <b>can</b> record descriptor updates into the command buffer.

        To push descriptor updates into a command buffer, call:

        <code><pre>
￿void vkCmdPushDescriptorSetKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineBindPoint                         pipelineBindPoint,
￿    VkPipelineLayout                            layout,
￿    uint32_t                                    set,
￿    uint32_t                                    descriptorWriteCount,
￿    const VkWriteDescriptorSet*                 pDescriptorWrites);</pre></code>

        <h5>Description</h5>
        <em>Push descriptors</em> are a small bank of descriptors whose storage is internally managed by the command buffer rather than being written into a descriptor set and later bound to a command buffer. Push descriptors allow for incremental updates of descriptors without managing the lifetime of descriptor sets.

        When a command buffer begins recording, all push descriptors have undefined contents. Push descriptors <b>can</b> be updated incrementally and cause shaders to use the updated descriptors for subsequent rendering commands (either compute or graphics, according to the {@code pipelineBindPoint}) until the descriptor is overwritten, or else until the set is disturbed as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a>. When the set is disturbed or push descriptors with a different descriptor set layout are set, all push descriptors become invalid.

        Valid descriptors <b>must</b> be pushed for all bindings that any shaders in a pipeline access, at the time that a draw or dispatch command is recorded to execute using that pipeline. This includes immutable sampler descriptors, which <b>must</b> be pushed before they are accessed by a pipeline. However, if none of the shaders in a pipeline statically use certain bindings in the push descriptor set, then those descriptors need not be valid.

        Push descriptors do not use dynamic offsets. Instead, the corresponding non-dynamic descriptor types <b>can</b> be used and the {@code offset} member of ##VkDescriptorBufferInfo <b>can</b> be changed each time the descriptor is written.

        Each element of {@code pDescriptorWrites} is interpreted as in ##VkWriteDescriptorSet, except the {@code dstSet} member is ignored.

        To push an immutable sampler, use a ##VkWriteDescriptorSet with {@code dstBinding} and {@code dstArrayElement} selecting the immutable sampler's binding. If the descriptor type is #DESCRIPTOR_TYPE_SAMPLER, the {@code pImageInfo} parameter is ignored and the immutable sampler is taken from the push descriptor set layout in the pipeline layout. If the descriptor type is #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, the {@code sampler} member of the the {@code pImageInfo} parameter is ignored and the immutable sampler is taken from the push descriptor set layout in the pipeline layout.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}&#8217;s parent {@code VkCommandPool}&#8217;s queue family</li>
            <li>{@code set} <b>must</b> be less than ##VkPipelineLayoutCreateInfo{@code ::setLayoutCount} provided when {@code layout} was created</li>
            <li>{@code set} <b>must</b> be the unique set number in the pipeline layout that uses a descriptor set layout that was created with #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code pDescriptorWrites} <b>must</b> be a pointer to an array of {@code descriptorWriteCount} valid ##VkWriteDescriptorSet structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>{@code descriptorWriteCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkWriteDescriptorSet
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkPipelineBindPoint.IN("pipelineBindPoint", "a {@code VkPipelineBindPoint} indicating whether the descriptors will be used by graphics pipelines or compute pipelines. There is a separate set of push descriptor bindings for each of graphics and compute, so binding one does not disturb the other."),
        VkPipelineLayout.IN("layout", "a {@code VkPipelineLayout} object used to program the bindings."),
        uint32_t.IN("set", "the set number of the descriptor set in the pipeline layout that will be updated."),
        AutoSize("pDescriptorWrites")..uint32_t.IN("descriptorWriteCount", "the number of elements in the {@code pDescriptorWrites} array."),
        const..VkWriteDescriptorSet.p.IN("pDescriptorWrites", "a pointer to an array of ##VkWriteDescriptorSet structures describing the descriptors to be updated.")
    )
}