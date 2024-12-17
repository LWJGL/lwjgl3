/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRDynamicRendering {

    public static final int VK_KHR_DYNAMIC_RENDERING_SPEC_VERSION = 1;

    public static final String VK_KHR_DYNAMIC_RENDERING_EXTENSION_NAME = "VK_KHR_dynamic_rendering";

    public static final int
        VK_STRUCTURE_TYPE_RENDERING_INFO_KHR                             = 1000044000,
        VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO_KHR                  = 1000044001,
        VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO_KHR             = 1000044002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR = 1000044003,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO_KHR  = 1000044004;

    public static final int VK_ATTACHMENT_STORE_OP_NONE_KHR = 1000301000;

    public static final int
        VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR = 0x1,
        VK_RENDERING_SUSPENDING_BIT_KHR                         = 0x2,
        VK_RENDERING_RESUMING_BIT_KHR                           = 0x4;

    protected KHRDynamicRendering() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBeginRenderingKHR ] ---

    /** {@code void vkCmdBeginRenderingKHR(VkCommandBuffer commandBuffer, VkRenderingInfo const * pRenderingInfo)} */
    public static void nvkCmdBeginRenderingKHR(VkCommandBuffer commandBuffer, long pRenderingInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderingKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderingInfo.validate(pRenderingInfo);
        }
        callPPV(commandBuffer.address(), pRenderingInfo, __functionAddress);
    }

    /** {@code void vkCmdBeginRenderingKHR(VkCommandBuffer commandBuffer, VkRenderingInfo const * pRenderingInfo)} */
    public static void vkCmdBeginRenderingKHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInfo const *") VkRenderingInfo pRenderingInfo) {
        nvkCmdBeginRenderingKHR(commandBuffer, pRenderingInfo.address());
    }

    // --- [ vkCmdEndRenderingKHR ] ---

    /** {@code void vkCmdEndRenderingKHR(VkCommandBuffer commandBuffer)} */
    public static void vkCmdEndRenderingKHR(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderingKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

}