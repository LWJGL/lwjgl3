/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_discard_rectangles = "EXTDiscardRectangles".nativeClassVK("EXT_discard_rectangles", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DISCARD_RECTANGLES_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_DISCARD_RECTANGLES_EXTENSION_NAME".."VK_EXT_discard_rectangles"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT".."1000099000",
        "STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT".."1000099001"
    )

    EnumConstant(
        "DYNAMIC_STATE_DISCARD_RECTANGLE_EXT".."1000099000",
        "DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT".."1000099001",
        "DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT".."1000099002"
    )

    EnumConstant(
        "DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT".."0",
        "DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT".."1"
    )

    void(
        "CmdSetDiscardRectangleEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstDiscardRectangle"),
        AutoSize("pDiscardRectangles")..uint32_t("discardRectangleCount"),
        VkRect2D.const.p("pDiscardRectangles")
    )

    void(
        "CmdSetDiscardRectangleEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("discardRectangleEnable")
    )

    void(
        "CmdSetDiscardRectangleModeEXT",

        VkCommandBuffer("commandBuffer"),
        VkDiscardRectangleModeEXT("discardRectangleMode")
    )
}