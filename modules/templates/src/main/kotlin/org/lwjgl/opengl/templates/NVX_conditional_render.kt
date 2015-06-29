/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NVX_conditional_render = "NVXConditionalRender".nativeClassGL("NVX_conditional_render", postfix = NVX) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides support for conditional rendering based on the
		results of an occlusion query.  This mechanism allows an application to
		potentially reduce the latency between the completion of an occlusion
		query and the rendering commands depending on its result.  It additionally
		allows the decision of whether to render to be made without application
		intervention.
    
		Requires ${GL15.core} or ${ARB_occlusion_query.link}
		"""

	GLvoid(
		"BeginConditionalRenderNVX",
		"",
		
		GLuint.IN("id", "")
	)

	GLvoid(
		"EndConditionalRenderNVX",
		""
	)
}
