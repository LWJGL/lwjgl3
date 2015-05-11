/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_transform_feedback_overflow_query = "ARBTransformFeedbackOverflowQuery".nativeClassGL("ARB_transform_feedback_overflow_query", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds new query types which can be used to detect overflow of transform feedback buffers. The new query types are also accepted by
		conditional rendering commands.

		Requires ${GL30.core}.
		"""

	IntConstant(
		"""
		Accepted by the {@code target} parameter of GL15#BeginQuery(), GL15#EndQuery(), GL15#GetQueryiv(),
		GL40#BeginQueryIndexed(), GL40#EndQueryIndexed() and GL40#GetQueryIndexediv().
		""",

		"TRANSFORM_FEEDBACK_OVERFLOW_ARB" _ 0x82EC,
		"TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB" _ 0x82ED
	)
}