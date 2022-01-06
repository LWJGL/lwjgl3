/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_composition_layer_alpha_blend = "FBCompositionLayerAlphaBlend".nativeClassXR("FB_composition_layer_alpha_blend", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_composition_layer_alpha_blend_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "FB_COMPOSITION_LAYER_ALPHA_BLEND_EXTENSION_NAME".."XR_FB_composition_layer_alpha_blend"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB".."1000041001"
    )

    EnumConstant(
        """
        XrBlendFactorFB - Blend Factor Types

        <h5>See Also</h5>
        ##XrCompositionLayerAlphaBlendFB
        """,

        "BLEND_FACTOR_ZERO_FB".."0",
        "BLEND_FACTOR_ONE_FB".."1",
        "BLEND_FACTOR_SRC_ALPHA_FB".."2",
        "BLEND_FACTOR_ONE_MINUS_SRC_ALPHA_FB".."3",
        "BLEND_FACTOR_DST_ALPHA_FB".."4",
        "BLEND_FACTOR_ONE_MINUS_DST_ALPHA_FB".."5"
    )
}