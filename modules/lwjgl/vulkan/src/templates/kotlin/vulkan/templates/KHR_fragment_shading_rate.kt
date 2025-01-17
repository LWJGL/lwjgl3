/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_fragment_shading_rate = "KHRFragmentShadingRate".nativeClassVK("KHR_fragment_shading_rate", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_FRAGMENT_SHADING_RATE_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_FRAGMENT_SHADING_RATE_EXTENSION_NAME".."VK_KHR_fragment_shading_rate"
    )

    EnumConstant(
        "IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR".."1000164003"
    )

    EnumConstant(
        "DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR".."1000226000"
    )

    EnumConstant(
        "STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR".."1000044006",
        "STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR".."1000226000",
        "STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR".."1000226001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR".."1000226002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR".."1000226003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR".."1000226004"
    )

    EnumConstant(
        "ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR".enum(0x00800000)
    )

    EnumConstant(
        "IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00000100)
    )

    EnumConstant(
        "PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00400000)
    )

    EnumConstant(
        "FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x40000000)
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x40000000L)
    )

    EnumConstant(
        "PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00200000),
        "PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00200000)
    )

    EnumConstant(
        "FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR".."0",
        "FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR".."1",
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR".."2",
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR".."3",
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR".."4"
    )

    VkResult(
        "GetPhysicalDeviceFragmentShadingRatesKHR",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pFragmentShadingRates")..Check(1)..uint32_t.p("pFragmentShadingRateCount"),
        nullable..VkPhysicalDeviceFragmentShadingRateKHR.p("pFragmentShadingRates")
    )

    void(
        "CmdSetFragmentShadingRateKHR",

        VkCommandBuffer("commandBuffer"),
        VkExtent2D.const.p("pFragmentSize"),
        Check(2)..VkFragmentShadingRateCombinerOpKHR.const.p("combinerOps")
    )
}