/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

fun WGL_ARB_create_context_profile() = "WGLARBCreateContextProfile".nativeClassWGL("WGL_ARB_create_context_profile", ARB) {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/ARB/wgl_create_context.txt", templateName)} extension.

		Add an attribute to {@link WGLARBCreateContext}, specifying the GL profile requested for a context of OpenGL 3.2 or later.
		"""
	)

	IntConstant.block(
		"Accepted as an attribute name in {@code attribList}.",
	
		"CONTEXT_PROFILE_MASK_ARB" _ 0x9126
	)

	IntConstant.block(
		"Accepted as bits in the attribute value for {@link #WGL_CONTEXT_PROFILE_MASK_ARB} in {@code attribList}.",
	
		"CONTEXT_CORE_PROFILE_BIT_ARB" _ 0x00000001,
		"CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB" _ 0x00000002
	)

}