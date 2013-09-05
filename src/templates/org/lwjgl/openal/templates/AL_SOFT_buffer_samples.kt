/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_SOFT_buffer_samples() = "SOFTBufferSamples".nativeClassAL("SOFT_buffer_samples") {
	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to AL_SOFT_buffer_samples extension.")

	val InternalFormatParameters = IntConstant.block(
		"Accepted by the @{code channels} parameter of alBufferSamplesSOFT (values are shared with standard OpenAL, AL_EXT_FLOAT32, and AL_EXT_MCFORMATS).",

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
	).toJavaDocLinks();

	val ChannelsParameter = IntConstant.block(
		"Accepted by the @{code channels} parameter of alBufferSamplesSOFT, alBufferSubSamplesSOFT, and alGetBufferSamplesSOFT.",

		"MONO_SOFT" _ 0x1500,
		"STEREO_SOFT" _ 0x1501,
		"QUAD_SOFT" _ 0x1502,
		"REAR_SOFT" _ 0x1503,
		"5POINT1_SOFT" _ 0x1504,
		"6POINT1_SOFT" _ 0x1505,
		"7POINT1_SOFT" _ 0x1506
	).toJavaDocLinks();

	val TypeParameters = IntConstant.block(
		"Accepted by the @{code channels} parameter of alBufferSamplesSOFT, alBufferSubSamplesSOFT, and alGetBufferSamplesSOFT.",

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
	).toJavaDocLinks();

	val BufferParamNameIParameters = IntConstant.block(
		"Accepted by the @{code channels} parameter of alGetBufferi and alGetBufferiv.",

		"INTERNAL_FORMAT_SOFT" _ 0x2008,
		"BYTE_LENGTH_SOFT" _ 0x2009,
		"SAMPLE_LENGTH_SOFT" _ 0x200A
	).toJavaDocLinks();

	val BufferParamNameFParameters = IntConstant.block(
		"Accepted by the @{code channels} parameter of alGetBufferf and alGetBufferfv.",

		"SEC_LENGTH_SOFT" _ 0x200B
	).toJavaDocLinks();

	val SourceParamNameParameters = IntConstant.block(
		"Accepted by the @{code channels} parameter of alGetSourceiv and alGetSourcefv (these are the same as in AL_SOFT_buffer_sub_data).",

		"BYTE_RW_OFFSETS_SOFT" _ 0x1031,
		"SAMPLE_RW_OFFSETS_SOFT" _ 0x1032
	).toJavaDocLinks();

	ALvoid.func(
		"BufferSamplesSOFT",
		"""
		To remove a buffer's sample data and replace it with new data, the
		alBufferSamplesSOFT function should be used.
		The named @{code channels} must be a buffer ID returned by alGenBuffers, and
		not currently be attached to or queued on a source. The given
		@{code channels} is the number of sample frames per second the data will
        play at, and the @{code channels} is the storage format used (see Table
        1.1). The number of uncompressed sample frames to load is specified by
        @{code channels}.

        The @{code channels} and @{code type} parameters specify the channel configuration and
        sample type of the provided data (see Table 1.2 and 1.3). The samples will
        be converted to the internal storage format as needed, however the channel
        configuration must match the channel configuration of the storage format
        or an AL_INVALID_ENUM error will be generated.

        The @{code data} pointer should hold enough data as specified by the @{code channels},
        @{code type}, and @{code samples} parameters, and will be copied and converted into
        the buffer's storage. It may also be NULL, in which case the stored data
        will be undefined.

        If AL_SOFT_loop_points is supported, a successful call will reset the
        start and end loop points to 0 and @{code samples} respectively.
		""",
		ALuint.IN("buffer", "buffer ID returned by alGenBuffers, and not currently be attached to or queued on a source"),
		ALuint.IN("samplerate", "number of sample frames per second the data will play at"),
		ALenum.IN("internalformat", "storage format used", InternalFormatParameters),
		ALsizei.IN("samples", "number of uncompressed sample frames to load"),
		ALenum.IN("channels", "channel configuration of the provided data", ChannelsParameter),
		ALenum.IN("type", "type of the provided data", TypeParameters),
		const _ ALCvoid_p.IN("data", "buffer to write to")
	)

	ALCboolean.func(
		"IsBufferFormatSupportedSOFT",
		"""
		To query if a storage format is supported by the implementation, use the function
        alIsBufferFormatSupportedSOFT. The function returns false if the given @{code format} is
        not a recognized storage format. Otherwise, if it returns true it may be specified
        as the @{code internalformat} for alBufferSamplesSOFT.
		""",
		ALCenum.IN("format", "format to check if supported", InternalFormatParameters)
	)

	ALCvoid.func(
		"BufferSubSamplesSOFT",
		"""
		To update a buffer with new data, call alBufferSubSamplesSOFT.
        @{code buffer} is the ID of the buffer to modify. @{code offset} is the first sample
        frame in the internal storage to be modified, and @{code samples} is the number
        of sample frames to modify. They must not extend beyond the existing
        internal storage length. The @{code channels} and @{code type} parameters specify the
        channel configuration and sample type of the provided data buffer,
        specified by @{code data}, which will be copied and converted to the buffer's
        storage format. As with alBufferSamplesSOFT, the channel configuration
        must match the storage format's channel configuration or an
        AL_INVALID_ENUM error will be generated.

        When modifying a buffer that's playing on a source, an application must
        take care to not modify the section that is currently being played. The
        read-only source attributes

          AL_BYTE_RW_OFFSETS_SOFT
          AL_SAMPLE_RW_OFFSETS_SOFT

        may be used to retrieve the read and write cursor offsets (see Table 3.0
        and 3.1). Behavior is undefined if an attempt is made to modify buffer
        data between the read and write offsets.
        """,
		ALuint.IN("buffer", "ID of the buffer to modify"),
		ALCsizei.IN("offset", "first sample frame in the internal storage to be modified"),
		ALCsizei.IN("samples", "number of sample frames to modify. They must not extend beyond the existing internal storage length."),
		ALenum.IN("channels", "channel configuration of the provided data", ChannelsParameter),
		ALenum.IN("type", "type of the provided data", TypeParameters),
		const _ ALCvoid_p.IN("data", "buffer to write to")
	)

	ALCvoid.func(
		"GetBufferSamplesSOFT",
		"""
		To retrieve a buffer's sample data, use alGetBufferSamplesSOFT.
        This function will read the number of sample frames, given by @{code samples},
        starting at @{code offset}, and convert them to the channel configuration and
        sample type specified by @{code channels} and @{code type}, before writing to the
        provided @{code data} buffer pointer. An AL_INVALID_VALUE error is generated if
        @{code offset} and @{code samples} reach beyond the range of the buffer. The channel
        configuration must match the internal storage format's channel
        configuration, or else an AL_INVALID_ENUM error will be generated.
        """,
		ALuint.IN("buffer", "ID of the buffer to modify"),
		ALCsizei.IN("offset", "first sample frame in the internal storage to be modified"),
		ALCsizei.IN("samples", "number of sample frames to modify. They must not extend beyond the existing internal storage length."),
		ALenum.IN("channels", "channel configuration of the provided data", ChannelsParameter),
		ALenum.IN("type", "type of the provided data", TypeParameters),
		ALCvoid_p.IN("data", "buffer to write to")
	)
}