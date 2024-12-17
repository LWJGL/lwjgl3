/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_depth_bias_control = "EXTDepthBiasControl".nativeClassVK("EXT_depth_bias_control", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DEPTH_BIAS_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DEPTH_BIAS_CONTROL_EXTENSION_NAME".."VK_EXT_depth_bias_control"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT".."1000283000",
        "STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT".."1000283001",
        "STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT".."1000283002"
    )

    EnumConstant(
        "DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT".."0",
        "DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT".."1",
        "DEPTH_BIAS_REPRESENTATION_FLOAT_EXT".."2"
    )

    void(
        "CmdSetDepthBias2EXT",

        VkCommandBuffer("commandBuffer"),
        VkDepthBiasInfoEXT.const.p("pDepthBiasInfo")
    )
}