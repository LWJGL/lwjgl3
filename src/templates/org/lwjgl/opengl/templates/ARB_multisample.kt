/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.deprecatedGL

val ARB_multisample = "ARBMultisample".nativeClassGL("ARB_multisample", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a mechanism to antialias all GL primitives: points, lines, polygons, bitmaps, and images. The technique is to sample all
		primitives multiple times at each pixel. The color sample values are resolved to a single, displayable color each time a pixel is updated, so the
		antialiasing appears to be automatic at the application level. Because each sample includes depth and stencil information, the depth and stencil
		functions perform equivalently to the single-sample mode.

		An additional buffer, called the multisample buffer, is added to the framebuffer. Pixel sample values, including color, depth, and stencil values, are
		stored in this buffer. When the framebuffer includes a multisample buffer, it does not also include separate depth or stencil buffers, even if the
		multisample buffer does not store depth or stencil values. Color buffers (left/right, front/back, and aux) do coexist with the multisample buffer,
		however.

		Multisample antialiasing is most valuable for rendering polygons, because it requires no sorting for hidden surface elimination, and it correctly
		handles adjacent polygons, object silhouettes, and even intersecting polygons. If only points or lines are being rendered, the "smooth" antialiasing
		mechanism provided by the base GL may result in a higher quality image. This extension is designed to allow multisample and smooth antialiasing
		techniques to be alternated during the rendering of a single scene.
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"MULTISAMPLE_ARB" _ 0x809D,
		"SAMPLE_ALPHA_TO_COVERAGE_ARB" _ 0x809E,
		"SAMPLE_ALPHA_TO_ONE_ARB" _ 0x809F,
		"SAMPLE_COVERAGE_ARB" _ 0x80A0
	)

	IntConstant(
		"Accepted by the {@code mask} parameter of PushAttrib.",

		"MULTISAMPLE_BIT_ARB" _ 0x20000000
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"SAMPLE_BUFFERS_ARB" _ 0x80A8,
		"SAMPLES_ARB" _ 0x80A9,
		"SAMPLE_COVERAGE_VALUE_ARB" _ 0x80AA,
		"SAMPLE_COVERAGE_INVERT_ARB" _ 0x80AB
	)

	GLvoid(
		"SampleCoverageARB",
		"""
		Specifies simultaneously the values of #SAMPLE_COVERAGE_VALUE_ARB and #SAMPLE_COVERAGE_INVERT_ARB.

		If #SAMPLE_COVERAGE_ARB is enabled, the fragment coverage is ANDed with another temporary coverage. This temporary coverage is a function of the value
		of #SAMPLE_COVERAGE_VALUE_ARB. If #SAMPLE_COVERAGE_INVERT_ARB is GL11#TRUE, the temporary coverage is inverted (all bit values are inverted) before it
		is ANDed with the fragment coverage.
		""",

		GLfloat.IN("value", "the desired coverage value"),
		GLboolean.IN(
			"invert",
			"if true, the temporary coverage is inverted",
			"GL11#TRUE GL11#FALSE"
		)
	)

}