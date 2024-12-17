/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVScissorExclusive {

    public static final int VK_NV_SCISSOR_EXCLUSIVE_SPEC_VERSION = 2;

    public static final String VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME = "VK_NV_scissor_exclusive";

    public static final int
        VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV = 1000205000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV            = 1000205002;

    public static final int
        VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV = 1000205000,
        VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV        = 1000205001;

    protected NVScissorExclusive() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetExclusiveScissorEnableNV ] ---

    /** {@code void vkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, uint32_t firstExclusiveScissor, uint32_t exclusiveScissorCount, VkBool32 const * pExclusiveScissorEnables)} */
    public static void nvkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, long pExclusiveScissorEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExclusiveScissorEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissorEnables, __functionAddress);
    }

    /** {@code void vkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, uint32_t firstExclusiveScissor, uint32_t exclusiveScissorCount, VkBool32 const * pExclusiveScissorEnables)} */
    public static void vkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstExclusiveScissor, @NativeType("VkBool32 const *") IntBuffer pExclusiveScissorEnables) {
        nvkCmdSetExclusiveScissorEnableNV(commandBuffer, firstExclusiveScissor, pExclusiveScissorEnables.remaining(), memAddress(pExclusiveScissorEnables));
    }

    // --- [ vkCmdSetExclusiveScissorNV ] ---

    /** {@code void vkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, uint32_t firstExclusiveScissor, uint32_t exclusiveScissorCount, VkRect2D const * pExclusiveScissors)} */
    public static void nvkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, long pExclusiveScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExclusiveScissorNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors, __functionAddress);
    }

    /** {@code void vkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, uint32_t firstExclusiveScissor, uint32_t exclusiveScissorCount, VkRect2D const * pExclusiveScissors)} */
    public static void vkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstExclusiveScissor, @NativeType("VkRect2D const *") VkRect2D.Buffer pExclusiveScissors) {
        nvkCmdSetExclusiveScissorNV(commandBuffer, firstExclusiveScissor, pExclusiveScissors.remaining(), pExclusiveScissors.address());
    }

    /** {@code void vkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, uint32_t firstExclusiveScissor, uint32_t exclusiveScissorCount, VkBool32 const * pExclusiveScissorEnables)} */
    public static void vkCmdSetExclusiveScissorEnableNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstExclusiveScissor, @NativeType("VkBool32 const *") int[] pExclusiveScissorEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExclusiveScissorEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstExclusiveScissor, pExclusiveScissorEnables.length, pExclusiveScissorEnables, __functionAddress);
    }

}