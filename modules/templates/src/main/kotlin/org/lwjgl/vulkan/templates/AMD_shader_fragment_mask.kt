/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_shader_fragment_mask = "AMDShaderFragmentMask".nativeClassVK("AMD_shader_fragment_mask", type = "device", postfix = AMD) {
    documentation =
        """
        This extension provides efficient read access to the fragment mask in compressed multisampled color surfaces. The fragment mask is a lookup table that associates color samples with color fragment values.

        The fragment mask can be fetched with a call to {@code fragmentMaskFetchAMD} from a shader, which returns a single uint where each subsequent 4 bit specifies the color fragment index corresponding to the color sample, starting from the least significant bit. For example, when 8 color samples are used, the color fragment index for color sample 0 will be in bits 0-3 of the fragment mask, for color sample 7 the index will be in bits 28-31.

        The color fragment for a particular color sample may then be fetched with the correspoding fragment mask value using the {@code fragmentFetchAMD} shader function.

        <h5>Examples</h5>
        This example shows a shader that queries the fragment mask from a multisampled compressed surface and uses it to query fragment values.

        <code><pre>
￿\#version 450 core
￿
￿\#extension GL_AMD_shader_fragment_mask: enable
￿
￿layout(binding = 0) uniform sampler2DMS       s2DMS;
￿layout(binding = 1) uniform isampler2DMSArray is2DMSArray;
￿
￿layout(binding = 2, input_attachment_index = 0) uniform usubpassInputMS usubpassMS;
￿
￿layout(location = 0) out vec4 fragColor;
￿
￿void main()
￿{
￿    vec4 fragOne = vec4(0.0);
￿
￿    uint fragMask = fragmentMaskFetchAMD(s2DMS, ivec2(2, 3));
￿    uint fragIndex = (fragMask & 0xF0) >> 4;
￿    fragOne += fragmentFetchAMD(s2DMS, ivec2(2, 3), 1);
￿
￿    fragMask = fragmentMaskFetchAMD(is2DMSArray, ivec3(2, 3, 1));
￿    fragIndex = (fragMask & 0xF0) >> 4;
￿    fragOne += fragmentFetchAMD(is2DMSArray, ivec3(2, 3, 1), fragIndex);
￿
￿    fragMask = fragmentMaskFetchAMD(usubpassMS);
￿    fragIndex = (fragMask & 0xF0) >> 4;
￿    fragOne += fragmentFetchAMD(usubpassMS, fragIndex);
￿
￿    fragColor = fragOne;
￿}</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_shader_fragment_mask}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>138</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Aaron Hagan @ahagan</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-08-16</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>Requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/AMD/SPV_AMD_fragment_mask.html">SPV_AMD_fragment_mask</a> SPIR-V extension.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Aaron Hagan, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Timothy Lottes, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_SHADER_FRAGMENT_MASK_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_SHADER_FRAGMENT_MASK_EXTENSION_NAME".."VK_AMD_shader_fragment_mask"
    )
}