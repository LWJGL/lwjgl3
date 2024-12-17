/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_hand_tracking_mesh = "FBHandTrackingMesh".nativeClassXR("FB_hand_tracking_mesh", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_hand_tracking_mesh_SPEC_VERSION".."3"
    )

    StringConstant(
        "FB_HAND_TRACKING_MESH_EXTENSION_NAME".."XR_FB_hand_tracking_mesh"
    )

    EnumConstant(
        "TYPE_HAND_TRACKING_MESH_FB".."1000110001",
        "TYPE_HAND_TRACKING_SCALE_FB".."1000110003"
    )

    XrResult(
        "GetHandMeshFB",

        XrHandTrackerEXT("handTracker"),
        XrHandTrackingMeshFB.p("mesh")
    )
}