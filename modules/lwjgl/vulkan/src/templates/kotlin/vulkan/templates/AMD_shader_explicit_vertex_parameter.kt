/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_shader_explicit_vertex_parameter = "AMDShaderExplicitVertexParameter".nativeClassVK("AMD_shader_explicit_vertex_parameter", type = "device", postfix = "AMD") {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/AMD/SPV_AMD_shader_explicit_vertex_parameter.html">{@code SPV_AMD_shader_explicit_vertex_parameter}</a></li>
        </ul>

        <h5>VK_AMD_shader_explicit_vertex_parameter</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_shader_explicit_vertex_parameter}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>22</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Qun Lin <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_shader_explicit_vertex_parameter]%20@linqun%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_shader_explicit_vertex_parameter%20extension*">linqun</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-05-10</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/AMD/SPV_AMD_shader_explicit_vertex_parameter.html">{@code SPV_AMD_shader_explicit_vertex_parameter}</a></li>
                <li>This extension provides API support for <a href="https://registry.khronos.org/OpenGL/extensions/AMD/AMD_shader_explicit_vertex_parameter.txt">{@code GL_AMD_shader_explicit_vertex_parameter}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Qun Lin, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Rex Xu, AMD</li>
            </ul></dd>
        </dl>
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