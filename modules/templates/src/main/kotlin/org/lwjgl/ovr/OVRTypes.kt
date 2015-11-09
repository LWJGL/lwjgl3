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

val ovrHmdType = typedef(int, "ovrHmdType")
val ovrEyeType = typedef(int, "ovrEyeType")
val ovrRenderAPIType = typedef(int, "ovrRenderAPIType")
val ovrLayerType = typedef(int, "ovrLayerType")

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

val ovrErrorInfo_p = struct_p(OVR_PACKAGE, "OVRErrorInfo", structName = "ovrErrorInfo", mutable = false) {
	documentation = "Provides information about the last error."
	includeOVRCAPI()

	ovrResult.member("Result") ///< The result from the last API call that generated an error ovrResult.
	char.member("ErrorString", size = 512) ///< A UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions.
}

val ovrSessionStatus_p = struct_p(OVR_PACKAGE, "OVRSessionStatus", structName = "ovrSessionStatus", mutable = false) {
	documentation = "Specifies status information for the current session."
	includeOVRCAPI()

	ovrBool.member("HasVrFocus") ///< True if the process has VR focus and thus is visible in the HMD.
	ovrBool.member("HmdPresent") ///< True if an HMD is present.
}

val ovrInitParams_p = struct_p(OVR_PACKAGE, "OVRInitParams", structName = "ovrInitParams") {
	documentation = "Parameters for OVR#ovr_Initialize()."
	includeOVRCAPI()

	/// Flags from ovrInitFlags to override default behavior.
	/// Pass 0 for the defaults.
	uint32_t.member("Flags") ///< Combination of ovrInitFlags or 0

	/// Request a specific minimum minor version of the LibOVR runtime.
	/// Flags must include ovrInit_RequestVersion or this will be ignored.
	uint32_t.member("RequestedMinorVersion")

	/// Log callback function, which may be called at any time asynchronously from
	/// multiple threads until ovr_Shutdown() completes.
	/// Pass 0 for no log callback.
	ovrLogCallback.member("LogCallback") ///< Function pointer or 0

	/// User-supplied data which is passed as-is to LogCallback. Typically this
	/// is used to store an application-specific pointer which is read in the
	/// callback function.
	uintptr_t.member("UserData")

	/// Number of milliseconds to wait for a connection to the server.
	/// Pass 0 for the default timeout.
	uint32_t.member("ConnectionTimeoutMS") ///< Timeout in Milliseconds or 0
}

val ovrGraphicsLuid_p = struct_p(OVR_PACKAGE, "OVRGraphicsLuid", structName = "ovrGraphicsLuid", mutable = false) {
	documentation = "A system specific graphics adapter identifier."
	includeOVRCAPI()

	char.member("Reserved", size = 8)
}

val ovrVector2i = struct(OVR_PACKAGE, "OVRVector2i", structName = "ovrVector2i") {
	documentation = "A 2D vector with integer components."
	includeOVRCAPI()

	int.member("x")
	int.member("y")
}.nativeType

val ovrSizei = struct(OVR_PACKAGE, "OVRSizei", structName = "ovrSizei") {
	documentation = "A 2D size with integer components."
	includeOVRCAPI()

	int.member("w")
	int.member("h")
}.nativeType

val ovrRecti = struct(OVR_PACKAGE, "OVRRecti", structName = "ovrRecti") {
	documentation = "A 2D rectangle with a position and size. All components are integers."
	includeOVRCAPI()

	ovrVector2i.member("Pos")
	ovrSizei.member("Size")
}.nativeType

val ovrQuatf = struct(OVR_PACKAGE, "OVRQuatf", structName = "ovrQuatf") {
	documentation = "A quaternion rotation."
	includeOVRCAPI()

	float.member("x")
	float.member("y")
	float.member("z")
	float.member("w")
}.nativeType

val ovrVector2f = struct(OVR_PACKAGE, "OVRVector2f", structName = "ovrVector2f") {
	documentation = "A 2D vector with float components."
	includeOVRCAPI()

	float.member("x")
	float.member("y")
}.nativeType

val ovrVector3f = struct(OVR_PACKAGE, "OVRVector3f", structName = "ovrVector3f") {
	documentation = "A 3D vector with float components."
	includeOVRCAPI()

	float.member("x")
	float.member("y")
	float.member("z")
}.nativeType
val ovrVector3f_p = ovrVector3f.p

val ovrMatrix4f = struct(OVR_PACKAGE, "OVRMatrix4f", structName = "ovrMatrix4f") {
	documentation = "A 4x4 matrix with float components."
	includeOVRCAPI()

	float.member("M", "m", 16)
}.nativeType

val ovrPosef = struct(OVR_PACKAGE, "OVRPosef", structName = "ovrPosef") {
	documentation = "Position and orientation together."
	includeOVRCAPI()

	ovrQuatf.member("Orientation");
	ovrVector3f.member("Position");
}.nativeType
val ovrPosef_p = ovrPosef.p

val ovrPoseStatef = struct(OVR_PACKAGE, "OVRPoseStatef", structName = "ovrPoseStatef", mutable = false) {
	documentation =
		"""
		A full pose (rigid body) configuration with first and second derivatives.

		Body refers to any object for which ovrPoseStatef is providing data.  It can be the HMD, Touch controller, camera or something else. The context
		depends on the usage of the struct.
		"""
	includeOVRCAPI()

	ovrPosef.member("ThePose") ///< Position and orientation.
	ovrVector3f.member("AngularVelocity") ///< Angular velocity in radians per second.
	ovrVector3f.member("LinearVelocity") ///< Velocity in meters per second.
	ovrVector3f.member("AngularAcceleration") ///< Angular acceleration in radians per second per second.
	ovrVector3f.member("LinearAcceleration") ///< Acceleration in meters per second per second.
	double.member("TimeInSeconds") ///< Absolute time of this state sample.
}.nativeType

val ovrFovPort = struct(OVR_PACKAGE, "OVRFovPort", structName = "ovrFovPort") {
	documentation =
		"""
		Field Of View (FOV) in tangent of the angle units. As an example, for a standard 90 degree vertical FOV, we would have:
		${codeBlock("{ UpTan = tan(90 degrees / 2), DownTan = tan(90 degrees / 2) }")}.
		"""
	includeOVRCAPI()

	float.member("UpTan") /// The tangent of the angle between the viewing vector and the top edge of the field of view.
	float.member("DownTan") /// The tangent of the angle between the viewing vector and the bottom edge of the field of view.
	float.member("LeftTan") /// The tangent of the angle between the viewing vector and the left edge of the field of view.
	float.member("RightTan") /// The tangent of the angle between the viewing vector and the right edge of the field of view.
}.nativeType

val ovrHmdDesc = struct(OVR_PACKAGE, "OVRHmdDesc", structName = "ovrHmdDesc", mutable = false) {
	documentation = "A complete descriptor of the HMD."
	includeOVRCAPI()

	ovrHmdType.member("Type") // This HMD's type.
	charUTF8.member("ProductName", size = 64, nullTerminated = true) // Name string describing the product: "Oculus Rift DK1", etc.
	charUTF8.member("Manufacturer", size = 64, nullTerminated = true) // String describing the manufacturer. Usually "Oculus".
	short.member("VendorId") // HID Vendor ID of the device.
	short.member("ProductId") // HID Product ID of the device.
	charASCII.member("SerialNumber", size = 24, nullTerminated = true) // Sensor (and display) serial number.
	short.member("FirmwareMajor") // Sensor firmware major version number.
	short.member("FirmwareMinor") // Sensor firmware minor version number.

	// External tracking camera frustum dimensions (if present).
	float.member("CameraFrustumHFovInRadians") // Horizontal field-of-view
	float.member("CameraFrustumVFovInRadians") // Vertical field-of-view
	float.member("CameraFrustumNearZInMeters") // Near clip distance
	float.member("CameraFrustumFarZInMeters") // Far clip distance

	unsigned_int.member("AvailableHmdCaps") // Capability bits described by ovrHmdCaps which the HMD currently supports.
	unsigned_int.member("DefaultHmdCaps") // Capability bits described by ovrHmdCaps which are default for the current Hmd.
	unsigned_int.member("AvailableTrackingCaps") // Capability bits described by ovrTrackingCaps which the system currently supports.
	unsigned_int.member("DefaultTrackingCaps") // Capability bits described by ovrTrackingCaps which are default for the current system.

	ovrFovPort.member("DefaultEyeFov", size = ovrEye_Count) // The recommended optical FOV for the HMD.
	ovrFovPort.member("MaxEyeFov", size = ovrEye_Count) // The maximum optical FOV for the HMD.

	ovrSizei.member("Resolution") // Resolution of the full HMD screen (both eyes) in pixels.
	float.member("DisplayRefreshRate") // Nominal refresh rate of the display in cycles per second at the time of HMD creation.
}.nativeType

val ovrSensorData = struct(OVR_PACKAGE, "OVRSensorData", structName = "ovrSensorData", mutable = false) {
	documentation = "Specifies a reading we can query from the sensor."
	includeOVRCAPI()

	ovrVector3f.member("Accelerometer") /// Acceleration reading in m/s^2.
	ovrVector3f.member("Gyro") /// Rotation rate in rad/s.
	ovrVector3f.member("Magnetometer") /// Magnetic field in Gauss.
	float.member("Temperature") /// Temperature of the sensor in degrees Celsius.
	float.member("TimeInSeconds") /// Time when the reported IMU reading took place, in seconds.
}.nativeType

val ovrTrackingState = struct(OVR_PACKAGE, "OVRTrackingState", structName = "ovrTrackingState", mutable = false) {
	documentation = "Tracking state at a given absolute time (describes predicted HMD pose etc). Returned by OVR#ovr_GetTrackingState()."
	includeOVRCAPI()

	/// Predicted head pose (and derivatives) at the requested absolute time.
	/// The look-ahead interval is equal to (HeadPose.TimeInSeconds - RawSensorData.TimeInSeconds).
	ovrPoseStatef.member("HeadPose")

	/// Current pose of the external camera (if present).
	/// This pose includes camera tilt (roll and pitch). For a leveled coordinate
	/// system use LeveledCameraPose.
	ovrPosef.member("CameraPose")

	/// Camera frame aligned with gravity.
	/// This value includes position and yaw of the camera, but not roll and pitch.
	/// It can be used as a reference point to render real-world objects in the correct location.
	ovrPosef.member("LeveledCameraPose")

	/// The most recent calculated pose for each hand when hand controller tracking is present.
	/// HandPoses[ovrHand_Left] refers to the left hand and HandPoses[ovrHand_Right] to the right hand.
	/// These values can be combined with ovrInputState for complete hand controller information.
	ovrPoseStatef.member("HandPoses", size = 2)

	ovrSensorData.member("RawSensorData") /// The most recent sensor data received from the HMD.
	unsigned_int.member("StatusFlags") /// Tracking status described by ovrStatusBits.

	/// Hand status flags described by ovrStatusBits.
    /// Only ovrStatus_OrientationTracked and ovrStatus_PositionTracked are reported.
    unsigned_int.member("HandStatusFlags", size = 2)

	uint32_t.member("LastCameraFrameCounter") /// Tag the vision processing results to a certain frame counter number.
}.nativeType
val ovrTrackingState_p = ovrTrackingState.p

val ovrEyeRenderDesc = struct(OVR_PACKAGE, "OVREyeRenderDesc", structName = "ovrEyeRenderDesc", mutable = false) {
	documentation =
		"""
		Rendering information for each eye. Computed by either OVR#ovr_GetRenderDesc() based on the specified FOV. Note that the rendering viewport is not
		included here as it can be specified separately and modified per frame by passing different viewport values in the layer structure.
		"""
	includeOVRCAPI()

	ovrEyeType.member("Eye") ///< The eye index this instance corresponds to.
	ovrFovPort.member("Fov") ///< The field of view.
	ovrRecti.member("DistortedViewport") ///< Distortion viewport.
	ovrVector2f.member("PixelsPerTanAngleAtCenter") ///< How many display pixels will fit in tan(angle) = 1.
	ovrVector3f.member("HmdToEyeViewOffset") ///< Translation to be applied to view matrix for each eye offset.
}.nativeType

val ovrTimewarpProjectionDesc = struct(OVR_PACKAGE, "OVRTimewarpProjectionDesc", structName = "ovrTimewarpProjectionDesc") {
	documentation =
		"""
		Projection information for ##OVRLayerEyeFovDepth.

		Use the utility function OVRUtil#ovrTimewarpProjectionDesc_FromProjection() to generate this structure from the application's projection matrix.
		"""
	includeOVRCAPI()

	float.member("Projection22") ///< Projection matrix element [2][2].
	float.member("Projection23") ///< Projection matrix element [2][3].
	float.member("Projection32") ///< Projection matrix element [3][2].
}.nativeType

val ovrViewScaleDesc_p = struct_p(OVR_PACKAGE, "OVRViewScaleDesc", structName = "ovrViewScaleDesc") {
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
	includeOVRCAPI()

	ovrVector3f.member("HmdToEyeViewOffset", size = ovrEye_Count) ///< Translation of each eye.
	float.member("HmdSpaceToWorldScaleInMeters") ///< Ratio of viewer units to meter units.
}

val ovrTextureHeader = struct(OVR_PACKAGE, "OVRTextureHeader", structName = "ovrTextureHeader") {
	documentation = "API-independent part of a texture descriptor."
	includeOVRCAPI()

	ovrRenderAPIType.member("API") // The graphics API in use.
	ovrSizei.member("TextureSize") // The size of the texture.
}.nativeType

val ovrTexture = struct(OVR_PACKAGE, "OVRTexture", structName = "ovrTexture") {
	documentation = "Contains platform-specific information about a texture. Aliases to one of ovrD3D11Texture or ##OVRGLTexture."
	includeOVRCAPI()

	ovrTextureHeader.member("Header") // API-independent header.
	uintptr_t.member("PlatformData", size = 8) // Specialized in ovrGLTextureData, ovrD3D11TextureData etc.
}.nativeType
val ovrTexture_p = ovrTexture.p
val ovrTexture_pp = ovrTexture_p.p

val ovrSwapTextureSet = struct(OVR_PACKAGE, "OVRSwapTextureSet", structName = "ovrSwapTextureSet") {
	documentation =
		"""
		Describes a set of textures that act as a rendered flip chain.

		An ovrSwapTextureSet per layer is passed to OVR#ovr_SubmitFrame() via one of the ovrLayer types. The {@code TextureCount} refers to the flip chain
		count and not an eye count. See the layer structs and functions for information about how to use ovrSwapTextureSet.

		ovrSwapTextureSets must be created by either the ovr_CreateSwapTextureSetD3D11 or OVRGL#ovr_CreateSwapTextureSetGL() factory function, and must
		be destroyed by OVR#ovr_DestroySwapTextureSet().
		"""
	includeOVRCAPI()

	ovrTexture_p.member("Textures") ///< Points to an array of ovrTextures.
	int.member("TextureCount") ///< The number of textures referenced by the Textures array.

	/// CurrentIndex specifies which of the Textures will be used by the ovr_SubmitFrame call.
	/// This is manually incremented by the application, typically in a round-robin manner.
	///
	/// Before selecting a Texture as a rendertarget, the application should increment CurrentIndex by
	/// 1 and wrap it back to 0 if CurrentIndex == TextureCount, so that it gets a fresh rendertarget,
	/// one that is not currently being used for display. It can then render to Textures[CurrentIndex].
	///
	/// After rendering, the application calls ovr_SubmitFrame using that same CurrentIndex value
	/// to display the new rendertarget.
	///
	/// The application can submit multiple frames with the same ovrSwapTextureSet and CurrentIndex
	/// value if the rendertarget does not need to be updated, for example when displaying an
	/// information display whose text has not changed since the previous frame.
	///
	/// Multiple layers can use the same ovrSwapTextureSet at the same time - there is no need to
	/// create a unique ovrSwapTextureSet for each layer. However, all the layers using a particular
	/// ovrSwapTextureSet will share the same value of CurrentIndex, so they cannot use different
	/// textures within the ovrSwapTextureSet.
	///
	/// Once a particular Textures[CurrentIndex] has been sent to ovr_SubmitFrame, that texture
	/// should not be rendered to until a subsequent ovr_SubmitFrame is made (either with a
	/// different CurrentIndex value, or with a different ovrSwapTextureSet, or disabling the layer).
	int.member("CurrentIndex")
}.nativeType
val ovrSwapTextureSet_p = ovrSwapTextureSet.p
val ovrSwapTextureSet_pp = ovrSwapTextureSet_p.p

val ovrInputState_p = struct_p(OVR_PACKAGE, "OVRInputState", structName = "ovrInputState") {
	documentation =
		"""
		Describes the complete controller input state, including Oculus Touch, and XBox gamepad. If multiple inputs are connected and used at the same time,
		their inputs are combined.
		"""
	includeOVRCAPI()

	// System type when the controller state was last updated.
	double.member("TimeInSeconds")

	// Described by ovrControllerType. Indicates which ControllerTypes are present.
	unsigned_int.member("ConnectedControllerTypes")

	// Values for buttons described by ovrButton.
	unsigned_int.member("Buttons")

	// Touch values for buttons and sensors as described by ovrTouch.
	unsigned_int.member("Touches")

	// Left and right finger trigger values (ovrHand_Left and ovrHand_Right), in the range 0.0 to 1.0f.
	float.member("IndexTrigger", size = 2)

	// Left and right hand trigger values (ovrHand_Left and ovrHand_Right), in the range 0.0 to 1.0f.
	float.member("HandTrigger", size = 2)

	// Horizontal and vertical thumbstick axis values (ovrHand_Left and ovrHand_Right), in the range -1.0f to 1.0f.
	ovrVector2f.member("Thumbstick", size = 2)
}

val ovrLayerHeader = struct(OVR_PACKAGE, "OVRLayerHeader", structName = "ovrLayerHeader") {
	documentation = "Defines properties shared by all ovrLayer structs, such as ##OVRLayerEyeFov."
	includeOVRCAPI()

	ovrLayerType.member("Type") ///< Described by ovrLayerType.
	unsigned_int.member("Flags") ///< Described by ovrLayerFlags.
}.nativeType
val ovrLayerHeader_p = ovrLayerHeader.p
val ovrLayerHeader_p_const_p = ovrLayerHeader_p.const_p

val ovrLayerEyeFov = struct(OVR_PACKAGE, "OVRLayerEyeFov", structName = "ovrLayerEyeFov") {
	documentation =
		"""
		Describes a layer that specifies a monoscopic or stereoscopic view. This is the kind of layer that's typically used as layer 0 to
		OVR#ovr_SubmitFrame(), as it is the kind of layer used to render a 3D stereoscopic view.
		"""
	includeOVRCAPI()

	/// Header.Type must be ovrLayerType_EyeFov.
	ovrLayerHeader.member("Header")

	/// ovrSwapTextureSets for the left and right eye respectively.
	/// The second one of which can be NULL for cases described above.
	ovrSwapTextureSet_p.member("ColorTexture", size = ovrEye_Count)

	/// Specifies the ColorTexture sub-rect UV coordinates.
	/// Both Viewport[0] and Viewport[1] must be valid.
	ovrRecti.member("Viewport", size = ovrEye_Count)

	/// The viewport field of view.
	ovrFovPort.member("Fov", size = ovrEye_Count)

	/// Specifies the position and orientation of each eye view, with the position specified in meters.
	/// RenderPose will typically be the value returned from ovr_CalcEyePoses,
	/// but can be different in special cases if a different head pose is used for rendering.
	ovrPosef.member("RenderPose", size = ovrEye_Count)

	/// Specifies the timestamp when the source ovrPosef (used in calculating RenderPose)
    /// was sampled from the SDK. Typically retrieved by calling ovr_GetTimeInSeconds
    /// around the instant the application calls ovr_GetTrackingState
    /// The main purpose for this is to accurately track app tracking latency.
    double.member("SensorSampleTime")
}.nativeType

val ovrLayerEyeFovDepth = struct(OVR_PACKAGE, "OVRLayerEyeFovDepth", structName = "ovrLayerEyeFovDepth") {
	documentation =
		"""
		Describes a layer that specifies a monoscopic or stereoscopic view, with depth textures in addition to color textures. This is typically used to
		support positional time warp. This struct is the same as ##OVRLayerEyeFov, but with the addition of {@code DepthTexture} and {@code ProjectionDesc}.
		"""
	includeOVRCAPI()

	/// Header.Type must be ovrLayerType_EyeFovDepth.
	ovrLayerHeader.member("Header")

	/// ovrSwapTextureSets for the left and right eye respectively.
	/// The second one of which can be NULL for cases described above.
	ovrSwapTextureSet_p.member("ColorTexture", size = ovrEye_Count)

	/// Specifies the ColorTexture sub-rect UV coordinates.
	/// Both Viewport[0] and Viewport[1] must be valid.
	ovrRecti.member("Viewport", size = ovrEye_Count)

	/// The viewport field of view.
	ovrFovPort.member("Fov", size = ovrEye_Count)

	/// Specifies the position and orientation of each eye view, with the position specified in meters.
	/// RenderPose will typically be the value returned from ovr_CalcEyePoses,
	/// but can be different in special cases if a different head pose is used for rendering.
	ovrPosef.member("RenderPose", size = ovrEye_Count)

    /// Specifies the timestamp when the source ovrPosef (used in calculating RenderPose)
    /// was sampled from the SDK. Typically retrieved by calling ovr_GetTimeInSeconds
    /// around the instant the application calls ovr_GetTrackingState
    /// The main purpose for this is to accurately track app tracking latency.
    double.member("SensorSampleTime")

	/// Depth texture for positional timewarp.
	/// Must map 1:1 to the ColorTexture.
	ovrSwapTextureSet_p.member("DepthTexture", size = ovrEye_Count)

	/// Specifies how to convert DepthTexture information into meters.
	/// \see ovrTimewarpProjectionDesc_FromProjection
	ovrTimewarpProjectionDesc.member("ProjectionDesc")
}.nativeType

val ovrLayerEyeMatrix = struct(OVR_PACKAGE, "OVRLayerEyeMatrix", structName = "ovrLayerEyeMatrix") {
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
	includeOVRCAPI()

	/// Header.Type must be ovrLayerType_EyeMatrix.
    ovrLayerHeader.member("Header")

    /// ovrSwapTextureSets for the left and right eye respectively.
    /// The second one of which can be NULL for cases described above.
    ovrSwapTextureSet_p.member("ColorTexture", size = ovrEye_Count)

    /// Specifies the ColorTexture sub-rect UV coordinates.
    /// Both Viewport[0] and Viewport[1] must be valid.
    ovrRecti.member("Viewport", size = ovrEye_Count)

    /// Specifies the position and orientation of each eye view, with the position specified in meters.
    /// RenderPose will typically be the value returned from ovr_CalcEyePoses,
    /// but can be different in special cases if a different head pose is used for rendering.
    ovrPosef.member("RenderPose", size = ovrEye_Count)

    /// Specifies the mapping from a view-space vector
    /// to a UV coordinate on the textures given above.
    /// P = (x,y,z,1)*Matrix
    /// TexU  = P.x/P.z
    /// TexV  = P.y/P.z
    ovrMatrix4f.member("Matrix", size = ovrEye_Count)

    /// Specifies the timestamp when the source ovrPosef (used in calculating RenderPose)
    /// was sampled from the SDK. Typically retrieved by calling ovr_GetTimeInSeconds
    /// around the instant the application calls ovr_GetTrackingState
    /// The main purpose for this is to accurately track app tracking latency.
    double.member("SensorSampleTime")
}.nativeType

val ovrLayerQuad = struct(OVR_PACKAGE, "OVRLayerQuad", structName = "ovrLayerQuad") {
	documentation =
		"""
		Describes a layer of Quad type, which is a single quad in world or viewer space. It is used for both OVR#ovrLayerType_Quad. This type of layer
		represents a single object placed in the world and not a stereo view of the world itself.

		A typical use of OVR#ovrLayerType_Quad is to draw a television screen in a room that for some reason is more convenient to draw as a layer than
		as part of the main view in layer 0. For example, it could implement a 3D popup GUI that is drawn at a higher resolution than layer 0 to improve
		fidelity of the GUI.

		Quad layers are visible from both sides; they are not back-face culled.
		"""
	includeOVRCAPI()

	/// Header.Type must be ovrLayerType_Quad.
	ovrLayerHeader.member("Header")

	/// Contains a single image, never with any stereo view.
	ovrSwapTextureSet_p.member("ColorTexture")

	/// Specifies the ColorTexture sub-rect UV coordinates.
	ovrRecti.member("Viewport")

	/// Position and orientation of the center of the quad. Position is specified in meters.
	ovrPosef.member("QuadPoseCenter")

	/// Width and height (respectively) of the quad in meters.
	ovrVector2f.member("QuadSize")
}.nativeType

val ovrLayerDirect = struct(OVR_PACKAGE, "OVRLayerDirect", structName = "ovrLayerDirect") {
	documentation =
		"""
		Describes a layer which is copied to the HMD as-is. Neither distortion, time warp, nor vignetting is applied to {@code ColorTexture} before it's copied
		to the HMD. The application can, however implement these kinds of effects itself before submitting the layer. This layer can be used for
		application-based distortion rendering and can also be used for implementing a debug HUD that's viewed on the mirror texture.
		"""
	includeOVRCAPI()

	/// Header.Type must be ovrLayerType_EyeDirect.
	ovrLayerHeader.member("Header")

	/// ovrSwapTextureSets for the left and right eye respectively.
	/// The second one of which can be NULL for cases described above.
	ovrSwapTextureSet_p.member("ColorTexture", size = ovrEye_Count)

	/// Specifies the ColorTexture sub-rect UV coordinates.
	/// Both Viewport[0] and Viewport[1] must be valid.
	ovrRecti.member("Viewport", size = ovrEye_Count)
}.nativeType

// OVR_CAPI_GL.h

val ovrGLTextureData = struct(OVR_PACKAGE, "OVRGLTextureData", structName = "ovrGLTextureData") {
	documentation = "OpenGL texture data."
	includeOVRCAPI_GL()

	ovrTextureHeader.member("Header") /// General device settings.
	GLuint.member("TexId") /// The OpenGL name for this texture.
}.nativeType

// OVR_CAPI_Util.h

val ovrDetectResult = struct(OVR_PACKAGE, "OVRDetectResult", structName = "ovrDetectResult", mutable = false) {
	documentation = "Return values for OVRUtil##ovr_Detect()"
	includeOVRCAPI()

	/// Is ovrFalse when the Oculus Service is not running.
	///   This means that the Oculus Service is either uninstalled or stopped.
	///   IsOculusHMDConnected will be ovrFalse in this case.
	/// Is ovrTrue when the Oculus Service is running.
	///   This means that the Oculus Service is installed and running.
	///   IsOculusHMDConnected will reflect the state of the HMD.
	ovrBool.member("IsOculusServiceRunning")
	/// Is ovrFalse when an Oculus HMD is not detected.
	///   If the Oculus Service is not running, this will be ovrFalse.
	/// Is ovrTrue when an Oculus HMD is detected.
	///   This implies that the Oculus Service is also installed and running.
	ovrBool.member("IsOculusHMDConnected")
}.nativeType

fun config() {
	packageInfo(
		OVR_PACKAGE,
		"""
		Contains bindings to LibOVR, the <a href="https://developer.oculus.com/">Oculus SDK</a> library.

		Documentation on how to get started with the Oculus SDK can be found <a href="https://developer.oculus.com/documentation/">here</a>.
		"""
	)

	struct(OVR_PACKAGE, "OVRLayerUnion", structName = "ovrLayer_Union") {
		documentation = "Union that combines ovrLayer types in a way that allows them to be used in a polymorphic way."
		includeOVRCAPI()

		ovrLayerHeader.member("Header")
		ovrLayerEyeFov.member("EyeFov")
		ovrLayerEyeFovDepth.member("EyeFovDepth")
		ovrLayerQuad.member("Quad")
		ovrLayerDirect.member("Direct")
	}

	// OVR_CAPI_GL.h

	struct(OVR_PACKAGE, "OVRGLTexture", structName = "ovrGLTexture") {
		documentation = "Contains OpenGL-specific texture information."
		includeOVRCAPI_GL()

		ovrTexture.member("Texture") /// General device settings.
		ovrGLTextureData.member("OGL") /// OpenGL-specific settings.
	}
}