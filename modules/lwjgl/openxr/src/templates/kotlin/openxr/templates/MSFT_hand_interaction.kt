/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*
import openxr.MSFT as MSFT_

val MSFT_hand_interaction = "MSFTHandInteraction".nativeClassXR("MSFT_hand_interaction", type = "instance", postfix = MSFT_) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_hand_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_HAND_INTERACTION_EXTENSION_NAME".."XR_MSFT_hand_interaction"
    )
}