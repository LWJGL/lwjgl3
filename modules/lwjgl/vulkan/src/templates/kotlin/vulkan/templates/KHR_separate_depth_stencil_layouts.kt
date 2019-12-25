/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_separate_depth_stencil_layouts = "KHRSeparateDepthStencilLayouts".nativeClassVK("KHR_separate_depth_stencil_layouts", type = "device", postfix = KHR) {
    documentation =
        """
        This extension allows image memory barriers for depth/stencil images to have just one of the #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT aspect bits set, rather than require both. This allows their layouts to be set independently. To support depth/stencil images with different layouts for the depth and stencil aspects, the depth/stencil attachment interface has been updated to support a separate layout for stencil.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_separate_depth_stencil_layouts}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>242</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
                <li>Requires {@link KHRCreateRenderpass2 VK_KHR_create_renderpass2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_separate_depth_stencil_layouts:%20&amp;body=@pdaniell-nv%20">pdaniell-nv</a></li>
            </ul></dd>

            <dt><b>Last Modified Data</b></dt>
            <dd>2019-06-25</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Koch, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Jesse Barker, Unity</li>
                <li>Tobias Hector, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SEPARATE_DEPTH_STENCIL_LAYOUTS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SEPARATE_DEPTH_STENCIL_LAYOUTS_EXTENSION_NAME".."VK_KHR_separate_depth_stencil_layouts"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES_KHR".."1000241000",
        "STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT_KHR".."1000241001",
        "STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT_KHR".."1000241002"
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL_KHR".."1000241000",
        "IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR".."1000241001",
        "IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL_KHR".."1000241002",
        "IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL_KHR".."1000241003"
    )
}