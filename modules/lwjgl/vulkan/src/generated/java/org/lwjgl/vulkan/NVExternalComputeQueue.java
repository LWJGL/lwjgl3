/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVExternalComputeQueue {

    public static final int VK_NV_EXTERNAL_COMPUTE_QUEUE_SPEC_VERSION = 1;

    public static final String VK_NV_EXTERNAL_COMPUTE_QUEUE_EXTENSION_NAME = "VK_NV_external_compute_queue";

    public static final int
        VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV         = 1000556000,
        VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV                = 1000556001,
        VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DATA_PARAMS_NV                = 1000556002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_COMPUTE_QUEUE_PROPERTIES_NV = 1000556003;

    public static final int VK_OBJECT_TYPE_EXTERNAL_COMPUTE_QUEUE_NV = 1000556000;

    protected NVExternalComputeQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateExternalComputeQueueNV ] ---

    /** {@code VkResult vkCreateExternalComputeQueueNV(VkDevice device, VkExternalComputeQueueCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkExternalComputeQueueNV * pExternalQueue)} */
    public static int nvkCreateExternalComputeQueueNV(VkDevice device, long pCreateInfo, long pAllocator, long pExternalQueue) {
        long __functionAddress = device.getCapabilities().vkCreateExternalComputeQueueNV;
        if (CHECKS) {
            check(__functionAddress);
            VkExternalComputeQueueCreateInfoNV.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pExternalQueue, __functionAddress);
    }

    /** {@code VkResult vkCreateExternalComputeQueueNV(VkDevice device, VkExternalComputeQueueCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkExternalComputeQueueNV * pExternalQueue)} */
    @NativeType("VkResult")
    public static int vkCreateExternalComputeQueueNV(VkDevice device, @NativeType("VkExternalComputeQueueCreateInfoNV const *") VkExternalComputeQueueCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkExternalComputeQueueNV *") PointerBuffer pExternalQueue) {
        if (CHECKS) {
            check(pExternalQueue, 1);
        }
        return nvkCreateExternalComputeQueueNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pExternalQueue));
    }

    // --- [ vkDestroyExternalComputeQueueNV ] ---

    /** {@code void vkDestroyExternalComputeQueueNV(VkDevice device, VkExternalComputeQueueNV externalQueue, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyExternalComputeQueueNV(VkDevice device, VkExternalComputeQueueNV externalQueue, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyExternalComputeQueueNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), externalQueue.address(), pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyExternalComputeQueueNV(VkDevice device, VkExternalComputeQueueNV externalQueue, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyExternalComputeQueueNV(VkDevice device, VkExternalComputeQueueNV externalQueue, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyExternalComputeQueueNV(device, externalQueue, memAddressSafe(pAllocator));
    }

    // --- [ vkGetExternalComputeQueueDataNV ] ---

    /** {@code void vkGetExternalComputeQueueDataNV(VkExternalComputeQueueNV externalQueue, VkExternalComputeQueueDataParamsNV * params, void * pData)} */
    public static void nvkGetExternalComputeQueueDataNV(VkExternalComputeQueueNV externalQueue, long params, long pData) {
        long __functionAddress = externalQueue.getCapabilities().vkGetExternalComputeQueueDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(externalQueue.address(), params, pData, __functionAddress);
    }

    /** {@code void vkGetExternalComputeQueueDataNV(VkExternalComputeQueueNV externalQueue, VkExternalComputeQueueDataParamsNV * params, void * pData)} */
    public static void vkGetExternalComputeQueueDataNV(VkExternalComputeQueueNV externalQueue, @NativeType("VkExternalComputeQueueDataParamsNV *") VkExternalComputeQueueDataParamsNV params, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        nvkGetExternalComputeQueueDataNV(externalQueue, params.address(), memAddress(pData));
    }

}