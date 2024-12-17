/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_body_tracking = "FBBodyTracking".nativeClassXR("FB_body_tracking", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_body_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_BODY_TRACKING_EXTENSION_NAME".."XR_FB_body_tracking"
    )

    EnumConstant(
        "OBJECT_TYPE_BODY_TRACKER_FB".."1000076000"
    )

    EnumConstant(
        "TYPE_BODY_TRACKER_CREATE_INFO_FB".."1000076001",
        "TYPE_BODY_JOINTS_LOCATE_INFO_FB".."1000076002",
        "TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB".."1000076004",
        "TYPE_BODY_JOINT_LOCATIONS_FB".."1000076005",
        "TYPE_BODY_SKELETON_FB".."1000076006"
    )

    EnumConstant(
        "BODY_JOINT_ROOT_FB".."0",
        "BODY_JOINT_HIPS_FB".."1",
        "BODY_JOINT_SPINE_LOWER_FB".."2",
        "BODY_JOINT_SPINE_MIDDLE_FB".."3",
        "BODY_JOINT_SPINE_UPPER_FB".."4",
        "BODY_JOINT_CHEST_FB".."5",
        "BODY_JOINT_NECK_FB".."6",
        "BODY_JOINT_HEAD_FB".."7",
        "BODY_JOINT_LEFT_SHOULDER_FB".."8",
        "BODY_JOINT_LEFT_SCAPULA_FB".."9",
        "BODY_JOINT_LEFT_ARM_UPPER_FB".."10",
        "BODY_JOINT_LEFT_ARM_LOWER_FB".."11",
        "BODY_JOINT_LEFT_HAND_WRIST_TWIST_FB".."12",
        "BODY_JOINT_RIGHT_SHOULDER_FB".."13",
        "BODY_JOINT_RIGHT_SCAPULA_FB".."14",
        "BODY_JOINT_RIGHT_ARM_UPPER_FB".."15",
        "BODY_JOINT_RIGHT_ARM_LOWER_FB".."16",
        "BODY_JOINT_RIGHT_HAND_WRIST_TWIST_FB".."17",
        "BODY_JOINT_LEFT_HAND_PALM_FB".."18",
        "BODY_JOINT_LEFT_HAND_WRIST_FB".."19",
        "BODY_JOINT_LEFT_HAND_THUMB_METACARPAL_FB".."20",
        "BODY_JOINT_LEFT_HAND_THUMB_PROXIMAL_FB".."21",
        "BODY_JOINT_LEFT_HAND_THUMB_DISTAL_FB".."22",
        "BODY_JOINT_LEFT_HAND_THUMB_TIP_FB".."23",
        "BODY_JOINT_LEFT_HAND_INDEX_METACARPAL_FB".."24",
        "BODY_JOINT_LEFT_HAND_INDEX_PROXIMAL_FB".."25",
        "BODY_JOINT_LEFT_HAND_INDEX_INTERMEDIATE_FB".."26",
        "BODY_JOINT_LEFT_HAND_INDEX_DISTAL_FB".."27",
        "BODY_JOINT_LEFT_HAND_INDEX_TIP_FB".."28",
        "BODY_JOINT_LEFT_HAND_MIDDLE_METACARPAL_FB".."29",
        "BODY_JOINT_LEFT_HAND_MIDDLE_PROXIMAL_FB".."30",
        "BODY_JOINT_LEFT_HAND_MIDDLE_INTERMEDIATE_FB".."31",
        "BODY_JOINT_LEFT_HAND_MIDDLE_DISTAL_FB".."32",
        "BODY_JOINT_LEFT_HAND_MIDDLE_TIP_FB".."33",
        "BODY_JOINT_LEFT_HAND_RING_METACARPAL_FB".."34",
        "BODY_JOINT_LEFT_HAND_RING_PROXIMAL_FB".."35",
        "BODY_JOINT_LEFT_HAND_RING_INTERMEDIATE_FB".."36",
        "BODY_JOINT_LEFT_HAND_RING_DISTAL_FB".."37",
        "BODY_JOINT_LEFT_HAND_RING_TIP_FB".."38",
        "BODY_JOINT_LEFT_HAND_LITTLE_METACARPAL_FB".."39",
        "BODY_JOINT_LEFT_HAND_LITTLE_PROXIMAL_FB".."40",
        "BODY_JOINT_LEFT_HAND_LITTLE_INTERMEDIATE_FB".."41",
        "BODY_JOINT_LEFT_HAND_LITTLE_DISTAL_FB".."42",
        "BODY_JOINT_LEFT_HAND_LITTLE_TIP_FB".."43",
        "BODY_JOINT_RIGHT_HAND_PALM_FB".."44",
        "BODY_JOINT_RIGHT_HAND_WRIST_FB".."45",
        "BODY_JOINT_RIGHT_HAND_THUMB_METACARPAL_FB".."46",
        "BODY_JOINT_RIGHT_HAND_THUMB_PROXIMAL_FB".."47",
        "BODY_JOINT_RIGHT_HAND_THUMB_DISTAL_FB".."48",
        "BODY_JOINT_RIGHT_HAND_THUMB_TIP_FB".."49",
        "BODY_JOINT_RIGHT_HAND_INDEX_METACARPAL_FB".."50",
        "BODY_JOINT_RIGHT_HAND_INDEX_PROXIMAL_FB".."51",
        "BODY_JOINT_RIGHT_HAND_INDEX_INTERMEDIATE_FB".."52",
        "BODY_JOINT_RIGHT_HAND_INDEX_DISTAL_FB".."53",
        "BODY_JOINT_RIGHT_HAND_INDEX_TIP_FB".."54",
        "BODY_JOINT_RIGHT_HAND_MIDDLE_METACARPAL_FB".."55",
        "BODY_JOINT_RIGHT_HAND_MIDDLE_PROXIMAL_FB".."56",
        "BODY_JOINT_RIGHT_HAND_MIDDLE_INTERMEDIATE_FB".."57",
        "BODY_JOINT_RIGHT_HAND_MIDDLE_DISTAL_FB".."58",
        "BODY_JOINT_RIGHT_HAND_MIDDLE_TIP_FB".."59",
        "BODY_JOINT_RIGHT_HAND_RING_METACARPAL_FB".."60",
        "BODY_JOINT_RIGHT_HAND_RING_PROXIMAL_FB".."61",
        "BODY_JOINT_RIGHT_HAND_RING_INTERMEDIATE_FB".."62",
        "BODY_JOINT_RIGHT_HAND_RING_DISTAL_FB".."63",
        "BODY_JOINT_RIGHT_HAND_RING_TIP_FB".."64",
        "BODY_JOINT_RIGHT_HAND_LITTLE_METACARPAL_FB".."65",
        "BODY_JOINT_RIGHT_HAND_LITTLE_PROXIMAL_FB".."66",
        "BODY_JOINT_RIGHT_HAND_LITTLE_INTERMEDIATE_FB".."67",
        "BODY_JOINT_RIGHT_HAND_LITTLE_DISTAL_FB".."68",
        "BODY_JOINT_RIGHT_HAND_LITTLE_TIP_FB".."69",
        "BODY_JOINT_COUNT_FB".."70",
        "BODY_JOINT_NONE_FB".."-1"
    )

    EnumConstant(
        "BODY_JOINT_SET_DEFAULT_FB".."0"
    )

    XrResult(
        "CreateBodyTrackerFB",

        XrSession("session"),
        XrBodyTrackerCreateInfoFB.const.p("createInfo"),
        Check(1)..XrBodyTrackerFB.p("bodyTracker")
    )

    XrResult(
        "DestroyBodyTrackerFB",

        XrBodyTrackerFB("bodyTracker")
    )

    XrResult(
        "LocateBodyJointsFB",

        XrBodyTrackerFB("bodyTracker"),
        XrBodyJointsLocateInfoFB.const.p("locateInfo"),
        XrBodyJointLocationsFB.p("locations")
    )

    XrResult(
        "GetBodySkeletonFB",

        XrBodyTrackerFB("bodyTracker"),
        XrBodySkeletonFB.p("skeleton")
    )
}