/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr

import org.lwjgl.generator.*
import org.lwjgl.opengl.GLuint
import org.lwjgl.system.linux.Display_p
import org.lwjgl.system.windows.HDC
import org.lwjgl.system.windows.HWND

// We include the OVR headers from the Oculus SDK directly, so handle warnings on use-site
private fun GeneratorTargetNative.includeOVRCAPI() = nativeDirective(
	"""DISABLE_WARNINGS()
#include "OVR_CAPI_0_6_0.h"
ENABLE_WARNINGS()""")

private fun GeneratorTargetNative.includeOVRCAPI_GL() = nativeDirective(
	"""DISABLE_WARNINGS()
#include "OVR_CAPI_GL.h"
ENABLE_WARNINGS()""")

val OVR_PACKAGE = "org.lwjgl.ovr"

//val ovrBool = NativeType("ovrBool", TypeMapping.BOOLEAN)
val ovrBool = IntegerType("ovrBool", PrimitiveMapping.BOOLEAN)
val ovrResult = IntegerType("ovrResult", PrimitiveMapping.INT)

val ovrHmdType = typedef(int, "ovrHmdType")
val ovrEyeType = typedef(int, "ovrEyeType")
val ovrRenderAPIType = typedef(int, "ovrRenderAPIType")
val ovrLayerType = typedef(int, "ovrLayerType")

val ovrEye_Count = 2

val ovrLogCallback = CallbackType(callback(
	OVR_PACKAGE, void, "OVRLogCallback",
	"The logging callback.",
	int.IN("level", "one of the ovrLogLevel constants"),
	const _ charUTF8_p.IN("message", "a UTF8-encoded null-terminated string"),
	samConstructor = "OVR"
) {
	documentation = "Instances of this interface may be passed to the {@code LogCallback} member of the ##OVRInitFlags struct."
}, "ovrLogCallback")

val ovrErrorInfo = struct(OVR_PACKAGE, "OVRErrorInfo", structName = "ovrErrorInfo") {
	documentation = "Provides information about the last error."
	includeOVRCAPI()

	ovrResult.member("Result") ///< The result from the last API call that generated an error ovrResult.
	char.member("ErrorString", size = 512) ///< A UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions.
}.nativeType
val ovrErrorInfo_p = StructType(ovrErrorInfo)

val ovrInitParams = struct(OVR_PACKAGE, "OVRInitParams", structName = "ovrInitParams") {
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

	/// Number of milliseconds to wait for a connection to the server.
	/// Pass 0 for the default timeout.
	uint32_t.member("ConnectionTimeoutMS") ///< Timeout in Milliseconds or 0
}.nativeType
val ovrInitParams_p = StructType(ovrInitParams)

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
val ovrVector3f_p = StructType(ovrVector3f)

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
val ovrPosef_p = StructType(ovrPosef)

val ovrPoseStatef = struct(OVR_PACKAGE, "OVRPoseStatef", structName = "ovrPoseStatef") {
	documentation = "A full pose (rigid body) configuration with first and second derivatives."
	includeOVRCAPI()

	ovrPosef.member("ThePose") ///< The body's position and orientation.
	ovrVector3f.member("AngularVelocity") ///< The body's angular velocity in radians per second.
	ovrVector3f.member("LinearVelocity") ///< The body's velocity in meters per second.
	ovrVector3f.member("AngularAcceleration") ///< The body's angular acceleration in radians per second per second.
	ovrVector3f.member("LinearAcceleration") ///< The body's acceleration in meters per second per second.
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

val ovrHmd = PointerType("ovrHmd", includesPointer = true) // const ovrHmdDesc *
val ovrHmd_p = PointerType(ovrHmd)

val ovrSensorData = struct(OVR_PACKAGE, "OVRSensorData", structName = "ovrSensorData") {
	documentation = "Specifies a reading we can query from the sensor."
	includeOVRCAPI()

	ovrVector3f.member("Accelerometer") /// Acceleration reading in m/s^2.
	ovrVector3f.member("Gyro") /// Rotation rate in rad/s.
	ovrVector3f.member("Magnetometer") /// Magnetic field in Gauss.
	float.member("Temperature") /// Temperature of the sensor in degrees Celsius.
	float.member("TimeInSeconds") /// Time when the reported IMU reading took place, in seconds.
}.nativeType

val ovrTrackingState = struct(OVR_PACKAGE, "OVRTrackingState", structName = "ovrTrackingState") {
	documentation = "Tracking state at a given absolute time (describes predicted HMD pose etc). Returned by OVR#ovrHmd_GetTrackingState()."
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
	ovrSensorData.member("RawSensorData") /// The most recent sensor data received from the HMD.
	unsigned_int.member("StatusFlags") /// Tracking status described by ovrStatusBits.

	uint32_t.member("LastCameraFrameCounter") /// Tag the vision processing results to a certain frame counter number.
}.nativeType
val ovrTrackingState_p = StructType(ovrTrackingState)

val ovrFrameTiming = struct(OVR_PACKAGE, "OVRFrameTiming", structName = "ovrFrameTiming") {
	documentation = "Frame timing data reported by OVR#ovrHmd_GetFrameTiming()."
	includeOVRCAPI()

    /// A point in time when the middle of the screen will be displayed. For global shutter,
    /// this will be the display time. For rolling shutter this is a point at which half the image has
    /// been displayed. This value can be passed as an absolute time to ovrHmd_GetTrackingState
    /// to get the best predicted pose for rendering the scene.
    double.member("DisplayMidpointSeconds")

    /// Display interval between the frames. This will generally be 1 / RefreshRate of the HMD;
    /// however, it may vary slightly during runtime based on video cart scan-out timing.
    double.member("FrameIntervalSeconds")

    /// Application frame index for which we requested timing.
    double.member("AppFrameIndex")

    /// HW display frame index that we expect this application frame will hit; this is the frame that
    /// will be displayed at DisplayMidpointSeconds. This value is monotonically increasing with each v-sync.
    double.member("DisplayFrameIndex")
}.nativeType

val ovrEyeRenderDesc = struct(OVR_PACKAGE, "OVREyeRenderDesc", structName = "ovrEyeRenderDesc") {
	documentation =
		"""
		Rendering information for each eye. Computed by either OVR#ovrHmd_GetRenderDesc() based on the specified FOV. Note that the rendering viewport is not
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
		Projection information for OVR#ovrLayerEyeFovDepth().

		Use the utility function OVR#ovrTimewarpProjectionDesc_FromProjection() to generate this structure from the application's projection matrix.
		"""
	includeOVRCAPI()

	float.member("Projection22") ///< Projection matrix element [2][2].
	float.member("Projection23") ///< Projection matrix element [2][3].
	float.member("Projection32") ///< Projection matrix element [3][2].
}.nativeType

val ovrViewScaleDesc = struct(OVR_PACKAGE, "OVRViewScaleDesc", structName = "ovrViewScaleDesc") {
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
}.nativeType
val ovrViewScaleDesc_p = StructType(ovrViewScaleDesc)

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
val ovrTexture_p = StructType(ovrTexture)
val ovrTexture_pp = PointerType(ovrTexture_p)

val ovrSwapTextureSet = struct(OVR_PACKAGE, "OVRSwapTextureSet", structName = "ovrSwapTextureSet") {
	documentation =
		"""
		Describes a set of textures that act as a rendered flip chain.

		An ovrSwapTextureSet per layer is passed to OVR#ovrHmd_SubmitFrame() via one of the ovrLayer types. The {@code TextureCount} refers to the flip chain
		count and not an eye count. See the layer structs and functions for information about how to use ovrSwapTextureSet.

		ovrSwapTextureSets must be created by either the ovrHmd_CreateSwapTextureSetD3D11 or OVR#ovrHmd_CreateSwapTextureSetGL() factory function, and must be
		destroyed by OVR#ovrHmd_DestroySwapTextureSet().
		"""
	includeOVRCAPI()

	ovrTexture_p.member("Textures") ///< Points to an array of ovrTextures.
	int.member("TextureCount") ///< The number of textures referenced by the Textures array.

	/// CurrentIndex specifies which of the Textures will be used by the ovrHmd_SubmitFrame call.
	/// This is manually incremented by the application, typically in a round-robin manner.
	///
	/// Before selecting a Texture as a rendertarget, the application should increment CurrentIndex by
	/// 1 and wrap it back to 0 if CurrentIndex == TextureCount, so that it gets a fresh rendertarget,
	/// one that is not currently being used for display. It can then render to Textures[CurrentIndex].
	///
	/// After rendering, the application calls ovrHmd_SubmitFrame using that same CurrentIndex value
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
	/// Once a particular Textures[CurrentIndex] has been sent to ovrHmd_SubmitFrame, that texture
	/// should not be rendered to until a subsequent ovrHmd_SubmitFrame is made (either with a
	/// different CurrentIndex value, or with a different ovrSwapTextureSet, or disabling the layer).
	int.member("CurrentIndex")
}.nativeType
val ovrSwapTextureSet_p = StructType(ovrSwapTextureSet)
val ovrSwapTextureSet_pp = PointerType(ovrSwapTextureSet_p)

val ovrLayerHeader = struct(OVR_PACKAGE, "OVRLayerHeader", structName = "ovrLayerHeader") {
	documentation = "Defines properties shared by all ovrLayer structs, such as ##OVRLayerEyeFov."
	includeOVRCAPI()

	ovrLayerType.member("Type") ///< Described by ovrLayerType.
	unsigned_int.member("Flags") ///< Described by ovrLayerFlags.
}.nativeType
val ovrLayerHeader_p = StructType(ovrLayerHeader)
val ovrLayerHeader_p_const_p = PointerType(
	"ovrLayerHeader * const *",
	mapping = PointerMapping.DATA_POINTER,
	includesPointer = true,
	elementType = ovrLayerHeader_p
)

val ovrLayerEyeFov = struct(OVR_PACKAGE, "OVRLayerEyeFov", structName = "ovrLayerEyeFov") {
	documentation =
		"""
		Describes a layer that specifies a monoscopic or stereoscopic view. This is the kind of layer that's typically used as layer 0 to
		OVR#ovrHmd_SubmitFrame(), as it is the kind of layer used to render a 3D stereoscopic view.
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

	/// Depth texture for positional timewarp.
	/// Must map 1:1 to the ColorTexture.
	ovrSwapTextureSet_p.member("DepthTexture", size = ovrEye_Count)

	/// Specifies how to convert DepthTexture information into meters.
	/// \see ovrTimewarpProjectionDesc_FromProjection
	ovrTimewarpProjectionDesc.member("ProjectionDesc")
}.nativeType

val ovrLayerQuad = struct(OVR_PACKAGE, "OVRLayerQuad", structName = "ovrLayerQuad") {
	documentation =
		"""
		Describes a layer of Quad type, which is a single quad in world or viewer space. It is used for both OVR#ovrLayerType_QuadInWorld and
		OVR#ovrLayerType_QuadHeadLocked. This type of layer represents a single object placed in the world and not a stereo view of the world itself.

		A typical use of OVR#ovrLayerType_QuadInWorld is to draw a television screen in a room that for some reason is more convenient to draw as a layer than
		as part of the main view in layer 0. For example, it could implement a 3D popup GUI that is drawn at a higher resolution than layer 0 to improve
		fidelity of the GUI.

		A use of OVR#ovrLayerType_QuadHeadLocked might be to implement a debug HUD visible in the HMD.

		Quad layers are visible from both sides; they are not back-face culled.
		"""
	includeOVRCAPI()

	/// Header.Type must be ovrLayerType_QuadInWorld or ovrLayerType_QuadHeadLocked.
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

val ovrGLTextureData = 	struct(OVR_PACKAGE, "OVRGLTextureData", structName = "ovrGLTextureData") {
	documentation = "Used to pass GL eye texture data to OVR#ovrHmd_EndFrame()."
	includeOVRCAPI_GL()

	ovrTextureHeader.member("Header") /// General device settings.
	GLuint.member("TexId") /// The OpenGL name for this texture.
}.nativeType

fun config() {
	struct(OVR_PACKAGE, "OVRHmdDesc", structName = "ovrHmdDesc") {
		documentation = "A complete descriptor of the HMD."
		includeOVRCAPI()

		ovrHmdType.member("Type") // This HMD's type.
		/*const*/ charUTF8_p.member("ProductName") // Name string describing the product: "Oculus Rift DK1", etc.
		/*const*/ charUTF8_p.member("Manufacturer") // String describing the manufacturer. Usually "Oculus".
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

		unsigned_int.member("HmdCaps") // Capability bits described by ovrHmdCaps.
		unsigned_int.member("TrackingCaps") // Capability bits described by ovrTrackingCaps.

		ovrFovPort.member("DefaultEyeFov", size = ovrEye_Count) // The recommended optical FOV for the HMD.
		ovrFovPort.member("MaxEyeFov", size = ovrEye_Count) // The maximum optical FOV for the HMD.

		/// Preferred eye rendering order for best performance.
		/// Can help reduce latency on sideways-scanned screens.
		ovrEyeType.member("EyeRenderOrder", size = ovrEye_Count)

		ovrSizei.member("Resolution") // Resolution of the full HMD screen (both eyes) in pixels.
	}

	struct(OVR_PACKAGE, "OVRLayer_Union", structName = "ovrLayer_Union") {
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