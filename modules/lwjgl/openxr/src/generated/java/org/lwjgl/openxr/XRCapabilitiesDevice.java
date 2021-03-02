/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.util.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

/** Defines the capabilities of a Vulkan {@code VkDevice}. */
public class XRCapabilitiesDevice {

    // XR10
    public final long
        xrDestroySession,
        xrEnumerateReferenceSpaces,
        xrCreateReferenceSpace,
        xrGetReferenceSpaceBoundsRect,
        xrCreateActionSpace,
        xrLocateSpace,
        xrDestroySpace,
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
        xrDestroyActionSet,
        xrCreateAction,
        xrDestroyAction,
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
        xrDestroyDebugUtilsMessengerEXT,
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

    // FB_display_refresh_rate
    public final long
        xrEnumerateDisplayRefreshRatesFB,
        xrGetDisplayRefreshRateFB,
        xrRequestDisplayRefreshRateFB;

    // KHR_android_thread_settings
    public final long
        xrSetAndroidApplicationThreadKHR;

    // KHR_visibility_mask
    public final long
        xrGetVisibilityMaskKHR;

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

    // MSFT_spatial_anchor
    public final long
        xrCreateSpatialAnchorMSFT,
        xrCreateSpatialAnchorSpaceMSFT,
        xrDestroySpatialAnchorMSFT;

    // MSFT_spatial_graph_bridge
    public final long
        xrCreateSpatialGraphNodeSpaceMSFT;

    /** The Vulkan API version number. */
    public final long apiVersion;

    /** When true, {@link XR10} is supported. */
    public final boolean OpenXR10;

    XRCapabilitiesDevice(FunctionProvider provider, XRCapabilitiesInstance capsInstance, Set<String> ext) {
        this.apiVersion = capsInstance.apiVersion;

        long[] caps = new long[64];

        OpenXR10 = check_XR10(provider, caps, ext);
        check_EXT_conformance_automation(provider, caps, capsInstance);
        check_EXT_debug_utils(provider, caps, capsInstance);
        check_EXT_hand_tracking(provider, caps, capsInstance);
        check_EXT_performance_settings(provider, caps, capsInstance);
        check_EXT_thermal_query(provider, caps, capsInstance);
        check_FB_display_refresh_rate(provider, caps, capsInstance);
        check_KHR_android_thread_settings(provider, caps, capsInstance);
        check_KHR_visibility_mask(provider, caps, capsInstance);
        check_MSFT_controller_model(provider, caps, capsInstance);
        check_MSFT_hand_tracking_mesh(provider, caps, capsInstance);
        check_MSFT_spatial_anchor(provider, caps, capsInstance);
        check_MSFT_spatial_graph_bridge(provider, caps, capsInstance);

        xrDestroySession = caps[0];
        xrEnumerateReferenceSpaces = caps[1];
        xrCreateReferenceSpace = caps[2];
        xrGetReferenceSpaceBoundsRect = caps[3];
        xrCreateActionSpace = caps[4];
        xrLocateSpace = caps[5];
        xrDestroySpace = caps[6];
        xrEnumerateSwapchainFormats = caps[7];
        xrCreateSwapchain = caps[8];
        xrDestroySwapchain = caps[9];
        xrEnumerateSwapchainImages = caps[10];
        xrAcquireSwapchainImage = caps[11];
        xrWaitSwapchainImage = caps[12];
        xrReleaseSwapchainImage = caps[13];
        xrBeginSession = caps[14];
        xrEndSession = caps[15];
        xrRequestExitSession = caps[16];
        xrWaitFrame = caps[17];
        xrBeginFrame = caps[18];
        xrEndFrame = caps[19];
        xrLocateViews = caps[20];
        xrDestroyActionSet = caps[21];
        xrCreateAction = caps[22];
        xrDestroyAction = caps[23];
        xrAttachSessionActionSets = caps[24];
        xrGetCurrentInteractionProfile = caps[25];
        xrGetActionStateBoolean = caps[26];
        xrGetActionStateFloat = caps[27];
        xrGetActionStateVector2f = caps[28];
        xrGetActionStatePose = caps[29];
        xrSyncActions = caps[30];
        xrEnumerateBoundSourcesForAction = caps[31];
        xrGetInputSourceLocalizedName = caps[32];
        xrApplyHapticFeedback = caps[33];
        xrStopHapticFeedback = caps[34];
        xrSetInputDeviceActiveEXT = caps[35];
        xrSetInputDeviceStateBoolEXT = caps[36];
        xrSetInputDeviceStateFloatEXT = caps[37];
        xrSetInputDeviceStateVector2fEXT = caps[38];
        xrSetInputDeviceLocationEXT = caps[39];
        xrDestroyDebugUtilsMessengerEXT = caps[40];
        xrSessionBeginDebugUtilsLabelRegionEXT = caps[41];
        xrSessionEndDebugUtilsLabelRegionEXT = caps[42];
        xrSessionInsertDebugUtilsLabelEXT = caps[43];
        xrCreateHandTrackerEXT = caps[44];
        xrDestroyHandTrackerEXT = caps[45];
        xrLocateHandJointsEXT = caps[46];
        xrPerfSettingsSetPerformanceLevelEXT = caps[47];
        xrThermalGetTemperatureTrendEXT = caps[48];
        xrEnumerateDisplayRefreshRatesFB = caps[49];
        xrGetDisplayRefreshRateFB = caps[50];
        xrRequestDisplayRefreshRateFB = caps[51];
        xrSetAndroidApplicationThreadKHR = caps[52];
        xrGetVisibilityMaskKHR = caps[53];
        xrGetControllerModelKeyMSFT = caps[54];
        xrLoadControllerModelMSFT = caps[55];
        xrGetControllerModelPropertiesMSFT = caps[56];
        xrGetControllerModelStateMSFT = caps[57];
        xrCreateHandMeshSpaceMSFT = caps[58];
        xrUpdateHandMeshMSFT = caps[59];
        xrCreateSpatialAnchorMSFT = caps[60];
        xrCreateSpatialAnchorSpaceMSFT = caps[61];
        xrDestroySpatialAnchorMSFT = caps[62];
        xrCreateSpatialGraphNodeSpaceMSFT = caps[63];
    }

    private static boolean check_XR10(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("OpenXR10")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34
        },
            "xrDestroySession", "xrEnumerateReferenceSpaces", "xrCreateReferenceSpace", "xrGetReferenceSpaceBoundsRect", "xrCreateActionSpace", "xrLocateSpace", 
            "xrDestroySpace", "xrEnumerateSwapchainFormats", "xrCreateSwapchain", "xrDestroySwapchain", "xrEnumerateSwapchainImages", "xrAcquireSwapchainImage", 
            "xrWaitSwapchainImage", "xrReleaseSwapchainImage", "xrBeginSession", "xrEndSession", "xrRequestExitSession", "xrWaitFrame", "xrBeginFrame", 
            "xrEndFrame", "xrLocateViews", "xrDestroyActionSet", "xrCreateAction", "xrDestroyAction", "xrAttachSessionActionSets", 
            "xrGetCurrentInteractionProfile", "xrGetActionStateBoolean", "xrGetActionStateFloat", "xrGetActionStateVector2f", "xrGetActionStatePose", 
            "xrSyncActions", "xrEnumerateBoundSourcesForAction", "xrGetInputSourceLocalizedName", "xrApplyHapticFeedback", "xrStopHapticFeedback"
        ) || reportMissing("XR", "OpenXR10");
    }

    private static boolean check_EXT_conformance_automation(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_EXT_conformance_automation) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            35, 36, 37, 38, 39
        },
            "xrSetInputDeviceActiveEXT", "xrSetInputDeviceStateBoolEXT", "xrSetInputDeviceStateFloatEXT", "xrSetInputDeviceStateVector2fEXT", 
            "xrSetInputDeviceLocationEXT"
        ) || reportMissing("XR", "XR_EXT_conformance_automation");
    }

    private static boolean check_EXT_debug_utils(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_EXT_debug_utils) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            40, 41, 42, 43
        },
            "xrDestroyDebugUtilsMessengerEXT", "xrSessionBeginDebugUtilsLabelRegionEXT", "xrSessionEndDebugUtilsLabelRegionEXT", 
            "xrSessionInsertDebugUtilsLabelEXT"
        ) || reportMissing("XR", "XR_EXT_debug_utils");
    }

    private static boolean check_EXT_hand_tracking(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_EXT_hand_tracking) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            44, 45, 46
        },
            "xrCreateHandTrackerEXT", "xrDestroyHandTrackerEXT", "xrLocateHandJointsEXT"
        ) || reportMissing("XR", "XR_EXT_hand_tracking");
    }

    private static boolean check_EXT_performance_settings(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_EXT_performance_settings) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            47
        },
            "xrPerfSettingsSetPerformanceLevelEXT"
        ) || reportMissing("XR", "XR_EXT_performance_settings");
    }

    private static boolean check_EXT_thermal_query(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_EXT_thermal_query) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            48
        },
            "xrThermalGetTemperatureTrendEXT"
        ) || reportMissing("XR", "XR_EXT_thermal_query");
    }

    private static boolean check_FB_display_refresh_rate(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_FB_display_refresh_rate) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            49, 50, 51
        },
            "xrEnumerateDisplayRefreshRatesFB", "xrGetDisplayRefreshRateFB", "xrRequestDisplayRefreshRateFB"
        ) || reportMissing("XR", "XR_FB_display_refresh_rate");
    }

    private static boolean check_KHR_android_thread_settings(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_KHR_android_thread_settings) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            52
        },
            "xrSetAndroidApplicationThreadKHR"
        ) || reportMissing("XR", "XR_KHR_android_thread_settings");
    }

    private static boolean check_KHR_visibility_mask(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_KHR_visibility_mask) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            53
        },
            "xrGetVisibilityMaskKHR"
        ) || reportMissing("XR", "XR_KHR_visibility_mask");
    }

    private static boolean check_MSFT_controller_model(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_MSFT_controller_model) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            54, 55, 56, 57
        },
            "xrGetControllerModelKeyMSFT", "xrLoadControllerModelMSFT", "xrGetControllerModelPropertiesMSFT", "xrGetControllerModelStateMSFT"
        ) || reportMissing("XR", "XR_MSFT_controller_model");
    }

    private static boolean check_MSFT_hand_tracking_mesh(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_MSFT_hand_tracking_mesh) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            58, 59
        },
            "xrCreateHandMeshSpaceMSFT", "xrUpdateHandMeshMSFT"
        ) || reportMissing("XR", "XR_MSFT_hand_tracking_mesh");
    }

    private static boolean check_MSFT_spatial_anchor(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_MSFT_spatial_anchor) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            60, 61, 62
        },
            "xrCreateSpatialAnchorMSFT", "xrCreateSpatialAnchorSpaceMSFT", "xrDestroySpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_anchor");
    }

    private static boolean check_MSFT_spatial_graph_bridge(FunctionProvider provider, long[] caps, XRCapabilitiesInstance capsInstance) {
        if (!capsInstance.XR_MSFT_spatial_graph_bridge) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            63
        },
            "xrCreateSpatialGraphNodeSpaceMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_graph_bridge");
    }

}
