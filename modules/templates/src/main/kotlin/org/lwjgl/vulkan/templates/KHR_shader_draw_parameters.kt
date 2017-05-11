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
            <li>
                SPV_KHR_shader_draw_parameters
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
            </li>
        </ul>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHR_shader_draw_parameters</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>64</dd>

            <dt><b>Status</b></dt>
            <dd>Complete</dd>

            <dt><b>Last Modified Data</b></dt>
            <dd>2016-10-05</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires Vulkan 1.0.</li>
                <li>Requires the SPV_KHR_shader_draw_parameters SPIR-V extension.</li>
                <li>Requires GL_ARB_shader_draw_parameters for GLSL source languages.</li>
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

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Koch (dkoch 'at' nvidia.com)</li>
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