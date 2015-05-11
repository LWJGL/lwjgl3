/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_gather = "ARBTextureGather".nativeClassGL("ARB_texture_gather", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a new set of texture functions (textureGather) to the shading language that determine 2x2 footprint that are used for linear
		filtering in a texture lookup, and return a vector consisting of the first component from each of the four texels in the footprint.

		${GL40.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB" _ 0x8E5E,
		"MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB" _ 0x8E5F,
		"MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB" _ 0x8F9F
	)
}