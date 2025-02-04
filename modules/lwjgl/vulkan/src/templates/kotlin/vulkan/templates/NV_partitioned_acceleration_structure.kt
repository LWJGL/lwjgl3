/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_partitioned_acceleration_structure = "NVPartitionedAccelerationStructure".nativeClassVK("NV_partitioned_acceleration_structure", type = "device", postfix = "NV") {
    IntConstant(
        "NV_PARTITIONED_ACCELERATION_STRUCTURE_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_PARTITIONED_ACCELERATION_STRUCTURE_EXTENSION_NAME".."VK_NV_partitioned_acceleration_structure"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV".."1000570000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV".."1000570001",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV".."1000570002",
        "STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV".."1000570003",
        "STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV".."1000570004",
        "STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV".."1000570005"
    )

    EnumConstant(
        "DESCRIPTOR_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_NV".."1000570000"
    )

    EnumConstant(
        "PARTITIONED_ACCELERATION_STRUCTURE_PARTITION_INDEX_GLOBAL_NV".."(~0)"
    )

    EnumConstant(
        "PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_INSTANCE_NV".."0",
        "PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_UPDATE_INSTANCE_NV".."1",
        "PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_PARTITION_TRANSLATION_NV".."2"
    )

    EnumConstant(
        "PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_TRIANGLE_FACING_CULL_DISABLE_BIT_NV".enum(0x00000001),
        "PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_TRIANGLE_FLIP_FACING_BIT_NV".enum(0x00000002),
        "PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_FORCE_OPAQUE_BIT_NV".enum(0x00000004),
        "PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_FORCE_NO_OPAQUE_BIT_NV".enum(0x00000008),
        "PARTITIONED_ACCELERATION_STRUCTURE_INSTANCE_FLAG_ENABLE_EXPLICIT_BOUNDING_BOX_NV".enum(0x00000010)
    )

    void(
        "GetPartitionedAccelerationStructuresBuildSizesNV",

        VkDevice("device"),
        VkPartitionedAccelerationStructureInstancesInputNV.const.p("pInfo"),
        VkAccelerationStructureBuildSizesInfoKHR.p("pSizeInfo")
    )

    void(
        "CmdBuildPartitionedAccelerationStructuresNV",

        VkCommandBuffer("commandBuffer"),
        VkBuildPartitionedAccelerationStructureInfoNV.const.p("pBuildInfo")
    )
}