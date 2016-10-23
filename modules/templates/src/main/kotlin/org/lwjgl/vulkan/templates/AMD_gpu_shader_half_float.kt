/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_gpu_shader_half_float = "AMDGPUShaderHalfFloat".nativeClassVK("AMD_gpu_shader_half_float", postfix = AMD) {
	documentation =
		"""
		This extension adds support for the following SPIR-V extension in {apiname}:

		<ul>
			<li>SPV_AMD_gpu_shader_half_float</li>
		</ul>
		"""

	IntConstant(
		"The extension specification version.",

		"AMD_GPU_SHADER_HALF_FLOAT_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"AMD_GPU_SHADER_HALF_FLOAT_EXTENSION_NAME".."VK_AMD_gpu_shader_half_float"
	)
}