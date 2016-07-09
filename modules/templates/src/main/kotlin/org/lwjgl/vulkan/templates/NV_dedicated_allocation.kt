/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_dedicated_allocation = "NVDedicatedAllocation".nativeClassVK("NV_dedicated_allocation", postfix = NV) {
	documentation =
		"""
		This extension allows device memory to be allocated for a particular buffer or image resource, which on some devices can significantly improve the
		performance of that resource. Normal device memory allocations must support memory aliasing and sparse binding, which could interfere with
		optimizations like framebuffer compression or efficient page table usage. This is important for render targets and very large resources, but need not
		(and probably should not) be used for smaller resources that can benefit from suballocation.

		This extension adds a few small structures to resource creation and memory allocation: a new structure that flags whether am image/buffer will have a
		dedicated allocation, and a structure indicating the image or buffer that an allocation will be bound to.
		"""

	IntConstant(
		"The extension specification version.",

		"NV_DEDICATED_ALLOCATION_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"NV_DEDICATED_ALLOCATION_EXTENSION_NAME".."VK_NV_dedicated_allocation"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV".."1000026000",
		"STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV".."1000026001",
		"STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV".."1000026002"
	)
}