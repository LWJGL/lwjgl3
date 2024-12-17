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

public class NVCoverageReductionMode {

    public static final int VK_NV_COVERAGE_REDUCTION_MODE_SPEC_VERSION = 1;

    public static final String VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME = "VK_NV_coverage_reduction_mode";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV = 1000250000,
        VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV    = 1000250001,
        VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV            = 1000250002;

    public static final int
        VK_COVERAGE_REDUCTION_MODE_MERGE_NV    = 0,
        VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV = 1;

    protected NVCoverageReductionMode() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV ] ---

    /** {@code VkResult vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, uint32_t * pCombinationCount, VkFramebufferMixedSamplesCombinationNV * pCombinations)} */
    public static int nvkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, long pCombinationCount, long pCombinations) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pCombinationCount, pCombinations, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, uint32_t * pCombinationCount, VkFramebufferMixedSamplesCombinationNV * pCombinations)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pCombinationCount, @NativeType("VkFramebufferMixedSamplesCombinationNV *") VkFramebufferMixedSamplesCombinationNV.@Nullable Buffer pCombinations) {
        if (CHECKS) {
            check(pCombinationCount, 1);
            checkSafe(pCombinations, pCombinationCount.get(pCombinationCount.position()));
        }
        return nvkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(physicalDevice, memAddress(pCombinationCount), memAddressSafe(pCombinations));
    }

    /** {@code VkResult vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, uint32_t * pCombinationCount, VkFramebufferMixedSamplesCombinationNV * pCombinations)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pCombinationCount, @NativeType("VkFramebufferMixedSamplesCombinationNV *") VkFramebufferMixedSamplesCombinationNV.@Nullable Buffer pCombinations) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pCombinationCount, 1);
            checkSafe(pCombinations, pCombinationCount[0]);
        }
        return callPPPI(physicalDevice.address(), pCombinationCount, memAddressSafe(pCombinations), __functionAddress);
    }

}