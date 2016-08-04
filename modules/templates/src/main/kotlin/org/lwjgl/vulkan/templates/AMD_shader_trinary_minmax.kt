/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_shader_trinary_minmax = "AMDShaderTrinaryMinmax".nativeClassVK("AMD_shader_trinary_minmax", postfix = AMD) {
	documentation =
		"""
		When the {@code VK_AMD_shader_trinary_minmax} device extension is enabled the application $can pass a SPIR-V module to #CreateShaderModule() that uses
		the {@code SPV_AMD_shader_trinary_minmax} SPIR-V extension.

		This extension is written to provide the functionality of the {@code AMD_shader_trinary_minmax}, OpenGL Shading Language Specification extension, for
		SPIR-V.

		This extension introduces nine new trinary extended instructions to SPIR-V. These functions allow the minimum, maximum or median of three inputs to be
		found with a single function call. These operations may be useful for sorting and filtering operations, for example. By explicitly performing a trinary
		operation with a single built-in function, shader compilers and optimizers may be able to generate better instruction sequences to perform sorting and
		to other multi-input functions.

		This extension adds the following extended instructions:
		${ul(
			"FMin3AMD",
			"UMin3AMD",
			"SMin3AMD",
			"FMax3AMD",
			"UMax3AMD",
			"SMax3AMD",
			"FMid3AMD",
			"UMid3AMD",
			"SMid3AMD"
		)}
		"""

	IntConstant(
		"The extension specification version.",

		"AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME".."VK_AMD_shader_trinary_minmax"
	)
}