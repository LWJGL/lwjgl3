/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*
import openxr.MSFT as MSFT_

val MSFT_hand_tracking_mesh = "MSFTHandTrackingMesh".nativeClassXR("MSFT_hand_tracking_mesh", type = "instance", postfix = MSFT_) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_hand_tracking_mesh_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MSFT_HAND_TRACKING_MESH_EXTENSION_NAME".."XR_MSFT_hand_tracking_mesh"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT".."1000052000",
        "TYPE_HAND_MESH_SPACE_CREATE_INFO_MSFT".."1000052001",
        "TYPE_HAND_MESH_UPDATE_INFO_MSFT".."1000052002",
        "TYPE_HAND_MESH_MSFT".."1000052003",
        "TYPE_HAND_POSE_TYPE_INFO_MSFT".."1000052004"
    )

    EnumConstant(
        "XrHandPoseTypeMSFT",

        "HAND_POSE_TYPE_TRACKED_MSFT".."0",
        "HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT".."1"
    )

    XrResult(
        "CreateHandMeshSpaceMSFT",
        "",

        XrHandTrackerEXT("handTracker", ""),
        XrHandMeshSpaceCreateInfoMSFT.const.p("createInfo", ""),
        Check(1)..XrSpace.p("space", "")
    )

    XrResult(
        "UpdateHandMeshMSFT",
        "",

        XrHandTrackerEXT("handTracker", ""),
        XrHandMeshUpdateInfoMSFT.const.p("updateInfo", ""),
        XrHandMeshMSFT.p("handMesh", "")
    )
}