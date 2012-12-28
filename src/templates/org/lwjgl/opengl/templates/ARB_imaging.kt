/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.opengl.*

fun ARB_imaging() = "ARBImaging".nativeClassGL("ARB_imaging") {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc(
		"Native bindings to the OpenGL 1.2 optional imaging subset."
	)

	val IMAGING_INTERNAL_FORMATS =
		"""
		#GL_RGB #GL_RGBA
		#GL_RG8 #GL_RG8_SNORM #GL_R3_G3_B2 #GL_RGB4 #GL_RGB5 #GL_RGB565 #GL_RGB8
		#GL_RGB8_SNORM #GL_RGB10 #GL_RGB12 #GL_RGB16 #GL_RGB16_SNORM #GL_RGBA2 #GL_RGBA4 #GL_RGB5_A1 #GL_RGBA8 #GL_RGBA8_SNORM #GL_RGB10_A2
		#GL_RGBA12 #GL_RGBA16 #GL_RGBA16_SNORM #GL_SRGB8 #GL_SRGB8_ALPHA8 #GL_RGB16F #GL_RGBA16F #GL_RGB32F #GL_RGBA32F
		#GL_R11F_G11F_B10F

		#GL_ALPHA #GL_LUMINANCE #GL_LUMINANCE_ALPHA #GL_INTENSITY #GL_ALPHA4 #GL_ALPHA8 #GL_ALPHA12 #GL_ALPHA16 #GL_LUMINANCE4 #GL_LUMINANCE8
		#GL_LUMINANCE12 #GL_LUMINANCE16 #GL_LUMINANCE4_ALPHA4 #GL_LUMINANCE6_ALPHA2 #GL_LUMINANCE8_ALPHA8 #GL_LUMINANCE12_ALPHA4 #GL_LUMINANCE12_ALPHA12
		#GL_LUMINANCE12_ALPHA16 #GL_INTENSITY4 #GL_INTENSITY8 #GL_INTENSITY12 #GL_INTENSITY16 #GL_SLUMINANCE #GL_SLUMINANCE8_ALPHA8
		"""

	val PIXEL_DATA_FORMATS =
		"GL11#GL_RED GL11#GL_GREEN GL11#GL_BLUE GL11#GL_ALPHA GL11#GL_RGB GL11#GL_RGBA GL12#GL_BGR GL12#GL_BGRA GL11#GL_LUMINANCE GL11#GL_LUMINANCE_ALPHA"

	val PIXEL_DATA_TYPES =
		"""
		GL11#GL_UNSIGNED_BYTE GL11#GL_BYTE GL11#GL_UNSIGNED_SHORT GL11#GL_SHORT GL11#GL_UNSIGNED_INT GL11#GL_INT
		GL12#GL_UNSIGNED_BYTE_3_3_2 GL12#UNSIGNED_BYTE_2_3_3_REV GL12#UNSIGNED_SHORT_5_6_5 GL12#UNSIGNED_SHORT_5_6_5_REV GL12#GL_UNSIGNED_SHORT_4_4_4_4
		GL12#UNSIGNED_SHORT_4_4_4_4_REV GL12#GL_UNSIGNED_SHORT_5_5_5_1 GL12#UNSIGNED_SHORT_1_5_5_5_REV GL12#GL_UNSIGNED_INT_8_8_8_8
		GL12#UNSIGNED_INT_8_8_8_8_REV GL12#GL_UNSIGNED_INT_10_10_10_2 GL12#UNSIGNED_INT_2_10_10_10_REV
		"""

	// SGI_color_table

	val COLOR_TABLE_TARGETS = IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of ColorTable, CopyColorTable, ColorTableParameteriv, ColorTableParameterfv,
		GetColorTable, GetColorTableParameteriv, and GetColorTableParameterfv.
		""",

		"COLOR_TABLE" _ 0x80D0,
		"POST_CONVOLUTION_COLOR_TABLE" _ 0x80D1,
		"POST_COLOR_MATRIX_COLOR_TABLE" _ 0x80D2
	).toJavaDocLinks()

	val PROXY_COLOR_TABLE_TARGETS = IntConstant.block(
		"Accepted by the {@code target} parameter of ColorTable, GetColorTableParameteriv, and GetColorTableParameterfv.",

		"PROXY_COLOR_TABLE" _ 0x80D3,
		"PROXY_POST_CONVOLUTION_COLOR_TABLE" _ 0x80D4,
		"PROXY_POST_COLOR_MATRIX_COLOR_TABLE" _ 0x80D5
	).toJavaDocLinks()

	val COLOR_TABLE_PARAMS = IntConstant.block(
		"""
		Accepted by the {@code pname} parameter of ColorTableParameteriv, ColorTableParameterfv, GetColorTableParameteriv, and
		GetColorTableParameterfv.
		""",

		"COLOR_TABLE_SCALE" _ 0x80D6,
		"COLOR_TABLE_BIAS" _ 0x80D7
	).toJavaDocLinks()

	val COLOR_TABLE_PROPERTIES = IntConstant.block(
		"Accepted by the {@code pname} parameter of GetColorTableParameteriv and GetColorTableParameterfv.",

		"COLOR_TABLE_FORMAT" _ 0x80D8,
		"COLOR_TABLE_WIDTH" _ 0x80D9,
		"COLOR_TABLE_RED_SIZE" _ 0x80DA,
		"COLOR_TABLE_GREEN_SIZE" _ 0x80DB,
		"COLOR_TABLE_BLUE_SIZE" _ 0x80DC,
		"COLOR_TABLE_ALPHA_SIZE" _ 0x80DD,
		"COLOR_TABLE_LUMINANCE_SIZE" _ 0x80DE,
		"COLOR_TABLE_INTENSITY_SIZE" _ 0x80DF
	).toJavaDocLinks()

	val ColorTable = (deprecatedGL _ GLvoid.func(
		"ColorTable",
		"Specifies a color lookup table.",

		GLenum.IN("target", "the color table target", "$COLOR_TABLE_TARGETS $PROXY_COLOR_TABLE_TARGETS"),
		GLenum.IN("internalformat", "the color table internal format", IMAGING_INTERNAL_FORMATS),
		GLsizei.IN("width", "the color table width"),
		GLenum.IN("format", "the color data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the color data type", PIXEL_DATA_TYPES),
		mods(
			const,
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT),
			Check(expression = "width * GLChecks.getPixelBytes(format, type)", bytes = true),
			PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("table", "the color table data")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"CopyColorTable",
		"Defines a color table in exactly the manner of $ColorTable, except that the image data are taken from the framebuffer rather than from client memory.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
		GLenum.IN("internalformat", "the color table internal format", IMAGING_INTERNAL_FORMATS),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the color table width")
	)

	val ColorTableParameteriv = (deprecatedGL _ GLvoid.func(
		"ColorTableParameteriv",
		"Specifies the scale and bias parameters for a color table.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
		GLenum.IN("pname", "the parameter to set", COLOR_TABLE_PARAMS),
		mods(const, Check(4)) _ GLint_p.IN("params", "the parameter value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"ColorTableParameterfv",
		"Float version of $ColorTableParameteriv.",

		GLenum.IN("target", "the color table target"),
		GLenum.IN("pname", "the parameter to set"),
		mods(const, Check(4)) _ GLfloat_p.IN("params", "the parameter value")
	)

	deprecatedGL _ GLvoid.func(
		"GetColorTable",
		"Returns the current contents of a color table.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
		GLenum.IN("format", "the color data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the color data type", PIXEL_DATA_TYPES),
		mods(
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT),
			Check(expression = "glGetColorTableParameteri(target, GL_COLOR_TABLE_WIDTH) * GLChecks.getPixelBytes(format, type)", bytes = true, debug = true),
			PIXEL_PACK_BUFFER
		) _ GLvoid_p.OUT("table", "the color table data")
	)

	val GetColorTableParameteriv = (deprecatedGL _ GLvoid.func(
		"GetColorTableParameteriv",
		"Returns the integer value of the specified color table parameter.",

		GLenum.IN("target", "the color table target", "$COLOR_TABLE_TARGETS $PROXY_COLOR_TABLE_TARGETS"),
		GLenum.IN("pname", "the parameter to query", "$COLOR_TABLE_PARAMS $COLOR_TABLE_PROPERTIES"),
		mods(Check(4), returnValue) _ GLint_p.OUT("params", "an array in which to place the returned value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"GetColorTableParameterfv",
		"Float version of $GetColorTableParameteriv.",

		GLenum.IN("target", "the color table target"),
		GLenum.IN("pname", "the parameter to query"),
		mods(Check(4), returnValue) _ GLfloat_p.OUT("params", "an array in which to place the returned value")
	)

	// EXT_color_subtable

	deprecatedGL _ GLvoid.func(
		"ColorSubTable",
		"Respecifies a portion of an existing color table.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
		GLsizei.IN("start", "the starting index of the subregion to respecify"),
		GLsizei.IN("count", "the number of colors in the subregion to respecify"),
		GLenum.IN("format", "the color data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the color data type", PIXEL_DATA_TYPES),
		mods(
			const,
		    Check(expression = "count * GLChecks.getPixelBytes(format, type)", bytes = true),
		    PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("data", "the color table data")
	)

	deprecatedGL _ GLvoid.func(
		"CopyColorSubTable",
		"Respecifies a portion of an existing color table using image taken from the framebuffer.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
		GLsizei.IN("start", "the start index of the subregion to respecify"),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the number of colors in the subregion to respecify")
	)
	
	// EXT_convolution

	IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of ConvolutionFilter1D, CopyConvolutionFilter1D, GetConvolutionFilter, ConvolutionParameteri,
		ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
		""",

		"CONVOLUTION_1D" _ 0x8010
	)

	IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of ConvolutionFilter2D, CopyConvolutionFilter2D, GetConvolutionFilter, ConvolutionParameteri,
		ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
		""",

		"CONVOLUTION_2D" _ 0x8011
	)

	IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of SeparableFilter2D, SeparableFilter2D, GetSeparableFilter, ConvolutionParameteri,
		ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
		""",

		"SEPARABLE_2D" _ 0x8012
	)

	IntConstant.block(
		"""
		Accepted by the {@code pname} parameter of ConvolutionParameteri, ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv,
		GetConvolutionParameteriv, and GetConvolutionParameterfv.
		""",

		"CONVOLUTION_BORDER_MODE" _ 0x8013
	)

	val CONVOLUTION_FILTER_PARAMS = IntConstant.block(
		"Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.",

		"CONVOLUTION_FILTER_SCALE" _ 0x8014,
		"CONVOLUTION_FILTER_BIAS" _ 0x8015
	).toJavaDocLinks()

	IntConstant.block(
		"""
		Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
		ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
		""",

		"REDUCE" _ 0x8016
	)

	val CONVOLUTION_FILTER_PROPERTIES = IntConstant.block(
		"Accepted by the {@code pname} parameter of GetConvolutionParameteriv and GetConvolutionParameterfv.",

		"CONVOLUTION_FORMAT" _ 0x8017,
		"CONVOLUTION_WIDTH" _ 0x8018,
		"CONVOLUTION_HEIGHT" _ 0x8019,
		"MAX_CONVOLUTION_WIDTH" _ 0x801A,
		"MAX_CONVOLUTION_HEIGHT" _ 0x801B
	).toJavaDocLinks()

	IntConstant.block(
		"""
		Accepted by the {@code pname} parameter of PixelTransferi, PixelTransferf, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv,
		and GetDoublev.
		""",

		"POST_CONVOLUTION_RED_SCALE" _ 0x801C,
		"POST_CONVOLUTION_GREEN_SCALE" _ 0x801D,
		"POST_CONVOLUTION_BLUE_SCALE" _ 0x801E,
		"POST_CONVOLUTION_ALPHA_SCALE" _ 0x801F,
		"POST_CONVOLUTION_RED_BIAS" _ 0x8020,
		"POST_CONVOLUTION_GREEN_BIAS" _ 0x8021,
		"POST_CONVOLUTION_BLUE_BIAS" _ 0x8022,
		"POST_CONVOLUTION_ALPHA_BIAS" _ 0x8023
	)

	val ConvolutionFilter1D = (deprecatedGL _ GLvoid.func(
		"ConvolutionFilter1D",
		"Defines a one-dimensional convolution filter.",

		GLenum.IN("target", "the convolution target", "#GL_CONVOLUTION_1D"),
		GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
		GLsizei.IN("width", "the filter width"),
		GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
		mods(
			const,
			Check(expression = "width * GLChecks.getPixelBytes(format, type)", bytes = true),
			PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("data", "the filter data")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"ConvolutionFilter2D",
		"Defines a two-dimensional convolution filter.",

		GLenum.IN("target", "the convolution target", "#GL_CONVOLUTION_2D"),
		GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
		GLsizei.IN("width", "the filter width"),
		GLsizei.IN("height", "the filter height"),
		GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
		mods(
			const,
			Check(expression = "width * height * GLChecks.getPixelBytes(format, type)", bytes = true),
		    PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("data", "the filter data")
	)

	deprecatedGL _ GLvoid.func(
		"CopyConvolutionFilter1D",
		"""
		Defines a one-dimensional filter in exactly the manner of $ConvolutionFilter1D, except that image data are taken from the framebuffer, rather than from
		client memory.
		""",

		GLenum.IN("target", "the convolution target", "#GL_CONVOLUTION_1D"),
		GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the filter width")
	)

	deprecatedGL _ GLvoid.func(
		"CopyConvolutionFilter2D",
		"""
		Defines a two-dimensional filter in exactly the manner of $ConvolutionFilter1D, except that image data are taken from the framebuffer, rather than from
		client memory.
		""",

		GLenum.IN("target", "the convolution target", "#GL_CONVOLUTION_2D"),
		GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the filter width"),
		GLsizei.IN("height", "the filter height")
	)

	deprecatedGL _ GLvoid.func(
		"GetConvolutionFilter",
		"Returns the contents of a convolution filter.",

		GLenum.IN("target", "the convolution target", "#GL_CONVOLUTION_1D #GL_CONVOLUTION_2D"),
		GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
		mods(
			Check(
				expression = "glGetConvolutionParameteri(target, GL_CONVOLUTION_WIDTH) * (target == GL_CONVOLUTION_1D ? 1 : glGetConvolutionParameteri(target, GL_CONVOLUTION_HEIGHT)) * GLChecks.getPixelBytes(format, type)",
				bytes = true
			),
			PIXEL_PACK_BUFFER
		) _ GLvoid_p.OUT("image", "the filter data")
	)

	deprecatedGL _ GLvoid.func(
		"SeparableFilter2D",
		"Specifies a two-dimensional separable convolution filter.",

		GLenum.IN("target", "the filter target", "#GL_SEPARABLE_2D"),
		GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
		GLsizei.IN("width", "the filter width"),
		GLsizei.IN("height", "the filter height"),
		GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
		mods(
			const,
			Check(expression = "width * GLChecks.getPixelBytes(format, type)", bytes = true),
			PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("row", "the horizontal filter data"),
		mods(
			const,
			Check(expression = "height * GLChecks.getPixelBytes(format, type)", bytes = true),
			PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("column", "the vertical filter data")
	)

	deprecatedGL _ GLvoid.func(
		"GetSeparableFilter",
		"Returns the current contents of a separable convolution filter.",

		GLenum.IN("target", "the filter target", "#GL_SEPARABLE_2D"),
		GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
		mods(
			Check(expression = "glGetConvolutionParameteri(target, GL_CONVOLUTION_WIDTH) * GLChecks.getPixelBytes(format, type)", bytes = true, debug = true),
			PIXEL_PACK_BUFFER
		) _ GLvoid_p.OUT("row", "an array in which to return the filter row"),
		mods(
			Check(expression = "glGetConvolutionParameteri(target, GL_CONVOLUTION_HEIGHT) * GLChecks.getPixelBytes(format, type)", bytes = true, debug = true),
			PIXEL_PACK_BUFFER
		) _ GLvoid_p.OUT("column", "an array in which to return the filter column"),
		nullable _ GLvoid_p.IN("span", "unused")
	)

	val ConvolutionParameteri = (deprecatedGL _ GLvoid.func(
		"ConvolutionParameteri",
		"Specifies the scale and bias of a convolution filter.",

		GLenum.IN("target", "the filter target", "#GL_CONVOLUTION_1D #GL_CONVOLUTION_2D #GL_SEPARABLE_2D"),
		GLenum.IN("pname", "the parameter to set", "#GL_CONVOLUTION_BORDER_MODE"),
		GLint.IN("param", "the parameter value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"ConvolutionParameteriv",
		"Pointer version of $ConvolutionParameteri.",

		GLenum.IN("target", "the filter target"),
		GLenum.IN("pname", "the parameter to set", "$CONVOLUTION_FILTER_PARAMS #GL_CONVOLUTION_BORDER_COLOR"),
		mods(const, Check(4)) _ GLint_p.IN("params", "the parameter value")
	)

	val ConvolutionParameterf = (deprecatedGL _ GLvoid.func(
		"ConvolutionParameterf",
		"Float version of $ConvolutionParameteri",

		GLenum.IN("target", "the filter target"),
		GLenum.IN("pname", "the parameter to set"),
		GLfloat.IN("param", "the parameter value")
	))

	deprecatedGL _ GLvoid.func(
		"ConvolutionParameterfv",
		"Pointer version of $ConvolutionParameterf.",

		GLenum.IN("target", "the filter target"),
		GLenum.IN("pname", "the parameter to set", "$CONVOLUTION_FILTER_PARAMS #GL_CONVOLUTION_BORDER_COLOR"),
		mods(const, Check(4)) _ GLfloat_p.IN("params", "the parameter value")
	)

	val GetConvolutionParameteriv = (deprecatedGL _ GLvoid.func(
		"GetConvolutionParameteriv",
		"Returns the value of a convolution filter parameter.",

		GLenum.IN("target", "the filter target", "#GL_CONVOLUTION_1D #GL_CONVOLUTION_2D #GL_SEPARABLE_2D"),
		GLenum.IN("pname", "the parameter to query", CONVOLUTION_FILTER_PROPERTIES),
		mods(returnValue, Check(4)) _ GLint_p.OUT("params", "an array in which to return the parameter value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"GetConvolutionParameterfv",
		"Float version of $GetConvolutionParameteriv.",

		GLenum.IN("target", "the filter target"),
		GLenum.IN("pname", "the parameter to query"),
		mods(returnValue, Check(4)) _ GLfloat_p.OUT("params", "an array in which to return the parameter value")
	)

	// HP_convolution_border_modes

	IntConstant.block(
		"""
		Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
		ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
		""",

		//"IGNORE_BORDER" _ 0x8150,
		"CONSTANT_BORDER" _ 0x8151,
		"REPLICATE_BORDER" _ 0x8153
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.",

		"CONVOLUTION_BORDER_COLOR" _ 0x8154
	)
	
	// SGI_color_matrix

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"COLOR_MATRIX" _ 0x80B1,
		"COLOR_MATRIX_STACK_DEPTH" _ 0x80B2,
		"MAX_COLOR_MATRIX_STACK_DEPTH" _ 0x80B3
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of PixelTransfer*, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"POST_COLOR_MATRIX_RED_SCALE" _ 0x80B4,
		"POST_COLOR_MATRIX_GREEN_SCALE" _ 0x80B5,
		"POST_COLOR_MATRIX_BLUE_SCALE" _ 0x80B6,
		"POST_COLOR_MATRIX_ALPHA_SCALE" _ 0x80B7,
		"POST_COLOR_MATRIX_RED_BIAS" _ 0x80B8,
		"POST_COLOR_MATRIX_GREEN_BIAS" _ 0x80B9,
		"POST_COLOR_MATRIX_BLUE_BIAS" _ 0x80BA,
		"POST_COLOR_MATRIX_ALPHA_BIAS" _ 0x80BB
	)
	
	// EXT_histogram

	IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of Histogram, ResetHistogram, GetHistogram, GetHistogramParameteriv, and
		GetHistogramParameterfv.
		""",

		"HISTOGRAM" _ 0x8024
	)

	IntConstant.block(
		"Accepted by the {@code target} parameter of Histogram, GetHistogramParameteriv, and GetHistogramParameterfv.",

		"PROXY_HISTOGRAM" _ 0x8025
	)

	val HISTOGRAM_PROPERTIES = IntConstant.block(
		"Accepted by the {@code pname} parameter of GetHistogramParameteriv and GetHistogramParameterfv.",

		"HISTOGRAM_WIDTH" _ 0x8026,
		"HISTOGRAM_FORMAT" _ 0x8027,
		"HISTOGRAM_RED_SIZE" _ 0x8028,
		"HISTOGRAM_GREEN_SIZE" _ 0x8029,
		"HISTOGRAM_BLUE_SIZE" _ 0x802A,
		"HISTOGRAM_ALPHA_SIZE" _ 0x802B,
		"HISTOGRAM_LUMINANCE_SIZE" _ 0x802C,
		"HISTOGRAM_SINK" _ 0x802D
	).toJavaDocLinks()

	IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of Minmax, ResetMinmax, GetMinmax, GetMinmaxParameteriv, and GetMinmaxParameterfv.
		""",

		"MINMAX" _ 0x802E
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetMinmaxParameteriv and GetMinmaxParameterfv.",

		"MINMAX_FORMAT" _ 0x802F,
		"MINMAX_SINK" _ 0x8030
	)

	deprecatedGL _ GLvoid.func(
		"Histogram",
		"Specifies the histogram table.",

		GLenum.IN("target", "the histogram target", "#GL_HISTOGRAM #GL_PROXY_HISTOGRAM"),
		GLsizei.IN("width", "the histogram width"),
		GLenum.IN("internalformat", "the histogram internal format", IMAGING_INTERNAL_FORMATS),
		GLboolean.IN(
			"sink",
			"""
			whether pixel groups will be consumed by the histogram operation ({@link GL11#GL_TRUE}) or passed on to the minmax operation ({@link GL11#GL_FALSE})
			"""
		)
	)

	deprecatedGL _ GLvoid.func(
		"ResetHistogram",
		"Resets all counters of all elements of the histogram table to zero.",

		GLenum.IN("target", "the histogram target", "#GL_HISTOGRAM")
	)

	deprecatedGL _ GLvoid.func(
		"GetHistogram",
		"Returns the current contents of the histogram table.",

		GLenum.IN("target", "the histogram target", "#GL_HISTOGRAM"),
		GLboolean.IN(
			"reset",
			"if {@link GL11#GL_TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not."
		),
		GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel data types", PIXEL_DATA_TYPES),
		mods (
			Check(expression = "glGetHistogramParameteri(GL_HISTOGRAM, GL_HISTOGRAM_WIDTH) * GLChecks.getPixelBytes(format, type)", bytes = true, debug = true),
			PIXEL_PACK_BUFFER
		) _ GLvoid_p.OUT("values", "the pixel data")
	)

	val GetHistogramParameteriv = (deprecatedGL _ GLvoid.func(
		"GetHistogramParameteriv",
		"Returns the integer values of the specified histogram parameter",

		GLenum.IN("target", "the histogram target", "#GL_HISTOGRAM"),
		GLenum.IN("pname", "the parameter to query", HISTOGRAM_PROPERTIES),
		mods(returnValue, Check(1)) _ GLint_p.OUT("params", "an array in which to return the parameter values")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"GetHistogramParameterfv",
		"Float version of $GetHistogramParameteriv.",

		GLenum.IN("target", "the histogram target"),
		GLenum.IN("pname", "the parameter to query"),
		mods(returnValue, Check(1)) _ GLfloat_p.OUT("params", "an array in which to place the returned value")
	)

	deprecatedGL _ GLvoid.func(
		"Minmax",
		"Specifies the minmax table.",

		GLenum.IN("target", "the minmax target", "#GL_MINMAX"),
		GLenum.IN("internalformat", "the minmax table internal format", IMAGING_INTERNAL_FORMATS),
		GLboolean.IN(
			"sink",
			"whether pixel groups will be consumed by the minmax operation ({@link GL11#GL_TRUE}) or passed on to final conversion ({@link GL11#GL_FALSE})"
		)
	)

	deprecatedGL _ GLvoid.func(
		"ResetMinmax",
		"Resets all minimum and maximum values of {@code target} to to their maximum and minimum representable values, respectively.",

		GLenum.IN("target", "the minmax target", "#GL_MINMAX")
	)

	deprecatedGL _ GLvoid.func(
		"GetMinmax",
		"Returns the current contents of the minmax table.",

		GLenum.IN("target", "the minmax target", "#GL_MINMAX"),
		GLboolean.IN(
			"reset",
			"""
			If {@link GL11#GL_TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
			representable value. All values are reset, whether returned or not.
			"""
		),
		GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel data type", PIXEL_DATA_TYPES),
		mods(
			Check(expression = "2 * GLChecks.getPixelBytes(format, type)", bytes = true),
		    PIXEL_PACK_BUFFER
		) _ GLvoid_p.OUT("values", "an array in which to place the minmax values")
	)

	val GetMinmaxParameteriv = (deprecatedGL _ GLvoid.func(
		"GetMinmaxParameteriv",
		"Returns the integer value of the specified minmax parameter.",

		GLenum.IN("target", "the minmax target", "#GL_MINMAX"),
		GLenum.IN("pname", "the parameter to query"),
		mods(returnValue, Check(1)) _ GLint_p.OUT("params", "an array in which to place the returned value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"GetMinmaxParameterfv",
		"Float version of $GetMinmaxParameteriv.",

		GLenum.IN("target", "the minmax target", "#GL_MINMAX"),
		GLenum.IN("pname", "the parameter to query"),
		mods(returnValue, Check(1)) _ GLfloat_p.OUT("params", "an array in which to place the returned value")
	)
	
	// EXT_blend_color

	IntConstant.block(
		"Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc.",

		"CONSTANT_COLOR" _ 0x8001,
		"ONE_MINUS_CONSTANT_COLOR" _ 0x8002,
		"CONSTANT_ALPHA" _ 0x8003,
		"ONE_MINUS_CONSTANT_ALPHA" _ 0x8004
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_COLOR" _ 0x8005
	)

	GLvoid.func(
		"BlendColor",
		"Specifies the constant color C<sub>c</sub> to be used in blending.",

		GLfloat.IN("red", "the red color component"),
		GLfloat.IN("green", "the green color component"),
		GLfloat.IN("blue", "the blue color component"),
		GLfloat.IN("alpha", "the alpha color component")
	)
	
	// EXT_blend_minmax

	IntConstant.block(
		"Accepted by the {@code mode} parameter of BlendEquation.",

		"FUNC_ADD" _ 0x8006,
		"MIN" _ 0x8007,
		"MAX" _ 0x8008
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_EQUATION" _ 0x8009
	)

	GLvoid.func(
		"BlendEquation",
		"Controls the blend equations used for per-fragment blending.",

		GLenum.IN("mode", "the blend equation", "#GL_FUNC_ADD #GL_FUNC_SUBTRACT #GL_FUNC_REVERSE_SUBTRACT #GL_MIN #GL_MAX")
	)
	
	// EXT_blend_subtract

	IntConstant.block(
		"Accepted by the {@code mode} parameter of BlendEquation.",

		"FUNC_SUBTRACT" _ 0x800A,
		"FUNC_REVERSE_SUBTRACT" _ 0x800B
	)

}