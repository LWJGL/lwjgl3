/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*

val GL14 = "GL14".nativeClassGL("GL14") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		The core OpenGL 1.4 functionality.

		Extensions promoted to core in this release:
		${ul(
			registryLinkTo("SGIS", "generate_mipmap"),
			registryLinkTo("NV", "blend_square"),
		    "${registryLinkTo("ARB", "depth_texture")} and ${registryLinkTo("ARB", "shadow")}",
			registryLinkTo("EXT", "fog_coord"),
			registryLinkTo("EXT", "multi_draw_arrays"),
			registryLinkTo("ARB", "point_parameters"),
			registryLinkTo("EXT", "secondary_color"),
			registryLinkTo("EXT", "blend_func_separate"),
			registryLinkTo("EXT", "stencil_wrap"),
			registryLinkTo("ARB", "texture_env_crossbar"),
			registryLinkTo("EXT", "texture_lod_bias"),
			registryLinkTo("ARB", "texture_mirrored_repeat"),
			registryLinkTo("ARB", "window_pos")
		)}
		"""

	// SGIS_generate_mipmap

	IntConstant(
		"Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.",

		"GENERATE_MIPMAP" _ 0x8191
	)

	IntConstant(
		"Accepted by the {@code target} parameter of Hint, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"GENERATE_MIPMAP_HINT" _ 0x8192
	)

	// EXT_blend_color

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_COLOR" _ 0x8005
	)

	GLvoid(
		"BlendColor",
		"Specifies the constant color C<sub>c</sub> to be used in blending.",

		GLfloat.IN("red", "the red color component"),
		GLfloat.IN("green", "the green color component"),
		GLfloat.IN("blue", "the blue color component"),
		GLfloat.IN("alpha", "the alpha color component")
	)

	// EXT_blend_minmax

	IntConstant(
		"Accepted by the {@code mode} parameter of BlendEquation.",

		"FUNC_ADD" _ 0x8006,
		"MIN" _ 0x8007,
		"MAX" _ 0x8008
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_EQUATION" _ 0x8009
	)

	GLvoid(
		"BlendEquation",
		"Controls the blend equations used for per-fragment blending.",

		GLenum.IN("mode", "the blend equation", "#FUNC_ADD #FUNC_SUBTRACT #FUNC_REVERSE_SUBTRACT #MIN #MAX")
	)

	// EXT_blend_subtract

	IntConstant(
		"Accepted by the {@code mode} parameter of BlendEquation.",

		"FUNC_SUBTRACT" _ 0x800A,
		"FUNC_REVERSE_SUBTRACT" _ 0x800B
	)

	// ARB_depth_texture

	IntConstant(
		"Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, CopyTexImage1D and CopyTexImage2D.",

		"DEPTH_COMPONENT16" _ 0x81A5,
		"DEPTH_COMPONENT24" _ 0x81A6,
		"DEPTH_COMPONENT32" _ 0x81A7
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.",

		"TEXTURE_DEPTH_SIZE" _ 0x884A
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.",

		"DEPTH_TEXTURE_MODE" _ 0x884B
	)

	// ARB_shadow

	IntConstant(
		"Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.",

		"TEXTURE_COMPARE_MODE" _ 0x884C,
		"TEXTURE_COMPARE_FUNC" _ 0x884D
	)

	IntConstant(
		"""
		Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is
		TEXTURE_COMPARE_MODE.
		""",

		"COMPARE_R_TO_TEXTURE" _ 0x884E
	)

	// EXT_fog_coord

	IntConstant(
		"Accepted by the {@code pname} parameter of Fogi and Fogf.",

		"FOG_COORDINATE_SOURCE" _ 0x8450
	)

	IntConstant(
		"Accepted by the {@code param} parameter of Fogi and Fogf.",

		"FOG_COORDINATE" _ 0x8451,
		"FRAGMENT_DEPTH" _ 0x8452
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"CURRENT_FOG_COORDINATE" _ 0x8453,
		"FOG_COORDINATE_ARRAY_TYPE" _ 0x8454,
		"FOG_COORDINATE_ARRAY_STRIDE" _ 0x8455
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetPointerv.",

		"FOG_COORDINATE_ARRAY_POINTER" _ 0x8456
	)

	IntConstant(
		"Accepted by the {@code array} parameter of EnableClientState and DisableClientState.",

		"FOG_COORDINATE_ARRAY" _ 0x8457
	)

	deprecatedGL _ GLvoid(
		"FogCoordf",
		"Sets the current fog coordinate.",

		GLfloat.IN("coord", "the fog coordinate value")
	)

	deprecatedGL _ GLvoid(
		"FogCoordd",
		"Double version of #FogCoordf().",

		GLdouble.IN("coord", "the fog coordinate value")
	)

	deprecatedGL _ GLvoid(
		"FogCoordfv",
		"Pointer version of #FogCoordf().",

		const _ Check(1) _ GLfloat_p.IN("coord", "the fog coordinate value")
	)

	deprecatedGL _ GLvoid(
		"FogCoorddv",
		"Pointer version of #FogCoordd().",

		const _ Check(1) _ GLdouble_p.IN("coord", "the fog coordinate value")
	)

	deprecatedGL _ GLvoid(
		"FogCoordPointer",
		"Specifies the location and organization of a fog coordinate array.",

		AutoType("pointer", GL_FLOAT) _ GLenum.IN(
			"type",
			"the data type of the values stored in the array",
			"GL30#HALF_FLOAT GL11#FLOAT GL11#DOUBLE"
		),
		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		const _ ARRAY_BUFFER _ GLvoid_p.IN("pointer", "the fog coordinate array data")
	)

	// EXT_multi_draw_arrays

	GLvoid(
		"MultiDrawArrays",
		"Renders multiple sets of primitives from array data.",

		GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
		const _ GLint_p.IN("first", "an array of starting indices in the enabled arrays"),
		const _ GLsizei_p.IN("count", "an array of the number of indices to be rendered"),
		AutoSize("first", "count") _ GLsizei.IN("primcount", "the size of {@code first} and {@code count}")
	)

	GLvoid(
		"MultiDrawElements",
		"""
		Renders multiple sets of primitives by specifying indices of array data elements.

		<b>LWJGL note</b>: Use MemoryUtil##memAddress() to retrieve pointers to the index buffers.
		""",

		GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
		GLsizei_p.IN("count", "an array of the elements counts"),
		GLenum.IN("type", "the type of the values in indices", "GL11#UNSIGNED_BYTE GL11#UNSIGNED_SHORT GL11#UNSIGNED_INT"),
		const _ GLvoid_pp.IN("indices", "a pointer to the location where the indices are stored"),
		AutoSize("count", "indices") _ GLsizei.IN("primcount", "the size of the {@code count} array")
	)

	// ARB_point_parameters

	IntConstant(
		"Accepted by the {@code pname} parameter of PointParameterfARB, and the {@code pname} of Get.",

		"POINT_SIZE_MIN" _ 0x8126,
		"POINT_SIZE_MAX" _ 0x8127,
		"POINT_FADE_THRESHOLD_SIZE" _ 0x8128,
		"POINT_DISTANCE_ATTENUATION" _ 0x8129
	)

	GLvoid(
		"PointParameterf",
		"Sets the float value of a pointer parameter.",

		GLenum.IN("pname", "the parameter to set", "#POINT_SIZE_MIN #POINT_SIZE_MAX  #POINT_FADE_THRESHOLD_SIZE"),
		GLfloat.IN("param", "the parameter value")
	)

	GLvoid(
		"PointParameteri",
		"Integer version of #PointParameterf().",

		GLenum.IN("pname", "the parameter to set", "#POINT_SIZE_MIN #POINT_SIZE_MAX  #POINT_FADE_THRESHOLD_SIZE"),
		GLint.IN("param", "the parameter value")
	)

	GLvoid(
		"PointParameterfv",
		"Pointer version of #PointParameterf().",

		GLenum.IN("pname", "the parameter to set", "#POINT_DISTANCE_ATTENUATION"),
		const _ Check(3) _ GLfloat_p.IN("params", "the parameter value")
	)

	GLvoid(
		"PointParameteriv",
		"Pointer version of #PointParameteri().",

		GLenum.IN("pname", "the parameter to set", "#POINT_DISTANCE_ATTENUATION"),
		const _ Check(3) _ GLint_p.IN("params", "the parameter value")
	)

	// EXT_secondary_color

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"COLOR_SUM" _ 0x8458
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"CURRENT_SECONDARY_COLOR" _ 0x8459,
		"SECONDARY_COLOR_ARRAY_SIZE" _ 0x845A,
		"SECONDARY_COLOR_ARRAY_TYPE" _ 0x845B,
		"SECONDARY_COLOR_ARRAY_STRIDE" _ 0x845C
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetPointerv.",

		"SECONDARY_COLOR_ARRAY_POINTER" _ 0x845D
	)

	IntConstant(
		"Accepted by the {@code array} parameter of EnableClientState and DisableClientState.",

		"SECONDARY_COLOR_ARRAY" _ 0x845E
	)

	// Secondary color functions javadoc
	val colorRed = "the red component of the current secondary color"
	val colorGreen = "the green component of the current secondary color"
	val colorBlue = "the blue component of the current secondary color"
	val colorBuffer = "the secondary color buffer"

	deprecatedGL _ GLvoid(
		"SecondaryColor3b",
		"Sets the R, G, and B components of the current secondary color. The alpha component is set to 1.0.",

		GLbyte.IN("red", colorRed),
		GLbyte.IN("green", colorGreen),
		GLbyte.IN("blue", colorBlue)
	)
	deprecatedGL _ GLvoid("SecondaryColor3s", "Short version of #SecondaryColor3b()", GLshort.IN("red", colorRed), GLshort.IN("green", colorGreen), GLshort.IN("blue", colorBlue))
	deprecatedGL _ GLvoid("SecondaryColor3i", "Integer version of #SecondaryColor3b()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))
	deprecatedGL _ GLvoid("SecondaryColor3f", "Float version of #SecondaryColor3b()", GLfloat.IN("red", colorRed), GLfloat.IN("green", colorGreen), GLfloat.IN("blue", colorBlue))
	deprecatedGL _ GLvoid("SecondaryColor3d", "Double version of #SecondaryColor3b()", GLdouble.IN("red", colorRed), GLdouble.IN("green", colorGreen), GLdouble.IN("blue", colorBlue))
	deprecatedGL _ GLvoid("SecondaryColor3ub", "Unsigned version of #SecondaryColor3b()", GLubyte.IN("red", colorRed), GLubyte.IN("green", colorGreen), GLubyte.IN("blue", colorBlue))
	deprecatedGL _ GLvoid("SecondaryColor3us", "Unsigned short version of #SecondaryColor3b()", GLushort.IN("red", colorRed), GLushort.IN("green", colorGreen), GLushort.IN("blue", colorBlue))
	deprecatedGL _ GLvoid("SecondaryColor3ui", "Unsigned int version of #SecondaryColor3b()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))

	deprecatedGL _ GLvoid("SecondaryColor3bv", "Byte pointer version of #SecondaryColor3b().", const _ Check(3) _ GLbyte_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid("SecondaryColor3sv", "Pointer version of #SecondaryColor3s().", const _ Check(3) _ GLshort_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid("SecondaryColor3iv", "Pointer version of #SecondaryColor3i().", const _ Check(3) _ GLint_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid("SecondaryColor3fv", "Pointer version of #SecondaryColor3f().", const _ Check(3) _ GLfloat_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid("SecondaryColor3dv", "Pointer version of #SecondaryColor3d().", const _ Check(3) _ GLdouble_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid("SecondaryColor3ubv", "Pointer version of #SecondaryColor3ub().", const _ Check(3) _ GLubyte_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid("SecondaryColor3usv", "Pointer version of #SecondaryColor3us().", const _ Check(3) _ GLushort_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid("SecondaryColor3uiv", "Pointer version of #SecondaryColor3ui().", const _ Check(3) _ GLuint_p.IN("v", colorBuffer))

	deprecatedGL _ GLvoid(
		"SecondaryColorPointer",
		"Specifies the location and organization of a secondary color array.",

		GLint.IN("size", "the number of values per vertex that are stored in the array, as well as their component ordering", "3"),
		AutoType("pointer", GL_BYTE, GL_UNSIGNED_BYTE, GL_SHORT, GL_UNSIGNED_SHORT, GL_FLOAT) _ GLenum.IN(
			"type",
			"the data type of the values stored in the array",
			"""
			GL11#BYTE GL11#UNSIGNED_BYTE GL11#SHORT GL11#UNSIGNED_SHORT GL11#INT GL11#UNSIGNED_INT GL30#HALF_FLOAT GL11#FLOAT
			GL11#DOUBLE GL12#UNSIGNED_INT_2_10_10_10_REV GL33#INT_2_10_10_10_REV
			"""
		),
		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		const _ ARRAY_BUFFER _ GLvoid_p.IN("pointer", "the secondary color array data")
	)

	// EXT_blend_func_separate

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_DST_RGB" _ 0x80C8,
		"BLEND_SRC_RGB" _ 0x80C9,
		"BLEND_DST_ALPHA" _ 0x80CA,
		"BLEND_SRC_ALPHA" _ 0x80CB
	)

	GLvoid(
		"BlendFuncSeparate",
		"Specifies pixel arithmetic for RGB and alpha components separately.",

		GLenum.IN("sfactorRGB", "how the red, green, and blue blending factors are computed. The initial value is GL_ONE."),
		GLenum.IN("dfactorRGB", "how the red, green, and blue destination blending factors are computed. The initial value is GL_ZERO."),
		GLenum.IN("sfactorAlpha", "how the alpha source blending factor is computed. The initial value is GL_ONE."),
		GLenum.IN("dfactorAlpha", "how the alpha destination blending factor is computed. The initial value is GL_ZERO.")
	)

	// EXT_stencil_wrap

	IntConstant(
		"Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp.",

		"INCR_WRAP" _ 0x8507,
		"DECR_WRAP" _ 0x8508
	)

	// EXT_texture_lod_bias

	IntConstant(
		"Accepted by the {@code target} parameters of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, Texenviv, and TexEnvfv.",

		"TEXTURE_FILTER_CONTROL" _ 0x8500
	)

	IntConstant(
		"""
		When the {@code target} parameter of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, TexEnviv, and TexEnvfv is TEXTURE_FILTER_CONTROL, then the value of
		{@code pname} may be.
		""",

		"TEXTURE_LOD_BIAS" _ 0x8501
	)

	IntConstant(
		"Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_TEXTURE_LOD_BIAS" _ 0x84FD
	)

	// ARB_texture_mirrored_repeat

	IntConstant(
		"""
		Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
		when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
		""",

		"MIRRORED_REPEAT" _ 0x8370
	)

	// ARB_window_pos

	deprecatedGL _ GLvoid(
		"WindowPos2i",
		"Alternate way to set the current raster position. {@code z} is implictly set to 0.",

		GLint.IN("x", "the x value"),
		GLint.IN("y", "the y value")
	)

	deprecatedGL _ GLvoid("WindowPos2s", "Short version of #WindowPos2i().", GLshort.IN("x", "the x value"), GLshort.IN("y", "the y value"))
	deprecatedGL _ GLvoid("WindowPos2f", "Float version of #WindowPos2i().", GLfloat.IN("x", "the x value"), GLfloat.IN("y", "the y value"))
	deprecatedGL _ GLvoid("WindowPos2d", "Double version of #WindowPos2i().", GLdouble.IN("x", "the x value"), GLdouble.IN("y", "the y value"))

	deprecatedGL _ GLvoid("WindowPos2iv", "Pointer version of #WindowPos2i().", const _ Check(2) _ GLint_p.IN("p", "the position value"))
	deprecatedGL _ GLvoid("WindowPos2sv", "Pointer version of #WindowPos2s().", const _ Check(2) _ GLshort_p.IN("p", "the position value"))
	deprecatedGL _ GLvoid("WindowPos2fv", "Pointer version of #WindowPos2f().", const _ Check(2) _ GLfloat_p.IN("p", "the position value"))
	deprecatedGL _ GLvoid("WindowPos2dv", "Pointer version of #WindowPos2d().", const _ Check(2) _ GLdouble_p.IN("p", "the position value"))

	deprecatedGL _ GLvoid(
		"WindowPos3i",
		"Alternate way to set the current raster position.",

		GLint.IN("x", "the x value"),
		GLint.IN("y", "the y value"),
		GLint.IN("z", "the z value")
	)

	deprecatedGL _ GLvoid("WindowPos3s", "Short version of #WindowPos3i().", GLshort.IN("x", "the x value"), GLshort.IN("y", "the y value"), GLshort.IN("z", "the z value"))
	deprecatedGL _ GLvoid("WindowPos3f", "Float version of #WindowPos3i().", GLfloat.IN("x", "the x value"), GLfloat.IN("y", "the y value"), GLfloat.IN("z", "the z value"))
	deprecatedGL _ GLvoid("WindowPos3d", "Double version of #WindowPos3i().", GLdouble.IN("x", "the x value"), GLdouble.IN("y", "the y value"), GLdouble.IN("z", "the z value"))

	deprecatedGL _ GLvoid("WindowPos3iv", "Pointer version of #WindowPos3i().", const _ Check(3) _ GLint_p.IN("p", "the position value"))
	deprecatedGL _ GLvoid("WindowPos3sv", "Pointer version of #WindowPos3s().", const _ Check(3) _ GLshort_p.IN("p", "the position value"))
	deprecatedGL _ GLvoid("WindowPos3fv", "Pointer version of #WindowPos3f().", const _ Check(3) _ GLfloat_p.IN("p", "the position value"))
	deprecatedGL _ GLvoid("WindowPos3dv", "Pointer version of #WindowPos3d().", const _ Check(3) _ GLdouble_p.IN("p", "the position value"))

}