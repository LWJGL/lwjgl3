/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_display_swapchain = "KHRDisplaySwapchain".nativeClassVK("KHR_display_swapchain", postfix = KHR) {
	documentation =
		"""
		<dl>
			<dt><b>Name String</b></dt>
			<dd>VK_KHR_display_swapchain</dd>

			<dt><b>Extension Type</b></dt>
			<dd>Device extension</dd>

			<dt><b>Registered Extension Number</b></dt>
			<dd>4</dd>

			<dt><b>Status</b></dt>
			<dd>Draft.</dd>

			<dt><b>Last Modified Date</b></dt>
			<dd>2015-11-10</dd>

			<dt><b>Revision</b></dt>
			<dd>9</dd>

			<dt><b>IP Status</b></dt>
			<dd>No known IP claims.</dd>

			<dt><b>Dependencies</b></dt>
			<dd><ul>
				<li>This extension is written against version 1.0 of the Vulkan API.</li>
				<li>Requires VK_KHR_swapchain.</li>
				<li>Requires VK_KHR_display.</li>
			</ul></dd>

			<dt><b>Contributors</b></dt>
			<dd><ul>
				<li>James Jones, NVIDIA</li>
				<li>Jeff Vigil, Qualcomm</li>
				<li>Jesse Hall, Google</li>
			</ul></dd>

			<dt><b>Contacts</b></dt>
			<dd><ul>
				<li>James Jones (jajones 'at' nvidia.com)</li>
			</ul></dd>
		</dl>

		This extension provides an API to create a swapchain directly on a device's display without any underlying window system.

		<h5>Examples</h5>
		<b>Example 1</b>

		Create a swapchain on a display mode and plane

		<pre><code>￿    // See VK_KHR_display for an example of how to pick a display,
￿    // display mode, plane, and how to create a VkSurfaceKHR for
￿    // that plane.
￿    extern VkPhysicalDevice physDevice;
￿    extern VkDisplayModePropertiesKHR myModeProps;
￿    extern VkSurfaceKHR mySurface;
￿    extern VkDevice device;
￿
￿    uint32_t queueCount, i;
￿    uint32_t presentQueueFamilyIndex = UINT32_MAX;
￿    VkBool32 supportsPresent;
￿
￿    // Find a queue family that supports presenting to this surface
￿    uint32_t familyCount;
￿    vkGetPhysicalDeviceQueueFamilyProperties(physDevice, &familyCount, NULL);
￿
￿    for (i = 0; i < familyCount; ++i)
￿    {
￿        vkGetPhysicalDeviceSurfaceSupportKHR(physDevice, i, mySurface, &supportsPresent);
￿
￿        if (supportsPresent) {
￿            // Found a queue family that supports present.  See
￿            // VK_KHR_surface for an example of how to find a queue that
￿            // supports both presentation and graphics
￿            presentQueueFamilyIndex = i;
￿            break;
￿        }
￿    }
￿
￿    // Figure out which formats and present modes this surface supports.
￿    uint32_t formatCount;
￿    vkGetPhysicalDeviceSurfaceFormatsKHR(physDevice, mySurface, &formatCount, NULL);
￿
￿    VkSurfaceFormatKHR* formats = (VkSurfaceFormatKHR*)malloc(sizeof(VkSurfaceFormatKHR) * formatCount);
￿    vkGetPhysicalDeviceSurfaceFormatsKHR(physDevice, mySurface, &formatCount, formats);
￿
￿    const VkSwapchainCreateInfoKHR createInfo =
￿    {
￿        VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR,    // sType
￿        NULL,                                           // pNext
￿        0,                                              // flags
￿        mySurface,                                      // surface
￿        3,                                              // minImageCount
￿        formats[0].format,                              // imageFormat
￿        formats[0].colorSpace,                          // imageColorSpace
￿        myModeProps.parameters.visibleRegion,           // imageExtent
￿        1,                                              // imageArrayLayers
￿        VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT,            // imageUsage
￿        VK_SHARING_MODE_EXCLUSIVE,                      // imageSharingMode
￿        0,                                              // queueFamilyIndexCount
￿        NULL,                                           // pQueueFamilyIndices
￿        VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR,          // preTransform
￿        VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR,              // compositeAlpha
￿        VK_PRESENT_MODE_FIFO_KHR,                       // presentMode
￿        VK_TRUE,                                        // clipped
￿        VK_NULL_HANDLE                                  // oldSwapchain
￿    };
￿
￿    VkSwapchainKHR swapchain;
￿    // This is equivalent to vkCreateSwapchainKHR.
￿    vkCreateSharedSwapchainsKHR(device, 1, &createInfo, NULL, &swapchain);</code></pre>
		"""

	IntConstant(
		"The extension specification version.",

		"KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION".."9"
	)

	StringConstant(
		"The extension name.",

		"KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME".."VK_KHR_display_swapchain"
	)

	EnumConstant(
		"Extends {@code VkStructureType}.",

		"STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR".."1000003000"
	)

	EnumConstant(
		"Extends {@code VkResult}.",

		"ERROR_INCOMPATIBLE_DISPLAY_KHR".."-1000003001"
	)

	VkResult(
		"CreateSharedSwapchainsKHR",
		"""
		Create multiple swapchains that share presentable images.

		<h5>C Specification</h5>
		When the {@code VK_KHR_display_swapchain} extension is enabled, multiple swapchains that share presentable images are created by calling:

		<pre><code>VkResult vkCreateSharedSwapchainsKHR(
￿    VkDevice                                    device,
￿    uint32_t                                    swapchainCount,
￿    const VkSwapchainCreateInfoKHR*             pCreateInfos,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSwapchainKHR*                             pSwapchains);</code></pre>

		<h5>Description</h5>
		#CreateSharedSwapchainsKHR() is similar to #CreateSwapchainKHR(), except that it takes an array of ##VkSwapchainCreateInfoKHR structures, and returns an array of swapchain objects.

		The swapchain creation parameters that affect the properties and number of presentable images <b>must</b> match between all the swapchains. If the displays used by any of the swapchains do not use the same presentable image layout or are incompatible in a way that prevents sharing images, swapchain creation will fail with the result code #ERROR_INCOMPATIBLE_DISPLAY_KHR. If any error occurs, no swapchains will be created. Images presented to multiple swapchains <b>must</b> be re-acquired from all of them before transitioning away from #IMAGE_LAYOUT_PRESENT_SRC_KHR. After destroying one or more of the swapchains, the remaining swapchains and the presentable images <b>can</b> continue to be used.

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
			<li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code swapchainCount} valid ##VkSwapchainCreateInfoKHR structures</li>
			<li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
			<li>{@code pSwapchains} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code VkSwapchainKHR} handles</li>
			<li>{@code swapchainCount} <b>must</b> be greater than 0</li>
		</ul>

		<h5>Host Synchronization</h5>
		<ul>
			<li>Host access to {@code pCreateInfos}[].surface <b>must</b> be externally synchronized</li>
			<li>Host access to {@code pCreateInfos}[].oldSwapchain <b>must</b> be externally synchronized</li>
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
				<li>#ERROR_INCOMPATIBLE_DISPLAY_KHR</li>
				<li>#ERROR_DEVICE_LOST</li>
				<li>#ERROR_SURFACE_LOST_KHR</li>
			</ul></dd>
		</dl>

		<h5>See Also</h5>
		##VkAllocationCallbacks, ##VkSwapchainCreateInfoKHR
		""",

		VkDevice.IN("device", "the device to create the swapchains for."),
		AutoSize("pCreateInfos", "pSwapchains")..uint32_t.IN("swapchainCount", "the number of swapchains to create."),
		const..VkSwapchainCreateInfoKHR.p.IN("pCreateInfos", "a pointer to an array of ##VkSwapchainCreateInfoKHR structures specifying the parameters of the created swapchains."),
		nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "the allocator used for host memory allocated for the swapchain objects when there is no more specific allocator available (see <a href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
		VkSwapchainKHR.p.OUT("pSwapchains", "a pointer to an array of {@code VkSwapchainKHR} handles in which the created swapchain objects will be returned.")
	)
}