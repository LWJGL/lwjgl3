/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val HUAWEI_subpass_shading = "HUAWEISubpassShading".nativeClassVK("HUAWEI_subpass_shading", type = "device", postfix = "HUAWEI") {
    IntConstant(
        "HUAWEI_SUBPASS_SHADING_SPEC_VERSION".."3"
    )

    StringConstant(
        "HUAWEI_SUBPASS_SHADING_EXTENSION_NAME".."VK_HUAWEI_subpass_shading"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI".."1000369000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI".."1000369001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI".."1000369002"
    )

    EnumConstant(
        "PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI".."1000369003"
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_SUBPASS_SHADER_BIT_HUAWEI".enum(0x8000000000L),
        "PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI".enum(0x8000000000L)
    )

    EnumConstant(
        "SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI".enum(0x00004000)
    )

    VkResult(
        "GetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI",

        VkDevice("device"),
        VkRenderPass("renderpass"),
        VkExtent2D.p("pMaxWorkgroupSize")
    )

    void(
        "CmdSubpassShadingHUAWEI",

        VkCommandBuffer("commandBuffer")
    )
}