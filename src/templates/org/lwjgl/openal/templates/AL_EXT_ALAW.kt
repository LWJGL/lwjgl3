/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_ALAW = "EXTAlaw".nativeClassAL("EXT_ALAW") {
	documentation = "bindings to AL_EXT_ALAW extension."

	IntConstant(
		"AL_EXT_ALAW tokens.",

		"FORMAT_MONO_ALAW_EXT" _ 0x10016,
		"FORMAT_STEREO_ALAW_EXT" _ 0x10017
	)
}