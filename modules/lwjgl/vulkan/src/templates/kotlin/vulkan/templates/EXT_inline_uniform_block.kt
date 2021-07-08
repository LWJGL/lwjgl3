/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_inline_uniform_block = "EXTInlineUniformBlock".nativeClassVK("EXT_inline_uniform_block", type = "device", postfix = EXT) {
    documentation =
        """
        This extension introduces the ability to back uniform blocks directly with descriptor sets by storing inline uniform data within descriptor pool storage. Compared to push constants this new construct allows uniform data to be reused across multiple disjoint sets of draw or dispatch commands and <b>may</b> enable uniform data to be accessed with less indirections compared to uniforms backed by buffer memory.

        <h5>VK_EXT_inline_uniform_block</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_inline_uniform_block}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>139</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
                <li>Requires {@link KHRMaintenance1 VK_KHR_maintenance1}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_inline_uniform_block:%20&amp;body=@aqnuep%20">aqnuep</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-08-01</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Rakos, AMD</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Slawomir Grajewski, Intel</li>
                <li>Neil Henning, Codeplay</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_INLINE_UNIFORM_BLOCK_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_INLINE_UNIFORM_BLOCK_EXTENSION_NAME".."VK_EXT_inline_uniform_block"
    )

    EnumConstant(
        "Extends {@code VkDescriptorType}.",

        "DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT".."1000138000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES_EXT".."1000138000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES_EXT".."1000138001",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK_EXT".."1000138002",
        "STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO_EXT".."1000138003"
    )
}