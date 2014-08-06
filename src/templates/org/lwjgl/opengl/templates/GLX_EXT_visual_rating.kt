/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun GLX_EXT_visual_rating() = "GLXEXTVisualRating".nativeClassGLX("GLX_EXT_visual_rating", EXT) {
	javaImport("org.lwjgl.system.linux.*")

	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/EXT/visual_info.txt", templateName)} extension.

		This extension allows servers to identify a particular GLX visual as undesirable. A new visual attribute is introduced, providing a way for servers to
		specify caveats (e.g., slow) for a visual. The attribute  may be queried using ${"GLX#GetConfig()".link}, and can therefore be used by
		application-specific visual selection routines. The new attribute is also used by ${"GLX#ChooseVisual()".link} to discriminate against visuals with
		caveats.

		This extension allows servers to export visuals with improved features or image quality, but lower performance or greater system burden, without having
		to have these visuals selected preferentially.  It is intended to insure that most applications get the "right" visual, not that all applications do.
		"""

	IntConstant.block(
		"Accepted by the {@code attribute} parameter of ${"GLX#GetConfig()".link} and by the {@code attrib_list} parameter of ${"GLX#ChooseVisual()".link}:",

		"VISUAL_CAVEAT_EXT" _ 0x20
	)

	IntConstant.block(
		"""
		Returned by the {@code value} parameter of ${"GLX#GetConfig()".link} (when {@code attribute} is set to ${"VISUAL_CAVEAT_EXT".link}) and accepted by the {@code attrib_list}
		parameter of ${"GLX#ChooseVisual()".link} (following the ${"VISUAL_CAVEAT_EXT".link} token):
		""",

		"NONE_EXT" _ 0x8000,
		"SLOW_VISUAL_EXT" _ 0x8001,
		"NON_CONFORMANT_VISUAL_EXT" _ 0x800D
	)

}