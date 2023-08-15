/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val OPPO_controller_interaction = "OPPOControllerInteraction".nativeClassXR("OPPO_controller_interaction", type = "instance", postfix = "OPPO") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_OPPO_controller_interaction">XR_OPPO_controller_interaction</a> extension.

        This extension defines a new interaction profile for the OPPO Controller, including but not limited to OPPO MR Glasses Controller.
        """

    IntConstant(
        "The extension specification version.",

        "OPPO_controller_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "OPPO_CONTROLLER_INTERACTION_EXTENSION_NAME".."XR_OPPO_controller_interaction"
    )
}