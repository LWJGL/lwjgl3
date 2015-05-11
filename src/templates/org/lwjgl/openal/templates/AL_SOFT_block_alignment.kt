/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_block_alignment = "SOFTBlockAlignment".nativeClassAL("SOFT_block_alignment") {
	documentation =
		"""
		Native bindings to the $specLinkOpenALSoft extension.

		This extension provides a mechanism for specifying block alignment properties for sample data. This is useful for, though not strictly limited to, ADPCM
		compression where the block alignment is specified in the media file header instead of the data stream, and controls the decoding process.
		"""

	IntConstant(
		"Accepted by the {@code paramName} parameter of alBufferi, alBufferiv, alGetBufferi, and alGetBufferiv.",

		"UNPACK_BLOCK_ALIGNMENT_SOFT" _ 0x200C,
		"PACK_BLOCK_ALIGNMENT_SOFT" _ 0x200D
	)
}