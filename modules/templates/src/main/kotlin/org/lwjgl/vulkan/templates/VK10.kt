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
		bug, and may have an impact on the behavior of existing functionality. Differences in this version number should not affect either full compatibility
		or backwards compatibility between two versions, or add additional interfaces to the API.

		A difference in minor version numbers indicates that some amount of new functionality has been added. This will usually include new interfaces in the
		header, and may also include behavior changes and bug fixes. Functionality may be deprecated in a minor revision, but will not be removed. When a new
		minor version is introduced, the patch version is reset to 0, and each minor revision maintains its own set of patch versions. Differences in this
		version should not affect backwards compatibility, but will affect full compatibility.

		A difference in major version numbers indicates a large set of changes to the API, potentially including new functionality and header interfaces,
		behavioral changes, removal of deprecated features, modification or outright replacement of any feature, and is thus very likely to break any and all
		compatibility. Differences in this version will typically require significant modification to an application in order for it to function.
		""",

		"API_VERSION".expr("(VK_VERSION_MAJOR << 22) | (VK_VERSION_MINOR << 12) | VK_VERSION_PATCH")
	)

	LongConstant(
		"""
		The reserved handle {@code VK_NULL_HANDLE} can be passed in place of valid object handles when explicitly called out in the specification. Any command
		that creates an object successfully must not return {@code VK_NULL_HANDLE}. It is valid to pass {@code VK_NULL_HANDLE} to any {@code vkDestroy*} or
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

	IntConstant(
		"VkResult",

		"SUCCESS" expr "0",
		"NOT_READY" expr "1",
		"TIMEOUT" expr "2",
		"EVENT_SET" expr "3",
		"EVENT_RESET" expr "4",
		"INCOMPLETE" expr "5",
		"ERROR_OUT_OF_HOST_MEMORY" expr "-1",
		"ERROR_OUT_OF_DEVICE_MEMORY" expr "-2",
		"ERROR_INITIALIZATION_FAILED" expr "-3",
		"ERROR_DEVICE_LOST" expr "-4",
		"ERROR_MEMORY_MAP_FAILED" expr "-5",
		"ERROR_LAYER_NOT_PRESENT" expr "-6",
		"ERROR_EXTENSION_NOT_PRESENT" expr "-7",
		"ERROR_FEATURE_NOT_PRESENT" expr "-8",
		"ERROR_INCOMPATIBLE_DRIVER" expr "-9",
		"ERROR_TOO_MANY_OBJECTS" expr "-10",
		"ERROR_FORMAT_NOT_SUPPORTED" expr "-11",
		"RESULT_BEGIN_RANGE" expr "VK_ERROR_FORMAT_NOT_SUPPORTED",
		"RESULT_END_RANGE" expr "VK_INCOMPLETE",
		"RESULT_RANGE_SIZE" expr "VK_INCOMPLETE - VK_ERROR_FORMAT_NOT_SUPPORTED + 1",
		"RESULT_MAX_ENUM"..0x7FFFFFFF
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

	EnumConstant(
		"VkImageType",

		"IMAGE_TYPE_1D".enumExpr("One-dimensional image", "0"),
		"IMAGE_TYPE_2D".enum("Two-dimensional image"),
		"IMAGE_TYPE_3D".enum("Three-dimensional image"),
		"IMAGE_TYPE_BEGIN_RANGE".enumExpr("", "VK_IMAGE_TYPE_1D"),
		"IMAGE_TYPE_END_RANGE".enumExpr("", "VK_IMAGE_TYPE_3D"),
		"IMAGE_TYPE_RANGE_SIZE".enumExpr("", "VK_IMAGE_TYPE_3D - VK_IMAGE_TYPE_1D + 1"),
		"IMAGE_TYPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkImageTiling",

		"IMAGE_TILING_OPTIMAL".enumExpr("Specifies optimal tiling (texels are laid out in an implementation-dependent arrangement, for more optimal memory access).", "0"),
		"IMAGE_TILING_LINEAR".enum("Specifies linear tiling (texels are laid out in memory in row-major order, possibly with some padding on each row)."),
		"IMAGE_TILING_BEGIN_RANGE".enumExpr("", "VK_IMAGE_TILING_OPTIMAL"),
		"IMAGE_TILING_END_RANGE".enumExpr("", "VK_IMAGE_TILING_LINEAR"),
		"IMAGE_TILING_RANGE_SIZE".enumExpr("", "VK_IMAGE_TILING_LINEAR - VK_IMAGE_TILING_OPTIMAL + 1"),
		"IMAGE_TILING_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

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
			Supports no device access. This layout must only be used as an {@code initialLayout} or as the {@code oldLayout} in an image transition. When
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
			$must only be used as a read-only depth/stencil attachment in a {@code VkFramebuffer} and/or as a read-only image in a shader (which can be read as
			a sampled image, combined image/sampler and/or input attachment). This layout is valid only for subresources of images created with both the
			#IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT usage bit enabled.
			"""
		),
		"IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL".enum(
			"""
			$must only be used as a read-only image in a shader (which can be read as a sampled image, combined image/sampler and/or input attachment). This
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
			Supports no device access. This layout must only be used as an {@code initialLayout} or as the {@code oldLayout} in an image transition. When
			transitioning out of this layout, the contents of the memory are preserved. This layout is intended to be used as the initial layout for an image
			whose contents are written by the host, and hence the data can be written to memory immediately, without first executing a layout transition.
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
			Indicates that the {@code pViewports} state in ##VkPipelineViewportStateCreateInfo will be ignored and must be set dynamically with
			#CmdSetViewport() before any draw commands. The number of viewports used by a pipeline is still specified by the {@code viewportCount} member of
			{@code VkPipelineViewportStateCreateInfo}.
			""", "0"),
		"DYNAMIC_STATE_SCISSOR".enum(
			"""
			Indicates that the {@code pScissors} state in ##VkPipelineViewportStateCreateInfo will be ignored and must be set dynamically with #CmdSetScissor()
			before any draw commands. The number of scissor rectangles used by a pipeline is still specified by the {@code scissorCount} member of
			{@code VkPipelineViewportStateCreateInfo}.
			"""
		),
		"DYNAMIC_STATE_LINE_WIDTH".enum(
			"""
			Indicates that the {@code lineWidth} state in ##VkPipelineRasterizationStateCreateInfo will be ignored and must be set dynamically with
			#CmdSetLineWidth() before any draw commands that generate line primitives for the rasterizer.
			"""
		),
		"DYNAMIC_STATE_DEPTH_BIAS".enum(
			"""
			Indicates that the {@code depthBiasConstantFactor}, {@code depthBiasClamp} and {@code depthBiasSlopeFactor} states in
			##VkPipelineRasterizationStateCreateInfo will be ignored and must be set dynamically with #CmdSetDepthBias() before any draws are performed with
			{@code depthBiasEnable} in {@code VkPipelineRasterizationStateCreateInfo} set to #TRUE.
			"""
		),
		"DYNAMIC_STATE_BLEND_CONSTANTS".enum(
			"""
			Indicates that the {@code blendConstants} state in ##VkPipelineColorBlendStateCreateInfo will be ignored and must be set dynamically with
			#CmdSetBlendConstants() before any draws are performed with a pipeline state with {@code VkPipelineColorBlendAttachmentState} member
			{@code blendEnable} set to #TRUE and any of the blend functions using a constant blend color.
			"""
		),
		"DYNAMIC_STATE_DEPTH_BOUNDS".enum(
			"""
			Indicates that the {@code minDepthBounds} and {@code maxDepthBounds} states of ##VkPipelineDepthStencilStateCreateInfo will be ignored and must be
			set dynamically with #CmdSetDepthBounds() before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo}
			member {@code depthBoundsTestEnable} set to #TRUE.
			"""
		),
		"DYNAMIC_STATE_STENCIL_COMPARE_MASK".enum(
			"""
			Indicates that the {@code compareMask} state in ##VkPipelineDepthStencilStateCreateInfo for both front and back will be ignored and must be set
			dynamically with #CmdSetStencilCompareMask() before any draws are performed with a pipeline state with
			{@code VkPipelineDepthStencilStateCreateInfo} member {@code stencilTestEnable} set to #TRUE.
			"""
		),
		"DYNAMIC_STATE_STENCIL_WRITE_MASK".enum(
			"""
			Indicates that the {@code writeMask} state in ##VkPipelineDepthStencilStateCreateInfo for both front and back will be ignored and must be set
			dynamically with #CmdSetStencilWriteMask() before any draws are performed with a pipeline state with {@code VkPipelineDepthStencilStateCreateInfo}
			member {@code stencilTestEnable} set to #TRUE.
			"""
		),
		"DYNAMIC_STATE_STENCIL_REFERENCE".enum(
			"""
			Indicates that the reference state in ##VkPipelineDepthStencilStateCreateInfo for both front and back will be ignored and must be set dynamically
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

		"FILTER_NEAREST".enumExpr("", "0"),
		"FILTER_LINEAR".enum(""),
		"FILTER_BEGIN_RANGE".enumExpr("", "VK_FILTER_NEAREST"),
		"FILTER_END_RANGE".enumExpr("", "VK_FILTER_LINEAR"),
		"FILTER_RANGE_SIZE".enumExpr("", "VK_FILTER_LINEAR - VK_FILTER_NEAREST + 1"),
		"FILTER_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkSamplerMipmapMode",

		"SAMPLER_MIPMAP_MODE_NEAREST".enumExpr("", "0"),
		"SAMPLER_MIPMAP_MODE_LINEAR".enum(""),
		"SAMPLER_MIPMAP_MODE_BEGIN_RANGE".enumExpr("", "VK_SAMPLER_MIPMAP_MODE_NEAREST"),
		"SAMPLER_MIPMAP_MODE_END_RANGE".enumExpr("", "VK_SAMPLER_MIPMAP_MODE_LINEAR"),
		"SAMPLER_MIPMAP_MODE_RANGE_SIZE".enumExpr("", "VK_SAMPLER_MIPMAP_MODE_LINEAR - VK_SAMPLER_MIPMAP_MODE_NEAREST + 1"),
		"SAMPLER_MIPMAP_MODE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkSamplerAddressMode",

		"SAMPLER_ADDRESS_MODE_REPEAT".enumExpr("", "0"),
		"SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT".enum(""),
		"SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE".enum(""),
		"SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER".enum(""),
		"SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE".enum(""),
		"SAMPLER_ADDRESS_MODE_BEGIN_RANGE".enumExpr("", "VK_SAMPLER_ADDRESS_MODE_REPEAT"),
		"SAMPLER_ADDRESS_MODE_END_RANGE".enumExpr("", "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER"),
		"SAMPLER_ADDRESS_MODE_RANGE_SIZE".enumExpr("", "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER - VK_SAMPLER_ADDRESS_MODE_REPEAT + 1"),
		"SAMPLER_ADDRESS_MODE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkBorderColor",

		"BORDER_COLOR_FLOAT_TRANSPARENT_BLACK".enumExpr("", "0"),
		"BORDER_COLOR_INT_TRANSPARENT_BLACK".enum(""),
		"BORDER_COLOR_FLOAT_OPAQUE_BLACK".enum(""),
		"BORDER_COLOR_INT_OPAQUE_BLACK".enum(""),
		"BORDER_COLOR_FLOAT_OPAQUE_WHITE".enum(""),
		"BORDER_COLOR_INT_OPAQUE_WHITE".enum(""),
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

		"ATTACHMENT_LOAD_OP_LOAD".enumExpr("", "0"),
		"ATTACHMENT_LOAD_OP_CLEAR".enum(""),
		"ATTACHMENT_LOAD_OP_DONT_CARE".enum(""),
		"ATTACHMENT_LOAD_OP_BEGIN_RANGE".enumExpr("", "VK_ATTACHMENT_LOAD_OP_LOAD"),
		"ATTACHMENT_LOAD_OP_END_RANGE".enumExpr("", "VK_ATTACHMENT_LOAD_OP_DONT_CARE"),
		"ATTACHMENT_LOAD_OP_RANGE_SIZE".enumExpr("", "VK_ATTACHMENT_LOAD_OP_DONT_CARE - VK_ATTACHMENT_LOAD_OP_LOAD + 1"),
		"ATTACHMENT_LOAD_OP_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkAttachmentStoreOp",

		"ATTACHMENT_STORE_OP_STORE".enumExpr("", "0"),
		"ATTACHMENT_STORE_OP_DONT_CARE".enum(""),
		"ATTACHMENT_STORE_OP_BEGIN_RANGE".enumExpr("", "VK_ATTACHMENT_STORE_OP_STORE"),
		"ATTACHMENT_STORE_OP_END_RANGE".enumExpr("", "VK_ATTACHMENT_STORE_OP_DONT_CARE"),
		"ATTACHMENT_STORE_OP_RANGE_SIZE".enumExpr("", "VK_ATTACHMENT_STORE_OP_DONT_CARE - VK_ATTACHMENT_STORE_OP_STORE + 1"),
		"ATTACHMENT_STORE_OP_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkPipelineBindPoint",

		"PIPELINE_BIND_POINT_GRAPHICS".enumExpr("", "0"),
		"PIPELINE_BIND_POINT_COMPUTE".enum(""),
		"PIPELINE_BIND_POINT_BEGIN_RANGE".enumExpr("", "VK_PIPELINE_BIND_POINT_GRAPHICS"),
		"PIPELINE_BIND_POINT_END_RANGE".enumExpr("", "VK_PIPELINE_BIND_POINT_COMPUTE"),
		"PIPELINE_BIND_POINT_RANGE_SIZE".enumExpr("", "VK_PIPELINE_BIND_POINT_COMPUTE - VK_PIPELINE_BIND_POINT_GRAPHICS + 1"),
		"PIPELINE_BIND_POINT_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkCommandBufferLevel",

		"COMMAND_BUFFER_LEVEL_PRIMARY".enumExpr("", "0"),
		"COMMAND_BUFFER_LEVEL_SECONDARY".enum(""),
		"COMMAND_BUFFER_LEVEL_BEGIN_RANGE".enumExpr("", "VK_COMMAND_BUFFER_LEVEL_PRIMARY"),
		"COMMAND_BUFFER_LEVEL_END_RANGE".enumExpr("", "VK_COMMAND_BUFFER_LEVEL_SECONDARY"),
		"COMMAND_BUFFER_LEVEL_RANGE_SIZE".enumExpr("", "VK_COMMAND_BUFFER_LEVEL_SECONDARY - VK_COMMAND_BUFFER_LEVEL_PRIMARY + 1"),
		"COMMAND_BUFFER_LEVEL_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkIndexType",

		"INDEX_TYPE_UINT16".enumExpr("", "0"),
		"INDEX_TYPE_UINT32".enum(""),
		"INDEX_TYPE_BEGIN_RANGE".enumExpr("", "VK_INDEX_TYPE_UINT16"),
		"INDEX_TYPE_END_RANGE".enumExpr("", "VK_INDEX_TYPE_UINT32"),
		"INDEX_TYPE_RANGE_SIZE".enumExpr("", "VK_INDEX_TYPE_UINT32 - VK_INDEX_TYPE_UINT16 + 1"),
		"INDEX_TYPE_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkSubpassContents",

		"SUBPASS_CONTENTS_INLINE".enumExpr("", "0"),
		"SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS".enum(""),
		"SUBPASS_CONTENTS_BEGIN_RANGE".enumExpr("", "VK_SUBPASS_CONTENTS_INLINE"),
		"SUBPASS_CONTENTS_END_RANGE".enumExpr("", "VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS"),
		"SUBPASS_CONTENTS_RANGE_SIZE".enumExpr("", "VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS - VK_SUBPASS_CONTENTS_INLINE + 1"),
		"SUBPASS_CONTENTS_MAX_ENUM".enum("", 0x7FFFFFFF)
	)

	EnumConstant(
		"VkFormatFeatureFlagBits",

		"FORMAT_FEATURE_SAMPLED_IMAGE_BIT".enum("", 0x00000001),
		"FORMAT_FEATURE_STORAGE_IMAGE_BIT".enum("", 0x00000002),
		"FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT".enum("", 0x00000004),
		"FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT".enum("", 0x00000008),
		"FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT".enum("", 0x00000010),
		"FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT".enum("", 0x00000020),
		"FORMAT_FEATURE_VERTEX_BUFFER_BIT".enum("", 0x00000040),
		"FORMAT_FEATURE_COLOR_ATTACHMENT_BIT".enum("", 0x00000080),
		"FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT".enum("", 0x00000100),
		"FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT".enum("", 0x00000200),
		"FORMAT_FEATURE_BLIT_SRC_BIT".enum("", 0x00000400),
		"FORMAT_FEATURE_BLIT_DST_BIT".enum("", 0x00000800),
		"FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT".enum("", 0x00001000)
	)

	EnumConstant(
		"VkImageUsageFlagBits",

		"IMAGE_USAGE_TRANSFER_SRC_BIT".enum("", 0x00000001),
		"IMAGE_USAGE_TRANSFER_DST_BIT".enum("", 0x00000002),
		"IMAGE_USAGE_SAMPLED_BIT".enum("", 0x00000004),
		"IMAGE_USAGE_STORAGE_BIT".enum("", 0x00000008),
		"IMAGE_USAGE_COLOR_ATTACHMENT_BIT".enum("", 0x00000010),
		"IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT".enum("", 0x00000020),
		"IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT".enum("", 0x00000040),
		"IMAGE_USAGE_INPUT_ATTACHMENT_BIT".enum("", 0x00000080)
	)

	EnumConstant(
		"VkImageCreateFlagBits",

		"IMAGE_CREATE_SPARSE_BINDING_BIT".enum("", 0x00000001),
		"IMAGE_CREATE_SPARSE_RESIDENCY_BIT".enum("", 0x00000002),
		"IMAGE_CREATE_SPARSE_ALIASED_BIT".enum("", 0x00000004),
		"IMAGE_CREATE_MUTABLE_FORMAT_BIT".enum("", 0x00000008),
		"IMAGE_CREATE_CUBE_COMPATIBLE_BIT".enum("", 0x00000010)
	)

	EnumConstant(
		"VkSampleCountFlagBits",

		"SAMPLE_COUNT_1_BIT".enum("", 0x00000001),
		"SAMPLE_COUNT_2_BIT".enum("", 0x00000002),
		"SAMPLE_COUNT_4_BIT".enum("", 0x00000004),
		"SAMPLE_COUNT_8_BIT".enum("", 0x00000008),
		"SAMPLE_COUNT_16_BIT".enum("", 0x00000010),
		"SAMPLE_COUNT_32_BIT".enum("", 0x00000020),
		"SAMPLE_COUNT_64_BIT".enum("", 0x00000040)
	)

	EnumConstant(
		"VkQueueFlagBits",

		"QUEUE_GRAPHICS_BIT".enum("", 0x00000001),
		"QUEUE_COMPUTE_BIT".enum("", 0x00000002),
		"QUEUE_TRANSFER_BIT".enum("", 0x00000004),
		"QUEUE_SPARSE_BINDING_BIT".enum("", 0x00000008)
	)

	EnumConstant(
		"VkMemoryPropertyFlagBits",

		"MEMORY_PROPERTY_DEVICE_LOCAL_BIT".enum("", 0x00000001),
		"MEMORY_PROPERTY_HOST_VISIBLE_BIT".enum("", 0x00000002),
		"MEMORY_PROPERTY_HOST_COHERENT_BIT".enum("", 0x00000004),
		"MEMORY_PROPERTY_HOST_CACHED_BIT".enum("", 0x00000008),
		"MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT".enum("", 0x00000010)
	)

	EnumConstant(
		"VkMemoryHeapFlagBits",

		"MEMORY_HEAP_DEVICE_LOCAL_BIT".enum("", 0x00000001)
	)

	EnumConstant(
		"VkPipelineStageFlagBits",

		"PIPELINE_STAGE_TOP_OF_PIPE_BIT".enum("", 0x00000001),
		"PIPELINE_STAGE_DRAW_INDIRECT_BIT".enum("", 0x00000002),
		"PIPELINE_STAGE_VERTEX_INPUT_BIT".enum("", 0x00000004),
		"PIPELINE_STAGE_VERTEX_SHADER_BIT".enum("", 0x00000008),
		"PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT".enum("", 0x00000010),
		"PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT".enum("", 0x00000020),
		"PIPELINE_STAGE_GEOMETRY_SHADER_BIT".enum("", 0x00000040),
		"PIPELINE_STAGE_FRAGMENT_SHADER_BIT".enum("", 0x00000080),
		"PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT".enum("", 0x00000100),
		"PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT".enum("", 0x00000200),
		"PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT".enum("", 0x00000400),
		"PIPELINE_STAGE_COMPUTE_SHADER_BIT".enum("", 0x00000800),
		"PIPELINE_STAGE_TRANSFER_BIT".enum("", 0x00001000),
		"PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT".enum("", 0x00002000),
		"PIPELINE_STAGE_HOST_BIT".enum("", 0x00004000),
		"PIPELINE_STAGE_ALL_GRAPHICS_BIT".enum("", 0x00008000),
		"PIPELINE_STAGE_ALL_COMMANDS_BIT".enum("", 0x00010000)
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

		"SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT".enum("", 0x00000001),
		"SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT".enum("", 0x00000002),
		"SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT".enum("", 0x00000004)
	)

	EnumConstant(
		"VkSparseMemoryBindFlagBits",

		"SPARSE_MEMORY_BIND_METADATA_BIT".enum("", 0x00000001)
	)

	EnumConstant(
		"VkFenceCreateFlagBits",

		"FENCE_CREATE_SIGNALED_BIT".enum("", 0x00000001)
	)

	EnumConstant(
		"VkQueryPipelineStatisticFlagBits",

		"QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT".enum("", 0x00000001),
		"QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT".enum("", 0x00000002),
		"QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT".enum("", 0x00000004),
		"QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT".enum("", 0x00000008),
		"QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT".enum("", 0x00000010),
		"QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT".enum("", 0x00000020),
		"QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT".enum("", 0x00000040),
		"QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT".enum("", 0x00000080),
		"QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT".enum("", 0x00000100),
		"QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT".enum("", 0x00000200),
		"QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT".enum("", 0x00000400)
	)

	EnumConstant(
		"VkQueryResultFlagBits",

		"QUERY_RESULT_64_BIT".enum("", 0x00000001),
		"QUERY_RESULT_WAIT_BIT".enum("", 0x00000002),
		"QUERY_RESULT_WITH_AVAILABILITY_BIT".enum("", 0x00000004),
		"QUERY_RESULT_PARTIAL_BIT".enum("", 0x00000008)
	)

	EnumConstant(
		"VkBufferCreateFlagBits",

		"BUFFER_CREATE_SPARSE_BINDING_BIT".enum("", 0x00000001),
		"BUFFER_CREATE_SPARSE_RESIDENCY_BIT".enum("", 0x00000002),
		"BUFFER_CREATE_SPARSE_ALIASED_BIT".enum("", 0x00000004)
	)

	EnumConstant(
		"VkBufferUsageFlagBits",

		"BUFFER_USAGE_TRANSFER_SRC_BIT".enum("", 0x00000001),
		"BUFFER_USAGE_TRANSFER_DST_BIT".enum("", 0x00000002),
		"BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT".enum("", 0x00000004),
		"BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT".enum("", 0x00000008),
		"BUFFER_USAGE_UNIFORM_BUFFER_BIT".enum("", 0x00000010),
		"BUFFER_USAGE_STORAGE_BUFFER_BIT".enum("", 0x00000020),
		"BUFFER_USAGE_INDEX_BUFFER_BIT".enum("", 0x00000040),
		"BUFFER_USAGE_VERTEX_BUFFER_BIT".enum("", 0x00000080),
		"BUFFER_USAGE_INDIRECT_BUFFER_BIT".enum("", 0x00000100)
	)

	EnumConstant(
		"VkPipelineCreateFlagBits",

		"PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT".enum("", 0x00000001),
		"PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT".enum("", 0x00000002),
		"PIPELINE_CREATE_DERIVATIVE_BIT".enum("", 0x00000004)
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

		"CULL_MODE_NONE".enumExpr("", "0"),
		"CULL_MODE_FRONT_BIT".enum("", 0x00000001),
		"CULL_MODE_BACK_BIT".enum("", 0x00000002),
		"CULL_MODE_FRONT_AND_BACK".enum("", 0x00000003)
	)

	EnumConstant(
		"VkColorComponentFlagBits",

		"COLOR_COMPONENT_R_BIT".enum("", 0x00000001),
		"COLOR_COMPONENT_G_BIT".enum("", 0x00000002),
		"COLOR_COMPONENT_B_BIT".enum("", 0x00000004),
		"COLOR_COMPONENT_A_BIT".enum("", 0x00000008)
	)

	EnumConstant(
		"VkDescriptorPoolCreateFlagBits",

		"DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT".enum("", 0x00000001)
	)

	EnumConstant(
		"VkAttachmentDescriptionFlagBits",

		"ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT".enum("", 0x00000001)
	)

	EnumConstant(
		"VkAccessFlagBits",

		"ACCESS_INDIRECT_COMMAND_READ_BIT".enum("", 0x00000001),
		"ACCESS_INDEX_READ_BIT".enum("", 0x00000002),
		"ACCESS_VERTEX_ATTRIBUTE_READ_BIT".enum("", 0x00000004),
		"ACCESS_UNIFORM_READ_BIT".enum("", 0x00000008),
		"ACCESS_INPUT_ATTACHMENT_READ_BIT".enum("", 0x00000010),
		"ACCESS_SHADER_READ_BIT".enum("", 0x00000020),
		"ACCESS_SHADER_WRITE_BIT".enum("", 0x00000040),
		"ACCESS_COLOR_ATTACHMENT_READ_BIT".enum("", 0x00000080),
		"ACCESS_COLOR_ATTACHMENT_WRITE_BIT".enum("", 0x00000100),
		"ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT".enum("", 0x00000200),
		"ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT".enum("", 0x00000400),
		"ACCESS_TRANSFER_READ_BIT".enum("", 0x00000800),
		"ACCESS_TRANSFER_WRITE_BIT".enum("", 0x00001000),
		"ACCESS_HOST_READ_BIT".enum("", 0x00002000),
		"ACCESS_HOST_WRITE_BIT".enum("", 0x00004000),
		"ACCESS_MEMORY_READ_BIT".enum("", 0x00008000),
		"ACCESS_MEMORY_WRITE_BIT".enum("", 0x00010000)
	)

	EnumConstant(
		"VkDependencyFlagBits",

		"DEPENDENCY_BY_REGION_BIT".enum("", 0x00000001)
	)

	EnumConstant(
		"VkCommandPoolCreateFlagBits",

		"COMMAND_POOL_CREATE_TRANSIENT_BIT".enum("", 0x00000001),
		"COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT".enum("", 0x00000002)
	)

	EnumConstant(
		"VkCommandPoolResetFlagBits",

		"COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT".enum("", 0x00000001)
	)

	EnumConstant(
		"VkCommandBufferUsageFlagBits",

		"COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT".enum("", 0x00000001),
		"COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT".enum("", 0x00000002),
		"COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT".enum("", 0x00000004)
	)

	EnumConstant(
		"VkQueryControlFlagBits",

		"QUERY_CONTROL_PRECISE_BIT".enum("", 0x00000001)
	)

	EnumConstant(
		"VkCommandBufferResetFlagBits",

		"COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT".enum("", 0x00000001)
	)

	EnumConstant(
		"VkStencilFaceFlagBits",

		"STENCIL_FACE_FRONT_BIT".enum("", 0x00000001),
		"STENCIL_FACE_BACK_BIT".enum("", 0x00000002),
		"STENCIL_FRONT_AND_BACK".enum("", 0x00000003)
	)

	GlobalCommand..VkResult(
		"CreateInstance",
		"""
		Creates a new Vulkan instance.

		There is no global state in Vulkan and all per-application state is stored in a {@code VkInstance} object. Creating a {@code VkInstance} object
		initializes the Vulkan library and allows the application to pass information about itself to the implementation.

		{@code vkCreateInstance} creates the instance, then enables and initializes global layers and extensions requested by the application. If an extension
		is provided by a layer, both the layer and extension $must be specified at {@code vkCreateInstance} time.

		<h3>Valid Usage</h3>
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

		After destruction of the instance, all devices (logical and physical) and any objects created by those devices become invalid and should not be
		accessed. However, objects allocated directly or indirectly through the instance are not destroyed automatically and so may be leaked. Applications
		should destroy all objects created through instance before destroying the instance itself.

		<h3>Valid Usage</h3>
		${ul(
			"If {@code instance} is not $NULL, {@code instance} $must be a valid {@code VkInstance} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"All child objects created using {@code instance} $must have been destroyed prior to destroying {@code instance}",
			"If ##VkAllocationCallbacks were provided when instance was created, a compatible set of callbacks $must be provided here",
			"If no ##VkAllocationCallbacks were provided when instance was created, {@code pAllocator} $must be $NULL"
		)}

		Host access to {@code instance} $must be externally synchronized
		""",

		VkInstance.IN("instance", "the handle of the instance to destroy"),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "controls host memory allocation")
	)

	VkResult(
		"EnumeratePhysicalDevices",
		"Enumerates the physical devices accessible to a Vulkan instance.",

		VkInstance.IN("instance", ""),
		AutoSize("pPhysicalDevices")..Check(1)..uint32_t_p.INOUT("pPhysicalDeviceCount", ""),
		nullable..VkPhysicalDevice.p.OUT("pPhysicalDevices", "")
	)

	void(
		"GetPhysicalDeviceFeatures",
		"Reports capabilities of a physical device.",

		VkPhysicalDevice.IN("physicalDevice", ""),
		VkPhysicalDeviceFeatures_p.OUT("pFeatures", "")
	)

	void(
		"GetPhysicalDeviceFormatProperties",
		"Lists physical device’s format capabilities.",

		VkPhysicalDevice.IN("physicalDevice", ""),
		VkFormat.IN("format", ""),
		VkFormatProperties_p.OUT("pFormatProperties", "")
	)

	VkResult(
		"GetPhysicalDeviceImageFormatProperties",
		"Lists physical device's image format capabilities.",

		VkPhysicalDevice.IN("physicalDevice", ""),
		VkFormat.IN("format", ""),
		VkImageType.IN("type", ""),
		VkImageTiling.IN("tiling", ""),
		VkImageUsageFlags.IN("usage", ""),
		VkImageCreateFlags.IN("flags", ""),
		VkImageFormatProperties_p.OUT("pImageFormatProperties", "")
	)

	void(
		"GetPhysicalDeviceProperties",
		"Returns properties of a physical device.",

		VkPhysicalDevice.IN("physicalDevice", ""),
		VkPhysicalDeviceProperties_p.OUT("pProperties", "")
	)

	void(
		"GetPhysicalDeviceQueueFamilyProperties",
		"Reports properties of the queues of the specified physical device.",

		VkPhysicalDevice.IN("physicalDevice", ""),
		AutoSize("pQueueFamilyProperties")..Check(1)..uint32_t_p.INOUT("pQueueFamilyPropertyCount", ""),
		nullable..VkQueueFamilyProperties_p.OUT("pQueueFamilyProperties", "")
	)

	void(
		"GetPhysicalDeviceMemoryProperties",
		"Reports memory information for the specified physical device.",

		VkPhysicalDevice.IN("physicalDevice", ""),
		VkPhysicalDeviceMemoryProperties_p.OUT("pMemoryProperties", "")
	)

	PFN_vkVoidFunction(
		"GetInstanceProcAddr",
		"Returns a function pointer for a command.",

		VkInstance.IN("instance", ""),
		const..charASCII_p.IN("pName", "")
	)

	PFN_vkVoidFunction(
		"GetDeviceProcAddr",
		"Returns a function pointer for a command.",

		VkDevice.IN("device", ""),
		const..charASCII_p.IN("pName", "")
	)

	VkResult(
		"CreateDevice",
		"Creates a new device instance.",

		VkPhysicalDevice.IN("physicalDevice", ""),
		const..VkDeviceCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkDevice.p.OUT("pDevice", "")
	)

	void(
		"DestroyDevice",
		"Destroys a logical device.",

		VkDevice.IN("device", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	GlobalCommand..VkResult(
		"EnumerateInstanceExtensionProperties",
		"Returns up to requested number of global extension properties.",

		nullable..const..charUTF8_p.IN(
			"pLayerName",
			"pointer to optional layer name. If not null, will only return extension properties for the requested layer."
		),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"pointer to count indicating space available on input and structures returned on output"
		),
		nullable..VkExtensionProperties_p.OUT("pProperties", "pointer to a data structure to receive the results")
	)

	VkResult(
		"EnumerateDeviceExtensionProperties",
		"Returns properties of available physical device extensions.",

		VkPhysicalDevice.IN("physicalDevice", "the physical device to query"),
		nullable..const..charUTF8_p.IN("pLayerName", "optional layer name to query"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"count indicating number of {@code VkExtensionProperties} pointed to by {@code pProperties}"
		),
		nullable..VkExtensionProperties_p.OUT("pProperties", "pointer to an array of {@code VkExtensionProperties}")
	)

	GlobalCommand..VkResult(
		"EnumerateInstanceLayerProperties",
		"Returns up to requested number of global layer properties.",

		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"pointer to count indicating space available on input and structures returned on output"
		),
		nullable..VkLayerProperties_p.OUT("pProperties", "pointer to a array to receive the results")
	)

	VkResult(
		"EnumerateDeviceLayerProperties",
		"Returns properties of available physical device layers.",

		VkPhysicalDevice.IN("physicalDevice", "the physical device to query"),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT(
			"pPropertyCount",
			"count indicating number of {@code VkLayerProperties} pointed to by {@code pProperties}"
		),
		nullable..VkLayerProperties_p.OUT("pProperties", "pointer to an array of {@code VkLayerProperties}")
	)

	void(
		"GetDeviceQueue",
		"Gets a queue handle from a device.",

		VkDevice.IN("device", ""),
		uint32_t.IN("queueFamilyIndex", ""),
		uint32_t.IN("queueIndex", ""),
		Check(1)..VkQueue.p.OUT("pQueue", "")
	)

	VkResult(
		"QueueSubmit",
		"Submits a sequence of semaphores or command buffers to a queue.",

		VkQueue.IN("queue", ""),
		AutoSize("pSubmits")..uint32_t.IN("submitCount", ""),
		SingleValue("pSubmit")..nullable..const..VkSubmitInfo_p.IN("pSubmits", ""),
		VkFence.IN("fence", "")
	)

	VkResult(
		"QueueWaitIdle",
		"Waits for a queue to become idle.",

		VkQueue.IN("queue", "")
	)

	VkResult(
		"DeviceWaitIdle",
		"Waits for a device to become idle.",

		VkDevice.IN("device", "")
	)

	VkResult(
		"AllocateMemory",
		"Alocates GPU memory.",

		VkDevice.IN("device", ""),
		const..VkMemoryAllocateInfo_p.IN("pAllocateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkDeviceMemory.p.OUT("pMemory", "")
	)

	void(
		"FreeMemory",
		"Frees GPU memory.",

		VkDevice.IN("device", ""),
		VkDeviceMemory.IN("memory", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"MapMemory",
		"Maps a memory object into application address space.",

		VkDevice.IN("device", ""),
		VkDeviceMemory.IN("memory", ""),
		VkDeviceSize.IN("offset", ""),
		VkDeviceSize.IN("size", ""),
		VkMemoryMapFlags.IN("flags", ""),
		Check(1)..void_pp.OUT("ppData", "")
	)

	void(
		"UnmapMemory",
		"Unmaps a previously mapped memory object.",

		VkDevice.IN("device", ""),
		VkDeviceMemory.IN("memory", "")
	)

	VkResult(
		"FlushMappedMemoryRanges",
		"Flushes mapped memory ranges.",

		VkDevice.IN("device", ""),
		AutoSize("pMemoryRanges")..uint32_t.IN("memoryRangeCount", ""),
		SingleValue("pMemoryRange")..const..VkMappedMemoryRange_p.IN("pMemoryRanges", "")
	)

	VkResult(
		"InvalidateMappedMemoryRanges",
		"Invalidates ranges of mapped memory objects.",

		VkDevice.IN("device", ""),
		AutoSize("pMemoryRanges")..uint32_t.IN("memoryRangeCount", ""),
		SingleValue("pMemoryRange")..const..VkMappedMemoryRange_p.IN("pMemoryRanges", "")
	)

	void(
		"GetDeviceMemoryCommitment",
		"Queries the current commitment for a {@code VkDeviceMemory}.",

		VkDevice.IN("device", ""),
		VkDeviceMemory.IN("memory", ""),
		Check(1)..VkDeviceSize_p.OUT("pCommittedMemoryInBytes", "")
	)

	VkResult(
		"BindBufferMemory",
		"Binds device memory to a buffer object.",

		VkDevice.IN("device", ""),
		VkBuffer.IN("buffer", ""),
		VkDeviceMemory.IN("memory", ""),
		VkDeviceSize.IN("memoryOffset", "")
	)

	VkResult(
		"BindImageMemory",
		"Binds device memory to an image object.",

		VkDevice.IN("device", ""),
		VkImage.IN("image", ""),
		VkDeviceMemory.IN("memory", ""),
		VkDeviceSize.IN("memoryOffset", "")
	)

	void(
		"GetBufferMemoryRequirements",
		"Returns the memory requirements for specified Vulkan object.",

		VkDevice.IN("device", ""),
		VkBuffer.IN("buffer", ""),
		VkMemoryRequirements_p.OUT("pMemoryRequirements", "")
	)

	void(
		"GetImageMemoryRequirements",
		"Returns the memory requirements for specified Vulkan object.",

		VkDevice.IN("device", ""),
		VkImage.IN("image", ""),
		VkMemoryRequirements_p.OUT("pMemoryRequirements", "")
	)

	void(
		"GetImageSparseMemoryRequirements",
		"Queries the memory requirements for a sparse image.",

		VkDevice.IN("device", ""),
		VkImage.IN("image", ""),
		AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t_p.INOUT("pSparseMemoryRequirementCount", ""),
		nullable..VkSparseImageMemoryRequirements_p.OUT("pSparseMemoryRequirements", "")
	)

	void(
		"GetPhysicalDeviceSparseImageFormatProperties",
		"Retrieves properties of an image format applied to sparse images.",

		VkPhysicalDevice.IN("physicalDevice", ""),
		VkFormat.IN("format", ""),
		VkImageType.IN("type", ""),
		VkSampleCountFlagBits.IN("samples", ""),
		VkImageUsageFlags.IN("usage", ""),
		VkImageTiling.IN("tiling", ""),
		AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", ""),
		nullable..VkSparseImageFormatProperties_p.OUT("pProperties", "")
	)

	VkResult(
		"QueueBindSparse",
		"Binds device memory to a sparse resource object.",

		VkQueue.IN("queue", ""),
		AutoSize("pBindInfo")..uint32_t.IN("bindInfoCount", ""),
		SingleValue("pBindInfo")..const..VkBindSparseInfo_p.IN("pBindInfo", ""),
		VkFence.IN("fence", "")
	)

	VkResult(
		"CreateFence",
		"Creates a new fence object.",

		VkDevice.IN("device", ""),
		const..VkFenceCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkFence.p.OUT("pFence", "")
	)

	void(
		"DestroyFence",
		"Destroys a fence object.",

		VkDevice.IN("device", ""),
		VkFence.IN("fence", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"ResetFences",
		"Resets one or more fence objects.",

		VkDevice.IN("device", ""),
		AutoSize("pFences")..uint32_t.IN("fenceCount", ""),
		SingleValue("pFence")..const..VkFence.p.IN("pFences", "")
	)

	VkResult(
		"GetFenceStatus",
		"Returns the status of a fence.",

		VkDevice.IN("device", ""),
		VkFence.IN("fence", "")
	)

	VkResult(
		"WaitForFences",
		"Waits for one or more fences to become signaled.",

		VkDevice.IN("device", ""),
		AutoSize("pFences")..uint32_t.IN("fenceCount", ""),
		SingleValue("pFence")..const..VkFence.p.IN("pFences", ""),
		VkBool32.IN("waitAll", ""),
		uint64_t.IN("timeout", "")
	)

	VkResult(
		"CreateSemaphore",
		"Creates a new queue semaphore object.",

		VkDevice.IN("device", ""),
		const..VkSemaphoreCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkSemaphore.p.OUT("pSemaphore", "")
	)

	void(
		"DestroySemaphore",
		"Destroys a semaphore object.",

		VkDevice.IN("device", ""),
		VkSemaphore.IN("semaphore", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"CreateEvent",
		"Creates a new event object.",

		VkDevice.IN("device", ""),
		const..VkEventCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkEvent.p.OUT("pEvent", "")
	)

	void(
		"DestroyEvent",
		"Destroys an event object.",

		VkDevice.IN("device", ""),
		VkEvent.IN("event", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"GetEventStatus",
		"Retrieves the status of an event object.",

		VkDevice.IN("device", ""),
		VkEvent.IN("event", "")
	)

	VkResult(
		"SetEvent",
		"Sets an event to signaled state.",

		VkDevice.IN("device", ""),
		VkEvent.IN("event", "")
	)

	VkResult(
		"ResetEvent",
		"Resets an event to non-signaled state.",

		VkDevice.IN("device", ""),
		VkEvent.IN("event", "")
	)

	VkResult(
		"CreateQueryPool",
		"Creates a new query pool object.",

		VkDevice.IN("device", ""),
		const..VkQueryPoolCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkQueryPool.p.OUT("pQueryPool", "")
	)

	void(
		"DestroyQueryPool",
		"Destroys a query pool object.",

		VkDevice.IN("device", ""),
		VkQueryPool.IN("queryPool", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"GetQueryPoolResults",
		"Copies results of queries in a query pool to a host memory region.",

		VkDevice.IN("device", ""),
		VkQueryPool.IN("queryPool", ""),
		uint32_t.IN("firstQuery", ""),
		uint32_t.IN("queryCount", ""),
		AutoSize("pData")..size_t.IN("dataSize", ""),
		void_p.OUT("pData", ""),
		VkDeviceSize.IN("stride", ""),
		VkQueryResultFlags.IN("flags", "")
	)

	VkResult(
		"CreateBuffer",
		"Creates a new buffer object.",

		VkDevice.IN("device", ""),
		const..VkBufferCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkBuffer.p.OUT("pBuffer", "")
	)

	void(
		"DestroyBuffer",
		"Destroys a buffer object.",

		VkDevice.IN("device", ""),
		VkBuffer.IN("buffer", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"CreateBufferView",
		"Creates a new buffer view object.",

		VkDevice.IN("device", ""),
		const..VkBufferViewCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkBufferView.p.OUT("pView", "")
	)

	void(
		"DestroyBufferView",
		"Destroys a buffer view object.",

		VkDevice.IN("device", ""),
		VkBufferView.IN("bufferView", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"CreateImage",
		"Creates a new image object.",

		VkDevice.IN("device", ""),
		const..VkImageCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkImage.p.OUT("pImage", "")
	)

	void(
		"DestroyImage",
		"Destroys an image object.",

		VkDevice.IN("device", ""),
		VkImage.IN("image", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	void(
		"GetImageSubresourceLayout",
		"Retrieves information about an image subresource.",

		VkDevice.IN("device", ""),
		VkImage.IN("image", ""),
		const..VkImageSubresource_p.IN("pSubresource", ""),
		VkSubresourceLayout_p.OUT("pLayout", "")
	)

	VkResult(
		"CreateImageView",
		"Creates an image view from an existing image.",

		VkDevice.IN("device", ""),
		const..VkImageViewCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkImageView.p.OUT("pView", "")
	)

	void(
		"DestroyImageView",
		"Destroys an image view object.",

		VkDevice.IN("device", ""),
		VkImageView.IN("imageView", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"CreateShaderModule",
		"Creates a new shader module object.",

		VkDevice.IN("device", ""),
		const..VkShaderModuleCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkShaderModule.p.OUT("pShaderModule", "")
	)

	void(
		"DestroyShaderModule",
		"Destroys a shader module module.",

		VkDevice.IN("device", ""),
		VkShaderModule.IN("shaderModule", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"CreatePipelineCache",
		"Creates a new pipeline cache.",

		VkDevice.IN("device", ""),
		const..VkPipelineCacheCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkPipelineCache.p.OUT("pPipelineCache", "")
	)

	void(
		"DestroyPipelineCache",
		"Destroys a pipeline cache object.",

		VkDevice.IN("device", ""),
		VkPipelineCache.IN("pipelineCache", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"GetPipelineCacheData",
		"Gets the data store from a pipeline cache.",

		VkDevice.IN("device", ""),
		VkPipelineCache.IN("pipelineCache", ""),
		AutoSize("pData")..Check(1)..size_t_p.INOUT("pDataSize", ""),
		nullable..void_p.OUT("pData", "")
	)

	VkResult(
		"MergePipelineCaches",
		"Combines the data stores of pipeline caches.",

		VkDevice.IN("device", ""),
		VkPipelineCache.IN("dstCache", ""),
		AutoSize("pSrcCaches")..uint32_t.IN("srcCacheCount", ""),
		const..VkPipelineCache.p.IN("pSrcCaches", "")
	)

	VkResult(
		"CreateGraphicsPipelines",
		"Creates graphics pipelines.",

		VkDevice.IN("device", ""),
		VkPipelineCache.IN("pipelineCache", ""),
		AutoSize("pCreateInfos", "pPipelines")..uint32_t.IN("createInfoCount", ""),
		const..VkGraphicsPipelineCreateInfo_p.IN("pCreateInfos", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		VkPipeline.p.OUT("pPipelines", "")
	)

	VkResult(
		"CreateComputePipelines",
		"Creates a new compute pipeline object.",

		VkDevice.IN("device", ""),
		VkPipelineCache.IN("pipelineCache", ""),
		uint32_t.IN("createInfoCount", ""),
		const..VkComputePipelineCreateInfo_p.IN("pCreateInfos", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkPipeline.p.OUT("pPipelines", "")
	)

	void(
		"DestroyPipeline",
		"Destroys a pipeline object.",

		VkDevice.IN("device", ""),
		VkPipeline.IN("pipeline", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"CreatePipelineLayout",
		"Creates a new pipeline layout object.",

		VkDevice.IN("device", ""),
		const..VkPipelineLayoutCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkPipelineLayout.p.OUT("pPipelineLayout", "")
	)

	void(
		"DestroyPipelineLayout",
		"Destroys a pipeline layout object.",

		VkDevice.IN("device", ""),
		VkPipelineLayout.IN("pipelineLayout", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"CreateSampler",
		"Creates a new sampler object.",

		VkDevice.IN("device", ""),
		const..VkSamplerCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkSampler.p.OUT("pSampler", "")
	)

	void(
		"DestroySampler",
		"Destroys a sampler object.",

		VkDevice.IN("device", ""),
		VkSampler.IN("sampler", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"CreateDescriptorSetLayout",
		"Creates a new descriptor set layout.",

		VkDevice.IN("device", ""),
		const..VkDescriptorSetLayoutCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkDescriptorSetLayout.p.OUT("pSetLayout", "")
	)

	void(
		"DestroyDescriptorSetLayout",
		"Destroys a descriptor set layout object.",

		VkDevice.IN("device", ""),
		VkDescriptorSetLayout.IN("descriptorSetLayout", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"CreateDescriptorPool",
		"Creates a descriptor pool object.",

		VkDevice.IN("device", ""),
		const..VkDescriptorPoolCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkDescriptorPool.p.OUT("pDescriptorPool", "")
	)

	void(
		"DestroyDescriptorPool",
		"Destroys a descriptor pool object.",

		VkDevice.IN("device", ""),
		VkDescriptorPool.IN("descriptorPool", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"ResetDescriptorPool",
		"Resets a descriptor pool object.",

		VkDevice.IN("device", ""),
		VkDescriptorPool.IN("descriptorPool", ""),
		VkDescriptorPoolResetFlags.IN("flags", "")
	)

	VkResult(
		"AllocateDescriptorSets",
		"",

		VkDevice.IN("device", ""),
		const..VkDescriptorSetAllocateInfo_p.IN("pAllocateInfo", ""),
		Check(1)..VkDescriptorSet.p.OUT("pDescriptorSets", "")
	)

	VkResult(
		"FreeDescriptorSets",
		"Frees one or more descriptor sets.",

		VkDevice.IN("device", ""),
		VkDescriptorPool.IN("descriptorPool", ""),
		AutoSize("pDescriptorSets")..uint32_t.IN("descriptorSetCount", ""),
		SingleValue("pDescriptorSet")..const..VkDescriptorSet.p.IN("pDescriptorSets", "")
	)

	void(
		"UpdateDescriptorSets",
		"Updates the contents of a descriptor set object.",

		VkDevice.IN("device", ""),
		AutoSize("pDescriptorWrites")..uint32_t.IN("descriptorWriteCount", ""),
		nullable..const..VkWriteDescriptorSet_p.IN("pDescriptorWrites", ""),
		AutoSize("pDescriptorCopies")..uint32_t.IN("descriptorCopyCount", ""),
		nullable..const..VkCopyDescriptorSet_p.IN("pDescriptorCopies", "")
	)

	VkResult(
		"CreateFramebuffer",
		"Create a new framebuffer object.",

		VkDevice.IN("device", ""),
		const..VkFramebufferCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkFramebuffer.p.OUT("pFramebuffer", "")
	)

	void(
		"DestroyFramebuffer",
		"Destroys a framebuffer object.",

		VkDevice.IN("device", ""),
		VkFramebuffer.IN("framebuffer", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"CreateRenderPass",
		"Creates a new render pass object.",

		VkDevice.IN("device", ""),
		const..VkRenderPassCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkRenderPass.p.OUT("pRenderPass", "")
	)

	void(
		"DestroyRenderPass",
		"Destroys a render pass object.",

		VkDevice.IN("device", ""),
		VkRenderPass.IN("renderPass", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	void(
		"GetRenderAreaGranularity",
		"Returns the granularity for optimal render area.",

		VkDevice.IN("device", ""),
		VkRenderPass.IN("renderPass", ""),
		VkExtent2D.p.OUT("pGranularity", "")
	)

	VkResult(
		"CreateCommandPool",
		"Creates a new command pool object.",

		VkDevice.IN("device", ""),
		const..VkCommandPoolCreateInfo_p.IN("pCreateInfo", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", ""),
		Check(1)..VkCommandPool.p.OUT("pCommandPool", "")
	)

	void(
		"DestroyCommandPool",
		"Destroys a command pool object.",

		VkDevice.IN("device", ""),
		VkCommandPool.IN("commandPool", ""),
		nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "")
	)

	VkResult(
		"ResetCommandPool",
		"Resets a command pool.",

		VkDevice.IN("device", ""),
		VkCommandPool.IN("commandPool", ""),
		VkCommandPoolResetFlags.IN("flags", "")
	)

	VkResult(
		"AllocateCommandBuffers",
		"",

		VkDevice.IN("device", ""),
		const..VkCommandBufferAllocateInfo_p.IN("pAllocateInfo", ""),
		Check(1)..VkCommandBuffer.p.OUT("pCommandBuffers", "")
	)

	void(
		"FreeCommandBuffers",
		"Frees command buffers.",

		VkDevice.IN("device", ""),
		VkCommandPool.IN("commandPool", ""),
		AutoSize("pCommandBuffers")..uint32_t.IN("commandBufferCount", ""),
		SingleValue("pCommandBuffer")..const..VkCommandBuffer.p.IN("pCommandBuffers", "")
	)

	VkResult(
		"BeginCommandBuffer",
		"Starts recording a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		const..VkCommandBufferBeginInfo_p.IN("pBeginInfo", "")
	)

	VkResult(
		"EndCommandBuffer",
		"Finishes recording a command buffer.",

		VkCommandBuffer.IN("commandBuffer", "")
	)

	VkResult(
		"ResetCommandBuffer",
		"Resets a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkCommandBufferResetFlags.IN("flags", "")
	)

	void(
		"CmdBindPipeline",
		"Binds a pipeline object to a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkPipelineBindPoint.IN("pipelineBindPoint", ""),
		VkPipeline.IN("pipeline", "")
	)

	void(
		"CmdSetViewport",
		"Sets the viewport on a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		uint32_t.IN("firstViewport", ""),
		AutoSize("pViewports")..uint32_t.IN("viewportCount", ""),
		const..VkViewport.p.IN("pViewports", "")
	)

	void(
		"CmdSetScissor",
		"Set the dynamic scissor rectangles on a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		uint32_t.IN("firstScissor", ""),
		AutoSize("pScissors")..uint32_t.IN("scissorCount", ""),
		const..VkRect2D.p.IN("pScissors", "")
	)

	void(
		"CmdSetLineWidth",
		"Set the dynamic line width state.",

		VkCommandBuffer.IN("commandBuffer", ""),
		float.IN("lineWidth", "")
	)

	void(
		"CmdSetDepthBias",
		"Sets the depth bias dynamic state.",

		VkCommandBuffer.IN("commandBuffer", ""),
		float.IN("depthBiasConstantFactor", ""),
		float.IN("depthBiasClamp", ""),
		float.IN("depthBiasSlopeFactor", "")
	)

	void(
		"CmdSetDepthBounds",
		"Sets the depth bounds test values for a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		float.IN("minDepthBounds", ""),
		float.IN("maxDepthBounds", "")
	)

	void(
		"CmdSetStencilCompareMask",
		"Sets the stencil compare mask dynamic state.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkStencilFaceFlags.IN("faceMask", ""),
		uint32_t.IN("compareMask", "")
	)

	void(
		"CmdSetStencilWriteMask",
		"Sets the stencil write mask dynamic state.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkStencilFaceFlags.IN("faceMask", ""),
		uint32_t.IN("writeMask", "")
	)

	void(
		"CmdSetStencilReference",
		"Sets the stencil reference dynamic state.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkStencilFaceFlags.IN("faceMask", ""),
		uint32_t.IN("reference", "")
	)

	void(
		"CmdBindDescriptorSets",
		"Binds descriptor sets to a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkPipelineBindPoint.IN("pipelineBindPoint", ""),
		VkPipelineLayout.IN("layout", ""),
		uint32_t.IN("firstSet", ""),
		AutoSize("pDescriptorSets")..uint32_t.IN("descriptorSetCount", ""),
		const..VkDescriptorSet.p.IN("pDescriptorSets", ""),
		AutoSize("pDynamicOffsets")..uint32_t.IN("dynamicOffsetCount", ""),
		nullable..const..uint32_t_p.IN("pDynamicOffsets", "")
	)

	void(
		"CmdBindIndexBuffer",
		"Binds an index buffer to a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		VkBuffer.IN("buffer", ""),
		VkDeviceSize.IN("offset", ""),
		VkIndexType.IN("indexType", "")
	)

	void(
		"CmdBindVertexBuffers",
		"Binds vertex buffers to a command buffer.",

		VkCommandBuffer.IN("commandBuffer", ""),
		uint32_t.IN("firstBinding", ""),
		AutoSize("pBuffers", "pOffsets")..uint32_t.IN("bindingCount", ""),
		const..VkBuffer.p.IN("pBuffers", ""),
		const..VkDeviceSize_p.IN("pOffsets", "")
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
		const..void_p.IN("pValues", "")
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