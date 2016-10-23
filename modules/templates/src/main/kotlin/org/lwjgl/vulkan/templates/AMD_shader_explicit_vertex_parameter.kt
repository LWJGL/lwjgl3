/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_shader_explicit_vertex_parameter = "AMDShaderExplicitVertexParameter".nativeClassVK("AMD_shader_explicit_vertex_parameter", postfix = AMD) {
	documentation =
		"""
		This extension adds support for the following SPIR-V extension in {apiname}:

		<ul>
			<li>SPV_AMD_shader_explicit_vertex_parameter</li>
		</ul>
		"""

	IntConstant(
		"The extension specification version.",

		"AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME".."VK_AMD_shader_explicit_vertex_parameter"
	)
}