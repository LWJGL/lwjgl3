/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_blend_func_extended = "ARBBlendFuncExtended".nativeClassGL("ARB_blend_func_extended") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Traditional OpenGL includes fixed-function blending that combines source colors with the existing content of a render buffer in a variety of ways. A
		number of extensions have enhanced this functionality by adding further sources of blending weights and methods to combine them. However, the inputs to
		the fixed-function blending units are constrained to a source color (as output from fragment shading), destination color (as the current content of the
		frame buffer) or constants that may be used in their place.

		This extension adds new blending functions whereby a fragment shader may output two colors, one of which is treated as the source color, and the other
		used as a blending factor for either source or destination colors. Furthermore, this extension increases orthogonality by allowing the
		GL11#SRC_ALPHA_SATURATE function to be used as the destination weight.

		Requires ${ARB_fragment_shader.link} and ${registryLinkTo("EXT", "gpu_shader4")}. ${GL33.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
		{@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.
		""",

		"SRC1_COLOR" _ 0x88F9,
		"ONE_MINUS_SRC1_COLOR" _ 0x88FA,
		"ONE_MINUS_SRC1_ALPHA" _ 0x88FB
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev.",

		"MAX_DUAL_SOURCE_DRAW_BUFFERS" _ 0x88FC
	)

	GL33 reuse "BindFragDataLocationIndexed"
	GL33 reuse "GetFragDataIndex"
}