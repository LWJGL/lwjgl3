/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_win32_surface = "KHRWin32Surface".nativeClassVK("KHR_win32_surface", postfix = KHR) {
	documentation =
		"""
		The {@code VK_KHR_win32_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@code VK_KHR_surface} extension) that refers to a Win32 {@code HWND}, as well as a query to determine support for rendering to the windows desktop.
		"""

	IntConstant(
		"The extension specification version.",

		"KHR_WIN32_SURFACE_SPEC_VERSION".."5"
	)

	StringConstant(
		"The extension name.",

		"KHR_WIN32_SURFACE_EXTENSION_NAME".."VK_KHR_win32_surface"
	)

	EnumConstant(
		"Extends {@code VkStructureType}.",

		"STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR".."1000009000"
	)

	VkResult(
		"CreateWin32SurfaceKHR",
		"""
		Create a {@code VkSurfaceKHR} object for an Win32 native window.

		<h5>C Specification</h5>
		To create a {@code VkSurfaceKHR} object for a Win32 window, call:

		<pre><code>VkResult vkCreateWin32SurfaceKHR(
￿    VkInstance                                  instance,
￿    const VkWin32SurfaceCreateInfoKHR*          pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSurfaceKHR*                               pSurface);</code></pre>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
			<li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkWin32SurfaceCreateInfoKHR structure</li>
			<li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
			<li>{@code pSurface} <b>must</b> be a pointer to a {@code VkSurfaceKHR} handle</li>
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
			</ul></dd>
		</dl>

		<h5>See Also</h5>
		##VkAllocationCallbacks, ##VkWin32SurfaceCreateInfoKHR
		""",

		VkInstance.IN("instance", "the instance to associate the surface with."),
		const..VkWin32SurfaceCreateInfoKHR.p.IN("pCreateInfo", "a pointer to an instance of the ##VkWin32SurfaceCreateInfoKHR structure containing parameters affecting the creation of the surface object."),
		nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
		Check(1)..VkSurfaceKHR.p.OUT("pSurface", "points to a {@code VkSurfaceKHR} handle in which the created surface object is returned.")
	)

	VkBool32(
		"GetPhysicalDeviceWin32PresentationSupportKHR",
		"""
		query queue family support for presentation on a Win32 display.

		<h5>C Specification</h5>
		To determine whether a queue family of a physical device supports presentation to the Microsoft Windows desktop, call:

		<pre><code>VkBool32 vkGetPhysicalDeviceWin32PresentationSupportKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t                                    queueFamilyIndex);</code></pre>

		<h5>Description</h5>
		This platform-specific function <b>can</b> be called prior to creating a surface.

		<h5>Valid Usage</h5>
		<ul>
			<li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties() for the given {@code physicalDevice}</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
		</ul>
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device."),
		uint32_t.IN("queueFamilyIndex", "the queue family index.")
	)
}