/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.opengl.*

val ARB_texture_compression = "ARBTextureCompression".nativeClassGL("ARB_texture_compression", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Compressing texture images can reduce texture memory utilization and improve performance when rendering textured primitives. This extension allows
		OpenGL applications to use compressed texture images by providing:
		${ol(
			"A framework upon which extensions providing specific compressed image formats can be built.",
			"""
			A set of generic compressed internal formats that allow applications to specify that texture images should be stored in compressed form without
			needing to code for specific compression formats.
			"""
		)}
		An application can define compressed texture images by providing a texture image stored in a specific compressed image format. This extension does not
		define any specific compressed image formats, but it does provide the mechanisms necessary to enable other extensions that do.

		An application can also define compressed texture images by providing an uncompressed texture image but specifying a compressed internal format. In this
		case, the GL will automatically compress the texture image using the appropriate image format. Compressed internal formats can either be specific (as
		above) or generic. Generic compressed internal formats are not actual image formats, but are instead mapped into one of the specific compressed formats
		provided by the GL (or to an uncompressed base internal format if no appropriate compressed format is available). Generic compressed internal formats
		allow applications to use texture compression without needing to code to any particular compression algorithm. Generic compressed formats allow the use
		of texture compression across a wide range of platforms with differing compression algorithms and also allow future GL implementations to substitute
		improved compression methods transparently.

		${GL13.promoted}
		"""

	IntConstant(
		"Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.",

		"COMPRESSED_ALPHA_ARB" _ 0x84E9,
		"COMPRESSED_LUMINANCE_ARB" _ 0x84EA,
		"COMPRESSED_LUMINANCE_ALPHA_ARB" _ 0x84EB,
		"COMPRESSED_INTENSITY_ARB" _ 0x84EC,
		"COMPRESSED_RGB_ARB" _ 0x84ED,
		"COMPRESSED_RGBA_ARB" _ 0x84EE
	)

	IntConstant(
		"Accepted by the {@code target} parameter of Hint and the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.",

		"TEXTURE_COMPRESSION_HINT_ARB" _ 0x84EF
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetTexLevelParameter.",

		"TEXTURE_COMPRESSED_IMAGE_SIZE_ARB" _ 0x86A0,
		"TEXTURE_COMPRESSED_ARB" _ 0x86A1
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.",

		"NUM_COMPRESSED_TEXTURE_FORMATS_ARB" _ 0x86A2,
		"COMPRESSED_TEXTURE_FORMATS_ARB" _ 0x86A3
	)

	// KHR_texture_compression_astc_ldr formats are only accepted in CompressedTexImage* functions
	val CompressTexImageFormats = "$SPECIFIC_COMPRESSED_TEXTURE_INTERNAL_FORMATS @##KHRTextureCompressionASTCLDR"

	GLvoid(
		"CompressedTexImage3DARB",
		"Specifies a three-dimensional texture image in a compressed format.",

		GLenum.IN("target", "the target texture", "$TEXTURE_3D_TARGETS $PROXY_TEXTURE_3D_TARGETS"),
		GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
		GLenum.IN("internalformat", "the format of the compressed image data", CompressTexImageFormats),
		GLsizei.IN("width", "the width of the texture image"),
		GLsizei.IN("height", "the height of the texture image"),
		GLsizei.IN("depth", "the depth of the texture image"),
		Expression("0") _ GLint.IN("border", "must be 0"),
		AutoSize("data") _ GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "a pointer to the compressed image data")
	)

	GLvoid(
		"CompressedTexImage2DARB",
		"Specifies a two-dimensional texture image in a compressed format.",

		GLenum.IN("target", "the target texture", "$TEXTURE_2D_TARGETS $PROXY_TEXTURE_2D_TARGETS"),
		GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
		GLenum.IN("internalformat", "the format of the compressed image data", CompressTexImageFormats),
		GLsizei.IN("width", "the width of the texture image"),
		GLsizei.IN("height", "the height of the texture image"),
		Expression("0") _ GLint.IN("border", "must be 0"),
		AutoSize("data") _ GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "a pointer to the compressed image data")
	)

	GLvoid(
		"CompressedTexImage1DARB",
		"Specifies a one-dimensional texture image in a compressed format.",

		GLenum.IN("target", "the target texture", "GL11#TEXTURE_1D GL11#PROXY_TEXTURE_1D"),
		GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
		GLenum.IN("internalformat", "the format of the compressed image data", CompressTexImageFormats),
		GLsizei.IN("width", "the width of the texture image"),
		Expression("0") _ GLint.IN("border", "must be 0"),
		AutoSize("data") _ GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "a pointer to the compressed image data")
	)

	GLvoid(
		"CompressedTexSubImage3DARB",
		"Respecifies only a cubic subregion of an existing 3D texel array, with incoming data stored in a specific compressed image format.",

		GLenum.IN("target", "the target texture", TEXTURE_3D_TARGETS),
		GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
		GLint.IN("xoffset", "a texel offset in the x direction within the texture array"),
		GLint.IN("yoffset", "a texel offset in the y direction within the texture array"),
		GLint.IN("zoffset", "a texel offset in the z direction within the texture array"),
		GLsizei.IN("width", "the width of the texture subimage"),
		GLsizei.IN("height", "the height of the texture subimage"),
		GLsizei.IN("depth", "the depth of the texture subimage"),
		GLenum.IN("format", "the format of the compressed image data stored at address {@code data}", CompressTexImageFormats),
		AutoSize("data") _ GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "a pointer to the compressed image data")
	)

	GLvoid(
		"CompressedTexSubImage2DARB",
		"Respecifies only a rectangular subregion of an existing 2D texel array, with incoming data stored in a specific compressed image format.",

		GLenum.IN("target", "the target texture", TEXTURE_2D_TARGETS),
		GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
		GLint.IN("xoffset", "a texel offset in the x direction within the texture array"),
		GLint.IN("yoffset", "a texel offset in the y direction within the texture array"),
		GLsizei.IN("width", "the width of the texture subimage"),
		GLsizei.IN("height", "the height of the texture subimage"),
		GLenum.IN("format", "the format of the compressed image data stored at address {@code data}", CompressTexImageFormats),
		AutoSize("data") _ GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "a pointer to the compressed image data")
	)

	GLvoid(
		"CompressedTexSubImage1DARB",
		"Respecifies only a subregion of an existing 1D texel array, with incoming data stored in a specific compressed image format.",

		GLenum.IN("target", "the target texture", "GL11#TEXTURE_1D"),
		GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
		GLint.IN("xoffset", "a texel offset in the x direction within the texture array"),
		GLsizei.IN("width", "the width of the texture subimage"),
		GLenum.IN("format", "the format of the compressed image data stored at address {@code data}", CompressTexImageFormats),
		AutoSize("data") _ GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
		const _ PIXEL_UNPACK_BUFFER _ GLvoid_p.IN("data", "a pointer to the compressed image data")
	)

	GLvoid(
		"GetCompressedTexImageARB",
		"Returns a compressed texture image.",

		GLenum.IN("target", "the target texture", "GL11#TEXTURE_1D $TEXTURE_2D_FACE_TARGETS $TEXTURE_3D_TARGETS"),
		GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
		Check(
			expression = "GL11.glGetTexLevelParameteri(target, level, GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB)", debug = true
		) _ PIXEL_PACK_BUFFER _ GLvoid_p.OUT("pixels", "a buffer in which to return the compressed texture image")
	)

}