/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_buffer_sub_data = "SOFTBufferSubData".nativeClassAL("SOFT_buffer_sub_data") {
	nativeImport (
		"OpenAL.h"
	)

	documentation = "bindings to AL_SOFT_buffer_sub_data extension."

	IntConstant(
		"Accepted by the {@code paramName} parameter of alGetSourceiv and alGetSourcefv.",

		"BYTE_RW_OFFSETS_SOFT" _ 0x1031,
		"SAMPLE_RW_OFFSETS_SOFT" _ 0x1032
	)

	ALCvoid(
		"BufferSubDataSOFT",
		"""
		To update a section of buffered sample data, use the function alBufferSubDataSOFT.
		The named {@code buffer} may be attached to a source (either queued or by the
		AL_BUFFER property), and the source does not need to be stopped, paused,
		or in an initial state to be modified.

		The {@code offset} value is the number of bytes from the start of the original
		data, and {@code length} is the number of bytes of the original data, to modify.
		If either {@code offset} or {@code length} are negative, or if the sum of {@code offset} and
		{@code length} reaches beyond the end of the buffer, an AL_INVALID_VALUE error
		is generated. For compressed formats, {@code length} and {@code offset} must be block
		aligned. Complex compressed formats (such as those with no constant block
		alignment), may not be modified and will result in an AL_INVALID_ENUM
		error.

		The specified {@code format} is the sample format of the passed {@code data}. The
		passed format must exactly match the format passed to alBufferData, or an
		AL_INVALID_ENUM error is generated.


		When modifying a playing source's buffer, an application must take care to
		not modify the section that is currently being played. The read-only
		source attributes

		  AL_BYTE_RW_OFFSETS_SOFT
		  AL_SAMPLE_RW_OFFSETS_SOFT

		may be used to retrieve the read and write cursor offsets. Behavior is
		undefined if an attempt is made to modify buffer data between the read and
		write offsets.
		""",
		ALuint.IN("buffer", "ID of the buffer to modify"),
		ALenum.IN("format", "sample format of the passed data"),
		const _ ALCvoid_p.IN("data", "existing buffer data to write to"),
		ALCsizei.IN("offset", "number of bytes from the start of the original data"),
		ALCsizei.IN("length", "number of bytes of the original data, to modify")
	)
}