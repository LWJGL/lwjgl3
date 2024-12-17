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

public class KHRDeferredHostOperations {

    public static final int VK_KHR_DEFERRED_HOST_OPERATIONS_SPEC_VERSION = 4;

    public static final String VK_KHR_DEFERRED_HOST_OPERATIONS_EXTENSION_NAME = "VK_KHR_deferred_host_operations";

    public static final int VK_OBJECT_TYPE_DEFERRED_OPERATION_KHR = 1000268000;

    public static final int
        VK_THREAD_IDLE_KHR            = 1000268000,
        VK_THREAD_DONE_KHR            = 1000268001,
        VK_OPERATION_DEFERRED_KHR     = 1000268002,
        VK_OPERATION_NOT_DEFERRED_KHR = 1000268003;

    protected KHRDeferredHostOperations() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateDeferredOperationKHR ] ---

    /** {@code VkResult vkCreateDeferredOperationKHR(VkDevice device, VkAllocationCallbacks const * pAllocator, VkDeferredOperationKHR * pDeferredOperation)} */
    public static int nvkCreateDeferredOperationKHR(VkDevice device, long pAllocator, long pDeferredOperation) {
        long __functionAddress = device.getCapabilities().vkCreateDeferredOperationKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pAllocator, pDeferredOperation, __functionAddress);
    }

    /** {@code VkResult vkCreateDeferredOperationKHR(VkDevice device, VkAllocationCallbacks const * pAllocator, VkDeferredOperationKHR * pDeferredOperation)} */
    @NativeType("VkResult")
    public static int vkCreateDeferredOperationKHR(VkDevice device, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDeferredOperationKHR *") LongBuffer pDeferredOperation) {
        if (CHECKS) {
            check(pDeferredOperation, 1);
        }
        return nvkCreateDeferredOperationKHR(device, memAddressSafe(pAllocator), memAddress(pDeferredOperation));
    }

    // --- [ vkDestroyDeferredOperationKHR ] ---

    /** {@code void vkDestroyDeferredOperationKHR(VkDevice device, VkDeferredOperationKHR operation, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyDeferredOperationKHR(VkDevice device, long operation, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDeferredOperationKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), operation, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyDeferredOperationKHR(VkDevice device, VkDeferredOperationKHR operation, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyDeferredOperationKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long operation, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyDeferredOperationKHR(device, operation, memAddressSafe(pAllocator));
    }

    // --- [ vkGetDeferredOperationMaxConcurrencyKHR ] ---

    /** {@code uint32_t vkGetDeferredOperationMaxConcurrencyKHR(VkDevice device, VkDeferredOperationKHR operation)} */
    @NativeType("uint32_t")
    public static int vkGetDeferredOperationMaxConcurrencyKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long operation) {
        long __functionAddress = device.getCapabilities().vkGetDeferredOperationMaxConcurrencyKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), operation, __functionAddress);
    }

    // --- [ vkGetDeferredOperationResultKHR ] ---

    /** {@code VkResult vkGetDeferredOperationResultKHR(VkDevice device, VkDeferredOperationKHR operation)} */
    @NativeType("VkResult")
    public static int vkGetDeferredOperationResultKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long operation) {
        long __functionAddress = device.getCapabilities().vkGetDeferredOperationResultKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), operation, __functionAddress);
    }

    // --- [ vkDeferredOperationJoinKHR ] ---

    /** {@code VkResult vkDeferredOperationJoinKHR(VkDevice device, VkDeferredOperationKHR operation)} */
    @NativeType("VkResult")
    public static int vkDeferredOperationJoinKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long operation) {
        long __functionAddress = device.getCapabilities().vkDeferredOperationJoinKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), operation, __functionAddress);
    }

    /** {@code VkResult vkCreateDeferredOperationKHR(VkDevice device, VkAllocationCallbacks const * pAllocator, VkDeferredOperationKHR * pDeferredOperation)} */
    @NativeType("VkResult")
    public static int vkCreateDeferredOperationKHR(VkDevice device, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDeferredOperationKHR *") long[] pDeferredOperation) {
        long __functionAddress = device.getCapabilities().vkCreateDeferredOperationKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pDeferredOperation, 1);
        }
        return callPPPI(device.address(), memAddressSafe(pAllocator), pDeferredOperation, __functionAddress);
    }

}