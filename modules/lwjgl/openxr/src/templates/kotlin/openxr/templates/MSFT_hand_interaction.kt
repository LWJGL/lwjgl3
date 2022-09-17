/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_hand_interaction = "MSFTHandInteraction".nativeClassXR("MSFT_hand_interaction", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_MSFT_hand_interaction">XR_MSFT_hand_interaction</a> extension.

        This extension defines a new interaction profile for near interactions and far interactions driven by directly-tracked hands.
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