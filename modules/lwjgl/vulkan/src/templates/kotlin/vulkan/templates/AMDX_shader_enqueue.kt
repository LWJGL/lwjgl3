/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMDX_shader_enqueue = "AMDXShaderEnqueue".nativeClassVK("AMDX_shader_enqueue", type = "device", postfix = "AMDX") {
    IntConstant(
        "AMDX_SHADER_ENQUEUE_SPEC_VERSION".."2"
    )

    StringConstant(
        "AMDX_SHADER_ENQUEUE_EXTENSION_NAME".."VK_AMDX_shader_enqueue"
    )

    EnumConstant(
        "SHADER_INDEX_UNUSED_AMDX".."(~0)"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX".."1000134000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX".."1000134001",
        "STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX".."1000134002",
        "STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX".."1000134003",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX".."1000134004"
    )

    EnumConstant(
        "BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX".enum(0x02000000)
    )

    EnumConstant(
        "PIPELINE_BIND_POINT_EXECUTION_GRAPH_AMDX".."1000134000"
    )

    EnumConstantLong(
        "BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX".enum(0x02000000L)
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_EXECUTION_GRAPH_BIT_AMDX".enum(0x100000000L)
    )

    VkResult(
        "CreateExecutionGraphPipelinesAMDX",

        VkDevice("device"),
        VkPipelineCache("pipelineCache"),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t("createInfoCount"),
        VkExecutionGraphPipelineCreateInfoAMDX.const.p("pCreateInfos"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        VkPipeline.p("pPipelines")
    )

    VkResult(
        "GetExecutionGraphPipelineScratchSizeAMDX",

        VkDevice("device"),
        VkPipeline("executionGraph"),
        VkExecutionGraphPipelineScratchSizeAMDX.p("pSizeInfo")
    )

    VkResult(
        "GetExecutionGraphPipelineNodeIndexAMDX",

        VkDevice("device"),
        VkPipeline("executionGraph"),
        VkPipelineShaderStageNodeCreateInfoAMDX.const.p("pNodeInfo"),
        Check(1)..uint32_t.p("pNodeIndex")
    )

    void(
        "CmdInitializeGraphScratchMemoryAMDX",

        VkCommandBuffer("commandBuffer"),
        VkPipeline("executionGraph"),
        VkDeviceAddress("scratch"),
        VkDeviceSize("scratchSize")
    )

    void(
        "CmdDispatchGraphAMDX",

        VkCommandBuffer("commandBuffer"),
        VkDeviceAddress("scratch"),
        VkDeviceSize("scratchSize"),
        VkDispatchGraphCountInfoAMDX.const.p("pCountInfo")
    )

    void(
        "CmdDispatchGraphIndirectAMDX",

        VkCommandBuffer("commandBuffer"),
        VkDeviceAddress("scratch"),
        VkDeviceSize("scratchSize"),
        VkDispatchGraphCountInfoAMDX.const.p("pCountInfo")
    )

    void(
        "CmdDispatchGraphIndirectCountAMDX",

        VkCommandBuffer("commandBuffer"),
        VkDeviceAddress("scratch"),
        VkDeviceSize("scratchSize"),
        VkDeviceAddress("countInfo")
    )
}