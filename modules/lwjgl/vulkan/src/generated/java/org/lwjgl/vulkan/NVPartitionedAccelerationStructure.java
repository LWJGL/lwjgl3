/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVPartitionedAccelerationStructure {

    public static final int VK_NV_PARTITIONED_ACCELERATION_STRUCTURE_SPEC_VERSION = 1;

    public static final String VK_NV_PARTITIONED_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_NV_partitioned_acceleration_structure";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV   = 1000570000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV = 1000570001,
        VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV       = 1000570002,
        VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV            = 1000570003,
        VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV                 = 1000570004,
        VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV                      = 1000570005;

    public static final int VK_DESCRIPTOR_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_NV = 1000570000;

    public static final int VK_PARTITIONED_ACCELERATION_STRUCTURE_PARTITION_INDEX_GLOBAL_NV = (~0);

    public static final int
        VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_INSTANCE_NV              = 0,
        VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_UPDATE_INSTANCE_NV             = 1,
        VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_PARTITION_TRANSLATION_NV = 2;

    public static final int
        VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_TRIANGLE_FACING_CULL_DISABLE_BIT_NV = 0x1,
        VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_TRIANGLE_FLIP_FACING_BIT_NV         = 0x2,
        VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_FORCE_OPAQUE_BIT_NV                 = 0x4,
        VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_FORCE_NO_OPAQUE_BIT_NV              = 0x8,
        VK_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_ENABLE_EXPLICIT_BOUNDING_BOX_NV     = 0x10;

    protected NVPartitionedAccelerationStructure() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPartitionedAccelerationStructuresBuildSizesNV ] ---

    /** {@code void vkGetPartitionedAccelerationStructuresBuildSizesNV(VkDevice device, VkPartitionedAccelerationStructureInstancesInputNV const * pInfo, VkAccelerationStructureBuildSizesInfoKHR * pSizeInfo)} */
    public static void nvkGetPartitionedAccelerationStructuresBuildSizesNV(VkDevice device, long pInfo, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetPartitionedAccelerationStructuresBuildSizesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pSizeInfo, __functionAddress);
    }

    /** {@code void vkGetPartitionedAccelerationStructuresBuildSizesNV(VkDevice device, VkPartitionedAccelerationStructureInstancesInputNV const * pInfo, VkAccelerationStructureBuildSizesInfoKHR * pSizeInfo)} */
    public static void vkGetPartitionedAccelerationStructuresBuildSizesNV(VkDevice device, @NativeType("VkPartitionedAccelerationStructureInstancesInputNV const *") VkPartitionedAccelerationStructureInstancesInputNV pInfo, @NativeType("VkAccelerationStructureBuildSizesInfoKHR *") VkAccelerationStructureBuildSizesInfoKHR pSizeInfo) {
        nvkGetPartitionedAccelerationStructuresBuildSizesNV(device, pInfo.address(), pSizeInfo.address());
    }

    // --- [ vkCmdBuildPartitionedAccelerationStructuresNV ] ---

    /** {@code void vkCmdBuildPartitionedAccelerationStructuresNV(VkCommandBuffer commandBuffer, VkBuildPartitionedAccelerationStructureInfoNV const * pBuildInfo)} */
    public static void nvkCmdBuildPartitionedAccelerationStructuresNV(VkCommandBuffer commandBuffer, long pBuildInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildPartitionedAccelerationStructuresNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pBuildInfo, __functionAddress);
    }

    /** {@code void vkCmdBuildPartitionedAccelerationStructuresNV(VkCommandBuffer commandBuffer, VkBuildPartitionedAccelerationStructureInfoNV const * pBuildInfo)} */
    public static void vkCmdBuildPartitionedAccelerationStructuresNV(VkCommandBuffer commandBuffer, @NativeType("VkBuildPartitionedAccelerationStructureInfoNV const *") VkBuildPartitionedAccelerationStructureInfoNV pBuildInfo) {
        nvkCmdBuildPartitionedAccelerationStructuresNV(commandBuffer, pBuildInfo.address());
    }

}