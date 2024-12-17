/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_color_space = "FBColorSpace".nativeClassXR("FB_color_space", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_color_space_SPEC_VERSION".."3"
    )

    StringConstant(
        "FB_COLOR_SPACE_EXTENSION_NAME".."XR_FB_color_space"
    )

    EnumConstant(
        "TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB".."1000108000"
    )

    EnumConstant(
        "ERROR_COLOR_SPACE_UNSUPPORTED_FB".."-1000108000"
    )

    EnumConstant(
        "COLOR_SPACE_UNMANAGED_FB".."0",
        "COLOR_SPACE_REC2020_FB".."1",
        "COLOR_SPACE_REC709_FB".."2",
        "COLOR_SPACE_RIFT_CV1_FB".."3",
        "COLOR_SPACE_RIFT_S_FB".."4",
        "COLOR_SPACE_QUEST_FB".."5",
        "COLOR_SPACE_P3_FB".."6",
        "COLOR_SPACE_ADOBE_RGB_FB".."7"
    )

    XrResult(
        "EnumerateColorSpacesFB",

        XrSession("session"),
        AutoSize("colorSpaces")..uint32_t("colorSpaceCapacityInput"),
        Check(1)..uint32_t.p("colorSpaceCountOutput"),
        nullable..XrColorSpaceFB.p("colorSpaces")
    )

    XrResult(
        "SetColorSpaceFB",

        XrSession("session"),
        XrColorSpaceFB("colorSpace")
    )
}