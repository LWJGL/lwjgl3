/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_composition_layer_equirect2 = "KHRCompositionLayerEquirect2".nativeClassXR("KHR_composition_layer_equirect2", type = "instance", postfix = "KHR") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_composition_layer_equirect2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_COMPOSITION_LAYER_EQUIRECT2_EXTENSION_NAME".."XR_KHR_composition_layer_equirect2"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR".."1000091000"
    )
}