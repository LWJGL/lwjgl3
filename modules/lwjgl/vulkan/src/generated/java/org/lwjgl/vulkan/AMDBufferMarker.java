/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class AMDBufferMarker {

    public static final int VK_AMD_BUFFER_MARKER_SPEC_VERSION = 1;

    public static final String VK_AMD_BUFFER_MARKER_EXTENSION_NAME = "VK_AMD_buffer_marker";

    protected AMDBufferMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdWriteBufferMarkerAMD ] ---

    /** {@code void vkCmdWriteBufferMarkerAMD(VkCommandBuffer commandBuffer, VkPipelineStageFlagBits pipelineStage, VkBuffer dstBuffer, VkDeviceSize dstOffset, uint32_t marker)} */
    public static void vkCmdWriteBufferMarkerAMD(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlagBits") int pipelineStage, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("uint32_t") int marker) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteBufferMarkerAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), pipelineStage, dstBuffer, dstOffset, marker, __functionAddress);
    }

    // --- [ vkCmdWriteBufferMarker2AMD ] ---

    /** {@code void vkCmdWriteBufferMarker2AMD(VkCommandBuffer commandBuffer, VkPipelineStageFlags2 stage, VkBuffer dstBuffer, VkDeviceSize dstOffset, uint32_t marker)} */
    public static void vkCmdWriteBufferMarker2AMD(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags2") long stage, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("uint32_t") int marker) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteBufferMarker2AMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJV(commandBuffer.address(), stage, dstBuffer, dstOffset, marker, __functionAddress);
    }

}