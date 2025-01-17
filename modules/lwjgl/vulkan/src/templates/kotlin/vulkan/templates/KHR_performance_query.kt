/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_performance_query = "KHRPerformanceQuery".nativeClassVK("KHR_performance_query", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_PERFORMANCE_QUERY_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_PERFORMANCE_QUERY_EXTENSION_NAME".."VK_KHR_performance_query"
    )

    EnumConstant(
        "QUERY_TYPE_PERFORMANCE_QUERY_KHR".."1000116000"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR".."1000116000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR".."1000116001",
        "STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR".."1000116002",
        "STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR".."1000116003",
        "STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR".."1000116004",
        "STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR".."1000116005",
        "STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR".."1000116006"
    )

    EnumConstant(
        "PERFORMANCE_COUNTER_UNIT_GENERIC_KHR".."0",
        "PERFORMANCE_COUNTER_UNIT_PERCENTAGE_KHR".."1",
        "PERFORMANCE_COUNTER_UNIT_NANOSECONDS_KHR".."2",
        "PERFORMANCE_COUNTER_UNIT_BYTES_KHR".."3",
        "PERFORMANCE_COUNTER_UNIT_BYTES_PER_SECOND_KHR".."4",
        "PERFORMANCE_COUNTER_UNIT_KELVIN_KHR".."5",
        "PERFORMANCE_COUNTER_UNIT_WATTS_KHR".."6",
        "PERFORMANCE_COUNTER_UNIT_VOLTS_KHR".."7",
        "PERFORMANCE_COUNTER_UNIT_AMPS_KHR".."8",
        "PERFORMANCE_COUNTER_UNIT_HERTZ_KHR".."9",
        "PERFORMANCE_COUNTER_UNIT_CYCLES_KHR".."10"
    )

    EnumConstant(
        "PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR".."0",
        "QUERY_SCOPE_COMMAND_BUFFER_KHR".."0",
        "PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR".."1",
        "QUERY_SCOPE_RENDER_PASS_KHR".."1",
        "PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR".."2",
        "QUERY_SCOPE_COMMAND_KHR".."2"
    )

    EnumConstant(
        "PERFORMANCE_COUNTER_STORAGE_INT32_KHR".."0",
        "PERFORMANCE_COUNTER_STORAGE_INT64_KHR".."1",
        "PERFORMANCE_COUNTER_STORAGE_UINT32_KHR".."2",
        "PERFORMANCE_COUNTER_STORAGE_UINT64_KHR".."3",
        "PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR".."4",
        "PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR".."5"
    )

    EnumConstant(
        "PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_BIT_KHR".enum(0x00000001),
        "PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_KHR".enum(0x00000001),
        "PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_BIT_KHR".enum(0x00000002),
        "PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_KHR".enum(0x00000002)
    )

    VkResult(
        "EnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex"),
        AutoSize("pCounters", "pCounterDescriptions")..Check(1)..uint32_t.p("pCounterCount"),
        nullable..VkPerformanceCounterKHR.p("pCounters"),
        nullable..VkPerformanceCounterDescriptionKHR.p("pCounterDescriptions")
    )

    void(
        "GetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkQueryPoolPerformanceCreateInfoKHR.const.p("pPerformanceQueryCreateInfo"),
        Check(1)..uint32_t.p("pNumPasses")
    )

    VkResult(
        "AcquireProfilingLockKHR",

        VkDevice("device"),
        VkAcquireProfilingLockInfoKHR.const.p("pInfo")
    )

    void(
        "ReleaseProfilingLockKHR",

        VkDevice("device")
    )
}