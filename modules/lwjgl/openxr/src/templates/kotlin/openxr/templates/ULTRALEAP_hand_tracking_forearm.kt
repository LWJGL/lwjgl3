/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ULTRALEAP_hand_tracking_forearm = "ULTRALEAPHandTrackingForearm".nativeClassXR("ULTRALEAP_hand_tracking_forearm", type = "instance", postfix = "ULTRALEAP") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_ULTRALEAP_hand_tracking_forearm">XR_ULTRALEAP_hand_tracking_forearm</a> extension.

        This extension augments the {@link EXTHandTracking XR_EXT_hand_tracking} extension to enable applications to request the default set of 26 hand joints, with the addition a joint representing the user’s elbow.

        The application <b>must</b> also enable the {@link EXTHandTracking XR_EXT_hand_tracking} extension in order to use this extension.
        """

    IntConstant(
        "The extension specification version.",

        "ULTRALEAP_hand_tracking_forearm_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ULTRALEAP_HAND_TRACKING_FOREARM_EXTENSION_NAME".."XR_ULTRALEAP_hand_tracking_forearm"
    )

    EnumConstant(
        "Extends {@code XrHandJointSetEXT}.",

        "HAND_JOINT_SET_HAND_WITH_FOREARM_ULTRALEAP".."1000149000"
    )

    EnumConstant(
        """
        XrHandForearmJointULTRALEAP - The name of hand joints that can be tracked including the elbow

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The first #HAND_JOINT_COUNT_EXT members of {@code XrHandForearmJointULTRALEAP} are identical to the members of {@code XrHandJointEXT} and <b>can</b> be used interchangeably.
        </div>
        """,

        "HAND_FOREARM_JOINT_PALM_ULTRALEAP".."0",
        "HAND_FOREARM_JOINT_WRIST_ULTRALEAP".."1",
        "HAND_FOREARM_JOINT_THUMB_METACARPAL_ULTRALEAP".."2",
        "HAND_FOREARM_JOINT_THUMB_PROXIMAL_ULTRALEAP".."3",
        "HAND_FOREARM_JOINT_THUMB_DISTAL_ULTRALEAP".."4",
        "HAND_FOREARM_JOINT_THUMB_TIP_ULTRALEAP".."5",
        "HAND_FOREARM_JOINT_INDEX_METACARPAL_ULTRALEAP".."6",
        "HAND_FOREARM_JOINT_INDEX_PROXIMAL_ULTRALEAP".."7",
        "HAND_FOREARM_JOINT_INDEX_INTERMEDIATE_ULTRALEAP".."8",
        "HAND_FOREARM_JOINT_INDEX_DISTAL_ULTRALEAP".."9",
        "HAND_FOREARM_JOINT_INDEX_TIP_ULTRALEAP".."10",
        "HAND_FOREARM_JOINT_MIDDLE_METACARPAL_ULTRALEAP".."11",
        "HAND_FOREARM_JOINT_MIDDLE_PROXIMAL_ULTRALEAP".."12",
        "HAND_FOREARM_JOINT_MIDDLE_INTERMEDIATE_ULTRALEAP".."13",
        "HAND_FOREARM_JOINT_MIDDLE_DISTAL_ULTRALEAP".."14",
        "HAND_FOREARM_JOINT_MIDDLE_TIP_ULTRALEAP".."15",
        "HAND_FOREARM_JOINT_RING_METACARPAL_ULTRALEAP".."16",
        "HAND_FOREARM_JOINT_RING_PROXIMAL_ULTRALEAP".."17",
        "HAND_FOREARM_JOINT_RING_INTERMEDIATE_ULTRALEAP".."18",
        "HAND_FOREARM_JOINT_RING_DISTAL_ULTRALEAP".."19",
        "HAND_FOREARM_JOINT_RING_TIP_ULTRALEAP".."20",
        "HAND_FOREARM_JOINT_LITTLE_METACARPAL_ULTRALEAP".."21",
        "HAND_FOREARM_JOINT_LITTLE_PROXIMAL_ULTRALEAP".."22",
        "HAND_FOREARM_JOINT_LITTLE_INTERMEDIATE_ULTRALEAP".."23",
        "HAND_FOREARM_JOINT_LITTLE_DISTAL_ULTRALEAP".."24",
        "HAND_FOREARM_JOINT_LITTLE_TIP_ULTRALEAP".."25",
        "HAND_FOREARM_JOINT_ELBOW_ULTRALEAP".."26"
    )
}