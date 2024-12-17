/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_fragment_shading_rate_enums = "NVFragmentShadingRateEnums".nativeClassVK("NV_fragment_shading_rate_enums", type = "device", postfix = "NV") {
    IntConstant(
        "NV_FRAGMENT_SHADING_RATE_ENUMS_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_FRAGMENT_SHADING_RATE_ENUMS_EXTENSION_NAME".."VK_NV_fragment_shading_rate_enums"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV".."1000326000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV".."1000326001",
        "STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV".."1000326002"
    )

    EnumConstant(
        "FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV".."0",
        "FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV".."1"
    )

    EnumConstant(
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV".."0",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV".."1",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV".."4",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV".."5",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV".."6",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV".."9",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV".."10",
        "FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV".."11",
        "FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV".."12",
        "FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV".."13",
        "FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV".."14",
        "FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV".."15"
    )

    void(
        "CmdSetFragmentShadingRateEnumNV",

        VkCommandBuffer("commandBuffer"),
        VkFragmentShadingRateNV("shadingRate"),
        Check(2)..VkFragmentShadingRateCombinerOpKHR.const.p("combinerOps")
    )
}