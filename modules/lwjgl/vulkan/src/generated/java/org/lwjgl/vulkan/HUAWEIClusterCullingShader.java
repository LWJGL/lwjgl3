/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class HUAWEIClusterCullingShader {

    public static final int VK_HUAWEI_CLUSTER_CULLING_SHADER_SPEC_VERSION = 3;

    public static final String VK_HUAWEI_CLUSTER_CULLING_SHADER_EXTENSION_NAME = "VK_HUAWEI_cluster_culling_shader";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI     = 1000404000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI   = 1000404001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI = 1000404002;

    public static final long VK_PIPELINE_STAGE_2_CLUSTER_CULLING_SHADER_BIT_HUAWEI = 0x20000000000L;

    public static final int VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI = 0x80000;

    public static final int VK_QUERY_PIPELINE_STATISTIC_CLUSTER_CULLING_SHADER_INVOCATIONS_BIT_HUAWEI = 0x2000;

    protected HUAWEIClusterCullingShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDrawClusterHUAWEI ] ---

    /** {@code void vkCmdDrawClusterHUAWEI(VkCommandBuffer commandBuffer, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ)} */
    public static void vkCmdDrawClusterHUAWEI(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawClusterHUAWEI;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), groupCountX, groupCountY, groupCountZ, __functionAddress);
    }

    // --- [ vkCmdDrawClusterIndirectHUAWEI ] ---

    /** {@code void vkCmdDrawClusterIndirectHUAWEI(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset)} */
    public static void vkCmdDrawClusterIndirectHUAWEI(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawClusterIndirectHUAWEI;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), buffer, offset, __functionAddress);
    }

}