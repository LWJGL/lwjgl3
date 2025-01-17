/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_image_drm_format_modifier = "EXTImageDrmFormatModifier".nativeClassVK("EXT_image_drm_format_modifier", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_IMAGE_DRM_FORMAT_MODIFIER_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME".."VK_EXT_image_drm_format_modifier"
    )

    EnumConstant(
        "ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT".."-1000158000"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT".."1000158000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT".."1000158002",
        "STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT".."1000158003",
        "STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT".."1000158004",
        "STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT".."1000158005",
        "STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT".."1000158006"
    )

    EnumConstant(
        "IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT".."1000158000"
    )

    EnumConstant(
        "IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT".enum(0x00000080),
        "IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT".enum(0x00000100),
        "IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT".enum(0x00000200),
        "IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT".enum(0x00000400)
    )

    VkResult(
        "GetImageDrmFormatModifierPropertiesEXT",

        VkDevice("device"),
        VkImage("image"),
        VkImageDrmFormatModifierPropertiesEXT.p("pProperties")
    )
}