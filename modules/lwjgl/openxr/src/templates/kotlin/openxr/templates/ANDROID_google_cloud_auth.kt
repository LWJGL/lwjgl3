/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_google_cloud_auth = "ANDROIDGoogleCloudAuth".nativeClassXR("ANDROID_google_cloud_auth", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_google_cloud_auth_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_GOOGLE_CLOUD_AUTH_EXTENSION_NAME".."XR_ANDROID_google_cloud_auth"
    )

    EnumConstant(
        "ERROR_KEYLESS_AUTH_NOT_SETUP_ANDROID".."-1000787000",
        "ERROR_KEYLESS_AUTH_FAILED_ANDROID".."-1000787001"
    )

    EnumConstant(
        "TYPE_GOOGLE_CLOUD_AUTH_INFO_API_KEY_ANDROID".."1000787000",
        "TYPE_GOOGLE_CLOUD_AUTH_INFO_TOKEN_ANDROID".."1000787001",
        "TYPE_GOOGLE_CLOUD_AUTH_INFO_KEYLESS_ANDROID".."1000787002",
        "TYPE_GOOGLE_CLOUD_AUTH_ERROR_RESULT_ANDROID".."1000787003"
    )

    EnumConstant(
        "GOOGLE_CLOUD_AUTH_ERROR_NONE_ANDROID".."0",
        "GOOGLE_CLOUD_AUTH_ERROR_QUOTA_EXCEEDED_ANDROID".."-1",
        "GOOGLE_CLOUD_AUTH_ERROR_UNREACHABLE_ANDROID".."-2",
        "GOOGLE_CLOUD_AUTH_ERROR_ANDROID".."-3"
    )

    XrResult(
        "SetGoogleCloudAuthAsyncANDROID",

        XrSession("session"),
        XrGoogleCloudAuthInfoBaseHeaderANDROID.const.p("authInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "SetGoogleCloudAuthCompleteANDROID",

        XrSession("session"),
        XrFutureEXT("future"),
        XrFutureCompletionEXT.p("completion")
    )
}