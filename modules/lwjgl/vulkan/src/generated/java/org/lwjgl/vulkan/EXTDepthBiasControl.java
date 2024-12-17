/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTDepthBiasControl {

    public static final int VK_EXT_DEPTH_BIAS_CONTROL_SPEC_VERSION = 1;

    public static final String VK_EXT_DEPTH_BIAS_CONTROL_EXTENSION_NAME = "VK_EXT_depth_bias_control";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT = 1000283000,
        VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT                             = 1000283001,
        VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT              = 1000283002;

    public static final int
        VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT      = 0,
        VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT = 1,
        VK_DEPTH_BIAS_REPRESENTATION_FLOAT_EXT                                 = 2;

    protected EXTDepthBiasControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetDepthBias2EXT ] ---

    /** {@code void vkCmdSetDepthBias2EXT(VkCommandBuffer commandBuffer, VkDepthBiasInfoEXT const * pDepthBiasInfo)} */
    public static void nvkCmdSetDepthBias2EXT(VkCommandBuffer commandBuffer, long pDepthBiasInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBias2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pDepthBiasInfo, __functionAddress);
    }

    /** {@code void vkCmdSetDepthBias2EXT(VkCommandBuffer commandBuffer, VkDepthBiasInfoEXT const * pDepthBiasInfo)} */
    public static void vkCmdSetDepthBias2EXT(VkCommandBuffer commandBuffer, @NativeType("VkDepthBiasInfoEXT const *") VkDepthBiasInfoEXT pDepthBiasInfo) {
        nvkCmdSetDepthBias2EXT(commandBuffer, pDepthBiasInfo.address());
    }

}