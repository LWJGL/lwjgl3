/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTDiscardRectangles {

    public static final int VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION = 2;

    public static final String VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME = "VK_EXT_discard_rectangles";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT = 1000099000,
        VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT = 1000099001;

    public static final int
        VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT        = 1000099000,
        VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT = 1000099001,
        VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT   = 1000099002;

    public static final int
        VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = 0,
        VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = 1;

    protected EXTDiscardRectangles() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetDiscardRectangleEXT ] ---

    /** {@code void vkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, uint32_t firstDiscardRectangle, uint32_t discardRectangleCount, VkRect2D const * pDiscardRectangles)} */
    public static void nvkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, int firstDiscardRectangle, int discardRectangleCount, long pDiscardRectangles) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDiscardRectangleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstDiscardRectangle, discardRectangleCount, pDiscardRectangles, __functionAddress);
    }

    /** {@code void vkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, uint32_t firstDiscardRectangle, uint32_t discardRectangleCount, VkRect2D const * pDiscardRectangles)} */
    public static void vkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstDiscardRectangle, @NativeType("VkRect2D const *") VkRect2D.Buffer pDiscardRectangles) {
        nvkCmdSetDiscardRectangleEXT(commandBuffer, firstDiscardRectangle, pDiscardRectangles.remaining(), pDiscardRectangles.address());
    }

    // --- [ vkCmdSetDiscardRectangleEnableEXT ] ---

    /** {@code void vkCmdSetDiscardRectangleEnableEXT(VkCommandBuffer commandBuffer, VkBool32 discardRectangleEnable)} */
    public static void vkCmdSetDiscardRectangleEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean discardRectangleEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDiscardRectangleEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), discardRectangleEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDiscardRectangleModeEXT ] ---

    /** {@code void vkCmdSetDiscardRectangleModeEXT(VkCommandBuffer commandBuffer, VkDiscardRectangleModeEXT discardRectangleMode)} */
    public static void vkCmdSetDiscardRectangleModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkDiscardRectangleModeEXT") int discardRectangleMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDiscardRectangleModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), discardRectangleMode, __functionAddress);
    }

}