/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_mirrored_repeat = "ARBTextureMirroredRepeat".nativeClassGL("ARB_texture_mirrored_repeat", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		ARB_texture_mirrored_repeat extends the set of texture wrap modes to include a mode (#MIRRORED_REPEAT_ARB) that effectively uses a texture map twice
		as large at the original image in which the additional half, for each coordinate, of the new image is a mirror image of the original image.

		This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching "mirror image".

		${GL14.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
		when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
		""",

		"MIRRORED_REPEAT_ARB" _ 0x8370
	)

}