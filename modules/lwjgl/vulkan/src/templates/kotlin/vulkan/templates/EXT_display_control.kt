/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_display_control = "EXTDisplayControl".nativeClassVK("EXT_display_control", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DISPLAY_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DISPLAY_CONTROL_EXTENSION_NAME".."VK_EXT_display_control"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT".."1000091000",
        "STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT".."1000091001",
        "STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT".."1000091002",
        "STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT".."1000091003"
    )

    EnumConstant(
        "DISPLAY_POWER_STATE_OFF_EXT".."0",
        "DISPLAY_POWER_STATE_SUSPEND_EXT".."1",
        "DISPLAY_POWER_STATE_ON_EXT".."2"
    )

    EnumConstant(
        "DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT".."0"
    )

    EnumConstant(
        "DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT".."0"
    )

    VkResult(
        "DisplayPowerControlEXT",

        VkDevice("device"),
        VkDisplayKHR("display"),
        VkDisplayPowerInfoEXT.const.p("pDisplayPowerInfo")
    )

    VkResult(
        "RegisterDeviceEventEXT",

        VkDevice("device"),
        VkDeviceEventInfoEXT.const.p("pDeviceEventInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkFence.p("pFence")
    )

    VkResult(
        "RegisterDisplayEventEXT",

        VkDevice("device"),
        VkDisplayKHR("display"),
        VkDisplayEventInfoEXT.const.p("pDisplayEventInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkFence.p("pFence")
    )

    VkResult(
        "GetSwapchainCounterEXT",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        VkSurfaceCounterFlagBitsEXT("counter"),
        Check(1)..uint64_t.p("pCounterValue")
    )
}