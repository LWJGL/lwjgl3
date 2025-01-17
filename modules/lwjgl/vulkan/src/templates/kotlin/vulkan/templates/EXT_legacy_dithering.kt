/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_legacy_dithering = "EXTLegacyDithering".nativeClassVK("EXT_legacy_dithering", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_LEGACY_DITHERING_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_LEGACY_DITHERING_EXTENSION_NAME".."VK_EXT_legacy_dithering"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT".."1000465000"
    )

    EnumConstant(
        "SUBPASS_DESCRIPTION_ENABLE_LEGACY_DITHERING_BIT_EXT".enum(0x00000080)
    )

    EnumConstant(
        "RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT".enum(0x00000008)
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT".enum(0x400000000L)
    )
}