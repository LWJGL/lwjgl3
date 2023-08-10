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
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_composition_layer_settings">XR_FB_composition_layer_settings</a> extension.

        This extension allows applications to request the use of processing options such as sharpening or super-sampling on a composition layer.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
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
        """
        XrCompositionLayerSettingsFlagBitsFB - XrCompositionLayerSettingsFlagBitsFB

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB — Indicates compositor <b>may</b> use layer texture supersampling.</li>
            <li>#COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB — Indicates compositor <b>may</b> use high quality layer texture supersampling.</li>
            <li>#COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB — Indicates compositor <b>may</b> use layer texture sharpening.</li>
            <li>#COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB — Indicates compositor <b>may</b> use high quality layer texture sharpening.</li>
        </ul>
        """,

        "COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB".enum(0x00000001),
        "COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB".enum(0x00000002),
        "COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB".enum(0x00000004),
        "COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB".enum(0x00000008)
    )
}