/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_coverage_reduction_mode = "NVCoverageReductionMode".nativeClassVK("NV_coverage_reduction_mode", type = "device", postfix = "NV") {
    IntConstant(
        "NV_COVERAGE_REDUCTION_MODE_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME".."VK_NV_coverage_reduction_mode"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV".."1000250000",
        "STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV".."1000250001",
        "STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV".."1000250002"
    )

    EnumConstant(
        "COVERAGE_REDUCTION_MODE_MERGE_NV".."0",
        "COVERAGE_REDUCTION_MODE_TRUNCATE_NV".."1"
    )

    VkResult(
        "GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pCombinations")..Check(1)..uint32_t.p("pCombinationCount"),
        nullable..VkFramebufferMixedSamplesCombinationNV.p("pCombinations")
    )
}