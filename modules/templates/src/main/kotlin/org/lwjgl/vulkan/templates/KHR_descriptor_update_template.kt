/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_descriptor_update_template = "KHRDescriptorUpdateTemplate".nativeClassVK("KHR_descriptor_update_template", type = "device", postfix = KHR) {
    documentation =
        """
        Applications may wish to update a fixed set of descriptors in a large number of descriptors sets very frequently, i.e. during initializaton phase or if it's required to rebuild descriptor sets for each frame. For those cases it's also not unlikely that all information required to update a single descriptor set is stored in a single struct. This extension provides a way to update a fixed set of descriptors in a single {@code VkDescriptorSet} with a pointer to a user defined data structure which describes the new descriptors.

        <h5>Examples</h5>
        <code><pre>
￿    // TODO: Write some sample code here.</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHR_descriptor_update_template</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>86</dd>

            <dt><b>Status</b></dt>
            <dd>In Work</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-01-11</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Interacts with VK_KHR_push_descriptor</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Michael Worcester, Imagination Technologies</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Markus Tavenrath (matavenrath 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME".."VK_KHR_descriptor_update_template"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR".."1000085000"
    )

    EnumConstant(
        "Extends {@code VkDebugReportObjectTypeEXT}.",

        "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT".."1000085000"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR".."1000085000"
    )

    EnumConstant(
        """
        VkDescriptorUpdateTemplateTypeKHR - Indicates the valid usage of the descriptor update template

        <h5>Description</h5>
        <ul>
            <li>#DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR specifies that the descriptor update template will be used for descriptor set updates only.</li>
            <li>#DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR specifies that the descriptor update template will be used for push descriptor updates only.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorUpdateTemplateCreateInfoKHR
        """,

        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR".."0",
        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR".."1"
    )

    VkResult(
        "CreateDescriptorUpdateTemplateKHR",
        """
        Create a new descriptor update template.

        <h5>C Specification</h5>
        Updating a large {@code VkDescriptorSet} array <b>can</b> be an expensive operation since an application <b>must</b> specify one ##VkWriteDescriptorSet structure for each descriptor or descriptor array to update, each of which re-specifies the same state when updating the same descriptor in multiple descriptor sets. For cases when an application wishes to update the same set of descriptors in multiple descriptor sets allocated using the same {@code VkDescriptorSetLayout}, #UpdateDescriptorSetWithTemplateKHR() <b>can</b> be used as a replacement for #UpdateDescriptorSets().

        {@code VkDescriptorUpdateTemplateKHR} allows implementations to convert a set of descriptor update operations on a single descriptor set to an internal format that, in conjunction with #UpdateDescriptorSetWithTemplateKHR() or #CmdPushDescriptorSetWithTemplateKHR() , <b>can</b> be more efficient compared to calling #UpdateDescriptorSets() or #CmdPushDescriptorSetKHR() . The descriptors themselves are not specified in the {@code VkDescriptorUpdateTemplateKHR}, rather, offsets into an application provided pointer to host memory are specified, which are combined with a pointer passed to #UpdateDescriptorSetWithTemplateKHR() or #CmdPushDescriptorSetWithTemplateKHR() . This allows large batches of updates to be executed without having to convert application data structures into a strictly-defined Vulkan data structure.

        To create a descriptor update template, call:

        <code><pre>
￿VkResult vkCreateDescriptorUpdateTemplateKHR(
￿    VkDevice                                    device,
￿    const VkDescriptorUpdateTemplateCreateInfoKHR* pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDescriptorUpdateTemplateKHR*              pDescriptorUpdateTemplate);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkDescriptorUpdateTemplateCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pDescriptorUpdateTemplate} <b>must</b> be a pointer to a {@code VkDescriptorUpdateTemplateKHR} handle</li>
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
        ##VkAllocationCallbacks, ##VkDescriptorUpdateTemplateCreateInfoKHR
        """,

        VkDevice.IN("device", "the logical device that creates the descriptor update template."),
        const..VkDescriptorUpdateTemplateCreateInfoKHR.p.IN("pCreateInfo", "a pointer to an instance of the ##VkDescriptorUpdateTemplateCreateInfoKHR structure specifying the set of descriptors to update with a single call to #CmdPushDescriptorSetWithTemplateKHR() or #UpdateDescriptorSetWithTemplateKHR()."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDescriptorUpdateTemplateKHR.p.OUT("pDescriptorUpdateTemplate", "points to a {@code VkDescriptorUpdateTemplateKHR} handle in which the resulting descriptor update template object is returned.")
    )

    void(
        "DestroyDescriptorUpdateTemplateKHR",
        """
        Destroy a descriptor update template object.

        <h5>C Specification</h5>
        To destroy a descriptor update template, call:

        <code><pre>
￿void vkDestroyDescriptorUpdateTemplateKHR(
￿    VkDevice                                    device,
￿    VkDescriptorUpdateTemplateKHR               descriptorUpdateTemplate,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code descriptorSetLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code descriptorUpdateTemplate} is not #NULL_HANDLE, {@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplateKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code descriptorUpdateTemplate} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorUpdateTemplate} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that has been used to create the descriptor update template"),
        VkDescriptorUpdateTemplateKHR.IN("descriptorUpdateTemplate", "the descriptor update template to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "UpdateDescriptorSetWithTemplateKHR",
        """
        Update the contents of a descriptor set object using an update template.

        <h5>C Specification</h5>
        Once a {@code VkDescriptorUpdateTemplateKHR} has been created, descriptor sets <b>can</b> be updated by calling:

        <code><pre>
￿void vkUpdateDescriptorSetWithTemplateKHR(
￿    VkDevice                                    device,
￿    VkDescriptorSet                             descriptorSet,
￿    VkDescriptorUpdateTemplateKHR               descriptorUpdateTemplate,
￿    const void*                                 pData);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code descriptorSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
            <li>{@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplateKHR} handle</li>
            <li>{@code pData} <b>must</b> be a pointer</li>
            <li>{@code descriptorUpdateTemplate} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorSet} <b>must</b> be externally synchronized</li>
        </ul>

        <code><pre>
￿struct AppBufferView {
￿    VkBufferView bufferView;
￿    uint32_t     applicationRelatedInformation;
￿};
￿
￿struct AppDataStructure
￿{
￿    VkDescriptorImageInfo  imageInfo;          // a single image info
￿    VkDescriptorBufferInfo bufferInfoArray[3]; // 3 buffer infos in an array
￿    AppBufferView          bufferView[2];      // An application defined structure containing a bufferView
￿    // ... some more application related data
￿};
￿
￿const VkDescriptorUpdateTemplateEntryKHR descriptorUpdateTemplateEntries[] =
￿{
￿    // binding to a single image descriptor
￿    {
￿        0,                                           // binding
￿        0,                                           // dstArrayElement
￿        1,                                           // descriptorCount
￿        VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER,   // descriptorType
￿        offsetof(AppDataStructure, imageInfo),       // offset
￿        0                                            // stride is not required if descriptorCount is 1.
￿    },
￿
￿    // binding to an array of buffer descriptors
￿    {
￿        0,                                           // binding
￿        0,                                           // dstArrayElement
￿        3,                                           // descriptorCount
￿        VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER,           // descriptorType
￿        offsetof(AppDataStructure, bufferInfoArray), // offset
￿        sizeof(VkDescriptorBufferInfo)               // stride, descriptor buffer infos are compact
￿    },
￿
￿    // binding to an array of buffer views
￿    {
￿        0,                                           // binding
￿        3,                                           // dstArrayElement
￿        1,                                           // descriptorCount
￿        VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER,     // descriptorType
￿        offsetof(AppDataStructure, bufferView),      // offset
￿        sizeof(AppBufferView)                        // stride, bufferViews do not have to be compact
￿    },
￿};
￿
￿// create an descriptor update template for descriptor set updates
￿const VkDescriptorUpdateTemplateCreateInfoKHR createInfo =
￿{
￿    VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR,  // sType
￿    NULL,                                                          // pNext
￿    0,                                                             // flags
￿    3,                                                             // descriptorUpdateEntryCount
￿    descriptorUpdateTemplateEntries,                               // pDescriptorUpdateEntries
￿    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR,         // templateType
￿    myLayout,                                                      // descriptorSetLayout
￿    0,                                                             // pipelineBindPoint, ignored by given templateType
￿    0,                                                             // pipelineLayout, ignored by given templateType
￿    0,                                                             // set, ignored by given templateType
￿};
￿
￿VkDescriptorUpdateTemplateKHR myDescriptorUpdateTemplate;
￿myResult = vkCreatePipelineLayout(
￿    myDevice,
￿    &createInfo,
￿    NULL,
￿    &myDescriptorUpdateTemplate);
￿}
￿
￿
￿AppDataStructure appData;
￿
￿// fill appData here or cache it in your engine
￿vkUpdateDescriptorSetWithTemplateKHR(myDevice, myDescriptorSet, myDescriptorUpdateTemplate, &appData);</pre></code>
        """,

        VkDevice.IN("device", "the logical device that updates the descriptor sets."),
        VkDescriptorSet.IN("descriptorSet", "the descriptor set to update"),
        VkDescriptorUpdateTemplateKHR.IN("descriptorUpdateTemplate", "the {@code VkDescriptorUpdateTemplateKHR} which specifies the update mapping between the application pointer and the descriptor set to update."),
        const..opaque_p.IN("pData", "a pointer to memory which contains one or more structures of ##VkDescriptorImageInfo, ##VkDescriptorBufferInfo, or {@code VkBufferView} used to write the descriptors.")
    )

    void(
        "CmdPushDescriptorSetWithTemplateKHR",
        """
        Pushes descriptor updates into a command buffer using a descriptor update template.

        <h5>C Specification</h5>
        It is also possible to use a descriptor update template to specify the push descriptors to update. To do so, call:

        <code><pre>
￿void vkCmdPushDescriptorSetWithTemplateKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDescriptorUpdateTemplateKHR               descriptorUpdateTemplate,
￿    VkPipelineLayout                            layout,
￿    uint32_t                                    set,
￿    const void*                                 pData);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>The pipelineBindPoint specified during the creation of the descriptor update template <b>must</b> be supported by the {@code commandBuffer}&#8217;s parent {@code VkCommandPool}&#8217;s queue family</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplateKHR} handle</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code pData} <b>must</b> be a pointer</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>

        <code><pre>
￿struct AppBufferView {
￿    VkBufferView bufferView;
￿    uint32_t     applicationRelatedInformation;
￿};
￿
￿struct AppDataStructure
￿{
￿    VkDescriptorImageInfo  imageInfo;          // a single image info
￿    // ... some more application related data
￿};
￿
￿const VkDescriptorUpdateTemplateEntryKHR descriptorUpdateTemplateEntries[] =
￿{
￿    // binding to a single image descriptor
￿    {
￿        0,                                           // binding
￿        0,                                           // dstArrayElement
￿        1,                                           // descriptorCount
￿        VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER,   // descriptorType
￿        offsetof(AppDataStructure, imageInfo),       // offset
￿        0                                            // stride is not required if descriptorCount is 1.
￿    }
￿
￿};
￿
￿// create an descriptor update template for descriptor set updates
￿const VkDescriptorUpdateTemplateCreateInfoKHR createInfo =
￿{
￿    VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR,  // sType
￿    NULL,                                                          // pNext
￿    0,                                                             // flags
￿    1,                                                             // descriptorUpdateEntryCount
￿    descriptorUpdateTemplateEntries,                               // pDescriptorUpdateEntries
￿    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR,       // templateType
￿    0,                                                             // descriptorSetLayout, ignored by given templateType
￿    VK_PIPELINE_BIND_POINT_GRAPHICS,                               // pipelineBindPoint
￿    myPipelineLayout,                                              // pipelineLayout
￿    0,                                                             // set
￿};
￿
￿VkDescriptorUpdateTemplateKHR myDescriptorUpdateTemplate;
￿myResult = vkCreatePipelineLayout(
￿    myDevice,
￿    &createInfo,
￿    NULL,
￿    &myDescriptorUpdateTemplate);
￿}
￿
￿AppDataStructure appData;
￿// fill appData here or cache it in your engine
￿vkCmdPushDescriptorSetWithTemplateKHR(myCmdBuffer, myDescriptorUpdateTemplate, myPipelineLayout, 0,&appData);</pre></code>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkDescriptorUpdateTemplateKHR.IN("descriptorUpdateTemplate", "A descriptor update template which defines how to interpret the descriptor information in pData."),
        VkPipelineLayout.IN("layout", "a {@code VkPipelineLayout} object used to program the bindings. It <b>must</b> be compatible with the layout used to create the {@code descriptorUpdateTemplate} handle."),
        uint32_t.IN("set", "the set number of the descriptor set in the pipeline layout that will be updated. This <b>must</b> be the same number used to create the {@code descriptorUpdateTemplate} handle."),
        const..opaque_p.IN("pData", "Points to memory which contains the descriptors for the templated update.")
    )
}