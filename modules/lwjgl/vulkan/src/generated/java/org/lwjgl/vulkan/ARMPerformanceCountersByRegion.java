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

public class ARMPerformanceCountersByRegion {

    public static final int VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_SPEC_VERSION = 1;

    public static final String VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_EXTENSION_NAME = "VK_ARM_performance_counters_by_region";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM   = 1000605000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_PROPERTIES_ARM = 1000605001,
        VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_ARM                                       = 1000605002,
        VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_ARM                           = 1000605003,
        VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM     = 1000605004;

    protected ARMPerformanceCountersByRegion() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM ] ---

    /** {@code VkResult vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t * pCounterCount, VkPerformanceCounterARM * pCounters, VkPerformanceCounterDescriptionARM * pCounterDescriptions)} */
    public static int nvkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long pCounterCount, long pCounters, long pCounterDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), queueFamilyIndex, pCounterCount, pCounters, pCounterDescriptions, __functionAddress);
    }

    /** {@code VkResult vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t * pCounterCount, VkPerformanceCounterARM * pCounters, VkPerformanceCounterDescriptionARM * pCounterDescriptions)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") IntBuffer pCounterCount, @NativeType("VkPerformanceCounterARM *") VkPerformanceCounterARM.@Nullable Buffer pCounters, @NativeType("VkPerformanceCounterDescriptionARM *") VkPerformanceCounterDescriptionARM.@Nullable Buffer pCounterDescriptions) {
        if (CHECKS) {
            check(pCounterCount, 1);
            checkSafe(pCounters, pCounterCount.get(pCounterCount.position()));
            checkSafe(pCounterDescriptions, pCounterCount.get(pCounterCount.position()));
        }
        return nvkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(physicalDevice, queueFamilyIndex, memAddress(pCounterCount), memAddressSafe(pCounters), memAddressSafe(pCounterDescriptions));
    }

    /** {@code VkResult vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t * pCounterCount, VkPerformanceCounterARM * pCounters, VkPerformanceCounterDescriptionARM * pCounterDescriptions)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") int[] pCounterCount, @NativeType("VkPerformanceCounterARM *") VkPerformanceCounterARM.@Nullable Buffer pCounters, @NativeType("VkPerformanceCounterDescriptionARM *") VkPerformanceCounterDescriptionARM.@Nullable Buffer pCounterDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pCounterCount, 1);
            checkSafe(pCounters, pCounterCount[0]);
            checkSafe(pCounterDescriptions, pCounterCount[0]);
        }
        return callPPPPI(physicalDevice.address(), queueFamilyIndex, pCounterCount, memAddressSafe(pCounters), memAddressSafe(pCounterDescriptions), __functionAddress);
    }

}