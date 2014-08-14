/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_texture_barrier() = "ARBTextureBarrier".nativeClassGL("ARB_texture_barrier") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/texture_barrier.txt", templateName)} extension.

		This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid read-after-write hazards.
		"""

	GL45 reuse "TextureBarrier"
}