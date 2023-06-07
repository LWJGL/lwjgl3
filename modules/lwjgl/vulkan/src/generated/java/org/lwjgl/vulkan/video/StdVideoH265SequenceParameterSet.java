/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH265SequenceParameterSet {
 *     {@link StdVideoH265SpsFlags StdVideoH265SpsFlags} flags;
 *     StdVideoH265ChromaFormatIdc chroma_format_idc;
 *     uint32_t pic_width_in_luma_samples;
 *     uint32_t pic_height_in_luma_samples;
 *     uint8_t sps_video_parameter_set_id;
 *     uint8_t sps_max_sub_layers_minus1;
 *     uint8_t sps_seq_parameter_set_id;
 *     uint8_t bit_depth_luma_minus8;
 *     uint8_t bit_depth_chroma_minus8;
 *     uint8_t log2_max_pic_order_cnt_lsb_minus4;
 *     uint8_t sps_max_dec_pic_buffering_minus1;
 *     uint8_t log2_min_luma_coding_block_size_minus3;
 *     uint8_t log2_diff_max_min_luma_coding_block_size;
 *     uint8_t log2_min_luma_transform_block_size_minus2;
 *     uint8_t log2_diff_max_min_luma_transform_block_size;
 *     uint8_t max_transform_hierarchy_depth_inter;
 *     uint8_t max_transform_hierarchy_depth_intra;
 *     uint8_t num_short_term_ref_pic_sets;
 *     uint8_t num_long_term_ref_pics_sps;
 *     uint8_t pcm_sample_bit_depth_luma_minus1;
 *     uint8_t pcm_sample_bit_depth_chroma_minus1;
 *     uint8_t log2_min_pcm_luma_coding_block_size_minus3;
 *     uint8_t log2_diff_max_min_pcm_luma_coding_block_size;
 *     uint8_t reserved1;
 *     uint8_t reserved2;
 *     uint8_t {@link #palette_max_size};
 *     uint8_t delta_palette_max_predictor_size;
 *     uint8_t motion_vector_resolution_control_idc;
 *     uint8_t sps_num_palette_predictor_initializer_minus1;
 *     uint32_t conf_win_left_offset;
 *     uint32_t conf_win_right_offset;
 *     uint32_t conf_win_top_offset;
 *     uint32_t conf_win_bottom_offset;
 *     {@link StdVideoH265ProfileTierLevel StdVideoH265ProfileTierLevel} const * pProfileTierLevel;
 *     {@link StdVideoH265DecPicBufMgr StdVideoH265DecPicBufMgr} const * pDecPicBufMgr;
 *     {@link StdVideoH265ScalingLists StdVideoH265ScalingLists} const * {@link #pScalingLists};
 *     {@link StdVideoH265ShortTermRefPicSet StdVideoH265ShortTermRefPicSet} const * pShortTermRefPicSet;
 *     {@link StdVideoH265LongTermRefPicsSps StdVideoH265LongTermRefPicsSps} const * pLongTermRefPicsSps;
 *     {@link StdVideoH265SequenceParameterSetVui StdVideoH265SequenceParameterSetVui} const * {@link #pSequenceParameterSetVui};
 *     {@link StdVideoH265PredictorPaletteEntries StdVideoH265PredictorPaletteEntries} const * {@link #pPredictorPaletteEntries};
 * }</code></pre>
 */
public class StdVideoH265SequenceParameterSet extends Struct<StdVideoH265SequenceParameterSet> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        CHROMA_FORMAT_IDC,
        PIC_WIDTH_IN_LUMA_SAMPLES,
        PIC_HEIGHT_IN_LUMA_SAMPLES,
        SPS_VIDEO_PARAMETER_SET_ID,
        SPS_MAX_SUB_LAYERS_MINUS1,
        SPS_SEQ_PARAMETER_SET_ID,
        BIT_DEPTH_LUMA_MINUS8,
        BIT_DEPTH_CHROMA_MINUS8,
        LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4,
        SPS_MAX_DEC_PIC_BUFFERING_MINUS1,
        LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3,
        LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE,
        LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2,
        LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE,
        MAX_TRANSFORM_HIERARCHY_DEPTH_INTER,
        MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA,
        NUM_SHORT_TERM_REF_PIC_SETS,
        NUM_LONG_TERM_REF_PICS_SPS,
        PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1,
        PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1,
        LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3,
        LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE,
        RESERVED1,
        RESERVED2,
        PALETTE_MAX_SIZE,
        DELTA_PALETTE_MAX_PREDICTOR_SIZE,
        MOTION_VECTOR_RESOLUTION_CONTROL_IDC,
        SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1,
        CONF_WIN_LEFT_OFFSET,
        CONF_WIN_RIGHT_OFFSET,
        CONF_WIN_TOP_OFFSET,
        CONF_WIN_BOTTOM_OFFSET,
        PPROFILETIERLEVEL,
        PDECPICBUFMGR,
        PSCALINGLISTS,
        PSHORTTERMREFPICSET,
        PLONGTERMREFPICSSPS,
        PSEQUENCEPARAMETERSETVUI,
        PPREDICTORPALETTEENTRIES;

    static {
        Layout layout = __struct(
            __member(StdVideoH265SpsFlags.SIZEOF, StdVideoH265SpsFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        CHROMA_FORMAT_IDC = layout.offsetof(1);
        PIC_WIDTH_IN_LUMA_SAMPLES = layout.offsetof(2);
        PIC_HEIGHT_IN_LUMA_SAMPLES = layout.offsetof(3);
        SPS_VIDEO_PARAMETER_SET_ID = layout.offsetof(4);
        SPS_MAX_SUB_LAYERS_MINUS1 = layout.offsetof(5);
        SPS_SEQ_PARAMETER_SET_ID = layout.offsetof(6);
        BIT_DEPTH_LUMA_MINUS8 = layout.offsetof(7);
        BIT_DEPTH_CHROMA_MINUS8 = layout.offsetof(8);
        LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4 = layout.offsetof(9);
        SPS_MAX_DEC_PIC_BUFFERING_MINUS1 = layout.offsetof(10);
        LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3 = layout.offsetof(11);
        LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE = layout.offsetof(12);
        LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2 = layout.offsetof(13);
        LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE = layout.offsetof(14);
        MAX_TRANSFORM_HIERARCHY_DEPTH_INTER = layout.offsetof(15);
        MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA = layout.offsetof(16);
        NUM_SHORT_TERM_REF_PIC_SETS = layout.offsetof(17);
        NUM_LONG_TERM_REF_PICS_SPS = layout.offsetof(18);
        PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1 = layout.offsetof(19);
        PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1 = layout.offsetof(20);
        LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3 = layout.offsetof(21);
        LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE = layout.offsetof(22);
        RESERVED1 = layout.offsetof(23);
        RESERVED2 = layout.offsetof(24);
        PALETTE_MAX_SIZE = layout.offsetof(25);
        DELTA_PALETTE_MAX_PREDICTOR_SIZE = layout.offsetof(26);
        MOTION_VECTOR_RESOLUTION_CONTROL_IDC = layout.offsetof(27);
        SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1 = layout.offsetof(28);
        CONF_WIN_LEFT_OFFSET = layout.offsetof(29);
        CONF_WIN_RIGHT_OFFSET = layout.offsetof(30);
        CONF_WIN_TOP_OFFSET = layout.offsetof(31);
        CONF_WIN_BOTTOM_OFFSET = layout.offsetof(32);
        PPROFILETIERLEVEL = layout.offsetof(33);
        PDECPICBUFMGR = layout.offsetof(34);
        PSCALINGLISTS = layout.offsetof(35);
        PSHORTTERMREFPICSET = layout.offsetof(36);
        PLONGTERMREFPICSSPS = layout.offsetof(37);
        PSEQUENCEPARAMETERSETVUI = layout.offsetof(38);
        PPREDICTORPALETTEENTRIES = layout.offsetof(39);
    }

    protected StdVideoH265SequenceParameterSet(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoH265SequenceParameterSet create(long address, @Nullable ByteBuffer container) {
        return new StdVideoH265SequenceParameterSet(address, container);
    }

    /**
     * Creates a {@code StdVideoH265SequenceParameterSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265SequenceParameterSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoH265SpsFlags} view of the {@code flags} field. */
    public StdVideoH265SpsFlags flags() { return nflags(address()); }
    /** @return the value of the {@code chroma_format_idc} field. */
    @NativeType("StdVideoH265ChromaFormatIdc")
    public int chroma_format_idc() { return nchroma_format_idc(address()); }
    /** @return the value of the {@code pic_width_in_luma_samples} field. */
    @NativeType("uint32_t")
    public int pic_width_in_luma_samples() { return npic_width_in_luma_samples(address()); }
    /** @return the value of the {@code pic_height_in_luma_samples} field. */
    @NativeType("uint32_t")
    public int pic_height_in_luma_samples() { return npic_height_in_luma_samples(address()); }
    /** @return the value of the {@code sps_video_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte sps_video_parameter_set_id() { return nsps_video_parameter_set_id(address()); }
    /** @return the value of the {@code sps_max_sub_layers_minus1} field. */
    @NativeType("uint8_t")
    public byte sps_max_sub_layers_minus1() { return nsps_max_sub_layers_minus1(address()); }
    /** @return the value of the {@code sps_seq_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte sps_seq_parameter_set_id() { return nsps_seq_parameter_set_id(address()); }
    /** @return the value of the {@code bit_depth_luma_minus8} field. */
    @NativeType("uint8_t")
    public byte bit_depth_luma_minus8() { return nbit_depth_luma_minus8(address()); }
    /** @return the value of the {@code bit_depth_chroma_minus8} field. */
    @NativeType("uint8_t")
    public byte bit_depth_chroma_minus8() { return nbit_depth_chroma_minus8(address()); }
    /** @return the value of the {@code log2_max_pic_order_cnt_lsb_minus4} field. */
    @NativeType("uint8_t")
    public byte log2_max_pic_order_cnt_lsb_minus4() { return nlog2_max_pic_order_cnt_lsb_minus4(address()); }
    /** @return the value of the {@code sps_max_dec_pic_buffering_minus1} field. */
    @NativeType("uint8_t")
    public byte sps_max_dec_pic_buffering_minus1() { return nsps_max_dec_pic_buffering_minus1(address()); }
    /** @return the value of the {@code log2_min_luma_coding_block_size_minus3} field. */
    @NativeType("uint8_t")
    public byte log2_min_luma_coding_block_size_minus3() { return nlog2_min_luma_coding_block_size_minus3(address()); }
    /** @return the value of the {@code log2_diff_max_min_luma_coding_block_size} field. */
    @NativeType("uint8_t")
    public byte log2_diff_max_min_luma_coding_block_size() { return nlog2_diff_max_min_luma_coding_block_size(address()); }
    /** @return the value of the {@code log2_min_luma_transform_block_size_minus2} field. */
    @NativeType("uint8_t")
    public byte log2_min_luma_transform_block_size_minus2() { return nlog2_min_luma_transform_block_size_minus2(address()); }
    /** @return the value of the {@code log2_diff_max_min_luma_transform_block_size} field. */
    @NativeType("uint8_t")
    public byte log2_diff_max_min_luma_transform_block_size() { return nlog2_diff_max_min_luma_transform_block_size(address()); }
    /** @return the value of the {@code max_transform_hierarchy_depth_inter} field. */
    @NativeType("uint8_t")
    public byte max_transform_hierarchy_depth_inter() { return nmax_transform_hierarchy_depth_inter(address()); }
    /** @return the value of the {@code max_transform_hierarchy_depth_intra} field. */
    @NativeType("uint8_t")
    public byte max_transform_hierarchy_depth_intra() { return nmax_transform_hierarchy_depth_intra(address()); }
    /** @return the value of the {@code num_short_term_ref_pic_sets} field. */
    @NativeType("uint8_t")
    public byte num_short_term_ref_pic_sets() { return nnum_short_term_ref_pic_sets(address()); }
    /** @return the value of the {@code num_long_term_ref_pics_sps} field. */
    @NativeType("uint8_t")
    public byte num_long_term_ref_pics_sps() { return nnum_long_term_ref_pics_sps(address()); }
    /** @return the value of the {@code pcm_sample_bit_depth_luma_minus1} field. */
    @NativeType("uint8_t")
    public byte pcm_sample_bit_depth_luma_minus1() { return npcm_sample_bit_depth_luma_minus1(address()); }
    /** @return the value of the {@code pcm_sample_bit_depth_chroma_minus1} field. */
    @NativeType("uint8_t")
    public byte pcm_sample_bit_depth_chroma_minus1() { return npcm_sample_bit_depth_chroma_minus1(address()); }
    /** @return the value of the {@code log2_min_pcm_luma_coding_block_size_minus3} field. */
    @NativeType("uint8_t")
    public byte log2_min_pcm_luma_coding_block_size_minus3() { return nlog2_min_pcm_luma_coding_block_size_minus3(address()); }
    /** @return the value of the {@code log2_diff_max_min_pcm_luma_coding_block_size} field. */
    @NativeType("uint8_t")
    public byte log2_diff_max_min_pcm_luma_coding_block_size() { return nlog2_diff_max_min_pcm_luma_coding_block_size(address()); }
    /** extension SPS flags, valid when {@link STDVulkanVideoCodecH265#STD_VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS} is set */
    @NativeType("uint8_t")
    public byte palette_max_size() { return npalette_max_size(address()); }
    /** @return the value of the {@code delta_palette_max_predictor_size} field. */
    @NativeType("uint8_t")
    public byte delta_palette_max_predictor_size() { return ndelta_palette_max_predictor_size(address()); }
    /** @return the value of the {@code motion_vector_resolution_control_idc} field. */
    @NativeType("uint8_t")
    public byte motion_vector_resolution_control_idc() { return nmotion_vector_resolution_control_idc(address()); }
    /** @return the value of the {@code sps_num_palette_predictor_initializer_minus1} field. */
    @NativeType("uint8_t")
    public byte sps_num_palette_predictor_initializer_minus1() { return nsps_num_palette_predictor_initializer_minus1(address()); }
    /** @return the value of the {@code conf_win_left_offset} field. */
    @NativeType("uint32_t")
    public int conf_win_left_offset() { return nconf_win_left_offset(address()); }
    /** @return the value of the {@code conf_win_right_offset} field. */
    @NativeType("uint32_t")
    public int conf_win_right_offset() { return nconf_win_right_offset(address()); }
    /** @return the value of the {@code conf_win_top_offset} field. */
    @NativeType("uint32_t")
    public int conf_win_top_offset() { return nconf_win_top_offset(address()); }
    /** @return the value of the {@code conf_win_bottom_offset} field. */
    @NativeType("uint32_t")
    public int conf_win_bottom_offset() { return nconf_win_bottom_offset(address()); }
    /** @return a {@link StdVideoH265ProfileTierLevel} view of the struct pointed to by the {@code pProfileTierLevel} field. */
    @NativeType("StdVideoH265ProfileTierLevel const *")
    public StdVideoH265ProfileTierLevel pProfileTierLevel() { return npProfileTierLevel(address()); }
    /** @return a {@link StdVideoH265DecPicBufMgr} view of the struct pointed to by the {@code pDecPicBufMgr} field. */
    @NativeType("StdVideoH265DecPicBufMgr const *")
    public StdVideoH265DecPicBufMgr pDecPicBufMgr() { return npDecPicBufMgr(address()); }
    /** must be a valid pointer if sps_scaling_list_data_present_flag is set */
    @NativeType("StdVideoH265ScalingLists const *")
    public StdVideoH265ScalingLists pScalingLists() { return npScalingLists(address()); }
    /** @return a {@link StdVideoH265ShortTermRefPicSet} view of the struct pointed to by the {@code pShortTermRefPicSet} field. */
    @NativeType("StdVideoH265ShortTermRefPicSet const *")
    public StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() { return npShortTermRefPicSet(address()); }
    /** @return a {@link StdVideoH265LongTermRefPicsSps} view of the struct pointed to by the {@code pLongTermRefPicsSps} field. */
    @NativeType("StdVideoH265LongTermRefPicsSps const *")
    public StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps() { return npLongTermRefPicsSps(address()); }
    /** must be a valid pointer if StdVideoH265SpsFlags:vui_parameters_present_flag is set palette_max_size; */
    @NativeType("StdVideoH265SequenceParameterSetVui const *")
    public StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui() { return npSequenceParameterSetVui(address()); }
    /** must be a valid pointer if sps_palette_predictor_initializer_present_flag is set */
    @NativeType("StdVideoH265PredictorPaletteEntries const *")
    public StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() { return npPredictorPaletteEntries(address()); }

    /** Copies the specified {@link StdVideoH265SpsFlags} to the {@code flags} field. */
    public StdVideoH265SequenceParameterSet flags(StdVideoH265SpsFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH265SequenceParameterSet flags(java.util.function.Consumer<StdVideoH265SpsFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code chroma_format_idc} field. */
    public StdVideoH265SequenceParameterSet chroma_format_idc(@NativeType("StdVideoH265ChromaFormatIdc") int value) { nchroma_format_idc(address(), value); return this; }
    /** Sets the specified value to the {@code pic_width_in_luma_samples} field. */
    public StdVideoH265SequenceParameterSet pic_width_in_luma_samples(@NativeType("uint32_t") int value) { npic_width_in_luma_samples(address(), value); return this; }
    /** Sets the specified value to the {@code pic_height_in_luma_samples} field. */
    public StdVideoH265SequenceParameterSet pic_height_in_luma_samples(@NativeType("uint32_t") int value) { npic_height_in_luma_samples(address(), value); return this; }
    /** Sets the specified value to the {@code sps_video_parameter_set_id} field. */
    public StdVideoH265SequenceParameterSet sps_video_parameter_set_id(@NativeType("uint8_t") byte value) { nsps_video_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code sps_max_sub_layers_minus1} field. */
    public StdVideoH265SequenceParameterSet sps_max_sub_layers_minus1(@NativeType("uint8_t") byte value) { nsps_max_sub_layers_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code sps_seq_parameter_set_id} field. */
    public StdVideoH265SequenceParameterSet sps_seq_parameter_set_id(@NativeType("uint8_t") byte value) { nsps_seq_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code bit_depth_luma_minus8} field. */
    public StdVideoH265SequenceParameterSet bit_depth_luma_minus8(@NativeType("uint8_t") byte value) { nbit_depth_luma_minus8(address(), value); return this; }
    /** Sets the specified value to the {@code bit_depth_chroma_minus8} field. */
    public StdVideoH265SequenceParameterSet bit_depth_chroma_minus8(@NativeType("uint8_t") byte value) { nbit_depth_chroma_minus8(address(), value); return this; }
    /** Sets the specified value to the {@code log2_max_pic_order_cnt_lsb_minus4} field. */
    public StdVideoH265SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(@NativeType("uint8_t") byte value) { nlog2_max_pic_order_cnt_lsb_minus4(address(), value); return this; }
    /** Sets the specified value to the {@code sps_max_dec_pic_buffering_minus1} field. */
    public StdVideoH265SequenceParameterSet sps_max_dec_pic_buffering_minus1(@NativeType("uint8_t") byte value) { nsps_max_dec_pic_buffering_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code log2_min_luma_coding_block_size_minus3} field. */
    public StdVideoH265SequenceParameterSet log2_min_luma_coding_block_size_minus3(@NativeType("uint8_t") byte value) { nlog2_min_luma_coding_block_size_minus3(address(), value); return this; }
    /** Sets the specified value to the {@code log2_diff_max_min_luma_coding_block_size} field. */
    public StdVideoH265SequenceParameterSet log2_diff_max_min_luma_coding_block_size(@NativeType("uint8_t") byte value) { nlog2_diff_max_min_luma_coding_block_size(address(), value); return this; }
    /** Sets the specified value to the {@code log2_min_luma_transform_block_size_minus2} field. */
    public StdVideoH265SequenceParameterSet log2_min_luma_transform_block_size_minus2(@NativeType("uint8_t") byte value) { nlog2_min_luma_transform_block_size_minus2(address(), value); return this; }
    /** Sets the specified value to the {@code log2_diff_max_min_luma_transform_block_size} field. */
    public StdVideoH265SequenceParameterSet log2_diff_max_min_luma_transform_block_size(@NativeType("uint8_t") byte value) { nlog2_diff_max_min_luma_transform_block_size(address(), value); return this; }
    /** Sets the specified value to the {@code max_transform_hierarchy_depth_inter} field. */
    public StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_inter(@NativeType("uint8_t") byte value) { nmax_transform_hierarchy_depth_inter(address(), value); return this; }
    /** Sets the specified value to the {@code max_transform_hierarchy_depth_intra} field. */
    public StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_intra(@NativeType("uint8_t") byte value) { nmax_transform_hierarchy_depth_intra(address(), value); return this; }
    /** Sets the specified value to the {@code num_short_term_ref_pic_sets} field. */
    public StdVideoH265SequenceParameterSet num_short_term_ref_pic_sets(@NativeType("uint8_t") byte value) { nnum_short_term_ref_pic_sets(address(), value); return this; }
    /** Sets the specified value to the {@code num_long_term_ref_pics_sps} field. */
    public StdVideoH265SequenceParameterSet num_long_term_ref_pics_sps(@NativeType("uint8_t") byte value) { nnum_long_term_ref_pics_sps(address(), value); return this; }
    /** Sets the specified value to the {@code pcm_sample_bit_depth_luma_minus1} field. */
    public StdVideoH265SequenceParameterSet pcm_sample_bit_depth_luma_minus1(@NativeType("uint8_t") byte value) { npcm_sample_bit_depth_luma_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code pcm_sample_bit_depth_chroma_minus1} field. */
    public StdVideoH265SequenceParameterSet pcm_sample_bit_depth_chroma_minus1(@NativeType("uint8_t") byte value) { npcm_sample_bit_depth_chroma_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code log2_min_pcm_luma_coding_block_size_minus3} field. */
    public StdVideoH265SequenceParameterSet log2_min_pcm_luma_coding_block_size_minus3(@NativeType("uint8_t") byte value) { nlog2_min_pcm_luma_coding_block_size_minus3(address(), value); return this; }
    /** Sets the specified value to the {@code log2_diff_max_min_pcm_luma_coding_block_size} field. */
    public StdVideoH265SequenceParameterSet log2_diff_max_min_pcm_luma_coding_block_size(@NativeType("uint8_t") byte value) { nlog2_diff_max_min_pcm_luma_coding_block_size(address(), value); return this; }
    /** Sets the specified value to the {@link #palette_max_size} field. */
    public StdVideoH265SequenceParameterSet palette_max_size(@NativeType("uint8_t") byte value) { npalette_max_size(address(), value); return this; }
    /** Sets the specified value to the {@code delta_palette_max_predictor_size} field. */
    public StdVideoH265SequenceParameterSet delta_palette_max_predictor_size(@NativeType("uint8_t") byte value) { ndelta_palette_max_predictor_size(address(), value); return this; }
    /** Sets the specified value to the {@code motion_vector_resolution_control_idc} field. */
    public StdVideoH265SequenceParameterSet motion_vector_resolution_control_idc(@NativeType("uint8_t") byte value) { nmotion_vector_resolution_control_idc(address(), value); return this; }
    /** Sets the specified value to the {@code sps_num_palette_predictor_initializer_minus1} field. */
    public StdVideoH265SequenceParameterSet sps_num_palette_predictor_initializer_minus1(@NativeType("uint8_t") byte value) { nsps_num_palette_predictor_initializer_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code conf_win_left_offset} field. */
    public StdVideoH265SequenceParameterSet conf_win_left_offset(@NativeType("uint32_t") int value) { nconf_win_left_offset(address(), value); return this; }
    /** Sets the specified value to the {@code conf_win_right_offset} field. */
    public StdVideoH265SequenceParameterSet conf_win_right_offset(@NativeType("uint32_t") int value) { nconf_win_right_offset(address(), value); return this; }
    /** Sets the specified value to the {@code conf_win_top_offset} field. */
    public StdVideoH265SequenceParameterSet conf_win_top_offset(@NativeType("uint32_t") int value) { nconf_win_top_offset(address(), value); return this; }
    /** Sets the specified value to the {@code conf_win_bottom_offset} field. */
    public StdVideoH265SequenceParameterSet conf_win_bottom_offset(@NativeType("uint32_t") int value) { nconf_win_bottom_offset(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265ProfileTierLevel} to the {@code pProfileTierLevel} field. */
    public StdVideoH265SequenceParameterSet pProfileTierLevel(@NativeType("StdVideoH265ProfileTierLevel const *") StdVideoH265ProfileTierLevel value) { npProfileTierLevel(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265DecPicBufMgr} to the {@code pDecPicBufMgr} field. */
    public StdVideoH265SequenceParameterSet pDecPicBufMgr(@NativeType("StdVideoH265DecPicBufMgr const *") StdVideoH265DecPicBufMgr value) { npDecPicBufMgr(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265ScalingLists} to the {@link #pScalingLists} field. */
    public StdVideoH265SequenceParameterSet pScalingLists(@NativeType("StdVideoH265ScalingLists const *") StdVideoH265ScalingLists value) { npScalingLists(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265ShortTermRefPicSet} to the {@code pShortTermRefPicSet} field. */
    public StdVideoH265SequenceParameterSet pShortTermRefPicSet(@NativeType("StdVideoH265ShortTermRefPicSet const *") StdVideoH265ShortTermRefPicSet value) { npShortTermRefPicSet(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265LongTermRefPicsSps} to the {@code pLongTermRefPicsSps} field. */
    public StdVideoH265SequenceParameterSet pLongTermRefPicsSps(@NativeType("StdVideoH265LongTermRefPicsSps const *") StdVideoH265LongTermRefPicsSps value) { npLongTermRefPicsSps(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265SequenceParameterSetVui} to the {@link #pSequenceParameterSetVui} field. */
    public StdVideoH265SequenceParameterSet pSequenceParameterSetVui(@NativeType("StdVideoH265SequenceParameterSetVui const *") StdVideoH265SequenceParameterSetVui value) { npSequenceParameterSetVui(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265PredictorPaletteEntries} to the {@link #pPredictorPaletteEntries} field. */
    public StdVideoH265SequenceParameterSet pPredictorPaletteEntries(@NativeType("StdVideoH265PredictorPaletteEntries const *") StdVideoH265PredictorPaletteEntries value) { npPredictorPaletteEntries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265SequenceParameterSet set(
        StdVideoH265SpsFlags flags,
        int chroma_format_idc,
        int pic_width_in_luma_samples,
        int pic_height_in_luma_samples,
        byte sps_video_parameter_set_id,
        byte sps_max_sub_layers_minus1,
        byte sps_seq_parameter_set_id,
        byte bit_depth_luma_minus8,
        byte bit_depth_chroma_minus8,
        byte log2_max_pic_order_cnt_lsb_minus4,
        byte sps_max_dec_pic_buffering_minus1,
        byte log2_min_luma_coding_block_size_minus3,
        byte log2_diff_max_min_luma_coding_block_size,
        byte log2_min_luma_transform_block_size_minus2,
        byte log2_diff_max_min_luma_transform_block_size,
        byte max_transform_hierarchy_depth_inter,
        byte max_transform_hierarchy_depth_intra,
        byte num_short_term_ref_pic_sets,
        byte num_long_term_ref_pics_sps,
        byte pcm_sample_bit_depth_luma_minus1,
        byte pcm_sample_bit_depth_chroma_minus1,
        byte log2_min_pcm_luma_coding_block_size_minus3,
        byte log2_diff_max_min_pcm_luma_coding_block_size,
        byte palette_max_size,
        byte delta_palette_max_predictor_size,
        byte motion_vector_resolution_control_idc,
        byte sps_num_palette_predictor_initializer_minus1,
        int conf_win_left_offset,
        int conf_win_right_offset,
        int conf_win_top_offset,
        int conf_win_bottom_offset,
        StdVideoH265ProfileTierLevel pProfileTierLevel,
        StdVideoH265DecPicBufMgr pDecPicBufMgr,
        StdVideoH265ScalingLists pScalingLists,
        StdVideoH265ShortTermRefPicSet pShortTermRefPicSet,
        StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps,
        StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui,
        StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries
    ) {
        flags(flags);
        chroma_format_idc(chroma_format_idc);
        pic_width_in_luma_samples(pic_width_in_luma_samples);
        pic_height_in_luma_samples(pic_height_in_luma_samples);
        sps_video_parameter_set_id(sps_video_parameter_set_id);
        sps_max_sub_layers_minus1(sps_max_sub_layers_minus1);
        sps_seq_parameter_set_id(sps_seq_parameter_set_id);
        bit_depth_luma_minus8(bit_depth_luma_minus8);
        bit_depth_chroma_minus8(bit_depth_chroma_minus8);
        log2_max_pic_order_cnt_lsb_minus4(log2_max_pic_order_cnt_lsb_minus4);
        sps_max_dec_pic_buffering_minus1(sps_max_dec_pic_buffering_minus1);
        log2_min_luma_coding_block_size_minus3(log2_min_luma_coding_block_size_minus3);
        log2_diff_max_min_luma_coding_block_size(log2_diff_max_min_luma_coding_block_size);
        log2_min_luma_transform_block_size_minus2(log2_min_luma_transform_block_size_minus2);
        log2_diff_max_min_luma_transform_block_size(log2_diff_max_min_luma_transform_block_size);
        max_transform_hierarchy_depth_inter(max_transform_hierarchy_depth_inter);
        max_transform_hierarchy_depth_intra(max_transform_hierarchy_depth_intra);
        num_short_term_ref_pic_sets(num_short_term_ref_pic_sets);
        num_long_term_ref_pics_sps(num_long_term_ref_pics_sps);
        pcm_sample_bit_depth_luma_minus1(pcm_sample_bit_depth_luma_minus1);
        pcm_sample_bit_depth_chroma_minus1(pcm_sample_bit_depth_chroma_minus1);
        log2_min_pcm_luma_coding_block_size_minus3(log2_min_pcm_luma_coding_block_size_minus3);
        log2_diff_max_min_pcm_luma_coding_block_size(log2_diff_max_min_pcm_luma_coding_block_size);
        palette_max_size(palette_max_size);
        delta_palette_max_predictor_size(delta_palette_max_predictor_size);
        motion_vector_resolution_control_idc(motion_vector_resolution_control_idc);
        sps_num_palette_predictor_initializer_minus1(sps_num_palette_predictor_initializer_minus1);
        conf_win_left_offset(conf_win_left_offset);
        conf_win_right_offset(conf_win_right_offset);
        conf_win_top_offset(conf_win_top_offset);
        conf_win_bottom_offset(conf_win_bottom_offset);
        pProfileTierLevel(pProfileTierLevel);
        pDecPicBufMgr(pDecPicBufMgr);
        pScalingLists(pScalingLists);
        pShortTermRefPicSet(pShortTermRefPicSet);
        pLongTermRefPicsSps(pLongTermRefPicsSps);
        pSequenceParameterSetVui(pSequenceParameterSetVui);
        pPredictorPaletteEntries(pPredictorPaletteEntries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265SequenceParameterSet set(StdVideoH265SequenceParameterSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265SequenceParameterSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265SequenceParameterSet malloc() {
        return new StdVideoH265SequenceParameterSet(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265SequenceParameterSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265SequenceParameterSet calloc() {
        return new StdVideoH265SequenceParameterSet(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265SequenceParameterSet} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265SequenceParameterSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265SequenceParameterSet(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265SequenceParameterSet} instance for the specified memory address. */
    public static StdVideoH265SequenceParameterSet create(long address) {
        return new StdVideoH265SequenceParameterSet(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265SequenceParameterSet createSafe(long address) {
        return address == NULL ? null : new StdVideoH265SequenceParameterSet(address, null);
    }

    /**
     * Returns a new {@link StdVideoH265SequenceParameterSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSet.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SequenceParameterSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSet.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SequenceParameterSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoH265SequenceParameterSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSet.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265SequenceParameterSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265SequenceParameterSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265SequenceParameterSet malloc(MemoryStack stack) {
        return new StdVideoH265SequenceParameterSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoH265SequenceParameterSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265SequenceParameterSet calloc(MemoryStack stack) {
        return new StdVideoH265SequenceParameterSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoH265SequenceParameterSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSet.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SequenceParameterSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSet.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoH265SpsFlags nflags(long struct) { return StdVideoH265SpsFlags.create(struct + StdVideoH265SequenceParameterSet.FLAGS); }
    /** Unsafe version of {@link #chroma_format_idc}. */
    public static int nchroma_format_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SequenceParameterSet.CHROMA_FORMAT_IDC); }
    /** Unsafe version of {@link #pic_width_in_luma_samples}. */
    public static int npic_width_in_luma_samples(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SequenceParameterSet.PIC_WIDTH_IN_LUMA_SAMPLES); }
    /** Unsafe version of {@link #pic_height_in_luma_samples}. */
    public static int npic_height_in_luma_samples(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SequenceParameterSet.PIC_HEIGHT_IN_LUMA_SAMPLES); }
    /** Unsafe version of {@link #sps_video_parameter_set_id}. */
    public static byte nsps_video_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.SPS_VIDEO_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #sps_max_sub_layers_minus1}. */
    public static byte nsps_max_sub_layers_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.SPS_MAX_SUB_LAYERS_MINUS1); }
    /** Unsafe version of {@link #sps_seq_parameter_set_id}. */
    public static byte nsps_seq_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.SPS_SEQ_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #bit_depth_luma_minus8}. */
    public static byte nbit_depth_luma_minus8(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.BIT_DEPTH_LUMA_MINUS8); }
    /** Unsafe version of {@link #bit_depth_chroma_minus8}. */
    public static byte nbit_depth_chroma_minus8(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.BIT_DEPTH_CHROMA_MINUS8); }
    /** Unsafe version of {@link #log2_max_pic_order_cnt_lsb_minus4}. */
    public static byte nlog2_max_pic_order_cnt_lsb_minus4(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4); }
    /** Unsafe version of {@link #sps_max_dec_pic_buffering_minus1}. */
    public static byte nsps_max_dec_pic_buffering_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.SPS_MAX_DEC_PIC_BUFFERING_MINUS1); }
    /** Unsafe version of {@link #log2_min_luma_coding_block_size_minus3}. */
    public static byte nlog2_min_luma_coding_block_size_minus3(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3); }
    /** Unsafe version of {@link #log2_diff_max_min_luma_coding_block_size}. */
    public static byte nlog2_diff_max_min_luma_coding_block_size(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE); }
    /** Unsafe version of {@link #log2_min_luma_transform_block_size_minus2}. */
    public static byte nlog2_min_luma_transform_block_size_minus2(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2); }
    /** Unsafe version of {@link #log2_diff_max_min_luma_transform_block_size}. */
    public static byte nlog2_diff_max_min_luma_transform_block_size(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE); }
    /** Unsafe version of {@link #max_transform_hierarchy_depth_inter}. */
    public static byte nmax_transform_hierarchy_depth_inter(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.MAX_TRANSFORM_HIERARCHY_DEPTH_INTER); }
    /** Unsafe version of {@link #max_transform_hierarchy_depth_intra}. */
    public static byte nmax_transform_hierarchy_depth_intra(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA); }
    /** Unsafe version of {@link #num_short_term_ref_pic_sets}. */
    public static byte nnum_short_term_ref_pic_sets(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.NUM_SHORT_TERM_REF_PIC_SETS); }
    /** Unsafe version of {@link #num_long_term_ref_pics_sps}. */
    public static byte nnum_long_term_ref_pics_sps(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.NUM_LONG_TERM_REF_PICS_SPS); }
    /** Unsafe version of {@link #pcm_sample_bit_depth_luma_minus1}. */
    public static byte npcm_sample_bit_depth_luma_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1); }
    /** Unsafe version of {@link #pcm_sample_bit_depth_chroma_minus1}. */
    public static byte npcm_sample_bit_depth_chroma_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1); }
    /** Unsafe version of {@link #log2_min_pcm_luma_coding_block_size_minus3}. */
    public static byte nlog2_min_pcm_luma_coding_block_size_minus3(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3); }
    /** Unsafe version of {@link #log2_diff_max_min_pcm_luma_coding_block_size}. */
    public static byte nlog2_diff_max_min_pcm_luma_coding_block_size(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE); }
    public static byte nreserved1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.RESERVED1); }
    public static byte nreserved2(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.RESERVED2); }
    /** Unsafe version of {@link #palette_max_size}. */
    public static byte npalette_max_size(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.PALETTE_MAX_SIZE); }
    /** Unsafe version of {@link #delta_palette_max_predictor_size}. */
    public static byte ndelta_palette_max_predictor_size(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.DELTA_PALETTE_MAX_PREDICTOR_SIZE); }
    /** Unsafe version of {@link #motion_vector_resolution_control_idc}. */
    public static byte nmotion_vector_resolution_control_idc(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.MOTION_VECTOR_RESOLUTION_CONTROL_IDC); }
    /** Unsafe version of {@link #sps_num_palette_predictor_initializer_minus1}. */
    public static byte nsps_num_palette_predictor_initializer_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSet.SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1); }
    /** Unsafe version of {@link #conf_win_left_offset}. */
    public static int nconf_win_left_offset(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SequenceParameterSet.CONF_WIN_LEFT_OFFSET); }
    /** Unsafe version of {@link #conf_win_right_offset}. */
    public static int nconf_win_right_offset(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SequenceParameterSet.CONF_WIN_RIGHT_OFFSET); }
    /** Unsafe version of {@link #conf_win_top_offset}. */
    public static int nconf_win_top_offset(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SequenceParameterSet.CONF_WIN_TOP_OFFSET); }
    /** Unsafe version of {@link #conf_win_bottom_offset}. */
    public static int nconf_win_bottom_offset(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SequenceParameterSet.CONF_WIN_BOTTOM_OFFSET); }
    /** Unsafe version of {@link #pProfileTierLevel}. */
    public static StdVideoH265ProfileTierLevel npProfileTierLevel(long struct) { return StdVideoH265ProfileTierLevel.create(memGetAddress(struct + StdVideoH265SequenceParameterSet.PPROFILETIERLEVEL)); }
    /** Unsafe version of {@link #pDecPicBufMgr}. */
    public static StdVideoH265DecPicBufMgr npDecPicBufMgr(long struct) { return StdVideoH265DecPicBufMgr.create(memGetAddress(struct + StdVideoH265SequenceParameterSet.PDECPICBUFMGR)); }
    /** Unsafe version of {@link #pScalingLists}. */
    public static StdVideoH265ScalingLists npScalingLists(long struct) { return StdVideoH265ScalingLists.create(memGetAddress(struct + StdVideoH265SequenceParameterSet.PSCALINGLISTS)); }
    /** Unsafe version of {@link #pShortTermRefPicSet}. */
    public static StdVideoH265ShortTermRefPicSet npShortTermRefPicSet(long struct) { return StdVideoH265ShortTermRefPicSet.create(memGetAddress(struct + StdVideoH265SequenceParameterSet.PSHORTTERMREFPICSET)); }
    /** Unsafe version of {@link #pLongTermRefPicsSps}. */
    public static StdVideoH265LongTermRefPicsSps npLongTermRefPicsSps(long struct) { return StdVideoH265LongTermRefPicsSps.create(memGetAddress(struct + StdVideoH265SequenceParameterSet.PLONGTERMREFPICSSPS)); }
    /** Unsafe version of {@link #pSequenceParameterSetVui}. */
    public static StdVideoH265SequenceParameterSetVui npSequenceParameterSetVui(long struct) { return StdVideoH265SequenceParameterSetVui.create(memGetAddress(struct + StdVideoH265SequenceParameterSet.PSEQUENCEPARAMETERSETVUI)); }
    /** Unsafe version of {@link #pPredictorPaletteEntries}. */
    public static StdVideoH265PredictorPaletteEntries npPredictorPaletteEntries(long struct) { return StdVideoH265PredictorPaletteEntries.create(memGetAddress(struct + StdVideoH265SequenceParameterSet.PPREDICTORPALETTEENTRIES)); }

    /** Unsafe version of {@link #flags(StdVideoH265SpsFlags) flags}. */
    public static void nflags(long struct, StdVideoH265SpsFlags value) { memCopy(value.address(), struct + StdVideoH265SequenceParameterSet.FLAGS, StdVideoH265SpsFlags.SIZEOF); }
    /** Unsafe version of {@link #chroma_format_idc(int) chroma_format_idc}. */
    public static void nchroma_format_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SequenceParameterSet.CHROMA_FORMAT_IDC, value); }
    /** Unsafe version of {@link #pic_width_in_luma_samples(int) pic_width_in_luma_samples}. */
    public static void npic_width_in_luma_samples(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SequenceParameterSet.PIC_WIDTH_IN_LUMA_SAMPLES, value); }
    /** Unsafe version of {@link #pic_height_in_luma_samples(int) pic_height_in_luma_samples}. */
    public static void npic_height_in_luma_samples(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SequenceParameterSet.PIC_HEIGHT_IN_LUMA_SAMPLES, value); }
    /** Unsafe version of {@link #sps_video_parameter_set_id(byte) sps_video_parameter_set_id}. */
    public static void nsps_video_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.SPS_VIDEO_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #sps_max_sub_layers_minus1(byte) sps_max_sub_layers_minus1}. */
    public static void nsps_max_sub_layers_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.SPS_MAX_SUB_LAYERS_MINUS1, value); }
    /** Unsafe version of {@link #sps_seq_parameter_set_id(byte) sps_seq_parameter_set_id}. */
    public static void nsps_seq_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.SPS_SEQ_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #bit_depth_luma_minus8(byte) bit_depth_luma_minus8}. */
    public static void nbit_depth_luma_minus8(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.BIT_DEPTH_LUMA_MINUS8, value); }
    /** Unsafe version of {@link #bit_depth_chroma_minus8(byte) bit_depth_chroma_minus8}. */
    public static void nbit_depth_chroma_minus8(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.BIT_DEPTH_CHROMA_MINUS8, value); }
    /** Unsafe version of {@link #log2_max_pic_order_cnt_lsb_minus4(byte) log2_max_pic_order_cnt_lsb_minus4}. */
    public static void nlog2_max_pic_order_cnt_lsb_minus4(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4, value); }
    /** Unsafe version of {@link #sps_max_dec_pic_buffering_minus1(byte) sps_max_dec_pic_buffering_minus1}. */
    public static void nsps_max_dec_pic_buffering_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.SPS_MAX_DEC_PIC_BUFFERING_MINUS1, value); }
    /** Unsafe version of {@link #log2_min_luma_coding_block_size_minus3(byte) log2_min_luma_coding_block_size_minus3}. */
    public static void nlog2_min_luma_coding_block_size_minus3(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3, value); }
    /** Unsafe version of {@link #log2_diff_max_min_luma_coding_block_size(byte) log2_diff_max_min_luma_coding_block_size}. */
    public static void nlog2_diff_max_min_luma_coding_block_size(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE, value); }
    /** Unsafe version of {@link #log2_min_luma_transform_block_size_minus2(byte) log2_min_luma_transform_block_size_minus2}. */
    public static void nlog2_min_luma_transform_block_size_minus2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2, value); }
    /** Unsafe version of {@link #log2_diff_max_min_luma_transform_block_size(byte) log2_diff_max_min_luma_transform_block_size}. */
    public static void nlog2_diff_max_min_luma_transform_block_size(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE, value); }
    /** Unsafe version of {@link #max_transform_hierarchy_depth_inter(byte) max_transform_hierarchy_depth_inter}. */
    public static void nmax_transform_hierarchy_depth_inter(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.MAX_TRANSFORM_HIERARCHY_DEPTH_INTER, value); }
    /** Unsafe version of {@link #max_transform_hierarchy_depth_intra(byte) max_transform_hierarchy_depth_intra}. */
    public static void nmax_transform_hierarchy_depth_intra(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA, value); }
    /** Unsafe version of {@link #num_short_term_ref_pic_sets(byte) num_short_term_ref_pic_sets}. */
    public static void nnum_short_term_ref_pic_sets(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.NUM_SHORT_TERM_REF_PIC_SETS, value); }
    /** Unsafe version of {@link #num_long_term_ref_pics_sps(byte) num_long_term_ref_pics_sps}. */
    public static void nnum_long_term_ref_pics_sps(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.NUM_LONG_TERM_REF_PICS_SPS, value); }
    /** Unsafe version of {@link #pcm_sample_bit_depth_luma_minus1(byte) pcm_sample_bit_depth_luma_minus1}. */
    public static void npcm_sample_bit_depth_luma_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1, value); }
    /** Unsafe version of {@link #pcm_sample_bit_depth_chroma_minus1(byte) pcm_sample_bit_depth_chroma_minus1}. */
    public static void npcm_sample_bit_depth_chroma_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1, value); }
    /** Unsafe version of {@link #log2_min_pcm_luma_coding_block_size_minus3(byte) log2_min_pcm_luma_coding_block_size_minus3}. */
    public static void nlog2_min_pcm_luma_coding_block_size_minus3(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3, value); }
    /** Unsafe version of {@link #log2_diff_max_min_pcm_luma_coding_block_size(byte) log2_diff_max_min_pcm_luma_coding_block_size}. */
    public static void nlog2_diff_max_min_pcm_luma_coding_block_size(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE, value); }
    public static void nreserved1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.RESERVED1, value); }
    public static void nreserved2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.RESERVED2, value); }
    /** Unsafe version of {@link #palette_max_size(byte) palette_max_size}. */
    public static void npalette_max_size(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.PALETTE_MAX_SIZE, value); }
    /** Unsafe version of {@link #delta_palette_max_predictor_size(byte) delta_palette_max_predictor_size}. */
    public static void ndelta_palette_max_predictor_size(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.DELTA_PALETTE_MAX_PREDICTOR_SIZE, value); }
    /** Unsafe version of {@link #motion_vector_resolution_control_idc(byte) motion_vector_resolution_control_idc}. */
    public static void nmotion_vector_resolution_control_idc(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.MOTION_VECTOR_RESOLUTION_CONTROL_IDC, value); }
    /** Unsafe version of {@link #sps_num_palette_predictor_initializer_minus1(byte) sps_num_palette_predictor_initializer_minus1}. */
    public static void nsps_num_palette_predictor_initializer_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSet.SPS_NUM_PALETTE_PREDICTOR_INITIALIZER_MINUS1, value); }
    /** Unsafe version of {@link #conf_win_left_offset(int) conf_win_left_offset}. */
    public static void nconf_win_left_offset(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SequenceParameterSet.CONF_WIN_LEFT_OFFSET, value); }
    /** Unsafe version of {@link #conf_win_right_offset(int) conf_win_right_offset}. */
    public static void nconf_win_right_offset(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SequenceParameterSet.CONF_WIN_RIGHT_OFFSET, value); }
    /** Unsafe version of {@link #conf_win_top_offset(int) conf_win_top_offset}. */
    public static void nconf_win_top_offset(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SequenceParameterSet.CONF_WIN_TOP_OFFSET, value); }
    /** Unsafe version of {@link #conf_win_bottom_offset(int) conf_win_bottom_offset}. */
    public static void nconf_win_bottom_offset(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SequenceParameterSet.CONF_WIN_BOTTOM_OFFSET, value); }
    /** Unsafe version of {@link #pProfileTierLevel(StdVideoH265ProfileTierLevel) pProfileTierLevel}. */
    public static void npProfileTierLevel(long struct, StdVideoH265ProfileTierLevel value) { memPutAddress(struct + StdVideoH265SequenceParameterSet.PPROFILETIERLEVEL, value.address()); }
    /** Unsafe version of {@link #pDecPicBufMgr(StdVideoH265DecPicBufMgr) pDecPicBufMgr}. */
    public static void npDecPicBufMgr(long struct, StdVideoH265DecPicBufMgr value) { memPutAddress(struct + StdVideoH265SequenceParameterSet.PDECPICBUFMGR, value.address()); }
    /** Unsafe version of {@link #pScalingLists(StdVideoH265ScalingLists) pScalingLists}. */
    public static void npScalingLists(long struct, StdVideoH265ScalingLists value) { memPutAddress(struct + StdVideoH265SequenceParameterSet.PSCALINGLISTS, value.address()); }
    /** Unsafe version of {@link #pShortTermRefPicSet(StdVideoH265ShortTermRefPicSet) pShortTermRefPicSet}. */
    public static void npShortTermRefPicSet(long struct, StdVideoH265ShortTermRefPicSet value) { memPutAddress(struct + StdVideoH265SequenceParameterSet.PSHORTTERMREFPICSET, value.address()); }
    /** Unsafe version of {@link #pLongTermRefPicsSps(StdVideoH265LongTermRefPicsSps) pLongTermRefPicsSps}. */
    public static void npLongTermRefPicsSps(long struct, StdVideoH265LongTermRefPicsSps value) { memPutAddress(struct + StdVideoH265SequenceParameterSet.PLONGTERMREFPICSSPS, value.address()); }
    /** Unsafe version of {@link #pSequenceParameterSetVui(StdVideoH265SequenceParameterSetVui) pSequenceParameterSetVui}. */
    public static void npSequenceParameterSetVui(long struct, StdVideoH265SequenceParameterSetVui value) { memPutAddress(struct + StdVideoH265SequenceParameterSet.PSEQUENCEPARAMETERSETVUI, value.address()); }
    /** Unsafe version of {@link #pPredictorPaletteEntries(StdVideoH265PredictorPaletteEntries) pPredictorPaletteEntries}. */
    public static void npPredictorPaletteEntries(long struct, StdVideoH265PredictorPaletteEntries value) { memPutAddress(struct + StdVideoH265SequenceParameterSet.PPREDICTORPALETTEENTRIES, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoH265SequenceParameterSet.PPROFILETIERLEVEL));
        check(memGetAddress(struct + StdVideoH265SequenceParameterSet.PDECPICBUFMGR));
        check(memGetAddress(struct + StdVideoH265SequenceParameterSet.PSCALINGLISTS));
        check(memGetAddress(struct + StdVideoH265SequenceParameterSet.PSHORTTERMREFPICSET));
        check(memGetAddress(struct + StdVideoH265SequenceParameterSet.PLONGTERMREFPICSSPS));
        long pSequenceParameterSetVui = memGetAddress(struct + StdVideoH265SequenceParameterSet.PSEQUENCEPARAMETERSETVUI);
        check(pSequenceParameterSetVui);
        StdVideoH265SequenceParameterSetVui.validate(pSequenceParameterSetVui);
        check(memGetAddress(struct + StdVideoH265SequenceParameterSet.PPREDICTORPALETTEENTRIES));
    }

    // -----------------------------------

    /** An array of {@link StdVideoH265SequenceParameterSet} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265SequenceParameterSet, Buffer> implements NativeResource {

        private static final StdVideoH265SequenceParameterSet ELEMENT_FACTORY = StdVideoH265SequenceParameterSet.create(-1L);

        /**
         * Creates a new {@code StdVideoH265SequenceParameterSet.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265SequenceParameterSet#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected StdVideoH265SequenceParameterSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoH265SpsFlags} view of the {@code flags} field. */
        public StdVideoH265SpsFlags flags() { return StdVideoH265SequenceParameterSet.nflags(address()); }
        /** @return the value of the {@code chroma_format_idc} field. */
        @NativeType("StdVideoH265ChromaFormatIdc")
        public int chroma_format_idc() { return StdVideoH265SequenceParameterSet.nchroma_format_idc(address()); }
        /** @return the value of the {@code pic_width_in_luma_samples} field. */
        @NativeType("uint32_t")
        public int pic_width_in_luma_samples() { return StdVideoH265SequenceParameterSet.npic_width_in_luma_samples(address()); }
        /** @return the value of the {@code pic_height_in_luma_samples} field. */
        @NativeType("uint32_t")
        public int pic_height_in_luma_samples() { return StdVideoH265SequenceParameterSet.npic_height_in_luma_samples(address()); }
        /** @return the value of the {@code sps_video_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte sps_video_parameter_set_id() { return StdVideoH265SequenceParameterSet.nsps_video_parameter_set_id(address()); }
        /** @return the value of the {@code sps_max_sub_layers_minus1} field. */
        @NativeType("uint8_t")
        public byte sps_max_sub_layers_minus1() { return StdVideoH265SequenceParameterSet.nsps_max_sub_layers_minus1(address()); }
        /** @return the value of the {@code sps_seq_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte sps_seq_parameter_set_id() { return StdVideoH265SequenceParameterSet.nsps_seq_parameter_set_id(address()); }
        /** @return the value of the {@code bit_depth_luma_minus8} field. */
        @NativeType("uint8_t")
        public byte bit_depth_luma_minus8() { return StdVideoH265SequenceParameterSet.nbit_depth_luma_minus8(address()); }
        /** @return the value of the {@code bit_depth_chroma_minus8} field. */
        @NativeType("uint8_t")
        public byte bit_depth_chroma_minus8() { return StdVideoH265SequenceParameterSet.nbit_depth_chroma_minus8(address()); }
        /** @return the value of the {@code log2_max_pic_order_cnt_lsb_minus4} field. */
        @NativeType("uint8_t")
        public byte log2_max_pic_order_cnt_lsb_minus4() { return StdVideoH265SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(address()); }
        /** @return the value of the {@code sps_max_dec_pic_buffering_minus1} field. */
        @NativeType("uint8_t")
        public byte sps_max_dec_pic_buffering_minus1() { return StdVideoH265SequenceParameterSet.nsps_max_dec_pic_buffering_minus1(address()); }
        /** @return the value of the {@code log2_min_luma_coding_block_size_minus3} field. */
        @NativeType("uint8_t")
        public byte log2_min_luma_coding_block_size_minus3() { return StdVideoH265SequenceParameterSet.nlog2_min_luma_coding_block_size_minus3(address()); }
        /** @return the value of the {@code log2_diff_max_min_luma_coding_block_size} field. */
        @NativeType("uint8_t")
        public byte log2_diff_max_min_luma_coding_block_size() { return StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_coding_block_size(address()); }
        /** @return the value of the {@code log2_min_luma_transform_block_size_minus2} field. */
        @NativeType("uint8_t")
        public byte log2_min_luma_transform_block_size_minus2() { return StdVideoH265SequenceParameterSet.nlog2_min_luma_transform_block_size_minus2(address()); }
        /** @return the value of the {@code log2_diff_max_min_luma_transform_block_size} field. */
        @NativeType("uint8_t")
        public byte log2_diff_max_min_luma_transform_block_size() { return StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_transform_block_size(address()); }
        /** @return the value of the {@code max_transform_hierarchy_depth_inter} field. */
        @NativeType("uint8_t")
        public byte max_transform_hierarchy_depth_inter() { return StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_inter(address()); }
        /** @return the value of the {@code max_transform_hierarchy_depth_intra} field. */
        @NativeType("uint8_t")
        public byte max_transform_hierarchy_depth_intra() { return StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_intra(address()); }
        /** @return the value of the {@code num_short_term_ref_pic_sets} field. */
        @NativeType("uint8_t")
        public byte num_short_term_ref_pic_sets() { return StdVideoH265SequenceParameterSet.nnum_short_term_ref_pic_sets(address()); }
        /** @return the value of the {@code num_long_term_ref_pics_sps} field. */
        @NativeType("uint8_t")
        public byte num_long_term_ref_pics_sps() { return StdVideoH265SequenceParameterSet.nnum_long_term_ref_pics_sps(address()); }
        /** @return the value of the {@code pcm_sample_bit_depth_luma_minus1} field. */
        @NativeType("uint8_t")
        public byte pcm_sample_bit_depth_luma_minus1() { return StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_luma_minus1(address()); }
        /** @return the value of the {@code pcm_sample_bit_depth_chroma_minus1} field. */
        @NativeType("uint8_t")
        public byte pcm_sample_bit_depth_chroma_minus1() { return StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_chroma_minus1(address()); }
        /** @return the value of the {@code log2_min_pcm_luma_coding_block_size_minus3} field. */
        @NativeType("uint8_t")
        public byte log2_min_pcm_luma_coding_block_size_minus3() { return StdVideoH265SequenceParameterSet.nlog2_min_pcm_luma_coding_block_size_minus3(address()); }
        /** @return the value of the {@code log2_diff_max_min_pcm_luma_coding_block_size} field. */
        @NativeType("uint8_t")
        public byte log2_diff_max_min_pcm_luma_coding_block_size() { return StdVideoH265SequenceParameterSet.nlog2_diff_max_min_pcm_luma_coding_block_size(address()); }
        /** @return the value of the {@link StdVideoH265SequenceParameterSet#palette_max_size} field. */
        @NativeType("uint8_t")
        public byte palette_max_size() { return StdVideoH265SequenceParameterSet.npalette_max_size(address()); }
        /** @return the value of the {@code delta_palette_max_predictor_size} field. */
        @NativeType("uint8_t")
        public byte delta_palette_max_predictor_size() { return StdVideoH265SequenceParameterSet.ndelta_palette_max_predictor_size(address()); }
        /** @return the value of the {@code motion_vector_resolution_control_idc} field. */
        @NativeType("uint8_t")
        public byte motion_vector_resolution_control_idc() { return StdVideoH265SequenceParameterSet.nmotion_vector_resolution_control_idc(address()); }
        /** @return the value of the {@code sps_num_palette_predictor_initializer_minus1} field. */
        @NativeType("uint8_t")
        public byte sps_num_palette_predictor_initializer_minus1() { return StdVideoH265SequenceParameterSet.nsps_num_palette_predictor_initializer_minus1(address()); }
        /** @return the value of the {@code conf_win_left_offset} field. */
        @NativeType("uint32_t")
        public int conf_win_left_offset() { return StdVideoH265SequenceParameterSet.nconf_win_left_offset(address()); }
        /** @return the value of the {@code conf_win_right_offset} field. */
        @NativeType("uint32_t")
        public int conf_win_right_offset() { return StdVideoH265SequenceParameterSet.nconf_win_right_offset(address()); }
        /** @return the value of the {@code conf_win_top_offset} field. */
        @NativeType("uint32_t")
        public int conf_win_top_offset() { return StdVideoH265SequenceParameterSet.nconf_win_top_offset(address()); }
        /** @return the value of the {@code conf_win_bottom_offset} field. */
        @NativeType("uint32_t")
        public int conf_win_bottom_offset() { return StdVideoH265SequenceParameterSet.nconf_win_bottom_offset(address()); }
        /** @return a {@link StdVideoH265ProfileTierLevel} view of the struct pointed to by the {@code pProfileTierLevel} field. */
        @NativeType("StdVideoH265ProfileTierLevel const *")
        public StdVideoH265ProfileTierLevel pProfileTierLevel() { return StdVideoH265SequenceParameterSet.npProfileTierLevel(address()); }
        /** @return a {@link StdVideoH265DecPicBufMgr} view of the struct pointed to by the {@code pDecPicBufMgr} field. */
        @NativeType("StdVideoH265DecPicBufMgr const *")
        public StdVideoH265DecPicBufMgr pDecPicBufMgr() { return StdVideoH265SequenceParameterSet.npDecPicBufMgr(address()); }
        /** @return a {@link StdVideoH265ScalingLists} view of the struct pointed to by the {@link StdVideoH265SequenceParameterSet#pScalingLists} field. */
        @NativeType("StdVideoH265ScalingLists const *")
        public StdVideoH265ScalingLists pScalingLists() { return StdVideoH265SequenceParameterSet.npScalingLists(address()); }
        /** @return a {@link StdVideoH265ShortTermRefPicSet} view of the struct pointed to by the {@code pShortTermRefPicSet} field. */
        @NativeType("StdVideoH265ShortTermRefPicSet const *")
        public StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() { return StdVideoH265SequenceParameterSet.npShortTermRefPicSet(address()); }
        /** @return a {@link StdVideoH265LongTermRefPicsSps} view of the struct pointed to by the {@code pLongTermRefPicsSps} field. */
        @NativeType("StdVideoH265LongTermRefPicsSps const *")
        public StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps() { return StdVideoH265SequenceParameterSet.npLongTermRefPicsSps(address()); }
        /** @return a {@link StdVideoH265SequenceParameterSetVui} view of the struct pointed to by the {@link StdVideoH265SequenceParameterSet#pSequenceParameterSetVui} field. */
        @NativeType("StdVideoH265SequenceParameterSetVui const *")
        public StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui() { return StdVideoH265SequenceParameterSet.npSequenceParameterSetVui(address()); }
        /** @return a {@link StdVideoH265PredictorPaletteEntries} view of the struct pointed to by the {@link StdVideoH265SequenceParameterSet#pPredictorPaletteEntries} field. */
        @NativeType("StdVideoH265PredictorPaletteEntries const *")
        public StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() { return StdVideoH265SequenceParameterSet.npPredictorPaletteEntries(address()); }

        /** Copies the specified {@link StdVideoH265SpsFlags} to the {@code flags} field. */
        public StdVideoH265SequenceParameterSet.Buffer flags(StdVideoH265SpsFlags value) { StdVideoH265SequenceParameterSet.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH265SequenceParameterSet.Buffer flags(java.util.function.Consumer<StdVideoH265SpsFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code chroma_format_idc} field. */
        public StdVideoH265SequenceParameterSet.Buffer chroma_format_idc(@NativeType("StdVideoH265ChromaFormatIdc") int value) { StdVideoH265SequenceParameterSet.nchroma_format_idc(address(), value); return this; }
        /** Sets the specified value to the {@code pic_width_in_luma_samples} field. */
        public StdVideoH265SequenceParameterSet.Buffer pic_width_in_luma_samples(@NativeType("uint32_t") int value) { StdVideoH265SequenceParameterSet.npic_width_in_luma_samples(address(), value); return this; }
        /** Sets the specified value to the {@code pic_height_in_luma_samples} field. */
        public StdVideoH265SequenceParameterSet.Buffer pic_height_in_luma_samples(@NativeType("uint32_t") int value) { StdVideoH265SequenceParameterSet.npic_height_in_luma_samples(address(), value); return this; }
        /** Sets the specified value to the {@code sps_video_parameter_set_id} field. */
        public StdVideoH265SequenceParameterSet.Buffer sps_video_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nsps_video_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code sps_max_sub_layers_minus1} field. */
        public StdVideoH265SequenceParameterSet.Buffer sps_max_sub_layers_minus1(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nsps_max_sub_layers_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code sps_seq_parameter_set_id} field. */
        public StdVideoH265SequenceParameterSet.Buffer sps_seq_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nsps_seq_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code bit_depth_luma_minus8} field. */
        public StdVideoH265SequenceParameterSet.Buffer bit_depth_luma_minus8(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nbit_depth_luma_minus8(address(), value); return this; }
        /** Sets the specified value to the {@code bit_depth_chroma_minus8} field. */
        public StdVideoH265SequenceParameterSet.Buffer bit_depth_chroma_minus8(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nbit_depth_chroma_minus8(address(), value); return this; }
        /** Sets the specified value to the {@code log2_max_pic_order_cnt_lsb_minus4} field. */
        public StdVideoH265SequenceParameterSet.Buffer log2_max_pic_order_cnt_lsb_minus4(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(address(), value); return this; }
        /** Sets the specified value to the {@code sps_max_dec_pic_buffering_minus1} field. */
        public StdVideoH265SequenceParameterSet.Buffer sps_max_dec_pic_buffering_minus1(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nsps_max_dec_pic_buffering_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code log2_min_luma_coding_block_size_minus3} field. */
        public StdVideoH265SequenceParameterSet.Buffer log2_min_luma_coding_block_size_minus3(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nlog2_min_luma_coding_block_size_minus3(address(), value); return this; }
        /** Sets the specified value to the {@code log2_diff_max_min_luma_coding_block_size} field. */
        public StdVideoH265SequenceParameterSet.Buffer log2_diff_max_min_luma_coding_block_size(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_coding_block_size(address(), value); return this; }
        /** Sets the specified value to the {@code log2_min_luma_transform_block_size_minus2} field. */
        public StdVideoH265SequenceParameterSet.Buffer log2_min_luma_transform_block_size_minus2(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nlog2_min_luma_transform_block_size_minus2(address(), value); return this; }
        /** Sets the specified value to the {@code log2_diff_max_min_luma_transform_block_size} field. */
        public StdVideoH265SequenceParameterSet.Buffer log2_diff_max_min_luma_transform_block_size(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nlog2_diff_max_min_luma_transform_block_size(address(), value); return this; }
        /** Sets the specified value to the {@code max_transform_hierarchy_depth_inter} field. */
        public StdVideoH265SequenceParameterSet.Buffer max_transform_hierarchy_depth_inter(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_inter(address(), value); return this; }
        /** Sets the specified value to the {@code max_transform_hierarchy_depth_intra} field. */
        public StdVideoH265SequenceParameterSet.Buffer max_transform_hierarchy_depth_intra(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nmax_transform_hierarchy_depth_intra(address(), value); return this; }
        /** Sets the specified value to the {@code num_short_term_ref_pic_sets} field. */
        public StdVideoH265SequenceParameterSet.Buffer num_short_term_ref_pic_sets(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nnum_short_term_ref_pic_sets(address(), value); return this; }
        /** Sets the specified value to the {@code num_long_term_ref_pics_sps} field. */
        public StdVideoH265SequenceParameterSet.Buffer num_long_term_ref_pics_sps(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nnum_long_term_ref_pics_sps(address(), value); return this; }
        /** Sets the specified value to the {@code pcm_sample_bit_depth_luma_minus1} field. */
        public StdVideoH265SequenceParameterSet.Buffer pcm_sample_bit_depth_luma_minus1(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_luma_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code pcm_sample_bit_depth_chroma_minus1} field. */
        public StdVideoH265SequenceParameterSet.Buffer pcm_sample_bit_depth_chroma_minus1(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.npcm_sample_bit_depth_chroma_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code log2_min_pcm_luma_coding_block_size_minus3} field. */
        public StdVideoH265SequenceParameterSet.Buffer log2_min_pcm_luma_coding_block_size_minus3(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nlog2_min_pcm_luma_coding_block_size_minus3(address(), value); return this; }
        /** Sets the specified value to the {@code log2_diff_max_min_pcm_luma_coding_block_size} field. */
        public StdVideoH265SequenceParameterSet.Buffer log2_diff_max_min_pcm_luma_coding_block_size(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nlog2_diff_max_min_pcm_luma_coding_block_size(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoH265SequenceParameterSet#palette_max_size} field. */
        public StdVideoH265SequenceParameterSet.Buffer palette_max_size(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.npalette_max_size(address(), value); return this; }
        /** Sets the specified value to the {@code delta_palette_max_predictor_size} field. */
        public StdVideoH265SequenceParameterSet.Buffer delta_palette_max_predictor_size(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.ndelta_palette_max_predictor_size(address(), value); return this; }
        /** Sets the specified value to the {@code motion_vector_resolution_control_idc} field. */
        public StdVideoH265SequenceParameterSet.Buffer motion_vector_resolution_control_idc(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nmotion_vector_resolution_control_idc(address(), value); return this; }
        /** Sets the specified value to the {@code sps_num_palette_predictor_initializer_minus1} field. */
        public StdVideoH265SequenceParameterSet.Buffer sps_num_palette_predictor_initializer_minus1(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSet.nsps_num_palette_predictor_initializer_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code conf_win_left_offset} field. */
        public StdVideoH265SequenceParameterSet.Buffer conf_win_left_offset(@NativeType("uint32_t") int value) { StdVideoH265SequenceParameterSet.nconf_win_left_offset(address(), value); return this; }
        /** Sets the specified value to the {@code conf_win_right_offset} field. */
        public StdVideoH265SequenceParameterSet.Buffer conf_win_right_offset(@NativeType("uint32_t") int value) { StdVideoH265SequenceParameterSet.nconf_win_right_offset(address(), value); return this; }
        /** Sets the specified value to the {@code conf_win_top_offset} field. */
        public StdVideoH265SequenceParameterSet.Buffer conf_win_top_offset(@NativeType("uint32_t") int value) { StdVideoH265SequenceParameterSet.nconf_win_top_offset(address(), value); return this; }
        /** Sets the specified value to the {@code conf_win_bottom_offset} field. */
        public StdVideoH265SequenceParameterSet.Buffer conf_win_bottom_offset(@NativeType("uint32_t") int value) { StdVideoH265SequenceParameterSet.nconf_win_bottom_offset(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265ProfileTierLevel} to the {@code pProfileTierLevel} field. */
        public StdVideoH265SequenceParameterSet.Buffer pProfileTierLevel(@NativeType("StdVideoH265ProfileTierLevel const *") StdVideoH265ProfileTierLevel value) { StdVideoH265SequenceParameterSet.npProfileTierLevel(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265DecPicBufMgr} to the {@code pDecPicBufMgr} field. */
        public StdVideoH265SequenceParameterSet.Buffer pDecPicBufMgr(@NativeType("StdVideoH265DecPicBufMgr const *") StdVideoH265DecPicBufMgr value) { StdVideoH265SequenceParameterSet.npDecPicBufMgr(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265ScalingLists} to the {@link StdVideoH265SequenceParameterSet#pScalingLists} field. */
        public StdVideoH265SequenceParameterSet.Buffer pScalingLists(@NativeType("StdVideoH265ScalingLists const *") StdVideoH265ScalingLists value) { StdVideoH265SequenceParameterSet.npScalingLists(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265ShortTermRefPicSet} to the {@code pShortTermRefPicSet} field. */
        public StdVideoH265SequenceParameterSet.Buffer pShortTermRefPicSet(@NativeType("StdVideoH265ShortTermRefPicSet const *") StdVideoH265ShortTermRefPicSet value) { StdVideoH265SequenceParameterSet.npShortTermRefPicSet(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265LongTermRefPicsSps} to the {@code pLongTermRefPicsSps} field. */
        public StdVideoH265SequenceParameterSet.Buffer pLongTermRefPicsSps(@NativeType("StdVideoH265LongTermRefPicsSps const *") StdVideoH265LongTermRefPicsSps value) { StdVideoH265SequenceParameterSet.npLongTermRefPicsSps(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265SequenceParameterSetVui} to the {@link StdVideoH265SequenceParameterSet#pSequenceParameterSetVui} field. */
        public StdVideoH265SequenceParameterSet.Buffer pSequenceParameterSetVui(@NativeType("StdVideoH265SequenceParameterSetVui const *") StdVideoH265SequenceParameterSetVui value) { StdVideoH265SequenceParameterSet.npSequenceParameterSetVui(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265PredictorPaletteEntries} to the {@link StdVideoH265SequenceParameterSet#pPredictorPaletteEntries} field. */
        public StdVideoH265SequenceParameterSet.Buffer pPredictorPaletteEntries(@NativeType("StdVideoH265PredictorPaletteEntries const *") StdVideoH265PredictorPaletteEntries value) { StdVideoH265SequenceParameterSet.npPredictorPaletteEntries(address(), value); return this; }

    }

}