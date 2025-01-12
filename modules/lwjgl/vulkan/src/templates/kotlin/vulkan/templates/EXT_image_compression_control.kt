/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_image_compression_control = "EXTImageCompressionControl".nativeClassVK("EXT_image_compression_control", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_IMAGE_COMPRESSION_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_IMAGE_COMPRESSION_CONTROL_EXTENSION_NAME".."VK_EXT_image_compression_control"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT".."1000338000",
        "STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT".."1000338001",
        "STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT".."1000338002",
        "STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_EXT".."1000338003",
        "STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT".."1000338004"
    )

    EnumConstant(
        "ERROR_COMPRESSION_EXHAUSTED_EXT".."-1000338000"
    )

    EnumConstant(
        "IMAGE_COMPRESSION_DEFAULT_EXT".."0",
        "IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT".enum(0x00000001),
        "IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT".enum(0x00000002),
        "IMAGE_COMPRESSION_DISABLED_EXT".enum(0x00000004)
    )

    EnumConstant(
        "IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT".."0",
        "IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT".enum(0x00000001),
        "IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT".enum(0x00000002),
        "IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT".enum(0x00000004),
        "IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT".enum(0x00000008),
        "IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT".enum(0x00000010),
        "IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT".enum(0x00000020),
        "IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT".enum(0x00000040),
        "IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT".enum(0x00000080),
        "IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT".enum(0x00000100),
        "IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT".enum(0x00000200),
        "IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT".enum(0x00000400),
        "IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT".enum(0x00000800),
        "IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT".enum(0x00001000),
        "IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT".enum(0x00002000),
        "IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT".enum(0x00004000),
        "IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT".enum(0x00008000),
        "IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT".enum(0x00010000),
        "IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT".enum(0x00020000),
        "IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT".enum(0x00040000),
        "IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT".enum(0x00080000),
        "IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT".enum(0x00100000),
        "IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT".enum(0x00200000),
        "IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT".enum(0x00400000),
        "IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT".enum(0x00800000)
    )

    void(
        "GetImageSubresourceLayout2EXT",

        VkDevice("device"),
        VkImage("image"),
        VkImageSubresource2.const.p("pSubresource"),
        VkSubresourceLayout2.p("pLayout")
    )
}