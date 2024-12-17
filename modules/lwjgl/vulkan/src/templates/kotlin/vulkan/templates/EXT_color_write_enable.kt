/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_color_write_enable = "EXTColorWriteEnable".nativeClassVK("EXT_color_write_enable", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_COLOR_WRITE_ENABLE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_COLOR_WRITE_ENABLE_EXTENSION_NAME".."VK_EXT_color_write_enable"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT".."1000381000",
        "STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT".."1000381001"
    )

    EnumConstant(
        "DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT".."1000381000"
    )

    void(
        "CmdSetColorWriteEnableEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pColorWriteEnables")..uint32_t("attachmentCount"),
        VkBool32.const.p("pColorWriteEnables")
    )
}