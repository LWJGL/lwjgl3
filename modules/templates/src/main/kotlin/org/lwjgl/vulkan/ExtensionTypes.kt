/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*
import org.lwjgl.system.linux.Display_p
import org.lwjgl.system.linux.Window
import org.lwjgl.system.windows.HINSTANCE
import org.lwjgl.system.windows.HWND

// EXT_debug_report

val VkDebugReportCallbackEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDebugReportCallbackEXT")

val VkDebugReportObjectTypeEXT = "VkDebugReportObjectTypeEXT".enumType
val VkDebugReportFlagsEXT = typedef(VkFlags, "VkDebugReportFlagsEXT")

val PFN_vkDebugReportCallbackEXT = "PFN_vkDebugReportCallbackEXT".callback(
	VULKAN_PACKAGE, VkBool32, "VkDebugReportCallbackEXT",
	"",

	VkDebugReportFlagsEXT.IN("flags", ""),
	VkDebugReportObjectTypeEXT.IN("objectType", ""),
	uint64_t.IN("object", ""),
	size_t.IN("location", ""),
	int32_t.IN("messageCode", ""),
	const..charUTF8_p.IN("pLayerPrefix", ""),
	const..charUTF8_p.IN("pMessage", ""),
	void_p.IN("pUserData", "")
) {
	documentation = ""
	useSystemCallConvention()
}

val VkDebugReportCallbackCreateInfoEXT_p = struct_p(VULKAN_PACKAGE, "VkDebugReportCallbackCreateInfoEXT") {
	documentation = ""

    VkStructureType.member("sType", "")
    const_void_p.member("pNext", "")
    VkDebugReportFlagsEXT.member("flags", "")
    PFN_vkDebugReportCallbackEXT.member("pfnCallback", "")
    voidptr.member("pUserData", "")
}

// KHR_surface (must be above KHR_display)

val VkSurfaceKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSurfaceKHR")
val VkSurfaceKHR_p = VkSurfaceKHR.p

val VkColorSpaceKHR = "VkColorSpaceKHR".enumType
val VkPresentModeKHR = "VkPresentModeKHR".enumType
val VkPresentModeKHR_p = VkPresentModeKHR.p
val VkSurfaceTransformFlagBitsKHR = "VkSurfaceTransformFlagBitsKHR".enumType

val VkSurfaceTransformFlagsKHR = typedef(VkFlags, "VkSurfaceTransformFlagsKHR")
val VkCompositeAlphaFlagsKHR = typedef(VkFlags, "VkCompositeAlphaFlagsKHR")

val VkSurfaceCapabilitiesKHR_p = struct_p(VULKAN_PACKAGE, "VkSurfaceCapabilitiesKHR", mutable = false) {
	documentation = ""

	uint32_t.member("minImageCount", "")
	uint32_t.member("maxImageCount", "")
	VkExtent2D.member("currentExtent", "")
	VkExtent2D.member("minImageExtent", "")
	VkExtent2D.member("maxImageExtent", "")
	uint32_t.member("maxImageArrayLayers", "")
	VkSurfaceTransformFlagsKHR.member("supportedTransforms", "")
	VkSurfaceTransformFlagBitsKHR.member("currentTransform", "")
	VkCompositeAlphaFlagsKHR.member("supportedCompositeAlpha", "")
	VkImageUsageFlags.member("supportedUsageFlags", "")
}

val VkSurfaceFormatKHR_p = struct_p(VULKAN_PACKAGE, "VkSurfaceFormatKHR", mutable = false) {
	VkFormat.member("format", "")
	VkColorSpaceKHR.member("colorSpace", "")
}

// KHR_display

val VkDisplayKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayKHR")
val VkDisplayModeKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayModeKHR")

val VkDisplayPlaneAlphaFlagBitsKHR = "VkDisplayPlaneAlphaFlagBitsKHR".enumType
val VkDisplayModeCreateFlagsKHR = typedef(VkFlags, "VkDisplayModeCreateFlagsKHR")
val VkDisplayPlaneAlphaFlagsKHR = typedef(VkFlags, "VkDisplayPlaneAlphaFlagsKHR")
val VkDisplaySurfaceCreateFlagsKHR = typedef(VkFlags, "VkDisplaySurfaceCreateFlagsKHR")

val VkDisplayPropertiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayPropertiesKHR") {
	documentation = ""
	
	VkDisplayKHR.member("display", "")
	const_charUTF8_p.member("displayName", "")
	VkExtent2D.member("physicalDimensions", "")
	VkExtent2D.member("physicalResolution", "")
	VkSurfaceTransformFlagsKHR.member("supportedTransforms", "")
	VkBool32.member("planeReorderPossible", "")
	VkBool32.member("persistentContent", "")
}

val VkDisplayModeParametersKHR = struct(VULKAN_PACKAGE, "VkDisplayModeParametersKHR") {
	documentation = ""
	
	VkExtent2D.member("visibleRegion", "")
	uint32_t.member("refreshRate", "")
}.nativeType

val VkDisplayModePropertiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayModePropertiesKHR") {
	documentation = ""
	
	VkDisplayModeKHR.member("displayMode", "")
	VkDisplayModeParametersKHR.member("parameters", "")
}

val VkDisplayModeCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayModeCreateInfoKHR") {
	documentation = ""
	
	VkStructureType.member("sType", "")
	const_void_p.member("pNext", "")
	VkDisplayModeCreateFlagsKHR.member("flags", "")
	VkDisplayModeParametersKHR.member("parameters", "")
}

val VkDisplayPlaneCapabilitiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayPlaneCapabilitiesKHR") {
	documentation = ""
	
	VkDisplayPlaneAlphaFlagsKHR.member("supportedAlpha", "")
	VkOffset2D.member("minSrcPosition", "")
	VkOffset2D.member("maxSrcPosition", "")
	VkExtent2D.member("minSrcExtent", "")
	VkExtent2D.member("maxSrcExtent", "")
	VkOffset2D.member("minDstPosition", "")
	VkOffset2D.member("maxDstPosition", "")
	VkExtent2D.member("minDstExtent", "")
	VkExtent2D.member("maxDstExtent", "")
}

val VkDisplayPlanePropertiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayPlanePropertiesKHR") {
	documentation = ""
	
	VkDisplayKHR.member("currentDisplay", "")
	uint32_t.member("currentStackIndex", "")
}

val VkDisplaySurfaceCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplaySurfaceCreateInfoKHR") {
	documentation = ""

	VkStructureType.member("sType", "")
	const_void_p.member("pNext", "")
	VkDisplaySurfaceCreateFlagsKHR.member("flags", "")
	VkDisplayModeKHR.member("displayMode", "")
	uint32_t.member("planeIndex", "")
	uint32_t.member("planeStackIndex", "")
	VkSurfaceTransformFlagBitsKHR.member("transform", "")
	float.member("globalAlpha", "")
	VkDisplayPlaneAlphaFlagBitsKHR.member("alphaMode", "")
	VkExtent2D.member("imageExtent", "")
}

// KHR_display_swapchain

val VkDisplayPresentInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayPresentInfoKHR") {
	documentation = ""
	
	VkStructureType.member("sType", "")
	const_void_p.member("pNext", "")
	VkRect2D.member("srcRect", "")
	VkRect2D.member("dstRect", "")
	VkBool32.member("persistent", "")
}

// KHR_swapchain

val VkSwapchainKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSwapchainKHR")

val VkSwapchainCreateFlagsKHR = typedef(VkFlags, "VkSwapchainCreateFlagsKHR")
val VkCompositeAlphaFlagBitsKHR = "VkCompositeAlphaFlagBitsKHR".enumType

val VkSwapchainCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkSwapchainCreateInfoKHR") {
	documentation = ""

    VkStructureType.member("sType", "")
    const_void_p.member("pNext", "")
    VkSwapchainCreateFlagsKHR.member("flags", "")
    VkSurfaceKHR.member("surface", "")
    uint32_t.member("minImageCount", "")
    VkFormat.member("imageFormat", "")
    VkColorSpaceKHR.member("imageColorSpace", "")
    VkExtent2D.member("imageExtent", "")
    uint32_t.member("imageArrayLayers", "")
    VkImageUsageFlags.member("imageUsage", "")
    VkSharingMode.member("imageSharingMode", "")
    AutoSize("pQueueFamilyIndices")..uint32_t.member("queueFamilyIndexCount", "")
    uint32_t.const_p.member("pQueueFamilyIndices", "")
    VkSurfaceTransformFlagBitsKHR.member("preTransform", "")
    VkCompositeAlphaFlagBitsKHR.member("compositeAlpha", "")
    VkPresentModeKHR.member("presentMode", "")
    VkBool32.member("clipped", "")
    VkSwapchainKHR.member("oldSwapchain", "")
}

val VkPresentInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkPresentInfoKHR") {
	documentation = ""

    VkStructureType.member("sType", "")
    const_void_p.member("pNext", "")
    AutoSize("pWaitSemaphores")..uint32_t.member("waitSemaphoreCount", "")
    VkSemaphore.const_p.member("pWaitSemaphores", "")
    AutoSize("pSwapchains", "pImageIndices", "pResults")..uint32_t.member("swapchainCount", "")
    VkSwapchainKHR.const_p.member("pSwapchains", "")
    uint32_t.const_p.member("pImageIndices", "")
    VkResult.p.member("pResults", "")
}

// KHR_win32_surface

val VkWin32SurfaceCreateFlagsKHR = typedef(VkFlags, "VkWin32SurfaceCreateFlagsKHR")

val VkWin32SurfaceCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkWin32SurfaceCreateInfoKHR") {
	documentation = ""

	VkStructureType.member("sType", "")
	const_void_p.member("pNext", "")
	VkWin32SurfaceCreateFlagsKHR.member("flags", "")
	HINSTANCE.member("hinstance", "")
	HWND.member("hwnd", "")
}

// KHR_xlib_surface

val VkXlibSurfaceCreateFlagsKHR = typedef(VkFlags, "VkXlibSurfaceCreateFlagsKHR");

val VkXlibSurfaceCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkXlibSurfaceCreateInfoKHR") {
	documentation = ""

	VkStructureType.member("sType", "")
	const_void_p.member("pNext", "")
	VkXlibSurfaceCreateFlagsKHR.member("flags", "")
	Display_p.member("dpy", "")
	Window.member("window", "")
}