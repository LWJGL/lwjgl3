/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_optical_flow = "NVOpticalFlow".nativeClassVK("NV_optical_flow", type = "device", postfix = "NV") {
    IntConstant(
        "NV_OPTICAL_FLOW_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_OPTICAL_FLOW_EXTENSION_NAME".."VK_NV_optical_flow"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV".."1000464000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV".."1000464001",
        "STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV".."1000464002",
        "STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV".."1000464003",
        "STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV".."1000464004",
        "STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV".."1000464005",
        "STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV".."1000464010"
    )

    EnumConstant(
        "FORMAT_R16G16_SFIXED5_NV".."1000464000",
        "FORMAT_R16G16_S10_5_NV".."1000464000"
    )

    EnumConstant(
        "OBJECT_TYPE_OPTICAL_FLOW_SESSION_NV".."1000464000"
    )

    EnumConstant(
        "QUEUE_OPTICAL_FLOW_BIT_NV".enum(0x00000100)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV".enum(0x20000000L)
    )

    EnumConstantLong(
        "ACCESS_2_OPTICAL_FLOW_READ_BIT_NV".enum(0x40000000000L),
        "ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV".enum(0x80000000000L)
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV".enum(0x10000000000L),
        "FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV".enum(0x20000000000L),
        "FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV".enum(0x40000000000L)
    )

    EnumConstant(
        "OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV".."0",
        "OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV".enum(0x00000001),
        "OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV".enum(0x00000002),
        "OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV".enum(0x00000004),
        "OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV".enum(0x00000008)
    )

    EnumConstant(
        "OPTICAL_FLOW_USAGE_UNKNOWN_NV".."0",
        "OPTICAL_FLOW_USAGE_INPUT_BIT_NV".enum(0x00000001),
        "OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV".enum(0x00000002),
        "OPTICAL_FLOW_USAGE_HINT_BIT_NV".enum(0x00000004),
        "OPTICAL_FLOW_USAGE_COST_BIT_NV".enum(0x00000008),
        "OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV".enum(0x00000010)
    )

    EnumConstant(
        "OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV".."0",
        "OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV".."1",
        "OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV".."2",
        "OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV".."3"
    )

    EnumConstant(
        "OPTICAL_FLOW_SESSION_BINDING_POINT_UNKNOWN_NV".."0",
        "OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV".."1",
        "OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV".."2",
        "OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV".."3",
        "OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV".."4",
        "OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_FLOW_VECTOR_NV".."5",
        "OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV".."6",
        "OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV".."7",
        "OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV".."8"
    )

    EnumConstant(
        "OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV".enum(0x00000001),
        "OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV".enum(0x00000002),
        "OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV".enum(0x00000004),
        "OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV".enum(0x00000008),
        "OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV".enum(0x00000010)
    )

    EnumConstant(
        "OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV".enum(0x00000001)
    )

    VkResult(
        "GetPhysicalDeviceOpticalFlowImageFormatsNV",

        VkPhysicalDevice("physicalDevice"),
        VkOpticalFlowImageFormatInfoNV.const.p("pOpticalFlowImageFormatInfo"),
        AutoSize("pImageFormatProperties")..Check(1)..uint32_t.p("pFormatCount"),
        nullable..VkOpticalFlowImageFormatPropertiesNV.p("pImageFormatProperties")
    )

    VkResult(
        "CreateOpticalFlowSessionNV",

        VkDevice("device"),
        VkOpticalFlowSessionCreateInfoNV.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkOpticalFlowSessionNV.p("pSession")
    )

    void(
        "DestroyOpticalFlowSessionNV",

        VkDevice("device"),
        VkOpticalFlowSessionNV("session"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "BindOpticalFlowSessionImageNV",

        VkDevice("device"),
        VkOpticalFlowSessionNV("session"),
        VkOpticalFlowSessionBindingPointNV("bindingPoint"),
        VkImageView("view"),
        VkImageLayout("layout")
    )

    void(
        "CmdOpticalFlowExecuteNV",

        VkCommandBuffer("commandBuffer"),
        VkOpticalFlowSessionNV("session"),
        VkOpticalFlowExecuteInfoNV.const.p("pExecuteInfo")
    )
}