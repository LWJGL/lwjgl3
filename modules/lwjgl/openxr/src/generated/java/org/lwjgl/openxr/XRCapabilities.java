/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.Checks.*;

@SuppressWarnings("SimplifiableIfStatement")
public class XRCapabilities {

    // XR10
    public final long
        xrDestroyInstance,
        xrGetInstanceProperties,
        xrPollEvent,
        xrResultToString,
        xrStructureTypeToString,
        xrGetSystem,
        xrGetSystemProperties,
        xrEnumerateEnvironmentBlendModes,
        xrCreateSession,
        xrDestroySession,
        xrEnumerateReferenceSpaces,
        xrCreateReferenceSpace,
        xrGetReferenceSpaceBoundsRect,
        xrCreateActionSpace,
        xrLocateSpace,
        xrDestroySpace,
        xrEnumerateViewConfigurations,
        xrGetViewConfigurationProperties,
        xrEnumerateViewConfigurationViews,
        xrEnumerateSwapchainFormats,
        xrCreateSwapchain,
        xrDestroySwapchain,
        xrEnumerateSwapchainImages,
        xrAcquireSwapchainImage,
        xrWaitSwapchainImage,
        xrReleaseSwapchainImage,
        xrBeginSession,
        xrEndSession,
        xrRequestExitSession,
        xrWaitFrame,
        xrBeginFrame,
        xrEndFrame,
        xrLocateViews,
        xrStringToPath,
        xrPathToString,
        xrCreateActionSet,
        xrDestroyActionSet,
        xrCreateAction,
        xrDestroyAction,
        xrSuggestInteractionProfileBindings,
        xrAttachSessionActionSets,
        xrGetCurrentInteractionProfile,
        xrGetActionStateBoolean,
        xrGetActionStateFloat,
        xrGetActionStateVector2f,
        xrGetActionStatePose,
        xrSyncActions,
        xrEnumerateBoundSourcesForAction,
        xrGetInputSourceLocalizedName,
        xrApplyHapticFeedback,
        xrStopHapticFeedback;

    // XR11
    public final long
        xrLocateSpaces;

    // ALMALENCE_digital_lens_control
    public final long
        xrSetDigitalLensControlALMALENCE;

    // ANDROID_anchor_sharing_export
    public final long
        xrShareAnchorANDROID,
        xrUnshareAnchorANDROID;

    // ANDROID_composition_layer_passthrough_mesh
    public final long
        xrCreatePassthroughLayerANDROID,
        xrDestroyPassthroughLayerANDROID,
        xrSetPassthroughLayerMeshANDROID;

    // ANDROID_device_anchor_persistence
    public final long
        xrEnumerateSupportedPersistenceAnchorTypesANDROID,
        xrCreateDeviceAnchorPersistenceANDROID,
        xrDestroyDeviceAnchorPersistenceANDROID,
        xrPersistAnchorANDROID,
        xrGetAnchorPersistStateANDROID,
        xrCreatePersistedAnchorSpaceANDROID,
        xrEnumeratePersistedAnchorsANDROID,
        xrUnpersistAnchorANDROID;

    // ANDROID_eye_tracking
    public final long
        xrCreateEyeTrackerANDROID,
        xrDestroyEyeTrackerANDROID,
        xrGetFineTrackingEyesInfoANDROID,
        xrGetCoarseTrackingEyesInfoANDROID;

    // ANDROID_face_tracking
    public final long
        xrCreateFaceTrackerANDROID,
        xrDestroyFaceTrackerANDROID,
        xrGetFaceStateANDROID,
        xrGetFaceCalibrationStateANDROID;

    // ANDROID_light_estimation
    public final long
        xrCreateLightEstimatorANDROID,
        xrDestroyLightEstimatorANDROID,
        xrGetLightEstimateANDROID;

    // ANDROID_passthrough_camera_state
    public final long
        xrGetPassthroughCameraStateANDROID;

    // ANDROID_performance_metrics
    public final long
        xrEnumeratePerformanceMetricsCounterPathsANDROID,
        xrSetPerformanceMetricsStateANDROID,
        xrGetPerformanceMetricsStateANDROID,
        xrQueryPerformanceMetricsCounterANDROID;

    // ANDROID_raycast
    public final long
        xrEnumerateRaycastSupportedTrackableTypesANDROID,
        xrRaycastANDROID;

    // ANDROID_scene_meshing
    public final long
        xrEnumerateSupportedSemanticLabelSetsANDROID,
        xrCreateSceneMeshingTrackerANDROID,
        xrDestroySceneMeshingTrackerANDROID,
        xrCreateSceneMeshSnapshotANDROID,
        xrDestroySceneMeshSnapshotANDROID,
        xrGetAllSubmeshStatesANDROID,
        xrGetSubmeshDataANDROID;

    // ANDROID_spatial_anchor_space
    public final long
        xrCreateSpatialAnchorSpaceANDROID,
        xrCreateSpatialAnchorSpaceFromIdANDROID;

    // ANDROID_spatial_discovery_raycast
    public final long
        xrCreateSpatialRaycastSnapshotANDROID;

    // ANDROID_spatial_entity_bound_anchor
    public final long
        xrEnumerateSpatialAnchorAttachableComponentsANDROID;

    // ANDROID_trackables
    public final long
        xrEnumerateSupportedTrackableTypesANDROID,
        xrEnumerateSupportedAnchorTrackableTypesANDROID,
        xrCreateTrackableTrackerANDROID,
        xrDestroyTrackableTrackerANDROID,
        xrGetAllTrackablesANDROID,
        xrGetTrackablePlaneANDROID,
        xrCreateAnchorSpaceANDROID;

    // ANDROID_trackables_image
    public final long
        xrCreateTrackableImageDatabaseAsyncANDROID,
        xrCreateTrackableImageDatabaseCompleteANDROID,
        xrDestroyTrackableImageDatabaseANDROID,
        xrAddTrackableImageDatabaseANDROID,
        xrRemoveTrackableImageDatabaseANDROID,
        xrGetTrackableImageANDROID;

    // ANDROID_trackables_marker
    public final long
        xrGetTrackableMarkerANDROID;

    // ANDROID_trackables_object
    public final long
        xrGetTrackableObjectANDROID;

    // ANDROID_trackables_qr_code
    public final long
        xrGetTrackableQrCodeANDROID;

    // BD_body_tracking
    public final long
        xrCreateBodyTrackerBD,
        xrDestroyBodyTrackerBD,
        xrLocateBodyJointsBD;

    // BD_facial_simulation
    public final long
        xrEnumerateFacialSimulationModesBD,
        xrCreateFaceTrackerBD,
        xrDestroyFaceTrackerBD,
        xrGetFacialSimulationDataBD,
        xrSetFacialSimulationModeBD,
        xrGetFacialSimulationModeBD;

    // BD_spatial_anchor
    public final long
        xrCreateSpatialAnchorAsyncBD,
        xrCreateSpatialAnchorCompleteBD,
        xrPersistSpatialAnchorAsyncBD,
        xrPersistSpatialAnchorCompleteBD,
        xrUnpersistSpatialAnchorAsyncBD,
        xrUnpersistSpatialAnchorCompleteBD;

    // BD_spatial_anchor_sharing
    public final long
        xrShareSpatialAnchorAsyncBD,
        xrShareSpatialAnchorCompleteBD,
        xrDownloadSharedSpatialAnchorAsyncBD,
        xrDownloadSharedSpatialAnchorCompleteBD;

    // BD_spatial_audio_rendering
    public final long
        xrEnumerateSupportedAudioSampleRateBD,
        xrQueryFramesPerBufferRangeBD,
        xrCreateSpatialAudioRendererBD,
        xrDestroySpatialAudioRendererBD,
        xrCreateSoundObstacleMaterialBD,
        xrUpdateSoundObstacleMaterialConfigBD,
        xrDestroySoundObstacleMaterialBD,
        xrCreateSoundObstacleBD,
        xrUpdateSoundObstacleConfigBD,
        xrDestroySoundObstacleBD,
        xrCreateSoundObjectBD,
        xrUpdateSoundObjectConfigBD,
        xrSubmitSoundObjectBufferBD,
        xrDestroySoundObjectBD,
        xrCreateSoundFieldBD,
        xrUpdateSoundFieldConfigBD,
        xrSubmitSoundFieldBufferBD,
        xrDestroySoundFieldBD,
        xrWaitAudioPeriodBD,
        xrEndAudioPeriodBD;

    // BD_spatial_scene
    public final long
        xrCaptureSceneAsyncBD,
        xrCaptureSceneCompleteBD;

    // BD_spatial_sensing
    public final long
        xrEnumerateSpatialEntityComponentTypesBD,
        xrGetSpatialEntityUuidBD,
        xrGetSpatialEntityComponentDataBD,
        xrCreateSenseDataProviderBD,
        xrStartSenseDataProviderAsyncBD,
        xrStartSenseDataProviderCompleteBD,
        xrGetSenseDataProviderStateBD,
        xrQuerySenseDataAsyncBD,
        xrQuerySenseDataCompleteBD,
        xrDestroySenseDataSnapshotBD,
        xrGetQueriedSenseDataBD,
        xrStopSenseDataProviderBD,
        xrDestroySenseDataProviderBD,
        xrCreateSpatialEntityAnchorBD,
        xrDestroyAnchorBD,
        xrGetAnchorUuidBD,
        xrCreateAnchorSpaceBD;

    // EXT_conformance_automation
    public final long
        xrSetInputDeviceActiveEXT,
        xrSetInputDeviceStateBoolEXT,
        xrSetInputDeviceStateFloatEXT,
        xrSetInputDeviceStateVector2fEXT,
        xrSetInputDeviceLocationEXT;

    // EXT_debug_utils
    public final long
        xrSetDebugUtilsObjectNameEXT,
        xrCreateDebugUtilsMessengerEXT,
        xrDestroyDebugUtilsMessengerEXT,
        xrSubmitDebugUtilsMessageEXT,
        xrSessionBeginDebugUtilsLabelRegionEXT,
        xrSessionEndDebugUtilsLabelRegionEXT,
        xrSessionInsertDebugUtilsLabelEXT;

    // EXT_future
    public final long
        xrPollFutureEXT,
        xrCancelFutureEXT;

    // EXT_hand_tracking
    public final long
        xrCreateHandTrackerEXT,
        xrDestroyHandTrackerEXT,
        xrLocateHandJointsEXT;

    // EXT_interaction_render_model
    public final long
        xrEnumerateInteractionRenderModelIdsEXT,
        xrEnumerateRenderModelSubactionPathsEXT,
        xrGetRenderModelPoseTopLevelUserPathEXT;

    // EXT_performance_settings
    public final long
        xrPerfSettingsSetPerformanceLevelEXT;

    // EXT_plane_detection
    public final long
        xrCreatePlaneDetectorEXT,
        xrDestroyPlaneDetectorEXT,
        xrBeginPlaneDetectionEXT,
        xrGetPlaneDetectionStateEXT,
        xrGetPlaneDetectionsEXT,
        xrGetPlanePolygonBufferEXT;

    // EXT_render_model
    public final long
        xrCreateRenderModelEXT,
        xrDestroyRenderModelEXT,
        xrGetRenderModelPropertiesEXT,
        xrCreateRenderModelSpaceEXT,
        xrCreateRenderModelAssetEXT,
        xrDestroyRenderModelAssetEXT,
        xrGetRenderModelAssetDataEXT,
        xrGetRenderModelAssetPropertiesEXT,
        xrGetRenderModelStateEXT;

    // EXT_spatial_anchor
    public final long
        xrCreateSpatialAnchorEXT;

    // EXT_spatial_entity
    public final long
        xrEnumerateSpatialCapabilitiesEXT,
        xrEnumerateSpatialCapabilityComponentTypesEXT,
        xrEnumerateSpatialCapabilityFeaturesEXT,
        xrCreateSpatialContextAsyncEXT,
        xrCreateSpatialContextCompleteEXT,
        xrDestroySpatialContextEXT,
        xrCreateSpatialDiscoverySnapshotAsyncEXT,
        xrCreateSpatialDiscoverySnapshotCompleteEXT,
        xrQuerySpatialComponentDataEXT,
        xrDestroySpatialSnapshotEXT,
        xrCreateSpatialEntityFromIdEXT,
        xrDestroySpatialEntityEXT,
        xrCreateSpatialUpdateSnapshotEXT,
        xrGetSpatialBufferStringEXT,
        xrGetSpatialBufferUint8EXT,
        xrGetSpatialBufferUint16EXT,
        xrGetSpatialBufferUint32EXT,
        xrGetSpatialBufferFloatEXT,
        xrGetSpatialBufferVector2fEXT,
        xrGetSpatialBufferVector3fEXT;

    // EXT_spatial_persistence
    public final long
        xrEnumerateSpatialPersistenceScopesEXT,
        xrCreateSpatialPersistenceContextAsyncEXT,
        xrCreateSpatialPersistenceContextCompleteEXT,
        xrDestroySpatialPersistenceContextEXT;

    // EXT_spatial_persistence_operations
    public final long
        xrPersistSpatialEntityAsyncEXT,
        xrPersistSpatialEntityCompleteEXT,
        xrUnpersistSpatialEntityAsyncEXT,
        xrUnpersistSpatialEntityCompleteEXT;

    // EXT_stationary_reference_space
    public final long
        xrGetStationaryReferenceSpaceGenerationIdEXT;

    // EXT_thermal_query
    public final long
        xrThermalGetTemperatureTrendEXT;

    // FB_body_tracking
    public final long
        xrCreateBodyTrackerFB,
        xrDestroyBodyTrackerFB,
        xrLocateBodyJointsFB,
        xrGetBodySkeletonFB;

    // FB_color_space
    public final long
        xrEnumerateColorSpacesFB,
        xrSetColorSpaceFB;

    // FB_display_refresh_rate
    public final long
        xrEnumerateDisplayRefreshRatesFB,
        xrGetDisplayRefreshRateFB,
        xrRequestDisplayRefreshRateFB;

    // FB_eye_tracking_social
    public final long
        xrCreateEyeTrackerFB,
        xrDestroyEyeTrackerFB,
        xrGetEyeGazesFB;

    // FB_face_tracking
    public final long
        xrCreateFaceTrackerFB,
        xrDestroyFaceTrackerFB,
        xrGetFaceExpressionWeightsFB;

    // FB_face_tracking2
    public final long
        xrCreateFaceTracker2FB,
        xrDestroyFaceTracker2FB,
        xrGetFaceExpressionWeights2FB;

    // FB_foveation
    public final long
        xrCreateFoveationProfileFB,
        xrDestroyFoveationProfileFB;

    // FB_hand_tracking_mesh
    public final long
        xrGetHandMeshFB;

    // FB_haptic_pcm
    public final long
        xrGetDeviceSampleRateFB;

    // FB_keyboard_tracking
    public final long
        xrQuerySystemTrackedKeyboardFB,
        xrCreateKeyboardSpaceFB;

    // FB_passthrough
    public final long
        xrCreatePassthroughFB,
        xrDestroyPassthroughFB,
        xrPassthroughStartFB,
        xrPassthroughPauseFB,
        xrCreatePassthroughLayerFB,
        xrDestroyPassthroughLayerFB,
        xrPassthroughLayerPauseFB,
        xrPassthroughLayerResumeFB,
        xrPassthroughLayerSetStyleFB,
        xrCreateGeometryInstanceFB,
        xrDestroyGeometryInstanceFB,
        xrGeometryInstanceSetTransformFB;

    // FB_passthrough_keyboard_hands
    public final long
        xrPassthroughLayerSetKeyboardHandsIntensityFB;

    // FB_render_model
    public final long
        xrEnumerateRenderModelPathsFB,
        xrGetRenderModelPropertiesFB,
        xrLoadRenderModelFB;

    // FB_scene
    public final long
        xrGetSpaceBoundingBox2DFB,
        xrGetSpaceBoundingBox3DFB,
        xrGetSpaceSemanticLabelsFB,
        xrGetSpaceBoundary2DFB,
        xrGetSpaceRoomLayoutFB;

    // FB_scene_capture
    public final long
        xrRequestSceneCaptureFB;

    // FB_spatial_entity
    public final long
        xrCreateSpatialAnchorFB,
        xrGetSpaceUuidFB,
        xrEnumerateSpaceSupportedComponentsFB,
        xrSetSpaceComponentStatusFB,
        xrGetSpaceComponentStatusFB;

    // FB_spatial_entity_container
    public final long
        xrGetSpaceContainerFB;

    // FB_spatial_entity_query
    public final long
        xrQuerySpacesFB,
        xrRetrieveSpaceQueryResultsFB;

    // FB_spatial_entity_sharing
    public final long
        xrShareSpacesFB;

    // FB_spatial_entity_storage
    public final long
        xrSaveSpaceFB,
        xrEraseSpaceFB;

    // FB_spatial_entity_storage_batch
    public final long
        xrSaveSpaceListFB;

    // FB_spatial_entity_user
    public final long
        xrCreateSpaceUserFB,
        xrGetSpaceUserIdFB,
        xrDestroySpaceUserFB;

    // FB_swapchain_update_state
    public final long
        xrUpdateSwapchainFB,
        xrGetSwapchainStateFB;

    // FB_triangle_mesh
    public final long
        xrCreateTriangleMeshFB,
        xrDestroyTriangleMeshFB,
        xrTriangleMeshGetVertexBufferFB,
        xrTriangleMeshGetIndexBufferFB,
        xrTriangleMeshBeginUpdateFB,
        xrTriangleMeshEndUpdateFB,
        xrTriangleMeshBeginVertexBufferUpdateFB,
        xrTriangleMeshEndVertexBufferUpdateFB;

    // HTC_anchor
    public final long
        xrCreateSpatialAnchorHTC,
        xrGetSpatialAnchorNameHTC;

    // HTC_body_tracking
    public final long
        xrCreateBodyTrackerHTC,
        xrDestroyBodyTrackerHTC,
        xrLocateBodyJointsHTC,
        xrGetBodySkeletonHTC;

    // HTC_facial_tracking
    public final long
        xrCreateFacialTrackerHTC,
        xrDestroyFacialTrackerHTC,
        xrGetFacialExpressionsHTC;

    // HTC_foveation
    public final long
        xrApplyFoveationHTC;

    // HTC_passthrough
    public final long
        xrCreatePassthroughHTC,
        xrDestroyPassthroughHTC;

    // HTCX_vive_tracker_interaction
    public final long
        xrEnumerateViveTrackerPathsHTCX;

    // KHR_convert_timespec_time
    public final long
        xrConvertTimespecTimeToTimeKHR,
        xrConvertTimeToTimespecTimeKHR;

    // KHR_extended_struct_name_lengths
    public final long
        xrStructureTypeToString2KHR;

    // KHR_locate_spaces
    public final long
        xrLocateSpacesKHR;

    // KHR_opengl_enable
    public final long
        xrGetOpenGLGraphicsRequirementsKHR;

    // KHR_visibility_mask
    public final long
        xrGetVisibilityMaskKHR;

    // KHR_vulkan_enable
    public final long
        xrGetVulkanInstanceExtensionsKHR,
        xrGetVulkanDeviceExtensionsKHR,
        xrGetVulkanGraphicsDeviceKHR,
        xrGetVulkanGraphicsRequirementsKHR;

    // KHR_vulkan_enable2
    public final long
        xrCreateVulkanInstanceKHR,
        xrCreateVulkanDeviceKHR,
        xrGetVulkanGraphicsDevice2KHR,
        xrGetVulkanGraphicsRequirements2KHR;

    // KHR_win32_convert_performance_counter_time
    public final long
        xrConvertWin32PerformanceCounterToTimeKHR,
        xrConvertTimeToWin32PerformanceCounterKHR;

    // META_body_tracking_calibration
    public final long
        xrSuggestBodyTrackingCalibrationOverrideMETA,
        xrResetBodyTrackingCalibrationMETA;

    // META_body_tracking_fidelity
    public final long
        xrRequestBodyTrackingFidelityMETA;

    // META_boundary_visibility
    public final long
        xrRequestBoundaryVisibilityMETA;

    // META_colocation_discovery
    public final long
        xrStartColocationDiscoveryMETA,
        xrStopColocationDiscoveryMETA,
        xrStartColocationAdvertisementMETA,
        xrStopColocationAdvertisementMETA;

    // META_environment_depth
    public final long
        xrCreateEnvironmentDepthProviderMETA,
        xrDestroyEnvironmentDepthProviderMETA,
        xrStartEnvironmentDepthProviderMETA,
        xrStopEnvironmentDepthProviderMETA,
        xrCreateEnvironmentDepthSwapchainMETA,
        xrDestroyEnvironmentDepthSwapchainMETA,
        xrEnumerateEnvironmentDepthSwapchainImagesMETA,
        xrGetEnvironmentDepthSwapchainStateMETA,
        xrAcquireEnvironmentDepthImageMETA,
        xrSetEnvironmentDepthHandRemovalMETA;

    // META_environment_raycast
    public final long
        xrCreateEnvironmentRaycasterAsyncMETA,
        xrCreateEnvironmentRaycasterCompleteMETA,
        xrDestroyEnvironmentRaycasterMETA,
        xrPerformEnvironmentRaycastMETA;

    // META_foveation_eye_tracked
    public final long
        xrGetFoveationEyeTrackedStateMETA;

    // META_passthrough_color_lut
    public final long
        xrCreatePassthroughColorLutMETA,
        xrDestroyPassthroughColorLutMETA,
        xrUpdatePassthroughColorLutMETA;

    // META_passthrough_preferences
    public final long
        xrGetPassthroughPreferencesMETA;

    // META_performance_metrics
    public final long
        xrEnumeratePerformanceMetricsCounterPathsMETA,
        xrSetPerformanceMetricsStateMETA,
        xrGetPerformanceMetricsStateMETA,
        xrQueryPerformanceMetricsCounterMETA;

    // META_recommended_layer_resolution
    public final long
        xrGetRecommendedLayerResolutionMETA;

    // META_simultaneous_hands_and_controllers
    public final long
        xrResumeSimultaneousHandsAndControllersTrackingMETA,
        xrPauseSimultaneousHandsAndControllersTrackingMETA;

    // META_spatial_entity_discovery
    public final long
        xrDiscoverSpacesMETA,
        xrRetrieveSpaceDiscoveryResultsMETA;

    // META_spatial_entity_mesh
    public final long
        xrGetSpaceTriangleMeshMETA;

    // META_spatial_entity_persistence
    public final long
        xrSaveSpacesMETA,
        xrEraseSpacesMETA;

    // META_spatial_entity_room_mesh
    public final long
        xrGetSpaceRoomMeshMETA,
        xrGetSpaceRoomMeshFaceIndicesMETA;

    // META_spatial_entity_sharing
    public final long
        xrShareSpacesMETA;

    // META_tile_properties_hint
    public final long
        xrSetTilePropertiesHintMETA;

    // META_virtual_keyboard
    public final long
        xrCreateVirtualKeyboardMETA,
        xrDestroyVirtualKeyboardMETA,
        xrCreateVirtualKeyboardSpaceMETA,
        xrSuggestVirtualKeyboardLocationMETA,
        xrGetVirtualKeyboardScaleMETA,
        xrSetVirtualKeyboardModelVisibilityMETA,
        xrGetVirtualKeyboardModelAnimationStatesMETA,
        xrGetVirtualKeyboardDirtyTexturesMETA,
        xrGetVirtualKeyboardTextureDataMETA,
        xrSendVirtualKeyboardInputMETA,
        xrChangeVirtualKeyboardTextContextMETA;

    // ML_compat
    public final long
        xrCreateSpaceFromCoordinateFrameUIDML;

    // ML_facial_expression
    public final long
        xrCreateFacialExpressionClientML,
        xrDestroyFacialExpressionClientML,
        xrGetFacialExpressionBlendShapePropertiesML;

    // ML_localization_map
    public final long
        xrEnableLocalizationEventsML,
        xrQueryLocalizationMapsML,
        xrRequestMapLocalizationML,
        xrImportLocalizationMapML,
        xrCreateExportedLocalizationMapML,
        xrDestroyExportedLocalizationMapML,
        xrGetExportedLocalizationMapDataML;

    // ML_marker_understanding
    public final long
        xrCreateMarkerDetectorML,
        xrDestroyMarkerDetectorML,
        xrSnapshotMarkerDetectorML,
        xrGetMarkerDetectorStateML,
        xrGetMarkersML,
        xrGetMarkerReprojectionErrorML,
        xrGetMarkerLengthML,
        xrGetMarkerNumberML,
        xrGetMarkerStringML,
        xrCreateMarkerSpaceML;

    // ML_spatial_anchors
    public final long
        xrCreateSpatialAnchorsAsyncML,
        xrCreateSpatialAnchorsCompleteML,
        xrGetSpatialAnchorStateML;

    // ML_spatial_anchors_storage
    public final long
        xrCreateSpatialAnchorsStorageML,
        xrDestroySpatialAnchorsStorageML,
        xrQuerySpatialAnchorsAsyncML,
        xrQuerySpatialAnchorsCompleteML,
        xrPublishSpatialAnchorsAsyncML,
        xrPublishSpatialAnchorsCompleteML,
        xrDeleteSpatialAnchorsAsyncML,
        xrDeleteSpatialAnchorsCompleteML,
        xrUpdateSpatialAnchorsExpirationAsyncML,
        xrUpdateSpatialAnchorsExpirationCompleteML;

    // ML_system_notifications
    public final long
        xrSetSystemNotificationsML;

    // ML_user_calibration
    public final long
        xrEnableUserCalibrationEventsML;

    // ML_world_mesh_detection
    public final long
        xrCreateWorldMeshDetectorML,
        xrDestroyWorldMeshDetectorML,
        xrRequestWorldMeshStateAsyncML,
        xrRequestWorldMeshStateCompleteML,
        xrGetWorldMeshBufferRecommendSizeML,
        xrAllocateWorldMeshBufferML,
        xrFreeWorldMeshBufferML,
        xrRequestWorldMeshAsyncML,
        xrRequestWorldMeshCompleteML;

    // MNDX_force_feedback_curl
    public final long
        xrApplyForceFeedbackCurlMNDX;

    // MSFT_composition_layer_reprojection
    public final long
        xrEnumerateReprojectionModesMSFT;

    // MSFT_controller_model
    public final long
        xrGetControllerModelKeyMSFT,
        xrLoadControllerModelMSFT,
        xrGetControllerModelPropertiesMSFT,
        xrGetControllerModelStateMSFT;

    // MSFT_hand_tracking_mesh
    public final long
        xrCreateHandMeshSpaceMSFT,
        xrUpdateHandMeshMSFT;

    // MSFT_perception_anchor_interop
    public final long
        xrCreateSpatialAnchorFromPerceptionAnchorMSFT,
        xrTryGetPerceptionAnchorFromSpatialAnchorMSFT;

    // MSFT_scene_marker
    public final long
        xrGetSceneMarkerRawDataMSFT,
        xrGetSceneMarkerDecodedStringMSFT;

    // MSFT_scene_understanding
    public final long
        xrEnumerateSceneComputeFeaturesMSFT,
        xrCreateSceneObserverMSFT,
        xrDestroySceneObserverMSFT,
        xrCreateSceneMSFT,
        xrDestroySceneMSFT,
        xrComputeNewSceneMSFT,
        xrGetSceneComputeStateMSFT,
        xrGetSceneComponentsMSFT,
        xrLocateSceneComponentsMSFT,
        xrGetSceneMeshBuffersMSFT;

    // MSFT_scene_understanding_serialization
    public final long
        xrDeserializeSceneMSFT,
        xrGetSerializedSceneFragmentDataMSFT;

    // MSFT_spatial_anchor
    public final long
        xrCreateSpatialAnchorMSFT,
        xrCreateSpatialAnchorSpaceMSFT,
        xrDestroySpatialAnchorMSFT;

    // MSFT_spatial_anchor_persistence
    public final long
        xrCreateSpatialAnchorStoreConnectionMSFT,
        xrDestroySpatialAnchorStoreConnectionMSFT,
        xrPersistSpatialAnchorMSFT,
        xrEnumeratePersistedSpatialAnchorNamesMSFT,
        xrCreateSpatialAnchorFromPersistedNameMSFT,
        xrUnpersistSpatialAnchorMSFT,
        xrClearSpatialAnchorStoreMSFT;

    // MSFT_spatial_graph_bridge
    public final long
        xrCreateSpatialGraphNodeSpaceMSFT,
        xrTryCreateSpatialGraphStaticNodeBindingMSFT,
        xrDestroySpatialGraphNodeBindingMSFT,
        xrGetSpatialGraphNodeBindingPropertiesMSFT;

    // OCULUS_audio_device_guid
    public final long
        xrGetAudioOutputDeviceGuidOculus,
        xrGetAudioInputDeviceGuidOculus;

    // OCULUS_external_camera
    public final long
        xrEnumerateExternalCamerasOCULUS;

    // QCOM_hand_tracking_gesture
    public final long
        xrGetHandGestureQCOM;

    // QCOM_tracking_optimization_settings
    public final long
        xrSetTrackingOptimizationSettingsHintQCOM;

    // VARJO_environment_depth_estimation
    public final long
        xrSetEnvironmentDepthEstimationVARJO;

    // VARJO_marker_tracking
    public final long
        xrSetMarkerTrackingVARJO,
        xrSetMarkerTrackingTimeoutVARJO,
        xrSetMarkerTrackingPredictionVARJO,
        xrGetMarkerSizeVARJO,
        xrCreateMarkerSpaceVARJO;

    // VARJO_view_offset
    public final long
        xrSetViewOffsetVARJO;

    /** The OpenXR API version number. */
    public final long apiVersion;

    /** When true, {@code XR10} is supported. */
    public final boolean OpenXR10;
    /** When true, {@code XR11} is supported. */
    public final boolean OpenXR11;
    /** When true, {@code ALMALENCE_digital_lens_control} is supported. */
    public final boolean XR_ALMALENCE_digital_lens_control;
    /** When true, {@code ANDROID_anchor_sharing_export} is supported. */
    public final boolean XR_ANDROID_anchor_sharing_export;
    /** When true, {@code ANDROID_composition_layer_passthrough_mesh} is supported. */
    public final boolean XR_ANDROID_composition_layer_passthrough_mesh;
    /** When true, {@code ANDROID_device_anchor_persistence} is supported. */
    public final boolean XR_ANDROID_device_anchor_persistence;
    /** When true, {@code ANDROID_eye_tracking} is supported. */
    public final boolean XR_ANDROID_eye_tracking;
    /** When true, {@code ANDROID_face_tracking} is supported. */
    public final boolean XR_ANDROID_face_tracking;
    /** When true, {@code ANDROID_light_estimation} is supported. */
    public final boolean XR_ANDROID_light_estimation;
    /** When true, {@code ANDROID_mouse_interaction} is supported. */
    public final boolean XR_ANDROID_mouse_interaction;
    /** When true, {@code ANDROID_passthrough_camera_state} is supported. */
    public final boolean XR_ANDROID_passthrough_camera_state;
    /** When true, {@code ANDROID_performance_metrics} is supported. */
    public final boolean XR_ANDROID_performance_metrics;
    /** When true, {@code ANDROID_raycast} is supported. */
    public final boolean XR_ANDROID_raycast;
    /** When true, {@code ANDROID_recommended_resolution} is supported. */
    public final boolean XR_ANDROID_recommended_resolution;
    /** When true, {@code ANDROID_scene_meshing} is supported. */
    public final boolean XR_ANDROID_scene_meshing;
    /** When true, {@code ANDROID_spatial_anchor_space} is supported. */
    public final boolean XR_ANDROID_spatial_anchor_space;
    /** When true, {@code ANDROID_spatial_component_subsumed_by} is supported. */
    public final boolean XR_ANDROID_spatial_component_subsumed_by;
    /** When true, {@code ANDROID_spatial_discovery_raycast} is supported. */
    public final boolean XR_ANDROID_spatial_discovery_raycast;
    /** When true, {@code ANDROID_spatial_entity_bound_anchor} is supported. */
    public final boolean XR_ANDROID_spatial_entity_bound_anchor;
    /** When true, {@code ANDROID_spatial_object_tracking} is supported. */
    public final boolean XR_ANDROID_spatial_object_tracking;
    /** When true, {@code ANDROID_trackables} is supported. */
    public final boolean XR_ANDROID_trackables;
    /** When true, {@code ANDROID_trackables_image} is supported. */
    public final boolean XR_ANDROID_trackables_image;
    /** When true, {@code ANDROID_trackables_marker} is supported. */
    public final boolean XR_ANDROID_trackables_marker;
    /** When true, {@code ANDROID_trackables_object} is supported. */
    public final boolean XR_ANDROID_trackables_object;
    /** When true, {@code ANDROID_trackables_qr_code} is supported. */
    public final boolean XR_ANDROID_trackables_qr_code;
    /** When true, {@code ANDROID_unbounded_reference_space} is supported. */
    public final boolean XR_ANDROID_unbounded_reference_space;
    /** When true, {@code BD_body_tracking} is supported. */
    public final boolean XR_BD_body_tracking;
    /** When true, {@code BD_controller_interaction} is supported. */
    public final boolean XR_BD_controller_interaction;
    /** When true, {@code BD_facial_simulation} is supported. */
    public final boolean XR_BD_facial_simulation;
    /** When true, {@code BD_future_progress} is supported. */
    public final boolean XR_BD_future_progress;
    /** When true, {@code BD_spatial_anchor} is supported. */
    public final boolean XR_BD_spatial_anchor;
    /** When true, {@code BD_spatial_anchor_sharing} is supported. */
    public final boolean XR_BD_spatial_anchor_sharing;
    /** When true, {@code BD_spatial_audio_rendering} is supported. */
    public final boolean XR_BD_spatial_audio_rendering;
    /** When true, {@code BD_spatial_mesh} is supported. */
    public final boolean XR_BD_spatial_mesh;
    /** When true, {@code BD_spatial_plane} is supported. */
    public final boolean XR_BD_spatial_plane;
    /** When true, {@code BD_spatial_scene} is supported. */
    public final boolean XR_BD_spatial_scene;
    /** When true, {@code BD_spatial_sensing} is supported. */
    public final boolean XR_BD_spatial_sensing;
    /** When true, {@code BD_ultra_controller_interaction} is supported. */
    public final boolean XR_BD_ultra_controller_interaction;
    /** When true, {@code EPIC_view_configuration_fov} is supported. */
    public final boolean XR_EPIC_view_configuration_fov;
    /** When true, {@code EXT_active_action_set_priority} is supported. */
    public final boolean XR_EXT_active_action_set_priority;
    /** When true, {@code EXT_composition_layer_inverted_alpha} is supported. */
    public final boolean XR_EXT_composition_layer_inverted_alpha;
    /** When true, {@code EXT_conformance_automation} is supported. */
    public final boolean XR_EXT_conformance_automation;
    /** When true, {@code EXT_debug_utils} is supported. */
    public final boolean XR_EXT_debug_utils;
    /** When true, {@code EXT_dpad_binding} is supported. */
    public final boolean XR_EXT_dpad_binding;
    /** When true, {@code EXT_eye_gaze_interaction} is supported. */
    public final boolean XR_EXT_eye_gaze_interaction;
    /** When true, {@code EXT_frame_synthesis} is supported. */
    public final boolean XR_EXT_frame_synthesis;
    /** When true, {@code EXT_future} is supported. */
    public final boolean XR_EXT_future;
    /** When true, {@code EXT_hand_interaction} is supported. */
    public final boolean XR_EXT_hand_interaction;
    /** When true, {@code EXT_hand_joints_motion_range} is supported. */
    public final boolean XR_EXT_hand_joints_motion_range;
    /** When true, {@code EXT_hand_tracking} is supported. */
    public final boolean XR_EXT_hand_tracking;
    /** When true, {@code EXT_hand_tracking_data_source} is supported. */
    public final boolean XR_EXT_hand_tracking_data_source;
    /** When true, {@code EXT_hp_mixed_reality_controller} is supported. */
    public final boolean XR_EXT_hp_mixed_reality_controller;
    /** When true, {@code EXT_interaction_profile_battery_state_display} is supported. */
    public final boolean XR_EXT_interaction_profile_battery_state_display;
    /** When true, {@code EXT_interaction_render_model} is supported. */
    public final boolean XR_EXT_interaction_render_model;
    /** When true, {@code EXT_loader_init_properties} is supported. */
    public final boolean XR_EXT_loader_init_properties;
    /** When true, {@code EXT_local_floor} is supported. */
    public final boolean XR_EXT_local_floor;
    /** When true, {@code EXT_palm_pose} is supported. */
    public final boolean XR_EXT_palm_pose;
    /** When true, {@code EXT_performance_settings} is supported. */
    public final boolean XR_EXT_performance_settings;
    /** When true, {@code EXT_plane_detection} is supported. */
    public final boolean XR_EXT_plane_detection;
    /** When true, {@code EXT_render_model} is supported. */
    public final boolean XR_EXT_render_model;
    /** When true, {@code EXT_samsung_odyssey_controller} is supported. */
    public final boolean XR_EXT_samsung_odyssey_controller;
    /** When true, {@code EXT_spatial_anchor} is supported. */
    public final boolean XR_EXT_spatial_anchor;
    /** When true, {@code EXT_spatial_entity} is supported. */
    public final boolean XR_EXT_spatial_entity;
    /** When true, {@code EXT_spatial_marker_tracking} is supported. */
    public final boolean XR_EXT_spatial_marker_tracking;
    /** When true, {@code EXT_spatial_persistence} is supported. */
    public final boolean XR_EXT_spatial_persistence;
    /** When true, {@code EXT_spatial_persistence_operations} is supported. */
    public final boolean XR_EXT_spatial_persistence_operations;
    /** When true, {@code EXT_spatial_plane_tracking} is supported. */
    public final boolean XR_EXT_spatial_plane_tracking;
    /** When true, {@code EXT_stationary_reference_space} is supported. */
    public final boolean XR_EXT_stationary_reference_space;
    /** When true, {@code EXT_thermal_query} is supported. */
    public final boolean XR_EXT_thermal_query;
    /** When true, {@code EXT_user_presence} is supported. */
    public final boolean XR_EXT_user_presence;
    /** When true, {@code EXT_uuid} is supported. */
    public final boolean XR_EXT_uuid;
    /** When true, {@code EXT_view_configuration_depth_range} is supported. */
    public final boolean XR_EXT_view_configuration_depth_range;
    /** When true, {@code EXT_view_configuration_views_change} is supported. */
    public final boolean XR_EXT_view_configuration_views_change;
    /** When true, {@code EXT_win32_appcontainer_compatible} is supported. */
    public final boolean XR_EXT_win32_appcontainer_compatible;
    /** When true, {@code EXTX_overlay} is supported. */
    public final boolean XR_EXTX_overlay;
    /** When true, {@code FB_body_tracking} is supported. */
    public final boolean XR_FB_body_tracking;
    /** When true, {@code FB_color_space} is supported. */
    public final boolean XR_FB_color_space;
    /** When true, {@code FB_composition_layer_alpha_blend} is supported. */
    public final boolean XR_FB_composition_layer_alpha_blend;
    /** When true, {@code FB_composition_layer_depth_test} is supported. */
    public final boolean XR_FB_composition_layer_depth_test;
    /** When true, {@code FB_composition_layer_image_layout} is supported. */
    public final boolean XR_FB_composition_layer_image_layout;
    /** When true, {@code FB_composition_layer_secure_content} is supported. */
    public final boolean XR_FB_composition_layer_secure_content;
    /** When true, {@code FB_composition_layer_settings} is supported. */
    public final boolean XR_FB_composition_layer_settings;
    /** When true, {@code FB_display_refresh_rate} is supported. */
    public final boolean XR_FB_display_refresh_rate;
    /** When true, {@code FB_eye_tracking_social} is supported. */
    public final boolean XR_FB_eye_tracking_social;
    /** When true, {@code FB_face_tracking} is supported. */
    public final boolean XR_FB_face_tracking;
    /** When true, {@code FB_face_tracking2} is supported. */
    public final boolean XR_FB_face_tracking2;
    /** When true, {@code FB_foveation} is supported. */
    public final boolean XR_FB_foveation;
    /** When true, {@code FB_foveation_configuration} is supported. */
    public final boolean XR_FB_foveation_configuration;
    /** When true, {@code FB_foveation_vulkan} is supported. */
    public final boolean XR_FB_foveation_vulkan;
    /** When true, {@code FB_hand_tracking_aim} is supported. */
    public final boolean XR_FB_hand_tracking_aim;
    /** When true, {@code FB_hand_tracking_capsules} is supported. */
    public final boolean XR_FB_hand_tracking_capsules;
    /** When true, {@code FB_hand_tracking_mesh} is supported. */
    public final boolean XR_FB_hand_tracking_mesh;
    /** When true, {@code FB_haptic_amplitude_envelope} is supported. */
    public final boolean XR_FB_haptic_amplitude_envelope;
    /** When true, {@code FB_haptic_pcm} is supported. */
    public final boolean XR_FB_haptic_pcm;
    /** When true, {@code FB_keyboard_tracking} is supported. */
    public final boolean XR_FB_keyboard_tracking;
    /** When true, {@code FB_passthrough} is supported. */
    public final boolean XR_FB_passthrough;
    /** When true, {@code FB_passthrough_keyboard_hands} is supported. */
    public final boolean XR_FB_passthrough_keyboard_hands;
    /** When true, {@code FB_render_model} is supported. */
    public final boolean XR_FB_render_model;
    /** When true, {@code FB_scene} is supported. */
    public final boolean XR_FB_scene;
    /** When true, {@code FB_scene_capture} is supported. */
    public final boolean XR_FB_scene_capture;
    /** When true, {@code FB_space_warp} is supported. */
    public final boolean XR_FB_space_warp;
    /** When true, {@code FB_spatial_entity} is supported. */
    public final boolean XR_FB_spatial_entity;
    /** When true, {@code FB_spatial_entity_container} is supported. */
    public final boolean XR_FB_spatial_entity_container;
    /** When true, {@code FB_spatial_entity_query} is supported. */
    public final boolean XR_FB_spatial_entity_query;
    /** When true, {@code FB_spatial_entity_sharing} is supported. */
    public final boolean XR_FB_spatial_entity_sharing;
    /** When true, {@code FB_spatial_entity_storage} is supported. */
    public final boolean XR_FB_spatial_entity_storage;
    /** When true, {@code FB_spatial_entity_storage_batch} is supported. */
    public final boolean XR_FB_spatial_entity_storage_batch;
    /** When true, {@code FB_spatial_entity_user} is supported. */
    public final boolean XR_FB_spatial_entity_user;
    /** When true, {@code FB_swapchain_update_state} is supported. */
    public final boolean XR_FB_swapchain_update_state;
    /** When true, {@code FB_swapchain_update_state_opengl_es} is supported. */
    public final boolean XR_FB_swapchain_update_state_opengl_es;
    /** When true, {@code FB_swapchain_update_state_vulkan} is supported. */
    public final boolean XR_FB_swapchain_update_state_vulkan;
    /** When true, {@code FB_touch_controller_pro} is supported. */
    public final boolean XR_FB_touch_controller_pro;
    /** When true, {@code FB_touch_controller_proximity} is supported. */
    public final boolean XR_FB_touch_controller_proximity;
    /** When true, {@code FB_triangle_mesh} is supported. */
    public final boolean XR_FB_triangle_mesh;
    /** When true, {@code HTC_anchor} is supported. */
    public final boolean XR_HTC_anchor;
    /** When true, {@code HTC_body_tracking} is supported. */
    public final boolean XR_HTC_body_tracking;
    /** When true, {@code HTC_facial_tracking} is supported. */
    public final boolean XR_HTC_facial_tracking;
    /** When true, {@code HTC_foveation} is supported. */
    public final boolean XR_HTC_foveation;
    /** When true, {@code HTC_hand_interaction} is supported. */
    public final boolean XR_HTC_hand_interaction;
    /** When true, {@code HTC_passthrough} is supported. */
    public final boolean XR_HTC_passthrough;
    /** When true, {@code HTC_vive_cosmos_controller_interaction} is supported. */
    public final boolean XR_HTC_vive_cosmos_controller_interaction;
    /** When true, {@code HTC_vive_focus3_controller_interaction} is supported. */
    public final boolean XR_HTC_vive_focus3_controller_interaction;
    /** When true, {@code HTC_vive_wrist_tracker_interaction} is supported. */
    public final boolean XR_HTC_vive_wrist_tracker_interaction;
    /** When true, {@code HTCX_vive_tracker_interaction} is supported. */
    public final boolean XR_HTCX_vive_tracker_interaction;
    /** When true, {@code HUAWEI_controller_interaction} is supported. */
    public final boolean XR_HUAWEI_controller_interaction;
    /** When true, {@code KHR_binding_modification} is supported. */
    public final boolean XR_KHR_binding_modification;
    /** When true, {@code KHR_composition_layer_color_scale_bias} is supported. */
    public final boolean XR_KHR_composition_layer_color_scale_bias;
    /** When true, {@code KHR_composition_layer_cube} is supported. */
    public final boolean XR_KHR_composition_layer_cube;
    /** When true, {@code KHR_composition_layer_cylinder} is supported. */
    public final boolean XR_KHR_composition_layer_cylinder;
    /** When true, {@code KHR_composition_layer_depth} is supported. */
    public final boolean XR_KHR_composition_layer_depth;
    /** When true, {@code KHR_composition_layer_equirect} is supported. */
    public final boolean XR_KHR_composition_layer_equirect;
    /** When true, {@code KHR_composition_layer_equirect2} is supported. */
    public final boolean XR_KHR_composition_layer_equirect2;
    /** When true, {@code KHR_convert_timespec_time} is supported. */
    public final boolean XR_KHR_convert_timespec_time;
    /** When true, {@code KHR_extended_struct_name_lengths} is supported. */
    public final boolean XR_KHR_extended_struct_name_lengths;
    /** When true, {@code KHR_generic_controller} is supported. */
    public final boolean XR_KHR_generic_controller;
    /** When true, {@code KHR_loader_init} is supported. */
    public final boolean XR_KHR_loader_init;
    /** When true, {@code KHR_locate_spaces} is supported. */
    public final boolean XR_KHR_locate_spaces;
    /** When true, {@code KHR_maintenance1} is supported. */
    public final boolean XR_KHR_maintenance1;
    /** When true, {@code KHR_opengl_enable} is supported. */
    public final boolean XR_KHR_opengl_enable;
    /** When true, {@code KHR_swapchain_usage_input_attachment_bit} is supported. */
    public final boolean XR_KHR_swapchain_usage_input_attachment_bit;
    /** When true, {@code KHR_visibility_mask} is supported. */
    public final boolean XR_KHR_visibility_mask;
    /** When true, {@code KHR_vulkan_enable} is supported. */
    public final boolean XR_KHR_vulkan_enable;
    /** When true, {@code KHR_vulkan_enable2} is supported. */
    public final boolean XR_KHR_vulkan_enable2;
    /** When true, {@code KHR_vulkan_swapchain_format_list} is supported. */
    public final boolean XR_KHR_vulkan_swapchain_format_list;
    /** When true, {@code KHR_win32_convert_performance_counter_time} is supported. */
    public final boolean XR_KHR_win32_convert_performance_counter_time;
    /** When true, {@code LOGITECH_mx_ink_stylus_interaction} is supported. */
    public final boolean XR_LOGITECH_mx_ink_stylus_interaction;
    /** When true, {@code META_automatic_layer_filter} is supported. */
    public final boolean XR_META_automatic_layer_filter;
    /** When true, {@code META_body_tracking_calibration} is supported. */
    public final boolean XR_META_body_tracking_calibration;
    /** When true, {@code META_body_tracking_fidelity} is supported. */
    public final boolean XR_META_body_tracking_fidelity;
    /** When true, {@code META_body_tracking_full_body} is supported. */
    public final boolean XR_META_body_tracking_full_body;
    /** When true, {@code META_boundary_visibility} is supported. */
    public final boolean XR_META_boundary_visibility;
    /** When true, {@code META_colocation_discovery} is supported. */
    public final boolean XR_META_colocation_discovery;
    /** When true, {@code META_detached_controllers} is supported. */
    public final boolean XR_META_detached_controllers;
    /** When true, {@code META_environment_depth} is supported. */
    public final boolean XR_META_environment_depth;
    /** When true, {@code META_environment_raycast} is supported. */
    public final boolean XR_META_environment_raycast;
    /** When true, {@code META_face_tracking_visemes} is supported. */
    public final boolean XR_META_face_tracking_visemes;
    /** When true, {@code META_foveation_eye_tracked} is supported. */
    public final boolean XR_META_foveation_eye_tracked;
    /** When true, {@code META_hand_tracking_microgestures} is supported. */
    public final boolean XR_META_hand_tracking_microgestures;
    /** When true, {@code META_headset_id} is supported. */
    public final boolean XR_META_headset_id;
    /** When true, {@code META_local_dimming} is supported. */
    public final boolean XR_META_local_dimming;
    /** When true, {@code META_passthrough_color_lut} is supported. */
    public final boolean XR_META_passthrough_color_lut;
    /** When true, {@code META_passthrough_layer_resumed_event} is supported. */
    public final boolean XR_META_passthrough_layer_resumed_event;
    /** When true, {@code META_passthrough_preferences} is supported. */
    public final boolean XR_META_passthrough_preferences;
    /** When true, {@code META_performance_metrics} is supported. */
    public final boolean XR_META_performance_metrics;
    /** When true, {@code META_recommended_layer_resolution} is supported. */
    public final boolean XR_META_recommended_layer_resolution;
    /** When true, {@code META_simultaneous_hands_and_controllers} is supported. */
    public final boolean XR_META_simultaneous_hands_and_controllers;
    /** When true, {@code META_spatial_entity_discovery} is supported. */
    public final boolean XR_META_spatial_entity_discovery;
    /** When true, {@code META_spatial_entity_group_sharing} is supported. */
    public final boolean XR_META_spatial_entity_group_sharing;
    /** When true, {@code META_spatial_entity_mesh} is supported. */
    public final boolean XR_META_spatial_entity_mesh;
    /** When true, {@code META_spatial_entity_persistence} is supported. */
    public final boolean XR_META_spatial_entity_persistence;
    /** When true, {@code META_spatial_entity_room_mesh} is supported. */
    public final boolean XR_META_spatial_entity_room_mesh;
    /** When true, {@code META_spatial_entity_semantic_label} is supported. */
    public final boolean XR_META_spatial_entity_semantic_label;
    /** When true, {@code META_spatial_entity_sharing} is supported. */
    public final boolean XR_META_spatial_entity_sharing;
    /** When true, {@code META_tile_properties_hint} is supported. */
    public final boolean XR_META_tile_properties_hint;
    /** When true, {@code META_touch_controller_plus} is supported. */
    public final boolean XR_META_touch_controller_plus;
    /** When true, {@code META_virtual_keyboard} is supported. */
    public final boolean XR_META_virtual_keyboard;
    /** When true, {@code META_vulkan_swapchain_create_info} is supported. */
    public final boolean XR_META_vulkan_swapchain_create_info;
    /** When true, {@code ML_compat} is supported. */
    public final boolean XR_ML_compat;
    /** When true, {@code ML_facial_expression} is supported. */
    public final boolean XR_ML_facial_expression;
    /** When true, {@code ML_frame_end_info} is supported. */
    public final boolean XR_ML_frame_end_info;
    /** When true, {@code ML_global_dimmer} is supported. */
    public final boolean XR_ML_global_dimmer;
    /** When true, {@code ML_localization_map} is supported. */
    public final boolean XR_ML_localization_map;
    /** When true, {@code ML_marker_understanding} is supported. */
    public final boolean XR_ML_marker_understanding;
    /** When true, {@code ML_ml2_controller_interaction} is supported. */
    public final boolean XR_ML_ml2_controller_interaction;
    /** When true, {@code ML_spatial_anchors} is supported. */
    public final boolean XR_ML_spatial_anchors;
    /** When true, {@code ML_spatial_anchors_storage} is supported. */
    public final boolean XR_ML_spatial_anchors_storage;
    /** When true, {@code ML_system_notifications} is supported. */
    public final boolean XR_ML_system_notifications;
    /** When true, {@code ML_user_calibration} is supported. */
    public final boolean XR_ML_user_calibration;
    /** When true, {@code ML_view_configuration_depth_range_change} is supported. */
    public final boolean XR_ML_view_configuration_depth_range_change;
    /** When true, {@code ML_world_mesh_detection} is supported. */
    public final boolean XR_ML_world_mesh_detection;
    /** When true, {@code MND_headless} is supported. */
    public final boolean XR_MND_headless;
    /** When true, {@code MND_swapchain_usage_input_attachment_bit} is supported. */
    public final boolean XR_MND_swapchain_usage_input_attachment_bit;
    /** When true, {@code MNDX_egl_enable} is supported. */
    public final boolean XR_MNDX_egl_enable;
    /** When true, {@code MNDX_force_feedback_curl} is supported. */
    public final boolean XR_MNDX_force_feedback_curl;
    /** When true, {@code MSFT_composition_layer_reprojection} is supported. */
    public final boolean XR_MSFT_composition_layer_reprojection;
    /** When true, {@code MSFT_controller_model} is supported. */
    public final boolean XR_MSFT_controller_model;
    /** When true, {@code MSFT_first_person_observer} is supported. */
    public final boolean XR_MSFT_first_person_observer;
    /** When true, {@code MSFT_hand_interaction} is supported. */
    public final boolean XR_MSFT_hand_interaction;
    /** When true, {@code MSFT_hand_tracking_mesh} is supported. */
    public final boolean XR_MSFT_hand_tracking_mesh;
    /** When true, {@code MSFT_holographic_window_attachment} is supported. */
    public final boolean XR_MSFT_holographic_window_attachment;
    /** When true, {@code MSFT_perception_anchor_interop} is supported. */
    public final boolean XR_MSFT_perception_anchor_interop;
    /** When true, {@code MSFT_scene_marker} is supported. */
    public final boolean XR_MSFT_scene_marker;
    /** When true, {@code MSFT_scene_understanding} is supported. */
    public final boolean XR_MSFT_scene_understanding;
    /** When true, {@code MSFT_scene_understanding_serialization} is supported. */
    public final boolean XR_MSFT_scene_understanding_serialization;
    /** When true, {@code MSFT_secondary_view_configuration} is supported. */
    public final boolean XR_MSFT_secondary_view_configuration;
    /** When true, {@code MSFT_spatial_anchor} is supported. */
    public final boolean XR_MSFT_spatial_anchor;
    /** When true, {@code MSFT_spatial_anchor_persistence} is supported. */
    public final boolean XR_MSFT_spatial_anchor_persistence;
    /** When true, {@code MSFT_spatial_graph_bridge} is supported. */
    public final boolean XR_MSFT_spatial_graph_bridge;
    /** When true, {@code MSFT_unbounded_reference_space} is supported. */
    public final boolean XR_MSFT_unbounded_reference_space;
    /** When true, {@code OCULUS_audio_device_guid} is supported. */
    public final boolean XR_OCULUS_audio_device_guid;
    /** When true, {@code OCULUS_external_camera} is supported. */
    public final boolean XR_OCULUS_external_camera;
    /** When true, {@code OPPO_controller_interaction} is supported. */
    public final boolean XR_OPPO_controller_interaction;
    /** When true, {@code QCOM_hand_tracking_gesture} is supported. */
    public final boolean XR_QCOM_hand_tracking_gesture;
    /** When true, {@code QCOM_tracking_optimization_settings} is supported. */
    public final boolean XR_QCOM_tracking_optimization_settings;
    /** When true, {@code ULTRALEAP_hand_tracking_forearm} is supported. */
    public final boolean XR_ULTRALEAP_hand_tracking_forearm;
    /** When true, {@code VALVE_analog_threshold} is supported. */
    public final boolean XR_VALVE_analog_threshold;
    /** When true, {@code VARJO_composition_layer_depth_test} is supported. */
    public final boolean XR_VARJO_composition_layer_depth_test;
    /** When true, {@code VARJO_environment_depth_estimation} is supported. */
    public final boolean XR_VARJO_environment_depth_estimation;
    /** When true, {@code VARJO_foveated_rendering} is supported. */
    public final boolean XR_VARJO_foveated_rendering;
    /** When true, {@code VARJO_marker_tracking} is supported. */
    public final boolean XR_VARJO_marker_tracking;
    /** When true, {@code VARJO_quad_views} is supported. */
    public final boolean XR_VARJO_quad_views;
    /** When true, {@code VARJO_view_offset} is supported. */
    public final boolean XR_VARJO_view_offset;
    /** When true, {@code VARJO_xr4_controller_interaction} is supported. */
    public final boolean XR_VARJO_xr4_controller_interaction;
    /** When true, {@code YVR_controller_interaction} is supported. */
    public final boolean XR_YVR_controller_interaction;

    XRCapabilities(FunctionProvider provider, long apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[485];

        OpenXR10 = check_XR10(provider, caps, ext);
        OpenXR11 = check_XR11(provider, caps, ext);
        XR_ALMALENCE_digital_lens_control = check_ALMALENCE_digital_lens_control(provider, caps, ext);
        XR_ANDROID_anchor_sharing_export = check_ANDROID_anchor_sharing_export(provider, caps, ext);
        XR_ANDROID_composition_layer_passthrough_mesh = check_ANDROID_composition_layer_passthrough_mesh(provider, caps, ext);
        XR_ANDROID_device_anchor_persistence = check_ANDROID_device_anchor_persistence(provider, caps, ext);
        XR_ANDROID_eye_tracking = check_ANDROID_eye_tracking(provider, caps, ext);
        XR_ANDROID_face_tracking = check_ANDROID_face_tracking(provider, caps, ext);
        XR_ANDROID_light_estimation = check_ANDROID_light_estimation(provider, caps, ext);
        XR_ANDROID_mouse_interaction = ext.contains("XR_ANDROID_mouse_interaction");
        XR_ANDROID_passthrough_camera_state = check_ANDROID_passthrough_camera_state(provider, caps, ext);
        XR_ANDROID_performance_metrics = check_ANDROID_performance_metrics(provider, caps, ext);
        XR_ANDROID_raycast = check_ANDROID_raycast(provider, caps, ext);
        XR_ANDROID_recommended_resolution = ext.contains("XR_ANDROID_recommended_resolution");
        XR_ANDROID_scene_meshing = check_ANDROID_scene_meshing(provider, caps, ext);
        XR_ANDROID_spatial_anchor_space = check_ANDROID_spatial_anchor_space(provider, caps, ext);
        XR_ANDROID_spatial_component_subsumed_by = ext.contains("XR_ANDROID_spatial_component_subsumed_by");
        XR_ANDROID_spatial_discovery_raycast = check_ANDROID_spatial_discovery_raycast(provider, caps, ext);
        XR_ANDROID_spatial_entity_bound_anchor = check_ANDROID_spatial_entity_bound_anchor(provider, caps, ext);
        XR_ANDROID_spatial_object_tracking = ext.contains("XR_ANDROID_spatial_object_tracking");
        XR_ANDROID_trackables = check_ANDROID_trackables(provider, caps, ext);
        XR_ANDROID_trackables_image = check_ANDROID_trackables_image(provider, caps, ext);
        XR_ANDROID_trackables_marker = check_ANDROID_trackables_marker(provider, caps, ext);
        XR_ANDROID_trackables_object = check_ANDROID_trackables_object(provider, caps, ext);
        XR_ANDROID_trackables_qr_code = check_ANDROID_trackables_qr_code(provider, caps, ext);
        XR_ANDROID_unbounded_reference_space = ext.contains("XR_ANDROID_unbounded_reference_space");
        XR_BD_body_tracking = check_BD_body_tracking(provider, caps, ext);
        XR_BD_controller_interaction = ext.contains("XR_BD_controller_interaction");
        XR_BD_facial_simulation = check_BD_facial_simulation(provider, caps, ext);
        XR_BD_future_progress = ext.contains("XR_BD_future_progress");
        XR_BD_spatial_anchor = check_BD_spatial_anchor(provider, caps, ext);
        XR_BD_spatial_anchor_sharing = check_BD_spatial_anchor_sharing(provider, caps, ext);
        XR_BD_spatial_audio_rendering = check_BD_spatial_audio_rendering(provider, caps, ext);
        XR_BD_spatial_mesh = ext.contains("XR_BD_spatial_mesh");
        XR_BD_spatial_plane = ext.contains("XR_BD_spatial_plane");
        XR_BD_spatial_scene = check_BD_spatial_scene(provider, caps, ext);
        XR_BD_spatial_sensing = check_BD_spatial_sensing(provider, caps, ext);
        XR_BD_ultra_controller_interaction = ext.contains("XR_BD_ultra_controller_interaction");
        XR_EPIC_view_configuration_fov = ext.contains("XR_EPIC_view_configuration_fov");
        XR_EXT_active_action_set_priority = ext.contains("XR_EXT_active_action_set_priority");
        XR_EXT_composition_layer_inverted_alpha = ext.contains("XR_EXT_composition_layer_inverted_alpha");
        XR_EXT_conformance_automation = check_EXT_conformance_automation(provider, caps, ext);
        XR_EXT_debug_utils = check_EXT_debug_utils(provider, caps, ext);
        XR_EXT_dpad_binding = ext.contains("XR_EXT_dpad_binding");
        XR_EXT_eye_gaze_interaction = ext.contains("XR_EXT_eye_gaze_interaction");
        XR_EXT_frame_synthesis = ext.contains("XR_EXT_frame_synthesis");
        XR_EXT_future = check_EXT_future(provider, caps, ext);
        XR_EXT_hand_interaction = ext.contains("XR_EXT_hand_interaction");
        XR_EXT_hand_joints_motion_range = ext.contains("XR_EXT_hand_joints_motion_range");
        XR_EXT_hand_tracking = check_EXT_hand_tracking(provider, caps, ext);
        XR_EXT_hand_tracking_data_source = ext.contains("XR_EXT_hand_tracking_data_source");
        XR_EXT_hp_mixed_reality_controller = ext.contains("XR_EXT_hp_mixed_reality_controller");
        XR_EXT_interaction_profile_battery_state_display = ext.contains("XR_EXT_interaction_profile_battery_state_display");
        XR_EXT_interaction_render_model = check_EXT_interaction_render_model(provider, caps, ext);
        XR_EXT_loader_init_properties = ext.contains("XR_EXT_loader_init_properties");
        XR_EXT_local_floor = ext.contains("XR_EXT_local_floor");
        XR_EXT_palm_pose = ext.contains("XR_EXT_palm_pose");
        XR_EXT_performance_settings = check_EXT_performance_settings(provider, caps, ext);
        XR_EXT_plane_detection = check_EXT_plane_detection(provider, caps, ext);
        XR_EXT_render_model = check_EXT_render_model(provider, caps, ext);
        XR_EXT_samsung_odyssey_controller = ext.contains("XR_EXT_samsung_odyssey_controller");
        XR_EXT_spatial_anchor = check_EXT_spatial_anchor(provider, caps, ext);
        XR_EXT_spatial_entity = check_EXT_spatial_entity(provider, caps, ext);
        XR_EXT_spatial_marker_tracking = ext.contains("XR_EXT_spatial_marker_tracking");
        XR_EXT_spatial_persistence = check_EXT_spatial_persistence(provider, caps, ext);
        XR_EXT_spatial_persistence_operations = check_EXT_spatial_persistence_operations(provider, caps, ext);
        XR_EXT_spatial_plane_tracking = ext.contains("XR_EXT_spatial_plane_tracking");
        XR_EXT_stationary_reference_space = check_EXT_stationary_reference_space(provider, caps, ext);
        XR_EXT_thermal_query = check_EXT_thermal_query(provider, caps, ext);
        XR_EXT_user_presence = ext.contains("XR_EXT_user_presence");
        XR_EXT_uuid = ext.contains("XR_EXT_uuid");
        XR_EXT_view_configuration_depth_range = ext.contains("XR_EXT_view_configuration_depth_range");
        XR_EXT_view_configuration_views_change = ext.contains("XR_EXT_view_configuration_views_change");
        XR_EXT_win32_appcontainer_compatible = ext.contains("XR_EXT_win32_appcontainer_compatible");
        XR_EXTX_overlay = ext.contains("XR_EXTX_overlay");
        XR_FB_body_tracking = check_FB_body_tracking(provider, caps, ext);
        XR_FB_color_space = check_FB_color_space(provider, caps, ext);
        XR_FB_composition_layer_alpha_blend = ext.contains("XR_FB_composition_layer_alpha_blend");
        XR_FB_composition_layer_depth_test = ext.contains("XR_FB_composition_layer_depth_test");
        XR_FB_composition_layer_image_layout = ext.contains("XR_FB_composition_layer_image_layout");
        XR_FB_composition_layer_secure_content = ext.contains("XR_FB_composition_layer_secure_content");
        XR_FB_composition_layer_settings = ext.contains("XR_FB_composition_layer_settings");
        XR_FB_display_refresh_rate = check_FB_display_refresh_rate(provider, caps, ext);
        XR_FB_eye_tracking_social = check_FB_eye_tracking_social(provider, caps, ext);
        XR_FB_face_tracking = check_FB_face_tracking(provider, caps, ext);
        XR_FB_face_tracking2 = check_FB_face_tracking2(provider, caps, ext);
        XR_FB_foveation = check_FB_foveation(provider, caps, ext);
        XR_FB_foveation_configuration = ext.contains("XR_FB_foveation_configuration");
        XR_FB_foveation_vulkan = ext.contains("XR_FB_foveation_vulkan");
        XR_FB_hand_tracking_aim = ext.contains("XR_FB_hand_tracking_aim");
        XR_FB_hand_tracking_capsules = ext.contains("XR_FB_hand_tracking_capsules");
        XR_FB_hand_tracking_mesh = check_FB_hand_tracking_mesh(provider, caps, ext);
        XR_FB_haptic_amplitude_envelope = ext.contains("XR_FB_haptic_amplitude_envelope");
        XR_FB_haptic_pcm = check_FB_haptic_pcm(provider, caps, ext);
        XR_FB_keyboard_tracking = check_FB_keyboard_tracking(provider, caps, ext);
        XR_FB_passthrough = check_FB_passthrough(provider, caps, ext);
        XR_FB_passthrough_keyboard_hands = check_FB_passthrough_keyboard_hands(provider, caps, ext);
        XR_FB_render_model = check_FB_render_model(provider, caps, ext);
        XR_FB_scene = check_FB_scene(provider, caps, ext);
        XR_FB_scene_capture = check_FB_scene_capture(provider, caps, ext);
        XR_FB_space_warp = ext.contains("XR_FB_space_warp");
        XR_FB_spatial_entity = check_FB_spatial_entity(provider, caps, ext);
        XR_FB_spatial_entity_container = check_FB_spatial_entity_container(provider, caps, ext);
        XR_FB_spatial_entity_query = check_FB_spatial_entity_query(provider, caps, ext);
        XR_FB_spatial_entity_sharing = check_FB_spatial_entity_sharing(provider, caps, ext);
        XR_FB_spatial_entity_storage = check_FB_spatial_entity_storage(provider, caps, ext);
        XR_FB_spatial_entity_storage_batch = check_FB_spatial_entity_storage_batch(provider, caps, ext);
        XR_FB_spatial_entity_user = check_FB_spatial_entity_user(provider, caps, ext);
        XR_FB_swapchain_update_state = check_FB_swapchain_update_state(provider, caps, ext);
        XR_FB_swapchain_update_state_opengl_es = ext.contains("XR_FB_swapchain_update_state_opengl_es");
        XR_FB_swapchain_update_state_vulkan = ext.contains("XR_FB_swapchain_update_state_vulkan");
        XR_FB_touch_controller_pro = ext.contains("XR_FB_touch_controller_pro");
        XR_FB_touch_controller_proximity = ext.contains("XR_FB_touch_controller_proximity");
        XR_FB_triangle_mesh = check_FB_triangle_mesh(provider, caps, ext);
        XR_HTC_anchor = check_HTC_anchor(provider, caps, ext);
        XR_HTC_body_tracking = check_HTC_body_tracking(provider, caps, ext);
        XR_HTC_facial_tracking = check_HTC_facial_tracking(provider, caps, ext);
        XR_HTC_foveation = check_HTC_foveation(provider, caps, ext);
        XR_HTC_hand_interaction = ext.contains("XR_HTC_hand_interaction");
        XR_HTC_passthrough = check_HTC_passthrough(provider, caps, ext);
        XR_HTC_vive_cosmos_controller_interaction = ext.contains("XR_HTC_vive_cosmos_controller_interaction");
        XR_HTC_vive_focus3_controller_interaction = ext.contains("XR_HTC_vive_focus3_controller_interaction");
        XR_HTC_vive_wrist_tracker_interaction = ext.contains("XR_HTC_vive_wrist_tracker_interaction");
        XR_HTCX_vive_tracker_interaction = check_HTCX_vive_tracker_interaction(provider, caps, ext);
        XR_HUAWEI_controller_interaction = ext.contains("XR_HUAWEI_controller_interaction");
        XR_KHR_binding_modification = ext.contains("XR_KHR_binding_modification");
        XR_KHR_composition_layer_color_scale_bias = ext.contains("XR_KHR_composition_layer_color_scale_bias");
        XR_KHR_composition_layer_cube = ext.contains("XR_KHR_composition_layer_cube");
        XR_KHR_composition_layer_cylinder = ext.contains("XR_KHR_composition_layer_cylinder");
        XR_KHR_composition_layer_depth = ext.contains("XR_KHR_composition_layer_depth");
        XR_KHR_composition_layer_equirect = ext.contains("XR_KHR_composition_layer_equirect");
        XR_KHR_composition_layer_equirect2 = ext.contains("XR_KHR_composition_layer_equirect2");
        XR_KHR_convert_timespec_time = check_KHR_convert_timespec_time(provider, caps, ext);
        XR_KHR_extended_struct_name_lengths = check_KHR_extended_struct_name_lengths(provider, caps, ext);
        XR_KHR_generic_controller = ext.contains("XR_KHR_generic_controller");
        XR_KHR_loader_init = ext.contains("XR_KHR_loader_init");
        XR_KHR_locate_spaces = check_KHR_locate_spaces(provider, caps, ext);
        XR_KHR_maintenance1 = ext.contains("XR_KHR_maintenance1");
        XR_KHR_opengl_enable = check_KHR_opengl_enable(provider, caps, ext);
        XR_KHR_swapchain_usage_input_attachment_bit = ext.contains("XR_KHR_swapchain_usage_input_attachment_bit");
        XR_KHR_visibility_mask = check_KHR_visibility_mask(provider, caps, ext);
        XR_KHR_vulkan_enable = check_KHR_vulkan_enable(provider, caps, ext);
        XR_KHR_vulkan_enable2 = check_KHR_vulkan_enable2(provider, caps, ext);
        XR_KHR_vulkan_swapchain_format_list = ext.contains("XR_KHR_vulkan_swapchain_format_list");
        XR_KHR_win32_convert_performance_counter_time = check_KHR_win32_convert_performance_counter_time(provider, caps, ext);
        XR_LOGITECH_mx_ink_stylus_interaction = ext.contains("XR_LOGITECH_mx_ink_stylus_interaction");
        XR_META_automatic_layer_filter = ext.contains("XR_META_automatic_layer_filter");
        XR_META_body_tracking_calibration = check_META_body_tracking_calibration(provider, caps, ext);
        XR_META_body_tracking_fidelity = check_META_body_tracking_fidelity(provider, caps, ext);
        XR_META_body_tracking_full_body = ext.contains("XR_META_body_tracking_full_body");
        XR_META_boundary_visibility = check_META_boundary_visibility(provider, caps, ext);
        XR_META_colocation_discovery = check_META_colocation_discovery(provider, caps, ext);
        XR_META_detached_controllers = ext.contains("XR_META_detached_controllers");
        XR_META_environment_depth = check_META_environment_depth(provider, caps, ext);
        XR_META_environment_raycast = check_META_environment_raycast(provider, caps, ext);
        XR_META_face_tracking_visemes = ext.contains("XR_META_face_tracking_visemes");
        XR_META_foveation_eye_tracked = check_META_foveation_eye_tracked(provider, caps, ext);
        XR_META_hand_tracking_microgestures = ext.contains("XR_META_hand_tracking_microgestures");
        XR_META_headset_id = ext.contains("XR_META_headset_id");
        XR_META_local_dimming = ext.contains("XR_META_local_dimming");
        XR_META_passthrough_color_lut = check_META_passthrough_color_lut(provider, caps, ext);
        XR_META_passthrough_layer_resumed_event = ext.contains("XR_META_passthrough_layer_resumed_event");
        XR_META_passthrough_preferences = check_META_passthrough_preferences(provider, caps, ext);
        XR_META_performance_metrics = check_META_performance_metrics(provider, caps, ext);
        XR_META_recommended_layer_resolution = check_META_recommended_layer_resolution(provider, caps, ext);
        XR_META_simultaneous_hands_and_controllers = check_META_simultaneous_hands_and_controllers(provider, caps, ext);
        XR_META_spatial_entity_discovery = check_META_spatial_entity_discovery(provider, caps, ext);
        XR_META_spatial_entity_group_sharing = ext.contains("XR_META_spatial_entity_group_sharing");
        XR_META_spatial_entity_mesh = check_META_spatial_entity_mesh(provider, caps, ext);
        XR_META_spatial_entity_persistence = check_META_spatial_entity_persistence(provider, caps, ext);
        XR_META_spatial_entity_room_mesh = check_META_spatial_entity_room_mesh(provider, caps, ext);
        XR_META_spatial_entity_semantic_label = ext.contains("XR_META_spatial_entity_semantic_label");
        XR_META_spatial_entity_sharing = check_META_spatial_entity_sharing(provider, caps, ext);
        XR_META_tile_properties_hint = check_META_tile_properties_hint(provider, caps, ext);
        XR_META_touch_controller_plus = ext.contains("XR_META_touch_controller_plus");
        XR_META_virtual_keyboard = check_META_virtual_keyboard(provider, caps, ext);
        XR_META_vulkan_swapchain_create_info = ext.contains("XR_META_vulkan_swapchain_create_info");
        XR_ML_compat = check_ML_compat(provider, caps, ext);
        XR_ML_facial_expression = check_ML_facial_expression(provider, caps, ext);
        XR_ML_frame_end_info = ext.contains("XR_ML_frame_end_info");
        XR_ML_global_dimmer = ext.contains("XR_ML_global_dimmer");
        XR_ML_localization_map = check_ML_localization_map(provider, caps, ext);
        XR_ML_marker_understanding = check_ML_marker_understanding(provider, caps, ext);
        XR_ML_ml2_controller_interaction = ext.contains("XR_ML_ml2_controller_interaction");
        XR_ML_spatial_anchors = check_ML_spatial_anchors(provider, caps, ext);
        XR_ML_spatial_anchors_storage = check_ML_spatial_anchors_storage(provider, caps, ext);
        XR_ML_system_notifications = check_ML_system_notifications(provider, caps, ext);
        XR_ML_user_calibration = check_ML_user_calibration(provider, caps, ext);
        XR_ML_view_configuration_depth_range_change = ext.contains("XR_ML_view_configuration_depth_range_change");
        XR_ML_world_mesh_detection = check_ML_world_mesh_detection(provider, caps, ext);
        XR_MND_headless = ext.contains("XR_MND_headless");
        XR_MND_swapchain_usage_input_attachment_bit = ext.contains("XR_MND_swapchain_usage_input_attachment_bit");
        XR_MNDX_egl_enable = ext.contains("XR_MNDX_egl_enable");
        XR_MNDX_force_feedback_curl = check_MNDX_force_feedback_curl(provider, caps, ext);
        XR_MSFT_composition_layer_reprojection = check_MSFT_composition_layer_reprojection(provider, caps, ext);
        XR_MSFT_controller_model = check_MSFT_controller_model(provider, caps, ext);
        XR_MSFT_first_person_observer = ext.contains("XR_MSFT_first_person_observer");
        XR_MSFT_hand_interaction = ext.contains("XR_MSFT_hand_interaction");
        XR_MSFT_hand_tracking_mesh = check_MSFT_hand_tracking_mesh(provider, caps, ext);
        XR_MSFT_holographic_window_attachment = ext.contains("XR_MSFT_holographic_window_attachment");
        XR_MSFT_perception_anchor_interop = check_MSFT_perception_anchor_interop(provider, caps, ext);
        XR_MSFT_scene_marker = check_MSFT_scene_marker(provider, caps, ext);
        XR_MSFT_scene_understanding = check_MSFT_scene_understanding(provider, caps, ext);
        XR_MSFT_scene_understanding_serialization = check_MSFT_scene_understanding_serialization(provider, caps, ext);
        XR_MSFT_secondary_view_configuration = ext.contains("XR_MSFT_secondary_view_configuration");
        XR_MSFT_spatial_anchor = check_MSFT_spatial_anchor(provider, caps, ext);
        XR_MSFT_spatial_anchor_persistence = check_MSFT_spatial_anchor_persistence(provider, caps, ext);
        XR_MSFT_spatial_graph_bridge = check_MSFT_spatial_graph_bridge(provider, caps, ext);
        XR_MSFT_unbounded_reference_space = ext.contains("XR_MSFT_unbounded_reference_space");
        XR_OCULUS_audio_device_guid = check_OCULUS_audio_device_guid(provider, caps, ext);
        XR_OCULUS_external_camera = check_OCULUS_external_camera(provider, caps, ext);
        XR_OPPO_controller_interaction = ext.contains("XR_OPPO_controller_interaction");
        XR_QCOM_hand_tracking_gesture = check_QCOM_hand_tracking_gesture(provider, caps, ext);
        XR_QCOM_tracking_optimization_settings = check_QCOM_tracking_optimization_settings(provider, caps, ext);
        XR_ULTRALEAP_hand_tracking_forearm = ext.contains("XR_ULTRALEAP_hand_tracking_forearm");
        XR_VALVE_analog_threshold = ext.contains("XR_VALVE_analog_threshold");
        XR_VARJO_composition_layer_depth_test = ext.contains("XR_VARJO_composition_layer_depth_test");
        XR_VARJO_environment_depth_estimation = check_VARJO_environment_depth_estimation(provider, caps, ext);
        XR_VARJO_foveated_rendering = ext.contains("XR_VARJO_foveated_rendering");
        XR_VARJO_marker_tracking = check_VARJO_marker_tracking(provider, caps, ext);
        XR_VARJO_quad_views = ext.contains("XR_VARJO_quad_views");
        XR_VARJO_view_offset = check_VARJO_view_offset(provider, caps, ext);
        XR_VARJO_xr4_controller_interaction = ext.contains("XR_VARJO_xr4_controller_interaction");
        XR_YVR_controller_interaction = ext.contains("XR_YVR_controller_interaction");

        xrDestroyInstance = caps[0];
        xrGetInstanceProperties = caps[1];
        xrPollEvent = caps[2];
        xrResultToString = caps[3];
        xrStructureTypeToString = caps[4];
        xrGetSystem = caps[5];
        xrGetSystemProperties = caps[6];
        xrEnumerateEnvironmentBlendModes = caps[7];
        xrCreateSession = caps[8];
        xrDestroySession = caps[9];
        xrEnumerateReferenceSpaces = caps[10];
        xrCreateReferenceSpace = caps[11];
        xrGetReferenceSpaceBoundsRect = caps[12];
        xrCreateActionSpace = caps[13];
        xrLocateSpace = caps[14];
        xrDestroySpace = caps[15];
        xrEnumerateViewConfigurations = caps[16];
        xrGetViewConfigurationProperties = caps[17];
        xrEnumerateViewConfigurationViews = caps[18];
        xrEnumerateSwapchainFormats = caps[19];
        xrCreateSwapchain = caps[20];
        xrDestroySwapchain = caps[21];
        xrEnumerateSwapchainImages = caps[22];
        xrAcquireSwapchainImage = caps[23];
        xrWaitSwapchainImage = caps[24];
        xrReleaseSwapchainImage = caps[25];
        xrBeginSession = caps[26];
        xrEndSession = caps[27];
        xrRequestExitSession = caps[28];
        xrWaitFrame = caps[29];
        xrBeginFrame = caps[30];
        xrEndFrame = caps[31];
        xrLocateViews = caps[32];
        xrStringToPath = caps[33];
        xrPathToString = caps[34];
        xrCreateActionSet = caps[35];
        xrDestroyActionSet = caps[36];
        xrCreateAction = caps[37];
        xrDestroyAction = caps[38];
        xrSuggestInteractionProfileBindings = caps[39];
        xrAttachSessionActionSets = caps[40];
        xrGetCurrentInteractionProfile = caps[41];
        xrGetActionStateBoolean = caps[42];
        xrGetActionStateFloat = caps[43];
        xrGetActionStateVector2f = caps[44];
        xrGetActionStatePose = caps[45];
        xrSyncActions = caps[46];
        xrEnumerateBoundSourcesForAction = caps[47];
        xrGetInputSourceLocalizedName = caps[48];
        xrApplyHapticFeedback = caps[49];
        xrStopHapticFeedback = caps[50];
        xrLocateSpaces = caps[51];
        xrSetDigitalLensControlALMALENCE = caps[52];
        xrShareAnchorANDROID = caps[53];
        xrUnshareAnchorANDROID = caps[54];
        xrCreatePassthroughLayerANDROID = caps[55];
        xrDestroyPassthroughLayerANDROID = caps[56];
        xrSetPassthroughLayerMeshANDROID = caps[57];
        xrEnumerateSupportedPersistenceAnchorTypesANDROID = caps[58];
        xrCreateDeviceAnchorPersistenceANDROID = caps[59];
        xrDestroyDeviceAnchorPersistenceANDROID = caps[60];
        xrPersistAnchorANDROID = caps[61];
        xrGetAnchorPersistStateANDROID = caps[62];
        xrCreatePersistedAnchorSpaceANDROID = caps[63];
        xrEnumeratePersistedAnchorsANDROID = caps[64];
        xrUnpersistAnchorANDROID = caps[65];
        xrCreateEyeTrackerANDROID = caps[66];
        xrDestroyEyeTrackerANDROID = caps[67];
        xrGetFineTrackingEyesInfoANDROID = caps[68];
        xrGetCoarseTrackingEyesInfoANDROID = caps[69];
        xrCreateFaceTrackerANDROID = caps[70];
        xrDestroyFaceTrackerANDROID = caps[71];
        xrGetFaceStateANDROID = caps[72];
        xrGetFaceCalibrationStateANDROID = caps[73];
        xrCreateLightEstimatorANDROID = caps[74];
        xrDestroyLightEstimatorANDROID = caps[75];
        xrGetLightEstimateANDROID = caps[76];
        xrGetPassthroughCameraStateANDROID = caps[77];
        xrEnumeratePerformanceMetricsCounterPathsANDROID = caps[78];
        xrSetPerformanceMetricsStateANDROID = caps[79];
        xrGetPerformanceMetricsStateANDROID = caps[80];
        xrQueryPerformanceMetricsCounterANDROID = caps[81];
        xrEnumerateRaycastSupportedTrackableTypesANDROID = caps[82];
        xrRaycastANDROID = caps[83];
        xrEnumerateSupportedSemanticLabelSetsANDROID = caps[84];
        xrCreateSceneMeshingTrackerANDROID = caps[85];
        xrDestroySceneMeshingTrackerANDROID = caps[86];
        xrCreateSceneMeshSnapshotANDROID = caps[87];
        xrDestroySceneMeshSnapshotANDROID = caps[88];
        xrGetAllSubmeshStatesANDROID = caps[89];
        xrGetSubmeshDataANDROID = caps[90];
        xrCreateSpatialAnchorSpaceANDROID = caps[91];
        xrCreateSpatialAnchorSpaceFromIdANDROID = caps[92];
        xrCreateSpatialRaycastSnapshotANDROID = caps[93];
        xrEnumerateSpatialAnchorAttachableComponentsANDROID = caps[94];
        xrEnumerateSupportedTrackableTypesANDROID = caps[95];
        xrEnumerateSupportedAnchorTrackableTypesANDROID = caps[96];
        xrCreateTrackableTrackerANDROID = caps[97];
        xrDestroyTrackableTrackerANDROID = caps[98];
        xrGetAllTrackablesANDROID = caps[99];
        xrGetTrackablePlaneANDROID = caps[100];
        xrCreateAnchorSpaceANDROID = caps[101];
        xrCreateTrackableImageDatabaseAsyncANDROID = caps[102];
        xrCreateTrackableImageDatabaseCompleteANDROID = caps[103];
        xrDestroyTrackableImageDatabaseANDROID = caps[104];
        xrAddTrackableImageDatabaseANDROID = caps[105];
        xrRemoveTrackableImageDatabaseANDROID = caps[106];
        xrGetTrackableImageANDROID = caps[107];
        xrGetTrackableMarkerANDROID = caps[108];
        xrGetTrackableObjectANDROID = caps[109];
        xrGetTrackableQrCodeANDROID = caps[110];
        xrCreateBodyTrackerBD = caps[111];
        xrDestroyBodyTrackerBD = caps[112];
        xrLocateBodyJointsBD = caps[113];
        xrEnumerateFacialSimulationModesBD = caps[114];
        xrCreateFaceTrackerBD = caps[115];
        xrDestroyFaceTrackerBD = caps[116];
        xrGetFacialSimulationDataBD = caps[117];
        xrSetFacialSimulationModeBD = caps[118];
        xrGetFacialSimulationModeBD = caps[119];
        xrCreateSpatialAnchorAsyncBD = caps[120];
        xrCreateSpatialAnchorCompleteBD = caps[121];
        xrPersistSpatialAnchorAsyncBD = caps[122];
        xrPersistSpatialAnchorCompleteBD = caps[123];
        xrUnpersistSpatialAnchorAsyncBD = caps[124];
        xrUnpersistSpatialAnchorCompleteBD = caps[125];
        xrShareSpatialAnchorAsyncBD = caps[126];
        xrShareSpatialAnchorCompleteBD = caps[127];
        xrDownloadSharedSpatialAnchorAsyncBD = caps[128];
        xrDownloadSharedSpatialAnchorCompleteBD = caps[129];
        xrEnumerateSupportedAudioSampleRateBD = caps[130];
        xrQueryFramesPerBufferRangeBD = caps[131];
        xrCreateSpatialAudioRendererBD = caps[132];
        xrDestroySpatialAudioRendererBD = caps[133];
        xrCreateSoundObstacleMaterialBD = caps[134];
        xrUpdateSoundObstacleMaterialConfigBD = caps[135];
        xrDestroySoundObstacleMaterialBD = caps[136];
        xrCreateSoundObstacleBD = caps[137];
        xrUpdateSoundObstacleConfigBD = caps[138];
        xrDestroySoundObstacleBD = caps[139];
        xrCreateSoundObjectBD = caps[140];
        xrUpdateSoundObjectConfigBD = caps[141];
        xrSubmitSoundObjectBufferBD = caps[142];
        xrDestroySoundObjectBD = caps[143];
        xrCreateSoundFieldBD = caps[144];
        xrUpdateSoundFieldConfigBD = caps[145];
        xrSubmitSoundFieldBufferBD = caps[146];
        xrDestroySoundFieldBD = caps[147];
        xrWaitAudioPeriodBD = caps[148];
        xrEndAudioPeriodBD = caps[149];
        xrCaptureSceneAsyncBD = caps[150];
        xrCaptureSceneCompleteBD = caps[151];
        xrEnumerateSpatialEntityComponentTypesBD = caps[152];
        xrGetSpatialEntityUuidBD = caps[153];
        xrGetSpatialEntityComponentDataBD = caps[154];
        xrCreateSenseDataProviderBD = caps[155];
        xrStartSenseDataProviderAsyncBD = caps[156];
        xrStartSenseDataProviderCompleteBD = caps[157];
        xrGetSenseDataProviderStateBD = caps[158];
        xrQuerySenseDataAsyncBD = caps[159];
        xrQuerySenseDataCompleteBD = caps[160];
        xrDestroySenseDataSnapshotBD = caps[161];
        xrGetQueriedSenseDataBD = caps[162];
        xrStopSenseDataProviderBD = caps[163];
        xrDestroySenseDataProviderBD = caps[164];
        xrCreateSpatialEntityAnchorBD = caps[165];
        xrDestroyAnchorBD = caps[166];
        xrGetAnchorUuidBD = caps[167];
        xrCreateAnchorSpaceBD = caps[168];
        xrSetInputDeviceActiveEXT = caps[169];
        xrSetInputDeviceStateBoolEXT = caps[170];
        xrSetInputDeviceStateFloatEXT = caps[171];
        xrSetInputDeviceStateVector2fEXT = caps[172];
        xrSetInputDeviceLocationEXT = caps[173];
        xrSetDebugUtilsObjectNameEXT = caps[174];
        xrCreateDebugUtilsMessengerEXT = caps[175];
        xrDestroyDebugUtilsMessengerEXT = caps[176];
        xrSubmitDebugUtilsMessageEXT = caps[177];
        xrSessionBeginDebugUtilsLabelRegionEXT = caps[178];
        xrSessionEndDebugUtilsLabelRegionEXT = caps[179];
        xrSessionInsertDebugUtilsLabelEXT = caps[180];
        xrPollFutureEXT = caps[181];
        xrCancelFutureEXT = caps[182];
        xrCreateHandTrackerEXT = caps[183];
        xrDestroyHandTrackerEXT = caps[184];
        xrLocateHandJointsEXT = caps[185];
        xrEnumerateInteractionRenderModelIdsEXT = caps[186];
        xrEnumerateRenderModelSubactionPathsEXT = caps[187];
        xrGetRenderModelPoseTopLevelUserPathEXT = caps[188];
        xrPerfSettingsSetPerformanceLevelEXT = caps[189];
        xrCreatePlaneDetectorEXT = caps[190];
        xrDestroyPlaneDetectorEXT = caps[191];
        xrBeginPlaneDetectionEXT = caps[192];
        xrGetPlaneDetectionStateEXT = caps[193];
        xrGetPlaneDetectionsEXT = caps[194];
        xrGetPlanePolygonBufferEXT = caps[195];
        xrCreateRenderModelEXT = caps[196];
        xrDestroyRenderModelEXT = caps[197];
        xrGetRenderModelPropertiesEXT = caps[198];
        xrCreateRenderModelSpaceEXT = caps[199];
        xrCreateRenderModelAssetEXT = caps[200];
        xrDestroyRenderModelAssetEXT = caps[201];
        xrGetRenderModelAssetDataEXT = caps[202];
        xrGetRenderModelAssetPropertiesEXT = caps[203];
        xrGetRenderModelStateEXT = caps[204];
        xrCreateSpatialAnchorEXT = caps[205];
        xrEnumerateSpatialCapabilitiesEXT = caps[206];
        xrEnumerateSpatialCapabilityComponentTypesEXT = caps[207];
        xrEnumerateSpatialCapabilityFeaturesEXT = caps[208];
        xrCreateSpatialContextAsyncEXT = caps[209];
        xrCreateSpatialContextCompleteEXT = caps[210];
        xrDestroySpatialContextEXT = caps[211];
        xrCreateSpatialDiscoverySnapshotAsyncEXT = caps[212];
        xrCreateSpatialDiscoverySnapshotCompleteEXT = caps[213];
        xrQuerySpatialComponentDataEXT = caps[214];
        xrDestroySpatialSnapshotEXT = caps[215];
        xrCreateSpatialEntityFromIdEXT = caps[216];
        xrDestroySpatialEntityEXT = caps[217];
        xrCreateSpatialUpdateSnapshotEXT = caps[218];
        xrGetSpatialBufferStringEXT = caps[219];
        xrGetSpatialBufferUint8EXT = caps[220];
        xrGetSpatialBufferUint16EXT = caps[221];
        xrGetSpatialBufferUint32EXT = caps[222];
        xrGetSpatialBufferFloatEXT = caps[223];
        xrGetSpatialBufferVector2fEXT = caps[224];
        xrGetSpatialBufferVector3fEXT = caps[225];
        xrEnumerateSpatialPersistenceScopesEXT = caps[226];
        xrCreateSpatialPersistenceContextAsyncEXT = caps[227];
        xrCreateSpatialPersistenceContextCompleteEXT = caps[228];
        xrDestroySpatialPersistenceContextEXT = caps[229];
        xrPersistSpatialEntityAsyncEXT = caps[230];
        xrPersistSpatialEntityCompleteEXT = caps[231];
        xrUnpersistSpatialEntityAsyncEXT = caps[232];
        xrUnpersistSpatialEntityCompleteEXT = caps[233];
        xrGetStationaryReferenceSpaceGenerationIdEXT = caps[234];
        xrThermalGetTemperatureTrendEXT = caps[235];
        xrCreateBodyTrackerFB = caps[236];
        xrDestroyBodyTrackerFB = caps[237];
        xrLocateBodyJointsFB = caps[238];
        xrGetBodySkeletonFB = caps[239];
        xrEnumerateColorSpacesFB = caps[240];
        xrSetColorSpaceFB = caps[241];
        xrEnumerateDisplayRefreshRatesFB = caps[242];
        xrGetDisplayRefreshRateFB = caps[243];
        xrRequestDisplayRefreshRateFB = caps[244];
        xrCreateEyeTrackerFB = caps[245];
        xrDestroyEyeTrackerFB = caps[246];
        xrGetEyeGazesFB = caps[247];
        xrCreateFaceTrackerFB = caps[248];
        xrDestroyFaceTrackerFB = caps[249];
        xrGetFaceExpressionWeightsFB = caps[250];
        xrCreateFaceTracker2FB = caps[251];
        xrDestroyFaceTracker2FB = caps[252];
        xrGetFaceExpressionWeights2FB = caps[253];
        xrCreateFoveationProfileFB = caps[254];
        xrDestroyFoveationProfileFB = caps[255];
        xrGetHandMeshFB = caps[256];
        xrGetDeviceSampleRateFB = caps[257];
        xrQuerySystemTrackedKeyboardFB = caps[258];
        xrCreateKeyboardSpaceFB = caps[259];
        xrCreatePassthroughFB = caps[260];
        xrDestroyPassthroughFB = caps[261];
        xrPassthroughStartFB = caps[262];
        xrPassthroughPauseFB = caps[263];
        xrCreatePassthroughLayerFB = caps[264];
        xrDestroyPassthroughLayerFB = caps[265];
        xrPassthroughLayerPauseFB = caps[266];
        xrPassthroughLayerResumeFB = caps[267];
        xrPassthroughLayerSetStyleFB = caps[268];
        xrCreateGeometryInstanceFB = caps[269];
        xrDestroyGeometryInstanceFB = caps[270];
        xrGeometryInstanceSetTransformFB = caps[271];
        xrPassthroughLayerSetKeyboardHandsIntensityFB = caps[272];
        xrEnumerateRenderModelPathsFB = caps[273];
        xrGetRenderModelPropertiesFB = caps[274];
        xrLoadRenderModelFB = caps[275];
        xrGetSpaceBoundingBox2DFB = caps[276];
        xrGetSpaceBoundingBox3DFB = caps[277];
        xrGetSpaceSemanticLabelsFB = caps[278];
        xrGetSpaceBoundary2DFB = caps[279];
        xrGetSpaceRoomLayoutFB = caps[280];
        xrRequestSceneCaptureFB = caps[281];
        xrCreateSpatialAnchorFB = caps[282];
        xrGetSpaceUuidFB = caps[283];
        xrEnumerateSpaceSupportedComponentsFB = caps[284];
        xrSetSpaceComponentStatusFB = caps[285];
        xrGetSpaceComponentStatusFB = caps[286];
        xrGetSpaceContainerFB = caps[287];
        xrQuerySpacesFB = caps[288];
        xrRetrieveSpaceQueryResultsFB = caps[289];
        xrShareSpacesFB = caps[290];
        xrSaveSpaceFB = caps[291];
        xrEraseSpaceFB = caps[292];
        xrSaveSpaceListFB = caps[293];
        xrCreateSpaceUserFB = caps[294];
        xrGetSpaceUserIdFB = caps[295];
        xrDestroySpaceUserFB = caps[296];
        xrUpdateSwapchainFB = caps[297];
        xrGetSwapchainStateFB = caps[298];
        xrCreateTriangleMeshFB = caps[299];
        xrDestroyTriangleMeshFB = caps[300];
        xrTriangleMeshGetVertexBufferFB = caps[301];
        xrTriangleMeshGetIndexBufferFB = caps[302];
        xrTriangleMeshBeginUpdateFB = caps[303];
        xrTriangleMeshEndUpdateFB = caps[304];
        xrTriangleMeshBeginVertexBufferUpdateFB = caps[305];
        xrTriangleMeshEndVertexBufferUpdateFB = caps[306];
        xrCreateSpatialAnchorHTC = caps[307];
        xrGetSpatialAnchorNameHTC = caps[308];
        xrCreateBodyTrackerHTC = caps[309];
        xrDestroyBodyTrackerHTC = caps[310];
        xrLocateBodyJointsHTC = caps[311];
        xrGetBodySkeletonHTC = caps[312];
        xrCreateFacialTrackerHTC = caps[313];
        xrDestroyFacialTrackerHTC = caps[314];
        xrGetFacialExpressionsHTC = caps[315];
        xrApplyFoveationHTC = caps[316];
        xrCreatePassthroughHTC = caps[317];
        xrDestroyPassthroughHTC = caps[318];
        xrEnumerateViveTrackerPathsHTCX = caps[319];
        xrConvertTimespecTimeToTimeKHR = caps[320];
        xrConvertTimeToTimespecTimeKHR = caps[321];
        xrStructureTypeToString2KHR = caps[322];
        xrLocateSpacesKHR = caps[323];
        xrGetOpenGLGraphicsRequirementsKHR = caps[324];
        xrGetVisibilityMaskKHR = caps[325];
        xrGetVulkanInstanceExtensionsKHR = caps[326];
        xrGetVulkanDeviceExtensionsKHR = caps[327];
        xrGetVulkanGraphicsDeviceKHR = caps[328];
        xrGetVulkanGraphicsRequirementsKHR = caps[329];
        xrCreateVulkanInstanceKHR = caps[330];
        xrCreateVulkanDeviceKHR = caps[331];
        xrGetVulkanGraphicsDevice2KHR = caps[332];
        xrGetVulkanGraphicsRequirements2KHR = caps[333];
        xrConvertWin32PerformanceCounterToTimeKHR = caps[334];
        xrConvertTimeToWin32PerformanceCounterKHR = caps[335];
        xrSuggestBodyTrackingCalibrationOverrideMETA = caps[336];
        xrResetBodyTrackingCalibrationMETA = caps[337];
        xrRequestBodyTrackingFidelityMETA = caps[338];
        xrRequestBoundaryVisibilityMETA = caps[339];
        xrStartColocationDiscoveryMETA = caps[340];
        xrStopColocationDiscoveryMETA = caps[341];
        xrStartColocationAdvertisementMETA = caps[342];
        xrStopColocationAdvertisementMETA = caps[343];
        xrCreateEnvironmentDepthProviderMETA = caps[344];
        xrDestroyEnvironmentDepthProviderMETA = caps[345];
        xrStartEnvironmentDepthProviderMETA = caps[346];
        xrStopEnvironmentDepthProviderMETA = caps[347];
        xrCreateEnvironmentDepthSwapchainMETA = caps[348];
        xrDestroyEnvironmentDepthSwapchainMETA = caps[349];
        xrEnumerateEnvironmentDepthSwapchainImagesMETA = caps[350];
        xrGetEnvironmentDepthSwapchainStateMETA = caps[351];
        xrAcquireEnvironmentDepthImageMETA = caps[352];
        xrSetEnvironmentDepthHandRemovalMETA = caps[353];
        xrCreateEnvironmentRaycasterAsyncMETA = caps[354];
        xrCreateEnvironmentRaycasterCompleteMETA = caps[355];
        xrDestroyEnvironmentRaycasterMETA = caps[356];
        xrPerformEnvironmentRaycastMETA = caps[357];
        xrGetFoveationEyeTrackedStateMETA = caps[358];
        xrCreatePassthroughColorLutMETA = caps[359];
        xrDestroyPassthroughColorLutMETA = caps[360];
        xrUpdatePassthroughColorLutMETA = caps[361];
        xrGetPassthroughPreferencesMETA = caps[362];
        xrEnumeratePerformanceMetricsCounterPathsMETA = caps[363];
        xrSetPerformanceMetricsStateMETA = caps[364];
        xrGetPerformanceMetricsStateMETA = caps[365];
        xrQueryPerformanceMetricsCounterMETA = caps[366];
        xrGetRecommendedLayerResolutionMETA = caps[367];
        xrResumeSimultaneousHandsAndControllersTrackingMETA = caps[368];
        xrPauseSimultaneousHandsAndControllersTrackingMETA = caps[369];
        xrDiscoverSpacesMETA = caps[370];
        xrRetrieveSpaceDiscoveryResultsMETA = caps[371];
        xrGetSpaceTriangleMeshMETA = caps[372];
        xrSaveSpacesMETA = caps[373];
        xrEraseSpacesMETA = caps[374];
        xrGetSpaceRoomMeshMETA = caps[375];
        xrGetSpaceRoomMeshFaceIndicesMETA = caps[376];
        xrShareSpacesMETA = caps[377];
        xrSetTilePropertiesHintMETA = caps[378];
        xrCreateVirtualKeyboardMETA = caps[379];
        xrDestroyVirtualKeyboardMETA = caps[380];
        xrCreateVirtualKeyboardSpaceMETA = caps[381];
        xrSuggestVirtualKeyboardLocationMETA = caps[382];
        xrGetVirtualKeyboardScaleMETA = caps[383];
        xrSetVirtualKeyboardModelVisibilityMETA = caps[384];
        xrGetVirtualKeyboardModelAnimationStatesMETA = caps[385];
        xrGetVirtualKeyboardDirtyTexturesMETA = caps[386];
        xrGetVirtualKeyboardTextureDataMETA = caps[387];
        xrSendVirtualKeyboardInputMETA = caps[388];
        xrChangeVirtualKeyboardTextContextMETA = caps[389];
        xrCreateSpaceFromCoordinateFrameUIDML = caps[390];
        xrCreateFacialExpressionClientML = caps[391];
        xrDestroyFacialExpressionClientML = caps[392];
        xrGetFacialExpressionBlendShapePropertiesML = caps[393];
        xrEnableLocalizationEventsML = caps[394];
        xrQueryLocalizationMapsML = caps[395];
        xrRequestMapLocalizationML = caps[396];
        xrImportLocalizationMapML = caps[397];
        xrCreateExportedLocalizationMapML = caps[398];
        xrDestroyExportedLocalizationMapML = caps[399];
        xrGetExportedLocalizationMapDataML = caps[400];
        xrCreateMarkerDetectorML = caps[401];
        xrDestroyMarkerDetectorML = caps[402];
        xrSnapshotMarkerDetectorML = caps[403];
        xrGetMarkerDetectorStateML = caps[404];
        xrGetMarkersML = caps[405];
        xrGetMarkerReprojectionErrorML = caps[406];
        xrGetMarkerLengthML = caps[407];
        xrGetMarkerNumberML = caps[408];
        xrGetMarkerStringML = caps[409];
        xrCreateMarkerSpaceML = caps[410];
        xrCreateSpatialAnchorsAsyncML = caps[411];
        xrCreateSpatialAnchorsCompleteML = caps[412];
        xrGetSpatialAnchorStateML = caps[413];
        xrCreateSpatialAnchorsStorageML = caps[414];
        xrDestroySpatialAnchorsStorageML = caps[415];
        xrQuerySpatialAnchorsAsyncML = caps[416];
        xrQuerySpatialAnchorsCompleteML = caps[417];
        xrPublishSpatialAnchorsAsyncML = caps[418];
        xrPublishSpatialAnchorsCompleteML = caps[419];
        xrDeleteSpatialAnchorsAsyncML = caps[420];
        xrDeleteSpatialAnchorsCompleteML = caps[421];
        xrUpdateSpatialAnchorsExpirationAsyncML = caps[422];
        xrUpdateSpatialAnchorsExpirationCompleteML = caps[423];
        xrSetSystemNotificationsML = caps[424];
        xrEnableUserCalibrationEventsML = caps[425];
        xrCreateWorldMeshDetectorML = caps[426];
        xrDestroyWorldMeshDetectorML = caps[427];
        xrRequestWorldMeshStateAsyncML = caps[428];
        xrRequestWorldMeshStateCompleteML = caps[429];
        xrGetWorldMeshBufferRecommendSizeML = caps[430];
        xrAllocateWorldMeshBufferML = caps[431];
        xrFreeWorldMeshBufferML = caps[432];
        xrRequestWorldMeshAsyncML = caps[433];
        xrRequestWorldMeshCompleteML = caps[434];
        xrApplyForceFeedbackCurlMNDX = caps[435];
        xrEnumerateReprojectionModesMSFT = caps[436];
        xrGetControllerModelKeyMSFT = caps[437];
        xrLoadControllerModelMSFT = caps[438];
        xrGetControllerModelPropertiesMSFT = caps[439];
        xrGetControllerModelStateMSFT = caps[440];
        xrCreateHandMeshSpaceMSFT = caps[441];
        xrUpdateHandMeshMSFT = caps[442];
        xrCreateSpatialAnchorFromPerceptionAnchorMSFT = caps[443];
        xrTryGetPerceptionAnchorFromSpatialAnchorMSFT = caps[444];
        xrGetSceneMarkerRawDataMSFT = caps[445];
        xrGetSceneMarkerDecodedStringMSFT = caps[446];
        xrEnumerateSceneComputeFeaturesMSFT = caps[447];
        xrCreateSceneObserverMSFT = caps[448];
        xrDestroySceneObserverMSFT = caps[449];
        xrCreateSceneMSFT = caps[450];
        xrDestroySceneMSFT = caps[451];
        xrComputeNewSceneMSFT = caps[452];
        xrGetSceneComputeStateMSFT = caps[453];
        xrGetSceneComponentsMSFT = caps[454];
        xrLocateSceneComponentsMSFT = caps[455];
        xrGetSceneMeshBuffersMSFT = caps[456];
        xrDeserializeSceneMSFT = caps[457];
        xrGetSerializedSceneFragmentDataMSFT = caps[458];
        xrCreateSpatialAnchorMSFT = caps[459];
        xrCreateSpatialAnchorSpaceMSFT = caps[460];
        xrDestroySpatialAnchorMSFT = caps[461];
        xrCreateSpatialAnchorStoreConnectionMSFT = caps[462];
        xrDestroySpatialAnchorStoreConnectionMSFT = caps[463];
        xrPersistSpatialAnchorMSFT = caps[464];
        xrEnumeratePersistedSpatialAnchorNamesMSFT = caps[465];
        xrCreateSpatialAnchorFromPersistedNameMSFT = caps[466];
        xrUnpersistSpatialAnchorMSFT = caps[467];
        xrClearSpatialAnchorStoreMSFT = caps[468];
        xrCreateSpatialGraphNodeSpaceMSFT = caps[469];
        xrTryCreateSpatialGraphStaticNodeBindingMSFT = caps[470];
        xrDestroySpatialGraphNodeBindingMSFT = caps[471];
        xrGetSpatialGraphNodeBindingPropertiesMSFT = caps[472];
        xrGetAudioOutputDeviceGuidOculus = caps[473];
        xrGetAudioInputDeviceGuidOculus = caps[474];
        xrEnumerateExternalCamerasOCULUS = caps[475];
        xrGetHandGestureQCOM = caps[476];
        xrSetTrackingOptimizationSettingsHintQCOM = caps[477];
        xrSetEnvironmentDepthEstimationVARJO = caps[478];
        xrSetMarkerTrackingVARJO = caps[479];
        xrSetMarkerTrackingTimeoutVARJO = caps[480];
        xrSetMarkerTrackingPredictionVARJO = caps[481];
        xrGetMarkerSizeVARJO = caps[482];
        xrCreateMarkerSpaceVARJO = caps[483];
        xrSetViewOffsetVARJO = caps[484];
    }

    private static boolean check_XR10(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("OpenXR10")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50
        },
            "xrDestroyInstance", "xrGetInstanceProperties", "xrPollEvent", "xrResultToString", "xrStructureTypeToString", "xrGetSystem", 
            "xrGetSystemProperties", "xrEnumerateEnvironmentBlendModes", "xrCreateSession", "xrDestroySession", "xrEnumerateReferenceSpaces", 
            "xrCreateReferenceSpace", "xrGetReferenceSpaceBoundsRect", "xrCreateActionSpace", "xrLocateSpace", "xrDestroySpace", 
            "xrEnumerateViewConfigurations", "xrGetViewConfigurationProperties", "xrEnumerateViewConfigurationViews", "xrEnumerateSwapchainFormats", 
            "xrCreateSwapchain", "xrDestroySwapchain", "xrEnumerateSwapchainImages", "xrAcquireSwapchainImage", "xrWaitSwapchainImage", 
            "xrReleaseSwapchainImage", "xrBeginSession", "xrEndSession", "xrRequestExitSession", "xrWaitFrame", "xrBeginFrame", "xrEndFrame", "xrLocateViews", 
            "xrStringToPath", "xrPathToString", "xrCreateActionSet", "xrDestroyActionSet", "xrCreateAction", "xrDestroyAction", 
            "xrSuggestInteractionProfileBindings", "xrAttachSessionActionSets", "xrGetCurrentInteractionProfile", "xrGetActionStateBoolean", 
            "xrGetActionStateFloat", "xrGetActionStateVector2f", "xrGetActionStatePose", "xrSyncActions", "xrEnumerateBoundSourcesForAction", 
            "xrGetInputSourceLocalizedName", "xrApplyHapticFeedback", "xrStopHapticFeedback"
        ) || reportMissing("XR", "OpenXR10");
    }

    private static boolean check_XR11(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("OpenXR11")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            51
        },
            "xrLocateSpaces"
        ) || reportMissing("XR", "OpenXR11");
    }

    private static boolean check_ALMALENCE_digital_lens_control(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ALMALENCE_digital_lens_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            52
        },
            "xrSetDigitalLensControlALMALENCE"
        ) || reportMissing("XR", "XR_ALMALENCE_digital_lens_control");
    }

    private static boolean check_ANDROID_anchor_sharing_export(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_anchor_sharing_export")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            53, 54
        },
            "xrShareAnchorANDROID", "xrUnshareAnchorANDROID"
        ) || reportMissing("XR", "XR_ANDROID_anchor_sharing_export");
    }

    private static boolean check_ANDROID_composition_layer_passthrough_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_composition_layer_passthrough_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            55, 56, 57
        },
            "xrCreatePassthroughLayerANDROID", "xrDestroyPassthroughLayerANDROID", "xrSetPassthroughLayerMeshANDROID"
        ) || reportMissing("XR", "XR_ANDROID_composition_layer_passthrough_mesh");
    }

    private static boolean check_ANDROID_device_anchor_persistence(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_device_anchor_persistence")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            58, 59, 60, 61, 62, 63, 64, 65
        },
            "xrEnumerateSupportedPersistenceAnchorTypesANDROID", "xrCreateDeviceAnchorPersistenceANDROID", "xrDestroyDeviceAnchorPersistenceANDROID", 
            "xrPersistAnchorANDROID", "xrGetAnchorPersistStateANDROID", "xrCreatePersistedAnchorSpaceANDROID", "xrEnumeratePersistedAnchorsANDROID", 
            "xrUnpersistAnchorANDROID"
        ) || reportMissing("XR", "XR_ANDROID_device_anchor_persistence");
    }

    private static boolean check_ANDROID_eye_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_eye_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            66, 67, 68, 69
        },
            "xrCreateEyeTrackerANDROID", "xrDestroyEyeTrackerANDROID", "xrGetFineTrackingEyesInfoANDROID", "xrGetCoarseTrackingEyesInfoANDROID"
        ) || reportMissing("XR", "XR_ANDROID_eye_tracking");
    }

    private static boolean check_ANDROID_face_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_face_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            70, 71, 72, 73
        },
            "xrCreateFaceTrackerANDROID", "xrDestroyFaceTrackerANDROID", "xrGetFaceStateANDROID", "xrGetFaceCalibrationStateANDROID"
        ) || reportMissing("XR", "XR_ANDROID_face_tracking");
    }

    private static boolean check_ANDROID_light_estimation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_light_estimation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            74, 75, 76
        },
            "xrCreateLightEstimatorANDROID", "xrDestroyLightEstimatorANDROID", "xrGetLightEstimateANDROID"
        ) || reportMissing("XR", "XR_ANDROID_light_estimation");
    }

    private static boolean check_ANDROID_passthrough_camera_state(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_passthrough_camera_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            77
        },
            "xrGetPassthroughCameraStateANDROID"
        ) || reportMissing("XR", "XR_ANDROID_passthrough_camera_state");
    }

    private static boolean check_ANDROID_performance_metrics(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_performance_metrics")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            78, 79, 80, 81
        },
            "xrEnumeratePerformanceMetricsCounterPathsANDROID", "xrSetPerformanceMetricsStateANDROID", "xrGetPerformanceMetricsStateANDROID", 
            "xrQueryPerformanceMetricsCounterANDROID"
        ) || reportMissing("XR", "XR_ANDROID_performance_metrics");
    }

    private static boolean check_ANDROID_raycast(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_raycast")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            82, 83
        },
            "xrEnumerateRaycastSupportedTrackableTypesANDROID", "xrRaycastANDROID"
        ) || reportMissing("XR", "XR_ANDROID_raycast");
    }

    private static boolean check_ANDROID_scene_meshing(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_scene_meshing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            84, 85, 86, 87, 88, 89, 90
        },
            "xrEnumerateSupportedSemanticLabelSetsANDROID", "xrCreateSceneMeshingTrackerANDROID", "xrDestroySceneMeshingTrackerANDROID", 
            "xrCreateSceneMeshSnapshotANDROID", "xrDestroySceneMeshSnapshotANDROID", "xrGetAllSubmeshStatesANDROID", "xrGetSubmeshDataANDROID"
        ) || reportMissing("XR", "XR_ANDROID_scene_meshing");
    }

    private static boolean check_ANDROID_spatial_anchor_space(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_spatial_anchor_space")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            91, 92
        },
            "xrCreateSpatialAnchorSpaceANDROID", "xrCreateSpatialAnchorSpaceFromIdANDROID"
        ) || reportMissing("XR", "XR_ANDROID_spatial_anchor_space");
    }

    private static boolean check_ANDROID_spatial_discovery_raycast(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_spatial_discovery_raycast")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            93
        },
            "xrCreateSpatialRaycastSnapshotANDROID"
        ) || reportMissing("XR", "XR_ANDROID_spatial_discovery_raycast");
    }

    private static boolean check_ANDROID_spatial_entity_bound_anchor(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_spatial_entity_bound_anchor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            94
        },
            "xrEnumerateSpatialAnchorAttachableComponentsANDROID"
        ) || reportMissing("XR", "XR_ANDROID_spatial_entity_bound_anchor");
    }

    private static boolean check_ANDROID_trackables(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_trackables")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            95, 96, 97, 98, 99, 100, 101
        },
            "xrEnumerateSupportedTrackableTypesANDROID", "xrEnumerateSupportedAnchorTrackableTypesANDROID", "xrCreateTrackableTrackerANDROID", 
            "xrDestroyTrackableTrackerANDROID", "xrGetAllTrackablesANDROID", "xrGetTrackablePlaneANDROID", "xrCreateAnchorSpaceANDROID"
        ) || reportMissing("XR", "XR_ANDROID_trackables");
    }

    private static boolean check_ANDROID_trackables_image(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_trackables_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            102, 103, 104, 105, 106, 107
        },
            "xrCreateTrackableImageDatabaseAsyncANDROID", "xrCreateTrackableImageDatabaseCompleteANDROID", "xrDestroyTrackableImageDatabaseANDROID", 
            "xrAddTrackableImageDatabaseANDROID", "xrRemoveTrackableImageDatabaseANDROID", "xrGetTrackableImageANDROID"
        ) || reportMissing("XR", "XR_ANDROID_trackables_image");
    }

    private static boolean check_ANDROID_trackables_marker(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_trackables_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            108
        },
            "xrGetTrackableMarkerANDROID"
        ) || reportMissing("XR", "XR_ANDROID_trackables_marker");
    }

    private static boolean check_ANDROID_trackables_object(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_trackables_object")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            109
        },
            "xrGetTrackableObjectANDROID"
        ) || reportMissing("XR", "XR_ANDROID_trackables_object");
    }

    private static boolean check_ANDROID_trackables_qr_code(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ANDROID_trackables_qr_code")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            110
        },
            "xrGetTrackableQrCodeANDROID"
        ) || reportMissing("XR", "XR_ANDROID_trackables_qr_code");
    }

    private static boolean check_BD_body_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_BD_body_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            111, 112, 113
        },
            "xrCreateBodyTrackerBD", "xrDestroyBodyTrackerBD", "xrLocateBodyJointsBD"
        ) || reportMissing("XR", "XR_BD_body_tracking");
    }

    private static boolean check_BD_facial_simulation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_BD_facial_simulation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            114, 115, 116, 117, 118, 119
        },
            "xrEnumerateFacialSimulationModesBD", "xrCreateFaceTrackerBD", "xrDestroyFaceTrackerBD", "xrGetFacialSimulationDataBD", 
            "xrSetFacialSimulationModeBD", "xrGetFacialSimulationModeBD"
        ) || reportMissing("XR", "XR_BD_facial_simulation");
    }

    private static boolean check_BD_spatial_anchor(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_BD_spatial_anchor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            120, 121, 122, 123, 124, 125
        },
            "xrCreateSpatialAnchorAsyncBD", "xrCreateSpatialAnchorCompleteBD", "xrPersistSpatialAnchorAsyncBD", "xrPersistSpatialAnchorCompleteBD", 
            "xrUnpersistSpatialAnchorAsyncBD", "xrUnpersistSpatialAnchorCompleteBD"
        ) || reportMissing("XR", "XR_BD_spatial_anchor");
    }

    private static boolean check_BD_spatial_anchor_sharing(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_BD_spatial_anchor_sharing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            126, 127, 128, 129
        },
            "xrShareSpatialAnchorAsyncBD", "xrShareSpatialAnchorCompleteBD", "xrDownloadSharedSpatialAnchorAsyncBD", "xrDownloadSharedSpatialAnchorCompleteBD"
        ) || reportMissing("XR", "XR_BD_spatial_anchor_sharing");
    }

    private static boolean check_BD_spatial_audio_rendering(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_BD_spatial_audio_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149
        },
            "xrEnumerateSupportedAudioSampleRateBD", "xrQueryFramesPerBufferRangeBD", "xrCreateSpatialAudioRendererBD", "xrDestroySpatialAudioRendererBD", 
            "xrCreateSoundObstacleMaterialBD", "xrUpdateSoundObstacleMaterialConfigBD", "xrDestroySoundObstacleMaterialBD", "xrCreateSoundObstacleBD", 
            "xrUpdateSoundObstacleConfigBD", "xrDestroySoundObstacleBD", "xrCreateSoundObjectBD", "xrUpdateSoundObjectConfigBD", "xrSubmitSoundObjectBufferBD", 
            "xrDestroySoundObjectBD", "xrCreateSoundFieldBD", "xrUpdateSoundFieldConfigBD", "xrSubmitSoundFieldBufferBD", "xrDestroySoundFieldBD", 
            "xrWaitAudioPeriodBD", "xrEndAudioPeriodBD"
        ) || reportMissing("XR", "XR_BD_spatial_audio_rendering");
    }

    private static boolean check_BD_spatial_scene(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_BD_spatial_scene")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            150, 151
        },
            "xrCaptureSceneAsyncBD", "xrCaptureSceneCompleteBD"
        ) || reportMissing("XR", "XR_BD_spatial_scene");
    }

    private static boolean check_BD_spatial_sensing(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_BD_spatial_sensing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168
        },
            "xrEnumerateSpatialEntityComponentTypesBD", "xrGetSpatialEntityUuidBD", "xrGetSpatialEntityComponentDataBD", "xrCreateSenseDataProviderBD", 
            "xrStartSenseDataProviderAsyncBD", "xrStartSenseDataProviderCompleteBD", "xrGetSenseDataProviderStateBD", "xrQuerySenseDataAsyncBD", 
            "xrQuerySenseDataCompleteBD", "xrDestroySenseDataSnapshotBD", "xrGetQueriedSenseDataBD", "xrStopSenseDataProviderBD", 
            "xrDestroySenseDataProviderBD", "xrCreateSpatialEntityAnchorBD", "xrDestroyAnchorBD", "xrGetAnchorUuidBD", "xrCreateAnchorSpaceBD"
        ) || reportMissing("XR", "XR_BD_spatial_sensing");
    }

    private static boolean check_EXT_conformance_automation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_conformance_automation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            169, 170, 171, 172, 173
        },
            "xrSetInputDeviceActiveEXT", "xrSetInputDeviceStateBoolEXT", "xrSetInputDeviceStateFloatEXT", "xrSetInputDeviceStateVector2fEXT", 
            "xrSetInputDeviceLocationEXT"
        ) || reportMissing("XR", "XR_EXT_conformance_automation");
    }

    private static boolean check_EXT_debug_utils(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_debug_utils")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            174, 175, 176, 177, 178, 179, 180
        },
            "xrSetDebugUtilsObjectNameEXT", "xrCreateDebugUtilsMessengerEXT", "xrDestroyDebugUtilsMessengerEXT", "xrSubmitDebugUtilsMessageEXT", 
            "xrSessionBeginDebugUtilsLabelRegionEXT", "xrSessionEndDebugUtilsLabelRegionEXT", "xrSessionInsertDebugUtilsLabelEXT"
        ) || reportMissing("XR", "XR_EXT_debug_utils");
    }

    private static boolean check_EXT_future(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_future")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            181, 182
        },
            "xrPollFutureEXT", "xrCancelFutureEXT"
        ) || reportMissing("XR", "XR_EXT_future");
    }

    private static boolean check_EXT_hand_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_hand_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            183, 184, 185
        },
            "xrCreateHandTrackerEXT", "xrDestroyHandTrackerEXT", "xrLocateHandJointsEXT"
        ) || reportMissing("XR", "XR_EXT_hand_tracking");
    }

    private static boolean check_EXT_interaction_render_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_interaction_render_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            186, 187, 188
        },
            "xrEnumerateInteractionRenderModelIdsEXT", "xrEnumerateRenderModelSubactionPathsEXT", "xrGetRenderModelPoseTopLevelUserPathEXT"
        ) || reportMissing("XR", "XR_EXT_interaction_render_model");
    }

    private static boolean check_EXT_performance_settings(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_performance_settings")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            189
        },
            "xrPerfSettingsSetPerformanceLevelEXT"
        ) || reportMissing("XR", "XR_EXT_performance_settings");
    }

    private static boolean check_EXT_plane_detection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_plane_detection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            190, 191, 192, 193, 194, 195
        },
            "xrCreatePlaneDetectorEXT", "xrDestroyPlaneDetectorEXT", "xrBeginPlaneDetectionEXT", "xrGetPlaneDetectionStateEXT", "xrGetPlaneDetectionsEXT", 
            "xrGetPlanePolygonBufferEXT"
        ) || reportMissing("XR", "XR_EXT_plane_detection");
    }

    private static boolean check_EXT_render_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_render_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            196, 197, 198, 199, 200, 201, 202, 203, 204
        },
            "xrCreateRenderModelEXT", "xrDestroyRenderModelEXT", "xrGetRenderModelPropertiesEXT", "xrCreateRenderModelSpaceEXT", "xrCreateRenderModelAssetEXT", 
            "xrDestroyRenderModelAssetEXT", "xrGetRenderModelAssetDataEXT", "xrGetRenderModelAssetPropertiesEXT", "xrGetRenderModelStateEXT"
        ) || reportMissing("XR", "XR_EXT_render_model");
    }

    private static boolean check_EXT_spatial_anchor(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_spatial_anchor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            205
        },
            "xrCreateSpatialAnchorEXT"
        ) || reportMissing("XR", "XR_EXT_spatial_anchor");
    }

    private static boolean check_EXT_spatial_entity(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_spatial_entity")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225
        },
            "xrEnumerateSpatialCapabilitiesEXT", "xrEnumerateSpatialCapabilityComponentTypesEXT", "xrEnumerateSpatialCapabilityFeaturesEXT", 
            "xrCreateSpatialContextAsyncEXT", "xrCreateSpatialContextCompleteEXT", "xrDestroySpatialContextEXT", "xrCreateSpatialDiscoverySnapshotAsyncEXT", 
            "xrCreateSpatialDiscoverySnapshotCompleteEXT", "xrQuerySpatialComponentDataEXT", "xrDestroySpatialSnapshotEXT", "xrCreateSpatialEntityFromIdEXT", 
            "xrDestroySpatialEntityEXT", "xrCreateSpatialUpdateSnapshotEXT", "xrGetSpatialBufferStringEXT", "xrGetSpatialBufferUint8EXT", 
            "xrGetSpatialBufferUint16EXT", "xrGetSpatialBufferUint32EXT", "xrGetSpatialBufferFloatEXT", "xrGetSpatialBufferVector2fEXT", 
            "xrGetSpatialBufferVector3fEXT"
        ) || reportMissing("XR", "XR_EXT_spatial_entity");
    }

    private static boolean check_EXT_spatial_persistence(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_spatial_persistence")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            226, 227, 228, 229
        },
            "xrEnumerateSpatialPersistenceScopesEXT", "xrCreateSpatialPersistenceContextAsyncEXT", "xrCreateSpatialPersistenceContextCompleteEXT", 
            "xrDestroySpatialPersistenceContextEXT"
        ) || reportMissing("XR", "XR_EXT_spatial_persistence");
    }

    private static boolean check_EXT_spatial_persistence_operations(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_spatial_persistence_operations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            230, 231, 232, 233
        },
            "xrPersistSpatialEntityAsyncEXT", "xrPersistSpatialEntityCompleteEXT", "xrUnpersistSpatialEntityAsyncEXT", "xrUnpersistSpatialEntityCompleteEXT"
        ) || reportMissing("XR", "XR_EXT_spatial_persistence_operations");
    }

    private static boolean check_EXT_stationary_reference_space(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_stationary_reference_space")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            234
        },
            "xrGetStationaryReferenceSpaceGenerationIdEXT"
        ) || reportMissing("XR", "XR_EXT_stationary_reference_space");
    }

    private static boolean check_EXT_thermal_query(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_thermal_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            235
        },
            "xrThermalGetTemperatureTrendEXT"
        ) || reportMissing("XR", "XR_EXT_thermal_query");
    }

    private static boolean check_FB_body_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_body_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            236, 237, 238, 239
        },
            "xrCreateBodyTrackerFB", "xrDestroyBodyTrackerFB", "xrLocateBodyJointsFB", "xrGetBodySkeletonFB"
        ) || reportMissing("XR", "XR_FB_body_tracking");
    }

    private static boolean check_FB_color_space(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_color_space")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            240, 241
        },
            "xrEnumerateColorSpacesFB", "xrSetColorSpaceFB"
        ) || reportMissing("XR", "XR_FB_color_space");
    }

    private static boolean check_FB_display_refresh_rate(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_display_refresh_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            242, 243, 244
        },
            "xrEnumerateDisplayRefreshRatesFB", "xrGetDisplayRefreshRateFB", "xrRequestDisplayRefreshRateFB"
        ) || reportMissing("XR", "XR_FB_display_refresh_rate");
    }

    private static boolean check_FB_eye_tracking_social(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_eye_tracking_social")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            245, 246, 247
        },
            "xrCreateEyeTrackerFB", "xrDestroyEyeTrackerFB", "xrGetEyeGazesFB"
        ) || reportMissing("XR", "XR_FB_eye_tracking_social");
    }

    private static boolean check_FB_face_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_face_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            248, 249, 250
        },
            "xrCreateFaceTrackerFB", "xrDestroyFaceTrackerFB", "xrGetFaceExpressionWeightsFB"
        ) || reportMissing("XR", "XR_FB_face_tracking");
    }

    private static boolean check_FB_face_tracking2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_face_tracking2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            251, 252, 253
        },
            "xrCreateFaceTracker2FB", "xrDestroyFaceTracker2FB", "xrGetFaceExpressionWeights2FB"
        ) || reportMissing("XR", "XR_FB_face_tracking2");
    }

    private static boolean check_FB_foveation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_foveation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            254, 255
        },
            "xrCreateFoveationProfileFB", "xrDestroyFoveationProfileFB"
        ) || reportMissing("XR", "XR_FB_foveation");
    }

    private static boolean check_FB_hand_tracking_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_hand_tracking_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            256
        },
            "xrGetHandMeshFB"
        ) || reportMissing("XR", "XR_FB_hand_tracking_mesh");
    }

    private static boolean check_FB_haptic_pcm(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_haptic_pcm")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            257
        },
            "xrGetDeviceSampleRateFB"
        ) || reportMissing("XR", "XR_FB_haptic_pcm");
    }

    private static boolean check_FB_keyboard_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_keyboard_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            258, 259
        },
            "xrQuerySystemTrackedKeyboardFB", "xrCreateKeyboardSpaceFB"
        ) || reportMissing("XR", "XR_FB_keyboard_tracking");
    }

    private static boolean check_FB_passthrough(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_passthrough")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271
        },
            "xrCreatePassthroughFB", "xrDestroyPassthroughFB", "xrPassthroughStartFB", "xrPassthroughPauseFB", "xrCreatePassthroughLayerFB", 
            "xrDestroyPassthroughLayerFB", "xrPassthroughLayerPauseFB", "xrPassthroughLayerResumeFB", "xrPassthroughLayerSetStyleFB", 
            "xrCreateGeometryInstanceFB", "xrDestroyGeometryInstanceFB", "xrGeometryInstanceSetTransformFB"
        ) || reportMissing("XR", "XR_FB_passthrough");
    }

    private static boolean check_FB_passthrough_keyboard_hands(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_passthrough_keyboard_hands")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            272
        },
            "xrPassthroughLayerSetKeyboardHandsIntensityFB"
        ) || reportMissing("XR", "XR_FB_passthrough_keyboard_hands");
    }

    private static boolean check_FB_render_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_render_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            273, 274, 275
        },
            "xrEnumerateRenderModelPathsFB", "xrGetRenderModelPropertiesFB", "xrLoadRenderModelFB"
        ) || reportMissing("XR", "XR_FB_render_model");
    }

    private static boolean check_FB_scene(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_scene")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            276, 277, 278, 279, 280
        },
            "xrGetSpaceBoundingBox2DFB", "xrGetSpaceBoundingBox3DFB", "xrGetSpaceSemanticLabelsFB", "xrGetSpaceBoundary2DFB", "xrGetSpaceRoomLayoutFB"
        ) || reportMissing("XR", "XR_FB_scene");
    }

    private static boolean check_FB_scene_capture(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_scene_capture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            281
        },
            "xrRequestSceneCaptureFB"
        ) || reportMissing("XR", "XR_FB_scene_capture");
    }

    private static boolean check_FB_spatial_entity(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            282, 283, 284, 285, 286
        },
            "xrCreateSpatialAnchorFB", "xrGetSpaceUuidFB", "xrEnumerateSpaceSupportedComponentsFB", "xrSetSpaceComponentStatusFB", 
            "xrGetSpaceComponentStatusFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity");
    }

    private static boolean check_FB_spatial_entity_container(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_container")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            287
        },
            "xrGetSpaceContainerFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_container");
    }

    private static boolean check_FB_spatial_entity_query(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            288, 289
        },
            "xrQuerySpacesFB", "xrRetrieveSpaceQueryResultsFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_query");
    }

    private static boolean check_FB_spatial_entity_sharing(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_sharing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            290
        },
            "xrShareSpacesFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_sharing");
    }

    private static boolean check_FB_spatial_entity_storage(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_storage")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            291, 292
        },
            "xrSaveSpaceFB", "xrEraseSpaceFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_storage");
    }

    private static boolean check_FB_spatial_entity_storage_batch(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_storage_batch")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            293
        },
            "xrSaveSpaceListFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_storage_batch");
    }

    private static boolean check_FB_spatial_entity_user(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_user")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            294, 295, 296
        },
            "xrCreateSpaceUserFB", "xrGetSpaceUserIdFB", "xrDestroySpaceUserFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_user");
    }

    private static boolean check_FB_swapchain_update_state(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_swapchain_update_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            297, 298
        },
            "xrUpdateSwapchainFB", "xrGetSwapchainStateFB"
        ) || reportMissing("XR", "XR_FB_swapchain_update_state");
    }

    private static boolean check_FB_triangle_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_triangle_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            299, 300, 301, 302, 303, 304, 305, 306
        },
            "xrCreateTriangleMeshFB", "xrDestroyTriangleMeshFB", "xrTriangleMeshGetVertexBufferFB", "xrTriangleMeshGetIndexBufferFB", 
            "xrTriangleMeshBeginUpdateFB", "xrTriangleMeshEndUpdateFB", "xrTriangleMeshBeginVertexBufferUpdateFB", "xrTriangleMeshEndVertexBufferUpdateFB"
        ) || reportMissing("XR", "XR_FB_triangle_mesh");
    }

    private static boolean check_HTC_anchor(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_anchor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            307, 308
        },
            "xrCreateSpatialAnchorHTC", "xrGetSpatialAnchorNameHTC"
        ) || reportMissing("XR", "XR_HTC_anchor");
    }

    private static boolean check_HTC_body_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_body_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            309, 310, 311, 312
        },
            "xrCreateBodyTrackerHTC", "xrDestroyBodyTrackerHTC", "xrLocateBodyJointsHTC", "xrGetBodySkeletonHTC"
        ) || reportMissing("XR", "XR_HTC_body_tracking");
    }

    private static boolean check_HTC_facial_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_facial_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            313, 314, 315
        },
            "xrCreateFacialTrackerHTC", "xrDestroyFacialTrackerHTC", "xrGetFacialExpressionsHTC"
        ) || reportMissing("XR", "XR_HTC_facial_tracking");
    }

    private static boolean check_HTC_foveation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_foveation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            316
        },
            "xrApplyFoveationHTC"
        ) || reportMissing("XR", "XR_HTC_foveation");
    }

    private static boolean check_HTC_passthrough(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_passthrough")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            317, 318
        },
            "xrCreatePassthroughHTC", "xrDestroyPassthroughHTC"
        ) || reportMissing("XR", "XR_HTC_passthrough");
    }

    private static boolean check_HTCX_vive_tracker_interaction(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTCX_vive_tracker_interaction")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            319
        },
            "xrEnumerateViveTrackerPathsHTCX"
        ) || reportMissing("XR", "XR_HTCX_vive_tracker_interaction");
    }

    private static boolean check_KHR_convert_timespec_time(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_convert_timespec_time")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            320, 321
        },
            "xrConvertTimespecTimeToTimeKHR", "xrConvertTimeToTimespecTimeKHR"
        ) || reportMissing("XR", "XR_KHR_convert_timespec_time");
    }

    private static boolean check_KHR_extended_struct_name_lengths(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_extended_struct_name_lengths")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            322
        },
            "xrStructureTypeToString2KHR"
        ) || reportMissing("XR", "XR_KHR_extended_struct_name_lengths");
    }

    private static boolean check_KHR_locate_spaces(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_locate_spaces")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            323
        },
            "xrLocateSpacesKHR"
        ) || reportMissing("XR", "XR_KHR_locate_spaces");
    }

    private static boolean check_KHR_opengl_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_opengl_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            324
        },
            "xrGetOpenGLGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_opengl_enable");
    }

    private static boolean check_KHR_visibility_mask(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_visibility_mask")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            325
        },
            "xrGetVisibilityMaskKHR"
        ) || reportMissing("XR", "XR_KHR_visibility_mask");
    }

    private static boolean check_KHR_vulkan_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_vulkan_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            326, 327, 328, 329
        },
            "xrGetVulkanInstanceExtensionsKHR", "xrGetVulkanDeviceExtensionsKHR", "xrGetVulkanGraphicsDeviceKHR", "xrGetVulkanGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_vulkan_enable");
    }

    private static boolean check_KHR_vulkan_enable2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_vulkan_enable2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            330, 331, 332, 333
        },
            "xrCreateVulkanInstanceKHR", "xrCreateVulkanDeviceKHR", "xrGetVulkanGraphicsDevice2KHR", "xrGetVulkanGraphicsRequirements2KHR"
        ) || reportMissing("XR", "XR_KHR_vulkan_enable2");
    }

    private static boolean check_KHR_win32_convert_performance_counter_time(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_win32_convert_performance_counter_time")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            334, 335
        },
            "xrConvertWin32PerformanceCounterToTimeKHR", "xrConvertTimeToWin32PerformanceCounterKHR"
        ) || reportMissing("XR", "XR_KHR_win32_convert_performance_counter_time");
    }

    private static boolean check_META_body_tracking_calibration(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_body_tracking_calibration")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            336, 337
        },
            "xrSuggestBodyTrackingCalibrationOverrideMETA", "xrResetBodyTrackingCalibrationMETA"
        ) || reportMissing("XR", "XR_META_body_tracking_calibration");
    }

    private static boolean check_META_body_tracking_fidelity(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_body_tracking_fidelity")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            338
        },
            "xrRequestBodyTrackingFidelityMETA"
        ) || reportMissing("XR", "XR_META_body_tracking_fidelity");
    }

    private static boolean check_META_boundary_visibility(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_boundary_visibility")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            339
        },
            "xrRequestBoundaryVisibilityMETA"
        ) || reportMissing("XR", "XR_META_boundary_visibility");
    }

    private static boolean check_META_colocation_discovery(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_colocation_discovery")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            340, 341, 342, 343
        },
            "xrStartColocationDiscoveryMETA", "xrStopColocationDiscoveryMETA", "xrStartColocationAdvertisementMETA", "xrStopColocationAdvertisementMETA"
        ) || reportMissing("XR", "XR_META_colocation_discovery");
    }

    private static boolean check_META_environment_depth(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_environment_depth")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            344, 345, 346, 347, 348, 349, 350, 351, 352, 353
        },
            "xrCreateEnvironmentDepthProviderMETA", "xrDestroyEnvironmentDepthProviderMETA", "xrStartEnvironmentDepthProviderMETA", 
            "xrStopEnvironmentDepthProviderMETA", "xrCreateEnvironmentDepthSwapchainMETA", "xrDestroyEnvironmentDepthSwapchainMETA", 
            "xrEnumerateEnvironmentDepthSwapchainImagesMETA", "xrGetEnvironmentDepthSwapchainStateMETA", "xrAcquireEnvironmentDepthImageMETA", 
            "xrSetEnvironmentDepthHandRemovalMETA"
        ) || reportMissing("XR", "XR_META_environment_depth");
    }

    private static boolean check_META_environment_raycast(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_environment_raycast")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            354, 355, 356, 357
        },
            "xrCreateEnvironmentRaycasterAsyncMETA", "xrCreateEnvironmentRaycasterCompleteMETA", "xrDestroyEnvironmentRaycasterMETA", 
            "xrPerformEnvironmentRaycastMETA"
        ) || reportMissing("XR", "XR_META_environment_raycast");
    }

    private static boolean check_META_foveation_eye_tracked(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_foveation_eye_tracked")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            358
        },
            "xrGetFoveationEyeTrackedStateMETA"
        ) || reportMissing("XR", "XR_META_foveation_eye_tracked");
    }

    private static boolean check_META_passthrough_color_lut(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_passthrough_color_lut")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            359, 360, 361
        },
            "xrCreatePassthroughColorLutMETA", "xrDestroyPassthroughColorLutMETA", "xrUpdatePassthroughColorLutMETA"
        ) || reportMissing("XR", "XR_META_passthrough_color_lut");
    }

    private static boolean check_META_passthrough_preferences(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_passthrough_preferences")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            362
        },
            "xrGetPassthroughPreferencesMETA"
        ) || reportMissing("XR", "XR_META_passthrough_preferences");
    }

    private static boolean check_META_performance_metrics(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_performance_metrics")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            363, 364, 365, 366
        },
            "xrEnumeratePerformanceMetricsCounterPathsMETA", "xrSetPerformanceMetricsStateMETA", "xrGetPerformanceMetricsStateMETA", 
            "xrQueryPerformanceMetricsCounterMETA"
        ) || reportMissing("XR", "XR_META_performance_metrics");
    }

    private static boolean check_META_recommended_layer_resolution(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_recommended_layer_resolution")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            367
        },
            "xrGetRecommendedLayerResolutionMETA"
        ) || reportMissing("XR", "XR_META_recommended_layer_resolution");
    }

    private static boolean check_META_simultaneous_hands_and_controllers(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_simultaneous_hands_and_controllers")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            368, 369
        },
            "xrResumeSimultaneousHandsAndControllersTrackingMETA", "xrPauseSimultaneousHandsAndControllersTrackingMETA"
        ) || reportMissing("XR", "XR_META_simultaneous_hands_and_controllers");
    }

    private static boolean check_META_spatial_entity_discovery(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_spatial_entity_discovery")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            370, 371
        },
            "xrDiscoverSpacesMETA", "xrRetrieveSpaceDiscoveryResultsMETA"
        ) || reportMissing("XR", "XR_META_spatial_entity_discovery");
    }

    private static boolean check_META_spatial_entity_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_spatial_entity_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            372
        },
            "xrGetSpaceTriangleMeshMETA"
        ) || reportMissing("XR", "XR_META_spatial_entity_mesh");
    }

    private static boolean check_META_spatial_entity_persistence(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_spatial_entity_persistence")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            373, 374
        },
            "xrSaveSpacesMETA", "xrEraseSpacesMETA"
        ) || reportMissing("XR", "XR_META_spatial_entity_persistence");
    }

    private static boolean check_META_spatial_entity_room_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_spatial_entity_room_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            375, 376
        },
            "xrGetSpaceRoomMeshMETA", "xrGetSpaceRoomMeshFaceIndicesMETA"
        ) || reportMissing("XR", "XR_META_spatial_entity_room_mesh");
    }

    private static boolean check_META_spatial_entity_sharing(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_spatial_entity_sharing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            377
        },
            "xrShareSpacesMETA"
        ) || reportMissing("XR", "XR_META_spatial_entity_sharing");
    }

    private static boolean check_META_tile_properties_hint(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_tile_properties_hint")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            378
        },
            "xrSetTilePropertiesHintMETA"
        ) || reportMissing("XR", "XR_META_tile_properties_hint");
    }

    private static boolean check_META_virtual_keyboard(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_virtual_keyboard")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389
        },
            "xrCreateVirtualKeyboardMETA", "xrDestroyVirtualKeyboardMETA", "xrCreateVirtualKeyboardSpaceMETA", "xrSuggestVirtualKeyboardLocationMETA", 
            "xrGetVirtualKeyboardScaleMETA", "xrSetVirtualKeyboardModelVisibilityMETA", "xrGetVirtualKeyboardModelAnimationStatesMETA", 
            "xrGetVirtualKeyboardDirtyTexturesMETA", "xrGetVirtualKeyboardTextureDataMETA", "xrSendVirtualKeyboardInputMETA", 
            "xrChangeVirtualKeyboardTextContextMETA"
        ) || reportMissing("XR", "XR_META_virtual_keyboard");
    }

    private static boolean check_ML_compat(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_compat")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            390
        },
            "xrCreateSpaceFromCoordinateFrameUIDML"
        ) || reportMissing("XR", "XR_ML_compat");
    }

    private static boolean check_ML_facial_expression(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_facial_expression")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            391, 392, 393
        },
            "xrCreateFacialExpressionClientML", "xrDestroyFacialExpressionClientML", "xrGetFacialExpressionBlendShapePropertiesML"
        ) || reportMissing("XR", "XR_ML_facial_expression");
    }

    private static boolean check_ML_localization_map(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_localization_map")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            394, 395, 396, 397, 398, 399, 400
        },
            "xrEnableLocalizationEventsML", "xrQueryLocalizationMapsML", "xrRequestMapLocalizationML", "xrImportLocalizationMapML", 
            "xrCreateExportedLocalizationMapML", "xrDestroyExportedLocalizationMapML", "xrGetExportedLocalizationMapDataML"
        ) || reportMissing("XR", "XR_ML_localization_map");
    }

    private static boolean check_ML_marker_understanding(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_marker_understanding")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            401, 402, 403, 404, 405, 406, 407, 408, 409, 410
        },
            "xrCreateMarkerDetectorML", "xrDestroyMarkerDetectorML", "xrSnapshotMarkerDetectorML", "xrGetMarkerDetectorStateML", "xrGetMarkersML", 
            "xrGetMarkerReprojectionErrorML", "xrGetMarkerLengthML", "xrGetMarkerNumberML", "xrGetMarkerStringML", "xrCreateMarkerSpaceML"
        ) || reportMissing("XR", "XR_ML_marker_understanding");
    }

    private static boolean check_ML_spatial_anchors(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_spatial_anchors")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            411, 412, 413
        },
            "xrCreateSpatialAnchorsAsyncML", "xrCreateSpatialAnchorsCompleteML", "xrGetSpatialAnchorStateML"
        ) || reportMissing("XR", "XR_ML_spatial_anchors");
    }

    private static boolean check_ML_spatial_anchors_storage(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_spatial_anchors_storage")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            414, 415, 416, 417, 418, 419, 420, 421, 422, 423
        },
            "xrCreateSpatialAnchorsStorageML", "xrDestroySpatialAnchorsStorageML", "xrQuerySpatialAnchorsAsyncML", "xrQuerySpatialAnchorsCompleteML", 
            "xrPublishSpatialAnchorsAsyncML", "xrPublishSpatialAnchorsCompleteML", "xrDeleteSpatialAnchorsAsyncML", "xrDeleteSpatialAnchorsCompleteML", 
            "xrUpdateSpatialAnchorsExpirationAsyncML", "xrUpdateSpatialAnchorsExpirationCompleteML"
        ) || reportMissing("XR", "XR_ML_spatial_anchors_storage");
    }

    private static boolean check_ML_system_notifications(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_system_notifications")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            424
        },
            "xrSetSystemNotificationsML"
        ) || reportMissing("XR", "XR_ML_system_notifications");
    }

    private static boolean check_ML_user_calibration(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_user_calibration")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            425
        },
            "xrEnableUserCalibrationEventsML"
        ) || reportMissing("XR", "XR_ML_user_calibration");
    }

    private static boolean check_ML_world_mesh_detection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_world_mesh_detection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            426, 427, 428, 429, 430, 431, 432, 433, 434
        },
            "xrCreateWorldMeshDetectorML", "xrDestroyWorldMeshDetectorML", "xrRequestWorldMeshStateAsyncML", "xrRequestWorldMeshStateCompleteML", 
            "xrGetWorldMeshBufferRecommendSizeML", "xrAllocateWorldMeshBufferML", "xrFreeWorldMeshBufferML", "xrRequestWorldMeshAsyncML", 
            "xrRequestWorldMeshCompleteML"
        ) || reportMissing("XR", "XR_ML_world_mesh_detection");
    }

    private static boolean check_MNDX_force_feedback_curl(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MNDX_force_feedback_curl")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            435
        },
            "xrApplyForceFeedbackCurlMNDX"
        ) || reportMissing("XR", "XR_MNDX_force_feedback_curl");
    }

    private static boolean check_MSFT_composition_layer_reprojection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_composition_layer_reprojection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            436
        },
            "xrEnumerateReprojectionModesMSFT"
        ) || reportMissing("XR", "XR_MSFT_composition_layer_reprojection");
    }

    private static boolean check_MSFT_controller_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_controller_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            437, 438, 439, 440
        },
            "xrGetControllerModelKeyMSFT", "xrLoadControllerModelMSFT", "xrGetControllerModelPropertiesMSFT", "xrGetControllerModelStateMSFT"
        ) || reportMissing("XR", "XR_MSFT_controller_model");
    }

    private static boolean check_MSFT_hand_tracking_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_hand_tracking_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            441, 442
        },
            "xrCreateHandMeshSpaceMSFT", "xrUpdateHandMeshMSFT"
        ) || reportMissing("XR", "XR_MSFT_hand_tracking_mesh");
    }

    private static boolean check_MSFT_perception_anchor_interop(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_perception_anchor_interop")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            443, 444
        },
            "xrCreateSpatialAnchorFromPerceptionAnchorMSFT", "xrTryGetPerceptionAnchorFromSpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_perception_anchor_interop");
    }

    private static boolean check_MSFT_scene_marker(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            445, 446
        },
            "xrGetSceneMarkerRawDataMSFT", "xrGetSceneMarkerDecodedStringMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_marker");
    }

    private static boolean check_MSFT_scene_understanding(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_understanding")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            447, 448, 449, 450, 451, 452, 453, 454, 455, 456
        },
            "xrEnumerateSceneComputeFeaturesMSFT", "xrCreateSceneObserverMSFT", "xrDestroySceneObserverMSFT", "xrCreateSceneMSFT", "xrDestroySceneMSFT", 
            "xrComputeNewSceneMSFT", "xrGetSceneComputeStateMSFT", "xrGetSceneComponentsMSFT", "xrLocateSceneComponentsMSFT", "xrGetSceneMeshBuffersMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_understanding");
    }

    private static boolean check_MSFT_scene_understanding_serialization(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_understanding_serialization")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            457, 458
        },
            "xrDeserializeSceneMSFT", "xrGetSerializedSceneFragmentDataMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_understanding_serialization");
    }

    private static boolean check_MSFT_spatial_anchor(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_anchor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            459, 460, 461
        },
            "xrCreateSpatialAnchorMSFT", "xrCreateSpatialAnchorSpaceMSFT", "xrDestroySpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_anchor");
    }

    private static boolean check_MSFT_spatial_anchor_persistence(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_anchor_persistence")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            462, 463, 464, 465, 466, 467, 468
        },
            "xrCreateSpatialAnchorStoreConnectionMSFT", "xrDestroySpatialAnchorStoreConnectionMSFT", "xrPersistSpatialAnchorMSFT", 
            "xrEnumeratePersistedSpatialAnchorNamesMSFT", "xrCreateSpatialAnchorFromPersistedNameMSFT", "xrUnpersistSpatialAnchorMSFT", 
            "xrClearSpatialAnchorStoreMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_anchor_persistence");
    }

    private static boolean check_MSFT_spatial_graph_bridge(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_graph_bridge")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            469, 470, 471, 472
        },
            "xrCreateSpatialGraphNodeSpaceMSFT", "xrTryCreateSpatialGraphStaticNodeBindingMSFT", "xrDestroySpatialGraphNodeBindingMSFT", 
            "xrGetSpatialGraphNodeBindingPropertiesMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_graph_bridge");
    }

    private static boolean check_OCULUS_audio_device_guid(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_OCULUS_audio_device_guid")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            473, 474
        },
            "xrGetAudioOutputDeviceGuidOculus", "xrGetAudioInputDeviceGuidOculus"
        ) || reportMissing("XR", "XR_OCULUS_audio_device_guid");
    }

    private static boolean check_OCULUS_external_camera(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_OCULUS_external_camera")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            475
        },
            "xrEnumerateExternalCamerasOCULUS"
        ) || reportMissing("XR", "XR_OCULUS_external_camera");
    }

    private static boolean check_QCOM_hand_tracking_gesture(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_QCOM_hand_tracking_gesture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            476
        },
            "xrGetHandGestureQCOM"
        ) || reportMissing("XR", "XR_QCOM_hand_tracking_gesture");
    }

    private static boolean check_QCOM_tracking_optimization_settings(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_QCOM_tracking_optimization_settings")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            477
        },
            "xrSetTrackingOptimizationSettingsHintQCOM"
        ) || reportMissing("XR", "XR_QCOM_tracking_optimization_settings");
    }

    private static boolean check_VARJO_environment_depth_estimation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_environment_depth_estimation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            478
        },
            "xrSetEnvironmentDepthEstimationVARJO"
        ) || reportMissing("XR", "XR_VARJO_environment_depth_estimation");
    }

    private static boolean check_VARJO_marker_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_marker_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            479, 480, 481, 482, 483
        },
            "xrSetMarkerTrackingVARJO", "xrSetMarkerTrackingTimeoutVARJO", "xrSetMarkerTrackingPredictionVARJO", "xrGetMarkerSizeVARJO", 
            "xrCreateMarkerSpaceVARJO"
        ) || reportMissing("XR", "XR_VARJO_marker_tracking");
    }

    private static boolean check_VARJO_view_offset(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_view_offset")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            484
        },
            "xrSetViewOffsetVARJO"
        ) || reportMissing("XR", "XR_VARJO_view_offset");
    }

}
