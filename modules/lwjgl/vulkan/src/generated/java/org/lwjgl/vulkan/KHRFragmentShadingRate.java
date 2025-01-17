/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRFragmentShadingRate {

    public static final int VK_KHR_FRAGMENT_SHADING_RATE_SPEC_VERSION = 2;

    public static final String VK_KHR_FRAGMENT_SHADING_RATE_EXTENSION_NAME = "VK_KHR_fragment_shading_rate";

    public static final int VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR = 1000164003;

    public static final int VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR = 1000226000;

    public static final int
        VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR  = 1000044006,
        VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR            = 1000226000,
        VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR = 1000226001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR = 1000226002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR   = 1000226003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR            = 1000226004;

    public static final int VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 0x800000;

    public static final int VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x100;

    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x400000;

    public static final int VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x40000000;

    public static final long VK_FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x40000000L;

    public static final int
        VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR           = 0x200000,
        VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x200000;

    public static final int
        VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR    = 0,
        VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR = 1,
        VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR     = 2,
        VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR     = 3,
        VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR     = 4;

    protected KHRFragmentShadingRate() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceFragmentShadingRatesKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, uint32_t * pFragmentShadingRateCount, VkPhysicalDeviceFragmentShadingRateKHR * pFragmentShadingRates)} */
    public static int nvkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, long pFragmentShadingRateCount, long pFragmentShadingRates) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFragmentShadingRatesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pFragmentShadingRateCount, pFragmentShadingRates, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, uint32_t * pFragmentShadingRateCount, VkPhysicalDeviceFragmentShadingRateKHR * pFragmentShadingRates)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pFragmentShadingRateCount, @NativeType("VkPhysicalDeviceFragmentShadingRateKHR *") VkPhysicalDeviceFragmentShadingRateKHR.@Nullable Buffer pFragmentShadingRates) {
        if (CHECKS) {
            check(pFragmentShadingRateCount, 1);
            checkSafe(pFragmentShadingRates, pFragmentShadingRateCount.get(pFragmentShadingRateCount.position()));
        }
        return nvkGetPhysicalDeviceFragmentShadingRatesKHR(physicalDevice, memAddress(pFragmentShadingRateCount), memAddressSafe(pFragmentShadingRates));
    }

    // --- [ vkCmdSetFragmentShadingRateKHR ] ---

    /** {@code void vkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, VkExtent2D const * pFragmentSize, VkFragmentShadingRateCombinerOpKHR const * combinerOps)} */
    public static void nvkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, long pFragmentSize, long combinerOps) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFragmentShadingRateKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pFragmentSize, combinerOps, __functionAddress);
    }

    /** {@code void vkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, VkExtent2D const * pFragmentSize, VkFragmentShadingRateCombinerOpKHR const * combinerOps)} */
    public static void vkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, @NativeType("VkExtent2D const *") VkExtent2D pFragmentSize, @NativeType("VkFragmentShadingRateCombinerOpKHR const *") IntBuffer combinerOps) {
        if (CHECKS) {
            check(combinerOps, 2);
        }
        nvkCmdSetFragmentShadingRateKHR(commandBuffer, pFragmentSize.address(), memAddress(combinerOps));
    }

    /** {@code VkResult vkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, uint32_t * pFragmentShadingRateCount, VkPhysicalDeviceFragmentShadingRateKHR * pFragmentShadingRates)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pFragmentShadingRateCount, @NativeType("VkPhysicalDeviceFragmentShadingRateKHR *") VkPhysicalDeviceFragmentShadingRateKHR.@Nullable Buffer pFragmentShadingRates) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFragmentShadingRatesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pFragmentShadingRateCount, 1);
            checkSafe(pFragmentShadingRates, pFragmentShadingRateCount[0]);
        }
        return callPPPI(physicalDevice.address(), pFragmentShadingRateCount, memAddressSafe(pFragmentShadingRates), __functionAddress);
    }

    /** {@code void vkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, VkExtent2D const * pFragmentSize, VkFragmentShadingRateCombinerOpKHR const * combinerOps)} */
    public static void vkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, @NativeType("VkExtent2D const *") VkExtent2D pFragmentSize, @NativeType("VkFragmentShadingRateCombinerOpKHR const *") int[] combinerOps) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFragmentShadingRateKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(combinerOps, 2);
        }
        callPPPV(commandBuffer.address(), pFragmentSize.address(), combinerOps, __functionAddress);
    }

}