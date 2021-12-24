/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds two related features.
 * 
 * <p>Firstly, support for the following SPIR-V extension in Vulkan is added:</p>
 * 
 * <ul>
 * <li>{@code SPV_AMD_texture_gather_bias_lod}</li>
 * </ul>
 * 
 * <p>Secondly, the extension allows the application to query which formats can be used together with the new function prototypes introduced by the SPIR-V extension.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <pre><code>
 * struct VkTextureLODGatherFormatPropertiesAMD
 * {
 *     VkStructureType sType;
 *     const void*     pNext;
 *     VkBool32        supportsTextureGatherLODBiasAMD;
 * };
 * 
 * // ----------------------------------------------------------------------------------------
 * // How to detect if an image format can be used with the new function prototypes.
 * VkPhysicalDeviceImageFormatInfo2   formatInfo;
 * VkImageFormatProperties2           formatProps;
 * VkTextureLODGatherFormatPropertiesAMD textureLODGatherSupport;
 * 
 * textureLODGatherSupport.sType = VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD;
 * textureLODGatherSupport.pNext = nullptr;
 * 
 * formatInfo.sType  = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2;
 * formatInfo.pNext  = nullptr;
 * formatInfo.format = ...;
 * formatInfo.type   = ...;
 * formatInfo.tiling = ...;
 * formatInfo.usage  = ...;
 * formatInfo.flags  = ...;
 * 
 * formatProps.sType = VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2;
 * formatProps.pNext = &amp;textureLODGatherSupport;
 * 
 * vkGetPhysicalDeviceImageFormatProperties2(physical_device, &amp;formatInfo, &amp;formatProps);
 * 
 * if (textureLODGatherSupport.supportsTextureGatherLODBiasAMD == VK_TRUE)
 * {
 *     // physical device supports SPV_AMD_texture_gather_bias_lod for the specified
 *     // format configuration.
 * }
 * else
 * {
 *     // physical device does not support SPV_AMD_texture_gather_bias_lod for the
 *     // specified format configuration.
 * }</code></pre>
 * 
 * <h5>VK_AMD_texture_gather_bias_lod</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_texture_gather_bias_lod}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>42</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Rex Xu <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_texture_gather_bias_lod]%20@amdrexu%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_texture_gather_bias_lod%20extension%3E%3E">amdrexu</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-03-21</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/AMD/SPV_AMD_texture_gather_bias_lod.html">{@code SPV_AMD_texture_gather_bias_lod}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_texture_gather_bias_lod.txt">{@code GL_AMD_texture_gather_bias_lod}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Dominik Witczak, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Graham Sellers, AMD</li>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Qun Lin, AMD</li>
 * <li>Rex Xu, AMD</li>
 * <li>Timothy Lottes, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class AMDTextureGatherBiasLod {

    /** The extension specification version. */
    public static final int VK_AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME = "VK_AMD_texture_gather_bias_lod";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD = 1000041000;

    private AMDTextureGatherBiasLod() {}

}