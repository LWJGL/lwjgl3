/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_vorbis = "EXTVorbis".nativeClassAL("EXT_vorbis") {
	documentation = "Native bindings to the $extensionName extension."

	IntConstant(
		"$extensionName tokens.",

		"FORMAT_VORBIS_EXT"..0x10003
	)
}