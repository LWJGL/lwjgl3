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

		This extension adds a few new features designed to provide very low overhead batching and replay of rendering commands and state changes:
		${ul(
			"A state object, which stores a pre-validated representation of the the state of (almost) the entire pipeline.",
		    """
		    A more flexible and extensible MultiDrawIndirect (MDI) type of mechanism, using a token-based command stream, allowing to setup binding state and
		    emit draw calls.
		    """,
		    "A set of functions to execute a list of the token-based command streams with state object changes interleaved with the streams.",
		    "Command lists enabling compilation and reuse of sequences of command streams and state object changes."
		)}

		Because state objects reflect the state of the entire pipeline, it is expected that they can be pre-validated and executed efficiently. It is also
		expected that when state objects are combined into a command list, the command list can diff consecutive state objects to produce a reduced/ optimized
		set of state changes specific to that transition.

		The token-based command stream can also be stored in regular buffer objects and therefore be modified by the server itself. This allows more complex
		work creation than the original MDI approach, which was limited to emitting draw calls only.

		<h3>Command structures</h3>
		${codeBlock("""
typedef struct {
  uint  header;
} TerminateSequenceCommandNV;

typedef struct {
  uint  header;
} NOPCommandNV;

typedef  struct {
  uint  header;
  uint  count;
  uint  firstIndex;
  uint  baseVertex;
} DrawElementsCommandNV;

typedef  struct {
  uint  header;
  uint  count;
  uint  first;
} DrawArraysCommandNV;

typedef  struct {
  uint  header;
  uint  mode;
  uint  count;
  uint  instanceCount;
  uint  firstIndex;
  uint  baseVertex;
  uint  baseInstance;
} DrawElementsInstancedCommandNV;

typedef  struct {
  uint  header;
  uint  mode;
  uint  count;
  uint  instanceCount;
  uint  first;
  uint  baseInstance;
} DrawArraysInstancedCommandNV;

typedef struct {
  uint  header;
  uint  addressLo;
  uint  addressHi;
  uint  typeSizeInByte;
} ElementAddressCommandNV;

typedef struct {
  uint  header;
  uint  index;
  uint  addressLo;
  uint  addressHi;
} AttributeAddressCommandNV;

typedef struct {
  uint    header;
  ushort  index;
  ushort  stage;
  uint    addressLo;
  uint    addressHi;
} UniformAddressCommandNV;

typedef struct {
  uint  header;
  float red;
  float green;
  float blue;
  float alpha;
} BlendColorCommandNV;

typedef struct {
  uint  header;
  uint  frontStencilRef;
  uint  backStencilRef;
} StencilRefCommandNV;

typedef struct {
  uint  header;
  float lineWidth;
} LineWidthCommandNV;

typedef struct {
  uint  header;
  float scale;
  float bias;
} PolygonOffsetCommandNV;

typedef struct {
  uint  header;
  float alphaRef;
} AlphaRefCommandNV;

typedef struct {
  uint  header;
  uint  x;
  uint  y;
  uint  width;
  uint  height;
} ViewportCommandNV; // only ViewportIndex 0

typedef struct {
  uint  header;
  uint  x;
  uint  y;
  uint  width;
  uint  height;
} ScissorCommandNV; // only ViewportIndex 0

typedef struct {
  uint  header;
  uint  frontFace; // 0 for CW, 1 for CCW
} FrontFaceCommandNV;"""
		)}

		Tight packing is used for all structures.
		"""

	val Commands = IntConstant(
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
	).javaDocLinks

	GLvoid(
		"CreateStatesNV",
		"Returns <code>n</code> previously unused state object names in <code>states</code>, and creates a state object in the initial state for each name.",

		AutoSize("states") _ GLsizei.IN("n", "the number of state object names to create"),
		returnValue _ GLuint_p.OUT("states", "the buffer in which to write the created state object names")
	)
	
	GLvoid(
		"DeleteStatesNV",
		"""
		Deletes <code>n</code> names of state objects given by <code>states</code>. Once a state object is deleted it has no contents and its name is again
		unused. Unused names in <code>states</code> are silently ignored, as is the value zero.
		""",

		AutoSize("states") _ GLsizei.IN("n", "the number of state object names to delete"),
		SingleValue("state") _ const _ GLuint_p.IN("states", "the buffer from which to read the state object names to delete")
	)
	
	GLboolean(
		"IsStateNV",
		"Returns true if the specified name corresponds to a state object.",

		GLuint.IN("state", "the object name to test")
	)
	
	GLvoid(
		"StateCaptureNV",
		"""
		Captures the current state of the rendering pipeline into the object indicated by <code>state</code>.

		The captured rendering state includes:
		${ul(
			"""
			Vertex attribute enable state, formats, types, relative offsets and strides, but not bound vertex buffers or vertex unified addresses, nor their
			offsets, nor bound index buffers/addresses.
			""",
		    "Primitive state such as primitive restart and patch parameters, provoking vertex.",
		    "Immediate vertex attribute values as provided by glVertexAttrib* or glVertexAttribI*",
		    """
		    All active program binaries except compute (either from the active program pipeline or from UseProgram) with their current subroutine configuration
		    excluding all default-block uniform values.
		    """,
		    "Rasterization, multisample fragment operation, depth, stencil, and blending state.",
		    "Rasterization state such as line widths, stippling, polygon modes and offsets.",
		    "Viewport, scissor, and depth range state.",
		    """
		    Framebuffer attachment configuration: attachment state including attachment formats, drawbuffer state, and target/layer information, but not
		    including actual attachments or sizes of attachments (these are stored separately).
		    """,
		    "Framebuffer attachment textures (but not residency state)."
		)}
		""",

		GLuint.IN("state", "the state object into which to capture the current rendering state"),
		GLenum.IN(
			"mode",
			"the basic Begin mode that this state object must be used with",
			"GL11#POINTS GL11#LINES GL11#TRIANGLES GL11#QUADS GL32#LINES_ADJACENCY GL32#TRIANGLES_ADJACENCY GL40#PATCHES"
		)
	)
	
	GLuint(
		"GetCommandHeaderNV",
		"Returns the encoded 32bit header value for a given command; the returned value is implementation specific.",

		GLenum.IN("tokenID", "the command to query", Commands),
		GLuint.IN(
			"size",
			"""
			provided as basic consistency check, since the size of each structure is fixed and no padding is allowed. The value is the sum of the header and
			the command specific structure.
			"""
		)
	)
	
	GLushort(
		"GetStageIndexNV",
		"""
		Returns the 16bit value for a specific shader stage; the returned value is implementation specific. The value is to be used with the stage field within
		<code>UniformAddressCommandNV</code> tokens.
		""",

		GLenum.IN("shadertype", "the shader stage type")
	)
	
	GLvoid(
		"DrawCommandsNV",
		"""
		Accepts arrays of buffer addresses as an array of offsets <code>indirects</code> into a buffer named by <code>buffer</code>, an array of command
		lengths in <code>sizes</code>. All arrays have <code>count</code> entries.
		""",

		GLenum.IN("primitiveMode", "the primitive mode"),
		GLuint.IN("buffer", "the buffer object name"),
		const _ GLintptr_p.IN("indirects", "the array of offsets into the buffer"),
		const _ GLsizei_p.IN("sizes", "the array of command lengths"),
		AutoSize("indirects", "sizes") _ GLuint.IN("count", "the number of commands")
	)
	
	GLvoid(
		"DrawCommandsAddressNV",
		"""
		Accepts arrays of buffer addresses as an array of GPU addresses <code>indirects</code>, an array of command lengths in <code>sizes</code>. All arrays
		have <code>count</code> entries.
		""",

		GLenum.IN("primitiveMode", "the primitive mode"),
		const _ GLuint64_p.IN("indirects", "the array of GPU addreses"),
		const _ GLsizei_p.IN("sizes", "the array of command lengths"),
		AutoSize("indirects", "sizes") _ GLuint.IN("count", "the number of commands")
	)
	
	GLvoid(
		"DrawCommandsStatesNV",
		"""
		Accepts arrays of buffer addresses as an array of offsets <code>indirects</code> into a buffer named by <code>buffer</code>, an array of command
		lengths in <code>sizes</code>, and an array of state object names in <code>states</code>, of which all names must be non-zero. Frame buffer object
		names are stored in <code>fbos</code> and can be either zero or non-zero. All arrays have <code>count</code> entries. The residency of textures used as
		attachment inside the state object's captured fbo or the passed fbo must managed explicitly.
		""",

		GLuint.IN("buffer", "the buffer object name"),
		const _ GLintptr_p.IN("indirects", "the array of offsets into the buffer"),
		const _ GLsizei_p.IN("sizes", "the array of command lengths"),
		const _ GLuint_p.IN("states", "the array of state object names"),
		const _ GLuint_p.IN("fbos", "the array of framebuffer object names"),
		AutoSize("indirects", "sizes", "states", "fbos") _ GLuint.IN("count", "the number of commands")
	)
	
	GLvoid(
		"DrawCommandsStatesAddressNV",
		"""
		Accepts arrays of buffer addresses as an array of GPU addresses <code>indirects</code>, an array of command lengths in <code>sizes</code>, and an array
		of state object names in <code>states</code>, of which all names must be non-zero. Frame buffer object names are stored in <code>fbos</code> and can be
		either zero or non-zero. All arrays have <code>count</code> entries. The residency of textures used as attachment inside the state object's captured
		fbo or the passed fbo must managed explicitly.
		""",

		const _ GLuint64_p.IN("indirects", "the array of GPU addresses"),
		const _ GLsizei_p.IN("sizes", "the array of command lengths"),
		const _ GLuint_p.IN("states", "the array of state object names"),
		const _ GLuint_p.IN("fbos", "the array of framebuffer object names"),
		AutoSize("indirects", "sizes", "states", "fbos") _ GLuint.IN("count", "the number of commands")
	)
	
	GLvoid(
		"CreateCommandListsNV",
		"Returns <code>n</code> previously unused command list names in <code>lists</code>, and creates a command list in the initial state for each name.",

		AutoSize("lists") _ GLsizei.IN("n", "the number of command list names to create"),
		returnValue _ GLuint_p.OUT("lists", "the buffer in which to return the created command list names")
	)

	GLvoid(
		"DeleteCommandListsNV",
		"""
		Deletes <code>n</code> command lists stored in <code>lists</code>. Once a command list is deleted it has no contents and its name is again unused.
		Unused names in <code>lists</code> are silently ignored, as is the value zero.
		""",

		AutoSize("lists") _ GLsizei.IN("n", "the number of command list names to delete"),
		SingleValue("list") _ const _ GLuint_p.IN("lists", "the buffer from which to read the command list names to delete")
	)
  
	GLboolean(
		"IsCommandListNV",
		"Returns true if the specified name corresponds to a command list.",

		GLuint.IN("list", "the object name to query")
	)
  
	GLvoid(
		"ListDrawCommandsStatesClientNV",
		"""
		A list has multiple segments and each segment enqueues an ordered list of commands. This command enqueues the equivalent of the
		DrawCommandsStatesClientNV commands into the list indicated by <code>list</code> on the segment indicated by <code>segment</code>.

		The pre-validated state from {@code states} is saved into the command list, rather than a reference to the state object (i.e. the state objects or fbos
		could be deleted and the command list would be unaffected). This includes native GPU addresses for all textures indirectly referenced through the fbos
		passed or state objects' fbos attachments, therefore a recompile of the command list is required if such referenced textures change their allocation
		(for example due to resizing), as well as explicit management of the residency of the textures prior #CallCommandListNV().

		ListDrawCommandsStatesClientNV performs a by-value copy of the indirect data based on the provided client-side pointers. In this case the content is
		fully immutable, while the buffer-based versions can change the content of the buffers at any later time.
		""",

		GLuint.IN("list", "the command list"),
		GLuint.IN("segment", "the segment"),
		const _ GLvoid_pp.IN("indirects", "the array of GPU addresses"),
		const _ size_t_p.IN("sizes", "the array of command lengths"),
		const _ GLuint_p.IN("states", "the array of state object names"),
		const _ GLuint_p.IN("fbos", "the array of framebuffer object names"),
		AutoSize("indirects", "sizes", "states", "fbos") _ GLuint.IN("count", "the number of commands")
	)

	GLvoid(
		"CommandListSegmentsNV",
		"""
		Indicates that {@code list} will have {@code segments} ordered sequences of commands that it enqueues. This must be called before any commands are
		enqueued. In the initial state, a command list has a single segment.
		""",

		GLuint.IN("list", "the command list"),
		GLuint.IN("segments", "the number of ordered sequences of commands")
	)

	GLvoid(
		"CompileCommandListNV",
		"""
		Makes the list indicated by <code>list</code> switch from allowing collection of commands to allowing its execution. At this time, the implementation
		may generate optimized commands to transition between states as efficiently as possible.
		""",

		GLuint.IN("list", "the command list to compile")
	)

	GLvoid(
		"CallCommandListNV",
		"""
		Executes the command list indicated by <code>list</code>, which operates as if the DrawCommandsStates* commands were replayed in the order they were
		enqueued on each segment, starting from segment zero and proceeding to the maximum segment. All buffer or texture resources' residency must be managed
		explicitly, including texture attachments of the effective fbos during list enqueuing.
		""",

		GLuint.IN("list", "the command list to call")
	)
}
