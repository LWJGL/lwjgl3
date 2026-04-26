/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVMemoryDecompression {

    public static final int VK_NV_MEMORY_DECOMPRESSION_SPEC_VERSION = 1;

    public static final String VK_NV_MEMORY_DECOMPRESSION_EXTENSION_NAME = "VK_NV_memory_decompression";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV   = 1000427000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV = 1000427001;

    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV = 0x1L;

    protected NVMemoryDecompression() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDecompressMemoryNV ] ---

    /** {@code void vkCmdDecompressMemoryNV(VkCommandBuffer commandBuffer, uint32_t decompressRegionCount, VkDecompressMemoryRegionNV const * pDecompressMemoryRegions)} */
    public static void nvkCmdDecompressMemoryNV(VkCommandBuffer commandBuffer, int decompressRegionCount, long pDecompressMemoryRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecompressMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), decompressRegionCount, pDecompressMemoryRegions, __functionAddress);
    }

    /** {@code void vkCmdDecompressMemoryNV(VkCommandBuffer commandBuffer, uint32_t decompressRegionCount, VkDecompressMemoryRegionNV const * pDecompressMemoryRegions)} */
    public static void vkCmdDecompressMemoryNV(VkCommandBuffer commandBuffer, @NativeType("VkDecompressMemoryRegionNV const *") VkDecompressMemoryRegionNV.Buffer pDecompressMemoryRegions) {
        nvkCmdDecompressMemoryNV(commandBuffer, pDecompressMemoryRegions.remaining(), pDecompressMemoryRegions.address());
    }

    // --- [ vkCmdDecompressMemoryIndirectCountNV ] ---

    /** {@code void vkCmdDecompressMemoryIndirectCountNV(VkCommandBuffer commandBuffer, VkDeviceAddress indirectCommandsAddress, VkDeviceAddress indirectCommandsCountAddress, uint32_t stride)} */
    public static void vkCmdDecompressMemoryIndirectCountNV(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long indirectCommandsAddress, @NativeType("VkDeviceAddress") long indirectCommandsCountAddress, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecompressMemoryIndirectCountNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), indirectCommandsAddress, indirectCommandsCountAddress, stride, __functionAddress);
    }

}