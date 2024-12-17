/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val OCULUS_external_camera = "OCULUSExternalCamera".nativeClassXR("OCULUS_external_camera", type = "instance", postfix = "OCULUS") {
    IntConstant(
        "OCULUS_external_camera_SPEC_VERSION".."1"
    )

    StringConstant(
        "OCULUS_EXTERNAL_CAMERA_EXTENSION_NAME".."XR_OCULUS_external_camera"
    )

    EnumConstant(
        "TYPE_EXTERNAL_CAMERA_OCULUS".."1000226000"
    )

    EnumConstant(
        "MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS".."32"
    )

    EnumConstant(
        "EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_NONE_OCULUS".."0",
        "EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_HMD_OCULUS".."1",
        "EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_LTOUCH_OCULUS".."2",
        "EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_RTOUCH_OCULUS".."3"
    )

    EnumConstant(
        "EXTERNAL_CAMERA_STATUS_CONNECTED_BIT_OCULUS".enum(0x00000001),
        "EXTERNAL_CAMERA_STATUS_CALIBRATING_BIT_OCULUS".enum(0x00000002),
        "EXTERNAL_CAMERA_STATUS_CALIBRATION_FAILED_BIT_OCULUS".enum(0x00000004),
        "EXTERNAL_CAMERA_STATUS_CALIBRATED_BIT_OCULUS".enum(0x00000008),
        "EXTERNAL_CAMERA_STATUS_CAPTURING_BIT_OCULUS".enum(0x00000010)
    )

    XrResult(
        "EnumerateExternalCamerasOCULUS",

        XrSession("session"),
        AutoSize("cameras")..uint32_t("cameraCapacityInput"),
        Check(1)..uint32_t.p("cameraCountOutput"),
        nullable..XrExternalCameraOCULUS.p("cameras")
    )
}