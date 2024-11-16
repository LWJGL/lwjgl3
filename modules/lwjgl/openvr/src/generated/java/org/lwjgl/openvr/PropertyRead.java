/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct PropertyRead_t {
 *     ETrackedDeviceProperty {@link #prop};
 *     void * pvBuffer;
 *     uint32_t unBufferSize;
 *     PropertyTypeTag_t unTag;
 *     uint32_t unRequiredBufferSize;
 *     ETrackedPropertyError {@link #eError};
 * }</code></pre>
 */
@NativeType("struct PropertyRead_t")
public class PropertyRead extends Struct<PropertyRead> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROP,
        PVBUFFER,
        UNBUFFERSIZE,
        UNTAG,
        UNREQUIREDBUFFERSIZE,
        EERROR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROP = layout.offsetof(0);
        PVBUFFER = layout.offsetof(1);
        UNBUFFERSIZE = layout.offsetof(2);
        UNTAG = layout.offsetof(3);
        UNREQUIREDBUFFERSIZE = layout.offsetof(4);
        EERROR = layout.offsetof(5);
    }

    protected PropertyRead(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected PropertyRead create(long address, @Nullable ByteBuffer container) {
        return new PropertyRead(address, container);
    }

    /**
     * Creates a {@code PropertyRead} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public PropertyRead(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** one of:<br><table><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Invalid}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingSystemName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ModelNumber_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SerialNumber_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_RenderModelName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_WillDriftInYaw_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ManufacturerName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingFirmwareVersion_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HardwareRevision_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AllWirelessDongleDescriptions_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ConnectedWirelessDongle_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceIsWireless_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceIsCharging_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceBatteryPercentage_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_StatusDisplayTransform_Matrix34}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_UpdateAvailable_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ManualUpdate_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HardwareRevision_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FPGAVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_VRCVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_RadioVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DongleVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_BlockServerShutdown_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CanUnifyCoordinateSystemWithHmd_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ContainsProximitySensor_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceProvidesBatteryStatus_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceCanPowerOff_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ProgrammingTarget_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DeviceClass_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasCamera_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverVersion_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_ForceUpdateRequired_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ViveSystemButtonFixRequired_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ParentDriver_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ResourceRoot_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_RegisteredDeviceType_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_InputProfilePath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NeverTracked_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NumCameras_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraFrameLayout_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraStreamFormat_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AdditionalDeviceSettingsPath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Identifiable_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_BootloaderVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AdditionalSystemReportData_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CompositeFirmwareVersion_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Firmware_RemindUpdate_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_PeripheralApplicationVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ManufacturerSerialNumber_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ComputedSerialNumber_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_EstimatedDeviceFirstUseTime_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DevicePowerUsage_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_IgnoreMotionForStandby_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ActualTrackingSystemName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ReportsTimeSinceVSync_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SecondsFromVsyncToPhotons_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayFrequency_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_UserIpdMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CurrentUniverseId_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_PreviousUniverseId_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_IsOnDesktop_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCType_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCOffset_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCScale_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_EdidVendorID_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageLeft_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageRight_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCBlackClamp_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_EdidProductID_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraToHeadTransform_Matrix34}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCType_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCOffset_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCScale_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCPrescale_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayGCImage_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterLeftU_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterLeftV_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterRightU_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_LensCenterRightV_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_UserHeadToEyeDepthMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraFirmwareDescription_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayFPGAVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayBootloaderVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayHardwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AudioFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraCompatibilityMode_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ScreenshotHorizontalFieldOfViewDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ScreenshotVerticalFieldOfViewDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplaySuppressed_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayAllowNightMode_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageWidth_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageHeight_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageNumChannels_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMCImageData_Binary}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SecondsFromPhotonsToVblank_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverDirectModeSendsVsyncEvents_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayDebugMode_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_GraphicsAdapterLuid_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverProvidedChaperonePath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ExpectedTrackingReferenceCount_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ExpectedControllerCount_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathControllerLeftDeviceOff_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathControllerRightDeviceOff_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathTrackingReferenceDeviceOff_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DoNotApplyPrediction_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraToHeadTransforms_Matrix34_Array}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DistortionMeshResolution_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverIsDrawingControllers_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestsApplicationPause_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestsReducedRendering_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_MinimumIpdStepMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AudioBridgeFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ImageBridgeFirmwareVersion_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ImuToHeadTransform_Matrix34}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ImuFactoryGyroBias_Vector3}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ImuFactoryGyroScale_Vector3}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ImuFactoryAccelerometerBias_Vector3}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ImuFactoryAccelerometerScale_Vector3}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ConfigurationIncludesLighthouse20Features_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AdditionalRadioFeatures_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraWhiteBalance_Vector4_Array}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraDistortionFunction_Int32_Array}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraDistortionCoefficients_Float_Array}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ExpectedControllerType_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HmdTrackingStyle_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverProvidedChaperoneVisibility_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HmdColumnCorrectionSettingPrefix_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraSupportsCompatibilityModes_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SupportsRoomViewDepthProjection_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayAvailableFrameRates_Float_Array}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplaySupportsMultipleFramerates_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayColorMultLeft_Vector3}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayColorMultRight_Vector3}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplaySupportsRuntimeFramerateChange_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplaySupportsAnalogGain_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMinAnalogGain_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayMaxAnalogGain_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraExposureTime_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CameraGlobalGain_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DashboardScale_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_PeerButtonInfo_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_SupportsHDR10_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_EnableParallelRenderCameras_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverProvidedChaperoneJson_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ForceSystemLayerUseAppPoses_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_IpdUIRangeMinMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_IpdUIRangeMaxMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_SupportsHDCP14LegacyCompat_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_SupportsMicMonitoring_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_SupportsDisplayPortTrainingMode_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_SupportsRoomViewDirect_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_SupportsAppThrottling_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_SupportsGpuBusMonitoring_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverDisplaysIPDChanges_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Driver_Reserved_01}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DSCVersion_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DSCSliceCount_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DSCBPPx16_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_MaxDistortedTextureWidth_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_MaxDistortedTextureHeight_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Hmd_AllowSupersampleFiltering_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestedMuraCorrectionMode_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerLeft_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerRight_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerTop_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_InnerBottom_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterLeft_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterRight_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterTop_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DriverRequestedMuraFeather_OuterBottom_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Audio_DefaultPlaybackDeviceId_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Audio_DefaultRecordingDeviceId_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Audio_DefaultPlaybackDeviceVolume_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Audio_SupportsDualSpeakerAndJackOutput_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Audio_DriverManagesPlaybackVolumeControl_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Audio_DriverPlaybackVolume_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Audio_DriverPlaybackMute_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Audio_DriverManagesRecordingVolumeControl_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Audio_DriverRecordingVolume_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Audio_DriverRecordingMute_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_AttachedDeviceId_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SupportedButtons_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis0Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis1Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis2Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis3Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Axis4Type_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ControllerRoleHint_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewLeftDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewRightDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewTopDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_FieldOfViewBottomDegrees_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingRangeMinimumMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackingRangeMaximumMeters_Float}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ModeLabel_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_CanWirelessIdentify_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_Nonce_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_IconPathName_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceOff_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearching_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceSearchingAlert_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceReady_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceReadyAlert_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceNotReady_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceStandby_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceAlertLow_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_NamedIconPathDeviceStandbyAlert_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_Start}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_DisplayHiddenArea_Binary_End}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ParentContainer}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_OverrideContainer_Uint64}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_UserConfigPath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_InstallPath_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasDisplayComponent_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasControllerComponent_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasCameraComponent_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasDriverDirectModeComponent_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasVirtualDisplayComponent_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_HasSpatialAnchorsSupport_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_SupportsXrTextureSets_Bool}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ControllerType_String}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_ControllerHandSelectionPriority_Int32}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_Start}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_VendorSpecific_Reserved_End}</td></tr><tr><td>{@link VR#ETrackedDeviceProperty_Prop_TrackedDeviceProperty_Max}</td></tr></table> */
    @NativeType("ETrackedDeviceProperty")
    public int prop() { return nprop(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pvBuffer} field. */
    @NativeType("void *")
    public ByteBuffer pvBuffer() { return npvBuffer(address()); }
    /** @return the value of the {@code unBufferSize} field. */
    @NativeType("uint32_t")
    public int unBufferSize() { return nunBufferSize(address()); }
    /** @return the value of the {@code unTag} field. */
    @NativeType("PropertyTypeTag_t")
    public int unTag() { return nunTag(address()); }
    /** @return the value of the {@code unRequiredBufferSize} field. */
    @NativeType("uint32_t")
    public int unRequiredBufferSize() { return nunRequiredBufferSize(address()); }
    /** one of:<br><table><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_Success}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_WrongDataType}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_WrongDeviceClass}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_BufferTooSmall}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_UnknownProperty}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidDevice}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_CouldNotContactServer}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_ValueNotProvidedByDevice}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_StringExceedsMaximumLength}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_NotYetAvailable}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_PermissionDenied}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidOperation}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_CannotWriteToWildcards}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_IPCReadFailure}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_OutOfMemory}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidContainer}</td></tr></table> */
    @NativeType("ETrackedPropertyError")
    public int eError() { return neError(address()); }

    /** Sets the specified value to the {@link #prop} field. */
    public PropertyRead prop(@NativeType("ETrackedDeviceProperty") int value) { nprop(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pvBuffer} field. */
    public PropertyRead pvBuffer(@NativeType("void *") ByteBuffer value) { npvBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code unTag} field. */
    public PropertyRead unTag(@NativeType("PropertyTypeTag_t") int value) { nunTag(address(), value); return this; }
    /** Sets the specified value to the {@code unRequiredBufferSize} field. */
    public PropertyRead unRequiredBufferSize(@NativeType("uint32_t") int value) { nunRequiredBufferSize(address(), value); return this; }
    /** Sets the specified value to the {@link #eError} field. */
    public PropertyRead eError(@NativeType("ETrackedPropertyError") int value) { neError(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public PropertyRead set(
        int prop,
        ByteBuffer pvBuffer,
        int unTag,
        int unRequiredBufferSize,
        int eError
    ) {
        prop(prop);
        pvBuffer(pvBuffer);
        unTag(unTag);
        unRequiredBufferSize(unRequiredBufferSize);
        eError(eError);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public PropertyRead set(PropertyRead src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code PropertyRead} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static PropertyRead malloc() {
        return new PropertyRead(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code PropertyRead} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static PropertyRead calloc() {
        return new PropertyRead(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code PropertyRead} instance allocated with {@link BufferUtils}. */
    public static PropertyRead create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new PropertyRead(memAddress(container), container);
    }

    /** Returns a new {@code PropertyRead} instance for the specified memory address. */
    public static PropertyRead create(long address) {
        return new PropertyRead(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable PropertyRead createSafe(long address) {
        return address == NULL ? null : new PropertyRead(address, null);
    }

    /**
     * Returns a new {@link PropertyRead.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link PropertyRead.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PropertyRead.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link PropertyRead.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static PropertyRead.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code PropertyRead} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static PropertyRead malloc(MemoryStack stack) {
        return new PropertyRead(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code PropertyRead} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static PropertyRead calloc(MemoryStack stack) {
        return new PropertyRead(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link PropertyRead.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PropertyRead.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #prop}. */
    public static int nprop(long struct) { return memGetInt(struct + PropertyRead.PROP); }
    /** Unsafe version of {@link #pvBuffer() pvBuffer}. */
    public static ByteBuffer npvBuffer(long struct) { return memByteBuffer(memGetAddress(struct + PropertyRead.PVBUFFER), nunBufferSize(struct)); }
    /** Unsafe version of {@link #unBufferSize}. */
    public static int nunBufferSize(long struct) { return memGetInt(struct + PropertyRead.UNBUFFERSIZE); }
    /** Unsafe version of {@link #unTag}. */
    public static int nunTag(long struct) { return memGetInt(struct + PropertyRead.UNTAG); }
    /** Unsafe version of {@link #unRequiredBufferSize}. */
    public static int nunRequiredBufferSize(long struct) { return memGetInt(struct + PropertyRead.UNREQUIREDBUFFERSIZE); }
    /** Unsafe version of {@link #eError}. */
    public static int neError(long struct) { return memGetInt(struct + PropertyRead.EERROR); }

    /** Unsafe version of {@link #prop(int) prop}. */
    public static void nprop(long struct, int value) { memPutInt(struct + PropertyRead.PROP, value); }
    /** Unsafe version of {@link #pvBuffer(ByteBuffer) pvBuffer}. */
    public static void npvBuffer(long struct, ByteBuffer value) { memPutAddress(struct + PropertyRead.PVBUFFER, memAddress(value)); nunBufferSize(struct, value.remaining()); }
    /** Sets the specified value to the {@code unBufferSize} field of the specified {@code struct}. */
    public static void nunBufferSize(long struct, int value) { memPutInt(struct + PropertyRead.UNBUFFERSIZE, value); }
    /** Unsafe version of {@link #unTag(int) unTag}. */
    public static void nunTag(long struct, int value) { memPutInt(struct + PropertyRead.UNTAG, value); }
    /** Unsafe version of {@link #unRequiredBufferSize(int) unRequiredBufferSize}. */
    public static void nunRequiredBufferSize(long struct, int value) { memPutInt(struct + PropertyRead.UNREQUIREDBUFFERSIZE, value); }
    /** Unsafe version of {@link #eError(int) eError}. */
    public static void neError(long struct, int value) { memPutInt(struct + PropertyRead.EERROR, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + PropertyRead.PVBUFFER));
    }

    // -----------------------------------

    /** An array of {@link PropertyRead} structs. */
    public static class Buffer extends StructBuffer<PropertyRead, Buffer> implements NativeResource {

        private static final PropertyRead ELEMENT_FACTORY = PropertyRead.create(-1L);

        /**
         * Creates a new {@code PropertyRead.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link PropertyRead#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected PropertyRead getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link PropertyRead#prop} field. */
        @NativeType("ETrackedDeviceProperty")
        public int prop() { return PropertyRead.nprop(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pvBuffer} field. */
        @NativeType("void *")
        public ByteBuffer pvBuffer() { return PropertyRead.npvBuffer(address()); }
        /** @return the value of the {@code unBufferSize} field. */
        @NativeType("uint32_t")
        public int unBufferSize() { return PropertyRead.nunBufferSize(address()); }
        /** @return the value of the {@code unTag} field. */
        @NativeType("PropertyTypeTag_t")
        public int unTag() { return PropertyRead.nunTag(address()); }
        /** @return the value of the {@code unRequiredBufferSize} field. */
        @NativeType("uint32_t")
        public int unRequiredBufferSize() { return PropertyRead.nunRequiredBufferSize(address()); }
        /** @return the value of the {@link PropertyRead#eError} field. */
        @NativeType("ETrackedPropertyError")
        public int eError() { return PropertyRead.neError(address()); }

        /** Sets the specified value to the {@link PropertyRead#prop} field. */
        public PropertyRead.Buffer prop(@NativeType("ETrackedDeviceProperty") int value) { PropertyRead.nprop(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pvBuffer} field. */
        public PropertyRead.Buffer pvBuffer(@NativeType("void *") ByteBuffer value) { PropertyRead.npvBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code unTag} field. */
        public PropertyRead.Buffer unTag(@NativeType("PropertyTypeTag_t") int value) { PropertyRead.nunTag(address(), value); return this; }
        /** Sets the specified value to the {@code unRequiredBufferSize} field. */
        public PropertyRead.Buffer unRequiredBufferSize(@NativeType("uint32_t") int value) { PropertyRead.nunRequiredBufferSize(address(), value); return this; }
        /** Sets the specified value to the {@link PropertyRead#eError} field. */
        public PropertyRead.Buffer eError(@NativeType("ETrackedPropertyError") int value) { PropertyRead.neError(address(), value); return this; }

    }

}