/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_encode_queue = "KHRVideoEncodeQueue".nativeClassVK("KHR_video_encode_queue", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VIDEO_ENCODE_QUEUE_SPEC_VERSION".."12"
    )

    StringConstant(
        "KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME".."VK_KHR_video_encode_queue"
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR".enum(0x08000000L)
    )

    EnumConstantLong(
        "ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR".enum(0x2000000000L),
        "ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR".enum(0x4000000000L)
    )

    EnumConstant(
        "STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR".."1000299000",
        "STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR".."1000299001",
        "STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR".."1000299002",
        "STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR".."1000299003",
        "STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR".."1000299004",
        "STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR".."1000299005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR".."1000299006",
        "STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR".."1000299007",
        "STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR".."1000299008",
        "STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR".."1000299009",
        "STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR".."1000299010"
    )

    EnumConstant(
        "QUEUE_VIDEO_ENCODE_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        "VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR".enum(0x00000002),
        "VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR".enum(0x00008000),
        "BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR".enum(0x00010000)
    )

    EnumConstant(
        "IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR".enum(0x00002000),
        "IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR".enum(0x00004000),
        "IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR".enum(0x00008000)
    )

    EnumConstant(
        "FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR".enum(0x08000000),
        "FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR".enum(0x10000000)
    )

    EnumConstant(
        "VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        "IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR".."1000299000",
        "IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR".."1000299001",
        "IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR".."1000299002"
    )

    EnumConstant(
        "QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR".."1000299000"
    )

    EnumConstant(
        "QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR".."-1000299000"
    )

    EnumConstant(
        "ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR".."-1000299000"
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR".enum(0x08000000L),
        "FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR".enum(0x10000000L)
    )

    EnumConstant(
        "VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        "VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR".."0",
        "VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "VIDEO_ENCODE_USAGE_DEFAULT_KHR".."0",
        "VIDEO_ENCODE_USAGE_TRANSCODING_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_USAGE_STREAMING_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_USAGE_RECORDING_BIT_KHR".enum(0x00000004),
        "VIDEO_ENCODE_USAGE_CONFERENCING_BIT_KHR".enum(0x00000008)
    )

    EnumConstant(
        "VIDEO_ENCODE_CONTENT_DEFAULT_KHR".."0",
        "VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR".."0",
        "VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR".."1",
        "VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR".."2",
        "VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR".."3",
        "VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR".."4"
    )

    VkResult(
        "GetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.const.p("pQualityLevelInfo"),
        VkVideoEncodeQualityLevelPropertiesKHR.p("pQualityLevelProperties")
    )

    VkResult(
        "GetEncodedVideoSessionParametersKHR",

        VkDevice("device"),
        VkVideoEncodeSessionParametersGetInfoKHR.const.p("pVideoSessionParametersInfo"),
        nullable..VkVideoEncodeSessionParametersFeedbackInfoKHR.p("pFeedbackInfo"),
        AutoSize("pData")..Check(1)..size_t.p("pDataSize"),
        nullable..void.p("pData")
    )

    void(
        "CmdEncodeVideoKHR",

        VkCommandBuffer("commandBuffer"),
        VkVideoEncodeInfoKHR.const.p("pEncodeInfo")
    )
}