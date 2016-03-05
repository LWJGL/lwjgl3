/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_glsl_shader = "NVGLSLShader".nativeClassVK("NV_glsl_shader", postfix = NV) {
	documentation =
		"""
		This extension allows GLSL shaders written to the {@code GL_KHR_vulkan_glsl} extension specification to be used instead of SPIR-V. The implementation
		will automatically detect which the shader is SPIR-V or GLSL and compile it appropriatly.

		<h3>Passing in GLSL code example</h3>

		${codeBlock("""
char const vss[] =
	"#version 450 core\n"
	"layout(location = 0) in vec2 aVertex;\n"
	"layout(location = 1) in vec4 aColor;\n"
	"out vec4 vColor;\n"
	"void main()\n"
	"{\n"
	"   vColor = aColor;\n"
	"   gl_Position = vec4(aVertex, 0, 1);\n"
	"}\n"
;
VkShaderModuleCreateInfo vertexShaderInfo = { VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO };
vertexShaderInfo.codeSize = sizeof vss;
vertexShaderInfo.pCode = vss;
VkShaderModule vertexShader;
vkCreateShaderModule(device, &vertexShaderInfo, 0, &vertexShader);""")}
		"""

	IntConstant(
		"The extension specification version.",

		"NV_GLSL_SHADER_SPEC_VERSION" expr "1"
	)

	StringConstant(
		"The extension name.",

		"NV_GLSL_SHADER_EXTENSION_NAME".."VK_NV_glsl_shader"
	)

	IntConstant(
		"VkResult",

		"ERROR_INVALID_SHADER_NV" expr "-1000012000"
	)
}