/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_loop_points = "SOFTLoopPoints".nativeClassAL("SOFT_loop_points") {
	documentation =
		"""
		Native bindings to the $specLinkOpenALSoft extension.

		This extension allows an application to specify the offsets at which a buffer loops. Unextended OpenAL only allows for a source to loop a whole buffer,
		or all buffers of a queue, which is not desirable for sounds that may want a lead-in or lead-out along with the looping portion.
		"""

	IntConstant(
		"Accepted by the {@code paramName} parameter of alBufferiv and alGetBufferiv.",

		"LOOP_POINTS_SOFT" _ 0x2015
	)
}