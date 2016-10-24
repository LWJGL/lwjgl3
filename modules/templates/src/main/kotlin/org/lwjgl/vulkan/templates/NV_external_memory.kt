/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_external_memory = "NVExternalMemory".nativeClassVK("NV_external_memory", postfix = NV) {
	documentation =
		"""
		Applications may wish to export memory to other Vulkan instances or other APIs, or import memory from other Vulkan instances or other APIs to enable Vulkan workloads to be split up across application module, process, or API boundaries. This extension enables applications to create exportable Vulkan memory objects such that the underlying resources can be referenced outside the Vulkan instance that created them.
		"""

	IntConstant(
		"The extension specification version.",

		"NV_EXTERNAL_MEMORY_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"NV_EXTERNAL_MEMORY_EXTENSION_NAME".."VK_NV_external_memory"
	)

	EnumConstant(
		"Extends {@code VkStructureType}.",

		"STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV".."1000056000",
		"STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV".."1000056001"
	)
}