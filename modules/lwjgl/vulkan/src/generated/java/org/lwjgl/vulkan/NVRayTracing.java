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

public class NVRayTracing {

    public static final int VK_NV_RAY_TRACING_SPEC_VERSION = 3;

    public static final String VK_NV_RAY_TRACING_EXTENSION_NAME = "VK_NV_ray_tracing";

    public static final int VK_SHADER_UNUSED_NV = (~0);

    public static final int
        VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV                = 1000165000,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV              = 1000165001,
        VK_STRUCTURE_TYPE_GEOMETRY_NV                                        = 1000165003,
        VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV                              = 1000165004,
        VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV                                   = 1000165005,
        VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV         = 1000165006,
        VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV     = 1000165007,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV = 1000165008,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV          = 1000165009,
        VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV            = 1000165011,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV                     = 1000165012;

    public static final int
        VK_SHADER_STAGE_RAYGEN_BIT_NV       = 0x100,
        VK_SHADER_STAGE_ANY_HIT_BIT_NV      = 0x200,
        VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV  = 0x400,
        VK_SHADER_STAGE_MISS_BIT_NV         = 0x800,
        VK_SHADER_STAGE_INTERSECTION_BIT_NV = 0x1000,
        VK_SHADER_STAGE_CALLABLE_BIT_NV     = 0x2000;

    public static final int
        VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV           = 0x200000,
        VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV = 0x2000000;

    public static final int VK_BUFFER_USAGE_RAY_TRACING_BIT_NV = 0x400;

    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_NV = 1000165000;

    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;

    public static final int
        VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV  = 0x200000,
        VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV = 0x400000;

    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV = 1000165000;

    public static final int VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV = 0x20;

    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;

    public static final int VK_INDEX_TYPE_NONE_NV = 1000165000;

    public static final int
        VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV              = 0,
        VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV  = 1,
        VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV = 2;

    public static final int
        VK_GEOMETRY_TYPE_TRIANGLES_NV = 0,
        VK_GEOMETRY_TYPE_AABBS_NV     = 1;

    public static final int
        VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV    = 0,
        VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV = 1;

    public static final int
        VK_GEOMETRY_OPAQUE_BIT_NV                          = 0x1,
        VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV = 0x2;

    public static final int
        VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV           = 0x1,
        VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV = 0x2,
        VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV                    = 0x4,
        VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV                 = 0x8;

    public static final int
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV      = 0x1,
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV  = 0x2,
        VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV = 0x4,
        VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV = 0x8,
        VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV        = 0x10;

    public static final int
        VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV   = 0,
        VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV = 1;

    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT = 1000165000;

    public static final int
        VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV         = 0,
        VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV  = 1,
        VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV = 2;

    protected NVRayTracing() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateAccelerationStructureNV ] ---

    /** {@code VkResult vkCreateAccelerationStructureNV(VkDevice device, VkAccelerationStructureCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkAccelerationStructureNV * pAccelerationStructure)} */
    public static int nvkCreateAccelerationStructureNV(VkDevice device, long pCreateInfo, long pAllocator, long pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureNV;
        if (CHECKS) {
            check(__functionAddress);
            VkAccelerationStructureCreateInfoNV.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pAccelerationStructure, __functionAddress);
    }

    /** {@code VkResult vkCreateAccelerationStructureNV(VkDevice device, VkAccelerationStructureCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkAccelerationStructureNV * pAccelerationStructure)} */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureNV(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoNV const *") VkAccelerationStructureCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureNV *") LongBuffer pAccelerationStructure) {
        if (CHECKS) {
            check(pAccelerationStructure, 1);
        }
        return nvkCreateAccelerationStructureNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pAccelerationStructure));
    }

    // --- [ vkDestroyAccelerationStructureNV ] ---

    /** {@code void vkDestroyAccelerationStructureNV(VkDevice device, VkAccelerationStructureNV accelerationStructure, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyAccelerationStructureNV(VkDevice device, long accelerationStructure, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyAccelerationStructureNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), accelerationStructure, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyAccelerationStructureNV(VkDevice device, VkAccelerationStructureNV accelerationStructure, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyAccelerationStructureNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyAccelerationStructureNV(device, accelerationStructure, memAddressSafe(pAllocator));
    }

    // --- [ vkGetAccelerationStructureMemoryRequirementsNV ] ---

    /** {@code void vkGetAccelerationStructureMemoryRequirementsNV(VkDevice device, VkAccelerationStructureMemoryRequirementsInfoNV const * pInfo, VkMemoryRequirements2KHR * pMemoryRequirements)} */
    public static void nvkGetAccelerationStructureMemoryRequirementsNV(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureMemoryRequirementsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetAccelerationStructureMemoryRequirementsNV(VkDevice device, VkAccelerationStructureMemoryRequirementsInfoNV const * pInfo, VkMemoryRequirements2KHR * pMemoryRequirements)} */
    public static void vkGetAccelerationStructureMemoryRequirementsNV(VkDevice device, @NativeType("VkAccelerationStructureMemoryRequirementsInfoNV const *") VkAccelerationStructureMemoryRequirementsInfoNV pInfo, @NativeType("VkMemoryRequirements2KHR *") VkMemoryRequirements2KHR pMemoryRequirements) {
        nvkGetAccelerationStructureMemoryRequirementsNV(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkBindAccelerationStructureMemoryNV ] ---

    /** {@code VkResult vkBindAccelerationStructureMemoryNV(VkDevice device, uint32_t bindInfoCount, VkBindAccelerationStructureMemoryInfoNV const * pBindInfos)} */
    public static int nvkBindAccelerationStructureMemoryNV(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindAccelerationStructureMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pBindInfos, bindInfoCount, VkBindAccelerationStructureMemoryInfoNV.SIZEOF, VkBindAccelerationStructureMemoryInfoNV::validate);
        }
        return callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    /** {@code VkResult vkBindAccelerationStructureMemoryNV(VkDevice device, uint32_t bindInfoCount, VkBindAccelerationStructureMemoryInfoNV const * pBindInfos)} */
    @NativeType("VkResult")
    public static int vkBindAccelerationStructureMemoryNV(VkDevice device, @NativeType("VkBindAccelerationStructureMemoryInfoNV const *") VkBindAccelerationStructureMemoryInfoNV.Buffer pBindInfos) {
        return nvkBindAccelerationStructureMemoryNV(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkCmdBuildAccelerationStructureNV ] ---

    /** {@code void vkCmdBuildAccelerationStructureNV(VkCommandBuffer commandBuffer, VkAccelerationStructureInfoNV const * pInfo, VkBuffer instanceData, VkDeviceSize instanceOffset, VkBool32 update, VkAccelerationStructureNV dst, VkAccelerationStructureNV src, VkBuffer scratch, VkDeviceSize scratchOffset)} */
    public static void nvkCmdBuildAccelerationStructureNV(VkCommandBuffer commandBuffer, long pInfo, long instanceData, long instanceOffset, int update, long dst, long src, long scratch, long scratchOffset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructureNV;
        if (CHECKS) {
            check(__functionAddress);
            VkAccelerationStructureInfoNV.validate(pInfo);
        }
        callPPJJJJJJV(commandBuffer.address(), pInfo, instanceData, instanceOffset, update, dst, src, scratch, scratchOffset, __functionAddress);
    }

    /** {@code void vkCmdBuildAccelerationStructureNV(VkCommandBuffer commandBuffer, VkAccelerationStructureInfoNV const * pInfo, VkBuffer instanceData, VkDeviceSize instanceOffset, VkBool32 update, VkAccelerationStructureNV dst, VkAccelerationStructureNV src, VkBuffer scratch, VkDeviceSize scratchOffset)} */
    public static void vkCmdBuildAccelerationStructureNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureInfoNV const *") VkAccelerationStructureInfoNV pInfo, @NativeType("VkBuffer") long instanceData, @NativeType("VkDeviceSize") long instanceOffset, @NativeType("VkBool32") boolean update, @NativeType("VkAccelerationStructureNV") long dst, @NativeType("VkAccelerationStructureNV") long src, @NativeType("VkBuffer") long scratch, @NativeType("VkDeviceSize") long scratchOffset) {
        nvkCmdBuildAccelerationStructureNV(commandBuffer, pInfo.address(), instanceData, instanceOffset, update ? 1 : 0, dst, src, scratch, scratchOffset);
    }

    // --- [ vkCmdCopyAccelerationStructureNV ] ---

    /** {@code void vkCmdCopyAccelerationStructureNV(VkCommandBuffer commandBuffer, VkAccelerationStructureNV dst, VkAccelerationStructureNV src, VkCopyAccelerationStructureModeKHR mode)} */
    public static void vkCmdCopyAccelerationStructureNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNV") long dst, @NativeType("VkAccelerationStructureNV") long src, @NativeType("VkCopyAccelerationStructureModeKHR") int mode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyAccelerationStructureNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), dst, src, mode, __functionAddress);
    }

    // --- [ vkCmdTraceRaysNV ] ---

    /** {@code void vkCmdTraceRaysNV(VkCommandBuffer commandBuffer, VkBuffer raygenShaderBindingTableBuffer, VkDeviceSize raygenShaderBindingOffset, VkBuffer missShaderBindingTableBuffer, VkDeviceSize missShaderBindingOffset, VkDeviceSize missShaderBindingStride, VkBuffer hitShaderBindingTableBuffer, VkDeviceSize hitShaderBindingOffset, VkDeviceSize hitShaderBindingStride, VkBuffer callableShaderBindingTableBuffer, VkDeviceSize callableShaderBindingOffset, VkDeviceSize callableShaderBindingStride, uint32_t width, uint32_t height, uint32_t depth)} */
    public static void vkCmdTraceRaysNV(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long raygenShaderBindingTableBuffer, @NativeType("VkDeviceSize") long raygenShaderBindingOffset, @NativeType("VkBuffer") long missShaderBindingTableBuffer, @NativeType("VkDeviceSize") long missShaderBindingOffset, @NativeType("VkDeviceSize") long missShaderBindingStride, @NativeType("VkBuffer") long hitShaderBindingTableBuffer, @NativeType("VkDeviceSize") long hitShaderBindingOffset, @NativeType("VkDeviceSize") long hitShaderBindingStride, @NativeType("VkBuffer") long callableShaderBindingTableBuffer, @NativeType("VkDeviceSize") long callableShaderBindingOffset, @NativeType("VkDeviceSize") long callableShaderBindingStride, @NativeType("uint32_t") int width, @NativeType("uint32_t") int height, @NativeType("uint32_t") int depth) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJJJJJJJJV(commandBuffer.address(), raygenShaderBindingTableBuffer, raygenShaderBindingOffset, missShaderBindingTableBuffer, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth, __functionAddress);
    }

    // --- [ vkCreateRayTracingPipelinesNV ] ---

    /** {@code VkResult vkCreateRayTracingPipelinesNV(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkRayTracingPipelineCreateInfoNV const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    public static int nvkCreateRayTracingPipelinesNV(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesNV;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkRayTracingPipelineCreateInfoNV.SIZEOF, VkRayTracingPipelineCreateInfoNV::validate);
        }
        return callPJPPPI(device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    /** {@code VkResult vkCreateRayTracingPipelinesNV(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkRayTracingPipelineCreateInfoNV const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesNV(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoNV const *") VkRayTracingPipelineCreateInfoNV.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateRayTracingPipelinesNV(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
    }

    // --- [ vkGetRayTracingShaderGroupHandlesNV ] ---

    /** {@code VkResult vkGetRayTracingShaderGroupHandlesNV(VkDevice device, VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void * pData)} */
    public static int nvkGetRayTracingShaderGroupHandlesNV(VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingShaderGroupHandlesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), pipeline, firstGroup, groupCount, dataSize, pData, __functionAddress);
    }

    /** {@code VkResult vkGetRayTracingShaderGroupHandlesNV(VkDevice device, VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetRayTracingShaderGroupHandlesNV(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int firstGroup, @NativeType("uint32_t") int groupCount, @NativeType("void *") ByteBuffer pData) {
        return nvkGetRayTracingShaderGroupHandlesNV(device, pipeline, firstGroup, groupCount, pData.remaining(), memAddress(pData));
    }

    // --- [ vkGetAccelerationStructureHandleNV ] ---

    /** {@code VkResult vkGetAccelerationStructureHandleNV(VkDevice device, VkAccelerationStructureNV accelerationStructure, size_t dataSize, void * pData)} */
    public static int nvkGetAccelerationStructureHandleNV(VkDevice device, long accelerationStructure, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureHandleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), accelerationStructure, dataSize, pData, __functionAddress);
    }

    /** {@code VkResult vkGetAccelerationStructureHandleNV(VkDevice device, VkAccelerationStructureNV accelerationStructure, size_t dataSize, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("void *") ByteBuffer pData) {
        return nvkGetAccelerationStructureHandleNV(device, accelerationStructure, pData.remaining(), memAddress(pData));
    }

    /** {@code VkResult vkGetAccelerationStructureHandleNV(VkDevice device, VkAccelerationStructureNV accelerationStructure, size_t dataSize, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("void *") LongBuffer pData) {
        return nvkGetAccelerationStructureHandleNV(device, accelerationStructure, Integer.toUnsignedLong(pData.remaining()) << 3, memAddress(pData));
    }

    // --- [ vkCmdWriteAccelerationStructuresPropertiesNV ] ---

    /** {@code void vkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, VkAccelerationStructureNV const * pAccelerationStructures, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery)} */
    public static void nvkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, int accelerationStructureCount, long pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }

    /** {@code void vkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, VkAccelerationStructureNV const * pAccelerationStructures, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery)} */
    public static void vkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNV const *") LongBuffer pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        nvkCmdWriteAccelerationStructuresPropertiesNV(commandBuffer, pAccelerationStructures.remaining(), memAddress(pAccelerationStructures), queryType, queryPool, firstQuery);
    }

    // --- [ vkCompileDeferredNV ] ---

    /** {@code VkResult vkCompileDeferredNV(VkDevice device, VkPipeline pipeline, uint32_t shader)} */
    @NativeType("VkResult")
    public static int vkCompileDeferredNV(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int shader) {
        long __functionAddress = device.getCapabilities().vkCompileDeferredNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), pipeline, shader, __functionAddress);
    }

    /** {@code VkResult vkCreateAccelerationStructureNV(VkDevice device, VkAccelerationStructureCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkAccelerationStructureNV * pAccelerationStructure)} */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureNV(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoNV const *") VkAccelerationStructureCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureNV *") long[] pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pAccelerationStructure, 1);
            VkAccelerationStructureCreateInfoNV.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pAccelerationStructure, __functionAddress);
    }

    /** {@code VkResult vkCreateRayTracingPipelinesNV(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkRayTracingPipelineCreateInfoNV const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesNV(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoNV const *") VkRayTracingPipelineCreateInfoNV.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkRayTracingPipelineCreateInfoNV.SIZEOF, VkRayTracingPipelineCreateInfoNV::validate);
        }
        return callPJPPPI(device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    /** {@code VkResult vkGetAccelerationStructureHandleNV(VkDevice device, VkAccelerationStructureNV accelerationStructure, size_t dataSize, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("void *") long[] pData) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureHandleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), accelerationStructure, Integer.toUnsignedLong(pData.length) << 3, pData, __functionAddress);
    }

    /** {@code void vkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, VkAccelerationStructureNV const * pAccelerationStructures, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery)} */
    public static void vkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNV const *") long[] pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), pAccelerationStructures.length, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }

}