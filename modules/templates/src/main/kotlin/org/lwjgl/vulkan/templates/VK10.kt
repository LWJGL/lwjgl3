/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val VK10 = "VK10".nativeClass(VULKAN_PACKAGE, "VK10", prefix = "VK", binding = VK_BINDING) {
	documentation =
		"""
		The core Vulkan 1.0 functionality.
		"""

	val major = 1
	val minor = 0
	val patch = 5

	IntConstant("The Vulkan major version number.", "VERSION_MAJOR" expr "$major")
	IntConstant("The Vulkan minor version number.", "VERSION_MINOR" expr "$minor")
	IntConstant("The Vulkan patch version number.", "VERSION_PATCH" expr "$patch")

	IntConstant(
		"""
		The Vulkan version number is used in several places in the API. In each such use, the API major version number, minor version number, and patch version
		number are packed into a 32-bit integer as follows:
		${ul(
			"The major version number is a 10-bit integer packed into bits 31-22.",
			"The minor version number is a 10-bit integer packed into bits 21-12.",
			"The patch version number is a 12-bit integer packed into bits 11-0."
		)}
		Differences in any of the Vulkan version numbers indicates a change to the API in some way, with each part of the version number indicating a different
		scope of changes.

		A difference in patch version numbers indicates that some usually small aspect of the specification or header has been modified, typically to fix a
		bug, and may have an impact on the behavior of existing functionality. Differences in this version number $shouldnot affect either full compatibility
		or backwards compatibility between two versions, or add additional interfaces to the API.

		A difference in minor version numbers indicates that some amount of new functionality has been added. This will usually include new interfaces in the
		header, and may also include behavior changes and bug fixes. Functionality may be deprecated in a minor revision, but will not be removed. When a new
		minor version is introduced, the patch version is reset to 0, and each minor revision maintains its own set of patch versions. Differences in this
		version $shouldnot affect backwards compatibility, but will affect full compatibility.

		A difference in major version numbers indicates a large set of changes to the API, potentially including new functionality and header interfaces,
		behavioral changes, removal of deprecated features, modification or outright replacement of any feature, and is thus very likely to break any and all
		compatibility. Differences in this version will typically require significant modification to an application in order for it to function.
		""",

		"API_VERSION".expr("(VK_VERSION_MAJOR << 22) | (VK_VERSION_MINOR << 12) | VK_VERSION_PATCH")
	)

	LongConstant(
		"""
		The reserved handle {@code VK_NULL_HANDLE} $can be passed in place of valid object handles when explicitly called out in the specification. Any command
		that creates an object successfully $mustnot return {@code VK_NULL_HANDLE}. It is valid to pass {@code VK_NULL_HANDLE} to any {@code vkDestroy*} or
		{@code vkFree*} command, which will silently ignore these values.
		""",

		"NULL_HANDLE"..0L
	)

	FloatConstant(
		"",

		"LOD_CLAMP_NONE"..1000.0f
	)

	IntConstant(
		"",

		"TRUE" expr "1",
		"FALSE" expr "0",
		"MAX_PHYSICAL_DEVICE_NAME_SIZE" expr "256",
		"UUID_SIZE" expr "16",
		"MAX_MEMORY_TYPES" expr "32",
		"MAX_MEMORY_HEAPS" expr "16",
		"MAX_EXTENSION_NAME_SIZE" expr "256",
		"MAX_DESCRIPTION_SIZE" expr "256"
	)

	IntConstant(
		"",

		"REMAINING_MIP_LEVELS" expr "(~0)",
		"REMAINING_ARRAY_LAYERS" expr "(~0)",
		"ATTACHMENT_UNUSED" expr "(~0)",
		"QUEUE_FAMILY_IGNORED" expr "(~0)",
		"SUBPASS_EXTERNAL" expr "(~0)"
	)

	LongConstant(
		"",

		"WHOLE_SIZE" expr "(~0L)"
	)

	EnumConstant(
		"VkPipelineCacheHeaderVersion",

		"PIPELINE_CACHE_HEADER_VERSION_ONE".enumExpr("", "1"),
		"PIPELINE_CACHE_HEADER_VERSION_BEGIN_RANGE".enumExpr("", "VK_PIPELINE_CACHE_HEADER_VERSION_ONE"),
		"PIPELINE_CACHE_HEADER_VERSION_END_RANGE".enumExpr("", "VK_PIPELINE_CACHE_HEADER_VERSION_ONE"),
		"PIPELINE_CACHE_HEADER_VERSION_RANGE_SIZE".enumExpr("", "VK_PIPELINE_CACHE_HEADER_VERSION_ONE - VK_PIPELINE_CACHE_HEADER_VERSION_ONE + 1"),
		"PIPELINE_CACHE_HEADER_VERSION_MAX_ENUM" enum 0x7FFFFFFF
	)

	EnumConstant(
		"VkResult",

		"SUCCESS".enumExpr("Command successfully completed.", "0"),
		"NOT_READY".enumExpr("A fence or query has not yet completed.", "1"),
		"TIMEOUT".enumExpr("A wait operation has not completed in the specified time.", "2"),
		"EVENT_SET".enumExpr("An event is signaled.", "3"),
		"EVENT_RESET".enumExpr("An event is unsignaled.", "4"),
		"INCOMPLETE".enumExpr("A return array was too small for the result.", "5"),

		"ERROR_OUT_OF_HOST_MEMORY".enumExpr("A host memory allocation has failed.", "-1"),
		"ERROR_OUT_OF_DEVICE_MEMORY".enumExpr("A device memory allocation has failed.", "-2"),
		"ERROR_INITIALIZATION_FAILED".enumExpr("Initialization of an object could not be completed for implementation-specific reasons.", "-3"),
		"ERROR_DEVICE_LOST".enumExpr("The logical or physical device has been lost.", "-4"),
		"ERROR_MEMORY_MAP_FAILED".enumExpr("Mapping of a memory object has failed.", "-5"),
		"ERROR_LAYER_NOT_PRESENT".enumExpr("A requested layer is not present or could not be loaded.", "-6"),
		"ERROR_EXTENSION_NOT_PRESENT".enumExpr("A requested extension is not supported.", "-7"),
		"ERROR_FEATURE_NOT_PRESENT".enumExpr("A requested feature is not supported.", "-8"),
		"ERROR_INCOMPATIBLE_DRIVER".enumExpr(
			"The requested version of Vulkan is not supported by the driver or is otherwise incompatible for implementation-specific reasons.",
			"-9"
		),
		"ERROR_TOO_MANY_OBJECTS".enumExpr("Too many objects of the type have already been created.", "-10"),
		"ERROR_FORMAT_NOT_SUPPORTED".enumExpr("A requested format is not supported on this device.", "-11"),
		"RESULT_BEGIN_RANGE".enumExpr("", "VK_ERROR_FORMAT_NOT_SUPPORTED"),
		"RESULT_END_RANGE".enumExpr("", "VK_INCOMPLETE"),
		"RESULT_RANGE_SIZE".enumExpr("", "VK_INCOMPLETE - VK_ERROR_FORMAT_NOT_SUPPORTED + 1"),
		"RESULT_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_APPLICATION_INFO".enumExpr("", "0"),
		"STRUCTURE_TYPE_INSTANCE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_DEVICE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_SUBMIT_INFO".enum(""),
		"STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO".enum(""),
		"STRUCTURE_TYPE_MAPPED_MEMORY_RANGE".enum(""),
		"STRUCTURE_TYPE_BIND_SPARSE_INFO".enum(""),
		"STRUCTURE_TYPE_FENCE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_EVENT_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_BUFFER_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_IMAGE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_SAMPLER_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO".enum(""),
		"STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET".enum(""),
		"STRUCTURE_TYPE_COPY_DESCRIPTOR_SET".enum(""),
		"STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO".enum(""),
		"STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO".enum(""),
		"STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO".enum(""),
		"STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO".enum(""),
		"STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER".enum(""),
		"STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER".enum(""),
		"STRUCTURE_TYPE_MEMORY_BARRIER".enum(""),
		"STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO".enum(""),
		"STRUCTURE_TYPE_BEGIN_RANGE".enumExpr("", "VK_STRUCTURE_TYPE_APPLICATION_INFO"),
		"STRUCTURE_TYPE_END_RANGE".enumExpr("", "VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO"),
		"STRUCTURE_TYPE_RANGE_SIZE".enumExpr("", "VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO - VK_STRUCTURE_TYPE_APPLICATION_INFO + 1"),
		"STRUCTURE_TYPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkSystemAllocationScope",

		"SYSTEM_ALLOCATION_SCOPE_COMMAND".enumExpr("The allocation is scoped to the lifetime of the Vulkan command.", "0"),
		"SYSTEM_ALLOCATION_SCOPE_OBJECT".enum("The allocation is scoped to the lifetime of the Vulkan object that is being created or used."),
		"SYSTEM_ALLOCATION_SCOPE_CACHE".enum("The allocation is scoped to the lifetime of a {@code VkPipelineCache} object."),
		"SYSTEM_ALLOCATION_SCOPE_DEVICE".enum("The allocation is scoped to the lifetime of the Vulkan device."),
		"SYSTEM_ALLOCATION_SCOPE_INSTANCE".enum("The allocation is scoped to the lifetime of the Vulkan instance."),
		"SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE".enumExpr("", "VK_SYSTEM_ALLOCATION_SCOPE_COMMAND"),
		"SYSTEM_ALLOCATION_SCOPE_END_RANGE".enumExpr("", "VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE"),
		"SYSTEM_ALLOCATION_SCOPE_RANGE_SIZE".enumExpr("", "VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE - VK_SYSTEM_ALLOCATION_SCOPE_COMMAND + 1"),
		"SYSTEM_ALLOCATION_SCOPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkInternalAllocationType",

		"INTERNAL_ALLOCATION_TYPE_EXECUTABLE".enumExpr("The allocation is intended for execution by the host.", "0"),
		"INTERNAL_ALLOCATION_TYPE_BEGIN_RANGE".enumExpr("", "VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE"),
		"INTERNAL_ALLOCATION_TYPE_END_RANGE".enumExpr("", "VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE"),
		"INTERNAL_ALLOCATION_TYPE_RANGE_SIZE".enumExpr("", "VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE - VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE + 1"),
		"INTERNAL_ALLOCATION_TYPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkFormat",

		"FORMAT_UNDEFINED".enumExpr("The format is not specified.", "0"),
		"FORMAT_R4G4_UNORM_PACK8".enum("A two-component, 8-bit packed unsigned normalized format that has a 4-bit R component in bits 4..7, and a 4-bit G component in bits 0..3."),
		"FORMAT_R4G4B4A4_UNORM_PACK16".enum("A four-component, 16-bit packed unsigned normalized format that has a 4-bit R component in bits 12..15, a 4-bit G component in bits 8..11, a 4-bit B component in bits 4..7, and a 4-bit A component in bits 0..3."),
		"FORMAT_B4G4R4A4_UNORM_PACK16".enum("A four-component, 16-bit packed unsigned normalized format that has a 4-bit B component in bits 12..15, a 4-bit G component in bits 8..11, a 4-bit R component in bits 4..7, and a 4-bit A component in bits 0..3."),
		"FORMAT_R5G6B5_UNORM_PACK16".enum("A three-component, 16-bit packed unsigned normalized format that has a 5-bit R component in bits 11..15, a 6-bit G component in bits 5..10, and a 5-bit B component in bits 0..4."),
		"FORMAT_B5G6R5_UNORM_PACK16".enum("A three-component, 16-bit packed unsigned normalized format that has a 5-bit B component in bits 11..15, a 6-bit G component in bits 5..10, and a 5-bit R component in bits 0..4."),
		"FORMAT_R5G5B5A1_UNORM_PACK16".enum("A four-component, 16-bit packed unsigned normalized format that has a 5-bit R component in bits 11..15, a 5-bit G component in bits 6..10, a 5-bit B component in bits 1..5, and a 1-bit A component in bit 0."),
		"FORMAT_B5G5R5A1_UNORM_PACK16".enum("A four-component, 16-bit packed unsigned normalized format that has a 5-bit B component in bits 11..15, a 5-bit G component in bits 6..10, a 5-bit R component in bits 1..5, and a 1-bit A component in bit 0."),
		"FORMAT_A1R5G5B5_UNORM_PACK16".enum("A four-component, 16-bit packed unsigned normalized format that has a 1-bit A component in bit 15, a 5-bit R component in bits 10..14, a 5-bit G component in bits 5..9, and a 5-bit B component in bits 0..4."),
		"FORMAT_R8_UNORM".enum("A one-component, 8-bit unsigned normalized format that has a single 8-bit R component."),
		"FORMAT_R8_SNORM".enum("A one-component, 8-bit signed normalized format that has a single 8-bit R component."),
		"FORMAT_R8_USCALED".enum("A one-component, 8-bit unsigned scaled integer format that has a single 8-bit R component."),
		"FORMAT_R8_SSCALED".enum("A one-component, 8-bit signed scaled integer format that has a single 8-bit R component."),
		"FORMAT_R8_UINT".enum("A one-component, 8-bit unsigned integer format that has a single 8-bit R component."),
		"FORMAT_R8_SINT".enum("A one-component, 8-bit signed integer format that has a single 8-bit R component."),
		"FORMAT_R8_SRGB".enum("A one-component, 8-bit unsigned normalized format that has a single 8-bit R component stored with sRGB nonlinear encoding."),
		"FORMAT_R8G8_UNORM".enum("A two-component, 16-bit unsigned normalized format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1."),
		"FORMAT_R8G8_SNORM".enum("A two-component, 16-bit signed normalized format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1."),
		"FORMAT_R8G8_USCALED".enum("A two-component, 16-bit unsigned scaled integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1."),
		"FORMAT_R8G8_SSCALED".enum("A two-component, 16-bit signed scaled integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1."),
		"FORMAT_R8G8_UINT".enum("A two-component, 16-bit unsigned integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1."),
		"FORMAT_R8G8_SINT".enum("A two-component, 16-bit signed integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1."),
		"FORMAT_R8G8_SRGB".enum("A two-component, 16-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, and an 8-bit G component stored with sRGB nonlinear encoding in byte 1."),
		"FORMAT_R8G8B8_UNORM".enum("A three-component, 24-bit unsigned normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2."),
		"FORMAT_R8G8B8_SNORM".enum("A three-component, 24-bit signed normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2."),
		"FORMAT_R8G8B8_USCALED".enum("A three-component, 24-bit unsigned scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2."),
		"FORMAT_R8G8B8_SSCALED".enum("A three-component, 24-bit signed scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2."),
		"FORMAT_R8G8B8_UINT".enum("A three-component, 24-bit unsigned integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2."),
		"FORMAT_R8G8B8_SINT".enum("A three-component, 24-bit signed integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2."),
		"FORMAT_R8G8B8_SRGB".enum("A three-component, 24-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, and an 8-bit B component stored with sRGB nonlinear encoding in byte 2."),
		"FORMAT_B8G8R8_UNORM".enum("A three-component, 24-bit unsigned normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2."),
		"FORMAT_B8G8R8_SNORM".enum("A three-component, 24-bit signed normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2."),
		"FORMAT_B8G8R8_USCALED".enum("A three-component, 24-bit unsigned scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2."),
		"FORMAT_B8G8R8_SSCALED".enum("A three-component, 24-bit signed scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2."),
		"FORMAT_B8G8R8_UINT".enum("A three-component, 24-bit unsigned integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2."),
		"FORMAT_B8G8R8_SINT".enum("A three-component, 24-bit signed integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2."),
		"FORMAT_B8G8R8_SRGB".enum("A three-component, 24-bit unsigned normalized format that has an 8-bit B component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, and an 8-bit R component stored with sRGB nonlinear encoding in byte 2."),
		"FORMAT_R8G8B8A8_UNORM".enum("A four-component, 32-bit unsigned normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_R8G8B8A8_SNORM".enum("A four-component, 32-bit signed normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_R8G8B8A8_USCALED".enum("A four-component, 32-bit unsigned scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_R8G8B8A8_SSCALED".enum("A four-component, 32-bit signed scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_R8G8B8A8_UINT".enum("A four-component, 32-bit unsigned integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_R8G8B8A8_SINT".enum("A four-component, 32-bit signed integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_R8G8B8A8_SRGB".enum("A four-component, 32-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, an 8-bit B component stored with sRGB nonlinear encoding in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_B8G8R8A8_UNORM".enum("A four-component, 32-bit unsigned normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_B8G8R8A8_SNORM".enum("A four-component, 32-bit signed normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_B8G8R8A8_USCALED".enum("A four-component, 32-bit unsigned scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_B8G8R8A8_SSCALED".enum("A four-component, 32-bit signed scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_B8G8R8A8_UINT".enum("A four-component, 32-bit unsigned integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_B8G8R8A8_SINT".enum("A four-component, 32-bit signed integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_B8G8R8A8_SRGB".enum("A four-component, 32-bit unsigned normalized format that has an 8-bit B component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, an 8-bit R component stored with sRGB nonlinear encoding in byte 2, and an 8-bit A component in byte 3."),
		"FORMAT_A8B8G8R8_UNORM_PACK32".enum("A four-component, 32-bit packed unsigned normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7."),
		"FORMAT_A8B8G8R8_SNORM_PACK32".enum("A four-component, 32-bit packed signed normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7."),
		"FORMAT_A8B8G8R8_USCALED_PACK32".enum("A four-component, 32-bit packed unsigned scaled integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7."),
		"FORMAT_A8B8G8R8_SSCALED_PACK32".enum("A four-component, 32-bit packed signed scaled integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7."),
		"FORMAT_A8B8G8R8_UINT_PACK32".enum("A four-component, 32-bit packed unsigned integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7."),
		"FORMAT_A8B8G8R8_SINT_PACK32".enum("A four-component, 32-bit packed signed integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7."),
		"FORMAT_A8B8G8R8_SRGB_PACK32".enum("A four-component, 32-bit packed unsigned normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component stored with sRGB nonlinear encoding in bits 16..23, an 8-bit G component stored with sRGB nonlinear encoding in bits 8..15, and an 8-bit R component stored with sRGB nonlinear encoding in bits 0..7."),
		"FORMAT_A2R10G10B10_UNORM_PACK32".enum("A four-component, 32-bit packed unsigned normalized format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9."),
		"FORMAT_A2R10G10B10_SNORM_PACK32".enum("A four-component, 32-bit packed signed normalized format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9."),
		"FORMAT_A2R10G10B10_USCALED_PACK32".enum("A four-component, 32-bit packed unsigned scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9."),
		"FORMAT_A2R10G10B10_SSCALED_PACK32".enum("A four-component, 32-bit packed signed scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9."),
		"FORMAT_A2R10G10B10_UINT_PACK32".enum("A four-component, 32-bit packed unsigned integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9."),
		"FORMAT_A2R10G10B10_SINT_PACK32".enum("A four-component, 32-bit packed signed integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9."),
		"FORMAT_A2B10G10R10_UNORM_PACK32".enum("A four-component, 32-bit packed unsigned normalized format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9."),
		"FORMAT_A2B10G10R10_SNORM_PACK32".enum("A four-component, 32-bit packed signed normalized format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9."),
		"FORMAT_A2B10G10R10_USCALED_PACK32".enum("A four-component, 32-bit packed unsigned scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9."),
		"FORMAT_A2B10G10R10_SSCALED_PACK32".enum("A four-component, 32-bit packed signed scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9."),
		"FORMAT_A2B10G10R10_UINT_PACK32".enum("A four-component, 32-bit packed unsigned integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9."),
		"FORMAT_A2B10G10R10_SINT_PACK32".enum("A four-component, 32-bit packed signed integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9."),
		"FORMAT_R16_UNORM".enum("A one-component, 16-bit unsigned normalized format that has a single 16-bit R component."),
		"FORMAT_R16_SNORM".enum("A one-component, 16-bit signed normalized format that has a single 16-bit R component."),
		"FORMAT_R16_USCALED".enum("A one-component, 16-bit unsigned scaled integer format that has a single 16-bit R component."),
		"FORMAT_R16_SSCALED".enum("A one-component, 16-bit signed scaled integer format that has a single 16-bit R component."),
		"FORMAT_R16_UINT".enum("A one-component, 16-bit unsigned integer format that has a single 16-bit R component."),
		"FORMAT_R16_SINT".enum("A one-component, 16-bit signed integer format that has a single 16-bit R component."),
		"FORMAT_R16_SFLOAT".enum("A one-component, 16-bit signed floating-point format that has a single 16-bit R component."),
		"FORMAT_R16G16_UNORM".enum("A two-component, 32-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3."),
		"FORMAT_R16G16_SNORM".enum("A two-component, 32-bit signed normalized format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3."),
		"FORMAT_R16G16_USCALED".enum("A two-component, 32-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3."),
		"FORMAT_R16G16_SSCALED".enum("A two-component, 32-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3."),
		"FORMAT_R16G16_UINT".enum("A two-component, 32-bit unsigned integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3."),
		"FORMAT_R16G16_SINT".enum("A two-component, 32-bit signed integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3."),
		"FORMAT_R16G16_SFLOAT".enum("A two-component, 32-bit signed floating-point format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3."),
		"FORMAT_R16G16B16_UNORM".enum("A three-component, 48-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5."),
		"FORMAT_R16G16B16_SNORM".enum("A three-component, 48-bit signed normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5."),
		"FORMAT_R16G16B16_USCALED".enum("A three-component, 48-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5."),
		"FORMAT_R16G16B16_SSCALED".enum("A three-component, 48-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5."),
		"FORMAT_R16G16B16_UINT".enum("A three-component, 48-bit unsigned integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5."),
		"FORMAT_R16G16B16_SINT".enum("A three-component, 48-bit signed integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5."),
		"FORMAT_R16G16B16_SFLOAT".enum("A three-component, 48-bit signed floating-point format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5."),
		"FORMAT_R16G16B16A16_UNORM".enum("A four-component, 64-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7."),
		"FORMAT_R16G16B16A16_SNORM".enum("A four-component, 64-bit signed normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7."),
		"FORMAT_R16G16B16A16_USCALED".enum("A four-component, 64-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7."),
		"FORMAT_R16G16B16A16_SSCALED".enum("A four-component, 64-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7."),
		"FORMAT_R16G16B16A16_UINT".enum("A four-component, 64-bit unsigned integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7."),
		"FORMAT_R16G16B16A16_SINT".enum("A four-component, 64-bit signed integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7."),
		"FORMAT_R16G16B16A16_SFLOAT".enum("A four-component, 64-bit signed floating-point format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7."),
		"FORMAT_R32_UINT".enum("A one-component, 32-bit unsigned integer format that has a single 32-bit R component."),
		"FORMAT_R32_SINT".enum("A one-component, 32-bit signed integer format that has a single 32-bit R component."),
		"FORMAT_R32_SFLOAT".enum("A one-component, 32-bit signed floating-point format that has a single 32-bit R component."),
		"FORMAT_R32G32_UINT".enum("A two-component, 64-bit unsigned integer format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7."),
		"FORMAT_R32G32_SINT".enum("A two-component, 64-bit signed integer format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7."),
		"FORMAT_R32G32_SFLOAT".enum("A two-component, 64-bit signed floating-point format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7."),
		"FORMAT_R32G32B32_UINT".enum("A three-component, 96-bit unsigned integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11."),
		"FORMAT_R32G32B32_SINT".enum("A three-component, 96-bit signed integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11."),
		"FORMAT_R32G32B32_SFLOAT".enum("A three-component, 96-bit signed floating-point format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11."),
		"FORMAT_R32G32B32A32_UINT".enum("A four-component, 128-bit unsigned integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15."),
		"FORMAT_R32G32B32A32_SINT".enum("A four-component, 128-bit signed integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15."),
		"FORMAT_R32G32B32A32_SFLOAT".enum("A four-component, 128-bit signed floating-point format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15."),
		"FORMAT_R64_UINT".enum("A one-component, 64-bit unsigned integer format that has a single 64-bit R component."),
		"FORMAT_R64_SINT".enum("A one-component, 64-bit signed integer format that has a single 64-bit R component."),
		"FORMAT_R64_SFLOAT".enum("A one-component, 64-bit signed floating-point format that has a single 64-bit R component."),
		"FORMAT_R64G64_UINT".enum("A two-component, 128-bit unsigned integer format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15."),
		"FORMAT_R64G64_SINT".enum("A two-component, 128-bit signed integer format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15."),
		"FORMAT_R64G64_SFLOAT".enum("A two-component, 128-bit signed floating-point format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15."),
		"FORMAT_R64G64B64_UINT".enum("A three-component, 192-bit unsigned integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23."),
		"FORMAT_R64G64B64_SINT".enum("A three-component, 192-bit signed integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23."),
		"FORMAT_R64G64B64_SFLOAT".enum("A three-component, 192-bit signed floating-point format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23."),
		"FORMAT_R64G64B64A64_UINT".enum("A four-component, 256-bit unsigned integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31."),
		"FORMAT_R64G64B64A64_SINT".enum("A four-component, 256-bit signed integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31."),
		"FORMAT_R64G64B64A64_SFLOAT".enum("A four-component, 256-bit signed floating-point format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31."),
		"FORMAT_B10G11R11_UFLOAT_PACK32".enum("A three-component, 32-bit packed unsigned floating-point format that has a 10-bit B component in bits 22..31, an 11-bit G component in bits 11..21, an 11-bit R component in bits 0..10."),
		"FORMAT_E5B9G9R9_UFLOAT_PACK32".enum("A three-component, 32-bit packed unsigned floating-point format that has a 5-bit shared exponent in bits 27..31, a 9-bit B component mantissa in bits 18..26, a 9-bit G component mantissa in bits 9..17, and a 9-bit R component mantissa in bits 0..8."),
		"FORMAT_D16_UNORM".enum("A one-component, 16-bit unsigned normalized format that has a single 16-bit depth component."),
		"FORMAT_X8_D24_UNORM_PACK32".enum("A two-component, 32-bit format that has 24 unsigned normalized bits in the depth component and, optionally:, 8 bits that are unused."),
		"FORMAT_D32_SFLOAT".enum("A one-component, 32-bit signed floating-point format that has 32-bits in the depth component."),
		"FORMAT_S8_UINT".enum("A one-component, 8-bit unsigned integer format that has 8-bits in the stencil component."),
		"FORMAT_D16_UNORM_S8_UINT".enum("A two-component, 24-bit format that has 16 unsigned normalized bits in the depth component and 8 unsigned integer bits in the stencil component."),
		"FORMAT_D24_UNORM_S8_UINT".enum("A two-component, 32-bit packed format that has 8 unsigned integer bits in the stencil component, and 24 unsigned normalized bits in the depth component."),
		"FORMAT_D32_SFLOAT_S8_UINT".enum("A two-component format that has 32 signed float bits in the depth component and 8 unsigned integer bits in the stencil component. There are optionally: 24-bits that are unused."),
		"FORMAT_BC1_RGB_UNORM_BLOCK".enum("A three-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data. This format has no alpha and is considered opaque."),
		"FORMAT_BC1_RGB_SRGB_BLOCK".enum("A three-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding. This format has no alpha and is considered opaque."),
		"FORMAT_BC1_RGBA_UNORM_BLOCK".enum("A four-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data, and provides 1 bit of alpha."),
		"FORMAT_BC1_RGBA_SRGB_BLOCK".enum("A four-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding, and provides 1 bit of alpha."),
		"FORMAT_BC2_UNORM_BLOCK".enum("A four-component, block compressed format where each 4x4 block consists of 64-bits of unsigned normalized alpha image data followed by 64-bits of encoded unsigned normalized RGB image data."),
		"FORMAT_BC2_SRGB_BLOCK".enum("A four-component, block compressed format where each 4x4 block consists of 64-bits of unsigned normalized alpha image data followed by 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding."),
		"FORMAT_BC3_UNORM_BLOCK".enum("A four-component, block compressed format where each 4x4 block consists of 64-bits of encoded alpha image data followed by 64-bits of encoded RGB image data. Both blocks are decoded as unsigned normalized values."),
		"FORMAT_BC3_SRGB_BLOCK".enum("A four-component, block compressed format where each 4x4 block consists of 64-bits of encoded alpha image data followed by 64-bits of encoded RGB image data with sRGB nonlinear encoding. Both blocks are decoded as unsigned normalized values."),
		"FORMAT_BC4_UNORM_BLOCK".enum("A one-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized red image data."),
		"FORMAT_BC4_SNORM_BLOCK".enum("A one-component, block compressed format where each 4x4 block consists of 64-bits of encoded signed normalized red image data."),
		"FORMAT_BC5_UNORM_BLOCK".enum("A two-component, block compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized red image data followed by 64-bits of encoded unsigned normalized green image data."),
		"FORMAT_BC5_SNORM_BLOCK".enum("A two-component, block compressed format where each 4x4 block consists of 64-bits of encoded signed normalized red image data followed by 64-bits of encoded signed normalized green image data."),
		"FORMAT_BC6H_UFLOAT_BLOCK".enum("A three-component, block compressed format where each 4x4 block consists of 128-bits of encoded unsigned floating-point RGB image data."),
		"FORMAT_BC6H_SFLOAT_BLOCK".enum("A three-component, block compressed format where each 4x4 block consists of 128-bits of encoded signed floating-point RGB image data."),
		"FORMAT_BC7_UNORM_BLOCK".enum("A four-component, block compressed format where each 4x4 block consists of 128-bits of encoded unsigned normalized RGBA image data."),
		"FORMAT_BC7_SRGB_BLOCK".enum("A four-component, block compressed format where each 4x4 block consists of 128-bits of encoded unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ETC2_R8G8B8_UNORM_BLOCK".enum("A three-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data."),
		"FORMAT_ETC2_R8G8B8_SRGB_BLOCK".enum("A three-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding."),
		"FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK".enum("A four-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data, and provides 1 bit of alpha."),
		"FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK".enum("A four-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding, and provides 1 bit of alpha."),
		"FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK".enum("A four-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data, and 64-bits of encoded unsigned normalized alpha image data."),
		"FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK".enum("A four-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized RGB image data with sRGB nonlinear encoding, and 64-bits of encoded unsigned normalized alpha image data."),
		"FORMAT_EAC_R11_UNORM_BLOCK".enum("A one-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized red image data."),
		"FORMAT_EAC_R11_SNORM_BLOCK".enum("A one-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded signed normalized red image data."),
		"FORMAT_EAC_R11G11_UNORM_BLOCK".enum("A two-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded unsigned normalized red image data followed by 64-bits of encoded unsigned normalized green image data."),
		"FORMAT_EAC_R11G11_SNORM_BLOCK".enum("A two-component, ETC2 compressed format where each 4x4 block consists of 64-bits of encoded signed normalized red image data followed by 64-bits of encoded signed normalized green image data."),
		"FORMAT_ASTC_4x4_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 4x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_4x4_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 4x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_5x4_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 5x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_5x4_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 5x4 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_5x5_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 5x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_5x5_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 5x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_6x5_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 6x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_6x5_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 6x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_6x6_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 6x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_6x6_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 6x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_8x5_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 8x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_8x5_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 8x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_8x6_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 8x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_8x6_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 8x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_8x8_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 8x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_8x8_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 8x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_10x5_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 10x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_10x5_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 10x5 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_10x6_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 10x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_10x6_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 10x6 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_10x8_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 10x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_10x8_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 10x8 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_10x10_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 10x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_10x10_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 10x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_12x10_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 12x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_12x10_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 12x10 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_ASTC_12x12_UNORM_BLOCK".enum("A four-component, ASTC compressed format where each 12x12 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data."),
		"FORMAT_ASTC_12x12_SRGB_BLOCK".enum("A four-component, ASTC compressed format where each 12x12 block consists of 128-bits of encoded image data which is decoded as unsigned normalized RGBA image data with sRGB nonlinear encoding."),
		"FORMAT_BEGIN_RANGE".enumExpr("", "VK_FORMAT_UNDEFINED"),
		"FORMAT_END_RANGE".enumExpr("", "VK_FORMAT_ASTC_12x12_SRGB_BLOCK"),
		"FORMAT_RANGE_SIZE".enumExpr("", "VK_FORMAT_ASTC_12x12_SRGB_BLOCK - VK_FORMAT_UNDEFINED + 1"),
		"FORMAT_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	val VkImageTypes = EnumConstant(
		"VkImageType",

		"IMAGE_TYPE_1D".enumExpr("One-dimensional image", "0"),
		"IMAGE_TYPE_2D".enum("Two-dimensional image"),
		"IMAGE_TYPE_3D".enum("Three-dimensional image"),
		"IMAGE_TYPE_BEGIN_RANGE".enumExpr("", "VK_IMAGE_TYPE_1D"),
		"IMAGE_TYPE_END_RANGE".enumExpr("", "VK_IMAGE_TYPE_3D"),
		"IMAGE_TYPE_RANGE_SIZE".enumExpr("", "VK_IMAGE_TYPE_3D - VK_IMAGE_TYPE_1D + 1"),
		"IMAGE_TYPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	).enumLinks

	val VkImageTilings = EnumConstant(
		"VkImageTiling",

		"IMAGE_TILING_OPTIMAL".enumExpr("Specifies optimal tiling (texels are laid out in an implementation-dependent arrangement, for more optimal memory access).", "0"),
		"IMAGE_TILING_LINEAR".enum("Specifies linear tiling (texels are laid out in memory in row-major order, possibly with some padding on each row)."),
		"IMAGE_TILING_BEGIN_RANGE".enumExpr("", "VK_IMAGE_TILING_OPTIMAL"),
		"IMAGE_TILING_END_RANGE".enumExpr("", "VK_IMAGE_TILING_LINEAR"),
		"IMAGE_TILING_RANGE_SIZE".enumExpr("", "VK_IMAGE_TILING_LINEAR - VK_IMAGE_TILING_OPTIMAL + 1"),
		"IMAGE_TILING_MAX_ENUM".enum("", 0x7FFFFFFF)
	).enumLinks

	EnumConstant(
		"VkPhysicalDeviceType",

		"PHYSICAL_DEVICE_TYPE_OTHER".enumExpr("The device does not match any other available types.", "0"),
		"PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU".enum("The device is typically one embedded in or tightly coupled with the host."),
		"PHYSICAL_DEVICE_TYPE_DISCRETE_GPU".enum("The device is typically a separate processor connected to the host via an interlink."),
		"PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU".enum("The device is typically a virtual node in a virtualization environment."),
		"PHYSICAL_DEVICE_TYPE_CPU".enum("The device is typically running on the same processors as the host."),
		"PHYSICAL_DEVICE_TYPE_BEGIN_RANGE".enumExpr("", "VK_PHYSICAL_DEVICE_TYPE_OTHER"),
		"PHYSICAL_DEVICE_TYPE_END_RANGE".enumExpr("", "VK_PHYSICAL_DEVICE_TYPE_CPU"),
		"PHYSICAL_DEVICE_TYPE_RANGE_SIZE".enumExpr("", "VK_PHYSICAL_DEVICE_TYPE_CPU - VK_PHYSICAL_DEVICE_TYPE_OTHER + 1"),
		"PHYSICAL_DEVICE_TYPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkQueryType",

		"QUERY_TYPE_OCCLUSION".enumExpr("Occlusion query.", "0"),
		"QUERY_TYPE_PIPELINE_STATISTICS".enum("Pipeline statistics query"),
		"QUERY_TYPE_TIMESTAMP".enum("Timestamp query."),
		"QUERY_TYPE_BEGIN_RANGE".enumExpr("", "VK_QUERY_TYPE_OCCLUSION"),
		"QUERY_TYPE_END_RANGE".enumExpr("", "VK_QUERY_TYPE_TIMESTAMP"),
		"QUERY_TYPE_RANGE_SIZE".enumExpr("", "VK_QUERY_TYPE_TIMESTAMP - VK_QUERY_TYPE_OCCLUSION + 1"),
		"QUERY_TYPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkSharingMode",

		"SHARING_MODE_EXCLUSIVE".enumExpr("Specifies that access to any range or subresource of the object will be exclusive to a single queue family at a time.", "0"),
		"SHARING_MODE_CONCURRENT".enum("Specifies that concurrent access to any range or subresource of the object from multiple queue families is supported."),
		"SHARING_MODE_BEGIN_RANGE".enumExpr("", "VK_SHARING_MODE_EXCLUSIVE"),
		"SHARING_MODE_END_RANGE".enumExpr("", "VK_SHARING_MODE_CONCURRENT"),
		"SHARING_MODE_RANGE_SIZE".enumExpr("", "VK_SHARING_MODE_CONCURRENT - VK_SHARING_MODE_EXCLUSIVE + 1"),
		"SHARING_MODE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkImageLayout",

		"IMAGE_LAYOUT_UNDEFINED".enumExpr(
			"""
			Supports no device access. This layout $must only be used as an {@code initialLayout} or as the {@code oldLayout} in an image transition. When
			transitioning out of this layout, the contents of the memory are not guaranteed to be preserved.
			""", "0"),
		"IMAGE_LAYOUT_GENERAL".enum("Supports all types of device access."),
		"IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL".enum(
			"""
			$must only be used as a color or resolve attachment in a {@code VkFramebuffer}. This layout is valid only for subresources of images created with
			the #IMAGE_USAGE_COLOR_ATTACHMENT_BIT usage bit enabled.
			"""),
		"IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL".enum(
			"""
			$must only be used as a depth/stencil attachment in a {@code VkFramebuffer}. This layout is valid only for subresources of images created with the
			#IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT usage bit enabled.
			"""),
		"IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL".enum(
			"""
			$must only be used as a read-only depth/stencil attachment in a {@code VkFramebuffer} and/or as a read-only image in a shader (which $can be read as
			a sampled image, combined image/sampler and/or input attachment). This layout is valid only for subresources of images created with both the
			#IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT usage bit enabled.
			"""
		),
		"IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL".enum(
			"""
			$must only be used as a read-only image in a shader (which $can be read as a sampled image, combined image/sampler and/or input attachment). This
			layout is valid only for subresources of images created with the #IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT usage bit enabled.
			"""
		),
		"IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL".enum(
			"""
			$must only be used as a source image of a transfer command (see the definition of #PIPELINE_STAGE_TRANSFER_BIT). This layout is valid only for
			subresources of images created with the #IMAGE_USAGE_TRANSFER_SRC_BIT usage bit enabled.
			"""
		),
		"IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL".enum(
			"""
			$must only be used as a destination image of a transfer command. This layout is valid only for subresources of images created with the
			#IMAGE_USAGE_TRANSFER_DST_BIT usage bit enabled.
			"""
		),
		"IMAGE_LAYOUT_PREINITIALIZED".enum(
			"""
			Supports no device access. This layout $must only be used as an {@code initialLayout} or as the {@code oldLayout} in an image transition. When
			transitioning out of this layout, the contents of the memory are preserved. This layout is intended to be used as the initial layout for an image
			whose contents are written by the host, and hence the data $can be written to memory immediately, without first executing a layout transition.
			Currently, #IMAGE_LAYOUT_PREINITIALIZED is only useful with #IMAGE_TILING_LINEAR images because there is not a standard layout defined for
			#IMAGE_TILING_OPTIMAL images.
			"""
		),
		"IMAGE_LAYOUT_BEGIN_RANGE".enumExpr("", "VK_IMAGE_LAYOUT_UNDEFINED"),
		"IMAGE_LAYOUT_END_RANGE".enumExpr("", "VK_IMAGE_LAYOUT_PREINITIALIZED"),
		"IMAGE_LAYOUT_RANGE_SIZE".enumExpr("", "VK_IMAGE_LAYOUT_PREINITIALIZED - VK_IMAGE_LAYOUT_UNDEFINED + 1"),
		"IMAGE_LAYOUT_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkImageViewType",

		"IMAGE_VIEW_TYPE_1D".enumExpr("One-dimensional image view.", "0"),
		"IMAGE_VIEW_TYPE_2D".enum("Two-dimensional image view."),
		"IMAGE_VIEW_TYPE_3D".enum("Three-dimensional image view."),
		"IMAGE_VIEW_TYPE_CUBE".enum("Cube map image view."),
		"IMAGE_VIEW_TYPE_1D_ARRAY".enum("One-dimensional array image view."),
		"IMAGE_VIEW_TYPE_2D_ARRAY".enum("Two-dimensional array image view."),
		"IMAGE_VIEW_TYPE_CUBE_ARRAY".enum("Cube map array image view."),
		"IMAGE_VIEW_TYPE_BEGIN_RANGE".enumExpr("", "VK_IMAGE_VIEW_TYPE_1D"),
		"IMAGE_VIEW_TYPE_END_RANGE".enumExpr("", "VK_IMAGE_VIEW_TYPE_CUBE_ARRAY"),
		"IMAGE_VIEW_TYPE_RANGE_SIZE".enumExpr("", "VK_IMAGE_VIEW_TYPE_CUBE_ARRAY - VK_IMAGE_VIEW_TYPE_1D + 1"),
		"IMAGE_VIEW_TYPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkComponentSwizzle",

		"COMPONENT_SWIZZLE_IDENTITY".enumExpr("The component is set to the identity swizzle.", "0"),
		"COMPONENT_SWIZZLE_ZERO".enum("The component is set to zero."),
		"COMPONENT_SWIZZLE_ONE".enum(
			"""
			The component is set to either 1 or 1.0 depending on whether the type of the image view format is integer or floating-point respectively, as
			determined by the <b>Format Definition</b> section for each {@code VkFormat}.
			"""),
		"COMPONENT_SWIZZLE_R".enum("The component is set to the value of the R component of the image."),
		"COMPONENT_SWIZZLE_G".enum("The component is set to the value of the G component of the image."),
		"COMPONENT_SWIZZLE_B".enum("The component is set to the value of the B component of the image."),
		"COMPONENT_SWIZZLE_A".enum("The component is set to the value of the A component of the image."),
		"COMPONENT_SWIZZLE_BEGIN_RANGE".enumExpr("", "VK_COMPONENT_SWIZZLE_IDENTITY"),
		"COMPONENT_SWIZZLE_END_RANGE".enumExpr("", "VK_COMPONENT_SWIZZLE_A"),
		"COMPONENT_SWIZZLE_RANGE_SIZE".enumExpr("", "VK_COMPONENT_SWIZZLE_A - VK_COMPONENT_SWIZZLE_IDENTITY + 1"),
		"COMPONENT_SWIZZLE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkVertexInputRate",

		"VERTEX_INPUT_RATE_VERTEX".enumExpr("Indicates that vertex attribute addressing is a function of the vertex index.", "0"),
		"VERTEX_INPUT_RATE_INSTANCE".enum("Indicates that vertex attribute addressing is a function of the instance index."),
		"VERTEX_INPUT_RATE_BEGIN_RANGE".enumExpr("", "VK_VERTEX_INPUT_RATE_VERTEX"),
		"VERTEX_INPUT_RATE_END_RANGE".enumExpr("", "VK_VERTEX_INPUT_RATE_INSTANCE"),
		"VERTEX_INPUT_RATE_RANGE_SIZE".enumExpr("", "VK_VERTEX_INPUT_RATE_INSTANCE - VK_VERTEX_INPUT_RATE_VERTEX + 1"),
		"VERTEX_INPUT_RATE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkPrimitiveTopology",

		"PRIMITIVE_TOPOLOGY_POINT_LIST".enumExpr("A series of individual points. Each vertex defines a separate point.", "0"),
		"PRIMITIVE_TOPOLOGY_LINE_LIST".enum(
			"""
			Individual line segments, each defined by a pair of vertices. The first two vertices define the first segment, with subsequent pairs of vertices
			each defining one more segment. If the number of vertices is odd, then the last vertex is ignored.
			"""),
		"PRIMITIVE_TOPOLOGY_LINE_STRIP".enum(
			"""
			A series of one or more connected line segments. In this case, the first vertex specifies the first segment’s start point while the second vertex
			specifies the first segment’s endpoint and the second segment’s start point. In general, the i<sup>th</sup> vertex (for i &gt; 0) specifies the
			beginning of the i<sup>th</sup> segment and the end of the {@code i−1}<sup>st</sup>. The last vertex specifies the end of the last segment. If only
			one vertex is specified, then no primitive is generated.
			"""
		),
		"PRIMITIVE_TOPOLOGY_TRIANGLE_LIST".enum(
			"""
			Separate triangles. In this case, vertices {@code 3i}, {@code 3i + 1}, and {@code 3i + 2} (in that order) determine a triangle for each
			{@code i = 0,1,…,n − 1}, where there are {@code 3n + k} vertices drawn. {@code k} is either 0, 1, or 2; if {@code k} is not zero, the final
			{@code k} vertices are ignored.
			"""
		),
		"PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP".enum(
			"""
			A triangle strip is a series of triangles connected along shared edges. In this case, the first three vertices define the first triangle, and their
			order is significant. Each subsequent vertex defines a new triangle using that point along with the last two vertices from the previous triangle.
			If fewer than three vertices are specified, no primitive is produced. The order of vertices in successive triangles changes, so that all triangle
			faces have the same orientation.
			"""
		),
		"PRIMITIVE_TOPOLOGY_TRIANGLE_FAN".enum(
			"""
			A triangle fan. It is similar to a triangle strip, but changes the vertex replaced from the previous triangle, so that all triangles in the fan
			share a common vertex.
			"""
		),
		"PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY".enum(
			"""
			Lines with adjacency are independent line segments where each endpoint has a corresponding adjacent vertex that is accessible in a geometry shader.
			If a geometry shader is not active, the adjacent vertices are ignored.

			A line segment is drawn from the {@code 4i + 1}<sup>st</sup> vertex to the {@code 4i + 2}<sup>nd</sup> vertex for each {@code i = 0,1,…,n − 1},
			where there are {@code 4n + k} vertices. {@code k} is either 0, 1, 2, or 3; if {@code k} is not zero, the final {@code k} vertices are ignored. For
			line segment {@code i}, the {@code 4i}<sup>th</sup> and {@code 4i + 3}<sup>rd</sup> vertices are considered adjacent to the
			{@code 4i + 1}<sup>st</sup> and {@code 4i + 2}<sup>nd</sup> vertices, respectively.
			"""
		),
		"PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY".enum(
			"""
			Line strips with adjacency are similar to line strips, except that each line segment has a pair of adjacent vertices that are accessible in a
			geometry shader. If a geometry shader is not active, the adjacent vertices are ignored.

			A line segment is drawn from the {@code i + 1}<sup>st</sup> vertex to the {@code i + 2}<sup>nd</sup> vertex for each {@code i = 0,1,…,n − 1}, where
			there are {@code n + 3} vertices. If there are fewer than four vertices, all vertices are ignored. For line segment {@code i}, the
			{@code i}<sup>th</sup> and {@code i + 3}<sup>rd</sup> vertex are considered adjacent to the {@code i + 1}<sup>st</sup> and
			{@code i + 2}<sup>nd</sup> vertices, respectively.
			"""
		),
		"PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY".enum(
			"""
			Triangles with adjacency are similar to separate triangles except that each triangle edge has an adjacent vertex that is accessible in a geometry
			shader. If a geometry shader is not active, the adjacent vertices are ignored.

			The {@code 6i}<sup>th</sup>, {@code 6i + 2}<sup>nd</sup>, and {@code 6i + 4}<sup>th</sup> vertices (in that order) determine a triangle for each
			{@code i = 0,1,…,n − 1}, where there are {@code 6n + k} vertices. {@code k} is either 0, 1, 2, 3, 4, or 5; if {@code k} is non-zero, the final
			{@code k} vertices are ignored. For triangle {@code i}, the {@code 6i + 1}<sup>st</sup>, {@code 6i + 3}<sup>rd</sup>, and
			{@code 6i + 5}<sup>th</sup> vertices are considered adjacent to edges from the {@code 6i}<sup>th</sup> to the {@code 6i + 2}<sup>nd</sup>, from the
			{@code 6i + 2}<sup>nd</sup> to the {@code 6i + 4}<sup>th</sup>, and from the {@code 6i + 4}<sup>th</sup> to the {@code 6i}<sup>th</sup> vertices,
			respectively.
			"""
		),
		"PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY".enum(
			"""
			Triangle strips with adjacency are similar to triangle strips except that each triangle edge has an adjacent vertex that is accessible in a
			geometry shader. If a geometry shader is not active, the adjacent vertices are ignored.

			In triangle strips with adjacency, {@code n} triangles are drawn where there are {@code 2(n + 2) + k} vertices. {@code k} is either 0 or 1; if
			{@code k} is 1, the final vertex is ignored. If there are fewer than 6 vertices, the entire primitive is ignored. The table below describes the
			vertices and order used to draw each triangle, and which vertices are considered adjacent to each edge of the triangle:
			${table(
				tr(
					th(),
					th("Primitive Vertices", colspan = 3),
					th("Adjacent Vertices", colspan = 3)
				),
				tr(td("Primitive"), td("1<sup>st</sup>"), td("2<sup>nd</sup>"), td("3<sup>rd</sup>"), td("1/2"), td("2/3"), td("3/1")),
				tr(td("only ( {@code i = 0} , {@code n = 1} )"), td("0"), td("2"), td("4"), td("1"), td("5"), td("3")),
				tr(td("first ( {@code i = 0} )"), td("0"), td("2"), td("4"), td("1"), td("6"), td("3")),
				tr(td("middle ( {@code i} odd)"), td("2i+2"), td("2i"), td("2i+4"), td("2i−2"), td("2i+3"), td("2i+6")),
				tr(td("middle ( {@code i} even)"), td("2i"), td("2i+2"), td("2i+4"), td("2i−2"), td("2i+6"), td("2i+3")),
				tr(td("last ( {@code i = n − 1} , {@code i} odd)"), td("2i+2"), td("2i"), td("2i+4"), td("2i−2"), td("2i+3"), td("2i+5")),
				tr(td("last ( {@code i = n − 1} , {@code i} even)"), td("2i"), td("2i+2"), td("2i+4"), td("2i−2"), td("2i+5"), td("2i+3"))
			)}
			"""
		),
		"PRIMITIVE_TOPOLOGY_PATCH_LIST".enum(
			"""
			Separate patches. A patch is an ordered collection of vertices used for primitive tessellation. The vertices comprising a patch have no implied
			geometric ordering, and are used by tessellation shaders and the fixed-function tessellator to generate new point, line, or triangle primitives.

			Each patch in the series has a fixed number of vertices, specified by the {@code patchControlPoints} member of the
			##VkPipelineTessellationStateCreateInfo structure passed to #CreateGraphicsPipelines(). Once assembled and vertex shaded, these patches are
			provided as input to the tessellation control shader stage.

			If the number of vertices in a patch is given by {@code v}, the {@code vi}<sup>th</sup> through {@code vi + v − 1}<sup>st</sup> vertices (in that
			order) determine a patch for each {@code i = 0,1,…n − 1}, where there are {@code vn + k} vertices. {@code k} is in the range {@code [0,v − 1]} ; if
			{@code k} is not zero, the final {@code k} vertices are ignored.
			"""
		),
		"PRIMITIVE_TOPOLOGY_BEGIN_RANGE".enumExpr("", "VK_PRIMITIVE_TOPOLOGY_POINT_LIST"),
		"PRIMITIVE_TOPOLOGY_END_RANGE".enumExpr("", "VK_PRIMITIVE_TOPOLOGY_PATCH_LIST"),
		"PRIMITIVE_TOPOLOGY_RANGE_SIZE".enumExpr("", "VK_PRIMITIVE_TOPOLOGY_PATCH_LIST - VK_PRIMITIVE_TOPOLOGY_POINT_LIST + 1"),
		"PRIMITIVE_TOPOLOGY_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkPolygonMode",

		"POLYGON_MODE_FILL".enumExpr("Causes polygons to render using the polygon rasterization rules.", "0"),
		"POLYGON_MODE_LINE".enum("Causes polygon edges to be drawn as line segments."),
		"POLYGON_MODE_POINT".enum("The vertices of polygons are treated, for rasterization purposes, as if they had been drawn as points."),
		"POLYGON_MODE_BEGIN_RANGE".enumExpr("", "VK_POLYGON_MODE_FILL"),
		"POLYGON_MODE_END_RANGE".enumExpr("", "VK_POLYGON_MODE_POINT"),
		"POLYGON_MODE_RANGE_SIZE".enumExpr("", "VK_POLYGON_MODE_POINT - VK_POLYGON_MODE_FILL + 1"),
		"POLYGON_MODE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkFrontFace",

		"FRONT_FACE_COUNTER_CLOCKWISE".enumExpr("A triangle with positive area is considered front-facing.", "0"),
		"FRONT_FACE_CLOCKWISE".enum("A triangle with negative area is considered front-facing."),
		"FRONT_FACE_BEGIN_RANGE".enumExpr("", "VK_FRONT_FACE_COUNTER_CLOCKWISE"),
		"FRONT_FACE_END_RANGE".enumExpr("", "VK_FRONT_FACE_CLOCKWISE"),
		"FRONT_FACE_RANGE_SIZE".enumExpr("", "VK_FRONT_FACE_CLOCKWISE - VK_FRONT_FACE_COUNTER_CLOCKWISE + 1"),
		"FRONT_FACE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkCompareOp",

		"COMPARE_OP_NEVER".enumExpr("The test never passes.", "0"),
		"COMPARE_OP_LESS".enum("The test passes when <b>R</b> &lt; <b>S</b>."),
		"COMPARE_OP_EQUAL".enum("The test passes when R = S}"),
		"COMPARE_OP_LESS_OR_EQUAL".enum("The test passes when <b>R</b> &le; <b>S</b>."),
		"COMPARE_OP_GREATER".enum("The test passes when <b>R</b> &gt; <b>S</b>."),
		"COMPARE_OP_NOT_EQUAL".enum("The test passes when <b>R</b> &ne; <b>S</b>."),
		"COMPARE_OP_GREATER_OR_EQUAL".enum("The test passes when <b>R</b> &ge; <b>S</b>."),
		"COMPARE_OP_ALWAYS".enum("The test always passes."),
		"COMPARE_OP_BEGIN_RANGE".enumExpr("", "VK_COMPARE_OP_NEVER"),
		"COMPARE_OP_END_RANGE".enumExpr("", "VK_COMPARE_OP_ALWAYS"),
		"COMPARE_OP_RANGE_SIZE".enumExpr("", "VK_COMPARE_OP_ALWAYS - VK_COMPARE_OP_NEVER + 1"),
		"COMPARE_OP_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkStencilOp",

		"STENCIL_OP_KEEP".enumExpr("Keeps the current value.", "0"),
		"STENCIL_OP_ZERO".enum("Sets the value to 0."),
		"STENCIL_OP_REPLACE".enum("Sets the value to {@code reference}."),
		"STENCIL_OP_INCREMENT_AND_CLAMP".enum("Increments the current value and clamps to the maximum representable unsigned value."),
		"STENCIL_OP_DECREMENT_AND_CLAMP".enum("Decrements the current value and clamps to 0."),
		"STENCIL_OP_INVERT".enum("Bitwise-inverts the current value."),
		"STENCIL_OP_INCREMENT_AND_WRAP".enum("Increments the current value and wraps to 0 when the maximum value would have been exceeded."),
		"STENCIL_OP_DECREMENT_AND_WRAP".enum("Decrements the current value and wraps to the maximum possible value when the value would go below 0."),
		"STENCIL_OP_BEGIN_RANGE".enumExpr("", "VK_STENCIL_OP_KEEP"),
		"STENCIL_OP_END_RANGE".enumExpr("", "VK_STENCIL_OP_DECREMENT_AND_WRAP"),
		"STENCIL_OP_RANGE_SIZE".enumExpr("", "VK_STENCIL_OP_DECREMENT_AND_WRAP - VK_STENCIL_OP_KEEP + 1"),
		"STENCIL_OP_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkLogicOp",

		"LOGIC_OP_CLEAR".enumExpr("{@code 0}", "0"),
		"LOGIC_OP_AND".enum("{@code s∧d}"),
		"LOGIC_OP_AND_REVERSE".enum("{@code s∧¬d}"),
		"LOGIC_OP_COPY".enum("{@code s}"),
		"LOGIC_OP_AND_INVERTED".enum("{@code ¬s∧d}"),
		"LOGIC_OP_NO_OP".enum("{@code d}"),
		"LOGIC_OP_XOR".enum("{@code s⊕d}"),
		"LOGIC_OP_OR".enum("{@code s∨d}"),
		"LOGIC_OP_NOR".enum("{@code ¬(s∨d)}"),
		"LOGIC_OP_EQUIVALENT".enum("{@code ¬(s⊕d)}"),
		"LOGIC_OP_INVERT".enum("{@code ¬d}"),
		"LOGIC_OP_OR_REVERSE".enum("{@code s∨¬d}"),
		"LOGIC_OP_COPY_INVERTED".enum("{@code ¬s}"),
		"LOGIC_OP_OR_INVERTED".enum("{@code ¬s∨d}"),
		"LOGIC_OP_NAND".enum("{@code ¬(s∧d)}"),
		"LOGIC_OP_SET".enum("{@code all 1s}"),
		"LOGIC_OP_BEGIN_RANGE".enumExpr("", "VK_LOGIC_OP_CLEAR"),
		"LOGIC_OP_END_RANGE".enumExpr("", "VK_LOGIC_OP_SET"),
		"LOGIC_OP_RANGE_SIZE".enumExpr("", "VK_LOGIC_OP_SET - VK_LOGIC_OP_CLEAR + 1"),
		"LOGIC_OP_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkBlendFactor",

		"BLEND_FACTOR_ZERO".enum(code("(0, 0, 0, 0)")),
		"BLEND_FACTOR_ONE".enum(code("(1, 1, 1, 1)")),
		"BLEND_FACTOR_SRC_COLOR".enum(code("(R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub>, A<sub>s0</sub>)")),
		"BLEND_FACTOR_ONE_MINUS_SRC_COLOR".enum(code("(1 − R<sub>s0</sub>, 1 − G<sub>s0</sub>, 1 − B<sub>s0</sub>, 1 − A<sub>s0</sub>)")),
		"BLEND_FACTOR_DST_COLOR".enum(code("(R<sub>d</sub>, G<sub>d</sub>, B<sub>d</sub>, A<sub>d</sub>)")),
		"BLEND_FACTOR_ONE_MINUS_DST_COLOR".enum(code("(1 − R<sub>d</sub>, 1 − G<sub>d</sub>, 1 − B<sub>d</sub>, 1 − A<sub>d</sub>)")),
		"BLEND_FACTOR_SRC_ALPHA".enum(code("(A<sub>s0</sub>, A<sub>s0</sub>, A<sub>s0</sub>, A<sub>s0</sub>)")),
		"BLEND_FACTOR_ONE_MINUS_SRC_ALPHA".enum(code("(1 − A<sub>s0</sub>, 1 − A<sub>s0</sub>, 1 − A<sub>s0</sub>, 1 − A<sub>s0</sub>)")),
		"BLEND_FACTOR_DST_ALPHA".enum(code("(A<sub>d</sub>, A<sub>d</sub>, A<sub>d</sub>, A<sub>d</sub>)")),
		"BLEND_FACTOR_ONE_MINUS_DST_ALPHA".enum(code("(1 − A<sub>d</sub>, 1 − A<sub>d</sub>, 1 − A<sub>d</sub>, 1 − A<sub>d</sub>)")),
		"BLEND_FACTOR_CONSTANT_COLOR".enum(code("(R<sub>c</sub>, G<sub>c</sub>, B<sub>c</sub>, A<sub>c</sub>)")),
		"BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR".enum(code("(1 − R<sub>c</sub>, 1 − G<sub>c</sub>, 1 − B<sub>c</sub>, 1 − A<sub>c</sub>)")),
		"BLEND_FACTOR_CONSTANT_ALPHA".enum(code("(A<sub>c</sub>, A<sub>c</sub>, A<sub>c</sub>, A<sub>c</sub>)")),
		"BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA".enum(code("(1 − A<sub>c</sub>, 1 − A<sub>c</sub>, 1 − A<sub>c</sub>, 1 − A<sub>c</sub>)")),
		"BLEND_FACTOR_SRC_ALPHA_SATURATE".enum(code("(f, f, f, 1) ; f = min(A<sub>s0</sub>, 1 − A<sub>d</sub>)")),
		"BLEND_FACTOR_SRC1_COLOR".enum(code("(R<sub>s1</sub>, G<sub>s1</sub>, B<sub>s1</sub>, A<sub>s1</sub>)")),
		"BLEND_FACTOR_ONE_MINUS_SRC1_COLOR".enum(code("(1 − R<sub>s1</sub>, 1 − G<sub>s1</sub>, 1 − B<sub>s1</sub>, 1 − A<sub>s1</sub>)")),
		"BLEND_FACTOR_SRC1_ALPHA".enum(code("(A<sub>s1</sub>, A<sub>s1</sub>, A<sub>s1</sub>, A<sub>s1</sub>)")),
		"BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA".enum(code("(1 − A<sub>s1</sub>, 1 − A<sub>s1</sub>, 1 − A<sub>s1</sub>, 1 − A<sub>s1</sub>)")),
		"BLEND_FACTOR_BEGIN_RANGE".enumExpr("", "VK_BLEND_FACTOR_ZERO"),
		"BLEND_FACTOR_END_RANGE".enumExpr("", "VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA"),
		"BLEND_FACTOR_RANGE_SIZE".enumExpr("", "VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA - VK_BLEND_FACTOR_ZERO + 1"),
		"BLEND_FACTOR_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkBlendOp",

		"BLEND_OP_ADD".enumExpr(codeBlock(
			"""R = R<sub>s0</sub> × S<sub>r</sub> + R<sub>d</sub> × D<sub>r</sub>
G = G<sub>s0</sub> × S<sub>g</sub> + G<sub>d</sub> × D<sub>g</sub>
B = B<sub>s0</sub> × S<sub>b</sub> + B<sub>d</sub> × D<sub>b</sub>
A = A<sub>s0</sub> × S<sub>a</sub> + A<sub>d</sub> × D<sub>a</sub>"""),
			"0"),
		"BLEND_OP_SUBTRACT".enum(codeBlock(
			"""R = R<sub>s0</sub> × S<sub>r</sub> − R<sub>d</sub> × D<sub>r</sub>
G = G<sub>s0</sub> × S<sub>g</sub> − G<sub>d</sub> × D<sub>g</sub>
B = B<sub>s0</sub> × S<sub>b</sub> − B<sub>d</sub> × D<sub>b</sub>
A = A<sub>s0</sub> × S<sub>a</sub> − A<sub>d</sub> × D<sub>a</sub>""")),
		"BLEND_OP_REVERSE_SUBTRACT".enum(codeBlock(
			"""R = R<sub>d</sub> × D<sub>r</sub> − R<sub>s0</sub> × S<sub>r</sub>
G = G<sub>d</sub> × D<sub>g</sub> − G<sub>s0</sub> × S<sub>g</sub>
B = B<sub>d</sub> × D<sub>b</sub> − B<sub>s0</sub> × S<sub>b</sub>
A = A<sub>d</sub> × D<sub>a</sub> − A<sub>s0</sub> × S<sub>a</sub>""")),
		"BLEND_OP_MIN".enum(codeBlock(
			"""R = min(R<sub>s0</sub>, R<sub>d</sub>)
G = min(G<sub>s0</sub>, G<sub>d</sub>)
B = min(B<sub>s0</sub>, B<sub>d</sub>)
A = min(A<sub>s0</sub>, A<sub>d</sub>)""")),
		"BLEND_OP_MAX".enum(codeBlock(
			"""R = max(R<sub>s0</sub>, R<sub>d</sub>)
G = max(G<sub>s0</sub>, G<sub>d</sub>)
B = max(B<sub>s0</sub>, B<sub>d</sub>)
A = max(A<sub>s0</sub>, A<sub>d</sub>)""")),
		"BLEND_OP_BEGIN_RANGE".enumExpr("", "VK_BLEND_OP_ADD"),
		"BLEND_OP_END_RANGE".enumExpr("", "VK_BLEND_OP_MAX"),
		"BLEND_OP_RANGE_SIZE".enumExpr("", "VK_BLEND_OP_MAX - VK_BLEND_OP_ADD + 1"),
		"BLEND_OP_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkDynamicState",

		"DYNAMIC_STATE_VIEWPORT".enumExpr(
			"""
			Indicates that the {@code pViewports} state in ##VkPipelineViewportStateCreateInfo will be ignored and $must be set dynamically with
			#CmdSetViewport() before any draw commands. The number of viewports used by a pipeline is still specified by the {@code viewportCount} member of
			{@code VkPipelineViewportStateCreateInfo}.
			""", "0"),
		"DYNAMIC_STATE_SCISSOR".enum(
			"""
			Indicates that the {@code pScissors} state in ##VkPipelineViewportStateCreateInfo will be ignored and $must be set dynamically with
			#CmdSetScissor() before any draw commands. The number of scissor rectangles used by a pipeline is still specified by the {@code scissorCount}
			member of {@code VkPipelineViewportStateCreateInfo}.
			"""
		),
		"DYNAMIC_STATE_LINE_WIDTH".enum(
			"""
			Indicates that the {@code lineWidth} state in ##VkPipelineRasterizationStateCreateInfo will be ignored and $must be set dynamically with
			#CmdSetLineWidth() before any draw commands that generate line primitives for the rasterizer.
			"""
		),
		"DYNAMIC_STATE_DEPTH_BIAS".enum(
			"""
			Indicates that the {@code depthBiasConstantFactor}, {@code depthBiasClamp} and {@code depthBiasSlopeFactor} states in
			##VkPipelineRasterizationStateCreateInfo will be ignored and $must be set dynamically with #CmdSetDepthBias() before any draws are performed with
			{@code depthBiasEnable} in {@code VkPipelineRasterizationStateCreateInfo} set to #TRUE.
			"""
		),
		"DYNAMIC_STATE_BLEND_CONSTANTS".enum(
			"""
			Indicates that the {@code blendConstants} state in ##VkPipelineColorBlendStateCreateInfo will be ignored and $must be set dynamically with
			#CmdSetBlendConstants() before any draws are performed with a pipeline state with {@code VkPipelineColorBlendAttachmentState} member
			{@code blendEnable} set to #TRUE and any of the blend functions using a constant blend color.
			"""
		),
		"DYNAMIC_STATE_DEPTH_BOUNDS".enum(
			"""
			Indicates that the {@code minDepthBounds} and {@code maxDepthBounds} states of ##VkPipelineDepthStencilStateCreateInfo will be ignored and $must be
			set dynamically with #CmdSetDepthBounds() before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo}
			member {@code depthBoundsTestEnable} set to #TRUE.
			"""
		),
		"DYNAMIC_STATE_STENCIL_COMPARE_MASK".enum(
			"""
			Indicates that the {@code compareMask} state in ##VkPipelineDepthStencilStateCreateInfo for both front and back will be ignored and $must be set
			dynamically with #CmdSetStencilCompareMask() before any draws are performed with a pipeline state with
			{@code VkPipelineDepthStencilStateCreateInfo} member {@code stencilTestEnable} set to #TRUE.
			"""
		),
		"DYNAMIC_STATE_STENCIL_WRITE_MASK".enum(
			"""
			Indicates that the {@code writeMask} state in ##VkPipelineDepthStencilStateCreateInfo for both front and back will be ignored and $must be set
			dynamically with #CmdSetStencilWriteMask() before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo}
			member {@code stencilTestEnable} set to #TRUE.
			"""
		),
		"DYNAMIC_STATE_STENCIL_REFERENCE".enum(
			"""
			Indicates that the reference state in ##VkPipelineDepthStencilStateCreateInfo for both front and back will be ignored and $must be set dynamically
			with #CmdSetStencilReference() before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo} member
			{@code stencilTestEnable} set to #TRUE.
			"""
		),
		"DYNAMIC_STATE_BEGIN_RANGE".enumExpr("", "VK_DYNAMIC_STATE_VIEWPORT"),
		"DYNAMIC_STATE_END_RANGE".enumExpr("", "VK_DYNAMIC_STATE_STENCIL_REFERENCE"),
		"DYNAMIC_STATE_RANGE_SIZE".enumExpr("", "VK_DYNAMIC_STATE_STENCIL_REFERENCE - VK_DYNAMIC_STATE_VIEWPORT + 1"),
		"DYNAMIC_STATE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkFilter",

		"FILTER_NEAREST".enumExpr(
			"""
			Nearest filtering.

			Computes the integer texel coordinates that the unnormalized coordinates lie within:
			${codeBlock("""
i = floor(u)
j = floor(v)
k = floor(w)""")}
			""",
			"0"),
		"FILTER_LINEAR".enum(
			"""
			Linear filtering.

			Computes a set of neighboring coordinates which bound the unnormalized coordinates. The integer texel coordinates are combinations of
			${code("i<sub>0</sub>")} or ${code("i<sub>1</sub>")}, ${code("j<sub>0</sub>")} or ${code("j<sub>1</sub>")}, ${code("k<sub>0</sub>")} or
			${code("k<sub>1</sub>")}, as well as weights {@code α}, {@code β}, and {@code γ}.
			${codeBlock("""
i<sub>0</sub> = floor(u - 0.5)      i<sub>1</sub> = i<sub>0</sub> + 1
j<sub>0</sub> = floor(v - 0.5)      j<sub>1</sub> = j<sub>0</sub> + 1
k<sub>0</sub> = floor(w - 0.5)      k<sub>1</sub> = k<sub>0</sub> + 1

α = frac(u - 0.5)
β = frac(v - 0.5)
γ = frac(w - 0.5)""")}
			"""
		),
		"FILTER_BEGIN_RANGE".enumExpr("", "VK_FILTER_NEAREST"),
		"FILTER_END_RANGE".enumExpr("", "VK_FILTER_LINEAR"),
		"FILTER_RANGE_SIZE".enumExpr("", "VK_FILTER_LINEAR - VK_FILTER_NEAREST + 1"),
		"FILTER_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	val baseLevel = "level<sub>base</sub>"

	EnumConstant(
		"VkSamplerMipmapMode",

		"SAMPLER_MIPMAP_MODE_NEAREST".enumExpr(
			"""
			Texels are read from the image level {@code d}, where:

			<table>
			${tr(td(code("d = $baseLevel")), td(code("when λ &le; 0.5")))}
			${tr(td(code("d = nearest(λ)")), td(code("when λ &gt; 0.5 && $baseLevel + λ &le; q + 0.5")))}
			${tr(td(code("d = q")), td(code("when λ &gt; 0.5 && $baseLevel + λ &gt; q + 0.5")))}
			</table>

			and:

			<table>
			${tr(td(code("nearest(λ) = ceil($baseLevel + λ + 0.5) - 1,")), td("preferred"))}
			${tr(td(code("nearest(λ) = floor($baseLevel + λ + 0.5),")), td("alternative"))}
			</table>

			and where {@code q} is the {@code levelCount} from the {@code subresourceRange} of the image view.
			""", "0"),
		"SAMPLER_MIPMAP_MODE_LINEAR".enum(
			"""
			Texels are read from image levels ${code("d<sub>hi</sub>")} and ${code("d<sub>lo</sub>")}, where:

			<table>
			${tr(td(code("d<sub>hi</sub> = q")), td(code("when $baseLevel + λ &ge; q")))}
			${tr(td(code("d<sub>hi</sub> = floor($baseLevel + λ)")), td("otherwise"))}
			</table>

			and:

			<table>
			${tr(td(code("d<sub>lo</sub> = q")), td(code("when $baseLevel + λ &ge; q")))}
			${tr(td(code("d<sub>lo</sub> = d<sub>hi</sub> + 1")), td("otherwise"))}
			</table>

			${code("δ = frac(λ)")} is the fractional value used for linear filtering between levels:
			"""
		),
		"SAMPLER_MIPMAP_MODE_BEGIN_RANGE".enumExpr("", "VK_SAMPLER_MIPMAP_MODE_NEAREST"),
		"SAMPLER_MIPMAP_MODE_END_RANGE".enumExpr("", "VK_SAMPLER_MIPMAP_MODE_LINEAR"),
		"SAMPLER_MIPMAP_MODE_RANGE_SIZE".enumExpr("", "VK_SAMPLER_MIPMAP_MODE_LINEAR - VK_SAMPLER_MIPMAP_MODE_NEAREST + 1"),
		"SAMPLER_MIPMAP_MODE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkSamplerAddressMode",

		"SAMPLER_ADDRESS_MODE_REPEAT".enumExpr("Indicates that the repeat wrap mode will be used.", "0"),
		"SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT".enum("Indicates that the mirrored repeat wrap mode will be used."),
		"SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE".enum("Indicates that the clamp to edge wrap mode will be used."),
		"SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER".enum("Indicates that the clamp to border wrap mode will be used."),
		"SAMPLER_ADDRESS_MODE_BEGIN_RANGE".enumExpr("", "VK_SAMPLER_ADDRESS_MODE_REPEAT"),
		"SAMPLER_ADDRESS_MODE_END_RANGE".enumExpr("", "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER"),
		"SAMPLER_ADDRESS_MODE_RANGE_SIZE".enumExpr("", "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER - VK_SAMPLER_ADDRESS_MODE_REPEAT + 1"),
		"SAMPLER_ADDRESS_MODE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkBorderColor",

		"BORDER_COLOR_FLOAT_TRANSPARENT_BLACK".enumExpr(code("(0.0, 0.0, 0.0, 0.0)"), "0"),
		"BORDER_COLOR_INT_TRANSPARENT_BLACK".enum(code("(0, 0, 0, 0)")),
		"BORDER_COLOR_FLOAT_OPAQUE_BLACK".enum(code("(0.0, 0.0, 0.0, 1.0)")),
		"BORDER_COLOR_INT_OPAQUE_BLACK".enum(code("(0, 0, 0, 1)")),
		"BORDER_COLOR_FLOAT_OPAQUE_WHITE".enum(code("(1.0, 1.0, 1.0, 1.0)")),
		"BORDER_COLOR_INT_OPAQUE_WHITE".enum(code("(1, 1, 1, 1)")),
		"BORDER_COLOR_BEGIN_RANGE".enumExpr("", "VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK"),
		"BORDER_COLOR_END_RANGE".enumExpr("", "VK_BORDER_COLOR_INT_OPAQUE_WHITE"),
		"BORDER_COLOR_RANGE_SIZE".enumExpr("", "VK_BORDER_COLOR_INT_OPAQUE_WHITE - VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK + 1"),
		"BORDER_COLOR_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkDescriptorType",

		"DESCRIPTOR_TYPE_SAMPLER".enumExpr("", "0"),
		"DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER".enum(""),
		"DESCRIPTOR_TYPE_SAMPLED_IMAGE".enum(""),
		"DESCRIPTOR_TYPE_STORAGE_IMAGE".enum(""),
		"DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER".enum(""),
		"DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER".enum(""),
		"DESCRIPTOR_TYPE_UNIFORM_BUFFER".enum(""),
		"DESCRIPTOR_TYPE_STORAGE_BUFFER".enum(""),
		"DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC".enum(""),
		"DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC".enum(""),
		"DESCRIPTOR_TYPE_INPUT_ATTACHMENT".enum(""),
		"DESCRIPTOR_TYPE_BEGIN_RANGE".enumExpr("", "VK_DESCRIPTOR_TYPE_SAMPLER"),
		"DESCRIPTOR_TYPE_END_RANGE".enumExpr("", "VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT"),
		"DESCRIPTOR_TYPE_RANGE_SIZE".enumExpr("", "VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT - VK_DESCRIPTOR_TYPE_SAMPLER + 1"),
		"DESCRIPTOR_TYPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkAttachmentLoadOp",

		"ATTACHMENT_LOAD_OP_LOAD".enumExpr("Means the contents within the render area will be preserved.", "0"),
		"ATTACHMENT_LOAD_OP_CLEAR".enum(
			"Means the contents within the render area will be cleared to a uniform value, which is specified when a render pass instance is begun."
		),
		"ATTACHMENT_LOAD_OP_DONT_CARE".enum(
			"Means the contents within the area need not be preserved; the contents of the attachment will be undefined inside the render area."
		),
		"ATTACHMENT_LOAD_OP_BEGIN_RANGE".enumExpr("", "VK_ATTACHMENT_LOAD_OP_LOAD"),
		"ATTACHMENT_LOAD_OP_END_RANGE".enumExpr("", "VK_ATTACHMENT_LOAD_OP_DONT_CARE"),
		"ATTACHMENT_LOAD_OP_RANGE_SIZE".enumExpr("", "VK_ATTACHMENT_LOAD_OP_DONT_CARE - VK_ATTACHMENT_LOAD_OP_LOAD + 1"),
		"ATTACHMENT_LOAD_OP_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkAttachmentStoreOp",

		"ATTACHMENT_STORE_OP_STORE".enumExpr(
			"""
			Means the contents within the render area are written to memory and will be available for reading after the render pass instance completes once the
			writes have been synchronized with #ACCESS_COLOR_ATTACHMENT_WRITE_BIT (for color attachments) or #ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT (for
			depth/stencil attachments).
			""", "0"
		),
		"ATTACHMENT_STORE_OP_DONT_CARE".enum(
			"""
			Means the contents within the render area are not needed after rendering, and $may be discarded; the contents of the attachment will be undefined
			inside the render area.
			"""
		),
		"ATTACHMENT_STORE_OP_BEGIN_RANGE".enumExpr("", "VK_ATTACHMENT_STORE_OP_STORE"),
		"ATTACHMENT_STORE_OP_END_RANGE".enumExpr("", "VK_ATTACHMENT_STORE_OP_DONT_CARE"),
		"ATTACHMENT_STORE_OP_RANGE_SIZE".enumExpr("", "VK_ATTACHMENT_STORE_OP_DONT_CARE - VK_ATTACHMENT_STORE_OP_STORE + 1"),
		"ATTACHMENT_STORE_OP_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	val VkPipelineBindPoints = EnumConstant(
		"VkPipelineBindPoint",

		"PIPELINE_BIND_POINT_GRAPHICS".enumExpr("", "0"),
		"PIPELINE_BIND_POINT_COMPUTE".enum(""),
		"PIPELINE_BIND_POINT_BEGIN_RANGE".enumExpr("", "VK_PIPELINE_BIND_POINT_GRAPHICS"),
		"PIPELINE_BIND_POINT_END_RANGE".enumExpr("", "VK_PIPELINE_BIND_POINT_COMPUTE"),
		"PIPELINE_BIND_POINT_RANGE_SIZE".enumExpr("", "VK_PIPELINE_BIND_POINT_COMPUTE - VK_PIPELINE_BIND_POINT_GRAPHICS + 1"),
		"PIPELINE_BIND_POINT_MAX_ENUM".enum("", 0x7FFFFFFF)
	).enumLinks

	EnumConstant(
		"VkCommandBufferLevel",

		"COMMAND_BUFFER_LEVEL_PRIMARY".enumExpr("", "0"),
		"COMMAND_BUFFER_LEVEL_SECONDARY".enum(""),
		"COMMAND_BUFFER_LEVEL_BEGIN_RANGE".enumExpr("", "VK_COMMAND_BUFFER_LEVEL_PRIMARY"),
		"COMMAND_BUFFER_LEVEL_END_RANGE".enumExpr("", "VK_COMMAND_BUFFER_LEVEL_SECONDARY"),
		"COMMAND_BUFFER_LEVEL_RANGE_SIZE".enumExpr("", "VK_COMMAND_BUFFER_LEVEL_SECONDARY - VK_COMMAND_BUFFER_LEVEL_PRIMARY + 1"),
		"COMMAND_BUFFER_LEVEL_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	val VkIndexTypes = EnumConstant(
		"VkIndexType",

		"INDEX_TYPE_UINT16".enumExpr("", "0"),
		"INDEX_TYPE_UINT32".enum(""),
		"INDEX_TYPE_BEGIN_RANGE".enumExpr("", "VK_INDEX_TYPE_UINT16"),
		"INDEX_TYPE_END_RANGE".enumExpr("", "VK_INDEX_TYPE_UINT32"),
		"INDEX_TYPE_RANGE_SIZE".enumExpr("", "VK_INDEX_TYPE_UINT32 - VK_INDEX_TYPE_UINT16 + 1"),
		"INDEX_TYPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	).enumLinks

	EnumConstant(
		"VkSubpassContents",

		"SUBPASS_CONTENTS_INLINE".enumExpr(
			"""
			The contents of the subpass will be recorded inline in the primary command buffer, and secondary command buffers $mustnot be executed within the
			subpass.
			""", "0"),
		"SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS".enum(
			"""
			The contents are recorded in secondary command buffers that will be called from the primary command buffer, and #CmdExecuteCommands() is the only
			valid command on the command buffer until #CmdNextSubpass() or #CmdEndRenderPass().
			"""
		),
		"SUBPASS_CONTENTS_BEGIN_RANGE".enumExpr("", "VK_SUBPASS_CONTENTS_INLINE"),
		"SUBPASS_CONTENTS_END_RANGE".enumExpr("", "VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS"),
		"SUBPASS_CONTENTS_RANGE_SIZE".enumExpr("", "VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS - VK_SUBPASS_CONTENTS_INLINE + 1"),
		"SUBPASS_CONTENTS_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkFormatFeatureFlagBits",

		"FORMAT_FEATURE_SAMPLED_IMAGE_BIT".enum("{@code VkImageView} $can be sampled from.", 0x00000001),
		"FORMAT_FEATURE_STORAGE_IMAGE_BIT".enum("{@code VkImageView} $can be used as storage image.", 0x00000002),
		"FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT".enum("{@code VkImageView} $can be used as storage image that supports atomic operations.", 0x00000004),
		"FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT".enum(
			"Format $can be used to create a {@code VkBufferView} that $can be bound to a #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER descriptor.",
			0x00000008
		),
		"FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT".enum(
			"Format $can be used to create a {@code VkBufferView} that $can be bound to a #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER descriptor.",
			0x00000010
		),
		"FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT".enum(
			"Atomic operations are supported on #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER with this format.",
			0x00000020
		),
		"FORMAT_FEATURE_VERTEX_BUFFER_BIT".enum(
			"Format $can be used as a vertex attribute format (##VkVertexInputAttributeDescription{@code .format}).",
			0x00000040
		),
		"FORMAT_FEATURE_COLOR_ATTACHMENT_BIT".enum("{@code VkImageView} $can be used as a framebuffer color attachment and as an input attachment.", 0x00000080),
		"FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT".enum(
			"{@code VkImageView} $can be used as a framebuffer color attachment that supports blending and as an input attachment.",
			0x00000100
		),
		"FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT".enum(
			"{@code VkImageView} $can be used as a framebuffer depth/stencil attachment and as an input attachment.",
			0x00000200
		),
		"FORMAT_FEATURE_BLIT_SRC_BIT".enum("{@code VkImage} $can be used as {@code srcImage} for the #CmdBlitImage() command.", 0x00000400),
		"FORMAT_FEATURE_BLIT_DST_BIT".enum("{@code VkImage} $can be used as {@code dstImage} for the #CmdBlitImage() command.", 0x00000800),
		"FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT".enum(
			"""
			{@code VkImage} $can be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to #FILTER_LINEAR, or {@code mipmapMode}
			set to #SAMPLER_MIPMAP_MODE_LINEAR. This bit $must only be exposed for formats that also support the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT.

			If the format being queried is a depth/stencil format, this bit only indicates that the depth aspect (not the stencil aspect) supports linear
			filtering, and that linear filtering of the depth aspect is supported whether depth compare is enabled in the sampler or not. If this bit is not
			present, linear filtering with depth compare disabled is unsupported and linear filtering with depth compare enabled is supported, but $may compute
			the filtered value in an implementation-dependent manner which differs from the normal rules of linear filtering. The resulting value $must be in
			the range {@code [0,1]} and $should be proportional to, or a weighted average of, the number of comparison passes or failures.
			""",
			0x00001000
		)
	)

	val VkImageUsageFlagBits = EnumConstant(
		"VkImageUsageFlagBits",

		"IMAGE_USAGE_TRANSFER_SRC_BIT".enum("Indicates that the image $can be used as the source of a transfer command.", 0x00000001),
		"IMAGE_USAGE_TRANSFER_DST_BIT".enum("Indicates that the image $can be used as the destination of a transfer command.", 0x00000002),
		"IMAGE_USAGE_SAMPLED_BIT".enum(
			"""
			Indicates that the image $can be used to create a {@code VkImageView} suitable for occupying a {@code VkDescriptorSet} slot either of type
			#DESCRIPTOR_TYPE_SAMPLED_IMAGE or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and be sampled by a shader.
			""",
			0x00000004
		),
		"IMAGE_USAGE_STORAGE_BIT".enum(
			"""
			Indicates that the image $can be used to create a {@code VkImageView} suitable for occupying a {@code VkDescriptorSet} slot of type
			#DESCRIPTOR_TYPE_STORAGE_IMAGE.
			""",
			0x00000008
		),
		"IMAGE_USAGE_COLOR_ATTACHMENT_BIT".enum(
			"Indicates that the image $can be used to create a {@code VkImageView} suitable for use as a color or resolve attachment in a {@code VkFramebuffer}.",
			0x00000010
		),
		"IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT".enum(
			"Indicates that the image $can be used to create a {@code VkImageView} suitable for use as a depth/stencil attachment in a {@code VkFramebuffer}.",
			0x00000020
		),
		"IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT".enum(
			"""
			Indicates that the memory bound to this image will have been allocated with the #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT. If this is set, then bits
			other than #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, and #IMAGE_USAGE_INPUT_ATTACHMENT_BIT $mustnot be set.
			""",
			0x00000040
		),
		"IMAGE_USAGE_INPUT_ATTACHMENT_BIT".enum(
			"""
			Indicates that the image $can be used to create a {@code VkImageView} suitable for occupying {@code VkDescriptorSet} slot of type
			#DESCRIPTOR_TYPE_INPUT_ATTACHMENT; be read from a shader as an input attachment; and be used as an input attachment in a framebuffer.
			""",
			0x00000080
		)
	).javaDocLinks

	val VkImageCreateFlagBits = EnumConstant(
		"VkImageCreateFlagBits",

		"IMAGE_CREATE_SPARSE_BINDING_BIT".enum("Indicates that the image will be backed using sparse memory binding.", 0x00000001),
		"IMAGE_CREATE_SPARSE_RESIDENCY_BIT".enum("Indicates that the image $can be partially backed using sparse memory binding.", 0x00000002),
		"IMAGE_CREATE_SPARSE_ALIASED_BIT".enum(
			"""
			Indicates that the image will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another image (or
			another portion of the same image). Sparse images created with this flag $must also be created with the #IMAGE_CREATE_SPARSE_RESIDENCY_BIT.
			""",
			0x00000004
		),
		"IMAGE_CREATE_MUTABLE_FORMAT_BIT".enum(
			"Indicates that the image $can be used to create a {@code VkImageView} with a different format from the image.",
			0x00000008
		),
		"IMAGE_CREATE_CUBE_COMPATIBLE_BIT".enum(
			"Indicates that the image $can be used to create a {@code VkImageView} of type #IMAGE_VIEW_TYPE_CUBE or #IMAGE_VIEW_TYPE_CUBE_ARRAY.",
			0x00000010
		)
	).javaDocLinks

	val VkSampleCountFlagBitLinks = EnumConstant(
		"VkSampleCountFlagBits",

		"SAMPLE_COUNT_1_BIT".enum(
			"""
			1 sample per pixel. Standard sample locations:
			${codeBlock("(0.5, 0.5)")}
			""",
			0x00000001
		),
		"SAMPLE_COUNT_2_BIT".enum(
			"""
			2 samples per pixel. Standard sample locations:
			${codeBlock("""
(0.25, 0.25)
(0.75, 0.75)""")}
			""",
			0x00000002
		),
		"SAMPLE_COUNT_4_BIT".enum(
			"""
			4 samples per pixel. Standard sample locations:
			${codeBlock("""
(0.375, 0.125)
(0.875, 0.375)
(0.125, 0.625)
(0.625, 0.875)""")}
			""",
			0x00000004
		),
		"SAMPLE_COUNT_8_BIT".enum(
			"""
			8 samples per pixel. Standard sample locations:
			${codeBlock("""
(0.5625, 0.3125)
(0.4375, 0.6875)
(0.8125, 0.5625)
(0.3125, 0.1875)
(0.1875, 0.8125)
(0.0625, 0.4375)
(0.6875, 0.9375)
(0.9375, 0.0625)""")}
			""",
			0x00000008
		),
		"SAMPLE_COUNT_16_BIT".enum(
			"""
			16 samples per pixel. Standard sample locations:
			${codeBlock("""
(0.5625, 0.5625)
(0.4375, 0.3125)
(0.3125, 0.625)
(0.75, 0.4375)
(0.1875, 0.375)
(0.625, 0.8125)
(0.8125, 0.6875)
(0.6875, 0.1875)
(0.375, 0.875)
(0.5, 0.0625)
(0.25, 0.125)
(0.125, 0.75)
(0.0, 0.5)
(0.9375, 0.25)
(0.875, 0.9375)
(0.0625, 0.0)""")}
			""",
			0x00000010
		),
		"SAMPLE_COUNT_32_BIT".enum("32 samples per pixel.", 0x00000020),
		"SAMPLE_COUNT_64_BIT".enum("64 samples per pixel.", 0x00000040)
	).javaDocLinks

	EnumConstant(
		"VkQueueFlagBits",

		"QUEUE_GRAPHICS_BIT".enum("If set, then the queues in this queue family support graphics operations.", 0x00000001),
		"QUEUE_COMPUTE_BIT".enum("If set, then the queues in this queue family support compute operations.", 0x00000002),
		"QUEUE_TRANSFER_BIT".enum("If set, then the queues in this queue family support transfer operations.", 0x00000004),
		"QUEUE_SPARSE_BINDING_BIT".enum(
			"""
			If set, then the queues in this queue family support sparse memory management operations. If any of the sparse resource features are enabled, then
			at least one queue family $must support this bit.
			""",
			0x00000008
		)
	)

	EnumConstant(
		"VkMemoryPropertyFlagBits",

		"MEMORY_PROPERTY_DEVICE_LOCAL_BIT".enum(
			"""
			If set, memory allocated with this type is the most efficient for device access. This property will only be set for memory types belonging to heaps
			with the #MEMORY_HEAP_DEVICE_LOCAL_BIT set.
			""", 0x00000001),
		"MEMORY_PROPERTY_HOST_VISIBLE_BIT".enum(
			"If set, memory allocated with this type $can be mapped using #MapMemory() so that it $can be accessed on the host.",
			0x00000002
		),
		"MEMORY_PROPERTY_HOST_COHERENT_BIT".enum(
			"""
			If set, host cache management commands #FlushMappedMemoryRanges() and #InvalidateMappedMemoryRanges() are not needed to make host writes visible to
			the device or device writes visible to the host, respectively.
			""",
			0x00000004
		),
		"MEMORY_PROPERTY_HOST_CACHED_BIT".enum(
			"""
			If set, memory allocated with this type is cached on the host. Host memory accesses to uncached memory are slower than to cached memory, however
			uncached memory is always host coherent.
			""",
			0x00000008
		),
		"MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT".enum(
			"""
			If set, the memory type only allows device access to the memory. Memory types $must not have both #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT and
			#MEMORY_PROPERTY_HOST_VISIBLE_BIT set. Additionally, the object's backing memory $may be provided by the implementation lazily.
			""",
			0x00000010
		)
	)

	EnumConstant(
		"VkMemoryHeapFlagBits",

		"MEMORY_HEAP_DEVICE_LOCAL_BIT".enum(
			"""
			Means the heap corresponds to device local memory. Device local memory $may have different performance characteristics than host local memory, and
			$may support different memory property flags.
			""",
			0x00000001
		)
	)

	EnumConstant(
		"VkPipelineStageFlagBits",

		"PIPELINE_STAGE_TOP_OF_PIPE_BIT".enum("Stage of the pipeline where commands are initially received by the queue.", 0x00000001),
		"PIPELINE_STAGE_DRAW_INDIRECT_BIT".enum("Stage of the pipeline where Draw/DispatchIndirect data structures are consumed.", 0x00000002),
		"PIPELINE_STAGE_VERTEX_INPUT_BIT".enum("Stage of the pipeline where vertex and index buffers are consumed.", 0x00000004),
		"PIPELINE_STAGE_VERTEX_SHADER_BIT".enum("Vertex shader stage.", 0x00000008),
		"PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT".enum("Tessellation control shader stage.", 0x00000010),
		"PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT".enum("Tessellation evaluation shader stage.", 0x00000020),
		"PIPELINE_STAGE_GEOMETRY_SHADER_BIT".enum("Geometry shader stage.", 0x00000040),
		"PIPELINE_STAGE_FRAGMENT_SHADER_BIT".enum("Fragment shader stage.", 0x00000080),
		"PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT".enum(
			"Stage of the pipeline where early fragment tests (depth and stencil tests before fragment shading) are performed.",
			0x00000100
		),
		"PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT".enum(
			"Stage of the pipeline where late fragment tests (depth and stencil tests after fragment shading) are performed.",
			0x00000200
		),
		"PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT".enum(
			"""
			Stage of the pipeline after blending where the final color values are output from the pipeline. This stage also includes resolve operations that
			occur at the end of a subpass. Note that this does not necessarily indicate that the values have been committed to memory.
			""",
			0x00000400
		),
		"PIPELINE_STAGE_COMPUTE_SHADER_BIT".enum("Execution of a compute shader.", 0x00000800),
		"PIPELINE_STAGE_TRANSFER_BIT".enum(
			"""
			Execution of copy commands. This includes the operations resulting from all transfer commands. The set of transfer commands comprises
			#CmdCopyBuffer(), #CmdCopyImage(), #CmdBlitImage(), #CmdCopyBufferToImage(), #CmdCopyImageToBuffer(), #CmdUpdateBuffer(), #CmdFillBuffer(),
			#CmdClearColorImage(), #CmdClearDepthStencilImage(), #CmdResolveImage(), and #CmdCopyQueryPoolResults().
			""",
			0x00001000
		),
		"PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT".enum("Final stage in the pipeline where commands complete execution.", 0x00002000),
		"PIPELINE_STAGE_HOST_BIT".enum("A pseudo-stage indicating execution on the host of reads/writes of device memory.", 0x00004000),
		"PIPELINE_STAGE_ALL_GRAPHICS_BIT".enum("Execution of all graphics pipeline stages.", 0x00008000),
		"PIPELINE_STAGE_ALL_COMMANDS_BIT".enum("Execution of all stages supported on the queue.", 0x00010000)
	)

	EnumConstant(
		"VkImageAspectFlagBits",

		"IMAGE_ASPECT_COLOR_BIT".enum("", 0x00000001),
		"IMAGE_ASPECT_DEPTH_BIT".enum("", 0x00000002),
		"IMAGE_ASPECT_STENCIL_BIT".enum("", 0x00000004),
		"IMAGE_ASPECT_METADATA_BIT".enum("", 0x00000008)
	)

	EnumConstant(
		"VkSparseImageFormatFlagBits",

		"SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT".enum("If set, the image uses a single mip tail region for all array layers.", 0x00000001),
		"SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT".enum(
			"If set, the first mip level that is not an exact multiple of the sparse image block size begins the mip tail region.",
			0x00000002
		),
		"SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT".enum(
			"""
			If set, the image uses a non-standard sparse block size, and the imageGranularity values do not match the standard block size for the given pixel
			format.
			""",
			0x00000004
		)
	)

	EnumConstant(
		"VkSparseMemoryBindFlagBits",

		"SPARSE_MEMORY_BIND_METADATA_BIT".enum("Is used to indicate that the memory being bound is only for the metadata aspect.", 0x00000001)
	)

	EnumConstant(
		"VkFenceCreateFlagBits",

		"FENCE_CREATE_SIGNALED_BIT".enum(
			"If set, then the fence object is created in the signaled state. Otherwise it is created in the unsignaled state.",
			0x00000001
		)
	)

	EnumConstant(
		"VkQueryPipelineStatisticFlagBits",

		"QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT".enum(
			"""
			If set, queries managed by the pool will count the number of vertices processed by the input assembly stage. Vertices corresponding to incomplete
			primitives $may contribute to the count.
			""",
			0x00000001
		),
		"QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT".enum(
			"""
			If set, queries managed by the pool will count the number of primitives processed by the input assembly stage. If primitive restart is enabled,
			restarting the primitive topology has no effect on the count. Incomplete primitives $may be counted.
			""",
			0x00000002
		),
		"QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT".enum(
			"""
			If set, queries managed by the pool will count the number of vertex shader invocations. This counter’s value is incremented each time a vertex
			shader is invoked.
			""",
			0x00000004
		),
		"QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT".enum(
			"""
			If set, queries managed by the pool will count the number of geometry shader invocations. This counter’s value is incremented each time a geometry
			shader is invoked. In the case of instanced geometry shaders, the geometry shader invocations count is incremented for each separate instanced
			invocation.
			""",
			0x00000008
		),
		"QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT".enum(
			"""
			If set, queries managed by the pool will count the number of primitives generated by geometry shader invocations. The counter’s value is
			incremented each time the geometry shader emits a primitive. Restarting primitive topology using the SPIR-V instructions {@code OpEndPrimitive} or
			{@code OpEndStreamPrimitive} has no effect on the geometry shader output primitives count.
			""",
			0x00000010
		),
		"QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT".enum(
			"""
			If set, queries managed by the pool will count the number of primitives processed by the Primitive Clipping stage of the pipeline. The counter’s
			value is incremented each time a primitive reaches the primitive clipping stage.
			""",
			0x00000020
		),
		"QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT".enum(
			"""
			IF set, queries managed by the pool will count the number of primitives output by the Primitive Clipping stage of the pipeline. The counter’s value
			is incremented each time a primitive passes the primitive clipping stage. The actual number of primitives output by the primitive clipping stage
			for a particular input primitive is implementation-dependent but $must satisfy the following conditions:
			${ul(
				"If at least one vertex of the input primitive lies inside the clipping volume, the counter is incremented by one or more.",
				"Otherwise, the counter is incremented by zero or more."
			)}
			""",
			0x00000040
		),
		"QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT".enum(
			"""
			IF set, queries managed by the pool will count the number of fragment shader invocations. The counter’s value is incremented each time the fragment
			shader is invoked.
			""",
			0x00000080
		),
		"QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT".enum(
			"""
			If set, queries managed by the pool will count the number of patches processed by the tessellation control shader. The counter’s value is
			incremented once for each patch for which a tessellation control shader is invoked.
			""",
			0x00000100
		),
		"QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT".enum(
			"""
			If set, queries managed by the pool will count the number of invocations of the tessellation evaluation shader. The counter’s value is incremented
			each time the tessellation evaluation shader is invoked.
			""",
			0x00000200
		),
		"QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT".enum(
			"""
			If set, queries managed by the pool will count the number of compute shader invocations. The counter’s value is incremented every time the compute
			shader is invoked. Implementations $may skip the execution of certain compute shader invocations or execute additional compute shader invocations
			for implementation-dependent reasons as long as the results of rendering otherwise remain unchanged.
			""",
			0x00000400
		)
	)

	val VkQueryResultFlagBits = EnumConstant(
		"VkQueryResultFlagBits",

		"QUERY_RESULT_64_BIT".enum(
			"""
			Indicates the results will be written as an array of 64-bit unsigned integer values. If this bit is not set, the results will be written as an
			array of 32-bit unsigned integer values.
			""",
			0x00000001
		),
		"QUERY_RESULT_WAIT_BIT".enum("Indicates that Vulkan will wait for each query’s status to become available before retrieving its results.", 0x00000002),
		"QUERY_RESULT_WITH_AVAILABILITY_BIT".enum("Indicates that the availability status accompanies the results.", 0x00000004),
		"QUERY_RESULT_PARTIAL_BIT".enum("Indicates that returning partial results is acceptable.", 0x00000008)
	).javaDocLinks

	EnumConstant(
		"VkBufferCreateFlagBits",

		"BUFFER_CREATE_SPARSE_BINDING_BIT".enum("Indicates that the buffer will be backed using sparse memory binding.", 0x00000001),
		"BUFFER_CREATE_SPARSE_RESIDENCY_BIT".enum("Indicates that the buffer $can be partially backed using sparse memory binding.", 0x00000002),
		"BUFFER_CREATE_SPARSE_ALIASED_BIT".enum(
			"""
			Iindicates that the buffer will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another buffer
			(or another portion of the same buffer).
			""",
			0x00000004
		)
	)

	EnumConstant(
		"VkBufferUsageFlagBits",

		"BUFFER_USAGE_TRANSFER_SRC_BIT".enum("Indicates that the buffer $can be used as the source of a transfer command.", 0x00000001),
		"BUFFER_USAGE_TRANSFER_DST_BIT".enum("Indicates that the buffer $can be used as the destination of a transfer command.", 0x00000002),
		"BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT".enum(
			"""
			Indicates that the buffer $can be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type
			#DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER.
			""",
			0x00000004
		),
		"BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT".enum(
			"""
			Indicates that the buffer $can be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type
			#DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER.
			""",
			0x00000008
		),
		"BUFFER_USAGE_UNIFORM_BUFFER_BIT".enum(
			"""
			Indicates that the buffer $can be used in a ##VkDescriptorBufferInfo suitable for occupying a {@code VkDescriptorSet} slot either of type
			#DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC.
			""",
			0x00000010
		),
		"BUFFER_USAGE_STORAGE_BUFFER_BIT".enum(
			"""
			Indicates that the buffer $can be used in a ##VkDescriptorBufferInfo suitable for occupying a {@code VkDescriptorSet} slot either of type
			#DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC.
			""",
			0x00000020
		),
		"BUFFER_USAGE_INDEX_BUFFER_BIT".enum(
			"Indicates that the buffer is suitable for passing as the {@code buffer} parameter to #CmdBindIndexBuffer().",
			0x00000040
		),
		"BUFFER_USAGE_VERTEX_BUFFER_BIT".enum(
			"Indicates that the buffer is suitable for passing as an element of the {@code pBuffers} array to #CmdBindVertexBuffers().",
			0x00000080
		),
		"BUFFER_USAGE_INDIRECT_BUFFER_BIT".enum(
			"""
			Indicates that the buffer is suitable for passing as the {@code buffer} parameter to #CmdDrawIndirect(), #CmdDrawIndexedIndirect(), or
			#CmdDispatchIndirect().
			""",
			0x00000100
		)
	)

	EnumConstant(
		"VkPipelineCreateFlagBits",

		"PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT".enum(
			"Specifies that the created pipeline will not be optimized. Using this flag $may reduce the time taken to create the pipeline.",
			0x00000001
		),
		"PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT".enum(
			"""
			Specifies that the pipeline to be created is allowed to be the parent of a pipeline that will be created in a subsequent call to
			#CreateGraphicsPipelines().
			""",
			0x00000002
		),
		"PIPELINE_CREATE_DERIVATIVE_BIT".enum("Specifies that the pipeline to be created will be a child of a previously created parent pipeline.", 0x00000004)
	)

	EnumConstant(
		"VkShaderStageFlagBits",

		"SHADER_STAGE_VERTEX_BIT".enum("", 0x00000001),
		"SHADER_STAGE_TESSELLATION_CONTROL_BIT".enum("", 0x00000002),
		"SHADER_STAGE_TESSELLATION_EVALUATION_BIT".enum("", 0x00000004),
		"SHADER_STAGE_GEOMETRY_BIT".enum("", 0x00000008),
		"SHADER_STAGE_FRAGMENT_BIT".enum("", 0x00000010),
		"SHADER_STAGE_COMPUTE_BIT".enum("", 0x00000020),
		"SHADER_STAGE_ALL_GRAPHICS".enum("", 0x0000001F),
		"SHADER_STAGE_ALL".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkCullModeFlagBits",

		"CULL_MODE_NONE".enumExpr("If set, no triangles are discarded.", "0"),
		"CULL_MODE_FRONT_BIT".enum("If set, front-facing triangles are discarded.", 0x00000001),
		"CULL_MODE_BACK_BIT".enum("If set, back-facing triangles are discarded.", 0x00000002),
		"CULL_MODE_FRONT_AND_BACK".enum("If set, all triangles are discarded.", 0x00000003)
	)

	EnumConstant(
		"VkColorComponentFlagBits",

		"COLOR_COMPONENT_R_BIT".enum(
			"If set, then the {@code R} value is written to color attachment for the appropriate sample, otherwise the value in memory is unmodified.",
			0x00000001
		),
		"COLOR_COMPONENT_G_BIT".enum(
			"If set, then the {@code G} value is written to color attachment for the appropriate sample, otherwise the value in memory is unmodified.",
			0x00000002
		),
		"COLOR_COMPONENT_B_BIT".enum(
			"If set, then the {@code B} value is written to color attachment for the appropriate sample, otherwise the value in memory is unmodified.",
			0x00000004
		),
		"COLOR_COMPONENT_A_BIT".enum(
			"If set, then the {@code A} value is written to color attachment for the appropriate sample, otherwise the value in memory is unmodified.",
			0x00000008
		)
	)

	EnumConstant(
		"VkDescriptorPoolCreateFlagBits",

		"DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT".enum(
			"""
			If set, then descriptor sets $can return their individual allocations to the pool, i.e. all of #AllocateDescriptorSets(), #FreeDescriptorSets(), and
			#ResetDescriptorPool() are allowed. Otherwise, descriptor sets allocated from the pool $must not be individually freed back to the pool, i.e. only
			#AllocateDescriptorSets() and #ResetDescriptorPool() are allowed.
			""",
			0x00000001
		)
	)

	EnumConstant(
		"VkAttachmentDescriptionFlagBits",

		"ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT".enum(
			"""
			If set, then the attachment is treated as if it shares physical memory with another attachment in the same render pass. This information limits the
			ability of the implementation to reorder certain operations (like layout transitions and the {@code loadOp}) such that it is not improperly
			reordered against other uses of the same physical memory via a different attachment. This is described in more detail below.

			If a render pass uses multiple attachments that alias the same device memory, those attachments $must each include the
			{@code ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} bit in their attachment description flags. Attachments aliasing the same memory occurs in multiple
			ways:
			${ul(
				"Multiple attachments being assigned the same image view as part of framebuffer creation.",
				"Attachments using distinct image views that correspond to the same subresource of an image.",
				"Attachments using views of distinct image subresources which are bound to overlapping memory."
			)}
			Render passes $must include subpass dependencies (either directly or via a subpass dependency chain) between any two subpasses that operate on the
			same attachment or aliasing attachments and those subpass dependencies $must include execution and memory dependencies separating uses of the
			aliases, if at least one of those subpasses writes to one of the aliases. Those dependencies $mustnot include the #DEPENDENCY_BY_REGION_BIT if the
			aliases are views of distinct image subresources which overlap in memory.

			Multiple attachments that alias the same memory $mustnot be used in a single subpass. A given attachment index $mustnot be used multiple times in
			a single subpass, with one exception: two subpass attachments $can use the same attachment index if at least one use is as an input attachment and
			neither use is as a resolve or preserve attachment. In other words, the same view $can be used simultaneously as an input and color or
			depth/stencil attachment, but $mustnot be used as multiple color or depth/stencil attachments nor as resolve or preserve attachments.

			If a set of attachments alias each other, then all except the first to be used in the render pass $must use an initialLayout of
			#IMAGE_LAYOUT_UNDEFINED, since the earlier uses of the other aliases make their contents undefined. Once an alias has been used and a different
			alias has been used after it, the first alias $mustnot be used in any later subpasses. However, an application $can assign the same image view to
			multiple aliasing attachment indices, which allows that image view to be used multiple times even if other aliases are used in between. Once an
			attachment needs the {@code ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} bit, there $should be no additional cost of introducing additional aliases, and
			using these additional aliases $may allow more efficient clearing of the attachments on multiple uses via #ATTACHMENT_LOAD_OP_CLEAR.

			${note(
				"""
				The exact set of attachment indices that alias with each other is not known until a framebuffer is created using the render pass, so the above
				conditions $cannot be validated at render pass creation time.
				"""
			)}
			""",
			0x00000001
		)
	)

	EnumConstant(
		"VkAccessFlagBits",

		"ACCESS_INDIRECT_COMMAND_READ_BIT".enum(
			"Indicates that the access is an indirect command structure read as part of an indirect drawing command.",
			0x00000001
		),
		"ACCESS_INDEX_READ_BIT".enum("Indicates that the access is an index buffer read.", 0x00000002),
		"ACCESS_VERTEX_ATTRIBUTE_READ_BIT".enum("Indicates that the access is a read via the vertex input bindings.", 0x00000004),
		"ACCESS_UNIFORM_READ_BIT".enum("Indicates that the access is a read via a uniform buffer or dynamic uniform buffer descriptor.", 0x00000008),
		"ACCESS_INPUT_ATTACHMENT_READ_BIT".enum("Indicates that the access is a read via an input attachment descriptor.", 0x00000010),
		"ACCESS_SHADER_READ_BIT".enum("Indicates that the access is a read from a shader via any other descriptor type.", 0x00000020),
		"ACCESS_SHADER_WRITE_BIT".enum(
			"Indicates that the access is a write or atomic from a shader via the same descriptor types as in #ACCESS_SHADER_READ_BIT.",
			0x00000040
		),
		"ACCESS_COLOR_ATTACHMENT_READ_BIT".enum("Indicates that the access is a read via a color attachment.", 0x00000080),
		"ACCESS_COLOR_ATTACHMENT_WRITE_BIT".enum("Indicates that the access is a write via a color or resolve attachment.", 0x00000100),
		"ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT".enum("Indicates that the access is a read via a depth/stencil attachment.", 0x00000200),
		"ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT".enum("Indicates that the access is a write via a depth/stencil attachment.", 0x00000400),
		"ACCESS_TRANSFER_READ_BIT".enum(
			"""
			Indicates that the access is a read from a transfer (copy, blit, resolve, etc.) operation. For the complete set of transfer operations, see
			#PIPELINE_STAGE_TRANSFER_BIT.
			""",
			0x00000800
		),
		"ACCESS_TRANSFER_WRITE_BIT".enum(
			"""
			Indicates that the access is a write from a transfer (copy, blit, resolve, etc.) operation. For the complete set of transfer operations, see
			#PIPELINE_STAGE_TRANSFER_BIT.
			""",
			0x00001000
		),
		"ACCESS_HOST_READ_BIT".enum("Indicates that the access is a read via the host.", 0x00002000),
		"ACCESS_HOST_WRITE_BIT".enum("Indicates that the access is a write via the host.", 0x00004000),
		"ACCESS_MEMORY_READ_BIT".enum(
			"""
			Indicates that the access is a read via a non-specific unit attached to the memory. This unit $may be external to the Vulkan device or otherwise not
			part of the core Vulkan pipeline. When included in {@code dstAccessMask}, all writes using access types in {@code srcAccessMask} performed by
			pipeline stages in {@code srcStageMask} $must be visible in memory.
			""",
			0x00008000
		),
		"ACCESS_MEMORY_WRITE_BIT".enum(
			"""
			Indicates that the access is a write via a non-specific unit attached to the memory. This unit $may be external to the Vulkan device or otherwise
			not part of the core Vulkan pipeline. When included in {@code srcAccessMask}, all access types in {@code dstAccessMask} from pipeline stages in
			{@code dstStageMask} will observe the side effects of commands that executed before the barrier. When included in {@code dstAccessMask} all writes
			using access types in {@code srcAccessMask} performed by pipeline stages in {@code srcStageMask} $must be visible in memory.
			""",
			0x00010000
		)
	)

	EnumConstant(
		"VkDependencyFlagBits",

		"DEPENDENCY_BY_REGION_BIT".enum("If set, then the dependency is by-region.", 0x00000001)
	)

	EnumConstant(
		"VkCommandPoolCreateFlagBits",

		"COMMAND_POOL_CREATE_TRANSIENT_BIT".enum(
			"""
			Indicates that command buffers allocated from the pool will be short-lived, meaning that they will be reset or freed in a relatively short
			timeframe. This flag $may be used by the implementation to control memory allocation behavior within the pool.
			""",
			0x00000001
		),
		"COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT".enum(
			"""
			Controls whether command buffers allocated from the pool $can be individually reset. If this flag is set, individual command buffers allocated from
			the pool $can be reset either explicitly, by calling #ResetCommandBuffer(), or implicitly, by calling #BeginCommandBuffer() on an executable
			command buffer. If this flag is not set, then #ResetCommandBuffer() and #BeginCommandBuffer() (on an executable command buffer) $must not be called
			on the command buffers allocated from the pool, and they $can only be reset in bulk by calling #ResetCommandPool().
			""",
			0x00000002
		)
	)

	val VkCommandPoolResetFlagBits = EnumConstant(
		"VkCommandPoolResetFlagBits",

		"COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT".enum(
			"If set, resetting a command pool recycles all of the resources from the command pool back to the system.",
			0x00000001
		)
	).javaDocLinks

	EnumConstant(
		"VkCommandBufferUsageFlagBits",

		"COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT".enum(
			"""
			Indicates that each recording of the command buffer will only be submitted once, and the command buffer will be reset and recorded again between
			each submission.
			""",
			0x00000001
		),
		"COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT".enum(
			"""
			Indicates that a secondary command buffer is considered to be entirely inside a render pass. If this is a primary command buffer, then this bit is
			ignored.
			""",
			0x00000002
		),
		"COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT".enum(
			"Allows the command buffer to be resubmitted to a queue or recorded into a primary command buffer while it is pending execution.",
			0x00000004
		)
	)

	EnumConstant(
		"VkQueryControlFlagBits",

		"QUERY_CONTROL_PRECISE_BIT".enum("If set, an implementation $must return a result that matches the actual number of samples passed.", 0x00000001)
	)

	val VkCommandBufferResetFlagBits = EnumConstant(
		"VkCommandBufferResetFlagBits",

		"COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT".enum(
			"""
			If set, then most or all memory resources currently owned by the command buffer $should be returned to the parent command pool. If this flag is not
			set, then the command buffer $may hold onto memory resources and reuse them when recording commands.
			""",
			0x00000001
		)
	).javaDocLinks

	val VkStencilFaceFlagBits = EnumConstant(
		"VkStencilFaceFlagBits",

		"STENCIL_FACE_FRONT_BIT".enum("Indicates that only the front set of stencil state is updated.", 0x00000001),
		"STENCIL_FACE_BACK_BIT".enum("Indicates that only the back set of stencil state is updated.", 0x00000002),
		"STENCIL_FRONT_AND_BACK".enum(
			"Is the combination of #STENCIL_FACE_FRONT_BIT and #STENCIL_FACE_BACK_BIT and indicates that both sets of stencil state are updated.",
			0x00000003
		)
	).javaDocLinks

	val CreateInstance = GlobalCommand..VkResult(
		"CreateInstance",
		"""
		Creates a new Vulkan instance.

		There is no global state in Vulkan and all per-application state is stored in a {@code VkInstance} object. Creating a {@code VkInstance} object
		initializes the Vulkan library and allows the application to pass information about itself to the implementation.

		{@code vkCreateInstance} creates the instance, then enables and initializes global layers and extensions requested by the application. If an extension
		is provided by a layer, both the layer and extension $must be specified at {@code vkCreateInstance} time.

		<h5>Valid Usage</h5>
		${ul(
			"{@code pCreateInfo} $must be a pointer to a valid ##VkInstanceCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pInstance} $must be a pointer to a {@code VkInstance} handle"
		)}
		""",

		const..VkInstanceCreateInfo_p.IN("pCreateInfo", "points to an instance of ##VkInstanceCreateInfo controlling creation of the instance"),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "controls host memory allocation"),
		Check(1)..VkInstance.p.OUT("pInstance", "a pointer to a {@code VkInstance} handle in which the resulting instance is returned")
	)

	void(
		"DestroyInstance",
		"""
		Destroys an instance of Vulkan.

		After destruction of the instance, all devices (logical and physical) and any objects created by those devices become invalid and $shouldnot be
		accessed. However, objects allocated directly or indirectly through the instance are not destroyed automatically and so $may be leaked. Applications
		$should destroy all objects created through instance before destroying the instance itself.

		<h5>Valid Usage</h5>
		${ul(
			"If {@code instance} is not $NULL, {@code instance} $must be a valid {@code VkInstance} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"All child objects created using {@code instance} $must have been destroyed prior to destroying {@code instance}",
			"If ##VkAllocationCallbacks were provided when instance was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when instance was created, {@code pAllocator} $must be $NULL"
		)}

		Host access to {@code instance} $must be externally synchronized.
		""",

		VkInstance.IN("instance", "the handle of the instance to destroy"),
		CreateInstance["pAllocator"]
	)

	separateMethod {

	VkResult(
		"EnumeratePhysicalDevices",
		"""
		Retrieves a list of physical device objects representing the physical devices installed in the system.

		If {@code pPhysicalDevices} is $NULL, then the number of physical devices available is returned in {@code pPhysicalDeviceCount}. Otherwise,
		{@code pPhysicalDeviceCount} $must point to a variable set by the user to the number of elements in the {@code pPhysicalDevices} array, and on return
		the variable is overwritten with the number of structures actually written to {@code pPhysicalDevices}. If the value of {@code pPhysicalDeviceCount} is
		less than the number of physical devices available, at most {@code pPhysicalDeviceCount} structures will be written. If {@code pPhysicalDeviceCount} is
		smaller than the number of physical devices available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available
		physical devices were returned.

		Once enumerated, general properties of the physical devices are queried by calling #GetPhysicalDeviceProperties().

		<h5>Valid Usage</h5>
		${ul(
			"instance $must be a valid {@code VkInstance} handle",
			"{@code pPhysicalDeviceCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPhysicalDeviceCount} is not 0, and {@code pPhysicalDevices is} not $NULL, {@code pPhysicalDevices} $must be a
			pointer to an array of {@code pPhysicalDeviceCount} {@code VkPhysicalDevice} handles.
			"""
		)}
		""",

		VkInstance.IN("instance", "a handle to a Vulkan instance previously created with #CreateInstance()"),
		AutoSize("pPhysicalDevices")..Check(1)..uint32_t_p.INOUT(
			"pPhysicalDeviceCount",
			"a pointer to an integer related to the number of physical devices available or queried"
		),
		nullable..VkPhysicalDevice.p.OUT("pPhysicalDevices", "either $NULL or a pointer to an array of {@code VkPhysicalDevice} structures")
	)

	void(
		"GetPhysicalDeviceFeatures",
		"""
		Reports capabilities of a physical device.

		<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pProperties} $must be a pointer to a ##VkPhysicalDeviceProperties structure"
		)}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the handle to the physical device whose properties will be queried"),
		VkPhysicalDeviceFeatures_p.OUT(
			"pFeatures",
			"points to an instance of the ##VkPhysicalDeviceProperties structure, that will be filled with returned information"
		)
	)

	void(
		"GetPhysicalDeviceFormatProperties",
		"""
		Lists physical device’s format capabilities.

		<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code pFormatProperties} $must be a pointer to a ##VkFormatProperties structure"
		)}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the format properties"),
		VkFormat.IN("format", "the format whose properties are queried"),
		VkFormatProperties_p.OUT(
			"pFormatProperties",
			"a pointer to a ##VkFormatProperties structure in which physical device properties for format are returned"
		)
	)

	VkResult(
		"GetPhysicalDeviceImageFormatProperties",
		"""
		Lists physical device's image format capabilities.

		In addition to the minimum capabilities, implementations $may support additional capabilities for certain types of images. For example, larger
		dimensions or additional sample counts for certain image types, or additional capabilities for linear tiling format images.

		The {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} parameters correspond to parameters that would be consumed by
		#CreateImage().

		<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code type} $must be a valid {@code VkImageType} value",
			"{@code tiling} $must be a valid {@code VkImageTiling} value",
			"{@code usage} $must be a valid combination of {@code VkImageUsageFlagBits} values",
			"{@code usage} $must not be 0",
			"{@code flags} $must be a valid combination of {@code VkImageCreateFlagBits} values",
			"{@code pImageFormatProperties} $must be a pointer to a ##VkImageFormatProperties structure"
		)}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the image capabilities"),
		VkFormat.IN("format", "the image format, corresponding to {@code VkImageCreateInfo.format}"),
		VkImageType.IN("type", "the image type, corresponding to {@code VkImageCreateInfo.imageType}", VkImageTypes),
		VkImageTiling.IN("tiling", " the image tiling, corresponding to {@code VkImageCreateInfo.tiling}", VkImageTilings),
		VkImageUsageFlags.IN(
			"usage",
			"the intended usage of the image, corresponding to {@code VkImageCreateInfo.usage}",
			VkImageUsageFlagBits, LinkMode.BITFIELD
		),
		VkImageCreateFlags.IN(
			"flags",
			"a bitfield describing additional parameters of the image, corresponding to {@code VkImageCreateInfo.flags}",
			VkImageCreateFlagBits, LinkMode.BITFIELD
		),
		VkImageFormatProperties_p.OUT(
			"pImageFormatProperties",
			"points to an instance of the ##VkImageFormatProperties structure in which capabilities are returned"
		)
	)

	void(
		"GetPhysicalDeviceProperties",
		"""
		Returns properties of a physical device.

		<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} must be a valid {@code VkPhysicalDevice} handle",
			"{@code pProperties} must be a pointer to a ##VkPhysicalDeviceProperties structure"
		)}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the handle to the physical device whose properties will be queried"),
		VkPhysicalDeviceProperties_p.OUT(
			"pProperties",
			"points to an instance of the ##VkPhysicalDeviceProperties structure, that will be filled with returned information"
		)
	)

	void(
		"GetPhysicalDeviceQueueFamilyProperties",
		"""
		Reports properties of the queues of the specified physical device.

		If {@code pQueueFamilyProperties} is $NULL, then the number of queue families available is returned in {@code pQueueFamilyPropertyCount}. Otherwise,
		{@code pQueueFamilyPropertyCount} $must point to a variable set by the user to the number of elements in the {@code pQueueFamilyProperties} array, and
		on return the variable is overwritten with the number of structures actually written to {@code pQueueFamilyProperties}. If the value of
		{@code pQueueFamilyPropertyCount} is less than the number of queue families available, at most {@code pQueueFamilyPropertyCount} structures will be
		written.

		<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pQueueFamilyPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not $NULL,
			{@code pQueueFamilyProperties} $must be a pointer to an array of {@code pQueueFamilyPropertyCount} ##VkQueueFamilyProperties structures"""
		)}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the handle to the physical device whose properties will be queried"),
		AutoSize("pQueueFamilyProperties")..Check(1)..uint32_t_p.INOUT(
			"pQueueFamilyPropertyCount",
			"a pointer to an integer related to the number of queue families available or queried"
		),
		nullable..VkQueueFamilyProperties_p.OUT("pQueueFamilyProperties", "either $NULL or a pointer to an array of ##VkQueueFamilyProperties structures")
	)

	void(
		"GetPhysicalDeviceMemoryProperties",
		"""
		Reports memory information for the specified physical device.

		<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pMemoryProperties} $must be a pointer to a ##VkPhysicalDeviceMemoryProperties structure"
		)}
		""",

		VkPhysicalDevice.IN("physicalDevice", "the handle to the device to query"),
		VkPhysicalDeviceMemoryProperties_p.OUT(
			"pMemoryProperties",
			"points to an instance of ##VkPhysicalDeviceMemoryProperties structure in which the properties are returned"
		)
	)

	PFN_vkVoidFunction(
		"GetInstanceProcAddr",
		"""
		Returns a function pointer for a command.

		<h5>Valid Usage</h5>
		${ul(
			"If {@code instance} is not $NULL, instance $must be a valid {@code VkInstance} handle",
			"{@code pName} $must be a null-terminated string",
			"""
			If {@code instance} is $NULL, {@code pName} $must be one of:
			${ul(
				"vkEnumerateInstanceExtensionProperties",
				"vkEnumerateInstanceLayerProperties",
				"vkCreateInstance"
			)}
			""",
			"""
			If {@code instance} is not $NULL, {@code pName} $must be the name of a core command or a command from an enabled extension, other than:
			${ul(
				"vkEnumerateInstanceExtensionProperties",
				"vkEnumerateInstanceLayerProperties",
				"vkCreateInstance"
			)}
			"""
		)}

		${note(
			"""
			LWJGL requires a non-$NULL {@code instance} argument when calling this method. If $NULL must be used, do the following:
			${codeBlock("""
long GetInstanceProcAddr = VK.getFunctionProvider().getFunctionAddress("vkGetInstanceProcAddr");
long command = JNI.callPPP(GetInstanceProcAddr, NULL, pName);""")}
			""",
			title = "LWJGL Note"
		)}
		""",

		VkInstance.IN("instance", " the instance that the function pointer will be compatible with"),
		const..charASCII_p.IN("pName", "the name of the command to obtain")
	)

	PFN_vkVoidFunction(
		"GetDeviceProcAddr",
		"""
		Returns a device-specific function pointer for a command.

		In order to support systems with multiple Vulkan implementations comprising heterogeneous collections of hardware and software, the function pointers
		returned by #GetInstanceProcAddr() $may point to dispatch code, which calls a different real implementation for different {@code VkDevice} objects (and
		objects created from them). The overhead of this internal dispatch $can be avoided by obtaining device-specific function pointers for any commands that
		use a device or device-child object as their dispatchable object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pName} $must be a null-terminated string",
			"""
			{@code pName} $must be the name of a supported command that has a first parameter of type {@code VkDevice}, {@code VkQueue} or
			{@code VkCommandBuffer}, either in the core API or an enabled extension
			"""
		)}

		${note(
			"""
			The function pointers used by LWJGL for commands that have a first parameter of type ##VkDevice, ##VkQueue or ##VkCommandBuffer, have been acquired
			using this command.
			""",
			title = "LWJGL Note"
		)}
		""",

		VkDevice.IN("device", "the logical device that provides the function pointer"),
		const..charASCII_p.IN(
			"pName",
			"""
			the name of any Vulkan command whose first parameter is one of
			${ul(
				"##VkDevice",
				"##VkQueue",
				"##VkCommandBuffer"
			)}
			If {@code pName} is not the name of one of these Vulkan commands, and is not the name of an extension command belonging to an extension enabled for
			device, then {@code vkGetDeviceProcAddr} will return $NULL.
			"""
		)
	)

	VkResult(
		"CreateDevice",
		"""
		Creates a new logical device instance.

		<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkDeviceCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pDevice} $must be a pointer to a {@code VkDevice} handle"
		)}
		""",

		VkPhysicalDevice.IN("physicalDevice", "$must be one of the device handles returned from a call to #EnumeratePhysicalDevices()"),
		const..VkDeviceCreateInfo_p.IN("pCreateInfo", "a pointer to a ##VkDeviceCreateInfo structure containing information about how to create the device"),
		CreateInstance["pAllocator"],
		Check(1)..VkDevice.p.OUT("pDevice", "points to a handle in which the created {@code VkDevice} is returned")
	)

	void(
		"DestroyDevice",
		"""
		Destroys a logical device.

		To ensure that no work is active on the device, #DeviceWaitIdle() $can be used to gate the destruction of the device. Prior to destroying a device, an
		application is responsible for destroying/freeing any Vulkan objects that were created using that device as the first parameter of the corresponding
		{@code vkCreate*} or {@code vkAllocate*} command.

		${note(
			"""
			The lifetime of each of these objects is bound by the lifetime of the {@code VkDevice} object. Therefore, to avoid resource leaks, it is critical
			that an application explicitly free all of these resources prior to calling {@code vkDestroyDevice}.
			"""
		)}

		<h5>Valid Usage</h5>
		${ul(
			"If {@code device} is not $NULL, {@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"All child objects created on device $must have been destroyed prior to destroying device",
			"If {@code VkAllocationCallbacks} were provided when device was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when device was created, {@code pAllocator} $must be $NULL"
		)}

		Host access to {@code device} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device to destroy"),
		CreateInstance["pAllocator"]
	)

	GlobalCommand..VkResult(
		"EnumerateInstanceExtensionProperties",
		"""
		Queries the available instance extensions.

		Extensions $may define new Vulkan commands, structures, and enumerants. For compilation purposes, the interfaces defined by registered extensions,
		including new structures and enumerants as well as function pointer types for new commands, are defined in the Khronos-supplied vulkan.h together with
		the core API. However, commands defined by extensions may not be available for static linking - in which case function pointers to these commands
		should be queried at runtime. Extensions $may be provided by layers as well as by a Vulkan implementation.

		If {@code pProperties} is $NULL, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise,
		{@code pPropertyCount} $must point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
		is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of
		extension properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of
		extensions available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available properties were returned.

		<h5>Valid Usage</h5>
		${ul(
			"If {@code pLayerName} is not $NULL, {@code pLayerName} $must be a null-terminated string",
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkExtensionProperties structures
			""",
			"If {@code pLayerName} is not $NULL, it $must be the name of an instance layer returned by #EnumerateInstanceLayerProperties()"
		)}

		Any instance extensions provided by the Vulkan implementation or by implicitly enabled layers, but not by explicitly enabled layers, are returned when
		{@code pLayerName} parameter is $NULL. When {@code pLayerName} is the name of a layer, the instance extensions provided by that layer are returned.

		To enable an instance extension, the name of the extension should be added to the {@code ppEnabledExtensionNames} member of ##VkInstanceCreateInfo when
		creating a {@code VkInstance}.
		""",

		nullable..const..charUTF8_p.IN("pLayerName", "either $NULL or the name of a instance layer to retrieve extensions from"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"a pointer to an integer related to the number of extension properties available or queried"
		),
		nullable..VkExtensionProperties_p.OUT("pProperties", "either $NULL or a pointer to an array of ##VkExtensionProperties structures")
	)

	VkResult(
		"EnumerateDeviceExtensionProperties",
		"""
		Queries the extensions available to a given physical device.

		If {@code pProperties} is $NULL, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise,
		{@code pPropertyCount} $must point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
		is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of
		extension properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of
		extensions available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available properties were returned.

		<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"If {@code pLayerName} is not $NULL, {@code pLayerName} $must be a null-terminated string",
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkExtensionProperties structures
			""",
			"If {@code pLayerName} is not $NULL, it $must be the name of a device layer returned by #EnumerateDeviceLayerProperties()"
		)}

		Any device extensions provided by the Vulkan implementation or by implicitly enabled layers, but not by explicitly enabled layers, are returned when
		{@code pLayerName} parameter is $NULL. When {@code pLayerName} is the name of a layer, the device extensions provided by that layer are returned.

		To enable a device layer, the name of the layer should be added to the {@code ppEnabledExtensionNames} member of ##VkDeviceCreateInfo when creating a
		{@code VkDevice}.
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device that will be queried"),
		nullable..const..charUTF8_p.IN("pLayerName", "either $NULL or the name of a device layer to retrieve extensions from"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"a pointer to an integer related to the number of extension properties available or queried"
		),
		nullable..VkExtensionProperties_p.OUT("pProperties", "either $NULL or a pointer to an array of ##VkExtensionProperties structures")
	)

	GlobalCommand..VkResult(
		"EnumerateInstanceLayerProperties",
		"""
		Queries the available instance layers.

		If {@code pProperties} is $NULL, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount}
		$must point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with
		the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of layer properties
		available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available,
		#INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available layer properties were returned.

		<h5>Valid Usage</h5>
		${ul(
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkLayerProperties structures
			"""
		)}

		To enable a instance layer, the name of the layer should be added to the {@code ppEnabledLayerNames} member of ##VkInstanceCreateInfo when creating a
		{@code VkInstance}.

		When a layer is enabled, it inserts itself into the call chain for Vulkan commands the layer is interested in. A common use of layers is to validate
		application behavior during development. For example, the implementation will not check that Vulkan enums used by the application fall within allowed
		ranges. Instead, a validation layer would do those checks and flag issues. This avoids a performance penalty during production use of the application
		because those layers would not be enabled in production.
		""",

		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"a pointer to an integer related to the number of layer properties available or queried"
		),
		nullable..VkLayerProperties_p.OUT("pProperties", "either $NULL or a pointer to an array of ##VkLayerProperties structures")
	)

	VkResult(
		"EnumerateDeviceLayerProperties",
		"""
		Queries the available device layers.

		If {@code pProperties} is $NULL, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount}
		$must point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with
		the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of layer properties
		available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available,
		#INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available layer properties were returned.

		<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} must be a valid ##VkPhysicalDevice handle",
			"{@code pPropertyCount} must be a pointer to a {@code uint32_t} value",
			"If {@code pProperties} is not $NULL, {@code pProperties} must be a pointer to an array of {@code pPropertyCount} ##VkLayerProperties structures",
			"If {@code pProperties} is not $NULL, the value referenced by {@code pPropertyCount} must be greater than 0"
		)}

		To enable a device layer, the name of the layer should be added to the {@code ppEnabledLayerNames} member of ##VkDeviceCreateInfo when creating a
		{@code VkDevice}.

		Loader implementations may provide mechanisms outside the Vulkan API for enabling specific layers. Layers enabled through such a mechanism are
		implicitly enabled, while layers enabled by including the layer name in the {@code ppEnabledLayerNames} member of ##VkDeviceCreateInfo are explicitly
		enabled. Except where otherwise specified, implicitly enabled and explicitly enabled layers differ only in the way they are enabled. Explicitly
		enabling a layer that is implicitly enabled has no additional effect.
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device that will be queried"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"a pointer to an integer related to the number of layer properties available or queried"
		),
		nullable..VkLayerProperties_p.OUT("pProperties", "either $NULL or a pointer to an array of VkLayerProperties structures")
	)

	void(
		"GetDeviceQueue",
		"""
		Retrieves a handle to a {@code VkQueue} object.

		The queue family index is used in multiple places in Vulkan in order to tie operations to a specific family of queues.

		When retrieving a handle to the queue via {@code vkGetDeviceQueue}, the queue family index is used to select which queue family to retrieve the
		{@code VkQueue} handle from.

		When creating a {@code VkCommandPool} object (see Command Pools), a queue family index is specified in the ##VkCommandPoolCreateInfo structure. Command
		buffers from this pool can only be submitted on queues corresponding to this queue family.

		When creating {@code VkImage} and {@code VkBuffer} resources, a set of queue families is included in the ##VkImageCreateInfo and ##VkBufferCreateInfo
		structures to specify the queue families that can access the resource.

		When inserting a ##VkBufferMemoryBarrier or ##VkImageMemoryBarrier a source and destination queue family index is specified to allow the ownership of a
		buffer or image to be transferred from one queue family to another.

		Each queue is assigned a priority, as set in the ##VkDeviceQueueCreateInfo structures when creating the device. The priority of each queue is a
		normalized floating point value between 0.0 and 1.0, which is then translated to a discrete priority level by the implementation. Higher values
		indicate a higher priority, with 0.0 being the lowest priority and 1.0 being the highest.

		Within the same device, queues with higher priority $may be allotted more processing time than queues with lower priority. The implementation makes no
		guarantees with regards to ordering or scheduling among queues with the same priority, other than the constraints defined by explicit scheduling
		primitives. The implementation make no guarantees with regards to queues across different devices.

		An implementation $may allow a higher-priority queue to starve a lower-priority queue on the same {@code VkDevice} until the higher-priority queue has
		no further commands to execute. The relationship of queue priorities $mustnot cause queues on one {@code VkDevice} to starve queues on another
		{@code VkDevice}.

		No specific guarantees are made about higher priority queues receiving more processing time or better quality of service than lower priority queues.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pQueue} $must be a pointer to a {@code VkQueue} handle",
			"{@code queueFamilyIndex} $must be one of the queue family indices specified when device was created, via the ##VkDeviceQueueCreateInfo structure",
			"""
			{@code queueIndex} $must be less than the number of queues created for the specified queue family index when device was created, via the
			{@code queueCount} member of the {@code VkDeviceQueueCreateInfo} structure
			"""
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the queue"),
		uint32_t.IN("queueFamilyIndex", "the index of the queue family to which the queue belongs"),
		uint32_t.IN("queueIndex", "the index within this queue family of the queue to retrieve"),
		Check(1)..VkQueue.p.OUT("pQueue", "a pointer to a {@code VkQueue} object that will be filled with the handle for the requested queue")
	)

	VkResult(
		"QueueSubmit",
		"""
		Submits a sequence of semaphores or command buffers to a queue.

		Each call to {@code vkQueueSubmit} submits zero or more batches of work to the queue for execution. {@code submitCount} is used to specify the number
		of batches to submit. Each batch includes zero or more semaphores to wait upon, and a corresponding set of stages that will wait for the semaphore to
		be signalled before executing any work, followed by a number of command buffers that will be executed, and finally, zero or more semaphores that will
		be signaled after command buffer execution completes. Each batch is represented as an instance of the ##VkSubmitInfo structure stored in an array, the
		address of which is passed in {@code pSubmitInfo}.

		${note(
			"""
			The exact definition of a submission is platform-specific, but is considered a relatively expensive operation. In general, applications should
			attempt to batch work together into as few calls to {@code vkQueueSubmit} as possible.
			"""
		)}

		<h5>Valid Usage</h5>
		${ul(
			"{@code queue} $must be a valid {@code VkQueue} handle",
			"If {@code submitCount} is not 0, {@code pSubmits} $must be a pointer to an array of {@code submitCount} valid ##VkSubmitInfo structures",
			"If {@code fence} is not #NULL_HANDLE, {@code fence} $must be a valid {@code VkFence} handle",
			"Each of {@code queue} and {@code fence} that are valid handles $must have been created, allocated or retrieved from the same {@code VkDevice}",
			"{@code fence} $must be unsignalled",
			"{@code fence} $mustnot be associated with any other queue command that has not yet completed execution on that queue"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code queue} $must be externally synchronized",
			"Host access to {@code pSubmits[].pWaitSemaphores[]} $must be externally synchronized",
			"Host access to {@code pSubmits[].pSignalSemaphores[]} $must be externally synchronized",
			"Host access to {@code fence} $must be externally synchronized"
		)}
		""",

		VkQueue.IN("queue", "the handle of the queue that the command buffers will be submitted to"),
		AutoSize("pSubmits")..uint32_t.IN("submitCount", "the number of elements in the {@code pSubmits} array"),
		SingleValue("pSubmit")..nullable..const..VkSubmitInfo_p.IN(
			"pSubmits",
			"""
			a pointer to an array of ##VkSubmitInfo structures which describe the work to submit. All work described by {@code pSubmits} $must be submitted to
			the queue before the command returns.
			"""
		),
		VkFence.IN(
			"fence",
			"""
			an optional handle to a fence. If {@code fence} is not #NULL_HANDLE, the fence is signaled when execution of all
			{@code VkSubmitInfo::pCommandBuffers} members of {@code pSubmits} is completed. If {@code submitCount} is zero but fence is not #NULL_HANDLE, the
			fence will still be submitted to the queue and will become signaled when all work previously submitted to the queue has completed.
			"""
		)
	)

	VkResult(
		"QueueWaitIdle",
		"""
		Waits on the completion of all work within a single queue.

		{@code vkQueueWaitIdle} will block until all command buffers and sparse binding operations in the queue have completed.

		<h5>Valid Usage</h5>
		${ul(
			"{@code queue} $must be a valid {@code VkQueue} handle"
		)}
		""",

		VkQueue.IN("queue", "the queue on which to wait")
	)

	VkResult(
		"DeviceWaitIdle",
		"""
		Waits for a device to become idle.

		A device is active while any of its queues have work to process. Once all device queues are idle, the device is idle.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle"
		)}

		<h5>Host Synchronization</h5>

		Host access to all {@code VkQueue} objects created from device $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device to idle")
	)

	VkResult(
		"AllocateMemory",
		"""
		Allocates device memory.

		Allocations returned by {@code vkAllocateMemory} are guaranteed to meet any alignment requirement by the implementation. For example, if an
		implementation requires 128 byte alignment for images and 64 byte alignment for buffers, the device memory returned through this mechanism would be
		128-byte aligned. This ensures that applications can correctly suballocate objects of different types (with potentially different alignment
		requirements) in the same memory object.

		When memory is allocated, its contents are undefined.

		There is an implementation-dependent maximum number of memory allocations which can be simultaneously created on a device. This is specified by the
		{@code maxMemoryAllocationCount} member of the ##VkPhysicalDeviceLimits structure. If {@code maxMemoryAllocationCount} is exceeded,
		{@code vkAllocateMemory} will return #ERROR_TOO_MANY_OBJECTS.

		${note(
			"""
			Some platforms may have a limit on the maximum size of a single allocation. For example, certain systems may fail to create allocations with a size
			greater than or equal to 4GB. Such a limit is implementation-dependent, and if such a failure occurs then the error #ERROR_OUT_OF_DEVICE_MEMORY
			should be returned.
			"""
		)}

		<h3>Valid Usage</h3>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pAllocateInfo} $must be a pointer to a valid ##VkMemoryAllocateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pMemory} $must be a pointer to a {@code VkDeviceMemory} handle",
			"The number of currently valid memory objects, allocated from device, $must be less than ##VkPhysicalDeviceLimits{@code ::maxMemoryAllocationCount}"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the memory"),
		const..VkMemoryAllocateInfo_p.IN(
			"pAllocateInfo",
			"""
			a pointer to a structure of type ##VkMemoryAllocateInfo, which contains parameters of the allocation. A successful returned allocation must use the
			requested parameters — no substitution is permitted by the implementation.
			"""
		),
		CreateInstance["pAllocator"],
		Check(1)..VkDeviceMemory.p.OUT("pMemory", "a pointer to a {@code VkDeviceMemory} structure in which information about the allocated memory is returned")
	)

	void(
		"FreeMemory",
		"""
		Frees a memory object.

		Before freeing a memory object, an application $must ensure the memory object is no longer in use by the device — for example by command buffers queued
		for execution. The memory $can remain bound to images or buffers at the time the memory object is freed, but any further use of them (on host or
		device) for anything other than destroying those objects will result in undefined behavior. If there are still any bound images or buffers, the memory
		$may not be immediately released by the implementation, but $must be released by the time all bound images and buffers have been destroyed. Once memory
		is released, it is returned to the heap from which it was allocated.

		If a memory object is mapped at the time it is freed, it is implicitly unmapped.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code memory} is not #NULL_HANDLE, {@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"If {@code pAllocator is} not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code memory} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code memory} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to {@code memory} (via images or buffers) $must have completed execution"
		)}

		<h5>Host Synchronization</h5>

		Host access to memory $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the memory"),
		VkDeviceMemory.IN("memory", "the {@code VkDeviceMemory} object to be freed"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"MapMemory",
		"""
		Retrieves a host virtual address pointer to a region of a mappable memory object.

		Memory objects created with #AllocateMemory() are not directly host accessible. Memory objects created with the memory property
		#MEMORY_PROPERTY_HOST_VISIBLE_BIT are considered mappable. Memory objects must be mappable in order to be successfully mapped on the host.

		It is an application error to call {@code vkMapMemory} on a memory object that is already mapped.

		{@code vkMapMemory} does not check whether the device memory is currently in use before returning the host-accessible pointer. The application $must
		guarantee that any previously submitted command that writes to this range has completed before the host reads from or writes to that range, and that
		any previously submitted command that reads from that range has completed before the host writes to that region. If the device memory was allocated
		without the #MEMORY_PROPERTY_HOST_COHERENT_BIT set, these guarantees $must be made for an extended range: the application $must round down the start of
		the range to the nearest multiple of ##VkPhysicalDeviceLimits{@code ::nonCoherentAtomSize}, and round the end of the range up to the nearest multiple
		of {@code VkPhysicalDeviceLimits::nonCoherentAtomSize}.

		While a range of device memory is mapped for host access, the application is responsible for synchronizing both device and host access to that memory
		range.

		Host-visible memory types that advertise the #MEMORY_PROPERTY_HOST_COHERENT_BIT property still require memory barriers between host and device in order
		to be coherent, but do not require additional cache management operations (#FlushMappedMemoryRanges() or #InvalidateMappedMemoryRanges()) to achieve
		coherency. For host writes to be seen by subsequent command buffer operations, a pipeline barrier from a source of #ACCESS_HOST_WRITE_BIT and
		#PIPELINE_STAGE_HOST_BIT to a destination of the relevant device pipeline stages and access types $must be performed. Note that such a barrier is
		performed implicitly upon each command buffer submission, so an explicit barrier is only rarely needed (e.g. if a command buffer waits upon an event
		signaled by the host, where the host wrote some data after submission). For device writes to be seen by subsequent host reads, a pipeline barrier is
		required to make the writes visible.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code flags} $must be 0",
			"{@code ppData} $must be a pointer to a pointer",
			"{@code memory} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code memory} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"{@code memory} $mustnot currently be mapped",
			"{@code offset} $must be less than the size of memory",
			"{@code size} $must be greater than 0",
			"If {@code size} is not equal to #WHOLE_SIZE, {@code size} $must be less than or equal to the size of the memory minus offset",
			"{@code memory} $must have been created with a memory type that reports #MEMORY_PROPERTY_HOST_VISIBLE_BIT"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code memory} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the memory"),
		VkDeviceMemory.IN("memory", "the {@code VkDeviceMemory} object to be mapped"),
		VkDeviceSize.IN("offset", "a zero-based byte offset from the beginning of the memory object"),
		VkDeviceSize.IN("size", "he size of the memory range to map, or #WHOLE_SIZE to map from offset to the end of the allocation"),
		VkMemoryMapFlags.IN("flags", "reserved for future use, and $must be zero"),
		Check(1)..void_pp.OUT(
			"ppData",
			"""
			points to a pointer in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus offset must be aligned
			to at least ##VkPhysicalDeviceLimits{@code ::minMemoryMapAlignment}.
			"""
		)
	)

	void(
		"UnmapMemory",
		"""
		Unmaps a previously mapped memory object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code memory} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code memory} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"{@code memory} $must currently be mapped"
		)}

		<h5>Host Synchronization</h5>

		Host access to memory $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the memory"),
		VkDeviceMemory.IN("memory", "the memory object to be unmapped")
	)

	VkResult(
		"FlushMappedMemoryRanges",
		"""
		Flushes mapped memory ranges.

		{@code vkFlushMappedMemoryRanges} $must be called after the host writes to non-coherent memory have completed and before command buffers that will read
		or write any of those memory locations are submitted to a queue.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pMemoryRanges} $must be a pointer to an array of {@code memoryRangeCount} valid ##VkMappedMemoryRange structures",
			"The value of {@code memoryRangeCount} $must be greater than 0"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the memory ranges"),
		AutoSize("pMemoryRanges")..uint32_t.IN("memoryRangeCount", "the length of the {@code pMemoryRanges} array"),
		SingleValue("pMemoryRange")..const..VkMappedMemoryRange_p.IN(
			"pMemoryRanges",
			"a pointer to an array of ##VkMappedMemoryRange structures describing the memory ranges to flush"
		)
	)

	VkResult(
		"InvalidateMappedMemoryRanges",
		"""
		Invalidates ranges of mapped memory objects.

		{@code vkInvalidateMappedMemoryRanges} $must be called after command buffers that execute and flush (via memory barriers) the device writes have
		completed, and before the host will read or write any of those locations.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pMemoryRanges} $must be a pointer to an array of {@code memoryRangeCount} valid ##VkMappedMemoryRange structures",
			"The value of {@code memoryRangeCount} $must be greater than 0"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the memory ranges"),
		AutoSize("pMemoryRanges")..uint32_t.IN("memoryRangeCount", "the length of the {@code pMemoryRanges} array"),
		SingleValue("pMemoryRange")..const..VkMappedMemoryRange_p.IN(
			"pMemoryRanges",
			"a pointer to an array of ##VkMappedMemoryRange structures describing the memory ranges to invalidate"
		)
	)

	void(
		"GetDeviceMemoryCommitment",
		"""
		Determines the amount of lazily-allocated memory that is currently committed for a memory object.

		If the memory object is allocated from a heap with the #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT bit set, that object’s backing memory may be provided by
		the implementation lazily. The actual committed size of the memory may initially be as small as zero (or as large as the requested size), and
		monotonically increases as additional memory is needed.

		A memory type with this flag set is only allowed to be bound to a {@code VkImage} whose usage flags include #IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT.

		${note(
			"""
			Using lazily allocated memory objects for framebuffer attachments that are not needed once a render pass instance has completed may allow some
			implementations to never allocate memory for such attachments.
			"""
		)}

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code pCommittedMemoryInBytes} $must be a pointer to a {@code VkDeviceSize} value",
			"{@code memory} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code memory} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"{@code memory} $must have been created with a memory type that reports #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT"
		)}

		The implementation $may update the commitment at any time, and the value returned by this query $may be out of date.

		The implementation guarantees to allocate any committed memory from the {@code heapIndex} indicated by the memory type that the memory object was
		created with.
		""",

		VkDevice.IN("device", "the logical device that owns the memory"),
		VkDeviceMemory.IN("memory", "the memory object being queried"),
		Check(1)..VkDeviceSize_p.OUT(
			"pCommittedMemoryInBytes",
			"a pointer to a {@code VkDeviceSize} value in which the number of bytes currently committed is returned, on success"
		)
	)

	VkResult(
		"BindBufferMemory",
		"""
		Attaches memory to a buffer object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code buffer} $must have been created, allocated or retrieved from {@code device}",
			"{@code memory} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device}, {@code buffer} and {@code memory} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"{@code buffer} $mustnot already be backed by a memory object",
			"{@code buffer} $mustnot have been created with any sparse memory binding flags",
			"{@code memoryOffset} $must be less than the size of memory",
			"""
			If {@code buffer} was created with the #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT or #BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT, {@code memoryOffset} $must
			be a multiple of the value of ##VkPhysicalDeviceLimits{@code ::minTexelBufferOffsetAlignment}
			""",
			"""
			If {@code buffer} was created with the #BUFFER_USAGE_UNIFORM_BUFFER_BIT, {@code memoryOffset} $must be a multiple of the value of
			##VkPhysicalDeviceLimits{@code ::minUniformBufferOffsetAlignment}
			""",
			"""
			If {@code buffer} was created with the #BUFFER_USAGE_STORAGE_BUFFER_BIT, {@code memoryOffset} $must be a multiple of the value of
			##VkPhysicalDeviceLimits{@code ::minStorageBufferOffsetAlignment}
			""",
			"""
			{@code memory} $must have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the ##VkMemoryRequirements
			structure returned from a call to #GetBufferMemoryRequirements() with {@code buffer}
			""",
			"The size of {@code buffer} $must be less than or equal to the size of {@code memory} minus {@code memoryOffset}",
			"""
			{@code memoryOffset} $must be an integer multiple of the alignment member of the ##VkMemoryRequirements structure returned from a call to
			#GetBufferMemoryRequirements() with {@code buffer}
			"""
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code buffer} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the buffer and memory"),
		VkBuffer.IN("buffer", "the buffer"),
		VkDeviceMemory.IN("memory", "a {@code VkDeviceMemory} object describing the device memory to attach"),
		VkDeviceSize.IN(
			"memoryOffset",
			"""
			the start offset of the region of {@code memory} which is to be bound to the buffer. The number of bytes returned in the
			##VkMemoryRequirements{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified buffer.
			"""
		)
	)

	VkResult(
		"BindImageMemory",
		"""
		Attaches memory to an image object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code image} $must have been created, allocated or retrieved from {@code device}",
			"{@code memory} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device}, {@code image} and {@code memory} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"{@code image} $mustnot already be backed by a memory object",
			"{@code image} $mustnot have been created with any sparse memory binding flags",
			"{@code memoryOffset} $must be less than the size of memory",
			"""
			{@code memory} $must have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the ##VkMemoryRequirements
			structure returned from a call to #GetImageMemoryRequirements() with {@code image}
			""",
			"""
			{@code memoryOffset} $must be an integer multiple of the alignment member of the ##VkMemoryRequirements structure returned from a call to
			#GetImageMemoryRequirements() with {@code image}
			""",
			"""
			The {@code size} member of the ##VkMemoryRequirements structure returned from a call to #GetImageMemoryRequirements() with {@code image} $must be
			less than or equal to the size of {@code memory} minus {@code memoryOffset}
			"""
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code image} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the image and memory"),
		VkImage.IN("image", "the image"),
		VkDeviceMemory.IN("memory", "a {@code VkDeviceMemory} object describing the device memory to attach"),
		VkDeviceSize.IN(
			"memoryOffset",
			"""
			the start offset of the region of {@code memory} which is to be bound to the image. The number of bytes returned in the
			##VkMemoryRequirements{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified image.
			"""
		)
	)

	void(
		"GetBufferMemoryRequirements",
		"""
		Determines the memory requirements for a non-sparse buffer resource.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code pMemoryRequirements} $must be a pointer to a ##VkMemoryRequirements structure",
			"{@code buffer} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code buffer} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the buffer"),
		VkBuffer.IN("buffer", "the buffer to query"),
		VkMemoryRequirements_p.OUT(
			"pMemoryRequirements",
			"points to an instance of the ##VkMemoryRequirements structure in which the memory requirements of the buffer object are returned")
	)

	void(
		"GetImageMemoryRequirements",
		"""
		Determines the memory requirements for a non-sparse image resource.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code pMemoryRequirements} $must be a pointer to a ##VkMemoryRequirements structure",
			"{@code image} must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code image} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the image"),
		VkImage.IN("image", "the image to query"),
		VkMemoryRequirements_p.OUT(
			"pMemoryRequirements",
			"points to an instance of the ##VkMemoryRequirements structure in which the memory requirements of the image object are returned"
		)
	)

	void(
		"GetImageSparseMemoryRequirements",
		"""
		Query sparse memory requirements for an image.

		If {@code pSparseMemoryRequirements} is $NULL, then the number of sparse memory requirements available is returned in
		{@code pSparseMemoryRequirementCount}. Otherwise, {@code pSparseMemoryRequirementCount} $must point to a variable set by the user to the number of
		elements in the {@code pSparseMemoryRequirements} array, and on return the variable is overwritten with the number of structures actually written to
		{@code pSparseMemoryRequirements}. If the value of {@code pSparseMemoryRequirementCount} is less than the number of sparse memory requirements
		available, at most {@code pSparseMemoryRequirementCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS to indicate
		that not all the available values were returned.

		If the image was not created with #IMAGE_CREATE_SPARSE_RESIDENCY_BIT then {@code pSparseMemoryRequirementCount} will be set to zero and
		{@code pSparseMemoryRequirements} will not be written to.

		${note(
			"""
			It is legal for an implementation to report a larger value in ##VkMemoryRequirements{@code ::size} than would be obtained by adding together memory
			sizes for all ##VkSparseImageMemoryRequirements returned by {@code vkGetImageSparseMemoryRequirements}. This may occur when the hardware requires
			unused padding in the address range describing the resource.
			"""
		)}

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code pSparseMemoryRequirementCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not $NULL,
			{@code pSparseMemoryRequirements} $must be a pointer to an array of {@code pSparseMemoryRequirementCount} ##VkSparseImageMemoryRequirements
			structures
			""",
			"{@code image} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code image} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"{@code image} $must have been created with the #IMAGE_CREATE_SPARSE_RESIDENCY_BIT flag"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the image"),
		VkImage.IN("image", "the {@code VkImage} object to get the memory requirements for"),
		AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t_p.INOUT(
			"pSparseMemoryRequirementCount",
			"a pointer to an integer related to the number of sparse memory requirements available or queried"
		),
		nullable..VkSparseImageMemoryRequirements_p.OUT(
			"pSparseMemoryRequirements",
			"either $NULL or a pointer to an array of ##VkSparseImageMemoryRequirements structures"
		)
	)

	void(
		"GetPhysicalDeviceSparseImageFormatProperties",
		"""
		Retrieves properties of an image format applied to sparse images.

		Given that certain aspects of sparse image support, including the sparse image block size, may be implementation-dependent,
		{@code vkGetPhysicalDeviceSparseImageFormatProperties} can be used to query for sparse image format properties prior to resource creation. This command
		is used to check whether a given set of sparse image parameters is supported and what the sparse block shape will be.

		{@code vkGetPhysicalDeviceSparseImageFormatProperties} returns an array of ##VkSparseImageFormatProperties. Each element will describe properties for
		one set of image aspects that are bound simultaneously in the image. This is usually one element for each aspect in the image, but for interleaved
		depth/stencil images there is only one element describing the combined aspects.

		If {@code pProperties} is $NULL, then the number of sparse format properties available is returned in {@code pPropertyCount}. Otherwise,
		{@code pPropertyCount} $must point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable
		is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of
		sparse format properties available, at most {@code pPropertyCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS to
		indicate that not all the available values were returned.

		<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code type} $must be a valid {@code VkImageType} value",
			"{@code samples} $must be a valid {@code VkSampleCountFlagBits} value",
			"{@code usage} $must be a valid combination of {@code VkImageUsageFlagBits} values",
			"{@code usage} $mustnot be 0",
			"{@code tiling} $must be a valid {@code VkImageTiling} value",
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, pProperties $must be a pointer to an array of
			{@code pPropertyCount} ##VkSparseImageFormatProperties structures
			""",
			"""
			If format is an integer format, samples $must be one of the bit flag values specified in the value of
			##VkPhysicalDeviceLimits{@code ::sampledImageIntegerSampleCounts}
			""",
			"""
			If format is a non-integer color format, samples $must be one of the bit flag values specified in the value of
			{@code VkPhysicalDeviceLimits::sampledImageColorSampleCounts}
			""",
			"""
			If format is a depth format, samples $must be one of the bit flag values specified in the value of
			{@code VkPhysicalDeviceLimits::sampledImageDepthSampleCounts}
			""",
			"""
			If format is a stencil format, samples $must be one of the bit flag values specified in the value of
			{@code VkPhysicalDeviceLimits::sampledImageStencilSampleCounts}
			""",
			"""
			If usage includes #IMAGE_USAGE_STORAGE_BIT, samples $must be one of the bit flag values specified in the value of
			{@code VkPhysicalDeviceLimits::storageImageSampleCounts}
			"""
		)}

		If #IMAGE_CREATE_SPARSE_RESIDENCY_BIT is not supported for the given arguments, {@code pPropertyCount} will be set to zero upon return, and no data
		will be written to {@code pProperties}.

		Multiple aspects are returned for depth/stencil images that are implemented as separate planes by the implementation. The depth and stencil data planes
		each have unique ##VkSparseImageFormatProperties data.

		Depth/stencil images with depth and stencil data interleaved into a single plane will return a single ##VkSparseImageFormatProperties structure with
		the {@code aspectMask} set to ${code("#IMAGE_ASPECT_DEPTH_BIT | #IMAGE_ASPECT_STENCIL_BIT")}.
		""",

		VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the sparse image capabilities"),
		VkFormat.IN("format", "the image format"),
		VkImageType.IN("type", "the dimensionality of image", VkImageTypes),
		VkSampleCountFlagBits.IN("samples", "the number of samples per pixel as defined in {@code VkSampleCountFlagBits}", VkSampleCountFlagBitLinks),
		VkImageUsageFlags.IN("usage", "a bitfield describing the intended usage of the image", VkImageUsageFlagBits, LinkMode.BITFIELD),
		VkImageTiling.IN("tiling", "the tiling arrangement of the data elements in memory", VkImageTilings),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"a pointer to an integer related to the number of sparse format properties available or queried"
		),
		nullable..VkSparseImageFormatProperties_p.OUT("pProperties", "either $NULL or a pointer to an array of ##VkSparseImageFormatProperties structures")
	)

	VkResult(
		"QueueBindSparse",
		"""
		Submits sparse binding operations to a queue for execution.

		Each batch of sparse binding operations is represented by a list of ##VkSparseBufferMemoryBindInfo, ##VkSparseImageOpaqueMemoryBindInfo, and
		##VkSparseImageMemoryBindInfo structures (encapsulated in a ##VkBindSparseInfo structure), each preceded by a list of semaphores upon which to wait
		before beginning execution of the operations, and followed by a second list of semaphores to signal upon completion of the operations.

		When all sparse binding operations in {@code pBindInfo} have completed execution, the status of fence is set to signaled, providing certain implicit
		ordering guarantees.

		Within a batch, a given range of a resource $mustnot be bound more than once. Across batches, if a range is to be bound to one allocation and offset
		and then to another allocation and offset, then the application $must guarantee (usually using semaphores) that the binding operations are executed in
		the correct order, as well as to order binding operations against the execution of command buffer submissions.

		<h5>Valid Usage</h5>
		${ul(
			"{@code queue} $must be a valid {@code VkQueue} handle",
			"If {@code bindInfoCount} is not 0, {@code pBindInfo} $must be a pointer to an array of {@code bindInfoCount} valid ##VkBindSparseInfo structures",
			"If {@code fence} is not #NULL_HANDLE, fence $must be a valid {@code VkFence} handle",
			"The {@code queue} $must support sparse binding operations",
			"Each of {@code queue} and {@code fence} that are valid handles $must have been created, allocated or retrieved from the same {@code VkDevice}",
			"{@code fence} $must be unsignalled",
			"{@code fence} $mustnot be associated with any other queue command that has not yet completed execution on that queue"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code queue} $must be externally synchronized",
			"Host access to {@code pBindInfo[].pWaitSemaphores[]} $must be externally synchronized",
			"Host access to {@code pBindInfo[].pSignalSemaphores[]} $must be externally synchronized",
			"Host access to {@code pBindInfo[].pBufferBinds[].buffer} $must be externally synchronized",
			"Host access to {@code pBindInfo[].pImageOpaqueBinds[].image} $must be externally synchronized",
			"Host access to {@code pBindInfo[].pImageBinds[].image} $must be externally synchronized",
			"Host access to {@code fence} $must be externally synchronized"
		)}
		""",

		VkQueue.IN("queue", "the queue to submit the sparse binding operation to"),
		AutoSize("pBindInfo")..uint32_t.IN("bindInfoCount", "the size of the array pointed to by {@code pBindInfo}"),
		SingleValue("pBindInfo")..const..VkBindSparseInfo_p.IN(
			"pBindInfo",
			"an array of ##VkBindSparseInfo structures each specifying the parameters of a sparse binding operation batch"
		),
		VkFence.IN("fence", "if not #NULL_HANDLE, is a fence to be signaled once the sparse binding operation completes")
	)

	VkResult(
		"CreateFence",
		"""
		Creates a new fence object.

		Fences can be used by the host to determine completion of execution of submissions to queues performed with #QueueSubmit() and #QueueBindSparse().

		A fence’s status is always either signaled or unsignaled. The host can poll the status of a single fence, or wait for any or all of a group of fences
		to become signaled.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkFenceCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pFence} $must be a pointer to a {@code VkFence} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the fence"),
		const..VkFenceCreateInfo_p.IN("pCreateInfo", "points to a ##VkFenceCreateInfo structure specifying the state of the fence object"),
		CreateInstance["pAllocator"],
		Check(1)..VkFence.p.OUT("pFence", "points to a handle in which the resulting fence object is returned")
	)

	void(
		"DestroyFence",
		"""
		Destroys a fence object.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code fence} is not #NULL_HANDLE, {@code fence} $must be a valid {@code VkFence} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code fence} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code fence} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"{@code fence} $mustnot be associated with any queue command that has not yet completed execution on that queue",
			"If ##VkAllocationCallbacks were provided when {@code fence} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code fence} was created, {@code pAllocator} $must be $NULL"
		)}
		<h5>Host Synchronization</h5>
		
		Host access to {@code fence} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the fence"),
		VkFence.IN("fence", "the handle of the fence to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"ResetFences",
		"""
		Resets the status of one or more fences to the unsignaled state.

		If a fence is already in the unsignaled state, then resetting it has no effect.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pFences} $must be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles",
			"The value of {@code fenceCount} $must be greater than 0",
			"Each element of {@code pFences} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and the elements of {@code pFences} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"Any given element of {@code pFences} $must not currently be associated with any queue command that has not yet completed execution on that queue"
		)}

		<h5>Host Synchronization</h5>

		Host access to each member of {@code pFences} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the fences"),
		AutoSize("pFences")..uint32_t.IN("fenceCount", "the number of fences to reset"),
		SingleValue("pFence")..const..VkFence.p.IN("pFences", "a pointer to an array of {@code fenceCount} fence handles to reset")
	)

	VkResult(
		"GetFenceStatus",
		"""
		Queries the status of a fence from the host.

		Upon success, {@code vkGetFenceStatus} returns the status of the fence, which is one of:
		${ul(
			"#SUCCESS indicates that the fence is signaled.",
			"#NOT_READY indicates that the fence is unsignaled."
		)}

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code fence} $must be a valid {@code VkFence} handle",
			"{@code fence} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code fence} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the fence"),
		VkFence.IN("fence", "the handle of the fence to query")
	)

	VkResult(
		"WaitForFences",
		"""
		Causes the host to wait until any one or all of a group of fences is signaled.
		
		If the condition is satisfied when {@code vkWaitForFences} is called, then {@code vkWaitForFences} returns immediately. If the condition is not
		satisfied at the time {@code vkWaitForFences} is called, then {@code vkWaitForFences} will block and wait up to timeout nanoseconds for the condition
		to become satisfied.

		If the value of {@code timeout} is zero, then {@code vkWaitForFences} does not wait, but simply returns the current state of the fences. #TIMEOUT will
		be returned in this case if the condition is not satisfied, even though no actual wait was performed.

		If the specified {@code timeout} period expires before the condition is satisfied, {@code vkWaitForFences} returns #TIMEOUT. If the condition is
		satisfied before timeout nanoseconds has expired, {@code vkWaitForFences} returns #SUCCESS.

		Fences become signaled when the device completes executing the work that was submitted to a queue accompanied by the fence. But this alone is not
		sufficient for the host to be guaranteed to see the results of device writes to memory. To provide that guarantee, the application $must insert a
		memory barrier between the device writes and the end of the submission that will signal the fence, with {@code dstAccessMask} having the
		#ACCESS_HOST_READ_BIT bit set, with {@code dstStageMask} having the #PIPELINE_STAGE_HOST_BIT bit set, and with the appropriate {@code srcStageMask} and
		{@code srcAccessMask} members set to guarantee completion of the writes. If the memory was allocated without the #MEMORY_PROPERTY_HOST_COHERENT_BIT
		set, then #InvalidateMappedMemoryRanges() $must be called after the fence is signaled in order to ensure the writes are visible to the host.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pFences} $must be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles",
			"The value of {@code fenceCount} $must be greater than 0",
			"Each element of {@code pFences} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and the elements of {@code pFences} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the fences"),
		AutoSize("pFences")..uint32_t.IN("fenceCount", "the number of fences to wait on"),
		SingleValue("pFence")..const..VkFence.p.IN("pFences", "a pointer to an array of {@code fenceCount} fence handles"),
		VkBool32.IN(
			"waitAll",
			"""
			the condition that must be satisfied to successfully unblock the wait. If {@code waitAll} is #TRUE, then the condition is that all fences in
			{@code pFences} are signaled. Otherwise, the condition is that at least one fence in {@code pFences} is signaled.
			"""
		),
		uint64_t.IN(
			"timeout",
			"""
			the timeout period in units of nanoseconds. The value of {@code timeout} is adjusted to the closest value allowed by the implementation-dependent
			timeout accuracy, which may be substantially longer than one nanosecond, and may be longer than the requested period.
			"""
		)
	)

	VkResult(
		"CreateSemaphore",
		"""
		Creates a new queue semaphore object.

		Semaphores are used to coordinate operations between queues and between queue submissions within a single queue. An application might associate
		semaphores with resources or groups of resources to marshal ownership of shared data. A semaphore’s status is always either <em>signaled</em> or
		<em>unsignaled</em>. Semaphores are signaled by queues and $can also be waited on in the same or different queues until they are signaled.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkSemaphoreCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSemaphore} $must be a pointer to a {@code VkSemaphore} handle"
		)}

		To signal a semaphore from a queue, include it in an element of the array of ##VkSubmitInfo structures passed through the {@code pSubmitInfo} parameter
		to a call to #QueueSubmit(), or in an element of the array of ##VkBindSparseInfo structures passed through the {@code pBindInfo} parameter to a call to
		#QueueBindSparse().

		Semaphores included in the {@code pSignalSemaphores} array of one of the elements of a queue submission are signaled once queue execution reaches the
		signal operation, and all previous work in the queue completes. Any operations waiting on that semaphore in other queues will be released once it is
		signaled.

		Similarly, to wait on a semaphore from a queue, include it in the {@code pWaitSemaphores} array of one of the elements of a batch in a queue
		submission. When queue execution reaches the wait operation, will stall execution of subsequently submitted operations until the semaphore reaches the
		signaled state due to a signaling operation. Once the semaphore is signaled, the subsequent operations will be permitted to execute and the status of
		the semaphore will be reset to the unsignaled state.

		In the case of {@code VkSubmitInfo}, command buffers wait at specific pipeline stages, rather than delaying the entire command buffer’s execution, with the
		pipeline stages determined by the value of the corresponding element of the {@code pWaitDstStageMask} member of {@code VkSubmitInfo}. Execution of work
		by those stages in subsequent commands is stalled until the corresponding semaphore reaches the signaled state. Subsequent sparse binding operations
		wait for the semaphore to become signaled, regardless of the values of {@code pWaitDstStageMask}.

		${note(
			"""
			A common scenario for using {@code pWaitDstStageMask} with values other than #PIPELINE_STAGE_ALL_COMMANDS_BIT is when synchronizing a window system
			presentation operation against subsequent command buffers which render the next frame. In this case, an image that was being presented $mustnot be
			overwritten until the presentation operation completes, but other pipeline stages $can execute without waiting. A mask of
			#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT prevents subsequent color attachment writes from executing until the semaphore signals. Some
			implementations $may be able to execute transfer operations and/or vertex processing work before the semaphore is signaled.

			If an image layout transition needs to be performed on a swapchain image before it is used in a framebuffer, that can be performed as the first
			operation submitted to the queue after acquiring the image, and $shouldnot prevent other work from overlapping with the presentation operation.
			For example, a ##VkImageMemoryBarrier could use:
			${ul(
				code("srcStageMask = #PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT"),
				code("srcAccessMask = #ACCESS_MEMORY_READ_BIT"),
				code("dstStageMask = #PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT"),
				code("dstAccessMask = #ACCESS_COLOR_ATTACHMENT_READ_BIT | #ACCESS_COLOR_ATTACHMENT_WRITE_BIT."),
				code("oldLayout = KHRSwapchain#IMAGE_LAYOUT_PRESENT_SRC_KHR"),
				code("newLayout = #IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL")
			)}

			Alternately, {@code oldLayout} can be #IMAGE_LAYOUT_UNDEFINED, if the image’s contents need not be preserved.

			This barrier accomplishes a dependency chain between previous presentation operations and subsequent color attachment output operations, with the
			layout transition performed in between, and does not introduce a dependency between previous work and any vertex processing stages. More precisely,
			the semaphore signals after the presentation operation completes, then the semaphore wait stalls the #PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT
			stage, then there is a dependency from that same stage to itself with the layout transition performed in between.
			"""
		)}

		When a queue signals or waits upon a semaphore, certain implicit ordering guarantees are provided.

		Semaphore operations $may not make the side effects of commands visible to the host.
		""",

		VkDevice.IN("device", "the logical device that creates the semaphore"),
		const..VkSemaphoreCreateInfo_p.IN("pCreateInfo", "points to a ##VkSemaphoreCreateInfo structure specifying the state of the semaphore object"),
		CreateInstance["pAllocator"],
		Check(1)..VkSemaphore.p.OUT(
			"pSemaphore",
			"points to a handle in which the resulting semaphore object is returned. The semaphore is created in the unsignaled state."
		)
	)

	void(
		"DestroySemaphore",
		"""
		Destroys a semaphore object.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code semaphore} is not #NULL_HANDLE, {@code semaphore} $must be a valid {@code VkSemaphore} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code semaphore} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code semaphore} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"{@code semaphore} $mustnot be associated with any queue command that has not yet completed execution on that queue",
			"If ##VkAllocationCallbacks were provided when semaphore was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when semaphore was created, {@code pAllocator} $must be $NULL"
		)}
		
		<h5>Host Synchronization</h5>

		Host access to {@code semaphore} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the semaphore"),
		VkSemaphore.IN("semaphore", "the handle of the semaphore to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"CreateEvent",
		"""
		Creates a new event object.
		
		Events represent a fine-grained synchronization primitive that can be used to gauge progress through a sequence of commands executed on a queue by
		Vulkan. An event is initially in the unsignaled state. It $can be signaled by a device, using commands inserted into the command buffer, or by the
		host. It $can also be reset to the unsignaled state by a device or the host. The host can query the state of an event. A device $can wait for one or
		more events to become signaled.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkEventCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pEvent} $must be a pointer to a {@code VkEvent} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the event"),
		const..VkEventCreateInfo_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkEventCreateInfo structure which contains information about how the event is to be created"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkEvent.p.OUT("pEvent", "points to a handle in which the resulting event object is returned")
	)

	void(
		"DestroyEvent",
		"""
		Destroys an event object.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code event} is not #NULL_HANDLE, event $must be a valid VkEvent handle",
			"If pAllocator is not NULL, pAllocator $must be a pointer to a valid VkAllocationCallbacks structure",
			"If event is a valid handle, it $must have been created, allocated or retrieved from device",
			"Each of device and event that are valid handles $must have been created, allocated or retrieved from the same VkPhysicalDevice",
			"All submitted commands that refer to event $must have completed execution",
			"If VkAllocationCallbacks were provided when event was created, a compatible set of callbacks $must be provided here",
			"If no VkAllocationCallbacks were provided when event was created, pAllocator $must be NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code event} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the event"),
		VkEvent.IN("event", "the handle of the event to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"GetEventStatus",
		"""
		Queries the state of an event from the host.

		Upon success, {@code vkGetEventStatus} returns the state of the event object with the following return codes:
		${ul(
			"#EVENT_SET - The event specified by event is signaled.",
			"#EVENT_RESET - The event specified by event is unsignaled."
		)}

		The state of an event $can be updated by the host. The state of the event is immediately changed, and subsequent calls to {@code vkGetEventStatus} will
		return the new state. If an event is already in the requested state, then updating it to the same state has no effect.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code event} $must be a valid {@code VkEvent} handle",
			"{@code event} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code event} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the event"),
		VkEvent.IN("event", "the handle of the event to query")
	)

	VkResult(
		"SetEvent",
		"""
		Sets the state of an event to signaled from the host.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code event} $must be a valid {@code VkEvent} handle",
			"{@code event} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code event} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}"
		)}
		
		<h5>Host Synchronization</h5>

		Host access to {@code event} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the event"),
		VkEvent.IN("event", "the event to set")
	)

	VkResult(
		"ResetEvent",
		"""
		Sets the state of an event to unsignaled from the host.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code event} $must be a valid {@code VkEvent} handle",
			"{@code event} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code event} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code event} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the event"),
		VkEvent.IN("event", "the event to reset")
	)

	}
	separateMethod {

	VkResult(
		"CreateQueryPool",
		"""
		Creates a new query pool object.
		
		Queries are managed using query pool objects. Each query pool is a collection of a specific number of queries of a particular type.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkQueryPoolCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pQueryPool} $must be a pointer to a {@code VkQueryPool} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the query pool"),
		const..VkQueryPoolCreateInfo_p.IN(
			"pCreateInfo",
			"pointer to an instance of the ##VkQueryPoolCreateInfo structure containing the number and type of queries to be managed by the pool"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkQueryPool.p.OUT("pQueryPool", "a pointer to a {@code VkQueryPool} handle in which the resulting query pool object is returned")
	)

	void(
		"DestroyQueryPool",
		"""
		Destroys a query pool object.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code queryPool} is not #NULL_HANDLE, {@code queryPool} $must be a valid {@code VkQueryPool} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code queryPool} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code queryPool} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to {@code queryPool} $must have completed execution",
			"If ##VkAllocationCallbacks were provided when {@code queryPool} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code queryPool} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code queryPool} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the query pool"),
		VkQueryPool.IN("queryPool", "the query pool to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"GetQueryPoolResults",
		"""
		Retrieves status and results for a set of queries.

		If no bits are set in {@code flags}, and all requested queries are in the available state, results are written as an array of 32-bit unsigned integer
		values. The behavior when not all queries are available, is described below.

		If #QUERY_RESULT_64_BIT is not set and the result overflows a 32-bit value, the value $may either wrap or saturate. Similarly, if #QUERY_RESULT_64_BIT
		is set and the result overflows a 64-bit value, the value $may either wrap or saturate.

		If #QUERY_RESULT_WAIT_BIT is set, Vulkan will wait for each query to be in the available state before retrieving the numerical results for that query.
		In this case, {@code vkGetQueryPoolResults} is guaranteed to succeed and return #SUCCESS if the queries become available in a finite time (i.e. if they
		have been issued and not reset). If queries will never finish (e.g. due to being reset but not issued), then {@code vkGetQueryPoolResults} $may not
		return in finite time.

		If #QUERY_RESULT_WAIT_BIT and #QUERY_RESULT_PARTIAL_BIT are both not set then no result values are written to {@code pData} for queries that are in the
		unavailable state at the time of the call, and {@code vkGetQueryPoolResults} returns #NOT_READY. However, availability state is still written to
		{@code pData} for those queries if #QUERY_RESULT_WITH_AVAILABILITY_BIT is set.

		${note(
			"""
			Applications $must take care to ensure that use of the #QUERY_RESULT_WAIT_BIT bit has the desired effect.

			For example, if a query has been used previously and a command buffer records the commands #CmdResetQueryPool(), #CmdBeginQuery(), and
			#CmdEndQuery() for that query, then the query will remain in the available state until the {@code vkCmdResetQueryPool} command executes on a queue.
			Applications can use fences or events to ensure that an query has already been reset before checking for its results or availability status.
			Otherwise, a stale value could be returned from a previous use of the query.

			The above also applies when #QUERY_RESULT_WAIT_BIT is used in combination with #QUERY_RESULT_WITH_AVAILABILITY_BIT. In this case, the returned
			availability status $may reflect the result of a previous use of the query unless the {@code vkCmdResetQueryPool} command has been executed since
			the last use of the query.
			"""
		)}

		${note("Applications $can double-buffer query pool usage, with a pool per frame, and reset queries at the end of the frame in which they are read.")}

		If #QUERY_RESULT_PARTIAL_BIT is set, #QUERY_RESULT_WAIT_BIT is not set, and the query’s status is unavailable, an intermediate result value between
		zero and the final result value is written to {@code pData} for that query.

		#QUERY_RESULT_PARTIAL_BIT $mustnot be used if the pool’s {@code queryType} is #QUERY_TYPE_TIMESTAMP.

		If #QUERY_RESULT_WITH_AVAILABILITY_BIT is set, the final integer value written for each query is non-zero if the query’s status was available or zero
		if the status was unavailable. When #QUERY_RESULT_WITH_AVAILABILITY_BIT is used, implementations $must guarantee that if they return a non-zero
		availability value then the numerical results $must be valid, assuming the results are not reset by a subsequent command.

		${note("Satisfying this guarantee $may require careful ordering by the application, e.g. to read the availability status before reading the results.")}

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code queryPool} $must be a valid {@code VkQueryPool} handle",
			"{@code pData} $must be a pointer to an array of {@code dataSize} bytes",
			"{@code flags} $must be a valid combination of {@code VkQueryResultFlagBits} values",
			"The value of {@code dataSize} $must be greater than 0",
			"{@code queryPool} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code queryPool} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"{@code firstQuery} $must be less than the number of queries in {@code queryPool}",
			"If #QUERY_RESULT_64_BIT is not set in flags then {@code pData} and {@code stride} $must be multiples of 4",
			"If #QUERY_RESULT_64_BIT is set in flags then {@code pData} and {@code stride} $must be multiples of 8",
			"The sum of {@code firstQuery} and {@code queryCount} $must be less than or equal to the number of queries in {@code queryPool}",
			"{@code dataSize} $must be large enough to contain the result of each query",
			"If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TIMESTAMP, {@code flags} $must not contain #QUERY_RESULT_PARTIAL_BIT"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the query pool"),
		VkQueryPool.IN("queryPool", "the query pool managing the queries containing the desired results"),
		uint32_t.IN("firstQuery", "the initial query index"),
		uint32_t.IN("queryCount", "the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries"),
		AutoSize("pData")..size_t.IN("dataSize", "the size in bytes of the buffer pointed to by {@code pData}"),
		MultiType(
			PointerMapping.DATA_INT,
			PointerMapping.DATA_LONG
		)..void_p.OUT("pData", "a pointer to a user-allocated buffer where the results will be written"),
		VkDeviceSize.IN("stride", "the stride in bytes between results for individual queries within {@code pData}."),
		VkQueryResultFlags.IN(
			"flags",
			"a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned",
			VkQueryResultFlagBits, LinkMode.BITFIELD
		)
	)

	VkResult(
		"CreateBuffer",
		"""
		Creates a new buffer object.
		
		Buffers represent linear arrays of data which are used for various purposes by binding them to the graphics pipeline via descriptor sets or via certain
		commands, or by directly specifying them as parameters to certain commands.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkBufferCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pBuffer} $must be a pointer to a {@code VkBuffer} handle",
			"""
			If the flags member of {@code pCreateInfo} includes #BUFFER_CREATE_SPARSE_BINDING_BIT or #BUFFER_CREATE_SPARSE_RESIDENCY_BIT, creating this
			{@code VkBuffer} $mustnot cause the total required sparse memory for all currently valid sparse resources on the device to exceed
			##VkPhysicalDeviceLimits{@code ::sparseAddressSpaceSize}
			"""
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the buffer object"),
		const..VkBufferCreateInfo_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkBufferCreateInfo structure containing parameters affecting creation of the buffer"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkBuffer.p.OUT("pBuffer", "points to a {@code VkBuffer} handle in which the resulting buffer object is returned")
	)

	void(
		"DestroyBuffer",
		"""
		Destroys a buffer object.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code buffer} is not #NULL_HANDLE, {@code buffer} $must be a valid {@code VkBuffer} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code buffer} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code buffer} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to {@code buffer}, either directly or via a {@code VkBufferView}, $must have completed execution",
			"If ##VkAllocationCallbacks were provided when buffer was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when buffer was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code buffer} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the buffer"),
		VkBuffer.IN("buffer", "the buffer to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"CreateBufferView",
		"""
		Creates a new buffer view object.
		
		A buffer view represents a contiguous range of a buffer and a specific format to be used to interpret the data. Buffer views are used to enable shaders
		to access buffer contents interpreted as formatted data. In order to create a valid buffer view, the buffer must have been created with at least one of
		the following usage flags:
		${ul(
			"#BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT",
			"#BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT"
		)}

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkBufferViewCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pView} $must be a pointer to a {@code VkBufferView} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the buffer view"),
		const..VkBufferViewCreateInfo_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkBufferViewCreateInfo structure containing parameters to be used to create the buffer"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkBufferView.p.OUT("pView", "points to a {@code VkBufferView} handle in which the resulting buffer view object is returned")
	)

	void(
		"DestroyBufferView",
		"""
		Destroys a buffer view object.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code bufferView} is not #NULL_HANDLE, {@code bufferView} $must be a valid {@code VkBufferView} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code bufferView} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code bufferView} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to {@code bufferView} $must have completed execution",
			"If ##VkAllocationCallbacks were provided when {@code bufferView} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code bufferView} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code bufferView} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the buffer view"),
		VkBufferView.IN("bufferView", "the buffer view to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"CreateImage",
		"""
		Creates a new image object.

		Images represent multidimensional - up to 3 - arrays of data which can be used for various purposes (e.g. attachments, textures), by binding them to
		the graphics pipeline via descriptor sets, or by directly specifying them as parameters to certain commands.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkImageCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pImage} $must be a pointer to a {@code VkImage} handle",
			"""
			If the flags member of {@code pCreateInfo} includes #IMAGE_CREATE_SPARSE_BINDING_BIT or #IMAGE_CREATE_SPARSE_RESIDENCY_BIT, creating this
			{@code VkImage} $mustnot cause the total required sparse memory for all currently valid sparse resources on the device to exceed
			##VkPhysicalDeviceLimits{@code ::sparseAddressSpaceSize}
			"""
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the image"),
		const..VkImageCreateInfo_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkImageCreateInfo structure containing parameters to be used to create the image"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkImage.p.OUT("pImage", "points to a ##VkImage handle in which the resulting image object is returned")
	)

	void(
		"DestroyImage",
		"""
		Destroys an image object.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code image} is not #NULL_HANDLE, {@code image} $must be a valid {@code VkImage} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code image} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code image} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to {@code imag}e, either directly or via a {@code VkImageView}, $must have completed execution",
			"If ##VkAllocationCallbacks were provided when image was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when image was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code image} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the image"),
		VkImage.IN("image", "the image to destroy"),
		CreateInstance["pAllocator"]
	)

	void(
		"GetImageSubresourceLayout",
		"""
		Queries the layout of a subresource (mipLevel/arrayLayer) of an image created with linear tiling.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code pSubresource} $must be a pointer to a valid {@code VkImageSubresource} structure",
			"{@code pLayout} $must be a pointer to a {@code VkSubresourceLayout} structure",
			"{@code image} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code image} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"{@code image} $must have been created with {@code tiling} equal to #IMAGE_TILING_LINEAR",
			"The {@code aspectMask} member of {@code pSubresource} $must only have a single bit set"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the image"),
		VkImage.IN("image", "the image whose layout is being queried"),
		const..VkImageSubresource_p.IN("pSubresource", "a pointer to a ##VkImageSubresource structure selecting a specific image for the subresource"),
		VkSubresourceLayout_p.OUT("pLayout", "points to a ##VkSubresourceLayout structure in which the layout is returned")
	)

	VkResult(
		"CreateImageView",
		"""
		Creates an image view from an existing image.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkImageViewCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pView} $must be a pointer to a {@code VkImageView} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the image view"),
		const..VkImageViewCreateInfo_p.IN(
			"pCreateInfo", 
			"a pointer to an instance of the ##VkImageViewCreateInfo structure containing parameters to be used to create the image view"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkImageView.p.OUT("pView", "points to a {@code VkImageView} handle in which the resulting image view object is returned")
	)

	void(
		"DestroyImageView",
		"""
		Destroys an image view object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code imageView} is not #NULL_HANDLE, {@code imageView} $must be a valid {@code VkImageView} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code imageView} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code imageView} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to {@code imageView} $must have completed execution",
			"If ##VkAllocationCallbacks were provided when {@code imageView} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code imageView} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code imageView} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the image view"),
		VkImageView.IN("imageView", "the image view to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"CreateShaderModule",
		"""
		Creates a new shader module object.
		
		Shader modules contain shader code and one or more entry points. Shaders are selected from a shader module by specifying an entry point as part of
		pipeline creation. The stages of a pipeline can use shaders that come from different modules. The shader code defining a shader module must be in the
		SPIR-V format.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkShaderModuleCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pShaderModule} $must be a pointer to a {@code VkShaderModule} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the shader module"),
		const..VkShaderModuleCreateInfo_p.IN("pCreateInfo", "a pointer to an instance of the ##VkShaderModuleCreateInfo structure"),
		CreateInstance["pAllocator"],
		Check(1)..VkShaderModule.p.OUT("pShaderModule", "points to a {@code VkShaderModule} handle in which the resulting render pass object is returned")
	)

	void(
		"DestroyShaderModule",
		"""
		Destroys a shader module object.
		
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code shaderModule} is not #NULL_HANDLE, {@code shaderModule} $must be a valid {@code VkShaderModule} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator }$must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code shaderModule} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code shaderModule} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"If ##VkAllocationCallbacks were provided when {@code shaderModule} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code shaderModule} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code shaderModule} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the shader module"),
		VkShaderModule.IN("shaderModule", "the handle of the shader module to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"CreatePipelineCache",
		"""
		Creates a new pipeline cache object.

		Pipeline cache objects allow the result of pipeline construction to be reused between pipelines and between runs of an application. Reuse between
		pipelines is achieved by passing the same pipeline cache object when creating multiple related pipelines. Reuse across runs of an application is
		achieved by retrieving pipeline cache contents in one run of an application, saving the contents, and using them to preinitialize a pipeline cache on a
		subsequent run. The contents and size of the pipeline cache objects are managed by the implementation. Applications can control the amount of data
		retrieved from a pipeline cache object.

		Once created, a pipeline cache can be passed to the #CreateGraphicsPipelines() and #CreateComputePipelines() commands. If the pipeline cache passed
		into these commands is not #NULL_HANDLE, the implementation will query it for possible reuse opportunities and update it with new content. The use of
		the pipeline cache object in these commands is internally synchronized, and the same pipeline cache object can be used in multiple threads
		simultaneously.

		${note(
			"""
			Implementations should make every effort to limit any critical sections to the actual accesses to the cache, which is expected to be significantly
			shorter than the duration of the {@code vkCreateGraphicsPipelines} and {@code vkCreateComputePipelines} commands.
			"""
		)}

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkPipelineCacheCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pPipelineCache} $must be a pointer to a {@code VkPipelineCache} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the pipeline cache object"),
		const..VkPipelineCacheCreateInfo_p.IN(
			"pCreateInfo",
			"a pointer to a ##VkPipelineCacheCreateInfo structure that contains the initial parameters for the pipeline cache object"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkPipelineCache.p.OUT(
			"pPipelineCache",
			"a pointer to a {@code VkPipelineCache} handle in which the resulting pipeline cache object is returned"
		)
	)

	void(
		"DestroyPipelineCache",
		"""
		Destroys a pipeline cache object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} $must be a valid {@code VkPipelineCache} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code pipelineCache} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code pipelineCache} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"If ##VkAllocationCallbacks were provided when {@code pipelineCache} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code pipelineCache} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code pipelineCache} $must be externally synchronized.
		""",

		VkDevice.IN("device", ""),
		VkPipelineCache.IN("pipelineCache", ""),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"GetPipelineCacheData",
		"""
		Retrieves data from a pipeline cache object.

		If {@code pData} is $NULL, then the maximum size of the data that can be retrieved from the pipeline cache, in bytes, is returned in {@code pDataSize}.
		Otherwise, {@code pDataSize} must point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pData}, and on return
		the variable is overwritten with the amount of data actually written to {@code pData}.

		If the value of {@code dataSize} is less than the maximum size that can be retrieved by the pipeline cache, at most {@code pDataSize} bytes will be
		written to {@code pData}, and {@code vkGetPipelineCacheData} will return #INCOMPLETE. Any data written to {@code pData} is valid and can be provided as
		the {@code pInitialData} member of the ##VkPipelineCacheCreateInfo structure passed to #CreatePipelineCache().

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pipelineCache} $must be a valid {@code VkPipelineCache} handle",
			"{@code pDataSize} $must be a pointer to a {@code size_t} value",
			"""
			If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not $NULL, {@code pData} $must be a pointer to an array of
			{@code pDataSize} bytes
			""",
			"{@code pipelineCache} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code pipelineCache} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}"
		)}

		Applications can store the data retrieved from the pipeline cache, and use these data, possibly in a future run of the application, to populate new
		pipeline cache objects. The results of pipeline compiles, however, may depend on the vendor ID, device ID, driver version, and other details of the
		device. To enable applications to detect when previously retrieved data is incompatible with the device, the initial bytes written to {@code pData}
		must be a header consisting of the following members:
		${table(
			tr(th("Offset"), th("Size"), th("Meaning")),
			tr(td("0"), td("4"), td("length in bytes of the entire pipeline cache header written as a stream of bytes, with the least significant byte first")),
			tr(td("4"), td("4"), td("a {@code VkPipelineCacheHeaderVersion} value written as a stream of bytes, with the least significant byte first")),
			tr(td("8"), td("4"), td("a vendor ID equal to ##VkPhysicalDeviceProperties{@code ::vendorID} written as a stream of bytes, with the least significant byte first")),
			tr(td("12"), td("4"), td("a device ID equal to {@code VkPhysicalDeviceProperties::deviceID} written as a stream of bytes, with the least significant byte first")),
			tr(td("16"), td("#UUID_SIZE"), td("a pipeline cache ID equal to {@code VkPhysicalDeviceProperties::pipelineCacheUUID}"))
		)}

		The first four bytes encode the length of the entire pipeline header, in bytes. This value includes all fields in the header including the pipeline
		cache version field and the size of the length field.

		The next four bytes encode the pipeline cache version. This field is interpreted as an {@code VkPipelineCacheHeaderVersion} value, and must have one of
		the following values:
		${codeBlock("""
typedef enum VkPipelineCacheHeaderVersion {
	VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1,
} VkPipelineCacheHeaderVersion;
		""")}
		A consumer of the pipeline cache should use the cache version to interpret the remainder of the cache header.

		If the value of {@code dataSize} is less than what is necessary to store this header, nothing will be written to {@code pData} and zero will be written
		to {@code dataSize}.
		""",

		VkDevice.IN("device", "the logical device that owns the pipeline cache"),
		VkPipelineCache.IN("pipelineCache", "the pipeline cache to retrieve data from"),
		AutoSize("pData")..Check(1)..size_t_p.INOUT("pDataSize", "a pointer to a value related to the amount of data in the pipeline cache"),
		nullable..void_p.OUT("pData", "either $NULL or a pointer to a buffer")
	)

	VkResult(
		"MergePipelineCaches",
		"""
		Merges pipeline cache objects.

		${note(
			"""
			The details of the merge operation are implementation dependent, but implementations should merge the contents of the specified pipelines and prune
			duplicate entries.
			"""
		)}

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code dstCache} $must be a valid {@code VkPipelineCache} handle",
			"{@code pSrcCaches} $must be a pointer to an array of {@code srcCacheCount} valid {@code VkPipelineCache} handles",
			"The value of {@code srcCacheCount} $must be greater than 0",
			"{@code dstCache} $must have been created, allocated or retrieved from {@code device}",
			"Each element of {@code pSrcCaches} $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device}, {@code dstCache} and the elements of {@code pSrcCaches} $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"{@code dstCache} $mustnot appear in the list of source caches"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code dstCache} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the pipeline cache objects"),
		VkPipelineCache.IN("dstCache", "the handle of the pipeline cache to merge results into"),
		AutoSize("pSrcCaches")..uint32_t.IN("srcCacheCount", "the length of the {@code pSrcCaches} array"),
		const..VkPipelineCache.p.IN(
			"pSrcCaches",
			"""
			an array of pipeline cache handles, which will be merged into {@code dstCache}. The previous contents of {@code dstCache} are included after the
			merge.
			"""
		)
	)

	VkResult(
		"CreateGraphicsPipelines",
		"""
		Creates graphics pipelines.

		Graphics pipelines consist of multiple shader stages, multiple fixed-function pipeline stages, and a pipeline layout.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} $must be a valid {@code VkPipelineCache} handle",
			"{@code pCreateInfos} $must be a pointer to an array of {@code createInfoCount} valid ##VkGraphicsPipelineCreateInfo structures",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pPipelines} $must be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles",
			"The value of {@code createInfoCount} $must be greater than 0",
			"If {@code pipelineCache} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code pipelineCache} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"""
			If the value of the {@code flags} member of any given element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and the
			{@code basePipelineIndex} member of that same element is not -1, the value of {@code basePipelineIndex} $must be less than the index into
			{@code pCreateInfos} that corresponds to that element
			"""
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the graphics pipelines"),
		VkPipelineCache.IN(
			"pipelineCache",
			"""
			either #NULL_HANDLE, indicating that pipeline caching is disabled; or the handle of a valid pipeline cache object, in which case use of that cache
			is enabled for the duration of the command
			"""
		),
		AutoSize("pCreateInfos", "pPipelines")..uint32_t.IN("createInfoCount", "the length of the {@code pCreateInfos} and {@code pPipelines} arrays."),
		const..VkGraphicsPipelineCreateInfo_p.IN("pCreateInfos", "an array of ##VkGraphicsPipelineCreateInfo structures"),
		CreateInstance["pAllocator"],
		VkPipeline.p.OUT("pPipelines", "a pointer to an array in which the resulting graphics pipeline objects are returned")
	)

	VkResult(
		"CreateComputePipelines",
		"""
		Creates a new compute pipeline object.

		Compute pipelines consist of a single static compute shader stage and the pipeline layout.

		The compute pipeline encapsulates a compute shader and is created by calling {@code vkCreateComputePipelines} with {@code module} and {@code pName}
		selecting an entry point from a shader module, where that entry point defines a valid compute shader, in the ##VkPipelineShaderStageCreateInfo
		structure contained within the ##VkComputePipelineCreateInfo structure.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} $must be a valid {@code VkPipelineCache} handle",
			"{@code pCreateInfos} $must be a pointer to an array of {@code createInfoCount} valid ##VkComputePipelineCreateInfo structures",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pPipelines} $must be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles",
			"The value of {@code createInfoCount} $must be greater than 0",
			"If {@code pipelineCache} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code pipelineCache} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"""
			If the value of the {@code flags} member of any given element of {@code pCreateInfos} contains the #VK_PIPELINE_CREATE_DERIVATIVE_BIT flag, and the
			{@code basePipelineIndex} member of that same element is not -1, the value of {@code basePipelineIndex} $must be less than the index into
			{@code pCreateInfos} that corresponds to that element
			"""
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the compute pipelines"),
		VkPipelineCache.IN(
			"pipelineCache",
			"""
			either #NULL_HANDLE, indicating that pipeline caching is disabled; or the handle of a valid pipeline cache object, in which case use of that cache
			is enabled for the duration of the command
			"""
		),
		AutoSize("pCreateInfos", "pPipelines")..uint32_t.IN("createInfoCount", "the length of the {@code pCreateInfos} and {@code pPipelines} arrays"),
		const..VkComputePipelineCreateInfo_p.IN("pCreateInfos", "an array of ##VkComputePipelineCreateInfo structures"),
		CreateInstance["pAllocator"],
		VkPipeline.p.OUT("pPipelines", "a pointer to an array in which the resulting compute pipeline objects are returned")
	)

	void(
		"DestroyPipeline",
		"""
		Destroys a graphics or compute pipeline object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pipeline} is not #NULL_HANDLE, {@code pipeline} $must be a valid {@code VkPipeline} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code pipeline} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code pipeline} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to {@code pipeline} $must have completed execution",
			"If ##VkAllocationCallbacks were provided when {@code pipeline} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code pipeline} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code pipeline} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the pipeline"),
		VkPipeline.IN("pipeline", "the handle of the pipeline to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"CreatePipelineLayout",
		"""
		Creates a new pipeline layout object.

		Access to descriptor sets from a pipeline is accomplished through a pipeline layout. Zero or more descriptor set layouts and zero or more push constant
		ranges are combined to form a pipeline layout object which describes the complete set of resources that $can be accessed by a pipeline. The pipeline
		layout represents a sequence of descriptor sets with each having a specific layout. This sequence of layouts is used to determine the interface between
		shader stages and shader resources. Each pipeline is created using a pipeline layout.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkPipelineLayoutCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pPipelineLayout} $must be a pointer to a {@code VkPipelineLayout} handle"
		)}

		Once created, pipeline layouts are used as part of pipeline creation, as part of binding descriptor sets, and as part of setting push constants.
		Pipeline creation accepts a pipeline layout as input, and the layout $may be used to map (set, binding, arrayElement) tuples to hardware resources or
		memory locations within a descriptor set. The assignment of hardware resources depends only on the bindings defined in the descriptor sets that
		comprise the pipeline layout, and not on any shader source.

		All resource variables statically used in all shaders in a pipeline $must be declared with a (set, binding, arrayElement) that exists in the
		corresponding descriptor set layout and is of an appropriate descriptor type and includes the set of shader stages it is used by in {@code stageFlags}.
		The pipeline layout can include entries that are not used by a particular pipeline, or that are dead-code eliminated from any of the shaders. The
		pipeline layout allows the application to provide a consistent set of bindings across multiple pipeline compiles, which enables those pipelines to be
		compiled in a way that the implementation may cheaply switch pipelines without reprogramming the bindings.

		Similarly, the push constant block declared in each shader (if present) $must only place variables at offsets that are each included in a push constant
		range with {@code stageFlags} including the bit corresponding to the shader stage that uses it. The pipeline layout $can include ranges or portions of
		ranges that are not used by a particular pipeline, or for which the variables have been dead-code eliminated from any of the shaders.

		There is a limit on the total number of resources of each type that can be included in bindings in all descriptor set layouts in a pipeline layout as
		shown in the table below. The “Total Resources Available” column gives the limit on the number of each type of resource that can be included in
		bindings in all descriptor sets in the pipeline layout. Some resource types count against multiple limits. Additionally, there are limits on the total
		number of each type of resource that can be used in any pipeline stage.
		${table(
			tr(th("Total Resources Available"), th("Resource Types")),

			tr(td("maxDescriptorSetSamplers", rowspan = 2), td("sampler")),
			tr(td("combined image sampler")),

			tr(td("maxDescriptorSetSampledImages", rowspan = 3), td("sampled image")),
			tr(td("combined image sampler")),
			tr(td("uniform texel buffer")),

			tr(td("maxDescriptorSetStorageImages", rowspan = 2), td("storage image")),
			tr(td("storage texel buffer")),

			tr(td("maxDescriptorSetUniformBuffers", rowspan = 2), td("uniform buffer")),
			tr(td("uniform buffer dynamic")),

			tr(td("maxDescriptorSetUniformBuffersDynamic"), td("uniform buffer dynamic")),

			tr(td("maxDescriptorSetStorageBuffers", rowspan = 2), td("storage buffer")),
			tr(td("storage buffer dynamic")),

			tr(td("maxDescriptorSetStorageBuffersDynamic"), td("storage buffer dynamic")),

			tr(td("maxDescriptorSetInputAttachments"), td("input attachment"))
		)}

		<h5>Pipeline Layout Compatibility</h5>

		Two pipeline layouts are defined to be “compatible for push constants” if they were created with identical push constant ranges. Two pipeline layouts
		are defined to be “compatible for set N” if they were created with matching (the same, or identically defined) descriptor set layouts for sets zero
		through N, and if they were created with identical push constant ranges.

		When binding a descriptor set  to set number N, if the previously bound descriptor sets for sets zero through N-1 were all bound using compatible
		pipeline layouts, then performing this binding does not disturb any of the lower numbered sets. If, additionally, the previous bound descriptor set for
		set N was bound using a pipeline layout compatible for set N, then the bindings in sets numbered greater than N are also not disturbed.

		Similarly, when binding a pipeline, the pipeline $can correctly access any previously bound descriptor sets which were bound with compatible pipeline
		layouts, as long as all lower numbered sets were also bound with compatible layouts.

		Layout compatibility means that descriptor sets $can be bound to a command buffer for use by any pipeline created with a compatible pipeline layout,
		and without having bound a particular pipeline first. It also means that descriptor sets can remain valid across a pipeline change, and the same
		resources will be accessible to the newly bound pipeline.

		${note(
			"""
			A consequence of layout compatibility is that when the implementation compiles a pipeline layout and assigns hardware units to resources, the
			mechanism to assign hardware units for set N $should only be a function of sets [0..N].
			""",
			"Implementor’s Note"
		)}

		${note(
			"""
			Place the least frequently changing descriptor sets near the start of the pipeline layout, and place the descriptor sets representing the most
			frequently changing resources near the end. When pipelines are switched, only the descriptor set bindings that have been invalidated will need to
			be updated and the remainder of the descriptor set bindings will remain in place.
			"""
		)}

		The maximum number of descriptor sets that $can be bound to a pipeline layout is queried from physical device properties (see
		##VkPhysicalDeviceLimits{@code ::maxBoundDescriptorSets}).
		""",

		VkDevice.IN("device", "the logical device that creates the pipeline layout"),
		const..VkPipelineLayoutCreateInfo_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkPipelineLayoutCreateInfo structure specifying the state of the pipeline layout object"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkPipelineLayout.p.OUT(
			"pPipelineLayout",
			"points to a {@code VkPipelineLayout} handle in which the resulting pipeline layout object is returned"
		)
	)

	void(
		"DestroyPipelineLayout",
		"""
		Destroys a pipeline layout object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pipelineLayout} is not #NULL_HANDLE, {@code pipelineLayout} $must be a valid {@code VkPipelineLayout} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code pipelineLayout} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code pipelineLayout} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"If ##VkAllocationCallbacks were provided when {@code pipelineLayout} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code pipelineLayout} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code pipelineLayout} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the pipeline layout"),
		VkPipelineLayout.IN("pipelineLayout", "the pipeline layout to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"CreateSampler",
		"""
		Creates a new sampler object.

		{@code VkSampler} objects encapsulate the state of an image sampler which is used by the implementation to read image data and apply filtering and
		other transformations for the shader.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkSamplerCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSampler} $must be a pointer to a {@code VkSampler} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the sampler"),
		const..VkSamplerCreateInfo_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkSamplerCreateInfo structure specifying the state of the sampler object"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkSampler.p.OUT("pSampler", "points to a {@code VkSampler} handle in which the resulting sampler object is returned")
	)

	void(
		"DestroySampler",
		"""
		Destroys a sampler object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code sampler} is not #NULL_HANDLE, {@code sampler} $must be a valid {@code VkSampler} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code sampler} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code sampler} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to {@code sampler} $must have completed execution",
			"If ##VkAllocationCallbacks were provided when {@code sampler} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code sampler} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code sampler} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the sampler"),
		VkSampler.IN("sampler", "the sampler to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"CreateDescriptorSetLayout",
		"""
		Creates a new descriptor set layout object.

		A descriptor set layout object is defined by an array of zero or more descriptor bindings. Each individual descriptor binding is specified by a
		descriptor type, a count (array size) of the number of descriptors in the binding, a set of shader stages that can access the binding, and (if using
		immutable samplers) an array of sampler descriptors.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkDescriptorSetLayoutCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSetLayout} $must be a pointer to a {@code VkDescriptorSetLayout} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the descriptor set layout"),
		const..VkDescriptorSetLayoutCreateInfo_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkDescriptorSetLayoutCreateInfo structure specifying the state of the descriptor set layout object"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkDescriptorSetLayout.p.OUT(
			"pSetLayout",
			"points to a {@code VkDescriptorSetLayout} handle in which the resulting descriptor set layout object is returned"
		)
	)

	void(
		"DestroyDescriptorSetLayout",
		"""
		Destroys a descriptor set layout object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code descriptorSetLayout} is not #NULL_HANDLE, {@code descriptorSetLayout} $must be a valid {@code VkDescriptorSetLayout} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code descriptorSetLayout} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code descriptorSetLayout} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"If ##VkAllocationCallbacks were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code descriptorSetLayout} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code descriptorSetLayout} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the descriptor set layout"),
		VkDescriptorSetLayout.IN("descriptorSetLayout", "the descriptor set layout to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"CreateDescriptorPool",
		"""
		Creates a descriptor pool object.

		Descriptor sets are allocated from descriptor pool objects. A descriptor pool maintains a pool of descriptors, from which sets are allocated.
		Descriptor pools are externally synchronized, meaning that the application must not allocate and/or free descriptor sets from the same pool in multiple
		threads simultaneously.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkDescriptorPoolCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pDescriptorPool} $must be a pointer to a {@code VkDescriptorPool} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the descriptor pool"),
		const..VkDescriptorPoolCreateInfo_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkDescriptorPoolCreateInfo structure specifying the state of the descriptor pool object"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkDescriptorPool.p.OUT("pDescriptorPool", "points to a {@code VkDescriptorPool} handle in which the resulting descriptor pool object is returned")
	)

	void(
		"DestroyDescriptorPool",
		"""
		Destroys a descriptor pool object.

		When a pool is destroyed, all descriptor sets allocated from the pool are implicitly freed and become invalid. Descriptor sets allocated from a given
		pool do not need to be freed before destroying that descriptor pool.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code descriptorPool} is not #NULL_HANDLE, {@code descriptorPool} $must be a valid {@code VkDescriptorPool} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code descriptorPool} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code descriptorPool} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to {@code descriptorPool} (via any allocated descriptor sets) $must have completed execution",
			"If ##VkAllocationCallbacks were provided when {@code descriptorPool} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code descriptorPool} was created, {@code pAllocator} $must be $NULL"
		)}
		""",

		VkDevice.IN("device", "the logical device that destroys the descriptor pool"),
		VkDescriptorPool.IN("descriptorPool", "the descriptor pool to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"ResetDescriptorPool",
		"""
		Resets a descriptor pool object.

		Rather than freeing individual descriptor sets, all descriptor sets allocated from a given pool can be returned to the pool by calling this function.

		Resetting a descriptor pool recycles all of the resources from all of the descriptor sets allocated from the descriptor pool back to the descriptor
		pool, and the descriptor sets are implicitly freed.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code descriptorPool} $must be a valid {@code VkDescriptorPool} handle",
			"{@code flags} $must be 0",
			"{@code descriptorPool} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code descriptorPool} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"All uses of {@code descriptorPool} (via any allocated descriptor sets) $must have completed execution"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code descriptorPool} must be externally synchronized",
			"Host access to any {@code VkDescriptorSet} objects allocated from {@code descriptorPool} must be externally synchronized"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the descriptor pool"),
		VkDescriptorPool.IN("descriptorPool", "the descriptor pool to be reset"),
		VkDescriptorPoolResetFlags.IN("flags", "is currently unused and must be zero")
	)

	VkResult(
		"AllocateDescriptorSets",
		"""
		Allocates descriptor sets from a descriptor pool.

		When a descriptor set is allocated, the initial state is largely uninitialized and all descriptors are undefined. However, the descriptor set can be
		bound in a command buffer without causing errors or exceptions. All entries that are statically used by a pipeline in a drawing or dispatching command
		$must have been populated before the descriptor set is bound for use by that command. Entries that are not statically used by a pipeline $can have
		uninitialized descriptors or descriptors of resources that have been destroyed, and executing a draw or dispatch with such a descriptor set bound does
		not cause undefined behavior. This means applications need not populate unused entries with dummy descriptors.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pAllocateInfo} $must be a pointer to a valid ##VkDescriptorSetAllocateInfo structure",
			"{@code pDescriptorSets} $must be a pointer to an array of {@code pAllocateInfo->descriptorSetCount} {@code VkDescriptorSet} handles"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code pAllocateInfo->descriptorPool} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the descriptor pool"),
		const..VkDescriptorSetAllocateInfo_p.IN(
			"pAllocateInfo",
			"a pointer to an instance of the ##VkDescriptorSetAllocateInfo structure describing parameters of the allocation"
		),
		Check("pAllocateInfo.descriptorSetCount()")..VkDescriptorSet.p.OUT(
			"pDescriptorSets",
			"""
			a pointer to an array of {@code VkDescriptorSet} handles in which the resulting descriptor set objects are returned. The array must be at least the
			length specified by the {@code descriptorSetCount} member of {@code pAllocateInfo}.
			"""
		)
	)

	VkResult(
		"FreeDescriptorSets",
		"""
		Frees one or more descriptor sets.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code descriptorPool} $must be a valid {@code VkDescriptorPool} handle",
			"The value of {@code descriptorSetCount} $must be greater than 0",
			"{@code descriptorPool} $must have been created, allocated or retrieved from {@code device}",
			"Each element of {@code pDescriptorSets} that is a valid handle $must have been created, allocated or retrieved from {@code descriptorPool}",
			"""
			Each of {@code device}, {@code descriptorPool} and the elements of {@code pDescriptorSets} that are valid handles $must have been created,
			allocated or retrieved from the same {@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to any element of {@code pDesciptorSets} $must have completed execution",
			"""
			{@code pDescriptorSets} $must be a pointer to an array of {@code descriptorSetCount} {@code VkDescriptorSet} handles, each element of which $must
			either be a valid handle or #NULL_HANDLE
			""",
			"{@code descriptorPool} $must have been created with the #DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT flag"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code descriptorPool} must be externally synchronized",
			"Host access to each member of {@code pDescriptorSets} must be externally synchronized"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the descriptor pool"),
		VkDescriptorPool.IN("descriptorPool", "the descriptor pool from which the descriptor sets were allocated"),
		AutoSize("pDescriptorSets")..uint32_t.IN("descriptorSetCount", "the number of elements in the {@code pDescriptorSets} array"),
		SingleValue("pDescriptorSet")..const..VkDescriptorSet.p.IN(
			"pDescriptorSets",
			"""
			an array of handles to {@code VkDescriptorSet} objects. All elements of {@code pDescriptorSets} must have been allocated from
			{@code descriptorPool}.
			"""
		)
	)

	void(
		"UpdateDescriptorSets",
		"""
		Updates the contents of a descriptor set object.

		Once allocated, descriptor sets can be updated with a combination of write and copy operations.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"""
			If {@code descriptorWriteCount} is not 0, {@code pDescriptorWrites} $must be a pointer to an array of {@code descriptorWriteCount} valid
			##VkWriteDescriptorSet structures
			""",
			"""
			If {@code descriptorCopyCount} is not 0, {@code pDescriptorCopies} $must be a pointer to an array of {@code descriptorCopyCount} valid
			##VkCopyDescriptorSet structures
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pDescriptorWrites[].dstSet} must be externally synchronized",
			"Host access to {@code pDescriptorCopies[].dstSet} must be externally synchronized"
		)}
		""",

		VkDevice.IN("device", "the logical device that updates the descriptor sets"),
		AutoSize("pDescriptorWrites")..uint32_t.IN("descriptorWriteCount", "the number of elements in the {@code pDescriptorWrites} array"),
		nullable..const..VkWriteDescriptorSet_p.IN(
			"pDescriptorWrites",
			"a pointer to an array of ##VkWriteDescriptorSet structures describing the descriptor sets to write to"
		),
		AutoSize("pDescriptorCopies")..uint32_t.IN("descriptorCopyCount", "the number of elements in the {@code pDescriptorCopies} array"),
		nullable..const..VkCopyDescriptorSet_p.IN(
			"pDescriptorCopies",
			"a pointer to an array of ##VkCopyDescriptorSet structures describing the descriptor sets to copy between"
		)
	)

	VkResult(
		"CreateFramebuffer",
		"""
		Creates a new framebuffer object.

		Render passes operate in conjunction with framebuffers, which represent a collection of specific memory attachments that a render pass instance uses.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkFramebufferCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pFramebuffer} $must be a pointer to a {@code VkFramebuffer} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the framebuffer"),
		const..VkFramebufferCreateInfo_p.IN(
			"pCreateInfo",
			"points to a ##VkFramebufferCreateInfo structure which describes additional information about framebuffer creation"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkFramebuffer.p.OUT("pFramebuffer", "points to a {@code VkFramebuffer} handle in which the resulting framebuffer object is returned")
	)

	void(
		"DestroyFramebuffer",
		"""
		Destroys a framebuffer object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code framebuffer} is not #NULL_HANDLE, {@code framebuffer} $must be a valid {@code VkFramebuffer} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code framebuffer} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code framebuffer} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All submitted commands that refer to {@code framebuffer} $must have completed execution",
			"If ##VkAllocationCallbacks were provided when {@code framebuffer} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code framebuffer} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code framebuffer} $must be externally synchronized
		""",

		VkDevice.IN("device", "the logical device that destroys the framebuffer"),
		VkFramebuffer.IN("framebuffer", "the handle of the framebuffer to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"CreateRenderPass",
		"""
		Creates a new render pass object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkRenderPassCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pRenderPass} $must be a pointer to a {@code VkRenderPass} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the render pass"),
		const..VkRenderPassCreateInfo_p.IN(
			"pCreateInfo",
			"a pointer to an instance of the ##VkRenderPassCreateInfo structure that describes the parameters of the render pass"
		),
		CreateInstance["pAllocator"],
		Check(1)..VkRenderPass.p.OUT("pRenderPass", "points to a {@code VkRenderPass} handle in which the resulting render pass object is returned")
	)

	void(
		"DestroyRenderPass",
		"""
		Destroys a render pass object.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code renderPass} is not #NULL_HANDLE, {@code renderPass} $must be a valid {@code VkRenderPass} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code renderPass} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code renderPass} that are valid handles $must have been created, allocated or retrieved from the same
			{@code kPhysicalDevice}
			""",
			"All submitted commands that refer to {@code renderPass} $must have completed execution",
			"If ##VkAllocationCallbacks were provided when {@code renderPass} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code renderPass} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code renderPass} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the render pass"),
		VkRenderPass.IN("renderPass", "the handle of the render pass to destroy"),
		CreateInstance["pAllocator"]
	)

	void(
		"GetRenderAreaGranularity",
		"""
		Queries the granularity for optimal render area.

		The conditions leading to an optimal {@code renderArea} are:
		${ul(
			"the {@code offset.x} member in {@code renderArea} is a multiple of the width member of the returned ##VkExtent2D (the horizontal granularity).",
			"the {@code offset.y} member in {@code renderArea} is a multiple of the height of the returned ##VkExtent2D (the vertical granularity).",
			"""
			either the {@code offset.width} member in {@code renderArea} is a multiple of the horizontal granularity or {@code offset.x+offset.width} is equal
			to the width of the framebuffer in the ##VkRenderPassBeginInfo.
			""",
			"""
			either the {@code offset.height} member in {@code renderArea} is a multiple of the vertical granularity or {@code offset.y+offset.height} is equal
			to the height of the framebuffer in the ##VkRenderPassBeginInfo.
			"""
		)}

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code renderPass} $must be a valid {@code VkRenderPass} handle",
			"{@code pGranularity} $must be a pointer to a ##VkExtent2D structure",
			"{@code renderPass} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code renderPass} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the render pass"),
		VkRenderPass.IN("renderPass", "a handle to a render pass"),
		VkExtent2D.p.OUT("pGranularity", "points to a ##VkExtent2D structure in which the granularity is returned")
	)

	}
	separateMethod {

	VkResult(
		"CreateCommandPool",
		"""
		Creates a new command pool object.

		Command pools are opaque objects that command buffer memory is allocated from, and which allow the implementation to amortize the cost of resource
		creation across multiple command buffers. Command pools are application-synchronized, meaning that a command pool must not be used concurrently in
		multiple threads. That includes use via recording commands on any command buffers allocated from the pool, as well as operations that allocate, free,
		and reset command buffers or the pool itself.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkCommandPoolCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pCommandPool} $must be a pointer to a {@code VkCommandPool} handle"
		)}
		""",

		VkDevice.IN("device", "the logical device that creates the command pool"),
		const..VkCommandPoolCreateInfo_p.IN("pCreateInfo", "contains information used to create the command pool"),
		CreateInstance["pAllocator"],
		Check(1)..VkCommandPool.p.OUT("pCommandPool", "points to an {@code VkCommandPool} handle in which the created pool is returned")
	)

	void(
		"DestroyCommandPool",
		"""
		Destroys a command pool object.

		When a pool is destroyed, all command buffers allocated from the pool are implicitly freed and become invalid. Command buffers allocated from a given
		pool do not need to be freed before destroying that command pool.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code commandPool} is not #NULL_HANDLE, {@code commandPool} $must be a valid {@code VkCommandPool} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code commandPool} is a valid handle, it $must have been created, allocated or retrieved from {@code device}",
			"""
			Each of {@code device} and {@code commandPool} that are valid handles $must have been created, allocated or retrieved from the same
			{@code VkPhysicalDevice}
			""",
			"All ##VkCommandBuffer objects allocated from {@code commandPool} $mustnot be pending execution",
			"If ##VkAllocationCallbacks were provided when {@code commandPool} was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when {@code commandPool} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandPool} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that destroys the command pool"),
		VkCommandPool.IN("commandPool", "the handle of the command pool to destroy"),
		CreateInstance["pAllocator"]
	)

	VkResult(
		"ResetCommandPool",
		"""
		Resets a command pool.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code commandPool} $must be a valid {@code VkCommandPool} handle",
			"{@code flags} $must be a valid combination of {@code VkCommandPoolResetFlagBits} values",
			"{@code commandPool} $must have been created, allocated or retrieved from {@code device}",
			"Each of {@code device} and {@code commandPool} $must have been created, allocated or retrieved from the same {@code VkPhysicalDevice}",
			"All ##VkCommandBuffer objects allocated from {@code commandPool} $mustnot currently be pending execution"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandPool} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the command pool"),
		VkCommandPool.IN("commandPool", "the command pool to reset"),
		VkCommandPoolResetFlags.IN("flags", "contains additional flags controlling the behavior of the reset", VkCommandPoolResetFlagBits, LinkMode.BITFIELD)
	)

	VkResult(
		"AllocateCommandBuffers",
		"""
		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pAllocateInfo} $must be a pointer to a valid ##VkCommandBufferAllocateInfo structure",
			"{@code pCommandBuffers} $must be a pointer to an array of {@code pAllocateInfo->commandBufferCount} {@code VkCommandBuffer} handles"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code pAllocateInfo->commandPool} $must be externally synchronized.
		""",

		VkDevice.IN("device", "the logical device that owns the command pool"),
		const..VkCommandBufferAllocateInfo_p.IN(
			"pAllocateInfo",
			"an instance of the ##VkCommandBufferAllocateInfo structure which defines additional information about creating the pool"
		),
		Check("pAllocateInfo.commandBufferCount()")..VkCommandBuffer.p.OUT(
			"pCommandBuffers",
			"points to an array in which the allocated command buffers are returned. Each allocated command buffer begins in the initial state."
		)
	)

	void(
		"FreeCommandBuffers",
		"""
		Frees command buffers.

		<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code commandPool} $must be a valid {@code VkCommandPool} handle",
			"The value of {@code commandBufferCount} $must be greater than 0",
			"{@code commandPool} $must have been created, allocated or retrieved from {@code device}",
			"Each element of {@code pCommandBuffers} that is a valid handle $must have been created, allocated or retrieved from {@code commandPool}",
			"""
			Each of {@code device}, {@code commandPool} and the elements of {@code pCommandBuffers} that are valid handles $must have been created, allocated
			or retrieved from the same {@code VkPhysicalDevice}
			""",
			"All elements of {@code pCommandBuffers} $mustnot be pending execution",
			"""
			{@code pCommandBuffers} $must be a pointer to an array of {@code commandBufferCount} {@code VkCommandBuffer} handles, each element of which $must
			either be a valid handle or #NULL_HANDLE
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandPool} $must be externally synchronized",
			"Host access to each member of {@code pCommandBuffers} $must be externally synchronized"
		)}
		""",

		VkDevice.IN("device", "the logical device that owns the command pool"),
		VkCommandPool.IN("commandPool", "the handle of the command pool that the command buffers were allocated from"),
		AutoSize("pCommandBuffers")..uint32_t.IN("commandBufferCount", "the length of the {@code pCommandBuffers} array"),
		SingleValue("pCommandBuffer")..const..VkCommandBuffer.p.IN("pCommandBuffers", "an array of handles of command buffers to free")
	)

	VkResult(
		"BeginCommandBuffer",
		"""
		Starts recording a command buffer.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pBeginInfo} $must be a pointer to a valid ##VkCommandBufferBeginInfo structure",
			"{@code commandBuffer} $mustnot be in the recording state",
			"""
			If {@code commandBuffer} was allocated from a {@code VkCommandPool} which did not have the #COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT flag set,
			{@code commandBuffer} $must be in the initial state
			""",
			"""
			If {@code commandBuffer} is a secondary command buffer, the {@code pInheritanceInfo} member of {@code pBeginInfo} $must be a valid
			##VkCommandBufferInheritanceInfo structure
			""",
			"""
			If {@code commandBuffer} is a secondary command buffer and either the {@code occlusionQueryEnable} member of the {@code pInheritanceInfo} member of
			{@code pBeginInfo} is #FALSE, or the precise occlusion queries feature is not enabled, the {@code queryFlags} member of the
			{@code pInheritanceInfo} member {@code pBeginInfo} $mustnot contain #QUERY_CONTROL_PRECISE_BIT
			"""
		)}

		A primary command buffer is considered to be pending execution from the time it is submitted via #QueueSubmit() until that submission completes.

		A secondary command buffer is considered to be pending execution from the time its execution is recorded into a primary buffer (via
		#CmdExecuteCommands()) until the final time that primary buffer’s submission to a queue completes. If, after the primary buffer completes, the
		secondary command buffer is recorded to execute on a different primary buffer, the first primary buffer $mustnot be resubmitted until after it is reset
		with #ResetCommandBuffer().

		If #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT is not set on a secondary command buffer, that command buffer must not be used more than once in a given
		primary command buffer. Furthermore, if a secondary command buffer without #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT set is recorded to execute in a
		primary command buffer with #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT set, the primary command buffer must not be pending execution more than once at
		a time.

		${note(
			"""
			On some implementations, not using the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT bit enables command buffers to be patched in-place if needed,
			rather than creating a copy of the command buffer.
			"""
		)}

		If a command buffer is in the executable state and the command buffer was allocated from a command pool with the
		#COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT flag set, then {@code vkBeginCommandBuffer} implicitly resets the command buffer, behaving as if
		#ResetCommandBuffer() had been called with #COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT not set. It then puts the command buffer in the recording state.

		Once recording starts, an application records a sequence of commands ({@code vkCmd*}) to set state in the command buffer, draw, dispatch, and other
		commands.
		""",

		VkCommandBuffer.IN("commandBuffer", "the handle of the command buffer which is to be put in the recording state"),
		const..VkCommandBufferBeginInfo_p.IN(
			"pBeginInfo",
			"an instance of the ##VkCommandBufferBeginInfo structure, which defines additional information about how the command buffer begins recording"
		)
	)

	VkResult(
		"EndCommandBuffer",
		"""
		Completes recording a command buffer.

		If there was an error during recording, the application will be notified by an unsuccessful return code returned by {@code vkEndCommandBuffer}. If the
		application wishes to further use the command buffer, the command buffer must be reset.

		When a command buffer is in the executable state, it can be submitted to a queue for execution.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"#EndCommandBuffer() $mustnot be called inside a render pass instance",
			"All queries made active during the recording of {@code commandBuffer} $must have been made inactive"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN(
			"commandBuffer",
			"the command buffer to complete recording. The command buffer must have been in the recording state, and is moved to the executable state."
		)
	)

	VkResult(
		"ResetCommandBuffer",
		"""
		Resets a command buffer.

		If {@code flags} includes #COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT, then most or all memory resources currently owned by the command buffer should
		be returned to the parent command pool. If this flag is not set, then the command buffer may hold onto memory resources and reuse them when recording
		commands.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code flags} $must be a valid combination of {@code VkCommandBufferResetFlagBits} values",
			"{@code commandBuffer} $mustnot currently be pending execution",
			"{@code commandBuffer} $must have been allocated from a pool that was created with the #COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer to reset. The command buffer can be in any state, and is put in the initial state."),
		VkCommandBufferResetFlags.IN("flags", "is of type {@code VkCommandBufferResetFlags}", VkCommandBufferResetFlagBits, LinkMode.BITFIELD)
	)

	void(
		"CmdBindPipeline",
		"""
		Binds a pipeline object to a command buffer.

		Once bound, a pipeline binding affects subsequent graphics or compute commands in the command buffer until a different pipeline is bound to the bind
		point. The pipeline bound to #PIPELINE_BIND_POINT_COMPUTE controls the behavior of #CmdDispatch() and #CmdDispatchIndirect(). The pipeline bound to
		#PIPELINE_BIND_POINT_GRAPHICS controls the behavior of #CmdDraw(), #CmdDrawIndexed(), #CmdDrawIndirect(), and #CmdDrawIndexedIndirect(). No other
		commands are affected by the pipeline state.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pipelineBindPoint} $must be a valid {@code VkPipelineBindPoint} value",
			"{@code pipeline} $must be a valid {@code VkPipeline} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics or compute operations",
			"Each of {@code commandBuffer} and {@code pipeline} $must have been created, allocated or retrieved from the same {@code VkDevice}",
			"""
			If the value of {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_COMPUTE, the ##VkCommandPool that {@code commandBuffer} was allocated from $must
			support compute operations
			""",
			"""
			If the value of {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_GRAPHICS, the ##VkCommandPool that {@code commandBuffer} was allocated from $must
			support graphics operations
			""",
			"If the value of {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_COMPUTE, {@code pipeline} $must be a compute pipeline",
			"If the value of {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_GRAPHICS, {@code pipeline} $must be a graphics pipeline",
			"""
			If the variable multisample rate feature is not supported, {@code pipeline} is a graphics pipeline, the current subpass has no attachments, and
			this is not the first call to this function with a graphics pipeline after transitioning to the current subpass, then the sample count specified by
			this pipeline $must match that set in the previous pipeline
			"""
		)}
		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer that the pipeline will be bound to"),
		VkPipelineBindPoint.IN(
			"pipelineBindPoint",
			"the bind point. There are separate bind points for each of graphics and compute, so binding one does not disturb the other.",
			VkPipelineBindPoints
		),
		VkPipeline.IN("pipeline", "the pipeline to be bound")
	)

	void(
		"CmdSetViewport",
		"""
		Sets the viewport on a command buffer.

		If the bound pipeline state object was not created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled, viewport transformation parameters are
		specified using the {@code pViewports} member of ##VkPipelineViewportStateCreateInfo in the pipeline state object. If the pipeline state object was
		created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled, the viewport transformation parameters are dynamically set and changed with this
		command.

		The viewport parameters taken from element {@code i} of {@code pViewports} replace the current state for the viewport index
		{@code firstViewport + i}, for {@code i} in {@code [0,viewportCount)}.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pViewports} $must be a pointer to an array of {@code viewportCount} valid ##VkViewport structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"The value of {@code viewportCount} $must be greater than 0",
			"{@code firstViewport} $must be less than ##VkPhysicalDeviceLimits{@code ::maxViewports}",
			"The sum of {@code firstViewport} and {@code viewportCount} $must be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded"),
		uint32_t.IN("firstViewport", "the index of the first viewport whose parameters are updated by the command"),
		AutoSize("pViewports")..uint32_t.IN("viewportCount", "the number of viewports whose parameters are updated by the command"),
		const..VkViewport.p.IN("pViewports", "a pointer to an array of {@code VkViewport} structures specifying viewport parameters")
	)

	void(
		"CmdSetScissor",
		"""
		Sets the dynamic scissor rectangles on a command buffer.

		The scissor test determines if a fragment’s framebuffer coordinates ${code("(x<sub>f</sub>,y<sub>f</sub>)")} lie within the scissor rectangle
		corresponding to the viewport index used by the primitive that generated the fragment. If the pipeline state object is created without
		#DYNAMIC_STATE_SCISSOR enabled then the scissor rectangles are set by the ##VkPipelineViewportStateCreateInfo state of the pipeline state object.
		Otherwise, use this command to dynamically set the scissor rectangles.

		The scissor rectangles taken from element {@code i} of {@code pScissors} replace the current state for the scissor index {@code firstScissor + i}, for
		{@code i} in {@code [0,scissorCount)}.

		Each scissor rectangle is described by a ##VkRect2D structure, with the {@code offset.x} and {@code offset.y} values determining the upper left corner
		of the scissor rectangle, and the {@code extent.width} and {@code extent.height} values determining the size in pixels.

		If ${code("offset.x &le; x<sub>f</sub> &lt; offset.x + extent.width")}  and ${code("offset.y &le; y<sub>f</sub> &lt; offset.y + extent.height")} for
		the selected scissor rectangle, then the scissor test passes. Otherwise, the test fails and the fragment is discarded. For points, lines, and polygons,
		the scissor rectangle for a primitive is selected in the same manner as the viewport. The scissor rectangles only apply to drawing commands, not to
		other commands like clears or copies.

		It is legal for {@code offset.x + extent.width} or {@code offset.y + extent.height} to exceed the dimensions of the framebuffer - the scissor test
		still applies as defined above. Rasterization does not produce fragments outside of the framebuffer, so such fragments never have the scissor test
		performed on them.

		The scissor test is always performed. Applications can effectively disable the scissor test by specifying a scissor rectangle that encompasses the
		entire framebuffer.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pScissors} $must be a pointer to an array of {@code scissorCount} ##VkRect2D structures",
			"{@code commandBuffer} $must be in the recording state",
			"The ##VkCommandPool that {@code commandBuffer} was allocated from $must support graphics operations",
			"The value of {@code scissorCount} $must be greater than 0",
			"{@code firstScissor} $must be less than ##VkPhysicalDeviceLimits{@code ::maxViewports}",
			"The sum of {@code firstScissor} and {@code scissorCount} $must be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive",
			"The {@code x} and {@code y} members of {@code offset} $must be greater than or equal to 0",
			"Evaluation of ({@code offset.x + extent.width}) $mustnot cause a signed integer addition overflow",
			"Evaluation of ({@code offset.y + extent.height}) $mustnot cause a signed integer addition overflow"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded"),
		uint32_t.IN("firstScissor", "the index of the first scissor whose state is updated by the command"),
		AutoSize("pScissors")..uint32_t.IN("scissorCount", "the number of scissors whose rectangles are updated by the command"),
		const..VkRect2D.p.IN("pScissors", "a pointer to an array of ##VkRect2D structures defining scissor rectangles")
	)

	void(
		"CmdSetLineWidth",
		"""
		Sets the dynamic line width state.

		A line is drawn by generating a set of fragments overlapping a rectangle centered on the line segment. Each line segment has an associated width that
		controls the width of that rectangle.

		The line width is set by the {@code lineWidth} property of ##VkPipelineRasterizationStateCreateInfo in the currently active pipeline if the pipeline
		was not created with #DYNAMIC_STATE_LINE_WIDTH enabled. Otherwise, the line width is set by calling {@code vkCmdSetLineWidth}.

		Not all line widths need be supported for line segment rasterization, but width 1.0 antialiased segments must be provided. The range and gradations are
		obtained from the {@code lineWidthRange} and {@code lineWidthGranularity} members of ##VkPhysicalDeviceLimits. If, for instance, the size range is from
		0.1 to 2.0 and the gradation size is 0.1, then the size 0.1, 0.2, …, 1.9, 2.0 are supported. Additional line widths may also be supported. There is no
		requirement that these widths be equally spaced. If an unsupported width is requested, the nearest supported width is used instead.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"If the wide lines feature is not enabled, the value of {@code lineWidth} $must be 1.0"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded"),
		float.IN("lineWidth", "the width of rasterized line segments")
	)

	void(
		"CmdSetDepthBias",
		"""
		Sets the depth bias dynamic state.

		The depth values of all fragments generated by the rasterization of a polygon can be offset by a single value that is computed for that polygon. This
		behavior is controlled by the {@code depthBiasEnable}, {@code depthBiasConstantFactor}, {@code depthBiasClamp}, and {@code depthBiasSlopeFactor}
		members of ##VkPipelineRasterizationStateCreateInfo, or by the corresponding parameters to the {@code vkCmdSetDepthBias} command if depth bias state is
		dynamic.

		If {@code depthBiasEnable} is #FALSE, no depth bias is applied and the fragment’s depth values are unchanged.

		{@code depthBiasSlopeFactor} scales the maximum depth slope of the polygon, and {@code depthBiasConstantFactor} scales an implementation-dependent
		constant that relates to the usable resolution of the depth buffer. The resulting values are summed to produce the depth bias value which is then
		clamped to a minimum or maximum value specified by {@code depthBiasClamp}. {@code depthBiasSlopeFactor}, {@code depthBiasConstantFactor}, and
		{@code depthBiasClamp} $can each be positive, negative, or zero.

		The maximum depth slope mm of a triangle is
		${codeBlock(
			"""
			m = sqrt((&part;z<sub>f</sub> / &part;x<sub>f</sub>)<sup>2</sup> + (&part;z<sub>f</sub> / &part;y<sub>f</sub>)<sup>2</sup>)
			"""
		)}

		where ${code("(x<sub>f</sub>,y<sub>f</sub>,z<sub>f</sub>)")} is a point on the triangle. {@code m} may be approximated as
		${codeBlock(
			"""
			m = max(abs(&part;z<sub>f</sub> / &part;x<sub>f</sub>), abs(&part;z<sub>f</sub> / &part;y<sub>f</sub>))
			"""
		)}

		The minimum resolvable difference {@code r} is an implementation-dependent parameter that depends on the depth buffer representation. It is the
		smallest difference in framebuffer coordinate {@code z} values that is guaranteed to remain distinct throughout polygon rasterization and in the depth
		buffer. All pairs of fragments generated by the rasterization of two polygons with otherwise identical vertices, but ${code("z<sub>f</sub>")} values
		that differ by {@code r}, will have distinct depth values.

		For fixed-point depth buffer representations, {@code r} is constant throughout the range of the entire depth buffer. For floating-point depth buffers,
		there is no single minimum resolvable difference. In this case, the minimum resolvable difference for a given polygon is dependent on the maximum
		exponent, {@code e}, in the range of {@code z} values spanned by the primitive. If {@code n} is the number of bits in the floating-point mantissa, the
		minimum resolvable difference, {@code r}, for the given primitive is defined as
		${codeBlock(
			"""
			r = 2<sup>e-n</sup>
			"""
		)}

		If no depth buffer is present, {@code r} is undefined.

		The bias value {@code o} for a polygon is
		<table>
		${tr(td(code("o ="), rowspan = 3), td(code("m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor")), td(code("when depthBiasClamp = 0 or NaN")))}
		${tr(td(code("min(m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor, depthBiasClamp)")), td(code("when depthBiasClamp &gt; 0")))}
		${tr(td(code("max(m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor, depthBiasClamp)")), td(code("when depthBiasClamp &lt; 0")))}
		</table>

		{@code m} is computed as described above. If the depth buffer uses a fixed-point representation, {@code m} is a function of depth values in the range
		{@code [0,1]}, and {@code o} is applied to depth values in the same range.

		For fixed-point depth buffers, fragment depth values are always limited to the range {@code [0,1]} by clamping after depth bias addition is performed.
		Fragment depth values are clamped even when the depth buffer uses a floating-point representation.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The ##VkCommandPool that {@code commandBuffer} was allocated from $must support graphics operations",
			"If the depth bias clamping feature is not enabled, the value of {@code depthBiasClamp} $must be 0.0"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded"),
		float.IN("depthBiasConstantFactor", "a scalar factor controlling the constant depth value added to each fragment"),
		float.IN("depthBiasClamp", "the maximum (or minimum) depth bias of a fragment"),
		float.IN("depthBiasSlopeFactor", "a scalar factor applied to a fragment’s slope in depth bias calculations")
	)

	void(
		"CmdSetBlendConstants",
		"""
		Sets the values of blend constants.

		If the pipeline state object is created without the #DYNAMIC_STATE_BLEND_CONSTANTS dynamic state enabled then the “blend constant”
		{@code (Rc,Gc,Bc,Ac)} is specified via the {@code blendConstants} member of ##VkPipelineColorBlendStateCreateInfo. Otherwise the blend constant is
		dynamically set and changed by calling this command,

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded"),
		Check(4)..const..float_p.IN(
			"blendConstants",
			"an array of four values specifying the R, G, B, and A components of the blend constant color used in blending, depending on the blend factor"
		)
	)

	void(
		"CmdSetDepthBounds",
		"""
		Sets the depth bounds test values for a command buffer.

		The depth bounds test conditionally disables coverage of a sample based on the outcome of a comparison between the value zaza in the depth attachment
		at location ${code("(x<sub>f</sub>,y<sub>f</sub>)")} (for the appropriate sample) and a range of values. The test is enabled or disabled by the
		{@code depthBoundsTestEnable} member of ##VkPipelineDepthStencilStateCreateInfo. If the pipeline state object is created without the
		#DYNAMIC_STATE_DEPTH_BOUNDS dynamic state enabled then the range of values used in the depth bounds test are defined by the {@code minDepthBounds} and
		{@code maxDepthBounds} members of the ##VkPipelineDepthStencilStateCreateInfo structure. Otherwise, to dynamically set the depth bounds range values
		call this command.

		If ${code("minDepthBounds &le; za &le; maxDepthBounds")}, then the depth bounds test passes. Otherwise, the test fails and the sample’s coverage bit is
		cleared in the fragment. If there is no depth framebuffer attachment or if the depth bounds test is disabled, it is as if the depth bounds test always
		passes.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"The value of {@code minDepthBounds} $must be between 0.0 and 1.0, inclusive",
			"The value of {@code maxDepthBounds} $must be between 0.0 and 1.0, inclusive"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded"),
		float.IN("minDepthBounds", "the lower bound of the range of depth values used in the depth bounds test"),
		float.IN("maxDepthBounds", "the upper bound of the range")
	)

	void(
		"CmdSetStencilCompareMask",
		"""
		Sets the stencil compare mask dynamic state.

		If the pipeline state object is created with the #DYNAMIC_STATE_STENCIL_COMPARE_MASK dynamic state enabled, then to dynamically set the stencil compare
		mask call this command.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code faceMask} $must be a valid combination of {@code VkStencilFaceFlagBits} values",
			"{@code faceMask} $mustnot be 0",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded"),
		VkStencilFaceFlags.IN(
			"faceMask",
			"a bitmask specifying the set of stencil state for which to update the compare mask",
			VkStencilFaceFlagBits, LinkMode.BITFIELD
		),
		uint32_t.IN("compareMask", "the new value to use as the stencil compare mask")
	)

	void(
		"CmdSetStencilWriteMask",
		"""
		Sets the stencil write mask dynamic state.

		If the pipeline state object is created with the #DYNAMIC_STATE_STENCIL_WRITE_MASK dynamic state enabled, then to dynamically set the stencil write
		mask call this command.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code faceMask} $must be a valid combination of {@code VkStencilFaceFlagBits} values",
			"{@code faceMask} $mustnot be 0",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded"),
		VkStencilFaceFlags.IN(
			"faceMask",
			"a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the write mask",
			VkStencilFaceFlagBits, LinkMode.BITFIELD
		),
		uint32_t.IN("writeMask", "the new value to use as the stencil write mask")
	)

	void(
		"CmdSetStencilReference",
		"""
		Sets the stencil reference dynamic state.

		If the pipeline state object is created with the #DYNAMIC_STATE_STENCIL_REFERENCE dynamic state enabled, then to dynamically set the stencil reference
		value call this command.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code faceMask} $must be a valid combination of {@code VkStencilFaceFlagBits} values",
			"{@code faceMask} $mustnot be 0",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded"),
		VkStencilFaceFlags.IN(
			"faceMask",
			"a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the reference value",
			VkStencilFaceFlagBits, LinkMode.BITFIELD
		),
		uint32_t.IN("reference", "the new value to use as the stencil reference value")
	)

	void(
		"CmdBindDescriptorSets",
		"""
		Binds descriptor sets to a command buffer.

		If any of the sets being bound include dynamic uniform or storage buffers, then {@code pDynamicOffsets} includes one element for each array element in
		each dynamic descriptor type binding in each set.

		{@code vkCmdBindDescriptorSets} causes the sets numbered {@code [firstSet.. firstSet+descriptorSetCount-1]} to use the bindings stored in
		{@code pDescriptorSets[0..descriptorSetCount-1]} for subsequent rendering commands (either compute or graphics, according to the
		{@code pipelineBindPoint}). Any bindings that were previously applied via these sets are no longer valid.

		Once bound, a descriptor set affects rendering of subsequent graphics or compute commands in the command buffer until a different set is bound to the
		same set number, or else until the set is disturbed.

		A compatible descriptor set must be bound for all set numbers that any shaders in a pipeline access, at the time that a draw or dispatch command is
		recorded to execute using that pipeline. However, if none of the shaders in a pipeline statically use any bindings with a particular set number, then
		no descriptor set need be bound for that set number, even if the pipeline layout includes a non-trivial descriptor set layout for that set number.

		If any of the sets being bound include dynamic uniform or storage buffers, then {@code pDynamicOffsets} includes one element for each array element in
		each dynamic descriptor type binding in each set. Values are taken from {@code pDynamicOffsets} in an order such that all entries for set N come before
		set N+1; within a set, entries are ordered by the binding numbers in the decriptor set layouts; and within a binding array, elements are in order.
		{@code dynamicOffsetCount} $must equal the total number of dynamic descriptors in the sets being bound.

		The effective offset used for dynamic uniform and storage buffer bindings is the sum of the relative offset taken from {@code pDynamicOffsets}, and the
		base address of the buffer plus base offset in the descriptor set. The length of the dynamic uniform and storage buffer bindings is the buffer range as
		specified in the descriptor set.

		Each of the {@code pDescriptorSets} $must be compatible with the pipeline layout specified by {@code layout}. The layout used to program the bindings
		must also be compatible with the pipeline used in subsequent graphics or compute commands.

		The descriptor set contents bound by a call to {@code vkCmdBindDescriptorSets} $may be consumed during host execution of the command, or during shader
		execution of the resulting draws, or any time in between. Thus, the contents $mustnot be altered (overwritten by an update command, or freed) between
		when the command is recorded and when the command completes executing on the queue. The contents of {@code pDynamicOffsets} are consumed immediately
		during execution of {@code vkCmdBindDescriptorSets}. Once all pending uses have completed, it is legal to update and reuse a descriptor set.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pipelineBindPoint} $must be a valid {@code VkPipelineBindPoint} value",
			"{@code layout} $must be a valid {@code VkPipelineLayout} handle",
			"{@code pDescriptorSets} $must be a pointer to an array of {@code descriptorSetCount} valid {@code VkDescriptorSet} handles",
			"""
			If {@code dynamicOffsetCount} is not 0, {@code pDynamicOffsets} $must be a pointer to an array of {@code dynamicOffsetCount} {@code uint32_t}
			values
			""",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics or compute operations",
			"The value of {@code descriptorSetCount} $must be greater than 0",
			"""
			Each of {@code commandBuffer}, {@code layout} and the elements of {@code pDescriptorSets} $must have been created, allocated or retrieved from the
			same {@code VkDevice}
			""",
			"""
			Any given element of {@code pDescriptorSets} $must have been created with a {@code VkDescriptorSetLayout} that matches the
			{@code VkDescriptorSetLayout} at set {@code n} in {@code layout}, where {@code n} is the sum of the index into {@code pDescriptorSets} and
			{@code firstSet}
			""",
			"{@code dynamicOffsetCount} $must be equal to the total number of dynamic descriptors in {@code pDescriptorSets}",
			"{@code pipelineBindPoint} $must be supported by the {@code commandBuffer}'s parent {@code VkCommandPool}'s queue family",
			"Any given element of {@code pDynamicOffsets} $must satisfy the required alignment for the corresponding descriptor binding's descriptor type"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer that the descriptor sets will be bound to"),
		VkPipelineBindPoint.IN(
			"pipelineBindPoint",
			"""
			a {@code VkPipelineBindPoint} indicating whether the descriptors will be used by graphics pipelines or compute pipelines. There is a separate set
			of bind points for each of graphics and compute, so binding one does not disturb the other.
			""",
			VkPipelineBindPoints
		),
		VkPipelineLayout.IN("layout", "a {@code VkPipelineLayout} object used to program the bindings"),
		uint32_t.IN("firstSet", "the set number of the first descriptor set to be bound"),
		AutoSize("pDescriptorSets")..uint32_t.IN("descriptorSetCount", "the number of elements in the {@code pDescriptorSets} array"),
		const..VkDescriptorSet.p.IN(
			"pDescriptorSets",
			"a pointer to an array of {@code VkDescriptorSet} structures describing the descriptor sets to write to"
		),
		AutoSize("pDynamicOffsets")..uint32_t.IN("dynamicOffsetCount", "the number of dynamic offsets in the {@code pDynamicOffsets} array"),
		nullable..const..uint32_t_p.IN("pDynamicOffsets", "a pointer to an array of {@code uint32_t} values specifying dynamic offsets")
	)

	void(
		"CmdBindIndexBuffer",
		"""
		Binds an index buffer to a command buffer.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code indexType} $must be a valid {@code VkIndexType} value",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"Each of {@code commandBuffer} and {@code buffer} $must have been created, allocated or retrieved from the same {@code VkDevice}",
			"The value of {@code offset} $must be less than the size of {@code buffer}",
			"""
			The sum of {@code offset}, and the address of the range of {@code VkDeviceMemory} object that's backing {@code buffer}, $must be a multiple of the
			type indicated by {@code indexType}
			""",
			"{@code buffer} $must have been created with the #BUFFER_USAGE_INDEX_BUFFER_BIT flag"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded"),
		VkBuffer.IN("buffer", "the buffer being bound"),
		VkDeviceSize.IN("offset", "the starting offset in bytes within {@code buffer} used in index buffer address calculations"),
		VkIndexType.IN("indexType", "selects whether indices are treated as 16 bits or 32 bits", VkIndexTypes)
	)

	void(
		"CmdBindVertexBuffers",
		"""
		Binds vertex buffers to a command buffer.

		The values taken from elements {@code i} of {@code pBuffers} and {@code pOffsets} replace the current state for the vertex input binding
		{@code firstBinding + i}, for {@code i} in {@code [0,bindingCount)}. The vertex input binding is updated to start at the offset indicated by
		{@code pOffsets[i]} from the start of the buffer {@code pBuffers[i]}. All vertex input attributes that use each of these bindings will use these
		updated addresses in their address calculations for subsequent draw commands.

		The address of each attribute for each {@code vertexIndex} and {@code instanceIndex} is calculated as follows:
		${ul(
			"""
			Let {@code attribDesc} be the member of ##VkPipelineVertexInputStateCreateInfo{@code ::pVertexAttributeDescriptions} with
			##VkVertexInputAttributeDescription{@code ::location} equal to the vertex input attribute number.
			""",
			"""
			Let {@code bindingDesc} be the member of {@code VkPipelineVertexInputStateCreateInfo::pVertexBindingDescriptions} with
			{@code VkVertexInputAttributeDescription::binding} equal to {@code attribDesc.binding}.
			""",
			"""
			Let {@code vertexIndex} be the index of the vertex within the draw (a value between {@code firstVertex} and {@code firstVertex+vertexCount} for
			#CmdDraw(), or a value taken from the index buffer for #CmdDrawIndexed()), and let {@code instanceIndex} be the instance number of the draw (a
			value between {@code firstInstance} and {@code firstInstance+instanceCount}).
			"""
		)}

		${codeBlock("""
bufferBindingAddress = buffer[binding].baseAddress + offset[binding];

if (bindingDesc.inputRate == VK_VERTEX_INPUT_RATE_VERTEX)
    vertexOffset = vertexIndex * bindingDesc.stride;
else
    vertexOffset = instanceIndex * bindingDesc.stride;

attribAddress = bufferBindingAddress + vertexOffset + attribDesc.offset;""")}

		For each attribute, raw data is extracted starting at {@code attribAddress} and is converted from the {@code VkVertexInputAttributeDescription}’s
		format to either to floating-point, unsigned integer, or signed integer based on the base type of the format; the base type of the format $must match
		the base type of the input variable in the shader. If format is a packed format, {@code attribAddress} must be a multiple of the size in bytes of the
		whole attribute data type. Otherwise, {@code attribAddress} must be a multiple of the size in bytes of the component type indicated by format. If the
		format does not include G, B, or A components, then those are filled with (0,0,1) as needed (using either 1.0f or integer 1 based on the format) for
		attributes that are not 64-bit data types. The number of components in the vertex shader input variable need not exactly match the number of components
		in the format. If the vertex shader has fewer components, the extra components are discarded.

		<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pBuffers} $must be a pointer to an array of {@code bindingCount} valid {@code VkBuffer} handles",
			"{@code pOffsets} $must be a pointer to an array of {@code bindingCount} {@code VkDeviceSize} values",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"The value of {@code bindingCount} $must be greater than 0",
			"Each of {@code commandBuffer} and the elements of {@code pBuffers} $must have been created, allocated or retrieved from the same {@code VkDevice}",
			"{@code firstBinding} $must be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}",
			"The sum of {@code firstBinding} and {@code bindingCount} $must be less than or equal to {@code VkPhysicalDeviceLimits::maxVertexInputBindings}",
			"All elements of {@code pOffsets} $must be less than the size of the corresponding element in {@code pBuffers}",
			"All elements of {@code pBuffers} $must have been created with the #BUFFER_USAGE_VERTEX_BUFFER_BIT flag"
		)}

		<h5>Host Synchronization</h5>

		Host access to {@code commandBuffer} $must be externally synchronized.
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded"),
		uint32_t.IN("firstBinding", "the index of the first vertex input binding whose state is updated by the command"),
		AutoSize("pBuffers", "pOffsets")..uint32_t.IN("bindingCount", "the number of vertex input bindings whose state is updated by the command"),
		const..VkBuffer.p.IN("pBuffers", "a pointer to an array of buffer handles"),
		const..VkDeviceSize_p.IN("pOffsets", "a pointer to an array of buffer offsets")
	)

	void(
		"CmdDraw",
		"Draws primitives.",

		VkCommandBuffer.IN("commandBuffer", ""),
		uint32_t.IN("vertexCount", ""),
		uint32_t.IN("instanceCount", ""),
		uint32_t.IN("firstVertex", ""),
		uint32_t.IN("firstInstance", "")
	)

	void(
		"CmdDrawIndexed",
		"Issues an indexed draw into a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		uint32_t.IN("indexCount", ""),
		uint32_t.IN("instanceCount", ""),
		uint32_t.IN("firstIndex", ""),
		int32_t.IN("vertexOffset", ""),
		uint32_t.IN("firstInstance", "")
	)

	void(
		"CmdDrawIndirect",
		"Issues an indirect draw into a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkBuffer.IN("buffer", ""),
		VkDeviceSize.IN("offset", ""),
		uint32_t.IN("drawCount", ""),
		uint32_t.IN("stride", "")
	)

	void(
		"CmdDrawIndexedIndirect",
		"Performs an indexed indirect draw.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkBuffer.IN("buffer", ""),
		VkDeviceSize.IN("offset", ""),
		uint32_t.IN("drawCount", ""),
		uint32_t.IN("stride", "")
	)

	void(
		"CmdDispatch",
		"Dispatches compute work items.",

		VkCommandBuffer.IN("commandBuffer", ""),
		uint32_t.IN("x", ""),
		uint32_t.IN("y", ""),
		uint32_t.IN("z", "")
	)

	void(
		"CmdDispatchIndirect",
		"Dispatches compute work items using indirect parameters.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkBuffer.IN("buffer", ""),
		VkDeviceSize.IN("offset", "")
	)

	void(
		"CmdCopyBuffer",
		"Copies data between buffer regions.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkBuffer.IN("srcBuffer", ""),
		VkBuffer.IN("dstBuffer", ""),
		AutoSize("pRegions")..uint32_t.IN("regionCount", ""),
		const..VkBufferCopy_p.IN("pRegions", "")
	)

	void(
		"CmdCopyImage",
		"Copy data between images.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkImage.IN("srcImage", ""),
		VkImageLayout.IN("srcImageLayout", ""),
		VkImage.IN("dstImage", ""),
		VkImageLayout.IN("dstImageLayout", ""),
		AutoSize("pRegions")..uint32_t.IN("regionCount", ""),
		const..VkImageCopy_p.IN("pRegions", "")
	)

	void(
		"CmdBlitImage",
		"Copies regions of an image, potentially performing format conversion, arbitrary scaling, and filtering (but does not allow MSAA resolve).",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkImage.IN("srcImage", ""),
		VkImageLayout.IN("srcImageLayout", ""),
		VkImage.IN("dstImage", ""),
		VkImageLayout.IN("dstImageLayout", ""),
		AutoSize("pRegions")..uint32_t.IN("regionCount", ""),
		const..VkImageBlit_p.IN("pRegions", ""),
		VkFilter.IN("filter", "")
	)

	void(
		"CmdCopyBufferToImage",
		"Copy data from a buffer into an image.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkBuffer.IN("srcBuffer", ""),
		VkImage.IN("dstImage", ""),
		VkImageLayout.IN("dstImageLayout", ""),
		AutoSize("pRegions")..uint32_t.IN("regionCount", ""),
		const..VkBufferImageCopy_p.IN("pRegions", "")
	)

	void(
		"CmdCopyImageToBuffer",
		"Copy image data into a buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkImage.IN("srcImage", ""),
		VkImageLayout.IN("srcImageLayout", ""),
		VkBuffer.IN("dstBuffer", ""),
		AutoSize("pRegions")..uint32_t.IN("regionCount", ""),
		const..VkBufferImageCopy_p.IN("pRegions", "")
	)

	void(
		"CmdUpdateBuffer",
		"Updates a buffer's contents from host memory.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkBuffer.IN("dstBuffer", ""),
		VkDeviceSize.IN("dstOffset", ""),
		AutoSize("pData")..VkDeviceSize.IN("dataSize", ""),
		const..uint32_t_p.IN("pData", "")
	)

	void(
		"CmdFillBuffer",
		"Fills a region of a buffer with a fixed value.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkBuffer.IN("dstBuffer", ""),
		VkDeviceSize.IN("dstOffset", ""),
		VkDeviceSize.IN("size", ""),
		uint32_t.IN("data", "")
	)

	void(
		"CmdClearColorImage",
		"Clears regions of a color image.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkImage.IN("image", ""),
		VkImageLayout.IN("imageLayout", ""),
		const..VkClearColorValue_p.IN("pColor", ""),
		AutoSize("pRanges")..uint32_t.IN("rangeCount", ""),
		SingleValue("pRange")..const..VkImageSubresourceRange_p.IN("pRanges", "")
	)

	void(
		"CmdClearDepthStencilImage",
		"Fills regions of a combined depth-stencil image.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkImage.IN("image", ""),
		VkImageLayout.IN("imageLayout", ""),
		const..VkClearDepthStencilValue_p.IN("pDepthStencil", ""),
		AutoSize("pRanges")..uint32_t.IN("rangeCount", ""),
		SingleValue("pRange")..const..VkImageSubresourceRange_p.IN("pRanges", "")
	)

	void(
		"CmdClearAttachments",
		"Clears regions within currently bound framebuffer attachments.",

		VkCommandBuffer.IN("commandBuffer", ""),
		AutoSize("pAttachments")..uint32_t.IN("attachmentCount", ""),
		const..VkClearAttachment_p.IN("pAttachments", ""),
		AutoSize("pRects")..uint32_t.IN("rectCount", ""),
		const..VkClearRect_p.IN("pRects", "")
	)

	void(
		"CmdResolveImage",
		"Resolves regions of an image.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkImage.IN("srcImage", ""),
		VkImageLayout.IN("srcImageLayout", ""),
		VkImage.IN("dstImage", ""),
		VkImageLayout.IN("dstImageLayout", ""),
		AutoSize("pRegions")..uint32_t.IN("regionCount", ""),
		SingleValue("pRegion")..const..VkImageResolve_p.IN("pRegions", "")
	)

	void(
		"CmdSetEvent",
		"Sets an event object to signaled state.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkEvent.IN("event", ""),
		VkPipelineStageFlags.IN("stageMask", "")
	)

	void(
		"CmdResetEvent",
		"Resets an event object to non-signaled state.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkEvent.IN("event", ""),
		VkPipelineStageFlags.IN("stageMask", "")
	)

	void(
		"CmdWaitEvents",
		"Waits for one or more events and inserts a set of memory barriers.",

		VkCommandBuffer.IN("commandBuffer", ""),
		AutoSize("pEvents")..uint32_t.IN("eventCount", ""),
		const..VkEvent.p.IN("pEvents", ""),
		VkPipelineStageFlags.IN("srcStageMask", ""),
		VkPipelineStageFlags.IN("dstStageMask", ""),
		AutoSize("pMemoryBarriers")..uint32_t.IN("memoryBarrierCount", ""),
		nullable..const..VkMemoryBarrier_p.IN("pMemoryBarriers", ""),
		AutoSize("pBufferMemoryBarriers")..uint32_t.IN("bufferMemoryBarrierCount", ""),
		nullable..const..VkBufferMemoryBarrier_p.IN("pBufferMemoryBarriers", ""),
		AutoSize("pImageMemoryBarriers")..uint32_t.IN("imageMemoryBarrierCount", ""),
		nullable..const..VkImageMemoryBarrier_p.IN("pImageMemoryBarriers", "")
	)

	void(
		"CmdPipelineBarrier",
		"Inserts a set of execution and memory barriers.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkPipelineStageFlags.IN("srcStageMask", ""),
		VkPipelineStageFlags.IN("dstStageMask", ""),
		VkDependencyFlags.IN("dependencyFlags", ""),
		AutoSize("pMemoryBarriers")..uint32_t.IN("memoryBarrierCount", ""),
		nullable..const..VkMemoryBarrier_p.IN("pMemoryBarriers", ""),
		AutoSize("pBufferMemoryBarriers")..uint32_t.IN("bufferMemoryBarrierCount", ""),
		nullable..const..VkBufferMemoryBarrier_p.IN("pBufferMemoryBarriers", ""),
		AutoSize("pImageMemoryBarriers")..uint32_t.IN("imageMemoryBarrierCount", ""),
		nullable..const..VkImageMemoryBarrier_p.IN("pImageMemoryBarriers", "")
	)

	void(
		"CmdBeginQuery",
		"Begins a query.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkQueryPool.IN("queryPool", ""),
		uint32_t.IN("query", ""),
		VkQueryControlFlags.IN("flags", "")
	)

	void(
		"CmdEndQuery",
		"Ends a query.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkQueryPool.IN("queryPool", ""),
		uint32_t.IN("query", "")
	)

	void(
		"CmdResetQueryPool",
		"Resets queries in a query pool.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkQueryPool.IN("queryPool", ""),
		uint32_t.IN("firstQuery", ""),
		uint32_t.IN("queryCount", "")
	)

	void(
		"CmdWriteTimestamp",
		"Writes a device timestamp into a query object.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkPipelineStageFlagBits.IN("pipelineStage", ""),
		VkQueryPool.IN("queryPool", ""),
		uint32_t.IN("query", "")
	)

	void(
		"CmdCopyQueryPoolResults",
		"Copies the results of queries in a query pool to a buffer object.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkQueryPool.IN("queryPool", ""),
		uint32_t.IN("firstQuery", ""),
		uint32_t.IN("queryCount", ""),
		VkBuffer.IN("dstBuffer", ""),
		VkDeviceSize.IN("dstOffset", ""),
		VkDeviceSize.IN("stride", ""),
		VkQueryResultFlags.IN("flags", "")
	)

	void(
		"CmdPushConstants",
		"Updates the values of push constants.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkPipelineLayout.IN("layout", ""),
		VkShaderStageFlags.IN("stageFlags", ""),
		uint32_t.IN("offset", ""),
		AutoSize("pValues")..uint32_t.IN("size", ""),
		MultiType(
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_LONG,
			PointerMapping.DATA_FLOAT,
			PointerMapping.DATA_DOUBLE
		)..const..void_p.IN("pValues", "")
	)

	void(
		"CmdBeginRenderPass",
		"Begins a new render pass.",

		VkCommandBuffer.IN("commandBuffer", ""),
		const..VkRenderPassBeginInfo_p.IN("pRenderPassBegin", ""),
		VkSubpassContents.IN("contents", "")
	)

	void(
		"CmdNextSubpass",
		"Transitions to the next subpass of a render pass.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkSubpassContents.IN("contents", "")
	)

	void(
		"CmdEndRenderPass",
		"Ends the current render pass.",

		VkCommandBuffer.IN("commandBuffer", "")
	)

	void(
		"CmdExecuteCommands",
		"Executes a secondary command buffer from a primary command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		AutoSize("pCommandBuffers")..uint32_t.IN("commandBufferCount", ""),
		SingleValue("pCommandBuffer")..const..VkCommandBuffer.p.IN("pCommandBuffers", "")
	)

	}
}

// Getting "method too big" compilation errors without this
private fun NativeClass.separateMethod(init: NativeClass.() -> Unit) {
	this.init()
}