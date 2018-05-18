/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.OPENVR, // TODO
        """
        Contains bindings to ${url("https://github.com/ValveSoftware/openvr", "OpenVR")}.

        OpenVR is an API and runtime that allows access to VR hardware from multiple vendors without requiring that applications have specific knowledge of the
        hardware they are targeting.
        """
    )
}

const val OPENVR_LIBRARY = "OpenVR.initialize();"
val OPENVR_API_BINDING = simpleBinding(
    Module.OPENVR,
    libraryExpression = """Configuration.OPENVR_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("openvr_api"))""",
    bundledWithLWJGL = true
)

val EVRApplicationError = "EVRApplicationError".enumType
val EVRCompositorError = "EVRCompositorError".enumType
val EVRFirmwareError = "EVRFirmwareError".enumType
val EVRInitError = "EVRInitError".enumType
val EVRNotificationError = "EVRNotificationError".enumType
val EVROverlayError = "EVROverlayError".enumType
val EVRRenderModelError = "EVRRenderModelError".enumType
val EVRScreenshotError = "EVRScreenshotError".enumType
val EVRSettingsError = "EVRSettingsError".enumType
val EVRTrackedCameraError = "EVRTrackedCameraError".enumType
val EVRInputError = "EVRInputError".enumType
val EIOBufferError = "EIOBufferError".enumType

val EVRApplicationProperty = "EVRApplicationProperty".enumType
val EVRApplicationTransitionState = "EVRApplicationTransitionState".enumType
val EVRApplicationType = "EVRApplicationType".enumType
val EVRButtonId = "EVRButtonId".enumType
val EVRCompositorTimingMode = "EVRCompositorTimingMode".enumType
val EVRControllerAxisType = "EVRControllerAxisType".enumType
val EVREye = "EVREye".enumType
val EVREventType = "EVREventType".enumType
val EVRNotificationStyle = "EVRNotificationStyle".enumType
val EVRNotificationType = "EVRNotificationType".enumType
val EVROverlayIntersectionMaskPrimitiveType = "EVROverlayIntersectionMaskPrimitiveType".enumType
val EVRScreenshotPropertyFilenames = "EVRScreenshotPropertyFilenames".enumType
val EVRScreenshotType = "EVRScreenshotType".enumType
val EVRSubmitFlags = "EVRSubmitFlags".enumType
val EVRTrackedCameraFrameType = "EVRTrackedCameraFrameType".enumType
val EVRSkeletalTransformSpace = "EVRSkeletalTransformSpace".enumType

val ChaperoneCalibrationState = "ChaperoneCalibrationState".enumType

val EChaperoneConfigFile = "EChaperoneConfigFile".enumType
val EColorSpace = "EColorSpace".enumType
val EDeviceActivityLevel = "EDeviceActivityLevel".enumType
val EDualAnalogWhich = "EDualAnalogWhich".enumType
val EGamepadTextInputMode = "EGamepadTextInputMode".enumType
val EGamepadTextInputLineMode = "EGamepadTextInputLineMode".enumType
val EHiddenAreaMeshType = "EHiddenAreaMeshType".enumType
val EOverlayDirection = "EOverlayDirection".enumType
val ETextureType = "ETextureType".enumType
val ETrackedControllerRole = "ETrackedControllerRole".enumType
val ETrackedDeviceClass = "ETrackedDeviceClass".enumType
val ETrackedDeviceProperty = "ETrackedDeviceProperty".enumType
val ETrackedPropertyError = "ETrackedPropertyError".enumType
val ETrackingResult = "ETrackingResult".enumType
val ETrackingUniverseOrigin = "ETrackingUniverseOrigin".enumType
val EIOBufferMode = "EIOBufferMode".enumType

val VRMessageOverlayResponse = "VRMessageOverlayResponse".enumType
val VROverlayFlags = "VROverlayFlags".enumType
val VROverlayInputMethod = "VROverlayInputMethod".enumType
val VROverlayTransformType = "VROverlayTransformType".enumType

val PropertyContainerHandle_t = typedef(uint64_t, "PropertyContainerHandle_t")
val PropertyTypeTag_t = typedef(uint32_t, "PropertyTypeTag_t")
val DriverHandle_t = typedef(PropertyContainerHandle_t, "DriverHandle_t")
val ScreenshotHandle_t = typedef(uint32_t, "ScreenshotHandle_t")
val TextureID_t = typedef(int32_t, "TextureID_t")
val TrackedCameraHandle_t = typedef(uint64_t, "TrackedCameraHandle_t")
val TrackedDeviceIndex_t = typedef(uint32_t, "TrackedDeviceIndex_t")
val WebConsoleHandle_t = typedef(uint64_t, "WebConsoleHandle_t")
val DriverId_t = typedef(uint32_t, "DriverId_t")

val VRComponentProperties = typedef(uint32_t, "VRComponentProperties")
val VRNotificationId = typedef(uint32_t, "VRNotificationId")
val VROverlayHandle_t = typedef(uint64_t, "VROverlayHandle_t")
val VRActionHandle_t = typedef(uint64_t, "VRActionHandle_t")
val VRActionSetHandle_t = typedef(uint64_t, "VRActionSetHandle_t")
val VRInputValueHandle_t = typedef(uint64_t, "VRInputValueHandle_t")
val IOBufferHandle_t = typedef(uint64_t, "IOBufferHandle_t")

val glSharedTextureHandle_t = typedef(opaque_p, "glSharedTextureHandle_t")
val glInt_t = typedef(int32_t, "glInt_t")
val glUInt_t = typedef(uint32_t, "glUInt_t")

val VkInstance_T = "VkInstance_T".opaque
val VkPhysicalDevice_T = "VkPhysicalDevice_T".opaque
val VkDevice_T = "VkDevice_T".opaque
val VkQueue_T = "VkQueue_T".opaque

val HmdMatrix34_t = struct(Module.OPENVR, "HmdMatrix34", nativeName = "HmdMatrix34_t") {
    float.array("m", "", size = 3 x 4)
}

val HmdMatrix44_t = struct(Module.OPENVR, "HmdMatrix44", nativeName = "HmdMatrix44_t") {
    float.array("m", "", size = 4 x 4)
}

val HmdVector3_t = struct(Module.OPENVR, "HmdVector3", nativeName = "HmdVector3_t") {
    float.array("v", "", size = 3)
}

val HmdVector4_t = struct(Module.OPENVR, "HmdVector4", nativeName = "HmdVector4_t") {
    float.array("v", "", size = 4)
}

val HmdVector3d_t = struct(Module.OPENVR, "HmdVector3d", nativeName = "HmdVector3d_t") {
    double.array("v", "", size = 3)
}

val HmdVector2_t = struct(Module.OPENVR, "HmdVector2", nativeName = "HmdVector2_t") {
    float.array("v", "", size = 2)
}

val HmdQuaternion_t = struct(Module.OPENVR, "HmdQuaternion", nativeName = "HmdQuaternion_t") {
    double.member("w", "")
    double.member("x", "")
    double.member("y", "")
    double.member("z", "")
}

val HmdQuaternionf_t = struct(Module.OPENVR, "HmdQuaternionf", nativeName = "HmdQuaternionf_t") {
    float.member("w", "")
    float.member("x", "")
    float.member("y", "")
    float.member("z", "")
}

val HmdColor_t = struct(Module.OPENVR, "HmdColor", nativeName = "HmdColor_t") {
    float.member("r", "")
    float.member("g", "")
    float.member("b", "")
    float.member("a", "")
}

val HmdQuad_t = struct(Module.OPENVR, "HmdQuad", nativeName = "HmdQuad_t") {
    HmdVector3_t.array("vCorners", "", size = 4)
}

val HmdRect2_t = struct(Module.OPENVR, "HmdRect2", nativeName = "HmdRect2_t") {
    HmdVector2_t.member("vTopLeft", "")
    HmdVector2_t.member("vBottomRight", "")
}

val DistortionCoordinates_t = struct(Module.OPENVR, "DistortionCoordinates", nativeName = "DistortionCoordinates_t", mutable = false) {
    documentation =
    """
    Used to return the post-distortion UVs for each color channel.

    UVs range from 0 to 1 with 0,0 in the upper left corner of the source render target. The 0,0 to 1,1 range covers a single eye.
    """

    float.array("rfRed", "the UVs for the red channel", size = 2)
    float.array("rfGreen", "the UVs for the green channel", size = 2)
    float.array("rfBlue", "the UVs for the blue channel", size = 2)
}

val TrackedDevicePose_t = struct(Module.OPENVR, "TrackedDevicePose", nativeName = "TrackedDevicePose_t") {
    documentation = "Describes a single pose for a tracked object."

    HmdMatrix34_t.member("mDeviceToAbsoluteTracking", "")
    HmdVector3_t.member("vVelocity", "velocity in tracker space in m/s")
    HmdVector3_t.member("vAngularVelocity", "angular velocity in radians/s")
    ETrackingResult.member("eTrackingResult", "").links("ETrackingResult_\\w+")
    bool.member("bPoseIsValid", "")
    bool.member(
        "bDeviceIsConnected",
        "This indicates that there is a device connected for this spot in the pose array. It could go from true to false if the user unplugs the device."
    )
}

val VREvent_Reserved_t = struct(Module.OPENVR, "VREventReserved", nativeName = "VREvent_Reserved_t", mutable = false) {
    documentation = "Not actually used for any events."

    uint64_t.member("reserved0", "")
    uint64_t.member("reserved1", "")
    uint64_t.member("reserved2", "")
    uint64_t.member("reserved3", "")
}

val VREvent_Controller_t = struct(Module.OPENVR, "VREventController", nativeName = "VREvent_Controller_t", mutable = false) {
    documentation = "Used for controller button events."

    uint32_t.member("button", "").links("EVRButtonId_\\w+")
}

val VREvent_Mouse_t = struct(Module.OPENVR, "VREventMouse", nativeName = "VREvent_Mouse_t", mutable = false) {
    documentation = "Used for simulated mouse events in overlay space."

    float.member("x", "coords are in GL space, bottom left of the texture is 0,0")
    float.member("y", "")
    uint32_t.member("button", "").links("EVRMouseButton_\\w+")
}

val VREvent_Scroll_t = struct(Module.OPENVR, "VREventScroll", nativeName = "VREvent_Scroll_t", mutable = false) {
    documentation = "Used for simulated mouse wheel scroll in overlay space."

    float.member("xdelta", "movement in fraction of the pad traversed since last delta, 1.0 for a full swipe")
    float.member("ydelta", "")
    uint32_t.member("repeatCount", "")
}

val VREvent_Process_t = struct(Module.OPENVR, "VREventProcess", nativeName = "VREvent_Process_t", mutable = false) {
    documentation = "Used for events about processes."

    uint32_t.member("pid", "")
    uint32_t.member("oldPid", "")
    bool.member("bForced", "")
}

val VREvent_Notification_t = struct(Module.OPENVR, "VREventNotification", nativeName = "VREvent_Notification_t", mutable = false) {
    documentation = "Notification related events. Details will still change at this point."

    uint64_t.member("ulUserValue", "")
    uint32_t.member("notificationId", "")
}

val VREvent_Overlay_t = struct(Module.OPENVR, "VREventOverlay", nativeName = "VREvent_Overlay_t", mutable = false) {
    documentation = "Used for a few events about overlays."

    uint64_t.member("overlayHandle", "").links("EVRState_\\w+")
    uint64_t.member("devicePath", "")
}

val VREvent_Status_t = struct(Module.OPENVR, "VREventStatus", nativeName = "VREvent_Status_t", mutable = false) {
    documentation = "Used for a few events about overlays."

    uint32_t.member("statusState", "")
}

val VREvent_Keyboard_t = struct(Module.OPENVR, "VREventKeyboard", nativeName = "VREvent_Keyboard_t", mutable = false) {
    documentation = "Used for keyboard events."

    char.array("cNewInput", "up to 8 bytes of new input", size = 8)
    uint64_t.member("uUserValue", "possible flags about the new input")
}

val VREvent_Ipd_t = struct(Module.OPENVR, "VREventIpd", nativeName = "VREvent_Ipd_t", mutable = false) {
    float.member("ipdMeters", "")
}

val VREvent_Chaperone_t = struct(Module.OPENVR, "VREventChaperone", nativeName = "VREvent_Chaperone_t", mutable = false) {
    uint64_t.member("m_nPreviousUniverse", "")
    uint64_t.member("m_nCurrentUniverse", "")
}

val VREvent_PerformanceTest_t = struct(Module.OPENVR, "VREventPerformanceTest", nativeName = "VREvent_PerformanceTest_t", mutable = false) {
    uint32_t.member("m_nFidelityLevel", "")
}

val VREvent_TouchPadMove_t = struct(Module.OPENVR, "VREventTouchPadMove", nativeName = "VREvent_TouchPadMove_t", mutable = false) {
    documentation =
    """
    When in mouse input mode you can receive data from the touchpad, these events are only sent if the users finger is on the touchpad (or just released from
    it). These events are sent to overlays with the #VROverlayFlags_SendVRTouchpadEvents flag set.
    """

    bool.member("bFingerDown", "true if the users finger is detected on the touch pad")
    float.member("flSecondsFingerDown", "how long the finger has been down in seconds")
    float.member("fValueXFirst", "these values indicate the starting finger position (so you can do some basic swipe stuff)")
    float.member("fValueYFirst", "")
    float.member("fValueXRaw", "this is the raw sampled coordinate without deadzoning")
    float.member("fValueYRaw", "")
}

val VREvent_SeatedZeroPoseReset_t = struct(Module.OPENVR, "VREventSeatedZeroPoseReset", nativeName = "VREvent_SeatedZeroPoseReset_t", mutable = false) {
    bool.member("bResetBySystemMenu", "")
}

val VREvent_Screenshot_t = struct(Module.OPENVR, "VREventScreenshot", nativeName = "VREvent_Screenshot_t", mutable = false) {
    uint32_t.member("handle", "")
    uint32_t.member("type", "")
}

val VREvent_ScreenshotProgress_t = struct(Module.OPENVR, "VREventScreenshotProgress", nativeName = "VREvent_ScreenshotProgress_t", mutable = false) {
    float.member("progress", "")
}

val VREvent_ApplicationLaunch_t = struct(Module.OPENVR, "VREventApplicationLaunch", nativeName = "VREvent_ApplicationLaunch_t", mutable = false) {
    uint32_t.member("pid", "")
    uint32_t.member("unArgsHandle", "")
}

val VREvent_EditingCameraSurface_t = struct(Module.OPENVR, "VREventEditingCameraSurface", nativeName = "VREvent_EditingCameraSurface_t", mutable = false) {
    uint64_t.member("overlayHandle", "")
    uint32_t.member("nVisualMode", "")
}

val VREvent_MessageOverlay_t = struct(Module.OPENVR, "VREventMessageOverlay", nativeName = "VREvent_MessageOverlay_t", mutable = false) {
    uint32_t.member("unVRMessageOverlayResponse", "").links("VRMessageOverlayResponse_\\w+")
}

val VREvent_Property_t = struct(Module.OPENVR, "VREventProperty", nativeName = "VREvent_Property_t", mutable = false) {
    PropertyContainerHandle_t.member("container", "")
    ETrackedDeviceProperty.member("prop", "").links("ETrackedDeviceProperty_\\w+")
}

val VREvent_DualAnalog_t = struct(Module.OPENVR, "VREventDualAnalog", nativeName = "VREvent_DualAnalog_t", mutable = false) {
    float.member("x", "coordinates are -1..1 analog values")
	float.member("y", "coordinates are -1..1 analog values")
	float.member("transformedX", "transformed by the center and radius numbers provided by the overlay")
	float.member("transformedY", "transformed by the center and radius numbers provided by the overlay")
	EDualAnalogWhich.member("which", "")
}

val VREvent_HapticVibration_t = struct(Module.OPENVR, "VREventHapticVibration", nativeName = "VREvent_HapticVibration_t", mutable = false) {
    uint64_t.member("containerHandle", "property container handle of the device with the haptic component")
	uint64_t.member("componentHandle", "which haptic component needs to vibrate")
	float.member("fDurationSeconds", "")
	float.member("fFrequency", "")
	float.member("fAmplitude", "")
}

val VREvent_WebConsole_t = struct(Module.OPENVR, "VREventWebConsole", nativeName = "VREvent_WebConsole_t", mutable = false) {
    WebConsoleHandle_t.member("webConsoleHandle", "")
}

val VREvent_InputBindingLoad_t = struct(Module.OPENVR, "VREventInputBindingLoad", nativeName = "VREvent_InputBindingLoad_t", mutable = false) {
    PropertyContainerHandle_t.member("ulAppContainer", "")
	uint64_t.member("pathMessage", "")
	uint64_t.member("pathUrl", "")
}

val VREvent_Data_t = union(Module.OPENVR, "VREventData", nativeName = "VREvent_Data_t", mutable = false) {
    VREvent_Reserved_t.member("reserved", "")
    VREvent_Controller_t.member("controller", "")
    VREvent_Mouse_t.member("mouse", "")
    VREvent_Scroll_t.member("scroll", "")
    VREvent_Process_t.member("process", "")
    VREvent_Notification_t.member("notification", "")
    VREvent_Overlay_t.member("overlay", "")
    VREvent_Status_t.member("status", "")
    VREvent_Keyboard_t.member("keyboard", "")
    VREvent_Ipd_t.member("ipd", "")
    VREvent_Chaperone_t.member("chaperone", "")
    VREvent_PerformanceTest_t.member("performanceTest", "")
    VREvent_TouchPadMove_t.member("touchPadMove", "")
    VREvent_SeatedZeroPoseReset_t.member("seatedZeroPoseReset", "")
    VREvent_Screenshot_t.member("screenshot", "")
    VREvent_ScreenshotProgress_t.member("screenshotProgress", "")
    VREvent_ApplicationLaunch_t.member("applicationLaunch", "")
    VREvent_EditingCameraSurface_t.member("cameraSurface", "")
    VREvent_MessageOverlay_t.member("messageOverlay", "")
    VREvent_Property_t.member("property", "")
    VREvent_DualAnalog_t.member("dualAnalog", "")
    VREvent_HapticVibration_t.member("hapticVibration", "")
    VREvent_WebConsole_t.member("webConsole", "")
    VREvent_InputBindingLoad_t.member("inputBinding", "")
}

val VREvent_t = struct(Module.OPENVR, "VREvent", nativeName = "VREvent_t", mutable = false) {
    documentation = "An event posted by the server to all running applications."

    uint32_t.member("eventType", "the type of the event").links("EVREventType_\\w+")
    TrackedDeviceIndex_t.member(
        "trackedDeviceIndex",
        "the tracked device index of the event. For events that aren't connected to a tracked device this is #k_unTrackedDeviceIndexInvalid."
    )
    float.member("eventAgeSeconds", "the age of the event in seconds")
    VREvent_Data_t.member(
        "data",
        """
        more information about the event. This is a union of several structs. See the event type enum for information about which union member to look at for
        each event.
        """
    )
}

val IntersectionMaskRectangle_t = struct(Module.OPENVR, "IntersectionMaskRectangle", nativeName = "IntersectionMaskRectangle_t") {
    float.member("m_flTopLeftX", "")
    float.member("m_flTopLeftY", "")
    float.member("m_flWidth", "")
    float.member("m_flHeight", "")
}

val IntersectionMaskCircle_t = struct(Module.OPENVR, "IntersectionMaskCircle", nativeName = "IntersectionMaskCircle_t") {
    float.member("m_flCenterX", "")
    float.member("m_flCenterY", "")
    float.member("m_flRadius", "")
}

val VROverlayIntersectionMaskPrimitive_Data_t = union(Module.OPENVR, "VROverlayIntersectionMaskPrimitiveData", nativeName = "VROverlayIntersectionMaskPrimitive_Data_t") {
    IntersectionMaskRectangle_t.member("m_Rectangle", "")
    IntersectionMaskCircle_t.member("m_Circle", "")
}

val VROverlayIntersectionMaskPrimitive_t = struct(Module.OPENVR, "VROverlayIntersectionMaskPrimitive", nativeName = "VROverlayIntersectionMaskPrimitive_t") {
    EVROverlayIntersectionMaskPrimitiveType.member("m_nPrimitiveType", "")
    VROverlayIntersectionMaskPrimitive_Data_t.member("m_Primitive", "")
}

val HiddenAreaMesh_t = struct(Module.OPENVR, "HiddenAreaMesh", nativeName = "HiddenAreaMesh_t", mutable = false) {
    documentation =
    """
    The mesh to draw into the stencil (or depth) buffer to perform early stencil (or depth) kills of pixels that will never appear on the HMD. This mesh draws
    on all the pixels that will be hidden after distortion.

    If the HMD does not provide a visible area mesh {@code pVertexData} will be #NULL and {@code unTriangleCount} will be 0.
    """

    HmdVector2_t.p.buffer("pVertexData", "")
    AutoSize("pVertexData", optional = true)..uint32_t.member("unTriangleCount", "")
}

val VRControllerAxis_t = struct(Module.OPENVR, "VRControllerAxis", nativeName = "VRControllerAxis_t") {
    documentation = "Contains information about one axis on the controller."

    float.member("x", "Ranges from -1.0 to 1.0 for joysticks and track pads. Ranges from 0.0 to 1.0 for triggers were 0 is fully released.")
    float.member("y", "Ranges from -1.0 to 1.0 for joysticks and track pads. Is always 0.0 for triggers.")
}

val VRControllerState_t = struct(Module.OPENVR, "VRControllerState", nativeName = "VRControllerState_t") {
    documentation = "Holds all the state of a controller at one moment in time."

    uint32_t.member(
        "unPacketNum",
        "If packet num matches that on your prior call, then the controller state hasn't been changed since your last call and there is no need to process it."
    )
    uint64_t.member("ulButtonPressed", "bit flags for each of the buttons. Use {@code ButtonMaskFromId} to turn an ID into a mask")
    uint64_t.member("ulButtonTouched", "")
    VRControllerAxis_t.array("rAxis", "axis data for the controller's analog inputs", size = 5)
}

val Texture_t = struct(Module.OPENVR, "Texture", nativeName = "Texture_t") {
    opaque_p.member("handle", "") // See ETextureType definition above
    ETextureType.member("eType", "").links("ETextureType_\\w+")
    EColorSpace.member("eColorSpace", "").links("EColorSpace_\\w+")
}

val VRTextureBounds_t = struct(Module.OPENVR, "VRTextureBounds", nativeName = "VRTextureBounds_t") {
    documentation = "Allows the application to control what part of the provided texture will be used in the frame buffer."

    float.member("uMin", "")
    float.member("vMin", "")
    float.member("uMax", "")
    float.member("vMax", "")
}

val VRTextureWithPose_t = struct(Module.OPENVR, "VRTextureWithPose", nativeName = "VRTextureWithPose_t") {
    documentation = "Allows specifying pose used to render provided scene texture (if different from value returned by #WaitGetPoses())."

	HmdMatrix34_t.member("mDeviceToAbsoluteTracking", "actual pose used to render scene textures")
}

val VRTextureDepthInfo_t = struct(Module.OPENVR, "VRTextureDepthInfo", nativeName = "VRTextureDepthInfo_t") {
    documentation = ""

	opaque_p.member("handle", "")
	HmdMatrix44_t.member("mProjection", "")
	HmdVector2_t.member("vRange", "")
}

val VRTextureWithDepth_t = struct(Module.OPENVR, "VRTextureWithDepth", nativeName = "VRTextureWithDepth_t") {
    documentation = ""

	VRTextureDepthInfo_t.member("depth", "")
}

val VRTextureWithPoseAndDepth_t = struct(Module.OPENVR, "VRTextureWithPoseAndDepth", nativeName = "VRTextureWithPoseAndDepth_t") {
    documentation = ""

	VRTextureDepthInfo_t.member("depth", "")
}

val VRVulkanTextureData_t = struct(Module.OPENVR, "VRVulkanTextureData", nativeName = "VRVulkanTextureData_t") {
    documentation = "Data required for passing Vulkan textures to #Submit(). Be sure to call #ShutdownInternal() before destroying these resources."

    uint64_t.member("m_nImage", "VkImage")
    VkDevice_T.p.member("m_pDevice", "")
    VkPhysicalDevice_T.p.member("m_pPhysicalDevice", "")
    VkInstance_T.p.member("m_pInstance", "")
    VkQueue_T.p.member("m_pQueue", "")
    uint32_t.member("m_nQueueFamilyIndex", "")
    uint32_t.member("m_nWidth", "")
    uint32_t.member("m_nHeight", "")
    uint32_t.member("m_nFormat", "")
    uint32_t.member("m_nSampleCount", "")
}

val Compositor_OverlaySettings = struct(Module.OPENVR, "CompositorOverlaySettings", nativeName = "Compositor_OverlaySettings") {
    documentation = "Allows the application to customize how the overlay appears in the compositor."

    uint32_t.member("size", "{@code sizeof(Compositor_OverlaySettings)}")
    bool.member("curved", "")
    bool.member("antialias", "")
    float.member("scale", "")
    float.member("distance", "")
    float.member("alpha", "")
    float.member("uOffset", "")
    float.member("vOffset", "")
    float.member("uScale", "")
    float.member("vScale", "")
    float.member("gridDivs", "")
    float.member("gridWidth", "")
    float.member("gridScale", "")
    HmdMatrix44_t.member("transform", "")
}

val VRBoneTransform_t = struct(Module.OPENVR, "VRBoneTransform_", nativeName = "VRBoneTransform_t", mutable = false) {
    documentation = "Holds the transform for a single bone."

    HmdVector4_t.member("position", "")
	HmdQuaternionf_t.member("orientation", "")
}

val AppOverrideKeys_t = struct(Module.OPENVR, "AppOverrideKeys", nativeName = "AppOverrideKeys_t") {
    charASCII.p.member("pchKey", "")
    char.p.member("pchValue", "")
}

val Compositor_FrameTiming = struct(Module.OPENVR, "CompositorFrameTiming", nativeName = "Compositor_FrameTiming", mutable = false) {
    documentation = "Provides a single frame's timing information to the app."

    uint32_t.member("m_nSize", "Set to {@code sizeof( Compositor_FrameTiming )}")
    uint32_t.member("m_nFrameIndex", "")
    uint32_t.member("m_nNumFramePresents", "number of times this frame was presented")
    uint32_t.member("m_nNumMisPresented", "number of times this frame was presented on a vsync other than it was originally predicted to")
    uint32_t.member("m_nNumDroppedFrames", "number of additional times previous frame was scanned out")
    uint32_t.member("m_nReprojectionFlags", "")

    double.member("m_flSystemTimeInSeconds", "Absolute time reference for comparing frames. This aligns with the vsync that running start is relative to.")

    /** These times may include work from other processes due to OS scheduling.
     * The fewer packets of work these are broken up into, the less likely this will happen.
     * GPU work can be broken up by calling Flush.  This can sometimes be useful to get the GPU started
     * processing that work earlier in the frame. */
    float.member("m_flPreSubmitGpuMs", "time spent rendering the scene (gpu work submitted between WaitGetPoses and second Submit)")
    float.member("m_flPostSubmitGpuMs", "additional time spent rendering by application (e.g. companion window)")
    float.member("m_flTotalRenderGpuMs", "time between work submitted immediately after present (ideally vsync) until the end of compositor submitted work")
    float.member("m_flCompositorRenderGpuMs", "time spend performing distortion correction, rendering chaperone, overlays, etc.")
    float.member("m_flCompositorRenderCpuMs", "time spent on cpu submitting the above work for this frame")
    float.member("m_flCompositorIdleCpuMs", "time spent waiting for running start (application could have used this much more time)")

    /** Miscellaneous measured intervals. */
    float.member("m_flClientFrameIntervalMs", "time between calls to #WaitGetPoses()")
    float.member("m_flPresentCallCpuMs", "time blocked on call to present (usually 0.0, but can go long)")
    float.member("m_flWaitForPresentCpuMs", "time spent spin-waiting for frame index to change (not near-zero indicates wait object failure)")
    float.member("m_flSubmitFrameMs", "time spent in #Submit() (not near-zero indicates driver issue)")

    /** The following are all relative to this frame's SystemTimeInSeconds */
    float.member("m_flWaitGetPosesCalledMs", "")
    float.member("m_flNewPosesReadyMs", "")
    float.member("m_flNewFrameReadyMs", "second call to #Submit()")
    float.member("m_flCompositorUpdateStartMs", "")
    float.member("m_flCompositorUpdateEndMs", "")
    float.member("m_flCompositorRenderStartMs", "")

    TrackedDevicePose_t.member("m_HmdPose", "pose used by app to render this frame")
}

val Compositor_CumulativeStats = struct(Module.OPENVR, "CompositorCumulativeStats", nativeName = "Compositor_CumulativeStats", mutable = false) {
    documentation =
    """
    Cumulative stats for current application.  These are not cleared until a new app connects, but they do stop accumulating once the associated app
    disconnects.
    """

    uint32_t.member("m_nPid", "Process id associated with these stats (may no longer be running).")
    uint32_t.member("m_nNumFramePresents", "total number of times we called present (includes reprojected frames)")
    uint32_t.member("m_nNumDroppedFrames", "total number of times an old frame was re-scanned out (without reprojection)")
    uint32_t.member("m_nNumReprojectedFrames", "total number of times a frame was scanned out a second time (with reprojection)")

    /** Values recorded at startup before application has fully faded in the first time. */
    uint32_t.member("m_nNumFramePresentsOnStartup", "")
    uint32_t.member("m_nNumDroppedFramesOnStartup", "")
    uint32_t.member("m_nNumReprojectedFramesOnStartup", "")

    /** Applications may explicitly fade to the compositor.  This is usually to handle level transitions, and loading often causes
     * system wide hitches.  The following stats are collected during this period.  Does not include values recorded during startup. */
    uint32_t.member("m_nNumLoading", "")
    uint32_t.member("m_nNumFramePresentsLoading", "")
    uint32_t.member("m_nNumDroppedFramesLoading", "")
    uint32_t.member("m_nNumReprojectedFramesLoading", "")

    /** If we don't get a new frame from the app in less than 2.5 frames, then we assume the app has hung and start
     * fading back to the compositor.  The following stats are a result of this, and are a subset of those recorded above.
     * Does not include values recorded during start up or loading. */
    uint32_t.member("m_nNumTimedOut", "")
    uint32_t.member("m_nNumFramePresentsTimedOut", "")
    uint32_t.member("m_nNumDroppedFramesTimedOut", "")
    uint32_t.member("m_nNumReprojectedFramesTimedOut", "")
}

val NotificationBitmap_t = struct(Module.OPENVR, "NotificationBitmap", nativeName = "NotificationBitmap_t") {
    documentation = "Used for passing graphic data."

    void.p.member("m_pImageData", "")
    int32_t.member("m_nWidth", "")
    int32_t.member("m_nHeight", "")
    int32_t.member("m_nBytesPerPixel", "")
}

val InputAnalogActionData_t = struct(Module.OPENVR, "InputAnalogActionData", nativeName = "InputAnalogActionData_t", mutable = false) {
    bool.member("bActive", "whether or not this action is currently available to be bound in the active action set")
	VRInputValueHandle_t.member("activeOrigin", "the origin that caused this action's current state")
	float.member("x", "the current state of this action; will be delta updates for mouse actions")
	float.member("y", "the current state of this action; will be delta updates for mouse actions")
	float.member("z", "the current state of this action; will be delta updates for mouse actions")
	float.member("deltaX", "teltas since the previous call to #UpdateActionState()")
	float.member("deltaY", "teltas since the previous call to #UpdateActionState()")
	float.member("deltaZ", "teltas since the previous call to #UpdateActionState()")
	float.member("fUpdateTime", "time relative to now when this event happened. Will be negative to indicate a past time")
}

val InputDigitalActionData_t = struct(Module.OPENVR, "InputDigitalActionData", nativeName = "InputDigitalActionData_t", mutable = false) {
    bool.member("bActive", "whether or not this action is currently available to be bound in the active action set")
	VRInputValueHandle_t.member("activeOrigin", "the origin that caused this action's current state")
	bool.member("bState", "the current state of this action; will be true if currently pressed")
	bool.member("bChanged", "this is true if the state has changed since the last frame")
	float.member("fUpdateTime", "time relative to now when this event happened. Will be negative to indicate a past time.")
}

val InputPoseActionData_t = struct(Module.OPENVR, "InputPoseActionData", nativeName = "InputPoseActionData_t", mutable = false) {
    bool.member("bActive", "whether or not this action is currently available to be bound in the active action set")
	VRInputValueHandle_t.member("activeOrigin", "the origin that caused this action's current state")
	TrackedDevicePose_t.member("pose", "the current state of this action")
}

val InputSkeletonActionData_t = struct(Module.OPENVR, "InputSkeletonActionData", nativeName = "InputSkeletonActionData_t", mutable = false) {
    bool.member("bActive", "whether or not this action is currently available to be bound in the active action set")
	VRInputValueHandle_t.member("activeOrigin", "the origin that caused this action's current state")
}

val InputOriginInfo_t = struct(Module.OPENVR, "InputOriginInfo", nativeName = "InputOriginInfo_t", mutable = false) {
    VRInputValueHandle_t.member("devicePath", "")
	TrackedDeviceIndex_t.member("trackedDeviceIndex", "")
    charUTF8.array("rchRenderModelComponentName", "", size = 128)
}

val VRActiveActionSet_t = struct(Module.OPENVR, "VRActiveActionSet", nativeName = "VRActiveActionSet_t") {
    VRActionSetHandle_t.member("ulActionSet", "this is the handle of the action set to activate for this frame")
	VRInputValueHandle_t.member(
        "ulRestrictedToDevice",
        "this is the handle of a device path that this action set should be active for. To activate for all devices, set this to #k_ulInvalidInputValueHandle.")
	VRActionSetHandle_t.member(
        "ulSecondaryActionSet",
        """
        the action set to activate for all devices other than {@code ulRestrictedDevice}. If {@code ulRestrictedToDevice} is set to
        #k_ulInvalidInputValueHandle, this parameter is ignored.
        """
    )
}

val RenderModel_Vertex_t = struct(Module.OPENVR, "RenderModelVertex", nativeName = "RenderModel_Vertex_t", mutable = false) {
    documentation = "A single vertex in a render model."

    HmdVector3_t.member("vPosition", "position in meters in device space")
    HmdVector3_t.member("vNormal", "")
    float.array("rfTextureCoord", "", size = 2)
}

val RenderModel_t = struct(Module.OPENVR, "RenderModel", nativeName = "RenderModel_t", mutable = false) {
    RenderModel_Vertex_t.const.p.buffer("rVertexData", "Vertex data for the mesh")
    AutoSize("rVertexData")..uint32_t.member("unVertexCount", "Number of vertices in the vertex data")
    uint16_t.const.p.member("IndexData", "Indices into the vertex data for each triangle")
    AutoSizeMul("3", "IndexData")..uint32_t.member("unTriangleCount", "Number of triangles in the mesh. Index count is 3 * TriangleCount.")
    TextureID_t.member(
        "diffuseTextureId",
        "Session unique texture identifier. Rendermodels which share the same texture will have the same id. 0 == texture not present."
    )
}

val RenderModel_TextureMap_t = struct(Module.OPENVR, "RenderModelTextureMap", nativeName = "RenderModel_TextureMap_t", mutable = false) {
    documentation = "A texture map for use on a render model."
    uint16_t.member("unWidth", "")
    uint16_t.member("unHeight", "width and height of the texture map in pixels")
    uint8_t.const.p.member(
        "rubTextureMapData",
        "Map texture data. All textures are RGBA with 8 bits per channel per pixel. Data size is width * height * 4ub"
    )
}

val RenderModel_ControllerMode_State_t = struct(Module.OPENVR, "RenderModelControllerModeState", nativeName = "RenderModel_ControllerMode_State_t") {
    bool.member("bScrollWheelVisible", "is this controller currently set to be in a scroll wheel mode")
}

val RenderModel_ComponentState_t = struct(Module.OPENVR, "RenderModelComponentState", nativeName = "RenderModel_ComponentState_t", mutable = false) {
    documentation = "Describes state information about a render-model component, including transforms and other dynamic properties."

    HmdMatrix34_t.member("mTrackingToComponentRenderModel", "Transform required when drawing the component render model")
    HmdMatrix34_t.member("mTrackingToComponentLocal", "Transform available for attaching to a local component coordinate system (-Z out from surface )")
    VRComponentProperties.member("uProperties", "")
}

val CameraVideoStreamFrameHeader_t = struct(Module.OPENVR, "CameraVideoStreamFrameHeader", nativeName = "CameraVideoStreamFrameHeader_t", mutable = false) {
    EVRTrackedCameraFrameType.member("eFrameType", "")

    uint32_t.member("nWidth", "")
    uint32_t.member("nHeight", "")
    uint32_t.member("nBytesPerPixel", "")

    uint32_t.member("nFrameSequence", "")

    TrackedDevicePose_t.member("standingTrackedDevicePose", "")
}

val DriverDirectMode_FrameTiming = struct(Module.OPENVR, "DriverDirectModeFrameTiming", nativeName = "DriverDirectMode_FrameTiming", mutable = false) {
    documentation = "Frame timing data provided by direct mode drivers."

    uint32_t.member("m_nSize", "sSet to {@code sizeof( DriverDirectMode_FrameTiming )}")
	uint32_t.member("m_nNumFramePresents", "number of times frame was presented")
	uint32_t.member("m_nNumMisPresented", "number of times frame was presented on a vsync other than it was originally predicted to")
	uint32_t.member("m_nNumDroppedFrames", "number of additional times previous frame was scanned out (i.e. compositor missed vsync)")
	uint32_t.member("m_nReprojectionFlags", "")
}

val ImuSample_t = struct(Module.OPENVR, "ImuSample", nativeName = "ImuSample_t", mutable = false) {
    double.member("fSampleTime", "")
	HmdVector3d_t.member("vAccel", "")
	HmdVector3d_t.member("vGyro", "")
	uint32_t.member("unOffScaleFlags", "")
}

val VROverlayIntersectionParams_t = struct(Module.OPENVR, "VROverlayIntersectionParams", nativeName = "VROverlayIntersectionParams_t") {
    HmdVector3_t.member("vSource", "")
    HmdVector3_t.member("vDirection", "")
    ETrackingUniverseOrigin.member("eOrigin", "")
}

val VROverlayIntersectionResults_t = struct(Module.OPENVR, "VROverlayIntersectionResults", nativeName = "VROverlayIntersectionResults_t", mutable = false) {
    HmdVector3_t.member("vPoint", "")
    HmdVector3_t.member("vNormal", "")
    HmdVector2_t.member("vUVs", "")
    float.member("fDistance", "")
}