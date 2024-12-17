/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_low_latency2 = "NVLowLatency2".nativeClassVK("NV_low_latency2", type = "device", postfix = "NV") {
    IntConstant(
        "NV_LOW_LATENCY_2_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_LOW_LATENCY_2_EXTENSION_NAME".."VK_NV_low_latency2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV".."1000505000",
        "STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV".."1000505001",
        "STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV".."1000505002",
        "STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV".."1000505003",
        "STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV".."1000505004",
        "STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV".."1000505005",
        "STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV".."1000505006",
        "STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV".."1000505007",
        "STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV".."1000505008"
    )

    EnumConstant(
        "LATENCY_MARKER_SIMULATION_START_NV".."0",
        "LATENCY_MARKER_SIMULATION_END_NV".."1",
        "LATENCY_MARKER_RENDERSUBMIT_START_NV".."2",
        "LATENCY_MARKER_RENDERSUBMIT_END_NV".."3",
        "LATENCY_MARKER_PRESENT_START_NV".."4",
        "LATENCY_MARKER_PRESENT_END_NV".."5",
        "LATENCY_MARKER_INPUT_SAMPLE_NV".."6",
        "LATENCY_MARKER_TRIGGER_FLASH_NV".."7",
        "LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_START_NV".."8",
        "LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_END_NV".."9",
        "LATENCY_MARKER_OUT_OF_BAND_PRESENT_START_NV".."10",
        "LATENCY_MARKER_OUT_OF_BAND_PRESENT_END_NV".."11"
    )

    EnumConstant(
        "OUT_OF_BAND_QUEUE_TYPE_RENDER_NV".."0",
        "OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV".."1"
    )

    VkResult(
        "SetLatencySleepModeNV",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        VkLatencySleepModeInfoNV.const.p("pSleepModeInfo")
    )

    VkResult(
        "LatencySleepNV",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        VkLatencySleepInfoNV.const.p("pSleepInfo")
    )

    void(
        "SetLatencyMarkerNV",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        VkSetLatencyMarkerInfoNV.const.p("pLatencyMarkerInfo")
    )

    void(
        "GetLatencyTimingsNV",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        VkGetLatencyMarkerInfoNV.p("pLatencyMarkerInfo")
    )

    void(
        "QueueNotifyOutOfBandNV",

        VkQueue("queue"),
        VkOutOfBandQueueTypeInfoNV.const.p("pQueueTypeInfo")
    )
}