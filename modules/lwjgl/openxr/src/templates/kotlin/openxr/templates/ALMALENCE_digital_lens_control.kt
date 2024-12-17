/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ALMALENCE_digital_lens_control = "ALMALENCEDigitalLensControl".nativeClassXR("ALMALENCE_digital_lens_control", type = "instance", postfix = "ALMALENCE") {
    IntConstant(
        "ALMALENCE_digital_lens_control_SPEC_VERSION".."1"
    )

    StringConstant(
        "ALMALENCE_DIGITAL_LENS_CONTROL_EXTENSION_NAME".."XR_ALMALENCE_digital_lens_control"
    )

    EnumConstant(
        "TYPE_DIGITAL_LENS_CONTROL_ALMALENCE".."1000196000"
    )

    EnumConstant(
        "DIGITAL_LENS_CONTROL_PROCESSING_DISABLE_BIT_ALMALENCE".enum(0x00000001)
    )

    XrResult(
        "SetDigitalLensControlALMALENCE",

        XrSession("session"),
        XrDigitalLensControlALMALENCE.const.p("digitalLensControl")
    )
}