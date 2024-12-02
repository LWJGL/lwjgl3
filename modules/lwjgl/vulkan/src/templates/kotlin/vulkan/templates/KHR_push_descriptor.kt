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

        <h5>Promotion to Vulkan 1.4</h5>
        Functionality in this extension is included in core Vulkan 1.4 with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

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
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_VERSION_1_1</li>
                <li>Interacts with VK_KHR_descriptor_update_template</li>
            </ul></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to Vulkan 1.4</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_push_descriptor]%20@jeffbolznv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_push_descriptor%20extension*">jeffbolznv</a></li>
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
        "See #CmdPushDescriptorSet().",

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkPipelineBindPoint("pipelineBindPoint", "a {@code VkPipelineBindPoint} indicating the type of the pipeline that will use the descriptors. There is a separate set of push descriptor bindings for each pipeline type, so binding one does not disturb the others."),
        VkPipelineLayout("layout", "a {@code VkPipelineLayout} object used to program the bindings."),
        uint32_t("set", "the set number of the descriptor set in the pipeline layout that will be updated."),
        AutoSize("pDescriptorWrites")..uint32_t("descriptorWriteCount", "the number of elements in the {@code pDescriptorWrites} array."),
        VkWriteDescriptorSet.const.p("pDescriptorWrites", "a pointer to an array of ##VkWriteDescriptorSet structures describing the descriptors to be updated.")
    )

    DependsOn("""ext.contains("Vulkan11") || ext.contains("VK_KHR_descriptor_update_template")""")..void(
        "CmdPushDescriptorSetWithTemplateKHR",
        "See #CmdPushDescriptorSetWithTemplate().",

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate", "a descriptor update template defining how to interpret the descriptor information in {@code pData}."),
        VkPipelineLayout("layout", "a {@code VkPipelineLayout} object used to program the bindings. It <b>must</b> be compatible with the layout used to create the {@code descriptorUpdateTemplate} handle."),
        uint32_t("set", "the set number of the descriptor set in the pipeline layout that will be updated. This <b>must</b> be the same number used to create the {@code descriptorUpdateTemplate} handle."),
        nullable..opaque_const_p("pData", "a pointer to memory containing descriptors for the templated update.")
    )
}