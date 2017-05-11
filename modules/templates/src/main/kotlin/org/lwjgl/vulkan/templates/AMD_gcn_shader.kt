/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_gcn_shader = "AMDGCNShader".nativeClassVK("AMD_gcn_shader", type = "device", postfix = AMD) {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in {apiname}:

        <ul>
            <li>SPV_AMD_gcn_shader</li>
        </ul>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_AMD_gcn_shader</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>26</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-05-30</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0.15 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Dominik Witczak, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Rex Xu, AMD</li>
                <li>Graham Sellers, AMD</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Dominik Witczak, AMD (mailto:dominik.witczak@amd.com[dominik.witczak@amd.com])</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_GCN_SHADER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_GCN_SHADER_EXTENSION_NAME".."VK_AMD_gcn_shader"
    )
}