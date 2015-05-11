/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_draw_buffers_blend = "ARBDrawBuffersBlend".nativeClassGL("ARB_draw_buffers_blend", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension builds upon the ${ARB_draw_buffers.link} and ${registryLinkTo("EXT", "draw_buffers2")} extensions. In ARB_draw_buffers (part of OpenGL
		2.0), separate values could be written to each color buffer. This was further enhanced by EXT_draw_buffers2 by adding in the ability to enable blending
		and to set color write masks independently per color output.

		This extension provides the ability to set individual blend equations and blend functions for each color output.

		Requires ${GL20.core} and ${registryLinkTo("EXT", "draw_buffers2")}. ${GL40.promoted}
		"""

	val blendEquations = "GL14#FUNC_ADD GL14#FUNC_SUBTRACT GL14#FUNC_REVERSE_SUBTRACT GL14#MIN GL14#MAX"

	GLvoid(
		"BlendEquationiARB",
		"""
		Provides a way to enable blending and set color write masks independently per color output.

		This call modifies the blend equations associated with an individual draw buffer. 

		The error $INVALID_ENUM is generated if the {@code buf} parameter is outside the range [0, GL20#MAX_DRAW_BUFFERS &ndash; 1].

		The error $INVALID_ENUM is generated if {@code mode} is not one of GL14#FUNC_ADD, GL14#FUNC_SUBTRACT,
		GL14#FUNC_REVERSE_SUBTRACT, GL14#MAX, or GL14#MIN.

		The error $INVALID_OPERATION is generated if this method is executed between the execution of GL11#Begin() and the corresponding execution
		of GL11#End().
		""",

		GLuint.IN("buf", "an integer that indicates the GL11#DRAW_BUFFER to modify."),
		GLenum.IN("mode", "determines both the RGB and alpha blend equations", blendEquations)
	)

	GLvoid(
		"BlendEquationSeparateiARB",
		"""
		Provides a way to enable blending and set color write masks independently per color output.

		This call modifies the blend equations associated with an individual draw buffer.

		The error $INVALID_ENUM is generated if the {@code buf} parameter is outside the range [0, GL20#MAX_DRAW_BUFFERS &ndash; 1].

		The error $INVALID_ENUM is generated if either {@code modeRGB} or {@code modeAlpha} are not one of GL14#FUNC_ADD,
		GL14#FUNC_SUBTRACT, GL14#FUNC_REVERSE_SUBTRACT, GL14#MAX, or GL14#MIN.

		The error $INVALID_OPERATION is generated if this method is executed between the execution of GL11#Begin() and the corresponding execution
		of GL11#End().
		""",

		GLuint.IN("buf", "an integer that indicates the GL11#DRAW_BUFFER to modify."),
		GLenum.IN("modeRGB", "the RGB blend equation", blendEquations),
		GLenum.IN("modeAlpha", "the alpha blend equation", blendEquations)
	)

	GLvoid(
		"BlendFunciARB",
		"""
		Provides a way to enable blending and set color write masks independently per color output.

		This call modifies the blend functions associated with an individual draw buffer.

		The error $INVALID_ENUM is generated if the {@code buf} parameter is outside the range [0, GL20#MAX_DRAW_BUFFERS &ndash; 1].

		The error $INVALID_ENUM is generated if either {@code src}, or {@code dst} is not an accepted value.

		The error $INVALID_OPERATION is generated if this method is executed between the execution of GL11#Begin() and the corresponding execution
		of GL11#End().
		""",

		GLuint.IN("buf", "an integer that indicates the GL11#DRAW_BUFFER to modify."),
		GLenum.IN("src", "determines both RGB and alpha source functions"),
		GLenum.IN("dst", "determines both RGB and alpha destination functions")
	)

	GLvoid(
		"BlendFuncSeparateiARB",
		"""
		Provides a way to enable blending and set color write masks independently per color output.

		This call modifies the blend functions associated with an individual draw buffer.

		The error $INVALID_ENUM is generated if the {@code buf} parameter is outside the range [0, GL20#MAX_DRAW_BUFFERS &ndash; 1].

		The error $INVALID_ENUM is generated if either {@code srcRGB}, {@code dstRGB}, {@code srcAlpha}, or {@code dstAlpha} is not an accepted value.

		The error $INVALID_OPERATION is generated if this method is executed between the execution of GL11#Begin() and the corresponding execution
		of GL11#End().
		""",

		GLuint.IN("buf", "an integer that indicates the GL11#DRAW_BUFFER to modify."),
		GLenum.IN("srcRGB", "the source RGB blend function"),
		GLenum.IN("dstRGB", "the destination RGB blend function"),
		GLenum.IN("srcAlpha", "the source alpha blend function"),
		GLenum.IN("dstAlpha", "the destination alpha blend function")
	)

}