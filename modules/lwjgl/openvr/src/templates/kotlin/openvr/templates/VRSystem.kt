/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRSystem = "VRSystem".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRSystem_",
    binding = OPENVR_FNTABLE_BINDING
) {
    nativeImport("<stdint.h>")
    nativeDirective("""
#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

typedef struct HmdMatrix34_t
{
    float m[3][4];
} HmdMatrix34_t;

typedef struct HmdMatrix44_t
{
    float m[4][4];
} HmdMatrix44_t;

typedef struct HmdVector2_t
{
    float v[2];
} HmdVector2_t;

typedef struct HmdColor_t
{
    float r;
    float g;
    float b;
    float a;
} HmdColor_t;

typedef struct HiddenAreaMesh_t
{
    struct HmdVector2_t * pVertexData;
    uint32_t unTriangleCount;
    #ifdef LWJGL_x64
        char __padding[4];
    #endif
} HiddenAreaMesh_t;""")

    void(
        "GetRecommendedRenderTargetSize",

        Check(1)..uint32_t.p("pnWidth"),
        Check(1)..uint32_t.p("pnHeight")
    )

    HmdMatrix44_t(
        "GetProjectionMatrix",

        EVREye("eEye"),
        float("fNearZ"),
        float("fFarZ")
    )

    void(
        "GetProjectionRaw",

        EVREye("eEye"),
        Check(1)..float.p("pfLeft"),
        Check(1)..float.p("pfRight"),
        Check(1)..float.p("pfTop"),
        Check(1)..float.p("pfBottom")
    )

    bool(
        "ComputeDistortion",

        EVREye("eEye"),
        float("fU"),
        float("fV"),
        DistortionCoordinates_t.p("pDistortionCoordinates")
    )

    HmdMatrix34_t(
        "GetEyeToHeadTransform",

        EVREye("eEye")
    )

    bool(
        "GetTimeSinceLastVsync",

        Check(1)..float.p("pfSecondsSinceLastVsync"),
        Check(1)..uint64_t.p("pulFrameCounter")
    )

    int32_t(
        "GetD3D9AdapterIndex",
        void()
    )

    void(
        "GetDXGIOutputInfo",

        Check(1)..int32_t.p("pnAdapterIndex")
    )

    void(
        "GetOutputDevice",

        Check(1)..uint64_t.p("pnDevice"),
        ETextureType("textureType"),
        VkInstance_T.p("pInstance")
    )

    bool(
        "IsDisplayOnDesktop",
        void()
    )

    bool(
        "SetDisplayVisibility",

        bool("bIsVisibleOnDesktop")
    )

    void(
        "GetDeviceToAbsoluteTrackingPose",

        ETrackingUniverseOrigin("eOrigin"),
        float("fPredictedSecondsToPhotonsFromNow"),
        TrackedDevicePose_t.p("pTrackedDevicePoseArray"),
        AutoSize("pTrackedDevicePoseArray")..uint32_t("unTrackedDevicePoseArrayCount")
    )

    HmdMatrix34_t(
        "GetSeatedZeroPoseToStandingAbsoluteTrackingPose",
        void()
    )

    HmdMatrix34_t(
        "GetRawZeroPoseToStandingAbsoluteTrackingPose",
        void()
    )

    uint32_t(
        "GetSortedTrackedDeviceIndicesOfClass",

        ETrackedDeviceClass("eTrackedDeviceClass"),
        nullable..TrackedDeviceIndex_t.p("punTrackedDeviceIndexArray"),
        AutoSize("punTrackedDeviceIndexArray")..uint32_t("unTrackedDeviceIndexArrayCount"),
        TrackedDeviceIndex_t("unRelativeToTrackedDeviceIndex")
    )

    EDeviceActivityLevel(
        "GetTrackedDeviceActivityLevel",

        TrackedDeviceIndex_t("unDeviceId")
    )

    void(
        "ApplyTransform",

        TrackedDevicePose_t.p("pOutputPose"),
        TrackedDevicePose_t.const.p("pTrackedDevicePose"),
        HmdMatrix34_t.const.p("pTransform")
    )

    TrackedDeviceIndex_t(
        "GetTrackedDeviceIndexForControllerRole",

        ETrackedControllerRole("unDeviceType")
    )

    ETrackedControllerRole(
        "GetControllerRoleForTrackedDeviceIndex",

        TrackedDeviceIndex_t("unDeviceIndex")
    )

    ETrackedDeviceClass(
        "GetTrackedDeviceClass",

        TrackedDeviceIndex_t("unDeviceIndex")
    )

    bool(
        "IsTrackedDeviceConnected",

        TrackedDeviceIndex_t("unDeviceIndex")
    )

    val GetTrackedDeviceProperty = bool(
        "GetBoolTrackedDeviceProperty",

        TrackedDeviceIndex_t("unDeviceIndex"),
        ETrackedDeviceProperty("prop"),
        Check(1)..nullable..ETrackedPropertyError.p("pError")
    )

    float(
        "GetFloatTrackedDeviceProperty",

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        GetTrackedDeviceProperty["pError"]
    )

    int32_t(
        "GetInt32TrackedDeviceProperty",

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        GetTrackedDeviceProperty["pError"]
    )

    uint64_t(
        "GetUint64TrackedDeviceProperty",

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        GetTrackedDeviceProperty["pError"]
    )

    HmdMatrix34_t(
        "GetMatrix34TrackedDeviceProperty",

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        GetTrackedDeviceProperty["pError"]
    )

    uint32_t(
        "GetArrayTrackedDeviceProperty",

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        PropertyTypeTag_t("propType"),
        nullable..void.p("pBuffer"),
        AutoSize("pBuffer")..uint32_t("unBufferSize"),
        GetTrackedDeviceProperty["pError"]
    )

    uint32_t(
        "GetStringTrackedDeviceProperty",

        GetTrackedDeviceProperty["unDeviceIndex"],
        GetTrackedDeviceProperty["prop"],
        Return(RESULT, "VR.k_unMaxPropertyStringSize", includesNT = true)..nullable..charASCII.p("pchValue"),
        AutoSize("pchValue")..uint32_t("unBufferSize"),
        GetTrackedDeviceProperty["pError"]
    )

    charASCII.p(
        "GetPropErrorNameFromEnum",

        ETrackedPropertyError("error")
    )

    bool(
        "PollNextEvent",

        VREvent_t.p("pEvent"),
        Expression("VREvent.SIZEOF")..uint32_t("uncbVREvent")
    )

    bool(
        "PollNextEventWithPose",

        ETrackingUniverseOrigin("eOrigin"),
        VREvent_t.p("pEvent"),
        Expression("VREvent.SIZEOF")..uint32_t("uncbVREvent"),
        TrackedDevicePose_t.p("pTrackedDevicePose")
    )

    charASCII.p(
        "GetEventTypeNameFromEnum",

        EVREventType("eType")
    )

    HiddenAreaMesh_t(
        "GetHiddenAreaMesh",

        EVREye("eEye"),
        EHiddenAreaMeshType("type")
    )

    bool(
        "GetControllerState",

        TrackedDeviceIndex_t("unControllerDeviceIndex"),
        VRControllerState_t.p("pControllerState"),
        Expression("VRControllerState.SIZEOF")..uint32_t("unControllerStateSize")
    )

    bool(
        "GetControllerStateWithPose",

        ETrackingUniverseOrigin("eOrigin"),
        TrackedDeviceIndex_t("unControllerDeviceIndex"),
        VRControllerState_t.p("pControllerState"),
        Expression("VRControllerState.SIZEOF")..uint32_t("unControllerStateSize"),
        TrackedDevicePose_t.p("pTrackedDevicePose")
    )

    void(
        "TriggerHapticPulse",

        TrackedDeviceIndex_t("unControllerDeviceIndex"),
        uint32_t("unAxisId"),
        unsigned_short("usDurationMicroSec")
    )

    charASCII.p(
        "GetButtonIdNameFromEnum",

        EVRButtonId("eButtonId")
    )

    charASCII.p(
        "GetControllerAxisTypeNameFromEnum",

        EVRControllerAxisType("eAxisType")
    )

    bool(
        "IsInputAvailable",
        void()
    )

    bool(
        "IsSteamVRDrawingControllers",
        void()
    )

    bool(
        "ShouldApplicationPause",
        void()
    )

    bool(
        "ShouldApplicationReduceRenderingWork",
        void()
    )

    EVRFirmwareError(
        "PerformFirmwareUpdate",

        TrackedDeviceIndex_t("unDeviceIndex")
    )

    void("AcknowledgeQuit_Exiting")

    uint32_t(
        "GetAppContainerFilePaths",

        Return(RESULT, includesNT = true)..nullable..charUTF8.p("pchBuffer"),
        AutoSize("pchBuffer")..uint32_t("unBufferSize")
    )

	charASCII.p(
        "GetRuntimeVersion",
        void()
    )
}