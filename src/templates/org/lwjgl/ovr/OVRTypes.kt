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
#include "OVR_CAPI_0_5_0.h"
ENABLE_WARNINGS()""")

private fun GeneratorTargetNative.includeOVRCAPI_GL() = nativeDirective(
	"""DISABLE_WARNINGS()
#include "OVR_CAPI_GL.h"
ENABLE_WARNINGS()""")

val OVR_PACKAGE = "org.lwjgl.ovr"

//val ovrBool = NativeType("ovrBool", TypeMapping.BOOLEAN)
val ovrBool = IntegerType("ovrBool", PrimitiveMapping.BOOLEAN)

val ovrHmdType = typedef(int, "ovrHmdType")
val ovrEyeType = typedef(int, "ovrEyeType")
val ovrRenderAPIType = typedef(int, "ovrRenderAPIType")

val ovrLogCallback = CallbackType(callback(
	OVR_PACKAGE, void, "OVRLogCallback",
	"The logging callback.",
	int.IN("level", "one of the ovrLogLevel constants"),
	const _ charASCII_p.IN("message", "the log message"),
	samConstructor = "OVR"
) {
	documentation = "Instances of this interface may be passed to the {@code LogCallback} member of the ##OVRInitFlags struct."
}, "ovrLogCallback")

val ovrInitParams = struct(OVR_PACKAGE, "OVRInitParams", structName = "ovrInitParams") {
	documentation = "A complete descriptor of the HMD."
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
}
val ovrInitParams_const_p = StructType(
	name = "ovrInitParams const *",
	includesPointer = true,
	definition = ovrInitParams.nativeType.definition
)

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
val ovrRecti_p = StructType(ovrRecti)

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
val ovrVector2f_p = StructType(ovrVector2f)

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
val ovrMatrix4f_p = StructType(ovrMatrix4f)

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
val ovrFovPort_p = StructType(ovrFovPort)

val ovrHmdDesc = struct(OVR_PACKAGE, "OVRHmdDesc", structName = "ovrHmdDesc") {
	documentation = "A complete descriptor of the HMD."
	includeOVRCAPI()

	ovrHmdType.member("Type") // This HMD's type.
	/*const*/ charASCII_p.member("ProductName") // Name string describing the product: "Oculus Rift DK1", etc.
	/*const*/ charASCII_p.member("Manufacturer") // String describing the manufacturer. Usually "Oculus".
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
	unsigned_int.member("DistortionCaps") // Capability bits described by ovrDistortionCaps.

	ovrFovPort.member("DefaultEyeFov", size = 2) // The recommended optical FOV for the HMD.
	ovrFovPort.member("MaxEyeFov", size = 2) // The maximum optical FOV for the HMD.

	/// Preferred eye rendering order for best performance.
	/// Can help reduce latency on sideways-scanned screens.
	ovrEyeType.member("EyeRenderOrder", size = 2)

	ovrSizei.member("Resolution") // Resolution of the full HMD screen (both eyes) in pixels.
	ovrVector2i.member("WindowsPos") // Location of the application window on the desktop (or 0,0).

	/// Display that the HMD should present on.
	/// TBD: It may be good to remove this information relying on WindowPos instead.
	/// Ultimately, we may need to come up with a more convenient alternative,
	/// such as API-specific functions that return adapter, or something that will
	/// work with our monitor driver.
	/// Windows: (e.g. "\\\\.\\DISPLAY3", can be used in EnumDisplaySettings/CreateDC).
	/*const*/ charASCII_p.member("DisplayDeviceName")

	int.member("DisplayId") // MacOS
}.nativeType
val ovrHmd = PointerType("ovrHmd", includesPointer = true) // const ovrHmdDesc *

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
	documentation = "Tracking state at a given absolute time (describes predicted HMD pose etc)."
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
	documentation = "Frame timing data reported by ovrHmd_BeginFrameTiming() or ovrHmd_BeginFrame()."
	includeOVRCAPI()

	/// The amount of time that has passed since the previous frame's
	/// ThisFrameSeconds value (usable for movement scaling).
	/// This will be clamped to no more than 0.1 seconds to prevent
	/// excessive movement after pauses due to loading or initialization.
	float.member("DeltaSeconds")

	/// It is generally expected that the following holds:
	/// ThisFrameSeconds < TimewarpPointSeconds < NextFrameSeconds <
	/// EyeScanoutSeconds[EyeOrder[0]] <= ScanoutMidpointSeconds <= EyeScanoutSeconds[EyeOrder[1]].

	/// Absolute time value when rendering of this frame began or is expected to
	/// begin. Generally equal to NextFrameSeconds of the previous frame. Can be used
	/// for animation timing.
	double.member("ThisFrameSeconds")
	/// Absolute point when IMU expects to be sampled for this frame.
	double.member("TimewarpPointSeconds")
	/// Absolute time when frame Present followed by GPU Flush will finish and the next frame begins.
	double.member("NextFrameSeconds")

	/// Time when half of the screen will be scanned out. Can be passed as an absolute time
	/// to ovrHmd_GetTrackingState() to get the predicted general orientation.
	double.member("ScanoutMidpointSeconds")
	/// Timing points when each eye will be scanned out to display. Used when rendering each eye.
	double.member("EyeScanoutSeconds", size = 2)
}.nativeType

val ovrEyeRenderDesc = struct(OVR_PACKAGE, "OVREyeRenderDesc", structName = "ovrEyeRenderDesc") {
	documentation =
		"""
		Rendering information for each eye. Computed by either ovrHmd_ConfigureRendering() or ovrHmd_GetRenderDesc() based on the specified FOV. Note that the
		rendering viewport is not included here as it can be specified separately and modified per frame through:
		${ul(
			"(a) ovrHmd_GetRenderScaleAndOffset in the case of client rendered distortion or",
			"(b) passing different values via ovrTexture in the case of SDK rendered distortion."
		)}
		"""
	includeOVRCAPI()

	ovrEyeType.member("Eye") ///< The eye index this instance corresponds to.
	ovrFovPort.member("Fov") ///< The field of view.
	ovrRecti.member("DistortedViewport") ///< Distortion viewport.
	ovrVector2f.member("PixelsPerTanAngleAtCenter") ///< How many display pixels will fit in tan(angle) = 1.
	ovrVector3f.member("HmdToEyeViewOffset") ///< Translation to be applied to view matrix for each eye offset.
}.nativeType
val ovrEyeRenderDesc_p = StructType(ovrEyeRenderDesc)

val ovrPositionTimewarpDesc = struct(OVR_PACKAGE, "OVRPositionTimewarpDesc", structName = "ovrPositionTimewarpDesc") {
	documentation =
		"""
		Rendering information for positional TimeWarp. Contains the data necessary to properly calculate position info for timewarp matrices and also interpret
		depth info provided via the depth buffer to the timewarp shader.
		"""
	includeOVRCAPI()

	ovrVector3f.member("HmdToEyeViewOffset", size = 2) /// The same offset value pair provided in ovrEyeRenderDesc.
	float.member("NearClip") /// The near clip distance used in the projection matrix.
	float.member("FarClip") /// The far clip distance used in the projection matrix utilized when rendering the eye depth textures provided in ovrHmd_EndFrame
}.nativeType
val ovrPositionTimewarpDesc_p = StructType(ovrPositionTimewarpDesc)

val ovrRenderAPIConfigHeader = struct(OVR_PACKAGE, "OVRRenderAPIConfigHeader", structName = "ovrRenderAPIConfigHeader") {
	documentation = "Platform-independent part of rendering API-configuration data. It is a part of ovrRenderAPIConfig, passed to ovrHmd_Configure."
	includeOVRCAPI()

	ovrRenderAPIType.member("API") // The graphics API in use.
	ovrSizei.member("BackBufferSize")
	int.member("Multisample") // The number of samples per pixel.
}.nativeType

val ovrRenderAPIConfig = struct(OVR_PACKAGE, "OVRRenderAPIConfig", structName = "ovrRenderAPIConfig") {
	documentation = "Contains platform-specific information for rendering."
	includeOVRCAPI()

	ovrRenderAPIConfigHeader.member("Header") // Platform-independent rendering information.
	uintptr_t.member("PlatformData", size = 8) // Platform-specific rendering information.
}.nativeType
val ovrRenderAPIConfig_p = StructType(ovrRenderAPIConfig)

val ovrTextureHeader = struct(OVR_PACKAGE, "OVRTextureHeader", structName = "ovrTextureHeader") {
	documentation =
		"""
		Platform-independent part of the eye texture descriptor. It is a part of ovrTexture, passed to ovrHmd_EndFrame. If RenderViewport is all zeros then the
		full texture will be used.
		"""
	includeOVRCAPI()

	ovrRenderAPIType.member("API") // The graphics API in use.
	ovrSizei.member("TextureSize") // The size of the texture.
	ovrRecti.member("RenderViewport") // Pixel viewport in texture that holds eye image.
}.nativeType

val ovrTexture = struct(OVR_PACKAGE, "OVRTexture", structName = "ovrTexture") {
	documentation = "Contains platform-specific information about a texture."
	includeOVRCAPI()

	ovrTextureHeader.member("Header") // Platform-independent data about the texture.
	uintptr_t.member("PlatformData", size = 8) // Specialized in ovrGLTextureData, ovrD3D11TextureData etc.
}.nativeType
val ovrTexture_p = StructType(ovrTexture)

val ovrDistortionVertex = struct(OVR_PACKAGE, "OVRDistortionVertex", structName = "ovrDistortionVertex") {
	documentation =
		"""
		Describes a full set of distortion mesh data, filled in by OVR##ovrHmd_CreateDistortionMesh(). Contents of this data structure, if not null, should be
		freed by OVR##ovrHmd_DestroyDistortionMesh().
		"""
	includeOVRCAPI()

	ovrVector2f.member("ScreenPosNDC") ///< [-1,+1],[-1,+1] over the entire framebuffer.
	float.member("TimeWarpFactor") ///< Lerp factor between time-warp matrices. Can be encoded in Pos.z.
	float.member("VignetteFactor") ///< Vignette fade factor. Can be encoded in Pos.w.
	ovrVector2f.member("TanEyeAnglesR") ///< The tangents of the horizontal and vertical eye angles for the red channel.
	ovrVector2f.member("TanEyeAnglesG") ///< The tangents of the horizontal and vertical eye angles for the green channel.
	ovrVector2f.member("TanEyeAnglesB") ///< The tangents of the horizontal and vertical eye angles for the blue channel.
}.nativeType
val ovrDistortionVertex_p = StructType(ovrDistortionVertex)

val ovrDistortionMesh = struct(OVR_PACKAGE, "OVRDistortionMesh", structName = "ovrDistortionMesh") {
	documentation =
		"""
		Describes a full set of distortion mesh data, filled in by OVR##ovrHmd_CreateDistortionMesh(). Contents of this data structure, if not null, should be
		freed by OVR##ovrHmd_DestroyDistortionMesh().
		"""
	includeOVRCAPI()

	ovrDistortionVertex_p.member("pVertexData") ///< The distortion vertices representing each point in the mesh.
	unsigned_short_p.member("pIndexData") ///< Indices for connecting the mesh vertices into polygons.
	unsigned_int.member("VertexCount") ///< The number of vertices in the mesh.
	unsigned_int.member("IndexCount") ///< The number of indices in the mesh.
}.nativeType
val ovrDistortionMesh_p = StructType(ovrDistortionMesh)

val ovrHSWDisplayState = struct(OVR_PACKAGE, "OVRHSWDisplayState", structName = "ovrHSWDisplayState") {
	documentation = "Used by ovrhmd_GetHSWDisplayState to report the current display state."
	includeOVRCAPI()

	/// If true then the warning should be currently visible
	/// and the following variables have meaning. Else there is no
	/// warning being displayed for this application on the given HMD.
	ovrBool.member("Displayed") ///< True if the Health&Safety Warning is currently displayed.
	double.member("StartTime") ///< Absolute time when the warning was first displayed. See ovr_GetTimeInSeconds().
	double.member("DismissibleTime") ///< Earliest absolute time when the warning can be dismissed. May be a time in the past.
}.nativeType
val ovrHSWDisplayState_p = StructType(ovrHSWDisplayState)

// OVR_CAPI_GL.h

val ovrGLConfigData = struct(OVR_PACKAGE, "OVRGLConfigData", structName = "ovrGLConfigData") {
	documentation = "Used to configure slave GL rendering (i.e. for devices created externally)."
	includeOVRCAPI_GL()

	ovrRenderAPIConfigHeader.member("Header") /// General device settings.
	// Conditional OS-specific members, see ovrGLConfigDataWindows/ovrGLConfigDataLinux
}.nativeType

val ovrGLConfig = struct(OVR_PACKAGE, "OVRGLConfig", structName = "ovrGLConfig", identifierType = StructIdentifierType.UNION) {
	documentation = "Contains OpenGL-specific rendering information."
	includeOVRCAPI_GL()

	ovrRenderAPIConfig.member("Config") /// General device settings.
	ovrGLConfigData.member("OGL") /// OpenGL-specific settings.
}.nativeType

val ovrGLConfigDataWindows = struct(OVR_PACKAGE, "OVRGLConfigDataWindows", nativeSubPath = "windows", structName = "ovrGLConfigData") {
	documentation = "Used to configure slave GL rendering (i.e. for devices created externally) on Windows."
	includeOVRCAPI_GL()

	ovrRenderAPIConfigHeader.member("Header") /// General device settings.
	HWND.member("Window") ///< The optional window handle. If unset, rendering will use the current window.
	HDC.member("DC") ///< The optional device context. If unset, rendering will use a new context.
}.nativeType

val ovrGLConfigWindows = struct(OVR_PACKAGE, "OVRGLConfigWindows", nativeSubPath = "windows", structName = "ovrGLConfig", identifierType = StructIdentifierType.UNION) {
	documentation = "Contains OpenGL-specific rendering information on Windows."
	includeOVRCAPI_GL()

	ovrRenderAPIConfig.member("Config") /// General device settings.
	ovrGLConfigDataWindows.member("OGL") /// OpenGL-specific settings.
}.nativeType

val ovrGLConfigDataLinux = struct(OVR_PACKAGE, "OVRGLConfigDataLinux", nativeSubPath = "linux", structName = "ovrGLConfigData") {
	documentation = "Used to configure slave GL rendering (i.e. for devices created externally) on Linux."
	includeOVRCAPI_GL()

	ovrRenderAPIConfigHeader.member("Header") /// General device settings.
	Display_p.member("Disp") ///< The optional window handle. If unset, rendering will use the current window.
}.nativeType

val ovrGLConfigLinux = struct(OVR_PACKAGE, "OVRGLConfigLinux", nativeSubPath = "linux", structName = "ovrGLConfig", identifierType = StructIdentifierType.UNION) {
	documentation = "Contains OpenGL-specific rendering information on Linux."
	includeOVRCAPI_GL()

	ovrRenderAPIConfig.member("Config") /// General device settings.
	ovrGLConfigDataLinux.member("OGL") /// OpenGL-specific settings.
}.nativeType

val ovrGLTextureData = struct(OVR_PACKAGE, "OVRGLTextureData", structName = "ovrGLTextureData") {
	documentation = "Used to pass GL eye texture data to ovrHmd_EndFrame."
	includeOVRCAPI_GL()

	ovrTextureHeader.member("Header") /// General device settings.
	GLuint.member("TexId") /// The OpenGL name for this texture.
}.nativeType

val ovrGLTexture = struct(OVR_PACKAGE, "OVRGLTexture", structName = "ovrGLTexture") {
	documentation = "Contains OpenGL-specific texture information."
	includeOVRCAPI_GL()

	ovrTexture.member("Texture") /// General device settings.
	ovrGLTextureData.member("OGL") /// OpenGL-specific settings.
}.nativeType