/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_tile_properties = "QCOMTileProperties".nativeClassVK("QCOM_tile_properties", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_TILE_PROPERTIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_TILE_PROPERTIES_EXTENSION_NAME".."VK_QCOM_tile_properties"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM".."1000484000",
        "STRUCTURE_TYPE_TILE_PROPERTIES_QCOM".."1000484001"
    )

    VkResult(
        "GetFramebufferTilePropertiesQCOM",

        VkDevice("device"),
        VkFramebuffer("framebuffer"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertiesCount"),
        nullable..VkTilePropertiesQCOM.p("pProperties")
    )

    VkResult(
        "GetDynamicRenderingTilePropertiesQCOM",

        VkDevice("device"),
        VkRenderingInfo.const.p("pRenderingInfo"),
        VkTilePropertiesQCOM.p("pProperties")
    )
}