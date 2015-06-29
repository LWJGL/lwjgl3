/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.DRAW_INDIRECT_BUFFER

val ARB_indirect_parameters = "ARBIndirectParameters".nativeClassGL("ARB_indirect_parameters", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		OpenGL 4.3 (with the introduction of the ${ARB_multi_draw_indirect.link} extension) enhanced the ability of OpenGL to allow a large sets of parameters
		for indirect draws (introduced with OpenGL 4.0) into a buffer object and dispatch the entire list with one API call. This allows, for example, a shader
		(such as a compute shader via shader storage buffers, or a geometry shader via transform feedback) to produce lists of draw commands that can then be
		consumed by OpenGL without a server-client round trip. However, when a variable and potentially unknown number of draws are produced by such a shader,
		it becomes difficult to know how many draws are in the output array(s). Applications must resort to techniques such as transform feedback primitive
		queries, or mapping buffers containing the content of atomic counters, which can cause stalls or bubbles in the OpenGL pipeline.

		This extension introduces the concept of the "parameter buffer", which is a target allowing buffers to store parameters for certain drawing commands.
		Also in this extension, new variants of GL43#MultiDrawArraysIndirect() and GL43#MultiDrawElementsIndirect() are introduced that source some of their
		parameters from this buffer. Further commands could potentially be introduced that source other parameters from a buffer.

		Requires ${GL42.core}.
		"""

	IntConstant(
		"""
		Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
		MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
		""",

		"PARAMETER_BUFFER_ARB" _ 0x80EE
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.",

		"PARAMETER_BUFFER_BINDING_ARB" _ 0x80EF
	)

	var src = GL43["MultiDrawArraysIndirect"]
	GLvoid(
		"MultiDrawArraysIndirectCountARB",
		"""
		Behaves similarly to GL43#MultiDrawArraysIndirect(), except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
		#PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
		the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
		{@code maxdrawcount}, an implementation stop processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of four.
		""",

		src["mode"],
		Check(
			expression = "maxdrawcount * (stride == 0 ? (4 * 4) : stride)", bytes = true
		) _ MultiType(
			PointerMapping.DATA_INT
		) _ DRAW_INDIRECT_BUFFER _ const _ GLvoid_p.IN("indirect", "an array of structures containing the draw parameters"),
		GLintptr.IN("drawcount", "the offset into the parameter buffer object"),
		GLsizei.IN("maxdrawcount", "the maximum number of draws"),
		src["stride"]
	)

	src = GL43["MultiDrawElementsIndirect"]
	GLvoid(
		"MultiDrawElementsIndirectCountARB",
		"""
		Behaves similarly to GL43#MultiDrawElementsIndirect(), except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
		#PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
		the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
		{@code maxdrawcount}, an implementation stop processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of four.
		""",

		src["mode"],
		src["type"],
		Check(
			expression = "maxdrawcount * (stride == 0 ? (5 * 4) : stride)", bytes = true
		) _ MultiType(
			PointerMapping.DATA_INT
		) _ DRAW_INDIRECT_BUFFER _ const _ GLvoid_p.IN("indirect", "a structure containing an array of draw parameters"),
		GLintptr.IN("drawcount", "the offset into the parameter buffer object"),
		GLsizei.IN("maxdrawcount", "the maximum number of draws"),
		src["stride"]
	)
}