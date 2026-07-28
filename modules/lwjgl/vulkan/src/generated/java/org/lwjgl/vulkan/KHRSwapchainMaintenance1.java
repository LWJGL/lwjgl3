/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRSwapchainMaintenance1 {

    public static final int VK_KHR_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION = 1;

    public static final String VK_KHR_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_swapchain_maintenance1";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR = 1000275000,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR                     = 1000275001,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_KHR              = 1000275002,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR                      = 1000275003,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR            = 1000275004,
        VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR                    = 1000275005;

    public static final int VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_KHR = 0x8;

    protected KHRSwapchainMaintenance1() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkReleaseSwapchainImagesKHR ] ---

    /** {@code VkResult vkReleaseSwapchainImagesKHR(VkDevice device, VkReleaseSwapchainImagesInfoKHR const * pReleaseInfo)} */
    public static int nvkReleaseSwapchainImagesKHR(VkDevice device, long pReleaseInfo) {
        long __functionAddress = device.getCapabilities().vkReleaseSwapchainImagesKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkReleaseSwapchainImagesInfoKHR.validate(pReleaseInfo);
        }
        return callPPI(device.address(), pReleaseInfo, __functionAddress);
    }

    /** {@code VkResult vkReleaseSwapchainImagesKHR(VkDevice device, VkReleaseSwapchainImagesInfoKHR const * pReleaseInfo)} */
    @NativeType("VkResult")
    public static int vkReleaseSwapchainImagesKHR(VkDevice device, @NativeType("VkReleaseSwapchainImagesInfoKHR const *") VkReleaseSwapchainImagesInfoKHR pReleaseInfo) {
        return nvkReleaseSwapchainImagesKHR(device, pReleaseInfo.address());
    }

}