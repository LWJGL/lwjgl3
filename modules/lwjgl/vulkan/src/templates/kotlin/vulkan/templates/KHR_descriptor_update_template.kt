/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_descriptor_update_template = "KHRDescriptorUpdateTemplate".nativeClassVK("KHR_descriptor_update_template", type = "device", postfix = "KHR") {
    documentation =
        """
        Applications may wish to update a fixed set of descriptors in a large number of descriptor sets very frequently, i.e. during initializaton phase or if it is required to rebuild descriptor sets for each frame. For those cases it is also not unlikely that all information required to update a single descriptor set is stored in a single struct. This extension provides a way to update a fixed set of descriptors in a single {@code VkDescriptorSet} with a pointer to a user defined data structure describing the new descriptors.

        <h5>Promotion to Vulkan 1.1</h5>
        #CmdPushDescriptorSetWithTemplateKHR() is included as an interaction with {@link KHRPushDescriptor VK_KHR_push_descriptor}. If Vulkan 1.1 and {@code VK_KHR_push_descriptor} are supported, this is included by {@link KHRPushDescriptor VK_KHR_push_descriptor}.

        The base functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_descriptor_update_template</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_descriptor_update_template}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>86</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Markus Tavenrath <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_descriptor_update_template]%20@mtavenrath%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_descriptor_update_template%20extension%3E%3E">mtavenrath</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-09-05</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Interacts with {@link KHRPushDescriptor VK_KHR_push_descriptor}</li>
                <li>Promoted to Vulkan 1.1 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Michael Worcester, Imagination Technologies</li>
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
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR".."1000085000"
    )

    EnumConstant(
        "Extends {@code VkDescriptorUpdateTemplateType}.",

        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR".."0"
    )

    EnumConstant(
        "Extends {@code VkDescriptorUpdateTemplateType}.",

        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR".."1"
    )

    EnumConstant(
        "Extends {@code VkDebugReportObjectTypeEXT}.",

        "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT".."1000085000"
    )

    VkResult(
        "CreateDescriptorUpdateTemplateKHR",
        "See #CreateDescriptorUpdateTemplate().",

        VkDevice("device", "the logical device that creates the descriptor update template."),
        VkDescriptorUpdateTemplateCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkDescriptorUpdateTemplateCreateInfo structure specifying the set of descriptors to update with a single call to #CmdPushDescriptorSetWithTemplateKHR() or #UpdateDescriptorSetWithTemplate()."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDescriptorUpdateTemplate.p("pDescriptorUpdateTemplate", "a pointer to a {@code VkDescriptorUpdateTemplate} handle in which the resulting descriptor update template object is returned.")
    )

    void(
        "DestroyDescriptorUpdateTemplateKHR",
        "See #DestroyDescriptorUpdateTemplate().",

        VkDevice("device", "the logical device that has been used to create the descriptor update template"),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate", "the descriptor update template to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "UpdateDescriptorSetWithTemplateKHR",
        "See #UpdateDescriptorSetWithTemplate().",

        VkDevice("device", "the logical device that updates the descriptor set."),
        VkDescriptorSet("descriptorSet", "the descriptor set to update"),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate", "a {@code VkDescriptorUpdateTemplate} object specifying the update mapping between {@code pData} and the descriptor set to update."),
        nullable..opaque_const_p("pData", "a pointer to memory containing one or more ##VkDescriptorImageInfo, ##VkDescriptorBufferInfo, or {@code VkBufferView} structures or {@code VkAccelerationStructureKHR} or {@code VkAccelerationStructureNV} handles used to write the descriptors.")
    )

    DependsOn("VK_KHR_push_descriptor")..void(
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