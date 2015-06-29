/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_EXT_visual_rating = "GLXEXTVisualRating".nativeClassGLX("GLX_EXT_visual_rating", EXT) {
	javaImport("org.lwjgl.system.linux.*")

	documentation =
		"""
		Native bindings to the ${registryLink("EXT", "visual_info")} extension.

		This extension allows servers to identify a particular GLX visual as undesirable. A new visual attribute is introduced, providing a way for servers to
		specify caveats (e.g., slow) for a visual. The attribute  may be queried using GLX#GetConfig(), and can therefore be used by
		application-specific visual selection routines. The new attribute is also used by GLX#ChooseVisual() to discriminate against visuals with
		caveats.

		This extension allows servers to export visuals with improved features or image quality, but lower performance or greater system burden, without having
		to have these visuals selected preferentially.  It is intended to insure that most applications get the "right" visual, not that all applications do.
		"""

	IntConstant(
		"Accepted by the {@code attribute} parameter of GLX#GetConfig() and by the {@code attrib_list} parameter of GLX#ChooseVisual().",

		"VISUAL_CAVEAT_EXT" _ 0x20
	)

	IntConstant(
		"""
		Returned by the {@code value} parameter of GLX#GetConfig() (when {@code attribute} is set to #VISUAL_CAVEAT_EXT) and accepted by the {@code attrib_list}
		parameter of GLX#ChooseVisual() (following the #VISUAL_CAVEAT_EXT token).
		""",

		"NONE_EXT" _ 0x8000,
		"SLOW_VISUAL_EXT" _ 0x8001,
		"NON_CONFORMANT_VISUAL_EXT" _ 0x800D
	)

}