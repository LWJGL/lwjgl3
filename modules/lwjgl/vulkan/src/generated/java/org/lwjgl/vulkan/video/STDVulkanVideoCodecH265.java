/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import static org.lwjgl.vulkan.video.STDVulkanVideo.*;

public final class STDVulkanVideoCodecH265 {

    /** The extension specification version. */
    public static final int VK_STD_VULKAN_VIDEO_CODEC_H265_SPEC_VERSION = VK_MAKE_VIDEO_STD_VERSION(0, 5, 0);

    /** The extension name. */
    public static final String VK_STD_VULKAN_VIDEO_CODEC_H265_EXTENSION_NAME = "VK_STD_vulkan_video_codec_h265";

    /**
     * {@code StdVideoH265ChromaFormatIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h265_chroma_format_idc_monochrome std_video_h265_chroma_format_idc_monochrome}</li>
     * <li>{@link #std_video_h265_chroma_format_idc_420 std_video_h265_chroma_format_idc_420}</li>
     * <li>{@link #std_video_h265_chroma_format_idc_422 std_video_h265_chroma_format_idc_422}</li>
     * <li>{@link #std_video_h265_chroma_format_idc_444 std_video_h265_chroma_format_idc_444}</li>
     * </ul>
     */
    public static final int
        std_video_h265_chroma_format_idc_monochrome = 0,
        std_video_h265_chroma_format_idc_420        = 1,
        std_video_h265_chroma_format_idc_422        = 2,
        std_video_h265_chroma_format_idc_444        = 3;

    /**
     * {@code StdVideoH265ProfileIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h265_profile_idc_main std_video_h265_profile_idc_main}</li>
     * <li>{@link #std_video_h265_profile_idc_main_10 std_video_h265_profile_idc_main_10}</li>
     * <li>{@link #std_video_h265_profile_idc_main_still_picture std_video_h265_profile_idc_main_still_picture}</li>
     * <li>{@link #std_video_h265_profile_idc_format_range_extensions std_video_h265_profile_idc_format_range_extensions}</li>
     * <li>{@link #std_video_h265_profile_idc_scc_extensions std_video_h265_profile_idc_scc_extensions}</li>
     * <li>{@link #std_video_h265_profile_idc_invalid std_video_h265_profile_idc_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h265_profile_idc_main                    = 1,
        std_video_h265_profile_idc_main_10                 = 2,
        std_video_h265_profile_idc_main_still_picture      = 3,
        std_video_h265_profile_idc_format_range_extensions = 4,
        std_video_h265_profile_idc_scc_extensions          = 9,
        std_video_h265_profile_idc_invalid                 = 0x7FFFFFFF;

    /**
     * {@code StdVideoH265Level}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h265_level_1_0 std_video_h265_level_1_0}</li>
     * <li>{@link #std_video_h265_level_2_0 std_video_h265_level_2_0}</li>
     * <li>{@link #std_video_h265_level_2_1 std_video_h265_level_2_1}</li>
     * <li>{@link #std_video_h265_level_3_0 std_video_h265_level_3_0}</li>
     * <li>{@link #std_video_h265_level_3_1 std_video_h265_level_3_1}</li>
     * <li>{@link #std_video_h265_level_4_0 std_video_h265_level_4_0}</li>
     * <li>{@link #std_video_h265_level_4_1 std_video_h265_level_4_1}</li>
     * <li>{@link #std_video_h265_level_5_0 std_video_h265_level_5_0}</li>
     * <li>{@link #std_video_h265_level_5_1 std_video_h265_level_5_1}</li>
     * <li>{@link #std_video_h265_level_5_2 std_video_h265_level_5_2}</li>
     * <li>{@link #std_video_h265_level_6_0 std_video_h265_level_6_0}</li>
     * <li>{@link #std_video_h265_level_6_1 std_video_h265_level_6_1}</li>
     * <li>{@link #std_video_h265_level_6_2 std_video_h265_level_6_2}</li>
     * <li>{@link #std_video_h265_level_invalid std_video_h265_level_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h265_level_1_0     = 0,
        std_video_h265_level_2_0     = 1,
        std_video_h265_level_2_1     = 2,
        std_video_h265_level_3_0     = 3,
        std_video_h265_level_3_1     = 4,
        std_video_h265_level_4_0     = 5,
        std_video_h265_level_4_1     = 6,
        std_video_h265_level_5_0     = 7,
        std_video_h265_level_5_1     = 8,
        std_video_h265_level_5_2     = 9,
        std_video_h265_level_6_0     = 10,
        std_video_h265_level_6_1     = 11,
        std_video_h265_level_6_2     = 12,
        std_video_h265_level_invalid = 0x7FFFFFFF;

    private STDVulkanVideoCodecH265() {}

}