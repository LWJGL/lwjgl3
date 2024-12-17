/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVCopyMemoryIndirect {

    public static final int VK_NV_COPY_MEMORY_INDIRECT_SPEC_VERSION = 1;

    public static final String VK_NV_COPY_MEMORY_INDIRECT_EXTENSION_NAME = "VK_NV_copy_memory_indirect";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV   = 1000426000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV = 1000426001;

    protected NVCopyMemoryIndirect() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdCopyMemoryIndirectNV ] ---

    /** {@code void vkCmdCopyMemoryIndirectNV(VkCommandBuffer commandBuffer, VkDeviceAddress copyBufferAddress, uint32_t copyCount, uint32_t stride)} */
    public static void vkCmdCopyMemoryIndirectNV(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long copyBufferAddress, @NativeType("uint32_t") int copyCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryIndirectNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), copyBufferAddress, copyCount, stride, __functionAddress);
    }

    // --- [ vkCmdCopyMemoryToImageIndirectNV ] ---

    /** {@code void vkCmdCopyMemoryToImageIndirectNV(VkCommandBuffer commandBuffer, VkDeviceAddress copyBufferAddress, uint32_t copyCount, uint32_t stride, VkImage dstImage, VkImageLayout dstImageLayout, VkImageSubresourceLayers const * pImageSubresources)} */
    public static void nvkCmdCopyMemoryToImageIndirectNV(VkCommandBuffer commandBuffer, long copyBufferAddress, int copyCount, int stride, long dstImage, int dstImageLayout, long pImageSubresources) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToImageIndirectNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(commandBuffer.address(), copyBufferAddress, copyCount, stride, dstImage, dstImageLayout, pImageSubresources, __functionAddress);
    }

    /** {@code void vkCmdCopyMemoryToImageIndirectNV(VkCommandBuffer commandBuffer, VkDeviceAddress copyBufferAddress, uint32_t copyCount, uint32_t stride, VkImage dstImage, VkImageLayout dstImageLayout, VkImageSubresourceLayers const * pImageSubresources)} */
    public static void vkCmdCopyMemoryToImageIndirectNV(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long copyBufferAddress, @NativeType("uint32_t") int stride, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkImageSubresourceLayers const *") VkImageSubresourceLayers.Buffer pImageSubresources) {
        nvkCmdCopyMemoryToImageIndirectNV(commandBuffer, copyBufferAddress, pImageSubresources.remaining(), stride, dstImage, dstImageLayout, pImageSubresources.address());
    }

}