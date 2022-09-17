/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_hand_interaction = "HTCHandInteraction".nativeClassXR("HTC_hand_interaction", type = "instance", postfix = "HTC") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_HTC_hand_interaction">XR_HTC_hand_interaction</a> extension.

        This extension defines a new interaction profile for tracked hands.
        """

    IntConstant(
        "The extension specification version.",

        "HTC_hand_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "HTC_HAND_INTERACTION_EXTENSION_NAME".."XR_HTC_hand_interaction"
    )
}