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
        The $templateName extension.
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