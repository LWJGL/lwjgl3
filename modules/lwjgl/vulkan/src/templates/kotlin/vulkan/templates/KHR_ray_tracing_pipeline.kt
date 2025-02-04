/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_ray_tracing_pipeline = "KHRRayTracingPipeline".nativeClassVK("KHR_ray_tracing_pipeline", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_RAY_TRACING_PIPELINE_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_RAY_TRACING_PIPELINE_EXTENSION_NAME".."VK_KHR_ray_tracing_pipeline"
    )

    EnumConstant(
        "SHADER_UNUSED_KHR".."(~0)"
    )

    EnumConstant(
        "STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR".."1000150015",
        "STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR".."1000150016",
        "STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR".."1000150018",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR".."1000347000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR".."1000347001"
    )

    EnumConstant(
        "SHADER_STAGE_RAYGEN_BIT_KHR".enum(0x00000100),
        "SHADER_STAGE_ANY_HIT_BIT_KHR".enum(0x00000200),
        "SHADER_STAGE_CLOSEST_HIT_BIT_KHR".enum(0x00000400),
        "SHADER_STAGE_MISS_BIT_KHR".enum(0x00000800),
        "SHADER_STAGE_INTERSECTION_BIT_KHR".enum(0x00001000),
        "SHADER_STAGE_CALLABLE_BIT_KHR".enum(0x00002000)
    )

    EnumConstant(
        "PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR".enum(0x00200000)
    )

    EnumConstant(
        "BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR".enum(0x00000400)
    )

    EnumConstant(
        "PIPELINE_BIND_POINT_RAY_TRACING_KHR".."1000165000"
    )

    EnumConstant(
        "PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR".enum(0x00001000),
        "PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR".enum(0x00002000),
        "PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR".enum(0x00004000),
        "PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR".enum(0x00008000),
        "PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR".enum(0x00010000),
        "PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR".enum(0x00020000),
        "PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR".enum(0x00080000)
    )

    EnumConstant(
        "DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR".."1000347000"
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_RAY_TRACING_SKIP_BUILT_IN_PRIMITIVES_BIT_KHR".enum(0x00001000L)
    )

    EnumConstant(
        "RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR".."0",
        "RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR".."1",
        "RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR".."2"
    )

    EnumConstant(
        "SHADER_GROUP_SHADER_GENERAL_KHR".."0",
        "SHADER_GROUP_SHADER_CLOSEST_HIT_KHR".."1",
        "SHADER_GROUP_SHADER_ANY_HIT_KHR".."2",
        "SHADER_GROUP_SHADER_INTERSECTION_KHR".."3"
    )

    void(
        "CmdTraceRaysKHR",

        VkCommandBuffer("commandBuffer"),
        VkStridedDeviceAddressRegionKHR.const.p("pRaygenShaderBindingTable"),
        VkStridedDeviceAddressRegionKHR.const.p("pMissShaderBindingTable"),
        VkStridedDeviceAddressRegionKHR.const.p("pHitShaderBindingTable"),
        VkStridedDeviceAddressRegionKHR.const.p("pCallableShaderBindingTable"),
        uint32_t("width"),
        uint32_t("height"),
        uint32_t("depth")
    )

    VkResult(
        "CreateRayTracingPipelinesKHR",

        VkDevice("device"),
        VkDeferredOperationKHR("deferredOperation"),
        VkPipelineCache("pipelineCache"),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t("createInfoCount"),
        VkRayTracingPipelineCreateInfoKHR.const.p("pCreateInfos"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        VkPipeline.p("pPipelines")
    )

    VkResult(
        "GetRayTracingShaderGroupHandlesKHR",

        VkDevice("device"),
        VkPipeline("pipeline"),
        uint32_t("firstGroup"),
        uint32_t("groupCount"),
        AutoSize("pData")..size_t("dataSize"),
        void.p("pData")
    )

    VkResult(
        "GetRayTracingCaptureReplayShaderGroupHandlesKHR",

        VkDevice("device"),
        VkPipeline("pipeline"),
        uint32_t("firstGroup"),
        uint32_t("groupCount"),
        AutoSize("pData")..size_t("dataSize"),
        void.p("pData")
    )

    void(
        "CmdTraceRaysIndirectKHR",

        VkCommandBuffer("commandBuffer"),
        VkStridedDeviceAddressRegionKHR.const.p("pRaygenShaderBindingTable"),
        VkStridedDeviceAddressRegionKHR.const.p("pMissShaderBindingTable"),
        VkStridedDeviceAddressRegionKHR.const.p("pHitShaderBindingTable"),
        VkStridedDeviceAddressRegionKHR.const.p("pCallableShaderBindingTable"),
        VkDeviceAddress("indirectDeviceAddress")
    )

    VkDeviceSize(
        "GetRayTracingShaderGroupStackSizeKHR",

        VkDevice("device"),
        VkPipeline("pipeline"),
        uint32_t("group"),
        VkShaderGroupShaderKHR("groupShader")
    )

    void(
        "CmdSetRayTracingPipelineStackSizeKHR",

        VkCommandBuffer("commandBuffer"),
        uint32_t("pipelineStackSize")
    )
}