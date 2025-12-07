/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_present_timing = "EXTPresentTiming".nativeClassVK("EXT_present_timing", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PRESENT_TIMING_SPEC_VERSION".."3"
    )

    StringConstant(
        "EXT_PRESENT_TIMING_EXTENSION_NAME".."VK_EXT_present_timing"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT".."1000208000",
        "STRUCTURE_TYPE_SWAPCHAIN_TIMING_PROPERTIES_EXT".."1000208001",
        "STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT".."1000208002",
        "STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT".."1000208003",
        "STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT".."1000208004",
        "STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT".."1000208005",
        "STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT".."1000208006",
        "STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT".."1000208007",
        "STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT".."1000208008",
        "STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT".."1000208009"
    )

    EnumConstant(
        "TIME_DOMAIN_PRESENT_STAGE_LOCAL_EXT".."1000208000",
        "TIME_DOMAIN_SWAPCHAIN_LOCAL_EXT".."1000208001"
    )

    EnumConstant(
        "ERROR_PRESENT_TIMING_QUEUE_FULL_EXT".."-1000208000"
    )

    EnumConstant(
        "SWAPCHAIN_CREATE_PRESENT_TIMING_BIT_EXT".enum(0x00000200)
    )

    EnumConstant(
        "PRESENT_STAGE_QUEUE_OPERATIONS_END_BIT_EXT".enum(0x00000001),
        "PRESENT_STAGE_REQUEST_DEQUEUED_BIT_EXT".enum(0x00000002),
        "PRESENT_STAGE_IMAGE_FIRST_PIXEL_OUT_BIT_EXT".enum(0x00000004),
        "PRESENT_STAGE_IMAGE_FIRST_PIXEL_VISIBLE_BIT_EXT".enum(0x00000008)
    )

    EnumConstant(
        "PAST_PRESENTATION_TIMING_ALLOW_PARTIAL_RESULTS_BIT_EXT".enum(0x00000001),
        "PAST_PRESENTATION_TIMING_ALLOW_OUT_OF_ORDER_RESULTS_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        "PRESENT_TIMING_INFO_PRESENT_AT_RELATIVE_TIME_BIT_EXT".enum(0x00000001),
        "PRESENT_TIMING_INFO_PRESENT_AT_NEAREST_REFRESH_CYCLE_BIT_EXT".enum(0x00000002)
    )

    VkResult(
        "SetSwapchainPresentTimingQueueSizeEXT",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        uint32_t("size")
    )

    VkResult(
        "GetSwapchainTimingPropertiesEXT",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        VkSwapchainTimingPropertiesEXT.p("pSwapchainTimingProperties"),
        Check(1)..nullable..uint64_t.p("pSwapchainTimingPropertiesCounter")
    )

    VkResult(
        "GetSwapchainTimeDomainPropertiesEXT",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        VkSwapchainTimeDomainPropertiesEXT.p("pSwapchainTimeDomainProperties"),
        Check(1)..nullable..uint64_t.p("pTimeDomainsCounter")
    )

    VkResult(
        "GetPastPresentationTimingEXT",

        VkDevice("device"),
        VkPastPresentationTimingInfoEXT.const.p("pPastPresentationTimingInfo"),
        VkPastPresentationTimingPropertiesEXT.p("pPastPresentationTimingProperties")
    )
}