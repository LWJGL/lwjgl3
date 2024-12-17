/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_decode_queue = "KHRVideoDecodeQueue".nativeClassVK("KHR_video_decode_queue", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VIDEO_DECODE_QUEUE_SPEC_VERSION".."8"
    )

    StringConstant(
        "KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME".."VK_KHR_video_decode_queue"
    )

    EnumConstant(
        "STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR".."1000024000",
        "STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR".."1000024001",
        "STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR".."1000024002"
    )

    EnumConstant(
        "QUEUE_VIDEO_DECODE_BIT_KHR".enum(0x00000020)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR".enum(0x04000000L)
    )

    EnumConstantLong(
        "ACCESS_2_VIDEO_DECODE_READ_BIT_KHR".enum(0x800000000L),
        "ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR".enum(0x1000000000L)
    )

    EnumConstant(
        "BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR".enum(0x00002000),
        "BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR".enum(0x00004000)
    )

    EnumConstant(
        "IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR".enum(0x00000400),
        "IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR".enum(0x00000800),
        "IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR".enum(0x00001000)
    )

    EnumConstant(
        "FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR".enum(0x02000000),
        "FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR".enum(0x04000000)
    )

    EnumConstant(
        "IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR".."1000024000",
        "IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR".."1000024001",
        "IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR".."1000024002"
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR".enum(0x02000000L),
        "FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR".enum(0x04000000L)
    )

    EnumConstant(
        "VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR".enum(0x00000001),
        "VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        "VIDEO_DECODE_USAGE_DEFAULT_KHR".."0",
        "VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR".enum(0x00000001),
        "VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR".enum(0x00000002),
        "VIDEO_DECODE_USAGE_STREAMING_BIT_KHR".enum(0x00000004)
    )

    void(
        "CmdDecodeVideoKHR",

        VkCommandBuffer("commandBuffer"),
        VkVideoDecodeInfoKHR.const.p("pDecodeInfo")
    )
}