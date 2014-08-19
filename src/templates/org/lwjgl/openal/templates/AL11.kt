/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL11 = "AL11".nativeClassAL("AL11") {
	nativeImport (
		"OpenAL.h"
	)

	documentation = "Native bindings to AL 1.1 functionality."

	IntConstant.block(
		"General tokens.",

		"SEC_OFFSET" _ 0x1024,
		"SAMPLE_OFFSET" _ 0x1025,
		"BYTE_OFFSET" _ 0x1026,
		"STATIC" _ 0x1028,
		"STREAMING" _ 0x1029,
		"UNDETERMINED" _ 0x1030,
		"ILLEGAL_COMMAND" _ 0xA004,
		"SPEED_OF_SOUND" _ 0xC003,
		"LINEAR_DISTANCE" _ 0xD003,
		"LINEAR_DISTANCE_CLAMPED" _ 0xD004,
		"EXPONENT_DISTANCE" _ 0xD005,
		"EXPONENT_DISTANCE_CLAMPED" _ 0xD006
	)

	ALvoid.func(
		"Listener3i",
		"Sets the 3 dimensional integer values of a listener parameter.",

		ALenum.IN("paramName", "the parameter to modify"),
		ALfloat.IN("value1", "the first value"),
		ALfloat.IN("value2", "the second value"),
		ALfloat.IN("value3", "the third value")
	)

	keepPostfix _ ALvoid.func(
		"GetListeneriv",
		"Returns the integer values of the specified listener parameter.",

		ALenum.IN("param", "the parameter to query"),
		Check(1) _ ALint_p.OUT("values", "the parameter values")
	)

	ALvoid.func(
		"Source3i",
		"Sets the 3 dimensional integer values of a source parameter.",

		ALuint.IN("source", "the source to modify"),
		ALenum.IN("paramName", "the parameter to modify"),
		ALint.IN("value1", "the first value"),
		ALint.IN("value2", "the second value"),
		ALint.IN("value3", "the third value")
	)

	ALvoid.func(
		"Listeneriv",
		"Pointer version.",

		ALenum.IN("listener", "the parameter to modify"),
		mods(Check(1), const) _ ALint_p.IN("value", "the parameter values")
	)

	ALvoid.func(
		"Sourceiv",
		"Pointer version.",

		ALuint.IN("source", "the source to modify"),
		ALenum.IN("paramName", "the parameter to modify"),
		mods(Check(1), const) _ ALint_p.IN("value", "the parameter values")
	)

	val alBufferf = ALvoid.func(
		"Bufferf",
		"Sets the float value of a buffer parameter.",

		ALuint.IN("buffer", "the buffer to modify"),
		ALenum.IN("paramName", "the parameter to modify"),
		ALfloat.IN("value", "the value")
	).javaDocLink

	ALvoid.func(
		"Buffer3f",
		"Sets the the dimensional value of a buffer parameter.",

		ALuint.IN("buffer", "the buffer to modify"),
		ALenum.IN("paramName", "the parameter to modify"),
		ALfloat.IN("value1", "the first value"),
		ALfloat.IN("value2", "the second value"),
		ALfloat.IN("value3", "the third value")
	)

	ALvoid.func(
		"Bufferfv",
		"the pointer version of $alBufferf",

		ALuint.IN("buffer", "the buffer to modify"),
		ALenum.IN("paramName", "the parameter to modify"),
		mods(Check(1), const) _ ALfloat_p.IN("value", "the parameter values")
	)

	val alBufferi = ALvoid.func(
		"Bufferi",
		"Sets the integer value of a buffer parameter.",

		ALuint.IN("buffer", "the buffer to modify"),
		ALenum.IN("paramName", "the parameter to modify"),
		ALint.IN("value", "the value")
	).javaDocLink

	ALvoid.func(
		"Buffer3i",
		"Sets the integer 3 dimensional value of a buffer parameter.",

		ALuint.IN("buffer", "the buffer to modify"),
		ALenum.IN("paramName", "the parameter to modify"),
		ALint.IN("value1", "the first value"),
		ALint.IN("value2", "the second value"),
		ALint.IN("value3", "the third value")
	)

	ALvoid.func(
		"Bufferiv",
		"the pointer version of $alBufferi",

		ALuint.IN("buffer", "the buffer to modify"),
		ALenum.IN("paramName", "the parameter to modify"),
		mods(Check(1), const) _ ALint_p.IN("value", "the parameter values")
	)

	ALvoid.func(
		"GetBufferi",
		"Returns the integer value of the specified buffer parameter.",

		ALuint.IN("buffer", "the buffer to query"),
		ALenum.IN("param", "the parameter to query"),
		mods(Check(1), returnValue) _ ALint_p.OUT("value", "the parameter value")
	)

	keepPostfix _ ALvoid.func(
		"GetBufferiv",
		"Returns the integer values of the specified buffer parameter.",

		ALuint.IN("buffer", "the buffer to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ ALint_p.OUT("values", "the parameter values")
	)

	ALvoid.func(
		"GetBufferf",
		"Returns the float value of the specified buffer parameter.",

		ALuint.IN("buffer", "the buffer to query"),
		ALenum.IN("param", "the parameter to query"),
		mods(Check(1), returnValue) _ ALfloat_p.OUT("value", "the parameter value")
	)

	keepPostfix _ ALvoid.func(
		"GetBufferfv",
		"Returns the float values of the specified buffer parameter.",

		ALuint.IN("buffer", "the buffer to query"),
		ALenum.IN("param", "the parameter to query"),
		Check(1) _ ALfloat_p.OUT("values", "the parameter values")
	)

	ALvoid.func(
		"SpeedOfSound",
		"Sets the speed of sound.",

		ALfloat.IN("value", "the speed of sound")
	)
}