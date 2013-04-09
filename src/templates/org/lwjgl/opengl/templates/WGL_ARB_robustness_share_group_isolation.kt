/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

fun WGL_ARB_robustness_share_group_isolation() = "WGLARBRobustnessShareGroupIsolation".nativeClassWGL("WGL_ARB_robustness_share_group_isolation", ARB) {
	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/ARB/wgl_robustness_isolation.txt", templateName)} extension.

		GL_ARB_robustness and WGL_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
		WGL_ARB_robustness_share_group_isolation provides stronger guarantees about the possible side-effects of a graphics reset.
		"""
	)

	IntConstant.block(
		"""
		Accepted as a bit in the attribute value for {@link WGLARBCreateContext#WGL_CONTEXT_FLAGS_ARB} in the {@code attribList} argument to
		{@link WGLARBCreateContext#wglCreateContextAttribsARB}.
		""",
	
		"CONTEXT_RESET_ISOLATION_BIT_ARB" _ 0x00000008
	)

}