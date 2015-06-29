/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_transform_feedback4 = "AMDTransformFeedback4".nativeClassGL("AMD_transform_feedback4", postfix = AMD) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension enhances transform feedback in two significant ways. First, it allows multiple transform feedback streams to be captured, each with its
		own, independent primitve type. Second, it allows any combination of streams to be rasterized.

		Requires ${GL40.core} or ${ARB_transform_feedback3.link}.
		"""

	IntConstant(
		"Accepted by the {@code pname} argument to Enablei. Disablei and IsEnabledi.",

		"STREAM_RASTERIZATION_AMD" _ 0x91A0
	)
}