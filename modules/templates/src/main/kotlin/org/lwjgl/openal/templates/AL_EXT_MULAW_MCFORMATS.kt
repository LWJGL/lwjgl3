/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_MULAW_MCFORMATS = "EXTMulawMCFormats".nativeClassAL("EXT_MULAW_MCFORMATS") {
	documentation = "bindings to AL_EXT_MULAW_MCFORMATS extension."

	IntConstant(
		"AL_EXT_MULAW_MCFORMATS tokens.",

		"FORMAT_MONO_MULAW" _ 0x10014,
		"FORMAT_STEREO_MULAW" _ 0x10015,
		"FORMAT_QUAD_MULAW" _ 0x10021,
		"FORMAT_REAR_MULAW" _ 0x10022,
		"FORMAT_51CHN_MULAW" _ 0x10023,
		"FORMAT_61CHN_MULAW" _ 0x10024,
		"FORMAT_71CHN_MULAW" _ 0x10025
	)
}