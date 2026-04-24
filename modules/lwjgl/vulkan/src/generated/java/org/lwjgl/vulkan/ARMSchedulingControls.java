/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class ARMSchedulingControls {

    public static final int VK_ARM_SCHEDULING_CONTROLS_SPEC_VERSION = 2;

    public static final String VK_ARM_SCHEDULING_CONTROLS_EXTENSION_NAME = "VK_ARM_scheduling_controls";

    public static final int
        VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM                       = 1000417000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM                       = 1000417001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM                     = 1000417002,
        VK_STRUCTURE_TYPE_DISPATCH_PARAMETERS_ARM                                                = 1000417003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_DISPATCH_PARAMETERS_PROPERTIES_ARM = 1000417004;

    public static final long
        VK_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM   = 0x1L,
        VK_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_DISPATCH_PARAMETERS_ARM = 0x2L;

    protected ARMSchedulingControls() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetDispatchParametersARM ] ---

    /** {@code void vkCmdSetDispatchParametersARM(VkCommandBuffer commandBuffer, VkDispatchParametersARM const * pDispatchParameters)} */
    public static void nvkCmdSetDispatchParametersARM(VkCommandBuffer commandBuffer, long pDispatchParameters) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDispatchParametersARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pDispatchParameters, __functionAddress);
    }

    /** {@code void vkCmdSetDispatchParametersARM(VkCommandBuffer commandBuffer, VkDispatchParametersARM const * pDispatchParameters)} */
    public static void vkCmdSetDispatchParametersARM(VkCommandBuffer commandBuffer, @NativeType("VkDispatchParametersARM const *") VkDispatchParametersARM pDispatchParameters) {
        nvkCmdSetDispatchParametersARM(commandBuffer, pDispatchParameters.address());
    }

}