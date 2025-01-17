/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_calibrated_timestamps = "EXTCalibratedTimestamps".nativeClassVK("EXT_calibrated_timestamps", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_CALIBRATED_TIMESTAMPS_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME".."VK_EXT_calibrated_timestamps"
    )

    EnumConstant(
        "STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT".."1000184000"
    )

    EnumConstant(
        "TIME_DOMAIN_DEVICE_EXT".."0",
        "TIME_DOMAIN_DEVICE_KHR".."0",
        "TIME_DOMAIN_CLOCK_MONOTONIC_EXT".."1",
        "TIME_DOMAIN_CLOCK_MONOTONIC_KHR".."1",
        "TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT".."2",
        "TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR".."2",
        "TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT".."3",
        "TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR".."3"
    )

    VkResult(
        "GetPhysicalDeviceCalibrateableTimeDomainsEXT",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pTimeDomains")..Check(1)..uint32_t.p("pTimeDomainCount"),
        nullable..VkTimeDomainKHR.p("pTimeDomains")
    )

    VkResult(
        "GetCalibratedTimestampsEXT",

        VkDevice("device"),
        AutoSize("pTimestampInfos", "pTimestamps")..uint32_t("timestampCount"),
        VkCalibratedTimestampInfoKHR.const.p("pTimestampInfos"),
        uint64_t.p("pTimestamps"),
        Check(1)..uint64_t.p("pMaxDeviation")
    )
}