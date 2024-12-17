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

public class NVShadingRateImage {

    public static final int VK_NV_SHADING_RATE_IMAGE_SPEC_VERSION = 3;

    public static final String VK_NV_SHADING_RATE_IMAGE_EXTENSION_NAME = "VK_NV_shading_rate_image";

    public static final int
        VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV  = 1000164000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV             = 1000164001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV           = 1000164002,
        VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV = 1000164005;

    public static final int VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV = 1000164003;

    public static final int
        VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV = 1000164004,
        VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV  = 1000164006;

    public static final int VK_ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV = 0x800000;

    public static final int VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV = 0x100;

    public static final int VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV = 0x400000;

    public static final int
        VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV              = 0,
        VK_SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV    = 1,
        VK_SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV     = 2,
        VK_SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV     = 3,
        VK_SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV     = 4,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV      = 5,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV = 6,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV = 7,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV = 8,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV = 9,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV = 10,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV = 11;

    public static final int
        VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV      = 0,
        VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV       = 1,
        VK_COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV  = 2,
        VK_COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV = 3;

    protected NVShadingRateImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindShadingRateImageNV ] ---

    /** {@code void vkCmdBindShadingRateImageNV(VkCommandBuffer commandBuffer, VkImageView imageView, VkImageLayout imageLayout)} */
    public static void vkCmdBindShadingRateImageNV(VkCommandBuffer commandBuffer, @NativeType("VkImageView") long imageView, @NativeType("VkImageLayout") int imageLayout) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindShadingRateImageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), imageView, imageLayout, __functionAddress);
    }

    // --- [ vkCmdSetViewportShadingRatePaletteNV ] ---

    /** {@code void vkCmdSetViewportShadingRatePaletteNV(VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, VkShadingRatePaletteNV const * pShadingRatePalettes)} */
    public static void nvkCmdSetViewportShadingRatePaletteNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pShadingRatePalettes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportShadingRatePaletteNV;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pShadingRatePalettes, viewportCount, VkShadingRatePaletteNV.SIZEOF, VkShadingRatePaletteNV::validate);
        }
        callPPV(commandBuffer.address(), firstViewport, viewportCount, pShadingRatePalettes, __functionAddress);
    }

    /** {@code void vkCmdSetViewportShadingRatePaletteNV(VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, VkShadingRatePaletteNV const * pShadingRatePalettes)} */
    public static void vkCmdSetViewportShadingRatePaletteNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkShadingRatePaletteNV const *") VkShadingRatePaletteNV.Buffer pShadingRatePalettes) {
        nvkCmdSetViewportShadingRatePaletteNV(commandBuffer, firstViewport, pShadingRatePalettes.remaining(), pShadingRatePalettes.address());
    }

    // --- [ vkCmdSetCoarseSampleOrderNV ] ---

    /** {@code void vkCmdSetCoarseSampleOrderNV(VkCommandBuffer commandBuffer, VkCoarseSampleOrderTypeNV sampleOrderType, uint32_t customSampleOrderCount, VkCoarseSampleOrderCustomNV const * pCustomSampleOrders)} */
    public static void nvkCmdSetCoarseSampleOrderNV(VkCommandBuffer commandBuffer, int sampleOrderType, int customSampleOrderCount, long pCustomSampleOrders) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoarseSampleOrderNV;
        if (CHECKS) {
            check(__functionAddress);
            if (pCustomSampleOrders != NULL) { Struct.validate(pCustomSampleOrders, customSampleOrderCount, VkCoarseSampleOrderCustomNV.SIZEOF, VkCoarseSampleOrderCustomNV::validate); }
        }
        callPPV(commandBuffer.address(), sampleOrderType, customSampleOrderCount, pCustomSampleOrders, __functionAddress);
    }

    /** {@code void vkCmdSetCoarseSampleOrderNV(VkCommandBuffer commandBuffer, VkCoarseSampleOrderTypeNV sampleOrderType, uint32_t customSampleOrderCount, VkCoarseSampleOrderCustomNV const * pCustomSampleOrders)} */
    public static void vkCmdSetCoarseSampleOrderNV(VkCommandBuffer commandBuffer, @NativeType("VkCoarseSampleOrderTypeNV") int sampleOrderType, @NativeType("VkCoarseSampleOrderCustomNV const *") VkCoarseSampleOrderCustomNV.@Nullable Buffer pCustomSampleOrders) {
        nvkCmdSetCoarseSampleOrderNV(commandBuffer, sampleOrderType, remainingSafe(pCustomSampleOrders), memAddressSafe(pCustomSampleOrders));
    }

}