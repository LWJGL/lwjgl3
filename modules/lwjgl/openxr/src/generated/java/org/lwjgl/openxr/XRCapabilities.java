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

    // BD_body_tracking
    public final long
        xrCreateBodyTrackerBD,
        xrDestroyBodyTrackerBD,
        xrLocateBodyJointsBD;

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

    // META_spatial_entity_mesh
    public final long
        xrGetSpaceTriangleMeshMETA;

    // META_spatial_entity_sharing
    public final long
        xrShareSpacesMETA;

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
    /** When true, {@code BD_body_tracking} is supported. */
    public final boolean XR_BD_body_tracking;
    /** When true, {@code BD_controller_interaction} is supported. */
    public final boolean XR_BD_controller_interaction;
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
    /** When true, {@code EXT_local_floor} is supported. */
    public final boolean XR_EXT_local_floor;
    /** When true, {@code EXT_palm_pose} is supported. */
    public final boolean XR_EXT_palm_pose;
    /** When true, {@code EXT_performance_settings} is supported. */
    public final boolean XR_EXT_performance_settings;
    /** When true, {@code EXT_plane_detection} is supported. */
    public final boolean XR_EXT_plane_detection;
    /** When true, {@code EXT_samsung_odyssey_controller} is supported. */
    public final boolean XR_EXT_samsung_odyssey_controller;
    /** When true, {@code EXT_thermal_query} is supported. */
    public final boolean XR_EXT_thermal_query;
    /** When true, {@code EXT_user_presence} is supported. */
    public final boolean XR_EXT_user_presence;
    /** When true, {@code EXT_uuid} is supported. */
    public final boolean XR_EXT_uuid;
    /** When true, {@code EXT_view_configuration_depth_range} is supported. */
    public final boolean XR_EXT_view_configuration_depth_range;
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
    /** When true, {@code META_automatic_layer_filter} is supported. */
    public final boolean XR_META_automatic_layer_filter;
    /** When true, {@code META_colocation_discovery} is supported. */
    public final boolean XR_META_colocation_discovery;
    /** When true, {@code META_environment_depth} is supported. */
    public final boolean XR_META_environment_depth;
    /** When true, {@code META_foveation_eye_tracked} is supported. */
    public final boolean XR_META_foveation_eye_tracked;
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
    /** When true, {@code META_spatial_entity_group_sharing} is supported. */
    public final boolean XR_META_spatial_entity_group_sharing;
    /** When true, {@code META_spatial_entity_mesh} is supported. */
    public final boolean XR_META_spatial_entity_mesh;
    /** When true, {@code META_spatial_entity_sharing} is supported. */
    public final boolean XR_META_spatial_entity_sharing;
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

        long[] caps = new long[311];

        OpenXR10 = check_XR10(provider, caps, ext);
        OpenXR11 = check_XR11(provider, caps, ext);
        XR_ALMALENCE_digital_lens_control = check_ALMALENCE_digital_lens_control(provider, caps, ext);
        XR_BD_body_tracking = check_BD_body_tracking(provider, caps, ext);
        XR_BD_controller_interaction = ext.contains("XR_BD_controller_interaction");
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
        XR_EXT_local_floor = ext.contains("XR_EXT_local_floor");
        XR_EXT_palm_pose = ext.contains("XR_EXT_palm_pose");
        XR_EXT_performance_settings = check_EXT_performance_settings(provider, caps, ext);
        XR_EXT_plane_detection = check_EXT_plane_detection(provider, caps, ext);
        XR_EXT_samsung_odyssey_controller = ext.contains("XR_EXT_samsung_odyssey_controller");
        XR_EXT_thermal_query = check_EXT_thermal_query(provider, caps, ext);
        XR_EXT_user_presence = ext.contains("XR_EXT_user_presence");
        XR_EXT_uuid = ext.contains("XR_EXT_uuid");
        XR_EXT_view_configuration_depth_range = ext.contains("XR_EXT_view_configuration_depth_range");
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
        XR_META_automatic_layer_filter = ext.contains("XR_META_automatic_layer_filter");
        XR_META_colocation_discovery = check_META_colocation_discovery(provider, caps, ext);
        XR_META_environment_depth = check_META_environment_depth(provider, caps, ext);
        XR_META_foveation_eye_tracked = check_META_foveation_eye_tracked(provider, caps, ext);
        XR_META_headset_id = ext.contains("XR_META_headset_id");
        XR_META_local_dimming = ext.contains("XR_META_local_dimming");
        XR_META_passthrough_color_lut = check_META_passthrough_color_lut(provider, caps, ext);
        XR_META_passthrough_layer_resumed_event = ext.contains("XR_META_passthrough_layer_resumed_event");
        XR_META_passthrough_preferences = check_META_passthrough_preferences(provider, caps, ext);
        XR_META_performance_metrics = check_META_performance_metrics(provider, caps, ext);
        XR_META_recommended_layer_resolution = check_META_recommended_layer_resolution(provider, caps, ext);
        XR_META_spatial_entity_group_sharing = ext.contains("XR_META_spatial_entity_group_sharing");
        XR_META_spatial_entity_mesh = check_META_spatial_entity_mesh(provider, caps, ext);
        XR_META_spatial_entity_sharing = check_META_spatial_entity_sharing(provider, caps, ext);
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
        xrCreateBodyTrackerBD = caps[53];
        xrDestroyBodyTrackerBD = caps[54];
        xrLocateBodyJointsBD = caps[55];
        xrSetInputDeviceActiveEXT = caps[56];
        xrSetInputDeviceStateBoolEXT = caps[57];
        xrSetInputDeviceStateFloatEXT = caps[58];
        xrSetInputDeviceStateVector2fEXT = caps[59];
        xrSetInputDeviceLocationEXT = caps[60];
        xrSetDebugUtilsObjectNameEXT = caps[61];
        xrCreateDebugUtilsMessengerEXT = caps[62];
        xrDestroyDebugUtilsMessengerEXT = caps[63];
        xrSubmitDebugUtilsMessageEXT = caps[64];
        xrSessionBeginDebugUtilsLabelRegionEXT = caps[65];
        xrSessionEndDebugUtilsLabelRegionEXT = caps[66];
        xrSessionInsertDebugUtilsLabelEXT = caps[67];
        xrPollFutureEXT = caps[68];
        xrCancelFutureEXT = caps[69];
        xrCreateHandTrackerEXT = caps[70];
        xrDestroyHandTrackerEXT = caps[71];
        xrLocateHandJointsEXT = caps[72];
        xrPerfSettingsSetPerformanceLevelEXT = caps[73];
        xrCreatePlaneDetectorEXT = caps[74];
        xrDestroyPlaneDetectorEXT = caps[75];
        xrBeginPlaneDetectionEXT = caps[76];
        xrGetPlaneDetectionStateEXT = caps[77];
        xrGetPlaneDetectionsEXT = caps[78];
        xrGetPlanePolygonBufferEXT = caps[79];
        xrThermalGetTemperatureTrendEXT = caps[80];
        xrCreateBodyTrackerFB = caps[81];
        xrDestroyBodyTrackerFB = caps[82];
        xrLocateBodyJointsFB = caps[83];
        xrGetBodySkeletonFB = caps[84];
        xrEnumerateColorSpacesFB = caps[85];
        xrSetColorSpaceFB = caps[86];
        xrEnumerateDisplayRefreshRatesFB = caps[87];
        xrGetDisplayRefreshRateFB = caps[88];
        xrRequestDisplayRefreshRateFB = caps[89];
        xrCreateEyeTrackerFB = caps[90];
        xrDestroyEyeTrackerFB = caps[91];
        xrGetEyeGazesFB = caps[92];
        xrCreateFaceTrackerFB = caps[93];
        xrDestroyFaceTrackerFB = caps[94];
        xrGetFaceExpressionWeightsFB = caps[95];
        xrCreateFaceTracker2FB = caps[96];
        xrDestroyFaceTracker2FB = caps[97];
        xrGetFaceExpressionWeights2FB = caps[98];
        xrCreateFoveationProfileFB = caps[99];
        xrDestroyFoveationProfileFB = caps[100];
        xrGetHandMeshFB = caps[101];
        xrGetDeviceSampleRateFB = caps[102];
        xrQuerySystemTrackedKeyboardFB = caps[103];
        xrCreateKeyboardSpaceFB = caps[104];
        xrCreatePassthroughFB = caps[105];
        xrDestroyPassthroughFB = caps[106];
        xrPassthroughStartFB = caps[107];
        xrPassthroughPauseFB = caps[108];
        xrCreatePassthroughLayerFB = caps[109];
        xrDestroyPassthroughLayerFB = caps[110];
        xrPassthroughLayerPauseFB = caps[111];
        xrPassthroughLayerResumeFB = caps[112];
        xrPassthroughLayerSetStyleFB = caps[113];
        xrCreateGeometryInstanceFB = caps[114];
        xrDestroyGeometryInstanceFB = caps[115];
        xrGeometryInstanceSetTransformFB = caps[116];
        xrPassthroughLayerSetKeyboardHandsIntensityFB = caps[117];
        xrEnumerateRenderModelPathsFB = caps[118];
        xrGetRenderModelPropertiesFB = caps[119];
        xrLoadRenderModelFB = caps[120];
        xrGetSpaceBoundingBox2DFB = caps[121];
        xrGetSpaceBoundingBox3DFB = caps[122];
        xrGetSpaceSemanticLabelsFB = caps[123];
        xrGetSpaceBoundary2DFB = caps[124];
        xrGetSpaceRoomLayoutFB = caps[125];
        xrRequestSceneCaptureFB = caps[126];
        xrCreateSpatialAnchorFB = caps[127];
        xrGetSpaceUuidFB = caps[128];
        xrEnumerateSpaceSupportedComponentsFB = caps[129];
        xrSetSpaceComponentStatusFB = caps[130];
        xrGetSpaceComponentStatusFB = caps[131];
        xrGetSpaceContainerFB = caps[132];
        xrQuerySpacesFB = caps[133];
        xrRetrieveSpaceQueryResultsFB = caps[134];
        xrShareSpacesFB = caps[135];
        xrSaveSpaceFB = caps[136];
        xrEraseSpaceFB = caps[137];
        xrSaveSpaceListFB = caps[138];
        xrCreateSpaceUserFB = caps[139];
        xrGetSpaceUserIdFB = caps[140];
        xrDestroySpaceUserFB = caps[141];
        xrUpdateSwapchainFB = caps[142];
        xrGetSwapchainStateFB = caps[143];
        xrCreateTriangleMeshFB = caps[144];
        xrDestroyTriangleMeshFB = caps[145];
        xrTriangleMeshGetVertexBufferFB = caps[146];
        xrTriangleMeshGetIndexBufferFB = caps[147];
        xrTriangleMeshBeginUpdateFB = caps[148];
        xrTriangleMeshEndUpdateFB = caps[149];
        xrTriangleMeshBeginVertexBufferUpdateFB = caps[150];
        xrTriangleMeshEndVertexBufferUpdateFB = caps[151];
        xrCreateSpatialAnchorHTC = caps[152];
        xrGetSpatialAnchorNameHTC = caps[153];
        xrCreateBodyTrackerHTC = caps[154];
        xrDestroyBodyTrackerHTC = caps[155];
        xrLocateBodyJointsHTC = caps[156];
        xrGetBodySkeletonHTC = caps[157];
        xrCreateFacialTrackerHTC = caps[158];
        xrDestroyFacialTrackerHTC = caps[159];
        xrGetFacialExpressionsHTC = caps[160];
        xrApplyFoveationHTC = caps[161];
        xrCreatePassthroughHTC = caps[162];
        xrDestroyPassthroughHTC = caps[163];
        xrEnumerateViveTrackerPathsHTCX = caps[164];
        xrConvertTimespecTimeToTimeKHR = caps[165];
        xrConvertTimeToTimespecTimeKHR = caps[166];
        xrLocateSpacesKHR = caps[167];
        xrGetOpenGLGraphicsRequirementsKHR = caps[168];
        xrGetVisibilityMaskKHR = caps[169];
        xrGetVulkanInstanceExtensionsKHR = caps[170];
        xrGetVulkanDeviceExtensionsKHR = caps[171];
        xrGetVulkanGraphicsDeviceKHR = caps[172];
        xrGetVulkanGraphicsRequirementsKHR = caps[173];
        xrCreateVulkanInstanceKHR = caps[174];
        xrCreateVulkanDeviceKHR = caps[175];
        xrGetVulkanGraphicsDevice2KHR = caps[176];
        xrGetVulkanGraphicsRequirements2KHR = caps[177];
        xrConvertWin32PerformanceCounterToTimeKHR = caps[178];
        xrConvertTimeToWin32PerformanceCounterKHR = caps[179];
        xrStartColocationDiscoveryMETA = caps[180];
        xrStopColocationDiscoveryMETA = caps[181];
        xrStartColocationAdvertisementMETA = caps[182];
        xrStopColocationAdvertisementMETA = caps[183];
        xrCreateEnvironmentDepthProviderMETA = caps[184];
        xrDestroyEnvironmentDepthProviderMETA = caps[185];
        xrStartEnvironmentDepthProviderMETA = caps[186];
        xrStopEnvironmentDepthProviderMETA = caps[187];
        xrCreateEnvironmentDepthSwapchainMETA = caps[188];
        xrDestroyEnvironmentDepthSwapchainMETA = caps[189];
        xrEnumerateEnvironmentDepthSwapchainImagesMETA = caps[190];
        xrGetEnvironmentDepthSwapchainStateMETA = caps[191];
        xrAcquireEnvironmentDepthImageMETA = caps[192];
        xrSetEnvironmentDepthHandRemovalMETA = caps[193];
        xrGetFoveationEyeTrackedStateMETA = caps[194];
        xrCreatePassthroughColorLutMETA = caps[195];
        xrDestroyPassthroughColorLutMETA = caps[196];
        xrUpdatePassthroughColorLutMETA = caps[197];
        xrGetPassthroughPreferencesMETA = caps[198];
        xrEnumeratePerformanceMetricsCounterPathsMETA = caps[199];
        xrSetPerformanceMetricsStateMETA = caps[200];
        xrGetPerformanceMetricsStateMETA = caps[201];
        xrQueryPerformanceMetricsCounterMETA = caps[202];
        xrGetRecommendedLayerResolutionMETA = caps[203];
        xrGetSpaceTriangleMeshMETA = caps[204];
        xrShareSpacesMETA = caps[205];
        xrCreateVirtualKeyboardMETA = caps[206];
        xrDestroyVirtualKeyboardMETA = caps[207];
        xrCreateVirtualKeyboardSpaceMETA = caps[208];
        xrSuggestVirtualKeyboardLocationMETA = caps[209];
        xrGetVirtualKeyboardScaleMETA = caps[210];
        xrSetVirtualKeyboardModelVisibilityMETA = caps[211];
        xrGetVirtualKeyboardModelAnimationStatesMETA = caps[212];
        xrGetVirtualKeyboardDirtyTexturesMETA = caps[213];
        xrGetVirtualKeyboardTextureDataMETA = caps[214];
        xrSendVirtualKeyboardInputMETA = caps[215];
        xrChangeVirtualKeyboardTextContextMETA = caps[216];
        xrCreateSpaceFromCoordinateFrameUIDML = caps[217];
        xrCreateFacialExpressionClientML = caps[218];
        xrDestroyFacialExpressionClientML = caps[219];
        xrGetFacialExpressionBlendShapePropertiesML = caps[220];
        xrEnableLocalizationEventsML = caps[221];
        xrQueryLocalizationMapsML = caps[222];
        xrRequestMapLocalizationML = caps[223];
        xrImportLocalizationMapML = caps[224];
        xrCreateExportedLocalizationMapML = caps[225];
        xrDestroyExportedLocalizationMapML = caps[226];
        xrGetExportedLocalizationMapDataML = caps[227];
        xrCreateMarkerDetectorML = caps[228];
        xrDestroyMarkerDetectorML = caps[229];
        xrSnapshotMarkerDetectorML = caps[230];
        xrGetMarkerDetectorStateML = caps[231];
        xrGetMarkersML = caps[232];
        xrGetMarkerReprojectionErrorML = caps[233];
        xrGetMarkerLengthML = caps[234];
        xrGetMarkerNumberML = caps[235];
        xrGetMarkerStringML = caps[236];
        xrCreateMarkerSpaceML = caps[237];
        xrCreateSpatialAnchorsAsyncML = caps[238];
        xrCreateSpatialAnchorsCompleteML = caps[239];
        xrGetSpatialAnchorStateML = caps[240];
        xrCreateSpatialAnchorsStorageML = caps[241];
        xrDestroySpatialAnchorsStorageML = caps[242];
        xrQuerySpatialAnchorsAsyncML = caps[243];
        xrQuerySpatialAnchorsCompleteML = caps[244];
        xrPublishSpatialAnchorsAsyncML = caps[245];
        xrPublishSpatialAnchorsCompleteML = caps[246];
        xrDeleteSpatialAnchorsAsyncML = caps[247];
        xrDeleteSpatialAnchorsCompleteML = caps[248];
        xrUpdateSpatialAnchorsExpirationAsyncML = caps[249];
        xrUpdateSpatialAnchorsExpirationCompleteML = caps[250];
        xrSetSystemNotificationsML = caps[251];
        xrEnableUserCalibrationEventsML = caps[252];
        xrCreateWorldMeshDetectorML = caps[253];
        xrDestroyWorldMeshDetectorML = caps[254];
        xrRequestWorldMeshStateAsyncML = caps[255];
        xrRequestWorldMeshStateCompleteML = caps[256];
        xrGetWorldMeshBufferRecommendSizeML = caps[257];
        xrAllocateWorldMeshBufferML = caps[258];
        xrFreeWorldMeshBufferML = caps[259];
        xrRequestWorldMeshAsyncML = caps[260];
        xrRequestWorldMeshCompleteML = caps[261];
        xrApplyForceFeedbackCurlMNDX = caps[262];
        xrEnumerateReprojectionModesMSFT = caps[263];
        xrGetControllerModelKeyMSFT = caps[264];
        xrLoadControllerModelMSFT = caps[265];
        xrGetControllerModelPropertiesMSFT = caps[266];
        xrGetControllerModelStateMSFT = caps[267];
        xrCreateHandMeshSpaceMSFT = caps[268];
        xrUpdateHandMeshMSFT = caps[269];
        xrCreateSpatialAnchorFromPerceptionAnchorMSFT = caps[270];
        xrTryGetPerceptionAnchorFromSpatialAnchorMSFT = caps[271];
        xrGetSceneMarkerRawDataMSFT = caps[272];
        xrGetSceneMarkerDecodedStringMSFT = caps[273];
        xrEnumerateSceneComputeFeaturesMSFT = caps[274];
        xrCreateSceneObserverMSFT = caps[275];
        xrDestroySceneObserverMSFT = caps[276];
        xrCreateSceneMSFT = caps[277];
        xrDestroySceneMSFT = caps[278];
        xrComputeNewSceneMSFT = caps[279];
        xrGetSceneComputeStateMSFT = caps[280];
        xrGetSceneComponentsMSFT = caps[281];
        xrLocateSceneComponentsMSFT = caps[282];
        xrGetSceneMeshBuffersMSFT = caps[283];
        xrDeserializeSceneMSFT = caps[284];
        xrGetSerializedSceneFragmentDataMSFT = caps[285];
        xrCreateSpatialAnchorMSFT = caps[286];
        xrCreateSpatialAnchorSpaceMSFT = caps[287];
        xrDestroySpatialAnchorMSFT = caps[288];
        xrCreateSpatialAnchorStoreConnectionMSFT = caps[289];
        xrDestroySpatialAnchorStoreConnectionMSFT = caps[290];
        xrPersistSpatialAnchorMSFT = caps[291];
        xrEnumeratePersistedSpatialAnchorNamesMSFT = caps[292];
        xrCreateSpatialAnchorFromPersistedNameMSFT = caps[293];
        xrUnpersistSpatialAnchorMSFT = caps[294];
        xrClearSpatialAnchorStoreMSFT = caps[295];
        xrCreateSpatialGraphNodeSpaceMSFT = caps[296];
        xrTryCreateSpatialGraphStaticNodeBindingMSFT = caps[297];
        xrDestroySpatialGraphNodeBindingMSFT = caps[298];
        xrGetSpatialGraphNodeBindingPropertiesMSFT = caps[299];
        xrGetAudioOutputDeviceGuidOculus = caps[300];
        xrGetAudioInputDeviceGuidOculus = caps[301];
        xrEnumerateExternalCamerasOCULUS = caps[302];
        xrSetTrackingOptimizationSettingsHintQCOM = caps[303];
        xrSetEnvironmentDepthEstimationVARJO = caps[304];
        xrSetMarkerTrackingVARJO = caps[305];
        xrSetMarkerTrackingTimeoutVARJO = caps[306];
        xrSetMarkerTrackingPredictionVARJO = caps[307];
        xrGetMarkerSizeVARJO = caps[308];
        xrCreateMarkerSpaceVARJO = caps[309];
        xrSetViewOffsetVARJO = caps[310];
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

    private static boolean check_BD_body_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_BD_body_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            53, 54, 55
        },
            "xrCreateBodyTrackerBD", "xrDestroyBodyTrackerBD", "xrLocateBodyJointsBD"
        ) || reportMissing("XR", "XR_BD_body_tracking");
    }

    private static boolean check_EXT_conformance_automation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_conformance_automation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            56, 57, 58, 59, 60
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
            61, 62, 63, 64, 65, 66, 67
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
            68, 69
        },
            "xrPollFutureEXT", "xrCancelFutureEXT"
        ) || reportMissing("XR", "XR_EXT_future");
    }

    private static boolean check_EXT_hand_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_hand_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            70, 71, 72
        },
            "xrCreateHandTrackerEXT", "xrDestroyHandTrackerEXT", "xrLocateHandJointsEXT"
        ) || reportMissing("XR", "XR_EXT_hand_tracking");
    }

    private static boolean check_EXT_performance_settings(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_performance_settings")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            73
        },
            "xrPerfSettingsSetPerformanceLevelEXT"
        ) || reportMissing("XR", "XR_EXT_performance_settings");
    }

    private static boolean check_EXT_plane_detection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_plane_detection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            74, 75, 76, 77, 78, 79
        },
            "xrCreatePlaneDetectorEXT", "xrDestroyPlaneDetectorEXT", "xrBeginPlaneDetectionEXT", "xrGetPlaneDetectionStateEXT", "xrGetPlaneDetectionsEXT", 
            "xrGetPlanePolygonBufferEXT"
        ) || reportMissing("XR", "XR_EXT_plane_detection");
    }

    private static boolean check_EXT_thermal_query(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_thermal_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            80
        },
            "xrThermalGetTemperatureTrendEXT"
        ) || reportMissing("XR", "XR_EXT_thermal_query");
    }

    private static boolean check_FB_body_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_body_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            81, 82, 83, 84
        },
            "xrCreateBodyTrackerFB", "xrDestroyBodyTrackerFB", "xrLocateBodyJointsFB", "xrGetBodySkeletonFB"
        ) || reportMissing("XR", "XR_FB_body_tracking");
    }

    private static boolean check_FB_color_space(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_color_space")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            85, 86
        },
            "xrEnumerateColorSpacesFB", "xrSetColorSpaceFB"
        ) || reportMissing("XR", "XR_FB_color_space");
    }

    private static boolean check_FB_display_refresh_rate(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_display_refresh_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            87, 88, 89
        },
            "xrEnumerateDisplayRefreshRatesFB", "xrGetDisplayRefreshRateFB", "xrRequestDisplayRefreshRateFB"
        ) || reportMissing("XR", "XR_FB_display_refresh_rate");
    }

    private static boolean check_FB_eye_tracking_social(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_eye_tracking_social")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            90, 91, 92
        },
            "xrCreateEyeTrackerFB", "xrDestroyEyeTrackerFB", "xrGetEyeGazesFB"
        ) || reportMissing("XR", "XR_FB_eye_tracking_social");
    }

    private static boolean check_FB_face_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_face_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            93, 94, 95
        },
            "xrCreateFaceTrackerFB", "xrDestroyFaceTrackerFB", "xrGetFaceExpressionWeightsFB"
        ) || reportMissing("XR", "XR_FB_face_tracking");
    }

    private static boolean check_FB_face_tracking2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_face_tracking2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            96, 97, 98
        },
            "xrCreateFaceTracker2FB", "xrDestroyFaceTracker2FB", "xrGetFaceExpressionWeights2FB"
        ) || reportMissing("XR", "XR_FB_face_tracking2");
    }

    private static boolean check_FB_foveation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_foveation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            99, 100
        },
            "xrCreateFoveationProfileFB", "xrDestroyFoveationProfileFB"
        ) || reportMissing("XR", "XR_FB_foveation");
    }

    private static boolean check_FB_hand_tracking_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_hand_tracking_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            101
        },
            "xrGetHandMeshFB"
        ) || reportMissing("XR", "XR_FB_hand_tracking_mesh");
    }

    private static boolean check_FB_haptic_pcm(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_haptic_pcm")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            102
        },
            "xrGetDeviceSampleRateFB"
        ) || reportMissing("XR", "XR_FB_haptic_pcm");
    }

    private static boolean check_FB_keyboard_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_keyboard_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            103, 104
        },
            "xrQuerySystemTrackedKeyboardFB", "xrCreateKeyboardSpaceFB"
        ) || reportMissing("XR", "XR_FB_keyboard_tracking");
    }

    private static boolean check_FB_passthrough(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_passthrough")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116
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
            117
        },
            "xrPassthroughLayerSetKeyboardHandsIntensityFB"
        ) || reportMissing("XR", "XR_FB_passthrough_keyboard_hands");
    }

    private static boolean check_FB_render_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_render_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            118, 119, 120
        },
            "xrEnumerateRenderModelPathsFB", "xrGetRenderModelPropertiesFB", "xrLoadRenderModelFB"
        ) || reportMissing("XR", "XR_FB_render_model");
    }

    private static boolean check_FB_scene(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_scene")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            121, 122, 123, 124, 125
        },
            "xrGetSpaceBoundingBox2DFB", "xrGetSpaceBoundingBox3DFB", "xrGetSpaceSemanticLabelsFB", "xrGetSpaceBoundary2DFB", "xrGetSpaceRoomLayoutFB"
        ) || reportMissing("XR", "XR_FB_scene");
    }

    private static boolean check_FB_scene_capture(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_scene_capture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            126
        },
            "xrRequestSceneCaptureFB"
        ) || reportMissing("XR", "XR_FB_scene_capture");
    }

    private static boolean check_FB_spatial_entity(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            127, 128, 129, 130, 131
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
            132
        },
            "xrGetSpaceContainerFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_container");
    }

    private static boolean check_FB_spatial_entity_query(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            133, 134
        },
            "xrQuerySpacesFB", "xrRetrieveSpaceQueryResultsFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_query");
    }

    private static boolean check_FB_spatial_entity_sharing(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_sharing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            135
        },
            "xrShareSpacesFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_sharing");
    }

    private static boolean check_FB_spatial_entity_storage(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_storage")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            136, 137
        },
            "xrSaveSpaceFB", "xrEraseSpaceFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_storage");
    }

    private static boolean check_FB_spatial_entity_storage_batch(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_storage_batch")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            138
        },
            "xrSaveSpaceListFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_storage_batch");
    }

    private static boolean check_FB_spatial_entity_user(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_user")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            139, 140, 141
        },
            "xrCreateSpaceUserFB", "xrGetSpaceUserIdFB", "xrDestroySpaceUserFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_user");
    }

    private static boolean check_FB_swapchain_update_state(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_swapchain_update_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            142, 143
        },
            "xrUpdateSwapchainFB", "xrGetSwapchainStateFB"
        ) || reportMissing("XR", "XR_FB_swapchain_update_state");
    }

    private static boolean check_FB_triangle_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_triangle_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            144, 145, 146, 147, 148, 149, 150, 151
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
            152, 153
        },
            "xrCreateSpatialAnchorHTC", "xrGetSpatialAnchorNameHTC"
        ) || reportMissing("XR", "XR_HTC_anchor");
    }

    private static boolean check_HTC_body_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_body_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            154, 155, 156, 157
        },
            "xrCreateBodyTrackerHTC", "xrDestroyBodyTrackerHTC", "xrLocateBodyJointsHTC", "xrGetBodySkeletonHTC"
        ) || reportMissing("XR", "XR_HTC_body_tracking");
    }

    private static boolean check_HTC_facial_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_facial_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            158, 159, 160
        },
            "xrCreateFacialTrackerHTC", "xrDestroyFacialTrackerHTC", "xrGetFacialExpressionsHTC"
        ) || reportMissing("XR", "XR_HTC_facial_tracking");
    }

    private static boolean check_HTC_foveation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_foveation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            161
        },
            "xrApplyFoveationHTC"
        ) || reportMissing("XR", "XR_HTC_foveation");
    }

    private static boolean check_HTC_passthrough(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_passthrough")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            162, 163
        },
            "xrCreatePassthroughHTC", "xrDestroyPassthroughHTC"
        ) || reportMissing("XR", "XR_HTC_passthrough");
    }

    private static boolean check_HTCX_vive_tracker_interaction(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTCX_vive_tracker_interaction")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            164
        },
            "xrEnumerateViveTrackerPathsHTCX"
        ) || reportMissing("XR", "XR_HTCX_vive_tracker_interaction");
    }

    private static boolean check_KHR_convert_timespec_time(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_convert_timespec_time")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            165, 166
        },
            "xrConvertTimespecTimeToTimeKHR", "xrConvertTimeToTimespecTimeKHR"
        ) || reportMissing("XR", "XR_KHR_convert_timespec_time");
    }

    private static boolean check_KHR_locate_spaces(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_locate_spaces")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            167
        },
            "xrLocateSpacesKHR"
        ) || reportMissing("XR", "XR_KHR_locate_spaces");
    }

    private static boolean check_KHR_opengl_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_opengl_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            168
        },
            "xrGetOpenGLGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_opengl_enable");
    }

    private static boolean check_KHR_visibility_mask(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_visibility_mask")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            169
        },
            "xrGetVisibilityMaskKHR"
        ) || reportMissing("XR", "XR_KHR_visibility_mask");
    }

    private static boolean check_KHR_vulkan_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_vulkan_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            170, 171, 172, 173
        },
            "xrGetVulkanInstanceExtensionsKHR", "xrGetVulkanDeviceExtensionsKHR", "xrGetVulkanGraphicsDeviceKHR", "xrGetVulkanGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_vulkan_enable");
    }

    private static boolean check_KHR_vulkan_enable2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_vulkan_enable2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            174, 175, 176, 177
        },
            "xrCreateVulkanInstanceKHR", "xrCreateVulkanDeviceKHR", "xrGetVulkanGraphicsDevice2KHR", "xrGetVulkanGraphicsRequirements2KHR"
        ) || reportMissing("XR", "XR_KHR_vulkan_enable2");
    }

    private static boolean check_KHR_win32_convert_performance_counter_time(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_win32_convert_performance_counter_time")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            178, 179
        },
            "xrConvertWin32PerformanceCounterToTimeKHR", "xrConvertTimeToWin32PerformanceCounterKHR"
        ) || reportMissing("XR", "XR_KHR_win32_convert_performance_counter_time");
    }

    private static boolean check_META_colocation_discovery(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_colocation_discovery")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            180, 181, 182, 183
        },
            "xrStartColocationDiscoveryMETA", "xrStopColocationDiscoveryMETA", "xrStartColocationAdvertisementMETA", "xrStopColocationAdvertisementMETA"
        ) || reportMissing("XR", "XR_META_colocation_discovery");
    }

    private static boolean check_META_environment_depth(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_environment_depth")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            184, 185, 186, 187, 188, 189, 190, 191, 192, 193
        },
            "xrCreateEnvironmentDepthProviderMETA", "xrDestroyEnvironmentDepthProviderMETA", "xrStartEnvironmentDepthProviderMETA", 
            "xrStopEnvironmentDepthProviderMETA", "xrCreateEnvironmentDepthSwapchainMETA", "xrDestroyEnvironmentDepthSwapchainMETA", 
            "xrEnumerateEnvironmentDepthSwapchainImagesMETA", "xrGetEnvironmentDepthSwapchainStateMETA", "xrAcquireEnvironmentDepthImageMETA", 
            "xrSetEnvironmentDepthHandRemovalMETA"
        ) || reportMissing("XR", "XR_META_environment_depth");
    }

    private static boolean check_META_foveation_eye_tracked(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_foveation_eye_tracked")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            194
        },
            "xrGetFoveationEyeTrackedStateMETA"
        ) || reportMissing("XR", "XR_META_foveation_eye_tracked");
    }

    private static boolean check_META_passthrough_color_lut(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_passthrough_color_lut")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            195, 196, 197
        },
            "xrCreatePassthroughColorLutMETA", "xrDestroyPassthroughColorLutMETA", "xrUpdatePassthroughColorLutMETA"
        ) || reportMissing("XR", "XR_META_passthrough_color_lut");
    }

    private static boolean check_META_passthrough_preferences(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_passthrough_preferences")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            198
        },
            "xrGetPassthroughPreferencesMETA"
        ) || reportMissing("XR", "XR_META_passthrough_preferences");
    }

    private static boolean check_META_performance_metrics(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_performance_metrics")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            199, 200, 201, 202
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
            203
        },
            "xrGetRecommendedLayerResolutionMETA"
        ) || reportMissing("XR", "XR_META_recommended_layer_resolution");
    }

    private static boolean check_META_spatial_entity_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_spatial_entity_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            204
        },
            "xrGetSpaceTriangleMeshMETA"
        ) || reportMissing("XR", "XR_META_spatial_entity_mesh");
    }

    private static boolean check_META_spatial_entity_sharing(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_spatial_entity_sharing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            205
        },
            "xrShareSpacesMETA"
        ) || reportMissing("XR", "XR_META_spatial_entity_sharing");
    }

    private static boolean check_META_virtual_keyboard(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_virtual_keyboard")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216
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
            217
        },
            "xrCreateSpaceFromCoordinateFrameUIDML"
        ) || reportMissing("XR", "XR_ML_compat");
    }

    private static boolean check_ML_facial_expression(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_facial_expression")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            218, 219, 220
        },
            "xrCreateFacialExpressionClientML", "xrDestroyFacialExpressionClientML", "xrGetFacialExpressionBlendShapePropertiesML"
        ) || reportMissing("XR", "XR_ML_facial_expression");
    }

    private static boolean check_ML_localization_map(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_localization_map")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            221, 222, 223, 224, 225, 226, 227
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
            228, 229, 230, 231, 232, 233, 234, 235, 236, 237
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
            238, 239, 240
        },
            "xrCreateSpatialAnchorsAsyncML", "xrCreateSpatialAnchorsCompleteML", "xrGetSpatialAnchorStateML"
        ) || reportMissing("XR", "XR_ML_spatial_anchors");
    }

    private static boolean check_ML_spatial_anchors_storage(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_spatial_anchors_storage")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            241, 242, 243, 244, 245, 246, 247, 248, 249, 250
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
            251
        },
            "xrSetSystemNotificationsML"
        ) || reportMissing("XR", "XR_ML_system_notifications");
    }

    private static boolean check_ML_user_calibration(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_user_calibration")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            252
        },
            "xrEnableUserCalibrationEventsML"
        ) || reportMissing("XR", "XR_ML_user_calibration");
    }

    private static boolean check_ML_world_mesh_detection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_world_mesh_detection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            253, 254, 255, 256, 257, 258, 259, 260, 261
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
            262
        },
            "xrApplyForceFeedbackCurlMNDX"
        ) || reportMissing("XR", "XR_MNDX_force_feedback_curl");
    }

    private static boolean check_MSFT_composition_layer_reprojection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_composition_layer_reprojection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            263
        },
            "xrEnumerateReprojectionModesMSFT"
        ) || reportMissing("XR", "XR_MSFT_composition_layer_reprojection");
    }

    private static boolean check_MSFT_controller_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_controller_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            264, 265, 266, 267
        },
            "xrGetControllerModelKeyMSFT", "xrLoadControllerModelMSFT", "xrGetControllerModelPropertiesMSFT", "xrGetControllerModelStateMSFT"
        ) || reportMissing("XR", "XR_MSFT_controller_model");
    }

    private static boolean check_MSFT_hand_tracking_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_hand_tracking_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            268, 269
        },
            "xrCreateHandMeshSpaceMSFT", "xrUpdateHandMeshMSFT"
        ) || reportMissing("XR", "XR_MSFT_hand_tracking_mesh");
    }

    private static boolean check_MSFT_perception_anchor_interop(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_perception_anchor_interop")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            270, 271
        },
            "xrCreateSpatialAnchorFromPerceptionAnchorMSFT", "xrTryGetPerceptionAnchorFromSpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_perception_anchor_interop");
    }

    private static boolean check_MSFT_scene_marker(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            272, 273
        },
            "xrGetSceneMarkerRawDataMSFT", "xrGetSceneMarkerDecodedStringMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_marker");
    }

    private static boolean check_MSFT_scene_understanding(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_understanding")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            274, 275, 276, 277, 278, 279, 280, 281, 282, 283
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
            284, 285
        },
            "xrDeserializeSceneMSFT", "xrGetSerializedSceneFragmentDataMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_understanding_serialization");
    }

    private static boolean check_MSFT_spatial_anchor(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_anchor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            286, 287, 288
        },
            "xrCreateSpatialAnchorMSFT", "xrCreateSpatialAnchorSpaceMSFT", "xrDestroySpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_anchor");
    }

    private static boolean check_MSFT_spatial_anchor_persistence(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_anchor_persistence")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            289, 290, 291, 292, 293, 294, 295
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
            296, 297, 298, 299
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
            300, 301
        },
            "xrGetAudioOutputDeviceGuidOculus", "xrGetAudioInputDeviceGuidOculus"
        ) || reportMissing("XR", "XR_OCULUS_audio_device_guid");
    }

    private static boolean check_OCULUS_external_camera(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_OCULUS_external_camera")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            302
        },
            "xrEnumerateExternalCamerasOCULUS"
        ) || reportMissing("XR", "XR_OCULUS_external_camera");
    }

    private static boolean check_QCOM_tracking_optimization_settings(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_QCOM_tracking_optimization_settings")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            303
        },
            "xrSetTrackingOptimizationSettingsHintQCOM"
        ) || reportMissing("XR", "XR_QCOM_tracking_optimization_settings");
    }

    private static boolean check_VARJO_environment_depth_estimation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_environment_depth_estimation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            304
        },
            "xrSetEnvironmentDepthEstimationVARJO"
        ) || reportMissing("XR", "XR_VARJO_environment_depth_estimation");
    }

    private static boolean check_VARJO_marker_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_marker_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            305, 306, 307, 308, 309
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
            310
        },
            "xrSetViewOffsetVARJO"
        ) || reportMissing("XR", "XR_VARJO_view_offset");
    }

}
