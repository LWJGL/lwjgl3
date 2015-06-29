/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_MULAW = "EXTMulaw".nativeClassAL("EXT_MULAW") {
	documentation = "bindings to AL_EXT_MULAW extension."

	IntConstant(
		"AL_EXT_MULAW tokens.",

		"FORMAT_MONO_MULAW_EXT" _ 0x10014,
		"FORMAT_STEREO_MULAW_EXT" _ 0x10015
	)
}