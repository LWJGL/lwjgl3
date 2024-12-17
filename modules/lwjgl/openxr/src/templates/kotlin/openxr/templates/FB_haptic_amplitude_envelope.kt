/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_haptic_amplitude_envelope = "FBHapticAmplitudeEnvelope".nativeClassXR("FB_haptic_amplitude_envelope", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_haptic_amplitude_envelope_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_HAPTIC_AMPLITUDE_ENVELOPE_EXTENSION_NAME".."XR_FB_haptic_amplitude_envelope"
    )

    EnumConstant(
        "TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB".."1000173001"
    )
}