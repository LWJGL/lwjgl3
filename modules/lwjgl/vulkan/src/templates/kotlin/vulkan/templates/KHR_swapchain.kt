/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_swapchain = "KHRSwapchain".nativeClassVK("KHR_swapchain", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SWAPCHAIN_SPEC_VERSION".."70"
    )

    StringConstant(
        "KHR_SWAPCHAIN_EXTENSION_NAME".."VK_KHR_swapchain"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR".."1000001000",
        "STRUCTURE_TYPE_PRESENT_INFO_KHR".."1000001001",
        "STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR".."1000060007",
        "STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR".."1000060008",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR".."1000060009",
        "STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR".."1000060010",
        "STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR".."1000060011",
        "STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR".."1000060012"
    )

    EnumConstant(
        "IMAGE_LAYOUT_PRESENT_SRC_KHR".."1000001002"
    )

    EnumConstant(
        "SUBOPTIMAL_KHR".."1000001003",
        "ERROR_OUT_OF_DATE_KHR".."-1000001004"
    )

    EnumConstant(
        "OBJECT_TYPE_SWAPCHAIN_KHR".."1000001000"
    )

    EnumConstant(
        "SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR".enum(0x00000001),
        "SWAPCHAIN_CREATE_PROTECTED_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        "DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR".enum(0x00000001),
        "DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR".enum(0x00000002),
        "DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR".enum(0x00000004),
        "DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR".enum(0x00000008)
    )

    VkResult(
        "CreateSwapchainKHR",

        VkDevice("device"),
        VkSwapchainCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSwapchainKHR.p("pSwapchain")
    )

    void(
        "DestroySwapchainKHR",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "GetSwapchainImagesKHR",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        AutoSize("pSwapchainImages")..Check(1)..uint32_t.p("pSwapchainImageCount"),
        nullable..VkImage.p("pSwapchainImages")
    )

    VkResult(
        "AcquireNextImageKHR",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        uint64_t("timeout"),
        VkSemaphore("semaphore"),
        VkFence("fence"),
        Check(1)..uint32_t.p("pImageIndex")
    )

    VkResult(
        "QueuePresentKHR",

        VkQueue("queue"),
        VkPresentInfoKHR.const.p("pPresentInfo")
    )

    DependsOn("Vulkan11")..VkResult(
        "GetDeviceGroupPresentCapabilitiesKHR",

        VkDevice("device"),
        VkDeviceGroupPresentCapabilitiesKHR.p("pDeviceGroupPresentCapabilities")
    )

    DependsOn("Vulkan11")..VkResult(
        "GetDeviceGroupSurfacePresentModesKHR",

        VkDevice("device"),
        VkSurfaceKHR("surface"),
        Check(1)..VkDeviceGroupPresentModeFlagsKHR.p("pModes")
    )

    DependsOn("Vulkan11")..VkResult(
        "GetPhysicalDevicePresentRectanglesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkSurfaceKHR("surface"),
        AutoSize("pRects")..Check(1)..uint32_t.p("pRectCount"),
        nullable..VkRect2D.p("pRects")
    )

    DependsOn("Vulkan11")..VkResult(
        "AcquireNextImage2KHR",

        VkDevice("device"),
        VkAcquireNextImageInfoKHR.const.p("pAcquireInfo"),
        Check(1)..uint32_t.p("pImageIndex")
    )
}