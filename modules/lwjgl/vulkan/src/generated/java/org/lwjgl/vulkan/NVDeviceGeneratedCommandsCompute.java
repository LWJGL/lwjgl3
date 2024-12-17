/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVDeviceGeneratedCommandsCompute {

    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_SPEC_VERSION = 2;

    public static final String VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME = "VK_NV_device_generated_commands_compute";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV = 1000428000,
        VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV                      = 1000428001,
        VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV                      = 1000428002;

    public static final int
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV = 1000428003,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV = 1000428004;

    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_BIT_NV = 0x80;

    protected NVDeviceGeneratedCommandsCompute() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPipelineIndirectMemoryRequirementsNV ] ---

    /** {@code void vkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, VkComputePipelineCreateInfo const * pCreateInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, long pCreateInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetPipelineIndirectMemoryRequirementsNV;
        if (CHECKS) {
            check(__functionAddress);
            VkComputePipelineCreateInfo.validate(pCreateInfo);
        }
        callPPPV(device.address(), pCreateInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, VkComputePipelineCreateInfo const * pCreateInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, @NativeType("VkComputePipelineCreateInfo const *") VkComputePipelineCreateInfo pCreateInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetPipelineIndirectMemoryRequirementsNV(device, pCreateInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkCmdUpdatePipelineIndirectBufferNV ] ---

    /** {@code void vkCmdUpdatePipelineIndirectBufferNV(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipeline pipeline)} */
    public static void vkCmdUpdatePipelineIndirectBufferNV(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipeline") long pipeline) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdatePipelineIndirectBufferNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), pipelineBindPoint, pipeline, __functionAddress);
    }

    // --- [ vkGetPipelineIndirectDeviceAddressNV ] ---

    /** {@code VkDeviceAddress vkGetPipelineIndirectDeviceAddressNV(VkDevice device, VkPipelineIndirectDeviceAddressInfoNV const * pInfo)} */
    public static long nvkGetPipelineIndirectDeviceAddressNV(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetPipelineIndirectDeviceAddressNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /** {@code VkDeviceAddress vkGetPipelineIndirectDeviceAddressNV(VkDevice device, VkPipelineIndirectDeviceAddressInfoNV const * pInfo)} */
    @NativeType("VkDeviceAddress")
    public static long vkGetPipelineIndirectDeviceAddressNV(VkDevice device, @NativeType("VkPipelineIndirectDeviceAddressInfoNV const *") VkPipelineIndirectDeviceAddressInfoNV pInfo) {
        return nvkGetPipelineIndirectDeviceAddressNV(device, pInfo.address());
    }

}