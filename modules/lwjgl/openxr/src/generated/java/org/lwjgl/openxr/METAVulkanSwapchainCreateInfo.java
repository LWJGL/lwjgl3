/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_META_vulkan_swapchain_create_info">XR_META_vulkan_swapchain_create_info</a> extension.
 * 
 * <p>Using this extension, a Vulkan-based application <b>can</b> pass through additional {@code VkImageCreateFlags} or {@code VkImageUsageFlags} by chaining an {@link XrVulkanSwapchainCreateInfoMETA} structure to the {@link XrSwapchainCreateInfo} when calling {@link XR10#xrCreateSwapchain CreateSwapchain}.</p>
 * 
 * <p>The application is still encouraged to use the common bits like {@link XR10#XR_SWAPCHAIN_USAGE_TRANSFER_SRC_BIT SWAPCHAIN_USAGE_TRANSFER_SRC_BIT} defined in {@code XrSwapchainUsageFlags}. However, the application <b>may</b> present both {@link XR10#XR_SWAPCHAIN_USAGE_TRANSFER_SRC_BIT SWAPCHAIN_USAGE_TRANSFER_SRC_BIT} in {@code XrSwapchainUsageFlags} and {@code VK_IMAGE_USAGE_TRANSFER_SRC_BIT} in {@code VkImageUsageFlags} at the same time.</p>
 * 
 * <p>The application <b>must</b> enable the corresponding Vulkan extensions before requesting additional Vulkan flags. For example, {@code VK_EXT_fragment_density_map} device extension <b>must</b> be enabled if an application requests {@code VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT} bit. Otherwise, it <b>may</b> cause undefined behavior, including an application crash.</p>
 * 
 * <p>Runtimes that implement this extension <b>must</b> support the {@link KHRVulkanEnable XR_KHR_vulkan_enable} or the {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension.</p>
 */
public final class METAVulkanSwapchainCreateInfo {

    /** The extension specification version. */
    public static final int XR_META_vulkan_swapchain_create_info_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_VULKAN_SWAPCHAIN_CREATE_INFO_EXTENSION_NAME = "XR_META_vulkan_swapchain_create_info";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META = 1000227000;

    private METAVulkanSwapchainCreateInfo() {}

}