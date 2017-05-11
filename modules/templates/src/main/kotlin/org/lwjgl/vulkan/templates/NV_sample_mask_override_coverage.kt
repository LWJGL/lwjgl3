/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_sample_mask_override_coverage = "NVSampleMaskOverrideCoverage".nativeClassVK("NV_sample_mask_override_coverage", type = "device", postfix = NV) {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>SPV_NV_sample_mask_override_coverage</li>
        </ul>

        The extension provides access to the {@code OverrideCoverageNV} decoration under the {@code SampleMaskOverrideCoverageNV} capability. Adding this decoration to a variable with the {@code SampleMask} builtin decoration allows the shader to modify the coverage mask and affect which samples are used to process the fragment.

        When using GLSL source-based shader languages, the {@code override_coverage} layout qualifier from GL_NV_sample_mask_override_coverage maps to the {@code OverrideCoverageNV} decoration. To use the {@code override_coverage} layout qualifier in GLSL the GL_NV_sample_mask_override_coverage extension must be enabled. Behavior is described in the GL_NV_sample_mask_override_coverage extension spec.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_NV_sample_mask_override_coverage</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>95</dd>

            <dt><b>Status</b></dt>
            <dd>Complete</dd>

            <dt><b>Last Modified Data</b></dt>
            <dd>2016-12-08</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>This extension requires Vulkan 1.0.</li>
                <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/NV/SPV_NV_sample_mask_override_coverage.html">SPV_NV_sample_mask_override_coverage</a> SPIR-V extension.</li>
                <li>This extension requires the <a target="_blank" href="https://www.opengl.org/registry/specs/NV/sample_mask_override_coverage.txt">GL_NV_sample_mask_override_coverage</a> extension for GLSL source languages.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Koch, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell (pdaniell 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME".."VK_NV_sample_mask_override_coverage"
    )
}