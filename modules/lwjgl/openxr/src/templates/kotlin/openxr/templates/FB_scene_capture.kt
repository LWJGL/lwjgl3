/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_scene_capture = "FBSceneCapture".nativeClassXR("FB_scene_capture", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_scene_capture_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_SCENE_CAPTURE_EXTENSION_NAME".."XR_FB_scene_capture"
    )

    EnumConstant(
        "TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB".."1000198001",
        "TYPE_SCENE_CAPTURE_REQUEST_INFO_FB".."1000198050"
    )

    XrResult(
        "RequestSceneCaptureFB",

        XrSession("session"),
        XrSceneCaptureRequestInfoFB.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )
}