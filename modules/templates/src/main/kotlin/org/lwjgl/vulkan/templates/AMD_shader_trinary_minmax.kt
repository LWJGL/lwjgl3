/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_shader_trinary_minmax = "AMDShaderTrinaryMinmax".nativeClassVK("AMD_shader_trinary_minmax", postfix = AMD) {
	documentation =
		"""
		When the {@code VK_AMD_shader_trinary_minmax} device extension is enabled the application $can pass a SPIR-V module to #CreateShaderModule() that uses
		the {@code SPV_AMD_shader_trinary_minmax} SPIR-V extension.

		This extension introduces 3-parameter {@code min}, {@code max} and {@code med} functions which map directly to the corresponding GCN opcodes:
		{@code min3}, {@code max3}, {@code med3}
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