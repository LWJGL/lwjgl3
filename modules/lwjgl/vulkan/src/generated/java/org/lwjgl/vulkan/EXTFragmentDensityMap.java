/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows an application to specify areas of the render target where the fragment shader may be invoked fewer times. These fragments are broadcasted out to multiple pixels to cover the render target.
 * 
 * <p>The primary use of this extension is to reduce workloads in areas where lower quality may not be perceived such as the distorted edges of a lens or the periphery of a user’s gaze.</p>
 * 
 * <h5>VK_EXT_fragment_density_map</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_fragment_density_map}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>219</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Matthew Netsch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_fragment_density_map]%20@mnetsch%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_fragment_density_map%20extension%3E%3E">mnetsch</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-09-30</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_fragment_invocation_density.html">{@code SPV_EXT_fragment_invocation_density}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_fragment_invocation_density.txt">{@code GL_EXT_fragment_invocation_density}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthew Netsch, Qualcomm Technologies, Inc.</li>
 * <li>Robert VanReenen, Qualcomm Technologies, Inc.</li>
 * <li>Jonathan Wicks, Qualcomm Technologies, Inc.</li>
 * <li>Tate Hornbeck, Qualcomm Technologies, Inc.</li>
 * <li>Sam Holmes, Qualcomm Technologies, Inc.</li>
 * <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Pat Brown, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Piers Daniell, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTFragmentDensityMap {

    /** The extension specification version. */
    public static final int VK_EXT_FRAGMENT_DENSITY_MAP_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_FRAGMENT_DENSITY_MAP_EXTENSION_NAME = "VK_EXT_fragment_density_map";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT   = 1000218000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT = 1000218001,
        VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT    = 1000218002;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT = 0x4000;

    /** Extends {@code VkImageLayout}. */
    public static final int VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT = 1000218000;

    /** Extends {@code VkAccessFlagBits}. */
    public static final int VK_ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT = 0x1000000;

    /** Extends {@code VkFormatFeatureFlagBits}. */
    public static final int VK_FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT = 0x1000000;

    /** Extends {@code VkImageUsageFlagBits}. */
    public static final int VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT = 0x200;

    /** Extends {@code VkImageViewCreateFlagBits}. */
    public static final int VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT = 0x1;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT = 0x800000;

    /**
     * Extends {@code VkSamplerCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}</li>
     * <li>{@link #VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT                       = 0x1,
        VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT = 0x2;

    /** Extends {@code VkFormatFeatureFlagBits2}. */
    public static final long VK_FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT = 0x1000000L;

    private EXTFragmentDensityMap() {}

}