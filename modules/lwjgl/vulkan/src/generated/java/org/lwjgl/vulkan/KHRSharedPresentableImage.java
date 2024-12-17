/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRSharedPresentableImage {

    public static final int VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION = 1;

    public static final String VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME = "VK_KHR_shared_presentable_image";

    public static final int VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR = 1000111000;

    public static final int
        VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR     = 1000111000,
        VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = 1000111001;

    public static final int VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR = 1000111000;

    protected KHRSharedPresentableImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetSwapchainStatusKHR ] ---

    /** {@code VkResult vkGetSwapchainStatusKHR(VkDevice device, VkSwapchainKHR swapchain)} */
    @NativeType("VkResult")
    public static int vkGetSwapchainStatusKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainStatusKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), swapchain, __functionAddress);
    }

}