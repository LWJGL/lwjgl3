/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_env_dot3 = "ARBTextureEnvDot3".nativeClassGL("ARB_texture_env_dot3", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Adds new dot product operation to the texture combiner operations.

		Requires ${ARB_multitexture.capLink} and ${ARB_texture_env_combine.link}. ${GL13.promoted}
		"""

	IntConstant(
		"Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB_ARB.",

		"DOT3_RGB_ARB" _ 0x86AE,
		"DOT3_RGBA_ARB" _ 0x86AF
	)

}