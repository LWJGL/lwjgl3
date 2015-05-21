/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.opengl.*

val CONDITIONAL_RENDER_MODES =
	"""
	GL30#QUERY_WAIT GL30#QUERY_NO_WAIT GL30#QUERY_BY_REGION_WAIT GL30#QUERY_BY_REGION_NO_WAIT
	GL45#QUERY_WAIT_INVERTED GL45#QUERY_NO_WAIT_INVERTED GL45#QUERY_BY_REGION_WAIT_INVERTED GL45#QUERY_BY_REGION_NO_WAIT_INVERTED
	"""

val GL30 = "GL30".nativeClassGL("GL30") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		The core OpenGL 3.0 functionality. OpenGL 3.0 implementations are guaranteed to support at least versions 1.10, 1.20 and 1.30 of the shading language,
		although versions 1.10 and 1.20 are deprecated in a forward-compatible context.

		Extensions promoted to core in this release:
		${ul(
			registryLinkTo("EXT", "gpu_shader4"),
			registryLinkTo("NV", "conditional_render"),
			registryLinkTo("APPLE", "flush_buffer_range"),
			"""
			${registryLinkTo("ARB", "color_buffer_float")}, ${registryLinkTo("NV", "depth_buffer_float")}, ${registryLinkTo("ARB", "texture_float")},
			${registryLinkTo("EXT", "packed_float")} and ${registryLinkTo("EXT", "texture_shared_exponent")}
			""",
			registryLinkTo("EXT", "framebuffer_object"),
			"${registryLinkTo("NV", "half_float")} and ${registryLinkTo("ARB", "half_float_pixel")}",
			"${registryLinkTo("EXT", "framebuffer_multisample")} and ${registryLinkTo("EXT", "framebuffer_blit")}",
			registryLinkTo("EXT", "texture_integer"),
			registryLinkTo("EXT", "texture_array"),
			registryLinkTo("EXT", "packed_depth_stencil"),
			registryLinkTo("EXT", "draw_buffers2"),
			registryLinkTo("EXT", "texture_compression_rgtc"),
			registryLinkTo("EXT", "transform_feedback"),
			registryLinkTo("APPLE", "vertex_array_object"),
			registryLinkTo("EXT", "framebuffer_sRGB")
		)}
		"""

	IntConstant(
		"GetTarget",

		"MAJOR_VERSION" _ 0x821B,
		"MINOR_VERSION" _ 0x821C,
		"NUM_EXTENSIONS" _ 0x821D,

		"CONTEXT_FLAGS" _ 0x821E,
		"CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT" _ 0x0001
	)

	IntConstant(
		"Renamed tokens.",

		"COMPARE_REF_TO_TEXTURE" expr "GL14.GL_COMPARE_R_TO_TEXTURE",

		"CLIP_DISTANCE0" expr "GL11.GL_CLIP_PLANE0",
		"CLIP_DISTANCE1" expr "GL11.GL_CLIP_PLANE1",
		"CLIP_DISTANCE2" expr "GL11.GL_CLIP_PLANE2",
		"CLIP_DISTANCE3" expr "GL11.GL_CLIP_PLANE3",
		"CLIP_DISTANCE4" expr "GL11.GL_CLIP_PLANE4",
		"CLIP_DISTANCE5" expr "GL11.GL_CLIP_PLANE5",
		"CLIP_DISTANCE6" _ 0x3006,
		"CLIP_DISTANCE7" _ 0x3007,

		"MAX_CLIP_DISTANCES" expr "GL11.GL_MAX_CLIP_PLANES",

		"MAX_VARYING_COMPONENTS" expr "GL20.GL_MAX_VARYING_FLOATS"
	)

	(const _ GLubyteString)(
		"GetStringi",
		"Queries indexed string state.",

		GLenum.IN("name", "the indexed state to query", "GL11#EXTENSIONS GL20#SHADING_LANGUAGE_VERSION"),
		GLuint.IN("index", "the index of the particular element being queried")
	)

	GLvoid(
		"ClearBufferiv",
		"Clears an individual buffer of the currently bound framebuffer object to the #DRAW_FRAMEBUFFER binding.",

		GLenum.IN("buffer", "the buffer to clear", "GL11#COLOR GL11#STENCIL"),
		GLint.IN("drawbuffer", "the draw buffer to clear"),
		Check(1) _ GLint_p.IN(
			"value",
			"""
	        for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a
	        single stencil value to clear the buffer to.
	        """
		)
	)

	GLvoid(
		"ClearBufferuiv",
		"Clears an individual buffer of the currently bound framebuffer object to the #DRAW_FRAMEBUFFER binding.",

		GLenum.IN("buffer", "the buffer to clear", "GL11#COLOR"),
		GLint.IN("drawbuffer", "the draw buffer to clear"),
		Check(4) _ GLint_p.IN("value", "a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to")
	)

	GLvoid(
		"ClearBufferfv",
		"Clears an individual buffer of the currently bound framebuffer object to the #DRAW_FRAMEBUFFER binding.",

		GLenum.IN("buffer", "the buffer to clear", "GL11#COLOR GL11#DEPTH"),
		GLint.IN("drawbuffer", "the draw buffer to clear"),
		Check(1) _ GLfloat_p.IN(
			"value",
			"""
	        for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a
	        single depth value to clear the buffer to.
	        """
		)
	)

	GLvoid(
		"ClearBufferfi",
		"Clears an individual buffer of the currently bound framebuffer object to the #DRAW_FRAMEBUFFER binding.",

		GLenum.IN("buffer", "the buffer to clear", "GL30#DEPTH_STENCIL"),
		GLint.IN("drawbuffer", "the draw buffer to clear"),
		GLfloat.IN("depth", "the depth value to clear the buffer to"),
		GLint.IN("stencil", "the stencil value to clear the buffer to")
	)

	// EXT_gpu_shader4

	IntConstant(
		"""
		Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuiv and GetVertexAttribIiv.
		""",

		"VERTEX_ATTRIB_ARRAY_INTEGER" _ 0x88FD
	)

	IntConstant(
		"Returned by the {@code type} parameter of GetActiveUniform.",

		"SAMPLER_1D_ARRAY" _ 0x8DC0,
		"SAMPLER_2D_ARRAY" _ 0x8DC1,
		"SAMPLER_BUFFER" _ 0x8DC2,
		"SAMPLER_1D_ARRAY_SHADOW" _ 0x8DC3,
		"SAMPLER_2D_ARRAY_SHADOW" _ 0x8DC4,
		"SAMPLER_CUBE_SHADOW" _ 0x8DC5,
		"UNSIGNED_INT_VEC2" _ 0x8DC6,
		"UNSIGNED_INT_VEC3" _ 0x8DC7,
		"UNSIGNED_INT_VEC4" _ 0x8DC8,
		"INT_SAMPLER_1D" _ 0x8DC9,
		"INT_SAMPLER_2D" _ 0x8DCA,
		"INT_SAMPLER_3D" _ 0x8DCB,
		"INT_SAMPLER_CUBE" _ 0x8DCC,
		"INT_SAMPLER_2D_RECT" _ 0x8DCD,
		"INT_SAMPLER_1D_ARRAY" _ 0x8DCE,
		"INT_SAMPLER_2D_ARRAY" _ 0x8DCF,
		"INT_SAMPLER_BUFFER" _ 0x8DD0,
		"UNSIGNED_INT_SAMPLER_1D" _ 0x8DD1,
		"UNSIGNED_INT_SAMPLER_2D" _ 0x8DD2,
		"UNSIGNED_INT_SAMPLER_3D" _ 0x8DD3,
		"UNSIGNED_INT_SAMPLER_CUBE" _ 0x8DD4,
		"UNSIGNED_INT_SAMPLER_2D_RECT" _ 0x8DD5,
		"UNSIGNED_INT_SAMPLER_1D_ARRAY" _ 0x8DD6,
		"UNSIGNED_INT_SAMPLER_2D_ARRAY" _ 0x8DD7,
		"UNSIGNED_INT_SAMPLER_BUFFER" _ 0x8DD8
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MIN_PROGRAM_TEXEL_OFFSET" _ 0x8904,
		"MAX_PROGRAM_TEXEL_OFFSET" _ 0x8905
	)

	// Vertex attrib functions javadoc
	val vertexAttribIndex = "the index of the pure integer generic vertex attribute to be modified"
	val vertexAttribX = "the vertex attribute x component"
	val vertexAttribY = "the vertex attribute y component"
	val vertexAttribZ = "the vertex attribute z component"
	val vertexAttribW = "the vertex attribute w component"
	val vertexAttribBuffer = "the pure integer vertex attribute buffer"

	GLvoid("VertexAttribI1i", "Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX))
	GLvoid("VertexAttribI2i", "Specifies the value of a pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX), GLint.IN("y", vertexAttribY))
	GLvoid("VertexAttribI3i", "Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX), GLint.IN("y", vertexAttribY), GLint.IN("z", vertexAttribZ))
	GLvoid("VertexAttribI4i", "Specifies the value of a pure integer generic vertex attribute.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX), GLint.IN("y", vertexAttribY), GLint.IN("z", vertexAttribZ), GLint.IN("w", vertexAttribW))

	GLvoid("VertexAttribI1ui", "Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.", GLuint.IN("index", vertexAttribIndex), GLuint.IN("x", vertexAttribX))
	GLvoid("VertexAttribI2ui", "Specifies the value of an unsigned pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.", GLuint.IN("index", vertexAttribIndex), GLuint.IN("x", vertexAttribX), GLuint.IN("y", vertexAttribY))
	GLvoid("VertexAttribI3ui", "Specifies the value of an unsigned pure integer generic vertex attribute. The w component is implicitly set to 1.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX), GLint.IN("y", vertexAttribY), GLint.IN("z", vertexAttribZ))
	GLvoid("VertexAttribI4ui", "Specifies the value of an unsigned pure integer generic vertex attribute.", GLuint.IN("index", vertexAttribIndex), GLint.IN("x", vertexAttribX), GLint.IN("y", vertexAttribY), GLint.IN("z", vertexAttribZ), GLint.IN("w", vertexAttribW))

	GLvoid("VertexAttribI1iv", "Pointer version of #VertexAttribI1i().", GLuint.IN("index", vertexAttribIndex), const _ Check(1) _ GLint_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttribI2iv", "Pointer version of #VertexAttribI2i().", GLuint.IN("index", vertexAttribIndex), const _ Check(2) _ GLint_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttribI3iv", "Pointer version of #VertexAttribI3i().", GLuint.IN("index", vertexAttribIndex), const _ Check(3) _ GLint_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttribI4iv", "Pointer version of #VertexAttribI4i().", GLuint.IN("index", vertexAttribIndex), const _ Check(4) _ GLint_p.IN("v", vertexAttribBuffer))

	GLvoid("VertexAttribI1uiv", "Pointer version of #VertexAttribI1ui().", GLuint.IN("index", vertexAttribIndex), const _ Check(1) _ GLuint_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttribI2uiv", "Pointer version of #VertexAttribI2ui().", GLuint.IN("index", vertexAttribIndex), const _ Check(2) _ GLuint_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttribI3uiv", "Pointer version of #VertexAttribI3ui().", GLuint.IN("index", vertexAttribIndex), const _ Check(3) _ GLuint_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttribI4uiv", "Pointer version of #VertexAttribI4ui().", GLuint.IN("index", vertexAttribIndex), const _ Check(4) _ GLuint_p.IN("v", vertexAttribBuffer))

	GLvoid("VertexAttribI4bv", "Byte version of #VertexAttribI4iv().", GLuint.IN("index", vertexAttribIndex), const _ Check(4) _ GLbyte_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttribI4sv", "Short version of #VertexAttribI4iv().", GLuint.IN("index", vertexAttribIndex), const _ Check(4) _ GLshort_p.IN("v", vertexAttribBuffer))

	GLvoid("VertexAttribI4ubv", "Byte version of #VertexAttribI4uiv().", GLuint.IN("index", vertexAttribIndex), const _ Check(4) _ GLbyte_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttribI4usv", "Short version of #VertexAttribI4uiv().", GLuint.IN("index", vertexAttribIndex), const _ Check(4) _ GLshort_p.IN("v", vertexAttribBuffer))

	GLvoid(
		"VertexAttribIPointer",
		"Specifies the location and organization of a pure integer vertex attribute array.",

		GLuint.IN("index", vertexAttribIndex),
		GLint.IN("size", "the number of values per vertex that are stored in the array. The initial value is 4", "1 2 3 4 GL12#BGRA"),
		GLenum.IN(
			"type",
			"the data type of each component in the array",
			"GL11#BYTE GL11#UNSIGNED_BYTE GL11#SHORT GL11#UNSIGNED_SHORT GL11#INT GL11#UNSIGNED_INT"
		),
		GLsizei.IN(
			"stride",
			"""
			the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
			the array. The initial value is 0.
			"""),
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT
		) _ ARRAY_BUFFER _ const _ GLvoid_p.IN(
			"pointer",
			"""
			the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
			currently bound to the GL15#ARRAY_BUFFER target. The initial value is 0.
			"""
		)
	)

	GLvoid(
		"GetVertexAttribIiv",
		"Returns the value of a pure integer generic vertex attribute parameter.",

		GLuint.IN("index", vertexAttribIndex),
		GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried", "GL20#CURRENT_VERTEX_ATTRIB"),
		Check(4) _ returnValue _ GLint_p.OUT("params", "returns the requested data")
	)

	GLvoid(
		"GetVertexAttribIuiv",
		"Unsigned version of #GetVertexAttribIiv().",

		GLuint.IN("index", vertexAttribIndex),
		GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried", "GL20#CURRENT_VERTEX_ATTRIB"),
		Check(4) _ returnValue _ GLuint_p.OUT("params", "returns the requested data")
	)

	// Uniform functions javadoc
	val uniformLocation = "the location of the uniform variable to be modified"
	val uniformX = "the uniform x value"
	val uniformY = "the uniform y value"
	val uniformZ = "the uniform z value"
	val uniformW = "the uniform w value"

	GLvoid(
		"Uniform1ui",
		"Specifies the value of a uint uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLuint.IN("v0", "the uniform value")
	)

	GLvoid(
		"Uniform2ui",
		"Specifies the value of a uvec2 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLuint.IN("v0", uniformX),
		GLuint.IN("v1", uniformY)
	)

	GLvoid(
		"Uniform3ui",
		"Specifies the value of a uvec3 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLuint.IN("v0", uniformX),
		GLuint.IN("v1", uniformY),
		GLuint.IN("v2", uniformZ)
	)

	GLvoid(
		"Uniform4ui",
		"Specifies the value of a uvec4 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLuint.IN("v0", uniformX),
		GLuint.IN("v1", uniformY),
		GLuint.IN("v2", uniformZ),
		GLuint.IN("v3", uniformW)
	)

	GLvoid(
		"Uniform1uiv",
		"Specifies the value of a single uint uniform variable or a uint uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value") _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLuint_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid(
		"Uniform2uiv",
		"Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") shr 1) _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLuint_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid(
		"Uniform3uiv",
		"Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") / 3) _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLuint_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid(
		"Uniform4uiv",
		"Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLuint_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid(
		"GetUniformuiv",
		"Returns the uint value(s) of a uniform variable.",

		GLuint.IN("program", "the program object to be queried"),
		GLint.IN("location", "the location of the uniform variable to be queried"),
		Check(1) _ returnValue _ GLuint_p.OUT("params", "the value of the specified uniform variable")
	)

	GLvoid(
		"BindFragDataLocation",
		"Binds a user-defined varying out variable to a fragment shader color number.",

		GLuint.IN("program", "the name of the program containing varying out variable whose binding to modify"),
		GLuint.IN("colorNumber", "the color number to bind the user-defined varying out variable to"),
		const _ GLcharASCII_p.IN("name", "the name of the user-defined varying out variable whose binding to modify")
	)

	GLint(
		"GetFragDataLocation",
		"Queries the bindings of color numbers to user-defined varying out variables.",

		GLuint.IN("program", "the name of the program containing varying out variable whose binding to query"),
		const _ GLcharASCII_p.IN("name", "the name of the user-defined varying out variable whose binding to query")
	)

	// NV_conditional_render

	IntConstant(
		"Accepted by the {@code mode} parameter of BeginConditionalRender.",

		"QUERY_WAIT" _ 0x8E13,
		"QUERY_NO_WAIT" _ 0x8E14,
		"QUERY_BY_REGION_WAIT" _ 0x8E15,
		"QUERY_BY_REGION_NO_WAIT" _ 0x8E16
	)

	GLvoid(
		"BeginConditionalRender",
		"Starts conditional rendering.",

		GLuint.IN("id", "the name of an occlusion query object whose results are used to determine if the rendering commands are discarded"),
		GLenum.IN("mode", "how {@code glBeginConditionalRender} interprets the results of the occlusion query", CONDITIONAL_RENDER_MODES)
	)

	ReferenceGL("glBeginConditionalRender") _ GLvoid(
		"EndConditionalRender",
		"Ends conditional rendering."
	)

	// ARB_map_buffer_range

	val MapBufferRangeBits = IntConstant(
		"Accepted by the {@code access} parameter of MapBufferRange.",

		"MAP_READ_BIT" _ 0x0001,
		"MAP_WRITE_BIT" _ 0x0002,
		"MAP_INVALIDATE_RANGE_BIT" _ 0x0004,
		"MAP_INVALIDATE_BUFFER_BIT" _ 0x0008,
		"MAP_FLUSH_EXPLICIT_BIT" _ 0x0010,
		"MAP_UNSYNCHRONIZED_BIT" _ 0x0020
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBufferParameteriv.",

		"BUFFER_ACCESS_FLAGS " _ 0x911F,
		"BUFFER_MAP_LENGTH " _ 0x9120,
		"BUFFER_MAP_OFFSET" _ 0x9121
	)

	(MapPointer("length") _ GLvoid_p)(
		"MapBufferRange",
		"""
		Maps a section of a buffer object's data store.

		<b>LWJGL note</b>: This method comes in 2 flavors:
		${ol(
			"#MapBufferRange(int, long, long, int) - Always returns a new ByteBuffer instance.",
			"#MapBufferRange(int, long, long, int, ByteBuffer) - The {@code old_buffer} parameter is reused if the specified length and returned pointer match the buffer capacity and address, respectively."
		)}
		""",

		GLenum.IN("target", "a binding to which the target buffer is bound", BUFFER_OBJECT_TARGETS),
		GLintptr.IN("offset", "the starting offset within the buffer of the range to be mapped"),
		GLsizeiptr.IN("length", "the length of the range to be mapped"),
		GLbitfield.IN("access", "a combination of access flags indicating the desired access to the range", MapBufferRangeBits, LinkMode.BITFIELD)
	)

	GLvoid(
		"FlushMappedBufferRange",
		"Indicates modifications to a range of a mapped buffer.",

		GLenum.IN("target", "the target of the flush operation", BUFFER_OBJECT_TARGETS),
		GLintptr.IN("offset", "the start of the buffer subrange, in basic machine units"),
		GLsizeiptr.IN("length", "the length of the buffer subrange, in basic machine units")
	)

	// ARB_color_buffer_float

	IntConstant(
		"Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"RGBA_FLOAT_MODE" _ 0x8820
	)

	val ClampTargets = IntConstant(
		"Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"CLAMP_VERTEX_COLOR" _ 0x891A,
		"CLAMP_FRAGMENT_COLOR" _ 0x891B,
		"CLAMP_READ_COLOR" _ 0x891C
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code clamp} parameter of ClampColor.",

		"FIXED_ONLY" _ 0x891D
	)

	GLvoid(
		"ClampColor",
		"Controls color clamping.",

		GLenum.IN("target", "target for color clamping", ClampTargets),
		GLenum.IN("clamp", "whether to apply color clamping", "GL11#TRUE GL11#FALSE #FIXED_ONLY")
	)

	// ARB_depth_buffer_float

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
		returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
		""",

		"DEPTH_COMPONENT32F" _ 0x8CAC,
		"DEPTH32F_STENCIL8" _ 0x8CAD
	)

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
		GetTexImage.
		""",

		"FLOAT_32_UNSIGNED_INT_24_8_REV" _ 0x8DAD
	)

	// ARB_texture_float

	IntConstant(
		"Accepted by the {@code value} parameter of GetTexLevelParameter.",

		"TEXTURE_RED_TYPE" _ 0x8C10,
		"TEXTURE_GREEN_TYPE" _ 0x8C11,
		"TEXTURE_BLUE_TYPE" _ 0x8C12,
		"TEXTURE_ALPHA_TYPE" _ 0x8C13,
		"TEXTURE_LUMINANCE_TYPE" _ 0x8C14,
		"TEXTURE_INTENSITY_TYPE" _ 0x8C15,
		"TEXTURE_DEPTH_TYPE" _ 0x8C16
	)

	IntConstant(
		"Returned by the {@code params} parameter of GetTexLevelParameter.",

		"UNSIGNED_NORMALIZED" _ 0x8C17
	)

	IntConstant(
		"Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

		"RGBA32F" _ 0x8814,
		"RGB32F" _ 0x8815,
		"RGBA16F" _ 0x881A,
		"RGB16F" _ 0x881B
	)

	// EXT_packed_float

	IntConstant(
		"Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage.",

		"R11F_G11F_B10F" _ 0x8C3A
	)

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
		TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
		GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
		""",

		"UNSIGNED_INT_10F_11F_11F_REV" _ 0x8C3B
	)

	// EXT_texture_shared_exponent

	IntConstant(
		"Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage.",

		"RGB9_E5" _ 0x8C3D
	)

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
		TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
		GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
		""",

		"UNSIGNED_INT_5_9_9_9_REV" _ 0x8C3E
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.",

		"TEXTURE_SHARED_SIZE" _ 0x8C3F
	)

	// ARB_framebuffer_object

	val FramebufferTargets = IntConstant(
		"""
		Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and
		GetFramebufferAttachmentParameteriv.
		""",

		"FRAMEBUFFER" _ 0x8D40,
		"READ_FRAMEBUFFER" _ 0x8CA8,
		"DRAW_FRAMEBUFFER" _ 0x8CA9
	).javaDocLinks

	IntConstant(
		"""
		Accepted by the {@code target} parameter of BindRenderbuffer, RenderbufferStorage, and GetRenderbufferParameteriv, and returned by
		GetFramebufferAttachmentParameteriv.
		""",

		"RENDERBUFFER" _ 0x8D41
	)

	IntConstant(
		"Accepted by the {@code internalformat} parameter of RenderbufferStorage.",

		"STENCIL_INDEX1" _ 0x8D46,
		"STENCIL_INDEX4" _ 0x8D47,
		"STENCIL_INDEX8" _ 0x8D48,
		"STENCIL_INDEX16" _ 0x8D49
	)

	val RenderbufferParameters = IntConstant(
		"Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.",

		"RENDERBUFFER_WIDTH" _ 0x8D42,
		"RENDERBUFFER_HEIGHT" _ 0x8D43,
		"RENDERBUFFER_INTERNAL_FORMAT" _ 0x8D44,
		"RENDERBUFFER_RED_SIZE" _ 0x8D50,
		"RENDERBUFFER_GREEN_SIZE" _ 0x8D51,
		"RENDERBUFFER_BLUE_SIZE" _ 0x8D52,
		"RENDERBUFFER_ALPHA_SIZE" _ 0x8D53,
		"RENDERBUFFER_DEPTH_SIZE" _ 0x8D54,
		"RENDERBUFFER_STENCIL_SIZE" _ 0x8D55,
		"RENDERBUFFER_SAMPLES" _ 0x8CAB
	).javaDocLinks

	val FramebufferParameters = IntConstant(
		"Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

		"FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE" _ 0x8CD0,
		"FRAMEBUFFER_ATTACHMENT_OBJECT_NAME" _ 0x8CD1,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL" _ 0x8CD2,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE" _ 0x8CD3,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER" _ 0x8CD4,
		"FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING" _ 0x8210,
		"FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE" _ 0x8211,
		"FRAMEBUFFER_ATTACHMENT_RED_SIZE" _ 0x8212,
		"FRAMEBUFFER_ATTACHMENT_GREEN_SIZE" _ 0x8213,
		"FRAMEBUFFER_ATTACHMENT_BLUE_SIZE" _ 0x8214,
		"FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE" _ 0x8215,
		"FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE" _ 0x8216,
		"FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE" _ 0x8217
	).javaDocLinks

	IntConstant(
		"Returned in {@code params} by GetFramebufferAttachmentParameteriv.",

		"FRAMEBUFFER_DEFAULT" _ 0x8218,
		"INDEX" _ 0x8222
	)

	val FramebufferAttachments = IntConstant(
		"Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.",

		"COLOR_ATTACHMENT0" _ 0x8CE0,
		"COLOR_ATTACHMENT1" _ 0x8CE1,
		"COLOR_ATTACHMENT2" _ 0x8CE2,
		"COLOR_ATTACHMENT3" _ 0x8CE3,
		"COLOR_ATTACHMENT4" _ 0x8CE4,
		"COLOR_ATTACHMENT5" _ 0x8CE5,
		"COLOR_ATTACHMENT6" _ 0x8CE6,
		"COLOR_ATTACHMENT7" _ 0x8CE7,
		"COLOR_ATTACHMENT8" _ 0x8CE8,
		"COLOR_ATTACHMENT9" _ 0x8CE9,
		"COLOR_ATTACHMENT10" _ 0x8CEA,
		"COLOR_ATTACHMENT11" _ 0x8CEB,
		"COLOR_ATTACHMENT12" _ 0x8CEC,
		"COLOR_ATTACHMENT13" _ 0x8CED,
		"COLOR_ATTACHMENT14" _ 0x8CEE,
		"COLOR_ATTACHMENT15" _ 0x8CEF,
		"DEPTH_ATTACHMENT" _ 0x8D00,
		"STENCIL_ATTACHMENT" _ 0x8D20,
		"DEPTH_STENCIL_ATTACHMENT" _ 0x821A
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_SAMPLES" _ 0x8D57
	)

	IntConstant(
		"Returned by CheckFramebufferStatus().",

		"FRAMEBUFFER_COMPLETE" _ 0x8CD5,
		"FRAMEBUFFER_INCOMPLETE_ATTACHMENT" _ 0x8CD6,
		"FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT" _ 0x8CD7,
		"FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER" _ 0x8CDB,
		"FRAMEBUFFER_INCOMPLETE_READ_BUFFER" _ 0x8CDC,
		"FRAMEBUFFER_UNSUPPORTED" _ 0x8CDD,
		"FRAMEBUFFER_INCOMPLETE_MULTISAMPLE" _ 0x8D56,
		"FRAMEBUFFER_UNDEFINED" _ 0x8219
	)

	IntConstant(
		"Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev.",

		"FRAMEBUFFER_BINDING" _ 0x8CA6,
		"DRAW_FRAMEBUFFER_BINDING" _ 0x8CA6,
		"READ_FRAMEBUFFER_BINDING" _ 0x8CAA,
		"RENDERBUFFER_BINDING" _ 0x8CA7,
		"MAX_COLOR_ATTACHMENTS" _ 0x8CDF,
		"MAX_RENDERBUFFER_SIZE" _ 0x84E8
	)

	IntConstant(
		"Returned by GetError().",

		"INVALID_FRAMEBUFFER_OPERATION" _ 0x0506
	)

	IntConstant(
		"""
		Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
		GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
		CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
		""",

		"DEPTH_STENCIL" _ 0x84F9
	)

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
		GetTexImage.
		""",

		"UNSIGNED_INT_24_8" _ 0x84FA
	)

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
		returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
		""",

		"DEPTH24_STENCIL8" _ 0x88F0
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetTexLevelParameter.",

		"TEXTURE_STENCIL_SIZE" _ 0x88F1
	)

	GLboolean(
		"IsRenderbuffer",
		"Determines if a name corresponds to a renderbuffer object.",

		GLuint.IN("renderbuffer", "a value that may be the name of a renderbuffer object")
	)

	GLvoid(
		"BindRenderbuffer",
		"Binds a renderbuffer to a renderbuffer target.",

		GLenum.IN("target", "the renderbuffer target of the binding operation", "#RENDERBUFFER"),
		GLuint.IN("renderbuffer", "the name of the renderbuffer object to bind")
	)

	GLvoid(
		"DeleteRenderbuffers",
		"Deletes renderbuffer objects.",

		AutoSize("renderbuffers") _ GLsizei.IN("n", "the number of renderbuffer objects to be deleted"),
		const _ SingleValue("renderbuffer") _ GLuint_p.IN("renderbuffers", "an array containing {@code n} renderbuffer objects to be deleted")
	)

	GLvoid(
		"GenRenderbuffers",
		"Generates renderbuffer object names.",

		AutoSize("renderbuffers") _ GLsizei.IN("n", "the number of renderbuffer object names to generate"),
		returnValue _ GLuint_p.OUT("renderbuffers", "a buffer in which the generated renderbuffer object names are stored")
	)

	GLvoid(
		"RenderbufferStorage",
		"Establishes data storage, format and dimensions of a renderbuffer object's image.",

		GLenum.IN("target", "the target of the allocation", "#RENDERBUFFER"),
		GLenum.IN("internalformat", "the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format."),
		GLsizei.IN("width", "the width of the renderbuffer, in pixels"),
		GLsizei.IN("height", "the height of the renderbuffer, in pixels")
	)

	GLvoid(
		"RenderbufferStorageMultisample",
		"""
		Establishes data storage, format, dimensions and sample count of a renderbuffer object's image.

		#RenderbufferStorage() is equivalent to calling this method with the samples set to zero.
		""",

		GLenum.IN("target", "the target of the allocation", "#RENDERBUFFER"),
		GLsizei.IN("samples", "the number of samples to be used for the renderbuffer object's storage"),
		GLenum.IN("internalformat", "the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format."),
		GLsizei.IN("width", "the width of the renderbuffer, in pixels"),
		GLsizei.IN("height", "the height of the renderbuffer, in pixels")
	)

	GLvoid(
		"GetRenderbufferParameteriv",
		"Retrieves information about a bound renderbuffer object.",

		GLenum.IN("target", "the target of the query operation", "#RENDERBUFFER"),
		GLenum.IN("pname", "the parameter whose value to retrieve from the renderbuffer bound to {@code target}", RenderbufferParameters),
		Check(1) _ returnValue _ GLint_p.OUT("params", "an array to receive the value of the queried parameter")
	)

	GLboolean(
		"IsFramebuffer",
		"Determines if a name corresponds to a framebuffer object.",

		GLuint.IN("framebuffer", "a value that may be the name of a framebuffer object")
	)

	GLvoid(
		"BindFramebuffer",
		"Binds a framebuffer to a framebuffer target.",

		GLenum.IN("target", "the framebuffer target of the binding operation", FramebufferTargets),
		GLuint.IN("framebuffer", "the name of the framebuffer object to bind")
	)

	GLvoid(
		"DeleteFramebuffers",
		"Deletes framebuffer objects.",

		AutoSize("framebuffers") _ GLsizei.IN("n", "the number of framebuffer objects to be deleted"),
		const _ SingleValue("framebuffer") _ GLuint_p.IN("framebuffers", "an array containing {@code n} framebuffer objects to be deleted")
	)

	GLvoid(
		"GenFramebuffers",
		"Generates framebuffer object names.",

		AutoSize("framebuffers") _ GLsizei.IN("n", "the number of framebuffer object names to generate"),
		returnValue _ GLuint_p.OUT("framebuffers", "a buffer in which the generated framebuffer object names are stored")
	)

	GLenum(
		"CheckFramebufferStatus",
		"Checks the completeness status of a framebuffer.",

		GLenum.IN("target", "the target of the framebuffer completeness check", FramebufferTargets)
	)

	GLvoid(
		"FramebufferTexture1D",
		"Attaches a level of a 1D texture object as a logical buffer to the currently bound framebuffer object.",

		GLenum.IN("target", "the framebuffer target", FramebufferTargets),
		GLenum.IN("attachment", "the attachment point of the framebuffer", FramebufferAttachments),
		GLenum.IN("textarget", "the type of texture"),
		GLuint.IN("texture", "the texture object to attach to the framebuffer attachment point named by {@code attachment}"),
		GLint.IN("level", "the mipmap level of {@code texture} to attach")
	)

	GLvoid(
		"FramebufferTexture2D",
		"Attaches a level of a 2D texture object as a logical buffer to the currently bound framebuffer object.",

		GLenum.IN("target", "the framebuffer target", FramebufferTargets),
		GLenum.IN("attachment", "the attachment point of the framebuffer", FramebufferAttachments),
		GLenum.IN("textarget", "the type of texture"),
		GLuint.IN("texture", "the texture object to attach to the framebuffer attachment point named by {@code attachment}"),
		GLint.IN("level", "the mipmap level of {@code texture} to attach")
	)

	GLvoid(
		"FramebufferTexture3D",
		"Attaches a layer of a 3D texture object as a logical buffer to the currently bound framebuffer object.",

		GLenum.IN("target", "the framebuffer target", FramebufferTargets),
		GLenum.IN("attachment", "the attachment point of the framebuffer", FramebufferAttachments),
		GLenum.IN("textarget", "the type of texture"),
		GLuint.IN("texture", "the texture object to attach to the framebuffer attachment point named by {@code attachment}"),
		GLint.IN("level", "the mipmap level of {@code texture} to attach"),
		GLint.IN("layer", "the layer of a 2-dimensional image within the 3-dimensional texture.")
	)

	GLvoid(
		"FramebufferTextureLayer",
		"Attaches a single layer of a texture to a framebuffer",

		GLenum.IN("target", "the framebuffer target", FramebufferTargets),
		GLenum.IN("attachment", "the attachment point of the framebuffer", FramebufferAttachments),
		GLuint.IN("texture", "the texture object to attach to the framebuffer attachment point named by {@code attachment}"),
		GLint.IN("level", "the mipmap level of {@code texture} to attach"),
		GLint.IN("layer", "the layer of {@code texture} to attach.")
	)

	GLvoid(
		"FramebufferRenderbuffer",
		"Attaches a renderbuffer as a logical buffer to the currently bound framebuffer object.",

		GLenum.IN("target", "the framebuffer target", FramebufferTargets),
		GLenum.IN("attachment", "the attachment point of the framebuffer", FramebufferAttachments),
		GLenum.IN("renderbuffertarget", "the renderbuffer target", "GL30#RENDERBUFFER"),
		GLuint.IN("renderbuffer", "the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach")
	)

	GLvoid(
		"GetFramebufferAttachmentParameteriv",
		"Retrievees information about attachments of a bound framebuffer object.",

		GLenum.IN("target", "the target of the query operation", FramebufferTargets),
		GLenum.IN("attachment", "the attachment within {@code target}", FramebufferAttachments),
		GLenum.IN("pname", "the parameter of {@code attachment} to query", FramebufferParameters),
		Check(1) _ returnValue _ GLint_p.OUT("params", "an array to receive the value of the queried parameter")
	)

	GLvoid(
		"BlitFramebuffer",
		"Copies a block of pixels from the read framebuffer to the draw framebuffer.",

		GLint.IN("srcX0", "the lower-left coordinate of the source rectangle within the read buffer"),
		GLint.IN("srcY0", "the upper-left coordinate of the source rectangle within the read buffer"),
		GLint.IN("srcX1", "the lower-right coordinate of the source rectangle within the read buffer"),
		GLint.IN("srcY1", "the upper-right coordinate of the source rectangle within the read buffer"),
		GLint.IN("dstX0", "the lower-left coordinate of the destination rectangle within the write buffer"),
		GLint.IN("dstY0", "the upper-left coordinate of the destination rectangle within the write buffer"),
		GLint.IN("dstX1", "the lower-right coordinate of the destination rectangle within the write buffer"),
		GLint.IN("dstY1", "the upper-right coordinate of the destination rectangle within the write buffer"),
		GLbitfield.IN(
			"mask",
			"the bitwise OR of the flags indicating which buffers are to be copied",
			"GL11#COLOR_BUFFER_BIT GL11#DEPTH_BUFFER_BIT GL11#STENCIL_BUFFER_BIT"
		),
		GLenum.IN("filter", "the interpolation to be applied if the image is stretched", "GL11#NEAREST GL11#LINEAR")
	)

	GLvoid(
		"GenerateMipmap",
		"Generate mipmaps for a specified texture target.",

		GLenum.IN(
			"target",
			"the target to which the texture whose mimaps to generate is bound",
			"GL11#TEXTURE_1D GL11#TEXTURE_2D GL12#TEXTURE_3D #TEXTURE_1D_ARRAY #TEXTURE_2D_ARRAY GL13#TEXTURE_CUBE_MAP"
		)
	)

	// ARB_half_float_pixel & ARB_half_float_vertex

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, GetTexImage, TexSubImage1D, TexSubImage2D,
		TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
		ColorTable, ColorSubTable, and GetColorTable.

		Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and
		VertexAttribPointer.
		""",

		"HALF_FLOAT" _ 0x140B
	)

	// EXT_texture_integer

	IntConstant(
		"Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"RGBA_INTEGER_MODE" _ 0x8D9E
	)

	IntConstant(
		"Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

		"RGBA32UI" _ 0x8D70,
		"RGB32UI" _ 0x8D71,
		"RGBA16UI" _ 0x8D76,
		"RGB16UI" _ 0x8D77,
		"RGBA8UI" _ 0x8D7C,
		"RGB8UI" _ 0x8D7D,
		"RGBA32I" _ 0x8D82,
		"RGB32I" _ 0x8D83,
		"RGBA16I" _ 0x8D88,
		"RGB16I" _ 0x8D89,
		"RGBA8I" _ 0x8D8E,
		"RGB8I" _ 0x8D8F
	)

	IntConstant(
		"""
		Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.
		""",

		"RED_INTEGER" _ 0x8D94,
		"GREEN_INTEGER" _ 0x8D95,
		"BLUE_INTEGER" _ 0x8D96,
		"ALPHA_INTEGER" _ 0x8D97,
		"RGB_INTEGER" _ 0x8D98,
		"RGBA_INTEGER" _ 0x8D99,
		"BGR_INTEGER" _ 0x8D9A,
		"BGRA_INTEGER" _ 0x8D9B
	)

	GLvoid(
		"TexParameterIiv",
		"Sets the integer value of a texture parameter.",

		GLenum.IN("target", "the texture target"),
		GLenum.IN("pname", "the symbolic name of a single-valued texture parameter"),
		const _ Check(1) _ SingleValue("param") _ GLint_p.IN("params", "the value of {@code pname}")
	)

	GLvoid(
		"TexParameterIuiv",
		"Sets the unsigned integer value of a texture parameter.",

		GLenum.IN("target", "the texture target"),
		GLenum.IN("pname", "the symbolic name of a single-valued texture parameter"),
		const _ Check(1) _ SingleValue("param") _ GLuint_p.IN("params", "the value of {@code pname}")
	)

	GLvoid(
		"GetTexParameterIiv",
		"Returns the integer value of a texture parameter.",

		GLenum.IN("target", "the texture target"),
		GLenum.IN("pname", "the symbolic name of a texture parameter"),
		Check(1) _ returnValue _ GLint_p.OUT("params", "returns the texture parameter value")
	)

	GLvoid(
		"GetTexParameterIuiv",
		"Returns the unsigned integer value of a texture parameter.",

		GLenum.IN("target", "the texture target"),
		GLenum.IN("pname", "the symbolic name of a texture parameter"),
		Check(1) _ returnValue _ GLuint_p.OUT("params", "returns the texture parameter value")
	)

	// EXT_texture_array

	IntConstant(
		"Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture.",

		"TEXTURE_1D_ARRAY" _ 0x8C18,
		"TEXTURE_2D_ARRAY" _ 0x8C1A
	)

	IntConstant(
		"Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CopyTexSubImage3D, CompressedTexImage3D, and CompressedTexSubImage3D.",

		"PROXY_TEXTURE_2D_ARRAY" _ 0x8C1B
	)

	IntConstant(
		"""
		Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and
		CompressedTexSubImage2D.
		""",

		"PROXY_TEXTURE_1D_ARRAY" _ 0x8C19
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

		"TEXTURE_BINDING_1D_ARRAY" _ 0x8C1C,
		"TEXTURE_BINDING_2D_ARRAY" _ 0x8C1D,
		"MAX_ARRAY_TEXTURE_LAYERS" _ 0x88FF
	)

	// EXT_draw_buffers2

	GLvoid(
		"ColorMaski",
		"Enables and disables writing of frame buffer color components.",

		GLuint.IN("buf", "the index of the draw buffer whose color mask to set"),
		GLboolean.IN("r", "whether R values are written or not"),
		GLboolean.IN("g", "whether G values are written or not"),
		GLboolean.IN("b", "whether B values are written or not"),
		GLboolean.IN("a", "whether A values are written or not")
	)

	ReferenceGL("glGet") _ GLvoid(
		"GetBooleani_v",
		"Queries the boolean value of an indexed state variable.",

		GLenum.IN("target", "the indexed state to query"),
		GLuint.IN("index", "the index of the element being queried"),
		Check(1) _ returnValue _ GLboolean_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)

	ReferenceGL("glGet") _ GLvoid(
		"GetIntegeri_v",
		"Queries the integer value of an indexed state variable.",

		GLenum.IN("target", "the indexed state to query"),
		GLuint.IN("index", "the index of the element being queried"),
		Check(1) _ returnValue _ GLint_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)

	GLvoid(
		"Enablei",
		"Enables an indexed capability.",

		GLenum.IN("cap", "the indexed capability to enable"),
		GLuint.IN("index", "the index to enable")
	)

	GLvoid(
		"Disablei",
		"Disables an indexed capability.",

		GLenum.IN("target", "the indexed capability to disable"),
		GLuint.IN("index", "the index to disable")
	)

	GLboolean(
		"IsEnabledi",
		"Tests whether an indexed capability is enabled.",

		GLenum.IN("target", "the indexed capability to query"),
		GLuint.IN("index", "the index to query")
	)

	// EXT_texture_compression_rgtc

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
		CompressedTexSubImage2D.
		""",

		"COMPRESSED_RED_RGTC1" _ 0x8DBB,
		"COMPRESSED_SIGNED_RED_RGTC1" _ 0x8DBC,
		"COMPRESSED_RG_RGTC2" _ 0x8DBD,
		"COMPRESSED_SIGNED_RG_RGTC2" _ 0x8DBE
	)

	// ARB_texture_rg

	IntConstant(
		"Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.",

		"R8" _ 0x8229,
		"R16" _ 0x822A,
		"RG8" _ 0x822B,
		"RG16" _ 0x822C,
		"R16F" _ 0x822D,
		"R32F" _ 0x822E,
		"RG16F" _ 0x822F,
		"RG32F" _ 0x8230,
		"R8I" _ 0x8231,
		"R8UI" _ 0x8232,
		"R16I" _ 0x8233,
		"R16UI" _ 0x8234,
		"R32I" _ 0x8235,
		"R32UI" _ 0x8236,
		"RG8I" _ 0x8237,
		"RG8UI" _ 0x8238,
		"RG16I" _ 0x8239,
		"RG16UI" _ 0x823A,
		"RG32I" _ 0x823B,
		"RG32UI" _ 0x823C,
		"RG" _ 0x8227,
		"COMPRESSED_RED" _ 0x8225,
		"COMPRESSED_RG" _ 0x8226
	)

	IntConstant(
		"Accepted by the {@code format} parameter of TexImage3D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels.",

		"RG_INTEGER" _ 0x8228
	)

	// EXT_transform_feedback

	IntConstant(
		"""
		Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
		BindBufferRange, BindBufferOffset and BindBufferBase.
		""",

		"TRANSFORM_FEEDBACK_BUFFER" _ 0x8C8E
	)

	IntConstant(
		"Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v.",

		"TRANSFORM_FEEDBACK_BUFFER_START" _ 0x8C84,
		"TRANSFORM_FEEDBACK_BUFFER_SIZE" _ 0x8C85
	)

	IntConstant(
		"""
		Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v, and by the {@code pname} parameter of GetBooleanv,
		GetDoublev, GetIntegerv, and GetFloatv.
		""",

		"TRANSFORM_FEEDBACK_BUFFER_BINDING" _ 0x8C8F
	)

	val BufferModes = IntConstant(
		"Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryings.",

		"INTERLEAVED_ATTRIBS" _ 0x8C8C,
		"SEPARATE_ATTRIBS" _ 0x8C8D
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

		"PRIMITIVES_GENERATED" _ 0x8C87,
		"TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN" _ 0x8C88
	)

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"RASTERIZER_DISCARD" _ 0x8C89
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS" _ 0x8C8A,
		"MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS" _ 0x8C8B,
		"MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS" _ 0x8C80
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"TRANSFORM_FEEDBACK_VARYINGS" _ 0x8C83,
		"TRANSFORM_FEEDBACK_BUFFER_MODE" _ 0x8C7F,
		"TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH" _ 0x8C76
	)

	GLvoid(
		"BindBufferRange",
		"Binds a range within a buffer object to an indexed buffer target.",

		GLenum.IN(
			"target",
			"the target of the bind operation",
			"#TRANSFORM_FEEDBACK_BUFFER GL31#UNIFORM_BUFFER GL42#ATOMIC_COUNTER_BUFFER GL43#SHADER_STORAGE_BUFFER"
		),
		GLuint.IN("index", "the index of the binding point within the array specified by {@code target}"),
		GLuint.IN("buffer", "a buffer object to bind to the specified binding point"),
		GLintptr.IN("offset", "the starting offset in basic machine units into the buffer object {@code buffer}"),
		GLsizeiptr.IN("size", "the amount of data in machine units that can be read from the buffer object while used as an indexed target")
	)

	GLvoid(
		"BindBufferBase",
		"Binds a buffer object to an indexed buffer target.",

		GLenum.IN(
			"target",
			"the target of the bind operation",
			"#TRANSFORM_FEEDBACK_BUFFER GL31#UNIFORM_BUFFER GL42#ATOMIC_COUNTER_BUFFER GL43#SHADER_STORAGE_BUFFER"
		),
		GLuint.IN("index", "the index of the binding point within the array specified by {@code target}"),
		GLuint.IN("buffer", "a buffer object to bind to the specified binding point")
	)

	GLvoid(
		"BeginTransformFeedback",
		"Starts transform feedback operation.",

		GLenum.IN(
			"primitiveMode",
			"the output type of the primitives that will be recorded into the buffer objects that are bound for transform feedback",
			"GL11#POINTS GL11#LINES GL11#TRIANGLES"
		)
	)

	ReferenceGL("glBeginTransformFeedback") _ GLvoid("EndTransformFeedback", "Ends transform feedback operation.")

	GLvoid(
		"TransformFeedbackVaryings",
		"Specifies values to record in transform feedback buffers.",

		GLuint.IN("program", "the target program object"),
		AutoSize("varyings") _ GLsizei.IN("count", "the number of varying variables used for transform feedback"),
		const _ PointerArray(GLcharASCII_p, "varying") _ GLcharASCII_pp.IN(
			"varyings",
			"an array of {@code count} zero-terminated strings specifying the names of the varying variables to use for transform feedback"
		),
		GLenum.IN("bufferMode", "the mode used to capture the varying variables when transform feedback is active", BufferModes)
	)

	GLvoid(
		"GetTransformFeedbackVarying",
		"Retrieves information about varying variables selected for transform feedback.",

		GLuint.IN("program", "the target program object"),
		GLuint.IN("index", "the index of the varying variable whose information to retrieve"),
		AutoSize("name") _ GLsizei.IN("bufSize", "the maximum number of characters, including the null terminator, that may be written into {@code name}"),
		Check(1) _ nullable _ GLsizei_p.OUT("length", "a variable which will receive the number of characters written into {@code name}, excluding the null-terminator. If {@code length} is NULL no length is returned."),
		Check(1) _ GLsizei_p.OUT("size", "a variable that will receive the size of the varying"),
		Check(1) _ GLenum_p.OUT("type", "a variable that will receive the type of the varying"),
		Return("length", "GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH)") _ GLcharASCII_p.OUT(
			"name",
			"a buffer into which will be written the name of the varying"
		)
	)

	// ARB_vertex_array_object

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"VERTEX_ARRAY_BINDING" _ 0x85B5
	)

	GLvoid(
		"BindVertexArray",
		"Binds a vertex array object",

		GLuint.IN("array", "the name of the vertex array to bind")
	)

	GLvoid(
		"DeleteVertexArrays",
		"Deletes vertex array objects.",

		AutoSize("arrays") _ GLsizei.IN("n", "the number of vertex array objects to be deleted"),
		const _ SingleValue("array") _ GLuint_p.IN("arrays", "an array containing the n names of the objects to be deleted")
	)

	GLvoid(
		"GenVertexArrays",
		"Generates vertex array object names.",

		AutoSize("arrays") _ GLsizei.IN("n", "the number of vertex array object names to generate"),
		returnValue _ GLuint_p.OUT("arrays", "a buffer in which the generated vertex array object names are stored")
	)

	GLboolean(
		"IsVertexArray",
		"Determines if a name corresponds to a vertex array object.",

		GLuint.IN("array", "a value that may be the name of a vertex array object")
	)

	// ARB_framebuffer_sRGB

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"FRAMEBUFFER_SRGB" _ 0x8DB9
	)

}