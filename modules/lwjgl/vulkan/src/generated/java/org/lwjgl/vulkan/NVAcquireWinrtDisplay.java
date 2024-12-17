/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVAcquireWinrtDisplay {

    public static final int VK_NV_ACQUIRE_WINRT_DISPLAY_SPEC_VERSION = 1;

    public static final String VK_NV_ACQUIRE_WINRT_DISPLAY_EXTENSION_NAME = "VK_NV_acquire_winrt_display";

    protected NVAcquireWinrtDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkAcquireWinrtDisplayNV ] ---

    /** {@code VkResult vkAcquireWinrtDisplayNV(VkPhysicalDevice physicalDevice, VkDisplayKHR display)} */
    @NativeType("VkResult")
    public static int vkAcquireWinrtDisplayNV(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkAcquireWinrtDisplayNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(physicalDevice.address(), display, __functionAddress);
    }

    // --- [ vkGetWinrtDisplayNV ] ---

    /** {@code VkResult vkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, uint32_t deviceRelativeId, VkDisplayKHR * pDisplay)} */
    public static int nvkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, int deviceRelativeId, long pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetWinrtDisplayNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(physicalDevice.address(), deviceRelativeId, pDisplay, __functionAddress);
    }

    /** {@code VkResult vkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, uint32_t deviceRelativeId, VkDisplayKHR * pDisplay)} */
    @NativeType("VkResult")
    public static int vkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int deviceRelativeId, @NativeType("VkDisplayKHR *") LongBuffer pDisplay) {
        if (CHECKS) {
            check(pDisplay, 1);
        }
        return nvkGetWinrtDisplayNV(physicalDevice, deviceRelativeId, memAddress(pDisplay));
    }

    /** {@code VkResult vkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, uint32_t deviceRelativeId, VkDisplayKHR * pDisplay)} */
    @NativeType("VkResult")
    public static int vkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int deviceRelativeId, @NativeType("VkDisplayKHR *") long[] pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetWinrtDisplayNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pDisplay, 1);
        }
        return callPPI(physicalDevice.address(), deviceRelativeId, pDisplay, __functionAddress);
    }

}