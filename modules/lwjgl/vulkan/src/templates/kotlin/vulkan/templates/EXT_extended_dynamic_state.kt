/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_extended_dynamic_state = "EXTExtendedDynamicState".nativeClassVK("EXT_extended_dynamic_state", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_EXTENDED_DYNAMIC_STATE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_EXTENDED_DYNAMIC_STATE_EXTENSION_NAME".."VK_EXT_extended_dynamic_state"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT".."1000267000"
    )

    EnumConstant(
        "DYNAMIC_STATE_CULL_MODE_EXT".."1000267000",
        "DYNAMIC_STATE_FRONT_FACE_EXT".."1000267001",
        "DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT".."1000267002",
        "DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT".."1000267003",
        "DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT".."1000267004",
        "DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT".."1000267005",
        "DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT".."1000267006",
        "DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT".."1000267007",
        "DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT".."1000267008",
        "DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT".."1000267009",
        "DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT".."1000267010",
        "DYNAMIC_STATE_STENCIL_OP_EXT".."1000267011"
    )

    void(
        "CmdSetCullModeEXT",

        VkCommandBuffer("commandBuffer"),
        VkCullModeFlags("cullMode")
    )

    void(
        "CmdSetFrontFaceEXT",

        VkCommandBuffer("commandBuffer"),
        VkFrontFace("frontFace")
    )

    void(
        "CmdSetPrimitiveTopologyEXT",

        VkCommandBuffer("commandBuffer"),
        VkPrimitiveTopology("primitiveTopology")
    )

    void(
        "CmdSetViewportWithCountEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pViewports")..uint32_t("viewportCount"),
        VkViewport.const.p("pViewports")
    )

    void(
        "CmdSetScissorWithCountEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pScissors")..uint32_t("scissorCount"),
        VkRect2D.const.p("pScissors")
    )

    void(
        "CmdBindVertexBuffers2EXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstBinding"),
        AutoSize("pBuffers", "pOffsets", "pSizes", "pStrides")..uint32_t("bindingCount"),
        VkBuffer.const.p("pBuffers"),
        VkDeviceSize.const.p("pOffsets"),
        nullable..VkDeviceSize.const.p("pSizes"),
        nullable..VkDeviceSize.const.p("pStrides")
    )

    void(
        "CmdSetDepthTestEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthTestEnable")
    )

    void(
        "CmdSetDepthWriteEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthWriteEnable")
    )

    void(
        "CmdSetDepthCompareOpEXT",

        VkCommandBuffer("commandBuffer"),
        VkCompareOp("depthCompareOp")
    )

    void(
        "CmdSetDepthBoundsTestEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthBoundsTestEnable")
    )

    void(
        "CmdSetStencilTestEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("stencilTestEnable")
    )

    void(
        "CmdSetStencilOpEXT",

        VkCommandBuffer("commandBuffer"),
        VkStencilFaceFlags("faceMask"),
        VkStencilOp("failOp"),
        VkStencilOp("passOp"),
        VkStencilOp("depthFailOp"),
        VkCompareOp("compareOp")
    )
}