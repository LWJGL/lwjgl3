/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_shader_draw_parameters = "KHRShaderDrawParameters".nativeClassVK("KHR_shader_draw_parameters", type = "device", postfix = KHR) {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>SPV_KHR_shader_draw_parameters</li>
        </ul>

        The extension provides access to three additional built-in shader variables in Vulkan:

        <ul>
            <li>{@code BaseInstance}, which contains the firstInstance parameter passed to draw commands,</li>
            <li>{@code BaseVertex}, which contains the firstVertex/vertexOffset parameter passed to draw commands, and</li>
            <li>{@code DrawIndex}, which contains the index of the draw call currently being processed from an indirect draw call.</li>
        </ul>

        When using GLSL source-based shader languages, the following variables from {@code GL_ARB_shader_draw_parameters} can map to these SPIR-V built-in decorations:

        <ul>
            <li>in int gl_BaseInstanceARB; &#8594; {@code BaseInstance},</li>
            <li>in int gl_BaseVertexARB &#8594; {@code BaseVertex}, and</li>
            <li>in int gl_DrawIDARB; &#8594; {@code DrawIndex}.</li>
        </ul>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_shader_draw_parameters}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>64</dd>

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
            <dd>2016-10-05</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/KHR/SPV_KHR_shader_draw_parameters.html">SPV_KHR_shader_draw_parameters</a> SPIR-V extension.</li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_draw_parameters.txt">GL_ARB_shader_draw_parameters</a> for GLSL source languages.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Koch, NVIDIA Corporation</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>John Kessenich, Google</li>
                <li>Stuart Smith, IMG</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SHADER_DRAW_PARAMETERS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SHADER_DRAW_PARAMETERS_EXTENSION_NAME".."VK_KHR_shader_draw_parameters"
    )
}