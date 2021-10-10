/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows multisample rendering with a raster and depth/stencil sample count that is larger than the color sample count. Rasterization and the results of the depth and stencil tests together determine the portion of a pixel that is “{@code covered}”. It can be useful to evaluate coverage at a higher frequency than color samples are stored. This coverage is then “{@code reduced}” to a collection of covered color samples, each having an opacity value corresponding to the fraction of the color sample covered. The opacity can optionally be blended into individual color samples.
 * 
 * <p>Rendering with fewer color samples than depth/stencil samples greatly reduces the amount of memory and bandwidth consumed by the color buffer. However, converting the coverage values into opacity introduces artifacts where triangles share edges and <b>may</b> not be suitable for normal triangle mesh rendering.</p>
 * 
 * <p>One expected use case for this functionality is Stencil-then-Cover path rendering (similar to the OpenGL GL_NV_path_rendering extension). The stencil step determines the coverage (in the stencil buffer) for an entire path at the higher sample frequency, and then the cover step draws the path into the lower frequency color buffer using the coverage information to antialias path edges. With this two-step process, internal edges are fully covered when antialiasing is applied and there is no corruption on these edges.</p>
 * 
 * <p>The key features of this extension are:</p>
 * 
 * <ul>
 * <li>It allows render pass and framebuffer objects to be created where the number of samples in the depth/stencil attachment in a subpass is a multiple of the number of samples in the color attachments in the subpass.</li>
 * <li>A coverage reduction step is added to Fragment Operations which converts a set of covered raster/depth/stencil samples to a set of color samples that perform blending and color writes. The coverage reduction step also includes an optional coverage modulation step, multiplying color values by a fractional opacity corresponding to the number of associated raster/depth/stencil samples covered.</li>
 * </ul>
 * 
 * <h5>VK_NV_framebuffer_mixed_samples</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_framebuffer_mixed_samples}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>153</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_framebuffer_mixed_samples]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_framebuffer_mixed_samples%20extension%3E%3E">jeffbolznv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-06-04</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVFramebufferMixedSamples {

    /** The extension specification version. */
    public static final int VK_NV_FRAMEBUFFER_MIXED_SAMPLES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME = "VK_NV_framebuffer_mixed_samples";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV = 1000152000;

    /**
     * VkCoverageModulationModeNV - Specify the coverage modulation mode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_COVERAGE_MODULATION_MODE_NONE_NV COVERAGE_MODULATION_MODE_NONE_NV} specifies that no components are multiplied by the modulation factor.</li>
     * <li>{@link #VK_COVERAGE_MODULATION_MODE_RGB_NV COVERAGE_MODULATION_MODE_RGB_NV} specifies that the red, green, and blue components are multiplied by the modulation factor.</li>
     * <li>{@link #VK_COVERAGE_MODULATION_MODE_ALPHA_NV COVERAGE_MODULATION_MODE_ALPHA_NV} specifies that the alpha component is multiplied by the modulation factor.</li>
     * <li>{@link #VK_COVERAGE_MODULATION_MODE_RGBA_NV COVERAGE_MODULATION_MODE_RGBA_NV} specifies that all components are multiplied by the modulation factor.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineCoverageModulationStateCreateInfoNV}</p>
     */
    public static final int
        VK_COVERAGE_MODULATION_MODE_NONE_NV  = 0,
        VK_COVERAGE_MODULATION_MODE_RGB_NV   = 1,
        VK_COVERAGE_MODULATION_MODE_ALPHA_NV = 2,
        VK_COVERAGE_MODULATION_MODE_RGBA_NV  = 3;

    private NVFramebufferMixedSamples() {}

}