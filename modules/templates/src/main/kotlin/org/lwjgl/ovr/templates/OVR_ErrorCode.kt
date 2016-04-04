/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.*

val OVR_ErrorCode = "OVRErrorCode".nativeClass(packageName = OVR_PACKAGE, prefixMethod = "OVR_", prefixConstant = "ovr") {
	nativeImport("OVR_ErrorCode.h")

	documentation = "LibOVR error code declarations."

	EnumConstant(
		"Success codes ({@code ovrSuccessType}). Success is a value greater or equal to 0, while all error types are negative values.",

		"Success".enumExpr("This is a general success result.", "0"),
		"Success_NotVisible".enumExpr(
			"""
			Returned from a call to OVR##ovr_SubmitFrame(). The call succeeded, but what the app rendered will not be visible on the HMD. Ideally the app
			should continue calling OVR##ovr_SubmitFrame(), but not do any rendering. When the result becomes #Success, rendering should continue as usual.
			""",
			"1000"
		),
		"Success_HMDFirmwareMismatch".enumExpr("The HMD Firmware is out of date but is acceptable.", "4100"),
		"Success_TrackerFirmwareMismatch".enum("The Tracker Firmware is out of date but is acceptable."),
		"Success_ControllerFirmwareMismatch".enumExpr("The controller firmware is out of date but is acceptable.", "4104"),
		"Success_TrackerDriverNotFound".enum("The tracker driver interface was not found. Can be a temporary error.")
	)

	EnumConstant(
		"Error codes ({@code ovrErrorType})",

		/* General errors */
		"Error_MemoryAllocationFailure".enumExpr("Failure to allocate memory.", "-1000"),
		"Error_SocketCreationFailure".enumExpr("Failure to create a socket.", "-1001"),
		"Error_InvalidSession".enumExpr("Invalid ovrSession parameter provided.", "-1002"),
		"Error_Timeout".enumExpr("The operation timed out.", "-1003"),
		"Error_NotInitialized".enumExpr("The system or component has not been initialized.", "-1004"),
		"Error_InvalidParameter".enumExpr("Invalid parameter provided. See error info or log for details.", "-1005"),
		"Error_ServiceError".enumExpr("Generic service error. See error info or log for details.", "-1006"),
		"Error_NoHmd".enumExpr("The given HMD doesn't exist.", "-1007"),
		"Error_Unsupported".enumExpr("Function call is not supported on this hardware/software", "-1009"),
		"Error_DeviceUnavailable".enumExpr("Specified device type isn't available.", "-1010"),
		"Error_InvalidHeadsetOrientation".enumExpr("The headset was in an invalid orientation for the requested operation (e.g. vertically oriented during OVR#RecenterPose()).", "-1011"),
		"Error_ClientSkippedDestroy".enumExpr("The client failed to call OVR#Destroy() on an active session before calling OVR#Shutdown(). Or the client crashed.", "-1012"),
		"Error_ClientSkippedShutdown".enumExpr("The client failed to call OVR#Shutdown() or the client crashed.", "-1013"),

		/* Audio error range, reserved for Audio errors. */
		"Error_AudioReservedBegin".enumExpr("First Audio error.", "-2000"),
		"Error_AudioDeviceNotFound".enumExpr("Failure to find the specified audio device.", "-2001"),
		"Error_AudioComError".enumExpr("Generic COM error.", "-2002"),
		"Error_AudioReservedEnd".enumExpr("Last Audio error.", "-2999"),

		/* Initialization errors. */
		"Error_Initialize".enumExpr("Generic initialization error.", "-3000"),
		"Error_LibLoad".enumExpr("Couldn't load LibOVRRT.", "-3001"),
		"Error_LibVersion".enumExpr("LibOVRRT version incompatibility.", "-3002"),
		"Error_ServiceConnection".enumExpr("Couldn't connect to the OVR Service.", "-3003"),
		"Error_ServiceVersion".enumExpr("OVR Service version incompatibility.", "-3004"),
		"Error_IncompatibleOS".enumExpr("The operating system version is incompatible.", "-3005"),
		"Error_DisplayInit".enumExpr("Unable to initialize the HMD display.", "-3006"),
		"Error_ServerStart".enumExpr("Unable to start the server. Is it already running?", "-3007"),
		"Error_Reinitialization".enumExpr("Attempting to re-initialize with a different version.", "-3008"),
		"Error_MismatchedAdapters".enumExpr("Chosen rendering adapters between client and service do not match", "-3009"),
		"Error_LeakingResources".enumExpr("Calling application has leaked resources", "-3010"),
		"Error_ClientVersion".enumExpr("Client version too old to connect to service", "-3011"),
		"Error_OutOfDateOS".enumExpr("The operating system is out of date.", "-3012"),
		"Error_OutOfDateGfxDriver".enumExpr("The graphics driver is out of date.", "-3013"),
		"Error_IncompatibleGPU".enumExpr("The graphics hardware is not supported", "-3014"),
		"Error_NoValidVRDisplaySystem".enumExpr("No valid VR display system found.", "-3015"),
		"Error_Obsolete".enumExpr("Feature or API is obsolete and no longer supported.", "-3016"),
		"Error_DisabledOrDefaultAdapter".enumExpr("No supported VR display system found, but disabled or driverless adapter found.", "-3017"),
		"Error_HybridGraphicsNotSupported".enumExpr("The system is using hybrid graphics (Optimus, etc...), which is not support.", "-3018"),
		"Error_DisplayManagerInit".enumExpr("Initialization of the DisplayManager failed.", "-3019"),
		"Error_TrackerDriverInit".enumExpr("Failed to get the interface for an attached tracker", "-3020"),

		/* Hardware errors */
		"Error_InvalidBundleAdjustment".enumExpr("Headset has no bundle adjustment data.", "-4000"),
		"Error_USBBandwidth".enumExpr("The USB hub cannot handle the camera frame bandwidth.", "-4001"),
		"Error_USBEnumeratedSpeed".enumExpr("The USB camera is not enumerating at the correct device speed.", "-4002"),
		"Error_ImageSensorCommError".enumExpr("Unable to communicate with the image sensor.", "-4003"),
		"Error_GeneralTrackerFailure".enumExpr("We use this to report various sensor issues that don't fit in an easily classifiable bucket.", "-4004"),
		"Error_ExcessiveFrameTruncation".enumExpr("A more than acceptable number of frames are coming back truncated.", "-4005"),
		"Error_ExcessiveFrameSkipping".enumExpr("A more than acceptable number of frames have been skipped.", "-4006"),
		"Error_SyncDisconnected".enumExpr("The sensor is not receiving the sync signal (cable disconnected?).", "-4007"),
		"Error_TrackerMemoryReadFailure".enumExpr("Failed to read memory from the sensor.", "-4008"),
		"Error_TrackerMemoryWriteFailure".enumExpr("Failed to write memory from the sensor.", "-4009"),
		"Error_TrackerFrameTimeout".enumExpr("Timed out waiting for a camera frame.", "-4010"),
		"Error_TrackerTruncatedFrame".enumExpr("Truncated frame returned from sensor.", "-4011"),
		"Error_TrackerDriverFailure".enumExpr("The sensor driver has encountered a problem.", "-4012"),
		"Error_TrackerNRFFailure".enumExpr("The sensor wireless subsystem has encountered a problem.", "-4013"),
		"Error_HardwareGone".enumExpr("The hardware has been unplugged", "-4014"),
		"Error_NordicEnabledNoSync".enumExpr("The nordic indicates that sync is enabled but it is not sending sync pulses", "-4015"),
		"Error_NordicSyncNoFrames".enumExpr("It looks like we're getting a sync signal, but no camera frames have been received", "-4016"),
		"Error_CatastrophicFailure".enumExpr("A catastrophic failure has occurred.  We will attempt to recover by resetting the device", "-4017"),

		"Error_HMDFirmwareMismatch".enumExpr("The HMD Firmware is out of date and is unacceptable.", "-4100"),
		"Error_TrackerFirmwareMismatch".enumExpr("The sensor Firmware is out of date and is unacceptable.", "-4101"),
		"Error_BootloaderDeviceDetected".enumExpr("A bootloader HMD is detected by the service.", "-4102"),
		"Error_TrackerCalibrationError".enumExpr("The sensor calibration is missing or incorrect.", "-4103"),
		"Error_ControllerFirmwareMismatch".enumExpr("The controller firmware is out of date and is unacceptable.", "-4104"),

		"Error_IMUTooManyLostSamples".enumExpr("Too many lost IMU samples.", "-4200"),
		"Error_IMURateError".enumExpr("IMU rate is outside of the expected range.", "-4201"),
		"Error_FeatureReportFailure".enumExpr("A feature report has failed.", "-4202"),

		/* Synchronization errors */
		"Error_Incomplete".enumExpr("Requested async work not yet complete.", "-5000"),
		"Error_Abandoned".enumExpr("Requested async work was abandoned and result is incomplete.", "-5001"),

		/* Rendering errors */
		"Error_DisplayLost".enumExpr("In the event of a system-wide graphics reset or cable unplug this is returned to the app.", "-6000"),
		"Error_TextureSwapChainFull".enumExpr("OVR#CommitTextureSwapChain() was called too many times on a texture swapchain without calling submit to use the chain.", "-6001"),
		"Error_TextureSwapChainInvalid".enumExpr("The ##OVRTextureSwapChain is in an incomplete or inconsistent state. Ensure OVR#CommitTextureSwapChain() was called at least once first.", "-6002"),

		/* Fatal errors */
		"Error_RuntimeException".enumExpr("A runtime exception occurred. The application is required to shutdown LibOVR and re-initialize it before this error state will be cleared.", "-7000"),


		"Error_MetricsUnknownApp".enumExpr("", "-90000"),
		"Error_MetricsDuplicateApp".enumExpr("", "-90001"),
		"Error_MetricsNoEvents".enumExpr("", "-90002"),
		"Error_MetricsRuntime".enumExpr("", "-90003"),
		"Error_MetricsFile".enumExpr("", "-90004"),
		"Error_MetricsNoClientInfo".enumExpr("", "-90005"),
		"Error_MetricsNoAppMetaData".enumExpr("", "-90006"),
		"Error_MetricsNoApp".enumExpr("", "-90007"),
		"Error_MetricsOafFailure".enumExpr("", "-90008"),
		"Error_MetricsSessionAlreadyActive".enumExpr("", "-90009"),
		"Error_MetricsSessionNotActive".enumExpr("", "-90010")
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