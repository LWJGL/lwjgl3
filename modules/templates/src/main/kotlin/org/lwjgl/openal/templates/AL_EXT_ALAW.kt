/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_ALAW = "EXTAlaw".nativeClassAL("EXT_ALAW") {
	documentation = "Native bindings to the $extensionName extension."

	IntConstant(
		"Buffer formats.",

		"FORMAT_MONO_ALAW_EXT"..0x10016,
		"FORMAT_STEREO_ALAW_EXT"..0x10017
	)
}