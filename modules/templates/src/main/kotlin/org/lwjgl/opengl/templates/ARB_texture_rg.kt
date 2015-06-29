/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_rg = "ARBTextureRG".nativeClassGL("ARB_texture_rg") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Historically one- and two- component textures have been specified in OpenGL using the intensity, luminance or luminance-alpha (I/L/LA) formats. With the
		advent of programmable shaders and render-to-texture capabilites these legacy formats carry some historical artifacts which are no longer useful.

		For example, when sampling from such textures, the luminance values are replicated across the color components, and the intensity values are replicated
		across both the color and alpha components. This is no longer necessary with programmable shaders.

		It is also desirable to be able to render to one- and two- component format textures using capabilities such as framebuffer objects (FBO), but rendering
		to I/L/LA formats is under-specified (specifically how to map R/G/B/A values to I/L/A texture channels).

		This extension adds new base internal formats for the one-component #RED and two-component #RG (red green) texture formats as well as sized internal
		formats for fixed-point, floating-point and pure integer texture formats. The new texure formats can be used for texturing as well as for rendering into
		with framebuffer objects.

        ${GL30.promoted}
		"""

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
		"RED" _ 0x1903,
		"RG" _ 0x8227,
		"COMPRESSED_RED" _ 0x8225,
		"COMPRESSED_RG" _ 0x8226
	)

	IntConstant(
		"Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels.",

		"RG_INTEGER" _ 0x8228
	)
}