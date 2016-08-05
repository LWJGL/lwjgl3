/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_display_swapchain = "KHRDisplaySwapchain".nativeClassVK("KHR_display_swapchain", postfix = KHR) {
	documentation =
		"This extension provides an API to create a swapchain directly on a device's display without any underlying window system."

	IntConstant(
		"The extension specification version.",

		"KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION".."9"
	)

	StringConstant(
		"The extension name.",

		"KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME".."VK_KHR_display_swapchain"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR".."1000003000"
	)

	EnumConstant(
		"VkResult",

		"ERROR_INCOMPATIBLE_DISPLAY_KHR".enum(
			"The display used by a swapchain does not use the same presentable image layout, or is incompatible in a way that prevents sharing an image.",
			"-1000003001"
		)
	)

	VkResult(
		"CreateSharedSwapchainsKHR",
		"""
		Creates multiple swapchains that share presentable images.

		{@code vkCreateSharedSwapchains} is similar to #CreateSwapchainKHR(), except that it takes an array of ##VkSwapchainCreateInfoKHR
		structures, and returns an array of swapchain objects.

		The swapchain creation parameters that affect the properties and number of presentable images $must match between all the swapchains. If the displays
		used by any of the swapchains do not use the same presentable image layout or are incompatible in a way that prevents sharing images, swapchain
		creation will fail with the result code #ERROR_INCOMPATIBLE_DISPLAY_KHR. If any error occurs, no swapchains will be created. Images presented to
		multiple swapchains $must be re-acquired from all of them before transitioning away from #IMAGE_LAYOUT_PRESENT_SRC_KHR. After destroying
		one or more of the swapchains, the remaining swapchains and the presentable images $can continue to be used.

		${ValidityProtos.vkCreateSharedSwapchainsKHR}
		""",

		VkDevice.IN("device", "the device to create the swapchains for"),
		AutoSize("pCreateInfos", "pSwapchains")..uint32_t.IN("swapchainCount", "the number of swapchains to create"),
		const..VkSwapchainCreateInfoKHR_p.IN(
			"pCreateInfos",
			"a pointer to an array of ##VkSwapchainCreateInfoKHR structures specifying the parameters of the created swapchains"
		),
		pAllocator,
		VkSwapchainKHR.p.OUT("pSwapchains", "a pointer to an array of {@code VkSwapchainKHR} handles in which the created swapchain objects will be returned")
	)
}