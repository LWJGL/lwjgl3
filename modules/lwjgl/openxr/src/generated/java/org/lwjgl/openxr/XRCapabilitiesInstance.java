/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;
import java.util.Set;
import java.util.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

/** Defines the capabilities of a OpenXR {@code XRInstance}. */
public class XRCapabilitiesInstance {

    // EXT_debug_utils
    public final long
        xrSetDebugUtilsObjectNameEXT,
        xrCreateDebugUtilsMessengerEXT,
        xrSubmitDebugUtilsMessageEXT;

    // KHR_opengl_enable
    public final long
        xrGetOpenGLGraphicsRequirementsKHR;

    // KHR_opengl_es_enable
    public final long
        xrGetOpenGLESGraphicsRequirementsKHR;

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
        xrEnumerateViewConfigurations,
        xrGetViewConfigurationProperties,
        xrEnumerateViewConfigurationViews,
        xrStringToPath,
        xrPathToString,
        xrCreateActionSet,
        xrSuggestInteractionProfileBindings;

    /** The OpenXR API version number. */
    public final int apiVersion;

    /** When true, {@link EPICViewConfigurationFov} is supported. */
    public final boolean XR_EPIC_view_configuration_fov;
    /** When true, {@link EXTConformanceAutomation} is supported. */
    public final boolean XR_EXT_conformance_automation;
    /** When true, {@link EXTDebugUtils} is supported. */
    public final boolean XR_EXT_debug_utils;
    /** When true, {@link EXTEyeGazeInteraction} is supported. */
    public final boolean XR_EXT_eye_gaze_interaction;
    /** When true, {@link EXTHandTracking} is supported. */
    public final boolean XR_EXT_hand_tracking;
    /** When true, {@link EXTHpMixedRealityController} is supported. */
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
    /** When true, {@link FBAndroidSurfaceSwapchainCreate} is supported. */
    public final boolean XR_FB_android_surface_swapchain_create;
    /** When true, {@link FBDisplayRefreshRate} is supported. */
    public final boolean XR_FB_display_refresh_rate;
    /** When true, {@link HTCViveCosmosControllerInteraction} is supported. */
    public final boolean XR_HTC_vive_cosmos_controller_interaction;
    /** When true, {@link HUAWEIControllerInteraction} is supported. */
    public final boolean XR_HUAWEI_controller_interaction;
    /** When true, {@link KHRAndroidCreateInstance} is supported. */
    public final boolean XR_KHR_android_create_instance;
    /** When true, {@link KHRAndroidThreadSettings} is supported. */
    public final boolean XR_KHR_android_thread_settings;
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
    /** When true, {@link KHRLoaderInit} is supported. */
    public final boolean XR_KHR_loader_init;
    /** When true, {@link KHRLoaderInitAndroid} is supported. */
    public final boolean XR_KHR_loader_init_android;
    /** When true, {@link KHROpenglEnable} is supported. */
    public final boolean XR_KHR_opengl_enable;
    /** When true, {@link KHROpenglEsEnable} is supported. */
    public final boolean XR_KHR_opengl_es_enable;
    /** When true, {@link KHRVisibilityMask} is supported. */
    public final boolean XR_KHR_visibility_mask;
    /** When true, {@link KHRVulkanSwapchainFormatList} is supported. */
    public final boolean XR_KHR_vulkan_swapchain_format_list;
    /** When true, {@link KHRWin32ConvertPerformanceCounterTime} is supported. */
    public final boolean XR_KHR_win32_convert_performance_counter_time;
    /** When true, {@link MNDHeadless} is supported. */
    public final boolean XR_MND_headless;
    /** When true, {@link MNDSwapchainUsageInputAttachmentBit} is supported. */
    public final boolean XR_MND_swapchain_usage_input_attachment_bit;
    /** When true, {@link MNDXEglEnable} is supported. */
    public final boolean XR_MNDX_egl_enable;
    /** When true, {@link MSFTControllerModel} is supported. */
    public final boolean XR_MSFT_controller_model;
    /** When true, {@link MSFTFirstPersonObserver} is supported. */
    public final boolean XR_MSFT_first_person_observer;
    /** When true, {@link MSFTHandInteraction} is supported. */
    public final boolean XR_MSFT_hand_interaction;
    /** When true, {@link MSFTHandTrackingMesh} is supported. */
    public final boolean XR_MSFT_hand_tracking_mesh;
    /** When true, {@link MSFTSecondaryViewConfiguration} is supported. */
    public final boolean XR_MSFT_secondary_view_configuration;
    /** When true, {@link MSFTSpatialAnchor} is supported. */
    public final boolean XR_MSFT_spatial_anchor;
    /** When true, {@link MSFTSpatialGraphBridge} is supported. */
    public final boolean XR_MSFT_spatial_graph_bridge;
    /** When true, {@link MSFTUnboundedReferenceSpace} is supported. */
    public final boolean XR_MSFT_unbounded_reference_space;
    /** When true, {@link OCULUSAndroidSessionStateEnable} is supported. */
    public final boolean XR_OCULUS_android_session_state_enable;
    /** When true, {@link VALVEAnalogThreshold} is supported. */
    public final boolean XR_VALVE_analog_threshold;
    /** When true, {@link VARJOQuadViews} is supported. */
    public final boolean XR_VARJO_quad_views;
    /** When true, {@link XR10} is supported. */
    public final boolean OpenXR10;

    XRCapabilitiesInstance(FunctionProvider provider, int apiVersion, Set<String> ext, Set<String> deviceExt) {
        this.apiVersion = apiVersion;

        long[] caps = new long[21];

        XR_EPIC_view_configuration_fov = ext.contains("XR_EPIC_view_configuration_fov");
        XR_EXT_conformance_automation = ext.contains("XR_EXT_conformance_automation");
        XR_EXT_debug_utils = check_EXT_debug_utils(provider, caps, ext);
        XR_EXT_eye_gaze_interaction = ext.contains("XR_EXT_eye_gaze_interaction");
        XR_EXT_hand_tracking = ext.contains("XR_EXT_hand_tracking");
        XR_EXT_hp_mixed_reality_controller = ext.contains("XR_EXT_hp_mixed_reality_controller");
        XR_EXT_performance_settings = ext.contains("XR_EXT_performance_settings");
        XR_EXT_samsung_odyssey_controller = ext.contains("XR_EXT_samsung_odyssey_controller");
        XR_EXT_thermal_query = ext.contains("XR_EXT_thermal_query");
        XR_EXT_view_configuration_depth_range = ext.contains("XR_EXT_view_configuration_depth_range");
        XR_EXT_win32_appcontainer_compatible = ext.contains("XR_EXT_win32_appcontainer_compatible");
        XR_EXTX_overlay = ext.contains("XR_EXTX_overlay");
        XR_FB_android_surface_swapchain_create = ext.contains("XR_FB_android_surface_swapchain_create");
        XR_FB_display_refresh_rate = ext.contains("XR_FB_display_refresh_rate");
        XR_HTC_vive_cosmos_controller_interaction = ext.contains("XR_HTC_vive_cosmos_controller_interaction");
        XR_HUAWEI_controller_interaction = ext.contains("XR_HUAWEI_controller_interaction");
        XR_KHR_android_create_instance = ext.contains("XR_KHR_android_create_instance");
        XR_KHR_android_thread_settings = ext.contains("XR_KHR_android_thread_settings");
        XR_KHR_binding_modification = ext.contains("XR_KHR_binding_modification");
        XR_KHR_composition_layer_color_scale_bias = ext.contains("XR_KHR_composition_layer_color_scale_bias");
        XR_KHR_composition_layer_cube = ext.contains("XR_KHR_composition_layer_cube");
        XR_KHR_composition_layer_cylinder = ext.contains("XR_KHR_composition_layer_cylinder");
        XR_KHR_composition_layer_depth = ext.contains("XR_KHR_composition_layer_depth");
        XR_KHR_composition_layer_equirect = ext.contains("XR_KHR_composition_layer_equirect");
        XR_KHR_composition_layer_equirect2 = ext.contains("XR_KHR_composition_layer_equirect2");
        XR_KHR_loader_init = ext.contains("XR_KHR_loader_init");
        XR_KHR_loader_init_android = ext.contains("XR_KHR_loader_init_android");
        XR_KHR_opengl_enable = check_KHR_opengl_enable(provider, caps, ext);
        XR_KHR_opengl_es_enable = check_KHR_opengl_es_enable(provider, caps, ext);
        XR_KHR_visibility_mask = ext.contains("XR_KHR_visibility_mask");
        XR_KHR_vulkan_swapchain_format_list = ext.contains("XR_KHR_vulkan_swapchain_format_list");
        XR_KHR_win32_convert_performance_counter_time = ext.contains("XR_KHR_win32_convert_performance_counter_time");
        XR_MND_headless = ext.contains("XR_MND_headless");
        XR_MND_swapchain_usage_input_attachment_bit = ext.contains("XR_MND_swapchain_usage_input_attachment_bit");
        XR_MNDX_egl_enable = ext.contains("XR_MNDX_egl_enable");
        XR_MSFT_controller_model = ext.contains("XR_MSFT_controller_model");
        XR_MSFT_first_person_observer = ext.contains("XR_MSFT_first_person_observer");
        XR_MSFT_hand_interaction = ext.contains("XR_MSFT_hand_interaction");
        XR_MSFT_hand_tracking_mesh = ext.contains("XR_MSFT_hand_tracking_mesh");
        XR_MSFT_secondary_view_configuration = ext.contains("XR_MSFT_secondary_view_configuration");
        XR_MSFT_spatial_anchor = ext.contains("XR_MSFT_spatial_anchor");
        XR_MSFT_spatial_graph_bridge = ext.contains("XR_MSFT_spatial_graph_bridge");
        XR_MSFT_unbounded_reference_space = ext.contains("XR_MSFT_unbounded_reference_space");
        XR_OCULUS_android_session_state_enable = ext.contains("XR_OCULUS_android_session_state_enable");
        XR_VALVE_analog_threshold = ext.contains("XR_VALVE_analog_threshold");
        XR_VARJO_quad_views = ext.contains("XR_VARJO_quad_views");
        OpenXR10 = check_XR10(provider, caps, ext);

        xrSetDebugUtilsObjectNameEXT = caps[0];
        xrCreateDebugUtilsMessengerEXT = caps[1];
        xrSubmitDebugUtilsMessageEXT = caps[2];
        xrGetOpenGLGraphicsRequirementsKHR = caps[3];
        xrGetOpenGLESGraphicsRequirementsKHR = caps[4];
        xrDestroyInstance = caps[5];
        xrGetInstanceProperties = caps[6];
        xrPollEvent = caps[7];
        xrResultToString = caps[8];
        xrStructureTypeToString = caps[9];
        xrGetSystem = caps[10];
        xrGetSystemProperties = caps[11];
        xrEnumerateEnvironmentBlendModes = caps[12];
        xrCreateSession = caps[13];
        xrEnumerateViewConfigurations = caps[14];
        xrGetViewConfigurationProperties = caps[15];
        xrEnumerateViewConfigurationViews = caps[16];
        xrStringToPath = caps[17];
        xrPathToString = caps[18];
        xrCreateActionSet = caps[19];
        xrSuggestInteractionProfileBindings = caps[20];
    }

    private static boolean check_EXT_debug_utils(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_debug_utils")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2
        },
            "xrSetDebugUtilsObjectNameEXT", "xrCreateDebugUtilsMessengerEXT", "xrSubmitDebugUtilsMessageEXT"
        ) || reportMissing("XR", "XR_EXT_debug_utils");
    }

    private static boolean check_KHR_opengl_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_opengl_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            3
        },
            "xrGetOpenGLGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_opengl_enable");
    }

    private static boolean check_KHR_opengl_es_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_opengl_es_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            4
        },
            "xrGetOpenGLESGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_opengl_es_enable");
    }

    private static boolean check_XR10(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("OpenXR10")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        },
            "xrDestroyInstance", "xrGetInstanceProperties", "xrPollEvent", "xrResultToString", "xrStructureTypeToString", "xrGetSystem", 
            "xrGetSystemProperties", "xrEnumerateEnvironmentBlendModes", "xrCreateSession", "xrEnumerateViewConfigurations", "xrGetViewConfigurationProperties", 
            "xrEnumerateViewConfigurationViews", "xrStringToPath", "xrPathToString", "xrCreateActionSet", "xrSuggestInteractionProfileBindings"
        ) || reportMissing("XR", "OpenXR10");
    }

}
