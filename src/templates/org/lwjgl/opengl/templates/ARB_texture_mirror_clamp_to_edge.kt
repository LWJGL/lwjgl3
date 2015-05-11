/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_mirror_clamp_to_edge = "ARBTextureMirrorClampToEdge".nativeClassGL("ARB_texture_mirror_clamp_to_edge") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		ARB_texture_mirror_clamp_to_edge extends the set of texture wrap modes to include an additional mode (#MIRROR_CLAMP_TO_EDGE) that effectively uses a
		texture map twice as large as the original image in which the additional half of the new image is a mirror image of the original image.

		This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching "mirror image". This
		mode allows the texture to be mirrored only once in the negative s, t, and r directions.

		Requires ${GL14.core}. ${GL44.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code param} parameter of TexParameter{if}, SamplerParameter{if} and SamplerParameter{if}v, and by the {@code params} parameter of
		TexParameter{if}v, TexParameterI{i ui}v and SamplerParameterI{i ui}v when their {@code pname} parameter is GL11#TEXTURE_WRAP_S, GL11#TEXTURE_WRAP_T, or
		GL12#TEXTURE_WRAP_R.
		""",

		"MIRROR_CLAMP_TO_EDGE" _ 0x8743
	)

}