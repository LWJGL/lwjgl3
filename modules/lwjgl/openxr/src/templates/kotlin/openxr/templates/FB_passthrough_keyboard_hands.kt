/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_passthrough_keyboard_hands = "FBPassthroughKeyboardHands".nativeClassXR("FB_passthrough_keyboard_hands", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_passthrough_keyboard_hands_SPEC_VERSION".."2"
    )

    StringConstant(
        "FB_PASSTHROUGH_KEYBOARD_HANDS_EXTENSION_NAME".."XR_FB_passthrough_keyboard_hands"
    )

    EnumConstant(
        "PASSTHROUGH_LAYER_PURPOSE_TRACKED_KEYBOARD_HANDS_FB".."1000203001",
        "PASSTHROUGH_LAYER_PURPOSE_TRACKED_KEYBOARD_MASKED_HANDS_FB".."1000203002"
    )

    EnumConstant(
        "TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB".."1000203002"
    )

    XrResult(
        "PassthroughLayerSetKeyboardHandsIntensityFB",

        XrPassthroughLayerFB("layer"),
        XrPassthroughKeyboardHandsIntensityFB.const.p("intensity")
    )
}