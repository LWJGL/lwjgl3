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

    /** When true, {@link VK10} is supported. */
    public final boolean Vulkan10;
    /** When true, {@link VK11} is supported. */
    public final boolean Vulkan11;
    /** When true, {@link VK12} is supported. */
    public final boolean Vulkan12;
    /** When true, {@link VK13} is supported. */
    public final boolean Vulkan13;
    /** When true, {@link EXTAcquireDrmDisplay} is supported. */
    public final boolean VK_EXT_acquire_drm_display;
    /** When true, {@link EXTAcquireXlibDisplay} is supported. */
    public final boolean VK_EXT_acquire_xlib_display;
    /** When true, {@link EXTDebugReport} is supported. */
    public final boolean VK_EXT_debug_report;
    /** When true, {@link EXTDebugUtils} is supported. */
    public final boolean VK_EXT_debug_utils;
    /** When true, {@link EXTDirectModeDisplay} is supported. */
    public final boolean VK_EXT_direct_mode_display;
    /** When true, {@link EXTDisplaySurfaceCounter} is supported. */
    public final boolean VK_EXT_display_surface_counter;
    /** When true, {@link EXTHeadlessSurface} is supported. */
    public final boolean VK_EXT_headless_surface;
    /** When true, {@link EXTMetalSurface} is supported. */
    public final boolean VK_EXT_metal_surface;
    /** When true, {@link EXTSwapchainColorspace} is supported. */
    public final boolean VK_EXT_swapchain_colorspace;
    /** When true, {@link EXTValidationFeatures} is supported. */
    public final boolean VK_EXT_validation_features;
    /** When true, {@link EXTValidationFlags} is supported. */
    public final boolean VK_EXT_validation_flags;
    /** When true, {@link GOOGLESurfacelessQuery} is supported. */
    public final boolean VK_GOOGLE_surfaceless_query;
    /** When true, {@link KHRDeviceGroupCreation} is supported. */
    public final boolean VK_KHR_device_group_creation;
    /** When true, {@link KHRDisplay} is supported. */
    public final boolean VK_KHR_display;
    /** When true, {@link KHRExternalFenceCapabilities} is supported. */
    public final boolean VK_KHR_external_fence_capabilities;
    /** When true, {@link KHRExternalMemoryCapabilities} is supported. */
    public final boolean VK_KHR_external_memory_capabilities;
    /** When true, {@link KHRExternalSemaphoreCapabilities} is supported. */
    public final boolean VK_KHR_external_semaphore_capabilities;
    /** When true, {@link KHRGetDisplayProperties2} is supported. */
    public final boolean VK_KHR_get_display_properties2;
    /** When true, {@link KHRGetPhysicalDeviceProperties2} is supported. */
    public final boolean VK_KHR_get_physical_device_properties2;
    /** When true, {@link KHRGetSurfaceCapabilities2} is supported. */
    public final boolean VK_KHR_get_surface_capabilities2;
    /** When true, {@link KHRPortabilityEnumeration} is supported. */
    public final boolean VK_KHR_portability_enumeration;
    /** When true, {@link KHRSurface} is supported. */
    public final boolean VK_KHR_surface;
    /** When true, {@link KHRSurfaceProtectedCapabilities} is supported. */
    public final boolean VK_KHR_surface_protected_capabilities;
    /** When true, {@link KHRWaylandSurface} is supported. */
    public final boolean VK_KHR_wayland_surface;
    /** When true, {@link KHRWin32Surface} is supported. */
    public final boolean VK_KHR_win32_surface;
    /** When true, {@link KHRXlibSurface} is supported. */
    public final boolean VK_KHR_xlib_surface;
    /** When true, {@link MVKMacosSurface} is supported. */
    public final boolean VK_MVK_macos_surface;
    /** When true, {@link NVExternalMemoryCapabilities} is supported. */
    public final boolean VK_NV_external_memory_capabilities;

    VKCapabilitiesInstance(FunctionProvider provider, int apiVersion, Set<String> ext, Set<String> deviceExt) {
        this.apiVersion = apiVersion;

        long[] caps = new long[98];

        Vulkan10 = check_VK10(provider, caps, ext);
        Vulkan11 = check_VK11(provider, caps, ext);
        Vulkan12 = ext.contains("Vulkan12");
        Vulkan13 = check_VK13(provider, caps, ext);
        VK_EXT_acquire_drm_display = check_EXT_acquire_drm_display(provider, caps, ext);
        VK_EXT_acquire_xlib_display = check_EXT_acquire_xlib_display(provider, caps, ext);
        check_EXT_calibrated_timestamps(provider, caps, deviceExt);
        VK_EXT_debug_report = check_EXT_debug_report(provider, caps, ext);
        VK_EXT_debug_utils = check_EXT_debug_utils(provider, caps, ext);
        VK_EXT_direct_mode_display = check_EXT_direct_mode_display(provider, caps, ext);
        VK_EXT_display_surface_counter = check_EXT_display_surface_counter(provider, caps, ext);
        check_EXT_full_screen_exclusive(provider, caps, deviceExt);
        VK_EXT_headless_surface = check_EXT_headless_surface(provider, caps, ext);
        VK_EXT_metal_surface = check_EXT_metal_surface(provider, caps, ext);
        check_EXT_sample_locations(provider, caps, deviceExt);
        VK_EXT_swapchain_colorspace = ext.contains("VK_EXT_swapchain_colorspace");
        check_EXT_tooling_info(provider, caps, deviceExt);
        VK_EXT_validation_features = ext.contains("VK_EXT_validation_features");
        VK_EXT_validation_flags = ext.contains("VK_EXT_validation_flags");
        VK_GOOGLE_surfaceless_query = ext.contains("VK_GOOGLE_surfaceless_query");
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
        check_KHR_video_queue(provider, caps, deviceExt);
        VK_KHR_wayland_surface = check_KHR_wayland_surface(provider, caps, ext);
        VK_KHR_win32_surface = check_KHR_win32_surface(provider, caps, ext);
        VK_KHR_xlib_surface = check_KHR_xlib_surface(provider, caps, ext);
        VK_MVK_macos_surface = check_MVK_macos_surface(provider, caps, ext);
        check_NV_acquire_winrt_display(provider, caps, deviceExt);
        check_NV_cooperative_matrix(provider, caps, deviceExt);
        check_NV_coverage_reduction_mode(provider, caps, deviceExt);
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
        vkAcquireDrmDisplayEXT = caps[24];
        vkGetDrmDisplayEXT = caps[25];
        vkAcquireXlibDisplayEXT = caps[26];
        vkGetRandROutputDisplayEXT = caps[27];
        vkGetPhysicalDeviceCalibrateableTimeDomainsEXT = caps[28];
        vkCreateDebugReportCallbackEXT = caps[29];
        vkDestroyDebugReportCallbackEXT = caps[30];
        vkDebugReportMessageEXT = caps[31];
        vkSetDebugUtilsObjectNameEXT = caps[32];
        vkSetDebugUtilsObjectTagEXT = caps[33];
        vkQueueBeginDebugUtilsLabelEXT = caps[34];
        vkQueueEndDebugUtilsLabelEXT = caps[35];
        vkQueueInsertDebugUtilsLabelEXT = caps[36];
        vkCmdBeginDebugUtilsLabelEXT = caps[37];
        vkCmdEndDebugUtilsLabelEXT = caps[38];
        vkCmdInsertDebugUtilsLabelEXT = caps[39];
        vkCreateDebugUtilsMessengerEXT = caps[40];
        vkDestroyDebugUtilsMessengerEXT = caps[41];
        vkSubmitDebugUtilsMessageEXT = caps[42];
        vkReleaseDisplayEXT = caps[43];
        vkGetPhysicalDeviceSurfaceCapabilities2EXT = caps[44];
        vkGetPhysicalDeviceSurfacePresentModes2EXT = caps[45];
        vkCreateHeadlessSurfaceEXT = caps[46];
        vkCreateMetalSurfaceEXT = caps[47];
        vkGetPhysicalDeviceMultisamplePropertiesEXT = caps[48];
        vkGetPhysicalDeviceToolPropertiesEXT = caps[49];
        vkGetPhysicalDevicePresentRectanglesKHR = caps[50];
        vkEnumeratePhysicalDeviceGroupsKHR = caps[51];
        vkGetPhysicalDeviceDisplayPropertiesKHR = caps[52];
        vkGetPhysicalDeviceDisplayPlanePropertiesKHR = caps[53];
        vkGetDisplayPlaneSupportedDisplaysKHR = caps[54];
        vkGetDisplayModePropertiesKHR = caps[55];
        vkCreateDisplayModeKHR = caps[56];
        vkGetDisplayPlaneCapabilitiesKHR = caps[57];
        vkCreateDisplayPlaneSurfaceKHR = caps[58];
        vkGetPhysicalDeviceExternalFencePropertiesKHR = caps[59];
        vkGetPhysicalDeviceExternalBufferPropertiesKHR = caps[60];
        vkGetPhysicalDeviceExternalSemaphorePropertiesKHR = caps[61];
        vkGetPhysicalDeviceFragmentShadingRatesKHR = caps[62];
        vkGetPhysicalDeviceDisplayProperties2KHR = caps[63];
        vkGetPhysicalDeviceDisplayPlaneProperties2KHR = caps[64];
        vkGetDisplayModeProperties2KHR = caps[65];
        vkGetDisplayPlaneCapabilities2KHR = caps[66];
        vkGetPhysicalDeviceFeatures2KHR = caps[67];
        vkGetPhysicalDeviceProperties2KHR = caps[68];
        vkGetPhysicalDeviceFormatProperties2KHR = caps[69];
        vkGetPhysicalDeviceImageFormatProperties2KHR = caps[70];
        vkGetPhysicalDeviceQueueFamilyProperties2KHR = caps[71];
        vkGetPhysicalDeviceMemoryProperties2KHR = caps[72];
        vkGetPhysicalDeviceSparseImageFormatProperties2KHR = caps[73];
        vkGetPhysicalDeviceSurfaceCapabilities2KHR = caps[74];
        vkGetPhysicalDeviceSurfaceFormats2KHR = caps[75];
        vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = caps[76];
        vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = caps[77];
        vkDestroySurfaceKHR = caps[78];
        vkGetPhysicalDeviceSurfaceSupportKHR = caps[79];
        vkGetPhysicalDeviceSurfaceCapabilitiesKHR = caps[80];
        vkGetPhysicalDeviceSurfaceFormatsKHR = caps[81];
        vkGetPhysicalDeviceSurfacePresentModesKHR = caps[82];
        vkGetPhysicalDeviceVideoCapabilitiesKHR = caps[83];
        vkGetPhysicalDeviceVideoFormatPropertiesKHR = caps[84];
        vkCreateWaylandSurfaceKHR = caps[85];
        vkGetPhysicalDeviceWaylandPresentationSupportKHR = caps[86];
        vkCreateWin32SurfaceKHR = caps[87];
        vkGetPhysicalDeviceWin32PresentationSupportKHR = caps[88];
        vkCreateXlibSurfaceKHR = caps[89];
        vkGetPhysicalDeviceXlibPresentationSupportKHR = caps[90];
        vkCreateMacOSSurfaceMVK = caps[91];
        vkAcquireWinrtDisplayNV = caps[92];
        vkGetWinrtDisplayNV = caps[93];
        vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = caps[94];
        vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = caps[95];
        vkGetPhysicalDeviceExternalImageFormatPropertiesNV = caps[96];
        vkGetPhysicalDeviceOpticalFlowImageFormatsNV = caps[97];
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

    private static boolean check_EXT_acquire_drm_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_acquire_drm_display")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            24, 25
        },
            "vkAcquireDrmDisplayEXT", "vkGetDrmDisplayEXT"
        ) || reportMissing("VK", "VK_EXT_acquire_drm_display");
    }

    private static boolean check_EXT_acquire_xlib_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_acquire_xlib_display")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            26, 27
        },
            "vkAcquireXlibDisplayEXT", "vkGetRandROutputDisplayEXT"
        ) || reportMissing("VK", "VK_EXT_acquire_xlib_display");
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            28
        },
            "vkGetPhysicalDeviceCalibrateableTimeDomainsEXT"
        ) || reportMissing("VK", "VK_EXT_calibrated_timestamps");
    }

    private static boolean check_EXT_debug_report(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_debug_report")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            29, 30, 31
        },
            "vkCreateDebugReportCallbackEXT", "vkDestroyDebugReportCallbackEXT", "vkDebugReportMessageEXT"
        ) || reportMissing("VK", "VK_EXT_debug_report");
    }

    private static boolean check_EXT_debug_utils(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_debug_utils")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42
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
            43
        },
            "vkReleaseDisplayEXT"
        ) || reportMissing("VK", "VK_EXT_direct_mode_display");
    }

    private static boolean check_EXT_display_surface_counter(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_display_surface_counter")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            44
        },
            "vkGetPhysicalDeviceSurfaceCapabilities2EXT"
        ) || reportMissing("VK", "VK_EXT_display_surface_counter");
    }

    private static boolean check_EXT_full_screen_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_full_screen_exclusive")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            45
        },
            "vkGetPhysicalDeviceSurfacePresentModes2EXT"
        ) || reportMissing("VK", "VK_EXT_full_screen_exclusive");
    }

    private static boolean check_EXT_headless_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_headless_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            46
        },
            "vkCreateHeadlessSurfaceEXT"
        ) || reportMissing("VK", "VK_EXT_headless_surface");
    }

    private static boolean check_EXT_metal_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_metal_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            47
        },
            "vkCreateMetalSurfaceEXT"
        ) || reportMissing("VK", "VK_EXT_metal_surface");
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_sample_locations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            48
        },
            "vkGetPhysicalDeviceMultisamplePropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_sample_locations");
    }

    private static boolean check_EXT_tooling_info(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_tooling_info")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            49
        },
            "vkGetPhysicalDeviceToolPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_tooling_info");
    }

    private static boolean check_KHR_device_group(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_device_group")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_surface") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            flag0 + 50
        },
            "vkGetPhysicalDevicePresentRectanglesKHR"
        ) || reportMissing("VK", "VK_KHR_device_group");
    }

    private static boolean check_KHR_device_group_creation(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_device_group_creation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            51
        },
            "vkEnumeratePhysicalDeviceGroupsKHR"
        ) || reportMissing("VK", "VK_KHR_device_group_creation");
    }

    private static boolean check_KHR_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_display")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            52, 53, 54, 55, 56, 57, 58
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
            59
        },
            "vkGetPhysicalDeviceExternalFencePropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_capabilities");
    }

    private static boolean check_KHR_external_memory_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_capabilities")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            60
        },
            "vkGetPhysicalDeviceExternalBufferPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_capabilities");
    }

    private static boolean check_KHR_external_semaphore_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_capabilities")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            61
        },
            "vkGetPhysicalDeviceExternalSemaphorePropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_capabilities");
    }

    private static boolean check_KHR_fragment_shading_rate(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_fragment_shading_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            62
        },
            "vkGetPhysicalDeviceFragmentShadingRatesKHR"
        ) || reportMissing("VK", "VK_KHR_fragment_shading_rate");
    }

    private static boolean check_KHR_get_display_properties2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_get_display_properties2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            63, 64, 65, 66
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
            67, 68, 69, 70, 71, 72, 73
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
            74, 75
        },
            "vkGetPhysicalDeviceSurfaceCapabilities2KHR", "vkGetPhysicalDeviceSurfaceFormats2KHR"
        ) || reportMissing("VK", "VK_KHR_get_surface_capabilities2");
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            76, 77
        },
            "vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR", "vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR"
        ) || reportMissing("VK", "VK_KHR_performance_query");
    }

    private static boolean check_KHR_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            78, 79, 80, 81, 82
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
            flag0 + 50
        },
            "vkGetPhysicalDevicePresentRectanglesKHR"
        ) || reportMissing("VK", "VK_KHR_swapchain");
    }

    private static boolean check_KHR_video_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            83, 84
        },
            "vkGetPhysicalDeviceVideoCapabilitiesKHR", "vkGetPhysicalDeviceVideoFormatPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_video_queue");
    }

    private static boolean check_KHR_wayland_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_wayland_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            85, 86
        },
            "vkCreateWaylandSurfaceKHR", "vkGetPhysicalDeviceWaylandPresentationSupportKHR"
        ) || reportMissing("VK", "VK_KHR_wayland_surface");
    }

    private static boolean check_KHR_win32_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_win32_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            87, 88
        },
            "vkCreateWin32SurfaceKHR", "vkGetPhysicalDeviceWin32PresentationSupportKHR"
        ) || reportMissing("VK", "VK_KHR_win32_surface");
    }

    private static boolean check_KHR_xlib_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_xlib_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            89, 90
        },
            "vkCreateXlibSurfaceKHR", "vkGetPhysicalDeviceXlibPresentationSupportKHR"
        ) || reportMissing("VK", "VK_KHR_xlib_surface");
    }

    private static boolean check_MVK_macos_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_MVK_macos_surface")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            91
        },
            "vkCreateMacOSSurfaceMVK"
        ) || reportMissing("VK", "VK_MVK_macos_surface");
    }

    private static boolean check_NV_acquire_winrt_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_acquire_winrt_display")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            92, 93
        },
            "vkAcquireWinrtDisplayNV", "vkGetWinrtDisplayNV"
        ) || reportMissing("VK", "VK_NV_acquire_winrt_display");
    }

    private static boolean check_NV_cooperative_matrix(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cooperative_matrix")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            94
        },
            "vkGetPhysicalDeviceCooperativeMatrixPropertiesNV"
        ) || reportMissing("VK", "VK_NV_cooperative_matrix");
    }

    private static boolean check_NV_coverage_reduction_mode(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_coverage_reduction_mode")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            95
        },
            "vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV"
        ) || reportMissing("VK", "VK_NV_coverage_reduction_mode");
    }

    private static boolean check_NV_external_memory_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_capabilities")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            96
        },
            "vkGetPhysicalDeviceExternalImageFormatPropertiesNV"
        ) || reportMissing("VK", "VK_NV_external_memory_capabilities");
    }

    private static boolean check_NV_optical_flow(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_optical_flow")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            97
        },
            "vkGetPhysicalDeviceOpticalFlowImageFormatsNV"
        ) || reportMissing("VK", "VK_NV_optical_flow");
    }

}
