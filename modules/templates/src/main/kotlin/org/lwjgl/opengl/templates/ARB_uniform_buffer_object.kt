/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_uniform_buffer_object = "ARBUniformBufferObject".nativeClassGL("ARB_uniform_buffer_object") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension introduces the concept of a group of GLSL uniforms known as a "uniform block", and the API mechanisms to store "uniform blocks" in GL
		buffer objects.

		The extension also defines both a standard cross-platform layout in memory for uniform block data, as well as mechanisms to allow the GL to optimize the
		data layout in an implementation-defined manner.

		Prior to this extension, the existing interface for modification of uniform values allowed modification of large numbers of values using glUniform*
		calls, but only for a single uniform name (or a uniform array) at a time. However, updating uniforms in this manner may not map well to heterogenous
		uniform data structures defined for a GL application and in these cases, the application is forced to either:
		${ol(
			"restructure their uniform data definitions into arrays or",
		    "make an excessive number of calls through the GL interface to one of the Uniform* variants.",
		    marker = 'A'
		)}

		These solutions have their disadvantages. Solution A imposes considerable development overhead on the application developer. Solution B may impose
		considerable run-time overhead on the application if the number of uniforms modified in a given frame of rendering is sufficiently large.

		This extension provides a better alternative to either (A) or (B) by allowing buffer object backing for the storage associated with all uniforms of a
		given GLSL program.

		Storing uniform blocks in buffer objects enables several key use cases:
		${ul(
			"sharing of uniform data storage between program objects and between program stages",
		    "rapid swapping of sets of previously defined uniforms by storing sets of uniform data on the GL server",
		    "rapid updates of uniform data from both the client and the server"
		)}
		The data storage for a uniform block can be declared to use one of three layouts in memory: packed, shared, or std140.
		${ul(
			"""
			"packed" uniform blocks have an implementation-dependent data layout for efficiency, and unused uniforms may be eliminated by the compiler to save
			space.
			""",
		    """
		    "shared" uniform blocks, the default layout, have an implementation-dependent data layout for efficiency, but the layout will be uniquely determined
		    by the structure of the block, allowing data storage to be shared across programs.
		    """,
		    "\"std140\" uniform blocks have a standard cross-platform cross-vendor layout (see below). Unused uniforms will not be eliminated."
		)}
		Any uniforms not declared in a named uniform block are said to be part of the "default uniform block".

		While uniforms in the default uniform block are updated with glUniform* entry points and can have static initializers, uniforms in named uniform blocks
		are not. Instead, uniform block data is updated using the routines that update buffer objects and can not use static initializers.

		Rules and Concepts Guiding this Specification:

		For reference, a uniform has a "uniform index" (subsequently referred to as "u_index) and also a "uniform location" to efficiently identify it in the
		uniform data store of the implementation. We subsequently refer to this uniform data store of the implementation as the "uniform database".

		A "uniform block" only has a "uniform block index" used for queries and connecting the "uniform block" to a buffer object. A "uniform block" has no
		"location" because "uniform blocks" are not updated directly. The buffer object APIs are used instead.

		Properties of Uniforms and uniform blocks:
		${ol(
			"A uniform is \"active\" if it exists in the database and has a valid u_index.",
			"A \"uniform block\" is \"active\" if it exists in the database and has a valid ub_index.",
			"Uniforms and \"uniform blocks\" can be inactive because they don't exist in the source, or because they have been removed by dead code elimination.",
			"An inactive uniform has u_index == #INVALID_INDEX.",
			"An inactive uniform block has ub_index == #INVALID_INDEX.",
			"A u_index or ub_index of #INVALID_INDEX generates the GL11#INVALID_VALUE error if given as a function argument.",
			"""
			The default uniform block, which is not assigned any ub_index, uses a private, internal data storage, and does not have any buffer object associated
			with it.
			""",
			"An active uniform that is a member of the default uniform block has location >= 0 and it has offset == stride == -1.",
			"An active uniform that is a member of a named uniform block has location == -1.",
			"A uniform location of -1 is silently ignored if given as a function argument.",
			"Uniform block declarations may not be nested",
			marker = 'a'
		)}
		Requires ${GL20.core} or ${ARB_shader_objects.link} and ${GL15.core} or ${ARB_vertex_buffer_object.link}. ${GL31.promoted}
		"""

	IntConstant(
		"Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

		"UNIFORM_BUFFER" _ 0x8A11
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"UNIFORM_BUFFER_BINDING" _ 0x8A28
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegeri_v.",

		"UNIFORM_BUFFER_START" _ 0x8A29,
		"UNIFORM_BUFFER_SIZE" _ 0x8A2A
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_VERTEX_UNIFORM_BLOCKS" _ 0x8A2B,
		"MAX_GEOMETRY_UNIFORM_BLOCKS" _ 0x8A2C,
		"MAX_FRAGMENT_UNIFORM_BLOCKS" _ 0x8A2D,
		"MAX_COMBINED_UNIFORM_BLOCKS" _ 0x8A2E,
		"MAX_UNIFORM_BUFFER_BINDINGS" _ 0x8A2F,
		"MAX_UNIFORM_BLOCK_SIZE" _ 0x8A30,
		"MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS" _ 0x8A31,
		"MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS" _ 0x8A32,
		"MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS" _ 0x8A33,
		"UNIFORM_BUFFER_OFFSET_ALIGNMENT" _ 0x8A34
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH" _ 0x8A35,
		"ACTIVE_UNIFORM_BLOCKS" _ 0x8A36
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveUniformsiv.",

		"UNIFORM_TYPE" _ 0x8A37,
		"UNIFORM_SIZE" _ 0x8A38,
		"UNIFORM_NAME_LENGTH" _ 0x8A39,
		"UNIFORM_BLOCK_INDEX" _ 0x8A3A,
		"UNIFORM_OFFSET" _ 0x8A3B,
		"UNIFORM_ARRAY_STRIDE" _ 0x8A3C,
		"UNIFORM_MATRIX_STRIDE" _ 0x8A3D,
		"UNIFORM_IS_ROW_MAJOR" _ 0x8A3E
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.",

		"UNIFORM_BLOCK_BINDING" _ 0x8A3F,
		"UNIFORM_BLOCK_DATA_SIZE" _ 0x8A40,
		"UNIFORM_BLOCK_NAME_LENGTH" _ 0x8A41,
		"UNIFORM_BLOCK_ACTIVE_UNIFORMS" _ 0x8A42,
		"UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES" _ 0x8A43,
		"UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER" _ 0x8A44,
		"UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER" _ 0x8A45,
		"UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER" _ 0x8A46
	)

	IntConstant(
		"Returned by GetActiveUniformsiv and GetUniformBlockIndex.",

		"INVALID_INDEX" _ 0xFFFFFFFF.i
	)

	GL31 reuse "GetUniformIndices"
	GL31 reuse "GetActiveUniformsiv"
	GL31 reuse "GetActiveUniformName"
	GL31 reuse "GetUniformBlockIndex"
	GL31 reuse "GetActiveUniformBlockiv"
	GL31 reuse "GetActiveUniformBlockName"
	GL30 reuse "BindBufferRange"
	GL30 reuse "BindBufferBase"
	GL30 reuse "GetIntegeri_v"
	GL31 reuse "UniformBlockBinding"
}