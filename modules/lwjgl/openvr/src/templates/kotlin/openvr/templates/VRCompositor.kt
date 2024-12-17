/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRCompositor = "VRCompositor".nativeClass(
    Module.OPENVR,
    prefix = "VRCompositor_",
    prefixMethod = "VRCompositor_",
    binding = OPENVR_FNTABLE_BINDING
) {
    nativeDirective("""
#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

typedef struct HmdColor_t
{
    float r;
    float g;
    float b;
    float a;
} HmdColor_t;""")

/*
/** Compositor frame timing reprojection flags. */
const uint32_t VRCompositor_ReprojectionReason_Cpu = 0x01;
const uint32_t VRCompositor_ReprojectionReason_Gpu = 0x02;
const uint32_t VRCompositor_ReprojectionAsync = 0x04;		// This flag indicates the async reprojection mode is active,
															// but does not indicate if reprojection actually happened or not.
															// Use the ReprojectionReason flags above to check if reprojection
															// was actually applied (i.e. scene texture was reused).
															// NumFramePresents > 1 also indicates the scene texture was reused,
															// and also the number of times that it was presented in total.

const uint32_t VRCompositor_ReprojectionMotion = 0x08;		// This flag indicates whether or not motion smoothing was triggered for this frame

const uint32_t VRCompositor_PredictionMask = 0xF0;			// The runtime may predict more than one frame ahead if
															// it detects the application is taking too long to render. These
															// bits will contain the count of additional frames (normally zero).
															// Use the VR_COMPOSITOR_ADDITIONAL_PREDICTED_FRAMES macro to read from
															// the latest frame timing entry.

const uint32_t VRCompositor_ThrottleMask = 0xF00;			// Number of frames the compositor is throttling the application.
															// Use the VR_COMPOSITOR_NUMBER_OF_THROTTLED_FRAMES macro to read from
															// the latest frame timing entry.


 */

    EnumConstant(
        "ReprojectionReason_Cpu".enum("0x01"),
        "ReprojectionReason_Gpu".enum("0x02"),
        "ReprojectionAsync".enum("0x04"),
        "ReprojectionMotion".enum("0x08"),
        "PredictionMask".enum("0xF0"),
        "ThrottleMask".enum("0xF00")
    )

    customMethod("""
    public static int VR_COMPOSITOR_ADDITIONAL_PREDICTED_FRAMES(CompositorFrameTiming timing) {
        return (timing.m_nReprojectionFlags() & VRCompositor_PredictionMask) >> 4;
    }

    public static int VR_COMPOSITOR_NUMBER_OF_THROTTLED_FRAMES(CompositorFrameTiming timing) {
        return (timing.m_nReprojectionFlags() & VRCompositor_ThrottleMask) >> 6;
    }""")

    void(
        "SetTrackingSpace",

        ETrackingUniverseOrigin("eOrigin")
    )

    ETrackingUniverseOrigin(
        "GetTrackingSpace",
        void()
    )

    EVRCompositorError(
        "WaitGetPoses",

        TrackedDevicePose_t.p("pRenderPoseArray"),
        AutoSize("pRenderPoseArray")..uint32_t("unRenderPoseArrayCount"),
        nullable..TrackedDevicePose_t.p("pGamePoseArray"),
        AutoSize("pGamePoseArray")..uint32_t("unGamePoseArrayCount")
    )

    EVRCompositorError(
        "GetLastPoses",

        TrackedDevicePose_t.p("pRenderPoseArray"),
        AutoSize("pRenderPoseArray")..uint32_t("unRenderPoseArrayCount"),
        TrackedDevicePose_t.p("pGamePoseArray"),
        AutoSize("pGamePoseArray")..uint32_t("unGamePoseArrayCount")
    )

    EVRCompositorError(
        "GetLastPoseForTrackedDeviceIndex",

        TrackedDeviceIndex_t("unDeviceIndex"),
        nullable..TrackedDevicePose_t.p("pOutputPose"),
        nullable..TrackedDevicePose_t.p("pOutputGamePose")
    )

    EVRCompositorError(
        "Submit",

        EVREye("eEye"),
        Texture_t.const.p("pTexture"),
        nullable..VRTextureBounds_t.const.p("pBounds"),
        EVRSubmitFlags("nSubmitFlags")
    )

    EVRCompositorError(
        "SubmitWithArrayIndex",

        EVREye("eEye"),
        Texture_t.const.p("pTexture"),
        uint32_t("unTextureArrayIndex"),
        nullable..VRTextureBounds_t.const.p("pBounds"),
        EVRSubmitFlags("nSubmitFlags"),
    )

    void("ClearLastSubmittedFrame")

    void("PostPresentHandoff")

    bool(
        "GetFrameTiming",

        Compositor_FrameTiming.p("pTiming"),
        AutoSize("pTiming")..uint32_t("unFramesAgo")
    )

    uint32_t(
        "GetFrameTimings",

        Compositor_FrameTiming.p("pTiming"),
        AutoSize("pTiming")..uint32_t("nFrames")
    )

    float(
        "GetFrameTimeRemaining",
        void()
    )

    void(
        "GetCumulativeStats",

        Compositor_CumulativeStats.p("pStats"),
        Expression("CompositorCumulativeStats.SIZEOF")..uint32_t("nStatsSizeInBytes")
    )

    void(
        "FadeToColor",

        float("fSeconds"),
        float("fRed"),
        float("fGreen"),
        float("fBlue"),
        float("fAlpha"),
        bool("bBackground")
    )

    HmdColor_t(
        "GetCurrentFadeColor",

        bool("bBackground")
    )

    void(
        "FadeGrid",

        float("fSeconds"),
        bool("bFadeGridIn")
    )

    float(
        "GetCurrentGridAlpha",
        void()
    )

    EVRCompositorError(
        "SetSkyboxOverride",

        Texture_t.const.p("pTextures"),
        AutoSize("pTextures")..uint32_t("unTextureCount")
    )

    void("ClearSkyboxOverride")

    void("CompositorBringToFront")

    void("CompositorGoToBack")

    void("CompositorQuit")

    bool(
        "IsFullscreen",
        void()
    )

    uint32_t(
        "GetCurrentSceneFocusProcess",
        void()
    )

    uint32_t(
        "GetLastFrameRenderer",
        void()
    )

    bool(
        "CanRenderScene",
        void()
    )

    void(
        "ShowMirrorWindow",
        void()
    )

    void(
        "HideMirrorWindow",
        void()
    )

    bool(
        "IsMirrorWindowVisible",
        void()
    )

    void(
        "CompositorDumpImages",
        void()
    )

    bool(
        "ShouldAppRenderWithLowResources",
        void()
    )

    void(
        "ForceInterleavedReprojectionOn",

        bool("bOverride")
    )

    void(
        "ForceReconnectProcess",
        void()
    )

    void(
        "SuspendRendering",

        bool("bSuspend")
    )

    EVRCompositorError(
        "GetMirrorTextureD3D11",

        EVREye("eEye"),
        opaque_p("pD3D11DeviceOrResource"),
        Check(1)..void.p.p("ppD3D11ShaderResourceView")
    )

    void(
        "ReleaseMirrorTextureD3D11",

        opaque_p("pD3D11ShaderResourceView")
    )

    EVRCompositorError(
        "GetMirrorTextureGL",

        EVREye("eEye"),
        Check(1)..glUInt_t.p("pglTextureId"),
        Check(1)..glSharedTextureHandle_t.p("pglSharedTextureHandle")
    )

    bool(
        "ReleaseSharedGLTexture",

        glUInt_t("glTextureId"),
        glSharedTextureHandle_t("glSharedTextureHandle")
    )

    void(
        "LockGLSharedTextureForAccess",

        glSharedTextureHandle_t("glSharedTextureHandle")
    )

    void(
        "UnlockGLSharedTextureForAccess",

        glSharedTextureHandle_t("glSharedTextureHandle")
    )

    uint32_t(
        "GetVulkanInstanceExtensionsRequired",

        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchValue"),
        AutoSize("pchValue")..uint32_t("unBufferSize")
    )

    uint32_t(
        "GetVulkanDeviceExtensionsRequired",

        VkPhysicalDevice_T.p("pPhysicalDevice"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchValue"),
        AutoSize("pchValue")..uint32_t("unBufferSize")
    )

    void(
        "SetExplicitTimingMode",

        EVRCompositorTimingMode("eTimingMode")
    )

    EVRCompositorError(
        "SubmitExplicitTimingData",

        void()
    )

    bool(
        "IsMotionSmoothingEnabled",

        void()
    )

    bool(
        "IsMotionSmoothingSupported",

        void()
    )

    bool(
        "IsCurrentSceneFocusAppLoading",

        void()
    )

    EVRCompositorError(
        "SetStageOverride_Async",

        charASCII.const.p("pchRenderModelPath"),
        HmdMatrix34_t.const.p("pTransform"),
        Compositor_StageRenderSettings.const.p("pRenderSettings"),
        Expression("CompositorStageRenderSettings.SIZEOF")..uint32_t("nSizeOfRenderSettings")
    )

    void(
        "ClearStageOverride",

        void()
    )

    bool(
        "GetCompositorBenchmarkResults",

        Compositor_BenchmarkResults.p("pBenchmarkResults"),
        AutoSize("pBenchmarkResults")..uint32_t("nSizeOfBenchmarkResults")
    )

    EVRCompositorError(
        "GetLastPosePredictionIDs",

        Check(1)..uint32_t.p("pRenderPosePredictionID"),
        Check(1)..uint32_t.p("pGamePosePredictionID")
    )

    EVRCompositorError(
        "GetPosesForFrame",

        uint32_t("unPosePredictionID"),
        TrackedDevicePose_t.p("pPoseArray"),
        AutoSize("pPoseArray")..uint32_t("unPoseArrayCount")
    )
}