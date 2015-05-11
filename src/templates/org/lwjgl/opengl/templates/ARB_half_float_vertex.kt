/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_half_float_vertex = "ARBHalfFloatVertex".nativeClassGL("ARB_half_float_vertex") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension extends the usage of the half-precision (16-bit) floating-point quantities introduced in ${ARB_half_float_pixel.link} for usage in
		specifying vertex array data.

		This extension allows applications to use half-precision floating point data when specifying vertices. This can allow applications to reduce their
		memory footprint, as well as the memory bandwidth required for vertex data.

		This extension extends the existing vertex array commands to accept the new data type.

		${GL30.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and
		VertexAttribPointer.
		""",

		"HALF_FLOAT" _ 0x140B
	)
}