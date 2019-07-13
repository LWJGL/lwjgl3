/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Because the OpenVR API causes the game to connect to any attached VR hardware, it is not initialized automatically. To initialize the API and get
 * access to the {@code IVRSystem} interface call the {@link #VR_InitInternal InitInternal} function and pass the returned token to {@link OpenVR#create}. To close down your
 * connection to the hardware and release your {@code IVRSystem} interface, call {@link #VR_ShutdownInternal ShutdownInternal}.
 */
public class VR {

    /** OpenVR version. */
    public static final int
        k_nSteamVRVersionMajor = 1,
        k_nSteamVRVersionMinor = 3,
        k_nSteamVRVersionBuild = 22;

    /** OpenVR constants. */
    public static final int
        k_nDriverNone                    = -1,
        k_unMaxDriverDebugResponseSize   = 32768,
        k_unTrackedDeviceIndex_Hmd       = 0,
        k_unMaxTrackedDeviceCount        = 64,
        k_unTrackedDeviceIndexOther      = 0xFFFFFFFE,
        k_unTrackedDeviceIndexInvalid    = 0xFFFFFFFF,
        k_unInvalidPropertyTag           = 0,
        k_unFloatPropertyTag             = 1,
        k_unInt32PropertyTag             = 2,
        k_unUint64PropertyTag            = 3,
        k_unBoolPropertyTag              = 4,
        k_unStringPropertyTag            = 5,
        k_unHmdMatrix34PropertyTag       = 20,
        k_unHmdMatrix44PropertyTag       = 21,
        k_unHmdVector3PropertyTag        = 22,
        k_unHmdVector4PropertyTag        = 23,
        k_unHmdVector2PropertyTag        = 24,
        k_unHmdQuadPropertyTag           = 25,
        k_unHiddenAreaPropertyTag        = 30,
        k_unPathHandleInfoTag            = 31,
        k_unActionPropertyTag            = 32,
        k_unInputValuePropertyTag        = 33,
        k_unWildcardPropertyTag          = 34,
        k_unHapticVibrationPropertyTag   = 35,
        k_unSkeletonPropertyTag          = 36,
        k_unSpatialAnchorPosePropertyTag = 40,
        k_unJsonPropertyTag              = 41,
        k_unActiveActionSetPropertyTag   = 42,
        k_unOpenVRInternalReserved_Start = 1000,
        k_unOpenVRInternalReserved_End   = 10000,
        k_unScreenshotHandleInvalid      = 0,
        k_unNotificationTextMaxSize      = 256,
        k_unMaxActionNameLength          = 64,
        k_unMaxActionSetNameLength       = 64,
        k_unMaxActionOriginCount         = 16,
        k_unMaxBoneNameLength            = 32;

    /** OpenVR constants. */
    public static final long
        k_ulInvalidPropertyContainer   = 0L,
        k_ulInvalidDriverHandle        = 0L,
        k_ulOverlayHandleInvalid       = 0L,
        k_ulInvalidActionHandle        = 0L,
        k_ulInvalidActionSetHandle     = 0L,
        k_ulInvalidInputValueHandle    = 0L,
        k_ulInvalidIOBufferHandle      = 0L,
        k_ulInvalidSpatialAnchorHandle = 0L;

    /** No string property will ever be longer than this length. */
    public static final int k_unMaxPropertyStringSize = 32768;

    public static final int k_unMaxDistortionFunctionParameters = 8;

    /** The number of axes in the controller state. */
    public static final int k_unControllerStateAxisCount = 5;

    /** The maximum length of an application key. */
    public static final int k_unMaxApplicationKeyLength = 128;

    /** The maximum length of an overlay key in bytes, counting the terminating null character. */
    public static final int k_unVROverlayMaxKeyLength = 128;

    /** The maximum length of an overlay name in bytes, counting the terminating null character. */
    public static final int k_unVROverlayMaxNameLength = 128;

    /** The maximum number of overlays that can exist in the system at one time. */
    public static final int k_unMaxOverlayCount = 64;

    /** The maximum number of overlay intersection mask primitives per overlay. */
    public static final int k_unMaxOverlayIntersectionMaskPrimitivesCount = 32;

    /** The maximum length of a settings key. */
    public static final int k_unMaxSettingsKeyLength = 128;

    /** OpenVR constants. */
    public static final String
        IVRSystem_Version                                              = "IVRSystem_019",
        IVRExtendedDisplay_Version                                     = "IVRExtendedDisplay_001",
        IVRTrackedCamera_Version                                       = "IVRTrackedCamera_005",
        k_pch_MimeType_HomeApp                                         = "vr/home",
        k_pch_MimeType_GameTheater                                     = "vr/game_theater",
        IVRApplications_Version                                        = "IVRApplications_006",
        IVRChaperone_Version                                           = "IVRChaperone_003",
        IVRChaperoneSetup_Version                                      = "IVRChaperoneSetup_006",
        IVRCompositor_Version                                          = "IVRCompositor_022",
        IVROverlay_Version                                             = "IVROverlay_019",
        k_pch_Controller_Component_GDC2015                             = "gdc2015",
        k_pch_Controller_Component_Base                                = "base",
        k_pch_Controller_Component_Tip                                 = "tip",
        k_pch_Controller_Component_HandGrip                            = "handgrip",
        k_pch_Controller_Component_Status                              = "status",
        IVRRenderModels_Version                                        = "IVRRenderModels_006",
        IVRNotifications_Version                                       = "IVRNotifications_002",
        IVRSettings_Version                                            = "IVRSettings_002",
        k_pch_SteamVR_Section                                          = "steamvr",
        k_pch_SteamVR_RequireHmd_String                                = "requireHmd",
        k_pch_SteamVR_ForcedDriverKey_String                           = "forcedDriver",
        k_pch_SteamVR_ForcedHmdKey_String                              = "forcedHmd",
        k_pch_SteamVR_DisplayDebug_Bool                                = "displayDebug",
        k_pch_SteamVR_DebugProcessPipe_String                          = "debugProcessPipe",
        k_pch_SteamVR_DisplayDebugX_Int32                              = "displayDebugX",
        k_pch_SteamVR_DisplayDebugY_Int32                              = "displayDebugY",
        k_pch_SteamVR_SendSystemButtonToAllApps_Bool                   = "sendSystemButtonToAllApps",
        k_pch_SteamVR_LogLevel_Int32                                   = "loglevel",
        k_pch_SteamVR_IPD_Float                                        = "ipd",
        k_pch_SteamVR_Background_String                                = "background",
        k_pch_SteamVR_BackgroundUseDomeProjection_Bool                 = "backgroundUseDomeProjection",
        k_pch_SteamVR_BackgroundCameraHeight_Float                     = "backgroundCameraHeight",
        k_pch_SteamVR_BackgroundDomeRadius_Float                       = "backgroundDomeRadius",
        k_pch_SteamVR_GridColor_String                                 = "gridColor",
        k_pch_SteamVR_PlayAreaColor_String                             = "playAreaColor",
        k_pch_SteamVR_ShowStage_Bool                                   = "showStage",
        k_pch_SteamVR_ActivateMultipleDrivers_Bool                     = "activateMultipleDrivers",
        k_pch_SteamVR_UsingSpeakers_Bool                               = "usingSpeakers",
        k_pch_SteamVR_SpeakersForwardYawOffsetDegrees_Float            = "speakersForwardYawOffsetDegrees",
        k_pch_SteamVR_BaseStationPowerManagement_Bool                  = "basestationPowerManagement",
        k_pch_SteamVR_NeverKillProcesses_Bool                          = "neverKillProcesses",
        k_pch_SteamVR_SupersampleScale_Float                           = "supersampleScale",
        k_pch_SteamVR_MaxRecommendedResolution_Int32                   = "maxRecommendedResolution",
        k_pch_SteamVR_MotionSmoothing_Bool                             = "motionSmoothing",
        k_pch_SteamVR_MotionSmoothingOverride_Int32                    = "motionSmoothingOverride",
        k_pch_SteamVR_ForceFadeOnBadTracking_Bool                      = "forceFadeOnBadTracking",
        k_pch_SteamVR_DefaultMirrorView_Int32                          = "mirrorView",
        k_pch_SteamVR_ShowMirrorView_Bool                              = "showMirrorView",
        k_pch_SteamVR_MirrorViewGeometry_String                        = "mirrorViewGeometry",
        k_pch_SteamVR_MirrorViewGeometryMaximized_String               = "mirrorViewGeometryMaximized",
        k_pch_SteamVR_StartMonitorFromAppLaunch                        = "startMonitorFromAppLaunch",
        k_pch_SteamVR_StartCompositorFromAppLaunch_Bool                = "startCompositorFromAppLaunch",
        k_pch_SteamVR_StartDashboardFromAppLaunch_Bool                 = "startDashboardFromAppLaunch",
        k_pch_SteamVR_StartOverlayAppsFromDashboard_Bool               = "startOverlayAppsFromDashboard",
        k_pch_SteamVR_EnableHomeApp                                    = "enableHomeApp",
        k_pch_SteamVR_CycleBackgroundImageTimeSec_Int32                = "CycleBackgroundImageTimeSec",
        k_pch_SteamVR_RetailDemo_Bool                                  = "retailDemo",
        k_pch_SteamVR_IpdOffset_Float                                  = "ipdOffset",
        k_pch_SteamVR_AllowSupersampleFiltering_Bool                   = "allowSupersampleFiltering",
        k_pch_SteamVR_SupersampleManualOverride_Bool                   = "supersampleManualOverride",
        k_pch_SteamVR_EnableLinuxVulkanAsync_Bool                      = "enableLinuxVulkanAsync",
        k_pch_SteamVR_AllowDisplayLockedMode_Bool                      = "allowDisplayLockedMode",
        k_pch_SteamVR_HaveStartedTutorialForNativeChaperoneDriver_Bool = "haveStartedTutorialForNativeChaperoneDriver",
        k_pch_SteamVR_ForceWindows32bitVRMonitor                       = "forceWindows32BitVRMonitor",
        k_pch_SteamVR_DebugInput                                       = "debugInput",
        k_pch_SteamVR_DebugInputBinding                                = "debugInputBinding",
        k_pch_SteamVR_InputBindingUIBlock                              = "inputBindingUI",
        k_pch_SteamVR_RenderCameraMode                                 = "renderCameraMode",
        k_pch_SteamVR_EnableSharedResourceJournaling                   = "enableSharedResourceJournaling",
        k_pch_SteamVR_EnableSafeMode                                   = "enableSafeMode",
        k_pch_SteamVR_PreferredRefreshRate                             = "preferredRefreshRate",
        k_pch_SteamVR_LastVersionNotice                                = "lastVersionNotice",
        k_pch_SteamVR_LastVersionNoticeDate                            = "lastVersionNoticeDate",
        k_pch_DirectMode_Section                                       = "direct_mode",
        k_pch_DirectMode_Enable_Bool                                   = "enable",
        k_pch_DirectMode_Count_Int32                                   = "count",
        k_pch_DirectMode_EdidVid_Int32                                 = "edidVid",
        k_pch_DirectMode_EdidPid_Int32                                 = "edidPid",
        k_pch_Lighthouse_Section                                       = "driver_lighthouse",
        k_pch_Lighthouse_DisableIMU_Bool                               = "disableimu",
        k_pch_Lighthouse_DisableIMUExceptHMD_Bool                      = "disableimuexcepthmd",
        k_pch_Lighthouse_UseDisambiguation_String                      = "usedisambiguation",
        k_pch_Lighthouse_DisambiguationDebug_Int32                     = "disambiguationdebug",
        k_pch_Lighthouse_PrimaryBasestation_Int32                      = "primarybasestation",
        k_pch_Lighthouse_DBHistory_Bool                                = "dbhistory",
        k_pch_Lighthouse_EnableBluetooth_Bool                          = "enableBluetooth",
        k_pch_Lighthouse_PowerManagedBaseStations_String               = "PowerManagedBaseStations",
        k_pch_Lighthouse_PowerManagedBaseStations2_String              = "PowerManagedBaseStations2",
        k_pch_Lighthouse_EnableImuFallback_Bool                        = "enableImuFallback",
        k_pch_Lighthouse_NewPairing_Bool                               = "newPairing",
        k_pch_Null_Section                                             = "driver_null",
        k_pch_Null_SerialNumber_String                                 = "serialNumber",
        k_pch_Null_ModelNumber_String                                  = "modelNumber",
        k_pch_Null_WindowX_Int32                                       = "windowX",
        k_pch_Null_WindowY_Int32                                       = "windowY",
        k_pch_Null_WindowWidth_Int32                                   = "windowWidth",
        k_pch_Null_WindowHeight_Int32                                  = "windowHeight",
        k_pch_Null_RenderWidth_Int32                                   = "renderWidth",
        k_pch_Null_RenderHeight_Int32                                  = "renderHeight",
        k_pch_Null_SecondsFromVsyncToPhotons_Float                     = "secondsFromVsyncToPhotons",
        k_pch_Null_DisplayFrequency_Float                              = "displayFrequency",
        k_pch_UserInterface_Section                                    = "userinterface",
        k_pch_UserInterface_StatusAlwaysOnTop_Bool                     = "StatusAlwaysOnTop",
        k_pch_UserInterface_MinimizeToTray_Bool                        = "MinimizeToTray",
        k_pch_UserInterface_HidePopupsWhenStatusMinimized_Bool         = "HidePopupsWhenStatusMinimized",
        k_pch_UserInterface_Screenshots_Bool                           = "screenshots",
        k_pch_UserInterface_ScreenshotType_Int                         = "screenshotType",
        k_pch_Notifications_Section                                    = "notifications",
        k_pch_Notifications_DoNotDisturb_Bool                          = "DoNotDisturb",
        k_pch_Keyboard_Section                                         = "keyboard",
        k_pch_Keyboard_TutorialCompletions                             = "TutorialCompletions",
        k_pch_Keyboard_ScaleX                                          = "ScaleX",
        k_pch_Keyboard_ScaleY                                          = "ScaleY",
        k_pch_Keyboard_OffsetLeftX                                     = "OffsetLeftX",
        k_pch_Keyboard_OffsetRightX                                    = "OffsetRightX",
        k_pch_Keyboard_OffsetY                                         = "OffsetY",
        k_pch_Keyboard_Smoothing                                       = "Smoothing",
        k_pch_Perf_Section                                             = "perfcheck",
        k_pch_Perf_PerfGraphInHMD_Bool                                 = "perfGraphInHMD",
        k_pch_Perf_AllowTimingStore_Bool                               = "allowTimingStore",
        k_pch_Perf_SaveTimingsOnExit_Bool                              = "saveTimingsOnExit",
        k_pch_Perf_TestData_Float                                      = "perfTestData",
        k_pch_Perf_LinuxGPUProfiling_Bool                              = "linuxGPUProfiling",
        k_pch_CollisionBounds_Section                                  = "collisionBounds",
        k_pch_CollisionBounds_Style_Int32                              = "CollisionBoundsStyle",
        k_pch_CollisionBounds_GroundPerimeterOn_Bool                   = "CollisionBoundsGroundPerimeterOn",
        k_pch_CollisionBounds_CenterMarkerOn_Bool                      = "CollisionBoundsCenterMarkerOn",
        k_pch_CollisionBounds_PlaySpaceOn_Bool                         = "CollisionBoundsPlaySpaceOn",
        k_pch_CollisionBounds_FadeDistance_Float                       = "CollisionBoundsFadeDistance",
        k_pch_CollisionBounds_ColorGammaR_Int32                        = "CollisionBoundsColorGammaR",
        k_pch_CollisionBounds_ColorGammaG_Int32                        = "CollisionBoundsColorGammaG",
        k_pch_CollisionBounds_ColorGammaB_Int32                        = "CollisionBoundsColorGammaB",
        k_pch_CollisionBounds_ColorGammaA_Int32                        = "CollisionBoundsColorGammaA",
        k_pch_Camera_Section                                           = "camera",
        k_pch_Camera_EnableCamera_Bool                                 = "enableCamera",
        k_pch_Camera_EnableCameraInDashboard_Bool                      = "enableCameraInDashboard",
        k_pch_Camera_EnableCameraForCollisionBounds_Bool               = "enableCameraForCollisionBounds",
        k_pch_Camera_EnableCameraForRoomView_Bool                      = "enableCameraForRoomView",
        k_pch_Camera_BoundsColorGammaR_Int32                           = "cameraBoundsColorGammaR",
        k_pch_Camera_BoundsColorGammaG_Int32                           = "cameraBoundsColorGammaG",
        k_pch_Camera_BoundsColorGammaB_Int32                           = "cameraBoundsColorGammaB",
        k_pch_Camera_BoundsColorGammaA_Int32                           = "cameraBoundsColorGammaA",
        k_pch_Camera_BoundsStrength_Int32                              = "cameraBoundsStrength",
        k_pch_Camera_RoomViewMode_Int32                                = "cameraRoomViewMode",
        k_pch_audio_Section                                            = "audio",
        k_pch_audio_OnPlaybackDevice_String                            = "onPlaybackDevice",
        k_pch_audio_OnRecordDevice_String                              = "onRecordDevice",
        k_pch_audio_OnPlaybackMirrorDevice_String                      = "onPlaybackMirrorDevice",
        k_pch_audio_OffPlaybackDevice_String                           = "offPlaybackDevice",
        k_pch_audio_OffRecordDevice_String                             = "offRecordDevice",
        k_pch_audio_VIVEHDMIGain                                       = "viveHDMIGain",
        k_pch_Power_Section                                            = "power",
        k_pch_Power_PowerOffOnExit_Bool                                = "powerOffOnExit",
        k_pch_Power_TurnOffScreensTimeout_Float                        = "turnOffScreensTimeout",
        k_pch_Power_TurnOffControllersTimeout_Float                    = "turnOffControllersTimeout",
        k_pch_Power_ReturnToWatchdogTimeout_Float                      = "returnToWatchdogTimeout",
        k_pch_Power_AutoLaunchSteamVROnButtonPress                     = "autoLaunchSteamVROnButtonPress",
        k_pch_Power_PauseCompositorOnStandby_Bool                      = "pauseCompositorOnStandbyc",
        k_pch_Dashboard_Section                                        = "dashboard",
        k_pch_Dashboard_EnableDashboard_Bool                           = "enableDashboard",
        k_pch_Dashboard_ArcadeMode_Bool                                = "arcadeMode",
        k_pch_Dashboard_UseWebDashboard                                = "useWebDashboard",
        k_pch_Dashboard_UseWebSettings                                 = "useWebSettings",
        k_pch_Dashboard_UseWebIPD                                      = "useWebIPD",
        k_pch_Dashboard_UseWebPowerMenu                                = "useWebPowerMenu",
        k_pch_modelskin_Section                                        = "modelskins",
        k_pch_Driver_Enable_Bool                                       = "enable",
        k_pch_WebInterface_Section                                     = "WebInterface",
        k_pch_WebInterface_WebEnable_Bool                              = "WebEnable",
        k_pch_WebInterface_WebPort_String                              = "WebPort",
        k_pch_VRWebHelper_Section                                      = "VRWebHelper",
        k_pch_VRWebHelper_DebuggerEnabled_Bool                         = "DebuggerEnabled",
        k_pch_VRWebHelper_DebuggerPort_Int32                           = "DebuggerPort",
        k_pch_TrackingOverride_Section                                 = "TrackingOverrides",
        k_pch_App_BindingAutosaveURLSuffix_String                      = "AutosaveURL",
        k_pch_App_BindingCurrentURLSuffix_String                       = "CurrentURL",
        k_pch_App_NeedToUpdateAutosaveSuffix_Bool                      = "NeedToUpdateAutosave",
        k_pch_Trackers_Section                                         = "trackers",
        k_pch_DesktopUI_Section                                        = "DesktopUI",
        k_pch_LastKnown_Section                                        = "LastKnown",
        k_pch_LastKnown_HMDManufacturer_String                         = "HMDManufacturer",
        k_pch_LastKnown_HMDModel_String                                = "HMDModel",
        k_pch_DismissedWarnings_Section                                = "DismissedWarnings",
        IVRScreenshots_Version                                         = "IVRScreenshots_001",
        IVRResources_Version                                           = "IVRResources_001",
        IVRDriverManager_Version                                       = "IVRDriverManager_001",
        IVRInput_Version                                               = "IVRInput_005",
        IVRIOBuffer_Version                                            = "IVRIOBuffer_002",
        IVRSpatialAnchors_Version                                      = "IVRSpatialAnchors_001";

    /**
     * {@code EVREye}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVREye_Eye_Left EVREye_Eye_Left}</li>
     * <li>{@link #EVREye_Eye_Right EVREye_Eye_Right}</li>
     * </ul>
     */
    public static final int
        EVREye_Eye_Left  = 0,
        EVREye_Eye_Right = 1;

    /**
     * {@code ETextureType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ETextureType_TextureType_Invalid ETextureType_TextureType_Invalid} - Handle has been invalidated</li>
     * <li>{@link #ETextureType_TextureType_DirectX ETextureType_TextureType_DirectX} - Handle is an ID3D11Texture.</li>
     * <li>{@link #ETextureType_TextureType_OpenGL ETextureType_TextureType_OpenGL} - Handle is an OpenGL texture name or an OpenGL render buffer name, depending on submit flags.</li>
     * <li>{@link #ETextureType_TextureType_Vulkan ETextureType_TextureType_Vulkan} - Handle is a pointer to a {@code VRVulkanTextureData_t} structure.</li>
     * <li>{@link #ETextureType_TextureType_IOSurface ETextureType_TextureType_IOSurface} - Handle is a macOS cross-process-sharable {@code IOSurfaceRef}, deprecated in favor of {@code TextureType_Metal} on supported platforms</li>
     * <li>{@link #ETextureType_TextureType_DirectX12 ETextureType_TextureType_DirectX12} - Handle is a pointer to a {@code D3D12TextureData_t} structure.</li>
     * <li>{@link #ETextureType_TextureType_DXGISharedHandle ETextureType_TextureType_DXGISharedHandle} - 
     * Handle is a {@code HANDLE DXGI} share handle, only supported for Overlay render targets. This texture is used directly by our renderer, so only
     * perform atomic (copyresource or resolve) on it.
     * </li>
     * <li>{@link #ETextureType_TextureType_Metal ETextureType_TextureType_Metal} - 
     * Handle is a {@code MTLTexture} conforming to the {@code MTLSharedTexture} protocol. Textures submitted to {@link VRCompositor#VRCompositor_Submit Submit} which  are of type
     * {@code MTLTextureType2DArray} assume layer 0 is the left eye texture ({@link #EVREye_Eye_Left}), layer 1 is the right eye texture ({@link #EVREye_Eye_Right}).
     * </li>
     * </ul>
     */
    public static final int
        ETextureType_TextureType_Invalid          = -1,
        ETextureType_TextureType_DirectX          = 0,
        ETextureType_TextureType_OpenGL           = 1,
        ETextureType_TextureType_Vulkan           = 2,
        ETextureType_TextureType_IOSurface        = 3,
        ETextureType_TextureType_DirectX12        = 4,
        ETextureType_TextureType_DXGISharedHandle = 5,
        ETextureType_TextureType_Metal            = 6;

    /**
     * {@code EColorSpace}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EColorSpace_ColorSpace_Auto EColorSpace_ColorSpace_Auto} - Assumes 'gamma' for 8-bit per component formats, otherwise 'linear'. This mirrors the DXGI formats which have _SRGB variants.</li>
     * <li>{@link #EColorSpace_ColorSpace_Gamma EColorSpace_ColorSpace_Gamma} - Texture data can be displayed directly on the display without any conversion (a.k.a. display native format).</li>
     * <li>{@link #EColorSpace_ColorSpace_Linear EColorSpace_ColorSpace_Linear} - Same as gamma but has been converted to a linear representation using DXGI's sRGB conversion algorithm.</li>
     * </ul>
     */
    public static final int
        EColorSpace_ColorSpace_Auto   = 0,
        EColorSpace_ColorSpace_Gamma  = 1,
        EColorSpace_ColorSpace_Linear = 2;

    /**
     * {@code ETrackingResult}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ETrackingResult_TrackingResult_Uninitialized ETrackingResult_TrackingResult_Uninitialized}</li>
     * <li>{@link #ETrackingResult_TrackingResult_Calibrating_InProgress ETrackingResult_TrackingResult_Calibrating_InProgress}</li>
     * <li>{@link #ETrackingResult_TrackingResult_Calibrating_OutOfRange ETrackingResult_TrackingResult_Calibrating_OutOfRange}</li>
     * <li>{@link #ETrackingResult_TrackingResult_Running_OK ETrackingResult_TrackingResult_Running_OK}</li>
     * <li>{@link #ETrackingResult_TrackingResult_Running_OutOfRange ETrackingResult_TrackingResult_Running_OutOfRange}</li>
     * <li>{@link #ETrackingResult_TrackingResult_Fallback_RotationOnly ETrackingResult_TrackingResult_Fallback_RotationOnly}</li>
     * </ul>
     */
    public static final int
        ETrackingResult_TrackingResult_Uninitialized          = 1,
        ETrackingResult_TrackingResult_Calibrating_InProgress = 100,
        ETrackingResult_TrackingResult_Calibrating_OutOfRange = 101,
        ETrackingResult_TrackingResult_Running_OK             = 200,
        ETrackingResult_TrackingResult_Running_OutOfRange     = 201,
        ETrackingResult_TrackingResult_Fallback_RotationOnly  = 300;

    /**
     * {@code ETrackedDeviceClass}: Describes what kind of object is being tracked at a given ID.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ETrackedDeviceClass_TrackedDeviceClass_Invalid ETrackedDeviceClass_TrackedDeviceClass_Invalid} - The ID was not valid.</li>
     * <li>{@link #ETrackedDeviceClass_TrackedDeviceClass_HMD ETrackedDeviceClass_TrackedDeviceClass_HMD} - Head-Mounted Displays.</li>
     * <li>{@link #ETrackedDeviceClass_TrackedDeviceClass_Controller ETrackedDeviceClass_TrackedDeviceClass_Controller} - Tracked controllers.</li>
     * <li>{@link #ETrackedDeviceClass_TrackedDeviceClass_GenericTracker ETrackedDeviceClass_TrackedDeviceClass_GenericTracker} - Generic trackers, similar to controllers.</li>
     * <li>{@link #ETrackedDeviceClass_TrackedDeviceClass_TrackingReference ETrackedDeviceClass_TrackedDeviceClass_TrackingReference} - Camera and base stations that serve as tracking reference points.</li>
     * <li>{@link #ETrackedDeviceClass_TrackedDeviceClass_DisplayRedirect ETrackedDeviceClass_TrackedDeviceClass_DisplayRedirect} - Accessories that aren't necessarily tracked themselves, but may redirect video output from other tracked devices.</li>
     * <li>{@link #ETrackedDeviceClass_TrackedDeviceClass_Max ETrackedDeviceClass_TrackedDeviceClass_Max}</li>
     * </ul>
     */
    public static final int
        ETrackedDeviceClass_TrackedDeviceClass_Invalid           = 0,
        ETrackedDeviceClass_TrackedDeviceClass_HMD               = 1,
        ETrackedDeviceClass_TrackedDeviceClass_Controller        = 2,
        ETrackedDeviceClass_TrackedDeviceClass_GenericTracker    = 3,
        ETrackedDeviceClass_TrackedDeviceClass_TrackingReference = 4,
        ETrackedDeviceClass_TrackedDeviceClass_DisplayRedirect   = 5,
        ETrackedDeviceClass_TrackedDeviceClass_Max               = 6;

    /**
     * {@code ETrackedControllerRole}: Describes what specific role associated with a tracked device.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ETrackedControllerRole_TrackedControllerRole_Invalid ETrackedControllerRole_TrackedControllerRole_Invalid} - Invalid value for controller type.</li>
     * <li>{@link #ETrackedControllerRole_TrackedControllerRole_LeftHand ETrackedControllerRole_TrackedControllerRole_LeftHand} - Tracked device associated with the left hand.</li>
     * <li>{@link #ETrackedControllerRole_TrackedControllerRole_RightHand ETrackedControllerRole_TrackedControllerRole_RightHand} - Tracked device associated with the right hand.</li>
     * <li>{@link #ETrackedControllerRole_TrackedControllerRole_OptOut ETrackedControllerRole_TrackedControllerRole_OptOut} - Tracked device is opting out of left/right hand selection.</li>
     * <li>{@link #ETrackedControllerRole_TrackedControllerRole_Treadmill ETrackedControllerRole_TrackedControllerRole_Treadmill} - Tracked device is a treadmill.</li>
     * <li>{@link #ETrackedControllerRole_TrackedControllerRole_Max ETrackedControllerRole_TrackedControllerRole_Max}</li>
     * </ul>
     */
    public static final int
        ETrackedControllerRole_TrackedControllerRole_Invalid   = 0,
        ETrackedControllerRole_TrackedControllerRole_LeftHand  = 1,
        ETrackedControllerRole_TrackedControllerRole_RightHand = 2,
        ETrackedControllerRole_TrackedControllerRole_OptOut    = 3,
        ETrackedControllerRole_TrackedControllerRole_Treadmill = 4,
        ETrackedControllerRole_TrackedControllerRole_Max       = 4;

    /**
     * {@code ETrackingUniverseOrigin}: Identifies which style of tracking origin the application wants to use for the poses it is requesting.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ETrackingUniverseOrigin_TrackingUniverseSeated ETrackingUniverseOrigin_TrackingUniverseSeated} - Poses are provided relative to the seated zero pose.</li>
     * <li>{@link #ETrackingUniverseOrigin_TrackingUniverseStanding ETrackingUniverseOrigin_TrackingUniverseStanding} - Poses are provided relative to the safe bounds configured by the user.</li>
     * <li>{@link #ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated} - 
     * Poses are provided in the coordinate system defined by the driver.  It has Y up and is unified for devices of the same driver. You usually don't
     * want this one.
     * </li>
     * </ul>
     */
    public static final int
        ETrackingUniverseOrigin_TrackingUniverseSeated             = 0,
        ETrackingUniverseOrigin_TrackingUniverseStanding           = 1,
        ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated = 2;

    /**
     * {@code EAdditionalRadioFeatures}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EAdditionalRadioFeatures_AdditionalRadioFeatures_None EAdditionalRadioFeatures_AdditionalRadioFeatures_None}</li>
     * <li>{@link #EAdditionalRadioFeatures_AdditionalRadioFeatures_HTCLinkBox EAdditionalRadioFeatures_AdditionalRadioFeatures_HTCLinkBox}</li>
     * <li>{@link #EAdditionalRadioFeatures_AdditionalRadioFeatures_InternalDongle EAdditionalRadioFeatures_AdditionalRadioFeatures_InternalDongle}</li>
     * <li>{@link #EAdditionalRadioFeatures_AdditionalRadioFeatures_ExternalDongle EAdditionalRadioFeatures_AdditionalRadioFeatures_ExternalDongle}</li>
     * </ul>
     */
    public static final int
        EAdditionalRadioFeatures_AdditionalRadioFeatures_None           = 0,
        EAdditionalRadioFeatures_AdditionalRadioFeatures_HTCLinkBox     = 1,
        EAdditionalRadioFeatures_AdditionalRadioFeatures_InternalDongle = 2,
        EAdditionalRadioFeatures_AdditionalRadioFeatures_ExternalDongle = 4;

    /**
     * {@code ETrackedDeviceProperty}: Each entry in this enum represents a property that can be retrieved about a tracked device. Many fields are only valid
     * for one {@code ETrackedDeviceClass}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ETrackedDeviceProperty_Prop_Invalid ETrackedDeviceProperty_Prop_Invalid}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_TrackingSystemName_String ETrackedDeviceProperty_Prop_TrackingSystemName_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ModelNumber_String ETrackedDeviceProperty_Prop_ModelNumber_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_SerialNumber_String ETrackedDeviceProperty_Prop_SerialNumber_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_RenderModelName_String ETrackedDeviceProperty_Prop_RenderModelName_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_WillDriftInYaw_Bool ETrackedDeviceProperty_Prop_WillDriftInYaw_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ManufacturerName_String ETrackedDeviceProperty_Prop_ManufacturerName_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_TrackingFirmwareVersion_String ETrackedDeviceProperty_Prop_TrackingFirmwareVersion_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_HardwareRevision_String ETrackedDeviceProperty_Prop_HardwareRevision_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_AllWirelessDongleDescriptions_String ETrackedDeviceProperty_Prop_AllWirelessDongleDescriptions_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ConnectedWirelessDongle_String ETrackedDeviceProperty_Prop_ConnectedWirelessDongle_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DeviceIsWireless_Bool ETrackedDeviceProperty_Prop_DeviceIsWireless_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DeviceIsCharging_Bool ETrackedDeviceProperty_Prop_DeviceIsCharging_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DeviceBatteryPercentage_Float ETrackedDeviceProperty_Prop_DeviceBatteryPercentage_Float} - 0 is empty, 1 is full</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_StatusDisplayTransform_Matrix34 ETrackedDeviceProperty_Prop_StatusDisplayTransform_Matrix34}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Firmware_UpdateAvailable_Bool ETrackedDeviceProperty_Prop_Firmware_UpdateAvailable_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Firmware_ManualUpdate_Bool ETrackedDeviceProperty_Prop_Firmware_ManualUpdate_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_HardwareRevision_Uint64 ETrackedDeviceProperty_Prop_HardwareRevision_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_FirmwareVersion_Uint64 ETrackedDeviceProperty_Prop_FirmwareVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_FPGAVersion_Uint64 ETrackedDeviceProperty_Prop_FPGAVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_VRCVersion_Uint64 ETrackedDeviceProperty_Prop_VRCVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_RadioVersion_Uint64 ETrackedDeviceProperty_Prop_RadioVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DongleVersion_Uint64 ETrackedDeviceProperty_Prop_DongleVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_BlockServerShutdown_Bool ETrackedDeviceProperty_Prop_BlockServerShutdown_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CanUnifyCoordinateSystemWithHmd_Bool ETrackedDeviceProperty_Prop_CanUnifyCoordinateSystemWithHmd_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ContainsProximitySensor_Bool ETrackedDeviceProperty_Prop_ContainsProximitySensor_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DeviceProvidesBatteryStatus_Bool ETrackedDeviceProperty_Prop_DeviceProvidesBatteryStatus_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DeviceCanPowerOff_Bool ETrackedDeviceProperty_Prop_DeviceCanPowerOff_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Firmware_ProgrammingTarget_String ETrackedDeviceProperty_Prop_Firmware_ProgrammingTarget_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DeviceClass_Int32 ETrackedDeviceProperty_Prop_DeviceClass_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_HasCamera_Bool ETrackedDeviceProperty_Prop_HasCamera_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverVersion_String ETrackedDeviceProperty_Prop_DriverVersion_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Firmware_ForceUpdateRequired_Bool ETrackedDeviceProperty_Prop_Firmware_ForceUpdateRequired_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ViveSystemButtonFixRequired_Bool ETrackedDeviceProperty_Prop_ViveSystemButtonFixRequired_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ParentDriver_Uint64 ETrackedDeviceProperty_Prop_ParentDriver_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ResourceRoot_String ETrackedDeviceProperty_Prop_ResourceRoot_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_RegisteredDeviceType_String ETrackedDeviceProperty_Prop_RegisteredDeviceType_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_InputProfilePath_String ETrackedDeviceProperty_Prop_InputProfilePath_String} - input profile to use for this device in the input system. Will default to tracking system name if this isn't provided.</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NeverTracked_Bool ETrackedDeviceProperty_Prop_NeverTracked_Bool} - used for devices that will never have a valid pose by design.</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NumCameras_Int32 ETrackedDeviceProperty_Prop_NumCameras_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CameraFrameLayout_Int32 ETrackedDeviceProperty_Prop_CameraFrameLayout_Int32} - {@code EVRTrackedCameraFrameLayout} value</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CameraStreamFormat_Int32 ETrackedDeviceProperty_Prop_CameraStreamFormat_Int32} - {@code ECameraVideoStreamFormat} value</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_AdditionalDeviceSettingsPath_String ETrackedDeviceProperty_Prop_AdditionalDeviceSettingsPath_String} - driver-relative path to additional device and global configuration settings</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Identifiable_Bool ETrackedDeviceProperty_Prop_Identifiable_Bool} - Whether device supports being identified from vrmonitor (e.g. blink LED, vibrate haptics, etc)</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_BootloaderVersion_Uint64 ETrackedDeviceProperty_Prop_BootloaderVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_AdditionalSystemReportData_String ETrackedDeviceProperty_Prop_AdditionalSystemReportData_String} - additional string to include in system reports about a tracked device</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CompositeFirmwareVersion_String ETrackedDeviceProperty_Prop_CompositeFirmwareVersion_String} - additional FW components from a device that gets propagated into reports</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ReportsTimeSinceVSync_Bool ETrackedDeviceProperty_Prop_ReportsTimeSinceVSync_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_SecondsFromVsyncToPhotons_Float ETrackedDeviceProperty_Prop_SecondsFromVsyncToPhotons_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayFrequency_Float ETrackedDeviceProperty_Prop_DisplayFrequency_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_UserIpdMeters_Float ETrackedDeviceProperty_Prop_UserIpdMeters_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CurrentUniverseId_Uint64 ETrackedDeviceProperty_Prop_CurrentUniverseId_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_PreviousUniverseId_Uint64 ETrackedDeviceProperty_Prop_PreviousUniverseId_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayFirmwareVersion_Uint64 ETrackedDeviceProperty_Prop_DisplayFirmwareVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_IsOnDesktop_Bool ETrackedDeviceProperty_Prop_IsOnDesktop_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayMCType_Int32 ETrackedDeviceProperty_Prop_DisplayMCType_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayMCOffset_Float ETrackedDeviceProperty_Prop_DisplayMCOffset_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayMCScale_Float ETrackedDeviceProperty_Prop_DisplayMCScale_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_EdidVendorID_Int32 ETrackedDeviceProperty_Prop_EdidVendorID_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayMCImageLeft_String ETrackedDeviceProperty_Prop_DisplayMCImageLeft_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayMCImageRight_String ETrackedDeviceProperty_Prop_DisplayMCImageRight_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayGCBlackClamp_Float ETrackedDeviceProperty_Prop_DisplayGCBlackClamp_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_EdidProductID_Int32 ETrackedDeviceProperty_Prop_EdidProductID_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CameraToHeadTransform_Matrix34 ETrackedDeviceProperty_Prop_CameraToHeadTransform_Matrix34}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayGCType_Int32 ETrackedDeviceProperty_Prop_DisplayGCType_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayGCOffset_Float ETrackedDeviceProperty_Prop_DisplayGCOffset_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayGCScale_Float ETrackedDeviceProperty_Prop_DisplayGCScale_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayGCPrescale_Float ETrackedDeviceProperty_Prop_DisplayGCPrescale_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayGCImage_String ETrackedDeviceProperty_Prop_DisplayGCImage_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_LensCenterLeftU_Float ETrackedDeviceProperty_Prop_LensCenterLeftU_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_LensCenterLeftV_Float ETrackedDeviceProperty_Prop_LensCenterLeftV_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_LensCenterRightU_Float ETrackedDeviceProperty_Prop_LensCenterRightU_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_LensCenterRightV_Float ETrackedDeviceProperty_Prop_LensCenterRightV_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_UserHeadToEyeDepthMeters_Float ETrackedDeviceProperty_Prop_UserHeadToEyeDepthMeters_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CameraFirmwareVersion_Uint64 ETrackedDeviceProperty_Prop_CameraFirmwareVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CameraFirmwareDescription_String ETrackedDeviceProperty_Prop_CameraFirmwareDescription_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayFPGAVersion_Uint64 ETrackedDeviceProperty_Prop_DisplayFPGAVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayBootloaderVersion_Uint64 ETrackedDeviceProperty_Prop_DisplayBootloaderVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayHardwareVersion_Uint64 ETrackedDeviceProperty_Prop_DisplayHardwareVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_AudioFirmwareVersion_Uint64 ETrackedDeviceProperty_Prop_AudioFirmwareVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CameraCompatibilityMode_Int32 ETrackedDeviceProperty_Prop_CameraCompatibilityMode_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ScreenshotHorizontalFieldOfViewDegrees_Float ETrackedDeviceProperty_Prop_ScreenshotHorizontalFieldOfViewDegrees_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ScreenshotVerticalFieldOfViewDegrees_Float ETrackedDeviceProperty_Prop_ScreenshotVerticalFieldOfViewDegrees_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplaySuppressed_Bool ETrackedDeviceProperty_Prop_DisplaySuppressed_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayAllowNightMode_Bool ETrackedDeviceProperty_Prop_DisplayAllowNightMode_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayMCImageWidth_Int32 ETrackedDeviceProperty_Prop_DisplayMCImageWidth_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayMCImageHeight_Int32 ETrackedDeviceProperty_Prop_DisplayMCImageHeight_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayMCImageNumChannels_Int32 ETrackedDeviceProperty_Prop_DisplayMCImageNumChannels_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayMCImageData_Binary ETrackedDeviceProperty_Prop_DisplayMCImageData_Binary}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_SecondsFromPhotonsToVblank_Float ETrackedDeviceProperty_Prop_SecondsFromPhotonsToVblank_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverDirectModeSendsVsyncEvents_Bool ETrackedDeviceProperty_Prop_DriverDirectModeSendsVsyncEvents_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayDebugMode_Bool ETrackedDeviceProperty_Prop_DisplayDebugMode_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_GraphicsAdapterLuid_Uint64 ETrackedDeviceProperty_Prop_GraphicsAdapterLuid_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverProvidedChaperonePath_String ETrackedDeviceProperty_Prop_DriverProvidedChaperonePath_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ExpectedTrackingReferenceCount_Int32 ETrackedDeviceProperty_Prop_ExpectedTrackingReferenceCount_Int32} - expected number of sensors or basestations to reserve UI space for</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ExpectedControllerCount_Int32 ETrackedDeviceProperty_Prop_ExpectedControllerCount_Int32} - expected number of tracked controllers to reserve UI space for</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathControllerLeftDeviceOff_String ETrackedDeviceProperty_Prop_NamedIconPathControllerLeftDeviceOff_String} - placeholder icon for "left" controller if not yet detected/loaded</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathControllerRightDeviceOff_String ETrackedDeviceProperty_Prop_NamedIconPathControllerRightDeviceOff_String} - placeholder icon for "right" controller if not yet detected/loaded</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathTrackingReferenceDeviceOff_String ETrackedDeviceProperty_Prop_NamedIconPathTrackingReferenceDeviceOff_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DoNotApplyPrediction_Bool ETrackedDeviceProperty_Prop_DoNotApplyPrediction_Bool} - placeholder icon for sensor/base if not yet detected/loaded</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CameraToHeadTransforms_Matrix34_Array ETrackedDeviceProperty_Prop_CameraToHeadTransforms_Matrix34_Array}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DistortionMeshResolution_Int32 ETrackedDeviceProperty_Prop_DistortionMeshResolution_Int32} - custom resolution of compositor calls to {@link VRSystem#VRSystem_ComputeDistortion ComputeDistortion}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverIsDrawingControllers_Bool ETrackedDeviceProperty_Prop_DriverIsDrawingControllers_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestsApplicationPause_Bool ETrackedDeviceProperty_Prop_DriverRequestsApplicationPause_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestsReducedRendering_Bool ETrackedDeviceProperty_Prop_DriverRequestsReducedRendering_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_MinimumIpdStepMeters_Float ETrackedDeviceProperty_Prop_MinimumIpdStepMeters_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_AudioBridgeFirmwareVersion_Uint64 ETrackedDeviceProperty_Prop_AudioBridgeFirmwareVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ImageBridgeFirmwareVersion_Uint64 ETrackedDeviceProperty_Prop_ImageBridgeFirmwareVersion_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ImuToHeadTransform_Matrix34 ETrackedDeviceProperty_Prop_ImuToHeadTransform_Matrix34}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ImuFactoryGyroBias_Vector3 ETrackedDeviceProperty_Prop_ImuFactoryGyroBias_Vector3}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ImuFactoryGyroScale_Vector3 ETrackedDeviceProperty_Prop_ImuFactoryGyroScale_Vector3}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ImuFactoryAccelerometerBias_Vector3 ETrackedDeviceProperty_Prop_ImuFactoryAccelerometerBias_Vector3}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ImuFactoryAccelerometerScale_Vector3 ETrackedDeviceProperty_Prop_ImuFactoryAccelerometerScale_Vector3}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ConfigurationIncludesLighthouse20Features_Bool ETrackedDeviceProperty_Prop_ConfigurationIncludesLighthouse20Features_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_AdditionalRadioFeatures_Uint64 ETrackedDeviceProperty_Prop_AdditionalRadioFeatures_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CameraWhiteBalance_Vector4_Array ETrackedDeviceProperty_Prop_CameraWhiteBalance_Vector4_Array} - {@code Prop_NumCameras_Int32}-sized array of {@code float[4]} RGBG white balance calibration data (max size is {@code vr::k_unMaxCameras})</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CameraDistortionFunction_Int32_Array ETrackedDeviceProperty_Prop_CameraDistortionFunction_Int32_Array} - {@code Prop_NumCameras_Int32}-sized array of {@code vr::EVRDistortionFunctionType} values (max size is {@code vr::k_unMaxCameras})</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CameraDistortionCoefficients_Float_Array ETrackedDeviceProperty_Prop_CameraDistortionCoefficients_Float_Array} - {@code Prop_NumCameras_Int32}-sized array of {@code double[vr::k_unMaxDistortionFunctionParameters]} (max size is {@code vr::k_unMaxCameras})</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ExpectedControllerType_String ETrackedDeviceProperty_Prop_ExpectedControllerType_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestedMuraCorrectionMode_Int32 ETrackedDeviceProperty_Prop_DriverRequestedMuraCorrectionMode_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerLeft_Int32 ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerLeft_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerRight_Int32 ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerRight_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerTop_Int32 ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerTop_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerBottom_Int32 ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerBottom_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterLeft_Int32 ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterLeft_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterRight_Int32 ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterRight_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterTop_Int32 ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterTop_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterBottom_Int32 ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterBottom_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_AttachedDeviceId_String ETrackedDeviceProperty_Prop_AttachedDeviceId_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_SupportedButtons_Uint64 ETrackedDeviceProperty_Prop_SupportedButtons_Uint64}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Axis0Type_Int32 ETrackedDeviceProperty_Prop_Axis0Type_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Axis1Type_Int32 ETrackedDeviceProperty_Prop_Axis1Type_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Axis2Type_Int32 ETrackedDeviceProperty_Prop_Axis2Type_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Axis3Type_Int32 ETrackedDeviceProperty_Prop_Axis3Type_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Axis4Type_Int32 ETrackedDeviceProperty_Prop_Axis4Type_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ControllerRoleHint_Int32 ETrackedDeviceProperty_Prop_ControllerRoleHint_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_FieldOfViewLeftDegrees_Float ETrackedDeviceProperty_Prop_FieldOfViewLeftDegrees_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_FieldOfViewRightDegrees_Float ETrackedDeviceProperty_Prop_FieldOfViewRightDegrees_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_FieldOfViewTopDegrees_Float ETrackedDeviceProperty_Prop_FieldOfViewTopDegrees_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_FieldOfViewBottomDegrees_Float ETrackedDeviceProperty_Prop_FieldOfViewBottomDegrees_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_TrackingRangeMinimumMeters_Float ETrackedDeviceProperty_Prop_TrackingRangeMinimumMeters_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_TrackingRangeMaximumMeters_Float ETrackedDeviceProperty_Prop_TrackingRangeMaximumMeters_Float}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ModeLabel_String ETrackedDeviceProperty_Prop_ModeLabel_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_CanWirelessIdentify_Bool ETrackedDeviceProperty_Prop_CanWirelessIdentify_Bool} - volatile, based on radio presence and fw discovery</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_Nonce_Int32 ETrackedDeviceProperty_Prop_Nonce_Int32}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_IconPathName_String ETrackedDeviceProperty_Prop_IconPathName_String} - usually a directory named "icons"</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathDeviceOff_String ETrackedDeviceProperty_Prop_NamedIconPathDeviceOff_String} - PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearching_String ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearching_String} - PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearchingAlert_String ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearchingAlert_String} - PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathDeviceReady_String ETrackedDeviceProperty_Prop_NamedIconPathDeviceReady_String} - PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathDeviceReadyAlert_String ETrackedDeviceProperty_Prop_NamedIconPathDeviceReadyAlert_String} - PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathDeviceNotReady_String ETrackedDeviceProperty_Prop_NamedIconPathDeviceNotReady_String} - PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathDeviceStandby_String ETrackedDeviceProperty_Prop_NamedIconPathDeviceStandby_String} - PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_NamedIconPathDeviceAlertLow_String ETrackedDeviceProperty_Prop_NamedIconPathDeviceAlertLow_String} - PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_Start ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_Start}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_End ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_End}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ParentContainer ETrackedDeviceProperty_Prop_ParentContainer}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_UserConfigPath_String ETrackedDeviceProperty_Prop_UserConfigPath_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_InstallPath_String ETrackedDeviceProperty_Prop_InstallPath_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_HasDisplayComponent_Bool ETrackedDeviceProperty_Prop_HasDisplayComponent_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_HasControllerComponent_Bool ETrackedDeviceProperty_Prop_HasControllerComponent_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_HasCameraComponent_Bool ETrackedDeviceProperty_Prop_HasCameraComponent_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_HasDriverDirectModeComponent_Bool ETrackedDeviceProperty_Prop_HasDriverDirectModeComponent_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_HasVirtualDisplayComponent_Bool ETrackedDeviceProperty_Prop_HasVirtualDisplayComponent_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_HasSpatialAnchorsSupport_Bool ETrackedDeviceProperty_Prop_HasSpatialAnchorsSupport_Bool}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ControllerType_String ETrackedDeviceProperty_Prop_ControllerType_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_LegacyInputProfile_String ETrackedDeviceProperty_Prop_LegacyInputProfile_String}</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_ControllerHandSelectionPriority_Int32 ETrackedDeviceProperty_Prop_ControllerHandSelectionPriority_Int32} - Allows hand assignments to prefer some controllers over others. High numbers are selected over low numbers.</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_Start ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_Start} - PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_End ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_End} - PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others</li>
     * <li>{@link #ETrackedDeviceProperty_Prop_TrackedDeviceProperty_Max ETrackedDeviceProperty_Prop_TrackedDeviceProperty_Max}</li>
     * </ul>
     */
    public static final int
        ETrackedDeviceProperty_Prop_Invalid                                        = 0,
        ETrackedDeviceProperty_Prop_TrackingSystemName_String                      = 1000,
        ETrackedDeviceProperty_Prop_ModelNumber_String                             = 1001,
        ETrackedDeviceProperty_Prop_SerialNumber_String                            = 1002,
        ETrackedDeviceProperty_Prop_RenderModelName_String                         = 1003,
        ETrackedDeviceProperty_Prop_WillDriftInYaw_Bool                            = 1004,
        ETrackedDeviceProperty_Prop_ManufacturerName_String                        = 1005,
        ETrackedDeviceProperty_Prop_TrackingFirmwareVersion_String                 = 1006,
        ETrackedDeviceProperty_Prop_HardwareRevision_String                        = 1007,
        ETrackedDeviceProperty_Prop_AllWirelessDongleDescriptions_String           = 1008,
        ETrackedDeviceProperty_Prop_ConnectedWirelessDongle_String                 = 1009,
        ETrackedDeviceProperty_Prop_DeviceIsWireless_Bool                          = 1010,
        ETrackedDeviceProperty_Prop_DeviceIsCharging_Bool                          = 1011,
        ETrackedDeviceProperty_Prop_DeviceBatteryPercentage_Float                  = 1012,
        ETrackedDeviceProperty_Prop_StatusDisplayTransform_Matrix34                = 1013,
        ETrackedDeviceProperty_Prop_Firmware_UpdateAvailable_Bool                  = 1014,
        ETrackedDeviceProperty_Prop_Firmware_ManualUpdate_Bool                     = 1015,
        ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String                = 1016,
        ETrackedDeviceProperty_Prop_HardwareRevision_Uint64                        = 1017,
        ETrackedDeviceProperty_Prop_FirmwareVersion_Uint64                         = 1018,
        ETrackedDeviceProperty_Prop_FPGAVersion_Uint64                             = 1019,
        ETrackedDeviceProperty_Prop_VRCVersion_Uint64                              = 1020,
        ETrackedDeviceProperty_Prop_RadioVersion_Uint64                            = 1021,
        ETrackedDeviceProperty_Prop_DongleVersion_Uint64                           = 1022,
        ETrackedDeviceProperty_Prop_BlockServerShutdown_Bool                       = 1023,
        ETrackedDeviceProperty_Prop_CanUnifyCoordinateSystemWithHmd_Bool           = 1024,
        ETrackedDeviceProperty_Prop_ContainsProximitySensor_Bool                   = 1025,
        ETrackedDeviceProperty_Prop_DeviceProvidesBatteryStatus_Bool               = 1026,
        ETrackedDeviceProperty_Prop_DeviceCanPowerOff_Bool                         = 1027,
        ETrackedDeviceProperty_Prop_Firmware_ProgrammingTarget_String              = 1028,
        ETrackedDeviceProperty_Prop_DeviceClass_Int32                              = 1029,
        ETrackedDeviceProperty_Prop_HasCamera_Bool                                 = 1030,
        ETrackedDeviceProperty_Prop_DriverVersion_String                           = 1031,
        ETrackedDeviceProperty_Prop_Firmware_ForceUpdateRequired_Bool              = 1032,
        ETrackedDeviceProperty_Prop_ViveSystemButtonFixRequired_Bool               = 1033,
        ETrackedDeviceProperty_Prop_ParentDriver_Uint64                            = 1034,
        ETrackedDeviceProperty_Prop_ResourceRoot_String                            = 1035,
        ETrackedDeviceProperty_Prop_RegisteredDeviceType_String                    = 1036,
        ETrackedDeviceProperty_Prop_InputProfilePath_String                        = 1037,
        ETrackedDeviceProperty_Prop_NeverTracked_Bool                              = 1038,
        ETrackedDeviceProperty_Prop_NumCameras_Int32                               = 1039,
        ETrackedDeviceProperty_Prop_CameraFrameLayout_Int32                        = 1040,
        ETrackedDeviceProperty_Prop_CameraStreamFormat_Int32                       = 1041,
        ETrackedDeviceProperty_Prop_AdditionalDeviceSettingsPath_String            = 1042,
        ETrackedDeviceProperty_Prop_Identifiable_Bool                              = 1043,
        ETrackedDeviceProperty_Prop_BootloaderVersion_Uint64                       = 1044,
        ETrackedDeviceProperty_Prop_AdditionalSystemReportData_String              = 1045,
        ETrackedDeviceProperty_Prop_CompositeFirmwareVersion_String                = 1046,
        ETrackedDeviceProperty_Prop_ReportsTimeSinceVSync_Bool                     = 2000,
        ETrackedDeviceProperty_Prop_SecondsFromVsyncToPhotons_Float                = 2001,
        ETrackedDeviceProperty_Prop_DisplayFrequency_Float                         = 2002,
        ETrackedDeviceProperty_Prop_UserIpdMeters_Float                            = 2003,
        ETrackedDeviceProperty_Prop_CurrentUniverseId_Uint64                       = 2004,
        ETrackedDeviceProperty_Prop_PreviousUniverseId_Uint64                      = 2005,
        ETrackedDeviceProperty_Prop_DisplayFirmwareVersion_Uint64                  = 2006,
        ETrackedDeviceProperty_Prop_IsOnDesktop_Bool                               = 2007,
        ETrackedDeviceProperty_Prop_DisplayMCType_Int32                            = 2008,
        ETrackedDeviceProperty_Prop_DisplayMCOffset_Float                          = 2009,
        ETrackedDeviceProperty_Prop_DisplayMCScale_Float                           = 2010,
        ETrackedDeviceProperty_Prop_EdidVendorID_Int32                             = 2011,
        ETrackedDeviceProperty_Prop_DisplayMCImageLeft_String                      = 2012,
        ETrackedDeviceProperty_Prop_DisplayMCImageRight_String                     = 2013,
        ETrackedDeviceProperty_Prop_DisplayGCBlackClamp_Float                      = 2014,
        ETrackedDeviceProperty_Prop_EdidProductID_Int32                            = 2015,
        ETrackedDeviceProperty_Prop_CameraToHeadTransform_Matrix34                 = 2016,
        ETrackedDeviceProperty_Prop_DisplayGCType_Int32                            = 2017,
        ETrackedDeviceProperty_Prop_DisplayGCOffset_Float                          = 2018,
        ETrackedDeviceProperty_Prop_DisplayGCScale_Float                           = 2019,
        ETrackedDeviceProperty_Prop_DisplayGCPrescale_Float                        = 2020,
        ETrackedDeviceProperty_Prop_DisplayGCImage_String                          = 2021,
        ETrackedDeviceProperty_Prop_LensCenterLeftU_Float                          = 2022,
        ETrackedDeviceProperty_Prop_LensCenterLeftV_Float                          = 2023,
        ETrackedDeviceProperty_Prop_LensCenterRightU_Float                         = 2024,
        ETrackedDeviceProperty_Prop_LensCenterRightV_Float                         = 2025,
        ETrackedDeviceProperty_Prop_UserHeadToEyeDepthMeters_Float                 = 2026,
        ETrackedDeviceProperty_Prop_CameraFirmwareVersion_Uint64                   = 2027,
        ETrackedDeviceProperty_Prop_CameraFirmwareDescription_String               = 2028,
        ETrackedDeviceProperty_Prop_DisplayFPGAVersion_Uint64                      = 2029,
        ETrackedDeviceProperty_Prop_DisplayBootloaderVersion_Uint64                = 2030,
        ETrackedDeviceProperty_Prop_DisplayHardwareVersion_Uint64                  = 2031,
        ETrackedDeviceProperty_Prop_AudioFirmwareVersion_Uint64                    = 2032,
        ETrackedDeviceProperty_Prop_CameraCompatibilityMode_Int32                  = 2033,
        ETrackedDeviceProperty_Prop_ScreenshotHorizontalFieldOfViewDegrees_Float   = 2034,
        ETrackedDeviceProperty_Prop_ScreenshotVerticalFieldOfViewDegrees_Float     = 2035,
        ETrackedDeviceProperty_Prop_DisplaySuppressed_Bool                         = 2036,
        ETrackedDeviceProperty_Prop_DisplayAllowNightMode_Bool                     = 2037,
        ETrackedDeviceProperty_Prop_DisplayMCImageWidth_Int32                      = 2038,
        ETrackedDeviceProperty_Prop_DisplayMCImageHeight_Int32                     = 2039,
        ETrackedDeviceProperty_Prop_DisplayMCImageNumChannels_Int32                = 2040,
        ETrackedDeviceProperty_Prop_DisplayMCImageData_Binary                      = 2041,
        ETrackedDeviceProperty_Prop_SecondsFromPhotonsToVblank_Float               = 2042,
        ETrackedDeviceProperty_Prop_DriverDirectModeSendsVsyncEvents_Bool          = 2043,
        ETrackedDeviceProperty_Prop_DisplayDebugMode_Bool                          = 2044,
        ETrackedDeviceProperty_Prop_GraphicsAdapterLuid_Uint64                     = 2045,
        ETrackedDeviceProperty_Prop_DriverProvidedChaperonePath_String             = 2048,
        ETrackedDeviceProperty_Prop_ExpectedTrackingReferenceCount_Int32           = 2049,
        ETrackedDeviceProperty_Prop_ExpectedControllerCount_Int32                  = 2050,
        ETrackedDeviceProperty_Prop_NamedIconPathControllerLeftDeviceOff_String    = 2051,
        ETrackedDeviceProperty_Prop_NamedIconPathControllerRightDeviceOff_String   = 2052,
        ETrackedDeviceProperty_Prop_NamedIconPathTrackingReferenceDeviceOff_String = 2053,
        ETrackedDeviceProperty_Prop_DoNotApplyPrediction_Bool                      = 2054,
        ETrackedDeviceProperty_Prop_CameraToHeadTransforms_Matrix34_Array          = 2055,
        ETrackedDeviceProperty_Prop_DistortionMeshResolution_Int32                 = 2056,
        ETrackedDeviceProperty_Prop_DriverIsDrawingControllers_Bool                = 2057,
        ETrackedDeviceProperty_Prop_DriverRequestsApplicationPause_Bool            = 2058,
        ETrackedDeviceProperty_Prop_DriverRequestsReducedRendering_Bool            = 2059,
        ETrackedDeviceProperty_Prop_MinimumIpdStepMeters_Float                     = 2060,
        ETrackedDeviceProperty_Prop_AudioBridgeFirmwareVersion_Uint64              = 2061,
        ETrackedDeviceProperty_Prop_ImageBridgeFirmwareVersion_Uint64              = 2062,
        ETrackedDeviceProperty_Prop_ImuToHeadTransform_Matrix34                    = 2063,
        ETrackedDeviceProperty_Prop_ImuFactoryGyroBias_Vector3                     = 2064,
        ETrackedDeviceProperty_Prop_ImuFactoryGyroScale_Vector3                    = 2065,
        ETrackedDeviceProperty_Prop_ImuFactoryAccelerometerBias_Vector3            = 2066,
        ETrackedDeviceProperty_Prop_ImuFactoryAccelerometerScale_Vector3           = 2067,
        ETrackedDeviceProperty_Prop_ConfigurationIncludesLighthouse20Features_Bool = 2069,
        ETrackedDeviceProperty_Prop_AdditionalRadioFeatures_Uint64                 = 2070,
        ETrackedDeviceProperty_Prop_CameraWhiteBalance_Vector4_Array               = 2071,
        ETrackedDeviceProperty_Prop_CameraDistortionFunction_Int32_Array           = 2072,
        ETrackedDeviceProperty_Prop_CameraDistortionCoefficients_Float_Array       = 2073,
        ETrackedDeviceProperty_Prop_ExpectedControllerType_String                  = 2074,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraCorrectionMode_Int32        = 2200,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerLeft_Int32     = 2201,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerRight_Int32    = 2202,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerTop_Int32      = 2203,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerBottom_Int32   = 2204,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterLeft_Int32     = 2205,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterRight_Int32    = 2206,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterTop_Int32      = 2207,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterBottom_Int32   = 2208,
        ETrackedDeviceProperty_Prop_AttachedDeviceId_String                        = 3000,
        ETrackedDeviceProperty_Prop_SupportedButtons_Uint64                        = 3001,
        ETrackedDeviceProperty_Prop_Axis0Type_Int32                                = 3002,
        ETrackedDeviceProperty_Prop_Axis1Type_Int32                                = 3003,
        ETrackedDeviceProperty_Prop_Axis2Type_Int32                                = 3004,
        ETrackedDeviceProperty_Prop_Axis3Type_Int32                                = 3005,
        ETrackedDeviceProperty_Prop_Axis4Type_Int32                                = 3006,
        ETrackedDeviceProperty_Prop_ControllerRoleHint_Int32                       = 3007,
        ETrackedDeviceProperty_Prop_FieldOfViewLeftDegrees_Float                   = 4000,
        ETrackedDeviceProperty_Prop_FieldOfViewRightDegrees_Float                  = 4001,
        ETrackedDeviceProperty_Prop_FieldOfViewTopDegrees_Float                    = 4002,
        ETrackedDeviceProperty_Prop_FieldOfViewBottomDegrees_Float                 = 4003,
        ETrackedDeviceProperty_Prop_TrackingRangeMinimumMeters_Float               = 4004,
        ETrackedDeviceProperty_Prop_TrackingRangeMaximumMeters_Float               = 4005,
        ETrackedDeviceProperty_Prop_ModeLabel_String                               = 4006,
        ETrackedDeviceProperty_Prop_CanWirelessIdentify_Bool                       = 4007,
        ETrackedDeviceProperty_Prop_Nonce_Int32                                    = 4008,
        ETrackedDeviceProperty_Prop_IconPathName_String                            = 5000,
        ETrackedDeviceProperty_Prop_NamedIconPathDeviceOff_String                  = 5001,
        ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearching_String            = 5002,
        ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearchingAlert_String       = 5003,
        ETrackedDeviceProperty_Prop_NamedIconPathDeviceReady_String                = 5004,
        ETrackedDeviceProperty_Prop_NamedIconPathDeviceReadyAlert_String           = 5005,
        ETrackedDeviceProperty_Prop_NamedIconPathDeviceNotReady_String             = 5006,
        ETrackedDeviceProperty_Prop_NamedIconPathDeviceStandby_String              = 5007,
        ETrackedDeviceProperty_Prop_NamedIconPathDeviceAlertLow_String             = 5008,
        ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_Start                 = 5100,
        ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_End                   = 5150,
        ETrackedDeviceProperty_Prop_ParentContainer                                = 5151,
        ETrackedDeviceProperty_Prop_UserConfigPath_String                          = 6000,
        ETrackedDeviceProperty_Prop_InstallPath_String                             = 6001,
        ETrackedDeviceProperty_Prop_HasDisplayComponent_Bool                       = 6002,
        ETrackedDeviceProperty_Prop_HasControllerComponent_Bool                    = 6003,
        ETrackedDeviceProperty_Prop_HasCameraComponent_Bool                        = 6004,
        ETrackedDeviceProperty_Prop_HasDriverDirectModeComponent_Bool              = 6005,
        ETrackedDeviceProperty_Prop_HasVirtualDisplayComponent_Bool                = 6006,
        ETrackedDeviceProperty_Prop_HasSpatialAnchorsSupport_Bool                  = 6007,
        ETrackedDeviceProperty_Prop_ControllerType_String                          = 7000,
        ETrackedDeviceProperty_Prop_LegacyInputProfile_String                      = 7001,
        ETrackedDeviceProperty_Prop_ControllerHandSelectionPriority_Int32          = 7002,
        ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_Start                  = 10000,
        ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_End                    = 10999,
        ETrackedDeviceProperty_Prop_TrackedDeviceProperty_Max                      = 1000000;

    /**
     * {@code ETrackedPropertyError}: Used to return errors that occur when reading properties.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ETrackedPropertyError_TrackedProp_Success ETrackedPropertyError_TrackedProp_Success}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_WrongDataType ETrackedPropertyError_TrackedProp_WrongDataType}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_WrongDeviceClass ETrackedPropertyError_TrackedProp_WrongDeviceClass}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_BufferTooSmall ETrackedPropertyError_TrackedProp_BufferTooSmall}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_UnknownProperty ETrackedPropertyError_TrackedProp_UnknownProperty} - Driver has not set the property (and may not ever).</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_InvalidDevice ETrackedPropertyError_TrackedProp_InvalidDevice}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_CouldNotContactServer ETrackedPropertyError_TrackedProp_CouldNotContactServer}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_ValueNotProvidedByDevice ETrackedPropertyError_TrackedProp_ValueNotProvidedByDevice}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_StringExceedsMaximumLength ETrackedPropertyError_TrackedProp_StringExceedsMaximumLength}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_NotYetAvailable ETrackedPropertyError_TrackedProp_NotYetAvailable} - The property value isn't known yet, but is expected soon. Call again later.</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_PermissionDenied ETrackedPropertyError_TrackedProp_PermissionDenied}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_InvalidOperation ETrackedPropertyError_TrackedProp_InvalidOperation}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_CannotWriteToWildcards ETrackedPropertyError_TrackedProp_CannotWriteToWildcards}</li>
     * <li>{@link #ETrackedPropertyError_TrackedProp_IPCReadFailure ETrackedPropertyError_TrackedProp_IPCReadFailure}</li>
     * </ul>
     */
    public static final int
        ETrackedPropertyError_TrackedProp_Success                    = 0,
        ETrackedPropertyError_TrackedProp_WrongDataType              = 1,
        ETrackedPropertyError_TrackedProp_WrongDeviceClass           = 2,
        ETrackedPropertyError_TrackedProp_BufferTooSmall             = 3,
        ETrackedPropertyError_TrackedProp_UnknownProperty            = 4,
        ETrackedPropertyError_TrackedProp_InvalidDevice              = 5,
        ETrackedPropertyError_TrackedProp_CouldNotContactServer      = 6,
        ETrackedPropertyError_TrackedProp_ValueNotProvidedByDevice   = 7,
        ETrackedPropertyError_TrackedProp_StringExceedsMaximumLength = 8,
        ETrackedPropertyError_TrackedProp_NotYetAvailable            = 9,
        ETrackedPropertyError_TrackedProp_PermissionDenied           = 10,
        ETrackedPropertyError_TrackedProp_InvalidOperation           = 11,
        ETrackedPropertyError_TrackedProp_CannotWriteToWildcards     = 12,
        ETrackedPropertyError_TrackedProp_IPCReadFailure             = 13;

    /**
     * {@code EVRSubmitFlags}: Allows the application to control how scene textures are used by the compositor when calling {@link VRCompositor#VRCompositor_Submit Submit}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRSubmitFlags_Submit_Default EVRSubmitFlags_Submit_Default} - Simple render path. App submits rendered left and right eye images with no lens distortion correction applied.</li>
     * <li>{@link #EVRSubmitFlags_Submit_LensDistortionAlreadyApplied EVRSubmitFlags_Submit_LensDistortionAlreadyApplied} - 
     * App submits final left and right eye images with lens distortion already applied (lens distortion makes the images appear barrel distorted with
     * chromatic aberration correction applied). The app would have used the data returned by {@link VRSystem#VRSystem_ComputeDistortion ComputeDistortion} to apply the correct distortion to the
     * rendered images before calling {@link VRCompositor#VRCompositor_Submit Submit}.
     * </li>
     * <li>{@link #EVRSubmitFlags_Submit_GlRenderBuffer EVRSubmitFlags_Submit_GlRenderBuffer} - If the texture pointer passed in is actually a renderbuffer (e.g. for MSAA in OpenGL) then set this flag.</li>
     * <li>{@link #EVRSubmitFlags_Submit_Reserved EVRSubmitFlags_Submit_Reserved} - Do not use.</li>
     * <li>{@link #EVRSubmit_TextureWithPose EVRSubmit_TextureWithPose} - 
     * Set to indicate that {@code pTexture} is a pointer to a {@link VRTextureWithPose}.
     * 
     * <p>This flag can be combined with {@link #EVRSubmitFlags_Submit_TextureWithDepth} to pass a {@link VRTextureWithPoseAndDepth}.</p>
     * </li>
     * <li>{@link #EVRSubmitFlags_Submit_TextureWithDepth EVRSubmitFlags_Submit_TextureWithDepth} - 
     * Set to indicate that {@code pTexture} is a pointer to a {@link VRTextureWithDepth}.
     * 
     * <p>This flag can be combined with {@link #EVRSubmit_TextureWithPose} to pass a {@link VRTextureWithPoseAndDepth}.</p>
     * </li>
     * </ul>
     */
    public static final int
        EVRSubmitFlags_Submit_Default                      = 0,
        EVRSubmitFlags_Submit_LensDistortionAlreadyApplied = 1,
        EVRSubmitFlags_Submit_GlRenderBuffer               = 2,
        EVRSubmitFlags_Submit_Reserved                     = 4,
        EVRSubmit_TextureWithPose                          = 8,
        EVRSubmitFlags_Submit_TextureWithDepth             = 16;

    /**
     * {@code EVRState}: Status of the overall system or tracked objects.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRState_VRState_Undefined EVRState_VRState_Undefined}</li>
     * <li>{@link #EVRState_VRState_Off EVRState_VRState_Off}</li>
     * <li>{@link #EVRState_VRState_Searching EVRState_VRState_Searching}</li>
     * <li>{@link #EVRState_VRState_Searching_Alert EVRState_VRState_Searching_Alert}</li>
     * <li>{@link #EVRState_VRState_Ready EVRState_VRState_Ready}</li>
     * <li>{@link #EVRState_VRState_Ready_Alert EVRState_VRState_Ready_Alert}</li>
     * <li>{@link #EVRState_VRState_NotReady EVRState_VRState_NotReady}</li>
     * <li>{@link #EVRState_VRState_Standby EVRState_VRState_Standby}</li>
     * <li>{@link #EVRState_VRState_Ready_Alert_Low EVRState_VRState_Ready_Alert_Low}</li>
     * </ul>
     */
    public static final int
        EVRState_VRState_Undefined       = -1,
        EVRState_VRState_Off             = 0,
        EVRState_VRState_Searching       = 1,
        EVRState_VRState_Searching_Alert = 2,
        EVRState_VRState_Ready           = 3,
        EVRState_VRState_Ready_Alert     = 4,
        EVRState_VRState_NotReady        = 5,
        EVRState_VRState_Standby         = 6,
        EVRState_VRState_Ready_Alert_Low = 7;

    /**
     * {@code EVREventType}: The types of events that could be posted (and what the parameters mean for each event type).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVREventType_VREvent_None EVREventType_VREvent_None}</li>
     * <li>{@link #EVREventType_VREvent_TrackedDeviceActivated EVREventType_VREvent_TrackedDeviceActivated}</li>
     * <li>{@link #EVREventType_VREvent_TrackedDeviceDeactivated EVREventType_VREvent_TrackedDeviceDeactivated}</li>
     * <li>{@link #EVREventType_VREvent_TrackedDeviceUpdated EVREventType_VREvent_TrackedDeviceUpdated}</li>
     * <li>{@link #EVREventType_VREvent_TrackedDeviceUserInteractionStarted EVREventType_VREvent_TrackedDeviceUserInteractionStarted}</li>
     * <li>{@link #EVREventType_VREvent_TrackedDeviceUserInteractionEnded EVREventType_VREvent_TrackedDeviceUserInteractionEnded}</li>
     * <li>{@link #EVREventType_VREvent_IpdChanged EVREventType_VREvent_IpdChanged}</li>
     * <li>{@link #EVREventType_VREvent_EnterStandbyMode EVREventType_VREvent_EnterStandbyMode}</li>
     * <li>{@link #EVREventType_VREvent_LeaveStandbyMode EVREventType_VREvent_LeaveStandbyMode}</li>
     * <li>{@link #EVREventType_VREvent_TrackedDeviceRoleChanged EVREventType_VREvent_TrackedDeviceRoleChanged}</li>
     * <li>{@link #EVREventType_VREvent_WatchdogWakeUpRequested EVREventType_VREvent_WatchdogWakeUpRequested}</li>
     * <li>{@link #EVREventType_VREvent_LensDistortionChanged EVREventType_VREvent_LensDistortionChanged}</li>
     * <li>{@link #EVREventType_VREvent_PropertyChanged EVREventType_VREvent_PropertyChanged}</li>
     * <li>{@link #EVREventType_VREvent_WirelessDisconnect EVREventType_VREvent_WirelessDisconnect}</li>
     * <li>{@link #EVREventType_VREvent_WirelessReconnect EVREventType_VREvent_WirelessReconnect}</li>
     * <li>{@link #EVREventType_VREvent_ButtonPress EVREventType_VREvent_ButtonPress} - data is controller</li>
     * <li>{@link #EVREventType_VREvent_ButtonUnpress EVREventType_VREvent_ButtonUnpress} - data is controller</li>
     * <li>{@link #EVREventType_VREvent_ButtonTouch EVREventType_VREvent_ButtonTouch} - data is controller</li>
     * <li>{@link #EVREventType_VREvent_ButtonUntouch EVREventType_VREvent_ButtonUntouch} - data is controller</li>
     * <li>{@link #EVREventType_VREvent_DualAnalog_Press EVREventType_VREvent_DualAnalog_Press} - data is dualAnalog</li>
     * <li>{@link #EVREventType_VREvent_DualAnalog_Unpress EVREventType_VREvent_DualAnalog_Unpress} - data is dualAnalog</li>
     * <li>{@link #EVREventType_VREvent_DualAnalog_Touch EVREventType_VREvent_DualAnalog_Touch} - data is dualAnalog</li>
     * <li>{@link #EVREventType_VREvent_DualAnalog_Untouch EVREventType_VREvent_DualAnalog_Untouch} - data is dualAnalog</li>
     * <li>{@link #EVREventType_VREvent_DualAnalog_Move EVREventType_VREvent_DualAnalog_Move} - data is dualAnalog</li>
     * <li>{@link #EVREventType_VREvent_DualAnalog_ModeSwitch1 EVREventType_VREvent_DualAnalog_ModeSwitch1} - data is dualAnalog</li>
     * <li>{@link #EVREventType_VREvent_DualAnalog_ModeSwitch2 EVREventType_VREvent_DualAnalog_ModeSwitch2} - data is dualAnalog</li>
     * <li>{@link #EVREventType_VREvent_DualAnalog_Cancel EVREventType_VREvent_DualAnalog_Cancel} - data is dualAnalog</li>
     * <li>{@link #EVREventType_VREvent_MouseMove EVREventType_VREvent_MouseMove} - data is mouse</li>
     * <li>{@link #EVREventType_VREvent_MouseButtonDown EVREventType_VREvent_MouseButtonDown} - data is mouse</li>
     * <li>{@link #EVREventType_VREvent_MouseButtonUp EVREventType_VREvent_MouseButtonUp} - data is mouse</li>
     * <li>{@link #EVREventType_VREvent_FocusEnter EVREventType_VREvent_FocusEnter} - data is overlay</li>
     * <li>{@link #EVREventType_VREvent_FocusLeave EVREventType_VREvent_FocusLeave} - data is overlay</li>
     * <li>{@link #EVREventType_VREvent_ScrollDiscrete EVREventType_VREvent_ScrollDiscrete} - data is scroll</li>
     * <li>{@link #EVREventType_VREvent_TouchPadMove EVREventType_VREvent_TouchPadMove} - data is mouse</li>
     * <li>{@link #EVREventType_VREvent_OverlayFocusChanged EVREventType_VREvent_OverlayFocusChanged} - data is overlay, global event</li>
     * <li>{@link #EVREventType_VREvent_ReloadOverlays EVREventType_VREvent_ReloadOverlays}</li>
     * <li>{@link #EVREventType_VREvent_ScrollSmooth EVREventType_VREvent_ScrollSmooth} - data is scroll</li>
     * <li>{@link #EVREventType_VREvent_InputFocusCaptured EVREventType_VREvent_InputFocusCaptured} - data is process DEPRECATED</li>
     * <li>{@link #EVREventType_VREvent_InputFocusReleased EVREventType_VREvent_InputFocusReleased} - data is process DEPRECATED</li>
     * <li>{@link #EVREventType_VREvent_SceneFocusLost EVREventType_VREvent_SceneFocusLost} - data is process</li>
     * <li>{@link #EVREventType_VREvent_SceneFocusGained EVREventType_VREvent_SceneFocusGained} - data is process</li>
     * <li>{@link #EVREventType_VREvent_SceneApplicationChanged EVREventType_VREvent_SceneApplicationChanged} - data is process - The App actually drawing the scene changed (usually to or from the compositor)</li>
     * <li>{@link #EVREventType_VREvent_SceneFocusChanged EVREventType_VREvent_SceneFocusChanged} - data is process - New app got access to draw the scene</li>
     * <li>{@link #EVREventType_VREvent_InputFocusChanged EVREventType_VREvent_InputFocusChanged} - data is process</li>
     * <li>{@link #EVREventType_VREvent_SceneApplicationSecondaryRenderingStarted EVREventType_VREvent_SceneApplicationSecondaryRenderingStarted} - data is process</li>
     * <li>{@link #EVREventType_VREvent_SceneApplicationUsingWrongGraphicsAdapter EVREventType_VREvent_SceneApplicationUsingWrongGraphicsAdapter} - data is process</li>
     * <li>{@link #EVREventType_VREvent_ActionBindingReloaded EVREventType_VREvent_ActionBindingReloaded} - data is process - The App that action binds reloaded for</li>
     * <li>{@link #EVREventType_VREvent_HideRenderModels EVREventType_VREvent_HideRenderModels} - Sent to the scene application to request hiding render models temporarily</li>
     * <li>{@link #EVREventType_VREvent_ShowRenderModels EVREventType_VREvent_ShowRenderModels} - Sent to the scene application to request restoring render model visibility</li>
     * <li>{@link #EVREventType_VREvent_ConsoleOpened EVREventType_VREvent_ConsoleOpened}</li>
     * <li>{@link #EVREventType_VREvent_ConsoleClosed EVREventType_VREvent_ConsoleClosed}</li>
     * <li>{@link #EVREventType_VREvent_OverlayShown EVREventType_VREvent_OverlayShown}</li>
     * <li>{@link #EVREventType_VREvent_OverlayHidden EVREventType_VREvent_OverlayHidden}</li>
     * <li>{@link #EVREventType_VREvent_DashboardActivated EVREventType_VREvent_DashboardActivated}</li>
     * <li>{@link #EVREventType_VREvent_DashboardDeactivated EVREventType_VREvent_DashboardDeactivated}</li>
     * <li>{@link #EVREventType_VREvent_DashboardRequested EVREventType_VREvent_DashboardRequested} - Sent to the overlay manager - data is overlay</li>
     * <li>{@link #EVREventType_VREvent_ResetDashboard EVREventType_VREvent_ResetDashboard} - Sent to the overlay manager</li>
     * <li>{@link #EVREventType_VREvent_RenderToast EVREventType_VREvent_RenderToast} - Sent to the dashboard to render a toast - data is the notification ID</li>
     * <li>{@link #EVREventType_VREvent_ImageLoaded EVREventType_VREvent_ImageLoaded} - Sent to overlays when a SetOverlayRaw or SetOverlayFromFile call finishes loading</li>
     * <li>{@link #EVREventType_VREvent_ShowKeyboard EVREventType_VREvent_ShowKeyboard} - Sent to keyboard renderer in the dashboard to invoke it</li>
     * <li>{@link #EVREventType_VREvent_HideKeyboard EVREventType_VREvent_HideKeyboard} - Sent to keyboard renderer in the dashboard to hide it</li>
     * <li>{@link #EVREventType_VREvent_OverlayGamepadFocusGained EVREventType_VREvent_OverlayGamepadFocusGained} - Sent to an overlay when IVROverlay::SetFocusOverlay is called on it</li>
     * <li>{@link #EVREventType_VREvent_OverlayGamepadFocusLost EVREventType_VREvent_OverlayGamepadFocusLost} - Send to an overlay when it previously had focus and IVROverlay::SetFocusOverlay is called on something else</li>
     * <li>{@link #EVREventType_VREvent_OverlaySharedTextureChanged EVREventType_VREvent_OverlaySharedTextureChanged}</li>
     * <li>{@link #EVREventType_VREvent_ScreenshotTriggered EVREventType_VREvent_ScreenshotTriggered} - Screenshot button combo was pressed, Dashboard should request a screenshot</li>
     * <li>{@link #EVREventType_VREvent_ImageFailed EVREventType_VREvent_ImageFailed} - Sent to overlays when a SetOverlayRaw or SetOverlayfromFail fails to load</li>
     * <li>{@link #EVREventType_VREvent_DashboardOverlayCreated EVREventType_VREvent_DashboardOverlayCreated}</li>
     * <li>{@link #EVREventType_VREvent_SwitchGamepadFocus EVREventType_VREvent_SwitchGamepadFocus}</li>
     * <li>{@link #EVREventType_VREvent_RequestScreenshot EVREventType_VREvent_RequestScreenshot} - Sent by vrclient application to compositor to take a screenshot</li>
     * <li>{@link #EVREventType_VREvent_ScreenshotTaken EVREventType_VREvent_ScreenshotTaken} - Sent by compositor to the application that the screenshot has been taken</li>
     * <li>{@link #EVREventType_VREvent_ScreenshotFailed EVREventType_VREvent_ScreenshotFailed} - Sent by compositor to the application that the screenshot failed to be taken</li>
     * <li>{@link #EVREventType_VREvent_SubmitScreenshotToDashboard EVREventType_VREvent_SubmitScreenshotToDashboard} - Sent by compositor to the dashboard that a completed screenshot was submitted</li>
     * <li>{@link #EVREventType_VREvent_ScreenshotProgressToDashboard EVREventType_VREvent_ScreenshotProgressToDashboard} - Sent by compositor to the dashboard that a completed screenshot was submitted</li>
     * <li>{@link #EVREventType_VREvent_PrimaryDashboardDeviceChanged EVREventType_VREvent_PrimaryDashboardDeviceChanged}</li>
     * <li>{@link #EVREventType_VREvent_RoomViewShown EVREventType_VREvent_RoomViewShown} - Sent by compositor whenever room-view is enabled</li>
     * <li>{@link #EVREventType_VREvent_RoomViewHidden EVREventType_VREvent_RoomViewHidden} - Sent by compositor whenever room-view is disabled</li>
     * <li>{@link #EVREventType_VREvent_ShowUI EVREventType_VREvent_ShowUI} - data is showUi</li>
     * <li>{@link #EVREventType_VREvent_ShowDevTools EVREventType_VREvent_ShowDevTools} - data is showDevTools</li>
     * <li>{@link #EVREventType_VREvent_Notification_Shown EVREventType_VREvent_Notification_Shown}</li>
     * <li>{@link #EVREventType_VREvent_Notification_Hidden EVREventType_VREvent_Notification_Hidden}</li>
     * <li>{@link #EVREventType_VREvent_Notification_BeginInteraction EVREventType_VREvent_Notification_BeginInteraction}</li>
     * <li>{@link #EVREventType_VREvent_Notification_Destroyed EVREventType_VREvent_Notification_Destroyed}</li>
     * <li>{@link #EVREventType_VREvent_Quit EVREventType_VREvent_Quit} - data is process</li>
     * <li>{@link #EVREventType_VREvent_ProcessQuit EVREventType_VREvent_ProcessQuit} - data is process</li>
     * <li>{@link #EVREventType_VREvent_QuitAborted_UserPrompt EVREventType_VREvent_QuitAborted_UserPrompt} - data is process</li>
     * <li>{@link #EVREventType_VREvent_QuitAcknowledged EVREventType_VREvent_QuitAcknowledged} - data is process</li>
     * <li>{@link #EVREventType_VREvent_DriverRequestedQuit EVREventType_VREvent_DriverRequestedQuit} - The driver has requested that SteamVR shut down</li>
     * <li>{@link #EVREventType_VREvent_RestartRequested EVREventType_VREvent_RestartRequested} - A driver or other component wants the user to restart SteamVR</li>
     * <li>{@link #EVREventType_VREvent_ChaperoneDataHasChanged EVREventType_VREvent_ChaperoneDataHasChanged} - Sent when the process needs to call {@code VRChaperone()->ReloadInfo()}</li>
     * <li>{@link #EVREventType_VREvent_ChaperoneUniverseHasChanged EVREventType_VREvent_ChaperoneUniverseHasChanged}</li>
     * <li>{@link #EVREventType_VREvent_ChaperoneTempDataHasChanged EVREventType_VREvent_ChaperoneTempDataHasChanged}</li>
     * <li>{@link #EVREventType_VREvent_ChaperoneSettingsHaveChanged EVREventType_VREvent_ChaperoneSettingsHaveChanged}</li>
     * <li>{@link #EVREventType_VREvent_SeatedZeroPoseReset EVREventType_VREvent_SeatedZeroPoseReset}</li>
     * <li>{@link #EVREventType_VREvent_ChaperoneFlushCache EVREventType_VREvent_ChaperoneFlushCache} - Sent when the process needs to reload any cached data it retrieved from {@code VRChaperone()}</li>
     * <li>{@link #EVREventType_VREvent_AudioSettingsHaveChanged EVREventType_VREvent_AudioSettingsHaveChanged}</li>
     * <li>{@link #EVREventType_VREvent_BackgroundSettingHasChanged EVREventType_VREvent_BackgroundSettingHasChanged}</li>
     * <li>{@link #EVREventType_VREvent_CameraSettingsHaveChanged EVREventType_VREvent_CameraSettingsHaveChanged}</li>
     * <li>{@link #EVREventType_VREvent_ReprojectionSettingHasChanged EVREventType_VREvent_ReprojectionSettingHasChanged}</li>
     * <li>{@link #EVREventType_VREvent_ModelSkinSettingsHaveChanged EVREventType_VREvent_ModelSkinSettingsHaveChanged}</li>
     * <li>{@link #EVREventType_VREvent_EnvironmentSettingsHaveChanged EVREventType_VREvent_EnvironmentSettingsHaveChanged}</li>
     * <li>{@link #EVREventType_VREvent_PowerSettingsHaveChanged EVREventType_VREvent_PowerSettingsHaveChanged}</li>
     * <li>{@link #EVREventType_VREvent_EnableHomeAppSettingsHaveChanged EVREventType_VREvent_EnableHomeAppSettingsHaveChanged}</li>
     * <li>{@link #EVREventType_VREvent_SteamVRSectionSettingChanged EVREventType_VREvent_SteamVRSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_LighthouseSectionSettingChanged EVREventType_VREvent_LighthouseSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_NullSectionSettingChanged EVREventType_VREvent_NullSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_UserInterfaceSectionSettingChanged EVREventType_VREvent_UserInterfaceSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_NotificationsSectionSettingChanged EVREventType_VREvent_NotificationsSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_KeyboardSectionSettingChanged EVREventType_VREvent_KeyboardSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_PerfSectionSettingChanged EVREventType_VREvent_PerfSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_DashboardSectionSettingChanged EVREventType_VREvent_DashboardSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_WebInterfaceSectionSettingChanged EVREventType_VREvent_WebInterfaceSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_TrackersSectionSettingChanged EVREventType_VREvent_TrackersSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_LastKnownSectionSettingChanged EVREventType_VREvent_LastKnownSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_DismissedWarningsSectionSettingChanged EVREventType_VREvent_DismissedWarningsSectionSettingChanged}</li>
     * <li>{@link #EVREventType_VREvent_StatusUpdate EVREventType_VREvent_StatusUpdate}</li>
     * <li>{@link #EVREventType_VREvent_WebInterface_InstallDriverCompleted EVREventType_VREvent_WebInterface_InstallDriverCompleted}</li>
     * <li>{@link #EVREventType_VREvent_MCImageUpdated EVREventType_VREvent_MCImageUpdated}</li>
     * <li>{@link #EVREventType_VREvent_FirmwareUpdateStarted EVREventType_VREvent_FirmwareUpdateStarted}</li>
     * <li>{@link #EVREventType_VREvent_FirmwareUpdateFinished EVREventType_VREvent_FirmwareUpdateFinished}</li>
     * <li>{@link #EVREventType_VREvent_KeyboardClosed EVREventType_VREvent_KeyboardClosed}</li>
     * <li>{@link #EVREventType_VREvent_KeyboardCharInput EVREventType_VREvent_KeyboardCharInput}</li>
     * <li>{@link #EVREventType_VREvent_KeyboardDone EVREventType_VREvent_KeyboardDone} - Sent when DONE button clicked on keyboard</li>
     * <li>{@link #EVREventType_VREvent_ApplicationTransitionStarted EVREventType_VREvent_ApplicationTransitionStarted}</li>
     * <li>{@link #EVREventType_VREvent_ApplicationTransitionAborted EVREventType_VREvent_ApplicationTransitionAborted}</li>
     * <li>{@link #EVREventType_VREvent_ApplicationTransitionNewAppStarted EVREventType_VREvent_ApplicationTransitionNewAppStarted}</li>
     * <li>{@link #EVREventType_VREvent_ApplicationListUpdated EVREventType_VREvent_ApplicationListUpdated}</li>
     * <li>{@link #EVREventType_VREvent_ApplicationMimeTypeLoad EVREventType_VREvent_ApplicationMimeTypeLoad}</li>
     * <li>{@link #EVREventType_VREvent_ApplicationTransitionNewAppLaunchComplete EVREventType_VREvent_ApplicationTransitionNewAppLaunchComplete}</li>
     * <li>{@link #EVREventType_VREvent_ProcessConnected EVREventType_VREvent_ProcessConnected}</li>
     * <li>{@link #EVREventType_VREvent_ProcessDisconnected EVREventType_VREvent_ProcessDisconnected}</li>
     * <li>{@link #EVREventType_VREvent_Compositor_MirrorWindowShown EVREventType_VREvent_Compositor_MirrorWindowShown}</li>
     * <li>{@link #EVREventType_VREvent_Compositor_MirrorWindowHidden EVREventType_VREvent_Compositor_MirrorWindowHidden}</li>
     * <li>{@link #EVREventType_VREvent_Compositor_ChaperoneBoundsShown EVREventType_VREvent_Compositor_ChaperoneBoundsShown}</li>
     * <li>{@link #EVREventType_VREvent_Compositor_ChaperoneBoundsHidden EVREventType_VREvent_Compositor_ChaperoneBoundsHidden}</li>
     * <li>{@link #EVREventType_VREvent_Compositor_DisplayDisconnected EVREventType_VREvent_Compositor_DisplayDisconnected}</li>
     * <li>{@link #EVREventType_VREvent_Compositor_DisplayReconnected EVREventType_VREvent_Compositor_DisplayReconnected}</li>
     * <li>{@link #EVREventType_VREvent_Compositor_HDCPError EVREventType_VREvent_Compositor_HDCPError} - data is hdcpError</li>
     * <li>{@link #EVREventType_VREvent_Compositor_ApplicationNotResponding EVREventType_VREvent_Compositor_ApplicationNotResponding}</li>
     * <li>{@link #EVREventType_VREvent_Compositor_ApplicationResumed EVREventType_VREvent_Compositor_ApplicationResumed}</li>
     * <li>{@link #EVREventType_VREvent_TrackedCamera_StartVideoStream EVREventType_VREvent_TrackedCamera_StartVideoStream}</li>
     * <li>{@link #EVREventType_VREvent_TrackedCamera_StopVideoStream EVREventType_VREvent_TrackedCamera_StopVideoStream}</li>
     * <li>{@link #EVREventType_VREvent_TrackedCamera_PauseVideoStream EVREventType_VREvent_TrackedCamera_PauseVideoStream}</li>
     * <li>{@link #EVREventType_VREvent_TrackedCamera_ResumeVideoStream EVREventType_VREvent_TrackedCamera_ResumeVideoStream}</li>
     * <li>{@link #EVREventType_VREvent_TrackedCamera_EditingSurface EVREventType_VREvent_TrackedCamera_EditingSurface}</li>
     * <li>{@link #EVREventType_VREvent_PerformanceTest_EnableCapture EVREventType_VREvent_PerformanceTest_EnableCapture}</li>
     * <li>{@link #EVREventType_VREvent_PerformanceTest_DisableCapture EVREventType_VREvent_PerformanceTest_DisableCapture}</li>
     * <li>{@link #EVREventType_VREvent_PerformanceTest_FidelityLevel EVREventType_VREvent_PerformanceTest_FidelityLevel}</li>
     * <li>{@link #EVREventType_VREvent_MessageOverlay_Closed EVREventType_VREvent_MessageOverlay_Closed}</li>
     * <li>{@link #EVREventType_VREvent_MessageOverlayCloseRequested EVREventType_VREvent_MessageOverlayCloseRequested}</li>
     * <li>{@link #EVREventType_VREvent_Input_HapticVibration EVREventType_VREvent_Input_HapticVibration}</li>
     * <li>{@link #EVREventType_VREvent_Input_BindingLoadFailed EVREventType_VREvent_Input_BindingLoadFailed} - data is inputBinding</li>
     * <li>{@link #EVREventType_VREvent_Input_BindingLoadSuccessful EVREventType_VREvent_Input_BindingLoadSuccessful} - data is inputBinding</li>
     * <li>{@link #EVREventType_VREvent_Input_ActionManifestReloaded EVREventType_VREvent_Input_ActionManifestReloaded} - no data</li>
     * <li>{@link #EVREventType_VREvent_Input_ActionManifestLoadFailed EVREventType_VREvent_Input_ActionManifestLoadFailed} - data is actionManifest</li>
     * <li>{@link #EVREventType_VREvent_Input_ProgressUpdate EVREventType_VREvent_Input_ProgressUpdate} - data is progressUpdate</li>
     * <li>{@link #EVREventType_VREvent_Input_TrackerActivated EVREventType_VREvent_Input_TrackerActivated}</li>
     * <li>{@link #EVREventType_VREvent_Input_BindingsUpdated EVREventType_VREvent_Input_BindingsUpdated}</li>
     * <li>{@link #EVREventType_VREvent_SpatialAnchors_PoseUpdated EVREventType_VREvent_SpatialAnchors_PoseUpdated} - data is spatialAnchor. broadcast</li>
     * <li>{@link #EVREventType_VREvent_SpatialAnchors_DescriptorUpdated EVREventType_VREvent_SpatialAnchors_DescriptorUpdated} - data is spatialAnchor. broadcast</li>
     * <li>{@link #EVREventType_VREvent_SpatialAnchors_RequestPoseUpdate EVREventType_VREvent_SpatialAnchors_RequestPoseUpdate} - data is spatialAnchor. sent to specific driver</li>
     * <li>{@link #EVREventType_VREvent_SpatialAnchors_RequestDescriptorUpdate EVREventType_VREvent_SpatialAnchors_RequestDescriptorUpdate} - data is spatialAnchor. sent to specific driver</li>
     * <li>{@link #EVREventType_VREvent_SystemReport_Started EVREventType_VREvent_SystemReport_Started} - user or system initiated generation of a system report. broadcast</li>
     * <li>{@link #EVREventType_VREvent_VendorSpecific_Reserved_Start EVREventType_VREvent_VendorSpecific_Reserved_Start}</li>
     * <li>{@link #EVREventType_VREvent_VendorSpecific_Reserved_End EVREventType_VREvent_VendorSpecific_Reserved_End}</li>
     * </ul>
     */
    public static final int
        EVREventType_VREvent_None                                      = 0,
        EVREventType_VREvent_TrackedDeviceActivated                    = 100,
        EVREventType_VREvent_TrackedDeviceDeactivated                  = 101,
        EVREventType_VREvent_TrackedDeviceUpdated                      = 102,
        EVREventType_VREvent_TrackedDeviceUserInteractionStarted       = 103,
        EVREventType_VREvent_TrackedDeviceUserInteractionEnded         = 104,
        EVREventType_VREvent_IpdChanged                                = 105,
        EVREventType_VREvent_EnterStandbyMode                          = 106,
        EVREventType_VREvent_LeaveStandbyMode                          = 107,
        EVREventType_VREvent_TrackedDeviceRoleChanged                  = 108,
        EVREventType_VREvent_WatchdogWakeUpRequested                   = 109,
        EVREventType_VREvent_LensDistortionChanged                     = 110,
        EVREventType_VREvent_PropertyChanged                           = 111,
        EVREventType_VREvent_WirelessDisconnect                        = 112,
        EVREventType_VREvent_WirelessReconnect                         = 113,
        EVREventType_VREvent_ButtonPress                               = 200,
        EVREventType_VREvent_ButtonUnpress                             = 201,
        EVREventType_VREvent_ButtonTouch                               = 202,
        EVREventType_VREvent_ButtonUntouch                             = 203,
        EVREventType_VREvent_DualAnalog_Press                          = 250,
        EVREventType_VREvent_DualAnalog_Unpress                        = 251,
        EVREventType_VREvent_DualAnalog_Touch                          = 252,
        EVREventType_VREvent_DualAnalog_Untouch                        = 253,
        EVREventType_VREvent_DualAnalog_Move                           = 254,
        EVREventType_VREvent_DualAnalog_ModeSwitch1                    = 255,
        EVREventType_VREvent_DualAnalog_ModeSwitch2                    = 256,
        EVREventType_VREvent_DualAnalog_Cancel                         = 257,
        EVREventType_VREvent_MouseMove                                 = 300,
        EVREventType_VREvent_MouseButtonDown                           = 301,
        EVREventType_VREvent_MouseButtonUp                             = 302,
        EVREventType_VREvent_FocusEnter                                = 303,
        EVREventType_VREvent_FocusLeave                                = 304,
        EVREventType_VREvent_ScrollDiscrete                            = 305,
        EVREventType_VREvent_TouchPadMove                              = 306,
        EVREventType_VREvent_OverlayFocusChanged                       = 307,
        EVREventType_VREvent_ReloadOverlays                            = 308,
        EVREventType_VREvent_ScrollSmooth                              = 309,
        EVREventType_VREvent_InputFocusCaptured                        = 400,
        EVREventType_VREvent_InputFocusReleased                        = 401,
        EVREventType_VREvent_SceneFocusLost                            = 402,
        EVREventType_VREvent_SceneFocusGained                          = 403,
        EVREventType_VREvent_SceneApplicationChanged                   = 404,
        EVREventType_VREvent_SceneFocusChanged                         = 405,
        EVREventType_VREvent_InputFocusChanged                         = 406,
        EVREventType_VREvent_SceneApplicationSecondaryRenderingStarted = 407,
        EVREventType_VREvent_SceneApplicationUsingWrongGraphicsAdapter = 408,
        EVREventType_VREvent_ActionBindingReloaded                     = 409,
        EVREventType_VREvent_HideRenderModels                          = 410,
        EVREventType_VREvent_ShowRenderModels                          = 411,
        EVREventType_VREvent_ConsoleOpened                             = 420,
        EVREventType_VREvent_ConsoleClosed                             = 421,
        EVREventType_VREvent_OverlayShown                              = 500,
        EVREventType_VREvent_OverlayHidden                             = 501,
        EVREventType_VREvent_DashboardActivated                        = 502,
        EVREventType_VREvent_DashboardDeactivated                      = 503,
        EVREventType_VREvent_DashboardRequested                        = 504,
        EVREventType_VREvent_ResetDashboard                            = 505,
        EVREventType_VREvent_RenderToast                               = 506,
        EVREventType_VREvent_ImageLoaded                               = 507,
        EVREventType_VREvent_ShowKeyboard                              = 508,
        EVREventType_VREvent_HideKeyboard                              = 509,
        EVREventType_VREvent_OverlayGamepadFocusGained                 = 510,
        EVREventType_VREvent_OverlayGamepadFocusLost                   = 511,
        EVREventType_VREvent_OverlaySharedTextureChanged               = 512,
        EVREventType_VREvent_ScreenshotTriggered                       = 516,
        EVREventType_VREvent_ImageFailed                               = 517,
        EVREventType_VREvent_DashboardOverlayCreated                   = 518,
        EVREventType_VREvent_SwitchGamepadFocus                        = 519,
        EVREventType_VREvent_RequestScreenshot                         = 520,
        EVREventType_VREvent_ScreenshotTaken                           = 521,
        EVREventType_VREvent_ScreenshotFailed                          = 522,
        EVREventType_VREvent_SubmitScreenshotToDashboard               = 523,
        EVREventType_VREvent_ScreenshotProgressToDashboard             = 524,
        EVREventType_VREvent_PrimaryDashboardDeviceChanged             = 525,
        EVREventType_VREvent_RoomViewShown                             = 526,
        EVREventType_VREvent_RoomViewHidden                            = 527,
        EVREventType_VREvent_ShowUI                                    = 528,
        EVREventType_VREvent_ShowDevTools                              = 529,
        EVREventType_VREvent_Notification_Shown                        = 600,
        EVREventType_VREvent_Notification_Hidden                       = 601,
        EVREventType_VREvent_Notification_BeginInteraction             = 602,
        EVREventType_VREvent_Notification_Destroyed                    = 603,
        EVREventType_VREvent_Quit                                      = 700,
        EVREventType_VREvent_ProcessQuit                               = 701,
        EVREventType_VREvent_QuitAborted_UserPrompt                    = 702,
        EVREventType_VREvent_QuitAcknowledged                          = 703,
        EVREventType_VREvent_DriverRequestedQuit                       = 704,
        EVREventType_VREvent_RestartRequested                          = 705,
        EVREventType_VREvent_ChaperoneDataHasChanged                   = 800,
        EVREventType_VREvent_ChaperoneUniverseHasChanged               = 801,
        EVREventType_VREvent_ChaperoneTempDataHasChanged               = 802,
        EVREventType_VREvent_ChaperoneSettingsHaveChanged              = 803,
        EVREventType_VREvent_SeatedZeroPoseReset                       = 804,
        EVREventType_VREvent_ChaperoneFlushCache                       = 805,
        EVREventType_VREvent_AudioSettingsHaveChanged                  = 820,
        EVREventType_VREvent_BackgroundSettingHasChanged               = 850,
        EVREventType_VREvent_CameraSettingsHaveChanged                 = 851,
        EVREventType_VREvent_ReprojectionSettingHasChanged             = 852,
        EVREventType_VREvent_ModelSkinSettingsHaveChanged              = 853,
        EVREventType_VREvent_EnvironmentSettingsHaveChanged            = 854,
        EVREventType_VREvent_PowerSettingsHaveChanged                  = 855,
        EVREventType_VREvent_EnableHomeAppSettingsHaveChanged          = 856,
        EVREventType_VREvent_SteamVRSectionSettingChanged              = 857,
        EVREventType_VREvent_LighthouseSectionSettingChanged           = 858,
        EVREventType_VREvent_NullSectionSettingChanged                 = 859,
        EVREventType_VREvent_UserInterfaceSectionSettingChanged        = 860,
        EVREventType_VREvent_NotificationsSectionSettingChanged        = 861,
        EVREventType_VREvent_KeyboardSectionSettingChanged             = 862,
        EVREventType_VREvent_PerfSectionSettingChanged                 = 863,
        EVREventType_VREvent_DashboardSectionSettingChanged            = 864,
        EVREventType_VREvent_WebInterfaceSectionSettingChanged         = 865,
        EVREventType_VREvent_TrackersSectionSettingChanged             = 866,
        EVREventType_VREvent_LastKnownSectionSettingChanged            = 867,
        EVREventType_VREvent_DismissedWarningsSectionSettingChanged    = 868,
        EVREventType_VREvent_StatusUpdate                              = 900,
        EVREventType_VREvent_WebInterface_InstallDriverCompleted       = 950,
        EVREventType_VREvent_MCImageUpdated                            = 1000,
        EVREventType_VREvent_FirmwareUpdateStarted                     = 1100,
        EVREventType_VREvent_FirmwareUpdateFinished                    = 1101,
        EVREventType_VREvent_KeyboardClosed                            = 1200,
        EVREventType_VREvent_KeyboardCharInput                         = 1201,
        EVREventType_VREvent_KeyboardDone                              = 1202,
        EVREventType_VREvent_ApplicationTransitionStarted              = 1300,
        EVREventType_VREvent_ApplicationTransitionAborted              = 1301,
        EVREventType_VREvent_ApplicationTransitionNewAppStarted        = 1302,
        EVREventType_VREvent_ApplicationListUpdated                    = 1303,
        EVREventType_VREvent_ApplicationMimeTypeLoad                   = 1304,
        EVREventType_VREvent_ApplicationTransitionNewAppLaunchComplete = 1305,
        EVREventType_VREvent_ProcessConnected                          = 1306,
        EVREventType_VREvent_ProcessDisconnected                       = 1307,
        EVREventType_VREvent_Compositor_MirrorWindowShown              = 1400,
        EVREventType_VREvent_Compositor_MirrorWindowHidden             = 1401,
        EVREventType_VREvent_Compositor_ChaperoneBoundsShown           = 1410,
        EVREventType_VREvent_Compositor_ChaperoneBoundsHidden          = 1411,
        EVREventType_VREvent_Compositor_DisplayDisconnected            = 1412,
        EVREventType_VREvent_Compositor_DisplayReconnected             = 1413,
        EVREventType_VREvent_Compositor_HDCPError                      = 1414,
        EVREventType_VREvent_Compositor_ApplicationNotResponding       = 1415,
        EVREventType_VREvent_Compositor_ApplicationResumed             = 1416,
        EVREventType_VREvent_TrackedCamera_StartVideoStream            = 1500,
        EVREventType_VREvent_TrackedCamera_StopVideoStream             = 1501,
        EVREventType_VREvent_TrackedCamera_PauseVideoStream            = 1502,
        EVREventType_VREvent_TrackedCamera_ResumeVideoStream           = 1503,
        EVREventType_VREvent_TrackedCamera_EditingSurface              = 1550,
        EVREventType_VREvent_PerformanceTest_EnableCapture             = 1600,
        EVREventType_VREvent_PerformanceTest_DisableCapture            = 1601,
        EVREventType_VREvent_PerformanceTest_FidelityLevel             = 1602,
        EVREventType_VREvent_MessageOverlay_Closed                     = 1650,
        EVREventType_VREvent_MessageOverlayCloseRequested              = 1651,
        EVREventType_VREvent_Input_HapticVibration                     = 1700,
        EVREventType_VREvent_Input_BindingLoadFailed                   = 1701,
        EVREventType_VREvent_Input_BindingLoadSuccessful               = 1702,
        EVREventType_VREvent_Input_ActionManifestReloaded              = 1703,
        EVREventType_VREvent_Input_ActionManifestLoadFailed            = 1704,
        EVREventType_VREvent_Input_ProgressUpdate                      = 1705,
        EVREventType_VREvent_Input_TrackerActivated                    = 1706,
        EVREventType_VREvent_Input_BindingsUpdated                     = 1707,
        EVREventType_VREvent_SpatialAnchors_PoseUpdated                = 1800,
        EVREventType_VREvent_SpatialAnchors_DescriptorUpdated          = 1801,
        EVREventType_VREvent_SpatialAnchors_RequestPoseUpdate          = 1802,
        EVREventType_VREvent_SpatialAnchors_RequestDescriptorUpdate    = 1803,
        EVREventType_VREvent_SystemReport_Started                      = 1900,
        EVREventType_VREvent_VendorSpecific_Reserved_Start             = 10000,
        EVREventType_VREvent_VendorSpecific_Reserved_End               = 19999;

    /**
     * {@code EDeviceActivityLevel}: Level of Hmd activity.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EDeviceActivityLevel_k_EDeviceActivityLevel_Unknown EDeviceActivityLevel_k_EDeviceActivityLevel_Unknown}</li>
     * <li>{@link #EDeviceActivityLevel_k_EDeviceActivityLevel_Idle EDeviceActivityLevel_k_EDeviceActivityLevel_Idle} - No activity for the last 10 seconds.</li>
     * <li>{@link #EDeviceActivityLevel_k_EDeviceActivityLevel_UserInteraction EDeviceActivityLevel_k_EDeviceActivityLevel_UserInteraction} - Activity (movement or prox sensor) is happening now.</li>
     * <li>{@link #EDeviceActivityLevel_k_EDeviceActivityLevel_UserInteraction_Timeout EDeviceActivityLevel_k_EDeviceActivityLevel_UserInteraction_Timeout} - No activity for the last 0.5 seconds.</li>
     * <li>{@link #EDeviceActivityLevel_k_EDeviceActivityLevel_Standby EDeviceActivityLevel_k_EDeviceActivityLevel_Standby} - Idle for at least 5 seconds (configurable in Settings -&gt; Power Management).</li>
     * </ul>
     */
    public static final int
        EDeviceActivityLevel_k_EDeviceActivityLevel_Unknown                 = -1,
        EDeviceActivityLevel_k_EDeviceActivityLevel_Idle                    = 0,
        EDeviceActivityLevel_k_EDeviceActivityLevel_UserInteraction         = 1,
        EDeviceActivityLevel_k_EDeviceActivityLevel_UserInteraction_Timeout = 2,
        EDeviceActivityLevel_k_EDeviceActivityLevel_Standby                 = 3;

    /**
     * {@code EVRButtonId}: VR controller button and axis IDs.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRButtonId_k_EButton_System EVRButtonId_k_EButton_System}</li>
     * <li>{@link #EVRButtonId_k_EButton_ApplicationMenu EVRButtonId_k_EButton_ApplicationMenu}</li>
     * <li>{@link #EVRButtonId_k_EButton_Grip EVRButtonId_k_EButton_Grip}</li>
     * <li>{@link #EVRButtonId_k_EButton_DPad_Left EVRButtonId_k_EButton_DPad_Left}</li>
     * <li>{@link #EVRButtonId_k_EButton_DPad_Up EVRButtonId_k_EButton_DPad_Up}</li>
     * <li>{@link #EVRButtonId_k_EButton_DPad_Right EVRButtonId_k_EButton_DPad_Right}</li>
     * <li>{@link #EVRButtonId_k_EButton_DPad_Down EVRButtonId_k_EButton_DPad_Down}</li>
     * <li>{@link #EVRButtonId_k_EButton_A EVRButtonId_k_EButton_A}</li>
     * <li>{@link #EVRButtonId_k_EButton_ProximitySensor EVRButtonId_k_EButton_ProximitySensor}</li>
     * <li>{@link #EVRButtonId_k_EButton_Axis0 EVRButtonId_k_EButton_Axis0}</li>
     * <li>{@link #EVRButtonId_k_EButton_Axis1 EVRButtonId_k_EButton_Axis1}</li>
     * <li>{@link #EVRButtonId_k_EButton_Axis2 EVRButtonId_k_EButton_Axis2}</li>
     * <li>{@link #EVRButtonId_k_EButton_Axis3 EVRButtonId_k_EButton_Axis3}</li>
     * <li>{@link #EVRButtonId_k_EButton_Axis4 EVRButtonId_k_EButton_Axis4}</li>
     * <li>{@link #EVRButtonId_k_EButton_SteamVR_Touchpad EVRButtonId_k_EButton_SteamVR_Touchpad}</li>
     * <li>{@link #EVRButtonId_k_EButton_SteamVR_Trigger EVRButtonId_k_EButton_SteamVR_Trigger}</li>
     * <li>{@link #EVRButtonId_k_EButton_Dashboard_Back EVRButtonId_k_EButton_Dashboard_Back}</li>
     * <li>{@link #EVRButtonId_k_EButton_Knuckles_A EVRButtonId_k_EButton_Knuckles_A}</li>
     * <li>{@link #EVRButtonId_k_EButton_Knuckles_B EVRButtonId_k_EButton_Knuckles_B}</li>
     * <li>{@link #EVRButtonId_k_EButton_Knuckles_JoyStick EVRButtonId_k_EButton_Knuckles_JoyStick}</li>
     * <li>{@link #EVRButtonId_k_EButton_Max EVRButtonId_k_EButton_Max}</li>
     * </ul>
     */
    public static final int
        EVRButtonId_k_EButton_System            = 0,
        EVRButtonId_k_EButton_ApplicationMenu   = 1,
        EVRButtonId_k_EButton_Grip              = 2,
        EVRButtonId_k_EButton_DPad_Left         = 3,
        EVRButtonId_k_EButton_DPad_Up           = 4,
        EVRButtonId_k_EButton_DPad_Right        = 5,
        EVRButtonId_k_EButton_DPad_Down         = 6,
        EVRButtonId_k_EButton_A                 = 7,
        EVRButtonId_k_EButton_ProximitySensor   = 31,
        EVRButtonId_k_EButton_Axis0             = 32,
        EVRButtonId_k_EButton_Axis1             = 33,
        EVRButtonId_k_EButton_Axis2             = 34,
        EVRButtonId_k_EButton_Axis3             = 35,
        EVRButtonId_k_EButton_Axis4             = 36,
        EVRButtonId_k_EButton_SteamVR_Touchpad  = EVRButtonId_k_EButton_Axis0,
        EVRButtonId_k_EButton_SteamVR_Trigger   = EVRButtonId_k_EButton_Axis1,
        EVRButtonId_k_EButton_Dashboard_Back    = EVRButtonId_k_EButton_Grip,
        EVRButtonId_k_EButton_Knuckles_A        = EVRButtonId_k_EButton_Grip,
        EVRButtonId_k_EButton_Knuckles_B        = EVRButtonId_k_EButton_ApplicationMenu,
        EVRButtonId_k_EButton_Knuckles_JoyStick = EVRButtonId_k_EButton_Axis3,
        EVRButtonId_k_EButton_Max               = 64;

    /**
     * {@code EVRMouseButton}: used for simulated mouse events in overlay space.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRMouseButton_VRMouseButton_Left EVRMouseButton_VRMouseButton_Left}</li>
     * <li>{@link #EVRMouseButton_VRMouseButton_Right EVRMouseButton_VRMouseButton_Right}</li>
     * <li>{@link #EVRMouseButton_VRMouseButton_Middle EVRMouseButton_VRMouseButton_Middle}</li>
     * </ul>
     */
    public static final int
        EVRMouseButton_VRMouseButton_Left   = 1,
        EVRMouseButton_VRMouseButton_Right  = 2,
        EVRMouseButton_VRMouseButton_Middle = 4;

    /**
     * {@code EDualAnalogWhich}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EDualAnalogWhich_k_EDualAnalog_Left EDualAnalogWhich_k_EDualAnalog_Left}</li>
     * <li>{@link #EDualAnalogWhich_k_EDualAnalog_Right EDualAnalogWhich_k_EDualAnalog_Right}</li>
     * </ul>
     */
    public static final int
        EDualAnalogWhich_k_EDualAnalog_Left  = 0,
        EDualAnalogWhich_k_EDualAnalog_Right = 1;

    /**
     * {@code EShowUIType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EShowUIType_ShowUI_ControllerBinding EShowUIType_ShowUI_ControllerBinding}</li>
     * <li>{@link #EShowUIType_ShowUI_ManageTrackers EShowUIType_ShowUI_ManageTrackers}</li>
     * <li>{@link #EShowUIType_ShowUI_QuickStart EShowUIType_ShowUI_QuickStart}</li>
     * <li>{@link #EShowUIType_ShowUI_Pairing EShowUIType_ShowUI_Pairing}</li>
     * <li>{@link #EShowUIType_ShowUI_Settings EShowUIType_ShowUI_Settings}</li>
     * </ul>
     */
    public static final int
        EShowUIType_ShowUI_ControllerBinding = 0,
        EShowUIType_ShowUI_ManageTrackers    = 1,
        EShowUIType_ShowUI_QuickStart        = 2,
        EShowUIType_ShowUI_Pairing           = 3,
        EShowUIType_ShowUI_Settings          = 4;

    /**
     * {@code EHDCPError}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EHDCPError_HDCPError_None EHDCPError_HDCPError_None}</li>
     * <li>{@link #EHDCPError_HDCPError_LinkLost EHDCPError_HDCPError_LinkLost}</li>
     * <li>{@link #EHDCPError_HDCPError_Tampered EHDCPError_HDCPError_Tampered}</li>
     * <li>{@link #EHDCPError_HDCPError_DeviceRevoked EHDCPError_HDCPError_DeviceRevoked}</li>
     * <li>{@link #EHDCPError_HDCPError_Unknown EHDCPError_HDCPError_Unknown}</li>
     * </ul>
     */
    public static final int
        EHDCPError_HDCPError_None          = 0,
        EHDCPError_HDCPError_LinkLost      = 1,
        EHDCPError_HDCPError_Tampered      = 2,
        EHDCPError_HDCPError_DeviceRevoked = 3,
        EHDCPError_HDCPError_Unknown       = 4;

    /**
     * {@code EVRInputError}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRInputError_VRInputError_None EVRInputError_VRInputError_None}</li>
     * <li>{@link #EVRInputError_VRInputError_NameNotFound EVRInputError_VRInputError_NameNotFound}</li>
     * <li>{@link #EVRInputError_VRInputError_WrongType EVRInputError_VRInputError_WrongType}</li>
     * <li>{@link #EVRInputError_VRInputError_InvalidHandle EVRInputError_VRInputError_InvalidHandle}</li>
     * <li>{@link #EVRInputError_VRInputError_InvalidParam EVRInputError_VRInputError_InvalidParam}</li>
     * <li>{@link #EVRInputError_VRInputError_NoSteam EVRInputError_VRInputError_NoSteam}</li>
     * <li>{@link #EVRInputError_VRInputError_MaxCapacityReached EVRInputError_VRInputError_MaxCapacityReached}</li>
     * <li>{@link #EVRInputError_VRInputError_IPCError EVRInputError_VRInputError_IPCError}</li>
     * <li>{@link #EVRInputError_VRInputError_NoActiveActionSet EVRInputError_VRInputError_NoActiveActionSet}</li>
     * <li>{@link #EVRInputError_VRInputError_InvalidDevice EVRInputError_VRInputError_InvalidDevice}</li>
     * <li>{@link #EVRInputError_VRInputError_InvalidSkeleton EVRInputError_VRInputError_InvalidSkeleton}</li>
     * <li>{@link #EVRInputError_VRInputError_InvalidBoneCount EVRInputError_VRInputError_InvalidBoneCount}</li>
     * <li>{@link #EVRInputError_VRInputError_InvalidCompressedData EVRInputError_VRInputError_InvalidCompressedData}</li>
     * <li>{@link #EVRInputError_VRInputError_NoData EVRInputError_VRInputError_NoData}</li>
     * <li>{@link #EVRInputError_VRInputError_BufferTooSmall EVRInputError_VRInputError_BufferTooSmall}</li>
     * <li>{@link #EVRInputError_VRInputError_MismatchedActionManifest EVRInputError_VRInputError_MismatchedActionManifest}</li>
     * <li>{@link #EVRInputError_VRInputError_MissingSkeletonData EVRInputError_VRInputError_MissingSkeletonData}</li>
     * <li>{@link #EVRInputError_VRInputError_InvalidBoneIndex EVRInputError_VRInputError_InvalidBoneIndex}</li>
     * </ul>
     */
    public static final int
        EVRInputError_VRInputError_None                     = 0,
        EVRInputError_VRInputError_NameNotFound             = 1,
        EVRInputError_VRInputError_WrongType                = 2,
        EVRInputError_VRInputError_InvalidHandle            = 3,
        EVRInputError_VRInputError_InvalidParam             = 4,
        EVRInputError_VRInputError_NoSteam                  = 5,
        EVRInputError_VRInputError_MaxCapacityReached       = 6,
        EVRInputError_VRInputError_IPCError                 = 7,
        EVRInputError_VRInputError_NoActiveActionSet        = 8,
        EVRInputError_VRInputError_InvalidDevice            = 9,
        EVRInputError_VRInputError_InvalidSkeleton          = 10,
        EVRInputError_VRInputError_InvalidBoneCount         = 11,
        EVRInputError_VRInputError_InvalidCompressedData    = 12,
        EVRInputError_VRInputError_NoData                   = 13,
        EVRInputError_VRInputError_BufferTooSmall           = 14,
        EVRInputError_VRInputError_MismatchedActionManifest = 15,
        EVRInputError_VRInputError_MissingSkeletonData      = 16,
        EVRInputError_VRInputError_InvalidBoneIndex         = 17;

    /**
     * {@code EVRSpatialAnchorError}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_Success EVRSpatialAnchorError_VRSpatialAnchorError_Success}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_Internal EVRSpatialAnchorError_VRSpatialAnchorError_Internal}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_UnknownHandle EVRSpatialAnchorError_VRSpatialAnchorError_UnknownHandle}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_ArrayTooSmall EVRSpatialAnchorError_VRSpatialAnchorError_ArrayTooSmall}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_InvalidDescriptorChar EVRSpatialAnchorError_VRSpatialAnchorError_InvalidDescriptorChar}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_NotYetAvailable EVRSpatialAnchorError_VRSpatialAnchorError_NotYetAvailable}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_NotAvailableInThisUniverse EVRSpatialAnchorError_VRSpatialAnchorError_NotAvailableInThisUniverse}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_PermanentlyUnavailable EVRSpatialAnchorError_VRSpatialAnchorError_PermanentlyUnavailable}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_WrongDriver EVRSpatialAnchorError_VRSpatialAnchorError_WrongDriver}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_DescriptorTooLong EVRSpatialAnchorError_VRSpatialAnchorError_DescriptorTooLong}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_Unknown EVRSpatialAnchorError_VRSpatialAnchorError_Unknown}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_NoRoomCalibration EVRSpatialAnchorError_VRSpatialAnchorError_NoRoomCalibration}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_InvalidArgument EVRSpatialAnchorError_VRSpatialAnchorError_InvalidArgument}</li>
     * <li>{@link #EVRSpatialAnchorError_VRSpatialAnchorError_UnknownDriver EVRSpatialAnchorError_VRSpatialAnchorError_UnknownDriver}</li>
     * </ul>
     */
    public static final int
        EVRSpatialAnchorError_VRSpatialAnchorError_Success                    = 0,
        EVRSpatialAnchorError_VRSpatialAnchorError_Internal                   = 1,
        EVRSpatialAnchorError_VRSpatialAnchorError_UnknownHandle              = 2,
        EVRSpatialAnchorError_VRSpatialAnchorError_ArrayTooSmall              = 3,
        EVRSpatialAnchorError_VRSpatialAnchorError_InvalidDescriptorChar      = 4,
        EVRSpatialAnchorError_VRSpatialAnchorError_NotYetAvailable            = 5,
        EVRSpatialAnchorError_VRSpatialAnchorError_NotAvailableInThisUniverse = 6,
        EVRSpatialAnchorError_VRSpatialAnchorError_PermanentlyUnavailable     = 7,
        EVRSpatialAnchorError_VRSpatialAnchorError_WrongDriver                = 8,
        EVRSpatialAnchorError_VRSpatialAnchorError_DescriptorTooLong          = 9,
        EVRSpatialAnchorError_VRSpatialAnchorError_Unknown                    = 10,
        EVRSpatialAnchorError_VRSpatialAnchorError_NoRoomCalibration          = 11,
        EVRSpatialAnchorError_VRSpatialAnchorError_InvalidArgument            = 12,
        EVRSpatialAnchorError_VRSpatialAnchorError_UnknownDriver              = 13;

    /**
     * {@code EHiddenAreaMeshType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EHiddenAreaMeshType_k_eHiddenAreaMesh_Standard EHiddenAreaMeshType_k_eHiddenAreaMesh_Standard}</li>
     * <li>{@link #EHiddenAreaMeshType_k_eHiddenAreaMesh_Inverse EHiddenAreaMeshType_k_eHiddenAreaMesh_Inverse}</li>
     * <li>{@link #EHiddenAreaMeshType_k_eHiddenAreaMesh_LineLoop EHiddenAreaMeshType_k_eHiddenAreaMesh_LineLoop}</li>
     * <li>{@link #EHiddenAreaMeshType_k_eHiddenAreaMesh_Max EHiddenAreaMeshType_k_eHiddenAreaMesh_Max}</li>
     * </ul>
     */
    public static final int
        EHiddenAreaMeshType_k_eHiddenAreaMesh_Standard = 0,
        EHiddenAreaMeshType_k_eHiddenAreaMesh_Inverse  = 1,
        EHiddenAreaMeshType_k_eHiddenAreaMesh_LineLoop = 2,
        EHiddenAreaMeshType_k_eHiddenAreaMesh_Max      = 3;

    /**
     * {@code EVRControllerAxisType}: Identifies what kind of axis is on the controller at index {@code n}. Read this type with:
     * 
     * <pre><code>
     * pVRSystem-&gt;Get(nControllerDeviceIndex, Prop_Axis0Type_Int32+n);</code></pre>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRControllerAxisType_k_eControllerAxis_None EVRControllerAxisType_k_eControllerAxis_None}</li>
     * <li>{@link #EVRControllerAxisType_k_eControllerAxis_TrackPad EVRControllerAxisType_k_eControllerAxis_TrackPad}</li>
     * <li>{@link #EVRControllerAxisType_k_eControllerAxis_Joystick EVRControllerAxisType_k_eControllerAxis_Joystick}</li>
     * <li>{@link #EVRControllerAxisType_k_eControllerAxis_Trigger EVRControllerAxisType_k_eControllerAxis_Trigger} - Analog trigger data is in the X axis</li>
     * </ul>
     */
    public static final int
        EVRControllerAxisType_k_eControllerAxis_None     = 0,
        EVRControllerAxisType_k_eControllerAxis_TrackPad = 1,
        EVRControllerAxisType_k_eControllerAxis_Joystick = 2,
        EVRControllerAxisType_k_eControllerAxis_Trigger  = 3;

    /**
     * {@code EVRControllerEventOutputType}: determines how to provide output to the application of various event processing functions.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRControllerEventOutputType_ControllerEventOutput_OSEvents EVRControllerEventOutputType_ControllerEventOutput_OSEvents}</li>
     * <li>{@link #EVRControllerEventOutputType_ControllerEventOutput_VREvents EVRControllerEventOutputType_ControllerEventOutput_VREvents}</li>
     * </ul>
     */
    public static final int
        EVRControllerEventOutputType_ControllerEventOutput_OSEvents = 0,
        EVRControllerEventOutputType_ControllerEventOutput_VREvents = 1;

    /**
     * {@code ECollisionBoundsStyle}: Collision Bounds Style.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_BEGINNER ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_BEGINNER}</li>
     * <li>{@link #ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_INTERMEDIATE ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_INTERMEDIATE}</li>
     * <li>{@link #ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_SQUARES ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_SQUARES}</li>
     * <li>{@link #ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_ADVANCED ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_ADVANCED}</li>
     * <li>{@link #ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_NONE ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_NONE}</li>
     * <li>{@link #ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_COUNT ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_COUNT}</li>
     * </ul>
     */
    public static final int
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_BEGINNER     = 0,
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_INTERMEDIATE = 1,
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_SQUARES      = 2,
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_ADVANCED     = 3,
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_NONE         = 4,
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_COUNT        = 5;

    /**
     * {@code EVROverlayError}: Errors that can occur around VR overlays.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVROverlayError_VROverlayError_None EVROverlayError_VROverlayError_None}</li>
     * <li>{@link #EVROverlayError_VROverlayError_UnknownOverlay EVROverlayError_VROverlayError_UnknownOverlay}</li>
     * <li>{@link #EVROverlayError_VROverlayError_InvalidHandle EVROverlayError_VROverlayError_InvalidHandle}</li>
     * <li>{@link #EVROverlayError_VROverlayError_PermissionDenied EVROverlayError_VROverlayError_PermissionDenied}</li>
     * <li>{@link #EVROverlayError_VROverlayError_OverlayLimitExceeded EVROverlayError_VROverlayError_OverlayLimitExceeded} - No more overlays could be created because the maximum number already exist.</li>
     * <li>{@link #EVROverlayError_VROverlayError_WrongVisibilityType EVROverlayError_VROverlayError_WrongVisibilityType}</li>
     * <li>{@link #EVROverlayError_VROverlayError_KeyTooLong EVROverlayError_VROverlayError_KeyTooLong}</li>
     * <li>{@link #EVROverlayError_VROverlayError_NameTooLong EVROverlayError_VROverlayError_NameTooLong}</li>
     * <li>{@link #EVROverlayError_VROverlayError_KeyInUse EVROverlayError_VROverlayError_KeyInUse}</li>
     * <li>{@link #EVROverlayError_VROverlayError_WrongTransformType EVROverlayError_VROverlayError_WrongTransformType}</li>
     * <li>{@link #EVROverlayError_VROverlayError_InvalidTrackedDevice EVROverlayError_VROverlayError_InvalidTrackedDevice}</li>
     * <li>{@link #EVROverlayError_VROverlayError_InvalidParameter EVROverlayError_VROverlayError_InvalidParameter}</li>
     * <li>{@link #EVROverlayError_VROverlayError_ThumbnailCantBeDestroyed EVROverlayError_VROverlayError_ThumbnailCantBeDestroyed}</li>
     * <li>{@link #EVROverlayError_VROverlayError_ArrayTooSmall EVROverlayError_VROverlayError_ArrayTooSmall}</li>
     * <li>{@link #EVROverlayError_VROverlayError_RequestFailed EVROverlayError_VROverlayError_RequestFailed}</li>
     * <li>{@link #EVROverlayError_VROverlayError_InvalidTexture EVROverlayError_VROverlayError_InvalidTexture}</li>
     * <li>{@link #EVROverlayError_VROverlayError_UnableToLoadFile EVROverlayError_VROverlayError_UnableToLoadFile}</li>
     * <li>{@link #EVROverlayError_VROverlayError_KeyboardAlreadyInUse EVROverlayError_VROverlayError_KeyboardAlreadyInUse}</li>
     * <li>{@link #EVROverlayError_VROverlayError_NoNeighbor EVROverlayError_VROverlayError_NoNeighbor}</li>
     * <li>{@link #EVROverlayError_VROverlayError_TooManyMaskPrimitives EVROverlayError_VROverlayError_TooManyMaskPrimitives}</li>
     * <li>{@link #EVROverlayError_VROverlayError_BadMaskPrimitive EVROverlayError_VROverlayError_BadMaskPrimitive}</li>
     * <li>{@link #EVROverlayError_VROverlayError_TextureAlreadyLocked EVROverlayError_VROverlayError_TextureAlreadyLocked}</li>
     * <li>{@link #EVROverlayError_VROverlayError_TextureLockCapacityReached EVROverlayError_VROverlayError_TextureLockCapacityReached}</li>
     * <li>{@link #EVROverlayError_VROverlayError_TextureNotLocked EVROverlayError_VROverlayError_TextureNotLocked}</li>
     * </ul>
     */
    public static final int
        EVROverlayError_VROverlayError_None                       = 0,
        EVROverlayError_VROverlayError_UnknownOverlay             = 10,
        EVROverlayError_VROverlayError_InvalidHandle              = 11,
        EVROverlayError_VROverlayError_PermissionDenied           = 12,
        EVROverlayError_VROverlayError_OverlayLimitExceeded       = 13,
        EVROverlayError_VROverlayError_WrongVisibilityType        = 14,
        EVROverlayError_VROverlayError_KeyTooLong                 = 15,
        EVROverlayError_VROverlayError_NameTooLong                = 16,
        EVROverlayError_VROverlayError_KeyInUse                   = 17,
        EVROverlayError_VROverlayError_WrongTransformType         = 18,
        EVROverlayError_VROverlayError_InvalidTrackedDevice       = 19,
        EVROverlayError_VROverlayError_InvalidParameter           = 20,
        EVROverlayError_VROverlayError_ThumbnailCantBeDestroyed   = 21,
        EVROverlayError_VROverlayError_ArrayTooSmall              = 22,
        EVROverlayError_VROverlayError_RequestFailed              = 23,
        EVROverlayError_VROverlayError_InvalidTexture             = 24,
        EVROverlayError_VROverlayError_UnableToLoadFile           = 25,
        EVROverlayError_VROverlayError_KeyboardAlreadyInUse       = 26,
        EVROverlayError_VROverlayError_NoNeighbor                 = 27,
        EVROverlayError_VROverlayError_TooManyMaskPrimitives      = 29,
        EVROverlayError_VROverlayError_BadMaskPrimitive           = 30,
        EVROverlayError_VROverlayError_TextureAlreadyLocked       = 31,
        EVROverlayError_VROverlayError_TextureLockCapacityReached = 32,
        EVROverlayError_VROverlayError_TextureNotLocked           = 33;

    /**
     * {@code EVRApplicationType}: enum values to pass in to {@link #VR_InitInternal InitInternal} to identify whether the application will draw a 3D scene.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRApplicationType_VRApplication_Other EVRApplicationType_VRApplication_Other} - Some other kind of application that isn't covered by the other entries.</li>
     * <li>{@link #EVRApplicationType_VRApplication_Scene EVRApplicationType_VRApplication_Scene} - Application will submit 3D frames.</li>
     * <li>{@link #EVRApplicationType_VRApplication_Overlay EVRApplicationType_VRApplication_Overlay} - Application only interacts with overlays.</li>
     * <li>{@link #EVRApplicationType_VRApplication_Background EVRApplicationType_VRApplication_Background} - Application should not start SteamVR if it's not already running, and should not keep it running if everything else quits.</li>
     * <li>{@link #EVRApplicationType_VRApplication_Utility EVRApplicationType_VRApplication_Utility} - 
     * Init should not try to load any drivers. The application needs access to utility interfaces (like {@link VRSettings} and {@link VRApplications}) but not
     * hardware.
     * </li>
     * <li>{@link #EVRApplicationType_VRApplication_VRMonitor EVRApplicationType_VRApplication_VRMonitor} - Reserved for vrmonitor.</li>
     * <li>{@link #EVRApplicationType_VRApplication_SteamWatchdog EVRApplicationType_VRApplication_SteamWatchdog} - Reserved for Steam.</li>
     * <li>{@link #EVRApplicationType_VRApplication_Bootstrapper EVRApplicationType_VRApplication_Bootstrapper} - Reserved for vrstartup.</li>
     * <li>{@link #EVRApplicationType_VRApplication_WebHelper EVRApplicationType_VRApplication_WebHelper} - Reserved for vrwebhelper.</li>
     * <li>{@link #EVRApplicationType_VRApplication_Max EVRApplicationType_VRApplication_Max}</li>
     * </ul>
     */
    public static final int
        EVRApplicationType_VRApplication_Other         = 0,
        EVRApplicationType_VRApplication_Scene         = 1,
        EVRApplicationType_VRApplication_Overlay       = 2,
        EVRApplicationType_VRApplication_Background    = 3,
        EVRApplicationType_VRApplication_Utility       = 4,
        EVRApplicationType_VRApplication_VRMonitor     = 5,
        EVRApplicationType_VRApplication_SteamWatchdog = 6,
        EVRApplicationType_VRApplication_Bootstrapper  = 7,
        EVRApplicationType_VRApplication_WebHelper     = 8,
        EVRApplicationType_VRApplication_Max           = 9;

    /**
     * {@code EVRFirmwareError}: error codes for firmware.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRFirmwareError_VRFirmwareError_None EVRFirmwareError_VRFirmwareError_None}</li>
     * <li>{@link #EVRFirmwareError_VRFirmwareError_Success EVRFirmwareError_VRFirmwareError_Success}</li>
     * <li>{@link #EVRFirmwareError_VRFirmwareError_Fail EVRFirmwareError_VRFirmwareError_Fail}</li>
     * </ul>
     */
    public static final int
        EVRFirmwareError_VRFirmwareError_None    = 0,
        EVRFirmwareError_VRFirmwareError_Success = 1,
        EVRFirmwareError_VRFirmwareError_Fail    = 2;

    /**
     * {@code EVRNotificationError}: error codes for notifications.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRNotificationError_VRNotificationError_OK EVRNotificationError_VRNotificationError_OK}</li>
     * <li>{@link #EVRNotificationError_VRNotificationError_InvalidNotificationId EVRNotificationError_VRNotificationError_InvalidNotificationId}</li>
     * <li>{@link #EVRNotificationError_VRNotificationError_NotificationQueueFull EVRNotificationError_VRNotificationError_NotificationQueueFull}</li>
     * <li>{@link #EVRNotificationError_VRNotificationError_InvalidOverlayHandle EVRNotificationError_VRNotificationError_InvalidOverlayHandle}</li>
     * <li>{@link #EVRNotificationError_VRNotificationError_SystemWithUserValueAlreadyExists EVRNotificationError_VRNotificationError_SystemWithUserValueAlreadyExists}</li>
     * </ul>
     */
    public static final int
        EVRNotificationError_VRNotificationError_OK                               = 0,
        EVRNotificationError_VRNotificationError_InvalidNotificationId            = 100,
        EVRNotificationError_VRNotificationError_NotificationQueueFull            = 101,
        EVRNotificationError_VRNotificationError_InvalidOverlayHandle             = 102,
        EVRNotificationError_VRNotificationError_SystemWithUserValueAlreadyExists = 103;

    /**
     * {@code EVRSkeletalMotionRange}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRSkeletalMotionRange_VRSkeletalMotionRange_WithController EVRSkeletalMotionRange_VRSkeletalMotionRange_WithController} - 
     * The range of motion of the skeleton takes into account any physical limits imposed by the controller itself. This will tend to be the most accurate
     * pose compared to the user's actual hand pose, but might not allow a closed fist for example.
     * </li>
     * <li>{@link #EVRSkeletalMotionRange_VRSkeletalMotionRange_WithoutController EVRSkeletalMotionRange_VRSkeletalMotionRange_WithoutController} - 
     * Retarget the range of motion provided by the input device to make the hand appear to move as if it was not holding a controller. eg: map "hand
     * grasping controller" to "closed fist".
     * </li>
     * </ul>
     */
    public static final int
        EVRSkeletalMotionRange_VRSkeletalMotionRange_WithController    = 0,
        EVRSkeletalMotionRange_VRSkeletalMotionRange_WithoutController = 1;

    /**
     * {@code EVRSkeletalTrackingLevel}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRSkeletalTrackingLevel_VRSkeletalTracking_Estimated EVRSkeletalTrackingLevel_VRSkeletalTracking_Estimated} - 
     * Body part location can't be directly determined by the device.
     * 
     * <p>Any skeletal pose provided by the device is estimated by assuming the position required to active buttons, triggers, joysticks, or other input
     * sensors. E.g. Vive Controller, Gamepad.</p>
     * </li>
     * <li>{@link #EVRSkeletalTrackingLevel_VRSkeletalTracking_Partial EVRSkeletalTrackingLevel_VRSkeletalTracking_Partial} - 
     * Body part location can be measured directly but with fewer degrees of freedom than the actual body part.
     * 
     * <p>Certain body part positions may be unmeasured by the device and estimated from other input data. E.g. Knuckles, gloves that only measure finger
     * curl.</p>
     * </li>
     * <li>{@link #EVRSkeletalTrackingLevel_VRSkeletalTracking_Full EVRSkeletalTrackingLevel_VRSkeletalTracking_Full} - 
     * Body part location can be measured directly throughout the entire range of motion of the body part.
     * 
     * <p>E.g. Mocap suit for the full body, gloves that measure rotation of each finger segment.</p>
     * </li>
     * <li>{@link #EVRSkeletalTrackingLevel_VRSkeletalTrackingLevel_Count EVRSkeletalTrackingLevel_VRSkeletalTrackingLevel_Count}</li>
     * <li>{@link #EVRSkeletalTrackingLevel_VRSkeletalTrackingLevel_Max EVRSkeletalTrackingLevel_VRSkeletalTrackingLevel_Max}</li>
     * </ul>
     */
    public static final int
        EVRSkeletalTrackingLevel_VRSkeletalTracking_Estimated  = 0,
        EVRSkeletalTrackingLevel_VRSkeletalTracking_Partial    = 1,
        EVRSkeletalTrackingLevel_VRSkeletalTracking_Full       = 2,
        EVRSkeletalTrackingLevel_VRSkeletalTrackingLevel_Count = 3,
        EVRSkeletalTrackingLevel_VRSkeletalTrackingLevel_Max   = 2;

    /**
     * {@code EVRInitError}: error codes returned by {@link #VR_InitInternal InitInternal}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRInitError_VRInitError_None EVRInitError_VRInitError_None}</li>
     * <li>{@link #EVRInitError_VRInitError_Unknown EVRInitError_VRInitError_Unknown}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_InstallationNotFound EVRInitError_VRInitError_Init_InstallationNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_InstallationCorrupt EVRInitError_VRInitError_Init_InstallationCorrupt}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_VRClientDLLNotFound EVRInitError_VRInitError_Init_VRClientDLLNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_FileNotFound EVRInitError_VRInitError_Init_FileNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_FactoryNotFound EVRInitError_VRInitError_Init_FactoryNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_InterfaceNotFound EVRInitError_VRInitError_Init_InterfaceNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_InvalidInterface EVRInitError_VRInitError_Init_InvalidInterface}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_UserConfigDirectoryInvalid EVRInitError_VRInitError_Init_UserConfigDirectoryInvalid}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_HmdNotFound EVRInitError_VRInitError_Init_HmdNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_NotInitialized EVRInitError_VRInitError_Init_NotInitialized}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_PathRegistryNotFound EVRInitError_VRInitError_Init_PathRegistryNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_NoConfigPath EVRInitError_VRInitError_Init_NoConfigPath}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_NoLogPath EVRInitError_VRInitError_Init_NoLogPath}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_PathRegistryNotWritable EVRInitError_VRInitError_Init_PathRegistryNotWritable}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_AppInfoInitFailed EVRInitError_VRInitError_Init_AppInfoInitFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_Retry EVRInitError_VRInitError_Init_Retry} - Used internally to cause retries to vrserver.</li>
     * <li>{@link #EVRInitError_VRInitError_Init_InitCanceledByUser EVRInitError_VRInitError_Init_InitCanceledByUser} - The calling application should silently exit. The user canceled app startup.</li>
     * <li>{@link #EVRInitError_VRInitError_Init_AnotherAppLaunching EVRInitError_VRInitError_Init_AnotherAppLaunching}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_SettingsInitFailed EVRInitError_VRInitError_Init_SettingsInitFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_ShuttingDown EVRInitError_VRInitError_Init_ShuttingDown}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_TooManyObjects EVRInitError_VRInitError_Init_TooManyObjects}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_NoServerForBackgroundApp EVRInitError_VRInitError_Init_NoServerForBackgroundApp}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_NotSupportedWithCompositor EVRInitError_VRInitError_Init_NotSupportedWithCompositor}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_NotAvailableToUtilityApps EVRInitError_VRInitError_Init_NotAvailableToUtilityApps}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_Internal EVRInitError_VRInitError_Init_Internal}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_HmdDriverIdIsNone EVRInitError_VRInitError_Init_HmdDriverIdIsNone}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_HmdNotFoundPresenceFailed EVRInitError_VRInitError_Init_HmdNotFoundPresenceFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_VRMonitorNotFound EVRInitError_VRInitError_Init_VRMonitorNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_VRMonitorStartupFailed EVRInitError_VRInitError_Init_VRMonitorStartupFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_LowPowerWatchdogNotSupported EVRInitError_VRInitError_Init_LowPowerWatchdogNotSupported}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_InvalidApplicationType EVRInitError_VRInitError_Init_InvalidApplicationType}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_NotAvailableToWatchdogApps EVRInitError_VRInitError_Init_NotAvailableToWatchdogApps}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_WatchdogDisabledInSettings EVRInitError_VRInitError_Init_WatchdogDisabledInSettings}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_VRDashboardNotFound EVRInitError_VRInitError_Init_VRDashboardNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_VRDashboardStartupFailed EVRInitError_VRInitError_Init_VRDashboardStartupFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_VRHomeNotFound EVRInitError_VRInitError_Init_VRHomeNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_VRHomeStartupFailed EVRInitError_VRInitError_Init_VRHomeStartupFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_RebootingBusy EVRInitError_VRInitError_Init_RebootingBusy}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_FirmwareUpdateBusy EVRInitError_VRInitError_Init_FirmwareUpdateBusy}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_FirmwareRecoveryBusy EVRInitError_VRInitError_Init_FirmwareRecoveryBusy}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_USBServiceBusy EVRInitError_VRInitError_Init_USBServiceBusy}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_VRWebHelperStartupFailed EVRInitError_VRInitError_Init_VRWebHelperStartupFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_TrackerManagerInitFailed EVRInitError_VRInitError_Init_TrackerManagerInitFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Init_AlreadyRunning EVRInitError_VRInitError_Init_AlreadyRunning}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_Failed EVRInitError_VRInitError_Driver_Failed}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_Unknown EVRInitError_VRInitError_Driver_Unknown}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_HmdUnknown EVRInitError_VRInitError_Driver_HmdUnknown}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_NotLoaded EVRInitError_VRInitError_Driver_NotLoaded}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_RuntimeOutOfDate EVRInitError_VRInitError_Driver_RuntimeOutOfDate}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_HmdInUse EVRInitError_VRInitError_Driver_HmdInUse}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_NotCalibrated EVRInitError_VRInitError_Driver_NotCalibrated}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_CalibrationInvalid EVRInitError_VRInitError_Driver_CalibrationInvalid}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_HmdDisplayNotFound EVRInitError_VRInitError_Driver_HmdDisplayNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_TrackedDeviceInterfaceUnknown EVRInitError_VRInitError_Driver_TrackedDeviceInterfaceUnknown}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_HmdDriverIdOutOfBounds EVRInitError_VRInitError_Driver_HmdDriverIdOutOfBounds}</li>
     * <li>{@link #EVRInitError_VRInitError_Driver_HmdDisplayMirrored EVRInitError_VRInitError_Driver_HmdDisplayMirrored}</li>
     * <li>{@link #EVRInitError_VRInitError_IPC_ServerInitFailed EVRInitError_VRInitError_IPC_ServerInitFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_IPC_ConnectFailed EVRInitError_VRInitError_IPC_ConnectFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_IPC_SharedStateInitFailed EVRInitError_VRInitError_IPC_SharedStateInitFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_IPC_CompositorInitFailed EVRInitError_VRInitError_IPC_CompositorInitFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_IPC_MutexInitFailed EVRInitError_VRInitError_IPC_MutexInitFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_IPC_Failed EVRInitError_VRInitError_IPC_Failed}</li>
     * <li>{@link #EVRInitError_VRInitError_IPC_CompositorConnectFailed EVRInitError_VRInitError_IPC_CompositorConnectFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_IPC_CompositorInvalidConnectResponse EVRInitError_VRInitError_IPC_CompositorInvalidConnectResponse}</li>
     * <li>{@link #EVRInitError_VRInitError_IPC_ConnectFailedAfterMultipleAttempts EVRInitError_VRInitError_IPC_ConnectFailedAfterMultipleAttempts}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_Failed EVRInitError_VRInitError_Compositor_Failed}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_D3D11HardwareRequired EVRInitError_VRInitError_Compositor_D3D11HardwareRequired}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FirmwareRequiresUpdate EVRInitError_VRInitError_Compositor_FirmwareRequiresUpdate}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_OverlayInitFailed EVRInitError_VRInitError_Compositor_OverlayInitFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_ScreenshotsInitFailed EVRInitError_VRInitError_Compositor_ScreenshotsInitFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_UnableToCreateDevice EVRInitError_VRInitError_Compositor_UnableToCreateDevice}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_SharedStateIsNull EVRInitError_VRInitError_Compositor_SharedStateIsNull}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_NotificationManagerIsNull EVRInitError_VRInitError_Compositor_NotificationManagerIsNull}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_ResourceManagerClientIsNull EVRInitError_VRInitError_Compositor_ResourceManagerClientIsNull}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_MessageOverlaySharedStateInitFailure EVRInitError_VRInitError_Compositor_MessageOverlaySharedStateInitFailure}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_PropertiesInterfaceIsNull EVRInitError_VRInitError_Compositor_PropertiesInterfaceIsNull}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateFullscreenWindowFailed EVRInitError_VRInitError_Compositor_CreateFullscreenWindowFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_SettingsInterfaceIsNull EVRInitError_VRInitError_Compositor_SettingsInterfaceIsNull}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedToShowWindow EVRInitError_VRInitError_Compositor_FailedToShowWindow}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_DistortInterfaceIsNull EVRInitError_VRInitError_Compositor_DistortInterfaceIsNull}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_DisplayFrequencyFailure EVRInitError_VRInitError_Compositor_DisplayFrequencyFailure}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_RendererInitializationFailed EVRInitError_VRInitError_Compositor_RendererInitializationFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_DXGIFactoryInterfaceIsNull EVRInitError_VRInitError_Compositor_DXGIFactoryInterfaceIsNull}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_DXGIFactoryCreateFailed EVRInitError_VRInitError_Compositor_DXGIFactoryCreateFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_DXGIFactoryQueryFailed EVRInitError_VRInitError_Compositor_DXGIFactoryQueryFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_InvalidAdapterDesktop EVRInitError_VRInitError_Compositor_InvalidAdapterDesktop}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_InvalidHmdAttachment EVRInitError_VRInitError_Compositor_InvalidHmdAttachment}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_InvalidOutputDesktop EVRInitError_VRInitError_Compositor_InvalidOutputDesktop}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_InvalidDeviceProvided EVRInitError_VRInitError_Compositor_InvalidDeviceProvided}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_D3D11RendererInitializationFailed EVRInitError_VRInitError_Compositor_D3D11RendererInitializationFailed}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedToFindDisplayMode EVRInitError_VRInitError_Compositor_FailedToFindDisplayMode}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedToCreateSwapChain EVRInitError_VRInitError_Compositor_FailedToCreateSwapChain}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedToGetBackBuffer EVRInitError_VRInitError_Compositor_FailedToGetBackBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedToCreateRenderTarget EVRInitError_VRInitError_Compositor_FailedToCreateRenderTarget}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedToCreateDXGI2SwapChain EVRInitError_VRInitError_Compositor_FailedToCreateDXGI2SwapChain}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedtoGetDXGI2BackBuffer EVRInitError_VRInitError_Compositor_FailedtoGetDXGI2BackBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedToCreateDXGI2RenderTarget EVRInitError_VRInitError_Compositor_FailedToCreateDXGI2RenderTarget}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedToGetDXGIDeviceInterface EVRInitError_VRInitError_Compositor_FailedToGetDXGIDeviceInterface}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_SelectDisplayMode EVRInitError_VRInitError_Compositor_SelectDisplayMode}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedToCreateNvAPIRenderTargets EVRInitError_VRInitError_Compositor_FailedToCreateNvAPIRenderTargets}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_NvAPISetDisplayMode EVRInitError_VRInitError_Compositor_NvAPISetDisplayMode}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_FailedToCreateDirectModeDisplay EVRInitError_VRInitError_Compositor_FailedToCreateDirectModeDisplay}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_InvalidHmdPropertyContainer EVRInitError_VRInitError_Compositor_InvalidHmdPropertyContainer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_UpdateDisplayFrequency EVRInitError_VRInitError_Compositor_UpdateDisplayFrequency}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateRasterizerState EVRInitError_VRInitError_Compositor_CreateRasterizerState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateWireframeRasterizerState EVRInitError_VRInitError_Compositor_CreateWireframeRasterizerState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateSamplerState EVRInitError_VRInitError_Compositor_CreateSamplerState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateClampToBorderSamplerState EVRInitError_VRInitError_Compositor_CreateClampToBorderSamplerState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateAnisoSamplerState EVRInitError_VRInitError_Compositor_CreateAnisoSamplerState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateOverlaySamplerState EVRInitError_VRInitError_Compositor_CreateOverlaySamplerState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreatePanoramaSamplerState EVRInitError_VRInitError_Compositor_CreatePanoramaSamplerState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateFontSamplerState EVRInitError_VRInitError_Compositor_CreateFontSamplerState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateNoBlendState EVRInitError_VRInitError_Compositor_CreateNoBlendState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateBlendState EVRInitError_VRInitError_Compositor_CreateBlendState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateAlphaBlendState EVRInitError_VRInitError_Compositor_CreateAlphaBlendState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateBlendStateMaskR EVRInitError_VRInitError_Compositor_CreateBlendStateMaskR}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateBlendStateMaskG EVRInitError_VRInitError_Compositor_CreateBlendStateMaskG}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateBlendStateMaskB EVRInitError_VRInitError_Compositor_CreateBlendStateMaskB}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateDepthStencilState EVRInitError_VRInitError_Compositor_CreateDepthStencilState}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateDepthStencilStateNoWrite EVRInitError_VRInitError_Compositor_CreateDepthStencilStateNoWrite}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateDepthStencilStateNoDepth EVRInitError_VRInitError_Compositor_CreateDepthStencilStateNoDepth}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateFlushTexture EVRInitError_VRInitError_Compositor_CreateFlushTexture}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateDistortionSurfaces EVRInitError_VRInitError_Compositor_CreateDistortionSurfaces}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateConstantBuffer EVRInitError_VRInitError_Compositor_CreateConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateHmdPoseConstantBuffer EVRInitError_VRInitError_Compositor_CreateHmdPoseConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateHmdPoseStagingConstantBuffer EVRInitError_VRInitError_Compositor_CreateHmdPoseStagingConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateSharedFrameInfoConstantBuffer EVRInitError_VRInitError_Compositor_CreateSharedFrameInfoConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateOverlayConstantBuffer EVRInitError_VRInitError_Compositor_CreateOverlayConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateSceneTextureIndexConstantBuffer EVRInitError_VRInitError_Compositor_CreateSceneTextureIndexConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateReadableSceneTextureIndexConstantBuffer EVRInitError_VRInitError_Compositor_CreateReadableSceneTextureIndexConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateLayerGraphicsTextureIndexConstantBuffer EVRInitError_VRInitError_Compositor_CreateLayerGraphicsTextureIndexConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateLayerComputeTextureIndexConstantBuffer EVRInitError_VRInitError_Compositor_CreateLayerComputeTextureIndexConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateLayerComputeSceneTextureIndexConstantBuffer EVRInitError_VRInitError_Compositor_CreateLayerComputeSceneTextureIndexConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateComputeHmdPoseConstantBuffer EVRInitError_VRInitError_Compositor_CreateComputeHmdPoseConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateGeomConstantBuffer EVRInitError_VRInitError_Compositor_CreateGeomConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreatePanelMaskConstantBuffer EVRInitError_VRInitError_Compositor_CreatePanelMaskConstantBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreatePixelSimUBO EVRInitError_VRInitError_Compositor_CreatePixelSimUBO}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateMSAARenderTextures EVRInitError_VRInitError_Compositor_CreateMSAARenderTextures}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateResolveRenderTextures EVRInitError_VRInitError_Compositor_CreateResolveRenderTextures}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateComputeResolveRenderTextures EVRInitError_VRInitError_Compositor_CreateComputeResolveRenderTextures}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateDriverDirectModeResolveTextures EVRInitError_VRInitError_Compositor_CreateDriverDirectModeResolveTextures}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_OpenDriverDirectModeResolveTextures EVRInitError_VRInitError_Compositor_OpenDriverDirectModeResolveTextures}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateFallbackSyncTexture EVRInitError_VRInitError_Compositor_CreateFallbackSyncTexture}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_ShareFallbackSyncTexture EVRInitError_VRInitError_Compositor_ShareFallbackSyncTexture}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateOverlayIndexBuffer EVRInitError_VRInitError_Compositor_CreateOverlayIndexBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateOverlayVertextBuffer EVRInitError_VRInitError_Compositor_CreateOverlayVertextBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateTextVertexBuffer EVRInitError_VRInitError_Compositor_CreateTextVertexBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateTextIndexBuffer EVRInitError_VRInitError_Compositor_CreateTextIndexBuffer}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateMirrorTextures EVRInitError_VRInitError_Compositor_CreateMirrorTextures}</li>
     * <li>{@link #EVRInitError_VRInitError_Compositor_CreateLastFrameRenderTexture EVRInitError_VRInitError_Compositor_CreateLastFrameRenderTexture}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_UnableToConnectToOculusRuntime EVRInitError_VRInitError_VendorSpecific_UnableToConnectToOculusRuntime}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_WindowsNotInDevMode EVRInitError_VRInitError_VendorSpecific_WindowsNotInDevMode}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_CantOpenDevice EVRInitError_VRInitError_VendorSpecific_HmdFound_CantOpenDevice}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToRequestConfigStart EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToRequestConfigStart}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_NoStoredConfig EVRInitError_VRInitError_VendorSpecific_HmdFound_NoStoredConfig}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigTooBig EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigTooBig}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigTooSmall EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigTooSmall}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToInitZLib EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToInitZLib}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_CantReadFirmwareVersion EVRInitError_VRInitError_VendorSpecific_HmdFound_CantReadFirmwareVersion}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToSendUserDataStart EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToSendUserDataStart}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToGetUserDataStart EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToGetUserDataStart}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToGetUserDataNext EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToGetUserDataNext}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_UserDataAddressRange EVRInitError_VRInitError_VendorSpecific_HmdFound_UserDataAddressRange}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_UserDataError EVRInitError_VRInitError_VendorSpecific_HmdFound_UserDataError}</li>
     * <li>{@link #EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigFailedSanityCheck EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigFailedSanityCheck}</li>
     * <li>{@link #EVRInitError_VRInitError_Steam_SteamInstallationNotFound EVRInitError_VRInitError_Steam_SteamInstallationNotFound}</li>
     * <li>{@link #EVRInitError_VRInitError_LastError EVRInitError_VRInitError_LastError}</li>
     * </ul>
     */
    public static final int
        EVRInitError_VRInitError_None                                                         = 0,
        EVRInitError_VRInitError_Unknown                                                      = 1,
        EVRInitError_VRInitError_Init_InstallationNotFound                                    = 100,
        EVRInitError_VRInitError_Init_InstallationCorrupt                                     = 101,
        EVRInitError_VRInitError_Init_VRClientDLLNotFound                                     = 102,
        EVRInitError_VRInitError_Init_FileNotFound                                            = 103,
        EVRInitError_VRInitError_Init_FactoryNotFound                                         = 104,
        EVRInitError_VRInitError_Init_InterfaceNotFound                                       = 105,
        EVRInitError_VRInitError_Init_InvalidInterface                                        = 106,
        EVRInitError_VRInitError_Init_UserConfigDirectoryInvalid                              = 107,
        EVRInitError_VRInitError_Init_HmdNotFound                                             = 108,
        EVRInitError_VRInitError_Init_NotInitialized                                          = 109,
        EVRInitError_VRInitError_Init_PathRegistryNotFound                                    = 110,
        EVRInitError_VRInitError_Init_NoConfigPath                                            = 111,
        EVRInitError_VRInitError_Init_NoLogPath                                               = 112,
        EVRInitError_VRInitError_Init_PathRegistryNotWritable                                 = 113,
        EVRInitError_VRInitError_Init_AppInfoInitFailed                                       = 114,
        EVRInitError_VRInitError_Init_Retry                                                   = 115,
        EVRInitError_VRInitError_Init_InitCanceledByUser                                      = 116,
        EVRInitError_VRInitError_Init_AnotherAppLaunching                                     = 117,
        EVRInitError_VRInitError_Init_SettingsInitFailed                                      = 118,
        EVRInitError_VRInitError_Init_ShuttingDown                                            = 119,
        EVRInitError_VRInitError_Init_TooManyObjects                                          = 120,
        EVRInitError_VRInitError_Init_NoServerForBackgroundApp                                = 121,
        EVRInitError_VRInitError_Init_NotSupportedWithCompositor                              = 122,
        EVRInitError_VRInitError_Init_NotAvailableToUtilityApps                               = 123,
        EVRInitError_VRInitError_Init_Internal                                                = 124,
        EVRInitError_VRInitError_Init_HmdDriverIdIsNone                                       = 125,
        EVRInitError_VRInitError_Init_HmdNotFoundPresenceFailed                               = 126,
        EVRInitError_VRInitError_Init_VRMonitorNotFound                                       = 127,
        EVRInitError_VRInitError_Init_VRMonitorStartupFailed                                  = 128,
        EVRInitError_VRInitError_Init_LowPowerWatchdogNotSupported                            = 129,
        EVRInitError_VRInitError_Init_InvalidApplicationType                                  = 130,
        EVRInitError_VRInitError_Init_NotAvailableToWatchdogApps                              = 131,
        EVRInitError_VRInitError_Init_WatchdogDisabledInSettings                              = 132,
        EVRInitError_VRInitError_Init_VRDashboardNotFound                                     = 133,
        EVRInitError_VRInitError_Init_VRDashboardStartupFailed                                = 134,
        EVRInitError_VRInitError_Init_VRHomeNotFound                                          = 135,
        EVRInitError_VRInitError_Init_VRHomeStartupFailed                                     = 136,
        EVRInitError_VRInitError_Init_RebootingBusy                                           = 137,
        EVRInitError_VRInitError_Init_FirmwareUpdateBusy                                      = 138,
        EVRInitError_VRInitError_Init_FirmwareRecoveryBusy                                    = 139,
        EVRInitError_VRInitError_Init_USBServiceBusy                                          = 140,
        EVRInitError_VRInitError_Init_VRWebHelperStartupFailed                                = 141,
        EVRInitError_VRInitError_Init_TrackerManagerInitFailed                                = 142,
        EVRInitError_VRInitError_Init_AlreadyRunning                                          = 143,
        EVRInitError_VRInitError_Driver_Failed                                                = 200,
        EVRInitError_VRInitError_Driver_Unknown                                               = 201,
        EVRInitError_VRInitError_Driver_HmdUnknown                                            = 202,
        EVRInitError_VRInitError_Driver_NotLoaded                                             = 203,
        EVRInitError_VRInitError_Driver_RuntimeOutOfDate                                      = 204,
        EVRInitError_VRInitError_Driver_HmdInUse                                              = 205,
        EVRInitError_VRInitError_Driver_NotCalibrated                                         = 206,
        EVRInitError_VRInitError_Driver_CalibrationInvalid                                    = 207,
        EVRInitError_VRInitError_Driver_HmdDisplayNotFound                                    = 208,
        EVRInitError_VRInitError_Driver_TrackedDeviceInterfaceUnknown                         = 209,
        EVRInitError_VRInitError_Driver_HmdDriverIdOutOfBounds                                = 211,
        EVRInitError_VRInitError_Driver_HmdDisplayMirrored                                    = 212,
        EVRInitError_VRInitError_IPC_ServerInitFailed                                         = 300,
        EVRInitError_VRInitError_IPC_ConnectFailed                                            = 301,
        EVRInitError_VRInitError_IPC_SharedStateInitFailed                                    = 302,
        EVRInitError_VRInitError_IPC_CompositorInitFailed                                     = 303,
        EVRInitError_VRInitError_IPC_MutexInitFailed                                          = 304,
        EVRInitError_VRInitError_IPC_Failed                                                   = 305,
        EVRInitError_VRInitError_IPC_CompositorConnectFailed                                  = 306,
        EVRInitError_VRInitError_IPC_CompositorInvalidConnectResponse                         = 307,
        EVRInitError_VRInitError_IPC_ConnectFailedAfterMultipleAttempts                       = 308,
        EVRInitError_VRInitError_Compositor_Failed                                            = 400,
        EVRInitError_VRInitError_Compositor_D3D11HardwareRequired                             = 401,
        EVRInitError_VRInitError_Compositor_FirmwareRequiresUpdate                            = 402,
        EVRInitError_VRInitError_Compositor_OverlayInitFailed                                 = 403,
        EVRInitError_VRInitError_Compositor_ScreenshotsInitFailed                             = 404,
        EVRInitError_VRInitError_Compositor_UnableToCreateDevice                              = 405,
        EVRInitError_VRInitError_Compositor_SharedStateIsNull                                 = 406,
        EVRInitError_VRInitError_Compositor_NotificationManagerIsNull                         = 407,
        EVRInitError_VRInitError_Compositor_ResourceManagerClientIsNull                       = 408,
        EVRInitError_VRInitError_Compositor_MessageOverlaySharedStateInitFailure              = 409,
        EVRInitError_VRInitError_Compositor_PropertiesInterfaceIsNull                         = 410,
        EVRInitError_VRInitError_Compositor_CreateFullscreenWindowFailed                      = 411,
        EVRInitError_VRInitError_Compositor_SettingsInterfaceIsNull                           = 412,
        EVRInitError_VRInitError_Compositor_FailedToShowWindow                                = 413,
        EVRInitError_VRInitError_Compositor_DistortInterfaceIsNull                            = 414,
        EVRInitError_VRInitError_Compositor_DisplayFrequencyFailure                           = 415,
        EVRInitError_VRInitError_Compositor_RendererInitializationFailed                      = 416,
        EVRInitError_VRInitError_Compositor_DXGIFactoryInterfaceIsNull                        = 417,
        EVRInitError_VRInitError_Compositor_DXGIFactoryCreateFailed                           = 418,
        EVRInitError_VRInitError_Compositor_DXGIFactoryQueryFailed                            = 419,
        EVRInitError_VRInitError_Compositor_InvalidAdapterDesktop                             = 420,
        EVRInitError_VRInitError_Compositor_InvalidHmdAttachment                              = 421,
        EVRInitError_VRInitError_Compositor_InvalidOutputDesktop                              = 422,
        EVRInitError_VRInitError_Compositor_InvalidDeviceProvided                             = 423,
        EVRInitError_VRInitError_Compositor_D3D11RendererInitializationFailed                 = 424,
        EVRInitError_VRInitError_Compositor_FailedToFindDisplayMode                           = 425,
        EVRInitError_VRInitError_Compositor_FailedToCreateSwapChain                           = 426,
        EVRInitError_VRInitError_Compositor_FailedToGetBackBuffer                             = 427,
        EVRInitError_VRInitError_Compositor_FailedToCreateRenderTarget                        = 428,
        EVRInitError_VRInitError_Compositor_FailedToCreateDXGI2SwapChain                      = 429,
        EVRInitError_VRInitError_Compositor_FailedtoGetDXGI2BackBuffer                        = 430,
        EVRInitError_VRInitError_Compositor_FailedToCreateDXGI2RenderTarget                   = 431,
        EVRInitError_VRInitError_Compositor_FailedToGetDXGIDeviceInterface                    = 432,
        EVRInitError_VRInitError_Compositor_SelectDisplayMode                                 = 433,
        EVRInitError_VRInitError_Compositor_FailedToCreateNvAPIRenderTargets                  = 434,
        EVRInitError_VRInitError_Compositor_NvAPISetDisplayMode                               = 435,
        EVRInitError_VRInitError_Compositor_FailedToCreateDirectModeDisplay                   = 436,
        EVRInitError_VRInitError_Compositor_InvalidHmdPropertyContainer                       = 437,
        EVRInitError_VRInitError_Compositor_UpdateDisplayFrequency                            = 438,
        EVRInitError_VRInitError_Compositor_CreateRasterizerState                             = 439,
        EVRInitError_VRInitError_Compositor_CreateWireframeRasterizerState                    = 440,
        EVRInitError_VRInitError_Compositor_CreateSamplerState                                = 441,
        EVRInitError_VRInitError_Compositor_CreateClampToBorderSamplerState                   = 442,
        EVRInitError_VRInitError_Compositor_CreateAnisoSamplerState                           = 443,
        EVRInitError_VRInitError_Compositor_CreateOverlaySamplerState                         = 444,
        EVRInitError_VRInitError_Compositor_CreatePanoramaSamplerState                        = 445,
        EVRInitError_VRInitError_Compositor_CreateFontSamplerState                            = 446,
        EVRInitError_VRInitError_Compositor_CreateNoBlendState                                = 447,
        EVRInitError_VRInitError_Compositor_CreateBlendState                                  = 448,
        EVRInitError_VRInitError_Compositor_CreateAlphaBlendState                             = 449,
        EVRInitError_VRInitError_Compositor_CreateBlendStateMaskR                             = 450,
        EVRInitError_VRInitError_Compositor_CreateBlendStateMaskG                             = 451,
        EVRInitError_VRInitError_Compositor_CreateBlendStateMaskB                             = 452,
        EVRInitError_VRInitError_Compositor_CreateDepthStencilState                           = 453,
        EVRInitError_VRInitError_Compositor_CreateDepthStencilStateNoWrite                    = 454,
        EVRInitError_VRInitError_Compositor_CreateDepthStencilStateNoDepth                    = 455,
        EVRInitError_VRInitError_Compositor_CreateFlushTexture                                = 456,
        EVRInitError_VRInitError_Compositor_CreateDistortionSurfaces                          = 457,
        EVRInitError_VRInitError_Compositor_CreateConstantBuffer                              = 458,
        EVRInitError_VRInitError_Compositor_CreateHmdPoseConstantBuffer                       = 459,
        EVRInitError_VRInitError_Compositor_CreateHmdPoseStagingConstantBuffer                = 460,
        EVRInitError_VRInitError_Compositor_CreateSharedFrameInfoConstantBuffer               = 461,
        EVRInitError_VRInitError_Compositor_CreateOverlayConstantBuffer                       = 462,
        EVRInitError_VRInitError_Compositor_CreateSceneTextureIndexConstantBuffer             = 463,
        EVRInitError_VRInitError_Compositor_CreateReadableSceneTextureIndexConstantBuffer     = 464,
        EVRInitError_VRInitError_Compositor_CreateLayerGraphicsTextureIndexConstantBuffer     = 465,
        EVRInitError_VRInitError_Compositor_CreateLayerComputeTextureIndexConstantBuffer      = 466,
        EVRInitError_VRInitError_Compositor_CreateLayerComputeSceneTextureIndexConstantBuffer = 467,
        EVRInitError_VRInitError_Compositor_CreateComputeHmdPoseConstantBuffer                = 468,
        EVRInitError_VRInitError_Compositor_CreateGeomConstantBuffer                          = 469,
        EVRInitError_VRInitError_Compositor_CreatePanelMaskConstantBuffer                     = 470,
        EVRInitError_VRInitError_Compositor_CreatePixelSimUBO                                 = 471,
        EVRInitError_VRInitError_Compositor_CreateMSAARenderTextures                          = 472,
        EVRInitError_VRInitError_Compositor_CreateResolveRenderTextures                       = 473,
        EVRInitError_VRInitError_Compositor_CreateComputeResolveRenderTextures                = 474,
        EVRInitError_VRInitError_Compositor_CreateDriverDirectModeResolveTextures             = 475,
        EVRInitError_VRInitError_Compositor_OpenDriverDirectModeResolveTextures               = 476,
        EVRInitError_VRInitError_Compositor_CreateFallbackSyncTexture                         = 477,
        EVRInitError_VRInitError_Compositor_ShareFallbackSyncTexture                          = 478,
        EVRInitError_VRInitError_Compositor_CreateOverlayIndexBuffer                          = 479,
        EVRInitError_VRInitError_Compositor_CreateOverlayVertextBuffer                        = 480,
        EVRInitError_VRInitError_Compositor_CreateTextVertexBuffer                            = 481,
        EVRInitError_VRInitError_Compositor_CreateTextIndexBuffer                             = 482,
        EVRInitError_VRInitError_Compositor_CreateMirrorTextures                              = 483,
        EVRInitError_VRInitError_Compositor_CreateLastFrameRenderTexture                      = 484,
        EVRInitError_VRInitError_VendorSpecific_UnableToConnectToOculusRuntime                = 1000,
        EVRInitError_VRInitError_VendorSpecific_WindowsNotInDevMode                           = 1001,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_CantOpenDevice                       = 1101,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToRequestConfigStart           = 1102,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_NoStoredConfig                       = 1103,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigTooBig                         = 1104,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigTooSmall                       = 1105,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToInitZLib                     = 1106,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_CantReadFirmwareVersion              = 1107,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToSendUserDataStart            = 1108,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToGetUserDataStart             = 1109,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToGetUserDataNext              = 1110,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_UserDataAddressRange                 = 1111,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_UserDataError                        = 1112,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigFailedSanityCheck              = 1113,
        EVRInitError_VRInitError_Steam_SteamInstallationNotFound                              = 2000,
        EVRInitError_VRInitError_LastError                                                    = 2001;

    /**
     * {@code EVRScreenshotType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRScreenshotType_VRScreenshotType_None EVRScreenshotType_VRScreenshotType_None}</li>
     * <li>{@link #EVRScreenshotType_VRScreenshotType_Mono EVRScreenshotType_VRScreenshotType_Mono} - the VR filename is ignored (can be nullptr), this is a normal flat single shot.</li>
     * <li>{@link #EVRScreenshotType_VRScreenshotType_Stereo EVRScreenshotType_VRScreenshotType_Stereo} - The VR image should be a side-by-side with the left eye image on the left.</li>
     * <li>{@link #EVRScreenshotType_VRScreenshotType_Cubemap EVRScreenshotType_VRScreenshotType_Cubemap} - The VR image should be six square images composited horizontally.</li>
     * <li>{@link #EVRScreenshotType_VRScreenshotType_MonoPanorama EVRScreenshotType_VRScreenshotType_MonoPanorama}</li>
     * <li>{@link #EVRScreenshotType_VRScreenshotType_StereoPanorama EVRScreenshotType_VRScreenshotType_StereoPanorama} - above/below with left eye panorama being the above image. Image is typically square with the panorama being 2x horizontal.</li>
     * </ul>
     */
    public static final int
        EVRScreenshotType_VRScreenshotType_None           = 0,
        EVRScreenshotType_VRScreenshotType_Mono           = 1,
        EVRScreenshotType_VRScreenshotType_Stereo         = 2,
        EVRScreenshotType_VRScreenshotType_Cubemap        = 3,
        EVRScreenshotType_VRScreenshotType_MonoPanorama   = 4,
        EVRScreenshotType_VRScreenshotType_StereoPanorama = 5;

    /**
     * {@code EVRScreenshotPropertyFilenames}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_Preview EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_Preview}</li>
     * <li>{@link #EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_VR EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_VR}</li>
     * </ul>
     */
    public static final int
        EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_Preview = 0,
        EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_VR      = 1;

    /**
     * {@code EVRTrackedCameraError}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_None EVRTrackedCameraError_VRTrackedCameraError_None}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_OperationFailed EVRTrackedCameraError_VRTrackedCameraError_OperationFailed}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_InvalidHandle EVRTrackedCameraError_VRTrackedCameraError_InvalidHandle}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameHeaderVersion EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameHeaderVersion}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_OutOfHandles EVRTrackedCameraError_VRTrackedCameraError_OutOfHandles}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_IPCFailure EVRTrackedCameraError_VRTrackedCameraError_IPCFailure}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_NotSupportedForThisDevice EVRTrackedCameraError_VRTrackedCameraError_NotSupportedForThisDevice}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_SharedMemoryFailure EVRTrackedCameraError_VRTrackedCameraError_SharedMemoryFailure}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_FrameBufferingFailure EVRTrackedCameraError_VRTrackedCameraError_FrameBufferingFailure}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_StreamSetupFailure EVRTrackedCameraError_VRTrackedCameraError_StreamSetupFailure}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_InvalidGLTextureId EVRTrackedCameraError_VRTrackedCameraError_InvalidGLTextureId}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_InvalidSharedTextureHandle EVRTrackedCameraError_VRTrackedCameraError_InvalidSharedTextureHandle}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_FailedToGetGLTextureId EVRTrackedCameraError_VRTrackedCameraError_FailedToGetGLTextureId}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_SharedTextureFailure EVRTrackedCameraError_VRTrackedCameraError_SharedTextureFailure}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_NoFrameAvailable EVRTrackedCameraError_VRTrackedCameraError_NoFrameAvailable}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_InvalidArgument EVRTrackedCameraError_VRTrackedCameraError_InvalidArgument}</li>
     * <li>{@link #EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameBufferSize EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameBufferSize}</li>
     * </ul>
     */
    public static final int
        EVRTrackedCameraError_VRTrackedCameraError_None                       = 0,
        EVRTrackedCameraError_VRTrackedCameraError_OperationFailed            = 100,
        EVRTrackedCameraError_VRTrackedCameraError_InvalidHandle              = 101,
        EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameHeaderVersion  = 102,
        EVRTrackedCameraError_VRTrackedCameraError_OutOfHandles               = 103,
        EVRTrackedCameraError_VRTrackedCameraError_IPCFailure                 = 104,
        EVRTrackedCameraError_VRTrackedCameraError_NotSupportedForThisDevice  = 105,
        EVRTrackedCameraError_VRTrackedCameraError_SharedMemoryFailure        = 106,
        EVRTrackedCameraError_VRTrackedCameraError_FrameBufferingFailure      = 107,
        EVRTrackedCameraError_VRTrackedCameraError_StreamSetupFailure         = 108,
        EVRTrackedCameraError_VRTrackedCameraError_InvalidGLTextureId         = 109,
        EVRTrackedCameraError_VRTrackedCameraError_InvalidSharedTextureHandle = 110,
        EVRTrackedCameraError_VRTrackedCameraError_FailedToGetGLTextureId     = 111,
        EVRTrackedCameraError_VRTrackedCameraError_SharedTextureFailure       = 112,
        EVRTrackedCameraError_VRTrackedCameraError_NoFrameAvailable           = 113,
        EVRTrackedCameraError_VRTrackedCameraError_InvalidArgument            = 114,
        EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameBufferSize     = 115;

    /**
     * {@code EVRTrackedCameraFrameLayout}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRTrackedCameraFrameLayout_Mono EVRTrackedCameraFrameLayout_Mono}</li>
     * <li>{@link #EVRTrackedCameraFrameLayout_Stereo EVRTrackedCameraFrameLayout_Stereo}</li>
     * <li>{@link #EVRTrackedCameraFrameLayout_VerticalLayout EVRTrackedCameraFrameLayout_VerticalLayout} - Stereo frames are Top/Bottom (left/right)</li>
     * <li>{@link #EVRTrackedCameraFrameLayout_HorizontalLayout EVRTrackedCameraFrameLayout_HorizontalLayout} - Stereo frames are Left/Right</li>
     * </ul>
     */
    public static final int
        EVRTrackedCameraFrameLayout_Mono             = 1,
        EVRTrackedCameraFrameLayout_Stereo           = 2,
        EVRTrackedCameraFrameLayout_VerticalLayout   = 16,
        EVRTrackedCameraFrameLayout_HorizontalLayout = 32;

    /**
     * {@code EVRTrackedCameraFrameType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted} - This is the camera video frame size in pixels, still distorted.</li>
     * <li>{@link #EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted} - In pixels, an undistorted inscribed rectangle region without invalid regions. This size is subject to changes shortly.</li>
     * <li>{@link #EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted} - In pixels, maximum undistorted with invalid regions. Non zero alpha component identifies valid regions.</li>
     * <li>{@link #EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</li>
     * </ul>
     */
    public static final int
        EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted          = 0,
        EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted        = 1,
        EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted = 2,
        EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES                      = 3;

    /**
     * {@code EVRDistortionFunctionType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRDistortionFunctionType_VRDistortionFunctionType_None EVRDistortionFunctionType_VRDistortionFunctionType_None}</li>
     * <li>{@link #EVRDistortionFunctionType_VRDistortionFunctionType_FTheta EVRDistortionFunctionType_VRDistortionFunctionType_FTheta}</li>
     * <li>{@link #EVRDistortionFunctionType_VRDistortionFunctionType_Extended_FTheta EVRDistortionFunctionType_VRDistortionFunctionType_Extended_FTheta}</li>
     * <li>{@link #EVRDistortionFunctionType_MAX_DISTORTION_FUNCTION_TYPES EVRDistortionFunctionType_MAX_DISTORTION_FUNCTION_TYPES}</li>
     * </ul>
     */
    public static final int
        EVRDistortionFunctionType_VRDistortionFunctionType_None            = 0,
        EVRDistortionFunctionType_VRDistortionFunctionType_FTheta          = 1,
        EVRDistortionFunctionType_VRDistortionFunctionType_Extended_FTheta = 2,
        EVRDistortionFunctionType_MAX_DISTORTION_FUNCTION_TYPES            = 3;

    /**
     * {@code EVSync}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVSync_VSync_None EVSync_VSync_None}</li>
     * <li>{@link #EVSync_VSync_WaitRender EVSync_VSync_WaitRender} - block following render work until vsync</li>
     * <li>{@link #EVSync_VSync_NoWaitRender EVSync_VSync_NoWaitRender} - do not block following render work (allow to get started early)</li>
     * </ul>
     */
    public static final int
        EVSync_VSync_None         = 0,
        EVSync_VSync_WaitRender   = 1,
        EVSync_VSync_NoWaitRender = 2;

    /**
     * {@code EVRMuraCorrectionMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRMuraCorrectionMode_Default EVRMuraCorrectionMode_Default}</li>
     * <li>{@link #EVRMuraCorrectionMode_NoCorrection EVRMuraCorrectionMode_NoCorrection}</li>
     * </ul>
     */
    public static final int
        EVRMuraCorrectionMode_Default      = 0,
        EVRMuraCorrectionMode_NoCorrection = 1;

    /**
     * {@code Imu_OffScaleFlags}: raw IMU data provided by {@code IVRIOBuffer} from paths to tracked devices with IMUs.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #Imu_OffScaleFlags_OffScale_AccelX Imu_OffScaleFlags_OffScale_AccelX}</li>
     * <li>{@link #Imu_OffScaleFlags_OffScale_AccelY Imu_OffScaleFlags_OffScale_AccelY}</li>
     * <li>{@link #Imu_OffScaleFlags_OffScale_AccelZ Imu_OffScaleFlags_OffScale_AccelZ}</li>
     * <li>{@link #Imu_OffScaleFlags_OffScale_GyroX Imu_OffScaleFlags_OffScale_GyroX}</li>
     * <li>{@link #Imu_OffScaleFlags_OffScale_GyroY Imu_OffScaleFlags_OffScale_GyroY}</li>
     * <li>{@link #Imu_OffScaleFlags_OffScale_GyroZ Imu_OffScaleFlags_OffScale_GyroZ}</li>
     * </ul>
     */
    public static final int
        Imu_OffScaleFlags_OffScale_AccelX = 1,
        Imu_OffScaleFlags_OffScale_AccelY = 2,
        Imu_OffScaleFlags_OffScale_AccelZ = 4,
        Imu_OffScaleFlags_OffScale_GyroX  = 8,
        Imu_OffScaleFlags_OffScale_GyroY  = 16,
        Imu_OffScaleFlags_OffScale_GyroZ  = 32;

    /**
     * {@code EVRApplicationError}: Used for all errors reported by the {@link VRApplications} interface.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRApplicationError_VRApplicationError_None EVRApplicationError_VRApplicationError_None}</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_AppKeyAlreadyExists EVRApplicationError_VRApplicationError_AppKeyAlreadyExists} - Only one application can use any given key.</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_NoManifest EVRApplicationError_VRApplicationError_NoManifest} - the running application does not have a manifest.</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_NoApplication EVRApplicationError_VRApplicationError_NoApplication} - No application is running.</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_InvalidIndex EVRApplicationError_VRApplicationError_InvalidIndex}</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_UnknownApplication EVRApplicationError_VRApplicationError_UnknownApplication} - the application could not be found.</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_IPCFailed EVRApplicationError_VRApplicationError_IPCFailed} - An IPC failure caused the request to fail.</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_ApplicationAlreadyRunning EVRApplicationError_VRApplicationError_ApplicationAlreadyRunning}</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_InvalidManifest EVRApplicationError_VRApplicationError_InvalidManifest}</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_InvalidApplication EVRApplicationError_VRApplicationError_InvalidApplication}</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_LaunchFailed EVRApplicationError_VRApplicationError_LaunchFailed} - the process didn't start.</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_ApplicationAlreadyStarting EVRApplicationError_VRApplicationError_ApplicationAlreadyStarting} - the system was already starting the same application.</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_LaunchInProgress EVRApplicationError_VRApplicationError_LaunchInProgress} - The system was already starting a different application.</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_OldApplicationQuitting EVRApplicationError_VRApplicationError_OldApplicationQuitting}</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_TransitionAborted EVRApplicationError_VRApplicationError_TransitionAborted}</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_IsTemplate EVRApplicationError_VRApplicationError_IsTemplate} - error when you try to call {@code LaunchApplication()} on a template type app (use {@code LaunchTemplateApplication}).</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_SteamVRIsExiting EVRApplicationError_VRApplicationError_SteamVRIsExiting}</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_BufferTooSmall EVRApplicationError_VRApplicationError_BufferTooSmall} - The provided buffer was too small to fit the requested data.</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_PropertyNotSet EVRApplicationError_VRApplicationError_PropertyNotSet} - The requested property was not set.</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_UnknownProperty EVRApplicationError_VRApplicationError_UnknownProperty}</li>
     * <li>{@link #EVRApplicationError_VRApplicationError_InvalidParameter EVRApplicationError_VRApplicationError_InvalidParameter}</li>
     * </ul>
     */
    public static final int
        EVRApplicationError_VRApplicationError_None                       = 0,
        EVRApplicationError_VRApplicationError_AppKeyAlreadyExists        = 100,
        EVRApplicationError_VRApplicationError_NoManifest                 = 101,
        EVRApplicationError_VRApplicationError_NoApplication              = 102,
        EVRApplicationError_VRApplicationError_InvalidIndex               = 103,
        EVRApplicationError_VRApplicationError_UnknownApplication         = 104,
        EVRApplicationError_VRApplicationError_IPCFailed                  = 105,
        EVRApplicationError_VRApplicationError_ApplicationAlreadyRunning  = 106,
        EVRApplicationError_VRApplicationError_InvalidManifest            = 107,
        EVRApplicationError_VRApplicationError_InvalidApplication         = 108,
        EVRApplicationError_VRApplicationError_LaunchFailed               = 109,
        EVRApplicationError_VRApplicationError_ApplicationAlreadyStarting = 110,
        EVRApplicationError_VRApplicationError_LaunchInProgress           = 111,
        EVRApplicationError_VRApplicationError_OldApplicationQuitting     = 112,
        EVRApplicationError_VRApplicationError_TransitionAborted          = 113,
        EVRApplicationError_VRApplicationError_IsTemplate                 = 114,
        EVRApplicationError_VRApplicationError_SteamVRIsExiting           = 115,
        EVRApplicationError_VRApplicationError_BufferTooSmall             = 200,
        EVRApplicationError_VRApplicationError_PropertyNotSet             = 201,
        EVRApplicationError_VRApplicationError_UnknownProperty            = 202,
        EVRApplicationError_VRApplicationError_InvalidParameter           = 203;

    /**
     * {@code EVRApplicationProperty}: these are the properties available on applications.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_Name_String EVRApplicationProperty_VRApplicationProperty_Name_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_LaunchType_String EVRApplicationProperty_VRApplicationProperty_LaunchType_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_WorkingDirectory_String EVRApplicationProperty_VRApplicationProperty_WorkingDirectory_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_BinaryPath_String EVRApplicationProperty_VRApplicationProperty_BinaryPath_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_Arguments_String EVRApplicationProperty_VRApplicationProperty_Arguments_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_URL_String EVRApplicationProperty_VRApplicationProperty_URL_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_Description_String EVRApplicationProperty_VRApplicationProperty_Description_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_NewsURL_String EVRApplicationProperty_VRApplicationProperty_NewsURL_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_ImagePath_String EVRApplicationProperty_VRApplicationProperty_ImagePath_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_Source_String EVRApplicationProperty_VRApplicationProperty_Source_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_ActionManifestURL_String EVRApplicationProperty_VRApplicationProperty_ActionManifestURL_String}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_IsTemplate_Bool EVRApplicationProperty_VRApplicationProperty_IsTemplate_Bool}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_IsInstanced_Bool EVRApplicationProperty_VRApplicationProperty_IsInstanced_Bool}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_IsInternal_Bool EVRApplicationProperty_VRApplicationProperty_IsInternal_Bool}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_WantsCompositorPauseInStandby_Bool EVRApplicationProperty_VRApplicationProperty_WantsCompositorPauseInStandby_Bool}</li>
     * <li>{@link #EVRApplicationProperty_VRApplicationProperty_LastLaunchTime_Uint64 EVRApplicationProperty_VRApplicationProperty_LastLaunchTime_Uint64}</li>
     * </ul>
     */
    public static final int
        EVRApplicationProperty_VRApplicationProperty_Name_String                        = 0,
        EVRApplicationProperty_VRApplicationProperty_LaunchType_String                  = 11,
        EVRApplicationProperty_VRApplicationProperty_WorkingDirectory_String            = 12,
        EVRApplicationProperty_VRApplicationProperty_BinaryPath_String                  = 13,
        EVRApplicationProperty_VRApplicationProperty_Arguments_String                   = 14,
        EVRApplicationProperty_VRApplicationProperty_URL_String                         = 15,
        EVRApplicationProperty_VRApplicationProperty_Description_String                 = 50,
        EVRApplicationProperty_VRApplicationProperty_NewsURL_String                     = 51,
        EVRApplicationProperty_VRApplicationProperty_ImagePath_String                   = 52,
        EVRApplicationProperty_VRApplicationProperty_Source_String                      = 53,
        EVRApplicationProperty_VRApplicationProperty_ActionManifestURL_String           = 54,
        EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool            = 60,
        EVRApplicationProperty_VRApplicationProperty_IsTemplate_Bool                    = 61,
        EVRApplicationProperty_VRApplicationProperty_IsInstanced_Bool                   = 62,
        EVRApplicationProperty_VRApplicationProperty_IsInternal_Bool                    = 63,
        EVRApplicationProperty_VRApplicationProperty_WantsCompositorPauseInStandby_Bool = 64,
        EVRApplicationProperty_VRApplicationProperty_LastLaunchTime_Uint64              = 70;

    /**
     * {@code EVRApplicationTransitionState}: These are states the scene application startup process will go through.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRApplicationTransitionState_VRApplicationTransition_None EVRApplicationTransitionState_VRApplicationTransition_None}</li>
     * <li>{@link #EVRApplicationTransitionState_VRApplicationTransition_OldAppQuitSent EVRApplicationTransitionState_VRApplicationTransition_OldAppQuitSent}</li>
     * <li>{@link #EVRApplicationTransitionState_VRApplicationTransition_WaitingForExternalLaunch EVRApplicationTransitionState_VRApplicationTransition_WaitingForExternalLaunch}</li>
     * <li>{@link #EVRApplicationTransitionState_VRApplicationTransition_NewAppLaunched EVRApplicationTransitionState_VRApplicationTransition_NewAppLaunched}</li>
     * </ul>
     */
    public static final int
        EVRApplicationTransitionState_VRApplicationTransition_None                     = 0,
        EVRApplicationTransitionState_VRApplicationTransition_OldAppQuitSent           = 10,
        EVRApplicationTransitionState_VRApplicationTransition_WaitingForExternalLaunch = 11,
        EVRApplicationTransitionState_VRApplicationTransition_NewAppLaunched           = 20;

    /**
     * {@code ChaperoneCalibrationState}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ChaperoneCalibrationState_OK ChaperoneCalibrationState_OK} - Chaperone is fully calibrated and working correctly.</li>
     * <li>{@link #ChaperoneCalibrationState_Warning ChaperoneCalibrationState_Warning}</li>
     * <li>{@link #ChaperoneCalibrationState_Warning_BaseStationMayHaveMoved ChaperoneCalibrationState_Warning_BaseStationMayHaveMoved} - A base station thinks that it might have moved.</li>
     * <li>{@link #ChaperoneCalibrationState_Warning_BaseStationRemoved ChaperoneCalibrationState_Warning_BaseStationRemoved} - There are less base stations than when calibrated.</li>
     * <li>{@link #ChaperoneCalibrationState_Warning_SeatedBoundsInvalid ChaperoneCalibrationState_Warning_SeatedBoundsInvalid} - Seated bounds haven't been calibrated for the current tracking center.</li>
     * <li>{@link #ChaperoneCalibrationState_Error ChaperoneCalibrationState_Error} - The UniverseID is invalid.</li>
     * <li>{@link #ChaperoneCalibrationState_Error_BaseStationUninitialized ChaperoneCalibrationState_Error_BaseStationUninitialized} - Tracking center hasn't be calibrated for at least one of the base stations.</li>
     * <li>{@link #ChaperoneCalibrationState_Error_BaseStationConflict ChaperoneCalibrationState_Error_BaseStationConflict} - Tracking center is calibrated, but base stations disagree on the tracking space.</li>
     * <li>{@link #ChaperoneCalibrationState_Error_PlayAreaInvalid ChaperoneCalibrationState_Error_PlayAreaInvalid} - Play Area hasn't been calibrated for the current tracking center.</li>
     * <li>{@link #ChaperoneCalibrationState_Error_CollisionBoundsInvalid ChaperoneCalibrationState_Error_CollisionBoundsInvalid} - Collision Bounds haven't been calibrated for the current tracking center.</li>
     * </ul>
     */
    public static final int
        ChaperoneCalibrationState_OK                              = 1,
        ChaperoneCalibrationState_Warning                         = 100,
        ChaperoneCalibrationState_Warning_BaseStationMayHaveMoved = 101,
        ChaperoneCalibrationState_Warning_BaseStationRemoved      = 102,
        ChaperoneCalibrationState_Warning_SeatedBoundsInvalid     = 103,
        ChaperoneCalibrationState_Error                           = 200,
        ChaperoneCalibrationState_Error_BaseStationUninitialized  = 201,
        ChaperoneCalibrationState_Error_BaseStationConflict       = 202,
        ChaperoneCalibrationState_Error_PlayAreaInvalid           = 203,
        ChaperoneCalibrationState_Error_CollisionBoundsInvalid    = 204;

    /**
     * {@code EChaperoneConfigFile}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EChaperoneConfigFile_Live EChaperoneConfigFile_Live} - The live chaperone config, used by most applications and games.</li>
     * <li>{@link #EChaperoneConfigFile_Temp EChaperoneConfigFile_Temp} - The temporary chaperone config, used to live-preview collision bounds in room setup.</li>
     * </ul>
     */
    public static final int
        EChaperoneConfigFile_Live = 1,
        EChaperoneConfigFile_Temp = 2;

    /** {@code EChaperoneImportFlags} */
    public static final int EChaperoneImportFlags_EChaperoneImport_BoundsOnly = 1;

    /**
     * {@code EVRCompositorError}: Errors that can occur with the VR compositor.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRCompositorError_VRCompositorError_None EVRCompositorError_VRCompositorError_None}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_RequestFailed EVRCompositorError_VRCompositorError_RequestFailed}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_IncompatibleVersion EVRCompositorError_VRCompositorError_IncompatibleVersion}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_DoNotHaveFocus EVRCompositorError_VRCompositorError_DoNotHaveFocus}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_InvalidTexture EVRCompositorError_VRCompositorError_InvalidTexture}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_IsNotSceneApplication EVRCompositorError_VRCompositorError_IsNotSceneApplication}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_TextureIsOnWrongDevice EVRCompositorError_VRCompositorError_TextureIsOnWrongDevice}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_TextureUsesUnsupportedFormat EVRCompositorError_VRCompositorError_TextureUsesUnsupportedFormat}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_SharedTexturesNotSupported EVRCompositorError_VRCompositorError_SharedTexturesNotSupported}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_IndexOutOfRange EVRCompositorError_VRCompositorError_IndexOutOfRange}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_AlreadySubmitted EVRCompositorError_VRCompositorError_AlreadySubmitted}</li>
     * <li>{@link #EVRCompositorError_VRCompositorError_InvalidBounds EVRCompositorError_VRCompositorError_InvalidBounds}</li>
     * </ul>
     */
    public static final int
        EVRCompositorError_VRCompositorError_None                         = 0,
        EVRCompositorError_VRCompositorError_RequestFailed                = 1,
        EVRCompositorError_VRCompositorError_IncompatibleVersion          = 100,
        EVRCompositorError_VRCompositorError_DoNotHaveFocus               = 101,
        EVRCompositorError_VRCompositorError_InvalidTexture               = 102,
        EVRCompositorError_VRCompositorError_IsNotSceneApplication        = 103,
        EVRCompositorError_VRCompositorError_TextureIsOnWrongDevice       = 104,
        EVRCompositorError_VRCompositorError_TextureUsesUnsupportedFormat = 105,
        EVRCompositorError_VRCompositorError_SharedTexturesNotSupported   = 106,
        EVRCompositorError_VRCompositorError_IndexOutOfRange              = 107,
        EVRCompositorError_VRCompositorError_AlreadySubmitted             = 108,
        EVRCompositorError_VRCompositorError_InvalidBounds                = 109;

    /**
     * {@code EVRCompositorTimingMode}: Timing mode passed to {@link VRCompositor#VRCompositor_SetExplicitTimingMode SetExplicitTimingMode}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRCompositorTimingMode_VRCompositorTimingMode_Implicit EVRCompositorTimingMode_VRCompositorTimingMode_Implicit}</li>
     * <li>{@link #EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_RuntimePerformsPostPresentHandoff EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_RuntimePerformsPostPresentHandoff}</li>
     * <li>{@link #EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_ApplicationPerformsPostPresentHandoff EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_ApplicationPerformsPostPresentHandoff}</li>
     * </ul>
     */
    public static final int
        EVRCompositorTimingMode_VRCompositorTimingMode_Implicit                                       = 0,
        EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_RuntimePerformsPostPresentHandoff     = 1,
        EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_ApplicationPerformsPostPresentHandoff = 2;

    /**
     * {@code VROverlayInputMethod}: Types of input supported by VR Overlays.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VROverlayInputMethod_None VROverlayInputMethod_None} - No input events will be generated automatically for this overlay.</li>
     * <li>{@link #VROverlayInputMethod_Mouse VROverlayInputMethod_Mouse} - Tracked controllers will get mouse events automatically.</li>
     * <li>{@link #VROverlayInputMethod_DualAnalog VROverlayInputMethod_DualAnalog} - Analog inputs from tracked controllers are turned into DualAnalog events.</li>
     * </ul>
     */
    public static final int
        VROverlayInputMethod_None       = 0,
        VROverlayInputMethod_Mouse      = 1,
        VROverlayInputMethod_DualAnalog = 2;

    /**
     * {@code VROverlayTransformType}: Allows the caller to figure out which overlay transform getter to call.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VROverlayTransformType_VROverlayTransform_Absolute VROverlayTransformType_VROverlayTransform_Absolute}</li>
     * <li>{@link #VROverlayTransformType_VROverlayTransform_TrackedDeviceRelative VROverlayTransformType_VROverlayTransform_TrackedDeviceRelative}</li>
     * <li>{@link #VROverlayTransformType_VROverlayTransform_SystemOverlay VROverlayTransformType_VROverlayTransform_SystemOverlay}</li>
     * <li>{@link #VROverlayTransformType_VROverlayTransform_TrackedComponent VROverlayTransformType_VROverlayTransform_TrackedComponent}</li>
     * </ul>
     */
    public static final int
        VROverlayTransformType_VROverlayTransform_Absolute              = 0,
        VROverlayTransformType_VROverlayTransform_TrackedDeviceRelative = 1,
        VROverlayTransformType_VROverlayTransform_SystemOverlay         = 2,
        VROverlayTransformType_VROverlayTransform_TrackedComponent      = 3;

    /**
     * {@code VROverlayFlags}: Overlay control settings.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VROverlayFlags_None VROverlayFlags_None}</li>
     * <li>{@link #VROverlayFlags_Curved VROverlayFlags_Curved} - Only takes effect when rendered using the high quality render path (see {@link VROverlay#VROverlay_SetHighQualityOverlay SetHighQualityOverlay}).</li>
     * <li>{@link #VROverlayFlags_RGSS4X VROverlayFlags_RGSS4X} - Only takes effect when rendered using the high quality render path (see {@link VROverlay#VROverlay_SetHighQualityOverlay SetHighQualityOverlay}).</li>
     * <li>{@link #VROverlayFlags_NoDashboardTab VROverlayFlags_NoDashboardTab} - Set this flag on a dashboard overlay to prevent a tab from showing up for that overlay.</li>
     * <li>{@link #VROverlayFlags_AcceptsGamepadEvents VROverlayFlags_AcceptsGamepadEvents} - Set this flag on a dashboard that is able to deal with gamepad focus events.</li>
     * <li>{@link #VROverlayFlags_ShowGamepadFocus VROverlayFlags_ShowGamepadFocus} - Indicates that the overlay should dim/brighten to show gamepad focus.</li>
     * <li>{@link #VROverlayFlags_SendVRDiscreteScrollEvents VROverlayFlags_SendVRDiscreteScrollEvents} - When this is set the overlay will receive {@code VREvent_ScrollDiscrete} events like a mouse wheel. Requires mouse input mode.</li>
     * <li>{@link #VROverlayFlags_SendVRTouchpadEvents VROverlayFlags_SendVRTouchpadEvents} - Indicates that the overlay would like to receive.</li>
     * <li>{@link #VROverlayFlags_ShowTouchPadScrollWheel VROverlayFlags_ShowTouchPadScrollWheel} - 
     * If set this will render a vertical scroll wheel on the primary controller, only needed if not using VROverlayFlags_SendVRScrollEvents but you still
     * want to represent a scroll wheel.
     * </li>
     * <li>{@link #VROverlayFlags_TransferOwnershipToInternalProcess VROverlayFlags_TransferOwnershipToInternalProcess} - If this is set ownership and render access to the overlay are transferred to the new scene process on a call to {@link VRApplications#VRApplications_LaunchInternalProcess LaunchInternalProcess}.</li>
     * <li>{@link #VROverlayFlags_SideBySide_Parallel VROverlayFlags_SideBySide_Parallel} - If set, renders 50% of the texture in each eye, side by side. Texture is left/right.</li>
     * <li>{@link #VROverlayFlags_SideBySide_Crossed VROverlayFlags_SideBySide_Crossed} - If set, renders 50% of the texture in each eye, side by side. Texture is crossed and right/left.</li>
     * <li>{@link #VROverlayFlags_Panorama VROverlayFlags_Panorama} - Texture is a panorama.</li>
     * <li>{@link #VROverlayFlags_StereoPanorama VROverlayFlags_StereoPanorama} - Texture is a stereo panorama.</li>
     * <li>{@link #VROverlayFlags_SortWithNonSceneOverlays VROverlayFlags_SortWithNonSceneOverlays} - 
     * If this is set on an overlay owned by the scene application that overlay will be sorted with the "Other" overlays on top of all other scene
     * overlays.
     * </li>
     * <li>{@link #VROverlayFlags_VisibleInDashboard VROverlayFlags_VisibleInDashboard} - If set, the overlay will be shown in the dashboard, otherwise it will be hidden.</li>
     * <li>{@link #VROverlayFlags_MakeOverlaysInteractiveIfVisible VROverlayFlags_MakeOverlaysInteractiveIfVisible} - If this is set and the overlay's input method is not none, the system-wide laser mouse mode will be activated whenever this overlay is visible.</li>
     * <li>{@link #VROverlayFlags_SendVRSmoothScrollEvents VROverlayFlags_SendVRSmoothScrollEvents} - If this is set the overlay will receive smooth {@code VREvent_ScrollSmooth} that emulate trackpad scrolling. Requires mouse input mode.</li>
     * </ul>
     */
    public static final int
        VROverlayFlags_None                               = 0,
        VROverlayFlags_Curved                             = 1,
        VROverlayFlags_RGSS4X                             = 2,
        VROverlayFlags_NoDashboardTab                     = 3,
        VROverlayFlags_AcceptsGamepadEvents               = 4,
        VROverlayFlags_ShowGamepadFocus                   = 5,
        VROverlayFlags_SendVRDiscreteScrollEvents         = 6,
        VROverlayFlags_SendVRTouchpadEvents               = 7,
        VROverlayFlags_ShowTouchPadScrollWheel            = 8,
        VROverlayFlags_TransferOwnershipToInternalProcess = 9,
        VROverlayFlags_SideBySide_Parallel                = 10,
        VROverlayFlags_SideBySide_Crossed                 = 11,
        VROverlayFlags_Panorama                           = 12,
        VROverlayFlags_StereoPanorama                     = 13,
        VROverlayFlags_SortWithNonSceneOverlays           = 14,
        VROverlayFlags_VisibleInDashboard                 = 15,
        VROverlayFlags_MakeOverlaysInteractiveIfVisible   = 16,
        VROverlayFlags_SendVRSmoothScrollEvents           = 17;

    /**
     * {@code VRMessageOverlayResponse}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VRMessageOverlayResponse_ButtonPress_0 VRMessageOverlayResponse_ButtonPress_0}</li>
     * <li>{@link #VRMessageOverlayResponse_ButtonPress_1 VRMessageOverlayResponse_ButtonPress_1}</li>
     * <li>{@link #VRMessageOverlayResponse_ButtonPress_2 VRMessageOverlayResponse_ButtonPress_2}</li>
     * <li>{@link #VRMessageOverlayResponse_ButtonPress_3 VRMessageOverlayResponse_ButtonPress_3}</li>
     * <li>{@link #VRMessageOverlayResponse_CouldntFindSystemOverlay VRMessageOverlayResponse_CouldntFindSystemOverlay}</li>
     * <li>{@link #VRMessageOverlayResponse_CouldntFindOrCreateClientOverlay VRMessageOverlayResponse_CouldntFindOrCreateClientOverlay}</li>
     * <li>{@link #VRMessageOverlayResponse_ApplicationQuit VRMessageOverlayResponse_ApplicationQuit}</li>
     * </ul>
     */
    public static final int
        VRMessageOverlayResponse_ButtonPress_0                    = 0,
        VRMessageOverlayResponse_ButtonPress_1                    = 1,
        VRMessageOverlayResponse_ButtonPress_2                    = 2,
        VRMessageOverlayResponse_ButtonPress_3                    = 3,
        VRMessageOverlayResponse_CouldntFindSystemOverlay         = 4,
        VRMessageOverlayResponse_CouldntFindOrCreateClientOverlay = 5,
        VRMessageOverlayResponse_ApplicationQuit                  = 6;

    /**
     * {@code EGamepadTextInputMode}: Input modes for the Big Picture gamepad text entry.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EGamepadTextInputMode_k_EGamepadTextInputModeNormal EGamepadTextInputMode_k_EGamepadTextInputModeNormal}</li>
     * <li>{@link #EGamepadTextInputMode_k_EGamepadTextInputModePassword EGamepadTextInputMode_k_EGamepadTextInputModePassword}</li>
     * <li>{@link #EGamepadTextInputMode_k_EGamepadTextInputModeSubmit EGamepadTextInputMode_k_EGamepadTextInputModeSubmit}</li>
     * </ul>
     */
    public static final int
        EGamepadTextInputMode_k_EGamepadTextInputModeNormal   = 0,
        EGamepadTextInputMode_k_EGamepadTextInputModePassword = 1,
        EGamepadTextInputMode_k_EGamepadTextInputModeSubmit   = 2;

    /**
     * {@code EGamepadTextInputLineMode}: Controls number of allowed lines for the Big Picture gamepad text entry.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine}</li>
     * <li>{@link #EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines}</li>
     * </ul>
     */
    public static final int
        EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine    = 0,
        EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines = 1;

    /**
     * {@code EOverlayDirection}: Directions for changing focus between overlays with the gamepad.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EOverlayDirection_OverlayDirection_Up EOverlayDirection_OverlayDirection_Up}</li>
     * <li>{@link #EOverlayDirection_OverlayDirection_Down EOverlayDirection_OverlayDirection_Down}</li>
     * <li>{@link #EOverlayDirection_OverlayDirection_Left EOverlayDirection_OverlayDirection_Left}</li>
     * <li>{@link #EOverlayDirection_OverlayDirection_Right EOverlayDirection_OverlayDirection_Right}</li>
     * <li>{@link #EOverlayDirection_OverlayDirection_Count EOverlayDirection_OverlayDirection_Count}</li>
     * </ul>
     */
    public static final int
        EOverlayDirection_OverlayDirection_Up    = 0,
        EOverlayDirection_OverlayDirection_Down  = 1,
        EOverlayDirection_OverlayDirection_Left  = 2,
        EOverlayDirection_OverlayDirection_Right = 3,
        EOverlayDirection_OverlayDirection_Count = 4;

    /**
     * {@code EVROverlayIntersectionMaskPrimitiveType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVROverlayIntersectionMaskPrimitiveType_OverlayIntersectionPrimitiveType_Rectangle EVROverlayIntersectionMaskPrimitiveType_OverlayIntersectionPrimitiveType_Rectangle}</li>
     * <li>{@link #EVROverlayIntersectionMaskPrimitiveType_OverlayIntersectionPrimitiveType_Circle EVROverlayIntersectionMaskPrimitiveType_OverlayIntersectionPrimitiveType_Circle}</li>
     * </ul>
     */
    public static final int
        EVROverlayIntersectionMaskPrimitiveType_OverlayIntersectionPrimitiveType_Rectangle = 0,
        EVROverlayIntersectionMaskPrimitiveType_OverlayIntersectionPrimitiveType_Circle    = 1;

    /**
     * {@code EVRRenderModelError}: Errors that can occur with the VR compositor.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_None EVRRenderModelError_VRRenderModelError_None}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_Loading EVRRenderModelError_VRRenderModelError_Loading}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_NotSupported EVRRenderModelError_VRRenderModelError_NotSupported}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_InvalidArg EVRRenderModelError_VRRenderModelError_InvalidArg}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_InvalidModel EVRRenderModelError_VRRenderModelError_InvalidModel}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_NoShapes EVRRenderModelError_VRRenderModelError_NoShapes}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_MultipleShapes EVRRenderModelError_VRRenderModelError_MultipleShapes}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_TooManyVertices EVRRenderModelError_VRRenderModelError_TooManyVertices}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_MultipleTextures EVRRenderModelError_VRRenderModelError_MultipleTextures}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_BufferTooSmall EVRRenderModelError_VRRenderModelError_BufferTooSmall}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_NotEnoughNormals EVRRenderModelError_VRRenderModelError_NotEnoughNormals}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_NotEnoughTexCoords EVRRenderModelError_VRRenderModelError_NotEnoughTexCoords}</li>
     * <li>{@link #EVRRenderModelError_VRRenderModelError_InvalidTexture EVRRenderModelError_VRRenderModelError_InvalidTexture}</li>
     * </ul>
     */
    public static final int
        EVRRenderModelError_VRRenderModelError_None               = 0,
        EVRRenderModelError_VRRenderModelError_Loading            = 100,
        EVRRenderModelError_VRRenderModelError_NotSupported       = 200,
        EVRRenderModelError_VRRenderModelError_InvalidArg         = 300,
        EVRRenderModelError_VRRenderModelError_InvalidModel       = 301,
        EVRRenderModelError_VRRenderModelError_NoShapes           = 302,
        EVRRenderModelError_VRRenderModelError_MultipleShapes     = 303,
        EVRRenderModelError_VRRenderModelError_TooManyVertices    = 304,
        EVRRenderModelError_VRRenderModelError_MultipleTextures   = 305,
        EVRRenderModelError_VRRenderModelError_BufferTooSmall     = 306,
        EVRRenderModelError_VRRenderModelError_NotEnoughNormals   = 307,
        EVRRenderModelError_VRRenderModelError_NotEnoughTexCoords = 308,
        EVRRenderModelError_VRRenderModelError_InvalidTexture     = 400;

    /**
     * {@code EVRComponentProperty}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRComponentProperty_VRComponentProperty_IsStatic EVRComponentProperty_VRComponentProperty_IsStatic}</li>
     * <li>{@link #EVRComponentProperty_VRComponentProperty_IsVisible EVRComponentProperty_VRComponentProperty_IsVisible}</li>
     * <li>{@link #EVRComponentProperty_VRComponentProperty_IsTouched EVRComponentProperty_VRComponentProperty_IsTouched}</li>
     * <li>{@link #EVRComponentProperty_VRComponentProperty_IsPressed EVRComponentProperty_VRComponentProperty_IsPressed}</li>
     * <li>{@link #EVRComponentProperty_VRComponentProperty_IsScrolled EVRComponentProperty_VRComponentProperty_IsScrolled}</li>
     * </ul>
     */
    public static final int
        EVRComponentProperty_VRComponentProperty_IsStatic   = 1,
        EVRComponentProperty_VRComponentProperty_IsVisible  = 2,
        EVRComponentProperty_VRComponentProperty_IsTouched  = 4,
        EVRComponentProperty_VRComponentProperty_IsPressed  = 8,
        EVRComponentProperty_VRComponentProperty_IsScrolled = 16;

    /**
     * {@code EVRNotificationType}: Be aware that the notification type is used as 'priority' to pick the next notification.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRNotificationType_Transient EVRNotificationType_Transient} - 
     * Transient notifications are automatically hidden after a period of time set by the user. They are used for things like information and chat
     * messages that do not require user interaction.
     * </li>
     * <li>{@link #EVRNotificationType_Persistent EVRNotificationType_Persistent} - 
     * Persistent notifications are shown to the user until they are hidden by calling {@link VRNotifications#VRNotifications_RemoveNotification RemoveNotification}. They are used for things like phone calls
     * and alarms that require user interaction.
     * </li>
     * <li>{@link #EVRNotificationType_Transient_SystemWithUserValue EVRNotificationType_Transient_SystemWithUserValue} - 
     * System notifications are shown no matter what. It is expected, that the {@code ulUserValue} is used as ID. If there is already a system
     * notification in the queue with that ID it is not accepted into the queue to prevent spamming with system notification.
     * </li>
     * </ul>
     */
    public static final int
        EVRNotificationType_Transient                     = 0,
        EVRNotificationType_Persistent                    = 1,
        EVRNotificationType_Transient_SystemWithUserValue = 2;

    /**
     * {@code EVRNotificationStyle}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRNotificationStyle_None EVRNotificationStyle_None} - Creates a notification with minimal external styling.</li>
     * <li>{@link #EVRNotificationStyle_Application EVRNotificationStyle_Application} - Used for notifications about overlay-level status. In Steam this is used for events like downloads completing.</li>
     * <li>{@link #EVRNotificationStyle_Contact_Disabled EVRNotificationStyle_Contact_Disabled} - Used for notifications about contacts that are unknown or not available. In Steam this is used for friend invitations and offline friends.</li>
     * <li>{@link #EVRNotificationStyle_Contact_Enabled EVRNotificationStyle_Contact_Enabled} - Used for notifications about contacts that are available but inactive. In Steam this is used for friends that are online but not playing a game.</li>
     * <li>{@link #EVRNotificationStyle_Contact_Active EVRNotificationStyle_Contact_Active} - 
     * Used for notifications about contacts that are available and active. In Steam this is used for friends that are online and currently running a
     * game.
     * </li>
     * </ul>
     */
    public static final int
        EVRNotificationStyle_None             = 0,
        EVRNotificationStyle_Application      = 100,
        EVRNotificationStyle_Contact_Disabled = 200,
        EVRNotificationStyle_Contact_Enabled  = 201,
        EVRNotificationStyle_Contact_Active   = 202;

    /**
     * {@code EVRSettingsError}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRSettingsError_VRSettingsError_None EVRSettingsError_VRSettingsError_None}</li>
     * <li>{@link #EVRSettingsError_VRSettingsError_IPCFailed EVRSettingsError_VRSettingsError_IPCFailed}</li>
     * <li>{@link #EVRSettingsError_VRSettingsError_WriteFailed EVRSettingsError_VRSettingsError_WriteFailed}</li>
     * <li>{@link #EVRSettingsError_VRSettingsError_ReadFailed EVRSettingsError_VRSettingsError_ReadFailed}</li>
     * <li>{@link #EVRSettingsError_VRSettingsError_JsonParseFailed EVRSettingsError_VRSettingsError_JsonParseFailed}</li>
     * <li>{@link #EVRSettingsError_VRSettingsError_UnsetSettingHasNoDefault EVRSettingsError_VRSettingsError_UnsetSettingHasNoDefault} - This will be returned if the setting does not appear in the appropriate default file and has not been set.</li>
     * </ul>
     */
    public static final int
        EVRSettingsError_VRSettingsError_None                     = 0,
        EVRSettingsError_VRSettingsError_IPCFailed                = 1,
        EVRSettingsError_VRSettingsError_WriteFailed              = 2,
        EVRSettingsError_VRSettingsError_ReadFailed               = 3,
        EVRSettingsError_VRSettingsError_JsonParseFailed          = 4,
        EVRSettingsError_VRSettingsError_UnsetSettingHasNoDefault = 5;

    /**
     * {@code EVRScreenshotError}: Errors that can occur with the VR compositor.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRScreenshotError_VRScreenshotError_None EVRScreenshotError_VRScreenshotError_None}</li>
     * <li>{@link #EVRScreenshotError_VRScreenshotError_RequestFailed EVRScreenshotError_VRScreenshotError_RequestFailed}</li>
     * <li>{@link #EVRScreenshotError_VRScreenshotError_IncompatibleVersion EVRScreenshotError_VRScreenshotError_IncompatibleVersion}</li>
     * <li>{@link #EVRScreenshotError_VRScreenshotError_NotFound EVRScreenshotError_VRScreenshotError_NotFound}</li>
     * <li>{@link #EVRScreenshotError_VRScreenshotError_BufferTooSmall EVRScreenshotError_VRScreenshotError_BufferTooSmall}</li>
     * <li>{@link #EVRScreenshotError_VRScreenshotError_ScreenshotAlreadyInProgress EVRScreenshotError_VRScreenshotError_ScreenshotAlreadyInProgress}</li>
     * </ul>
     */
    public static final int
        EVRScreenshotError_VRScreenshotError_None                        = 0,
        EVRScreenshotError_VRScreenshotError_RequestFailed               = 1,
        EVRScreenshotError_VRScreenshotError_IncompatibleVersion         = 100,
        EVRScreenshotError_VRScreenshotError_NotFound                    = 101,
        EVRScreenshotError_VRScreenshotError_BufferTooSmall              = 102,
        EVRScreenshotError_VRScreenshotError_ScreenshotAlreadyInProgress = 108;

    /**
     * {@code EVRSkeletalTransformSpace}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Model EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Model}</li>
     * <li>{@link #EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent}</li>
     * </ul>
     */
    public static final int
        EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Model  = 0,
        EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent = 1;

    /**
     * {@code EVRSkeletalReferencePose}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRSkeletalReferencePose_VRSkeletalReferencePose_BindPose EVRSkeletalReferencePose_VRSkeletalReferencePose_BindPose}</li>
     * <li>{@link #EVRSkeletalReferencePose_VRSkeletalReferencePose_OpenHand EVRSkeletalReferencePose_VRSkeletalReferencePose_OpenHand}</li>
     * <li>{@link #EVRSkeletalReferencePose_VRSkeletalReferencePose_Fist EVRSkeletalReferencePose_VRSkeletalReferencePose_Fist}</li>
     * <li>{@link #EVRSkeletalReferencePose_VRSkeletalReferencePose_GripLimit EVRSkeletalReferencePose_VRSkeletalReferencePose_GripLimit}</li>
     * </ul>
     */
    public static final int
        EVRSkeletalReferencePose_VRSkeletalReferencePose_BindPose  = 0,
        EVRSkeletalReferencePose_VRSkeletalReferencePose_OpenHand  = 1,
        EVRSkeletalReferencePose_VRSkeletalReferencePose_Fist      = 2,
        EVRSkeletalReferencePose_VRSkeletalReferencePose_GripLimit = 3;

    /**
     * {@code EVRFinger}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRFinger_VRFinger_Thumb EVRFinger_VRFinger_Thumb}</li>
     * <li>{@link #EVRFinger_VRFinger_Index EVRFinger_VRFinger_Index}</li>
     * <li>{@link #EVRFinger_VRFinger_Middle EVRFinger_VRFinger_Middle}</li>
     * <li>{@link #EVRFinger_VRFinger_Ring EVRFinger_VRFinger_Ring}</li>
     * <li>{@link #EVRFinger_VRFinger_Pinky EVRFinger_VRFinger_Pinky}</li>
     * <li>{@link #EVRFinger_VRFinger_Count EVRFinger_VRFinger_Count}</li>
     * </ul>
     */
    public static final int
        EVRFinger_VRFinger_Thumb  = 0,
        EVRFinger_VRFinger_Index  = 1,
        EVRFinger_VRFinger_Middle = 2,
        EVRFinger_VRFinger_Ring   = 3,
        EVRFinger_VRFinger_Pinky  = 4,
        EVRFinger_VRFinger_Count  = 5;

    /**
     * {@code EVRFingerSplay}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRFingerSplay_VRFingerSplay_Thumb_Index EVRFingerSplay_VRFingerSplay_Thumb_Index}</li>
     * <li>{@link #EVRFingerSplay_VRFingerSplay_Index_Middle EVRFingerSplay_VRFingerSplay_Index_Middle}</li>
     * <li>{@link #EVRFingerSplay_VRFingerSplay_Middle_Ring EVRFingerSplay_VRFingerSplay_Middle_Ring}</li>
     * <li>{@link #EVRFingerSplay_VRFingerSplay_Ring_Pinky EVRFingerSplay_VRFingerSplay_Ring_Pinky}</li>
     * <li>{@link #EVRFingerSplay_VRFingerSplay_Count EVRFingerSplay_VRFingerSplay_Count}</li>
     * </ul>
     */
    public static final int
        EVRFingerSplay_VRFingerSplay_Thumb_Index  = 0,
        EVRFingerSplay_VRFingerSplay_Index_Middle = 1,
        EVRFingerSplay_VRFingerSplay_Middle_Ring  = 2,
        EVRFingerSplay_VRFingerSplay_Ring_Pinky   = 3,
        EVRFingerSplay_VRFingerSplay_Count        = 4;

    /**
     * {@code EVRInputFilterCancelType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRInputFilterCancelType_VRInputFilterCancel_Timers EVRInputFilterCancelType_VRInputFilterCancel_Timers}</li>
     * <li>{@link #EVRInputFilterCancelType_VRInputFilterCancel_Momentum EVRInputFilterCancelType_VRInputFilterCancel_Momentum}</li>
     * </ul>
     */
    public static final int
        EVRInputFilterCancelType_VRInputFilterCancel_Timers   = 0,
        EVRInputFilterCancelType_VRInputFilterCancel_Momentum = 1;

    /**
     * {@code EVRInputStringBits}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EVRInputStringBits_VRInputString_Hand EVRInputStringBits_VRInputString_Hand}</li>
     * <li>{@link #EVRInputStringBits_VRInputString_ControllerType EVRInputStringBits_VRInputString_ControllerType}</li>
     * <li>{@link #EVRInputStringBits_VRInputString_InputSource EVRInputStringBits_VRInputString_InputSource}</li>
     * <li>{@link #EVRInputStringBits_VRInputString_All EVRInputStringBits_VRInputString_All}</li>
     * </ul>
     */
    public static final int
        EVRInputStringBits_VRInputString_Hand           = 1,
        EVRInputStringBits_VRInputString_ControllerType = 2,
        EVRInputStringBits_VRInputString_InputSource    = 4,
        EVRInputStringBits_VRInputString_All            = -1;

    /**
     * {@code EIOBufferError}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EIOBufferError_IOBuffer_Success EIOBufferError_IOBuffer_Success}</li>
     * <li>{@link #EIOBufferError_IOBuffer_OperationFailed EIOBufferError_IOBuffer_OperationFailed}</li>
     * <li>{@link #EIOBufferError_IOBuffer_InvalidHandle EIOBufferError_IOBuffer_InvalidHandle}</li>
     * <li>{@link #EIOBufferError_IOBuffer_InvalidArgument EIOBufferError_IOBuffer_InvalidArgument}</li>
     * <li>{@link #EIOBufferError_IOBuffer_PathExists EIOBufferError_IOBuffer_PathExists}</li>
     * <li>{@link #EIOBufferError_IOBuffer_PathDoesNotExist EIOBufferError_IOBuffer_PathDoesNotExist}</li>
     * <li>{@link #EIOBufferError_IOBuffer_Permission EIOBufferError_IOBuffer_Permission}</li>
     * </ul>
     */
    public static final int
        EIOBufferError_IOBuffer_Success          = 0,
        EIOBufferError_IOBuffer_OperationFailed  = 100,
        EIOBufferError_IOBuffer_InvalidHandle    = 101,
        EIOBufferError_IOBuffer_InvalidArgument  = 102,
        EIOBufferError_IOBuffer_PathExists       = 103,
        EIOBufferError_IOBuffer_PathDoesNotExist = 104,
        EIOBufferError_IOBuffer_Permission       = 105;

    /**
     * {@code EIOBufferMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EIOBufferMode_IOBufferMode_Read EIOBufferMode_IOBufferMode_Read}</li>
     * <li>{@link #EIOBufferMode_IOBufferMode_Write EIOBufferMode_IOBufferMode_Write}</li>
     * <li>{@link #EIOBufferMode_IOBufferMode_Create EIOBufferMode_IOBufferMode_Create}</li>
     * </ul>
     */
    public static final int
        EIOBufferMode_IOBufferMode_Read   = 1,
        EIOBufferMode_IOBufferMode_Write  = 2,
        EIOBufferMode_IOBufferMode_Create = 512;

    protected VR() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary OPENVR = Library.loadNative(VR.class, "org.lwjgl.openvr", Configuration.OPENVR_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("openvr_api")), true);

    /** Contains the function pointers loaded from the openvr {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitInternal                       = apiGetFunctionAddress(OPENVR, "VR_InitInternal"),
            ShutdownInternal                   = apiGetFunctionAddress(OPENVR, "VR_ShutdownInternal"),
            IsHmdPresent                       = apiGetFunctionAddress(OPENVR, "VR_IsHmdPresent"),
            GetGenericInterface                = apiGetFunctionAddress(OPENVR, "VR_GetGenericInterface"),
            IsRuntimeInstalled                 = apiGetFunctionAddress(OPENVR, "VR_IsRuntimeInstalled"),
            RuntimePath                        = apiGetFunctionAddress(OPENVR, "VR_RuntimePath"),
            IsInterfaceVersionValid            = apiGetFunctionAddress(OPENVR, "VR_IsInterfaceVersionValid"),
            GetInitToken                       = apiGetFunctionAddress(OPENVR, "VR_GetInitToken"),
            GetVRInitErrorAsSymbol             = apiGetFunctionAddress(OPENVR, "VR_GetVRInitErrorAsSymbol"),
            GetVRInitErrorAsEnglishDescription = apiGetFunctionAddress(OPENVR, "VR_GetVRInitErrorAsEnglishDescription");

    }

    /** Returns the openvr {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return OPENVR;
    }

    // --- [ VR_InitInternal ] ---

    /** Unsafe version of: {@link #VR_InitInternal InitInternal} */
    public static int nVR_InitInternal(long peError, int eType) {
        long __functionAddress = Functions.InitInternal;
        return invokePI(peError, eType, __functionAddress);
    }

    /**
     * Initializes the connection to the VR hardware.
     *
     * @param peError a buffer in which to store the error code
     * @param eType   the application type. One of:<br><table><tr><td>{@link #EVRApplicationType_VRApplication_Other}</td></tr><tr><td>{@link #EVRApplicationType_VRApplication_Scene}</td></tr><tr><td>{@link #EVRApplicationType_VRApplication_Overlay}</td></tr><tr><td>{@link #EVRApplicationType_VRApplication_Background}</td></tr><tr><td>{@link #EVRApplicationType_VRApplication_Utility}</td></tr><tr><td>{@link #EVRApplicationType_VRApplication_VRMonitor}</td></tr><tr><td>{@link #EVRApplicationType_VRApplication_SteamWatchdog}</td></tr><tr><td>{@link #EVRApplicationType_VRApplication_Bootstrapper}</td></tr><tr><td>{@link #EVRApplicationType_VRApplication_WebHelper}</td></tr><tr><td>{@link #EVRApplicationType_VRApplication_Max}</td></tr></table>
     *
     * @return a VR interface handles token
     */
    @NativeType("uint32_t")
    public static int VR_InitInternal(@NativeType("EVRInitError *") IntBuffer peError, @NativeType("EVRApplicationType") int eType) {
        if (CHECKS) {
            check(peError, 1);
        }
        return nVR_InitInternal(memAddress(peError), eType);
    }

    // --- [ VR_ShutdownInternal ] ---

    /**
     * Shuts down the connection to the VR hardware and cleans up the OpenVR API. The {@code IVRSystem} pointer returned by {@link #VR_InitInternal InitInternal} will be invalid
     * after this call is made.
     */
    public static void VR_ShutdownInternal() {
        long __functionAddress = Functions.ShutdownInternal;
        invokeV(__functionAddress);
    }

    // --- [ VR_IsHmdPresent ] ---

    /**
     * Returns true if the system believes that an HMD is present on the system. This function is much faster than initializing all of OpenVR just to check
     * for an HMD. Use it when you have a piece of UI that you want to enable only for users with an HMD.
     * 
     * <p>This function will return true in situations where {@link #VR_InitInternal InitInternal} will return {@code NULL}. It is a quick way to eliminate users that have no VR hardware,
     * but there are some startup conditions that can only be detected by starting the system.</p>
     */
    @NativeType("bool")
    public static boolean VR_IsHmdPresent() {
        long __functionAddress = Functions.IsHmdPresent;
        return invokeZ(__functionAddress);
    }

    // --- [ VR_GetGenericInterface ] ---

    /** Unsafe version of: {@link #VR_GetGenericInterface GetGenericInterface} */
    public static long nVR_GetGenericInterface(long pchInterfaceVersion, long peError) {
        long __functionAddress = Functions.GetGenericInterface;
        return invokePPP(pchInterfaceVersion, peError, __functionAddress);
    }

    /**
     * Requests an interface by name from OpenVR. It will return {@code NULL} and pass back an error in {@code peError} if the interface can't be found. It will
     * always return {@code NULL} if {@link #VR_InitInternal InitInternal} has not been called successfully.
     *
     * @param pchInterfaceVersion the interface name and version
     * @param peError             a buffer in which to store the error code
     */
    @NativeType("intptr_t")
    public static long VR_GetGenericInterface(@NativeType("char const *") ByteBuffer pchInterfaceVersion, @NativeType("EVRInitError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchInterfaceVersion);
            check(peError, 1);
        }
        return nVR_GetGenericInterface(memAddress(pchInterfaceVersion), memAddress(peError));
    }

    /**
     * Requests an interface by name from OpenVR. It will return {@code NULL} and pass back an error in {@code peError} if the interface can't be found. It will
     * always return {@code NULL} if {@link #VR_InitInternal InitInternal} has not been called successfully.
     *
     * @param pchInterfaceVersion the interface name and version
     * @param peError             a buffer in which to store the error code
     */
    @NativeType("intptr_t")
    public static long VR_GetGenericInterface(@NativeType("char const *") CharSequence pchInterfaceVersion, @NativeType("EVRInitError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchInterfaceVersion, true);
            long pchInterfaceVersionEncoded = stack.getPointerAddress();
            return nVR_GetGenericInterface(pchInterfaceVersionEncoded, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VR_IsRuntimeInstalled ] ---

    /** Returns true if the OpenVR runtime is installed on the system. */
    @NativeType("bool")
    public static boolean VR_IsRuntimeInstalled() {
        long __functionAddress = Functions.IsRuntimeInstalled;
        return invokeZ(__functionAddress);
    }

    // --- [ VR_RuntimePath ] ---

    /** Unsafe version of: {@link #VR_RuntimePath RuntimePath} */
    public static long nVR_RuntimePath() {
        long __functionAddress = Functions.RuntimePath;
        return invokeP(__functionAddress);
    }

    /** Returns where the OpenVR runtime is installed. */
    @Nullable
    @NativeType("char *")
    public static String VR_RuntimePath() {
        long __result = nVR_RuntimePath();
        return memASCIISafe(__result);
    }

    // --- [ VR_IsInterfaceVersionValid ] ---

    /** Unsafe version of: {@link #VR_IsInterfaceVersionValid IsInterfaceVersionValid} */
    public static boolean nVR_IsInterfaceVersionValid(long pchInterfaceVersion) {
        long __functionAddress = Functions.IsInterfaceVersionValid;
        return invokePZ(pchInterfaceVersion, __functionAddress);
    }

    /**
     * Returns whether the interface of the specified version exists.
     *
     * @param pchInterfaceVersion the interface name and version
     */
    @NativeType("bool")
    public static boolean VR_IsInterfaceVersionValid(@NativeType("char const *") ByteBuffer pchInterfaceVersion) {
        if (CHECKS) {
            checkNT1(pchInterfaceVersion);
        }
        return nVR_IsInterfaceVersionValid(memAddress(pchInterfaceVersion));
    }

    /**
     * Returns whether the interface of the specified version exists.
     *
     * @param pchInterfaceVersion the interface name and version
     */
    @NativeType("bool")
    public static boolean VR_IsInterfaceVersionValid(@NativeType("char const *") CharSequence pchInterfaceVersion) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchInterfaceVersion, true);
            long pchInterfaceVersionEncoded = stack.getPointerAddress();
            return nVR_IsInterfaceVersionValid(pchInterfaceVersionEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VR_GetInitToken ] ---

    /** Returns a token that represents whether the VR interface handles need to be reloaded. */
    @NativeType("uint32_t")
    public static int VR_GetInitToken() {
        long __functionAddress = Functions.GetInitToken;
        return invokeI(__functionAddress);
    }

    // --- [ VR_GetVRInitErrorAsSymbol ] ---

    /** Unsafe version of: {@link #VR_GetVRInitErrorAsSymbol GetVRInitErrorAsSymbol} */
    public static long nVR_GetVRInitErrorAsSymbol(int error) {
        long __functionAddress = Functions.GetVRInitErrorAsSymbol;
        return invokeP(error, __functionAddress);
    }

    /**
     * Returns the {@code EVRInitError} enum value as a string. It can be called any time, regardless of whether the VR system is started up.
     *
     * @param error the error code
     */
    @Nullable
    @NativeType("char const *")
    public static String VR_GetVRInitErrorAsSymbol(@NativeType("EVRInitError") int error) {
        long __result = nVR_GetVRInitErrorAsSymbol(error);
        return memASCIISafe(__result);
    }

    // --- [ VR_GetVRInitErrorAsEnglishDescription ] ---

    /** Unsafe version of: {@link #VR_GetVRInitErrorAsEnglishDescription GetVRInitErrorAsEnglishDescription} */
    public static long nVR_GetVRInitErrorAsEnglishDescription(int error) {
        long __functionAddress = Functions.GetVRInitErrorAsEnglishDescription;
        return invokeP(error, __functionAddress);
    }

    /**
     * Returns an english string for an {@code EVRInitError}.
     * 
     * <p>Applications should call {@link #VR_GetVRInitErrorAsSymbol GetVRInitErrorAsSymbol} instead and use that as a key to look up their own localized error message. This function may be
     * called outside of {@link #VR_InitInternal InitInternal} / {@link #VR_ShutdownInternal ShutdownInternal}.</p>
     *
     * @param error the error code
     */
    @Nullable
    @NativeType("char const *")
    public static String VR_GetVRInitErrorAsEnglishDescription(@NativeType("EVRInitError") int error) {
        long __result = nVR_GetVRInitErrorAsEnglishDescription(error);
        return memASCIISafe(__result);
    }

}