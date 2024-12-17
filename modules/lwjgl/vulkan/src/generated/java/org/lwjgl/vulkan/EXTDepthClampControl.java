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

public class EXTDepthClampControl {

    public static final int VK_EXT_DEPTH_CLAMP_CONTROL_SPEC_VERSION = 1;

    public static final String VK_EXT_DEPTH_CLAMP_CONTROL_EXTENSION_NAME = "VK_EXT_depth_clamp_control";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT      = 1000582000,
        VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT = 1000582001;

    public static final int VK_DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT = 1000582000;

    protected EXTDepthClampControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetDepthClampRangeEXT ] ---

    /** {@code void vkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, VkDepthClampModeEXT depthClampMode, VkDepthClampRangeEXT const * pDepthClampRange)} */
    public static void nvkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, int depthClampMode, long pDepthClampRange) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClampRangeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), depthClampMode, pDepthClampRange, __functionAddress);
    }

    /** {@code void vkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, VkDepthClampModeEXT depthClampMode, VkDepthClampRangeEXT const * pDepthClampRange)} */
    public static void vkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, @NativeType("VkDepthClampModeEXT") int depthClampMode, @NativeType("VkDepthClampRangeEXT const *") @Nullable VkDepthClampRangeEXT pDepthClampRange) {
        nvkCmdSetDepthClampRangeEXT(commandBuffer, depthClampMode, memAddressSafe(pDepthClampRange));
    }

}