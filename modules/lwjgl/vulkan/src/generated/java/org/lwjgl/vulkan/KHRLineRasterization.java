/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRLineRasterization {

    public static final int VK_KHR_LINE_RASTERIZATION_SPEC_VERSION = 1;

    public static final String VK_KHR_LINE_RASTERIZATION_EXTENSION_NAME = "VK_KHR_line_rasterization";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR   = 1000259000,
        VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR = 1000259001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_KHR = 1000259002;

    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE_KHR = 1000259000;

    public static final int
        VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR            = 0,
        VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR        = 1,
        VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR          = 2,
        VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR = 3;

    protected KHRLineRasterization() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetLineStippleKHR ] ---

    /** {@code void vkCmdSetLineStippleKHR(VkCommandBuffer commandBuffer, uint32_t lineStippleFactor, uint16_t lineStipplePattern)} */
    public static void vkCmdSetLineStippleKHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int lineStippleFactor, @NativeType("uint16_t") short lineStipplePattern) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStippleKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPCV(commandBuffer.address(), lineStippleFactor, lineStipplePattern, __functionAddress);
    }

}