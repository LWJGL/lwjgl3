/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_EXPONENT_DISTANCE = "EXTExponentDistance".nativeClassAL("EXT_EXPONENT_DISTANCE") {
	documentation = "bindings to AL_EXT_EXPONENT_DISTANCE extension."

	IntConstant(
		"AL_EXT_EXPONENT_DISTANCE tokens.",

		"EXPONENT_DISTANCE" _ 0xd005,
		"EXPONENT_DISTANCE_CLAMPED" _ 0xd006
	)
}