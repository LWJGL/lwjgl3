/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_vertex_attrib_binding = "ARBVertexAttribBinding".nativeClassGL("ARB_vertex_attrib_binding") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		OpenGL currently supports (at least) 16 vertex attributes and 16 vertex buffer bindings, with a fixed mapping between vertex attributes and vertex
		buffer bindings. This extension allows the application to change the mapping between attributes and bindings, which can make it more efficient to update
		vertex buffer bindings for interleaved vertex formats where many attributes share the same buffer.

		This extension also separates the vertex binding update from the vertex attribute format update, which saves applications the effort of redundantly
		specifying the same format state over and over.

		Conceptually, this extension splits the state for generic vertex attribute arrays into:
		${ul(
			"""
			An array of vertex buffer binding points, each of which specifies:
			${ul(
				"a bound buffer object",
				"a starting offset for the vertex attribute data in that buffer object",
				"a stride used by all attributes using that binding point, and",
				"a frequency divisor used by all attributes using that binding point."
			)}
			""",
		    """
		    An array of generic vertex attribute format information records, each of which specifies:
		    ${ul(
			    "a reference to one of the new buffer binding points above",
			    "a component count and format, and a normalization flag for the attribute data, and",
			    "the offset of the attribute data relative to the base offset of each vertex found at the associated binding point."
		    )}
		    """
		)}
		${GL43.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetVertexAttrib*v.",

		"VERTEX_ATTRIB_BINDING" _ 0x82D4,
		"VERTEX_ATTRIB_RELATIVE_OFFSET" _ 0x82D5
	)

	IntConstant(
		"Accepted by the {@code target} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.",

		"VERTEX_BINDING_DIVISOR" _ 0x82D6,
		"VERTEX_BINDING_OFFSET" _ 0x82D7,
		"VERTEX_BINDING_STRIDE" _ 0x82D8,
		"VERTEX_BINDING_BUFFER" _ 0x8F4F
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegerv, ....",

		"MAX_VERTEX_ATTRIB_RELATIVE_OFFSET" _ 0x82D9,
		"MAX_VERTEX_ATTRIB_BINDINGS" _ 0x82DA
	)

	GL43 reuse "BindVertexBuffer"
	GL43 reuse "VertexAttribFormat"
	GL43 reuse "VertexAttribIFormat"
	GL43 reuse "VertexAttribLFormat"
	GL43 reuse "VertexAttribBinding"
	GL43 reuse "VertexBindingDivisor"

	val vaobj = GLuint.IN("vaobj", "the vertex array object")
	var src = GL43["BindVertexBuffer"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"VertexArrayBindVertexBufferEXT",
		"DSA version of #BindVertexBuffer().",

		vaobj,
		src["bindingindex"],
		src["buffer"],
		src["offset"],
		src["stride"]
	)

	src = GL43["VertexAttribFormat"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"VertexArrayVertexAttribFormatEXT",
		"DSA version of #VertexAttribFormat().",

		vaobj,
		src["attribindex"],
		src["size"],
		src["type"],
		src["normalized"],
		src["relativeoffset"]
	)

	src = GL43["VertexAttribIFormat"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"VertexArrayVertexAttribIFormatEXT",
		"DSA version of #VertexAttribIFormat().",

		vaobj,
		src["attribindex"],
		src["size"],
		src["type"],
		src["relativeoffset"]
	)

	src = GL43["VertexAttribLFormat"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"VertexArrayVertexAttribLFormatEXT",
		"DSA version of #VertexAttribLFormat().",

		vaobj,
		src["attribindex"],
		src["size"],
		src["type"],
		src["relativeoffset"]
	)

	src = GL43["VertexAttribBinding"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"VertexArrayVertexAttribBindingEXT",
		"DSA version of #VertexAttribBinding().",

		vaobj,
		src["attribindex"],
		src["bindingindex"]
	)

	src = GL43["VertexBindingDivisor"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"VertexArrayVertexBindingDivisorEXT",
		"DSA version of #VertexBindingDivisor().",

		vaobj,
		src["bindingindex"],
		src["divisor"]
	)
}