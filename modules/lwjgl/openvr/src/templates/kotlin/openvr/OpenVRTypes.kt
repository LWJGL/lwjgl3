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

val vrshared_uint64_t = typedef(uint64_t, "vrshared_uint64_t")
val vrshared_double = typedef(double, "vrshared_double")

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
    float("m")[3 x 4]
}

val HmdMatrix33_t = struct(Module.OPENVR, "HmdMatrix33", nativeName = "HmdMatrix33_t") {
    float("m")[3 x 3]
}

val HmdMatrix44_t = struct(Module.OPENVR, "HmdMatrix44", nativeName = "HmdMatrix44_t") {
    float("m")[4 x 4]
}

val HmdVector3_t = struct(Module.OPENVR, "HmdVector3", nativeName = "HmdVector3_t") {
    float("v")[3]
}

val HmdVector4_t = struct(Module.OPENVR, "HmdVector4", nativeName = "HmdVector4_t") {
    float("v")[4]
}

val HmdVector3d_t = struct(Module.OPENVR, "HmdVector3d", nativeName = "HmdVector3d_t") {
    double("v")[3]
}

val HmdVector2_t = struct(Module.OPENVR, "HmdVector2", nativeName = "HmdVector2_t") {
    float("v")[2]
}

val HmdQuaternion_t = struct(Module.OPENVR, "HmdQuaternion", nativeName = "HmdQuaternion_t") {
    double("w")
    double("x")
    double("y")
    double("z")
}

val HmdQuaternionf_t = struct(Module.OPENVR, "HmdQuaternionf", nativeName = "HmdQuaternionf_t") {
    float("w")
    float("x")
    float("y")
    float("z")
}

val HmdColor_t = struct(Module.OPENVR, "HmdColor", nativeName = "HmdColor_t") {
    float("r")
    float("g")
    float("b")
    float("a")
}

val HmdQuad_t = struct(Module.OPENVR, "HmdQuad", nativeName = "HmdQuad_t") {
    HmdVector3_t("vCorners")[4]
}

val HmdRect2_t = struct(Module.OPENVR, "HmdRect2", nativeName = "HmdRect2_t") {
    HmdVector2_t("vTopLeft")
    HmdVector2_t("vBottomRight")
}

val DistortionCoordinates_t = struct(Module.OPENVR, "DistortionCoordinates", nativeName = "DistortionCoordinates_t", mutable = false) {
    float("rfRed")[2]
    float("rfGreen")[2]
    float("rfBlue")[2]
}

val Texture_t = struct(Module.OPENVR, "Texture", nativeName = "Texture_t") {
    opaque_p("handle") // See ETextureType definition above
    ETextureType("eType")
    EColorSpace("eColorSpace")
}

val VRTextureBounds_t = struct(Module.OPENVR, "VRTextureBounds", nativeName = "VRTextureBounds_t") {
    float("uMin")
    float("vMin")
    float("uMax")
    float("vMax")
}

val VRTextureWithPose_t = struct(Module.OPENVR, "VRTextureWithPose", nativeName = "VRTextureWithPose_t") {
    opaque_p("handle")
    ETextureType("eType")
    EColorSpace("eColorSpace")
    HmdMatrix34_t("mDeviceToAbsoluteTracking")
}

val VRTextureDepthInfo_t = struct(Module.OPENVR, "VRTextureDepthInfo", nativeName = "VRTextureDepthInfo_t") {
    opaque_p("handle")
    HmdMatrix44_t("mProjection")
    HmdVector2_t("vRange")
}

val VRTextureWithDepth_t = struct(Module.OPENVR, "VRTextureWithDepth", nativeName = "VRTextureWithDepth_t") {
    opaque_p("handle")
    ETextureType("eType")
    EColorSpace("eColorSpace")
    VRTextureDepthInfo_t("depth")
}

val VRTextureWithPoseAndDepth_t = struct(Module.OPENVR, "VRTextureWithPoseAndDepth", nativeName = "VRTextureWithPoseAndDepth_t") {
    opaque_p("handle")
    ETextureType("eType")
    EColorSpace("eColorSpace")
    HmdMatrix34_t("mDeviceToAbsoluteTracking")
    VRTextureDepthInfo_t("depth")
}

val TrackedDevicePose_t = struct(Module.OPENVR, "TrackedDevicePose", nativeName = "TrackedDevicePose_t") {
    HmdMatrix34_t("mDeviceToAbsoluteTracking")
    HmdVector3_t("vVelocity")
    HmdVector3_t("vAngularVelocity")
    ETrackingResult("eTrackingResult")
    bool("bPoseIsValid")
    bool("bDeviceIsConnected")
}

val VRVulkanTextureData_t = struct(Module.OPENVR, "VRVulkanTextureData", nativeName = "VRVulkanTextureData_t") {
    uint64_t("m_nImage")
    VkDevice_T.p("m_pDevice")
    VkPhysicalDevice_T.p("m_pPhysicalDevice")
    VkInstance_T.p("m_pInstance")
    VkQueue_T.p("m_pQueue")
    uint32_t("m_nQueueFamilyIndex")
    uint32_t("m_nWidth")
    uint32_t("m_nHeight")
    uint32_t("m_nFormat")
    uint32_t("m_nSampleCount")
}

val VRVulkanTextureArrayData_t = struct(Module.OPENVR, "VRVulkanTextureArrayData", nativeName = "VRVulkanTextureArrayData_t") {
    uint32_t("m_unArrayIndex")
    uint32_t("m_unArraySize")
}

val VREvent_Controller_t = struct(Module.OPENVR, "VREventController", nativeName = "VREvent_Controller_t", mutable = false) {
    uint32_t("button")
}

val VREvent_Mouse_t = struct(Module.OPENVR, "VREventMouse", nativeName = "VREvent_Mouse_t", mutable = false) {
    float("x")
    float("y")
    uint32_t("button")
    uint32_t("cursorIndex")
}

val VREvent_Scroll_t = struct(Module.OPENVR, "VREventScroll", nativeName = "VREvent_Scroll_t", mutable = false) {
    float("xdelta")
    float("ydelta")
    uint32_t("unused")
    float("viewportscale")
    uint32_t("cursorIndex")
}

val VREvent_Process_t = struct(Module.OPENVR, "VREventProcess", nativeName = "VREvent_Process_t", mutable = false) {
    uint32_t("pid")
    uint32_t("oldPid")
    bool("bForced")
    bool("bConnectionLost")
}

val VREvent_Notification_t = struct(Module.OPENVR, "VREventNotification", nativeName = "VREvent_Notification_t", mutable = false) {
    uint64_t("ulUserValue")
    uint32_t("notificationId")
}

val VREvent_Overlay_t = struct(Module.OPENVR, "VREventOverlay", nativeName = "VREvent_Overlay_t", mutable = false) {
    uint64_t("overlayHandle")
    uint64_t("devicePath")
    uint64_t("memoryBlockId")
    uint32_t("cursorIndex")
}

val VREvent_Status_t = struct(Module.OPENVR, "VREventStatus", nativeName = "VREvent_Status_t", mutable = false) {
    uint32_t("statusState")
}

val VREvent_Keyboard_t = struct(Module.OPENVR, "VREventKeyboard", nativeName = "VREvent_Keyboard_t", mutable = false) {
    charUTF8("cNewInput")[8]
    uint64_t("uUserValue")
    uint64_t("overlayHandle")
}

val VREvent_Ipd_t = struct(Module.OPENVR, "VREventIpd", nativeName = "VREvent_Ipd_t", mutable = false) {
    float("ipdMeters")
}

val VREvent_Chaperone_t = struct(Module.OPENVR, "VREventChaperone", nativeName = "VREvent_Chaperone_t", mutable = false) {
    uint64_t("m_nPreviousUniverse")
    uint64_t("m_nCurrentUniverse")
}

val VREvent_Reserved_t = struct(Module.OPENVR, "VREventReserved", nativeName = "VREvent_Reserved_t", mutable = false) {
    uint64_t("reserved0")
    uint64_t("reserved1")
    uint64_t("reserved2")
    uint64_t("reserved3")
    uint64_t("reserved4")
    uint64_t("reserved5")
}

val VREvent_PerformanceTest_t = struct(Module.OPENVR, "VREventPerformanceTest", nativeName = "VREvent_PerformanceTest_t", mutable = false) {
    uint32_t("m_nFidelityLevel")
}

val VREvent_TouchPadMove_t = struct(Module.OPENVR, "VREventTouchPadMove", nativeName = "VREvent_TouchPadMove_t", mutable = false) {
    bool("bFingerDown")
    float("flSecondsFingerDown")
    float("fValueXFirst")
    float("fValueYFirst")
    float("fValueXRaw")
    float("fValueYRaw")
}

val VREvent_SeatedZeroPoseReset_t = struct(Module.OPENVR, "VREventSeatedZeroPoseReset", nativeName = "VREvent_SeatedZeroPoseReset_t", mutable = false) {
    bool("bResetBySystemMenu")
}

val VREvent_Screenshot_t = struct(Module.OPENVR, "VREventScreenshot", nativeName = "VREvent_Screenshot_t", mutable = false) {
    uint32_t("handle")
    uint32_t("type")
}

val VREvent_ScreenshotProgress_t = struct(Module.OPENVR, "VREventScreenshotProgress", nativeName = "VREvent_ScreenshotProgress_t", mutable = false) {
    float("progress")
}

val VREvent_ApplicationLaunch_t = struct(Module.OPENVR, "VREventApplicationLaunch", nativeName = "VREvent_ApplicationLaunch_t", mutable = false) {
    uint32_t("pid")
    uint32_t("unArgsHandle")
}

val VREvent_EditingCameraSurface_t = struct(Module.OPENVR, "VREventEditingCameraSurface", nativeName = "VREvent_EditingCameraSurface_t", mutable = false) {
    uint64_t("overlayHandle")
    uint32_t("nVisualMode")
}

val VREvent_MessageOverlay_t = struct(Module.OPENVR, "VREventMessageOverlay", nativeName = "VREvent_MessageOverlay_t", mutable = false) {
    uint32_t("unVRMessageOverlayResponse")
}

val VREvent_Property_t = struct(Module.OPENVR, "VREventProperty", nativeName = "VREvent_Property_t", mutable = false) {
    PropertyContainerHandle_t("container")
    ETrackedDeviceProperty("prop")
}

val VREvent_HapticVibration_t = struct(Module.OPENVR, "VREventHapticVibration", nativeName = "VREvent_HapticVibration_t", mutable = false) {
    uint64_t("containerHandle")
	uint64_t("componentHandle")
	float("fDurationSeconds")
	float("fFrequency")
	float("fAmplitude")
}

val VREvent_WebConsole_t = struct(Module.OPENVR, "VREventWebConsole", nativeName = "VREvent_WebConsole_t", mutable = false) {
    WebConsoleHandle_t("webConsoleHandle")
}

val VREvent_InputBindingLoad_t = struct(Module.OPENVR, "VREventInputBindingLoad", nativeName = "VREvent_InputBindingLoad_t", mutable = false) {
    PropertyContainerHandle_t("ulAppContainer")
	uint64_t("pathMessage")
	uint64_t("pathUrl")
    uint64_t("pathControllerType")
}

val VREvent_InputActionManifestLoad_t = struct(Module.OPENVR, "VREventInputActionManifestLoad", nativeName = "VREvent_InputActionManifestLoad_t", mutable = false) {
	uint64_t("pathAppKey")
	uint64_t("pathMessage")
	uint64_t("pathMessageParam")
	uint64_t("pathManifestPath")
}

val VREvent_SpatialAnchor_t = struct(Module.OPENVR, "VREventSpatialAnchor", nativeName = "VREvent_SpatialAnchor_t", mutable = false) {
	SpatialAnchorHandle_t("unHandle")
}

val VREvent_ProgressUpdate_t = struct(Module.OPENVR, "VREventProgressUpdate", nativeName = "VREvent_ProgressUpdate_t", mutable = false) {
	uint64_t("ulApplicationPropertyContainer")
	uint64_t("pathDevice")
	uint64_t("pathInputSource")
	uint64_t("pathProgressAction")
	uint64_t("pathIcon")
	float("fProgress")
}

val VREvent_ShowUI_t = struct(Module.OPENVR, "VREventShowUI", nativeName = "VREvent_ShowUI_t", mutable = false) {
	EShowUIType("eType")
}

val VREvent_ShowDevTools_t = struct(Module.OPENVR, "VREventShowDevTools", nativeName = "VREvent_ShowDevTools_t", mutable = false) {
	int32_t("nBrowserIdentifier")
}

val VREvent_HDCPError_t = struct(Module.OPENVR, "VREventHDCPError", nativeName = "VREvent_HDCPError_t", mutable = false) {
	EHDCPError("eCode")
}

val VREvent_AudioVolumeControl_t = struct(Module.OPENVR, "VREventAudioVolumeControl", nativeName = "VREvent_AudioVolumeControl_t", mutable = false) {
    float("fVolumeLevel")
}

val VREvent_AudioMuteControl_t = struct(Module.OPENVR, "VREventAudioMuteControl", nativeName = "VREvent_AudioMuteControl_t", mutable = false) {
    bool("bMute")
}

val VREvent_Data_t = union(Module.OPENVR, "VREventData", nativeName = "VREvent_Data_t", mutable = false) {
    VREvent_Reserved_t("reserved")
    VREvent_Controller_t("controller")
    VREvent_Mouse_t("mouse")
    VREvent_Scroll_t("scroll")
    VREvent_Process_t("process")
    VREvent_Notification_t("notification")
    VREvent_Overlay_t("overlay")
    VREvent_Status_t("status")
    VREvent_Keyboard_t("keyboard")
    VREvent_Ipd_t("ipd")
    VREvent_Chaperone_t("chaperone")
    VREvent_PerformanceTest_t("performanceTest")
    VREvent_TouchPadMove_t("touchPadMove")
    VREvent_SeatedZeroPoseReset_t("seatedZeroPoseReset")
    VREvent_Screenshot_t("screenshot")
    VREvent_ScreenshotProgress_t("screenshotProgress")
    VREvent_ApplicationLaunch_t("applicationLaunch")
    VREvent_EditingCameraSurface_t("cameraSurface")
    VREvent_MessageOverlay_t("messageOverlay")
    VREvent_Property_t("property")
    VREvent_HapticVibration_t("hapticVibration")
    VREvent_WebConsole_t("webConsole")
    VREvent_InputBindingLoad_t("inputBinding")
	VREvent_InputActionManifestLoad_t("actionManifest")
	VREvent_SpatialAnchor_t("spatialAnchor")
    VREvent_ProgressUpdate_t("progressUpdate")
    VREvent_ShowUI_t("showUi")
    VREvent_ShowDevTools_t("showDevTools")
    VREvent_HDCPError_t("hdcpError")
    VREvent_AudioVolumeControl_t("audioVolumeControl")
    VREvent_AudioMuteControl_t("audioMuteControl")
}

val VREvent_t = struct(Module.OPENVR, "VREvent", nativeName = "VREvent_t", mutable = false) {
    pack("Platform.get() == Platform.LINUX || Platform.get() == Platform.MACOSX ? 4 : DEFAULT_PACK_ALIGNMENT")

    uint32_t("eventType")
    TrackedDeviceIndex_t("trackedDeviceIndex")
    float("eventAgeSeconds")
    VREvent_Data_t("data")
}

val IntersectionMaskRectangle_t = struct(Module.OPENVR, "IntersectionMaskRectangle", nativeName = "IntersectionMaskRectangle_t") {
    float("m_flTopLeftX")
    float("m_flTopLeftY")
    float("m_flWidth")
    float("m_flHeight")
}

val IntersectionMaskCircle_t = struct(Module.OPENVR, "IntersectionMaskCircle", nativeName = "IntersectionMaskCircle_t") {
    float("m_flCenterX")
    float("m_flCenterY")
    float("m_flRadius")
}

val VROverlayProjection_t = struct(Module.OPENVR, "VROverlayProjection", nativeName = "VROverlayProjection_t") {
    float("fLeft")
    float("fRight")
    float("fTop")
    float("fBottom")
}

val VROverlayView_t = struct(Module.OPENVR, "VROverlayView_t", mutable = false) {
    VROverlayHandle_t("overlayHandle")
    Texture_t("texture")
    VRTextureBounds_t("textureBounds")
}

val VRVulkanDevice_t = struct(Module.OPENVR, "VRVulkanDevice", nativeName = "VRVulkanDevice_t") {
    VkInstance_T.p("m_pInstance")
    VkDevice_T.p("m_pDevice")
    VkPhysicalDevice_T.p("m_pPhysicalDevice")
    VkQueue_T.p("m_pQueue")
    uint32_t("m_uQueueFamilyIndex")
}

val VRNativeDevice_t = struct(Module.OPENVR, "VRNativeDevice", nativeName = "VRNativeDevice_t") {
    opaque_p("handle")
    EDeviceType("eType")
}

val VROverlayIntersectionMaskPrimitive_Data_t = union(Module.OPENVR, "VROverlayIntersectionMaskPrimitiveData", nativeName = "VROverlayIntersectionMaskPrimitive_Data_t") {
    IntersectionMaskRectangle_t("m_Rectangle")
    IntersectionMaskCircle_t("m_Circle")
}

val VROverlayIntersectionMaskPrimitive_t = struct(Module.OPENVR, "VROverlayIntersectionMaskPrimitive", nativeName = "VROverlayIntersectionMaskPrimitive_t") {
    EVROverlayIntersectionMaskPrimitiveType("m_nPrimitiveType")
    VROverlayIntersectionMaskPrimitive_Data_t("m_Primitive")
}

val HiddenAreaMesh_t = struct(Module.OPENVR, "HiddenAreaMesh", nativeName = "HiddenAreaMesh_t", mutable = false) {
    HmdVector2_t.p("pVertexData")
    AutoSize("pVertexData", optional = true)..uint32_t("unTriangleCount")
}

val VRControllerAxis_t = struct(Module.OPENVR, "VRControllerAxis", nativeName = "VRControllerAxis_t") {
    float("x")
    float("y")
}

val VRControllerState_t = struct(Module.OPENVR, "VRControllerState", nativeName = "VRControllerState_t") {
    uint32_t("unPacketNum")
    uint64_t("ulButtonPressed")
    uint64_t("ulButtonTouched")
    VRControllerAxis_t("rAxis")[5]
}

val VRBoneTransform_t = struct(Module.OPENVR, "VRBoneTransform", nativeName = "VRBoneTransform_t", mutable = false) {
    HmdVector4_t("position")
	HmdQuaternionf_t("orientation")
}

val Compositor_FrameTiming = struct(Module.OPENVR, "CompositorFrameTiming", nativeName = "Compositor_FrameTiming", mutable = false) {
    uint32_t("m_nSize")
    uint32_t("m_nFrameIndex")
    uint32_t("m_nNumFramePresents")
    uint32_t("m_nNumMisPresented")
    uint32_t("m_nNumDroppedFrames")
    uint32_t("m_nReprojectionFlags")

    double("m_flSystemTimeInSeconds")

    /** These times may include work from other processes due to OS scheduling.
     * The fewer packets of work these are broken up into, the less likely this will happen.
     * GPU work can be broken up by calling Flush.  This can sometimes be useful to get the GPU started
     * processing that work earlier in the frame. */
    float("m_flPreSubmitGpuMs")
    float("m_flPostSubmitGpuMs")
    float("m_flTotalRenderGpuMs")
    float("m_flCompositorRenderGpuMs")
    float("m_flCompositorRenderCpuMs")
    float("m_flCompositorIdleCpuMs")

    /** Miscellaneous measured intervals. */
    float("m_flClientFrameIntervalMs")
    float("m_flPresentCallCpuMs")
    float("m_flWaitForPresentCpuMs")
    float("m_flSubmitFrameMs")

    /** The following are all relative to this frame's SystemTimeInSeconds */
    float("m_flWaitGetPosesCalledMs")
    float("m_flNewPosesReadyMs")
    float("m_flNewFrameReadyMs")
    float("m_flCompositorUpdateStartMs")
    float("m_flCompositorUpdateEndMs")
    float("m_flCompositorRenderStartMs")

    TrackedDevicePose_t("m_HmdPose")

    uint32_t("m_nNumVSyncsReadyForUse")
	uint32_t("m_nNumVSyncsToFirstView")
    float("m_flTransferLatencyMs")
}

val Compositor_CumulativeStats = struct(Module.OPENVR, "CompositorCumulativeStats", nativeName = "Compositor_CumulativeStats", mutable = false) {
    uint32_t("m_nPid")
    uint32_t("m_nNumFramePresents")
    uint32_t("m_nNumDroppedFrames")
    uint32_t("m_nNumReprojectedFrames")

    /** Values recorded at startup before application has fully faded in the first time. */
    uint32_t("m_nNumFramePresentsOnStartup")
    uint32_t("m_nNumDroppedFramesOnStartup")
    uint32_t("m_nNumReprojectedFramesOnStartup")

    /** Applications may explicitly fade to the compositor.  This is usually to handle level transitions, and loading often causes
     * system wide hitches.  The following stats are collected during this period.  Does not include values recorded during startup. */
    uint32_t("m_nNumLoading")
    uint32_t("m_nNumFramePresentsLoading")
    uint32_t("m_nNumDroppedFramesLoading")
    uint32_t("m_nNumReprojectedFramesLoading")

    /** If we don't get a new frame from the app in less than 2.5 frames, then we assume the app has hung and start
     * fading back to the compositor.  The following stats are a result of this, and are a subset of those recorded above.
     * Does not include values recorded during start up or loading. */
    uint32_t("m_nNumTimedOut")
    uint32_t("m_nNumFramePresentsTimedOut")
    uint32_t("m_nNumDroppedFramesTimedOut")
    uint32_t("m_nNumReprojectedFramesTimedOut")
    uint32_t("m_nNumFrameSubmits")
    vrshared_double("m_flSumCompositorCPUTimeMS")
    vrshared_double("m_flSumCompositorGPUTimeMS")
    vrshared_double("m_flSumTargetFrameTimes")
    vrshared_double("m_flSumApplicationCPUTimeMS")
    vrshared_double("m_flSumApplicationGPUTimeMS")
    uint32_t("m_nNumFramesWithDepth")
}

val Compositor_StageRenderSettings = struct(Module.OPENVR, "CompositorStageRenderSettings", nativeName = "Compositor_StageRenderSettings", mutable = false) {
    HmdColor_t("m_PrimaryColor")
    HmdColor_t("m_SecondaryColor")

    float("m_flVignetteInnerRadius")
    float("m_flVignetteOuterRadius")

    float("m_flFresnelStrength")

    bool("m_bBackfaceCulling")

    bool("m_bGreyscale")

    bool("m_bWireframe")
}

val NotificationBitmap_t = struct(Module.OPENVR, "NotificationBitmap", nativeName = "NotificationBitmap_t") {
    void.p("m_pImageData")
    int32_t("m_nWidth")
    int32_t("m_nHeight")
    int32_t("m_nBytesPerPixel")
}

val InputAnalogActionData_t = struct(Module.OPENVR, "InputAnalogActionData", nativeName = "InputAnalogActionData_t", mutable = false) {
    bool("bActive")
	VRInputValueHandle_t("activeOrigin")
	float("x")
	float("y")
	float("z")
	float("deltaX")
	float("deltaY")
	float("deltaZ")
	float("fUpdateTime")
}

val InputDigitalActionData_t = struct(Module.OPENVR, "InputDigitalActionData", nativeName = "InputDigitalActionData_t", mutable = false) {
    bool("bActive")
	VRInputValueHandle_t("activeOrigin")
	bool("bState")
	bool("bChanged")
	float("fUpdateTime")
}

val InputPoseActionData_t = struct(Module.OPENVR, "InputPoseActionData", nativeName = "InputPoseActionData_t", mutable = false) {
    bool("bActive")
	VRInputValueHandle_t("activeOrigin")
	TrackedDevicePose_t("pose")
}

val InputSkeletalActionData_t = struct(Module.OPENVR, "InputSkeletalActionData", nativeName = "InputSkeletalActionData_t", mutable = false) {
    bool("bActive")
	VRInputValueHandle_t("activeOrigin")
}

val InputOriginInfo_t = struct(Module.OPENVR, "InputOriginInfo", nativeName = "InputOriginInfo_t", mutable = false) {
    VRInputValueHandle_t("devicePath")
	TrackedDeviceIndex_t("trackedDeviceIndex")
    charUTF8("rchRenderModelComponentName")[128]
}

val InputBindingInfo_t = struct(Module.OPENVR, "InputBindingInfo", nativeName = "InputBindingInfo_t", mutable = false) {
    charASCII("rchDevicePathName")[128]
	charASCII("rchInputPathName")[128]
	charASCII("rchModeName")[128]
	charASCII("rchSlotName")[128]
    charASCII("rchInputSourceType")[32]
}

val VRActiveActionSet_t = struct(Module.OPENVR, "VRActiveActionSet", nativeName = "VRActiveActionSet_t") {
    VRActionSetHandle_t("ulActionSet")
	VRInputValueHandle_t("ulRestrictedToDevice")
	VRActionSetHandle_t("ulSecondaryActionSet")
    padding(4)
	int32_t("nPriority")
}

val VRSkeletalSummaryData_t = struct(Module.OPENVR, "VRSkeletalSummaryData", nativeName = "VRSkeletalSummaryData_t", mutable = false) {
	float("flFingerCurl")[5]
	float("flFingerSplay")[4]
}

val SpatialAnchorPose_t = struct(Module.OPENVR, "SpatialAnchorPose", nativeName = "SpatialAnchorPose_t", mutable = false) {
	HmdMatrix34_t("mAnchorToAbsoluteTracking")
}

val PropertyWrite_t = struct(Module.OPENVR, "PropertyWrite", nativeName = "PropertyWrite_t") {
    ETrackedDeviceProperty("prop")
    EPropertyWriteType("writeType")
    ETrackedPropertyError("eSetError")
    void.p("pvBuffer");
    AutoSize("pvBuffer")..uint32_t("unBufferSize")
    PropertyTypeTag_t("unTag")
    ETrackedPropertyError("eError")
}

val PropertyRead_t = struct(Module.OPENVR, "PropertyRead", nativeName = "PropertyRead_t") {
    ETrackedDeviceProperty("prop")
    void.p("pvBuffer");
    AutoSize("pvBuffer")..uint32_t("unBufferSize")
    PropertyTypeTag_t("unTag")
    uint32_t("unRequiredBufferSize")
    ETrackedPropertyError("eError")
}

/*
val CVRPropertyHelpers = struct(Module.OPENVR, "CVRPropertyHelpers", mutable = false) {
    intptr_t("m_pProperties")
}
*/

val PathWrite_t = struct(Module.OPENVR, "PathWrite", nativeName = "PathWrite_t") {
    PathHandle_t("ulPath")
    EPropertyWriteType("writeType")
    ETrackedPropertyError("eSetError")
    void.p("pvBuffer");
    AutoSize("pvBuffer")..uint32_t("unBufferSize")
    PropertyTypeTag_t("unTag")
    ETrackedPropertyError("eError")
    charASCII.p("pszPath")
}

val PathRead_t = struct(Module.OPENVR, "PathRead", nativeName = "PathRead_t") {
    PathHandle_t("ulPath")
    void.p("pvBuffer");
    AutoSize("pvBuffer")..uint32_t("unBufferSize")
    PropertyTypeTag_t("unTag")
    uint32_t("unRequiredBufferSize")
    ETrackedPropertyError("eError")
    charASCII.p("pszPath")
}

val RenderModel_Vertex_t = struct(Module.OPENVR, "RenderModelVertex", nativeName = "RenderModel_Vertex_t", mutable = false) {
    HmdVector3_t("vPosition")
    HmdVector3_t("vNormal")
    float("rfTextureCoord")[2]
}

val RenderModel_t = struct(Module.OPENVR, "RenderModel", nativeName = "RenderModel_t", mutable = false) {
    pack("Platform.get() == Platform.LINUX || Platform.get() == Platform.MACOSX ? 4 : DEFAULT_PACK_ALIGNMENT")

    RenderModel_Vertex_t.const.p("rVertexData")
    AutoSize("rVertexData")..uint32_t("unVertexCount")
    uint16_t.const.p("IndexData")
    AutoSizeMul("3", "IndexData")..uint32_t("unTriangleCount")
    TextureID_t("diffuseTextureId")
}

val RenderModel_TextureMap_t = struct(Module.OPENVR, "RenderModelTextureMap", nativeName = "RenderModel_TextureMap_t", mutable = false) {
    pack("Platform.get() == Platform.LINUX || Platform.get() == Platform.MACOSX ? 4 : DEFAULT_PACK_ALIGNMENT")

    uint16_t("unWidth")
    uint16_t("unHeight")
    uint8_t.const.p("rubTextureMapData")
    EVRRenderModelTextureFormat("format")
    uint16_t("unMipLevels")
}

val RenderModel_ControllerMode_State_t = struct(Module.OPENVR, "RenderModelControllerModeState", nativeName = "RenderModel_ControllerMode_State_t") {
    bool("bScrollWheelVisible")
}

val RenderModel_ComponentState_t = struct(Module.OPENVR, "RenderModelComponentState", nativeName = "RenderModel_ComponentState_t", mutable = false) {
    HmdMatrix34_t("mTrackingToComponentRenderModel")
    HmdMatrix34_t("mTrackingToComponentLocal")
    VRComponentProperties("uProperties")
}

val CameraVideoStreamFrameHeader_t = struct(Module.OPENVR, "CameraVideoStreamFrameHeader", nativeName = "CameraVideoStreamFrameHeader_t", mutable = false) {
    EVRTrackedCameraFrameType("eFrameType")

    uint32_t("nWidth")
    uint32_t("nHeight")
    uint32_t("nBytesPerPixel")

    uint32_t("nFrameSequence")

    TrackedDevicePose_t("trackedDevicePose")
    uint64_t("ulFrameExposureTime")
}

val Compositor_BenchmarkResults = struct(Module.OPENVR, "Compositor_BenchmarkResults", nativeName = "Compositor_BenchmarkResults", mutable = false) {
    float("m_flMegaPixelsPerSecond")
    float("m_flHmdRecommendedMegaPixelsPerSecond")
}

val DriverDirectMode_FrameTiming = struct(Module.OPENVR, "DriverDirectModeFrameTiming", nativeName = "DriverDirectMode_FrameTiming", mutable = false) {
    uint32_t("m_nSize")
	uint32_t("m_nNumFramePresents")
	uint32_t("m_nNumMisPresented")
	uint32_t("m_nNumDroppedFrames")
	uint32_t("m_nReprojectionFlags")
}

val ImuSample_t = struct(Module.OPENVR, "ImuSample", nativeName = "ImuSample_t", mutable = false) {
    double("fSampleTime")
	HmdVector3d_t("vAccel")
	HmdVector3d_t("vGyro")
	uint32_t("unOffScaleFlags")
}

val AppOverrideKeys_t = struct(Module.OPENVR, "AppOverrideKeys", nativeName = "AppOverrideKeys_t") {
    charASCII.p("pchKey")
    char.p("pchValue")
}

val VROverlayIntersectionParams_t = struct(Module.OPENVR, "VROverlayIntersectionParams", nativeName = "VROverlayIntersectionParams_t") {
    HmdVector3_t("vSource")
    HmdVector3_t("vDirection")
    ETrackingUniverseOrigin("eOrigin")
}

val VROverlayIntersectionResults_t = struct(Module.OPENVR, "VROverlayIntersectionResults", nativeName = "VROverlayIntersectionResults_t", mutable = false) {
    HmdVector3_t("vPoint")
    HmdVector3_t("vNormal")
    HmdVector2_t("vUVs")
    float("fDistance")
}