/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NVX_image_view_handle = "NVXImageViewHandle".nativeClassVK("NVX_image_view_handle", type = "device", postfix = "NVX") {
    IntConstant(
        "NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION".."4"
    )

    StringConstant(
        "NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME".."VK_NVX_image_view_handle"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX".."1000030000",
        "STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX".."1000030001"
    )

    uint32_t(
        "GetImageViewHandleNVX",

        VkDevice("device"),
        VkImageViewHandleInfoNVX.const.p("pInfo")
    )

    uint64_t(
        "GetImageViewHandle64NVX",

        VkDevice("device"),
        VkImageViewHandleInfoNVX.const.p("pInfo")
    )

    VkResult(
        "GetImageViewAddressNVX",

        VkDevice("device"),
        VkImageView("imageView"),
        VkImageViewAddressPropertiesNVX.p("pProperties")
    )

    uint64_t(
        "GetDeviceCombinedImageSamplerIndexNVX",

        VkDevice("device"),
        uint64_t("imageViewIndex"),
        uint64_t("samplerIndex")
    )
}