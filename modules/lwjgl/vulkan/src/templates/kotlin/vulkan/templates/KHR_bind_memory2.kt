/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_bind_memory2 = "KHRBindMemory2".nativeClassVK("KHR_bind_memory2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_BIND_MEMORY_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_BIND_MEMORY_2_EXTENSION_NAME".."VK_KHR_bind_memory2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR".."1000157000",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR".."1000157001"
    )

    EnumConstant(
        "IMAGE_CREATE_ALIAS_BIT_KHR".enum(0x00000400)
    )

    VkResult(
        "BindBufferMemory2KHR",

        VkDevice("device"),
        AutoSize("pBindInfos")..uint32_t("bindInfoCount"),
        VkBindBufferMemoryInfo.const.p("pBindInfos")
    )

    VkResult(
        "BindImageMemory2KHR",

        VkDevice("device"),
        AutoSize("pBindInfos")..uint32_t("bindInfoCount"),
        VkBindImageMemoryInfo.const.p("pBindInfos")
    )
}