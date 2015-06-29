/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_shader_storage_buffer_object = "ARBShaderStorageBufferObject".nativeClassGL("ARB_shader_storage_buffer_object") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides the ability for OpenGL shaders to perform random access reads, writes, and atomic memory operations on variables stored in a
		buffer object. Application shader code can declare sets of variables (referred to as "buffer variables") arranged into interface blocks in a manner
		similar to that done with uniform blocks in OpenGL 3.1. In both cases, the values of the variables declared in a given interface block are taken from a
		buffer object bound to a binding point associated with the block. Buffer objects used in this extension are referred to as "shader storage buffers".

		While the capability provided by this extension is similar to that provided by OpenGL 3.1 and ${ARB_uniform_buffer_object.link}, there are several
		significant differences. Most importantly, shader code is allowed to write to shader storage buffers, while uniform buffers are always read-only. Shader
		storage buffers have a separate set of binding points, with different counts and size limits. The maximum usable size for shader storage buffers is
		implementation-dependent, but its minimum value is substantially larger than the minimum for uniform buffers.

		The ability to write to buffer objects creates the potential for multiple independent shader invocations to read and write the same underlying memory.
		The same issue exists with the ${ARB_shader_image_load_store.link} extension provided in OpenGL 4.2, which can write to texture objects and buffers. In
		both cases, the specification makes few guarantees related to the relative order of memory reads and writes performed by the shader invocations. For
		ARB_shader_image_load_store, the OpenGL API and shading language do provide some control over memory transactions; those mechanisms also affect reads
		and writes of shader storage buffers. In the OpenGL API, the GL42#MemoryBarrier() call can be used to ensure that certain memory operations related to
		commands issued prior the barrier complete before other operations related to commands issued after the barrier. Additionally, the shading language
		provides the ${codeBlock("memoryBarrier()")} function to control the relative order of memory accesses within individual shader invocations and provides
		various memory qualifiers controlling how the memory corresponding to individual variables is accessed.

		Requires ${GL40.core} and ${GL43.core} or ${ARB_program_interface_query.link}. ${GL43.promoted}
		"""

	IntConstant(
		"Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

		"SHADER_STORAGE_BUFFER" _ 0x90D2
	)

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of GetIntegerv, GetIntegeri_v, GetBooleanv, GetInteger64v, GetFloatv, GetDoublev, GetBooleani_v, GetIntegeri_v,
		GetFloati_v, GetDoublei_v, and GetInteger64i_v.
		""",

		"SHADER_STORAGE_BUFFER_BINDING" _ 0x90D3
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.",

		"SHADER_STORAGE_BUFFER_START" _ 0x90D4,
		"SHADER_STORAGE_BUFFER_SIZE" _ 0x90D5
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.",

		"MAX_VERTEX_SHADER_STORAGE_BLOCKS" _ 0x90D6,
		"MAX_GEOMETRY_SHADER_STORAGE_BLOCKS" _ 0x90D7,
		"MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS" _ 0x90D8,
		"MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS" _ 0x90D9,
		"MAX_FRAGMENT_SHADER_STORAGE_BLOCKS" _ 0x90DA,
		"MAX_COMPUTE_SHADER_STORAGE_BLOCKS" _ 0x90DB,
		"MAX_COMBINED_SHADER_STORAGE_BLOCKS" _ 0x90DC,
		"MAX_SHADER_STORAGE_BUFFER_BINDINGS" _ 0x90DD,
		"MAX_SHADER_STORAGE_BLOCK_SIZE" _ 0x90DE,
		"SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT" _ 0x90DF
	)

	IntConstant(
		"Accepted in the {@code barriers} bitfield in glMemoryBarrier.",

		"SHADER_STORAGE_BARRIER_BIT" _ 0x2000
	)

	IntConstant(
		"Also, add a new alias for the existing token MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS.",

		"MAX_COMBINED_SHADER_OUTPUT_RESOURCES" _ 0x8F39
	)

	GL43 reuse "ShaderStorageBlockBinding"
}