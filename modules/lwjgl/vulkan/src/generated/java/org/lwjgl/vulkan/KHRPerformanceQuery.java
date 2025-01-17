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

public class KHRPerformanceQuery {

    public static final int VK_KHR_PERFORMANCE_QUERY_SPEC_VERSION = 1;

    public static final String VK_KHR_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_KHR_performance_query";

    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR = 1000116000;

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR   = 1000116000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR = 1000116001,
        VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR           = 1000116002,
        VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR                = 1000116003,
        VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR                  = 1000116004,
        VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR                          = 1000116005,
        VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR              = 1000116006;

    public static final int
        VK_PERFORMANCE_COUNTER_UNIT_GENERIC_KHR          = 0,
        VK_PERFORMANCE_COUNTER_UNIT_PERCENTAGE_KHR       = 1,
        VK_PERFORMANCE_COUNTER_UNIT_NANOSECONDS_KHR      = 2,
        VK_PERFORMANCE_COUNTER_UNIT_BYTES_KHR            = 3,
        VK_PERFORMANCE_COUNTER_UNIT_BYTES_PER_SECOND_KHR = 4,
        VK_PERFORMANCE_COUNTER_UNIT_KELVIN_KHR           = 5,
        VK_PERFORMANCE_COUNTER_UNIT_WATTS_KHR            = 6,
        VK_PERFORMANCE_COUNTER_UNIT_VOLTS_KHR            = 7,
        VK_PERFORMANCE_COUNTER_UNIT_AMPS_KHR             = 8,
        VK_PERFORMANCE_COUNTER_UNIT_HERTZ_KHR            = 9,
        VK_PERFORMANCE_COUNTER_UNIT_CYCLES_KHR           = 10;

    public static final int
        VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR = 0,
        VK_QUERY_SCOPE_COMMAND_BUFFER_KHR               = 0,
        VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR    = 1,
        VK_QUERY_SCOPE_RENDER_PASS_KHR                  = 1,
        VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR        = 2,
        VK_QUERY_SCOPE_COMMAND_KHR                      = 2;

    public static final int
        VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR   = 0,
        VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR   = 1,
        VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR  = 2,
        VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR  = 3,
        VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR = 4,
        VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR = 5;

    public static final int
        VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_BIT_KHR = 0x1,
        VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_KHR     = 0x1,
        VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_BIT_KHR = 0x2,
        VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_KHR     = 0x2;

    protected KHRPerformanceQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR ] ---

    /** {@code VkResult vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t * pCounterCount, VkPerformanceCounterKHR * pCounters, VkPerformanceCounterDescriptionKHR * pCounterDescriptions)} */
    public static int nvkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long pCounterCount, long pCounters, long pCounterDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), queueFamilyIndex, pCounterCount, pCounters, pCounterDescriptions, __functionAddress);
    }

    /** {@code VkResult vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t * pCounterCount, VkPerformanceCounterKHR * pCounters, VkPerformanceCounterDescriptionKHR * pCounterDescriptions)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") IntBuffer pCounterCount, @NativeType("VkPerformanceCounterKHR *") VkPerformanceCounterKHR.@Nullable Buffer pCounters, @NativeType("VkPerformanceCounterDescriptionKHR *") VkPerformanceCounterDescriptionKHR.@Nullable Buffer pCounterDescriptions) {
        if (CHECKS) {
            check(pCounterCount, 1);
            checkSafe(pCounters, pCounterCount.get(pCounterCount.position()));
            checkSafe(pCounterDescriptions, pCounterCount.get(pCounterCount.position()));
        }
        return nvkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(physicalDevice, queueFamilyIndex, memAddress(pCounterCount), memAddressSafe(pCounters), memAddressSafe(pCounterDescriptions));
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR ] ---

    /** {@code void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, VkQueryPoolPerformanceCreateInfoKHR const * pPerformanceQueryCreateInfo, uint32_t * pNumPasses)} */
    public static void nvkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, long pPerformanceQueryCreateInfo, long pNumPasses) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkQueryPoolPerformanceCreateInfoKHR.validate(pPerformanceQueryCreateInfo);
        }
        callPPPV(physicalDevice.address(), pPerformanceQueryCreateInfo, pNumPasses, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, VkQueryPoolPerformanceCreateInfoKHR const * pPerformanceQueryCreateInfo, uint32_t * pNumPasses)} */
    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkQueryPoolPerformanceCreateInfoKHR const *") VkQueryPoolPerformanceCreateInfoKHR pPerformanceQueryCreateInfo, @NativeType("uint32_t *") IntBuffer pNumPasses) {
        if (CHECKS) {
            check(pNumPasses, 1);
        }
        nvkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(physicalDevice, pPerformanceQueryCreateInfo.address(), memAddress(pNumPasses));
    }

    // --- [ vkAcquireProfilingLockKHR ] ---

    /** {@code VkResult vkAcquireProfilingLockKHR(VkDevice device, VkAcquireProfilingLockInfoKHR const * pInfo)} */
    public static int nvkAcquireProfilingLockKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkAcquireProfilingLockKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pInfo, __functionAddress);
    }

    /** {@code VkResult vkAcquireProfilingLockKHR(VkDevice device, VkAcquireProfilingLockInfoKHR const * pInfo)} */
    @NativeType("VkResult")
    public static int vkAcquireProfilingLockKHR(VkDevice device, @NativeType("VkAcquireProfilingLockInfoKHR const *") VkAcquireProfilingLockInfoKHR pInfo) {
        return nvkAcquireProfilingLockKHR(device, pInfo.address());
    }

    // --- [ vkReleaseProfilingLockKHR ] ---

    /** {@code void vkReleaseProfilingLockKHR(VkDevice device)} */
    public static void vkReleaseProfilingLockKHR(VkDevice device) {
        long __functionAddress = device.getCapabilities().vkReleaseProfilingLockKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(device.address(), __functionAddress);
    }

    /** {@code VkResult vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t * pCounterCount, VkPerformanceCounterKHR * pCounters, VkPerformanceCounterDescriptionKHR * pCounterDescriptions)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") int[] pCounterCount, @NativeType("VkPerformanceCounterKHR *") VkPerformanceCounterKHR.@Nullable Buffer pCounters, @NativeType("VkPerformanceCounterDescriptionKHR *") VkPerformanceCounterDescriptionKHR.@Nullable Buffer pCounterDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pCounterCount, 1);
            checkSafe(pCounters, pCounterCount[0]);
            checkSafe(pCounterDescriptions, pCounterCount[0]);
        }
        return callPPPPI(physicalDevice.address(), queueFamilyIndex, pCounterCount, memAddressSafe(pCounters), memAddressSafe(pCounterDescriptions), __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, VkQueryPoolPerformanceCreateInfoKHR const * pPerformanceQueryCreateInfo, uint32_t * pNumPasses)} */
    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkQueryPoolPerformanceCreateInfoKHR const *") VkQueryPoolPerformanceCreateInfoKHR pPerformanceQueryCreateInfo, @NativeType("uint32_t *") int[] pNumPasses) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pNumPasses, 1);
            VkQueryPoolPerformanceCreateInfoKHR.validate(pPerformanceQueryCreateInfo.address());
        }
        callPPPV(physicalDevice.address(), pPerformanceQueryCreateInfo.address(), pNumPasses, __functionAddress);
    }

}