/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*

val GL12 = "GL12".nativeClassGL("GL12") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		The core OpenGL 1.2 functionality.

		Extensions promoted to core in this release:
		${ul(
			registryLinkTo("EXT", "texture3D"),
			registryLinkTo("EXT", "bgra"),
			registryLinkTo("EXT", "packed_pixels"),
			registryLinkTo("EXT", "rescale_normal"),
			registryLinkTo("EXT", "separate_specular_color"),
			registryLinkTo("SGIS", "texture_edge_clamp"),
			registryLinkTo("SGIS", "texture_lod"),
			registryLinkTo("EXT", "draw_range_elements")
		)}

		Extensions part of the <em>imaging subset</em>:
		${ul(
			"${registryLinkTo("EXT", "color_table")} and ${registryLinkTo("EXT", "color_subtable")}",
			"${registryLinkTo("EXT", "convolution")} and ${registryLinkTo("HP", "convolution_border_modes")}",
			registryLinkTo("SGI", "color_matrix"),
			registryLinkTo("EXT", "histogram"),
			registryLinkTo("EXT", "blend_color"),
			"${registryLinkTo("EXT", "blend_minmax")} and ${registryLinkTo("EXT", "EXT_blend_subtract")}"
		)}
		"""

	IntConstant(
		"Aliases for smooth points and lines.",

		"ALIASED_POINT_SIZE_RANGE" _ 0x846D,
		"ALIASED_LINE_WIDTH_RANGE" _ 0x846E,

		"SMOOTH_POINT_SIZE_RANGE" _ 0x0B12,
		"SMOOTH_POINT_SIZE_GRANULARITY" _ 0x0B13,
		"SMOOTH_LINE_WIDTH_RANGE" _ 0x0B22,
		"SMOOTH_LINE_WIDTH_GRANULARITY" _ 0x0B23
	)

	// EXT_texture3D

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"TEXTURE_BINDING_3D" _ 0x806A
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev, and by the {@code pname} parameter of PixelStore.",

		"PACK_SKIP_IMAGES" _ 0x806B,
		"PACK_IMAGE_HEIGHT" _ 0x806C,
		"UNPACK_SKIP_IMAGES" _ 0x806D,
		"UNPACK_IMAGE_HEIGHT" _ 0x806E
	)

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of TexImage3D, GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv, and
		GetTexParameterfv.
		""",

		"TEXTURE_3D" _ 0x806F
	)

	IntConstant(
		"Accepted by the {@code target} parameter of TexImage3D, GetTexLevelParameteriv, and GetTexLevelParameterfv.",

		"PROXY_TEXTURE_3D" _ 0x8070
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetTexLevelParameteriv and GetTexLevelParameterfv.",

		"TEXTURE_DEPTH" _ 0x8071
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.",

		"TEXTURE_WRAP_R" _ 0x8072
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_3D_TEXTURE_SIZE" _ 0x8073
	)

	GLvoid(
		"TexImage3D",
		"Specifies a three-dimensional texture image.",

		GLenum.IN("target", "the texture target", "$TEXTURE_3D_TARGETS $PROXY_TEXTURE_3D_TARGETS"),
		GLint.IN("level", "the level-of-detail number"),
		GLint.IN("internalformat", "the texture internal format", TEXTURE_INTERNAL_FORMATS),
		GLsizei.IN("width", "the texture width"),
		GLsizei.IN("height", "the texture height"),
		GLsizei.IN("depth", "the texture depth"),
		GLint.IN("border", "the texture border width"),
		GLenum.IN("format", "the texel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the texel data type", PIXEL_DATA_TYPES),
		nullable _ MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "the texel data")
	)

	GLvoid(
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
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ PIXEL_UNPACK_BUFFER _ const _ GLvoid_p.IN("pixels", "the pixel data")
	)

	GLvoid(
		"CopyTexSubImage3D",
		"""
		Respecifies a rectangular subregion of a slice of an existing 3D texel array. No change is made to the {@code internalformat}, {@code width},
		{@code height}, or {@code border} parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See
		GL11#CopyTexImage2D() for more details.
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

	IntConstant(
		"Accepted by the {@code format} parameter of DrawPixels, GetTexImage, ReadPixels, TexImage1D, and TexImage2D.",

		"BGR" _ 0x80E0,
		"BGRA" _ 0x80E1
	)

	// EXT_packed_pixels

	IntConstant(
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

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"RESCALE_NORMAL" _ 0x803A
	)

	// EXT_separate_specular_color

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of LightModel*, and also by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.
		""",

		"LIGHT_MODEL_COLOR_CONTROL" _ 0x81F8
	)

	IntConstant(
		"Accepted by the {@code param} parameter of LightModel* when {@code pname} is  LIGHT_MODEL_COLOR_CONTROL.",

		"SINGLE_COLOR" _ 0x81F9,
		"SEPARATE_SPECULAR_COLOR" _ 0x81FA
	)

	// SGIS_texture_edge_clamp

	IntConstant(
		"""
		Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
		when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
		""",

		"CLAMP_TO_EDGE" _ 0x812F
	)

	// SGIS_texture_lod

	IntConstant(
		"Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.",

		"TEXTURE_MIN_LOD" _ 0x813A,
		"TEXTURE_MAX_LOD" _ 0x813B,
		"TEXTURE_BASE_LEVEL" _ 0x813C,
		"TEXTURE_MAX_LEVEL" _ 0x813D
	)

	// EXT_draw_range_elements

	IntConstant(
		"Recommended maximum amounts of vertex and index data.",

		"MAX_ELEMENTS_VERTICES" _ 0x80E8,
		"MAX_ELEMENTS_INDICES" _ 0x80E9
	)

	GLvoid(
		"DrawRangeElements",
		"""
		A restricted form of GL11#DrawElements(). mode, start, end, and count match the corresponding arguments to glDrawElements, with the additional
		constraint that all values in the arrays count must lie between start and end, inclusive.

		Implementations denote recommended maximum amounts of vertex and index data, which may be queried by calling glGet with argument
		#MAX_ELEMENTS_VERTICES and #MAX_ELEMENTS_INDICES. If end - start + 1 is greater than the value of GL_MAX_ELEMENTS_VERTICES, or if
		count is greater than the value of GL_MAX_ELEMENTS_INDICES, then the call may operate at reduced performance. There is no requirement that all vertices
		in the range start end be referenced. However, the implementation may partially process unused vertices, reducing performance from what could be
		achieved with an optimal index set.

		When glDrawRangeElements is called, it uses count sequential elements from an enabled array, starting at start to construct a sequence of geometric
		primitives. mode specifies what kind of primitives are constructed, and how the array elements construct these primitives. If more than one array is
		enabled, each is used.

		Vertex attributes that are modified by glDrawRangeElements have an unspecified value after glDrawRangeElements returns. Attributes that aren't modified
		maintain their previous values.
		<h3>Errors</h3>
		It is an error for indices to lie outside the range start end, but implementations may not check for this situation. Such indices cause
		implementation-dependent behavior.
		${ul(
			"GL_INVALID_ENUM is generated if mode is not an accepted value.",
			"GL_INVALID_VALUE is generated if count is negative.",
			"GL_INVALID_VALUE is generated if end &lt; start.",
			"""
			GL_INVALID_OPERATION is generated if a geometry shader is active and mode is incompatible with the input primitive type of the geometry shader in the
			currently installed program object.
			""",
			"""
			GL_INVALID_OPERATION is generated if a non-zero buffer object name is bound to an enabled array or the element array and the buffer object's data
			store is currently mapped.
			"""
		)}
		""",

		GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
		GLuint.IN("start", "the minimum array index contained in {@code indices}"),
		GLuint.IN("end", "the maximum array index contained in {@code indices}"),
		(AutoSize("indices") * "GLChecks.typeToBytes(type)") _ GLsizei.IN("count", " the number of elements to be rendered"),
		AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT) _ GLenum.IN(
			"type",
			"the type of the values in {@code indices}",
			"GL11#UNSIGNED_BYTE GL11#UNSIGNED_SHORT GL11#UNSIGNED_INT"
		),
		const _ ELEMENT_ARRAY_BUFFER _ GLvoid_p.IN("indices", " a pointer to the location where the indices are stored")
	)

}