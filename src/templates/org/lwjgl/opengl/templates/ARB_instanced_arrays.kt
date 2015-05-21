/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_instanced_arrays = "ARBInstancedArrays".nativeClassGL("ARB_instanced_arrays", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
		count and type, multiple times. This extension provides a means of accelerating such use cases while restricting the number of API calls, and keeping
		the amount of duplicate data to a minimum.
  
		In particular, this extension specifies an alternative to the read-only shader variable introduced by ARB_draw_instanced. It uses the same draw calls
		introduced by that extension, but redefines them so that a vertex shader can instead use vertex array attributes as a source of instance data.
  
		This extension introduces an array "divisor" for generic vertex array attributes, which when non-zero specifies that the attribute is "instanced". An
		instanced attribute does not advance per-vertex as usual, but rather after every <divisor> conceptual draw calls.
  
		(Attributes which aren't instanced are repeated in their entirety for every conceptual draw call.)
  
		By specifying transform data in an instanced attribute or series of instanced attributes, vertex shaders can, in concert with the instancing draw calls,
		draw multiple instances of an object with one draw call.

		${GL33.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, and GetVertexAttribiv.",

		"VERTEX_ATTRIB_ARRAY_DIVISOR_ARB" _ 0x88FE
	)

	GLvoid(
		"VertexAttribDivisorARB",
		"""
		Modifies the rate at which generic vertex attributes advance when rendering multiple instances of primitives in a single draw call. If {@code divisor}
		is zero, the attribute at slot {@code index} advances once per vertex. If {@code divisor} is non-zero, the attribute advances once per {@code divisor}
		instances of the set(s) of vertices being rendered. An attribute is referred to as {@code instanced} if its {@code divisor} value is non-zero.
		""",

		GLuint.IN("index", "the attribute index"),
		GLuint.IN("divisor", "the divisor value")
	)

	DependsOn("GL_EXT_direct_state_access") _ ignoreMissing _ GLvoid(
		"VertexArrayVertexAttribDivisorEXT",
		"""
		${registryLinkTo("EXT", "direct_state_access")} version of #VertexAttribDivisorARB().

		This function was added to the extension specification in July 2013. Implemenations are allowed to expose ARB_instanced_arrays without providing this
		function. The correct way to test its availability is:
		${codeBlock("""
ContextCapabilities caps = GL.getCapabilities();
if ( caps.GL_ARB_instanced_arrays && ARBInstancedArrays.getInstance().VertexArrayVertexAttribDivisorEXT != NULL )
	glVertexArrayVertexAttribDivisorEXT(...); // the DSA function can now be used""")}
		""",

		GLuint.IN("vaobj", "the vertex array object"),
		GLuint.IN("index", "the attribute index"),
		GLuint.IN("divisor", "the divisor value")
	)
}
