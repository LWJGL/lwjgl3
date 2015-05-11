/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_env_combine = "ARBTextureEnvCombine".nativeClassGL("ARB_texture_env_combine", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		New texture environment function COMBINE_ARB allows programmable texture combiner operations.

		Requires ${ARB_multitexture.capLink}. ${GL13.promoted}
		"""

	IntConstant(
		"Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is TEXTURE_ENV_MODE.",

		"COMBINE_ARB" _ 0x8570
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.",

		"COMBINE_RGB_ARB" _ 0x8571,
		"COMBINE_ALPHA_ARB" _ 0x8572,
		"SOURCE0_RGB_ARB" _ 0x8580,
		"SOURCE1_RGB_ARB" _ 0x8581,
		"SOURCE2_RGB_ARB" _ 0x8582,
		"SOURCE0_ALPHA_ARB" _ 0x8588,
		"SOURCE1_ALPHA_ARB" _ 0x8589,
		"SOURCE2_ALPHA_ARB" _ 0x858A,
		"OPERAND0_RGB_ARB" _ 0x8590,
		"OPERAND1_RGB_ARB" _ 0x8591,
		"OPERAND2_RGB_ARB" _ 0x8592,
		"OPERAND0_ALPHA_ARB" _ 0x8598,
		"OPERAND1_ALPHA_ARB" _ 0x8599,
		"OPERAND2_ALPHA_ARB" _ 0x859A,
		"RGB_SCALE_ARB" _ 0x8573
	)

	IntConstant(
		"""
		Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB_ARB or
		COMBINE_ALPHA_ARB.
		""",

		"ADD_SIGNED_ARB" _ 0x8574,
		"INTERPOLATE_ARB" _ 0x8575,
		"SUBTRACT_ARB" _ 0x84E7
	)

	IntConstant(
		"""
		Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is SOURCE0_RGB_ARB,
		SOURCE1_RGB_ARB, SOURCE2_RGB_ARB, SOURCE0_ALPHA_ARB, SOURCE1_ALPHA_ARB, or SOURCE2_ALPHA_ARB.
		""",

		"CONSTANT_ARB" _ 0x8576,
		"PRIMARY_COLOR_ARB" _ 0x8577,
		"PREVIOUS_ARB" _ 0x8578
	)

}