/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_texture_barrier = "NVTextureBarrier".nativeClassGL("NV_texture_barrier", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid
		read-after-write hazards.
		"""

	GLvoid(
		"TextureBarrierNV",
		""
	)
}