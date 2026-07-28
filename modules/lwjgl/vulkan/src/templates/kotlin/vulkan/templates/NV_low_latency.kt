/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_low_latency = "NVLowLatency".nativeClassVK("NV_low_latency", type = "device", postfix = "NV") {
    IntConstant(
        "NV_LOW_LATENCY_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_LOW_LATENCY_EXTENSION_NAME".."VK_NV_low_latency"
    )

    EnumConstant(
        "STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV".."1000310000"
    )

    void(
        "SetLatencySleepModeLegacyNV",

        VkDevice("device"),
        VkBool32("lowLatencyMode"),
        VkBool32("lowLatencyBoost"),
        uint32_t("minimumIntervalUs")
    )

    void(
        "LatencySleepLegacyNV",

        VkDevice("device"),
        VkSemaphore("signalSemaphore"),
        uint64_t("value")
    )

    void(
        "SetLatencyMarkerLegacyNV",

        VkDevice("device"),
        uint64_t("frameID"),
        uint32_t("marker")
    )

    void(
        "GetLatencyTimingsLegacyNV",

        VkDevice("device"),
        Check(1)..void.p("pTimings")
    )

    void(
        "QueueNotifyOutOfBandLegacyNV",

        VkQueue("queue"),
        uint32_t("queueType")
    )

    void(
        "GetSleepStatusLegacyNV",

        VkDevice("device"),
        Check(1)..VkBool32.p("pLowLatencyMode")
    )

    void(
        "ShutdownLatencyDeviceLegacyNV",

        VkDevice("device")
    )
}