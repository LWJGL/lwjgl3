/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val INTEL_performance_query = "INTELPerformanceQuery".nativeClassVK("INTEL_performance_query", type = "device", postfix = "INTEL") {
    IntConstant(
        "INTEL_PERFORMANCE_QUERY_SPEC_VERSION".."2"
    )

    StringConstant(
        "INTEL_PERFORMANCE_QUERY_EXTENSION_NAME".."VK_INTEL_performance_query"
    )

    EnumConstant(
        "STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL".."1000210000",
        "STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL".."1000210000",
        "STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL".."1000210001",
        "STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL".."1000210002",
        "STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL".."1000210003",
        "STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL".."1000210004",
        "STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL".."1000210005"
    )

    EnumConstant(
        "QUERY_TYPE_PERFORMANCE_QUERY_INTEL".."1000210000"
    )

    EnumConstant(
        "OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL".."1000210000"
    )

    EnumConstant(
        "PERFORMANCE_CONFIGURATION_TYPE_COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED_INTEL".."0"
    )

    EnumConstant(
        "QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL".."0"
    )

    EnumConstant(
        "PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL".."0",
        "PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL".."1"
    )

    EnumConstant(
        "PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL".."0",
        "PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL".."1"
    )

    EnumConstant(
        "PERFORMANCE_VALUE_TYPE_UINT32_INTEL".."0",
        "PERFORMANCE_VALUE_TYPE_UINT64_INTEL".."1",
        "PERFORMANCE_VALUE_TYPE_FLOAT_INTEL".."2",
        "PERFORMANCE_VALUE_TYPE_BOOL_INTEL".."3",
        "PERFORMANCE_VALUE_TYPE_STRING_INTEL".."4"
    )

    VkResult(
        "InitializePerformanceApiINTEL",

        VkDevice("device"),
        VkInitializePerformanceApiInfoINTEL.const.p("pInitializeInfo")
    )

    void(
        "UninitializePerformanceApiINTEL",

        VkDevice("device")
    )

    VkResult(
        "CmdSetPerformanceMarkerINTEL",

        VkCommandBuffer("commandBuffer"),
        VkPerformanceMarkerInfoINTEL.const.p("pMarkerInfo")
    )

    VkResult(
        "CmdSetPerformanceStreamMarkerINTEL",

        VkCommandBuffer("commandBuffer"),
        VkPerformanceStreamMarkerInfoINTEL.const.p("pMarkerInfo")
    )

    VkResult(
        "CmdSetPerformanceOverrideINTEL",

        VkCommandBuffer("commandBuffer"),
        VkPerformanceOverrideInfoINTEL.const.p("pOverrideInfo")
    )

    VkResult(
        "AcquirePerformanceConfigurationINTEL",

        VkDevice("device"),
        VkPerformanceConfigurationAcquireInfoINTEL.const.p("pAcquireInfo"),
        Check(1)..VkPerformanceConfigurationINTEL.p("pConfiguration")
    )

    VkResult(
        "ReleasePerformanceConfigurationINTEL",

        VkDevice("device"),
        VkPerformanceConfigurationINTEL("configuration")
    )

    VkResult(
        "QueueSetPerformanceConfigurationINTEL",

        VkQueue("queue"),
        VkPerformanceConfigurationINTEL("configuration")
    )

    VkResult(
        "GetPerformanceParameterINTEL",

        VkDevice("device"),
        VkPerformanceParameterTypeINTEL("parameter"),
        VkPerformanceValueINTEL.p("pValue")
    )
}