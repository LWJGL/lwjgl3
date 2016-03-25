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
	"Will be called by the Vulkan implementation for events of interest to the application.",

	VkDebugReportFlagsEXT.IN(
		"flags",
		"indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback"
	),
	VkDebugReportObjectTypeEXT.IN(
		"objectType",
		"the type of object being used / created at the time the event was triggered."
	),
	uint64_t.IN(
		"object",
		"gives the object where the issue was detected. {@code object} may be VK10#VK_NULL_HANDLE if there is no object associated with the event."
	),
	size_t.IN(
		"location",
		"location is a component (layer, driver, loader) defined value that indicates the \"location\" of the trigger. This is an optional value."
	),
	int32_t.IN("messageCode", "a layer defined value indicating what test triggered this callback"),
	const..charUTF8_p.IN("pLayerPrefix", "abbreviation of the component making the callback"),
	const..charUTF8_p.IN("pMessage", "a null terminated string detailing the trigger conditions"),
	void_p.IN("pUserData", "the user data given when the {@code DebugReportCallback} was created"),

	returnDoc =
	"""
	a {@code VkBool32} that indicates to the calling layer if the Vulkan call should be aborted or not. Applications should always return VK10#VK_FALSE so that
	they see the same behavior with and without validation layers enabled.
	"""
) {
	documentation =
		"""
		Instances of this interface may be set to the {@code pfnCallback} member of the ##VkDebugReportCallbackCreateInfoEXT struct.

		A callback will be made for issues that match any bit set in its flags. The callback will come directly from the component that detected the event,
		unless some other layer intercepts the calls for its own purposes (filter them in different way, log to system error log, etc.) An application may
		receive multiple callbacks if multiple {@code VkDebugReportCallbackEXT} objects were created. A callback will always be executed in the same thread as
		the originating Vulkan call. A callback may be called from multiple threads simultaneously (if the application is making Vulkan calls from multiple
		threads).
		"""
	useSystemCallConvention()
	additionalCode = """
	/**
	 * Converts the specified {@link VkDebugReportCallbackEXT} argument to a String.
	 *
	 * <p>This method may only be used inside a {@code VkDebugReportCallbackEXT} invocation.</p>
	 *
	 * @param string the argument to decode
	 *
	 * @return the message as a String
	 */
	public static String getString(long string) {
		return memDecodeUTF8(string);
	}

	/** A functional interface for {@link VkDebugReportCallbackEXT}. */
	public interface SAMString {
		int invoke(int flags, int objectType, long object, long location, int messageCode, String pLayerPrefix, String pMessage, long pUserData);
	}

	/**
	 * Creates a {@link VkDebugReportCallbackEXT} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link VkDebugReportCallbackEXT} instance
	 */
	public static VkDebugReportCallbackEXT createString(final SAMString sam) {
		return new VkDebugReportCallbackEXT() {
			@Override
			public int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData) {
				return sam.invoke(flags, objectType, object, location, messageCode, getString(pLayerPrefix), getString(pMessage), pUserData);
			}
		};
	}
	"""
}

val VkDebugReportCallbackCreateInfoEXT_p = struct_p(VULKAN_PACKAGE, "VkDebugReportCallbackCreateInfoEXT") {
	documentation = ""

    VkStructureType.member("sType", "")
    pNext()
    VkDebugReportFlagsEXT.member("flags", "")
    PFN_vkDebugReportCallbackEXT.member("pfnCallback", "")
    nullable..voidptr.member("pUserData", "")
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

val VkDisplayPropertiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayPropertiesKHR", mutable = false) {
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

val VkDisplayModePropertiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayModePropertiesKHR", mutable = false) {
	documentation = ""
	
	VkDisplayModeKHR.member("displayMode", "")
	VkDisplayModeParametersKHR.member("parameters", "")
}

val VkDisplayModeCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayModeCreateInfoKHR") {
	documentation = ""
	
	VkStructureType.member("sType", "")
	pNext()
	VkDisplayModeCreateFlagsKHR.member("flags", "")
	VkDisplayModeParametersKHR.member("parameters", "")
}

val VkDisplayPlaneCapabilitiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayPlaneCapabilitiesKHR", mutable = false) {
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

val VkDisplayPlanePropertiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayPlanePropertiesKHR", mutable = false) {
	documentation = ""
	
	VkDisplayKHR.member("currentDisplay", "")
	uint32_t.member("currentStackIndex", "")
}

val VkDisplaySurfaceCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplaySurfaceCreateInfoKHR") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
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
	pNext()
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
	pNext()
    VkSwapchainCreateFlagsKHR.member("flags", "")
    VkSurfaceKHR.member("surface", "")
    uint32_t.member("minImageCount", "")
    VkFormat.member("imageFormat", "")
    VkColorSpaceKHR.member("imageColorSpace", "")
    VkExtent2D.member("imageExtent", "")
    uint32_t.member("imageArrayLayers", "")
    VkImageUsageFlags.member("imageUsage", "")
    VkSharingMode.member("imageSharingMode", "")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t.member("queueFamilyIndexCount", "")
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
	pNext()
    AutoSize("pWaitSemaphores", optional = true)..uint32_t.member("waitSemaphoreCount", "")
	VkSemaphore.const_p.member("pWaitSemaphores", "")
    AutoSize("pSwapchains", "pImageIndices", "pResults")..uint32_t.member("swapchainCount", "")
    VkSwapchainKHR.const_p.member("pSwapchains", "")
    uint32_t.const_p.member("pImageIndices", "")
	nullable..VkResult.p.member("pResults", "")
}

// KHR_win32_surface

val VkWin32SurfaceCreateFlagsKHR = typedef(VkFlags, "VkWin32SurfaceCreateFlagsKHR")

val VkWin32SurfaceCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkWin32SurfaceCreateInfoKHR") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkWin32SurfaceCreateFlagsKHR.member("flags", "")
	HINSTANCE.member("hinstance", "")
	HWND.member("hwnd", "")
}

// KHR_xlib_surface

val VkXlibSurfaceCreateFlagsKHR = typedef(VkFlags, "VkXlibSurfaceCreateFlagsKHR");

val VkXlibSurfaceCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkXlibSurfaceCreateInfoKHR") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkXlibSurfaceCreateFlagsKHR.member("flags", "")
	Display_p.member("dpy", "")
	Window.member("window", "")
}