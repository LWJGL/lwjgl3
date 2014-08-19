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
		bindings to AL_SOFT_source_latency extension.

		This extension provides a method for applications to more accurately
		measure the playback latency of sources. Unextended OpenAL allows apps to
		retrieve a source's playback offset in bytes, samples, or seconds, but
		this is (typically) where the AL is processing the audio data.

		New 64-bit Integer and Double-Precision Floating Point Functions:

		In addition to the standard 32-bit integer (i) and single-precision
		floating point (f) types, source attributes may be changed or queried
		using 64-bit integer (i64) and double-precision floating point (d) types.

		Any valid attribute for 32-bit integers will be valid for 64-bit integers,
		and any attribute for single-precision floating point will be valid for
		double-precision floating point. Note that the reverse is not necessarily
		true. Specific 64-bit integer attributes may not work through the 32-bit
		integer functions, and specific double-precision floating point attributes
		may not work with the single-precision floating point functions, unless
		otherwise specified.

		Also note that range restrictions still apply, so for example, attributes
		that only allow up to INT_MAX will still only allow up to INT_MAX even
		when set through 64-bit integer functions
		"""

	IntConstant.block(
		"Source tokens for which can be used to retrieve a high-precision source offset and playback latency",

		"SAMPLE_OFFSET_LATENCY_SOFT" _ 0x1200,
		"SEC_OFFSET_LATENCY_SOFT" _ 0x1201
	)

	val SourcedSOFT = ALvoid.func(
		"SourcedSOFT",
		"Sets the double value of a source parameter.",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALdouble.IN("value", "the parameter value")
	).javaDocLink

	ALvoid.func(
		"Source3dSOFT",
		"Sets the 3 dimensional double values of a source parameter.",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALdouble.IN("value1", "the first value"),
		ALdouble.IN("value2", "the second value"),
		ALdouble.IN("value3", "the third value")
	)

	ALvoid.func(
		"SourcedvSOFT",
		"pointer version of $SourcedSOFT",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		const _ ALdouble_p.IN("value", "the parameter values")
	)

	val GetSourcedSOFT = ALvoid.func(
		"GetSourcedSOFT",
		"Gets the double value of a source parameter.",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALdouble_p.IN("value", "the parameter values")
	).javaDocLink

	ALvoid.func(
		"GetSource3dSOFT",
		"Gets the 3 dimensional double values of a source parameter.",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALdouble_p.IN("value1", "the first value"),
		ALdouble_p.IN("value2", "the second value"),
		ALdouble_p.IN("value3", "the third value")
	)

	ALvoid.func(
		"GetSourcedvSOFT",
		"Pointer version of $GetSourcedSOFT",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALdouble_p.IN("values", "the parameter values")
	)

	val Sourcei64SOFT = ALvoid.func(
		"Sourcei64SOFT",
		"Sets the 64 bit integer value of a source parameter.",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALint64SOFT.IN("value", "the parameter values")
	).javaDocLink

	ALvoid.func(
		"Source3i64SOFT",
		"Sets the 3 dimensional 64 bit integer values of a source parameter.",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALint64SOFT.IN("value1", "the first value"),
		ALint64SOFT.IN("value2", "the second value"),
		ALint64SOFT.IN("value3", "the third value")
	)

	ALvoid.func(
		"Sourcei64vSOFT",
		"Pointer version of $Sourcei64SOFT",
		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		const _ ALint64SOFT_p.IN("values", "the parameter values")
	)

	val GetSourcei64SOFT = ALvoid.func(
		"GetSourcei64SOFT",
		"Gets the 64 bit integer value of a source parameter.",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALint64SOFT_p.IN("value", "the parameter values")
	).javaDocLink

	ALvoid.func(
		"GetSource3i64SOFT",
		"Gets the 3 dimensional 64 bit integer values of a source parameter.",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALint64SOFT_p.IN("value1", "the first value"),
		ALint64SOFT_p.IN("value2", "the second value"),
		ALint64SOFT_p.IN("value3", "the third value")
	)

	ALvoid.func(
		"GetSourcei64vSOFT",
		"Pointer version of $GetSourcei64SOFT",
		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query"),
		ALint64SOFT_p.IN("values", "the parameter values")
	)
}