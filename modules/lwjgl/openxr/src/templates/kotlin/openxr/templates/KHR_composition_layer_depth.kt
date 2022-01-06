/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_composition_layer_depth = "KHRCompositionLayerDepth".nativeClassXR("KHR_composition_layer_depth", type = "instance", postfix = "KHR") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_composition_layer_depth_SPEC_VERSION".."5"
    )

    StringConstant(
        "The extension name.",

        "KHR_COMPOSITION_LAYER_DEPTH_EXTENSION_NAME".."XR_KHR_composition_layer_depth"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR".."1000010000"
    )
}