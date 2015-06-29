/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_source_latency = "SOFTSourceLatency".nativeClassAL("SOFT_source_latency") {
	nativeImport (
		"OpenAL.h"
	)

	documentation = """
		Native bindings to the $specLinkOpenALSoft extension.

		This extension provides a method for applications to more accurately measure the playback latency of sources. Unextended OpenAL allows apps to retrieve
		a source's playback offset in bytes, samples, or seconds, but this is (typically) where the AL is processing the audio data.

		Often, more processing is done outside of the AL. Audio servers are common and they can introduce a bit of latency, increasing the time between when the
		AL is done with a piece of audio data until it gets heard by the user. If the OpenAL implementation uses its own mixer, that can also add to the
		latency. This can ultimately cause a not-insignificant delay between where the AL is processing and what is actually being heard.

		Although this delay may not be very noticeable for general gaming, if the app is trying to keep a video or animation syncronized with the playback of an
		OpenAL source this extra delay can cause the audio and video to appear of out sync.

		Luckily, most audio systems have a way of measuring the latency it takes for sound to actually get to the physical output device (the DAC or speakers).
		By providing this information through the AL, an application can more accurately tell what a user is hearing and thus synchronize better with the audio
		output.
		"""

	IntConstant(
		"Can be used to retrieve a high-precision source offset and playback latency.",

		"SAMPLE_OFFSET_LATENCY_SOFT" _ 0x1200,
		"SEC_OFFSET_LATENCY_SOFT" _ 0x1201
	)

	ALvoid(
		"SourcedSOFT",
		"Sets the double value of a source parameter.",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALdouble.IN("value", "the parameter value")
	)

	ALvoid(
		"Source3dSOFT",
		"Sets the 3 dimensional double values of a source parameter.",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALdouble.IN("value1", "the first value"),
		ALdouble.IN("value2", "the second value"),
		ALdouble.IN("value3", "the third value")
	)

	ALvoid(
		"SourcedvSOFT",
		"pointer version of #SourcedSOFT()",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		const _ ALdouble_p.IN("value", "the parameter values")
	)

	ALvoid(
		"GetSourcedSOFT",
		"Gets the double value of a source parameter.",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALdouble_p.IN("value", "the parameter values")
	)

	ALvoid(
		"GetSource3dSOFT",
		"Gets the 3 dimensional double values of a source parameter.",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALdouble_p.IN("value1", "the first value"),
		ALdouble_p.IN("value2", "the second value"),
		ALdouble_p.IN("value3", "the third value")
	)

	ALvoid(
		"GetSourcedvSOFT",
		"Pointer version of #GetSourcedSOFT()",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALdouble_p.IN("values", "the parameter values")
	)

	ALvoid(
		"Sourcei64SOFT",
		"Sets the 64 bit integer value of a source parameter.",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALint64SOFT.IN("value", "the parameter values")
	)

	ALvoid(
		"Source3i64SOFT",
		"Sets the 3 dimensional 64 bit integer values of a source parameter.",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALint64SOFT.IN("value1", "the first value"),
		ALint64SOFT.IN("value2", "the second value"),
		ALint64SOFT.IN("value3", "the third value")
	)

	ALvoid(
		"Sourcei64vSOFT",
		"Pointer version of #Sourcei64SOFT()",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		const _ ALint64SOFT_p.IN("values", "the parameter values")
	)

	ALvoid(
		"GetSourcei64SOFT",
		"Gets the 64 bit integer value of a source parameter.",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALint64SOFT_p.IN("value", "the parameter values")
	)

	ALvoid(
		"GetSource3i64SOFT",
		"Gets the 3 dimensional 64 bit integer values of a source parameter.",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALint64SOFT_p.IN("value1", "the first value"),
		ALint64SOFT_p.IN("value2", "the second value"),
		ALint64SOFT_p.IN("value3", "the third value")
	)

	ALvoid(
		"GetSourcei64vSOFT",
		"Pointer version of #GetSourcei64SOFT()",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALint64SOFT_p.IN("values", "the parameter values")
	)
}