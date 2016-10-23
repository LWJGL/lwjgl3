/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*
import org.lwjgl.system.windows.*

// Handle types
val VkSurfaceKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSurfaceKHR")
val VkSwapchainKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSwapchainKHR")
val VkDisplayKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayKHR")
val VkDisplayModeKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayModeKHR")
val VkDebugReportCallbackEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDebugReportCallbackEXT")

// Enum types
val VkSurfaceTransformFlagBitsKHR = "VkSurfaceTransformFlagBitsKHR".enumType
val VkColorSpaceKHR = "VkColorSpaceKHR".enumType
val VkPresentModeKHR = "VkPresentModeKHR".enumType
val VkCompositeAlphaFlagBitsKHR = "VkCompositeAlphaFlagBitsKHR".enumType
val VkDisplayPlaneAlphaFlagBitsKHR = "VkDisplayPlaneAlphaFlagBitsKHR".enumType
val VkDebugReportObjectTypeEXT = "VkDebugReportObjectTypeEXT".enumType
val VkDebugReportErrorEXT = "VkDebugReportErrorEXT".enumType
val VkRasterizationOrderAMD = "VkRasterizationOrderAMD".enumType
val VkValidationCheckEXT = "VkValidationCheckEXT".enumType

// Bitmask types
val VkSurfaceTransformFlagsKHR = typedef(VkFlags, "VkSurfaceTransformFlagsKHR")
val VkCompositeAlphaFlagsKHR = typedef(VkFlags, "VkCompositeAlphaFlagsKHR")
val VkSwapchainCreateFlagsKHR = typedef(VkFlags, "VkSwapchainCreateFlagsKHR")
val VkDisplayPlaneAlphaFlagsKHR = typedef(VkFlags, "VkDisplayPlaneAlphaFlagsKHR")
val VkDisplayModeCreateFlagsKHR = typedef(VkFlags, "VkDisplayModeCreateFlagsKHR")
val VkDisplaySurfaceCreateFlagsKHR = typedef(VkFlags, "VkDisplaySurfaceCreateFlagsKHR")
val VkXlibSurfaceCreateFlagsKHR = typedef(VkFlags, "VkXlibSurfaceCreateFlagsKHR")
val VkWin32SurfaceCreateFlagsKHR = typedef(VkFlags, "VkWin32SurfaceCreateFlagsKHR")
val VkDebugReportFlagsEXT = typedef(VkFlags, "VkDebugReportFlagsEXT")

// Function pointer types
val PFN_vkDebugReportCallbackEXT = "PFN_vkDebugReportCallbackEXT".callback(
	VULKAN_PACKAGE, VkBool32, "VkDebugReportCallbackEXT",
	"Application-defined debug report callback function.",

	VkDebugReportFlagsEXT.IN("flags", "indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback."),
	VkDebugReportObjectTypeEXT.IN("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of object being used or created at the time the event was triggered."),
	uint64_t.IN("object", "gives the object where the issue was detected. {@code object} may be #NULL_OBJECT if there is no object associated with the event."),
	size_t.IN("location", "a component (layer, driver, loader) defined value that indicates the <em>location</em> of the trigger. This is an optional value."),
	int32_t.IN("messageCode", "a layer-defined value indicating what test triggered this callback."),
	const..char_p.IN("pLayerPrefix", "the abbreviation of the component making the callback."),
	const..char_p.IN("pMessage", "a null-terminated string detailing the trigger conditions."),
	voidptr.IN("pUserData", "the user data given when the DebugReportCallback was created.")
) {
	documentation =
		"""
		Application-defined debug report callback function.

		<h5>C Specification</h5>
		The prototype for the callback function implemented by the application is:

		<pre><code>typedef VkBool32 (VKAPI_PTR *PFN_vkDebugReportCallbackEXT)(
￿    VkDebugReportFlagsEXT                       flags,
￿    VkDebugReportObjectTypeEXT                  objectType,
￿    uint64_t                                    object,
￿    size_t                                      location,
￿    int32_t                                     messageCode,
￿    const char*                                 pLayerPrefix,
￿    const char*                                 pMessage,
￿    void*                                       pUserData);</code></pre>

		<h5>Description</h5>
		The callback returns a {@code VkBool32} that indicates to the calling layer if the Vulkan call <b>should</b> be aborted or not. Applications <b>should</b> always return #FALSE so that they see the same behavior with and without validation layers enabled.

		If the application returns #TRUE from its callback and the Vulkan call being aborted returns a {@code VkResult}, the layer will return #ERROR_VALIDATION_FAILED_EXT.

		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		The primary expected use of #ERROR_VALIDATION_FAILED_EXT is for validation layer testing. It is not expected that an application would see this error code during normal use of the validation layers.
		</div>

		<h5>See Also</h5>
		##VkDebugReportCallbackCreateInfoEXT
		"""
	useSystemCallConvention()
}

// Struct types
val VkSurfaceCapabilitiesKHR = struct(VULKAN_PACKAGE, "VkSurfaceCapabilitiesKHR", mutable = false) {
	documentation =
		"""
		Structure describing capabilities of a surface.

		<h5>Description</h5>
		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		Formulas such as <code>min(N, maxImageCount)</code> are not correct, since {@code maxImageCount} <b>may</b> be zero.
		</div>

		<h5>See Also</h5>
		##VkExtent2D, #GetPhysicalDeviceSurfaceCapabilitiesKHR()
		"""

	uint32_t.member("minImageCount", "the minimum number of images the specified device supports for a swapchain created for the surface.")
	uint32_t.member("maxImageCount", "the maximum number of images the specified device supports for a swapchain created for the surface. A value of 0 means that there is no limit on the number of images, though there <b>may</b> be limits related to the total amount of memory used by swapchain images.")
	VkExtent2D.member("currentExtent", "the current width and height of the surface, or the special value <code>(0xFFFFFFFF, 0xFFFFFFFF)</code> indicating that the surface size will be determined by the extent of a swapchain targeting the surface.")
	VkExtent2D.member("minImageExtent", "contains the smallest valid swapchain extent for the surface on the specified device.")
	VkExtent2D.member("maxImageExtent", "contains the largest valid swapchain extent for the surface on the specified device.")
	uint32_t.member("maxImageArrayLayers", "the maximum number of layers swapchain images <b>can</b> have for a swapchain created for this device and surface.")
	VkSurfaceTransformFlagsKHR.member("supportedTransforms", "a bitmask of {@code VkSurfaceTransformFlagBitsKHR}, describing the presentation transforms supported for the surface on the specified device.")
	VkSurfaceTransformFlagBitsKHR.member("currentTransform", "a bitmask of {@code VkSurfaceTransformFlagBitsKHR}, describing the surface&#8217;s current transform relative to the presentation engine&#8217;s natural orientation.")
	VkCompositeAlphaFlagsKHR.member("supportedCompositeAlpha", "a bitmask of {@code VkCompositeAlphaFlagBitsKHR}, representing the alpha compositing modes supported by the presentation engine for the surface on the specified device. Opaque composition <b>can</b> be achieved in any alpha compositing mode by either using a swapchain image format that has no alpha component, or by ensuring that all pixels in the swapchain images have an alpha value of 1.0.")
	VkImageUsageFlags.member("supportedUsageFlags", "a bitmask of {@code VkImageUsageFlagBits} representing the ways the application <b>can</b> use the presentable images of a swapchain created for the surface on the specified device. #IMAGE_USAGE_COLOR_ATTACHMENT_BIT <b>must</b> be included in the set but implementations <b>may</b> support additional usages.")
}

val VkSurfaceFormatKHR = struct(VULKAN_PACKAGE, "VkSurfaceFormatKHR", mutable = false) {
	documentation =
		"""
		Structure describing a supported swapchain format-color space pair.
		"""

	VkFormat.member("format", "a {@code VkFormat} that is compatible with the specified surface.")
	VkColorSpaceKHR.member("colorSpace", "a presentation {@code VkColorSpaceKHR} that is compatible with the surface.")
}

val VkSwapchainCreateInfoKHR = struct(VULKAN_PACKAGE, "VkSwapchainCreateInfoKHR") {
	documentation =
		"""
		Structure specifying parameters of a newly created swapchain object.

		<h5>Description</h5>
		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		Applications <b>should</b> set this value to #TRUE if they do not expect to read back the content of presentable images before presenting them or after reacquiring them and if their pixel shaders do not have any side effects that require them to run for all pixels in the presentable image.
		</div>

		<ul>
			<li>{@code oldSwapchain}, if not #NULL_HANDLE, specifies the swapchain that will be replaced by the new swapchain being created. The new swapchain will be a descendant of {@code oldSwapchain}. Further, any descendants of the new swapchain will also be descendants of {@code oldSwapchain}. Upon calling #CreateSwapchainKHR() with a {@code oldSwapchain} that is not #NULL_HANDLE, any images not acquired by the application <b>may</b> be freed by the implementation, which <b>may</b> occur even if creation of the new swapchain fails. The application <b>must</b> destroy the old swapchain to free all memory associated with the old swapchain. The application <b>must</b> wait for the completion of any outstanding rendering to images it currently has acquired at the time the swapchain is destroyed. The application <b>can</b> continue to present any images it acquired and has not yet presented using the old swapchain, as long as it has not entered a state that causes it to return #ERROR_OUT_OF_DATE_KHR. However, the application <b>cannot</b> acquire any more images from the old swapchain regardless of whether or not creation of the new swapchain succeeds.</li>
		</ul>

		<h5>Valid Usage</h5>
		<ul>
			<li>{@code surface} <b>must</b> be a surface that is supported by the device as determined using #GetPhysicalDeviceSurfaceSupportKHR()</li>
			<li>{@code minImageCount} <b>must</b> be greater than or equal to the value returned in the {@code minImageCount} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
			<li>{@code minImageCount} <b>must</b> be less than or equal to the value returned in the {@code maxImageCount} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface if the returned {@code maxImageCount} is not zero</li>
			<li>{@code imageFormat} and {@code imageColorSpace} <b>must</b> match the {@code format} and {@code colorSpace} members, respectively, of one of the ##VkSurfaceFormatKHR structures returned by #GetPhysicalDeviceSurfaceFormatsKHR() for the surface</li>
			<li>{@code imageExtent} <b>must</b> be between {@code minImageExtent} and {@code maxImageExtent}, inclusive, where {@code minImageExtent} and {@code maxImageExtent} are members of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
			<li>{@code imageArrayLayers} <b>must</b> be greater than 0 and less than or equal to the {@code maxImageArrayLayers} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
			<li>{@code imageUsage} <b>must</b> be a subset of the supported usage flags present in the {@code supportedUsageFlags} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
			<li>If {@code imageSharingMode} is #SHARING_MODE_CONCURRENT, {@code pQueueFamilyIndices} <b>must</b> be a pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
			<li>If {@code imageSharingMode} is #SHARING_MODE_CONCURRENT, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
			<li>{@code preTransform} <b>must</b> be one of the bits present in the {@code supportedTransforms} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
			<li>{@code compositeAlpha} <b>must</b> be one of the bits present in the {@code supportedCompositeAlpha} member of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface</li>
			<li>{@code presentMode} <b>must</b> be one of the {@code VkPresentModeKHR} values returned by #GetPhysicalDeviceSurfacePresentModesKHR() for the surface</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>{@code flags} <b>must</b> be 0</li>
			<li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
			<li>{@code imageFormat} <b>must</b> be a valid {@code VkFormat} value</li>
			<li>{@code imageColorSpace} <b>must</b> be a valid {@code VkColorSpaceKHR} value</li>
			<li>{@code imageUsage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
			<li>{@code imageUsage} <b>must</b> not be 0</li>
			<li>{@code imageSharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
			<li>{@code preTransform} <b>must</b> be a valid {@code VkSurfaceTransformFlagBitsKHR} value</li>
			<li>{@code compositeAlpha} <b>must</b> be a valid {@code VkCompositeAlphaFlagBitsKHR} value</li>
			<li>{@code presentMode} <b>must</b> be a valid {@code VkPresentModeKHR} value</li>
			<li>If {@code oldSwapchain} is not #NULL_HANDLE, {@code oldSwapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
			<li>If {@code oldSwapchain} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code surface}</li>
		</ul>

		<h5>See Also</h5>
		##VkExtent2D, #CreateSharedSwapchainsKHR(), #CreateSwapchainKHR()
		"""

	VkStructureType.member("sType", "the type of this structure and <b>must</b> be #STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkSwapchainCreateFlagsKHR.member("flags", "reserved for future use, and <b>must</b> be zero.")
	VkSurfaceKHR.member("surface", "the surface that the swapchain will present images to.")
	uint32_t.member("minImageCount", "the minimum number of presentable images that the application needs. The platform will either create the swapchain with at least that many images, or will fail to create the swapchain.")
	VkFormat.member("imageFormat", "a {@code VkFormat} that is valid for swapchains on the specified surface.")
	VkColorSpaceKHR.member("imageColorSpace", "a {@code VkColorSpaceKHR} that is valid for swapchains on the specified surface.")
	VkExtent2D.member("imageExtent", "the size (in pixels) of the swapchain. Behavior is platform-dependent when the image extent does not match the surface&#8217;s {@code currentExtent} as returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR().")
	uint32_t.member("imageArrayLayers", "the number of views in a multiview/stereo surface. For non-stereoscopic-3D applications, this value is 1.")
	VkImageUsageFlags.member("imageUsage", "a bitmask of {@code VkImageUsageFlagBits}, indicating how the application will use the swapchain&#8217;s presentable images.")
	VkSharingMode.member("imageSharingMode", "the sharing mode used for the images of the swapchain.")
	AutoSize("pQueueFamilyIndices", optional = true)..uint32_t.member("queueFamilyIndexCount", "the number of queue families having access to the images of the swapchain in case {@code imageSharingMode} is #SHARING_MODE_CONCURRENT.")
	const..uint32_t_p.member("pQueueFamilyIndices", "an array of queue family indices having access to the images of the swapchain in case {@code imageSharingMode} is #SHARING_MODE_CONCURRENT.")
	VkSurfaceTransformFlagBitsKHR.member("preTransform", "a bitmask of {@code VkSurfaceTransformFlagBitsKHR}, describing the transform, relative to the presentation engine&#8217;s natural orientation, applied to the image content prior to presentation. If it does not match the {@code currentTransform} value returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR(), the presentation engine will transform the image content as part of the presentation operation.")
	VkCompositeAlphaFlagBitsKHR.member("compositeAlpha", "a bitmask of {@code VkCompositeAlphaFlagBitsKHR}, indicating the alpha compositing mode to use when this surface is composited together with other surfaces on certain window systems.")
	VkPresentModeKHR.member("presentMode", "the presentation mode the swapchain will use. A swapchain&#8217;s present mode determines how incoming present requests will be processed and queued internally.")
	VkBool32.member("clipped", """indicates whether the Vulkan implementation is allowed to discard rendering operations that affect regions of the surface which are not visible.
<ul>
			<li>If set to #TRUE, the presentable images associated with the swapchain <b>may</b> not own all of their pixels. Pixels in the presentable images that correspond to regions of the target surface obscured by another window on the desktop or subject to some other clipping mechanism will have undefined content when read back. Pixel shaders <b>may</b> not execute for these pixels, and thus any side affects they would have had will not occur.</li>
			<li>If set to #FALSE, presentable images associated with the swapchain will own all the pixels they contain. Setting this value to #TRUE does not guarantee any clipping will occur, but allows more optimal presentation methods to be used on some platforms.</li>
		</ul>""")
	VkSwapchainKHR.member("oldSwapchain", "")
}

val VkPresentInfoKHR = struct(VULKAN_PACKAGE, "VkPresentInfoKHR") {
	documentation =
		"""
		Structure describing parameters of a queue presentation.

		<h5>Valid Usage</h5>
		<ul>
			<li>Any given element of {@code pImageIndices} <b>must</b> be the index of a presentable image acquired from the swapchain specified by the corresponding element of the {@code pSwapchains} array</li>
			<li>Any given element of {@code VkSemaphore} in {@code pWaitSemaphores} <b>must</b> refer to a prior signal of that {@code VkSemaphore} that will not be consumed by any other wait on that semaphore</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PRESENT_INFO_KHR</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>If {@code waitSemaphoreCount} is not 0, and {@code pWaitSemaphores} is not {@code NULL}, {@code pWaitSemaphores} <b>must</b> be a pointer to an array of {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
			<li>{@code pSwapchains} <b>must</b> be a pointer to an array of {@code swapchainCount} valid {@code VkSwapchainKHR} handles</li>
			<li>{@code pImageIndices} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code uint32_t} values</li>
			<li>If {@code pResults} is not {@code NULL}, {@code pResults} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code VkResult} values</li>
			<li>{@code swapchainCount} <b>must</b> be greater than 0</li>
		</ul>

		<h5>See Also</h5>
		#QueuePresentKHR()
		"""

	VkStructureType.member("sType", "the type of this structure and <b>must</b> be #STRUCTURE_TYPE_PRESENT_INFO_KHR.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	AutoSize("pWaitSemaphores", optional = true)..uint32_t.member("waitSemaphoreCount", "the number of semaphores to wait for before issuing the present request. The number <b>may</b> be zero.")
	nullable..const..VkSemaphore.p.member("pWaitSemaphores", "if not #NULL_HANDLE, is an array of {@code VkSemaphore} objects with {@code waitSemaphoreCount} entries, and specifies the semaphores to wait for before issuing the present request.")
	AutoSize("pSwapchains","pImageIndices","pResults")..uint32_t.member("swapchainCount", "the number of swapchains being presented to by this command.")
	const..VkSwapchainKHR.p.member("pSwapchains", "an array of {@code VkSwapchainKHR} objects with {@code swapchainCount} entries. A given swapchain <b>must</b> not appear in this list more than once.")
	const..uint32_t_p.member("pImageIndices", "an array of indices into the array of each swapchain&#8217;s presentable images, with {@code swapchainCount} entries. Each entry in this array identifies the image to present on the corresponding entry in the {@code pSwapchains} array.")
	nullable..VkResult.p.member("pResults", "an array of {@code VkResult} typed elements with {@code swapchainCount} entries. Applications that do not need per-swapchain results <b>can</b> use {@code NULL} for {@code pResults}. If non-{@code NULL}, each entry in {@code pResults} will be set to the {@code VkResult} for presenting the swapchain corresponding to the same index in {@code pSwapchains}.")
}

val VkDisplayPropertiesKHR = struct(VULKAN_PACKAGE, "VkDisplayPropertiesKHR", mutable = false) {
	documentation =
		"""
		Structure describing an available display device.

		<h5>Description</h5>
		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		For devices which have no natural value to return here, implementations <b>should</b> return the maximum resolution supported.
		</div>

		<ul>
			<li>{@code supportedTransforms} tells which transforms are supported by this display. This will contain one or more of the bits from {@code VkSurfaceTransformFlagsKHR}.</li>
			<li>{@code planeReorderPossible} tells whether the planes on this display <b>can</b> have their z order changed. If this is #TRUE, the application <b>can</b> re-arrange the planes on this display in any order relative to each other.</li>
			<li>{@code persistentContent} tells whether the display supports self-refresh/internal buffering. If this is true, the application <b>can</b> submit persistent present operations on swapchains created against this display.</li>
		</ul>

		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		Persistent presents <b>may</b> have higher latency, and <b>may</b> use less power when the screen content is updated infrequently, or when only a portion of the screen needs to be updated in most frames.
		</div>

		<h5>See Also</h5>
		##VkExtent2D, #GetPhysicalDeviceDisplayPropertiesKHR()
		"""

	VkDisplayKHR.member("display", "a handle that is used to refer to the display described here. This handle will be valid for the lifetime of the Vulkan instance.")
	const..charUTF8_p.member("displayName", "a pointer to a NULL-terminated string containing the name of the display. Generally, this will be the name provided by the display&#8217;s EDID. It <b>can</b> be {@code NULL} if no suitable name is available.")
	VkExtent2D.member("physicalDimensions", "describes the physical width and height of the visible portion of the display, in millimeters.")
	VkExtent2D.member("physicalResolution", "describes the physical, native, or preferred resolution of the display.")
	VkSurfaceTransformFlagsKHR.member("supportedTransforms", "")
	VkBool32.member("planeReorderPossible", "")
	VkBool32.member("persistentContent", "")
}

val VkDisplayModeParametersKHR = struct(VULKAN_PACKAGE, "VkDisplayModeParametersKHR") {
	documentation =
		"""
		Structure describing display parameters associated with a display mode.

		<h5>Description</h5>
		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		For example, a 60Hz display mode would report a {@code refreshRate} of 60,000.
		</div>

		<h5>See Also</h5>
		##VkDisplayModeCreateInfoKHR, ##VkDisplayModePropertiesKHR, ##VkExtent2D
		"""

	VkExtent2D.member("visibleRegion", "the 2D extents of the visible region.")
	uint32_t.member("refreshRate", "a {@code uint32_t} that is the number of times the display is refreshed each second multiplied by 1000.")
}

val VkDisplayModePropertiesKHR = struct(VULKAN_PACKAGE, "VkDisplayModePropertiesKHR", mutable = false) {
	documentation =
		"""
		Structure describing display mode properties.
		"""

	VkDisplayModeKHR.member("displayMode", "a handle to the display mode described in this structure. This handle will be valid for the lifetime of the Vulkan instance.")
	VkDisplayModeParametersKHR.member("parameters", "a ##VkDisplayModeParametersKHR structure describing the display parameters associated with {@code displayMode}.")
}

val VkDisplayModeCreateInfoKHR = struct(VULKAN_PACKAGE, "VkDisplayModeCreateInfoKHR") {
	documentation =
		"""
		Structure specifying parameters of a newly created display mode object.

		<h5>Valid Usage</h5>
		<ul>
			<li>The {@code width} and {@code height} members of the {@code visibleRegion} member of {@code parameters} <b>must</b> be greater than 0</li>
			<li>The {@code refreshRate} member of {@code parameters} <b>must</b> be greater than 0</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>{@code flags} <b>must</b> be 0</li>
		</ul>

		<h5>See Also</h5>
		##VkDisplayModeParametersKHR, #CreateDisplayModeKHR()
		"""

	VkStructureType.member("sType", "the type of this structure and <b>must</b> be #STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkDisplayModeCreateFlagsKHR.member("flags", "reserved for future use, and <b>must</b> be zero.")
	VkDisplayModeParametersKHR.member("parameters", "a ##VkDisplayModeParametersKHR structure describing the display parameters to use in creating the new mode. If the parameters are not compatible with the specified display, the implementation <b>must</b> return #ERROR_INITIALIZATION_FAILED.")
}

val VkDisplayPlaneCapabilitiesKHR = struct(VULKAN_PACKAGE, "VkDisplayPlaneCapabilitiesKHR", mutable = false) {
	documentation =
		"""
		Structure describing capabilities of a mode and plane combination.

		<h5>Description</h5>
		The minimum and maximum position and extent fields describe the hardware limits, if any, as they apply to the specified display mode and plane. Vendors <b>may</b> support displaying a subset of a swapchain's presentable images on the specified display plane. This is expressed by returning {@code minSrcPosition}, {@code maxSrcPosition}, {@code minSrcExtent}, and {@code maxSrcExtent} values that indicate a range of possible positions and sizes <b>may</b> be used to specify the region within the presentable images that source pixels will be read from when creating a swapchain on the specified display mode and plane.

		Vendors <b>may</b> also support mapping the presentable images' content to a subset or superset of the visible region in the specified display mode. This is expressed by returning {@code minDstPosition}, {@code maxDstPosition}, {@code minDstExtent} and {@code maxDstExtent} values that indicate a range of possible positions and sizes <b>may</b> be used to describe the region within the display mode that the source pixels will be mapped to.

		Other vendors <b>may</b> support only a 1-1 mapping between pixels in the presentable images and the display mode. This <b>may</b> be indicated by returning <code>(0,0)</code> for {@code minSrcPosition}, {@code maxSrcPosition}, {@code minDstPosition}, and {@code maxDstPosition}, and (display mode width, display mode height) for {@code minSrcExtent}, {@code maxSrcExtent}, {@code minDstExtent}, and {@code maxDstExtent}.

		These values indicate the limits of the hardware's individual fields. Not all combinations of values within the offset and extent ranges returned in ##VkDisplayPlaneCapabilitiesKHR are guaranteed to be supported. Vendors <b>may</b> still fail presentation requests that specify unsupported combinations.

		<h5>See Also</h5>
		##VkExtent2D, ##VkOffset2D, #GetDisplayPlaneCapabilitiesKHR()
		"""

	VkDisplayPlaneAlphaFlagsKHR.member("supportedAlpha", "a bitmask of {@code VkDisplayPlaneAlphaFlagBitsKHR} describing the supported alpha blending modes.")
	VkOffset2D.member("minSrcPosition", "the minimum source rectangle offset supported by this plane using the specified mode.")
	VkOffset2D.member("maxSrcPosition", "the maximum source rectangle offset supported by this plane using the specified mode. The {@code x} and {@code y} components of {@code maxSrcPosition} <b>must</b> each be greater than or equal to the {@code x} and {@code y} components of {@code minSrcPosition}, respectively.")
	VkExtent2D.member("minSrcExtent", "the minimum source rectangle size supported by this plane using the specified mode.")
	VkExtent2D.member("maxSrcExtent", "the maximum source rectangle size supported by this plane using the specified mode.")
	VkOffset2D.member("minDstPosition", "{@code minDstPosition}, {@code maxDstPosition}, {@code minDstExtent}, {@code maxDstExtent} all have similar semantics to their corresponding \"Src\" equivalents, but apply to the output region within the mode rather than the input region within the source image. Unlike the \"Src\" offsets, {@code minDstPosition} and {@code maxDstPosition} <b>may</b> contain negative values.")
	VkOffset2D.member("maxDstPosition", "see {@code minDstPosition}")
	VkExtent2D.member("minDstExtent", "see {@code minDstPosition}")
	VkExtent2D.member("maxDstExtent", "see {@code minDstPosition}")
}

val VkDisplayPlanePropertiesKHR = struct(VULKAN_PACKAGE, "VkDisplayPlanePropertiesKHR", mutable = false) {
	documentation =
		"""
		Structure describing display plane properties.
		"""

	VkDisplayKHR.member("currentDisplay", "the handle of the display the plane is currently associated with. If the plane is not currently attached to any displays, this will be {@code VK_NULL_HANDLE}.")
	uint32_t.member("currentStackIndex", "the current z-order of the plane. This will be between 0 and the value returned by #GetPhysicalDeviceDisplayPlanePropertiesKHR()() in {@code pPropertyCount}.")
}

val VkDisplaySurfaceCreateInfoKHR = struct(VULKAN_PACKAGE, "VkDisplaySurfaceCreateInfoKHR") {
	documentation =
		"""
		Structure specifying parameters of a newly created display plane surface object.

		<h5>Description</h5>
		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		Creating a display surface <b>must</b> not modify the state of the displays, planes, or other resources it names. For example, it <b>must</b> not apply the specified mode to be set on the associated display. Application of display configuration occurs as a side effect of presenting to a display surface.
		</div>

		<h5>Valid Usage</h5>
		<ul>
			<li>{@code planeIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling #GetPhysicalDeviceDisplayPlanePropertiesKHR()</li>
			<li>If the {@code planeReorderPossible} member of the ##VkDisplayPropertiesKHR structure returned by #GetPhysicalDeviceDisplayPropertiesKHR() for the display corresponding to {@code displayMode} is #TRUE then {@code planeStackIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling #GetPhysicalDeviceDisplayPlanePropertiesKHR(); otherwise {@code planeStackIndex} <b>must</b> equal the {@code currentStackIndex} member of ##VkDisplayPlanePropertiesKHR returned by #GetPhysicalDeviceDisplayPlanePropertiesKHR() for the display plane corresponding to {@code displayMode}</li>
			<li>If {@code alphaMode} is #DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR then {@code globalAlpha} <b>must</b> be between 0 and 1, inclusive</li>
			<li>{@code alphaMode} <b>must</b> be 0 or one of the bits present in the {@code supportedAlpha} member of ##VkDisplayPlaneCapabilitiesKHR returned by #GetDisplayPlaneCapabilitiesKHR() for the display plane corresponding to {@code displayMode}</li>
			<li>The {@code width} and {@code height} members of {@code imageExtent} <b>must</b> be less than the {@code maxImageDimensions2D} member of ##VkPhysicalDeviceLimits</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>{@code flags} <b>must</b> be 0</li>
			<li>{@code displayMode} <b>must</b> be a valid {@code VkDisplayModeKHR} handle</li>
			<li>{@code transform} <b>must</b> be a valid {@code VkSurfaceTransformFlagBitsKHR} value</li>
			<li>{@code alphaMode} <b>must</b> be a valid {@code VkDisplayPlaneAlphaFlagBitsKHR} value</li>
		</ul>

		<h5>See Also</h5>
		##VkExtent2D, #CreateDisplayPlaneSurfaceKHR()
		"""

	VkStructureType.member("sType", "the type of this structure and <b>must</b> be #STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkDisplaySurfaceCreateFlagsKHR.member("flags", "reserved for future use, and <b>must</b> be zero.")
	VkDisplayModeKHR.member("displayMode", "the mode to use when displaying this surface.")
	uint32_t.member("planeIndex", "the plane on which this surface appears.")
	uint32_t.member("planeStackIndex", "the z-order of the plane.")
	VkSurfaceTransformFlagBitsKHR.member("transform", "the transform to apply to the images as part of the scanout operation.")
	float.member("globalAlpha", "the global alpha value. This value is ignored if {@code alphaMode} is not #DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR.")
	VkDisplayPlaneAlphaFlagBitsKHR.member("alphaMode", "the type of alpha blending to use.")
	VkExtent2D.member("imageExtent", "")
}

val VkDisplayPresentInfoKHR = struct(VULKAN_PACKAGE, "VkDisplayPresentInfoKHR") {
	documentation =
		"""
		Structure describing parameters of a queue presentation to a swapchain.

		<h5>Description</h5>
		If the extent of the {@code srcRect} and {@code dstRect} are not equal, the presented pixels will be scaled accordingly.

		<h5>Valid Usage</h5>
		<ul>
			<li>{@code srcRect} <b>must</b> specify a rectangular region that is a subset of the image being presented</li>
			<li>{@code dstRect} <b>must</b> specify a rectangular region that is a subset of the {@code visibleRegion} parameter of the display mode the swapchain being presented uses</li>
			<li>If the {@code persistentContent} member of the ##VkDisplayPropertiesKHR structure returned by #GetPhysicalDeviceDisplayPropertiesKHR() for the display the present operation targets then {@code persistent} <b>must</b> be #FALSE</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
		</ul>

		<h5>See Also</h5>
		##VkRect2D
		"""

	VkStructureType.member("sType", "the type of this structure and <b>must</b> be #STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkRect2D.member("srcRect", "a rectangular region of pixels to present. It <b>must</b> be a subset of the image being presented. If ##VkDisplayPresentInfoKHR is not specified, this region will be assumed to be the entire presentable image.")
	VkRect2D.member("dstRect", "a rectangular region within the visible region of the swapchain&#8217;s display mode. If ##VkDisplayPresentInfoKHR is not specified, this region will be assumed to be the entire visible region of the visible region of the swapchain&#8217;s mode. If the specified rectangle is a subset of the display mode&#8217;s visible region, content from display planes below the swapchain&#8217;s plane will be visible outside the rectangle. If there are no planes below the swapchain&#8217;s, the area outside the specified rectangle will be black. If portions of the specified rectangle are outside of the display&#8217;s visible region, pixels mapping only to those portions of the rectangle will be discarded.")
	VkBool32.member("persistent", "If this is #TRUE, the display engine will enable buffered mode on displays that support it. This allows the display engine to stop sending content to the display until a new image is presented. The display will instead maintain a copy of the last presented image. This allows less power to be used, but <b>may</b> increase presentation latency. If ##VkDisplayPresentInfoKHR is not specified, persistent mode will not be used.")
}

val VkXlibSurfaceCreateInfoKHR = struct(VULKAN_PACKAGE, "VkXlibSurfaceCreateInfoKHR") {
	documentation =
		"""
		Structure specifying parameters of a newly created Xlib surface object.

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>{@code flags} <b>must</b> be 0</li>
			<li>{@code dpy} <b>must</b> be a pointer to a {@code Display} value</li>
		</ul>

		<h5>See Also</h5>
		#CreateXlibSurfaceKHR()
		"""

	VkStructureType.member("sType", "the type of this structure and <b>must</b> be #STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkXlibSurfaceCreateFlagsKHR.member("flags", "reserved for future use.")
	Display.p.member("dpy", "a pointer to an Xlib {@code Display} connection to the X server.")
	Window.member("window", "an Xlib {@code Window} to associate the surface with.")
}

val VkWin32SurfaceCreateInfoKHR = struct(VULKAN_PACKAGE, "VkWin32SurfaceCreateInfoKHR") {
	documentation =
		"""
		Structure specifying parameters of a newly created Win32 surface object.

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>{@code flags} <b>must</b> be 0</li>
		</ul>

		<h5>See Also</h5>
		#CreateWin32SurfaceKHR()
		"""

	VkStructureType.member("sType", "the type of this structure and <b>must</b> be #STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkWin32SurfaceCreateFlagsKHR.member("flags", "reserved for future use.")
	HINSTANCE.member("hinstance", "{@code hinstance} and {@code hwnd} are the Win32 {@code HINSTANCE} and {@code HWND} for the window to associate the surface with.")
	HWND.member("hwnd", "see {@code hinstance}")
}

val VkDebugReportCallbackCreateInfoEXT = struct(VULKAN_PACKAGE, "VkDebugReportCallbackCreateInfoEXT") {
	documentation =
		"""
		Structure specifying parameters of a newly created debug report callback.

		<h5>See Also</h5>
		##VkDebugReportCallbackEXT, {@code VkDebugReportFlagsEXT}, {@code VkStructureType}, #CreateDebugReportCallbackEXT()
		"""

	VkStructureType.member("sType", "the type of this structure.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkDebugReportFlagsEXT.member("flags", """indicate which event(s) will cause this callback to be called. Flags are interpreted as bitmasks and multiple may be set. Bits which <b>can</b> be set include:
<pre><code>typedef enum VkDebugReportFlagBitsEXT {
￿    VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 0x00000001,
￿    VK_DEBUG_REPORT_WARNING_BIT_EXT = 0x00000002,
￿    VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x00000004,
￿    VK_DEBUG_REPORT_ERROR_BIT_EXT = 0x00000008,
￿    VK_DEBUG_REPORT_DEBUG_BIT_EXT = 0x00000010,
} VkDebugReportFlagBitsEXT;</code></pre>

		Description

		* #DEBUG_REPORT_ERROR_BIT_EXT indicates an error that may cause     undefined results, including an application crash.   * #DEBUG_REPORT_WARNING_BIT_EXT indicates an unexpected use.     E.g. Not destroying objects prior to destroying the containing object or     potential inconsistencies between descriptor set layout and the layout     in the corresponding shader, etc.   * #DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT indicates a     potentially non-optimal use of Vulkan.     E.g. using #CmdClearColorImage() when a RenderPass load_op would     have worked.   * #DEBUG_REPORT_INFORMATION_BIT_EXT indicates an informational     message such as resource details that may be handy when debugging an     application.   * #DEBUG_REPORT_DEBUG_BIT_EXT indicates diagnostic information     from the loader and layers.    * {@code pfnCallback} is the application callback function to call.   * {@code pUserData} is user data to be passed to the callback.""")
	PFN_vkDebugReportCallbackEXT.member("pfnCallback", "")
	nullable..voidptr.member("pUserData", "")
}

val VkPipelineRasterizationStateRasterizationOrderAMD = struct(VULKAN_PACKAGE, "VkPipelineRasterizationStateRasterizationOrderAMD") {
	documentation =
		"""
		(no short description available).

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>{@code rasterizationOrder} <b>must</b> be a valid {@code VkRasterizationOrderAMD} value</li>
		</ul>
		"""

	VkStructureType.member("sType", "the type of this structure.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkRasterizationOrderAMD.member("rasterizationOrder", "the primitive rasterization order to use.")
}

val VkDebugMarkerObjectNameInfoEXT = struct(VULKAN_PACKAGE, "VkDebugMarkerObjectNameInfoEXT") {
	documentation =
		"""
		Specify parameters of a name to give to an object.

		<h5>Description</h5>
		Applications <b>may</b> change the name associated with an object simply by calling #DebugMarkerSetObjectNameEXT() again with a new string. To remove a previously set name, {@code pName} <b>should</b> be set to an empty string.

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
			<li>{@code pObjectName} <b>must</b> be a null-terminated string</li>
		</ul>

		<h5>See Also</h5>
		#DebugMarkerSetObjectNameEXT()
		"""

	VkStructureType.member("sType", "the type of this structure and <b>must</b> be #STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkDebugReportObjectTypeEXT.member("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named.")
	uint64_t.member("object", "the object to be named.")
	const..charUTF8_p.member("pObjectName", "a null-terminated UTF-8 string specifying the name to apply to {@code object}.")
}

val VkDebugMarkerObjectTagInfoEXT = struct(VULKAN_PACKAGE, "VkDebugMarkerObjectTagInfoEXT") {
	documentation =
		"""
		Specify parameters of a tag to attach to an object.

		<h5>Description</h5>
		The {@code tagName} parameter gives a name or identifier to the type of data being tagged. This can be used by debugging layers to easily filter for only data that can be used by that implementation.

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
			<li>{@code pTag} <b>must</b> be a pointer to an array of {@code tagSize} bytes</li>
			<li>{@code tagSize} <b>must</b> be greater than 0</li>
		</ul>

		<h5>See Also</h5>
		#DebugMarkerSetObjectTagEXT()
		"""

	VkStructureType.member("sType", "the type of this structure and <b>must</b> be #STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkDebugReportObjectTypeEXT.member("objectType", "a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named.")
	uint64_t.member("object", "the object to be tagged.")
	uint64_t.member("tagName", "a numerical identifier of the tag.")
	AutoSize("pTag")..size_t.member("tagSize", "the number of bytes of data to attach to the object.")
	const..void_p.member("pTag", "an array of {@code tagSize} bytes containing the data to be associated with the object.")
}

val VkDebugMarkerMarkerInfoEXT = struct(VULKAN_PACKAGE, "VkDebugMarkerMarkerInfoEXT") {
	documentation =
		"""
		Specify parameters of a command buffer marker region.

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>{@code pMarkerName} <b>must</b> be a null-terminated string</li>
		</ul>

		<h5>See Also</h5>
		#CmdDebugMarkerBeginEXT(), #CmdDebugMarkerInsertEXT()
		"""

	VkStructureType.member("sType", "the type of this structure and <b>must</b> be #STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	const..charUTF8_p.member("pMarkerName", "a pointer to a null-terminated UTF-8 string that contains the name of the marker.")
	float.array("color", "an optional RGBA color value that can be associated with the marker. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored.", size = 4)
}

val VkDedicatedAllocationImageCreateInfoNV = struct(VULKAN_PACKAGE, "VkDedicatedAllocationImageCreateInfoNV") {
	documentation =
		"""
		Specify that an image is bound to a dedicated memory resource.

		<h5>Description</h5>
		<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
		Using a dedicated allocation for color and depth/stencil attachments or other large images <b>may</b> improve performance on some devices.
		</div>

		<h5>Valid Usage</h5>
		<ul>
			<li>If {@code dedicatedAllocation} is #TRUE, ##VkImageCreateInfo{@code ::flags} <b>must</b> not include #IMAGE_CREATE_SPARSE_BINDING_BIT, #IMAGE_CREATE_SPARSE_RESIDENCY_BIT, or #IMAGE_CREATE_SPARSE_ALIASED_BIT</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
		</ul>
		"""

	VkStructureType.member("sType", "the type of this structure.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkBool32.member("dedicatedAllocation", "indicates whether the image will have a dedicated allocation bound to it.")
}

val VkDedicatedAllocationBufferCreateInfoNV = struct(VULKAN_PACKAGE, "VkDedicatedAllocationBufferCreateInfoNV") {
	documentation =
		"""
		Specify that a buffer is bound to a dedicated memory resource.

		<h5>Valid Usage</h5>
		<ul>
			<li>If {@code dedicatedAllocation} is #TRUE, ##VkBufferCreateInfo{@code ::flags} <b>must</b> not include #BUFFER_CREATE_SPARSE_BINDING_BIT, #BUFFER_CREATE_SPARSE_RESIDENCY_BIT, or #BUFFER_CREATE_SPARSE_ALIASED_BIT</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
		</ul>
		"""

	VkStructureType.member("sType", "the type of this structure.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkBool32.member("dedicatedAllocation", "indicates whether the buffer will have a dedicated allocation bound to it.")
}

val VkDedicatedAllocationMemoryAllocateInfoNV = struct(VULKAN_PACKAGE, "VkDedicatedAllocationMemoryAllocateInfoNV") {
	documentation =
		"""
		Specify a dedicated memory allocation resource.

		<h5>Valid Usage</h5>
		<ul>
			<li>At least one of {@code image} and {@code buffer} <b>must</b> be {@code VK_NULL_HANDLE}</li>
			<li>If {@code image} is not {@code VK_NULL_HANDLE}, the image <b>must</b> have been created with ##VkDedicatedAllocationImageCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE</li>
			<li>If {@code buffer} is not {@code VK_NULL_HANDLE}, the buffer <b>must</b> have been created with ##VkDedicatedAllocationBufferCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE</li>
			<li>If {@code image} is not {@code VK_NULL_HANDLE}, ##VkMemoryAllocateInfo{@code ::allocationSize} <b>must</b> equal the ##VkMemoryRequirements{@code ::size} of the image</li>
			<li>If {@code buffer} is not {@code VK_NULL_HANDLE}, ##VkMemoryAllocateInfo{@code ::allocationSize} <b>must</b> equal the ##VkMemoryRequirements{@code ::size} of the buffer</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>If {@code image} is not #NULL_HANDLE, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
			<li>If {@code buffer} is not #NULL_HANDLE, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
			<li>Both of {@code buffer}, and {@code image} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
		</ul>
		"""

	VkStructureType.member("sType", "the type of this structure.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	VkImage.member("image", "{@code VK_NULL_HANDLE} or a handle of an image which this memory will be bound to.")
	VkBuffer.member("buffer", "{@code VK_NULL_HANDLE} or a handle of a buffer which this memory will be bound to.")
}

val VkValidationFlagsEXT = struct(VULKAN_PACKAGE, "VkValidationFlagsEXT") {
	documentation =
		"""
		Specify validation checks to disable for a Vulkan instance.

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_VALIDATION_FLAGS_EXT</li>
			<li>{@code pNext} <b>must</b> be {@code NULL}</li>
			<li>{@code pDisabledValidationChecks} <b>must</b> be a pointer to an array of {@code disabledValidationCheckCount} {@code VkValidationCheckEXT} values</li>
			<li>{@code disabledValidationCheckCount} <b>must</b> be greater than 0</li>
		</ul>
		"""

	VkStructureType.member("sType", "the type of this structure.")
	nullable..const..voidptr.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
	AutoSize("pDisabledValidationChecks")..uint32_t.member("disabledValidationCheckCount", "the number of checks to disable.")
	VkValidationCheckEXT.p.member("pDisabledValidationChecks", """a pointer to an array of values specifying the validation checks to be disabled. Checks which <b>may</b> be specified include:
<pre><code>typedef enum VkValidationCheckEXT {
￿    VK_VALIDATION_CHECK_ALL_EXT = 0,
} VkValidationCheckEXT;</code></pre>

		<ul>
			<li>#VALIDATION_CHECK_ALL_EXT disables all validation checks.</li>
		</ul>""")
}