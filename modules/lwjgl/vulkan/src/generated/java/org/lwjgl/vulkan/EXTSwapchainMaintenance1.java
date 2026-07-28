/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTSwapchainMaintenance1 {

    public static final int VK_EXT_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION = 1;

    public static final String VK_EXT_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME = "VK_EXT_swapchain_maintenance1";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT = 1000275000,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT                     = 1000275001,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT              = 1000275002,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT                      = 1000275003,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT            = 1000275004,
        VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT                    = 1000275005;

    public static final int VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_EXT = 0x8;

    protected EXTSwapchainMaintenance1() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkReleaseSwapchainImagesEXT ] ---

    /** {@code VkResult vkReleaseSwapchainImagesEXT(VkDevice device, VkReleaseSwapchainImagesInfoKHR const * pReleaseInfo)} */
    public static int nvkReleaseSwapchainImagesEXT(VkDevice device, long pReleaseInfo) {
        long __functionAddress = device.getCapabilities().vkReleaseSwapchainImagesEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkReleaseSwapchainImagesInfoKHR.validate(pReleaseInfo);
        }
        return callPPI(device.address(), pReleaseInfo, __functionAddress);
    }

    /** {@code VkResult vkReleaseSwapchainImagesEXT(VkDevice device, VkReleaseSwapchainImagesInfoKHR const * pReleaseInfo)} */
    @NativeType("VkResult")
    public static int vkReleaseSwapchainImagesEXT(VkDevice device, @NativeType("VkReleaseSwapchainImagesInfoKHR const *") VkReleaseSwapchainImagesInfoKHR pReleaseInfo) {
        return nvkReleaseSwapchainImagesEXT(device, pReleaseInfo.address());
    }

}