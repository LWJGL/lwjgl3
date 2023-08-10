/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension builds upon the {@link KHRVideoDecodeQueue VK_KHR_video_decode_queue} extension by adding support for decoding elementary video stream sequences compliant with the H.264/AVC video compression standard.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This extension was promoted to {@code KHR} from the provisional extension {@code VK_EXT_video_decode_h264}.</p>
 * </div>
 * 
 * <h5>VK_KHR_video_decode_h264</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_video_decode_h264}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>41</dd>
 * <dt><b>Revision</b></dt>
 * <dd>8</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRVideoDecodeQueue VK_KHR_video_decode_queue}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li><a href="mailto:peter.fang@amd.com">peter.fang@amd.com</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_decode_h264.adoc">VK_KHR_video_decode_h264</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-09-29</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek, AMD</li>
 * <li>Chunbo Chen, Intel</li>
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
public final class KHRVideoDecodeH264 {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_DECODE_H264_SPEC_VERSION = 8;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_DECODE_H264_EXTENSION_NAME = "VK_KHR_video_decode_h264";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR                   = 1000040000,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR                   = 1000040001,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR                   = 1000040003,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR = 1000040004,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR    = 1000040005,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR                  = 1000040006;

    /** Extends {@code VkVideoCodecOperationFlagBitsKHR}. */
    public static final int VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR = 0x1;

    /**
     * VkVideoDecodeH264PictureLayoutFlagBitsKHR - H.264 video decode picture layout flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_KHR VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_KHR} specifies support for progressive content. This flag has the value 0.</li>
     * <li>{@link #VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR} specifies support for or use of a picture layout for interlaced content where all lines belonging to the top field are decoded to the even-numbered lines within the picture resource, and all lines belonging to the bottom field are decoded to the odd-numbered lines within the picture resource.</li>
     * <li>{@link #VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR} specifies support for or use of a picture layout for interlaced content where all lines belonging to a field are grouped together in a single image subregion, and the two fields comprising the frame <b>can</b> be stored in separate image subregions of the same image subresource or in separate image subresources.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoDecodeH264ProfileInfoKHR}</p>
     */
    public static final int
        VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_KHR                      = 0,
        VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR = 0x1,
        VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR   = 0x2;

    private KHRVideoDecodeH264() {}

}