/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_base_instance = "ARBBaseInstance".nativeClassGL("ARB_base_instance") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows the offset within buffer objects used for instanced rendering to be specified. This is congruent with the {@code first} parameter
		in GL11#DrawArrays() and the {@code basevertex} parameter in GL11#DrawElements(). When instanced rendering is performed (for example, through
		GL31#DrawArraysInstanced()), instanced vertex attributes whose vertex attribute divisors are non-zero are fetched from enabled vertex arrays
		per-instance rather than per-vertex. However, in unextended OpenGL, there is no way to define the offset into those arrays from which the attributes are
		fetched. This extension adds that offset in the form of a <baseinstance> parameter to several new procedures.

		The {@code baseinstance} parameter is added to the index of the array element, after division by the vertex attribute divisor. This allows several sets
		of instanced vertex attribute data to be stored in a single vertex array, and the base offset of that data to be specified for each draw. Further, this
		extension exposes the <baseinstance> parameter as the final and previously undefined structure member of the draw-indirect data structure.

		Requires ${GL31.core} or ${ARB_draw_instanced.link}. ${GL42.promoted}
		"""

	GL42 reuse "DrawArraysInstancedBaseInstance"
	GL42 reuse "DrawElementsInstancedBaseInstance"
    GL42 reuse "DrawElementsInstancedBaseVertexBaseInstance"
}