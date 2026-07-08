/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_body_tracking_auxiliary_metrics = "BDBodyTrackingAuxiliaryMetrics".nativeClassXR("BD_body_tracking_auxiliary_metrics", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_body_tracking_auxiliary_metrics_SPEC_VERSION".."1"
    )

    StringConstant(
        "BD_BODY_TRACKING_AUXILIARY_METRICS_EXTENSION_NAME".."XR_BD_body_tracking_auxiliary_metrics"
    )

    EnumConstant(
        "TYPE_BODY_TRACKING_POSTURE_DATA_BD".."1000395001",
        "TYPE_BODY_JOINT_VELOCITIES_BD".."1000395002",
        "TYPE_BODY_JOINT_ACCELERATIONS_BD".."1000395003",
        "TYPE_BODY_TRACKING_STATE_BD".."1000395004"
    )

    EnumConstant(
        "BODY_TRACKING_POSTURE_STOMP_BD".."1",
        "BODY_TRACKING_POSTURE_STATIC_BD".."2"
    )

    EnumConstant(
        "SPACE_ACCELERATION_LINEAR_VALID_BIT_BD".enum(0x00000001),
        "SPACE_ACCELERATION_ANGULAR_VALID_BIT_BD".enum(0x00000002)
    )

    EnumConstant(
        "BODY_TRACKING_STATUS_INVALID_BD".."0",
        "BODY_TRACKING_STATUS_VALID_BD".."1",
        "BODY_TRACKING_STATUS_LIMITED_BD".."2"
    )

    EnumConstant(
        "BODY_TRACKING_MESSAGE_NO_ERROR_BD".."0",
        "BODY_TRACKING_MESSAGE_TRACKER_NOT_CALIBRATED_BD".."1",
        "BODY_TRACKING_MESSAGE_TRACKER_NUM_NOT_ENOUGH_BD".."2",
        "BODY_TRACKING_MESSAGE_TRACKER_STATE_NOT_SATISFIED_BD".."3",
        "BODY_TRACKING_MESSAGE_TRACKER_PERSISTENT_INVISIBILITY_BD".."4",
        "BODY_TRACKING_MESSAGE_TRACKER_DATA_ERROR_BD".."5",
        "BODY_TRACKING_MESSAGE_USER_CHANGE_BD".."6",
        "BODY_TRACKING_MESSAGE_TRACKING_POSE_ERROR_BD".."7"
    )

    XrResult(
        "StartBodyTrackingCalibrationAppBD",

        XrSession("session")
    )

    XrResult(
        "GetBodyTrackingStateBD",

        XrSession("session"),
        XrBodyTrackingStateBD.p("state")
    )
}