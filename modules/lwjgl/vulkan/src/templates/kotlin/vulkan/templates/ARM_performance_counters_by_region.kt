/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_performance_counters_by_region = "ARMPerformanceCountersByRegion".nativeClassVK("ARM_performance_counters_by_region", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_PERFORMANCE_COUNTERS_BY_REGION_SPEC_VERSION".."1"
    )

    StringConstant(
        "ARM_PERFORMANCE_COUNTERS_BY_REGION_EXTENSION_NAME".."VK_ARM_performance_counters_by_region"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM".."1000605000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_PROPERTIES_ARM".."1000605001",
        "STRUCTURE_TYPE_PERFORMANCE_COUNTER_ARM".."1000605002",
        "STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_ARM".."1000605003",
        "STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM".."1000605004"
    )

    VkResult(
        "EnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex"),
        AutoSize("pCounters", "pCounterDescriptions")..Check(1)..uint32_t.p("pCounterCount"),
        nullable..VkPerformanceCounterARM.p("pCounters"),
        nullable..VkPerformanceCounterDescriptionARM.p("pCounterDescriptions")
    )
}