/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
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

		"KHR_WIN32_SURFACE_SPEC_VERSION"..5
	)

	StringConstant(
		"The extension name.",

		"KHR_WIN32_SURFACE_EXTENSION_NAME".."VK_KHR_win32_surface"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR" expr "1000009000"
	)

	VkResult(
		"CreateWin32SurfaceKHR",
		"Creates a {@code VkSurfaceKHR} object for a Win32 window.",

		VkInstance.IN("instance", "the {@code VkInstance} to associate the surface"),
		const..VkWin32SurfaceCreateInfoKHR_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkWin32SurfaceCreateInfoKHR structure containing the parameters affecting the creation of the surface object"
		),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "the allocator used for host memory allocated for the surface object"),
		Check(1)..VkSurfaceKHR_p.OUT("pSurface", "the resulting surface object handle is returned in {@code pSurface}")
	)

	VkBool32(
		"GetPhysicalDeviceWin32PresentationSupportKHR",
		"Queries physical device for presentation to Windows desktop.",

		VkPhysicalDevice.IN("physicalDevice", "a physical device handle"),
		uint32_t.IN("queueFamilyIndex", "index to a queue family")
	)
}