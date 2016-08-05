/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_win32_surface = "KHRWin32Surface".nativeClassVK("KHR_win32_surface", postfix = KHR) {
	documentation =
		"""
		The {@code VK_KHR_win32_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the
		{@code VK_KHR_surface} extension) that refers to a Win32 {@code HWND}, as well as a query to determine support for rendering to the windows desktop.
		"""

	IntConstant(
		"The extension specification version.",

		"KHR_WIN32_SURFACE_SPEC_VERSION".."5"
	)

	StringConstant(
		"The extension name.",

		"KHR_WIN32_SURFACE_EXTENSION_NAME".."VK_KHR_win32_surface"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR".."1000009000"
	)

	VkResult(
		"CreateWin32SurfaceKHR",
		"""
		Creates a {@code VkSurfaceKHR} object for a Win32 window.

		${ValidityProtos.vkCreateWin32SurfaceKHR}

		With Win32, {@code minImageExtent}, {@code maxImageExtent}, and {@code currentExtent} are the window size. Therefore, a swapchain’s {@code imageExtent}
		$must match the window’s size.
		""",

		VkInstance.IN("instance", "the instance to associate the surface with"),
		const..VkWin32SurfaceCreateInfoKHR_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkWin32SurfaceCreateInfoKHR structure containing parameters affecting the creation of the surface object"
		),
		pAllocator,
		Check(1)..VkSurfaceKHR_p.OUT("pSurface", "points to a {@code VkSurfaceKHR} handle in which the created surface object is returned")
	)

	VkBool32(
		"GetPhysicalDeviceWin32PresentationSupportKHR",
		"""
		Determines whether a queue family of a physical device supports presentation to the Microsoft Windows desktop.

		This platform-specific function $can be called prior to creating a surface.

		${ValidityProtos.vkGetPhysicalDeviceWin32PresentationSupportKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device"),
		uint32_t.IN("queueFamilyIndex", "the queue family index")
	)
}