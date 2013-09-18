/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun ALC_SOFT_loopback() = "SOFTLoopback".nativeClassALC("SOFT_loopback") {
	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to ALC_SOFT_loopback extension.")

	val RenderFormatSupportedTypeParameters = IntConstant.block(
		"Accepted by the {@code type} parameter of alcIsRenderFormatSupportedSOFT.",

		"BYTE_SOFT" _ 0x1400,
		"UNSIGNED_BYTE_SOFT" _ 0x1401,
		"SHORT_SOFT" _ 0x1402,
		"UNSIGNED_SHORT_SOFT" _ 0x1403,
		"INT_SOFT" _ 0x1404,
		"UNSIGNED_INT_SOFT" _ 0x1405,
		"FLOAT_SOFT" _ 0x1406
	).toJavaDocLinks();

	val RenderFormatSupportedChannelParameters = IntConstant.block(
		"Accepted by the {@code channels} parameter of alcIsRenderFormatSupportedSOFT.",

		"MONO_SOFT" _ 0x1500,
		"STEREO_SOFT" _ 0x1501,
		"QUAD_SOFT" _ 0x1503,
		"5POINT1_SOFT" _ 0x1504,
		"6POINT1_SOFT" _ 0x1505,
		"7POINT1_SOFT" _ 0x1506
	).toJavaDocLinks();

	val CreateContextParameters = IntConstant.block(
		"Accepted as part of the {@code attrList} parameter of alcCreateContext.",

		"FORMAT_CHANNELS_SOFT" _ 0x1990,
		"FORMAT_TYPE_SOFT" _ 0x1991
	).toJavaDocLinks();

	ALCdevice_p.func(
		"LoopbackOpenDeviceSOFT",
		"""
		Loopback devices provide a way for applications to "read back" rendered
        audio without it being sent to an actual audio device. It allows
        applications to render audio as fast or slow as it needs, making it
        suitable for non-real-time rendering, and so it can be passed to an audio
        codec or something for further processing.

        The deviceName parameter is used to tell the AL which device or device
        driver to use for subsequent rendering. This may be NULL for an
        implementation-defined default, otherwise it must be a valid name returned
        by enumeration (and further must be a device capable of loopback
        rendering).

        A loopback device behaves largely the same as a playback device. You may
        query playback state and error codes, and create contexts, which can then
        be set as current to generate sources and buffers like normal.

        Note that loopback devices do not have either the ALC_SYNC or ALC_REFRESH
        attributes. Attempting to query them will result in an ALC_INVALID_ENUM
        error.
		""",
		const _ ALCcharUTF8_p.IN("deviceName", "name of the device to open")
	)

	ALCboolean.func(
		"IsRenderFormatSupportedSOFT",
		"""
		When creating contexts, the attribute list must specify the format used
        for rendering. This is done with the ALC_FORMAT_CHANNELS_SOFT,
        ALC_FORMAT_TYPE_SOFT, and ALC_FREQUENCY attributes. This controls the
        format of the audio subsequently rendered by the device.
		""",
		nullable _ ALCdevice_p.IN("device", "the loopback device to query"),
		ALCsizei.IN("frequency", "positive sample rate of the rendered audio"),
		ALCenum.IN("channels", "channel configuration used for rendering", RenderFormatSupportedChannelParameters),
		ALCenum.IN("type", "sample type of the written audio", RenderFormatSupportedTypeParameters)
	)

	ALCvoid.func(
		"RenderSamplesSOFT",
		"""
		The state of various objects on loopback devices (including processed
        buffers and source offsets) is processed only when new samples are
        rendered. To render samples, use the function
        """,
		nullable _ ALCdevice_p.IN("device", "loopback device which samples are rendered from"),
		ALCvoid_p.IN("buffer", "buffer to write to"),
		ALCsizei.IN("samples", "number of sample frames to render")
	)
}