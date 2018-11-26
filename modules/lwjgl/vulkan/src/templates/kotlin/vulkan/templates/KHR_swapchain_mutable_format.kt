/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_swapchain_mutable_format = "KHRSwapchainMutableFormat".nativeClassVK("KHR_swapchain_mutable_format", type = "device", postfix = KHR) {
    documentation =
        """
        <h5>Short Description</h5>
        Allows processing of swapchain images as different formats to that used by the window system, which is particularly useful for switching between sRGB and linear RGB formats.

        <h5>Description</h5>
        This extension adds a new swapchain creation flag that enables creating image views from presentable images with a different format than the one used to create the swapchain.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_swapchain_mutable_format}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>201</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
                <li>Requires {@link KHRMaintenance2 VK_KHR_maintenance2}</li>
                <li>Requires {@link KHRImageFormatList VK_KHR_image_format_list}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_swapchain_mutable_format:%20&amp;body=@drakos-arm%20">drakos-arm</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-03-28</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jason Ekstrand, Intel</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Jesse Hall, Google</li>
                <li>Daniel Rakos, AMD</li>
                <li>Ray Smith, ARM</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SWAPCHAIN_MUTABLE_FORMAT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SWAPCHAIN_MUTABLE_FORMAT_EXTENSION_NAME".."VK_KHR_swapchain_mutable_format"
    )

    EnumConstant(
        "Extends {@code VkSwapchainCreateFlagBitsKHR}.",

        "SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR".enum(0x00000004)
    )
}