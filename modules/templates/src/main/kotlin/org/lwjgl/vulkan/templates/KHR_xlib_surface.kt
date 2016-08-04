/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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

		"KHR_XLIB_SURFACE_SPEC_VERSION".."6"
	)

	StringConstant(
		"The extension name.",

		"KHR_XLIB_SURFACE_EXTENSION_NAME".."VK_KHR_xlib_surface"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR".."1000004000"
	)

	VkResult(
		"CreateXlibSurfaceKHR",
		"""
		Creates a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library.

		${ValidityProtos.vkCreateXlibSurfaceKHR}

		With Xlib, {@code minImageExtent}, {@code maxImageExtent}, and {@code currentExtent} are the window size. Therefore, a swapchain’s {@code imageExtent}
		$must match the window’s size.

		Some Vulkan functions $may send protocol over the specified Xlib Display connection when using a swapchain or presentable images created from a
		{@code VkSurface} referring to an Xlib window. Applications $must therefore ensure the display connection is available to Vulkan for the duration of
		any functions that manipulate such swapchains or their presentable images, and any functions that build or queue command buffers that operate on such
		presentable images. Specifically, applications using Vulkan with Xlib-based swapchains $must
		${ul(
			"""
			Call {@code XInitThreads()} before calling any other Xlib functions if they intend to use Vulkan in multiple threads, or use Vulkan and Xlib in
			separate threads.
			""",
			"""
			Avoid holding a server grab on a display connection while waiting for Vulkan operations to complete using a swapchain derived from a different
			display connection referring to the same X server instance. Failing to do so may result in deadlock.
			"""
		)}
		""",

		VkInstance.IN("instance", "the instance to associate the surface with"),
		const..VkXlibSurfaceCreateInfoKHR_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkXlibSurfaceCreateInfoKHR structure containing the parameters affecting the creation of the surface object"
		),
		pAllocator,
		Check(1)..VkSurfaceKHR_p.OUT("pSurface", "points to a {@code VkSurfaceKHR} handle in which the created surface object is returned")
	)

	VkBool32(
		"GetPhysicalDeviceXlibPresentationSupportKHR",
		"""
		Determines whether a queue family of a physical device supports presentation to an X11 server, using the Xlib client-side library.

		This platform-specific function $can be called prior to creating a surface.

		${ValidityProtos.vkGetPhysicalDeviceXlibPresentationSupportKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device"),
		uint32_t.IN("queueFamilyIndex", "the queue family index"),
		Display_p.IN("dpy", "a pointer to an Xlib {@code Display} connection to the server"),
		VisualID.IN("visualID", "an X11 visual (VisualID)")
	)
}