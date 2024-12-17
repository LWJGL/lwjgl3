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

public class EXTValidationCache {

    public static final int VK_EXT_VALIDATION_CACHE_SPEC_VERSION = 1;

    public static final String VK_EXT_VALIDATION_CACHE_EXTENSION_NAME = "VK_EXT_validation_cache";

    public static final int
        VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT               = 1000160000,
        VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT = 1000160001;

    public static final int VK_OBJECT_TYPE_VALIDATION_CACHE_EXT = 1000160000;

    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = 1;

    protected EXTValidationCache() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateValidationCacheEXT ] ---

    /** {@code VkResult vkCreateValidationCacheEXT(VkDevice device, VkValidationCacheCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkValidationCacheEXT * pValidationCache)} */
    public static int nvkCreateValidationCacheEXT(VkDevice device, long pCreateInfo, long pAllocator, long pValidationCache) {
        long __functionAddress = device.getCapabilities().vkCreateValidationCacheEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkValidationCacheCreateInfoEXT.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pValidationCache, __functionAddress);
    }

    /** {@code VkResult vkCreateValidationCacheEXT(VkDevice device, VkValidationCacheCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkValidationCacheEXT * pValidationCache)} */
    @NativeType("VkResult")
    public static int vkCreateValidationCacheEXT(VkDevice device, @NativeType("VkValidationCacheCreateInfoEXT const *") VkValidationCacheCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkValidationCacheEXT *") LongBuffer pValidationCache) {
        if (CHECKS) {
            check(pValidationCache, 1);
        }
        return nvkCreateValidationCacheEXT(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pValidationCache));
    }

    // --- [ vkDestroyValidationCacheEXT ] ---

    /** {@code void vkDestroyValidationCacheEXT(VkDevice device, VkValidationCacheEXT validationCache, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyValidationCacheEXT(VkDevice device, long validationCache, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyValidationCacheEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), validationCache, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyValidationCacheEXT(VkDevice device, VkValidationCacheEXT validationCache, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyValidationCacheEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long validationCache, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyValidationCacheEXT(device, validationCache, memAddressSafe(pAllocator));
    }

    // --- [ vkMergeValidationCachesEXT ] ---

    /** {@code VkResult vkMergeValidationCachesEXT(VkDevice device, VkValidationCacheEXT dstCache, uint32_t srcCacheCount, VkValidationCacheEXT const * pSrcCaches)} */
    public static int nvkMergeValidationCachesEXT(VkDevice device, long dstCache, int srcCacheCount, long pSrcCaches) {
        long __functionAddress = device.getCapabilities().vkMergeValidationCachesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), dstCache, srcCacheCount, pSrcCaches, __functionAddress);
    }

    /** {@code VkResult vkMergeValidationCachesEXT(VkDevice device, VkValidationCacheEXT dstCache, uint32_t srcCacheCount, VkValidationCacheEXT const * pSrcCaches)} */
    @NativeType("VkResult")
    public static int vkMergeValidationCachesEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long dstCache, @NativeType("VkValidationCacheEXT const *") LongBuffer pSrcCaches) {
        return nvkMergeValidationCachesEXT(device, dstCache, pSrcCaches.remaining(), memAddress(pSrcCaches));
    }

    // --- [ vkGetValidationCacheDataEXT ] ---

    /** {@code VkResult vkGetValidationCacheDataEXT(VkDevice device, VkValidationCacheEXT validationCache, size_t * pDataSize, void * pData)} */
    public static int nvkGetValidationCacheDataEXT(VkDevice device, long validationCache, long pDataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetValidationCacheDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), validationCache, pDataSize, pData, __functionAddress);
    }

    /** {@code VkResult vkGetValidationCacheDataEXT(VkDevice device, VkValidationCacheEXT validationCache, size_t * pDataSize, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetValidationCacheDataEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long validationCache, @NativeType("size_t *") PointerBuffer pDataSize, @NativeType("void *") @Nullable ByteBuffer pData) {
        if (CHECKS) {
            check(pDataSize, 1);
            checkSafe(pData, pDataSize.get(pDataSize.position()));
        }
        return nvkGetValidationCacheDataEXT(device, validationCache, memAddress(pDataSize), memAddressSafe(pData));
    }

    /** {@code VkResult vkCreateValidationCacheEXT(VkDevice device, VkValidationCacheCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkValidationCacheEXT * pValidationCache)} */
    @NativeType("VkResult")
    public static int vkCreateValidationCacheEXT(VkDevice device, @NativeType("VkValidationCacheCreateInfoEXT const *") VkValidationCacheCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkValidationCacheEXT *") long[] pValidationCache) {
        long __functionAddress = device.getCapabilities().vkCreateValidationCacheEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pValidationCache, 1);
            VkValidationCacheCreateInfoEXT.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pValidationCache, __functionAddress);
    }

    /** {@code VkResult vkMergeValidationCachesEXT(VkDevice device, VkValidationCacheEXT dstCache, uint32_t srcCacheCount, VkValidationCacheEXT const * pSrcCaches)} */
    @NativeType("VkResult")
    public static int vkMergeValidationCachesEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long dstCache, @NativeType("VkValidationCacheEXT const *") long[] pSrcCaches) {
        long __functionAddress = device.getCapabilities().vkMergeValidationCachesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), dstCache, pSrcCaches.length, pSrcCaches, __functionAddress);
    }

}