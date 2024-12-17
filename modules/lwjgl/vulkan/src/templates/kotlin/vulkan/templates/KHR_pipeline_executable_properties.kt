/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_pipeline_executable_properties = "KHRPipelineExecutableProperties".nativeClassVK("KHR_pipeline_executable_properties", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_PIPELINE_EXECUTABLE_PROPERTIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_PIPELINE_EXECUTABLE_PROPERTIES_EXTENSION_NAME".."VK_KHR_pipeline_executable_properties"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR".."1000269000",
        "STRUCTURE_TYPE_PIPELINE_INFO_KHR".."1000269001",
        "STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR".."1000269002",
        "STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR".."1000269003",
        "STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR".."1000269004",
        "STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR".."1000269005"
    )

    EnumConstant(
        "PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR".enum(0x00000040),
        "PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR".enum(0x00000080)
    )

    EnumConstant(
        "PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR".."0",
        "PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR".."1",
        "PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR".."2",
        "PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR".."3"
    )

    VkResult(
        "GetPipelineExecutablePropertiesKHR",

        VkDevice("device"),
        VkPipelineInfoKHR.const.p("pPipelineInfo"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pExecutableCount"),
        nullable..VkPipelineExecutablePropertiesKHR.p("pProperties")
    )

    VkResult(
        "GetPipelineExecutableStatisticsKHR",

        VkDevice("device"),
        VkPipelineExecutableInfoKHR.const.p("pExecutableInfo"),
        AutoSize("pStatistics")..Check(1)..uint32_t.p("pStatisticCount"),
        nullable..VkPipelineExecutableStatisticKHR.p("pStatistics")
    )

    VkResult(
        "GetPipelineExecutableInternalRepresentationsKHR",

        VkDevice("device"),
        VkPipelineExecutableInfoKHR.const.p("pExecutableInfo"),
        AutoSize("pInternalRepresentations")..Check(1)..uint32_t.p("pInternalRepresentationCount"),
        nullable..VkPipelineExecutableInternalRepresentationKHR.p("pInternalRepresentations")
    )
}