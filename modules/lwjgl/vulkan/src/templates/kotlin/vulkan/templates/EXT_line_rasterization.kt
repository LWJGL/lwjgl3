/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_line_rasterization = "EXTLineRasterization".nativeClassVK("EXT_line_rasterization", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_LINE_RASTERIZATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_LINE_RASTERIZATION_EXTENSION_NAME".."VK_EXT_line_rasterization"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT".."1000259000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT".."1000259001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_EXT".."1000259002"
    )

    EnumConstant(
        "DYNAMIC_STATE_LINE_STIPPLE_EXT".."1000259000"
    )

    EnumConstant(
        "LINE_RASTERIZATION_MODE_DEFAULT_EXT".."0",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_EXT".."1",
        "LINE_RASTERIZATION_MODE_BRESENHAM_EXT".."2",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT".."3"
    )

    void(
        "CmdSetLineStippleEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("lineStippleFactor"),
        uint16_t("lineStipplePattern")
    )
}