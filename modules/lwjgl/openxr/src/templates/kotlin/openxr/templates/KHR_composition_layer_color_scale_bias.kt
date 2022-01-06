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
        The $templateName extension.
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