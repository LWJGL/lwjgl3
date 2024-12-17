/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_passthrough_preferences = "METAPassthroughPreferences".nativeClassXR("META_passthrough_preferences", type = "instance", postfix = "META") {
    IntConstant(
        "META_passthrough_preferences_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_PASSTHROUGH_PREFERENCES_EXTENSION_NAME".."XR_META_passthrough_preferences"
    )

    EnumConstant(
        "TYPE_PASSTHROUGH_PREFERENCES_META".."1000217000"
    )

    EnumConstant(
        "PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META".enum(0x00000001)
    )

    XrResult(
        "GetPassthroughPreferencesMETA",

        XrSession("session"),
        XrPassthroughPreferencesMETA.p("preferences")
    )
}