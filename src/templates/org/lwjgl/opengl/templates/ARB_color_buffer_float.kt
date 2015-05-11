/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_color_buffer_float = "ARBColorBufferFloat".nativeClassGL("ARB_color_buffer_float", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		The standard OpenGL pipeline is based on a fixed-point pipeline. While color components are nominally floating-point values in the pipeline, components
		are frequently clamped to the range [0,1] to accomodate the fixed-point color buffer representation and allow for fixed-point computational hardware.

		This extension adds pixel formats or visuals with floating-point RGBA color components and controls for clamping of color components within the pipeline.

		For a floating-point RGBA pixel format, the size of each float components is specified using the same attributes that are used for defining the size of
		fixed-point components. 32-bit floating-point components are in the standard IEEE float format. 16-bit floating-point components have 1 sign bit, 5
		exponent bits, and 10 mantissa bits.

		Clamping control provides a way to disable certain color clamps and allow programs, and the fixed-function pipeline, to deal in unclamped colors. There
		are controls to modify clamping of vertex colors, clamping of fragment colors throughout the pipeline, and for pixel return data.

		The default state for fragment clamping is #FIXED_ONLY_ARB, which has the behavior of clamping colors for fixed-point color buffers and not clamping
		colors for floating-pont color buffers.

		Vertex colors are clamped by default.

		${GL30.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"RGBA_FLOAT_MODE_ARB" _ 0x8820
	)

	val Targets = IntConstant(
		"Accepted by the {@code target} parameter of ClampColorARB and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"CLAMP_VERTEX_COLOR_ARB" _ 0x891A,
		"CLAMP_FRAGMENT_COLOR_ARB" _ 0x891B,
		"CLAMP_READ_COLOR_ARB" _ 0x891C
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code clamp} parameter of ClampColorARB.",

		"FIXED_ONLY_ARB" _ 0x891D
	)

	GLvoid(
		"ClampColorARB",
		"Controls color clamping.",

		GLenum.IN("target", "the color target", Targets),
		GLenum.IN("clamp", "the new clamping state", "GL11#TRUE GL11#FALSE #FIXED_ONLY_ARB")
	)
}