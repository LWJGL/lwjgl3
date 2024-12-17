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

public class EXTPrivateData {

    public static final int VK_EXT_PRIVATE_DATA_SPEC_VERSION = 1;

    public static final String VK_EXT_PRIVATE_DATA_EXTENSION_NAME = "VK_EXT_private_data";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT = 1000295000,
        VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT       = 1000295001,
        VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT         = 1000295002;

    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT = 1000295000;

    protected EXTPrivateData() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreatePrivateDataSlotEXT ] ---

    /** {@code VkResult vkCreatePrivateDataSlotEXT(VkDevice device, VkPrivateDataSlotCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPrivateDataSlot * pPrivateDataSlot)} */
    public static int nvkCreatePrivateDataSlotEXT(VkDevice device, long pCreateInfo, long pAllocator, long pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlotEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pPrivateDataSlot, __functionAddress);
    }

    /** {@code VkResult vkCreatePrivateDataSlotEXT(VkDevice device, VkPrivateDataSlotCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPrivateDataSlot * pPrivateDataSlot)} */
    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlotEXT(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfo const *") VkPrivateDataSlotCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlot *") LongBuffer pPrivateDataSlot) {
        if (CHECKS) {
            check(pPrivateDataSlot, 1);
        }
        return nvkCreatePrivateDataSlotEXT(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pPrivateDataSlot));
    }

    // --- [ vkDestroyPrivateDataSlotEXT ] ---

    /** {@code void vkDestroyPrivateDataSlotEXT(VkDevice device, VkPrivateDataSlot privateDataSlot, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyPrivateDataSlotEXT(VkDevice device, long privateDataSlot, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPrivateDataSlotEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), privateDataSlot, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyPrivateDataSlotEXT(VkDevice device, VkPrivateDataSlot privateDataSlot, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyPrivateDataSlotEXT(VkDevice device, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyPrivateDataSlotEXT(device, privateDataSlot, memAddressSafe(pAllocator));
    }

    // --- [ vkSetPrivateDataEXT ] ---

    /** {@code VkResult vkSetPrivateDataEXT(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t data)} */
    @NativeType("VkResult")
    public static int vkSetPrivateDataEXT(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t") long data) {
        long __functionAddress = device.getCapabilities().vkSetPrivateDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJJI(device.address(), objectType, objectHandle, privateDataSlot, data, __functionAddress);
    }

    // --- [ vkGetPrivateDataEXT ] ---

    /** {@code void vkGetPrivateDataEXT(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t * pData)} */
    public static void nvkGetPrivateDataEXT(VkDevice device, int objectType, long objectHandle, long privateDataSlot, long pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

    /** {@code void vkGetPrivateDataEXT(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t * pData)} */
    public static void vkGetPrivateDataEXT(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t *") LongBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        nvkGetPrivateDataEXT(device, objectType, objectHandle, privateDataSlot, memAddress(pData));
    }

    /** {@code VkResult vkCreatePrivateDataSlotEXT(VkDevice device, VkPrivateDataSlotCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPrivateDataSlot * pPrivateDataSlot)} */
    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlotEXT(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfo const *") VkPrivateDataSlotCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlot *") long[] pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlotEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pPrivateDataSlot, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pPrivateDataSlot, __functionAddress);
    }

    /** {@code void vkGetPrivateDataEXT(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t * pData)} */
    public static void vkGetPrivateDataEXT(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t *") long[] pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateDataEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pData, 1);
        }
        callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

}