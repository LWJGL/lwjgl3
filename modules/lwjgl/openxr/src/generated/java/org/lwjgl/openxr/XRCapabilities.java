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

    // EXT_hand_tracking
    public final long
        xrCreateHandTrackerEXT,
        xrDestroyHandTrackerEXT,
        xrLocateHandJointsEXT;

    // EXT_performance_settings
    public final long
        xrPerfSettingsSetPerformanceLevelEXT;

    // EXT_thermal_query
    public final long
        xrThermalGetTemperatureTrendEXT;

    // FB_color_space
    public final long
        xrEnumerateColorSpacesFB,
        xrSetColorSpaceFB;

    // FB_display_refresh_rate
    public final long
        xrEnumerateDisplayRefreshRatesFB,
        xrGetDisplayRefreshRateFB,
        xrRequestDisplayRefreshRateFB;

    // FB_foveation
    public final long
        xrCreateFoveationProfileFB,
        xrDestroyFoveationProfileFB;

    // FB_hand_tracking_mesh
    public final long
        xrGetHandMeshFB;

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

    // HTCX_vive_tracker_interaction
    public final long
        xrEnumerateViveTrackerPathsHTCX;

    // KHR_convert_timespec_time
    public final long
        xrConvertTimespecTimeToTimeKHR,
        xrConvertTimeToTimespecTimeKHR;

    // KHR_opengl_enable
    public final long
        xrGetOpenGLGraphicsRequirementsKHR;

    // KHR_opengl_es_enable
    public final long
        xrGetOpenGLESGraphicsRequirementsKHR;

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
        xrCreateSpatialGraphNodeSpaceMSFT;

    // OCULUS_audio_device_guid
    public final long
        xrGetAudioOutputDeviceGuidOculus,
        xrGetAudioInputDeviceGuidOculus;

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

    /** The OpenXR API version number. */
    public final long apiVersion;

    /** When true, {@link XR10} is supported. */
    public final boolean OpenXR10;
    /** When true, {@link EPICViewConfigurationFov} is supported. */
    public final boolean XR_EPIC_view_configuration_fov;
    /** When true, {@link EXTConformanceAutomation} is supported. */
    public final boolean XR_EXT_conformance_automation;
    /** When true, {@link EXTDebugUtils} is supported. */
    public final boolean XR_EXT_debug_utils;
    /** When true, {@link EXTEyeGazeInteraction} is supported. */
    public final boolean XR_EXT_eye_gaze_interaction;
    /** When true, {@link EXTHandJointsMotionRange} is supported. */
    public final boolean XR_EXT_hand_joints_motion_range;
    /** When true, {@link EXTHandTracking} is supported. */
    public final boolean XR_EXT_hand_tracking;
    /** When true, {@link EXTHPMixedRealityController} is supported. */
    public final boolean XR_EXT_hp_mixed_reality_controller;
    /** When true, {@link EXTPerformanceSettings} is supported. */
    public final boolean XR_EXT_performance_settings;
    /** When true, {@link EXTSamsungOdysseyController} is supported. */
    public final boolean XR_EXT_samsung_odyssey_controller;
    /** When true, {@link EXTThermalQuery} is supported. */
    public final boolean XR_EXT_thermal_query;
    /** When true, {@link EXTViewConfigurationDepthRange} is supported. */
    public final boolean XR_EXT_view_configuration_depth_range;
    /** When true, {@link EXTWin32AppcontainerCompatible} is supported. */
    public final boolean XR_EXT_win32_appcontainer_compatible;
    /** When true, {@link EXTXOverlay} is supported. */
    public final boolean XR_EXTX_overlay;
    /** When true, {@link FBColorSpace} is supported. */
    public final boolean XR_FB_color_space;
    /** When true, {@link FBCompositionLayerAlphaBlend} is supported. */
    public final boolean XR_FB_composition_layer_alpha_blend;
    /** When true, {@link FBCompositionLayerImageLayout} is supported. */
    public final boolean XR_FB_composition_layer_image_layout;
    /** When true, {@link FBCompositionLayerSecureContent} is supported. */
    public final boolean XR_FB_composition_layer_secure_content;
    /** When true, {@link FBDisplayRefreshRate} is supported. */
    public final boolean XR_FB_display_refresh_rate;
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
    /** When true, {@link FBPassthrough} is supported. */
    public final boolean XR_FB_passthrough;
    /** When true, {@link FBSpaceWarp} is supported. */
    public final boolean XR_FB_space_warp;
    /** When true, {@link FBSwapchainUpdateState} is supported. */
    public final boolean XR_FB_swapchain_update_state;
    /** When true, {@link FBSwapchainUpdateStateOpenGLES} is supported. */
    public final boolean XR_FB_swapchain_update_state_opengl_es;
    /** When true, {@link FBSwapchainUpdateStateVulkan} is supported. */
    public final boolean XR_FB_swapchain_update_state_vulkan;
    /** When true, {@link FBTriangleMesh} is supported. */
    public final boolean XR_FB_triangle_mesh;
    /** When true, {@link HTCViveCosmosControllerInteraction} is supported. */
    public final boolean XR_HTC_vive_cosmos_controller_interaction;
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
    /** When true, {@link KHROpenGLEnable} is supported. */
    public final boolean XR_KHR_opengl_enable;
    /** When true, {@link KHROpenGLESEnable} is supported. */
    public final boolean XR_KHR_opengl_es_enable;
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
    /** When true, {@link MNDHeadless} is supported. */
    public final boolean XR_MND_headless;
    /** When true, {@link MNDSwapchainUsageInputAttachmentBit} is supported. */
    public final boolean XR_MND_swapchain_usage_input_attachment_bit;
    /** When true, {@link MNDXEGLEnable} is supported. */
    public final boolean XR_MNDX_egl_enable;
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

    XRCapabilities(FunctionProvider provider, long apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[154];

        OpenXR10 = check_XR10(provider, caps, ext);
        XR_EPIC_view_configuration_fov = ext.contains("XR_EPIC_view_configuration_fov");
        XR_EXT_conformance_automation = check_EXT_conformance_automation(provider, caps, ext);
        XR_EXT_debug_utils = check_EXT_debug_utils(provider, caps, ext);
        XR_EXT_eye_gaze_interaction = ext.contains("XR_EXT_eye_gaze_interaction");
        XR_EXT_hand_joints_motion_range = ext.contains("XR_EXT_hand_joints_motion_range");
        XR_EXT_hand_tracking = check_EXT_hand_tracking(provider, caps, ext);
        XR_EXT_hp_mixed_reality_controller = ext.contains("XR_EXT_hp_mixed_reality_controller");
        XR_EXT_performance_settings = check_EXT_performance_settings(provider, caps, ext);
        XR_EXT_samsung_odyssey_controller = ext.contains("XR_EXT_samsung_odyssey_controller");
        XR_EXT_thermal_query = check_EXT_thermal_query(provider, caps, ext);
        XR_EXT_view_configuration_depth_range = ext.contains("XR_EXT_view_configuration_depth_range");
        XR_EXT_win32_appcontainer_compatible = ext.contains("XR_EXT_win32_appcontainer_compatible");
        XR_EXTX_overlay = ext.contains("XR_EXTX_overlay");
        XR_FB_color_space = check_FB_color_space(provider, caps, ext);
        XR_FB_composition_layer_alpha_blend = ext.contains("XR_FB_composition_layer_alpha_blend");
        XR_FB_composition_layer_image_layout = ext.contains("XR_FB_composition_layer_image_layout");
        XR_FB_composition_layer_secure_content = ext.contains("XR_FB_composition_layer_secure_content");
        XR_FB_display_refresh_rate = check_FB_display_refresh_rate(provider, caps, ext);
        XR_FB_foveation = check_FB_foveation(provider, caps, ext);
        XR_FB_foveation_configuration = ext.contains("XR_FB_foveation_configuration");
        XR_FB_foveation_vulkan = ext.contains("XR_FB_foveation_vulkan");
        XR_FB_hand_tracking_aim = ext.contains("XR_FB_hand_tracking_aim");
        XR_FB_hand_tracking_capsules = ext.contains("XR_FB_hand_tracking_capsules");
        XR_FB_hand_tracking_mesh = check_FB_hand_tracking_mesh(provider, caps, ext);
        XR_FB_passthrough = check_FB_passthrough(provider, caps, ext);
        XR_FB_space_warp = ext.contains("XR_FB_space_warp");
        XR_FB_swapchain_update_state = check_FB_swapchain_update_state(provider, caps, ext);
        XR_FB_swapchain_update_state_opengl_es = ext.contains("XR_FB_swapchain_update_state_opengl_es");
        XR_FB_swapchain_update_state_vulkan = ext.contains("XR_FB_swapchain_update_state_vulkan");
        XR_FB_triangle_mesh = check_FB_triangle_mesh(provider, caps, ext);
        XR_HTC_vive_cosmos_controller_interaction = ext.contains("XR_HTC_vive_cosmos_controller_interaction");
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
        XR_KHR_opengl_enable = check_KHR_opengl_enable(provider, caps, ext);
        XR_KHR_opengl_es_enable = check_KHR_opengl_es_enable(provider, caps, ext);
        XR_KHR_swapchain_usage_input_attachment_bit = ext.contains("XR_KHR_swapchain_usage_input_attachment_bit");
        XR_KHR_visibility_mask = check_KHR_visibility_mask(provider, caps, ext);
        XR_KHR_vulkan_enable = check_KHR_vulkan_enable(provider, caps, ext);
        XR_KHR_vulkan_enable2 = check_KHR_vulkan_enable2(provider, caps, ext);
        XR_KHR_vulkan_swapchain_format_list = ext.contains("XR_KHR_vulkan_swapchain_format_list");
        XR_KHR_win32_convert_performance_counter_time = check_KHR_win32_convert_performance_counter_time(provider, caps, ext);
        XR_MND_headless = ext.contains("XR_MND_headless");
        XR_MND_swapchain_usage_input_attachment_bit = ext.contains("XR_MND_swapchain_usage_input_attachment_bit");
        XR_MNDX_egl_enable = ext.contains("XR_MNDX_egl_enable");
        XR_MSFT_composition_layer_reprojection = check_MSFT_composition_layer_reprojection(provider, caps, ext);
        XR_MSFT_controller_model = check_MSFT_controller_model(provider, caps, ext);
        XR_MSFT_first_person_observer = ext.contains("XR_MSFT_first_person_observer");
        XR_MSFT_hand_interaction = ext.contains("XR_MSFT_hand_interaction");
        XR_MSFT_hand_tracking_mesh = check_MSFT_hand_tracking_mesh(provider, caps, ext);
        XR_MSFT_holographic_window_attachment = ext.contains("XR_MSFT_holographic_window_attachment");
        XR_MSFT_perception_anchor_interop = check_MSFT_perception_anchor_interop(provider, caps, ext);
        XR_MSFT_scene_understanding = check_MSFT_scene_understanding(provider, caps, ext);
        XR_MSFT_scene_understanding_serialization = check_MSFT_scene_understanding_serialization(provider, caps, ext);
        XR_MSFT_secondary_view_configuration = ext.contains("XR_MSFT_secondary_view_configuration");
        XR_MSFT_spatial_anchor = check_MSFT_spatial_anchor(provider, caps, ext);
        XR_MSFT_spatial_anchor_persistence = check_MSFT_spatial_anchor_persistence(provider, caps, ext);
        XR_MSFT_spatial_graph_bridge = check_MSFT_spatial_graph_bridge(provider, caps, ext);
        XR_MSFT_unbounded_reference_space = ext.contains("XR_MSFT_unbounded_reference_space");
        XR_OCULUS_audio_device_guid = check_OCULUS_audio_device_guid(provider, caps, ext);
        XR_VALVE_analog_threshold = ext.contains("XR_VALVE_analog_threshold");
        XR_VARJO_composition_layer_depth_test = ext.contains("XR_VARJO_composition_layer_depth_test");
        XR_VARJO_environment_depth_estimation = check_VARJO_environment_depth_estimation(provider, caps, ext);
        XR_VARJO_foveated_rendering = ext.contains("XR_VARJO_foveated_rendering");
        XR_VARJO_marker_tracking = check_VARJO_marker_tracking(provider, caps, ext);
        XR_VARJO_quad_views = ext.contains("XR_VARJO_quad_views");

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
        xrSetInputDeviceActiveEXT = caps[51];
        xrSetInputDeviceStateBoolEXT = caps[52];
        xrSetInputDeviceStateFloatEXT = caps[53];
        xrSetInputDeviceStateVector2fEXT = caps[54];
        xrSetInputDeviceLocationEXT = caps[55];
        xrSetDebugUtilsObjectNameEXT = caps[56];
        xrCreateDebugUtilsMessengerEXT = caps[57];
        xrDestroyDebugUtilsMessengerEXT = caps[58];
        xrSubmitDebugUtilsMessageEXT = caps[59];
        xrSessionBeginDebugUtilsLabelRegionEXT = caps[60];
        xrSessionEndDebugUtilsLabelRegionEXT = caps[61];
        xrSessionInsertDebugUtilsLabelEXT = caps[62];
        xrCreateHandTrackerEXT = caps[63];
        xrDestroyHandTrackerEXT = caps[64];
        xrLocateHandJointsEXT = caps[65];
        xrPerfSettingsSetPerformanceLevelEXT = caps[66];
        xrThermalGetTemperatureTrendEXT = caps[67];
        xrEnumerateColorSpacesFB = caps[68];
        xrSetColorSpaceFB = caps[69];
        xrEnumerateDisplayRefreshRatesFB = caps[70];
        xrGetDisplayRefreshRateFB = caps[71];
        xrRequestDisplayRefreshRateFB = caps[72];
        xrCreateFoveationProfileFB = caps[73];
        xrDestroyFoveationProfileFB = caps[74];
        xrGetHandMeshFB = caps[75];
        xrCreatePassthroughFB = caps[76];
        xrDestroyPassthroughFB = caps[77];
        xrPassthroughStartFB = caps[78];
        xrPassthroughPauseFB = caps[79];
        xrCreatePassthroughLayerFB = caps[80];
        xrDestroyPassthroughLayerFB = caps[81];
        xrPassthroughLayerPauseFB = caps[82];
        xrPassthroughLayerResumeFB = caps[83];
        xrPassthroughLayerSetStyleFB = caps[84];
        xrCreateGeometryInstanceFB = caps[85];
        xrDestroyGeometryInstanceFB = caps[86];
        xrGeometryInstanceSetTransformFB = caps[87];
        xrUpdateSwapchainFB = caps[88];
        xrGetSwapchainStateFB = caps[89];
        xrCreateTriangleMeshFB = caps[90];
        xrDestroyTriangleMeshFB = caps[91];
        xrTriangleMeshGetVertexBufferFB = caps[92];
        xrTriangleMeshGetIndexBufferFB = caps[93];
        xrTriangleMeshBeginUpdateFB = caps[94];
        xrTriangleMeshEndUpdateFB = caps[95];
        xrTriangleMeshBeginVertexBufferUpdateFB = caps[96];
        xrTriangleMeshEndVertexBufferUpdateFB = caps[97];
        xrEnumerateViveTrackerPathsHTCX = caps[98];
        xrConvertTimespecTimeToTimeKHR = caps[99];
        xrConvertTimeToTimespecTimeKHR = caps[100];
        xrGetOpenGLGraphicsRequirementsKHR = caps[101];
        xrGetOpenGLESGraphicsRequirementsKHR = caps[102];
        xrGetVisibilityMaskKHR = caps[103];
        xrGetVulkanInstanceExtensionsKHR = caps[104];
        xrGetVulkanDeviceExtensionsKHR = caps[105];
        xrGetVulkanGraphicsDeviceKHR = caps[106];
        xrGetVulkanGraphicsRequirementsKHR = caps[107];
        xrCreateVulkanInstanceKHR = caps[108];
        xrCreateVulkanDeviceKHR = caps[109];
        xrGetVulkanGraphicsDevice2KHR = caps[110];
        xrGetVulkanGraphicsRequirements2KHR = caps[111];
        xrConvertWin32PerformanceCounterToTimeKHR = caps[112];
        xrConvertTimeToWin32PerformanceCounterKHR = caps[113];
        xrEnumerateReprojectionModesMSFT = caps[114];
        xrGetControllerModelKeyMSFT = caps[115];
        xrLoadControllerModelMSFT = caps[116];
        xrGetControllerModelPropertiesMSFT = caps[117];
        xrGetControllerModelStateMSFT = caps[118];
        xrCreateHandMeshSpaceMSFT = caps[119];
        xrUpdateHandMeshMSFT = caps[120];
        xrCreateSpatialAnchorFromPerceptionAnchorMSFT = caps[121];
        xrTryGetPerceptionAnchorFromSpatialAnchorMSFT = caps[122];
        xrEnumerateSceneComputeFeaturesMSFT = caps[123];
        xrCreateSceneObserverMSFT = caps[124];
        xrDestroySceneObserverMSFT = caps[125];
        xrCreateSceneMSFT = caps[126];
        xrDestroySceneMSFT = caps[127];
        xrComputeNewSceneMSFT = caps[128];
        xrGetSceneComputeStateMSFT = caps[129];
        xrGetSceneComponentsMSFT = caps[130];
        xrLocateSceneComponentsMSFT = caps[131];
        xrGetSceneMeshBuffersMSFT = caps[132];
        xrDeserializeSceneMSFT = caps[133];
        xrGetSerializedSceneFragmentDataMSFT = caps[134];
        xrCreateSpatialAnchorMSFT = caps[135];
        xrCreateSpatialAnchorSpaceMSFT = caps[136];
        xrDestroySpatialAnchorMSFT = caps[137];
        xrCreateSpatialAnchorStoreConnectionMSFT = caps[138];
        xrDestroySpatialAnchorStoreConnectionMSFT = caps[139];
        xrPersistSpatialAnchorMSFT = caps[140];
        xrEnumeratePersistedSpatialAnchorNamesMSFT = caps[141];
        xrCreateSpatialAnchorFromPersistedNameMSFT = caps[142];
        xrUnpersistSpatialAnchorMSFT = caps[143];
        xrClearSpatialAnchorStoreMSFT = caps[144];
        xrCreateSpatialGraphNodeSpaceMSFT = caps[145];
        xrGetAudioOutputDeviceGuidOculus = caps[146];
        xrGetAudioInputDeviceGuidOculus = caps[147];
        xrSetEnvironmentDepthEstimationVARJO = caps[148];
        xrSetMarkerTrackingVARJO = caps[149];
        xrSetMarkerTrackingTimeoutVARJO = caps[150];
        xrSetMarkerTrackingPredictionVARJO = caps[151];
        xrGetMarkerSizeVARJO = caps[152];
        xrCreateMarkerSpaceVARJO = caps[153];
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

    private static boolean check_EXT_conformance_automation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_conformance_automation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            51, 52, 53, 54, 55
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
            56, 57, 58, 59, 60, 61, 62
        },
            "xrSetDebugUtilsObjectNameEXT", "xrCreateDebugUtilsMessengerEXT", "xrDestroyDebugUtilsMessengerEXT", "xrSubmitDebugUtilsMessageEXT", 
            "xrSessionBeginDebugUtilsLabelRegionEXT", "xrSessionEndDebugUtilsLabelRegionEXT", "xrSessionInsertDebugUtilsLabelEXT"
        ) || reportMissing("XR", "XR_EXT_debug_utils");
    }

    private static boolean check_EXT_hand_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_hand_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            63, 64, 65
        },
            "xrCreateHandTrackerEXT", "xrDestroyHandTrackerEXT", "xrLocateHandJointsEXT"
        ) || reportMissing("XR", "XR_EXT_hand_tracking");
    }

    private static boolean check_EXT_performance_settings(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_performance_settings")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            66
        },
            "xrPerfSettingsSetPerformanceLevelEXT"
        ) || reportMissing("XR", "XR_EXT_performance_settings");
    }

    private static boolean check_EXT_thermal_query(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_thermal_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            67
        },
            "xrThermalGetTemperatureTrendEXT"
        ) || reportMissing("XR", "XR_EXT_thermal_query");
    }

    private static boolean check_FB_color_space(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_color_space")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            68, 69
        },
            "xrEnumerateColorSpacesFB", "xrSetColorSpaceFB"
        ) || reportMissing("XR", "XR_FB_color_space");
    }

    private static boolean check_FB_display_refresh_rate(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_display_refresh_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            70, 71, 72
        },
            "xrEnumerateDisplayRefreshRatesFB", "xrGetDisplayRefreshRateFB", "xrRequestDisplayRefreshRateFB"
        ) || reportMissing("XR", "XR_FB_display_refresh_rate");
    }

    private static boolean check_FB_foveation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_foveation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            73, 74
        },
            "xrCreateFoveationProfileFB", "xrDestroyFoveationProfileFB"
        ) || reportMissing("XR", "XR_FB_foveation");
    }

    private static boolean check_FB_hand_tracking_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_hand_tracking_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            75
        },
            "xrGetHandMeshFB"
        ) || reportMissing("XR", "XR_FB_hand_tracking_mesh");
    }

    private static boolean check_FB_passthrough(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_passthrough")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87
        },
            "xrCreatePassthroughFB", "xrDestroyPassthroughFB", "xrPassthroughStartFB", "xrPassthroughPauseFB", "xrCreatePassthroughLayerFB", 
            "xrDestroyPassthroughLayerFB", "xrPassthroughLayerPauseFB", "xrPassthroughLayerResumeFB", "xrPassthroughLayerSetStyleFB", 
            "xrCreateGeometryInstanceFB", "xrDestroyGeometryInstanceFB", "xrGeometryInstanceSetTransformFB"
        ) || reportMissing("XR", "XR_FB_passthrough");
    }

    private static boolean check_FB_swapchain_update_state(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_swapchain_update_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            88, 89
        },
            "xrUpdateSwapchainFB", "xrGetSwapchainStateFB"
        ) || reportMissing("XR", "XR_FB_swapchain_update_state");
    }

    private static boolean check_FB_triangle_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_triangle_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            90, 91, 92, 93, 94, 95, 96, 97
        },
            "xrCreateTriangleMeshFB", "xrDestroyTriangleMeshFB", "xrTriangleMeshGetVertexBufferFB", "xrTriangleMeshGetIndexBufferFB", 
            "xrTriangleMeshBeginUpdateFB", "xrTriangleMeshEndUpdateFB", "xrTriangleMeshBeginVertexBufferUpdateFB", "xrTriangleMeshEndVertexBufferUpdateFB"
        ) || reportMissing("XR", "XR_FB_triangle_mesh");
    }

    private static boolean check_HTCX_vive_tracker_interaction(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTCX_vive_tracker_interaction")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            98
        },
            "xrEnumerateViveTrackerPathsHTCX"
        ) || reportMissing("XR", "XR_HTCX_vive_tracker_interaction");
    }

    private static boolean check_KHR_convert_timespec_time(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_convert_timespec_time")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            99, 100
        },
            "xrConvertTimespecTimeToTimeKHR", "xrConvertTimeToTimespecTimeKHR"
        ) || reportMissing("XR", "XR_KHR_convert_timespec_time");
    }

    private static boolean check_KHR_opengl_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_opengl_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            101
        },
            "xrGetOpenGLGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_opengl_enable");
    }

    private static boolean check_KHR_opengl_es_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_opengl_es_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            102
        },
            "xrGetOpenGLESGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_opengl_es_enable");
    }

    private static boolean check_KHR_visibility_mask(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_visibility_mask")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            103
        },
            "xrGetVisibilityMaskKHR"
        ) || reportMissing("XR", "XR_KHR_visibility_mask");
    }

    private static boolean check_KHR_vulkan_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_vulkan_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            104, 105, 106, 107
        },
            "xrGetVulkanInstanceExtensionsKHR", "xrGetVulkanDeviceExtensionsKHR", "xrGetVulkanGraphicsDeviceKHR", "xrGetVulkanGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_vulkan_enable");
    }

    private static boolean check_KHR_vulkan_enable2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_vulkan_enable2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            108, 109, 110, 111
        },
            "xrCreateVulkanInstanceKHR", "xrCreateVulkanDeviceKHR", "xrGetVulkanGraphicsDevice2KHR", "xrGetVulkanGraphicsRequirements2KHR"
        ) || reportMissing("XR", "XR_KHR_vulkan_enable2");
    }

    private static boolean check_KHR_win32_convert_performance_counter_time(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_win32_convert_performance_counter_time")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            112, 113
        },
            "xrConvertWin32PerformanceCounterToTimeKHR", "xrConvertTimeToWin32PerformanceCounterKHR"
        ) || reportMissing("XR", "XR_KHR_win32_convert_performance_counter_time");
    }

    private static boolean check_MSFT_composition_layer_reprojection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_composition_layer_reprojection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            114
        },
            "xrEnumerateReprojectionModesMSFT"
        ) || reportMissing("XR", "XR_MSFT_composition_layer_reprojection");
    }

    private static boolean check_MSFT_controller_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_controller_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            115, 116, 117, 118
        },
            "xrGetControllerModelKeyMSFT", "xrLoadControllerModelMSFT", "xrGetControllerModelPropertiesMSFT", "xrGetControllerModelStateMSFT"
        ) || reportMissing("XR", "XR_MSFT_controller_model");
    }

    private static boolean check_MSFT_hand_tracking_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_hand_tracking_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            119, 120
        },
            "xrCreateHandMeshSpaceMSFT", "xrUpdateHandMeshMSFT"
        ) || reportMissing("XR", "XR_MSFT_hand_tracking_mesh");
    }

    private static boolean check_MSFT_perception_anchor_interop(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_perception_anchor_interop")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            121, 122
        },
            "xrCreateSpatialAnchorFromPerceptionAnchorMSFT", "xrTryGetPerceptionAnchorFromSpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_perception_anchor_interop");
    }

    private static boolean check_MSFT_scene_understanding(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_understanding")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            123, 124, 125, 126, 127, 128, 129, 130, 131, 132
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
            133, 134
        },
            "xrDeserializeSceneMSFT", "xrGetSerializedSceneFragmentDataMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_understanding_serialization");
    }

    private static boolean check_MSFT_spatial_anchor(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_anchor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            135, 136, 137
        },
            "xrCreateSpatialAnchorMSFT", "xrCreateSpatialAnchorSpaceMSFT", "xrDestroySpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_anchor");
    }

    private static boolean check_MSFT_spatial_anchor_persistence(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_anchor_persistence")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            138, 139, 140, 141, 142, 143, 144
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
            145
        },
            "xrCreateSpatialGraphNodeSpaceMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_graph_bridge");
    }

    private static boolean check_OCULUS_audio_device_guid(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_OCULUS_audio_device_guid")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            146, 147
        },
            "xrGetAudioOutputDeviceGuidOculus", "xrGetAudioInputDeviceGuidOculus"
        ) || reportMissing("XR", "XR_OCULUS_audio_device_guid");
    }

    private static boolean check_VARJO_environment_depth_estimation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_environment_depth_estimation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            148
        },
            "xrSetEnvironmentDepthEstimationVARJO"
        ) || reportMissing("XR", "XR_VARJO_environment_depth_estimation");
    }

    private static boolean check_VARJO_marker_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_marker_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            149, 150, 151, 152, 153
        },
            "xrSetMarkerTrackingVARJO", "xrSetMarkerTrackingTimeoutVARJO", "xrSetMarkerTrackingPredictionVARJO", "xrGetMarkerSizeVARJO", 
            "xrCreateMarkerSpaceVARJO"
        ) || reportMissing("XR", "XR_VARJO_marker_tracking");
    }

}
