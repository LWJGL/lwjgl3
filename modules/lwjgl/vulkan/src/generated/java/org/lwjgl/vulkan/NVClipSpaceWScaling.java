/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVClipSpaceWScaling {

    public static final int VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION = 1;

    public static final String VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME = "VK_NV_clip_space_w_scaling";

    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV = 1000087000;

    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV = 1000087000;

    protected NVClipSpaceWScaling() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetViewportWScalingNV ] ---

    /** {@code void vkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, VkViewportWScalingNV const * pViewportWScalings)} */
    public static void nvkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewportWScalings) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWScalingNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstViewport, viewportCount, pViewportWScalings, __functionAddress);
    }

    /** {@code void vkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, VkViewportWScalingNV const * pViewportWScalings)} */
    public static void vkCmdSetViewportWScalingNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkViewportWScalingNV const *") VkViewportWScalingNV.Buffer pViewportWScalings) {
        nvkCmdSetViewportWScalingNV(commandBuffer, firstViewport, pViewportWScalings.remaining(), pViewportWScalings.address());
    }

}