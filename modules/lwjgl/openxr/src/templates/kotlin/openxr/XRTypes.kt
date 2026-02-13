/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr

import org.lwjgl.generator.*

// Handle types
val XrInstance = XR_DEFINE_HANDLE("XrInstance")
val XrSession = XR_DEFINE_HANDLE("XrSession")
val XrSpace = XR_DEFINE_HANDLE("XrSpace")
val XrAction = XR_DEFINE_HANDLE("XrAction")
val XrSwapchain = XR_DEFINE_HANDLE("XrSwapchain")
val XrActionSet = XR_DEFINE_HANDLE("XrActionSet")

// Enum types
val XrResult = "XrResult".enumType
val XrStructureType = "XrStructureType".enumType
val XrFormFactor = "XrFormFactor".enumType
val XrViewConfigurationType = "XrViewConfigurationType".enumType
val XrEnvironmentBlendMode = "XrEnvironmentBlendMode".enumType
val XrReferenceSpaceType = "XrReferenceSpaceType".enumType
val XrActionType = "XrActionType".enumType
val XrEyeVisibility = "XrEyeVisibility".enumType
val XrSessionState = "XrSessionState".enumType
val XrObjectType = "XrObjectType".enumType

// Bitmask types
val XrInstanceCreateFlags = typedef(XrFlags64, "XrInstanceCreateFlags")
val XrSessionCreateFlags = typedef(XrFlags64, "XrSessionCreateFlags")
val XrSpaceVelocityFlags = typedef(XrFlags64, "XrSpaceVelocityFlags")
val XrSpaceLocationFlags = typedef(XrFlags64, "XrSpaceLocationFlags")
val XrSwapchainCreateFlags = typedef(XrFlags64, "XrSwapchainCreateFlags")
val XrSwapchainUsageFlags = typedef(XrFlags64, "XrSwapchainUsageFlags")
val XrCompositionLayerFlags = typedef(XrFlags64, "XrCompositionLayerFlags")
val XrViewStateFlags = typedef(XrFlags64, "XrViewStateFlags")
val XrInputSourceLocalizedNameFlags = typedef(XrFlags64, "XrInputSourceLocalizedNameFlags")

// Struct types
val XrApiLayerProperties = struct(Module.OPENXR, "XrApiLayerProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    Expression("#TYPE_API_LAYER_PROPERTIES")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    charUTF8("layerName")["XR_MAX_API_LAYER_NAME_SIZE"]
    XrVersion("specVersion")
    uint32_t("layerVersion")
    charUTF8("description")["XR_MAX_API_LAYER_DESCRIPTION_SIZE"]
}

val XrExtensionProperties = struct(Module.OPENXR, "XrExtensionProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    Expression("#TYPE_EXTENSION_PROPERTIES")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    charUTF8("extensionName")["XR_MAX_EXTENSION_NAME_SIZE"]
    uint32_t("extensionVersion")
}

val XrApplicationInfo = struct(Module.OPENXR, "XrApplicationInfo") {
    javaImport("static org.lwjgl.openxr.XR10.*")
    charUTF8("applicationName")["XR_MAX_APPLICATION_NAME_SIZE"]
    uint32_t("applicationVersion")
    charUTF8("engineName")["XR_MAX_ENGINE_NAME_SIZE"]
    uint32_t("engineVersion")
    XrVersion("apiVersion")
}

val XrInstanceCreateInfo = struct(Module.OPENXR, "XrInstanceCreateInfo") {
    Expression("#TYPE_INSTANCE_CREATE_INFO")..XrStructureType("type")
    PointerSetter(
        "XrDebugUtilsMessengerCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrInstanceCreateFlags("createFlags")
    XrApplicationInfo("applicationInfo")
    AutoSize("enabledApiLayerNames", optional = true)..uint32_t("enabledApiLayerCount")
    charUTF8.const.p.const.p("enabledApiLayerNames")
    AutoSize("enabledExtensionNames", optional = true)..uint32_t("enabledExtensionCount")
    charUTF8.const.p.const.p("enabledExtensionNames")
}

val XrInstanceProperties = struct(Module.OPENXR, "XrInstanceProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    Expression("#TYPE_INSTANCE_PROPERTIES")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrVersion("runtimeVersion")
    charUTF8("runtimeName")["XR_MAX_RUNTIME_NAME_SIZE"]
}

val XrEventDataBuffer = struct(Module.OPENXR, "XrEventDataBuffer") {
    Expression("#TYPE_EVENT_DATA_BUFFER")..XrStructureType("type")
    nullable..opaque_const_p("next")
    uint8_t("varying")[4000]
}

val XrSystemGetInfo = struct(Module.OPENXR, "XrSystemGetInfo") {
    Expression("#TYPE_SYSTEM_GET_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFormFactor("formFactor")
}

val XrSystemGraphicsProperties = struct(Module.OPENXR, "XrSystemGraphicsProperties") {
    uint32_t("maxSwapchainImageHeight")
    uint32_t("maxSwapchainImageWidth")
    uint32_t("maxLayerCount")
}

val XrSystemTrackingProperties = struct(Module.OPENXR, "XrSystemTrackingProperties") {
    XrBool32("orientationTracking")
    XrBool32("positionTracking")
}

val XrSystemProperties = struct(Module.OPENXR, "XrSystemProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    Expression("#TYPE_SYSTEM_PROPERTIES")..XrStructureType("type").mutable()
    PointerSetter(
        "XrSystemAnchorPropertiesHTC", "XrSystemAnchorSharingExportPropertiesANDROID", "XrSystemBodyTrackingPropertiesBD", "XrSystemBodyTrackingPropertiesFB", "XrSystemBodyTrackingPropertiesHTC", "XrSystemColocationDiscoveryPropertiesMETA", "XrSystemColorSpacePropertiesFB", "XrSystemDeviceAnchorPersistencePropertiesANDROID", "XrSystemEnvironmentDepthPropertiesMETA", "XrSystemEyeGazeInteractionPropertiesEXT", "XrSystemEyeTrackingPropertiesFB", "XrSystemFaceTrackingProperties2FB", "XrSystemFaceTrackingPropertiesANDROID", "XrSystemFaceTrackingPropertiesFB", "XrSystemFacialExpressionPropertiesML", "XrSystemFacialSimulationPropertiesBD", "XrSystemFacialTrackingPropertiesHTC", "XrSystemForceFeedbackCurlPropertiesMNDX", "XrSystemFoveatedRenderingPropertiesVARJO", "XrSystemFoveationEyeTrackedPropertiesMETA", "XrSystemHandTrackingMeshPropertiesMSFT", "XrSystemHandTrackingPropertiesEXT", "XrSystemHeadsetIdPropertiesMETA", "XrSystemImageTrackingPropertiesANDROID", "XrSystemKeyboardTrackingPropertiesFB", "XrSystemMarkerTrackingPropertiesANDROID", "XrSystemMarkerTrackingPropertiesVARJO", "XrSystemMarkerUnderstandingPropertiesML", "XrSystemPassthroughCameraStatePropertiesANDROID", "XrSystemPassthroughColorLutPropertiesMETA", "XrSystemPassthroughProperties2FB", "XrSystemPassthroughPropertiesFB", "XrSystemPlaneDetectionPropertiesEXT", "XrSystemPropertiesBodyTrackingCalibrationMETA", "XrSystemPropertiesBodyTrackingFullBodyMETA", "XrSystemRenderModelPropertiesFB", "XrSystemSimultaneousHandsAndControllersPropertiesMETA", "XrSystemSpaceDiscoveryPropertiesMETA", "XrSystemSpacePersistencePropertiesMETA", "XrSystemSpaceWarpPropertiesFB", "XrSystemSpatialAnchorPropertiesBD", "XrSystemSpatialAnchorSharingPropertiesBD", "XrSystemSpatialEntityGroupSharingPropertiesMETA", "XrSystemSpatialEntityPropertiesFB", "XrSystemSpatialEntitySharingPropertiesMETA", "XrSystemSpatialMeshPropertiesBD", "XrSystemSpatialPlanePropertiesBD", "XrSystemSpatialScenePropertiesBD", "XrSystemSpatialSensingPropertiesBD", "XrSystemTrackablesPropertiesANDROID", "XrSystemUserPresencePropertiesEXT", "XrSystemVirtualKeyboardPropertiesMETA",
        prepend = true
    )..nullable..opaque_p("next").mutable()
    XrSystemId("systemId")
    uint32_t("vendorId")
    charUTF8("systemName")["XR_MAX_SYSTEM_NAME_SIZE"]
    XrSystemGraphicsProperties("graphicsProperties")
    XrSystemTrackingProperties("trackingProperties")
}

val XrSessionCreateInfo = struct(Module.OPENXR, "XrSessionCreateInfo") {
    Expression("#TYPE_SESSION_CREATE_INFO")..XrStructureType("type")
    PointerSetter(
        "XrGraphicsBindingEGLMNDX", "XrGraphicsBindingOpenGLWaylandKHR", "XrGraphicsBindingOpenGLWin32KHR", "XrGraphicsBindingOpenGLXcbKHR", "XrGraphicsBindingOpenGLXlibKHR", "XrGraphicsBindingVulkan2KHR", "XrGraphicsBindingVulkanKHR", "XrHolographicWindowAttachmentMSFT", "XrSessionCreateInfoOverlayEXTX",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrSessionCreateFlags("createFlags")
    XrSystemId("systemId")
}

val XrVector3f = struct(Module.OPENXR, "XrVector3f") {
    float("x")
    float("y")
    float("z")
}

val XrSpaceVelocity = struct(Module.OPENXR, "XrSpaceVelocity") {
    Expression("#TYPE_SPACE_VELOCITY")..XrStructureType("type")
    nullable..opaque_p("next")
    XrSpaceVelocityFlags("velocityFlags")
    XrVector3f("linearVelocity")
    XrVector3f("angularVelocity")
}

val XrQuaternionf = struct(Module.OPENXR, "XrQuaternionf") {
    float("x")
    float("y")
    float("z")
    float("w")
}

val XrPosef = struct(Module.OPENXR, "XrPosef") {
    XrQuaternionf("orientation")
    XrVector3f("position")
}

val XrReferenceSpaceCreateInfo = struct(Module.OPENXR, "XrReferenceSpaceCreateInfo") {
    Expression("#TYPE_REFERENCE_SPACE_CREATE_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrReferenceSpaceType("referenceSpaceType")
    XrPosef("poseInReferenceSpace")
}

val XrExtent2Df = struct(Module.OPENXR, "XrExtent2Df") {
    float("width")
    float("height")
}

val XrActionSpaceCreateInfo = struct(Module.OPENXR, "XrActionSpaceCreateInfo") {
    Expression("#TYPE_ACTION_SPACE_CREATE_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrAction("action")
    XrPath("subactionPath")
    XrPosef("poseInActionSpace")
}

val XrSpaceLocation = struct(Module.OPENXR, "XrSpaceLocation") {
    Expression("#TYPE_SPACE_LOCATION")..XrStructureType("type")
    PointerSetter(
        "XrEyeGazeSampleTimeEXT", "XrSpaceVelocity",
        prepend = true
    )..nullable..opaque_p("next")
    XrSpaceLocationFlags("locationFlags")
    XrPosef("pose")
}

val XrViewConfigurationProperties = struct(Module.OPENXR, "XrViewConfigurationProperties") {
    Expression("#TYPE_VIEW_CONFIGURATION_PROPERTIES")..XrStructureType("type")
    nullable..opaque_p("next")
    XrViewConfigurationType("viewConfigurationType")
    XrBool32("fovMutable")
}

val XrViewConfigurationView = struct(Module.OPENXR, "XrViewConfigurationView") {
    Expression("#TYPE_VIEW_CONFIGURATION_VIEW")..XrStructureType("type")
    PointerSetter(
        "XrFoveatedViewConfigurationViewVARJO", "XrFrameSynthesisConfigViewEXT", "XrViewConfigurationDepthRangeEXT", "XrViewConfigurationViewFovEPIC",
        prepend = true
    )..nullable..opaque_p("next")
    uint32_t("recommendedImageRectWidth")
    uint32_t("maxImageRectWidth")
    uint32_t("recommendedImageRectHeight")
    uint32_t("maxImageRectHeight")
    uint32_t("recommendedSwapchainSampleCount")
    uint32_t("maxSwapchainSampleCount")
}

val XrSwapchainCreateInfo = struct(Module.OPENXR, "XrSwapchainCreateInfo") {
    Expression("#TYPE_SWAPCHAIN_CREATE_INFO")..XrStructureType("type")
    PointerSetter(
        "XrSecondaryViewConfigurationSwapchainCreateInfoMSFT", "XrSwapchainCreateInfoFoveationFB", "XrVulkanSwapchainCreateInfoMETA", "XrVulkanSwapchainFormatListCreateInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrSwapchainCreateFlags("createFlags")
    XrSwapchainUsageFlags("usageFlags")
    int64_t("format")
    uint32_t("sampleCount")
    uint32_t("width")
    uint32_t("height")
    uint32_t("faceCount")
    uint32_t("arraySize")
    uint32_t("mipCount")
}

val XrSwapchainImageBaseHeader = struct(Module.OPENXR, "XrSwapchainImageBaseHeader", mutable = false) {
    XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
}

val XrSwapchainImageAcquireInfo = struct(Module.OPENXR, "XrSwapchainImageAcquireInfo") {
    Expression("#TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSwapchainImageWaitInfo = struct(Module.OPENXR, "XrSwapchainImageWaitInfo") {
    Expression("#TYPE_SWAPCHAIN_IMAGE_WAIT_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrDuration("timeout")
}

val XrSwapchainImageReleaseInfo = struct(Module.OPENXR, "XrSwapchainImageReleaseInfo") {
    Expression("#TYPE_SWAPCHAIN_IMAGE_RELEASE_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSessionBeginInfo = struct(Module.OPENXR, "XrSessionBeginInfo") {
    Expression("#TYPE_SESSION_BEGIN_INFO")..XrStructureType("type")
    PointerSetter(
        "XrSecondaryViewConfigurationSessionBeginInfoMSFT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrViewConfigurationType("primaryViewConfigurationType")
}

val XrFrameWaitInfo = struct(Module.OPENXR, "XrFrameWaitInfo") {
    Expression("#TYPE_FRAME_WAIT_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrFrameState = struct(Module.OPENXR, "XrFrameState") {
    Expression("#TYPE_FRAME_STATE")..XrStructureType("type")
    PointerSetter(
        "XrSecondaryViewConfigurationFrameStateMSFT",
        prepend = true
    )..nullable..opaque_p("next")
    XrTime("predictedDisplayTime")
    XrDuration("predictedDisplayPeriod")
    XrBool32("shouldRender")
}

val XrFrameBeginInfo = struct(Module.OPENXR, "XrFrameBeginInfo") {
    Expression("#TYPE_FRAME_BEGIN_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrCompositionLayerBaseHeader = struct(Module.OPENXR, "XrCompositionLayerBaseHeader") {
    XrStructureType("type")
    PointerSetter(
        "XrCompositionLayerAlphaBlendFB", "XrCompositionLayerColorScaleBiasKHR", "XrCompositionLayerDepthTestFB", "XrCompositionLayerImageLayoutFB", "XrCompositionLayerSecureContentFB", "XrCompositionLayerSettingsFB",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrCompositionLayerFlags("layerFlags")
    XrSpace("space")
}

val XrFrameEndInfo = struct(Module.OPENXR, "XrFrameEndInfo") {
    Expression("#TYPE_FRAME_END_INFO")..XrStructureType("type")
    PointerSetter(
        "XrFrameEndInfoML", "XrGlobalDimmerFrameEndInfoML", "XrLocalDimmingFrameEndInfoMETA", "XrSecondaryViewConfigurationFrameEndInfoMSFT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrTime("displayTime")
    XrEnvironmentBlendMode("environmentBlendMode")
    AutoSize("layers", optional = true)..uint32_t("layerCount")
    nullable..XrCompositionLayerBaseHeader.const.p.const.p("layers")
}

val XrViewLocateInfo = struct(Module.OPENXR, "XrViewLocateInfo") {
    Expression("#TYPE_VIEW_LOCATE_INFO")..XrStructureType("type")
    PointerSetter(
        "XrViewLocateFoveatedRenderingVARJO",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrViewConfigurationType("viewConfigurationType")
    XrTime("displayTime")
    XrSpace("space")
}

val XrViewState = struct(Module.OPENXR, "XrViewState") {
    Expression("#TYPE_VIEW_STATE")..XrStructureType("type")
    nullable..opaque_p("next")
    XrViewStateFlags("viewStateFlags")
}

val XrFovf = struct(Module.OPENXR, "XrFovf") {
    float("angleLeft")
    float("angleRight")
    float("angleUp")
    float("angleDown")
}

val XrView = struct(Module.OPENXR, "XrView") {
    Expression("#TYPE_VIEW")..XrStructureType("type")
    nullable..opaque_p("next")
    XrPosef("pose")
    XrFovf("fov")
}

val XrActionSetCreateInfo = struct(Module.OPENXR, "XrActionSetCreateInfo") {
    javaImport("static org.lwjgl.openxr.XR10.*")
    Expression("#TYPE_ACTION_SET_CREATE_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    charUTF8("actionSetName")["XR_MAX_ACTION_SET_NAME_SIZE"]
    charUTF8("localizedActionSetName")["XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE"]
    uint32_t("priority")
}

val XrActionCreateInfo = struct(Module.OPENXR, "XrActionCreateInfo") {
    javaImport("static org.lwjgl.openxr.XR10.*")
    Expression("#TYPE_ACTION_CREATE_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    charUTF8("actionName")["XR_MAX_ACTION_NAME_SIZE"]
    XrActionType("actionType")
    AutoSize("subactionPaths", optional = true)..uint32_t("countSubactionPaths")
    nullable..XrPath.const.p("subactionPaths")
    charUTF8("localizedActionName")["XR_MAX_LOCALIZED_ACTION_NAME_SIZE"]
}

val XrActionSuggestedBinding = struct(Module.OPENXR, "XrActionSuggestedBinding") {
    XrAction("action")
    XrPath("binding")
}

val XrInteractionProfileSuggestedBinding = struct(Module.OPENXR, "XrInteractionProfileSuggestedBinding") {
    Expression("#TYPE_INTERACTION_PROFILE_SUGGESTED_BINDING")..XrStructureType("type")
    PointerSetter(
        "XrBindingModificationsKHR",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrPath("interactionProfile")
    AutoSize("suggestedBindings")..uint32_t("countSuggestedBindings")
    XrActionSuggestedBinding.const.p("suggestedBindings")
}

val XrSessionActionSetsAttachInfo = struct(Module.OPENXR, "XrSessionActionSetsAttachInfo") {
    Expression("#TYPE_SESSION_ACTION_SETS_ATTACH_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("actionSets")..uint32_t("countActionSets")
    XrActionSet.const.p("actionSets")
}

val XrInteractionProfileState = struct(Module.OPENXR, "XrInteractionProfileState") {
    Expression("#TYPE_INTERACTION_PROFILE_STATE")..XrStructureType("type")
    nullable..opaque_p("next")
    XrPath("interactionProfile")
}

val XrActionStateGetInfo = struct(Module.OPENXR, "XrActionStateGetInfo") {
    Expression("#TYPE_ACTION_STATE_GET_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrAction("action")
    XrPath("subactionPath")
}

val XrActionStateBoolean = struct(Module.OPENXR, "XrActionStateBoolean") {
    Expression("#TYPE_ACTION_STATE_BOOLEAN")..XrStructureType("type")
    nullable..opaque_p("next")
    XrBool32("currentState")
    XrBool32("changedSinceLastSync")
    XrTime("lastChangeTime")
    XrBool32("isActive")
}

val XrActionStateFloat = struct(Module.OPENXR, "XrActionStateFloat") {
    Expression("#TYPE_ACTION_STATE_FLOAT")..XrStructureType("type")
    nullable..opaque_p("next")
    float("currentState")
    XrBool32("changedSinceLastSync")
    XrTime("lastChangeTime")
    XrBool32("isActive")
}

val XrVector2f = struct(Module.OPENXR, "XrVector2f") {
    float("x")
    float("y")
}

val XrActionStateVector2f = struct(Module.OPENXR, "XrActionStateVector2f") {
    Expression("#TYPE_ACTION_STATE_VECTOR2F")..XrStructureType("type")
    nullable..opaque_p("next")
    XrVector2f("currentState")
    XrBool32("changedSinceLastSync")
    XrTime("lastChangeTime")
    XrBool32("isActive")
}

val XrActionStatePose = struct(Module.OPENXR, "XrActionStatePose") {
    Expression("#TYPE_ACTION_STATE_POSE")..XrStructureType("type")
    nullable..opaque_p("next")
    XrBool32("isActive")
}

val XrActiveActionSet = struct(Module.OPENXR, "XrActiveActionSet") {
    XrActionSet("actionSet")
    XrPath("subactionPath")
}

val XrActionsSyncInfo = struct(Module.OPENXR, "XrActionsSyncInfo") {
    Expression("#TYPE_ACTIONS_SYNC_INFO")..XrStructureType("type")
    PointerSetter(
        "XrActiveActionSetPrioritiesEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    AutoSize("activeActionSets", optional = true)..uint32_t("countActiveActionSets")
    nullable..XrActiveActionSet.const.p("activeActionSets")
}

val XrBoundSourcesForActionEnumerateInfo = struct(Module.OPENXR, "XrBoundSourcesForActionEnumerateInfo") {
    Expression("#TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrAction("action")
}

val XrInputSourceLocalizedNameGetInfo = struct(Module.OPENXR, "XrInputSourceLocalizedNameGetInfo") {
    Expression("#TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPath("sourcePath")
    XrInputSourceLocalizedNameFlags("whichComponents")
}

val XrHapticActionInfo = struct(Module.OPENXR, "XrHapticActionInfo") {
    Expression("#TYPE_HAPTIC_ACTION_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrAction("action")
    XrPath("subactionPath")
}

val XrHapticBaseHeader = struct(Module.OPENXR, "XrHapticBaseHeader") {
    XrStructureType("type")
    nullable..opaque_const_p("next")
}

val _XrBaseInStructure = struct(Module.OPENXR, "XrBaseInStructure")
val XrBaseInStructure = struct(Module.OPENXR, "XrBaseInStructure") {
    XrStructureType("type")
    _XrBaseInStructure.const.p("next")
}

val _XrBaseOutStructure = struct(Module.OPENXR, "XrBaseOutStructure")
val XrBaseOutStructure = struct(Module.OPENXR, "XrBaseOutStructure") {
    XrStructureType("type")
    _XrBaseOutStructure.p("next")
}

val XrOffset2Di = struct(Module.OPENXR, "XrOffset2Di") {
    int32_t("x")
    int32_t("y")
}

val XrExtent2Di = struct(Module.OPENXR, "XrExtent2Di") {
    int32_t("width")
    int32_t("height")
}

val XrRect2Di = struct(Module.OPENXR, "XrRect2Di") {
    XrOffset2Di("offset")
    XrExtent2Di("extent")
}

val XrSwapchainSubImage = struct(Module.OPENXR, "XrSwapchainSubImage") {
    XrSwapchain("swapchain")
    XrRect2Di("imageRect")
    uint32_t("imageArrayIndex")
}

val XrCompositionLayerProjectionView = struct(Module.OPENXR, "XrCompositionLayerProjectionView") {
    Expression("#TYPE_COMPOSITION_LAYER_PROJECTION_VIEW")..XrStructureType("type")
    PointerSetter(
        "XrCompositionLayerDepthInfoKHR", "XrCompositionLayerSpaceWarpInfoFB", "XrFrameSynthesisInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrPosef("pose")
    XrFovf("fov")
    XrSwapchainSubImage("subImage")
}

val XrCompositionLayerProjection = struct(Module.OPENXR, "XrCompositionLayerProjection", parentStruct = XrCompositionLayerBaseHeader) {
    Expression("#TYPE_COMPOSITION_LAYER_PROJECTION")..XrStructureType("type")
    PointerSetter(
        "XrCompositionLayerDepthTestVARJO", "XrCompositionLayerReprojectionInfoMSFT", "XrCompositionLayerReprojectionPlaneOverrideMSFT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrCompositionLayerFlags("layerFlags")
    XrSpace("space")
    AutoSize("views")..uint32_t("viewCount")
    XrCompositionLayerProjectionView.const.p("views")
}

val XrCompositionLayerQuad = struct(Module.OPENXR, "XrCompositionLayerQuad", parentStruct = XrCompositionLayerBaseHeader) {
    Expression("#TYPE_COMPOSITION_LAYER_QUAD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrCompositionLayerFlags("layerFlags")
    XrSpace("space")
    XrEyeVisibility("eyeVisibility")
    XrSwapchainSubImage("subImage")
    XrPosef("pose")
    XrExtent2Df("size")
}

val XrEventDataBaseHeader = struct(Module.OPENXR, "XrEventDataBaseHeader", mutable = false) {
    XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
}

val XrEventDataEventsLost = struct(Module.OPENXR, "XrEventDataEventsLost", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_EVENTS_LOST")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    uint32_t("lostEventCount")
}

val XrEventDataInstanceLossPending = struct(Module.OPENXR, "XrEventDataInstanceLossPending", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrTime("lossTime")
}

val XrEventDataSessionStateChanged = struct(Module.OPENXR, "XrEventDataSessionStateChanged", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SESSION_STATE_CHANGED")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrSession("session")
    XrSessionState("state")
    XrTime("time")
}

val XrEventDataReferenceSpaceChangePending = struct(Module.OPENXR, "XrEventDataReferenceSpaceChangePending", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrSession("session")
    XrReferenceSpaceType("referenceSpaceType")
    XrTime("changeTime")
    XrBool32("poseValid")
    XrPosef("poseInPreviousSpace")
}

val XrEventDataInteractionProfileChanged = struct(Module.OPENXR, "XrEventDataInteractionProfileChanged", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrSession("session")
}

val XrHapticVibration = struct(Module.OPENXR, "XrHapticVibration", parentStruct = XrHapticBaseHeader) {
    Expression("#TYPE_HAPTIC_VIBRATION")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrDuration("duration")
    float("frequency")
    float("amplitude")
}

val XrOffset2Df = struct(Module.OPENXR, "XrOffset2Df") {
    float("x")
    float("y")
}

val XrRect2Df = struct(Module.OPENXR, "XrRect2Df") {
    XrOffset2Df("offset")
    XrExtent2Df("extent")
}

val XrVector4f = struct(Module.OPENXR, "XrVector4f") {
    float("x")
    float("y")
    float("z")
    float("w")
}

val XrColor4f = struct(Module.OPENXR, "XrColor4f") {
    float("r")
    float("g")
    float("b")
    float("a")
}

val XrColor3f = struct(Module.OPENXR, "XrColor3f") {
    float("r")
    float("g")
    float("b")
}

val XrExtent3Df = struct(Module.OPENXR, "XrExtent3Df") {
    float("width")
    float("height")
    float("depth")
}

val XrSpheref = struct(Module.OPENXR, "XrSpheref") {
    XrPosef("center")
    float("radius")
}

val XrBoxf = struct(Module.OPENXR, "XrBoxf") {
    XrPosef("center")
    XrExtent3Df("extents")
}

val XrFrustumf = struct(Module.OPENXR, "XrFrustumf") {
    XrPosef("pose")
    XrFovf("fov")
    float("nearZ")
    float("farZ")
}

val XrUuid = struct(Module.OPENXR, "XrUuid") {
    javaImport("static org.lwjgl.openxr.XR11.*")
    uint8_t("data")["XR_UUID_SIZE"]
}

val XrSpacesLocateInfo = struct(Module.OPENXR, "XrSpacesLocateInfo") {
    Expression("#TYPE_SPACES_LOCATE_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
    AutoSize("spaces")..uint32_t("spaceCount")
    XrSpace.const.p("spaces")
}

val XrSpaceLocationData = struct(Module.OPENXR, "XrSpaceLocationData", mutable = false) {
    XrSpaceLocationFlags("locationFlags")
    XrPosef("pose")
}

val XrSpaceLocations = struct(Module.OPENXR, "XrSpaceLocations") {
    Expression("#TYPE_SPACE_LOCATIONS")..XrStructureType("type")
    PointerSetter(
        "XrSpaceVelocities", "XrSpaceVelocitiesKHR",
        prepend = true
    )..nullable..opaque_p("next")
    AutoSize("locations")..uint32_t("locationCount")
    XrSpaceLocationData.p("locations")
}

val XrSpaceVelocityData = struct(Module.OPENXR, "XrSpaceVelocityData", mutable = false) {
    XrSpaceVelocityFlags("velocityFlags")
    XrVector3f("linearVelocity")
    XrVector3f("angularVelocity")
}

val XrSpaceVelocities = struct(Module.OPENXR, "XrSpaceVelocities") {
    Expression("#TYPE_SPACE_VELOCITIES")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("velocities")..uint32_t("velocityCount")
    XrSpaceVelocityData.p("velocities")
}