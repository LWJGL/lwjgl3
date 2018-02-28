/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VR = "VR".nativeClass(Module.OPENVR, prefixMethod = "VR_", binding = OPENVR_API_BINDING) {
    documentation =
        """
        Because the OpenVR API causes the game to connect to any attached VR hardware, it is not initialized automatically. To initialize the API and get
        access to the {@code IVRSystem} interface call the #InitInternal() function and pass the returned token to OpenVR#create(). To close down your
        connection to the hardware and release your {@code IVRSystem} interface, call #ShutdownInternal().
        """

    IntConstant(
        "OpenVR constants.",

        "k_nDriverNone".."-1",
        "k_unMaxDriverDebugResponseSize".."32768",
        "k_unTrackedDeviceIndex_Hmd".."0",
        "k_unMaxTrackedDeviceCount".."64",
        "k_unTrackedDeviceIndexOther".."0xFFFFFFFE",
        "k_unTrackedDeviceIndexInvalid".."0xFFFFFFFF",
        "k_unInvalidPropertyTag".."0",
        "k_unFloatPropertyTag".."1",
        "k_unInt32PropertyTag".."2",
        "k_unUint64PropertyTag".."3",
        "k_unBoolPropertyTag".."4",
        "k_unStringPropertyTag".."5",
        "k_unHmdMatrix34PropertyTag".."20",
        "k_unHmdMatrix44PropertyTag".."21",
        "k_unHmdVector3PropertyTag".."22",
        "k_unHmdVector4PropertyTag".."23",
        "k_unHiddenAreaPropertyTag".."30",
        "k_unPathHandleInfoTag".."31",
        "k_unActionPropertyTag".."32",
        "k_unInputValuePropertyTag".."33",
        "k_unWildcardPropertyTag".."34",
        "k_unHapticVibrationPropertyTag".."35",
        "k_unOpenVRInternalReserved_Start".."1000",
        "k_unOpenVRInternalReserved_End".."10000",
        "k_unScreenshotHandleInvalid".."0",
        "k_unNotificationTextMaxSize".."256"
    )

    LongConstant(
        "OpenVR constants.",

        "k_ulInvalidPropertyContainer".."0L",
        "k_ulOverlayHandleInvalid".."0L"
    )

    IntConstant("No string property will ever be longer than this length.", "k_unMaxPropertyStringSize".."32768")
    IntConstant("The number of axes in the controller state.", "k_unControllerStateAxisCount".."5")
    IntConstant("The maximum length of an application key.", "k_unMaxApplicationKeyLength".."128")
    IntConstant("The maximum length of an overlay key in bytes, counting the terminating null character.", "k_unVROverlayMaxKeyLength".."128")
    IntConstant("The maximum length of an overlay name in bytes, counting the terminating null character.", "k_unVROverlayMaxNameLength".."128")
    IntConstant("The maximum number of overlays that can exist in the system at one time.", "k_unMaxOverlayCount".."64")
    IntConstant("The maximum number of overlay intersection mask primitives per overlay.", "k_unMaxOverlayIntersectionMaskPrimitivesCount".."32")
    IntConstant("The maximum length of a settings key.", "k_unMaxSettingsKeyLength".."128")

    StringConstant(
        "OpenVR constants.",

        "IVRSystem_Version".."IVRSystem_019",
        "IVRExtendedDisplay_Version".."IVRExtendedDisplay_001",
        "IVRTrackedCamera_Version".."IVRTrackedCamera_003",
        "k_pch_MimeType_HomeApp".."vr/home",
        "k_pch_MimeType_GameTheater".."vr/game_theater",
        "IVRApplications_Version".."IVRApplications_006",
        "IVRChaperone_Version".."IVRChaperone_003",
        "IVRChaperoneSetup_Version".."IVRChaperoneSetup_005",
        "IVRCompositor_Version".."IVRCompositor_022",
        "IVROverlay_Version".."IVROverlay_018",
        "k_pch_Controller_Component_GDC2015".."gdc2015",
        "k_pch_Controller_Component_Base".."base",
        "k_pch_Controller_Component_Tip".."tip",
        "k_pch_Controller_Component_HandGrip".."handgrip",
        "k_pch_Controller_Component_Status".."status",
        "IVRRenderModels_Version".."IVRRenderModels_005",
        "IVRNotifications_Version".."IVRNotifications_002",
        "IVRSettings_Version".."IVRSettings_002",
        "k_pch_SteamVR_Section".."steamvr",
        "k_pch_SteamVR_RequireHmd_String".."requireHmd",
        "k_pch_SteamVR_ForcedDriverKey_String".."forcedDriver",
        "k_pch_SteamVR_ForcedHmdKey_String".."forcedHmd",
        "k_pch_SteamVR_DisplayDebug_Bool".."displayDebug",
        "k_pch_SteamVR_DebugProcessPipe_String".."debugProcessPipe",
        "k_pch_SteamVR_DisplayDebugX_Int32".."displayDebugX",
        "k_pch_SteamVR_DisplayDebugY_Int32".."displayDebugY",
        "k_pch_SteamVR_SendSystemButtonToAllApps_Bool".."sendSystemButtonToAllApps",
        "k_pch_SteamVR_LogLevel_Int32".."loglevel",
        "k_pch_SteamVR_IPD_Float".."ipd",
        "k_pch_SteamVR_Background_String".."background",
        "k_pch_SteamVR_BackgroundUseDomeProjection_Bool".."backgroundUseDomeProjection",
        "k_pch_SteamVR_BackgroundCameraHeight_Float".."backgroundCameraHeight",
        "k_pch_SteamVR_BackgroundDomeRadius_Float".."backgroundDomeRadius",
        "k_pch_SteamVR_GridColor_String".."gridColor",
        "k_pch_SteamVR_PlayAreaColor_String".."playAreaColor",
        "k_pch_SteamVR_ShowStage_Bool".."showStage",
        "k_pch_SteamVR_ActivateMultipleDrivers_Bool".."activateMultipleDrivers",
        "k_pch_SteamVR_DirectMode_Bool".."directMode",
        "k_pch_SteamVR_DirectModeEdidVid_Int32".."directModeEdidVid",
        "k_pch_SteamVR_DirectModeEdidPid_Int32".."directModeEdidPid",
        "k_pch_SteamVR_UsingSpeakers_Bool".."usingSpeakers",
        "k_pch_SteamVR_SpeakersForwardYawOffsetDegrees_Float".."speakersForwardYawOffsetDegrees",
        "k_pch_SteamVR_BaseStationPowerManagement_Bool".."basestationPowerManagement",
        "k_pch_SteamVR_NeverKillProcesses_Bool".."neverKillProcesses",
        "k_pch_SteamVR_SupersampleScale_Float".."supersampleScale",
        "k_pch_SteamVR_AllowAsyncReprojection_Bool".."allowAsyncReprojection",
        "k_pch_SteamVR_AllowReprojection_Bool".."allowInterleavedReprojection",
        "k_pch_SteamVR_ForceReprojection_Bool".."forceReprojection",
        "k_pch_SteamVR_ForceFadeOnBadTracking_Bool".."forceFadeOnBadTracking",
        "k_pch_SteamVR_DefaultMirrorView_Int32".."defaultMirrorView",
        "k_pch_SteamVR_ShowMirrorView_Bool".."showMirrorView",
        "k_pch_SteamVR_MirrorViewGeometry_String".."mirrorViewGeometry",
        "k_pch_SteamVR_StartMonitorFromAppLaunch".."startMonitorFromAppLaunch",
        "k_pch_SteamVR_StartCompositorFromAppLaunch_Bool".."startCompositorFromAppLaunch",
        "k_pch_SteamVR_StartDashboardFromAppLaunch_Bool".."startDashboardFromAppLaunch",
        "k_pch_SteamVR_StartOverlayAppsFromDashboard_Bool".."startOverlayAppsFromDashboard",
        "k_pch_SteamVR_EnableHomeApp".."enableHomeApp",
        "k_pch_SteamVR_CycleBackgroundImageTimeSec_Int32".."CycleBackgroundImageTimeSec",
        "k_pch_SteamVR_RetailDemo_Bool".."retailDemo",
        "k_pch_SteamVR_IpdOffset_Float".."ipdOffset",
        "k_pch_SteamVR_AllowSupersampleFiltering_Bool".."allowSupersampleFiltering",
        "k_pch_SteamVR_EnableLinuxVulkanAsync_Bool".."enableLinuxVulkanAsync",
        "k_pch_SteamVR_AllowDisplayLockedMode_Bool".."allowDisplayLockedMode",
        "k_pch_SteamVR_HaveStartedTutorialForNativeChaperoneDriver_Bool".."haveStartedTutorialForNativeChaperoneDriver",
        "k_pch_SteamVR_ForceWindows32bitVRMonitor".."forceWindows32BitVRMonitor",
        "k_pch_Lighthouse_Section".."driver_lighthouse",
        "k_pch_Lighthouse_DisableIMU_Bool".."disableimu",
        "k_pch_Lighthouse_DisableIMUExceptHMD_Bool".."disableimuexcepthmd",
        "k_pch_Lighthouse_UseDisambiguation_String".."usedisambiguation",
        "k_pch_Lighthouse_DisambiguationDebug_Int32".."disambiguationdebug",
        "k_pch_Lighthouse_PrimaryBasestation_Int32".."primarybasestation",
        "k_pch_Lighthouse_DBHistory_Bool".."dbhistory",
        "k_pch_Lighthouse_EnableBluetooth_Bool".."enableBluetooth",
        "k_pch_Null_Section".."driver_null",
        "k_pch_Null_SerialNumber_String".."serialNumber",
        "k_pch_Null_ModelNumber_String".."modelNumber",
        "k_pch_Null_WindowX_Int32".."windowX",
        "k_pch_Null_WindowY_Int32".."windowY",
        "k_pch_Null_WindowWidth_Int32".."windowWidth",
        "k_pch_Null_WindowHeight_Int32".."windowHeight",
        "k_pch_Null_RenderWidth_Int32".."renderWidth",
        "k_pch_Null_RenderHeight_Int32".."renderHeight",
        "k_pch_Null_SecondsFromVsyncToPhotons_Float".."secondsFromVsyncToPhotons",
        "k_pch_Null_DisplayFrequency_Float".."displayFrequency",
        "k_pch_UserInterface_Section".."userinterface",
        "k_pch_UserInterface_StatusAlwaysOnTop_Bool".."StatusAlwaysOnTop",
        "k_pch_UserInterface_MinimizeToTray_Bool".."MinimizeToTray",
        "k_pch_UserInterface_Screenshots_Bool".."screenshots",
        "k_pch_UserInterface_ScreenshotType_Int".."screenshotType",
        "k_pch_Notifications_Section".."notifications",
        "k_pch_Notifications_DoNotDisturb_Bool".."DoNotDisturb",
        "k_pch_Keyboard_Section".."keyboard",
        "k_pch_Keyboard_TutorialCompletions".."TutorialCompletions",
        "k_pch_Keyboard_ScaleX".."ScaleX",
        "k_pch_Keyboard_ScaleY".."ScaleY",
        "k_pch_Keyboard_OffsetLeftX".."OffsetLeftX",
        "k_pch_Keyboard_OffsetRightX".."OffsetRightX",
        "k_pch_Keyboard_OffsetY".."OffsetY",
        "k_pch_Keyboard_Smoothing".."Smoothing",
        "k_pch_Perf_Section".."perfcheck",
        "k_pch_Perf_HeuristicActive_Bool".."heuristicActive",
        "k_pch_Perf_NotifyInHMD_Bool".."warnInHMD",
        "k_pch_Perf_NotifyOnlyOnce_Bool".."warnOnlyOnce",
        "k_pch_Perf_AllowTimingStore_Bool".."allowTimingStore",
        "k_pch_Perf_SaveTimingsOnExit_Bool".."saveTimingsOnExit",
        "k_pch_Perf_TestData_Float".."perfTestData",
        "k_pch_Perf_LinuxGPUProfiling_Bool".."linuxGPUProfiling",
        "k_pch_CollisionBounds_Section".."collisionBounds",
        "k_pch_CollisionBounds_Style_Int32".."CollisionBoundsStyle",
        "k_pch_CollisionBounds_GroundPerimeterOn_Bool".."CollisionBoundsGroundPerimeterOn",
        "k_pch_CollisionBounds_CenterMarkerOn_Bool".."CollisionBoundsCenterMarkerOn",
        "k_pch_CollisionBounds_PlaySpaceOn_Bool".."CollisionBoundsPlaySpaceOn",
        "k_pch_CollisionBounds_FadeDistance_Float".."CollisionBoundsFadeDistance",
        "k_pch_CollisionBounds_ColorGammaR_Int32".."CollisionBoundsColorGammaR",
        "k_pch_CollisionBounds_ColorGammaG_Int32".."CollisionBoundsColorGammaG",
        "k_pch_CollisionBounds_ColorGammaB_Int32".."CollisionBoundsColorGammaB",
        "k_pch_CollisionBounds_ColorGammaA_Int32".."CollisionBoundsColorGammaA",
        "k_pch_Camera_Section".."camera",
        "k_pch_Camera_EnableCamera_Bool".."enableCamera",
        "k_pch_Camera_EnableCameraInDashboard_Bool".."enableCameraInDashboard",
        "k_pch_Camera_EnableCameraForCollisionBounds_Bool".."enableCameraForCollisionBounds",
        "k_pch_Camera_EnableCameraForRoomView_Bool".."enableCameraForRoomView",
        "k_pch_Camera_BoundsColorGammaR_Int32".."cameraBoundsColorGammaR",
        "k_pch_Camera_BoundsColorGammaG_Int32".."cameraBoundsColorGammaG",
        "k_pch_Camera_BoundsColorGammaB_Int32".."cameraBoundsColorGammaB",
        "k_pch_Camera_BoundsColorGammaA_Int32".."cameraBoundsColorGammaA",
        "k_pch_Camera_BoundsStrength_Int32".."cameraBoundsStrength",
        "k_pch_audio_Section".."audio",
        "k_pch_audio_OnPlaybackDevice_String".."onPlaybackDevice",
        "k_pch_audio_OnRecordDevice_String".."onRecordDevice",
        "k_pch_audio_OnPlaybackMirrorDevice_String".."onPlaybackMirrorDevice",
        "k_pch_audio_OffPlaybackDevice_String".."offPlaybackDevice",
        "k_pch_audio_OffRecordDevice_String".."offRecordDevice",
        "k_pch_audio_VIVEHDMIGain".."viveHDMIGain",
        "k_pch_Power_Section".."power",
        "k_pch_Power_PowerOffOnExit_Bool".."powerOffOnExit",
        "k_pch_Power_TurnOffScreensTimeout_Float".."turnOffScreensTimeout",
        "k_pch_Power_TurnOffControllersTimeout_Float".."turnOffControllersTimeout",
        "k_pch_Power_ReturnToWatchdogTimeout_Float".."returnToWatchdogTimeout",
        "k_pch_Power_AutoLaunchSteamVROnButtonPress".."autoLaunchSteamVROnButtonPress",
        "k_pch_Power_PauseCompositorOnStandby_Bool".."pauseCompositorOnStandbyc",
        "k_pch_Dashboard_Section".."dashboard",
        "k_pch_Dashboard_EnableDashboard_Bool".."enableDashboard",
        "k_pch_Dashboard_ArcadeMode_Bool".."arcadeMode",
        "k_pch_modelskin_Section".."modelskins",
        "k_pch_Driver_Enable_Bool".."enable",
        "IVRScreenshots_Version".."IVRScreenshots_001",
        "IVRResources_Version".."IVRResources_001",
        "IVRDriverManager_Version".."IVRDriverManager_001"
    )

    // OpenVR Enums

    EnumConstant(
        "EVREye",

        "EVREye_Eye_Left".enum("", "0"),
        "EVREye_Eye_Right".enum
    )

    EnumConstant(
        "ETextureType",

        "ETextureType_TextureType_DirectX".enum("Handle is an ID3D11Texture.", "0"),
        "ETextureType_TextureType_OpenGL".enum("Handle is an OpenGL texture name or an OpenGL render buffer name, depending on submit flags."),
        "ETextureType_TextureType_Vulkan".enum("Handle is a pointer to a {@code VRVulkanTextureData_t} structure."),
        "ETextureType_TextureType_IOSurface".enum("Handle is a macOS cross-process-sharable {@code IOSurfaceRef}."),
        "ETextureType_TextureType_DirectX12".enum("Handle is a pointer to a {@code D3D12TextureData_t} structure.")
    )

    EnumConstant(
        "EColorSpace",

        "EColorSpace_ColorSpace_Auto".enum(
            "Assumes 'gamma' for 8-bit per component formats, otherwise 'linear'. This mirrors the DXGI formats which have _SRGB variants.",
            "0"
        ),
        "EColorSpace_ColorSpace_Gamma".enum("Texture data can be displayed directly on the display without any conversion (a.k.a. display native format)."),
        "EColorSpace_ColorSpace_Linear".enum("Same as gamma but has been converted to a linear representation using DXGI's sRGB conversion algorithm.")
    )

    EnumConstant(
        "ETrackingResult",

        "ETrackingResult_TrackingResult_Uninitialized".enum("", "1"),
        "ETrackingResult_TrackingResult_Calibrating_InProgress".enum("", "100"),
        "ETrackingResult_TrackingResult_Calibrating_OutOfRange".enum("", "101"),
        "ETrackingResult_TrackingResult_Running_OK".enum("", "200"),
        "ETrackingResult_TrackingResult_Running_OutOfRange".enum("", "201")
    )

    EnumConstant(
        "{@code ETrackedDeviceClass}: Describes what kind of object is being tracked at a given ID.",

        "ETrackedDeviceClass_TrackedDeviceClass_Invalid".enum("The ID was not valid.", "0"),
        "ETrackedDeviceClass_TrackedDeviceClass_HMD".enum("Head-Mounted Displays."),
        "ETrackedDeviceClass_TrackedDeviceClass_Controller".enum("Tracked controllers."),
        "ETrackedDeviceClass_TrackedDeviceClass_GenericTracker".enum("Generic trackers, similar to controllers."),
        "ETrackedDeviceClass_TrackedDeviceClass_TrackingReference".enum("Camera and base stations that serve as tracking reference points."),
        "ETrackedDeviceClass_TrackedDeviceClass_DisplayRedirect".enum(
            "Accessories that aren't necessarily tracked themselves, but may redirect video output from other tracked devices."
        )
    )

    EnumConstant(
        "{@code ETrackedControllerRole}: Describes what specific role associated with a tracked device.",

        "ETrackedControllerRole_TrackedControllerRole_Invalid".enum("Invalid value for controller type.", "0"),
        "ETrackedControllerRole_TrackedControllerRole_LeftHand".enum("Tracked device associated with the left hand."),
        "ETrackedControllerRole_TrackedControllerRole_RightHand".enum("Tracked device associated with the right hand.")
    )

    EnumConstant(
        "{@code ETrackingUniverseOrigin}: Identifies which style of tracking origin the application wants to use for the poses it is requesting.",

        "ETrackingUniverseOrigin_TrackingUniverseSeated".enum("Poses are provided relative to the seated zero pose.", "0"),
        "ETrackingUniverseOrigin_TrackingUniverseStanding".enum("Poses are provided relative to the safe bounds configured by the user."),
        "ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated".enum(
            """
            Poses are provided in the coordinate system defined by the driver.  It has Y up and is unified for devices of the same driver. You usually don't
            want this one.
            """
        )
    )

    EnumConstant(
        """
        {@code ETrackedDeviceProperty}: Each entry in this enum represents a property that can be retrieved about a tracked device. Many fields are only valid
        for one {@code ETrackedDeviceClass}.
        """,

        "ETrackedDeviceProperty_Prop_Invalid".enum("", "0"),
        "ETrackedDeviceProperty_Prop_TrackingSystemName_String".enum("", "1000"),
        "ETrackedDeviceProperty_Prop_ModelNumber_String".enum,
        "ETrackedDeviceProperty_Prop_SerialNumber_String".enum,
        "ETrackedDeviceProperty_Prop_RenderModelName_String".enum,
        "ETrackedDeviceProperty_Prop_WillDriftInYaw_Bool".enum,
        "ETrackedDeviceProperty_Prop_ManufacturerName_String".enum,
        "ETrackedDeviceProperty_Prop_TrackingFirmwareVersion_String".enum,
        "ETrackedDeviceProperty_Prop_HardwareRevision_String".enum,
        "ETrackedDeviceProperty_Prop_AllWirelessDongleDescriptions_String".enum,
        "ETrackedDeviceProperty_Prop_ConnectedWirelessDongle_String".enum,
        "ETrackedDeviceProperty_Prop_DeviceIsWireless_Bool".enum,
        "ETrackedDeviceProperty_Prop_DeviceIsCharging_Bool".enum,
        "ETrackedDeviceProperty_Prop_DeviceBatteryPercentage_Float".enum("0 is empty, 1 is full"),
        "ETrackedDeviceProperty_Prop_StatusDisplayTransform_Matrix34".enum,
        "ETrackedDeviceProperty_Prop_Firmware_UpdateAvailable_Bool".enum,
        "ETrackedDeviceProperty_Prop_Firmware_ManualUpdate_Bool".enum,
        "ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String".enum,
        "ETrackedDeviceProperty_Prop_HardwareRevision_Uint64".enum,
        "ETrackedDeviceProperty_Prop_FirmwareVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_FPGAVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_VRCVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_RadioVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_DongleVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_BlockServerShutdown_Bool".enum,
        "ETrackedDeviceProperty_Prop_CanUnifyCoordinateSystemWithHmd_Bool".enum,
        "ETrackedDeviceProperty_Prop_ContainsProximitySensor_Bool".enum,
        "ETrackedDeviceProperty_Prop_DeviceProvidesBatteryStatus_Bool".enum,
        "ETrackedDeviceProperty_Prop_DeviceCanPowerOff_Bool".enum,
        "ETrackedDeviceProperty_Prop_Firmware_ProgrammingTarget_String".enum,
        "ETrackedDeviceProperty_Prop_DeviceClass_Int32".enum,
        "ETrackedDeviceProperty_Prop_HasCamera_Bool".enum,
        "ETrackedDeviceProperty_Prop_DriverVersion_String".enum,
        "ETrackedDeviceProperty_Prop_Firmware_ForceUpdateRequired_Bool".enum,
        "ETrackedDeviceProperty_Prop_ViveSystemButtonFixRequired_Bool".enum,
        "ETrackedDeviceProperty_Prop_ParentDriver_Uint64".enum,
        "ETrackedDeviceProperty_Prop_ResourceRoot_String".enum,
        "ETrackedDeviceProperty_Prop_RegisteredDeviceType_String".enum,
        "ETrackedDeviceProperty_Prop_InputProfilePath_String".enum(
            "input profile to use for this device in the input system. Will default to tracking system name if this isn't provided."
        ),
        "ETrackedDeviceProperty_Prop_ReportsTimeSinceVSync_Bool".enum("", "2000"),
        "ETrackedDeviceProperty_Prop_SecondsFromVsyncToPhotons_Float".enum,
        "ETrackedDeviceProperty_Prop_DisplayFrequency_Float".enum,
        "ETrackedDeviceProperty_Prop_UserIpdMeters_Float".enum,
        "ETrackedDeviceProperty_Prop_CurrentUniverseId_Uint64".enum,
        "ETrackedDeviceProperty_Prop_PreviousUniverseId_Uint64".enum,
        "ETrackedDeviceProperty_Prop_DisplayFirmwareVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_IsOnDesktop_Bool".enum,
        "ETrackedDeviceProperty_Prop_DisplayMCType_Int32".enum,
        "ETrackedDeviceProperty_Prop_DisplayMCOffset_Float".enum,
        "ETrackedDeviceProperty_Prop_DisplayMCScale_Float".enum,
        "ETrackedDeviceProperty_Prop_EdidVendorID_Int32".enum,
        "ETrackedDeviceProperty_Prop_DisplayMCImageLeft_String".enum,
        "ETrackedDeviceProperty_Prop_DisplayMCImageRight_String".enum,
        "ETrackedDeviceProperty_Prop_DisplayGCBlackClamp_Float".enum,
        "ETrackedDeviceProperty_Prop_EdidProductID_Int32".enum,
        "ETrackedDeviceProperty_Prop_CameraToHeadTransform_Matrix34".enum,
        "ETrackedDeviceProperty_Prop_DisplayGCType_Int32".enum,
        "ETrackedDeviceProperty_Prop_DisplayGCOffset_Float".enum,
        "ETrackedDeviceProperty_Prop_DisplayGCScale_Float".enum,
        "ETrackedDeviceProperty_Prop_DisplayGCPrescale_Float".enum,
        "ETrackedDeviceProperty_Prop_DisplayGCImage_String".enum,
        "ETrackedDeviceProperty_Prop_LensCenterLeftU_Float".enum,
        "ETrackedDeviceProperty_Prop_LensCenterLeftV_Float".enum,
        "ETrackedDeviceProperty_Prop_LensCenterRightU_Float".enum,
        "ETrackedDeviceProperty_Prop_LensCenterRightV_Float".enum,
        "ETrackedDeviceProperty_Prop_UserHeadToEyeDepthMeters_Float".enum,
        "ETrackedDeviceProperty_Prop_CameraFirmwareVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_CameraFirmwareDescription_String".enum,
        "ETrackedDeviceProperty_Prop_DisplayFPGAVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_DisplayBootloaderVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_DisplayHardwareVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_AudioFirmwareVersion_Uint64".enum,
        "ETrackedDeviceProperty_Prop_CameraCompatibilityMode_Int32".enum,
        "ETrackedDeviceProperty_Prop_ScreenshotHorizontalFieldOfViewDegrees_Float".enum,
        "ETrackedDeviceProperty_Prop_ScreenshotVerticalFieldOfViewDegrees_Float".enum,
        "ETrackedDeviceProperty_Prop_DisplaySuppressed_Bool".enum,
        "ETrackedDeviceProperty_Prop_DisplayAllowNightMode_Bool".enum,
        "ETrackedDeviceProperty_Prop_DisplayMCImageWidth_Int32".enum,
        "ETrackedDeviceProperty_Prop_DisplayMCImageHeight_Int32".enum,
        "ETrackedDeviceProperty_Prop_DisplayMCImageNumChannels_Int32".enum,
        "ETrackedDeviceProperty_Prop_DisplayMCImageData_Binary".enum,
        "ETrackedDeviceProperty_Prop_SecondsFromPhotonsToVblank_Float".enum,
        "ETrackedDeviceProperty_Prop_DriverDirectModeSendsVsyncEvents_Bool".enum,
        "ETrackedDeviceProperty_Prop_DisplayDebugMode_Bool".enum,
        "ETrackedDeviceProperty_Prop_GraphicsAdapterLuid_Uint64".enum,
        "ETrackedDeviceProperty_Prop_DriverProvidedChaperonePath_String".enum("", "2048"),
        "ETrackedDeviceProperty_Prop_ExpectedTrackingReferenceCount_Int32".enum("expected number of sensors or basestations to reserve UI space for"),
        "ETrackedDeviceProperty_Prop_ExpectedControllerCount_Int32".enum("expected number of tracked controllers to reserve UI space for"),
        "ETrackedDeviceProperty_Prop_NamedIconPathControllerLeftDeviceOff_String".enum("placeholder icon for \"left\" controller if not yet detected/loaded"),
        "ETrackedDeviceProperty_Prop_NamedIconPathControllerRightDeviceOff_String".enum("placeholder icon for \"right\" controller if not yet detected/loaded"),
        "ETrackedDeviceProperty_Prop_NamedIconPathTrackingReferenceDeviceOff_String".enum,
        "ETrackedDeviceProperty_Prop_DoNotApplyPrediction_Bool".enum("placeholder icon for sensor/base if not yet detected/loaded"),
        "ETrackedDeviceProperty_Prop_CameraToHeadTransforms_Matrix34_Array".enum,
        "ETrackedDeviceProperty_Prop_DriverIsDrawingControllers_Bool".enum("", "2057"),
        "ETrackedDeviceProperty_Prop_DriverRequestsApplicationPause_Bool".enum,
        "ETrackedDeviceProperty_Prop_DriverRequestsReducedRendering_Bool".enum,
        "ETrackedDeviceProperty_Prop_AttachedDeviceId_String".enum("", "3000"),
        "ETrackedDeviceProperty_Prop_SupportedButtons_Uint64".enum,
        "ETrackedDeviceProperty_Prop_Axis0Type_Int32".enum,
        "ETrackedDeviceProperty_Prop_Axis1Type_Int32".enum,
        "ETrackedDeviceProperty_Prop_Axis2Type_Int32".enum,
        "ETrackedDeviceProperty_Prop_Axis3Type_Int32".enum,
        "ETrackedDeviceProperty_Prop_Axis4Type_Int32".enum,
        "ETrackedDeviceProperty_Prop_ControllerRoleHint_Int32".enum,
        "ETrackedDeviceProperty_Prop_FieldOfViewLeftDegrees_Float".enum("", "4000"),
        "ETrackedDeviceProperty_Prop_FieldOfViewRightDegrees_Float".enum,
        "ETrackedDeviceProperty_Prop_FieldOfViewTopDegrees_Float".enum,
        "ETrackedDeviceProperty_Prop_FieldOfViewBottomDegrees_Float".enum,
        "ETrackedDeviceProperty_Prop_TrackingRangeMinimumMeters_Float".enum,
        "ETrackedDeviceProperty_Prop_TrackingRangeMaximumMeters_Float".enum,
        "ETrackedDeviceProperty_Prop_ModeLabel_String".enum,
        "ETrackedDeviceProperty_Prop_IconPathName_String".enum("usually a directory named \"icons\"", "5000"),
        "ETrackedDeviceProperty_Prop_NamedIconPathDeviceOff_String".enum("PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others"),
        "ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearching_String".enum("PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others"),
        "ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearchingAlert_String".enum("PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others"),
        "ETrackedDeviceProperty_Prop_NamedIconPathDeviceReady_String".enum("PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others"),
        "ETrackedDeviceProperty_Prop_NamedIconPathDeviceReadyAlert_String".enum("PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others"),
        "ETrackedDeviceProperty_Prop_NamedIconPathDeviceNotReady_String".enum("PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others"),
        "ETrackedDeviceProperty_Prop_NamedIconPathDeviceStandby_String".enum("PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others"),
        "ETrackedDeviceProperty_Prop_NamedIconPathDeviceAlertLow_String".enum("PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others"),
        "ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_Start".enum("", "5100"),
        "ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_End".enum("", "5150"),
        "ETrackedDeviceProperty_Prop_ParentContainer".enum,
        "ETrackedDeviceProperty_Prop_UserConfigPath_String".enum("", "6000"),
        "ETrackedDeviceProperty_Prop_InstallPath_String".enum,
        "ETrackedDeviceProperty_Prop_HasDisplayComponent_Bool".enum,
        "ETrackedDeviceProperty_Prop_HasControllerComponent_Bool".enum,
        "ETrackedDeviceProperty_Prop_HasCameraComponent_Bool".enum,
        "ETrackedDeviceProperty_Prop_HasDriverDirectModeComponent_Bool".enum,
        "ETrackedDeviceProperty_Prop_HasVirtualDisplayComponent_Bool".enum,
        "ETrackedDeviceProperty_Prop_ControllerType_String".enum("", "7000"),
        "ETrackedDeviceProperty_Prop_LegacyInputProfile_String".enum,
        "ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_Start".enum("PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others", "10000"),
        "ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_End".enum("PNG for static icon, or GIF for animation, 50x32 for headsets and 32x32 for others", "10999"),
        "ETrackedDeviceProperty_Prop_TrackedDeviceProperty_Max".enum("", "1000000")
    )

    EnumConstant(
        "{@code ETrackedPropertyError}: Used to return errors that occur when reading properties.",

        "ETrackedPropertyError_TrackedProp_Success".enum("", "0"),
        "ETrackedPropertyError_TrackedProp_WrongDataType".enum(""),
        "ETrackedPropertyError_TrackedProp_WrongDeviceClass".enum(""),
        "ETrackedPropertyError_TrackedProp_BufferTooSmall".enum(""),
        "ETrackedPropertyError_TrackedProp_UnknownProperty".enum("Driver has not set the property (and may not ever)."),
        "ETrackedPropertyError_TrackedProp_InvalidDevice".enum(""),
        "ETrackedPropertyError_TrackedProp_CouldNotContactServer".enum(""),
        "ETrackedPropertyError_TrackedProp_ValueNotProvidedByDevice".enum(""),
        "ETrackedPropertyError_TrackedProp_StringExceedsMaximumLength".enum(""),
        "ETrackedPropertyError_TrackedProp_NotYetAvailable".enum("The property value isn't known yet, but is expected soon. Call again later."),
        "ETrackedPropertyError_TrackedProp_PermissionDenied".enum(""),
        "ETrackedPropertyError_TrackedProp_InvalidOperation".enum(""),
        "ETrackedPropertyError_TrackedProp_CannotWriteToWildcards".enum("")
    )

    EnumConstant(
        "{@code EVRSubmitFlags}: Allows the application to control how scene textures are used by the compositor when calling #Submit().",

        "EVRSubmitFlags_Submit_Default".enum(
            "Simple render path. App submits rendered left and right eye images with no lens distortion correction applied.",
            "0"
        ),
        "EVRSubmitFlags_Submit_LensDistortionAlreadyApplied".enum(
            """
            App submits final left and right eye images with lens distortion already applied (lens distortion makes the images appear barrel distorted with
            chromatic aberration correction applied). The app would have used the data returned by #ComputeDistortion() to apply the correct distortion to the
            rendered images before calling #Submit().
            """
        ),
        "EVRSubmitFlags_Submit_GlRenderBuffer".enum("If the texture pointer passed in is actually a renderbuffer (e.g. for MSAA in OpenGL) then set this flag."
        ),
        "EVRSubmitFlags_Submit_Reserved".enum("Do not use.", "4"),
        "EVRSubmit_TextureWithPose".enum(
            """
            Set to indicate that {@code pTexture} is a pointer to a ##VRTextureWithPose.

            This flag can be combined with #EVRSubmitFlags_Submit_TextureWithDepth to pass a ##VRTextureWithPoseAndDepth.
            """,
            "8"
        ),
        "EVRSubmitFlags_Submit_TextureWithDepth".enum(
            """
            Set to indicate that {@code pTexture} is a pointer to a ##VRTextureWithDepth.

            This flag can be combined with #EVRSubmit_TextureWithPose to pass a ##VRTextureWithPoseAndDepth.
            """,
            "16"
        )
    )

    EnumConstant(
        "{@code EVRState}: Status of the overall system or tracked objects.",

        "EVRState_VRState_Undefined".enum("", "-1"),
        "EVRState_VRState_Off".enum,
        "EVRState_VRState_Searching".enum,
        "EVRState_VRState_Searching_Alert".enum,
        "EVRState_VRState_Ready".enum,
        "EVRState_VRState_Ready_Alert".enum,
        "EVRState_VRState_NotReady".enum,
        "EVRState_VRState_Standby".enum,
        "EVRState_VRState_Ready_Alert_Low".enum
    )

    EnumConstant(
        "{@code} EVREventType: The types of events that could be posted (and what the parameters mean for each event type).",

        "EVREventType_VREvent_None".enum("", "0"),
        "EVREventType_VREvent_TrackedDeviceActivated".enum("", "100"),
        "EVREventType_VREvent_TrackedDeviceDeactivated".enum,
        "EVREventType_VREvent_TrackedDeviceUpdated".enum,
        "EVREventType_VREvent_TrackedDeviceUserInteractionStarted".enum,
        "EVREventType_VREvent_TrackedDeviceUserInteractionEnded".enum,
        "EVREventType_VREvent_IpdChanged".enum,
        "EVREventType_VREvent_EnterStandbyMode".enum,
        "EVREventType_VREvent_LeaveStandbyMode".enum,
        "EVREventType_VREvent_TrackedDeviceRoleChanged".enum,
        "EVREventType_VREvent_WatchdogWakeUpRequested".enum,
        "EVREventType_VREvent_LensDistortionChanged".enum,
        "EVREventType_VREvent_PropertyChanged".enum,
        "EVREventType_VREvent_WirelessDisconnect".enum,
        "EVREventType_VREvent_WirelessReconnect".enum,
        "EVREventType_VREvent_ButtonPress".enum("data is controller", "200"),
        "EVREventType_VREvent_ButtonUnpress".enum("data is controller"),
        "EVREventType_VREvent_ButtonTouch".enum("data is controller"),
        "EVREventType_VREvent_ButtonUntouch".enum("data is controller"),
        "EVREventType_VREvent_DualAnalog_Press".enum("data is dualAnalog", "250"),
        "EVREventType_VREvent_DualAnalog_Unpress".enum("data is dualAnalog"),
        "EVREventType_VREvent_DualAnalog_Touch".enum("data is dualAnalog"),
        "EVREventType_VREvent_DualAnalog_Untouch".enum("data is dualAnalog"),
        "EVREventType_VREvent_DualAnalog_Move".enum("data is dualAnalog"),
        "EVREventType_VREvent_DualAnalog_ModeSwitch1".enum("data is dualAnalog"),
        "EVREventType_VREvent_DualAnalog_ModeSwitch2".enum("data is dualAnalog"),
        "EVREventType_VREvent_DualAnalog_Cancel".enum("data is dualAnalog"),
        "EVREventType_VREvent_MouseMove".enum("data is mouse", "300"),
        "EVREventType_VREvent_MouseButtonDown".enum("data is mouse"),
        "EVREventType_VREvent_MouseButtonUp".enum("data is mouse"),
        "EVREventType_VREvent_FocusEnter".enum("data is overlay"),
        "EVREventType_VREvent_FocusLeave".enum("data is overlay"),
        "EVREventType_VREvent_Scroll".enum("data is mouse"),
        "EVREventType_VREvent_TouchPadMove".enum("data is mouse"),
        "EVREventType_VREvent_OverlayFocusChanged".enum("data is overlay, global event"),
        "EVREventType_VREvent_InputFocusCaptured".enum("data is process DEPRECATED", "400"),
        "EVREventType_VREvent_InputFocusReleased".enum("data is process DEPRECATED"),
        "EVREventType_VREvent_SceneFocusLost".enum("data is process"),
        "EVREventType_VREvent_SceneFocusGained".enum("data is process"),
        "EVREventType_VREvent_SceneApplicationChanged".enum("data is process - The App actually drawing the scene changed (usually to or from the compositor)"),
        "EVREventType_VREvent_SceneFocusChanged".enum("data is process - New app got access to draw the scene"),
        "EVREventType_VREvent_InputFocusChanged".enum("data is process"),
        "EVREventType_VREvent_SceneApplicationSecondaryRenderingStarted".enum("data is process"),
        "EVREventType_VREvent_HideRenderModels".enum("Sent to the scene application to request hiding render models temporarily", "410"),
        "EVREventType_VREvent_ShowRenderModels".enum("Sent to the scene application to request restoring render model visibility"),
        "EVREventType_VREvent_ConsoleOpened".enum("", "420"),
        "EVREventType_VREvent_ConsoleClosed".enum,
        "EVREventType_VREvent_OverlayShown".enum("", "500"),
        "EVREventType_VREvent_OverlayHidden".enum,
        "EVREventType_VREvent_DashboardActivated".enum,
        "EVREventType_VREvent_DashboardDeactivated".enum,
        "EVREventType_VREvent_DashboardThumbSelected".enum("Sent to the overlay manager - data is overlay"),
        "EVREventType_VREvent_DashboardRequested".enum("Sent to the overlay manager - data is overlay"),
        "EVREventType_VREvent_ResetDashboard".enum("Sent to the overlay manager"),
        "EVREventType_VREvent_RenderToast".enum("Sent to the dashboard to render a toast - data is the notification ID"),
        "EVREventType_VREvent_ImageLoaded".enum("Sent to overlays when a SetOverlayRaw or SetOverlayFromFile call finishes loading"),
        "EVREventType_VREvent_ShowKeyboard".enum("Sent to keyboard renderer in the dashboard to invoke it"),
        "EVREventType_VREvent_HideKeyboard".enum("Sent to keyboard renderer in the dashboard to hide it"),
        "EVREventType_VREvent_OverlayGamepadFocusGained".enum("Sent to an overlay when IVROverlay::SetFocusOverlay is called on it"),
        "EVREventType_VREvent_OverlayGamepadFocusLost".enum(
            "Send to an overlay when it previously had focus and IVROverlay::SetFocusOverlay is called on something else"
        ),
        "EVREventType_VREvent_OverlaySharedTextureChanged".enum,
        "EVREventType_VREvent_DashboardGuideButtonDown".enum,
        "EVREventType_VREvent_DashboardGuideButtonUp".enum,
        "EVREventType_VREvent_ScreenshotTriggered".enum("Screenshot button combo was pressed, Dashboard should request a screenshot"),
        "EVREventType_VREvent_ImageFailed".enum("Sent to overlays when a SetOverlayRaw or SetOverlayfromFail fails to load"),
        "EVREventType_VREvent_DashboardOverlayCreated".enum(""),
        "EVREventType_VREvent_RequestScreenshot".enum("Sent by vrclient application to compositor to take a screenshot", "520"),
        "EVREventType_VREvent_ScreenshotTaken".enum("Sent by compositor to the application that the screenshot has been taken"),
        "EVREventType_VREvent_ScreenshotFailed".enum("Sent by compositor to the application that the screenshot failed to be taken"),
        "EVREventType_VREvent_SubmitScreenshotToDashboard".enum("Sent by compositor to the dashboard that a completed screenshot was submitted"),
        "EVREventType_VREvent_ScreenshotProgressToDashboard".enum("Sent by compositor to the dashboard that a completed screenshot was submitted"),
        "EVREventType_VREvent_PrimaryDashboardDeviceChanged".enum,
        "EVREventType_VREvent_Notification_Shown".enum("", "600"),
        "EVREventType_VREvent_Notification_Hidden".enum,
        "EVREventType_VREvent_Notification_BeginInteraction".enum,
        "EVREventType_VREvent_Notification_Destroyed".enum,
        "EVREventType_VREvent_Quit".enum("data is process", "700"),
        "EVREventType_VREvent_ProcessQuit".enum("data is process"),
        "EVREventType_VREvent_QuitAborted_UserPrompt".enum("data is process"),
        "EVREventType_VREvent_QuitAcknowledged".enum("data is process"),
        "EVREventType_VREvent_DriverRequestedQuit".enum("The driver has requested that SteamVR shut down"),
        "EVREventType_VREvent_ChaperoneDataHasChanged".enum("", "800"),
        "EVREventType_VREvent_ChaperoneUniverseHasChanged".enum,
        "EVREventType_VREvent_ChaperoneTempDataHasChanged".enum,
        "EVREventType_VREvent_ChaperoneSettingsHaveChanged".enum,
        "EVREventType_VREvent_SeatedZeroPoseReset".enum,
        "EVREventType_VREvent_AudioSettingsHaveChanged".enum("", "820"),
        "EVREventType_VREvent_BackgroundSettingHasChanged".enum("", "850"),
        "EVREventType_VREvent_CameraSettingsHaveChanged".enum,
        "EVREventType_VREvent_ReprojectionSettingHasChanged".enum,
        "EVREventType_VREvent_ModelSkinSettingsHaveChanged".enum,
        "EVREventType_VREvent_EnvironmentSettingsHaveChanged".enum,
        "EVREventType_VREvent_PowerSettingsHaveChanged".enum,
        "EVREventType_VREvent_EnableHomeAppSettingsHaveChanged".enum,
        "EVREventType_VREvent_SteamVRSectionSettingChanged".enum,
        "EVREventType_VREvent_LighthouseSectionSettingChanged".enum,
        "EVREventType_VREvent_NullSectionSettingChanged".enum,
        "EVREventType_VREvent_UserInterfaceSectionSettingChanged".enum,
        "EVREventType_VREvent_NotificationsSectionSettingChanged".enum,
        "EVREventType_VREvent_KeyboardSectionSettingChanged".enum,
        "EVREventType_VREvent_PerfSectionSettingChanged".enum,
        "EVREventType_VREvent_DashboardSectionSettingChanged".enum,
        "EVREventType_VREvent_WebInterfaceSectionSettingChanged".enum,
        "EVREventType_VREvent_StatusUpdate".enum("", "900"),
        "EVREventType_VREvent_WebInterface_InstallDriverCompleted".enum("", "950"),
        "EVREventType_VREvent_MCImageUpdated".enum("", "1000"),
        "EVREventType_VREvent_FirmwareUpdateStarted".enum("", "1100"),
        "EVREventType_VREvent_FirmwareUpdateFinished".enum,
        "EVREventType_VREvent_KeyboardClosed".enum("", "1200"),
        "EVREventType_VREvent_KeyboardCharInput".enum,
        "EVREventType_VREvent_KeyboardDone".enum("Sent when DONE button clicked on keyboard"),
        "EVREventType_VREvent_ApplicationTransitionStarted".enum("", "1300"),
        "EVREventType_VREvent_ApplicationTransitionAborted".enum,
        "EVREventType_VREvent_ApplicationTransitionNewAppStarted".enum,
        "EVREventType_VREvent_ApplicationListUpdated".enum,
        "EVREventType_VREvent_ApplicationMimeTypeLoad".enum,
        "EVREventType_VREvent_ApplicationTransitionNewAppLaunchComplete".enum,
        "EVREventType_VREvent_ProcessConnected".enum,
        "EVREventType_VREvent_ProcessDisconnected".enum,
        "EVREventType_VREvent_Compositor_MirrorWindowShown".enum("", "1400"),
        "EVREventType_VREvent_Compositor_MirrorWindowHidden".enum,
        "EVREventType_VREvent_Compositor_ChaperoneBoundsShown".enum("", "1410"),
        "EVREventType_VREvent_Compositor_ChaperoneBoundsHidden".enum,
        "EVREventType_VREvent_TrackedCamera_StartVideoStream".enum("", "1500"),
        "EVREventType_VREvent_TrackedCamera_StopVideoStream".enum,
        "EVREventType_VREvent_TrackedCamera_PauseVideoStream".enum,
        "EVREventType_VREvent_TrackedCamera_ResumeVideoStream".enum,
        "EVREventType_VREvent_TrackedCamera_EditingSurface".enum("", "1550"),
        "EVREventType_VREvent_PerformanceTest_EnableCapture".enum("", "1600"),
        "EVREventType_VREvent_PerformanceTest_DisableCapture".enum,
        "EVREventType_VREvent_PerformanceTest_FidelityLevel".enum,
        "EVREventType_VREvent_MessageOverlay_Closed".enum("", "1650"),
        "EVREventType_VREvent_MessageOverlayCloseRequested".enum,
        "EVREventType_VREvent_Input_HapticVibration".enum("", "1700"),
        "EVREventType_VREvent_VendorSpecific_Reserved_Start".enum("", "10000"),
        "EVREventType_VREvent_VendorSpecific_Reserved_End".enum("", "19999")
    )

    EnumConstant(
        "{@code EDeviceActivityLevel}: Level of Hmd activity.",

        "EDeviceActivityLevel_k_EDeviceActivityLevel_Unknown".enum("", "-1"),
        "EDeviceActivityLevel_k_EDeviceActivityLevel_Idle".enum("No activity for the last 10 seconds."),
        "EDeviceActivityLevel_k_EDeviceActivityLevel_UserInteraction".enum("Activity (movement or prox sensor) is happening now."),
        "EDeviceActivityLevel_k_EDeviceActivityLevel_UserInteraction_Timeout".enum("No activity for the last 0.5 seconds."),
        "EDeviceActivityLevel_k_EDeviceActivityLevel_Standby".enum("Idle for at least 5 seconds (configurable in Settings -> Power Management).")
    )

    EnumConstant(
        "{@code EVRButtonId}: VR controller button and axis IDs.",

        "EVRButtonId_k_EButton_System".enum("", "0"),
        "EVRButtonId_k_EButton_ApplicationMenu".enum,
        "EVRButtonId_k_EButton_Grip".enum,
        "EVRButtonId_k_EButton_DPad_Left".enum,
        "EVRButtonId_k_EButton_DPad_Up".enum,
        "EVRButtonId_k_EButton_DPad_Right".enum,
        "EVRButtonId_k_EButton_DPad_Down".enum,
        "EVRButtonId_k_EButton_A".enum,
        "EVRButtonId_k_EButton_ProximitySensor".enum("", "31"),
        "EVRButtonId_k_EButton_Axis0".enum,
        "EVRButtonId_k_EButton_Axis1".enum,
        "EVRButtonId_k_EButton_Axis2".enum,
        "EVRButtonId_k_EButton_Axis3".enum,
        "EVRButtonId_k_EButton_Axis4".enum,
        "EVRButtonId_k_EButton_SteamVR_Touchpad".enum("", "EVRButtonId_k_EButton_Axis0"),
        "EVRButtonId_k_EButton_SteamVR_Trigger".enum("", "EVRButtonId_k_EButton_Axis1"),
        "EVRButtonId_k_EButton_Dashboard_Back".enum("", "EVRButtonId_k_EButton_Grip"),
        "EVRButtonId_k_EButton_Max".enum("", "64")
    )

    EnumConstant(
        "{@code EVRMouseButton}: used for simulated mouse events in overlay space.",

        "EVRMouseButton_VRMouseButton_Left".enum("", "1"),
        "EVRMouseButton_VRMouseButton_Right".enum("", "2"),
        "EVRMouseButton_VRMouseButton_Middle".enum("", "4")
    )

    EnumConstant(
        "{@code EDualAnalogWhich}",

        "EDualAnalogWhich_k_EDualAnalog_Left".enum("", "0"),
        "EDualAnalogWhich_k_EDualAnalog_Right".enum
    )

    EnumConstant(
        "{@code EVRInputError}",

        "EVRInputError_VRInputError_None".enum("", "0"),
        "EVRInputError_VRInputError_NameNotFound".enum,
        "EVRInputError_VRInputError_WrongType".enum,
        "EVRInputError_VRInputError_InvalidHandle".enum,
        "EVRInputError_VRInputError_InvalidParam".enum,
        "EVRInputError_VRInputError_NoSteam".enum,
        "EVRInputError_VRInputError_MaxCapacityReached".enum,
        "EVRInputError_VRInputError_IPCError".enum,
        "EVRInputError_VRInputError_NoActiveActionSet".enum,
        "EVRInputError_VRInputError_InvalidDevice".enum
    )

    EnumConstant(
        "EHiddenAreaMeshType",

        "EHiddenAreaMeshType_k_eHiddenAreaMesh_Standard".enum("", "0"),
        "EHiddenAreaMeshType_k_eHiddenAreaMesh_Inverse".enum,
        "EHiddenAreaMeshType_k_eHiddenAreaMesh_LineLoop".enum,
        "EHiddenAreaMeshType_k_eHiddenAreaMesh_Max".enum
    )

    EnumConstant(
        """
        {@code EVRControllerAxisType}: Identifies what kind of axis is on the controller at index {@code n}. Read this type with:
        ${codeBlock("""pVRSystem->Get(nControllerDeviceIndex, Prop_Axis0Type_Int32+n);""")}
        """,

        "EVRControllerAxisType_k_eControllerAxis_None".enum("", "0"),
        "EVRControllerAxisType_k_eControllerAxis_TrackPad".enum,
        "EVRControllerAxisType_k_eControllerAxis_Joystick".enum,
        "EVRControllerAxisType_k_eControllerAxis_Trigger".enum("Analog trigger data is in the X axis")
    )

    EnumConstant(
        "{@code EVRControllerEventOutputType}: determines how to provide output to the application of various event processing functions.",

        "EVRControllerEventOutputType_ControllerEventOutput_OSEvents".enum("", "0"),
        "EVRControllerEventOutputType_ControllerEventOutput_VREvents".enum
    )

    EnumConstant(
        "{@code ECollisionBoundsStyle}: Collision Bounds Style.",

        "ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_BEGINNER".enum("", "0"),
        "ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_INTERMEDIATE".enum,
        "ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_SQUARES".enum,
        "ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_ADVANCED".enum,
        "ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_NONE".enum,
        "ECollisionBoundsStyle_COLLISION_BOUNDS_STYLE_COUNT".enum
    )

    EnumConstant(
        "{@code EVROverlayError}: Errors that can occur around VR overlays.",

        "EVROverlayError_VROverlayError_None".enum("", "0"),
        "EVROverlayError_VROverlayError_UnknownOverlay".enum("", "10"),
        "EVROverlayError_VROverlayError_InvalidHandle".enum(""),
        "EVROverlayError_VROverlayError_PermissionDenied".enum(""),
        "EVROverlayError_VROverlayError_OverlayLimitExceeded".enum("No more overlays could be created because the maximum number already exist."),
        "EVROverlayError_VROverlayError_WrongVisibilityType".enum,
        "EVROverlayError_VROverlayError_KeyTooLong".enum,
        "EVROverlayError_VROverlayError_NameTooLong".enum,
        "EVROverlayError_VROverlayError_KeyInUse".enum,
        "EVROverlayError_VROverlayError_WrongTransformType".enum,
        "EVROverlayError_VROverlayError_InvalidTrackedDevice".enum,
        "EVROverlayError_VROverlayError_InvalidParameter".enum,
        "EVROverlayError_VROverlayError_ThumbnailCantBeDestroyed".enum,
        "EVROverlayError_VROverlayError_ArrayTooSmall".enum,
        "EVROverlayError_VROverlayError_RequestFailed".enum,
        "EVROverlayError_VROverlayError_InvalidTexture".enum,
        "EVROverlayError_VROverlayError_UnableToLoadFile".enum,
        "EVROverlayError_VROverlayError_KeyboardAlreadyInUse".enum,
        "EVROverlayError_VROverlayError_NoNeighbor".enum,
        "EVROverlayError_VROverlayError_TooManyMaskPrimitives".enum("", "29"),
        "EVROverlayError_VROverlayError_BadMaskPrimitive".enum,
        "EVROverlayError_VROverlayError_TextureAlreadyLocked".enum,
        "EVROverlayError_VROverlayError_TextureLockCapacityReached".enum,
        "EVROverlayError_VROverlayError_TextureNotLocked".enum
    )

    EnumConstant(
        "{@code EVRApplicationType}: enum values to pass in to #InitInternal() to identify whether the application will draw a 3D scene.",

        "EVRApplicationType_VRApplication_Other".enum("Some other kind of application that isn't covered by the other entries.", "0"),
        "EVRApplicationType_VRApplication_Scene".enum("Application will submit 3D frames."),
        "EVRApplicationType_VRApplication_Overlay".enum("Application only interacts with overlays."),
        "EVRApplicationType_VRApplication_Background".enum(
            "Application should not start SteamVR if it's not already running, and should not keep it running if everything else quits."
        ),
        "EVRApplicationType_VRApplication_Utility".enum(
            """
            Init should not try to load any drivers. The application needs access to utility interfaces (like ##VRSettings and ##VRApplications) but not
            hardware.
            """
        ),
        "EVRApplicationType_VRApplication_VRMonitor".enum("Reserved for vrmonitor."),
        "EVRApplicationType_VRApplication_SteamWatchdog".enum("Reserved for Steam"),
        "EVRApplicationType_VRApplication_Bootstrapper".enum("Start up SteamVR"),
        "EVRApplicationType_VRApplication_Max".enum("")
    )

    EnumConstant(
        "{@code EVRFirmwareError}: error codes for firmware.",

        "EVRFirmwareError_VRFirmwareError_None".enum("", "0"),
        "EVRFirmwareError_VRFirmwareError_Success".enum(""),
        "EVRFirmwareError_VRFirmwareError_Fail".enum("")
    )

    EnumConstant(
        "{@code EVRNotificationError}: error codes for notifications.",

        "EVRNotificationError_VRNotificationError_OK".enum("", "0"),
        "EVRNotificationError_VRNotificationError_InvalidNotificationId".enum("", "100"),
        "EVRNotificationError_VRNotificationError_NotificationQueueFull".enum,
        "EVRNotificationError_VRNotificationError_InvalidOverlayHandle".enum,
        "EVRNotificationError_VRNotificationError_SystemWithUserValueAlreadyExists".enum
    )

    EnumConstant(
        "{@code EVRInitError}: error codes returned by #InitInternal().",

        "EVRInitError_VRInitError_None".enum("", "0"),
        "EVRInitError_VRInitError_Unknown".enum,
        "EVRInitError_VRInitError_Init_InstallationNotFound".enum("", "100"),
        "EVRInitError_VRInitError_Init_InstallationCorrupt".enum,
        "EVRInitError_VRInitError_Init_VRClientDLLNotFound".enum,
        "EVRInitError_VRInitError_Init_FileNotFound".enum,
        "EVRInitError_VRInitError_Init_FactoryNotFound".enum,
        "EVRInitError_VRInitError_Init_InterfaceNotFound".enum,
        "EVRInitError_VRInitError_Init_InvalidInterface".enum,
        "EVRInitError_VRInitError_Init_UserConfigDirectoryInvalid".enum,
        "EVRInitError_VRInitError_Init_HmdNotFound".enum,
        "EVRInitError_VRInitError_Init_NotInitialized".enum,
        "EVRInitError_VRInitError_Init_PathRegistryNotFound".enum,
        "EVRInitError_VRInitError_Init_NoConfigPath".enum,
        "EVRInitError_VRInitError_Init_NoLogPath".enum,
        "EVRInitError_VRInitError_Init_PathRegistryNotWritable".enum,
        "EVRInitError_VRInitError_Init_AppInfoInitFailed".enum,
        "EVRInitError_VRInitError_Init_Retry".enum("Used internally to cause retries to vrserver."),
        "EVRInitError_VRInitError_Init_InitCanceledByUser".enum("The calling application should silently exit. The user canceled app startup."),
        "EVRInitError_VRInitError_Init_AnotherAppLaunching".enum,
        "EVRInitError_VRInitError_Init_SettingsInitFailed".enum,
        "EVRInitError_VRInitError_Init_ShuttingDown".enum,
        "EVRInitError_VRInitError_Init_TooManyObjects".enum,
        "EVRInitError_VRInitError_Init_NoServerForBackgroundApp".enum,
        "EVRInitError_VRInitError_Init_NotSupportedWithCompositor".enum,
        "EVRInitError_VRInitError_Init_NotAvailableToUtilityApps".enum,
        "EVRInitError_VRInitError_Init_Internal".enum,
        "EVRInitError_VRInitError_Init_HmdDriverIdIsNone".enum,
        "EVRInitError_VRInitError_Init_HmdNotFoundPresenceFailed".enum,
        "EVRInitError_VRInitError_Init_VRMonitorNotFound".enum,
        "EVRInitError_VRInitError_Init_VRMonitorStartupFailed".enum,
        "EVRInitError_VRInitError_Init_LowPowerWatchdogNotSupported".enum,
        "EVRInitError_VRInitError_Init_InvalidApplicationType".enum,
        "EVRInitError_VRInitError_Init_NotAvailableToWatchdogApps".enum,
        "EVRInitError_VRInitError_Init_WatchdogDisabledInSettings".enum,
        "EVRInitError_VRInitError_Init_VRDashboardNotFound".enum,
        "EVRInitError_VRInitError_Init_VRDashboardStartupFailed".enum,
        "EVRInitError_VRInitError_Init_VRHomeNotFound".enum,
        "EVRInitError_VRInitError_Init_VRHomeStartupFailed".enum,
        "EVRInitError_VRInitError_Init_RebootingBusy".enum,
	    "EVRInitError_VRInitError_Init_FirmwareUpdateBusy".enum,
	    "EVRInitError_VRInitError_Init_FirmwareRecoveryBusy".enum,
        "EVRInitError_VRInitError_Init_USBServiceBusy".enum,
        "EVRInitError_VRInitError_Driver_Failed".enum("", "200"),
        "EVRInitError_VRInitError_Driver_Unknown".enum,
        "EVRInitError_VRInitError_Driver_HmdUnknown".enum,
        "EVRInitError_VRInitError_Driver_NotLoaded".enum,
        "EVRInitError_VRInitError_Driver_RuntimeOutOfDate".enum,
        "EVRInitError_VRInitError_Driver_HmdInUse".enum,
        "EVRInitError_VRInitError_Driver_NotCalibrated".enum,
        "EVRInitError_VRInitError_Driver_CalibrationInvalid".enum,
        "EVRInitError_VRInitError_Driver_HmdDisplayNotFound".enum,
        "EVRInitError_VRInitError_Driver_TrackedDeviceInterfaceUnknown".enum,
        "EVRInitError_VRInitError_Driver_HmdDriverIdOutOfBounds".enum("", "211"),
        "EVRInitError_VRInitError_Driver_HmdDisplayMirrored".enum,
        "EVRInitError_VRInitError_IPC_ServerInitFailed".enum("", "300"),
        "EVRInitError_VRInitError_IPC_ConnectFailed".enum,
        "EVRInitError_VRInitError_IPC_SharedStateInitFailed".enum,
        "EVRInitError_VRInitError_IPC_CompositorInitFailed".enum,
        "EVRInitError_VRInitError_IPC_MutexInitFailed".enum,
        "EVRInitError_VRInitError_IPC_Failed".enum,
        "EVRInitError_VRInitError_IPC_CompositorConnectFailed".enum,
        "EVRInitError_VRInitError_IPC_CompositorInvalidConnectResponse".enum,
        "EVRInitError_VRInitError_IPC_ConnectFailedAfterMultipleAttempts".enum,
        "EVRInitError_VRInitError_Compositor_Failed".enum("", "400"),
        "EVRInitError_VRInitError_Compositor_D3D11HardwareRequired".enum,
        "EVRInitError_VRInitError_Compositor_FirmwareRequiresUpdate".enum,
        "EVRInitError_VRInitError_Compositor_OverlayInitFailed".enum,
        "EVRInitError_VRInitError_Compositor_ScreenshotsInitFailed".enum,
        "EVRInitError_VRInitError_Compositor_UnableToCreateDevice".enum,
        "EVRInitError_VRInitError_VendorSpecific_UnableToConnectToOculusRuntime".enum("", "1000"),
        "EVRInitError_VRInitError_VendorSpecific_WindowsNotInDevMode".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_CantOpenDevice".enum("", "1101"),
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToRequestConfigStart".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_NoStoredConfig".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigTooBig".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigTooSmall".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToInitZLib".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_CantReadFirmwareVersion".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToSendUserDataStart".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToGetUserDataStart".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_UnableToGetUserDataNext".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_UserDataAddressRange".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_UserDataError".enum,
        "EVRInitError_VRInitError_VendorSpecific_HmdFound_ConfigFailedSanityCheck".enum,
        "EVRInitError_VRInitError_Steam_SteamInstallationNotFound".enum("", "2000")
    )

    EnumConstant(
        "EVRScreenshotType",

        "EVRScreenshotType_VRScreenshotType_None".enum("", "0"),
        "EVRScreenshotType_VRScreenshotType_Mono".enum("the VR filename is ignored (can be nullptr), this is a normal flat single shot."),
        "EVRScreenshotType_VRScreenshotType_Stereo".enum("The VR image should be a side-by-side with the left eye image on the left."),
        "EVRScreenshotType_VRScreenshotType_Cubemap".enum("The VR image should be six square images composited horizontally."),
        "EVRScreenshotType_VRScreenshotType_MonoPanorama".enum,
        "EVRScreenshotType_VRScreenshotType_StereoPanorama".enum(
            "above/below with left eye panorama being the above image. Image is typically square with the panorama being 2x horizontal."
        )
    )

    EnumConstant(
        "EVRScreenshotPropertyFilenames",

        "EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_Preview".enum("", "0"),
        "EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_VR".enum
    )

    EnumConstant(
        "EVRTrackedCameraError",

        "EVRTrackedCameraError_VRTrackedCameraError_None".enum("", "0"),
        "EVRTrackedCameraError_VRTrackedCameraError_OperationFailed".enum("", "100"),
        "EVRTrackedCameraError_VRTrackedCameraError_InvalidHandle".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameHeaderVersion".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_OutOfHandles".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_IPCFailure".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_NotSupportedForThisDevice".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_SharedMemoryFailure".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_FrameBufferingFailure".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_StreamSetupFailure".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_InvalidGLTextureId".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_InvalidSharedTextureHandle".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_FailedToGetGLTextureId".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_SharedTextureFailure".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_NoFrameAvailable".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_InvalidArgument".enum,
        "EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameBufferSize".enum
    )

    EnumConstant(
        "EVRTrackedCameraFrameType",

        "EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted".enum("This is the camera video frame size in pixels, still distorted.", "0"),
        "EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted".enum(
            "In pixels, an undistorted inscribed rectangle region without invalid regions. This size is subject to changes shortly."
        ),
        "EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted".enum(
            "In pixels, maximum undistorted with invalid regions. Non zero alpha component identifies valid regions."
        ),
        "EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES".enum
    )

    EnumConstant(
        "{@code EVRApplicationError}: Used for all errors reported by the ##VRApplications interface.",

        "EVRApplicationError_VRApplicationError_None".enum("", "0"),
        "EVRApplicationError_VRApplicationError_AppKeyAlreadyExists".enum("Only one application can use any given key.", "100"),
        "EVRApplicationError_VRApplicationError_NoManifest".enum("the running application does not have a manifest."),
        "EVRApplicationError_VRApplicationError_NoApplication".enum("No application is running."),
        "EVRApplicationError_VRApplicationError_InvalidIndex".enum,
        "EVRApplicationError_VRApplicationError_UnknownApplication".enum("the application could not be found."),
        "EVRApplicationError_VRApplicationError_IPCFailed".enum("An IPC failure caused the request to fail."),
        "EVRApplicationError_VRApplicationError_ApplicationAlreadyRunning".enum(""),
        "EVRApplicationError_VRApplicationError_InvalidManifest".enum(""),
        "EVRApplicationError_VRApplicationError_InvalidApplication".enum(""),
        "EVRApplicationError_VRApplicationError_LaunchFailed".enum("the process didn't start."),
        "EVRApplicationError_VRApplicationError_ApplicationAlreadyStarting".enum("the system was already starting the same application."),
        "EVRApplicationError_VRApplicationError_LaunchInProgress".enum("The system was already starting a different application."),
        "EVRApplicationError_VRApplicationError_OldApplicationQuitting".enum,
        "EVRApplicationError_VRApplicationError_TransitionAborted".enum,
        "EVRApplicationError_VRApplicationError_IsTemplate".enum(
            "error when you try to call {@code LaunchApplication()} on a template type app (use {@code LaunchTemplateApplication})."
        ),
        "EVRApplicationError_VRApplicationError_SteamVRIsExiting".enum,
        "EVRApplicationError_VRApplicationError_BufferTooSmall".enum("The provided buffer was too small to fit the requested data.", "200"),
        "EVRApplicationError_VRApplicationError_PropertyNotSet".enum("The requested property was not set."),
        "EVRApplicationError_VRApplicationError_UnknownProperty".enum,
        "EVRApplicationError_VRApplicationError_InvalidParameter".enum
    )

    EnumConstant(
        "{@code EVRApplicationProperty}: these are the properties available on applications.",

        "EVRApplicationProperty_VRApplicationProperty_Name_String".enum("", "0"),
        "EVRApplicationProperty_VRApplicationProperty_LaunchType_String".enum("", "11"),
        "EVRApplicationProperty_VRApplicationProperty_WorkingDirectory_String".enum,
        "EVRApplicationProperty_VRApplicationProperty_BinaryPath_String".enum,
        "EVRApplicationProperty_VRApplicationProperty_Arguments_String".enum,
        "EVRApplicationProperty_VRApplicationProperty_URL_String".enum,
        "EVRApplicationProperty_VRApplicationProperty_Description_String".enum("", "50"),
        "EVRApplicationProperty_VRApplicationProperty_NewsURL_String".enum,
        "EVRApplicationProperty_VRApplicationProperty_ImagePath_String".enum,
        "EVRApplicationProperty_VRApplicationProperty_Source_String".enum,
        "EVRApplicationProperty_VRApplicationProperty_ActionManifestURL_String".enum,
        "EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool".enum("", "60"),
        "EVRApplicationProperty_VRApplicationProperty_IsTemplate_Bool".enum,
        "EVRApplicationProperty_VRApplicationProperty_IsInstanced_Bool".enum,
        "EVRApplicationProperty_VRApplicationProperty_IsInternal_Bool".enum,
        "EVRApplicationProperty_VRApplicationProperty_WantsCompositorPauseInStandby_Bool".enum,
        "EVRApplicationProperty_VRApplicationProperty_LastLaunchTime_Uint64".enum("", "70")
    )

    EnumConstant(
        "{@code EVRApplicationTransitionState}: These are states the scene application startup process will go through.",

        "EVRApplicationTransitionState_VRApplicationTransition_None".enum("", "0"),
        "EVRApplicationTransitionState_VRApplicationTransition_OldAppQuitSent".enum("", "10"),
        "EVRApplicationTransitionState_VRApplicationTransition_WaitingForExternalLaunch".enum,
        "EVRApplicationTransitionState_VRApplicationTransition_NewAppLaunched".enum("", "20")
    )

    EnumConstant(
        "ChaperoneCalibrationState",

        "ChaperoneCalibrationState_OK".enum("Chaperone is fully calibrated and working correctly.", "1"),
        "ChaperoneCalibrationState_Warning".enum("", "100"),
        "ChaperoneCalibrationState_Warning_BaseStationMayHaveMoved".enum("A base station thinks that it might have moved."),
        "ChaperoneCalibrationState_Warning_BaseStationRemoved".enum("There are less base stations than when calibrated."),
        "ChaperoneCalibrationState_Warning_SeatedBoundsInvalid".enum("Seated bounds haven't been calibrated for the current tracking center."),
        "ChaperoneCalibrationState_Error".enum("The UniverseID is invalid.", "200"),
        "ChaperoneCalibrationState_Error_BaseStationUninitialized".enum("Tracking center hasn't be calibrated for at least one of the base stations."),
        "ChaperoneCalibrationState_Error_BaseStationConflict".enum("Tracking center is calibrated, but base stations disagree on the tracking space."),
        "ChaperoneCalibrationState_Error_PlayAreaInvalid".enum("Play Area hasn't been calibrated for the current tracking center."),
        "ChaperoneCalibrationState_Error_CollisionBoundsInvalid".enum("Collision Bounds haven't been calibrated for the current tracking center.")
    )

    EnumConstant(
        "EChaperoneConfigFile",

        "EChaperoneConfigFile_Live".enum("The live chaperone config, used by most applications and games.", "1"),
        "EChaperoneConfigFile_Temp".enum("The temporary chaperone config, used to live-preview collision bounds in room setup.")
    )

    EnumConstant(
        "EChaperoneImportFlags",

        "EChaperoneImportFlags_EChaperoneImport_BoundsOnly".enum("", "1")
    )

    EnumConstant(
        "{@code EVRCompositorError}: Errors that can occur with the VR compositor.",

        "EVRCompositorError_VRCompositorError_None".enum("", "0"),
        "EVRCompositorError_VRCompositorError_RequestFailed".enum,
        "EVRCompositorError_VRCompositorError_IncompatibleVersion".enum("", "100"),
        "EVRCompositorError_VRCompositorError_DoNotHaveFocus".enum,
        "EVRCompositorError_VRCompositorError_InvalidTexture".enum,
        "EVRCompositorError_VRCompositorError_IsNotSceneApplication".enum,
        "EVRCompositorError_VRCompositorError_TextureIsOnWrongDevice".enum,
        "EVRCompositorError_VRCompositorError_TextureUsesUnsupportedFormat".enum,
        "EVRCompositorError_VRCompositorError_SharedTexturesNotSupported".enum,
        "EVRCompositorError_VRCompositorError_IndexOutOfRange".enum,
        "EVRCompositorError_VRCompositorError_AlreadySubmitted".enum,
        "EVRCompositorError_VRCompositorError_InvalidBounds".enum
    )

    EnumConstant(
        "{@code EVRCompositorTimingMode}: Timing mode passed to #SetExplicitTimingMode().",

        "EVRCompositorTimingMode_VRCompositorTimingMode_Implicit".enum("", "0"),
        "EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_RuntimePerformsPostPresentHandoff".enum,
        "EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_ApplicationPerformsPostPresentHandoff".enum
    )

    EnumConstant(
        "{@code VROverlayInputMethod}: Types of input supported by VR Overlays.",

        "VROverlayInputMethod_None".enum("No input events will be generated automatically for this overlay.", "0"),
        "VROverlayInputMethod_Mouse".enum("Tracked controllers will get mouse events automatically."),
        "VROverlayInputMethod_DualAnalog".enum("Analog inputs from tracked controllers are turned into DualAnalog events.")
    )

    EnumConstant(
        "{@code VROverlayTransformType}: Allows the caller to figure out which overlay transform getter to call.",

        "VROverlayTransformType_VROverlayTransform_Absolute".enum("", "0"),
        "VROverlayTransformType_VROverlayTransform_TrackedDeviceRelative".enum,
        "VROverlayTransformType_VROverlayTransform_SystemOverlay".enum,
        "VROverlayTransformType_VROverlayTransform_TrackedComponent".enum
    )

    EnumConstant(
        "{@code VROverlayFlags}: Overlay control settings.",

        "VROverlayFlags_None".enum("", "0"),
        "VROverlayFlags_Curved".enum("Only takes effect when rendered using the high quality render path (see #SetHighQualityOverlay())."),
        "VROverlayFlags_RGSS4X".enum("Only takes effect when rendered using the high quality render path (see #SetHighQualityOverlay())."),
        "VROverlayFlags_NoDashboardTab".enum("Set this flag on a dashboard overlay to prevent a tab from showing up for that overlay."),
        "VROverlayFlags_AcceptsGamepadEvents".enum("Set this flag on a dashboard that is able to deal with gamepad focus events."),
        "VROverlayFlags_ShowGamepadFocus".enum("Indicates that the overlay should dim/brighten to show gamepad focus."),
        "VROverlayFlags_SendVRScrollEvents".enum("When in #VROverlayInputMethod_Mouse you can optionally enable sending ##VREventScroll."),
        "VROverlayFlags_SendVRTouchpadEvents".enum,
        "VROverlayFlags_ShowTouchPadScrollWheel".enum(
            """
            If set this will render a vertical scroll wheel on the primary controller, only needed if not using VROverlayFlags_SendVRScrollEvents but you still
            want to represent a scroll wheel.
            """
        ),
        "VROverlayFlags_TransferOwnershipToInternalProcess".enum(
            "If this is set ownership and render access to the overlay are transferred to the new scene process on a call to #LaunchInternalProcess()."
        ),
        "VROverlayFlags_SideBySide_Parallel".enum("If set, renders 50% of the texture in each eye, side by side. Texture is left/right."),
        "VROverlayFlags_SideBySide_Crossed".enum("If set, renders 50% of the texture in each eye, side by side. Texture is crossed and right/left."),
        "VROverlayFlags_Panorama".enum("Texture is a panorama."),
        "VROverlayFlags_StereoPanorama".enum("Texture is a stereo panorama."),
        "VROverlayFlags_SortWithNonSceneOverlays".enum(
            """
            If this is set on an overlay owned by the scene application that overlay will be sorted with the "Other" overlays on top of all other scene
            overlays.
            """
        ),
        "VROverlayFlags_VisibleInDashboard".enum("If set, the overlay will be shown in the dashboard, otherwise it will be hidden.")
    )

    EnumConstant(
        "VRMessageOverlayResponse",

        "VRMessageOverlayResponse_ButtonPress_0".enum("", "0"),
        "VRMessageOverlayResponse_ButtonPress_1".enum,
        "VRMessageOverlayResponse_ButtonPress_2".enum,
        "VRMessageOverlayResponse_ButtonPress_3".enum,
        "VRMessageOverlayResponse_CouldntFindSystemOverlay".enum,
        "VRMessageOverlayResponse_CouldntFindOrCreateClientOverlay".enum,
        "VRMessageOverlayResponse_ApplicationQuit".enum
    )

    EnumConstant(
        "{@code EGamepadTextInputMode}: Input modes for the Big Picture gamepad text entry.",

        "EGamepadTextInputMode_k_EGamepadTextInputModeNormal".enum("", "0"),
        "EGamepadTextInputMode_k_EGamepadTextInputModePassword".enum,
        "EGamepadTextInputMode_k_EGamepadTextInputModeSubmit".enum
    )

    EnumConstant(
        "{@code EGamepadTextInputLineMode}: Controls number of allowed lines for the Big Picture gamepad text entry.",

        "EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine".enum("", "0"),
        "EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines".enum
    )

    EnumConstant(
        "{@code EOverlayDirection}: Directions for changing focus between overlays with the gamepad.",

        "EOverlayDirection_OverlayDirection_Up".enum("", "0"),
        "EOverlayDirection_OverlayDirection_Down".enum,
        "EOverlayDirection_OverlayDirection_Left".enum,
        "EOverlayDirection_OverlayDirection_Right".enum,
        "EOverlayDirection_OverlayDirection_Count".enum
    )

    EnumConstant(
        "EVROverlayIntersectionMaskPrimitiveType",

        "EVROverlayIntersectionMaskPrimitiveType_OverlayIntersectionPrimitiveType_Rectangle".enum("", "0"),
        "EVROverlayIntersectionMaskPrimitiveType_OverlayIntersectionPrimitiveType_Circle".enum
    )

    EnumConstant(
        "{@code EVRRenderModelError}: Errors that can occur with the VR compositor.",

        "EVRRenderModelError_VRRenderModelError_None".enum("", "0"),
        "EVRRenderModelError_VRRenderModelError_Loading".enum("", "100"),
        "EVRRenderModelError_VRRenderModelError_NotSupported".enum("", "200"),
        "EVRRenderModelError_VRRenderModelError_InvalidArg".enum("", "300"),
        "EVRRenderModelError_VRRenderModelError_InvalidModel".enum,
        "EVRRenderModelError_VRRenderModelError_NoShapes".enum,
        "EVRRenderModelError_VRRenderModelError_MultipleShapes".enum,
        "EVRRenderModelError_VRRenderModelError_TooManyVertices".enum,
        "EVRRenderModelError_VRRenderModelError_MultipleTextures".enum,
        "EVRRenderModelError_VRRenderModelError_BufferTooSmall".enum,
        "EVRRenderModelError_VRRenderModelError_NotEnoughNormals".enum,
        "EVRRenderModelError_VRRenderModelError_NotEnoughTexCoords".enum,
        "EVRRenderModelError_VRRenderModelError_InvalidTexture".enum("", "400")
    )

    EnumConstant(
        "EVRComponentProperty",

        "EVRComponentProperty_VRComponentProperty_IsStatic".enum("", "1"),
        "EVRComponentProperty_VRComponentProperty_IsVisible".enum("", "2"),
        "EVRComponentProperty_VRComponentProperty_IsTouched".enum("", "4"),
        "EVRComponentProperty_VRComponentProperty_IsPressed".enum("", "8"),
        "EVRComponentProperty_VRComponentProperty_IsScrolled".enum("", "16")
    )

    EnumConstant(
        "{@code EVRNotificationType}: Be aware that the notification type is used as 'priority' to pick the next notification.",

        "EVRNotificationType_Transient".enum(
            """
            Transient notifications are automatically hidden after a period of time set by the user. They are used for things like information and chat
            messages that do not require user interaction.
            """,
            "0"
        ),
        "EVRNotificationType_Persistent".enum(
            """
            Persistent notifications are shown to the user until they are hidden by calling #RemoveNotification(). They are used for things like phone calls
            and alarms that require user interaction.
            """
        ),
        "EVRNotificationType_Transient_SystemWithUserValue".enum(
            """
            System notifications are shown no matter what. It is expected, that the {@code ulUserValue} is used as ID. If there is already a system
            notification in the queue with that ID it is not accepted into the queue to prevent spamming with system notification.
            """
        )
    )

    EnumConstant(
        "EVRNotificationStyle",

        "EVRNotificationStyle_None".enum("Creates a notification with minimal external styling.", "0"),
        "EVRNotificationStyle_Application".enum(
            "Used for notifications about overlay-level status. In Steam this is used for events like downloads completing.",
            "100"
        ),
        "EVRNotificationStyle_Contact_Disabled".enum(
            "Used for notifications about contacts that are unknown or not available. In Steam this is used for friend invitations and offline friends.",
            "200"
        ),
        "EVRNotificationStyle_Contact_Enabled".enum(
            "Used for notifications about contacts that are available but inactive. In Steam this is used for friends that are online but not playing a game."
        ),
        "EVRNotificationStyle_Contact_Active".enum(
            """
            Used for notifications about contacts that are available and active. In Steam this is used for friends that are online and currently running a
            game.
            """
        )
    )

    EnumConstant(
        "EVRSettingsError",

        "EVRSettingsError_VRSettingsError_None".enum("", "0"),
        "EVRSettingsError_VRSettingsError_IPCFailed".enum,
        "EVRSettingsError_VRSettingsError_WriteFailed".enum,
        "EVRSettingsError_VRSettingsError_ReadFailed".enum,
        "EVRSettingsError_VRSettingsError_JsonParseFailed".enum,
        "EVRSettingsError_VRSettingsError_UnsetSettingHasNoDefault".enum(
            "This will be returned if the setting does not appear in the appropriate default file and has not been set.",
            "5"
        )
    )

    EnumConstant(
        "{@code EVRScreenshotError}: Errors that can occur with the VR compositor.",

        "EVRScreenshotError_VRScreenshotError_None".enum("", "0"),
        "EVRScreenshotError_VRScreenshotError_RequestFailed".enum,
        "EVRScreenshotError_VRScreenshotError_IncompatibleVersion".enum("", "100"),
        "EVRScreenshotError_VRScreenshotError_NotFound".enum,
        "EVRScreenshotError_VRScreenshotError_BufferTooSmall".enum,
        "EVRScreenshotError_VRScreenshotError_ScreenshotAlreadyInProgress".enum("", "108")
    )

    uint32_t(
        "InitInternal",
        "Initializes the connection to the VR hardware.",

        Check(1)..EVRInitError.p.OUT("peError", "a buffer in which to store the error code"),
        EVRApplicationType.IN("eType", "the application type", "EVRApplicationType_\\w+"),

        returnDoc = "a VR interface handles token"
    )

    void(
        "ShutdownInternal",
        """
        Shuts down the connection to the VR hardware and cleans up the OpenVR API. The {@code IVRSystem} pointer returned by #InitInternal() will be invalid
        after this call is made.
        """
    )

    bool(
        "IsHmdPresent",
        """
        Returns true if the system believes that an HMD is present on the system. This function is much faster than initializing all of OpenVR just to check
        for an HMD. Use it when you have a piece of UI that you want to enable only for users with an HMD.

        This function will return true in situations where #InitInternal() will return #NULL. It is a quick way to eliminate users that have no VR hardware,
        but there are some startup conditions that can only be detected by starting the system.
        """
    )

    intptr_t(
        "GetGenericInterface",
        """
        Requests an interface by name from OpenVR. It will return #NULL and pass back an error in {@code peError} if the interface can't be found. It will
        always return #NULL if #InitInternal() has not been called successfully.
        """,

        charASCII.const.p.IN("pchInterfaceVersion", "the interface name and version"),
        Check(1)..EVRInitError.p.OUT("peError", "a buffer in which to store the error code")
    )

    bool(
        "IsRuntimeInstalled",
        "Returns true if the OpenVR runtime is installed on the system."
    )

    // TODO: deprecated?
    charASCII.p(
        "RuntimePath",
        "Returns where the OpenVR runtime is installed."
    )

    // TODO: deprecated?
    bool(
        "IsInterfaceVersionValid",
        "Returns whether the interface of the specified version exists.",

        charASCII.const.p.IN("pchInterfaceVersion", "the interface name and version")
    )

    // TODO: deprecated?
    uint32_t(
        "GetInitToken",
        "Returns a token that represents whether the VR interface handles need to be reloaded."
    )

    charASCII.const.p(
        "GetVRInitErrorAsSymbol",
        "Returns the {@code EVRInitError} enum value as a string. It can be called any time, regardless of whether the VR system is started up.",

        EVRInitError.IN("error", "the error code")
    )

    charASCII.const.p(
        "GetVRInitErrorAsEnglishDescription",
        """
        Returns an english string for an {@code EVRInitError}.

        Applications should call #GetVRInitErrorAsSymbol() instead and use that as a key to look up their own localized error message. This function may be
        called outside of #InitInternal() / #ShutdownInternal().
        """,

        EVRInitError.IN("error", "the error code")
    )
}