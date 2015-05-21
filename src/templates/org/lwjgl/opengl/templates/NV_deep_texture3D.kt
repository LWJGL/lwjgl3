/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_deep_texture3D = "NVDeepTexture3D".nativeClassGL("NV_deep_texture3D", postfix = NV) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Some applications require 3D textures that have a significant number of slices, but less resolution in width and height. In the current spec, the
		maximum value for the size of all three dimensions is specified by a single value. This extension adds a second set of limits against which 3D textures
		can be checked if an application needs deeper textures than would be allowed by the symmetric texture limits.
		"""

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.
		""",

		"MAX_DEEP_3D_TEXTURE_WIDTH_HEIGHT_NV" _ 0x90D0,
		"MAX_DEEP_3D_TEXTURE_DEPTH_NV" _ 0x90D1
	)
}