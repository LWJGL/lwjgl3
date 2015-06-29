/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val amd_device_persistent_memory = "AMDDevicePersistentMemory".nativeClassCL("amd_device_persistent_memory", AMD) {

	documentation =
		"""
		Native bindings to the $extensionName extension.

		This extension adds support for the new buffer and image creation flag #MEM_USE_PERSISTENT_MEM_AMD. Buffers and images allocated with this flag reside
		in host-visible device memory.
		"""

	IntConstant(
		"""
		{@code cl_mem_flags} bit. Buffers and images allocated with this flag reside in host-visible device memory. This flag is mutually exclusive with the
		flags CL10#MEM_ALLOC_HOST_PTR and CL10#MEM_USE_HOST_PTR.
		""",

		"MEM_USE_PERSISTENT_MEM_AMD" expr "1 << 6"
	)

}