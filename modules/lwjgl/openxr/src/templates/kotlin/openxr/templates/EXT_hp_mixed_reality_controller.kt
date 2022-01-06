/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_hp_mixed_reality_controller = "EXTHPMixedRealityController".nativeClassXR("EXT_hp_mixed_reality_controller", type = "instance", postfix = "EXT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_hp_mixed_reality_controller_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_HP_MIXED_REALITY_CONTROLLER_EXTENSION_NAME".."XR_EXT_hp_mixed_reality_controller"
    )
}