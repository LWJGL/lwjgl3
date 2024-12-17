/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_hand_joints_motion_range = "EXTHandJointsMotionRange".nativeClassXR("EXT_hand_joints_motion_range", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_hand_joints_motion_range_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_HAND_JOINTS_MOTION_RANGE_EXTENSION_NAME".."XR_EXT_hand_joints_motion_range"
    )

    EnumConstant(
        "TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT".."1000080000"
    )

    EnumConstant(
        "HAND_JOINTS_MOTION_RANGE_UNOBSTRUCTED_EXT".."1",
        "HAND_JOINTS_MOTION_RANGE_CONFORMING_TO_CONTROLLER_EXT".."2"
    )
}