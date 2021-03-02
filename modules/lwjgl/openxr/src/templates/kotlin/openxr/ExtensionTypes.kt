/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr

import org.lwjgl.generator.*
//import core.android.*
import core.linux.*
import core.macos.*
import core.windows.*
import vulkan.*
import egl.*
import opengl.*

// Handle types
val XrDebugUtilsMessengerEXT = XR_DEFINE_HANDLE("XrDebugUtilsMessengerEXT")
val XrSpatialAnchorMSFT = XR_DEFINE_HANDLE("XrSpatialAnchorMSFT")
val XrHandTrackerEXT = XR_DEFINE_HANDLE("XrHandTrackerEXT")

// Enum types
val XrAndroidThreadTypeKHR = "XrAndroidThreadTypeKHR".enumType
val XrPerfSettingsDomainEXT = "XrPerfSettingsDomainEXT".enumType
val XrPerfSettingsSubDomainEXT = "XrPerfSettingsSubDomainEXT".enumType
val XrPerfSettingsLevelEXT = "XrPerfSettingsLevelEXT".enumType
val XrPerfSettingsNotificationLevelEXT = "XrPerfSettingsNotificationLevelEXT".enumType
val XrVisibilityMaskTypeKHR = "XrVisibilityMaskTypeKHR".enumType
val XrSpatialGraphNodeTypeMSFT = "XrSpatialGraphNodeTypeMSFT".enumType
val XrHandEXT = "XrHandEXT".enumType
val XrHandJointEXT = "XrHandJointEXT".enumType
val XrHandJointSetEXT = "XrHandJointSetEXT".enumType
val XrHandPoseTypeMSFT = "XrHandPoseTypeMSFT".enumType
val XrColorSpaceFB = "XrColorSpaceFB".enumType

// Bitmask types
val XrDebugUtilsMessageSeverityFlagsEXT = typedef(XrFlags, "XrDebugUtilsMessageSeverityFlagsEXT")
val XrDebugUtilsMessageTypeFlagsEXT = typedef(XrFlags, "XrDebugUtilsMessageTypeFlagsEXT")
val XrOverlaySessionCreateFlagsEXTX = typedef(XrFlags, "XrOverlaySessionCreateFlagsEXTX")
val XrOverlayMainSessionFlagsEXTX = typedef(XrFlags, "XrOverlayMainSessionFlagsEXTX")
val XrAndroidSurfaceSwapchainFlagsFB = typedef(XrFlags, "XrAndroidSurfaceSwapchainFlagsFB")
val XrVulkanInstanceCreateFlagsKHR = typedef(XrFlags, "XrVulkanInstanceCreateFlagsKHR")
val XrVulkanDeviceCreateFlagsKHR = typedef(XrFlags, "XrVulkanDeviceCreateFlagsKHR")

// Function pointer types
val _XrDebugUtilsMessengerCallbackDataEXT = struct(Module.OPENXR, "XrDebugUtilsMessengerCallbackDataEXT")
val PFN_xrDebugUtilsMessengerCallbackEXT = Module.OPENXR.callback {
    XrBool32(
        "XrDebugUtilsMessengerCallbackEXT",
        "",

        XrDebugUtilsMessageSeverityFlagsEXT("messageSeverity", ""),
        XrDebugUtilsMessageTypeFlagsEXT("messageTypes", ""),
        _XrDebugUtilsMessengerCallbackDataEXT.const.p("callbackData", ""),
        opaque_p("userData", ""),

        nativeType = "PFN_xrDebugUtilsMessengerCallbackEXT"
    ) {
        
    }
}

// Struct types
val XrCompositionLayerCubeKHR = struct(Module.OPENXR, "XrCompositionLayerCubeKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrCompositionLayerFlags("layerFlags", "")
    XrSpace("space", "")
    XrEyeVisibility("eyeVisibility", "")
    XrSwapchain("swapchain", "")
    uint32_t("imageArrayIndex", "")
    XrQuaternionf("orientation", "")
}

val XrInstanceCreateInfoAndroidKHR = struct(Module.OPENXR, "XrInstanceCreateInfoAndroidKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    opaque_p("applicationVM", "")
    opaque_p("applicationActivity", "")
}

val XrCompositionLayerDepthInfoKHR = struct(Module.OPENXR, "XrCompositionLayerDepthInfoKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSwapchainSubImage("subImage", "")
    float("minDepth", "")
    float("maxDepth", "")
    float("nearZ", "")
    float("farZ", "")
}

val XrVulkanSwapchainFormatListCreateInfoKHR = struct(Module.OPENXR, "XrVulkanSwapchainFormatListCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    AutoSize("viewFormats", optional = true)..uint32_t("viewFormatCount", "")
    VkFormat.const.p("viewFormats", "")
}

val XrEventDataPerfSettingsEXT = struct(Module.OPENXR, "XrEventDataPerfSettingsEXT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrPerfSettingsDomainEXT("domain", "")
    XrPerfSettingsSubDomainEXT("subDomain", "")
    XrPerfSettingsNotificationLevelEXT("fromLevel", "")
    XrPerfSettingsNotificationLevelEXT("toLevel", "")
}

val XrCompositionLayerCylinderKHR = struct(Module.OPENXR, "XrCompositionLayerCylinderKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrCompositionLayerFlags("layerFlags", "")
    XrSpace("space", "")
    XrEyeVisibility("eyeVisibility", "")
    XrSwapchainSubImage("subImage", "")
    XrPosef("pose", "")
    float("radius", "")
    float("centralAngle", "")
    float("aspectRatio", "")
}

val XrCompositionLayerEquirectKHR = struct(Module.OPENXR, "XrCompositionLayerEquirectKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrCompositionLayerFlags("layerFlags", "")
    XrSpace("space", "")
    XrEyeVisibility("eyeVisibility", "")
    XrSwapchainSubImage("subImage", "")
    XrPosef("pose", "")
    float("radius", "")
    XrVector2f("scale", "")
    XrVector2f("bias", "")
}

val XrDebugUtilsObjectNameInfoEXT = struct(Module.OPENXR, "XrDebugUtilsObjectNameInfoEXT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrObjectType("objectType", "")
    uint64_t("objectHandle", "")
    nullable..charUTF8.const.p("objectName", "")
}

val XrDebugUtilsLabelEXT = struct(Module.OPENXR, "XrDebugUtilsLabelEXT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    charUTF8.const.p("labelName", "")
}

val XrDebugUtilsMessengerCallbackDataEXT = struct(Module.OPENXR, "XrDebugUtilsMessengerCallbackDataEXT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    charUTF8.const.p("messageId", "")
    charUTF8.const.p("functionName", "")
    charUTF8.const.p("message", "")
    AutoSize("objects", optional = true)..uint32_t("objectCount", "")
    nullable..XrDebugUtilsObjectNameInfoEXT.p("objects", "")
    AutoSize("sessionLabels", optional = true)..uint32_t("sessionLabelCount", "")
    nullable..XrDebugUtilsLabelEXT.p("sessionLabels", "")
}

val XrDebugUtilsMessengerCreateInfoEXT = struct(Module.OPENXR, "XrDebugUtilsMessengerCreateInfoEXT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrDebugUtilsMessageSeverityFlagsEXT("messageSeverities", "")
    XrDebugUtilsMessageTypeFlagsEXT("messageTypes", "")
    PFN_xrDebugUtilsMessengerCallbackEXT("userCallback", "")
    nullable..opaque_p("userData", "")
}

val XrGraphicsBindingOpenGLWin32KHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLWin32KHR") {
    javaImport("org.lwjgl.system.windows.*")
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    HDC("hDC", "")
    HGLRC("hGLRC", "")
}

val XrGraphicsBindingOpenGLXlibKHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLXlibKHR") {
    javaImport("org.lwjgl.system.linux.*")
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    Display.p("xDisplay", "")
    uint32_t("visualid", "")
    GLXFBConfig("glxFBConfig", "")
    GLXDrawable("glxDrawable", "")
    GLXContext("glxContext", "")
}

val XrGraphicsBindingOpenGLWaylandKHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLWaylandKHR") {
    javaImport("org.lwjgl.system.linux.*")
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    wl_display.p("display", "")
}

val XrSwapchainImageOpenGLKHR = struct(Module.OPENXR, "XrSwapchainImageOpenGLKHR") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    uint32_t("image", "")
}

val XrGraphicsRequirementsOpenGLKHR = struct(Module.OPENXR, "XrGraphicsRequirementsOpenGLKHR") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrVersion("minApiVersionSupported", "")
    XrVersion("maxApiVersionSupported", "")
}

val XrGraphicsBindingOpenGLESAndroidKHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLESAndroidKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    EGLDisplay("display", "")
    EGLConfig("config", "")
    EGLContext("context", "")
}

val XrSwapchainImageOpenGLESKHR = struct(Module.OPENXR, "XrSwapchainImageOpenGLESKHR") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    uint32_t("image", "")
}

val XrGraphicsRequirementsOpenGLESKHR = struct(Module.OPENXR, "XrGraphicsRequirementsOpenGLESKHR") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrVersion("minApiVersionSupported", "")
    XrVersion("maxApiVersionSupported", "")
}

val XrGraphicsBindingVulkanKHR = struct(Module.OPENXR, "XrGraphicsBindingVulkanKHR") {
    javaImport("org.lwjgl.vulkan.*")
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    VkInstance("instance", "")
    VkPhysicalDevice("physicalDevice", "")
    VkDevice("device", "")
    uint32_t("queueFamilyIndex", "")
    uint32_t("queueIndex", "")
}

val XrSwapchainImageVulkanKHR = struct(Module.OPENXR, "XrSwapchainImageVulkanKHR") {
    javaImport("org.lwjgl.vulkan.*")
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    VkImage("image", "")
}

val XrGraphicsRequirementsVulkanKHR = struct(Module.OPENXR, "XrGraphicsRequirementsVulkanKHR") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrVersion("minApiVersionSupported", "")
    XrVersion("maxApiVersionSupported", "")
}

val XrSystemEyeGazeInteractionPropertiesEXT = struct(Module.OPENXR, "XrSystemEyeGazeInteractionPropertiesEXT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrBool32("supportsEyeGazeInteraction", "")
}

val XrEyeGazeSampleTimeEXT = struct(Module.OPENXR, "XrEyeGazeSampleTimeEXT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrTime("time", "")
}

val XrVisibilityMaskKHR = struct(Module.OPENXR, "XrVisibilityMaskKHR") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput", "")
    uint32_t("vertexCountOutput", "")
    nullable..XrVector2f.p("vertices", "")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput", "")
    uint32_t("indexCountOutput", "")
    nullable..uint32_t.p("indices", "")
}

val XrEventDataVisibilityMaskChangedKHR = struct(Module.OPENXR, "XrEventDataVisibilityMaskChangedKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSession("session", "")
    XrViewConfigurationType("viewConfigurationType", "")
    uint32_t("viewIndex", "")
}

val XrSessionCreateInfoOverlayEXTX = struct(Module.OPENXR, "XrSessionCreateInfoOverlayEXTX") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrOverlaySessionCreateFlagsEXTX("createFlags", "")
    uint32_t("sessionLayersPlacement", "")
}

val XrEventDataMainSessionVisibilityChangedEXTX = struct(Module.OPENXR, "XrEventDataMainSessionVisibilityChangedEXTX") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrBool32("visible", "")
    XrOverlayMainSessionFlagsEXTX("flags", "")
}

val XrCompositionLayerColorScaleBiasKHR = struct(Module.OPENXR, "XrCompositionLayerColorScaleBiasKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrColor4f("colorScale", "")
    XrColor4f("colorBias", "")
}

val XrSpatialAnchorCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialAnchorCreateInfoMSFT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSpace("space", "")
    XrPosef("pose", "")
    XrTime("time", "")
}

val XrSpatialAnchorSpaceCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialAnchorSpaceCreateInfoMSFT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSpatialAnchorMSFT("anchor", "")
    XrPosef("poseInAnchorSpace", "")
}

val XrViewConfigurationDepthRangeEXT = struct(Module.OPENXR, "XrViewConfigurationDepthRangeEXT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    float("recommendedNearZ", "")
    float("minNearZ", "")
    float("recommendedFarZ", "")
    float("maxFarZ", "")
}

val XrGraphicsBindingEGLMNDX = struct(Module.OPENXR, "XrGraphicsBindingEGLMNDX") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    PFNEGLGETPROCADDRESSPROC("getProcAddress", "")
    EGLDisplay("display", "")
    EGLConfig("config", "")
    EGLContext("context", "")
}

val XrSpatialGraphNodeSpaceCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialGraphNodeSpaceCreateInfoMSFT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSpatialGraphNodeTypeMSFT("nodeType", "")
    uint8_t("nodeId", "")[16]
    XrPosef("pose", "")
}

val XrSystemHandTrackingPropertiesEXT = struct(Module.OPENXR, "XrSystemHandTrackingPropertiesEXT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrBool32("supportsHandTracking", "")
}

val XrHandTrackerCreateInfoEXT = struct(Module.OPENXR, "XrHandTrackerCreateInfoEXT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrHandEXT("hand", "")
    XrHandJointSetEXT("handJointSet", "")
}

val XrHandJointsLocateInfoEXT = struct(Module.OPENXR, "XrHandJointsLocateInfoEXT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSpace("baseSpace", "")
    XrTime("time", "")
}

val XrHandJointLocationEXT = struct(Module.OPENXR, "XrHandJointLocationEXT") {
    XrSpaceLocationFlags("locationFlags", "")
    XrPosef("pose", "")
    float("radius", "")
}

val XrHandJointVelocityEXT = struct(Module.OPENXR, "XrHandJointVelocityEXT") {
    XrSpaceVelocityFlags("velocityFlags", "")
    XrVector3f("linearVelocity", "")
    XrVector3f("angularVelocity", "")
}

val XrHandJointLocationsEXT = struct(Module.OPENXR, "XrHandJointLocationsEXT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrBool32("isActive", "")
    AutoSize("jointLocations")..uint32_t("jointCount", "")
    XrHandJointLocationEXT.p("jointLocations", "")
}

val XrHandJointVelocitiesEXT = struct(Module.OPENXR, "XrHandJointVelocitiesEXT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    AutoSize("jointVelocities")..uint32_t("jointCount", "")
    XrHandJointVelocityEXT.p("jointVelocities", "")
}

val XrSystemHandTrackingMeshPropertiesMSFT = struct(Module.OPENXR, "XrSystemHandTrackingMeshPropertiesMSFT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrBool32("supportsHandTrackingMesh", "")
    uint32_t("maxHandMeshIndexCount", "")
    uint32_t("maxHandMeshVertexCount", "")
}

val XrHandMeshSpaceCreateInfoMSFT = struct(Module.OPENXR, "XrHandMeshSpaceCreateInfoMSFT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrHandPoseTypeMSFT("handPoseType", "")
    XrPosef("poseInHandMeshSpace", "")
}

val XrHandMeshUpdateInfoMSFT = struct(Module.OPENXR, "XrHandMeshUpdateInfoMSFT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrTime("time", "")
    XrHandPoseTypeMSFT("handPoseType", "")
}

val XrHandMeshIndexBufferMSFT = struct(Module.OPENXR, "XrHandMeshIndexBufferMSFT") {
    uint32_t("indexBufferKey", "")
    AutoSize("indices")..uint32_t("indexCapacityInput", "")
    uint32_t("indexCountOutput", "")
    uint32_t.p("indices", "")
}

val XrHandMeshVertexMSFT = struct(Module.OPENXR, "XrHandMeshVertexMSFT") {
    XrVector3f("position", "")
    XrVector3f("normal", "")
}

val XrHandMeshVertexBufferMSFT = struct(Module.OPENXR, "XrHandMeshVertexBufferMSFT") {
    XrTime("vertexUpdateTime", "")
    AutoSize("vertices")..uint32_t("vertexCapacityInput", "")
    uint32_t("vertexCountOutput", "")
    XrHandMeshVertexMSFT.p("vertices", "")
}

val XrHandMeshMSFT = struct(Module.OPENXR, "XrHandMeshMSFT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrBool32("isActive", "")
    XrBool32("indexBufferChanged", "")
    XrBool32("vertexBufferChanged", "")
    XrHandMeshIndexBufferMSFT("indexBuffer", "")
    XrHandMeshVertexBufferMSFT("vertexBuffer", "")
}

val XrHandPoseTypeInfoMSFT = struct(Module.OPENXR, "XrHandPoseTypeInfoMSFT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrHandPoseTypeMSFT("handPoseType", "")
}

val XrSecondaryViewConfigurationSessionBeginInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationSessionBeginInfoMSFT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    AutoSize("enabledViewConfigurationTypes")..uint32_t("viewConfigurationCount", "")
    XrViewConfigurationType.const.p("enabledViewConfigurationTypes", "")
}

val XrSecondaryViewConfigurationStateMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationStateMSFT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrViewConfigurationType("viewConfigurationType", "")
    XrBool32("active", "")
}

val XrSecondaryViewConfigurationFrameStateMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationFrameStateMSFT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    AutoSize("viewConfigurationStates")..uint32_t("viewConfigurationCount", "")
    XrSecondaryViewConfigurationStateMSFT.p("viewConfigurationStates", "")
}

val XrSecondaryViewConfigurationLayerInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationLayerInfoMSFT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrViewConfigurationType("viewConfigurationType", "")
    XrEnvironmentBlendMode("environmentBlendMode", "")
    AutoSize("layers")..uint32_t("layerCount", "")
    XrCompositionLayerBaseHeader.const.p.const.p("layers", "")
}

val XrSecondaryViewConfigurationFrameEndInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationFrameEndInfoMSFT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    AutoSize("viewConfigurationLayersInfo")..uint32_t("viewConfigurationCount", "")
    XrSecondaryViewConfigurationLayerInfoMSFT.const.p("viewConfigurationLayersInfo", "")
}

val XrSecondaryViewConfigurationSwapchainCreateInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationSwapchainCreateInfoMSFT") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrViewConfigurationType("viewConfigurationType", "")
}

val XrControllerModelKeyStateMSFT = struct(Module.OPENXR, "XrControllerModelKeyStateMSFT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrControllerModelKeyMSFT("modelKey", "")
}

val XrControllerModelNodePropertiesMSFT = struct(Module.OPENXR, "XrControllerModelNodePropertiesMSFT") {
    javaImport("static org.lwjgl.openxr.MSFTControllerModel.*")
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    charUTF8("parentNodeName", "")["XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT"]
    charUTF8("nodeName", "")["XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT"]
}

val XrControllerModelPropertiesMSFT = struct(Module.OPENXR, "XrControllerModelPropertiesMSFT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    AutoSize("nodeProperties", optional = true)..uint32_t("nodeCapacityInput", "")
    uint32_t("nodeCountOutput", "")
    nullable..XrControllerModelNodePropertiesMSFT.p("nodeProperties", "")
}

val XrControllerModelNodeStateMSFT = struct(Module.OPENXR, "XrControllerModelNodeStateMSFT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrPosef("nodePose", "")
}

val XrControllerModelStateMSFT = struct(Module.OPENXR, "XrControllerModelStateMSFT") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    AutoSize("nodeStates", optional = true)..uint32_t("nodeCapacityInput", "")
    uint32_t("nodeCountOutput", "")
    nullable..XrControllerModelNodeStateMSFT.p("nodeStates", "")
}

val XrViewConfigurationViewFovEPIC = struct(Module.OPENXR, "XrViewConfigurationViewFovEPIC") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrFovf("recommendedFov", "")
    XrFovf("maxMutableFov", "")
}

val XrAndroidSurfaceSwapchainCreateInfoFB = struct(Module.OPENXR, "XrAndroidSurfaceSwapchainCreateInfoFB") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrAndroidSurfaceSwapchainFlagsFB("createFlags", "")
}

val XrInteractionProfileAnalogThresholdVALVE = struct(Module.OPENXR, "XrInteractionProfileAnalogThresholdVALVE") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrAction("action", "")
    XrPath("binding", "")
    float("onThreshold", "")
    float("offThreshold", "")
    nullable..XrHapticBaseHeader.const.p("onHaptic", "")
    nullable..XrHapticBaseHeader.const.p("offHaptic", "")
}

val XrLoaderInitInfoBaseHeaderKHR = struct(Module.OPENXR, "XrLoaderInitInfoBaseHeaderKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
}

val XrLoaderInitInfoAndroidKHR = struct(Module.OPENXR, "XrLoaderInitInfoAndroidKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    opaque_p("applicationVM", "")
    opaque_p("applicationContext", "")
}

val XrVulkanInstanceCreateInfoKHR = struct(Module.OPENXR, "XrVulkanInstanceCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSystemId("systemId", "")
    XrVulkanInstanceCreateFlagsKHR("createFlags", "")
    PFN_vkGetInstanceProcAddr("pfnGetInstanceProcAddr", "")
    VkInstanceCreateInfo.const.p("vulkanCreateInfo", "")
    nullable..VkAllocationCallbacks.const.p("vulkanAllocator", "")
}

val XrVulkanDeviceCreateInfoKHR = struct(Module.OPENXR, "XrVulkanDeviceCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSystemId("systemId", "")
    XrVulkanDeviceCreateFlagsKHR("createFlags", "")
    PFN_vkGetInstanceProcAddr("pfnGetInstanceProcAddr", "")
    VkPhysicalDevice("vulkanPhysicalDevice", "")
    VkDeviceCreateInfo.const.p("vulkanCreateInfo", "")
    nullable..VkAllocationCallbacks.const.p("vulkanAllocator", "")
}

val XrGraphicsBindingVulkan2KHR = struct(Module.OPENXR, "XrGraphicsBindingVulkan2KHR", alias = XrGraphicsBindingVulkanKHR) {
    javaImport("org.lwjgl.vulkan.*")
    documentation = "See ##XrGraphicsBindingVulkanKHR."

    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    VkInstance("instance", "")
    VkPhysicalDevice("physicalDevice", "")
    VkDevice("device", "")
    uint32_t("queueFamilyIndex", "")
    uint32_t("queueIndex", "")
}

val XrVulkanGraphicsDeviceGetInfoKHR = struct(Module.OPENXR, "XrVulkanGraphicsDeviceGetInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrSystemId("systemId", "")
    VkInstance("vulkanInstance", "")
}

val XrSwapchainImageVulkan2KHR = struct(Module.OPENXR, "XrSwapchainImageVulkan2KHR", alias = XrSwapchainImageVulkanKHR) {
    javaImport("org.lwjgl.vulkan.*")
    documentation = "See ##XrSwapchainImageVulkanKHR."

    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    VkImage("image", "")
}

val XrGraphicsRequirementsVulkan2KHR = struct(Module.OPENXR, "XrGraphicsRequirementsVulkan2KHR", alias = XrGraphicsRequirementsVulkanKHR) {
    documentation = "See ##XrGraphicsRequirementsVulkanKHR."

    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrVersion("minApiVersionSupported", "")
    XrVersion("maxApiVersionSupported", "")
}

val XrCompositionLayerEquirect2KHR = struct(Module.OPENXR, "XrCompositionLayerEquirect2KHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    XrCompositionLayerFlags("layerFlags", "")
    XrSpace("space", "")
    XrEyeVisibility("eyeVisibility", "")
    XrSwapchainSubImage("subImage", "")
    XrPosef("pose", "")
    float("radius", "")
    float("centralHorizontalAngle", "")
    float("upperVerticalAngle", "")
    float("lowerVerticalAngle", "")
}

val XrEventDataDisplayRefreshRateChangedFB = struct(Module.OPENXR, "XrEventDataDisplayRefreshRateChangedFB") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    float("fromDisplayRefreshRate", "")
    float("toDisplayRefreshRate", "")
}

val XrSystemColorSpacePropertiesFB = struct(Module.OPENXR, "XrSystemColorSpacePropertiesFB") {
    XrStructureType("type", "")
    nullable..opaque_p("next", "")
    XrColorSpaceFB("colorSpace", "")
}

val XrBindingModificationBaseHeaderKHR = struct(Module.OPENXR, "XrBindingModificationBaseHeaderKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
}

val XrBindingModificationsKHR = struct(Module.OPENXR, "XrBindingModificationsKHR") {
    XrStructureType("type", "")
    nullable..opaque_const_p("next", "")
    AutoSize("bindingModifications", optional = true)..uint32_t("bindingModificationCount", "")
    nullable..XrBindingModificationBaseHeaderKHR.const.p.const.p("bindingModifications", "")
}