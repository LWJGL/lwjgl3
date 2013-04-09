/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun GLX_EXT_visual_rating() = "GLX_EXTVisualRating".nativeClassGLX("GLX_EXT_visual_rating", EXT) {
	javaImport("org.lwjgl.linux.system")

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/EXT/visual_info.txt", templateName)} extension.

		This extension allows the user to request a particular X visual type to be associated with a GLX visual, and allows the user to query the X visual type
		underlying a GLX visual.

		In addition, this extension provides a means to request a visual with a transparent pixel and to query whether a visual supports a transparent pixel
		value and the value of the transparent pixel. Note that the notion of level and transparent pixels are orthogonal as both layer 1 and layer 0 visuals
		may or may not have a transparent pixel value.
		"""
	)

	IntConstant.block(
		"Accepted by the {@code attrib} parameter of {@link GLX#glXGetConfi}g, and by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual}:",

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
		Returned by {@link #glXGetConfig}, and accepted by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual} (following the
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