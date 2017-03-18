/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_surface = "KHRSurface".nativeClassVK("KHR_surface", type = "instance", postfix = KHR) {
	documentation =
		"""
		<dl>
			<dt><b>Name String</b></dt>
			<dd>VK_KHR_surface</dd>

			<dt><b>Extension Type</b></dt>
			<dd>Instance extension</dd>

			<dt><b>Registered Extension Number</b></dt>
			<dd>1</dd>

			<dt><b>Last Modified Date</b></dt>
			<dd>2016-08-25</dd>

			<dt><b>Revision</b></dt>
			<dd>25</dd>

			<dt><b>IP Status</b></dt>
			<dd>No known IP claims.</dd>

			<dt><b>Dependencies</b></dt>
			<dd><ul>
				<li>This extension is written against version 1.0 of the Vulkan API.</li>
			</ul></dd>

			<dt><b>Contributors</b></dt>
			<dd><ul>
				<li>Patrick Doane, Blizzard</li>
				<li>Ian Elliott, LunarG</li>
				<li>Jesse Hall, Google</li>
				<li>James Jones, NVIDIA</li>
				<li>David Mao, AMD</li>
				<li>Norbert Nopper, Freescale</li>
				<li>Alon Or-bach, Samsung</li>
				<li>Daniel Rakos, AMD</li>
				<li>Graham Sellers, AMD</li>
				<li>Jeff Vigil, Qualcomm</li>
				<li>Chia-I Wu, LunarG</li>
				<li>Jason Ekstrand, Intel</li>
			</ul></dd>

			<dt><b>Contacts</b></dt>
			<dd><ul>
				<li>James Jones, NVIDIA</li>
				<li>Ian Elliott, LunarG</li>
			</ul></dd>
		</dl>

		The {@code VK_KHR_surface} extension is an instance extension. It introduces {@code VkSurfaceKHR} objects, which abstract native platform surface or window objects for use with Vulkan. It also provides a way to determine whether a queue family in a physical device supports presenting to particular surface.

		Separate extensions for each each platform provide the mechanisms for creating {@code VkSurfaceKHR} objects, but once created they may be used in this and other platform-independent extensions, in particular the {@code VK_KHR_swapchain} extension.

		<h5>Examples</h5>
		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		The example code for the {@code VK_KHR_surface} and {@code VK_KHR_swapchain} extensions was removed from the appendix after revision 1.0.29. This WSI example code was ported to the cube demo that is shipped with the official Khronos SDK, and is being kept up-to-date in that location (see: https://github.com/KhronosGroup/Vulkan-LoaderAndValidationLayers/blob/master/demos/cube.c).
		</div>
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
		"Extends {@code VkResult}.",

		"ERROR_SURFACE_LOST_KHR".."-1000000000",
		"ERROR_NATIVE_WINDOW_IN_USE_KHR".."-1000000001"
	)

	EnumConstant(
		"""
		VkSurfaceTransformFlagBitsKHR - presentation transforms supported on a device

		<h5>Description</h5>
		These values are described as follows:

		<ul>
			<li>#SURFACE_TRANSFORM_IDENTITY_BIT_KHR: The image content is presented without being transformed.</li>
			<li>#SURFACE_TRANSFORM_ROTATE_90_BIT_KHR: The image content is rotated 90 degrees clockwise.</li>
			<li>#SURFACE_TRANSFORM_ROTATE_180_BIT_KHR: The image content is rotated 180 degrees clockwise.</li>
			<li>#SURFACE_TRANSFORM_ROTATE_270_BIT_KHR: The image content is rotated 270 degrees clockwise.</li>
			<li>#SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR: The image content is mirrored horizontally.</li>
			<li>#SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR: The image content is mirrored horizontally, then rotated 90 degrees clockwise.</li>
			<li>#SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR: The image content is mirrored horizontally, then rotated 180 degrees clockwise.</li>
			<li>#SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR: The image content is mirrored horizontally, then rotated 270 degrees clockwise.</li>
			<li>#SURFACE_TRANSFORM_INHERIT_BIT_KHR: The presentation transform is not specified, and is instead determined by platform-specific considerations and mechanisms outside Vulkan.</li>
		</ul>

		<h5>See Also</h5>
		##VkDisplaySurfaceCreateInfoKHR, ##VkSurfaceCapabilities2EXT, ##VkSurfaceCapabilitiesKHR, {@code VkSurfaceTransformFlagsKHR}, ##VkSwapchainCreateInfoKHR
		""",

		"SURFACE_TRANSFORM_IDENTITY_BIT_KHR".enum(0x00000001),
		"SURFACE_TRANSFORM_ROTATE_90_BIT_KHR".enum(0x00000002),
		"SURFACE_TRANSFORM_ROTATE_180_BIT_KHR".enum(0x00000004),
		"SURFACE_TRANSFORM_ROTATE_270_BIT_KHR".enum(0x00000008),
		"SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR".enum(0x00000010),
		"SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR".enum(0x00000020),
		"SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR".enum(0x00000040),
		"SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR".enum(0x00000080),
		"SURFACE_TRANSFORM_INHERIT_BIT_KHR".enum(0x00000100)
	)

	EnumConstant(
		"""
		VkCompositeAlphaFlagBitsKHR - alpha compositing modes supported on a device

		<h5>Description</h5>
		These values are described as follows:

		<ul>
			<li>#COMPOSITE_ALPHA_OPAQUE_BIT_KHR: The alpha channel, if it exists, of the images is ignored in the compositing process. Instead, the image is treated as if it has a constant alpha of 1.0.</li>
			<li>#COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR: The alpha channel, if it exists, of the images is respected in the compositing process. The non-alpha channels of the image are expected to already be multiplied by the alpha channel by the application.</li>
			<li>#COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR: The alpha channel, if it exists, of the images is respected in the compositing process. The non-alpha channels of the image are not expected to already be multiplied by the alpha channel by the application; instead, the compositor will multiply the non-alpha channels of the image by the alpha channel during compositing.</li>
			<li>#COMPOSITE_ALPHA_INHERIT_BIT_KHR: The way in which the presentation engine treats the alpha channel in the images is unknown to the Vulkan API. Instead, the application is responsible for setting the composite alpha blending mode using native window system commands. If the application does not set the blending mode using native window system commands, then a platform-specific default will be used.</li>
		</ul>

		<h5>See Also</h5>
		{@code VkCompositeAlphaFlagsKHR}, ##VkSwapchainCreateInfoKHR
		""",

		"COMPOSITE_ALPHA_OPAQUE_BIT_KHR".enum(0x00000001),
		"COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR".enum(0x00000002),
		"COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR".enum(0x00000004),
		"COMPOSITE_ALPHA_INHERIT_BIT_KHR".enum(0x00000008)
	)

	EnumConstant(
		"""
		VkColorSpaceKHR - supported color space of the presentation engine

		<h5>Description</h5>
		<ul>
			<li>
				#COLOR_SPACE_SRGB_NONLINEAR_KHR: The presentation engine supports the sRGB color space.
				<ul>
					<li>#COLOR_SPACE_SCRGB_LINEAR_EXT - supports the scRGB color space and applies a linear OETF.</li>
					<li>#COLOR_SPACE_SCRGB_NONLINEAR_EXT - supports the scRGB color space and applies the scRGB OETF.</li>
					<li>#COLOR_SPACE_DCI_P3_LINEAR_EXT - supports the DCI-P3 color space and applies a linear OETF.</li>
					<li>#COLOR_SPACE_DCI_P3_NONLINEAR_EXT - supports the DCI-P3 color space and applies the Gamma 2.6 OETF.</li>
					<li>#COLOR_SPACE_BT709_LINEAR_EXT - supports the BT709 color space and applies a linear OETF.</li>
					<li>#COLOR_SPACE_BT709_NONLINEAR_EXT - supports the BT709 color space and applies the SMPTE 170M OETF.</li>
					<li>#COLOR_SPACE_BT2020_LINEAR_EXT - supports the BT2020 color space and applies a linear OETF.</li>
					<li>#COLOR_SPACE_BT2020_NONLINEAR_EXT - supports the BT2020 color space and applies the SMPTE 170M OETF.</li>
					<li>#COLOR_SPACE_ADOBERGB_LINEAR_EXT - supports the AdobeRGB color space and applies a linear OETF.</li>
					<li>#COLOR_SPACE_ADOBERGB_NONLINEAR_EXT - supports the AdobeRGB color space and applies the Gamma 2.2 OETF.</li>
				</ul>
			</li>
		</ul>

		The color components of Non-linear color space swap chain images have had the appropriate transfer function applied. Vulkan requires that all implementations support the sRGB OETF and EOTF transfer functions when using an SRGB pixel format. Other transfer functions, such as SMPTE 170M, <b>must</b> not be performed by the implementation, but <b>can</b> be performed by the application shader.

		If {@code pSurfaceFormats} includes an entry whose value for {@code colorSpace} is #COLOR_SPACE_SRGB_NONLINEAR_KHR and whose value for {@code format} is a UNORM (or SRGB) format and the corresponding SRGB (or UNORM) format is a color renderable format for #IMAGE_TILING_OPTIMAL, then {@code pSurfaceFormats} <b>must</b> also contain an entry with the same value for {@code colorSpace} and {@code format} equal to the corresponding SRGB (or UNORM) format.

		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		If {@code pSurfaceFormats} includes just one entry, whose value for {@code format} is #FORMAT_UNDEFINED, {@code surface} has no preferred format. In this case, the application <b>can</b> use any valid {@code VkFormat} value.
		</div>

		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		In the initial release of the {@code VK_KHR_surface} and {@code VK_KHR_swapchain} extensions, the token #COLORSPACE_SRGB_NONLINEAR_KHR was used. Starting in the May 13, 2016 updates to the extension branches, matching release 1.0.13 of the core API specification, #COLOR_SPACE_SRGB_NONLINEAR_KHR is used instead for consistency with Vulkan naming rules. The older enum is still available for backwards compatibility.
		</div>

		<h5>See Also</h5>
		##VkSurfaceFormatKHR, ##VkSwapchainCreateInfoKHR
		""",

		"COLOR_SPACE_SRGB_NONLINEAR_KHR".."0"
	)

	EnumConstant(
		"""
		VkPresentModeKHR - presentation mode supported for a surface

		<h5>Description</h5>
		<ul>
			<li>#PRESENT_MODE_IMMEDIATE_KHR: The presentation engine does not wait for a vertical blanking period to update the current image, meaning this mode <b>may</b> result in visible tearing. No internal queuing of presentation requests is needed, as the requests are applied immediately.</li>
			<li>#PRESENT_MODE_MAILBOX_KHR: The presentation engine waits for the next vertical blanking period to update the current image. Tearing <b>cannot</b> be observed. An internal single-entry queue is used to hold pending presentation requests. If the queue is full when a new presentation request is received, the new request replaces the existing entry, and any images associated with the prior entry become available for re-use by the application. One request is removed from the queue and processed during each vertical blanking period in which the queue is non-empty.</li>
			<li>#PRESENT_MODE_FIFO_KHR: The presentation engine waits for the next vertical blanking period to update the current image. Tearing <b>cannot</b> be observed. An internal queue is used to hold pending presentation requests. New requests are appended to the end of the queue, and one request is removed from the beginning of the queue and processed during each vertical blanking period in which the queue is non-empty. This is the only value of {@code presentMode} that is required: to be supported.</li>
			<li>#PRESENT_MODE_FIFO_RELAXED_KHR: The presentation engine generally waits for the next vertical blanking period to update the current image. If a vertical blanking period has already passed since the last update of the current image then the presentation engine does not wait for another vertical blanking period for the update, meaning this mode <b>may</b> result in visible tearing in this case. This mode is useful for reducing visual stutter with an application that will mostly present a new image before the next vertical blanking period, but may occasionally be late, and present a new image just after the next vertical blanking period. An internal queue is used to hold pending presentation requests. New requests are appended to the end of the queue, and one request is removed from the beginning of the queue and processed during or after each vertical blanking period in which the queue is non-empty.</li>
		</ul>

		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		For reference, the mode indicated by #PRESENT_MODE_FIFO_KHR is equivalent to the behavior of {wgl|glX|egl}SwapBuffers with a swap interval of 1, while the mode indicated by #PRESENT_MODE_FIFO_RELAXED_KHR is equivalent to the behavior of {wgl|glX}SwapBuffers with a swap interval of -1 (from the {WGL|GLX}_EXT_swap_control_tear extensions).
		</div>

		<h5>See Also</h5>
		##VkSwapchainCreateInfoKHR, #GetPhysicalDeviceSurfacePresentModesKHR()
		""",

		"PRESENT_MODE_IMMEDIATE_KHR".."0",
		"PRESENT_MODE_MAILBOX_KHR".."1",
		"PRESENT_MODE_FIFO_KHR".."2",
		"PRESENT_MODE_FIFO_RELAXED_KHR".."3"
	)

	void(
		"DestroySurfaceKHR",
		"""
		Destroy a VkSurfaceKHR object.

		<h5>C Specification</h5>
		To destroy a {@code VkSurfaceKHR} object, call:

		<pre><code>void vkDestroySurfaceKHR(
￿    VkInstance                                  instance,
￿    VkSurfaceKHR                                surface,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

		<h5>Description</h5>
		Destroying a {@code VkSurfaceKHR} merely severs the connection between Vulkan and the native surface, and does not imply destroying the native surface, closing a window, or similar behavior.

		<h5>Valid Usage</h5>
		<ul>
			<li>All {@code VkSwapchainKHR} objects created for {@code surface} <b>must</b> have been destroyed prior to destroying {@code surface}</li>
			<li>If ##VkAllocationCallbacks were provided when {@code surface} was created, a compatible set of callbacks <b>must</b> be provided here</li>
			<li>If no ##VkAllocationCallbacks were provided when {@code surface} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
			<li>If {@code surface} is not #NULL_HANDLE, {@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
			<li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
			<li>If {@code surface} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code instance}</li>
		</ul>

		<h5>Host Synchronization</h5>
		<ul>
			<li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
		</ul>

		<h5>See Also</h5>
		##VkAllocationCallbacks
		""",

		VkInstance.IN("instance", "the instance used to create the surface."),
		VkSurfaceKHR.IN("surface", "the surface to destroy."),
		nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a>).")
	)

	VkResult(
		"GetPhysicalDeviceSurfaceSupportKHR",
		"""
		Query if presentation is supported.

		<h5>C Specification</h5>
		To determine whether a queue family of a physical device supports presentation to a given surface, call:

		<pre><code>VkResult vkGetPhysicalDeviceSurfaceSupportKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t                                    queueFamilyIndex,
￿    VkSurfaceKHR                                surface,
￿    VkBool32*                                   pSupported);</code></pre>

		<h5>Valid Usage</h5>
		<ul>
			<li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties() for the given {@code physicalDevice}</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
			<li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
			<li>{@code pSupported} <b>must</b> be a pointer to a {@code VkBool32} value</li>
		</ul>

		<h5>Return Codes</h5>
		<dl>
			<dt>On success, this command returns</dt>
			<dd><ul>
				<li>#SUCCESS</li>
			</ul></dd>

			<dt>On failure, this command returns</dt>
			<dd><ul>
				<li>#ERROR_OUT_OF_HOST_MEMORY</li>
				<li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
				<li>#ERROR_SURFACE_LOST_KHR</li>
			</ul></dd>
		</dl>
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device."),
		uint32_t.IN("queueFamilyIndex", "the queue family."),
		VkSurfaceKHR.IN("surface", "the surface."),
		Check(1)..VkBool32.p.OUT("pSupported", "a pointer to a {@code VkBool32}, which is set to #TRUE to indicate support, and #FALSE otherwise.")
	)

	VkResult(
		"GetPhysicalDeviceSurfaceCapabilitiesKHR",
		"""
		Query surface capabilities.

		<h5>C Specification</h5>
		To query the basic capabilities of a surface, needed in order to create a swapchain, call:

		<pre><code>VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkSurfaceKHR                                surface,
￿    VkSurfaceCapabilitiesKHR*                   pSurfaceCapabilities);</code></pre>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
			<li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
			<li>{@code pSurfaceCapabilities} <b>must</b> be a pointer to a ##VkSurfaceCapabilitiesKHR structure</li>
		</ul>

		<h5>Return Codes</h5>
		<dl>
			<dt>On success, this command returns</dt>
			<dd><ul>
				<li>#SUCCESS</li>
			</ul></dd>

			<dt>On failure, this command returns</dt>
			<dd><ul>
				<li>#ERROR_OUT_OF_HOST_MEMORY</li>
				<li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
				<li>#ERROR_SURFACE_LOST_KHR</li>
			</ul></dd>
		</dl>

		<h5>See Also</h5>
		##VkSurfaceCapabilitiesKHR
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device that will be associated with the swapchain to be created, as described for #CreateSwapchainKHR()."),
		VkSurfaceKHR.IN("surface", "the surface that will be associated with the swapchain."),
		VkSurfaceCapabilitiesKHR.p.OUT("pSurfaceCapabilities", "a pointer to an instance of the ##VkSurfaceCapabilitiesKHR structure in which the capabilities are returned.")
	)

	VkResult(
		"GetPhysicalDeviceSurfaceFormatsKHR",
		"""
		Query color formats supported by surface.

		<h5>C Specification</h5>
		To query the supported swapchain format-color space pairs for a surface, call:

		<pre><code>VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkSurfaceKHR                                surface,
￿    uint32_t*                                   pSurfaceFormatCount,
￿    VkSurfaceFormatKHR*                         pSurfaceFormats);</code></pre>

		<h5>Description</h5>
		If {@code pSurfaceFormats} is {@code NULL}, then the number of format pairs supported for the given {@code surface} is returned in {@code pSurfaceFormatCount}. The number of format pairs supported will be greater than or equal to 1. Otherwise, {@code pSurfaceFormatCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSurfaceFormats} array, and on return the variable is overwritten with the number of structures actually written to {@code pSurfaceFormats}. If the value of {@code pSurfaceFormatCount} is less than the number of format pairs supported, at most {@code pSurfaceFormatCount} structures will be written. If {@code pSurfaceFormatCount} is smaller than the number of format pairs supported for the given {@code surface}, #INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the available values were returned.

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
			<li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
			<li>{@code pSurfaceFormatCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
			<li>If the value referenced by {@code pSurfaceFormatCount} is not 0, and {@code pSurfaceFormats} is not {@code NULL}, {@code pSurfaceFormats} <b>must</b> be a pointer to an array of {@code pSurfaceFormatCount} ##VkSurfaceFormatKHR structures</li>
		</ul>

		<h5>Return Codes</h5>
		<dl>
			<dt>On success, this command returns</dt>
			<dd><ul>
				<li>#SUCCESS</li>
				<li>#INCOMPLETE</li>
			</ul></dd>

			<dt>On failure, this command returns</dt>
			<dd><ul>
				<li>#ERROR_OUT_OF_HOST_MEMORY</li>
				<li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
				<li>#ERROR_SURFACE_LOST_KHR</li>
			</ul></dd>
		</dl>

		<h5>See Also</h5>
		##VkSurfaceFormatKHR
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device that will be associated with the swapchain to be created, as described for #CreateSwapchainKHR()."),
		VkSurfaceKHR.IN("surface", "the surface that will be associated with the swapchain."),
		AutoSize("pSurfaceFormats")..Check(1)..uint32_t_p.INOUT("pSurfaceFormatCount", "a pointer to an integer related to the number of format pairs available or queried, as described below."),
		nullable..VkSurfaceFormatKHR.p.OUT("pSurfaceFormats", "either {@code NULL} or a pointer to an array of ##VkSurfaceFormatKHR structures.")
	)

	VkResult(
		"GetPhysicalDeviceSurfacePresentModesKHR",
		"""
		Query supported presentation modes.

		<h5>C Specification</h5>
		To query the supported presentation modes for a surface, call:

		<pre><code>VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkSurfaceKHR                                surface,
￿    uint32_t*                                   pPresentModeCount,
￿    VkPresentModeKHR*                           pPresentModes);</code></pre>

		<h5>Description</h5>
		If {@code pPresentModes} is {@code NULL}, then the number of presentation modes supported for the given {@code surface} is returned in {@code pPresentModeCount}. Otherwise, {@code pPresentModeCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPresentModes} array, and on return the variable is overwritten with the number of values actually written to {@code pPresentModes}. If the value of {@code pPresentModeCount} is less than the number of presentation modes supported, at most {@code pPresentModeCount} values will be written. If {@code pPresentModeCount} is smaller than the number of presentation modes supported for the given {@code surface}, #INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the available values were returned.

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
			<li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
			<li>{@code pPresentModeCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
			<li>If the value referenced by {@code pPresentModeCount} is not 0, and {@code pPresentModes} is not {@code NULL}, {@code pPresentModes} <b>must</b> be a pointer to an array of {@code pPresentModeCount} {@code VkPresentModeKHR} values</li>
		</ul>

		<h5>Return Codes</h5>
		<dl>
			<dt>On success, this command returns</dt>
			<dd><ul>
				<li>#SUCCESS</li>
				<li>#INCOMPLETE</li>
			</ul></dd>

			<dt>On failure, this command returns</dt>
			<dd><ul>
				<li>#ERROR_OUT_OF_HOST_MEMORY</li>
				<li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
				<li>#ERROR_SURFACE_LOST_KHR</li>
			</ul></dd>
		</dl>
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device that will be associated with the swapchain to be created, as described for #CreateSwapchainKHR()."),
		VkSurfaceKHR.IN("surface", "the surface that will be associated with the swapchain."),
		AutoSize("pPresentModes")..Check(1)..uint32_t_p.INOUT("pPresentModeCount", "a pointer to an integer related to the number of presentation modes available or queried, as described below."),
		nullable..VkPresentModeKHR.p.OUT("pPresentModes", "either {@code NULL} or a pointer to an array of {@code VkPresentModeKHR} values.")
	)
}