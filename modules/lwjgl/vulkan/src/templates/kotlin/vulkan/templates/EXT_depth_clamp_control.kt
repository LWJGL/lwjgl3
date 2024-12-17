/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_depth_clamp_control = "EXTDepthClampControl".nativeClassVK("EXT_depth_clamp_control", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DEPTH_CLAMP_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DEPTH_CLAMP_CONTROL_EXTENSION_NAME".."VK_EXT_depth_clamp_control"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT".."1000582000",
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT".."1000582001"
    )

    EnumConstant(
        "DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT".."1000582000"
    )

    void(
        "CmdSetDepthClampRangeEXT",

        VkCommandBuffer("commandBuffer"),
        VkDepthClampModeEXT("depthClampMode"),
        nullable..VkDepthClampRangeEXT.const.p("pDepthClampRange")
    )
}