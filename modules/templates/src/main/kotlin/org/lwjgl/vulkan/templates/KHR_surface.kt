/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
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

		"KHR_SURFACE_SPEC_VERSION" expr "25"
	)

	StringConstant(
		"The extension name.",

		"KHR_SURFACE_EXTENSION_NAME".."VK_KHR_surface"
	)

	EnumConstant(
		"VkResult",

		"ERROR_SURFACE_LOST_KHR".enumExpr("A surface is no longer available.", "-1000000000"),
		"ERROR_NATIVE_WINDOW_IN_USE_KHR".enumExpr(
			"The requested window is already connected to a VkSurfaceKHR, or to some other non-Vulkan API.",
			"-1000000001"
		)
	)

	EnumConstant(
		"VkColorSpaceKHR",

		"COLORSPACE_SRGB_NONLINEAR_KHR".enumExpr("The presentation engine supports the sRGB colorspace.", "0"),
		"COLORSPACE_BEGIN_RANGE".enumExpr("", "VK_COLORSPACE_SRGB_NONLINEAR_KHR"),
		"COLORSPACE_END_RANGE".enumExpr("", "VK_COLORSPACE_SRGB_NONLINEAR_KHR"),
		"COLORSPACE_RANGE_SIZE".enumExpr("", "(VK_COLORSPACE_SRGB_NONLINEAR_KHR - VK_COLORSPACE_SRGB_NONLINEAR_KHR + 1)"),
		"COLORSPACE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkPresentModeKHR",

		"PRESENT_MODE_IMMEDIATE_KHR".enumExpr(
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
		"PRESENT_MODE_FIFO_RELAXED_KHR".enum(""),
		"PRESENT_MODE_BEGIN_RANGE".enumExpr("", "VK_PRESENT_MODE_IMMEDIATE_KHR"),
		"PRESENT_MODE_END_RANGE".enumExpr("", "VK_PRESENT_MODE_FIFO_RELAXED_KHR"),
		"PRESENT_MODE_RANGE_SIZE".enumExpr("", "(VK_PRESENT_MODE_FIFO_RELAXED_KHR - VK_PRESENT_MODE_IMMEDIATE_KHR + 1)"),
		"PRESENT_MODE_MAX_ENUM".enum(0x7FFFFFFF)
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
		"Destroys a {@code VkSurfaceKHR} object.",

		VkInstance.IN("instance", "the instance used to create the surface"),
		VkSurfaceKHR.IN("surface", "the handle of the surface to destroy"),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "the allocator used for host memory allocated for the surface object")
	)

	VkResult(
		"GetPhysicalDeviceSurfaceSupportKHR",
		"Queries if presentation is supported.",

		VkPhysicalDevice.IN("physicalDevice", "a valid physical device"),
		uint32_t.IN("queueFamilyIndex", "a queue family"),
		VkSurfaceKHR.IN("surface", "the surface to query"),
		Check(1)..VkBool32_p.OUT("pSupported", "indicates is presentation is supported")
	)

	VkResult(
		"GetPhysicalDeviceSurfaceCapabilitiesKHR",
		"Gets surface capabilities.",

		VkPhysicalDevice.IN("physicalDevice", "a valid physical device"),
		VkSurfaceKHR.IN("surface", "the surface to query"),
		VkSurfaceCapabilitiesKHR_p.OUT("pSurfaceCapabilities", "a pointer to an instance of ##VkSurfaceCapabilitiesKHR that will be filled")
	)

	VkResult(
		"GetPhysicalDeviceSurfaceFormatsKHR",
		"Gets color formats supported by surface.",

		VkPhysicalDevice.IN("physicalDevice", "a valid physical device"),
		VkSurfaceKHR.IN("surface", "the surface to query"),
		AutoSize("pSurfaceFormats")..uint32_t_p.INOUT("pSurfaceFormatCount", "the number of elements in the array pointed by {@code pSurfaceFormats}"),
		nullable..VkSurfaceFormatKHR_p.OUT("pSurfaceFormats", "a pointer to an array of ##VkSurfaceFormatKHR")
	)

	VkResult(
		"GetPhysicalDeviceSurfacePresentModesKHR",
		"Gets supported presentation modes.",

		VkPhysicalDevice.IN("physicalDevice", "a valid physical device"),
		VkSurfaceKHR.IN("surface", "the surface to query"),
		AutoSize("pPresentModes")..uint32_t_p.INOUT("pPresentModeCount", "the number of elements in the array pointed by {@code pPresentModes}"),
		nullable..VkPresentModeKHR_p.OUT("pPresentModes", "a pointer to an array of {@code VkPresentModeKHR}")
	)
}