/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr.templates

import org.lwjgl.generator.*
import ovr.*

val OVR = "OVR".nativeClass(Module.OVR, prefixMethod = "ovr_", prefixConstant = "ovr") {
    nativeDirective(
        """DISABLE_WARNINGS()
#include "OVR_CAPI.h"
ENABLE_WARNINGS()""")

    IntConstant(
        "False".."0",
        "True".."1"
    )

    EnumConstant(
        "Init_Debug".enum(0x00000001),
        "Init_RequestVersion".enum(0x00000004),
        "Init_Invisible".enum(0x00000010),
        "Init_MixedRendering".enum(0x00000020),
        "Init_FocusAware".enum(0x00000040),
        "Init_WritableBits".enum(0x00ffffff)
    )

    EnumConstant(
        "LogLevel_Debug".enum,
        "LogLevel_Info".enum,
        "LogLevel_Error".enum
    )

    EnumConstant(
        "Hmd_None".enum("0"),
        "Hmd_DK2".enum("6"),
        "Hmd_CB".enum("8"),
        "Hmd_Other".enum,
        "Hmd_E3_2015".enum,
        "Hmd_ES06".enum,
        "Hmd_ES09".enum,
        "Hmd_ES11".enum,
        "Hmd_CV1".enum,
        "Hmd_RiftS".enum,
        "Hmd_Quest".enum("19"),
        "Hmd_Quest2".enum("20")
    )

    EnumConstant(
        "HmdCap_DebugDevice".enum(0x0010)
    )

    EnumConstant(
        "TrackingCap_Orientation".enum(0x0010),
        "TrackingCap_MagYawCorrection".enum(0x0020),
        "TrackingCap_Position".enum(0x0040)
    )

    EnumConstant(
        "Extension_TextureLayout_Octilinear".enum("0")
    )

    EnumConstant(
        "Eye_Left".enum("0"),
        "Eye_Right".enum,

        "Eye_Count".enum
    )

    EnumConstant(
        "TrackingOrigin_EyeLevel".enum("0"),
        "TrackingOrigin_FloorLevel".enum
    )

    EnumConstant(
        "ColorSpace_Unknown".enum("0"),
        "ColorSpace_Unmanaged".enum,
        "ColorSpace_Rift_CV1".enum,
        "ColorSpace_Rift_S".enum,
        "ColorSpace_Quest".enum,
        "ColorSpace_Rec_2020".enum,
        "ColorSpace_Rec_709".enum,
        "ColorSpace_P3".enum,
        "ColorSpace_Adobe_RGB".enum
    )

    EnumConstant(
        "Status_OrientationTracked".enum(
            0x0001
        ),
        "Status_PositionTracked".enum(
            0x0002
        ),

        "Status_OrientationValid".enum(
            0x0004
        ),
        "Status_PositionValid".enum(
            0x0008
        )
    )

    EnumConstant(
        "Tracker_Connected".enum(0x0020),
        "Tracker_PoseTracked".enum(0x0004)

    )

    EnumConstant(
        "Texture_2D".enum,
        "Texture_2D_External".enum,
        "Texture_Cube".enum
    )

    EnumConstant(
        "TextureBind_None".enum,
        "TextureBind_DX_RenderTarget".enum(0x0001),
        "TextureBind_DX_UnorderedAccess".enum(0x0002),
        "TextureBind_DX_DepthStencil".enum(
            0x0004
        )
    )

    EnumConstant(
        "OVR_FORMAT_UNKNOWN".enum,
        "OVR_FORMAT_B5G6R5_UNORM".enum,
        "OVR_FORMAT_B5G5R5A1_UNORM".enum,
        "OVR_FORMAT_B4G4R4A4_UNORM".enum,
        "OVR_FORMAT_R8G8B8A8_UNORM".enum,
        "OVR_FORMAT_R8G8B8A8_UNORM_SRGB".enum,
        "OVR_FORMAT_B8G8R8A8_UNORM".enum,
        "OVR_FORMAT_B8G8R8_UNORM".enum("27"),
        "OVR_FORMAT_B8G8R8A8_UNORM_SRGB".enum("7"),
        "OVR_FORMAT_B8G8R8X8_UNORM".enum,
        "OVR_FORMAT_B8G8R8X8_UNORM_SRGB".enum,
        "OVR_FORMAT_R16G16B16A16_FLOAT".enum,
        "OVR_FORMAT_R11G11B10_FLOAT".enum("25"),

        // Depth formats
        "OVR_FORMAT_D16_UNORM".enum("11"),
        "OVR_FORMAT_D24_UNORM_S8_UINT".enum,
        "OVR_FORMAT_D32_FLOAT".enum,
        "OVR_FORMAT_D32_FLOAT_S8X24_UINT".enum,

        // Added in 1.5 compressed formats can be used for static layers
        "OVR_FORMAT_BC1_UNORM".enum,
        "OVR_FORMAT_BC1_UNORM_SRGB".enum,
        "OVR_FORMAT_BC2_UNORM".enum,
        "OVR_FORMAT_BC2_UNORM_SRGB".enum,
        "OVR_FORMAT_BC3_UNORM".enum,
        "OVR_FORMAT_BC3_UNORM_SRGB".enum,
        "OVR_FORMAT_BC6H_UF16".enum,
        "OVR_FORMAT_BC6H_SF16".enum,
        "OVR_FORMAT_BC7_UNORM".enum,
        "OVR_FORMAT_BC7_UNORM_SRGB".enum
    ).noPrefix()

    EnumConstant(
        "TextureMisc_None".enum,
        "TextureMisc_DX_Typeless".enum(
            0x0001
        ),

        "TextureMisc_AllowGenerateMips".enum(
            0x0002
        ),

        "TextureMisc_ProtectedContent".enum(
            0x0004
        ),

        "TextureMisc_AutoGenerateMips".enum(
            0x0008
        )
    )

    EnumConstant(
        "MirrorOption_Default".enum(
            0x0000
        ),

        "MirrorOption_PostDistortion".enum(
            0x0001
        ),

        "MirrorOption_LeftEyeOnly".enum(
            0x0002
        ),
        "MirrorOption_RightEyeOnly".enum(
            0x0004
        ),
        "MirrorOption_IncludeGuardian".enum(0x0008),
        "MirrorOption_IncludeNotifications".enum(0x0010),
        "MirrorOption_IncludeSystemGui".enum(0x0020),
        "MirrorOption_ForceSymmetricFov".enum(
            0x0040
        )
    )

    EnumConstant(
        "FovStencil_HiddenArea".enum("0"),
        "FovStencil_VisibleArea".enum,
        "FovStencil_BorderLine".enum,
        "FovStencil_VisibleRectangle".enum
    )

    EnumConstant(
        "FovStencilFlag_MeshOriginAtBottomLeft".enum(
            0x01
        )
    )

    EnumConstant(
        "Button_A".enum(0x00000001),
        "Button_B".enum(0x00000002),
        "Button_RThumb".enum(0x00000004),
        "Button_RShoulder".enum(0x00000008),

        "Button_X".enum(0x00000100),
        "Button_Y".enum(0x00000200),
        "Button_LThumb".enum(0x00000400),
        "Button_LShoulder".enum(0x00000800),

        // Navigation through DPad.
        "Button_Up".enum(0x00010000),
        "Button_Down".enum(0x00020000),
        "Button_Left".enum(0x00040000),
        "Button_Right".enum(0x00080000),
        "Button_Enter".enum(
            0x00100000
        ),
        "Button_Back".enum(0x00200000),
        "Button_VolUp".enum(0x00400000),
        "Button_VolDown".enum(0x00800000),
        "Button_Home".enum(0x01000000),

        "Button_Private".enum("ovrButton_VolUp | ovrButton_VolDown | ovrButton_Home"),

        "Button_RMask".enum("ovrButton_A | ovrButton_B | ovrButton_RThumb | ovrButton_RShoulder"),
        "Button_LMask".enum("ovrButton_X | ovrButton_Y | ovrButton_LThumb | ovrButton_LShoulder | ovrButton_Enter")
    )

    EnumConstant(
        "Touch_A".enum("ovrButton_A"),
        "Touch_B".enum("ovrButton_B"),
        "Touch_RThumb".enum("ovrButton_RThumb"),
        "Touch_RThumbRest".enum(0x00000008),
        "Touch_RIndexTrigger".enum(0x00000010),

        "Touch_RButtonMask".enum("ovrTouch_A | ovrTouch_B | ovrTouch_RThumb | ovrTouch_RThumbRest | ovrTouch_RIndexTrigger"),

        "Touch_X".enum("ovrButton_X"),
        "Touch_Y".enum("ovrButton_Y"),
        "Touch_LThumb".enum("ovrButton_LThumb"),
        "Touch_LThumbRest".enum(0x00000800),
        "Touch_LIndexTrigger".enum(0x00001000),

        "Touch_LButtonMask".enum("ovrTouch_X | ovrTouch_Y | ovrTouch_LThumb | ovrTouch_LThumbRest | ovrTouch_LIndexTrigger"),

        // Finger pose state
        // Derived internally based on distance, proximity to sensors and filtering.
        "Touch_RIndexPointing".enum(0x00000020),
        "Touch_RThumbUp".enum(0x00000040),
        "Touch_LIndexPointing".enum(0x00002000),
        "Touch_LThumbUp".enum(0x00004000),

        "Touch_RPoseMask".enum("ovrTouch_RIndexPointing | ovrTouch_RThumbUp"),

        "Touch_LPoseMask".enum("ovrTouch_LIndexPointing | ovrTouch_LThumbUp")
    )

    EnumConstant(
        "ControllerType_None".enum(0x0000),
        "ControllerType_LTouch".enum(0x0001),
        "ControllerType_RTouch".enum(0x0002),
        "ControllerType_Touch".enum("(ovrControllerType_LTouch | ovrControllerType_RTouch)"),
        "ControllerType_Remote".enum(0x0004),

        "ControllerType_XBox".enum(0x0010),

        "ControllerType_Object0".enum(0x0100),
        "ControllerType_Object1".enum(0x0200),
        "ControllerType_Object2".enum(0x0400),
        "ControllerType_Object3".enum(0x0800),

        "ControllerType_Active".enum(0xffffffff.i)
    )

    EnumConstant(
        "HapticsBufferSubmit_Enqueue".enum
    )

    EnumConstant(
        "TrackedDevice_None".enum(0x0000),
        "TrackedDevice_HMD".enum(0x0001),
        "TrackedDevice_LTouch".enum(0x0002),
        "TrackedDevice_RTouch".enum(0x0004),
        "TrackedDevice_Touch".enum("(ovrTrackedDevice_LTouch | ovrTrackedDevice_RTouch)"),

        "TrackedDevice_Object0".enum(0x0010),
        "TrackedDevice_Object1".enum(0x0020),
        "TrackedDevice_Object2".enum(0x0040),
        "TrackedDevice_Object3".enum(0x0080),

        "TrackedDevice_All".enum(0xFFFF)
    )

    EnumConstant(
        "CameraStatus_None".enum(0x0),
        "CameraStatus_Connected".enum(0x1),
        "CameraStatus_Calibrating".enum(0x2),
        "CameraStatus_CalibrationFailed".enum(0x4),
        "CameraStatus_Calibrated".enum(0x8),
        "CameraStatus_Capturing".enum(0x10)
    )

    EnumConstant(
        "Boundary_Outer".enum(0x0001),
        "Boundary_PlayArea".enum(
            0x0100
        )
    )

    EnumConstant(
        "Hand_Left".enum(0),
        "Hand_Right".enum,

        "Hand_Count".enum
    )

    EnumConstant(
        "MaxProvidedFrameStats".enum(5)
    )

    IntConstant(
        "OVR_HAPTICS_BUFFER_SAMPLES_MAX".."256"
    ).noPrefix()

    IntConstant(
        "OVR_MAX_EXTERNAL_CAMERA_COUNT".."16",
        "OVR_EXTERNAL_CAMERA_NAME_SIZE".."32"
    ).noPrefix()

    IntConstant(
        "OVR_MAX_EXTENSION_NAME_SIZE".."128"
    ).noPrefix()

    ovrResult(
        "Initialize",

        nullable..ovrInitParams.const.p("params")
    )

    void("Shutdown")

    void(
        "GetLastErrorInfo",

        ovrErrorInfo.p("errorInfo")
    )

    Nonnull..charUTF8.const.p(
        "GetVersionString",
        void()
    )

    int(
        "TraceMessage",

        int("level"),
        charUTF8.const.p("message")
    )

    ovrResult(
        "IdentifyClient",

        charUTF8.const.p("identity")
    )

    // ----------------
    // HMD Management

    ovrHmdColorDesc(
        "GetHmdColorDesc",

        nullable..ovrSession("session")
    )

    ovrResult(
        "SetClientColorDesc",

        ovrSession("session"),
        ovrHmdColorDesc.const.p("colorDesc")
    )

    ovrHmdDesc(
        "GetHmdDesc",

        nullable..ovrSession("session")
    )

    val session = ovrSession("session")


    unsigned_int(
        "GetTrackerCount",

        session
    )

    ovrTrackerDesc(
        "GetTrackerDesc",

        session,
        unsigned_int("trackerDescIndex")
    )

    ovrResult(
        "Create",

        Check(1)..ovrSession.p("pSession"),
        ovrGraphicsLuid.p("pLuid")
    )

    void(
        "Destroy",

        session
    )

    ovrResult(
        "GetSessionStatus",

        session,
        ovrSessionStatus.p("sessionStatus")
    )

    ovrResult(
        "IsExtensionSupported",

        session,
        ovrExtensions("extension"),
        Check(1)..ovrBool.p("outExtensionSupported")
    )

    ovrResult(
        "EnableExtension",

        session,
        ovrExtensions("extension")
    )

    // ----------------
    // Tracking

    ovrResult(
        "SetTrackingOriginType",

        session,
        ovrTrackingOrigin("origin")
    )

    ovrTrackingOrigin(
        "GetTrackingOriginType",

        session
    )

    ovrResult(
        "RecenterTrackingOrigin",

        session
    )

    ovrResult(
        "SpecifyTrackingOrigin",

        session,
        ovrPosef("originPose")
    )

    void(
        "ClearShouldRecenterFlag",

        session
    )

    ovrTrackingState(
        "GetTrackingState",

        session,
        double("absTime"),
        ovrBool("latencyMarker")
    )

    ovrResult(
        "GetDevicePoses",

        session,
        ovrTrackedDeviceType.p("deviceTypes"),
        AutoSize("deviceTypes", "outDevicePoses")..int("deviceCount"),
        double("absTime"),
        ovrPoseStatef.p("outDevicePoses")
    )

    ovrTrackerPose(
        "GetTrackerPose",

        session,
        unsigned_int("trackerPoseIndex")
    )

    ovrResult(
        "GetInputState",

        session,
        ovrControllerType("controllerType"),
        ovrInputState.p("inputState")
    )

    unsigned_int(
        "GetConnectedControllerTypes",

        session
    )

    ovrTouchHapticsDesc(
        "GetTouchHapticsDesc",

        session,
        ovrControllerType("controllerType")
    )

    ovrResult(
        "SetControllerVibration",

        session,
        ovrControllerType("controllerType"),
        float("frequency"),
        float("amplitude")
    )

    ovrResult(
        "SubmitControllerVibration",

        session,
        ovrControllerType("controllerType"),
        ovrHapticsBuffer.const.p("buffer")
    )

    ovrResult(
        "GetControllerVibrationState",

        session,
        ovrControllerType("controllerType"),
        ovrHapticsPlaybackState.p("outState")
    )

    val TestBoundary = ovrResult(
        "TestBoundary",

        session,
        ovrTrackedDeviceType("deviceBitmask"),
        ovrBoundaryType("boundaryType"),
        ovrBoundaryTestResult.p("outTestResult")
    )

    ovrResult(
        "TestBoundaryPoint",

        session,
        ovrVector3f.const.p("point"),
        ovrBoundaryType("singleBoundaryType"),
        ovrBoundaryTestResult.p("outTestResult")
    )

    ovrResult(
        "SetBoundaryLookAndFeel",

        session,
        ovrBoundaryLookAndFeel.const.p("lookAndFeel")
    )

    ovrResult(
        "ResetBoundaryLookAndFeel",

        session
    )

    ovrResult(
        "GetBoundaryGeometry",

        session,
        TestBoundary["boundaryType"],
        nullable..ovrVector3f.p("outFloorPoints"),
        Check(1)..nullable..int.p("outFloorPointsCount")
    )

    ovrResult(
        "GetBoundaryDimensions",

        session,
        TestBoundary["boundaryType"],
        ovrVector3f.p("outDimensions")
    )

    ovrResult(
        "GetBoundaryVisible",

        session,
        Check(1)..ovrBool.p("outIsVisible")
    )

    ovrResult(
        "RequestBoundaryVisible",

        session,
        ovrBool("visible")
    )

    // ----------------
    // Mixed reality capture support

    ovrResult(
        "GetExternalCameras",

        session,
        nullable..ovrExternalCamera.p("cameras"),
        AutoSize("cameras")..Check(1)..unsigned_int.p("inoutCameraCount")
    )

    ovrResult(
        "SetExternalCameraProperties",

        session,
        charASCII.const.p("name"),
        ovrCameraIntrinsics.const.p.const("intrinsics"),
        ovrCameraExtrinsics.const.p.const("extrinsics")
    )

    // ----------------
    // Layers

    IntConstant(
        "MaxLayerCount".."16"
    )

    EnumConstant(
        "LayerType_Disabled".enum("0"),
        "LayerType_EyeFov".enum,
        "LayerType_EyeFovDepth".enum,
        "LayerType_Quad".enum,
        "LayerType_EyeMatrix".enum("5"),
        "LayerType_EyeFovMultires".enum("7"),
        "LayerType_Cylinder".enum,
        "LayerType_Cube".enum("10")
    )

    EnumConstant(
        "LayerFlag_HighQuality".enum(
            0x01
        ),
        "LayerFlag_TextureOriginAtBottomLeft".enum(0x02),
        "LayerFlag_HeadLocked".enum(
            0x04
        )
    )

    EnumConstant(
        "TextureLayout_Rectilinear".enum("0"),
        "TextureLayout_Octilinear".enum("1")
    )

    // ----------------
    // SDK Distortion Rendering

    ovrResult(
        "GetTextureSwapChainLength",

        session,
        ovrTextureSwapChain("chain"),
        Check(1)..int.p("out_Length")
    )

    ovrResult(
        "GetTextureSwapChainCurrentIndex",

        session,
        ovrTextureSwapChain("chain"),
        Check(1)..int.p("out_Index")
    )

    ovrResult(
        "GetTextureSwapChainDesc",

        session,
        ovrTextureSwapChain("chain"),
        ovrTextureSwapChainDesc.p("out_Desc")
    )

    ovrResult(
        "CommitTextureSwapChain",

        session,
        ovrTextureSwapChain("chain")
    )

    void(
        "DestroyTextureSwapChain",

        session,
        nullable..ovrTextureSwapChain("chain")
    )

    void(
        "DestroyMirrorTexture",

        session,
        nullable..ovrMirrorTexture("mirrorTexture")
    )

    ovrSizei(
        "GetFovTextureSize",

        session,
        ovrEyeType("eye"),
        ovrFovPort("fov"),
        float("pixelsPerDisplayPixel")
    )

    ovrEyeRenderDesc(
        "GetRenderDesc",

        session,
        ovrEyeType("eyeType"),
        ovrFovPort("fov")
    )

    ovrResult(
        "GetFovStencil",

        session,
        ovrFovStencilDesc.const.p("fovStencilDesc"),
        Input..ovrFovStencilMeshBuffer.p("meshBuffer")
    )

    ovrResult(
        "WaitToBeginFrame",

        session,
        long_long("frameIndex")
    )

    ovrResult(
        "BeginFrame",

        session,
        long_long("frameIndex")
    )

    ovrResult(
        "EndFrame",

        session,
        long_long("frameIndex"),
        nullable..ovrViewScaleDesc.const.p("viewScaleDesc"),
        ovrLayerHeader.const.p.const.p("layerPtrList"),
        AutoSize("layerPtrList")..unsigned_int("layerCount")
    )

    ovrResult(
        "SubmitFrame",

        session,
        long_long("frameIndex"),
        nullable..ovrViewScaleDesc.const.p("viewScaleDesc"),
        ovrLayerHeader.const.p.const.p("layerPtrList"),
        AutoSize("layerPtrList")..unsigned_int("layerCount")
    )

    // ----------------
    // Frame Timing

    ovrResult(
        "GetPerfStats",

        session,
        ovrPerfStats.p("outStats")
    )

    ovrResult(
        "ResetPerfStats",

        session
    )

    double(
        "GetPredictedDisplayTime",

        session,
        long_long("frameIndex")
    )

    double(
        "GetTimeInSeconds",
        void()
    )

    EnumConstant(
        "PerfHud_Off".enum("0"),
        "PerfHud_PerfSummary".enum,
        "PerfHud_LatencyTiming".enum,
        "PerfHud_AppRenderTiming".enum,
        "PerfHud_CompRenderTiming".enum,
        "PerfHud_AwsStats".enum("6"),
        "PerfHud_VersionInfo".enum("5"),
        "PerfHud_LinkPerf".enum("7")
    )

    EnumConstant(
        "LayerHud_Off".enum("0"),
        "LayerHud_Info".enum
    )

    EnumConstant(
        "DebugHudStereo_Off".enum("0"),
        "DebugHudStereo_Quad".enum,
        "DebugHudStereo_QuadWithCrosshair".enum,
        "DebugHudStereo_CrosshairAtInfinity".enum
    )

    // ----------------
    // Property Access

    ovrBool(
        "GetBool",

        session,
        charASCII.const.p("propertyName"),
        ovrBool("defaultVal")
    )

    ovrBool(
        "SetBool",

        session,
        charASCII.const.p("propertyName"),
        ovrBool("value")
    )

    int(
        "GetInt",

        session,
        charASCII.const.p("propertyName"),
        int("defaultVal")
    )

    ovrBool(
        "SetInt",

        session,
        charASCII.const.p("propertyName"),
        int("value")
    )

    float(
        "GetFloat",

        session,
        charASCII.const.p("propertyName"),
        float("defaultVal")
    )

    ovrBool(
        "SetFloat",

        session,
        charASCII.const.p("propertyName"),
        float("value")
    )

    unsigned_int(
        "GetFloatArray",

        session,
        charASCII.const.p("propertyName"),
        float.p("values"),
        AutoSize("values")..unsigned_int("valuesCapacity")
    )

    ovrBool(
        "SetFloatArray",

        session,
        charASCII.const.p("propertyName"),
        float.p("values"),
        AutoSize("values")..unsigned_int("valuesSize")
    )

    charUTF8.const.p(
        "GetString",

        session,
        charASCII.const.p("propertyName"),
        nullable..charUTF8.const.p("defaultVal")
    )

    ovrBool(
        "SetString",

        ovrSession("hmddesc"),
        charASCII.const.p("propertyName"),
        charASCII.const.p("value")
    )
}