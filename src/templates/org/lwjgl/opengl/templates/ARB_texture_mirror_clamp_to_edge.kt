/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_texture_mirror_clamp_to_edge() = "ARBTextureMirrorClampToEdge".nativeClassGL("ARB_texture_mirror_clamp_to_edge") {
	nativeImport (
		"OpenGL.h"
	)

	documentation = "Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/texture_mirror_clamp_to_edge.txt", templateName)} extension."

	IntConstant.block(
		"""
		Accepted by the {@code param} parameter of TexParameter{if}, SamplerParameter{if} and SamplerParameter{if}v, and by the {@code params} parameter of
		TexParameter{if}v, TexParameterI{i ui}v and SamplerParameterI{i ui}v when their {@code pname} parameter is GL11#TEXTURE_WRAP_S, GL11#TEXTURE_WRAP_T, or
		GL12#TEXTURE_WRAP_R.
		""",

		"MIRROR_CLAMP_TO_EDGE" _ 0x8743
	)

}