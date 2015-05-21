/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

val WGL_ARB_render_texture = "WGLARBRenderTexture".nativeClassWGL("WGL_ARB_render_texture", ARB) {
	nativeImport (
		"OpenGL.h",
		"WGL.h"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "wgl_render_texture")} extension.

		This extension allows a color buffer to be used for both rendering and texturing. When a color buffer is bound to a texture target it cannot be
		rendered to. Once it has been released from the texture it can be  rendered to once again.

		This extension may provide a performance boost and reduce memory requirements on architectures that support rendering to the same memory where textures
		reside and in the same memory format and layout required by texturing. The functionality is similar to CopyTexImage1D and CopyTexImage2D. However, some
		changes were made to make it easier to avoid copying data:

		${ul(
		"Only color buffers of a pbuffer can be bound as a texture. It is not possible to use the color buffer of a window as a texture.",
		"""
		The texture internal format is determined when the color buffer is associated with the texture, guaranteeing that the color buffer format is equivalent
		to the texture internal format.
		""",
		"""
		When a color buffer of a pbuffer is being used as a texture, the pbuffer can not be used for rendering; this makes it easier for implementations to
		avoid a copy of the image since the semantics of the pointer swap are clear.
		""",
		"""
		The application must release the color buffer from the texture before it can render to the pbuffer again. When the color buffer is bound as a texture,
		draw and read operations on the pbuffer are undefined.
		""",
		"""
		A mipmap attribute can be set, in which case memory will be allocated up front for mipmaps. The application can render the mipmap images or, if
		${registryLinkTo("SGIS", "generate_mipmap")} is supported, they can be automatically generated when the color buffer is bound as a texture.
		""",
		"A texture target is associated with the pbuffer, so that cubemap images can be rendered into a single color buffer."
		)}
		Requires ${WGL_ARB_extensions_string.link}, ${WGL_ARB_pixel_format.link}, ${WGL_ARB_pbuffer.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code attributes} parameter of WGLARBPixelFormat#GetPixelFormatAttribiARB(), and the {@code attribIList} parameters of
		WGLARBPixelFormat#ChoosePixelFormatARB().
		""",

		"BIND_TO_TEXTURE_RGB_ARB" _ 0x2070,
		"BIND_TO_TEXTURE_RGBA_ARB" _ 0x2071
	)

	val wglCreatePbufferARB = "WGLARBPbuffer#CreatePbufferARB()"
	val wglQueryPbufferARB = "WGLARBPbuffer#QueryPbufferARB()"

	IntConstant(
		"Accepted by the {@code attribList} parameter of $wglCreatePbufferARB and by the {@code attribute} parameter of $wglQueryPbufferARB.",

		"TEXTURE_FORMAT_ARB" _ 0x2072,
		"TEXTURE_TARGET_ARB" _ 0x2073,
		"MIPMAP_TEXTURE_ARB" _ 0x2074
	)

	IntConstant(
		"""
		Accepted as a value in the {@code attribList} parameter of $wglCreatePbufferARB and returned in the value parameter of $wglQueryPbufferARB when
		{@code attribute} is #TEXTURE_FORMAT_ARB.
		""",

		"TEXTURE_RGB_ARB" _ 0x2075,
		"TEXTURE_RGBA_ARB" _ 0x2076,
		"NO_TEXTURE_ARB" _ 0x2077
	)

	IntConstant(
		"""
		Accepted as a value in the {@code attribList} parameter of $wglCreatePbufferARB and returned in the value parameter of $wglQueryPbufferARB when
		{@code attribute} is #TEXTURE_TARGET_ARB.
		""",

		"TEXTURE_CUBE_MAP_ARB" _ 0x2078,
		"TEXTURE_1D_ARB" _ 0x2079,
		"TEXTURE_2D_ARB" _ 0x207A
	)

	IntConstant(
		"Accepted by the {@code attribList} parameter of #SetPbufferAttribARB() and by the {@code attribute} parameter of $wglQueryPbufferARB.",

		"MIPMAP_LEVEL_ARB" _ 0x207B,
		"CUBE_MAP_FACE_ARB" _ 0x207C
	)

	IntConstant(
		"""
		Accepted as a value in the {@code attribList} parameter of #SetPbufferAttribARB() and returned in the value parameter of $wglQueryPbufferARB when
		{@code attribute} is #CUBE_MAP_FACE_ARB.
		""",

		"TEXTURE_CUBE_MAP_POSITIVE_X_ARB" _ 0x207D,
		"TEXTURE_CUBE_MAP_NEGATIVE_X_ARB" _ 0x207E,
		"TEXTURE_CUBE_MAP_POSITIVE_Y_ARB" _ 0x207F,
		"TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB" _ 0x2080,
		"TEXTURE_CUBE_MAP_POSITIVE_Z_ARB" _ 0x2081,
		"TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB" _ 0x2082
	)

	IntConstant(
		"Accepted by the {@code buffer} parameter of #BindTexImageARB() and #ReleaseTexImageARB().",

		"FRONT_LEFT_ARB" _ 0x2083,
		"FRONT_RIGHT_ARB" _ 0x2084,
		"BACK_LEFT_ARB" _ 0x2085,
		"BACK_RIGHT_ARB" _ 0x2086,
		"AUX0_ARB" _ 0x2087,
		"AUX1_ARB" _ 0x2088,
		"AUX2_ARB" _ 0x2089,
		"AUX3_ARB" _ 0x208A,
		"AUX4_ARB" _ 0x208B,
		"AUX5_ARB" _ 0x208C,
		"AUX6_ARB" _ 0x208D,
		"AUX7_ARB" _ 0x208E,
		"AUX8_ARB" _ 0x208F,
		"AUX9_ARB" _ 0x2090
	)

	BOOL(
		"BindTexImageARB",
		"""
		Defines a one-dimensional texture image or two-dimensional texture image or a set of two-dimensional cube map texture images. The texture image or
		images consist of the image data in {@code buffer} for the specified {@code pbuffer} and need not be copied. The texture target, the texture format and
		the size of the  texture components are derived from attributes of pbuffer  specified by {@code pbuffer}.
		""",

		HPBUFFERARB.IN("pbuffer", "a pbuffer handle"),
		int.IN("buffer", "the target buffer", "#FRONT_LEFT_ARB #FRONT_RIGHT_ARB #BACK_LEFT_ARB #BACK_RIGHT_ARB #AUX0_ARB WGL_AUX[1-9]_ARB")
	)

	BOOL(
		"ReleaseTexImageARB",
		"""
		Releases the specified color buffer back to the pbuffer. The pbuffer is made available for reading and writing when it no longer has any color buffers
		bound as textures.
		""",

		HPBUFFERARB.IN("pbuffer", "a pbuffer handle"),
		int.IN("buffer", "the target buffer", "#FRONT_LEFT_ARB #FRONT_RIGHT_ARB #BACK_LEFT_ARB #BACK_RIGHT_ARB #AUX0_ARB WGL_AUX[1-9]_ARB")
	)

	BOOL(
		"SetPbufferAttribARB",
		"Sets an attribute to the specified pbuffer.",

		HPBUFFERARB.IN("pbuffer", "a pbuffer handle"),
		const _ nullTerminated _ nullable _ int_p.IN("attribList", "a 0-terminated list of attribute {type, value} pairs containing integer values")
	)
}