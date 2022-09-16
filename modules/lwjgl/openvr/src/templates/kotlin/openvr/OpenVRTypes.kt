/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr

import org.lwjgl.generator.*

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
val EVRSpatialAnchorError = "EVRSpatialAnchorError".enumType

val EVRApplicationProperty = "EVRApplicationProperty".enumType
val EVRApplicationType = "EVRApplicationType".enumType
val EVRButtonId = "EVRButtonId".enumType
val EVRCompositorTimingMode = "EVRCompositorTimingMode".enumType
val EVRControllerAxisType = "EVRControllerAxisType".enumType
val EVRDebugError = "EVRDebugError".enumType
val EVREye = "EVREye".enumType
val EVREventType = "EVREventType".enumType
val EVRNotificationStyle = "EVRNotificationStyle".enumType
val EVRNotificationType = "EVRNotificationType".enumType
val EVROverlayIntersectionMaskPrimitiveType = "EVROverlayIntersectionMaskPrimitiveType".enumType
val EVRRenderModelTextureFormat = "EVRRenderModelTextureFormat".enumType
val EVRSceneApplicationState = "EVRSceneApplicationState".enumType
val EVRScreenshotPropertyFilenames = "EVRScreenshotPropertyFilenames".enumType
val EVRScreenshotType = "EVRScreenshotType".enumType
val EVRSubmitFlags = "EVRSubmitFlags".enumType
val EVRSummaryType = "EVRSummaryType".enumType
val EVRTrackedCameraFrameType = "EVRTrackedCameraFrameType".enumType
val EVRSkeletalTransformSpace = "EVRSkeletalTransformSpace".enumType
val EVRSkeletalMotionRange = "EVRSkeletalMotionRange".enumType
val EVRSkeletalReferencePose = "EVRSkeletalReferencePose".enumType
val EVRSkeletalTrackingLevel = "EVRSkeletalTrackingLevel".enumType

val ChaperoneCalibrationState = "ChaperoneCalibrationState".enumType

val EBlockQueueError = "EBlockQueueError".enumType
val EBlockQueueReadType = "EBlockQueueReadType".enumType
val EChaperoneConfigFile = "EChaperoneConfigFile".enumType
val EColorSpace = "EColorSpace".enumType
val EDeviceActivityLevel = "EDeviceActivityLevel".enumType
val EDeviceType = "EDeviceType".enumType
val EGamepadTextInputMode = "EGamepadTextInputMode".enumType
val EGamepadTextInputLineMode = "EGamepadTextInputLineMode".enumType
val EHDCPError = "EHDCPError".enumType
val EHiddenAreaMeshType = "EHiddenAreaMeshType".enumType
val EIOBufferMode = "EIOBufferMode".enumType
val EOverlayDirection = "EOverlayDirection".enumType
val EPropertyWriteType = "EPropertyWriteType".enumType
val EShowUIType = "EShowUIType".enumType
val ETextureType = "ETextureType".enumType
val ETrackedControllerRole = "ETrackedControllerRole".enumType
val ETrackedDeviceClass = "ETrackedDeviceClass".enumType
val ETrackedDeviceProperty = "ETrackedDeviceProperty".enumType
val ETrackedPropertyError = "ETrackedPropertyError".enumType
val ETrackingResult = "ETrackingResult".enumType
val ETrackingUniverseOrigin = "ETrackingUniverseOrigin".enumType

val HeadsetViewMode_t = "HeadsetViewMode_t".enumType

val VRMessageOverlayResponse = "VRMessageOverlayResponse".enumType
val VROverlayFlags = "VROverlayFlags".enumType
val VROverlayInputMethod = "VROverlayInputMethod".enumType
val VROverlayTransformType = "VROverlayTransformType".enumType

val PropertyContainerHandle_t = typedef(uint64_t, "PropertyContainerHandle_t")
val PropertyTypeTag_t = typedef(uint32_t, "PropertyTypeTag_t")
val DriverHandle_t = typedef(PropertyContainerHandle_t, "DriverHandle_t")
val VRActionHandle_t = typedef(uint64_t, "VRActionHandle_t")
val VRActionSetHandle_t = typedef(uint64_t, "VRActionSetHandle_t")
val VRInputValueHandle_t = typedef(uint64_t, "VRInputValueHandle_t")
val ScreenshotHandle_t = typedef(uint32_t, "ScreenshotHandle_t")
val TextureID_t = typedef(int32_t, "TextureID_t")
val TrackedCameraHandle_t = typedef(uint64_t, "TrackedCameraHandle_t")
val TrackedDeviceIndex_t = typedef(uint32_t, "TrackedDeviceIndex_t")
val WebConsoleHandle_t = typedef(uint64_t, "WebConsoleHandle_t")
val DriverId_t = typedef(uint32_t, "DriverId_t")
val PathHandle_t = typedef(uint64_t, "PathHandle_t")

val VRComponentProperties = typedef(uint32_t, "VRComponentProperties")
val VRNotificationId = typedef(uint32_t, "VRNotificationId")
val VROverlayHandle_t = typedef(uint64_t, "VROverlayHandle_t")
val BoneIndex_t = typedef(int32_t, "BoneIndex_t")
val IOBufferHandle_t = typedef(uint64_t, "IOBufferHandle_t")
val VrProfilerEventHandle_t = typedef(uint64_t, "VrProfilerEventHandle_t")

val SpatialAnchorHandle_t = typedef(uint32_t, "SpatialAnchorHandle_t")
val glSharedTextureHandle_t = typedef(opaque_p, "glSharedTextureHandle_t")
val glInt_t = typedef(int32_t, "glInt_t")
val glUInt_t = typedef(uint32_t, "glUInt_t")

val VkInstance_T = "VkInstance_T".opaque
val VkPhysicalDevice_T = "VkPhysicalDevice_T".opaque
val VkDevice_T = "VkDevice_T".opaque
val VkQueue_T = "VkQueue_T".opaque

val HmdMatrix34_t = struct(Module.OPENVR, "HmdMatrix34", nativeName = "HmdMatrix34_t") {
    float("m", "")[3 x 4]
}

val HmdMatrix33_t = struct(Module.OPENVR, "HmdMatrix33", nativeName = "HmdMatrix33_t") {
    float("m", "")[3 x 3]
}

val HmdMatrix44_t = struct(Module.OPENVR, "HmdMatrix44", nativeName = "HmdMatrix44_t") {
    float("m", "")[4 x 4]
}

val HmdVector3_t = struct(Module.OPENVR, "HmdVector3", nativeName = "HmdVector3_t") {
    float("v", "")[3]
}

val HmdVector4_t = struct(Module.OPENVR, "HmdVector4", nativeName = "HmdVector4_t") {
    float("v", "")[4]
}

val HmdVector3d_t = struct(Module.OPENVR, "HmdVector3d", nativeName = "HmdVector3d_t") {
    double("v", "")[3]
}

val HmdVector2_t = struct(Module.OPENVR, "HmdVector2", nativeName = "HmdVector2_t") {
    float("v", "")[2]
}

val HmdQuaternion_t = struct(Module.OPENVR, "HmdQuaternion", nativeName = "HmdQuaternion_t") {
    double("w", "")
    double("x", "")
    double("y", "")
    double("z", "")
}

val HmdQuaternionf_t = struct(Module.OPENVR, "HmdQuaternionf", nativeName = "HmdQuaternionf_t") {
    float("w", "")
    float("x", "")
    float("y", "")
    float("z", "")
}

val HmdColor_t = struct(Module.OPENVR, "HmdColor", nativeName = "HmdColor_t") {
    float("r", "")
    float("g", "")
    float("b", "")
    float("a", "")
}

val HmdQuad_t = struct(Module.OPENVR, "HmdQuad", nativeName = "HmdQuad_t") {
    HmdVector3_t("vCorners", "")[4]
}

val HmdRect2_t = struct(Module.OPENVR, "HmdRect2", nativeName = "HmdRect2_t") {
    HmdVector2_t("vTopLeft", "")
    HmdVector2_t("vBottomRight", "")
}

val DistortionCoordinates_t = struct(Module.OPENVR, "DistortionCoordinates", nativeName = "DistortionCoordinates_t", mutable = false) {
    documentation =
    """
    Used to return the post-distortion UVs for each color channel.

    UVs range from 0 to 1 with 0,0 in the upper left corner of the source render target. The 0,0 to 1,1 range covers a single eye.
    """

    float("rfRed", "the UVs for the red channel")[2]
    float("rfGreen", "the UVs for the green channel")[2]
    float("rfBlue", "the UVs for the blue channel")[2]
}

val Texture_t = struct(Module.OPENVR, "Texture", nativeName = "Texture_t") {
    opaque_p("handle", "") // See ETextureType definition above
    ETextureType("eType", "").links("ETextureType_\\w+")
    EColorSpace("eColorSpace", "").links("EColorSpace_\\w+")
}

val TrackedDevicePose_t = struct(Module.OPENVR, "TrackedDevicePose", nativeName = "TrackedDevicePose_t") {
    documentation = "Describes a single pose for a tracked object."

    HmdMatrix34_t("mDeviceToAbsoluteTracking", "")
    HmdVector3_t("vVelocity", "velocity in tracker space in m/s")
    HmdVector3_t("vAngularVelocity", "angular velocity in radians/s")
    ETrackingResult("eTrackingResult", "").links("ETrackingResult_\\w+")
    bool("bPoseIsValid", "")
    bool(
        "bDeviceIsConnected",
        "This indicates that there is a device connected for this spot in the pose array. It could go from true to false if the user unplugs the device."
    )
}

val VRTextureBounds_t = struct(Module.OPENVR, "VRTextureBounds", nativeName = "VRTextureBounds_t") {
    documentation = "Allows the application to control what part of the provided texture will be used in the frame buffer."

    float("uMin", "")
    float("vMin", "")
    float("uMax", "")
    float("vMax", "")
}

val VRTextureWithPose_t = struct(Module.OPENVR, "VRTextureWithPose", nativeName = "VRTextureWithPose_t") {
    documentation = "Allows specifying pose used to render provided scene texture (if different from value returned by #WaitGetPoses())."

    opaque_p("handle", "")
    ETextureType("eType", "")
    EColorSpace("eColorSpace", "")
    HmdMatrix34_t("mDeviceToAbsoluteTracking", "actual pose used to render scene textures")
}

val VRTextureDepthInfo_t = struct(Module.OPENVR, "VRTextureDepthInfo", nativeName = "VRTextureDepthInfo_t") {
    documentation = ""

    opaque_p("handle", "")
    HmdMatrix44_t("mProjection", "")
    HmdVector2_t("vRange", "")
}

val VRTextureWithDepth_t = struct(Module.OPENVR, "VRTextureWithDepth", nativeName = "VRTextureWithDepth_t") {
    documentation = ""

    opaque_p("handle", "")
    ETextureType("eType", "")
    EColorSpace("eColorSpace", "")
    VRTextureDepthInfo_t("depth", "")
}

val VRTextureWithPoseAndDepth_t = struct(Module.OPENVR, "VRTextureWithPoseAndDepth", nativeName = "VRTextureWithPoseAndDepth_t") {
    documentation = ""

    opaque_p("handle", "")
    ETextureType("eType", "")
    EColorSpace("eColorSpace", "")
    HmdMatrix34_t("mDeviceToAbsoluteTracking", "")
    VRTextureDepthInfo_t("depth", "")
}

val VRVulkanTextureData_t = struct(Module.OPENVR, "VRVulkanTextureData", nativeName = "VRVulkanTextureData_t") {
    documentation =
        """
        Data required for passing Vulkan textures to #Submit(). Be sure to call #ShutdownInternal() before destroying these resources.

        Please see <a href="https://github.com/ValveSoftware/openvr/wiki/Vulkan">https://github.com/ValveSoftware/openvr/wiki/Vulkan</a> for Vulkan-specific
        documentation.
        """

    uint64_t("m_nImage", "VkImage")
    VkDevice_T.p("m_pDevice", "")
    VkPhysicalDevice_T.p("m_pPhysicalDevice", "")
    VkInstance_T.p("m_pInstance", "")
    VkQueue_T.p("m_pQueue", "")
    uint32_t("m_nQueueFamilyIndex", "")
    uint32_t("m_nWidth", "")
    uint32_t("m_nHeight", "")
    uint32_t("m_nFormat", "")
    uint32_t("m_nSampleCount", "")
}

val VRVulkanTextureArrayData_t = struct(Module.OPENVR, "VRVulkanTextureArrayData", nativeName = "VRVulkanTextureArrayData_t") {
    documentation =
        """
        Data required for passing Vulkan textures to #Submit(). Be sure to call #ShutdownInternal() before destroying these resources.
        
        Please see <a href="https://github.com/ValveSoftware/openvr/wiki/Vulkan">https://github.com/ValveSoftware/openvr/wiki/Vulkan</a> for Vulkan-specific
        documentation.
        """

    uint32_t("m_unArrayIndex", "")
    uint32_t("m_unArraySize", "")
}

val VREvent_Controller_t = struct(Module.OPENVR, "VREventController", nativeName = "VREvent_Controller_t", mutable = false) {
    documentation = "Used for controller button events."

    uint32_t("button", "").links("EVRButtonId_\\w+")
}

val VREvent_Mouse_t = struct(Module.OPENVR, "VREventMouse", nativeName = "VREvent_Mouse_t", mutable = false) {
    documentation = "Used for simulated mouse events in overlay space."

    float("x", "coords are in GL space, bottom left of the texture is 0,0")
    float("y", "")
    uint32_t("button", "").links("EVRMouseButton_\\w+")
}

val VREvent_Scroll_t = struct(Module.OPENVR, "VREventScroll", nativeName = "VREvent_Scroll_t", mutable = false) {
    documentation = "Used for simulated mouse wheel scroll."

    float("xdelta", "movement in fraction of the pad traversed since last delta, 1.0 for a full swipe")
    float("ydelta", "")
    uint32_t("unused", "")
    float(
        "viewportscale",
        "for scrolling on an overlay with laser mouse, this is the overlay's vertical size relative to the overlay height. Range: {@code [0,1]}"
    )
}

val VREvent_Process_t = struct(Module.OPENVR, "VREventProcess", nativeName = "VREvent_Process_t", mutable = false) {
    documentation = "Used for events about processes."

    uint32_t("pid", "")
    uint32_t("oldPid", "")
    bool("bForced", "")
    bool("bConnectionLost", "if the associated event was triggered by a connection loss")
}

val VREvent_Notification_t = struct(Module.OPENVR, "VREventNotification", nativeName = "VREvent_Notification_t", mutable = false) {
    documentation = "Notification related events. Details will still change at this point."

    uint64_t("ulUserValue", "")
    uint32_t("notificationId", "")
}

val VREvent_Overlay_t = struct(Module.OPENVR, "VREventOverlay", nativeName = "VREvent_Overlay_t", mutable = false) {
    documentation = "Used for a few events about overlays."

    uint64_t("overlayHandle", "").links("EVRState_\\w+")
    uint64_t("devicePath", "")
    uint64_t("memoryBlockId", "")
}

val VREvent_Status_t = struct(Module.OPENVR, "VREventStatus", nativeName = "VREvent_Status_t", mutable = false) {
    documentation = "Used for a few events about overlays."

    uint32_t("statusState", "")
}

val VREvent_Keyboard_t = struct(Module.OPENVR, "VREventKeyboard", nativeName = "VREvent_Keyboard_t", mutable = false) {
    documentation = "Used for keyboard events."

    char("cNewInput", "up to 8 bytes of new input")[8]
    uint64_t("uUserValue", "possible flags about the new input")
}

val VREvent_Ipd_t = struct(Module.OPENVR, "VREventIpd", nativeName = "VREvent_Ipd_t", mutable = false) {
    float("ipdMeters", "")
}

val VREvent_Chaperone_t = struct(Module.OPENVR, "VREventChaperone", nativeName = "VREvent_Chaperone_t", mutable = false) {
    uint64_t("m_nPreviousUniverse", "")
    uint64_t("m_nCurrentUniverse", "")
}

val VREvent_Reserved_t = struct(Module.OPENVR, "VREventReserved", nativeName = "VREvent_Reserved_t", mutable = false) {
    documentation = "Not actually used for any events."

    uint64_t("reserved0", "")
    uint64_t("reserved1", "")
    uint64_t("reserved2", "")
    uint64_t("reserved3", "")
    uint64_t("reserved4", "")
    uint64_t("reserved5", "")
}

val VREvent_PerformanceTest_t = struct(Module.OPENVR, "VREventPerformanceTest", nativeName = "VREvent_PerformanceTest_t", mutable = false) {
    uint32_t("m_nFidelityLevel", "")
}

val VREvent_TouchPadMove_t = struct(Module.OPENVR, "VREventTouchPadMove", nativeName = "VREvent_TouchPadMove_t", mutable = false) {
    documentation =
    """
    When in mouse input mode you can receive data from the touchpad, these events are only sent if the users finger is on the touchpad (or just released from
    it). These events are sent to overlays with the #VROverlayFlags_SendVRTouchpadEvents flag set.
    """

    bool("bFingerDown", "true if the users finger is detected on the touch pad")
    float("flSecondsFingerDown", "how long the finger has been down in seconds")
    float("fValueXFirst", "these values indicate the starting finger position (so you can do some basic swipe stuff)")
    float("fValueYFirst", "")
    float("fValueXRaw", "this is the raw sampled coordinate without deadzoning")
    float("fValueYRaw", "")
}

val VREvent_SeatedZeroPoseReset_t = struct(Module.OPENVR, "VREventSeatedZeroPoseReset", nativeName = "VREvent_SeatedZeroPoseReset_t", mutable = false) {
    bool("bResetBySystemMenu", "")
}

val VREvent_Screenshot_t = struct(Module.OPENVR, "VREventScreenshot", nativeName = "VREvent_Screenshot_t", mutable = false) {
    uint32_t("handle", "")
    uint32_t("type", "")
}

val VREvent_ScreenshotProgress_t = struct(Module.OPENVR, "VREventScreenshotProgress", nativeName = "VREvent_ScreenshotProgress_t", mutable = false) {
    float("progress", "")
}

val VREvent_ApplicationLaunch_t = struct(Module.OPENVR, "VREventApplicationLaunch", nativeName = "VREvent_ApplicationLaunch_t", mutable = false) {
    uint32_t("pid", "")
    uint32_t("unArgsHandle", "")
}

val VREvent_EditingCameraSurface_t = struct(Module.OPENVR, "VREventEditingCameraSurface", nativeName = "VREvent_EditingCameraSurface_t", mutable = false) {
    uint64_t("overlayHandle", "")
    uint32_t("nVisualMode", "")
}

val VREvent_MessageOverlay_t = struct(Module.OPENVR, "VREventMessageOverlay", nativeName = "VREvent_MessageOverlay_t", mutable = false) {
    uint32_t("unVRMessageOverlayResponse", "").links("VRMessageOverlayResponse_\\w+")
}

val VREvent_Property_t = struct(Module.OPENVR, "VREventProperty", nativeName = "VREvent_Property_t", mutable = false) {
    PropertyContainerHandle_t("container", "")
    ETrackedDeviceProperty("prop", "").links("ETrackedDeviceProperty_\\w+")
}

val VREvent_HapticVibration_t = struct(Module.OPENVR, "VREventHapticVibration", nativeName = "VREvent_HapticVibration_t", mutable = false) {
    uint64_t("containerHandle", "property container handle of the device with the haptic component")
	uint64_t("componentHandle", "which haptic component needs to vibrate")
	float("fDurationSeconds", "")
	float("fFrequency", "")
	float("fAmplitude", "")
}

val VREvent_WebConsole_t = struct(Module.OPENVR, "VREventWebConsole", nativeName = "VREvent_WebConsole_t", mutable = false) {
    WebConsoleHandle_t("webConsoleHandle", "")
}

val VREvent_InputBindingLoad_t = struct(Module.OPENVR, "VREventInputBindingLoad", nativeName = "VREvent_InputBindingLoad_t", mutable = false) {
    PropertyContainerHandle_t("ulAppContainer", "")
	uint64_t("pathMessage", "")
	uint64_t("pathUrl", "")
    uint64_t("pathControllerType", "")
}

val VREvent_InputActionManifestLoad_t = struct(Module.OPENVR, "VREventInputActionManifestLoad", nativeName = "VREvent_InputActionManifestLoad_t", mutable = false) {
	uint64_t("pathAppKey", "")
	uint64_t("pathMessage", "")
	uint64_t("pathMessageParam", "")
	uint64_t("pathManifestPath", "")
}

val VREvent_SpatialAnchor_t = struct(Module.OPENVR, "VREventSpatialAnchor", nativeName = "VREvent_SpatialAnchor_t", mutable = false) {
	SpatialAnchorHandle_t("unHandle", "")
}

val VREvent_ProgressUpdate_t = struct(Module.OPENVR, "VREventProgressUpdate", nativeName = "VREvent_ProgressUpdate_t", mutable = false) {
	uint64_t("ulApplicationPropertyContainer", "")
	uint64_t("pathDevice", "")
	uint64_t("pathInputSource", "")
	uint64_t("pathProgressAction", "")
	uint64_t("pathIcon", "")
	float("fProgress", "")
}

val VREvent_ShowUI_t = struct(Module.OPENVR, "VREventShowUI", nativeName = "VREvent_ShowUI_t", mutable = false) {
	EShowUIType("eType", "")
}

val VREvent_ShowDevTools_t = struct(Module.OPENVR, "VREventShowDevTools", nativeName = "VREvent_ShowDevTools_t", mutable = false) {
	int32_t("nBrowserIdentifier", "")
}

val VREvent_HDCPError_t = struct(Module.OPENVR, "VREventHDCPError", nativeName = "VREvent_HDCPError_t", mutable = false) {
	EHDCPError("eCode", "")
}

val VREvent_Data_t = union(Module.OPENVR, "VREventData", nativeName = "VREvent_Data_t", mutable = false) {
    VREvent_Reserved_t("reserved", "")
    VREvent_Controller_t("controller", "")
    VREvent_Mouse_t("mouse", "")
    VREvent_Scroll_t("scroll", "")
    VREvent_Process_t("process", "")
    VREvent_Notification_t("notification", "")
    VREvent_Overlay_t("overlay", "")
    VREvent_Status_t("status", "")
    VREvent_Keyboard_t("keyboard", "")
    VREvent_Ipd_t("ipd", "")
    VREvent_Chaperone_t("chaperone", "")
    VREvent_PerformanceTest_t("performanceTest", "")
    VREvent_TouchPadMove_t("touchPadMove", "")
    VREvent_SeatedZeroPoseReset_t("seatedZeroPoseReset", "")
    VREvent_Screenshot_t("screenshot", "")
    VREvent_ScreenshotProgress_t("screenshotProgress", "")
    VREvent_ApplicationLaunch_t("applicationLaunch", "")
    VREvent_EditingCameraSurface_t("cameraSurface", "")
    VREvent_MessageOverlay_t("messageOverlay", "")
    VREvent_Property_t("property", "")
    VREvent_HapticVibration_t("hapticVibration", "")
    VREvent_WebConsole_t("webConsole", "")
    VREvent_InputBindingLoad_t("inputBinding", "")
	VREvent_InputActionManifestLoad_t("actionManifest", "")
	VREvent_SpatialAnchor_t("spatialAnchor", "")
}

val VREvent_t = struct(Module.OPENVR, "VREvent", nativeName = "VREvent_t", mutable = false) {
    documentation = "An event posted by the server to all running applications."

    pack("Platform.get() == Platform.LINUX || Platform.get() == Platform.MACOSX ? 4 : DEFAULT_PACK_ALIGNMENT")

    uint32_t("eventType", "the type of the event").links("EVREventType_\\w+")
    TrackedDeviceIndex_t(
        "trackedDeviceIndex",
        "the tracked device index of the event. For events that aren't connected to a tracked device this is #k_unTrackedDeviceIndexInvalid."
    )
    float("eventAgeSeconds", "the age of the event in seconds")
    VREvent_Data_t(
        "data",
        """
        more information about the event. This is a union of several structs. See the event type enum for information about which union member to look at for
        each event.
        """
    )
}

val IntersectionMaskRectangle_t = struct(Module.OPENVR, "IntersectionMaskRectangle", nativeName = "IntersectionMaskRectangle_t") {
    float("m_flTopLeftX", "")
    float("m_flTopLeftY", "")
    float("m_flWidth", "")
    float("m_flHeight", "")
}

val IntersectionMaskCircle_t = struct(Module.OPENVR, "IntersectionMaskCircle", nativeName = "IntersectionMaskCircle_t") {
    float("m_flCenterX", "")
    float("m_flCenterY", "")
    float("m_flRadius", "")
}

val VROverlayProjection_t = struct(Module.OPENVR, "VROverlayProjection", nativeName = "VROverlayProjection_t") {
    documentation = "Defines the project used in an overlay that is using #SetOverlayTransformProjection()."

    float("fLeft", "tangent of the left side of the frustum")
    float("fRight", "tangent of the right side of the frustum")
    float("fTop", "tangent of the top side of the frustum")
    float("fBottom", "tangent of the bottom side of the frustum")
}

val VROverlayView_t = struct(Module.OPENVR, "VROverlayView_t", mutable = false) {
    VROverlayHandle_t("overlayHandle", "")
    Texture_t("texture", "")
    VRTextureBounds_t("textureBounds", "")
}

val VRVulkanDevice_t = struct(Module.OPENVR, "VRVulkanDevice", nativeName = "VRVulkanDevice_t") {
    VkInstance_T.p("m_pInstance", "")
    VkDevice_T.p("m_pDevice", "")
    VkPhysicalDevice_T.p("m_pPhysicalDevice", "")
    VkQueue_T.p("m_pQueue", "")
    uint32_t("m_uQueueFamilyIndex", "")
}

val VRNativeDevice_t = struct(Module.OPENVR, "VRNativeDevice", nativeName = "VRNativeDevice_t") {
    opaque_p("handle", "")
    EDeviceType("eType", "", )
}

val VROverlayIntersectionMaskPrimitive_Data_t = union(Module.OPENVR, "VROverlayIntersectionMaskPrimitiveData", nativeName = "VROverlayIntersectionMaskPrimitive_Data_t") {
    IntersectionMaskRectangle_t("m_Rectangle", "")
    IntersectionMaskCircle_t("m_Circle", "")
}

val VROverlayIntersectionMaskPrimitive_t = struct(Module.OPENVR, "VROverlayIntersectionMaskPrimitive", nativeName = "VROverlayIntersectionMaskPrimitive_t") {
    EVROverlayIntersectionMaskPrimitiveType("m_nPrimitiveType", "")
    VROverlayIntersectionMaskPrimitive_Data_t("m_Primitive", "")
}

val HiddenAreaMesh_t = struct(Module.OPENVR, "HiddenAreaMesh", nativeName = "HiddenAreaMesh_t", mutable = false) {
    documentation =
    """
    The mesh to draw into the stencil (or depth) buffer to perform early stencil (or depth) kills of pixels that will never appear on the HMD. This mesh draws
    on all the pixels that will be hidden after distortion.

    If the HMD does not provide a visible area mesh {@code pVertexData} will be #NULL and {@code unTriangleCount} will be 0.
    """

    HmdVector2_t.p("pVertexData", "")
    AutoSize("pVertexData", optional = true)..uint32_t("unTriangleCount", "")
}

val VRControllerAxis_t = struct(Module.OPENVR, "VRControllerAxis", nativeName = "VRControllerAxis_t") {
    documentation = "Contains information about one axis on the controller."

    float("x", "Ranges from -1.0 to 1.0 for joysticks and track pads. Ranges from 0.0 to 1.0 for triggers were 0 is fully released.")
    float("y", "Ranges from -1.0 to 1.0 for joysticks and track pads. Is always 0.0 for triggers.")
}

val VRControllerState_t = struct(Module.OPENVR, "VRControllerState", nativeName = "VRControllerState_t") {
    documentation = "Holds all the state of a controller at one moment in time."

    uint32_t(
        "unPacketNum",
        "If packet num matches that on your prior call, then the controller state hasn't been changed since your last call and there is no need to process it."
    )
    uint64_t("ulButtonPressed", "bit flags for each of the buttons. Use {@code ButtonMaskFromId} to turn an ID into a mask")
    uint64_t("ulButtonTouched", "")
    VRControllerAxis_t("rAxis", "axis data for the controller's analog inputs")[5]
}

val VRBoneTransform_t = struct(Module.OPENVR, "VRBoneTransform", nativeName = "VRBoneTransform_t", mutable = false) {
    documentation = "Holds the transform for a single bone."

    HmdVector4_t("position", "")
	HmdQuaternionf_t("orientation", "")
}

val Compositor_FrameTiming = struct(Module.OPENVR, "CompositorFrameTiming", nativeName = "Compositor_FrameTiming", mutable = false) {
    documentation = "Provides a single frame's timing information to the app."

    uint32_t("m_nSize", "Set to {@code sizeof( Compositor_FrameTiming )}")
    uint32_t("m_nFrameIndex", "")
    uint32_t("m_nNumFramePresents", "number of times this frame was presented")
    uint32_t("m_nNumMisPresented", "number of times this frame was presented on a vsync other than it was originally predicted to")
    uint32_t("m_nNumDroppedFrames", "number of additional times previous frame was scanned out")
    uint32_t("m_nReprojectionFlags", "")

    double("m_flSystemTimeInSeconds", "Absolute time reference for comparing frames. This aligns with the vsync that running start is relative to.")

    /** These times may include work from other processes due to OS scheduling.
     * The fewer packets of work these are broken up into, the less likely this will happen.
     * GPU work can be broken up by calling Flush.  This can sometimes be useful to get the GPU started
     * processing that work earlier in the frame. */
    float("m_flPreSubmitGpuMs", "time spent rendering the scene (gpu work submitted between WaitGetPoses and second Submit)")
    float("m_flPostSubmitGpuMs", "additional time spent rendering by application (e.g. companion window)")
    float("m_flTotalRenderGpuMs", "time between work submitted immediately after present (ideally vsync) until the end of compositor submitted work")
    float("m_flCompositorRenderGpuMs", "time spend performing distortion correction, rendering chaperone, overlays, etc.")
    float("m_flCompositorRenderCpuMs", "time spent on cpu submitting the above work for this frame")
    float("m_flCompositorIdleCpuMs", "time spent waiting for running start (application could have used this much more time)")

    /** Miscellaneous measured intervals. */
    float("m_flClientFrameIntervalMs", "time between calls to #WaitGetPoses()")
    float("m_flPresentCallCpuMs", "time blocked on call to present (usually 0.0, but can go long)")
    float("m_flWaitForPresentCpuMs", "time spent spin-waiting for frame index to change (not near-zero indicates wait object failure)")
    float("m_flSubmitFrameMs", "time spent in #Submit() (not near-zero indicates driver issue)")

    /** The following are all relative to this frame's SystemTimeInSeconds */
    float("m_flWaitGetPosesCalledMs", "")
    float("m_flNewPosesReadyMs", "")
    float("m_flNewFrameReadyMs", "second call to #Submit()")
    float("m_flCompositorUpdateStartMs", "")
    float("m_flCompositorUpdateEndMs", "")
    float("m_flCompositorRenderStartMs", "")

    TrackedDevicePose_t("m_HmdPose", "pose used by app to render this frame")

    uint32_t("m_nNumVSyncsReadyForUse", "")
	uint32_t("m_nNumVSyncsToFirstView", "")
}

val Compositor_CumulativeStats = struct(Module.OPENVR, "CompositorCumulativeStats", nativeName = "Compositor_CumulativeStats", mutable = false) {
    documentation =
    """
    Cumulative stats for current application.  These are not cleared until a new app connects, but they do stop accumulating once the associated app
    disconnects.
    """

    uint32_t("m_nPid", "Process id associated with these stats (may no longer be running).")
    uint32_t("m_nNumFramePresents", "total number of times we called present (includes reprojected frames)")
    uint32_t("m_nNumDroppedFrames", "total number of times an old frame was re-scanned out (without reprojection)")
    uint32_t("m_nNumReprojectedFrames", "total number of times a frame was scanned out a second time (with reprojection)")

    /** Values recorded at startup before application has fully faded in the first time. */
    uint32_t("m_nNumFramePresentsOnStartup", "")
    uint32_t("m_nNumDroppedFramesOnStartup", "")
    uint32_t("m_nNumReprojectedFramesOnStartup", "")

    /** Applications may explicitly fade to the compositor.  This is usually to handle level transitions, and loading often causes
     * system wide hitches.  The following stats are collected during this period.  Does not include values recorded during startup. */
    uint32_t("m_nNumLoading", "")
    uint32_t("m_nNumFramePresentsLoading", "")
    uint32_t("m_nNumDroppedFramesLoading", "")
    uint32_t("m_nNumReprojectedFramesLoading", "")

    /** If we don't get a new frame from the app in less than 2.5 frames, then we assume the app has hung and start
     * fading back to the compositor.  The following stats are a result of this, and are a subset of those recorded above.
     * Does not include values recorded during start up or loading. */
    uint32_t("m_nNumTimedOut", "")
    uint32_t("m_nNumFramePresentsTimedOut", "")
    uint32_t("m_nNumDroppedFramesTimedOut", "")
    uint32_t("m_nNumReprojectedFramesTimedOut", "")
}

val Compositor_StageRenderSettings = struct(Module.OPENVR, "CompositorStageRenderSettings", nativeName = "Compositor_StageRenderSettings", mutable = false) {
    HmdColor_t("m_PrimaryColor", "Primary color is applied as a tint to (i.e. multiplied with) the model's texture.")
    HmdColor_t("m_SecondaryColor", "")

    float(
        "m_flVignetteInnerRadius",
        "Vignette radius is in meters and is used to fade to the specified secondary solid color over that 3D distance from the origin of the playspace."
    )
    float("m_flVignetteOuterRadius", "")

    float(
        "m_flFresnelStrength",
        """
        Fades to the secondary color based on view incidence.

        This variable controls the linearity of the effect. It is mutually exclusive with vignette. Additionally, it treats the mesh as faceted.
        """
    )

    bool("m_bBackfaceCulling", "Controls backface culling.")

    bool(
        "m_bGreyscale",
        """
        Converts the render model's texture to luma and applies to rgb equally.

        This is useful to combat compression artifacts that can occur on desaturated source material.
        """
    )

    bool("m_bWireframe", "Renders mesh as a wireframe.")
}

val NotificationBitmap_t = struct(Module.OPENVR, "NotificationBitmap", nativeName = "NotificationBitmap_t") {
    documentation = "Used for passing graphic data."

    void.p("m_pImageData", "")
    int32_t("m_nWidth", "")
    int32_t("m_nHeight", "")
    int32_t("m_nBytesPerPixel", "")
}

val InputAnalogActionData_t = struct(Module.OPENVR, "InputAnalogActionData", nativeName = "InputAnalogActionData_t", mutable = false) {
    bool("bActive", "whether or not this action is currently available to be bound in the active action set")
	VRInputValueHandle_t("activeOrigin", "the origin that caused this action's current state")
	float("x", "the current state of this action; will be delta updates for mouse actions")
	float("y", "the current state of this action; will be delta updates for mouse actions")
	float("z", "the current state of this action; will be delta updates for mouse actions")
	float("deltaX", "teltas since the previous call to #UpdateActionState()")
	float("deltaY", "teltas since the previous call to #UpdateActionState()")
	float("deltaZ", "teltas since the previous call to #UpdateActionState()")
	float("fUpdateTime", "time relative to now when this event happened. Will be negative to indicate a past time")
}

val InputDigitalActionData_t = struct(Module.OPENVR, "InputDigitalActionData", nativeName = "InputDigitalActionData_t", mutable = false) {
    bool("bActive", "whether or not this action is currently available to be bound in the active action set")
	VRInputValueHandle_t("activeOrigin", "the origin that caused this action's current state")
	bool("bState", "the current state of this action; will be true if currently pressed")
	bool("bChanged", "this is true if the state has changed since the last frame")
	float("fUpdateTime", "time relative to now when this event happened. Will be negative to indicate a past time.")
}

val InputPoseActionData_t = struct(Module.OPENVR, "InputPoseActionData", nativeName = "InputPoseActionData_t", mutable = false) {
    bool("bActive", "whether or not this action is currently available to be bound in the active action set")
	VRInputValueHandle_t("activeOrigin", "the origin that caused this action's current state")
	TrackedDevicePose_t("pose", "the current state of this action")
}

val InputSkeletalActionData_t = struct(Module.OPENVR, "InputSkeletalActionData", nativeName = "InputSkeletalActionData_t", mutable = false) {
    bool("bActive", "whether or not this action is currently available to be bound in the active action set")
	VRInputValueHandle_t("activeOrigin", "the origin that caused this action's current state")
}

val InputOriginInfo_t = struct(Module.OPENVR, "InputOriginInfo", nativeName = "InputOriginInfo_t", mutable = false) {
    VRInputValueHandle_t("devicePath", "")
	TrackedDeviceIndex_t("trackedDeviceIndex", "")
    charUTF8("rchRenderModelComponentName", "")[128]
}

val InputBindingInfo_t = struct(Module.OPENVR, "InputBindingInfo", nativeName = "InputBindingInfo_t", mutable = false) {
    charASCII("rchDevicePathName", "")[128]
	charASCII("rchInputPathName", "")[128]
	charASCII("rchModeName", "")[128]
	charASCII("rchSlotName", "")[128]
    charASCII("rchInputSourceType", "")[32]
}

val VRActiveActionSet_t = struct(Module.OPENVR, "VRActiveActionSet", nativeName = "VRActiveActionSet_t") {
    VRActionSetHandle_t("ulActionSet", "this is the handle of the action set to activate for this frame")
	VRInputValueHandle_t(
        "ulRestrictedToDevice",
        "this is the handle of a device path that this action set should be active for. To activate for all devices, set this to #k_ulInvalidInputValueHandle.")
	VRActionSetHandle_t(
        "ulSecondaryActionSet",
        """
        the action set to activate for all devices other than {@code ulRestrictedDevice}. If {@code ulRestrictedToDevice} is set to
        #k_ulInvalidInputValueHandle, this parameter is ignored.
        """
    )
    padding(4)
	int32_t(
        "nPriority",
        """
        the priority of this action set relative to other action sets. Any inputs bound to a source (e.g. trackpad, joystick, trigger) will disable bindings in
        other active action sets with a smaller priority.

        Overlay applications (i.e. ApplicationType_Overlay) may set their action set priority to a value between #k_nActionSetOverlayGlobalPriorityMin and
        #k_nActionSetOverlayGlobalPriorityMax to cause any inputs bound to a source used by that action set to be disabled in scene applications.
		
        No action set priority may value may be larger than #k_nActionSetPriorityReservedMin.
        """
    )
}

val VRSkeletalSummaryData_t = struct(Module.OPENVR, "VRSkeletalSummaryData", nativeName = "VRSkeletalSummaryData_t", mutable = false) {
    documentation = "Contains summary information about the current skeletal pose."

	float(
        "flFingerCurl",
        """
        The amount that each finger is 'curled' inwards towards the palm.

        In the case of the thumb, this represents how much the thumb is wrapped around the fist. 0 means straight, 1 means fully curled.
        """
    )[5]
	float(
        "flFingerSplay",
        """
        The amount that each pair of adjacent fingers are separated.

        0 means the digits are touching, 1 means they are fully separated.
        """
    )[4]
}

val SpatialAnchorPose_t = struct(Module.OPENVR, "SpatialAnchorPose", nativeName = "SpatialAnchorPose_t", mutable = false) {
	HmdMatrix34_t("mAnchorToAbsoluteTracking", "")
}

val PropertyWrite_t = struct(Module.OPENVR, "PropertyWrite", nativeName = "PropertyWrite_t") {
    ETrackedDeviceProperty("prop", "").links("ETrackedDeviceProperty_\\w+")
    EPropertyWriteType("writeType", "").links("EPropertyWriteType_\\w+")
    ETrackedPropertyError("eSetError", "").links("ETrackedPropertyError_\\w+")
    void.p("pvBuffer", "");
    AutoSize("pvBuffer")..uint32_t("unBufferSize", "")
    PropertyTypeTag_t("unTag", "")
    ETrackedPropertyError("eError", "").links("ETrackedPropertyError_\\w+")
}

val PropertyRead_t = struct(Module.OPENVR, "PropertyRead", nativeName = "PropertyRead_t") {
    ETrackedDeviceProperty("prop", "").links("ETrackedDeviceProperty_\\w+")
    void.p("pvBuffer", "");
    AutoSize("pvBuffer")..uint32_t("unBufferSize", "")
    PropertyTypeTag_t("unTag", "")
    uint32_t("unRequiredBufferSize", "")
    ETrackedPropertyError("eError", "").links("ETrackedPropertyError_\\w+")
}

/*
val CVRPropertyHelpers = struct(Module.OPENVR, "CVRPropertyHelpers", mutable = false) {
    intptr_t("m_pProperties", "")
}
*/

val PathWrite_t = struct(Module.OPENVR, "PathWrite", nativeName = "PathWrite_t") {
    PathHandle_t("ulPath", "")
    EPropertyWriteType("writeType", "").links("EPropertyWriteType_\\w+")
    ETrackedPropertyError("eSetError", "").links("ETrackedPropertyError_\\w+")
    void.p("pvBuffer", "");
    AutoSize("pvBuffer")..uint32_t("unBufferSize", "")
    PropertyTypeTag_t("unTag", "")
    ETrackedPropertyError("eError", "").links("ETrackedPropertyError_\\w+")
    charASCII.p("pszPath", "")
}

val PathRead_t = struct(Module.OPENVR, "PathRead", nativeName = "PathRead_t") {
    PathHandle_t("ulPath", "")
    void.p("pvBuffer", "");
    AutoSize("pvBuffer")..uint32_t("unBufferSize", "")
    PropertyTypeTag_t("unTag", "")
    uint32_t("unRequiredBufferSize", "")
    ETrackedPropertyError("eError", "").links("ETrackedPropertyError_\\w+")
    charASCII.p("pszPath", "")
}

val RenderModel_Vertex_t = struct(Module.OPENVR, "RenderModelVertex", nativeName = "RenderModel_Vertex_t", mutable = false) {
    documentation = "A single vertex in a render model."

    HmdVector3_t("vPosition", "position in meters in device space")
    HmdVector3_t("vNormal", "")
    float("rfTextureCoord", "")[2]
}

val RenderModel_t = struct(Module.OPENVR, "RenderModel", nativeName = "RenderModel_t", mutable = false) {
    pack("Platform.get() == Platform.LINUX || Platform.get() == Platform.MACOSX ? 4 : DEFAULT_PACK_ALIGNMENT")

    RenderModel_Vertex_t.const.p("rVertexData", "Vertex data for the mesh")
    AutoSize("rVertexData")..uint32_t("unVertexCount", "Number of vertices in the vertex data")
    uint16_t.const.p("IndexData", "Indices into the vertex data for each triangle")
    AutoSizeMul("3", "IndexData")..uint32_t("unTriangleCount", "Number of triangles in the mesh. Index count is 3 * TriangleCount.")
    TextureID_t(
        "diffuseTextureId",
        "Session unique texture identifier. Rendermodels which share the same texture will have the same id. 0 == texture not present."
    )
}

val RenderModel_TextureMap_t = struct(Module.OPENVR, "RenderModelTextureMap", nativeName = "RenderModel_TextureMap_t", mutable = false) {
    documentation = "A texture map for use on a render model."

    pack("Platform.get() == Platform.LINUX || Platform.get() == Platform.MACOSX ? 4 : DEFAULT_PACK_ALIGNMENT")

    uint16_t("unWidth", "")
    uint16_t("unHeight", "width and height of the texture map in pixels")
    uint8_t.const.p("rubTextureMapData", "Map texture data.")
    EVRRenderModelTextureFormat("format", "").links("EVRRenderModelTextureFormat_\\w+")
    uint16_t("unMipLevels", "")
}

val RenderModel_ControllerMode_State_t = struct(Module.OPENVR, "RenderModelControllerModeState", nativeName = "RenderModel_ControllerMode_State_t") {
    bool("bScrollWheelVisible", "is this controller currently set to be in a scroll wheel mode")
}

val RenderModel_ComponentState_t = struct(Module.OPENVR, "RenderModelComponentState", nativeName = "RenderModel_ComponentState_t", mutable = false) {
    documentation = "Describes state information about a render-model component, including transforms and other dynamic properties."

    HmdMatrix34_t("mTrackingToComponentRenderModel", "Transform required when drawing the component render model")
    HmdMatrix34_t("mTrackingToComponentLocal", "Transform available for attaching to a local component coordinate system (-Z out from surface )")
    VRComponentProperties("uProperties", "")
}

val CameraVideoStreamFrameHeader_t = struct(Module.OPENVR, "CameraVideoStreamFrameHeader", nativeName = "CameraVideoStreamFrameHeader_t", mutable = false) {
    EVRTrackedCameraFrameType("eFrameType", "")

    uint32_t("nWidth", "")
    uint32_t("nHeight", "")
    uint32_t("nBytesPerPixel", "")

    uint32_t("nFrameSequence", "")

    TrackedDevicePose_t("trackedDevicePose", "")
    uint64_t("ulFrameExposureTime", "mid-point of the exposure of the image in host system ticks")
}

val Compositor_BenchmarkResults = struct(Module.OPENVR, "Compositor_BenchmarkResults", nativeName = "Compositor_BenchmarkResults", mutable = false) {
    documentation = "Provides compositor benchmark results to the app."

    float("m_flMegaPixelsPerSecond", "Measurement of GPU MP/s performed by compositor benchmark")
    float("m_flHmdRecommendedMegaPixelsPerSecond", "Recommended default MP/s given the HMD resolution, refresh, and panel mask.")
}

val DriverDirectMode_FrameTiming = struct(Module.OPENVR, "DriverDirectModeFrameTiming", nativeName = "DriverDirectMode_FrameTiming", mutable = false) {
    documentation = "Frame timing data provided by direct mode drivers."

    uint32_t("m_nSize", "sSet to {@code sizeof( DriverDirectMode_FrameTiming )}")
	uint32_t("m_nNumFramePresents", "number of times frame was presented")
	uint32_t("m_nNumMisPresented", "number of times frame was presented on a vsync other than it was originally predicted to")
	uint32_t("m_nNumDroppedFrames", "number of additional times previous frame was scanned out (i.e. compositor missed vsync)")
	uint32_t("m_nReprojectionFlags", "")
}

val ImuSample_t = struct(Module.OPENVR, "ImuSample", nativeName = "ImuSample_t", mutable = false) {
    double("fSampleTime", "")
	HmdVector3d_t("vAccel", "")
	HmdVector3d_t("vGyro", "")
	uint32_t("unOffScaleFlags", "")
}

val AppOverrideKeys_t = struct(Module.OPENVR, "AppOverrideKeys", nativeName = "AppOverrideKeys_t") {
    charASCII.p("pchKey", "")
    char.p("pchValue", "")
}

val VROverlayIntersectionParams_t = struct(Module.OPENVR, "VROverlayIntersectionParams", nativeName = "VROverlayIntersectionParams_t") {
    HmdVector3_t("vSource", "")
    HmdVector3_t("vDirection", "")
    ETrackingUniverseOrigin("eOrigin", "")
}

val VROverlayIntersectionResults_t = struct(Module.OPENVR, "VROverlayIntersectionResults", nativeName = "VROverlayIntersectionResults_t", mutable = false) {
    HmdVector3_t("vPoint", "")
    HmdVector3_t("vNormal", "")
    HmdVector2_t("vUVs", "")
    float("fDistance", "")
}