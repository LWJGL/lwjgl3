/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_SOFT_loopback = "SOFTLoopback".nativeClassALC("SOFT_loopback") {
	nativeImport (
		"OpenAL.h"
	)

	documentation =
		"""
		Native bindings to the $specLinkOpenALSoft extension.

		This extension allows an application to read back OpenAL's rendered audio instead of having it output to an audio device on the system. Unextended
		OpenAL will output audio to an audio device, with no mechanism to allow an application to divert the audio somewhere else.
		"""

	val Types = IntConstant(
		"Accepted by the {@code type} parameter of alcIsRenderFormatSupportedSOFT.",

		"BYTE_SOFT" _ 0x1400,
		"UNSIGNED_BYTE_SOFT" _ 0x1401,
		"SHORT_SOFT" _ 0x1402,
		"UNSIGNED_SHORT_SOFT" _ 0x1403,
		"INT_SOFT" _ 0x1404,
		"UNSIGNED_INT_SOFT" _ 0x1405,
		"FLOAT_SOFT" _ 0x1406
	).javaDocLinks

	val Channels = IntConstant(
		"Accepted by the {@code channels} parameter of alcIsRenderFormatSupportedSOFT.",

		"MONO_SOFT" _ 0x1500,
		"STEREO_SOFT" _ 0x1501,
		"QUAD_SOFT" _ 0x1503,
		"5POINT1_SOFT" _ 0x1504,
		"6POINT1_SOFT" _ 0x1505,
		"7POINT1_SOFT" _ 0x1506
	).javaDocLinks

	IntConstant(
		"Accepted as part of the {@code attrList} parameter of alcCreateContext.",

		"FORMAT_CHANNELS_SOFT" _ 0x1990,
		"FORMAT_TYPE_SOFT" _ 0x1991
	)

	ALCdevice_p(
		"LoopbackOpenDeviceSOFT",
		"""
		Loopback devices provide a way for applications to "read back" rendered audio without it being sent to an actual audio device. It allows applications to
		render audio as fast or slow as it needs, making it suitable for non-real-time rendering, and so it can be passed to an audio codec or something for
		further processing.

		To open a loopback device, use this function.

		A loopback device behaves largely the same as a playback device. You may query playback state and error codes, and create contexts, which can then be
		set as current to generate sources and buffers like normal.

		Note that loopback devices do not have either the ALC10#SYNC or ALC10#REFRESH attributes. Attempting to query them will result in an ALC10#INVALID_ENUM
		error.
		""",

		const _ nullable _ ALCcharUTF8_p.IN(
			"deviceName",
			"""
			which device or device driver to use for subsequent rendering. This may be $NULL for an implementation-defined default, otherwise it must be a valid
			name returned by enumeration (and further must be a device capable of loopback rendering).
			"""
		)
	)

	ALCboolean(
		"IsRenderFormatSupportedSOFT",
		"""
		When creating contexts, the attribute list must specify the format used for rendering. This is done with the #FORMAT_CHANNELS_SOFT, #FORMAT_TYPE_SOFT,
		and ALC10#FREQUENCY attributes. This controls the format of the audio subsequently rendered by the device.

		To check if a particular rendering format is available, use this function.
		""",

		ALCdevice_p.OUT("device", "the loopback device to query"),
		ALCsizei.IN("frequency", "the sample rate of the rendered audio"),
		ALCenum.IN("channels", "the channel configuration used for rendering", Channels),
		ALCenum.IN("type", "sample type of the written audio", Types)
	)

	ALCvoid(
		"RenderSamplesSOFT",
		"""
		The state of various objects on loopback devices (including processed buffers and source offsets) is processed only when new samples are rendered. To
		render samples, use this function.
		""",

		ALCdevice_p.OUT("device", "the loopback device which samples are rendered from, using its contexts and associated buffers and sources"),
		ALCvoid_p.OUT("buffer", "the buffer to write to"),
		ALCsizei.IN("samples", "the number of sample frames to render")
	)
}