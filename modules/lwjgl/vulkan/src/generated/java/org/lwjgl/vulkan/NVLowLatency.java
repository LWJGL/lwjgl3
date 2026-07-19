/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVLowLatency {

    public static final int VK_NV_LOW_LATENCY_SPEC_VERSION = 2;

    public static final String VK_NV_LOW_LATENCY_EXTENSION_NAME = "VK_NV_low_latency";

    public static final int VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV = 1000310000;

    protected NVLowLatency() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetLatencySleepModeLegacyNV ] ---

    /** {@code void vkSetLatencySleepModeLegacyNV(VkDevice device, VkBool32 lowLatencyMode, VkBool32 lowLatencyBoost, uint32_t minimumIntervalUs)} */
    public static void vkSetLatencySleepModeLegacyNV(VkDevice device, @NativeType("VkBool32") boolean lowLatencyMode, @NativeType("VkBool32") boolean lowLatencyBoost, @NativeType("uint32_t") int minimumIntervalUs) {
        long __functionAddress = device.getCapabilities().vkSetLatencySleepModeLegacyNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(device.address(), lowLatencyMode ? 1 : 0, lowLatencyBoost ? 1 : 0, minimumIntervalUs, __functionAddress);
    }

    // --- [ vkLatencySleepLegacyNV ] ---

    /** {@code void vkLatencySleepLegacyNV(VkDevice device, VkSemaphore signalSemaphore, uint64_t value)} */
    public static void vkLatencySleepLegacyNV(VkDevice device, @NativeType("VkSemaphore") long signalSemaphore, @NativeType("uint64_t") long value) {
        long __functionAddress = device.getCapabilities().vkLatencySleepLegacyNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(device.address(), signalSemaphore, value, __functionAddress);
    }

    // --- [ vkSetLatencyMarkerLegacyNV ] ---

    /** {@code void vkSetLatencyMarkerLegacyNV(VkDevice device, uint64_t frameID, uint32_t marker)} */
    public static void vkSetLatencyMarkerLegacyNV(VkDevice device, @NativeType("uint64_t") long frameID, @NativeType("uint32_t") int marker) {
        long __functionAddress = device.getCapabilities().vkSetLatencyMarkerLegacyNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), frameID, marker, __functionAddress);
    }

    // --- [ vkGetLatencyTimingsLegacyNV ] ---

    /** {@code void vkGetLatencyTimingsLegacyNV(VkDevice device, void * pTimings)} */
    public static void nvkGetLatencyTimingsLegacyNV(VkDevice device, long pTimings) {
        long __functionAddress = device.getCapabilities().vkGetLatencyTimingsLegacyNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(device.address(), pTimings, __functionAddress);
    }

    /** {@code void vkGetLatencyTimingsLegacyNV(VkDevice device, void * pTimings)} */
    public static void vkGetLatencyTimingsLegacyNV(VkDevice device, @NativeType("void *") ByteBuffer pTimings) {
        if (CHECKS) {
            check(pTimings, 1);
        }
        nvkGetLatencyTimingsLegacyNV(device, memAddress(pTimings));
    }

    // --- [ vkQueueNotifyOutOfBandLegacyNV ] ---

    /** {@code void vkQueueNotifyOutOfBandLegacyNV(VkQueue queue, uint32_t queueType)} */
    public static void vkQueueNotifyOutOfBandLegacyNV(VkQueue queue, @NativeType("uint32_t") int queueType) {
        long __functionAddress = queue.getCapabilities().vkQueueNotifyOutOfBandLegacyNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(queue.address(), queueType, __functionAddress);
    }

    // --- [ vkGetSleepStatusLegacyNV ] ---

    /** {@code void vkGetSleepStatusLegacyNV(VkDevice device, VkBool32 * pLowLatencyMode)} */
    public static void nvkGetSleepStatusLegacyNV(VkDevice device, long pLowLatencyMode) {
        long __functionAddress = device.getCapabilities().vkGetSleepStatusLegacyNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(device.address(), pLowLatencyMode, __functionAddress);
    }

    /** {@code void vkGetSleepStatusLegacyNV(VkDevice device, VkBool32 * pLowLatencyMode)} */
    public static void vkGetSleepStatusLegacyNV(VkDevice device, @NativeType("VkBool32 *") IntBuffer pLowLatencyMode) {
        if (CHECKS) {
            check(pLowLatencyMode, 1);
        }
        nvkGetSleepStatusLegacyNV(device, memAddress(pLowLatencyMode));
    }

    // --- [ vkShutdownLatencyDeviceLegacyNV ] ---

    /** {@code void vkShutdownLatencyDeviceLegacyNV(VkDevice device)} */
    public static void vkShutdownLatencyDeviceLegacyNV(VkDevice device) {
        long __functionAddress = device.getCapabilities().vkShutdownLatencyDeviceLegacyNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(device.address(), __functionAddress);
    }

    /** {@code void vkGetSleepStatusLegacyNV(VkDevice device, VkBool32 * pLowLatencyMode)} */
    public static void vkGetSleepStatusLegacyNV(VkDevice device, @NativeType("VkBool32 *") int[] pLowLatencyMode) {
        long __functionAddress = device.getCapabilities().vkGetSleepStatusLegacyNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pLowLatencyMode, 1);
        }
        callPPV(device.address(), pLowLatencyMode, __functionAddress);
    }

}