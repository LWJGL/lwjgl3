/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC10 = "ALC10".nativeClassALC("ALC10") {
	nativeImport (
		"OpenAL.h"
	)

	documentation = "Native bindings to ALC 1.0 functionality."

	IntConstant(
		"General tokens.",

		"INVALID" _ 0xFFFFFFFF.i,
		"FALSE" _ 0x0,
		"TRUE" _ 0x1
	)

	val ContextAttributes = IntConstant(
		"Context creation attributes.",

		"FREQUENCY" _ 0x1007,
		"REFRESH" _ 0x1008,
		"SYNC" _ 0x1009
	).javaDocLinks + " ALC11#MONO_SOURCES ALC11#STEREO_SOURCES"

	IntConstant(
		"Error conditions.",

		"NO_ERROR" _ 0x0,
		"INVALID_DEVICE" _ 0xA001,
		"INVALID_CONTEXT" _ 0xA002,
		"INVALID_ENUM" _ 0xA003,
		"INVALID_VALUE" _ 0xA004,
		"OUT_OF_MEMORY" _ 0xA005
	)

	val StringQueries = IntConstant(
		"String queries.",

		"DEFAULT_DEVICE_SPECIFIER" _ 0x1004,
		"DEVICE_SPECIFIER" _ 0x1005,
		"EXTENSIONS" _ 0x1006
	).javaDocLinks + " ALC11#CAPTURE_DEFAULT_DEVICE_SPECIFIER ALC11#CAPTURE_DEVICE_SPECIFIER"

	val IntegerQueries = IntConstant(
		"Integer queries.",

		"MAJOR_VERSION" _ 0x1000,
		"MINOR_VERSION" _ 0x1001,
		"ATTRIBUTES_SIZE" _ 0x1002,
		"ALL_ATTRIBUTES" _ 0x1003
	).javaDocLinks + " ALC11#CAPTURE_SAMPLES"

	ALCdevice_p(
		"OpenDevice",
		"""
		Allows the application to connect to a device.

		If the function returns NULL, then no sound driver/device has been found. The argument is a null terminated string that requests a certain device or
		device configuration. If NULL is specified, the implementation will provide an implementation specific default.
		""",

		nullable _ const _ ALCcharUTF8_p.IN("deviceSpecifier", "the requested device or device configuration")
	)

	ALCboolean(
		"CloseDevice",
		"""
		Allows the application to disconnect from a device.

		The return code will be ALC_TRUE or ALC_FALSE, indicating success or failure. Failure will occur if all the device's contexts and buffers have not been
		destroyed. Once closed, the {@code deviceHandle} is invalid.
		""",

		const _ ALCdevice_p.IN("deviceHandle", "the device to close")
	)

	ALCcontext_p(
		"CreateContext",
		"Creates an AL context.",

		const _ ALCdevice_p.IN("deviceHandle", "a valid device"),
		nullable _ nullTerminated _ const _ ALCint_p.IN(
			"attrList",
			"null or a zero terminated list of integer pairs composed of valid ALC attribute tokens and requested values",
			ContextAttributes
		)
	)

	ALCboolean(
		"MakeContextCurrent",
		"""
		Makes a context current with respect to OpenAL operation.

		The context parameter can be NULL or a valid context pointer. Using NULL results in no context being current, which is useful when shutting OpenAL down.
		The operation will apply to the device that the context was created for.

		For each OS process (usually this means for each application), only one context can be current at any given time. All AL commands apply to the current
		context. Commands that affect objects shared among contexts (e.g. buffers) have side effects on other contexts.
		""",

		nullable _ ALCcontext_p.IN("context", "the context to make current")
	)

	ALCvoid(
		"ProcessContext",
		"""
		The current context is the only context accessible to state changes by AL commands (aside from state changes affecting shared objects). However,
		multiple contexts can be processed at the same time. To indicate that a context should be processed (i.e. that internal execution state such as the
		offset increments are to be performed), the application uses {@code alcProcessContext}.

		Repeated calls to alcProcessContext are legal, and do not affect a context that is already marked as processing. The default state of a context created
		by alcCreateContext is that it is processing.
		""",

		ALCcontext_p.IN("context", "the context to mark for processing")
	)

	ALCvoid(
		"SuspendContext",
		"""
		The application can suspend any context from processing (including the current one). To indicate that a context should be suspended from processing
		(i.e. that internal execution state such as offset increments are not to be changed), the application uses {@code alcSuspendContext}.

		Repeated calls to alcSuspendContext are legal, and do not affect a context that is already marked as suspended.
		""",

		ALCcontext_p.IN("context", "the context to mark as suspended")
	)

	ALCvoid(
		"DestroyContext",
		"""
		Destroys a context.

		The correct way to destroy a context is to first release it using alcMakeCurrent with a NULL context. Applications should not attempt to destroy a
		current context – doing so will not work and will result in an ALC_INVALID_OPERATION error. All sources within a context will automatically be deleted
		during context destruction.
		""",

		ALCcontext_p.IN("context", "the context to destroy")
	)

	ALCcontext_p(
		"GetCurrentContext",
		"Queries for, and obtains a handle to, the current context for the application. If there is no current context, NULL is returned."
	)

	ALCdevice_p(
		"GetContextsDevice",
		"Queries for, and obtains a handle to, the device of a given context.",

		ALCcontext_p.IN("context", "the context to query")
	)

	ALCboolean(
		"IsExtensionPresent",
		"""
		Verifies that a given extension is available for the current context and the device it is associated with.

		Invalid and unsupported string tokens return ALC_FALSE. A NULL deviceHandle is acceptable. {@code extName} is not case sensitive – the implementation
		will convert the name to all upper-case internally (and will express extension names in upper-case).
		""",

		nullable _ const _ ALCdevice_p.IN("deviceHandle", "the device to query"),
		const _ ALCcharASCII_p.IN("extName", "the extension name")
	)

	ALCvoidptr(
		"GetProcAddress",
		"""
		Retrieves extension entry points.

		The application is expected to verify the applicability of an extension or core function entry point before requesting it by name, by use of
		#IsExtensionPresent().

		Entry points can be device specific, but are not context specific. Using a NULL device handle does not guarantee that the entry point is returned, even
		if available for one of the available devices.
		""",

		nullable _ const _ ALCdevice_p.IN("deviceHandle", "the device to query"),
		const _ ALcharASCII_p.IN("funcName", "the function name")
	)

	ALCenum(
		"GetEnumValue",
		"""
		Returns extension enum values.

		Enumeration/token values are device independent, but tokens defined for extensions might not be present for a given device. Using a NULL handle is
		legal, but only the tokens defined by the AL core are guaranteed. Availability of extension tokens depends on the ALC extension.
		""",

		nullable _ const _ ALCdevice_p.IN("deviceHandle", "the device to query"),
		const _ ALCcharASCII_p.IN("enumName", "the enum name")
	)

	ALCenum(
		"GetError",
		"""
		Queries ALC errors.

		ALC uses the same conventions and mechanisms as AL for error handling. In particular, ALC does not use conventions derived from X11 (GLX) or Windows
		(WGL).

		Error conditions are specific to the device, and (like AL) a call to alcGetError resets the error state.
		""",

		ALCdevice_p.IN("deviceHandle", "the device to query")
	)

	(const _ ALCcharUTF8_p)(
		"GetString",
		"""
		Obtains string value(s) from ALC.

		<b>LWJGL note</b>: Use ALC##getStringList() for those tokens that return multiple values.
		""",

		nullable _ ALCdevice_p.IN("deviceHandle", "the device to query"),
		ALCenum.IN("token", "the information to query", StringQueries)
	)

	ALCvoid(
		"GetIntegerv",
		"Obtains integer value(s) from ALC.",

		nullable _ ALCdevice_p.IN("deviceHandle", "the device to query"),
		ALCenum.IN("token", "the information to query", IntegerQueries),
		AutoSize("dest") _ ALCsizei.IN("size", "the size of the {@code dest} buffer"),
		returnValue _ ALCint_p.OUT("dest", "the destination buffer")
	)

}