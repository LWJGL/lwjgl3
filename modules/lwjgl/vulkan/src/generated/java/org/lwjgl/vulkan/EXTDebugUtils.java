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

public class EXTDebugUtils {

    public static final int VK_EXT_DEBUG_UTILS_SPEC_VERSION = 2;

    public static final String VK_EXT_DEBUG_UTILS_EXTENSION_NAME = "VK_EXT_debug_utils";

    public static final int
        VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT        = 1000128000,
        VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT         = 1000128001,
        VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT                   = 1000128002,
        VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT = 1000128003,
        VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT   = 1000128004;

    public static final int VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT = 1000128000;

    public static final int
        VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 0x1,
        VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT    = 0x10,
        VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 0x100,
        VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT   = 0x1000;

    public static final int
        VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT     = 0x1,
        VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT  = 0x2,
        VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = 0x4;

    protected EXTDebugUtils() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetDebugUtilsObjectNameEXT ] ---

    /** {@code VkResult vkSetDebugUtilsObjectNameEXT(VkDevice device, VkDebugUtilsObjectNameInfoEXT const * pNameInfo)} */
    public static int nvkSetDebugUtilsObjectNameEXT(VkDevice device, long pNameInfo) {
        long __functionAddress = device.getCapabilitiesInstance().vkSetDebugUtilsObjectNameEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pNameInfo, __functionAddress);
    }

    /** {@code VkResult vkSetDebugUtilsObjectNameEXT(VkDevice device, VkDebugUtilsObjectNameInfoEXT const * pNameInfo)} */
    @NativeType("VkResult")
    public static int vkSetDebugUtilsObjectNameEXT(VkDevice device, @NativeType("VkDebugUtilsObjectNameInfoEXT const *") VkDebugUtilsObjectNameInfoEXT pNameInfo) {
        return nvkSetDebugUtilsObjectNameEXT(device, pNameInfo.address());
    }

    // --- [ vkSetDebugUtilsObjectTagEXT ] ---

    /** {@code VkResult vkSetDebugUtilsObjectTagEXT(VkDevice device, VkDebugUtilsObjectTagInfoEXT const * pTagInfo)} */
    public static int nvkSetDebugUtilsObjectTagEXT(VkDevice device, long pTagInfo) {
        long __functionAddress = device.getCapabilitiesInstance().vkSetDebugUtilsObjectTagEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsObjectTagInfoEXT.validate(pTagInfo);
        }
        return callPPI(device.address(), pTagInfo, __functionAddress);
    }

    /** {@code VkResult vkSetDebugUtilsObjectTagEXT(VkDevice device, VkDebugUtilsObjectTagInfoEXT const * pTagInfo)} */
    @NativeType("VkResult")
    public static int vkSetDebugUtilsObjectTagEXT(VkDevice device, @NativeType("VkDebugUtilsObjectTagInfoEXT const *") VkDebugUtilsObjectTagInfoEXT pTagInfo) {
        return nvkSetDebugUtilsObjectTagEXT(device, pTagInfo.address());
    }

    // --- [ vkQueueBeginDebugUtilsLabelEXT ] ---

    /** {@code void vkQueueBeginDebugUtilsLabelEXT(VkQueue queue, VkDebugUtilsLabelEXT const * pLabelInfo)} */
    public static void nvkQueueBeginDebugUtilsLabelEXT(VkQueue queue, long pLabelInfo) {
        long __functionAddress = queue.getCapabilitiesInstance().vkQueueBeginDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        callPPV(queue.address(), pLabelInfo, __functionAddress);
    }

    /** {@code void vkQueueBeginDebugUtilsLabelEXT(VkQueue queue, VkDebugUtilsLabelEXT const * pLabelInfo)} */
    public static void vkQueueBeginDebugUtilsLabelEXT(VkQueue queue, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkQueueBeginDebugUtilsLabelEXT(queue, pLabelInfo.address());
    }

    // --- [ vkQueueEndDebugUtilsLabelEXT ] ---

    /** {@code void vkQueueEndDebugUtilsLabelEXT(VkQueue queue)} */
    public static void vkQueueEndDebugUtilsLabelEXT(VkQueue queue) {
        long __functionAddress = queue.getCapabilitiesInstance().vkQueueEndDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(queue.address(), __functionAddress);
    }

    // --- [ vkQueueInsertDebugUtilsLabelEXT ] ---

    /** {@code void vkQueueInsertDebugUtilsLabelEXT(VkQueue queue, VkDebugUtilsLabelEXT const * pLabelInfo)} */
    public static void nvkQueueInsertDebugUtilsLabelEXT(VkQueue queue, long pLabelInfo) {
        long __functionAddress = queue.getCapabilitiesInstance().vkQueueInsertDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        callPPV(queue.address(), pLabelInfo, __functionAddress);
    }

    /** {@code void vkQueueInsertDebugUtilsLabelEXT(VkQueue queue, VkDebugUtilsLabelEXT const * pLabelInfo)} */
    public static void vkQueueInsertDebugUtilsLabelEXT(VkQueue queue, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkQueueInsertDebugUtilsLabelEXT(queue, pLabelInfo.address());
    }

    // --- [ vkCmdBeginDebugUtilsLabelEXT ] ---

    /** {@code void vkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT const * pLabelInfo)} */
    public static void nvkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, long pLabelInfo) {
        long __functionAddress = commandBuffer.getCapabilitiesInstance().vkCmdBeginDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        callPPV(commandBuffer.address(), pLabelInfo, __functionAddress);
    }

    /** {@code void vkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT const * pLabelInfo)} */
    public static void vkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkCmdBeginDebugUtilsLabelEXT(commandBuffer, pLabelInfo.address());
    }

    // --- [ vkCmdEndDebugUtilsLabelEXT ] ---

    /** {@code void vkCmdEndDebugUtilsLabelEXT(VkCommandBuffer commandBuffer)} */
    public static void vkCmdEndDebugUtilsLabelEXT(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilitiesInstance().vkCmdEndDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

    // --- [ vkCmdInsertDebugUtilsLabelEXT ] ---

    /** {@code void vkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT const * pLabelInfo)} */
    public static void nvkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, long pLabelInfo) {
        long __functionAddress = commandBuffer.getCapabilitiesInstance().vkCmdInsertDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        callPPV(commandBuffer.address(), pLabelInfo, __functionAddress);
    }

    /** {@code void vkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT const * pLabelInfo)} */
    public static void vkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkCmdInsertDebugUtilsLabelEXT(commandBuffer, pLabelInfo.address());
    }

    // --- [ vkCreateDebugUtilsMessengerEXT ] ---

    /** {@code VkResult vkCreateDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDebugUtilsMessengerEXT * pMessenger)} */
    public static int nvkCreateDebugUtilsMessengerEXT(VkInstance instance, long pCreateInfo, long pAllocator, long pMessenger) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsMessengerCreateInfoEXT.validate(pCreateInfo);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pMessenger, __functionAddress);
    }

    /** {@code VkResult vkCreateDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDebugUtilsMessengerEXT * pMessenger)} */
    @NativeType("VkResult")
    public static int vkCreateDebugUtilsMessengerEXT(VkInstance instance, @NativeType("VkDebugUtilsMessengerCreateInfoEXT const *") VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDebugUtilsMessengerEXT *") LongBuffer pMessenger) {
        if (CHECKS) {
            check(pMessenger, 1);
        }
        return nvkCreateDebugUtilsMessengerEXT(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pMessenger));
    }

    // --- [ vkDestroyDebugUtilsMessengerEXT ] ---

    /** {@code void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerEXT messenger, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyDebugUtilsMessengerEXT(VkInstance instance, long messenger, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroyDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(instance.address(), messenger, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerEXT messenger, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, @NativeType("VkDebugUtilsMessengerEXT") long messenger, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyDebugUtilsMessengerEXT(instance, messenger, memAddressSafe(pAllocator));
    }

    // --- [ vkSubmitDebugUtilsMessageEXT ] ---

    /** {@code void vkSubmitDebugUtilsMessageEXT(VkInstance instance, VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity, VkDebugUtilsMessageTypeFlagsEXT messageTypes, VkDebugUtilsMessengerCallbackDataEXT const * pCallbackData)} */
    public static void nvkSubmitDebugUtilsMessageEXT(VkInstance instance, int messageSeverity, int messageTypes, long pCallbackData) {
        long __functionAddress = instance.getCapabilities().vkSubmitDebugUtilsMessageEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsMessengerCallbackDataEXT.validate(pCallbackData);
        }
        callPPV(instance.address(), messageSeverity, messageTypes, pCallbackData, __functionAddress);
    }

    /** {@code void vkSubmitDebugUtilsMessageEXT(VkInstance instance, VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity, VkDebugUtilsMessageTypeFlagsEXT messageTypes, VkDebugUtilsMessengerCallbackDataEXT const * pCallbackData)} */
    public static void vkSubmitDebugUtilsMessageEXT(VkInstance instance, @NativeType("VkDebugUtilsMessageSeverityFlagBitsEXT") int messageSeverity, @NativeType("VkDebugUtilsMessageTypeFlagsEXT") int messageTypes, @NativeType("VkDebugUtilsMessengerCallbackDataEXT const *") VkDebugUtilsMessengerCallbackDataEXT pCallbackData) {
        nvkSubmitDebugUtilsMessageEXT(instance, messageSeverity, messageTypes, pCallbackData.address());
    }

    /** {@code VkResult vkCreateDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDebugUtilsMessengerEXT * pMessenger)} */
    @NativeType("VkResult")
    public static int vkCreateDebugUtilsMessengerEXT(VkInstance instance, @NativeType("VkDebugUtilsMessengerCreateInfoEXT const *") VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDebugUtilsMessengerEXT *") long[] pMessenger) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pMessenger, 1);
            VkDebugUtilsMessengerCreateInfoEXT.validate(pCreateInfo.address());
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pMessenger, __functionAddress);
    }

}