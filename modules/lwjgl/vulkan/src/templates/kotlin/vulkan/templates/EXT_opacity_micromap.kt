/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_opacity_micromap = "EXTOpacityMicromap".nativeClassVK("EXT_opacity_micromap", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_OPACITY_MICROMAP_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_OPACITY_MICROMAP_EXTENSION_NAME".."VK_EXT_opacity_micromap"
    )

    EnumConstant(
        "STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT".."1000396000",
        "STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT".."1000396001",
        "STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT".."1000396002",
        "STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT".."1000396003",
        "STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT".."1000396004",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT".."1000396005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT".."1000396006",
        "STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT".."1000396007",
        "STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT".."1000396008",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT".."1000396009"
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT".enum(0x40000000L)
    )

    EnumConstantLong(
        "ACCESS_2_MICROMAP_READ_BIT_EXT".enum(0x100000000000L),
        "ACCESS_2_MICROMAP_WRITE_BIT_EXT".enum(0x200000000000L)
    )

    EnumConstant(
        "QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT".."1000396000",
        "QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT".."1000396001"
    )

    EnumConstant(
        "OBJECT_TYPE_MICROMAP_EXT".."1000396000"
    )

    EnumConstant(
        "BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT".enum(0x00800000),
        "BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT".enum(0x01000000)
    )

    EnumConstant(
        "PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT".enum(0x01000000)
    )

    EnumConstant(
        "GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_BIT_EXT".enum(0x00000010),
        "GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT".enum(0x00000010),
        "GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_BIT_EXT".enum(0x00000020),
        "GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT".enum(0x00000020)
    )

    EnumConstant(
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_BIT_EXT".enum(0x00000040),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT".enum(0x00000040),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_BIT_EXT".enum(0x00000080),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT".enum(0x00000080),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_BIT_EXT".enum(0x00000100),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT".enum(0x00000100)
    )

    EnumConstant(
        "MICROMAP_TYPE_OPACITY_MICROMAP_EXT".."0"
    )

    EnumConstant(
        "BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT".enum(0x00000001),
        "BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT".enum(0x00000002),
        "BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        "BUILD_MICROMAP_MODE_BUILD_EXT".."0"
    )

    EnumConstant(
        "MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        "COPY_MICROMAP_MODE_CLONE_EXT".."0",
        "COPY_MICROMAP_MODE_SERIALIZE_EXT".."1",
        "COPY_MICROMAP_MODE_DESERIALIZE_EXT".."2",
        "COPY_MICROMAP_MODE_COMPACT_EXT".."3"
    )

    EnumConstant(
        "OPACITY_MICROMAP_FORMAT_2_STATE_EXT".."1",
        "OPACITY_MICROMAP_FORMAT_4_STATE_EXT".."2"
    )

    EnumConstant(
        "OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT".."-1",
        "OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT".."-2",
        "OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT".."-3",
        "OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT".."-4"
    )

    VkResult(
        "CreateMicromapEXT",

        VkDevice("device"),
        VkMicromapCreateInfoEXT.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkMicromapEXT.p("pMicromap")
    )

    void(
        "DestroyMicromapEXT",

        VkDevice("device"),
        VkMicromapEXT("micromap"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "CmdBuildMicromapsEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pInfos")..uint32_t("infoCount"),
        VkMicromapBuildInfoEXT.const.p("pInfos")
    )

    VkResult(
        "BuildMicromapsEXT",

        VkDevice("device"),
        VkDeferredOperationKHR("deferredOperation"),
        AutoSize("pInfos")..uint32_t("infoCount"),
        VkMicromapBuildInfoEXT.const.p("pInfos")
    )

    VkResult(
        "CopyMicromapEXT",

        VkDevice("device"),
        VkDeferredOperationKHR("deferredOperation"),
        VkCopyMicromapInfoEXT.const.p("pInfo")
    )

    VkResult(
        "CopyMicromapToMemoryEXT",

        VkDevice("device"),
        VkDeferredOperationKHR("deferredOperation"),
        VkCopyMicromapToMemoryInfoEXT.const.p("pInfo")
    )

    VkResult(
        "CopyMemoryToMicromapEXT",

        VkDevice("device"),
        VkDeferredOperationKHR("deferredOperation"),
        VkCopyMemoryToMicromapInfoEXT.const.p("pInfo")
    )

    VkResult(
        "WriteMicromapsPropertiesEXT",

        VkDevice("device"),
        AutoSize("pMicromaps")..uint32_t("micromapCount"),
        VkMicromapEXT.const.p("pMicromaps"),
        VkQueryType("queryType"),
        AutoSize("pData")..size_t("dataSize"),
        void.p("pData"),
        size_t("stride")
    )

    void(
        "CmdCopyMicromapEXT",

        VkCommandBuffer("commandBuffer"),
        VkCopyMicromapInfoEXT.const.p("pInfo")
    )

    void(
        "CmdCopyMicromapToMemoryEXT",

        VkCommandBuffer("commandBuffer"),
        VkCopyMicromapToMemoryInfoEXT.const.p("pInfo")
    )

    void(
        "CmdCopyMemoryToMicromapEXT",

        VkCommandBuffer("commandBuffer"),
        VkCopyMemoryToMicromapInfoEXT.const.p("pInfo")
    )

    void(
        "CmdWriteMicromapsPropertiesEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pMicromaps")..uint32_t("micromapCount"),
        VkMicromapEXT.const.p("pMicromaps"),
        VkQueryType("queryType"),
        VkQueryPool("queryPool"),
        uint32_t("firstQuery")
    )

    void(
        "GetDeviceMicromapCompatibilityEXT",

        VkDevice("device"),
        VkMicromapVersionInfoEXT.const.p("pVersionInfo"),
        Check(1)..VkAccelerationStructureCompatibilityKHR.p("pCompatibility")
    )

    void(
        "GetMicromapBuildSizesEXT",

        VkDevice("device"),
        VkAccelerationStructureBuildTypeKHR("buildType"),
        VkMicromapBuildInfoEXT.const.p("pBuildInfo"),
        VkMicromapBuildSizesInfoEXT.p("pSizeInfo")
    )
}