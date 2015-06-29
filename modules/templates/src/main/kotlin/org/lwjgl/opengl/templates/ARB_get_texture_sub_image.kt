/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_get_texture_sub_image = "ARBGetTextureSubImage".nativeClassGL("ARB_get_texture_sub_image") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds a new function to get sub-regions of texture images.

		Requires ${GL20.core}. ${GL45.promoted}
		"""

	GL45 reuse "GetTextureSubImage"
	GL45 reuse "GetCompressedTextureSubImage"
}