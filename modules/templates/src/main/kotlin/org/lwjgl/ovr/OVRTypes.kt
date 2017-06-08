/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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

fun GeneratorTargetNative.includeOVRCAPI_VK() = nativeDirective(
    """DISABLE_WARNINGS()
#include "OVR_CAPI_Vk.h"
ENABLE_WARNINGS()""")

val OVR_PACKAGE = "org.lwjgl.ovr"
val OVR_LIBRARY = "LibOVR.initialize();"

val long_long = IntegerType("long long", PrimitiveMapping.LONG)

val ovrBool = IntegerType("ovrBool", PrimitiveMapping.BOOLEAN)
val ovrBool_p = ovrBool.p

val ovrResult = IntegerType("ovrResult", PrimitiveMapping.INT)

val ovrSession = "ovrSession".opaque_p
val ovrSession_p = ovrSession.p

val ovrHmdType = "ovrHmdType".enumType
val ovrEyeType = "ovrEyeType".enumType
val ovrLayerType = "ovrLayerType".enumType

val ovrProcessId = typedef(int32_t, "ovrProcessId")

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
    """
}

val ovrErrorInfo_p = struct(OVR_PACKAGE, "OVRErrorInfo", nativeName = "ovrErrorInfo", mutable = false) {
    documentation = "Provides information about the last error."

    ovrResult.member("Result", "the result from the last API call that generated an error {@code ovrResult}")
    charUTF8.array(
        "ErrorString",
        "a UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions",
        size = 512
    )
}.p

val ovrSessionStatus_p = struct(OVR_PACKAGE, "OVRSessionStatus", nativeName = "ovrSessionStatus", mutable = false) {
    documentation = "Specifies status information for the current session."

    ovrBool.member("IsVisible", "True if the process has VR focus and thus is visible in the HMD.")
    ovrBool.member("HmdPresent", "True if an HMD is present.")
    ovrBool.member("HmdMounted", "True if the HMD is on the user's head.")
    ovrBool.member("DisplayLost", "True if the session is in a display-lost state. See #SubmitFrame().")
    ovrBool.member("ShouldQuit", "True if the application should initiate shutdown.    ")
    ovrBool.member(
        "ShouldRecenter",
        "True if UX has requested re-centering. Must call #ClearShouldRecenterFlag(), #RecenterTrackingOrigin() or #SpecifyTrackingOrigin()."
    )
}.p

val ovrInitParams_p = struct(OVR_PACKAGE, "OVRInitParams", nativeName = "ovrInitParams") {
    documentation = "Parameters for #Initialize()."

    uint32_t.member("Flags", "flags from {@code ovrInitFlags} to override default behavior. Use 0 for the defaults.")
    uint32_t.member(
        "RequestedMinorVersion",
        """
        requests a specific minor version of the LibOVR runtime. Flags must include #Init_RequestVersion or this will be ignored and #MINOR_VERSION will
        be used. If you are directly calling the LibOVRRT version of #Initialize() in the LibOVRRT DLL then this must be valid and include
        #Init_RequestVersion.
        """
    )
    nullable..ovrLogCallback.member(
        "LogCallback",
        """
        user-supplied log callback function, which may be called at any time asynchronously from multiple threads until #Shutdown() completes. Use #NULL
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
}.p

val ovrColorf = struct(OVR_PACKAGE, "OVRColorf", nativeName = "ovrColorf") {
    documentation = "An RGBA color with normalized float components."

    float.member("r", "the R component")
    float.member("g", "the G component")
    float.member("b", "the B component")
    float.member("a", "the A component")
}

val ovrVector2i = struct(OVR_PACKAGE, "OVRVector2i", nativeName = "ovrVector2i") {
    documentation = "A 2D vector with integer components."

    int.member("x", "the vector x component")
    int.member("y", "the vector y component")
}

val ovrSizei = struct(OVR_PACKAGE, "OVRSizei", nativeName = "ovrSizei") {
    documentation = "A 2D size with integer components."

    int.member("w", "the width")
    int.member("h", "the height")
}

val ovrRecti = struct(OVR_PACKAGE, "OVRRecti", nativeName = "ovrRecti") {
    documentation = "A 2D rectangle with a position and size. All components are integers."

    ovrVector2i.member("Pos", "the rectangle position")
    ovrSizei.member("Size", "the rectangle size")
}

val ovrQuatf = struct(OVR_PACKAGE, "OVRQuatf", nativeName = "ovrQuatf") {
    documentation = "A quaternion rotation."

    float.member("x", "the vector x component")
    float.member("y", "the vector y component")
    float.member("z", "the vector z component")
    float.member("w", "the vector w component")
}

val ovrVector2f = struct(OVR_PACKAGE, "OVRVector2f", nativeName = "ovrVector2f") {
    documentation = "A 2D vector with float components."

    float.member("x", "the vector x component")
    float.member("y", "the vector y component")
}

val ovrVector3f = struct(OVR_PACKAGE, "OVRVector3f", nativeName = "ovrVector3f") {
    documentation = "A 3D vector with float components."

    float.member("x", "the vector x component")
    float.member("y", "the vector y component")
    float.member("z", "the vector z component")
}
val ovrVector3f_p = ovrVector3f.p

val ovrMatrix4f = struct(OVR_PACKAGE, "OVRMatrix4f", nativeName = "ovrMatrix4f") {
    documentation = "A 4x4 matrix with float components."

    float.array("M", "the matrix components", 16)
}

val ovrPosef = struct(OVR_PACKAGE, "OVRPosef", nativeName = "ovrPosef") {
    documentation = "Position and orientation together."

    ovrQuatf.member("Orientation", "the pose orientation")
    ovrVector3f.member("Position", "the pose position")
}
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
    padding(4)
    double.member("TimeInSeconds", "absolute time that this pose refers to. See #GetTimeInSeconds()")
}

val ovrFovPort = struct(OVR_PACKAGE, "OVRFovPort", nativeName = "ovrFovPort") {
    documentation =
        """
        Field Of View (FOV) in tangent of the angle units. As an example, for a standard 90 degree vertical FOV, we would have:
        ${codeBlock("{ UpTan = tan(90 degrees / 2), DownTan = tan(90 degrees / 2) }")}
        """

    float.member("UpTan", "tangent of the angle between the viewing vector and top edge of the FOV")
    float.member("DownTan", "tangent of the angle between the viewing vector and bottom edge of the FOV")
    float.member("LeftTan", "tangent of the angle between the viewing vector and left edge of the FOV")
    float.member("RightTan", "tangent of the angle between the viewing vector and right edge of the FOV")
}

val ovrTrackingOrigin = "ovrTrackingOrigin".enumType

val ovrGraphicsLuid = struct(OVR_PACKAGE, "OVRGraphicsLuid", nativeName = "ovrGraphicsLuid", mutable = false) {
    documentation =
        """
        Identifies a graphics device in a platform-specific way.

        For Windows this is a LUID type.
        """

    char.array("Reserved", "public definition reserves space for graphics API-specific implementation.", size = 8)
}

val ovrHmdDesc = struct(OVR_PACKAGE, "OVRHmdDesc", nativeName = "ovrHmdDesc", mutable = false) {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")
    documentation = "A complete descriptor of the HMD."

    ovrHmdType.member("Type", "this HMD's type").links("Hmd_\\w+")
    padding(4, "Pointer.BITS64")
    charUTF8.array("ProductName", "name string describing the product: \"Oculus Rift DK1\", etc.", size = 64)
    charUTF8.array("Manufacturer", "string describing the manufacturer. Usually \"Oculus\".", size = 64)
    short.member("VendorId", "HID Vendor ID of the device")
    short.member("ProductId", "HID Product ID of the device")
    charASCII.array("SerialNumber", "HMD serial number", size = 24)
    short.member("FirmwareMajor", "HMD firmware major version number")
    short.member("FirmwareMinor", "HMD firmware minor version number")

    unsigned_int.member("AvailableHmdCaps", "available {@code ovrHmdCaps} bits")
    unsigned_int.member("DefaultHmdCaps", "default {@code ovrHmdCaps} bits")
    unsigned_int.member("AvailableTrackingCaps", "available {@code ovrTrackingCaps} bits")
    unsigned_int.member("DefaultTrackingCaps", "default {@code ovrTrackingCaps} bits")

    ovrFovPort.array("DefaultEyeFov", "the recommended optical FOV for the HMD", size = "ovrEye_Count")
    ovrFovPort.array("MaxEyeFov", "the maximum optical FOV for the HMD", size = "ovrEye_Count")

    ovrSizei.member("Resolution", "resolution of the full HMD screen (both eyes) in pixels")
    float.member("DisplayRefreshRate", "refresh rate of the display in cycles per second at the time of HMD creation")
    padding(4, "Pointer.BITS64")
}

val ovrTrackerDesc = struct(OVR_PACKAGE, "OVRTrackerDesc", nativeName = "ovrTrackerDesc", mutable = false) {
    documentation = "Specifies the description of a single sensor."

    float.member("FrustumHFovInRadians", "sensor frustum horizontal field-of-view (if present).")
    float.member("FrustumVFovInRadians", "sensor frustum vertical field-of-view (if present).")
    float.member("FrustumNearZInMeters", "sensor frustum near Z (if present).")
    float.member("FrustumFarZInMeters", "sensor frustum far Z (if present).")
}

val ovrTrackerPose = struct(OVR_PACKAGE, "OVRTrackerPose", nativeName = "ovrTrackerPose", mutable = false) {
    documentation = "Specifies the pose for a single sensor."

    unsigned_int.member("TrackerFlags", "{@code ovrTrackerFlags}.")
    ovrPosef.member("Pose", "the sensor's pose. This pose includes sensor tilt (roll and pitch). For a leveled coordinate system use {@code LeveledPose}.")
    ovrPosef.member(
        "LeveledPose",
        """t
        the sensor's leveled pose, aligned with gravity. This value includes pos and yaw of the sensor, but not roll and pitch. It can be used as a
        reference point to render real-world objects in the correct location.
        """
    )
    padding(4)
}

val ovrTrackingState = struct(OVR_PACKAGE, "OVRTrackingState", nativeName = "ovrTrackingState", mutable = false) {
    documentation = "Tracking state at a given absolute time (describes predicted HMD pose etc). Returned by #GetTrackingState()."

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
        "{@code HandPoses} status flags described by {@code ovrStatusBits}. Only #Status_OrientationTracked and #Status_PositionTracked are reported.",
        size = 2
    )


    ovrPosef.member(
        "CalibratedOrigin",
        """
        the pose of the origin captured during calibration.

        Like all other poses here, this is expressed in the space set by #RecenterTrackingOrigin(), or #SpecifyTrackingOrigin() and so will change every time
        either of those functions are called. This pose can be used to calculate where the calibrated origin lands in the new recentered space. If an
        application never calls #RecenterTrackingOrigin() or #SpecifyTrackingOrigin(), expect this value to be the identity pose and as such will point
        respective origin based on {@code ovrTrackingOrigin} requested when calling #GetTrackingState().
        """)
}

val ovrEyeRenderDesc = struct(OVR_PACKAGE, "OVREyeRenderDesc", nativeName = "ovrEyeRenderDesc", mutable = false) {
    documentation =
        """
        rendering information for each eye. Computed by either #GetRenderDesc() based on the specified FOV. Note that the rendering viewport is not
        included here as it can be specified separately and modified per frame by passing different viewport values in the layer structure.
        """

    ovrEyeType.member("Eye", "the eye index this instance corresponds to").links("Eye_(?!Count)\\w+")
    ovrFovPort.member("Fov", "the field of view")
    ovrRecti.member("DistortedViewport", "distortion viewport")
    ovrVector2f.member("PixelsPerTanAngleAtCenter", "wow many display pixels will fit in tan(angle) = 1")
    ovrVector3f.member("HmdToEyeOffset", "translation of each eye, in meters.")
}

val ovrTimewarpProjectionDesc = struct(OVR_PACKAGE, "OVRTimewarpProjectionDesc", nativeName = "ovrTimewarpProjectionDesc", mutable = false) {
    documentation =
        """
        Projection information for ##OVRLayerEyeFovDepth.

        Use the utility function #TimewarpProjectionDesc_FromProjection() to generate this structure from the application's projection matrix.
        """

    float.member("Projection22", "projection matrix element [2][2]")
    float.member("Projection23", "projection matrix element [2][3]")
    float.member("Projection32", "projection matrix element [3][2]")
}

val ovrViewScaleDesc_p = struct(OVR_PACKAGE, "OVRViewScaleDesc", nativeName = "ovrViewScaleDesc") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")
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

    ovrVector3f.array("HmdToEyeOffset", "translation of each eye", size = "ovrEye_Count")
    float.member("HmdSpaceToWorldScaleInMeters", "ratio of viewer units to meter units")
}.p

val ovrTextureType = "ovrTextureType".enumType
val ovrTextureFormat = "ovrTextureFormat".enumType

val ovrTextureSwapChainDesc_p = struct(OVR_PACKAGE, "OVRTextureSwapChainDesc", nativeName = "ovrTextureSwapChainDesc") {
    documentation = "Description used to create a texture swap chain."

    ovrTextureType.member("Type", "").links("Texture_\\w+")
    ovrTextureFormat.member("Format", "").links("OVR_FORMAT_\\w+")
    int.member("ArraySize", "only supported with #Texture_2D. Not supported on PC at this time.")
    int.member("Width", "")
    int.member("Height", "")
    int.member("MipLevels", "")
    int.member("SampleCount", "current only supported on depth textures")
    ovrBool.member("StaticImage", "not buffered in a chain. For images that don't change")
    unsigned_int.member("MiscFlags", "{@code ovrTextureFlags}").links("TextureMisc_\\w+", LinkMode.BITFIELD)
    unsigned_int.member("BindFlags", "{@code ovrTextureBindFlags}. Not used for GL.").links("TextureBind_\\w+", LinkMode.BITFIELD)
}.p

val ovrMirrorTextureDesc_p = struct(OVR_PACKAGE, "OVRMirrorTextureDesc", nativeName = "ovrMirrorTextureDesc") {
    documentation = "Description used to create a mirror texture."

    ovrTextureFormat.member("Format", "").links("OVR_FORMAT_\\w+")
    int.member("Width", "")
    int.member("Height", "")
    unsigned_int.member("MiscFlags", "{@code ovrTextureFlags}").links("TextureMisc_\\w+", LinkMode.BITFIELD)
}.p

val ovrTextureSwapChain = "ovrTextureSwapChain".opaque_p
val ovrTextureSwapChain_p = ovrTextureSwapChain.p

val ovrMirrorTexture = "ovrMirrorTexture".opaque_p
val ovrMirrorTexture_p = ovrMirrorTexture.p

val ovrTouchHapticsDesc = struct(OVR_PACKAGE, "OVRTouchHapticsDesc", nativeName = "ovrTouchHapticsDesc", mutable = false) {
    documentation = "Describes the Touch Haptics engine."

    int.member("SampleRateHz", "Haptics engine frequency/sample-rate, sample time in seconds equals {@code 1.0/sampleRateHz}")
    int.member("SampleSizeInBytes", "Size of each Haptics sample, sample value range is {@code [0, 2^(Bytes*8)-1]}")

    int.member(
        "QueueMinSizeToAvoidStarvation",
        "Queue size that would guarantee Haptics engine would not starve for data. Make sure size doesn't drop below it for best results."
    )

    int.member("SubmitMinSamples", "Minimum number of samples that can be sent to Haptics through #SubmitControllerVibration()")
    int.member("SubmitMaxSamples", "Maximum number of samples that can be sent to Haptics through #SubmitControllerVibration()")
    int.member("SubmitOptimalSamples", "Optimal number of samples that can be sent to Haptics through #SubmitControllerVibration()")
}

val ovrHapticsBufferSubmitMode = "ovrHapticsBufferSubmitMode".enumType

val ovrHapticsBuffer_p = struct(OVR_PACKAGE, "OVRHapticsBuffer", nativeName = "ovrHapticsBuffer") {
    documentation = "Haptics buffer descriptor, contains amplitude samples used for Touch vibration."

    void_p.member("Samples", "samples stored in opaque format")
    int.member("SamplesCount", "sumber of samples")
    ovrHapticsBufferSubmitMode.member("SubmitMode", "how samples are submitted to the hardware").links("HapticsBufferSubmit_\\w+")
}.p

val ovrHapticsPlaybackState_p = struct(OVR_PACKAGE, "OVRHapticsPlaybackState", nativeName = "ovrHapticsPlaybackState", mutable = false) {
    documentation = "State of the Haptics playback for Touch vibration."

    int.member("RemainingQueueSpace", "Remaining space available to queue more samples")
    int.member("SamplesQueued", "Number of samples currently queued")
}.p

val ovrControllerType = "ovrControllerType".enumType

val ovrTrackedDeviceType = "ovrTrackedDeviceType".enumType
val ovrBoundaryType = "ovrBoundaryType".enumType

val ovrBoundaryLookAndFeel_p = struct(OVR_PACKAGE, "OVRBoundaryLookAndFeel", nativeName = "ovrBoundaryLookAndFeel") {
    documentation = "Boundary system look and feel."

    ovrColorf.member("Color", "Boundary color (alpha channel is ignored)")
}.p

val ovrBoundaryTestResult_p = struct(OVR_PACKAGE, "OVRBoundaryTestResult", nativeName = "ovrBoundaryTestResult", mutable = false) {
    documentation = "Provides boundary test information."

    ovrBool.member(
        "IsTriggering",
        "True if the boundary system is being triggered. Note that due to fade in/out effects this may not exactly match visibility."
    )
    float.member("ClosestDistance", "Distance to the closest play area or outer boundary surface")
    ovrVector3f.member("ClosestPoint", "Closest point on the boundary surface")
    ovrVector3f.member("ClosestPointNormal", "Unit surface normal of the closest boundary surface")
}.p

val ovrInputState_p = struct(OVR_PACKAGE, "OVRInputState", nativeName = "ovrInputState", mutable = false) {
    javaImport("static org.lwjgl.ovr.OVR.ovrHand_Count")
    documentation =
        """
        Describes the complete controller input state, including Oculus Touch, and XBox gamepad. If multiple inputs are connected and used at the same time,
        their inputs are combined.
        """

    double.member("TimeInSeconds", "system type when the controller state was last updated")
    unsigned_int.member("Buttons", "values for buttons described by {@code ovrButton}")
    unsigned_int.member("Touches", "touch values for buttons and sensors as described by {@code ovrTouch}.")
    float.array(
        "IndexTrigger",
        "left and right finger trigger values (#Hand_Left and #Hand_Right), in the range 0.0 to 1.0f.",
        size = "ovrHand_Count"
    )
    float.array(
        "HandTrigger",
        "left and right hand trigger values (#Hand_Left and #Hand_Right), in the range 0.0 to 1.0f.",
        size = "ovrHand_Count"
    )
    ovrVector2f.array(
        "Thumbstick",
        "horizontal and vertical thumbstick axis values (#Hand_Left and #Hand_Right), in the range -1.0f to 1.0f.",
        size = "ovrHand_Count"
    )
    ovrControllerType.member("ControllerType", "The type of the controller this state is for.").links("ControllerType_\\w+")

    float.array(
        "IndexTriggerNoDeadzone",
        "Left and right finger trigger values (#Hand_Left and #Hand_Right), in range 0.0 to 1.0f. Does not apply a deadzone. Only touch applies a filter.",
        size = "ovrHand_Count"
    )
    float.array(
        "HandTriggerNoDeadzone",
        "Left and right hand trigger values (#Hand_Left and #Hand_Right), in the range 0.0 to 1.0f. Does not apply a deadzone. Only touch applies a filter.",
        size = "ovrHand_Count"
    )
    ovrVector2f.array(
        "ThumbstickNoDeadzone",
        "Horizontal and vertical thumbstick axis values (#Hand_Left and #Hand_Right), in the range -1.0f to 1.0f. Does not apply a deadzone or filter.",
        size = "ovrHand_Count"
    )

    float.array(
        "IndexTriggerRaw",
        "Left and right finger trigger values (#Hand_Left and #Hand_Right), in range 0.0 to 1.0f. No deadzone or filter.",
        size = "ovrHand_Count"
    )

    float.array(
        "HandTriggerRaw",
        "Left and right hand trigger values (#Hand_Left and #Hand_Right), in the range 0.0 to 1.0f. No deadzone or filter.",
        size = "ovrHand_Count"
    )

    ovrVector2f.array(
        "ThumbstickRaw",
        "Horizontal and vertical thumbstick axis values (#Hand_Left and #Hand_Right), in range -1.0f to 1.0f. No deadzone or filter.",
        size = "ovrHand_Count"
    )
}.p

val ovrCameraIntrinsics = struct(OVR_PACKAGE, "OVRCameraIntrinsics", nativeName = "ovrCameraIntrinsics") {
    double.member("LastChangedTime", "time in seconds from last change to the parameters")
    ovrFovPort.member("FOVPort", "angles of all 4 sides of viewport")
    float.member("VirtualNearPlaneDistanceMeters", "near plane of the virtual camera used to match the external camera")
    float.member("VirtualFarPlaneDistanceMeters", "far plane of the virtual camera used to match the external camera")
    ovrSizei.member("ImageSensorPixelResolution", "height in pixels of image sensor")
    ovrMatrix4f.member("LensDistortionMatrix", "the lens distortion matrix of camera")
    double.member("ExposurePeriodSeconds", "how often, in seconds, the exposure is taken")
    double.member("ExposureDurationSeconds", "length of the exposure time")
}

val ovrCameraExtrinsics = struct(OVR_PACKAGE, "OVRCameraExtrinsics", nativeName = "ovrCameraExtrinsics") {
    double.member(
        "LastChangedTimeSeconds",
        "time in seconds from last change to the parameters. For instance, if the pose changes, or a camera exposure happens, this struct will be updated."
    )
    unsigned_int.member("CameraStatusFlags", "current Status of the camera, a mix of bits from {@code ovrCameraStatusFlags}")
    ovrTrackedDeviceType.member(
        "AttachedToDevice",
        """
        which Tracked device, if any, is the camera rigidly attached to. If set to #TrackedDevice_None, then the camera is not attached to a tracked object. If
        the external camera moves while unattached (i.e. set to {@code ovrTrackedDevice_None}), its {@code Pose} won't be updated.
        """
    )
    ovrPosef.member(
        "RelativePose",
        "the relative Pose of the External Camera. If {@code AttachedToDevice} is #TrackedDevice_None, then this is a absolute pose in tracking space."
    )
    double.member("LastExposureTimeSeconds", "the time, in seconds, when the last successful exposure was taken")
    double.member("ExposureLatencySeconds", "estimated exposure latency to get from the exposure time to the system")
    double.member(
        "AdditionalLatencySeconds",
        "additional latency to get from the exposure time of the real camera to match the render time of the virtual camera"
    )
}

val OVR_EXTERNAL_CAMERA_NAME_SIZE = 32
val ovrExternalCamera_p = struct(OVR_PACKAGE, "OVRExternalCamera", nativeName = "ovrExternalCamera", mutable = false) {
    charASCII.array("Name", "", size = OVR_EXTERNAL_CAMERA_NAME_SIZE)
    ovrCameraIntrinsics.member("Intrinsics", "")
    ovrCameraExtrinsics.member("Extrinsics", "")
}.p

val ovrLayerHeader = struct(OVR_PACKAGE, "OVRLayerHeader", nativeName = "ovrLayerHeader") {
    documentation =
        """
        Defines properties shared by all ovrLayer structs, such as ##OVRLayerEyeFov.

        {@code ovrLayerHeader} is used as a base member in these larger structs. This struct cannot be used by itself except for the case that {@code Type} is
        #LayerType_Disabled.
        """

    ovrLayerType.member("Type", "described by {@code ovrLayerType}").links("LayerType_\\w+")
    unsigned_int.member("Flags", "described by {@code ovrLayerFlags}")
}

val ovrLayerEyeFov = struct(OVR_PACKAGE, "OVRLayerEyeFov", nativeName = "ovrLayerEyeFov") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")
    documentation =
        """
        Describes a layer that specifies a monoscopic or stereoscopic view. This is the kind of layer that's typically used as layer 0 to
        #SubmitFrame(), as it is the kind of layer used to render a 3D stereoscopic view.
        """

    ovrLayerHeader.member("Header", "{@code Header.Type} must be #LayerType_EyeFov.")
    ovrTextureSwapChain.array(
        "ColorTexture",
        "{@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be #NULL.",
        size = "ovrEye_Count",
        validSize = "1"
    )
    ovrRecti.array(
        "Viewport",
        "specifies the ColorTexture sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.",
        size = "ovrEye_Count"
    )
    ovrFovPort.array("Fov", "the viewport field of view", size = "ovrEye_Count")
    ovrPosef.array(
        "RenderPose",
        """
        specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned from
        #_CalcEyePoses(), but can be different in special cases if a different head pose is used for rendering.
        """,
        size = "ovrEye_Count"
    )
    double.member(
        "SensorSampleTime",
        """
        specifies the timestamp when the source ##OVRPosef (used in calculating RenderPose) was sampled from the SDK. Typically retrieved by calling
        #GetTimeInSeconds() around the instant the application calls #GetTrackingState(). The main purpose for this is to accurately track app
        tracking latency.
        """
    )
}

val ovrLayerQuad = struct(OVR_PACKAGE, "OVRLayerQuad", nativeName = "ovrLayerQuad") {
    documentation =
        """
        Describes a layer of Quad type, which is a single quad in world or viewer space. It is used for both #LayerType_Quad. This type of layer
        represents a single object placed in the world and not a stereo view of the world itself.

        A typical use of #LayerType_Quad is to draw a television screen in a room that for some reason is more convenient to draw as a layer than
        as part of the main view in layer 0. For example, it could implement a 3D popup GUI that is drawn at a higher resolution than layer 0 to improve
        fidelity of the GUI.

        Quad layers are visible from both sides; they are not back-face culled.
        """

    ovrLayerHeader.member("Header", "{@code Header.Type} must be #LayerType_Quad")
    ovrTextureSwapChain.member("ColorTexture", "contains a single image, never with any stereo view")
    ovrRecti.member("Viewport", "specifies the ColorTexture sub-rect UV coordinates")
    ovrPosef.member(
        "QuadPoseCenter",
        """
        specifies the orientation and position of the center point of a Quad layer type.

        The supplied direction is the vector perpendicular to the quad. The position is in real-world meters (not the application's virtual world, the physical
        world the user is in) and is relative to the "zero" position set by #RecenterTrackingOrigin() unless the #LayerFlag_HeadLocked flag is
        used.
        """
    )
    ovrVector2f.member("QuadSize", "width and height (respectively) of the quad in meters")
}

val ovrPerfStatsPerCompositorFrame = struct(OVR_PACKAGE, "OVRPerfStatsPerCompositorFrame", nativeName = "ovrPerfStatsPerCompositorFrame", mutable = false) {
    documentation =
        """
        Contains the performance stats for a given SDK compositor frame.

        All of the int fields can be reset via the #ResetPerfStats() call.
        """

    int.member(
        "HmdVsyncIndex",
        """
        Vsync Frame Index - increments with each HMD vertical synchronization signal (i.e. vsync or refresh rate).

        If the compositor drops a frame, expect this value to increment more than 1 at a time.
        """
    )

    ///
    /// Application stats
    ///

    int.member("AppFrameIndex", "index that increments with each successive #SubmitFrame() call")
    int.member("AppDroppedFrameCount", "if the app fails to call #SubmitFrame() on time, then expect this value to increment with each missed frame")
    float.member(
        "AppMotionToPhotonLatency",
        """
        motion-to-photon latency for the application

        This value is calculated by either using the {@code SensorSampleTime} provided for the ##OVRLayerEyeFov or if that is not available, then the call to
        #GetTrackingState() which has {@code latencyMarker} set to #True.
        """
    )
    float.member(
        "AppQueueAheadTime",
        """
        amount of queue-ahead in seconds provided to the app based on performance and overlap of CPU and GPU utilization.

        A value of 0.0 would mean the CPU & GPU workload is being completed in 1 frame's worth of time, while 11 ms (on the CV1) of queue ahead would indicate
        that the app's CPU workload for the next frame is overlapping the app's GPU workload for the current frame.
        """
    )
    float.member(
        "AppCpuElapsedTime",
        """
        amount of time in seconds spent on the CPU by the app's render-thread that calls #SubmitFrame().

        Measured as elapsed time between from when app regains control from #SubmitFrame() to the next time the app calls #SubmitFrame().
        """
    )
    float.member(
        "AppGpuElapsedTime",
        """
        amount of time in seconds spent on the GPU by the app.

        Measured as elapsed time between each #SubmitFrame() call using GPU timing queries.
        """
    )

    ///
    /// SDK Compositor stats
    ///

    int.member(
        "CompositorFrameIndex",
        """
        index that increments each time the SDK compositor completes a distortion and timewarp pass.

        Since the compositor operates asynchronously, even if the app calls #SubmitFrame() too late, the compositor will kick off for each vsync.
        """
    )
    int.member(
        "CompositorDroppedFrameCount",
        """
        increments each time the SDK compositor fails to complete in time.

        This is not tied to the app's performance, but failure to complete can be related to other factors such as OS capabilities, overall available hardware
        cycles to execute the compositor in time and other factors outside of the app's control.
        """
    )
    float.member(
        "CompositorLatency",
        """
        motion-to-photon latency of the SDK compositor in seconds.

        This is the latency of timewarp which corrects the higher app latency as well as dropped app frames.
        """
    )
    float.member(
        "CompositorCpuElapsedTime",
        """
        the amount of time in seconds spent on the CPU by the SDK compositor.

        Unless the VR app is utilizing all of the CPU cores at their peak performance, there is a good chance the compositor CPU times will not affect the
        app's CPU performance in a major way.
        """
    )
    float.member(
        "CompositorGpuElapsedTime",
        """
        the amount of time in seconds spent on the GPU by the SDK compositor. Any time spent on the compositor will eat away from the available GPU time for
        the app.
        """
    )
    float.member(
        "CompositorCpuStartToGpuEndElapsedTime",
        """
        the amount of time in seconds spent from the point the CPU kicks off the compositor to the point in time the compositor completes the distortion &amp;
        timewarp on the GPU.

        In the event the GPU time is not available, expect this value to be -1.0f.
        """
    )
    float.member(
        "CompositorGpuEndToVsyncElapsedTime",
        """
        the amount of time in seconds left after the compositor is done on the GPU to the associated V-Sync time.

        In the event the GPU time is not available, expect this value to be -1.0f.
        """
    )

    ///
    /// Async Spacewarp stats (ASW)
    ///

    ovrBool.member(
        "AswIsActive",
        """
        Will be true if ASW is active for the given frame such that the application is being forced into  half the frame-rate while the compositor continues to
        run at full frame-rate.
        """
    )
    int.member("AswActivatedToggleCount", "Increments each time ASW it activated where the app was forced in and out of half-rate rendering.")
    int.member("AswPresentedFrameCount", "Accumulates the number of frames presented by the compositor which had extrapolated ASW frames presented")
    int.member("AswFailedFrameCount", "Accumulates the number of frames that the compositor tried to present when ASW is active but failed")
}

val ovrPerfStats_p = struct(OVR_PACKAGE, "OVRPerfStats", nativeName = "ovrPerfStats", mutable = false) {
    javaImport("static org.lwjgl.ovr.OVR.ovrMaxProvidedFrameStats")

    documentation = "This is a complete descriptor of the performance stats provided by the SDK."

    ovrPerfStatsPerCompositorFrame.array(
        "FrameStats",
        """
        an array of performance stats.

        The performance entries will be ordered in reverse chronological order such that the first entry will be the most recent one.
        """,
        size = "ovrMaxProvidedFrameStats"
    )
    AutoSize("FrameStats")..int.member(
        "FrameStatsCount",
        """
        will have a maximum value set by #MaxProvidedFrameStats.

        If the application calls #GetPerfStats() at the native refresh rate of the HMD then {@code FrameStatsCount} will be 1. If the app's workload happens to
        force #GetPerfStats() to be called at a lower rate, then {@code FrameStatsCount} will be 2 or more.

        If the app does not want to miss any performance data for any frame, it needs to ensure that it is calling #SubmitFrame() and #GetPerfStats() at a rate
        that is at least: {@code HMD_refresh_rate / ovrMaxProvidedFrameStats}. On the Oculus Rift CV1 HMD, this will be equal to 18 times per second.
        """
    )
    ovrBool.member(
        "AnyFrameStatsDropped",
        """
        If the app calls #SubmitFrame() at a rate less than 18 fps, then when calling #GetPerfStats(), expect {@code AnyFrameStatsDropped} to become #True
        while {@code FrameStatsCount} is equal to #MaxProvidedFrameStats.
        """
    )
    float.member(
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
    ovrBool.member(
        "AswIsAvailable",
        """
        Will be true if Async Spacewarp (ASW) is available for this system which is dependent on several factors such as choice of GPU, OS and debug overrides.
        """
    )
    ovrProcessId.member(
        "VisibleProcessId",
        """
        Contains the Process ID of the VR application the stats are being polled for. If an app continues to grab perf stats even when it is not visible, then
        expect this value to point to the other VR app that has grabbed focus (i.e. became visible).
        """
    )
}.p

// OVR_CAPI_Util.h

val ovrHapticsGenMode = "ovrHapticsGenMode".enumType

val ovrDetectResult = struct(OVR_PACKAGE, "OVRDetectResult", nativeName = "ovrDetectResult", mutable = false) {
    documentation = "Return values for OVRUtil#Detect()"

    ovrBool.member(
        "IsOculusServiceRunning",
        """
        is #False when the Oculus Service is not running. This means that the Oculus Service is either uninstalled or stopped.
        {@code IsOculusHMDConnected} will be #False in this case.

        is #True when the Oculus Service is running. This means that the Oculus Service is installed and running. {@code IsOculusHMDConnected} will
        reflect the state of the HMD.
        """
    )
    ovrBool.member(
        "IsOculusHMDConnected",
        """
        is #False when an Oculus HMD is not detected. If the Oculus Service is not running, this will be #False.

        is #True when an Oculus HMD is detected. This implies that the Oculus Service is also installed and running.
        """
    )
    padding(6)
}

val ovrAudioChannelData_p = struct(OVR_PACKAGE, "OVRAudioChannelData", nativeName = "ovrAudioChannelData", mutable = false) {
    documentation =
        """
        Store audio PCM data (as 32b float samples) for an audio channel.

        Note: needs to be released with #_ReleaseAudioChannelData() to avoid memory leak.
        """

    const..float_p.member("Samples", "samples stored as floats {@code [-1.0f, 1.0f]}")
    AutoSize("Samples")..int.member("SamplesCount", "number of samples")
    int.member("Frequency", "frequency (e.g. 44100)")
}.p

val ovrHapticsClip_p = struct(OVR_PACKAGE, "OVRHapticsClip", nativeName = "ovrHapticsClip", mutable = false) {
    documentation = "Store a full Haptics clip, which can be used as data source for multiple ##OVRHapticsBuffer."

    const..void_p.member("Samples", "samples stored in opaque format")
    int.member("SamplesCount", "number of samples")
}.p

fun config() {
    packageInfo(
        OVR_PACKAGE,
        """
        Contains bindings to LibOVR, the ${url("https://developer.oculus.com/", "Oculus SDK")} library.

        Documentation on how to get started with the Oculus SDK can be found ${url("https://developer.oculus.com/documentation/", "here")}.
        """
    )

    Generator.registerLibraryInit(OVR_PACKAGE, "LibOVR", "ovr")

    struct(OVR_PACKAGE, "OVRLayerEyeMatrix", nativeName = "ovrLayerEyeMatrix") {
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

        ovrLayerHeader.member("Header", "must be #LayerType_EyeMatrix")
        ovrTextureSwapChain.array(
            "ColorTexture",
            "{@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be #NULL for cases described above.",
            size = "ovrEye_Count",
            validSize = "1"
        )
        ovrRecti.array(
            "Viewport",
            "specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.",
            size = "ovrEye_Count"
        )
        ovrPosef.array(
            "RenderPose",
            """
            specifies the position and orientation of each eye view, with the position specified in meters. {@code RenderPose} will typically be the value
            returned from #_CalcEyePoses(), but can be different in special cases if a different head pose is used for rendering.
            """,
            size = "ovrEye_Count"
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
            size = "ovrEye_Count"
        )
        double.member(
            "SensorSampleTime",
            """
            specifies the timestamp when the source {@code ovrPosef} (used in calculating {@code RenderPose}) was sampled from the SDK. Typically retrieved by
            calling #GetTimeInSeconds() around the instant the application calls #GetTrackingState() The main purpose for this is to accurately track app
            tracking latency.
            """
        )
    }

    union(OVR_PACKAGE, "OVRLayerUnion", nativeName = "ovrLayer_Union") {
        documentation = "Union that combines {@code ovrLayer} types in a way that allows them to be used in a polymorphic way."

        ovrLayerHeader.member("Header", "the layer header")
        ovrLayerEyeFov.member("EyeFov", "")
        ovrLayerQuad.member("Quad", "")
    }
}