/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_shader_sm_builtins = "NVShaderSmBuiltins".nativeClassVK("NV_shader_sm_builtins", type = "device", postfix = NV) {
    documentation =
        """
        <h5>Description</h5>
        This extension provides the ability to determine device-specific properties on NVIDIA GPUs. It provides the number of streaming multiprocessors (SMs), the maximum number of warps (subgroups) that can run on an SM, and shader builtins to enable invocations to identify which SM and warp a shader invocation is executing on.

        This extension enables support for the SPIR-V {@code ShaderSMBuiltinsNV} capability.

        These properties and built-ins <b>should</b> typically only be used for debugging purposes.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_shader_sm_builtins}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>155</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.1</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NV_shader_sm_builtins:%20&amp;body=@dgkoch%20">dgkoch</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2019-05-28</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shader_sm_builtins.html">{@code SPV_NV_shader_sm_builtins}</a>.</li>
                <li>This extension enables <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_shader_sm_builtins.txt">{@code GL_NV_shader_sm_builtins}</a> for GLSL source languages.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Eric Werness, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_SHADER_SM_BUILTINS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_SHADER_SM_BUILTINS_EXTENSION_NAME".."VK_NV_shader_sm_builtins"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV".."1000154000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV".."1000154001"
    )
}