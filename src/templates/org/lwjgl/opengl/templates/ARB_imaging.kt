/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.opengl.*

val ARB_imaging = "ARBImaging".nativeClassGL("ARB_imaging") {
	nativeImport (
		"OpenGL.h"
	)

	documentation = "Native bindings to the OpenGL 1.2 optional imaging subset."

	val IMAGING_INTERNAL_FORMATS =
		"""
		GL11#RGB GL11#RGBA
		GL30#RG8 GL31#RG8_SNORM GL11#R3_G3_B2 GL11#RGB4 GL11#RGB5 GL41#RGB565 GL11#RGB8
		GL31#RGB8_SNORM GL11#RGB10 GL11#RGB12 GL11#RGB16 GL31#RGB16_SNORM GL11#RGBA2 GL11#RGBA4 GL11#RGB5_A1 GL11#RGBA8 GL31#RGBA8_SNORM GL11#RGB10_A2
		GL11#RGBA12 GL11#RGBA16 GL31#RGBA16_SNORM GL21#SRGB8 GL21#SRGB8_ALPHA8 GL30#RGB16F GL30#RGBA16F GL30#RGB32F GL30#RGBA32F
		GL30#R11F_G11F_B10F

		GL11#ALPHA GL11#LUMINANCE GL11#LUMINANCE_ALPHA GL11#INTENSITY GL11#ALPHA4 GL11#ALPHA8 GL11#ALPHA12 GL11#ALPHA16 GL11#LUMINANCE4 GL11#LUMINANCE8
		GL11#LUMINANCE12 GL11#LUMINANCE16 GL11#LUMINANCE4_ALPHA4 GL11#LUMINANCE6_ALPHA2 GL11#LUMINANCE8_ALPHA8 GL11#LUMINANCE12_ALPHA4 GL11#LUMINANCE12_ALPHA12
		GL11#LUMINANCE16_ALPHA16 GL11#INTENSITY4 GL11#INTENSITY8 GL11#INTENSITY12 GL11#INTENSITY16 GL21#SLUMINANCE GL21#SLUMINANCE8_ALPHA8
		"""

	val PIXEL_DATA_FORMATS =
		"GL11#RED GL11#GREEN GL11#BLUE GL11#ALPHA GL11#RGB GL11#RGBA GL12#BGR GL12#BGRA GL11#LUMINANCE GL11#LUMINANCE_ALPHA"

	val PIXEL_DATA_TYPES =
		"""
		GL11#UNSIGNED_BYTE GL11#BYTE GL11#UNSIGNED_SHORT GL11#SHORT GL11#UNSIGNED_INT GL11#INT
		GL12#UNSIGNED_BYTE_3_3_2 GL12#UNSIGNED_BYTE_2_3_3_REV GL12#UNSIGNED_SHORT_5_6_5 GL12#UNSIGNED_SHORT_5_6_5_REV GL12#UNSIGNED_SHORT_4_4_4_4
		GL12#UNSIGNED_SHORT_4_4_4_4_REV GL12#UNSIGNED_SHORT_5_5_5_1 GL12#UNSIGNED_SHORT_1_5_5_5_REV GL12#UNSIGNED_INT_8_8_8_8
		GL12#UNSIGNED_INT_8_8_8_8_REV GL12#UNSIGNED_INT_10_10_10_2 GL12#UNSIGNED_INT_2_10_10_10_REV
		"""

	// SGI_color_table

	val COLOR_TABLE_TARGETS = IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of ColorTable, CopyColorTable, ColorTableParameteriv, ColorTableParameterfv,
		GetColorTable, GetColorTableParameteriv, and GetColorTableParameterfv.
		""",

		"COLOR_TABLE" _ 0x80D0,
		"POST_CONVOLUTION_COLOR_TABLE" _ 0x80D1,
		"POST_COLOR_MATRIX_COLOR_TABLE" _ 0x80D2
	).javaDocLinks

	val PROXY_COLOR_TABLE_TARGETS = IntConstant(
		"Accepted by the {@code target} parameter of ColorTable, GetColorTableParameteriv, and GetColorTableParameterfv.",

		"PROXY_COLOR_TABLE" _ 0x80D3,
		"PROXY_POST_CONVOLUTION_COLOR_TABLE" _ 0x80D4,
		"PROXY_POST_COLOR_MATRIX_COLOR_TABLE" _ 0x80D5
	).javaDocLinks

	val COLOR_TABLE_PARAMS = IntConstant(
		"""
		Accepted by the {@code pname} parameter of ColorTableParameteriv, ColorTableParameterfv, GetColorTableParameteriv, and
		GetColorTableParameterfv.
		""",

		"COLOR_TABLE_SCALE" _ 0x80D6,
		"COLOR_TABLE_BIAS" _ 0x80D7
	).javaDocLinks

	val COLOR_TABLE_PROPERTIES = IntConstant(
		"Accepted by the {@code pname} parameter of GetColorTableParameteriv and GetColorTableParameterfv.",

		"COLOR_TABLE_FORMAT" _ 0x80D8,
		"COLOR_TABLE_WIDTH" _ 0x80D9,
		"COLOR_TABLE_RED_SIZE" _ 0x80DA,
		"COLOR_TABLE_GREEN_SIZE" _ 0x80DB,
		"COLOR_TABLE_BLUE_SIZE" _ 0x80DC,
		"COLOR_TABLE_ALPHA_SIZE" _ 0x80DD,
		"COLOR_TABLE_LUMINANCE_SIZE" _ 0x80DE,
		"COLOR_TABLE_INTENSITY_SIZE" _ 0x80DF
	).javaDocLinks

	IntConstant(
		"ErrorCode",

		"TABLE_TOO_LARGE" _ 0x8031
	)

	deprecatedGL _ GLvoid(
		"ColorTable",
		"Specifies a color lookup table.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS + " $PROXY_COLOR_TABLE_TARGETS"),
		GLenum.IN("internalformat", "the color table internal format", IMAGING_INTERNAL_FORMATS),
		GLsizei.IN("width", "the color table width"),
		GLenum.IN("format", "the color data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the color data type", PIXEL_DATA_TYPES),
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("table", "the color table data")
	)

	deprecatedGL _ GLvoid(
		"CopyColorTable",
		"Defines a color table in exactly the manner of #ColorTable(), except that the image data are taken from the framebuffer rather than from client memory.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
		GLenum.IN("internalformat", "the color table internal format", IMAGING_INTERNAL_FORMATS),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the color table width")
	)

	deprecatedGL _ GLvoid(
		"ColorTableParameteriv",
		"Specifies the scale and bias parameters for a color table.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
		GLenum.IN("pname", "the parameter to set", COLOR_TABLE_PARAMS),
		const _ Check(4) _ GLint_p.IN("params", "the parameter value")
	)

	deprecatedGL _ GLvoid(
		"ColorTableParameterfv",
		"Float version of #ColorTableParameteriv().",

		GLenum.IN("target", "the color table target"),
		GLenum.IN("pname", "the parameter to set"),
		const _ Check(4) _ GLfloat_p.IN("params", "the parameter value")
	)

	deprecatedGL _ GLvoid(
		"GetColorTable",
		"Returns the current contents of a color table.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
		GLenum.IN("format", "the color data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the color data type", PIXEL_DATA_TYPES),
		MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT) _ PIXEL_PACK_BUFFER _ GLvoid_p.OUT("table", "the color table data")
	)

	deprecatedGL _ GLvoid(
		"GetColorTableParameteriv",
		"Returns the integer value of the specified color table parameter.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS + " $PROXY_COLOR_TABLE_TARGETS"),
		GLenum.IN("pname", "the parameter to query", COLOR_TABLE_PARAMS + " $COLOR_TABLE_PROPERTIES"),
		Check(4) _ returnValue _ GLint_p.OUT("params", "a buffer in which to place the returned value")
	)

	deprecatedGL _ GLvoid(
		"GetColorTableParameterfv",
		"Float version of #GetColorTableParameteriv().",

		GLenum.IN("target", "the color table target"),
		GLenum.IN("pname", "the parameter to query"),
		Check(4) _ returnValue _ GLfloat_p.OUT("params", "a buffer in which to place the returned value")
	)

	// EXT_color_subtable

	deprecatedGL _ GLvoid(
		"ColorSubTable",
		"Respecifies a portion of an existing color table.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
		GLsizei.IN("start", "the starting index of the subregion to respecify"),
		GLsizei.IN("count", "the number of colors in the subregion to respecify"),
		GLenum.IN("format", "the color data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the color data type", PIXEL_DATA_TYPES),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "the color table data")
	)

	deprecatedGL _ GLvoid(
		"CopyColorSubTable",
		"Respecifies a portion of an existing color table using image taken from the framebuffer.",

		GLenum.IN("target", "the color table target", COLOR_TABLE_TARGETS),
		GLsizei.IN("start", "the start index of the subregion to respecify"),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the number of colors in the subregion to respecify")
	)

	// EXT_convolution

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of ConvolutionFilter1D, CopyConvolutionFilter1D, GetConvolutionFilter, ConvolutionParameteri,
		ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
		""",

		"CONVOLUTION_1D" _ 0x8010
	)

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of ConvolutionFilter2D, CopyConvolutionFilter2D, GetConvolutionFilter, ConvolutionParameteri,
		ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
		""",

		"CONVOLUTION_2D" _ 0x8011
	)

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of SeparableFilter2D, SeparableFilter2D, GetSeparableFilter, ConvolutionParameteri,
		ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
		""",

		"SEPARABLE_2D" _ 0x8012
	)

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of ConvolutionParameteri, ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv,
		GetConvolutionParameteriv, and GetConvolutionParameterfv.
		""",

		"CONVOLUTION_BORDER_MODE" _ 0x8013
	)

	val CONVOLUTION_FILTER_PARAMS = IntConstant(
		"Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.",

		"CONVOLUTION_FILTER_SCALE" _ 0x8014,
		"CONVOLUTION_FILTER_BIAS" _ 0x8015
	).javaDocLinks

	IntConstant(
		"""
		Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
		ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
		""",

		"REDUCE" _ 0x8016
	)

	val CONVOLUTION_FILTER_PROPERTIES = IntConstant(
		"Accepted by the {@code pname} parameter of GetConvolutionParameteriv and GetConvolutionParameterfv.",

		"CONVOLUTION_FORMAT" _ 0x8017,
		"CONVOLUTION_WIDTH" _ 0x8018,
		"CONVOLUTION_HEIGHT" _ 0x8019,
		"MAX_CONVOLUTION_WIDTH" _ 0x801A,
		"MAX_CONVOLUTION_HEIGHT" _ 0x801B
	).javaDocLinks

	IntConstant(
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

	deprecatedGL _ GLvoid(
		"ConvolutionFilter1D",
		"Defines a one-dimensional convolution filter.",

		GLenum.IN("target", "the convolution target", "#CONVOLUTION_1D"),
		GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
		GLsizei.IN("width", "the filter width"),
		GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "the filter data")
	)

	deprecatedGL _ GLvoid(
		"ConvolutionFilter2D",
		"Defines a two-dimensional convolution filter.",

		GLenum.IN("target", "the convolution target", "#CONVOLUTION_2D"),
		GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
		GLsizei.IN("width", "the filter width"),
		GLsizei.IN("height", "the filter height"),
		GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "the filter data")
	)

	deprecatedGL _ GLvoid(
		"CopyConvolutionFilter1D",
		"""
		Defines a one-dimensional filter in exactly the manner of #ConvolutionFilter1D(), except that image data are taken from the framebuffer, rather than from
		client memory.
		""",

		GLenum.IN("target", "the convolution target", "#CONVOLUTION_1D"),
		GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the filter width")
	)

	deprecatedGL _ GLvoid(
		"CopyConvolutionFilter2D",
		"""
		Defines a two-dimensional filter in exactly the manner of #ConvolutionFilter1D(), except that image data are taken from the framebuffer, rather than from
		client memory.
		""",

		GLenum.IN("target", "the convolution target", "#CONVOLUTION_2D"),
		GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the filter width"),
		GLsizei.IN("height", "the filter height")
	)

	deprecatedGL _ GLvoid(
		"GetConvolutionFilter",
		"Returns the contents of a convolution filter.",

		GLenum.IN("target", "the convolution target", "ARBImaging#CONVOLUTION_1D ARBImaging#CONVOLUTION_2D"),
		GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
		PIXEL_PACK_BUFFER _ GLvoid_p.OUT("image", "the filter data")
	)

	deprecatedGL _ GLvoid(
		"SeparableFilter2D",
		"Specifies a two-dimensional separable convolution filter.",

		GLenum.IN("target", "the filter target", "#SEPARABLE_2D"),
		GLenum.IN("internalformat", "the filter internal format", IMAGING_INTERNAL_FORMATS),
		GLsizei.IN("width", "the filter width"),
		GLsizei.IN("height", "the filter height"),
		GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("row", "the horizontal filter data"),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("column", "the vertical filter data")
	)

	deprecatedGL _ GLvoid(
		"GetSeparableFilter",
		"Returns the current contents of a separable convolution filter.",

		GLenum.IN("target", "the filter target", "ARBImaging#SEPARABLE_2D"),
		GLenum.IN("format", "the filter data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the filter data type", PIXEL_DATA_TYPES),
		PIXEL_PACK_BUFFER _ GLvoid_p.OUT("row", "a buffer in which to return the filter row"),
		PIXEL_PACK_BUFFER _ GLvoid_p.OUT("column", "a buffer in which to return the filter column"),
		nullable _ GLvoid_p.IN("span", "unused")
	)

	deprecatedGL _ GLvoid(
		"ConvolutionParameteri",
		"Specifies the scale and bias of a convolution filter.",

		GLenum.IN("target", "the filter target", "#CONVOLUTION_1D #CONVOLUTION_2D #SEPARABLE_2D"),
		GLenum.IN("pname", "the parameter to set", "#CONVOLUTION_BORDER_MODE"),
		GLint.IN("param", "the parameter value")
	)

	deprecatedGL _ GLvoid(
		"ConvolutionParameteriv",
		"Pointer version of #ConvolutionParameteri().",

		GLenum.IN("target", "the filter target"),
		GLenum.IN("pname", "the parameter to set", CONVOLUTION_FILTER_PARAMS + " #CONVOLUTION_BORDER_COLOR"),
		const _ Check(4) _ GLint_p.IN("params", "the parameter value")
	)

	deprecatedGL _ GLvoid(
		"ConvolutionParameterf",
		"Float version of #ConvolutionParameteri()",

		GLenum.IN("target", "the filter target"),
		GLenum.IN("pname", "the parameter to set"),
		GLfloat.IN("param", "the parameter value")
	)

	deprecatedGL _ GLvoid(
		"ConvolutionParameterfv",
		"Pointer version of #ConvolutionParameterf().",

		GLenum.IN("target", "the filter target"),
		GLenum.IN("pname", "the parameter to set", CONVOLUTION_FILTER_PARAMS + " #CONVOLUTION_BORDER_COLOR"),
		const _ Check(4) _ GLfloat_p.IN("params", "the parameter value")
	)

	deprecatedGL _ GLvoid(
		"GetConvolutionParameteriv",
		"Returns the value of a convolution filter parameter.",

		GLenum.IN("target", "the filter target", "#CONVOLUTION_1D #CONVOLUTION_2D #SEPARABLE_2D"),
		GLenum.IN("pname", "the parameter to query", CONVOLUTION_FILTER_PROPERTIES),
		returnValue _ Check(4) _ GLint_p.OUT("params", "a buffer in which to return the parameter value")
	)

	deprecatedGL _ GLvoid(
		"GetConvolutionParameterfv",
		"Float version of #GetConvolutionParameteriv().",

		GLenum.IN("target", "the filter target"),
		GLenum.IN("pname", "the parameter to query"),
		returnValue _ Check(4) _ GLfloat_p.OUT("params", "a buffer in which to return the parameter value")
	)

	// HP_convolution_border_modes

	IntConstant(
		"""
		Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
		ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
		""",

		//"IGNORE_BORDER" _ 0x8150,
		"CONSTANT_BORDER" _ 0x8151,
		"REPLICATE_BORDER" _ 0x8153
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.",

		"CONVOLUTION_BORDER_COLOR" _ 0x8154
	)

	// SGI_color_matrix

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"COLOR_MATRIX" _ 0x80B1,
		"COLOR_MATRIX_STACK_DEPTH" _ 0x80B2,
		"MAX_COLOR_MATRIX_STACK_DEPTH" _ 0x80B3
	)

	IntConstant(
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

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of Histogram, ResetHistogram, GetHistogram, GetHistogramParameteriv, and
		GetHistogramParameterfv.
		""",

		"HISTOGRAM" _ 0x8024
	)

	IntConstant(
		"Accepted by the {@code target} parameter of Histogram, GetHistogramParameteriv, and GetHistogramParameterfv.",

		"PROXY_HISTOGRAM" _ 0x8025
	)

	val HISTOGRAM_PROPERTIES = IntConstant(
		"Accepted by the {@code pname} parameter of GetHistogramParameteriv and GetHistogramParameterfv.",

		"HISTOGRAM_WIDTH" _ 0x8026,
		"HISTOGRAM_FORMAT" _ 0x8027,
		"HISTOGRAM_RED_SIZE" _ 0x8028,
		"HISTOGRAM_GREEN_SIZE" _ 0x8029,
		"HISTOGRAM_BLUE_SIZE" _ 0x802A,
		"HISTOGRAM_ALPHA_SIZE" _ 0x802B,
		"HISTOGRAM_LUMINANCE_SIZE" _ 0x802C,
		"HISTOGRAM_SINK" _ 0x802D
	).javaDocLinks

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of Minmax, ResetMinmax, GetMinmax, GetMinmaxParameteriv, and GetMinmaxParameterfv.
		""",

		"MINMAX" _ 0x802E
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetMinmaxParameteriv and GetMinmaxParameterfv.",

		"MINMAX_FORMAT" _ 0x802F,
		"MINMAX_SINK" _ 0x8030
	)

	deprecatedGL _ GLvoid(
		"Histogram",
		"Specifies the histogram table.",

		GLenum.IN("target", "the histogram target", "#HISTOGRAM #PROXY_HISTOGRAM"),
		GLsizei.IN("width", "the histogram width"),
		GLenum.IN("internalformat", "the histogram internal format", IMAGING_INTERNAL_FORMATS),
		GLboolean.IN(
			"sink",
			"""
			whether pixel groups will be consumed by the histogram operation (GL11#TRUE) or passed on to the minmax operation (GL11#FALSE)
			"""
		)
	)

	deprecatedGL _ GLvoid(
		"ResetHistogram",
		"Resets all counters of all elements of the histogram table to zero.",

		GLenum.IN("target", "the histogram target", "#HISTOGRAM")
	)

	deprecatedGL _ GLvoid(
		"GetHistogram",
		"Returns the current contents of the histogram table.",

		GLenum.IN("target", "the histogram target", "ARBImaging#HISTOGRAM"),
		GLboolean.IN(
			"reset",
			"if GL11#TRUE, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not."
		),
		GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel data types", PIXEL_DATA_TYPES),
		PIXEL_PACK_BUFFER _ GLvoid_p.OUT("values", "the pixel data")
	)

	deprecatedGL _ GLvoid(
		"GetHistogramParameteriv",
		"Returns the integer values of the specified histogram parameter",

		GLenum.IN("target", "the histogram target", "#HISTOGRAM"),
		GLenum.IN("pname", "the parameter to query", HISTOGRAM_PROPERTIES),
		returnValue _ Check(1) _ GLint_p.OUT("params", "a buffer in which to return the parameter values")
	)

	deprecatedGL _ GLvoid(
		"GetHistogramParameterfv",
		"Float version of #GetHistogramParameteriv().",

		GLenum.IN("target", "the histogram target"),
		GLenum.IN("pname", "the parameter to query"),
		returnValue _ Check(1) _ GLfloat_p.OUT("params", "a buffer in which to place the returned value")
	)

	deprecatedGL _ GLvoid(
		"Minmax",
		"Specifies the minmax table.",

		GLenum.IN("target", "the minmax target", "#MINMAX"),
		GLenum.IN("internalformat", "the minmax table internal format", IMAGING_INTERNAL_FORMATS),
		GLboolean.IN(
			"sink",
			"whether pixel groups will be consumed by the minmax operation (GL11#TRUE) or passed on to final conversion (GL11#FALSE)"
		)
	)

	deprecatedGL _ GLvoid(
		"ResetMinmax",
		"Resets all minimum and maximum values of {@code target} to to their maximum and minimum representable values, respectively.",

		GLenum.IN("target", "the minmax target", "#MINMAX")
	)

	deprecatedGL _ GLvoid(
		"GetMinmax",
		"Returns the current contents of the minmax table.",

		GLenum.IN("target", "the minmax target", "ARBImaging#MINMAX"),
		GLboolean.IN(
			"reset",
			"""
			If GL11#TRUE, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
			representable value. All values are reset, whether returned or not.
			"""
		),
		GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel data type", PIXEL_DATA_TYPES),
		PIXEL_PACK_BUFFER _ GLvoid_p.OUT("values", "a buffer in which to place the minmax values")
	)

	deprecatedGL _ GLvoid(
		"GetMinmaxParameteriv",
		"Returns the integer value of the specified minmax parameter.",

		GLenum.IN("target", "the minmax target", "#MINMAX"),
		GLenum.IN("pname", "the parameter to query"),
		returnValue _ Check(1) _ GLint_p.OUT("params", "a buffer in which to place the returned value")
	)

	deprecatedGL _ GLvoid(
		"GetMinmaxParameterfv",
		"Float version of #GetMinmaxParameteriv().",

		GLenum.IN("target", "the minmax target", "#MINMAX"),
		GLenum.IN("pname", "the parameter to query"),
		returnValue _ Check(1) _ GLfloat_p.OUT("params", "a buffer in which to place the returned value")
	)

	// EXT_blend_color

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_COLOR" _ 0x8005
	)

	GL14 reuse "BlendColor"

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

	// EXT_blend_subtract

	IntConstant(
		"Accepted by the {@code mode} parameter of BlendEquation.",

		"FUNC_SUBTRACT" _ 0x800A,
		"FUNC_REVERSE_SUBTRACT" _ 0x800B
	)

	GL14 reuse "BlendEquation"
}