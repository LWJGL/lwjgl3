/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_glsl_shader = "NVGLSLShader".nativeClassVK("NV_glsl_shader", type = "device", postfix = NV) {
    documentation =
        """
        This extension allows GLSL shaders written to the {@code GL_KHR_vulkan_glsl} extension specification to be used instead of SPIR-V. The implementation will automatically detect whether the shader is SPIR-V or GLSL and compile it appropriatly.

        <h5>Examples</h5>
        <b>Example 1</b>

        Passing in GLSL code

        <code><pre>
￿    char const vss[] =
￿        "\#version 450 core\n"
￿        "layout(location = 0) in vec2 aVertex;\n"
￿        "layout(location = 1) in vec4 aColor;\n"
￿        "out vec4 vColor;\n"
￿        "void main()\n"
￿        "{\n"
￿        "    vColor = aColor;\n"
￿        "    gl_Position = vec4(aVertex, 0, 1);\n"
￿        "}\n"
￿    ;
￿    VkShaderModuleCreateInfo vertexShaderInfo = { VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO };
￿    vertexShaderInfo.codeSize = sizeof vss;
￿    vertexShaderInfo.pCode = vss;
￿    VkShaderModule vertexShader;
￿    vkCreateShaderModule(device, &vertexShaderInfo, 0, &vertexShader);</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_NV_glsl_shader</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>13</dd>

            <dt><b>Status</b></dt>
            <dd>Draft.</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-02-14</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Piers Daniell, NVIDIA</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Piers Daniell (pdaniell 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
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