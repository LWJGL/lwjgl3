/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*
import org.lwjgl.system.linux.Display_p
import org.lwjgl.system.linux.Window
import org.lwjgl.system.windows.HINSTANCE
import org.lwjgl.system.windows.HWND

// EXT_debug_report

val VkDebugReportCallbackEXT = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDebugReportCallbackEXT")

val VkDebugReportObjectTypeEXT = "VkDebugReportObjectTypeEXT".enumType
val VkDebugReportFlagsEXT = typedef(VkFlags, "VkDebugReportFlagsEXT")

val PFN_vkDebugReportCallbackEXT = "PFN_vkDebugReportCallbackEXT".callback(
	VULKAN_PACKAGE, VkBool32, "VkDebugReportCallbackEXT",
	"Will be called by the Vulkan implementation for events of interest to the application.",

	VkDebugReportFlagsEXT.IN(
		"flags",
		"indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback"
	),
	VkDebugReportObjectTypeEXT.IN(
		"objectType",
		"the type of object being used / created at the time the event was triggered."
	),
	uint64_t.IN(
		"object",
		"gives the object where the issue was detected. {@code object} may be #NULL_HANDLE if there is no object associated with the event."
	),
	size_t.IN(
		"location",
		"location is a component (layer, driver, loader) defined value that indicates the \"location\" of the trigger. This is an optional value."
	),
	int32_t.IN("messageCode", "a layer defined value indicating what test triggered this callback"),
	const..charUTF8_p.IN("pLayerPrefix", "abbreviation of the component making the callback"),
	const..charUTF8_p.IN("pMessage", "a null terminated string detailing the trigger conditions"),
	void_p.IN("pUserData", "the user data given when the {@code DebugReportCallback} was created"),

	returnDoc =
	"""
	a {@code VkBool32} that indicates to the calling layer if the Vulkan call should be aborted or not. Applications should always return #FALSE so that
	they see the same behavior with and without validation layers enabled.
	"""
) {
	documentation =
		"""
		Instances of this interface may be set to the {@code pfnCallback} member of the ##VkDebugReportCallbackCreateInfoEXT struct.

		A callback will be made for issues that match any bit set in its flags. The callback will come directly from the component that detected the event,
		unless some other layer intercepts the calls for its own purposes (filter them in different way, log to system error log, etc.) An application may
		receive multiple callbacks if multiple {@code VkDebugReportCallbackEXT} objects were created. A callback will always be executed in the same thread as
		the originating Vulkan call. A callback may be called from multiple threads simultaneously (if the application is making Vulkan calls from multiple
		threads).
		"""
	useSystemCallConvention()
	additionalCode = """
	/**
	 * Converts the specified {@link VkDebugReportCallbackEXT} argument to a String.
	 *
	 * <p>This method may only be used inside a {@code VkDebugReportCallbackEXT} invocation.</p>
	 *
	 * @param string the argument to decode
	 *
	 * @return the message as a String
	 */
	public static String getString(long string) {
		return memUTF8(string);
	}

	/** A functional interface for {@link VkDebugReportCallbackEXT}. */
	public interface SAMString {
		int invoke(int flags, int objectType, long object, long location, int messageCode, String pLayerPrefix, String pMessage, long pUserData);
	}

	/**
	 * Creates a {@link VkDebugReportCallbackEXT} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link VkDebugReportCallbackEXT} instance
	 */
	public static VkDebugReportCallbackEXT createString(final SAMString sam) {
		return new VkDebugReportCallbackEXT() {
			@Override
			public int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData) {
				return sam.invoke(flags, objectType, object, location, messageCode, getString(pLayerPrefix), getString(pMessage), pUserData);
			}
		};
	}
	"""
}

val VkDebugReportCallbackCreateInfoEXT_p = struct_p(VULKAN_PACKAGE, "VkDebugReportCallbackCreateInfoEXT") {
	documentation =
		"""
		${man("VkDebugReportCallbackCreateInfoEXT")}

		Defines the conditions under which a callback will be called.

		${ValidityStructs.VkDebugReportCallbackCreateInfoEXT}
		"""

    sType(this)
    pNext()
    VkDebugReportFlagsEXT.member("flags", "indicate which event(s) will cause this callback to be called").flagLinks("DEBUG_REPORT")
    PFN_vkDebugReportCallbackEXT.member("pfnCallback", "the application callback function to call")
    nullable..voidptr.member("pUserData", "user data to be passed to the callback")
}

// KHR_surface (must be above KHR_display)

val VkSurfaceKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSurfaceKHR")
val VkSurfaceKHR_p = VkSurfaceKHR.p

val VkColorSpaceKHR = "VkColorSpaceKHR".enumType
val VkPresentModeKHR = "VkPresentModeKHR".enumType
val VkPresentModeKHR_p = VkPresentModeKHR.p
val VkSurfaceTransformFlagBitsKHR = "VkSurfaceTransformFlagBitsKHR".enumType

val VkSurfaceTransformFlagsKHR = typedef(VkFlags, "VkSurfaceTransformFlagsKHR")
val VkCompositeAlphaFlagsKHR = typedef(VkFlags, "VkCompositeAlphaFlagsKHR")

val VkSurfaceCapabilitiesKHR_p = struct_p(VULKAN_PACKAGE, "VkSurfaceCapabilitiesKHR", mutable = false) {
	documentation =
		"""
		${man("VkSurfaceCapabilitiesKHR")}<br>
		${spec("VkSurfaceCapabilitiesKHR")}

		Contains the basic capabilities of a surface.

		${ValidityStructs.VkSurfaceCapabilitiesKHR}
		"""

	uint32_t.member("minImageCount", "the minimum number of images the specified device supports for a swapchain created for the surface")
	uint32_t.member(
		"maxImageCount",
		"""
		the maximum number of images the specified device supports for a swapchain created for the surface. A value of 0 means that there is no limit on the
		number of images, though there $may be limits related to the total amount of memory used by swapchain images.
		"""
	)
	VkExtent2D.member(
		"currentExtent",
		"""
		the current width and height of the surface, or the special value {@code (0xFFFFFFFF,0xFFFFFFFF)} indicating that the surface size will be determined
		by the extent of a swapchain targeting the surface
		"""
	)
	VkExtent2D.member("minImageExtent", "the smallest valid swapchain extent for the surface on the specified device")
	VkExtent2D.member("maxImageExtent", "the largest valid swapchain extent for the surface on the specified device")
	uint32_t.member("maxImageArrayLayers", "the maximum number of layers swapchain images can have for a swapchain created for this device and surface")
	VkSurfaceTransformFlagsKHR.member(
		"supportedTransforms",
		"a bitfield of {@code VkSurfaceTransformFlagBitsKHR}, describing the presentation transforms supported for the surface on the specified device"
	).flagLinks("SURFACE_TRANSFORM")
	VkSurfaceTransformFlagBitsKHR.member(
		"currentTransform",
		"""
		a bitfield of {@code VkSurfaceTransformFlagBitsKHR}, describing the surface’s current transform relative to the presentation engine’s natural
		orientation
		"""
	).links("SURFACE_TRANSFORM_\\w+_BIT_KHR")
	VkCompositeAlphaFlagsKHR.member(
		"supportedCompositeAlpha",
		"""
		a bitfield of {@code VkCompositeAlphaFlagBitsKHR}, representing the alpha compositing modes supported by the presentation engine for the surface on the
		specified device. Opaque composition can be achieved in any alpha compositing mode by either using a swapchain image format that has no alpha
		component, or by ensuring that all pixels in the swapchain images have an alpha value of 1.0.
		"""
	).flagLinks("COMPOSITE_ALPHA")
	VkImageUsageFlags.member(
		"supportedUsageFlags",
		"""
		a bitfield of {@code VkImageUsageFlagBits} representing the ways the application can use the presentable images of a swapchain created for the surface
		on the specified device. #IMAGE_USAGE_COLOR_ATTACHMENT_BIT must be included in the set but implementations may support additional usages.
		"""
	).flagLinks("IMAGE_USAGE")
}

val VkSurfaceFormatKHR_p = struct_p(VULKAN_PACKAGE, "VkSurfaceFormatKHR", mutable = false) {
	documentation =
		"""
		${man("VkSurfaceFormatKHR")}<br>
		${spec("VkSurfaceFormatKHR")}

		Describes a surface format.

		${ValidityStructs.VkSurfaceFormatKHR}
		"""

	VkFormat.member("format", "a {@code VkFormat} that is compatible with the surface")
	VkColorSpaceKHR.member("colorSpace", "a presentation {@code VkColorSpaceKHR} that is compatible with the surface").links("COLORSPACE_\\w+_KHR")
}

// KHR_display

val VkDisplayKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayKHR")
val VkDisplayModeKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDisplayModeKHR")

val VkDisplayPlaneAlphaFlagBitsKHR = "VkDisplayPlaneAlphaFlagBitsKHR".enumType
val VkDisplayModeCreateFlagsKHR = typedef(VkFlags, "VkDisplayModeCreateFlagsKHR")
val VkDisplayPlaneAlphaFlagsKHR = typedef(VkFlags, "VkDisplayPlaneAlphaFlagsKHR")
val VkDisplaySurfaceCreateFlagsKHR = typedef(VkFlags, "VkDisplaySurfaceCreateFlagsKHR")

val VkDisplayPropertiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayPropertiesKHR", mutable = false) {
	documentation =
		"""
		${man("VkDisplayPropertiesKHR")}<br>
		${spec("VkDisplayPropertiesKHR")}

		Describes properties of a display device present on a Vulkan physical device.

		${ValidityStructs.VkDisplayPropertiesKHR}
		"""
	
	VkDisplayKHR.member(
		"display",
		"a handle that is used to refer to the display described here. This handle will be valid for the lifetime of the Vulkan instance."
	)
	const_charUTF8_p.member(
		"displayName",
		"a pointer to a NULL-terminated string containing the name of the display. Generally, this will be the name provided by the display’s EDID. It can be NULL if no suitable name is available."
	)
	VkExtent2D.member("physicalDimensions", "the physical width and height of the visible portion of the display, in millimeters")
	VkExtent2D.member("physicalResolution", "the physical, native, or preferred resolution of the display")
	VkSurfaceTransformFlagsKHR.member("supportedTransforms", "which transforms are supported by this display").flagLinks("SURFACE_TRANSFORM")
	VkBool32.member(
		"planeReorderPossible",
		"""
		whether the planes on this display can have their z order changed. If this is #TRUE, the application can re-arrange the planes on this display in any
		order relative to each other.
		"""
	)
	VkBool32.member(
		"persistentContent",
		"""
		whether the display supports self-refresh/internal buffering. If this is true, the application can submit persistent present operations on swapchains
		created against this display.
		"""
	)
}

val VkDisplayModeParametersKHR = struct(VULKAN_PACKAGE, "VkDisplayModeParametersKHR") {
	documentation =
		"""
		${man("VkDisplayModeParametersKHR")}<br>
		${spec("VkDisplayModeParametersKHR")}

		Describes the display parameters associated a display mode.
		"""
	
	VkExtent2D.member("visibleRegion", "the 2D extents of the visible region")
	uint32_t.member("refreshRate", "a {@code uint32_t} that is the number of times the display is refreshed each second multiplied by 1000")
}.nativeType

val VkDisplayModePropertiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayModePropertiesKHR", mutable = false) {
	documentation =
		"""
		${man("VkDisplayModePropertiesKHR")}<br>
		${spec("VkDisplayModePropertiesKHR")}

		Describes properties of a display mode.

		${ValidityStructs.VkDisplayModePropertiesKHR}
		"""
	
	VkDisplayModeKHR.member(
		"displayMode",
		"a handle to the display mode described in this structure. This handle will be valid for the lifetime of the Vulkan instance."
	)
	VkDisplayModeParametersKHR.member(
		"parameters",
		"a ##VkDisplayModeParametersKHR structure describing the display parameters associated with {@code displayMode}"
	)
}

val VkDisplayModeCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayModeCreateInfoKHR") {
	documentation =
		"""
		${man("VkDisplayModeCreateInfoKHR")}<br>
		${spec("VkDisplayModeCreateInfoKHR")}

		Contains information about how a display mode should be created.

		${ValidityStructs.VkDisplayModeCreateInfoKHR}
		"""
	
	sType(this)
	pNext()
	VkDisplayModeCreateFlagsKHR.member("flags", "reserved for future use, and $must be zero")
	VkDisplayModeParametersKHR.member(
		"parameters",
		"a ##VkDisplayModeParametersKHR structure describing the display parameters to use in creating the new mode"
	)
}

val VkDisplayPlaneCapabilitiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayPlaneCapabilitiesKHR", mutable = false) {
	documentation =
		"""
		${man("VkDisplayPlaneCapabilitiesKHR")}<br>
		${spec("VkDisplayPlaneCapabilitiesKHR")}

		Describes capabilities of a mode and plane combination.

		${ValidityStructs.VkDisplayPlaneCapabilitiesKHR}
		"""
	
	VkDisplayPlaneAlphaFlagsKHR.member("supportedAlpha", "a bitmask describing the supported alpha blending modes").flagLinks("DISPLAY_PLANE_ALPHA")
	VkOffset2D.member("minSrcPosition", "the minimum source rect offset supported by this plane using the specified mode")
	VkOffset2D.member("maxSrcPosition", "the maximum source rect offset supported by this plane using the specified mode")
	VkExtent2D.member("minSrcExtent", "the minimum source rect size supported by this plane using the specified mode")
	VkExtent2D.member("maxSrcExtent", "the maximum source rect size supported by this plane using the specified mode")
	VkOffset2D.member("minDstPosition", "the minimum output rect offset supported by this plane using the specified mode")
	VkOffset2D.member("maxDstPosition", "the maximum output rect offset supported by this plane using the specified mode")
	VkExtent2D.member("minDstExtent", "the minimum output rect size supported by this plane using the specified mode")
	VkExtent2D.member("maxDstExtent", "the maximum output rect size supported by this plane using the specified mode")
}

val VkDisplayPlanePropertiesKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplayPlanePropertiesKHR", mutable = false) {
	documentation =
		"""
		${man("VkDisplayPlanePropertiesKHR")}<br>
		${spec("VkDisplayPlanePropertiesKHR")}

		Describes properties of a display plane.

		${ValidityStructs.VkDisplayPlanePropertiesKHR}
		"""
	
	VkDisplayKHR.member(
		"currentDisplay",
		"the handle of the display the plane is currently associated with. If the plane is not currently attached to any displays, this will be #NULL_HANDLE."
	)
	uint32_t.member("currentStackIndex", "the current z-order of the plane")
}

val VkDisplaySurfaceCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkDisplaySurfaceCreateInfoKHR") {
	documentation =
		"""
		${man("VkDisplaySurfaceCreateInfoKHR")}<br>
		${spec("VkDisplaySurfaceCreateInfoKHR")}

		Contains information about how a display surface should be created.

		${ValidityStructs.VkDisplaySurfaceCreateInfoKHR}
		"""

	sType(this)
	pNext()
	VkDisplaySurfaceCreateFlagsKHR.member("flags", "reserved for future use, and $must be zero")
	VkDisplayModeKHR.member("displayMode", "the mode to use when displaying this surface")
	uint32_t.member("planeIndex", "the plane on which this surface appears")
	uint32_t.member("planeStackIndex", "the z-order of the plane")
	VkSurfaceTransformFlagBitsKHR.member("transform", "the transform to apply to the images as part of the scannout operation")
		.links("SURFACE_TRANSFORM_\\w+_BIT_KHR")
	float.member("globalAlpha", "the global alpha value. This value is ignored if {@code alphaMode} is not #DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR.")
	VkDisplayPlaneAlphaFlagBitsKHR.member("alphaMode", "the type of alpha blending to use").links("DISPLAY_PLANE_ALPHA_\\w+_BIT_KHR")
	VkExtent2D.member("imageExtent", "the size of the presentable images to use with the surface")
}

// KHR_display_swapchain

val VkDisplayPresentInfoKHR = struct(VULKAN_PACKAGE, "VkDisplayPresentInfoKHR") {
	documentation =
		"""
		${man("VkDisplayPresentInfoKHR")}<br>
		${spec("VkDisplayPresentInfoKHR")}

		When the {@code VK_KHR_display_swapchain} extension is enabled additional fields can be specified when presenting an image to a swapchain by setting
		##VkPresentInfoKHR{@code ::pNext} to point to a {@code VkDisplayPresentInfoKHR} structure.

		${ValidityStructs.VkDisplayPresentInfoKHR}
		"""
	
	sType(this)
	pNext()
	VkRect2D.member(
		"srcRect",
		"""
		a rectangular region of pixels to present. It must be a subset of the image being presented. If {@code VkDisplayPresentInfoKHR} is not specified, this
		region will be assumed to be the entire presentable image.
		"""
	)
	VkRect2D.member(
		"dstRect",
		"""
		a rectangular region within the visible region of the swapchain’s display mode. If {@code VkDisplayPresentInfoKHR} is not specified, this region will
		be assumed to be the entire visible region of the visible region of the swapchain’s mode. If the specified rectangle is a subset of the display mode’s
		visible region, content from display planes below the swapchain’s plane will be visible outside the rectangle. If there are no planes below the
		swapchain’s, the area outside the specified rectangle will be black. If portions of the specified rectangle are outside of the display’s visible
		region, pixels mapping only to those portions of the rectangle will be discarded.
		"""
	)
	VkBool32.member(
		"persistent",
		"""
		if #TRUE, the display engine will enable buffered mode on displays that support it. This allows the display engine to stop sending content to the
		display until a new image is presented. The display will instead maintain a copy of the last presented image. This allows less power to be used, but
		may increase presentation latency. If {@code VkDisplayPresentInfoKHR} is not specified, persistent mode will not be used.
		"""
	)
}

// KHR_swapchain

val VkSwapchainKHR = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSwapchainKHR")

val VkSwapchainCreateFlagsKHR = typedef(VkFlags, "VkSwapchainCreateFlagsKHR")
val VkCompositeAlphaFlagBitsKHR = "VkCompositeAlphaFlagBitsKHR".enumType

val VkSwapchainCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkSwapchainCreateInfoKHR") {
	documentation =
		"""
		${man("VkSwapchainCreateInfoKHR")}<br>
		${spec("VkSwapchainCreateInfoKHR")}

		Contains information about how a swapchain should be created.

		${ValidityStructs.VkSwapchainCreateInfoKHR}
		"""

    sType(this)
	pNext()
    VkSwapchainCreateFlagsKHR.member("flags", "reserved for future use, and $must be zero")
    VkSurfaceKHR.member("surface", "the surface that the swapchain will present images to")
    uint32_t.member(
	    "minImageCount",
	    """
	    the minimum number of presentable images that the application needs. The platform will either create the swapchain with at least that many images, or
	    will fail to create the swapchain.
	    """)
    VkFormat.member("imageFormat", "a {@code VkFormat} that is valid for swapchains on the specified surface")
    VkColorSpaceKHR.member("imageColorSpace", "a {@code VkColorSpaceKHR} that is valid for swapchains on the specified surface").links("COLORSPACE_\\w+_KHR")
    VkExtent2D.member(
	    "imageExtent",
	    """
	    the size (in pixels) of the swapchain. Behavior is platform-dependent when the image extent does not match the surface’s {@code currentExtent} as
	    returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR().
	    """
    )
    uint32_t.member("imageArrayLayers", "the number of views in a multiview/stereo surface. For non-stereoscopic-3D applications, this value is 1")
    VkImageUsageFlags.member(
	    "imageUsage",
	    "a bitfield of {@code VkImageUsageFlagBits}, indicating how the application will use the swapchain’s presentable images"
    ).flagLinks("IMAGE_USAGE")
    VkSharingMode.member("imageSharingMode", "the sharing mode used for the images of the swapchain").links("SHARING_MODE_\\w+")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t.member(
	    "queueFamilyIndexCount",
	    "the number of queue families having access to the images of the swapchain in case {@code imageSharingMode} is #SHARING_MODE_CONCURRENT")
	uint32_t.const_p.member(
		"pQueueFamilyIndices",
		"an array of queue family indices having access to the images of the swapchain in case {@code imageSharingMode} is #SHARING_MODE_CONCURRENT")
    VkSurfaceTransformFlagBitsKHR.member(
	    "preTransform",
	    """
		a bitfield of {@code VkSurfaceTransformFlagBitsKHR}, describing the transform, relative to the presentation engine’s natural orientation, applied to
		the image content prior to presentation. If it does not match the {@code currentTransform} value returned by
		#GetPhysicalDeviceSurfaceCapabilitiesKHR(), the presentation engine will transform the image content as part of the presentation operation.
	    """
    ).links("SURFACE_TRANSFORM_\\w+_BIT_KHR")
    VkCompositeAlphaFlagBitsKHR.member(
	    "compositeAlpha",
	    """
	    a bitfield of {@code VkCompositeAlphaFlagBitsKHR}, indicating the alpha compositing mode to use when this surface is composited together with other
	    surfaces on certain window systems
	    """
    ).links("COMPOSITE_ALPHA_\\w+_BIT_KHR")
    VkPresentModeKHR.member(
	    "presentMode",
	    """
	    the presentation mode the swapchain will use. A swapchain’s present mode determines how incoming present requests will be processed and queued
	    internally.
	    """
    ).links("PRESENT_MODE_\\w+_KHR")
    VkBool32.member(
	    "clipped",
	    """
	    indicates whether the Vulkan implementation is allowed to discard rendering operations that affect regions of the surface which aren’t visible.

		If set to #TRUE, the presentable images associated with the swapchain may not own all of their pixels. Pixels in the presentable images that correspond
		to regions of the target surface obscured by another window on the desktop or subject to some other clipping mechanism will have undefined content when
		read back. Pixel shaders may not execute for these pixels, and thus any side affects they would have had will not occur.

		If set to #FALSE, presentable images associated with the swapchain will own all the pixels they contain.

		Setting this value to #TRUE does not guarantee any clipping will occur, but allows more optimal presentation methods to be used on some platforms.

		${note(
		    """
		    Applications should set this value to #TRUE if they do not expect to read back the content of presentable images before presenting them or after
		    reacquiring them and if their pixel shaders do not have any side effects that require them to run for all pixels in the presentable image.
		    """
	    )}
	    """
    )
    VkSwapchainKHR.member(
	    "oldSwapchain",
	    """
	    if non-$NULL, specifies the swapchain that will be replaced by the new swapchain being created. Upon calling #CreateSwapchainKHR() with a non-$NULL
	    {@code oldSwapchain}, any images not acquired by the application may be freed by the implementation, which may occur even if creation of the new
	    swapchain fails. The application must destroy the old swapchain to free all memory associated with the old swapchain. The application must wait for the
	    completion of any outstanding rendering to images it currently has acquired at the time the swapchain is destroyed. The application can continue to
	    present any images it acquired and has not yet presented using the old swapchain, as long as it has not entered a state that causes it to return
	    #ERROR_OUT_OF_DATE_KHR. However, the application cannot acquire any more images from the old swapchain regardless of whether or not creation of the new
	    swapchain succeeds.
	    """
    )
}

val VkPresentInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkPresentInfoKHR") {
	documentation =
		"""
		${man("VkPresentInfoKHR")}<br>
		${spec("VkPresentInfoKHR")}

		Specifies the parameters of an image presentation.

		${ValidityStructs.VkPresentInfoKHR}
		"""

    sType(this)
	pNext()
    AutoSize("pWaitSemaphores", optional = true)..uint32_t.member(
	    "waitSemaphoreCount",
	    "the number of semaphores to wait for before issuing the present request. The number may be zero."
    )
	VkSemaphore.const_p.member(
		"pWaitSemaphores",
		"""
		if non-$NULL, is an array of {@code VkSemaphore} objects with {@code waitSemaphoreCount} entries, and specifies the semaphores to wait for before
		issuing the present request
		"""
	)
    AutoSize("pSwapchains", "pImageIndices", "pResults")..uint32_t.member("swapchainCount", "the number of swapchains being presented to by this command")
    VkSwapchainKHR.const_p.member(
	    "pSwapchains",
	    "an array of {@code VkSwapchainKHR} objects with {@code swapchainCount} entries. A given swapchain must not appear in this list more than once."
    )
    uint32_t.const_p.member(
	    "pImageIndices",
	    """
		an array of indices into the array of each swapchain’s presentable images, with {@code swapchainCount} entries. Each entry in this array identifies the
		image to present on the corresponding entry in the {@code pSwapchains} array.
	    """
    )
	nullable..VkResult.p.member(
		"pResults",
		"""
		an array of {@code VkResult} typed elements with {@code swapchainCount} entries. Applications that don’t need per-swapchain results can use $NULL for
		{@code pResults}. If non-$NULL, each entry in {@code pResults} will be set to the {@code VkResult} for presenting the swapchain corresponding to the
		same index in {@code pSwapchains}.
		"""
	)
}

// KHR_win32_surface

val VkWin32SurfaceCreateFlagsKHR = typedef(VkFlags, "VkWin32SurfaceCreateFlagsKHR")

val VkWin32SurfaceCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkWin32SurfaceCreateInfoKHR") {
	documentation =
		"""
		${man("VkWin32SurfaceCreateFlagsKHR")}<br>
		${spec("VkWin32SurfaceCreateFlagsKHR")}

		Contains information about how a surface for a Win32 window should be created.

		${ValidityStructs.VkWin32SurfaceCreateInfoKHR}
		"""

	sType(this)
	pNext()
	VkWin32SurfaceCreateFlagsKHR.member("flags", "reserved for future use")
	HINSTANCE.member("hinstance", "the WIN32 HINSTANCE for the window to associate the surface with")
	HWND.member("hwnd", "the WIN32 HWND for the window to associate the surface with")
}

// KHR_xlib_surface

val VkXlibSurfaceCreateFlagsKHR = typedef(VkFlags, "VkXlibSurfaceCreateFlagsKHR");

val VkXlibSurfaceCreateInfoKHR_p = struct_p(VULKAN_PACKAGE, "VkXlibSurfaceCreateInfoKHR") {
	documentation =
		"""
		${man("VkXlibSurfaceCreateFlagsKHR")}<br>
		${spec("VkXlibSurfaceCreateFlagsKHR")}

		Contains information about how a surface for a X11 window should be created.

		${ValidityStructs.VkXlibSurfaceCreateInfoKHR}
		"""

	sType(this)
	pNext()
	VkXlibSurfaceCreateFlagsKHR.member("flags", "reserved for future use")
	Display_p.member("dpy", "a pointer to an Xlib Display connection to the X server")
	Window.member("window", "an Xlib Window to associate the surface with")
}