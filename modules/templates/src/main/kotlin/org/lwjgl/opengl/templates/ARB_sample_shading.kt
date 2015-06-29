/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_sample_shading = "ARBSampleShading".nativeClassGL("ARB_sample_shading", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		In standard multisample rendering, an implementation is allowed to assign the same color and texture coordinate values to each sample, which then allows
		the optimization where the shader is only evaluated once and then distributed to the samples that have been determined to be covered by the primitive
		currently being rasterized. This can cause aliasing where the input color and texture coordinates are used to generate a result that doesn't antialias
		itself, for example with alpha-tested transparency.

		This extension adds the ability to explicitly request that an implementation use a minimum number of unique set of fragment computation inputs when
		multisampling a pixel. Specifying such a requirement can reduce aliasing that results from evaluating the fragment computations too few times per pixel.

		This extension adds new global state that controls the minimum number of samples for which attribute data is independently interpolated. When enabled,
		all operations that were traditionally executed per-fragment operate independently on each sample.

		This also extends the shading language to allow control over the sample being processed. This includes built-in fragment input variables identifying the
		sample number and position being processed when executing fragment shaders per sample.

		Requires ${GL20.core} and GLSL 1.30. ${GL30.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"SAMPLE_SHADING_ARB" _ 0x8C36
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"MIN_SAMPLE_SHADING_VALUE_ARB" _ 0x8C37
	)

	GLvoid(
		"MinSampleShadingARB",
		"Sets the minimum sample shading fraction. {@code value} is clamped to [0,1] when specified.",

		GLfloat.IN("value", "the minimum sample shading fraction")
	)
}