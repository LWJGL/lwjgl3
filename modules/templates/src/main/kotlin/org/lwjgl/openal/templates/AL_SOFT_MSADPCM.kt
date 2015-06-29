/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_MSADPCM = "SOFTMSADPCM".nativeClassAL("SOFT_MSADPCM") {
	documentation =
		"""
		Native bindings to the $specLinkOpenALSoft extension.

		This extension adds support for MSADPCM compressed sample formats.
		"""

	IntConstant(
		"Accepted by the {@code format} parameter of alBufferData.",

		"FORMAT_MONO_MSADPCM_SOFT" _ 0x1302,
		"FORMAT_STEREO_MSADPCM_SOFT" _ 0x1303
	)
}