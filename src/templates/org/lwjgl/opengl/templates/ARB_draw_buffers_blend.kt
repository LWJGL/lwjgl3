/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_draw_buffers_blend() = "ARBDrawBuffersBlend".nativeClassGL("ARB_draw_buffers_blend") {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc("Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/draw_buffers_blend.txt", templateName)} extension.")

	GLvoid.func(
		"BlendEquationiARB",
		"""
		Provides a way to enable blending and set color write masks independently per color output.

		This call modifies the blend equations associated with an individual draw buffer. 

		The error ${"GL11".link("INVALID_ENUM")} is generated if the {@code buf} parameter is outside the range [0, ${"GL20".link("MAX_DRAW_BUFFERS")} &ndash; 1].

		The error ${"GL11".link("INVALID_ENUM")} is generated if {@code target} is
		${"GL14".link("BLEND_EQUATION")}, ${"GL20".link("BLEND_EQUATION_RGB")}, ${"GL20".link("BLEND_EQUATION_ALPHA")},
		${"GL11".link("BLEND_SRC")}, ${"GL14".link("BLEND_SRC_RGB")}, ${"GL14".link("BLEND_SRC_ALPHA")},
		${"GL11".link("BLEND_DST")}, ${"GL14".link("BLEND_DST_RGB")}, ${"GL14".link("BLEND_DST_ALPHA")},
		and {@code index} is outside the range [0, ${"GL20".link("MAX_DRAW_BUFFERS")} &ndash; 1].

		The error ${"GL11".link("INVALID_ENUM")} is generated if {@code mode} is not one of
		${"GL14".link("FUNC_ADD")}, ${"GL14".link("FUNC_SUBTRACT")}, ${"GL14".link("FUNC_REVERSE_SUBTRACT")},
		${"GL14".link("MAX")}, or ${"GL14".link("MIN")}.

		The error ${"GL11".link("INVALID_OPERATION")} is generated if this method is executed between the execution of
		${"GL11".link("Begin(int)")} and the corresponding execution of ${"GL11".link("End()")}.
		""",

		GLuint.IN("buf", "an integer i that indicates the ${"GL11".link("DRAW_BUFFER")} to modify."),
		GLenum.IN(
			"mode",
			"determines both the RGB and alpha blend equations",
			"""
			GL14#FUNC_ADD GL14#FUNC_SUBTRACT GL14#FUNC_REVERSE_SUBTRACT GL14#MIN GL14#MAX
			"""
		)
	)

	GLvoid.func(
		"BlendEquationSeparateiARB",
		"""
		Provides a way to enable blending and set color write masks independently per color output.

		This call modifies the blend equations associated with an individual draw buffer.

		The error ${"GL11".link("INVALID_ENUM")} is generated if the {@code buf} parameter is outside the range [0, ${"GL20".link("MAX_DRAW_BUFFERS")} &ndash; 1].

		The error ${"GL11".link("INVALID_ENUM")} is generated if {@code target} is
		${"GL14".link("BLEND_EQUATION")}, ${"GL20".link("BLEND_EQUATION_RGB")}, ${"GL20".link("BLEND_EQUATION_ALPHA")},
		${"GL11".link("BLEND_SRC")}, ${"GL14".link("BLEND_SRC_RGB")}, ${"GL14".link("BLEND_SRC_ALPHA")},
		${"GL11".link("BLEND_DST")}, ${"GL14".link("BLEND_DST_RGB")}, ${"GL14".link("BLEND_DST_ALPHA")},
		and {@code index} is outside the range [0, ${"GL20".link("MAX_DRAW_BUFFERS")} &ndash; 1].

		The error ${"GL11".link("INVALID_ENUM")} is generated if either {@code modeRGB} or {@code modeAlpha} are not one of
		${"GL14".link("FUNC_ADD")}, ${"GL14".link("FUNC_SUBTRACT")}, ${"GL14".link("FUNC_REVERSE_SUBTRACT")},
		${"GL14".link("MAX")}, or ${"GL14".link("MIN")}.

		The error ${"GL11".link("INVALID_OPERATION")} is generated if this method is executed between the execution of
		${"GL11".link("Begin(int)")} and the corresponding execution of ${"GL11".link("End()")}.
		""",

		GLuint.IN("buf", "an integer i that indicates the ${"GL11".link("DRAW_BUFFER")} to modify."),
		GLenum.IN(
			"modeRGB",
			"the RGB blend equation, must be one of",
			"""
			GL14#FUNC_ADD GL14#FUNC_SUBTRACT GL14#FUNC_REVERSE_SUBTRACT GL14#MIN GL14#MAX
			"""
		),
		GLenum.IN(
			"modeAlpha",
			"the alpha blend equation",
			"""
			GL14#FUNC_ADD GL14#FUNC_SUBTRACT GL14#FUNC_REVERSE_SUBTRACT GL14#MIN GL14#MAX
			"""
		)
	)

	GLvoid.func(
		"BlendFunciARB",
		"""
		Provides a way to enable blending and set color write masks independently per color output.

		This call modifies the blend functions associated with an individual draw buffer.

		The error ${"GL11".link("INVALID_ENUM")} is generated if the {@code buf} parameter is outside the range [0, ${"GL20".link("MAX_DRAW_BUFFERS")} &ndash; 1].

		The error ${"GL11".link("INVALID_ENUM")} is generated if {@code target} is
		${"GL14".link("BLEND_EQUATION")}, ${"GL20".link("BLEND_EQUATION_RGB")}, ${"GL20".link("BLEND_EQUATION_ALPHA")},
		${"GL11".link("BLEND_SRC")}, ${"GL14".link("BLEND_SRC_RGB")}, ${"GL14".link("BLEND_SRC_ALPHA")},
		${"GL11".link("BLEND_DST")}, ${"GL14".link("BLEND_DST_RGB")}, ${"GL14".link("BLEND_DST_ALPHA")},
		and {@code index} is outside the range [0, ${"GL20".link("MAX_DRAW_BUFFERS")} &ndash; 1].

		The error ${"GL11".link("INVALID_ENUM")} is generated if either {@code src}, or {@code dst} is not an accepted value.

		The error ${"GL11".link("INVALID_OPERATION")} is generated if this method is executed between the execution of
		${"GL11".link("Begin(int)")} and the corresponding execution of ${"GL11".link("End()")}.
		""",

		GLuint.IN("buf", "an integer i that indicates the ${"GL11".link("DRAW_BUFFER")} to modify."),
		GLenum.IN("src", "determines both RGB and alpha source functions"),
		GLenum.IN("dst", "determines both RGB and alpha destination functions")
	)

	GLvoid.func(
		"BlendFuncSeparateiARB",
		"""
		Provides a way to enable blending and set color write masks independently per color output.

		This call modifies the blend functions associated with an individual draw buffer.

		The error ${"GL11".link("INVALID_ENUM")} is generated if the {@code buf} parameter is outside the range [0, ${"GL20".link("MAX_DRAW_BUFFERS")} &ndash; 1].

		The error ${"GL11".link("INVALID_ENUM")} is generated if {@code target} is
		${"GL14".link("BLEND_EQUATION")}, ${"GL20".link("BLEND_EQUATION_RGB")}, ${"GL20".link("BLEND_EQUATION_ALPHA")},
		${"GL11".link("BLEND_SRC")}, ${"GL14".link("BLEND_SRC_RGB")}, ${"GL14".link("BLEND_SRC_ALPHA")},
		${"GL11".link("BLEND_DST")}, ${"GL14".link("BLEND_DST_RGB")}, ${"GL14".link("BLEND_DST_ALPHA")},
		and {@code index} is outside the range [0, ${"GL20".link("MAX_DRAW_BUFFERS")} &ndash; 1].

		The error ${"GL11".link("INVALID_ENUM")} is generated if either {@code srcRGB}, {@code dstRGB}, {@code srcAlpha},
		or {@code dstAlpha} is not an accepted value.

		The error ${"GL11".link("INVALID_OPERATION")} is generated if this method is executed between the execution of
		${"GL11".link("Begin(int)")} and the corresponding execution of ${"GL11".link("End()")}.
		""",

		GLuint.IN("buf", "an integer i that indicates the ${"GL11".link("DRAW_BUFFER")} to modify."),
		GLenum.IN("srcRGB", "the source RGB blend function"),
		GLenum.IN("dstRGB", "the destination RGB blend function"),
		GLenum.IN("srcAlpha", "the source alpha blend function"),
		GLenum.IN("dstAlpha", "the destination alpha blend function")
	)

}