/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_MCFORMATS = "EXTMCFormats".nativeClassAL("EXT_MCFORMATS") {
	documentation = "bindings to AL_EXT_MCFORMATS extension."

	IntConstant(
		"AL_EXT_MCFORMATS tokens.",

		"FORMAT_QUAD8" _ 0x1204,
		"FORMAT_QUAD16" _ 0x1205,
		"FORMAT_QUAD32" _ 0x1206,
		"FORMAT_REAR8" _ 0x1207,
		"FORMAT_REAR16" _ 0x1208,
		"FORMAT_REAR32" _ 0x1209,
		"FORMAT_51CHN8" _ 0x120A,
		"FORMAT_51CHN16" _ 0x120B,
		"FORMAT_51CHN32" _ 0x120C,
		"FORMAT_61CHN8" _ 0x120D,
		"FORMAT_61CHN16" _ 0x120E,
		"FORMAT_61CHN32" _ 0x120F,
		"FORMAT_71CHN8" _ 0x1210,
		"FORMAT_71CHN16" _ 0x1211,
		"FORMAT_71CHN32" _ 0x1212
	)
}