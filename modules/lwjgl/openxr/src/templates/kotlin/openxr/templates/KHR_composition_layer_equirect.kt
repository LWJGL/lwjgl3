/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_composition_layer_equirect = "KHRCompositionLayerEquirect".nativeClassXR("KHR_composition_layer_equirect", type = "instance", postfix = "KHR") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_composition_layer_equirect_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "KHR_COMPOSITION_LAYER_EQUIRECT_EXTENSION_NAME".."XR_KHR_composition_layer_equirect"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_EQUIRECT_KHR".."1000018000"
    )
}