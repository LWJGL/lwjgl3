/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val YVR_controller_interaction = "YVRControllerInteraction".nativeClassXR("YVR_controller_interaction", type = "instance", postfix = "YVR") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_YVR_controller_interaction">XR_YVR_controller_interaction</a> extension.

        This extension defines a new interaction profile for the YVR Controller, including but not limited to YVR1 and YVR2 Controller.
        """

    IntConstant(
        "The extension specification version.",

        "YVR_controller_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "YVR_CONTROLLER_INTERACTION_EXTENSION_NAME".."XR_YVR_controller_interaction"
    )
}