/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * {@code VK_IMG_format_pvrtc} provides additional texture compression functionality specific to Imagination Technologies PowerVR Texture compression format (called PVRTC).
 * 
 * <h5>VK_IMG_format_pvrtc</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_IMG_format_pvrtc}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>55</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Stuart Smith</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-09-02</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>Imagination Technologies Proprietary</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Stuart Smith, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public final class IMGFormatPVRTC {

    /** The extension specification version. */
    public static final int VK_IMG_FORMAT_PVRTC_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_IMG_FORMAT_PVRTC_EXTENSION_NAME = "VK_IMG_format_pvrtc";

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG}</li>
     * <li>{@link #VK_FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG}</li>
     * <li>{@link #VK_FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG}</li>
     * <li>{@link #VK_FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG}</li>
     * <li>{@link #VK_FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG}</li>
     * <li>{@link #VK_FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG}</li>
     * <li>{@link #VK_FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG}</li>
     * <li>{@link #VK_FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG = 1000054000,
        VK_FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG = 1000054001,
        VK_FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG = 1000054002,
        VK_FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG = 1000054003,
        VK_FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG  = 1000054004,
        VK_FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG  = 1000054005,
        VK_FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG  = 1000054006,
        VK_FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG  = 1000054007;

    private IMGFormatPVRTC() {}

}