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

public class EXTPresentTiming {

    public static final int VK_EXT_PRESENT_TIMING_SPEC_VERSION = 3;

    public static final String VK_EXT_PRESENT_TIMING_EXTENSION_NAME = "VK_EXT_present_timing";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT = 1000208000,
        VK_STRUCTURE_TYPE_SWAPCHAIN_TIMING_PROPERTIES_EXT             = 1000208001,
        VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT        = 1000208002,
        VK_STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT                    = 1000208003,
        VK_STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT                     = 1000208004,
        VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT           = 1000208005,
        VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT     = 1000208006,
        VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT                = 1000208007,
        VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT     = 1000208008,
        VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT     = 1000208009;

    public static final int
        VK_TIME_DOMAIN_PRESENT_STAGE_LOCAL_EXT = 1000208000,
        VK_TIME_DOMAIN_SWAPCHAIN_LOCAL_EXT     = 1000208001;

    public static final int VK_ERROR_PRESENT_TIMING_QUEUE_FULL_EXT = -1000208000;

    public static final int VK_SWAPCHAIN_CREATE_PRESENT_TIMING_BIT_EXT = 0x200;

    public static final int
        VK_PRESENT_STAGE_QUEUE_OPERATIONS_END_BIT_EXT      = 0x1,
        VK_PRESENT_STAGE_REQUEST_DEQUEUED_BIT_EXT          = 0x2,
        VK_PRESENT_STAGE_IMAGE_FIRST_PIXEL_OUT_BIT_EXT     = 0x4,
        VK_PRESENT_STAGE_IMAGE_FIRST_PIXEL_VISIBLE_BIT_EXT = 0x8;

    public static final int
        VK_PAST_PRESENTATION_TIMING_ALLOW_PARTIAL_RESULTS_BIT_EXT      = 0x1,
        VK_PAST_PRESENTATION_TIMING_ALLOW_OUT_OF_ORDER_RESULTS_BIT_EXT = 0x2;

    public static final int
        VK_PRESENT_TIMING_INFO_PRESENT_AT_RELATIVE_TIME_BIT_EXT         = 0x1,
        VK_PRESENT_TIMING_INFO_PRESENT_AT_NEAREST_REFRESH_CYCLE_BIT_EXT = 0x2;

    protected EXTPresentTiming() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetSwapchainPresentTimingQueueSizeEXT ] ---

    /** {@code VkResult vkSetSwapchainPresentTimingQueueSizeEXT(VkDevice device, VkSwapchainKHR swapchain, uint32_t size)} */
    @NativeType("VkResult")
    public static int vkSetSwapchainPresentTimingQueueSizeEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t") int size) {
        long __functionAddress = device.getCapabilities().vkSetSwapchainPresentTimingQueueSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), swapchain, size, __functionAddress);
    }

    // --- [ vkGetSwapchainTimingPropertiesEXT ] ---

    /** {@code VkResult vkGetSwapchainTimingPropertiesEXT(VkDevice device, VkSwapchainKHR swapchain, VkSwapchainTimingPropertiesEXT * pSwapchainTimingProperties, uint64_t * pSwapchainTimingPropertiesCounter)} */
    public static int nvkGetSwapchainTimingPropertiesEXT(VkDevice device, long swapchain, long pSwapchainTimingProperties, long pSwapchainTimingPropertiesCounter) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainTimingPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), swapchain, pSwapchainTimingProperties, pSwapchainTimingPropertiesCounter, __functionAddress);
    }

    /** {@code VkResult vkGetSwapchainTimingPropertiesEXT(VkDevice device, VkSwapchainKHR swapchain, VkSwapchainTimingPropertiesEXT * pSwapchainTimingProperties, uint64_t * pSwapchainTimingPropertiesCounter)} */
    @NativeType("VkResult")
    public static int vkGetSwapchainTimingPropertiesEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSwapchainTimingPropertiesEXT *") VkSwapchainTimingPropertiesEXT pSwapchainTimingProperties, @NativeType("uint64_t *") @Nullable LongBuffer pSwapchainTimingPropertiesCounter) {
        if (CHECKS) {
            checkSafe(pSwapchainTimingPropertiesCounter, 1);
        }
        return nvkGetSwapchainTimingPropertiesEXT(device, swapchain, pSwapchainTimingProperties.address(), memAddressSafe(pSwapchainTimingPropertiesCounter));
    }

    // --- [ vkGetSwapchainTimeDomainPropertiesEXT ] ---

    /** {@code VkResult vkGetSwapchainTimeDomainPropertiesEXT(VkDevice device, VkSwapchainKHR swapchain, VkSwapchainTimeDomainPropertiesEXT * pSwapchainTimeDomainProperties, uint64_t * pTimeDomainsCounter)} */
    public static int nvkGetSwapchainTimeDomainPropertiesEXT(VkDevice device, long swapchain, long pSwapchainTimeDomainProperties, long pTimeDomainsCounter) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainTimeDomainPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), swapchain, pSwapchainTimeDomainProperties, pTimeDomainsCounter, __functionAddress);
    }

    /** {@code VkResult vkGetSwapchainTimeDomainPropertiesEXT(VkDevice device, VkSwapchainKHR swapchain, VkSwapchainTimeDomainPropertiesEXT * pSwapchainTimeDomainProperties, uint64_t * pTimeDomainsCounter)} */
    @NativeType("VkResult")
    public static int vkGetSwapchainTimeDomainPropertiesEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSwapchainTimeDomainPropertiesEXT *") VkSwapchainTimeDomainPropertiesEXT pSwapchainTimeDomainProperties, @NativeType("uint64_t *") @Nullable LongBuffer pTimeDomainsCounter) {
        if (CHECKS) {
            checkSafe(pTimeDomainsCounter, 1);
        }
        return nvkGetSwapchainTimeDomainPropertiesEXT(device, swapchain, pSwapchainTimeDomainProperties.address(), memAddressSafe(pTimeDomainsCounter));
    }

    // --- [ vkGetPastPresentationTimingEXT ] ---

    /** {@code VkResult vkGetPastPresentationTimingEXT(VkDevice device, VkPastPresentationTimingInfoEXT const * pPastPresentationTimingInfo, VkPastPresentationTimingPropertiesEXT * pPastPresentationTimingProperties)} */
    public static int nvkGetPastPresentationTimingEXT(VkDevice device, long pPastPresentationTimingInfo, long pPastPresentationTimingProperties) {
        long __functionAddress = device.getCapabilities().vkGetPastPresentationTimingEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pPastPresentationTimingInfo, pPastPresentationTimingProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPastPresentationTimingEXT(VkDevice device, VkPastPresentationTimingInfoEXT const * pPastPresentationTimingInfo, VkPastPresentationTimingPropertiesEXT * pPastPresentationTimingProperties)} */
    @NativeType("VkResult")
    public static int vkGetPastPresentationTimingEXT(VkDevice device, @NativeType("VkPastPresentationTimingInfoEXT const *") VkPastPresentationTimingInfoEXT pPastPresentationTimingInfo, @NativeType("VkPastPresentationTimingPropertiesEXT *") VkPastPresentationTimingPropertiesEXT pPastPresentationTimingProperties) {
        return nvkGetPastPresentationTimingEXT(device, pPastPresentationTimingInfo.address(), pPastPresentationTimingProperties.address());
    }

    /** {@code VkResult vkGetSwapchainTimingPropertiesEXT(VkDevice device, VkSwapchainKHR swapchain, VkSwapchainTimingPropertiesEXT * pSwapchainTimingProperties, uint64_t * pSwapchainTimingPropertiesCounter)} */
    @NativeType("VkResult")
    public static int vkGetSwapchainTimingPropertiesEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSwapchainTimingPropertiesEXT *") VkSwapchainTimingPropertiesEXT pSwapchainTimingProperties, @NativeType("uint64_t *") long @Nullable [] pSwapchainTimingPropertiesCounter) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainTimingPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pSwapchainTimingPropertiesCounter, 1);
        }
        return callPJPPI(device.address(), swapchain, pSwapchainTimingProperties.address(), pSwapchainTimingPropertiesCounter, __functionAddress);
    }

    /** {@code VkResult vkGetSwapchainTimeDomainPropertiesEXT(VkDevice device, VkSwapchainKHR swapchain, VkSwapchainTimeDomainPropertiesEXT * pSwapchainTimeDomainProperties, uint64_t * pTimeDomainsCounter)} */
    @NativeType("VkResult")
    public static int vkGetSwapchainTimeDomainPropertiesEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSwapchainTimeDomainPropertiesEXT *") VkSwapchainTimeDomainPropertiesEXT pSwapchainTimeDomainProperties, @NativeType("uint64_t *") long @Nullable [] pTimeDomainsCounter) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainTimeDomainPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pTimeDomainsCounter, 1);
        }
        return callPJPPI(device.address(), swapchain, pSwapchainTimeDomainProperties.address(), pTimeDomainsCounter, __functionAddress);
    }

}