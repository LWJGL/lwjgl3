/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_LINEAR_DISTANCE = "EXTLinearDistance".nativeClassAL("EXT_LINEAR_DISTANCE") {
	documentation = "bindings to AL_EXT_LINEAR_DISTANCE extension."

	IntConstant(
		"AL_EXT_EXPONENT_DISTANCE tokens.",

		"LINEAR_DISTANCE" _ 0xd003,
		"LINEAR_DISTANCE_CLAMPED" _ 0xd004
	)
}