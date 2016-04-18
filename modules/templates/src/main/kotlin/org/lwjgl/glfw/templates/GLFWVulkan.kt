/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*
import org.lwjgl.vulkan.*

val GLFWVulkan = dependsOn(Binding.VULKAN) {
	"GLFWVulkan".nativeClass(packageName = GLFW_PACKAGE, prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
		javaImport ("org.lwjgl.vulkan.*")

		documentation =
			"Native bindings to the GLFW library's Vulkan functions."

		GLFWboolean(
			"VulkanSupported",
			"""
			Returns whether the Vulkan loader has been found. This check is performed by GLFW#Init().

			The availability of a Vulkan loader does not by itself guarantee that window surface creation or even device creation is possible. Call
			#GetRequiredInstanceExtensions() to check whether the extensions necessary for Vulkan surface creation are available and
			#GetPhysicalDevicePresentationSupport() to check whether a queue family of a physical device supports image presentation.

			Possible errors include GLFW#NOT_INITIALIZED.

			This function may be called from any thread.
			""",

			returnDoc = "GLFW#TRUE if Vulkan is available, or GLFW#FALSE otherwise",
			since = "version 3.2"
		)

		(const..charASCII_pp)(
			"GetRequiredInstanceExtensions",
			"""
			Returns an array of names of Vulkan instance extensions required by GLFW for creating Vulkan surfaces for GLFW windows. If successful, the list
			will always contain {@code VK_KHR_surface}, so if you don't require any additional extensions you can pass this list directly to the
			##VkInstanceCreateInfo struct.

			If Vulkan is not available on the machine, this function returns $NULL and generates a GLFW#API_UNAVAILABLE error. Call #VulkanSupported() to check
			whether Vulkan is available.

			If Vulkan is available but no set of extensions allowing window surface creation was found, this function returns $NULL. You may still use Vulkan
			for off-screen rendering and compute work.

			Additional extensions may be required by future versions of GLFW. You should check if any extensions you wish to enable are already in the returned
			array, as it is an error to specify an extension more than once in the {@code VkInstanceCreateInfo} struct.

			The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the library is
			terminated.

			This function may be called from any thread.

			Possible errors include GLFW#NOT_INITIALIZED and GLFW#API_UNAVAILABLE.
			""",

			AutoSizeResult..uint32_t_p.OUT(
				"count",
				"where to store the number of extensions in the returned array. This is set to zero if an error occurred."
			),

			returnDoc = "an array of ASCII encoded extension names, or $NULL if an error occurred",
			since = "version 3.2"
		)

		GLFWvkproc(
			"GetInstanceProcAddress",
			"""
			Returns the address of the specified Vulkan core or extension function for the specified instance. If instance is set to $NULL it can return any
			function exported from the Vulkan loader, including at least the following functions:
			${ul(
				"VK10##vkEnumerateInstanceExtensionProperties()",
				"VK10##vkEnumerateInstanceLayerProperties()",
				"VK10##vkCreateInstance()",
				"VK10##vkGetInstanceProcAddr()"
			)}

			If Vulkan is not available on the machine, this function returns $NULL and generates a GLFW#API_UNAVAILABLE error. Call #VulkanSupported() to check
			whether Vulkan is available.

			This function is equivalent to calling VK10##vkGetInstanceProcAddr() with a platform-specific query of the Vulkan loader as a fallback.

			Possible errors include GLFW#NOT_INITIALIZED and GLFW#API_UNAVAILABLE.

			The returned function pointer is valid until the library is terminated.

			This function may be called from any thread.
			""",

			nullable..VkInstance.IN("instance", "the Vulkan instance to query, or $NULL to retrieve functions related to instance creation"),
			const..charASCII_p.IN("procname", "the ASCII encoded name of the function"),

			returnDoc = "the address of the function, or $NULL if an error occurred",
			since = "version 3.2"
		)

		GLFWboolean(
			"GetPhysicalDevicePresentationSupport",
			"""
			Returns whether the specified queue family of the specified physical device supports presentation to the platform GLFW was built for.

			If Vulkan or the required window surface creation instance extensions are not available on the machine, or if the specified instance was not
			created with the required extensions, this function returns GLFW#FALSE and generates a GLFW#API_UNAVAILABLE error. Call #VulkanSupported() to check
			whether Vulkan is available and #GetRequiredInstanceExtensions() to check what instance extensions are required.

			Possible errors include GLFW#NOT_INITIALIZED, GLFW#API_UNAVAILABLE and GLFW#PLATFORM_ERROR.

			This function may be called from any thread. For synchronization details of Vulkan objects, see the Vulkan specification.
			""",

			VkInstance.IN("instance", "the instance that the physical device belongs to"),
			VkPhysicalDevice.IN("device", "the physical device that the queue family belongs to"),
			uint32_t.IN("queuefamily", "the index of the queue family to query"),

			returnDoc = "GLFW#TRUE if the queue family supports presentation, or GLFW#FALSE otherwise",
			since = "version 3.2"
		)

		VkResult(
			"CreateWindowSurface",
			"""
			Creates a Vulkan surface for the specified window.

			If the Vulkan loader was not found at initialization, this function returns VK10##VK_ERROR_INITIALIZATION_FAILED and generates a
			GLFW#API_UNAVAILABLE error. Call #VulkanSupported() to check whether the Vulkan loader was found.

			If the required window surface creation instance extensions are not available or if the specified instance was not created with these extensions
			enabled, this function returns VK10##VK_ERROR_EXTENSION_NOT_PRESENT and generates a GLFW#API_UNAVAILABLE error. Call
			#GetRequiredInstanceExtensions() to check what instance extensions are required.

			The window surface must be destroyed before the specified Vulkan instance. It is the responsibility of the caller to destroy the window surface.
			GLFW does not destroy it for you. Call KHRSurface##vkDestroySurfaceKHR() to destroy the surface.

			Possible errors include GLFW#NOT_INITIALIZED, GLFW#API_UNAVAILABLE and GLFW#PLATFORM_ERROR.

			If an error occurs before the creation call is made, GLFW returns the Vulkan error code most appropriate for the error. Appropriate use of
			#VulkanSupported() and #GetRequiredInstanceExtensions() should eliminate almost all occurrences of these errors.

			This function may be called from any thread. For synchronization details of Vulkan objects, see the Vulkan specification.
			""",

			VkInstance.IN("instance", "the Vulkan instance to create the surface in"),
			GLFWwindow.IN("window", "the window to create the surface for"),
			nullable..const..VkAllocationCallbacks_p.IN("allocator", "the allocator to use, or $NULL to use the default allocator."),
			Check(1)..VkSurfaceKHR_p.OUT("surface", "where to store the handle of the surface. This is set to VK10##VK_NULL_HANDLE if an error occurred."),

			returnDoc = "VK10##VK_SUCCESS if successful, or a Vulkan error code if an error occurred",
			since = "version 3.2"
		)
	}
}