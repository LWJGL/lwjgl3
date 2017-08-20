/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_shader_stencil_export = "EXTShaderStencilExport".nativeClassVK("EXT_shader_stencil_export", type = "device", postfix = EXT) {
    documentation =
        """
        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_EXT_shader_stencil_export</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>141</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>07/19/2017</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires the SPV_EXT_shader_stencil_export SPIR-V extension.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Dominik Witczak, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Rex Xu, AMD</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Dominik Witczak, AMD (mailto:dominik.witczak@amd.com[dominik.witczak@amd.com])</li>
            </ul></dd>

            <dt><b>Overview</b></dt>
            <dd>This extension adds support for the SPIR-V extension SPV_EXT_shader_stencil_export providing a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this allows the test to be performed against the value generated in the shader.</dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SHADER_STENCIL_EXPORT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SHADER_STENCIL_EXPORT_EXTENSION_NAME".."VK_EXT_shader_stencil_export"
    )
}