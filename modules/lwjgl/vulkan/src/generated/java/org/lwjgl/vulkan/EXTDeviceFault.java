/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTDeviceFault {

    public static final int VK_EXT_DEVICE_FAULT_SPEC_VERSION = 2;

    public static final String VK_EXT_DEVICE_FAULT_EXTENSION_NAME = "VK_EXT_device_fault";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT = 1000341000,
        VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT            = 1000341001,
        VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT              = 1000341002;

    public static final int
        VK_DEVICE_FAULT_ADDRESS_TYPE_NONE_EXT                        = 0,
        VK_DEVICE_FAULT_ADDRESS_TYPE_READ_INVALID_EXT                = 1,
        VK_DEVICE_FAULT_ADDRESS_TYPE_WRITE_INVALID_EXT               = 2,
        VK_DEVICE_FAULT_ADDRESS_TYPE_EXECUTE_INVALID_EXT             = 3,
        VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_UNKNOWN_EXT = 4,
        VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_INVALID_EXT = 5,
        VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_FAULT_EXT   = 6;

    public static final int VK_DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT = 1;

    protected EXTDeviceFault() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDeviceFaultInfoEXT ] ---

    /** {@code VkResult vkGetDeviceFaultInfoEXT(VkDevice device, VkDeviceFaultCountsEXT * pFaultCounts, VkDeviceFaultInfoEXT * pFaultInfo)} */
    public static int nvkGetDeviceFaultInfoEXT(VkDevice device, long pFaultCounts, long pFaultInfo) {
        long __functionAddress = device.getCapabilities().vkGetDeviceFaultInfoEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pFaultCounts, pFaultInfo, __functionAddress);
    }

    /** {@code VkResult vkGetDeviceFaultInfoEXT(VkDevice device, VkDeviceFaultCountsEXT * pFaultCounts, VkDeviceFaultInfoEXT * pFaultInfo)} */
    @NativeType("VkResult")
    public static int vkGetDeviceFaultInfoEXT(VkDevice device, @NativeType("VkDeviceFaultCountsEXT *") VkDeviceFaultCountsEXT pFaultCounts, @NativeType("VkDeviceFaultInfoEXT *") @Nullable VkDeviceFaultInfoEXT pFaultInfo) {
        return nvkGetDeviceFaultInfoEXT(device, pFaultCounts.address(), memAddressSafe(pFaultInfo));
    }

}