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
    documentation =
        """
        """

    EVRSpatialAnchorError(
        "CreateSpatialAnchorFromDescriptor",
        """
        Returns a handle for an spatial anchor described by "descriptor".  On success, {@code pHandle} will contain a handle valid for this session. Caller can
        wait for an event or occasionally poll #GetSpatialAnchorPose() to find the virtual coordinate associated with this anchor.
        """,

        charASCII.const.p("pchDescriptor", ""),
        Check(1)..SpatialAnchorHandle_t.p("pHandleOut", "")
    )

    EVRSpatialAnchorError(
        "CreateSpatialAnchorFromPose",
        """
        Returns a handle for an new spatial anchor at {@code pPose}.

        On success, {@code pHandle} will contain a handle valid for this session. Caller can wait for an event or occasionally poll
        #GetSpatialAnchorDescriptor() to find the permanent descriptor for this pose. The result of #GetSpatialAnchorPose() may evolve from this initial
        position if the driver chooses to update it. The anchor will be associated with the driver that provides {@code unDeviceIndex}, and the driver may use
        that specific device as a hint for how to best create the anchor. The {@code eOrigin} must match whatever tracking origin you are working in
        (seated/standing/raw).

        This should be called when the user is close to (and ideally looking at/interacting with) the target physical location. At that moment, the driver will
        have the most information about how to recover that physical point in the future, and the quality of the anchor (when the descriptor is re-used) will
        be highest. The caller may decide to apply offsets from this initial pose, but is advised to stay relatively close to the original pose location for
        highest fidelity.
        """,

        TrackedDeviceIndex_t("unDeviceIndex", ""),
        ETrackingUniverseOrigin("eOrigin", ""),
        SpatialAnchorPose_t.p("pPose", ""),
        Check(1)..SpatialAnchorHandle_t.p("pHandleOut", "")
    )

    EVRSpatialAnchorError(
        "GetSpatialAnchorPose",
        """
        Get the pose for a given handle.

        This is intended to be cheap enough to call every frame (or fairly often) so that the driver can refine this position when it has more information
        available.
        """,

        SpatialAnchorHandle_t("unHandle", ""),
        ETrackingUniverseOrigin("eOrigin", ""),
        SpatialAnchorPose_t.p("pPoseOut", "")
    )

    EVRSpatialAnchorError(
        "GetSpatialAnchorDescriptor",
        """
        Get the descriptor for a given handle.

        This will be empty for handles where the driver has not yet built a descriptor. It will be the application-supplied descriptor for previously saved
        anchors that the application is requesting poses for.  If the driver has called {@code UpdateSpatialAnchorDescriptor()} already in this session, it
        will be the descriptor provided by the driver.
        """,

        SpatialAnchorHandle_t("unHandle", ""),
        charASCII.p("pchDescriptorOut", ""),
        AutoSize("pchDescriptorOut")..Check(1)..uint32_t.p("punDescriptorBufferLenInOut", ""),

        returnDoc = "true if the descriptor fits into the buffer, else false. Buffer size should be at least {@code k_unMaxSpatialAnchorDescriptorSize}"
    )
}