/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_ml2_controller_interaction = "MLMl2ControllerInteraction".nativeClassXR("ML_ml2_controller_interaction", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_ML_ml2_controller_interaction">XR_ML_ml2_controller_interaction</a> extension.

        This extension defines the interaction profile for the Magic Leap 2 Controller.
        """

    IntConstant(
        "The extension specification version.",

        "ML_ml2_controller_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_ML2_CONTROLLER_INTERACTION_EXTENSION_NAME".."XR_ML_ml2_controller_interaction"
    )
}