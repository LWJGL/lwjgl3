/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_ENUMERATE_ALL_EXT = "EnumerateAllExt".nativeClassALC("ENUMERATE_ALL_EXT") {
	documentation = "bindings to ALC_ENUMERATE_ALL_EXT extension."

	IntConstant(
		"ENUMERATE_ALL_EXT tokens.",

		"DEFAULT_ALL_DEVICES_SPECIFIER" _ 0x1012,
		"ALL_DEVICES_SPECIFIER" _ 0x1013
	)
}