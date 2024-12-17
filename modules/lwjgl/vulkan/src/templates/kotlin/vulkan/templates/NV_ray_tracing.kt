/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_ray_tracing = "NVRayTracing".nativeClassVK("NV_ray_tracing", type = "device", postfix = "NV") {
    IntConstant(
        "NV_RAY_TRACING_SPEC_VERSION".."3"
    )

    StringConstant(
        "NV_RAY_TRACING_EXTENSION_NAME".."VK_NV_ray_tracing"
    )

    EnumConstant(
        "SHADER_UNUSED_NV".."(~0)"
    )

    EnumConstant(
        "STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV".."1000165000",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV".."1000165001",
        "STRUCTURE_TYPE_GEOMETRY_NV".."1000165003",
        "STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV".."1000165004",
        "STRUCTURE_TYPE_GEOMETRY_AABB_NV".."1000165005",
        "STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV".."1000165006",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV".."1000165007",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV".."1000165008",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV".."1000165009",
        "STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV".."1000165011",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV".."1000165012"
    )

    EnumConstant(
        "SHADER_STAGE_RAYGEN_BIT_NV".enum(0x00000100),
        "SHADER_STAGE_ANY_HIT_BIT_NV".enum(0x00000200),
        "SHADER_STAGE_CLOSEST_HIT_BIT_NV".enum(0x00000400),
        "SHADER_STAGE_MISS_BIT_NV".enum(0x00000800),
        "SHADER_STAGE_INTERSECTION_BIT_NV".enum(0x00001000),
        "SHADER_STAGE_CALLABLE_BIT_NV".enum(0x00002000)
    )

    EnumConstant(
        "PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV".enum(0x00200000),
        "PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV".enum(0x02000000)
    )

    EnumConstant(
        "BUFFER_USAGE_RAY_TRACING_BIT_NV".enum(0x00000400)
    )

    EnumConstant(
        "PIPELINE_BIND_POINT_RAY_TRACING_NV".."1000165000"
    )

    EnumConstant(
        "DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV".."1000165000"
    )

    EnumConstant(
        "ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV".enum(0x00200000),
        "ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV".enum(0x00400000)
    )

    EnumConstant(
        "QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV".."1000165000"
    )

    EnumConstant(
        "PIPELINE_CREATE_DEFER_COMPILE_BIT_NV".enum(0x00000020)
    )

    EnumConstant(
        "OBJECT_TYPE_ACCELERATION_STRUCTURE_NV".."1000165000"
    )

    EnumConstant(
        "INDEX_TYPE_NONE_NV".."1000165000"
    )

    EnumConstant(
        "RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV".."0",
        "RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV".."1",
        "RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV".."2"
    )

    EnumConstant(
        "GEOMETRY_TYPE_TRIANGLES_NV".."0",
        "GEOMETRY_TYPE_AABBS_NV".."1"
    )

    EnumConstant(
        "ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV".."0",
        "ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV".."1"
    )

    EnumConstant(
        "GEOMETRY_OPAQUE_BIT_NV".enum(0x00000001),
        "GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV".enum(0x00000002)
    )

    EnumConstant(
        "GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV".enum(0x00000001),
        "GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV".enum(0x00000002),
        "GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV".enum(0x00000004),
        "GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV".enum(0x00000008)
    )

    EnumConstant(
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV".enum(0x00000001),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV".enum(0x00000002),
        "BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV".enum(0x00000004),
        "BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV".enum(0x00000008),
        "BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV".enum(0x00000010)
    )

    EnumConstant(
        "COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV".."0",
        "COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV".."1"
    )

    EnumConstant(
        "DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT".."1000165000"
    )

    EnumConstant(
        "ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV".."0",
        "ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV".."1",
        "ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV".."2"
    )

    VkResult(
        "CreateAccelerationStructureNV",

        VkDevice("device"),
        VkAccelerationStructureCreateInfoNV.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkAccelerationStructureNV.p("pAccelerationStructure")
    )

    void(
        "DestroyAccelerationStructureNV",

        VkDevice("device"),
        VkAccelerationStructureNV("accelerationStructure"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "GetAccelerationStructureMemoryRequirementsNV",

        VkDevice("device"),
        VkAccelerationStructureMemoryRequirementsInfoNV.const.p("pInfo"),
        VkMemoryRequirements2KHR.p("pMemoryRequirements")
    )

    VkResult(
        "BindAccelerationStructureMemoryNV",

        VkDevice("device"),
        AutoSize("pBindInfos")..uint32_t("bindInfoCount"),
        VkBindAccelerationStructureMemoryInfoNV.const.p("pBindInfos")
    )

    void(
        "CmdBuildAccelerationStructureNV",

        VkCommandBuffer("commandBuffer"),
        VkAccelerationStructureInfoNV.const.p("pInfo"),
        VkBuffer("instanceData"),
        VkDeviceSize("instanceOffset"),
        VkBool32("update"),
        VkAccelerationStructureNV("dst"),
        VkAccelerationStructureNV("src"),
        VkBuffer("scratch"),
        VkDeviceSize("scratchOffset")
    )

    void(
        "CmdCopyAccelerationStructureNV",

        VkCommandBuffer("commandBuffer"),
        VkAccelerationStructureNV("dst"),
        VkAccelerationStructureNV("src"),
        VkCopyAccelerationStructureModeKHR("mode")
    )

    void(
        "CmdTraceRaysNV",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("raygenShaderBindingTableBuffer"),
        VkDeviceSize("raygenShaderBindingOffset"),
        VkBuffer("missShaderBindingTableBuffer"),
        VkDeviceSize("missShaderBindingOffset"),
        VkDeviceSize("missShaderBindingStride"),
        VkBuffer("hitShaderBindingTableBuffer"),
        VkDeviceSize("hitShaderBindingOffset"),
        VkDeviceSize("hitShaderBindingStride"),
        VkBuffer("callableShaderBindingTableBuffer"),
        VkDeviceSize("callableShaderBindingOffset"),
        VkDeviceSize("callableShaderBindingStride"),
        uint32_t("width"),
        uint32_t("height"),
        uint32_t("depth")
    )

    VkResult(
        "CreateRayTracingPipelinesNV",

        VkDevice("device"),
        VkPipelineCache("pipelineCache"),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t("createInfoCount"),
        VkRayTracingPipelineCreateInfoNV.const.p("pCreateInfos"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        VkPipeline.p("pPipelines")
    )

    VkResult(
        "GetRayTracingShaderGroupHandlesNV",

        VkDevice("device"),
        VkPipeline("pipeline"),
        uint32_t("firstGroup"),
        uint32_t("groupCount"),
        AutoSize("pData")..size_t("dataSize"),
        void.p("pData")
    )

    VkResult(
        "GetAccelerationStructureHandleNV",

        VkDevice("device"),
        VkAccelerationStructureNV("accelerationStructure"),
        AutoSize("pData")..size_t("dataSize"),
        void.p("pData")
    )

    void(
        "CmdWriteAccelerationStructuresPropertiesNV",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pAccelerationStructures")..uint32_t("accelerationStructureCount"),
        VkAccelerationStructureNV.const.p("pAccelerationStructures"),
        VkQueryType("queryType"),
        VkQueryPool("queryPool"),
        uint32_t("firstQuery")
    )

    VkResult(
        "CompileDeferredNV",

        VkDevice("device"),
        VkPipeline("pipeline"),
        uint32_t("shader")
    )
}