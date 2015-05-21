/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.opengl.*

val GL43 = "GL43".nativeClassGL("GL43") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		The core OpenGL 4.3 functionality. OpenGL 4.3 implementations support revision 4.30 of the OpenGL Shading Language.

		Extensions promoted to core in this release:
		${ul(
			registryLinkTo("ARB", "arrays_of_arrays"),
			registryLinkTo("ARB", "ES3_compatibility"),
			registryLinkTo("ARB", "clear_buffer_object"),
			registryLinkTo("ARB", "compute_shader"),
			registryLinkTo("ARB", "copy_image"),
			registryLinkTo("ARB", "debug_group"),
			registryLinkTo("ARB", "debug_label"),
			registryLinkTo("ARB", "debug_output2"),
			registryLinkTo("ARB", "debug_output"),
			registryLinkTo("ARB", "explicit_uniform_location"),
			registryLinkTo("ARB", "fragment_layer_viewport"),
			registryLinkTo("ARB", "framebuffer_no_attachments"),
			registryLinkTo("ARB", "internalformat_query2"),
			registryLinkTo("ARB", "invalidate_subdata"),
			registryLinkTo("ARB", "multi_draw_indirect"),
			registryLinkTo("ARB", "program_interface_query"),
			registryLinkTo("ARB", "robust_buffer_access_behavior"),
			registryLinkTo("ARB", "shader_image_size"),
			registryLinkTo("ARB", "shader_storage_buffer_object"),
			registryLinkTo("ARB", "stencil_texturing"),
			registryLinkTo("ARB", "texture_buffer_range"),
			registryLinkTo("ARB", "texture_query_levels"),
			registryLinkTo("ARB", "texture_storage_multisample"),
			registryLinkTo("ARB", "texture_view"),
			registryLinkTo("ARB", "vertex_attrib_binding")
		)}
		"""

	IntConstant(
		"No. of supported Shading Language Versions. Accepted by the {@code pname} parameter of GetIntegerv.",

		"NUM_SHADING_LANGUAGE_VERSIONS" _ 0x82E9
	)

	IntConstant(
		"Vertex attrib array has unconverted doubles. Accepted by the {@code pname} parameter of GetVertexAttribiv.",

		"VERTEX_ATTRIB_ARRAY_LONG" _ 0x874E
	)

	// ARB_ES3_compatibility

	IntConstant(
		"Accepted by the {@code internalformat} parameter of CompressedTexImage2D.",

		"COMPRESSED_RGB8_ETC2" _ 0x9274,
		"COMPRESSED_SRGB8_ETC2" _ 0x9275,
		"COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2" _ 0x9276,
		"COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2" _ 0x9277,
		"COMPRESSED_RGBA8_ETC2_EAC" _ 0x9278,
		"COMPRESSED_SRGB8_ALPHA8_ETC2_EAC" _ 0x9279,
		"COMPRESSED_R11_EAC" _ 0x9270,
		"COMPRESSED_SIGNED_R11_EAC" _ 0x9271,
		"COMPRESSED_RG11_EAC" _ 0x9272,
		"COMPRESSED_SIGNED_RG11_EAC" _ 0x9273
	)

	IntConstant(
		"Accepted by the {@code target} parameter of Enable and Disable.",

		"PRIMITIVE_RESTART_FIXED_INDEX" _ 0x8D69
	)

	IntConstant(
		"Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryIndexediv and GetQueryiv.",

		"ANY_SAMPLES_PASSED_CONSERVATIVE" _ 0x8D6A
	)

	IntConstant(
		"Accepted by the {@code value} parameter of the GetInteger* functions.",

		"MAX_ELEMENT_INDEX" _ 0x8D6B
	)

	IntConstant(
		"Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv.",

		"TEXTURE_IMMUTABLE_LEVELS" _ 0x82DF
	)

	// ARB_clear_buffer_object

	GLvoid(
		"ClearBufferData",
		"Fills a buffer object's data store with a fixed value.",

		GLenum.IN("target", "the target of the operation", BUFFER_OBJECT_TARGETS),
		GLenum.IN("internalformat", "the internal format with which the data will be stored in the buffer object"),
		GLenum.IN("format", "the format of the data in memory addressed by {@code data}", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the type of the data in memory addressed by {@code data}", PIXEL_DATA_TYPES),
		nullable _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
		) _ const _ GLvoid_p.IN("data",
				"""
		    buffer containing the data to be used as the source of the constant fill value.
				The elements of data are converted by the GL into the format specified by internalformat,
				and then used to fill the specified range of the destination buffer.
				If data is $NULL, then it is ignored and the sub-range of the buffer is filled with zeros.
				"""
		)
	)

	GLvoid(
		"ClearBufferSubData",
		"Fills all or part of buffer object's data store with a fixed value.",

		GLenum.IN("target", "the target of the operation", BUFFER_OBJECT_TARGETS),
		GLenum.IN("internalformat", "the internal format with which the data will be stored in the buffer object"),
		GLintptr.IN("offset", "the offset, in basic machine units into the buffer object's data store at which to start filling"),
		GLsizeiptr.IN("size", "the size, in basic machine units of the range of the data store to fill"),
		GLenum.IN("format", "the format of the data in memory addressed by {@code data}", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the type of the data in memory addressed by {@code data}", PIXEL_DATA_TYPES),
		nullable _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
		) _ const _ GLvoid_p.IN("data",
				"""
		    buffer containing the data to be used as the source of the constant fill value.
				The elements of data are converted by the GL into the format specified by internalformat,
				and then used to fill the specified range of the destination buffer.
				If data is $NULL, then it is ignored and the sub-range of the buffer is filled with zeros.
				"""
		)
	)

	// ARB_compute_shader

	IntConstant(
		"Accepted by the {@code type} parameter of CreateShader and returned in the {@code params} parameter by GetShaderiv.",

		"COMPUTE_SHADER" _ 0x91B9
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.",

		"MAX_COMPUTE_UNIFORM_BLOCKS" _ 0x91BB,
		"MAX_COMPUTE_TEXTURE_IMAGE_UNITS" _ 0x91BC,
		"MAX_COMPUTE_IMAGE_UNIFORMS" _ 0x91BD,
		"MAX_COMPUTE_SHARED_MEMORY_SIZE" _ 0x8262,
		"MAX_COMPUTE_UNIFORM_COMPONENTS" _ 0x8263,
		"MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS" _ 0x8264,
		"MAX_COMPUTE_ATOMIC_COUNTERS" _ 0x8265,
		"MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS" _ 0x8266,
		"MAX_COMPUTE_WORK_GROUP_INVOCATIONS" _ 0x90EB
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetFloati_v, GetDoublei_v and GetInteger64i_v.",

		"MAX_COMPUTE_WORK_GROUP_COUNT" _ 0x91BE,
		"MAX_COMPUTE_WORK_GROUP_SIZE" _ 0x91BF
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"COMPUTE_WORK_GROUP_SIZE" _ 0x8267
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.",

		"UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER" _ 0x90EC
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.",

		"ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER" _ 0x90ED
	)

	IntConstant(
		"Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

		"DISPATCH_INDIRECT_BUFFER" _ 0x90EE
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.",

		"DISPATCH_INDIRECT_BUFFER_BINDING" _ 0x90EF
	)

	IntConstant(
		"Accepted by the {@code stages} parameter of UseProgramStages.",

		"COMPUTE_SHADER_BIT" _ 0x00000020
	)


	GLvoid(
		"DispatchCompute",
		"Launches one or more compute work groups.",

		GLuint.IN("num_groups_x", "the number of work groups to be launched in the X dimension"),
		GLuint.IN("num_groups_y", "the number of work groups to be launched in the Y dimension"),
		GLuint.IN("num_groups_z", "the number of work groups to be launched in the Z dimension")
	)

	GLvoid(
		"DispatchComputeIndirect",
		"""
		Launches one or more compute work groups using parameters stored in a buffer.

		The parameters addressed by indirect are packed a structure, which takes the form (in C):
		${codeBlock("""
typedef struct {
	uint num_groups_x;
	uint num_groups_y;
	uint num_groups_z;
} DispatchIndirectCommand;
		""")}

		A call to {@code glDispatchComputeIndirect} is equivalent, assuming no errors are generated, to:
		${codeBlock("""
cmd = (const DispatchIndirectCommand *)indirect;
glDispatchCompute(cmd->num_groups_x, cmd->num_groups_y, cmd->num_groups_z);
		""")}
		""",

		DISPATCH_INDIRECT_BUFFER _ GLintptr.IN(
			"indirect",
			"""
			the offset into the buffer object currently bound to the #DISPATCH_INDIRECT_BUFFER buffer target at which the dispatch parameters are
			stored.
			"""
		)
	)

	// ARB_copy_image

	GLvoid(
		"CopyImageSubData",
		"Performs a raw data copy between two images.",

		GLuint.IN("srcName", "the name of a texture or renderbuffer object from which to copy"),
		GLenum.IN("srcTarget", "the target representing the namespace of the source name {@code srcName}"),
		GLint.IN("srcLevel", "the mipmap level to read from the source"),
		GLint.IN("srcX", "the X coordinate of the left edge of the souce region to copy"),
		GLint.IN("srcY", "the Y coordinate of the top edge of the souce region to copy"),
		GLint.IN("srcZ", "the Z coordinate of the near edge of the souce region to copy"),
		GLuint.IN("dstName", "the name of a texture or renderbuffer object to which to copy"),
		GLenum.IN("dstTarget", "the target representing the namespace of the destination name {@code dstName}"),
		GLint.IN("dstLevel", "the mipmap level to write to the source"),
		GLint.IN("dstX", "the X coordinate of the left edge of the destination region"),
		GLint.IN("dstY", "the Y coordinate of the top edge of the destination region"),
		GLint.IN("dstZ", "the Z coordinate of the near edge of the destination region"),
		GLsizei.IN("srcWidth", "the width of the region to be copied"),
		GLsizei.IN("srcHeight", "the height of the region to be copied"),
		GLsizei.IN("srcDepth", "the depth of the region to be copied")
	)

	// KHR_debug

	IntConstant(
		"Tokens accepted by the {@code target} parameters of Enable, Disable, and  IsEnabled.",

		"DEBUG_OUTPUT" _ 0x92E0,
		"DEBUG_OUTPUT_SYNCHRONOUS" _ 0x8242
	)

	IntConstant(
		"Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS.",

		"CONTEXT_FLAG_DEBUG_BIT" _ 0x00000002
	)

	IntConstant(
		"Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v.",

		"MAX_DEBUG_MESSAGE_LENGTH" _ 0x9143,
		"MAX_DEBUG_LOGGED_MESSAGES" _ 0x9144,
		"DEBUG_LOGGED_MESSAGES" _ 0x9145,
		"DEBUG_NEXT_LOGGED_MESSAGE_LENGTH" _ 0x8243,
		"MAX_DEBUG_GROUP_STACK_DEPTH" _ 0x826C,
		"DEBUG_GROUP_STACK_DEPTH" _ 0x826D,
		"MAX_LABEL_LENGTH" _ 0x82E8
	)

	IntConstant(
		"Tokens accepted by the {@code pname} parameter of GetPointerv.",

		"DEBUG_CALLBACK_FUNCTION" _ 0x8244,
		"DEBUG_CALLBACK_USER_PARAM" _ 0x8245
	)

	val DebugSources = IntConstant(
		"""
		Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter
		of GetDebugMessageLog.
		""",

		"DEBUG_SOURCE_API" _ 0x8246,
		"DEBUG_SOURCE_WINDOW_SYSTEM" _ 0x8247,
		"DEBUG_SOURCE_SHADER_COMPILER" _ 0x8248,
		"DEBUG_SOURCE_THIRD_PARTY" _ 0x8249,
		"DEBUG_SOURCE_APPLICATION" _ 0x824A,
		"DEBUG_SOURCE_OTHER" _ 0x824B
	).javaDocLinks

	val DebugTypes = IntConstant(
		"""
		Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of
		GetDebugMessageLog.
		""",

		"DEBUG_TYPE_ERROR" _ 0x824C,
		"DEBUG_TYPE_DEPRECATED_BEHAVIOR" _ 0x824D,
		"DEBUG_TYPE_UNDEFINED_BEHAVIOR" _ 0x824E,
		"DEBUG_TYPE_PORTABILITY" _ 0x824F,
		"DEBUG_TYPE_PERFORMANCE" _ 0x8250,
		"DEBUG_TYPE_OTHER" _ 0x8251,
		"DEBUG_TYPE_MARKER" _ 0x8268
	).javaDocLinks

	IntConstant(
		"""
		Tokens accepted or provided by the {@code type} parameters of DebugMessageControl and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.
		""",

		"DEBUG_TYPE_PUSH_GROUP" _ 0x8269,
		"DEBUG_TYPE_POP_GROUP" _ 0x826A
	)

	val DebugSeverities = IntConstant(
		"""
		Tokens accepted or provided by the {@code severity} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC callback functions, and the
		{@code severities} parameter of GetDebugMessageLog.
		""",

		"DEBUG_SEVERITY_HIGH" _ 0x9146,
		"DEBUG_SEVERITY_MEDIUM" _ 0x9147,
		"DEBUG_SEVERITY_LOW" _ 0x9148,
		"DEBUG_SEVERITY_NOTIFICATION" _ 0x826B
	).javaDocLinks

	val DebugIdentifiers = IntConstant(
		"Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.",

		"BUFFER" _ 0x82E0,
		"SHADER" _ 0x82E1,
		"PROGRAM" _ 0x82E2,
		"QUERY" _ 0x82E3,
		"PROGRAM_PIPELINE" _ 0x82E4,
		"SAMPLER" _ 0x82E6,
		"DISPLAY_LIST" _ 0x82E7
	).javaDocLinks

	GLvoid(
		"DebugMessageControl",
		"""
		Controls the volume of debug output in the active debug group, by disabling specific or groups of messages.
		
		If {@code enabled} is GL11#TRUE, the referenced subset of messages will be enabled. If GL11#FALSE, then those messages will be disabled.
    
		This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following
		ways:
		${ul(
			"""
			If {@code source}, {@code type}, or {@code severity} is GL11#DONT_CARE, the messages from all sources, of all types, or of all severities are
			referenced respectively.
			""",
		    """
		    When values other than GL11#DONT_CARE are specified, all messages whose source, type, or severity match the specified {@code source}, {@code type},
		    or {@code severity} respectively will be referenced.
		    """,
		    """
		    If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and
		    {@code type}. In this case, if {@code source} or {@code type} is GL11#DONT_CARE, or {@code severity} is not GL11#DONT_CARE, the error
		    GL11#INVALID_OPERATION is generated.
		    """
		)}


		Unrecognized message IDs in {@code ids} are ignored. If {@code count} is zero, the value if {@code ids} is ignored.

		Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled
		state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a
		single call, and individually disabling all messages from that source using their types and IDs.

		If the #DEBUG_OUTPUT state is disabled the GL operates the same as if messages of every {@code source}, {@code type} or {@code severity} are disabled.
		""",

		GLenum.IN("source", "the source of debug messages to enable or disable", DebugSources),
		GLenum.IN("type", "the type of debug messages to enable or disable", DebugTypes),
		GLenum.IN("severity", "the severity of debug messages to enable or disable", DebugSeverities),
		AutoSize("ids") _ GLsizei.IN("count", "the length of the array {@code ids}"),
		SingleValue("id") _ const _ GLuint_p.IN("ids", "an array of unsigned integers containing the ids of the messages to enable or disable"),
		GLboolean.IN("enabled", "whether the selected messages should be enabled or disabled")
	)

	GLvoid(
		"DebugMessageInsert",
		"""
		This function can be called by applications and third-party libraries to generate their own messages, such as ones containing timestamp information or
		signals about specific render system events.
		
		The value of {@code id} specifies the ID for the message and {@code severity} indicates its severity level as defined by the caller. The string
		{@code buf} contains the string representation of the message. The parameter {@code length} contains the number of characters in {@code buf}. If
		{@code length} is negative, it is implied that {@code buf} contains a null terminated string. The error GL11#INVALID_VALUE will be generated if the
		number of characters in {@code buf}, excluding the null terminator when {@code length} is negative, is not less than the value of
		#MAX_DEBUG_MESSAGE_LENGTH.

		If the #DEBUG_OUTPUT state is disabled calls to DebugMessageInsert are discarded and do not generate an error.
		""",

		GLenum.IN("source", "the source of the debug message to insert", DebugSources),
		GLenum.IN("type", "the type of the debug message insert", DebugTypes),
		GLuint.IN("id", "the user-supplied identifier of the message to insert", DebugSeverities),
		GLenum.IN("severity", "the severity of the debug messages to insert"),
		AutoSize("message") _ GLsizei.IN("length", "the length of the string contained in the character array whose address is given by {@code message}"),
		const _ GLcharUTF8_p.IN("message", "a character array containing the message to insert")
	)

	GLvoid(
		"DebugMessageCallback",
		"""
		Specifies a callback to receive debugging messages from the GL.

		The function's prototype must follow the type definition of DEBUGPROC including its platform-dependent calling convention. Anything else will result in
		undefined behavior. Only one debug callback can be specified for the current context, and further calls overwrite the previous callback. Specifying
		$NULL as the value of {@code callback} clears the current callback and disables message output through callbacks. Applications can provide
		user-specified data through the pointer {@code userParam}. The context will store this pointer and will include it as one of the parameters in each call
		to the callback function.

		If the application has specified a callback function for receiving debug output, the implementation will call that function whenever any enabled message
		is generated.  The source, type, ID, and severity of the message are specified by the DEBUGPROC parameters {@code source}, {@code type}, {@code id}, and
		{@code severity}, respectively. The string representation of the message is stored in {@code message} and its length (excluding the null-terminator) is
		stored in {@code length}. The parameter {@code userParam} is the user-specified parameter that was given when calling DebugMessageCallback.

		Applications can query the current callback function and the current user-specified parameter by obtaining the values of #DEBUG_CALLBACK_FUNCTION and
		#DEBUG_CALLBACK_USER_PARAM, respectively.

		Applications that specify a callback function must be aware of certain special conditions when executing code inside a callback when it is called by the
		GL, regardless of the debug source.

		The memory for {@code message} is owned and managed by the GL, and should only be considered valid for the duration of the function call.

		The behavior of calling any GL or window system function from within the callback function is undefined and may lead to program termination.

		Care must also be taken in securing debug callbacks for use with asynchronous debug output by multi-threaded GL implementations.

		If the #DEBUG_OUTPUT state is disabled then the GL will not call the callback function.
		""",

		nullable _ GLDEBUGPROC.IN("callback", "a callback function that will be called when a debug message is generated"),
		nullable _ const _ voidptr.IN(
			"userParam",
			"a user supplied pointer that will be passed on each invocation of {@code callback}"
		)
	)

	GLuint(
		"GetDebugMessageLog",
		"""
		Retrieves messages from the debug message log.
		
		This function fetches a maximum of <count> messages from the message log, and will return the number of messages successfully fetched.
    
		Messages will be fetched from the log in order of oldest to newest. Those messages that were fetched will be removed from the log.
    
		The sources, types, severities, IDs, and string lengths of fetched messages will be stored in the application-provided arrays {@code sources},
		{@code types}, {@code severities}, {@code ids}, and {@code lengths}, respectively. The application is responsible for allocating enough space for each
		array to hold up to {@code count} elements. The string representations of all fetched messages are stored in the {@code messageLog} array. If multiple
		messages are fetched, their strings are concatenated into the same {@code messageLog} array and will be separated by single null terminators. The last
		string in the array will also be null-terminated. The maximum size of {@code messageLog}, including the space used by all null terminators, is given by
		{@code bufSize}. If {@code bufSize} is less than zero and {@code messageLog} is not $NULL, an GL11#INVALID_VALUE error will be generated. If a message's
		string, including its null terminator, can not fully fit within the {@code messageLog} array's remaining space, then that message and any subsequent
		messages will not be fetched and will remain in the log. The string lengths stored in the array {@code lengths} include the space for the null terminator of each string.
  
		Any or all of the arrays {@code sources}, {@code types}, {@code ids}, {@code severities}, {@code lengths} and {@code messageLog} can also be null
		pointers, which causes the attributes for such arrays to be discarded when messages are fetched, however those messages will still be removed from the
		log. Thus to simply delete up to {@code count} messages from the message log while ignoring their attributes, the application can call the function with
		null pointers for all attribute arrays.

		If the context was created without the #CONTEXT_FLAG_DEBUG_BIT in the GL30#CONTEXT_FLAGS state, then the GL can opt to never add messages to the message
		log so GetDebugMessageLog will always return zero.
		""",

		GLuint.IN("count", "the number of debug messages to retrieve from the log"),
		AutoSize("messageLog") _ GLsizei.IN("bufsize", "the size of the buffer whose address is given by {@code messageLog}"),
		Check("count") _ nullable _ GLenum_p.OUT("sources", "an array of variables to receive the sources of the retrieved messages"),
		Check("count") _ nullable _ GLenum_p.OUT("types", "an array of variables to receive the types of the retrieved messages"),
		Check("count") _ nullable _ GLuint_p.OUT("ids", "an array of unsigned integers to receive the ids of the retrieved messages"),
		Check("count") _ nullable _ GLenum_p.OUT("severities", "an array of variables to receive the severites of the retrieved messages"),
		Check("count") _ nullable _ GLsizei_p.OUT("lengths", "an array of variables to receive the lengths of the received messages"),
		nullable _ GLcharUTF8_p.OUT("messageLog", "an array of characters that will receive the messages")
	)

	GLvoid(
		"PushDebugGroup",
		"""
		Pushes a debug group described by the string {@code message} into the command stream. The value of {@code id} specifies the ID of messages generated.
		The parameter {@code length} contains the number of characters in {@code message}. If {@code length} is negative, it is implied that {@code message}
		contains a null terminated string. The message has the specified {@code source} and {@code id}, {@code type} #DEBUG_TYPE_PUSH_GROUP, and
		{@code severity} #DEBUG_SEVERITY_NOTIFICATION. The GL will put a new debug group on top of the debug group stack which inherits the control of the
		volume of debug output of the debug group previously residing on the top of the debug group stack. Because debug groups are strictly hierarchical, any
		additional control of the debug output volume will only apply within the active debug group and the debug groups pushed on top of the active debug group.

		An GL11#INVALID_ENUM error is generated if the value of {@code source} is neither #DEBUG_SOURCE_APPLICATION nor #DEBUG_SOURCE_THIRD_PARTY. An
		GL11#INVALID_VALUE error is generated if {@code length} is negative and the number of characters in {@code message}, excluding the null-terminator, is
		not less than the value of #MAX_DEBUG_MESSAGE_LENGTH.
		""",

		GLenum.IN("source", "the source of the debug message", "#DEBUG_SOURCE_APPLICATION #DEBUG_SOURCE_THIRD_PARTY"),
		GLuint.IN("id", "the identifier of the message"),
		AutoSize("message") _ GLsizei.IN("length", "the length of the message to be sent to the debug output stream"),
		const _ GLcharUTF8_p.IN("message", "a string containing the message to be sent to the debug output stream")
	)

	GLvoid(
		"PopDebugGroup",
		"""
		Pops the active debug group. When a debug group is popped, the GL will also generate a debug output message describing its cause based on the
		{@code message} string, the source {@code source}, and an ID {@code id} submitted to the associated #PushDebugGroup() command. #DEBUG_TYPE_PUSH_GROUP
		and #DEBUG_TYPE_POP_GROUP share a single namespace for message {@code id}. {@code severity} has the value #DEBUG_SEVERITY_NOTIFICATION. The {@code type}
		has the value #DEBUG_TYPE_POP_GROUP. Popping a debug group restores the debug output volume control of the parent debug group.

		Attempting to pop the default debug group off the stack generates a GL11#STACK_UNDERFLOW error; pushing a debug group onto a stack containing
		#MAX_DEBUG_GROUP_STACK_DEPTH minus one elements will generate a GL11#STACK_OVERFLOW error.
		"""
	)

	GLvoid(
		"ObjectLabel",
		"Labels a named object identified within a namespace.",

		GLenum.IN(
			"identifier",
			"the namespace from which the name of the object is allocated",
			DebugIdentifiers + " GL11#VERTEX_ARRAY GL11#TEXTURE GL30#RENDERBUFFER GL30#FRAMEBUFFER GL40#TRANSFORM_FEEDBACK"
		),
		GLuint.IN("name", "the name of the object to label"),
		AutoSize("label") _ GLsizei.IN("length", "the length of the label to be used for the object"),
		const _ GLcharUTF8_p.IN("label", "a string containing the label to assign to the object")
	)

	GLvoid(
		"GetObjectLabel",
		"Retrieves the label of a named object identified within a namespace.",

		GLenum.IN(
			"identifier",
			"the namespace from which the name of the object is allocated",
			DebugIdentifiers + " GL11#VERTEX_ARRAY GL11#TEXTURE GL30#RENDERBUFFER GL30#FRAMEBUFFER GL40#TRANSFORM_FEEDBACK"
		),
		GLuint.IN("name", "the name of the object whose label to retrieve"),
		AutoSize("label") _ GLsizei.IN("bufSize", "the length of the buffer whose address is in {@code label}"),
		Check(1) _ nullable _ GLsizei_p.OUT("length", "the address of a variable to receive the length of the object label"),
		Return("length", "GL11.glGetInteger(GL_MAX_LABEL_LENGTH)") _ GLcharUTF8_p.OUT("label", "a string that will receive the object label")
	)

	GLvoid(
		"ObjectPtrLabel",
		"Labels a sync object identified by a pointer.",

		voidptr.IN("ptr", "a pointer identifying a sync object"),
		AutoSize("label") _ GLsizei.IN("length", "the length of the label to be used for the object"),
		const _ GLcharUTF8_p.IN("label", "a string containing the label to assign to the object")
	)

	GLvoid(
		"GetObjectPtrLabel",
		"Retrieves the label of a sync object identified by a pointer.",

		voidptr.IN("ptr", "the name of the sync object whose label to retrieve"),
		AutoSize("label") _ GLsizei.IN("bufSize", "the length of the buffer whose address is in {@code label}"),
		Check(1) _ nullable _ GLsizei_p.OUT("length", "a variable to receive the length of the object label"),
		Return("length", "GL11.glGetInteger(GL_MAX_LABEL_LENGTH)") _ GLcharUTF8_p.OUT("label", "a string that will receive the object label")
	)

	// ARB_explicit_uniform_location

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

		"MAX_UNIFORM_LOCATIONS" _ 0x826E
	)

	// ARB_framebuffer_no_attachments

	val FramebufferParameters = IntConstant(
		"""
		Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and
		GetNamedFramebufferParameterivEXT.
		""",

		"FRAMEBUFFER_DEFAULT_WIDTH" _ 0x9310,
		"FRAMEBUFFER_DEFAULT_HEIGHT" _ 0x9311,
		"FRAMEBUFFER_DEFAULT_LAYERS" _ 0x9312,
		"FRAMEBUFFER_DEFAULT_SAMPLES" _ 0x9313,
		"FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS" _ 0x9314
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.",

		"MAX_FRAMEBUFFER_WIDTH" _ 0x9315,
		"MAX_FRAMEBUFFER_HEIGHT" _ 0x9316,
		"MAX_FRAMEBUFFER_LAYERS" _ 0x9317,
		"MAX_FRAMEBUFFER_SAMPLES" _ 0x9318
	)

	GLvoid(
		"FramebufferParameteri",
		"Sets a named parameter of a framebuffer.",

		GLenum.IN("target", "target of the operation", "GL30#READ_FRAMEBUFFER GL30#DRAW_FRAMEBUFFER GL30#FRAMEBUFFER"),
		GLenum.IN("pname", "a token indicating the parameter to be modified", FramebufferParameters),
		GLint.IN("param", "the new value for the parameter named {@code pname}")
	)

	GLvoid(
		"GetFramebufferParameteriv",
		"Retrieves a named parameter from a framebuffer.",

		GLenum.IN("target", "target of the operation", "GL30#READ_FRAMEBUFFER GL30#DRAW_FRAMEBUFFER GL30#FRAMEBUFFER"),
		GLenum.IN("pname", "a token indicating the parameter to be retrieved", FramebufferParameters),
		Check(1) _ returnValue _ GLint_p.OUT("params", "a variable to receive the value of the parameter named {@code pname}")
	)

	// ARB_internalformat_query2

	IntConstant(
		"Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.",

		"INTERNALFORMAT_SUPPORTED" _ 0x826F,
		"INTERNALFORMAT_PREFERRED" _ 0x8270,
		"INTERNALFORMAT_RED_SIZE" _ 0x8271,
		"INTERNALFORMAT_GREEN_SIZE" _ 0x8272,
		"INTERNALFORMAT_BLUE_SIZE" _ 0x8273,
		"INTERNALFORMAT_ALPHA_SIZE" _ 0x8274,
		"INTERNALFORMAT_DEPTH_SIZE" _ 0x8275,
		"INTERNALFORMAT_STENCIL_SIZE" _ 0x8276,
		"INTERNALFORMAT_SHARED_SIZE" _ 0x8277,
		"INTERNALFORMAT_RED_TYPE" _ 0x8278,
		"INTERNALFORMAT_GREEN_TYPE" _ 0x8279,
		"INTERNALFORMAT_BLUE_TYPE" _ 0x827A,
		"INTERNALFORMAT_ALPHA_TYPE" _ 0x827B,
		"INTERNALFORMAT_DEPTH_TYPE" _ 0x827C,
		"INTERNALFORMAT_STENCIL_TYPE" _ 0x827D,
		"MAX_WIDTH" _ 0x827E,
		"MAX_HEIGHT" _ 0x827F,
		"MAX_DEPTH" _ 0x8280,
		"MAX_LAYERS" _ 0x8281,
		"MAX_COMBINED_DIMENSIONS" _ 0x8282,
		"COLOR_COMPONENTS" _ 0x8283,
		"DEPTH_COMPONENTS" _ 0x8284,
		"STENCIL_COMPONENTS" _ 0x8285,
		"COLOR_RENDERABLE" _ 0x8286,
		"DEPTH_RENDERABLE" _ 0x8287,
		"STENCIL_RENDERABLE" _ 0x8288,
		"FRAMEBUFFER_RENDERABLE" _ 0x8289,
		"FRAMEBUFFER_RENDERABLE_LAYERED" _ 0x828A,
		"FRAMEBUFFER_BLEND" _ 0x828B,
		"READ_PIXELS" _ 0x828C,
		"READ_PIXELS_FORMAT" _ 0x828D,
		"READ_PIXELS_TYPE" _ 0x828E,
		"TEXTURE_IMAGE_FORMAT" _ 0x828F,
		"TEXTURE_IMAGE_TYPE" _ 0x8290,
		"GET_TEXTURE_IMAGE_FORMAT" _ 0x8291,
		"GET_TEXTURE_IMAGE_TYPE" _ 0x8292,
		"MIPMAP" _ 0x8293,
		"MANUAL_GENERATE_MIPMAP" _ 0x8294,
		"AUTO_GENERATE_MIPMAP" _ 0x8295,
		"COLOR_ENCODING" _ 0x8296,
		"SRGB_READ" _ 0x8297,
		"SRGB_WRITE" _ 0x8298,
		"SRGB_DECODE_ARB" _ 0x8299,
		"FILTER" _ 0x829A,
		"VERTEX_TEXTURE" _ 0x829B,
		"TESS_CONTROL_TEXTURE" _ 0x829C,
		"TESS_EVALUATION_TEXTURE" _ 0x829D,
		"GEOMETRY_TEXTURE" _ 0x829E,
		"FRAGMENT_TEXTURE" _ 0x829F,
		"COMPUTE_TEXTURE" _ 0x82A0,
		"TEXTURE_SHADOW" _ 0x82A1,
		"TEXTURE_GATHER" _ 0x82A2,
		"TEXTURE_GATHER_SHADOW" _ 0x82A3,
		"SHADER_IMAGE_LOAD" _ 0x82A4,
		"SHADER_IMAGE_STORE" _ 0x82A5,
		"SHADER_IMAGE_ATOMIC" _ 0x82A6,
		"IMAGE_TEXEL_SIZE" _ 0x82A7,
		"IMAGE_COMPATIBILITY_CLASS" _ 0x82A8,
		"IMAGE_PIXEL_FORMAT" _ 0x82A9,
		"IMAGE_PIXEL_TYPE" _ 0x82AA,
		"SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST" _ 0x82AC,
		"SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST" _ 0x82AD,
		"SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE" _ 0x82AE,
		"SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE" _ 0x82AF,
		"TEXTURE_COMPRESSED_BLOCK_WIDTH" _ 0x82B1,
		"TEXTURE_COMPRESSED_BLOCK_HEIGHT" _ 0x82B2,
		"TEXTURE_COMPRESSED_BLOCK_SIZE" _ 0x82B3,
		"CLEAR_BUFFER" _ 0x82B4,
		"TEXTURE_VIEW" _ 0x82B5,
		"VIEW_COMPATIBILITY_CLASS" _ 0x82B6
	)

	IntConstant(
		"Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.",

		"FULL_SUPPORT" _ 0x82B7,
		"CAVEAT_SUPPORT" _ 0x82B8,
		"IMAGE_CLASS_4_X_32" _ 0x82B9,
		"IMAGE_CLASS_2_X_32" _ 0x82BA,
		"IMAGE_CLASS_1_X_32" _ 0x82BB,
		"IMAGE_CLASS_4_X_16" _ 0x82BC,
		"IMAGE_CLASS_2_X_16" _ 0x82BD,
		"IMAGE_CLASS_1_X_16" _ 0x82BE,
		"IMAGE_CLASS_4_X_8" _ 0x82BF,
		"IMAGE_CLASS_2_X_8" _ 0x82C0,
		"IMAGE_CLASS_1_X_8" _ 0x82C1,
		"IMAGE_CLASS_11_11_10" _ 0x82C2,
		"IMAGE_CLASS_10_10_10_2" _ 0x82C3,
		"VIEW_CLASS_128_BITS" _ 0x82C4,
		"VIEW_CLASS_96_BITS" _ 0x82C5,
		"VIEW_CLASS_64_BITS" _ 0x82C6,
		"VIEW_CLASS_48_BITS" _ 0x82C7,
		"VIEW_CLASS_32_BITS" _ 0x82C8,
		"VIEW_CLASS_24_BITS" _ 0x82C9,
		"VIEW_CLASS_16_BITS" _ 0x82CA,
		"VIEW_CLASS_8_BITS" _ 0x82CB,
		"VIEW_CLASS_S3TC_DXT1_RGB" _ 0x82CC,
		"VIEW_CLASS_S3TC_DXT1_RGBA" _ 0x82CD,
		"VIEW_CLASS_S3TC_DXT3_RGBA" _ 0x82CE,
		"VIEW_CLASS_S3TC_DXT5_RGBA" _ 0x82CF,
		"VIEW_CLASS_RGTC1_RED" _ 0x82D0,
		"VIEW_CLASS_RGTC2_RG" _ 0x82D1,
		"VIEW_CLASS_BPTC_UNORM" _ 0x82D2,
		"VIEW_CLASS_BPTC_FLOAT" _ 0x82D3
	)

	GLvoid(
		"GetInternalformati64v",
		"Retrieves information about implementation-dependent support for internal formats.",

		GLenum.IN(
			"target",
			"the usage of the internal format",
			"""
			GL11#TEXTURE_1D $TEXTURE_2D_TARGETS $TEXTURE_3D_TARGETS GL30#RENDERBUFFER GL31#TEXTURE_BUFFER GL32#TEXTURE_2D_MULTISAMPLE
			GL32#TEXTURE_2D_MULTISAMPLE_ARRAY
			"""
		),
		GLenum.IN("internalformat", "the internal format about which to retrieve information"),
		GLenum.IN("pname", "the type of information to query"),
		AutoSize("params") _ GLsizei.IN("bufSize", "the maximum number of values that may be written to params by the function"),
		returnValue _ GLint64_p.OUT("params", "a variable into which to write the retrieved information")
	)

	// ARB_invalidate_subdata

	GLvoid(
		"InvalidateTexSubImage",
		"Invalidates a region of a texture image.",

		GLuint.IN("texture", "the name of a texture object a subregion of which to invalidate"),
		GLint.IN("level", "the level of detail of the texture object within which the region resides"),
		GLint.IN("xoffset", "the X offset of the region to be invalidated"),
		GLint.IN("yoffset", "the Y offset of the region to be invalidated"),
		GLint.IN("zoffset", "the Z offset of the region to be invalidated"),
		GLsizei.IN("width", "the width of the region to be invalidated"),
		GLsizei.IN("height", "the height of the region to be invalidated"),
		GLsizei.IN("depth", "the depth of the region to be invalidated")
	)

	GLvoid(
		"InvalidateTexImage",
		"Invalidates the entirety of a texture image.",

		GLuint.IN("texture", "the name of a texture object to invalidate"),
		GLint.IN("level", "the level of detail of the texture object to invalidate")
	)

	GLvoid(
		"InvalidateBufferSubData",
		"Invalidates a region of a buffer object's data store.",

		GLuint.IN("buffer", "the name of a buffer object, a subrange of whose data store to invalidate"),
		GLintptr.IN("offset", "the offset within the buffer's data store of the start of the range to be invalidated"),
		GLsizeiptr.IN("length", "the length of the range within the buffer's data store to be invalidated")
	)

	GLvoid(
		"InvalidateBufferData",
		"Invalidates the content of a buffer object's data store.",

		GLuint.IN("buffer", "the name of a buffer object whose data store to invalidate")
	)

	GLvoid(
		"InvalidateFramebuffer",
		"Invalidate the content some or all of a framebuffer object's attachments.",

		GLenum.IN("target", "the target to which the framebuffer is attached", "GL30#FRAMEBUFFER GL30#DRAW_FRAMEBUFFER GL30#READ_FRAMEBUFFER"),
		AutoSize("attachments") _ GLsizei.IN("numAttachments", "the number of entries in the {@code attachments} array"),
		SingleValue("attachment") _ const _ GLenum_p.IN("attachments", "the address of an array identifying the attachments to be invalidated")
	)

	GLvoid(
		"InvalidateSubFramebuffer",
		"Invalidates the content of a region of some or all of a framebuffer object's attachments.",

		GLenum.IN("target", "the target to which the framebuffer is attached", "GL30#FRAMEBUFFER GL30#DRAW_FRAMEBUFFER GL30#READ_FRAMEBUFFER"),
		AutoSize("attachments") _ GLsizei.IN("numAttachments", "the number of entries in the {@code attachments} array"),
		SingleValue("attachment") _ const _ GLenum_p.IN("attachments", "an array identifying the attachments to be invalidated"),
		GLint.IN("x", "the X offset of the region to be invalidated"),
		GLint.IN("y", "the Y offset of the region to be invalidated"),
		GLsizei.IN("width", "the width of the region to be invalidated"),
		GLsizei.IN("height", "the height of the region to be invalidated")
	)

	// ARB_multi_draw_indirect

	GLvoid(
		"MultiDrawArraysIndirect",
		"""
		Renders multiple sets of primitives from array data, taking parameters from memory.

		The parameters addressed by {@code indirect} are packed into an array of structures, each element of which takes the form (in C):
		${codeBlock("""
typedef struct {
	uint count;
	uint primCount;
	uint first;
	uint baseInstance;
} DrawArraysIndirectCommand;
		""")}

		A single call to {@code glMultiDrawArraysIndirect} is equivalent, assuming no errors are generated to:
		${codeBlock("""
const ubyte *ptr = (const ubyte *)indirect;
for ( i = 0; i < primcount; i++ ) {
	DrawArraysIndirect(mode, (DrawArraysIndirectCommand*)ptr);
	if ( stride == 0 )
		ptr += sizeof(DrawArraysIndirectCommand);
	else
		ptr += stride;
}
		""")}
		""",

		GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
		Check(
			expression = "primcount * (stride == 0 ? (4 * 4) : stride)", bytes = true
		) _ MultiType(
			PointerMapping.DATA_INT
		) _ DRAW_INDIRECT_BUFFER _ const _ GLvoid_p.IN("indirect", "an array of structures containing the draw parameters"),
		GLsizei.IN("primcount", "the number of elements in the array of draw parameter structures"),
		GLsizei.IN("stride", "the distance in basic machine units between elements of the draw parameter array")
	)

	GLvoid(
		"MultiDrawElementsIndirect",
		"""
		Renders multiple indexed primitives from array data, taking parameters from memory.

		The parameters addressed by indirect are packed into a structure that takes the form (in C):
		${codeBlock("""
typedef struct {
	uint count;
	uint primCount;
	uint firstIndex;
	uint baseVertex;
	uint baseInstance;
} DrawElementsIndirectCommand;
		""")}

		A single call to {@code glMultiDrawElementsIndirect} is equivalent, assuming no errors are generated to:
		${codeBlock("""
const ubyte *ptr = (const ubyte *)indirect;
for ( i = 0; i < primcount; i++ ) {
	DrawElementsIndirect(mode, type, (DrawElementsIndirectCommand *)ptr);
	if ( stride == 0 )
		ptr += sizeof(DrawElementsIndirectCommand);
	else
		ptr += stride;
}
	""")}
		""",

		GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
		GLenum.IN("type", "the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding", "GL11#UNSIGNED_BYTE GL11#UNSIGNED_SHORT GL11#UNSIGNED_INT"),
		Check(
			expression = "primcount * (stride == 0 ? (5 * 4) : stride)", bytes = true
		) _ MultiType(
			PointerMapping.DATA_INT
		) _ DRAW_INDIRECT_BUFFER _ const _ GLvoid_p.IN("indirect", "a structure containing an array of draw parameters"),
		GLsizei.IN("primcount", "the number of elements in the array addressed by {@code indirect}"),
		GLsizei.IN("stride", "the distance in basic machine units between elements of the draw parameter array")
	)

	// ARB_program_interface_query

	val ProgramInterfaces = IntConstant(
		"""
		Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv,
		GetProgramResourceLocation, and GetProgramResourceLocationIndex.
		""",

		"UNIFORM" _ 0x92E1,
		"UNIFORM_BLOCK" _ 0x92E2,
		"PROGRAM_INPUT" _ 0x92E3,
		"PROGRAM_OUTPUT" _ 0x92E4,
		"BUFFER_VARIABLE" _ 0x92E5,
		"SHADER_STORAGE_BLOCK" _ 0x92E6,
		"VERTEX_SUBROUTINE" _ 0x92E8,
		"TESS_CONTROL_SUBROUTINE" _ 0x92E9,
		"TESS_EVALUATION_SUBROUTINE" _ 0x92EA,
		"GEOMETRY_SUBROUTINE" _ 0x92EB,
		"FRAGMENT_SUBROUTINE" _ 0x92EC,
		"COMPUTE_SUBROUTINE" _ 0x92ED,
		"VERTEX_SUBROUTINE_UNIFORM" _ 0x92EE,
		"TESS_CONTROL_SUBROUTINE_UNIFORM" _ 0x92EF,
		"TESS_EVALUATION_SUBROUTINE_UNIFORM" _ 0x92F0,
		"GEOMETRY_SUBROUTINE_UNIFORM" _ 0x92F1,
		"FRAGMENT_SUBROUTINE_UNIFORM" _ 0x92F2,
		"COMPUTE_SUBROUTINE_UNIFORM" _ 0x92F3,
		"TRANSFORM_FEEDBACK_VARYING" _ 0x92F4
	).javaDocLinks + " GL42#ATOMIC_COUNTER_BUFFER"

	val ProgramInterfaceParameters = IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramInterfaceiv.",

		"ACTIVE_RESOURCES" _ 0x92F5,
		"MAX_NAME_LENGTH" _ 0x92F6,
		"MAX_NUM_ACTIVE_VARIABLES" _ 0x92F7,
		"MAX_NUM_COMPATIBLE_SUBROUTINES" _ 0x92F8
	).javaDocLinks

	IntConstant(
		"Accepted in the {@code props} array of GetProgramResourceiv.",

		"NAME_LENGTH" _ 0x92F9,
		"TYPE" _ 0x92FA,
		"ARRAY_SIZE" _ 0x92FB,
		"OFFSET" _ 0x92FC,
		"BLOCK_INDEX" _ 0x92FD,
		"ARRAY_STRIDE" _ 0x92FE,
		"MATRIX_STRIDE" _ 0x92FF,
		"IS_ROW_MAJOR" _ 0x9300,
		"ATOMIC_COUNTER_BUFFER_INDEX" _ 0x9301,
		"BUFFER_BINDING" _ 0x9302,
		"BUFFER_DATA_SIZE" _ 0x9303,
		"NUM_ACTIVE_VARIABLES" _ 0x9304,
		"ACTIVE_VARIABLES" _ 0x9305,
		"REFERENCED_BY_VERTEX_SHADER" _ 0x9306,
		"REFERENCED_BY_TESS_CONTROL_SHADER" _ 0x9307,
		"REFERENCED_BY_TESS_EVALUATION_SHADER" _ 0x9308,
		"REFERENCED_BY_GEOMETRY_SHADER" _ 0x9309,
		"REFERENCED_BY_FRAGMENT_SHADER" _ 0x930A,
		"REFERENCED_BY_COMPUTE_SHADER" _ 0x930B,
		"TOP_LEVEL_ARRAY_SIZE" _ 0x930C,
		"TOP_LEVEL_ARRAY_STRIDE" _ 0x930D,
		"LOCATION" _ 0x930E,
		"LOCATION_INDEX" _ 0x930F,
		"IS_PER_PATCH" _ 0x92E7
	)

	GLvoid(
		"GetProgramInterfaceiv",
		"Queries a property of an interface in a program.",

		GLuint.IN("program", "the name of a program object whose interface to query"),
		GLenum.IN("programInterface", "a token identifying the interface within {@code program} to query", ProgramInterfaces),
		GLenum.IN("pname", "the name of the parameter within {@code programInterface} to query", ProgramInterfaceParameters),
		Check(1) _ returnValue _ GLint_p.OUT("params", "a variable to retrieve the value of {@code pname} for the program interface")
	)

	GLuint(
		"GetProgramResourceIndex",
		"Queries the index of a named resource within a program.",

		GLuint.IN("program", "the name of a program object whose resources to query"),
		GLenum.IN("programInterface", "a token identifying the interface within {@code program} containing the resource named {Wcode name}", ProgramInterfaces),
		const _ GLcharUTF8_p.IN("name", "the name of the resource to query the index of")
	)

	GLvoid(
		"GetProgramResourceName",
		"Queries the name of an indexed resource within a program.",

		GLuint.IN("program", "the name of a program object whose resources to query"),
		GLenum.IN("programInterface", "a token identifying the interface within {@code program} containing the indexed resource", ProgramInterfaces),
		GLuint.IN("index", "the index of the resource within {@code programInterface} of {@code program}"),
		AutoSize("name") _ GLsizei.IN("bufSize", "the size of the character array whose address is given by {@code name}"),
		Check(1) _ nullable _ GLsizei_p.OUT("length", "a variable which will receive the length of the resource name"),
		Return("length", "glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH)") _ GLcharASCII_p.OUT(
			"name",
			"a character array into which will be written the name of the resource"
		)
	)

	GLvoid(
		"GetProgramResourceiv",
		"Retrieves values for multiple properties of a single active resource within a program object.",

		GLuint.IN("program", "the name of a program object whose resources to query"),
		GLenum.IN("programInterface", "a token identifying the interface within {@code program} containing the resource named {@code name}.", ProgramInterfaces),
		GLuint.IN("index", "the active resource index"),
		AutoSize("props") _ GLsizei.IN("propCount", "the number of properties in {@code props}"),
		const _ GLenum_p.IN("props", "an array that will receive the active resource properties"),
		AutoSize("params") _ GLsizei.IN("bufSize", "the size of the integer array whose address is given by {@code params}"),
		Check(1) _ nullable _ GLsizei_p.OUT("length", "a variable which will receive the number of values returned"),
		Return("length") _ GLint_p.OUT("params", "an array that will receive the property values")
	)

	GLint(
		"GetProgramResourceLocation",
		"Queries the location of a named resource within a program.",

		GLuint.IN("program", "the name of a program object whose resources to query"),
		GLenum.IN("programInterface", "a token identifying the interface within {@code program} containing the resource named {@code name}"),
		const _ GLcharASCII_p.IN("name", "the name of the resource to query the location of")
	)

	GLint(
		"GetProgramResourceLocationIndex",
		"Queries the fragment color index of a named variable within a program.",

		GLuint.IN("program", "the name of a program object whose resources to query"),
		GLenum.IN(
			"programInterface",
			"a token identifying the interface within {@code program} containing the resource named {@code name}.",
			"#PROGRAM_OUTPUT"
		),
		const _ GLcharASCII_p.IN("name", "the name of the resource to query the location of")
	)

	// ARB_shader_storage_buffer_object

	IntConstant(
		"Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

		"SHADER_STORAGE_BUFFER" _ 0x90D2
	)

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of GetIntegerv, GetIntegeri_v, GetBooleanv, GetInteger64v, GetFloatv, GetDoublev, GetBooleani_v, GetIntegeri_v,
		GetFloati_v, GetDoublei_v, and GetInteger64i_v.
		""",

		"SHADER_STORAGE_BUFFER_BINDING" _ 0x90D3
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.",

		"SHADER_STORAGE_BUFFER_START" _ 0x90D4,
		"SHADER_STORAGE_BUFFER_SIZE" _ 0x90D5
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.",

		"MAX_VERTEX_SHADER_STORAGE_BLOCKS" _ 0x90D6,
		"MAX_GEOMETRY_SHADER_STORAGE_BLOCKS" _ 0x90D7,
		"MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS" _ 0x90D8,
		"MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS" _ 0x90D9,
		"MAX_FRAGMENT_SHADER_STORAGE_BLOCKS" _ 0x90DA,
		"MAX_COMPUTE_SHADER_STORAGE_BLOCKS" _ 0x90DB,
		"MAX_COMBINED_SHADER_STORAGE_BLOCKS" _ 0x90DC,
		"MAX_SHADER_STORAGE_BUFFER_BINDINGS" _ 0x90DD,
		"MAX_SHADER_STORAGE_BLOCK_SIZE" _ 0x90DE,
		"SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT" _ 0x90DF
	)

	IntConstant(
		"Accepted in the {@code barriers} bitfield in glMemoryBarrier.",

		"SHADER_STORAGE_BARRIER_BIT" _ 0x2000
	)

	IntConstant(
		"Alias for the existing token MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS.",

		"MAX_COMBINED_SHADER_OUTPUT_RESOURCES" _ 0x8F39
	)

	GLvoid(
		"ShaderStorageBlockBinding",
		"Changes an active shader storage block binding.",

		GLuint.IN("program", "the name of the program containing the block whose binding to change"),
		GLuint.IN("storageBlockIndex", "the index storage block within the program"),
		GLuint.IN("storageBlockBinding", "the index storage block binding to associate with the specified storage block")
	)

	// ARB_stencil_texturing

	IntConstant(
		"Accepted by the {@code pname} parameter of TexParameter* and GetTexParameter*.",

		"DEPTH_STENCIL_TEXTURE_MODE" _ 0x90EA
	)

	// ARB_texture_buffer_range

	IntConstant(
		"Accepted by the {@code pname} parameter of GetTexLevelParameter.",

		"TEXTURE_BUFFER_OFFSET" _ 0x919D,
		"TEXTURE_BUFFER_SIZE" _ 0x919E
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"TEXTURE_BUFFER_OFFSET_ALIGNMENT" _ 0x919F
	)

	GLvoid(
		"TexBufferRange",
		"Binds a range of a buffer's data store to a buffer texture.",

		GLenum.IN("target", "the target of the operation", "GL31#TEXTURE_BUFFER"),
		GLenum.IN("internalformat", "the internal format of the data in the store belonging to {@code buffer}"),
		GLuint.IN("buffer", "the name of the buffer object whose storage to attach to the active buffer texture"),
		GLintptr.IN("offset", "the offset of the start of the range of the buffer's data store to attach"),
		GLsizeiptr.IN("size", "the size of the range of the buffer's data store to attach")
	)

	// ARB_texture_storage_multisample

	GLvoid(
		"TexStorage2DMultisample",
		"Specifies storage for a two-dimensional multisample texture.",

		GLenum.IN("target", "the target of the operation", "GL32#TEXTURE_2D_MULTISAMPLE GL32#PROXY_TEXTURE_2D_MULTISAMPLE"),
		GLsizei.IN("samples", "the number of samples in the texture"),
		GLenum.IN("internalformat", "the sized internal format to be used to store texture image data"),
		GLsizei.IN("width", "the width of the texture, in texels"),
		GLsizei.IN("height", "the height of the texture, in texels"),
		GLboolean.IN(
			"fixedsamplelocations",
			"""
			whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
			depend on the internal format or size of the image
			"""
		)
	)

	GLvoid(
		"TexStorage3DMultisample",
		"Specifies storage for a two-dimensional multisample array texture.",

		GLenum.IN("target", "the target of the operation", "GL32#TEXTURE_2D_MULTISAMPLE_ARRAY GL32#PROXY_TEXTURE_2D_MULTISAMPLE"),
		GLsizei.IN("samples", "the number of samples in the texture"),
		GLenum.IN("internalformat", "the sized internal format to be used to store texture image data"),
		GLsizei.IN("width", "the width of the texture, in texels"),
		GLsizei.IN("height", "the height of the texture, in texels"),
		GLsizei.IN("depth", "the depth of the texture, in texels"),
		GLboolean.IN(
			"fixedsamplelocations",
			"""
			whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
			depend on the internal format or size of the image
			"""
		)
	)

	// ARB_texture_view

	IntConstant(
		"Accepted by the {@code pname} parameters of GetTexParameterfv and  GetTexParameteriv.",

		"TEXTURE_VIEW_MIN_LEVEL" _ 0x82DB,
		"TEXTURE_VIEW_NUM_LEVELS" _ 0x82DC,
		"TEXTURE_VIEW_MIN_LAYER" _ 0x82DD,
		"TEXTURE_VIEW_NUM_LAYERS" _ 0x82DE
	)

	GLvoid(
		"TextureView",
		"Initializes a texture as a data alias of another texture's data store.",

		GLuint.IN("texture", "the texture object to be initialized as a view"),
		GLenum.IN("target", "the target to be used for the newly initialized texture"),
		GLuint.IN("origtexture", "the name of a texture object of which to make a view"),
		GLenum.IN("internalformat", "the internal format for the newly created view"),
		GLuint.IN("minlevel", "the  lowest level of detail of the view"),
		GLuint.IN("numlevels", "the number of levels of detail to include in the view"),
		GLuint.IN("minlayer", "the index of the first layer to include in the view"),
		GLuint.IN("numlayers", "the number of layers to include in the view")
	)

	// ARB_vertex_attrib_binding

	IntConstant(
		"Accepted by the {@code pname} parameter of GetVertexAttrib*v.",

		"VERTEX_ATTRIB_BINDING" _ 0x82D4,
		"VERTEX_ATTRIB_RELATIVE_OFFSET" _ 0x82D5
	)

	IntConstant(
		"Accepted by the {@code target} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v.",

		"VERTEX_BINDING_DIVISOR" _ 0x82D6,
		"VERTEX_BINDING_OFFSET" _ 0x82D7,
		"VERTEX_BINDING_STRIDE" _ 0x82D8,
		"VERTEX_BINDING_BUFFER" _ 0x8F4F
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegerv, ....",

		"MAX_VERTEX_ATTRIB_RELATIVE_OFFSET" _ 0x82D9,
		"MAX_VERTEX_ATTRIB_BINDINGS" _ 0x82DA
	)

	GLvoid(
		"BindVertexBuffer",
		"Binds a buffer to a vertex buffer bind point.",

		GLuint.IN("bindingindex", "the index of the vertex buffer binding point to which to bind the buffer"),
		GLuint.IN("buffer", "the name of an existing buffer to bind to the vertex buffer binding point"),
		GLintptr.IN("offset", "the offset of the first element of the buffer"),
		GLsizei.IN("stride", "the distance between elements within the buffer")
	)

	GLvoid(
		"VertexAttribFormat",
		"Specifies the organization of data in vertex arrays.",

		GLuint.IN("attribindex", "the generic vertex attribute array being described"),
		GLint.IN("size", "the number of values per vertex that are stored in the array", "1 2 3 4 GL12#BGRA"),
		GLenum.IN("type", "the type of the data stored in the array"),
		GLboolean.IN(
			"normalized",
			"""
			if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is
			directly converted to floating point.
			"""
		),
		GLuint.IN(
			"relativeoffset",
			"the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from"
		)
	)

	GLvoid(
		"VertexAttribIFormat",
		"Specifies the organization of pure integer data in vertex arrays.",

		GLuint.IN("attribindex", "the generic vertex attribute array being described"),
		GLint.IN("size", "the number of values per vertex that are stored in the array", "1 2 3 4 GL12#BGRA"),
		GLenum.IN("type", "the type of the data stored in the array"),
		GLuint.IN(
			"relativeoffset",
			"the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from"
		)
	)

	GLvoid(
		"VertexAttribLFormat",
		"Specifies the organization of 64-bit double data in vertex arrays.",

		GLuint.IN("attribindex", "the generic vertex attribute array being described"),
		GLint.IN("size", "the number of values per vertex that are stored in the array", "1 2 3 4 GL12#BGRA"),
		GLenum.IN("type", "the type of the data stored in the array"),
		GLuint.IN(
			"relativeoffset",
			"the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from"
		)
	)

	GLvoid(
		"VertexAttribBinding",
		"Associate a vertex attribute and a vertex buffer binding.",

		GLuint.IN("attribindex", "the index of the attribute to associate with a vertex buffer binding"),
		GLuint.IN("bindingindex", "the index of the vertex buffer binding with which to associate the generic vertex attribute")
	)

	GLvoid(
		"VertexBindingDivisor",
		"Modifies the rate at which generic vertex attributes advance during instanced rendering.",

		GLuint.IN("bindingindex", "the index of the generic vertex attribute"),
		GLuint.IN("divisor", "the number of instances that will pass between updates of the generic attribute at slot {@code index}")
	)

}
