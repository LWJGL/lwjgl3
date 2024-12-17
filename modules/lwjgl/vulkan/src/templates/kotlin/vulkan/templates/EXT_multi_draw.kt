/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_multi_draw = "EXTMultiDraw".nativeClassVK("EXT_multi_draw", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_MULTI_DRAW_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_MULTI_DRAW_EXTENSION_NAME".."VK_EXT_multi_draw"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT".."1000392000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_PROPERTIES_EXT".."1000392001"
    )

    void(
        "CmdDrawMultiEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pVertexInfo")..uint32_t("drawCount"),
        nullable..VkMultiDrawInfoEXT.const.p("pVertexInfo"),
        uint32_t("instanceCount"),
        uint32_t("firstInstance"),
        uint32_t("stride")
    )

    void(
        "CmdDrawMultiIndexedEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pIndexInfo")..uint32_t("drawCount"),
        nullable..VkMultiDrawIndexedInfoEXT.const.p("pIndexInfo"),
        uint32_t("instanceCount"),
        uint32_t("firstInstance"),
        uint32_t("stride"),
        Unsafe..nullable..int32_t.const.p("pVertexOffset")
    )
}