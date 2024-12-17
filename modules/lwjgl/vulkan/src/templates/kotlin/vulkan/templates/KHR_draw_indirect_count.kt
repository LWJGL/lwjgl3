/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_draw_indirect_count = "KHRDrawIndirectCount".nativeClassVK("KHR_draw_indirect_count", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DRAW_INDIRECT_COUNT_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME".."VK_KHR_draw_indirect_count"
    )

    void(
        "CmdDrawIndirectCountKHR",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        VkBuffer("countBuffer"),
        VkDeviceSize("countBufferOffset"),
        uint32_t("maxDrawCount"),
        uint32_t("stride")
    )

    void(
        "CmdDrawIndexedIndirectCountKHR",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        VkBuffer("countBuffer"),
        VkDeviceSize("countBufferOffset"),
        uint32_t("maxDrawCount"),
        uint32_t("stride")
    )
}