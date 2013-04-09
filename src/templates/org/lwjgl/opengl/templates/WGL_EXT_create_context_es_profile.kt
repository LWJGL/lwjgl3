/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

fun WGL_EXT_create_context_es_profile() = "WGLEXTCreateContextESProfile".nativeClassWGL("WGL_EXT_create_context_es_profile", EXT) {
	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/EXT/framebuffer_sRGB.txt", templateName)} extension.

		  This extension allows creating an OpenGL ES context.
		"""
	)

	IntConstant.block(
		"Accepted as a bit in the attribute value for {@link WGLARBCreateContextProfile#WGL_CONTEXT_PROFILE_MASK_ARB} in {@code attribList}.",

		"CONTEXT_ES_PROFILE_BIT_EXT" _ 0x00000004
	)

}