/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_image_format_list = "KHRImageFormatList".nativeClassVK("KHR_image_format_list", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_IMAGE_FORMAT_LIST_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_IMAGE_FORMAT_LIST_EXTENSION_NAME".."VK_KHR_image_format_list"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO_KHR".."1000147000"
    )
}