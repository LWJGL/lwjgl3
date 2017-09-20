/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_shader_viewport_index_layer = "EXTShaderViewportIndexLayer".nativeClassVK("EXT_shader_viewport_index_layer", type = "device", postfix = EXT) {
    documentation =
        """
        This extension adds support for the {@code ShaderViewportIndexLayerEXT} capability from the {@code SPV_EXT_shader_viewport_index_layer} extension in Vulkan.

        This extension allows variables decorated with the {@code Layer} and {@code ViewportIndex} built-ins to be exported from vertex or tessellation shaders, using the {@code ShaderViewportIndexLayerEXT} capability.

        When using GLSL source-based shading languages, the {@code gl_ViewportIndex} and {@code gl_Layer} built-in variables map to the SPIR-V {@code ViewportIndex} and {@code Layer} built-in decorations, respectively. Behaviour of these variables is extended as described in the {@code GL_ARB_shader_viewport_layer_array} (or the precursor {@code GL_AMD_vertex_shader_layer}, {@code GL_AMD_vertex_shader_viewport_index}, and +GL_NV_viewport_array2 extensions+).

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@code ShaderViewportIndexLayerEXT} capability is equivalent to the  {@code ShaderViewportIndexLayerNV} capability added by  <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_NV_viewport_array2">VK_NV_viewport_array2</a>.
        </div>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_shader_viewport_index_layer}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>163</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Koch @dgkoch</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-08-08</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/EXT/SPV_EXT_shader_viewport_index_layer.html">SPV_EXT_shader_viewport_index_layer</a> SPIR-V extension.</li>
                <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_viewport_layer_array.txt">GL_ARB_shader_viewport_layer_array</a>, <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_vertex_shader_layer.txt">GL_AMD_vertex_shader_layer</a>, <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_vertex_shader_viewport_index.txt">GL_AMD_vertex_shader_viewport_index</a>, or <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_viewport_array2.txt">GL_NV_viewport_array2</a> extensions for GLSL source languages.</li>
                <li>This extension requires the {@code multiViewport} feature.</li>
                <li>This extension interacts with the {@code tessellationShader} feature.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Piers Daniell, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Daniel Rakos, AMD</li>
                <li>Slawomir Grajeswki, Intel</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SHADER_VIEWPORT_INDEX_LAYER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SHADER_VIEWPORT_INDEX_LAYER_EXTENSION_NAME".."VK_EXT_shader_viewport_index_layer"
    )
}