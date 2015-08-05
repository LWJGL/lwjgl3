/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*
import org.lwjgl.opengles.BufferType.*

val GLES20 = "GLES20".nativeClassGLES("GLES20", postfix = "") {
	nativeImport (
		"OpenGLES.h"
	)

	documentation =
		"The core OpenGL ES 2.0 functionality."

	IntConstant(
		"",

		"DEPTH_BUFFER_BIT" _ 0x00000100,
		"STENCIL_BUFFER_BIT" _ 0x00000400,
		"COLOR_BUFFER_BIT" _ 0x00004000,
		"FALSE" _ 0,
		"TRUE" _ 1,
		"POINTS" _ 0x0000,
		"LINES" _ 0x0001,
		"LINE_LOOP" _ 0x0002,
		"LINE_STRIP" _ 0x0003,
		"TRIANGLES" _ 0x0004,
		"TRIANGLE_STRIP" _ 0x0005,
		"TRIANGLE_FAN" _ 0x0006,
		"ZERO" _ 0,
		"ONE" _ 1,
		"SRC_COLOR" _ 0x0300,
		"ONE_MINUS_SRC_COLOR" _ 0x0301,
		"SRC_ALPHA" _ 0x0302,
		"ONE_MINUS_SRC_ALPHA" _ 0x0303,
		"DST_ALPHA" _ 0x0304,
		"ONE_MINUS_DST_ALPHA" _ 0x0305,
		"DST_COLOR" _ 0x0306,
		"ONE_MINUS_DST_COLOR" _ 0x0307,
		"SRC_ALPHA_SATURATE" _ 0x0308,
		"FUNC_ADD" _ 0x8006,
		"BLEND_EQUATION" _ 0x8009,
		"BLEND_EQUATION_RGB" _ 0x8009,
		"BLEND_EQUATION_ALPHA" _ 0x883D,
		"FUNC_SUBTRACT" _ 0x800A,
		"FUNC_REVERSE_SUBTRACT" _ 0x800B,
		"BLEND_DST_RGB" _ 0x80C8,
		"BLEND_SRC_RGB" _ 0x80C9,
		"BLEND_DST_ALPHA" _ 0x80CA,
		"BLEND_SRC_ALPHA" _ 0x80CB,
		"CONSTANT_COLOR" _ 0x8001,
		"ONE_MINUS_CONSTANT_COLOR" _ 0x8002,
		"CONSTANT_ALPHA" _ 0x8003,
		"ONE_MINUS_CONSTANT_ALPHA" _ 0x8004,
		"BLEND_COLOR" _ 0x8005,
		"ARRAY_BUFFER" _ 0x8892,
		"ELEMENT_ARRAY_BUFFER" _ 0x8893,
		"ARRAY_BUFFER_BINDING" _ 0x8894,
		"ELEMENT_ARRAY_BUFFER_BINDING" _ 0x8895,
		"STREAM_DRAW" _ 0x88E0,
		"STATIC_DRAW" _ 0x88E4,
		"DYNAMIC_DRAW" _ 0x88E8,
		"BUFFER_SIZE" _ 0x8764,
		"BUFFER_USAGE" _ 0x8765,
		"CURRENT_VERTEX_ATTRIB" _ 0x8626,
		"FRONT" _ 0x0404,
		"BACK" _ 0x0405,
		"FRONT_AND_BACK" _ 0x0408,
		"TEXTURE_2D" _ 0x0DE1,
		"CULL_FACE" _ 0x0B44,
		"BLEND" _ 0x0BE2,
		"DITHER" _ 0x0BD0,
		"STENCIL_TEST" _ 0x0B90,
		"DEPTH_TEST" _ 0x0B71,
		"SCISSOR_TEST" _ 0x0C11,
		"POLYGON_OFFSET_FILL" _ 0x8037,
		"SAMPLE_ALPHA_TO_COVERAGE" _ 0x809E,
		"SAMPLE_COVERAGE" _ 0x80A0,
		"NO_ERROR" _ 0,
		"INVALID_ENUM" _ 0x0500,
		"INVALID_VALUE" _ 0x0501,
		"INVALID_OPERATION" _ 0x0502,
		"OUT_OF_MEMORY" _ 0x0505,
		"CW" _ 0x0900,
		"CCW" _ 0x0901,
		"LINE_WIDTH" _ 0x0B21,
		"ALIASED_POINT_SIZE_RANGE" _ 0x846D,
		"ALIASED_LINE_WIDTH_RANGE" _ 0x846E,
		"CULL_FACE_MODE" _ 0x0B45,
		"FRONT_FACE" _ 0x0B46,
		"DEPTH_RANGE" _ 0x0B70,
		"DEPTH_WRITEMASK" _ 0x0B72,
		"DEPTH_CLEAR_VALUE" _ 0x0B73,
		"DEPTH_FUNC" _ 0x0B74,
		"STENCIL_CLEAR_VALUE" _ 0x0B91,
		"STENCIL_FUNC" _ 0x0B92,
		"STENCIL_FAIL" _ 0x0B94,
		"STENCIL_PASS_DEPTH_FAIL" _ 0x0B95,
		"STENCIL_PASS_DEPTH_PASS" _ 0x0B96,
		"STENCIL_REF" _ 0x0B97,
		"STENCIL_VALUE_MASK" _ 0x0B93,
		"STENCIL_WRITEMASK" _ 0x0B98,
		"STENCIL_BACK_FUNC" _ 0x8800,
		"STENCIL_BACK_FAIL" _ 0x8801,
		"STENCIL_BACK_PASS_DEPTH_FAIL" _ 0x8802,
		"STENCIL_BACK_PASS_DEPTH_PASS" _ 0x8803,
		"STENCIL_BACK_REF" _ 0x8CA3,
		"STENCIL_BACK_VALUE_MASK" _ 0x8CA4,
		"STENCIL_BACK_WRITEMASK" _ 0x8CA5,
		"VIEWPORT" _ 0x0BA2,
		"SCISSOR_BOX" _ 0x0C10,
		"COLOR_CLEAR_VALUE" _ 0x0C22,
		"COLOR_WRITEMASK" _ 0x0C23,
		"UNPACK_ALIGNMENT" _ 0x0CF5,
		"PACK_ALIGNMENT" _ 0x0D05,
		"MAX_TEXTURE_SIZE" _ 0x0D33,
		"MAX_VIEWPORT_DIMS" _ 0x0D3A,
		"SUBPIXEL_BITS" _ 0x0D50,
		"RED_BITS" _ 0x0D52,
		"GREEN_BITS" _ 0x0D53,
		"BLUE_BITS" _ 0x0D54,
		"ALPHA_BITS" _ 0x0D55,
		"DEPTH_BITS" _ 0x0D56,
		"STENCIL_BITS" _ 0x0D57,
		"POLYGON_OFFSET_UNITS" _ 0x2A00,
		"POLYGON_OFFSET_FACTOR" _ 0x8038,
		"TEXTURE_BINDING_2D" _ 0x8069,
		"SAMPLE_BUFFERS" _ 0x80A8,
		"SAMPLES" _ 0x80A9,
		"SAMPLE_COVERAGE_VALUE" _ 0x80AA,
		"SAMPLE_COVERAGE_INVERT" _ 0x80AB,
		"NUM_COMPRESSED_TEXTURE_FORMATS" _ 0x86A2,
		"COMPRESSED_TEXTURE_FORMATS" _ 0x86A3,
		"DONT_CARE" _ 0x1100,
		"FASTEST" _ 0x1101,
		"NICEST" _ 0x1102,
		"GENERATE_MIPMAP_HINT" _ 0x8192,
		"BYTE" _ 0x1400,
		"UNSIGNED_BYTE" _ 0x1401,
		"SHORT" _ 0x1402,
		"UNSIGNED_SHORT" _ 0x1403,
		"INT" _ 0x1404,
		"UNSIGNED_INT" _ 0x1405,
		"FLOAT" _ 0x1406,
		"FIXED" _ 0x140C,
		"DEPTH_COMPONENT" _ 0x1902,
		"ALPHA" _ 0x1906,
		"RGB" _ 0x1907,
		"RGBA" _ 0x1908,
		"LUMINANCE" _ 0x1909,
		"LUMINANCE_ALPHA" _ 0x190A,
		"UNSIGNED_SHORT_4_4_4_4" _ 0x8033,
		"UNSIGNED_SHORT_5_5_5_1" _ 0x8034,
		"UNSIGNED_SHORT_5_6_5" _ 0x8363,
		"FRAGMENT_SHADER" _ 0x8B30,
		"VERTEX_SHADER" _ 0x8B31,
		"MAX_VERTEX_ATTRIBS" _ 0x8869,
		"MAX_VERTEX_UNIFORM_VECTORS" _ 0x8DFB,
		"MAX_VARYING_VECTORS" _ 0x8DFC,
		"MAX_COMBINED_TEXTURE_IMAGE_UNITS" _ 0x8B4D,
		"MAX_VERTEX_TEXTURE_IMAGE_UNITS" _ 0x8B4C,
		"MAX_TEXTURE_IMAGE_UNITS" _ 0x8872,
		"MAX_FRAGMENT_UNIFORM_VECTORS" _ 0x8DFD,
		"SHADER_TYPE" _ 0x8B4F,
		"DELETE_STATUS" _ 0x8B80,
		"LINK_STATUS" _ 0x8B82,
		"VALIDATE_STATUS" _ 0x8B83,
		"ATTACHED_SHADERS" _ 0x8B85,
		"ACTIVE_UNIFORMS" _ 0x8B86,
		"ACTIVE_UNIFORM_MAX_LENGTH" _ 0x8B87,
		"ACTIVE_ATTRIBUTES" _ 0x8B89,
		"ACTIVE_ATTRIBUTE_MAX_LENGTH" _ 0x8B8A,
		"SHADING_LANGUAGE_VERSION" _ 0x8B8C,
		"CURRENT_PROGRAM" _ 0x8B8D,
		"NEVER" _ 0x0200,
		"LESS" _ 0x0201,
		"EQUAL" _ 0x0202,
		"LEQUAL" _ 0x0203,
		"GREATER" _ 0x0204,
		"NOTEQUAL" _ 0x0205,
		"GEQUAL" _ 0x0206,
		"ALWAYS" _ 0x0207,
		"KEEP" _ 0x1E00,
		"REPLACE" _ 0x1E01,
		"INCR" _ 0x1E02,
		"DECR" _ 0x1E03,
		"INVERT" _ 0x150A,
		"INCR_WRAP" _ 0x8507,
		"DECR_WRAP" _ 0x8508,
		"VENDOR" _ 0x1F00,
		"RENDERER" _ 0x1F01,
		"VERSION" _ 0x1F02,
		"EXTENSIONS" _ 0x1F03,
		"NEAREST" _ 0x2600,
		"LINEAR" _ 0x2601,
		"NEAREST_MIPMAP_NEAREST" _ 0x2700,
		"LINEAR_MIPMAP_NEAREST" _ 0x2701,
		"NEAREST_MIPMAP_LINEAR" _ 0x2702,
		"LINEAR_MIPMAP_LINEAR" _ 0x2703,
		"TEXTURE_MAG_FILTER" _ 0x2800,
		"TEXTURE_MIN_FILTER" _ 0x2801,
		"TEXTURE_WRAP_S" _ 0x2802,
		"TEXTURE_WRAP_T" _ 0x2803,
		"TEXTURE" _ 0x1702,
		"TEXTURE_CUBE_MAP" _ 0x8513,
		"TEXTURE_BINDING_CUBE_MAP" _ 0x8514,
		"TEXTURE_CUBE_MAP_POSITIVE_X" _ 0x8515,
		"TEXTURE_CUBE_MAP_NEGATIVE_X" _ 0x8516,
		"TEXTURE_CUBE_MAP_POSITIVE_Y" _ 0x8517,
		"TEXTURE_CUBE_MAP_NEGATIVE_Y" _ 0x8518,
		"TEXTURE_CUBE_MAP_POSITIVE_Z" _ 0x8519,
		"TEXTURE_CUBE_MAP_NEGATIVE_Z" _ 0x851A,
		"MAX_CUBE_MAP_TEXTURE_SIZE" _ 0x851C,
		"TEXTURE0" _ 0x84C0,
		"TEXTURE1" _ 0x84C1,
		"TEXTURE2" _ 0x84C2,
		"TEXTURE3" _ 0x84C3,
		"TEXTURE4" _ 0x84C4,
		"TEXTURE5" _ 0x84C5,
		"TEXTURE6" _ 0x84C6,
		"TEXTURE7" _ 0x84C7,
		"TEXTURE8" _ 0x84C8,
		"TEXTURE9" _ 0x84C9,
		"TEXTURE10" _ 0x84CA,
		"TEXTURE11" _ 0x84CB,
		"TEXTURE12" _ 0x84CC,
		"TEXTURE13" _ 0x84CD,
		"TEXTURE14" _ 0x84CE,
		"TEXTURE15" _ 0x84CF,
		"TEXTURE16" _ 0x84D0,
		"TEXTURE17" _ 0x84D1,
		"TEXTURE18" _ 0x84D2,
		"TEXTURE19" _ 0x84D3,
		"TEXTURE20" _ 0x84D4,
		"TEXTURE21" _ 0x84D5,
		"TEXTURE22" _ 0x84D6,
		"TEXTURE23" _ 0x84D7,
		"TEXTURE24" _ 0x84D8,
		"TEXTURE25" _ 0x84D9,
		"TEXTURE26" _ 0x84DA,
		"TEXTURE27" _ 0x84DB,
		"TEXTURE28" _ 0x84DC,
		"TEXTURE29" _ 0x84DD,
		"TEXTURE30" _ 0x84DE,
		"TEXTURE31" _ 0x84DF,
		"ACTIVE_TEXTURE" _ 0x84E0,
		"REPEAT" _ 0x2901,
		"CLAMP_TO_EDGE" _ 0x812F,
		"MIRRORED_REPEAT" _ 0x8370,
		"FLOAT_VEC2" _ 0x8B50,
		"FLOAT_VEC3" _ 0x8B51,
		"FLOAT_VEC4" _ 0x8B52,
		"INT_VEC2" _ 0x8B53,
		"INT_VEC3" _ 0x8B54,
		"INT_VEC4" _ 0x8B55,
		"BOOL" _ 0x8B56,
		"BOOL_VEC2" _ 0x8B57,
		"BOOL_VEC3" _ 0x8B58,
		"BOOL_VEC4" _ 0x8B59,
		"FLOAT_MAT2" _ 0x8B5A,
		"FLOAT_MAT3" _ 0x8B5B,
		"FLOAT_MAT4" _ 0x8B5C,
		"SAMPLER_2D" _ 0x8B5E,
		"SAMPLER_CUBE" _ 0x8B60,
		"VERTEX_ATTRIB_ARRAY_ENABLED" _ 0x8622,
		"VERTEX_ATTRIB_ARRAY_SIZE" _ 0x8623,
		"VERTEX_ATTRIB_ARRAY_STRIDE" _ 0x8624,
		"VERTEX_ATTRIB_ARRAY_TYPE" _ 0x8625,
		"VERTEX_ATTRIB_ARRAY_NORMALIZED" _ 0x886A,
		"VERTEX_ATTRIB_ARRAY_POINTER" _ 0x8645,
		"VERTEX_ATTRIB_ARRAY_BUFFER_BINDING" _ 0x889F,
		"IMPLEMENTATION_COLOR_READ_TYPE" _ 0x8B9A,
		"IMPLEMENTATION_COLOR_READ_FORMAT" _ 0x8B9B,
		"COMPILE_STATUS" _ 0x8B81,
		"INFO_LOG_LENGTH" _ 0x8B84,
		"SHADER_SOURCE_LENGTH" _ 0x8B88,
		"SHADER_COMPILER" _ 0x8DFA,
		"SHADER_BINARY_FORMATS" _ 0x8DF8,
		"NUM_SHADER_BINARY_FORMATS" _ 0x8DF9,
		"LOW_FLOAT" _ 0x8DF0,
		"MEDIUM_FLOAT" _ 0x8DF1,
		"HIGH_FLOAT" _ 0x8DF2,
		"LOW_INT" _ 0x8DF3,
		"MEDIUM_INT" _ 0x8DF4,
		"HIGH_INT" _ 0x8DF5,
		"FRAMEBUFFER" _ 0x8D40,
		"RENDERBUFFER" _ 0x8D41,
		"RGBA4" _ 0x8056,
		"RGB5_A1" _ 0x8057,
		"RGB565" _ 0x8D62,
		"DEPTH_COMPONENT16" _ 0x81A5,
		"STENCIL_INDEX8" _ 0x8D48,
		"RENDERBUFFER_WIDTH" _ 0x8D42,
		"RENDERBUFFER_HEIGHT" _ 0x8D43,
		"RENDERBUFFER_INTERNAL_FORMAT" _ 0x8D44,
		"RENDERBUFFER_RED_SIZE" _ 0x8D50,
		"RENDERBUFFER_GREEN_SIZE" _ 0x8D51,
		"RENDERBUFFER_BLUE_SIZE" _ 0x8D52,
		"RENDERBUFFER_ALPHA_SIZE" _ 0x8D53,
		"RENDERBUFFER_DEPTH_SIZE" _ 0x8D54,
		"RENDERBUFFER_STENCIL_SIZE" _ 0x8D55,
		"FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE" _ 0x8CD0,
		"FRAMEBUFFER_ATTACHMENT_OBJECT_NAME" _ 0x8CD1,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL" _ 0x8CD2,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE" _ 0x8CD3,
		"COLOR_ATTACHMENT0" _ 0x8CE0,
		"DEPTH_ATTACHMENT" _ 0x8D00,
		"STENCIL_ATTACHMENT" _ 0x8D20,
		"NONE" _ 0,
		"FRAMEBUFFER_COMPLETE" _ 0x8CD5,
		"FRAMEBUFFER_INCOMPLETE_ATTACHMENT" _ 0x8CD6,
		"FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT" _ 0x8CD7,
		"FRAMEBUFFER_INCOMPLETE_DIMENSIONS" _ 0x8CD9,
		"FRAMEBUFFER_UNSUPPORTED" _ 0x8CDD,
		"FRAMEBUFFER_BINDING" _ 0x8CA6,
		"RENDERBUFFER_BINDING" _ 0x8CA7,
		"MAX_RENDERBUFFER_SIZE" _ 0x84E8,
		"INVALID_FRAMEBUFFER_OPERATION" _ 0x0506
	)

	void(
		"ActiveTexture",
		"",

		GLenum.IN("texture", "")
	)

	void(
		"AttachShader",
		"",

		GLuint.IN("program", ""),
		GLuint.IN("shader", "")
	)

	void(
		"BindAttribLocation",
		"",

		GLuint.IN("program", ""),
		GLuint.IN("index", ""),
		const _ GLcharASCII_p.IN("name", "")
	)

	void(
		"BindBuffer",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("buffer", "")
	)

	void(
		"BindFramebuffer",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("framebuffer", "")
	)

	void(
		"BindRenderbuffer",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("renderbuffer", "")
	)

	void(
		"BindTexture",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("texture", "")
	)

	void(
		"BlendColor",
		"",

		GLfloat.IN("red", ""),
		GLfloat.IN("green", ""),
		GLfloat.IN("blue", ""),
		GLfloat.IN("alpha", "")
	)

	void(
		"BlendEquation",
		"",

		GLenum.IN("mode", "")
	)

	void(
		"BlendEquationSeparate",
		"",

		GLenum.IN("modeRGB", ""),
		GLenum.IN("modeAlpha", "")
	)

	void(
		"BlendFunc",
		"",

		GLenum.IN("sfactor", ""),
		GLenum.IN("dfactor", "")
	)

	void(
		"BlendFuncSeparate",
		"",

		GLenum.IN("sfactorRGB", ""),
		GLenum.IN("dfactorRGB", ""),
		GLenum.IN("sfactorAlpha", ""),
		GLenum.IN("dfactorAlpha", "")
	)

	void(
		"BufferData",
		"",

		GLenum.IN("target", ""),
		AutoSize("data") _ GLsizeiptr.IN("size", ""),
		optional _ MultiType(
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_FLOAT
		) _ const _ void_p.IN("data", ""),
		GLenum.IN("usage", "")
	)

	void(
		"BufferSubData",
		"",

		GLenum.IN("target", ""),
		GLintptr.IN("offset", ""),
		AutoSize("data") _ GLsizeiptr.IN("size", ""),
		MultiType(
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_FLOAT
		) _ const _ void_p.IN("data", "")
	)

	GLenum(
		"CheckFramebufferStatus",
		"",

		GLenum.IN("target", "")
	)

	void(
		"Clear",
		"",

		GLbitfield.IN("mask", "")
	)

	void(
		"ClearColor",
		"",

		GLfloat.IN("red", ""),
		GLfloat.IN("green", ""),
		GLfloat.IN("blue", ""),
		GLfloat.IN("alpha", "")
	)

	void(
		"ClearDepthf",
		"",

		GLfloat.IN("d", "")
	)

	void(
		"ClearStencil",
		"",

		GLint.IN("s", "")
	)

	void(
		"ColorMask",
		"",

		GLboolean.IN("red", ""),
		GLboolean.IN("green", ""),
		GLboolean.IN("blue", ""),
		GLboolean.IN("alpha", "")
	)

	void(
		"CompileShader",
		"",

		GLuint.IN("shader", "")
	)

	void(
		"CompressedTexImage2D",
		"",

		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLint.IN("border", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		PIXEL_UNPACK_BUFFER _ nullable _ const _ void_p.IN("data", "")
	)

	void(
		"CompressedTexSubImage2D",
		"",

		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLenum.IN("format", ""),
		AutoSize("data") _ GLsizei.IN("imageSize", ""),
		PIXEL_UNPACK_BUFFER _ const _ void_p.IN("data", "")
	)

	void(
		"CopyTexImage2D",
		"",

		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLenum.IN("internalformat", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLint.IN("border", "")
	)

	void(
		"CopyTexSubImage2D",
		"",

		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	GLuint(
		"CreateProgram",
		""
	)

	GLuint(
		"CreateShader",
		"",

		GLenum.IN("type", "")
	)

	void(
		"CullFace",
		"",

		GLenum.IN("mode", "")
	)

	void(
		"DeleteBuffers",
		"",

		AutoSize("buffers") _ GLsizei.IN("n", ""),
		SingleValue("buffer") _ const _ GLuint_p.IN("buffers", "")
	)

	void(
		"DeleteFramebuffers",
		"",

		AutoSize("framebuffers") _ GLsizei.IN("n", ""),
		SingleValue("framebuffer") _ const _ GLuint_p.IN("framebuffers", "")
	)

	void(
		"DeleteProgram",
		"",

		GLuint.IN("program", "")
	)

	void(
		"DeleteRenderbuffers",
		"",

		AutoSize("renderbuffers") _ GLsizei.IN("n", ""),
		SingleValue("renderbuffer") _ const _ GLuint_p.IN("renderbuffers", "")
	)

	void(
		"DeleteShader",
		"",

		GLuint.IN("shader", "")
	)

	void(
		"DeleteTextures",
		"",

		AutoSize("textures") _ GLsizei.IN("n", ""),
		SingleValue("texture") _ const _ GLuint_p.IN("textures", "")
	)

	void(
		"DepthFunc",
		"",

		GLenum.IN("func", "")
	)

	void(
		"DepthMask",
		"",

		GLboolean.IN("flag", "")
	)

	void(
		"DepthRangef",
		"",

		GLfloat.IN("n", ""),
		GLfloat.IN("f", "")
	)

	void(
		"DetachShader",
		"",

		GLuint.IN("program", ""),
		GLuint.IN("shader", "")
	)

	void(
		"Disable",
		"",

		GLenum.IN("cap", "")
	)

	void(
		"DisableVertexAttribArray",
		"",

		GLuint.IN("index", "")
	)

	void(
		"DrawArrays",
		"",

		GLenum.IN("mode", ""),
		GLint.IN("first", ""),
		GLsizei.IN("count", "")
	)

	void(
		"DrawElements",
		"",

		GLenum.IN("mode", ""),
		AutoSize("indices") shr "GLESChecks.typeToByteShift(type)" _ GLsizei.IN("count", ""),
		AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT) _ GLenum.IN("type", ""),
		ELEMENT_ARRAY_BUFFER _ const _ void_p.IN("indices", "")
	)

	void(
		"Enable",
		"",

		GLenum.IN("cap", "")
	)

	void(
		"EnableVertexAttribArray",
		"",

		GLuint.IN("index", "")
	)

	void(
		"Finish",
		""
	)

	void(
		"Flush",
		""
	)

	void(
		"FramebufferRenderbuffer",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("renderbuffertarget", ""),
		GLuint.IN("renderbuffer", "")
	)

	void(
		"FramebufferTexture2D",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("textarget", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", "")
	)

	void(
		"FrontFace",
		"",

		GLenum.IN("mode", "")
	)

	void(
		"GenBuffers",
		"",

		AutoSize("buffers") _ GLsizei.IN("n", ""),
		returnValue _ GLuint_p.OUT("buffers", "")
	)

	void(
		"GenerateMipmap",
		"",

		GLenum.IN("target", "")
	)

	void(
		"GenFramebuffers",
		"",

		AutoSize("framebuffers") _ GLsizei.IN("n", ""),
		returnValue _ GLuint_p.OUT("framebuffers", "")
	)

	void(
		"GenRenderbuffers",
		"",

		AutoSize("renderbuffers") _ GLsizei.IN("n", ""),
		returnValue _ GLuint_p.OUT("renderbuffers", "")
	)

	void(
		"GenTextures",
		"",

		AutoSize("textures") _ GLsizei.IN("n", ""),
		returnValue _ GLuint_p.OUT("textures", "")
	)

	void(
		"GetActiveAttrib",
		"",

		GLuint.IN("program", ""),
		GLuint.IN("index", ""),
		AutoSize("name") _ GLsizei.IN("bufSize", ""),
		Check(1) _ nullable _ GLsizei_p.OUT("length", ""),
		Check(1) _ GLint_p.OUT("size", ""),
		Check(1) _ GLenum_p.OUT("type", ""),
		Return(
			"length",
			"glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH)"
		) _ GLcharASCII_p.OUT("name", "")
	)

	void(
		"GetActiveUniform",
		"",

		GLuint.IN("program", ""),
		GLuint.IN("index", ""),
		AutoSize("name") _ GLsizei.IN("bufSize", ""),
		Check(1) _ nullable _ GLsizei_p.OUT("length", ""),
		Check(1) _ GLint_p.OUT("size", ""),
		Check(1) _ GLenum_p.OUT("type", ""),
		Return(
			"length",
			"glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH)"
		) _ GLcharASCII_p.OUT("name", "")
	)

	void(
		"GetAttachedShaders",
		"",

		GLuint.IN("program", ""),
		AutoSize("shaders") _ GLsizei.IN("maxCount", ""),
		Check(1) _ nullable _ GLsizei_p.OUT("count", ""),
		Return(
			"count",
			"glGetProgrami(program, GL_ATTACHED_SHADERS)"
		) _ GLuint_p.OUT("shaders", "")
	)

	GLint(
		"GetAttribLocation",
		"",

		GLuint.IN("program", ""),
		const _ GLcharASCII_p.IN("name", "")
	)

	void(
		"GetBooleanv",
		"",

		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLboolean_p.OUT("data", "")
	)

	void(
		"GetBufferParameteriv",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLint_p.OUT("params", "")
	)

	GLenum(
		"GetError",
		""
	)

	void(
		"GetFloatv",
		"",

		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLfloat_p.OUT("data", "")
	)

	void(
		"GetFramebufferAttachmentParameteriv",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLint_p.OUT("params", "")
	)

	void(
		"GetIntegerv",
		"",

		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLint_p.OUT("data", "")
	)

	void(
		"GetProgramiv",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLint_p.OUT("params", "")
	)

	void(
		"GetProgramInfoLog",
		"",

		GLuint.IN("program", ""),
		AutoSize("infoLog") _ GLsizei.IN("bufSize", ""),
		Check(1) _ nullable _ GLsizei_p.OUT("length", ""),
		Return(
			"length",
			"glGetProgrami(program, GL_INFO_LOG_LENGTH)"
		) _ GLcharUTF8_p.OUT("infoLog", "")
	)

	void(
		"GetRenderbufferParameteriv",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLint_p.OUT("params", "")
	)

	void(
		"GetShaderiv",
		"",

		GLuint.IN("shader", ""),
		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLint_p.OUT("params", "")
	)

	void(
		"GetShaderInfoLog",
		"",

		GLuint.IN("shader", ""),
		AutoSize("infoLog") _ GLsizei.IN("bufSize", ""),
		Check(1) _ nullable _ GLsizei_p.OUT("length", ""),
		Return(
			"length",
			"glGetShaderi(shader, GL_INFO_LOG_LENGTH)"
		) _ GLcharUTF8_p.OUT("infoLog", "")
	)

	void(
		"GetShaderPrecisionFormat",
		"",

		GLenum.IN("shadertype", ""),
		GLenum.IN("precisiontype", ""),
		Check(2) _ GLint_p.OUT("range", ""),
		Check(2) _ GLint_p.OUT("precision", "")
	)

	void(
		"GetShaderSource",
		"",

		GLuint.IN("shader", ""),
		AutoSize("source") _ GLsizei.IN("bufSize", ""),
		Check(1) _ nullable _ GLsizei_p.OUT("length", ""),
		Return("length", "glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH)") _ GLcharUTF8_p.OUT("source", "")
	)

	GLubyteString(
		"GetString",
		"",

		GLenum.IN("name", "")
	)

	void(
		"GetTexParameterfv",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLfloat_p.OUT("params", "")
	)

	void(
		"GetTexParameteriv",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLint_p.OUT("params", "")
	)

	void(
		"GetUniformfv",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		returnValue _ Check(1) _ GLfloat_p.OUT("params", "")
	)

	void(
		"GetUniformiv",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		returnValue _ Check(1) _ GLint_p.OUT("params", "")
	)

	GLint(
		"GetUniformLocation",
		"",

		GLuint.IN("program", ""),
		const _ GLcharASCII_p.IN("name", "")
	)

	void(
		"GetVertexAttribfv",
		"",

		GLuint.IN("index", ""),
		GLenum.IN("pname", ""),
		Check(4) _ GLfloat_p.OUT("params", "")
	)

	void(
		"GetVertexAttribiv",
		"",

		GLuint.IN("index", ""),
		GLenum.IN("pname", ""),
		Check(4) _ GLint_p.OUT("params", "")
	)

	void(
		"GetVertexAttribPointerv",
		"",

		GLuint.IN("index", ""),
		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ void_pp.OUT("pointer", "")
	)

	void(
		"Hint",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("mode", "")
	)

	GLboolean(
		"IsBuffer",
		"",

		GLuint.IN("buffer", "")
	)

	GLboolean(
		"IsEnabled",
		"",

		GLenum.IN("cap", "")
	)

	GLboolean(
		"IsFramebuffer",
		"",

		GLuint.IN("framebuffer", "")
	)

	GLboolean(
		"IsProgram",
		"",

		GLuint.IN("program", "")
	)

	GLboolean(
		"IsRenderbuffer",
		"",

		GLuint.IN("renderbuffer", "")
	)

	GLboolean(
		"IsShader",
		"",

		GLuint.IN("shader", "")
	)

	GLboolean(
		"IsTexture",
		"",

		GLuint.IN("texture", "")
	)

	void(
		"LineWidth",
		"",

		GLfloat.IN("width", "")
	)

	void(
		"LinkProgram",
		"",

		GLuint.IN("program", "")
	)

	void(
		"PixelStorei",
		"",

		GLenum.IN("pname", ""),
		GLint.IN("param", "")
	)

	void(
		"PolygonOffset",
		"",

		GLfloat.IN("factor", ""),
		GLfloat.IN("units", "")
	)

	void(
		"ReadPixels",
		"",

		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		PIXEL_PACK_BUFFER _ MultiType(
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_FLOAT
		) _ void_p.OUT("pixels", "")
	)

	void(
		"ReleaseShaderCompiler",
		""
	)

	void(
		"RenderbufferStorage",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	void(
		"SampleCoverage",
		"",

		GLfloat.IN("value", ""),
		GLboolean.IN("invert", "")
	)

	void(
		"Scissor",
		"",

		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	void(
		"ShaderBinary",
		"",

		AutoSize("shaders") _ GLsizei.IN("count", ""),
		const _ GLuint_p.IN("shaders", ""),
		GLenum.IN("binaryformat", ""),
		const _ void_p.IN("binary", ""),
		AutoSize("binary") _ GLsizei.IN("length", "")
	)

	void(
		"ShaderSource",
		"",

		GLuint.IN("shader", ""),
		AutoSize("string", "length") _ GLsizei.IN("count", ""),
		PointerArray(GLcharUTF8_p, "string", "length") _ const _ GLcharUTF8_p_const_p.IN("string", ""),
		nullable _ const _ GLint_p.IN("length", "")
	)

	void(
		"StencilFunc",
		"",

		GLenum.IN("func", ""),
		GLint.IN("ref", ""),
		GLuint.IN("mask", "")
	)

	void(
		"StencilFuncSeparate",
		"",

		GLenum.IN("face", ""),
		GLenum.IN("func", ""),
		GLint.IN("ref", ""),
		GLuint.IN("mask", "")
	)

	void(
		"StencilMask",
		"",

		GLuint.IN("mask", "")
	)

	void(
		"StencilMaskSeparate",
		"",

		GLenum.IN("face", ""),
		GLuint.IN("mask", "")
	)

	void(
		"StencilOp",
		"",

		GLenum.IN("fail", ""),
		GLenum.IN("zfail", ""),
		GLenum.IN("zpass", "")
	)

	void(
		"StencilOpSeparate",
		"",

		GLenum.IN("face", ""),
		GLenum.IN("sfail", ""),
		GLenum.IN("dpfail", ""),
		GLenum.IN("dppass", "")
	)

	void(
		"TexImage2D",
		"",

		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLint.IN("border", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		PIXEL_UNPACK_BUFFER _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
		) _ nullable _ const _ void_p.IN("pixels", "")
	)

	void(
		"TexParameterf",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		GLfloat.IN("param", "")
	)

	void(
		"TexParameterfv",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ const _ GLfloat_p.IN("params", "")
	)

	void(
		"TexParameteri",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		GLint.IN("param", "")
	)

	void(
		"TexParameteriv",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ const _ GLint_p.IN("params", "")
	)

	void(
		"TexSubImage2D",
		"",

		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		PIXEL_UNPACK_BUFFER _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
		) _ const _ void_p.IN("pixels", "")
	)

	void(
		"Uniform1f",
		"",

		GLint.IN("location", ""),
		GLfloat.IN("v0", "")
	)

	void(
		"Uniform1fv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") _ GLsizei.IN("count", ""),
		const _ GLfloat_p.IN("value", "")
	)

	void(
		"Uniform1i",
		"",

		GLint.IN("location", ""),
		GLint.IN("v0", "")
	)

	void(
		"Uniform1iv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") _ GLsizei.IN("count", ""),
		const _ GLint_p.IN("value", "")
	)

	void(
		"Uniform2f",
		"",

		GLint.IN("location", ""),
		GLfloat.IN("v0", ""),
		GLfloat.IN("v1", "")
	)

	void(
		"Uniform2fv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") shr 1 _ GLsizei.IN("count", ""),
		const _ GLfloat_p.IN("value", "")
	)

	void(
		"Uniform2i",
		"",

		GLint.IN("location", ""),
		GLint.IN("v0", ""),
		GLint.IN("v1", "")
	)

	void(
		"Uniform2iv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") shr 1 _ GLsizei.IN("count", ""),
		const _ GLint_p.IN("value", "")
	)

	void(
		"Uniform3f",
		"",

		GLint.IN("location", ""),
		GLfloat.IN("v0", ""),
		GLfloat.IN("v1", ""),
		GLfloat.IN("v2", "")
	)

	void(
		"Uniform3fv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") / 3 _ GLsizei.IN("count", ""),
		const _ GLfloat_p.IN("value", "")
	)

	void(
		"Uniform3i",
		"",

		GLint.IN("location", ""),
		GLint.IN("v0", ""),
		GLint.IN("v1", ""),
		GLint.IN("v2", "")
	)

	void(
		"Uniform3iv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") / 3 _ GLsizei.IN("count", ""),
		const _ GLint_p.IN("value", "")
	)

	void(
		"Uniform4f",
		"",

		GLint.IN("location", ""),
		GLfloat.IN("v0", ""),
		GLfloat.IN("v1", ""),
		GLfloat.IN("v2", ""),
		GLfloat.IN("v3", "")
	)

	void(
		"Uniform4fv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") shr 2 _ GLsizei.IN("count", ""),
		const _ GLfloat_p.IN("value", "")
	)

	void(
		"Uniform4i",
		"",

		GLint.IN("location", ""),
		GLint.IN("v0", ""),
		GLint.IN("v1", ""),
		GLint.IN("v2", ""),
		GLint.IN("v3", "")
	)

	void(
		"Uniform4iv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") shr 2 _ GLsizei.IN("count", ""),
		const _ GLint_p.IN("value", "")
	)

	void(
		"UniformMatrix2fv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") shr 2 _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	void(
		"UniformMatrix3fv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") / 9 _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	void(
		"UniformMatrix4fv",
		"",

		GLint.IN("location", ""),
		AutoSize("value") shr 4 _ GLsizei.IN("count", ""),
		GLboolean.IN("transpose", ""),
		const _ GLfloat_p.IN("value", "")
	)

	void(
		"UseProgram",
		"",

		GLuint.IN("program", "")
	)

	void(
		"ValidateProgram",
		"",

		GLuint.IN("program", "")
	)

	void(
		"VertexAttrib1f",
		"",

		GLuint.IN("index", ""),
		GLfloat.IN("x", "")
	)

	void(
		"VertexAttrib1fv",
		"",

		GLuint.IN("index", ""),
		Check(1) _ const _ GLfloat_p.IN("v", "")
	)

	void(
		"VertexAttrib2f",
		"",

		GLuint.IN("index", ""),
		GLfloat.IN("x", ""),
		GLfloat.IN("y", "")
	)

	void(
		"VertexAttrib2fv",
		"",

		GLuint.IN("index", ""),
		Check(2) _ const _ GLfloat_p.IN("v", "")
	)

	void(
		"VertexAttrib3f",
		"",

		GLuint.IN("index", ""),
		GLfloat.IN("x", ""),
		GLfloat.IN("y", ""),
		GLfloat.IN("z", "")
	)

	void(
		"VertexAttrib3fv",
		"",

		GLuint.IN("index", ""),
		Check(3) _ const _ GLfloat_p.IN("v", "")
	)

	void(
		"VertexAttrib4f",
		"",

		GLuint.IN("index", ""),
		GLfloat.IN("x", ""),
		GLfloat.IN("y", ""),
		GLfloat.IN("z", ""),
		GLfloat.IN("w", "")
	)

	void(
		"VertexAttrib4fv",
		"",

		GLuint.IN("index", ""),
		Check(4) _ const _ GLfloat_p.IN("v", "")
	)

	void(
		"VertexAttribPointer",
		"",

		GLuint.IN("index", ""),
		GLint.IN("size", ""),
		AutoType("pointer", GL_FLOAT) _ GLenum.IN("type", ""),
		GLboolean.IN("normalized", ""),
		GLsizei.IN("stride", ""),
		ARRAY_BUFFER _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT
		) _ const _ void_p.IN("pointer", "")
	)

	void(
		"Viewport",
		"",

		GLint.IN("x", ""),
		GLint.IN("y", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)
}