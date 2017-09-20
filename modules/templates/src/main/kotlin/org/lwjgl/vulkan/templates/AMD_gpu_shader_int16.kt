/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_gpu_shader_int16 = "AMDGPUShaderInt16".nativeClassVK("AMD_gpu_shader_int16", type = "device", postfix = AMD) {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>SPV_AMD_gpu_shader_int16</li>
        </ul>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_gpu_shader_int16}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>133</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>mailto:quentin.lin@amd.com[quentin.lin@amd.com]</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>06/08/2017</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/AMD/SPV_AMD_gpu_shader_int16.html">SPV_AMD_gpu_shader_int16</a> SPIR-V extension.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Rakos, AMD</li>
                <li>Dominik Witczak, AMD</li>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Rex Xu, AMD</li>
                <li>Timothy Lottes, AMD</li>
                <li>Zhi Cai, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_GPU_SHADER_INT16_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_GPU_SHADER_INT16_EXTENSION_NAME".."VK_AMD_gpu_shader_int16"
    )
}