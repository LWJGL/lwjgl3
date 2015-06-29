/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_EXT_DEDICATED = "EXTDedicated".nativeClassALC("EXT_DEDICATED", prefix = AL) {
	documentation = "bindings to ALC_EXT_DEDICATED extension."

	IntConstant(
		"ALC_EXT_DEDICATED tokens.",

		"DEDICATED_GAIN " _ 0x1,
		"EFFECT_DEDICATED_DIALOGUE" _ 0x9001,
		"EFFECT_DEDICATED_LOW_FREQUENCY_EFFECT" _ 0x9000
	)
}