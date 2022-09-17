/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_composition_layer_cube = "KHRCompositionLayerCube".nativeClassXR("KHR_composition_layer_cube", type = "instance", postfix = "KHR") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_KHR_composition_layer_cube">XR_KHR_composition_layer_cube</a> extension.

        This extension adds an additional layer type that enables direct sampling from cubemaps.

        The cube layer is the natural layer type for hardware accelerated environment maps. Without updating the image source, the user can look all around, and the compositor can display what they are looking at without intervention from the application.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_composition_layer_cube_SPEC_VERSION".."8"
    )

    StringConstant(
        "The extension name.",

        "KHR_COMPOSITION_LAYER_CUBE_EXTENSION_NAME".."XR_KHR_composition_layer_cube"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_CUBE_KHR".."1000006000"
    )
}