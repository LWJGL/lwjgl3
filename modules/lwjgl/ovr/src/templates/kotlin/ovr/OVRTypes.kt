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

val ovrBool = PrimitiveType("ovrBool", PrimitiveMapping.BOOLEAN)
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

        uintptr_t("userData"),
        int("level"),
        NullTerminated..charUTF8.const.p("message"),

        nativeType = "ovrLogCallback"
    ) {
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
    ovrResult("Result")
    charUTF8("ErrorString")[512]
}

val ovrSessionStatus = struct(Module.OVR, "OVRSessionStatus", nativeName = "ovrSessionStatus", mutable = false) {
    ovrBool("IsVisible")
    ovrBool("HmdPresent")
    ovrBool("HmdMounted")
    ovrBool("DisplayLost")
    ovrBool("ShouldQuit")
    ovrBool("ShouldRecenter")
    ovrBool("HasInputFocus")
    ovrBool("OverlayPresent")
    ovrBool("DepthRequested")
}

val ovrInitParams = struct(Module.OVR, "OVRInitParams", nativeName = "ovrInitParams", skipBuffer = true) {
    uint32_t("Flags")
    uint32_t("RequestedMinorVersion")
    nullable..ovrLogCallback("LogCallback")
    uintptr_t("UserData")
    uint32_t("ConnectionTimeoutMS")
}

val ovrColorf = struct(Module.OVR, "OVRColorf", nativeName = "ovrColorf") {
    float("r")
    float("g")
    float("b")
    float("a")
}

val ovrVector2i = struct(Module.OVR, "OVRVector2i", nativeName = "ovrVector2i") {
    int("x")
    int("y")
}

val ovrSizei = struct(Module.OVR, "OVRSizei", nativeName = "ovrSizei") {
    int("w")
    int("h")
}

val ovrRecti = struct(Module.OVR, "OVRRecti", nativeName = "ovrRecti") {
    ovrVector2i("Pos")
    ovrSizei("Size")
}

val ovrQuatf = struct(Module.OVR, "OVRQuatf", nativeName = "ovrQuatf") {
    float("x")
    float("y")
    float("z")
    float("w")
}

val ovrVector2f = struct(Module.OVR, "OVRVector2f", nativeName = "ovrVector2f") {
    float("x")
    float("y")
}

val ovrVector3f = struct(Module.OVR, "OVRVector3f", nativeName = "ovrVector3f") {
    float("x")
    float("y")
    float("z")
}

/*val ovrVector4f = struct(Module.OVR, "OVRVector4f", nativeName = "ovrVector4f") {
    float("x")
    float("y")
    float("z")
    float("w")
}

val ovrVector4s = struct(Module.OVR, "OVRVector4s", nativeName = "ovrVector4s") {
    alignas(4)

    int16_t("x")
    int16_t("y")
    int16_t("z")
    int16_t("w")
}*/

val ovrMatrix4f = struct(Module.OVR, "OVRMatrix4f", nativeName = "ovrMatrix4f") {
    float("M")[16]
}

val ovrPosef = struct(Module.OVR, "OVRPosef", nativeName = "ovrPosef") {
    ovrQuatf("Orientation")
    ovrVector3f("Position")
}

val ovrPoseStatef = struct(Module.OVR, "OVRPoseStatef", nativeName = "ovrPoseStatef", mutable = false) {
    ovrPosef("ThePose")
    ovrVector3f("AngularVelocity")
    ovrVector3f("LinearVelocity")
    ovrVector3f("AngularAcceleration")
    ovrVector3f("LinearAcceleration")
    padding(4)
    double("TimeInSeconds")
}

val ovrFovPort = struct(Module.OVR, "OVRFovPort", nativeName = "ovrFovPort") {
    float("UpTan")
    float("DownTan")
    float("LeftTan")
    float("RightTan")
}

val ovrTrackingOrigin = "ovrTrackingOrigin".enumType

val ovrExtensionProperties = struct(Module.OVR, "OVRExtensionProperties", nativeName = "ovrExtensionProperties", mutable = false) {
    javaImport("static org.lwjgl.ovr.OVR.OVR_MAX_EXTENSION_NAME_SIZE")

    int("extensionId")
    charASCII("extensionName")["OVR_MAX_EXTENSION_NAME_SIZE"]
    uint32_t("extensionVersion")
}

val ovrHmdColorDesc = struct(Module.OVR, "ovrHmdColorDesc", nativeName = "ovrHmdColorDesc") {
    alignas("POINTER_SIZE")

    ovrColorSpace("ColorSpace")
    padding(4)
}

val ovrGraphicsLuid = struct(Module.OVR, "OVRGraphicsLuid", nativeName = "ovrGraphicsLuid", mutable = false) {
    alignas("POINTER_SIZE")

    char("Reserved")[8]
}

val ovrHmdDesc = struct(Module.OVR, "OVRHmdDesc", nativeName = "ovrHmdDesc", mutable = false, skipBuffer = true) {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")

    alignas("POINTER_SIZE")

    ovrHmdType("Type")
    padding(4, "Pointer.BITS64")
    charUTF8("ProductName")[64]
    charUTF8("Manufacturer")[64]
    short("VendorId")
    short("ProductId")
    charASCII("SerialNumber")[24]
    short("FirmwareMajor")
    short("FirmwareMinor")

    unsigned_int("AvailableHmdCaps")
    unsigned_int("DefaultHmdCaps")
    unsigned_int("AvailableTrackingCaps")
    unsigned_int("DefaultTrackingCaps")

    ovrFovPort("DefaultEyeFov")["ovrEye_Count"]
    ovrFovPort("MaxEyeFov")["ovrEye_Count"]

    ovrSizei("Resolution")
    float("DisplayRefreshRate")
}

val ovrTrackerDesc = struct(Module.OVR, "OVRTrackerDesc", nativeName = "ovrTrackerDesc", mutable = false) {
    alignas("POINTER_SIZE")

    float("FrustumHFovInRadians")
    float("FrustumVFovInRadians")
    float("FrustumNearZInMeters")
    float("FrustumFarZInMeters")
}

val ovrTrackerPose = struct(Module.OVR, "OVRTrackerPose", nativeName = "ovrTrackerPose", mutable = false) {
    alignas(8)

    unsigned_int("TrackerFlags")
    ovrPosef("Pose")
    ovrPosef("LeveledPose")
}

val ovrTrackingState = struct(Module.OVR, "OVRTrackingState", nativeName = "ovrTrackingState", mutable = false) {
    ovrPoseStatef("HeadPose")
    unsigned_int("StatusFlags")
    ovrPoseStatef("HandPoses")[2]
    unsigned_int("HandStatusFlags")[2]
    ovrPosef("CalibratedOrigin")
}

val ovrEyeRenderDesc = struct(Module.OVR, "OVREyeRenderDesc", nativeName = "ovrEyeRenderDesc", mutable = false) {
    ovrEyeType("Eye")
    ovrFovPort("Fov")
    ovrRecti("DistortedViewport")
    ovrVector2f("PixelsPerTanAngleAtCenter")
    ovrPosef("HmdToEyePose")
}

val ovrTimewarpProjectionDesc = struct(Module.OVR, "OVRTimewarpProjectionDesc", nativeName = "ovrTimewarpProjectionDesc", mutable = false) {
    float("Projection22")
    float("Projection23")
    float("Projection32")
}

val ovrViewScaleDesc = struct(Module.OVR, "OVRViewScaleDesc", nativeName = "ovrViewScaleDesc") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")

    ovrPosef("HmdToEyePose")["ovrEye_Count"]
    float("HmdSpaceToWorldScaleInMeters")
}

val ovrTextureType = "ovrTextureType".enumType
val ovrTextureFormat = "ovrTextureFormat".enumType

val ovrTextureSwapChainDesc = struct(Module.OVR, "OVRTextureSwapChainDesc", nativeName = "ovrTextureSwapChainDesc") {
    ovrTextureType("Type")
    ovrTextureFormat("Format")
    int("ArraySize")
    int("Width")
    int("Height")
    int("MipLevels")
    int("SampleCount")
    ovrBool("StaticImage")
    unsigned_int("MiscFlags")
    unsigned_int("BindFlags")
}

val ovrMirrorTextureDesc = struct(Module.OVR, "OVRMirrorTextureDesc", nativeName = "ovrMirrorTextureDesc") {
    ovrTextureFormat("Format")
    int("Width")
    int("Height")
    unsigned_int("MiscFlags")
}

val ovrTextureSwapChain = "ovrTextureSwapChain".handle
val ovrMirrorTexture = "ovrMirrorTexture".handle

val ovrFovStencilType = "ovrFovStencilType".enumType
val ovrFovStencilDesc = struct(Module.OVR, "OVRFovStencilDesc", nativeName = "ovrFovStencilDesc") {
    alignas("POINTER_SIZE")

    ovrFovStencilType("StencilType")
    uint32_t("StencilFlags")
    ovrEyeType("Eye")
    ovrFovPort("FovPort")
    ovrQuatf("HmdToEyeRotation")
}
val ovrFovStencilMeshBuffer = struct(Module.OVR, "OVRFovStencilMeshBuffer", nativeName = "ovrFovStencilMeshBuffer") {
    /// Vertex info
    AutoSize("VertexBuffer")..int("AllocVertexCount")
    int("UsedVertexCount")
    nullable..ovrVector2f.p("VertexBuffer")

    /// Index info
    AutoSize("IndexBuffer")..int("AllocIndexCount")
    int("UsedIndexCount")
    nullable..uint16_t.p("IndexBuffer")
}

val ovrTouchHapticsDesc = struct(Module.OVR, "OVRTouchHapticsDesc", nativeName = "ovrTouchHapticsDesc", mutable = false) {
    alignas("POINTER_SIZE")

    int("SampleRateHz")
    int("SampleSizeInBytes")

    int("QueueMinSizeToAvoidStarvation")

    int("SubmitMinSamples")
    int("SubmitMaxSamples")
    int("SubmitOptimalSamples")
}

val ovrHapticsBufferSubmitMode = "ovrHapticsBufferSubmitMode".enumType

val ovrHapticsBuffer = struct(Module.OVR, "OVRHapticsBuffer", nativeName = "ovrHapticsBuffer") {
    void.p("Samples")
    int("SamplesCount")
    ovrHapticsBufferSubmitMode("SubmitMode")
}

val ovrHapticsPlaybackState = struct(Module.OVR, "OVRHapticsPlaybackState", nativeName = "ovrHapticsPlaybackState", mutable = false) {
    int("RemainingQueueSpace")
    int("SamplesQueued")
}

val ovrControllerType = "ovrControllerType".enumType

val ovrTrackedDeviceType = "ovrTrackedDeviceType".enumType
val ovrBoundaryType = "ovrBoundaryType".enumType

val ovrBoundaryLookAndFeel = struct(Module.OVR, "OVRBoundaryLookAndFeel", nativeName = "ovrBoundaryLookAndFeel") {
    ovrColorf("Color")
}

val ovrBoundaryTestResult = struct(Module.OVR, "OVRBoundaryTestResult", nativeName = "ovrBoundaryTestResult", mutable = false) {
    ovrBool("IsTriggering")
    float("ClosestDistance")
    ovrVector3f("ClosestPoint")
    ovrVector3f("ClosestPointNormal")
}

val ovrInputState = struct(Module.OVR, "OVRInputState", nativeName = "ovrInputState", mutable = false) {
    javaImport("static org.lwjgl.ovr.OVR.ovrHand_Count")

    double("TimeInSeconds")
    unsigned_int("Buttons")
    unsigned_int("Touches")
    float("IndexTrigger")["ovrHand_Count"]
    float("HandTrigger")["ovrHand_Count"]
    ovrVector2f("Thumbstick")["ovrHand_Count"]
    ovrControllerType("ControllerType")

    float("IndexTriggerNoDeadzone")["ovrHand_Count"]
    float("HandTriggerNoDeadzone")["ovrHand_Count"]
    ovrVector2f("ThumbstickNoDeadzone")["ovrHand_Count"]

    float("IndexTriggerRaw")["ovrHand_Count"]
    float("HandTriggerRaw")["ovrHand_Count"]
    ovrVector2f("ThumbstickRaw")["ovrHand_Count"]
}

val ovrCameraIntrinsics = struct(Module.OVR, "OVRCameraIntrinsics", nativeName = "ovrCameraIntrinsics") {
    double("LastChangedTime")
    ovrFovPort("FOVPort")
    float("VirtualNearPlaneDistanceMeters")
    float("VirtualFarPlaneDistanceMeters")
    ovrSizei("ImageSensorPixelResolution")
    ovrMatrix4f("LensDistortionMatrix")
    double("ExposurePeriodSeconds")
    double("ExposureDurationSeconds")
}

val ovrCameraExtrinsics = struct(Module.OVR, "OVRCameraExtrinsics", nativeName = "ovrCameraExtrinsics") {
    double("LastChangedTimeSeconds")
    unsigned_int("CameraStatusFlags")
    ovrTrackedDeviceType("AttachedToDevice")
    ovrPosef("RelativePose")
    double("LastExposureTimeSeconds")
    double("ExposureLatencySeconds")
    double("AdditionalLatencySeconds")
}

const val OVR_EXTERNAL_CAMERA_NAME_SIZE = 32
val ovrExternalCamera = struct(Module.OVR, "OVRExternalCamera", nativeName = "ovrExternalCamera", mutable = false) {
    charASCII("Name")[OVR_EXTERNAL_CAMERA_NAME_SIZE]
    ovrCameraIntrinsics("Intrinsics")
    ovrCameraExtrinsics("Extrinsics")
}

val ovrLayerHeader = struct(Module.OVR, "OVRLayerHeader", nativeName = "ovrLayerHeader") {
    alignas("POINTER_SIZE")

    ovrLayerType("Type")
    unsigned_int("Flags")

    padding(128)
}

val ovrLayerEyeFov = struct(Module.OVR, "OVRLayerEyeFov", nativeName = "ovrLayerEyeFov") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")

    ovrLayerHeader("Header")
    ovrTextureSwapChain("ColorTexture")["ovrEye_Count", "1"]
    ovrRecti("Viewport")["ovrEye_Count"]
    ovrFovPort("Fov")["ovrEye_Count"]
    ovrPosef("RenderPose")["ovrEye_Count"]
    double("SensorSampleTime")
}

val ovrLayerEyeFovDepth = struct(Module.OVR, "OVRLayerEyeFovDepth", nativeName = "ovrLayerEyeFovDepth") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")

    ovrLayerHeader("Header")
    ovrTextureSwapChain("ColorTexture")["ovrEye_Count", "1"]
    ovrRecti("Viewport")["ovrEye_Count"]
    ovrFovPort("Fov")["ovrEye_Count"]
    ovrPosef("RenderPose")["ovrEye_Count"]
    double("SensorSampleTime")
    ovrTextureSwapChain("DepthTexture")["ovrEye_Count", "1"]
    ovrTimewarpProjectionDesc("ProjectionDesc")
}

val ovrTextureLayoutOctilinear = struct(Module.OVR, "OVRTextureLayoutOctilinear", nativeName = "ovrTextureLayoutOctilinear") {
    alignas("POINTER_SIZE")

    float("WarpLeft")
    float("WarpRight")
    float("WarpUp")
    float("WarpDown")

    float("SizeLeft")
    float("SizeRight")
    float("SizeUp")
    float("SizeDown")
}

val ovrTextureLayoutDesc_Union = union(Module.OVR, "OVRTextureLayoutDescUnion", nativeName = "ovrTextureLayoutDesc_Union") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")

    ovrTextureLayoutOctilinear("Octilinear")["ovrEye_Count"]
}

val ovrTextureLayout = "ovrTextureLayout".enumType

val ovrLayerEyeFovMultires = struct(Module.OVR, "OVRLayerEyeFovMultires", nativeName = "ovrLayerEyeFovMultires") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")

    ovrLayerHeader("Header")

    ovrTextureSwapChain("ColorTexture")["ovrEye_Count"]
    ovrRecti("Viewport")["ovrEye_Count"]
    ovrFovPort("Fov")["ovrEye_Count"]
    ovrPosef("RenderPose")["ovrEye_Count"]

    double("SensorSampleTime")

    ovrTextureLayout("TextureLayout")
    ovrTextureLayoutDesc_Union("TextureLayoutDesc")
}

val ovrLayerEyeMatrix = struct(Module.OVR, "OVRLayerEyeMatrix", nativeName = "ovrLayerEyeMatrix") {
    javaImport("static org.lwjgl.ovr.OVR.ovrEye_Count")

    ovrLayerHeader("Header")
    ovrTextureSwapChain("ColorTexture")["ovrEye_Count", "1"]
    ovrRecti("Viewport")["ovrEye_Count"]
    ovrPosef("RenderPose")["ovrEye_Count"]
    ovrMatrix4f("Matrix")
}

val ovrLayerQuad = struct(Module.OVR, "OVRLayerQuad", nativeName = "ovrLayerQuad") {
    ovrLayerHeader("Header")
    ovrTextureSwapChain("ColorTexture")
    ovrRecti("Viewport")
    ovrPosef("QuadPoseCenter")
    ovrVector2f("QuadSize")
}

val ovrLayerCylinder = struct(Module.OVR, "OVRLayerCylinder", nativeName = "ovrLayerCylinder") {
    ovrLayerHeader("Header")
    ovrTextureSwapChain("ColorTexture")
    ovrRecti("Viewport")
    ovrPosef("CylinderPoseCenter")
    float("CylinderRadius")
    float("CylinderAngle")
    float("CylinderAspectRatio")
}

val ovrLayerCube = struct(Module.OVR, "OVRLayerCube", nativeName = "ovrLayerCube") {
    ovrLayerHeader("Header")
    ovrQuatf("Orientation")
    ovrTextureSwapChain("CubeMapTexture")
}

val ovrPerfStatsPerCompositorFrame = struct(Module.OVR, "OVRPerfStatsPerCompositorFrame", nativeName = "ovrPerfStatsPerCompositorFrame", mutable = false) {
    int("HmdVsyncIndex")

    ///
    /// Application stats
    ///

    int("AppFrameIndex")
    int("AppDroppedFrameCount")
    float("AppMotionToPhotonLatency")
    float("AppQueueAheadTime")
    float("AppCpuElapsedTime")
    float("AppGpuElapsedTime")

    ///
    /// SDK Compositor stats
    ///

    int("CompositorFrameIndex")
    int("CompositorDroppedFrameCount")
    float("CompositorLatency")
    float("CompositorCpuElapsedTime")
    float("CompositorGpuElapsedTime")
    float("CompositorCpuStartToGpuEndElapsedTime")
    float("CompositorGpuEndToVsyncElapsedTime")

    ///
    /// Async Spacewarp stats (ASW)
    ///

    ovrBool("AswIsActive")
    int("AswActivatedToggleCount")
    int("AswPresentedFrameCount")
    int("AswFailedFrameCount")
}

val ovrPerfStats = struct(Module.OVR, "OVRPerfStats", nativeName = "ovrPerfStats", mutable = false) {
    javaImport("static org.lwjgl.ovr.OVR.ovrMaxProvidedFrameStats")

    ovrPerfStatsPerCompositorFrame("FrameStats")["ovrMaxProvidedFrameStats"]
    AutoSize("FrameStats")..int("FrameStatsCount")
    ovrBool("AnyFrameStatsDropped")
    float("AdaptiveGpuPerformanceScale")
    ovrBool("AswIsAvailable")
    ovrProcessId("VisibleProcessId")
}

// OVR_CAPI_Util.h

val ovrHapticsGenMode = "ovrHapticsGenMode".enumType

val ovrDetectResult = struct(Module.OVR, "OVRDetectResult", nativeName = "ovrDetectResult", mutable = false) {
    ovrBool("IsOculusServiceRunning")
    ovrBool("IsOculusHMDConnected")
    padding(6)
}

val ovrAudioChannelData = struct(Module.OVR, "OVRAudioChannelData", nativeName = "ovrAudioChannelData", mutable = false) {
    float.const.p("Samples")
    AutoSize("Samples")..int("SamplesCount")
    int("Frequency")
}

val ovrHapticsClip = struct(Module.OVR, "OVRHapticsClip", nativeName = "ovrHapticsClip", mutable = false) {
    void.const.p("Samples")
    int("SamplesCount")
}

fun config() {
    union(Module.OVR, "OVRLayerUnion", nativeName = "ovrLayer_Union") {
        ovrLayerHeader("Header")
        ovrLayerEyeFov("EyeFov")
        ovrLayerEyeFovDepth("EyeFovDepth")
        ovrLayerEyeMatrix("EyeMatrix")
        ovrLayerEyeFovMultires("Multires")
        ovrLayerCylinder("Cylinder")
        ovrLayerCube("Cube")
        ovrLayerQuad("Quad")
    }
}