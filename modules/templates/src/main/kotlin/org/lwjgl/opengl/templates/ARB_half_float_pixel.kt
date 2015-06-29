/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_half_float_pixel = "ARBHalfFloatPixel".nativeClassGL("ARB_half_float_pixel", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension introduces a new data type for half-precision (16-bit) floating-point quantities. The floating-point format is very similar to the IEEE
		single-precision floating-point standard, except that it has only 5 exponent bits and 10 mantissa bits. Half-precision floats are smaller than full
		precision floats and provide a larger dynamic range than similarly sized normalized scalar data types.

		This extension allows applications to use half-precision floating-point data when specifying pixel data. It extends the existing image specification
		commands to accept the new data type.

		Floating-point data is clamped to [0, 1] at various places in the GL unless clamping is disabled with the ARB_color_buffer_float extension.
    
		Requires ${GL15.core}. ${GL30.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, GetTexImage, TexSubImage1D, TexSubImage2D,
		TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
		ColorTable, ColorSubTable, and GetColorTable.
		""",

		"HALF_FLOAT_ARB" _ 0x140B
	)
}