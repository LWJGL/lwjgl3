/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRCopyMemoryIndirect {

    public static final int VK_KHR_COPY_MEMORY_INDIRECT_SPEC_VERSION = 1;

    public static final String VK_KHR_COPY_MEMORY_INDIRECT_EXTENSION_NAME = "VK_KHR_copy_memory_indirect";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR = 1000426001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_KHR   = 1000549000,
        VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR                       = 1000549002,
        VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR              = 1000549003;

    public static final long VK_PIPELINE_STAGE_2_COPY_INDIRECT_BIT_KHR = 0x400000000000L;

    public static final long VK_FORMAT_FEATURE_2_COPY_IMAGE_INDIRECT_DST_BIT_KHR = 0x800000000000000L;

    public static final int
        VK_ADDRESS_COPY_DEVICE_LOCAL_BIT_KHR = 0x1,
        VK_ADDRESS_COPY_SPARSE_BIT_KHR       = 0x2,
        VK_ADDRESS_COPY_PROTECTED_BIT_KHR    = 0x4;

    protected KHRCopyMemoryIndirect() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdCopyMemoryIndirectKHR ] ---

    /** {@code void vkCmdCopyMemoryIndirectKHR(VkCommandBuffer commandBuffer, VkCopyMemoryIndirectInfoKHR const * pCopyMemoryIndirectInfo)} */
    public static void nvkCmdCopyMemoryIndirectKHR(VkCommandBuffer commandBuffer, long pCopyMemoryIndirectInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryIndirectKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pCopyMemoryIndirectInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyMemoryIndirectKHR(VkCommandBuffer commandBuffer, VkCopyMemoryIndirectInfoKHR const * pCopyMemoryIndirectInfo)} */
    public static void vkCmdCopyMemoryIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyMemoryIndirectInfoKHR const *") VkCopyMemoryIndirectInfoKHR pCopyMemoryIndirectInfo) {
        nvkCmdCopyMemoryIndirectKHR(commandBuffer, pCopyMemoryIndirectInfo.address());
    }

    // --- [ vkCmdCopyMemoryToImageIndirectKHR ] ---

    /** {@code void vkCmdCopyMemoryToImageIndirectKHR(VkCommandBuffer commandBuffer, VkCopyMemoryToImageIndirectInfoKHR const * pCopyMemoryToImageIndirectInfo)} */
    public static void nvkCmdCopyMemoryToImageIndirectKHR(VkCommandBuffer commandBuffer, long pCopyMemoryToImageIndirectInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToImageIndirectKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyMemoryToImageIndirectInfoKHR.validate(pCopyMemoryToImageIndirectInfo);
        }
        callPPV(commandBuffer.address(), pCopyMemoryToImageIndirectInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyMemoryToImageIndirectKHR(VkCommandBuffer commandBuffer, VkCopyMemoryToImageIndirectInfoKHR const * pCopyMemoryToImageIndirectInfo)} */
    public static void vkCmdCopyMemoryToImageIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyMemoryToImageIndirectInfoKHR const *") VkCopyMemoryToImageIndirectInfoKHR pCopyMemoryToImageIndirectInfo) {
        nvkCmdCopyMemoryToImageIndirectKHR(commandBuffer, pCopyMemoryToImageIndirectInfo.address());
    }

}