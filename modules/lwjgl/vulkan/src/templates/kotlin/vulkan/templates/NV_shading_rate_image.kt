/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_shading_rate_image = "NVShadingRateImage".nativeClassVK("NV_shading_rate_image", type = "device", postfix = "NV") {
    IntConstant(
        "NV_SHADING_RATE_IMAGE_SPEC_VERSION".."3"
    )

    StringConstant(
        "NV_SHADING_RATE_IMAGE_EXTENSION_NAME".."VK_NV_shading_rate_image"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV".."1000164000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV".."1000164001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV".."1000164002",
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV".."1000164005"
    )

    EnumConstant(
        "IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV".."1000164003"
    )

    EnumConstant(
        "DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV".."1000164004",
        "DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV".."1000164006"
    )

    EnumConstant(
        "ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV".enum(0x00800000)
    )

    EnumConstant(
        "IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV".enum(0x00000100)
    )

    EnumConstant(
        "PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV".enum(0x00400000)
    )

    EnumConstant(
        "SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV".."0",
        "SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV".."1",
        "SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV".."2",
        "SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV".."3",
        "SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV".."4",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV".."5",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV".."6",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV".."7",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV".."8",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV".."9",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV".."10",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV".."11"
    )

    EnumConstant(
        "COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV".."0",
        "COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV".."1",
        "COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV".."2",
        "COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV".."3"
    )

    void(
        "CmdBindShadingRateImageNV",

        VkCommandBuffer("commandBuffer"),
        VkImageView("imageView"),
        VkImageLayout("imageLayout")
    )

    void(
        "CmdSetViewportShadingRatePaletteNV",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstViewport"),
        AutoSize("pShadingRatePalettes")..uint32_t("viewportCount"),
        VkShadingRatePaletteNV.const.p("pShadingRatePalettes")
    )

    void(
        "CmdSetCoarseSampleOrderNV",

        VkCommandBuffer("commandBuffer"),
        VkCoarseSampleOrderTypeNV("sampleOrderType"),
        AutoSize("pCustomSampleOrders")..uint32_t("customSampleOrderCount"),
        nullable..VkCoarseSampleOrderCustomNV.const.p("pCustomSampleOrders")
    )
}