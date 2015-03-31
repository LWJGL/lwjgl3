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
		"",

		GLsizei.IN("n", ""),
		GLuint_p.OUT("states", "")
	)
	
	GLvoid.func(
	  "DeleteStatesNV",
	  "",
	  
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
    "",
    
    GLuint.IN("state", ""),
    GLenum.IN("mode", "")
	)
	
	GLuint.func(
	  "GetCommandHeaderNV",
	  "",
	  
	  GLenum.IN("tokenID", ""),
	  GLuint.IN("size", "")
	)
	
	GLushort.func(
    "GetStageIndexNV",
    "",
    
    GLenum.IN("shadertype", "")
	)
	
	GLvoid.func(
	  "DrawCommandsNV",
	  "",
	  
	  GLenum.IN("primitiveMode", ""),
	  GLuint.IN("buffer", ""),
	  const _ GLintptr_p.IN("indirects", ""),
	  const _ GLsizei_p.IN("sizes", ""),
	  GLuint.IN("count", "")
	)
	
	GLvoid.func(
	  "DrawCommandsAddressNV",
	  "",
	  
	  GLenum.IN("primitiveMode", ""),
	  const _ GLuint64_p.IN("indirects", ""),
	  const _ GLsizei_p.IN("sizes", ""),
	  GLuint.IN("count", "")
	)
	
	GLvoid.func(
	  "DrawCommandsStatesNV",
	  "",
	  
	  GLuint.IN("buffer", ""),
	  const _ GLintptr_p.IN("indirects", ""),
	  const _ GLsizei_p.IN("sizes", ""),
	  const _ GLuint_p.IN("states", ""),
	  const _ GLuint_p.IN("fbos", ""),
	  GLuint.IN("count", "")
	)
	
	GLvoid.func(
	  "DrawCommandsStatesAddressNV",
	  "",
	  
	  const _ GLuint64_p.IN("indirects", ""),
	  const _ GLsizei_p.IN("sizes", ""),
	  const _ GLuint_p.IN("states", ""),
	  const _ GLuint_p.IN("fbos", ""),
	  GLuint.IN("count", "")
	)
	
	GLvoid.func(
	  "CreateCommandListsNV",
	  "",
	  
	  GLsizei.IN("n", ""),
	  GLuint_p.OUT("lists", "")
	)

  GLvoid.func(
    "DeleteCommandListsNV",
    "",
    
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
    "",
    
    GLuint.IN("list", ""),
    GLuint.IN("segment", ""),
    const _ GLvoid_pp.IN("indirects", ""),
    const _ sizet_p.IN("sizes", ""),
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
    "",
    
    GLuint.IN("list", "")
  )

  GLvoid.func(
    "CallCommandListNV",
    "",
    
    GLuint.IN("list", "")
  )
}