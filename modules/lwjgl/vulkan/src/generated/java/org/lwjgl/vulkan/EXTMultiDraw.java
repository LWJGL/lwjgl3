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

public class EXTMultiDraw {

    public static final int VK_EXT_MULTI_DRAW_SPEC_VERSION = 1;

    public static final String VK_EXT_MULTI_DRAW_EXTENSION_NAME = "VK_EXT_multi_draw";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT   = 1000392000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_PROPERTIES_EXT = 1000392001;

    protected EXTMultiDraw() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDrawMultiEXT ] ---

    /** {@code void vkCmdDrawMultiEXT(VkCommandBuffer commandBuffer, uint32_t drawCount, VkMultiDrawInfoEXT const * pVertexInfo, uint32_t instanceCount, uint32_t firstInstance, uint32_t stride)} */
    public static void nvkCmdDrawMultiEXT(VkCommandBuffer commandBuffer, int drawCount, long pVertexInfo, int instanceCount, int firstInstance, int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMultiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), drawCount, pVertexInfo, instanceCount, firstInstance, stride, __functionAddress);
    }

    /** {@code void vkCmdDrawMultiEXT(VkCommandBuffer commandBuffer, uint32_t drawCount, VkMultiDrawInfoEXT const * pVertexInfo, uint32_t instanceCount, uint32_t firstInstance, uint32_t stride)} */
    public static void vkCmdDrawMultiEXT(VkCommandBuffer commandBuffer, @NativeType("VkMultiDrawInfoEXT const *") VkMultiDrawInfoEXT.@Nullable Buffer pVertexInfo, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("uint32_t") int stride) {
        nvkCmdDrawMultiEXT(commandBuffer, remainingSafe(pVertexInfo), memAddressSafe(pVertexInfo), instanceCount, firstInstance, stride);
    }

    // --- [ vkCmdDrawMultiIndexedEXT ] ---

    /** {@code void vkCmdDrawMultiIndexedEXT(VkCommandBuffer commandBuffer, uint32_t drawCount, VkMultiDrawIndexedInfoEXT const * pIndexInfo, uint32_t instanceCount, uint32_t firstInstance, uint32_t stride, int32_t const * pVertexOffset)} */
    public static void nvkCmdDrawMultiIndexedEXT(VkCommandBuffer commandBuffer, int drawCount, long pIndexInfo, int instanceCount, int firstInstance, int stride, long pVertexOffset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMultiIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), drawCount, pIndexInfo, instanceCount, firstInstance, stride, pVertexOffset, __functionAddress);
    }

    /** {@code void vkCmdDrawMultiIndexedEXT(VkCommandBuffer commandBuffer, uint32_t drawCount, VkMultiDrawIndexedInfoEXT const * pIndexInfo, uint32_t instanceCount, uint32_t firstInstance, uint32_t stride, int32_t const * pVertexOffset)} */
    public static void vkCmdDrawMultiIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkMultiDrawIndexedInfoEXT const *") VkMultiDrawIndexedInfoEXT.@Nullable Buffer pIndexInfo, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("uint32_t") int stride, @NativeType("int32_t const *") @Nullable IntBuffer pVertexOffset) {
        nvkCmdDrawMultiIndexedEXT(commandBuffer, remainingSafe(pIndexInfo), memAddressSafe(pIndexInfo), instanceCount, firstInstance, stride, memAddressSafe(pVertexOffset));
    }

    /** {@code void vkCmdDrawMultiIndexedEXT(VkCommandBuffer commandBuffer, uint32_t drawCount, VkMultiDrawIndexedInfoEXT const * pIndexInfo, uint32_t instanceCount, uint32_t firstInstance, uint32_t stride, int32_t const * pVertexOffset)} */
    public static void vkCmdDrawMultiIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkMultiDrawIndexedInfoEXT const *") VkMultiDrawIndexedInfoEXT.@Nullable Buffer pIndexInfo, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("uint32_t") int stride, @NativeType("int32_t const *") int @Nullable [] pVertexOffset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMultiIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), remainingSafe(pIndexInfo), memAddressSafe(pIndexInfo), instanceCount, firstInstance, stride, pVertexOffset, __functionAddress);
    }

}