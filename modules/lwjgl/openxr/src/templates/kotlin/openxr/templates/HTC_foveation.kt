/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_foveation = "HTCFoveation".nativeClassXR("HTC_foveation", type = "instance", postfix = "HTC") {
    IntConstant(
        "HTC_foveation_SPEC_VERSION".."1"
    )

    StringConstant(
        "HTC_FOVEATION_EXTENSION_NAME".."XR_HTC_foveation"
    )

    EnumConstant(
        "TYPE_FOVEATION_APPLY_INFO_HTC".."1000318000",
        "TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC".."1000318001",
        "TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC".."1000318002"
    )

    EnumConstant(
        "FOVEATION_MODE_DISABLE_HTC".."0",
        "FOVEATION_MODE_FIXED_HTC".."1",
        "FOVEATION_MODE_DYNAMIC_HTC".."2",
        "FOVEATION_MODE_CUSTOM_HTC".."3"
    )

    EnumConstant(
        "FOVEATION_LEVEL_NONE_HTC".."0",
        "FOVEATION_LEVEL_LOW_HTC".."1",
        "FOVEATION_LEVEL_MEDIUM_HTC".."2",
        "FOVEATION_LEVEL_HIGH_HTC".."3"
    )

    EnumConstant(
        "FOVEATION_DYNAMIC_LEVEL_ENABLED_BIT_HTC".enum(0x00000001),
        "FOVEATION_DYNAMIC_CLEAR_FOV_ENABLED_BIT_HTC".enum(0x00000002),
        "FOVEATION_DYNAMIC_FOCAL_CENTER_OFFSET_ENABLED_BIT_HTC".enum(0x00000004)
    )

    XrResult(
        "ApplyFoveationHTC",

        XrSession("session"),
        XrFoveationApplyInfoHTC.const.p("applyInfo")
    )
}