/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val KHR_blend_equation_advanced_coherent = "KHRBlendEquationAdvancedCoherent".nativeClassGL("KHR_blend_equation_advanced_coherent", postfix = KHR) {
	documentation =
		"""
		Native bindings to the ${registryLink("KHR", "blend_equation_advanced")} extension.

		This extension guarantees that blending is done coherently and in API primitive order. An enable is provided to allow implementations to opt out of
		fully coherent blending and instead behave as though only ${KHR_blend_equation_advanced.link} were supported.

		Requires ${GL20.core}.
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv,
		GetDoublev and GetInteger64v.
		""",

		"BLEND_ADVANCED_COHERENT_KHR" _ 0x9285
	)
}