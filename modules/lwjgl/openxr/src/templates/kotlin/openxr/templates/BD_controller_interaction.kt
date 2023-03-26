/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_controller_interaction = "BDControllerInteraction".nativeClassXR("BD_controller_interaction", type = "instance", postfix = "BD") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_BD_controller_interaction">XR_BD_controller_interaction</a> extension.

        This extension defines the interaction profile for PICO Neo3 and PICO 4 Controllers.
        """

    IntConstant(
        "The extension specification version.",

        "BD_controller_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "BD_CONTROLLER_INTERACTION_EXTENSION_NAME".."XR_BD_controller_interaction"
    )
}