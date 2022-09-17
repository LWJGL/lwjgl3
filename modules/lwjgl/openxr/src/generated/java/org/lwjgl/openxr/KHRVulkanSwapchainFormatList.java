/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_vulkan_swapchain_format_list">XR_KHR_vulkan_swapchain_format_list</a> extension.
 * 
 * <p>Vulkan has the {@code VK_KHR_image_format_list} extension which allows applications to tell the {@code vkCreateImage} function which formats the application intends to use when {@code VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT} is specified. This OpenXR extension exposes that Vulkan extension to OpenXR applications. In the same way that a Vulkan-based application can pass a {@code VkImageFormatListCreateInfo} struct to the {@code vkCreateImage} function, an OpenXR application can pass an identically configured {@link XrVulkanSwapchainFormatListCreateInfoKHR} structure to {@link XR10#xrCreateSwapchain CreateSwapchain}.</p>
 * 
 * <p>Applications using this extension to specify more than one swapchain format must create OpenXR swapchains with the {@link XR10#XR_SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT} bit set.</p>
 * 
 * <p>Runtimes implementing this extension <b>must</b> support the {@link KHRVulkanEnable XR_KHR_vulkan_enable} or the {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension. When {@link KHRVulkanEnable XR_KHR_vulkan_enable} is used, the runtime <b>must</b> add {@code VK_KHR_image_format_list} to the list of extensions enabled in {@link KHRVulkanEnable2#xrCreateVulkanDeviceKHR CreateVulkanDeviceKHR}.</p>
 */
public final class KHRVulkanSwapchainFormatList {

    /** The extension specification version. */
    public static final int XR_KHR_vulkan_swapchain_format_list_SPEC_VERSION = 4;

    /** The extension name. */
    public static final String XR_KHR_VULKAN_SWAPCHAIN_FORMAT_LIST_EXTENSION_NAME = "XR_KHR_vulkan_swapchain_format_list";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR = 1000014000;

    private KHRVulkanSwapchainFormatList() {}

}