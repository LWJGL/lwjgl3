/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import java.util.Set;
import java.util.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

/** Defines the capabilities of a Vulkan {@code VkInstance}. */
public class VKCapabilitiesInstance {

    // VK10
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

    // VK11
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

    // EXT_acquire_xlib_display
    public final long
        vkAcquireXlibDisplayEXT,
        vkGetRandROutputDisplayEXT;

    // EXT_calibrated_timestamps
    public final long
        vkGetPhysicalDeviceCalibrateableTimeDomainsEXT;

    // EXT_debug_report
    public final long
        vkCreateDebugReportCallbackEXT,
        vkDestroyDebugReportCallbackEXT,
        vkDebugReportMessageEXT;

    // EXT_debug_utils
    public final long
        vkCreateDebugUtilsMessengerEXT,
        vkDestroyDebugUtilsMessengerEXT,
        vkSubmitDebugUtilsMessageEXT;

    // EXT_direct_mode_display
    public final long
        vkReleaseDisplayEXT;

    // EXT_display_surface_counter
    public final long
        vkGetPhysicalDeviceSurfaceCapabilities2EXT;

    // EXT_full_screen_exclusive
    public final long
        vkGetPhysicalDeviceSurfacePresentModes2EXT;

    // EXT_headless_surface
    public final long
        vkCreateHeadlessSurfaceEXT;

    // EXT_metal_surface
    public final long
        vkCreateMetalSurfaceEXT;

    // EXT_sample_locations
    public final long
        vkGetPhysicalDeviceMultisamplePropertiesEXT;

    // EXT_tooling_info
    public final long
        vkGetPhysicalDeviceToolPropertiesEXT;

    // KHR_device_group
    public final long
        vkGetPhysicalDevicePresentRectanglesKHR;

    // KHR_device_group_creation
    public final long
        vkEnumeratePhysicalDeviceGroupsKHR;

    // KHR_display
    public final long
        vkGetPhysicalDeviceDisplayPropertiesKHR,
        vkGetPhysicalDeviceDisplayPlanePropertiesKHR,
        vkGetDisplayPlaneSupportedDisplaysKHR,
        vkGetDisplayModePropertiesKHR,
        vkCreateDisplayModeKHR,
        vkGetDisplayPlaneCapabilitiesKHR,
        vkCreateDisplayPlaneSurfaceKHR;

    // KHR_external_fence_capabilities
    public final long
        vkGetPhysicalDeviceExternalFencePropertiesKHR;

    // KHR_external_memory_capabilities
    public final long
        vkGetPhysicalDeviceExternalBufferPropertiesKHR;

    // KHR_external_semaphore_capabilities
    public final long
        vkGetPhysicalDeviceExternalSemaphorePropertiesKHR;

    // KHR_get_display_properties2
    public final long
        vkGetPhysicalDeviceDisplayProperties2KHR,
        vkGetPhysicalDeviceDisplayPlaneProperties2KHR,
        vkGetDisplayModeProperties2KHR,
        vkGetDisplayPlaneCapabilities2KHR;

    // KHR_get_physical_device_properties2
    public final long
        vkGetPhysicalDeviceFeatures2KHR,
        vkGetPhysicalDeviceProperties2KHR,
        vkGetPhysicalDeviceFormatProperties2KHR,
        vkGetPhysicalDeviceImageFormatProperties2KHR,
        vkGetPhysicalDeviceQueueFamilyProperties2KHR,
        vkGetPhysicalDeviceMemoryProperties2KHR,
        vkGetPhysicalDeviceSparseImageFormatProperties2KHR;

    // KHR_get_surface_capabilities2
    public final long
        vkGetPhysicalDeviceSurfaceCapabilities2KHR,
        vkGetPhysicalDeviceSurfaceFormats2KHR;

    // KHR_performance_query
    public final long
        vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR,
        vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;

    // KHR_surface
    public final long
        vkDestroySurfaceKHR,
        vkGetPhysicalDeviceSurfaceSupportKHR,
        vkGetPhysicalDeviceSurfaceCapabilitiesKHR,
        vkGetPhysicalDeviceSurfaceFormatsKHR,
        vkGetPhysicalDeviceSurfacePresentModesKHR;

    // KHR_wayland_surface
    public final long
        vkCreateWaylandSurfaceKHR,
        vkGetPhysicalDeviceWaylandPresentationSupportKHR;

    // KHR_win32_surface
    public final long
        vkCreateWin32SurfaceKHR,
        vkGetPhysicalDeviceWin32PresentationSupportKHR;

    // KHR_xlib_surface
    public final long
        vkCreateXlibSurfaceKHR,
        vkGetPhysicalDeviceXlibPresentationSupportKHR;

    // MVK_macos_surface
    public final long
        vkCreateMacOSSurfaceMVK;

    // NV_cooperative_matrix
    public final long
        vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;

    // NV_coverage_reduction_mode
    public final long
        vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;

    // NV_external_memory_capabilities
    public final long
        vkGetPhysicalDeviceExternalImageFormatPropertiesNV;

    // NVX_device_generated_commands
    public final long
        vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX;

    /** The Vulkan API version number. */
    public final int apiVersion;

    /** When true, {@link VK10} is supported. */
    public final boolean Vulkan10;
    /** When true, {@link VK11} is supported. */
    public final boolean Vulkan11;
    /** When true, {@link VK12} is supported. */
    public final boolean Vulkan12;
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

        long[] caps = new long[82];

        Vulkan10 = check_VK10(provider, caps, ext);
        Vulkan11 = check_VK11(provider, caps, ext);
        Vulkan12 = ext.contains("Vulkan12");
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
        check_KHR_device_group(provider, caps, deviceExt);
        VK_KHR_device_group_creation = check_KHR_device_group_creation(provider, caps, ext);
        VK_KHR_display = check_KHR_display(provider, caps, ext);
        VK_KHR_external_fence_capabilities = check_KHR_external_fence_capabilities(provider, caps, ext);
        VK_KHR_external_memory_capabilities = check_KHR_external_memory_capabilities(provider, caps, ext);
        VK_KHR_external_semaphore_capabilities = check_KHR_external_semaphore_capabilities(provider, caps, ext);
        VK_KHR_get_display_properties2 = check_KHR_get_display_properties2(provider, caps, ext);
        VK_KHR_get_physical_device_properties2 = check_KHR_get_physical_device_properties2(provider, caps, ext);
        VK_KHR_get_surface_capabilities2 = check_KHR_get_surface_capabilities2(provider, caps, ext);
        check_KHR_performance_query(provider, caps, deviceExt);
        VK_KHR_surface = check_KHR_surface(provider, caps, ext);
        VK_KHR_surface_protected_capabilities = ext.contains("VK_KHR_surface_protected_capabilities");
        check_KHR_swapchain(provider, caps, deviceExt);
        VK_KHR_wayland_surface = check_KHR_wayland_surface(provider, caps, ext);
        VK_KHR_win32_surface = check_KHR_win32_surface(provider, caps, ext);
        VK_KHR_xlib_surface = check_KHR_xlib_surface(provider, caps, ext);
        VK_MVK_macos_surface = check_MVK_macos_surface(provider, caps, ext);
        check_NV_cooperative_matrix(provider, caps, deviceExt);
        check_NV_coverage_reduction_mode(provider, caps, deviceExt);
        VK_NV_external_memory_capabilities = check_NV_external_memory_capabilities(provider, caps, ext);
        check_NVX_device_generated_commands(provider, caps, deviceExt);

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
        vkAcquireXlibDisplayEXT = caps[23];
        vkGetRandROutputDisplayEXT = caps[24];
        vkGetPhysicalDeviceCalibrateableTimeDomainsEXT = caps[25];
        vkCreateDebugReportCallbackEXT = caps[26];
        vkDestroyDebugReportCallbackEXT = caps[27];
        vkDebugReportMessageEXT = caps[28];
        vkCreateDebugUtilsMessengerEXT = caps[29];
        vkDestroyDebugUtilsMessengerEXT = caps[30];
        vkSubmitDebugUtilsMessageEXT = caps[31];
        vkReleaseDisplayEXT = caps[32];
        vkGetPhysicalDeviceSurfaceCapabilities2EXT = caps[33];
        vkGetPhysicalDeviceSurfacePresentModes2EXT = caps[34];
        vkCreateHeadlessSurfaceEXT = caps[35];
        vkCreateMetalSurfaceEXT = caps[36];
        vkGetPhysicalDeviceMultisamplePropertiesEXT = caps[37];
        vkGetPhysicalDeviceToolPropertiesEXT = caps[38];
        vkGetPhysicalDevicePresentRectanglesKHR = caps[39];
        vkEnumeratePhysicalDeviceGroupsKHR = caps[40];
        vkGetPhysicalDeviceDisplayPropertiesKHR = caps[41];
        vkGetPhysicalDeviceDisplayPlanePropertiesKHR = caps[42];
        vkGetDisplayPlaneSupportedDisplaysKHR = caps[43];
        vkGetDisplayModePropertiesKHR = caps[44];
        vkCreateDisplayModeKHR = caps[45];
        vkGetDisplayPlaneCapabilitiesKHR = caps[46];
        vkCreateDisplayPlaneSurfaceKHR = caps[47];
        vkGetPhysicalDeviceExternalFencePropertiesKHR = caps[48];
        vkGetPhysicalDeviceExternalBufferPropertiesKHR = caps[49];
        vkGetPhysicalDeviceExternalSemaphorePropertiesKHR = caps[50];
        vkGetPhysicalDeviceDisplayProperties2KHR = caps[51];
        vkGetPhysicalDeviceDisplayPlaneProperties2KHR = caps[52];
        vkGetDisplayModeProperties2KHR = caps[53];
        vkGetDisplayPlaneCapabilities2KHR = caps[54];
        vkGetPhysicalDeviceFeatures2KHR = caps[55];
        vkGetPhysicalDeviceProperties2KHR = caps[56];
        vkGetPhysicalDeviceFormatProperties2KHR = caps[57];
        vkGetPhysicalDeviceImageFormatProperties2KHR = caps[58];
        vkGetPhysicalDeviceQueueFamilyProperties2KHR = caps[59];
        vkGetPhysicalDeviceMemoryProperties2KHR = caps[60];
        vkGetPhysicalDeviceSparseImageFormatProperties2KHR = caps[61];
        vkGetPhysicalDeviceSurfaceCapabilities2KHR = caps[62];
        vkGetPhysicalDeviceSurfaceFormats2KHR = caps[63];
        vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = caps[64];
        vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = caps[65];
        vkDestroySurfaceKHR = caps[66];
        vkGetPhysicalDeviceSurfaceSupportKHR = caps[67];
        vkGetPhysicalDeviceSurfaceCapabilitiesKHR = caps[68];
        vkGetPhysicalDeviceSurfaceFormatsKHR = caps[69];
        vkGetPhysicalDeviceSurfacePresentModesKHR = caps[70];
        vkCreateWaylandSurfaceKHR = caps[71];
        vkGetPhysicalDeviceWaylandPresentationSupportKHR = caps[72];
        vkCreateWin32SurfaceKHR = caps[73];
        vkGetPhysicalDeviceWin32PresentationSupportKHR = caps[74];
        vkCreateXlibSurfaceKHR = caps[75];
        vkGetPhysicalDeviceXlibPresentationSupportKHR = caps[76];
        vkCreateMacOSSurfaceMVK = caps[77];
        vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = caps[78];
        vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = caps[79];
        vkGetPhysicalDeviceExternalImageFormatPropertiesNV = caps[80];
        vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX = caps[81];
    }

    private static boolean check_VK10(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("Vulkan10") && VK.checkExtension("Vulkan10",
               VK.isSupported(provider, "vkDestroyInstance", caps, 0)
            && VK.isSupported(provider, "vkEnumeratePhysicalDevices", caps, 1)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFeatures", caps, 2)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFormatProperties", caps, 3)
            && VK.isSupported(provider, "vkGetPhysicalDeviceImageFormatProperties", caps, 4)
            && VK.isSupported(provider, "vkGetPhysicalDeviceProperties", caps, 5)
            && VK.isSupported(provider, "vkGetPhysicalDeviceQueueFamilyProperties", caps, 6)
            && VK.isSupported(provider, "vkGetPhysicalDeviceMemoryProperties", caps, 7)
            && VK.isSupported(provider, "vkCreateDevice", caps, 8)
            && VK.isSupported(provider, "vkEnumerateDeviceExtensionProperties", caps, 9)
            && VK.isSupported(provider, "vkEnumerateDeviceLayerProperties", caps, 10)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSparseImageFormatProperties", caps, 11)
        );
    }

    private static boolean check_VK11(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("Vulkan11") && VK.checkExtension("Vulkan11",
               VK.isSupported(provider, "vkEnumeratePhysicalDeviceGroups", caps, 12)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFeatures2", caps, 13)
            && VK.isSupported(provider, "vkGetPhysicalDeviceProperties2", caps, 14)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFormatProperties2", caps, 15)
            && VK.isSupported(provider, "vkGetPhysicalDeviceImageFormatProperties2", caps, 16)
            && VK.isSupported(provider, "vkGetPhysicalDeviceQueueFamilyProperties2", caps, 17)
            && VK.isSupported(provider, "vkGetPhysicalDeviceMemoryProperties2", caps, 18)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSparseImageFormatProperties2", caps, 19)
            && VK.isSupported(provider, "vkGetPhysicalDeviceExternalBufferProperties", caps, 20)
            && VK.isSupported(provider, "vkGetPhysicalDeviceExternalFenceProperties", caps, 21)
            && VK.isSupported(provider, "vkGetPhysicalDeviceExternalSemaphoreProperties", caps, 22)
        );
    }

    private static boolean check_EXT_acquire_xlib_display(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_acquire_xlib_display") && VK.checkExtension("VK_EXT_acquire_xlib_display",
               VK.isSupported(provider, "vkAcquireXlibDisplayEXT", caps, 23)
            && VK.isSupported(provider, "vkGetRandROutputDisplayEXT", caps, 24)
        );
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_calibrated_timestamps") && VK.checkExtension("VK_EXT_calibrated_timestamps",
               VK.isSupported(provider, "vkGetPhysicalDeviceCalibrateableTimeDomainsEXT", caps, 25)
        );
    }

    private static boolean check_EXT_debug_report(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_debug_report") && VK.checkExtension("VK_EXT_debug_report",
               VK.isSupported(provider, "vkCreateDebugReportCallbackEXT", caps, 26)
            && VK.isSupported(provider, "vkDestroyDebugReportCallbackEXT", caps, 27)
            && VK.isSupported(provider, "vkDebugReportMessageEXT", caps, 28)
        );
    }

    private static boolean check_EXT_debug_utils(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_debug_utils") && VK.checkExtension("VK_EXT_debug_utils",
               VK.isSupported(provider, "vkCreateDebugUtilsMessengerEXT", caps, 29)
            && VK.isSupported(provider, "vkDestroyDebugUtilsMessengerEXT", caps, 30)
            && VK.isSupported(provider, "vkSubmitDebugUtilsMessageEXT", caps, 31)
        );
    }

    private static boolean check_EXT_direct_mode_display(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_direct_mode_display") && VK.checkExtension("VK_EXT_direct_mode_display",
               VK.isSupported(provider, "vkReleaseDisplayEXT", caps, 32)
        );
    }

    private static boolean check_EXT_display_surface_counter(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_display_surface_counter") && VK.checkExtension("VK_EXT_display_surface_counter",
               VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceCapabilities2EXT", caps, 33)
        );
    }

    private static boolean check_EXT_full_screen_exclusive(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_full_screen_exclusive") && VK.checkExtension("VK_EXT_full_screen_exclusive",
               VK.isSupported(provider, "vkGetPhysicalDeviceSurfacePresentModes2EXT", caps, 34)
        );
    }

    private static boolean check_EXT_headless_surface(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_headless_surface") && VK.checkExtension("VK_EXT_headless_surface",
               VK.isSupported(provider, "vkCreateHeadlessSurfaceEXT", caps, 35)
        );
    }

    private static boolean check_EXT_metal_surface(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_metal_surface") && VK.checkExtension("VK_EXT_metal_surface",
               VK.isSupported(provider, "vkCreateMetalSurfaceEXT", caps, 36)
        );
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_sample_locations") && VK.checkExtension("VK_EXT_sample_locations",
               VK.isSupported(provider, "vkGetPhysicalDeviceMultisamplePropertiesEXT", caps, 37)
        );
    }

    private static boolean check_EXT_tooling_info(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_tooling_info") && VK.checkExtension("VK_EXT_tooling_info",
               VK.isSupported(provider, "vkGetPhysicalDeviceToolPropertiesEXT", caps, 38)
        );
    }

    private static boolean check_KHR_device_group(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_device_group") && VK.checkExtension("VK_KHR_device_group",
               VK.isSupported(provider, "vkGetPhysicalDevicePresentRectanglesKHR", caps, 39, ext.contains("VK_KHR_surface"))
        );
    }

    private static boolean check_KHR_device_group_creation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_device_group_creation") && VK.checkExtension("VK_KHR_device_group_creation",
               VK.isSupported(provider, "vkEnumeratePhysicalDeviceGroupsKHR", caps, 40)
        );
    }

    private static boolean check_KHR_display(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_display") && VK.checkExtension("VK_KHR_display",
               VK.isSupported(provider, "vkGetPhysicalDeviceDisplayPropertiesKHR", caps, 41)
            && VK.isSupported(provider, "vkGetPhysicalDeviceDisplayPlanePropertiesKHR", caps, 42)
            && VK.isSupported(provider, "vkGetDisplayPlaneSupportedDisplaysKHR", caps, 43)
            && VK.isSupported(provider, "vkGetDisplayModePropertiesKHR", caps, 44)
            && VK.isSupported(provider, "vkCreateDisplayModeKHR", caps, 45)
            && VK.isSupported(provider, "vkGetDisplayPlaneCapabilitiesKHR", caps, 46)
            && VK.isSupported(provider, "vkCreateDisplayPlaneSurfaceKHR", caps, 47)
        );
    }

    private static boolean check_KHR_external_fence_capabilities(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_external_fence_capabilities") && VK.checkExtension("VK_KHR_external_fence_capabilities",
               VK.isSupported(provider, "vkGetPhysicalDeviceExternalFencePropertiesKHR", caps, 48)
        );
    }

    private static boolean check_KHR_external_memory_capabilities(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_external_memory_capabilities") && VK.checkExtension("VK_KHR_external_memory_capabilities",
               VK.isSupported(provider, "vkGetPhysicalDeviceExternalBufferPropertiesKHR", caps, 49)
        );
    }

    private static boolean check_KHR_external_semaphore_capabilities(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_external_semaphore_capabilities") && VK.checkExtension("VK_KHR_external_semaphore_capabilities",
               VK.isSupported(provider, "vkGetPhysicalDeviceExternalSemaphorePropertiesKHR", caps, 50)
        );
    }

    private static boolean check_KHR_get_display_properties2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_get_display_properties2") && VK.checkExtension("VK_KHR_get_display_properties2",
               VK.isSupported(provider, "vkGetPhysicalDeviceDisplayProperties2KHR", caps, 51)
            && VK.isSupported(provider, "vkGetPhysicalDeviceDisplayPlaneProperties2KHR", caps, 52)
            && VK.isSupported(provider, "vkGetDisplayModeProperties2KHR", caps, 53)
            && VK.isSupported(provider, "vkGetDisplayPlaneCapabilities2KHR", caps, 54)
        );
    }

    private static boolean check_KHR_get_physical_device_properties2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_get_physical_device_properties2") && VK.checkExtension("VK_KHR_get_physical_device_properties2",
               VK.isSupported(provider, "vkGetPhysicalDeviceFeatures2KHR", caps, 55)
            && VK.isSupported(provider, "vkGetPhysicalDeviceProperties2KHR", caps, 56)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFormatProperties2KHR", caps, 57)
            && VK.isSupported(provider, "vkGetPhysicalDeviceImageFormatProperties2KHR", caps, 58)
            && VK.isSupported(provider, "vkGetPhysicalDeviceQueueFamilyProperties2KHR", caps, 59)
            && VK.isSupported(provider, "vkGetPhysicalDeviceMemoryProperties2KHR", caps, 60)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSparseImageFormatProperties2KHR", caps, 61)
        );
    }

    private static boolean check_KHR_get_surface_capabilities2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_get_surface_capabilities2") && VK.checkExtension("VK_KHR_get_surface_capabilities2",
               VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceCapabilities2KHR", caps, 62)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceFormats2KHR", caps, 63)
        );
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_performance_query") && VK.checkExtension("VK_KHR_performance_query",
               VK.isSupported(provider, "vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR", caps, 64)
            && VK.isSupported(provider, "vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR", caps, 65)
        );
    }

    private static boolean check_KHR_surface(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_surface") && VK.checkExtension("VK_KHR_surface",
               VK.isSupported(provider, "vkDestroySurfaceKHR", caps, 66)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceSupportKHR", caps, 67)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceCapabilitiesKHR", caps, 68)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceFormatsKHR", caps, 69)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSurfacePresentModesKHR", caps, 70)
        );
    }

    private static boolean check_KHR_swapchain(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_swapchain") && VK.checkExtension("VK_KHR_swapchain",
               VK.isSupported(provider, "vkGetPhysicalDevicePresentRectanglesKHR", caps, 39, ext.contains("Vulkan11"))
        );
    }

    private static boolean check_KHR_wayland_surface(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_wayland_surface") && VK.checkExtension("VK_KHR_wayland_surface",
               VK.isSupported(provider, "vkCreateWaylandSurfaceKHR", caps, 71)
            && VK.isSupported(provider, "vkGetPhysicalDeviceWaylandPresentationSupportKHR", caps, 72)
        );
    }

    private static boolean check_KHR_win32_surface(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_win32_surface") && VK.checkExtension("VK_KHR_win32_surface",
               VK.isSupported(provider, "vkCreateWin32SurfaceKHR", caps, 73)
            && VK.isSupported(provider, "vkGetPhysicalDeviceWin32PresentationSupportKHR", caps, 74)
        );
    }

    private static boolean check_KHR_xlib_surface(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_xlib_surface") && VK.checkExtension("VK_KHR_xlib_surface",
               VK.isSupported(provider, "vkCreateXlibSurfaceKHR", caps, 75)
            && VK.isSupported(provider, "vkGetPhysicalDeviceXlibPresentationSupportKHR", caps, 76)
        );
    }

    private static boolean check_MVK_macos_surface(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_MVK_macos_surface") && VK.checkExtension("VK_MVK_macos_surface",
               VK.isSupported(provider, "vkCreateMacOSSurfaceMVK", caps, 77)
        );
    }

    private static boolean check_NV_cooperative_matrix(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_NV_cooperative_matrix") && VK.checkExtension("VK_NV_cooperative_matrix",
               VK.isSupported(provider, "vkGetPhysicalDeviceCooperativeMatrixPropertiesNV", caps, 78)
        );
    }

    private static boolean check_NV_coverage_reduction_mode(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_NV_coverage_reduction_mode") && VK.checkExtension("VK_NV_coverage_reduction_mode",
               VK.isSupported(provider, "vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV", caps, 79)
        );
    }

    private static boolean check_NV_external_memory_capabilities(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_NV_external_memory_capabilities") && VK.checkExtension("VK_NV_external_memory_capabilities",
               VK.isSupported(provider, "vkGetPhysicalDeviceExternalImageFormatPropertiesNV", caps, 80)
        );
    }

    private static boolean check_NVX_device_generated_commands(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        return ext.contains("VK_NVX_device_generated_commands") && VK.checkExtension("VK_NVX_device_generated_commands",
               VK.isSupported(provider, "vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX", caps, 81)
        );
    }

}
