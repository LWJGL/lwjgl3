/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_push_descriptor = "KHRPushDescriptor".nativeClassVK("KHR_push_descriptor", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension allows descriptors to be written into the command buffer, while the implementation is responsible for managing their memory. Push descriptors may enable easier porting from older APIs and in some cases can be more efficient than writing descriptors into descriptor sets.

        <h5>VK_KHR_push_descriptor</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_push_descriptor}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>81</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_push_descriptor]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_push_descriptor%20extension%3E%3E">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-09-12</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Michael Worcester, Imagination Technologies</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_PUSH_DESCRIPTOR_SPEC_VERSION".."2"
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

    EnumConstant(
        "Extends {@code VkDescriptorUpdateTemplateType}.",

        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR".."1"
    )

    void(
        "CmdPushDescriptorSetKHR",
        """
        Pushes descriptor updates into a command buffer.

        <h5>C Specification</h5>
        In addition to allocating descriptor sets and binding them to a command buffer, an application <b>can</b> record descriptor updates into the command buffer.

        To push descriptor updates into a command buffer, call:

        <pre><code>
￿void vkCmdPushDescriptorSetKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineBindPoint                         pipelineBindPoint,
￿    VkPipelineLayout                            layout,
￿    uint32_t                                    set,
￿    uint32_t                                    descriptorWriteCount,
￿    const VkWriteDescriptorSet*                 pDescriptorWrites);</code></pre>

        <h5>Description</h5>
        <em>Push descriptors</em> are a small bank of descriptors whose storage is internally managed by the command buffer rather than being written into a descriptor set and later bound to a command buffer. Push descriptors allow for incremental updates of descriptors without managing the lifetime of descriptor sets.

        When a command buffer begins recording, all push descriptors are undefined. Push descriptors <b>can</b> be updated incrementally and cause shaders to use the updated descriptors for subsequent <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipeline-bindpoint-commands">bound pipeline commands</a> with the pipeline type set by {@code pipelineBindPoint} until the descriptor is overwritten, or else until the set is disturbed as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a>. When the set is disturbed or push descriptors with a different descriptor set layout are set, all push descriptors are undefined.

        Push descriptors that are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-staticuse">statically used</a> by a pipeline <b>must</b> not be undefined at the time that a drawing or dispatching command is recorded to execute using that pipeline. This includes immutable sampler descriptors, which <b>must</b> be pushed before they are accessed by a pipeline (the immutable samplers are pushed, rather than the samplers in {@code pDescriptorWrites}). Push descriptors that are not statically used <b>can</b> remain undefined.

        Push descriptors do not use dynamic offsets. Instead, the corresponding non-dynamic descriptor types <b>can</b> be used and the {@code offset} member of ##VkDescriptorBufferInfo <b>can</b> be changed each time the descriptor is written.

        Each element of {@code pDescriptorWrites} is interpreted as in ##VkWriteDescriptorSet, except the {@code dstSet} member is ignored.

        To push an immutable sampler, use a ##VkWriteDescriptorSet with {@code dstBinding} and {@code dstArrayElement} selecting the immutable sampler’s binding. If the descriptor type is #DESCRIPTOR_TYPE_SAMPLER, the {@code pImageInfo} parameter is ignored and the immutable sampler is taken from the push descriptor set layout in the pipeline layout. If the descriptor type is #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, the {@code sampler} member of the {@code pImageInfo} parameter is ignored and the immutable sampler is taken from the push descriptor set layout in the pipeline layout.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
            <li>{@code set} <b>must</b> be less than ##VkPipelineLayoutCreateInfo{@code ::setLayoutCount} provided when {@code layout} was created</li>
            <li>{@code set} <b>must</b> be the unique set number in the pipeline layout that uses a descriptor set layout that was created with #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR</li>
            <li>For each element <code>i</code> where {@code pDescriptorWrites}[i].{@code descriptorType} is #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, {@code pDescriptorWrites}[i].{@code pImageInfo} <b>must</b> be a valid pointer to an array of {@code pDescriptorWrites}[i].{@code descriptorCount} valid ##VkDescriptorImageInfo structures</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code pDescriptorWrites} <b>must</b> be a valid pointer to an array of {@code descriptorWriteCount} valid ##VkWriteDescriptorSet structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkWriteDescriptorSet
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkPipelineBindPoint("pipelineBindPoint", "a {@code VkPipelineBindPoint} indicating the type of the pipeline that will use the descriptors. There is a separate set of push descriptor bindings for each pipeline type, so binding one does not disturb the others."),
        VkPipelineLayout("layout", "a {@code VkPipelineLayout} object used to program the bindings."),
        uint32_t("set", "the set number of the descriptor set in the pipeline layout that will be updated."),
        AutoSize("pDescriptorWrites")..uint32_t("descriptorWriteCount", "the number of elements in the {@code pDescriptorWrites} array."),
        VkWriteDescriptorSet.const.p("pDescriptorWrites", "a pointer to an array of ##VkWriteDescriptorSet structures describing the descriptors to be updated.")
    )

    DependsOn("""ext.contains("Vulkan11") || ext.contains("VK_KHR_descriptor_update_template")""")..void(
        "CmdPushDescriptorSetWithTemplateKHR",
        """
        Pushes descriptor updates into a command buffer using a descriptor update template.

        <h5>C Specification</h5>
        It is also possible to use a descriptor update template to specify the push descriptors to update. To do so, call:

        <pre><code>
￿void vkCmdPushDescriptorSetWithTemplateKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
￿    VkPipelineLayout                            layout,
￿    uint32_t                                    set,
￿    const void*                                 pData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code pipelineBindPoint} specified during the creation of the descriptor update template <b>must</b> be supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
            <li>{@code pData} <b>must</b> be a valid pointer to a memory containing one or more valid instances of ##VkDescriptorImageInfo, ##VkDescriptorBufferInfo, or {@code VkBufferView} in a layout defined by {@code descriptorUpdateTemplate} when it was created with #CreateDescriptorUpdateTemplate()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplate} handle</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Each of {@code commandBuffer}, {@code descriptorUpdateTemplate}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
        </table>

        <pre><code>
￿struct AppDataStructure
￿{
￿    VkDescriptorImageInfo  imageInfo;          // a single image info
￿    // ... some more application related data
￿};
￿
￿const VkDescriptorUpdateTemplateEntry descriptorUpdateTemplateEntries[] =
￿{
￿    // binding to a single image descriptor
￿    {
￿        0,                                           // binding
￿        0,                                           // dstArrayElement
￿        1,                                           // descriptorCount
￿        VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER,   // descriptorType
￿        offsetof(AppDataStructure, imageInfo),       // offset
￿        0                                            // stride is not required if descriptorCount is 1
￿    }
￿};
￿
￿// create a descriptor update template for push descriptor set updates
￿const VkDescriptorUpdateTemplateCreateInfo createInfo =
￿{
￿    VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO,  // sType
￿    NULL,                                                      // pNext
￿    0,                                                         // flags
￿    1,                                                         // descriptorUpdateEntryCount
￿    descriptorUpdateTemplateEntries,                           // pDescriptorUpdateEntries
￿    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR,   // templateType
￿    0,                                                         // descriptorSetLayout, ignored by given templateType
￿    VK_PIPELINE_BIND_POINT_GRAPHICS,                           // pipelineBindPoint
￿    myPipelineLayout,                                          // pipelineLayout
￿    0,                                                         // set
￿};
￿
￿VkDescriptorUpdateTemplate myDescriptorUpdateTemplate;
￿myResult = vkCreateDescriptorUpdateTemplate(
￿    myDevice,
￿    &amp;createInfo,
￿    NULL,
￿    &amp;myDescriptorUpdateTemplate);
￿
￿AppDataStructure appData;
￿// fill appData here or cache it in your engine
￿vkCmdPushDescriptorSetWithTemplateKHR(myCmdBuffer, myDescriptorUpdateTemplate, myPipelineLayout, 0,&amp;appData);</code></pre>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate", "a descriptor update template defining how to interpret the descriptor information in {@code pData}."),
        VkPipelineLayout("layout", "a {@code VkPipelineLayout} object used to program the bindings. It <b>must</b> be compatible with the layout used to create the {@code descriptorUpdateTemplate} handle."),
        uint32_t("set", "the set number of the descriptor set in the pipeline layout that will be updated. This <b>must</b> be the same number used to create the {@code descriptorUpdateTemplate} handle."),
        nullable..opaque_const_p("pData", "a pointer to memory containing descriptors for the templated update.")
    )
}