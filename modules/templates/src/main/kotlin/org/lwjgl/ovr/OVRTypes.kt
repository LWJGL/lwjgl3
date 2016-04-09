/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr

import org.lwjgl.generator.*

// We include the OVR headers from the Oculus SDK directly, so handle warnings on use-site
fun GeneratorTargetNative.includeOVRCAPI() = nativeDirective(
	"""DISABLE_WARNINGS()
#include "OVR_CAPI.h"
ENABLE_WARNINGS()""")

fun GeneratorTargetNative.includeOVRCAPI_GL() = nativeDirective(
	"""DISABLE_WARNINGS()
#include "OVR_CAPI_GL.h"
ENABLE_WARNINGS()""")

val OVR_PACKAGE = "org.lwjgl.ovr"

val long_long = IntegerType("long long", PrimitiveMapping.LONG)

//val ovrBool = NativeType("ovrBool", TypeMapping.BOOLEAN)
val ovrBool = IntegerType("ovrBool", PrimitiveMapping.BOOLEAN)
val ovrResult = IntegerType("ovrResult", PrimitiveMapping.INT)

val ovrSession = "ovrSession".opaque_p
val ovrSession_p = ovrSession.p

val ovrHmdType = "ovrHmdType".enumType
val ovrEyeType = "ovrEyeType".enumType
val ovrLayerType = "ovrLayerType".enumType

val ovrEye_Count = 2

val ovrLogCallback = "ovrLogCallback".callback(
	OVR_PACKAGE, void, "OVRLogCallback",
	"The logging callback.",
	uintptr_t.IN("userData", "an arbitrary value specified by the user of ovrInitParams"),
	int.IN("level", "one of the {@code ovrLogLevel} constants"),
	NullTerminated..const..charUTF8_p.IN("message", "a UTF8-encoded null-terminated string")
) {
	documentation = "Instances of this interface may be passed to the {@code LogCallback} member of the ##OVRInitParams struct."
	additionalCode = """
	/**
	 * Converts the specified {@link OVRLogCallback} argument to a String.
	 *
	 * <p>This method may only be used inside a OVRLogCallback invocation.</p>
	 *
	 * @param message the OVRLogCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	public static String getMessage(long message) {
		return memUTF8(message);
	}

	/** A functional interface for {@link OVRLogCallback}. */
	public interface SAMString {
		void invoke(long userData, int level, String message);
	}

	/**
	 * Creates a {@link OVRLogCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link OVRLogCallback} instance
	 */
	public static OVRLogCallback createString(final SAMString sam) {
		return new OVRLogCallback() {
			@Override
			public void invoke(long userData, int level, long message) {
				sam.invoke(userData, level, getMessage(message));
			}
		};
	}
	"""
}

val ovrErrorInfo_p = struct_p(OVR_PACKAGE, "OVRErrorInfo", nativeName = "ovrErrorInfo", mutable = false) {
	documentation = "Provides information about the last error."

	ovrResult.member("Result", "the result from the last API call that generated an error {@code ovrResult}")
	charUTF8.array(
		"ErrorString",
		"a UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions",
		size = 512
	)
}

val ovrSessionStatus_p = struct_p(OVR_PACKAGE, "OVRSessionStatus", nativeName = "ovrSessionStatus", mutable = false) {
	documentation = "Specifies status information for the current session."

	ovrBool.member("IsVisible", "True if the process has VR focus and thus is visible in the HMD.")
	ovrBool.member("HmdPresent", "True if an HMD is present.")
	ovrBool.member("HmdMounted", "True if the HMD is on the user's head.")
	ovrBool.member("DisplayLost", "True if the session is in a display-lost state. See OVR#ovr_SubmitFrame().")
	ovrBool.member("ShouldQuit", "True if the application should initiate shutdown.    ")
	ovrBool.member("ShouldRecenter", "True if UX has requested re-centering. Must call OVR#ovr_ClearShouldRecenterFlag() or OVR#ovr_RecenterTrackingOrigin().")
}

val ovrInitParams_p = struct_p(OVR_PACKAGE, "OVRInitParams", nativeName = "ovrInitParams") {
	documentation = "Parameters for OVR#ovr_Initialize()."

	uint32_t.member("Flags", "flags from {@code ovrInitFlags} to override default behavior. Use 0 for the defaults.")
	uint32_t.member(
		"RequestedMinorVersion",
		"""
		requests a specific minimum minor version of the LibOVR runtime. Flags must include OVR#ovrInit_RequestVersion or this will be ignored and
		OVRVersion#OVR_MINOR_VERSION will be used.
		"""
	)
	nullable..ovrLogCallback.member(
		"LogCallback",
		"""
		user-supplied log callback function, which may be called at any time asynchronously from multiple threads until OVR#ovr_Shutdown() completes. Use $NULL
		to specify no log callback.
		"""
	)
	uintptr_t.member(
		"UserData",
		"""
		user-supplied data which is passed as-is to {@code LogCallback}. Typically this is used to store an application-specific pointer which is read in the
		callback function.
		"""
	)
	uint32_t.member(
		"ConnectionTimeoutMS",
		"relative number of milliseconds to wait for a connection to the server before failing. Use 0 for the default timeout."
	)
	padding(4, condition = "Pointer.BITS64")
}

val ovrVector2i = struct(OVR_PACKAGE, "OVRVector2i", nativeName = "ovrVector2i") {
	documentation = "A 2D vector with integer components."

	int.member("x", "the vector x component")
	int.member("y", "the vector y component")
}.nativeType

val ovrSizei = struct(OVR_PACKAGE, "OVRSizei", nativeName = "ovrSizei") {
	documentation = "A 2D size with integer components."

	int.member("w", "the width")
	int.member("h", "the height")
}.nativeType

val ovrRecti = struct(OVR_PACKAGE, "OVRRecti", nativeName = "ovrRecti") {
	documentation = "A 2D rectangle with a position and size. All components are integers."

	ovrVector2i.member("Pos", "the rectangle position")
	ovrSizei.member("Size", "the rectangle size")
}.nativeType

val ovrQuatf = struct(OVR_PACKAGE, "OVRQuatf", nativeName = "ovrQuatf") {
	documentation = "A quaternion rotation."

	float.member("x", "the vector x component")
	float.member("y", "the vector y component")
	float.member("z", "the vector z component")
	float.member("w", "the vector w component")
}.nativeType

val ovrVector2f = struct(OVR_PACKAGE, "OVRVector2f", nativeName = "ovrVector2f") {
	documentation = "A 2D vector with float components."

	float.member("x", "the vector x component")
	float.member("y", "the vector y component")
}.nativeType

val ovrVector3f = struct(OVR_PACKAGE, "OVRVector3f", nativeName = "ovrVector3f") {
	documentation = "A 3D vector with float components."

	float.member("x", "the vector x component")
	float.member("y", "the vector y component")
	float.member("z", "the vector z component")
}.nativeType
val ovrVector3f_p = ovrVector3f.p

val ovrMatrix4f = struct(OVR_PACKAGE, "OVRMatrix4f", nativeName = "ovrMatrix4f") {
	documentation = "A 4x4 matrix with float components."

	float.array("M", "the matrix components", 16)
}.nativeType

val ovrPosef = struct(OVR_PACKAGE, "OVRPosef", nativeName = "ovrPosef") {
	documentation = "Position and orientation together."

	ovrQuatf.member("Orientation", "the pose orientation");
	ovrVector3f.member("Position", "the pose position");
}.nativeType
val ovrPosef_p = ovrPosef.p

val ovrPoseStatef = struct(OVR_PACKAGE, "OVRPoseStatef", nativeName = "ovrPoseStatef", mutable = false) {
	documentation =
		"""
		A full pose (rigid body) configuration with first and second derivatives.

		Body refers to any object for which ovrPoseStatef is providing data.  It can be the HMD, Touch controller, sensor or something else. The context
		depends on the usage of the struct.
		"""

	ovrPosef.member("ThePose", "position and orientation")
	ovrVector3f.member("AngularVelocity", "angular velocity in radians per second")
	ovrVector3f.member("LinearVelocity", "velocity in meters per second")
	ovrVector3f.member("AngularAcceleration", "angular acceleration in radians per second per second")
	ovrVector3f.member("LinearAcceleration", "acceleration in meters per second per second")
	double.member("TimeInSeconds", "absolute time that this pose refers to. See OVR#ovr_GetTimeInSeconds()")
}.nativeType

val ovrFovPort = struct(OVR_PACKAGE, "OVRFovPort", nativeName = "ovrFovPort") {
	documentation =
		"""
		Field Of View (FOV) in tangent of the angle units. As an example, for a standard 90 degree vertical FOV, we would have:
		${codeBlock("{ UpTan = tan(90 degrees / 2), DownTan = tan(90 degrees / 2) }")}
		"""

	float.member("UpTan", "the tangent of the angle between the viewing vector and the top edge of the field of view")
	float.member("DownTan", "the tangent of the angle between the viewing vector and the bottom edge of the field of view")
	float.member("LeftTan", "the tangent of the angle between the viewing vector and the left edge of the field of view")
	float.member("RightTan", "the tangent of the angle between the viewing vector and the right edge of the field of view")
}.nativeType

val ovrTrackingOrigin = "ovrTrackingOrigin".enumType

val ovrGraphicsLuid_p = struct_p(OVR_PACKAGE, "OVRGraphicsLuid", nativeName = "ovrGraphicsLuid", mutable = false) {
	documentation =
		"""
		Identifies a graphics device in a platform-specific way.

		For Windows this is a LUID type.
		"""

	char.array("Reserved", "public definition reserves space for graphics API-specific implementation.", size = 8)
}

val ovrHmdDesc = struct(OVR_PACKAGE, "OVRHmdDesc", nativeName = "ovrHmdDesc", mutable = false) {
	documentation = "A complete descriptor of the HMD."

	ovrHmdType.member("Type", "this HMD's type")
	padding(4, "Pointer.BITS64")
	charUTF8.array("ProductName", "name string describing the product: \"Oculus Rift DK1\", etc.", size = 64)
	charUTF8.array("Manufacturer", "string describing the manufacturer. Usually \"Oculus\".", size = 64)
	short.member("VendorId", "HID Vendor ID of the device")
	short.member("ProductId", "HID Product ID of the device")
	charASCII.array("SerialNumber", "HMD serial number", size = 24)
	short.member("FirmwareMajor", "HMD firmware major version number")
	short.member("FirmwareMinor", "HMD firmware minor version number")

	unsigned_int.member("AvailableHmdCaps", "capability bits described by {@code ovrHmdCaps} which the HMD currently supports")
	unsigned_int.member("DefaultHmdCaps", "capability bits described by {@code ovrHmdCaps} which are default for the current {@code Hmd}")
	unsigned_int.member("AvailableTrackingCaps", "capability bits described by {@code ovrTrackingCaps} which the system currently supports")
	unsigned_int.member("DefaultTrackingCaps", "capability bits described by {@code ovrTrackingCaps} which are default for the current system")

	ovrFovPort.array("DefaultEyeFov", "the recommended optical FOV for the HMD", size = ovrEye_Count)
	ovrFovPort.array("MaxEyeFov", "the maximum optical FOV for the HMD", size = ovrEye_Count)

	ovrSizei.member("Resolution", "resolution of the full HMD screen (both eyes) in pixels")
	float.member("DisplayRefreshRate", "nominal refresh rate of the display in cycles per second at the time of HMD creation")
	padding(4, "Pointer.BITS64")
}.nativeType

val ovrTrackerDesc = struct(OVR_PACKAGE, "OVRTrackerDesc", nativeName = "ovrTrackerDesc") {
	documentation = "Specifies the description of a single sensor."
	
    float.member("FrustumHFovInRadians", "sensor frustum horizontal field-of-view (if present).")
    float.member("FrustumVFovInRadians", "sensor frustum vertical field-of-view (if present).")
    float.member("FrustumNearZInMeters", "sensor frustum near Z (if present).")
    float.member("FrustumFarZInMeters", "sensor frustum far Z (if present).")
}.nativeType

val ovrTrackerPose = struct(OVR_PACKAGE, "OVRTrackerPose", nativeName = "ovrTrackerPose") {
	documentation = "Specifies the pose for a single sensor."
	
    unsigned_int.member("TrackerFlags", "{@code ovrTrackerFlags}.")
    ovrPosef.member("Pose", "the sensor's pose. This pose includes sensor tilt (roll and pitch). For a leveled coordinate system use {@code LeveledPose}.")
    ovrPosef.member(
	    "LeveledPose",
	    """t
	    the sensor's leveled pose, aligned with gravity. This value includes position and yaw of the sensor, but not roll and pitch. It can be used as a
	    reference point to render real-world objects in the correct location.
	    """
    )
	padding(4)
}.nativeType

val ovrTrackingState = struct(OVR_PACKAGE, "OVRTrackingState", nativeName = "ovrTrackingState", mutable = false) {
	documentation = "Tracking state at a given absolute time (describes predicted HMD pose etc). Returned by OVR#ovr_GetTrackingState()."

	ovrPoseStatef.member(
		"HeadPose",
		"""
		Predicted head pose (and derivatives) at the requested absolute time. The look-ahead interval is equal to
		{@code (HeadPose.TimeInSeconds - RawSensorData.TimeInSeconds)}.
		"""
	)

	unsigned_int.member("StatusFlags", "{@code HeadPose} tracking status described by {@code ovrStatusBits}.")

	ovrPoseStatef.array(
		"HandPoses",
		"""
		The most recent calculated pose for each hand when hand controller tracking is present. {@code HandPoses[ovrHand_Left]} refers to the left hand and
		{@code HandPoses[ovrHand_Right]} to the right hand. These values can be combined with {@code ovrInputState} for complete hand controller information.
		""",
		size = 2
	)

	unsigned_int.array(
		"HandStatusFlags",
		"{@code HandPoses} status flags described by {@code ovrStatusBits}. Only OVR#ovrStatus_OrientationTracked and OVR#ovrStatus_PositionTracked are reported.",
		size = 2
	)


	ovrPosef.member(
		"CalibratedOrigin",
		"""
		the pose of the origin captured during calibration.

		Like all other poses here, this is expressed in the space set by #RecenterTrackingOrigin(), and so will change every time that is called. This pose can
		be used to calculate where the calibrated origin lands in the new recentered space. If an application never calls #RecenterTrackingOrigin(), expect
		this value to be the identity pose and as such will point respective origin based on {@code ovrTrackingOrigin} requested when calling
		#GetTrackingState().
		""")
}.nativeType

val ovrEyeRenderDesc = struct(OVR_PACKAGE, "OVREyeRenderDesc", nativeName = "ovrEyeRenderDesc", mutable = false) {
	documentation =
		"""
		rendering information for each eye. Computed by either OVR#ovr_GetRenderDesc() based on the specified FOV. Note that the rendering viewport is not
		included here as it can be specified separately and modified per frame by passing different viewport values in the layer structure.
		"""

	ovrEyeType.member("Eye", "the eye index this instance corresponds to")
	ovrFovPort.member("Fov", "the field of view")
	ovrRecti.member("DistortedViewport", "distortion viewport")
	ovrVector2f.member("PixelsPerTanAngleAtCenter", "wow many display pixels will fit in tan(angle) = 1")
	ovrVector3f.member("HmdToEyeOffset", "translation of each eye, in meters.")
}.nativeType

val ovrTimewarpProjectionDesc = struct(OVR_PACKAGE, "OVRTimewarpProjectionDesc", nativeName = "ovrTimewarpProjectionDesc") {
	documentation =
		"""
		Projection information for ##OVRLayerEyeFovDepth.

		Use the utility function OVRUtil#ovrTimewarpProjectionDesc_FromProjection() to generate this structure from the application's projection matrix.
		"""

	float.member("Projection22", "projection matrix element [2][2]")
	float.member("Projection23", "projection matrix element [2][3]")
	float.member("Projection32", "projection matrix element [3][2]")
}.nativeType

val ovrViewScaleDesc_p = struct_p(OVR_PACKAGE, "OVRViewScaleDesc", nativeName = "ovrViewScaleDesc") {
	documentation =
		"""
		Contains the data necessary to properly calculate position info for various layer types.
		${ul(
			"{@code HmdToEyeOffset} is the same value pair provided in ##OVREyeRenderDesc.",
			"{@code HmdSpaceToWorldScaleInMeters} is used to scale player motion into in-application units."
		)}
		In other words, it is how big an in-application unit is in the player's physical meters. For example, if the application uses inches as its units then
		{@code HmdSpaceToWorldScaleInMeters} would be 0.0254. Note that if you are scaling the player in size, this must also scale. So if your application
		units are inches, but you're shrinking the player to half their normal size, then {@code HmdSpaceToWorldScaleInMeters} would be {@code 0.0254*2.0}.
		"""

	ovrVector3f.array("HmdToEyeOffset", "translation of each eye", size = ovrEye_Count)
	float.member("HmdSpaceToWorldScaleInMeters", "ratio of viewer units to meter units")
}

val ovrTextureType = "ovrTextureType".enumType
val ovrTextureFormat = "ovrTextureFormat".enumType

val ovrTextureSwapChainDesc_p = struct_p(OVR_PACKAGE, "OVRTextureSwapChainDesc", nativeName = "ovrTextureSwapChainDesc") {
	documentation = "Description used to create a texture swap chain."

	ovrTextureType.member("Type", "")
	ovrTextureFormat.member("Format", "")
	int.member("ArraySize", "only supported with OVR#ovrTexture_2D. Not supported on PC at this time.")
	int.member("Width", "")
	int.member("Height", "")
	int.member("MipLevels", "")
	int.member("SampleCount", "current only supported on depth textures")
	ovrBool.member("StaticImage", "not buffered in a chain. For images that don't change")
	unsigned_int.member("MiscFlags", "{@code ovrTextureMiscFlags}")
	unsigned_int.member("BindFlags", "{@code ovrTextureBindFlags}. Not used for GL.")
}

val ovrMirrorTextureDesc_p = struct_p(OVR_PACKAGE, "OVRMirrorTextureDesc", nativeName = "ovrMirrorTextureDesc") {
	documentation = "Description used to create a mirror texture."

	ovrTextureFormat.member("Format", "")
	int.member("Width", "")
	int.member("Height", "")
	unsigned_int.member("MiscFlags", "{@code ovrTextureMiscFlags}")
}

val ovrTextureSwapChain = "ovrTextureSwapChain".opaque_p
val ovrTextureSwapChain_p = ovrTextureSwapChain.p

val ovrMirrorTexture = "ovrMirrorTexture".opaque_p
val ovrMirrorTexture_p = ovrMirrorTexture.p

val ovrHand_Count = 2
val ovrControllerType = "ovrControllerType".enumType

val ovrInputState_p = struct_p(OVR_PACKAGE, "OVRInputState", nativeName = "ovrInputState") {
	documentation =
		"""
		Describes the complete controller input state, including Oculus Touch, and XBox gamepad. If multiple inputs are connected and used at the same time,
		their inputs are combined.
		"""

	double.member("TimeInSeconds", "system type when the controller state was last updated")
	unsigned_int.member("ConnectedControllerTypes", "described by {@code ovrControllerType}. Indicates which ControllerTypes are present.")
	unsigned_int.member("Buttons", "values for buttons described by {@code ovrButton}")
	unsigned_int.member("Touches", "touch values for buttons and sensors as described by {@code ovrTouch}.")
	float.array(
		"IndexTrigger",
		"left and right finger trigger values (OVR#ovrHand_Left and OVR#ovrHand_Right), in the range 0.0 to 1.0f.",
		size = ovrHand_Count
	)
	float.array(
		"HandTrigger",
		"left and right hand trigger values (OVR#ovrHand_Left and OVR#ovrHand_Right), in the range 0.0 to 1.0f.",
		size = ovrHand_Count
	)
	ovrVector2f.array(
		"Thumbstick",
		"horizontal and vertical thumbstick axis values (OVR#ovrHand_Left and OVR#ovrHand_Right), in the range -1.0f to 1.0f.",
		size = ovrHand_Count
	)
	ovrControllerType.member("ControllerType", "The type of the controller this state is for.")
}

val ovrLayerHeader = struct(OVR_PACKAGE, "OVRLayerHeader", nativeName = "ovrLayerHeader") {
	documentation =
		"""
		Defines properties shared by all ovrLayer structs, such as ##OVRLayerEyeFov.

		{@code ovrLayerHeader} is used as a base member in these larger structs. This struct cannot be used by itself except for the case that {@code Type} is
		OVR#ovrLayerType_Disabled.
		"""

	ovrLayerType.member("Type", "described by {@code ovrLayerType}")
	unsigned_int.member("Flags", "described by {@code ovrLayerFlags}")
}.nativeType
val ovrLayerHeader_p = ovrLayerHeader.p
val ovrLayerHeader_p_const_p = ovrLayerHeader_p.p_const_p

val ovrLayerEyeFov = struct(OVR_PACKAGE, "OVRLayerEyeFov", nativeName = "ovrLayerEyeFov") {
	documentation =
		"""
		Describes a layer that specifies a monoscopic or stereoscopic view. This is the kind of layer that's typically used as layer 0 to
		OVR#ovr_SubmitFrame(), as it is the kind of layer used to render a 3D stereoscopic view.
		"""

	ovrLayerHeader.member("Header", "{@code Header.Type} must be OVR#ovrLayerType_EyeFov.")
	ovrTextureSwapChain.array(
		"ColorTexture",
		"{@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be $NULL.",
		size = ovrEye_Count,
		validSize = 1
	)
	ovrRecti.array(
		"Viewport",
		"specifies the ColorTexture sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.",
		size = ovrEye_Count
	)
	ovrFovPort.array("Fov", "the viewport field of view", size = ovrEye_Count)
	ovrPosef.array(
		"RenderPose",
		"""
		specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned from
		OVRUtil#ovr_CalcEyePoses(), but can be different in special cases if a different head pose is used for rendering.
		""",
		size = ovrEye_Count
	)
	double.member(
		"SensorSampleTime",
		"""
		specifies the timestamp when the source ##OVRPosef (used in calculating RenderPose) was sampled from the SDK. Typically retrieved by calling
		OVR#ovr_GetTimeInSeconds() around the instant the application calls OVR#ovr_GetTrackingState(). The main purpose for this is to accurately track app
		tracking latency.
		"""
	)
}.nativeType

val ovrLayerQuad = struct(OVR_PACKAGE, "OVRLayerQuad", nativeName = "ovrLayerQuad") {
	documentation =
		"""
		Describes a layer of Quad type, which is a single quad in world or viewer space. It is used for both OVR#ovrLayerType_Quad. This type of layer
		represents a single object placed in the world and not a stereo view of the world itself.

		A typical use of OVR#ovrLayerType_Quad is to draw a television screen in a room that for some reason is more convenient to draw as a layer than
		as part of the main view in layer 0. For example, it could implement a 3D popup GUI that is drawn at a higher resolution than layer 0 to improve
		fidelity of the GUI.

		Quad layers are visible from both sides; they are not back-face culled.
		"""

	ovrLayerHeader.member("Header", "{@code Header.Type} must be OVR#ovrLayerType_Quad")
	ovrTextureSwapChain.member("ColorTexture", "contains a single image, never with any stereo view")
	ovrRecti.member("Viewport", "specifies the ColorTexture sub-rect UV coordinates")
	ovrPosef.member(
		"QuadPoseCenter",
		"""
		specifies the orientation and position of the center point of a Quad layer type.

		The supplied direction is the vector perpendicular to the quad. The position is in real-world meters (not the application's virtual world, the physical
		world the user is in) and is relative to the "zero" position set by OVR#ovr_RecenterTrackingOrigin() unless the OVR#ovrLayerFlag_HeadLocked flag is
		used.
		"""
	)
	ovrVector2f.member("QuadSize", "width and height (respectively) of the quad in meters")
}.nativeType

// OVR_CAPI_Util.h

val ovrDetectResult = struct(OVR_PACKAGE, "OVRDetectResult", nativeName = "ovrDetectResult", mutable = false) {
	documentation = "Return values for OVRUtil##ovr_Detect()"

	ovrBool.member(
		"IsOculusServiceRunning",
		"""
		is OVR#ovrFalse when the Oculus Service is not running. This means that the Oculus Service is either uninstalled or stopped.
		{@code IsOculusHMDConnected} will be OVR#ovrFalse in this case.

		is OVR#ovrTrue when the Oculus Service is running. This means that the Oculus Service is installed and running. {@code IsOculusHMDConnected} will
		reflect the state of the HMD.
		"""
	)
	ovrBool.member(
		"IsOculusHMDConnected",
		"""
		is OVR#ovrFalse when an Oculus HMD is not detected. If the Oculus Service is not running, this will be OVR#ovrFalse.

		is OVR#ovrTrue when an Oculus HMD is detected. This implies that the Oculus Service is also installed and running.
		"""
	)
	padding(6)
}.nativeType

fun config() {
	packageInfo(
		OVR_PACKAGE,
		"""
		Contains bindings to LibOVR, the <a href="https://developer.oculus.com/">Oculus SDK</a> library.

		Documentation on how to get started with the Oculus SDK can be found <a href="https://developer.oculus.com/documentation/">here</a>.
		"""
	)

	struct(OVR_PACKAGE, "OVRLayerEyeMatrix", nativeName = "ovrLayerEyeMatrix") {
		documentation =
			"""
			Describes a layer that specifies a monoscopic or stereoscopic view. This uses a direct 3x4 matrix to map from view space to the UV coordinates. It
			is essentially the same thing as ##OVRLayerEyeFov but using a much lower level. This is mainly to provide compatibility with specific apps. Unless
			the application really requires this flexibility, it is usually better to use ##OVRLayerEyeFov.

			Three options exist with respect to mono/stereo texture usage:
			${ul(
				"""
				ColorTexture[0] and ColorTexture[1] contain the left and right stereo renderings, respectively. Viewport[0] and Viewport[1] refer to
				ColorTexture[0] and ColorTexture[1], respectively.
				""",
				"""
				ColorTexture[0] contains both the left and right renderings, ColorTexture[1] is $NULL, and Viewport[0] and Viewport[1] refer to sub-rects with
				ColorTexture[0].
				""",
				"ColorTexture[0] contains a single monoscopic rendering, and Viewport[0] and Viewport[1] both refer to that rendering."
			)}
			"""

		ovrLayerHeader.member("Header", "{@code Header.Type} must be OVR#ovrLayerType_EyeMatrix")
		ovrTextureSwapChain.array(
			"ColorTexture",
			"{@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be $NULL",
			size = ovrEye_Count,
			validSize = 1
		)
		ovrRecti.array(
			"Viewport",
			"specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.",
			size = ovrEye_Count
		)
		ovrPosef.array(
			"RenderPose",
			"""
			specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned
			from OVRUtil#ovr_CalcEyePoses(), but can be different in special cases if a different head pose is used for rendering.
			""",
			size = ovrEye_Count
		)
		ovrMatrix4f.array(
			"Matrix",
			"""
			specifies the mapping from a view-space vector to a UV coordinate on the textures given above.
			${codeBlock("""
P = (x,y,z,1)*Matrix
TexU  = P.x/P.z
TexV  = P.y/P.z""")}
			""",
			size = ovrEye_Count
		)
		double.member(
			"SensorSampleTime",
			"""
			specifies the timestamp when the source ##OVRPosef (used in calculating RenderPose) was sampled from the SDK. Typically retrieved by calling
			OVR#ovr_GetTimeInSeconds() around the instant the application calls OVR#ovr_GetTrackingState(). The main purpose for this is to accurately track
			app tracking latency.
			"""
		)

	}.nativeType

	union(OVR_PACKAGE, "OVRLayerUnion", nativeName = "ovrLayer_Union") {
		documentation = "Union that combines {@code ovrLayer} types in a way that allows them to be used in a polymorphic way."

		ovrLayerHeader.member("Header", "the layer header")
		ovrLayerEyeFov.member("EyeFov", "")
		ovrLayerQuad.member("Quad", "")
	}
}