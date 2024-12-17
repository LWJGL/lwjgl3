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

public class NVFragmentShadingRateEnums {

    public static final int VK_NV_FRAGMENT_SHADING_RATE_ENUMS_SPEC_VERSION = 1;

    public static final String VK_NV_FRAGMENT_SHADING_RATE_ENUMS_EXTENSION_NAME = "VK_NV_fragment_shading_rate_enums";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV = 1000326000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV   = 1000326001,
        VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV  = 1000326002;

    public static final int
        VK_FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV = 0,
        VK_FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV         = 1;

    public static final int
        VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV      = 0,
        VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV = 1,
        VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV = 4,
        VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV = 5,
        VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV = 6,
        VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV = 9,
        VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV = 10,
        VK_FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV     = 11,
        VK_FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV     = 12,
        VK_FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV     = 13,
        VK_FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV    = 14,
        VK_FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV              = 15;

    protected NVFragmentShadingRateEnums() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetFragmentShadingRateEnumNV ] ---

    /** {@code void vkCmdSetFragmentShadingRateEnumNV(VkCommandBuffer commandBuffer, VkFragmentShadingRateNV shadingRate, VkFragmentShadingRateCombinerOpKHR const * combinerOps)} */
    public static void nvkCmdSetFragmentShadingRateEnumNV(VkCommandBuffer commandBuffer, int shadingRate, long combinerOps) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFragmentShadingRateEnumNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), shadingRate, combinerOps, __functionAddress);
    }

    /** {@code void vkCmdSetFragmentShadingRateEnumNV(VkCommandBuffer commandBuffer, VkFragmentShadingRateNV shadingRate, VkFragmentShadingRateCombinerOpKHR const * combinerOps)} */
    public static void vkCmdSetFragmentShadingRateEnumNV(VkCommandBuffer commandBuffer, @NativeType("VkFragmentShadingRateNV") int shadingRate, @NativeType("VkFragmentShadingRateCombinerOpKHR const *") IntBuffer combinerOps) {
        if (CHECKS) {
            check(combinerOps, 2);
        }
        nvkCmdSetFragmentShadingRateEnumNV(commandBuffer, shadingRate, memAddress(combinerOps));
    }

    /** {@code void vkCmdSetFragmentShadingRateEnumNV(VkCommandBuffer commandBuffer, VkFragmentShadingRateNV shadingRate, VkFragmentShadingRateCombinerOpKHR const * combinerOps)} */
    public static void vkCmdSetFragmentShadingRateEnumNV(VkCommandBuffer commandBuffer, @NativeType("VkFragmentShadingRateNV") int shadingRate, @NativeType("VkFragmentShadingRateCombinerOpKHR const *") int[] combinerOps) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFragmentShadingRateEnumNV;
        if (CHECKS) {
            check(__functionAddress);
            check(combinerOps, 2);
        }
        callPPV(commandBuffer.address(), shadingRate, combinerOps, __functionAddress);
    }

}