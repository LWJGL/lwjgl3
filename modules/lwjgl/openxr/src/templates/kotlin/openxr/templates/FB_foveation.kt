/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_foveation = "FBFoveation".nativeClassXR("FB_foveation", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_foveation_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_FOVEATION_EXTENSION_NAME".."XR_FB_foveation"
    )

    EnumConstant(
        "OBJECT_TYPE_FOVEATION_PROFILE_FB".."1000114000"
    )

    EnumConstant(
        "TYPE_FOVEATION_PROFILE_CREATE_INFO_FB".."1000114000",
        "TYPE_SWAPCHAIN_CREATE_INFO_FOVEATION_FB".."1000114001",
        "TYPE_SWAPCHAIN_STATE_FOVEATION_FB".."1000114002"
    )

    EnumConstant(
        "SWAPCHAIN_CREATE_FOVEATION_SCALED_BIN_BIT_FB".enum(0x00000001),
        "SWAPCHAIN_CREATE_FOVEATION_FRAGMENT_DENSITY_MAP_BIT_FB".enum(0x00000002)
    )

    XrResult(
        "CreateFoveationProfileFB",

        XrSession("session"),
        XrFoveationProfileCreateInfoFB.const.p("createInfo"),
        Check(1)..XrFoveationProfileFB.p("profile")
    )

    XrResult(
        "DestroyFoveationProfileFB",

        XrFoveationProfileFB("profile")
    )
}