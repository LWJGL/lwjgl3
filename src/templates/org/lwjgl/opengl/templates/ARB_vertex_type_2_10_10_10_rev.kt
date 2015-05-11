/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_vertex_type_2_10_10_10_rev = "ARBVertexType2_10_10_10_REV".nativeClassGL("ARB_vertex_type_2_10_10_10_rev") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds two new vertex attribute data formats: a signed 2.10.10.10 and an unsigned 2.10.10.10 vertex data format. These vertex data formats
		describe a 4 component stream which can be used to store normals or other attributes in a quantized form. Normals, tangents, binormals and other vertex
		attributes can often be specified at reduced precision without introducing noticeable artifacts, reducing the amount of memory and memory bandwidth they consume.

		${GL33.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
		VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP and VertexAttribP*.
		""",

		"INT_2_10_10_10_REV" _ 0x8D9F
	)

	GL33 reuse "VertexP2ui"
    GL33 reuse "VertexP3ui"
    GL33 reuse "VertexP4ui"
    GL33 reuse "VertexP2uiv"
    GL33 reuse "VertexP3uiv"
    GL33 reuse "VertexP4uiv"
    GL33 reuse "TexCoordP1ui"
    GL33 reuse "TexCoordP2ui"
    GL33 reuse "TexCoordP3ui"
    GL33 reuse "TexCoordP4ui"
    GL33 reuse "TexCoordP1uiv"
    GL33 reuse "TexCoordP2uiv"
    GL33 reuse "TexCoordP3uiv"
    GL33 reuse "TexCoordP4uiv"
    GL33 reuse "MultiTexCoordP1ui"
    GL33 reuse "MultiTexCoordP2ui"
    GL33 reuse "MultiTexCoordP3ui"
    GL33 reuse "MultiTexCoordP4ui"
    GL33 reuse "MultiTexCoordP1uiv"
    GL33 reuse "MultiTexCoordP2uiv"
    GL33 reuse "MultiTexCoordP3uiv"
    GL33 reuse "MultiTexCoordP4uiv"
    GL33 reuse "NormalP3ui"
    GL33 reuse "NormalP3uiv"
    GL33 reuse "ColorP3ui"
    GL33 reuse "ColorP4ui"
    GL33 reuse "ColorP3uiv"
    GL33 reuse "ColorP4uiv"
    GL33 reuse "SecondaryColorP3ui"
    GL33 reuse "SecondaryColorP3uiv"
    GL33 reuse "VertexAttribP1ui"
    GL33 reuse "VertexAttribP2ui"
    GL33 reuse "VertexAttribP3ui"
    GL33 reuse "VertexAttribP4ui"
    GL33 reuse "VertexAttribP1uiv"
    GL33 reuse "VertexAttribP2uiv"
    GL33 reuse "VertexAttribP3uiv"
    GL33 reuse "VertexAttribP4uiv"
}