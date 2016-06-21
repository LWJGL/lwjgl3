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

		This extension adds two entrypoints (#CreateDebugReportCallbackEXT(), #DestroyDebugReportCallbackEXT()) and an extension structure that together define
		a way for layers and the implementation to call back to the application for events of interest to the application.

		Using the {@code VK_EXT_debug_report} extension allows an application to register multiple callbacks with the validation layers. Some callbacks may log
		the information to a file, others may cause a debug break point or other application defined behavior. An application can register callbacks even when
		no validation layers are enabled, but they will only be called for loader and, if implemented, driver events.

		To capture issues found while creating or destroying an instance an application can link a ##VkDebugReportCallbackCreateInfoEXT structure to the
		{@code pNext} element of the ##VkInstanceCreateInfo structure given to #CreateInstance(). This callback is only valid for the duration of the
		#CreateInstance() and the #DestroyInstance() call. Use #CreateDebugReportCallbackEXT() to create persistent callback objects.
		"""

	IntConstant(
		"The extension specification version.",

		"EXT_DEBUG_REPORT_SPEC_VERSION".."3"
	)

	StringConstant(
		"The extension name.",

		"EXT_DEBUG_REPORT_EXTENSION_NAME".."VK_EXT_debug_report"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT".."1000011000"
	)

	val VkDebugReportObjectTypesEXT = EnumConstant(
		"VkDebugReportObjectTypeEXT",

		"DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT".enum("", "0"),
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
	).javaDocLinks

	EnumConstant(
		"VkDebugReportErrorEXT",

		"DEBUG_REPORT_ERROR_NONE_EXT".enum("", "0"),
		"DEBUG_REPORT_ERROR_CALLBACK_REF_EXT".enum("")
	)

	val VkDebugReportFlagBitsEXT = EnumConstant(
		"VkDebugReportFlagBitsEXT",

		"DEBUG_REPORT_INFORMATION_BIT_EXT".enum(
			"Indicates an informational message such as resource details that may be handy when debugging an application.",
			0x00000001
		),
		"DEBUG_REPORT_WARNING_BIT_EXT".enum(
			"""
			Indicates an unexpected use.

			E.g. Not destroying objects prior to destroying the containing object or potential inconsistencies between descriptor set layout and the layout in
			the corresponding shader, etc.
			""",
			0x00000002
		),
		"DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT".enum(
			"""
			Indicates a potentially non-optimal use of Vulkan.

            E.g. using {@code vkCmdClearImage} when a RenderPass {@code load_op} would have worked.
			""",
			0x00000004
		),
		"DEBUG_REPORT_ERROR_BIT_EXT".enum("Indicates an error that may cause undefined results, including an application crash.", 0x00000008),
		"DEBUG_REPORT_DEBUG_BIT_EXT".enum("Indicates diagnostic information from the loader and layers.", 0x00000010)
	).javaDocLinks

	IntConstant(
		"VkResult",

		"ERROR_VALIDATION_FAILED_EXT".."-1000011001"
	)

	VkResult(
		"CreateDebugReportCallbackEXT",
		"""
		Registers a callback.

		For each {@code VkDebugReportCallbackEXT} that is created the flags determine when that function is called.

		A callback will be made for issues that match any bit set in its flags. The callback will come directly from the component that detected the event,
		unless some other layer intercepts the calls for its own purposes (filter them in different way, log to system error log, etc.)

		An application may receive multiple callbacks if multiple {@code VkDebugReportCallbackEXT} objects were created. A callback will always be executed in
		the same thread as the originating Vulkan call. A callback may be called from multiple threads simultaneously (if the application is making Vulkan
		calls from multiple threads).

		${ValidityProtos.vkCreateDebugReportCallbackEXT}
		""",

		VkInstance.IN("instance", "the instance the callback will be logged on"),
		const..VkDebugReportCallbackCreateInfoEXT_p.IN(
			"pCreateInfo",
			"points to a ##VkDebugReportCallbackCreateInfoEXT structure which defines the conditions under which this callback will be called"
		),
		pAllocator,
		Check(1)..VkDebugReportCallbackEXT.p.OUT("pCallback", "a pointer to record the sname:VkDebugReportCallbackEXT object created")
	)

	void(
		"DestroyDebugReportCallbackEXT",
		"""
		Destroys a {@code VkDebugReportCallbackEXT}.

		${ValidityProtos.vkDestroyDebugReportCallbackEXT}
		""",

		VkInstance.IN("instance", "the instance where the callback was created"),
		VkDebugReportCallbackEXT.IN("callback", "the {@code VkDebugReportCallbackEXT} object to destroy"),
		pAllocator
	)

	void(
		"DebugReportMessageEXT",
		"""
		Injects a custom message into the debug stream.

		${ValidityProtos.vkDebugReportMessageEXT}

		The call will propagate through the layers and cause a callback to the application. The parameters are passed on to the callback in addition to the
		{@code pUserData} value that was defined at the time the callback was registered.
		""",

		VkInstance.IN("instance", "the instance the callback will be logged on"),
		VkDebugReportFlagsEXT.IN("flags", "indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback", VkDebugReportFlagBitsEXT),
		VkDebugReportObjectTypeEXT.IN(
			"objectType",
			"the type of object being used / created at the time the event was triggered",
			VkDebugReportObjectTypesEXT
		),
		uint64_t.IN(
			"object",
			"the object where the issue was detected. {@code object} may be #NULL_HANDLE if there is no object associated with the event."
		),
		size_t.IN("location", "a component (layer, driver, loader) defined value that indicates the \"location\" of the trigger. This is an optional value."),
		int32_t.IN("messageCode", " a layer defined value indicating what test triggered this callback"),
		const..charUTF8_p.IN("pLayerPrefix", "abbreviation of the component making the callback"),
		const..charUTF8_p.IN("pMessage", "a null terminated string detailing the trigger conditions")
	)
}