/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_debug_output = "AMDDebugOutput".nativeClassGL("AMD_debug_output", postfix = AMD) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows the GL to notify applications when various debug events occur in contexts that have been created with the debug flag, as provided
		by ${WGL_ARB_create_context.link} and ${GLX_ARB_create_context.link}.
		
		These events are represented in the form of enumerable messages with an included human-readable translation. Examples of debug events include incorrect
		use of the GL, warnings of undefined behavior, and performance warnings.
  
		A message is uniquely identified by a category and an implementation-dependent ID within that category. Message categories are general and are used to
		organize large groups of similar messages together. Examples of categories include GL errors, performance warnings, and deprecated functionality
		warnings. Each message is also assigned a severity level that denotes roughly how "important" that message is in comparison to other messages across all
		categories. For example, notification of a GL error would have a higher severity than a performance warning due to redundant state changes.
  
		Messages are communicated to the application through an application-defined callback function that is called by the GL implementation on each debug
		message. The motivation for the callback routine is to free application developers from actively having to query whether any GL error or other
		debuggable event has happened after each call to a GL function. With a callback, developers can keep their code free of debug checks, and only have to
		react to messages as they occur. In order to support indirect rendering, a message log is also provided that stores copies of recent messages until they
		are actively queried.

		To control the volume of debug output, messages can be disabled either individually by ID, or entire groups of messages can be turned off based on
		category or severity.
  
		The only requirement on the minimum quantity and type of messages that implementations of this extension must support is that a message must be sent
		notifying the application whenever any GL error occurs. Any further messages are left to the implementation. Implementations do not have to output
		messages from all categories listed by this extension in order to support this extension, and new categories can be added by other extensions.

		This extension places no restrictions or requirements on any additional functionality provided by the debug context flag through other extensions.
     
		Requires ${WGL_ARB_create_context.link} or ${GLX_ARB_create_context.link}.
		"""

	IntConstant(
		"Tokens accepted by GetIntegerv.",

		"MAX_DEBUG_MESSAGE_LENGTH_AMD" _ 0x9143,
		"MAX_DEBUG_LOGGED_MESSAGES_AMD" _ 0x9144,
		"DEBUG_LOGGED_MESSAGES_AMD" _ 0x9145
	)

	val Severities = IntConstant(
		"Tokens accepted by DebugMessageEnableAMD, GetDebugMessageLogAMD, DebugMessageInsertAMD, and DEBUGPROCAMD callback function for {@code severity}.",

		"DEBUG_SEVERITY_HIGH_AMD" _ 0x9146,
		"DEBUG_SEVERITY_MEDIUM_AMD" _ 0x9147,
		"DEBUG_SEVERITY_LOW_AMD" _ 0x9148
	).javaDocLinks

	val Categories = IntConstant(
		"Tokens accepted by DebugMessageEnableAMD, GetDebugMessageLogAMD, and DEBUGPROCAMD callback function for {@code category}.",

		"DEBUG_CATEGORY_API_ERROR_AMD" _ 0x9149,
		"DEBUG_CATEGORY_WINDOW_SYSTEM_AMD" _ 0x914A,
		"DEBUG_CATEGORY_DEPRECATION_AMD" _ 0x914B,
		"DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD" _ 0x914C,
		"DEBUG_CATEGORY_PERFORMANCE_AMD" _ 0x914D,
		"DEBUG_CATEGORY_SHADER_COMPILER_AMD" _ 0x914E,
		"DEBUG_CATEGORY_APPLICATION_AMD" _ 0x914F,
		"DEBUG_CATEGORY_OTHER_AMD" _ 0x9150
	).javaDocLinks

	GLvoid(
		"DebugMessageEnableAMD",
		"""
		Allows disabling or enabling generation of subsets of messages. If {@code enabled} is GL11#TRUE, the referenced subset of messages is enabled. If
		GL11#FALSE, then those messages are disabled. This command can reference different subsets of messages by varying its parameter values in the following
		ways:
		${ol(
			"To reference all messages, let {@code category}, {@code severity}, and {@code count} all be zero. The value of {@code ids} is ignored in this case.",
		    """
		    To reference all messages across all categories with a specific severity level, let {@code category} and {@code count} be zero and let
		    {@code severity} identify the severity level. The value of {@code ids} is ignored in this case.
		    """,
		    """
		    To reference all messages within a single category, let {@code category} identify the referenced category and let {@code severity} and {@code count}
		    be zero. The value of {@code ids} is ignored in this case.
		    """,
		    """
		    To reference all messages within a single category and at a specific severity level, let {@code category} identify the category and {@code severity}
		    identify the severity level, and let {@code count} be zero. The value of {@code ids} is ignored in this case.
		    """,
		    """
		    To reference specific messages by ID within a single category, let {@code category} identify the category, let {@code severity} be zero, let
		    {@code count} be greater than zero and let {@code ids} identify the IDs of {@code count} messages within the identified category. Operations on
		    message IDs that are not valid within the category are silently ignored.
		    """
		)}
		In all of the above cases, if {@code category} is non-zero and specifies an invalid category, the error GL11#INVALID_ENUM is generated. Similarly if
		{@code severity} is non-zero and is an invalid severity level, the error GL11#INVALID_ENUM is generated. If {@code count} is less than zero, the error
		GL11#INVALID_VALUE is generated. If the parameters do not fall into one of the cases defined above, the error GL11#INVALID_VALUE is generated. The error
		GL11#INVALID_OPERATION is generated if this command is called in a non-debug context.
  
		Although messages are grouped into categories and severities, and entire groups of messages can be turned off with a single call, there is no explicit
		per-category or per-severity enabled state. Instead the enabled state is stored individually for each message. There is no difference between disabling
		a category of messages with a single call, and enumerating all messages of that category and individually disabling each of them by their ID.
  
		All messages of severity level #DEBUG_SEVERITY_MEDIUM_AMD and #DEBUG_SEVERITY_HIGH_AMD in all categories are initially enabled, and all messages at
		#DEBUG_SEVERITY_LOW_AMD are initially disabled.
		""",

		GLenum.IN("category", "the message category", Categories),
		GLenum.IN("severity", "the message severity", Severities),
		AutoSize("ids") _ GLsizei.IN("count", "the number of values in the {@code ids} array"),
		nullable _ const _ GLuint_p.IN("ids", "an array of message ids"),
		GLboolean.IN("enabled", "whether to enable or disable the referenced subset of messages")
	)

	GLvoid(
		"DebugMessageInsertAMD",
		"""
		Injects an application-supplied message into the debug message stream.
		
		The value of {@code id} specifies the ID for the message and {@code severity} indicates its severity level as defined by the application. If
		{@code severity} is not a valid severity level, the error GL11#INVALID_ENUM will be generated. The value of {@code category} must be
		#DEBUG_CATEGORY_APPLICATION_AMD, or the error GL11#INVALID_ENUM will be generated. The string {@code buf} contains the string representation of the
		message. The parameter {@code length} contains the size of the message's string representation, excluding the null-terminator. If {@code length} is
		zero, then its value is derived from the string-length of {@code buf} and {@code buf} must contain a null-terminated string. The error
		GL11#INVALID_VALUE will be generated if {@code length} is less than zero or its derived value is larger than or equal to #MAX_DEBUG_MESSAGE_LENGTH_AMD.
		The error GL11#INVALID_OPERATION will be generated if this function is called in a non-debug context.
		""",

		GLenum.IN("category", "the message category", "#DEBUG_CATEGORY_APPLICATION_AMD"),
		GLenum.IN("severity", "the message severity", Severities),
		GLuint.IN("id", "the message id"),
		AutoSize("buf") _ GLsizei.IN("length", "the number of character in the message"),
		const _ GLcharUTF8_p.IN("buf", "the message characters")
	)

	GLvoid(
		"DebugMessageCallbackAMD",
		"""
		Specifies a callback to receive debugging messages from the GL.
		
		With {@code callback} storing the address of the callback function. This function's signature must follow the type definition of DEBUGPROCAMD, and its
		calling convention must be the same as the calling convention of GL functions. Anything else will result in undefined behavior. Only one debug callback
		can be specified for the current context, and further calls overwrite the previous callback. Specifying zero as the value of {@code callback} clears the
		current callback and disables message output through callbacks. Applications can specify user-specified data through the pointer {@code userParam}. The
		context will store this pointer and will include it as one of the parameters of each call to the callback function. The error GL11#INVALID_OPERATION
		will be generated if this function is called for contexts created without the debug flag.

		If the application has specified a callback function in a debug context, the implementation will call that function whenever any unfiltered message is
		generated. The ID, category, and severity of the message are specified by the callback parameters {@code id}, {@code category} and {@code severity},
		respectively. The string representation of the message is stored in {@code message} and its length (excluding the null-terminator) is stored in
		{@code length}. The parameter {@code userParam} is the user-specified value that was passed when calling DebugMessageCallbackAMD. The memory for
		{@code message} is allocated, owned and released by the implementation, and should only be considered valid for the duration of the callback function
		call. While it is allowed to concurrently use multiple debug contexts with the same debug callback function, note that it is the application's
		responsibility to ensure that any work that occurs inside the debug callback function is thread-safe. Furthermore, calling any GL or window layer
		function from within the callback function results in undefined behavior.

		If no callback is set, then messages are instead stored in an internal message log up to some maximum number of strings as defined by the
		implementation-dependent constant #MAX_DEBUG_LOGGED_MESSAGES_AMD. Each context stores its own message log and will only store messages generated by
		commands operating in that context. If the message log is full, then the oldest messages will be removed from the log to make room for newer ones. The
		application can query the number of messages currently in the log by obtaining the value of #DEBUG_LOGGED_MESSAGES_AMD.
		""",

		nullable _ GLDEBUGPROCAMD.IN("callback", "a callback function that will be called when a debug message is generated"),
		nullable _ voidptr.IN(
			"userParam",
			"a user supplied pointer that will be passed on each invocation of {@code callback}"
		)
	)

	GLuint(
		"GetDebugMessageLogAMD",
		"""
		Retrieves messages from the debug message log.

		This function will fetch as many messages as possible from the message log up to {@code count} in order from oldest to newest, and will return the
		number of messages fetched. Those messages that were fetched will be removed from the log. The value of {@code count} must be greater than zero and less
		than #MAX_DEBUG_LOGGED_MESSAGES_AMD or otherwise the error GL11#INVALID_VALUE will be generated. The value of {@code count} can be larger than the
		actual number of messages currently in the log. If {@code messageLog} is not a null pointer, then the string representations of all fetched messages
		will be stored in the buffer {@code messageLog} and will be separated by null-terminators. The maximum size of the buffer (including all
		null-terminators) is denoted by {@code bufSize}, and strings of messages within {@code count} that do not fit in the buffer will not be fetched. If
		{@code bufSize} is less than zero, the error GL11#INVALID_VALUE will be generated. If {@code messageLog} is a null pointer, then the value of
		{@code bufSize} is ignored. The categories, severity levels, IDs, and string representation lengths of all (up to {@code count}) removed messages will
		be stored in the arrays {@code categories}, {@code severities}, {@code ids}, and {@code lengths}, respectively. The counts stored in the array
		{@code lengths} include the null-terminator of each string. Any and all of the output arrays, including {@code messageLog}, are optional, and no data is
		returned for those arrays that are specified with a null pointer. To simply delete up to {@code count} messages from the message log and ignoring, the
		application can call the function with null pointers for all output arrays. The error GL11#INVALID_OPERATION will be generated by GetDebugMessageLogAMD
		if it is called in a non-debug context.
		""",

		GLuint.IN("count", "the number of debug messages to retrieve from the log"),
		AutoSize("messageLog") _ GLsizei.IN("bufsize", "the maximum number of characters that can be written in the {@code message} array"),
		Check("count") _ nullable _ GLenum_p.OUT("categories", "an array of variables to receive the categories of the retrieved messages"),
		Check("count") _ nullable _ GLuint_p.OUT("severities", "an array of variables to receive the severities of the retrieved messages"),
		Check("count") _ nullable _ GLuint_p.OUT("ids", "an array of variables to receive the ids of the retrieved messages"),
		Check("count") _ nullable _ GLsizei_p.OUT("lengths", "an array of variables to receive the lengths of the retrieved messages"),
		nullable _ GLcharUTF8_p.OUT("messageLog", "an array of characters that will receive the messages")
	)

}
