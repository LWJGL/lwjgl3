/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRDisplaySwapchain {

    public static final int VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = 10;

    public static final String VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";

    public static final int VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = 1000003000;

    public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;

    protected KHRDisplaySwapchain() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateSharedSwapchainsKHR ] ---

    /** {@code VkResult vkCreateSharedSwapchainsKHR(VkDevice device, uint32_t swapchainCount, VkSwapchainCreateInfoKHR const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkSwapchainKHR * pSwapchains)} */
    public static int nvkCreateSharedSwapchainsKHR(VkDevice device, int swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains) {
        long __functionAddress = device.getCapabilities().vkCreateSharedSwapchainsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), swapchainCount, pCreateInfos, pAllocator, pSwapchains, __functionAddress);
    }

    /** {@code VkResult vkCreateSharedSwapchainsKHR(VkDevice device, uint32_t swapchainCount, VkSwapchainCreateInfoKHR const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkSwapchainKHR * pSwapchains)} */
    @NativeType("VkResult")
    public static int vkCreateSharedSwapchainsKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") LongBuffer pSwapchains) {
        if (CHECKS) {
            check(pSwapchains, pCreateInfos.remaining());
        }
        return nvkCreateSharedSwapchainsKHR(device, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pSwapchains));
    }

    /** {@code VkResult vkCreateSharedSwapchainsKHR(VkDevice device, uint32_t swapchainCount, VkSwapchainCreateInfoKHR const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkSwapchainKHR * pSwapchains)} */
    @NativeType("VkResult")
    public static int vkCreateSharedSwapchainsKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") long[] pSwapchains) {
        long __functionAddress = device.getCapabilities().vkCreateSharedSwapchainsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSwapchains, pCreateInfos.remaining());
        }
        return callPPPPI(device.address(), pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pSwapchains, __functionAddress);
    }

}