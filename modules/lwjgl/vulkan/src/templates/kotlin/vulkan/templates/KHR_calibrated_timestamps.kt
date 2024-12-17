/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_calibrated_timestamps = "KHRCalibratedTimestamps".nativeClassVK("KHR_calibrated_timestamps", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_CALIBRATED_TIMESTAMPS_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_CALIBRATED_TIMESTAMPS_EXTENSION_NAME".."VK_KHR_calibrated_timestamps"
    )

    EnumConstant(
        "STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR".."1000184000"
    )

    VkResult(
        "GetPhysicalDeviceCalibrateableTimeDomainsKHR",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pTimeDomains")..Check(1)..uint32_t.p("pTimeDomainCount"),
        nullable..VkTimeDomainKHR.p("pTimeDomains")
    )

    VkResult(
        "GetCalibratedTimestampsKHR",

        VkDevice("device"),
        AutoSize("pTimestampInfos", "pTimestamps")..uint32_t("timestampCount"),
        VkCalibratedTimestampInfoKHR.const.p("pTimestampInfos"),
        uint64_t.p("pTimestamps"),
        Check(1)..uint64_t.p("pMaxDeviation")
    )
}