/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr

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

fun GeneratorTargetNative.includeOVRCAPI_VK() = nativeDirective(
    """DISABLE_WARNINGS()
#include "OVR_CAPI_Vk.h"
ENABLE_WARNINGS()""")

val ovrBool = IntegerType("ovrBool", PrimitiveMapping.BOOLEAN)
val ovrResult = IntegerType("ovrResult", PrimitiveMapping.INT)

val ovrSession = "ovrSession".handle

val ovrColorSpace = "ovrColorSpace".enumType
val ovrEyeType = "ovrEyeType".enumType
val ovrExtensions = "ovrExtensions".enumType
val ovrHmdType = "ovrHmdType".enumType
val ovrLayerType = "ovrLayerType".enumType

val ovrProcessId = typedef(int32_t, "ovrProcessId")

val ovrLogCallback = Module.OVR.callback {
    void(
        "OVRLogCallback",
        "The logging callback.",

        uintptr_t("userData", "an arbitrary value specified by the user of ovrInitParams"),
        int("level", "one of the {@code ovrLogLevel} constants"),
        NullTerminated..charUTF8.const.p("message", "a UTF8-encoded null-terminated string"),

        nativeType = "ovrLogCallback"
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
    """
    }
}

val ovrErrorInfo = struct(Module.OVR, "OVRErrorInfo", nativeName = "ovrErrorInfo", mutable = false) {
    documentation = "Provides information about the last error."

    ovrResult("Result", "the result from the last API call that generated an error {@code ovrResult}")
    charUTF8(
        "ErrorString",
        "a UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions"
    )[512]
}

val ovrSessionStatus = struct(Module.OVR, "OVRSessionStatus", nativeName = "ovrSessionStatus", mutable = false) {
    documentation = "Specifies status information for the current session."

    ovrBool("IsVisible", "True if the process has VR focus and thus is visible in the HMD.")
    ovrBool("HmdPresent", "True if an HMD is present.")
    ovrBool("HmdMounted", "True if the HMD is on the user's head.")
    ovrBool("DisplayLost", "True if the session is in a display-lost state. See #SubmitFrame().")
    ovrBool("ShouldQuit", "True if the application should initiate shutdown.    ")
    ovrBool(
        "ShouldRecenter",
        "True if UX has requested re-centering. Must call #ClearShouldRecenterFlag(), #RecenterTrackingOrigin() or #SpecifyTrackingOrigin()."
    )
    ovrBool(
        "HasInputFocus",
        """
        True if the application is the foreground application and receives input (e.g. Touch controller state). If this is false then the application is in the
        background (but possibly still visible) should hide any input representations such as hands.
        """
    )
    ovrBool(
        "OverlayPresent",
        """
        True if a system overlay is present, such as a dashboard. In this case the application (if visible) should pause while still drawing, avoid drawing
        near-field graphics so they don't visually fight with the system overlay, and consume fewer CPU and GPU resources.

        Deprecated, do not use.
        """
    )
    ovrBool("DepthRequested", "True if runtime is requesting that the application provide depth buffers with projection layers.")
}

val ovrInitParams = struct(Module.OVR, "OVRInitParams", nativeName = "ovrInitParams", skipBuffer = true) {
    documentation = "Parameters for #Initialize()."

    uint32_t("Flags", "flags from {@code ovrInitFlags} to override default behavior. Use 0 for the defaults.")
    uint32_t(
        "RequestedMinorVersion",
        """
        requests a specific minor version of the LibOVR runtime. Flags must include #Init_RequestVersion or this will be ignored and #MINOR_VERSION will
        be used. If you are directly calling the LibOVRRT version of #Initialize() in the LibOVRRT DLL then this must be valid and include
        #Init_RequestVersion.
        """
    )
    nullable..ovrLogCallback(
        "LogCallback",
        """
        user-supplied log callback function, which may be called at any time asynchronously from multiple threads until #Shutdown() completes. Use #NULL
        to specify no log callback.
        """
    )
    uintptr_t(
        "UserData",
        """
        user-supplied data which is passed as-is to {@code LogCallback}. Typically this is used to store an application-specific pointer which is read in the
        callback function.
        """
    )
    uint32_t(
        "ConnectionTimeoutMS",
        "relative number of milliseconds to wait for a connection to the server before failing. Use 0 for the default timeout."
    )
}

val ovrColorf = struct(Module.OVR, "OVRColorf", nativeName = "ovrColorf") {
    documentation = "An RGBA color with normalized float components."

    float("r", "the R component")
    float("g", "the G component")
    float("b", "the B component")
    float("a", "the A component")
}

val ovrVector2i = struct(Module.OVR, "OVRVector2i", nativeName = "ovrVector2i") {
    documentation = "A 2D vector with integer components."

    int("x", "the vector x component")
    int("y", "the vector y component")
}

val ovrSizei = struct(Module.OVR, "OVRSizei", nativeName = "ovrSizei") {
    documentation = "A 2D size with integer components."

    int("w", "the width")
    int("h", "the height")
}

val ovrRecti = struct(Module.OVR, "OVRRecti", nativeName = "ovrRecti") {
    documentation = "A 2D rectangle with a position and size. All components are integers."

    ovrVector2i("Pos", "the rectangle position")
    ovrSizei("Size", "the rectangle size")
}

val ovrQuatf = struct(Module.OVR, "OVRQuatf", nativeName = "ovrQuatf") {
    documentation = "A quaternion rotation."

    float("x", "the vector x component")
    float("y", "the vector y component")
    float("z", "the vector z component")
    float("w", "the vector w component")
}

val ovrVector2f = struct(Module.OVR, "OVRVector2f", nativeName = "ovrVector2f") {
    documentation = "A 2D vector with float components."

    float("x", "the vector x component")
    float("y", "the vector y component")
}

val ovrVector3f = struct(Module.OVR, "OVRVector3f", nativeName = "ovrVector3f") {
    documentation = "A 3D vector with float components."

    float("x", "the vector x component")
    float("y", "the vector y component")
    float("z", "the vector z component")
}

/*val ovrVector4f = struct(Module.OVR, "OVRVector4f", nativeName = "ovrVector4f") {
    documentation = "A 4D vector with float components."

    float("x", "the vector x component")
    float("y", "the vector y component")
    float("z", "the vector z component")
    float("w", "the vector w component")
}

val ovrVector4s = struct(Module.OVR, "OVRVector4s", nativeName = "ovrVector4s") {
    documentation = "A 4D vector with {@code int16_t} components."

    alignas(4)

    int16_t("x", "the vector x component")
    int16_t("y", "the vector y component")
    int16_t("z", "the vector z component")
    int16_t("w", "the vector w component")
}*/

val ovrMatrix4f = struct(Module.OVR, "OVRMatrix4f", nativeName = "ovrMatrix4f") {
    documentation = "A 4x4 matrix with float components."

    float("M", "the matrix components")[16]
}

val ovrPosef = struct(Module.OVR, "OVRPosef", nativeName = "ovrPosef") {
    documentation = "Position and orientation together."

    ovrQuatf("Orientation", "the pose orientation")
    ovrVector3f("Position", "the pose position")
}

val ovrPoseStatef = struct(Module.OVR, "OVRPoseStatef", nativeName = "ovrPoseStatef", mutable = false) {
    documentation =
        """
        A full pose (rigid body) configuration with first and second derivatives.

        Body refers to any object for which ovrPoseStatef is providing data.  It can be the HMD, Touch controller, sensor or something else. The context
        depends on the usage of the struct.
        """

    ovrPosef("ThePose", "position and orientation")
    ovrVector3f("AngularVelocity", "angular velocity in radians per second")
    ovrVector3f("LinearVelocity", "velocity in meters per second")
    ovrVector3f("AngularAcceleration", "angular acceleration in radians per second per second")
    ovrVector3f("LinearAcceleration", "acceleration in meters per second per second")
    padding(4)
    double("TimeInSeconds", "absolute time that this pose refers to. See #GetTimeInSeconds()")
}

val ovrFovPort = struct(Module.OVR, "OVRFovPort", nativeName = "ovrFovPort") {
    documentation =
        """
        Field Of View (FOV) in tangent of the angle units. As an example, for a standard 90 degree vertical FOV, we would have:
        ${codeBlock("{ UpTan = tan(90 degrees / 2), DownTan = tan(90 degrees / 2) }")}
        """

    float("UpTan", "tangent of the angle between the viewing vector and top edge of the FOV")
    float("DownTan", "tangent of the angle between the viewing vector and bottom edge of the FOV")
    float("LeftTan", "tangent of the angle between the viewing vector and left edge of the FOV")
    float("RightTan", "tangent of the angle between the viewing vector and right edge of the FOV")
}

val ovrTrackingOrigin = "ovrTrackingOrigin".enumType

val ovrExtensionProperties = struct(Module.OVR, "OVRExtensionProperties", nativeName = "ovrExtensionProperties", mutable = false) {
    javaImport("static org.lwjgl.ovr.OVR.OVR_MAX_EXTENSION_NAME_SIZE")
    documentation = "Describes the properties of an API extension."

    int("extensionId", "One of enum {@code ovrExtensions} or a dynamic value.")
    charASCII("extensionName", "")["OVR_MAX_EXTENSION_NAME_SIZE"]
    uint32_t("extensionVersion", "OpenXR-like version. Version compatibility is identified by the extension documentation.")
}

val ovrHmdColorDesc = struct(Module.OVR, "ovrHmdColorDesc", nativeName = "ovrHmdColorDesc") {
    alignas("POINTER_SIZE")

    ovrColorSpace(
        "ColorSpace",
        """
        Approximate color space the HMD display can output.
            
        Use ColorPrimaries for more precise color space definition including white point (e.g. DN75)
        """
    )
    padding(4)
}

val ovrGraphicsLuid = struct(Module.OVR, "OVRGraphicsLuid", nativeName = "ovrGraphicsLuid", mutable = false) {
    documentation =
        """
        Identifies a graphics device in a platform-specific way.

        For Windows this is a LUID type.
        """

    alignas("POINTER_SIZE")

    char("Reserved", "public definition reserves space for graphics API-specific implementation.")[8]
}

val ovrHmdDesc = struct(Module.OVR, "OVRHmdDesc", nativeName = "ovrHmdDesc", mutable = false, skipBuffer = true) {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")
    documentation = "A complete descriptor of the HMD."

    alignas("POINTER_SIZE")

    ovrHmdType("Type", "this HMD's type").links("Hmd_\\w+")
    padding(4, "Pointer.BITS64")
    charUTF8("ProductName", "name string describing the product: \"Oculus Rift DK1\", etc.")[64]
    charUTF8("Manufacturer", "string describing the manufacturer. Usually \"Oculus\".")[64]
    short("VendorId", "HID Vendor ID of the device")
    short("ProductId", "HID Product ID of the device")
    charASCII("SerialNumber", "HMD serial number")[24]
    short("FirmwareMajor", "HMD firmware major version number")
    short("FirmwareMinor", "HMD firmware minor version number")

    unsigned_int("AvailableHmdCaps", "available {@code ovrHmdCaps} bits")
    unsigned_int("DefaultHmdCaps", "default {@code ovrHmdCaps} bits")
    unsigned_int("AvailableTrackingCaps", "available {@code ovrTrackingCaps} bits")
    unsigned_int("DefaultTrackingCaps", "default {@code ovrTrackingCaps} bits")

    ovrFovPort("DefaultEyeFov", "the recommended optical FOV for the HMD")["ovrEye_Count"]
    ovrFovPort("MaxEyeFov", "the maximum optical FOV for the HMD")["ovrEye_Count"]

    ovrSizei("Resolution", "resolution of the full HMD screen (both eyes) in pixels")
    float("DisplayRefreshRate", "refresh rate of the display in cycles per second at the time of HMD creation")
}

val ovrTrackerDesc = struct(Module.OVR, "OVRTrackerDesc", nativeName = "ovrTrackerDesc", mutable = false) {
    documentation = "Specifies the description of a single sensor."

    alignas("POINTER_SIZE")

    float("FrustumHFovInRadians", "sensor frustum horizontal field-of-view (if present).")
    float("FrustumVFovInRadians", "sensor frustum vertical field-of-view (if present).")
    float("FrustumNearZInMeters", "sensor frustum near Z (if present).")
    float("FrustumFarZInMeters", "sensor frustum far Z (if present).")
}

val ovrTrackerPose = struct(Module.OVR, "OVRTrackerPose", nativeName = "ovrTrackerPose", mutable = false) {
    documentation = "Specifies the pose for a single sensor."

    alignas(8)

    unsigned_int("TrackerFlags", "{@code ovrTrackerFlags}.")
    ovrPosef("Pose", "the sensor's pose. This pose includes sensor tilt (roll and pitch). For a leveled coordinate system use {@code LeveledPose}.")
    ovrPosef(
        "LeveledPose",
        """t
        the sensor's leveled pose, aligned with gravity. This value includes pos and yaw of the sensor, but not roll and pitch. It can be used as a
        reference point to render real-world objects in the correct location.
        """
    )
}

val ovrTrackingState = struct(Module.OVR, "OVRTrackingState", nativeName = "ovrTrackingState", mutable = false) {
    documentation = "Tracking state at a given absolute time (describes predicted HMD pose etc). Returned by #GetTrackingState()."

    ovrPoseStatef(
        "HeadPose",
        """
        Predicted head pose (and derivatives) at the requested absolute time. The look-ahead interval is equal to
        {@code (HeadPose.TimeInSeconds - RawSensorData.TimeInSeconds)}.
        """
    )

    unsigned_int("StatusFlags", "{@code HeadPose} tracking status described by {@code ovrStatusBits}.")

    ovrPoseStatef(
        "HandPoses",
        """
        The most recent calculated pose for each hand when hand controller tracking is present. {@code HandPoses[ovrHand_Left]} refers to the left hand and
        {@code HandPoses[ovrHand_Right]} to the right hand. These values can be combined with {@code ovrInputState} for complete hand controller information.
        """
    )[2]

    unsigned_int("HandStatusFlags", "{@code HandPoses} status flags described by {@code ovrStatusBits}.")[2]

    ovrPosef(
        "CalibratedOrigin",
        """
        the pose of the origin captured during calibration.

        Like all other poses here, this is expressed in the space set by #RecenterTrackingOrigin(), or #SpecifyTrackingOrigin() and so will change every time
        either of those functions are called. This pose can be used to calculate where the calibrated origin lands in the new recentered space. If an
        application never calls #RecenterTrackingOrigin() or #SpecifyTrackingOrigin(), expect this value to be the identity pose and as such will point
        respective origin based on {@code ovrTrackingOrigin} requested when calling #GetTrackingState().
        """)
}

val ovrEyeRenderDesc = struct(Module.OVR, "OVREyeRenderDesc", nativeName = "ovrEyeRenderDesc", mutable = false) {
    documentation =
        """
        rendering information for each eye. Computed by either #GetRenderDesc() based on the specified FOV. Note that the rendering viewport is not
        included here as it can be specified separately and modified per frame by passing different viewport values in the layer structure.
        """

    ovrEyeType("Eye", "the eye index this instance corresponds to").links("Eye_(?!Count)\\w+")
    ovrFovPort("Fov", "the field of view")
    ovrRecti("DistortedViewport", "distortion viewport")
    ovrVector2f("PixelsPerTanAngleAtCenter", "wow many display pixels will fit in tan(angle) = 1")
    ovrPosef("HmdToEyePose", "transform of eye from the HMD center, in meters")
}

val ovrTimewarpProjectionDesc = struct(Module.OVR, "OVRTimewarpProjectionDesc", nativeName = "ovrTimewarpProjectionDesc", mutable = false) {
    documentation =
        """
        Projection information for ##OVRLayerEyeFovDepth.

        Use the utility function #TimewarpProjectionDesc_FromProjection() to generate this structure from the application's projection matrix.
        """

    float("Projection22", "projection matrix element [2][2]")
    float("Projection23", "projection matrix element [2][3]")
    float("Projection32", "projection matrix element [3][2]")
}

val ovrViewScaleDesc = struct(Module.OVR, "OVRViewScaleDesc", nativeName = "ovrViewScaleDesc") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")
    documentation =
        """
        Contains the data necessary to properly calculate position info for various layer types.
        ${ul(
            """
            {@code HmdToEyePose} is the same value-pair provided in ##OVREyeRenderDesc. Modifying this value is suggested only if the app is forcing monoscopic
            rendering and requires that all layers including quad layers show up in a monoscopic fashion.
            """,
            "{@code HmdSpaceToWorldScaleInMeters} is used to scale player motion into in-application units."
        )}
        In other words, it is how big an in-application unit is in the player's physical meters. For example, if the application uses inches as its units then
        {@code HmdSpaceToWorldScaleInMeters} would be 0.0254. Note that if you are scaling the player in size, this must also scale. So if your application
        units are inches, but you're shrinking the player to half their normal size, then {@code HmdSpaceToWorldScaleInMeters} would be {@code 0.0254*2.0}.
        """

    ovrPosef("HmdToEyePose", "transform of each eye from the HMD center, in meters")["ovrEye_Count"]
    float("HmdSpaceToWorldScaleInMeters", "ratio of viewer units to meter units")
}

val ovrTextureType = "ovrTextureType".enumType
val ovrTextureFormat = "ovrTextureFormat".enumType

val ovrTextureSwapChainDesc = struct(Module.OVR, "OVRTextureSwapChainDesc", nativeName = "ovrTextureSwapChainDesc") {
    documentation = "Description used to create a texture swap chain."

    ovrTextureType("Type", "").links("#Texture_2D #Texture_Cube")
    ovrTextureFormat("Format", "").links("OVR_FORMAT_\\w+")
    int("ArraySize", "must be 6 for #Texture_Cube, size of texture array otherwise")
    int("Width", "")
    int("Height", "")
    int("MipLevels", "")
    int("SampleCount", "")
    ovrBool("StaticImage", "not buffered in a chain. For images that don't change")
    unsigned_int("MiscFlags", "{@code ovrTextureFlags}").links("TextureMisc_\\w+", LinkMode.BITFIELD)
    unsigned_int("BindFlags", "{@code ovrTextureBindFlags}. Not used for GL.").links("TextureBind_\\w+", LinkMode.BITFIELD)
}

val ovrMirrorTextureDesc = struct(Module.OVR, "OVRMirrorTextureDesc", nativeName = "ovrMirrorTextureDesc") {
    documentation = "Description used to create a mirror texture."

    ovrTextureFormat("Format", "").links("OVR_FORMAT_\\w+")
    int("Width", "")
    int("Height", "")
    unsigned_int("MiscFlags", "{@code ovrTextureFlags}").links("TextureMisc_\\w+", LinkMode.BITFIELD)
}

val ovrTextureSwapChain = "ovrTextureSwapChain".handle
val ovrMirrorTexture = "ovrMirrorTexture".handle

val ovrFovStencilType = "ovrFovStencilType".enumType
val ovrFovStencilDesc = struct(Module.OVR, "OVRFovStencilDesc", nativeName = "ovrFovStencilDesc") {
    documentation = "Fov-stencil mesh descriptor passed into the function #GetFovStencil()."

    alignas("POINTER_SIZE")

    ovrFovStencilType("StencilType", "").links("FovStencil_\\w+")
    uint32_t("StencilFlags", "").links("FovStencilFlag_\\w+", LinkMode.BITFIELD)
    ovrEyeType("Eye", "")
    ovrFovPort("FovPort", "typically FOV obtained from #GetRenderDesc()")
    ovrQuatf(
        "HmdToEyeRotation",
        "typically {@code HmdToEyePose.Orientation} obtained from #GetRenderDesc(). Note: Currently unsupported, always treated as identity."
    )
}
val ovrFovStencilMeshBuffer = struct(Module.OVR, "OVRFovStencilMeshBuffer", nativeName = "ovrFovStencilMeshBuffer") {
    documentation = "Contains the data for the fov-stencil mesh. Parts of the struct are filled by the caller while some parts are filled by the SDK."

    /// Vertex info
    AutoSize("VertexBuffer")..int("AllocVertexCount", "to be filled in by caller of #GetFovStencil()")
    int("UsedVertexCount", "to be filled in by SDK and returned to caller")
    nullable..ovrVector2f.p("VertexBuffer", "to be allocated by caller and filled in by SDK")

    /// Index info
    AutoSize("IndexBuffer")..int("AllocIndexCount", "to be filled in by caller of #GetFovStencil()")
    int("UsedIndexCount", "to be filled in by SDK and returned to caller")
    nullable..uint16_t.p("IndexBuffer", "to be allocated by caller and filled in by SDK")
}

val ovrTouchHapticsDesc = struct(Module.OVR, "OVRTouchHapticsDesc", nativeName = "ovrTouchHapticsDesc", mutable = false) {
    documentation = "Describes the Touch Haptics engine."

    alignas("POINTER_SIZE")

    int("SampleRateHz", "Haptics engine frequency/sample-rate, sample time in seconds equals {@code 1.0/sampleRateHz}")
    int("SampleSizeInBytes", "Size of each Haptics sample, sample value range is {@code [0, 2^(Bytes*8)-1]}")

    int(
        "QueueMinSizeToAvoidStarvation",
        "Queue size that would guarantee Haptics engine would not starve for data. Make sure size doesn't drop below it for best results."
    )

    int("SubmitMinSamples", "Minimum number of samples that can be sent to Haptics through #SubmitControllerVibration()")
    int("SubmitMaxSamples", "Maximum number of samples that can be sent to Haptics through #SubmitControllerVibration()")
    int("SubmitOptimalSamples", "Optimal number of samples that can be sent to Haptics through #SubmitControllerVibration()")
}

val ovrHapticsBufferSubmitMode = "ovrHapticsBufferSubmitMode".enumType

val ovrHapticsBuffer = struct(Module.OVR, "OVRHapticsBuffer", nativeName = "ovrHapticsBuffer") {
    documentation = "Haptics buffer descriptor, contains amplitude samples used for Touch vibration."

    void.p("Samples", "samples stored in opaque format")
    int("SamplesCount", "number of samples (up to #OVR_HAPTICS_BUFFER_SAMPLES_MAX)")
    ovrHapticsBufferSubmitMode("SubmitMode", "how samples are submitted to the hardware").links("HapticsBufferSubmit_\\w+")
}

val ovrHapticsPlaybackState = struct(Module.OVR, "OVRHapticsPlaybackState", nativeName = "ovrHapticsPlaybackState", mutable = false) {
    documentation = "State of the Haptics playback for Touch vibration."

    int("RemainingQueueSpace", "Remaining space available to queue more samples")
    int("SamplesQueued", "Number of samples currently queued")
}

val ovrControllerType = "ovrControllerType".enumType

val ovrTrackedDeviceType = "ovrTrackedDeviceType".enumType
val ovrBoundaryType = "ovrBoundaryType".enumType

val ovrBoundaryLookAndFeel = struct(Module.OVR, "OVRBoundaryLookAndFeel", nativeName = "ovrBoundaryLookAndFeel") {
    documentation = "Boundary system look and feel."

    ovrColorf("Color", "Boundary color (alpha channel is ignored)")
}

val ovrBoundaryTestResult = struct(Module.OVR, "OVRBoundaryTestResult", nativeName = "ovrBoundaryTestResult", mutable = false) {
    documentation = "Provides boundary test information."

    ovrBool(
        "IsTriggering",
        "True if the boundary system is being triggered. Note that due to fade in/out effects this may not exactly match visibility."
    )
    float("ClosestDistance", "Distance to the closest play area or outer boundary surface")
    ovrVector3f("ClosestPoint", "Closest point on the boundary surface")
    ovrVector3f("ClosestPointNormal", "Unit surface normal of the closest boundary surface")
}

val ovrInputState = struct(Module.OVR, "OVRInputState", nativeName = "ovrInputState", mutable = false) {
    javaImport("static org.lwjgl.ovr.OVR.ovrHand_Count")
    documentation =
        """
        Describes the complete controller input state, including Oculus Touch, and XBox gamepad. If multiple inputs are connected and used at the same time,
        their inputs are combined.
        """

    double("TimeInSeconds", "system type when the controller state was last updated")
    unsigned_int("Buttons", "values for buttons described by {@code ovrButton}")
    unsigned_int("Touches", "touch values for buttons and sensors as described by {@code ovrTouch}.")
    float(
        "IndexTrigger",
        "left and right finger trigger values (#Hand_Left and #Hand_Right), in the range 0.0 to 1.0f."
    )["ovrHand_Count"]
    float(
        "HandTrigger",
        "left and right hand trigger values (#Hand_Left and #Hand_Right), in the range 0.0 to 1.0f."
    )["ovrHand_Count"]
    ovrVector2f(
        "Thumbstick",
        "horizontal and vertical thumbstick axis values (#Hand_Left and #Hand_Right), in the range -1.0f to 1.0f."
    )["ovrHand_Count"]
    ovrControllerType("ControllerType", "The type of the controller this state is for.").links("ControllerType_\\w+")

    float(
        "IndexTriggerNoDeadzone",
        "Left and right finger trigger values (#Hand_Left and #Hand_Right), in range 0.0 to 1.0f. Does not apply a deadzone. Only touch applies a filter."
    )["ovrHand_Count"]
    float(
        "HandTriggerNoDeadzone",
        "Left and right hand trigger values (#Hand_Left and #Hand_Right), in the range 0.0 to 1.0f. Does not apply a deadzone. Only touch applies a filter."
    )["ovrHand_Count"]
    ovrVector2f(
        "ThumbstickNoDeadzone",
        "Horizontal and vertical thumbstick axis values (#Hand_Left and #Hand_Right), in the range -1.0f to 1.0f. Does not apply a deadzone or filter."
    )["ovrHand_Count"]

    float(
        "IndexTriggerRaw",
        "Left and right finger trigger values (#Hand_Left and #Hand_Right), in range 0.0 to 1.0f. No deadzone or filter."
    )["ovrHand_Count"]

    float(
        "HandTriggerRaw",
        "Left and right hand trigger values (#Hand_Left and #Hand_Right), in the range 0.0 to 1.0f. No deadzone or filter."
    )["ovrHand_Count"]

    ovrVector2f(
        "ThumbstickRaw",
        "Horizontal and vertical thumbstick axis values (#Hand_Left and #Hand_Right), in range -1.0f to 1.0f. No deadzone or filter."
    )["ovrHand_Count"]
}

val ovrCameraIntrinsics = struct(Module.OVR, "OVRCameraIntrinsics", nativeName = "ovrCameraIntrinsics") {
    double("LastChangedTime", "time in seconds from last change to the parameters")
    ovrFovPort("FOVPort", "angles of all 4 sides of viewport")
    float("VirtualNearPlaneDistanceMeters", "near plane of the virtual camera used to match the external camera")
    float("VirtualFarPlaneDistanceMeters", "far plane of the virtual camera used to match the external camera")
    ovrSizei("ImageSensorPixelResolution", "height in pixels of image sensor")
    ovrMatrix4f("LensDistortionMatrix", "the lens distortion matrix of camera")
    double("ExposurePeriodSeconds", "how often, in seconds, the exposure is taken")
    double("ExposureDurationSeconds", "length of the exposure time")
}

val ovrCameraExtrinsics = struct(Module.OVR, "OVRCameraExtrinsics", nativeName = "ovrCameraExtrinsics") {
    double(
        "LastChangedTimeSeconds",
        "time in seconds from last change to the parameters. For instance, if the pose changes, or a camera exposure happens, this struct will be updated."
    )
    unsigned_int("CameraStatusFlags", "current Status of the camera, a mix of bits from {@code ovrCameraStatusFlags}")
    ovrTrackedDeviceType(
        "AttachedToDevice",
        """
        which Tracked device, if any, is the camera rigidly attached to. If set to #TrackedDevice_None, then the camera is not attached to a tracked object. If
        the external camera moves while unattached (i.e. set to {@code ovrTrackedDevice_None}), its {@code Pose} won't be updated.
        """
    )
    ovrPosef(
        "RelativePose",
        "the relative Pose of the External Camera. If {@code AttachedToDevice} is #TrackedDevice_None, then this is a absolute pose in tracking space."
    )
    double("LastExposureTimeSeconds", "the time, in seconds, when the last successful exposure was taken")
    double("ExposureLatencySeconds", "estimated exposure latency to get from the exposure time to the system")
    double(
        "AdditionalLatencySeconds",
        "additional latency to get from the exposure time of the real camera to match the render time of the virtual camera"
    )
}

const val OVR_EXTERNAL_CAMERA_NAME_SIZE = 32
val ovrExternalCamera = struct(Module.OVR, "OVRExternalCamera", nativeName = "ovrExternalCamera", mutable = false) {
    charASCII("Name", "camera identifier: vid + pid + serial number etc.")[OVR_EXTERNAL_CAMERA_NAME_SIZE]
    ovrCameraIntrinsics("Intrinsics", "")
    ovrCameraExtrinsics("Extrinsics", "")
}

val ovrLayerHeader = struct(Module.OVR, "OVRLayerHeader", nativeName = "ovrLayerHeader") {
    documentation =
        """
        Defines properties shared by all ovrLayer structs, such as ##OVRLayerEyeFov.

        {@code ovrLayerHeader} is used as a base member in these larger structs. This struct cannot be used by itself except for the case that {@code Type} is
        #LayerType_Disabled.
        """

    alignas("POINTER_SIZE")

    ovrLayerType("Type", "described by {@code ovrLayerType}").links("LayerType_\\w+")
    unsigned_int("Flags", "described by {@code ovrLayerFlags}")

    padding(128)
}

val ovrLayerEyeFov = struct(Module.OVR, "OVRLayerEyeFov", nativeName = "ovrLayerEyeFov") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")
    documentation =
        """
        Describes a layer that specifies a monoscopic or stereoscopic view. This is the kind of layer that's typically used as layer 0 to
        #SubmitFrame(), as it is the kind of layer used to render a 3D stereoscopic view.
        """

    ovrLayerHeader("Header", "{@code Header.Type} must be #LayerType_EyeFov")
    ovrTextureSwapChain(
        "ColorTexture",
        "{@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be #NULL."
    )["ovrEye_Count", "1"]
    ovrRecti(
        "Viewport",
        "specifies the ColorTexture sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid."
    )["ovrEye_Count"]
    ovrFovPort("Fov", "the viewport field of view")["ovrEye_Count"]
    ovrPosef(
        "RenderPose",
        """
        specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned from
        #_CalcEyePoses(), but can be different in special cases if a different head pose is used for rendering.
        """
    )["ovrEye_Count"]
    double(
        "SensorSampleTime",
        """
        specifies the timestamp when the source ##OVRPosef (used in calculating RenderPose) was sampled from the SDK. Typically retrieved by calling
        #GetTimeInSeconds() around the instant the application calls #GetTrackingState(). The main purpose for this is to accurately track app
        tracking latency.
        """
    )
}

val ovrLayerEyeFovDepth = struct(Module.OVR, "OVRLayerEyeFovDepth", nativeName = "ovrLayerEyeFovDepth") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")
    documentation =
        """
        Describes a layer that specifies a monoscopic or stereoscopic view, with depth textures in addition to color textures. This is typically used to
        support positional time warp. This struct is the same as ##OVRLayerEyeFov, but with the addition of {@code DepthTexture} and {@code ProjectionDesc}.

        {@code ProjectionDesc} can be created using #TimewarpProjectionDesc_FromProjection().

        Three options exist with respect to mono/stereo texture usage:
        ${ul(
            """
            {@code ColorTexture[0]} and {@code ColorTexture[1]} contain the left and right stereo renderings, respectively. {@code Viewport[0]} and
            {@code Viewport[1]} refer to {@code ColorTexture[0]} and {@code ColorTexture[1]}, respectively.
            """,
            """
            {@code ColorTexture[0]} contains both the left and right renderings, {@code ColorTexture[1]} is #NULL, and {@code Viewport[0]} and
            {@code Viewport[1]} refer to sub-rects with {@code ColorTexture[0]}.
            """,
            "{@code ColorTexture[0]} contains a single monoscopic rendering, and {@code Viewport[0]} and {@code Viewport[1]} both refer to that rendering."
        )}
        """

    ovrLayerHeader("Header", "{@code Header.Type} must be #LayerType_EyeFovDepth")
    ovrTextureSwapChain(
        "ColorTexture",
        "{@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be #NULL for cases described above."
    )["ovrEye_Count", "1"]
    ovrRecti(
        "Viewport",
        "specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid."
    )["ovrEye_Count"]
    ovrFovPort("Fov", "the viewport field of view")["ovrEye_Count"]
    ovrPosef(
        "RenderPose",
        """
        specifies the position and orientation of each eye view, with position specified in meters. {@code RenderPose} will typically be the value returned
        from #_CalcEyePoses(), but can be different in special cases if a different head pose is used for rendering.
        """
    )["ovrEye_Count"]
    double(
        "SensorSampleTime",
        """
        specifies the timestamp when the source ##OVRPosef (used in calculating {@code RenderPose}) was sampled from the SDK. Typically retrieved by calling
        #GetTimeInSeconds() around the instant the application calls #GetTrackingState(). The main purpose for this is to accurately track app tracking
        latency.
        """
    )
    ovrTextureSwapChain(
        "DepthTexture",
        "depth texture for depth composition with overlays. Must map 1:1 to the {@code ColorTexture}."
    )["ovrEye_Count", "1"]
    ovrTimewarpProjectionDesc("ProjectionDesc", "specifies how to convert {@code DepthTexture} information into meters")
}

val ovrTextureLayoutOctilinear = struct(Module.OVR, "OVRTextureLayoutOctilinear", nativeName = "ovrTextureLayoutOctilinear") {
    documentation =
        """
        Multiresolution descriptor for Octilinear.

        Usage of this layer must be successfully enabled via #EnableExtension() before it can be used.

        Size of W quadrants:
        ${codeBlock("""
SizeLeft + SizeRight <= Viewport.Size.w
SizeUp   + sizeDown  <= Viewport.Size.h

Clip space (0,0) is located at Viewport.Pos + (SizeLeft,SizeUp) where
Viewport is given in the layer description.

Viewport Top left
+-----------------------------------------------------+
|                        ^                       |    |
|                        |                       |    |
|           0          SizeUp         1          |    |
|                        |                       |<--Portion of viewport
|                        |                       |   determined by sizes
|                        |                       |    |
|<--------SizeLeft-------+-------SizeRight------>|    |
|                        |                       |    |
|                        |                       |    |
|           2         SizeDown        3          |    |
|                        |                       |    |
|                        |                       |    |
|                        v                       |    |
+------------------------------------------------+    |
|                                                     |
+-----------------------------------------------------+
                                                      Viewport bottom right

For example, when rendering quadrant 0 its scissor rectangle will be

 Top    = 0
 Left   = 0
 Right  = SizeLeft
 Bottom = SizeUp

and the scissor rectangle for quadrant 1 will be:

 Top    = 0
 Left   = SizeLeft
 Right  = SizeLeft + SizeRight
 Bottom = SizeUp""")}
        """

    alignas("POINTER_SIZE")

    float("WarpLeft", "left W warping")
    float("WarpRight", "right W warping")
    float("WarpUp", "up W warping")
    float("WarpDown", "down W warping")

    float("SizeLeft", "left W quadrant size")
    float("SizeRight", "right W quadrant size")
    float("SizeUp", "up W quadrant size")
    float("SizeDown", "down W quadrant size")
}

val ovrTextureLayoutDesc_Union = union(Module.OVR, "OVRTextureLayoutDescUnion", nativeName = "ovrTextureLayoutDesc_Union") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")
    documentation = "Combines texture layout descriptors."

    ovrTextureLayoutOctilinear("Octilinear", "")["ovrEye_Count"]
}

val ovrTextureLayout = "ovrTextureLayout".enumType

val ovrLayerEyeFovMultires = struct(Module.OVR, "OVRLayerEyeFovMultires", nativeName = "ovrLayerEyeFovMultires") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")
    documentation =
        """
        Describes a layer that specifies a monoscopic or stereoscopic view with support for optional multiresolution textures. This struct is the same as
        ##OVRLayerEyeFov plus texture layout parameters.

        Three options exist with respect to mono/stereo texture usage:
        ${ul(
            """
            {@code ColorTexture[0]} and {@code ColorTexture[1]} contain the left and right stereo renderings, respectively. {@code Viewport[0]} and
            {@code Viewport[1]} refer to {@code ColorTexture[0]} and {@code ColorTexture[1]}, respectively.
            """,
            """
            {@code ColorTexture[0]} contains both the left and right renderings, {@code ColorTexture[1]} is #NULL, and {@code Viewport[0]} and
            {@code Viewport[1]} refer to sub-rects with {@code ColorTexture[0]}.
            """,
            "{@code ColorTexture[0]} contains a single monoscopic rendering, and {@code Viewport[0]} and {@code Viewport[1]} both refer to that rendering."
        )}
        """

    ovrLayerHeader("Header", "{@code Header.Type} must be #LayerType_EyeFovMultires")

    ovrTextureSwapChain(
        "ColorTexture",
        "{@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be #NULL for cases described above."
    )["ovrEye_Count"]

    ovrRecti(
        "Viewport",
        "specifies the ColorTexture sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid."
    )["ovrEye_Count"]

    ovrFovPort("Fov", "the viewport field of view")["ovrEye_Count"]

    ovrPosef(
        "RenderPose",
        """
        specifies the position and orientation of each eye view, with position specified in meters. {@code RenderPose} will typically be the value returned
        from #_CalcEyePoses(), but can be different in special cases if a different head pose is used for rendering.
        """
    )["ovrEye_Count"]

    double(
        "SensorSampleTime",
        """
        specifies the timestamp when the source ##OVRPosef (used in calculating {@code RenderPose}) was sampled from the SDK. Typically retrieved by calling
        #GetTimeInSeconds() around the instant the application calls #GetTrackingState(). The main purpose for this is to accurately track app tracking
        latency.
        """
    )

    ovrTextureLayout("TextureLayout", "specifies layout type of textures")
    ovrTextureLayoutDesc_Union("TextureLayoutDesc", "specifies texture layout parameters")
}

val ovrLayerEyeMatrix = struct(Module.OVR, "OVRLayerEyeMatrix", nativeName = "ovrLayerEyeMatrix") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")
    documentation =
        """
        Describes a layer that specifies a monoscopic or stereoscopic view.

        This uses a direct 3x4 matrix to map from view space to the UV coordinates. It is essentially the same thing as ##OVRLayerEyeFov but using a much
        lower level. This is mainly to provide compatibility with specific apps. Unless the application really requires this flexibility, it is usually
        better to use {@code ovrLayerEyeFov}.

        Three options exist with respect to mono/stereo texture usage:
        ${ul(
            """
            {@code ColorTexture[0]} and {@code ColorTexture[1]} contain the left and right stereo renderings, respectively. {@code Viewport[0]} and
            {@code Viewport[1]} refer to {@code ColorTexture[0]} and {@code ColorTexture[1]}, respectively.
            """,
            """
            {@code ColorTexture[0]} contains both the left and right renderings, {@code ColorTexture[1]} is #NULL, and {@code Viewport[0]} and
            {@code Viewport[1]} refer to sub-rects with {@code ColorTexture[0]}.
            """,
            "{@code ColorTexture[0]} contains a single monoscopic rendering, and {@code Viewport[0]} and {@code Viewport[1]} both refer to that rendering."
        )}
        """

    ovrLayerHeader("Header", "{@code Header.Type} must be #LayerType_EyeMatrix")
    ovrTextureSwapChain(
        "ColorTexture",
        "{@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be #NULL for cases described above."
    )["ovrEye_Count", "1"]
    ovrRecti(
        "Viewport",
        "specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid."
    )["ovrEye_Count"]
    ovrPosef(
        "RenderPose",
        """
        specifies the position and orientation of each eye view, with the position specified in meters. {@code RenderPose} will typically be the value
        returned from #_CalcEyePoses(), but can be different in special cases if a different head pose is used for rendering.
        """
    )["ovrEye_Count"]
    ovrMatrix4f(
        "Matrix",
        """
        specifies the mapping from a view-space vector to a UV coordinate on the textures given above.
        ${codeBlock("""
P = (x,y,z,1)*Matrix
TexU  = P.x/P.z
TexV  = P.y/P.z""")}
        """
    )["ovrEye_Count"]
    double(
        "SensorSampleTime",
        """
        specifies the timestamp when the source {@code ovrPosef} (used in calculating {@code RenderPose}) was sampled from the SDK. Typically retrieved by
        calling #GetTimeInSeconds() around the instant the application calls #GetTrackingState() The main purpose for this is to accurately track app
        tracking latency.
        """
    )
}

val ovrLayerQuad = struct(Module.OVR, "OVRLayerQuad", nativeName = "ovrLayerQuad") {
    documentation =
        """
        Describes a layer of Quad type, which is a single quad in world or viewer space. It is used for both #LayerType_Quad. This type of layer
        represents a single object placed in the world and not a stereo view of the world itself.

        A typical use of #LayerType_Quad is to draw a television screen in a room that for some reason is more convenient to draw as a layer than
        as part of the main view in layer 0. For example, it could implement a 3D popup GUI that is drawn at a higher resolution than layer 0 to improve
        fidelity of the GUI.

        Quad layers are visible from both sides; they are not back-face culled.
        """

    ovrLayerHeader("Header", "{@code Header.Type} must be #LayerType_Quad")
    ovrTextureSwapChain("ColorTexture", "contains a single image, never with any stereo view")
    ovrRecti("Viewport", "specifies the ColorTexture sub-rect UV coordinates")
    ovrPosef(
        "QuadPoseCenter",
        """
        specifies the orientation and position of the center point of a Quad layer type.

        The supplied direction is the vector perpendicular to the quad. The position is in real-world meters (not the application's virtual world, the physical
        world the user is in) and is relative to the "zero" position set by #RecenterTrackingOrigin() unless the #LayerFlag_HeadLocked flag is
        used.
        """
    )
    ovrVector2f("QuadSize", "width and height (respectively) of the quad in meters")
}

val ovrLayerCylinder = struct(Module.OVR, "OVRLayerCylinder", nativeName = "ovrLayerCylinder") {
    documentation =
        """
        Describes a layer of type #LayerType_Cylinder which is a single cylinder relative to the recentered origin. This type of layer represents a single
        object placed in the world and not a stereo view of the world itself.
        ${codeBlock("""
               -Z                                       +Y
        U=0  +--+--+  U=1
         +---+  |  +---+            +-----------------+  - V=0
      +--+ \    |    / +--+         |                 |  |
    +-+     \       /     +-+       |                 |  |
   ++        \  A  /        ++      |                 |  |
  ++          \---/          ++     |                 |  |
  |            \ /            |     |              +X |  |
  +-------------C------R------+ +X  +--------C--------+  | <--- Height
      (+Y is out of screen)         |                 |  |
                                    |                 |  |
  R = Radius                        |                 |  |
  A = Angle (0,2*Pi)                |                 |  |
  C = CylinderPoseCenter            |                 |  |
  U/V = UV Coordinates              +-----------------+  - V=1""")}

        An identity {@code CylinderPoseCenter} places the center of the cylinder at the recentered origin unless the headlocked flag is set.

        Does not utilize {@code HmdSpaceToWorldScaleInMeters}. If necessary, adjust translation and radius.

        ${note("""
        Only the interior surface of the cylinder is visible. Use cylinder layers when the user cannot leave the extents of the cylinder. Artifacts may appear
        when viewing the cylinder's exterior surface. Additionally, while the interface supports an Angle that ranges from {@code [0,2*Pi]} the angle should
        remain less than {@code 1.9*PI} to avoid artifacts where the cylinder edges converge.""")}
        """

    ovrLayerHeader("Header", "{@code Header.Type} must be #LayerType_Cylinder")
    ovrTextureSwapChain("ColorTexture", "contains a single image, never with any stereo view")
    ovrRecti("Viewport", "specifies the ColorTexture sub-rect UV coordinates")
    ovrPosef(
        "CylinderPoseCenter",
        """
        specifies the orientation and position of the center point of a cylinder layer type. The position is in real-world meters not the application's virtual
        world, but the physical world the user is in. It is relative to the "zero" position set by #RecenterTrackingOrigin() unless the
        #LayerFlag_HeadLocked flag is used.
        """
    )
    float("CylinderRadius", "radius of the cylinder in meters")
    float("CylinderAngle", "angle in radians. Range is from 0 to {@code 2*Pi} exclusive covering the entire cylinder (see diagram and note above).")
    float(
        "CylinderAspectRatio",
        """
        custom aspect ratio presumably set based on {@code Viewport}. Used to calculate the height of the cylinder based on the arc-length
        ({@code CylinderAngle}) and radius ({@code CylinderRadius}) given above. The height of the cylinder is given by:
        {@code height = (CylinderRadius * CylinderAngle) / CylinderAspectRatio}. Aspect ratio is {@code width / height}.
        """
    )
}

val ovrLayerCube = struct(Module.OVR, "OVRLayerCube", nativeName = "ovrLayerCube") {
    documentation =
        """
        Describes a layer of type #LayerType_Cube which is a single timewarped cubemap at infinity. When looking down the recentered origin's -Z axis, +X face
        is left and +Y face is up. Similarly, if headlocked the +X face is left, +Y face is up and -Z face is forward. Note that the coordinate system is
        left-handed.

        #LayerFlag_TextureOriginAtBottomLeft flag is not supported by {@code ovrLayerCube}.
        """

    ovrLayerHeader("Header", "{@code Header.Type} must be #LayerType_Cube")
    ovrQuatf("Orientation", "orientation of the cube")
    ovrTextureSwapChain("CubeMapTexture", "contains a single cubemap swapchain (not a stereo pair of swapchains)")
}

val ovrPerfStatsPerCompositorFrame = struct(Module.OVR, "OVRPerfStatsPerCompositorFrame", nativeName = "ovrPerfStatsPerCompositorFrame", mutable = false) {
    documentation =
        """
        Contains the performance stats for a given SDK compositor frame.

        All of the int fields can be reset via the #ResetPerfStats() call.
        """

    int(
        "HmdVsyncIndex",
        """
        Vsync Frame Index - increments with each HMD vertical synchronization signal (i.e. vsync or refresh rate).

        If the compositor drops a frame, expect this value to increment more than 1 at a time.
        """
    )

    ///
    /// Application stats
    ///

    int("AppFrameIndex", "index that increments with each successive #SubmitFrame() call")
    int("AppDroppedFrameCount", "if the app fails to call #SubmitFrame() on time, then expect this value to increment with each missed frame")
    float(
        "AppMotionToPhotonLatency",
        """
        motion-to-photon latency for the application

        This value is calculated by either using the {@code SensorSampleTime} provided for the ##OVRLayerEyeFov or if that is not available, then the call to
        #GetTrackingState() which has {@code latencyMarker} set to #True.
        """
    )
    float(
        "AppQueueAheadTime",
        """
        amount of queue-ahead in seconds provided to the app based on performance and overlap of CPU and GPU utilization.

        A value of 0.0 would mean the CPU &amp; GPU workload is being completed in 1 frame's worth of time, while 11 ms (on the CV1) of queue ahead would
        indicate that the app's CPU workload for the next frame is overlapping the app's GPU workload for the current frame.
        """
    )
    float(
        "AppCpuElapsedTime",
        """
        amount of time in seconds spent on the CPU by the app's render-thread that calls #SubmitFrame().

        Measured as elapsed time between from when app regains control from #SubmitFrame() to the next time the app calls #SubmitFrame().
        """
    )
    float(
        "AppGpuElapsedTime",
        """
        amount of time in seconds spent on the GPU by the app.

        Measured as elapsed time between each #SubmitFrame() call using GPU timing queries.
        """
    )

    ///
    /// SDK Compositor stats
    ///

    int(
        "CompositorFrameIndex",
        """
        index that increments each time the SDK compositor completes a distortion and timewarp pass.

        Since the compositor operates asynchronously, even if the app calls #SubmitFrame() too late, the compositor will kick off for each vsync.
        """
    )
    int(
        "CompositorDroppedFrameCount",
        """
        increments each time the SDK compositor fails to complete in time.

        This is not tied to the app's performance, but failure to complete can be related to other factors such as OS capabilities, overall available hardware
        cycles to execute the compositor in time and other factors outside of the app's control.
        """
    )
    float(
        "CompositorLatency",
        """
        motion-to-photon latency of the SDK compositor in seconds.

        This is the latency of timewarp which corrects the higher app latency as well as dropped app frames.
        """
    )
    float(
        "CompositorCpuElapsedTime",
        """
        the amount of time in seconds spent on the CPU by the SDK compositor.

        Unless the VR app is utilizing all of the CPU cores at their peak performance, there is a good chance the compositor CPU times will not affect the
        app's CPU performance in a major way.
        """
    )
    float(
        "CompositorGpuElapsedTime",
        """
        the amount of time in seconds spent on the GPU by the SDK compositor. Any time spent on the compositor will eat away from the available GPU time for
        the app.
        """
    )
    float(
        "CompositorCpuStartToGpuEndElapsedTime",
        """
        the amount of time in seconds spent from the point the CPU kicks off the compositor to the point in time the compositor completes the distortion &amp;
        timewarp on the GPU.

        In the event the GPU time is not available, expect this value to be -1.0f.
        """
    )
    float(
        "CompositorGpuEndToVsyncElapsedTime",
        """
        the amount of time in seconds left after the compositor is done on the GPU to the associated V-Sync time.

        In the event the GPU time is not available, expect this value to be -1.0f.
        """
    )

    ///
    /// Async Spacewarp stats (ASW)
    ///

    ovrBool(
        "AswIsActive",
        """
        Will be true if ASW is active for the given frame such that the application is being forced into  half the frame-rate while the compositor continues to
        run at full frame-rate.
        """
    )
    int("AswActivatedToggleCount", "Increments each time ASW it activated where the app was forced in and out of half-rate rendering.")
    int("AswPresentedFrameCount", "Accumulates the number of frames presented by the compositor which had extrapolated ASW frames presented")
    int("AswFailedFrameCount", "Accumulates the number of frames that the compositor tried to present when ASW is active but failed")
}

val ovrPerfStats = struct(Module.OVR, "OVRPerfStats", nativeName = "ovrPerfStats", mutable = false) {
    javaImport("static org.lwjgl.ovr.OVR.ovrMaxProvidedFrameStats")

    documentation = "This is a complete descriptor of the performance stats provided by the SDK."

    ovrPerfStatsPerCompositorFrame(
        "FrameStats",
        """
        an array of performance stats.

        The performance entries will be ordered in reverse chronological order such that the first entry will be the most recent one.
        """
    )["ovrMaxProvidedFrameStats"]
    AutoSize("FrameStats")..int(
        "FrameStatsCount",
        """
        will have a maximum value set by #MaxProvidedFrameStats.

        If the application calls #GetPerfStats() at the native refresh rate of the HMD then {@code FrameStatsCount} will be 1. If the app's workload happens to
        force #GetPerfStats() to be called at a lower rate, then {@code FrameStatsCount} will be 2 or more.

        If the app does not want to miss any performance data for any frame, it needs to ensure that it is calling #SubmitFrame() and #GetPerfStats() at a rate
        that is at least: {@code HMD_refresh_rate / ovrMaxProvidedFrameStats}. On the Oculus Rift CV1 HMD, this will be equal to 18 times per second.
        """
    )
    ovrBool(
        "AnyFrameStatsDropped",
        """
        If the app calls #SubmitFrame() at a rate less than 18 fps, then when calling #GetPerfStats(), expect {@code AnyFrameStatsDropped} to become #True
        while {@code FrameStatsCount} is equal to #MaxProvidedFrameStats.
        """
    )
    float(
        "AdaptiveGpuPerformanceScale",
        """
        an edge-filtered value that a caller can use to adjust the graphics quality of the application to keep the GPU utilization in check. The value is
        calculated as: {@code (desired_GPU_utilization / current_GPU_utilization)}

        As such, when this value is 1.0, the GPU is doing the right amount of work for the app. Lower values mean the app needs to pull back on the GPU
        utilization. If the app is going to directly drive render-target resolution using this value, then be sure to take the square-root of the value before
        scaling the resolution with it. Changing render target resolutions however is one of the many things an app can do increase or decrease the amount of
        GPU utilization. Since {@code AdaptiveGpuPerformanceScale} is edge-filtered and does not change rapidly (i.e. reports non-1.0 values once every couple
        of seconds) the app can make the necessary adjustments and then keep watching the value to see if it has been satisfied.
        """
    )
    ovrBool(
        "AswIsAvailable",
        """
        Will be true if Async Spacewarp (ASW) is available for this system which is dependent on several factors such as choice of GPU, OS and debug overrides.
        """
    )
    ovrProcessId(
        "VisibleProcessId",
        """
        Contains the Process ID of the VR application the stats are being polled for. If an app continues to grab perf stats even when it is not visible, then
        expect this value to point to the other VR app that has grabbed focus (i.e. became visible).
        """
    )
}

// OVR_CAPI_Util.h

val ovrHapticsGenMode = "ovrHapticsGenMode".enumType

val ovrDetectResult = struct(Module.OVR, "OVRDetectResult", nativeName = "ovrDetectResult", mutable = false) {
    documentation = "Return values for #_Detect()."

    ovrBool(
        "IsOculusServiceRunning",
        """
        is #False when the Oculus Service is not running. This means that the Oculus Service is either uninstalled or stopped.
        {@code IsOculusHMDConnected} will be #False in this case.

        is #True when the Oculus Service is running. This means that the Oculus Service is installed and running. {@code IsOculusHMDConnected} will
        reflect the state of the HMD.
        """
    )
    ovrBool(
        "IsOculusHMDConnected",
        """
        is #False when an Oculus HMD is not detected. If the Oculus Service is not running, this will be #False.

        is #True when an Oculus HMD is detected. This implies that the Oculus Service is also installed and running.
        """
    )
    padding(6)
}

val ovrAudioChannelData = struct(Module.OVR, "OVRAudioChannelData", nativeName = "ovrAudioChannelData", mutable = false) {
    documentation =
        """
        Store audio PCM data (as 32b float samples) for an audio channel.

        Note: needs to be released with #_ReleaseAudioChannelData() to avoid memory leak.
        """

    float.const.p("Samples", "samples stored as floats {@code [-1.0f, 1.0f]}")
    AutoSize("Samples")..int("SamplesCount", "number of samples")
    int("Frequency", "frequency (e.g. 44100)")
}

val ovrHapticsClip = struct(Module.OVR, "OVRHapticsClip", nativeName = "ovrHapticsClip", mutable = false) {
    documentation = "Store a full Haptics clip, which can be used as data source for multiple ##OVRHapticsBuffer."

    void.const.p("Samples", "samples stored in opaque format")
    int("SamplesCount", "number of samples")
}

fun config() {
    union(Module.OVR, "OVRLayerUnion", nativeName = "ovrLayer_Union") {
        documentation = "Union that combines {@code ovrLayer} types in a way that allows them to be used in a polymorphic way."

        ovrLayerHeader("Header", "the layer header")
        ovrLayerEyeFov("EyeFov", "")
        ovrLayerEyeFovDepth("EyeFovDepth", "")
        ovrLayerEyeMatrix("EyeMatrix", "")
        ovrLayerEyeFovMultires("Multires", "")
        ovrLayerCylinder("Cylinder", "")
        ovrLayerCube("Cube", "")
        ovrLayerQuad("Quad", "")
    }
}