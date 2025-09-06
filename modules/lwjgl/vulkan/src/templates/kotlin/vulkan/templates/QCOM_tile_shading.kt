/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_tile_shading = "QCOMTileShading".nativeClassVK("QCOM_tile_shading", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_TILE_SHADING_SPEC_VERSION".."2"
    )

    StringConstant(
        "QCOM_TILE_SHADING_EXTENSION_NAME".."VK_QCOM_tile_shading"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM".."1000309000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM".."1000309001",
        "STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM".."1000309002",
        "STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM".."1000309003",
        "STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM".."1000309004",
        "STRUCTURE_TYPE_DISPATCH_TILE_INFO_QCOM".."1000309005"
    )

    EnumConstantLong(
        "ACCESS_2_SHADER_TILE_ATTACHMENT_READ_BIT_QCOM".enum(0x8000000000000L),
        "ACCESS_2_SHADER_TILE_ATTACHMENT_WRITE_BIT_QCOM".enum(0x10000000000000L)
    )

    EnumConstant(
        "SUBPASS_DESCRIPTION_TILE_SHADING_APRON_BIT_QCOM".enum(0x00000100)
    )

    EnumConstant(
        "TILE_SHADING_RENDER_PASS_ENABLE_BIT_QCOM".enum(0x00000001),
        "TILE_SHADING_RENDER_PASS_PER_TILE_EXECUTION_BIT_QCOM".enum(0x00000002)
    )

    void(
        "CmdDispatchTileQCOM",

        VkCommandBuffer("commandBuffer"),
        VkDispatchTileInfoQCOM.const.p("pDispatchTileInfo")
    )

    void(
        "CmdBeginPerTileExecutionQCOM",

        VkCommandBuffer("commandBuffer"),
        VkPerTileBeginInfoQCOM.const.p("pPerTileBeginInfo")
    )

    void(
        "CmdEndPerTileExecutionQCOM",

        VkCommandBuffer("commandBuffer"),
        VkPerTileEndInfoQCOM.const.p("pPerTileEndInfo")
    )
}