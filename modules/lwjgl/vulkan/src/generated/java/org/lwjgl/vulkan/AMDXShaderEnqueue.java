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

public class AMDXShaderEnqueue {

    public static final int VK_AMDX_SHADER_ENQUEUE_SPEC_VERSION = 2;

    public static final String VK_AMDX_SHADER_ENQUEUE_EXTENSION_NAME = "VK_AMDX_shader_enqueue";

    public static final int VK_SHADER_INDEX_UNUSED_AMDX = (~0);

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX   = 1000134000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX = 1000134001,
        VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX     = 1000134002,
        VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX      = 1000134003,
        VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX    = 1000134004;

    public static final int VK_BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX = 0x2000000;

    public static final int VK_PIPELINE_BIND_POINT_EXECUTION_GRAPH_AMDX = 1000134000;

    public static final long VK_BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX = 0x2000000L;

    public static final long VK_PIPELINE_CREATE_2_EXECUTION_GRAPH_BIT_AMDX = 0x100000000L;

    protected AMDXShaderEnqueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateExecutionGraphPipelinesAMDX ] ---

    /** {@code VkResult vkCreateExecutionGraphPipelinesAMDX(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkExecutionGraphPipelineCreateInfoAMDX const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    public static int nvkCreateExecutionGraphPipelinesAMDX(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateExecutionGraphPipelinesAMDX;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkExecutionGraphPipelineCreateInfoAMDX.SIZEOF, VkExecutionGraphPipelineCreateInfoAMDX::validate);
        }
        return callPJPPPI(device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    /** {@code VkResult vkCreateExecutionGraphPipelinesAMDX(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkExecutionGraphPipelineCreateInfoAMDX const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateExecutionGraphPipelinesAMDX(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkExecutionGraphPipelineCreateInfoAMDX const *") VkExecutionGraphPipelineCreateInfoAMDX.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateExecutionGraphPipelinesAMDX(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
    }

    // --- [ vkGetExecutionGraphPipelineScratchSizeAMDX ] ---

    /** {@code VkResult vkGetExecutionGraphPipelineScratchSizeAMDX(VkDevice device, VkPipeline executionGraph, VkExecutionGraphPipelineScratchSizeAMDX * pSizeInfo)} */
    public static int nvkGetExecutionGraphPipelineScratchSizeAMDX(VkDevice device, long executionGraph, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetExecutionGraphPipelineScratchSizeAMDX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), executionGraph, pSizeInfo, __functionAddress);
    }

    /** {@code VkResult vkGetExecutionGraphPipelineScratchSizeAMDX(VkDevice device, VkPipeline executionGraph, VkExecutionGraphPipelineScratchSizeAMDX * pSizeInfo)} */
    @NativeType("VkResult")
    public static int vkGetExecutionGraphPipelineScratchSizeAMDX(VkDevice device, @NativeType("VkPipeline") long executionGraph, @NativeType("VkExecutionGraphPipelineScratchSizeAMDX *") VkExecutionGraphPipelineScratchSizeAMDX pSizeInfo) {
        return nvkGetExecutionGraphPipelineScratchSizeAMDX(device, executionGraph, pSizeInfo.address());
    }

    // --- [ vkGetExecutionGraphPipelineNodeIndexAMDX ] ---

    /** {@code VkResult vkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, VkPipeline executionGraph, VkPipelineShaderStageNodeCreateInfoAMDX const * pNodeInfo, uint32_t * pNodeIndex)} */
    public static int nvkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, long executionGraph, long pNodeInfo, long pNodeIndex) {
        long __functionAddress = device.getCapabilities().vkGetExecutionGraphPipelineNodeIndexAMDX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), executionGraph, pNodeInfo, pNodeIndex, __functionAddress);
    }

    /** {@code VkResult vkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, VkPipeline executionGraph, VkPipelineShaderStageNodeCreateInfoAMDX const * pNodeInfo, uint32_t * pNodeIndex)} */
    @NativeType("VkResult")
    public static int vkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, @NativeType("VkPipeline") long executionGraph, @NativeType("VkPipelineShaderStageNodeCreateInfoAMDX const *") VkPipelineShaderStageNodeCreateInfoAMDX pNodeInfo, @NativeType("uint32_t *") IntBuffer pNodeIndex) {
        if (CHECKS) {
            check(pNodeIndex, 1);
        }
        return nvkGetExecutionGraphPipelineNodeIndexAMDX(device, executionGraph, pNodeInfo.address(), memAddress(pNodeIndex));
    }

    // --- [ vkCmdInitializeGraphScratchMemoryAMDX ] ---

    /** {@code void vkCmdInitializeGraphScratchMemoryAMDX(VkCommandBuffer commandBuffer, VkPipeline executionGraph, VkDeviceAddress scratch, VkDeviceSize scratchSize)} */
    public static void vkCmdInitializeGraphScratchMemoryAMDX(VkCommandBuffer commandBuffer, @NativeType("VkPipeline") long executionGraph, @NativeType("VkDeviceAddress") long scratch, @NativeType("VkDeviceSize") long scratchSize) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdInitializeGraphScratchMemoryAMDX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJV(commandBuffer.address(), executionGraph, scratch, scratchSize, __functionAddress);
    }

    // --- [ vkCmdDispatchGraphAMDX ] ---

    /** {@code void vkCmdDispatchGraphAMDX(VkCommandBuffer commandBuffer, VkDeviceAddress scratch, VkDeviceSize scratchSize, VkDispatchGraphCountInfoAMDX const * pCountInfo)} */
    public static void nvkCmdDispatchGraphAMDX(VkCommandBuffer commandBuffer, long scratch, long scratchSize, long pCountInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchGraphAMDX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(commandBuffer.address(), scratch, scratchSize, pCountInfo, __functionAddress);
    }

    /** {@code void vkCmdDispatchGraphAMDX(VkCommandBuffer commandBuffer, VkDeviceAddress scratch, VkDeviceSize scratchSize, VkDispatchGraphCountInfoAMDX const * pCountInfo)} */
    public static void vkCmdDispatchGraphAMDX(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long scratch, @NativeType("VkDeviceSize") long scratchSize, @NativeType("VkDispatchGraphCountInfoAMDX const *") VkDispatchGraphCountInfoAMDX pCountInfo) {
        nvkCmdDispatchGraphAMDX(commandBuffer, scratch, scratchSize, pCountInfo.address());
    }

    // --- [ vkCmdDispatchGraphIndirectAMDX ] ---

    /** {@code void vkCmdDispatchGraphIndirectAMDX(VkCommandBuffer commandBuffer, VkDeviceAddress scratch, VkDeviceSize scratchSize, VkDispatchGraphCountInfoAMDX const * pCountInfo)} */
    public static void nvkCmdDispatchGraphIndirectAMDX(VkCommandBuffer commandBuffer, long scratch, long scratchSize, long pCountInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchGraphIndirectAMDX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(commandBuffer.address(), scratch, scratchSize, pCountInfo, __functionAddress);
    }

    /** {@code void vkCmdDispatchGraphIndirectAMDX(VkCommandBuffer commandBuffer, VkDeviceAddress scratch, VkDeviceSize scratchSize, VkDispatchGraphCountInfoAMDX const * pCountInfo)} */
    public static void vkCmdDispatchGraphIndirectAMDX(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long scratch, @NativeType("VkDeviceSize") long scratchSize, @NativeType("VkDispatchGraphCountInfoAMDX const *") VkDispatchGraphCountInfoAMDX pCountInfo) {
        nvkCmdDispatchGraphIndirectAMDX(commandBuffer, scratch, scratchSize, pCountInfo.address());
    }

    // --- [ vkCmdDispatchGraphIndirectCountAMDX ] ---

    /** {@code void vkCmdDispatchGraphIndirectCountAMDX(VkCommandBuffer commandBuffer, VkDeviceAddress scratch, VkDeviceSize scratchSize, VkDeviceAddress countInfo)} */
    public static void vkCmdDispatchGraphIndirectCountAMDX(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddress") long scratch, @NativeType("VkDeviceSize") long scratchSize, @NativeType("VkDeviceAddress") long countInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchGraphIndirectCountAMDX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJV(commandBuffer.address(), scratch, scratchSize, countInfo, __functionAddress);
    }

    /** {@code VkResult vkCreateExecutionGraphPipelinesAMDX(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkExecutionGraphPipelineCreateInfoAMDX const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateExecutionGraphPipelinesAMDX(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkExecutionGraphPipelineCreateInfoAMDX const *") VkExecutionGraphPipelineCreateInfoAMDX.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateExecutionGraphPipelinesAMDX;
        if (CHECKS) {
            check(__functionAddress);
            check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkExecutionGraphPipelineCreateInfoAMDX.SIZEOF, VkExecutionGraphPipelineCreateInfoAMDX::validate);
        }
        return callPJPPPI(device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    /** {@code VkResult vkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, VkPipeline executionGraph, VkPipelineShaderStageNodeCreateInfoAMDX const * pNodeInfo, uint32_t * pNodeIndex)} */
    @NativeType("VkResult")
    public static int vkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, @NativeType("VkPipeline") long executionGraph, @NativeType("VkPipelineShaderStageNodeCreateInfoAMDX const *") VkPipelineShaderStageNodeCreateInfoAMDX pNodeInfo, @NativeType("uint32_t *") int[] pNodeIndex) {
        long __functionAddress = device.getCapabilities().vkGetExecutionGraphPipelineNodeIndexAMDX;
        if (CHECKS) {
            check(__functionAddress);
            check(pNodeIndex, 1);
        }
        return callPJPPI(device.address(), executionGraph, pNodeInfo.address(), pNodeIndex, __functionAddress);
    }

}