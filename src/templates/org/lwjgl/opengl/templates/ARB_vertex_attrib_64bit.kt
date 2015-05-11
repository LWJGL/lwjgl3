/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_vertex_attrib_64bit = "ARBVertexAttrib64Bit".nativeClassGL("ARB_vertex_attrib_64bit") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides OpenGL shading language support for vertex shader inputs with 64-bit floating-point components and OpenGL API support for
		specifying the value of those inputs using vertex array or immediate mode entry points. This builds on the support for general-purpose support for
		64-bit floating-point values in the ARB_gpu_shader_fp64 extension.

		This extension provides a new class of vertex attribute functions, beginning with "VertexAttribL" ("L" for "long"), that can be used to specify
		attributes with 64-bit floating-point components. This extension provides no automatic type conversion between attribute and shader variables;
		single-precision attributes are not automatically converted to double-precision or vice versa. For shader variables with 64-bit component types, the
		"VertexAttribL" functions must be used to specify attribute values. For other shader variables, the "VertexAttribL" functions must not be used. If a
		vertex attribute is specified using the wrong attribute function, the values of the corresponding shader input are undefined. This approach requiring
		matching types is identical to that used for the "VertexAttribI" functions provided by OpenGL 3.0 and the ${registryLinkTo("EXT", "gpu_shader4")}
		extension.

		Additionally, some vertex shader inputs using the wider 64-bit components may count double against the implementation-dependent limit on the number of
		vertex shader attribute vectors. A 64-bit scalar or a two-component vector consumes only a single generic vertex attribute; three- and four-component
		"long" may count as two. This approach is similar to the one used in the current GL where matrix attributes consume multiple attributes.

		Note that 64-bit generic vertex attributes were nominally supported beginning with the introduction of vertex shaders in OpenGL 2.0. However, the OpenGL
		Shading Language at the time had no support for 64-bit data types, so any such values were automatically converted to 32-bit.

		Support for 64-bit floating-point vertex attributes in this extension can be combined with other extensions. In particular, this extension provides an
		entry point that can be used with EXT_direct_state_access to directly set state for any vertex array object. Also, the related
		${registryLinkTo("NV", "vertex_attrib_integer_64bit")} extension provides an entry point to specify bindless vertex attribute arrays with 64-bit
		components, integer or floating-point.

		Requires ${GL30.core}, GLSL 1.30 and ${ARB_gpu_shader_fp64.link}. ${GL41.promoted}
		"""

	IntConstant(
		"Returned in the {@code type} parameter of GetActiveAttrib.",

		"DOUBLE_VEC2" _ 0x8FFC,
		"DOUBLE_VEC3" _ 0x8FFD,
		"DOUBLE_VEC4" _ 0x8FFE,
		"DOUBLE_MAT2" _ 0x8F46,
		"DOUBLE_MAT3" _ 0x8F47,
		"DOUBLE_MAT4" _ 0x8F48,
		"DOUBLE_MAT2x3" _ 0x8F49,
		"DOUBLE_MAT2x4" _ 0x8F4A,
		"DOUBLE_MAT3x2" _ 0x8F4B,
		"DOUBLE_MAT3x4" _ 0x8F4C,
		"DOUBLE_MAT4x2" _ 0x8F4D,
		"DOUBLE_MAT4x3" _ 0x8F4E
	)

	GL41 reuse "VertexAttribL1d"
	GL41 reuse "VertexAttribL2d"
	GL41 reuse "VertexAttribL3d"
	GL41 reuse "VertexAttribL4d"
	GL41 reuse "VertexAttribL1dv"
	GL41 reuse "VertexAttribL2dv"
	GL41 reuse "VertexAttribL3dv"
	GL41 reuse "VertexAttribL4dv"

	GL41 reuse "VertexAttribLPointer"

	GL41 reuse "GetVertexAttribLdv"

	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"VertexArrayVertexAttribLOffsetEXT",
		"DSA version of #VertexAttribLPointer().",

		GLuint.IN("vaobj", "the vertex array object"),
		GLuint.IN("buffer", "the buffer object"),
		GLuint.IN("index", "the index of the generic vertex attribute to be modified"),
		GLint.IN("size", "the number of values per vertex that are stored in the array. The initial value is 4", "1 2 3 4 GL12#BGRA"),
		GLenum.IN("type", "the data type of each component in the array", "GL11#DOUBLE"),
		GLsizei.IN(
			"stride",
			"""
			the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
			the array. The initial value is 0.
			"""
		),
		GLintptr.IN(
			"offset",
			"the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer. The initial value is 0."
		)
	)
}