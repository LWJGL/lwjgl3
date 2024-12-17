/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTExtendedDynamicState2 {

    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_2_SPEC_VERSION = 1;

    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_2_EXTENSION_NAME = "VK_EXT_extended_dynamic_state2";

    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT = 1000377000;

    public static final int
        VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT      = 1000377000,
        VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT = 1000377001,
        VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT         = 1000377002,
        VK_DYNAMIC_STATE_LOGIC_OP_EXT                  = 1000377003,
        VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT  = 1000377004;

    protected EXTExtendedDynamicState2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetPatchControlPointsEXT ] ---

    /** {@code void vkCmdSetPatchControlPointsEXT(VkCommandBuffer commandBuffer, uint32_t patchControlPoints)} */
    public static void vkCmdSetPatchControlPointsEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int patchControlPoints) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPatchControlPointsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), patchControlPoints, __functionAddress);
    }

    // --- [ vkCmdSetRasterizerDiscardEnableEXT ] ---

    /** {@code void vkCmdSetRasterizerDiscardEnableEXT(VkCommandBuffer commandBuffer, VkBool32 rasterizerDiscardEnable)} */
    public static void vkCmdSetRasterizerDiscardEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean rasterizerDiscardEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizerDiscardEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizerDiscardEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthBiasEnableEXT ] ---

    /** {@code void vkCmdSetDepthBiasEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthBiasEnable)} */
    public static void vkCmdSetDepthBiasEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBiasEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBiasEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBiasEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetLogicOpEXT ] ---

    /** {@code void vkCmdSetLogicOpEXT(VkCommandBuffer commandBuffer, VkLogicOp logicOp)} */
    public static void vkCmdSetLogicOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkLogicOp") int logicOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLogicOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), logicOp, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveRestartEnableEXT ] ---

    /** {@code void vkCmdSetPrimitiveRestartEnableEXT(VkCommandBuffer commandBuffer, VkBool32 primitiveRestartEnable)} */
    public static void vkCmdSetPrimitiveRestartEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean primitiveRestartEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveRestartEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveRestartEnable ? 1 : 0, __functionAddress);
    }

}