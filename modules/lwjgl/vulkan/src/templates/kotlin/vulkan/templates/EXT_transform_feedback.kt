/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_transform_feedback = "EXTTransformFeedback".nativeClassVK("EXT_transform_feedback", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_TRANSFORM_FEEDBACK_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME".."VK_EXT_transform_feedback"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT".."1000028000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT".."1000028001",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT".."1000028002"
    )

    EnumConstant(
        "QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT".."1000028004"
    )

    EnumConstant(
        "BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT".enum(0x00000800),
        "BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT".enum(0x00001000)
    )

    EnumConstant(
        "ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT".enum(0x02000000),
        "ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT".enum(0x04000000),
        "ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT".enum(0x08000000)
    )

    EnumConstant(
        "PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT".enum(0x01000000)
    )

    void(
        "CmdBindTransformFeedbackBuffersEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstBinding"),
        AutoSize("pBuffers", "pOffsets", "pSizes")..uint32_t("bindingCount"),
        VkBuffer.const.p("pBuffers"),
        VkDeviceSize.const.p("pOffsets"),
        nullable..VkDeviceSize.const.p("pSizes")
    )

    void(
        "CmdBeginTransformFeedbackEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstCounterBuffer"),
        AutoSize("pCounterBuffers", "pCounterBufferOffsets")..uint32_t("counterBufferCount"),
        nullable..VkBuffer.const.p("pCounterBuffers"),
        nullable..VkDeviceSize.const.p("pCounterBufferOffsets")
    )

    void(
        "CmdEndTransformFeedbackEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstCounterBuffer"),
        AutoSize("pCounterBuffers", "pCounterBufferOffsets")..uint32_t("counterBufferCount"),
        nullable..VkBuffer.const.p("pCounterBuffers"),
        nullable..VkDeviceSize.const.p("pCounterBufferOffsets")
    )

    void(
        "CmdBeginQueryIndexedEXT",

        VkCommandBuffer("commandBuffer"),
        VkQueryPool("queryPool"),
        uint32_t("query"),
        VkQueryControlFlags("flags"),
        uint32_t("index")
    )

    void(
        "CmdEndQueryIndexedEXT",

        VkCommandBuffer("commandBuffer"),
        VkQueryPool("queryPool"),
        uint32_t("query"),
        uint32_t("index")
    )

    void(
        "CmdDrawIndirectByteCountEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("instanceCount"),
        uint32_t("firstInstance"),
        VkBuffer("counterBuffer"),
        VkDeviceSize("counterBufferOffset"),
        uint32_t("counterOffset"),
        uint32_t("vertexStride")
    )
}