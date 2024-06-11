/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.Checks.*;

/** Defines the capabilities of an OpenXR {@code XrInstance}. */
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

    // ML_user_calibration
    public final long
        xrEnableUserCalibrationEventsML;

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

    /** When true, {@link XR10} is supported. */
    public final boolean OpenXR10;
    /** When true, {@link XR11} is supported. */
    public final boolean OpenXR11;
    /** When true, {@link ALMALENCEDigitalLensControl} is supported. */
    public final boolean XR_ALMALENCE_digital_lens_control;
    /** When true, {@link BDControllerInteraction} is supported. */
    public final boolean XR_BD_controller_interaction;
    /** When true, {@link EPICViewConfigurationFov} is supported. */
    public final boolean XR_EPIC_view_configuration_fov;
    /** When true, {@link EXTActiveActionSetPriority} is supported. */
    public final boolean XR_EXT_active_action_set_priority;
    /** When true, {@link EXTCompositionLayerInvertedAlpha} is supported. */
    public final boolean XR_EXT_composition_layer_inverted_alpha;
    /** When true, {@link EXTConformanceAutomation} is supported. */
    public final boolean XR_EXT_conformance_automation;
    /** When true, {@link EXTDebugUtils} is supported. */
    public final boolean XR_EXT_debug_utils;
    /** When true, {@link EXTDpadBinding} is supported. */
    public final boolean XR_EXT_dpad_binding;
    /** When true, {@link EXTEyeGazeInteraction} is supported. */
    public final boolean XR_EXT_eye_gaze_interaction;
    /** When true, {@link EXTFuture} is supported. */
    public final boolean XR_EXT_future;
    /** When true, {@link EXTHandInteraction} is supported. */
    public final boolean XR_EXT_hand_interaction;
    /** When true, {@link EXTHandJointsMotionRange} is supported. */
    public final boolean XR_EXT_hand_joints_motion_range;
    /** When true, {@link EXTHandTracking} is supported. */
    public final boolean XR_EXT_hand_tracking;
    /** When true, {@link EXTHandTrackingDataSource} is supported. */
    public final boolean XR_EXT_hand_tracking_data_source;
    /** When true, {@link EXTHPMixedRealityController} is supported. */
    public final boolean XR_EXT_hp_mixed_reality_controller;
    /** When true, {@link EXTLocalFloor} is supported. */
    public final boolean XR_EXT_local_floor;
    /** When true, {@link EXTPalmPose} is supported. */
    public final boolean XR_EXT_palm_pose;
    /** When true, {@link EXTPerformanceSettings} is supported. */
    public final boolean XR_EXT_performance_settings;
    /** When true, {@link EXTPlaneDetection} is supported. */
    public final boolean XR_EXT_plane_detection;
    /** When true, {@link EXTSamsungOdysseyController} is supported. */
    public final boolean XR_EXT_samsung_odyssey_controller;
    /** When true, {@link EXTThermalQuery} is supported. */
    public final boolean XR_EXT_thermal_query;
    /** When true, {@link EXTUserPresence} is supported. */
    public final boolean XR_EXT_user_presence;
    /** When true, {@link EXTUUIUD} is supported. */
    public final boolean XR_EXT_uuid;
    /** When true, {@link EXTViewConfigurationDepthRange} is supported. */
    public final boolean XR_EXT_view_configuration_depth_range;
    /** When true, {@link EXTWin32AppcontainerCompatible} is supported. */
    public final boolean XR_EXT_win32_appcontainer_compatible;
    /** When true, {@link EXTXOverlay} is supported. */
    public final boolean XR_EXTX_overlay;
    /** When true, {@link FBBodyTracking} is supported. */
    public final boolean XR_FB_body_tracking;
    /** When true, {@link FBColorSpace} is supported. */
    public final boolean XR_FB_color_space;
    /** When true, {@link FBCompositionLayerAlphaBlend} is supported. */
    public final boolean XR_FB_composition_layer_alpha_blend;
    /** When true, {@link FBCompositionLayerDepthTest} is supported. */
    public final boolean XR_FB_composition_layer_depth_test;
    /** When true, {@link FBCompositionLayerImageLayout} is supported. */
    public final boolean XR_FB_composition_layer_image_layout;
    /** When true, {@link FBCompositionLayerSecureContent} is supported. */
    public final boolean XR_FB_composition_layer_secure_content;
    /** When true, {@link FBCompositionLayerSettings} is supported. */
    public final boolean XR_FB_composition_layer_settings;
    /** When true, {@link FBDisplayRefreshRate} is supported. */
    public final boolean XR_FB_display_refresh_rate;
    /** When true, {@link FBEyeTrackingSocial} is supported. */
    public final boolean XR_FB_eye_tracking_social;
    /** When true, {@link FBFaceTracking} is supported. */
    public final boolean XR_FB_face_tracking;
    /** When true, {@link FBFaceTracking2} is supported. */
    public final boolean XR_FB_face_tracking2;
    /** When true, {@link FBFoveation} is supported. */
    public final boolean XR_FB_foveation;
    /** When true, {@link FBFoveationConfiguration} is supported. */
    public final boolean XR_FB_foveation_configuration;
    /** When true, {@link FBFoveationVulkan} is supported. */
    public final boolean XR_FB_foveation_vulkan;
    /** When true, {@link FBHandTrackingAim} is supported. */
    public final boolean XR_FB_hand_tracking_aim;
    /** When true, {@link FBHandTrackingCapsules} is supported. */
    public final boolean XR_FB_hand_tracking_capsules;
    /** When true, {@link FBHandTrackingMesh} is supported. */
    public final boolean XR_FB_hand_tracking_mesh;
    /** When true, {@link FBHapticAmplitudeEnvelope} is supported. */
    public final boolean XR_FB_haptic_amplitude_envelope;
    /** When true, {@link FBHapticPcm} is supported. */
    public final boolean XR_FB_haptic_pcm;
    /** When true, {@link FBKeyboardTracking} is supported. */
    public final boolean XR_FB_keyboard_tracking;
    /** When true, {@link FBPassthrough} is supported. */
    public final boolean XR_FB_passthrough;
    /** When true, {@link FBPassthroughKeyboardHands} is supported. */
    public final boolean XR_FB_passthrough_keyboard_hands;
    /** When true, {@link FBRenderModel} is supported. */
    public final boolean XR_FB_render_model;
    /** When true, {@link FBScene} is supported. */
    public final boolean XR_FB_scene;
    /** When true, {@link FBSceneCapture} is supported. */
    public final boolean XR_FB_scene_capture;
    /** When true, {@link FBSpaceWarp} is supported. */
    public final boolean XR_FB_space_warp;
    /** When true, {@link FBSpatialEntity} is supported. */
    public final boolean XR_FB_spatial_entity;
    /** When true, {@link FBSpatialEntityContainer} is supported. */
    public final boolean XR_FB_spatial_entity_container;
    /** When true, {@link FBSpatialEntityQuery} is supported. */
    public final boolean XR_FB_spatial_entity_query;
    /** When true, {@link FBSpatialEntitySharing} is supported. */
    public final boolean XR_FB_spatial_entity_sharing;
    /** When true, {@link FBSpatialEntityStorage} is supported. */
    public final boolean XR_FB_spatial_entity_storage;
    /** When true, {@link FBSpatialEntityStorageBatch} is supported. */
    public final boolean XR_FB_spatial_entity_storage_batch;
    /** When true, {@link FBSpatialEntityUser} is supported. */
    public final boolean XR_FB_spatial_entity_user;
    /** When true, {@link FBSwapchainUpdateState} is supported. */
    public final boolean XR_FB_swapchain_update_state;
    /** When true, {@link FBSwapchainUpdateStateOpenGLES} is supported. */
    public final boolean XR_FB_swapchain_update_state_opengl_es;
    /** When true, {@link FBSwapchainUpdateStateVulkan} is supported. */
    public final boolean XR_FB_swapchain_update_state_vulkan;
    /** When true, {@link FBTouchControllerPro} is supported. */
    public final boolean XR_FB_touch_controller_pro;
    /** When true, {@link FBTouchControllerProximity} is supported. */
    public final boolean XR_FB_touch_controller_proximity;
    /** When true, {@link FBTriangleMesh} is supported. */
    public final boolean XR_FB_triangle_mesh;
    /** When true, {@link HTCAnchor} is supported. */
    public final boolean XR_HTC_anchor;
    /** When true, {@link HTCFacialTracking} is supported. */
    public final boolean XR_HTC_facial_tracking;
    /** When true, {@link HTCFoveation} is supported. */
    public final boolean XR_HTC_foveation;
    /** When true, {@link HTCHandInteraction} is supported. */
    public final boolean XR_HTC_hand_interaction;
    /** When true, {@link HTCPassthrough} is supported. */
    public final boolean XR_HTC_passthrough;
    /** When true, {@link HTCViveCosmosControllerInteraction} is supported. */
    public final boolean XR_HTC_vive_cosmos_controller_interaction;
    /** When true, {@link HTCViveFocus3ControllerInteraction} is supported. */
    public final boolean XR_HTC_vive_focus3_controller_interaction;
    /** When true, {@link HTCViveWristTrackerInteraction} is supported. */
    public final boolean XR_HTC_vive_wrist_tracker_interaction;
    /** When true, {@link HTCXViveTrackerInteraction} is supported. */
    public final boolean XR_HTCX_vive_tracker_interaction;
    /** When true, {@link HUAWEIControllerInteraction} is supported. */
    public final boolean XR_HUAWEI_controller_interaction;
    /** When true, {@link KHRBindingModification} is supported. */
    public final boolean XR_KHR_binding_modification;
    /** When true, {@link KHRCompositionLayerColorScaleBias} is supported. */
    public final boolean XR_KHR_composition_layer_color_scale_bias;
    /** When true, {@link KHRCompositionLayerCube} is supported. */
    public final boolean XR_KHR_composition_layer_cube;
    /** When true, {@link KHRCompositionLayerCylinder} is supported. */
    public final boolean XR_KHR_composition_layer_cylinder;
    /** When true, {@link KHRCompositionLayerDepth} is supported. */
    public final boolean XR_KHR_composition_layer_depth;
    /** When true, {@link KHRCompositionLayerEquirect} is supported. */
    public final boolean XR_KHR_composition_layer_equirect;
    /** When true, {@link KHRCompositionLayerEquirect2} is supported. */
    public final boolean XR_KHR_composition_layer_equirect2;
    /** When true, {@link KHRConvertTimespecTime} is supported. */
    public final boolean XR_KHR_convert_timespec_time;
    /** When true, {@link KHRLoaderInit} is supported. */
    public final boolean XR_KHR_loader_init;
    /** When true, {@link KHRLocateSpaces} is supported. */
    public final boolean XR_KHR_locate_spaces;
    /** When true, {@link KHRMaintenance1} is supported. */
    public final boolean XR_KHR_maintenance1;
    /** When true, {@link KHROpenGLEnable} is supported. */
    public final boolean XR_KHR_opengl_enable;
    /** When true, {@link KHRSwapchainUsageInputAttachmentBit} is supported. */
    public final boolean XR_KHR_swapchain_usage_input_attachment_bit;
    /** When true, {@link KHRVisibilityMask} is supported. */
    public final boolean XR_KHR_visibility_mask;
    /** When true, {@link KHRVulkanEnable} is supported. */
    public final boolean XR_KHR_vulkan_enable;
    /** When true, {@link KHRVulkanEnable2} is supported. */
    public final boolean XR_KHR_vulkan_enable2;
    /** When true, {@link KHRVulkanSwapchainFormatList} is supported. */
    public final boolean XR_KHR_vulkan_swapchain_format_list;
    /** When true, {@link KHRWin32ConvertPerformanceCounterTime} is supported. */
    public final boolean XR_KHR_win32_convert_performance_counter_time;
    /** When true, {@link METAAutomaticLayerFilter} is supported. */
    public final boolean XR_META_automatic_layer_filter;
    /** When true, {@link METAEnvironmentDepth} is supported. */
    public final boolean XR_META_environment_depth;
    /** When true, {@link METAFoveationEyeTracked} is supported. */
    public final boolean XR_META_foveation_eye_tracked;
    /** When true, {@link METAHeadsetId} is supported. */
    public final boolean XR_META_headset_id;
    /** When true, {@link METALocalDimming} is supported. */
    public final boolean XR_META_local_dimming;
    /** When true, {@link METAPassthroughColorLut} is supported. */
    public final boolean XR_META_passthrough_color_lut;
    /** When true, {@link METAPassthroughPreferences} is supported. */
    public final boolean XR_META_passthrough_preferences;
    /** When true, {@link METAPerformanceMetrics} is supported. */
    public final boolean XR_META_performance_metrics;
    /** When true, {@link METARecommendedLayerResolution} is supported. */
    public final boolean XR_META_recommended_layer_resolution;
    /** When true, {@link METASpatialEntityMesh} is supported. */
    public final boolean XR_META_spatial_entity_mesh;
    /** When true, {@link METATouchControllerPlus} is supported. */
    public final boolean XR_META_touch_controller_plus;
    /** When true, {@link METAVirtualKeyboard} is supported. */
    public final boolean XR_META_virtual_keyboard;
    /** When true, {@link METAVulkanSwapchainCreateInfo} is supported. */
    public final boolean XR_META_vulkan_swapchain_create_info;
    /** When true, {@link MLCompat} is supported. */
    public final boolean XR_ML_compat;
    /** When true, {@link MLFrameEndInfo} is supported. */
    public final boolean XR_ML_frame_end_info;
    /** When true, {@link MLGlobalDimmer} is supported. */
    public final boolean XR_ML_global_dimmer;
    /** When true, {@link MLLocalizationMap} is supported. */
    public final boolean XR_ML_localization_map;
    /** When true, {@link MLMarkerUnderstanding} is supported. */
    public final boolean XR_ML_marker_understanding;
    /** When true, {@link MLMl2ControllerInteraction} is supported. */
    public final boolean XR_ML_ml2_controller_interaction;
    /** When true, {@link MLUserCalibration} is supported. */
    public final boolean XR_ML_user_calibration;
    /** When true, {@link MNDHeadless} is supported. */
    public final boolean XR_MND_headless;
    /** When true, {@link MNDSwapchainUsageInputAttachmentBit} is supported. */
    public final boolean XR_MND_swapchain_usage_input_attachment_bit;
    /** When true, {@link MNDXEGLEnable} is supported. */
    public final boolean XR_MNDX_egl_enable;
    /** When true, {@link MNDXForceFeedbackCurl} is supported. */
    public final boolean XR_MNDX_force_feedback_curl;
    /** When true, {@link MSFTCompositionLayerReprojection} is supported. */
    public final boolean XR_MSFT_composition_layer_reprojection;
    /** When true, {@link MSFTControllerModel} is supported. */
    public final boolean XR_MSFT_controller_model;
    /** When true, {@link MSFTFirstPersonObserver} is supported. */
    public final boolean XR_MSFT_first_person_observer;
    /** When true, {@link MSFTHandInteraction} is supported. */
    public final boolean XR_MSFT_hand_interaction;
    /** When true, {@link MSFTHandTrackingMesh} is supported. */
    public final boolean XR_MSFT_hand_tracking_mesh;
    /** When true, {@link MSFTHolographicWindowAttachment} is supported. */
    public final boolean XR_MSFT_holographic_window_attachment;
    /** When true, {@link MSFTPerceptionAnchorInterop} is supported. */
    public final boolean XR_MSFT_perception_anchor_interop;
    /** When true, {@link MSFTSceneMarker} is supported. */
    public final boolean XR_MSFT_scene_marker;
    /** When true, {@link MSFTSceneUnderstanding} is supported. */
    public final boolean XR_MSFT_scene_understanding;
    /** When true, {@link MSFTSceneUnderstandingSerialization} is supported. */
    public final boolean XR_MSFT_scene_understanding_serialization;
    /** When true, {@link MSFTSecondaryViewConfiguration} is supported. */
    public final boolean XR_MSFT_secondary_view_configuration;
    /** When true, {@link MSFTSpatialAnchor} is supported. */
    public final boolean XR_MSFT_spatial_anchor;
    /** When true, {@link MSFTSpatialAnchorPersistence} is supported. */
    public final boolean XR_MSFT_spatial_anchor_persistence;
    /** When true, {@link MSFTSpatialGraphBridge} is supported. */
    public final boolean XR_MSFT_spatial_graph_bridge;
    /** When true, {@link MSFTUnboundedReferenceSpace} is supported. */
    public final boolean XR_MSFT_unbounded_reference_space;
    /** When true, {@link OCULUSAudioDeviceGuid} is supported. */
    public final boolean XR_OCULUS_audio_device_guid;
    /** When true, {@link OCULUSExternalCamera} is supported. */
    public final boolean XR_OCULUS_external_camera;
    /** When true, {@link OPPOControllerInteraction} is supported. */
    public final boolean XR_OPPO_controller_interaction;
    /** When true, {@link QCOMTrackingOptimizationSettings} is supported. */
    public final boolean XR_QCOM_tracking_optimization_settings;
    /** When true, {@link ULTRALEAPHandTrackingForearm} is supported. */
    public final boolean XR_ULTRALEAP_hand_tracking_forearm;
    /** When true, {@link VALVEAnalogThreshold} is supported. */
    public final boolean XR_VALVE_analog_threshold;
    /** When true, {@link VARJOCompositionLayerDepthTest} is supported. */
    public final boolean XR_VARJO_composition_layer_depth_test;
    /** When true, {@link VARJOEnvironmentDepthEstimation} is supported. */
    public final boolean XR_VARJO_environment_depth_estimation;
    /** When true, {@link VARJOFoveatedRendering} is supported. */
    public final boolean XR_VARJO_foveated_rendering;
    /** When true, {@link VARJOMarkerTracking} is supported. */
    public final boolean XR_VARJO_marker_tracking;
    /** When true, {@link VARJOQuadViews} is supported. */
    public final boolean XR_VARJO_quad_views;
    /** When true, {@link VARJOViewOffset} is supported. */
    public final boolean XR_VARJO_view_offset;
    /** When true, {@link VARJOXr4ControllerInteraction} is supported. */
    public final boolean XR_VARJO_xr4_controller_interaction;
    /** When true, {@link YVRControllerInteraction} is supported. */
    public final boolean XR_YVR_controller_interaction;

    XRCapabilities(FunctionProvider provider, long apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[273];

        OpenXR10 = check_XR10(provider, caps, ext);
        OpenXR11 = check_XR11(provider, caps, ext);
        XR_ALMALENCE_digital_lens_control = check_ALMALENCE_digital_lens_control(provider, caps, ext);
        XR_BD_controller_interaction = ext.contains("XR_BD_controller_interaction");
        XR_EPIC_view_configuration_fov = ext.contains("XR_EPIC_view_configuration_fov");
        XR_EXT_active_action_set_priority = ext.contains("XR_EXT_active_action_set_priority");
        XR_EXT_composition_layer_inverted_alpha = ext.contains("XR_EXT_composition_layer_inverted_alpha");
        XR_EXT_conformance_automation = check_EXT_conformance_automation(provider, caps, ext);
        XR_EXT_debug_utils = check_EXT_debug_utils(provider, caps, ext);
        XR_EXT_dpad_binding = ext.contains("XR_EXT_dpad_binding");
        XR_EXT_eye_gaze_interaction = ext.contains("XR_EXT_eye_gaze_interaction");
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
        XR_META_environment_depth = check_META_environment_depth(provider, caps, ext);
        XR_META_foveation_eye_tracked = check_META_foveation_eye_tracked(provider, caps, ext);
        XR_META_headset_id = ext.contains("XR_META_headset_id");
        XR_META_local_dimming = ext.contains("XR_META_local_dimming");
        XR_META_passthrough_color_lut = check_META_passthrough_color_lut(provider, caps, ext);
        XR_META_passthrough_preferences = check_META_passthrough_preferences(provider, caps, ext);
        XR_META_performance_metrics = check_META_performance_metrics(provider, caps, ext);
        XR_META_recommended_layer_resolution = check_META_recommended_layer_resolution(provider, caps, ext);
        XR_META_spatial_entity_mesh = check_META_spatial_entity_mesh(provider, caps, ext);
        XR_META_touch_controller_plus = ext.contains("XR_META_touch_controller_plus");
        XR_META_virtual_keyboard = check_META_virtual_keyboard(provider, caps, ext);
        XR_META_vulkan_swapchain_create_info = ext.contains("XR_META_vulkan_swapchain_create_info");
        XR_ML_compat = check_ML_compat(provider, caps, ext);
        XR_ML_frame_end_info = ext.contains("XR_ML_frame_end_info");
        XR_ML_global_dimmer = ext.contains("XR_ML_global_dimmer");
        XR_ML_localization_map = check_ML_localization_map(provider, caps, ext);
        XR_ML_marker_understanding = check_ML_marker_understanding(provider, caps, ext);
        XR_ML_ml2_controller_interaction = ext.contains("XR_ML_ml2_controller_interaction");
        XR_ML_user_calibration = check_ML_user_calibration(provider, caps, ext);
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
        xrSetInputDeviceActiveEXT = caps[53];
        xrSetInputDeviceStateBoolEXT = caps[54];
        xrSetInputDeviceStateFloatEXT = caps[55];
        xrSetInputDeviceStateVector2fEXT = caps[56];
        xrSetInputDeviceLocationEXT = caps[57];
        xrSetDebugUtilsObjectNameEXT = caps[58];
        xrCreateDebugUtilsMessengerEXT = caps[59];
        xrDestroyDebugUtilsMessengerEXT = caps[60];
        xrSubmitDebugUtilsMessageEXT = caps[61];
        xrSessionBeginDebugUtilsLabelRegionEXT = caps[62];
        xrSessionEndDebugUtilsLabelRegionEXT = caps[63];
        xrSessionInsertDebugUtilsLabelEXT = caps[64];
        xrPollFutureEXT = caps[65];
        xrCancelFutureEXT = caps[66];
        xrCreateHandTrackerEXT = caps[67];
        xrDestroyHandTrackerEXT = caps[68];
        xrLocateHandJointsEXT = caps[69];
        xrPerfSettingsSetPerformanceLevelEXT = caps[70];
        xrCreatePlaneDetectorEXT = caps[71];
        xrDestroyPlaneDetectorEXT = caps[72];
        xrBeginPlaneDetectionEXT = caps[73];
        xrGetPlaneDetectionStateEXT = caps[74];
        xrGetPlaneDetectionsEXT = caps[75];
        xrGetPlanePolygonBufferEXT = caps[76];
        xrThermalGetTemperatureTrendEXT = caps[77];
        xrCreateBodyTrackerFB = caps[78];
        xrDestroyBodyTrackerFB = caps[79];
        xrLocateBodyJointsFB = caps[80];
        xrGetBodySkeletonFB = caps[81];
        xrEnumerateColorSpacesFB = caps[82];
        xrSetColorSpaceFB = caps[83];
        xrEnumerateDisplayRefreshRatesFB = caps[84];
        xrGetDisplayRefreshRateFB = caps[85];
        xrRequestDisplayRefreshRateFB = caps[86];
        xrCreateEyeTrackerFB = caps[87];
        xrDestroyEyeTrackerFB = caps[88];
        xrGetEyeGazesFB = caps[89];
        xrCreateFaceTrackerFB = caps[90];
        xrDestroyFaceTrackerFB = caps[91];
        xrGetFaceExpressionWeightsFB = caps[92];
        xrCreateFaceTracker2FB = caps[93];
        xrDestroyFaceTracker2FB = caps[94];
        xrGetFaceExpressionWeights2FB = caps[95];
        xrCreateFoveationProfileFB = caps[96];
        xrDestroyFoveationProfileFB = caps[97];
        xrGetHandMeshFB = caps[98];
        xrGetDeviceSampleRateFB = caps[99];
        xrQuerySystemTrackedKeyboardFB = caps[100];
        xrCreateKeyboardSpaceFB = caps[101];
        xrCreatePassthroughFB = caps[102];
        xrDestroyPassthroughFB = caps[103];
        xrPassthroughStartFB = caps[104];
        xrPassthroughPauseFB = caps[105];
        xrCreatePassthroughLayerFB = caps[106];
        xrDestroyPassthroughLayerFB = caps[107];
        xrPassthroughLayerPauseFB = caps[108];
        xrPassthroughLayerResumeFB = caps[109];
        xrPassthroughLayerSetStyleFB = caps[110];
        xrCreateGeometryInstanceFB = caps[111];
        xrDestroyGeometryInstanceFB = caps[112];
        xrGeometryInstanceSetTransformFB = caps[113];
        xrPassthroughLayerSetKeyboardHandsIntensityFB = caps[114];
        xrEnumerateRenderModelPathsFB = caps[115];
        xrGetRenderModelPropertiesFB = caps[116];
        xrLoadRenderModelFB = caps[117];
        xrGetSpaceBoundingBox2DFB = caps[118];
        xrGetSpaceBoundingBox3DFB = caps[119];
        xrGetSpaceSemanticLabelsFB = caps[120];
        xrGetSpaceBoundary2DFB = caps[121];
        xrGetSpaceRoomLayoutFB = caps[122];
        xrRequestSceneCaptureFB = caps[123];
        xrCreateSpatialAnchorFB = caps[124];
        xrGetSpaceUuidFB = caps[125];
        xrEnumerateSpaceSupportedComponentsFB = caps[126];
        xrSetSpaceComponentStatusFB = caps[127];
        xrGetSpaceComponentStatusFB = caps[128];
        xrGetSpaceContainerFB = caps[129];
        xrQuerySpacesFB = caps[130];
        xrRetrieveSpaceQueryResultsFB = caps[131];
        xrShareSpacesFB = caps[132];
        xrSaveSpaceFB = caps[133];
        xrEraseSpaceFB = caps[134];
        xrSaveSpaceListFB = caps[135];
        xrCreateSpaceUserFB = caps[136];
        xrGetSpaceUserIdFB = caps[137];
        xrDestroySpaceUserFB = caps[138];
        xrUpdateSwapchainFB = caps[139];
        xrGetSwapchainStateFB = caps[140];
        xrCreateTriangleMeshFB = caps[141];
        xrDestroyTriangleMeshFB = caps[142];
        xrTriangleMeshGetVertexBufferFB = caps[143];
        xrTriangleMeshGetIndexBufferFB = caps[144];
        xrTriangleMeshBeginUpdateFB = caps[145];
        xrTriangleMeshEndUpdateFB = caps[146];
        xrTriangleMeshBeginVertexBufferUpdateFB = caps[147];
        xrTriangleMeshEndVertexBufferUpdateFB = caps[148];
        xrCreateSpatialAnchorHTC = caps[149];
        xrGetSpatialAnchorNameHTC = caps[150];
        xrCreateFacialTrackerHTC = caps[151];
        xrDestroyFacialTrackerHTC = caps[152];
        xrGetFacialExpressionsHTC = caps[153];
        xrApplyFoveationHTC = caps[154];
        xrCreatePassthroughHTC = caps[155];
        xrDestroyPassthroughHTC = caps[156];
        xrEnumerateViveTrackerPathsHTCX = caps[157];
        xrConvertTimespecTimeToTimeKHR = caps[158];
        xrConvertTimeToTimespecTimeKHR = caps[159];
        xrLocateSpacesKHR = caps[160];
        xrGetOpenGLGraphicsRequirementsKHR = caps[161];
        xrGetVisibilityMaskKHR = caps[162];
        xrGetVulkanInstanceExtensionsKHR = caps[163];
        xrGetVulkanDeviceExtensionsKHR = caps[164];
        xrGetVulkanGraphicsDeviceKHR = caps[165];
        xrGetVulkanGraphicsRequirementsKHR = caps[166];
        xrCreateVulkanInstanceKHR = caps[167];
        xrCreateVulkanDeviceKHR = caps[168];
        xrGetVulkanGraphicsDevice2KHR = caps[169];
        xrGetVulkanGraphicsRequirements2KHR = caps[170];
        xrConvertWin32PerformanceCounterToTimeKHR = caps[171];
        xrConvertTimeToWin32PerformanceCounterKHR = caps[172];
        xrCreateEnvironmentDepthProviderMETA = caps[173];
        xrDestroyEnvironmentDepthProviderMETA = caps[174];
        xrStartEnvironmentDepthProviderMETA = caps[175];
        xrStopEnvironmentDepthProviderMETA = caps[176];
        xrCreateEnvironmentDepthSwapchainMETA = caps[177];
        xrDestroyEnvironmentDepthSwapchainMETA = caps[178];
        xrEnumerateEnvironmentDepthSwapchainImagesMETA = caps[179];
        xrGetEnvironmentDepthSwapchainStateMETA = caps[180];
        xrAcquireEnvironmentDepthImageMETA = caps[181];
        xrSetEnvironmentDepthHandRemovalMETA = caps[182];
        xrGetFoveationEyeTrackedStateMETA = caps[183];
        xrCreatePassthroughColorLutMETA = caps[184];
        xrDestroyPassthroughColorLutMETA = caps[185];
        xrUpdatePassthroughColorLutMETA = caps[186];
        xrGetPassthroughPreferencesMETA = caps[187];
        xrEnumeratePerformanceMetricsCounterPathsMETA = caps[188];
        xrSetPerformanceMetricsStateMETA = caps[189];
        xrGetPerformanceMetricsStateMETA = caps[190];
        xrQueryPerformanceMetricsCounterMETA = caps[191];
        xrGetRecommendedLayerResolutionMETA = caps[192];
        xrGetSpaceTriangleMeshMETA = caps[193];
        xrCreateVirtualKeyboardMETA = caps[194];
        xrDestroyVirtualKeyboardMETA = caps[195];
        xrCreateVirtualKeyboardSpaceMETA = caps[196];
        xrSuggestVirtualKeyboardLocationMETA = caps[197];
        xrGetVirtualKeyboardScaleMETA = caps[198];
        xrSetVirtualKeyboardModelVisibilityMETA = caps[199];
        xrGetVirtualKeyboardModelAnimationStatesMETA = caps[200];
        xrGetVirtualKeyboardDirtyTexturesMETA = caps[201];
        xrGetVirtualKeyboardTextureDataMETA = caps[202];
        xrSendVirtualKeyboardInputMETA = caps[203];
        xrChangeVirtualKeyboardTextContextMETA = caps[204];
        xrCreateSpaceFromCoordinateFrameUIDML = caps[205];
        xrEnableLocalizationEventsML = caps[206];
        xrQueryLocalizationMapsML = caps[207];
        xrRequestMapLocalizationML = caps[208];
        xrImportLocalizationMapML = caps[209];
        xrCreateExportedLocalizationMapML = caps[210];
        xrDestroyExportedLocalizationMapML = caps[211];
        xrGetExportedLocalizationMapDataML = caps[212];
        xrCreateMarkerDetectorML = caps[213];
        xrDestroyMarkerDetectorML = caps[214];
        xrSnapshotMarkerDetectorML = caps[215];
        xrGetMarkerDetectorStateML = caps[216];
        xrGetMarkersML = caps[217];
        xrGetMarkerReprojectionErrorML = caps[218];
        xrGetMarkerLengthML = caps[219];
        xrGetMarkerNumberML = caps[220];
        xrGetMarkerStringML = caps[221];
        xrCreateMarkerSpaceML = caps[222];
        xrEnableUserCalibrationEventsML = caps[223];
        xrApplyForceFeedbackCurlMNDX = caps[224];
        xrEnumerateReprojectionModesMSFT = caps[225];
        xrGetControllerModelKeyMSFT = caps[226];
        xrLoadControllerModelMSFT = caps[227];
        xrGetControllerModelPropertiesMSFT = caps[228];
        xrGetControllerModelStateMSFT = caps[229];
        xrCreateHandMeshSpaceMSFT = caps[230];
        xrUpdateHandMeshMSFT = caps[231];
        xrCreateSpatialAnchorFromPerceptionAnchorMSFT = caps[232];
        xrTryGetPerceptionAnchorFromSpatialAnchorMSFT = caps[233];
        xrGetSceneMarkerRawDataMSFT = caps[234];
        xrGetSceneMarkerDecodedStringMSFT = caps[235];
        xrEnumerateSceneComputeFeaturesMSFT = caps[236];
        xrCreateSceneObserverMSFT = caps[237];
        xrDestroySceneObserverMSFT = caps[238];
        xrCreateSceneMSFT = caps[239];
        xrDestroySceneMSFT = caps[240];
        xrComputeNewSceneMSFT = caps[241];
        xrGetSceneComputeStateMSFT = caps[242];
        xrGetSceneComponentsMSFT = caps[243];
        xrLocateSceneComponentsMSFT = caps[244];
        xrGetSceneMeshBuffersMSFT = caps[245];
        xrDeserializeSceneMSFT = caps[246];
        xrGetSerializedSceneFragmentDataMSFT = caps[247];
        xrCreateSpatialAnchorMSFT = caps[248];
        xrCreateSpatialAnchorSpaceMSFT = caps[249];
        xrDestroySpatialAnchorMSFT = caps[250];
        xrCreateSpatialAnchorStoreConnectionMSFT = caps[251];
        xrDestroySpatialAnchorStoreConnectionMSFT = caps[252];
        xrPersistSpatialAnchorMSFT = caps[253];
        xrEnumeratePersistedSpatialAnchorNamesMSFT = caps[254];
        xrCreateSpatialAnchorFromPersistedNameMSFT = caps[255];
        xrUnpersistSpatialAnchorMSFT = caps[256];
        xrClearSpatialAnchorStoreMSFT = caps[257];
        xrCreateSpatialGraphNodeSpaceMSFT = caps[258];
        xrTryCreateSpatialGraphStaticNodeBindingMSFT = caps[259];
        xrDestroySpatialGraphNodeBindingMSFT = caps[260];
        xrGetSpatialGraphNodeBindingPropertiesMSFT = caps[261];
        xrGetAudioOutputDeviceGuidOculus = caps[262];
        xrGetAudioInputDeviceGuidOculus = caps[263];
        xrEnumerateExternalCamerasOCULUS = caps[264];
        xrSetTrackingOptimizationSettingsHintQCOM = caps[265];
        xrSetEnvironmentDepthEstimationVARJO = caps[266];
        xrSetMarkerTrackingVARJO = caps[267];
        xrSetMarkerTrackingTimeoutVARJO = caps[268];
        xrSetMarkerTrackingPredictionVARJO = caps[269];
        xrGetMarkerSizeVARJO = caps[270];
        xrCreateMarkerSpaceVARJO = caps[271];
        xrSetViewOffsetVARJO = caps[272];
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

    private static boolean check_EXT_conformance_automation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_conformance_automation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            53, 54, 55, 56, 57
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
            58, 59, 60, 61, 62, 63, 64
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
            65, 66
        },
            "xrPollFutureEXT", "xrCancelFutureEXT"
        ) || reportMissing("XR", "XR_EXT_future");
    }

    private static boolean check_EXT_hand_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_hand_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            67, 68, 69
        },
            "xrCreateHandTrackerEXT", "xrDestroyHandTrackerEXT", "xrLocateHandJointsEXT"
        ) || reportMissing("XR", "XR_EXT_hand_tracking");
    }

    private static boolean check_EXT_performance_settings(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_performance_settings")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            70
        },
            "xrPerfSettingsSetPerformanceLevelEXT"
        ) || reportMissing("XR", "XR_EXT_performance_settings");
    }

    private static boolean check_EXT_plane_detection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_plane_detection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            71, 72, 73, 74, 75, 76
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
            77
        },
            "xrThermalGetTemperatureTrendEXT"
        ) || reportMissing("XR", "XR_EXT_thermal_query");
    }

    private static boolean check_FB_body_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_body_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            78, 79, 80, 81
        },
            "xrCreateBodyTrackerFB", "xrDestroyBodyTrackerFB", "xrLocateBodyJointsFB", "xrGetBodySkeletonFB"
        ) || reportMissing("XR", "XR_FB_body_tracking");
    }

    private static boolean check_FB_color_space(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_color_space")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            82, 83
        },
            "xrEnumerateColorSpacesFB", "xrSetColorSpaceFB"
        ) || reportMissing("XR", "XR_FB_color_space");
    }

    private static boolean check_FB_display_refresh_rate(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_display_refresh_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            84, 85, 86
        },
            "xrEnumerateDisplayRefreshRatesFB", "xrGetDisplayRefreshRateFB", "xrRequestDisplayRefreshRateFB"
        ) || reportMissing("XR", "XR_FB_display_refresh_rate");
    }

    private static boolean check_FB_eye_tracking_social(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_eye_tracking_social")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            87, 88, 89
        },
            "xrCreateEyeTrackerFB", "xrDestroyEyeTrackerFB", "xrGetEyeGazesFB"
        ) || reportMissing("XR", "XR_FB_eye_tracking_social");
    }

    private static boolean check_FB_face_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_face_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            90, 91, 92
        },
            "xrCreateFaceTrackerFB", "xrDestroyFaceTrackerFB", "xrGetFaceExpressionWeightsFB"
        ) || reportMissing("XR", "XR_FB_face_tracking");
    }

    private static boolean check_FB_face_tracking2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_face_tracking2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            93, 94, 95
        },
            "xrCreateFaceTracker2FB", "xrDestroyFaceTracker2FB", "xrGetFaceExpressionWeights2FB"
        ) || reportMissing("XR", "XR_FB_face_tracking2");
    }

    private static boolean check_FB_foveation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_foveation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            96, 97
        },
            "xrCreateFoveationProfileFB", "xrDestroyFoveationProfileFB"
        ) || reportMissing("XR", "XR_FB_foveation");
    }

    private static boolean check_FB_hand_tracking_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_hand_tracking_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            98
        },
            "xrGetHandMeshFB"
        ) || reportMissing("XR", "XR_FB_hand_tracking_mesh");
    }

    private static boolean check_FB_haptic_pcm(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_haptic_pcm")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            99
        },
            "xrGetDeviceSampleRateFB"
        ) || reportMissing("XR", "XR_FB_haptic_pcm");
    }

    private static boolean check_FB_keyboard_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_keyboard_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            100, 101
        },
            "xrQuerySystemTrackedKeyboardFB", "xrCreateKeyboardSpaceFB"
        ) || reportMissing("XR", "XR_FB_keyboard_tracking");
    }

    private static boolean check_FB_passthrough(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_passthrough")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113
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
            114
        },
            "xrPassthroughLayerSetKeyboardHandsIntensityFB"
        ) || reportMissing("XR", "XR_FB_passthrough_keyboard_hands");
    }

    private static boolean check_FB_render_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_render_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            115, 116, 117
        },
            "xrEnumerateRenderModelPathsFB", "xrGetRenderModelPropertiesFB", "xrLoadRenderModelFB"
        ) || reportMissing("XR", "XR_FB_render_model");
    }

    private static boolean check_FB_scene(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_scene")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            118, 119, 120, 121, 122
        },
            "xrGetSpaceBoundingBox2DFB", "xrGetSpaceBoundingBox3DFB", "xrGetSpaceSemanticLabelsFB", "xrGetSpaceBoundary2DFB", "xrGetSpaceRoomLayoutFB"
        ) || reportMissing("XR", "XR_FB_scene");
    }

    private static boolean check_FB_scene_capture(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_scene_capture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            123
        },
            "xrRequestSceneCaptureFB"
        ) || reportMissing("XR", "XR_FB_scene_capture");
    }

    private static boolean check_FB_spatial_entity(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            124, 125, 126, 127, 128
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
            129
        },
            "xrGetSpaceContainerFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_container");
    }

    private static boolean check_FB_spatial_entity_query(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            130, 131
        },
            "xrQuerySpacesFB", "xrRetrieveSpaceQueryResultsFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_query");
    }

    private static boolean check_FB_spatial_entity_sharing(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_sharing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            132
        },
            "xrShareSpacesFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_sharing");
    }

    private static boolean check_FB_spatial_entity_storage(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_storage")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            133, 134
        },
            "xrSaveSpaceFB", "xrEraseSpaceFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_storage");
    }

    private static boolean check_FB_spatial_entity_storage_batch(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_storage_batch")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            135
        },
            "xrSaveSpaceListFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_storage_batch");
    }

    private static boolean check_FB_spatial_entity_user(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_user")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            136, 137, 138
        },
            "xrCreateSpaceUserFB", "xrGetSpaceUserIdFB", "xrDestroySpaceUserFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_user");
    }

    private static boolean check_FB_swapchain_update_state(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_swapchain_update_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            139, 140
        },
            "xrUpdateSwapchainFB", "xrGetSwapchainStateFB"
        ) || reportMissing("XR", "XR_FB_swapchain_update_state");
    }

    private static boolean check_FB_triangle_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_triangle_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            141, 142, 143, 144, 145, 146, 147, 148
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
            149, 150
        },
            "xrCreateSpatialAnchorHTC", "xrGetSpatialAnchorNameHTC"
        ) || reportMissing("XR", "XR_HTC_anchor");
    }

    private static boolean check_HTC_facial_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_facial_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            151, 152, 153
        },
            "xrCreateFacialTrackerHTC", "xrDestroyFacialTrackerHTC", "xrGetFacialExpressionsHTC"
        ) || reportMissing("XR", "XR_HTC_facial_tracking");
    }

    private static boolean check_HTC_foveation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_foveation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            154
        },
            "xrApplyFoveationHTC"
        ) || reportMissing("XR", "XR_HTC_foveation");
    }

    private static boolean check_HTC_passthrough(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_passthrough")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            155, 156
        },
            "xrCreatePassthroughHTC", "xrDestroyPassthroughHTC"
        ) || reportMissing("XR", "XR_HTC_passthrough");
    }

    private static boolean check_HTCX_vive_tracker_interaction(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTCX_vive_tracker_interaction")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            157
        },
            "xrEnumerateViveTrackerPathsHTCX"
        ) || reportMissing("XR", "XR_HTCX_vive_tracker_interaction");
    }

    private static boolean check_KHR_convert_timespec_time(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_convert_timespec_time")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            158, 159
        },
            "xrConvertTimespecTimeToTimeKHR", "xrConvertTimeToTimespecTimeKHR"
        ) || reportMissing("XR", "XR_KHR_convert_timespec_time");
    }

    private static boolean check_KHR_locate_spaces(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_locate_spaces")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            160
        },
            "xrLocateSpacesKHR"
        ) || reportMissing("XR", "XR_KHR_locate_spaces");
    }

    private static boolean check_KHR_opengl_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_opengl_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            161
        },
            "xrGetOpenGLGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_opengl_enable");
    }

    private static boolean check_KHR_visibility_mask(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_visibility_mask")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            162
        },
            "xrGetVisibilityMaskKHR"
        ) || reportMissing("XR", "XR_KHR_visibility_mask");
    }

    private static boolean check_KHR_vulkan_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_vulkan_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            163, 164, 165, 166
        },
            "xrGetVulkanInstanceExtensionsKHR", "xrGetVulkanDeviceExtensionsKHR", "xrGetVulkanGraphicsDeviceKHR", "xrGetVulkanGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_vulkan_enable");
    }

    private static boolean check_KHR_vulkan_enable2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_vulkan_enable2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            167, 168, 169, 170
        },
            "xrCreateVulkanInstanceKHR", "xrCreateVulkanDeviceKHR", "xrGetVulkanGraphicsDevice2KHR", "xrGetVulkanGraphicsRequirements2KHR"
        ) || reportMissing("XR", "XR_KHR_vulkan_enable2");
    }

    private static boolean check_KHR_win32_convert_performance_counter_time(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_win32_convert_performance_counter_time")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            171, 172
        },
            "xrConvertWin32PerformanceCounterToTimeKHR", "xrConvertTimeToWin32PerformanceCounterKHR"
        ) || reportMissing("XR", "XR_KHR_win32_convert_performance_counter_time");
    }

    private static boolean check_META_environment_depth(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_environment_depth")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            173, 174, 175, 176, 177, 178, 179, 180, 181, 182
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
            183
        },
            "xrGetFoveationEyeTrackedStateMETA"
        ) || reportMissing("XR", "XR_META_foveation_eye_tracked");
    }

    private static boolean check_META_passthrough_color_lut(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_passthrough_color_lut")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            184, 185, 186
        },
            "xrCreatePassthroughColorLutMETA", "xrDestroyPassthroughColorLutMETA", "xrUpdatePassthroughColorLutMETA"
        ) || reportMissing("XR", "XR_META_passthrough_color_lut");
    }

    private static boolean check_META_passthrough_preferences(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_passthrough_preferences")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            187
        },
            "xrGetPassthroughPreferencesMETA"
        ) || reportMissing("XR", "XR_META_passthrough_preferences");
    }

    private static boolean check_META_performance_metrics(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_performance_metrics")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            188, 189, 190, 191
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
            192
        },
            "xrGetRecommendedLayerResolutionMETA"
        ) || reportMissing("XR", "XR_META_recommended_layer_resolution");
    }

    private static boolean check_META_spatial_entity_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_spatial_entity_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            193
        },
            "xrGetSpaceTriangleMeshMETA"
        ) || reportMissing("XR", "XR_META_spatial_entity_mesh");
    }

    private static boolean check_META_virtual_keyboard(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_virtual_keyboard")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204
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
            205
        },
            "xrCreateSpaceFromCoordinateFrameUIDML"
        ) || reportMissing("XR", "XR_ML_compat");
    }

    private static boolean check_ML_localization_map(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_localization_map")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            206, 207, 208, 209, 210, 211, 212
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
            213, 214, 215, 216, 217, 218, 219, 220, 221, 222
        },
            "xrCreateMarkerDetectorML", "xrDestroyMarkerDetectorML", "xrSnapshotMarkerDetectorML", "xrGetMarkerDetectorStateML", "xrGetMarkersML", 
            "xrGetMarkerReprojectionErrorML", "xrGetMarkerLengthML", "xrGetMarkerNumberML", "xrGetMarkerStringML", "xrCreateMarkerSpaceML"
        ) || reportMissing("XR", "XR_ML_marker_understanding");
    }

    private static boolean check_ML_user_calibration(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_user_calibration")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            223
        },
            "xrEnableUserCalibrationEventsML"
        ) || reportMissing("XR", "XR_ML_user_calibration");
    }

    private static boolean check_MNDX_force_feedback_curl(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MNDX_force_feedback_curl")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            224
        },
            "xrApplyForceFeedbackCurlMNDX"
        ) || reportMissing("XR", "XR_MNDX_force_feedback_curl");
    }

    private static boolean check_MSFT_composition_layer_reprojection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_composition_layer_reprojection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            225
        },
            "xrEnumerateReprojectionModesMSFT"
        ) || reportMissing("XR", "XR_MSFT_composition_layer_reprojection");
    }

    private static boolean check_MSFT_controller_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_controller_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            226, 227, 228, 229
        },
            "xrGetControllerModelKeyMSFT", "xrLoadControllerModelMSFT", "xrGetControllerModelPropertiesMSFT", "xrGetControllerModelStateMSFT"
        ) || reportMissing("XR", "XR_MSFT_controller_model");
    }

    private static boolean check_MSFT_hand_tracking_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_hand_tracking_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            230, 231
        },
            "xrCreateHandMeshSpaceMSFT", "xrUpdateHandMeshMSFT"
        ) || reportMissing("XR", "XR_MSFT_hand_tracking_mesh");
    }

    private static boolean check_MSFT_perception_anchor_interop(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_perception_anchor_interop")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            232, 233
        },
            "xrCreateSpatialAnchorFromPerceptionAnchorMSFT", "xrTryGetPerceptionAnchorFromSpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_perception_anchor_interop");
    }

    private static boolean check_MSFT_scene_marker(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            234, 235
        },
            "xrGetSceneMarkerRawDataMSFT", "xrGetSceneMarkerDecodedStringMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_marker");
    }

    private static boolean check_MSFT_scene_understanding(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_understanding")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            236, 237, 238, 239, 240, 241, 242, 243, 244, 245
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
            246, 247
        },
            "xrDeserializeSceneMSFT", "xrGetSerializedSceneFragmentDataMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_understanding_serialization");
    }

    private static boolean check_MSFT_spatial_anchor(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_anchor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            248, 249, 250
        },
            "xrCreateSpatialAnchorMSFT", "xrCreateSpatialAnchorSpaceMSFT", "xrDestroySpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_anchor");
    }

    private static boolean check_MSFT_spatial_anchor_persistence(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_anchor_persistence")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            251, 252, 253, 254, 255, 256, 257
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
            258, 259, 260, 261
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
            262, 263
        },
            "xrGetAudioOutputDeviceGuidOculus", "xrGetAudioInputDeviceGuidOculus"
        ) || reportMissing("XR", "XR_OCULUS_audio_device_guid");
    }

    private static boolean check_OCULUS_external_camera(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_OCULUS_external_camera")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            264
        },
            "xrEnumerateExternalCamerasOCULUS"
        ) || reportMissing("XR", "XR_OCULUS_external_camera");
    }

    private static boolean check_QCOM_tracking_optimization_settings(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_QCOM_tracking_optimization_settings")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            265
        },
            "xrSetTrackingOptimizationSettingsHintQCOM"
        ) || reportMissing("XR", "XR_QCOM_tracking_optimization_settings");
    }

    private static boolean check_VARJO_environment_depth_estimation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_environment_depth_estimation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            266
        },
            "xrSetEnvironmentDepthEstimationVARJO"
        ) || reportMissing("XR", "XR_VARJO_environment_depth_estimation");
    }

    private static boolean check_VARJO_marker_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_marker_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            267, 268, 269, 270, 271
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
            272
        },
            "xrSetViewOffsetVARJO"
        ) || reportMissing("XR", "XR_VARJO_view_offset");
    }

}
