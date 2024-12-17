/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class OVR {

    static { LibOVR.initialize(); }

    public static final int
        ovrFalse = 0,
        ovrTrue  = 1;

    public static final int
        ovrInit_Debug          = 0x1,
        ovrInit_RequestVersion = 0x4,
        ovrInit_Invisible      = 0x10,
        ovrInit_MixedRendering = 0x20,
        ovrInit_FocusAware     = 0x40,
        ovrInit_WritableBits   = 0xFFFFFF;

    public static final int
        ovrLogLevel_Debug = 0,
        ovrLogLevel_Info  = 1,
        ovrLogLevel_Error = 2;

    public static final int
        ovrHmd_None    = 0,
        ovrHmd_DK2     = 6,
        ovrHmd_CB      = 8,
        ovrHmd_Other   = 9,
        ovrHmd_E3_2015 = 10,
        ovrHmd_ES06    = 11,
        ovrHmd_ES09    = 12,
        ovrHmd_ES11    = 13,
        ovrHmd_CV1     = 14,
        ovrHmd_RiftS   = 15,
        ovrHmd_Quest   = 19,
        ovrHmd_Quest2  = 20;

    public static final int ovrHmdCap_DebugDevice = 0x10;

    public static final int
        ovrTrackingCap_Orientation      = 0x10,
        ovrTrackingCap_MagYawCorrection = 0x20,
        ovrTrackingCap_Position         = 0x40;

    public static final int ovrExtension_TextureLayout_Octilinear = 0;

    public static final int
        ovrEye_Left  = 0,
        ovrEye_Right = 1,
        ovrEye_Count = 2;

    public static final int
        ovrTrackingOrigin_EyeLevel   = 0,
        ovrTrackingOrigin_FloorLevel = 1;

    public static final int
        ovrColorSpace_Unknown   = 0,
        ovrColorSpace_Unmanaged = 1,
        ovrColorSpace_Rift_CV1  = 2,
        ovrColorSpace_Rift_S    = 3,
        ovrColorSpace_Quest     = 4,
        ovrColorSpace_Rec_2020  = 5,
        ovrColorSpace_Rec_709   = 6,
        ovrColorSpace_P3        = 7,
        ovrColorSpace_Adobe_RGB = 8;

    public static final int
        ovrStatus_OrientationTracked = 0x1,
        ovrStatus_PositionTracked    = 0x2,
        ovrStatus_OrientationValid   = 0x4,
        ovrStatus_PositionValid      = 0x8;

    public static final int
        ovrTracker_Connected   = 0x20,
        ovrTracker_PoseTracked = 0x4;

    public static final int
        ovrTexture_2D          = 0,
        ovrTexture_2D_External = 1,
        ovrTexture_Cube        = 2;

    public static final int
        ovrTextureBind_None               = 0,
        ovrTextureBind_DX_RenderTarget    = 0x1,
        ovrTextureBind_DX_UnorderedAccess = 0x2,
        ovrTextureBind_DX_DepthStencil    = 0x4;

    public static final int
        OVR_FORMAT_UNKNOWN              = 0,
        OVR_FORMAT_B5G6R5_UNORM         = 1,
        OVR_FORMAT_B5G5R5A1_UNORM       = 2,
        OVR_FORMAT_B4G4R4A4_UNORM       = 3,
        OVR_FORMAT_R8G8B8A8_UNORM       = 4,
        OVR_FORMAT_R8G8B8A8_UNORM_SRGB  = 5,
        OVR_FORMAT_B8G8R8A8_UNORM       = 6,
        OVR_FORMAT_B8G8R8_UNORM         = 27,
        OVR_FORMAT_B8G8R8A8_UNORM_SRGB  = 7,
        OVR_FORMAT_B8G8R8X8_UNORM       = 8,
        OVR_FORMAT_B8G8R8X8_UNORM_SRGB  = 9,
        OVR_FORMAT_R16G16B16A16_FLOAT   = 10,
        OVR_FORMAT_R11G11B10_FLOAT      = 25,
        OVR_FORMAT_D16_UNORM            = 11,
        OVR_FORMAT_D24_UNORM_S8_UINT    = 12,
        OVR_FORMAT_D32_FLOAT            = 13,
        OVR_FORMAT_D32_FLOAT_S8X24_UINT = 14,
        OVR_FORMAT_BC1_UNORM            = 15,
        OVR_FORMAT_BC1_UNORM_SRGB       = 16,
        OVR_FORMAT_BC2_UNORM            = 17,
        OVR_FORMAT_BC2_UNORM_SRGB       = 18,
        OVR_FORMAT_BC3_UNORM            = 19,
        OVR_FORMAT_BC3_UNORM_SRGB       = 20,
        OVR_FORMAT_BC6H_UF16            = 21,
        OVR_FORMAT_BC6H_SF16            = 22,
        OVR_FORMAT_BC7_UNORM            = 23,
        OVR_FORMAT_BC7_UNORM_SRGB       = 24;

    public static final int
        ovrTextureMisc_None              = 0,
        ovrTextureMisc_DX_Typeless       = 0x1,
        ovrTextureMisc_AllowGenerateMips = 0x2,
        ovrTextureMisc_ProtectedContent  = 0x4,
        ovrTextureMisc_AutoGenerateMips  = 0x8;

    public static final int
        ovrMirrorOption_Default              = 0x0,
        ovrMirrorOption_PostDistortion       = 0x1,
        ovrMirrorOption_LeftEyeOnly          = 0x2,
        ovrMirrorOption_RightEyeOnly         = 0x4,
        ovrMirrorOption_IncludeGuardian      = 0x8,
        ovrMirrorOption_IncludeNotifications = 0x10,
        ovrMirrorOption_IncludeSystemGui     = 0x20,
        ovrMirrorOption_ForceSymmetricFov    = 0x40;

    public static final int
        ovrFovStencil_HiddenArea       = 0,
        ovrFovStencil_VisibleArea      = 1,
        ovrFovStencil_BorderLine       = 2,
        ovrFovStencil_VisibleRectangle = 3;

    public static final int ovrFovStencilFlag_MeshOriginAtBottomLeft = 0x1;

    public static final int
        ovrButton_A         = 0x1,
        ovrButton_B         = 0x2,
        ovrButton_RThumb    = 0x4,
        ovrButton_RShoulder = 0x8,
        ovrButton_X         = 0x100,
        ovrButton_Y         = 0x200,
        ovrButton_LThumb    = 0x400,
        ovrButton_LShoulder = 0x800,
        ovrButton_Up        = 0x10000,
        ovrButton_Down      = 0x20000,
        ovrButton_Left      = 0x40000,
        ovrButton_Right     = 0x80000,
        ovrButton_Enter     = 0x100000,
        ovrButton_Back      = 0x200000,
        ovrButton_VolUp     = 0x400000,
        ovrButton_VolDown   = 0x800000,
        ovrButton_Home      = 0x1000000,
        ovrButton_Private   = ovrButton_VolUp | ovrButton_VolDown | ovrButton_Home,
        ovrButton_RMask     = ovrButton_A | ovrButton_B | ovrButton_RThumb | ovrButton_RShoulder,
        ovrButton_LMask     = ovrButton_X | ovrButton_Y | ovrButton_LThumb | ovrButton_LShoulder | ovrButton_Enter;

    public static final int
        ovrTouch_A              = ovrButton_A,
        ovrTouch_B              = ovrButton_B,
        ovrTouch_RThumb         = ovrButton_RThumb,
        ovrTouch_RThumbRest     = 0x8,
        ovrTouch_RIndexTrigger  = 0x10,
        ovrTouch_RButtonMask    = ovrTouch_A | ovrTouch_B | ovrTouch_RThumb | ovrTouch_RThumbRest | ovrTouch_RIndexTrigger,
        ovrTouch_X              = ovrButton_X,
        ovrTouch_Y              = ovrButton_Y,
        ovrTouch_LThumb         = ovrButton_LThumb,
        ovrTouch_LThumbRest     = 0x800,
        ovrTouch_LIndexTrigger  = 0x1000,
        ovrTouch_LButtonMask    = ovrTouch_X | ovrTouch_Y | ovrTouch_LThumb | ovrTouch_LThumbRest | ovrTouch_LIndexTrigger,
        ovrTouch_RIndexPointing = 0x20,
        ovrTouch_RThumbUp       = 0x40,
        ovrTouch_LIndexPointing = 0x2000,
        ovrTouch_LThumbUp       = 0x4000,
        ovrTouch_RPoseMask      = ovrTouch_RIndexPointing | ovrTouch_RThumbUp,
        ovrTouch_LPoseMask      = ovrTouch_LIndexPointing | ovrTouch_LThumbUp;

    public static final int
        ovrControllerType_None    = 0x0,
        ovrControllerType_LTouch  = 0x1,
        ovrControllerType_RTouch  = 0x2,
        ovrControllerType_Touch   = (ovrControllerType_LTouch | ovrControllerType_RTouch),
        ovrControllerType_Remote  = 0x4,
        ovrControllerType_XBox    = 0x10,
        ovrControllerType_Object0 = 0x100,
        ovrControllerType_Object1 = 0x200,
        ovrControllerType_Object2 = 0x400,
        ovrControllerType_Object3 = 0x800,
        ovrControllerType_Active  = 0xFFFFFFFF;

    public static final int ovrHapticsBufferSubmit_Enqueue = 0;

    public static final int
        ovrTrackedDevice_None    = 0x0,
        ovrTrackedDevice_HMD     = 0x1,
        ovrTrackedDevice_LTouch  = 0x2,
        ovrTrackedDevice_RTouch  = 0x4,
        ovrTrackedDevice_Touch   = (ovrTrackedDevice_LTouch | ovrTrackedDevice_RTouch),
        ovrTrackedDevice_Object0 = 0x10,
        ovrTrackedDevice_Object1 = 0x20,
        ovrTrackedDevice_Object2 = 0x40,
        ovrTrackedDevice_Object3 = 0x80,
        ovrTrackedDevice_All     = 0xFFFF;

    public static final int
        ovrCameraStatus_None              = 0x0,
        ovrCameraStatus_Connected         = 0x1,
        ovrCameraStatus_Calibrating       = 0x2,
        ovrCameraStatus_CalibrationFailed = 0x4,
        ovrCameraStatus_Calibrated        = 0x8,
        ovrCameraStatus_Capturing         = 0x10;

    public static final int
        ovrBoundary_Outer    = 0x1,
        ovrBoundary_PlayArea = 0x100;

    public static final int
        ovrHand_Left  = 0x0,
        ovrHand_Right = 0x1,
        ovrHand_Count = 0x2;

    public static final int ovrMaxProvidedFrameStats = 0x5;

    public static final int OVR_HAPTICS_BUFFER_SAMPLES_MAX = 256;

    public static final int
        OVR_MAX_EXTERNAL_CAMERA_COUNT = 16,
        OVR_EXTERNAL_CAMERA_NAME_SIZE = 32;

    public static final int OVR_MAX_EXTENSION_NAME_SIZE = 128;

    public static final int ovrMaxLayerCount = 16;

    public static final int
        ovrLayerType_Disabled       = 0,
        ovrLayerType_EyeFov         = 1,
        ovrLayerType_EyeFovDepth    = 2,
        ovrLayerType_Quad           = 3,
        ovrLayerType_EyeMatrix      = 5,
        ovrLayerType_EyeFovMultires = 7,
        ovrLayerType_Cylinder       = 8,
        ovrLayerType_Cube           = 10;

    public static final int
        ovrLayerFlag_HighQuality               = 0x1,
        ovrLayerFlag_TextureOriginAtBottomLeft = 0x2,
        ovrLayerFlag_HeadLocked                = 0x4;

    public static final int
        ovrTextureLayout_Rectilinear = 0,
        ovrTextureLayout_Octilinear  = 1;

    public static final int
        ovrPerfHud_Off              = 0,
        ovrPerfHud_PerfSummary      = 1,
        ovrPerfHud_LatencyTiming    = 2,
        ovrPerfHud_AppRenderTiming  = 3,
        ovrPerfHud_CompRenderTiming = 4,
        ovrPerfHud_AwsStats         = 6,
        ovrPerfHud_VersionInfo      = 5,
        ovrPerfHud_LinkPerf         = 7;

    public static final int
        ovrLayerHud_Off  = 0,
        ovrLayerHud_Info = 1;

    public static final int
        ovrDebugHudStereo_Off                 = 0,
        ovrDebugHudStereo_Quad                = 1,
        ovrDebugHudStereo_QuadWithCrosshair   = 2,
        ovrDebugHudStereo_CrosshairAtInfinity = 3;

    protected OVR() {
        throw new UnsupportedOperationException();
    }

    // --- [ ovr_Initialize ] ---

    /** {@code ovrResult ovr_Initialize(ovrInitParams const * params)} */
    public static native int novr_Initialize(long params);

    /** {@code ovrResult ovr_Initialize(ovrInitParams const * params)} */
    @NativeType("ovrResult")
    public static int ovr_Initialize(@NativeType("ovrInitParams const *") @Nullable OVRInitParams params) {
        return novr_Initialize(memAddressSafe(params));
    }

    // --- [ ovr_Shutdown ] ---

    /** {@code void ovr_Shutdown(void)} */
    public static native void ovr_Shutdown();

    // --- [ ovr_GetLastErrorInfo ] ---

    /** {@code void ovr_GetLastErrorInfo(ovrErrorInfo * errorInfo)} */
    public static native void novr_GetLastErrorInfo(long errorInfo);

    /** {@code void ovr_GetLastErrorInfo(ovrErrorInfo * errorInfo)} */
    public static void ovr_GetLastErrorInfo(@NativeType("ovrErrorInfo *") OVRErrorInfo errorInfo) {
        novr_GetLastErrorInfo(errorInfo.address());
    }

    // --- [ ovr_GetVersionString ] ---

    /** {@code char const * ovr_GetVersionString(void)} */
    public static native long novr_GetVersionString();

    /** {@code char const * ovr_GetVersionString(void)} */
    @NativeType("char const *")
    public static String ovr_GetVersionString() {
        long __result = novr_GetVersionString();
        return memUTF8(__result);
    }

    // --- [ ovr_TraceMessage ] ---

    /** {@code int ovr_TraceMessage(int level, char const * message)} */
    public static native int novr_TraceMessage(int level, long message);

    /** {@code int ovr_TraceMessage(int level, char const * message)} */
    public static int ovr_TraceMessage(int level, @NativeType("char const *") ByteBuffer message) {
        if (CHECKS) {
            checkNT1(message);
        }
        return novr_TraceMessage(level, memAddress(message));
    }

    /** {@code int ovr_TraceMessage(int level, char const * message)} */
    public static int ovr_TraceMessage(int level, @NativeType("char const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(message, true);
            long messageEncoded = stack.getPointerAddress();
            return novr_TraceMessage(level, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_IdentifyClient ] ---

    /** {@code ovrResult ovr_IdentifyClient(char const * identity)} */
    public static native int novr_IdentifyClient(long identity);

    /** {@code ovrResult ovr_IdentifyClient(char const * identity)} */
    @NativeType("ovrResult")
    public static int ovr_IdentifyClient(@NativeType("char const *") ByteBuffer identity) {
        if (CHECKS) {
            checkNT1(identity);
        }
        return novr_IdentifyClient(memAddress(identity));
    }

    /** {@code ovrResult ovr_IdentifyClient(char const * identity)} */
    @NativeType("ovrResult")
    public static int ovr_IdentifyClient(@NativeType("char const *") CharSequence identity) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(identity, true);
            long identityEncoded = stack.getPointerAddress();
            return novr_IdentifyClient(identityEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetHmdColorDesc ] ---

    /** {@code ovrHmdColorDesc ovr_GetHmdColorDesc(ovrSession session)} */
    public static native void novr_GetHmdColorDesc(long session, long __result);

    /** {@code ovrHmdColorDesc ovr_GetHmdColorDesc(ovrSession session)} */
    public static ovrHmdColorDesc ovr_GetHmdColorDesc(@NativeType("ovrSession") long session, ovrHmdColorDesc __result) {
        novr_GetHmdColorDesc(session, __result.address());
        return __result;
    }

    // --- [ ovr_SetClientColorDesc ] ---

    /** {@code ovrResult ovr_SetClientColorDesc(ovrSession session, ovrHmdColorDesc const * colorDesc)} */
    public static native int novr_SetClientColorDesc(long session, long colorDesc);

    /** {@code ovrResult ovr_SetClientColorDesc(ovrSession session, ovrHmdColorDesc const * colorDesc)} */
    @NativeType("ovrResult")
    public static int ovr_SetClientColorDesc(@NativeType("ovrSession") long session, @NativeType("ovrHmdColorDesc const *") ovrHmdColorDesc colorDesc) {
        if (CHECKS) {
            check(session);
        }
        return novr_SetClientColorDesc(session, colorDesc.address());
    }

    // --- [ ovr_GetHmdDesc ] ---

    /** {@code ovrHmdDesc ovr_GetHmdDesc(ovrSession session)} */
    public static native void novr_GetHmdDesc(long session, long __result);

    /** {@code ovrHmdDesc ovr_GetHmdDesc(ovrSession session)} */
    @NativeType("ovrHmdDesc")
    public static OVRHmdDesc ovr_GetHmdDesc(@NativeType("ovrSession") long session, @NativeType("ovrHmdDesc") OVRHmdDesc __result) {
        novr_GetHmdDesc(session, __result.address());
        return __result;
    }

    // --- [ ovr_GetTrackerCount ] ---

    /** {@code unsigned int ovr_GetTrackerCount(ovrSession session)} */
    public static native int novr_GetTrackerCount(long session);

    /** {@code unsigned int ovr_GetTrackerCount(ovrSession session)} */
    @NativeType("unsigned int")
    public static int ovr_GetTrackerCount(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetTrackerCount(session);
    }

    // --- [ ovr_GetTrackerDesc ] ---

    /** {@code ovrTrackerDesc ovr_GetTrackerDesc(ovrSession session, unsigned int trackerDescIndex)} */
    public static native void novr_GetTrackerDesc(long session, int trackerDescIndex, long __result);

    /** {@code ovrTrackerDesc ovr_GetTrackerDesc(ovrSession session, unsigned int trackerDescIndex)} */
    @NativeType("ovrTrackerDesc")
    public static OVRTrackerDesc ovr_GetTrackerDesc(@NativeType("ovrSession") long session, @NativeType("unsigned int") int trackerDescIndex, @NativeType("ovrTrackerDesc") OVRTrackerDesc __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetTrackerDesc(session, trackerDescIndex, __result.address());
        return __result;
    }

    // --- [ ovr_Create ] ---

    /** {@code ovrResult ovr_Create(ovrSession * pSession, ovrGraphicsLuid * pLuid)} */
    public static native int novr_Create(long pSession, long pLuid);

    /** {@code ovrResult ovr_Create(ovrSession * pSession, ovrGraphicsLuid * pLuid)} */
    @NativeType("ovrResult")
    public static int ovr_Create(@NativeType("ovrSession *") PointerBuffer pSession, @NativeType("ovrGraphicsLuid *") OVRGraphicsLuid pLuid) {
        if (CHECKS) {
            check(pSession, 1);
        }
        return novr_Create(memAddress(pSession), pLuid.address());
    }

    // --- [ ovr_Destroy ] ---

    /** {@code void ovr_Destroy(ovrSession session)} */
    public static native void novr_Destroy(long session);

    /** {@code void ovr_Destroy(ovrSession session)} */
    public static void ovr_Destroy(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        novr_Destroy(session);
    }

    // --- [ ovr_GetSessionStatus ] ---

    /** {@code ovrResult ovr_GetSessionStatus(ovrSession session, ovrSessionStatus * sessionStatus)} */
    public static native int novr_GetSessionStatus(long session, long sessionStatus);

    /** {@code ovrResult ovr_GetSessionStatus(ovrSession session, ovrSessionStatus * sessionStatus)} */
    @NativeType("ovrResult")
    public static int ovr_GetSessionStatus(@NativeType("ovrSession") long session, @NativeType("ovrSessionStatus *") OVRSessionStatus sessionStatus) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetSessionStatus(session, sessionStatus.address());
    }

    // --- [ ovr_IsExtensionSupported ] ---

    /** {@code ovrResult ovr_IsExtensionSupported(ovrSession session, ovrExtensions extension, ovrBool * outExtensionSupported)} */
    public static native int novr_IsExtensionSupported(long session, int extension, long outExtensionSupported);

    /** {@code ovrResult ovr_IsExtensionSupported(ovrSession session, ovrExtensions extension, ovrBool * outExtensionSupported)} */
    @NativeType("ovrResult")
    public static int ovr_IsExtensionSupported(@NativeType("ovrSession") long session, @NativeType("ovrExtensions") int extension, @NativeType("ovrBool *") ByteBuffer outExtensionSupported) {
        if (CHECKS) {
            check(session);
            check(outExtensionSupported, 1);
        }
        return novr_IsExtensionSupported(session, extension, memAddress(outExtensionSupported));
    }

    // --- [ ovr_EnableExtension ] ---

    /** {@code ovrResult ovr_EnableExtension(ovrSession session, ovrExtensions extension)} */
    public static native int novr_EnableExtension(long session, int extension);

    /** {@code ovrResult ovr_EnableExtension(ovrSession session, ovrExtensions extension)} */
    @NativeType("ovrResult")
    public static int ovr_EnableExtension(@NativeType("ovrSession") long session, @NativeType("ovrExtensions") int extension) {
        if (CHECKS) {
            check(session);
        }
        return novr_EnableExtension(session, extension);
    }

    // --- [ ovr_SetTrackingOriginType ] ---

    /** {@code ovrResult ovr_SetTrackingOriginType(ovrSession session, ovrTrackingOrigin origin)} */
    public static native int novr_SetTrackingOriginType(long session, int origin);

    /** {@code ovrResult ovr_SetTrackingOriginType(ovrSession session, ovrTrackingOrigin origin)} */
    @NativeType("ovrResult")
    public static int ovr_SetTrackingOriginType(@NativeType("ovrSession") long session, @NativeType("ovrTrackingOrigin") int origin) {
        if (CHECKS) {
            check(session);
        }
        return novr_SetTrackingOriginType(session, origin);
    }

    // --- [ ovr_GetTrackingOriginType ] ---

    /** {@code ovrTrackingOrigin ovr_GetTrackingOriginType(ovrSession session)} */
    public static native int novr_GetTrackingOriginType(long session);

    /** {@code ovrTrackingOrigin ovr_GetTrackingOriginType(ovrSession session)} */
    @NativeType("ovrTrackingOrigin")
    public static int ovr_GetTrackingOriginType(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetTrackingOriginType(session);
    }

    // --- [ ovr_RecenterTrackingOrigin ] ---

    /** {@code ovrResult ovr_RecenterTrackingOrigin(ovrSession session)} */
    public static native int novr_RecenterTrackingOrigin(long session);

    /** {@code ovrResult ovr_RecenterTrackingOrigin(ovrSession session)} */
    @NativeType("ovrResult")
    public static int ovr_RecenterTrackingOrigin(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_RecenterTrackingOrigin(session);
    }

    // --- [ ovr_SpecifyTrackingOrigin ] ---

    /** {@code ovrResult ovr_SpecifyTrackingOrigin(ovrSession session, ovrPosef originPose)} */
    public static native int novr_SpecifyTrackingOrigin(long session, long originPose);

    /** {@code ovrResult ovr_SpecifyTrackingOrigin(ovrSession session, ovrPosef originPose)} */
    @NativeType("ovrResult")
    public static int ovr_SpecifyTrackingOrigin(@NativeType("ovrSession") long session, @NativeType("ovrPosef") OVRPosef originPose) {
        if (CHECKS) {
            check(session);
        }
        return novr_SpecifyTrackingOrigin(session, originPose.address());
    }

    // --- [ ovr_ClearShouldRecenterFlag ] ---

    /** {@code void ovr_ClearShouldRecenterFlag(ovrSession session)} */
    public static native void novr_ClearShouldRecenterFlag(long session);

    /** {@code void ovr_ClearShouldRecenterFlag(ovrSession session)} */
    public static void ovr_ClearShouldRecenterFlag(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        novr_ClearShouldRecenterFlag(session);
    }

    // --- [ ovr_GetTrackingState ] ---

    /** {@code ovrTrackingState ovr_GetTrackingState(ovrSession session, double absTime, ovrBool latencyMarker)} */
    public static native void novr_GetTrackingState(long session, double absTime, boolean latencyMarker, long __result);

    /** {@code ovrTrackingState ovr_GetTrackingState(ovrSession session, double absTime, ovrBool latencyMarker)} */
    @NativeType("ovrTrackingState")
    public static OVRTrackingState ovr_GetTrackingState(@NativeType("ovrSession") long session, double absTime, @NativeType("ovrBool") boolean latencyMarker, @NativeType("ovrTrackingState") OVRTrackingState __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetTrackingState(session, absTime, latencyMarker, __result.address());
        return __result;
    }

    // --- [ ovr_GetDevicePoses ] ---

    /** {@code ovrResult ovr_GetDevicePoses(ovrSession session, ovrTrackedDeviceType * deviceTypes, int deviceCount, double absTime, ovrPoseStatef * outDevicePoses)} */
    public static native int novr_GetDevicePoses(long session, long deviceTypes, int deviceCount, double absTime, long outDevicePoses);

    /** {@code ovrResult ovr_GetDevicePoses(ovrSession session, ovrTrackedDeviceType * deviceTypes, int deviceCount, double absTime, ovrPoseStatef * outDevicePoses)} */
    @NativeType("ovrResult")
    public static int ovr_GetDevicePoses(@NativeType("ovrSession") long session, @NativeType("ovrTrackedDeviceType *") IntBuffer deviceTypes, double absTime, @NativeType("ovrPoseStatef *") OVRPoseStatef.Buffer outDevicePoses) {
        if (CHECKS) {
            check(session);
            check(outDevicePoses, deviceTypes.remaining());
        }
        return novr_GetDevicePoses(session, memAddress(deviceTypes), deviceTypes.remaining(), absTime, outDevicePoses.address());
    }

    // --- [ ovr_GetTrackerPose ] ---

    /** {@code ovrTrackerPose ovr_GetTrackerPose(ovrSession session, unsigned int trackerPoseIndex)} */
    public static native void novr_GetTrackerPose(long session, int trackerPoseIndex, long __result);

    /** {@code ovrTrackerPose ovr_GetTrackerPose(ovrSession session, unsigned int trackerPoseIndex)} */
    @NativeType("ovrTrackerPose")
    public static OVRTrackerPose ovr_GetTrackerPose(@NativeType("ovrSession") long session, @NativeType("unsigned int") int trackerPoseIndex, @NativeType("ovrTrackerPose") OVRTrackerPose __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetTrackerPose(session, trackerPoseIndex, __result.address());
        return __result;
    }

    // --- [ ovr_GetInputState ] ---

    /** {@code ovrResult ovr_GetInputState(ovrSession session, ovrControllerType controllerType, ovrInputState * inputState)} */
    public static native int novr_GetInputState(long session, int controllerType, long inputState);

    /** {@code ovrResult ovr_GetInputState(ovrSession session, ovrControllerType controllerType, ovrInputState * inputState)} */
    @NativeType("ovrResult")
    public static int ovr_GetInputState(@NativeType("ovrSession") long session, @NativeType("ovrControllerType") int controllerType, @NativeType("ovrInputState *") OVRInputState inputState) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetInputState(session, controllerType, inputState.address());
    }

    // --- [ ovr_GetConnectedControllerTypes ] ---

    /** {@code unsigned int ovr_GetConnectedControllerTypes(ovrSession session)} */
    public static native int novr_GetConnectedControllerTypes(long session);

    /** {@code unsigned int ovr_GetConnectedControllerTypes(ovrSession session)} */
    @NativeType("unsigned int")
    public static int ovr_GetConnectedControllerTypes(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetConnectedControllerTypes(session);
    }

    // --- [ ovr_GetTouchHapticsDesc ] ---

    /** {@code ovrTouchHapticsDesc ovr_GetTouchHapticsDesc(ovrSession session, ovrControllerType controllerType)} */
    public static native void novr_GetTouchHapticsDesc(long session, int controllerType, long __result);

    /** {@code ovrTouchHapticsDesc ovr_GetTouchHapticsDesc(ovrSession session, ovrControllerType controllerType)} */
    @NativeType("ovrTouchHapticsDesc")
    public static OVRTouchHapticsDesc ovr_GetTouchHapticsDesc(@NativeType("ovrSession") long session, @NativeType("ovrControllerType") int controllerType, @NativeType("ovrTouchHapticsDesc") OVRTouchHapticsDesc __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetTouchHapticsDesc(session, controllerType, __result.address());
        return __result;
    }

    // --- [ ovr_SetControllerVibration ] ---

    /** {@code ovrResult ovr_SetControllerVibration(ovrSession session, ovrControllerType controllerType, float frequency, float amplitude)} */
    public static native int novr_SetControllerVibration(long session, int controllerType, float frequency, float amplitude);

    /** {@code ovrResult ovr_SetControllerVibration(ovrSession session, ovrControllerType controllerType, float frequency, float amplitude)} */
    @NativeType("ovrResult")
    public static int ovr_SetControllerVibration(@NativeType("ovrSession") long session, @NativeType("ovrControllerType") int controllerType, float frequency, float amplitude) {
        if (CHECKS) {
            check(session);
        }
        return novr_SetControllerVibration(session, controllerType, frequency, amplitude);
    }

    // --- [ ovr_SubmitControllerVibration ] ---

    /** {@code ovrResult ovr_SubmitControllerVibration(ovrSession session, ovrControllerType controllerType, ovrHapticsBuffer const * buffer)} */
    public static native int novr_SubmitControllerVibration(long session, int controllerType, long buffer);

    /** {@code ovrResult ovr_SubmitControllerVibration(ovrSession session, ovrControllerType controllerType, ovrHapticsBuffer const * buffer)} */
    @NativeType("ovrResult")
    public static int ovr_SubmitControllerVibration(@NativeType("ovrSession") long session, @NativeType("ovrControllerType") int controllerType, @NativeType("ovrHapticsBuffer const *") OVRHapticsBuffer buffer) {
        if (CHECKS) {
            check(session);
            OVRHapticsBuffer.validate(buffer.address());
        }
        return novr_SubmitControllerVibration(session, controllerType, buffer.address());
    }

    // --- [ ovr_GetControllerVibrationState ] ---

    /** {@code ovrResult ovr_GetControllerVibrationState(ovrSession session, ovrControllerType controllerType, ovrHapticsPlaybackState * outState)} */
    public static native int novr_GetControllerVibrationState(long session, int controllerType, long outState);

    /** {@code ovrResult ovr_GetControllerVibrationState(ovrSession session, ovrControllerType controllerType, ovrHapticsPlaybackState * outState)} */
    @NativeType("ovrResult")
    public static int ovr_GetControllerVibrationState(@NativeType("ovrSession") long session, @NativeType("ovrControllerType") int controllerType, @NativeType("ovrHapticsPlaybackState *") OVRHapticsPlaybackState outState) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetControllerVibrationState(session, controllerType, outState.address());
    }

    // --- [ ovr_TestBoundary ] ---

    /** {@code ovrResult ovr_TestBoundary(ovrSession session, ovrTrackedDeviceType deviceBitmask, ovrBoundaryType boundaryType, ovrBoundaryTestResult * outTestResult)} */
    public static native int novr_TestBoundary(long session, int deviceBitmask, int boundaryType, long outTestResult);

    /** {@code ovrResult ovr_TestBoundary(ovrSession session, ovrTrackedDeviceType deviceBitmask, ovrBoundaryType boundaryType, ovrBoundaryTestResult * outTestResult)} */
    @NativeType("ovrResult")
    public static int ovr_TestBoundary(@NativeType("ovrSession") long session, @NativeType("ovrTrackedDeviceType") int deviceBitmask, @NativeType("ovrBoundaryType") int boundaryType, @NativeType("ovrBoundaryTestResult *") OVRBoundaryTestResult outTestResult) {
        if (CHECKS) {
            check(session);
        }
        return novr_TestBoundary(session, deviceBitmask, boundaryType, outTestResult.address());
    }

    // --- [ ovr_TestBoundaryPoint ] ---

    /** {@code ovrResult ovr_TestBoundaryPoint(ovrSession session, ovrVector3f const * point, ovrBoundaryType singleBoundaryType, ovrBoundaryTestResult * outTestResult)} */
    public static native int novr_TestBoundaryPoint(long session, long point, int singleBoundaryType, long outTestResult);

    /** {@code ovrResult ovr_TestBoundaryPoint(ovrSession session, ovrVector3f const * point, ovrBoundaryType singleBoundaryType, ovrBoundaryTestResult * outTestResult)} */
    @NativeType("ovrResult")
    public static int ovr_TestBoundaryPoint(@NativeType("ovrSession") long session, @NativeType("ovrVector3f const *") OVRVector3f point, @NativeType("ovrBoundaryType") int singleBoundaryType, @NativeType("ovrBoundaryTestResult *") OVRBoundaryTestResult outTestResult) {
        if (CHECKS) {
            check(session);
        }
        return novr_TestBoundaryPoint(session, point.address(), singleBoundaryType, outTestResult.address());
    }

    // --- [ ovr_SetBoundaryLookAndFeel ] ---

    /** {@code ovrResult ovr_SetBoundaryLookAndFeel(ovrSession session, ovrBoundaryLookAndFeel const * lookAndFeel)} */
    public static native int novr_SetBoundaryLookAndFeel(long session, long lookAndFeel);

    /** {@code ovrResult ovr_SetBoundaryLookAndFeel(ovrSession session, ovrBoundaryLookAndFeel const * lookAndFeel)} */
    @NativeType("ovrResult")
    public static int ovr_SetBoundaryLookAndFeel(@NativeType("ovrSession") long session, @NativeType("ovrBoundaryLookAndFeel const *") OVRBoundaryLookAndFeel lookAndFeel) {
        if (CHECKS) {
            check(session);
        }
        return novr_SetBoundaryLookAndFeel(session, lookAndFeel.address());
    }

    // --- [ ovr_ResetBoundaryLookAndFeel ] ---

    /** {@code ovrResult ovr_ResetBoundaryLookAndFeel(ovrSession session)} */
    public static native int novr_ResetBoundaryLookAndFeel(long session);

    /** {@code ovrResult ovr_ResetBoundaryLookAndFeel(ovrSession session)} */
    @NativeType("ovrResult")
    public static int ovr_ResetBoundaryLookAndFeel(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_ResetBoundaryLookAndFeel(session);
    }

    // --- [ ovr_GetBoundaryGeometry ] ---

    /** {@code ovrResult ovr_GetBoundaryGeometry(ovrSession session, ovrBoundaryType boundaryType, ovrVector3f * outFloorPoints, int * outFloorPointsCount)} */
    public static native int novr_GetBoundaryGeometry(long session, int boundaryType, long outFloorPoints, long outFloorPointsCount);

    /** {@code ovrResult ovr_GetBoundaryGeometry(ovrSession session, ovrBoundaryType boundaryType, ovrVector3f * outFloorPoints, int * outFloorPointsCount)} */
    @NativeType("ovrResult")
    public static int ovr_GetBoundaryGeometry(@NativeType("ovrSession") long session, @NativeType("ovrBoundaryType") int boundaryType, @NativeType("ovrVector3f *") @Nullable OVRVector3f outFloorPoints, @NativeType("int *") @Nullable IntBuffer outFloorPointsCount) {
        if (CHECKS) {
            check(session);
            checkSafe(outFloorPointsCount, 1);
        }
        return novr_GetBoundaryGeometry(session, boundaryType, memAddressSafe(outFloorPoints), memAddressSafe(outFloorPointsCount));
    }

    // --- [ ovr_GetBoundaryDimensions ] ---

    /** {@code ovrResult ovr_GetBoundaryDimensions(ovrSession session, ovrBoundaryType boundaryType, ovrVector3f * outDimensions)} */
    public static native int novr_GetBoundaryDimensions(long session, int boundaryType, long outDimensions);

    /** {@code ovrResult ovr_GetBoundaryDimensions(ovrSession session, ovrBoundaryType boundaryType, ovrVector3f * outDimensions)} */
    @NativeType("ovrResult")
    public static int ovr_GetBoundaryDimensions(@NativeType("ovrSession") long session, @NativeType("ovrBoundaryType") int boundaryType, @NativeType("ovrVector3f *") OVRVector3f outDimensions) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetBoundaryDimensions(session, boundaryType, outDimensions.address());
    }

    // --- [ ovr_GetBoundaryVisible ] ---

    /** {@code ovrResult ovr_GetBoundaryVisible(ovrSession session, ovrBool * outIsVisible)} */
    public static native int novr_GetBoundaryVisible(long session, long outIsVisible);

    /** {@code ovrResult ovr_GetBoundaryVisible(ovrSession session, ovrBool * outIsVisible)} */
    @NativeType("ovrResult")
    public static int ovr_GetBoundaryVisible(@NativeType("ovrSession") long session, @NativeType("ovrBool *") ByteBuffer outIsVisible) {
        if (CHECKS) {
            check(session);
            check(outIsVisible, 1);
        }
        return novr_GetBoundaryVisible(session, memAddress(outIsVisible));
    }

    // --- [ ovr_RequestBoundaryVisible ] ---

    /** {@code ovrResult ovr_RequestBoundaryVisible(ovrSession session, ovrBool visible)} */
    public static native int novr_RequestBoundaryVisible(long session, boolean visible);

    /** {@code ovrResult ovr_RequestBoundaryVisible(ovrSession session, ovrBool visible)} */
    @NativeType("ovrResult")
    public static int ovr_RequestBoundaryVisible(@NativeType("ovrSession") long session, @NativeType("ovrBool") boolean visible) {
        if (CHECKS) {
            check(session);
        }
        return novr_RequestBoundaryVisible(session, visible);
    }

    // --- [ ovr_GetExternalCameras ] ---

    /** {@code ovrResult ovr_GetExternalCameras(ovrSession session, ovrExternalCamera * cameras, unsigned int * inoutCameraCount)} */
    public static native int novr_GetExternalCameras(long session, long cameras, long inoutCameraCount);

    /** {@code ovrResult ovr_GetExternalCameras(ovrSession session, ovrExternalCamera * cameras, unsigned int * inoutCameraCount)} */
    @NativeType("ovrResult")
    public static int ovr_GetExternalCameras(@NativeType("ovrSession") long session, @NativeType("ovrExternalCamera *") OVRExternalCamera.@Nullable Buffer cameras, @NativeType("unsigned int *") IntBuffer inoutCameraCount) {
        if (CHECKS) {
            check(session);
            check(inoutCameraCount, 1);
            checkSafe(cameras, inoutCameraCount.get(inoutCameraCount.position()));
        }
        return novr_GetExternalCameras(session, memAddressSafe(cameras), memAddress(inoutCameraCount));
    }

    // --- [ ovr_SetExternalCameraProperties ] ---

    /** {@code ovrResult ovr_SetExternalCameraProperties(ovrSession session, char const * name, ovrCameraIntrinsics const * const intrinsics, ovrCameraExtrinsics const * const extrinsics)} */
    public static native int novr_SetExternalCameraProperties(long session, long name, long intrinsics, long extrinsics);

    /** {@code ovrResult ovr_SetExternalCameraProperties(ovrSession session, char const * name, ovrCameraIntrinsics const * const intrinsics, ovrCameraExtrinsics const * const extrinsics)} */
    @NativeType("ovrResult")
    public static int ovr_SetExternalCameraProperties(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer name, @NativeType("ovrCameraIntrinsics const * const") OVRCameraIntrinsics intrinsics, @NativeType("ovrCameraExtrinsics const * const") OVRCameraExtrinsics extrinsics) {
        if (CHECKS) {
            check(session);
            checkNT1(name);
        }
        return novr_SetExternalCameraProperties(session, memAddress(name), intrinsics.address(), extrinsics.address());
    }

    /** {@code ovrResult ovr_SetExternalCameraProperties(ovrSession session, char const * name, ovrCameraIntrinsics const * const intrinsics, ovrCameraExtrinsics const * const extrinsics)} */
    @NativeType("ovrResult")
    public static int ovr_SetExternalCameraProperties(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence name, @NativeType("ovrCameraIntrinsics const * const") OVRCameraIntrinsics intrinsics, @NativeType("ovrCameraExtrinsics const * const") OVRCameraExtrinsics extrinsics) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return novr_SetExternalCameraProperties(session, nameEncoded, intrinsics.address(), extrinsics.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetTextureSwapChainLength ] ---

    /** {@code ovrResult ovr_GetTextureSwapChainLength(ovrSession session, ovrTextureSwapChain chain, int * out_Length)} */
    public static native int novr_GetTextureSwapChainLength(long session, long chain, long out_Length);

    /** {@code ovrResult ovr_GetTextureSwapChainLength(ovrSession session, ovrTextureSwapChain chain, int * out_Length)} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainLength(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, @NativeType("int *") IntBuffer out_Length) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Length, 1);
        }
        return novr_GetTextureSwapChainLength(session, chain, memAddress(out_Length));
    }

    // --- [ ovr_GetTextureSwapChainCurrentIndex ] ---

    /** {@code ovrResult ovr_GetTextureSwapChainCurrentIndex(ovrSession session, ovrTextureSwapChain chain, int * out_Index)} */
    public static native int novr_GetTextureSwapChainCurrentIndex(long session, long chain, long out_Index);

    /** {@code ovrResult ovr_GetTextureSwapChainCurrentIndex(ovrSession session, ovrTextureSwapChain chain, int * out_Index)} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainCurrentIndex(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, @NativeType("int *") IntBuffer out_Index) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Index, 1);
        }
        return novr_GetTextureSwapChainCurrentIndex(session, chain, memAddress(out_Index));
    }

    // --- [ ovr_GetTextureSwapChainDesc ] ---

    /** {@code ovrResult ovr_GetTextureSwapChainDesc(ovrSession session, ovrTextureSwapChain chain, ovrTextureSwapChainDesc * out_Desc)} */
    public static native int novr_GetTextureSwapChainDesc(long session, long chain, long out_Desc);

    /** {@code ovrResult ovr_GetTextureSwapChainDesc(ovrSession session, ovrTextureSwapChain chain, ovrTextureSwapChainDesc * out_Desc)} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainDesc(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, @NativeType("ovrTextureSwapChainDesc *") OVRTextureSwapChainDesc out_Desc) {
        if (CHECKS) {
            check(session);
            check(chain);
        }
        return novr_GetTextureSwapChainDesc(session, chain, out_Desc.address());
    }

    // --- [ ovr_CommitTextureSwapChain ] ---

    /** {@code ovrResult ovr_CommitTextureSwapChain(ovrSession session, ovrTextureSwapChain chain)} */
    public static native int novr_CommitTextureSwapChain(long session, long chain);

    /** {@code ovrResult ovr_CommitTextureSwapChain(ovrSession session, ovrTextureSwapChain chain)} */
    @NativeType("ovrResult")
    public static int ovr_CommitTextureSwapChain(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain) {
        if (CHECKS) {
            check(session);
            check(chain);
        }
        return novr_CommitTextureSwapChain(session, chain);
    }

    // --- [ ovr_DestroyTextureSwapChain ] ---

    /** {@code void ovr_DestroyTextureSwapChain(ovrSession session, ovrTextureSwapChain chain)} */
    public static native void novr_DestroyTextureSwapChain(long session, long chain);

    /** {@code void ovr_DestroyTextureSwapChain(ovrSession session, ovrTextureSwapChain chain)} */
    public static void ovr_DestroyTextureSwapChain(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain) {
        if (CHECKS) {
            check(session);
        }
        novr_DestroyTextureSwapChain(session, chain);
    }

    // --- [ ovr_DestroyMirrorTexture ] ---

    /** {@code void ovr_DestroyMirrorTexture(ovrSession session, ovrMirrorTexture mirrorTexture)} */
    public static native void novr_DestroyMirrorTexture(long session, long mirrorTexture);

    /** {@code void ovr_DestroyMirrorTexture(ovrSession session, ovrMirrorTexture mirrorTexture)} */
    public static void ovr_DestroyMirrorTexture(@NativeType("ovrSession") long session, @NativeType("ovrMirrorTexture") long mirrorTexture) {
        if (CHECKS) {
            check(session);
        }
        novr_DestroyMirrorTexture(session, mirrorTexture);
    }

    // --- [ ovr_GetFovTextureSize ] ---

    /** {@code ovrSizei ovr_GetFovTextureSize(ovrSession session, ovrEyeType eye, ovrFovPort fov, float pixelsPerDisplayPixel)} */
    public static native void novr_GetFovTextureSize(long session, int eye, long fov, float pixelsPerDisplayPixel, long __result);

    /** {@code ovrSizei ovr_GetFovTextureSize(ovrSession session, ovrEyeType eye, ovrFovPort fov, float pixelsPerDisplayPixel)} */
    @NativeType("ovrSizei")
    public static OVRSizei ovr_GetFovTextureSize(@NativeType("ovrSession") long session, @NativeType("ovrEyeType") int eye, @NativeType("ovrFovPort") OVRFovPort fov, float pixelsPerDisplayPixel, @NativeType("ovrSizei") OVRSizei __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetFovTextureSize(session, eye, fov.address(), pixelsPerDisplayPixel, __result.address());
        return __result;
    }

    // --- [ ovr_GetRenderDesc ] ---

    /** {@code ovrEyeRenderDesc ovr_GetRenderDesc(ovrSession session, ovrEyeType eyeType, ovrFovPort fov)} */
    public static native void novr_GetRenderDesc(long session, int eyeType, long fov, long __result);

    /** {@code ovrEyeRenderDesc ovr_GetRenderDesc(ovrSession session, ovrEyeType eyeType, ovrFovPort fov)} */
    @NativeType("ovrEyeRenderDesc")
    public static OVREyeRenderDesc ovr_GetRenderDesc(@NativeType("ovrSession") long session, @NativeType("ovrEyeType") int eyeType, @NativeType("ovrFovPort") OVRFovPort fov, @NativeType("ovrEyeRenderDesc") OVREyeRenderDesc __result) {
        if (CHECKS) {
            check(session);
        }
        novr_GetRenderDesc(session, eyeType, fov.address(), __result.address());
        return __result;
    }

    // --- [ ovr_GetFovStencil ] ---

    /** {@code ovrResult ovr_GetFovStencil(ovrSession session, ovrFovStencilDesc const * fovStencilDesc, ovrFovStencilMeshBuffer * meshBuffer)} */
    public static native int novr_GetFovStencil(long session, long fovStencilDesc, long meshBuffer);

    /** {@code ovrResult ovr_GetFovStencil(ovrSession session, ovrFovStencilDesc const * fovStencilDesc, ovrFovStencilMeshBuffer * meshBuffer)} */
    @NativeType("ovrResult")
    public static int ovr_GetFovStencil(@NativeType("ovrSession") long session, @NativeType("ovrFovStencilDesc const *") OVRFovStencilDesc fovStencilDesc, @NativeType("ovrFovStencilMeshBuffer *") OVRFovStencilMeshBuffer meshBuffer) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetFovStencil(session, fovStencilDesc.address(), meshBuffer.address());
    }

    // --- [ ovr_WaitToBeginFrame ] ---

    /** {@code ovrResult ovr_WaitToBeginFrame(ovrSession session, long long frameIndex)} */
    public static native int novr_WaitToBeginFrame(long session, long frameIndex);

    /** {@code ovrResult ovr_WaitToBeginFrame(ovrSession session, long long frameIndex)} */
    @NativeType("ovrResult")
    public static int ovr_WaitToBeginFrame(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex) {
        if (CHECKS) {
            check(session);
        }
        return novr_WaitToBeginFrame(session, frameIndex);
    }

    // --- [ ovr_BeginFrame ] ---

    /** {@code ovrResult ovr_BeginFrame(ovrSession session, long long frameIndex)} */
    public static native int novr_BeginFrame(long session, long frameIndex);

    /** {@code ovrResult ovr_BeginFrame(ovrSession session, long long frameIndex)} */
    @NativeType("ovrResult")
    public static int ovr_BeginFrame(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex) {
        if (CHECKS) {
            check(session);
        }
        return novr_BeginFrame(session, frameIndex);
    }

    // --- [ ovr_EndFrame ] ---

    /** {@code ovrResult ovr_EndFrame(ovrSession session, long long frameIndex, ovrViewScaleDesc const * viewScaleDesc, ovrLayerHeader const * const * layerPtrList, unsigned int layerCount)} */
    public static native int novr_EndFrame(long session, long frameIndex, long viewScaleDesc, long layerPtrList, int layerCount);

    /** {@code ovrResult ovr_EndFrame(ovrSession session, long long frameIndex, ovrViewScaleDesc const * viewScaleDesc, ovrLayerHeader const * const * layerPtrList, unsigned int layerCount)} */
    @NativeType("ovrResult")
    public static int ovr_EndFrame(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex, @NativeType("ovrViewScaleDesc const *") @Nullable OVRViewScaleDesc viewScaleDesc, @NativeType("ovrLayerHeader const * const *") PointerBuffer layerPtrList) {
        if (CHECKS) {
            check(session);
        }
        return novr_EndFrame(session, frameIndex, memAddressSafe(viewScaleDesc), memAddress(layerPtrList), layerPtrList.remaining());
    }

    // --- [ ovr_SubmitFrame ] ---

    /** {@code ovrResult ovr_SubmitFrame(ovrSession session, long long frameIndex, ovrViewScaleDesc const * viewScaleDesc, ovrLayerHeader const * const * layerPtrList, unsigned int layerCount)} */
    public static native int novr_SubmitFrame(long session, long frameIndex, long viewScaleDesc, long layerPtrList, int layerCount);

    /** {@code ovrResult ovr_SubmitFrame(ovrSession session, long long frameIndex, ovrViewScaleDesc const * viewScaleDesc, ovrLayerHeader const * const * layerPtrList, unsigned int layerCount)} */
    @NativeType("ovrResult")
    public static int ovr_SubmitFrame(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex, @NativeType("ovrViewScaleDesc const *") @Nullable OVRViewScaleDesc viewScaleDesc, @NativeType("ovrLayerHeader const * const *") PointerBuffer layerPtrList) {
        if (CHECKS) {
            check(session);
        }
        return novr_SubmitFrame(session, frameIndex, memAddressSafe(viewScaleDesc), memAddress(layerPtrList), layerPtrList.remaining());
    }

    // --- [ ovr_GetPerfStats ] ---

    /** {@code ovrResult ovr_GetPerfStats(ovrSession session, ovrPerfStats * outStats)} */
    public static native int novr_GetPerfStats(long session, long outStats);

    /** {@code ovrResult ovr_GetPerfStats(ovrSession session, ovrPerfStats * outStats)} */
    @NativeType("ovrResult")
    public static int ovr_GetPerfStats(@NativeType("ovrSession") long session, @NativeType("ovrPerfStats *") OVRPerfStats outStats) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetPerfStats(session, outStats.address());
    }

    // --- [ ovr_ResetPerfStats ] ---

    /** {@code ovrResult ovr_ResetPerfStats(ovrSession session)} */
    public static native int novr_ResetPerfStats(long session);

    /** {@code ovrResult ovr_ResetPerfStats(ovrSession session)} */
    @NativeType("ovrResult")
    public static int ovr_ResetPerfStats(@NativeType("ovrSession") long session) {
        if (CHECKS) {
            check(session);
        }
        return novr_ResetPerfStats(session);
    }

    // --- [ ovr_GetPredictedDisplayTime ] ---

    /** {@code double ovr_GetPredictedDisplayTime(ovrSession session, long long frameIndex)} */
    public static native double novr_GetPredictedDisplayTime(long session, long frameIndex);

    /** {@code double ovr_GetPredictedDisplayTime(ovrSession session, long long frameIndex)} */
    public static double ovr_GetPredictedDisplayTime(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex) {
        if (CHECKS) {
            check(session);
        }
        return novr_GetPredictedDisplayTime(session, frameIndex);
    }

    // --- [ ovr_GetTimeInSeconds ] ---

    /** {@code double ovr_GetTimeInSeconds(void)} */
    public static native double ovr_GetTimeInSeconds();

    // --- [ ovr_GetBool ] ---

    /** {@code ovrBool ovr_GetBool(ovrSession session, char const * propertyName, ovrBool defaultVal)} */
    public static native boolean novr_GetBool(long session, long propertyName, boolean defaultVal);

    /** {@code ovrBool ovr_GetBool(ovrSession session, char const * propertyName, ovrBool defaultVal)} */
    @NativeType("ovrBool")
    public static boolean ovr_GetBool(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("ovrBool") boolean defaultVal) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_GetBool(session, memAddress(propertyName), defaultVal);
    }

    /** {@code ovrBool ovr_GetBool(ovrSession session, char const * propertyName, ovrBool defaultVal)} */
    @NativeType("ovrBool")
    public static boolean ovr_GetBool(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("ovrBool") boolean defaultVal) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_GetBool(session, propertyNameEncoded, defaultVal);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_SetBool ] ---

    /** {@code ovrBool ovr_SetBool(ovrSession session, char const * propertyName, ovrBool value)} */
    public static native boolean novr_SetBool(long session, long propertyName, boolean value);

    /** {@code ovrBool ovr_SetBool(ovrSession session, char const * propertyName, ovrBool value)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetBool(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("ovrBool") boolean value) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_SetBool(session, memAddress(propertyName), value);
    }

    /** {@code ovrBool ovr_SetBool(ovrSession session, char const * propertyName, ovrBool value)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetBool(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("ovrBool") boolean value) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_SetBool(session, propertyNameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetInt ] ---

    /** {@code int ovr_GetInt(ovrSession session, char const * propertyName, int defaultVal)} */
    public static native int novr_GetInt(long session, long propertyName, int defaultVal);

    /** {@code int ovr_GetInt(ovrSession session, char const * propertyName, int defaultVal)} */
    public static int ovr_GetInt(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, int defaultVal) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_GetInt(session, memAddress(propertyName), defaultVal);
    }

    /** {@code int ovr_GetInt(ovrSession session, char const * propertyName, int defaultVal)} */
    public static int ovr_GetInt(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, int defaultVal) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_GetInt(session, propertyNameEncoded, defaultVal);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_SetInt ] ---

    /** {@code ovrBool ovr_SetInt(ovrSession session, char const * propertyName, int value)} */
    public static native boolean novr_SetInt(long session, long propertyName, int value);

    /** {@code ovrBool ovr_SetInt(ovrSession session, char const * propertyName, int value)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetInt(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, int value) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_SetInt(session, memAddress(propertyName), value);
    }

    /** {@code ovrBool ovr_SetInt(ovrSession session, char const * propertyName, int value)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetInt(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, int value) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_SetInt(session, propertyNameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetFloat ] ---

    /** {@code float ovr_GetFloat(ovrSession session, char const * propertyName, float defaultVal)} */
    public static native float novr_GetFloat(long session, long propertyName, float defaultVal);

    /** {@code float ovr_GetFloat(ovrSession session, char const * propertyName, float defaultVal)} */
    public static float ovr_GetFloat(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, float defaultVal) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_GetFloat(session, memAddress(propertyName), defaultVal);
    }

    /** {@code float ovr_GetFloat(ovrSession session, char const * propertyName, float defaultVal)} */
    public static float ovr_GetFloat(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, float defaultVal) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_GetFloat(session, propertyNameEncoded, defaultVal);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_SetFloat ] ---

    /** {@code ovrBool ovr_SetFloat(ovrSession session, char const * propertyName, float value)} */
    public static native boolean novr_SetFloat(long session, long propertyName, float value);

    /** {@code ovrBool ovr_SetFloat(ovrSession session, char const * propertyName, float value)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloat(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, float value) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_SetFloat(session, memAddress(propertyName), value);
    }

    /** {@code ovrBool ovr_SetFloat(ovrSession session, char const * propertyName, float value)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloat(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, float value) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_SetFloat(session, propertyNameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetFloatArray ] ---

    /** {@code unsigned int ovr_GetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesCapacity)} */
    public static native int novr_GetFloatArray(long session, long propertyName, long values, int valuesCapacity);

    /** {@code unsigned int ovr_GetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesCapacity)} */
    @NativeType("unsigned int")
    public static int ovr_GetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("float *") FloatBuffer values) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_GetFloatArray(session, memAddress(propertyName), memAddress(values), values.remaining());
    }

    /** {@code unsigned int ovr_GetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesCapacity)} */
    @NativeType("unsigned int")
    public static int ovr_GetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("float *") FloatBuffer values) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_GetFloatArray(session, propertyNameEncoded, memAddress(values), values.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_SetFloatArray ] ---

    /** {@code ovrBool ovr_SetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesSize)} */
    public static native boolean novr_SetFloatArray(long session, long propertyName, long values, int valuesSize);

    /** {@code ovrBool ovr_SetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesSize)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("float *") FloatBuffer values) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_SetFloatArray(session, memAddress(propertyName), memAddress(values), values.remaining());
    }

    /** {@code ovrBool ovr_SetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesSize)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("float *") FloatBuffer values) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_SetFloatArray(session, propertyNameEncoded, memAddress(values), values.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_GetString ] ---

    /** {@code char const * ovr_GetString(ovrSession session, char const * propertyName, char const * defaultVal)} */
    public static native long novr_GetString(long session, long propertyName, long defaultVal);

    /** {@code char const * ovr_GetString(ovrSession session, char const * propertyName, char const * defaultVal)} */
    @NativeType("char const *")
    public static @Nullable String ovr_GetString(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("char const *") @Nullable ByteBuffer defaultVal) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
            checkNT1Safe(defaultVal);
        }
        long __result = novr_GetString(session, memAddress(propertyName), memAddressSafe(defaultVal));
        return memUTF8Safe(__result);
    }

    /** {@code char const * ovr_GetString(ovrSession session, char const * propertyName, char const * defaultVal)} */
    @NativeType("char const *")
    public static @Nullable String ovr_GetString(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("char const *") @Nullable CharSequence defaultVal) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(defaultVal, true);
            long defaultValEncoded = defaultVal == null ? NULL : stack.getPointerAddress();
            long __result = novr_GetString(session, propertyNameEncoded, defaultValEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ovr_SetString ] ---

    /** {@code ovrBool ovr_SetString(ovrSession hmddesc, char const * propertyName, char const * value)} */
    public static native boolean novr_SetString(long hmddesc, long propertyName, long value);

    /** {@code ovrBool ovr_SetString(ovrSession hmddesc, char const * propertyName, char const * value)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetString(@NativeType("ovrSession") long hmddesc, @NativeType("char const *") ByteBuffer propertyName, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            check(hmddesc);
            checkNT1(propertyName);
            checkNT1(value);
        }
        return novr_SetString(hmddesc, memAddress(propertyName), memAddress(value));
    }

    /** {@code ovrBool ovr_SetString(ovrSession hmddesc, char const * propertyName, char const * value)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetString(@NativeType("ovrSession") long hmddesc, @NativeType("char const *") CharSequence propertyName, @NativeType("char const *") CharSequence value) {
        if (CHECKS) {
            check(hmddesc);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            stack.nASCII(value, true);
            long valueEncoded = stack.getPointerAddress();
            return novr_SetString(hmddesc, propertyNameEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code ovrResult ovr_GetDevicePoses(ovrSession session, ovrTrackedDeviceType * deviceTypes, int deviceCount, double absTime, ovrPoseStatef * outDevicePoses)} */
    public static native int novr_GetDevicePoses(long session, int[] deviceTypes, int deviceCount, double absTime, long outDevicePoses);

    /** {@code ovrResult ovr_GetDevicePoses(ovrSession session, ovrTrackedDeviceType * deviceTypes, int deviceCount, double absTime, ovrPoseStatef * outDevicePoses)} */
    @NativeType("ovrResult")
    public static int ovr_GetDevicePoses(@NativeType("ovrSession") long session, @NativeType("ovrTrackedDeviceType *") int[] deviceTypes, double absTime, @NativeType("ovrPoseStatef *") OVRPoseStatef.Buffer outDevicePoses) {
        if (CHECKS) {
            check(session);
            check(outDevicePoses, deviceTypes.length);
        }
        return novr_GetDevicePoses(session, deviceTypes, deviceTypes.length, absTime, outDevicePoses.address());
    }

    /** {@code ovrResult ovr_GetBoundaryGeometry(ovrSession session, ovrBoundaryType boundaryType, ovrVector3f * outFloorPoints, int * outFloorPointsCount)} */
    public static native int novr_GetBoundaryGeometry(long session, int boundaryType, long outFloorPoints, int[] outFloorPointsCount);

    /** {@code ovrResult ovr_GetBoundaryGeometry(ovrSession session, ovrBoundaryType boundaryType, ovrVector3f * outFloorPoints, int * outFloorPointsCount)} */
    @NativeType("ovrResult")
    public static int ovr_GetBoundaryGeometry(@NativeType("ovrSession") long session, @NativeType("ovrBoundaryType") int boundaryType, @NativeType("ovrVector3f *") @Nullable OVRVector3f outFloorPoints, @NativeType("int *") int @Nullable [] outFloorPointsCount) {
        if (CHECKS) {
            check(session);
            checkSafe(outFloorPointsCount, 1);
        }
        return novr_GetBoundaryGeometry(session, boundaryType, memAddressSafe(outFloorPoints), outFloorPointsCount);
    }

    /** {@code ovrResult ovr_GetExternalCameras(ovrSession session, ovrExternalCamera * cameras, unsigned int * inoutCameraCount)} */
    public static native int novr_GetExternalCameras(long session, long cameras, int[] inoutCameraCount);

    /** {@code ovrResult ovr_GetExternalCameras(ovrSession session, ovrExternalCamera * cameras, unsigned int * inoutCameraCount)} */
    @NativeType("ovrResult")
    public static int ovr_GetExternalCameras(@NativeType("ovrSession") long session, @NativeType("ovrExternalCamera *") OVRExternalCamera.@Nullable Buffer cameras, @NativeType("unsigned int *") int[] inoutCameraCount) {
        if (CHECKS) {
            check(session);
            check(inoutCameraCount, 1);
            checkSafe(cameras, inoutCameraCount[0]);
        }
        return novr_GetExternalCameras(session, memAddressSafe(cameras), inoutCameraCount);
    }

    /** {@code ovrResult ovr_GetTextureSwapChainLength(ovrSession session, ovrTextureSwapChain chain, int * out_Length)} */
    public static native int novr_GetTextureSwapChainLength(long session, long chain, int[] out_Length);

    /** {@code ovrResult ovr_GetTextureSwapChainLength(ovrSession session, ovrTextureSwapChain chain, int * out_Length)} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainLength(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, @NativeType("int *") int[] out_Length) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Length, 1);
        }
        return novr_GetTextureSwapChainLength(session, chain, out_Length);
    }

    /** {@code ovrResult ovr_GetTextureSwapChainCurrentIndex(ovrSession session, ovrTextureSwapChain chain, int * out_Index)} */
    public static native int novr_GetTextureSwapChainCurrentIndex(long session, long chain, int[] out_Index);

    /** {@code ovrResult ovr_GetTextureSwapChainCurrentIndex(ovrSession session, ovrTextureSwapChain chain, int * out_Index)} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainCurrentIndex(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, @NativeType("int *") int[] out_Index) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Index, 1);
        }
        return novr_GetTextureSwapChainCurrentIndex(session, chain, out_Index);
    }

    /** {@code unsigned int ovr_GetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesCapacity)} */
    public static native int novr_GetFloatArray(long session, long propertyName, float[] values, int valuesCapacity);

    /** {@code unsigned int ovr_GetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesCapacity)} */
    @NativeType("unsigned int")
    public static int ovr_GetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("float *") float[] values) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_GetFloatArray(session, memAddress(propertyName), values, values.length);
    }

    /** {@code unsigned int ovr_GetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesCapacity)} */
    @NativeType("unsigned int")
    public static int ovr_GetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("float *") float[] values) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_GetFloatArray(session, propertyNameEncoded, values, values.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code ovrBool ovr_SetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesSize)} */
    public static native boolean novr_SetFloatArray(long session, long propertyName, float[] values, int valuesSize);

    /** {@code ovrBool ovr_SetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesSize)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") ByteBuffer propertyName, @NativeType("float *") float[] values) {
        if (CHECKS) {
            check(session);
            checkNT1(propertyName);
        }
        return novr_SetFloatArray(session, memAddress(propertyName), values, values.length);
    }

    /** {@code ovrBool ovr_SetFloatArray(ovrSession session, char const * propertyName, float * values, unsigned int valuesSize)} */
    @NativeType("ovrBool")
    public static boolean ovr_SetFloatArray(@NativeType("ovrSession") long session, @NativeType("char const *") CharSequence propertyName, @NativeType("float *") float[] values) {
        if (CHECKS) {
            check(session);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(propertyName, true);
            long propertyNameEncoded = stack.getPointerAddress();
            return novr_SetFloatArray(session, propertyNameEncoded, values, values.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}