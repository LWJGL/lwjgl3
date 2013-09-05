/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*

fun GL31() = "GL31".nativeClassGL("GL31") {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc("The core OpenGL 3.1 functionality.")

	IntConstant.block(
		"Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

		"RED_SNORM" _ 0x8F90,
		"RG_SNORM" _ 0x8F91,
		"RGB_SNORM" _ 0x8F92,
		"RGBA_SNORM" _ 0x8F93,
		"R8_SNORM" _ 0x8F94,
		"RG8_SNORM" _ 0x8F95,
		"RGB8_SNORM" _ 0x8F96,
		"RGBA8_SNORM" _ 0x8F97,
		"R16_SNORM" _ 0x8F98,
		"RG16_SNORM" _ 0x8F99,
		"RGB16_SNORM" _ 0x8F9A,
		"RGBA16_SNORM" _ 0x8F9B
	)

	IntConstant.block(
		"Returned by GetTexLevelParameter and GetFramebufferAttachmentParameter.",

		"SIGNED_NORMALIZED" _ 0x8F9C
	)

	// ARB_draw_instanced

	GLvoid.func(
		"DrawArraysInstanced",
		"Draw multiple instances of a range of elements.",

		GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
		GLint.IN("first", "the starting index in the enabled arrays"),
		GLsizei.IN("count", "the number of indices to be rendered"),
		GLsizei.IN("primcount", "the number of instances of the specified range of indices to be rendered")
	)

	GLvoid.func(
		"DrawElementsInstanced",
		"Draws multiple instances of a set of elements.",

		GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
		AutoSize("indices").expression(" * GLChecks.translateTypeToBytes(type)") _ GLsizei.IN("count", "the number of elements to be rendered"),
		AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT) _ GLenum.IN(
			"type",
			"the type of the values in {@code indices}",
			"GL11#GL_UNSIGNED_BYTE GL11#GL_UNSIGNED_SHORT GL11#GL_UNSIGNED_INT"
		),
		mods(const, ELEMENT_ARRAY_BUFFER) _ GLvoid_p.IN("indices", "a pointer to the location where the indices are stored"),
		GLsizei.IN("primcount", "the number of instances of the specified range of indices to be rendered")
	)

	// ARB_copy_buffer

	IntConstant.block(
		"""
		Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
		FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.
		""",

		"COPY_READ_BUFFER" _ 0x8F36,
		"COPY_WRITE_BUFFER" _ 0x8F37
	)

	GLvoid.func(
		"CopyBufferSubData",
		"Copies part of the data store of a buffer object to the data store of another buffer object.",

		GLenum.IN("readtarget", "the target from whose data store data should be read"),
		GLenum.IN("writetarget", "the target to whose data store data should be written"),
		GLintptr.IN("readoffset", "the offset, in basic machine units, within the data store of {@code readtarget} from which data should be read"),
		GLintptr.IN("writeoffset", "the offset, in basic machine units, within the data store of {@code writetarget} to which data should be written"),
		GLsizeiptr.IN("size", "the size, in basic machine units, of the data to be copied from {@code readtarget} to {@code writetarget}")
	)

	// NV_primitive_restart

	IntConstant.block(
		"Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled.",

		"PRIMITIVE_RESTART" _ 0x8F9D
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"PRIMITIVE_RESTART_INDEX" _ 0x8F9E
	)

	GLvoid.func(
		"PrimitiveRestartIndex",
		"Specifies the primitive restart index.",

		GLuint.IN("index", "the value to be interpreted as the primitive restart index")
	)

	// ARB_texture_buffer_object

	IntConstant.block(
		"""
		Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBuffer, MapBufferRange, BindTexture, UnmapBuffer,
		GetBufferSubData, GetBufferParameteriv, GetBufferPointerv, and TexBuffer, and the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, and
		GetIntegerv.
		""",

		"TEXTURE_BUFFER" _ 0x8C2A
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.",

		"MAX_TEXTURE_BUFFER_SIZE" _ 0x8C2B,
		"TEXTURE_BINDING_BUFFER" _ 0x8C2C,
		"TEXTURE_BUFFER_DATA_STORE_BINDING" _ 0x8C2D,
		"TEXTURE_BUFFER_FORMAT" _ 0x8C2E
	)

	GLvoid.func(
		"TexBuffer",
		"Attaches the storage for a buffer object to the active buffer texture.",

		GLenum.IN("target", "the target of the operation", "#GL_TEXTURE_BUFFER"),
		GLenum.IN("internalformat", "the internal format of the data in the store belonging to {@code buffer}"),
		GLuint.IN("buffer", "the name of the buffer object whose storage to attach to the active buffer texture")
	)

	// ARB_texture_rectangle

	IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled; by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
		GetDoublev; and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameteri, TexParameterfv and
		TexParameteriv.
		""",

		"TEXTURE_RECTANGLE" _ 0x84F5
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev.",

		"TEXTURE_BINDING_RECTANGLE" _ 0x84F6
	)

	IntConstant.block(
		"Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv and TexImage2D.",

		"PROXY_TEXTURE_RECTANGLE" _ 0x84F7
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

		"MAX_RECTANGLE_TEXTURE_SIZE" _ 0x84F8
	)

	IntConstant.block(
		"Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type sampler2DRect.",

		"SAMPLER_2D_RECT" _ 0x8B63
	)

	IntConstant.block(
		"""
		Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type
		sampler2DRectShadow.
		""",

		"SAMPLER_2D_RECT_SHADOW" _ 0x8B64
	)

	// ARB_uniform_buffer_object

	IntConstant.block(
		"Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

		"UNIFORM_BUFFER" _ 0x8A11
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"UNIFORM_BUFFER_BINDING" _ 0x8A28
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetIntegeri_v.",

		"UNIFORM_BUFFER_START" _ 0x8A29,
		"UNIFORM_BUFFER_SIZE" _ 0x8A2A
	)

	IntConstant.block(
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

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH" _ 0x8A35,
		"ACTIVE_UNIFORM_BLOCKS" _ 0x8A36
	)

	IntConstant.block(
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

	val UniformBlockParameters = IntConstant.block(
		"Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.",

		"UNIFORM_BLOCK_BINDING" _ 0x8A3F,
		"UNIFORM_BLOCK_DATA_SIZE" _ 0x8A40,
		"UNIFORM_BLOCK_NAME_LENGTH" _ 0x8A41,
		"UNIFORM_BLOCK_ACTIVE_UNIFORMS" _ 0x8A42,
		"UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES" _ 0x8A43,
		"UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER" _ 0x8A44,
		"UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER" _ 0x8A45,
		"UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER" _ 0x8A46
	).toJavaDocLinks()

	IntConstant.block(
		"Returned by GetActiveUniformsiv and GetUniformBlockIndex.",

		"INVALID_INDEX" _ 0xFFFFFFFF.i
	)

	GLvoid.func(
		"GetUniformIndices",
		"Retrieves the indices of a number of uniforms within a program object",

		GLuint.IN("program", "the name of a program containing uniforms whose indices to query"),
		AutoSize("uniformNames", "uniformIndices") _ GLsizei.IN("uniformCount", "the number of uniforms whose indices to query"),
		mods(const, PointerArray(GLcharASCII_p, "uniformName", "uniformCount")) _ GLcharASCII_pp.IN(
			"uniformNames",
			"an array of pointers to buffers containing the names of the queried uniforms"
		),
		returnValue _ GLuint_p.OUT("uniformIndices", "an array that will receive the indices of the uniforms")
	)

	GLvoid.func(
		"GetActiveUniformsiv",
		"Returns information about several active uniform variables for the specified program object.",

		GLuint.IN("program", "the program object to be queried"),
		AutoSize("uniformIndices", "params") _ GLsizei.IN(
			"uniformCount",
			"the number of elements in the array of indices {@code uniformIndices} and the number of parameters written to {@code params} upon successful return"
		),
		mods(const, SingleValue("uniformIndex")) _ GLuint_p.IN("uniformIndices", "an array of {@code uniformCount} integers containing the indices of uniforms within {@code program}"),
		GLenum.IN("pname", "the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}"),
		returnValue _ GLint_p.OUT("params", "an array of {@code uniformCount} integers which are to receive the value of {@code pname} for each uniform in {@code uniformIndices}")
	)

	GLvoid.func(
		"GetActiveUniformName",
		"Queries the name of an active uniform.",

		GLuint.IN("program", "the program containing the active uniform index {@code uniformIndex}"),
		GLuint.IN("uniformIndex", "the index of the active uniform whose name to query"),
		AutoSize("uniformName") _ GLsizei.IN(
			"bufSize",
			"the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}"
		),
		mods(Check(1), nullable) _ GLsizei_p.OUT(
			"length",
			"the address of a variable that will receive the number of characters that were or would have been written to the buffer addressed by {@code uniformName}"
		),
		Return("bufSize", "length", "glGetActiveUniformsi(program, uniformIndex, GL_UNIFORM_NAME_LENGTH)") _ GLcharASCII_p.OUT(
			"uniformName",
			"the address of a buffer into which the GL will place the name of the active uniform at {@code uniformIndex} within {@code program}"
		)
	)

	GLuint.func(
		"GetUniformBlockIndex",
		"Retrieves the index of a named uniform block.",

		GLuint.IN("program", "the name of a program containing the uniform block"),
		const _ GLcharASCII_p.IN("uniformBlockName", "an array of characters to containing the name of the uniform block whose index to retrieve")
	)

	GLvoid.func(
		"GetActiveUniformBlockiv",
		"Queries information about an active uniform block.",

		GLuint.IN("program", "the name of a program containing the uniform block"),
		GLuint.IN("uniformBlockIndex", "the index of the uniform block within {@code program}"),
		GLenum.IN("pname", "the name of the parameter to query", UniformBlockParameters),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "the address of a variable to receive the result of the query")
	)

	GLvoid.func(
		"GetActiveUniformBlockName",
		"Retrieves the name of an active uniform block.",

		GLuint.IN("program", "the name of a program containing the uniform block"),
		GLuint.IN("uniformBlockIndex", " the index of the uniform block within {@code program}"),
		AutoSize("uniformBlockName") _ GLsizei.IN("bufSize", "the size of the buffer addressed by {@code uniformBlockName}"),
		mods(Check(1), nullable) _ GLsizei_p.OUT("length", "the address of a variable to receive the number of characters that were written to {@code uniformBlockName}"),
		Return("bufSize", "length", "glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH)") _ GLcharASCII_p.OUT(
			"uniformBlockName",
			"an array of characters to receive the name of the uniform block at {@code uniformBlockIndex}"
		)
	)

	GLvoid.func(
		"UniformBlockBinding",
		"Assigns a binding point to an active uniform block.",

		GLuint.IN("program", "the name of a program object containing the active uniform block whose binding to assign"),
		GLuint.IN("uniformBlockIndex", "the index of the active uniform block within {@code program} whose binding to assign"),
		GLuint.IN("uniformBlockBinding", "the binding point to which to bind the uniform block with index {@code uniformBlockIndex} within {@code program}")
	)

}