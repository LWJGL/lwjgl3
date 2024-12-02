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
        Applications may wish to update a fixed set of descriptors in a large number of descriptor sets very frequently, i.e. during initialization phase or if it is required to rebuild descriptor sets for each frame. For those cases it is also not unlikely that all information required to update a single descriptor set is stored in a single struct. This extension provides a way to update a fixed set of descriptors in a single {@code VkDescriptorSet} with a pointer to an application-defined data structure describing the new descriptors.

        <h5>Promotion to Vulkan 1.1</h5>
        #CmdPushDescriptorSetWithTemplateKHR() is included as an interaction with {@link KHRPushDescriptor VK_KHR_push_descriptor}. If Vulkan 1.1 and {@code VK_KHR_push_descriptor} are supported, this is included by {@link KHRPushDescriptor VK_KHR_push_descriptor}.

        The base functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum, and command names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_descriptor_update_template}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>86</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_EXT_debug_report</li>
                <li>Interacts with VK_KHR_push_descriptor</li>
            </ul></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Markus Tavenrath <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_descriptor_update_template]%20@mtavenrath%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_descriptor_update_template%20extension*">mtavenrath</a></li>
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
        VkDescriptorUpdateTemplateCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkDescriptorUpdateTemplateCreateInfo structure specifying the set of descriptors to update with a single call to #CmdPushDescriptorSetWithTemplate() or #UpdateDescriptorSetWithTemplate()."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDescriptorUpdateTemplate.p("pDescriptorUpdateTemplate", "a pointer to a {@code VkDescriptorUpdateTemplate} handle in which the resulting descriptor update template object is returned.")
    )

    void(
        "DestroyDescriptorUpdateTemplateKHR",
        "See #DestroyDescriptorUpdateTemplate().",

        VkDevice("device", "the logical device that has been used to create the descriptor update template"),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate", "the descriptor update template to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
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
        "See #CmdPushDescriptorSetWithTemplate().",

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate", "a descriptor update template defining how to interpret the descriptor information in {@code pData}."),
        VkPipelineLayout("layout", "a {@code VkPipelineLayout} object used to program the bindings. It <b>must</b> be compatible with the layout used to create the {@code descriptorUpdateTemplate} handle."),
        uint32_t("set", "the set number of the descriptor set in the pipeline layout that will be updated. This <b>must</b> be the same number used to create the {@code descriptorUpdateTemplate} handle."),
        nullable..opaque_const_p("pData", "a pointer to memory containing descriptors for the templated update.")
    )
}