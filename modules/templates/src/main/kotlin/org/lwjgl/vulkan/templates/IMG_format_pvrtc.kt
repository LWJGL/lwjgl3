/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val IMG_format_pvrtc = "IMGFormatPVRTC".nativeClassVK("IMG_format_pvrtc", type = "device", postfix = IMG) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "IMG_FORMAT_PVRTC_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "IMG_FORMAT_PVRTC_EXTENSION_NAME".."VK_IMG_format_pvrtc"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG".."1000054000",
        "FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG".."1000054001",
        "FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG".."1000054002",
        "FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG".."1000054003",
        "FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG".."1000054004",
        "FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG".."1000054005",
        "FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG".."1000054006",
        "FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG".."1000054007"
    )
}