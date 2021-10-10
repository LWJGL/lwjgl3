/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds Vulkan support for the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shader_image_footprint.html">{@code SPV_NV_shader_image_footprint}</a> SPIR-V extension. That SPIR-V extension provides a new instruction {@code OpImageSampleFootprintNV} allowing shaders to determine the set of texels that would be accessed by an equivalent filtered texture lookup.
 * 
 * <p>Instead of returning a filtered texture value, the instruction returns a structure that can be interpreted by shader code to determine the footprint of a filtered texture lookup. This structure includes integer values that identify a small neighborhood of texels in the image being accessed and a bitfield that indicates which texels in that neighborhood would be used. The structure also includes a bitfield where each bit identifies whether any texel in a small aligned block of texels would be fetched by the texture lookup. The size of each block is specified by an access <em>granularity</em> provided by the shader. The minimum granularity supported by this extension is 2x2 (for 2D textures) and 2x2x2 (for 3D textures); the maximum granularity is 256x256 (for 2D textures) or 64x32x32 (for 3D textures). Each footprint query returns the footprint from a single texture level. When using minification filters that combine accesses from multiple mipmap levels, shaders must perform separate queries for the two levels accessed (“{@code fine}” and “{@code coarse}”). The footprint query also returns a flag indicating if the texture lookup would access texels from only one mipmap level or from two neighboring levels.</p>
 * 
 * <p>This extension should be useful for multi-pass rendering operations that do an initial expensive rendering pass to produce a first image that is then used as a texture for a second pass. If the second pass ends up accessing only portions of the first image (e.g., due to visbility), the work spent rendering the non-accessed portion of the first image was wasted. With this feature, an application can limit this waste using an initial pass over the geometry in the second image that performs a footprint query for each visible pixel to determine the set of pixels that it needs from the first image. This pass would accumulate an aggregate footprint of all visible pixels into a separate “{@code footprint image}” using shader atomics. Then, when rendering the first image, the application can kill all shading work for pixels not in this aggregate footprint.</p>
 * 
 * <p>This extension has a number of limitations. The {@code OpImageSampleFootprintNV} instruction only supports for two- and three-dimensional textures. Footprint evaluation only supports the CLAMP_TO_EDGE wrap mode; results are undefined for all other wrap modes. Only a limited set of granularity values and that set does not support separate coverage information for each texel in the original image.</p>
 * 
 * <p>When using SPIR-V generated from the OpenGL Shading Language, the new instruction will be generated from code using the new {@code textureFootprint*NV} built-in functions from the {@code GL_NV_shader_texture_footprint} shading language extension.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p>TBD</p>
 * 
 * <h5>VK_NV_shader_image_footprint</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_shader_image_footprint}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>205</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Pat Brown <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_shader_image_footprint]%20@nvpbrown%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_shader_image_footprint%20extension%3E%3E">nvpbrown</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-09-13</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shader_image_footprint.html">{@code SPV_NV_shader_image_footprint}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_shader_texture_footprint.txt">{@code GL_NV_shader_texture_footprint}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pat Brown, NVIDIA</li>
 * <li>Chris Lentini, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVShaderImageFootprint {

    /** The extension specification version. */
    public static final int VK_NV_SHADER_IMAGE_FOOTPRINT_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_NV_SHADER_IMAGE_FOOTPRINT_EXTENSION_NAME = "VK_NV_shader_image_footprint";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV = 1000204000;

    private NVShaderImageFootprint() {}

}