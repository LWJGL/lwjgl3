/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_initialize_memory = "KHRInitializeMemory".nativeClassCL("khr_initialize_memory", KHR) {

	documentation = "Native bindings to the $extensionName extension."

	IntConstant(
		"""
		Accepted as a property name in the {@code properties} parameter of CL10#CreateContext().

		Describes which memory types for the context must be initialized. This is a bit-field, where the following values are currently supported:
		${ul(
			// TODO: Find these values
			"{@code CL_CONTEXT_MEMORY_INITIALIZE_LOCAL_KHR} &ndash; Initialize local memory to zeros.",
			"{@code CL_CONTEXT_MEMORY_INITIALIZE_PRIVATE_KHR} &ndash; Initialize private memory to zeros."
		)}
		""",

		"CONTEXT_MEMORY_INITIALIZE_KHR" _ 0x200E
	)

}