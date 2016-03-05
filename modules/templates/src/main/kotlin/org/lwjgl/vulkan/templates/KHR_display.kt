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

		"DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR".enum("", 0x00000001),
		"DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR".enum("", 0x00000002),
		"DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR".enum("", 0x00000004),
		"DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR".enum("", 0x00000008)
	)

	VkResult(
		"GetPhysicalDeviceDisplayPropertiesKHR",
		"Queries information about the available displays.",

		VkPhysicalDevice.IN("physicalDevice", "a valid physical device"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "the number of entries in the array pointed to by {@code pProperties}"),
		nullable..VkDisplayPropertiesKHR_p.OUT("pProperties", "a pointer to an array of {@code pPropertyCount} ##VkDisplayPropertiesKHR structures")
	)

	VkResult(
		"GetPhysicalDeviceDisplayPlanePropertiesKHR",
		"Queries the plane properties.",

		VkPhysicalDevice.IN("physicalDevice", "a valid physical device"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "the number of entries in the array pointed to by {@code pProperties}"),
		nullable..VkDisplayPlanePropertiesKHR_p.OUT("pProperties", "a pointer to an array of {@code pPropertyCount} ##VkDisplayPlanePropertiesKHR structures.")
	)

	VkResult(
		"GetDisplayPlaneSupportedDisplaysKHR",
		"Gets list of displays a plane supports.",

		VkPhysicalDevice.IN("physicalDevice", "a valid physical device"),
		uint32_t.IN("planeIndex", "the plane which the application wishes to use"),
		AutoSize("pDisplays")..Check(1)..uint32_t_p.INOUT("pDisplayCount", "the number of entries in the array pointed to by {@code pDisplays}"),
		nullable..VkDisplayKHR.p.OUT("pDisplays", "a pointer to an array of {@code pDisplayCount} {@code VkDisplayKHR} handles.")
	)

	VkResult(
		"GetDisplayModePropertiesKHR",
		"Gets the set of mode properties supported by the display.",

		VkPhysicalDevice.IN("physicalDevice", "the physical device associated with the display"),
		VkDisplayKHR.IN("display", "a display present on the physical device"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "the number of entries in the array pointed to by {@code pProperties}"),
		nullable..VkDisplayModePropertiesKHR_p.OUT("pProperties", "a pointer to an array of {@code pPropertyCount} ##VkDisplayModePropertiesKHR structures")
	)

	VkResult(
		"CreateDisplayModeKHR",
		"Creates a display mode.",

		VkPhysicalDevice.IN("physicalDevice", "the physical device associated with display"),
		VkDisplayKHR.IN("display", "the display to create an additional mode"),
		const..VkDisplayModeCreateInfoKHR_p.IN("pCreateInfo", "a ##VkDisplayModeCreateInfoKHR structure describing the new mode to create"),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "the allocator used for host memory allocated for the mode object"),
		Check(1)..VkDisplayModeKHR.p.OUT("pMode", "returns the handle of the mode created")
	)

	VkResult(
		"GetDisplayPlaneCapabilitiesKHR",
		"Gets the capabilities of a mode and plane combination.",

		VkPhysicalDevice.IN("physicalDevice", "the physical device associated with the display"),
		VkDisplayModeKHR.IN("mode", "the display mode the application intends to program when using the specified plane"),
		uint32_t.IN("planeIndex", "the plane which the application intends to use with the display"),
		VkDisplayPlaneCapabilitiesKHR_p.OUT("pCapabilities", "a pointer to a ##VkDisplayPlaneCapabilitiesKHR struct")
	)

	VkResult(
		"CreateDisplayPlaneSurfaceKHR",
		"Creates a ##VkSurfaceKHR structure representing a display plane and mode.",

		VkInstance.IN("instance", "the {@code VkInstance} to associate the surface"),
		const..VkDisplaySurfaceCreateInfoKHR_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkDisplaySurfaceCreateInfoKHR structure containing the parameters affecting the creation of the surface object"
		),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "the allocator used for host memory allocated for the surface object"),
		Check(1)..VkSurfaceKHR_p.OUT("pSurface", "the resulting surface object handle is returned in {@code pSurface}")
	)
}