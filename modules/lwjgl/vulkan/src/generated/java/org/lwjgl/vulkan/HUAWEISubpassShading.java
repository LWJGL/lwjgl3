/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class HUAWEISubpassShading {

    public static final int VK_HUAWEI_SUBPASS_SHADING_SPEC_VERSION = 3;

    public static final String VK_HUAWEI_SUBPASS_SHADING_EXTENSION_NAME = "VK_HUAWEI_subpass_shading";

    public static final int
        VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI       = 1000369000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI   = 1000369001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI = 1000369002;

    public static final int VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI = 1000369003;

    public static final long
        VK_PIPELINE_STAGE_2_SUBPASS_SHADER_BIT_HUAWEI  = 0x8000000000L,
        VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI = 0x8000000000L;

    public static final int VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI = 0x4000;

    protected HUAWEISubpassShading() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI ] ---

    /** {@code VkResult vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(VkDevice device, VkRenderPass renderpass, VkExtent2D * pMaxWorkgroupSize)} */
    public static int nvkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(VkDevice device, long renderpass, long pMaxWorkgroupSize) {
        long __functionAddress = device.getCapabilities().vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), renderpass, pMaxWorkgroupSize, __functionAddress);
    }

    /** {@code VkResult vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(VkDevice device, VkRenderPass renderpass, VkExtent2D * pMaxWorkgroupSize)} */
    @NativeType("VkResult")
    public static int vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(VkDevice device, @NativeType("VkRenderPass") long renderpass, @NativeType("VkExtent2D *") VkExtent2D pMaxWorkgroupSize) {
        return nvkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(device, renderpass, pMaxWorkgroupSize.address());
    }

    // --- [ vkCmdSubpassShadingHUAWEI ] ---

    /** {@code void vkCmdSubpassShadingHUAWEI(VkCommandBuffer commandBuffer)} */
    public static void vkCmdSubpassShadingHUAWEI(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSubpassShadingHUAWEI;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

}