/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <ul>
 * <li>Extending {@link VkVideoCapabilitiesKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH264CapabilitiesEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoDecodeH264PictureInfoEXT}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH264MvcEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoDecodeInfoKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH264PictureInfoEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoProfileKHR}, {@link VkQueryPoolCreateInfo}, {@link VkFormatProperties2}, {@link VkImageCreateInfo}, {@link VkImageViewCreateInfo}, {@link VkBufferCreateInfo}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH264ProfileEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoReferenceSlotKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH264DpbSlotInfoEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoSessionCreateInfoKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH264SessionCreateInfoEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoSessionParametersCreateInfoKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH264SessionParametersCreateInfoEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoSessionParametersUpdateInfoKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH264SessionParametersAddInfoEXT}</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * <h5>VK_EXT_video_decode_h264</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_video_decode_h264}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>41</dd>
 * <dt><b>Revision</b></dt>
 * <dd>3</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRVideoDecodeQueue VK_KHR_video_decode_queue}</li>
 * <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="mailto:peter.fang@amd.com">peter.fang@amd.com</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-03-29</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Chunbo Chen, Intel</li>
 * <li>HoHin Lau, AMD</li>
 * <li>Jake Beju, AMD</li>
 * <li>Peter Fang, AMD</li>
 * <li>Ping Liu, Intel</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTVideoDecodeH264 {

    /** The extension specification version. */
    public static final int VK_EXT_VIDEO_DECODE_H264_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String VK_EXT_VIDEO_DECODE_H264_EXTENSION_NAME = "VK_EXT_video_decode_h264";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_EXT                   = 1000040000,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT            = 1000040001,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT                   = 1000040002,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT                            = 1000040003,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT                        = 1000040004,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT = 1000040005,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT    = 1000040006,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT                  = 1000040007;

    /** Extends {@code VkVideoCodecOperationFlagBitsKHR}. */
    public static final int VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_EXT = 0x1;

    /**
     * VkVideoDecodeH264PictureLayoutFlagBitsEXT - H.264 video decode picture layout flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_EXT VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_EXT} specifies support for progressive content. This flag has the value 0.</li>
     * <li>{@link #VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_EXT VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_EXT} specifies support for or use of a picture layout for interlaced content where all lines belonging to the first field are decoded to the even-numbered lines within the picture resource, and all lines belonging to the second field are decoded to the odd-numbered lines within the picture resource.</li>
     * <li>{@link #VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_EXT VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_EXT} specifies support for or use of a picture layout for interlaced content where all lines belonging to the first field are grouped together in a single plane, followed by another plane containing all lines belonging to the second field.</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_EXT                      = 0,
        VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_EXT = 0x1,
        VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_EXT   = 0x2;

    private EXTVideoDecodeH264() {}

}