/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_body_tracking = "HTCBodyTracking".nativeClassXR("HTC_body_tracking", type = "instance", postfix = "HTC") {
    IntConstant(
        "HTC_body_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "HTC_BODY_TRACKING_EXTENSION_NAME".."XR_HTC_body_tracking"
    )

    EnumConstant(
        "OBJECT_TYPE_BODY_TRACKER_HTC".."1000320000"
    )

    EnumConstant(
        "TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC".."1000320000",
        "TYPE_BODY_TRACKER_CREATE_INFO_HTC".."1000320001",
        "TYPE_BODY_JOINTS_LOCATE_INFO_HTC".."1000320002",
        "TYPE_BODY_JOINT_LOCATIONS_HTC".."1000320003",
        "TYPE_BODY_SKELETON_HTC".."1000320004"
    )

    EnumConstant(
        "BODY_JOINT_PELVIS_HTC".."0",
        "BODY_JOINT_LEFT_HIP_HTC".."1",
        "BODY_JOINT_LEFT_KNEE_HTC".."2",
        "BODY_JOINT_LEFT_ANKLE_HTC".."3",
        "BODY_JOINT_LEFT_FEET_HTC".."4",
        "BODY_JOINT_RIGHT_HIP_HTC".."5",
        "BODY_JOINT_RIGHT_KNEE_HTC".."6",
        "BODY_JOINT_RIGHT_ANKLE_HTC".."7",
        "BODY_JOINT_RIGHT_FEET_HTC".."8",
        "BODY_JOINT_WAIST_HTC".."9",
        "BODY_JOINT_SPINE_LOWER_HTC".."10",
        "BODY_JOINT_SPINE_MIDDLE_HTC".."11",
        "BODY_JOINT_SPINE_HIGH_HTC".."12",
        "BODY_JOINT_CHEST_HTC".."13",
        "BODY_JOINT_NECK_HTC".."14",
        "BODY_JOINT_HEAD_HTC".."15",
        "BODY_JOINT_LEFT_CLAVICLE_HTC".."16",
        "BODY_JOINT_LEFT_SCAPULA_HTC".."17",
        "BODY_JOINT_LEFT_ARM_HTC".."18",
        "BODY_JOINT_LEFT_ELBOW_HTC".."19",
        "BODY_JOINT_LEFT_WRIST_HTC".."20",
        "BODY_JOINT_RIGHT_CLAVICLE_HTC".."21",
        "BODY_JOINT_RIGHT_SCAPULA_HTC".."22",
        "BODY_JOINT_RIGHT_ARM_HTC".."23",
        "BODY_JOINT_RIGHT_ELBOW_HTC".."24",
        "BODY_JOINT_RIGHT_WRIST_HTC".."25"
    )

    EnumConstant(
        "BODY_JOINT_SET_FULL_HTC".."0"
    )

    EnumConstant(
        "BODY_JOINT_CONFIDENCE_NONE_HTC".."0",
        "BODY_JOINT_CONFIDENCE_LOW_HTC".."1",
        "BODY_JOINT_CONFIDENCE_HIGH_HTC".."2"
    )

    XrResult(
        "CreateBodyTrackerHTC",

        XrSession("session"),
        XrBodyTrackerCreateInfoHTC.const.p("createInfo"),
        Check(1)..XrBodyTrackerHTC.p("bodyTracker")
    )

    XrResult(
        "DestroyBodyTrackerHTC",

        XrBodyTrackerHTC("bodyTracker")
    )

    XrResult(
        "LocateBodyJointsHTC",

        XrBodyTrackerHTC("bodyTracker"),
        XrBodyJointsLocateInfoHTC.const.p("locateInfo"),
        XrBodyJointLocationsHTC.p("locations")
    )

    XrResult(
        "GetBodySkeletonHTC",

        XrBodyTrackerHTC("bodyTracker"),
        XrSpace("baseSpace"),
        uint32_t("skeletonGenerationId"),
        XrBodySkeletonHTC.p("skeleton")
    )
}