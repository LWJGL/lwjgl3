/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL10 = "AL10".nativeClassAL("AL10") {
	nativeImport (
		"OpenAL.h"
	)

	documentation = "Native bindings to AL 1.0 functionality."

	IntConstant(
		"General tokens.",

		"INVALID" _ 0xFFFFFFFF.i,
		"NONE" _ 0x0,
		"FALSE" _ 0x0,
		"TRUE" _ 0x1
	)

	IntConstant(
		"Error conditions.",

		"NO_ERROR" _ 0x0,
		"INVALID_NAME" _ 0xA001,
		"INVALID_ENUM" _ 0xA002,
		"INVALID_VALUE" _ 0xA003,
		"INVALID_OPERATION" _ 0xA004,
		"OUT_OF_MEMORY" _ 0xA005
	)

	val NumericalQueries = IntConstant(
		"Numerical queries.",

		"DOPPLER_FACTOR" _ 0xC000,
		"DISTANCE_MODEL" _ 0xD000
	).javaDocLinks + " AL11#SPEED_OF_SOUND"

	val StringQueries = IntConstant(
		"String queries.",

		"VENDOR" _ 0xB001,
		"VERSION" _ 0xB002,
		"RENDERER" _ 0xB003,
		"EXTENSIONS" _ 0xB004
	).javaDocLinks

	val DistanceModels = IntConstant(
		"Distance attenuation models.",

		"INVERSE_DISTANCE" _ 0xD001,
		"INVERSE_DISTANCE_CLAMPED" _ 0xD002
	).javaDocLinks + " AL11#LINEAR_DISTANCE AL11#LINEAR_DISTANCE_CLAMPED AL11#EXPONENT_DISTANCE AL11#EXPONENT_DISTANCE_CLAMPED #NONE"

	IntConstant(
		"Source types.",

		"SOURCE_ABSOLUTE" _ 0x201,
		"SOURCE_RELATIVE" _ 0x202
	)

	val ListenerSourceAttributes = IntConstant(
		"Listener and Source attributes.",

		"POSITION" _ 0x1004,
		"VELOCITY" _ 0x1006,
		"GAIN" _ 0x100A
	).javaDocLinks

	var SourceAttributes = IntConstant(
		"Source attributes.",

		"CONE_INNER_ANGLE" _ 0x1001,
		"CONE_OUTER_ANGLE" _ 0x1002,
		"PITCH" _ 0x1003,
		"DIRECTION" _ 0x1005,
		"LOOPING" _ 0x1007,
		"BUFFER" _ 0x1009,
		"SOURCE_STATE" _ 0x1010,
		"CONE_OUTER_GAIN" _ 0x1022,
		"SOURCE_TYPE" _ 0x1027
	).javaDocLinks

	IntConstant(
		"Source state.",

		"INITIAL" _ 0x1011,
		"PLAYING" _ 0x1012,
		"PAUSED" _ 0x1013,
		"STOPPED" _ 0x1014
	)

	val ListenerAttributes = IntConstant(
		"Listener attributes.",

		"ORIENTATION" _ 0x100F
	).javaDocLinks + " $ListenerSourceAttributes"

	IntConstant(
		"Queue state.",

		"BUFFERS_QUEUED" _ 0x1015,
		"BUFFERS_PROCESSED" _ 0x1016
	)

	IntConstant(
		"Gain bounds.",

		"MIN_GAIN" _ 0x100D,
		"MAX_GAIN" _ 0x100E
	)

	val DistanceModelAttributes = IntConstant(
		"Distance model attributes,",

		"REFERENCE_DISTANCE" _ 0x1020,
		"ROLLOFF_FACTOR" _ 0x1021,
		"MAX_DISTANCE" _ 0x1023
	).javaDocLinks

	SourceAttributes += " $ListenerSourceAttributes $DistanceModelAttributes"

	val BufferAttributes = IntConstant(
		"Buffer attributes,",

		"FREQUENCY" _ 0x2001,
		"BITS" _ 0x2002,
		"CHANNELS" _ 0x2003,
		"SIZE" _ 0x2004
	).javaDocLinks

	val BufferFormats = IntConstant(
		"Buffer formats.",

		"FORMAT_MONO8" _ 0x1100,
		"FORMAT_MONO16" _ 0x1101,
		"FORMAT_STEREO8" _ 0x1102,
		"FORMAT_STEREO16" _ 0x1103
	).javaDocLinks // TODO: Add vorbis

	IntConstant(
		"Buffer state.",

		"UNUSED" _ 0x2010,
		"PENDING" _ 0x2011,
		"PROCESSED" _ 0x2012
	)

	ALenum(
		"GetError",
		"""
		Obtains error information.

		Each detectable error is assigned a numeric code. When an error is detected by AL, a flag is set and the error code is recorded. Further errors, if they
		occur, do not affect this recorded code. When alGetError is called, the code is returned and the flag is cleared, so that a further error will again
		record its code. If a call to alGetError returns AL_NO_ERROR then there has been no detectable error since the last call to alGetError (or since the AL
		was initialized).

		Error codes can be mapped to strings. The alGetString function returns a pointer to a constant (literal) string that is identical to the identifier used
		for the enumeration value, as defined in the specification.
		"""
	)

	ALvoid(
		"Enable",
		"Enables AL capabilities.",

		ALenum.IN("target", "the capability to enable")
	)

	ALvoid(
		"Disable",
		"Disables AL capabilities.",

		ALenum.IN("target", "the capability to disable")
	)

	ALboolean(
		"IsEnabled",
		"Queries whether a given capability is currently enabled or not.",

		ALenum.IN("target", "the capability to query")
	)

	ALboolean(
		"GetBoolean",
		"Returns the boolean value of the specified parameter.",

		ALenum.IN("paramName", "the parameter to query")
	)

	ALint(
		"GetInteger",
		"Returns the integer value of the specified parameter.",

		ALenum.IN("paramName", "the parameter to query", NumericalQueries)
	)

	ALfloat(
		"GetFloat",
		"Returns the float value of the specified parameter.",

		ALenum.IN("paramName", "the parameter to query", NumericalQueries)
	)

	ALdouble(
		"GetDouble",
		"Returns the double value of the specified parameter.",

		ALenum.IN("paramName", "the parameter to query", NumericalQueries)
	)

	ALvoid(
		"GetBooleanv",
		"Pointer version of #GetBoolean().",

		ALenum.IN("paramName", "the parameter to query"),
		Check(1) _ ALboolean_p.OUT("dest", "a buffer that will receive the parameter values")
	)

	ALvoid(
		"GetIntegerv",
		"Pointer version of #GetInteger().",

		ALenum.IN("paramName", "the parameter to query"),
		Check(1) _ ALint_p.IN("dest", "a buffer that will receive the parameter values")
	)

	ALvoid(
		"GetFloatv",
		"Pointer version of #GetFloat().",

		ALenum.IN("paramName", "the parameter to query"),
		Check(1) _ ALfloat_p.IN("dest", "a buffer that will receive the parameter values")
	)

	ALvoid(
		"GetDoublev",
		"Pointer version of #GetDouble().",

		ALenum.IN("paramName", "the parameter to query"),
		Check(1) _ ALdouble_p.IN("dest", "a buffer that will receive the parameter values")
	)

	(const _ ALcharUTF8_p)(
		"GetString",
		"Returns the string value of the specified parameter",

		ALenum.IN("paramName", "the parameter to query", StringQueries)
	)

	ALvoid(
		"DistanceModel",
		"""
		Sets the distance attenuation model.

		Samples usually use the entire dynamic range of the chosen format/encoding, independent of their real world intensity. For example, a jet engine and a
		clockwork both will have samples with full amplitude. The application will then have to adjust source gain accordingly to account for relative differences.

		Source gain is then attenuated by distance. The effective attenuation of a source depends on many factors, among which distance attenuation and source
		and listener gain are only some of the contributing factors. Even if the source and listener gain exceed 1.0 (amplification beyond the guaranteed
		dynamic range), distance and other attenuation might ultimately limit the overall gain to a value below 1.0.

		OpenAL currently supports three modes of operation with respect to distance attenuation, including one that is similar to the IASIG I3DL2 model. The
		application can choose one of these models (or chooses to disable distance-dependent attenuation) on a per-context basis.
		""",

		ALenum.IN("modelName", "the distance attenuation model to set", DistanceModels)
	)

	ALvoid(
		"DopplerFactor",
		"""
		Sets the doppler effect factor.

		The Doppler Effect depends on the velocities of source and listener relative to the medium, and the propagation speed of sound in that medium. The
		application might want to emphasize or de-emphasize the Doppler Effect as physically accurate calculation might not give the desired results. The amount
		of frequency shift (pitch change) is proportional to the speed of listener and source along their line of sight. The Doppler Effect as implemented by
		OpenAL is described by the formula below. Effects of the medium (air, water) moving with respect to listener and source are ignored.
		${codeBlock("""
SS: AL_SPEED_OF_SOUND = speed of sound (default value 343.3)
DF: AL_DOPPLER_FACTOR = Doppler factor (default 1.0)
vls: Listener velocity scalar (scalar, projected on source-to-listener vector)
vss: Source velocity scalar (scalar, projected on source-to-listener vector)
f: Frequency of sample
f': effective Doppler shifted frequency

3D Mathematical representation of vls and vss:

Mag(vector) = sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z)
DotProduct(v1, v2) = (v1.x * v2.x + v1.y * v2.y + v1.z * v2.z)

SL = source to listener vector
SV = Source velocity vector
LV = Listener velocity vector

vls = DotProduct(SL, LV) / Mag(SL)
vss = DotProduct(SL, SV) / Mag(SL)

Dopper Calculation:

vss = min(vss, SS / DF)
vls = min(vls, SS / DF)

f' = f * (SS - DF * vls) / (SS - DF * vss)
		""")}
		The {@code dopplerFactor} is a simple scaling of source and listener velocities to exaggerate or deemphasize the Doppler (pitch) shift resulting from
		the calculation.
		""",

		ALfloat.IN("dopplerFactor", "the doppler factor")
	)

	// TODO: Add @deprecated
	ALvoid(
		"DopplerVelocity",
		"""
		Sets the doppler effect propagation velocity.

		The OpenAL 1.1 Doppler implementation is different than that of OpenAL 1.0, because the older implementation was confusing and not implemented
		consistently. The new "speed of sound" property makes the 1.1 implementation more intuitive than the old implementation. If your implementation wants to
		support the AL_DOPPLER_VELOCITY parameter (the alDopplerVelocity call will remain as an entry point so that 1.0 applications can link with a 1.1
		library), the above formula can be changed to the following:
		${codeBlock("""
vss = min(vss, (SS * DV)/DF)
vls = min(vls, (SS * DV)/DF)

f' = f * (SS * DV - DF*vls) / (SS * DV - DF * vss)
		""")}
		OpenAL 1.1 programmers would never use AL_DOPPLER_VELOCITY (which defaults to 1.0).
		""",

		ALfloat.IN("dopplerVelocity", "the doppler velocity")
	)

	ALvoid(
		"Listenerf",
		"Sets the float value of a listener parameter.",

		ALenum.IN("paramName", "the parameter to modify", ListenerAttributes),
		ALfloat.IN("value", "the parameter value")
	)

	ALvoid(
		"Listeneri",
		"Integer version of #Listenerf().",

		ALenum.IN("paramName", "the parameter to modify", ListenerAttributes),
		ALint.IN("values", "the parameter value")
	)

	ALvoid(
		"Listener3f",
		"Sets the 3 dimensional float values of a listener parameter.",

		ALenum.IN("paramName", "the parameter to modify", ListenerAttributes),
		ALfloat.IN("value1", "the first value"),
		ALfloat.IN("value2", "the second value"),
		ALfloat.IN("value3", "the third value")
	)

	ALvoid(
		"Listenerfv",
		"Pointer version of #Listenerf().",

		ALenum.IN("paramName", "the parameter to modify"),
		Check(1) _ const _ ALfloat_p.IN("values", "the parameter values")
	)

	ALvoid(
		"GetListenerf",
		"Returns the float value of a listener parameter.",

		ALenum.IN("paramName", "the parameter to query", ListenerAttributes),
		Check(1) _ returnValue _ ALfloat_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"GetListeneri",
		"Returns the integer value of a listener parameter.",

		ALenum.IN("paramName", "the parameter to query", ListenerAttributes),
		Check(1) _ returnValue _ ALint_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"GetListener3f",
		"Returns the 3 dimensional values of a listener parameter.",

		ALenum.IN("paramName", "the parameter to query", ListenerAttributes),
		Check(1) _ ALfloat_p.OUT("value1", "the first parameter value"),
		Check(1) _ ALfloat_p.OUT("value2", "the second parameter value"),
		Check(1) _ ALfloat_p.OUT("value3", "the third parameter value")
	)

	ALvoid(
		"GetListenerfv",
		"Returns float values of a listener parameter.",

		ALenum.IN("paramName", "the parameter to query", ListenerAttributes),
		Check(1) _ ALfloat_p.OUT("values", "the parameter values")
	)

	ALvoid(
		"GenSources",
		"Requests a number of source names.",

		AutoSize("srcNames") _ ALsizei.IN("n", "the number of source names to generated"),
		returnValue _ ALuint_p.OUT("srcNames", "the buffer that will receive the source names")
	)

	ALvoid(
		"DeleteSources",
		"Requests the deletion of a number of sources.",

		AutoSize("sources") _ ALsizei.IN("n", "the number of sources to delete"),
		SingleValue("source") _ ALuint_p.IN("sources", "the sources to delete")
	)

	ALboolean(
		"IsSource",
		"Verifies whether the specified object name is a source name.",

		ALuint.IN("sourceName", "a value that may be a source name")
	)

	ALvoid(
		"Sourcef",
		"Sets the float value of a source parameter.",

		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify", SourceAttributes),
		ALfloat.IN("value", "the parameter value")
	)

	ALvoid(
		"Source3f",
		"Sets the 3 dimensional values of a source parameter.",

		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify", SourceAttributes),
		ALfloat.IN("v1", "the first parameter value"),
		ALfloat.IN("v2", "the second parameter value"),
		ALfloat.IN("v3", "the third parameter value")
	)

	ALvoid(
		"Sourcefv",
		"Pointer version of #Sourcef().",

		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		Check(1) _ const _ ALfloat_p.IN("values", "the parameter values")
	)

	ALvoid(
		"Sourcei",
		"Integer version of #Sourcef().",

		ALuint.IN("source", "the source to modify"),
		ALenum.IN("param", "the parameter to modify"),
		ALint.IN("value", "the parameter value")
	)

	ALvoid(
		"GetSourcef",
		"Returns the float value of the specified source parameter.",

		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query", SourceAttributes),
		Check(1) _ returnValue _ ALfloat_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"GetSource3f",
		"Returns the 3 dimensional values of the specified source parameter.",

		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query", SourceAttributes),
		Check(1) _ ALfloat_p.OUT("v1", "the first parameter value"),
		Check(1) _ ALfloat_p.OUT("v2", "the second parameter value"),
		Check(1) _ ALfloat_p.OUT("v3", "the third parameter value")
	)

	ALvoid(
		"GetSourcefv",
		"Returns the float values of the specified source parameter.",

		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query", SourceAttributes),
		Check(1) _ ALfloat_p.OUT("values", "the parameter values")
	)

	ALvoid(
		"GetSourcei",
		"Returns the integer value of the specified source parameter.",

		ALuint.IN("source", "the source to query"),
		ALenum.IN("param", "the parameter to query", SourceAttributes),
		Check(1) _ returnValue _ ALint_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"SourceQueueBuffers",
		"""
		Queues up one or multiple buffer names to the specified source.

		The buffers will be queued in the sequence in which they appear in the array. This command is legal on a source in any playback state (to allow for
		streaming, queuing has to be possible on a AL_PLAYING source). All buffers in a queue must have the same format and attributes, with the exception of
		the NULL buffer (i.e., 0) which can always be queued.
		""",

		ALuint.IN("sourceName", "the target source"),
		AutoSize("bufferNames") _ ALsizei.IN("numBuffers", "the number of buffers to queue"),
		SingleValue("bufferName") _ ALuint_p.IN("bufferNames", "the buffer names")
	)

	ALvoid(
		"SourceUnqueueBuffers",
		"""
		Removes a number of buffer entries that have finished processing, in the order of apperance, from the queue of the specified source.

		Once a queue entry for a buffer has been appended to a queue and is pending processing, it should not be changed. Removal of a given queue entry is not
		possible unless either the source is stopped (in which case then entire queue is considered processed), or if the queue entry has already been processed
		(AL_PLAYING or AL_PAUSED source). A playing source will enter the AL_STOPPED state if it completes playback of the last buffer in its queue (the same
		behavior as when a single buffer has been attached to a source and has finished playback).
		""",

		ALuint.IN("sourceName", "the target source"),
		AutoSize("bufferNames") _ ALsizei.IN("numEntries", "the number of buffers to unqueue"),
		returnValue _ ALuint_p.OUT("bufferNames", "the buffer names")
	)

	ALvoid(
		"SourcePlay",
		"""
		Sets the source state to AL_PLAYING.

		alSourcePlay applied to an AL_INITIAL source will promote the source to AL_PLAYING, thus the data found in the buffer will be fed into the processing,
		starting at the beginning. alSourcePlay applied to a AL_PLAYING source will restart the source from the beginning. It will not affect the configuration,
		and will leave the source in AL_PLAYING state, but reset the sampling offset to the beginning. alSourcePlay applied to a AL_PAUSED source will resume
		processing using the source state as preserved at the alSourcePause operation. alSourcePlay applied to a AL_STOPPED source will propagate it to
		AL_INITIAL then to AL_PLAYING immediately.
		""",

		ALuint.IN("source", "the source to play")
	)

	ALvoid(
		"SourcePause",
		"""
		Sets the source state to AL_PAUSED.

		alSourcePause applied to an AL_INITIAL source is a legal NOP. alSourcePause applied to a AL_PLAYING source will change its state to AL_PAUSED. The
		source is exempt from processing, its current state is preserved. alSourcePause applied to a AL_PAUSED source is a legal NOP. alSourcePause applied to a
		AL_STOPPED source is a legal NOP.
		""",

		ALuint.IN("source", "the source to pause")
	)

	ALvoid(
		"SourceStop",
		"""
		Sets the source state to AL_STOPPED.

		alSourceStop applied to an AL_INITIAL source is a legal NOP. alSourceStop applied to a AL_PLAYING source will change its state to AL_STOPPED. The source
		is exempt from processing, its current state is preserved. alSourceStop applied to a AL_PAUSED source will change its state to AL_STOPPED, with the same
		consequences as on a AL_PLAYING source. alSourceStop applied to a AL_STOPPED source is a legal NOP.
		""",

		ALuint.IN("source", "the source to stop")
	)

	ALvoid(
		"SourceRewind",
		"""
		Sets the source state to AL_INITIAL.

		alSourceRewind applied to an AL_INITIAL source is a legal NOP. alSourceRewind applied to a AL_PLAYING source will change its state to AL_STOPPED then
		AL_INITIAL. The source is exempt from processing: its current state is preserved, with the exception of the sampling offset, which is reset to the
		beginning. alSourceRewind applied to a AL_PAUSED source will change its state to AL_INITIAL, with the same consequences as on a AL_PLAYING source.
		alSourceRewind applied to an AL_STOPPED source promotes the source to AL_INITIAL, resetting the sampling offset to the beginning.
		""",

		ALuint.IN("source", "the source to rewind")
	)

	ALvoid(
		"SourcePlayv",
		"Pointer version of #SourcePlay().",

		AutoSize("sources") _ ALsizei.IN("n", "the number of sources to play"),
		const _ ALuint_p.IN("sources", "the sources to play")
	)

	ALvoid(
		"SourcePausev",
		"Pointer version of #SourcePause().",

		AutoSize("sources") _ ALsizei.IN("n", "the number of sources to pause"),
		const _ ALuint_p.IN("sources", "the sources to pause")
	)

	ALvoid(
		"SourceStopv",
		"Pointer version of #SourceStop().",

		AutoSize("sources") _ ALsizei.IN("n", "the number of sources to stop"),
		const _ ALuint_p.IN("sources", "the sources to stop")
	)

	ALvoid(
		"SourceRewindv",
		"Pointer version of #SourceRewind().",

		AutoSize("sources") _ ALsizei.IN("n", "the number of sources to rewind"),
		const _ ALuint_p.IN("sources", "the sources to rewind")
	)

	ALvoid(
		"GenBuffers",
		"Requests a number of buffer names.",

		AutoSize("bufferNames") _ ALsizei.IN("n", "the number of buffer names to generate"),
		returnValue _ ALuint_p.OUT("bufferNames", "the buffer that will receive the buffer names")
	)

	ALvoid(
		"DeleteBuffers",
		"Requests the deletion of a number of buffers.",

		AutoSize("bufferNames") _ ALsizei.IN("n", "the number of buffers to delete"),
		SingleValue("bufferName") _ const _ ALuint_p.IN("bufferNames", "the buffers to delete")
	)

	ALboolean(
		"IsBuffer",
		"Verifies whether the specified object name is a buffer name.",

		ALuint.IN("bufferName", "a value that may be a buffer name")
	)

	ALvoid(
		"GetBufferf",
		"Returns the float value of the specified buffer parameter.",

		ALuint.IN("bufferName", "the buffer to query"),
		ALenum.IN("paramName", "the parameter to query", BufferAttributes),
		Check(1) _ returnValue _ ALfloat_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"GetBufferi",
		"Returns the integer value of the specified buffer parameter.",

		ALuint.IN("bufferName", "the buffer to query"),
		ALenum.IN("paramName", "the parameter to query", BufferAttributes),
		Check(1) _ returnValue _ ALint_p.OUT("value", "the parameter value")
	)

	ALvoid(
		"BufferData",
		"""
		Sets the sample data of the specified buffer.

		The data specified is copied to an internal software, or if possible, hardware buffer. The implementation is free to apply decompression, conversion,
		resampling, and filtering as needed.

		8-bit data is expressed as an unsigned value over the range 0 to 255, 128 being an audio output level of zero.

		16-bit data is expressed as a signed value over the range -32768 to 32767, 0 being an audio output level of zero. Byte order for 16-bit values is
		determined by the native format of the CPU.

		Stereo data is expressed in an interleaved format, left channel sample followed by the right channel sample.

		Buffers containing audio data with more than one channel will be played without 3D spatialization features – these formats are normally used for
		background music.
		""",

		ALuint.IN("bufferName", "the buffer to modify"),
		ALenum.IN("format", "the data format", BufferFormats),
		MultiType(
			PointerMapping.DATA_BYTE, PointerMapping.DATA_SHORT, PointerMapping.DATA_INT
		) _ const _ ALvoid_p.IN("data", "the sample data"),
		AutoSize("data") _ ALsizei.IN("size", "the data buffer size, in bytes"),
		ALsizei.IN("frequency", "the data frequency")
	)

	ALuint(
		"GetEnumValue",
		"Returns the enumeration value of the specified enum.",

		const _ ALcharASCII_p.IN("enumName", "the enum name")
	)

	ALvoidptr(
		"GetProcAddress",
		"""
		Retrieves extension entry points.

		Returns NULL if no entry point with the name funcName can be found. Implementations are free to return NULL if an entry point is present, but not
		applicable for the current context. However the specification does not guarantee this behavior.

		Applications can use alGetProcAddress to obtain core API entry points, not just extensions. This is the recommended way to dynamically load and unload
		OpenAL DLL's as sound drivers.
		""",

		const _ ALcharASCII_p.IN("funcName", "the function name")
	)

	ALCboolean(
		"IsExtensionPresent",
		"""
		Verifies that a given extension is available for the current context and the device it is associated with.

		Invalid and unsupported string tokens return ALC_FALSE. {@code extName} is not case sensitive – the implementation will convert the name to all
		upper-case internally (and will express extension names in upper-case).
		""",

		const _ ALcharASCII_p.IN("extName", "the extension name")
	)

}