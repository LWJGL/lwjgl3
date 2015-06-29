/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_uniform_buffer_unified_memory = "NVUniformBufferUnifiedMemory".nativeClassGL("NV_uniform_buffer_unified_memory", postfix = NV) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a mechanism to specify uniform buffers
    using GPU addresses.

    Binding uniform buffers is one of the most frequent and expensive
    operations in many GL applications, due to the cost of chasing 
    pointers and binding objects described in the overview of 
    NV_shader_buffer_load. The intent of this extension is to enable a 
    way for the application to specify uniform buffer state that alleviates
    the overhead of object binds and driver memory management.
		"""

	IntConstant(
		"Accepted by the {@code cap} parameter of DisableClientState, EnableClientState, IsEnabled.",

		"UNIFORM_BUFFER_UNIFIED_NV" _ 0x936E
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of BufferAddressRangeNV and the {@code value} parameter of GetIntegerui64i_vNV.",

		"UNIFORM_BUFFER_ADDRESS_NV" _ 0x936F
	)

	IntConstant(
		"Accepted by the {@code target} parameter of GetIntegeri_vNV.",

		"UNIFORM_BUFFER_LENGTH_NV" _ 0x9370
	)
}