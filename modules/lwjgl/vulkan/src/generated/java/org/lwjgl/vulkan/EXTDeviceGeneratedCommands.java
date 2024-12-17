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

public class EXTDeviceGeneratedCommands {

    public static final int VK_EXT_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 1;

    public static final String VK_EXT_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_EXT_device_generated_commands";

    public static final int VK_SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT = 0x80;

    public static final long VK_BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT = 0x80000000L;

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT   = 1000572000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT = 1000572001,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT          = 1000572002,
        VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT                   = 1000572003,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT                              = 1000572004,
        VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT                 = 1000572006,
        VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT                       = 1000572007,
        VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT                = 1000572008,
        VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT                  = 1000572009,
        VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT                 = 1000572010,
        VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT                   = 1000572011,
        VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT            = 1000572012,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT                     = 1000572013,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT                       = 1000572014;

    public static final int
        VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_EXT = 1000572000,
        VK_OBJECT_TYPE_INDIRECT_EXECUTION_SET_EXT   = 1000572001;

    public static final long VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT = 0x4000000000L;

    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_EXT = 0x20000;

    public static final int
        VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT  = 0x20000,
        VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT = 0x40000;

    public static final int
        VK_INDIRECT_COMMANDS_INPUT_MODE_VULKAN_INDEX_BUFFER_EXT = 0x1,
        VK_INDIRECT_COMMANDS_INPUT_MODE_DXGI_INDEX_BUFFER_EXT   = 0x2;

    public static final int
        VK_INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT      = 0,
        VK_INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT = 1;

    public static final int
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT = 0x1,
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT = 0x2;

    public static final int
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT      = 0,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT      = 1,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT     = 2,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT       = 3,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT      = 4,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT       = 5,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT               = 6,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT = 7,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT         = 8,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT           = 9;

    protected EXTDeviceGeneratedCommands() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetGeneratedCommandsMemoryRequirementsEXT ] ---

    /** {@code void vkGetGeneratedCommandsMemoryRequirementsEXT(VkDevice device, VkGeneratedCommandsMemoryRequirementsInfoEXT const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetGeneratedCommandsMemoryRequirementsEXT(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetGeneratedCommandsMemoryRequirementsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetGeneratedCommandsMemoryRequirementsEXT(VkDevice device, VkGeneratedCommandsMemoryRequirementsInfoEXT const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetGeneratedCommandsMemoryRequirementsEXT(VkDevice device, @NativeType("VkGeneratedCommandsMemoryRequirementsInfoEXT const *") VkGeneratedCommandsMemoryRequirementsInfoEXT pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetGeneratedCommandsMemoryRequirementsEXT(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkCmdPreprocessGeneratedCommandsEXT ] ---

    /** {@code void vkCmdPreprocessGeneratedCommandsEXT(VkCommandBuffer commandBuffer, VkGeneratedCommandsInfoEXT const * pGeneratedCommandsInfo, VkCommandBuffer stateCommandBuffer)} */
    public static void nvkCmdPreprocessGeneratedCommandsEXT(VkCommandBuffer commandBuffer, long pGeneratedCommandsInfo, VkCommandBuffer stateCommandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPreprocessGeneratedCommandsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pGeneratedCommandsInfo, stateCommandBuffer.address(), __functionAddress);
    }

    /** {@code void vkCmdPreprocessGeneratedCommandsEXT(VkCommandBuffer commandBuffer, VkGeneratedCommandsInfoEXT const * pGeneratedCommandsInfo, VkCommandBuffer stateCommandBuffer)} */
    public static void vkCmdPreprocessGeneratedCommandsEXT(VkCommandBuffer commandBuffer, @NativeType("VkGeneratedCommandsInfoEXT const *") VkGeneratedCommandsInfoEXT pGeneratedCommandsInfo, VkCommandBuffer stateCommandBuffer) {
        nvkCmdPreprocessGeneratedCommandsEXT(commandBuffer, pGeneratedCommandsInfo.address(), stateCommandBuffer);
    }

    // --- [ vkCmdExecuteGeneratedCommandsEXT ] ---

    /** {@code void vkCmdExecuteGeneratedCommandsEXT(VkCommandBuffer commandBuffer, VkBool32 isPreprocessed, VkGeneratedCommandsInfoEXT const * pGeneratedCommandsInfo)} */
    public static void nvkCmdExecuteGeneratedCommandsEXT(VkCommandBuffer commandBuffer, int isPreprocessed, long pGeneratedCommandsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdExecuteGeneratedCommandsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), isPreprocessed, pGeneratedCommandsInfo, __functionAddress);
    }

    /** {@code void vkCmdExecuteGeneratedCommandsEXT(VkCommandBuffer commandBuffer, VkBool32 isPreprocessed, VkGeneratedCommandsInfoEXT const * pGeneratedCommandsInfo)} */
    public static void vkCmdExecuteGeneratedCommandsEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean isPreprocessed, @NativeType("VkGeneratedCommandsInfoEXT const *") VkGeneratedCommandsInfoEXT pGeneratedCommandsInfo) {
        nvkCmdExecuteGeneratedCommandsEXT(commandBuffer, isPreprocessed ? 1 : 0, pGeneratedCommandsInfo.address());
    }

    // --- [ vkCreateIndirectCommandsLayoutEXT ] ---

    /** {@code VkResult vkCreateIndirectCommandsLayoutEXT(VkDevice device, VkIndirectCommandsLayoutCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkIndirectCommandsLayoutEXT * pIndirectCommandsLayout)} */
    public static int nvkCreateIndirectCommandsLayoutEXT(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkIndirectCommandsLayoutCreateInfoEXT.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pIndirectCommandsLayout, __functionAddress);
    }

    /** {@code VkResult vkCreateIndirectCommandsLayoutEXT(VkDevice device, VkIndirectCommandsLayoutCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkIndirectCommandsLayoutEXT * pIndirectCommandsLayout)} */
    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutEXT(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoEXT const *") VkIndirectCommandsLayoutCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutEXT *") LongBuffer pIndirectCommandsLayout) {
        if (CHECKS) {
            check(pIndirectCommandsLayout, 1);
        }
        return nvkCreateIndirectCommandsLayoutEXT(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pIndirectCommandsLayout));
    }

    // --- [ vkDestroyIndirectCommandsLayoutEXT ] ---

    /** {@code void vkDestroyIndirectCommandsLayoutEXT(VkDevice device, VkIndirectCommandsLayoutEXT indirectCommandsLayout, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyIndirectCommandsLayoutEXT(VkDevice device, long indirectCommandsLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyIndirectCommandsLayoutEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), indirectCommandsLayout, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyIndirectCommandsLayoutEXT(VkDevice device, VkIndirectCommandsLayoutEXT indirectCommandsLayout, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyIndirectCommandsLayoutEXT(VkDevice device, @NativeType("VkIndirectCommandsLayoutEXT") long indirectCommandsLayout, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyIndirectCommandsLayoutEXT(device, indirectCommandsLayout, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateIndirectExecutionSetEXT ] ---

    /** {@code VkResult vkCreateIndirectExecutionSetEXT(VkDevice device, VkIndirectExecutionSetCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkIndirectExecutionSetEXT * pIndirectExecutionSet)} */
    public static int nvkCreateIndirectExecutionSetEXT(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectExecutionSet) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectExecutionSetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pIndirectExecutionSet, __functionAddress);
    }

    /** {@code VkResult vkCreateIndirectExecutionSetEXT(VkDevice device, VkIndirectExecutionSetCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkIndirectExecutionSetEXT * pIndirectExecutionSet)} */
    @NativeType("VkResult")
    public static int vkCreateIndirectExecutionSetEXT(VkDevice device, @NativeType("VkIndirectExecutionSetCreateInfoEXT const *") VkIndirectExecutionSetCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkIndirectExecutionSetEXT *") LongBuffer pIndirectExecutionSet) {
        if (CHECKS) {
            check(pIndirectExecutionSet, 1);
        }
        return nvkCreateIndirectExecutionSetEXT(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pIndirectExecutionSet));
    }

    // --- [ vkDestroyIndirectExecutionSetEXT ] ---

    /** {@code void vkDestroyIndirectExecutionSetEXT(VkDevice device, VkIndirectExecutionSetEXT indirectExecutionSet, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyIndirectExecutionSetEXT(VkDevice device, long indirectExecutionSet, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyIndirectExecutionSetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), indirectExecutionSet, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyIndirectExecutionSetEXT(VkDevice device, VkIndirectExecutionSetEXT indirectExecutionSet, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyIndirectExecutionSetEXT(VkDevice device, @NativeType("VkIndirectExecutionSetEXT") long indirectExecutionSet, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyIndirectExecutionSetEXT(device, indirectExecutionSet, memAddressSafe(pAllocator));
    }

    // --- [ vkUpdateIndirectExecutionSetPipelineEXT ] ---

    /** {@code void vkUpdateIndirectExecutionSetPipelineEXT(VkDevice device, VkIndirectExecutionSetEXT indirectExecutionSet, uint32_t executionSetWriteCount, VkWriteIndirectExecutionSetPipelineEXT const * pExecutionSetWrites)} */
    public static void nvkUpdateIndirectExecutionSetPipelineEXT(VkDevice device, long indirectExecutionSet, int executionSetWriteCount, long pExecutionSetWrites) {
        long __functionAddress = device.getCapabilities().vkUpdateIndirectExecutionSetPipelineEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites, __functionAddress);
    }

    /** {@code void vkUpdateIndirectExecutionSetPipelineEXT(VkDevice device, VkIndirectExecutionSetEXT indirectExecutionSet, uint32_t executionSetWriteCount, VkWriteIndirectExecutionSetPipelineEXT const * pExecutionSetWrites)} */
    public static void vkUpdateIndirectExecutionSetPipelineEXT(VkDevice device, @NativeType("VkIndirectExecutionSetEXT") long indirectExecutionSet, @NativeType("VkWriteIndirectExecutionSetPipelineEXT const *") VkWriteIndirectExecutionSetPipelineEXT.Buffer pExecutionSetWrites) {
        nvkUpdateIndirectExecutionSetPipelineEXT(device, indirectExecutionSet, pExecutionSetWrites.remaining(), pExecutionSetWrites.address());
    }

    // --- [ vkUpdateIndirectExecutionSetShaderEXT ] ---

    /** {@code void vkUpdateIndirectExecutionSetShaderEXT(VkDevice device, VkIndirectExecutionSetEXT indirectExecutionSet, uint32_t executionSetWriteCount, VkWriteIndirectExecutionSetShaderEXT const * pExecutionSetWrites)} */
    public static void nvkUpdateIndirectExecutionSetShaderEXT(VkDevice device, long indirectExecutionSet, int executionSetWriteCount, long pExecutionSetWrites) {
        long __functionAddress = device.getCapabilities().vkUpdateIndirectExecutionSetShaderEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites, __functionAddress);
    }

    /** {@code void vkUpdateIndirectExecutionSetShaderEXT(VkDevice device, VkIndirectExecutionSetEXT indirectExecutionSet, uint32_t executionSetWriteCount, VkWriteIndirectExecutionSetShaderEXT const * pExecutionSetWrites)} */
    public static void vkUpdateIndirectExecutionSetShaderEXT(VkDevice device, @NativeType("VkIndirectExecutionSetEXT") long indirectExecutionSet, @NativeType("VkWriteIndirectExecutionSetShaderEXT const *") VkWriteIndirectExecutionSetShaderEXT.Buffer pExecutionSetWrites) {
        nvkUpdateIndirectExecutionSetShaderEXT(device, indirectExecutionSet, pExecutionSetWrites.remaining(), pExecutionSetWrites.address());
    }

    /** {@code VkResult vkCreateIndirectCommandsLayoutEXT(VkDevice device, VkIndirectCommandsLayoutCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkIndirectCommandsLayoutEXT * pIndirectCommandsLayout)} */
    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutEXT(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoEXT const *") VkIndirectCommandsLayoutCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutEXT *") long[] pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pIndirectCommandsLayout, 1);
            VkIndirectCommandsLayoutCreateInfoEXT.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pIndirectCommandsLayout, __functionAddress);
    }

    /** {@code VkResult vkCreateIndirectExecutionSetEXT(VkDevice device, VkIndirectExecutionSetCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkIndirectExecutionSetEXT * pIndirectExecutionSet)} */
    @NativeType("VkResult")
    public static int vkCreateIndirectExecutionSetEXT(VkDevice device, @NativeType("VkIndirectExecutionSetCreateInfoEXT const *") VkIndirectExecutionSetCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkIndirectExecutionSetEXT *") long[] pIndirectExecutionSet) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectExecutionSetEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pIndirectExecutionSet, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pIndirectExecutionSet, __functionAddress);
    }

}