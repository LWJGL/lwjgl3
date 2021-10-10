/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows GLSL shaders written to the {@code GL_KHR_vulkan_glsl} extension specification to be used instead of SPIR-V. The implementation will automatically detect whether the shader is SPIR-V or GLSL, and compile it appropriately.
 * 
 * <h5>Deprecation</h5>
 * 
 * <p>Functionality in this extension is outside of the scope of Vulkan and is better served by a compiler library such as <a target="_blank" href="https://github.com/KhronosGroup/glslang">glslang</a>. No new implementations will support this extension, so applications <b>should</b> not use it.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p><b>Example 1</b></p>
 * 
 * <p>Passing in GLSL code</p>
 * 
 * <pre><code>
 *     char const vss[] =
 *         "#version 450 core\n"
 *         "layout(location = 0) in vec2 aVertex;\n"
 *         "layout(location = 1) in vec4 aColor;\n"
 *         "out vec4 vColor;\n"
 *         "void main()\n"
 *         "{\n"
 *         "    vColor = aColor;\n"
 *         "    gl_Position = vec4(aVertex, 0, 1);\n"
 *         "}\n"
 *     ;
 *     VkShaderModuleCreateInfo vertexShaderInfo = { VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO };
 *     vertexShaderInfo.codeSize = sizeof vss;
 *     vertexShaderInfo.pCode = vss;
 *     VkShaderModule vertexShader;
 *     vkCreateShaderModule(device, &amp;vertexShaderInfo, 0, &amp;vertexShader);</code></pre>
 * 
 * <h5>VK_NV_glsl_shader</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_glsl_shader}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>13</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Deprecated</em> without replacement</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_glsl_shader]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_glsl_shader%20extension%3E%3E">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-02-14</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Piers Daniell, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVGLSLShader {

    /** The extension specification version. */
    public static final int VK_NV_GLSL_SHADER_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_GLSL_SHADER_EXTENSION_NAME = "VK_NV_glsl_shader";

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_INVALID_SHADER_NV = -1000012000;

    private NVGLSLShader() {}

}