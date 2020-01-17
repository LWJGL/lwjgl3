/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import java.util.Set;
import java.util.*;

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

        Vulkan10 = VK10.checkCapsInstance(provider, caps, ext);
        Vulkan11 = VK11.checkCapsInstance(provider, caps, ext);
        Vulkan12 = ext.contains("Vulkan12");
        VK_EXT_acquire_xlib_display = EXTAcquireXlibDisplay.checkCapsInstance(provider, caps, ext);
        EXTCalibratedTimestamps.checkCapsInstance(provider, caps, deviceExt);
        VK_EXT_debug_report = EXTDebugReport.checkCapsInstance(provider, caps, ext);
        VK_EXT_debug_utils = EXTDebugUtils.checkCapsInstance(provider, caps, ext);
        VK_EXT_direct_mode_display = EXTDirectModeDisplay.checkCapsInstance(provider, caps, ext);
        VK_EXT_display_surface_counter = EXTDisplaySurfaceCounter.checkCapsInstance(provider, caps, ext);
        EXTFullScreenExclusive.checkCapsInstance(provider, caps, deviceExt);
        VK_EXT_headless_surface = EXTHeadlessSurface.checkCapsInstance(provider, caps, ext);
        VK_EXT_metal_surface = EXTMetalSurface.checkCapsInstance(provider, caps, ext);
        EXTSampleLocations.checkCapsInstance(provider, caps, deviceExt);
        VK_EXT_swapchain_colorspace = ext.contains("VK_EXT_swapchain_colorspace");
        EXTToolingInfo.checkCapsInstance(provider, caps, deviceExt);
        VK_EXT_validation_features = ext.contains("VK_EXT_validation_features");
        VK_EXT_validation_flags = ext.contains("VK_EXT_validation_flags");
        KHRDeviceGroup.checkCapsInstance(provider, caps, deviceExt);
        VK_KHR_device_group_creation = KHRDeviceGroupCreation.checkCapsInstance(provider, caps, ext);
        VK_KHR_display = KHRDisplay.checkCapsInstance(provider, caps, ext);
        VK_KHR_external_fence_capabilities = KHRExternalFenceCapabilities.checkCapsInstance(provider, caps, ext);
        VK_KHR_external_memory_capabilities = KHRExternalMemoryCapabilities.checkCapsInstance(provider, caps, ext);
        VK_KHR_external_semaphore_capabilities = KHRExternalSemaphoreCapabilities.checkCapsInstance(provider, caps, ext);
        VK_KHR_get_display_properties2 = KHRGetDisplayProperties2.checkCapsInstance(provider, caps, ext);
        VK_KHR_get_physical_device_properties2 = KHRGetPhysicalDeviceProperties2.checkCapsInstance(provider, caps, ext);
        VK_KHR_get_surface_capabilities2 = KHRGetSurfaceCapabilities2.checkCapsInstance(provider, caps, ext);
        KHRPerformanceQuery.checkCapsInstance(provider, caps, deviceExt);
        VK_KHR_surface = KHRSurface.checkCapsInstance(provider, caps, ext);
        VK_KHR_surface_protected_capabilities = ext.contains("VK_KHR_surface_protected_capabilities");
        KHRSwapchain.checkCapsInstance(provider, caps, deviceExt);
        VK_KHR_wayland_surface = KHRWaylandSurface.checkCapsInstance(provider, caps, ext);
        VK_KHR_win32_surface = KHRWin32Surface.checkCapsInstance(provider, caps, ext);
        VK_KHR_xlib_surface = KHRXlibSurface.checkCapsInstance(provider, caps, ext);
        VK_MVK_macos_surface = MVKMacosSurface.checkCapsInstance(provider, caps, ext);
        NVCooperativeMatrix.checkCapsInstance(provider, caps, deviceExt);
        NVCoverageReductionMode.checkCapsInstance(provider, caps, deviceExt);
        VK_NV_external_memory_capabilities = NVExternalMemoryCapabilities.checkCapsInstance(provider, caps, ext);
        NVXDeviceGeneratedCommands.checkCapsInstance(provider, caps, deviceExt);

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

}
