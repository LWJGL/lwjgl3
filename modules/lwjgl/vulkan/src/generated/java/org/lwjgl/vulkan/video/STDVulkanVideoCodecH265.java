/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import static org.lwjgl.vulkan.video.STDVulkanVideo.*;

public final class STDVulkanVideoCodecH265 {

    /** The extension specification version. */
    public static final int VK_STD_VULKAN_VIDEO_CODEC_H265_SPEC_VERSION = VK_MAKE_VIDEO_STD_VERSION(0, 9, 5);

    /** The extension name. */
    public static final String VK_STD_VULKAN_VIDEO_CODEC_H265_EXTENSION_NAME = "VK_STD_vulkan_video_codec_h265";

    public static final int
        STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE               = 7,
        STD_VIDEO_H265_CPB_CNT_LIST_SIZE                        = 32,
        STD_VIDEO_H265_SCALING_LIST_4X4_NUM_LISTS               = 6,
        STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS            = 16,
        STD_VIDEO_H265_SCALING_LIST_8X8_NUM_LISTS               = 6,
        STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS            = 64,
        STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS             = 6,
        STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS          = 64,
        STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS             = 2,
        STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS          = 64,
        STD_VIDEO_H265_PREDICTOR_PALETTE_COMPONENTS_LIST_SIZE   = 3,
        STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE = 128,
        STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE     = 19,
        STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE     = 21,
        STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE               = 6;

    /**
     * {@code StdVideoH265ChromaFormatIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H265_CHROMA_FORMAT_IDC_MONOCHROME VIDEO_H265_CHROMA_FORMAT_IDC_MONOCHROME}</li>
     * <li>{@link #STD_VIDEO_H265_CHROMA_FORMAT_IDC_420 VIDEO_H265_CHROMA_FORMAT_IDC_420}</li>
     * <li>{@link #STD_VIDEO_H265_CHROMA_FORMAT_IDC_422 VIDEO_H265_CHROMA_FORMAT_IDC_422}</li>
     * <li>{@link #STD_VIDEO_H265_CHROMA_FORMAT_IDC_444 VIDEO_H265_CHROMA_FORMAT_IDC_444}</li>
     * <li>{@link #STD_VIDEO_H265_CHROMA_FORMAT_IDC_INVALID VIDEO_H265_CHROMA_FORMAT_IDC_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H265_CHROMA_FORMAT_IDC_MONOCHROME = 0,
        STD_VIDEO_H265_CHROMA_FORMAT_IDC_420        = 1,
        STD_VIDEO_H265_CHROMA_FORMAT_IDC_422        = 2,
        STD_VIDEO_H265_CHROMA_FORMAT_IDC_444        = 3,
        STD_VIDEO_H265_CHROMA_FORMAT_IDC_INVALID    = 0x7FFFFFFF;

    /**
     * {@code StdVideoH265ProfileIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H265_PROFILE_IDC_MAIN VIDEO_H265_PROFILE_IDC_MAIN}</li>
     * <li>{@link #STD_VIDEO_H265_PROFILE_IDC_MAIN_10 VIDEO_H265_PROFILE_IDC_MAIN_10}</li>
     * <li>{@link #STD_VIDEO_H265_PROFILE_IDC_MAIN_STILL_PICTURE VIDEO_H265_PROFILE_IDC_MAIN_STILL_PICTURE}</li>
     * <li>{@link #STD_VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS}</li>
     * <li>{@link #STD_VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS}</li>
     * <li>{@link #STD_VIDEO_H265_PROFILE_IDC_INVALID VIDEO_H265_PROFILE_IDC_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H265_PROFILE_IDC_MAIN                    = 1,
        STD_VIDEO_H265_PROFILE_IDC_MAIN_10                 = 2,
        STD_VIDEO_H265_PROFILE_IDC_MAIN_STILL_PICTURE      = 3,
        STD_VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS = 4,
        STD_VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS          = 9,
        STD_VIDEO_H265_PROFILE_IDC_INVALID                 = 0x7FFFFFFF;

    /**
     * {@code StdVideoH265Level}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H265_LEVEL_1_0 VIDEO_H265_LEVEL_1_0}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_2_0 VIDEO_H265_LEVEL_2_0}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_2_1 VIDEO_H265_LEVEL_2_1}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_3_0 VIDEO_H265_LEVEL_3_0}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_3_1 VIDEO_H265_LEVEL_3_1}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_4_0 VIDEO_H265_LEVEL_4_0}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_4_1 VIDEO_H265_LEVEL_4_1}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_5_0 VIDEO_H265_LEVEL_5_0}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_5_1 VIDEO_H265_LEVEL_5_1}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_5_2 VIDEO_H265_LEVEL_5_2}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_6_0 VIDEO_H265_LEVEL_6_0}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_6_1 VIDEO_H265_LEVEL_6_1}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_6_2 VIDEO_H265_LEVEL_6_2}</li>
     * <li>{@link #STD_VIDEO_H265_LEVEL_INVALID VIDEO_H265_LEVEL_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H265_LEVEL_1_0     = 0,
        STD_VIDEO_H265_LEVEL_2_0     = 1,
        STD_VIDEO_H265_LEVEL_2_1     = 2,
        STD_VIDEO_H265_LEVEL_3_0     = 3,
        STD_VIDEO_H265_LEVEL_3_1     = 4,
        STD_VIDEO_H265_LEVEL_4_0     = 5,
        STD_VIDEO_H265_LEVEL_4_1     = 6,
        STD_VIDEO_H265_LEVEL_5_0     = 7,
        STD_VIDEO_H265_LEVEL_5_1     = 8,
        STD_VIDEO_H265_LEVEL_5_2     = 9,
        STD_VIDEO_H265_LEVEL_6_0     = 10,
        STD_VIDEO_H265_LEVEL_6_1     = 11,
        STD_VIDEO_H265_LEVEL_6_2     = 12,
        STD_VIDEO_H265_LEVEL_INVALID = 0x7FFFFFFF;

    /**
     * {@code StdVideoH265SliceType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H265_SLICE_TYPE_B VIDEO_H265_SLICE_TYPE_B}</li>
     * <li>{@link #STD_VIDEO_H265_SLICE_TYPE_P VIDEO_H265_SLICE_TYPE_P}</li>
     * <li>{@link #STD_VIDEO_H265_SLICE_TYPE_I VIDEO_H265_SLICE_TYPE_I}</li>
     * <li>{@link #STD_VIDEO_H265_SLICE_TYPE_INVALID VIDEO_H265_SLICE_TYPE_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H265_SLICE_TYPE_B       = 0,
        STD_VIDEO_H265_SLICE_TYPE_P       = 1,
        STD_VIDEO_H265_SLICE_TYPE_I       = 2,
        STD_VIDEO_H265_SLICE_TYPE_INVALID = 0x7FFFFFFF;

    /**
     * {@code StdVideoH265PictureType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #STD_VIDEO_H265_PICTURE_TYPE_P VIDEO_H265_PICTURE_TYPE_P}</li>
     * <li>{@link #STD_VIDEO_H265_PICTURE_TYPE_B VIDEO_H265_PICTURE_TYPE_B}</li>
     * <li>{@link #STD_VIDEO_H265_PICTURE_TYPE_I VIDEO_H265_PICTURE_TYPE_I}</li>
     * <li>{@link #STD_VIDEO_H265_PICTURE_TYPE_IDR VIDEO_H265_PICTURE_TYPE_IDR}</li>
     * <li>{@link #STD_VIDEO_H265_PICTURE_TYPE_INVALID VIDEO_H265_PICTURE_TYPE_INVALID}</li>
     * </ul>
     */
    public static final int
        STD_VIDEO_H265_PICTURE_TYPE_P       = 0,
        STD_VIDEO_H265_PICTURE_TYPE_B       = 1,
        STD_VIDEO_H265_PICTURE_TYPE_I       = 2,
        STD_VIDEO_H265_PICTURE_TYPE_IDR     = 3,
        STD_VIDEO_H265_PICTURE_TYPE_INVALID = 0x7FFFFFFF;

    public static final int STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE = 8;

    public static final int
        STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE   = 15,
        STD_VIDEO_ENCODE_H265_CHROMA_LIST_SIZE = 15,
        STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM = 2;

    private STDVulkanVideoCodecH265() {}

}