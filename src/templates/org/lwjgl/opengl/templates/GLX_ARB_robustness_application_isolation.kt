/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_ARB_robustness_application_isolation = "GLXARBRobustnessApplicationIsolation".nativeClassGLX("GLX_ARB_robustness_application_isolation", ARB) {

	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "glx_robustness_isolation")} extension.

		GL_ARB_robustness and GLX_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
		GLX_ARB_robustness_application_isolation and GLX_ARB_robustness_share_group_isolation provide stronger guarantees about the possible side-effects of a
		graphics reset.

		Requires ${GLX14.glx} and ${GLX_ARB_create_context_robustness.link}.
		"""

	IntConstant(
		"""
		Accepted as a bit in the attribute value for GLXARBCreateContext#CONTEXT_FLAGS_ARB in the {@code attrib_list} argument to
		GLXARBCreateContext#CreateContextAttribsARB().
		""",

		"CONTEXT_RESET_ISOLATION_BIT_ARB" _ 0x00000008
	)

}