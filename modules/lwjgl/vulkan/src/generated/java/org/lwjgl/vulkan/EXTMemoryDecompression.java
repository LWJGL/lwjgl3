/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTMemoryDecompression {

    public static final int VK_EXT_MEMORY_DECOMPRESSION_SPEC_VERSION = 1;

    public static final String VK_EXT_MEMORY_DECOMPRESSION_EXTENSION_NAME = "VK_EXT_memory_decompression";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT   = 1000427000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT = 1000427001,
        VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT                          = 1000550002;

    public static final long VK_PIPELINE_STAGE_2_MEMORY_DECOMPRESSION_BIT_EXT = 0x200000000000L;

    public static final long
        VK_ACCESS_2_MEMORY_DECOMPRESSION_READ_BIT_EXT  = 0x80000000000000L,
        VK_ACCESS_2_MEMORY_DECOMPRESSION_WRITE_BIT_EXT = 0x100000000000000L;

    public static final long VK_BUFFER_USAGE_2_MEMORY_DECOMPRESSION_BIT_EXT = 0x100000000L;

    public static final long
        VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_EXT = 0x1L,
        VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV  = 0x1L;

    protected EXTMemoryDecompression() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDecompressMemoryEXT ] ---

    /** {@code void vkCmdDecompressMemoryEXT(VkCommandBuffer commandBuffer, VkDecompressMemoryInfoEXT const * pDecompressMemoryInfoEXT)} */
    public static void nvkCmdDecompressMemoryEXT(VkCommandBuffer commandBuffer, long pDecompressMemoryInfoEXT) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecompressMemoryEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDecompressMemoryInfoEXT.validate(pDecompressMemoryInfoEXT);
        }
        callPPV(commandBuffer.address(), pDecompressMemoryInfoEXT, __functionAddress);
    }

    /** {@code void vkCmdDecompressMemoryEXT(VkCommandBuffer commandBuffer, VkDecompressMemoryInfoEXT const * pDecompressMemoryInfoEXT)} */
    public static void vkCmdDecompressMemoryEXT(VkCommandBuffer commandBuffer, @NativeType("VkDecompressMemoryInfoEXT const *") VkDecompressMemoryInfoEXT pDecompressMemoryInfoEXT) {
        nvkCmdDecompressMemoryEXT(commandBuffer, pDecompressMemoryInfoEXT.address());
    }

    // --- [ vkCmdDecompressMemoryIndirectCountEXT ] ---

    /** {@code void vkCmdDecompressMemoryIndirectCountEXT(VkCommandBuffer commandBuffer, VkMemoryDecompressionMethodFlagsEXT decompressionMethod, VkDeviceAddress indirectCommandsAddress, VkDeviceAddress indirectCommandsCountAddress, uint32_t maxDecompressionCount, uint32_t stride)} */
    public static void vkCmdDecompressMemoryIndirectCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkMemoryDecompressionMethodFlagsEXT") long decompressionMethod, @NativeType("VkDeviceAddress") long indirectCommandsAddress, @NativeType("VkDeviceAddress") long indirectCommandsCountAddress, @NativeType("uint32_t") int maxDecompressionCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecompressMemoryIndirectCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJV(commandBuffer.address(), decompressionMethod, indirectCommandsAddress, indirectCommandsCountAddress, maxDecompressionCount, stride, __functionAddress);
    }

}