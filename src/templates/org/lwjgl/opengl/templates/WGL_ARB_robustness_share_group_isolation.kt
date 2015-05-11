/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_ARB_robustness_share_group_isolation = "WGLARBRobustnessShareGroupIsolation".nativeClassWGL("WGL_ARB_robustness_share_group_isolation", ARB) {
	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "wgl_robustness_isolation")} extension.

		GL_ARB_robustness and WGL_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
		WGL_ARB_robustness_share_group_isolation provides stronger guarantees about the possible side-effects of a graphics reset.

		Requires ${WGL_ARB_extensions_string.link} and ${WGL_ARB_create_context_robustness.link}.
		"""

	IntConstant(
		"""
		Accepted as a bit in the attribute value for WGLARBCreateContext#CONTEXT_FLAGS_ARB in the {@code attribList} argument to
		WGLARBCreateContext#CreateContextAttribsARB().
		""",

		"CONTEXT_RESET_ISOLATION_BIT_ARB" _ 0x00000008
	)

}