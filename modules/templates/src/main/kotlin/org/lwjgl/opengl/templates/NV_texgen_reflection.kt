/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_texgen_reflection = "NVTexgenReflection".nativeClassGL("NV_texgen_reflection", postfix = NV) {
	documentation =
		"""
		Native bindings to the $registryLink extension.
		
		This extension provides two new texture coordinate generation modes that are useful texture-based lighting and environment mapping.
		"""

	IntConstant(
		"Accepted by the {@code param} parameter of TexGend, TexGenf, TexGeni when {@code pname} parameter is TEXTURE_GEN_MODE",

		"NORMAL_MAP_NV" _ 0x8511,
		"REFLECTION_MAP_NV" _ 0x8512
	)
}