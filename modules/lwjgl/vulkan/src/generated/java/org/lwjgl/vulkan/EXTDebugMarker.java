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