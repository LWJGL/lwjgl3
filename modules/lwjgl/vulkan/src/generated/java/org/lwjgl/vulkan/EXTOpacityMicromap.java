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

public class EXTOpacityMicromap {

    public static final int VK_EXT_OPACITY_MICROMAP_SPEC_VERSION = 2;

    public static final String VK_EXT_OPACITY_MICROMAP_EXTENSION_NAME = "VK_EXT_opacity_micromap";

    public static final int
        VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT                               = 1000396000,
        VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT                             = 1000396001,
        VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT                                = 1000396002,
        VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT                      = 1000396003,
        VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT                      = 1000396004,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT         = 1000396005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT       = 1000396006,
        VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT                              = 1000396007,
        VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT                         = 1000396008,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT = 1000396009;

    public static final long VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT = 0x40000000L;

    public static final long
        VK_ACCESS_2_MICROMAP_READ_BIT_EXT  = 0x100000000000L,
        VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT = 0x200000000000L;

    public static final int
        VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT = 1000396000,
        VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT     = 1000396001;

    public static final int VK_OBJECT_TYPE_MICROMAP_EXT = 1000396000;

    public static final int
        VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 0x800000,
        VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT               = 0x1000000;

    public static final int VK_PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT = 0x1000000;

    public static final int
        VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT = 0x10,
        VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT      = 0x20;

    public static final int
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT      = 0x40,
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT    = 0x80,
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT = 0x100;

    public static final int VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT = 0;

    public static final int
        VK_BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT = 0x1,
        VK_BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT = 0x2,
        VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT  = 0x4;

    public static final int VK_BUILD_MICROMAP_MODE_BUILD_EXT = 0;

    public static final int VK_MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT = 0x1;

    public static final int
        VK_COPY_MICROMAP_MODE_CLONE_EXT       = 0,
        VK_COPY_MICROMAP_MODE_SERIALIZE_EXT   = 1,
        VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT = 2,
        VK_COPY_MICROMAP_MODE_COMPACT_EXT     = 3;

    public static final int
        VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT = 1,
        VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT = 2;

    public static final int
        VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT         = -1,
        VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT              = -2,
        VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT = -3,
        VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT      = -4;

    protected EXTOpacityMicromap() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateMicromapEXT ] ---

    /** {@code VkResult vkCreateMicromapEXT(VkDevice device, VkMicromapCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkMicromapEXT * pMicromap)} */
    public static int nvkCreateMicromapEXT(VkDevice device, long pCreateInfo, long pAllocator, long pMicromap) {
        long __functionAddress = device.getCapabilities().vkCreateMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pMicromap, __functionAddress);
    }

    /** {@code VkResult vkCreateMicromapEXT(VkDevice device, VkMicromapCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkMicromapEXT * pMicromap)} */
    @NativeType("VkResult")
    public static int vkCreateMicromapEXT(VkDevice device, @NativeType("VkMicromapCreateInfoEXT const *") VkMicromapCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkMicromapEXT *") LongBuffer pMicromap) {
        if (CHECKS) {
            check(pMicromap, 1);
        }
        return nvkCreateMicromapEXT(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pMicromap));
    }

    // --- [ vkDestroyMicromapEXT ] ---

    /** {@code void vkDestroyMicromapEXT(VkDevice device, VkMicromapEXT micromap, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyMicromapEXT(VkDevice device, long micromap, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), micromap, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyMicromapEXT(VkDevice device, VkMicromapEXT micromap, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyMicromapEXT(VkDevice device, @NativeType("VkMicromapEXT") long micromap, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyMicromapEXT(device, micromap, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdBuildMicromapsEXT ] ---

    /** {@code void vkCmdBuildMicromapsEXT(VkCommandBuffer commandBuffer, uint32_t infoCount, VkMicromapBuildInfoEXT const * pInfos)} */
    public static void nvkCmdBuildMicromapsEXT(VkCommandBuffer commandBuffer, int infoCount, long pInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildMicromapsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), infoCount, pInfos, __functionAddress);
    }

    /** {@code void vkCmdBuildMicromapsEXT(VkCommandBuffer commandBuffer, uint32_t infoCount, VkMicromapBuildInfoEXT const * pInfos)} */
    public static void vkCmdBuildMicromapsEXT(VkCommandBuffer commandBuffer, @NativeType("VkMicromapBuildInfoEXT const *") VkMicromapBuildInfoEXT.Buffer pInfos) {
        nvkCmdBuildMicromapsEXT(commandBuffer, pInfos.remaining(), pInfos.address());
    }

    // --- [ vkBuildMicromapsEXT ] ---

    /** {@code VkResult vkBuildMicromapsEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, uint32_t infoCount, VkMicromapBuildInfoEXT const * pInfos)} */
    public static int nvkBuildMicromapsEXT(VkDevice device, long deferredOperation, int infoCount, long pInfos) {
        long __functionAddress = device.getCapabilities().vkBuildMicromapsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, infoCount, pInfos, __functionAddress);
    }

    /** {@code VkResult vkBuildMicromapsEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, uint32_t infoCount, VkMicromapBuildInfoEXT const * pInfos)} */
    @NativeType("VkResult")
    public static int vkBuildMicromapsEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkMicromapBuildInfoEXT const *") VkMicromapBuildInfoEXT.Buffer pInfos) {
        return nvkBuildMicromapsEXT(device, deferredOperation, pInfos.remaining(), pInfos.address());
    }

    // --- [ vkCopyMicromapEXT ] ---

    /** {@code VkResult vkCopyMicromapEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyMicromapInfoEXT const * pInfo)} */
    public static int nvkCopyMicromapEXT(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyMicromapEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyMicromapInfoEXT const * pInfo)} */
    @NativeType("VkResult")
    public static int vkCopyMicromapEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMicromapInfoEXT const *") VkCopyMicromapInfoEXT pInfo) {
        return nvkCopyMicromapEXT(device, deferredOperation, pInfo.address());
    }

    // --- [ vkCopyMicromapToMemoryEXT ] ---

    /** {@code VkResult vkCopyMicromapToMemoryEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyMicromapToMemoryInfoEXT const * pInfo)} */
    public static int nvkCopyMicromapToMemoryEXT(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMicromapToMemoryEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyMicromapToMemoryEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyMicromapToMemoryInfoEXT const * pInfo)} */
    @NativeType("VkResult")
    public static int vkCopyMicromapToMemoryEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMicromapToMemoryInfoEXT const *") VkCopyMicromapToMemoryInfoEXT pInfo) {
        return nvkCopyMicromapToMemoryEXT(device, deferredOperation, pInfo.address());
    }

    // --- [ vkCopyMemoryToMicromapEXT ] ---

    /** {@code VkResult vkCopyMemoryToMicromapEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyMemoryToMicromapInfoEXT const * pInfo)} */
    public static int nvkCopyMemoryToMicromapEXT(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyMemoryToMicromapEXT(VkDevice device, VkDeferredOperationKHR deferredOperation, VkCopyMemoryToMicromapInfoEXT const * pInfo)} */
    @NativeType("VkResult")
    public static int vkCopyMemoryToMicromapEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMemoryToMicromapInfoEXT const *") VkCopyMemoryToMicromapInfoEXT pInfo) {
        return nvkCopyMemoryToMicromapEXT(device, deferredOperation, pInfo.address());
    }

    // --- [ vkWriteMicromapsPropertiesEXT ] ---

    /** {@code VkResult vkWriteMicromapsPropertiesEXT(VkDevice device, uint32_t micromapCount, VkMicromapEXT const * pMicromaps, VkQueryType queryType, size_t dataSize, void * pData, size_t stride)} */
    public static int nvkWriteMicromapsPropertiesEXT(VkDevice device, int micromapCount, long pMicromaps, int queryType, long dataSize, long pData, long stride) {
        long __functionAddress = device.getCapabilities().vkWriteMicromapsPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), micromapCount, pMicromaps, queryType, dataSize, pData, stride, __functionAddress);
    }

    /** {@code VkResult vkWriteMicromapsPropertiesEXT(VkDevice device, uint32_t micromapCount, VkMicromapEXT const * pMicromaps, VkQueryType queryType, size_t dataSize, void * pData, size_t stride)} */
    @NativeType("VkResult")
    public static int vkWriteMicromapsPropertiesEXT(VkDevice device, @NativeType("VkMicromapEXT const *") LongBuffer pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        return nvkWriteMicromapsPropertiesEXT(device, pMicromaps.remaining(), memAddress(pMicromaps), queryType, pData.remaining(), memAddress(pData), stride);
    }

    // --- [ vkCmdCopyMicromapEXT ] ---

    /** {@code void vkCmdCopyMicromapEXT(VkCommandBuffer commandBuffer, VkCopyMicromapInfoEXT const * pInfo)} */
    public static void nvkCmdCopyMicromapEXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyMicromapEXT(VkCommandBuffer commandBuffer, VkCopyMicromapInfoEXT const * pInfo)} */
    public static void vkCmdCopyMicromapEXT(VkCommandBuffer commandBuffer, @NativeType("VkCopyMicromapInfoEXT const *") VkCopyMicromapInfoEXT pInfo) {
        nvkCmdCopyMicromapEXT(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdCopyMicromapToMemoryEXT ] ---

    /** {@code void vkCmdCopyMicromapToMemoryEXT(VkCommandBuffer commandBuffer, VkCopyMicromapToMemoryInfoEXT const * pInfo)} */
    public static void nvkCmdCopyMicromapToMemoryEXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMicromapToMemoryEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyMicromapToMemoryEXT(VkCommandBuffer commandBuffer, VkCopyMicromapToMemoryInfoEXT const * pInfo)} */
    public static void vkCmdCopyMicromapToMemoryEXT(VkCommandBuffer commandBuffer, @NativeType("VkCopyMicromapToMemoryInfoEXT const *") VkCopyMicromapToMemoryInfoEXT pInfo) {
        nvkCmdCopyMicromapToMemoryEXT(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdCopyMemoryToMicromapEXT ] ---

    /** {@code void vkCmdCopyMemoryToMicromapEXT(VkCommandBuffer commandBuffer, VkCopyMemoryToMicromapInfoEXT const * pInfo)} */
    public static void nvkCmdCopyMemoryToMicromapEXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyMemoryToMicromapEXT(VkCommandBuffer commandBuffer, VkCopyMemoryToMicromapInfoEXT const * pInfo)} */
    public static void vkCmdCopyMemoryToMicromapEXT(VkCommandBuffer commandBuffer, @NativeType("VkCopyMemoryToMicromapInfoEXT const *") VkCopyMemoryToMicromapInfoEXT pInfo) {
        nvkCmdCopyMemoryToMicromapEXT(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdWriteMicromapsPropertiesEXT ] ---

    /** {@code void vkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, uint32_t micromapCount, VkMicromapEXT const * pMicromaps, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery)} */
    public static void nvkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, int micromapCount, long pMicromaps, int queryType, long queryPool, int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteMicromapsPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), micromapCount, pMicromaps, queryType, queryPool, firstQuery, __functionAddress);
    }

    /** {@code void vkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, uint32_t micromapCount, VkMicromapEXT const * pMicromaps, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery)} */
    public static void vkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, @NativeType("VkMicromapEXT const *") LongBuffer pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        nvkCmdWriteMicromapsPropertiesEXT(commandBuffer, pMicromaps.remaining(), memAddress(pMicromaps), queryType, queryPool, firstQuery);
    }

    // --- [ vkGetDeviceMicromapCompatibilityEXT ] ---

    /** {@code void vkGetDeviceMicromapCompatibilityEXT(VkDevice device, VkMicromapVersionInfoEXT const * pVersionInfo, VkAccelerationStructureCompatibilityKHR * pCompatibility)} */
    public static void nvkGetDeviceMicromapCompatibilityEXT(VkDevice device, long pVersionInfo, long pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMicromapCompatibilityEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkMicromapVersionInfoEXT.validate(pVersionInfo);
        }
        callPPPV(device.address(), pVersionInfo, pCompatibility, __functionAddress);
    }

    /** {@code void vkGetDeviceMicromapCompatibilityEXT(VkDevice device, VkMicromapVersionInfoEXT const * pVersionInfo, VkAccelerationStructureCompatibilityKHR * pCompatibility)} */
    public static void vkGetDeviceMicromapCompatibilityEXT(VkDevice device, @NativeType("VkMicromapVersionInfoEXT const *") VkMicromapVersionInfoEXT pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") IntBuffer pCompatibility) {
        if (CHECKS) {
            check(pCompatibility, 1);
        }
        nvkGetDeviceMicromapCompatibilityEXT(device, pVersionInfo.address(), memAddress(pCompatibility));
    }

    // --- [ vkGetMicromapBuildSizesEXT ] ---

    /** {@code void vkGetMicromapBuildSizesEXT(VkDevice device, VkAccelerationStructureBuildTypeKHR buildType, VkMicromapBuildInfoEXT const * pBuildInfo, VkMicromapBuildSizesInfoEXT * pSizeInfo)} */
    public static void nvkGetMicromapBuildSizesEXT(VkDevice device, int buildType, long pBuildInfo, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetMicromapBuildSizesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), buildType, pBuildInfo, pSizeInfo, __functionAddress);
    }

    /** {@code void vkGetMicromapBuildSizesEXT(VkDevice device, VkAccelerationStructureBuildTypeKHR buildType, VkMicromapBuildInfoEXT const * pBuildInfo, VkMicromapBuildSizesInfoEXT * pSizeInfo)} */
    public static void vkGetMicromapBuildSizesEXT(VkDevice device, @NativeType("VkAccelerationStructureBuildTypeKHR") int buildType, @NativeType("VkMicromapBuildInfoEXT const *") VkMicromapBuildInfoEXT pBuildInfo, @NativeType("VkMicromapBuildSizesInfoEXT *") VkMicromapBuildSizesInfoEXT pSizeInfo) {
        nvkGetMicromapBuildSizesEXT(device, buildType, pBuildInfo.address(), pSizeInfo.address());
    }

    /** {@code VkResult vkCreateMicromapEXT(VkDevice device, VkMicromapCreateInfoEXT const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkMicromapEXT * pMicromap)} */
    @NativeType("VkResult")
    public static int vkCreateMicromapEXT(VkDevice device, @NativeType("VkMicromapCreateInfoEXT const *") VkMicromapCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkMicromapEXT *") long[] pMicromap) {
        long __functionAddress = device.getCapabilities().vkCreateMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pMicromap, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pMicromap, __functionAddress);
    }

    /** {@code VkResult vkWriteMicromapsPropertiesEXT(VkDevice device, uint32_t micromapCount, VkMicromapEXT const * pMicromaps, VkQueryType queryType, size_t dataSize, void * pData, size_t stride)} */
    @NativeType("VkResult")
    public static int vkWriteMicromapsPropertiesEXT(VkDevice device, @NativeType("VkMicromapEXT const *") long[] pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        long __functionAddress = device.getCapabilities().vkWriteMicromapsPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), pMicromaps.length, pMicromaps, queryType, (long)pData.remaining(), memAddress(pData), stride, __functionAddress);
    }

    /** {@code void vkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, uint32_t micromapCount, VkMicromapEXT const * pMicromaps, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery)} */
    public static void vkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, @NativeType("VkMicromapEXT const *") long[] pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteMicromapsPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), pMicromaps.length, pMicromaps, queryType, queryPool, firstQuery, __functionAddress);
    }

    /** {@code void vkGetDeviceMicromapCompatibilityEXT(VkDevice device, VkMicromapVersionInfoEXT const * pVersionInfo, VkAccelerationStructureCompatibilityKHR * pCompatibility)} */
    public static void vkGetDeviceMicromapCompatibilityEXT(VkDevice device, @NativeType("VkMicromapVersionInfoEXT const *") VkMicromapVersionInfoEXT pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") int[] pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMicromapCompatibilityEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pCompatibility, 1);
            VkMicromapVersionInfoEXT.validate(pVersionInfo.address());
        }
        callPPPV(device.address(), pVersionInfo.address(), pCompatibility, __functionAddress);
    }

}