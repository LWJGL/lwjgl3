/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_samsung_odyssey_controller = "EXTSamsungOdysseyController".nativeClassXR("EXT_samsung_odyssey_controller", type = "instance", postfix = "EXT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_samsung_odyssey_controller_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SAMSUNG_ODYSSEY_CONTROLLER_EXTENSION_NAME".."XR_EXT_samsung_odyssey_controller"
    )
}