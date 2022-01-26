/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_viewport_index_layer = "EXTShaderViewportIndexLayer".nativeClassVK("EXT_shader_viewport_index_layer", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds support for the {@code ShaderViewportIndexLayerEXT} capability from the {@code SPV_EXT_shader_viewport_index_layer} extension in Vulkan.

        This extension allows variables decorated with the {@code Layer} and {@code ViewportIndex} built-ins to be exported from vertex or tessellation shaders, using the {@code ShaderViewportIndexLayerEXT} capability.

        When using GLSL source-based shading languages, the {@code gl_ViewportIndex} and {@code gl_Layer} built-in variables map to the SPIR-V {@code ViewportIndex} and {@code Layer} built-in decorations, respectively. Behaviour of these variables is extended as described in the {@code GL_ARB_shader_viewport_layer_array} (or the precursor {@code GL_AMD_vertex_shader_layer}, {@code GL_AMD_vertex_shader_viewport_index}, and {@code GL_NV_viewport_array2} extensions).

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@code ShaderViewportIndexLayerEXT} capability is equivalent to the {@code ShaderViewportIndexLayerNV} capability added by {@link NVViewportArray2 VK_NV_viewport_array2}.
        </div>

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2.

        The single {@code ShaderViewportIndexLayerEXT} capability from the {@code SPV_EXT_shader_viewport_index_layer} extension is replaced by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#spirvenv-capabilities-table-ShaderViewportIndex">{@code ShaderViewportIndex}</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#spirvenv-capabilities-table-ShaderLayer">{@code ShaderLayer}</a> capabilities from SPIR-V 1.5 which are enabled by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderOutputViewportIndex">shaderOutputViewportIndex</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderOutputLayer">shaderOutputLayer</a> features, respectively. Additionally, if Vulkan 1.2 is supported but this extension is not, these capabilities are optional.

        Enabling both features is equivalent to enabling the {@code VK_EXT_shader_viewport_index_layer} extension.

        <h5>VK_EXT_shader_viewport_index_layer</h5>
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

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_viewport_index_layer]%20@dgkoch%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_viewport_index_layer%20extension%3E%3E">dgkoch</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-08-08</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_shader_viewport_index_layer.html">{@code SPV_EXT_shader_viewport_index_layer}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_viewport_layer_array.txt">{@code GL_ARB_shader_viewport_layer_array}</a>, <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_vertex_shader_layer.txt">{@code GL_AMD_vertex_shader_layer}</a>, <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_vertex_shader_viewport_index.txt">{@code GL_AMD_vertex_shader_viewport_index}</a>, and <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_viewport_array2.txt">{@code GL_NV_viewport_array2}</a></li>
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