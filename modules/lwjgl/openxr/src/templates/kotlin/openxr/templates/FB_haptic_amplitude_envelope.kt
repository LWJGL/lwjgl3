/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_haptic_amplitude_envelope = "FBHapticAmplitudeEnvelope".nativeClassXR("FB_haptic_amplitude_envelope", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_haptic_amplitude_envelope">XR_FB_haptic_amplitude_envelope</a> extension.

        This extension enables applications to trigger haptic effect using an Amplitude Envelope buffer.
        """

    IntConstant(
        "The extension specification version.",

        "FB_haptic_amplitude_envelope_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_HAPTIC_AMPLITUDE_ENVELOPE_EXTENSION_NAME".."XR_FB_haptic_amplitude_envelope"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB".."1000173001"
    )
}