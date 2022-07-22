/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_composition_layer_settings = "FBCompositionLayerSettings".nativeClassXR("FB_composition_layer_settings", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_composition_layer_settings_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_COMPOSITION_LAYER_SETTINGS_EXTENSION_NAME".."XR_FB_composition_layer_settings"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_SETTINGS_FB".."1000204000"
    )

    EnumConstant(
        "XrCompositionLayerSettingsFlagBitsFB",

        "COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB".enum(0x00000001),
        "COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB".enum(0x00000002),
        "COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB".enum(0x00000004),
        "COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB".enum(0x00000008)
    )
}