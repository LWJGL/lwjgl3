/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class QCOMTileMemoryHeap {

    public static final int VK_QCOM_TILE_MEMORY_HEAP_SPEC_VERSION = 1;

    public static final String VK_QCOM_TILE_MEMORY_HEAP_EXTENSION_NAME = "VK_QCOM_tile_memory_heap";

    public static final int VK_MEMORY_HEAP_TILE_MEMORY_BIT_QCOM = 0x8;

    public static final int VK_BUFFER_USAGE_TILE_MEMORY_QCOM = 0x8000000;

    public static final long VK_BUFFER_USAGE_2_TILE_MEMORY_QCOM = 0x8000000L;

    public static final int VK_IMAGE_USAGE_TILE_MEMORY_QCOM = 0x8000000;

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM   = 1000547000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM = 1000547001,
        VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM                    = 1000547002,
        VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM                       = 1000547003,
        VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM                       = 1000547004;

    protected QCOMTileMemoryHeap() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindTileMemoryQCOM ] ---

    /** {@code void vkCmdBindTileMemoryQCOM(VkCommandBuffer commandBuffer, VkTileMemoryBindInfoQCOM const * pTileMemoryBindInfo)} */
    public static void nvkCmdBindTileMemoryQCOM(VkCommandBuffer commandBuffer, long pTileMemoryBindInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTileMemoryQCOM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pTileMemoryBindInfo, __functionAddress);
    }

    /** {@code void vkCmdBindTileMemoryQCOM(VkCommandBuffer commandBuffer, VkTileMemoryBindInfoQCOM const * pTileMemoryBindInfo)} */
    public static void vkCmdBindTileMemoryQCOM(VkCommandBuffer commandBuffer, @NativeType("VkTileMemoryBindInfoQCOM const *") @Nullable VkTileMemoryBindInfoQCOM pTileMemoryBindInfo) {
        nvkCmdBindTileMemoryQCOM(commandBuffer, memAddressSafe(pTileMemoryBindInfo));
    }

}