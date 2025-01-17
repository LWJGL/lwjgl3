/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_queue = "KHRVideoQueue".nativeClassVK("KHR_video_queue", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VIDEO_QUEUE_SPEC_VERSION".."8"
    )

    StringConstant(
        "KHR_VIDEO_QUEUE_EXTENSION_NAME".."VK_KHR_video_queue"
    )

    EnumConstant(
        "STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR".."1000023000",
        "STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR".."1000023001",
        "STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR".."1000023002",
        "STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR".."1000023003",
        "STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR".."1000023004",
        "STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR".."1000023005",
        "STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR".."1000023006",
        "STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR".."1000023007",
        "STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR".."1000023008",
        "STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR".."1000023009",
        "STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR".."1000023010",
        "STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR".."1000023011",
        "STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR".."1000023012",
        "STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR".."1000023013",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR".."1000023014",
        "STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR".."1000023015",
        "STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR".."1000023016"
    )

    EnumConstant(
        "OBJECT_TYPE_VIDEO_SESSION_KHR".."1000023000",
        "OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR".."1000023001"
    )

    EnumConstant(
        "QUERY_TYPE_RESULT_STATUS_ONLY_KHR".."1000023000"
    )

    EnumConstant(
        "QUERY_RESULT_WITH_STATUS_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        "ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR".."-1000023000",
        "ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR".."-1000023001",
        "ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR".."-1000023002",
        "ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR".."-1000023003",
        "ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR".."-1000023004",
        "ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR".."-1000023005"
    )

    EnumConstant(
        "VIDEO_CODEC_OPERATION_NONE_KHR".."0"
    )

    EnumConstant(
        "VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR".."0",
        "VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR".enum(0x00000001),
        "VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR".enum(0x00000002),
        "VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR".enum(0x00000004),
        "VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR".enum(0x00000008)
    )

    EnumConstant(
        "VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR".."0",
        "VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR".enum(0x00000001),
        "VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR".enum(0x00000004),
        "VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        "VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR".enum(0x00000001),
        "VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        "VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        "VIDEO_CODING_CONTROL_RESET_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        "QUERY_RESULT_STATUS_NOT_READY_KHR".."0",
        "QUERY_RESULT_STATUS_COMPLETE_KHR".."1",
        "QUERY_RESULT_STATUS_ERROR_KHR".."-1"
    )

    VkResult(
        "GetPhysicalDeviceVideoCapabilitiesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkVideoProfileInfoKHR.const.p("pVideoProfile"),
        VkVideoCapabilitiesKHR.p("pCapabilities")
    )

    VkResult(
        "GetPhysicalDeviceVideoFormatPropertiesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceVideoFormatInfoKHR.const.p("pVideoFormatInfo"),
        AutoSize("pVideoFormatProperties")..Check(1)..uint32_t.p("pVideoFormatPropertyCount"),
        nullable..VkVideoFormatPropertiesKHR.p("pVideoFormatProperties")
    )

    VkResult(
        "CreateVideoSessionKHR",

        VkDevice("device"),
        VkVideoSessionCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkVideoSessionKHR.p("pVideoSession")
    )

    void(
        "DestroyVideoSessionKHR",

        VkDevice("device"),
        VkVideoSessionKHR("videoSession"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "GetVideoSessionMemoryRequirementsKHR",

        VkDevice("device"),
        VkVideoSessionKHR("videoSession"),
        AutoSize("pMemoryRequirements")..Check(1)..uint32_t.p("pMemoryRequirementsCount"),
        nullable..VkVideoSessionMemoryRequirementsKHR.p("pMemoryRequirements")
    )

    VkResult(
        "BindVideoSessionMemoryKHR",

        VkDevice("device"),
        VkVideoSessionKHR("videoSession"),
        AutoSize("pBindSessionMemoryInfos")..uint32_t("bindSessionMemoryInfoCount"),
        VkBindVideoSessionMemoryInfoKHR.const.p("pBindSessionMemoryInfos")
    )

    VkResult(
        "CreateVideoSessionParametersKHR",

        VkDevice("device"),
        VkVideoSessionParametersCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkVideoSessionParametersKHR.p("pVideoSessionParameters")
    )

    VkResult(
        "UpdateVideoSessionParametersKHR",

        VkDevice("device"),
        VkVideoSessionParametersKHR("videoSessionParameters"),
        VkVideoSessionParametersUpdateInfoKHR.const.p("pUpdateInfo")
    )

    void(
        "DestroyVideoSessionParametersKHR",

        VkDevice("device"),
        VkVideoSessionParametersKHR("videoSessionParameters"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "CmdBeginVideoCodingKHR",

        VkCommandBuffer("commandBuffer"),
        VkVideoBeginCodingInfoKHR.const.p("pBeginInfo")
    )

    void(
        "CmdEndVideoCodingKHR",

        VkCommandBuffer("commandBuffer"),
        VkVideoEndCodingInfoKHR.const.p("pEndCodingInfo")
    )

    void(
        "CmdControlVideoCodingKHR",

        VkCommandBuffer("commandBuffer"),
        VkVideoCodingControlInfoKHR.const.p("pCodingControlInfo")
    )
}