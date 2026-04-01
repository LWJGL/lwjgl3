/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_trackables_qr_code = "ANDROIDTrackablesQrCode".nativeClassXR("ANDROID_trackables_qr_code", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_trackables_qr_code_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_TRACKABLES_QR_CODE_EXTENSION_NAME".."XR_ANDROID_trackables_qr_code"
    )

    EnumConstant(
        "TYPE_SYSTEM_QR_CODE_TRACKING_PROPERTIES_ANDROID".."1000708000",
        "TYPE_TRACKABLE_QR_CODE_CONFIGURATION_ANDROID".."1000708001",
        "TYPE_TRACKABLE_QR_CODE_ANDROID".."1000708002"
    )

    EnumConstant(
        "TRACKABLE_TYPE_QR_CODE_ANDROID".."1000708000"
    )

    EnumConstant(
        "QR_CODE_TRACKING_MODE_DYNAMIC_ANDROID".."0",
        "QR_CODE_TRACKING_MODE_STATIC_ANDROID".."1"
    )

    XrResult(
        "GetTrackableQrCodeANDROID",

        XrTrackableTrackerANDROID("tracker"),
        XrTrackableGetInfoANDROID.const.p("getInfo"),
        XrTrackableQrCodeANDROID.p("qrCodeOutput")
    )
}