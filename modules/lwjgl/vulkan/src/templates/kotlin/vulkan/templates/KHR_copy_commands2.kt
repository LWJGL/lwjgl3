/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_copy_commands2 = "KHRCopyCommands2".nativeClassVK("KHR_copy_commands2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_COPY_COMMANDS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_COPY_COMMANDS_2_EXTENSION_NAME".."VK_KHR_copy_commands2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR".."1000337000",
        "STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR".."1000337001",
        "STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR".."1000337002",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR".."1000337003",
        "STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR".."1000337004",
        "STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR".."1000337005",
        "STRUCTURE_TYPE_BUFFER_COPY_2_KHR".."1000337006",
        "STRUCTURE_TYPE_IMAGE_COPY_2_KHR".."1000337007",
        "STRUCTURE_TYPE_IMAGE_BLIT_2_KHR".."1000337008",
        "STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR".."1000337009",
        "STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR".."1000337010"
    )

    void(
        "CmdCopyBuffer2KHR",

        VkCommandBuffer("commandBuffer"),
        VkCopyBufferInfo2.const.p("pCopyBufferInfo")
    )

    void(
        "CmdCopyImage2KHR",

        VkCommandBuffer("commandBuffer"),
        VkCopyImageInfo2.const.p("pCopyImageInfo")
    )

    void(
        "CmdCopyBufferToImage2KHR",

        VkCommandBuffer("commandBuffer"),
        VkCopyBufferToImageInfo2.const.p("pCopyBufferToImageInfo")
    )

    void(
        "CmdCopyImageToBuffer2KHR",

        VkCommandBuffer("commandBuffer"),
        VkCopyImageToBufferInfo2.const.p("pCopyImageToBufferInfo")
    )

    void(
        "CmdBlitImage2KHR",

        VkCommandBuffer("commandBuffer"),
        VkBlitImageInfo2.const.p("pBlitImageInfo")
    )

    void(
        "CmdResolveImage2KHR",

        VkCommandBuffer("commandBuffer"),
        VkResolveImageInfo2.const.p("pResolveImageInfo")
    )
}