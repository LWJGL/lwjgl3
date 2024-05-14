/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_per_stage_descriptor_set = "NVPerStageDescriptorSet".nativeClassVK("NV_per_stage_descriptor_set", type = "device", postfix = "NV") {
    documentation =
        """
        This extension introduces a new descriptor set layout creation flag that allows bindings in a descriptor set to be scoped to each shader stage. This means that shaders bound at the same time <b>may</b> use completely different descriptor set layouts without any restrictions on compatibility, and that the descriptor limits that would otherwise apply to the union of all stages together instead apply to each stage individually. It also means that descriptors shared by multiple stages <b>must</b> be bound to each stage or set of stages that use a unique descriptor set layout using their specific per stage descriptor set layout(s).

        This extension also allows each of the new descriptor binding functions from VK_KHR_maintenance6 to have their {@code VkPipelineLayout} member be optionally set to #NULL_HANDLE, in which case the pipeline layout information is taken from a ##VkPipelineLayoutCreateInfo structure in the {@code pNext} chain. This enables descriptors to be directly bound using descriptor set layouts without applications needing to create and manage {@code VkPipelineLayout} objects at command recording time.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_per_stage_descriptor_set}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>517</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRMaintenance6 VK_KHR_maintenance6}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_per_stage_descriptor_set]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_per_stage_descriptor_set%20extension*">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-10-16</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Story, Nintendo</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_PER_STAGE_DESCRIPTOR_SET_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_PER_STAGE_DESCRIPTOR_SET_EXTENSION_NAME".."VK_NV_per_stage_descriptor_set"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV".."1000516000"
    )

    EnumConstant(
        "Extends {@code VkDescriptorSetLayoutCreateFlagBits}.",

        "DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_BIT_NV".enum(0x00000040)
    )
}