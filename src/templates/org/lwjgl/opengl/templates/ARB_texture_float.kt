/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_float = "ARBTextureFloat".nativeClassGL("ARB_texture_float", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds texture internal formats with 16- and 32-bit floating-point components. The 32-bit floating-point components are in the standard
		IEEE float format. The 16-bit floating-point components have 1 sign bit, 5 exponent bits, and 10 mantissa bits. Floating-point components are clamped to
		the limits of the range representable by their format.

		${GL30.promoted}
		"""

	IntConstant(
		"Accepted by the {@code value} parameter of GetTexLevelParameter.",

		"TEXTURE_RED_TYPE_ARB" _ 0x8C10,
		"TEXTURE_GREEN_TYPE_ARB" _ 0x8C11,
		"TEXTURE_BLUE_TYPE_ARB" _ 0x8C12,
		"TEXTURE_ALPHA_TYPE_ARB" _ 0x8C13,
		"TEXTURE_LUMINANCE_TYPE_ARB" _ 0x8C14,
		"TEXTURE_INTENSITY_TYPE_ARB" _ 0x8C15,
		"TEXTURE_DEPTH_TYPE_ARB" _ 0x8C16
	)

	IntConstant(
		"Returned by the {@code params} parameter of GetTexLevelParameter.",

		"UNSIGNED_NORMALIZED_ARB" _ 0x8C17
	)

	IntConstant(
		"Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

		"RGBA32F_ARB" _ 0x8814,
		"RGB32F_ARB" _ 0x8815,
		"ALPHA32F_ARB" _ 0x8816,
		"INTENSITY32F_ARB" _ 0x8817,
		"LUMINANCE32F_ARB" _ 0x8818,
		"LUMINANCE_ALPHA32F_ARB" _ 0x8819,
		"RGBA16F_ARB" _ 0x881A,
		"RGB16F_ARB" _ 0x881B,
		"ALPHA16F_ARB" _ 0x881C,
		"INTENSITY16F_ARB" _ 0x881D,
		"LUMINANCE16F_ARB" _ 0x881E,
		"LUMINANCE_ALPHA16F_ARB" _ 0x881F
	)
}