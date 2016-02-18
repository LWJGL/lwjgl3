/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_debug_report = "EXTDebugReport".nativeClassVK("EXT_debug_report", postfix = EXT) {
	documentation =
		"""
		Due to the nature of the Vulkan interface, there is very little error information available to the developer/application. By enabling optional
		validation layers and using the Debug Report extension a developer has much more detailed feedback on the application's use of Vulkan.

		This extension adds two entrypoints (vkCreateDebugReportCallbackEXT, vkDestroyDebugReportCallbackEXT) and an extension structure that together define a
		way for layers and the implementation to call back to the application for events of interest to the application.
		"""

	IntConstant(
		"The extension specification version.",

		"EXT_DEBUG_REPORT_SPEC_VERSION"..1
	)

	StringConstant(
		"The extension name.",

		"EXT_DEBUG_REPORT_EXTENSION_NAME".."VK_EXT_debug_report"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT" expr "1000011000"
	)

	EnumConstant(
		"VkDebugReportObjectTypeEXT",

		"DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT".enum("", 0),
		"DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT".enum(""),
		"DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT".enum("")
	)

	EnumConstant(
		"VkDebugReportErrorEXT",

		"DEBUG_REPORT_ERROR_NONE_EXT".enum("", 0),
		"DEBUG_REPORT_ERROR_CALLBACK_REF_EXT".enum("")
	)

	EnumConstant(
		"VkDebugReportFlagBitsEXT",

		"DEBUG_REPORT_INFORMATION_BIT_EXT".enum("", 0x00000001),
		"DEBUG_REPORT_WARNING_BIT_EXT".enum("", 0x00000002),
		"DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT".enum("", 0x00000004),
		"DEBUG_REPORT_ERROR_BIT_EXT".enum("", 0x00000008),
		"DEBUG_REPORT_DEBUG_BIT_EXT".enum("", 0x00000010)
	)

	VkResult(
		"CreateDebugReportCallbackEXT",
		"",

		VkInstance.IN("instance", ""),
		const..VkDebugReportCallbackCreateInfoEXT_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkDebugReportCallbackEXT.p.OUT("pCallback", "")
	)

	void(
		"DestroyDebugReportCallbackEXT",
		"",

		VkInstance.IN("instance", ""),
		VkDebugReportCallbackEXT.IN("callback", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	void(
		"DebugReportMessageEXT",
		"",

		VkInstance.IN("instance", ""),
		VkDebugReportFlagsEXT.IN("flags", ""),
		VkDebugReportObjectTypeEXT.IN("objectType", ""),
		uint64_t.IN("object", ""),
		size_t.IN("location", ""),
		int32_t.IN("messageCode", ""),
		const..char_p.IN("pLayerPrefix", ""),
		const..char_p.IN("pMessage", "")
	)
}