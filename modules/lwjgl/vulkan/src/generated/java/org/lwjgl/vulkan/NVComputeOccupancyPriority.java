/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVComputeOccupancyPriority {

    public static final int VK_NV_COMPUTE_OCCUPANCY_PRIORITY_SPEC_VERSION = 1;

    public static final String VK_NV_COMPUTE_OCCUPANCY_PRIORITY_EXTENSION_NAME = "VK_NV_compute_occupancy_priority";

    public static final float
        VK_COMPUTE_OCCUPANCY_PRIORITY_LOW_NV    = 0.25f,
        VK_COMPUTE_OCCUPANCY_PRIORITY_NORMAL_NV = 0.50f,
        VK_COMPUTE_OCCUPANCY_PRIORITY_HIGH_NV   = 0.75f;

    public static final int
        VK_STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV               = 1000645000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV = 1000645001;

    protected NVComputeOccupancyPriority() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetComputeOccupancyPriorityNV ] ---

    /** {@code void vkCmdSetComputeOccupancyPriorityNV(VkCommandBuffer commandBuffer, VkComputeOccupancyPriorityParametersNV const * pParameters)} */
    public static void nvkCmdSetComputeOccupancyPriorityNV(VkCommandBuffer commandBuffer, long pParameters) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetComputeOccupancyPriorityNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pParameters, __functionAddress);
    }

    /** {@code void vkCmdSetComputeOccupancyPriorityNV(VkCommandBuffer commandBuffer, VkComputeOccupancyPriorityParametersNV const * pParameters)} */
    public static void vkCmdSetComputeOccupancyPriorityNV(VkCommandBuffer commandBuffer, @NativeType("VkComputeOccupancyPriorityParametersNV const *") VkComputeOccupancyPriorityParametersNV pParameters) {
        nvkCmdSetComputeOccupancyPriorityNV(commandBuffer, pParameters.address());
    }

}