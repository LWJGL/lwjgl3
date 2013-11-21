/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_enhanced_layouts() = "ARBEnhancedLayouts".nativeClassGL("ARB_enhanced_layouts") {
	nativeImport (
		"OpenGL.h"
	)

	documentation = "Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/enhanced_layouts.txt", templateName)} extension."

	IntConstant.block(
		"Accepted in the {@code props} array of ${"GL43#GetProgramResourcei()".link}.",

		"LOCATION_COMPONENT" _ 0x934A,
		"TRANSFORM_FEEDBACK_BUFFER_INDEX" _ 0x934B,
		"TRANSFORM_FEEDBACK_BUFFER_STRIDE" _ 0x934C
	)

}