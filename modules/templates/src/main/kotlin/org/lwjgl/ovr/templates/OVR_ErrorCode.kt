/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.*

val OVR_ErrorCode = "OVRErrorCode".nativeClass(OVR_PACKAGE, prefixMethod = "OVR_", prefixConstant = "ovr", library = OVR_LIBRARY) {
	nativeImport("OVR_ErrorCode.h")

	documentation = "LibOVR error code declarations."

	EnumConstant(
		"Success codes ({@code ovrSuccessType}). Success is a value greater or equal to 0, while all error types are negative values.",

		"Success".enum("This is a general success result.", "0"),
		"Success_NotVisible".enum(
			"""
			Returned from a call to #SubmitFrame(). The call succeeded, but what the app rendered will not be visible on the HMD. Ideally the app should
			continue calling #SubmitFrame(), but not do any rendering. When the result becomes #Success, rendering should continue as usual.
			""",
			"1000"
		),
		"Success_HMDFirmwareMismatch".enum("The HMD Firmware is out of date but is acceptable.", "4100"),
		"Success_TrackerFirmwareMismatch".enum("The Tracker Firmware is out of date but is acceptable."),
		"Success_ControllerFirmwareMismatch".enum("The controller firmware is out of date but is acceptable.", "4104"),
		"Success_TrackerDriverNotFound".enum("The tracker driver interface was not found. Can be a temporary error.")
	)

	EnumConstant(
		"Error codes ({@code ovrErrorType})",

		/* General errors */
		"Error_MemoryAllocationFailure".enum("Failure to allocate memory.", "-1000"),
		"Error_SocketCreationFailure".enum("Failure to create a socket.", "-1001"),
		"Error_InvalidSession".enum("Invalid ovrSession parameter provided.", "-1002"),
		"Error_Timeout".enum("The operation timed out.", "-1003"),
		"Error_NotInitialized".enum("The system or component has not been initialized.", "-1004"),
		"Error_InvalidParameter".enum("Invalid parameter provided. See error info or log for details.", "-1005"),
		"Error_ServiceError".enum("Generic service error. See error info or log for details.", "-1006"),
		"Error_NoHmd".enum("The given HMD doesn't exist.", "-1007"),
		"Error_Unsupported".enum("Function call is not supported on this hardware/software", "-1009"),
		"Error_DeviceUnavailable".enum("Specified device type isn't available.", "-1010"),
		"Error_InvalidHeadsetOrientation".enum("The headset was in an invalid orientation for the requested operation (e.g. vertically oriented during OVR##ovr_RecenterTrackingOrigin()).", "-1011"),
		"Error_ClientSkippedDestroy".enum("The client failed to call OVR##ovr_Destroy() on an active session before calling OVR##ovr_Shutdown(). Or the client crashed.", "-1012"),
		"Error_ClientSkippedShutdown".enum("The client failed to call OVR##ovr_Shutdown() or the client crashed.", "-1013"),
		"Error_ServiceDeadlockDetected".enum("The service watchdog discovered a deadlock.", "-1014"),

		/* Audio error range, reserved for Audio errors. */
		"Error_AudioReservedBegin".enum("First Audio error.", "-2000"),
		"Error_AudioDeviceNotFound".enum("Failure to find the specified audio device.", "-2001"),
		"Error_AudioComError".enum("Generic COM error.", "-2002"),
		"Error_AudioReservedEnd".enum("Last Audio error.", "-2999"),

		/* Initialization errors. */
		"Error_Initialize".enum("Generic initialization error.", "-3000"),
		"Error_LibLoad".enum("Couldn't load LibOVRRT.", "-3001"),
		"Error_LibVersion".enum("LibOVRRT version incompatibility.", "-3002"),
		"Error_ServiceConnection".enum("Couldn't connect to the OVR Service.", "-3003"),
		"Error_ServiceVersion".enum("OVR Service version incompatibility.", "-3004"),
		"Error_IncompatibleOS".enum("The operating system version is incompatible.", "-3005"),
		"Error_DisplayInit".enum("Unable to initialize the HMD display.", "-3006"),
		"Error_ServerStart".enum("Unable to start the server. Is it already running?", "-3007"),
		"Error_Reinitialization".enum("Attempting to re-initialize with a different version.", "-3008"),
		"Error_MismatchedAdapters".enum("Chosen rendering adapters between client and service do not match", "-3009"),
		"Error_LeakingResources".enum("Calling application has leaked resources", "-3010"),
		"Error_ClientVersion".enum("Client version too old to connect to service", "-3011"),
		"Error_OutOfDateOS".enum("The operating system is out of date.", "-3012"),
		"Error_OutOfDateGfxDriver".enum("The graphics driver is out of date.", "-3013"),
		"Error_IncompatibleGPU".enum("The graphics hardware is not supported", "-3014"),
		"Error_NoValidVRDisplaySystem".enum("No valid VR display system found.", "-3015"),
		"Error_Obsolete".enum("Feature or API is obsolete and no longer supported.", "-3016"),
		"Error_DisabledOrDefaultAdapter".enum("No supported VR display system found, but disabled or driverless adapter found.", "-3017"),
		"Error_HybridGraphicsNotSupported".enum("The system is using hybrid graphics (Optimus, etc...), which is not support.", "-3018"),
		"Error_DisplayManagerInit".enum("Initialization of the DisplayManager failed.", "-3019"),
		"Error_TrackerDriverInit".enum("Failed to get the interface for an attached tracker", "-3020"),

		/* Hardware errors */
		"Error_InvalidBundleAdjustment".enum("Headset has no bundle adjustment data.", "-4000"),
		"Error_USBBandwidth".enum("The USB hub cannot handle the camera frame bandwidth.", "-4001"),
		"Error_USBEnumeratedSpeed".enum("The USB camera is not enumerating at the correct device speed.", "-4002"),
		"Error_ImageSensorCommError".enum("Unable to communicate with the image sensor.", "-4003"),
		"Error_GeneralTrackerFailure".enum("We use this to report various sensor issues that don't fit in an easily classifiable bucket.", "-4004"),
		"Error_ExcessiveFrameTruncation".enum("A more than acceptable number of frames are coming back truncated.", "-4005"),
		"Error_ExcessiveFrameSkipping".enum("A more than acceptable number of frames have been skipped.", "-4006"),
		"Error_SyncDisconnected".enum("The sensor is not receiving the sync signal (cable disconnected?).", "-4007"),
		"Error_TrackerMemoryReadFailure".enum("Failed to read memory from the sensor.", "-4008"),
		"Error_TrackerMemoryWriteFailure".enum("Failed to write memory from the sensor.", "-4009"),
		"Error_TrackerFrameTimeout".enum("Timed out waiting for a camera frame.", "-4010"),
		"Error_TrackerTruncatedFrame".enum("Truncated frame returned from sensor.", "-4011"),
		"Error_TrackerDriverFailure".enum("The sensor driver has encountered a problem.", "-4012"),
		"Error_TrackerNRFFailure".enum("The sensor wireless subsystem has encountered a problem.", "-4013"),
		"Error_HardwareGone".enum("The hardware has been unplugged", "-4014"),
		"Error_NordicEnabledNoSync".enum("The nordic indicates that sync is enabled but it is not sending sync pulses", "-4015"),
		"Error_NordicSyncNoFrames".enum("It looks like we're getting a sync signal, but no camera frames have been received", "-4016"),
		"Error_CatastrophicFailure".enum("A catastrophic failure has occurred.  We will attempt to recover by resetting the device", "-4017"),
		"Error_CatastrophicTimeout".enum("The catastrophic recovery has timed out.", "-4018"),
		"Error_RepeatCatastrophicFail".enum("Catastrophic failure has repeated too many times.", "-4019"),
		"Error_USBOpenDeviceFailure".enum("Could not open handle for Rift device (likely already in use by another process).", "-4020"),
		"Error_HMDGeneralFailure".enum("Unexpected HMD issues that don't fit a specific bucket.", "-4021"),

		"Error_HMDFirmwareMismatch".enum("The HMD Firmware is out of date and is unacceptable.", "-4100"),
		"Error_TrackerFirmwareMismatch".enum("The sensor Firmware is out of date and is unacceptable.", "-4101"),
		"Error_BootloaderDeviceDetected".enum("A bootloader HMD is detected by the service.", "-4102"),
		"Error_TrackerCalibrationError".enum("The sensor calibration is missing or incorrect.", "-4103"),
		"Error_ControllerFirmwareMismatch".enum("The controller firmware is out of date and is unacceptable.", "-4104"),
		"Error_DevManDeviceDetected".enum("A DeviceManagement mode HMD is detected by the service.", "-4105"),
        "Error_RebootedBootloaderDevice".enum("Had to reboot bootloader device, which succeeded.", "-4106"),
        "Error_FailedRebootBootloaderDev".enum("Had to reboot bootloader device, which failed. Device is stuck in bootloader mode.", "-4107"),

		"Error_IMUTooManyLostSamples".enum("Too many lost IMU samples.", "-4200"),
		"Error_IMURateError".enum("IMU rate is outside of the expected range.", "-4201"),
		"Error_FeatureReportFailure".enum("A feature report has failed.", "-4202"),
		"Error_HMDWirelessTimeout".enum("HMD wireless interface never returned from busy state.", "-4203"),
	
		"Error_BootloaderAssertLog".enum("HMD Bootloader Assert Log was not empty.", "-4300"),
		"Error_AppAssertLog".enum("HMD App Assert Log was not empty.", "-4301"),

		/* Synchronization errors */
		"Error_Incomplete".enum("Requested async work not yet complete.", "-5000"),
		"Error_Abandoned".enum("Requested async work was abandoned and result is incomplete.", "-5001"),

		/* Rendering errors */
		"Error_DisplayLost".enum("In the event of a system-wide graphics reset or cable unplug this is returned to the app.", "-6000"),
		"Error_TextureSwapChainFull".enum("#CommitTextureSwapChain() was called too many times on a texture swapchain without calling submit to use the chain.", "-6001"),
		"Error_TextureSwapChainInvalid".enum("The {@code ovrTextureSwapChain} is in an incomplete or inconsistent state. Ensure #CommitTextureSwapChain() was called at least once first.", "-6002"),
		"Error_GraphicsDeviceReset".enum("Graphics device has been reset (TDR, etc...)", "-6003"),
		"Error_DisplayRemoved".enum("HMD removed from the display adapter", "-6004"),
		"Error_ContentProtectionNotAvailable".enum("Content protection is not available for the display", "-6005"),
		"Error_ApplicationInvisible".enum("Application declared itself as an invisible type and is not allowed to submit frames.", "-6006"),
		"Error_Disallowed".enum("The given request is disallowed under the current conditions.", "-6007"),
		"Error_DisplayPluggedIncorrectly".enum("Display portion of HMD is plugged into an incompatible port (ex: IGP)", "-6008"),

		/* Fatal errors */
		"Error_RuntimeException".enum("A runtime exception occurred. The application is required to shutdown LibOVR and re-initialize it before this error state will be cleared.", "-7000"),


		"Error_MetricsUnknownApp".enum("", "-90000"),
		"Error_MetricsDuplicateApp".enum("", "-90001"),
		"Error_MetricsNoEvents".enum("", "-90002"),
		"Error_MetricsRuntime".enum("", "-90003"),
		"Error_MetricsFile".enum("", "-90004"),
		"Error_MetricsNoClientInfo".enum("", "-90005"),
		"Error_MetricsNoAppMetaData".enum("", "-90006"),
		"Error_MetricsNoApp".enum("", "-90007"),
		"Error_MetricsOafFailure".enum("", "-90008"),
		"Error_MetricsSessionAlreadyActive".enum("", "-90009"),
		"Error_MetricsSessionNotActive".enum("", "-90010")
	)

	val SUCCESS = bool(
		"SUCCESS",
		"""
		Indicates if an {@code ovrResult} indicates success.

		Some functions return additional successful values other than #Success and require usage of this macro to indicate success.
		""",

		ovrResult.IN("result", "the {@code ovrResult} to check")
	)

	bool(
		"UNQUALIFIED_SUCCESS",
		"""
		Indicates if an {@code ovrResult} indicates an unqualified success.

		This is useful for indicating that the code intentionally wants to check for {@code result == ovrSuccess} as opposed to #SUCCESS(), which checks for
		{@code result >= ovrSuccess}.
		""",

		SUCCESS["result"]
	)

	bool(
		"FAILURE",
		"Indicates if an {@code ovrResult} indicates failure.",

		SUCCESS["result"]
	)
}