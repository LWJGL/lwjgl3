/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_scissor_exclusive = "NVScissorExclusive".nativeClassVK("NV_scissor_exclusive", type = "device", postfix = "NV") {
    IntConstant(
        "NV_SCISSOR_EXCLUSIVE_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME".."VK_NV_scissor_exclusive"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV".."1000205000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV".."1000205002"
    )

    EnumConstant(
        "DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV".."1000205000",
        "DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV".."1000205001"
    )

    void(
        "CmdSetExclusiveScissorEnableNV",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstExclusiveScissor"),
        AutoSize("pExclusiveScissorEnables")..uint32_t("exclusiveScissorCount"),
        VkBool32.const.p("pExclusiveScissorEnables")
    )

    void(
        "CmdSetExclusiveScissorNV",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstExclusiveScissor"),
        AutoSize("pExclusiveScissors")..uint32_t("exclusiveScissorCount"),
        VkRect2D.const.p("pExclusiveScissors")
    )
}