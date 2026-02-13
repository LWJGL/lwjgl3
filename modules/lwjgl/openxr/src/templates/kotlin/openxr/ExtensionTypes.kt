/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr

import org.lwjgl.generator.*
import core.linux.*
import core.windows.*
import egl.*
import opengl.*
import vulkan.*

// Handle types
val XrDebugUtilsMessengerEXT = XR_DEFINE_HANDLE("XrDebugUtilsMessengerEXT")
val XrSpatialAnchorMSFT = XR_DEFINE_HANDLE("XrSpatialAnchorMSFT")
val XrSpatialGraphNodeBindingMSFT = XR_DEFINE_HANDLE("XrSpatialGraphNodeBindingMSFT")
val XrHandTrackerEXT = XR_DEFINE_HANDLE("XrHandTrackerEXT")
val XrBodyTrackerFB = XR_DEFINE_HANDLE("XrBodyTrackerFB")
val XrSceneObserverMSFT = XR_DEFINE_HANDLE("XrSceneObserverMSFT")
val XrSceneMSFT = XR_DEFINE_HANDLE("XrSceneMSFT")
val XrFacialTrackerHTC = XR_DEFINE_HANDLE("XrFacialTrackerHTC")
val XrFoveationProfileFB = XR_DEFINE_HANDLE("XrFoveationProfileFB")
val XrTriangleMeshFB = XR_DEFINE_HANDLE("XrTriangleMeshFB")
val XrPassthroughFB = XR_DEFINE_HANDLE("XrPassthroughFB")
val XrPassthroughLayerFB = XR_DEFINE_HANDLE("XrPassthroughLayerFB")
val XrGeometryInstanceFB = XR_DEFINE_HANDLE("XrGeometryInstanceFB")
val XrMarkerDetectorML = XR_DEFINE_HANDLE("XrMarkerDetectorML")
val XrExportedLocalizationMapML = XR_DEFINE_HANDLE("XrExportedLocalizationMapML")
val XrSpatialAnchorsStorageML = XR_DEFINE_HANDLE("XrSpatialAnchorsStorageML")
val XrSpatialAnchorStoreConnectionMSFT = XR_DEFINE_HANDLE("XrSpatialAnchorStoreConnectionMSFT")
val XrSpaceUserFB = XR_DEFINE_HANDLE("XrSpaceUserFB")
val XrFaceTrackerFB = XR_DEFINE_HANDLE("XrFaceTrackerFB")
val XrEyeTrackerFB = XR_DEFINE_HANDLE("XrEyeTrackerFB")
val XrVirtualKeyboardMETA = XR_DEFINE_HANDLE("XrVirtualKeyboardMETA")
val XrPassthroughColorLutMETA = XR_DEFINE_HANDLE("XrPassthroughColorLutMETA")
val XrFaceTracker2FB = XR_DEFINE_HANDLE("XrFaceTracker2FB")
val XrEnvironmentDepthProviderMETA = XR_DEFINE_HANDLE("XrEnvironmentDepthProviderMETA")
val XrEnvironmentDepthSwapchainMETA = XR_DEFINE_HANDLE("XrEnvironmentDepthSwapchainMETA")
val XrRenderModelEXT = XR_DEFINE_HANDLE("XrRenderModelEXT")
val XrRenderModelAssetEXT = XR_DEFINE_HANDLE("XrRenderModelAssetEXT")
val XrPassthroughHTC = XR_DEFINE_HANDLE("XrPassthroughHTC")
val XrBodyTrackerHTC = XR_DEFINE_HANDLE("XrBodyTrackerHTC")
val XrBodyTrackerBD = XR_DEFINE_HANDLE("XrBodyTrackerBD")
val XrFaceTrackerBD = XR_DEFINE_HANDLE("XrFaceTrackerBD")
val XrSenseDataProviderBD = XR_DEFINE_HANDLE("XrSenseDataProviderBD")
val XrSenseDataSnapshotBD = XR_DEFINE_HANDLE("XrSenseDataSnapshotBD")
val XrAnchorBD = XR_DEFINE_HANDLE("XrAnchorBD")
val XrPlaneDetectorEXT = XR_DEFINE_HANDLE("XrPlaneDetectorEXT")
val XrTrackableTrackerANDROID = XR_DEFINE_HANDLE("XrTrackableTrackerANDROID")
val XrDeviceAnchorPersistenceANDROID = XR_DEFINE_HANDLE("XrDeviceAnchorPersistenceANDROID")
val XrFaceTrackerANDROID = XR_DEFINE_HANDLE("XrFaceTrackerANDROID")
val XrWorldMeshDetectorML = XR_DEFINE_HANDLE("XrWorldMeshDetectorML")
val XrFacialExpressionClientML = XR_DEFINE_HANDLE("XrFacialExpressionClientML")
val XrTrackableImageDatabaseANDROID = XR_DEFINE_HANDLE("XrTrackableImageDatabaseANDROID")
val XrSpatialEntityEXT = XR_DEFINE_HANDLE("XrSpatialEntityEXT")
val XrSpatialContextEXT = XR_DEFINE_HANDLE("XrSpatialContextEXT")
val XrSpatialSnapshotEXT = XR_DEFINE_HANDLE("XrSpatialSnapshotEXT")
val XrSpatialPersistenceContextEXT = XR_DEFINE_HANDLE("XrSpatialPersistenceContextEXT")

// Enum types
val XrPerfSettingsDomainEXT = "XrPerfSettingsDomainEXT".enumType
val XrPerfSettingsSubDomainEXT = "XrPerfSettingsSubDomainEXT".enumType
val XrPerfSettingsLevelEXT = "XrPerfSettingsLevelEXT".enumType
val XrPerfSettingsNotificationLevelEXT = "XrPerfSettingsNotificationLevelEXT".enumType
val XrVisibilityMaskTypeKHR = "XrVisibilityMaskTypeKHR".enumType
val XrBlendFactorFB = "XrBlendFactorFB".enumType
val XrSpatialGraphNodeTypeMSFT = "XrSpatialGraphNodeTypeMSFT".enumType
val XrHandEXT = "XrHandEXT".enumType
val XrHandJointEXT = "XrHandJointEXT".enumType
val XrHandJointSetEXT = "XrHandJointSetEXT".enumType
val XrHandPoseTypeMSFT = "XrHandPoseTypeMSFT".enumType
val XrReprojectionModeMSFT = "XrReprojectionModeMSFT".enumType
val XrCompositionLayerSecureContentFlagBitsFB = "XrCompositionLayerSecureContentFlagBitsFB".enumType
val XrBodyJointFB = "XrBodyJointFB".enumType
val XrBodyJointSetFB = "XrBodyJointSetFB".enumType
val XrHandJointsMotionRangeEXT = "XrHandJointsMotionRangeEXT".enumType
val XrSceneComputeFeatureMSFT = "XrSceneComputeFeatureMSFT".enumType
val XrSceneComputeConsistencyMSFT = "XrSceneComputeConsistencyMSFT".enumType
val XrMeshComputeLodMSFT = "XrMeshComputeLodMSFT".enumType
val XrSceneComponentTypeMSFT = "XrSceneComponentTypeMSFT".enumType
val XrSceneObjectTypeMSFT = "XrSceneObjectTypeMSFT".enumType
val XrScenePlaneAlignmentTypeMSFT = "XrScenePlaneAlignmentTypeMSFT".enumType
val XrSceneComputeStateMSFT = "XrSceneComputeStateMSFT".enumType
val XrEyeExpressionHTC = "XrEyeExpressionHTC".enumType
val XrLipExpressionHTC = "XrLipExpressionHTC".enumType
val XrFacialTrackingTypeHTC = "XrFacialTrackingTypeHTC".enumType
val XrColorSpaceFB = "XrColorSpaceFB".enumType
val XrSpaceComponentTypeFB = "XrSpaceComponentTypeFB".enumType
val XrFoveationLevelFB = "XrFoveationLevelFB".enumType
val XrFoveationDynamicFB = "XrFoveationDynamicFB".enumType
val XrWindingOrderFB = "XrWindingOrderFB".enumType
val XrPassthroughLayerPurposeFB = "XrPassthroughLayerPurposeFB".enumType
val XrMarkerDetectorProfileML = "XrMarkerDetectorProfileML".enumType
val XrMarkerTypeML = "XrMarkerTypeML".enumType
val XrMarkerArucoDictML = "XrMarkerArucoDictML".enumType
val XrMarkerAprilTagDictML = "XrMarkerAprilTagDictML".enumType
val XrMarkerDetectorFpsML = "XrMarkerDetectorFpsML".enumType
val XrMarkerDetectorResolutionML = "XrMarkerDetectorResolutionML".enumType
val XrMarkerDetectorCameraML = "XrMarkerDetectorCameraML".enumType
val XrMarkerDetectorCornerRefineMethodML = "XrMarkerDetectorCornerRefineMethodML".enumType
val XrMarkerDetectorFullAnalysisIntervalML = "XrMarkerDetectorFullAnalysisIntervalML".enumType
val XrMarkerDetectorStatusML = "XrMarkerDetectorStatusML".enumType
val XrLocalizationMapStateML = "XrLocalizationMapStateML".enumType
val XrLocalizationMapTypeML = "XrLocalizationMapTypeML".enumType
val XrLocalizationMapConfidenceML = "XrLocalizationMapConfidenceML".enumType
val XrLocalizationMapErrorFlagBitsML = "XrLocalizationMapErrorFlagBitsML".enumType
val XrSpatialAnchorConfidenceML = "XrSpatialAnchorConfidenceML".enumType
val XrHeadsetFitStatusML = "XrHeadsetFitStatusML".enumType
val XrEyeCalibrationStatusML = "XrEyeCalibrationStatusML".enumType
val XrSceneMarkerTypeMSFT = "XrSceneMarkerTypeMSFT".enumType
val XrSceneMarkerQRCodeSymbolTypeMSFT = "XrSceneMarkerQRCodeSymbolTypeMSFT".enumType
val XrHandForearmJointULTRALEAP = "XrHandForearmJointULTRALEAP".enumType
val XrSpaceQueryActionFB = "XrSpaceQueryActionFB".enumType
val XrSpaceStorageLocationFB = "XrSpaceStorageLocationFB".enumType
val XrSpacePersistenceModeFB = "XrSpacePersistenceModeFB".enumType
val XrSemanticLabelsSupportFlagBitsFB = "XrSemanticLabelsSupportFlagBitsFB".enumType
val XrFoveationEyeTrackedProfileCreateFlagBitsMETA = "XrFoveationEyeTrackedProfileCreateFlagBitsMETA".enumType
val XrFoveationEyeTrackedStateFlagBitsMETA = "XrFoveationEyeTrackedStateFlagBitsMETA".enumType
val XrFaceExpressionFB = "XrFaceExpressionFB".enumType
val XrFaceExpressionSetFB = "XrFaceExpressionSetFB".enumType
val XrFaceConfidenceFB = "XrFaceConfidenceFB".enumType
val XrEyePositionFB = "XrEyePositionFB".enumType
val XrCompareOpFB = "XrCompareOpFB".enumType
val XrLocalDimmingModeMETA = "XrLocalDimmingModeMETA".enumType
val XrPassthroughPreferenceFlagBitsMETA = "XrPassthroughPreferenceFlagBitsMETA".enumType
val XrVirtualKeyboardLocationTypeMETA = "XrVirtualKeyboardLocationTypeMETA".enumType
val XrVirtualKeyboardInputSourceMETA = "XrVirtualKeyboardInputSourceMETA".enumType
val XrExternalCameraAttachedToDeviceOCULUS = "XrExternalCameraAttachedToDeviceOCULUS".enumType
val XrPerformanceMetricsCounterUnitMETA = "XrPerformanceMetricsCounterUnitMETA".enumType
val XrPassthroughColorLutChannelsMETA = "XrPassthroughColorLutChannelsMETA".enumType
val XrFullBodyJointMETA = "XrFullBodyJointMETA".enumType
val XrBodyTrackingCalibrationStateMETA = "XrBodyTrackingCalibrationStateMETA".enumType
val XrFaceExpression2FB = "XrFaceExpression2FB".enumType
val XrFaceExpressionSet2FB = "XrFaceExpressionSet2FB".enumType
val XrFaceTrackingDataSource2FB = "XrFaceTrackingDataSource2FB".enumType
val XrFaceConfidence2FB = "XrFaceConfidence2FB".enumType
val XrEnvironmentDepthProviderCreateFlagBitsMETA = "XrEnvironmentDepthProviderCreateFlagBitsMETA".enumType
val XrEnvironmentDepthSwapchainCreateFlagBitsMETA = "XrEnvironmentDepthSwapchainCreateFlagBitsMETA".enumType
val XrTrackingOptimizationSettingsDomainQCOM = "XrTrackingOptimizationSettingsDomainQCOM".enumType
val XrTrackingOptimizationSettingsHintQCOM = "XrTrackingOptimizationSettingsHintQCOM".enumType
val XrPassthroughFormHTC = "XrPassthroughFormHTC".enumType
val XrFoveationModeHTC = "XrFoveationModeHTC".enumType
val XrFoveationLevelHTC = "XrFoveationLevelHTC".enumType
val XrBodyJointHTC = "XrBodyJointHTC".enumType
val XrBodyJointSetHTC = "XrBodyJointSetHTC".enumType
val XrBodyJointConfidenceHTC = "XrBodyJointConfidenceHTC".enumType
val XrForceFeedbackCurlLocationMNDX = "XrForceFeedbackCurlLocationMNDX".enumType
val XrBodyJointBD = "XrBodyJointBD".enumType
val XrBodyJointSetBD = "XrBodyJointSetBD".enumType
val XrFacialSimulationModeBD = "XrFacialSimulationModeBD".enumType
val XrFaceExpressionBD = "XrFaceExpressionBD".enumType
val XrLipExpressionBD = "XrLipExpressionBD".enumType
val XrSpatialEntityComponentTypeBD = "XrSpatialEntityComponentTypeBD".enumType
val XrSemanticLabelBD = "XrSemanticLabelBD".enumType
val XrSenseDataProviderTypeBD = "XrSenseDataProviderTypeBD".enumType
val XrSenseDataProviderStateBD = "XrSenseDataProviderStateBD".enumType
val XrPersistenceLocationBD = "XrPersistenceLocationBD".enumType
val XrSpatialMeshLodBD = "XrSpatialMeshLodBD".enumType
val XrSpatialMeshConfigFlagBitsBD = "XrSpatialMeshConfigFlagBitsBD".enumType
val XrPlaneOrientationBD = "XrPlaneOrientationBD".enumType
val XrHandTrackingDataSourceEXT = "XrHandTrackingDataSourceEXT".enumType
val XrPlaneDetectorOrientationEXT = "XrPlaneDetectorOrientationEXT".enumType
val XrPlaneDetectorSemanticTypeEXT = "XrPlaneDetectorSemanticTypeEXT".enumType
val XrPlaneDetectionStateEXT = "XrPlaneDetectionStateEXT".enumType
val XrTrackingStateANDROID = "XrTrackingStateANDROID".enumType
val XrTrackableTypeANDROID = "XrTrackableTypeANDROID".enumType
val XrPlaneTypeANDROID = "XrPlaneTypeANDROID".enumType
val XrPlaneLabelANDROID = "XrPlaneLabelANDROID".enumType
val XrAnchorPersistStateANDROID = "XrAnchorPersistStateANDROID".enumType
val XrFaceParameterIndicesANDROID = "XrFaceParameterIndicesANDROID".enumType
val XrFaceTrackingStateANDROID = "XrFaceTrackingStateANDROID".enumType
val XrFaceConfidenceRegionsANDROID = "XrFaceConfidenceRegionsANDROID".enumType
val XrPassthroughCameraStateANDROID = "XrPassthroughCameraStateANDROID".enumType
val XrObjectLabelANDROID = "XrObjectLabelANDROID".enumType
val XrFutureStateEXT = "XrFutureStateEXT".enumType
val XrWorldMeshDetectorFlagBitsML = "XrWorldMeshDetectorFlagBitsML".enumType
val XrWorldMeshDetectorLodML = "XrWorldMeshDetectorLodML".enumType
val XrWorldMeshBlockStatusML = "XrWorldMeshBlockStatusML".enumType
val XrWorldMeshBlockResultML = "XrWorldMeshBlockResultML".enumType
val XrFacialBlendShapeML = "XrFacialBlendShapeML".enumType
val XrTrackableMarkerTrackingModeANDROID = "XrTrackableMarkerTrackingModeANDROID".enumType
val XrTrackableMarkerDictionaryANDROID = "XrTrackableMarkerDictionaryANDROID".enumType
val XrTrackableImageTrackingModeANDROID = "XrTrackableImageTrackingModeANDROID".enumType
val XrTrackableImageFormatANDROID = "XrTrackableImageFormatANDROID".enumType
val XrSpatialCapabilityEXT = "XrSpatialCapabilityEXT".enumType
val XrSpatialCapabilityFeatureEXT = "XrSpatialCapabilityFeatureEXT".enumType
val XrSpatialComponentTypeEXT = "XrSpatialComponentTypeEXT".enumType
val XrSpatialEntityTrackingStateEXT = "XrSpatialEntityTrackingStateEXT".enumType
val XrSpatialBufferTypeEXT = "XrSpatialBufferTypeEXT".enumType
val XrSpatialPlaneAlignmentEXT = "XrSpatialPlaneAlignmentEXT".enumType
val XrSpatialPlaneSemanticLabelEXT = "XrSpatialPlaneSemanticLabelEXT".enumType
val XrSpatialMarkerArucoDictEXT = "XrSpatialMarkerArucoDictEXT".enumType
val XrSpatialMarkerAprilTagDictEXT = "XrSpatialMarkerAprilTagDictEXT".enumType
val XrSpatialPersistenceScopeEXT = "XrSpatialPersistenceScopeEXT".enumType
val XrSpatialPersistenceContextResultEXT = "XrSpatialPersistenceContextResultEXT".enumType
val XrSpatialPersistenceStateEXT = "XrSpatialPersistenceStateEXT".enumType

// Bitmask types
val XrDebugUtilsMessageSeverityFlagsEXT = typedef(XrFlags64, "XrDebugUtilsMessageSeverityFlagsEXT")
val XrDebugUtilsMessageTypeFlagsEXT = typedef(XrFlags64, "XrDebugUtilsMessageTypeFlagsEXT")
val XrOverlaySessionCreateFlagsEXTX = typedef(XrFlags64, "XrOverlaySessionCreateFlagsEXTX")
val XrOverlayMainSessionFlagsEXTX = typedef(XrFlags64, "XrOverlayMainSessionFlagsEXTX")
val XrCompositionLayerImageLayoutFlagsFB = typedef(XrFlags64, "XrCompositionLayerImageLayoutFlagsFB")
val XrCompositionLayerSecureContentFlagsFB = typedef(XrFlags64, "XrCompositionLayerSecureContentFlagsFB")
val XrVulkanInstanceCreateFlagsKHR = typedef(XrFlags64, "XrVulkanInstanceCreateFlagsKHR")
val XrVulkanDeviceCreateFlagsKHR = typedef(XrFlags64, "XrVulkanDeviceCreateFlagsKHR")
val XrHandTrackingAimFlagsFB = typedef(XrFlags64, "XrHandTrackingAimFlagsFB")
val XrSwapchainCreateFoveationFlagsFB = typedef(XrFlags64, "XrSwapchainCreateFoveationFlagsFB")
val XrSwapchainStateFoveationFlagsFB = typedef(XrFlags64, "XrSwapchainStateFoveationFlagsFB")
val XrKeyboardTrackingFlagsFB = typedef(XrFlags64, "XrKeyboardTrackingFlagsFB")
val XrKeyboardTrackingQueryFlagsFB = typedef(XrFlags64, "XrKeyboardTrackingQueryFlagsFB")
val XrTriangleMeshFlagsFB = typedef(XrFlags64, "XrTriangleMeshFlagsFB")
val XrPassthroughCapabilityFlagsFB = typedef(XrFlags64, "XrPassthroughCapabilityFlagsFB")
val XrPassthroughFlagsFB = typedef(XrFlags64, "XrPassthroughFlagsFB")
val XrPassthroughStateChangedFlagsFB = typedef(XrFlags64, "XrPassthroughStateChangedFlagsFB")
val XrRenderModelFlagsFB = typedef(XrFlags64, "XrRenderModelFlagsFB")
val XrFrameEndInfoFlagsML = typedef(XrFlags64, "XrFrameEndInfoFlagsML")
val XrGlobalDimmerFrameEndInfoFlagsML = typedef(XrFlags64, "XrGlobalDimmerFrameEndInfoFlagsML")
val XrLocalizationMapErrorFlagsML = typedef(XrFlags64, "XrLocalizationMapErrorFlagsML")
val XrCompositionLayerSpaceWarpInfoFlagsFB = typedef(XrFlags64, "XrCompositionLayerSpaceWarpInfoFlagsFB")
val XrSemanticLabelsSupportFlagsFB = typedef(XrFlags64, "XrSemanticLabelsSupportFlagsFB")
val XrDigitalLensControlFlagsALMALENCE = typedef(XrFlags64, "XrDigitalLensControlFlagsALMALENCE")
val XrFoveationEyeTrackedProfileCreateFlagsMETA = typedef(XrFlags64, "XrFoveationEyeTrackedProfileCreateFlagsMETA")
val XrFoveationEyeTrackedStateFlagsMETA = typedef(XrFlags64, "XrFoveationEyeTrackedStateFlagsMETA")
val XrCompositionLayerSettingsFlagsFB = typedef(XrFlags64, "XrCompositionLayerSettingsFlagsFB")
val XrFrameSynthesisInfoFlagsEXT = typedef(XrFlags64, "XrFrameSynthesisInfoFlagsEXT")
val XrPassthroughPreferenceFlagsMETA = typedef(XrFlags64, "XrPassthroughPreferenceFlagsMETA")
val XrVirtualKeyboardInputStateFlagsMETA = typedef(XrFlags64, "XrVirtualKeyboardInputStateFlagsMETA")
val XrExternalCameraStatusFlagsOCULUS = typedef(XrFlags64, "XrExternalCameraStatusFlagsOCULUS")
val XrPerformanceMetricsCounterFlagsMETA = typedef(XrFlags64, "XrPerformanceMetricsCounterFlagsMETA")
val XrEnvironmentDepthProviderCreateFlagsMETA = typedef(XrFlags64, "XrEnvironmentDepthProviderCreateFlagsMETA")
val XrEnvironmentDepthSwapchainCreateFlagsMETA = typedef(XrFlags64, "XrEnvironmentDepthSwapchainCreateFlagsMETA")
val XrFoveationDynamicFlagsHTC = typedef(XrFlags64, "XrFoveationDynamicFlagsHTC")
val XrSpatialMeshConfigFlagsBD = typedef(XrFlags64, "XrSpatialMeshConfigFlagsBD")
val XrPlaneDetectionCapabilityFlagsEXT = typedef(XrFlags64, "XrPlaneDetectionCapabilityFlagsEXT")
val XrPlaneDetectorFlagsEXT = typedef(XrFlags64, "XrPlaneDetectorFlagsEXT")
val XrWorldMeshDetectorFlagsML = typedef(XrFlags64, "XrWorldMeshDetectorFlagsML")
val XrFacialExpressionBlendShapePropertiesFlagsML = typedef(XrFlags64, "XrFacialExpressionBlendShapePropertiesFlagsML")

// Function pointer types
val _XrDebugUtilsMessengerCallbackDataEXT = struct(Module.OPENXR, "XrDebugUtilsMessengerCallbackDataEXT")
val PFN_xrDebugUtilsMessengerCallbackEXT = Module.OPENXR.callback {
    XrBool32(
        "XrDebugUtilsMessengerCallbackEXT",

        XrDebugUtilsMessageSeverityFlagsEXT("messageSeverity"),
        XrDebugUtilsMessageTypeFlagsEXT("messageTypes"),
        _XrDebugUtilsMessengerCallbackDataEXT.const.p("callbackData"),
        opaque_p("userData"),

        nativeType = "PFN_xrDebugUtilsMessengerCallbackEXT"
    ) {}
}

// Struct types
val XrCompositionLayerCubeKHR = struct(Module.OPENXR, "XrCompositionLayerCubeKHR", parentStruct = XrCompositionLayerBaseHeader) {
    Expression("#TYPE_COMPOSITION_LAYER_CUBE_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrCompositionLayerFlags("layerFlags")
    XrSpace("space")
    XrEyeVisibility("eyeVisibility")
    XrSwapchain("swapchain")
    uint32_t("imageArrayIndex")
    XrQuaternionf("orientation")
}

val XrCompositionLayerDepthInfoKHR = struct(Module.OPENXR, "XrCompositionLayerDepthInfoKHR") {
    Expression("#TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSwapchainSubImage("subImage")
    float("minDepth")
    float("maxDepth")
    float("nearZ")
    float("farZ")
}

val XrVulkanSwapchainFormatListCreateInfoKHR = struct(Module.OPENXR, "XrVulkanSwapchainFormatListCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("viewFormats", optional = true)..uint32_t("viewFormatCount")
    VkFormat.const.p("viewFormats")
}

val XrEventDataPerfSettingsEXT = struct(Module.OPENXR, "XrEventDataPerfSettingsEXT", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_PERF_SETTINGS_EXT")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrPerfSettingsDomainEXT("domain")
    XrPerfSettingsSubDomainEXT("subDomain")
    XrPerfSettingsNotificationLevelEXT("fromLevel")
    XrPerfSettingsNotificationLevelEXT("toLevel")
}

val XrCompositionLayerCylinderKHR = struct(Module.OPENXR, "XrCompositionLayerCylinderKHR", parentStruct = XrCompositionLayerBaseHeader) {
    Expression("#TYPE_COMPOSITION_LAYER_CYLINDER_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrCompositionLayerFlags("layerFlags")
    XrSpace("space")
    XrEyeVisibility("eyeVisibility")
    XrSwapchainSubImage("subImage")
    XrPosef("pose")
    float("radius")
    float("centralAngle")
    float("aspectRatio")
}

val XrCompositionLayerEquirectKHR = struct(Module.OPENXR, "XrCompositionLayerEquirectKHR", parentStruct = XrCompositionLayerBaseHeader) {
    Expression("#TYPE_COMPOSITION_LAYER_EQUIRECT_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrCompositionLayerFlags("layerFlags")
    XrSpace("space")
    XrEyeVisibility("eyeVisibility")
    XrSwapchainSubImage("subImage")
    XrPosef("pose")
    float("radius")
    XrVector2f("scale")
    XrVector2f("bias")
}

val XrDebugUtilsObjectNameInfoEXT = struct(Module.OPENXR, "XrDebugUtilsObjectNameInfoEXT") {
    Expression("#TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrObjectType("objectType")
    uint64_t("objectHandle")
    nullable..charUTF8.const.p("objectName")
}

val XrDebugUtilsLabelEXT = struct(Module.OPENXR, "XrDebugUtilsLabelEXT") {
    Expression("#TYPE_DEBUG_UTILS_LABEL_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    charUTF8.const.p("labelName")
}

val XrDebugUtilsMessengerCallbackDataEXT = struct(Module.OPENXR, "XrDebugUtilsMessengerCallbackDataEXT") {
    Expression("#TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    nullable..charUTF8.const.p("messageId")
    nullable..charUTF8.const.p("functionName")
    charUTF8.const.p("message")
    AutoSize("objects", optional = true)..uint32_t("objectCount")
    nullable..XrDebugUtilsObjectNameInfoEXT.p("objects")
    AutoSize("sessionLabels", optional = true)..uint32_t("sessionLabelCount")
    nullable..XrDebugUtilsLabelEXT.p("sessionLabels")
}

val XrDebugUtilsMessengerCreateInfoEXT = struct(Module.OPENXR, "XrDebugUtilsMessengerCreateInfoEXT") {
    Expression("#TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrDebugUtilsMessageSeverityFlagsEXT("messageSeverities")
    XrDebugUtilsMessageTypeFlagsEXT("messageTypes")
    PFN_xrDebugUtilsMessengerCallbackEXT("userCallback")
    nullable..opaque_p("userData")
}

val XrGraphicsBindingOpenGLWin32KHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLWin32KHR") {
    javaImport("org.lwjgl.system.windows.*")
    Expression("#TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    HDC("hDC")
    HGLRC("hGLRC")
}

val XrGraphicsBindingOpenGLXlibKHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLXlibKHR") {
    javaImport("org.lwjgl.system.linux.*")
    javaImport("org.lwjgl.opengl.*")
    Expression("#TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    Display.p("xDisplay")
    uint32_t("visualid")
    GLXFBConfig("glxFBConfig")
    GLXDrawable("glxDrawable")
    GLXContext("glxContext")
}

val XrGraphicsBindingOpenGLXcbKHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLXcbKHR") {
    Expression("#TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    xcb_connection_t.p("connection")
    uint32_t("screenNumber")
    xcb_glx_fbconfig_t("fbconfigid")
    xcb_visualid_t("visualid")
    xcb_glx_drawable_t("glxDrawable")
    xcb_glx_context_t("glxContext")
}

val XrGraphicsBindingOpenGLWaylandKHR = struct(Module.OPENXR, "XrGraphicsBindingOpenGLWaylandKHR") {
    Expression("#TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    wl_display.p("display")
}

val XrSwapchainImageOpenGLKHR = struct(Module.OPENXR, "XrSwapchainImageOpenGLKHR", mutable = false, parentStruct = XrSwapchainImageBaseHeader) {
    Expression("#TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    uint32_t("image")
}

val XrGraphicsRequirementsOpenGLKHR = struct(Module.OPENXR, "XrGraphicsRequirementsOpenGLKHR") {
    Expression("#TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR")..XrStructureType("type")
    nullable..opaque_p("next")
    XrVersion("minApiVersionSupported")
    XrVersion("maxApiVersionSupported")
}

val XrGraphicsBindingVulkanKHR = struct(Module.OPENXR, "XrGraphicsBindingVulkanKHR") {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_GRAPHICS_BINDING_VULKAN_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    VkInstance("instance")
    VkPhysicalDevice("physicalDevice")
    VkDevice("device")
    uint32_t("queueFamilyIndex")
    uint32_t("queueIndex")
}

val XrSwapchainImageVulkanKHR = struct(Module.OPENXR, "XrSwapchainImageVulkanKHR", mutable = false, parentStruct = XrSwapchainImageBaseHeader) {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR")..XrStructureType("type").mutable()
    PointerSetter(
        "XrSwapchainImageFoveationVulkanFB",
        prepend = true
    )..nullable..opaque_p("next").mutable()
    VkImage("image")
}

val XrGraphicsRequirementsVulkanKHR = struct(Module.OPENXR, "XrGraphicsRequirementsVulkanKHR") {
    Expression("#TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR")..XrStructureType("type")
    nullable..opaque_p("next")
    XrVersion("minApiVersionSupported")
    XrVersion("maxApiVersionSupported")
}

val XrSystemEyeGazeInteractionPropertiesEXT = struct(Module.OPENXR, "XrSystemEyeGazeInteractionPropertiesEXT", mutable = false) {
    Expression("#TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsEyeGazeInteraction")
}

val XrEyeGazeSampleTimeEXT = struct(Module.OPENXR, "XrEyeGazeSampleTimeEXT") {
    Expression("#TYPE_EYE_GAZE_SAMPLE_TIME_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrTime("time")
}

val XrVisibilityMaskKHR = struct(Module.OPENXR, "XrVisibilityMaskKHR") {
    Expression("#TYPE_VISIBILITY_MASK_KHR")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput")
    uint32_t("vertexCountOutput")
    nullable..XrVector2f.p("vertices")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput")
    uint32_t("indexCountOutput")
    nullable..uint32_t.p("indices")
}

val XrEventDataVisibilityMaskChangedKHR = struct(Module.OPENXR, "XrEventDataVisibilityMaskChangedKHR", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrSession("session")
    XrViewConfigurationType("viewConfigurationType")
    uint32_t("viewIndex")
}

val XrSessionCreateInfoOverlayEXTX = struct(Module.OPENXR, "XrSessionCreateInfoOverlayEXTX") {
    Expression("#TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrOverlaySessionCreateFlagsEXTX("createFlags")
    uint32_t("sessionLayersPlacement")
}

val XrEventDataMainSessionVisibilityChangedEXTX = struct(Module.OPENXR, "XrEventDataMainSessionVisibilityChangedEXTX", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrBool32("visible")
    XrOverlayMainSessionFlagsEXTX("flags")
}

val XrCompositionLayerColorScaleBiasKHR = struct(Module.OPENXR, "XrCompositionLayerColorScaleBiasKHR") {
    Expression("#TYPE_COMPOSITION_LAYER_COLOR_SCALE_BIAS_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrColor4f("colorScale")
    XrColor4f("colorBias")
}

val XrSpatialAnchorCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialAnchorCreateInfoMSFT") {
    Expression("#TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("space")
    XrPosef("pose")
    XrTime("time")
}

val XrSpatialAnchorSpaceCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialAnchorSpaceCreateInfoMSFT") {
    Expression("#TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialAnchorMSFT("anchor")
    XrPosef("poseInAnchorSpace")
}

val XrCompositionLayerImageLayoutFB = struct(Module.OPENXR, "XrCompositionLayerImageLayoutFB") {
    Expression("#TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    XrCompositionLayerImageLayoutFlagsFB("flags")
}

val XrCompositionLayerAlphaBlendFB = struct(Module.OPENXR, "XrCompositionLayerAlphaBlendFB") {
    Expression("#TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    XrBlendFactorFB("srcFactorColor")
    XrBlendFactorFB("dstFactorColor")
    XrBlendFactorFB("srcFactorAlpha")
    XrBlendFactorFB("dstFactorAlpha")
}

val XrViewConfigurationDepthRangeEXT = struct(Module.OPENXR, "XrViewConfigurationDepthRangeEXT") {
    Expression("#TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    float("recommendedNearZ")
    float("minNearZ")
    float("recommendedFarZ")
    float("maxFarZ")
}

val XrGraphicsBindingEGLMNDX = struct(Module.OPENXR, "XrGraphicsBindingEGLMNDX") {
    javaImport("org.lwjgl.egl.*")
    Expression("#TYPE_GRAPHICS_BINDING_EGL_MNDX")..XrStructureType("type")
    nullable..opaque_const_p("next")
    PFN_xrEglGetProcAddressMNDX("getProcAddress")
    EGLDisplay("display")
    EGLConfig("config")
    EGLContext("context")
}

val XrSpatialGraphNodeSpaceCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialGraphNodeSpaceCreateInfoMSFT") {
    javaImport("static org.lwjgl.openxr.MSFTSpatialGraphBridge.*")
    Expression("#TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialGraphNodeTypeMSFT("nodeType")
    uint8_t("nodeId")["XR_GUID_SIZE_MSFT"]
    XrPosef("pose")
}

val XrSpatialGraphStaticNodeBindingCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialGraphStaticNodeBindingCreateInfoMSFT") {
    Expression("#TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("space")
    XrPosef("poseInSpace")
    XrTime("time")
}

val XrSpatialGraphNodeBindingPropertiesGetInfoMSFT = struct(Module.OPENXR, "XrSpatialGraphNodeBindingPropertiesGetInfoMSFT") {
    Expression("#TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSpatialGraphNodeBindingPropertiesMSFT = struct(Module.OPENXR, "XrSpatialGraphNodeBindingPropertiesMSFT") {
    javaImport("static org.lwjgl.openxr.MSFTSpatialGraphBridge.*")
    Expression("#TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    uint8_t("nodeId")["XR_GUID_SIZE_MSFT"]
    XrPosef("poseInNodeSpace")
}

val XrSystemHandTrackingPropertiesEXT = struct(Module.OPENXR, "XrSystemHandTrackingPropertiesEXT", mutable = false) {
    Expression("#TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsHandTracking")
}

val XrHandTrackerCreateInfoEXT = struct(Module.OPENXR, "XrHandTrackerCreateInfoEXT") {
    Expression("#TYPE_HAND_TRACKER_CREATE_INFO_EXT")..XrStructureType("type")
    PointerSetter(
        "XrHandPoseTypeInfoMSFT", "XrHandTrackingDataSourceInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrHandEXT("hand")
    XrHandJointSetEXT("handJointSet")
}

val XrHandJointsLocateInfoEXT = struct(Module.OPENXR, "XrHandJointsLocateInfoEXT") {
    Expression("#TYPE_HAND_JOINTS_LOCATE_INFO_EXT")..XrStructureType("type")
    PointerSetter(
        "XrHandJointsMotionRangeInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
}

val XrHandJointLocationEXT = struct(Module.OPENXR, "XrHandJointLocationEXT") {
    XrSpaceLocationFlags("locationFlags")
    XrPosef("pose")
    float("radius")
}

val XrHandJointVelocityEXT = struct(Module.OPENXR, "XrHandJointVelocityEXT", mutable = false) {
    XrSpaceVelocityFlags("velocityFlags")
    XrVector3f("linearVelocity")
    XrVector3f("angularVelocity")
}

val XrHandJointLocationsEXT = struct(Module.OPENXR, "XrHandJointLocationsEXT") {
    Expression("#TYPE_HAND_JOINT_LOCATIONS_EXT")..XrStructureType("type")
    PointerSetter(
        "XrHandJointVelocitiesEXT", "XrHandTrackingAimStateFB", "XrHandTrackingCapsulesStateFB", "XrHandTrackingDataSourceStateEXT", "XrHandTrackingScaleFB",
        prepend = true
    )..nullable..opaque_p("next")
    XrBool32("isActive")
    AutoSize("jointLocations")..uint32_t("jointCount")
    XrHandJointLocationEXT.p("jointLocations")
}

val XrHandJointVelocitiesEXT = struct(Module.OPENXR, "XrHandJointVelocitiesEXT") {
    Expression("#TYPE_HAND_JOINT_VELOCITIES_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("jointVelocities")..uint32_t("jointCount")
    XrHandJointVelocityEXT.p("jointVelocities")
}

val XrSystemHandTrackingMeshPropertiesMSFT = struct(Module.OPENXR, "XrSystemHandTrackingMeshPropertiesMSFT", mutable = false) {
    Expression("#TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsHandTrackingMesh")
    uint32_t("maxHandMeshIndexCount")
    uint32_t("maxHandMeshVertexCount")
}

val XrHandMeshSpaceCreateInfoMSFT = struct(Module.OPENXR, "XrHandMeshSpaceCreateInfoMSFT") {
    Expression("#TYPE_HAND_MESH_SPACE_CREATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrHandPoseTypeMSFT("handPoseType")
    XrPosef("poseInHandMeshSpace")
}

val XrHandMeshUpdateInfoMSFT = struct(Module.OPENXR, "XrHandMeshUpdateInfoMSFT") {
    Expression("#TYPE_HAND_MESH_UPDATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTime("time")
    XrHandPoseTypeMSFT("handPoseType")
}

val XrHandMeshIndexBufferMSFT = struct(Module.OPENXR, "XrHandMeshIndexBufferMSFT") {
    uint32_t("indexBufferKey")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput")
    uint32_t("indexCountOutput")
    nullable..uint32_t.p("indices")
}

val XrHandMeshVertexMSFT = struct(Module.OPENXR, "XrHandMeshVertexMSFT") {
    XrVector3f("position")
    XrVector3f("normal")
}

val XrHandMeshVertexBufferMSFT = struct(Module.OPENXR, "XrHandMeshVertexBufferMSFT") {
    XrTime("vertexUpdateTime")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput")
    uint32_t("vertexCountOutput")
    nullable..XrHandMeshVertexMSFT.p("vertices")
}

val XrHandMeshMSFT = struct(Module.OPENXR, "XrHandMeshMSFT") {
    Expression("#TYPE_HAND_MESH_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrBool32("isActive")
    XrBool32("indexBufferChanged")
    XrBool32("vertexBufferChanged")
    XrHandMeshIndexBufferMSFT("indexBuffer")
    XrHandMeshVertexBufferMSFT("vertexBuffer")
}

val XrHandPoseTypeInfoMSFT = struct(Module.OPENXR, "XrHandPoseTypeInfoMSFT") {
    Expression("#TYPE_HAND_POSE_TYPE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrHandPoseTypeMSFT("handPoseType")
}

val XrSecondaryViewConfigurationSessionBeginInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationSessionBeginInfoMSFT") {
    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("enabledViewConfigurationTypes")..uint32_t("viewConfigurationCount")
    XrViewConfigurationType.const.p("enabledViewConfigurationTypes")
}

val XrSecondaryViewConfigurationStateMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationStateMSFT") {
    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrViewConfigurationType("viewConfigurationType")
    XrBool32("active")
}

val XrSecondaryViewConfigurationFrameStateMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationFrameStateMSFT") {
    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("viewConfigurationStates")..uint32_t("viewConfigurationCount")
    XrSecondaryViewConfigurationStateMSFT.p("viewConfigurationStates")
}

val XrSecondaryViewConfigurationLayerInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationLayerInfoMSFT") {
    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrViewConfigurationType("viewConfigurationType")
    XrEnvironmentBlendMode("environmentBlendMode")
    AutoSize("layers")..uint32_t("layerCount")
    XrCompositionLayerBaseHeader.const.p.const.p("layers")
}

val XrSecondaryViewConfigurationFrameEndInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationFrameEndInfoMSFT") {
    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("viewConfigurationLayersInfo")..uint32_t("viewConfigurationCount")
    XrSecondaryViewConfigurationLayerInfoMSFT.const.p("viewConfigurationLayersInfo")
}

val XrSecondaryViewConfigurationSwapchainCreateInfoMSFT = struct(Module.OPENXR, "XrSecondaryViewConfigurationSwapchainCreateInfoMSFT") {
    Expression("#TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrViewConfigurationType("viewConfigurationType")
}

val XrControllerModelKeyStateMSFT = struct(Module.OPENXR, "XrControllerModelKeyStateMSFT") {
    Expression("#TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrControllerModelKeyMSFT("modelKey")
}

val XrControllerModelNodePropertiesMSFT = struct(Module.OPENXR, "XrControllerModelNodePropertiesMSFT") {
    javaImport("static org.lwjgl.openxr.MSFTControllerModel.*")
    Expression("#TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    charUTF8("parentNodeName")["XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT"]
    charUTF8("nodeName")["XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT"]
}

val XrControllerModelPropertiesMSFT = struct(Module.OPENXR, "XrControllerModelPropertiesMSFT") {
    Expression("#TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("nodeProperties", optional = true)..uint32_t("nodeCapacityInput")
    uint32_t("nodeCountOutput")
    nullable..XrControllerModelNodePropertiesMSFT.p("nodeProperties")
}

val XrControllerModelNodeStateMSFT = struct(Module.OPENXR, "XrControllerModelNodeStateMSFT") {
    Expression("#TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrPosef("nodePose")
}

val XrControllerModelStateMSFT = struct(Module.OPENXR, "XrControllerModelStateMSFT") {
    Expression("#TYPE_CONTROLLER_MODEL_STATE_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("nodeStates", optional = true)..uint32_t("nodeCapacityInput")
    uint32_t("nodeCountOutput")
    nullable..XrControllerModelNodeStateMSFT.p("nodeStates")
}

val XrViewConfigurationViewFovEPIC = struct(Module.OPENXR, "XrViewConfigurationViewFovEPIC") {
    Expression("#TYPE_VIEW_CONFIGURATION_VIEW_FOV_EPIC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFovf("recommendedFov")
    XrFovf("maxMutableFov")
}

val XrHolographicWindowAttachmentMSFT = struct(Module.OPENXR, "XrHolographicWindowAttachmentMSFT") {
    Expression("#TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    IUnknown.p("holographicSpace")
    IUnknown.p("coreWindow")
}

val XrCompositionLayerReprojectionInfoMSFT = struct(Module.OPENXR, "XrCompositionLayerReprojectionInfoMSFT") {
    Expression("#TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrReprojectionModeMSFT("reprojectionMode")
}

val XrCompositionLayerReprojectionPlaneOverrideMSFT = struct(Module.OPENXR, "XrCompositionLayerReprojectionPlaneOverrideMSFT") {
    Expression("#TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrVector3f("position")
    XrVector3f("normal")
    XrVector3f("velocity")
}

val XrSwapchainStateBaseHeaderFB = struct(Module.OPENXR, "XrSwapchainStateBaseHeaderFB") {
    XrStructureType("type")
    nullable..opaque_p("next")
}

val XrCompositionLayerSecureContentFB = struct(Module.OPENXR, "XrCompositionLayerSecureContentFB") {
    Expression("#TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrCompositionLayerSecureContentFlagsFB("flags")
}

val XrBodyJointLocationFB = struct(Module.OPENXR, "XrBodyJointLocationFB") {
    XrSpaceLocationFlags("locationFlags")
    XrPosef("pose")
}

val XrSystemBodyTrackingPropertiesFB = struct(Module.OPENXR, "XrSystemBodyTrackingPropertiesFB", mutable = false) {
    Expression("#TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsBodyTracking")
}

val XrBodyTrackerCreateInfoFB = struct(Module.OPENXR, "XrBodyTrackerCreateInfoFB") {
    Expression("#TYPE_BODY_TRACKER_CREATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBodyJointSetFB("bodyJointSet")
}

val XrBodySkeletonJointFB = struct(Module.OPENXR, "XrBodySkeletonJointFB") {
    int32_t("joint")
    int32_t("parentJoint")
    XrPosef("pose")
}

val XrBodySkeletonFB = struct(Module.OPENXR, "XrBodySkeletonFB") {
    Expression("#TYPE_BODY_SKELETON_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("joints")..uint32_t("jointCount")
    XrBodySkeletonJointFB.p("joints")
}

val XrBodyJointsLocateInfoFB = struct(Module.OPENXR, "XrBodyJointsLocateInfoFB") {
    Expression("#TYPE_BODY_JOINTS_LOCATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
}

val XrBodyJointLocationsFB = struct(Module.OPENXR, "XrBodyJointLocationsFB", mutable = false) {
    Expression("#TYPE_BODY_JOINT_LOCATIONS_FB")..XrStructureType("type").mutable()
    PointerSetter(
        "XrBodyTrackingCalibrationStatusMETA",
        prepend = true
    )..nullable..opaque_p("next").mutable()
    XrBool32("isActive")
    float("confidence")
    AutoSize("jointLocations")..uint32_t("jointCount")
    XrBodyJointLocationFB.p("jointLocations")
    uint32_t("skeletonChangedCount")
    XrTime("time")
}

val _XrBindingModificationBaseHeaderKHR = struct(Module.OPENXR, "XrBindingModificationBaseHeaderKHR")
val XrInteractionProfileDpadBindingEXT = struct(Module.OPENXR, "XrInteractionProfileDpadBindingEXT", parentStruct = _XrBindingModificationBaseHeaderKHR) {
    Expression("#TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPath("binding")
    XrActionSet("actionSet")
    float("forceThreshold")
    float("forceThresholdReleased")
    float("centerRegion")
    float("wedgeAngle")
    XrBool32("isSticky")
    nullable..XrHapticBaseHeader.const.p("onHaptic")
    nullable..XrHapticBaseHeader.const.p("offHaptic")
}

val XrInteractionProfileAnalogThresholdVALVE = struct(Module.OPENXR, "XrInteractionProfileAnalogThresholdVALVE", parentStruct = _XrBindingModificationBaseHeaderKHR) {
    Expression("#TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrAction("action")
    XrPath("binding")
    float("onThreshold")
    float("offThreshold")
    nullable..XrHapticBaseHeader.const.p("onHaptic")
    nullable..XrHapticBaseHeader.const.p("offHaptic")
}

val XrHandJointsMotionRangeInfoEXT = struct(Module.OPENXR, "XrHandJointsMotionRangeInfoEXT") {
    Expression("#TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrHandJointsMotionRangeEXT("handJointsMotionRange")
}

val XrLoaderInitInfoBaseHeaderKHR = struct(Module.OPENXR, "XrLoaderInitInfoBaseHeaderKHR") {
    XrStructureType("type")
    PointerSetter(
        "XrLoaderInitInfoPropertiesEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
}

val XrVulkanInstanceCreateInfoKHR = struct(Module.OPENXR, "XrVulkanInstanceCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSystemId("systemId")
    XrVulkanInstanceCreateFlagsKHR("createFlags")
    PFN_vkGetInstanceProcAddr("pfnGetInstanceProcAddr")
    VkInstanceCreateInfo.const.p("vulkanCreateInfo")
    nullable..VkAllocationCallbacks.const.p("vulkanAllocator")
}

val XrVulkanDeviceCreateInfoKHR = struct(Module.OPENXR, "XrVulkanDeviceCreateInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_VULKAN_DEVICE_CREATE_INFO_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSystemId("systemId")
    XrVulkanDeviceCreateFlagsKHR("createFlags")
    PFN_vkGetInstanceProcAddr("pfnGetInstanceProcAddr")
    VkPhysicalDevice("vulkanPhysicalDevice")
    VkDeviceCreateInfo.const.p("vulkanCreateInfo")
    nullable..VkAllocationCallbacks.const.p("vulkanAllocator")
}

val XrGraphicsBindingVulkan2KHR = struct(Module.OPENXR, "XrGraphicsBindingVulkan2KHR", alias = XrGraphicsBindingVulkanKHR) {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_GRAPHICS_BINDING_VULKAN_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    VkInstance("instance")
    VkPhysicalDevice("physicalDevice")
    VkDevice("device")
    uint32_t("queueFamilyIndex")
    uint32_t("queueIndex")
}

val XrVulkanGraphicsDeviceGetInfoKHR = struct(Module.OPENXR, "XrVulkanGraphicsDeviceGetInfoKHR") {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSystemId("systemId")
    VkInstance("vulkanInstance")
}

val XrSwapchainImageVulkan2KHR = struct(Module.OPENXR, "XrSwapchainImageVulkan2KHR", mutable = false, alias = XrSwapchainImageVulkanKHR, parentStruct = XrSwapchainImageBaseHeader) {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    VkImage("image")
}

val XrGraphicsRequirementsVulkan2KHR = struct(Module.OPENXR, "XrGraphicsRequirementsVulkan2KHR", alias = XrGraphicsRequirementsVulkanKHR) {
    Expression("#TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR")..XrStructureType("type")
    nullable..opaque_p("next")
    XrVersion("minApiVersionSupported")
    XrVersion("maxApiVersionSupported")
}

val XrCompositionLayerEquirect2KHR = struct(Module.OPENXR, "XrCompositionLayerEquirect2KHR", parentStruct = XrCompositionLayerBaseHeader) {
    Expression("#TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrCompositionLayerFlags("layerFlags")
    XrSpace("space")
    XrEyeVisibility("eyeVisibility")
    XrSwapchainSubImage("subImage")
    XrPosef("pose")
    float("radius")
    float("centralHorizontalAngle")
    float("upperVerticalAngle")
    float("lowerVerticalAngle")
}

val XrUuidMSFT = struct(Module.OPENXR, "XrUuidMSFT") {
    uint8_t("bytes")[16]
}

val XrSceneObserverCreateInfoMSFT = struct(Module.OPENXR, "XrSceneObserverCreateInfoMSFT") {
    Expression("#TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSceneCreateInfoMSFT = struct(Module.OPENXR, "XrSceneCreateInfoMSFT") {
    Expression("#TYPE_SCENE_CREATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSceneSphereBoundMSFT = struct(Module.OPENXR, "XrSceneSphereBoundMSFT") {
    XrVector3f("center")
    float("radius")
}

val XrSceneOrientedBoxBoundMSFT = struct(Module.OPENXR, "XrSceneOrientedBoxBoundMSFT") {
    XrPosef("pose")
    XrVector3f("extents")
}

val XrSceneFrustumBoundMSFT = struct(Module.OPENXR, "XrSceneFrustumBoundMSFT") {
    XrPosef("pose")
    XrFovf("fov")
    float("farDistance")
}

val XrSceneBoundsMSFT = struct(Module.OPENXR, "XrSceneBoundsMSFT") {
    XrSpace("space")
    XrTime("time")
    AutoSize("spheres", optional = true)..uint32_t("sphereCount")
    nullable..XrSceneSphereBoundMSFT.const.p("spheres")
    AutoSize("boxes", optional = true)..uint32_t("boxCount")
    nullable..XrSceneOrientedBoxBoundMSFT.const.p("boxes")
    AutoSize("frustums", optional = true)..uint32_t("frustumCount")
    nullable..XrSceneFrustumBoundMSFT.const.p("frustums")
}

val XrNewSceneComputeInfoMSFT = struct(Module.OPENXR, "XrNewSceneComputeInfoMSFT") {
    Expression("#TYPE_NEW_SCENE_COMPUTE_INFO_MSFT")..XrStructureType("type")
    PointerSetter(
        "XrVisualMeshComputeLodInfoMSFT",
        prepend = true
    )..nullable..opaque_const_p("next")
    AutoSize("requestedFeatures")..uint32_t("requestedFeatureCount")
    XrSceneComputeFeatureMSFT.const.p("requestedFeatures")
    XrSceneComputeConsistencyMSFT("consistency")
    XrSceneBoundsMSFT("bounds")
}

val XrVisualMeshComputeLodInfoMSFT = struct(Module.OPENXR, "XrVisualMeshComputeLodInfoMSFT") {
    Expression("#TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrMeshComputeLodMSFT("lod")
}

val XrSceneComponentMSFT = struct(Module.OPENXR, "XrSceneComponentMSFT") {
    XrSceneComponentTypeMSFT("componentType")
    XrUuidMSFT("id")
    XrUuidMSFT("parentId")
    XrTime("updateTime")
}

val XrSceneComponentsMSFT = struct(Module.OPENXR, "XrSceneComponentsMSFT") {
    Expression("#TYPE_SCENE_COMPONENTS_MSFT")..XrStructureType("type")
    PointerSetter(
        "XrSceneMarkerQRCodesMSFT", "XrSceneMarkersMSFT", "XrSceneMeshesMSFT", "XrSceneObjectsMSFT", "XrScenePlanesMSFT",
        prepend = true
    )..nullable..opaque_p("next")
    AutoSize("components", optional = true)..uint32_t("componentCapacityInput")
    uint32_t("componentCountOutput")
    nullable..XrSceneComponentMSFT.p("components")
}

val XrSceneComponentsGetInfoMSFT = struct(Module.OPENXR, "XrSceneComponentsGetInfoMSFT") {
    Expression("#TYPE_SCENE_COMPONENTS_GET_INFO_MSFT")..XrStructureType("type")
    PointerSetter(
        "XrSceneComponentParentFilterInfoMSFT", "XrSceneMarkerTypeFilterMSFT", "XrSceneObjectTypesFilterInfoMSFT", "XrScenePlaneAlignmentFilterInfoMSFT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrSceneComponentTypeMSFT("componentType")
}

val XrSceneComponentLocationMSFT = struct(Module.OPENXR, "XrSceneComponentLocationMSFT") {
    XrSpaceLocationFlags("flags")
    XrPosef("pose")
}

val XrSceneComponentLocationsMSFT = struct(Module.OPENXR, "XrSceneComponentLocationsMSFT") {
    Expression("#TYPE_SCENE_COMPONENT_LOCATIONS_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("locations", optional = true)..uint32_t("locationCount")
    nullable..XrSceneComponentLocationMSFT.p("locations")
}

val XrSceneComponentsLocateInfoMSFT = struct(Module.OPENXR, "XrSceneComponentsLocateInfoMSFT") {
    Expression("#TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
    AutoSize("componentIds", optional = true)..uint32_t("componentIdCount")
    nullable..XrUuidMSFT.const.p("componentIds")
}

val XrSceneObjectMSFT = struct(Module.OPENXR, "XrSceneObjectMSFT") {
    XrSceneObjectTypeMSFT("objectType")
}

val XrSceneObjectsMSFT = struct(Module.OPENXR, "XrSceneObjectsMSFT") {
    Expression("#TYPE_SCENE_OBJECTS_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("sceneObjects", optional = true)..uint32_t("sceneObjectCount")
    nullable..XrSceneObjectMSFT.p("sceneObjects")
}

val XrSceneComponentParentFilterInfoMSFT = struct(Module.OPENXR, "XrSceneComponentParentFilterInfoMSFT") {
    Expression("#TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrUuidMSFT("parentId")
}

val XrSceneObjectTypesFilterInfoMSFT = struct(Module.OPENXR, "XrSceneObjectTypesFilterInfoMSFT") {
    Expression("#TYPE_SCENE_OBJECT_TYPES_FILTER_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("objectTypes", optional = true)..uint32_t("objectTypeCount")
    nullable..XrSceneObjectTypeMSFT.const.p("objectTypes")
}

val XrScenePlaneMSFT = struct(Module.OPENXR, "XrScenePlaneMSFT") {
    XrScenePlaneAlignmentTypeMSFT("alignment")
    XrExtent2Df("size")
    uint64_t("meshBufferId")
    XrBool32("supportsIndicesUint16")
}

val XrScenePlanesMSFT = struct(Module.OPENXR, "XrScenePlanesMSFT") {
    Expression("#TYPE_SCENE_PLANES_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("scenePlanes", optional = true)..uint32_t("scenePlaneCount")
    nullable..XrScenePlaneMSFT.p("scenePlanes")
}

val XrScenePlaneAlignmentFilterInfoMSFT = struct(Module.OPENXR, "XrScenePlaneAlignmentFilterInfoMSFT") {
    Expression("#TYPE_SCENE_PLANE_ALIGNMENT_FILTER_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("alignments", optional = true)..uint32_t("alignmentCount")
    nullable..XrScenePlaneAlignmentTypeMSFT.const.p("alignments")
}

val XrSceneMeshMSFT = struct(Module.OPENXR, "XrSceneMeshMSFT") {
    uint64_t("meshBufferId")
    XrBool32("supportsIndicesUint16")
}

val XrSceneMeshesMSFT = struct(Module.OPENXR, "XrSceneMeshesMSFT") {
    Expression("#TYPE_SCENE_MESHES_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("sceneMeshes", optional = true)..uint32_t("sceneMeshCount")
    nullable..XrSceneMeshMSFT.p("sceneMeshes")
}

val XrSceneMeshBuffersGetInfoMSFT = struct(Module.OPENXR, "XrSceneMeshBuffersGetInfoMSFT") {
    Expression("#TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    uint64_t("meshBufferId")
}

val XrSceneMeshBuffersMSFT = struct(Module.OPENXR, "XrSceneMeshBuffersMSFT") {
    Expression("#TYPE_SCENE_MESH_BUFFERS_MSFT")..XrStructureType("type")
    PointerSetter(
        "XrSceneMeshIndicesUint16MSFT", "XrSceneMeshIndicesUint32MSFT", "XrSceneMeshVertexBufferMSFT",
        prepend = true
    )..nullable..opaque_p("next")
}

val XrSceneMeshVertexBufferMSFT = struct(Module.OPENXR, "XrSceneMeshVertexBufferMSFT") {
    Expression("#TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput")
    uint32_t("vertexCountOutput")
    nullable..XrVector3f.p("vertices")
}

val XrSceneMeshIndicesUint32MSFT = struct(Module.OPENXR, "XrSceneMeshIndicesUint32MSFT") {
    Expression("#TYPE_SCENE_MESH_INDICES_UINT32_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput")
    uint32_t("indexCountOutput")
    nullable..uint32_t.p("indices")
}

val XrSceneMeshIndicesUint16MSFT = struct(Module.OPENXR, "XrSceneMeshIndicesUint16MSFT") {
    Expression("#TYPE_SCENE_MESH_INDICES_UINT16_MSFT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput")
    uint32_t("indexCountOutput")
    nullable..uint16_t.p("indices")
}

val XrSerializedSceneFragmentDataGetInfoMSFT = struct(Module.OPENXR, "XrSerializedSceneFragmentDataGetInfoMSFT") {
    Expression("#TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrUuidMSFT("sceneFragmentId")
}

val XrDeserializeSceneFragmentMSFT = struct(Module.OPENXR, "XrDeserializeSceneFragmentMSFT") {
    AutoSize("buffer", optional = true)..uint32_t("bufferSize")
    nullable..uint8_t.const.p("buffer")
}

val XrSceneDeserializeInfoMSFT = struct(Module.OPENXR, "XrSceneDeserializeInfoMSFT") {
    Expression("#TYPE_SCENE_DESERIALIZE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("fragments", optional = true)..uint32_t("fragmentCount")
    nullable..XrDeserializeSceneFragmentMSFT.const.p("fragments")
}

val XrEventDataDisplayRefreshRateChangedFB = struct(Module.OPENXR, "XrEventDataDisplayRefreshRateChangedFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    float("fromDisplayRefreshRate")
    float("toDisplayRefreshRate")
}

val XrViveTrackerPathsHTCX = struct(Module.OPENXR, "XrViveTrackerPathsHTCX", mutable = false) {
    Expression("#TYPE_VIVE_TRACKER_PATHS_HTCX")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrPath("persistentPath")
    XrPath("rolePath")
}

val XrEventDataViveTrackerConnectedHTCX = struct(Module.OPENXR, "XrEventDataViveTrackerConnectedHTCX", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrViveTrackerPathsHTCX.p("paths")
}

val XrSystemFacialTrackingPropertiesHTC = struct(Module.OPENXR, "XrSystemFacialTrackingPropertiesHTC", mutable = false) {
    Expression("#TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportEyeFacialTracking")
    XrBool32("supportLipFacialTracking")
}

val XrFacialExpressionsHTC = struct(Module.OPENXR, "XrFacialExpressionsHTC") {
    Expression("#TYPE_FACIAL_EXPRESSIONS_HTC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBool32("isActive")
    XrTime("sampleTime")
    uint32_t("expressionCount")
    float.p("expressionWeightings")
}

val XrFacialTrackerCreateInfoHTC = struct(Module.OPENXR, "XrFacialTrackerCreateInfoHTC") {
    Expression("#TYPE_FACIAL_TRACKER_CREATE_INFO_HTC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFacialTrackingTypeHTC("facialTrackingType")
}

val XrSystemColorSpacePropertiesFB = struct(Module.OPENXR, "XrSystemColorSpacePropertiesFB", mutable = false) {
    Expression("#TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrColorSpaceFB("colorSpace")
}

val XrVector4sFB = struct(Module.OPENXR, "XrVector4sFB") {
    int16_t("x")
    int16_t("y")
    int16_t("z")
    int16_t("w")
}

val XrHandTrackingMeshFB = struct(Module.OPENXR, "XrHandTrackingMeshFB") {
    Expression("#TYPE_HAND_TRACKING_MESH_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("jointBindPoses", "jointRadii", "jointParents", optional = true)..uint32_t("jointCapacityInput")
    uint32_t("jointCountOutput")
    nullable..XrPosef.p("jointBindPoses")
    nullable..float.p("jointRadii")
    nullable..XrHandJointEXT.p("jointParents")
    AutoSize("vertexPositions", "vertexNormals", "vertexUVs", "vertexBlendIndices", "vertexBlendWeights", optional = true)..uint32_t("vertexCapacityInput")
    uint32_t("vertexCountOutput")
    nullable..XrVector3f.p("vertexPositions")
    nullable..XrVector3f.p("vertexNormals")
    nullable..XrVector2f.p("vertexUVs")
    nullable..XrVector4sFB.p("vertexBlendIndices")
    nullable..XrVector4f.p("vertexBlendWeights")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput")
    uint32_t("indexCountOutput")
    nullable..int16_t.p("indices")
}

val XrHandTrackingScaleFB = struct(Module.OPENXR, "XrHandTrackingScaleFB", mutable = false) {
    Expression("#TYPE_HAND_TRACKING_SCALE_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    float("sensorOutput")
    float("currentOutput")
    XrBool32("overrideHandScale")
    float("overrideValueInput")
}

val XrHandTrackingAimStateFB = struct(Module.OPENXR, "XrHandTrackingAimStateFB", mutable = false) {
    Expression("#TYPE_HAND_TRACKING_AIM_STATE_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrHandTrackingAimFlagsFB("status")
    XrPosef("aimPose")
    float("pinchStrengthIndex")
    float("pinchStrengthMiddle")
    float("pinchStrengthRing")
    float("pinchStrengthLittle")
}

val XrHandCapsuleFB = struct(Module.OPENXR, "XrHandCapsuleFB", mutable = false) {
    javaImport("static org.lwjgl.openxr.FBHandTrackingCapsules.*")
    XrVector3f("points")["XR_HAND_TRACKING_CAPSULE_POINT_COUNT_FB"]
    float("radius")
    XrHandJointEXT("joint")
}

val XrHandTrackingCapsulesStateFB = struct(Module.OPENXR, "XrHandTrackingCapsulesStateFB", mutable = false) {
    javaImport("static org.lwjgl.openxr.FBHandTrackingCapsules.*")
    Expression("#TYPE_HAND_TRACKING_CAPSULES_STATE_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrHandCapsuleFB("capsules")["XR_HAND_TRACKING_CAPSULE_COUNT_FB"]
}

val XrSystemSpatialEntityPropertiesFB = struct(Module.OPENXR, "XrSystemSpatialEntityPropertiesFB", mutable = false) {
    Expression("#TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrBool32("supportsSpatialEntity")
}

val XrSpatialAnchorCreateInfoFB = struct(Module.OPENXR, "XrSpatialAnchorCreateInfoFB") {
    Expression("#TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("space")
    XrPosef("poseInSpace")
    XrTime("time")
}

val XrSpaceComponentStatusSetInfoFB = struct(Module.OPENXR, "XrSpaceComponentStatusSetInfoFB") {
    Expression("#TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpaceComponentTypeFB("componentType")
    XrBool32("enabled")
    XrDuration("timeout")
}

val XrSpaceComponentStatusFB = struct(Module.OPENXR, "XrSpaceComponentStatusFB", mutable = false) {
    Expression("#TYPE_SPACE_COMPONENT_STATUS_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("enabled")
    XrBool32("changePending")
}

val XrUuidEXT = struct(Module.OPENXR, "XrUuidEXT", alias = XrUuid) {
    javaImport("static org.lwjgl.openxr.XR11.*")
    uint8_t("data")["XR_UUID_SIZE"]
}

val XrEventDataSpatialAnchorCreateCompleteFB = struct(Module.OPENXR, "XrEventDataSpatialAnchorCreateCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
    XrSpace("space")
    XrUuidEXT("uuid")
}

val XrEventDataSpaceSetStatusCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceSetStatusCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
    XrSpace("space")
    XrUuidEXT("uuid")
    XrSpaceComponentTypeFB("componentType")
    XrBool32("enabled")
}

val XrFoveationProfileCreateInfoFB = struct(Module.OPENXR, "XrFoveationProfileCreateInfoFB") {
    Expression("#TYPE_FOVEATION_PROFILE_CREATE_INFO_FB")..XrStructureType("type")
    PointerSetter(
        "XrFoveationLevelProfileCreateInfoFB",
        prepend = true
    )..nullable..opaque_p("next")
}

val XrSwapchainCreateInfoFoveationFB = struct(Module.OPENXR, "XrSwapchainCreateInfoFoveationFB") {
    Expression("#TYPE_SWAPCHAIN_CREATE_INFO_FOVEATION_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    XrSwapchainCreateFoveationFlagsFB("flags")
}

val XrSwapchainStateFoveationFB = struct(Module.OPENXR, "XrSwapchainStateFoveationFB", parentStruct = XrSwapchainStateBaseHeaderFB) {
    Expression("#TYPE_SWAPCHAIN_STATE_FOVEATION_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    XrSwapchainStateFoveationFlagsFB("flags")
    XrFoveationProfileFB("profile")
}

val XrFoveationLevelProfileCreateInfoFB = struct(Module.OPENXR, "XrFoveationLevelProfileCreateInfoFB") {
    Expression("#TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB")..XrStructureType("type")
    PointerSetter(
        "XrFoveationEyeTrackedProfileCreateInfoMETA",
        prepend = true
    )..nullable..opaque_p("next")
    XrFoveationLevelFB("level")
    float("verticalOffset")
    XrFoveationDynamicFB("dynamic")
}

val XrSystemKeyboardTrackingPropertiesFB = struct(Module.OPENXR, "XrSystemKeyboardTrackingPropertiesFB", mutable = false) {
    Expression("#TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsKeyboardTracking")
}

val XrKeyboardTrackingDescriptionFB = struct(Module.OPENXR, "XrKeyboardTrackingDescriptionFB", mutable = false) {
    javaImport("static org.lwjgl.openxr.FBKeyboardTracking.*")
    uint64_t("trackedKeyboardId")
    XrVector3f("size")
    XrKeyboardTrackingFlagsFB("flags")
    charUTF8("name")["XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB"]
}

val XrKeyboardSpaceCreateInfoFB = struct(Module.OPENXR, "XrKeyboardSpaceCreateInfoFB") {
    Expression("#TYPE_KEYBOARD_SPACE_CREATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    uint64_t("trackedKeyboardId")
}

val XrKeyboardTrackingQueryFB = struct(Module.OPENXR, "XrKeyboardTrackingQueryFB") {
    Expression("#TYPE_KEYBOARD_TRACKING_QUERY_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    XrKeyboardTrackingQueryFlagsFB("flags")
}

val XrTriangleMeshCreateInfoFB = struct(Module.OPENXR, "XrTriangleMeshCreateInfoFB") {
    Expression("#TYPE_TRIANGLE_MESH_CREATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTriangleMeshFlagsFB("flags")
    XrWindingOrderFB("windingOrder")
    uint32_t("vertexCount")
    nullable..XrVector3f.const.p("vertexBuffer")
    uint32_t("triangleCount")
    nullable..uint32_t.const.p("indexBuffer")
}

val XrSystemPassthroughPropertiesFB = struct(Module.OPENXR, "XrSystemPassthroughPropertiesFB", mutable = false) {
    Expression("#TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrBool32("supportsPassthrough")
}

val XrSystemPassthroughProperties2FB = struct(Module.OPENXR, "XrSystemPassthroughProperties2FB", mutable = false) {
    Expression("#TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrPassthroughCapabilityFlagsFB("capabilities")
}

val XrPassthroughCreateInfoFB = struct(Module.OPENXR, "XrPassthroughCreateInfoFB") {
    Expression("#TYPE_PASSTHROUGH_CREATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPassthroughFlagsFB("flags")
}

val XrPassthroughLayerCreateInfoFB = struct(Module.OPENXR, "XrPassthroughLayerCreateInfoFB") {
    Expression("#TYPE_PASSTHROUGH_LAYER_CREATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPassthroughFB("passthrough")
    XrPassthroughFlagsFB("flags")
    XrPassthroughLayerPurposeFB("purpose")
}

val XrCompositionLayerPassthroughFB = struct(Module.OPENXR, "XrCompositionLayerPassthroughFB", parentStruct = XrCompositionLayerBaseHeader) {
    Expression("#TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrCompositionLayerFlags("flags")
    nullable..XrSpace("space")
    XrPassthroughLayerFB("layerHandle")
}

val XrGeometryInstanceCreateInfoFB = struct(Module.OPENXR, "XrGeometryInstanceCreateInfoFB") {
    Expression("#TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPassthroughLayerFB("layer")
    XrTriangleMeshFB("mesh")
    XrSpace("baseSpace")
    XrPosef("pose")
    XrVector3f("scale")
}

val XrGeometryInstanceTransformFB = struct(Module.OPENXR, "XrGeometryInstanceTransformFB") {
    Expression("#TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
    XrPosef("pose")
    XrVector3f("scale")
}

val XrPassthroughStyleFB = struct(Module.OPENXR, "XrPassthroughStyleFB") {
    Expression("#TYPE_PASSTHROUGH_STYLE_FB")..XrStructureType("type")
    PointerSetter(
        "XrPassthroughBrightnessContrastSaturationFB", "XrPassthroughColorMapInterpolatedLutMETA", "XrPassthroughColorMapLutMETA", "XrPassthroughColorMapMonoToMonoFB", "XrPassthroughColorMapMonoToRgbaFB",
        prepend = true
    )..nullable..opaque_const_p("next")
    float("textureOpacityFactor")
    XrColor4f("edgeColor")
}

val XrPassthroughColorMapMonoToRgbaFB = struct(Module.OPENXR, "XrPassthroughColorMapMonoToRgbaFB") {
    javaImport("static org.lwjgl.openxr.FBPassthrough.*")
    Expression("#TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrColor4f("textureColorMap")["XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB"]
}

val XrPassthroughColorMapMonoToMonoFB = struct(Module.OPENXR, "XrPassthroughColorMapMonoToMonoFB") {
    javaImport("static org.lwjgl.openxr.FBPassthrough.*")
    Expression("#TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    uint8_t("textureColorMap")["XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB"]
}

val XrPassthroughBrightnessContrastSaturationFB = struct(Module.OPENXR, "XrPassthroughBrightnessContrastSaturationFB") {
    Expression("#TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    float("brightness")
    float("contrast")
    float("saturation")
}

val XrEventDataPassthroughStateChangedFB = struct(Module.OPENXR, "XrEventDataPassthroughStateChangedFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_PASSTHROUGH_STATE_CHANGED_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrPassthroughStateChangedFlagsFB("flags")
}

val XrRenderModelPathInfoFB = struct(Module.OPENXR, "XrRenderModelPathInfoFB") {
    Expression("#TYPE_RENDER_MODEL_PATH_INFO_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    XrPath("path")
}

val XrRenderModelPropertiesFB = struct(Module.OPENXR, "XrRenderModelPropertiesFB") {
    javaImport("static org.lwjgl.openxr.FBRenderModel.*")
    Expression("#TYPE_RENDER_MODEL_PROPERTIES_FB")..XrStructureType("type")
    PointerSetter(
        "XrRenderModelCapabilitiesRequestFB",
        prepend = true
    )..nullable..opaque_p("next")
    uint32_t("vendorId")
    charUTF8("modelName")["XR_MAX_RENDER_MODEL_NAME_SIZE_FB"]
    XrRenderModelKeyFB("modelKey")
    uint32_t("modelVersion")
    XrRenderModelFlagsFB("flags")
}

val XrRenderModelBufferFB = struct(Module.OPENXR, "XrRenderModelBufferFB") {
    Expression("#TYPE_RENDER_MODEL_BUFFER_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("buffer", optional = true)..uint32_t("bufferCapacityInput")
    uint32_t("bufferCountOutput")
    nullable..uint8_t.p("buffer")
}

val XrRenderModelLoadInfoFB = struct(Module.OPENXR, "XrRenderModelLoadInfoFB") {
    Expression("#TYPE_RENDER_MODEL_LOAD_INFO_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    XrRenderModelKeyFB("modelKey")
}

val XrSystemRenderModelPropertiesFB = struct(Module.OPENXR, "XrSystemRenderModelPropertiesFB", mutable = false) {
    Expression("#TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsRenderModelLoading")
}

val XrRenderModelCapabilitiesRequestFB = struct(Module.OPENXR, "XrRenderModelCapabilitiesRequestFB") {
    Expression("#TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    XrRenderModelFlagsFB("flags")
}

val XrBindingModificationBaseHeaderKHR = struct(Module.OPENXR, "XrBindingModificationBaseHeaderKHR") {
    XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrBindingModificationsKHR = struct(Module.OPENXR, "XrBindingModificationsKHR") {
    Expression("#TYPE_BINDING_MODIFICATIONS_KHR")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("bindingModifications", optional = true)..uint32_t("bindingModificationCount")
    nullable..XrBindingModificationBaseHeaderKHR.const.p.const.p("bindingModifications")
}

val XrViewLocateFoveatedRenderingVARJO = struct(Module.OPENXR, "XrViewLocateFoveatedRenderingVARJO") {
    Expression("#TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBool32("foveatedRenderingActive")
}

val XrFoveatedViewConfigurationViewVARJO = struct(Module.OPENXR, "XrFoveatedViewConfigurationViewVARJO") {
    Expression("#TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO")..XrStructureType("type")
    nullable..opaque_p("next")
    XrBool32("foveatedRenderingActive")
}

val XrSystemFoveatedRenderingPropertiesVARJO = struct(Module.OPENXR, "XrSystemFoveatedRenderingPropertiesVARJO", mutable = false) {
    Expression("#TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsFoveatedRendering")
}

val XrCompositionLayerDepthTestVARJO = struct(Module.OPENXR, "XrCompositionLayerDepthTestVARJO") {
    Expression("#TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    float("depthTestRangeNearZ")
    float("depthTestRangeFarZ")
}

val XrSystemMarkerTrackingPropertiesVARJO = struct(Module.OPENXR, "XrSystemMarkerTrackingPropertiesVARJO", mutable = false) {
    Expression("#TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsMarkerTracking")
}

val XrEventDataMarkerTrackingUpdateVARJO = struct(Module.OPENXR, "XrEventDataMarkerTrackingUpdateVARJO", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    uint64_t("markerId")
    XrBool32("isActive")
    XrBool32("isPredicted")
    XrTime("time")
}

val XrMarkerSpaceCreateInfoVARJO = struct(Module.OPENXR, "XrMarkerSpaceCreateInfoVARJO") {
    Expression("#TYPE_MARKER_SPACE_CREATE_INFO_VARJO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    uint64_t("markerId")
    XrPosef("poseInMarkerSpace")
}

val XrFrameEndInfoML = struct(Module.OPENXR, "XrFrameEndInfoML") {
    Expression("#TYPE_FRAME_END_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    float("focusDistance")
    XrFrameEndInfoFlagsML("flags")
}

val XrGlobalDimmerFrameEndInfoML = struct(Module.OPENXR, "XrGlobalDimmerFrameEndInfoML") {
    Expression("#TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    float("dimmerValue")
    XrGlobalDimmerFrameEndInfoFlagsML("flags")
}

val XrCoordinateSpaceCreateInfoML = struct(Module.OPENXR, "XrCoordinateSpaceCreateInfoML") {
    Expression("#TYPE_COORDINATE_SPACE_CREATE_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    MLCoordinateFrameUID("cfuid")
    XrPosef("poseInCoordinateSpace")
}

val XrSystemMarkerUnderstandingPropertiesML = struct(Module.OPENXR, "XrSystemMarkerUnderstandingPropertiesML", mutable = false) {
    Expression("#TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsMarkerUnderstanding")
}

val XrMarkerDetectorCreateInfoML = struct(Module.OPENXR, "XrMarkerDetectorCreateInfoML") {
    Expression("#TYPE_MARKER_DETECTOR_CREATE_INFO_ML")..XrStructureType("type")
    PointerSetter(
        "XrMarkerDetectorAprilTagInfoML", "XrMarkerDetectorArucoInfoML", "XrMarkerDetectorCustomProfileInfoML", "XrMarkerDetectorSizeInfoML",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrMarkerDetectorProfileML("profile")
    XrMarkerTypeML("markerType")
}

val XrMarkerDetectorArucoInfoML = struct(Module.OPENXR, "XrMarkerDetectorArucoInfoML") {
    Expression("#TYPE_MARKER_DETECTOR_ARUCO_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrMarkerArucoDictML("arucoDict")
}

val XrMarkerDetectorSizeInfoML = struct(Module.OPENXR, "XrMarkerDetectorSizeInfoML") {
    Expression("#TYPE_MARKER_DETECTOR_SIZE_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    float("markerLength")
}

val XrMarkerDetectorAprilTagInfoML = struct(Module.OPENXR, "XrMarkerDetectorAprilTagInfoML") {
    Expression("#TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrMarkerAprilTagDictML("aprilTagDict")
}

val XrMarkerDetectorCustomProfileInfoML = struct(Module.OPENXR, "XrMarkerDetectorCustomProfileInfoML") {
    Expression("#TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrMarkerDetectorFpsML("fpsHint")
    XrMarkerDetectorResolutionML("resolutionHint")
    XrMarkerDetectorCameraML("cameraHint")
    XrMarkerDetectorCornerRefineMethodML("cornerRefineMethod")
    XrBool32("useEdgeRefinement")
    XrMarkerDetectorFullAnalysisIntervalML("fullAnalysisIntervalHint")
}

val XrMarkerDetectorSnapshotInfoML = struct(Module.OPENXR, "XrMarkerDetectorSnapshotInfoML") {
    Expression("#TYPE_MARKER_DETECTOR_SNAPSHOT_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrMarkerDetectorStateML = struct(Module.OPENXR, "XrMarkerDetectorStateML", mutable = false) {
    Expression("#TYPE_MARKER_DETECTOR_STATE_ML")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrMarkerDetectorStatusML("state")
}

val XrMarkerSpaceCreateInfoML = struct(Module.OPENXR, "XrMarkerSpaceCreateInfoML") {
    Expression("#TYPE_MARKER_SPACE_CREATE_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrMarkerDetectorML("markerDetector")
    XrMarkerML("marker")
    XrPosef("poseInMarkerSpace")
}

val XrLocalizationMapML = struct(Module.OPENXR, "XrLocalizationMapML") {
    javaImport("static org.lwjgl.openxr.MLLocalizationMap.*")
    Expression("#TYPE_LOCALIZATION_MAP_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    charUTF8("name")["XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML"]
    XrUuidEXT("mapUuid")
    XrLocalizationMapTypeML("mapType")
}

val XrEventDataLocalizationChangedML = struct(Module.OPENXR, "XrEventDataLocalizationChangedML", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrSession("session")
    XrLocalizationMapStateML("state")
    XrLocalizationMapML("map")
    XrLocalizationMapConfidenceML("confidence")
    XrLocalizationMapErrorFlagsML("errorFlags")
}

val XrLocalizationMapQueryInfoBaseHeaderML = struct(Module.OPENXR, "XrLocalizationMapQueryInfoBaseHeaderML") {
    XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrMapLocalizationRequestInfoML = struct(Module.OPENXR, "XrMapLocalizationRequestInfoML") {
    Expression("#TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrUuidEXT("mapUuid")
}

val XrLocalizationMapImportInfoML = struct(Module.OPENXR, "XrLocalizationMapImportInfoML") {
    Expression("#TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("data")..uint32_t("size")
    char.p("data")
}

val XrLocalizationEnableEventsInfoML = struct(Module.OPENXR, "XrLocalizationEnableEventsInfoML") {
    Expression("#TYPE_LOCALIZATION_ENABLE_EVENTS_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBool32("enabled")
}

val XrSpatialAnchorsCreateInfoBaseHeaderML = struct(Module.OPENXR, "XrSpatialAnchorsCreateInfoBaseHeaderML") {
    XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSpatialAnchorsCreateInfoFromPoseML = struct(Module.OPENXR, "XrSpatialAnchorsCreateInfoFromPoseML", parentStruct = XrSpatialAnchorsCreateInfoBaseHeaderML) {
    Expression("#TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrPosef("poseInBaseSpace")
    XrTime("time")
}

val _XrFutureCompletionBaseHeaderEXT = struct(Module.OPENXR, "XrFutureCompletionBaseHeaderEXT")
val XrCreateSpatialAnchorsCompletionML = struct(Module.OPENXR, "XrCreateSpatialAnchorsCompletionML", parentStruct = _XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    AutoSize("spaces", optional = true)..uint32_t("spaceCount")
    nullable..XrSpace.p("spaces")
}

val XrSpatialAnchorStateML = struct(Module.OPENXR, "XrSpatialAnchorStateML") {
    Expression("#TYPE_SPATIAL_ANCHOR_STATE_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    XrSpatialAnchorConfidenceML("confidence")
}

val XrSpatialAnchorsCreateStorageInfoML = struct(Module.OPENXR, "XrSpatialAnchorsCreateStorageInfoML") {
    Expression("#TYPE_SPATIAL_ANCHORS_CREATE_STORAGE_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSpatialAnchorsQueryInfoBaseHeaderML = struct(Module.OPENXR, "XrSpatialAnchorsQueryInfoBaseHeaderML") {
    XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSpatialAnchorsQueryInfoRadiusML = struct(Module.OPENXR, "XrSpatialAnchorsQueryInfoRadiusML", parentStruct = XrSpatialAnchorsQueryInfoBaseHeaderML) {
    Expression("#TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrVector3f("center")
    XrTime("time")
    float("radius")
}

val XrSpatialAnchorsQueryCompletionML = struct(Module.OPENXR, "XrSpatialAnchorsQueryCompletionML", parentStruct = _XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    AutoSize("uuids", optional = true)..uint32_t("uuidCapacityInput")
    uint32_t("uuidCountOutput")
    nullable..XrUuidEXT.p("uuids")
}

val XrSpatialAnchorsCreateInfoFromUuidsML = struct(Module.OPENXR, "XrSpatialAnchorsCreateInfoFromUuidsML", parentStruct = XrSpatialAnchorsCreateInfoBaseHeaderML) {
    Expression("#TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialAnchorsStorageML("storage")
    AutoSize("uuids")..uint32_t("uuidCount")
    XrUuidEXT.const.p("uuids")
}

val XrSpatialAnchorsPublishInfoML = struct(Module.OPENXR, "XrSpatialAnchorsPublishInfoML") {
    Expression("#TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("anchors")..uint32_t("anchorCount")
    XrSpace.const.p("anchors")
    uint64_t("expiration")
}

val XrSpatialAnchorsPublishCompletionML = struct(Module.OPENXR, "XrSpatialAnchorsPublishCompletionML", parentStruct = _XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML")..XrStructureType("type")
    PointerSetter(
        "XrSpatialAnchorsPublishCompletionDetailsML",
        prepend = true
    )..nullable..opaque_p("next")
    XrResult("futureResult")
    AutoSize("uuids")..uint32_t("uuidCount")
    XrUuidEXT.p("uuids")
}

val XrSpatialAnchorsDeleteInfoML = struct(Module.OPENXR, "XrSpatialAnchorsDeleteInfoML") {
    Expression("#TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("uuids")..uint32_t("uuidCount")
    XrUuidEXT.const.p("uuids")
}

val XrSpatialAnchorsDeleteCompletionML = struct(Module.OPENXR, "XrSpatialAnchorsDeleteCompletionML", parentStruct = _XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_ML")..XrStructureType("type")
    PointerSetter(
        "XrSpatialAnchorsDeleteCompletionDetailsML",
        prepend = true
    )..nullable..opaque_p("next")
    XrResult("futureResult")
}

val XrSpatialAnchorsUpdateExpirationInfoML = struct(Module.OPENXR, "XrSpatialAnchorsUpdateExpirationInfoML") {
    Expression("#TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("uuids")..uint32_t("uuidCount")
    XrUuidEXT.const.p("uuids")
    uint64_t("expiration")
}

val XrSpatialAnchorsUpdateExpirationCompletionML = struct(Module.OPENXR, "XrSpatialAnchorsUpdateExpirationCompletionML", parentStruct = _XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML")..XrStructureType("type")
    PointerSetter(
        "XrSpatialAnchorsUpdateExpirationCompletionDetailsML",
        prepend = true
    )..nullable..opaque_p("next")
    XrResult("futureResult")
}

val XrSpatialAnchorCompletionResultML = struct(Module.OPENXR, "XrSpatialAnchorCompletionResultML") {
    XrUuidEXT("uuid")
    XrResult("result")
}

val XrSpatialAnchorsPublishCompletionDetailsML = struct(Module.OPENXR, "XrSpatialAnchorsPublishCompletionDetailsML") {
    Expression("#TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("results")..uint32_t("resultCount")
    XrSpatialAnchorCompletionResultML.p("results")
}

val XrSpatialAnchorsDeleteCompletionDetailsML = struct(Module.OPENXR, "XrSpatialAnchorsDeleteCompletionDetailsML") {
    Expression("#TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("results")..uint32_t("resultCount")
    XrSpatialAnchorCompletionResultML.p("results")
}

val XrSpatialAnchorsUpdateExpirationCompletionDetailsML = struct(Module.OPENXR, "XrSpatialAnchorsUpdateExpirationCompletionDetailsML") {
    Expression("#TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("results")..uint32_t("resultCount")
    XrSpatialAnchorCompletionResultML.p("results")
}

val XrEventDataHeadsetFitChangedML = struct(Module.OPENXR, "XrEventDataHeadsetFitChangedML", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrHeadsetFitStatusML("status")
    XrTime("time")
}

val XrEventDataEyeCalibrationChangedML = struct(Module.OPENXR, "XrEventDataEyeCalibrationChangedML", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrEyeCalibrationStatusML("status")
}

val XrUserCalibrationEnableEventsInfoML = struct(Module.OPENXR, "XrUserCalibrationEnableEventsInfoML") {
    Expression("#TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBool32("enabled")
}

val XrSpatialAnchorPersistenceNameMSFT = struct(Module.OPENXR, "XrSpatialAnchorPersistenceNameMSFT") {
    javaImport("static org.lwjgl.openxr.MSFTSpatialAnchorPersistence.*")
    charUTF8("name")["XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT"]
}

val XrSpatialAnchorPersistenceInfoMSFT = struct(Module.OPENXR, "XrSpatialAnchorPersistenceInfoMSFT") {
    Expression("#TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialAnchorPersistenceNameMSFT("spatialAnchorPersistenceName")
    XrSpatialAnchorMSFT("spatialAnchor")
}

val XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT = struct(Module.OPENXR, "XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT") {
    Expression("#TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore")
    XrSpatialAnchorPersistenceNameMSFT("spatialAnchorPersistenceName")
}

val XrSceneMarkerMSFT = struct(Module.OPENXR, "XrSceneMarkerMSFT", mutable = false) {
    XrSceneMarkerTypeMSFT("markerType")
    XrTime("lastSeenTime")
    XrOffset2Df("center")
    XrExtent2Df("size")
}

val XrSceneMarkersMSFT = struct(Module.OPENXR, "XrSceneMarkersMSFT") {
    Expression("#TYPE_SCENE_MARKERS_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("sceneMarkers", optional = true)..uint32_t("sceneMarkerCapacityInput")
    nullable..XrSceneMarkerMSFT.p("sceneMarkers")
}

val XrSceneMarkerTypeFilterMSFT = struct(Module.OPENXR, "XrSceneMarkerTypeFilterMSFT") {
    Expression("#TYPE_SCENE_MARKER_TYPE_FILTER_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("markerTypes", optional = true)..uint32_t("markerTypeCount")
    nullable..XrSceneMarkerTypeMSFT.p("markerTypes")
}

val XrSceneMarkerQRCodeMSFT = struct(Module.OPENXR, "XrSceneMarkerQRCodeMSFT", mutable = false) {
    XrSceneMarkerQRCodeSymbolTypeMSFT("symbolType")
    uint8_t("version")
}

val XrSceneMarkerQRCodesMSFT = struct(Module.OPENXR, "XrSceneMarkerQRCodesMSFT") {
    Expression("#TYPE_SCENE_MARKER_QR_CODES_MSFT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("qrCodes", optional = true)..uint32_t("qrCodeCapacityInput")
    nullable..XrSceneMarkerQRCodeMSFT.p("qrCodes")
}

val XrSpaceQueryInfoBaseHeaderFB = struct(Module.OPENXR, "XrSpaceQueryInfoBaseHeaderFB") {
    XrStructureType("type")
    PointerSetter(
        "XrSpaceGroupUuidFilterInfoMETA",
        prepend = true
    )..nullable..opaque_const_p("next")
}

val XrSpaceFilterInfoBaseHeaderFB = struct(Module.OPENXR, "XrSpaceFilterInfoBaseHeaderFB") {
    XrStructureType("type")
    PointerSetter(
        "XrSpaceStorageLocationFilterInfoFB",
        prepend = true
    )..nullable..opaque_const_p("next")
}

val XrSpaceQueryInfoFB = struct(Module.OPENXR, "XrSpaceQueryInfoFB", parentStruct = XrSpaceQueryInfoBaseHeaderFB) {
    Expression("#TYPE_SPACE_QUERY_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpaceQueryActionFB("queryAction")
    uint32_t("maxResultCount")
    XrDuration("timeout")
    nullable..XrSpaceFilterInfoBaseHeaderFB.const.p("filter")
    nullable..XrSpaceFilterInfoBaseHeaderFB.const.p("excludeFilter")
}

val XrSpaceStorageLocationFilterInfoFB = struct(Module.OPENXR, "XrSpaceStorageLocationFilterInfoFB") {
    Expression("#TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpaceStorageLocationFB("location")
}

val XrSpaceUuidFilterInfoFB = struct(Module.OPENXR, "XrSpaceUuidFilterInfoFB", parentStruct = XrSpaceFilterInfoBaseHeaderFB) {
    Expression("#TYPE_SPACE_UUID_FILTER_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("uuids")..uint32_t("uuidCount")
    XrUuidEXT.p("uuids")
}

val XrSpaceComponentFilterInfoFB = struct(Module.OPENXR, "XrSpaceComponentFilterInfoFB", parentStruct = XrSpaceFilterInfoBaseHeaderFB) {
    Expression("#TYPE_SPACE_COMPONENT_FILTER_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpaceComponentTypeFB("componentType")
}

val XrSpaceQueryResultFB = struct(Module.OPENXR, "XrSpaceQueryResultFB", mutable = false) {
    XrSpace("space")
    XrUuidEXT("uuid")
}

val XrSpaceQueryResultsFB = struct(Module.OPENXR, "XrSpaceQueryResultsFB") {
    Expression("#TYPE_SPACE_QUERY_RESULTS_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("results", optional = true)..uint32_t("resultCapacityInput")
    uint32_t("resultCountOutput")
    nullable..XrSpaceQueryResultFB.p("results")
}

val XrEventDataSpaceQueryResultsAvailableFB = struct(Module.OPENXR, "XrEventDataSpaceQueryResultsAvailableFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
}

val XrEventDataSpaceQueryCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceQueryCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
}

val XrSpaceSaveInfoFB = struct(Module.OPENXR, "XrSpaceSaveInfoFB") {
    Expression("#TYPE_SPACE_SAVE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("space")
    XrSpaceStorageLocationFB("location")
    XrSpacePersistenceModeFB("persistenceMode")
}

val XrSpaceEraseInfoFB = struct(Module.OPENXR, "XrSpaceEraseInfoFB") {
    Expression("#TYPE_SPACE_ERASE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("space")
    XrSpaceStorageLocationFB("location")
}

val XrEventDataSpaceSaveCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceSaveCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
    XrSpace("space")
    XrUuidEXT("uuid")
    XrSpaceStorageLocationFB("location")
}

val XrEventDataSpaceEraseCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceEraseCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
    XrSpace("space")
    XrUuidEXT("uuid")
    XrSpaceStorageLocationFB("location")
}

val XrSwapchainImageFoveationVulkanFB = struct(Module.OPENXR, "XrSwapchainImageFoveationVulkanFB", mutable = false) {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    VkImage("image")
    uint32_t("width")
    uint32_t("height")
}

val XrSwapchainStateSamplerOpenGLESFB = struct(Module.OPENXR, "XrSwapchainStateSamplerOpenGLESFB", parentStruct = XrSwapchainStateBaseHeaderFB) {
    javaImport("org.lwjgl.egl.*")
    Expression("#TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    EGLenum("minFilter")
    EGLenum("magFilter")
    EGLenum("wrapModeS")
    EGLenum("wrapModeT")
    EGLenum("swizzleRed")
    EGLenum("swizzleGreen")
    EGLenum("swizzleBlue")
    EGLenum("swizzleAlpha")
    float("maxAnisotropy")
    XrColor4f("borderColor")
}

val XrSwapchainStateSamplerVulkanFB = struct(Module.OPENXR, "XrSwapchainStateSamplerVulkanFB", parentStruct = XrSwapchainStateBaseHeaderFB) {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    VkFilter("minFilter")
    VkFilter("magFilter")
    VkSamplerMipmapMode("mipmapMode")
    VkSamplerAddressMode("wrapModeS")
    VkSamplerAddressMode("wrapModeT")
    VkComponentSwizzle("swizzleRed")
    VkComponentSwizzle("swizzleGreen")
    VkComponentSwizzle("swizzleBlue")
    VkComponentSwizzle("swizzleAlpha")
    float("maxAnisotropy")
    XrColor4f("borderColor")
}

val XrSpaceShareInfoFB = struct(Module.OPENXR, "XrSpaceShareInfoFB") {
    Expression("#TYPE_SPACE_SHARE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("spaces")..uint32_t("spaceCount")
    XrSpace.p("spaces")
    AutoSize("users")..uint32_t("userCount")
    XrSpaceUserFB.p("users")
}

val XrEventDataSpaceShareCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceShareCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
}

val XrCompositionLayerSpaceWarpInfoFB = struct(Module.OPENXR, "XrCompositionLayerSpaceWarpInfoFB") {
    Expression("#TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrCompositionLayerSpaceWarpInfoFlagsFB("layerFlags")
    XrSwapchainSubImage("motionVectorSubImage")
    XrPosef("appSpaceDeltaPose")
    XrSwapchainSubImage("depthSubImage")
    float("minDepth")
    float("maxDepth")
    float("nearZ")
    float("farZ")
}

val XrSystemSpaceWarpPropertiesFB = struct(Module.OPENXR, "XrSystemSpaceWarpPropertiesFB", mutable = false) {
    Expression("#TYPE_SYSTEM_SPACE_WARP_PROPERTIES_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    uint32_t("recommendedMotionVectorImageRectWidth")
    uint32_t("recommendedMotionVectorImageRectHeight")
}

val XrHapticAmplitudeEnvelopeVibrationFB = struct(Module.OPENXR, "XrHapticAmplitudeEnvelopeVibrationFB", parentStruct = XrHapticBaseHeader) {
    Expression("#TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrDuration("duration")
    AutoSize("amplitudes")..uint32_t("amplitudeCount")
    float.const.p("amplitudes")
}

val XrExtent3DfFB = struct(Module.OPENXR, "XrExtent3DfFB", alias = XrExtent3Df) {
    float("width")
    float("height")
    float("depth")
}

val XrOffset3DfFB = struct(Module.OPENXR, "XrOffset3DfFB") {
    float("x")
    float("y")
    float("z")
}

val XrRect3DfFB = struct(Module.OPENXR, "XrRect3DfFB") {
    XrOffset3DfFB("offset")
    XrExtent3DfFB("extent")
}

val XrSemanticLabelsFB = struct(Module.OPENXR, "XrSemanticLabelsFB") {
    Expression("#TYPE_SEMANTIC_LABELS_FB")..XrStructureType("type")
    PointerSetter(
        "XrSemanticLabelsSupportInfoFB",
        prepend = true
    )..nullable..opaque_const_p("next")
    AutoSize("buffer", optional = true)..uint32_t("bufferCapacityInput")
    uint32_t("bufferCountOutput")
    nullable..char.p("buffer")
}

val XrRoomLayoutFB = struct(Module.OPENXR, "XrRoomLayoutFB") {
    Expression("#TYPE_ROOM_LAYOUT_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrUuidEXT("floorUuid")
    XrUuidEXT("ceilingUuid")
    AutoSize("wallUuids", optional = true)..uint32_t("wallUuidCapacityInput")
    uint32_t("wallUuidCountOutput")
    nullable..XrUuidEXT.p("wallUuids")
}

val XrBoundary2DFB = struct(Module.OPENXR, "XrBoundary2DFB") {
    Expression("#TYPE_BOUNDARY_2D_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput")
    uint32_t("vertexCountOutput")
    nullable..XrVector2f.p("vertices")
}

val XrSemanticLabelsSupportInfoFB = struct(Module.OPENXR, "XrSemanticLabelsSupportInfoFB") {
    Expression("#TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSemanticLabelsSupportFlagsFB("flags")
    charUTF8.const.p("recognizedLabels")
}

val XrDigitalLensControlALMALENCE = struct(Module.OPENXR, "XrDigitalLensControlALMALENCE") {
    Expression("#TYPE_DIGITAL_LENS_CONTROL_ALMALENCE")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrDigitalLensControlFlagsALMALENCE("flags")
}

val XrEventDataSceneCaptureCompleteFB = struct(Module.OPENXR, "XrEventDataSceneCaptureCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
}

val XrSceneCaptureRequestInfoFB = struct(Module.OPENXR, "XrSceneCaptureRequestInfoFB") {
    Expression("#TYPE_SCENE_CAPTURE_REQUEST_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("request", optional = true)..uint32_t("requestByteCount")
    nullable..char.const.p("request")
}

val XrSpaceContainerFB = struct(Module.OPENXR, "XrSpaceContainerFB") {
    Expression("#TYPE_SPACE_CONTAINER_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("uuids", optional = true)..uint32_t("uuidCapacityInput")
    uint32_t("uuidCountOutput")
    nullable..XrUuidEXT.p("uuids")
}

val XrFoveationEyeTrackedProfileCreateInfoMETA = struct(Module.OPENXR, "XrFoveationEyeTrackedProfileCreateInfoMETA") {
    Expression("#TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFoveationEyeTrackedProfileCreateFlagsMETA("flags")
}

val XrFoveationEyeTrackedStateMETA = struct(Module.OPENXR, "XrFoveationEyeTrackedStateMETA", mutable = false) {
    javaImport("static org.lwjgl.openxr.METAFoveationEyeTracked.*")
    Expression("#TYPE_FOVEATION_EYE_TRACKED_STATE_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrVector2f("foveationCenter")["XR_FOVEATION_CENTER_SIZE_META"]
    XrFoveationEyeTrackedStateFlagsMETA("flags")
}

val XrSystemFoveationEyeTrackedPropertiesMETA = struct(Module.OPENXR, "XrSystemFoveationEyeTrackedPropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsFoveationEyeTracked")
}

val XrSystemFaceTrackingPropertiesFB = struct(Module.OPENXR, "XrSystemFaceTrackingPropertiesFB", mutable = false) {
    Expression("#TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsFaceTracking")
}

val XrFaceTrackerCreateInfoFB = struct(Module.OPENXR, "XrFaceTrackerCreateInfoFB") {
    Expression("#TYPE_FACE_TRACKER_CREATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFaceExpressionSetFB("faceExpressionSet")
}

val XrFaceExpressionInfoFB = struct(Module.OPENXR, "XrFaceExpressionInfoFB") {
    Expression("#TYPE_FACE_EXPRESSION_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTime("time")
}

val XrFaceExpressionStatusFB = struct(Module.OPENXR, "XrFaceExpressionStatusFB") {
    XrBool32("isValid")
    XrBool32("isEyeFollowingBlendshapesValid")
}

val XrFaceExpressionWeightsFB = struct(Module.OPENXR, "XrFaceExpressionWeightsFB") {
    Expression("#TYPE_FACE_EXPRESSION_WEIGHTS_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("weights")..uint32_t("weightCount")
    float.p("weights")
    AutoSize("confidences")..uint32_t("confidenceCount")
    float.p("confidences")
    XrFaceExpressionStatusFB("status")
    XrTime("time")
}

val XrEyeGazeFB = struct(Module.OPENXR, "XrEyeGazeFB") {
    XrBool32("isValid")
    XrPosef("gazePose")
    float("gazeConfidence")
}

val XrEyeTrackerCreateInfoFB = struct(Module.OPENXR, "XrEyeTrackerCreateInfoFB") {
    Expression("#TYPE_EYE_TRACKER_CREATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrEyeGazesInfoFB = struct(Module.OPENXR, "XrEyeGazesInfoFB") {
    Expression("#TYPE_EYE_GAZES_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
}

val XrSystemEyeTrackingPropertiesFB = struct(Module.OPENXR, "XrSystemEyeTrackingPropertiesFB", mutable = false) {
    Expression("#TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsEyeTracking")
}

val XrEyeGazesFB = struct(Module.OPENXR, "XrEyeGazesFB") {
    javaImport("static org.lwjgl.openxr.FBEyeTrackingSocial.*")
    Expression("#TYPE_EYE_GAZES_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    XrEyeGazeFB("gaze")["XR_EYE_POSITION_COUNT_FB"]
    XrTime("time")
}

val XrPassthroughKeyboardHandsIntensityFB = struct(Module.OPENXR, "XrPassthroughKeyboardHandsIntensityFB") {
    Expression("#TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    float("leftHandIntensity")
    float("rightHandIntensity")
}

val XrCompositionLayerSettingsFB = struct(Module.OPENXR, "XrCompositionLayerSettingsFB") {
    Expression("#TYPE_COMPOSITION_LAYER_SETTINGS_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrCompositionLayerSettingsFlagsFB("layerFlags")
}

val XrHapticPcmVibrationFB = struct(Module.OPENXR, "XrHapticPcmVibrationFB", parentStruct = XrHapticBaseHeader) {
    Expression("#TYPE_HAPTIC_PCM_VIBRATION_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("buffer")..uint32_t("bufferSize")
    float.const.p("buffer")
    float("sampleRate")
    XrBool32("append")
    uint32_t.p("samplesConsumed")
}

val XrDevicePcmSampleRateStateFB = struct(Module.OPENXR, "XrDevicePcmSampleRateStateFB") {
    Expression("#TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    float("sampleRate")
}

val XrDevicePcmSampleRateGetInfoFB = struct(Module.OPENXR, "XrDevicePcmSampleRateGetInfoFB", alias = XrDevicePcmSampleRateStateFB) {
    Expression("#TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    float("sampleRate")
}

val XrFrameSynthesisInfoEXT = struct(Module.OPENXR, "XrFrameSynthesisInfoEXT") {
    Expression("#TYPE_FRAME_SYNTHESIS_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFrameSynthesisInfoFlagsEXT("layerFlags")
    XrSwapchainSubImage("motionVectorSubImage")
    XrVector4f("motionVectorScale")
    XrVector4f("motionVectorOffset")
    XrPosef("appSpaceDeltaPose")
    XrSwapchainSubImage("depthSubImage")
    float("minDepth")
    float("maxDepth")
    float("nearZ")
    float("farZ")
}

val XrFrameSynthesisConfigViewEXT = struct(Module.OPENXR, "XrFrameSynthesisConfigViewEXT") {
    Expression("#TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    uint32_t("recommendedMotionVectorImageRectWidth")
    uint32_t("recommendedMotionVectorImageRectHeight")
}

val XrCompositionLayerDepthTestFB = struct(Module.OPENXR, "XrCompositionLayerDepthTestFB") {
    Expression("#TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBool32("depthMask")
    XrCompareOpFB("compareOp")
}

val XrLocalDimmingFrameEndInfoMETA = struct(Module.OPENXR, "XrLocalDimmingFrameEndInfoMETA") {
    Expression("#TYPE_LOCAL_DIMMING_FRAME_END_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrLocalDimmingModeMETA("localDimmingMode")
}

val XrPassthroughPreferencesMETA = struct(Module.OPENXR, "XrPassthroughPreferencesMETA", mutable = false) {
    Expression("#TYPE_PASSTHROUGH_PREFERENCES_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrPassthroughPreferenceFlagsMETA("flags")
}

val XrSystemVirtualKeyboardPropertiesMETA = struct(Module.OPENXR, "XrSystemVirtualKeyboardPropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsVirtualKeyboard")
}

val XrVirtualKeyboardCreateInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardCreateInfoMETA") {
    Expression("#TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrVirtualKeyboardSpaceCreateInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardSpaceCreateInfoMETA") {
    Expression("#TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrVirtualKeyboardLocationTypeMETA("locationType")
    XrSpace("space")
    XrPosef("poseInSpace")
}

val XrVirtualKeyboardLocationInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardLocationInfoMETA") {
    Expression("#TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrVirtualKeyboardLocationTypeMETA("locationType")
    XrSpace("space")
    XrPosef("poseInSpace")
    float("scale")
}

val XrVirtualKeyboardModelVisibilitySetInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardModelVisibilitySetInfoMETA") {
    Expression("#TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBool32("visible")
}

val XrVirtualKeyboardAnimationStateMETA = struct(Module.OPENXR, "XrVirtualKeyboardAnimationStateMETA") {
    Expression("#TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META")..XrStructureType("type")
    nullable..opaque_p("next")
    int32_t("animationIndex")
    float("fraction")
}

val XrVirtualKeyboardModelAnimationStatesMETA = struct(Module.OPENXR, "XrVirtualKeyboardModelAnimationStatesMETA") {
    Expression("#TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("states", optional = true)..uint32_t("stateCapacityInput")
    uint32_t("stateCountOutput")
    nullable..XrVirtualKeyboardAnimationStateMETA.p("states")
}

val XrVirtualKeyboardTextureDataMETA = struct(Module.OPENXR, "XrVirtualKeyboardTextureDataMETA") {
    Expression("#TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META")..XrStructureType("type")
    nullable..opaque_p("next")
    uint32_t("textureWidth")
    uint32_t("textureHeight")
    AutoSize("buffer", optional = true)..uint32_t("bufferCapacityInput")
    uint32_t("bufferCountOutput")
    nullable..uint8_t.p("buffer")
}

val XrVirtualKeyboardInputInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardInputInfoMETA") {
    Expression("#TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrVirtualKeyboardInputSourceMETA("inputSource")
    nullable..XrSpace("inputSpace")
    XrPosef("inputPoseInSpace")
    XrVirtualKeyboardInputStateFlagsMETA("inputState")
}

val XrVirtualKeyboardTextContextChangeInfoMETA = struct(Module.OPENXR, "XrVirtualKeyboardTextContextChangeInfoMETA") {
    Expression("#TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    charUTF8.const.p("textContext")
}

val XrEventDataVirtualKeyboardCommitTextMETA = struct(Module.OPENXR, "XrEventDataVirtualKeyboardCommitTextMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    javaImport("static org.lwjgl.openxr.METAVirtualKeyboard.*")
    Expression("#TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrVirtualKeyboardMETA("keyboard")
    charUTF8("text")["XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META"]
}

val XrEventDataVirtualKeyboardBackspaceMETA = struct(Module.OPENXR, "XrEventDataVirtualKeyboardBackspaceMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrVirtualKeyboardMETA("keyboard")
}

val XrEventDataVirtualKeyboardEnterMETA = struct(Module.OPENXR, "XrEventDataVirtualKeyboardEnterMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrVirtualKeyboardMETA("keyboard")
}

val XrEventDataVirtualKeyboardShownMETA = struct(Module.OPENXR, "XrEventDataVirtualKeyboardShownMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_SHOWN_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrVirtualKeyboardMETA("keyboard")
}

val XrEventDataVirtualKeyboardHiddenMETA = struct(Module.OPENXR, "XrEventDataVirtualKeyboardHiddenMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_HIDDEN_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrVirtualKeyboardMETA("keyboard")
}

val XrExternalCameraIntrinsicsOCULUS = struct(Module.OPENXR, "XrExternalCameraIntrinsicsOCULUS") {
    XrTime("lastChangeTime")
    XrFovf("fov")
    float("virtualNearPlaneDistance")
    float("virtualFarPlaneDistance")
    XrExtent2Di("imageSensorPixelResolution")
}

val XrExternalCameraExtrinsicsOCULUS = struct(Module.OPENXR, "XrExternalCameraExtrinsicsOCULUS") {
    XrTime("lastChangeTime")
    XrExternalCameraStatusFlagsOCULUS("cameraStatusFlags")
    XrExternalCameraAttachedToDeviceOCULUS("attachedToDevice")
    XrPosef("relativePose")
}

val XrExternalCameraOCULUS = struct(Module.OPENXR, "XrExternalCameraOCULUS", mutable = false) {
    javaImport("static org.lwjgl.openxr.OCULUSExternalCamera.*")
    Expression("#TYPE_EXTERNAL_CAMERA_OCULUS")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    charUTF8("name")["XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS"]
    XrExternalCameraIntrinsicsOCULUS("intrinsics")
    XrExternalCameraExtrinsicsOCULUS("extrinsics")
}

val XrVulkanSwapchainCreateInfoMETA = struct(Module.OPENXR, "XrVulkanSwapchainCreateInfoMETA") {
    javaImport("org.lwjgl.vulkan.*")
    Expression("#TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    VkImageCreateFlags("additionalCreateFlags")
    VkImageUsageFlags("additionalUsageFlags")
}

val XrPerformanceMetricsStateMETA = struct(Module.OPENXR, "XrPerformanceMetricsStateMETA") {
    Expression("#TYPE_PERFORMANCE_METRICS_STATE_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBool32("enabled")
}

val XrPerformanceMetricsCounterMETA = struct(Module.OPENXR, "XrPerformanceMetricsCounterMETA") {
    Expression("#TYPE_PERFORMANCE_METRICS_COUNTER_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPerformanceMetricsCounterFlagsMETA("counterFlags")
    XrPerformanceMetricsCounterUnitMETA("counterUnit")
    uint32_t("uintValue")
    float("floatValue")
}

val XrSpaceListSaveInfoFB = struct(Module.OPENXR, "XrSpaceListSaveInfoFB") {
    Expression("#TYPE_SPACE_LIST_SAVE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("spaces")..uint32_t("spaceCount")
    XrSpace.p("spaces")
    XrSpaceStorageLocationFB("location")
}

val XrEventDataSpaceListSaveCompleteFB = struct(Module.OPENXR, "XrEventDataSpaceListSaveCompleteFB", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
}

val XrSpaceUserCreateInfoFB = struct(Module.OPENXR, "XrSpaceUserCreateInfoFB") {
    Expression("#TYPE_SPACE_USER_CREATE_INFO_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpaceUserIdFB("userId")
}

val XrSystemHeadsetIdPropertiesMETA = struct(Module.OPENXR, "XrSystemHeadsetIdPropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrUuidEXT("id")
}

val XrSystemSpaceDiscoveryPropertiesMETA = struct(Module.OPENXR, "XrSystemSpaceDiscoveryPropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_SPACE_DISCOVERY_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrBool32("supportsSpaceDiscovery")
}

val XrSpaceFilterBaseHeaderMETA = struct(Module.OPENXR, "XrSpaceFilterBaseHeaderMETA") {
    XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSpaceDiscoveryInfoMETA = struct(Module.OPENXR, "XrSpaceDiscoveryInfoMETA") {
    Expression("#TYPE_SPACE_DISCOVERY_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("filters", optional = true)..uint32_t("filterCount")
    nullable..XrSpaceFilterBaseHeaderMETA.const.p.const.p("filters")
}

val XrSpaceFilterUuidMETA = struct(Module.OPENXR, "XrSpaceFilterUuidMETA", parentStruct = XrSpaceFilterBaseHeaderMETA) {
    Expression("#TYPE_SPACE_FILTER_UUID_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("uuids")..uint32_t("uuidCount")
    XrUuidEXT.const.p("uuids")
}

val XrSpaceFilterComponentMETA = struct(Module.OPENXR, "XrSpaceFilterComponentMETA", parentStruct = XrSpaceFilterBaseHeaderMETA) {
    Expression("#TYPE_SPACE_FILTER_COMPONENT_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpaceComponentTypeFB("componentType")
}

val XrSpaceDiscoveryResultMETA = struct(Module.OPENXR, "XrSpaceDiscoveryResultMETA", mutable = false) {
    XrSpace("space")
    XrUuidEXT("uuid")
}

val XrSpaceDiscoveryResultsMETA = struct(Module.OPENXR, "XrSpaceDiscoveryResultsMETA") {
    Expression("#TYPE_SPACE_DISCOVERY_RESULTS_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("results", optional = true)..uint32_t("resultCapacityInput")
    uint32_t("resultCountOutput")
    nullable..XrSpaceDiscoveryResultMETA.p("results")
}

val XrEventDataSpaceDiscoveryResultsAvailableMETA = struct(Module.OPENXR, "XrEventDataSpaceDiscoveryResultsAvailableMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACE_DISCOVERY_RESULTS_AVAILABLE_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
}

val XrEventDataSpaceDiscoveryCompleteMETA = struct(Module.OPENXR, "XrEventDataSpaceDiscoveryCompleteMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACE_DISCOVERY_COMPLETE_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
}

val XrRecommendedLayerResolutionMETA = struct(Module.OPENXR, "XrRecommendedLayerResolutionMETA", mutable = false) {
    Expression("#TYPE_RECOMMENDED_LAYER_RESOLUTION_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrExtent2Di("recommendedImageDimensions")
    XrBool32("isValid")
}

val XrRecommendedLayerResolutionGetInfoMETA = struct(Module.OPENXR, "XrRecommendedLayerResolutionGetInfoMETA") {
    Expression("#TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrCompositionLayerBaseHeader.const.p("layer")
    XrTime("predictedDisplayTime")
}

val XrSystemSpacePersistencePropertiesMETA = struct(Module.OPENXR, "XrSystemSpacePersistencePropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_SPACE_PERSISTENCE_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrBool32("supportsSpacePersistence")
}

val XrSpacesSaveInfoMETA = struct(Module.OPENXR, "XrSpacesSaveInfoMETA") {
    Expression("#TYPE_SPACES_SAVE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("spaces")..uint32_t("spaceCount")
    XrSpace.p("spaces")
}

val XrEventDataSpacesSaveResultMETA = struct(Module.OPENXR, "XrEventDataSpacesSaveResultMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACES_SAVE_RESULT_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
}

val XrSpacesEraseInfoMETA = struct(Module.OPENXR, "XrSpacesEraseInfoMETA") {
    Expression("#TYPE_SPACES_ERASE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("spaces", optional = true)..uint32_t("spaceCount")
    nullable..XrSpace.p("spaces")
    AutoSize("uuids", optional = true)..uint32_t("uuidCount")
    nullable..XrUuidEXT.p("uuids")
}

val XrEventDataSpacesEraseResultMETA = struct(Module.OPENXR, "XrEventDataSpacesEraseResultMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPACES_ERASE_RESULT_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
}

val XrPassthroughColorLutDataMETA = struct(Module.OPENXR, "XrPassthroughColorLutDataMETA") {
    AutoSize("buffer")..uint32_t("bufferSize")
    uint8_t.const.p("buffer")
}

val XrPassthroughColorLutCreateInfoMETA = struct(Module.OPENXR, "XrPassthroughColorLutCreateInfoMETA") {
    Expression("#TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPassthroughColorLutChannelsMETA("channels")
    uint32_t("resolution")
    XrPassthroughColorLutDataMETA("data")
}

val XrPassthroughColorLutUpdateInfoMETA = struct(Module.OPENXR, "XrPassthroughColorLutUpdateInfoMETA") {
    Expression("#TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPassthroughColorLutDataMETA("data")
}

val XrPassthroughColorMapLutMETA = struct(Module.OPENXR, "XrPassthroughColorMapLutMETA") {
    Expression("#TYPE_PASSTHROUGH_COLOR_MAP_LUT_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPassthroughColorLutMETA("colorLut")
    float("weight")
}

val XrPassthroughColorMapInterpolatedLutMETA = struct(Module.OPENXR, "XrPassthroughColorMapInterpolatedLutMETA") {
    Expression("#TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPassthroughColorLutMETA("sourceColorLut")
    XrPassthroughColorLutMETA("targetColorLut")
    float("weight")
}

val XrSystemPassthroughColorLutPropertiesMETA = struct(Module.OPENXR, "XrSystemPassthroughColorLutPropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    uint32_t("maxColorLutResolution")
}

val XrSpaceTriangleMeshGetInfoMETA = struct(Module.OPENXR, "XrSpaceTriangleMeshGetInfoMETA") {
    Expression("#TYPE_SPACE_TRIANGLE_MESH_GET_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSpaceTriangleMeshMETA = struct(Module.OPENXR, "XrSpaceTriangleMeshMETA", mutable = false) {
    Expression("#TYPE_SPACE_TRIANGLE_MESH_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput")
    uint32_t("vertexCountOutput")
    nullable..XrVector3f.p("vertices")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput")
    uint32_t("indexCountOutput")
    nullable..uint32_t.p("indices")
}

val XrSystemPropertiesBodyTrackingFullBodyMETA = struct(Module.OPENXR, "XrSystemPropertiesBodyTrackingFullBodyMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FULL_BODY_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsFullBodyTracking")
}

val XrEventDataPassthroughLayerResumedMETA = struct(Module.OPENXR, "XrEventDataPassthroughLayerResumedMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrPassthroughLayerFB("layer")
}

val XrBodyTrackingCalibrationStatusMETA = struct(Module.OPENXR, "XrBodyTrackingCalibrationStatusMETA", mutable = false) {
    Expression("#TYPE_BODY_TRACKING_CALIBRATION_STATUS_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBodyTrackingCalibrationStateMETA("status")
}

val XrBodyTrackingCalibrationInfoMETA = struct(Module.OPENXR, "XrBodyTrackingCalibrationInfoMETA") {
    Expression("#TYPE_BODY_TRACKING_CALIBRATION_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    float("bodyHeight")
}

val XrSystemPropertiesBodyTrackingCalibrationMETA = struct(Module.OPENXR, "XrSystemPropertiesBodyTrackingCalibrationMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_CALIBRATION_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsHeightOverride")
}

val XrSystemFaceTrackingProperties2FB = struct(Module.OPENXR, "XrSystemFaceTrackingProperties2FB", mutable = false) {
    Expression("#TYPE_SYSTEM_FACE_TRACKING_PROPERTIES2_FB")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsVisualFaceTracking")
    XrBool32("supportsAudioFaceTracking")
}

val XrFaceTrackerCreateInfo2FB = struct(Module.OPENXR, "XrFaceTrackerCreateInfo2FB") {
    Expression("#TYPE_FACE_TRACKER_CREATE_INFO2_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFaceExpressionSet2FB("faceExpressionSet")
    AutoSize("requestedDataSources", optional = true)..uint32_t("requestedDataSourceCount")
    nullable..XrFaceTrackingDataSource2FB.p("requestedDataSources")
}

val XrFaceExpressionInfo2FB = struct(Module.OPENXR, "XrFaceExpressionInfo2FB") {
    Expression("#TYPE_FACE_EXPRESSION_INFO2_FB")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTime("time")
}

val XrFaceExpressionWeights2FB = struct(Module.OPENXR, "XrFaceExpressionWeights2FB") {
    Expression("#TYPE_FACE_EXPRESSION_WEIGHTS2_FB")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("weights")..uint32_t("weightCount")
    float.p("weights")
    AutoSize("confidences")..uint32_t("confidenceCount")
    float.p("confidences")
    XrBool32("isValid")
    XrBool32("isEyeFollowingBlendshapesValid")
    XrFaceTrackingDataSource2FB("dataSource")
    XrTime("time")
}

val XrSystemSpatialEntitySharingPropertiesMETA = struct(Module.OPENXR, "XrSystemSpatialEntitySharingPropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsSpatialEntitySharing")
}

val XrShareSpacesRecipientBaseHeaderMETA = struct(Module.OPENXR, "XrShareSpacesRecipientBaseHeaderMETA") {
    XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrShareSpacesInfoMETA = struct(Module.OPENXR, "XrShareSpacesInfoMETA") {
    Expression("#TYPE_SHARE_SPACES_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("spaces")..uint32_t("spaceCount")
    XrSpace.p("spaces")
    XrShareSpacesRecipientBaseHeaderMETA.const.p("recipientInfo")
}

val XrEventDataShareSpacesCompleteMETA = struct(Module.OPENXR, "XrEventDataShareSpacesCompleteMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
}

val XrEnvironmentDepthProviderCreateInfoMETA = struct(Module.OPENXR, "XrEnvironmentDepthProviderCreateInfoMETA") {
    Expression("#TYPE_ENVIRONMENT_DEPTH_PROVIDER_CREATE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrEnvironmentDepthProviderCreateFlagsMETA("createFlags")
}

val XrEnvironmentDepthSwapchainCreateInfoMETA = struct(Module.OPENXR, "XrEnvironmentDepthSwapchainCreateInfoMETA") {
    Expression("#TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_CREATE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrEnvironmentDepthSwapchainCreateFlagsMETA("createFlags")
}

val XrEnvironmentDepthSwapchainStateMETA = struct(Module.OPENXR, "XrEnvironmentDepthSwapchainStateMETA") {
    Expression("#TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_STATE_META")..XrStructureType("type")
    nullable..opaque_p("next")
    uint32_t("width")
    uint32_t("height")
}

val XrEnvironmentDepthImageAcquireInfoMETA = struct(Module.OPENXR, "XrEnvironmentDepthImageAcquireInfoMETA") {
    Expression("#TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("space")
    XrTime("displayTime")
}

val XrEnvironmentDepthImageViewMETA = struct(Module.OPENXR, "XrEnvironmentDepthImageViewMETA") {
    Expression("#TYPE_ENVIRONMENT_DEPTH_IMAGE_VIEW_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFovf("fov")
    XrPosef("pose")
}

val XrEnvironmentDepthImageMETA = struct(Module.OPENXR, "XrEnvironmentDepthImageMETA") {
    Expression("#TYPE_ENVIRONMENT_DEPTH_IMAGE_META")..XrStructureType("type")
    PointerSetter(
        "XrEnvironmentDepthImageTimestampMETA",
        prepend = true
    )..nullable..opaque_const_p("next")
    uint32_t("swapchainIndex")
    float("nearZ")
    float("farZ")
    XrEnvironmentDepthImageViewMETA("views")[2]
}

val XrEnvironmentDepthImageTimestampMETA = struct(Module.OPENXR, "XrEnvironmentDepthImageTimestampMETA") {
    Expression("#TYPE_ENVIRONMENT_DEPTH_IMAGE_TIMESTAMP_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTime("captureTime")
}

val XrEnvironmentDepthHandRemovalSetInfoMETA = struct(Module.OPENXR, "XrEnvironmentDepthHandRemovalSetInfoMETA") {
    Expression("#TYPE_ENVIRONMENT_DEPTH_HAND_REMOVAL_SET_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBool32("enabled")
}

val XrSystemEnvironmentDepthPropertiesMETA = struct(Module.OPENXR, "XrSystemEnvironmentDepthPropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_ENVIRONMENT_DEPTH_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsEnvironmentDepth")
    XrBool32("supportsHandRemoval")
}

val XrRenderModelCreateInfoEXT = struct(Module.OPENXR, "XrRenderModelCreateInfoEXT") {
    Expression("#TYPE_RENDER_MODEL_CREATE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrRenderModelIdEXT("renderModelId")
    AutoSize("gltfExtensions", optional = true)..uint32_t("gltfExtensionCount")
    nullable..charUTF8.const.p.const.p("gltfExtensions")
}

val XrRenderModelPropertiesGetInfoEXT = struct(Module.OPENXR, "XrRenderModelPropertiesGetInfoEXT") {
    Expression("#TYPE_RENDER_MODEL_PROPERTIES_GET_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrRenderModelPropertiesEXT = struct(Module.OPENXR, "XrRenderModelPropertiesEXT", mutable = false) {
    Expression("#TYPE_RENDER_MODEL_PROPERTIES_EXT")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrUuidEXT("cacheId")
    uint32_t("animatableNodeCount")
}

val XrRenderModelSpaceCreateInfoEXT = struct(Module.OPENXR, "XrRenderModelSpaceCreateInfoEXT") {
    Expression("#TYPE_RENDER_MODEL_SPACE_CREATE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrRenderModelEXT("renderModel")
}

val XrRenderModelStateGetInfoEXT = struct(Module.OPENXR, "XrRenderModelStateGetInfoEXT") {
    Expression("#TYPE_RENDER_MODEL_STATE_GET_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTime("displayTime")
}

val XrRenderModelNodeStateEXT = struct(Module.OPENXR, "XrRenderModelNodeStateEXT") {
    XrPosef("nodePose")
    XrBool32("isVisible")
}

val XrRenderModelStateEXT = struct(Module.OPENXR, "XrRenderModelStateEXT") {
    Expression("#TYPE_RENDER_MODEL_STATE_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("nodeStates", optional = true)..uint32_t("nodeStateCount")
    nullable..XrRenderModelNodeStateEXT.p("nodeStates")
}

val XrRenderModelAssetCreateInfoEXT = struct(Module.OPENXR, "XrRenderModelAssetCreateInfoEXT") {
    Expression("#TYPE_RENDER_MODEL_ASSET_CREATE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrUuidEXT("cacheId")
}

val XrRenderModelAssetDataGetInfoEXT = struct(Module.OPENXR, "XrRenderModelAssetDataGetInfoEXT") {
    Expression("#TYPE_RENDER_MODEL_ASSET_DATA_GET_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrRenderModelAssetDataEXT = struct(Module.OPENXR, "XrRenderModelAssetDataEXT") {
    Expression("#TYPE_RENDER_MODEL_ASSET_DATA_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("buffer", optional = true)..uint32_t("bufferCapacityInput")
    uint32_t("bufferCountOutput")
    nullable..uint8_t.p("buffer")
}

val XrRenderModelAssetPropertiesGetInfoEXT = struct(Module.OPENXR, "XrRenderModelAssetPropertiesGetInfoEXT") {
    Expression("#TYPE_RENDER_MODEL_ASSET_PROPERTIES_GET_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrRenderModelAssetNodePropertiesEXT = struct(Module.OPENXR, "XrRenderModelAssetNodePropertiesEXT") {
    javaImport("static org.lwjgl.openxr.EXTRenderModel.*")
    charUTF8("uniqueName")["XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT"]
}

val XrRenderModelAssetPropertiesEXT = struct(Module.OPENXR, "XrRenderModelAssetPropertiesEXT") {
    Expression("#TYPE_RENDER_MODEL_ASSET_PROPERTIES_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("nodeProperties")..uint32_t("nodePropertyCount")
    XrRenderModelAssetNodePropertiesEXT.p("nodeProperties")
}

val XrInteractionRenderModelIdsEnumerateInfoEXT = struct(Module.OPENXR, "XrInteractionRenderModelIdsEnumerateInfoEXT") {
    Expression("#TYPE_INTERACTION_RENDER_MODEL_IDS_ENUMERATE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrInteractionRenderModelSubactionPathInfoEXT = struct(Module.OPENXR, "XrInteractionRenderModelSubactionPathInfoEXT") {
    Expression("#TYPE_INTERACTION_RENDER_MODEL_SUBACTION_PATH_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrInteractionRenderModelTopLevelUserPathGetInfoEXT = struct(Module.OPENXR, "XrInteractionRenderModelTopLevelUserPathGetInfoEXT") {
    Expression("#TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("topLevelUserPaths")..uint32_t("topLevelUserPathCount")
    XrPath.const.p("topLevelUserPaths")
}

val XrEventDataInteractionRenderModelsChangedEXT = struct(Module.OPENXR, "XrEventDataInteractionRenderModelsChangedEXT", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_INTERACTION_RENDER_MODELS_CHANGED_EXT")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
}

val XrPassthroughCreateInfoHTC = struct(Module.OPENXR, "XrPassthroughCreateInfoHTC") {
    Expression("#TYPE_PASSTHROUGH_CREATE_INFO_HTC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPassthroughFormHTC("form")
}

val XrPassthroughColorHTC = struct(Module.OPENXR, "XrPassthroughColorHTC") {
    Expression("#TYPE_PASSTHROUGH_COLOR_HTC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    float("alpha")
}

val XrPassthroughMeshTransformInfoHTC = struct(Module.OPENXR, "XrPassthroughMeshTransformInfoHTC") {
    Expression("#TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("vertices")..uint32_t("vertexCount")
    XrVector3f.const.p("vertices")
    AutoSize("indices")..uint32_t("indexCount")
    uint32_t.const.p("indices")
    XrSpace("baseSpace")
    XrTime("time")
    XrPosef("pose")
    XrVector3f("scale")
}

val XrCompositionLayerPassthroughHTC = struct(Module.OPENXR, "XrCompositionLayerPassthroughHTC", parentStruct = XrCompositionLayerBaseHeader) {
    Expression("#TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC")..XrStructureType("type")
    PointerSetter(
        "XrPassthroughMeshTransformInfoHTC",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrCompositionLayerFlags("layerFlags")
    XrSpace("space")
    XrPassthroughHTC("passthrough")
    XrPassthroughColorHTC("color")
}

val XrFoveationApplyInfoHTC = struct(Module.OPENXR, "XrFoveationApplyInfoHTC") {
    Expression("#TYPE_FOVEATION_APPLY_INFO_HTC")..XrStructureType("type")
    PointerSetter(
        "XrFoveationCustomModeInfoHTC", "XrFoveationDynamicModeInfoHTC",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrFoveationModeHTC("mode")
    AutoSize("subImages")..uint32_t("subImageCount")
    XrSwapchainSubImage.p("subImages")
}

val XrFoveationConfigurationHTC = struct(Module.OPENXR, "XrFoveationConfigurationHTC") {
    XrFoveationLevelHTC("level")
    float("clearFovDegree")
    XrVector2f("focalCenterOffset")
}

val XrFoveationDynamicModeInfoHTC = struct(Module.OPENXR, "XrFoveationDynamicModeInfoHTC") {
    Expression("#TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFoveationDynamicFlagsHTC("dynamicFlags")
}

val XrFoveationCustomModeInfoHTC = struct(Module.OPENXR, "XrFoveationCustomModeInfoHTC") {
    Expression("#TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("configs")..uint32_t("configCount")
    XrFoveationConfigurationHTC.const.p("configs")
}

val XrSystemAnchorPropertiesHTC = struct(Module.OPENXR, "XrSystemAnchorPropertiesHTC", mutable = false) {
    Expression("#TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsAnchor")
}

val XrSpatialAnchorNameHTC = struct(Module.OPENXR, "XrSpatialAnchorNameHTC") {
    javaImport("static org.lwjgl.openxr.HTCAnchor.*")
    charUTF8("name")["XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC"]
}

val XrSpatialAnchorCreateInfoHTC = struct(Module.OPENXR, "XrSpatialAnchorCreateInfoHTC") {
    Expression("#TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("space")
    XrPosef("poseInSpace")
    XrSpatialAnchorNameHTC("name")
}

val XrSystemBodyTrackingPropertiesHTC = struct(Module.OPENXR, "XrSystemBodyTrackingPropertiesHTC", mutable = false) {
    Expression("#TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsBodyTracking")
}

val XrBodyTrackerCreateInfoHTC = struct(Module.OPENXR, "XrBodyTrackerCreateInfoHTC") {
    Expression("#TYPE_BODY_TRACKER_CREATE_INFO_HTC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBodyJointSetHTC("bodyJointSet")
}

val XrBodyJointsLocateInfoHTC = struct(Module.OPENXR, "XrBodyJointsLocateInfoHTC") {
    Expression("#TYPE_BODY_JOINTS_LOCATE_INFO_HTC")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
}

val XrBodyJointLocationHTC = struct(Module.OPENXR, "XrBodyJointLocationHTC", mutable = false) {
    XrSpaceLocationFlags("locationFlags")
    XrPosef("pose")
}

val XrBodyJointLocationsHTC = struct(Module.OPENXR, "XrBodyJointLocationsHTC") {
    Expression("#TYPE_BODY_JOINT_LOCATIONS_HTC")..XrStructureType("type")
    nullable..opaque_p("next")
    XrSpaceLocationFlags("combinedLocationFlags")
    XrBodyJointConfidenceHTC("confidenceLevel")
    AutoSize("jointLocations")..uint32_t("jointLocationCount")
    XrBodyJointLocationHTC.p("jointLocations")
    uint32_t("skeletonGenerationId")
}

val XrBodySkeletonJointHTC = struct(Module.OPENXR, "XrBodySkeletonJointHTC") {
    XrPosef("pose")
}

val XrBodySkeletonHTC = struct(Module.OPENXR, "XrBodySkeletonHTC") {
    Expression("#TYPE_BODY_SKELETON_HTC")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("joints")..uint32_t("jointCount")
    XrBodySkeletonJointHTC.p("joints")
}

val XrActiveActionSetPriorityEXT = struct(Module.OPENXR, "XrActiveActionSetPriorityEXT") {
    XrActionSet("actionSet")
    uint32_t("priorityOverride")
}

val XrActiveActionSetPrioritiesEXT = struct(Module.OPENXR, "XrActiveActionSetPrioritiesEXT") {
    Expression("#TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("actionSetPriorities")..uint32_t("actionSetPriorityCount")
    XrActiveActionSetPriorityEXT.const.p("actionSetPriorities")
}

val XrSystemForceFeedbackCurlPropertiesMNDX = struct(Module.OPENXR, "XrSystemForceFeedbackCurlPropertiesMNDX", mutable = false) {
    Expression("#TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsForceFeedbackCurl")
}

val XrForceFeedbackCurlApplyLocationMNDX = struct(Module.OPENXR, "XrForceFeedbackCurlApplyLocationMNDX") {
    XrForceFeedbackCurlLocationMNDX("location")
    float("value")
}

val XrForceFeedbackCurlApplyLocationsMNDX = struct(Module.OPENXR, "XrForceFeedbackCurlApplyLocationsMNDX") {
    Expression("#TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("locations")..uint32_t("locationCount")
    XrForceFeedbackCurlApplyLocationMNDX.p("locations")
}

val XrSystemBodyTrackingPropertiesBD = struct(Module.OPENXR, "XrSystemBodyTrackingPropertiesBD", mutable = false) {
    Expression("#TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_BD")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsBodyTracking")
}

val XrBodyTrackerCreateInfoBD = struct(Module.OPENXR, "XrBodyTrackerCreateInfoBD") {
    Expression("#TYPE_BODY_TRACKER_CREATE_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBodyJointSetBD("jointSet")
}

val XrBodyJointsLocateInfoBD = struct(Module.OPENXR, "XrBodyJointsLocateInfoBD") {
    Expression("#TYPE_BODY_JOINTS_LOCATE_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
}

val XrBodyJointLocationBD = struct(Module.OPENXR, "XrBodyJointLocationBD") {
    XrSpaceLocationFlags("locationFlags")
    XrPosef("pose")
}

val XrBodyJointLocationsBD = struct(Module.OPENXR, "XrBodyJointLocationsBD") {
    Expression("#TYPE_BODY_JOINT_LOCATIONS_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    XrBool32("allJointPosesTracked")
    AutoSize("jointLocations")..uint32_t("jointLocationCount")
    XrBodyJointLocationBD.p("jointLocations")
}

val XrSystemFacialSimulationPropertiesBD = struct(Module.OPENXR, "XrSystemFacialSimulationPropertiesBD", mutable = false) {
    Expression("#TYPE_SYSTEM_FACIAL_SIMULATION_PROPERTIES_BD")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsFaceTracking")
}

val XrFaceTrackerCreateInfoBD = struct(Module.OPENXR, "XrFaceTrackerCreateInfoBD") {
    Expression("#TYPE_FACE_TRACKER_CREATE_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFacialSimulationModeBD("mode")
}

val XrFacialSimulationDataGetInfoBD = struct(Module.OPENXR, "XrFacialSimulationDataGetInfoBD") {
    Expression("#TYPE_FACIAL_SIMULATION_DATA_GET_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTime("time")
}

val XrFacialSimulationDataBD = struct(Module.OPENXR, "XrFacialSimulationDataBD") {
    Expression("#TYPE_FACIAL_SIMULATION_DATA_BD")..XrStructureType("type")
    PointerSetter(
        "XrLipExpressionDataBD",
        prepend = true
    )..nullable..opaque_p("next")
    AutoSize("faceExpressionWeights")..uint32_t("faceExpressionWeightCount")
    float.p("faceExpressionWeights")
    XrBool32("isUpperFaceDataValid")
    XrBool32("isLowerFaceDataValid")
    XrTime("time")
}

val XrLipExpressionDataBD = struct(Module.OPENXR, "XrLipExpressionDataBD") {
    Expression("#TYPE_LIP_EXPRESSION_DATA_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("lipsyncExpressionWeights")..uint32_t("lipsyncExpressionWeightCount")
    float.p("lipsyncExpressionWeights")
}

val XrSystemSpatialSensingPropertiesBD = struct(Module.OPENXR, "XrSystemSpatialSensingPropertiesBD", mutable = false) {
    Expression("#TYPE_SYSTEM_SPATIAL_SENSING_PROPERTIES_BD")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsSpatialSensing")
}

val XrSpatialEntityComponentGetInfoBD = struct(Module.OPENXR, "XrSpatialEntityComponentGetInfoBD") {
    Expression("#TYPE_SPATIAL_ENTITY_COMPONENT_GET_INFO_BD")..XrStructureType("type")
    PointerSetter(
        "XrSpatialEntityLocationGetInfoBD",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrSpatialEntityIdBD("entityId")
    XrSpatialEntityComponentTypeBD("componentType")
}

val XrSpatialEntityComponentDataBaseHeaderBD = struct(Module.OPENXR, "XrSpatialEntityComponentDataBaseHeaderBD") {
    XrStructureType("type")
    PointerSetter(
        "XrSpatialEntityComponentDataBoundingBox2DBD", "XrSpatialEntityComponentDataBoundingBox3DBD", "XrSpatialEntityComponentDataLocationBD", "XrSpatialEntityComponentDataPlaneOrientationBD", "XrSpatialEntityComponentDataPolygonBD", "XrSpatialEntityComponentDataSemanticBD", "XrSpatialEntityComponentDataTriangleMeshBD",
        prepend = true
    )..nullable..opaque_p("next")
}

val XrSpatialEntityLocationGetInfoBD = struct(Module.OPENXR, "XrSpatialEntityLocationGetInfoBD") {
    Expression("#TYPE_SPATIAL_ENTITY_LOCATION_GET_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
}

val XrSpatialEntityComponentDataLocationBD = struct(Module.OPENXR, "XrSpatialEntityComponentDataLocationBD") {
    Expression("#TYPE_SPATIAL_ENTITY_COMPONENT_DATA_LOCATION_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    XrSpaceLocation("location")
}

val XrSpatialEntityComponentDataSemanticBD = struct(Module.OPENXR, "XrSpatialEntityComponentDataSemanticBD") {
    Expression("#TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("labels", optional = true)..uint32_t("labelCapacityInput")
    uint32_t("labelCountOutput")
    nullable..XrSemanticLabelBD.p("labels")
}

val XrSpatialEntityComponentDataBoundingBox2DBD = struct(Module.OPENXR, "XrSpatialEntityComponentDataBoundingBox2DBD") {
    Expression("#TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_2D_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    XrRect2Df("boundingBox2D")
}

val XrSpatialEntityComponentDataPolygonBD = struct(Module.OPENXR, "XrSpatialEntityComponentDataPolygonBD") {
    Expression("#TYPE_SPATIAL_ENTITY_COMPONENT_DATA_POLYGON_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput")
    uint32_t("vertexCountOutput")
    nullable..XrVector2f.p("vertices")
}

val XrSpatialEntityComponentDataBoundingBox3DBD = struct(Module.OPENXR, "XrSpatialEntityComponentDataBoundingBox3DBD") {
    Expression("#TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    XrBoxf("boundingBox3D")
}

val XrSpatialEntityComponentDataTriangleMeshBD = struct(Module.OPENXR, "XrSpatialEntityComponentDataTriangleMeshBD") {
    Expression("#TYPE_SPATIAL_ENTITY_COMPONENT_DATA_TRIANGLE_MESH_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput")
    uint32_t("vertexCountOutput")
    nullable..XrVector3f.p("vertices")
    AutoSize("indices", optional = true)..uint32_t("indexCapacityInput")
    uint32_t("indexCountOutput")
    nullable..uint16_t.p("indices")
}

val XrSenseDataProviderCreateInfoBD = struct(Module.OPENXR, "XrSenseDataProviderCreateInfoBD") {
    Expression("#TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_BD")..XrStructureType("type")
    PointerSetter(
        "XrSenseDataProviderCreateInfoSpatialMeshBD",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrSenseDataProviderTypeBD("providerType")
}

val XrSenseDataProviderStartInfoBD = struct(Module.OPENXR, "XrSenseDataProviderStartInfoBD") {
    Expression("#TYPE_SENSE_DATA_PROVIDER_START_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrEventDataSenseDataProviderStateChangedBD = struct(Module.OPENXR, "XrEventDataSenseDataProviderStateChangedBD", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SENSE_DATA_PROVIDER_STATE_CHANGED_BD")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrSenseDataProviderBD("provider")
    XrSenseDataProviderStateBD("newState")
}

val XrEventDataSenseDataUpdatedBD = struct(Module.OPENXR, "XrEventDataSenseDataUpdatedBD", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SENSE_DATA_UPDATED_BD")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrSenseDataProviderBD("provider")
}

val XrSenseDataQueryInfoBD = struct(Module.OPENXR, "XrSenseDataQueryInfoBD") {
    Expression("#TYPE_SENSE_DATA_QUERY_INFO_BD")..XrStructureType("type")
    PointerSetter(
        "XrSenseDataFilterPlaneOrientationBD", "XrSenseDataFilterSemanticBD", "XrSenseDataFilterUuidBD",
        prepend = true
    )..nullable..opaque_const_p("next")
}

val XrSenseDataQueryCompletionBD = struct(Module.OPENXR, "XrSenseDataQueryCompletionBD", parentStruct = _XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_SENSE_DATA_QUERY_COMPLETION_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    XrSenseDataSnapshotBD("snapshot")
}

val XrQueriedSenseDataGetInfoBD = struct(Module.OPENXR, "XrQueriedSenseDataGetInfoBD") {
    Expression("#TYPE_QUERIED_SENSE_DATA_GET_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSpatialEntityStateBD = struct(Module.OPENXR, "XrSpatialEntityStateBD") {
    Expression("#TYPE_SPATIAL_ENTITY_STATE_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    XrSpatialEntityIdBD("entityId")
    XrTime("lastUpdateTime")
    XrUuidEXT("uuid")
}

val XrQueriedSenseDataBD = struct(Module.OPENXR, "XrQueriedSenseDataBD") {
    Expression("#TYPE_QUERIED_SENSE_DATA_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("states", optional = true)..uint32_t("stateCapacityInput")
    uint32_t("stateCountOutput")
    nullable..XrSpatialEntityStateBD.p("states")
}

val XrSenseDataFilterUuidBD = struct(Module.OPENXR, "XrSenseDataFilterUuidBD") {
    Expression("#TYPE_SENSE_DATA_FILTER_UUID_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("uuids")..uint32_t("uuidCount")
    XrUuidEXT.const.p("uuids")
}

val XrSenseDataFilterSemanticBD = struct(Module.OPENXR, "XrSenseDataFilterSemanticBD") {
    Expression("#TYPE_SENSE_DATA_FILTER_SEMANTIC_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("labels")..uint32_t("labelCount")
    XrSemanticLabelBD.const.p("labels")
}

val XrSpatialEntityAnchorCreateInfoBD = struct(Module.OPENXR, "XrSpatialEntityAnchorCreateInfoBD") {
    Expression("#TYPE_SPATIAL_ENTITY_ANCHOR_CREATE_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSenseDataSnapshotBD("snapshot")
    XrSpatialEntityIdBD("entityId")
}

val XrAnchorSpaceCreateInfoBD = struct(Module.OPENXR, "XrAnchorSpaceCreateInfoBD") {
    Expression("#TYPE_ANCHOR_SPACE_CREATE_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrAnchorBD("anchor")
    XrPosef("poseInAnchorSpace")
}

val XrFutureCompletionEXT = struct(Module.OPENXR, "XrFutureCompletionEXT", parentStruct = _XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_FUTURE_COMPLETION_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
}

val XrSystemSpatialAnchorPropertiesBD = struct(Module.OPENXR, "XrSystemSpatialAnchorPropertiesBD", mutable = false) {
    Expression("#TYPE_SYSTEM_SPATIAL_ANCHOR_PROPERTIES_BD")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsSpatialAnchor")
}

val XrSpatialAnchorCreateInfoBD = struct(Module.OPENXR, "XrSpatialAnchorCreateInfoBD") {
    Expression("#TYPE_SPATIAL_ANCHOR_CREATE_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("space")
    XrPosef("pose")
    XrTime("time")
}

val XrSpatialAnchorCreateCompletionBD = struct(Module.OPENXR, "XrSpatialAnchorCreateCompletionBD", parentStruct = _XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_ANCHOR_CREATE_COMPLETION_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    XrUuidEXT("uuid")
    XrAnchorBD("anchor")
}

val XrSpatialAnchorPersistInfoBD = struct(Module.OPENXR, "XrSpatialAnchorPersistInfoBD") {
    Expression("#TYPE_SPATIAL_ANCHOR_PERSIST_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPersistenceLocationBD("location")
    XrAnchorBD("anchor")
}

val XrSpatialAnchorUnpersistInfoBD = struct(Module.OPENXR, "XrSpatialAnchorUnpersistInfoBD") {
    Expression("#TYPE_SPATIAL_ANCHOR_UNPERSIST_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPersistenceLocationBD("location")
    XrAnchorBD("anchor")
}

val XrSystemSpatialAnchorSharingPropertiesBD = struct(Module.OPENXR, "XrSystemSpatialAnchorSharingPropertiesBD", mutable = false) {
    Expression("#TYPE_SYSTEM_SPATIAL_ANCHOR_SHARING_PROPERTIES_BD")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsSpatialAnchorSharing")
}

val XrSpatialAnchorShareInfoBD = struct(Module.OPENXR, "XrSpatialAnchorShareInfoBD") {
    Expression("#TYPE_SPATIAL_ANCHOR_SHARE_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrAnchorBD("anchor")
}

val XrSharedSpatialAnchorDownloadInfoBD = struct(Module.OPENXR, "XrSharedSpatialAnchorDownloadInfoBD") {
    Expression("#TYPE_SHARED_SPATIAL_ANCHOR_DOWNLOAD_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrUuidEXT("uuid")
}

val XrSystemSpatialScenePropertiesBD = struct(Module.OPENXR, "XrSystemSpatialScenePropertiesBD", mutable = false) {
    Expression("#TYPE_SYSTEM_SPATIAL_SCENE_PROPERTIES_BD")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsSpatialScene")
}

val XrSceneCaptureInfoBD = struct(Module.OPENXR, "XrSceneCaptureInfoBD") {
    Expression("#TYPE_SCENE_CAPTURE_INFO_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSystemSpatialMeshPropertiesBD = struct(Module.OPENXR, "XrSystemSpatialMeshPropertiesBD", mutable = false) {
    Expression("#TYPE_SYSTEM_SPATIAL_MESH_PROPERTIES_BD")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsSpatialMesh")
}

val XrSenseDataProviderCreateInfoSpatialMeshBD = struct(Module.OPENXR, "XrSenseDataProviderCreateInfoSpatialMeshBD") {
    Expression("#TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_SPATIAL_MESH_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialMeshConfigFlagsBD("configFlags")
    XrSpatialMeshLodBD("lod")
}

val XrFuturePollResultProgressBD = struct(Module.OPENXR, "XrFuturePollResultProgressBD", mutable = false) {
    Expression("#TYPE_FUTURE_POLL_RESULT_PROGRESS_BD")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("isSupported")
    uint32_t("progressPercentage")
}

val XrSystemSpatialPlanePropertiesBD = struct(Module.OPENXR, "XrSystemSpatialPlanePropertiesBD", mutable = false) {
    Expression("#TYPE_SYSTEM_SPATIAL_PLANE_PROPERTIES_BD")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsSpatialPlane")
}

val XrSpatialEntityComponentDataPlaneOrientationBD = struct(Module.OPENXR, "XrSpatialEntityComponentDataPlaneOrientationBD") {
    Expression("#TYPE_SPATIAL_ENTITY_COMPONENT_DATA_PLANE_ORIENTATION_BD")..XrStructureType("type")
    nullable..opaque_p("next")
    XrPlaneOrientationBD("orientation")
}

val XrSenseDataFilterPlaneOrientationBD = struct(Module.OPENXR, "XrSenseDataFilterPlaneOrientationBD") {
    Expression("#TYPE_SENSE_DATA_FILTER_PLANE_ORIENTATION_BD")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("orientations")..uint32_t("orientationCount")
    XrPlaneOrientationBD.p("orientations")
}

val XrHandTrackingDataSourceInfoEXT = struct(Module.OPENXR, "XrHandTrackingDataSourceInfoEXT") {
    Expression("#TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("requestedDataSources", optional = true)..uint32_t("requestedDataSourceCount")
    XrHandTrackingDataSourceEXT.p("requestedDataSources")
}

val XrHandTrackingDataSourceStateEXT = struct(Module.OPENXR, "XrHandTrackingDataSourceStateEXT", mutable = false) {
    Expression("#TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("isActive")
    XrHandTrackingDataSourceEXT("dataSource")
}

val XrSystemPlaneDetectionPropertiesEXT = struct(Module.OPENXR, "XrSystemPlaneDetectionPropertiesEXT", mutable = false) {
    Expression("#TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrPlaneDetectionCapabilityFlagsEXT("supportedFeatures")
}

val XrPlaneDetectorCreateInfoEXT = struct(Module.OPENXR, "XrPlaneDetectorCreateInfoEXT") {
    Expression("#TYPE_PLANE_DETECTOR_CREATE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrPlaneDetectorFlagsEXT("flags")
}

val XrExtent3DfEXT = struct(Module.OPENXR, "XrExtent3DfEXT", alias = XrExtent3Df) {
    float("width")
    float("height")
    float("depth")
}

val XrPlaneDetectorBeginInfoEXT = struct(Module.OPENXR, "XrPlaneDetectorBeginInfoEXT") {
    Expression("#TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
    AutoSize("orientations", optional = true)..uint32_t("orientationCount")
    nullable..XrPlaneDetectorOrientationEXT.const.p("orientations")
    AutoSize("semanticTypes", optional = true)..uint32_t("semanticTypeCount")
    nullable..XrPlaneDetectorSemanticTypeEXT.const.p("semanticTypes")
    uint32_t("maxPlanes")
    float("minArea")
    XrPosef("boundingBoxPose")
    XrExtent3DfEXT("boundingBoxExtent")
}

val XrPlaneDetectorGetInfoEXT = struct(Module.OPENXR, "XrPlaneDetectorGetInfoEXT") {
    Expression("#TYPE_PLANE_DETECTOR_GET_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
}

val XrPlaneDetectorLocationEXT = struct(Module.OPENXR, "XrPlaneDetectorLocationEXT") {
    Expression("#TYPE_PLANE_DETECTOR_LOCATION_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    uint64_t("planeId")
    XrSpaceLocationFlags("locationFlags")
    XrPosef("pose")
    XrExtent2Df("extents")
    XrPlaneDetectorOrientationEXT("orientation")
    XrPlaneDetectorSemanticTypeEXT("semanticType")
    uint32_t("polygonBufferCount")
}

val XrPlaneDetectorLocationsEXT = struct(Module.OPENXR, "XrPlaneDetectorLocationsEXT") {
    Expression("#TYPE_PLANE_DETECTOR_LOCATIONS_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("planeLocations", optional = true)..uint32_t("planeLocationCapacityInput")
    uint32_t("planeLocationCountOutput")
    nullable..XrPlaneDetectorLocationEXT.p("planeLocations")
}

val XrPlaneDetectorPolygonBufferEXT = struct(Module.OPENXR, "XrPlaneDetectorPolygonBufferEXT") {
    Expression("#TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput")
    uint32_t("vertexCountOutput")
    nullable..XrVector2f.p("vertices")
}

val XrTrackableTrackerCreateInfoANDROID = struct(Module.OPENXR, "XrTrackableTrackerCreateInfoANDROID") {
    Expression("#TYPE_TRACKABLE_TRACKER_CREATE_INFO_ANDROID")..XrStructureType("type")
    PointerSetter(
        "XrTrackableMarkerConfigurationANDROID", "XrTrackableObjectConfigurationANDROID",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrTrackableTypeANDROID("trackableType")
}

val XrTrackableGetInfoANDROID = struct(Module.OPENXR, "XrTrackableGetInfoANDROID") {
    Expression("#TYPE_TRACKABLE_GET_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTrackableANDROID("trackable")
    XrSpace("baseSpace")
    XrTime("time")
}

val XrTrackablePlaneANDROID = struct(Module.OPENXR, "XrTrackablePlaneANDROID") {
    Expression("#TYPE_TRACKABLE_PLANE_ANDROID")..XrStructureType("type")
    nullable..opaque_p("next")
    XrTrackingStateANDROID("trackingState")
    XrPosef("centerPose")
    XrExtent2Df("extents")
    XrPlaneTypeANDROID("planeType")
    XrPlaneLabelANDROID("planeLabel")
    XrTrackableANDROID("subsumedByPlane")
    XrTime("lastUpdatedTime")
    AutoSize("vertices", optional = true)..uint32_t("vertexCapacityInput")
    nullable..uint32_t.p("vertexCountOutput")
    nullable..XrVector2f.p("vertices")
}

val XrAnchorSpaceCreateInfoANDROID = struct(Module.OPENXR, "XrAnchorSpaceCreateInfoANDROID") {
    Expression("#TYPE_ANCHOR_SPACE_CREATE_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("space")
    XrTime("time")
    XrPosef("pose")
    XrTrackableANDROID("trackable")
}

val XrSystemTrackablesPropertiesANDROID = struct(Module.OPENXR, "XrSystemTrackablesPropertiesANDROID", mutable = false) {
    Expression("#TYPE_SYSTEM_TRACKABLES_PROPERTIES_ANDROID")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrBool32("supportsAnchor")
    uint32_t("maxAnchors")
}

val XrDeviceAnchorPersistenceCreateInfoANDROID = struct(Module.OPENXR, "XrDeviceAnchorPersistenceCreateInfoANDROID") {
    Expression("#TYPE_DEVICE_ANCHOR_PERSISTENCE_CREATE_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrPersistedAnchorSpaceCreateInfoANDROID = struct(Module.OPENXR, "XrPersistedAnchorSpaceCreateInfoANDROID") {
    Expression("#TYPE_PERSISTED_ANCHOR_SPACE_CREATE_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrUuidEXT("anchorId")
}

val XrPersistedAnchorSpaceInfoANDROID = struct(Module.OPENXR, "XrPersistedAnchorSpaceInfoANDROID") {
    Expression("#TYPE_PERSISTED_ANCHOR_SPACE_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("anchor")
}

val XrSystemDeviceAnchorPersistencePropertiesANDROID = struct(Module.OPENXR, "XrSystemDeviceAnchorPersistencePropertiesANDROID", mutable = false) {
    Expression("#TYPE_SYSTEM_DEVICE_ANCHOR_PERSISTENCE_PROPERTIES_ANDROID")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsAnchorPersistence")
}

val XrFaceTrackerCreateInfoANDROID = struct(Module.OPENXR, "XrFaceTrackerCreateInfoANDROID") {
    Expression("#TYPE_FACE_TRACKER_CREATE_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrFaceStateGetInfoANDROID = struct(Module.OPENXR, "XrFaceStateGetInfoANDROID") {
    Expression("#TYPE_FACE_STATE_GET_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTime("time")
}

val XrFaceStateANDROID = struct(Module.OPENXR, "XrFaceStateANDROID") {
    Expression("#TYPE_FACE_STATE_ANDROID")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("parameters", optional = true)..uint32_t("parametersCapacityInput")
    uint32_t("parametersCountOutput")
    nullable..float.p("parameters")
    XrFaceTrackingStateANDROID("faceTrackingState")
    XrTime("sampleTime")
    XrBool32("isValid")
    AutoSize("regionConfidences", optional = true)..uint32_t("regionConfidencesCapacityInput")
    uint32_t("regionConfidencesCountOutput")
    nullable..float.p("regionConfidences")
}

val XrSystemFaceTrackingPropertiesANDROID = struct(Module.OPENXR, "XrSystemFaceTrackingPropertiesANDROID", mutable = false) {
    Expression("#TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_ANDROID")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsFaceTracking")
}

val XrSystemPassthroughCameraStatePropertiesANDROID = struct(Module.OPENXR, "XrSystemPassthroughCameraStatePropertiesANDROID", mutable = false) {
    Expression("#TYPE_SYSTEM_PASSTHROUGH_CAMERA_STATE_PROPERTIES_ANDROID")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsPassthroughCameraState")
}

val XrPassthroughCameraStateGetInfoANDROID = struct(Module.OPENXR, "XrPassthroughCameraStateGetInfoANDROID") {
    Expression("#TYPE_PASSTHROUGH_CAMERA_STATE_GET_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrRaycastInfoANDROID = struct(Module.OPENXR, "XrRaycastInfoANDROID") {
    Expression("#TYPE_RAYCAST_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    uint32_t("maxResults")
    AutoSize("trackers")..uint32_t("trackerCount")
    XrTrackableTrackerANDROID.const.p("trackers")
    XrVector3f("origin")
    XrVector3f("trajectory")
    XrSpace("space")
    XrTime("time")
}

val XrRaycastHitResultANDROID = struct(Module.OPENXR, "XrRaycastHitResultANDROID", mutable = false) {
    XrTrackableTypeANDROID("type")
    XrTrackableANDROID("trackable")
    XrPosef("pose")
}

val XrRaycastHitResultsANDROID = struct(Module.OPENXR, "XrRaycastHitResultsANDROID") {
    Expression("#TYPE_RAYCAST_HIT_RESULTS_ANDROID")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("results", optional = true)..uint32_t("resultsCapacityInput")
    uint32_t("resultsCountOutput")
    nullable..XrRaycastHitResultANDROID.p("results")
}

val XrTrackableObjectANDROID = struct(Module.OPENXR, "XrTrackableObjectANDROID") {
    Expression("#TYPE_TRACKABLE_OBJECT_ANDROID")..XrStructureType("type")
    nullable..opaque_p("next")
    XrTrackingStateANDROID("trackingState")
    XrPosef("centerPose")
    XrExtent3DfEXT("extents")
    XrObjectLabelANDROID("objectLabel")
    XrTime("lastUpdatedTime")
}

val XrTrackableObjectConfigurationANDROID = struct(Module.OPENXR, "XrTrackableObjectConfigurationANDROID") {
    Expression("#TYPE_TRACKABLE_OBJECT_CONFIGURATION_ANDROID")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("activeLabels")..uint32_t("labelCount")
    XrObjectLabelANDROID.const.p("activeLabels")
}

val XrFutureCancelInfoEXT = struct(Module.OPENXR, "XrFutureCancelInfoEXT") {
    Expression("#TYPE_FUTURE_CANCEL_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFutureEXT("future")
}

val XrFuturePollInfoEXT = struct(Module.OPENXR, "XrFuturePollInfoEXT") {
    Expression("#TYPE_FUTURE_POLL_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrFutureEXT("future")
}

val XrFutureCompletionBaseHeaderEXT = struct(Module.OPENXR, "XrFutureCompletionBaseHeaderEXT") {
    XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
}

val XrFuturePollResultEXT = struct(Module.OPENXR, "XrFuturePollResultEXT", mutable = false) {
    Expression("#TYPE_FUTURE_POLL_RESULT_EXT")..XrStructureType("type").mutable()
    PointerSetter(
        "XrFuturePollResultProgressBD",
        prepend = true
    )..nullable..opaque_p("next").mutable()
    XrFutureStateEXT("state")
}

val XrEventDataUserPresenceChangedEXT = struct(Module.OPENXR, "XrEventDataUserPresenceChangedEXT", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrSession("session")
    XrBool32("isUserPresent")
}

val XrSystemUserPresencePropertiesEXT = struct(Module.OPENXR, "XrSystemUserPresencePropertiesEXT", mutable = false) {
    Expression("#TYPE_SYSTEM_USER_PRESENCE_PROPERTIES_EXT")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsUserPresence")
}

val XrSpacesLocateInfoKHR = struct(Module.OPENXR, "XrSpacesLocateInfoKHR", alias = XrSpacesLocateInfo) {
    Expression("#TYPE_SPACES_LOCATE_INFO")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
    AutoSize("spaces")..uint32_t("spaceCount")
    XrSpace.const.p("spaces")
}

val XrSpaceLocationDataKHR = struct(Module.OPENXR, "XrSpaceLocationDataKHR", mutable = false, alias = XrSpaceLocationData) {
    XrSpaceLocationFlags("locationFlags")
    XrPosef("pose")
}

val XrSpaceLocationsKHR = struct(Module.OPENXR, "XrSpaceLocationsKHR", alias = XrSpaceLocations) {
    Expression("#TYPE_SPACE_LOCATIONS")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("locations")..uint32_t("locationCount")
    XrSpaceLocationData.p("locations")
}

val XrSpaceVelocityDataKHR = struct(Module.OPENXR, "XrSpaceVelocityDataKHR", mutable = false, alias = XrSpaceVelocityData) {
    XrSpaceVelocityFlags("velocityFlags")
    XrVector3f("linearVelocity")
    XrVector3f("angularVelocity")
}

val XrSpaceVelocitiesKHR = struct(Module.OPENXR, "XrSpaceVelocitiesKHR", alias = XrSpaceVelocities) {
    Expression("#TYPE_SPACE_VELOCITIES")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("velocities")..uint32_t("velocityCount")
    XrSpaceVelocityData.p("velocities")
}

val XrSystemNotificationsSetInfoML = struct(Module.OPENXR, "XrSystemNotificationsSetInfoML") {
    Expression("#TYPE_SYSTEM_NOTIFICATIONS_SET_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBool32("suppressNotifications")
}

val XrWorldMeshDetectorCreateInfoML = struct(Module.OPENXR, "XrWorldMeshDetectorCreateInfoML") {
    Expression("#TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrWorldMeshBlockStateML = struct(Module.OPENXR, "XrWorldMeshBlockStateML") {
    Expression("#TYPE_WORLD_MESH_BLOCK_STATE_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    XrUuidEXT("uuid")
    XrPosef("meshBoundingBoxCenter")
    XrExtent3DfEXT("meshBoundingBoxExtents")
    XrTime("lastUpdateTime")
    XrWorldMeshBlockStatusML("status")
}

val XrWorldMeshStateRequestInfoML = struct(Module.OPENXR, "XrWorldMeshStateRequestInfoML") {
    Expression("#TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
    XrPosef("boundingBoxCenter")
    XrExtent3DfEXT("boundingBoxExtents")
}

val XrWorldMeshStateRequestCompletionML = struct(Module.OPENXR, "XrWorldMeshStateRequestCompletionML", parentStruct = XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    XrTime("timestamp")
    AutoSize("meshBlockStates", optional = true)..uint32_t("meshBlockStateCapacityInput")
    uint32_t("meshBlockStateCountOutput")
    nullable..XrWorldMeshBlockStateML.p("meshBlockStates")
}

val XrWorldMeshBufferRecommendedSizeInfoML = struct(Module.OPENXR, "XrWorldMeshBufferRecommendedSizeInfoML") {
    Expression("#TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    uint32_t("maxBlockCount")
}

val XrWorldMeshBufferSizeML = struct(Module.OPENXR, "XrWorldMeshBufferSizeML") {
    Expression("#TYPE_WORLD_MESH_BUFFER_SIZE_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    uint32_t("size")
}

val XrWorldMeshBufferML = struct(Module.OPENXR, "XrWorldMeshBufferML") {
    Expression("#TYPE_WORLD_MESH_BUFFER_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("buffer")..uint32_t("bufferSize")
    void.p("buffer")
}

val XrWorldMeshBlockRequestML = struct(Module.OPENXR, "XrWorldMeshBlockRequestML") {
    Expression("#TYPE_WORLD_MESH_BLOCK_REQUEST_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    XrUuidEXT("uuid")
    XrWorldMeshDetectorLodML("lod")
}

val XrWorldMeshGetInfoML = struct(Module.OPENXR, "XrWorldMeshGetInfoML") {
    Expression("#TYPE_WORLD_MESH_GET_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrWorldMeshDetectorFlagsML("flags")
    float("fillHoleLength")
    float("disconnectedComponentArea")
    AutoSize("blocks")..uint32_t("blockCount")
    XrWorldMeshBlockRequestML.p("blocks")
}

val XrWorldMeshBlockML = struct(Module.OPENXR, "XrWorldMeshBlockML") {
    Expression("#TYPE_WORLD_MESH_BLOCK_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    XrUuidEXT("uuid")
    XrWorldMeshBlockResultML("blockResult")
    XrWorldMeshDetectorLodML("lod")
    XrWorldMeshDetectorFlagsML("flags")
    AutoSize("indexBuffer")..uint32_t("indexCount")
    uint16_t.p("indexBuffer")
    AutoSize("vertexBuffer")..uint32_t("vertexCount")
    XrVector3f.p("vertexBuffer")
    AutoSize("normalBuffer")..uint32_t("normalCount")
    XrVector3f.p("normalBuffer")
    AutoSize("confidenceBuffer")..uint32_t("confidenceCount")
    float.p("confidenceBuffer")
}

val XrWorldMeshRequestCompletionInfoML = struct(Module.OPENXR, "XrWorldMeshRequestCompletionInfoML") {
    Expression("#TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("meshSpace")
    XrTime("meshSpaceLocateTime")
}

val XrWorldMeshRequestCompletionML = struct(Module.OPENXR, "XrWorldMeshRequestCompletionML", parentStruct = XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_WORLD_MESH_REQUEST_COMPLETION_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    AutoSize("blocks")..uint32_t("blockCount")
    XrWorldMeshBlockML.p("blocks")
}

val XrSystemFacialExpressionPropertiesML = struct(Module.OPENXR, "XrSystemFacialExpressionPropertiesML", mutable = false) {
    Expression("#TYPE_SYSTEM_FACIAL_EXPRESSION_PROPERTIES_ML")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsFacialExpression")
}

val XrFacialExpressionClientCreateInfoML = struct(Module.OPENXR, "XrFacialExpressionClientCreateInfoML") {
    Expression("#TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("requestedFacialBlendShapes", optional = true)..uint32_t("requestedCount")
    nullable..XrFacialBlendShapeML.const.p("requestedFacialBlendShapes")
}

val XrFacialExpressionBlendShapeGetInfoML = struct(Module.OPENXR, "XrFacialExpressionBlendShapeGetInfoML") {
    Expression("#TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrFacialExpressionBlendShapePropertiesML = struct(Module.OPENXR, "XrFacialExpressionBlendShapePropertiesML") {
    Expression("#TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML")..XrStructureType("type")
    nullable..opaque_p("next")
    XrFacialBlendShapeML("requestedFacialBlendShape")
    float("weight")
    XrFacialExpressionBlendShapePropertiesFlagsML("flags")
    XrTime("time")
}

val XrSystemSimultaneousHandsAndControllersPropertiesMETA = struct(Module.OPENXR, "XrSystemSimultaneousHandsAndControllersPropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_SIMULTANEOUS_HANDS_AND_CONTROLLERS_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsSimultaneousHandsAndControllers")
}

val XrSimultaneousHandsAndControllersTrackingResumeInfoMETA = struct(Module.OPENXR, "XrSimultaneousHandsAndControllersTrackingResumeInfoMETA") {
    Expression("#TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_RESUME_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrSimultaneousHandsAndControllersTrackingPauseInfoMETA = struct(Module.OPENXR, "XrSimultaneousHandsAndControllersTrackingPauseInfoMETA") {
    Expression("#TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_PAUSE_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrColocationDiscoveryStartInfoMETA = struct(Module.OPENXR, "XrColocationDiscoveryStartInfoMETA") {
    Expression("#TYPE_COLOCATION_DISCOVERY_START_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrColocationDiscoveryStopInfoMETA = struct(Module.OPENXR, "XrColocationDiscoveryStopInfoMETA") {
    Expression("#TYPE_COLOCATION_DISCOVERY_STOP_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrColocationAdvertisementStartInfoMETA = struct(Module.OPENXR, "XrColocationAdvertisementStartInfoMETA") {
    Expression("#TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("buffer")..uint32_t("bufferSize")
    uint8_t.p("buffer")
}

val XrColocationAdvertisementStopInfoMETA = struct(Module.OPENXR, "XrColocationAdvertisementStopInfoMETA") {
    Expression("#TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
}

val XrEventDataStartColocationAdvertisementCompleteMETA = struct(Module.OPENXR, "XrEventDataStartColocationAdvertisementCompleteMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("advertisementRequestId")
    XrResult("result")
    XrUuid("advertisementUuid")
}

val XrEventDataStopColocationAdvertisementCompleteMETA = struct(Module.OPENXR, "XrEventDataStopColocationAdvertisementCompleteMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
}

val XrEventDataColocationAdvertisementCompleteMETA = struct(Module.OPENXR, "XrEventDataColocationAdvertisementCompleteMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("advertisementRequestId")
    XrResult("result")
}

val XrEventDataStartColocationDiscoveryCompleteMETA = struct(Module.OPENXR, "XrEventDataStartColocationDiscoveryCompleteMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("discoveryRequestId")
    XrResult("result")
}

val XrEventDataColocationDiscoveryResultMETA = struct(Module.OPENXR, "XrEventDataColocationDiscoveryResultMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    javaImport("static org.lwjgl.openxr.METAColocationDiscovery.*")
    Expression("#TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("discoveryRequestId")
    XrUuid("advertisementUuid")
    AutoSize("buffer")..uint32_t("bufferSize")
    uint8_t("buffer")["XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META"]
}

val XrEventDataColocationDiscoveryCompleteMETA = struct(Module.OPENXR, "XrEventDataColocationDiscoveryCompleteMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("discoveryRequestId")
    XrResult("result")
}

val XrEventDataStopColocationDiscoveryCompleteMETA = struct(Module.OPENXR, "XrEventDataStopColocationDiscoveryCompleteMETA", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_STOP_COLOCATION_DISCOVERY_COMPLETE_META")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrAsyncRequestIdFB("requestId")
    XrResult("result")
}

val XrSystemColocationDiscoveryPropertiesMETA = struct(Module.OPENXR, "XrSystemColocationDiscoveryPropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsColocationDiscovery")
}

val XrSystemSpatialEntityGroupSharingPropertiesMETA = struct(Module.OPENXR, "XrSystemSpatialEntityGroupSharingPropertiesMETA", mutable = false) {
    Expression("#TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsSpatialEntityGroupSharing")
}

val XrShareSpacesRecipientGroupsMETA = struct(Module.OPENXR, "XrShareSpacesRecipientGroupsMETA", parentStruct = XrShareSpacesRecipientBaseHeaderMETA) {
    Expression("#TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("groups")..uint32_t("groupCount")
    XrUuid.p("groups")
}

val XrSpaceGroupUuidFilterInfoMETA = struct(Module.OPENXR, "XrSpaceGroupUuidFilterInfoMETA") {
    Expression("#TYPE_SPACE_GROUP_UUID_FILTER_INFO_META")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrUuid("groupUuid")
}

val XrAnchorSharingInfoANDROID = struct(Module.OPENXR, "XrAnchorSharingInfoANDROID") {
    Expression("#TYPE_ANCHOR_SHARING_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("anchor")
}

val XrAnchorSharingTokenANDROID = struct(Module.OPENXR, "XrAnchorSharingTokenANDROID", mutable = false) {
    Expression("#TYPE_ANCHOR_SHARING_TOKEN_ANDROID")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    AIBinder.p("token")
}

val XrSystemAnchorSharingExportPropertiesANDROID = struct(Module.OPENXR, "XrSystemAnchorSharingExportPropertiesANDROID", mutable = false) {
    Expression("#TYPE_SYSTEM_ANCHOR_SHARING_EXPORT_PROPERTIES_ANDROID")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsAnchorSharingExport")
}

val XrSystemMarkerTrackingPropertiesANDROID = struct(Module.OPENXR, "XrSystemMarkerTrackingPropertiesANDROID", mutable = false) {
    Expression("#TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_ANDROID")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsMarkerTracking")
    XrBool32("supportsMarkerSizeEstimation")
    uint16_t("maxMarkerCount")
}

val XrTrackableMarkerDatabaseEntryANDROID = struct(Module.OPENXR, "XrTrackableMarkerDatabaseEntryANDROID") {
    int32_t("id")
    float("edgeSize")
}

val XrTrackableMarkerDatabaseANDROID = struct(Module.OPENXR, "XrTrackableMarkerDatabaseANDROID") {
    XrTrackableMarkerDictionaryANDROID("dictionary")
    AutoSize("entries", optional = true)..uint32_t("entryCount")
    XrTrackableMarkerDatabaseEntryANDROID.const.p("entries")
}

val XrTrackableMarkerConfigurationANDROID = struct(Module.OPENXR, "XrTrackableMarkerConfigurationANDROID") {
    Expression("#TYPE_TRACKABLE_MARKER_CONFIGURATION_ANDROID")..XrStructureType("type")
    nullable..opaque_p("next")
    XrTrackableMarkerTrackingModeANDROID("trackingMode")
    AutoSize("databases")..uint32_t("databaseCount")
    XrTrackableMarkerDatabaseANDROID.const.p("databases")
}

val XrTrackableMarkerANDROID = struct(Module.OPENXR, "XrTrackableMarkerANDROID") {
    Expression("#TYPE_TRACKABLE_MARKER_ANDROID")..XrStructureType("type")
    nullable..opaque_p("next")
    XrTrackingStateANDROID("trackingState")
    XrTime("lastUpdatedTime")
    XrTrackableMarkerDictionaryANDROID("dictionary")
    int32_t("markerId")
    XrPosef("centerPose")
    XrExtent2Df("extents")
}

val XrSystemImageTrackingPropertiesANDROID = struct(Module.OPENXR, "XrSystemImageTrackingPropertiesANDROID", mutable = false) {
    Expression("#TYPE_SYSTEM_IMAGE_TRACKING_PROPERTIES_ANDROID")..XrStructureType("type").mutable()
    nullable..opaque_p("next").mutable()
    XrBool32("supportsImageTracking")
    XrBool32("supportsPhysicalSizeEstimation")
    uint32_t("maxTrackedImageCount")
    uint32_t("maxLoadedImageCount")
}

val XrTrackableImageDatabaseEntryANDROID = struct(Module.OPENXR, "XrTrackableImageDatabaseEntryANDROID") {
    Expression("#TYPE_TRACKABLE_IMAGE_DATABASE_ENTRY_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTrackableImageTrackingModeANDROID("trackingMode")
    float("physicalWidth")
    uint32_t("imageWidth")
    uint32_t("imageHeight")
    XrTrackableImageFormatANDROID("format")
    AutoSize("buffer")..uint32_t("bufferSize")
    uint8_t.const.p("buffer")
}

val XrTrackableImageDatabaseCreateInfoANDROID = struct(Module.OPENXR, "XrTrackableImageDatabaseCreateInfoANDROID") {
    Expression("#TYPE_TRACKABLE_IMAGE_DATABASE_CREATE_INFO_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("entries")..uint32_t("entryCount")
    XrTrackableImageDatabaseEntryANDROID.const.p("entries")
}

val XrCreateTrackableImageDatabaseCompletionANDROID = struct(Module.OPENXR, "XrCreateTrackableImageDatabaseCompletionANDROID", parentStruct = XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_CREATE_TRACKABLE_IMAGE_DATABASE_COMPLETION_ANDROID")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    XrTrackableImageDatabaseANDROID("database")
}

val XrTrackableImageConfigurationANDROID = struct(Module.OPENXR, "XrTrackableImageConfigurationANDROID") {
    Expression("#TYPE_TRACKABLE_IMAGE_CONFIGURATION_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("databases")..uint32_t("databaseCount")
    XrTrackableImageDatabaseANDROID.const.p("databases")
}

val XrTrackableImageANDROID = struct(Module.OPENXR, "XrTrackableImageANDROID") {
    Expression("#TYPE_TRACKABLE_IMAGE_ANDROID")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrTrackingStateANDROID("trackingState")
    XrTime("lastUpdatedTime")
    XrTrackableImageDatabaseANDROID("database")
    uint32_t("databaseEntryIndex")
    XrPosef("centerPose")
    XrExtent2Df("extents")
}

val XrEventDataImageTrackingLostANDROID = struct(Module.OPENXR, "XrEventDataImageTrackingLostANDROID", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_IMAGE_TRACKING_LOST_ANDROID")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrTime("time")
}

val XrColor3fKHR = struct(Module.OPENXR, "XrColor3fKHR", alias = XrColor3f) {
    float("r")
    float("g")
    float("b")
}

val XrExtent3DfKHR = struct(Module.OPENXR, "XrExtent3DfKHR", alias = XrExtent3Df) {
    float("width")
    float("height")
    float("depth")
}

val XrSpherefKHR = struct(Module.OPENXR, "XrSpherefKHR", alias = XrSpheref) {
    XrPosef("center")
    float("radius")
}

val XrBoxfKHR = struct(Module.OPENXR, "XrBoxfKHR", alias = XrBoxf) {
    XrPosef("center")
    XrExtent3Df("extents")
}

val XrFrustumfKHR = struct(Module.OPENXR, "XrFrustumfKHR", alias = XrFrustumf) {
    XrPosef("pose")
    XrFovf("fov")
    float("nearZ")
    float("farZ")
}

val XrSpatialCapabilityComponentTypesEXT = struct(Module.OPENXR, "XrSpatialCapabilityComponentTypesEXT") {
    Expression("#TYPE_SPATIAL_CAPABILITY_COMPONENT_TYPES_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("componentTypes", optional = true)..uint32_t("componentTypeCapacityInput")
    uint32_t("componentTypeCountOutput")
    nullable..XrSpatialComponentTypeEXT.p("componentTypes")
}

val XrSpatialCapabilityConfigurationBaseHeaderEXT = struct(Module.OPENXR, "XrSpatialCapabilityConfigurationBaseHeaderEXT") {
    XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialCapabilityEXT("capability")
    AutoSize("enabledComponents")..uint32_t("enabledComponentCount")
    XrSpatialComponentTypeEXT.const.p("enabledComponents")
}

val XrSpatialContextCreateInfoEXT = struct(Module.OPENXR, "XrSpatialContextCreateInfoEXT") {
    Expression("#TYPE_SPATIAL_CONTEXT_CREATE_INFO_EXT")..XrStructureType("type")
    PointerSetter(
        "XrSpatialContextPersistenceConfigEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    AutoSize("capabilityConfigs")..uint32_t("capabilityConfigCount")
    XrSpatialCapabilityConfigurationBaseHeaderEXT.const.p.const.p("capabilityConfigs")
}

val XrCreateSpatialContextCompletionEXT = struct(Module.OPENXR, "XrCreateSpatialContextCompletionEXT", parentStruct = XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_CREATE_SPATIAL_CONTEXT_COMPLETION_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    nullable..XrSpatialContextEXT("spatialContext")
}

val XrSpatialDiscoverySnapshotCreateInfoEXT = struct(Module.OPENXR, "XrSpatialDiscoverySnapshotCreateInfoEXT") {
    Expression("#TYPE_SPATIAL_DISCOVERY_SNAPSHOT_CREATE_INFO_EXT")..XrStructureType("type")
    PointerSetter(
        "XrSpatialDiscoveryPersistenceUuidFilterEXT", "XrSpatialFilterTrackingStateEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    AutoSize("componentTypes", optional = true)..uint32_t("componentTypeCount")
    nullable..XrSpatialComponentTypeEXT.const.p("componentTypes")
}

val XrCreateSpatialDiscoverySnapshotCompletionInfoEXT = struct(Module.OPENXR, "XrCreateSpatialDiscoverySnapshotCompletionInfoEXT") {
    Expression("#TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
    XrFutureEXT("future")
}

val XrCreateSpatialDiscoverySnapshotCompletionEXT = struct(Module.OPENXR, "XrCreateSpatialDiscoverySnapshotCompletionEXT", parentStruct = XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    nullable..XrSpatialSnapshotEXT("snapshot")
}

val XrSpatialComponentDataQueryConditionEXT = struct(Module.OPENXR, "XrSpatialComponentDataQueryConditionEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_DATA_QUERY_CONDITION_EXT")..XrStructureType("type")
    PointerSetter(
        "XrSpatialDiscoveryPersistenceUuidFilterEXT", "XrSpatialFilterTrackingStateEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    AutoSize("componentTypes", optional = true)..uint32_t("componentTypeCount")
    nullable..XrSpatialComponentTypeEXT.const.p("componentTypes")
}

val XrSpatialComponentDataQueryResultEXT = struct(Module.OPENXR, "XrSpatialComponentDataQueryResultEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT")..XrStructureType("type")
    PointerSetter(
        "XrSpatialComponentAnchorListEXT", "XrSpatialComponentBounded2DListEXT", "XrSpatialComponentBounded3DListEXT", "XrSpatialComponentMarkerListEXT", "XrSpatialComponentMesh2DListEXT", "XrSpatialComponentMesh3DListEXT", "XrSpatialComponentParentListEXT", "XrSpatialComponentPersistenceListEXT", "XrSpatialComponentPlaneAlignmentListEXT", "XrSpatialComponentPlaneSemanticLabelListEXT", "XrSpatialComponentPolygon2DListEXT",
        prepend = true
    )..nullable..opaque_p("next")
    AutoSize("entityIds", optional = true)..uint32_t("entityIdCapacityInput")
    uint32_t("entityIdCountOutput")
    nullable..XrSpatialEntityIdEXT.p("entityIds")
    AutoSize("entityStates", optional = true)..uint32_t("entityStateCapacityInput")
    uint32_t("entityStateCountOutput")
    nullable..XrSpatialEntityTrackingStateEXT.p("entityStates")
}

val XrSpatialBufferEXT = struct(Module.OPENXR, "XrSpatialBufferEXT") {
    XrSpatialBufferIdEXT("bufferId")
    XrSpatialBufferTypeEXT("bufferType")
}

val XrSpatialBufferGetInfoEXT = struct(Module.OPENXR, "XrSpatialBufferGetInfoEXT") {
    Expression("#TYPE_SPATIAL_BUFFER_GET_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialBufferIdEXT("bufferId")
}

val XrSpatialBounded2DDataEXT = struct(Module.OPENXR, "XrSpatialBounded2DDataEXT") {
    XrPosef("center")
    XrExtent2Df("extents")
}

val XrSpatialComponentBounded2DListEXT = struct(Module.OPENXR, "XrSpatialComponentBounded2DListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_BOUNDED_2D_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("bounds")..uint32_t("boundCount")
    XrSpatialBounded2DDataEXT.p("bounds")
}

val XrSpatialComponentBounded3DListEXT = struct(Module.OPENXR, "XrSpatialComponentBounded3DListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_BOUNDED_3D_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("bounds")..uint32_t("boundCount")
    XrBoxf.p("bounds")
}

val XrSpatialComponentParentListEXT = struct(Module.OPENXR, "XrSpatialComponentParentListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_PARENT_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("parents")..uint32_t("parentCount")
    XrSpatialEntityIdEXT.p("parents")
}

val XrSpatialMeshDataEXT = struct(Module.OPENXR, "XrSpatialMeshDataEXT") {
    XrPosef("origin")
    XrSpatialBufferEXT("vertexBuffer")
    XrSpatialBufferEXT("indexBuffer")
}

val XrSpatialComponentMesh3DListEXT = struct(Module.OPENXR, "XrSpatialComponentMesh3DListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_MESH_3D_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("meshes")..uint32_t("meshCount")
    XrSpatialMeshDataEXT.p("meshes")
}

val XrSpatialEntityFromIdCreateInfoEXT = struct(Module.OPENXR, "XrSpatialEntityFromIdCreateInfoEXT") {
    Expression("#TYPE_SPATIAL_ENTITY_FROM_ID_CREATE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialEntityIdEXT("entityId")
}

val XrSpatialUpdateSnapshotCreateInfoEXT = struct(Module.OPENXR, "XrSpatialUpdateSnapshotCreateInfoEXT") {
    Expression("#TYPE_SPATIAL_UPDATE_SNAPSHOT_CREATE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("entities")..uint32_t("entityCount")
    XrSpatialEntityEXT.const.p("entities")
    AutoSize("componentTypes", optional = true)..uint32_t("componentTypeCount")
    nullable..XrSpatialComponentTypeEXT.const.p("componentTypes")
    XrSpace("baseSpace")
    XrTime("time")
}

val XrEventDataSpatialDiscoveryRecommendedEXT = struct(Module.OPENXR, "XrEventDataSpatialDiscoveryRecommendedEXT", mutable = false, parentStruct = XrEventDataBaseHeader) {
    Expression("#TYPE_EVENT_DATA_SPATIAL_DISCOVERY_RECOMMENDED_EXT")..XrStructureType("type").mutable()
    nullable..opaque_const_p("next").mutable()
    XrSpatialContextEXT("spatialContext")
}

val XrSpatialFilterTrackingStateEXT = struct(Module.OPENXR, "XrSpatialFilterTrackingStateEXT") {
    Expression("#TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialEntityTrackingStateEXT("trackingState")
}

val XrSpatialCapabilityConfigurationPlaneTrackingEXT = struct(Module.OPENXR, "XrSpatialCapabilityConfigurationPlaneTrackingEXT", parentStruct = XrSpatialCapabilityConfigurationBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_CAPABILITY_CONFIGURATION_PLANE_TRACKING_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialCapabilityEXT("capability")
    AutoSize("enabledComponents")..uint32_t("enabledComponentCount")
    XrSpatialComponentTypeEXT.const.p("enabledComponents")
}

val XrSpatialComponentPlaneAlignmentListEXT = struct(Module.OPENXR, "XrSpatialComponentPlaneAlignmentListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("planeAlignments")..uint32_t("planeAlignmentCount")
    XrSpatialPlaneAlignmentEXT.p("planeAlignments")
}

val XrSpatialComponentMesh2DListEXT = struct(Module.OPENXR, "XrSpatialComponentMesh2DListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_MESH_2D_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("meshes")..uint32_t("meshCount")
    XrSpatialMeshDataEXT.p("meshes")
}

val XrSpatialPolygon2DDataEXT = struct(Module.OPENXR, "XrSpatialPolygon2DDataEXT") {
    XrPosef("origin")
    XrSpatialBufferEXT("vertexBuffer")
}

val XrSpatialComponentPolygon2DListEXT = struct(Module.OPENXR, "XrSpatialComponentPolygon2DListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("polygons")..uint32_t("polygonCount")
    XrSpatialPolygon2DDataEXT.p("polygons")
}

val XrSpatialComponentPlaneSemanticLabelListEXT = struct(Module.OPENXR, "XrSpatialComponentPlaneSemanticLabelListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("semanticLabels")..uint32_t("semanticLabelCount")
    XrSpatialPlaneSemanticLabelEXT.p("semanticLabels")
}

val XrSpatialCapabilityConfigurationQrCodeEXT = struct(Module.OPENXR, "XrSpatialCapabilityConfigurationQrCodeEXT", parentStruct = XrSpatialCapabilityConfigurationBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_CAPABILITY_CONFIGURATION_QR_CODE_EXT")..XrStructureType("type")
    PointerSetter(
        "XrSpatialMarkerSizeEXT", "XrSpatialMarkerStaticOptimizationEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrSpatialCapabilityEXT("capability")
    AutoSize("enabledComponents")..uint32_t("enabledComponentCount")
    XrSpatialComponentTypeEXT.const.p("enabledComponents")
}

val XrSpatialCapabilityConfigurationMicroQrCodeEXT = struct(Module.OPENXR, "XrSpatialCapabilityConfigurationMicroQrCodeEXT", parentStruct = XrSpatialCapabilityConfigurationBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_CAPABILITY_CONFIGURATION_MICRO_QR_CODE_EXT")..XrStructureType("type")
    PointerSetter(
        "XrSpatialMarkerSizeEXT", "XrSpatialMarkerStaticOptimizationEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrSpatialCapabilityEXT("capability")
    AutoSize("enabledComponents")..uint32_t("enabledComponentCount")
    XrSpatialComponentTypeEXT.const.p("enabledComponents")
}

val XrSpatialCapabilityConfigurationArucoMarkerEXT = struct(Module.OPENXR, "XrSpatialCapabilityConfigurationArucoMarkerEXT", parentStruct = XrSpatialCapabilityConfigurationBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT")..XrStructureType("type")
    PointerSetter(
        "XrSpatialMarkerSizeEXT", "XrSpatialMarkerStaticOptimizationEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrSpatialCapabilityEXT("capability")
    AutoSize("enabledComponents")..uint32_t("enabledComponentCount")
    XrSpatialComponentTypeEXT.const.p("enabledComponents")
    XrSpatialMarkerArucoDictEXT("arUcoDict")
}

val XrSpatialCapabilityConfigurationAprilTagEXT = struct(Module.OPENXR, "XrSpatialCapabilityConfigurationAprilTagEXT", parentStruct = XrSpatialCapabilityConfigurationBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_CAPABILITY_CONFIGURATION_APRIL_TAG_EXT")..XrStructureType("type")
    PointerSetter(
        "XrSpatialMarkerSizeEXT", "XrSpatialMarkerStaticOptimizationEXT",
        prepend = true
    )..nullable..opaque_const_p("next")
    XrSpatialCapabilityEXT("capability")
    AutoSize("enabledComponents")..uint32_t("enabledComponentCount")
    XrSpatialComponentTypeEXT.const.p("enabledComponents")
    XrSpatialMarkerAprilTagDictEXT("aprilDict")
}

val XrSpatialMarkerSizeEXT = struct(Module.OPENXR, "XrSpatialMarkerSizeEXT") {
    Expression("#TYPE_SPATIAL_MARKER_SIZE_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    float("markerSideLength")
}

val XrSpatialMarkerStaticOptimizationEXT = struct(Module.OPENXR, "XrSpatialMarkerStaticOptimizationEXT") {
    Expression("#TYPE_SPATIAL_MARKER_STATIC_OPTIMIZATION_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrBool32("optimizeForStaticMarker")
}

val XrSpatialMarkerDataEXT = struct(Module.OPENXR, "XrSpatialMarkerDataEXT") {
    XrSpatialCapabilityEXT("capability")
    uint32_t("markerId")
    XrSpatialBufferEXT("data")
}

val XrSpatialComponentMarkerListEXT = struct(Module.OPENXR, "XrSpatialComponentMarkerListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_MARKER_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("markers")..uint32_t("markerCount")
    XrSpatialMarkerDataEXT.p("markers")
}

val XrSpatialCapabilityConfigurationAnchorEXT = struct(Module.OPENXR, "XrSpatialCapabilityConfigurationAnchorEXT", parentStruct = XrSpatialCapabilityConfigurationBaseHeaderEXT) {
    Expression("#TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ANCHOR_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialCapabilityEXT("capability")
    AutoSize("enabledComponents")..uint32_t("enabledComponentCount")
    XrSpatialComponentTypeEXT.const.p("enabledComponents")
}

val XrSpatialComponentAnchorListEXT = struct(Module.OPENXR, "XrSpatialComponentAnchorListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_ANCHOR_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("locations")..uint32_t("locationCount")
    XrPosef.p("locations")
}

val XrSpatialAnchorCreateInfoEXT = struct(Module.OPENXR, "XrSpatialAnchorCreateInfoEXT") {
    Expression("#TYPE_SPATIAL_ANCHOR_CREATE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpace("baseSpace")
    XrTime("time")
    XrPosef("pose")
}

val XrSpatialPersistenceContextCreateInfoEXT = struct(Module.OPENXR, "XrSpatialPersistenceContextCreateInfoEXT") {
    Expression("#TYPE_SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialPersistenceScopeEXT("scope")
}

val XrCreateSpatialPersistenceContextCompletionEXT = struct(Module.OPENXR, "XrCreateSpatialPersistenceContextCompletionEXT", parentStruct = XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_CREATE_SPATIAL_PERSISTENCE_CONTEXT_COMPLETION_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    XrSpatialPersistenceContextResultEXT("createResult")
    XrSpatialPersistenceContextEXT("persistenceContext")
}

val XrSpatialContextPersistenceConfigEXT = struct(Module.OPENXR, "XrSpatialContextPersistenceConfigEXT") {
    Expression("#TYPE_SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("persistenceContexts")..uint32_t("persistenceContextCount")
    XrSpatialPersistenceContextEXT.const.p("persistenceContexts")
}

val XrSpatialDiscoveryPersistenceUuidFilterEXT = struct(Module.OPENXR, "XrSpatialDiscoveryPersistenceUuidFilterEXT") {
    Expression("#TYPE_SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("persistedUuids")..uint32_t("persistedUuidCount")
    XrUuid.const.p("persistedUuids")
}

val XrSpatialPersistenceDataEXT = struct(Module.OPENXR, "XrSpatialPersistenceDataEXT") {
    XrUuid("persistUuid")
    XrSpatialPersistenceStateEXT("persistState")
}

val XrSpatialComponentPersistenceListEXT = struct(Module.OPENXR, "XrSpatialComponentPersistenceListEXT") {
    Expression("#TYPE_SPATIAL_COMPONENT_PERSISTENCE_LIST_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    AutoSize("persistData")..uint32_t("persistDataCount")
    XrSpatialPersistenceDataEXT.p("persistData")
}

val XrSpatialEntityPersistInfoEXT = struct(Module.OPENXR, "XrSpatialEntityPersistInfoEXT") {
    Expression("#TYPE_SPATIAL_ENTITY_PERSIST_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrSpatialContextEXT("spatialContext")
    XrSpatialEntityIdEXT("spatialEntityId")
}

val XrPersistSpatialEntityCompletionEXT = struct(Module.OPENXR, "XrPersistSpatialEntityCompletionEXT", parentStruct = XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_PERSIST_SPATIAL_ENTITY_COMPLETION_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    XrSpatialPersistenceContextResultEXT("persistResult")
    XrUuid("persistUuid")
}

val XrSpatialEntityUnpersistInfoEXT = struct(Module.OPENXR, "XrSpatialEntityUnpersistInfoEXT") {
    Expression("#TYPE_SPATIAL_ENTITY_UNPERSIST_INFO_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    XrUuid("persistUuid")
}

val XrUnpersistSpatialEntityCompletionEXT = struct(Module.OPENXR, "XrUnpersistSpatialEntityCompletionEXT", parentStruct = XrFutureCompletionBaseHeaderEXT) {
    Expression("#TYPE_UNPERSIST_SPATIAL_ENTITY_COMPLETION_EXT")..XrStructureType("type")
    nullable..opaque_p("next")
    XrResult("futureResult")
    XrSpatialPersistenceContextResultEXT("unpersistResult")
}

val XrLoaderInitPropertyValueEXT = struct(Module.OPENXR, "XrLoaderInitPropertyValueEXT") {
    charUTF8.const.p("name")
    charUTF8.const.p("value")
}

val XrLoaderInitInfoPropertiesEXT = struct(Module.OPENXR, "XrLoaderInitInfoPropertiesEXT", parentStruct = XrLoaderInitInfoBaseHeaderKHR) {
    Expression("#TYPE_LOADER_INIT_INFO_PROPERTIES_EXT")..XrStructureType("type")
    nullable..opaque_const_p("next")
    AutoSize("propertyValues")..uint32_t("propertyValueCount")
    XrLoaderInitPropertyValueEXT.const.p("propertyValues")
}