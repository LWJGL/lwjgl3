/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val QCOM_hand_tracking_gesture = "QCOMHandTrackingGesture".nativeClassXR("QCOM_hand_tracking_gesture", type = "instance", postfix = "QCOM") {
    IntConstant(
        "QCOM_hand_tracking_gesture_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_HAND_TRACKING_GESTURE_EXTENSION_NAME".."XR_QCOM_hand_tracking_gesture"
    )

    EnumConstant(
        "HAND_GESTURE_TYPE_OPEN_HAND_QCOM".."0",
        "HAND_GESTURE_TYPE_GRAB_QCOM".."2",
        "HAND_GESTURE_TYPE_PINCH_QCOM".."7",
        "HAND_GESTURE_TYPE_UNKNOWN_QCOM".."-1"
    )

    XrResult(
        "GetHandGestureQCOM",

        XrHandTrackerEXT("handTracker"),
        XrTime("time"),
        XrHandGestureQCOM.p("handGesture")
    )
}