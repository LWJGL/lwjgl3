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
		"""
		Creates a swapchain.

		A {@code VkSwapchainKHR} object (a.k.a. swapchain) provides the ability to present rendering results to a surface. A swapchain is an abstraction for an
		array of presentable images that are associated with a surface. The swapchain images are represented by {@code VkImage} objects created by the
		platform. One image (which $can be an array image for multiview/stereoscopic-3D surfaces) is displayed at a time, but multiple images $can be queued
		for presentation. An application renders to the image, and then queues the image for presentation to the surface. A native window $cannot be associated
		with more than one swapchain at a time. Further, swapchains $cannot be created for native windows that have a non-Vulkan graphics API surface
		associated with them.

		The presentation engine is an abstraction for the platform’s compositor or hardware/software display engine.

		${note("Some implementations may use the device’s graphics queue or dedicated presentation hardware to perform presentation.")}

		The presentable images of a swapchain are always owned by either the application or the presentation engine, and never both simultaneously.
		Applications $mustnot access the presentable image when they do not own the image.

		${ValidityProtos.vkCreateSwapchainKHR}

		If {@code vkCreateSwapchainKHR} succeeds, it will return a handle to a swapchain that contains an array of at least {@code minImageCount} presentable
		images.

		When a swapchain is created, all its associated presentable images are owned by the presentation engine targeted by the swapchain. The presentation
		engine controls the order in which presentable images are available for use by the application.

		${note(
			"""
			This allows the platform to handle situations which require out-of-order return of images after presentation. At the same time, it allows the
			application to generate command buffers referencing all of the images in the swapchain at initialization time, rather than in its main loop.
			"""
		)}

		The {@code VkSurfaceKHR} associated with a swapchain $mustnot be destroyed until after the swapchain is destroyed.

		Like core functions, several WSI fuctions, including {@code vkCreateSwapchainKHR} return VK10#ERROR_DEVICE_LOST if the logical device was lost. As with
		most core objects, {@code VkSwapchainKHR} is a child of the device and is affected by the lost state; it $must be destroyed before destroying the
		{@code VkDevice}. However, {@code VkSurfaceKHR} is not a child of any {@code VkDevice} and is not otherwise affected by the lost device. After
		successfully recreating a {@code VkDevice}, the same {@code VkSurfaceKHR} $can be used to create a new {@code VkSwapchainKHR}, provided the previous one
		was destroyed.

		${note(
			"""
			After a lost device event, the {@code VkPhysicalDevice} $may also be lost. If other {@code VkPhysicalDevice} are available, they $can be used
			together with the same {@code VkSurfaceKHR} to create the new {@code VkSwapchainKHR}, however the application $must query the surface capabilities
			again, because they $may differ on a per-physical device basis.
			"""
		)}
		""",

		VkDevice.IN("device", "the device to create the swapchain for"),
		const..VkSwapchainCreateInfoKHR_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkSwapchainCreateInfoKHR structure specifying the parameters of the created swapchain"
		),
		pAllocator,
		Check(1)..VkSwapchainKHR.p.OUT("pSwapchain", "a pointer to a {@code VkSwapchainKHR} handle in which the created swapchain object will be returned")
	)

	void(
		"DestroySwapchainKHR",
		"""
		Destroys a swapchain object.

		{@code swapchain} and all associated {@code VkImage} handles are destroyed, and $mustnot be owned or used any more by the application. The memory of
		each {@code VkImage} will only be freed after that image is no longer used by the platform. For example, if one image of the swapchain is being
		displayed in a window, the memory for that image may not be freed until the window is destroyed, or another swapchain is created for the window.
		Destroying the swapchain does not invalidate the parent {@code VkSurfaceKHR}, and a new swapchain can be created with it.

		${ValidityProtos.vkDestroySwapchainKHR}
		""",

		VkDevice.IN("device", "the {@code VkDevice} associated with the swapchain"),
		VkSwapchainKHR.IN("swapchain", "the swapchain to destroy"),
		pAllocator
	)

	VkResult(
		"GetSwapchainImagesKHR",
		"""
		Obtains the array of presentable images associated with a swapchain.

		If {@code pSwapchainImages} is $NULL, then the number of presentable images for swapchain is returned in {@code pSwapchainImageCount}. Otherwise,
		{@code pSwapchainImageCount} $must point to a variable set by the user to the number of elements in the {@code pSwapchainImages} array, and on return
		the variable is overwritten with the number of structures actually written to {@code pSwapchainImages}. If the value of {@code pSwapchainImageCount} is
		less than the number of presentable images for {@code swapchain}, at most {@code pSwapchainImageCount} structures will be written. If
		{@code pSwapchainImageCount} is smaller than the number of presentable images for {@code swapchain}, VK10#INCOMPLETE will be returned instead of
		VK10#SUCCESS to indicate that not all the available values were returned.

		${ValidityProtos.vkGetSwapchainImagesKHR}

		${note(
			"""
			By knowing all presentable images used in the swapchain, the application $can create command buffers that reference these images prior to entering
			its main rendering loop.
			"""
		)}

		The implementation will have already allocated and bound the memory backing the {@code VkImages} returned by {@code vkGetSwapchainImagesKHR}. The
		memory for each image will not alias with the memory for other images or with any {@code VkDeviceMemory} object. As such, performing any operation
		affecting the binding of memory to a presentable image results in undefined behavior. All presentable images are initially in the
		VK10#IMAGE_LAYOUT_UNDEFINED layout, thus before using presentable images, the application must transition them to a valid layout for the intended use.

		Further, the lifetime of presentable images is controlled by the implementation so destroying a presentable image with VK10#DestroyImage() results in
		undefined behavior. See #DestroySwapchainKHR() for further details on the lifetime of presentable images.
		""",

		VkDevice.IN("device", "the device associated with {@code swapchain}"),
		VkSwapchainKHR.IN("swapchain", "the swapchain to query"),
		AutoSize("pSwapchainImages")..Check(1)..uint32_t_p.INOUT(
			"pSwapchainImageCount",
			"a pointer to an integer related to the number of format pairs available or queried"
		),
		nullable..VkImage.p.OUT("pSwapchainImages", "either $NULL or a pointer to an array of {@code VkSwapchainImageKHR} structures")
	)

	VkResult(
		"AcquireNextImageKHR",
		"""
		Retrieves the index of the next available presentable image.

		When successful, {@code vkAcquireNextImageKHR} retrieves the index of a presentable image that the application will be able to use. The presentation
		engine may still own the image, as the presentation engine may be in the process of releasing the image when {@code vkAcquireNextImageKHR} returns. The
		application will own the image when {@code semaphore} and/or {@code fence} is signaled by the presentation engine. Additional details follow.

		If {@code timeout} is 0, {@code vkAcquireNextImageKHR} will not block, but will either succeed or return an error. If {@code timeout} is
		{@code UINT64_MAX}, the function will not return until the presentation engine will be able to release ownership of the image within finite time. For
		example, if the presentation engine owns only the image currently being displayed and no other images are presented, {@code vkAcquireNextImageKHR} $may
		block indefinitely. Other values for {@code timeout} will cause the function to return when an image becomes available, or when the specified number of
		nanoseconds have passed (in which case it will return an error).

		The presentation engine controls the order in which presentable images are made available to the application. This allows the platform to handle
		special situations, and not always give ownership of images in the same order as it previously did. If the swapchain has enough presentable images,
		applications $can acquire ownership of multiple images before presenting any, and then present them in a different order in which they were acquired.

		{@code vkAcquireNextImageKHR} $may not block, and applications $cannot rely on blocking in order to meter their rendering speed.

		${note(
			"""
			For example, if an error occurs, {@code vkAcquireNextImageKHR} $may return even though no image is available. As another example, some presentation
			engines are able to enqueue an unbounded number of presentation and acquire next image operations such that {@code vkAcquireNextImageKHR} never
			needs to wait for completion of outstanding present operations before returning.
			"""
		)}

		The availability of presentable images is influenced by factors such as the implementation of the presentation engine, the {@code VkPresentModeKHR}
		being used, the number of images in the swapchain, the number of images that the application owns at any given time, and the performance of the
		application. The value of ##VkSurfaceCapabilitiesKHR{@code ::minImageCount} indicates how many images $must be in the swapchain in order for
		{@code vkAcquireNextImageKHR} to return an image in finite time if the application currently doesn’t own an image.

		${note(
			"""
			For example, if the {@code minImageCount} member of ##VkSurfaceCapabilitiesKHR is 2, and the application wishes to use
			KHRSurface#PRESENT_MODE_FIFO_KHR and maintain ownership of up to 3 presentable images simultaneously, it $must request a minimum image count of 4
			when creating the swapchain. That will allow a presentable image to always become available in finite time (e.g. the image currently being
			displayed) as long as the number of images the application owns prior to the {@code vkAcquireNextImageKHR} call is less than 3. If we modify this
			example, so that the application creates a swapchain on the same surface, but with 5 images and a presentMode of
			KHRSurface#PRESENT_MODE_MAILBOX_KHR, a presentable image will always be available in zero time (i.e. {@code vkAcquireNextImageKHR} will never
			block).
			"""
		)}

		If {@code semaphore} is not VK10#NULL_HANDLE, the semaphore $must be unsignaled and not have any uncompleted signal or wait operations pending. It will
		become signaled when the presentation engine has released ownership of the image, and the device may modify its contents. Queue operations that access
		the image contents $must wait until the semaphore signals; typically applications $should include the semaphore in the {@code pWaitSemaphores} list for
		the queue submission that transitions the image away from the #IMAGE_LAYOUT_PRESENT_SRC_KHR layout. Use of the semaphore allows rendering operations to
		be recorded and submitted before the presentation engine releases ownership.

		If {@code fence} is not equal to VK10#NULL_HANDLE, the fence $must be unsignaled and not have any uncompleted signal operations pending. It will become
		signaled when the presentation engine has released ownership of the image. Applications $can use this to meter their frame generation work to match the
		presentation rate.

		{@code semaphore} and {@code fence} $must not both be equal to VK10#NULL_HANDLE. An application $must wait until either the {@code semaphore} or
		{@code fence} is signaled before using the presentable image.

		{@code semaphore} and {@code fence} $may already be signaled when {@code vkAcquireNextImageKHR} returns, if the image is being acquired for the first
		time, or if the presentation engine has already released its ownership.

		A successful call to {@code vkAcquireNextImageKHR} counts as a signal operation on semaphore for the purposes of queue forward-progress requirements.
		The semaphore is guaranteed to signal, so a wait operation $can be queued for the semaphore without risk of deadlock.

		The VK10#CmdWaitEvents() or VK10#CmdPipelineBarrier() used to transition the image away from #IMAGE_LAYOUT_PRESENT_SRC_KHR layout $must have
		{@code dstStageMask} and {@code dstAccessMask} parameters set based on the next use of the image. The {@code srcAccessMask} $must include
		VK10#ACCESS_MEMORY_READ_BIT to ensure that all prior reads by the presentation engine are complete before the image layout transition occurs. The
		application $must use implicit ordering guarantees and execution dependencies to prevent the image transition from occurring before the semaphore
		passed to {@code vkAcquireNextImageKHR} has signaled.

		${note(
			"""
			When the swapchain image will be written by some stage {@code S}, the recommended idiom for ensuring the semaphore signals before the transition
			occurs is:
			${ul(
				"""
				The batch that contains the transition includes the image-acquire semaphore in the list of semaphores to wait for, with a wait stage mask that
				includes {@code S}.
				""",
				"The pipeline barrier that performs the transition includes {@code S} in both the {@code srcStageMask} and {@code dstStageMask}."
			)}

			This causes the pipeline barrer to wait at {@code S} until the semaphore signals before performing the transition and memory barrier, while
			allowing earlier pipeline stages of subsequent commands to proceed.
			"""
		)}

		After a successful return, the image indicated by {@code pImageIndex} will still be in the #IMAGE_LAYOUT_PRESENT_SRC_KHR layout if it was previously
		presented, or in the VK10#IMAGE_LAYOUT_UNDEFINED layout if this is the first time it has been acquired.

		The possible return values for {@code vkAcquireNextImageKHR} depend on the timeout provided:
		${ul(
			"VK10#SUCCESS is returned if an image became available.",
			"KHRSurface#ERROR_SURFACE_LOST_KHR if the surface becomes no longer available.",
			"VK10#NOT_READY is returned if {@code timeout} is zero and no image was available.",
			"""
			VK10#TIMEOUT is returned if {@code timeout} is greater than zero and less than {@code UINT64_MAX}, and no image became available within the time
			allowed.
			""",
			"""
			#SUBOPTIMAL_KHR is returned if an image became available, and the swapchain no longer matches the surface properties exactly, but can still be used
			to present to the surface successfully.

			${note(
			"""
			This may happen, for example, if the platform surface has been resized but the platform is able to scale the presented images to the new size to
			produce valid surface updates. It is up to applications to decide whether they prefer to continue using the current swapchain indefinitely or
			temporarily in this state, or to re-create the swapchain to better match the platform surface properties.
			"""
			)}
			""",
			"""
			#ERROR_OUT_OF_DATE_KHR is returned if the surface has changed in such a way that it is no longer compatible with the swapchain, and further
			presentation requests using the swapchain will fail. Applications $must query the new surface properties and recreate their swapchain if they wish
			to continue presenting to the surface.
			"""
		)}

		${ValidityProtos.vkAcquireNextImageKHR}

		If the native surface and presented image sizes no longer match, presentation may not succeed. If presentation does succeed, parts of the native
		surface $may be undefined, parts of the presented image $may have been clipped before presentation, and/or the image $may have been scaled (uniformly
		or not uniformly) before presentation. It is the application’s responsibility to detect surface size changes and react appropriately. If presentation
		does not succeed because of a mismatch in the surface and presented image sizes, a #ERROR_OUT_OF_DATE_KHR error will be returned.

		Before an application $can present an image, the image’s layout $must be transitioned to the #IMAGE_LAYOUT_PRESENT_SRC_KHR layout. The
		VK10#CmdWaitEvents() or VK10#CmdPipelineBarrier() that perform the transition $must have {@code srcStageMask} and {@code srcAccessMask} parameters set
		based on the preceding use of the image. The {@code dstAccessMask} $must include VK10#ACCESS_MEMORY_READ_BIT indicating all prior accesses indicated in
		{@code srcAccessMask} from stages in {@code srcStageMask} are to be made available to reads by the presentation engine. Any value of
		{@code dstStageMask} is valid, but should be set to VK10#PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT to avoid delaying subsequent commands that don’t access the
		image.
		""",

		VkDevice.IN("device", "the device assocated with {@code swapchain}"),
		VkSwapchainKHR.IN("swapchain", "the swapchain from which an image is being acquired"),
		uint64_t.IN("timeout", " indicates how long the function waits, in nanoseconds, if no image is available"),
		VkSemaphore.IN("semaphore", "is VK10#NULL_HANDLE or a semaphore to signal"),
		VkFence.IN("fence", "is VK10#NULL_HANDLE or a fence to signal"),
		Check(1)..uint32_t_p.OUT(
			"pImageIndex",
			"""
			a pointer to a {@code uint32_t} that is set to the index of the next image to use (i.e. an index into the array of images returned by
			#GetSwapchainImagesKHR()).
			"""
		)
	)

	VkResult(
		"QueuePresentKHR",
		"""
		Queues an image for presentation.

		${ValidityProtos.vkQueuePresentKHR}

		When the application calls {@code vkQueuePresentKHR}, it releases ownership of the images referenced by {@code imageIndices} to the presentation
		engine. The presented images $mustnot be used again until the application regains control of them using #AcquireNextImageKHR() (and waiting until the
		returned semaphore is signaled or fence is completed).

		The transfer of ownership to the presentation engine happens in issue order with other queue operations, but semaphores have to be used to ensure that
		prior rendering and other commands in the specified queue complete before the presentation operation. The presentation operation itself does not delay
		processing of subsequent commands on the queue, however, presentation requests sent to a particular queue are always performed in order. Exact
		presentation timing is controled by the semantics of the presentation engine and native platform in use.

		The result codes #ERROR_OUT_OF_DATE_KHR and #SUBOPTIMAL_KHR have the same meaning when returned by {@code vkQueuePresentKHR} as they do when returned
		by #AcquireNextImageKHR(). If multiple swapchains are presented, the result code is determined applying the following rules in order:
		${ul(
			"If the device is lost, VK10#ERROR_DEVICE_LOST is returned.",
			"If any of the target surfaces are no longer available the error KHRSurface#ERROR_SURFACE_LOST_KHR is returned.",
			"If any of the presents would have a result of #ERROR_OUT_OF_DATE_KHR if issued separately then #ERROR_OUT_OF_DATE_KHR is returned.",
			"If any of the presents would have a result of #SUBOPTIMAL_KHR if issued separately then #SUBOPTIMAL_KHR is returned.",
			"Otherwise VK10#SUCCESS is returned."
		)}

		Presentation is a read-only operation that will not affect the content of the presentable images. Upon reacquiring the image and transitioning it away
		from the #IMAGE_LAYOUT_PRESENT_SRC_KHR layout, the contents will be the same as they were prior to transitioning the image to the present source layout
		and presenting it. However, if a mechanism other than Vulkan is used to modify the platform window associated with the swapchain, the content of all
		presentable images in the swapchain becomes undefined.
		""",

		VkQueue.IN("queue", "a queue that is capable of presentation to the target surface’s platform on the same device as the image’s swapchain"),
		const..VkPresentInfoKHR_p.IN(
			"pPresentInfo",
			"a pointer to an instance of the ##VkPresentInfoKHR structure specifying the parameters of the presentation"
		)
	)
}