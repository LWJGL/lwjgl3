/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_acceleration_structure = "KHRAccelerationStructure".nativeClassVK("KHR_acceleration_structure", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_ACCELERATION_STRUCTURE_SPEC_VERSION".."13"
    )

    StringConstant(
        "KHR_ACCELERATION_STRUCTURE_EXTENSION_NAME".."VK_KHR_acceleration_structure"
    )

    EnumConstant(
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR".."1000150000",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR".."1000150002",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR".."1000150003",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR".."1000150004",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR".."1000150005",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR".."1000150006",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR".."1000150007",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR".."1000150009",
        "STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR".."1000150010",
        "STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR".."1000150011",
        "STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR".."1000150012",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR".."1000150013",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR".."1000150014",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR".."1000150017",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR".."1000150020"
    )

    EnumConstant(
        "PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR".enum(0x02000000)
    )

    EnumConstant(
        "DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR".."1000150000"
    )

    EnumConstant(
        "ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR".enum(0x00200000),
        "ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR".enum(0x00400000)
    )

    EnumConstant(
        "QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR".."1000150000",
        "QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR".."1000150001"
    )

    EnumConstant(
        "OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR".."1000150000"
    )

    EnumConstant(
        "INDEX_TYPE_NONE_KHR".."1000165000"
    )

    EnumConstant(
        "FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR".enum(0x20000000)
    )

    EnumConstant(
        "BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR".enum(0x00080000),
        "BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR".enum(0x00100000)
    )

    EnumConstant(
        "COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR".."0",
        "COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR".."1",
        "COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR".."2",
        "COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR".."3"
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR".enum(0x20000000L)
    )

    EnumConstant(
        "DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR_EXT".."1000150000"
    )

    EnumConstant(
        "ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR".."0",
        "ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR".."1",
        "ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR".."2"
    )

    EnumConstant(
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR".enum(0x00000001),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR".enum(0x00000002),
        "BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR".enum(0x00000004),
        "BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR".enum(0x00000008),
        "BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        "BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR".."0",
        "BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR".."1"
    )

    EnumConstant(
        "GEOMETRY_TYPE_TRIANGLES_KHR".."0",
        "GEOMETRY_TYPE_AABBS_KHR".."1",
        "GEOMETRY_TYPE_INSTANCES_KHR".."2"
    )

    EnumConstant(
        "GEOMETRY_OPAQUE_BIT_KHR".enum(0x00000001),
        "GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        "ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR".."0",
        "ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR".."1",
        "ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR".."2"
    )

    EnumConstant(
        "GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR".enum(0x00000001),
        "GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR".enum(0x00000002),
        "GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR".enum(0x00000002),
        "GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR".enum(0x00000004),
        "GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR".enum(0x00000008)
    )

    EnumConstant(
        "ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        "ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR".."0",
        "ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR".."1"
    )

    VkResult(
        "CreateAccelerationStructureKHR",

        VkDevice("device"),
        VkAccelerationStructureCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkAccelerationStructureKHR.p("pAccelerationStructure")
    )

    void(
        "DestroyAccelerationStructureKHR",

        VkDevice("device"),
        VkAccelerationStructureKHR("accelerationStructure"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "CmdBuildAccelerationStructuresKHR",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pInfos", "ppBuildRangeInfos")..uint32_t("infoCount"),
        VkAccelerationStructureBuildGeometryInfoKHR.const.p("pInfos"),
        VkAccelerationStructureBuildRangeInfoKHR.const.p.const.p("ppBuildRangeInfos")
    )

    void(
        "CmdBuildAccelerationStructuresIndirectKHR",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pInfos", "pIndirectDeviceAddresses", "pIndirectStrides", "ppMaxPrimitiveCounts")..uint32_t("infoCount"),
        VkAccelerationStructureBuildGeometryInfoKHR.const.p("pInfos"),
        VkDeviceAddress.const.p("pIndirectDeviceAddresses"),
        uint32_t.const.p("pIndirectStrides"),
        uint32_t.const.p.const.p("ppMaxPrimitiveCounts")
    )

    VkResult(
        "BuildAccelerationStructuresKHR",

        VkDevice("device"),
        VkDeferredOperationKHR("deferredOperation"),
        AutoSize("pInfos", "ppBuildRangeInfos")..uint32_t("infoCount"),
        VkAccelerationStructureBuildGeometryInfoKHR.const.p("pInfos"),
        VkAccelerationStructureBuildRangeInfoKHR.const.p.const.p("ppBuildRangeInfos")
    )

    VkResult(
        "CopyAccelerationStructureKHR",

        VkDevice("device"),
        VkDeferredOperationKHR("deferredOperation"),
        VkCopyAccelerationStructureInfoKHR.const.p("pInfo")
    )

    VkResult(
        "CopyAccelerationStructureToMemoryKHR",

        VkDevice("device"),
        VkDeferredOperationKHR("deferredOperation"),
        VkCopyAccelerationStructureToMemoryInfoKHR.const.p("pInfo")
    )

    VkResult(
        "CopyMemoryToAccelerationStructureKHR",

        VkDevice("device"),
        VkDeferredOperationKHR("deferredOperation"),
        VkCopyMemoryToAccelerationStructureInfoKHR.const.p("pInfo")
    )

    VkResult(
        "WriteAccelerationStructuresPropertiesKHR",

        VkDevice("device"),
        AutoSize("pAccelerationStructures")..uint32_t("accelerationStructureCount"),
        VkAccelerationStructureKHR.const.p("pAccelerationStructures"),
        VkQueryType("queryType"),
        AutoSize("pData")..size_t("dataSize"),
        void.p("pData"),
        size_t("stride")
    )

    void(
        "CmdCopyAccelerationStructureKHR",

        VkCommandBuffer("commandBuffer"),
        VkCopyAccelerationStructureInfoKHR.const.p("pInfo")
    )

    void(
        "CmdCopyAccelerationStructureToMemoryKHR",

        VkCommandBuffer("commandBuffer"),
        VkCopyAccelerationStructureToMemoryInfoKHR.const.p("pInfo")
    )

    void(
        "CmdCopyMemoryToAccelerationStructureKHR",

        VkCommandBuffer("commandBuffer"),
        VkCopyMemoryToAccelerationStructureInfoKHR.const.p("pInfo")
    )

    VkDeviceAddress(
        "GetAccelerationStructureDeviceAddressKHR",

        VkDevice("device"),
        VkAccelerationStructureDeviceAddressInfoKHR.const.p("pInfo")
    )

    void(
        "CmdWriteAccelerationStructuresPropertiesKHR",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pAccelerationStructures")..uint32_t("accelerationStructureCount"),
        VkAccelerationStructureKHR.const.p("pAccelerationStructures"),
        VkQueryType("queryType"),
        VkQueryPool("queryPool"),
        uint32_t("firstQuery")
    )

    void(
        "GetDeviceAccelerationStructureCompatibilityKHR",

        VkDevice("device"),
        VkAccelerationStructureVersionInfoKHR.const.p("pVersionInfo"),
        Check(1)..VkAccelerationStructureCompatibilityKHR.p("pCompatibility")
    )

    void(
        "GetAccelerationStructureBuildSizesKHR",

        VkDevice("device"),
        VkAccelerationStructureBuildTypeKHR("buildType"),
        VkAccelerationStructureBuildGeometryInfoKHR.const.p("pBuildInfo"),
        Check("pBuildInfo.geometryCount()")..nullable..uint32_t.const.p("pMaxPrimitiveCounts"),
        VkAccelerationStructureBuildSizesInfoKHR.p("pSizeInfo")
    )
}