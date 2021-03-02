/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*
import openxr.OCULUS as OCULUS_

val OCULUS_android_session_state_enable = "OCULUSAndroidSessionStateEnable".nativeClassXR("OCULUS_android_session_state_enable", type = "instance", postfix = OCULUS_) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "OCULUS_android_session_state_enable_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "OCULUS_ANDROID_SESSION_STATE_ENABLE_EXTENSION_NAME".."XR_OCULUS_android_session_state_enable"
    )
}