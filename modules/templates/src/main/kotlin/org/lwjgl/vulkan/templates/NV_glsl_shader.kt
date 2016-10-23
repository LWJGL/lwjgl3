/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_glsl_shader = "NVGLSLShader".nativeClassVK("NV_glsl_shader", postfix = NV) {
	documentation =
		"""
		This extension allows GLSL shaders written to the {@code GL_KHR_vulkan_glsl} extension specification to be used instead of SPIR-V. The implementation will automatically detect whether the shader is SPIR-V or GLSL and compile it appropriatly.
		"""

	IntConstant(
		"The extension specification version.",

		"NV_GLSL_SHADER_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"NV_GLSL_SHADER_EXTENSION_NAME".."VK_NV_glsl_shader"
	)

	EnumConstant(
		"Extends {@code VkResult}.",

		"ERROR_INVALID_SHADER_NV".."-1000012000"
	)
}