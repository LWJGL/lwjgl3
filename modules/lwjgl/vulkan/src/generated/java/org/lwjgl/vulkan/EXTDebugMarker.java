/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTDebugMarker {

    public static final int VK_EXT_DEBUG_MARKER_SPEC_VERSION = 4;

    public static final String VK_EXT_DEBUG_MARKER_EXTENSION_NAME = "VK_EXT_debug_marker";

    public static final int
        VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = 1000022000,
        VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT  = 1000022001,
        VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT      = 1000022002;

    public static final int
        VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT                   = 0,
        VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT                  = 1,
        VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT           = 2,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT                    = 3,
        VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT                     = 4,
        VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT                 = 5,
        VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT            = 6,
        VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT                     = 7,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT             = 8,
        VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT                    = 9,
        VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT                     = 10,
        VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT                     = 11,
        VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT                = 12,
        VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT               = 13,
        VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT                = 14,
        VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT             = 15,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT            = 16,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT           = 17,
        VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT               = 18,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT                  = 19,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT     = 20,
        VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT                   = 21,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT           = 22,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT            = 23,
        VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT               = 24,
        VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT              = 25,
        VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT               = 26,
        VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT             = 27,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT = 28,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT              = 28,
        VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT               = 29,
        VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT          = 30,
        VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT      = 33,
        VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT          = 33;

    protected EXTDebugMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkDebugMarkerSetObjectTagEXT ] ---

    /** {@code VkResult vkDebugMarkerSetObjectTagEXT(VkDevice device, VkDebugMarkerObjectTagInfoEXT const * pTagInfo)} */
    public static int nvkDebugMarkerSetObjectTagEXT(VkDevice device, long pTagInfo) {
        long __functionAddress = device.getCapabilities().vkDebugMarkerSetObjectTagEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugMarkerObjectTagInfoEXT.validate(pTagInfo);
        }
        return callPPI(device.address(), pTagInfo, __functionAddress);
    }

    /** {@code VkResult vkDebugMarkerSetObjectTagEXT(VkDevice device, VkDebugMarkerObjectTagInfoEXT const * pTagInfo)} */
    @NativeType("VkResult")
    public static int vkDebugMarkerSetObjectTagEXT(VkDevice device, @NativeType("VkDebugMarkerObjectTagInfoEXT const *") VkDebugMarkerObjectTagInfoEXT pTagInfo) {
        return nvkDebugMarkerSetObjectTagEXT(device, pTagInfo.address());
    }

    // --- [ vkDebugMarkerSetObjectNameEXT ] ---

    /** {@code VkResult vkDebugMarkerSetObjectNameEXT(VkDevice device, VkDebugMarkerObjectNameInfoEXT const * pNameInfo)} */
    public static int nvkDebugMarkerSetObjectNameEXT(VkDevice device, long pNameInfo) {
        long __functionAddress = device.getCapabilities().vkDebugMarkerSetObjectNameEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugMarkerObjectNameInfoEXT.validate(pNameInfo);
        }
        return callPPI(device.address(), pNameInfo, __functionAddress);
    }

    /** {@code VkResult vkDebugMarkerSetObjectNameEXT(VkDevice device, VkDebugMarkerObjectNameInfoEXT const * pNameInfo)} */
    @NativeType("VkResult")
    public static int vkDebugMarkerSetObjectNameEXT(VkDevice device, @NativeType("VkDebugMarkerObjectNameInfoEXT const *") VkDebugMarkerObjectNameInfoEXT pNameInfo) {
        return nvkDebugMarkerSetObjectNameEXT(device, pNameInfo.address());
    }

    // --- [ vkCmdDebugMarkerBeginEXT ] ---

    /** {@code void vkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT const * pMarkerInfo)} */
    public static void nvkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerBeginEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugMarkerMarkerInfoEXT.validate(pMarkerInfo);
        }
        callPPV(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    /** {@code void vkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT const * pMarkerInfo)} */
    public static void vkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugMarkerMarkerInfoEXT const *") VkDebugMarkerMarkerInfoEXT pMarkerInfo) {
        nvkCmdDebugMarkerBeginEXT(commandBuffer, pMarkerInfo.address());
    }

    // --- [ vkCmdDebugMarkerEndEXT ] ---

    /** {@code void vkCmdDebugMarkerEndEXT(VkCommandBuffer commandBuffer)} */
    public static void vkCmdDebugMarkerEndEXT(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerEndEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

    // --- [ vkCmdDebugMarkerInsertEXT ] ---

    /** {@code void vkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT const * pMarkerInfo)} */
    public static void nvkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerInsertEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugMarkerMarkerInfoEXT.validate(pMarkerInfo);
        }
        callPPV(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    /** {@code void vkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT const * pMarkerInfo)} */
    public static void vkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugMarkerMarkerInfoEXT const *") VkDebugMarkerMarkerInfoEXT pMarkerInfo) {
        nvkCmdDebugMarkerInsertEXT(commandBuffer, pMarkerInfo.address());
    }

}