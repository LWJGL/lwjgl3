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

public class KHRDeviceFault {

    public static final int VK_KHR_DEVICE_FAULT_SPEC_VERSION = 1;

    public static final String VK_KHR_DEVICE_FAULT_EXTENSION_NAME = "VK_KHR_device_fault";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_KHR   = 1000573000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_PROPERTIES_KHR = 1000573001,
        VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_KHR                = 1000573002,
        VK_STRUCTURE_TYPE_DEVICE_FAULT_DEBUG_INFO_KHR          = 1000573003;

    public static final int
        VK_DEVICE_FAULT_FLAG_DEVICE_LOST_KHR         = 0x1,
        VK_DEVICE_FAULT_FLAG_MEMORY_ADDRESS_KHR      = 0x2,
        VK_DEVICE_FAULT_FLAG_INSTRUCTION_ADDRESS_KHR = 0x4,
        VK_DEVICE_FAULT_FLAG_VENDOR_KHR              = 0x8,
        VK_DEVICE_FAULT_FLAG_WATCHDOG_TIMEOUT_KHR    = 0x10,
        VK_DEVICE_FAULT_FLAG_OVERFLOW_KHR            = 0x20;

    protected KHRDeviceFault() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDeviceFaultReportsKHR ] ---

    /** {@code VkResult vkGetDeviceFaultReportsKHR(VkDevice device, uint64_t timeout, uint32_t * pFaultCounts, VkDeviceFaultInfoKHR * pFaultInfo)} */
    public static int nvkGetDeviceFaultReportsKHR(VkDevice device, long timeout, long pFaultCounts, long pFaultInfo) {
        long __functionAddress = device.getCapabilities().vkGetDeviceFaultReportsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), timeout, pFaultCounts, pFaultInfo, __functionAddress);
    }

    /** {@code VkResult vkGetDeviceFaultReportsKHR(VkDevice device, uint64_t timeout, uint32_t * pFaultCounts, VkDeviceFaultInfoKHR * pFaultInfo)} */
    @NativeType("VkResult")
    public static int vkGetDeviceFaultReportsKHR(VkDevice device, @NativeType("uint64_t") long timeout, @NativeType("uint32_t *") IntBuffer pFaultCounts, @NativeType("VkDeviceFaultInfoKHR *") VkDeviceFaultInfoKHR.@Nullable Buffer pFaultInfo) {
        if (CHECKS) {
            check(pFaultCounts, 1);
            checkSafe(pFaultInfo, pFaultCounts.get(pFaultCounts.position()));
        }
        return nvkGetDeviceFaultReportsKHR(device, timeout, memAddress(pFaultCounts), memAddressSafe(pFaultInfo));
    }

    // --- [ vkGetDeviceFaultDebugInfoKHR ] ---

    /** {@code VkResult vkGetDeviceFaultDebugInfoKHR(VkDevice device, VkDeviceFaultDebugInfoKHR * pDebugInfo)} */
    public static int nvkGetDeviceFaultDebugInfoKHR(VkDevice device, long pDebugInfo) {
        long __functionAddress = device.getCapabilities().vkGetDeviceFaultDebugInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pDebugInfo, __functionAddress);
    }

    /** {@code VkResult vkGetDeviceFaultDebugInfoKHR(VkDevice device, VkDeviceFaultDebugInfoKHR * pDebugInfo)} */
    @NativeType("VkResult")
    public static int vkGetDeviceFaultDebugInfoKHR(VkDevice device, @NativeType("VkDeviceFaultDebugInfoKHR *") VkDeviceFaultDebugInfoKHR pDebugInfo) {
        return nvkGetDeviceFaultDebugInfoKHR(device, pDebugInfo.address());
    }

    /** {@code VkResult vkGetDeviceFaultReportsKHR(VkDevice device, uint64_t timeout, uint32_t * pFaultCounts, VkDeviceFaultInfoKHR * pFaultInfo)} */
    @NativeType("VkResult")
    public static int vkGetDeviceFaultReportsKHR(VkDevice device, @NativeType("uint64_t") long timeout, @NativeType("uint32_t *") int[] pFaultCounts, @NativeType("VkDeviceFaultInfoKHR *") VkDeviceFaultInfoKHR.@Nullable Buffer pFaultInfo) {
        long __functionAddress = device.getCapabilities().vkGetDeviceFaultReportsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pFaultCounts, 1);
            checkSafe(pFaultInfo, pFaultCounts[0]);
        }
        return callPJPPI(device.address(), timeout, pFaultCounts, memAddressSafe(pFaultInfo), __functionAddress);
    }

}