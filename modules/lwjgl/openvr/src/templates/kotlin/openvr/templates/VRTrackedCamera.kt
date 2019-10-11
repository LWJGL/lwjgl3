/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRTrackedCamera = "VRTrackedCamera".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRTrackedCamera_",
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    charASCII.const.p(
        "GetCameraErrorNameFromEnum",
        "Returns a string for an error.",

        EVRTrackedCameraError("eCameraError", "", "EVRTrackedCameraError_\\w+")
    )

    EVRTrackedCameraError(
        "HasCamera",
        "For convenience, same as tracked property request #ETrackedDeviceProperty_Prop_HasCamera_Bool.",

        TrackedDeviceIndex_t("nDeviceIndex", ""),
        Check(1)..bool.p("pHasCamera", "")
    )

    EVRTrackedCameraError(
        "GetCameraFrameSize",
        "Gets size of the image frame.",

        TrackedDeviceIndex_t("nDeviceIndex", ""),
        EVRTrackedCameraFrameType("eFrameType", "", "EVRTrackedCameraFrameType_\\w+"),
        Check(1)..uint32_t.p("pnWidth", ""),
        Check(1)..uint32_t.p("pnHeight", ""),
        Check(1)..uint32_t.p("pnFrameBufferSize", "")
    )

    EVRTrackedCameraError(
        "GetCameraIntrinsics",
        "",

        TrackedDeviceIndex_t("nDeviceIndex", ""),
        uint32_t("nCameraIndex", ""),
        EVRTrackedCameraFrameType("eFrameType", "", "EVRTrackedCameraFrameType_\\w+"),
        Check(1)..HmdVector2_t.p("pFocalLength", ""),
        Check(1)..HmdVector2_t.p("pCenter", "")
    )

    EVRTrackedCameraError(
        "GetCameraProjection",
        "",

        TrackedDeviceIndex_t("nDeviceIndex", ""),
        uint32_t("nCameraIndex", ""),
        EVRTrackedCameraFrameType("eFrameType", "", "EVRTrackedCameraFrameType_\\w+"),
        float("flZNear", ""),
        float("flZFar", ""),
        HmdMatrix44_t.p("pProjection", "")
    )

    EVRTrackedCameraError(
        "AcquireVideoStreamingService",
        """
        Acquiring streaming service permits video streaming for the caller. Releasing hints the system that video services do not need to be maintained for
        this client. If the camera has not already been activated, a one time spin up may incur some auto exposure as well as initial streaming frame delays.
        The camera should be considered a global resource accessible for shared consumption but not exclusive to any caller. The camera may go inactive due to
        lack of active consumers or headset idleness.
        """,

        TrackedDeviceIndex_t("nDeviceIndex", ""),
        Check(1)..TrackedCameraHandle_t.p("pHandle", "")
    )

    EVRTrackedCameraError(
        "ReleaseVideoStreamingService",
        "",

        TrackedCameraHandle_t("hTrackedCamera", "")
    )

    EVRTrackedCameraError(
        "GetVideoStreamFrameBuffer",
        """
        Copies the image frame into a caller's provided buffer. The image data is currently provided as RGBA data, 4 bytes per pixel. A caller can provide null
        for the framebuffer or frameheader if not desired. Requesting the frame header first, followed by the frame buffer allows the caller to determine if
        the frame as advanced per the frame header sequence. If there is no frame available yet, due to initial camera spinup or re-activation, the error will
        be #EVRTrackedCameraError_VRTrackedCameraError_NoFrameAvailable. Ideally a caller should be polling at ~16ms intervals.
        """,

        TrackedCameraHandle_t("hTrackedCamera", ""),
        EVRTrackedCameraFrameType("eFrameType", "", "EVRTrackedCameraFrameType_\\w+"),
        void.p("pFrameBuffer", ""),
        AutoSize("pFrameBuffer")..uint32_t("nFrameBufferSize", ""),
        CameraVideoStreamFrameHeader_t.p("pFrameHeader", ""),
        Expression("CameraVideoStreamFrameHeader.SIZEOF")..uint32_t("nFrameHeaderSize", "")
    )

    EVRTrackedCameraError(
        "GetVideoStreamTextureSize",
        "Gets size of the image frame.",

        TrackedDeviceIndex_t("nDeviceIndex", ""),
        EVRTrackedCameraFrameType("eFrameType", "", "EVRTrackedCameraFrameType_\\w+"),
        VRTextureBounds_t.p("pTextureBounds", ""),
        Check(1)..uint32_t.p("pnWidth", ""),
        Check(1)..uint32_t.p("pnHeight", "")
    )

    EVRTrackedCameraError(
        "GetVideoStreamTextureD3D11",
        """
        Access a shared D3D11 texture for the specified tracked camera stream.

        The camera frame type #EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted is not supported directly as a shared texture. It is an interior
        subregion of the shared texture #EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted. Instead, use #GetVideoStreamTextureSize() with
        {@code VRTrackedCameraFrameType_Undistorted} to determine the proper interior subregion bounds along with
        {@code GetVideoStreamTextureD3D11()} with {@code VRTrackedCameraFrameType_MaximumUndistorted} to provide the texture. The
        {@code VRTrackedCameraFrameType_MaximumUndistorted} will yield an image where the invalid regions are decoded by the alpha channel having a zero
        component. The valid regions all have a non-zero alpha component. The subregion as described by {@code VRTrackedCameraFrameType_Undistorted} guarantees
        a rectangle where all pixels are valid.
        """,

        TrackedCameraHandle_t("hTrackedCamera", ""),
        EVRTrackedCameraFrameType("eFrameType", "", "EVRTrackedCameraFrameType_\\w+"),
        opaque_p("pD3D11DeviceOrResource", ""),
        Check(1)..void.p.p("ppD3D11ShaderResourceView", ""),
        CameraVideoStreamFrameHeader_t.p("pFrameHeader", ""),
        Expression("CameraVideoStreamFrameHeader.SIZEOF")..uint32_t("nFrameHeaderSize", "")
    )

    EVRTrackedCameraError(
        "GetVideoStreamTextureGL",
        "Access a shared GL texture for the specified tracked camera stream.",

        TrackedCameraHandle_t("hTrackedCamera", ""),
        EVRTrackedCameraFrameType("eFrameType", "", "EVRTrackedCameraFrameType_\\w+"),
        Check(1)..glUInt_t.p("pglTextureId", ""),
        CameraVideoStreamFrameHeader_t.p("pFrameHeader", ""),
        Expression("CameraVideoStreamFrameHeader.SIZEOF")..uint32_t("nFrameHeaderSize", "")
    )

    EVRTrackedCameraError(
        "ReleaseVideoStreamTextureGL",
        "",

        TrackedCameraHandle_t("hTrackedCamera", ""),
        glUInt_t("glTextureId", "")
    )

    void(
        "SetCameraTrackingSpace",
        "",

        ETrackingUniverseOrigin("eUniverse", "", "ETrackingUniverseOrigin_\\w+")
    )

	ETrackingUniverseOrigin(
        "GetCameraTrackingSpace",
        "",

        void()
    )
}