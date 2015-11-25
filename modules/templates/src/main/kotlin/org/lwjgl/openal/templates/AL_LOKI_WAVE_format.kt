/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_LOKI_WAVE_format = "LOKIWAVEFormat".nativeClassAL("LOKI_WAVE_format") {
	documentation = "Native bindings to the $extensionName extension."

	IntConstant(
		"Buffer formats.",

		"FORMAT_WAVE_EXT"..0x10002
	)
}