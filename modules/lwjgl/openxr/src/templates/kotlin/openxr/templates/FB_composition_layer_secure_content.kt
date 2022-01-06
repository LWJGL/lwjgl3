/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_composition_layer_secure_content = "FBCompositionLayerSecureContent".nativeClassXR("FB_composition_layer_secure_content", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_composition_layer_secure_content_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_COMPOSITION_LAYER_SECURE_CONTENT_EXTENSION_NAME".."XR_FB_composition_layer_secure_content"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB".."1000072000"
    )

    EnumConstant(
        "XrCompositionLayerSecureContentFlagBitsFB",

        "COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB".enum(0x00000001),
        "COMPOSITION_LAYER_SECURE_CONTENT_REPLACE_LAYER_BIT_FB".enum(0x00000002)
    )
}