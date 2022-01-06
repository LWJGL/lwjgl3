/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MND_headless = "MNDHeadless".nativeClassXR("MND_headless", type = "instance", postfix = "MND") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MND_headless_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MND_HEADLESS_EXTENSION_NAME".."XR_MND_headless"
    )
}