/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_OFFSET = "EXTOffset".nativeClassAL("EXT_OFFSET") {
	documentation = "bindings to AL_EXT_OFFSET extension."

	IntConstant(
		"AL_EXT_OFFSET tokens.",

		"SEC_OFFSET" _ 0x1024,
		"SAMPLE_OFFSET" _ 0x1025,
		"BYTE_OFFSET" _ 0x1026
	)
}