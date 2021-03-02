/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*
import openxr.KHR as KHR_

val KHR_android_thread_settings = "KHRAndroidThreadSettings".nativeClassXR("KHR_android_thread_settings", type = "instance", postfix = KHR_) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_android_thread_settings_SPEC_VERSION".."5"
    )

    StringConstant(
        "The extension name.",

        "KHR_ANDROID_THREAD_SETTINGS_EXTENSION_NAME".."XR_KHR_android_thread_settings"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_ANDROID_THREAD_SETTINGS_ID_INVALID_KHR".."-1000003000",
        "ERROR_ANDROID_THREAD_SETTINGS_FAILURE_KHR".."-1000003001"
    )

    EnumConstant(
        "XrAndroidThreadTypeKHR",

        "ANDROID_THREAD_TYPE_APPLICATION_MAIN_KHR".."1",
        "ANDROID_THREAD_TYPE_APPLICATION_WORKER_KHR".."2",
        "ANDROID_THREAD_TYPE_RENDERER_MAIN_KHR".."3",
        "ANDROID_THREAD_TYPE_RENDERER_WORKER_KHR".."4"
    )

    XrResult(
        "SetAndroidApplicationThreadKHR",
        "",

        XrSession("session", ""),
        XrAndroidThreadTypeKHR("threadType", ""),
        uint32_t("threadId", "")
    )
}