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

public class NVDeviceGeneratedCommands {

    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 3;

    public static final String VK_NV_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_NV_device_generated_commands";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV = 1000277000,
        VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV                    = 1000277001,
        VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV          = 1000277002,
        VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV                       = 1000277003,
        VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV                 = 1000277004,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV                              = 1000277005,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV          = 1000277006,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV   = 1000277007;

    public static final int VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV = 0x40000;

    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV = 0x20000;

    public static final int
        VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV  = 0x20000,
        VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV = 0x40000;

    public static final int VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NV = 1000277000;

    public static final int VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV = 0x1;

    public static final int
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV  = 0,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV   = 1,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV  = 2,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV = 3,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV = 4,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV  = 5,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV          = 6,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV    = 7;

    public static final int
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV = 0x1,
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV   = 0x2,
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV = 0x4;

    protected NVDeviceGeneratedCommands() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetGeneratedCommandsMemoryRequirementsNV ] ---

    /** {@code void vkGetGeneratedCommandsMemoryRequirementsNV(VkDevice device, VkGeneratedCommandsMemoryRequirementsInfoNV const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetGeneratedCommandsMemoryRequirementsNV(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetGeneratedCommandsMemoryRequirementsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetGeneratedCommandsMemoryRequirementsNV(VkDevice device, VkGeneratedCommandsMemoryRequirementsInfoNV const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetGeneratedCommandsMemoryRequirementsNV(VkDevice device, @NativeType("VkGeneratedCommandsMemoryRequirementsInfoNV const *") VkGeneratedCommandsMemoryRequirementsInfoNV pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetGeneratedCommandsMemoryRequirementsNV(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkCmdPreprocessGeneratedCommandsNV ] ---

    /** {@code void vkCmdPreprocessGeneratedCommandsNV(VkCommandBuffer commandBuffer, VkGeneratedCommandsInfoNV const * pGeneratedCommandsInfo)} */
    public static void nvkCmdPreprocessGeneratedCommandsNV(VkCommandBuffer commandBuffer, long pGeneratedCommandsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPreprocessGeneratedCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
            VkGeneratedCommandsInfoNV.validate(pGeneratedCommandsInfo);
        }
        callPPV(commandBuffer.address(), pGeneratedCommandsInfo, __functionAddress);
    }

    /** {@code void vkCmdPreprocessGeneratedCommandsNV(VkCommandBuffer commandBuffer, VkGeneratedCommandsInfoNV const * pGeneratedCommandsInfo)} */
    public static void vkCmdPreprocessGeneratedCommandsNV(VkCommandBuffer commandBuffer, @NativeType("VkGeneratedCommandsInfoNV const *") VkGeneratedCommandsInfoNV pGeneratedCommandsInfo) {
        nvkCmdPreprocessGeneratedCommandsNV(commandBuffer, pGeneratedCommandsInfo.address());
    }

    // --- [ vkCmdExecuteGeneratedCommandsNV ] ---

    /** {@code void vkCmdExecuteGeneratedCommandsNV(VkCommandBuffer commandBuffer, VkBool32 isPreprocessed, VkGeneratedCommandsInfoNV const * pGeneratedCommandsInfo)} */
    public static void nvkCmdExecuteGeneratedCommandsNV(VkCommandBuffer commandBuffer, int isPreprocessed, long pGeneratedCommandsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdExecuteGeneratedCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
            VkGeneratedCommandsInfoNV.validate(pGeneratedCommandsInfo);
        }
        callPPV(commandBuffer.address(), isPreprocessed, pGeneratedCommandsInfo, __functionAddress);
    }

    /** {@code void vkCmdExecuteGeneratedCommandsNV(VkCommandBuffer commandBuffer, VkBool32 isPreprocessed, VkGeneratedCommandsInfoNV const * pGeneratedCommandsInfo)} */
    public static void vkCmdExecuteGeneratedCommandsNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean isPreprocessed, @NativeType("VkGeneratedCommandsInfoNV const *") VkGeneratedCommandsInfoNV pGeneratedCommandsInfo) {
        nvkCmdExecuteGeneratedCommandsNV(commandBuffer, isPreprocessed ? 1 : 0, pGeneratedCommandsInfo.address());
    }

    // --- [ vkCmdBindPipelineShaderGroupNV ] ---

    /** {@code void vkCmdBindPipelineShaderGroupNV(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipeline pipeline, uint32_t groupIndex)} */
    public static void vkCmdBindPipelineShaderGroupNV(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int groupIndex) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindPipelineShaderGroupNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), pipelineBindPoint, pipeline, groupIndex, __functionAddress);
    }

    // --- [ vkCreateIndirectCommandsLayoutNV ] ---

    /** {@code VkResult vkCreateIndirectCommandsLayoutNV(VkDevice device, VkIndirectCommandsLayoutCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkIndirectCommandsLayoutNV * pIndirectCommandsLayout)} */
    public static int nvkCreateIndirectCommandsLayoutNV(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutNV;
        if (CHECKS) {
            check(__functionAddress);
            VkIndirectCommandsLayoutCreateInfoNV.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pIndirectCommandsLayout, __functionAddress);
    }

    /** {@code VkResult vkCreateIndirectCommandsLayoutNV(VkDevice device, VkIndirectCommandsLayoutCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkIndirectCommandsLayoutNV * pIndirectCommandsLayout)} */
    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutNV(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoNV const *") VkIndirectCommandsLayoutCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutNV *") LongBuffer pIndirectCommandsLayout) {
        if (CHECKS) {
            check(pIndirectCommandsLayout, 1);
        }
        return nvkCreateIndirectCommandsLayoutNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pIndirectCommandsLayout));
    }

    // --- [ vkDestroyIndirectCommandsLayoutNV ] ---

    /** {@code void vkDestroyIndirectCommandsLayoutNV(VkDevice device, VkIndirectCommandsLayoutNV indirectCommandsLayout, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyIndirectCommandsLayoutNV(VkDevice device, long indirectCommandsLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyIndirectCommandsLayoutNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), indirectCommandsLayout, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyIndirectCommandsLayoutNV(VkDevice device, VkIndirectCommandsLayoutNV indirectCommandsLayout, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyIndirectCommandsLayoutNV(VkDevice device, @NativeType("VkIndirectCommandsLayoutNV") long indirectCommandsLayout, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyIndirectCommandsLayoutNV(device, indirectCommandsLayout, memAddressSafe(pAllocator));
    }

    /** {@code VkResult vkCreateIndirectCommandsLayoutNV(VkDevice device, VkIndirectCommandsLayoutCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkIndirectCommandsLayoutNV * pIndirectCommandsLayout)} */
    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutNV(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoNV const *") VkIndirectCommandsLayoutCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutNV *") long[] pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pIndirectCommandsLayout, 1);
            VkIndirectCommandsLayoutCreateInfoNV.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pIndirectCommandsLayout, __functionAddress);
    }

}