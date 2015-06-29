/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_enhanced_layouts = "ARBEnhancedLayouts".nativeClassGL("ARB_enhanced_layouts") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds the following functionality to layout qualifiers, including broadening the API where this functionality is reflected. The following
		are added:
		${ol(
			"Use compile-time constant expressions.",
		    "Specify explicit byte offsets within a uniform or shader storage block.",
		    "Force alignment within a uniform or shader storage block.",
		    "Specify component numbers to more fully utilize the vec4-slot interfaces between shader outputs and shader inputs.",
		    "Specify transform/feedback buffers, locations, and widths.",
		    "Allow locations on input and output blocks for SSO interface matching."
		)}
		Requires ${GL31.core} and GLSL 1.40. ${GL44.promoted}
		"""

	IntConstant(
		"Accepted in the {@code props} array of GL43#GetProgramResourceiv().",

		"LOCATION_COMPONENT" _ 0x934A,
		"TRANSFORM_FEEDBACK_BUFFER_INDEX" _ 0x934B,
		"TRANSFORM_FEEDBACK_BUFFER_STRIDE" _ 0x934C
	)

}