/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.Checks.*;

/**
 * Reports the enabled capabilities and function pointers of a Vulkan {@code VkInstance}.
 * 
 * <p>The addresses are cached for future use. This class also allows developers to query the capabilities made available to the Vulkan instance handle.</p>
 */
@SuppressWarnings("SimplifiableIfStatement")
public class VKCapabilitiesInstance {

    /** Function pointers for VK10 */
    public final long
        vkDestroyInstance,
        vkEnumeratePhysicalDevices,
        vkGetPhysicalDeviceFeatures,
        vkGetPhysicalDeviceFormatProperties,
        vkGetPhysicalDeviceImageFormatProperties,
        vkGetPhysicalDeviceProperties,
        vkGetPhysicalDeviceQueueFamilyProperties,
        vkGetPhysicalDeviceMemoryProperties,
        vkCreateDevice,
        vkEnumerateDeviceExtensionProperties,
        vkEnumerateDeviceLayerProperties,
        vkGetPhysicalDeviceSparseImageFormatProperties;

    /** Function pointers for VK11 */
    public final long
        vkEnumeratePhysicalDeviceGroups,
        vkGetPhysicalDeviceFeatures2,
        vkGetPhysicalDeviceProperties2,
        vkGetPhysicalDeviceFormatProperties2,
        vkGetPhysicalDeviceImageFormatProperties2,
        vkGetPhysicalDeviceQueueFamilyProperties2,
        vkGetPhysicalDeviceMemoryProperties2,
        vkGetPhysicalDeviceSparseImageFormatProperties2,
        vkGetPhysicalDeviceExternalBufferProperties,
        vkGetPhysicalDeviceExternalFenceProperties,
        vkGetPhysicalDeviceExternalSemaphoreProperties;

    /** Function pointers for VK13 */
    public final long
        vkGetPhysicalDeviceToolProperties;

    /** Function pointers for ARM_tensors */
    public final long
        vkGetPhysicalDeviceExternalTensorPropertiesARM;

    /** Function pointers for EXT_acquire_drm_display */
    public final long
        vkAcquireDrmDisplayEXT,
        vkGetDrmDisplayEXT;

    /** Function pointers for EXT_acquire_xlib_display */
    public final long
        vkAcquireXlibDisplayEXT,
        vkGetRandROutputDisplayEXT;

    /** Function pointers for EXT_calibrated_timestamps */
    public final long
        vkGetPhysicalDeviceCalibrateableTimeDomainsEXT;

    /** Function pointers for EXT_debug_report */
    public final long
        vkCreateDebugReportCallbackEXT,
        vkDestroyDebugReportCallbackEXT,
        vkDebugReportMessageEXT;

    /** Function pointers for EXT_debug_utils */
    public final long
        vkSetDebugUtilsObjectNameEXT,
        vkSetDebugUtilsObjectTagEXT,
        vkQueueBeginDebugUtilsLabelEXT,
        vkQueueEndDebugUtilsLabelEXT,
        vkQueueInsertDebugUtilsLabelEXT,
        vkCmdBeginDebugUtilsLabelEXT,
        vkCmdEndDebugUtilsLabelEXT,
        vkCmdInsertDebugUtilsLabelEXT,
        vkCreateDebugUtilsMessengerEXT,
        vkDestroyDebugUtilsMessengerEXT,
        vkSubmitDebugUtilsMessageEXT;

    /** Function pointers for EXT_direct_mode_display */
    public final long
        vkReleaseDisplayEXT;

    /** Function pointers for EXT_directfb_surface */
    public final long
        vkCreateDirectFBSurfaceEXT,
        vkGetPhysicalDeviceDirectFBPresentationSupportEXT;

    /** Function pointers for EXT_display_surface_counter */
    public final long
        vkGetPhysicalDeviceSurfaceCapabilities2EXT;

    /** Function pointers for EXT_full_screen_exclusive */
    public final long
        vkGetPhysicalDeviceSurfacePresentModes2EXT;

    /** Function pointers for EXT_headless_surface */
    public final long
        vkCreateHeadlessSurfaceEXT;

    /** Function pointers for EXT_metal_surface */
    public final long
        vkCreateMetalSurfaceEXT;

    /** Function pointers for EXT_sample_locations */
    public final long
        vkGetPhysicalDeviceMultisamplePropertiesEXT;

    /** Function pointers for EXT_tooling_info */
    public final long
        vkGetPhysicalDeviceToolPropertiesEXT;

    /** Function pointers for KHR_android_surface */
    public final long
        vkCreateAndroidSurfaceKHR;

    /** Function pointers for KHR_calibrated_timestamps */
    public final long
        vkGetPhysicalDeviceCalibrateableTimeDomainsKHR;

    /** Function pointers for KHR_cooperative_matrix */
    public final long
        vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR;

    /** Function pointers for KHR_device_group */
    public final long
        vkGetPhysicalDevicePresentRectanglesKHR;

    /** Function pointers for KHR_device_group_creation */
    public final long
        vkEnumeratePhysicalDeviceGroupsKHR;

    /** Function pointers for KHR_display */
    public final long
        vkGetPhysicalDeviceDisplayPropertiesKHR,
        vkGetPhysicalDeviceDisplayPlanePropertiesKHR,
        vkGetDisplayPlaneSupportedDisplaysKHR,
        vkGetDisplayModePropertiesKHR,
        vkCreateDisplayModeKHR,
        vkGetDisplayPlaneCapabilitiesKHR,
        vkCreateDisplayPlaneSurfaceKHR;

    /** Function pointers for KHR_external_fence_capabilities */
    public final long
        vkGetPhysicalDeviceExternalFencePropertiesKHR;

    /** Function pointers for KHR_external_memory_capabilities */
    public final long
        vkGetPhysicalDeviceExternalBufferPropertiesKHR;

    /** Function pointers for KHR_external_semaphore_capabilities */
    public final long
        vkGetPhysicalDeviceExternalSemaphorePropertiesKHR;

    /** Function pointers for KHR_fragment_shading_rate */
    public final long
        vkGetPhysicalDeviceFragmentShadingRatesKHR;

    /** Function pointers for KHR_get_display_properties2 */
    public final long
        vkGetPhysicalDeviceDisplayProperties2KHR,
        vkGetPhysicalDeviceDisplayPlaneProperties2KHR,
        vkGetDisplayModeProperties2KHR,
        vkGetDisplayPlaneCapabilities2KHR;

    /** Function pointers for KHR_get_physical_device_properties2 */
    public final long
        vkGetPhysicalDeviceFeatures2KHR,
        vkGetPhysicalDeviceProperties2KHR,
        vkGetPhysicalDeviceFormatProperties2KHR,
        vkGetPhysicalDeviceImageFormatProperties2KHR,
        vkGetPhysicalDeviceQueueFamilyProperties2KHR,
        vkGetPhysicalDeviceMemoryProperties2KHR,
        vkGetPhysicalDeviceSparseImageFormatProperties2KHR;

    /** Function pointers for KHR_get_surface_capabilities2 */
    public final long
        vkGetPhysicalDeviceSurfaceCapabilities2KHR,
        vkGetPhysicalDeviceSurfaceFormats2KHR;

    /** Function pointers for KHR_performance_query */
    public final long
        vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR,
        vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;

    /** Function pointers for KHR_surface */
    public final long
        vkDestroySurfaceKHR,
        vkGetPhysicalDeviceSurfaceSupportKHR,
        vkGetPhysicalDeviceSurfaceCapabilitiesKHR,
        vkGetPhysicalDeviceSurfaceFormatsKHR,
        vkGetPhysicalDeviceSurfacePresentModesKHR;

    /** Function pointers for KHR_video_encode_queue */
    public final long
        vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR;

    /** Function pointers for KHR_video_queue */
    public final long
        vkGetPhysicalDeviceVideoCapabilitiesKHR,
        vkGetPhysicalDeviceVideoFormatPropertiesKHR;

    /** Function pointers for KHR_wayland_surface */
    public final long
        vkCreateWaylandSurfaceKHR,
        vkGetPhysicalDeviceWaylandPresentationSupportKHR;

    /** Function pointers for KHR_win32_surface */
    public final long
        vkCreateWin32SurfaceKHR,
        vkGetPhysicalDeviceWin32PresentationSupportKHR;

    /** Function pointers for KHR_xcb_surface */
    public final long
        vkCreateXcbSurfaceKHR,
        vkGetPhysicalDeviceXcbPresentationSupportKHR;

    /** Function pointers for KHR_xlib_surface */
    public final long
        vkCreateXlibSurfaceKHR,
        vkGetPhysicalDeviceXlibPresentationSupportKHR;

    /** Function pointers for MVK_macos_surface */
    public final long
        vkCreateMacOSSurfaceMVK;

    /** Function pointers for NV_acquire_winrt_display */
    public final long
        vkAcquireWinrtDisplayNV,
        vkGetWinrtDisplayNV;

    /** Function pointers for NV_cooperative_matrix */
    public final long
        vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;

    /** Function pointers for NV_cooperative_matrix2 */
    public final long
        vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV;

    /** Function pointers for NV_cooperative_vector */
    public final long
        vkGetPhysicalDeviceCooperativeVectorPropertiesNV;

    /** Function pointers for NV_coverage_reduction_mode */
    public final long
        vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;

    /** Function pointers for NV_external_memory_capabilities */
    public final long
        vkGetPhysicalDeviceExternalImageFormatPropertiesNV;

    /** Function pointers for NV_optical_flow */
    public final long
        vkGetPhysicalDeviceOpticalFlowImageFormatsNV;

    /** The Vulkan API version number. */
    public final int apiVersion;

    /** When true, {@code VK10} is supported. */
    public final boolean Vulkan10;
    /** When true, {@code VK11} is supported. */
    public final boolean Vulkan11;
    /** When true, {@code VK12} is supported. */
    public final boolean Vulkan12;
    /** When true, {@code VK13} is supported. */
    public final boolean Vulkan13;
    /** When true, {@code VK14} is supported. */
    public final boolean Vulkan14;
    /** When true, {@code EXT_acquire_drm_display} is supported. */
    public final boolean VK_EXT_acquire_drm_display;
    /** When true, {@code EXT_acquire_xlib_display} is supported. */
    public final boolean VK_EXT_acquire_xlib_display;
    /** When true, {@code EXT_debug_report} is supported. */
    public final boolean VK_EXT_debug_report;
    /** When true, {@code EXT_debug_utils} is supported. */
    public final boolean VK_EXT_debug_utils;
    /** When true, {@code EXT_direct_mode_display} is supported. */
    public final boolean VK_EXT_direct_mode_display;
    /** When true, {@code EXT_directfb_surface} is supported. */
    public final boolean VK_EXT_directfb_surface;
    /** When true, {@code EXT_display_surface_counter} is supported. */
    public final boolean VK_EXT_display_surface_counter;
    /** When true, {@code EXT_headless_surface} is supported. */
    public final boolean VK_EXT_headless_surface;
    /** When true, {@code EXT_layer_settings} is supported. */
    public final boolean VK_EXT_layer_settings;
    /** When true, {@code EXT_metal_surface} is supported. */
    public final boolean VK_EXT_metal_surface;
    /** When true, {@code EXT_surface_maintenance1} is supported. */
    public final boolean VK_EXT_surface_maintenance1;
    /** When true, {@code EXT_swapchain_colorspace} is supported. */
    public final boolean VK_EXT_swapchain_colorspace;
    /** When true, {@code EXT_validation_features} is supported. */
    public final boolean VK_EXT_validation_features;
    /** When true, {@code EXT_validation_flags} is supported. */
    public final boolean VK_EXT_validation_flags;
    /** When true, {@code GOOGLE_surfaceless_query} is supported. */
    public final boolean VK_GOOGLE_surfaceless_query;
    /** When true, {@code KHR_android_surface} is supported. */
    public final boolean VK_KHR_android_surface;
    /** When true, {@code KHR_device_group_creation} is supported. */
    public final boolean VK_KHR_device_group_creation;
    /** When true, {@code KHR_display} is supported. */
    public final boolean VK_KHR_display;
    /** When true, {@code KHR_external_fence_capabilities} is supported. */
    public final boolean VK_KHR_external_fence_capabilities;
    /** When true, {@code KHR_external_memory_capabilities} is supported. */
    public final boolean VK_KHR_external_memory_capabilities;
    /** When true, {@code KHR_external_semaphore_capabilities} is supported. */
    public final boolean VK_KHR_external_semaphore_capabilities;
    /** When true, {@code KHR_get_display_properties2} is supported. */
    public final boolean VK_KHR_get_display_properties2;
    /** When true, {@code KHR_get_physical_device_properties2} is supported. */
    public final boolean VK_KHR_get_physical_device_properties2;
    /** When true, {@code KHR_get_surface_capabilities2} is supported. */
    public final boolean VK_KHR_get_surface_capabilities2;
    /** When true, {@code KHR_portability_enumeration} is supported. */
    public final boolean VK_KHR_portability_enumeration;
    /** When true, {@code KHR_surface} is supported. */
    public final boolean VK_KHR_surface;
    /** When true, {@code KHR_surface_protected_capabilities} is supported. */
    public final boolean VK_KHR_surface_protected_capabilities;
    /** When true, {@code KHR_wayland_surface} is supported. */
    public final boolean VK_KHR_wayland_surface;
    /** When true, {@code KHR_win32_surface} is supported. */
    public final boolean VK_KHR_win32_surface;
    /** When true, {@code KHR_xcb_surface} is supported. */
    public final boolean VK_KHR_xcb_surface;
    /** When true, {@code KHR_xlib_surface} is supported. */
    public final boolean VK_KHR_xlib_surface;
    /** When true, {@code LUNARG_direct_driver_loading} is supported. */
    public final boolean VK_LUNARG_direct_driver_loading;
    /** When true, {@code MVK_macos_surface} is supported. */
    public final boolean VK_MVK_macos_surface;
    /** When true, {@code NV_display_stereo} is supported. */
    public final boolean VK_NV_display_stereo;
    /** When true, {@code NV_external_memory_capabilities} is supported. */
    public final boolean VK_NV_external_memory_capabilities;

    VKCapabilitiesInstance(FunctionProvider provider, int apiVersion, Set<String> ext, Set<String> deviceExt) {
        this.apiVersion = apiVersion;

        long[] caps = new long[109];

        Vulkan10 = check_VK10(provider, caps, ext);
        Vulkan11 = check_VK11(provider, caps, ext);
        Vulkan12 = ext.contains("Vulkan12");
        Vulkan13 = check_VK13(provider, caps, ext);
        Vulkan14 = ext.contains("Vulkan14");
        check_ARM_tensors(provider, caps, deviceExt);
        VK_EXT_acquire_drm_display = check_EXT_acquire_drm_display(provider, caps, ext);
        VK_EXT_acquire_xlib_display = check_EXT_acquire_xlib_display(provider, caps, ext);
        check_EXT_calibrated_timestamps(provider, caps, deviceExt);
        VK_EXT_debug_report = check_EXT_debug_report(provider, caps, ext);
        VK_EXT_debug_utils = check_EXT_debug_utils(provider, caps, ext);
        VK_EXT_direct_mode_display = check_EXT_direct_mode_display(provider, caps, ext);
        VK_EXT_directfb_surface = check_EXT_directfb_surface(provider, caps, ext);
        VK_EXT_display_surface_counter = check_EXT_display_surface_counter(provider, caps, ext);
        check_EXT_full_screen_exclusive(provider, caps, deviceExt);
        VK_EXT_headless_surface = check_EXT_headless_surface(provider, caps, ext);
        VK_EXT_layer_settings = ext.contains("VK_EXT_layer_settings");
        VK_EXT_metal_surface = check_EXT_metal_surface(provider, caps, ext);
        check_EXT_sample_locations(provider, caps, deviceExt);
        VK_EXT_surface_maintenance1 = ext.contains("VK_EXT_surface_maintenance1");
        VK_EXT_swapchain_colorspace = ext.contains("VK_EXT_swapchain_colorspace");
        check_EXT_tooling_info(provider, caps, deviceExt);
        VK_EXT_validation_features = ext.contains("VK_EXT_validation_features");
        VK_EXT_validation_flags = ext.contains("VK_EXT_validation_flags");
        VK_GOOGLE_surfaceless_query = ext.contains("VK_GOOGLE_surfaceless_query");
        VK_KHR_android_surface = check_KHR_android_surface(provider, caps, ext);
        check_KHR_calibrated_timestamps(provider, caps, deviceExt);
        check_KHR_cooperative_matrix(provider, caps, deviceExt);
        check_KHR_device_group(provider, caps, deviceExt);
        VK_KHR_device_group_creation = check_KHR_device_group_creation(provider, caps, ext);
        VK_KHR_display = check_KHR_display(provider, caps, ext);
        VK_KHR_external_fence_capabilities = check_KHR_external_fence_capabilities(provider, caps, ext);
        VK_KHR_external_memory_capabilities = check_KHR_external_memory_capabilities(provider, caps, ext);
        VK_KHR_external_semaphore_capabilities = check_KHR_external_semaphore_capabilities(provider, caps, ext);
        check_KHR_fragment_shading_rate(provider, caps, deviceExt);
        VK_KHR_get_display_properties2 = check_KHR_get_display_properties2(provider, caps, ext);
        VK_KHR_get_physical_device_properties2 = check_KHR_get_physical_device_properties2(provider, caps, ext);
        VK_KHR_get_surface_capabilities2 = check_KHR_get_surface_capabilities2(provider, caps, ext);
        check_KHR_performance_query(provider, caps, deviceExt);
        VK_KHR_portability_enumeration = ext.contains("VK_KHR_portability_enumeration");
        VK_KHR_surface = check_KHR_surface(provider, caps, ext);
        VK_KHR_surface_protected_capabilities = ext.contains("VK_KHR_surface_protected_capabilities");
        check_KHR_swapchain(provider, caps, deviceExt);
        check_KHR_video_encode_queue(provider, caps, deviceExt);
        check_KHR_video_queue(provider, caps, deviceExt);
        VK_KHR_wayland_surface = check_KHR_wayland_surface(provider, caps, ext);
        VK_KHR_win32_surface = check_KHR_win32_surface(provider, caps, ext);
        VK_KHR_xcb_surface = check_KHR_xcb_surface(provider, caps, ext);
        VK_KHR_xlib_surface = check_KHR_xlib_surface(provider, caps, ext);
        VK_LUNARG_direct_driver_loading = ext.contains("VK_LUNARG_direct_driver_loading");
        VK_MVK_macos_surface = check_MVK_macos_surface(provider, caps, ext);
        check_NV_acquire_winrt_display(provider, caps, deviceExt);
        check_NV_cooperative_matrix(provider, caps, deviceExt);
        check_NV_cooperative_matrix2(provider, caps, deviceExt);
        check_NV_cooperative_vector(provider, caps, deviceExt);
        check_NV_coverage_reduction_mode(provider, caps, deviceExt);
        VK_NV_display_stereo = ext.contains("VK_NV_display_stereo");
        VK_NV_external_memory_capabilities = check_NV_external_memory_capabilities(provider, caps, ext);
        check_NV_optical_flow(provider, caps, deviceExt);

        vkDestroyInstance = caps[0];
        vkEnumeratePhysicalDevices = caps[1];
        vkGetPhysicalDeviceFeatures = caps[2];
        vkGetPhysicalDeviceFormatProperties = caps[3];
        vkGetPhysicalDeviceImageFormatProperties = caps[4];
        vkGetPhysicalDeviceProperties = caps[5];
        vkGetPhysicalDeviceQueueFamilyProperties = caps[6];
        vkGetPhysicalDeviceMemoryProperties = caps[7];
        vkCreateDevice = caps[8];
        vkEnumerateDeviceExtensionProperties = caps[9];
        vkEnumerateDeviceLayerProperties = caps[10];
        vkGetPhysicalDeviceSparseImageFormatProperties = caps[11];
        vkEnumeratePhysicalDeviceGroups = caps[12];
        vkGetPhysicalDeviceFeatures2 = caps[13];
        vkGetPhysicalDeviceProperties2 = caps[14];
        vkGetPhysicalDeviceFormatProperties2 = caps[15];
        vkGetPhysicalDeviceImageFormatProperties2 = caps[16];
        vkGetPhysicalDeviceQueueFamilyProperties2 = caps[17];
        vkGetPhysicalDeviceMemoryProperties2 = caps[18];
        vkGetPhysicalDeviceSparseImageFormatProperties2 = caps[19];
        vkGetPhysicalDeviceExternalBufferProperties = caps[20];
        vkGetPhysicalDeviceExternalFenceProperties = caps[21];
        vkGetPhysicalDeviceExternalSemaphoreProperties = caps[22];
        vkGetPhysicalDeviceToolProperties = caps[23];
        vkGetPhysicalDeviceExternalTensorPropertiesARM = caps[24];
        vkAcquireDrmDisplayEXT = caps[25];
        vkGetDrmDisplayEXT = caps[26];
        vkAcquireXlibDisplayEXT = caps[27];
        vkGetRandROutputDisplayEXT = caps[28];
        vkGetPhysicalDeviceCalibrateableTimeDomainsEXT = caps[29];
        vkCreateDebugReportCallbackEXT = caps[30];
        vkDestroyDebugReportCallbackEXT = caps[31];
        vkDebugReportMessageEXT = caps[32];
        vkSetDebugUtilsObjectNameEXT = caps[33];
        vkSetDebugUtilsObjectTagEXT = caps[34];
        vkQueueBeginDebugUtilsLabelEXT = caps[35];
        vkQueueEndDebugUtilsLabelEXT = caps[36];
        vkQueueInsertDebugUtilsLabelEXT = caps[37];
        vkCmdBeginDebugUtilsLabelEXT = caps[38];
        vkCmdEndDebugUtilsLabelEXT = caps[39];
        vkCmdInsertDebugUtilsLabelEXT = caps[40];
        vkCreateDebugUtilsMessengerEXT = caps[41];
        vkDestroyDebugUtilsMessengerEXT = caps[42];
        vkSubmitDebugUtilsMessageEXT = caps[43];
        vkReleaseDisplayEXT = caps[44];
        vkCreateDirectFBSurfaceEXT = caps[45];
        vkGetPhysicalDeviceDirectFBPresentationSupportEXT = caps[46];
        vkGetPhysicalDeviceSurfaceCapabilities2EXT = caps[47];
        vkGetPhysicalDeviceSurfacePresentModes2EXT = caps[48];
        vkCreateHeadlessSurfaceEXT = caps[49];
        vkCreateMetalSurfaceEXT = caps[50];
        vkGetPhysicalDeviceMultisamplePropertiesEXT = caps[51];
        vkGetPhysicalDeviceToolPropertiesEXT = caps[52];
        vkCreateAndroidSurfaceKHR = caps[53];
        vkGetPhysicalDeviceCalibrateableTimeDomainsKHR = caps[54];
        vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR = caps[55];
        vkGetPhysicalDevicePresentRectanglesKHR = caps[56];
        vkEnumeratePhysicalDeviceGroupsKHR = caps[57];
        vkGetPhysicalDeviceDisplayPropertiesKHR = caps[58];
        vkGetPhysicalDeviceDisplayPlanePropertiesKHR = caps[59];
        vkGetDisplayPlaneSupportedDisplaysKHR = caps[60];
        vkGetDisplayModePropertiesKHR = caps[61];
        vkCreateDisplayModeKHR = caps[62];
        vkGetDisplayPlaneCapabilitiesKHR = caps[63];
        vkCreateDisplayPlaneSurfaceKHR = caps[64];
        vkGetPhysicalDeviceExternalFencePropertiesKHR = caps[65];
        vkGetPhysicalDeviceExternalBufferPropertiesKHR = caps[66];
        vkGetPhysicalDeviceExternalSemaphorePropertiesKHR = caps[67];
        vkGetPhysicalDeviceFragmentShadingRatesKHR = caps[68];
        vkGetPhysicalDeviceDisplayProperties2KHR = caps[69];
        vkGetPhysicalDeviceDisplayPlaneProperties2KHR = caps[70];
        vkGetDisplayModeProperties2KHR = caps[71];
        vkGetDisplayPlaneCapabilities2KHR = caps[72];
        vkGetPhysicalDeviceFeatures2KHR = caps[73];
        vkGetPhysicalDeviceProperties2KHR = caps[74];
        vkGetPhysicalDeviceFormatProperties2KHR = caps[75];
        vkGetPhysicalDeviceImageFormatProperties2KHR = caps[76];
        vkGetPhysicalDeviceQueueFamilyProperties2KHR = caps[77];
        vkGetPhysicalDeviceMemoryProperties2KHR = caps[78];
        vkGetPhysicalDeviceSparseImageFormatProperties2KHR = caps[79];
        vkGetPhysicalDeviceSurfaceCapabilities2KHR = caps[80];
        vkGetPhysicalDeviceSurfaceFormats2KHR = caps[81];
        vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = caps[82];
        vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = caps[83];
        vkDestroySurfaceKHR = caps[84];
        vkGetPhysicalDeviceSurfaceSupportKHR = caps[85];
        vkGetPhysicalDeviceSurfaceCapabilitiesKHR = caps[86];
        vkGetPhysicalDeviceSurfaceFormatsKHR = caps[87];
        vkGetPhysicalDeviceSurfacePresentModesKHR = caps[88];
        vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR = caps[89];
        vkGetPhysicalDeviceVideoCapabilitiesKHR = caps[90];
        vkGetPhysicalDeviceVideoFormatPropertiesKHR = caps[91];
        vkCreateWaylandSurfaceKHR = caps[92];
        vkGetPhysicalDeviceWaylandPresentationSupportKHR = caps[93];
        vkCreateWin32SurfaceKHR = caps[94];
        vkGetPhysicalDeviceWin32PresentationSupportKHR = caps[95];
        vkCreateXcbSurfaceKHR = caps[96];
        vkGetPhysicalDeviceXcbPresentationSupportKHR = caps[97];
        vkCreateXlibSurfaceKHR = caps[98];
        vkGetPhysicalDeviceXlibPresentationSupportKHR = caps[99];
        vkCreateMacOSSurfaceMVK = caps[100];
        vkAcquireWinrtDisplayNV = caps[101];
        vkGetWinrtDisplayNV = caps[102];
        vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = caps[103];
        vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV = caps[104];
        vkGetPhysicalDeviceCooperativeVectorPropertiesNV = caps[105];
        vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = caps[106];
        vkGetPhysicalDeviceExternalImageFormatPropertiesNV = caps[107];
        vkGetPhysicalDeviceOpticalFlowImageFormatsNV = caps[108];
    }

    private static boolean check_VK10(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan10")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
        },
            "vkDestroyInstance", "vkEnumeratePhysicalDevices", "vkGetPhysicalDeviceFeatures", "vkGetPhysicalDeviceFormatProperties", 
            "vkGetPhysicalDeviceImageFormatProperties", "vkGetPhysicalDeviceProperties", "vkGetPhysicalDeviceQueueFamilyProperties", 
            "vkGetPhysicalDeviceMemoryProperties", "vkCreateDevice", "vkEnumerateDeviceExtensionProperties", "vkEnumerateDeviceLayerProperties", 
            "vkGetPhysicalDeviceSparseImageFormatProperties"
        ) || reportMissing("VK", "Vulkan10");
    }

    private static boolean check_VK11(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan11")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22
        },
            "vkEnumeratePhysicalDeviceGroups", "vkGetPhysicalDeviceFeatures2", "vkGetPhysicalDeviceProperties2", "vkGetPhysicalDeviceFormatProperties2", 
            "vkGetPhysicalDeviceImageFormatProperties2", "vkGetPhysicalDeviceQueueFamilyProperties2", "vkGetPhysicalDeviceMemoryProperties2", 
            "vkGetPhysicalDeviceSparseImageFormatProperties2", "vkGetPhysicalDeviceExternalBufferProperties", "vkGetPhysicalDeviceExternalFenceProperties", 
            "vkGetPhysicalDeviceExternalSemaphoreProperties"
        ) || reportMissing("VK", "Vulkan11");
    }

    private static boolean check_VK13(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan13")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            23
        },
            "vkGetPhysicalDeviceToolProperties"
        ) || reportMissing("VK", "Vulkan13");
    }

    private static boolean check_ARM_tensors(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_ARM_tensors")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            24
        },
            "vkGetPhysicalDeviceExternalTensorPropertiesARM"
        ) || reportMissing("VK", "VK_ARM_tensors");
    }

    private static boolean check_EXT_acquire_drm_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_acquire_drm_display")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            25, 26
        },
            "vkAcquireDrmDisplayEXT", "vkGetDrmDisplayEXT"
        ) || reportMissing("VK", "VK_EXT_acquire_drm_display");
    }

    private static boolean check_EXT_acquire_xlib_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_acquire_xlib_display")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            27, 28
        },
            "vkAcquireXlibDisplayEXT", "vkGetRandROutputDisplayEXT"
        ) || reportMissing("VK", "VK_EXT_acquire_xlib_display");
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            29
        },
            "vkGetPhysicalDeviceCalibrateableTimeDomainsEXT"
        ) || reportMissing("VK", "VK_EXT_calibrated_timestamps");
    }

    private static boolean check_EXT_debug_report(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_debug_report")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            30, 31, 32
        },
            "vkCreateDebugReportCallbackEXT", "vkDestroyDebugReportCallbackEXT", "vkDebugReportMessageEXT"
        ) || reportMissing("VK", "VK_EXT_debug_report");
    }

    private static boolean check_EXT_debug_utils(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_debug_utils")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43
        },
            "vkSetDebugUtilsObjectNameEXT", "vkSetDebugUtilsObjectTagEXT", "vkQueueBeginDebugUtilsLabelEXT", "vkQueueEndDebugUtilsLabelEXT", 
            "vkQueueInsertDebugUtilsLabelEXT", "vkCmdBeginDebugUtilsLabelEXT", "vkCmdEndDebugUtilsLabelEXT", "vkCmdInsertDebugUtilsLabelEXT", 
            "vkCreateDebugUtilsMessengerEXT", "vkDestroyDebugUtilsMessengerEXT", "vkSubmitDebugUtilsMessageEXT"
        ) || reportMissing("VK", "VK_EXT_debug_utils");
    }

    private static boolean check_EXT_direct_mode_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_direct_mode_display")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            44
        },
            "vkReleaseDisplayEXT"
        ) || reportMissing("VK", "VK_EXT_direct_mode_display");
    }

    private static boolean check_EXT_directfb_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_directfb_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            45, 46
        },
            "vkCreateDirectFBSurfaceEXT", "vkGetPhysicalDeviceDirectFBPresentationSupportEXT"
        ) || reportMissing("VK", "VK_EXT_directfb_surface");
    }

    private static boolean check_EXT_display_surface_counter(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_display_surface_counter")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            47
        },
            "vkGetPhysicalDeviceSurfaceCapabilities2EXT"
        ) || reportMissing("VK", "VK_EXT_display_surface_counter");
    }

    private static boolean check_EXT_full_screen_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_full_screen_exclusive")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            48
        },
            "vkGetPhysicalDeviceSurfacePresentModes2EXT"
        ) || reportMissing("VK", "VK_EXT_full_screen_exclusive");
    }

    private static boolean check_EXT_headless_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_headless_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            49
        },
            "vkCreateHeadlessSurfaceEXT"
        ) || reportMissing("VK", "VK_EXT_headless_surface");
    }

    private static boolean check_EXT_metal_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_metal_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            50
        },
            "vkCreateMetalSurfaceEXT"
        ) || reportMissing("VK", "VK_EXT_metal_surface");
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_sample_locations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            51
        },
            "vkGetPhysicalDeviceMultisamplePropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_sample_locations");
    }

    private static boolean check_EXT_tooling_info(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_tooling_info")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            52
        },
            "vkGetPhysicalDeviceToolPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_tooling_info");
    }

    private static boolean check_KHR_android_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_android_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            53
        },
            "vkCreateAndroidSurfaceKHR"
        ) || reportMissing("VK", "VK_KHR_android_surface");
    }

    private static boolean check_KHR_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            54
        },
            "vkGetPhysicalDeviceCalibrateableTimeDomainsKHR"
        ) || reportMissing("VK", "VK_KHR_calibrated_timestamps");
    }

    private static boolean check_KHR_cooperative_matrix(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_cooperative_matrix")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            55
        },
            "vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_cooperative_matrix");
    }

    private static boolean check_KHR_device_group(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_device_group")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_surface") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            flag0 + 56
        },
            "vkGetPhysicalDevicePresentRectanglesKHR"
        ) || reportMissing("VK", "VK_KHR_device_group");
    }

    private static boolean check_KHR_device_group_creation(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_device_group_creation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            57
        },
            "vkEnumeratePhysicalDeviceGroupsKHR"
        ) || reportMissing("VK", "VK_KHR_device_group_creation");
    }

    private static boolean check_KHR_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_display")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            58, 59, 60, 61, 62, 63, 64
        },
            "vkGetPhysicalDeviceDisplayPropertiesKHR", "vkGetPhysicalDeviceDisplayPlanePropertiesKHR", "vkGetDisplayPlaneSupportedDisplaysKHR", 
            "vkGetDisplayModePropertiesKHR", "vkCreateDisplayModeKHR", "vkGetDisplayPlaneCapabilitiesKHR", "vkCreateDisplayPlaneSurfaceKHR"
        ) || reportMissing("VK", "VK_KHR_display");
    }

    private static boolean check_KHR_external_fence_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_capabilities")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            65
        },
            "vkGetPhysicalDeviceExternalFencePropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_capabilities");
    }

    private static boolean check_KHR_external_memory_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_capabilities")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            66
        },
            "vkGetPhysicalDeviceExternalBufferPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_capabilities");
    }

    private static boolean check_KHR_external_semaphore_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_capabilities")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            67
        },
            "vkGetPhysicalDeviceExternalSemaphorePropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_capabilities");
    }

    private static boolean check_KHR_fragment_shading_rate(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_fragment_shading_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            68
        },
            "vkGetPhysicalDeviceFragmentShadingRatesKHR"
        ) || reportMissing("VK", "VK_KHR_fragment_shading_rate");
    }

    private static boolean check_KHR_get_display_properties2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_get_display_properties2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            69, 70, 71, 72
        },
            "vkGetPhysicalDeviceDisplayProperties2KHR", "vkGetPhysicalDeviceDisplayPlaneProperties2KHR", "vkGetDisplayModeProperties2KHR", 
            "vkGetDisplayPlaneCapabilities2KHR"
        ) || reportMissing("VK", "VK_KHR_get_display_properties2");
    }

    private static boolean check_KHR_get_physical_device_properties2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_get_physical_device_properties2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            73, 74, 75, 76, 77, 78, 79
        },
            "vkGetPhysicalDeviceFeatures2KHR", "vkGetPhysicalDeviceProperties2KHR", "vkGetPhysicalDeviceFormatProperties2KHR", 
            "vkGetPhysicalDeviceImageFormatProperties2KHR", "vkGetPhysicalDeviceQueueFamilyProperties2KHR", "vkGetPhysicalDeviceMemoryProperties2KHR", 
            "vkGetPhysicalDeviceSparseImageFormatProperties2KHR"
        ) || reportMissing("VK", "VK_KHR_get_physical_device_properties2");
    }

    private static boolean check_KHR_get_surface_capabilities2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_get_surface_capabilities2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            80, 81
        },
            "vkGetPhysicalDeviceSurfaceCapabilities2KHR", "vkGetPhysicalDeviceSurfaceFormats2KHR"
        ) || reportMissing("VK", "VK_KHR_get_surface_capabilities2");
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            82, 83
        },
            "vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR", "vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR"
        ) || reportMissing("VK", "VK_KHR_performance_query");
    }

    private static boolean check_KHR_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            84, 85, 86, 87, 88
        },
            "vkDestroySurfaceKHR", "vkGetPhysicalDeviceSurfaceSupportKHR", "vkGetPhysicalDeviceSurfaceCapabilitiesKHR", "vkGetPhysicalDeviceSurfaceFormatsKHR", 
            "vkGetPhysicalDeviceSurfacePresentModesKHR"
        ) || reportMissing("VK", "VK_KHR_surface");
    }

    private static boolean check_KHR_swapchain(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_swapchain")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            flag0 + 56
        },
            "vkGetPhysicalDevicePresentRectanglesKHR"
        ) || reportMissing("VK", "VK_KHR_swapchain");
    }

    private static boolean check_KHR_video_encode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_encode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            89
        },
            "vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_video_encode_queue");
    }

    private static boolean check_KHR_video_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            90, 91
        },
            "vkGetPhysicalDeviceVideoCapabilitiesKHR", "vkGetPhysicalDeviceVideoFormatPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_video_queue");
    }

    private static boolean check_KHR_wayland_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_wayland_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            92, 93
        },
            "vkCreateWaylandSurfaceKHR", "vkGetPhysicalDeviceWaylandPresentationSupportKHR"
        ) || reportMissing("VK", "VK_KHR_wayland_surface");
    }

    private static boolean check_KHR_win32_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_win32_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            94, 95
        },
            "vkCreateWin32SurfaceKHR", "vkGetPhysicalDeviceWin32PresentationSupportKHR"
        ) || reportMissing("VK", "VK_KHR_win32_surface");
    }

    private static boolean check_KHR_xcb_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_xcb_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            96, 97
        },
            "vkCreateXcbSurfaceKHR", "vkGetPhysicalDeviceXcbPresentationSupportKHR"
        ) || reportMissing("VK", "VK_KHR_xcb_surface");
    }

    private static boolean check_KHR_xlib_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_xlib_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            98, 99
        },
            "vkCreateXlibSurfaceKHR", "vkGetPhysicalDeviceXlibPresentationSupportKHR"
        ) || reportMissing("VK", "VK_KHR_xlib_surface");
    }

    private static boolean check_MVK_macos_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_MVK_macos_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            100
        },
            "vkCreateMacOSSurfaceMVK"
        ) || reportMissing("VK", "VK_MVK_macos_surface");
    }

    private static boolean check_NV_acquire_winrt_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_acquire_winrt_display")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            101, 102
        },
            "vkAcquireWinrtDisplayNV", "vkGetWinrtDisplayNV"
        ) || reportMissing("VK", "VK_NV_acquire_winrt_display");
    }

    private static boolean check_NV_cooperative_matrix(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cooperative_matrix")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            103
        },
            "vkGetPhysicalDeviceCooperativeMatrixPropertiesNV"
        ) || reportMissing("VK", "VK_NV_cooperative_matrix");
    }

    private static boolean check_NV_cooperative_matrix2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cooperative_matrix2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            104
        },
            "vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV"
        ) || reportMissing("VK", "VK_NV_cooperative_matrix2");
    }

    private static boolean check_NV_cooperative_vector(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cooperative_vector")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            105
        },
            "vkGetPhysicalDeviceCooperativeVectorPropertiesNV"
        ) || reportMissing("VK", "VK_NV_cooperative_vector");
    }

    private static boolean check_NV_coverage_reduction_mode(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_coverage_reduction_mode")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            106
        },
            "vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV"
        ) || reportMissing("VK", "VK_NV_coverage_reduction_mode");
    }

    private static boolean check_NV_external_memory_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_capabilities")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            107
        },
            "vkGetPhysicalDeviceExternalImageFormatPropertiesNV"
        ) || reportMissing("VK", "VK_NV_external_memory_capabilities");
    }

    private static boolean check_NV_optical_flow(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_optical_flow")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            108
        },
            "vkGetPhysicalDeviceOpticalFlowImageFormatsNV"
        ) || reportMissing("VK", "VK_NV_optical_flow");
    }

}
