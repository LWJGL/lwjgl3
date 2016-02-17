/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.Display_p
import org.lwjgl.system.linux.VisualID
import org.lwjgl.vulkan.*

val KHR_xlib_surface = "KHRXlibSurface".nativeClassVK("KHR_xlib_surface", postfix = KHR) {
	documentation =
		"""
		The {@code VK_KHR_xlib_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the
		{@code VK_KHR_surface} extension) that refers to an X11 window, using the Xlib client-side library, as well as a query to determine support for
		rendering via Xlib.
		"""

	IntConstant(
		"The extension specification version.",

		"KHR_XLIB_SURFACE_SPEC_VERSION"..6
	)

	StringConstant(
		"The extension name.",

		"KHR_XLIB_SURFACE_EXTENSION_NAME".."VK_KHR_xlib_surface"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR" expr "1000004000"
	)

	VkResult(
		"CreateXlibSurfaceKHR",
		"Creates a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library.",

		VkInstance.IN("instance", "the {@code VkInstance} to associate the surface."),
		const..VkXlibSurfaceCreateInfoKHR_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkXlibSurfaceCreateInfoKHR structure containing the parameters affecting the creation of the surface object"
		),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "the allocator used for host memory allocated for the surface object"),
		Check(1)..VkSurfaceKHR_p.OUT("pSurface", "the resulting surface object handle is returned in {@code pSurface}")
	)

	VkBool32(
		"GetPhysicalDeviceXlibPresentationSupportKHR",
		"Queries physical device for presentation to X11 server using Xlib.",

		VkPhysicalDevice.IN("physicalDevice", "a physical device handle"),
		uint32_t.IN("queueFamilyIndex", "index to a queue family"),
		Display_p.IN("dpy", "pointer to an Xlib Display"),
		VisualID.IN("visualID", "an X11 VisualID")
	)
}