/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_composition_layer_inverted_alpha = "EXTCompositionLayerInvertedAlpha".nativeClassXR("EXT_composition_layer_inverted_alpha", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_composition_layer_inverted_alpha_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_COMPOSITION_LAYER_INVERTED_ALPHA_EXTENSION_NAME".."XR_EXT_composition_layer_inverted_alpha"
    )

    EnumConstant(
        "COMPOSITION_LAYER_INVERTED_ALPHA_BIT_EXT".enum(0x00000008)
    )
}