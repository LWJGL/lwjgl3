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

public class KHRPipelineBinary {

    public static final int VK_KHR_PIPELINE_BINARY_SPEC_VERSION = 1;

    public static final String VK_KHR_PIPELINE_BINARY_EXTENSION_NAME = "VK_KHR_pipeline_binary";

    public static final int VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR = 32;

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR      = 1000483000,
        VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR                   = 1000483001,
        VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR                          = 1000483002,
        VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR                           = 1000483003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR    = 1000483004,
        VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR           = 1000483005,
        VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR                     = 1000483006,
        VK_STRUCTURE_TYPE_PIPELINE_CREATE_INFO_KHR                          = 1000483007,
        VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR = 1000483008,
        VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR                  = 1000483009;

    public static final int VK_OBJECT_TYPE_PIPELINE_BINARY_KHR = 1000483000;

    public static final int
        VK_PIPELINE_BINARY_MISSING_KHR = 1000483000,
        VK_ERROR_NOT_ENOUGH_SPACE_KHR  = -1000483000;

    public static final long VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR = 0x80000000L;

    protected KHRPipelineBinary() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreatePipelineBinariesKHR ] ---

    /** {@code VkResult vkCreatePipelineBinariesKHR(VkDevice device, VkPipelineBinaryCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPipelineBinaryHandlesInfoKHR * pBinaries)} */
    public static int nvkCreatePipelineBinariesKHR(VkDevice device, long pCreateInfo, long pAllocator, long pBinaries) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineBinariesKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPipelineBinaryCreateInfoKHR.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pBinaries, __functionAddress);
    }

    /** {@code VkResult vkCreatePipelineBinariesKHR(VkDevice device, VkPipelineBinaryCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPipelineBinaryHandlesInfoKHR * pBinaries)} */
    @NativeType("VkResult")
    public static int vkCreatePipelineBinariesKHR(VkDevice device, @NativeType("VkPipelineBinaryCreateInfoKHR const *") VkPipelineBinaryCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipelineBinaryHandlesInfoKHR *") VkPipelineBinaryHandlesInfoKHR pBinaries) {
        return nvkCreatePipelineBinariesKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), pBinaries.address());
    }

    // --- [ vkDestroyPipelineBinaryKHR ] ---

    /** {@code void vkDestroyPipelineBinaryKHR(VkDevice device, VkPipelineBinaryKHR pipelineBinary, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyPipelineBinaryKHR(VkDevice device, long pipelineBinary, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPipelineBinaryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), pipelineBinary, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyPipelineBinaryKHR(VkDevice device, VkPipelineBinaryKHR pipelineBinary, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyPipelineBinaryKHR(VkDevice device, @NativeType("VkPipelineBinaryKHR") long pipelineBinary, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyPipelineBinaryKHR(device, pipelineBinary, memAddressSafe(pAllocator));
    }

    // --- [ vkGetPipelineKeyKHR ] ---

    /** {@code VkResult vkGetPipelineKeyKHR(VkDevice device, VkPipelineCreateInfoKHR const * pPipelineCreateInfo, VkPipelineBinaryKeyKHR * pPipelineKey)} */
    public static int nvkGetPipelineKeyKHR(VkDevice device, long pPipelineCreateInfo, long pPipelineKey) {
        long __functionAddress = device.getCapabilities().vkGetPipelineKeyKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pPipelineCreateInfo, pPipelineKey, __functionAddress);
    }

    /** {@code VkResult vkGetPipelineKeyKHR(VkDevice device, VkPipelineCreateInfoKHR const * pPipelineCreateInfo, VkPipelineBinaryKeyKHR * pPipelineKey)} */
    @NativeType("VkResult")
    public static int vkGetPipelineKeyKHR(VkDevice device, @NativeType("VkPipelineCreateInfoKHR const *") @Nullable VkPipelineCreateInfoKHR pPipelineCreateInfo, @NativeType("VkPipelineBinaryKeyKHR *") VkPipelineBinaryKeyKHR pPipelineKey) {
        return nvkGetPipelineKeyKHR(device, memAddressSafe(pPipelineCreateInfo), pPipelineKey.address());
    }

    // --- [ vkGetPipelineBinaryDataKHR ] ---

    /** {@code VkResult vkGetPipelineBinaryDataKHR(VkDevice device, VkPipelineBinaryDataInfoKHR const * pInfo, VkPipelineBinaryKeyKHR * pPipelineBinaryKey, size_t * pPipelineBinaryDataSize, void * pPipelineBinaryData)} */
    public static int nvkGetPipelineBinaryDataKHR(VkDevice device, long pInfo, long pPipelineBinaryKey, long pPipelineBinaryDataSize, long pPipelineBinaryData) {
        long __functionAddress = device.getCapabilities().vkGetPipelineBinaryDataKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), pInfo, pPipelineBinaryKey, pPipelineBinaryDataSize, pPipelineBinaryData, __functionAddress);
    }

    /** {@code VkResult vkGetPipelineBinaryDataKHR(VkDevice device, VkPipelineBinaryDataInfoKHR const * pInfo, VkPipelineBinaryKeyKHR * pPipelineBinaryKey, size_t * pPipelineBinaryDataSize, void * pPipelineBinaryData)} */
    @NativeType("VkResult")
    public static int vkGetPipelineBinaryDataKHR(VkDevice device, @NativeType("VkPipelineBinaryDataInfoKHR const *") VkPipelineBinaryDataInfoKHR pInfo, @NativeType("VkPipelineBinaryKeyKHR *") VkPipelineBinaryKeyKHR pPipelineBinaryKey, @NativeType("size_t *") PointerBuffer pPipelineBinaryDataSize, @NativeType("void *") @Nullable ByteBuffer pPipelineBinaryData) {
        if (CHECKS) {
            check(pPipelineBinaryDataSize, 1);
            checkSafe(pPipelineBinaryData, pPipelineBinaryDataSize.get(pPipelineBinaryDataSize.position()));
        }
        return nvkGetPipelineBinaryDataKHR(device, pInfo.address(), pPipelineBinaryKey.address(), memAddress(pPipelineBinaryDataSize), memAddressSafe(pPipelineBinaryData));
    }

    // --- [ vkReleaseCapturedPipelineDataKHR ] ---

    /** {@code VkResult vkReleaseCapturedPipelineDataKHR(VkDevice device, VkReleaseCapturedPipelineDataInfoKHR const * pInfo, VkAllocationCallbacks const * pAllocator)} */
    public static int nvkReleaseCapturedPipelineDataKHR(VkDevice device, long pInfo, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkReleaseCapturedPipelineDataKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pAllocator, __functionAddress);
    }

    /** {@code VkResult vkReleaseCapturedPipelineDataKHR(VkDevice device, VkReleaseCapturedPipelineDataInfoKHR const * pInfo, VkAllocationCallbacks const * pAllocator)} */
    @NativeType("VkResult")
    public static int vkReleaseCapturedPipelineDataKHR(VkDevice device, @NativeType("VkReleaseCapturedPipelineDataInfoKHR const *") VkReleaseCapturedPipelineDataInfoKHR pInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        return nvkReleaseCapturedPipelineDataKHR(device, pInfo.address(), memAddressSafe(pAllocator));
    }

}