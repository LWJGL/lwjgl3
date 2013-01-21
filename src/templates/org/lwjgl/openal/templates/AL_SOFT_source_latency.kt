/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_SOFT_source_latency() = "SOFTSourceLatency".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "SOFT_source_latency",
    prefix = "AL",
    prefixTemplate = "AL",
    functionProvider = FunctionProviderAL
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to AL_SOFT_source_latency extension.")

    IntConstant.block(
    	"Source tokens for which can be used to retrieve a high-precision source offset and playback latency",

        "SAMPLE_OFFSET_LATENCY_SOFT" _ 0x1200,
        "SEC_OFFSET_LATENCY_SOFT" _ 0x1201
    )

    ALvoid.func(
		"SourcedSOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		ALdouble.IN("value", "")
	)

    ALvoid.func(
		"Source3dSOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		ALdouble.IN("value1", ""),
		ALdouble.IN("value2", ""),
		ALdouble.IN("value3", "")
	)

    ALvoid.func(
		"SourcedvSOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		const _ ALdouble_p.IN("value", "")
	)

    ALvoid.func(
		"GetSourcedSOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		ALdouble_p.IN("value", "")
	)

    ALvoid.func(
		"GetSource3dSOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		ALdouble_p.IN("value1", ""),
		ALdouble_p.IN("value2", ""),
		ALdouble_p.IN("value3", "")
	)

    ALvoid.func(
		"GetSourcedvSOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		ALdouble_p.IN("values", "")
	)

    ALvoid.func(
		"Sourcei64SOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		ALint64SOFT.IN("value", "")
	)

    ALvoid.func(
		"Source3i64SOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		ALint64SOFT.IN("value1", ""),
		ALint64SOFT.IN("value2", ""),
		ALint64SOFT.IN("value3", "")
	)

    ALvoid.func(
		"Sourcei64vSOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		const _ ALint64SOFT_p.IN("values", "")
	)

    ALvoid.func(
		"GetSourcei64SOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		ALint64SOFT_p.IN("value", "")
	)

    ALvoid.func(
		"GetSource3i64SOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		ALint64SOFT_p.IN("value1", ""),
		ALint64SOFT_p.IN("value2", ""),
		ALint64SOFT_p.IN("value3", "")
	)

    ALvoid.func(
		"GetSourcei64vSOFT",
		"""
        """,
        ALuint.IN("source", ""),
		ALenum.IN("param", ""),
		ALint64SOFT_p.IN("values", "")
	)
}