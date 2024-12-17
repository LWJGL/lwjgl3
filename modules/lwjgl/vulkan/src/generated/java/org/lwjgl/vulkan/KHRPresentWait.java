/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRPresentWait {

    public static final int VK_KHR_PRESENT_WAIT_SPEC_VERSION = 1;

    public static final String VK_KHR_PRESENT_WAIT_EXTENSION_NAME = "VK_KHR_present_wait";

    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR = 1000248000;

    protected KHRPresentWait() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkWaitForPresentKHR ] ---

    /** {@code VkResult vkWaitForPresentKHR(VkDevice device, VkSwapchainKHR swapchain, uint64_t presentId, uint64_t timeout)} */
    @NativeType("VkResult")
    public static int vkWaitForPresentKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint64_t") long presentId, @NativeType("uint64_t") long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitForPresentKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJJI(device.address(), swapchain, presentId, timeout, __functionAddress);
    }

}