/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTConditionalRendering {

    public static final int VK_EXT_CONDITIONAL_RENDERING_SPEC_VERSION = 2;

    public static final String VK_EXT_CONDITIONAL_RENDERING_EXTENSION_NAME = "VK_EXT_conditional_rendering";

    public static final int
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT = 1000081000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT        = 1000081001,
        VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT                      = 1000081002;

    public static final int VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT = 0x100000;

    public static final int VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT = 0x200;

    public static final int VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT = 0x40000;

    public static final int VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT = 0x1;

    protected EXTConditionalRendering() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBeginConditionalRenderingEXT ] ---

    /** {@code void vkCmdBeginConditionalRenderingEXT(VkCommandBuffer commandBuffer, VkConditionalRenderingBeginInfoEXT const * pConditionalRenderingBegin)} */
    public static void nvkCmdBeginConditionalRenderingEXT(VkCommandBuffer commandBuffer, long pConditionalRenderingBegin) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginConditionalRenderingEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pConditionalRenderingBegin, __functionAddress);
    }

    /** {@code void vkCmdBeginConditionalRenderingEXT(VkCommandBuffer commandBuffer, VkConditionalRenderingBeginInfoEXT const * pConditionalRenderingBegin)} */
    public static void vkCmdBeginConditionalRenderingEXT(VkCommandBuffer commandBuffer, @NativeType("VkConditionalRenderingBeginInfoEXT const *") VkConditionalRenderingBeginInfoEXT pConditionalRenderingBegin) {
        nvkCmdBeginConditionalRenderingEXT(commandBuffer, pConditionalRenderingBegin.address());
    }

    // --- [ vkCmdEndConditionalRenderingEXT ] ---

    /** {@code void vkCmdEndConditionalRenderingEXT(VkCommandBuffer commandBuffer)} */
    public static void vkCmdEndConditionalRenderingEXT(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndConditionalRenderingEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

}