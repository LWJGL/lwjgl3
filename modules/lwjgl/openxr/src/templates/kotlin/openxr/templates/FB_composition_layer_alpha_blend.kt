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
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_composition_layer_alpha_blend">XR_FB_composition_layer_alpha_blend</a> extension.

        This extension provides explicit control over source and destination blend factors, with separate controls for color and alpha. When specified, these blend controls supersede the behavior of #COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT.

        When #COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT is specified, the source color is unpremultiplied alpha.

        Like color, destination alpha is initialized to 0 before composition begins.

        In order to enable the functionality of this extension, the application <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.

        These blend factors are specified by attaching a ##XrCompositionLayerAlphaBlendFB structure to the {@code next} chain of a layer structure derived from ##XrCompositionLayerBaseHeader.
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