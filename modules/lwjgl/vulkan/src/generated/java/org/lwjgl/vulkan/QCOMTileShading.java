/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class QCOMTileShading {

    public static final int VK_QCOM_TILE_SHADING_SPEC_VERSION = 1;

    public static final String VK_QCOM_TILE_SHADING_EXTENSION_NAME = "VK_QCOM_tile_shading";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM   = 1000309000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM = 1000309001,
        VK_STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM    = 1000309002,
        VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM                     = 1000309003,
        VK_STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM                       = 1000309004,
        VK_STRUCTURE_TYPE_DISPATCH_TILE_INFO_QCOM                      = 1000309005;

    public static final long
        VK_ACCESS_2_SHADER_TILE_ATTACHMENT_READ_BIT_QCOM  = 0x8000000000000L,
        VK_ACCESS_2_SHADER_TILE_ATTACHMENT_WRITE_BIT_QCOM = 0x10000000000000L;

    public static final int VK_SUBPASS_DESCRIPTION_TILE_SHADING_APRON_BIT_QCOM = 0x100;

    public static final int
        VK_TILE_SHADING_RENDER_PASS_ENABLE_BIT_QCOM             = 0x1,
        VK_TILE_SHADING_RENDER_PASS_PER_TILE_EXECUTION_BIT_QCOM = 0x2;

    protected QCOMTileShading() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDispatchTileQCOM ] ---

    /** {@code void vkCmdDispatchTileQCOM(VkCommandBuffer commandBuffer)} */
    public static void vkCmdDispatchTileQCOM(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchTileQCOM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

    // --- [ vkCmdBeginPerTileExecutionQCOM ] ---

    /** {@code void vkCmdBeginPerTileExecutionQCOM(VkCommandBuffer commandBuffer, VkPerTileBeginInfoQCOM const * pPerTileBeginInfo)} */
    public static void nvkCmdBeginPerTileExecutionQCOM(VkCommandBuffer commandBuffer, long pPerTileBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginPerTileExecutionQCOM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pPerTileBeginInfo, __functionAddress);
    }

    /** {@code void vkCmdBeginPerTileExecutionQCOM(VkCommandBuffer commandBuffer, VkPerTileBeginInfoQCOM const * pPerTileBeginInfo)} */
    public static void vkCmdBeginPerTileExecutionQCOM(VkCommandBuffer commandBuffer, @NativeType("VkPerTileBeginInfoQCOM const *") VkPerTileBeginInfoQCOM pPerTileBeginInfo) {
        nvkCmdBeginPerTileExecutionQCOM(commandBuffer, pPerTileBeginInfo.address());
    }

    // --- [ vkCmdEndPerTileExecutionQCOM ] ---

    /** {@code void vkCmdEndPerTileExecutionQCOM(VkCommandBuffer commandBuffer, VkPerTileEndInfoQCOM const * pPerTileEndInfo)} */
    public static void nvkCmdEndPerTileExecutionQCOM(VkCommandBuffer commandBuffer, long pPerTileEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndPerTileExecutionQCOM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pPerTileEndInfo, __functionAddress);
    }

    /** {@code void vkCmdEndPerTileExecutionQCOM(VkCommandBuffer commandBuffer, VkPerTileEndInfoQCOM const * pPerTileEndInfo)} */
    public static void vkCmdEndPerTileExecutionQCOM(VkCommandBuffer commandBuffer, @NativeType("VkPerTileEndInfoQCOM const *") VkPerTileEndInfoQCOM pPerTileEndInfo) {
        nvkCmdEndPerTileExecutionQCOM(commandBuffer, pPerTileEndInfo.address());
    }

}