/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_shader_ballot = "AMDShaderBallot".nativeClassVK("AMD_shader_ballot", type = "device", postfix = AMD) {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in {apiname}:

        <ul>
            <li>SPV_AMD_shader_ballot</li>
        </ul>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_AMD_shader_ballot</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>38</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-09-19</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0.27 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Qun Lin, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Rex Xu, AMD</li>
                <li>Dominik Witczak, AMD</li>
                <li>Matthäus G. Chajdas, AMD</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Dominik Witczak, AMD (mailto:Dominik.Witczak@amd.com[Dominik.Witczak@amd.com])</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_SHADER_BALLOT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_SHADER_BALLOT_EXTENSION_NAME".."VK_AMD_shader_ballot"
    )
}