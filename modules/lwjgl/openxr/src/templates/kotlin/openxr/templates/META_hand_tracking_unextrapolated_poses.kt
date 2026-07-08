/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_hand_tracking_unextrapolated_poses = "METAHandTrackingUnextrapolatedPoses".nativeClassXR("META_hand_tracking_unextrapolated_poses", type = "instance", postfix = "META") {
    IntConstant(
        "META_hand_tracking_unextrapolated_poses_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_HAND_TRACKING_UNEXTRAPOLATED_POSES_EXTENSION_NAME".."XR_META_hand_tracking_unextrapolated_poses"
    )

    EnumConstant(
        "TYPE_HAND_TRACKING_UNEXTRAPOLATED_POSES_REQUEST_META".."1000683000",
        "TYPE_HAND_TRACKING_UNEXTRAPOLATED_POSES_META".."1000683001"
    )
}