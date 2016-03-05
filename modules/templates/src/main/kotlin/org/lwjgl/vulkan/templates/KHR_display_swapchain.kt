/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_display_swapchain = "KHRDisplaySwapchain".nativeClassVK("KHR_display_swapchain", postfix = KHR) {
	documentation =
		"This extension provides an API to create a swapchain directly on a device's display without any underlying window system."

	IntConstant(
		"The extension specification version.",

		"KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION" expr "9"
	)

	StringConstant(
		"The extension name.",

		"KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME".."VK_KHR_display_swapchain"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR" expr "1000003000"
	)

	EnumConstant(
		"VkResult",

		"ERROR_INCOMPATIBLE_DISPLAY_KHR".enumExpr(
			"The display used by a swapchain does not use the same presentable image layout, or is incompatible in a way that prevents sharing an image.",
			"-1000003001"
		)
	)

	VkResult(
		"CreateSharedSwapchainsKHR",
		"Creates multiple swapchains that share presentable images.",

		VkDevice.IN("device", "the {@code VkDevice} assocated with swapchain"),
		AutoSize("pCreateInfos", "pSwapchains")..uint32_t.IN("swapchainCount", "the count of the array of swapchain create info"),
		const..VkSwapchainCreateInfoKHR_p.IN(
			"pCreateInfos",
			"a pointer to an array of ##VkSwapchainCreateInfoKHR structures containing the parameters affecting the creation of the swapchain objects"
		),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "the allocator used for host memory allocated for the swapchain objects"),
		VkSwapchainKHR.p.OUT("pSwapchains", "the array of created swapchains")
	)
}