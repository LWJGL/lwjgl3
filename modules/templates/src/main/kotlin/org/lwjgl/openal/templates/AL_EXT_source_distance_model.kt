/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_source_distance_model = "EXTSourceDistanceModel".nativeClassAL("EXT_source_distance_model") {
	documentation =
		"""
		Native bindings to the $specLinkOpenALSoft extension.

		This extension allows each source to specify a distance model, instead of being restricted to one distance model for every source in the context. It
		provides a mechanism for applications to apply different models to each source, without the burden of manually applying the attenuation through the
		source gain.
		"""

	IntConstant(
		"Accepted by the {@code target} parameter of alEnable, alDisable, and alIsEnabled.",

		"SOURCE_DISTANCE_MODEL" _ 0x200
	)
}