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

public class KHRRayTracingPipeline {

    public static final int VK_KHR_RAY_TRACING_PIPELINE_SPEC_VERSION = 1;

    public static final String VK_KHR_RAY_TRACING_PIPELINE_EXTENSION_NAME = "VK_KHR_ray_tracing_pipeline";

    public static final int VK_SHADER_UNUSED_KHR = (~0);

    public static final int
        VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR                = 1000150015,
        VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR            = 1000150016,
        VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR      = 1000150018,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR   = 1000347000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR = 1000347001;

    public static final int
        VK_SHADER_STAGE_RAYGEN_BIT_KHR       = 0x100,
        VK_SHADER_STAGE_ANY_HIT_BIT_KHR      = 0x200,
        VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR  = 0x400,
        VK_SHADER_STAGE_MISS_BIT_KHR         = 0x800,
        VK_SHADER_STAGE_INTERSECTION_BIT_KHR = 0x1000,
        VK_SHADER_STAGE_CALLABLE_BIT_KHR     = 0x2000;

    public static final int VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR = 0x200000;

    public static final int VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR = 0x400;

    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR = 1000165000;

    public static final int
        VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR                     = 0x1000,
        VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR                         = 0x2000,
        VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR            = 0x4000,
        VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR        = 0x8000,
        VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR               = 0x10000,
        VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR       = 0x20000,
        VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 0x80000;

    public static final int VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR = 1000347000;

    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_BUILT_IN_PRIMITIVES_BIT_KHR = 0x1000L;

    public static final int
        VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR              = 0,
        VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR  = 1,
        VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR = 2;

    public static final int
        VK_SHADER_GROUP_SHADER_GENERAL_KHR      = 0,
        VK_SHADER_GROUP_SHADER_CLOSEST_HIT_KHR  = 1,
        VK_SHADER_GROUP_SHADER_ANY_HIT_KHR      = 2,
        VK_SHADER_GROUP_SHADER_INTERSECTION_KHR = 3;

    protected KHRRayTracingPipeline() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdTraceRaysKHR ] ---

    /** {@code void vkCmdTraceRaysKHR(VkCommandBuffer commandBuffer, VkStridedDeviceAddressRegionKHR const * pRaygenShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pMissShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pHitShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pCallableShaderBindingTable, uint32_t width, uint32_t height, uint32_t depth)} */
    public static void nvkCmdTraceRaysKHR(VkCommandBuffer commandBuffer, long pRaygenShaderBindingTable, long pMissShaderBindingTable, long pHitShaderBindingTable, long pCallableShaderBindingTable, int width, int height, int depth) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(commandBuffer.address(), pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, width, height, depth, __functionAddress);
    }

    /** {@code void vkCmdTraceRaysKHR(VkCommandBuffer commandBuffer, VkStridedDeviceAddressRegionKHR const * pRaygenShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pMissShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pHitShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pCallableShaderBindingTable, uint32_t width, uint32_t height, uint32_t depth)} */
    public static void vkCmdTraceRaysKHR(VkCommandBuffer commandBuffer, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pMissShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pHitShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable, @NativeType("uint32_t") int width, @NativeType("uint32_t") int height, @NativeType("uint32_t") int depth) {
        nvkCmdTraceRaysKHR(commandBuffer, pRaygenShaderBindingTable.address(), pMissShaderBindingTable.address(), pHitShaderBindingTable.address(), pCallableShaderBindingTable.address(), width, height, depth);
    }

    // --- [ vkCreateRayTracingPipelinesKHR ] ---

    /** {@code VkResult vkCreateRayTracingPipelinesKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkRayTracingPipelineCreateInfoKHR const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    public static int nvkCreateRayTracingPipelinesKHR(VkDevice device, long deferredOperation, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesKHR;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkRayTracingPipelineCreateInfoKHR.SIZEOF, VkRayTracingPipelineCreateInfoKHR::validate);
        }
        return callPJJPPPI(device.address(), deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    /** {@code VkResult vkCreateRayTracingPipelinesKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkRayTracingPipelineCreateInfoKHR const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoKHR const *") VkRayTracingPipelineCreateInfoKHR.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateRayTracingPipelinesKHR(device, deferredOperation, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
    }

    // --- [ vkGetRayTracingShaderGroupHandlesKHR ] ---

    /** {@code VkResult vkGetRayTracingShaderGroupHandlesKHR(VkDevice device, VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void * pData)} */
    public static int nvkGetRayTracingShaderGroupHandlesKHR(VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingShaderGroupHandlesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), pipeline, firstGroup, groupCount, dataSize, pData, __functionAddress);
    }

    /** {@code VkResult vkGetRayTracingShaderGroupHandlesKHR(VkDevice device, VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetRayTracingShaderGroupHandlesKHR(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int firstGroup, @NativeType("uint32_t") int groupCount, @NativeType("void *") ByteBuffer pData) {
        return nvkGetRayTracingShaderGroupHandlesKHR(device, pipeline, firstGroup, groupCount, pData.remaining(), memAddress(pData));
    }

    // --- [ vkGetRayTracingCaptureReplayShaderGroupHandlesKHR ] ---

    /** {@code VkResult vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(VkDevice device, VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void * pData)} */
    public static int nvkGetRayTracingCaptureReplayShaderGroupHandlesKHR(VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), pipeline, firstGroup, groupCount, dataSize, pData, __functionAddress);
    }

    /** {@code VkResult vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(VkDevice device, VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int firstGroup, @NativeType("uint32_t") int groupCount, @NativeType("void *") ByteBuffer pData) {
        return nvkGetRayTracingCaptureReplayShaderGroupHandlesKHR(device, pipeline, firstGroup, groupCount, pData.remaining(), memAddress(pData));
    }

    // --- [ vkCmdTraceRaysIndirectKHR ] ---

    /** {@code void vkCmdTraceRaysIndirectKHR(VkCommandBuffer commandBuffer, VkStridedDeviceAddressRegionKHR const * pRaygenShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pMissShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pHitShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pCallableShaderBindingTable, VkDeviceAddress indirectDeviceAddress)} */
    public static void nvkCmdTraceRaysIndirectKHR(VkCommandBuffer commandBuffer, long pRaygenShaderBindingTable, long pMissShaderBindingTable, long pHitShaderBindingTable, long pCallableShaderBindingTable, long indirectDeviceAddress) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysIndirectKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPJV(commandBuffer.address(), pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, indirectDeviceAddress, __functionAddress);
    }

    /** {@code void vkCmdTraceRaysIndirectKHR(VkCommandBuffer commandBuffer, VkStridedDeviceAddressRegionKHR const * pRaygenShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pMissShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pHitShaderBindingTable, VkStridedDeviceAddressRegionKHR const * pCallableShaderBindingTable, VkDeviceAddress indirectDeviceAddress)} */
    public static void vkCmdTraceRaysIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pMissShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pHitShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable, @NativeType("VkDeviceAddress") long indirectDeviceAddress) {
        nvkCmdTraceRaysIndirectKHR(commandBuffer, pRaygenShaderBindingTable.address(), pMissShaderBindingTable.address(), pHitShaderBindingTable.address(), pCallableShaderBindingTable.address(), indirectDeviceAddress);
    }

    // --- [ vkGetRayTracingShaderGroupStackSizeKHR ] ---

    /** {@code VkDeviceSize vkGetRayTracingShaderGroupStackSizeKHR(VkDevice device, VkPipeline pipeline, uint32_t group, VkShaderGroupShaderKHR groupShader)} */
    @NativeType("VkDeviceSize")
    public static long vkGetRayTracingShaderGroupStackSizeKHR(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int group, @NativeType("VkShaderGroupShaderKHR") int groupShader) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingShaderGroupStackSizeKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJ(device.address(), pipeline, group, groupShader, __functionAddress);
    }

    // --- [ vkCmdSetRayTracingPipelineStackSizeKHR ] ---

    /** {@code void vkCmdSetRayTracingPipelineStackSizeKHR(VkCommandBuffer commandBuffer, uint32_t pipelineStackSize)} */
    public static void vkCmdSetRayTracingPipelineStackSizeKHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int pipelineStackSize) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRayTracingPipelineStackSizeKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), pipelineStackSize, __functionAddress);
    }

    /** {@code VkResult vkCreateRayTracingPipelinesKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkRayTracingPipelineCreateInfoKHR const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoKHR const *") VkRayTracingPipelineCreateInfoKHR.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkRayTracingPipelineCreateInfoKHR.SIZEOF, VkRayTracingPipelineCreateInfoKHR::validate);
        }
        return callPJJPPPI(device.address(), deferredOperation, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

}