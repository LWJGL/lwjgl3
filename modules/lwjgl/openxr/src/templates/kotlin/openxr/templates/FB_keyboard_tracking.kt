/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_keyboard_tracking = "FBKeyboardTracking".nativeClassXR("FB_keyboard_tracking", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_keyboard_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_KEYBOARD_TRACKING_EXTENSION_NAME".."XR_FB_keyboard_tracking"
    )

    EnumConstant(
        "MAX_KEYBOARD_TRACKING_NAME_SIZE_FB".."128"
    )

    EnumConstant(
        "TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB".."1000116002",
        "TYPE_KEYBOARD_TRACKING_QUERY_FB".."1000116004",
        "TYPE_KEYBOARD_SPACE_CREATE_INFO_FB".."1000116009"
    )

    EnumConstant(
        "KEYBOARD_TRACKING_EXISTS_BIT_FB".enum(0x00000001),
        "KEYBOARD_TRACKING_LOCAL_BIT_FB".enum(0x00000002),
        "KEYBOARD_TRACKING_REMOTE_BIT_FB".enum(0x00000004),
        "KEYBOARD_TRACKING_CONNECTED_BIT_FB".enum(0x00000008)
    )

    EnumConstant(
        "KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB".enum(0x00000002),
        "KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB".enum(0x00000004)
    )

    XrResult(
        "QuerySystemTrackedKeyboardFB",

        XrSession("session"),
        XrKeyboardTrackingQueryFB.const.p("queryInfo"),
        XrKeyboardTrackingDescriptionFB.p("keyboard")
    )

    XrResult(
        "CreateKeyboardSpaceFB",

        XrSession("session"),
        XrKeyboardSpaceCreateInfoFB.const.p("createInfo"),
        Check(1)..XrSpace.p("keyboardSpace")
    )
}