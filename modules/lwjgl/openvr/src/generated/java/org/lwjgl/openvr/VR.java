/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VR {

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

    public static final int
        k_nSteamVRVersionMajor = 2,
        k_nSteamVRVersionMinor = 5,
        k_nSteamVRVersionBuild = 1;

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
        k_unErrorPropertyTag             = 6,
        k_unDoublePropertyTag            = 7,
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
        k_unHeadsetViewMaxWidth          = 3840,
        k_unHeadsetViewMaxHeight         = 2160;

    public static final int k_unMaxActionNameLength = 64;

    public static final int k_unMaxActionSetNameLength = 64;

    public static final int k_unMaxActionOriginCount = 16;

    public static final int k_unMaxBoneNameLength = 32;

    public static final long
        k_ulInvalidPropertyContainer   = 0L,
        k_ulInvalidDriverHandle        = 0L,
        k_ulOverlayHandleInvalid       = 0L,
        k_ulInvalidActionHandle        = 0L,
        k_ulInvalidActionSetHandle     = 0L,
        k_ulInvalidInputValueHandle    = 0L,
        k_ulInvalidIOBufferHandle      = 0L,
        k_ulInvalidSpatialAnchorHandle = 0L,
        k_ulInvalidPathHandle          = 0L;

    public static final int
        k_unMaxPropertyStringSize                     = 32768,
        k_unMaxDistortionFunctionParameters           = 8,
        k_unControllerStateAxisCount                  = 5,
        k_unMaxApplicationKeyLength                   = 128,
        k_unVROverlayMaxKeyLength                     = 128,
        k_unVROverlayMaxNameLength                    = 128,
        k_unMaxOverlayCount                           = 128,
        k_unMaxOverlayIntersectionMaskPrimitivesCount = 32,
        k_unMaxSettingsKeyLength                      = 128;

    public static final String
        IVRSystem_Version                                              = "IVRSystem_022",
        IVRExtendedDisplay_Version                                     = "IVRExtendedDisplay_001",
        IVRTrackedCamera_Version                                       = "IVRTrackedCamera_006",
        k_pch_MimeType_HomeApp                                         = "vr/home",
        k_pch_MimeType_GameTheater                                     = "vr/game_theater",
        IVRApplications_Version                                        = "IVRApplications_007",
        IVRChaperone_Version                                           = "IVRChaperone_004",
        IVRChaperoneSetup_Version                                      = "IVRChaperoneSetup_006",
        IVRCompositor_Version                                          = "IVRCompositor_028",
        IVROverlay_Version                                             = "IVROverlay_027",
        IVROverlayView_Version                                         = "IVROverlayView_003",
        k_pchHeadsetViewOverlayKey                                     = "system.HeadsetView",
        IVRHeadsetView_Version                                         = "IVRHeadsetView_001",
        k_pch_Controller_Component_GDC2015                             = "gdc2015",
        k_pch_Controller_Component_Base                                = "base",
        k_pch_Controller_Component_Tip                                 = "tip",
        k_pch_Controller_Component_OpenXR_Aim                          = "openxr_aim",
        k_pch_Controller_Component_HandGrip                            = "handgrip",
        k_pch_Controller_Component_OpenXR_Grip                         = "openxr_grip",
        k_pch_Controller_Component_OpenXR_HandModel                    = "openxr_handmodel",
        k_pch_Controller_Component_Status                              = "status",
        IVRRenderModels_Version                                        = "IVRRenderModels_006",
        IVRNotifications_Version                                       = "IVRNotifications_002",
        IVRSettings_Version                                            = "IVRSettings_003",
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
        k_pch_SteamVR_TrackingLossColor_String                         = "trackingLossColor",
        k_pch_SteamVR_ShowStage_Bool                                   = "showStage",
        k_pch_SteamVR_DrawTrackingReferences_Bool                      = "drawTrackingReferences",
        k_pch_SteamVR_ActivateMultipleDrivers_Bool                     = "activateMultipleDrivers",
        k_pch_SteamVR_UsingSpeakers_Bool                               = "usingSpeakers",
        k_pch_SteamVR_SpeakersForwardYawOffsetDegrees_Float            = "speakersForwardYawOffsetDegrees",
        k_pch_SteamVR_BaseStationPowerManagement_Int32                 = "basestationPowerManagement",
        k_pch_SteamVR_ShowBaseStationPowerManagementTip_Int32          = "ShowBaseStationPowerManagementTip",
        k_pch_SteamVR_NeverKillProcesses_Bool                          = "neverKillProcesses",
        k_pch_SteamVR_SupersampleScale_Float                           = "supersampleScale",
        k_pch_SteamVR_MaxRecommendedResolution_Int32                   = "maxRecommendedResolution",
        k_pch_SteamVR_MotionSmoothing_Bool                             = "motionSmoothing",
        k_pch_SteamVR_MotionSmoothingOverride_Int32                    = "motionSmoothingOverride",
        k_pch_SteamVR_FramesToThrottle_Int32                           = "framesToThrottle",
        k_pch_SteamVR_AdditionalFramesToPredict_Int32                  = "additionalFramesToPredict",
        k_pch_SteamVR_WorldScale_Float                                 = "worldScale",
        k_pch_SteamVR_FovScale_Int32                                   = "fovScale",
        k_pch_SteamVR_FovScaleLetterboxed_Bool                         = "fovScaleLetterboxed",
        k_pch_SteamVR_DisableAsyncReprojection_Bool                    = "disableAsync",
        k_pch_SteamVR_ForceFadeOnBadTracking_Bool                      = "forceFadeOnBadTracking",
        k_pch_SteamVR_DefaultMirrorView_Int32                          = "mirrorView",
        k_pch_SteamVR_ShowLegacyMirrorView_Bool                        = "showLegacyMirrorView",
        k_pch_SteamVR_MirrorViewVisibility_Bool                        = "showMirrorView",
        k_pch_SteamVR_MirrorViewDisplayMode_Int32                      = "mirrorViewDisplayMode",
        k_pch_SteamVR_MirrorViewEye_Int32                              = "mirrorViewEye",
        k_pch_SteamVR_MirrorViewGeometry_String                        = "mirrorViewGeometry",
        k_pch_SteamVR_MirrorViewGeometryMaximized_String               = "mirrorViewGeometryMaximized",
        k_pch_SteamVR_PerfGraphVisibility_Bool                         = "showPerfGraph",
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
        k_pch_SteamVR_DebugInputBinding                                = "debugInputBinding",
        k_pch_SteamVR_DoNotFadeToGrid                                  = "doNotFadeToGrid",
        k_pch_SteamVR_EnableSharedResourceJournaling                   = "enableSharedResourceJournaling",
        k_pch_SteamVR_EnableSafeMode                                   = "enableSafeMode",
        k_pch_SteamVR_PreferredRefreshRate                             = "preferredRefreshRate",
        k_pch_SteamVR_LastVersionNotice                                = "lastVersionNotice",
        k_pch_SteamVR_LastVersionNoticeDate                            = "lastVersionNoticeDate",
        k_pch_SteamVR_HmdDisplayColorGainR_Float                       = "hmdDisplayColorGainR",
        k_pch_SteamVR_HmdDisplayColorGainG_Float                       = "hmdDisplayColorGainG",
        k_pch_SteamVR_HmdDisplayColorGainB_Float                       = "hmdDisplayColorGainB",
        k_pch_SteamVR_CustomIconStyle_String                           = "customIconStyle",
        k_pch_SteamVR_CustomOffIconStyle_String                        = "customOffIconStyle",
        k_pch_SteamVR_CustomIconForceUpdate_String                     = "customIconForceUpdate",
        k_pch_SteamVR_AllowGlobalActionSetPriority                     = "globalActionSetPriority",
        k_pch_SteamVR_OverlayRenderQuality                             = "overlayRenderQuality_2",
        k_pch_SteamVR_BlockOculusSDKOnOpenVRLaunchOption_Bool          = "blockOculusSDKOnOpenVRLaunchOption",
        k_pch_SteamVR_BlockOculusSDKOnAllLaunches_Bool                 = "blockOculusSDKOnAllLaunches",
        k_pch_SteamVR_HDCPLegacyCompatibility_Bool                     = "hdcp14legacyCompatibility",
        k_pch_SteamVR_DisplayPortTrainingMode_Int                      = "displayPortTrainingMode",
        k_pch_SteamVR_UsePrism_Bool                                    = "usePrism",
        k_pch_SteamVR_AllowFallbackMirrorWindowLinux_Bool              = "allowFallbackMirrorWindowLinux",
        k_pch_OpenXR_Section                                           = "openxr",
        k_pch_OpenXR_MetaUnityPluginCompatibility_Int32                = "metaUnityPluginCompatibility",
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
        k_pch_Lighthouse_InactivityTimeoutForBaseStations_Int32        = "InactivityTimeoutForBaseStations",
        k_pch_Lighthouse_EnableImuFallback_Bool                        = "enableImuFallback",
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
        k_pch_WindowsMR_Section                                        = "driver_holographic",
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
        k_pch_Perf_GPUProfiling_Bool                                   = "GPUProfiling",
        k_pch_Perf_GpuBusMonitoring_Bool                               = "gpuBusMonitoring",
        k_pch_CollisionBounds_Section                                  = "collisionBounds",
        k_pch_CollisionBounds_Style_Int32                              = "CollisionBoundsStyle",
        k_pch_CollisionBounds_GroundPerimeterOn_Bool                   = "CollisionBoundsGroundPerimeterOn",
        k_pch_CollisionBounds_CenterMarkerOn_Bool                      = "CollisionBoundsCenterMarkerOn",
        k_pch_CollisionBounds_PlaySpaceOn_Bool                         = "CollisionBoundsPlaySpaceOn",
        k_pch_CollisionBounds_FadeDistance_Float                       = "CollisionBoundsFadeDistance",
        k_pch_CollisionBounds_WallHeight_Float                         = "CollisionBoundsWallHeight",
        k_pch_CollisionBounds_ColorGammaR_Int32                        = "CollisionBoundsColorGammaR",
        k_pch_CollisionBounds_ColorGammaG_Int32                        = "CollisionBoundsColorGammaG",
        k_pch_CollisionBounds_ColorGammaB_Int32                        = "CollisionBoundsColorGammaB",
        k_pch_CollisionBounds_ColorGammaA_Int32                        = "CollisionBoundsColorGammaA",
        k_pch_CollisionBounds_EnableDriverImport                       = "enableDriverBoundsImport",
        k_pch_Camera_Section                                           = "camera",
        k_pch_Camera_EnableCamera_Bool                                 = "enableCamera",
        k_pch_Camera_ShowOnController_Bool                             = "showOnController",
        k_pch_Camera_EnableCameraForCollisionBounds_Bool               = "enableCameraForCollisionBounds",
        k_pch_Camera_RoomView_Int32                                    = "roomView",
        k_pch_Camera_BoundsColorGammaR_Int32                           = "cameraBoundsColorGammaR",
        k_pch_Camera_BoundsColorGammaG_Int32                           = "cameraBoundsColorGammaG",
        k_pch_Camera_BoundsColorGammaB_Int32                           = "cameraBoundsColorGammaB",
        k_pch_Camera_BoundsColorGammaA_Int32                           = "cameraBoundsColorGammaA",
        k_pch_Camera_BoundsStrength_Int32                              = "cameraBoundsStrength",
        k_pch_Camera_RoomViewStyle_Int32                               = "roomViewStyle",
        k_pch_audio_Section                                            = "audio",
        k_pch_audio_SetOsDefaultPlaybackDevice_Bool                    = "setOsDefaultPlaybackDevice",
        k_pch_audio_EnablePlaybackDeviceOverride_Bool                  = "enablePlaybackDeviceOverride",
        k_pch_audio_PlaybackDeviceOverride_String                      = "playbackDeviceOverride",
        k_pch_audio_PlaybackDeviceOverrideName_String                  = "playbackDeviceOverrideName",
        k_pch_audio_SetOsDefaultRecordingDevice_Bool                   = "setOsDefaultRecordingDevice",
        k_pch_audio_EnableRecordingDeviceOverride_Bool                 = "enableRecordingDeviceOverride",
        k_pch_audio_RecordingDeviceOverride_String                     = "recordingDeviceOverride",
        k_pch_audio_RecordingDeviceOverrideName_String                 = "recordingDeviceOverrideName",
        k_pch_audio_EnablePlaybackMirror_Bool                          = "enablePlaybackMirror",
        k_pch_audio_PlaybackMirrorDevice_String                        = "playbackMirrorDevice",
        k_pch_audio_PlaybackMirrorDeviceName_String                    = "playbackMirrorDeviceName",
        k_pch_audio_OldPlaybackMirrorDevice_String                     = "onPlaybackMirrorDevice",
        k_pch_audio_ActiveMirrorDevice_String                          = "activePlaybackMirrorDevice",
        k_pch_audio_EnablePlaybackMirrorIndependentVolume_Bool         = "enablePlaybackMirrorIndependentVolume",
        k_pch_audio_LastHmdPlaybackDeviceId_String                     = "lastHmdPlaybackDeviceId",
        k_pch_audio_VIVEHDMIGain                                       = "viveHDMIGain",
        k_pch_audio_DualSpeakerAndJackOutput_Bool                      = "dualSpeakerAndJackOutput",
        k_pch_audio_MuteMicMonitor_Bool                                = "muteMicMonitor",
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
        k_pch_Dashboard_Position                                       = "position",
        k_pch_Dashboard_DesktopScale                                   = "desktopScale",
        k_pch_Dashboard_DashboardScale                                 = "dashboardScale",
        k_pch_Dashboard_UseStandaloneSystemLayer                       = "standaloneSystemLayer",
        k_pch_Dashboard_StickyDashboard                                = "stickyDashboard",
        k_pch_Dashboard_AllowSteamOverlays_Bool                        = "allowSteamOverlays",
        k_pch_Dashboard_AllowVRGamepadUI_Bool                          = "allowVRGamepadUI",
        k_pch_Dashboard_AllowVRGamepadUIViaGamescope_Bool              = "allowVRGamepadUIViaGamescope",
        k_pch_Dashboard_SteamMatchesHMDFramerate                       = "steamMatchesHMDFramerate",
        k_pch_modelskin_Section                                        = "modelskins",
        k_pch_Driver_Enable_Bool                                       = "enable",
        k_pch_Driver_BlockedBySafemode_Bool                            = "blocked_by_safe_mode",
        k_pch_Driver_LoadPriority_Int32                                = "loadPriority",
        k_pch_WebInterface_Section                                     = "WebInterface",
        k_pch_VRWebHelper_Section                                      = "VRWebHelper",
        k_pch_VRWebHelper_DebuggerEnabled_Bool                         = "DebuggerEnabled",
        k_pch_VRWebHelper_DebuggerPort_Int32                           = "DebuggerPort",
        k_pch_TrackingOverride_Section                                 = "TrackingOverrides",
        k_pch_App_BindingAutosaveURLSuffix_String                      = "AutosaveURL",
        k_pch_App_BindingLegacyAPISuffix_String                        = "_legacy",
        k_pch_App_BindingSteamVRInputAPISuffix_String                  = "_steamvrinput",
        k_pch_App_BindingOpenXRAPISuffix_String                        = "_openxr",
        k_pch_App_BindingCurrentURLSuffix_String                       = "CurrentURL",
        k_pch_App_BindingPreviousURLSuffix_String                      = "PreviousURL",
        k_pch_App_NeedToUpdateAutosaveSuffix_Bool                      = "NeedToUpdateAutosave",
        k_pch_App_DominantHand_Int32                                   = "DominantHand",
        k_pch_App_BlockOculusSDK_Bool                                  = "blockOculusSDK",
        k_pch_Trackers_Section                                         = "trackers",
        k_pch_DesktopUI_Section                                        = "DesktopUI",
        k_pch_LastKnown_Section                                        = "LastKnown",
        k_pch_LastKnown_HMDManufacturer_String                         = "HMDManufacturer",
        k_pch_LastKnown_HMDModel_String                                = "HMDModel",
        k_pch_LastKnown_ActualHMDDriver_String                         = "ActualHMDDriver",
        k_pch_DismissedWarnings_Section                                = "DismissedWarnings",
        k_pch_Input_Section                                            = "input",
        k_pch_Input_LeftThumbstickRotation_Float                       = "leftThumbstickRotation",
        k_pch_Input_RightThumbstickRotation_Float                      = "rightThumbstickRotation",
        k_pch_Input_ThumbstickDeadzone_Float                           = "thumbstickDeadzone",
        k_pch_GpuSpeed_Section                                         = "GpuSpeed",
        IVRScreenshots_Version                                         = "IVRScreenshots_001",
        IVRResources_Version                                           = "IVRResources_001",
        IVRDriverManager_Version                                       = "IVRDriverManager_001",
        IVRInput_Version                                               = "IVRInput_010",
        IVRIOBuffer_Version                                            = "IVRIOBuffer_002",
        IVRSpatialAnchors_Version                                      = "IVRSpatialAnchors_001",
        IVRDebug_Version                                               = "IVRDebug_001",
        IVRProperties_Version                                          = "IVRProperties_001",
        k_pchPathUserHandRight                                         = "/user/hand/right",
        k_pchPathUserHandLeft                                          = "/user/hand/left",
        k_pchPathUserHandPrimary                                       = "/user/hand/primary",
        k_pchPathUserHandSecondary                                     = "/user/hand/secondary",
        k_pchPathUserHead                                              = "/user/head",
        k_pchPathUserGamepad                                           = "/user/gamepad",
        k_pchPathUserTreadmill                                         = "/user/treadmill",
        k_pchPathUserStylus                                            = "/user/stylus",
        k_pchPathDevices                                               = "/devices",
        k_pchPathDevicePath                                            = "/device_path",
        k_pchPathBestAliasPath                                         = "/best_alias_path",
        k_pchPathBoundTrackerAliasPath                                 = "/bound_tracker_path",
        k_pchPathBoundTrackerRole                                      = "/bound_tracker_role",
        k_pchPathPoseRaw                                               = "/pose/raw",
        k_pchPathPoseTip                                               = "/pose/tip",
        k_pchPathPoseGrip                                              = "/pose/grip",
        k_pchPathSystemButtonClick                                     = "/input/system/click",
        k_pchPathProximity                                             = "/proximity",
        k_pchPathControllerTypePrefix                                  = "/controller_type/",
        k_pchPathInputProfileSuffix                                    = "/input_profile",
        k_pchPathBindingNameSuffix                                     = "/binding_name",
        k_pchPathBindingUrlSuffix                                      = "/binding_url",
        k_pchPathBindingErrorSuffix                                    = "/binding_error",
        k_pchPathActiveActionSets                                      = "/active_action_sets",
        k_pchPathComponentUpdates                                      = "/total_component_updates",
        k_pchPathUserFootLeft                                          = "/user/foot/left",
        k_pchPathUserFootRight                                         = "/user/foot/right",
        k_pchPathUserShoulderLeft                                      = "/user/shoulder/left",
        k_pchPathUserShoulderRight                                     = "/user/shoulder/right",
        k_pchPathUserElbowLeft                                         = "/user/elbow/left",
        k_pchPathUserElbowRight                                        = "/user/elbow/right",
        k_pchPathUserKneeLeft                                          = "/user/knee/left",
        k_pchPathUserKneeRight                                         = "/user/knee/right",
        k_pchPathUserWristLeft                                         = "/user/wrist/left",
        k_pchPathUserWristRight                                        = "/user/wrist/right",
        k_pchPathUserAnkleLeft                                         = "/user/ankle/left",
        k_pchPathUserAnkleRight                                        = "/user/ankle/right",
        k_pchPathUserWaist                                             = "/user/waist",
        k_pchPathUserChest                                             = "/user/chest",
        k_pchPathUserCamera                                            = "/user/camera",
        k_pchPathUserKeyboard                                          = "/user/keyboard",
        k_pchPathClientAppKey                                          = "/client_info/app_key",
        IVRPaths_Version                                               = "IVRPaths_001",
        IVRBlockQueue_Version                                          = "IVRBlockQueue_005";

    public static final long k_ulDisplayRedirectContainer = 25769803779L;

    public static final int
        EVREye_Eye_Left  = 0,
        EVREye_Eye_Right = 1;

    public static final int
        ETextureType_TextureType_Invalid          = -1,
        ETextureType_TextureType_DirectX          = 0,
        ETextureType_TextureType_OpenGL           = 1,
        ETextureType_TextureType_Vulkan           = 2,
        ETextureType_TextureType_IOSurface        = 3,
        ETextureType_TextureType_DirectX12        = 4,
        ETextureType_TextureType_DXGISharedHandle = 5,
        ETextureType_TextureType_Metal            = 6,
        ETextureType_TextureType_Reserved         = 7;

    public static final int
        EColorSpace_ColorSpace_Auto   = 0,
        EColorSpace_ColorSpace_Gamma  = 1,
        EColorSpace_ColorSpace_Linear = 2;

    public static final int
        ETrackingResult_TrackingResult_Uninitialized          = 1,
        ETrackingResult_TrackingResult_Calibrating_InProgress = 100,
        ETrackingResult_TrackingResult_Calibrating_OutOfRange = 101,
        ETrackingResult_TrackingResult_Running_OK             = 200,
        ETrackingResult_TrackingResult_Running_OutOfRange     = 201,
        ETrackingResult_TrackingResult_Fallback_RotationOnly  = 300;

    public static final int
        ETrackedDeviceClass_TrackedDeviceClass_Invalid           = 0,
        ETrackedDeviceClass_TrackedDeviceClass_HMD               = 1,
        ETrackedDeviceClass_TrackedDeviceClass_Controller        = 2,
        ETrackedDeviceClass_TrackedDeviceClass_GenericTracker    = 3,
        ETrackedDeviceClass_TrackedDeviceClass_TrackingReference = 4,
        ETrackedDeviceClass_TrackedDeviceClass_DisplayRedirect   = 5,
        ETrackedDeviceClass_TrackedDeviceClass_Max               = 6;

    public static final int
        ETrackedControllerRole_TrackedControllerRole_Invalid   = 0,
        ETrackedControllerRole_TrackedControllerRole_LeftHand  = 1,
        ETrackedControllerRole_TrackedControllerRole_RightHand = 2,
        ETrackedControllerRole_TrackedControllerRole_OptOut    = 3,
        ETrackedControllerRole_TrackedControllerRole_Treadmill = 4,
        ETrackedControllerRole_TrackedControllerRole_Stylus    = 5,
        ETrackedControllerRole_TrackedControllerRole_Max       = 6;

    public static final int
        ETrackingUniverseOrigin_TrackingUniverseSeated             = 0,
        ETrackingUniverseOrigin_TrackingUniverseStanding           = 1,
        ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated = 2;

    public static final int
        EAdditionalRadioFeatures_AdditionalRadioFeatures_None           = 0,
        EAdditionalRadioFeatures_AdditionalRadioFeatures_HTCLinkBox     = 1,
        EAdditionalRadioFeatures_AdditionalRadioFeatures_InternalDongle = 2,
        EAdditionalRadioFeatures_AdditionalRadioFeatures_ExternalDongle = 4;

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
        ETrackedDeviceProperty_Prop_Firmware_RemindUpdate_Bool                     = 1047,
        ETrackedDeviceProperty_Prop_PeripheralApplicationVersion_Uint64            = 1048,
        ETrackedDeviceProperty_Prop_ManufacturerSerialNumber_String                = 1049,
        ETrackedDeviceProperty_Prop_ComputedSerialNumber_String                    = 1050,
        ETrackedDeviceProperty_Prop_EstimatedDeviceFirstUseTime_Int32              = 1051,
        ETrackedDeviceProperty_Prop_DevicePowerUsage_Float                         = 1052,
        ETrackedDeviceProperty_Prop_IgnoreMotionForStandby_Bool                    = 1053,
        ETrackedDeviceProperty_Prop_ActualTrackingSystemName_String                = 1054,
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
        ETrackedDeviceProperty_Prop_HmdTrackingStyle_Int32                         = 2075,
        ETrackedDeviceProperty_Prop_DriverProvidedChaperoneVisibility_Bool         = 2076,
        ETrackedDeviceProperty_Prop_HmdColumnCorrectionSettingPrefix_String        = 2077,
        ETrackedDeviceProperty_Prop_CameraSupportsCompatibilityModes_Bool          = 2078,
        ETrackedDeviceProperty_Prop_SupportsRoomViewDepthProjection_Bool           = 2079,
        ETrackedDeviceProperty_Prop_DisplayAvailableFrameRates_Float_Array         = 0x820,
        ETrackedDeviceProperty_Prop_DisplaySupportsMultipleFramerates_Bool         = 0x821,
        ETrackedDeviceProperty_Prop_DisplayColorMultLeft_Vector3                   = 0x822,
        ETrackedDeviceProperty_Prop_DisplayColorMultRight_Vector3                  = 0x823,
        ETrackedDeviceProperty_Prop_DisplaySupportsRuntimeFramerateChange_Bool     = 0x824,
        ETrackedDeviceProperty_Prop_DisplaySupportsAnalogGain_Bool                 = 0x825,
        ETrackedDeviceProperty_Prop_DisplayMinAnalogGain_Float                     = 0x826,
        ETrackedDeviceProperty_Prop_DisplayMaxAnalogGain_Float                     = 0x827,
        ETrackedDeviceProperty_Prop_CameraExposureTime_Float                       = 0x828,
        ETrackedDeviceProperty_Prop_CameraGlobalGain_Float                         = 0x829,
        ETrackedDeviceProperty_Prop_DashboardScale_Float                           = 2091,
        ETrackedDeviceProperty_Prop_PeerButtonInfo_String                          = 2092,
        ETrackedDeviceProperty_Prop_Hmd_SupportsHDR10_Bool                         = 2093,
        ETrackedDeviceProperty_Prop_Hmd_EnableParallelRenderCameras_Bool           = 2094,
        ETrackedDeviceProperty_Prop_DriverProvidedChaperoneJson_String             = 2095,
        ETrackedDeviceProperty_Prop_ForceSystemLayerUseAppPoses_Bool               = 2096,
        ETrackedDeviceProperty_Prop_IpdUIRangeMinMeters_Float                      = 2100,
        ETrackedDeviceProperty_Prop_IpdUIRangeMaxMeters_Float                      = 2101,
        ETrackedDeviceProperty_Prop_Hmd_SupportsHDCP14LegacyCompat_Bool            = 2102,
        ETrackedDeviceProperty_Prop_Hmd_SupportsMicMonitoring_Bool                 = 2103,
        ETrackedDeviceProperty_Prop_Hmd_SupportsDisplayPortTrainingMode_Bool       = 2104,
        ETrackedDeviceProperty_Prop_Hmd_SupportsRoomViewDirect_Bool                = 2105,
        ETrackedDeviceProperty_Prop_Hmd_SupportsAppThrottling_Bool                 = 2106,
        ETrackedDeviceProperty_Prop_Hmd_SupportsGpuBusMonitoring_Bool              = 2107,
        ETrackedDeviceProperty_Prop_DriverDisplaysIPDChanges_Bool                  = 2108,
        ETrackedDeviceProperty_Prop_Driver_Reserved_01                             = 2109,
        ETrackedDeviceProperty_Prop_DSCVersion_Int32                               = 2110,
        ETrackedDeviceProperty_Prop_DSCSliceCount_Int32                            = 2111,
        ETrackedDeviceProperty_Prop_DSCBPPx16_Int32                                = 2112,
        ETrackedDeviceProperty_Prop_Hmd_MaxDistortedTextureWidth_Int32             = 2113,
        ETrackedDeviceProperty_Prop_Hmd_MaxDistortedTextureHeight_Int32            = 2114,
        ETrackedDeviceProperty_Prop_Hmd_AllowSupersampleFiltering_Bool             = 2115,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraCorrectionMode_Int32        = 2200,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerLeft_Int32     = 2201,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerRight_Int32    = 2202,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerTop_Int32      = 2203,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerBottom_Int32   = 2204,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterLeft_Int32     = 2205,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterRight_Int32    = 2206,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterTop_Int32      = 2207,
        ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterBottom_Int32   = 2208,
        ETrackedDeviceProperty_Prop_Audio_DefaultPlaybackDeviceId_String           = 2300,
        ETrackedDeviceProperty_Prop_Audio_DefaultRecordingDeviceId_String          = 2301,
        ETrackedDeviceProperty_Prop_Audio_DefaultPlaybackDeviceVolume_Float        = 2302,
        ETrackedDeviceProperty_Prop_Audio_SupportsDualSpeakerAndJackOutput_Bool    = 2303,
        ETrackedDeviceProperty_Prop_Audio_DriverManagesPlaybackVolumeControl_Bool  = 2304,
        ETrackedDeviceProperty_Prop_Audio_DriverPlaybackVolume_Float               = 2305,
        ETrackedDeviceProperty_Prop_Audio_DriverPlaybackMute_Bool                  = 2306,
        ETrackedDeviceProperty_Prop_Audio_DriverManagesRecordingVolumeControl_Bool = 2307,
        ETrackedDeviceProperty_Prop_Audio_DriverRecordingVolume_Float              = 2308,
        ETrackedDeviceProperty_Prop_Audio_DriverRecordingMute_Bool                 = 2309,
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
        ETrackedDeviceProperty_Prop_NamedIconPathDeviceStandbyAlert_String         = 5009,
        ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_Start                 = 5100,
        ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_End                   = 5150,
        ETrackedDeviceProperty_Prop_ParentContainer                                = 5151,
        ETrackedDeviceProperty_Prop_OverrideContainer_Uint64                       = 5152,
        ETrackedDeviceProperty_Prop_UserConfigPath_String                          = 6000,
        ETrackedDeviceProperty_Prop_InstallPath_String                             = 6001,
        ETrackedDeviceProperty_Prop_HasDisplayComponent_Bool                       = 6002,
        ETrackedDeviceProperty_Prop_HasControllerComponent_Bool                    = 6003,
        ETrackedDeviceProperty_Prop_HasCameraComponent_Bool                        = 6004,
        ETrackedDeviceProperty_Prop_HasDriverDirectModeComponent_Bool              = 6005,
        ETrackedDeviceProperty_Prop_HasVirtualDisplayComponent_Bool                = 6006,
        ETrackedDeviceProperty_Prop_HasSpatialAnchorsSupport_Bool                  = 6007,
        ETrackedDeviceProperty_Prop_SupportsXrTextureSets_Bool                     = 6008,
        ETrackedDeviceProperty_Prop_ControllerType_String                          = 7000,
        ETrackedDeviceProperty_Prop_ControllerHandSelectionPriority_Int32          = 7002,
        ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_Start                  = 10000,
        ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_End                    = 10999,
        ETrackedDeviceProperty_Prop_TrackedDeviceProperty_Max                      = 1000000;

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
        ETrackedPropertyError_TrackedProp_IPCReadFailure             = 13,
        ETrackedPropertyError_TrackedProp_OutOfMemory                = 14,
        ETrackedPropertyError_TrackedProp_InvalidContainer           = 15;

    public static final int
        EHmdTrackingStyle_HmdTrackingStyle_Unknown          = 0,
        EHmdTrackingStyle_HmdTrackingStyle_Lighthouse       = 1,
        EHmdTrackingStyle_HmdTrackingStyle_OutsideInCameras = 2,
        EHmdTrackingStyle_HmdTrackingStyle_InsideOutCameras = 3;

    public static final int
        EVRSubmitFlags_Submit_Default                      = 0x00,
        EVRSubmitFlags_Submit_LensDistortionAlreadyApplied = 0x01,
        EVRSubmitFlags_Submit_GlRenderBuffer               = 0x02,
        EVRSubmitFlags_Submit_Reserved                     = 0x04,
        EVRSubmit_TextureWithPose                          = 0x08,
        EVRSubmitFlags_Submit_TextureWithDepth             = 0x10,
        EVRSubmitFlags_Submit_FrameDiscontinuty            = 0x20,
        EVRSubmitFlags_Submit_VulkanTextureWithArrayData   = 0x40,
        EVRSubmitFlags_Submit_GlArrayTexture               = 0x80,
        EVRSubmitFlags_Submit_IsEgl                        = 0x100,
        EVRSubmitFlags_Submit_Reserved2                    = 0x08000,
        EVRSubmitFlags_Submit_Reserved3                    = 0x10000;

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
        EVREventType_VREvent_Reserved_01                               = 114,
        EVREventType_VREvent_Reserved_02                               = 115,
        EVREventType_VREvent_ButtonPress                               = 200,
        EVREventType_VREvent_ButtonUnpress                             = 201,
        EVREventType_VREvent_ButtonTouch                               = 202,
        EVREventType_VREvent_ButtonUntouch                             = 203,
        EVREventType_VREvent_Modal_Cancel                              = 257,
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
        EVREventType_VREvent_LockMousePosition                         = 310,
        EVREventType_VREvent_UnlockMousePosition                       = 311,
        EVREventType_VREvent_InputFocusCaptured                        = 400,
        EVREventType_VREvent_InputFocusReleased                        = 401,
        EVREventType_VREvent_SceneApplicationChanged                   = 404,
        EVREventType_VREvent_InputFocusChanged                         = 406,
        EVREventType_VREvent_SceneApplicationUsingWrongGraphicsAdapter = 408,
        EVREventType_VREvent_ActionBindingReloaded                     = 409,
        EVREventType_VREvent_HideRenderModels                          = 410,
        EVREventType_VREvent_ShowRenderModels                          = 411,
        EVREventType_VREvent_SceneApplicationStateChanged              = 412,
        EVREventType_VREvent_SceneAppPipeDisconnected                  = 413,
        EVREventType_VREvent_ConsoleOpened                             = 420,
        EVREventType_VREvent_ConsoleClosed                             = 421,
        EVREventType_VREvent_OverlayShown                              = 500,
        EVREventType_VREvent_OverlayHidden                             = 501,
        EVREventType_VREvent_DashboardActivated                        = 502,
        EVREventType_VREvent_DashboardDeactivated                      = 503,
        EVREventType_VREvent_DashboardRequested                        = 504,
        EVREventType_VREvent_ResetDashboard                            = 505,
        EVREventType_VREvent_ImageLoaded                               = 508,
        EVREventType_VREvent_ShowKeyboard                              = 509,
        EVREventType_VREvent_HideKeyboard                              = 510,
        EVREventType_VREvent_OverlayGamepadFocusGained                 = 511,
        EVREventType_VREvent_OverlayGamepadFocusLost                   = 512,
        EVREventType_VREvent_OverlaySharedTextureChanged               = 513,
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
        EVREventType_VREvent_DesktopViewUpdating                       = 530,
        EVREventType_VREvent_DesktopViewReady                          = 531,
        EVREventType_VREvent_StartDashboard                            = 532,
        EVREventType_VREvent_ElevatePrism                              = 533,
        EVREventType_VREvent_OverlayClosed                             = 534,
        EVREventType_VREvent_DashboardThumbChanged                     = 535,
        EVREventType_VREvent_DesktopMightBeVisible                     = 536,
        EVREventType_VREvent_DesktopMightBeHidden                      = 537,
        EVREventType_VREvent_MutualSteamCapabilitiesChanged            = 538,
        EVREventType_VREvent_OverlayCreated                            = 539,
        EVREventType_VREvent_OverlayDestroyed                          = 540,
        EVREventType_VREvent_Notification_Shown                        = 600,
        EVREventType_VREvent_Notification_Hidden                       = 601,
        EVREventType_VREvent_Notification_BeginInteraction             = 602,
        EVREventType_VREvent_Notification_Destroyed                    = 603,
        EVREventType_VREvent_Quit                                      = 700,
        EVREventType_VREvent_ProcessQuit                               = 701,
        EVREventType_VREvent_QuitAcknowledged                          = 703,
        EVREventType_VREvent_DriverRequestedQuit                       = 704,
        EVREventType_VREvent_RestartRequested                          = 705,
        EVREventType_VREvent_InvalidateSwapTextureSets                 = 706,
        EVREventType_VREvent_ChaperoneDataHasChanged                   = 800,
        EVREventType_VREvent_ChaperoneUniverseHasChanged               = 801,
        EVREventType_VREvent_ChaperoneTempDataHasChanged               = 802,
        EVREventType_VREvent_ChaperoneSettingsHaveChanged              = 803,
        EVREventType_VREvent_SeatedZeroPoseReset                       = 804,
        EVREventType_VREvent_ChaperoneFlushCache                       = 805,
        EVREventType_VREvent_ChaperoneRoomSetupStarting                = 806,
        EVREventType_VREvent_ChaperoneRoomSetupFinished                = 807,
        EVREventType_VREvent_StandingZeroPoseReset                     = 808,
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
        EVREventType_VREvent_GpuSpeedSectionSettingChanged             = 869,
        EVREventType_VREvent_WindowsMRSectionSettingChanged            = 870,
        EVREventType_VREvent_OtherSectionSettingChanged                = 871,
        EVREventType_VREvent_AnyDriverSettingsChanged                  = 872,
        EVREventType_VREvent_StatusUpdate                              = 900,
        EVREventType_VREvent_WebInterface_InstallDriverCompleted       = 950,
        EVREventType_VREvent_MCImageUpdated                            = 1000,
        EVREventType_VREvent_FirmwareUpdateStarted                     = 1100,
        EVREventType_VREvent_FirmwareUpdateFinished                    = 1101,
        EVREventType_VREvent_KeyboardClosed                            = 1200,
        EVREventType_VREvent_KeyboardCharInput                         = 1201,
        EVREventType_VREvent_KeyboardDone                              = 1202,
        EVREventType_VREvent_KeyboardOpened_Global                     = 1203,
        EVREventType_VREvent_KeyboardClosed_Global                     = 1204,
        EVREventType_VREvent_ApplicationListUpdated                    = 1303,
        EVREventType_VREvent_ApplicationMimeTypeLoad                   = 1304,
        EVREventType_VREvent_ProcessConnected                          = 1306,
        EVREventType_VREvent_ProcessDisconnected                       = 1307,
        EVREventType_VREvent_Compositor_ChaperoneBoundsShown           = 1410,
        EVREventType_VREvent_Compositor_ChaperoneBoundsHidden          = 1411,
        EVREventType_VREvent_Compositor_DisplayDisconnected            = 1412,
        EVREventType_VREvent_Compositor_DisplayReconnected             = 1413,
        EVREventType_VREvent_Compositor_HDCPError                      = 1414,
        EVREventType_VREvent_Compositor_ApplicationNotResponding       = 1415,
        EVREventType_VREvent_Compositor_ApplicationResumed             = 1416,
        EVREventType_VREvent_Compositor_OutOfVideoMemory               = 1417,
        EVREventType_VREvent_Compositor_DisplayModeNotSupported        = 1418,
        EVREventType_VREvent_Compositor_StageOverrideReady             = 1419,
        EVREventType_VREvent_Compositor_RequestDisconnectReconnect     = 1420,
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
        EVREventType_VREvent_Input_BindingSubscriptionChanged          = 1708,
        EVREventType_VREvent_SpatialAnchors_PoseUpdated                = 1800,
        EVREventType_VREvent_SpatialAnchors_DescriptorUpdated          = 1801,
        EVREventType_VREvent_SpatialAnchors_RequestPoseUpdate          = 1802,
        EVREventType_VREvent_SpatialAnchors_RequestDescriptorUpdate    = 1803,
        EVREventType_VREvent_SystemReport_Started                      = 1900,
        EVREventType_VREvent_Monitor_ShowHeadsetView                   = 2000,
        EVREventType_VREvent_Monitor_HideHeadsetView                   = 2001,
        EVREventType_VREvent_Audio_SetSpeakersVolume                   = 2100,
        EVREventType_VREvent_Audio_SetSpeakersMute                     = 2101,
        EVREventType_VREvent_Audio_SetMicrophoneVolume                 = 2102,
        EVREventType_VREvent_Audio_SetMicrophoneMute                   = 2103,
        EVREventType_VREvent_VendorSpecific_Reserved_Start             = 10000,
        EVREventType_VREvent_VendorSpecific_Reserved_End               = 19999;

    public static final int
        EDeviceActivityLevel_k_EDeviceActivityLevel_Unknown                 = -1,
        EDeviceActivityLevel_k_EDeviceActivityLevel_Idle                    = 0,
        EDeviceActivityLevel_k_EDeviceActivityLevel_UserInteraction         = 1,
        EDeviceActivityLevel_k_EDeviceActivityLevel_UserInteraction_Timeout = 2,
        EDeviceActivityLevel_k_EDeviceActivityLevel_Standby                 = 3,
        EDeviceActivityLevel_k_EDeviceActivityLevel_Idle_Timeout            = 4;

    public static final int
        EVRButtonId_k_EButton_System                   = 0,
        EVRButtonId_k_EButton_ApplicationMenu          = 1,
        EVRButtonId_k_EButton_Grip                     = 2,
        EVRButtonId_k_EButton_DPad_Left                = 3,
        EVRButtonId_k_EButton_DPad_Up                  = 4,
        EVRButtonId_k_EButton_DPad_Right               = 5,
        EVRButtonId_k_EButton_DPad_Down                = 6,
        EVRButtonId_k_EButton_A                        = 7,
        EVRButtonId_k_EButton_ProximitySensor          = 31,
        EVRButtonId_k_EButton_Axis0                    = 32,
        EVRButtonId_k_EButton_Axis1                    = 33,
        EVRButtonId_k_EButton_Axis2                    = 34,
        EVRButtonId_k_EButton_Axis3                    = 35,
        EVRButtonId_k_EButton_Axis4                    = 36,
        EVRButtonId_k_EButton_SteamVR_Touchpad         = EVRButtonId_k_EButton_Axis0,
        EVRButtonId_k_EButton_SteamVR_Trigger          = EVRButtonId_k_EButton_Axis1,
        EVRButtonId_k_EButton_Dashboard_Back           = EVRButtonId_k_EButton_Grip,
        EVRButtonId_k_EButton_IndexController_A        = EVRButtonId_k_EButton_Grip,
        EVRButtonId_k_EButton_IndexController_B        = EVRButtonId_k_EButton_ApplicationMenu,
        EVRButtonId_k_EButton_IndexController_JoyStick = EVRButtonId_k_EButton_Axis3,
        EVRButtonId_k_EButton_Reserved0                = 50,
        EVRButtonId_k_EButton_Reserved1                = 51,
        EVRButtonId_k_EButton_Max                      = 64;

    public static final int
        EVRMouseButton_VRMouseButton_Left   = 1,
        EVRMouseButton_VRMouseButton_Right  = 2,
        EVRMouseButton_VRMouseButton_Middle = 4;

    public static final int
        EShowUIType_ShowUI_ControllerBinding     = 0,
        EShowUIType_ShowUI_ManageTrackers        = 1,
        EShowUIType_ShowUI_Pairing               = 3,
        EShowUIType_ShowUI_Settings              = 4,
        EShowUIType_ShowUI_DebugCommands         = 5,
        EShowUIType_ShowUI_FullControllerBinding = 6,
        EShowUIType_ShowUI_ManageDrivers         = 7;

    public static final int
        EVRComponentProperty_VRComponentProperty_IsStatic   = 1,
        EVRComponentProperty_VRComponentProperty_IsVisible  = 2,
        EVRComponentProperty_VRComponentProperty_IsTouched  = 4,
        EVRComponentProperty_VRComponentProperty_IsPressed  = 8,
        EVRComponentProperty_VRComponentProperty_IsScrolled = 16;

    public static final int
        EHDCPError_HDCPError_None          = 0,
        EHDCPError_HDCPError_LinkLost      = 1,
        EHDCPError_HDCPError_Tampered      = 2,
        EHDCPError_HDCPError_DeviceRevoked = 3,
        EHDCPError_HDCPError_Unknown       = 4;

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
        EVRInputError_VRInputError_InvalidBoneIndex         = 17,
        EVRInputError_VRInputError_InvalidPriority          = 18,
        EVRInputError_VRInputError_PermissionDenied         = 19,
        EVRInputError_VRInputError_InvalidRenderModel       = 20;

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

    public static final int
        EHiddenAreaMeshType_k_eHiddenAreaMesh_Standard = 0,
        EHiddenAreaMeshType_k_eHiddenAreaMesh_Inverse  = 1,
        EHiddenAreaMeshType_k_eHiddenAreaMesh_LineLoop = 2,
        EHiddenAreaMeshType_k_eHiddenAreaMesh_Max      = 3;

    public static final int
        EVRControllerAxisType_k_eControllerAxis_None     = 0,
        EVRControllerAxisType_k_eControllerAxis_TrackPad = 1,
        EVRControllerAxisType_k_eControllerAxis_Joystick = 2,
        EVRControllerAxisType_k_eControllerAxis_Trigger  = 3;

    public static final int
        EVRControllerEventOutputType_ControllerEventOutput_OSEvents = 0,
        EVRControllerEventOutputType_ControllerEventOutput_VREvents = 1;

    public static final int
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_BEGINNER     = 0,
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_INTERMEDIATE = 1,
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_SQUARES      = 2,
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_ADVANCED     = 3,
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_NONE         = 4,
        ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_COUNT        = 5;

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
        EVROverlayError_VROverlayError_TextureNotLocked           = 33,
        EVROverlayError_VROverlayError_TimedOut                   = 34;

    public static final int
        EVRApplicationType_VRApplication_Other          = 0,
        EVRApplicationType_VRApplication_Scene          = 1,
        EVRApplicationType_VRApplication_Overlay        = 2,
        EVRApplicationType_VRApplication_Background     = 3,
        EVRApplicationType_VRApplication_Utility        = 4,
        EVRApplicationType_VRApplication_VRMonitor      = 5,
        EVRApplicationType_VRApplication_SteamWatchdog  = 6,
        EVRApplicationType_VRApplication_Bootstrapper   = 7,
        EVRApplicationType_VRApplication_WebHelper      = 8,
        EVRApplicationType_VRApplication_OpenXRInstance = 9,
        EVRApplicationType_VRApplication_OpenXRScene    = 10,
        EVRApplicationType_VRApplication_OpenXROverlay  = 11,
        EVRApplicationType_VRApplication_Prism          = 12,
        EVRApplicationType_VRApplication_RoomView       = 13,
        EVRApplicationType_VRApplication_Max            = 14;

    public static final int
        EVRFirmwareError_VRFirmwareError_None    = 0,
        EVRFirmwareError_VRFirmwareError_Success = 1,
        EVRFirmwareError_VRFirmwareError_Fail    = 2;

    public static final int
        EVRNotificationError_VRNotificationError_OK                               = 0,
        EVRNotificationError_VRNotificationError_InvalidNotificationId            = 100,
        EVRNotificationError_VRNotificationError_NotificationQueueFull            = 101,
        EVRNotificationError_VRNotificationError_InvalidOverlayHandle             = 102,
        EVRNotificationError_VRNotificationError_SystemWithUserValueAlreadyExists = 103,
        EVRNotificationError_VRNotificationError_ServiceUnavailable               = 104;

    public static final int
        EVRSkeletalMotionRange_VRSkeletalMotionRange_WithController    = 0,
        EVRSkeletalMotionRange_VRSkeletalMotionRange_WithoutController = 1;

    public static final int
        EVRSkeletalTrackingLevel_VRSkeletalTracking_Estimated  = 0,
        EVRSkeletalTrackingLevel_VRSkeletalTracking_Partial    = 1,
        EVRSkeletalTrackingLevel_VRSkeletalTracking_Full       = 2,
        EVRSkeletalTrackingLevel_VRSkeletalTrackingLevel_Count = 3,
        EVRSkeletalTrackingLevel_VRSkeletalTrackingLevel_Max   = EVRSkeletalTrackingLevel_VRSkeletalTrackingLevel_Count - 1;

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
        EVRInitError_VRInitError_Init_FailedForVrMonitor                                      = 144,
        EVRInitError_VRInitError_Init_PropertyManagerInitFailed                               = 145,
        EVRInitError_VRInitError_Init_WebServerFailed                                         = 146,
        EVRInitError_VRInitError_Init_IllegalTypeTransition                                   = 147,
        EVRInitError_VRInitError_Init_MismatchedRuntimes                                      = 148,
        EVRInitError_VRInitError_Init_InvalidProcessId                                        = 149,
        EVRInitError_VRInitError_Init_VRServiceStartupFailed                                  = 150,
        EVRInitError_VRInitError_Init_PrismNeedsNewDrivers                                    = 151,
        EVRInitError_VRInitError_Init_PrismStartupTimedOut                                    = 152,
        EVRInitError_VRInitError_Init_CouldNotStartPrism                                      = 153,
        EVRInitError_VRInitError_Init_PrismClientInitFailed                                   = 154,
        EVRInitError_VRInitError_Init_PrismClientStartFailed                                  = 155,
        EVRInitError_VRInitError_Init_PrismExitedUnexpectedly                                 = 156,
        EVRInitError_VRInitError_Init_BadLuid                                                 = 157,
        EVRInitError_VRInitError_Init_NoServerForAppContainer                                 = 158,
        EVRInitError_VRInitError_Init_DuplicateBootstrapper                                   = 159,
        EVRInitError_VRInitError_Init_VRDashboardServicePending                               = 160,
        EVRInitError_VRInitError_Init_VRDashboardServiceTimeout                               = 161,
        EVRInitError_VRInitError_Init_VRDashboardServiceStopped                               = 162,
        EVRInitError_VRInitError_Init_VRDashboardAlreadyStarted                               = 163,
        EVRInitError_VRInitError_Init_VRDashboardCopyFailed                                   = 164,
        EVRInitError_VRInitError_Init_VRDashboardTokenFailure                                 = 165,
        EVRInitError_VRInitError_Init_VRDashboardEnvironmentFailure                           = 166,
        EVRInitError_VRInitError_Init_VRDashboardPathFailure                                  = 167,
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
        EVRInitError_VRInitError_Driver_HmdDisplayNotFoundLaptop                              = 213,
        EVRInitError_VRInitError_Driver_PeerDriverNotInstalled                                = 214,
        EVRInitError_VRInitError_Driver_WirelessHmdNotConnected                               = 215,
        EVRInitError_VRInitError_IPC_ServerInitFailed                                         = 300,
        EVRInitError_VRInitError_IPC_ConnectFailed                                            = 301,
        EVRInitError_VRInitError_IPC_SharedStateInitFailed                                    = 302,
        EVRInitError_VRInitError_IPC_CompositorInitFailed                                     = 303,
        EVRInitError_VRInitError_IPC_MutexInitFailed                                          = 304,
        EVRInitError_VRInitError_IPC_Failed                                                   = 305,
        EVRInitError_VRInitError_IPC_CompositorConnectFailed                                  = 306,
        EVRInitError_VRInitError_IPC_CompositorInvalidConnectResponse                         = 307,
        EVRInitError_VRInitError_IPC_ConnectFailedAfterMultipleAttempts                       = 308,
        EVRInitError_VRInitError_IPC_ConnectFailedAfterTargetExited                           = 309,
        EVRInitError_VRInitError_IPC_NamespaceUnavailable                                     = 310,
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
        EVRInitError_VRInitError_Compositor_CreateOverlayVertexBuffer                         = 480,
        EVRInitError_VRInitError_Compositor_CreateTextVertexBuffer                            = 481,
        EVRInitError_VRInitError_Compositor_CreateTextIndexBuffer                             = 482,
        EVRInitError_VRInitError_Compositor_CreateMirrorTextures                              = 483,
        EVRInitError_VRInitError_Compositor_CreateLastFrameRenderTexture                      = 484,
        EVRInitError_VRInitError_Compositor_CreateMirrorOverlay                               = 485,
        EVRInitError_VRInitError_Compositor_FailedToCreateVirtualDisplayBackbuffer            = 486,
        EVRInitError_VRInitError_Compositor_DisplayModeNotSupported                           = 487,
        EVRInitError_VRInitError_Compositor_CreateOverlayInvalidCall                          = 488,
        EVRInitError_VRInitError_Compositor_CreateOverlayAlreadyInitialized                   = 489,
        EVRInitError_VRInitError_Compositor_FailedToCreateMailbox                             = 490,
        EVRInitError_VRInitError_Compositor_WindowInterfaceIsNull                             = 491,
        EVRInitError_VRInitError_Compositor_SystemLayerCreateInstance                         = 492,
        EVRInitError_VRInitError_Compositor_SystemLayerCreateSession                          = 493,
        EVRInitError_VRInitError_Compositor_CreateInverseDistortUVs                           = 494,
        EVRInitError_VRInitError_Compositor_CreateBackbufferDepth                             = 495,
        EVRInitError_VRInitError_Compositor_CannotDRMLeaseDisplay                             = 496,
        EVRInitError_VRInitError_Compositor_CannotConnectToDisplayServer                      = 497,
        EVRInitError_VRInitError_Compositor_GnomeNoDRMLeasing                                 = 498,
        EVRInitError_VRInitError_Compositor_FailedToInitializeEncoder                         = 499,
        EVRInitError_VRInitError_Compositor_CreateBlurTexture                                 = 500,
        EVRInitError_VRInitError_VendorSpecific_UnableToConnectToOculusRuntime                = 1000,
        EVRInitError_VRInitError_VendorSpecific_WindowsNotInDevMode                           = 1001,
        EVRInitError_VRInitError_VendorSpecific_OculusLinkNotEnabled                          = 1002,
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
        EVRInitError_VRInitError_VendorSpecific_OculusRuntimeBadInstall                       = 1114,
        EVRInitError_VRInitError_VendorSpecific_HmdFound_UnexpectedConfiguration_1            = 1115,
        EVRInitError_VRInitError_Steam_SteamInstallationNotFound                              = 2000,
        EVRInitError_VRInitError_LastError                                                    = 2001;

    public static final int
        EVRScreenshotType_VRScreenshotType_None           = 0,
        EVRScreenshotType_VRScreenshotType_Mono           = 1,
        EVRScreenshotType_VRScreenshotType_Stereo         = 2,
        EVRScreenshotType_VRScreenshotType_Cubemap        = 3,
        EVRScreenshotType_VRScreenshotType_MonoPanorama   = 4,
        EVRScreenshotType_VRScreenshotType_StereoPanorama = 5;

    public static final int
        EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_Preview = 0,
        EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_VR      = 1;

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

    public static final int
        EVRTrackedCameraFrameLayout_Mono             = 1,
        EVRTrackedCameraFrameLayout_Stereo           = 2,
        EVRTrackedCameraFrameLayout_VerticalLayout   = 16,
        EVRTrackedCameraFrameLayout_HorizontalLayout = 32;

    public static final int
        EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted          = 0,
        EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted        = 1,
        EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted = 2,
        EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES                      = 3;

    public static final int
        EVRDistortionFunctionType_VRDistortionFunctionType_None            = 0,
        EVRDistortionFunctionType_VRDistortionFunctionType_FTheta          = 1,
        EVRDistortionFunctionType_VRDistortionFunctionType_Extended_FTheta = 2,
        EVRDistortionFunctionType_MAX_DISTORTION_FUNCTION_TYPES            = 3;

    public static final int
        VRCompositor_ReprojectionMotion_Enabled      = 0x100,
        VRCompositor_ReprojectionMotion_ForcedOn     = 0x200,
        VRCompositor_ReprojectionMotion_AppThrottled = 0x400;

    public static final int
        EVSync_VSync_None         = 0,
        EVSync_VSync_WaitRender   = 1,
        EVSync_VSync_NoWaitRender = 2;

    public static final int
        EVRMuraCorrectionMode_Default      = 0,
        EVRMuraCorrectionMode_NoCorrection = 1;

    public static final int
        Imu_OffScaleFlags_OffScale_AccelX = 1,
        Imu_OffScaleFlags_OffScale_AccelY = 2,
        Imu_OffScaleFlags_OffScale_AccelZ = 4,
        Imu_OffScaleFlags_OffScale_GyroX  = 8,
        Imu_OffScaleFlags_OffScale_GyroY  = 16,
        Imu_OffScaleFlags_OffScale_GyroZ  = 32;

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
        EVRApplicationError_VRApplicationError_InvalidParameter           = 203,
        EVRApplicationError_VRApplicationError_NotImplemented             = 300;

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
        EVRApplicationProperty_VRApplicationProperty_IsHidden_Bool                      = 65,
        EVRApplicationProperty_VRApplicationProperty_LastLaunchTime_Uint64              = 70;

    public static final int
        EVRSceneApplicationState_None     = 0,
        EVRSceneApplicationState_Starting = 1,
        EVRSceneApplicationState_Quitting = 2,
        EVRSceneApplicationState_Running  = 3,
        EVRSceneApplicationState_Waiting  = 4;

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

    public static final int
        EChaperoneConfigFile_Live = 1,
        EChaperoneConfigFile_Temp = 2;

    public static final int EChaperoneImportFlags_EChaperoneImport_BoundsOnly = 1;

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
        EVRCompositorError_VRCompositorError_InvalidBounds                = 109,
        EVRCompositorError_VRCompositorError_AlreadySet                   = 110;

    public static final int
        EVRCompositorTimingMode_VRCompositorTimingMode_Implicit                                       = 0,
        EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_RuntimePerformsPostPresentHandoff     = 1,
        EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_ApplicationPerformsPostPresentHandoff = 2;

    public static final int
        VROverlayInputMethod_None  = 0,
        VROverlayInputMethod_Mouse = 1;

    public static final int
        VROverlayTransformType_VROverlayTransform_Invalid               = -1,
        VROverlayTransformType_VROverlayTransform_Absolute              = 0,
        VROverlayTransformType_VROverlayTransform_TrackedDeviceRelative = 1,
        VROverlayTransformType_VROverlayTransform_TrackedComponent      = 3,
        VROverlayTransformType_VROverlayTransform_Cursor                = 4,
        VROverlayTransformType_VROverlayTransform_DashboardTab          = 5,
        VROverlayTransformType_VROverlayTransform_DashboardThumb        = 6,
        VROverlayTransformType_VROverlayTransform_Mountable             = 7,
        VROverlayTransformType_VROverlayTransform_Projection            = 8,
        VROverlayTransformType_VROverlayTransform_Subview               = 9;

    public static final int
        VROverlayFlags_NoDashboardTab                     = 1 << 3,
        VROverlayFlags_SendVRDiscreteScrollEvents         = 1 << 6,
        VROverlayFlags_SendVRTouchpadEvents               = 1 << 7,
        VROverlayFlags_ShowTouchPadScrollWheel            = 1 << 8,
        VROverlayFlags_TransferOwnershipToInternalProcess = 1 << 9,
        VROverlayFlags_SideBySide_Parallel                = 1 << 10,
        VROverlayFlags_SideBySide_Crossed                 = 1 << 11,
        VROverlayFlags_Panorama                           = 1 << 12,
        VROverlayFlags_StereoPanorama                     = 1 << 13,
        VROverlayFlags_SortWithNonSceneOverlays           = 1 << 14,
        VROverlayFlags_VisibleInDashboard                 = 1 << 15,
        VROverlayFlags_MakeOverlaysInteractiveIfVisible   = 1 << 16,
        VROverlayFlags_SendVRSmoothScrollEvents           = 1 << 17,
        VROverlayFlags_ProtectedContent                   = 1 << 18,
        VROverlayFlags_HideLaserIntersection              = 1 << 19,
        VROverlayFlags_WantsModalBehavior                 = 1 << 20,
        VROverlayFlags_IsPremultiplied                    = 1 << 21,
        VROverlayFlags_IgnoreTextureAlpha                 = 1 << 22,
        VROverlayFlags_EnableControlBar                   = 1 << 23,
        VROverlayFlags_EnableControlBarKeyboard           = 1 << 24,
        VROverlayFlags_EnableControlBarClose              = 1 << 25,
        VROverlayFlags_Reserved                           = 1 << 26,
        VROverlayFlags_EnableClickStabilization           = 1 << 27,
        VROverlayFlags_MultiCursor                        = 1 << 28;

    public static final int
        VRMessageOverlayResponse_ButtonPress_0                    = 0,
        VRMessageOverlayResponse_ButtonPress_1                    = 1,
        VRMessageOverlayResponse_ButtonPress_2                    = 2,
        VRMessageOverlayResponse_ButtonPress_3                    = 3,
        VRMessageOverlayResponse_CouldntFindSystemOverlay         = 4,
        VRMessageOverlayResponse_CouldntFindOrCreateClientOverlay = 5,
        VRMessageOverlayResponse_ApplicationQuit                  = 6;

    public static final int
        EGamepadTextInputMode_k_EGamepadTextInputModeNormal   = 0,
        EGamepadTextInputMode_k_EGamepadTextInputModePassword = 1,
        EGamepadTextInputMode_k_EGamepadTextInputModeSubmit   = 2;

    public static final int
        EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine    = 0,
        EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines = 1;

    public static final int
        EVROverlayIntersectionMaskPrimitiveType_OverlayIntersectionPrimitiveType_Rectangle = 0,
        EVROverlayIntersectionMaskPrimitiveType_OverlayIntersectionPrimitiveType_Circle    = 1;

    public static final int
        EKeyboardFlags_KeyboardFlag_Minimal       = 1 << 0,
        EKeyboardFlags_KeyboardFlag_Modal         = 1 << 1,
        EKeyboardFlags_KeyboardFlag_ShowArrowKeys = 1 << 2,
        EKeyboardFlags_KeyboardFlag_HideDoneKey   = 1 << 3;

    public static final int
        EDeviceType_DeviceType_Invalid   = -1,
        EDeviceType_DeviceType_DirectX11 = 0,
        EDeviceType_DeviceType_Vulkan    = 1;

    public static final int
        HeadsetViewMode_t_HeadsetViewMode_Left  = 0,
        HeadsetViewMode_t_HeadsetViewMode_Right = 1,
        HeadsetViewMode_t_HeadsetViewMode_Both  = 2;

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

    public static final int
        EVRRenderModelTextureFormat_VRRenderModelTextureFormat_RGBA8_SRGB   = 0,
        EVRRenderModelTextureFormat_VRRenderModelTextureFormat_BC2          = 1,
        EVRRenderModelTextureFormat_VRRenderModelTextureFormat_BC4          = 2,
        EVRRenderModelTextureFormat_VRRenderModelTextureFormat_BC7          = 3,
        EVRRenderModelTextureFormat_VRRenderModelTextureFormat_BC7_SRGB     = 4,
        EVRRenderModelTextureFormat_VRRenderModelTextureFormat_RGBA16_FLOAT = 5;

    public static final int
        EVRNotificationType_Transient                     = 0,
        EVRNotificationType_Persistent                    = 1,
        EVRNotificationType_Transient_SystemWithUserValue = 2;

    public static final int
        EVRNotificationStyle_None             = 0,
        EVRNotificationStyle_Application      = 100,
        EVRNotificationStyle_Contact_Disabled = 200,
        EVRNotificationStyle_Contact_Enabled  = 201,
        EVRNotificationStyle_Contact_Active   = 202;

    public static final int
        EVRSettingsError_VRSettingsError_None                     = 0,
        EVRSettingsError_VRSettingsError_IPCFailed                = 1,
        EVRSettingsError_VRSettingsError_WriteFailed              = 2,
        EVRSettingsError_VRSettingsError_ReadFailed               = 3,
        EVRSettingsError_VRSettingsError_JsonParseFailed          = 4,
        EVRSettingsError_VRSettingsError_UnsetSettingHasNoDefault = 5,
        EVRSettingsError_VRSettingsError_AccessDenied             = 6;

    public static final int
        EVRScreenshotError_VRScreenshotError_None                        = 0,
        EVRScreenshotError_VRScreenshotError_RequestFailed               = 1,
        EVRScreenshotError_VRScreenshotError_IncompatibleVersion         = 100,
        EVRScreenshotError_VRScreenshotError_NotFound                    = 101,
        EVRScreenshotError_VRScreenshotError_BufferTooSmall              = 102,
        EVRScreenshotError_VRScreenshotError_ScreenshotAlreadyInProgress = 108;

    public static final int
        EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Model  = 0,
        EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent = 1;

    public static final int
        EVRSkeletalReferencePose_VRSkeletalReferencePose_BindPose  = 0,
        EVRSkeletalReferencePose_VRSkeletalReferencePose_OpenHand  = 1,
        EVRSkeletalReferencePose_VRSkeletalReferencePose_Fist      = 2,
        EVRSkeletalReferencePose_VRSkeletalReferencePose_GripLimit = 3;

    public static final int
        EVRFinger_VRFinger_Thumb  = 0,
        EVRFinger_VRFinger_Index  = 1,
        EVRFinger_VRFinger_Middle = 2,
        EVRFinger_VRFinger_Ring   = 3,
        EVRFinger_VRFinger_Pinky  = 4,
        EVRFinger_VRFinger_Count  = 5;

    public static final int
        EVRFingerSplay_VRFingerSplay_Thumb_Index  = 0,
        EVRFingerSplay_VRFingerSplay_Index_Middle = 1,
        EVRFingerSplay_VRFingerSplay_Middle_Ring  = 2,
        EVRFingerSplay_VRFingerSplay_Ring_Pinky   = 3,
        EVRFingerSplay_VRFingerSplay_Count        = 4;

    public static final int
        EVRSummaryType_VRSummaryType_FromAnimation = 0,
        EVRSummaryType_VRSummaryType_FromDevice    = 1;

    public static final int
        EVRInputFilterCancelType_VRInputFilterCancel_Timers   = 0,
        EVRInputFilterCancelType_VRInputFilterCancel_Momentum = 1;

    public static final int
        EVRInputStringBits_VRInputString_Hand           = 1,
        EVRInputStringBits_VRInputString_ControllerType = 2,
        EVRInputStringBits_VRInputString_InputSource    = 4,
        EVRInputStringBits_VRInputString_All            = -1;

    public static final int
        k_nActionSetOverlayGlobalPriorityMin = 0x1000000,
        k_nActionSetOverlayGlobalPriorityMax = 0x1FFFFFF,
        k_nActionSetPriorityReservedMin      = 0x2000000;

    public static final int
        EIOBufferError_IOBuffer_Success          = 0,
        EIOBufferError_IOBuffer_OperationFailed  = 100,
        EIOBufferError_IOBuffer_InvalidHandle    = 101,
        EIOBufferError_IOBuffer_InvalidArgument  = 102,
        EIOBufferError_IOBuffer_PathExists       = 103,
        EIOBufferError_IOBuffer_PathDoesNotExist = 104,
        EIOBufferError_IOBuffer_Permission       = 105;

    public static final int
        EIOBufferMode_IOBufferMode_Read   = 1,
        EIOBufferMode_IOBufferMode_Write  = 2,
        EIOBufferMode_IOBufferMode_Create = 512;

    public static final int
        EVRDebugError_VRDebugError_Success      = 1,
        EVRDebugError_VRDebugError_BadParameter = 2;

    public static final int
        EPropertyWriteType_PropertyWrite_Set      = 0,
        EPropertyWriteType_PropertyWrite_Erase    = 1,
        EPropertyWriteType_PropertyWrite_SetError = 2;

    public static final int
        EBlockQueueError_BlockQueueError_None                  = 0,
        EBlockQueueError_BlockQueueError_QueueAlreadyExists    = 1,
        EBlockQueueError_BlockQueueError_QueueNotFound         = 2,
        EBlockQueueError_BlockQueueError_BlockNotAvailable     = 3,
        EBlockQueueError_BlockQueueError_InvalidHandle         = 4,
        EBlockQueueError_BlockQueueError_InvalidParam          = 5,
        EBlockQueueError_BlockQueueError_ParamMismatch         = 6,
        EBlockQueueError_BlockQueueError_InternalError         = 7,
        EBlockQueueError_BlockQueueError_AlreadyInitialized    = 8,
        EBlockQueueError_BlockQueueError_OperationIsServerOnly = 9,
        EBlockQueueError_BlockQueueError_TooManyConnections    = 10;

    public static final int
        EBlockQueueReadType_BlockQueueRead_Latest = 0,
        EBlockQueueReadType_BlockQueueRead_New    = 1,
        EBlockQueueReadType_BlockQueueRead_Next   = 2;

    public static final int EBlockQueueCreationFlag_BlockQueueFlag_OwnerIsReader = 0x1;

    protected VR() {
        throw new UnsupportedOperationException();
    }

    // --- [ VR_InitInternal ] ---

    /** {@code uint32_t VR_InitInternal(EVRInitError * peError, EVRApplicationType eType)} */
    public static int nVR_InitInternal(long peError, int eType) {
        long __functionAddress = Functions.InitInternal;
        return invokePI(peError, eType, __functionAddress);
    }

    /** {@code uint32_t VR_InitInternal(EVRInitError * peError, EVRApplicationType eType)} */
    @NativeType("uint32_t")
    public static int VR_InitInternal(@NativeType("EVRInitError *") IntBuffer peError, @NativeType("EVRApplicationType") int eType) {
        if (CHECKS) {
            check(peError, 1);
        }
        return nVR_InitInternal(memAddress(peError), eType);
    }

    // --- [ VR_ShutdownInternal ] ---

    /** {@code void VR_ShutdownInternal(void)} */
    public static void VR_ShutdownInternal() {
        long __functionAddress = Functions.ShutdownInternal;
        invokeV(__functionAddress);
    }

    // --- [ VR_IsHmdPresent ] ---

    /** {@code bool VR_IsHmdPresent(void)} */
    @NativeType("bool")
    public static boolean VR_IsHmdPresent() {
        long __functionAddress = Functions.IsHmdPresent;
        return invokeZ(__functionAddress);
    }

    // --- [ VR_GetGenericInterface ] ---

    /** {@code intptr_t VR_GetGenericInterface(char const * pchInterfaceVersion, EVRInitError * peError)} */
    public static long nVR_GetGenericInterface(long pchInterfaceVersion, long peError) {
        long __functionAddress = Functions.GetGenericInterface;
        return invokePPP(pchInterfaceVersion, peError, __functionAddress);
    }

    /** {@code intptr_t VR_GetGenericInterface(char const * pchInterfaceVersion, EVRInitError * peError)} */
    @NativeType("intptr_t")
    public static long VR_GetGenericInterface(@NativeType("char const *") ByteBuffer pchInterfaceVersion, @NativeType("EVRInitError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchInterfaceVersion);
            check(peError, 1);
        }
        return nVR_GetGenericInterface(memAddress(pchInterfaceVersion), memAddress(peError));
    }

    /** {@code intptr_t VR_GetGenericInterface(char const * pchInterfaceVersion, EVRInitError * peError)} */
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

    /** {@code bool VR_IsRuntimeInstalled(void)} */
    @NativeType("bool")
    public static boolean VR_IsRuntimeInstalled() {
        long __functionAddress = Functions.IsRuntimeInstalled;
        return invokeZ(__functionAddress);
    }

    // --- [ VR_RuntimePath ] ---

    /** {@code char * VR_RuntimePath(void)} */
    public static long nVR_RuntimePath() {
        long __functionAddress = Functions.RuntimePath;
        return invokeP(__functionAddress);
    }

    /** {@code char * VR_RuntimePath(void)} */
    @NativeType("char *")
    public static @Nullable String VR_RuntimePath() {
        long __result = nVR_RuntimePath();
        return memASCIISafe(__result);
    }

    // --- [ VR_IsInterfaceVersionValid ] ---

    /** {@code bool VR_IsInterfaceVersionValid(char const * pchInterfaceVersion)} */
    public static boolean nVR_IsInterfaceVersionValid(long pchInterfaceVersion) {
        long __functionAddress = Functions.IsInterfaceVersionValid;
        return invokePZ(pchInterfaceVersion, __functionAddress);
    }

    /** {@code bool VR_IsInterfaceVersionValid(char const * pchInterfaceVersion)} */
    @NativeType("bool")
    public static boolean VR_IsInterfaceVersionValid(@NativeType("char const *") ByteBuffer pchInterfaceVersion) {
        if (CHECKS) {
            checkNT1(pchInterfaceVersion);
        }
        return nVR_IsInterfaceVersionValid(memAddress(pchInterfaceVersion));
    }

    /** {@code bool VR_IsInterfaceVersionValid(char const * pchInterfaceVersion)} */
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

    /** {@code uint32_t VR_GetInitToken(void)} */
    @NativeType("uint32_t")
    public static int VR_GetInitToken() {
        long __functionAddress = Functions.GetInitToken;
        return invokeI(__functionAddress);
    }

    // --- [ VR_GetVRInitErrorAsSymbol ] ---

    /** {@code char const * VR_GetVRInitErrorAsSymbol(EVRInitError error)} */
    public static long nVR_GetVRInitErrorAsSymbol(int error) {
        long __functionAddress = Functions.GetVRInitErrorAsSymbol;
        return invokeP(error, __functionAddress);
    }

    /** {@code char const * VR_GetVRInitErrorAsSymbol(EVRInitError error)} */
    @NativeType("char const *")
    public static @Nullable String VR_GetVRInitErrorAsSymbol(@NativeType("EVRInitError") int error) {
        long __result = nVR_GetVRInitErrorAsSymbol(error);
        return memASCIISafe(__result);
    }

    // --- [ VR_GetVRInitErrorAsEnglishDescription ] ---

    /** {@code char const * VR_GetVRInitErrorAsEnglishDescription(EVRInitError error)} */
    public static long nVR_GetVRInitErrorAsEnglishDescription(int error) {
        long __functionAddress = Functions.GetVRInitErrorAsEnglishDescription;
        return invokeP(error, __functionAddress);
    }

    /** {@code char const * VR_GetVRInitErrorAsEnglishDescription(EVRInitError error)} */
    @NativeType("char const *")
    public static @Nullable String VR_GetVRInitErrorAsEnglishDescription(@NativeType("EVRInitError") int error) {
        long __result = nVR_GetVRInitErrorAsEnglishDescription(error);
        return memASCIISafe(__result);
    }

}