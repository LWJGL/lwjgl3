/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_swapchain = "KHRSwapchain".nativeClassVK("KHR_swapchain", postfix = KHR) {
	documentation =
		"""
		The {@code VK_KHR_swapchain} extension is the device-level companion to the {@code VK_KHR_surface} extension. It introduces {@code VkSwapchainKHR}
		objects, which provide the ability to present rendering results to a surface.
		"""

	IntConstant(
		"The extension specification version.",

		"KHR_SWAPCHAIN_SPEC_VERSION" expr "67"
	)

	StringConstant(
		"The extension name.",

		"KHR_SWAPCHAIN_EXTENSION_NAME".."VK_KHR_swapchain"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR" expr "1000001000",
        "STRUCTURE_TYPE_PRESENT_INFO_KHR" expr "1000001001"
	)

	EnumConstant(
		"VkImageLayout",

		"IMAGE_LAYOUT_PRESENT_SRC_KHR".enumExpr(
			"""
			$must only be used for presenting a swapchain image for display. A swapchain’s image $must be transitioned to this layout before calling
			#QueuePresentKHR(), and $must be transitioned away from this layout after calling #AcquireNextImageKHR().
			""",
			"1000001002"
		)
	)

	EnumConstant(
		"VkResult",

		"SUBOPTIMAL_KHR".enumExpr(
			"A swapchain no longer matches the surface properties exactly, but $can still be used to present to the surface successfully.",
			"1000001003"
		),
		"ERROR_OUT_OF_DATE_KHR".enumExpr(
			"""
			A surface has changed in such a way that it is no longer compatible with the swapchain, and further presentation requests using the swapchain will
			fail. Applications $must query the new surface properties and recreate their swapchain if they wish to continue presenting to the surface.
			""",
			"-1000001004"
		)
	)

	VkResult(
		"CreateSwapchainKHR",
		"Creates a swapchain.",

		VkDevice.IN("device", "the VkDevice to associate the swapchain"),
		const..VkSwapchainCreateInfoKHR_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkSwapchainCreateInfoKHR structure containing the parameters affecting the creation of the swapchain object"
		),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "the allocator used for host memory allocated for the surface object"),
		Check(1)..VkSwapchainKHR.p.OUT("pSwapchain", "the resulting swapchain")
	)

	void(
		"DestroySwapchainKHR",
		"Destroys a swapchain object.",

		VkDevice.IN("device", "the {@code VkDevice} associated with the swapchain"),
		VkSwapchainKHR.IN("swapchain", "the swapchain to destroy"),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "the allocator used for host memory allocated for the swapchain object")
	)

	VkResult(
		"GetSwapchainImagesKHR",
		"Obtains the array of presentable images associated with a swapchain.",

		VkDevice.IN("device", "the {@code VkDevice} associated with swapchain"),
		VkSwapchainKHR.IN("swapchain", "the swapchain"),
		AutoSize("pSwapchainImages")..Check(1)..uint32_t_p.INOUT(
			"pSwapchainImageCount",
			"the number of elements in the array pointed by {@code pSwapchainImages}"
		),
		nullable..VkImage.p.OUT("pSwapchainImages", "the returned array of images")
	)

	VkResult(
		"AcquireNextImageKHR",
		"Retrieves the index of the next available presentable image.",

		VkDevice.IN("device", "the {@code VkDevice} associated with the swapchain"),
		VkSwapchainKHR.IN("swapchain", "the swapchain from which an image is being acquired"),
		uint64_t.IN("timeout", "indicates how long the function waits, in nanoseconds"),
		VkSemaphore.IN("semaphore", "a {@code VkSemaphore} that will become signaled when the presentation engine has released ownership of the image"),
		VkFence.IN("fence", "a {@code VkFence} that will become signaled when the presentation engine has released ownership of the image"),
		Check(1)..uint32_t_p.OUT("pImageIndex", "a pointer to an integer that is set to the index of the next image to use")
	)

	VkResult(
		"QueuePresentKHR",
		"Queues an image for presentation.",

		VkQueue.IN("queue", "a {@code VkQueue} that is capable of presentation to the target surface"),
		const..VkPresentInfoKHR_p.IN("pPresentInfo", "a pointer to a ##VkPresentInfoKHR structure specifying the parameters of the presentation")
	)
}