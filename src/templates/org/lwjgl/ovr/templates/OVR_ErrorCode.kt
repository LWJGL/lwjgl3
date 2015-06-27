/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.IntConstant
import org.lwjgl.generator.StringConstant
import org.lwjgl.generator.nativeClass
import org.lwjgl.ovr.OVR_PACKAGE

val OVR_ErrorCode = "OVRErrorCode".nativeClass(packageName = OVR_PACKAGE, prefix = "OVR", prefixConstant = "ovr") {
	documentation = "LibOVR error code declarations."

	IntConstant("This is a general success result.", "Success" _ 0)
	IntConstant(
		"""
		Returned from a call to #Hmd_SubmitFrame(). The call succeeded, but what the app rendered will not be visible on the HMD. Ideally the app should continue
		calling #Hmd_SubmitFrame(), but not do any rendering. When the result becomes #Success, rendering should continue as usual.
		""",
		"Success_NotVisible" _ 1000
	)
	IntConstant("The HMD Firmware is out of date but is acceptable.", "Success_HMDFirmwareMismatch" expr "4100")
	IntConstant("The Tracker Firmware is out of date but is acceptable.", "Success_TrackerFirmwareMismatch" expr "4101")
	// General errors
	IntConstant("Failure to allocate memory.", "Error_MemoryAllocationFailure" expr "-1000")
	IntConstant("Failure to create a socket.", "Error_SocketCreationFailure" expr "-1001")
	IntConstant("Invalid HMD parameter provided.", "Error_InvalidHmd" expr "-1002")
	IntConstant("The operation timed out.", "Error_Timeout" expr "-1003")
	IntConstant("The system or component has not been initialized.", "Error_NotInitialized" expr "-1004")
	IntConstant("Invalid parameter provided. See error info or log for details.", "Error_InvalidParameter" expr "-1005")
	IntConstant("Generic service error. See error info or log for details.", "Error_ServiceError" expr "-1006")
	IntConstant("The given HMD doesn't exist.", "Error_NoHmd" expr "-1007")
	// Audio error range, reserved for Audio errors.
	IntConstant("First Audio error.", "Error_AudioReservedBegin" expr "-2000")
	IntConstant("Last Audio error.", "Error_AudioReservedEnd" expr "-2999")
	// Initialization errors.
	IntConstant("Generic initialization error.", "Error_Initialize" expr "-3000")
	IntConstant("Couldn't load LibOVRRT.", "Error_LibLoad" expr "-3001")
	IntConstant("LibOVRRT version incompatibility.", "Error_LibVersion" expr "-3002")
	IntConstant("Couldn't connect to the OVR Service.", "Error_ServiceConnection" expr "-3003")
	IntConstant("OVR Service version incompatibility.", "Error_ServiceVersion" expr "-3004")
	IntConstant("The operating system version is incompatible.", "Error_IncompatibleOS" expr "-3005")
	IntConstant("Unable to initialize the HMD display.", "Error_DisplayInit" expr "-3006")
	IntConstant("Unable to start the server. Is it already running?", "Error_ServerStart" expr "-3007")
	IntConstant("Attempting to re-initialize with a different version.", "Error_Reinitialization" expr "-3008")
	IntConstant("Chosen rendering adapters between client and service do not match.", "Error_MismatchedAdapters" expr "-3009")
	// Hardware Errors
	IntConstant("Headset has no bundle adjustment data.", "Error_InvalidBundleAdjustment" expr "-4000")
	IntConstant("The USB hub cannot handle the camera frame bandwidth.", "Error_USBBandwidth" expr "-4001")
	IntConstant("The USB camera is not enumerating at the correct device speed.", "Error_USBEnumeratedSpeed" expr "-4002")
	IntConstant("Unable to communicate with the image sensor.", "Error_ImageSensorCommError" expr "-4003")
	IntConstant("We use this to report various tracker issues that don't fit in an easily classifiable bucket.", "Error_GeneralTrackerFailure" expr "-4004")
	IntConstant("A more than acceptable number of frames are coming back truncated.", "Error_ExcessiveFrameTruncation" expr "-4005")
	IntConstant("A more than acceptable number of frames have been skipped.", "Error_ExcessiveFrameSkipping" expr "-4006")
	IntConstant("The tracker is not receiving the sync signal (cable disconnected?)", "Error_SyncDisconnected" expr "-4007")
	IntConstant("The HMD Firmware is out of date and is unacceptable.", "Error_HMDFirmwareMismatch" expr "-4100")
	IntConstant("The Tracker Firmware is out of date and is unacceptable.", "Error_TrackerFirmwareMismatch" expr "-4101")
	// Synchronization Errors
	IntConstant("Requested async work not yet complete.", "Error_Incomplete" expr "-5000")
	IntConstant("Requested async work was abandoned and result is incomplete.", "Error_Abandoned" expr "-5001")
}