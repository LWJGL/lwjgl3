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

public class GOOGLEDisplayTiming {

    public static final int VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION = 1;

    public static final String VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME = "VK_GOOGLE_display_timing";

    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE = 1000092000;

    protected GOOGLEDisplayTiming() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetRefreshCycleDurationGOOGLE ] ---

    /** {@code VkResult vkGetRefreshCycleDurationGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE * pDisplayTimingProperties)} */
    public static int nvkGetRefreshCycleDurationGOOGLE(VkDevice device, long swapchain, long pDisplayTimingProperties) {
        long __functionAddress = device.getCapabilities().vkGetRefreshCycleDurationGOOGLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), swapchain, pDisplayTimingProperties, __functionAddress);
    }

    /** {@code VkResult vkGetRefreshCycleDurationGOOGLE(VkDevice device, VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE * pDisplayTimingProperties)} */
    @NativeType("VkResult")
    public static int vkGetRefreshCycleDurationGOOGLE(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkRefreshCycleDurationGOOGLE *") VkRefreshCycleDurationGOOGLE pDisplayTimingProperties) {
        return nvkGetRefreshCycleDurationGOOGLE(device, swapchain, pDisplayTimingProperties.address());
    }

    // --- [ vkGetPastPresentationTimingGOOGLE ] ---

    /** {@code VkResult vkGetPastPresentationTimingGOOGLE(VkDevice device, VkSwapchainKHR swapchain, uint32_t * pPresentationTimingCount, VkPastPresentationTimingGOOGLE * pPresentationTimings)} */
    public static int nvkGetPastPresentationTimingGOOGLE(VkDevice device, long swapchain, long pPresentationTimingCount, long pPresentationTimings) {
        long __functionAddress = device.getCapabilities().vkGetPastPresentationTimingGOOGLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), swapchain, pPresentationTimingCount, pPresentationTimings, __functionAddress);
    }

    /** {@code VkResult vkGetPastPresentationTimingGOOGLE(VkDevice device, VkSwapchainKHR swapchain, uint32_t * pPresentationTimingCount, VkPastPresentationTimingGOOGLE * pPresentationTimings)} */
    @NativeType("VkResult")
    public static int vkGetPastPresentationTimingGOOGLE(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") IntBuffer pPresentationTimingCount, @NativeType("VkPastPresentationTimingGOOGLE *") VkPastPresentationTimingGOOGLE.@Nullable Buffer pPresentationTimings) {
        if (CHECKS) {
            check(pPresentationTimingCount, 1);
            checkSafe(pPresentationTimings, pPresentationTimingCount.get(pPresentationTimingCount.position()));
        }
        return nvkGetPastPresentationTimingGOOGLE(device, swapchain, memAddress(pPresentationTimingCount), memAddressSafe(pPresentationTimings));
    }

    /** {@code VkResult vkGetPastPresentationTimingGOOGLE(VkDevice device, VkSwapchainKHR swapchain, uint32_t * pPresentationTimingCount, VkPastPresentationTimingGOOGLE * pPresentationTimings)} */
    @NativeType("VkResult")
    public static int vkGetPastPresentationTimingGOOGLE(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") int[] pPresentationTimingCount, @NativeType("VkPastPresentationTimingGOOGLE *") VkPastPresentationTimingGOOGLE.@Nullable Buffer pPresentationTimings) {
        long __functionAddress = device.getCapabilities().vkGetPastPresentationTimingGOOGLE;
        if (CHECKS) {
            check(__functionAddress);
            check(pPresentationTimingCount, 1);
            checkSafe(pPresentationTimings, pPresentationTimingCount[0]);
        }
        return callPJPPI(device.address(), swapchain, pPresentationTimingCount, memAddressSafe(pPresentationTimings), __functionAddress);
    }

}