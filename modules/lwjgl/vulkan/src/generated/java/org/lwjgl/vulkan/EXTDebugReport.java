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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTDebugReport {

    public static final int VK_EXT_DEBUG_REPORT_SPEC_VERSION = 10;

    public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";

    public static final int
        VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = 1000011000,
        VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT          = 1000011000;

    public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;

    public static final int VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT = 1000011000;

    public static final int
        VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT                    = 0,
        VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT                   = 1,
        VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT            = 2,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT                     = 3,
        VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT                      = 4,
        VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT                  = 5,
        VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT             = 6,
        VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT                      = 7,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT              = 8,
        VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT                     = 9,
        VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT                      = 10,
        VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT                      = 11,
        VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT                 = 12,
        VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT                = 13,
        VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT                 = 14,
        VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT              = 15,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT             = 16,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT            = 17,
        VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT                = 18,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT                   = 19,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT      = 20,
        VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT                    = 21,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT            = 22,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT             = 23,
        VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT                = 24,
        VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT               = 25,
        VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT                = 26,
        VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT              = 27,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT  = 28,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT               = 28,
        VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT                = 29,
        VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT           = 30,
        VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT       = 33,
        VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT           = 33,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT = 1000085000,
        VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT   = 1000156000;

    public static final int
        VK_DEBUG_REPORT_INFORMATION_BIT_EXT         = 0x1,
        VK_DEBUG_REPORT_WARNING_BIT_EXT             = 0x2,
        VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x4,
        VK_DEBUG_REPORT_ERROR_BIT_EXT               = 0x8,
        VK_DEBUG_REPORT_DEBUG_BIT_EXT               = 0x10;

    protected EXTDebugReport() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateDebugReportCallbackEXT ] ---

    /** {@code VkResult vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDebugReportCallbackEXT * pCallback)} */
    public static int nvkCreateDebugReportCallbackEXT(VkInstance instance, long pCreateInfo, long pAllocator, long pCallback) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugReportCallbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pCallback, __functionAddress);
    }

    /** {@code VkResult vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDebugReportCallbackEXT * pCallback)} */
    @NativeType("VkResult")
    public static int vkCreateDebugReportCallbackEXT(VkInstance instance, @NativeType("VkDebugReportCallbackCreateInfoEXT const *") VkDebugReportCallbackCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDebugReportCallbackEXT *") LongBuffer pCallback) {
        if (CHECKS) {
            check(pCallback, 1);
        }
        return nvkCreateDebugReportCallbackEXT(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pCallback));
    }

    // --- [ vkDestroyDebugReportCallbackEXT ] ---

    /** {@code void vkDestroyDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackEXT callback, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyDebugReportCallbackEXT(VkInstance instance, long callback, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroyDebugReportCallbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(instance.address(), callback, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackEXT callback, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyDebugReportCallbackEXT(VkInstance instance, @NativeType("VkDebugReportCallbackEXT") long callback, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyDebugReportCallbackEXT(instance, callback, memAddressSafe(pAllocator));
    }

    // --- [ vkDebugReportMessageEXT ] ---

    /** {@code void vkDebugReportMessageEXT(VkInstance instance, VkDebugReportFlagsEXT flags, VkDebugReportObjectTypeEXT objectType, uint64_t object, size_t location, int32_t messageCode, char const * pLayerPrefix, char const * pMessage)} */
    public static void nvkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage) {
        long __functionAddress = instance.getCapabilities().vkDebugReportMessageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPPV(instance.address(), flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, __functionAddress);
    }

    /** {@code void vkDebugReportMessageEXT(VkInstance instance, VkDebugReportFlagsEXT flags, VkDebugReportObjectTypeEXT objectType, uint64_t object, size_t location, int32_t messageCode, char const * pLayerPrefix, char const * pMessage)} */
    public static void vkDebugReportMessageEXT(VkInstance instance, @NativeType("VkDebugReportFlagsEXT") int flags, @NativeType("VkDebugReportObjectTypeEXT") int objectType, @NativeType("uint64_t") long object, @NativeType("size_t") long location, @NativeType("int32_t") int messageCode, @NativeType("char const *") ByteBuffer pLayerPrefix, @NativeType("char const *") ByteBuffer pMessage) {
        if (CHECKS) {
            checkNT1(pLayerPrefix);
            checkNT1(pMessage);
        }
        nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, memAddress(pLayerPrefix), memAddress(pMessage));
    }

    /** {@code void vkDebugReportMessageEXT(VkInstance instance, VkDebugReportFlagsEXT flags, VkDebugReportObjectTypeEXT objectType, uint64_t object, size_t location, int32_t messageCode, char const * pLayerPrefix, char const * pMessage)} */
    public static void vkDebugReportMessageEXT(VkInstance instance, @NativeType("VkDebugReportFlagsEXT") int flags, @NativeType("VkDebugReportObjectTypeEXT") int objectType, @NativeType("uint64_t") long object, @NativeType("size_t") long location, @NativeType("int32_t") int messageCode, @NativeType("char const *") CharSequence pLayerPrefix, @NativeType("char const *") CharSequence pMessage) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pLayerPrefix, true);
            long pLayerPrefixEncoded = stack.getPointerAddress();
            stack.nUTF8(pMessage, true);
            long pMessageEncoded = stack.getPointerAddress();
            nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, pLayerPrefixEncoded, pMessageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code VkResult vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDebugReportCallbackEXT * pCallback)} */
    @NativeType("VkResult")
    public static int vkCreateDebugReportCallbackEXT(VkInstance instance, @NativeType("VkDebugReportCallbackCreateInfoEXT const *") VkDebugReportCallbackCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDebugReportCallbackEXT *") long[] pCallback) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugReportCallbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pCallback, 1);
            VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo.address());
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pCallback, __functionAddress);
    }

}