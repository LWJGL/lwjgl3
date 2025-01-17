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

public class EXTCalibratedTimestamps {

    public static final int VK_EXT_CALIBRATED_TIMESTAMPS_SPEC_VERSION = 2;

    public static final String VK_EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME = "VK_EXT_calibrated_timestamps";

    public static final int VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT = 1000184000;

    public static final int
        VK_TIME_DOMAIN_DEVICE_EXT                    = 0,
        VK_TIME_DOMAIN_DEVICE_KHR                    = 0,
        VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT           = 1,
        VK_TIME_DOMAIN_CLOCK_MONOTONIC_KHR           = 1,
        VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT       = 2,
        VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR       = 2,
        VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT = 3,
        VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR = 3;

    protected EXTCalibratedTimestamps() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceCalibrateableTimeDomainsEXT ] ---

    /** {@code VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, uint32_t * pTimeDomainCount, VkTimeDomainKHR * pTimeDomains)} */
    public static int nvkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, long pTimeDomainCount, long pTimeDomains) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCalibrateableTimeDomainsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pTimeDomainCount, pTimeDomains, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, uint32_t * pTimeDomainCount, VkTimeDomainKHR * pTimeDomains)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pTimeDomainCount, @NativeType("VkTimeDomainKHR *") @Nullable IntBuffer pTimeDomains) {
        if (CHECKS) {
            check(pTimeDomainCount, 1);
            checkSafe(pTimeDomains, pTimeDomainCount.get(pTimeDomainCount.position()));
        }
        return nvkGetPhysicalDeviceCalibrateableTimeDomainsEXT(physicalDevice, memAddress(pTimeDomainCount), memAddressSafe(pTimeDomains));
    }

    // --- [ vkGetCalibratedTimestampsEXT ] ---

    /** {@code VkResult vkGetCalibratedTimestampsEXT(VkDevice device, uint32_t timestampCount, VkCalibratedTimestampInfoKHR const * pTimestampInfos, uint64_t * pTimestamps, uint64_t * pMaxDeviation)} */
    public static int nvkGetCalibratedTimestampsEXT(VkDevice device, int timestampCount, long pTimestampInfos, long pTimestamps, long pMaxDeviation) {
        long __functionAddress = device.getCapabilities().vkGetCalibratedTimestampsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation, __functionAddress);
    }

    /** {@code VkResult vkGetCalibratedTimestampsEXT(VkDevice device, uint32_t timestampCount, VkCalibratedTimestampInfoKHR const * pTimestampInfos, uint64_t * pTimestamps, uint64_t * pMaxDeviation)} */
    @NativeType("VkResult")
    public static int vkGetCalibratedTimestampsEXT(VkDevice device, @NativeType("VkCalibratedTimestampInfoKHR const *") VkCalibratedTimestampInfoKHR.Buffer pTimestampInfos, @NativeType("uint64_t *") LongBuffer pTimestamps, @NativeType("uint64_t *") LongBuffer pMaxDeviation) {
        if (CHECKS) {
            check(pTimestamps, pTimestampInfos.remaining());
            check(pMaxDeviation, 1);
        }
        return nvkGetCalibratedTimestampsEXT(device, pTimestampInfos.remaining(), pTimestampInfos.address(), memAddress(pTimestamps), memAddress(pMaxDeviation));
    }

    /** {@code VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, uint32_t * pTimeDomainCount, VkTimeDomainKHR * pTimeDomains)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pTimeDomainCount, @NativeType("VkTimeDomainKHR *") int @Nullable [] pTimeDomains) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCalibrateableTimeDomainsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pTimeDomainCount, 1);
            checkSafe(pTimeDomains, pTimeDomainCount[0]);
        }
        return callPPPI(physicalDevice.address(), pTimeDomainCount, pTimeDomains, __functionAddress);
    }

    /** {@code VkResult vkGetCalibratedTimestampsEXT(VkDevice device, uint32_t timestampCount, VkCalibratedTimestampInfoKHR const * pTimestampInfos, uint64_t * pTimestamps, uint64_t * pMaxDeviation)} */
    @NativeType("VkResult")
    public static int vkGetCalibratedTimestampsEXT(VkDevice device, @NativeType("VkCalibratedTimestampInfoKHR const *") VkCalibratedTimestampInfoKHR.Buffer pTimestampInfos, @NativeType("uint64_t *") long[] pTimestamps, @NativeType("uint64_t *") long[] pMaxDeviation) {
        long __functionAddress = device.getCapabilities().vkGetCalibratedTimestampsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pTimestamps, pTimestampInfos.remaining());
            check(pMaxDeviation, 1);
        }
        return callPPPPI(device.address(), pTimestampInfos.remaining(), pTimestampInfos.address(), pTimestamps, pMaxDeviation, __functionAddress);
    }

}