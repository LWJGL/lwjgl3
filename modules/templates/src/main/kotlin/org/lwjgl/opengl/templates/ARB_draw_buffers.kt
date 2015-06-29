/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_draw_buffers = "ARBDrawBuffers".nativeClassGL("ARB_draw_buffers", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension extends ${ARB_fragment_program.link} and ${ARB_fragment_shader.link} to allow multiple output colors, and provides a mechanism for
		directing those outputs to multiple color buffers.

		Requires ${GL13.core}. ${GL20.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_DRAW_BUFFERS_ARB" _ 0x8824,
		"DRAW_BUFFER0_ARB" _ 0x8825,
		"DRAW_BUFFER1_ARB" _ 0x8826,
		"DRAW_BUFFER2_ARB" _ 0x8827,
		"DRAW_BUFFER3_ARB" _ 0x8828,
		"DRAW_BUFFER4_ARB" _ 0x8829,
		"DRAW_BUFFER5_ARB" _ 0x882A,
		"DRAW_BUFFER6_ARB" _ 0x882B,
		"DRAW_BUFFER7_ARB" _ 0x882C,
		"DRAW_BUFFER8_ARB" _ 0x882D,
		"DRAW_BUFFER9_ARB" _ 0x882E,
		"DRAW_BUFFER10_ARB" _ 0x882F,
		"DRAW_BUFFER11_ARB" _ 0x8830,
		"DRAW_BUFFER12_ARB" _ 0x8831,
		"DRAW_BUFFER13_ARB" _ 0x8832,
		"DRAW_BUFFER14_ARB" _ 0x8833,
		"DRAW_BUFFER15_ARB" _ 0x8834
	)

	GLvoid(
		"DrawBuffersARB",
		"Defines the draw buffers to which all output colors are written.",

		AutoSize("bufs") _ GLsizei.IN("n", "the number of buffers in {@code bufs}"),
		const _ GLenum_p.IN(
			"bufs",
			"a buffer of symbolic constants specifying the buffer to which each output color is written",
			"""
			GL11#NONE GL11#FRONT_LEFT GL11#FRONT_RIGHT GL11#BACK_LEFT GL11#BACK_RIGHT GL11#AUX0 GL11#AUX1 GL11#AUX2 GL11#AUX3
			GL30#COLOR_ATTACHMENT0 GL30.GL_COLOR_ATTACHMENT[1-15]
			"""
		)
	)
}