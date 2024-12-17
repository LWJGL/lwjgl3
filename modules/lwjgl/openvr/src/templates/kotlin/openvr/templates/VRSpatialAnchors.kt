/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRSpatialAnchors = "VRSpatialAnchors".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRSpatialAnchors_",
    binding = OPENVR_FNTABLE_BINDING
) {
    EVRSpatialAnchorError(
        "CreateSpatialAnchorFromDescriptor",

        charASCII.const.p("pchDescriptor"),
        Check(1)..SpatialAnchorHandle_t.p("pHandleOut")
    )

    EVRSpatialAnchorError(
        "CreateSpatialAnchorFromPose",

        TrackedDeviceIndex_t("unDeviceIndex"),
        ETrackingUniverseOrigin("eOrigin"),
        SpatialAnchorPose_t.p("pPose"),
        Check(1)..SpatialAnchorHandle_t.p("pHandleOut")
    )

    EVRSpatialAnchorError(
        "GetSpatialAnchorPose",

        SpatialAnchorHandle_t("unHandle"),
        ETrackingUniverseOrigin("eOrigin"),
        SpatialAnchorPose_t.p("pPoseOut")
    )

    EVRSpatialAnchorError(
        "GetSpatialAnchorDescriptor",

        SpatialAnchorHandle_t("unHandle"),
        charASCII.p("pchDescriptorOut"),
        AutoSize("pchDescriptorOut")..Check(1)..uint32_t.p("punDescriptorBufferLenInOut")
    )
}