/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_DOUBLE = "EXTDouble".nativeClassAL("EXT_DOUBLE") {
	documentation = "bindings to AL_EXT_DOUBLE extension."

	IntConstant(
		"AL_EXT_DOUBLE tokens.",

		"FORMAT_MONO_DOUBLE_EXT" _ 0x10012,
		"FORMAT_STEREO_DOUBLE_EXT" _ 0x10013
	)
}