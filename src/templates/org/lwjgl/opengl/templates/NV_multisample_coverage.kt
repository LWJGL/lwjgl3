/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_multisample_coverage = "NVMultisampleCoverage".nativeClassGL("NV_multisample_coverage", postfix = NV) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension follows the example of the NV_framebuffer_multisample_coverage extension, which adds CSAA support for framebuffer objects. 
    
        Requires ${ARB_multisample.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code attribList} parameter of glXChooseVisual, and by the {@code attrib} parameter of glXGetConfig, the
		{@code attrib_list} parameter of glXChooseFBConfig, and the {@code attribute} parameter of glXGetFBConfigAttrib.
		""",

		"GLX_COVERAGE_SAMPLES_NV" _ 100001,
		"GLX_COLOR_SAMPLES_NV" _ 0x20B3
	)

	IntConstant(
		"""
		Accepted by the {@code piAttributes} parameter of wglGetPixelFormatAttribivEXT, wglGetPixelFormatAttribfvEXT, and the
		{@code piAttribIList} and {@code pfAttribIList} of wglChoosePixelFormatEXT.
		""",

		"WGL_COVERAGE_SAMPLES_NV" _ 0x2042,
		"WGL_COLOR_SAMPLES_NV" _ 0x20B9
	)

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.
		""",

		"COLOR_SAMPLES_NV" _ 0x8E20
	)
}