/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_display = "KHRDisplay".nativeClassVK("KHR_display", postfix = KHR) {
	documentation =
		"This extension provides the API to enumerate displays and available modes on a given device."

	IntConstant(
		"The extension specification version.",

		"KHR_DISPLAY_SPEC_VERSION" expr "21"
	)

	StringConstant(
		"The extension name.",

		"KHR_DISPLAY_EXTENSION_NAME".."VK_KHR_display"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR" expr "1000002000",
        "STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR" expr "1000002001"
	)

	EnumConstant(
		"VkDisplayPlaneAlphaFlagBitsKHR",

		"DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR".enum("The source image will be treated as opaque.", 0x00000001),
		"DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR".enum("A global alpha value must be specified that will be applied to all pixels in the source image.", 0x00000002),
		"DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR".enum(
			"""
			The alpha value will be determined by the alpha channel of the source image’s pixels. If the source format contains no alpha values, no blending
			will be applied. The source alpha values are not premultiplied into the source image’s other color channels.
			""",
			0x00000004
		),
		"DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR".enum(
			"""
			This is equivalent to #DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR except the source alpha values are assumed to be premultiplied into the source image’s
			other color channels.
			""",
			0x00000008
		)
	)

	VkResult(
		"GetPhysicalDeviceDisplayPropertiesKHR",
		"""
		Queries information about the available displays.

		If {@code pProperties} is $NULL, then the number of display devices available for {@code physicalDevice} is returned in {@code pPropertyCount}.
		Otherwise, {@code pPropertyCount} $must point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return
		the variable is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than
		the number of display devices for {@code physicalDevice}, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is
		smaller than the number of display devices available for {@code physicalDevice}, #INCOMPLETE will be returned instead of #SUCCESS to indicate
		that not all the available values were returned.

		${ValidityProtos.vkGetPhysicalDeviceDisplayPropertiesKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "a physical device"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"a pointer to an integer related to the number of display devices available or queried"
		),
		nullable..VkDisplayPropertiesKHR_p.OUT("pProperties", "either $NULL or a pointer to an array of ##VkDisplayPropertiesKHR structures")
	)

	VkResult(
		"GetPhysicalDeviceDisplayPlanePropertiesKHR",
		"""
		Queries the plane properties.

		Images are presented to individual planes on a display. Devices $must support at least one plane on each display. Planes $can be stacked and blended to
		composite multiple images on one display. Devices $may support only a fixed stacking order and fixed mapping between planes and displays, or they $may
		allow arbitrary application specified stacking orders and mappings between planes and displays.

		If {@code pProperties} is $NULL, then the number of display planes available for {@code physicalDevice} is returned in {@code pPropertyCount}.
		Otherwise, {@code pPropertyCount} $must point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return
		the variable is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than
		the number of display planes for {@code physicalDevice}, at most {@code pPropertyCount} structures will be written.

		${ValidityProtos.vkGetPhysicalDeviceDisplayPlanePropertiesKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "a valid physical device"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"a pointer to an integer related to the number of display planes available or queried"
		),
		nullable..VkDisplayPlanePropertiesKHR_p.OUT("pProperties", "either $NULL or a pointer to an array of ##VkDisplayPlanePropertiesKHR structures")
	)

	VkResult(
		"GetDisplayPlaneSupportedDisplaysKHR",
		"""
		Determines which displays a plane is usable with.

		If {@code pDisplays} is $NULL, then the number of displays usable with the specified {@code planeIndex} for {@code physicalDevice} is returned in
		{@code pDisplayCount}. Otherwise, {@code pDisplayCount} $must point to a variable set by the user to the number of elements in the {@code pDisplays}
		array, and on return the variable is overwritten with the number of structures actually written to {@code pDisplays}. If the value of
		{@code pDisplayCount} is less than the number of display planes for {@code physicalDevice}, at most {@code pDisplayCount} structures will be written.
		If {@code pDisplayCount} is smaller than the number of displays usable with the specified {@code planeIndex} for {@code physicalDevice},
		#INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the available values were returned.

		${ValidityProtos.vkGetDisplayPlaneSupportedDisplaysKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "a physical device"),
		uint32_t.IN("planeIndex", "the plane which the application wishes to use, and must be in the range {@code [0, physicaldeviceplanecount − 1]}"),
		AutoSize("pDisplays")..Check(1)..uint32_t_p.INOUT(
			"pDisplayCount",
			"a pointer to an integer related to the number of display planes available or queried"
		),
		nullable..VkDisplayKHR.p.OUT("pDisplays", "either $NULL or a pointer to an array of {@code VkDisplayKHR} structures")
	)

	VkResult(
		"GetDisplayModePropertiesKHR",
		"""
		Gets the set of mode properties supported by the display.

		If {@code pProperties} is $NULL, then the number of display modes available on the specified display for {@code physicalDevice} is returned in
		{@code pPropertyCount}. Otherwise, {@code pPropertyCount} $must point to a variable set by the user to the number of elements in the
		{@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If the
		value of {@code pPropertyCount} is less than the number of display modes for {@code physicalDevice}, at most {@code pPropertyCount} structures will be
		written. If {@code pPropertyCount} is smaller than the number of display modes available on the specified {@code display} for {@code physicalDevice},
		#INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the available values were returned.

		${ValidityProtos.vkGetDisplayModePropertiesKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device associated with the display"),
		VkDisplayKHR.IN("display", "a display present on the physical device"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "the number of entries in the array pointed to by {@code pProperties}"),
		nullable..VkDisplayModePropertiesKHR_p.OUT("pProperties", "a pointer to an array of {@code pPropertyCount} ##VkDisplayModePropertiesKHR structures")
	)

	VkResult(
		"CreateDisplayModeKHR",
		"""
		Creates a display mode.

		${ValidityProtos.vkCreateDisplayModeKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device associated with {@code display}"),
		VkDisplayKHR.IN("display", "the display to create an additional mode"),
		const..VkDisplayModeCreateInfoKHR_p.IN("pCreateInfo", "a ##VkDisplayModeCreateInfoKHR structure describing the new mode to create"),
		pAllocator,
		Check(1)..VkDisplayModeKHR.p.OUT("pMode", "returns the handle of the mode created")
	)

	VkResult(
		"GetDisplayPlaneCapabilitiesKHR",
		"""
		Gets the capabilities of a mode and plane combination.

		Applications that wish to present directly to a display must select which layer, or "plane" of the display they wish to target, and a mode to use with
		the display. Each display supports at least one plane. The capabilities of a given mode and plane combination are determined by calling this command.

		${ValidityProtos.vkGetDisplayPlaneCapabilitiesKHR}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device associated with the {@code display}"),
		VkDisplayModeKHR.IN(
			"mode",
			"the display mode the application intends to program when using the specified plane.  Note this parameter also implicitly specifies a display."
		),
		uint32_t.IN(
			"planeIndex",
			"the plane which the application intends to use with the display, and is less than the number of display planes supported by the device"
		),
		VkDisplayPlaneCapabilitiesKHR_p.OUT("pCapabilities", "a pointer to a ##VkDisplayPlaneCapabilitiesKHR struct")
	)

	VkResult(
		"CreateDisplayPlaneSurfaceKHR",
		"""
		Creates a {@code VkSurfaceKHR} structure representing a display plane and mode.

		${ValidityProtos.vkCreateDisplayPlaneSurfaceKHR}
		""",

		VkInstance.IN("instance", "the instance corresponding to the physical device the targeted display is on"),
		const..VkDisplaySurfaceCreateInfoKHR_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkDisplaySurfaceCreateInfoKHR structure containing the parameters affecting the creation of the surface object"
		),
		pAllocator,
		Check(1)..VkSurfaceKHR_p.OUT("pSurface", "points to a {@code VkSurfaceKHR} handle in which the created surface is returned")
	)
}