/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.PIXEL_PACK_BUFFER

val KHR_robustness = "KHRRobustness".nativeClassGL("KHR_robustness") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		The intent of this extension is to address some specific robustness goals:
		 ${ul(
			"""
			For all existing GL queries, provide additional "safe" APIs that limit data written to user pointers to a buffer size in bytes that is an explicit
			additional parameter of the query.
			""",
			"""
		    Provide a mechanism for a GL application to learn about graphics resets that affect the context.  When a graphics reset occurs, the GL context
		    becomes unusable and the application must create a new context to continue operation. Detecting a graphics reset happens through an inexpensive
		    query.
		    """,
			"Define behavior of OpenGL calls made after a graphics reset.",
			"""
		    Provide an enable to guarantee that out-of-bounds buffer object accesses by the GPU will have deterministic behavior and preclude application
		    instability or termination due to an incorrect buffer access. Such accesses include vertex buffer fetches of attributes and indices, and indexed
		    reads of uniforms or parameters from buffers.
		    """
		)}
		"""

	IntConstant(
		"Returned by #GetGraphicsResetStatus().",

		"NO_ERROR" _ 0x0000,
		"GUILTY_CONTEXT_RESET" _ 0x8253,
		"INNOCENT_CONTEXT_RESET" _ 0x8254,
		"UNKNOWN_CONTEXT_RESET" _ 0x8255
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

		"CONTEXT_ROBUST_ACCESS" _ 0x90F3,
		"RESET_NOTIFICATION_STRATEGY" _ 0x8256
	)

	IntConstant(
		"Returned by GetIntegerv and related simple queries when {@code value} is #RESET_NOTIFICATION_STRATEGY.",

		"LOSE_CONTEXT_ON_RESET" _ 0x8252,
		"NO_RESET_NOTIFICATION" _ 0x8261
	)

	IntConstant(
		"Returned by GL11#GetError().",

		"CONTEXT_LOST" _ 0x0507
	)

	GL45 reuse "GetGraphicsResetStatus"
	GL45 reuse "ReadnPixels"
	GL45 reuse "GetnUniformfv"
	GL45 reuse "GetnUniformiv"
	GL45 reuse "GetnUniformuiv"
}