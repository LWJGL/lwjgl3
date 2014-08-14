/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_get_texture_sub_image() = "ARBGetTextureSubImage".nativeClassGL("ARB_get_texture_sub_image") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/get_texture_sub_image.txt", templateName)} extension.

		This extension adds a new function to get sub-regions of texture images.
		"""

	GL45 reuse "GetTextureSubImage"
	GL45 reuse "GetCompressedTextureSubImage"
}