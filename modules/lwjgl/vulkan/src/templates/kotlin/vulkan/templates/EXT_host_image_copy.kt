/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_host_image_copy = "EXTHostImageCopy".nativeClassVK("EXT_host_image_copy", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_HOST_IMAGE_COPY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_HOST_IMAGE_COPY_EXTENSION_NAME".."VK_EXT_host_image_copy"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT".."1000270000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT".."1000270001",
        "STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT".."1000270002",
        "STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT".."1000270003",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT".."1000270004",
        "STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT".."1000270005",
        "STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT".."1000270006",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT".."1000270007",
        "STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT".."1000270008",
        "STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT".."1000270009"
    )

    EnumConstant(
        "IMAGE_USAGE_HOST_TRANSFER_BIT_EXT".enum(0x00400000)
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT".enum(0x400000000000L)
    )

    EnumConstant(
        "HOST_IMAGE_COPY_MEMCPY_BIT_EXT".enum(0x00000001),
        "HOST_IMAGE_COPY_MEMCPY_EXT".enum(0x00000001)
    )

    VkResult(
        "CopyMemoryToImageEXT",

        VkDevice("device"),
        VkCopyMemoryToImageInfo.const.p("pCopyMemoryToImageInfo")
    )

    VkResult(
        "CopyImageToMemoryEXT",

        VkDevice("device"),
        VkCopyImageToMemoryInfo.const.p("pCopyImageToMemoryInfo")
    )

    VkResult(
        "CopyImageToImageEXT",

        VkDevice("device"),
        VkCopyImageToImageInfo.const.p("pCopyImageToImageInfo")
    )

    VkResult(
        "TransitionImageLayoutEXT",

        VkDevice("device"),
        AutoSize("pTransitions")..uint32_t("transitionCount"),
        VkHostImageLayoutTransitionInfo.const.p("pTransitions")
    )

    void(
        "GetImageSubresourceLayout2EXT",

        VkDevice("device"),
        VkImage("image"),
        VkImageSubresource2.const.p("pSubresource"),
        VkSubresourceLayout2.p("pLayout")
    )
}