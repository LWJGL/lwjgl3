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

public class EXTDisplayControl {

    public static final int VK_EXT_DISPLAY_CONTROL_SPEC_VERSION = 1;

    public static final String VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME = "VK_EXT_display_control";

    public static final int
        VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT            = 1000091000,
        VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT             = 1000091001,
        VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT            = 1000091002,
        VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT = 1000091003;

    public static final int
        VK_DISPLAY_POWER_STATE_OFF_EXT     = 0,
        VK_DISPLAY_POWER_STATE_SUSPEND_EXT = 1,
        VK_DISPLAY_POWER_STATE_ON_EXT      = 2;

    public static final int VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = 0;

    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0;

    protected EXTDisplayControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkDisplayPowerControlEXT ] ---

    /** {@code VkResult vkDisplayPowerControlEXT(VkDevice device, VkDisplayKHR display, VkDisplayPowerInfoEXT const * pDisplayPowerInfo)} */
    public static int nvkDisplayPowerControlEXT(VkDevice device, long display, long pDisplayPowerInfo) {
        long __functionAddress = device.getCapabilities().vkDisplayPowerControlEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), display, pDisplayPowerInfo, __functionAddress);
    }

    /** {@code VkResult vkDisplayPowerControlEXT(VkDevice device, VkDisplayKHR display, VkDisplayPowerInfoEXT const * pDisplayPowerInfo)} */
    @NativeType("VkResult")
    public static int vkDisplayPowerControlEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayPowerInfoEXT const *") VkDisplayPowerInfoEXT pDisplayPowerInfo) {
        return nvkDisplayPowerControlEXT(device, display, pDisplayPowerInfo.address());
    }

    // --- [ vkRegisterDeviceEventEXT ] ---

    /** {@code VkResult vkRegisterDeviceEventEXT(VkDevice device, VkDeviceEventInfoEXT const * pDeviceEventInfo, VkAllocationCallbacks const * pAllocator, VkFence * pFence)} */
    public static int nvkRegisterDeviceEventEXT(VkDevice device, long pDeviceEventInfo, long pAllocator, long pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDeviceEventEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pDeviceEventInfo, pAllocator, pFence, __functionAddress);
    }

    /** {@code VkResult vkRegisterDeviceEventEXT(VkDevice device, VkDeviceEventInfoEXT const * pDeviceEventInfo, VkAllocationCallbacks const * pAllocator, VkFence * pFence)} */
    @NativeType("VkResult")
    public static int vkRegisterDeviceEventEXT(VkDevice device, @NativeType("VkDeviceEventInfoEXT const *") VkDeviceEventInfoEXT pDeviceEventInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkFence *") LongBuffer pFence) {
        if (CHECKS) {
            check(pFence, 1);
        }
        return nvkRegisterDeviceEventEXT(device, pDeviceEventInfo.address(), memAddressSafe(pAllocator), memAddress(pFence));
    }

    // --- [ vkRegisterDisplayEventEXT ] ---

    /** {@code VkResult vkRegisterDisplayEventEXT(VkDevice device, VkDisplayKHR display, VkDisplayEventInfoEXT const * pDisplayEventInfo, VkAllocationCallbacks const * pAllocator, VkFence * pFence)} */
    public static int nvkRegisterDisplayEventEXT(VkDevice device, long display, long pDisplayEventInfo, long pAllocator, long pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDisplayEventEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPPI(device.address(), display, pDisplayEventInfo, pAllocator, pFence, __functionAddress);
    }

    /** {@code VkResult vkRegisterDisplayEventEXT(VkDevice device, VkDisplayKHR display, VkDisplayEventInfoEXT const * pDisplayEventInfo, VkAllocationCallbacks const * pAllocator, VkFence * pFence)} */
    @NativeType("VkResult")
    public static int vkRegisterDisplayEventEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayEventInfoEXT const *") VkDisplayEventInfoEXT pDisplayEventInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkFence *") LongBuffer pFence) {
        if (CHECKS) {
            check(pFence, 1);
        }
        return nvkRegisterDisplayEventEXT(device, display, pDisplayEventInfo.address(), memAddressSafe(pAllocator), memAddress(pFence));
    }

    // --- [ vkGetSwapchainCounterEXT ] ---

    /** {@code VkResult vkGetSwapchainCounterEXT(VkDevice device, VkSwapchainKHR swapchain, VkSurfaceCounterFlagBitsEXT counter, uint64_t * pCounterValue)} */
    public static int nvkGetSwapchainCounterEXT(VkDevice device, long swapchain, int counter, long pCounterValue) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainCounterEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), swapchain, counter, pCounterValue, __functionAddress);
    }

    /** {@code VkResult vkGetSwapchainCounterEXT(VkDevice device, VkSwapchainKHR swapchain, VkSurfaceCounterFlagBitsEXT counter, uint64_t * pCounterValue)} */
    @NativeType("VkResult")
    public static int vkGetSwapchainCounterEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSurfaceCounterFlagBitsEXT") int counter, @NativeType("uint64_t *") LongBuffer pCounterValue) {
        if (CHECKS) {
            check(pCounterValue, 1);
        }
        return nvkGetSwapchainCounterEXT(device, swapchain, counter, memAddress(pCounterValue));
    }

    /** {@code VkResult vkRegisterDeviceEventEXT(VkDevice device, VkDeviceEventInfoEXT const * pDeviceEventInfo, VkAllocationCallbacks const * pAllocator, VkFence * pFence)} */
    @NativeType("VkResult")
    public static int vkRegisterDeviceEventEXT(VkDevice device, @NativeType("VkDeviceEventInfoEXT const *") VkDeviceEventInfoEXT pDeviceEventInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkFence *") long[] pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDeviceEventEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pFence, 1);
        }
        return callPPPPI(device.address(), pDeviceEventInfo.address(), memAddressSafe(pAllocator), pFence, __functionAddress);
    }

    /** {@code VkResult vkRegisterDisplayEventEXT(VkDevice device, VkDisplayKHR display, VkDisplayEventInfoEXT const * pDisplayEventInfo, VkAllocationCallbacks const * pAllocator, VkFence * pFence)} */
    @NativeType("VkResult")
    public static int vkRegisterDisplayEventEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayEventInfoEXT const *") VkDisplayEventInfoEXT pDisplayEventInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkFence *") long[] pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDisplayEventEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pFence, 1);
        }
        return callPJPPPI(device.address(), display, pDisplayEventInfo.address(), memAddressSafe(pAllocator), pFence, __functionAddress);
    }

    /** {@code VkResult vkGetSwapchainCounterEXT(VkDevice device, VkSwapchainKHR swapchain, VkSurfaceCounterFlagBitsEXT counter, uint64_t * pCounterValue)} */
    @NativeType("VkResult")
    public static int vkGetSwapchainCounterEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSurfaceCounterFlagBitsEXT") int counter, @NativeType("uint64_t *") long[] pCounterValue) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainCounterEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pCounterValue, 1);
        }
        return callPJPI(device.address(), swapchain, counter, pCounterValue, __functionAddress);
    }

}