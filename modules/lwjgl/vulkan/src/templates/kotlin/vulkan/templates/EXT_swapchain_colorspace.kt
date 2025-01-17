/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_swapchain_colorspace = "EXTSwapchainColorspace".nativeClassVK("EXT_swapchain_colorspace", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION".."5"
    )

    StringConstant(
        "EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME".."VK_EXT_swapchain_colorspace"
    )

    EnumConstant(
        "COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT".."1000104001",
        "COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT".."1000104002",
        "COLOR_SPACE_DISPLAY_P3_LINEAR_EXT".."1000104003",
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
        "COLOR_SPACE_PASS_THROUGH_EXT".."1000104013",
        "COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT".."1000104014"
    )
}