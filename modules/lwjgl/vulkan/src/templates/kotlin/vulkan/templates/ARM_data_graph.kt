/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_data_graph = "ARMDataGraph".nativeClassVK("ARM_data_graph", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_DATA_GRAPH_SPEC_VERSION".."1"
    )

    StringConstant(
        "ARM_DATA_GRAPH_EXTENSION_NAME".."VK_ARM_data_graph"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM".."1000507000",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM".."1000507001",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM".."1000507002",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM".."1000507003",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM".."1000507004",
        "STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM".."1000507005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM".."1000507006",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM".."1000507007",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM".."1000507008",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM".."1000507009",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM".."1000507010",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM".."1000507011",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENT_ARM".."1000507012",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM".."1000507013",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM".."1000507014",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_TENSOR_SEMI_STRUCTURED_SPARSITY_INFO_ARM".."1000507015",
        "STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM".."1000507016",
        "STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM".."1000507017",
        "STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM".."1000507018",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM".."1000507019"
    )

    EnumConstant(
        "OBJECT_TYPE_DATA_GRAPH_PIPELINE_SESSION_ARM".."1000507000"
    )

    EnumConstant(
        "PIPELINE_BIND_POINT_DATA_GRAPH_ARM".."1000507000"
    )

    EnumConstant(
        "QUEUE_DATA_GRAPH_BIT_ARM".enum(0x00000400)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_DATA_GRAPH_BIT_ARM".enum(0x40000000000L)
    )

    EnumConstantLong(
        "ACCESS_2_DATA_GRAPH_READ_BIT_ARM".enum(0x800000000000L),
        "ACCESS_2_DATA_GRAPH_WRITE_BIT_ARM".enum(0x1000000000000L)
    )

    EnumConstantLong(
        "TENSOR_USAGE_DATA_GRAPH_BIT_ARM".enum(0x00000020L)
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_TENSOR_DATA_GRAPH_BIT_ARM".enum(0x1000000000000L)
    )

    EnumConstantLong(
        "BUFFER_USAGE_2_DATA_GRAPH_FOREIGN_DESCRIPTOR_BIT_ARM".enum(0x20000000L)
    )

    EnumConstant(
        "MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM".."128"
    )

    EnumConstant(
        "DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_TRANSIENT_ARM".."0"
    )

    EnumConstant(
        "DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_TYPE_MEMORY_ARM".."0"
    )

    EnumConstantLong(
        "DATA_GRAPH_PIPELINE_SESSION_CREATE_PROTECTED_BIT_ARM".enum(0x00000001L)
    )

    EnumConstant(
        "DATA_GRAPH_PIPELINE_PROPERTY_CREATION_LOG_ARM".."0",
        "DATA_GRAPH_PIPELINE_PROPERTY_IDENTIFIER_ARM".."1"
    )

    EnumConstant(
        "PHYSICAL_DEVICE_DATA_GRAPH_PROCESSING_ENGINE_TYPE_DEFAULT_ARM".."0"
    )

    EnumConstant(
        "PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_TYPE_SPIRV_EXTENDED_INSTRUCTION_SET_ARM".."0"
    )

    VkResult(
        "CreateDataGraphPipelinesARM",

        VkDevice("device"),
        VkDeferredOperationKHR("deferredOperation"),
        VkPipelineCache("pipelineCache"),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t("createInfoCount"),
        VkDataGraphPipelineCreateInfoARM.const.p("pCreateInfos"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        VkPipeline.p("pPipelines")
    )

    VkResult(
        "CreateDataGraphPipelineSessionARM",

        VkDevice("device"),
        VkDataGraphPipelineSessionCreateInfoARM.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDataGraphPipelineSessionARM.p("pSession")
    )

    VkResult(
        "GetDataGraphPipelineSessionBindPointRequirementsARM",

        VkDevice("device"),
        VkDataGraphPipelineSessionBindPointRequirementsInfoARM.const.p("pInfo"),
        AutoSize("pBindPointRequirements")..Check(1)..uint32_t.p("pBindPointRequirementCount"),
        nullable..VkDataGraphPipelineSessionBindPointRequirementARM.p("pBindPointRequirements")
    )

    void(
        "GetDataGraphPipelineSessionMemoryRequirementsARM",

        VkDevice("device"),
        VkDataGraphPipelineSessionMemoryRequirementsInfoARM.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    VkResult(
        "BindDataGraphPipelineSessionMemoryARM",

        VkDevice("device"),
        AutoSize("pBindInfos")..uint32_t("bindInfoCount"),
        VkBindDataGraphPipelineSessionMemoryInfoARM.const.p("pBindInfos")
    )

    void(
        "DestroyDataGraphPipelineSessionARM",

        VkDevice("device"),
        VkDataGraphPipelineSessionARM("session"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "CmdDispatchDataGraphARM",

        VkCommandBuffer("commandBuffer"),
        VkDataGraphPipelineSessionARM("session"),
        nullable..VkDataGraphPipelineDispatchInfoARM.const.p("pInfo")
    )

    VkResult(
        "GetDataGraphPipelineAvailablePropertiesARM",

        VkDevice("device"),
        VkDataGraphPipelineInfoARM.const.p("pPipelineInfo"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertiesCount"),
        nullable..VkDataGraphPipelinePropertyARM.p("pProperties")
    )

    VkResult(
        "GetDataGraphPipelinePropertiesARM",

        VkDevice("device"),
        VkDataGraphPipelineInfoARM.const.p("pPipelineInfo"),
        AutoSize("pProperties")..uint32_t("propertiesCount"),
        VkDataGraphPipelinePropertyQueryResultARM.p("pProperties")
    )

    VkResult(
        "GetPhysicalDeviceQueueFamilyDataGraphPropertiesARM",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex"),
        AutoSize("pQueueFamilyDataGraphProperties")..Check(1)..uint32_t.p("pQueueFamilyDataGraphPropertyCount"),
        nullable..VkQueueFamilyDataGraphPropertiesARM.p("pQueueFamilyDataGraphProperties")
    )

    void(
        "GetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.const.p("pQueueFamilyDataGraphProcessingEngineInfo"),
        VkQueueFamilyDataGraphProcessingEnginePropertiesARM.p("pQueueFamilyDataGraphProcessingEngineProperties")
    )
}