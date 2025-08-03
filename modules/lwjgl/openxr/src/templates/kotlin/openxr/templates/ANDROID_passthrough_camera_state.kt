/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_passthrough_camera_state = "ANDROIDPassthroughCameraState".nativeClassXR("ANDROID_passthrough_camera_state", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_passthrough_camera_state_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_PASSTHROUGH_CAMERA_STATE_EXTENSION_NAME".."XR_ANDROID_passthrough_camera_state"
    )

    EnumConstant(
        "TYPE_PASSTHROUGH_CAMERA_STATE_GET_INFO_ANDROID".."1000460000",
        "TYPE_SYSTEM_PASSTHROUGH_CAMERA_STATE_PROPERTIES_ANDROID".."1000460001"
    )

    EnumConstant(
        "PASSTHROUGH_CAMERA_STATE_DISABLED_ANDROID".."0",
        "PASSTHROUGH_CAMERA_STATE_INITIALIZING_ANDROID".."1",
        "PASSTHROUGH_CAMERA_STATE_READY_ANDROID".."2",
        "PASSTHROUGH_CAMERA_STATE_ERROR_ANDROID".."3"
    )

    XrResult(
        "GetPassthroughCameraStateANDROID",

        XrSession("session"),
        XrPassthroughCameraStateGetInfoANDROID.const.p("getInfo"),
        Check(1)..XrPassthroughCameraStateANDROID.p("cameraStateOutput")
    )
}