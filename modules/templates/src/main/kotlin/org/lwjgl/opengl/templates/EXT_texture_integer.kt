/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_texture_integer = "EXTTextureInteger".nativeClassGL("EXT_texture_integer", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Fixed-point textures in unextended OpenGL have integer components, but those values are taken to represent floating-point values in the range [0,1].
		These integer components are considered "normalized" integers. When such a texture is accessed by a shader or by fixed-function fragment processing,
		floating-point values are returned.

		This extension provides a set of new "unnormalized" integer texture formats. Formats with both signed and unsigned integers are provided. In these
		formats, the components are treated as true integers. When such textures are accessed by a shader, actual integer values are returned.

		Pixel operations that read from or write to a texture or color buffer with unnormalized integer components follow a path similar to that used for color
		index pixel operations, except that more than one component may be provided at once. Integer values flow through the pixel processing pipe, and no pixel
		transfer operations are performed. Integer format enumerants used for such operations indicate unnormalized integer data.

		Textures or render buffers with unnormalized integer formats may also be attached to framebuffer objects to receive fragment color values written by a
		fragment shader. Per-fragment operations that require floating-point color components, including multisample alpha operations, alpha test, blending, and
		dithering, have no effect when the corresponding colors are written to an integer color buffer. The ${registryLinkTo("NV", "gpu_program4")} and
		${registryLinkTo("EXT", "gpu_shader4")} extensions add the capability to fragment programs and fragment shaders to write signed and unsigned integer
		output values.

		This extension does not enforce type consistency for texture accesses or between fragment shaders and the corresponding framebuffer attachments. The
		results of a texture lookup from an integer texture are undefined:
		${ul(
			"for fixed-function fragment processing, or",
		    "for shader texture accesses expecting floating-point return values."
		)}
		The color components used for per-fragment operations and written into a color buffer are undefined:
		${ul(
			"for fixed-function fragment processing with an integer color buffer,",
		    "for fragment shaders that write floating-point color components to an integer color buffer, or",
		    "for fragment shaders that write integer color components to a color buffer with floating point or normalized integer components."
		)}
		Requires ${GL20.core} and ${registryLinkTo("NV", "gpu_program4")} or ${registryLinkTo("EXT", "gpu_shader4")}. ${GL30.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"RGBA_INTEGER_MODE_EXT" _ 0x8D9E
	)

	IntConstant(
		"Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

		"RGBA32UI_EXT" _ 0x8D70,
		"RGB32UI_EXT" _ 0x8D71,
		"ALPHA32UI_EXT" _ 0x8D72,
		"INTENSITY32UI_EXT" _ 0x8D73,
		"LUMINANCE32UI_EXT" _ 0x8D74,
		"LUMINANCE_ALPHA32UI_EXT" _ 0x8D75,
		"RGBA16UI_EXT" _ 0x8D76,
		"RGB16UI_EXT" _ 0x8D77,
		"ALPHA16UI_EXT" _ 0x8D78,
		"INTENSITY16UI_EXT" _ 0x8D79,
		"LUMINANCE16UI_EXT" _ 0x8D7A,
		"LUMINANCE_ALPHA16UI_EXT" _ 0x8D7B,
		"RGBA8UI_EXT" _ 0x8D7C,
		"RGB8UI_EXT" _ 0x8D7D,
		"ALPHA8UI_EXT" _ 0x8D7E,
		"INTENSITY8UI_EXT" _ 0x8D7F,
		"LUMINANCE8UI_EXT" _ 0x8D80,
		"LUMINANCE_ALPHA8UI_EXT" _ 0x8D81,
		"RGBA32I_EXT" _ 0x8D82,
		"RGB32I_EXT" _ 0x8D83,
		"ALPHA32I_EXT" _ 0x8D84,
		"INTENSITY32I_EXT" _ 0x8D85,
		"LUMINANCE32I_EXT" _ 0x8D86,
		"LUMINANCE_ALPHA32I_EXT" _ 0x8D87,
		"RGBA16I_EXT" _ 0x8D88,
		"RGB16I_EXT" _ 0x8D89,
		"ALPHA16I_EXT" _ 0x8D8A,
		"INTENSITY16I_EXT" _ 0x8D8B,
		"LUMINANCE16I_EXT" _ 0x8D8C,
		"LUMINANCE_ALPHA16I_EXT" _ 0x8D8D,
		"RGBA8I_EXT" _ 0x8D8E,
		"RGB8I_EXT" _ 0x8D8F,
		"ALPHA8I_EXT" _ 0x8D90,
		"INTENSITY8I_EXT" _ 0x8D91,
		"LUMINANCE8I_EXT" _ 0x8D92,
		"LUMINANCE_ALPHA8I_EXT" _ 0x8D93
	)

	IntConstant(
		"""
		Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.
		""",

		"RED_INTEGER_EXT" _ 0x8D94,
		"GREEN_INTEGER_EXT" _ 0x8D95,
		"BLUE_INTEGER_EXT" _ 0x8D96,
		"ALPHA_INTEGER_EXT" _ 0x8D97,
		"RGB_INTEGER_EXT" _ 0x8D98,
		"RGBA_INTEGER_EXT" _ 0x8D99,
		"BGR_INTEGER_EXT" _ 0x8D9A,
		"BGRA_INTEGER_EXT" _ 0x8D9B,
		"LUMINANCE_INTEGER_EXT" _ 0x8D9C,
		"LUMINANCE_ALPHA_INTEGER_EXT" _ 0x8D9D
	)

	GLvoid(
		"ClearColorIiEXT",
		"",

		GLint.IN("r", ""),
		GLint.IN("g", ""),
		GLint.IN("b", ""),
		GLint.IN("a", "")
	)

	GLvoid(
		"ClearColorIuiEXT",
		"",

		GLuint.IN("r", ""),
		GLuint.IN("g", ""),
		GLuint.IN("b", ""),
		GLuint.IN("a", "")
	)

	GLvoid(
		"TexParameterIivEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ SingleValue("param") _ GLint_p.IN("params", "")
	)

	GLvoid(
		"TexParameterIuivEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ SingleValue("param") _ GLuint_p.IN("params", "")
	)

	GLvoid(
		"GetTexParameterIivEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	GLvoid(
		"GetTexParameterIuivEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLuint_p.OUT("params", "")
	)
}