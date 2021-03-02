/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr

import org.lwjgl.generator.*

const val ARM = "ARM"
const val COLLABORA = "COLLABORA"
const val EPIC = "EPIC"
const val EXT = "EXT"
const val EXTX = "EXTX"
const val FB = "FB"
const val GOOGLE = "GOOGLE"
const val HTC = "HTC"
const val HUAWEI = "HUAWEI"
const val INTEL = "INTEL"
const val KHR = "KHR"
const val LUNARG = "LUNARG"
const val LIV = "LIV"
const val ML = "ML"
const val MND = "MND"
const val MNDX = "MNDX"
const val MSFT = "MSFT"
const val NV = "NV"
const val OCULUS = "OCULUS"
const val PLUTO = "PLUTO"
const val QCOM = "QCOM"
const val STARBREEZE = "STARBREEZE"
const val TOBII = "TOBII"
const val ULTRALEAP = "ULTRALEAP"
const val VALVE = "VALVE"
const val VARJO = "VARJO"

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
val XrInstanceCreateFlags = typedef(XrFlags, "XrInstanceCreateFlags")
val XrSessionCreateFlags = typedef(XrFlags, "XrSessionCreateFlags")
val XrSpaceVelocityFlags = typedef(XrFlags, "XrSpaceVelocityFlags")
val XrSpaceLocationFlags = typedef(XrFlags, "XrSpaceLocationFlags")
val XrSwapchainCreateFlags = typedef(XrFlags, "XrSwapchainCreateFlags")
val XrSwapchainUsageFlags = typedef(XrFlags, "XrSwapchainUsageFlags")
val XrCompositionLayerFlags = typedef(XrFlags, "XrCompositionLayerFlags")
val XrViewStateFlags = typedef(XrFlags, "XrViewStateFlags")
val XrInputSourceLocalizedNameFlags = typedef(XrFlags, "XrInputSourceLocalizedNameFlags")

// Function pointer types
val PFN_xrVoidFunction = Module.OPENXR.callback {
    void(
        "XrVoidFunction",
        "",

        nativeType = "PFN_xrVoidFunction"
    ) {
        
    }
}

// Struct types
val XrApiLayerProperties = struct(Module.OPENXR, "XrApiLayerProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    charUTF8("layerName", "")["XR_MAX_API_LAYER_NAME_SIZE"]
    XrVersion("specVersion", "")
    uint32_t("layerVersion", "")
    charUTF8("description", "")["XR_MAX_API_LAYER_DESCRIPTION_SIZE"]
}

val XrExtensionProperties = struct(Module.OPENXR, "XrExtensionProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    charUTF8("extensionName", "")["XR_MAX_EXTENSION_NAME_SIZE"]
    uint32_t("extensionVersion", "")
}

val XrApplicationInfo = struct(Module.OPENXR, "XrApplicationInfo") {
    javaImport("static org.lwjgl.openxr.XR10.*")
    charUTF8("applicationName", "")["XR_MAX_APPLICATION_NAME_SIZE"]
    uint32_t("applicationVersion", "")
    charUTF8("engineName", "")["XR_MAX_ENGINE_NAME_SIZE"]
    uint32_t("engineVersion", "")
    XrVersion("apiVersion", "")
}

val XrInstanceCreateInfo = struct(Module.OPENXR, "XrInstanceCreateInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrInstanceCreateFlags("createFlags", "")
    XrApplicationInfo("applicationInfo", "")
    AutoSize("enabledApiLayerNames", optional = true)..uint32_t("enabledApiLayerCount", "")
    charUTF8.const.p.const.p("enabledApiLayerNames", "")
    AutoSize("enabledExtensionNames", optional = true)..uint32_t("enabledExtensionCount", "")
    charUTF8.const.p.const.p("enabledExtensionNames", "")
}

val XrInstanceProperties = struct(Module.OPENXR, "XrInstanceProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrVersion("runtimeVersion", "")
    charUTF8("runtimeName", "")["XR_MAX_RUNTIME_NAME_SIZE"]
}

val XrEventDataBuffer = struct(Module.OPENXR, "XrEventDataBuffer") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    uint8_t("varying", "")[4000]
}

val XrSystemGetInfo = struct(Module.OPENXR, "XrSystemGetInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrFormFactor("formFactor", "")
}

val XrSystemGraphicsProperties = struct(Module.OPENXR, "XrSystemGraphicsProperties") {
    uint32_t("maxSwapchainImageHeight", "")
    uint32_t("maxSwapchainImageWidth", "")
    uint32_t("maxLayerCount", "")
}

val XrSystemTrackingProperties = struct(Module.OPENXR, "XrSystemTrackingProperties") {
    XrBool32("orientationTracking", "")
    XrBool32("positionTracking", "")
}

val XrSystemProperties = struct(Module.OPENXR, "XrSystemProperties", mutable = false) {
    javaImport("static org.lwjgl.openxr.XR10.*")
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrSystemId("systemId", "")
    uint32_t("vendorId", "")
    charUTF8("systemName", "")["XR_MAX_SYSTEM_NAME_SIZE"]
    XrSystemGraphicsProperties("graphicsProperties", "")
    XrSystemTrackingProperties("trackingProperties", "")
}

val XrSessionCreateInfo = struct(Module.OPENXR, "XrSessionCreateInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSessionCreateFlags("createFlags", "")
    XrSystemId("systemId", "")
}

val XrVector3f = struct(Module.OPENXR, "XrVector3f") {
    float("x", "")
    float("y", "")
    float("z", "")
}

val XrSpaceVelocity = struct(Module.OPENXR, "XrSpaceVelocity") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrSpaceVelocityFlags("velocityFlags", "")
    XrVector3f("linearVelocity", "")
    XrVector3f("angularVelocity", "")
}

val XrQuaternionf = struct(Module.OPENXR, "XrQuaternionf") {
    float("x", "")
    float("y", "")
    float("z", "")
    float("w", "")
}

val XrPosef = struct(Module.OPENXR, "XrPosef") {
    XrQuaternionf("orientation", "")
    XrVector3f("position", "")
}

val XrReferenceSpaceCreateInfo = struct(Module.OPENXR, "XrReferenceSpaceCreateInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrReferenceSpaceType("referenceSpaceType", "")
    XrPosef("poseInReferenceSpace", "")
}

val XrExtent2Df = struct(Module.OPENXR, "XrExtent2Df") {
    float("width", "")
    float("height", "")
}

val XrActionSpaceCreateInfo = struct(Module.OPENXR, "XrActionSpaceCreateInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrAction("action", "")
    XrPath("subactionPath", "")
    XrPosef("poseInActionSpace", "")
}

val XrSpaceLocation = struct(Module.OPENXR, "XrSpaceLocation") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrSpaceLocationFlags("locationFlags", "")
    XrPosef("pose", "")
}

val XrViewConfigurationProperties = struct(Module.OPENXR, "XrViewConfigurationProperties") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrViewConfigurationType("viewConfigurationType", "")
    XrBool32("fovMutable", "")
}

val XrViewConfigurationView = struct(Module.OPENXR, "XrViewConfigurationView") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    uint32_t("recommendedImageRectWidth", "")
    uint32_t("maxImageRectWidth", "")
    uint32_t("recommendedImageRectHeight", "")
    uint32_t("maxImageRectHeight", "")
    uint32_t("recommendedSwapchainSampleCount", "")
    uint32_t("maxSwapchainSampleCount", "")
}

val XrSwapchainCreateInfo = struct(Module.OPENXR, "XrSwapchainCreateInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSwapchainCreateFlags("createFlags", "")
    XrSwapchainUsageFlags("usageFlags", "")
    int64_t("format", "")
    uint32_t("sampleCount", "")
    uint32_t("width", "")
    uint32_t("height", "")
    uint32_t("faceCount", "")
    uint32_t("arraySize", "")
    uint32_t("mipCount", "")
}

val XrSwapchainImageBaseHeader = struct(Module.OPENXR, "XrSwapchainImageBaseHeader") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
}

val XrSwapchainImageAcquireInfo = struct(Module.OPENXR, "XrSwapchainImageAcquireInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
}

val XrSwapchainImageWaitInfo = struct(Module.OPENXR, "XrSwapchainImageWaitInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrDuration("timeout", "")
}

val XrSwapchainImageReleaseInfo = struct(Module.OPENXR, "XrSwapchainImageReleaseInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
}

val XrSessionBeginInfo = struct(Module.OPENXR, "XrSessionBeginInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrViewConfigurationType("primaryViewConfigurationType", "")
}

val XrFrameWaitInfo = struct(Module.OPENXR, "XrFrameWaitInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
}

val XrFrameState = struct(Module.OPENXR, "XrFrameState") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrTime("predictedDisplayTime", "")
    XrDuration("predictedDisplayPeriod", "")
    XrBool32("shouldRender", "")
}

val XrFrameBeginInfo = struct(Module.OPENXR, "XrFrameBeginInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
}

val XrCompositionLayerBaseHeader = struct(Module.OPENXR, "XrCompositionLayerBaseHeader") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrCompositionLayerFlags("layerFlags", "")
    XrSpace("space", "")
}

val XrFrameEndInfo = struct(Module.OPENXR, "XrFrameEndInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrTime("displayTime", "")
    XrEnvironmentBlendMode("environmentBlendMode", "")
    AutoSize("layers", optional = true)..uint32_t("layerCount", "")
    nullable..XrCompositionLayerBaseHeader.const.p.const.p("layers", "")
}

val XrViewLocateInfo = struct(Module.OPENXR, "XrViewLocateInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrViewConfigurationType("viewConfigurationType", "")
    XrTime("displayTime", "")
    XrSpace("space", "")
}

val XrViewState = struct(Module.OPENXR, "XrViewState") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrViewStateFlags("viewStateFlags", "")
}

val XrFovf = struct(Module.OPENXR, "XrFovf") {
    float("angleLeft", "")
    float("angleRight", "")
    float("angleUp", "")
    float("angleDown", "")
}

val XrView = struct(Module.OPENXR, "XrView") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrPosef("pose", "")
    XrFovf("fov", "")
}

val XrActionSetCreateInfo = struct(Module.OPENXR, "XrActionSetCreateInfo") {
    javaImport("static org.lwjgl.openxr.XR10.*")
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    charUTF8("actionSetName", "")["XR_MAX_ACTION_SET_NAME_SIZE"]
    charUTF8("localizedActionSetName", "")["XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE"]
    uint32_t("priority", "")
}

val XrActionCreateInfo = struct(Module.OPENXR, "XrActionCreateInfo") {
    javaImport("static org.lwjgl.openxr.XR10.*")
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    charUTF8("actionName", "")["XR_MAX_ACTION_NAME_SIZE"]
    XrActionType("actionType", "")
    AutoSize("subactionPaths", optional = true)..uint32_t("countSubactionPaths", "")
    nullable..XrPath.const.p("subactionPaths", "")
    charUTF8("localizedActionName", "")["XR_MAX_LOCALIZED_ACTION_NAME_SIZE"]
}

val XrActionSuggestedBinding = struct(Module.OPENXR, "XrActionSuggestedBinding") {
    XrAction("action", "")
    XrPath("binding", "")
}

val XrInteractionProfileSuggestedBinding = struct(Module.OPENXR, "XrInteractionProfileSuggestedBinding") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrPath("interactionProfile", "")
    AutoSize("suggestedBindings")..uint32_t("countSuggestedBindings", "")
    XrActionSuggestedBinding.const.p("suggestedBindings", "")
}

val XrSessionActionSetsAttachInfo = struct(Module.OPENXR, "XrSessionActionSetsAttachInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    AutoSize("actionSets")..uint32_t("countActionSets", "")
    XrActionSet.const.p("actionSets", "")
}

val XrInteractionProfileState = struct(Module.OPENXR, "XrInteractionProfileState") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrPath("interactionProfile", "")
}

val XrActionStateGetInfo = struct(Module.OPENXR, "XrActionStateGetInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrAction("action", "")
    XrPath("subactionPath", "")
}

val XrActionStateBoolean = struct(Module.OPENXR, "XrActionStateBoolean") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrBool32("currentState", "")
    XrBool32("changedSinceLastSync", "")
    XrTime("lastChangeTime", "")
    XrBool32("isActive", "")
}

val XrActionStateFloat = struct(Module.OPENXR, "XrActionStateFloat") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    float("currentState", "")
    XrBool32("changedSinceLastSync", "")
    XrTime("lastChangeTime", "")
    XrBool32("isActive", "")
}

val XrVector2f = struct(Module.OPENXR, "XrVector2f") {
    float("x", "")
    float("y", "")
}

val XrActionStateVector2f = struct(Module.OPENXR, "XrActionStateVector2f") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrVector2f("currentState", "")
    XrBool32("changedSinceLastSync", "")
    XrTime("lastChangeTime", "")
    XrBool32("isActive", "")
}

val XrActionStatePose = struct(Module.OPENXR, "XrActionStatePose") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrBool32("isActive", "")
}

val XrActiveActionSet = struct(Module.OPENXR, "XrActiveActionSet") {
    XrActionSet("actionSet", "")
    XrPath("subactionPath", "")
}

val XrActionsSyncInfo = struct(Module.OPENXR, "XrActionsSyncInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    AutoSize("activeActionSets", optional = true)..uint32_t("countActiveActionSets", "")
    nullable..XrActiveActionSet.const.p("activeActionSets", "")
}

val XrBoundSourcesForActionEnumerateInfo = struct(Module.OPENXR, "XrBoundSourcesForActionEnumerateInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrAction("action", "")
}

val XrInputSourceLocalizedNameGetInfo = struct(Module.OPENXR, "XrInputSourceLocalizedNameGetInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrPath("sourcePath", "")
    XrInputSourceLocalizedNameFlags("whichComponents", "")
}

val XrHapticActionInfo = struct(Module.OPENXR, "XrHapticActionInfo") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrAction("action", "")
    XrPath("subactionPath", "")
}

val XrHapticBaseHeader = struct(Module.OPENXR, "XrHapticBaseHeader") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
}

val _XrBaseInStructure = struct(Module.OPENXR, "XrBaseInStructure")
val XrBaseInStructure = struct(Module.OPENXR, "XrBaseInStructure") {
    XrStructureType("type", "")
    _XrBaseInStructure.p("next", "")
}

val _XrBaseOutStructure = struct(Module.OPENXR, "XrBaseOutStructure")
val XrBaseOutStructure = struct(Module.OPENXR, "XrBaseOutStructure") {
    XrStructureType("type", "")
    _XrBaseOutStructure.p("next", "")
}

val XrOffset2Di = struct(Module.OPENXR, "XrOffset2Di") {
    int32_t("x", "")
    int32_t("y", "")
}

val XrExtent2Di = struct(Module.OPENXR, "XrExtent2Di") {
    int32_t("width", "")
    int32_t("height", "")
}

val XrRect2Di = struct(Module.OPENXR, "XrRect2Di") {
    XrOffset2Di("offset", "")
    XrExtent2Di("extent", "")
}

val XrSwapchainSubImage = struct(Module.OPENXR, "XrSwapchainSubImage") {
    XrSwapchain("swapchain", "")
    XrRect2Di("imageRect", "")
    uint32_t("imageArrayIndex", "")
}

val XrCompositionLayerProjectionView = struct(Module.OPENXR, "XrCompositionLayerProjectionView") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrPosef("pose", "")
    XrFovf("fov", "")
    XrSwapchainSubImage("subImage", "")
}

val XrCompositionLayerProjection = struct(Module.OPENXR, "XrCompositionLayerProjection") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrCompositionLayerFlags("layerFlags", "")
    XrSpace("space", "")
    AutoSize("views")..uint32_t("viewCount", "")
    XrCompositionLayerProjectionView.const.p("views", "")
}

val XrCompositionLayerQuad = struct(Module.OPENXR, "XrCompositionLayerQuad") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrCompositionLayerFlags("layerFlags", "")
    XrSpace("space", "")
    XrEyeVisibility("eyeVisibility", "")
    XrSwapchainSubImage("subImage", "")
    XrPosef("pose", "")
    XrExtent2Df("size", "")
}

val XrEventDataBaseHeader = struct(Module.OPENXR, "XrEventDataBaseHeader") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
}

val XrEventDataEventsLost = struct(Module.OPENXR, "XrEventDataEventsLost") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    uint32_t("lostEventCount", "")
}

val XrEventDataInstanceLossPending = struct(Module.OPENXR, "XrEventDataInstanceLossPending") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrTime("lossTime", "")
}

val XrEventDataSessionStateChanged = struct(Module.OPENXR, "XrEventDataSessionStateChanged") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSession("session", "")
    XrSessionState("state", "")
    XrTime("time", "")
}

val XrEventDataReferenceSpaceChangePending = struct(Module.OPENXR, "XrEventDataReferenceSpaceChangePending") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSession("session", "")
    XrReferenceSpaceType("referenceSpaceType", "")
    XrTime("changeTime", "")
    XrBool32("poseValid", "")
    XrPosef("poseInPreviousSpace", "")
}

val XrEventDataInteractionProfileChanged = struct(Module.OPENXR, "XrEventDataInteractionProfileChanged") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSession("session", "")
}

val XrHapticVibration = struct(Module.OPENXR, "XrHapticVibration") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrDuration("duration", "")
    float("frequency", "")
    float("amplitude", "")
}

val XrOffset2Df = struct(Module.OPENXR, "XrOffset2Df") {
    float("x", "")
    float("y", "")
}

val XrRect2Df = struct(Module.OPENXR, "XrRect2Df") {
    XrOffset2Df("offset", "")
    XrExtent2Df("extent", "")
}

val XrVector4f = struct(Module.OPENXR, "XrVector4f") {
    float("x", "")
    float("y", "")
    float("z", "")
    float("w", "")
}

val XrColor4f = struct(Module.OPENXR, "XrColor4f") {
    float("r", "")
    float("g", "")
    float("b", "")
    float("a", "")
}