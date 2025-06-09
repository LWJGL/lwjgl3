/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ANDROID_external_format_resolve = "ANDROIDExternalFormatResolve".nativeClassVK("ANDROID_external_format_resolve", type = "device", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_EXTERNAL_FORMAT_RESOLVE_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_EXTERNAL_FORMAT_RESOLVE_EXTENSION_NAME".."VK_ANDROID_external_format_resolve"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID".."1000468000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID".."1000468001",
        "STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID".."1000468002"
    )

    EnumConstant(
        "RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_BIT_ANDROID".enum(0x00000010),
        "RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID".enum(0x00000010)
    )
}