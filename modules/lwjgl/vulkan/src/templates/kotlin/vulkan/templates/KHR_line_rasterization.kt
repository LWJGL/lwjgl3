/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_line_rasterization = "KHRLineRasterization".nativeClassVK("KHR_line_rasterization", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_LINE_RASTERIZATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_LINE_RASTERIZATION_EXTENSION_NAME".."VK_KHR_line_rasterization"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR".."1000259000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR".."1000259001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_KHR".."1000259002"
    )

    EnumConstant(
        "DYNAMIC_STATE_LINE_STIPPLE_KHR".."1000259000"
    )

    EnumConstant(
        "LINE_RASTERIZATION_MODE_DEFAULT_KHR".."0",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_KHR".."1",
        "LINE_RASTERIZATION_MODE_BRESENHAM_KHR".."2",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR".."3"
    )

    void(
        "CmdSetLineStippleKHR",

        VkCommandBuffer("commandBuffer"),
        uint32_t("lineStippleFactor"),
        uint16_t("lineStipplePattern")
    )
}