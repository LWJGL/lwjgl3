/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_surface = "KHRSurface".nativeClassVK("KHR_surface", postfix = KHR) {
	documentation =
		"""
		The {@code VK_KHR_surface} extension is an instance extension. It introduces {@code VkSurfaceKHR} objects, which abstract native platform surface or
		window objects for use with Vulkan. It also provides a way to determine whether a queue family in a physical device supports presenting to particular
		surface.

		Separate extensions for each each platform provide the mechanisms for creating {@code VkSurfaceKHRs}, but once created they may be used in this and
		other platform-independent extensions, in particular the {@code VK_KHR_swapchain} extension.
		"""

	IntConstant(
		"The extension specification version.",

		"KHR_SURFACE_SPEC_VERSION".."25"
	)

	StringConstant(
		"The extension name.",

		"KHR_SURFACE_EXTENSION_NAME".."VK_KHR_surface"
	)

	EnumConstant(
		"VkResult",

		"ERROR_SURFACE_LOST_KHR".enum("A surface is no longer available.", "-1000000000"),
		"ERROR_NATIVE_WINDOW_IN_USE_KHR".enum(
			"The requested window is already connected to a VkSurfaceKHR, or to some other non-Vulkan API.",
			"-1000000001"
		)
	)

	EnumConstant(
		"VkColorSpaceKHR",

		"COLOR_SPACE_SRGB_NONLINEAR_KHR".enum("The presentation engine supports the sRGB colorspace.", "0")
	)

	EnumConstant(
		"VkPresentModeKHR",

		"PRESENT_MODE_IMMEDIATE_KHR".enum(
			"""
			The presentation engine does not wait for a vertical blanking period to update the current image, meaning this mode $may result in visible tearing.
			No internal queuing of presentation requests is needed, as the requests are applied immediately.
			""",
			"0"),
		"PRESENT_MODE_MAILBOX_KHR".enum(
			"""
			The presentation engine waits for the next vertical blanking period to update the current image. Tearing $cannot be observed. An internal
			single-entry queue is used to hold pending presentation requests. If the queue is full when a new presentation request is received, the new request
			replaces the existing entry, and any images associated with the prior entry become available for re-use by the application. One request is removed
			from the queue and processed during each vertical blanking period in which the queue is non-empty.
			"""
		),
		"PRESENT_MODE_FIFO_KHR".enum(
			"""
			The presentation engine waits for the next vertical blanking period to update the current image. Tearing $cannot be observed. An internal queue
			containing {@code (numSwapchainImages - 1)} entries, where {@code numSwapchainImages} is the number of presentable images in the swapchain, is used
			to hold pending presentation requests. New requests are appended to the end of the queue, and one request is removed from the beginning of the
			queue and processed during each vertical blanking period in which the queue is non-empty. This is the only value of {@code presentMode} that is
			required to be supported.
			"""
		),
		"PRESENT_MODE_FIFO_RELAXED_KHR".enum(
			"""
			The presentation engine waits for the next vertical blanking period to update the current image. If a vertical blanking period has already passed
			since the last update of the current image then the presentation engine does not wait for another vertical blanking period for the update, meaning
			this mode $may result in visible tearing in this case. An internal queue containing {@code numSwapchainImages − 1} entries, where
			{@code numSwapchainImages} is the number of presentable images in the swapchain, is used to hold pending presentation requests. New requests are
			appended to the end of the queue, and one request is removed from the beginning of the queue and processed during or after each vertical blanking
			period in which the queue is non-empty.
			"""
		)
	)

	EnumConstant(
		"VkSurfaceTransformFlagBitsKHR",

		"SURFACE_TRANSFORM_IDENTITY_BIT_KHR".enum("The image content is presented without being transformed.", 0x00000001),
		"SURFACE_TRANSFORM_ROTATE_90_BIT_KHR".enum("The image content is rotated 90 degrees clockwise.", 0x00000002),
		"SURFACE_TRANSFORM_ROTATE_180_BIT_KHR".enum("The image content is rotated 180 degrees clockwise.", 0x00000004),
		"SURFACE_TRANSFORM_ROTATE_270_BIT_KHR".enum("The image content is rotated 270 degrees clockwise.", 0x00000008),
		"SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR".enum("The image content is mirrored horizontally.", 0x00000010),
		"SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR".enum(
			"The image content is mirrored horizontally, then rotated 90 degrees clockwise.",
			0x00000020
		),
		"SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR".enum(
			"The image content is mirrored horizontally, then rotated 180 degrees clockwise.",
			0x00000040
		),
		"SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR".enum(
			"The image content is mirrored horizontally, then rotated 270 degrees clockwise.",
			0x00000080
		),
		"SURFACE_TRANSFORM_INHERIT_BIT_KHR".enum(
			"The presentation transform is not specified, and is instead determined by platform-specific considerations and mechanisms outside Vulkan.",
			0x00000100
		)
	)

	EnumConstant(
		"VkCompositeAlphaFlagBitsKHR",

		"COMPOSITE_ALPHA_OPAQUE_BIT_KHR".enum(
			"""
			The alpha channel, if it exists, of the images is ignored in the compositing process. Instead, the image is treated as if it has a constant alpha
			of 1.0.
			""",
			0x00000001
		),
		"COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR".enum(
			"""
			The alpha channel, if it exists, of the images is respected in the compositing process. The non-alpha channels of the image are expected to already
			be multiplied by the alpha channel by the application.
			""",
			0x00000002
		),
		"COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR".enum(
			"""
			The alpha channel, if it exists, of the images is respected in the compositing process. The non-alpha channels of the image are not expected to
			already be multiplied by the alpha channel by the application; instead, the compositor will multiply the non-alpha channels of the image by the
			alpha channel during compositing.
			""",
			0x00000004
		),
		"COMPOSITE_ALPHA_INHERIT_BIT_KHR".enum(
			"""
			The way in which the presentation engine treats the alpha channel in the images is unknown to the Vulkan API. Instead, the application is
			responsible for setting the composite alpha blending mode using native window system commands. If the application does not set the blending mode
			using native window system commands, then a platform-specific default will be used.
			""",
			0x00000008
		)
	)

	void(
		"DestroySurfaceKHR",
		"""
		Destroys a {@code VkSurfaceKHR} object.

		Several WSI functions return #ERROR_SURFACE_LOST_KHR if the surface becomes no longer available. After such an error, the surface (and any child
		swapchain, if one exists) $should be destroyed, as there is no way to restore them to a not-lost state. Applications $may attempt to create a new
		{@code VkSurfaceKHR} using the same native platform window object, but whether such re-creation will succeed is platform-dependent and $may depend on
		the reason the surface became unavailable. A lost surface does not otherwise cause devices to be lost.

		Destroying a {@code VkSurfaceKHR} merely severs the connection between Vulkan and the native surface, and doesn’t imply destroying the native surface,
		closing a window, or similar behavior.

		${ValidityProtos.vkDestroySurfaceKHR}
		""",

		VkInstance.IN("instance", "the instance used to create the surface"),
		VkSurfaceKHR.IN("surface", "the surface to destroy"),
		pAllocator
	)

	VkResult(
		"GetPhysicalDeviceSurfaceSupportKHR",
		"""
		Determines whether a queue family of a physical device supports presentation to a given surface.

		${ValidityProtos.vkGetPhysicalDeviceSurfaceSupportKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device"),
		uint32_t.IN("queueFamilyIndex", "the queue family"),
		VkSurfaceKHR.IN("surface", " the surface"),
		Check(1)..VkBool32_p.OUT("pSupported", "a pointer to a {@code VkBool32}, which is set to #TRUE to indicate support, and #FALSE otherwise")
	)

	VkResult(
		"GetPhysicalDeviceSurfaceCapabilitiesKHR",
		"""
		Queries the basic capabilities of a surface, needed in order to create a swapchain.

		${ValidityProtos.vkGetPhysicalDeviceSurfaceCapabilitiesKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device that will be associated with the swapchain to be created"),
		VkSurfaceKHR.IN("surface", "the surface that will be associated with the swapchain"),
		VkSurfaceCapabilitiesKHR_p.OUT(
			"pSurfaceCapabilities",
			"a pointer to an instance of the ##VkSurfaceCapabilitiesKHR structure that will be filled with information"
		)
	)

	VkResult(
		"GetPhysicalDeviceSurfaceFormatsKHR",
		"""
		Queries the supported swapchain format-colorspace pairs for a surface.

		If {@code pSurfaceFormats} is $NULL, then the number of format pairs supported for the given surface is returned in {@code pSurfaceFormatCount}.
		Otherwise, {@code pSurfaceFormatCount} $must point to a variable set by the user to the number of elements in the {@code pSurfaceFormats} array, and on
		return the variable is overwritten with the number of structures actually written to {@code pSurfaceFormats}. If the value of
		{@code pSurfaceFormatCount} is less than the number of queue families supported, at most {@code pSurfaceFormatCount} structures will be written. If
		{@code pSurfaceFormatCount} is smaller than the number of format pairs supported for the given {@code surface}, #INCOMPLETE will be returned
		instead of #SUCCESS to indicate that not all the available values were returned.

		${ValidityProtos.vkGetPhysicalDeviceSurfaceFormatsKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device that will be associated with the swapchain to be created"),
		VkSurfaceKHR.IN("surface", "the surface that will be associated with the swapchain"),
		AutoSize("pSurfaceFormats")..uint32_t_p.INOUT(
			"pSurfaceFormatCount",
			"a pointer to an integer related to the number of format pairs available or queried"
		),
		nullable..VkSurfaceFormatKHR_p.OUT("pSurfaceFormats", "either $NULL or a pointer to an array of ##VkSurfaceFormatKHR structures")
	)

	VkResult(
		"GetPhysicalDeviceSurfacePresentModesKHR",
		"""
		Queries the supported presentation modes for a surface.

		If {@code pPresentModes} is $NULL, then the number of presentation modes supported for the given surface is returned in {@code pPresentModeCount}.
		Otherwise, {@code pPresentModeCount} $must point to a variable set by the user to the number of elements in the {@code pPresentModes} array, and on
		return the variable is overwritten with the number of structures actually written to {@code pPresentModes}. If the value of {@code pPresentModeCount}
		is less than the number of presentation modes supported, at most {@code pPresentModeCount} structures will be written. If {@code pPresentModeCount} is
		smaller than the number of presentation modes supported for the given {@code surfac}e, #INCOMPLETE will be returned instead of #SUCCESS to
		indicate that not all the available values were returned.

		${ValidityProtos.vkGetPhysicalDeviceSurfacePresentModesKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device that will be associated with the swapchain to be created"),
		VkSurfaceKHR.IN("surface", "the surface that will be associated with the swapchain"),
		AutoSize("pPresentModes")..uint32_t_p.INOUT(
			"pPresentModeCount",
			"a pointer to an integer related to the number of format pairs available or queried"
		),
		nullable..VkPresentModeKHR_p.OUT("pPresentModes", "either $NULL or a pointer to an array of {@code VkPresentModeKHR} values")
	)
}