/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun AMD_debug_output() = "AMDDebugOutput".nativeClassGL("AMD_debug_output", postfix = AMD) {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc("Native bindings to the ${link("http://www.opengl.org/registry/specs/AMD/debug_output.txt", templateName)} extension.")

	IntConstant.block(
		"Tokens accepted by GetIntegerv.",

		"MAX_DEBUG_MESSAGE_LENGTH_AMD" _ 0x9143,
		"MAX_DEBUG_LOGGED_MESSAGES_AMD" _ 0x9144,
		"DEBUG_LOGGED_MESSAGES_AMD" _ 0x9145
	)

	val Severities = IntConstant.block(
		"Tokens accepted by DebugMessageEnableAMD, GetDebugMessageLogAMD, DebugMessageInsertAMD, and DEBUGPROCAMD callback function for {@code severity}.",

		"DEBUG_SEVERITY_HIGH_AMD" _ 0x9146,
		"DEBUG_SEVERITY_MEDIUM_AMD" _ 0x9147,
		"DEBUG_SEVERITY_LOW_AMD" _ 0x9148
	).toJavaDocLinks()

	val Categories = IntConstant.block(
		"Tokens accepted by DebugMessageEnableAMD, GetDebugMessageLogAMD, and DEBUGPROCAMD callback function for {@code category}.",

		"DEBUG_CATEGORY_API_ERROR_AMD" _ 0x9149,
		"DEBUG_CATEGORY_WINDOW_SYSTEM_AMD" _ 0x914A,
		"DEBUG_CATEGORY_DEPRECATION_AMD" _ 0x914B,
		"DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD" _ 0x914C,
		"DEBUG_CATEGORY_PERFORMANCE_AMD" _ 0x914D,
		"DEBUG_CATEGORY_SHADER_COMPILER_AMD" _ 0x914E,
		"DEBUG_CATEGORY_APPLICATION_AMD" _ 0x914F,
		"DEBUG_CATEGORY_OTHER_AMD" _ 0x9150
	).toJavaDocLinks()

	GLvoid.func(
		"DebugMessageEnableAMD",
		"Disables or enables generation of subsets of messages.",

		GLenum.IN("category", "the message category", Categories),
		GLenum.IN("severity", "the message severity", Severities),
		AutoSize("ids") _ GLsizei.IN("count", "the number of values in the {@code ids} array"),
		mods(nullable, const) _ GLuint_p.IN("ids", "an array of message ids"),
		GLboolean.IN("enabled", "whether to enable or disable the referenced subset of messages")
	)

	GLvoid.func(
		"DebugMessageInsertAMD",
		"Injects an application-supplied message into the debug message stream.",

		GLenum.IN("category", "the message category", Categories),
		GLenum.IN("severity", "the message severity", Severities),
		GLuint.IN("id", "the message id"),
		AutoSize("buf") _ GLsizei.IN("length", "the number of character in the message"),
		const _ GLcharUTF8_p.IN("buf", "the message characters")
	)

	GLvoid.func(
		"DebugMessageCallbackAMD",
		"Specifies a callback to receive debugging messages from the GL.",

		mods(
			Callback("DEBUGPROCAMD", storeInFunctions = true),
			nullable
		) _ GLDEBUGPROCAMD.IN("callback", "a callback function that will be called when a debug message is generated"),
		mods(Expression("DEBUGPROCAMD.register($INSTANCE, callback)"), nullable) _ voidptr.IN(
			"userParam",
			"a user supplied pointer that will be passed on each invocation of {@code callback}"
		)
	)

	GLuint.func(
		"GetDebugMessageLogAMD",
		"Retrieves messages from the debug message log.",

		GLuint.IN("count", "the number of debug messages to retrieve from the log"),
		AutoSize("messageLog") _ GLsizei.IN("bufsize", "the maximum number of characters that can be written in the {@code message} array"),
		mods(Check("count"), nullable) _ GLenum_p.IN("categories", "an array of variables to receive the categories of the retrieved messages"),
		mods(Check("count"), nullable) _ GLuint_p.IN("severities", "an array of variables to receive the severities of the retrieved messages"),
		mods(Check("count"), nullable) _ GLuint_p.IN("ids", "an array of variables to receive the ids of the retrieved messages"),
		mods(Check("count"), nullable) _ GLsizei_p.IN("lengths", "an array of variables to receive the lengths of the retrieved messages"),
		GLcharUTF8_p.IN("messageLog", "an array of characters that will receive the messages")
	)

}
