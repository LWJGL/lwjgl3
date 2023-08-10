/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension builds upon the {@link KHRVideoDecodeQueue VK_KHR_video_decode_queue} extension by adding support for decoding elementary video stream sequences compliant with the H.265/HEVC video compression standard.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This extension was promoted to {@code KHR} from the provisional extension {@code VK_EXT_video_decode_h265}.</p>
 * </div>
 * 
 * <h5>VK_KHR_video_decode_h265</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_video_decode_h265}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>188</dd>
 * <dt><b>Revision</b></dt>
 * <dd>7</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRVideoDecodeQueue VK_KHR_video_decode_queue}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li><a href="mailto:peter.fang@amd.com">peter.fang@amd.com</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_decode_h265.adoc">VK_KHR_video_decode_h265</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-11-14</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek, AMD</li>
 * <li>HoHin Lau, AMD</li>
 * <li>Jake Beju, AMD</li>
 * <li>Peter Fang, AMD</li>
 * <li>Ping Liu, Intel</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * <li>Daniel Rakos, RasterGrid</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRVideoDecodeH265 {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_DECODE_H265_SPEC_VERSION = 7;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_DECODE_H265_EXTENSION_NAME = "VK_KHR_video_decode_h265";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_KHR                   = 1000187000,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR = 1000187001,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR    = 1000187002,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_INFO_KHR                   = 1000187003,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR                   = 1000187004,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR                  = 1000187005;

    /** Extends {@code VkVideoCodecOperationFlagBitsKHR}. */
    public static final int VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR = 0x2;

    private KHRVideoDecodeH265() {}

}