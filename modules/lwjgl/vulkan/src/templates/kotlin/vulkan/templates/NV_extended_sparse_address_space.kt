/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_extended_sparse_address_space = "NVExtendedSparseAddressSpace".nativeClassVK("NV_extended_sparse_address_space", type = "device", postfix = "NV") {
    documentation =
        """
        Implementations may be able to support an extended address space for sparse memory resources, but only for a certain set of usages.

        This extension adds a query for the extended limit, and the supported usages that are allowed for that limit. This limit is an increase to ##VkPhysicalDeviceLimits{@code ::sparseAddressSpaceSize} when the {@code VkImage} or {@code VkBuffer} uses only usages that are supported.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_extended_sparse_address_space}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>493</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Russell Chou <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_extended_sparse_address_space]%20@russellcnv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_extended_sparse_address_space%20extension*">russellcnv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-10-03</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Russell Chou, NVIDIA</li>
                <li>Christoph Kubisch, NVIDIA</li>
                <li>Eric Werness, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_EXTENDED_SPARSE_ADDRESS_SPACE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_EXTENDED_SPARSE_ADDRESS_SPACE_EXTENSION_NAME".."VK_NV_extended_sparse_address_space"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV".."1000492000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV".."1000492001"
    )
}