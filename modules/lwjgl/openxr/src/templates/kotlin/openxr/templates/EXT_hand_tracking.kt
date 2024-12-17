/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_hand_tracking = "EXTHandTracking".nativeClassXR("EXT_hand_tracking", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_hand_tracking_SPEC_VERSION".."4"
    )

    StringConstant(
        "EXT_HAND_TRACKING_EXTENSION_NAME".."XR_EXT_hand_tracking"
    )

    EnumConstant(
        "OBJECT_TYPE_HAND_TRACKER_EXT".."1000051000"
    )

    EnumConstant(
        "TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT".."1000051000",
        "TYPE_HAND_TRACKER_CREATE_INFO_EXT".."1000051001",
        "TYPE_HAND_JOINTS_LOCATE_INFO_EXT".."1000051002",
        "TYPE_HAND_JOINT_LOCATIONS_EXT".."1000051003",
        "TYPE_HAND_JOINT_VELOCITIES_EXT".."1000051004"
    )

    EnumConstant(
        "HAND_LEFT_EXT".."1",
        "HAND_RIGHT_EXT".."2"
    )

    EnumConstant(
        "HAND_JOINT_PALM_EXT".."0",
        "HAND_JOINT_WRIST_EXT".."1",
        "HAND_JOINT_THUMB_METACARPAL_EXT".."2",
        "HAND_JOINT_THUMB_PROXIMAL_EXT".."3",
        "HAND_JOINT_THUMB_DISTAL_EXT".."4",
        "HAND_JOINT_THUMB_TIP_EXT".."5",
        "HAND_JOINT_INDEX_METACARPAL_EXT".."6",
        "HAND_JOINT_INDEX_PROXIMAL_EXT".."7",
        "HAND_JOINT_INDEX_INTERMEDIATE_EXT".."8",
        "HAND_JOINT_INDEX_DISTAL_EXT".."9",
        "HAND_JOINT_INDEX_TIP_EXT".."10",
        "HAND_JOINT_MIDDLE_METACARPAL_EXT".."11",
        "HAND_JOINT_MIDDLE_PROXIMAL_EXT".."12",
        "HAND_JOINT_MIDDLE_INTERMEDIATE_EXT".."13",
        "HAND_JOINT_MIDDLE_DISTAL_EXT".."14",
        "HAND_JOINT_MIDDLE_TIP_EXT".."15",
        "HAND_JOINT_RING_METACARPAL_EXT".."16",
        "HAND_JOINT_RING_PROXIMAL_EXT".."17",
        "HAND_JOINT_RING_INTERMEDIATE_EXT".."18",
        "HAND_JOINT_RING_DISTAL_EXT".."19",
        "HAND_JOINT_RING_TIP_EXT".."20",
        "HAND_JOINT_LITTLE_METACARPAL_EXT".."21",
        "HAND_JOINT_LITTLE_PROXIMAL_EXT".."22",
        "HAND_JOINT_LITTLE_INTERMEDIATE_EXT".."23",
        "HAND_JOINT_LITTLE_DISTAL_EXT".."24",
        "HAND_JOINT_LITTLE_TIP_EXT".."25"
    )

    EnumConstant(
        "HAND_JOINT_SET_DEFAULT_EXT".."0"
    )

    XrResult(
        "CreateHandTrackerEXT",

        XrSession("session"),
        XrHandTrackerCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrHandTrackerEXT.p("handTracker")
    )

    XrResult(
        "DestroyHandTrackerEXT",

        XrHandTrackerEXT("handTracker")
    )

    XrResult(
        "LocateHandJointsEXT",

        XrHandTrackerEXT("handTracker"),
        XrHandJointsLocateInfoEXT.const.p("locateInfo"),
        XrHandJointLocationsEXT.p("locations")
    )
}