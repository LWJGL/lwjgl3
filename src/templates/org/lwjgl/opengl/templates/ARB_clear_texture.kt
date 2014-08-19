/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_clear_texture = "ARBClearTexture".nativeClassGL("ARB_clear_texture") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Texture objects are fundamental to the operation of OpenGL. They are used as a source for texture sampling and destination for rendering as well as
		being accessed in shaders for image load/store operations. It is also possible to invalidate the contents of a texture. It is currently only possible to
		set texture image data to known values by uploading some or all of a image array from application memory or by attaching it to a framebuffer object and
		using GL11#Clear() or the ${GL30.core} ClearBuffer commands.

		Both uploading initial texture data and clearing by attaching to a framebuffer have potential disadvantages when one simply wants to initialize texture
		data to a known value. Uploading initial data requires the application to allocate a (potentially large) chunk of memory and transferring that to the
		GL. This can be a costly operation both in terms of memory bandwidth and power usage. Alternatively, attaching a texture level to a framebuffer to clear
		it may not be possible if the texture format isn't supported for rendering, or even if it is, attaching the image to a framebuffer object may cause the
		texture to be allocated in certain types of memory, which it may otherwise not need to be placed in.

		This extension solves these problems by providing a mechanism whereby the contents of a texture image array can be set to known values by using the
		#ClearTexImage() or #ClearTexSubImage() commands. These commands can also be useful for initializing an image that will be used for atomic shader
		operations.

        Requires ${GL13.core}. ${GL44.promoted}
		"""

	IntConstant.block(
		"Accepted by the {@code pname} parameter for GL42#GetInternalformati() and GL43#GetInternalformati64().",

		"CLEAR_TEXTURE" _ 0x9365
	)

	val ClearTexSubImage = GLvoid.func(
		"ClearTexSubImage",
		"""
		Fills all or part of a texture image with a constant value.

		Arguments {@code xoffset}, {@code yoffset}, and {@code zoffset} specify the lower left texel coordinates of a {@code width}-wide by {@code height}-high
		by {@code depth}-deep rectangular subregion of the texel array and are interpreted as they are in GL12#TexSubImage3D().

		For 1D array textures, {@code yoffset} is interpreted as the first layer to be cleared and {@code height} is the number of layers to clear. For 2D array
		textures, {@code zoffset} is interpreted as the first layer to be cleared and {@code depth} is the number of layers to clear. Cube map textures are
		treated as an array of six slices in the z-dimension, where the value of {@code zoffset} is interpreted as specifying the cube map face for the
		corresponding {@code layer} and {@code depth} is the number of faces to clear. For cube map array textures, {@code zoffset} is the first layer-face to
		clear, and {@code depth} is the number of layer-faces to clear. Each layer-face is translated into an array layer and a cube map face.

		Negative values of {@code xoffset}, {@code yoffset}, and {@code zoffset} correspond to the coordinates of border texels.
		""",

		GLuint.IN(
			"texture",
			"""
			the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
			the texture image has a compressed internal format
			"""
		),
		GLint.IN("level", "the texture level to clear"),
		GLint.IN("xoffset", "the x coordinate of the texel subregion"),
		GLint.IN("yoffset", "the y coordinate of the texel subregion"),
		GLint.IN("zoffset", "the z coordinate of the texel subregion"),
		GLsizei.IN("width", "the subregion width"),
		GLsizei.IN("height", "the subregion height"),
		GLsizei.IN("depth", "the subregion depth"),
		GLenum.IN("format", "the format of the source data", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the type of the source data", PIXEL_DATA_TYPES),
		mods(
			const,
			nullable,
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE)
		) _ GLvoid_p.IN(
			"data",
			"""
			an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is $NULL,
			then the pointer is ignored and the sub-range of the texture image is filled with zeros.
			"""
		)
	).javaDocLink

   	GLvoid.func(
		"ClearTexImage",
		"""
		Is equivalent to calling $ClearTexSubImage with {@code xoffset}, {@code yoffset}, and {@code zoffset} equal to -{@code b} and {@code width},
		{@code height}, and {@code depth} equal to the dimensions of the texture image plus {@code 2xb} (or zero and one for dimensions the texture doesn't
		have).
		""",

		GLuint.IN(
			"texture",
			"""
			the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
			the texture image has a compressed internal format
			"""
		),
		GLint.IN("level", "the texture level to clear"),
		GLenum.IN("format", "the format of the source data", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the type of the source data", PIXEL_DATA_TYPES),
		const _ GLvoid_p.IN("data", "")
	)

}