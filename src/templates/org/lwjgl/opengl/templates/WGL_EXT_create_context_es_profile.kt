/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_EXT_create_context_es_profile = "WGLEXTCreateContextESProfile".nativeClassWGL("WGL_EXT_create_context_es_profile", EXT) {
	documentation =
		"""
		Native bindings to the ${registryLink("EXT", "framebuffer_sRGB")} extension.

		This extension allows creating an OpenGL ES context.

		Requires ${WGL_ARB_extensions_string.link}, ${WGL_ARB_create_context.link}, ${WGL_ARB_create_context_profile.link} and an OpenGL ES implementation.
		"""

	IntConstant(
		"Accepted as a bit in the attribute value for WGLARBCreateContextProfile#CONTEXT_PROFILE_MASK_ARB in {@code attribList}.",

		"CONTEXT_ES_PROFILE_BIT_EXT" _ 0x00000004
	)

}