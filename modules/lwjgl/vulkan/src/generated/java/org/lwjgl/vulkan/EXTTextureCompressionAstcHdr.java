/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for textures compressed using the Adaptive Scalable Texture Compression (ASTC) High Dynamic Range (HDR) profile.
 * 
 * <p>When this extension is enabled, the HDR profile is supported for all ASTC formats listed in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#appendix-compressedtex-astc">ASTC Compressed Image Formats</a>.</p>
 * 
 * <h5>Promotion to Vulkan 1.3</h5>
 * 
 * <p>This extension has been partially promoted. Functionality in this extension is included in core Vulkan 1.3, with the EXT suffix omitted. However, the feature is made optional in Vulkan 1.3. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_EXT_texture_compression_astc_hdr</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_texture_compression_astc_hdr}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>67</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.3-promotions">Vulkan 1.3</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_texture_compression_astc_hdr]%20@janharaldfredriksen-arm%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_texture_compression_astc_hdr%20extension%3E%3E">janharaldfredriksen-arm</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-05-28</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.3 Core</li>
 * </ul></dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known issues.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTTextureCompressionAstcHdr {

    /** The extension specification version. */
    public static final int VK_EXT_TEXTURE_COMPRESSION_ASTC_HDR_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_TEXTURE_COMPRESSION_ASTC_HDR_EXTENSION_NAME = "VK_EXT_texture_compression_astc_hdr";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES_EXT = 1000066000;

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK_EXT FORMAT_ASTC_4x4_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK_EXT FORMAT_ASTC_5x4_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK_EXT FORMAT_ASTC_5x5_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK_EXT FORMAT_ASTC_6x5_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK_EXT FORMAT_ASTC_6x6_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK_EXT FORMAT_ASTC_8x5_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK_EXT FORMAT_ASTC_8x6_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK_EXT FORMAT_ASTC_8x8_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK_EXT FORMAT_ASTC_10x5_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK_EXT FORMAT_ASTC_10x6_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK_EXT FORMAT_ASTC_10x8_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK_EXT FORMAT_ASTC_10x10_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK_EXT FORMAT_ASTC_12x10_SFLOAT_BLOCK_EXT}</li>
     * <li>{@link #VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK_EXT FORMAT_ASTC_12x12_SFLOAT_BLOCK_EXT}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK_EXT   = 1000066000,
        VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK_EXT   = 1000066001,
        VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK_EXT   = 1000066002,
        VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK_EXT   = 1000066003,
        VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK_EXT   = 1000066004,
        VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK_EXT   = 1000066005,
        VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK_EXT   = 1000066006,
        VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK_EXT   = 1000066007,
        VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK_EXT  = 1000066008,
        VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK_EXT  = 1000066009,
        VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK_EXT  = 1000066010,
        VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK_EXT = 1000066011,
        VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK_EXT = 1000066012,
        VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK_EXT = 1000066013;

    private EXTTextureCompressionAstcHdr() {}

}