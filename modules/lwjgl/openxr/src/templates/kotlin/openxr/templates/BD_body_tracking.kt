/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_body_tracking = "BDBodyTracking".nativeClassXR("BD_body_tracking", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_body_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "BD_BODY_TRACKING_EXTENSION_NAME".."XR_BD_body_tracking"
    )

    EnumConstant(
        "OBJECT_TYPE_BODY_TRACKER_BD".."1000385000"
    )

    EnumConstant(
        "TYPE_BODY_TRACKER_CREATE_INFO_BD".."1000385001",
        "TYPE_BODY_JOINTS_LOCATE_INFO_BD".."1000385002",
        "TYPE_BODY_JOINT_LOCATIONS_BD".."1000385003",
        "TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_BD".."1000385004"
    )

    EnumConstant(
        "BODY_JOINT_PELVIS_BD".."0",
        "BODY_JOINT_LEFT_HIP_BD".."1",
        "BODY_JOINT_RIGHT_HIP_BD".."2",
        "BODY_JOINT_SPINE1_BD".."3",
        "BODY_JOINT_LEFT_KNEE_BD".."4",
        "BODY_JOINT_RIGHT_KNEE_BD".."5",
        "BODY_JOINT_SPINE2_BD".."6",
        "BODY_JOINT_LEFT_ANKLE_BD".."7",
        "BODY_JOINT_RIGHT_ANKLE_BD".."8",
        "BODY_JOINT_SPINE3_BD".."9",
        "BODY_JOINT_LEFT_FOOT_BD".."10",
        "BODY_JOINT_RIGHT_FOOT_BD".."11",
        "BODY_JOINT_NECK_BD".."12",
        "BODY_JOINT_LEFT_COLLAR_BD".."13",
        "BODY_JOINT_RIGHT_COLLAR_BD".."14",
        "BODY_JOINT_HEAD_BD".."15",
        "BODY_JOINT_LEFT_SHOULDER_BD".."16",
        "BODY_JOINT_RIGHT_SHOULDER_BD".."17",
        "BODY_JOINT_LEFT_ELBOW_BD".."18",
        "BODY_JOINT_RIGHT_ELBOW_BD".."19",
        "BODY_JOINT_LEFT_WRIST_BD".."20",
        "BODY_JOINT_RIGHT_WRIST_BD".."21",
        "BODY_JOINT_LEFT_HAND_BD".."22",
        "BODY_JOINT_RIGHT_HAND_BD".."23"
    )

    EnumConstant(
        "BODY_JOINT_SET_BODY_WITHOUT_ARM_BD".."1",
        "BODY_JOINT_SET_FULL_BODY_JOINTS_BD".."2"
    )

    XrResult(
        "CreateBodyTrackerBD",

        XrSession("session"),
        XrBodyTrackerCreateInfoBD.const.p("createInfo"),
        Check(1)..XrBodyTrackerBD.p("bodyTracker")
    )

    XrResult(
        "DestroyBodyTrackerBD",

        XrBodyTrackerBD("bodyTracker")
    )

    XrResult(
        "LocateBodyJointsBD",

        XrBodyTrackerBD("bodyTracker"),
        XrBodyJointsLocateInfoBD.const.p("locateInfo"),
        XrBodyJointLocationsBD.p("locations")
    )
}