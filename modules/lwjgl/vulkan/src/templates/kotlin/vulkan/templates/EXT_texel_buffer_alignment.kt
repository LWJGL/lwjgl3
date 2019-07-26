/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_texel_buffer_alignment = "EXTTexelBufferAlignment".nativeClassVK("EXT_texel_buffer_alignment", type = "device", postfix = EXT) {
    documentation =
        """
        This extension adds more expressive alignment requirements for uniform and storage texel buffers. Some implementations have single texel alignment requirements that can't be expressed via ##VkPhysicalDeviceLimits{@code ::minTexelBufferOffsetAlignment}.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_texel_buffer_alignment}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>282</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_texel_buffer_alignment:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2019-06-06</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_TEXEL_BUFFER_ALIGNMENT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_TEXEL_BUFFER_ALIGNMENT_EXTENSION_NAME".."VK_EXT_texel_buffer_alignment"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT".."1000281000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES_EXT".."1000281001"
    )
}