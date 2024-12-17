/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRRayTracingMaintenance1 {

    public static final int VK_KHR_RAY_TRACING_MAINTENANCE_1_SPEC_VERSION = 1;

    public static final String VK_KHR_RAY_TRACING_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_ray_tracing_maintenance1";

    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR = 1000386000;

    public static final int
        VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_BOTTOM_LEVEL_POINTERS_KHR = 1000386000,
        VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SIZE_KHR                                = 1000386001;

    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_COPY_BIT_KHR = 0x10000000L;

    public static final long VK_ACCESS_2_SHADER_BINDING_TABLE_READ_BIT_KHR = 0x10000000000L;

    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT = 1000386004;

    protected KHRRayTracingMaintenance1() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdTraceRaysIndirect2KHR ] ---

    /** {@code void vkCmdTraceRaysIndirect2KHR(VkCommandBuffer commandBuffer, VkDeviceAddress indirectDeviceAddress)} */
    public static void vkCmdTraceRaysIndirect2KHR(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long indirectDeviceAddress) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysIndirect2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), indirectDeviceAddress, __functionAddress);
    }

}