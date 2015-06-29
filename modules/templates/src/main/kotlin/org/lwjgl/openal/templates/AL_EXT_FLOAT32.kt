/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_FLOAT32 = "EXTFloat32".nativeClassAL("EXT_FLOAT32") {
	documentation = "bindings to AL_EXT_FLOAT32 extension."

	IntConstant(
		"AL_EXT_FLOAT32 tokens.",

		"FORMAT_MONO_FLOAT32" _ 0x10010,
		"FORMAT_STEREO_FLOAT32" _ 0x10011
	)
}