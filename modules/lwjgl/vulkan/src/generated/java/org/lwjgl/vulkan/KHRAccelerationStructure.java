/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRAccelerationStructure {

    public static final int VK_KHR_ACCELERATION_STRUCTURE_SPEC_VERSION = 13;

    public static final String VK_KHR_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_KHR_acceleration_structure";

    public static final int
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR        = 1000150000,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR        = 1000150002,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR        = 1000150003,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR    = 1000150004,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR    = 1000150005,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR                   = 1000150006,
        VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR       = 1000150007,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR               = 1000150009,
        VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR                  = 1000150010,
        VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR        = 1000150011,
        VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR        = 1000150012,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR   = 1000150013,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR = 1000150014,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR                = 1000150017,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR           = 1000150020;

    public static final int VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 0x2000000;

    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR = 1000150000;

    public static final int
        VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR  = 0x200000,
        VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 0x400000;

    public static final int
        VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR     = 1000150000,
        VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR = 1000150001;

    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR = 1000150000;

    public static final int VK_INDEX_TYPE_NONE_KHR = 1000165000;

    public static final int VK_FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 0x20000000;

    public static final int
        VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 0x80000,
        VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR               = 0x100000;

    public static final int
        VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR       = 0,
        VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR     = 1,
        VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR   = 2,
        VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR = 3;

    public static final long VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 0x20000000L;

    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR_EXT = 1000150000;

    public static final int
        VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR    = 0,
        VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR = 1,
        VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR      = 2;

    public static final int
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR      = 0x1,
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR  = 0x2,
        VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR = 0x4,
        VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR = 0x8,
        VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR        = 0x10;

    public static final int
        VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR  = 0,
        VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR = 1;

    public static final int
        VK_GEOMETRY_TYPE_TRIANGLES_KHR = 0,
        VK_GEOMETRY_TYPE_AABBS_KHR     = 1,
        VK_GEOMETRY_TYPE_INSTANCES_KHR = 2;

    public static final int
        VK_GEOMETRY_OPAQUE_BIT_KHR                          = 0x1,
        VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR = 0x2;

    public static final int
        VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR           = 0,
        VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR         = 1,
        VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR = 2;

    public static final int
        VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR    = 0x1,
        VK_GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR            = 0x2,
        VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR = 0x2,
        VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR                    = 0x4,
        VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR                 = 0x8;

    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 0x1;

    public static final int
        VK_ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR   = 0,
        VK_ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR = 1;

    protected KHRAccelerationStructure() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateAccelerationStructureKHR ] ---

    /** {@code VkResult vkCreateAccelerationStructureKHR(VkDevice device, VkAccelerationStructureCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkAccelerationStructureKHR * pAccelerationStructure)} */
    public static int nvkCreateAccelerationStructureKHR(VkDevice device, long pCreateInfo, long pAllocator, long pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pAccelerationStructure, __functionAddress);
    }

    /** {@code VkResult vkCreateAccelerationStructureKHR(VkDevice device, VkAccelerationStructureCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkAccelerationStructureKHR * pAccelerationStructure)} */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureKHR(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoKHR const *") VkAccelerationStructureCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureKHR *") LongBuffer pAccelerationStructure) {
        if (CHECKS) {
            check(pAccelerationStructure, 1);
        }
        return nvkCreateAccelerationStructureKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pAccelerationStructure));
    }

    // --- [ vkDestroyAccelerationStructureKHR ] ---

    /** {@code void vkDestroyAccelerationStructureKHR(VkDevice device, VkAccelerationStructureKHR accelerationStructure, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyAccelerationStructureKHR(VkDevice device, long accelerationStructure, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), accelerationStructure, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyAccelerationStructureKHR(VkDevice device, VkAccelerationStructureKHR accelerationStructure, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyAccelerationStructureKHR(VkDevice device, @NativeType("VkAccelerationStructureKHR") long accelerationStructure, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyAccelerationStructureKHR(device, accelerationStructure, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdBuildAccelerationStructuresKHR ] ---

    /** {@code void vkCmdBuildAccelerationStructuresKHR(VkCommandBuffer commandBuffer, uint32_t infoCount, VkAccelerationStructureBuildGeometryInfoKHR const * pInfos, VkAccelerationStructureBuildRangeInfoKHR const * const * ppBuildRangeInfos)} */
    public static void nvkCmdBuildAccelerationStructuresKHR(VkCommandBuffer commandBuffer, int infoCount, long pInfos, long ppBuildRangeInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructuresKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), infoCount, pInfos, ppBuildRangeInfos, __functionAddress);
    }

    /** {@code void vkCmdBuildAccelerationStructuresKHR(VkCommandBuffer commandBuffer, uint32_t infoCount, VkAccelerationStructureBuildGeometryInfoKHR const * pInfos, VkAccelerationStructureBuildRangeInfoKHR const * const * ppBuildRangeInfos)} */
    public static void vkCmdBuildAccelerationStructuresKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkAccelerationStructureBuildRangeInfoKHR const * const *") PointerBuffer ppBuildRangeInfos) {
        if (CHECKS) {
            check(ppBuildRangeInfos, pInfos.remaining());
        }
        nvkCmdBuildAccelerationStructuresKHR(commandBuffer, pInfos.remaining(), pInfos.address(), memAddress(ppBuildRangeInfos));
    }

    // --- [ vkCmdBuildAccelerationStructuresIndirectKHR ] ---

    /** {@code void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, uint32_t infoCount, VkAccelerationStructureBuildGeometryInfoKHR const * pInfos, VkDeviceAddress const * pIndirectDeviceAddresses, uint32_t const * pIndirectStrides, uint32_t const * const * ppMaxPrimitiveCounts)} */
    public static void nvkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, int infoCount, long pInfos, long pIndirectDeviceAddresses, long pIndirectStrides, long ppMaxPrimitiveCounts) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructuresIndirectKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(commandBuffer.address(), infoCount, pInfos, pIndirectDeviceAddresses, pIndirectStrides, ppMaxPrimitiveCounts, __functionAddress);
    }

    /** {@code void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, uint32_t infoCount, VkAccelerationStructureBuildGeometryInfoKHR const * pInfos, VkDeviceAddress const * pIndirectDeviceAddresses, uint32_t const * pIndirectStrides, uint32_t const * const * ppMaxPrimitiveCounts)} */
    public static void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkDeviceAddress const *") LongBuffer pIndirectDeviceAddresses, @NativeType("uint32_t const *") IntBuffer pIndirectStrides, @NativeType("uint32_t const * const *") PointerBuffer ppMaxPrimitiveCounts) {
        if (CHECKS) {
            check(pIndirectDeviceAddresses, pInfos.remaining());
            check(pIndirectStrides, pInfos.remaining());
            check(ppMaxPrimitiveCounts, pInfos.remaining());
        }
        nvkCmdBuildAccelerationStructuresIndirectKHR(commandBuffer, pInfos.remaining(), pInfos.address(), memAddress(pIndirectDeviceAddresses), memAddress(pIndirectStrides), memAddress(ppMaxPrimitiveCounts));
    }

    // --- [ vkBuildAccelerationStructuresKHR ] ---

    /** {@code VkResult vkBuildAccelerationStructuresKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, uint32_t infoCount, VkAccelerationStructureBuildGeometryInfoKHR const * pInfos, VkAccelerationStructureBuildRangeInfoKHR const * const * ppBuildRangeInfos)} */
    public static int nvkBuildAccelerationStructuresKHR(VkDevice device, long deferredOperation, int infoCount, long pInfos, long ppBuildRangeInfos) {
        long __functionAddress = device.getCapabilities().vkBuildAccelerationStructuresKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), deferredOperation, infoCount, pInfos, ppBuildRangeInfos, __functionAddress);
    }

    /** {@code VkResult vkBuildAccelerationStructuresKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, uint32_t infoCount, VkAccelerationStructureBuildGeometryInfoKHR const * pInfos, VkAccelerationStructureBuildRangeInfoKHR const * const * ppBuildRangeInfos)} */
    @NativeType("VkResult")
    public static int vkBuildAccelerationStructuresKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkAccelerationStructureBuildRangeInfoKHR const * const *") PointerBuffer ppBuildRangeInfos) {
        if (CHECKS) {
            check(ppBuildRangeInfos, pInfos.remaining());
        }
        return nvkBuildAccelerationStructuresKHR(device, deferredOperation, pInfos.remaining(), pInfos.address(), memAddress(ppBuildRangeInfos));
    }

    // --- [ vkCopyAccelerationStructureKHR ] ---

    /** {@code VkResult vkCopyAccelerationStructureKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyAccelerationStructureInfoKHR const * pInfo)} */
    public static int nvkCopyAccelerationStructureKHR(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyAccelerationStructureKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyAccelerationStructureInfoKHR const * pInfo)} */
    @NativeType("VkResult")
    public static int vkCopyAccelerationStructureKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyAccelerationStructureInfoKHR const *") VkCopyAccelerationStructureInfoKHR pInfo) {
        return nvkCopyAccelerationStructureKHR(device, deferredOperation, pInfo.address());
    }

    // --- [ vkCopyAccelerationStructureToMemoryKHR ] ---

    /** {@code VkResult vkCopyAccelerationStructureToMemoryKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyAccelerationStructureToMemoryInfoKHR const * pInfo)} */
    public static int nvkCopyAccelerationStructureToMemoryKHR(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyAccelerationStructureToMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyAccelerationStructureToMemoryKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyAccelerationStructureToMemoryInfoKHR const * pInfo)} */
    @NativeType("VkResult")
    public static int vkCopyAccelerationStructureToMemoryKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyAccelerationStructureToMemoryInfoKHR const *") VkCopyAccelerationStructureToMemoryInfoKHR pInfo) {
        return nvkCopyAccelerationStructureToMemoryKHR(device, deferredOperation, pInfo.address());
    }

    // --- [ vkCopyMemoryToAccelerationStructureKHR ] ---

    /** {@code VkResult vkCopyMemoryToAccelerationStructureKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyMemoryToAccelerationStructureInfoKHR const * pInfo)} */
    public static int nvkCopyMemoryToAccelerationStructureKHR(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyMemoryToAccelerationStructureKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyMemoryToAccelerationStructureInfoKHR const * pInfo)} */
    @NativeType("VkResult")
    public static int vkCopyMemoryToAccelerationStructureKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMemoryToAccelerationStructureInfoKHR const *") VkCopyMemoryToAccelerationStructureInfoKHR pInfo) {
        return nvkCopyMemoryToAccelerationStructureKHR(device, deferredOperation, pInfo.address());
    }

    // --- [ vkWriteAccelerationStructuresPropertiesKHR ] ---

    /** {@code VkResult vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, uint32_t accelerationStructureCount, VkAccelerationStructureKHR const * pAccelerationStructures, VkQueryType queryType, size_t dataSize, void * pData, size_t stride)} */
    public static int nvkWriteAccelerationStructuresPropertiesKHR(VkDevice device, int accelerationStructureCount, long pAccelerationStructures, int queryType, long dataSize, long pData, long stride) {
        long __functionAddress = device.getCapabilities().vkWriteAccelerationStructuresPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), accelerationStructureCount, pAccelerationStructures, queryType, dataSize, pData, stride, __functionAddress);
    }

    /** {@code VkResult vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, uint32_t accelerationStructureCount, VkAccelerationStructureKHR const * pAccelerationStructures, VkQueryType queryType, size_t dataSize, void * pData, size_t stride)} */
    @NativeType("VkResult")
    public static int vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, @NativeType("VkAccelerationStructureKHR const *") LongBuffer pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        return nvkWriteAccelerationStructuresPropertiesKHR(device, pAccelerationStructures.remaining(), memAddress(pAccelerationStructures), queryType, pData.remaining(), memAddress(pData), stride);
    }

    // --- [ vkCmdCopyAccelerationStructureKHR ] ---

    /** {@code void vkCmdCopyAccelerationStructureKHR(VkCommandBuffer commandBuffer, VkCopyAccelerationStructureInfoKHR const * pInfo)} */
    public static void nvkCmdCopyAccelerationStructureKHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyAccelerationStructureKHR(VkCommandBuffer commandBuffer, VkCopyAccelerationStructureInfoKHR const * pInfo)} */
    public static void vkCmdCopyAccelerationStructureKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyAccelerationStructureInfoKHR const *") VkCopyAccelerationStructureInfoKHR pInfo) {
        nvkCmdCopyAccelerationStructureKHR(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdCopyAccelerationStructureToMemoryKHR ] ---

    /** {@code void vkCmdCopyAccelerationStructureToMemoryKHR(VkCommandBuffer commandBuffer, VkCopyAccelerationStructureToMemoryInfoKHR const * pInfo)} */
    public static void nvkCmdCopyAccelerationStructureToMemoryKHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyAccelerationStructureToMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyAccelerationStructureToMemoryKHR(VkCommandBuffer commandBuffer, VkCopyAccelerationStructureToMemoryInfoKHR const * pInfo)} */
    public static void vkCmdCopyAccelerationStructureToMemoryKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyAccelerationStructureToMemoryInfoKHR const *") VkCopyAccelerationStructureToMemoryInfoKHR pInfo) {
        nvkCmdCopyAccelerationStructureToMemoryKHR(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdCopyMemoryToAccelerationStructureKHR ] ---

    /** {@code void vkCmdCopyMemoryToAccelerationStructureKHR(VkCommandBuffer commandBuffer, VkCopyMemoryToAccelerationStructureInfoKHR const * pInfo)} */
    public static void nvkCmdCopyMemoryToAccelerationStructureKHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyMemoryToAccelerationStructureKHR(VkCommandBuffer commandBuffer, VkCopyMemoryToAccelerationStructureInfoKHR const * pInfo)} */
    public static void vkCmdCopyMemoryToAccelerationStructureKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyMemoryToAccelerationStructureInfoKHR const *") VkCopyMemoryToAccelerationStructureInfoKHR pInfo) {
        nvkCmdCopyMemoryToAccelerationStructureKHR(commandBuffer, pInfo.address());
    }

    // --- [ vkGetAccelerationStructureDeviceAddressKHR ] ---

    /** {@code VkDeviceAddress vkGetAccelerationStructureDeviceAddressKHR(VkDevice device, VkAccelerationStructureDeviceAddressInfoKHR const * pInfo)} */
    public static long nvkGetAccelerationStructureDeviceAddressKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureDeviceAddressKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /** {@code VkDeviceAddress vkGetAccelerationStructureDeviceAddressKHR(VkDevice device, VkAccelerationStructureDeviceAddressInfoKHR const * pInfo)} */
    @NativeType("VkDeviceAddress")
    public static long vkGetAccelerationStructureDeviceAddressKHR(VkDevice device, @NativeType("VkAccelerationStructureDeviceAddressInfoKHR const *") VkAccelerationStructureDeviceAddressInfoKHR pInfo) {
        return nvkGetAccelerationStructureDeviceAddressKHR(device, pInfo.address());
    }

    // --- [ vkCmdWriteAccelerationStructuresPropertiesKHR ] ---

    /** {@code void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, VkAccelerationStructureKHR const * pAccelerationStructures, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery)} */
    public static void nvkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, int accelerationStructureCount, long pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }

    /** {@code void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, VkAccelerationStructureKHR const * pAccelerationStructures, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery)} */
    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureKHR const *") LongBuffer pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        nvkCmdWriteAccelerationStructuresPropertiesKHR(commandBuffer, pAccelerationStructures.remaining(), memAddress(pAccelerationStructures), queryType, queryPool, firstQuery);
    }

    // --- [ vkGetDeviceAccelerationStructureCompatibilityKHR ] ---

    /** {@code void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, VkAccelerationStructureVersionInfoKHR const * pVersionInfo, VkAccelerationStructureCompatibilityKHR * pCompatibility)} */
    public static void nvkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, long pVersionInfo, long pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceAccelerationStructureCompatibilityKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkAccelerationStructureVersionInfoKHR.validate(pVersionInfo);
        }
        callPPPV(device.address(), pVersionInfo, pCompatibility, __functionAddress);
    }

    /** {@code void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, VkAccelerationStructureVersionInfoKHR const * pVersionInfo, VkAccelerationStructureCompatibilityKHR * pCompatibility)} */
    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, @NativeType("VkAccelerationStructureVersionInfoKHR const *") VkAccelerationStructureVersionInfoKHR pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") IntBuffer pCompatibility) {
        if (CHECKS) {
            check(pCompatibility, 1);
        }
        nvkGetDeviceAccelerationStructureCompatibilityKHR(device, pVersionInfo.address(), memAddress(pCompatibility));
    }

    // --- [ vkGetAccelerationStructureBuildSizesKHR ] ---

    /** {@code void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, VkAccelerationStructureBuildTypeKHR buildType, VkAccelerationStructureBuildGeometryInfoKHR const * pBuildInfo, uint32_t const * pMaxPrimitiveCounts, VkAccelerationStructureBuildSizesInfoKHR * pSizeInfo)} */
    public static void nvkGetAccelerationStructureBuildSizesKHR(VkDevice device, int buildType, long pBuildInfo, long pMaxPrimitiveCounts, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureBuildSizesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(device.address(), buildType, pBuildInfo, pMaxPrimitiveCounts, pSizeInfo, __functionAddress);
    }

    /** {@code void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, VkAccelerationStructureBuildTypeKHR buildType, VkAccelerationStructureBuildGeometryInfoKHR const * pBuildInfo, uint32_t const * pMaxPrimitiveCounts, VkAccelerationStructureBuildSizesInfoKHR * pSizeInfo)} */
    public static void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, @NativeType("VkAccelerationStructureBuildTypeKHR") int buildType, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR pBuildInfo, @NativeType("uint32_t const *") @Nullable IntBuffer pMaxPrimitiveCounts, @NativeType("VkAccelerationStructureBuildSizesInfoKHR *") VkAccelerationStructureBuildSizesInfoKHR pSizeInfo) {
        if (CHECKS) {
            checkSafe(pMaxPrimitiveCounts, pBuildInfo.geometryCount());
        }
        nvkGetAccelerationStructureBuildSizesKHR(device, buildType, pBuildInfo.address(), memAddressSafe(pMaxPrimitiveCounts), pSizeInfo.address());
    }

    /** {@code VkResult vkCreateAccelerationStructureKHR(VkDevice device, VkAccelerationStructureCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkAccelerationStructureKHR * pAccelerationStructure)} */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureKHR(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoKHR const *") VkAccelerationStructureCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureKHR *") long[] pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pAccelerationStructure, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pAccelerationStructure, __functionAddress);
    }

    /** {@code void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, uint32_t infoCount, VkAccelerationStructureBuildGeometryInfoKHR const * pInfos, VkDeviceAddress const * pIndirectDeviceAddresses, uint32_t const * pIndirectStrides, uint32_t const * const * ppMaxPrimitiveCounts)} */
    public static void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkDeviceAddress const *") long[] pIndirectDeviceAddresses, @NativeType("uint32_t const *") int[] pIndirectStrides, @NativeType("uint32_t const * const *") PointerBuffer ppMaxPrimitiveCounts) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructuresIndirectKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pIndirectDeviceAddresses, pInfos.remaining());
            check(pIndirectStrides, pInfos.remaining());
            check(ppMaxPrimitiveCounts, pInfos.remaining());
        }
        callPPPPPV(commandBuffer.address(), pInfos.remaining(), pInfos.address(), pIndirectDeviceAddresses, pIndirectStrides, memAddress(ppMaxPrimitiveCounts), __functionAddress);
    }

    /** {@code VkResult vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, uint32_t accelerationStructureCount, VkAccelerationStructureKHR const * pAccelerationStructures, VkQueryType queryType, size_t dataSize, void * pData, size_t stride)} */
    @NativeType("VkResult")
    public static int vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, @NativeType("VkAccelerationStructureKHR const *") long[] pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        long __functionAddress = device.getCapabilities().vkWriteAccelerationStructuresPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), pAccelerationStructures.length, pAccelerationStructures, queryType, (long)pData.remaining(), memAddress(pData), stride, __functionAddress);
    }

    /** {@code void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, VkAccelerationStructureKHR const * pAccelerationStructures, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery)} */
    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureKHR const *") long[] pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), pAccelerationStructures.length, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }

    /** {@code void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, VkAccelerationStructureVersionInfoKHR const * pVersionInfo, VkAccelerationStructureCompatibilityKHR * pCompatibility)} */
    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, @NativeType("VkAccelerationStructureVersionInfoKHR const *") VkAccelerationStructureVersionInfoKHR pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") int[] pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceAccelerationStructureCompatibilityKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pCompatibility, 1);
            VkAccelerationStructureVersionInfoKHR.validate(pVersionInfo.address());
        }
        callPPPV(device.address(), pVersionInfo.address(), pCompatibility, __functionAddress);
    }

    /** {@code void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, VkAccelerationStructureBuildTypeKHR buildType, VkAccelerationStructureBuildGeometryInfoKHR const * pBuildInfo, uint32_t const * pMaxPrimitiveCounts, VkAccelerationStructureBuildSizesInfoKHR * pSizeInfo)} */
    public static void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, @NativeType("VkAccelerationStructureBuildTypeKHR") int buildType, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR pBuildInfo, @NativeType("uint32_t const *") int @Nullable [] pMaxPrimitiveCounts, @NativeType("VkAccelerationStructureBuildSizesInfoKHR *") VkAccelerationStructureBuildSizesInfoKHR pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureBuildSizesKHR;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pMaxPrimitiveCounts, pBuildInfo.geometryCount());
        }
        callPPPPV(device.address(), buildType, pBuildInfo.address(), pMaxPrimitiveCounts, pSizeInfo.address(), __functionAddress);
    }

}