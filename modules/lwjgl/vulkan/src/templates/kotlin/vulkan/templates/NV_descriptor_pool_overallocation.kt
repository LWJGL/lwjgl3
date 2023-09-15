/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_descriptor_pool_overallocation = "NVDescriptorPoolOverallocation".nativeClassVK("NV_descriptor_pool_overallocation", type = "device", postfix = "NV") {
    documentation =
        """
        There are scenarios where the application does not know ahead of time how many descriptor sets it may need to allocate from a descriptor pool, or how many descriptors of any of the descriptor types it may need to allocate from the descriptor pool.

        This extension gives applications the ability to request the implementation allow more sets or descriptors to be allocated than initially specified at descriptor pool creation time, subject to available resources.

        The #DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_SETS_BIT_NV flag lets the application allocate more than ##VkDescriptorPoolCreateInfo{@code ::maxSets} descriptor sets, and the #DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_POOLS_BIT_NV lets the application allocate more descriptors than initially specified by ##VkDescriptorPoolSize{@code ::descriptorCount} for any descriptor types.

        <h5>VK_NV_descriptor_pool_overallocation</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_descriptor_pool_overallocation}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>547</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_descriptor_pool_overallocation]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_descriptor_pool_overallocation%20extension*">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-08-30</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_DESCRIPTOR_POOL_OVERALLOCATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_DESCRIPTOR_POOL_OVERALLOCATION_EXTENSION_NAME".."VK_NV_descriptor_pool_overallocation"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV".."1000546000"
    )

    EnumConstant(
        "Extends {@code VkDescriptorPoolCreateFlagBits}.",

        "DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_SETS_BIT_NV".enum(0x00000008),
        "DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_POOLS_BIT_NV".enum(0x00000010)
    )
}