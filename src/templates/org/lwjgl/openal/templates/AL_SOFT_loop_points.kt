/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_SOFT_loop_points() = "SOFTLoopPoints".nativeClassAL("SOFT_loop_points") {
	nativeImport (
		"OpenAL.h"
	)

	documentation = "bindings to AL_SOFT_loop_points extension."

	IntConstant.block(
		"Accepted by the {@code paramName} parameter of alBufferiv and alGetBufferiv.",

		"LOOP_POINTS_SOFT" _ 0x2015
	)
}