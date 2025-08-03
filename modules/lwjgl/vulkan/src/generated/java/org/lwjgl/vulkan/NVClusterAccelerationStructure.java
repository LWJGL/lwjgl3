/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVClusterAccelerationStructure {

    public static final int VK_NV_CLUSTER_ACCELERATION_STRUCTURE_SPEC_VERSION = 4;

    public static final String VK_NV_CLUSTER_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_NV_cluster_acceleration_structure";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV         = 1000569000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV       = 1000569001,
        VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV      = 1000569002,
        VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV           = 1000569003,
        VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV               = 1000569004,
        VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV                       = 1000569005,
        VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV                    = 1000569006,
        VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV = 1000569007;

    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_CLUSTER_OPACITY_MICROMAPS_BIT_NV = 0x1000;

    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_CLUSTER_GEOMETRY_DISABLE_OPACITY_MICROMAP_NV = -5;

    public static final int
        VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_CLUSTERS_BOTTOM_LEVEL_NV     = 0,
        VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_TRIANGLE_CLUSTER_NV          = 1,
        VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_TRIANGLE_CLUSTER_TEMPLATE_NV = 2;

    public static final int
        VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_MOVE_OBJECTS_NV                    = 0,
        VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_CLUSTERS_BOTTOM_LEVEL_NV     = 1,
        VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_TRIANGLE_CLUSTER_NV          = 2,
        VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_TRIANGLE_CLUSTER_TEMPLATE_NV = 3,
        VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_INSTANTIATE_TRIANGLE_CLUSTER_NV    = 4,
        VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_GET_CLUSTER_TEMPLATE_INDICES_NV    = 5;

    public static final int
        VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_IMPLICIT_DESTINATIONS_NV = 0,
        VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_EXPLICIT_DESTINATIONS_NV = 1,
        VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_COMPUTE_SIZES_NV         = 2;

    public static final int
        VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_NONE_NV                             = 0,
        VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_DST_IMPLICIT_DATA_BIT_NV = 0x1,
        VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_SCRATCH_DATA_BIT_NV      = 0x2,
        VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_DST_ADDRESS_ARRAY_BIT_NV = 0x4,
        VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_DST_SIZES_ARRAY_BIT_NV   = 0x8,
        VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_SRC_INFOS_ARRAY_BIT_NV   = 0x10,
        VK_CLUSTER_ACCELERATION_STRUCTURE_ADDRESS_RESOLUTION_INDIRECTED_SRC_INFOS_COUNT_BIT_NV   = 0x20;

    public static final int VK_CLUSTER_ACCELERATION_STRUCTURE_CLUSTER_ALLOW_DISABLE_OPACITY_MICROMAPS_NV = 0x1;

    public static final int
        VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_CULL_DISABLE_BIT_NV                   = 0x1,
        VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_NO_DUPLICATE_ANYHIT_INVOCATION_BIT_NV = 0x2,
        VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_OPAQUE_BIT_NV                         = 0x4;

    public static final int
        VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_8BIT_NV  = 0x1,
        VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_16BIT_NV = 0x2,
        VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_32BIT_NV = 0x4;

    protected NVClusterAccelerationStructure() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetClusterAccelerationStructureBuildSizesNV ] ---

    /** {@code void vkGetClusterAccelerationStructureBuildSizesNV(VkDevice device, VkClusterAccelerationStructureInputInfoNV const * pInfo, VkAccelerationStructureBuildSizesInfoKHR * pSizeInfo)} */
    public static void nvkGetClusterAccelerationStructureBuildSizesNV(VkDevice device, long pInfo, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetClusterAccelerationStructureBuildSizesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pSizeInfo, __functionAddress);
    }

    /** {@code void vkGetClusterAccelerationStructureBuildSizesNV(VkDevice device, VkClusterAccelerationStructureInputInfoNV const * pInfo, VkAccelerationStructureBuildSizesInfoKHR * pSizeInfo)} */
    public static void vkGetClusterAccelerationStructureBuildSizesNV(VkDevice device, @NativeType("VkClusterAccelerationStructureInputInfoNV const *") VkClusterAccelerationStructureInputInfoNV pInfo, @NativeType("VkAccelerationStructureBuildSizesInfoKHR *") VkAccelerationStructureBuildSizesInfoKHR pSizeInfo) {
        nvkGetClusterAccelerationStructureBuildSizesNV(device, pInfo.address(), pSizeInfo.address());
    }

    // --- [ vkCmdBuildClusterAccelerationStructureIndirectNV ] ---

    /** {@code void vkCmdBuildClusterAccelerationStructureIndirectNV(VkCommandBuffer commandBuffer, VkClusterAccelerationStructureCommandsInfoNV const * pCommandInfos)} */
    public static void nvkCmdBuildClusterAccelerationStructureIndirectNV(VkCommandBuffer commandBuffer, long pCommandInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildClusterAccelerationStructureIndirectNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pCommandInfos, __functionAddress);
    }

    /** {@code void vkCmdBuildClusterAccelerationStructureIndirectNV(VkCommandBuffer commandBuffer, VkClusterAccelerationStructureCommandsInfoNV const * pCommandInfos)} */
    public static void vkCmdBuildClusterAccelerationStructureIndirectNV(VkCommandBuffer commandBuffer, @NativeType("VkClusterAccelerationStructureCommandsInfoNV const *") VkClusterAccelerationStructureCommandsInfoNV pCommandInfos) {
        nvkCmdBuildClusterAccelerationStructureIndirectNV(commandBuffer, pCommandInfos.address());
    }

}