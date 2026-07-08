/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_hand_tracking_frequency_hint = "METAHandTrackingFrequencyHint".nativeClassXR("META_hand_tracking_frequency_hint", type = "instance", postfix = "META") {
    IntConstant(
        "META_hand_tracking_frequency_hint_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_HAND_TRACKING_FREQUENCY_HINT_EXTENSION_NAME".."XR_META_hand_tracking_frequency_hint"
    )

    EnumConstant(
        "HAND_TRACKING_FREQUENCY_HINT_DEFAULT_META".."1",
        "HAND_TRACKING_FREQUENCY_HINT_HIGH_META".."2"
    )

    XrResult(
        "SetHandTrackingFrequencyHintMETA",

        XrSession("session"),
        XrHandTrackingFrequencyHintMETA("frequencyHint")
    )
}