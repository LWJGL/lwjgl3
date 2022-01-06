/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_composition_layer_depth_test = "VARJOCompositionLayerDepthTest".nativeClassXR("VARJO_composition_layer_depth_test", type = "instance", postfix = "VARJO") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "VARJO_composition_layer_depth_test_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "VARJO_COMPOSITION_LAYER_DEPTH_TEST_EXTENSION_NAME".."XR_VARJO_composition_layer_depth_test"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO".."1000122000"
    )
}