/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_swapchain_colorspace = "EXTSwapchainColorspace".nativeClassVK("EXT_swapchain_colorspace", type = "instance", postfix = EXT) {
    documentation =
        """
        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_EXT_swapchain_colorspace</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>105</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-03-15</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>This extension requires VK_KHR_surface</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Courtney Goeltzenleuchter, Google</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Courtney Goeltzenleuchter, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME".."VK_EXT_swapchain_colorspace"
    )

    EnumConstant(
        "Extends {@code VkColorSpaceKHR}.",

        "COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT".."1000104001",
        "COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT".."1000104002",
        "COLOR_SPACE_DCI_P3_LINEAR_EXT".."1000104003",
        "COLOR_SPACE_DCI_P3_NONLINEAR_EXT".."1000104004",
        "COLOR_SPACE_BT709_LINEAR_EXT".."1000104005",
        "COLOR_SPACE_BT709_NONLINEAR_EXT".."1000104006",
        "COLOR_SPACE_BT2020_LINEAR_EXT".."1000104007",
        "COLOR_SPACE_HDR10_ST2084_EXT".."1000104008",
        "COLOR_SPACE_DOLBYVISION_EXT".."1000104009",
        "COLOR_SPACE_HDR10_HLG_EXT".."1000104010",
        "COLOR_SPACE_ADOBERGB_LINEAR_EXT".."1000104011",
        "COLOR_SPACE_ADOBERGB_NONLINEAR_EXT".."1000104012",
        "COLOR_SPACE_PASS_THROUGH_EXT".."1000104013"
    )
}