/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_extended_dynamic_state2 = "EXTExtendedDynamicState2".nativeClassVK("EXT_extended_dynamic_state2", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_EXTENDED_DYNAMIC_STATE_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_EXTENDED_DYNAMIC_STATE_2_EXTENSION_NAME".."VK_EXT_extended_dynamic_state2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT".."1000377000"
    )

    EnumConstant(
        "DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT".."1000377000",
        "DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT".."1000377001",
        "DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT".."1000377002",
        "DYNAMIC_STATE_LOGIC_OP_EXT".."1000377003",
        "DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT".."1000377004"
    )

    void(
        "CmdSetPatchControlPointsEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("patchControlPoints")
    )

    void(
        "CmdSetRasterizerDiscardEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("rasterizerDiscardEnable")
    )

    void(
        "CmdSetDepthBiasEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthBiasEnable")
    )

    void(
        "CmdSetLogicOpEXT",

        VkCommandBuffer("commandBuffer"),
        VkLogicOp("logicOp")
    )

    void(
        "CmdSetPrimitiveRestartEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("primitiveRestartEnable")
    )
}