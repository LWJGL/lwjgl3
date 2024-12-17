/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_draw_indirect_count = "AMDDrawIndirectCount".nativeClassVK("AMD_draw_indirect_count", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION".."2"
    )

    StringConstant(
        "AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME".."VK_AMD_draw_indirect_count"
    )

    void(
        "CmdDrawIndirectCountAMD",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        VkBuffer("countBuffer"),
        VkDeviceSize("countBufferOffset"),
        uint32_t("maxDrawCount"),
        uint32_t("stride")
    )

    void(
        "CmdDrawIndexedIndirectCountAMD",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        VkBuffer("countBuffer"),
        VkDeviceSize("countBufferOffset"),
        uint32_t("maxDrawCount"),
        uint32_t("stride")
    )
}