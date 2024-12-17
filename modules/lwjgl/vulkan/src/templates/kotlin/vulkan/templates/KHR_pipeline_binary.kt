/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_pipeline_binary = "KHRPipelineBinary".nativeClassVK("KHR_pipeline_binary", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_PIPELINE_BINARY_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_PIPELINE_BINARY_EXTENSION_NAME".."VK_KHR_pipeline_binary"
    )

    EnumConstant(
        "MAX_PIPELINE_BINARY_KEY_SIZE_KHR".."32"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR".."1000483000",
        "STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR".."1000483001",
        "STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR".."1000483002",
        "STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR".."1000483003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR".."1000483004",
        "STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR".."1000483005",
        "STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR".."1000483006",
        "STRUCTURE_TYPE_PIPELINE_CREATE_INFO_KHR".."1000483007",
        "STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR".."1000483008",
        "STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR".."1000483009"
    )

    EnumConstant(
        "OBJECT_TYPE_PIPELINE_BINARY_KHR".."1000483000"
    )

    EnumConstant(
        "PIPELINE_BINARY_MISSING_KHR".."1000483000",
        "ERROR_NOT_ENOUGH_SPACE_KHR".."-1000483000"
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR".enum(0x80000000L)
    )

    VkResult(
        "CreatePipelineBinariesKHR",

        VkDevice("device"),
        VkPipelineBinaryCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        VkPipelineBinaryHandlesInfoKHR.p("pBinaries")
    )

    void(
        "DestroyPipelineBinaryKHR",

        VkDevice("device"),
        VkPipelineBinaryKHR("pipelineBinary"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "GetPipelineKeyKHR",

        VkDevice("device"),
        nullable..VkPipelineCreateInfoKHR.const.p("pPipelineCreateInfo"),
        VkPipelineBinaryKeyKHR.p("pPipelineKey")
    )

    VkResult(
        "GetPipelineBinaryDataKHR",

        VkDevice("device"),
        VkPipelineBinaryDataInfoKHR.const.p("pInfo"),
        VkPipelineBinaryKeyKHR.p("pPipelineBinaryKey"),
        AutoSize("pPipelineBinaryData")..Check(1)..size_t.p("pPipelineBinaryDataSize"),
        nullable..void.p("pPipelineBinaryData")
    )

    VkResult(
        "ReleaseCapturedPipelineDataKHR",

        VkDevice("device"),
        VkReleaseCapturedPipelineDataInfoKHR.const.p("pInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )
}