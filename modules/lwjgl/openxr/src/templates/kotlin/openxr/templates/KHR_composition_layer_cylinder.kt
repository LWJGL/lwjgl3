/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_composition_layer_cylinder = "KHRCompositionLayerCylinder".nativeClassXR("KHR_composition_layer_cylinder", type = "instance", postfix = "KHR") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_composition_layer_cylinder_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "KHR_COMPOSITION_LAYER_CYLINDER_EXTENSION_NAME".."XR_KHR_composition_layer_cylinder"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_CYLINDER_KHR".."1000017000"
    )
}