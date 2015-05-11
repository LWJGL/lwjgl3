/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.IN
import org.lwjgl.generator.IntConstant
import org.lwjgl.opengl.*

val ATI_texture_compression_3dc = "ATITextureCompression3DC".nativeClassGL("ATI_texture_compression_3dc", postfix = ATI) {
	documentation =
		"""This extension is undocumented. See <a href="http://www.hardwaresecrets.com/datasheets/3Dc_White_Paper.pdf">3Dc™ White Paper</a> for information."""

	IntConstant(
		"Accepted by the {@code internalformat} parameter of TexImage functions.",

		"COMPRESSED_LUMINANCE_ALPHA_3DC_ATI" _ 0x8837
	)
}