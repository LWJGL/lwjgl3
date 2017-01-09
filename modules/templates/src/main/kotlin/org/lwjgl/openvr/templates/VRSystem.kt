/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRSystem = "VRSystem".nativeClass(
	packageName = OPENVR_PACKAGE,
	prefixMethod = "VRSystem_",
	library = OPENVR_LIBRARY,
	binding = OPENVR_FNTABLE_BINDING
) {
	nativeDirective("""DISABLE_WARNINGS()
#include "openvr_capi.h"
ENABLE_WARNINGS()
#define APIENTRY OPENVR_FNTABLE_CALLTYPE""")

	documentation =
		"""
		Main interface for display, distortion, tracking, controller, and event access.

		The {@code IVRSystem} interface provides access to display configuration information, tracking data, distortion functions, controller state, events,
		and device properties. It is the main interface of OpenVR and can be initialized and retrieved with the #InitInternal() function.

		Many functions in {@code IVRSystem} use a tracked device index to identify a specific device attached to the computer. There will never be more than
		#k_unMaxTrackedDeviceCount devices active in the system at any given time. Their indices will be 0 (for the HMD) and 1-15 for the other devices.
		"""

	void(
		"GetRecommendedRenderTargetSize",
		"Returns the suggested size for the intermediate render target that the distortion pulls from.",

		Check(1)..uint32_t_p.OUT("pnWidth", "recommended width for the offscreen render target"),
		Check(1)..uint32_t_p.OUT("pnHeight", "recommended height for the offscreen render target")
	)

	HmdMatrix44_t(
		"GetProjectionMatrix",
		"Returns the projection matrix for the specified eye.",

		EVREye.IN("eEye", "determines which eye the function should return the projection for", "EVREye_\\w+"),
		float.IN("fNearZ", "distance to the near clip plane in meters"),
		float.IN("fFarZ", "distance to the far clip plane in meters")
	)

	void(
		"GetProjectionRaw",
		"Returns the components necessary to build your own projection matrix in case your application is doing something fancy like infinite Z.",

		EVREye.IN("eEye", "determines which eye the function should return the projection for", "EVREye_\\w+"),
		Check(1)..float_p.OUT("pfLeft", "coordinate for the left clipping plane"),
		Check(1)..float_p.OUT("pfRight", "coordinate for the right clipping plane"),
		Check(1)..float_p.OUT("pfTop", "coordinate for the top clipping plane"),
		Check(1)..float_p.OUT("pfBottom", "coordinate for the bottom clipping plane")
	)

	bool(
		"ComputeDistortion",
		"""
		Gets the result of the distortion function for the specified eye and input UVs. UVs go from 0,0 in the upper left of that eye's viewport and 1,1 in the
		lower right of that eye's viewport.
		""",

		EVREye.IN("eEye", "determines which eye the function should return the distortion value for", "EVREye_\\w+"),
		float.IN("fU", "horizontal texture coordinate for the output pixel within the viewport"),
		float.IN("fV", "vertical texture coordinate for the output pixel within the viewport"),
		DistortionCoordinates_t.p.OUT("pDistortionCoordinates", "a struct in which to return the distortion coordinates"),

		returnDoc = "true for success. Otherwise, returns false, and distortion coordinates are not suitable."
	)

	HmdMatrix34_t(
		"GetEyeToHeadTransform",
		"""
		Returns the transform from eye space to the head space. Eye space is the per-eye flavor of head space that provides stereo disparity. Instead of
		{@code Model * View * Projection} the sequence is {@code Model * View * Eye^-1 * Projection}. Normally {@code View} and {@code Eye^-1} will be
		multiplied together and treated as {@code View} in your application.
		""",

		EVREye.IN("eEye", "determines which eye the function should return the eye matrix for", "EVREye_\\w+")
	)

	bool(
		"GetTimeSinceLastVsync",
		"""
		Returns the number of elapsed seconds since the last recorded vsync event. This will come from a vsync timer event in the timer if possible or from the
		application-reported time if that is not available.
		""",

		Check(1)..float_p.OUT(
			"pfSecondsSinceLastVsync",
			"fractional number of seconds since the last vsync event. This will never exceed the length of a single frame."
		),
		Check(1)..uint64_t_p.OUT("pulFrameCounter", "the number of frames since vrserver.exe started"),

		returnDoc = "if no vsync times are available the function will return zero for vsync time and frame counter and return false from the method"
	)

	int32_t(
		"GetD3D9AdapterIndex",
		"""
		<h3>D3D9 Only</h3>

		Returns the adapter index that the user should pass into {@code CreateDevice} to set up D3D9 in such a way that it can go full screen exclusive on the
		HMD.
		""",

		returnDoc = "-1 if there was an error"
	)

	void(
		"GetDXGIOutputInfo",
		"""
		<h3>D3D10/11 Only</h3>

		Returns the adapter index that the user should pass into {@code EnumAdapters} to create the device and swap chain in DX10 and DX11. If an error occurs
		the index will be set to -1. The index will also be -1 if the headset is in direct mode on the driver side instead of using the compositor's builtin
		direct mode support.
		""",

		Check(1)..int32_t_p.OUT("pnAdapterIndex", "the index of the adapter to use for this display")
	)

	bool(
		"IsDisplayOnDesktop",
		"Use to determine if the headset display is part of the desktop (i.e. extended) or hidden (i.e. direct mode)."
	)

	bool(
		"SetDisplayVisibility",
		"Sets the display visibility (true = extended, false = direct mode).",

		bool.IN("bIsVisibleOnDesktop", "the display visibility"),

		returnDoc = "true indicates that the change was successful"
	)

	void(
		"GetDeviceToAbsoluteTrackingPose",
		"""
		The pose that the tracker thinks that the HMD will be in at the specified number of seconds into the future. Pass 0 to get the state at the instant the
		method is called. Most of the time the application should calculate the time until the photons will be emitted from the display and pass that time into
		the method.

		This is roughly analogous to the inverse of the view matrix in most applications, though many games will need to do some additional rotation or
		translation on top of the rotation and translation provided by the head pose.

		For devices where {@code bPoseIsValid} is true the application can use the pose to position the device in question. The provided array can be any size
		up to #k_unMaxTrackedDeviceCount.

		Seated experiences should call this method with #ETrackingUniverseOrigin_TrackingUniverseSeated and receive poses relative to the seated zero pose.
		Standing experiences should call this method with #ETrackingUniverseOrigin_TrackingUniverseStanding and receive poses relative to the Chaperone Play
		Area. #ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated should probably not be used unless the application is the Chaperone calibration tool
		itself, but will provide poses relative to the hardware-specific coordinate system in the driver.
		""",

		ETrackingUniverseOrigin.IN("eOrigin", "tracking universe that returned poses should be relative to", "ETrackingUniverseOrigin_\\w+"),
		float.IN(
			"fPredictedSecondsToPhotonsFromNow",
			"number of seconds from now to predict poses for. Positive numbers are in the future. Pass 0 to get the state at the instant the function is called."
		),
		TrackedDevicePose_t.p.OUT("pTrackedDevicePoseArray", ""),
		AutoSize("pTrackedDevicePoseArray")..uint32_t.IN("unTrackedDevicePoseArrayCount", "")
	)

	void(
		"ResetSeatedZeroPose",
		"""
		Sets the zero pose for the seated tracker coordinate system to the current position and yaw of the HMD. After {@code ResetSeatedZeroPose} all
		#GetDeviceToAbsoluteTrackingPose() calls that pass #ETrackingUniverseOrigin_TrackingUniverseSeated as the origin will be relative to this new zero
		pose. The new zero coordinate system will not change the fact that the Y axis is up in the real world, so the next pose returned from
		{@code GetDeviceToAbsoluteTrackingPose} after a call to {@code ResetSeatedZeroPose} may not be exactly an identity matrix.

		NOTE: This function overrides the user's previously saved seated zero pose and should only be called as the result of a user action. Users are also
		able to set their seated zero pose via the OpenVR Dashboard.
		"""
	)

	HmdMatrix34_t(
		"GetSeatedZeroPoseToStandingAbsoluteTrackingPose",
		"""
		Returns the transform from the seated zero pose to the standing absolute tracking system. This allows  applications to represent the seated origin to
		used or transform object positions from one coordinate system to the other.

		The seated origin may or may not be inside the Play Area or Collision Bounds returned by {@code IVRChaperone}. Its position depends on what the user
		has set from the Dashboard settings and previous calls to #ResetSeatedZeroPose().
		"""
	)

	HmdMatrix34_t(
		"GetRawZeroPoseToStandingAbsoluteTrackingPose",
		"""
		Returns the transform from the tracking origin to the standing absolute tracking system. This allows applications to convert from raw tracking space to
		the calibrated standing coordinate system.
		"""
	)

	uint32_t(
		"GetSortedTrackedDeviceIndicesOfClass",
		"""
		Get a sorted array of device indices of a given class of tracked devices (e.g. controllers).  Devices are sorted right to left relative to the
		specified tracked device (default: hmd -- pass in -1 for absolute tracking space).
		""",

		ETrackedDeviceClass.IN("eTrackedDeviceClass", "", "ETrackedDeviceClass_\\w+"),
		nullable..TrackedDeviceIndex_t.p.OUT("punTrackedDeviceIndexArray", ""),
		AutoSize("punTrackedDeviceIndexArray")..uint32_t.IN("unTrackedDeviceIndexArrayCount", ""),
		TrackedDeviceIndex_t.IN("unRelativeToTrackedDeviceIndex", ""),

		returnDoc = "the number of devices in the list, or the size of the array needed if not large enough"
	)

	EDeviceActivityLevel(
		"GetTrackedDeviceActivityLevel",
		"Returns the level of activity on the device.",

		TrackedDeviceIndex_t.IN("unDeviceId", "")
	)

	void(
		"ApplyTransform",
		"""
		Convenience utility to apply the specified transform to the specified pose. This properly transforms all pose components, including velocity and
		angular velocity.
		""",

		TrackedDevicePose_t.p.OUT("pOutputPose", ""),
		const..TrackedDevicePose_t.p.IN("pTrackedDevicePose", ""),
		const..HmdMatrix34_t.p.IN("pTransform", "")
	)

	TrackedDeviceIndex_t(
		"GetTrackedDeviceIndexForControllerRole",
		"Returns the device index associated with a specific role, for example the left hand or the right hand.",

		ETrackedControllerRole.IN("unDeviceType", "", "ETrackedControllerRole_\\w+")
	)

	ETrackedControllerRole(
		"GetControllerRoleForTrackedDeviceIndex",
		"Returns the controller type associated with a device index.",

		TrackedDeviceIndex_t.IN("unDeviceIndex", "")
	)

	ETrackedDeviceClass(
		"GetTrackedDeviceClass",
		"""
		Returns the device class of a tracked device. If there has not been a device connected in this slot since the application started this function will
		return #ETrackedDeviceClass_TrackedDeviceClass_Invalid. For previous detected devices the function will return the previously observed device class.

		To determine which devices exist on the system, just loop from 0 to #k_unMaxTrackedDeviceCount and check the device class. Every device with something
		other than #ETrackedDeviceClass_TrackedDeviceClass_Invalid is associated with an actual tracked device.
		""",

		TrackedDeviceIndex_t.IN("unDeviceIndex", "index of the device to get the device class for.")
	)

	bool(
		"IsTrackedDeviceConnected",
		"Returns true if there is a device connected in this slot.",

		TrackedDeviceIndex_t.IN("unDeviceIndex", "index of the device to test connected state for")
	)

	val GetTrackedDeviceProperty = bool(
		"GetBoolTrackedDeviceProperty",
		"Returns a bool property. If the device index is not valid or the property is not a bool type this function will return false.",

		TrackedDeviceIndex_t.IN("unDeviceIndex", "index of the device to get the property for"),
		ETrackedDeviceProperty.IN("prop", "which property to get"),
		Check(1)..nullable..ETrackedPropertyError.p.OUT(
			"pError",
			"the error returned when attempting to fetch this property. This can be $NULL if the caller doesn't care about the source of a property error."
		)
	)

	float(
		"GetFloatTrackedDeviceProperty",
		"Returns a float property. If the device index is not valid or the property is not a float type this function will return 0.",

		GetTrackedDeviceProperty["unDeviceIndex"],
		GetTrackedDeviceProperty["prop"],
		GetTrackedDeviceProperty["pError"]
	)

	int32_t(
		"GetInt32TrackedDeviceProperty",
		"Returns an int property. If the device index is not valid or the property is not a int type this function will return 0.",

		GetTrackedDeviceProperty["unDeviceIndex"],
		GetTrackedDeviceProperty["prop"],
		GetTrackedDeviceProperty["pError"]
	)

	uint64_t(
		"GetUint64TrackedDeviceProperty",
		"Returns a uint64 property. If the device index is not valid or the property is not a uint64 type this function will return 0.",

		GetTrackedDeviceProperty["unDeviceIndex"],
		GetTrackedDeviceProperty["prop"],
		GetTrackedDeviceProperty["pError"]
	)

	HmdMatrix34_t(
		"GetMatrix34TrackedDeviceProperty",
		"Returns a matrix property. If the device index is not valid or the property is not a matrix type, this function will return identity.",

		GetTrackedDeviceProperty["unDeviceIndex"],
		GetTrackedDeviceProperty["prop"],
		GetTrackedDeviceProperty["pError"]
	)

	uint32_t(
		"GetStringTrackedDeviceProperty",
		"""
		Returns a string property. If the device index is not valid or the property is not a string type this function will return 0. Otherwise it returns the
		length of the number of bytes necessary to hold this string including the trailing null. Strings will always fit in buffers of
		#k_unMaxPropertyStringSize characters.
		""",

		GetTrackedDeviceProperty["unDeviceIndex"],
		GetTrackedDeviceProperty["prop"],
		Return(RESULT, "VR.k_unMaxPropertyStringSize", includesNT = true)..nullable..charASCII_p.OUT(
			"pchValue",
			"the buffer to store string properties in. {@code unBufferSize} should be the size of this buffer."
		),
		AutoSize("pchValue")..uint32_t.IN("unBufferSize", "the size of the buffer pointed to by {@code pchValue}"),
		GetTrackedDeviceProperty["pError"]
	)

	charASCII_p(
		"GetPropErrorNameFromEnum",
		"Returns a string that corresponds with the specified property error. The string will be the name of the error enum value for all valid error codes.",

		ETrackedPropertyError.IN("error", "the error code to return a string for", "ETrackedPropertyError_\\w+")
	)

	bool(
		"PollNextEvent",
		"Returns true and fills the event with the next event on the queue if there is one. If there are no events this method returns false.",

		VREvent_t.p.OUT("pEvent", "an event structure to fill with the next event"),
		Expression("VREvent.SIZEOF")..uint32_t.IN("uncbVREvent", "the size in bytes of the ##VREvent struct")
	)

	bool(
		"PollNextEventWithPose",
		"""
		Returns true and fills the event with the next event on the queue if there is one. If there are no events this method returns false. Fills in the pose
		of the associated tracked device in the provided pose struct. This pose will always be older than the call to this function and should not be used to
		render the device.
		""",

		ETrackingUniverseOrigin.IN("eOrigin", "the tracking system to return the event's pose in", "ETrackingUniverseOrigin_\\w+"),
		VREvent_t.p.OUT("pEvent", "an event structure to fill with the next event"),
		Expression("VREvent.SIZEOF")..uint32_t.IN("uncbVREvent", "the size in bytes of the ##VREvent struct"),
		TrackedDevicePose_t.p.OUT("pTrackedDevicePose", "a pose struct to fill with the returned event's pose. Must not be $NULL.")
	)

	charASCII_p(
		"GetEventTypeNameFromEnum",
		"Returns the name of an {@code EVREvent} enum value.",

		EVREventType.IN("eType", "the event type to return a string for", "EVREventType_\\w+")
	)

	HiddenAreaMesh_t(
		"GetHiddenAreaMesh",
		"""
		Returns the hidden area mesh for the current HMD. The pixels covered by this mesh will never be seen by the user after the lens distortion is applied
		based on visibility to the panels. If this HMD does not have a hidden area mesh, the vertex data and count will be $NULL and 0 respectively.

		This mesh is meant to be rendered into the stencil buffer (or into the depth buffer setting nearz) before rendering each eye's view. This will improve
		performance by letting the GPU early-reject pixels the user will never see before running the pixel shader.

		${note("Render this mesh with backface culling disabled since the winding order of the vertices can be different per-HMD or per-eye.")}
		""",

		EVREye.IN("eEye", "the eye to get the hidden area mesh for", "EVREye_\\w+"),
		EHiddenAreaMeshType.IN("type", "", "EHiddenAreaMeshType_\\w+")
	)

	bool(
		"GetControllerState",
		"Fills the supplied struct with the current state of the controller.",

		TrackedDeviceIndex_t.IN("unControllerDeviceIndex", "the tracked device index of the controller to get the state of"),
		VRControllerState_t.p.OUT("pControllerState", "a struct to fill with the controller state"),
		Expression("VRControllerState.SIZEOF")..uint32_t.IN("unControllerStateSize", "the size in bytes of the ##VRControllerState struct"),

		returnDoc = "false if the controller index is invalid"
	)

	bool(
		"GetControllerStateWithPose",
		"""
		Fills the supplied struct with the current state of the controller and the provided pose with the pose of the controller when the controller state was
		updated most recently. Use this form if you need a precise controller pose as input to your application when the user presses or releases a button.
		""",

		ETrackingUniverseOrigin.IN("eOrigin", "the tracking coordinate system to return the pose in", "ETrackingUniverseOrigin_\\w+"),
		TrackedDeviceIndex_t.IN("unControllerDeviceIndex", "the tracked device index of the controller to get the state of"),
		VRControllerState_t.p.OUT("pControllerState", "a struct to fill with the controller state"),
		uint32_t.IN("unControllerStateSize", "the size in bytes of the ##VRControllerState struct"),
		TrackedDevicePose_t.p.OUT("pTrackedDevicePose", "a pose struct to fill with the pose of the controller when the last button event occurred")
	)

	void(
		"TriggerHapticPulse",
		"""
		Trigger a single haptic pulse on a controller. After this call the application may not trigger another haptic pulse on this controller and axis
		combination for 5ms.
		""",

		TrackedDeviceIndex_t.IN("unControllerDeviceIndex", "the tracked device index of the controller to trigger a haptic pulse on"),
		uint32_t.IN("unAxisId", "the ID of the axis to trigger a haptic pulse on"),
		unsigned_short.IN("usDurationMicroSec", "the duration of the desired haptic pulse in microseconds")
	)

	charASCII_p(
		"GetButtonIdNameFromEnum",
		"Returns the name of an {@code EVRButtonId} enum value.",

		EVRButtonId.IN("eButtonId", "the button ID to return the name of", "EVRButtonId_\\w+")
	)

	charASCII_p(
		"GetControllerAxisTypeNameFromEnum",
		"Returns the name of an {@code EVRControllerAxisType} enum value.",

		EVRControllerAxisType.IN("eAxisType", "the controller axis type to get a name for", "EVRControllerAxisType_\\w+")
	)

	bool(
		"CaptureInputFocus",
		"""
		Tells OpenVR that this process wants exclusive access to controller button states and button events. Other apps will be notified that they have lost
		input focus with a #EVREventType_VREvent_InputFocusCaptured event. Returns false if input focus could not be captured for some reason.
		"""
	)

	void(
		"ReleaseInputFocus",
		"""
		Tells OpenVR that this process no longer wants exclusive access to button states and button events. Other apps will be notified that input focus has
		been released with a #EVREventType_VREvent_InputFocusReleased event.
		"""
	)

	bool(
		"IsInputFocusCapturedByAnotherProcess",
		"Returns true if input focus is captured by another process."
	)

	uint32_t(
		"DriverDebugRequest",
		"""
		Sends a request to the driver for the specified device and returns the response. The maximum response size is 32k, but this method can be called with a
		smaller buffer. If the response exceeds the size of the buffer, it is truncated.
		""",

		TrackedDeviceIndex_t.IN("unDeviceIndex", ""),
		const..charASCII_p.IN("pchRequest", ""),
		Return(RESULT, "VR.k_unMaxDriverDebugResponseSize", includesNT = true)..nullable..charASCII_p.OUT("pchResponseBuffer", ""),
		AutoSize("pchResponseBuffer")..uint32_t.IN("unResponseBufferSize", ""),

		returnDoc = "the size of the response including its terminating null"
	)

	EVRFirmwareError(
		"PerformFirmwareUpdate",
		"""
		Performs the actual firmware update if applicable.

		The following events will be sent, if #EVRFirmwareError_VRFirmwareError_None was returned: #EVREventType_VREvent_FirmwareUpdateStarted,
		#EVREventType_VREvent_FirmwareUpdateFinished

		Use the properties #ETrackedDeviceProperty_Prop_Firmware_UpdateAvailable_Bool, #ETrackedDeviceProperty_Prop_Firmware_ManualUpdate_Bool, and
		#ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String to figure our whether a firmware update is available, and to figure out whether its a
		manual update. #ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String should point to an URL describing the manual update process.
		""",

		TrackedDeviceIndex_t.IN("unDeviceIndex", "")
	)

	void(
		"AcknowledgeQuit_Exiting",
		"""
		Call this to acknowledge to the system that #EVREventType_VREvent_Quit has been received and that the process is exiting. This extends the timeout
		until the process is killed.
		"""
	)

	void(
		"AcknowledgeQuit_UserPrompt",
		"""
		Call this to tell the system that the user is being prompted to save data. This halts the timeout and dismisses the dashboard (if it was up).
		Applications should be sure to actually prompt the user to save and then exit afterward, otherwise the user will be left in a confusing state.
		"""
	)
}