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

        Map<String, Long> caps = new HashMap<>(82);

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

        vkDestroyInstance = VK.get(caps, "vkDestroyInstance");
        vkEnumeratePhysicalDevices = VK.get(caps, "vkEnumeratePhysicalDevices");
        vkGetPhysicalDeviceFeatures = VK.get(caps, "vkGetPhysicalDeviceFeatures");
        vkGetPhysicalDeviceFormatProperties = VK.get(caps, "vkGetPhysicalDeviceFormatProperties");
        vkGetPhysicalDeviceImageFormatProperties = VK.get(caps, "vkGetPhysicalDeviceImageFormatProperties");
        vkGetPhysicalDeviceProperties = VK.get(caps, "vkGetPhysicalDeviceProperties");
        vkGetPhysicalDeviceQueueFamilyProperties = VK.get(caps, "vkGetPhysicalDeviceQueueFamilyProperties");
        vkGetPhysicalDeviceMemoryProperties = VK.get(caps, "vkGetPhysicalDeviceMemoryProperties");
        vkCreateDevice = VK.get(caps, "vkCreateDevice");
        vkEnumerateDeviceExtensionProperties = VK.get(caps, "vkEnumerateDeviceExtensionProperties");
        vkEnumerateDeviceLayerProperties = VK.get(caps, "vkEnumerateDeviceLayerProperties");
        vkGetPhysicalDeviceSparseImageFormatProperties = VK.get(caps, "vkGetPhysicalDeviceSparseImageFormatProperties");
        vkEnumeratePhysicalDeviceGroups = VK.get(caps, "vkEnumeratePhysicalDeviceGroups");
        vkGetPhysicalDeviceFeatures2 = VK.get(caps, "vkGetPhysicalDeviceFeatures2");
        vkGetPhysicalDeviceProperties2 = VK.get(caps, "vkGetPhysicalDeviceProperties2");
        vkGetPhysicalDeviceFormatProperties2 = VK.get(caps, "vkGetPhysicalDeviceFormatProperties2");
        vkGetPhysicalDeviceImageFormatProperties2 = VK.get(caps, "vkGetPhysicalDeviceImageFormatProperties2");
        vkGetPhysicalDeviceQueueFamilyProperties2 = VK.get(caps, "vkGetPhysicalDeviceQueueFamilyProperties2");
        vkGetPhysicalDeviceMemoryProperties2 = VK.get(caps, "vkGetPhysicalDeviceMemoryProperties2");
        vkGetPhysicalDeviceSparseImageFormatProperties2 = VK.get(caps, "vkGetPhysicalDeviceSparseImageFormatProperties2");
        vkGetPhysicalDeviceExternalBufferProperties = VK.get(caps, "vkGetPhysicalDeviceExternalBufferProperties");
        vkGetPhysicalDeviceExternalFenceProperties = VK.get(caps, "vkGetPhysicalDeviceExternalFenceProperties");
        vkGetPhysicalDeviceExternalSemaphoreProperties = VK.get(caps, "vkGetPhysicalDeviceExternalSemaphoreProperties");
        vkAcquireXlibDisplayEXT = VK.get(caps, "vkAcquireXlibDisplayEXT");
        vkGetRandROutputDisplayEXT = VK.get(caps, "vkGetRandROutputDisplayEXT");
        vkGetPhysicalDeviceCalibrateableTimeDomainsEXT = VK.get(caps, "vkGetPhysicalDeviceCalibrateableTimeDomainsEXT");
        vkCreateDebugReportCallbackEXT = VK.get(caps, "vkCreateDebugReportCallbackEXT");
        vkDestroyDebugReportCallbackEXT = VK.get(caps, "vkDestroyDebugReportCallbackEXT");
        vkDebugReportMessageEXT = VK.get(caps, "vkDebugReportMessageEXT");
        vkCreateDebugUtilsMessengerEXT = VK.get(caps, "vkCreateDebugUtilsMessengerEXT");
        vkDestroyDebugUtilsMessengerEXT = VK.get(caps, "vkDestroyDebugUtilsMessengerEXT");
        vkSubmitDebugUtilsMessageEXT = VK.get(caps, "vkSubmitDebugUtilsMessageEXT");
        vkReleaseDisplayEXT = VK.get(caps, "vkReleaseDisplayEXT");
        vkGetPhysicalDeviceSurfaceCapabilities2EXT = VK.get(caps, "vkGetPhysicalDeviceSurfaceCapabilities2EXT");
        vkGetPhysicalDeviceSurfacePresentModes2EXT = VK.get(caps, "vkGetPhysicalDeviceSurfacePresentModes2EXT");
        vkCreateHeadlessSurfaceEXT = VK.get(caps, "vkCreateHeadlessSurfaceEXT");
        vkCreateMetalSurfaceEXT = VK.get(caps, "vkCreateMetalSurfaceEXT");
        vkGetPhysicalDeviceMultisamplePropertiesEXT = VK.get(caps, "vkGetPhysicalDeviceMultisamplePropertiesEXT");
        vkGetPhysicalDeviceToolPropertiesEXT = VK.get(caps, "vkGetPhysicalDeviceToolPropertiesEXT");
        vkGetPhysicalDevicePresentRectanglesKHR = VK.get(caps, "vkGetPhysicalDevicePresentRectanglesKHR");
        vkEnumeratePhysicalDeviceGroupsKHR = VK.get(caps, "vkEnumeratePhysicalDeviceGroupsKHR");
        vkGetPhysicalDeviceDisplayPropertiesKHR = VK.get(caps, "vkGetPhysicalDeviceDisplayPropertiesKHR");
        vkGetPhysicalDeviceDisplayPlanePropertiesKHR = VK.get(caps, "vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
        vkGetDisplayPlaneSupportedDisplaysKHR = VK.get(caps, "vkGetDisplayPlaneSupportedDisplaysKHR");
        vkGetDisplayModePropertiesKHR = VK.get(caps, "vkGetDisplayModePropertiesKHR");
        vkCreateDisplayModeKHR = VK.get(caps, "vkCreateDisplayModeKHR");
        vkGetDisplayPlaneCapabilitiesKHR = VK.get(caps, "vkGetDisplayPlaneCapabilitiesKHR");
        vkCreateDisplayPlaneSurfaceKHR = VK.get(caps, "vkCreateDisplayPlaneSurfaceKHR");
        vkGetPhysicalDeviceExternalFencePropertiesKHR = VK.get(caps, "vkGetPhysicalDeviceExternalFencePropertiesKHR");
        vkGetPhysicalDeviceExternalBufferPropertiesKHR = VK.get(caps, "vkGetPhysicalDeviceExternalBufferPropertiesKHR");
        vkGetPhysicalDeviceExternalSemaphorePropertiesKHR = VK.get(caps, "vkGetPhysicalDeviceExternalSemaphorePropertiesKHR");
        vkGetPhysicalDeviceDisplayProperties2KHR = VK.get(caps, "vkGetPhysicalDeviceDisplayProperties2KHR");
        vkGetPhysicalDeviceDisplayPlaneProperties2KHR = VK.get(caps, "vkGetPhysicalDeviceDisplayPlaneProperties2KHR");
        vkGetDisplayModeProperties2KHR = VK.get(caps, "vkGetDisplayModeProperties2KHR");
        vkGetDisplayPlaneCapabilities2KHR = VK.get(caps, "vkGetDisplayPlaneCapabilities2KHR");
        vkGetPhysicalDeviceFeatures2KHR = VK.get(caps, "vkGetPhysicalDeviceFeatures2KHR");
        vkGetPhysicalDeviceProperties2KHR = VK.get(caps, "vkGetPhysicalDeviceProperties2KHR");
        vkGetPhysicalDeviceFormatProperties2KHR = VK.get(caps, "vkGetPhysicalDeviceFormatProperties2KHR");
        vkGetPhysicalDeviceImageFormatProperties2KHR = VK.get(caps, "vkGetPhysicalDeviceImageFormatProperties2KHR");
        vkGetPhysicalDeviceQueueFamilyProperties2KHR = VK.get(caps, "vkGetPhysicalDeviceQueueFamilyProperties2KHR");
        vkGetPhysicalDeviceMemoryProperties2KHR = VK.get(caps, "vkGetPhysicalDeviceMemoryProperties2KHR");
        vkGetPhysicalDeviceSparseImageFormatProperties2KHR = VK.get(caps, "vkGetPhysicalDeviceSparseImageFormatProperties2KHR");
        vkGetPhysicalDeviceSurfaceCapabilities2KHR = VK.get(caps, "vkGetPhysicalDeviceSurfaceCapabilities2KHR");
        vkGetPhysicalDeviceSurfaceFormats2KHR = VK.get(caps, "vkGetPhysicalDeviceSurfaceFormats2KHR");
        vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = VK.get(caps, "vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR");
        vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = VK.get(caps, "vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR");
        vkDestroySurfaceKHR = VK.get(caps, "vkDestroySurfaceKHR");
        vkGetPhysicalDeviceSurfaceSupportKHR = VK.get(caps, "vkGetPhysicalDeviceSurfaceSupportKHR");
        vkGetPhysicalDeviceSurfaceCapabilitiesKHR = VK.get(caps, "vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
        vkGetPhysicalDeviceSurfaceFormatsKHR = VK.get(caps, "vkGetPhysicalDeviceSurfaceFormatsKHR");
        vkGetPhysicalDeviceSurfacePresentModesKHR = VK.get(caps, "vkGetPhysicalDeviceSurfacePresentModesKHR");
        vkCreateWaylandSurfaceKHR = VK.get(caps, "vkCreateWaylandSurfaceKHR");
        vkGetPhysicalDeviceWaylandPresentationSupportKHR = VK.get(caps, "vkGetPhysicalDeviceWaylandPresentationSupportKHR");
        vkCreateWin32SurfaceKHR = VK.get(caps, "vkCreateWin32SurfaceKHR");
        vkGetPhysicalDeviceWin32PresentationSupportKHR = VK.get(caps, "vkGetPhysicalDeviceWin32PresentationSupportKHR");
        vkCreateXlibSurfaceKHR = VK.get(caps, "vkCreateXlibSurfaceKHR");
        vkGetPhysicalDeviceXlibPresentationSupportKHR = VK.get(caps, "vkGetPhysicalDeviceXlibPresentationSupportKHR");
        vkCreateMacOSSurfaceMVK = VK.get(caps, "vkCreateMacOSSurfaceMVK");
        vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = VK.get(caps, "vkGetPhysicalDeviceCooperativeMatrixPropertiesNV");
        vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = VK.get(caps, "vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV");
        vkGetPhysicalDeviceExternalImageFormatPropertiesNV = VK.get(caps, "vkGetPhysicalDeviceExternalImageFormatPropertiesNV");
        vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX = VK.get(caps, "vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX");
    }

    private static boolean check_VK10(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("Vulkan10") && VK.checkExtension("Vulkan10",
               VK.isSupported(provider, "vkDestroyInstance", caps)
            && VK.isSupported(provider, "vkEnumeratePhysicalDevices", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFeatures", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFormatProperties", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceImageFormatProperties", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceProperties", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceQueueFamilyProperties", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceMemoryProperties", caps)
            && VK.isSupported(provider, "vkCreateDevice", caps)
            && VK.isSupported(provider, "vkEnumerateDeviceExtensionProperties", caps)
            && VK.isSupported(provider, "vkEnumerateDeviceLayerProperties", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSparseImageFormatProperties", caps)
        );
    }

    private static boolean check_VK11(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("Vulkan11") && VK.checkExtension("Vulkan11",
               VK.isSupported(provider, "vkEnumeratePhysicalDeviceGroups", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFeatures2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFormatProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceImageFormatProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceQueueFamilyProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceMemoryProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSparseImageFormatProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceExternalBufferProperties", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceExternalFenceProperties", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceExternalSemaphoreProperties", caps)
        );
    }

    private static boolean check_EXT_acquire_xlib_display(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_acquire_xlib_display") && VK.checkExtension("VK_EXT_acquire_xlib_display",
               VK.isSupported(provider, "vkAcquireXlibDisplayEXT", caps)
            && VK.isSupported(provider, "vkGetRandROutputDisplayEXT", caps)
        );
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_calibrated_timestamps") && VK.checkExtension("VK_EXT_calibrated_timestamps",
               VK.isSupported(provider, "vkGetPhysicalDeviceCalibrateableTimeDomainsEXT", caps)
        );
    }

    private static boolean check_EXT_debug_report(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_debug_report") && VK.checkExtension("VK_EXT_debug_report",
               VK.isSupported(provider, "vkCreateDebugReportCallbackEXT", caps)
            && VK.isSupported(provider, "vkDestroyDebugReportCallbackEXT", caps)
            && VK.isSupported(provider, "vkDebugReportMessageEXT", caps)
        );
    }

    private static boolean check_EXT_debug_utils(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_debug_utils") && VK.checkExtension("VK_EXT_debug_utils",
               VK.isSupported(provider, "vkCreateDebugUtilsMessengerEXT", caps)
            && VK.isSupported(provider, "vkDestroyDebugUtilsMessengerEXT", caps)
            && VK.isSupported(provider, "vkSubmitDebugUtilsMessageEXT", caps)
        );
    }

    private static boolean check_EXT_direct_mode_display(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_direct_mode_display") && VK.checkExtension("VK_EXT_direct_mode_display",
               VK.isSupported(provider, "vkReleaseDisplayEXT", caps)
        );
    }

    private static boolean check_EXT_display_surface_counter(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_display_surface_counter") && VK.checkExtension("VK_EXT_display_surface_counter",
               VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceCapabilities2EXT", caps)
        );
    }

    private static boolean check_EXT_full_screen_exclusive(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_full_screen_exclusive") && VK.checkExtension("VK_EXT_full_screen_exclusive",
               VK.isSupported(provider, "vkGetPhysicalDeviceSurfacePresentModes2EXT", caps)
        );
    }

    private static boolean check_EXT_headless_surface(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_headless_surface") && VK.checkExtension("VK_EXT_headless_surface",
               VK.isSupported(provider, "vkCreateHeadlessSurfaceEXT", caps)
        );
    }

    private static boolean check_EXT_metal_surface(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_metal_surface") && VK.checkExtension("VK_EXT_metal_surface",
               VK.isSupported(provider, "vkCreateMetalSurfaceEXT", caps)
        );
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_sample_locations") && VK.checkExtension("VK_EXT_sample_locations",
               VK.isSupported(provider, "vkGetPhysicalDeviceMultisamplePropertiesEXT", caps)
        );
    }

    private static boolean check_EXT_tooling_info(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_tooling_info") && VK.checkExtension("VK_EXT_tooling_info",
               VK.isSupported(provider, "vkGetPhysicalDeviceToolPropertiesEXT", caps)
        );
    }

    private static boolean check_KHR_device_group(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_device_group") && VK.checkExtension("VK_KHR_device_group",
               VK.isSupported(provider, "vkGetPhysicalDevicePresentRectanglesKHR", caps, ext.contains("VK_KHR_surface"))
        );
    }

    private static boolean check_KHR_device_group_creation(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_device_group_creation") && VK.checkExtension("VK_KHR_device_group_creation",
               VK.isSupported(provider, "vkEnumeratePhysicalDeviceGroupsKHR", caps)
        );
    }

    private static boolean check_KHR_display(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_display") && VK.checkExtension("VK_KHR_display",
               VK.isSupported(provider, "vkGetPhysicalDeviceDisplayPropertiesKHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceDisplayPlanePropertiesKHR", caps)
            && VK.isSupported(provider, "vkGetDisplayPlaneSupportedDisplaysKHR", caps)
            && VK.isSupported(provider, "vkGetDisplayModePropertiesKHR", caps)
            && VK.isSupported(provider, "vkCreateDisplayModeKHR", caps)
            && VK.isSupported(provider, "vkGetDisplayPlaneCapabilitiesKHR", caps)
            && VK.isSupported(provider, "vkCreateDisplayPlaneSurfaceKHR", caps)
        );
    }

    private static boolean check_KHR_external_fence_capabilities(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_external_fence_capabilities") && VK.checkExtension("VK_KHR_external_fence_capabilities",
               VK.isSupported(provider, "vkGetPhysicalDeviceExternalFencePropertiesKHR", caps)
        );
    }

    private static boolean check_KHR_external_memory_capabilities(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_external_memory_capabilities") && VK.checkExtension("VK_KHR_external_memory_capabilities",
               VK.isSupported(provider, "vkGetPhysicalDeviceExternalBufferPropertiesKHR", caps)
        );
    }

    private static boolean check_KHR_external_semaphore_capabilities(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_external_semaphore_capabilities") && VK.checkExtension("VK_KHR_external_semaphore_capabilities",
               VK.isSupported(provider, "vkGetPhysicalDeviceExternalSemaphorePropertiesKHR", caps)
        );
    }

    private static boolean check_KHR_get_display_properties2(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_get_display_properties2") && VK.checkExtension("VK_KHR_get_display_properties2",
               VK.isSupported(provider, "vkGetPhysicalDeviceDisplayProperties2KHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceDisplayPlaneProperties2KHR", caps)
            && VK.isSupported(provider, "vkGetDisplayModeProperties2KHR", caps)
            && VK.isSupported(provider, "vkGetDisplayPlaneCapabilities2KHR", caps)
        );
    }

    private static boolean check_KHR_get_physical_device_properties2(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_get_physical_device_properties2") && VK.checkExtension("VK_KHR_get_physical_device_properties2",
               VK.isSupported(provider, "vkGetPhysicalDeviceFeatures2KHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceProperties2KHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFormatProperties2KHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceImageFormatProperties2KHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceQueueFamilyProperties2KHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceMemoryProperties2KHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSparseImageFormatProperties2KHR", caps)
        );
    }

    private static boolean check_KHR_get_surface_capabilities2(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_get_surface_capabilities2") && VK.checkExtension("VK_KHR_get_surface_capabilities2",
               VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceCapabilities2KHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceFormats2KHR", caps)
        );
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_performance_query") && VK.checkExtension("VK_KHR_performance_query",
               VK.isSupported(provider, "vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR", caps)
        );
    }

    private static boolean check_KHR_surface(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_surface") && VK.checkExtension("VK_KHR_surface",
               VK.isSupported(provider, "vkDestroySurfaceKHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceSupportKHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceCapabilitiesKHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSurfaceFormatsKHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSurfacePresentModesKHR", caps)
        );
    }

    private static boolean check_KHR_swapchain(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_swapchain") && VK.checkExtension("VK_KHR_swapchain",
               VK.isSupported(provider, "vkGetPhysicalDevicePresentRectanglesKHR", caps, ext.contains("Vulkan11"))
        );
    }

    private static boolean check_KHR_wayland_surface(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_wayland_surface") && VK.checkExtension("VK_KHR_wayland_surface",
               VK.isSupported(provider, "vkCreateWaylandSurfaceKHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceWaylandPresentationSupportKHR", caps)
        );
    }

    private static boolean check_KHR_win32_surface(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_win32_surface") && VK.checkExtension("VK_KHR_win32_surface",
               VK.isSupported(provider, "vkCreateWin32SurfaceKHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceWin32PresentationSupportKHR", caps)
        );
    }

    private static boolean check_KHR_xlib_surface(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_xlib_surface") && VK.checkExtension("VK_KHR_xlib_surface",
               VK.isSupported(provider, "vkCreateXlibSurfaceKHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceXlibPresentationSupportKHR", caps)
        );
    }

    private static boolean check_MVK_macos_surface(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_MVK_macos_surface") && VK.checkExtension("VK_MVK_macos_surface",
               VK.isSupported(provider, "vkCreateMacOSSurfaceMVK", caps)
        );
    }

    private static boolean check_NV_cooperative_matrix(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_NV_cooperative_matrix") && VK.checkExtension("VK_NV_cooperative_matrix",
               VK.isSupported(provider, "vkGetPhysicalDeviceCooperativeMatrixPropertiesNV", caps)
        );
    }

    private static boolean check_NV_coverage_reduction_mode(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_NV_coverage_reduction_mode") && VK.checkExtension("VK_NV_coverage_reduction_mode",
               VK.isSupported(provider, "vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV", caps)
        );
    }

    private static boolean check_NV_external_memory_capabilities(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_NV_external_memory_capabilities") && VK.checkExtension("VK_NV_external_memory_capabilities",
               VK.isSupported(provider, "vkGetPhysicalDeviceExternalImageFormatPropertiesNV", caps)
        );
    }

    private static boolean check_NVX_device_generated_commands(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_NVX_device_generated_commands") && VK.checkExtension("VK_NVX_device_generated_commands",
               VK.isSupported(provider, "vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX", caps)
        );
    }

}
