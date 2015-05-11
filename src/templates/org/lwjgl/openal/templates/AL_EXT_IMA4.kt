/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_IMA4 = "EXTIma4".nativeClassAL("EXT_IMA4") {
	documentation = "bindings to AL_EXT_IMA4 extension."

	IntConstant(
		"AL_EXT_IMA4 tokens.",

		"FORMAT_MONO_IMA4" _ 0x1300,
		"FORMAT_STEREO_IMA4" _ 0x1301
	)
}