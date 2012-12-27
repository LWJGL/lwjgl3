/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*

fun GL12() = "GL12".nativeClassGL("GL12") {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc("The core OpenGL 1.2 functionality.")

	IntConstant.block(
		"Aliases for smooth points and lines.",
		
		"ALIASED_POINT_SIZE_RANGE" _ 0x846D,
		"ALIASED_LINE_WIDTH_RANGE" _ 0x846E,

		"SMOOTH_POINT_SIZE_RANGE" _ 0x0B12,
		"SMOOTH_POINT_SIZE_GRANULARITY" _ 0x0B13,
		"SMOOTH_LINE_WIDTH_RANGE" _ 0x0B22,
		"SMOOTH_LINE_WIDTH_GRANULARITY" _ 0x0B23
	)

	// EXT_texture3D

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev, and by the {@code pname} parameter of PixelStore.",

		"PACK_SKIP_IMAGES" _ 0x806B,
		"PACK_IMAGE_HEIGHT" _ 0x806C,
		"UNPACK_SKIP_IMAGES" _ 0x806D,
		"UNPACK_IMAGE_HEIGHT" _ 0x806E
	)

	IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of TexImage3D, GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv, and
		GetTexParameterfv.
		""",

		"TEXTURE_3D" _ 0x806F
	)

	IntConstant.block(
		"Accepted by the {@code target} parameter of TexImage3D, GetTexLevelParameteriv, and GetTexLevelParameterfv.",

		"PROXY_TEXTURE_3D" _ 0x8070
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetTexLevelParameteriv and GetTexLevelParameterfv.",

		"TEXTURE_DEPTH" _ 0x8071
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.",

		"TEXTURE_WRAP_R" _ 0x8072
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_3D_TEXTURE_SIZE" _ 0x8073
	)

	val TEXTURE_3D_TARGETS = "#GL_TEXTURE_3D GL30#GL_TEXTURE_2D_ARRAY GL30#GL_TEXTURE_CUBE_MAP_ARRAY"

	GLvoid.func(
		"TexImage3D",
		"Specifies a three-dimensional texture image.",

		GLenum.IN("target", "the texture target", "$TEXTURE_3D_TARGETS #GL_PROXY_TEXTURE_3D GL30#GL_PROXY_TEXTURE_2D_ARRAY GL30#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY"),
		GLint.IN("level", "the level-of-detail number"),
		GLint.IN("internalformat", "the texture internal format", TEXTURE_INTERNAL_FORMATS),
		GLsizei.IN("width", "the texture width"),
		GLsizei.IN("height", "the texture height"),
		GLsizei.IN("depth", "the texture depth"),
		GLint.IN("border", "the texture border width"),
		GLenum.IN("format", "the texel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the texel data type", PIXEL_DATA_TYPES),
		mods(
			const,
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE),
			Check(expression = "width * height * depth * GLChecks.getPixelBytes(format, type)", bytes = true),
			PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("pixels", "the texel data")
	)

	GLvoid.func(
		"TexSubImage3D",
		"""
		Respecifies a cubic subregion of an existing 3D texel array. No change is made to the internalformat, width, height, depth, or border parameters of
		the specified texel array, nor is any change made to texel values outside the specified subregion.
		""",

		GLenum.IN("target", "the texture target", TEXTURE_3D_TARGETS),
		GLint.IN("level", "the level-of-detail-number"),
		GLint.IN("xoffset", "the x coordinate of the texel subregion"),
		GLint.IN("yoffset", "the y coordinate of the texel subregion"),
		GLint.IN("zoffset", "the z coordinate of the texel subregion"),
		GLsizei.IN("width", "the subregion width"),
		GLsizei.IN("height", "the subregion height"),
		GLsizei.IN("depth", "the subregion depth"),
		GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel data type", PIXEL_DATA_TYPES),
		mods(
			const,
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE),
			Check(expression = "width * height * GLChecks.getPixelBytes(format, type)", bytes = true),
			PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("pixels", "the pixel data")
	)

	GLvoid.func(
		"CopyTexSubImage3D",
		"""
		Respecifies a rectangular subregion of a slice of an existing 3D texel array. No change is made to the {@code internalformat}, {@code width},
		{@code height}, or {@code border} parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See
		{@link GL11#glCopyTexImage2D} for more details.
		""",
		GLenum.IN("target", "the texture target", TEXTURE_3D_TARGETS),
		GLint.IN("level", "the level-of-detail number"),
		GLint.IN("xoffset", "the x coordinate of the texture subregion to update"),
		GLint.IN("yoffset", "the y coordinate of the texture subregion to update"),
		GLint.IN("zoffset", "the z coordinate of the texture subregion to update"),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the texture subregion width"),
		GLsizei.IN("height", "the texture subregion height")
	)

	// EXT_bgra

	IntConstant.block(
		"Accepted by the {@code format} parameter of DrawPixels, GetTexImage, ReadPixels, TexImage1D, and TexImage2D.",

		"BGR" _ 0x80E0,
		"BGRA" _ 0x80E1
	)

	// EXT_packed_pixels

	IntConstant.block(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
		TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
		SeparableFilter3D, GetSeparableFilter, ColorTable, GetColorTable, TexImage4D, and TexSubImage4D.
		""",

		"UNSIGNED_BYTE_3_3_2" _ 0x8032,
		"UNSIGNED_BYTE_2_3_3_REV" _ 0x8362,
		"UNSIGNED_SHORT_5_6_5" _ 0x8363,
		"UNSIGNED_SHORT_5_6_5_REV" _ 0x8364,
		"UNSIGNED_SHORT_4_4_4_4" _ 0x8033,
		"UNSIGNED_SHORT_4_4_4_4_REV" _ 0x8365,
		"UNSIGNED_SHORT_5_5_5_1" _ 0x8034,
		"UNSIGNED_SHORT_1_5_5_5_REV" _ 0x8366,
		"UNSIGNED_INT_8_8_8_8" _ 0x8035,
		"UNSIGNED_INT_8_8_8_8_REV" _ 0x8367,
		"UNSIGNED_INT_10_10_10_2" _ 0x8036,
		"UNSIGNED_INT_2_10_10_10_REV" _ 0x8368
	)

	// EXT_rescale_normal

	IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"RESCALE_NORMAL" _ 0x803A
	)

	// EXT_separate_specular_color

	IntConstant.block(
		"""
		Accepted by the {@code pname} parameter of LightModel*, and also by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.
		""",

		"LIGHT_MODEL_COLOR_CONTROL" _ 0x81F8
	)

	IntConstant.block(
		"Accepted by the {@code param} parameter of LightModel* when {@code pname} is  LIGHT_MODEL_COLOR_CONTROL.",

		"SINGLE_COLOR" _ 0x81F9,
		"SEPARATE_SPECULAR_COLOR" _ 0x81FA
	)

	// SGIS_texture_edge_clamp

	IntConstant.block(
		"""
		Accepted by the <param> parameter of TexParameteri and TexParameterf, and by the <params> parameter of TexParameteriv and TexParameterfv, when their
		<pname> parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
        """,

		"CLAMP_TO_EDGE" _ 0x812F
	)

	// SGIS_texture_lod

	IntConstant.block(
		"Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.",

		"TEXTURE_MIN_LOD" _ 0x813A,
		"TEXTURE_MAX_LOD" _ 0x813B,
		"TEXTURE_BASE_LEVEL" _ 0x813C,
		"TEXTURE_MAX_LEVEL" _ 0x813D
	)

	// EXT_draw_range_elements

	IntConstant.block(
		"Recommended maximum amounts of vertex and index data.",

		"MAX_ELEMENTS_VERTICES" _ 0x80E8,
		"MAX_ELEMENTS_INDICES" _ 0x80E9
	)

	GLvoid.func(
		"DrawRangeElements",
		"""
		A restricted form of {@link GL11#glDrawElements} with the additional constraint that all index values identified by {@code indices} must lie between
		{@code start} and {@code end} inclusive.
		""",

		GLenum.IN(
			"mode",
			"the kind of primitives being constructed",
			"""
		    #GL_POINTS #GL_LINE_STRIP #GL_LINE_LOOP #GL_LINES #GL_POLYGON #GL_TRIANGLE_STRIP #GL_TRIANGLE_FAN #GL_TRIANGLES #GL_QUAD_STRIP #GL_QUADS
		    GL32#GL_LINES_ADJACENCY GL32#GL_LINE_STRIP_ADJACENCY GL32#GL_TRIANGLES_ADJACENCY GL32#GL_TRIANGLE_STRIP_ADJACENCY GL40#GL_PATCHES
		    """
		),
		GLuint.IN("start", "the index range start"),
		GLuint.IN("end", "the index range end"),
		AutoSize("indices").expression(" * GLChecks.translateTypeToBytes(type)") _ GLsizei.IN("count", "the number of vertices to transfer to the GL"),
		AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT) _ GLenum.IN(
			"type",
			"indicates the type of index values in {@code indices}",
			"#GL_UNSIGNED_BYTE #GL_UNSIGNED_SHORT #GL_UNSIGNED_INT"
		),
		mods(const, ELEMENT_ARRAY_BUFFER) _ GLvoid_p.IN("indices", "the index values")
	)

}