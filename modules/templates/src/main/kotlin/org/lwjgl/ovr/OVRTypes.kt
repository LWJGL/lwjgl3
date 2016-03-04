/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr

import org.lwjgl.generator.*
import org.lwjgl.opengl.GLuint

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
val ovrRenderAPIType = "ovrRenderAPIType".enumType
val ovrLayerType = "ovrLayerType".enumType

val ovrEye_Count = 2

val ovrLogCallback = "ovrLogCallback".callback(
	OVR_PACKAGE, void, "OVRLogCallback",
	"The logging callback.",
	uintptr_t.IN("userData", "an arbitrary value specified by the user of ovrInitParams"),
	int.IN("level", "one of the ovrLogLevel constants"),
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
		return memDecodeUTF8(message);
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

	ovrResult.member("Result", "the result from the last API call that generated an error ovrResult")
	charUTF8.array("ErrorString", "a UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions", size = 512)
}

val ovrSessionStatus_p = struct_p(OVR_PACKAGE, "OVRSessionStatus", nativeName = "ovrSessionStatus", mutable = false) {
	documentation = "Specifies status information for the current session."

	ovrBool.member("HasVrFocus", "true if the process has VR focus and thus is visible in the HMD")
	ovrBool.member("HmdPresent", "true if an HMD is present")
}

val ovrInitParams_p = struct_p(OVR_PACKAGE, "OVRInitParams", nativeName = "ovrInitParams") {
	documentation = "Parameters for OVR#ovr_Initialize()."

	uint32_t.member("Flags", "combination of ovrInitFlags or 0")
	uint32_t.member(
		"RequestedMinorVersion",
		"request a specific minimum minor version of the LibOVR runtime. Flags must include ovrInit_RequestVersion or this will be ignored."
	)
	nullable..ovrLogCallback.member(
		"LogCallback",
		"""
		log callback function, which may be called at any time asynchronously from multiple threads until OVR#ovr_Shutdown() completes. Pass $NULL for no log
		callback.
		"""
	)
	uintptr_t.member(
		"UserData",
		"""
		user-supplied data which is passed as-is to LogCallback. Typically this is used to store an application-specific pointer which is read in the callback
		function.
		"""
	)
	uint32_t.member("ConnectionTimeoutMS", "number of milliseconds to wait for a connection to the server. Pass 0 for the default timeout")
	padding(4)
}

val ovrGraphicsLuid_p = struct_p(OVR_PACKAGE, "OVRGraphicsLuid", nativeName = "ovrGraphicsLuid", mutable = false) {
	documentation = "A system specific graphics adapter identifier."
	includeOVRCAPI()
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

		Body refers to any object for which ovrPoseStatef is providing data.  It can be the HMD, Touch controller, camera or something else. The context
		depends on the usage of the struct.
		"""

	ovrPosef.member("ThePose", "position and orientation")
	ovrVector3f.member("AngularVelocity", "angular velocity in radians per second")
	ovrVector3f.member("LinearVelocity", "velocity in meters per second")
	ovrVector3f.member("AngularAcceleration", "angular acceleration in radians per second per second")
	ovrVector3f.member("LinearAcceleration", "acceleration in meters per second per second")
	double.member("TimeInSeconds", "absolute time of this state sample")
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

val ovrHmdDesc = struct(OVR_PACKAGE, "OVRHmdDesc", nativeName = "ovrHmdDesc", mutable = false) {
	documentation = "A complete descriptor of the HMD."

	ovrHmdType.member("Type", "this HMD's type")
	padding(4, "Pointer.BITS64")
	charUTF8.array("ProductName", "name string describing the product: \"Oculus Rift DK1\", etc.", size = 64)
	charUTF8.array("Manufacturer", "string describing the manufacturer. Usually \"Oculus\".", size = 64)
	short.member("VendorId", "HID Vendor ID of the device")
	short.member("ProductId", "HID Product ID of the device")
	charASCII.array("SerialNumber", "sensor (and display) serial number", size = 24)
	short.member("FirmwareMajor", "sensor firmware major version number")
	short.member("FirmwareMinor", "sensor firmware minor version number")

	// External tracking camera frustum dimensions (if present).
	float.member("CameraFrustumHFovInRadians", "horizontal field-of-view")
	float.member("CameraFrustumVFovInRadians", "vertical field-of-view")
	float.member("CameraFrustumNearZInMeters", "near clip distance")
	float.member("CameraFrustumFarZInMeters", "far clip distance")

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

val ovrSensorData = struct(OVR_PACKAGE, "OVRSensorData", nativeName = "ovrSensorData", mutable = false) {
	documentation = "Specifies a reading we can query from the sensor."

	ovrVector3f.member("Accelerometer", "acceleration reading in m/s^2")
	ovrVector3f.member("Gyro", "rotation rate in rad/s")
	ovrVector3f.member("Magnetometer", "magnetic field in Gauss")
	float.member("Temperature", "temperature of the sensor in degrees Celsius")
	float.member("TimeInSeconds", "time when the reported IMU reading took place, in seconds")
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

	ovrPosef.member(
		"CameraPose",
		"""
		Current pose of the external camera (if present). This pose includes camera tilt (roll and pitch). For a leveled coordinate system use
		{@code LeveledCameraPose}.
		"""
	)

	ovrPosef.member(
		"LeveledCameraPose",
		"""
		Camera frame aligned with gravity. This value includes position and yaw of the camera, but not roll and pitch. It can be used as a reference point to
		render real-world objects in the correct location.
		"""
	)

	ovrPoseStatef.array(
		"HandPoses",
		"""
		The most recent calculated pose for each hand when hand controller tracking is present. {@code HandPoses[ovrHand_Left]} refers to the left hand and
		{@code HandPoses[ovrHand_Right]} to the right hand. These values can be combined with {@code ovrInputState} for complete hand controller information.
		""",
		size = 2
	)

	ovrSensorData.member("RawSensorData", "the most recent sensor data received from the HMD")
	unsigned_int.member("StatusFlags", "tracking status described by {@code ovrStatusBits}")

	unsigned_int.array(
		"HandStatusFlags",
		"hand status flags described by {@code ovrStatusBits}. Only OVR#ovrStatus_OrientationTracked and OVR#ovrStatus_PositionTracked are reported.",
		size = 2
	)

	uint32_t.member("LastCameraFrameCounter", "tag the vision processing results to a certain frame counter number")
}.nativeType
val ovrTrackingState_p = ovrTrackingState.p

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
	ovrVector3f.member("HmdToEyeViewOffset", "translation to be applied to view matrix for each eye offset")
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
			"{@code HmdToEyeViewOffset} is the same value pair provided in ##OVREyeRenderDesc.",
			"{@code HmdSpaceToWorldScaleInMeters} is used to scale player motion into in-application units."
		)}
		In other words, it is how big an in-application unit is in the player's physical meters. For example, if the application uses inches as its units then
		{@code HmdSpaceToWorldScaleInMeters} would be 0.0254. Note that if you are scaling the player in size, this must also scale. So if your application
		units are inches, but you're shrinking the player to half their normal size, then {@code HmdSpaceToWorldScaleInMeters} would be {@code 0.0254*2.0}.
		"""

	ovrVector3f.array("HmdToEyeViewOffset", "translation of each eye", size = ovrEye_Count)
	float.member("HmdSpaceToWorldScaleInMeters", "ratio of viewer units to meter units")
}

val ovrTextureHeader = struct(OVR_PACKAGE, "OVRTextureHeader", nativeName = "ovrTextureHeader") {
	documentation = "API-independent part of a texture descriptor."

	ovrRenderAPIType.member("API", "the graphics API in use")
	ovrSizei.member("TextureSize", "the size of the texture")
}.nativeType

val ovrTexture = struct(OVR_PACKAGE, "OVRTexture", nativeName = "ovrTexture") {
	documentation = "Contains platform-specific information about a texture. Aliases to one of ovrD3D11Texture or ##OVRGLTexture."

	ovrTextureHeader.member("Header", "API-independent header")
	uintptr_t.array("PlatformData", "specialized in ##OVRGLTextureData, {@code ovrD3D11TextureData} etc", size = 8)
}.nativeType
val ovrTexture_p = ovrTexture.p
val ovrTexture_pp = ovrTexture_p.p

val ovrSwapTextureSet = struct(OVR_PACKAGE, "OVRSwapTextureSet", nativeName = "ovrSwapTextureSet") {
	documentation =
		"""
		Describes a set of textures that act as a rendered flip chain.

		An ovrSwapTextureSet per layer is passed to OVR#ovr_SubmitFrame() via one of the ovrLayer types. The {@code TextureCount} refers to the flip chain
		count and not an eye count. See the layer structs and functions for information about how to use ovrSwapTextureSet.

		ovrSwapTextureSets must be created by either the ovr_CreateSwapTextureSetD3D11 or OVRGL#ovr_CreateSwapTextureSetGL() factory function, and must
		be destroyed by OVR#ovr_DestroySwapTextureSet().
		"""

	ovrTexture_p.buffer("Textures", "points to an array of ovrTextures")
	AutoSize("Textures")..int.member("TextureCount", "the number of textures referenced by the Textures array")


	int.member(
		"CurrentIndex",
		"""
		CurrentIndex specifies which of the Textures will be used by the OVR#ovr_SubmitFrame() call. This is manually incremented by the application, typically
		in a round-robin manner.

		Before selecting a {@code Texture} as a rendertarget, the application should increment {@code CurrentIndex} by 1 and wrap it back to 0 if
		{@code CurrentIndex == TextureCount}, so that it gets a fresh rendertarget,	one that is not currently being used for display. It can then render to
		{@code Textures[CurrentIndex]}.

		After rendering, the application calls OVR#ovr_SubmitFrame() using that same {@code CurrentIndex} value	to display the new rendertarget.

		The application can submit multiple frames with the same {@code ovrSwapTextureSet} and {@code CurrentIndex} value if the rendertarget does not need to
		be updated, for example when displaying an	information display whose text has not changed since the previous frame.

		Multiple layers can use the same {@code ovrSwapTextureSet} at the same time - there is no need to create a unique {@code ovrSwapTextureSet} for each
		layer. However, all the layers using a particular {@code ovrSwapTextureSet} will share the same value of {@code CurrentIndex}, so they cannot use
		different textures within the {@code ovrSwapTextureSet}.

		Once a particular {@code Textures[CurrentIndex]} has been sent to OVR#ovr_SubmitFrame(), that texture should not be rendered to until a subsequent
		OVR#ovr_SubmitFrame() is made (either with a different {@code CurrentIndex} value, or with a different {@code ovrSwapTextureSet}, or disabling the
		layer).
		"""
	)
}.nativeType
val ovrSwapTextureSet_p = ovrSwapTextureSet.p
val ovrSwapTextureSet_pp = ovrSwapTextureSet_p.p

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
	float.array("IndexTrigger", "left and right finger trigger values (OVR#ovrHand_Left and OVR#ovrHand_Right), in the range 0.0 to 1.0f.", size = 2)
	float.array("HandTrigger", "left and right hand trigger values (OVR#ovrHand_Left and OVR#ovrHand_Right), in the range 0.0 to 1.0f.", size = 2)
	ovrVector2f.array(
		"Thumbstick",
		"horizontal and vertical thumbstick axis values (OVR#ovrHand_Left and OVR#ovrHand_Right), in the range -1.0f to 1.0f.",
		size = 2
	)
}

val ovrLayerHeader = struct(OVR_PACKAGE, "OVRLayerHeader", nativeName = "ovrLayerHeader") {
	documentation = "Defines properties shared by all ovrLayer structs, such as ##OVRLayerEyeFov."

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
	ovrSwapTextureSet_p.array(
		"ColorTexture",
		"{@code ovrSwapTextureSets} for the left and right eye respectively. The second one of which can be $NULL.",
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

val ovrLayerEyeFovDepth = struct(OVR_PACKAGE, "OVRLayerEyeFovDepth", nativeName = "ovrLayerEyeFovDepth") {
	documentation =
		"""
		Describes a layer that specifies a monoscopic or stereoscopic view, with depth textures in addition to color textures. This is typically used to
		support positional time warp. This struct is the same as ##OVRLayerEyeFov, but with the addition of {@code DepthTexture} and {@code ProjectionDesc}.
		"""

	ovrLayerHeader.member("Header", "{@code Header.Type} must be OVR#ovrLayerType_EyeFovDepth.")
	ovrSwapTextureSet_p.array(
		"ColorTexture",
		"{@code ovrSwapTextureSets} for the left and right eye respectively. The second one of which can be $NULL.",
		size = ovrEye_Count,
		validSize = 1
	)
	ovrRecti.array(
		"Viewport",
		"specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.",
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
		specifies the timestamp when the source {@code ovrPosef} (used in calculating RenderPose) was sampled from the SDK. Typically retrieved by calling
		OVR#ovr_GetTimeInSeconds() around the instant the application calls OVR#ovr_GetTrackingState(). The main purpose for this is to accurately track app
		tracking latency.
		"""
	)
	ovrSwapTextureSet_p.array(
		"DepthTexture", "depth texture for positional timewarp. Must map 1:1 to the {@code ColorTexture}.",
		size = ovrEye_Count,
		validSize = 1
	)
	ovrTimewarpProjectionDesc.member("ProjectionDesc", "specifies how to convert {@code DepthTexture} information into meters")
}.nativeType

val ovrLayerEyeMatrix = struct(OVR_PACKAGE, "OVRLayerEyeMatrix", nativeName = "ovrLayerEyeMatrix") {
	documentation =
		"""
		Describes a layer that specifies a monoscopic or stereoscopic view. This uses a direct 3x4 matrix to map from view space to the UV coordinates. It is
		essentially the same thing as ##OVRLayerEyeFov but using a much lower level. This is mainly to provide compatibility with specific apps. Unless the
		application really requires this flexibility, it is usually better to use ##OVRLayerEyeFov.

		Three options exist with respect to mono/stereo texture usage:
		${ul(
			"""
			ColorTexture[0] and ColorTexture[1] contain the left and right stereo renderings, respectively. Viewport[0] and Viewport[1] refer to
			ColorTexture[0] and ColorTexture[1], respectively.
			""",
			"""
			ColorTexture[0] contains both the left and right renderings, ColorTexture[1] is NULL, and Viewport[0] and Viewport[1] refer to sub-rects with
			ColorTexture[0].
			""",
			"ColorTexture[0] contains a single monoscopic rendering, and Viewport[0] and Viewport[1] both refer to that rendering."
		)}
		"""

	ovrLayerHeader.member("Header", "{@code Header.Type} must be OVR#ovrLayerType_EyeMatrix")
	ovrSwapTextureSet_p.array(
		"ColorTexture",
		"{@code ovrSwapTextureSets} for the left and right eye respectively. The second one of which can be $NULL",
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
		specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned from
		OVRUtil#ovr_CalcEyePoses(), but can be different in special cases if a different head pose is used for rendering.
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
TexV  = P.y/P.z"""
		)}
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
	ovrSwapTextureSet_p.member("ColorTexture", "contains a single image, never with any stereo view")
	ovrRecti.member("Viewport", "specifies the ColorTexture sub-rect UV coordinates")
	ovrPosef.member("QuadPoseCenter", "position and orientation of the center of the quad. Position is specified in meters.")
	ovrVector2f.member("QuadSize", "width and height (respectively) of the quad in meters")
}.nativeType

val ovrLayerDirect = struct(OVR_PACKAGE, "OVRLayerDirect", nativeName = "ovrLayerDirect") {
	documentation =
		"""
		Describes a layer which is copied to the HMD as-is. Neither distortion, time warp, nor vignetting is applied to {@code ColorTexture} before it's copied
		to the HMD. The application can, however implement these kinds of effects itself before submitting the layer. This layer can be used for
		application-based distortion rendering and can also be used for implementing a debug HUD that's viewed on the mirror texture.
		"""

	ovrLayerHeader.member("Header", "{@code Header.Type} must be OVR#ovrLayerType_Direct")
	ovrSwapTextureSet_p.array(
		"ColorTexture",
		"{@code ovrSwapTextureSets} for the left and right eye respectively. The second one of which can be $NULL.",
		size = ovrEye_Count,
		validSize = 1
	)
	ovrRecti.array(
		"Viewport",
		"specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.",
		size = ovrEye_Count
	)
}.nativeType

// OVR_CAPI_GL.h

val ovrGLTextureData = struct(OVR_PACKAGE, "OVRGLTextureData", nativeName = "ovrGLTextureData") {
	documentation = "OpenGL texture data."

	ovrTextureHeader.member("Header", "general device settings")
	GLuint.member("TexId", "the OpenGL name for this texture")
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

	union(OVR_PACKAGE, "OVRLayerUnion", nativeName = "ovrLayer_Union") {
		documentation = "Union that combines {@code ovrLayer} types in a way that allows them to be used in a polymorphic way."

		ovrLayerHeader.member("Header", "the layer header")
		ovrLayerEyeFov.member("EyeFov", "")
		ovrLayerEyeFovDepth.member("EyeFovDepth", "")
		ovrLayerQuad.member("Quad", "")
		ovrLayerDirect.member("Direct", "")
	}

	// OVR_CAPI_GL.h

	union(OVR_PACKAGE, "OVRGLTexture", nativeName = "ovrGLTexture") {
		documentation = "Contains OpenGL-specific texture information."

		ovrTexture.member("Texture", "general device settings")
		ovrGLTextureData.member("OGL", "OpenGL-specific settings")
	}
}