/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds some Y′C<sub>B</sub>C<sub>R</sub> formats that are in common use for video encode and decode, but were not part of the {@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion} extension.
 * 
 * <h5>VK_EXT_ycbcr_2plane_444_formats</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_ycbcr_2plane_444_formats}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>331</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tony Zlatinski <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_ycbcr_2plane_444_formats] @tzlatinski%0A&lt;&lt;Here describe the issue or question you have about the VK_EXT_ycbcr_2plane_444_formats extension&gt;&gt;">tzlatinski</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-07-28</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Ping Liu, Intel</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTYcbcr2plane444Formats {

    /** The extension specification version. */
    public static final int VK_EXT_YCBCR_2PLANE_444_FORMATS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_YCBCR_2PLANE_444_FORMATS_EXTENSION_NAME = "VK_EXT_ycbcr_2plane_444_formats";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT = 1000330000;

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_G8_B8R8_2PLANE_444_UNORM_EXT FORMAT_G8_B8R8_2PLANE_444_UNORM_EXT}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16_EXT FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16_EXT}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16_EXT FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16_EXT}</li>
     * <li>{@link #VK_FORMAT_G16_B16R16_2PLANE_444_UNORM_EXT FORMAT_G16_B16R16_2PLANE_444_UNORM_EXT}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_G8_B8R8_2PLANE_444_UNORM_EXT                  = 1000330000,
        VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16_EXT = 1000330001,
        VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16_EXT = 1000330002,
        VK_FORMAT_G16_B16R16_2PLANE_444_UNORM_EXT               = 1000330003;

    private EXTYcbcr2plane444Formats() {}

}