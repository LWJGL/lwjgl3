/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for the following SPIR-V extension in Vulkan:
 * 
 * <ul>
 * <li>{@code SPV_NV_sample_mask_override_coverage}</li>
 * </ul>
 * 
 * <p>The extension provides access to the {@code OverrideCoverageNV} decoration under the {@code SampleMaskOverrideCoverageNV} capability. Adding this decoration to a variable with the {@code SampleMask} builtin decoration allows the shader to modify the coverage mask and affect which samples are used to process the fragment.</p>
 * 
 * <p>When using GLSL source-based shader languages, the {@code override_coverage} layout qualifier from {@code GL_NV_sample_mask_override_coverage} maps to the {@code OverrideCoverageNV} decoration. To use the {@code override_coverage} layout qualifier in GLSL the {@code GL_NV_sample_mask_override_coverage} extension must be enabled. Behavior is described in the {@code GL_NV_sample_mask_override_coverage} extension spec.</p>
 * 
 * <h5>VK_NV_sample_mask_override_coverage</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_sample_mask_override_coverage}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>95</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_sample_mask_override_coverage]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_sample_mask_override_coverage%20extension%3E%3E">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-12-08</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_sample_mask_override_coverage.html">{@code SPV_NV_sample_mask_override_coverage}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_sample_mask_override_coverage.txt">{@code GL_NV_sample_mask_override_coverage}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVSampleMaskOverrideCoverage {

    /** The extension specification version. */
    public static final int VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME = "VK_NV_sample_mask_override_coverage";

    private NVSampleMaskOverrideCoverage() {}

}