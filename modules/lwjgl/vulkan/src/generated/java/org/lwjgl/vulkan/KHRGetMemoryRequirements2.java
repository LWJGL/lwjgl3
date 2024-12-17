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

public class KHRGetMemoryRequirements2 {

    public static final int VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION = 1;

    public static final String VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME = "VK_KHR_get_memory_requirements2";

    public static final int
        VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR       = 1000146000,
        VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR        = 1000146001,
        VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR = 1000146002,
        VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR                   = 1000146003,
        VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR      = 1000146004;

    protected KHRGetMemoryRequirements2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetImageMemoryRequirements2KHR ] ---

    /** {@code void vkGetImageMemoryRequirements2KHR(VkDevice device, VkImageMemoryRequirementsInfo2 const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetImageMemoryRequirements2KHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetImageMemoryRequirements2KHR(VkDevice device, VkImageMemoryRequirementsInfo2 const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetImageMemoryRequirements2KHR(VkDevice device, @NativeType("VkImageMemoryRequirementsInfo2 const *") VkImageMemoryRequirementsInfo2 pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetImageMemoryRequirements2KHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetBufferMemoryRequirements2KHR ] ---

    /** {@code void vkGetBufferMemoryRequirements2KHR(VkDevice device, VkBufferMemoryRequirementsInfo2 const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetBufferMemoryRequirements2KHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetBufferMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetBufferMemoryRequirements2KHR(VkDevice device, VkBufferMemoryRequirementsInfo2 const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetBufferMemoryRequirements2KHR(VkDevice device, @NativeType("VkBufferMemoryRequirementsInfo2 const *") VkBufferMemoryRequirementsInfo2 pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetBufferMemoryRequirements2KHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetImageSparseMemoryRequirements2KHR ] ---

    /** {@code void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, VkImageSparseMemoryRequirementsInfo2 const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void nvkGetImageSparseMemoryRequirements2KHR(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, VkImageSparseMemoryRequirementsInfo2 const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, @NativeType("VkImageSparseMemoryRequirementsInfo2 const *") VkImageSparseMemoryRequirementsInfo2 pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.@Nullable Buffer pSparseMemoryRequirements) {
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetImageSparseMemoryRequirements2KHR(device, pInfo.address(), memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
    }

    /** {@code void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, VkImageSparseMemoryRequirementsInfo2 const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, @NativeType("VkImageSparseMemoryRequirementsInfo2 const *") VkImageSparseMemoryRequirementsInfo2 pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.@Nullable Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
        }
        callPPPPV(device.address(), pInfo.address(), pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

}