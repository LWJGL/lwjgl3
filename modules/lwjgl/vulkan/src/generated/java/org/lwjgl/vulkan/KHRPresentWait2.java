/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRPresentWait2 {

    public static final int VK_KHR_PRESENT_WAIT_2_SPEC_VERSION = 1;

    public static final String VK_KHR_PRESENT_WAIT_2_EXTENSION_NAME = "VK_KHR_present_wait2";

    public static final int VK_SWAPCHAIN_CREATE_PRESENT_WAIT_2_BIT_KHR = 0x80;

    public static final int
        VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR     = 1000480000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_2_FEATURES_KHR = 1000480001,
        VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR                     = 1000480002;

    protected KHRPresentWait2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkWaitForPresent2KHR ] ---

    /** {@code VkResult vkWaitForPresent2KHR(VkDevice device, VkSwapchainKHR swapchain, VkPresentWait2InfoKHR const * pPresentWait2Info)} */
    public static int nvkWaitForPresent2KHR(VkDevice device, long swapchain, long pPresentWait2Info) {
        long __functionAddress = device.getCapabilities().vkWaitForPresent2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), swapchain, pPresentWait2Info, __functionAddress);
    }

    /** {@code VkResult vkWaitForPresent2KHR(VkDevice device, VkSwapchainKHR swapchain, VkPresentWait2InfoKHR const * pPresentWait2Info)} */
    @NativeType("VkResult")
    public static int vkWaitForPresent2KHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkPresentWait2InfoKHR const *") VkPresentWait2InfoKHR pPresentWait2Info) {
        return nvkWaitForPresent2KHR(device, swapchain, pPresentWait2Info.address());
    }

}