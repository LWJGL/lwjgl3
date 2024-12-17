/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val HUAWEI_cluster_culling_shader = "HUAWEIClusterCullingShader".nativeClassVK("HUAWEI_cluster_culling_shader", type = "device", postfix = "HUAWEI") {
    IntConstant(
        "HUAWEI_CLUSTER_CULLING_SHADER_SPEC_VERSION".."3"
    )

    StringConstant(
        "HUAWEI_CLUSTER_CULLING_SHADER_EXTENSION_NAME".."VK_HUAWEI_cluster_culling_shader"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI".."1000404000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI".."1000404001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI".."1000404002"
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_CLUSTER_CULLING_SHADER_BIT_HUAWEI".enum(0x20000000000L)
    )

    EnumConstant(
        "SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI".enum(0x00080000)
    )

    EnumConstant(
        "QUERY_PIPELINE_STATISTIC_CLUSTER_CULLING_SHADER_INVOCATIONS_BIT_HUAWEI".enum(0x00002000)
    )

    void(
        "CmdDrawClusterHUAWEI",

        VkCommandBuffer("commandBuffer"),
        uint32_t("groupCountX"),
        uint32_t("groupCountY"),
        uint32_t("groupCountZ")
    )

    void(
        "CmdDrawClusterIndirectHUAWEI",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset")
    )
}