/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension provides efficient read access to the fragment mask in compressed multisampled color surfaces. The fragment mask is a lookup table that associates color samples with color fragment values.
 * 
 * <p>From a shader, the fragment mask can be fetched with a call to {@code fragmentMaskFetchAMD}, which returns a single {@code uint} where each subsequent four bits specify the color fragment index corresponding to the color sample, starting from the least significant bit. For example, when eight color samples are used, the color fragment index for color sample 0 will be in bits 0-3 of the fragment mask, for color sample 7 the index will be in bits 28-31.</p>
 * 
 * <p>The color fragment for a particular color sample may then be fetched with the corresponding fragment mask value using the {@code fragmentFetchAMD} shader function.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p>This example shows a shader that queries the fragment mask from a multisampled compressed surface and uses it to query fragment values.</p>
 * 
 * <pre><code>
 * #version 450 core
 * 
 * #extension GL_AMD_shader_fragment_mask: enable
 * 
 * layout(binding = 0) uniform sampler2DMS       s2DMS;
 * layout(binding = 1) uniform isampler2DMSArray is2DMSArray;
 * 
 * layout(binding = 2, input_attachment_index = 0) uniform usubpassInputMS usubpassMS;
 * 
 * layout(location = 0) out vec4 fragColor;
 * 
 * void main()
 * {
 *     vec4 fragOne = vec4(0.0);
 * 
 *     uint fragMask = fragmentMaskFetchAMD(s2DMS, ivec2(2, 3));
 *     uint fragIndex = (fragMask &amp; 0xF0) &gt;&gt; 4;
 *     fragOne += fragmentFetchAMD(s2DMS, ivec2(2, 3), 1);
 * 
 *     fragMask = fragmentMaskFetchAMD(is2DMSArray, ivec3(2, 3, 1));
 *     fragIndex = (fragMask &amp; 0xF0) &gt;&gt; 4;
 *     fragOne += fragmentFetchAMD(is2DMSArray, ivec3(2, 3, 1), fragIndex);
 * 
 *     fragMask = fragmentMaskFetchAMD(usubpassMS);
 *     fragIndex = (fragMask &amp; 0xF0) &gt;&gt; 4;
 *     fragOne += fragmentFetchAMD(usubpassMS, fragIndex);
 * 
 *     fragColor = fragOne;
 * }</code></pre>
 * 
 * <h5>VK_AMD_shader_fragment_mask</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_shader_fragment_mask}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>138</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Aaron Hagan <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_shader_fragment_mask]%20@AaronHaganAMD%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_shader_fragment_mask%20extension%3E%3E">AaronHaganAMD</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-08-16</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/AMD/SPV_AMD_shader_fragment_mask.html">{@code SPV_AMD_shader_fragment_mask}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/amd/GL_AMD_shader_fragment_mask.txt">{@code GL_AMD_shader_fragment_mask}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Aaron Hagan, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Timothy Lottes, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class AMDShaderFragmentMask {

    /** The extension specification version. */
    public static final int VK_AMD_SHADER_FRAGMENT_MASK_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_AMD_SHADER_FRAGMENT_MASK_EXTENSION_NAME = "VK_AMD_shader_fragment_mask";

    private AMDShaderFragmentMask() {}

}