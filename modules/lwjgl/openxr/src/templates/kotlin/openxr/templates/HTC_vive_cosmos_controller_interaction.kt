/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_vive_cosmos_controller_interaction = "HTCViveCosmosControllerInteraction".nativeClassXR("HTC_vive_cosmos_controller_interaction", type = "instance", postfix = "HTC") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_HTC_vive_cosmos_controller_interaction">XR_HTC_vive_cosmos_controller_interaction</a> extension.

        This extension defines a new interaction profile for the VIVE Cosmos Controller.
        """

    IntConstant(
        "The extension specification version.",

        "HTC_vive_cosmos_controller_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "HTC_VIVE_COSMOS_CONTROLLER_INTERACTION_EXTENSION_NAME".."XR_HTC_vive_cosmos_controller_interaction"
    )
}