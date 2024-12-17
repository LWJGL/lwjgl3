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
    charASCII.const.p(
        "GetCameraErrorNameFromEnum",

        EVRTrackedCameraError("eCameraError")
    )

    EVRTrackedCameraError(
        "HasCamera",

        TrackedDeviceIndex_t("nDeviceIndex"),
        Check(1)..bool.p("pHasCamera")
    )

    EVRTrackedCameraError(
        "GetCameraFrameSize",

        TrackedDeviceIndex_t("nDeviceIndex"),
        EVRTrackedCameraFrameType("eFrameType"),
        Check(1)..uint32_t.p("pnWidth"),
        Check(1)..uint32_t.p("pnHeight"),
        Check(1)..uint32_t.p("pnFrameBufferSize")
    )

    EVRTrackedCameraError(
        "GetCameraIntrinsics",

        TrackedDeviceIndex_t("nDeviceIndex"),
        uint32_t("nCameraIndex"),
        EVRTrackedCameraFrameType("eFrameType"),
        Check(1)..HmdVector2_t.p("pFocalLength"),
        Check(1)..HmdVector2_t.p("pCenter")
    )

    EVRTrackedCameraError(
        "GetCameraProjection",

        TrackedDeviceIndex_t("nDeviceIndex"),
        uint32_t("nCameraIndex"),
        EVRTrackedCameraFrameType("eFrameType"),
        float("flZNear"),
        float("flZFar"),
        HmdMatrix44_t.p("pProjection")
    )

    EVRTrackedCameraError(
        "AcquireVideoStreamingService",

        TrackedDeviceIndex_t("nDeviceIndex"),
        Check(1)..TrackedCameraHandle_t.p("pHandle")
    )

    EVRTrackedCameraError(
        "ReleaseVideoStreamingService",

        TrackedCameraHandle_t("hTrackedCamera")
    )

    EVRTrackedCameraError(
        "GetVideoStreamFrameBuffer",

        TrackedCameraHandle_t("hTrackedCamera"),
        EVRTrackedCameraFrameType("eFrameType"),
        void.p("pFrameBuffer"),
        AutoSize("pFrameBuffer")..uint32_t("nFrameBufferSize"),
        CameraVideoStreamFrameHeader_t.p("pFrameHeader"),
        Expression("CameraVideoStreamFrameHeader.SIZEOF")..uint32_t("nFrameHeaderSize")
    )

    EVRTrackedCameraError(
        "GetVideoStreamTextureSize",

        TrackedDeviceIndex_t("nDeviceIndex"),
        EVRTrackedCameraFrameType("eFrameType"),
        VRTextureBounds_t.p("pTextureBounds"),
        Check(1)..uint32_t.p("pnWidth"),
        Check(1)..uint32_t.p("pnHeight")
    )

    EVRTrackedCameraError(
        "GetVideoStreamTextureD3D11",

        TrackedCameraHandle_t("hTrackedCamera"),
        EVRTrackedCameraFrameType("eFrameType"),
        opaque_p("pD3D11DeviceOrResource"),
        Check(1)..void.p.p("ppD3D11ShaderResourceView"),
        CameraVideoStreamFrameHeader_t.p("pFrameHeader"),
        Expression("CameraVideoStreamFrameHeader.SIZEOF")..uint32_t("nFrameHeaderSize")
    )

    EVRTrackedCameraError(
        "GetVideoStreamTextureGL",

        TrackedCameraHandle_t("hTrackedCamera"),
        EVRTrackedCameraFrameType("eFrameType"),
        Check(1)..glUInt_t.p("pglTextureId"),
        CameraVideoStreamFrameHeader_t.p("pFrameHeader"),
        Expression("CameraVideoStreamFrameHeader.SIZEOF")..uint32_t("nFrameHeaderSize")
    )

    EVRTrackedCameraError(
        "ReleaseVideoStreamTextureGL",

        TrackedCameraHandle_t("hTrackedCamera"),
        glUInt_t("glTextureId")
    )

    void(
        "SetCameraTrackingSpace",

        ETrackingUniverseOrigin("eUniverse")
    )

	ETrackingUniverseOrigin(
        "GetCameraTrackingSpace",

        void()
    )
}