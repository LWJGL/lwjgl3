/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVLowLatency2 {

    public static final int VK_NV_LOW_LATENCY_2_SPEC_VERSION = 2;

    public static final String VK_NV_LOW_LATENCY_2_EXTENSION_NAME = "VK_NV_low_latency2";

    public static final int
        VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV       = 1000505000,
        VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV            = 1000505001,
        VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV       = 1000505002,
        VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV       = 1000505003,
        VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV  = 1000505004,
        VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV = 1000505005,
        VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV   = 1000505006,
        VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV = 1000505007,
        VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV  = 1000505008;

    public static final int
        VK_LATENCY_MARKER_SIMULATION_START_NV               = 0,
        VK_LATENCY_MARKER_SIMULATION_END_NV                 = 1,
        VK_LATENCY_MARKER_RENDERSUBMIT_START_NV             = 2,
        VK_LATENCY_MARKER_RENDERSUBMIT_END_NV               = 3,
        VK_LATENCY_MARKER_PRESENT_START_NV                  = 4,
        VK_LATENCY_MARKER_PRESENT_END_NV                    = 5,
        VK_LATENCY_MARKER_INPUT_SAMPLE_NV                   = 6,
        VK_LATENCY_MARKER_TRIGGER_FLASH_NV                  = 7,
        VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_START_NV = 8,
        VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_END_NV   = 9,
        VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_START_NV      = 10,
        VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_END_NV        = 11;

    public static final int
        VK_OUT_OF_BAND_QUEUE_TYPE_RENDER_NV  = 0,
        VK_OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV = 1;

    protected NVLowLatency2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetLatencySleepModeNV ] ---

    /** {@code VkResult vkSetLatencySleepModeNV(VkDevice device, VkSwapchainKHR swapchain, VkLatencySleepModeInfoNV const * pSleepModeInfo)} */
    public static int nvkSetLatencySleepModeNV(VkDevice device, long swapchain, long pSleepModeInfo) {
        long __functionAddress = device.getCapabilities().vkSetLatencySleepModeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), swapchain, pSleepModeInfo, __functionAddress);
    }

    /** {@code VkResult vkSetLatencySleepModeNV(VkDevice device, VkSwapchainKHR swapchain, VkLatencySleepModeInfoNV const * pSleepModeInfo)} */
    @NativeType("VkResult")
    public static int vkSetLatencySleepModeNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkLatencySleepModeInfoNV const *") VkLatencySleepModeInfoNV pSleepModeInfo) {
        return nvkSetLatencySleepModeNV(device, swapchain, pSleepModeInfo.address());
    }

    // --- [ vkLatencySleepNV ] ---

    /** {@code VkResult vkLatencySleepNV(VkDevice device, VkSwapchainKHR swapchain, VkLatencySleepInfoNV const * pSleepInfo)} */
    public static int nvkLatencySleepNV(VkDevice device, long swapchain, long pSleepInfo) {
        long __functionAddress = device.getCapabilities().vkLatencySleepNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), swapchain, pSleepInfo, __functionAddress);
    }

    /** {@code VkResult vkLatencySleepNV(VkDevice device, VkSwapchainKHR swapchain, VkLatencySleepInfoNV const * pSleepInfo)} */
    @NativeType("VkResult")
    public static int vkLatencySleepNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkLatencySleepInfoNV const *") VkLatencySleepInfoNV pSleepInfo) {
        return nvkLatencySleepNV(device, swapchain, pSleepInfo.address());
    }

    // --- [ vkSetLatencyMarkerNV ] ---

    /** {@code void vkSetLatencyMarkerNV(VkDevice device, VkSwapchainKHR swapchain, VkSetLatencyMarkerInfoNV const * pLatencyMarkerInfo)} */
    public static void nvkSetLatencyMarkerNV(VkDevice device, long swapchain, long pLatencyMarkerInfo) {
        long __functionAddress = device.getCapabilities().vkSetLatencyMarkerNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), swapchain, pLatencyMarkerInfo, __functionAddress);
    }

    /** {@code void vkSetLatencyMarkerNV(VkDevice device, VkSwapchainKHR swapchain, VkSetLatencyMarkerInfoNV const * pLatencyMarkerInfo)} */
    public static void vkSetLatencyMarkerNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSetLatencyMarkerInfoNV const *") VkSetLatencyMarkerInfoNV pLatencyMarkerInfo) {
        nvkSetLatencyMarkerNV(device, swapchain, pLatencyMarkerInfo.address());
    }

    // --- [ vkGetLatencyTimingsNV ] ---

    /** {@code void vkGetLatencyTimingsNV(VkDevice device, VkSwapchainKHR swapchain, VkGetLatencyMarkerInfoNV * pLatencyMarkerInfo)} */
    public static void nvkGetLatencyTimingsNV(VkDevice device, long swapchain, long pLatencyMarkerInfo) {
        long __functionAddress = device.getCapabilities().vkGetLatencyTimingsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), swapchain, pLatencyMarkerInfo, __functionAddress);
    }

    /** {@code void vkGetLatencyTimingsNV(VkDevice device, VkSwapchainKHR swapchain, VkGetLatencyMarkerInfoNV * pLatencyMarkerInfo)} */
    public static void vkGetLatencyTimingsNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkGetLatencyMarkerInfoNV *") VkGetLatencyMarkerInfoNV pLatencyMarkerInfo) {
        nvkGetLatencyTimingsNV(device, swapchain, pLatencyMarkerInfo.address());
    }

    // --- [ vkQueueNotifyOutOfBandNV ] ---

    /** {@code void vkQueueNotifyOutOfBandNV(VkQueue queue, VkOutOfBandQueueTypeInfoNV const * pQueueTypeInfo)} */
    public static void nvkQueueNotifyOutOfBandNV(VkQueue queue, long pQueueTypeInfo) {
        long __functionAddress = queue.getCapabilities().vkQueueNotifyOutOfBandNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(queue.address(), pQueueTypeInfo, __functionAddress);
    }

    /** {@code void vkQueueNotifyOutOfBandNV(VkQueue queue, VkOutOfBandQueueTypeInfoNV const * pQueueTypeInfo)} */
    public static void vkQueueNotifyOutOfBandNV(VkQueue queue, @NativeType("VkOutOfBandQueueTypeInfoNV const *") VkOutOfBandQueueTypeInfoNV pQueueTypeInfo) {
        nvkQueueNotifyOutOfBandNV(queue, pQueueTypeInfo.address());
    }

}