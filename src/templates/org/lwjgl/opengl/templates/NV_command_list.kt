/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_command_list = "NVCommandList".nativeClassGL("NV_command_list", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds a few new features designed to provide very low 
    overhead batching and replay of rendering commands and state changes:

    - A state object, which stores a pre-validated representation of the
      the state of (almost) the entire pipeline.

    - A more flexible and extensible MultiDrawIndirect (MDI) type of mechanism, using
      a token-based command stream, allowing to setup binding state and emit draw calls.

    - A set of functions to execute a list of the token-based command streams with state object
      changes interleaved with the streams.

    - Command lists enabling compilation and reuse of sequences of command
      streams and state object changes.

    Because state objects reflect the state of the entire pipeline, it is 
    expected that they can be pre-validated and executed efficiently. It is 
    also expected that when state objects are combined into a command list,
    the command list can diff consecutive state objects to produce a reduced/
    optimized set of state changes specific to that transition.

    The token-based command stream can also be stored in regular buffer objects
    and therefore be modified by the server itself. This allows more 
    complex work creation than the original MDI approach, which was limited
    to emitting draw calls only.
		"""

	IntConstant.block(
		"Used in DrawCommandsStates buffer formats, in GetCommandHeaderNV to return the header.",

		"TERMINATE_SEQUENCE_COMMAND_NV" _ 0x0000,
		"NOP_COMMAND_NV" _ 0x0001,
		"DRAW_ELEMENTS_COMMAND_NV" _ 0x0002,
		"DRAW_ARRAYS_COMMAND_NV" _ 0x0003,
		"DRAW_ELEMENTS_STRIP_COMMAND_NV" _ 0x0004,
		"DRAW_ARRAYS_STRIP_COMMAND_NV" _ 0x0005,
		"DRAW_ELEMENTS_INSTANCED_COMMAND_NV" _ 0x0006,
		"DRAW_ARRAYS_INSTANCED_COMMAND_NV" _ 0x0007,
		"ELEMENT_ADDRESS_COMMAND_NV" _ 0x0008,
		"ATTRIBUTE_ADDRESS_COMMAND_NV" _ 0x0009,
		"UNIFORM_ADDRESS_COMMAND_NV" _ 0x000a,
		"BLEND_COLOR_COMMAND_NV" _ 0x000b,
		"STENCIL_REF_COMMAND_NV" _ 0x000c,
		"LINE_WIDTH_COMMAND_NV" _ 0x000d,
		"POLYGON_OFFSET_COMMAND_NV" _ 0x000e,
		"ALPHA_REF_COMMAND_NV" _ 0x000f,
		"VIEWPORT_COMMAND_NV" _ 0x0010,
		"SCISSOR_COMMAND_NV" _ 0x0011,
		"FRONT_FACE_COMMAND_NV" _ 0x0012
	)

	GLvoid.func(
		"CreateStatesNV",
		"""
		Returns <code>n</code> previously unused state object names in <code>states</code>, and creates
		a state object in the initial state for each name.
		""",

	GLsizei.IN("n", ""),
		GLuint_p.OUT("states", "")
	)
	
	GLvoid.func(
		"DeleteStatesNV",
		"""
		Deletes <code>n</code> names of state objects given by <code>states</code>. Once a state
		object is deleted it has no contents and its name is again unused. Unused 
		names in <code>states</code> are silently ignored, as is the value zero.
		""",

		GLsizei.IN("n", ""),
		const _ GLuint_p.IN("states", "")
	)
	
	GLboolean.func(
		"IsStateNV",
		"",

		GLuint.IN("state", "")
	)
	
	GLvoid.func(
		"StateCaptureNV",
		"""
		Captures the current state of the rendering pipeline into the object 
		indicated by <code>state</code>. <code>basicmode</code> indicates the basic Begin mode that this
		state object must be used with.
		""",

		GLuint.IN("state", ""),
		GLenum.IN("mode", "")
	)
	
	GLuint.func(
		"GetCommandHeaderNV",
		"""
		Returns the encoded 32bit header value for a given command; the returned value is implementation specific.
		The <code>size</code> is only provided as basic consistency check, since the size of each 
		structure is fixed and no padding is allowed. The value is the sum of the 
		header and the command specific structure.
		""",

		GLenum.IN("tokenID", ""),
		GLuint.IN("size", "")
	)
	
	GLushort.func(
		"GetStageIndexNV",
		"""
		Returns the 16bit value for a specific shader stage; the returned value
		is implementation specific. The value is to be used with the stage field
		within <code>UniformAddressCommandNV</code> tokens.
		""",

		GLenum.IN("shadertype", "")
	)
	
	GLvoid.func(
		"DrawCommandsNV",
		"""
		Accepts arrays of buffer addresses as an array of 
		offsets <code>indirects</code> into a buffer named by <code>buffer</code>, an array of command lengths in <code>sizes</code>. 
		All arrays have <code>count</code> entries.
		""",

		GLenum.IN("primitiveMode", ""),
		GLuint.IN("buffer", ""),
		const _ GLintptr_p.IN("indirects", ""),
		const _ GLsizei_p.IN("sizes", ""),
		GLuint.IN("count", "")
	)
	
	GLvoid.func(
		"DrawCommandsAddressNV",
		"""
		Accepts arrays of buffer addresses as an array of GPU 
		addresses <code>indirects</code>, an array of command lengths in <code>sizes</code>. 
		All arrays have <code>count</code> entries.
		""",

		GLenum.IN("primitiveMode", ""),
		const _ GLuint64_p.IN("indirects", ""),
		const _ GLsizei_p.IN("sizes", ""),
		GLuint.IN("count", "")
	)
	
	GLvoid.func(
		"DrawCommandsStatesNV",
		"""
		Accepts arrays of buffer addresses as an array of 
		offsets <code>indirects</code> into a buffer named by <code>buffer</code>,
		an array of command lengths in <code>sizes</code>, and an 
		array of state object names in <code>states</code>, of which all names must be non-zero.
		Frame buffer object names are stored in <code>fbos</code> and can
		be either zero or non-zero. All arrays have <code>count</code> entries.
		The residency of textures used as attachment inside the state object's 
		captured fbo or the passed fbo must managed explicitly. 
		""",

		GLuint.IN("buffer", ""),
		const _ GLintptr_p.IN("indirects", ""),
		const _ GLsizei_p.IN("sizes", ""),
		const _ GLuint_p.IN("states", ""),
		const _ GLuint_p.IN("fbos", ""),
		GLuint.IN("count", "")
	)
	
	GLvoid.func(
		"DrawCommandsStatesAddressNV",
		"""
		Accepts arrays of buffer addresses as an array of GPU addresses <code>indirects</code>,
		an array of command lengths in <code>sizes</code>, and an 
		array of state object names in <code>states</code>, of which all names must be non-zero.
		Frame buffer object names are stored in <code>fbos</code> and can
		be either zero or non-zero. All arrays have <code>count</code> entries.
		The residency of textures used as attachment inside the state object's 
		captured fbo or the passed fbo must managed explicitly. 
		""",

		const _ GLuint64_p.IN("indirects", ""),
		const _ GLsizei_p.IN("sizes", ""),
		const _ GLuint_p.IN("states", ""),
		const _ GLuint_p.IN("fbos", ""),
		GLuint.IN("count", "")
	)
	
	GLvoid.func(
		"CreateCommandListsNV",
		"""
		Returns <code>n</code> previously unused command list names in <code>lists</code>, and creates
		a command list in the initial state for each name.
		""",

		GLsizei.IN("n", ""),
		GLuint_p.OUT("lists", "")
	)

	GLvoid.func(
		"DeleteCommandListsNV",
		"""
		Deletes <code>n</code> command lists stored in <code>lists</code>. Once a command
		list is deleted it has no contents and its name is again unused. Unused 
		names in <code>lists</code> are silently ignored, as is the value zero.
		""",

		GLsizei.IN("n", ""),
		const _ GLuint_p.IN("lists", "")
	)
  
	GLboolean.func(
		"IsCommandListNV",
		"",

		GLuint.IN("list", "")
	)
  
	GLvoid.func(
		"ListDrawCommandsStatesClientNV",
		"""
		Enqueues the equivalent of the DrawCommandsStatesClientNV 
		commands into the list indicated by <code>list</code> on the segment indicated by <code>segment</code>.
		""",

		GLuint.IN("list", ""),
		GLuint.IN("segment", ""),
		const _ GLvoid_pp.IN("indirects", ""),
		const _ size_t_p.IN("sizes", ""),
		const _ GLuint_p.IN("states", ""),
		const _ GLuint_p.IN("fbos", ""),
		GLuint.IN("count", "")
	)

	GLvoid.func(
		"CommandListSegmentsNV",
		"",

		GLuint.IN("list", ""),
		GLuint.IN("segments", "")
	)

	GLvoid.func(
		"CompileCommandListNV",
		"""
		Makes the list indicated by <code>list</code> switch from allowing collection of 
		commands to allowing its execution. At this time, the implementation may
		generate optimized commands to transition between states as efficiently
		as possible.
		""",

		GLuint.IN("list", "")
	)

	GLvoid.func(
		"CallCommandListNV",
		"""
		Executes the command list indicated by <code>list</code>, which operates as if
		the DrawCommandsStates* commands were replayed in the order they were 
		enqueued on each segment, starting from segment zero and proceeding to the 
		maximum segment. All buffer or texture resources' residency must be 
		managed explicitly, including texture attachments of the effective 
		fbos during list enqueuing.
		""",

		GLuint.IN("list", "")
	)
}
