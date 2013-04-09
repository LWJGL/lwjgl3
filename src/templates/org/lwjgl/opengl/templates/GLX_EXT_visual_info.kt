/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun GLX_EXT_visual_info() = "GLXEXTVisualInfo".nativeClassGLX("GLX_EXT_visual_info", EXT) {
	javaImport("org.lwjgl.system.linux.*")

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/EXT/visual_rating.txt", templateName)} extension.

		This extension allows servers to identify a particular GLX visual as undesirable. A new visual attribute is introduced, providing a way for servers to
		specify caveats (e.g., slow) for a visual. The attribute  may be queried using {@link glXGetConfig}, and can therefore be used by  application-specific visual
		selection routines. The new attribute is also used by {@link glXChooseVisual} to discriminate against visuals with caveats.

		This extension allows servers to export visuals with improved features or image quality, but lower performance or greater system burden, without having
		to have these visuals selected preferentially.  It is intended to insure that most applications get the "right" visual, not that all applications do.
		"""
	)

	IntConstant.block(
		"Accepted by the {@code attrib} parameter of {@link GLX#glXGetConfig}, and by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual}:",

		"X_VISUAL_TYPE_EXT" _ 0x22,
		"TRANSPARENT_TYPE_EXT" _ 0x23,
		"TRANSPARENT_INDEX_VALUE_EXT" _ 0x24,
		"TRANSPARENT_RED_VALUE_EXT" _ 0x25,
		"TRANSPARENT_GREEN_VALUE_EXT" _ 0x26,
		"TRANSPARENT_BLUE_VALUE_EXT" _ 0x27,
		"TRANSPARENT_ALPHA_VALUE_EXT" _ 0x28
	)

	IntConstant.block(
		"""
		Returned by {@link GLX#glXGetConfig}, and accepted by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual} (following the
		{@link #GLX_X_VISUAL_TYPE_EXT} token):
		""",

		"TRUE_COLOR_EXT" _ 0x8002,
		"DIRECT_COLOR_EXT" _ 0x8003,
		"PSEUDO_COLOR_EXT" _ 0x8004,
		"STATIC_COLOR_EXT" _ 0x8005,
		"GRAY_SCALE_EXT" _ 0x8006,
		"STATIC_GRAY_EXT" _ 0x8007
	)

	IntConstant.block(
		"""
		Returned by {@link GLX#glXGetConfig}, and accepted by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual} (following the
		{@link #GLX_TRANSPARENT_TYPE_EXT} token):
		""",

		"NONE_EXT" _ 0x8000,
		"TRANSPARENT_RGB_EXT" _ 0x8008,
		"TRANSPARENT_INDEX_EXT" _ 0x8009
	)

}