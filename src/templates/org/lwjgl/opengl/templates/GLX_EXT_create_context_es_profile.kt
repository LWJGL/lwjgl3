/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun GLX_EXT_create_context_es_profile() = "GLXEXTCreateContextESProfile".nativeClassGLX("GLX_EXT_create_context_es_profile", EXT) {

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/EXT/glx_create_context_es2_profile.txt", templateName)} extension.

		This extension allows creating an OpenGL ES context.
		"""
	)

	IntConstant.block(
		"Accepted as a bit in the attribute value for {@link GLXARBCreateContext#GLX_CONTEXT_PROFILE_MASK_ARB} in {@code attrib_list}:",

		"CONTEXT_ES_PROFILE_BIT_EXT" _ 0x00000004
	)

}