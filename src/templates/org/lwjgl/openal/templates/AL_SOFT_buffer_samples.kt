/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_buffer_samples = "SOFTBufferSamples".nativeClassAL("SOFT_buffer_samples") {
	nativeImport (
		"OpenAL.h"
	)

	documentation =
		"""
		Native bindings to the $specLinkOpenALSoft extension.

		This extension provides a more flexible mechanism for loading buffer data, as well as a method to retrieve buffer data. Unextended OpenAL only provides
		a method to specify a single buffer format when loading data, which defines the data given by the application. The AL is given leeway in converting the
		data, so that it is possible or more efficient to use internally. However, there are some drawbacks to this approach:
		${ul(
			"""
			The conversion done by the implementation is hidden from the app. This makes it difficult for the app to know what kind of precision it will have,
			and impossible to request a storage precision.
			""",
		    "Conversion is not guaranteed, so the application can be restricted in the formats that can be loaded depending on the implementation."
		)}
		If the application could specify the internal storage format, as well as use a separate format to specify the incoming data's format, it would allow to
		add more input formats (signed 8-bit, 32-bit int, and float, for example), with no undue burden placed on the implementation beyond needing some
		conversion routines. The application can then be assured that many different formats can be loaded, even if storage is restricted to a comparatively
		small subset.

		In addition, unextended OpenAL does not have any methods for updating only a portion of a buffer, nor a method to retrieve the data from a buffer.
		"""

	val InternalFormatParameters = IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of alBufferSamplesSOFT (values are shared with standard OpenAL, AL_EXT_FLOAT32, and AL_EXT_MCFORMATS).
		""",

		"MONO8_SOFT" _ 0x1100,
		"MONO16_SOFT" _ 0x1101,
		"MONO32F_SOFT" _ 0x10010,
		"STEREO8_SOFT" _ 0x1102,
		"STEREO16_SOFT" _ 0x1103,
		"STEREO32F_SOFT" _ 0x10011,
		"QUAD8_SOFT" _ 0x1204,
		"QUAD16_SOFT" _ 0x1205,
		"QUAD32F_SOFT" _ 0x1206,
		"REAR8_SOFT" _ 0x1207,
		"REAR16_SOFT" _ 0x1208,
		"REAR32F_SOFT" _ 0x1209,
		"5POINT1_8_SOFT" _ 0x120A,
		"5POINT1_16_SOFT" _ 0x120B,
		"5POINT1_32F_SOFT" _ 0x120C,
		"6POINT1_8_SOFT" _ 0x120D,
		"6POINT1_16_SOFT" _ 0x120E,
		"6POINT1_32F_SOFT" _ 0x120F,
		"7POINT1_8_SOFT" _ 0x1210,
		"7POINT1_16_SOFT" _ 0x1211,
		"7POINT1_32F_SOFT" _ 0x1212
	).javaDocLinks

	val ChannelsParameter = IntConstant(
		"Accepted by the {@code channels} parameter of alBufferSamplesSOFT, alBufferSubSamplesSOFT, and alGetBufferSamplesSOFT.",

		"MONO_SOFT" _ 0x1500,
		"STEREO_SOFT" _ 0x1501,
		"QUAD_SOFT" _ 0x1502,
		"REAR_SOFT" _ 0x1503,
		"5POINT1_SOFT" _ 0x1504,
		"6POINT1_SOFT" _ 0x1505,
		"7POINT1_SOFT" _ 0x1506
	).javaDocLinks

	val TypeParameters = IntConstant(
		"Accepted by the {@code type} parameter of alBufferSamplesSOFT, alBufferSubSamplesSOFT, and alGetBufferSamplesSOFT.",

		"BYTE_SOFT" _ 0x1400,
		"UNSIGNED_BYTE_SOFT" _ 0x1401,
		"SHORT_SOFT" _ 0x1402,
		"UNSIGNED_SHORT_SOFT" _ 0x1403,
		"INT_SOFT" _ 0x1404,
		"UNSIGNED_INT_SOFT" _ 0x1405,
		"FLOAT_SOFT" _ 0x1406,
		"DOUBLE_SOFT" _ 0x1407,
		"BYTE3_SOFT" _ 0x1408,
		"UNSIGNED_BYTE3_SOFT" _ 0x1409
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code paramName} parameter of alGetBufferi and alGetBufferiv.",

		"INTERNAL_FORMAT_SOFT" _ 0x2008,
		"BYTE_LENGTH_SOFT" _ 0x2009,
		"SAMPLE_LENGTH_SOFT" _ 0x200A
	)

	IntConstant(
		"Accepted by the {@code paramName} parameter of alGetBufferf and alGetBufferfv.",

		"SEC_LENGTH_SOFT" _ 0x200B
	)

	IntConstant(
		"Accepted by the {@code paramName} parameter of alGetSourceiv and alGetSourcefv (these are the same as in AL_SOFT_buffer_sub_data).",

		"BYTE_RW_OFFSETS_SOFT" _ 0x1031,
		"SAMPLE_RW_OFFSETS_SOFT" _ 0x1032
	)

	ALvoid(
		"BufferSamplesSOFT",
		"""
		Removes a buffer's sample data and replaces it with new data. The named {@code buffer} must be a buffer ID returned by AL10#GenBuffers(), and not
		currently be attached to or queued on a source. The given {@code samplerate} is the number of sample frames per second the data will play at, and the
		{@code internalformat} is the storage format used. The number of uncompressed sample frames to load is specified by {@code samples}.

		The {@code channels} and {@code type} parameters specify the channel configuration and sample type of the provided data. The samples will be converted
		to the internal storage format as needed, however the channel configuration must match the channel configuration of the storage format or an
		AL10#INVALID_ENUM error will be generated.

		The {@code data} pointer should hold enough data as specified by the {@code channels}, {@code type}, and {@code samples} parameters, and will be copied
		and converted into the buffer's storage. It may also be $NULL, in which case the stored data will be undefined.

		If {@link SOFTLoopPoints AL_SOFT_loop_points} is supported, a successful call will reset the start and end loop points to 0 and {@code samples}
		respectively.
		""",
		ALuint.IN("buffer", "the buffer ID"),
		ALuint.IN("samplerate", "the number of sample frames per second the data will play at"),
		ALenum.IN("internalformat", "the internal format", InternalFormatParameters),
		ALsizei.IN("samples", "the number of uncompressed sample frames to load"),
		ALenum.IN("channels", "the channel configuration of the provided data", ChannelsParameter),
		ALenum.IN("type", "the type of the provided data", TypeParameters),
		const _ ALCvoid_p.IN("data", "the buffer data")
	)

	ALCboolean(
		"IsBufferFormatSupportedSOFT",
		"Queries if a storage format is supported by the implementation",

		ALCenum.IN("format", "the format to query", InternalFormatParameters),
	    returnDoc =
	        """
	        false if the specified {@code format} is not a recognized storage format. Otherwise, if it returns true it may be specified as the
	        {@code internalformat} for #BufferSamplesSOFT().
	        """
	)

	ALCvoid(
		"BufferSubSamplesSOFT",
		"""
		Update a buffer with new data. {@code buffer} is the ID of the buffer to modify. {@code offset} is the first sample frame in the internal storage to be
		modified, and {@code samples} is the number of sample frames to modify. They must not extend beyond the existing internal storage length. The
		{@code channels} and {@code type} parameters specify the channel configuration and sample type of the provided data buffer, specified by {@code data},
		which will be copied and converted to the buffer's storage format. As with #BufferSamplesSOFT(), the channel configuration must match the storage
		format's channel configuration or an AL10#INVALID_ENUM error will be generated.

		When modifying a buffer that's playing on a source, an application must take care to not modify the section that is currently being played. The
		read-only source attributes #BYTE_RW_OFFSETS_SOFT and #SAMPLE_RW_OFFSETS_SOFT may be used to retrieve the read and write cursor offsets. Behavior is
		undefined if an attempt is made to modify buffer data between the read and write offsets.
		""",
		ALuint.IN("buffer", "the buffer ID"),
		ALCsizei.IN("offset", "the first sample frame in the internal storage to be modified"),
		ALCsizei.IN("samples", "the number of sample frames to modify"),
		ALenum.IN("channels", "the channel configuration of the provided data", ChannelsParameter),
		ALenum.IN("type", "the type of the provided data", TypeParameters),
		const _ ALCvoid_p.IN("data", "the buffer data")
	)

	ALCvoid(
		"GetBufferSamplesSOFT",
		"""
		Reads the number of sample frames, given by {@code samples}, starting at {@code offset}, and converts them to the channel configuration and sample type
		specified by {@code channels} and {@code type}, before writing to the provided {@code data} buffer pointer. An AL10#INVALID_VALUE error is generated if
		{@code offset} and {@code samples} reach beyond the range of the buffer. The channel configuration must match the internal storage format's channel
		configuration, or else an AL10#INVALID_ENUM error will be generated.
		""",

		ALuint.IN("buffer", "the buffer to read"),
		ALCsizei.IN("offset", "the sample frame offset"),
		ALCsizei.IN("samples", "the number of sample frames to read"),
		ALenum.IN("channels", "the target channel configuration", ChannelsParameter),
		ALenum.IN("type", "the target sample type", TypeParameters),
		ALCvoid_p.OUT("data", "buffer to write to")
	)
}