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
 * <li>{@link VkVideoDecodeH265CapabilitiesEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoDecodeInfoKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH265PictureInfoEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoProfileKHR}, {@link VkQueryPoolCreateInfo}, {@link VkFormatProperties2}, {@link VkImageCreateInfo}, {@link VkImageViewCreateInfo}, {@link VkBufferCreateInfo}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH265ProfileEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoReferenceSlotKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH265DpbSlotInfoEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoSessionCreateInfoKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH265SessionCreateInfoEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoSessionParametersCreateInfoKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH265SessionParametersCreateInfoEXT}</li>
 * </ul>
 * </li>
 * <li>Extending {@link VkVideoSessionParametersUpdateInfoKHR}:
 * 
 * <ul>
 * <li>{@link VkVideoDecodeH265SessionParametersAddInfoEXT}</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * <h5>VK_EXT_video_decode_h265</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_video_decode_h265}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>188</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
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
 * <li>HoHin Lau, AMD</li>
 * <li>Jake Beju, AMD</li>
 * <li>Peter Fang, AMD</li>
 * <li>Ping Liu, Intel</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTVideoDecodeH265 {

    /** The extension specification version. */
    public static final int VK_EXT_VIDEO_DECODE_H265_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_VIDEO_DECODE_H265_EXTENSION_NAME = "VK_EXT_video_decode_h265";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_EXT                   = 1000187000,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_CREATE_INFO_EXT            = 1000187001,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT = 1000187002,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT    = 1000187003,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT                        = 1000187004,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT                   = 1000187005,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_EXT                  = 1000187006;

    /** Extends {@code VkVideoCodecOperationFlagBitsKHR}. */
    public static final int VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_EXT = 0x2;

    private EXTVideoDecodeH265() {}

}