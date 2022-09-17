/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_composition_layer_color_scale_bias = "KHRCompositionLayerColorScaleBias".nativeClassXR("KHR_composition_layer_color_scale_bias", type = "instance", postfix = "KHR") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_KHR_composition_layer_color_scale_bias">XR_KHR_composition_layer_color_scale_bias</a> extension.

        Color scale and bias are applied to a layer color during composition, after its conversion to premultiplied alpha representation.

        If specified, {@code colorScale} and {@code colorBias} <b>must</b> be used to alter the LayerColor as follows:

        <ul>
            <li>colorScale = max( vec4( 0, 0, 0, 0 ), colorScale )</li>
            <li>LayerColor.RGB = LayerColor.A &gt; 0 ? LayerColor.RGB / LayerColor.A : vec3( 0, 0, 0 )</li>
            <li>LayerColor = LayerColor * colorScale + colorBias</li>
            <li>LayerColor.RGB *= LayerColor.A</li>
        </ul>

        This extension specifies the ##XrCompositionLayerColorScaleBiasKHR structure, which, if present in the ##XrCompositionLayerBaseHeader{@code ::next} chain, <b>must</b> be applied to the composition layer.

        This extension does not define a new composition layer type, but rather it defines a transform that may be applied to the color derived from existing composition layer types.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_composition_layer_color_scale_bias_SPEC_VERSION".."5"
    )

    StringConstant(
        "The extension name.",

        "KHR_COMPOSITION_LAYER_COLOR_SCALE_BIAS_EXTENSION_NAME".."XR_KHR_composition_layer_color_scale_bias"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR".."1000034000"
    )
}