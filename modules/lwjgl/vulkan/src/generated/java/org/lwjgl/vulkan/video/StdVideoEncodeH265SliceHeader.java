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

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH265SliceHeader {
 *     StdVideoH265SliceType slice_type;
 *     uint8_t slice_pic_parameter_set_id;
 *     uint8_t num_short_term_ref_pic_sets;
 *     uint32_t slice_segment_address;
 *     uint8_t short_term_ref_pic_set_idx;
 *     uint8_t num_long_term_sps;
 *     uint8_t num_long_term_pics;
 *     uint8_t collocated_ref_idx;
 *     uint8_t {@link #num_ref_idx_l0_active_minus1};
 *     uint8_t {@link #num_ref_idx_l1_active_minus1};
 *     uint8_t {@link #luma_log2_weight_denom};
 *     int8_t delta_chroma_log2_weight_denom;
 *     int8_t delta_luma_weight_l0[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE];
 *     int8_t luma_offset_l0[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE];
 *     int8_t delta_chroma_weight_l0[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM];
 *     int8_t delta_chroma_offset_l0[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM];
 *     int8_t delta_luma_weight_l1[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE];
 *     int8_t luma_offset_l1[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE];
 *     int8_t delta_chroma_weight_l1[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM];
 *     int8_t delta_chroma_offset_l1[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM];
 *     uint8_t MaxNumMergeCand;
 *     int8_t slice_qp_delta;
 *     int8_t {@link #slice_cb_qp_offset};
 *     int8_t {@link #slice_cr_qp_offset};
 *     int8_t {@link #slice_beta_offset_div2};
 *     int8_t {@link #slice_tc_offset_div2};
 *     int8_t slice_act_y_qp_offset;
 *     int8_t slice_act_cb_qp_offset;
 *     int8_t slice_act_cr_qp_offset;
 *     {@link StdVideoEncodeH265SliceHeaderFlags StdVideoEncodeH265SliceHeaderFlags} flags;
 * }</code></pre>
 */
public class StdVideoEncodeH265SliceHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SLICE_TYPE,
        SLICE_PIC_PARAMETER_SET_ID,
        NUM_SHORT_TERM_REF_PIC_SETS,
        SLICE_SEGMENT_ADDRESS,
        SHORT_TERM_REF_PIC_SET_IDX,
        NUM_LONG_TERM_SPS,
        NUM_LONG_TERM_PICS,
        COLLOCATED_REF_IDX,
        NUM_REF_IDX_L0_ACTIVE_MINUS1,
        NUM_REF_IDX_L1_ACTIVE_MINUS1,
        LUMA_LOG2_WEIGHT_DENOM,
        DELTA_CHROMA_LOG2_WEIGHT_DENOM,
        DELTA_LUMA_WEIGHT_L0,
        LUMA_OFFSET_L0,
        DELTA_CHROMA_WEIGHT_L0,
        DELTA_CHROMA_OFFSET_L0,
        DELTA_LUMA_WEIGHT_L1,
        LUMA_OFFSET_L1,
        DELTA_CHROMA_WEIGHT_L1,
        DELTA_CHROMA_OFFSET_L1,
        MAXNUMMERGECAND,
        SLICE_QP_DELTA,
        SLICE_CB_QP_OFFSET,
        SLICE_CR_QP_OFFSET,
        SLICE_BETA_OFFSET_DIV2,
        SLICE_TC_OFFSET_DIV2,
        SLICE_ACT_Y_QP_OFFSET,
        SLICE_ACT_CB_QP_OFFSET,
        SLICE_ACT_CR_QP_OFFSET,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __member(1),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE),
            __array(1, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE),
            __array(1, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM),
            __array(1, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM),
            __array(1, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE),
            __array(1, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE),
            __array(1, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM),
            __array(1, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(StdVideoEncodeH265SliceHeaderFlags.SIZEOF, StdVideoEncodeH265SliceHeaderFlags.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SLICE_TYPE = layout.offsetof(0);
        SLICE_PIC_PARAMETER_SET_ID = layout.offsetof(1);
        NUM_SHORT_TERM_REF_PIC_SETS = layout.offsetof(2);
        SLICE_SEGMENT_ADDRESS = layout.offsetof(3);
        SHORT_TERM_REF_PIC_SET_IDX = layout.offsetof(4);
        NUM_LONG_TERM_SPS = layout.offsetof(5);
        NUM_LONG_TERM_PICS = layout.offsetof(6);
        COLLOCATED_REF_IDX = layout.offsetof(7);
        NUM_REF_IDX_L0_ACTIVE_MINUS1 = layout.offsetof(8);
        NUM_REF_IDX_L1_ACTIVE_MINUS1 = layout.offsetof(9);
        LUMA_LOG2_WEIGHT_DENOM = layout.offsetof(10);
        DELTA_CHROMA_LOG2_WEIGHT_DENOM = layout.offsetof(11);
        DELTA_LUMA_WEIGHT_L0 = layout.offsetof(12);
        LUMA_OFFSET_L0 = layout.offsetof(13);
        DELTA_CHROMA_WEIGHT_L0 = layout.offsetof(14);
        DELTA_CHROMA_OFFSET_L0 = layout.offsetof(15);
        DELTA_LUMA_WEIGHT_L1 = layout.offsetof(16);
        LUMA_OFFSET_L1 = layout.offsetof(17);
        DELTA_CHROMA_WEIGHT_L1 = layout.offsetof(18);
        DELTA_CHROMA_OFFSET_L1 = layout.offsetof(19);
        MAXNUMMERGECAND = layout.offsetof(20);
        SLICE_QP_DELTA = layout.offsetof(21);
        SLICE_CB_QP_OFFSET = layout.offsetof(22);
        SLICE_CR_QP_OFFSET = layout.offsetof(23);
        SLICE_BETA_OFFSET_DIV2 = layout.offsetof(24);
        SLICE_TC_OFFSET_DIV2 = layout.offsetof(25);
        SLICE_ACT_Y_QP_OFFSET = layout.offsetof(26);
        SLICE_ACT_CB_QP_OFFSET = layout.offsetof(27);
        SLICE_ACT_CR_QP_OFFSET = layout.offsetof(28);
        FLAGS = layout.offsetof(29);
    }

    /**
     * Creates a {@code StdVideoEncodeH265SliceHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265SliceHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code slice_type} field. */
    @NativeType("StdVideoH265SliceType")
    public int slice_type() { return nslice_type(address()); }
    /** @return the value of the {@code slice_pic_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte slice_pic_parameter_set_id() { return nslice_pic_parameter_set_id(address()); }
    /** @return the value of the {@code num_short_term_ref_pic_sets} field. */
    @NativeType("uint8_t")
    public byte num_short_term_ref_pic_sets() { return nnum_short_term_ref_pic_sets(address()); }
    /** @return the value of the {@code slice_segment_address} field. */
    @NativeType("uint32_t")
    public int slice_segment_address() { return nslice_segment_address(address()); }
    /** @return the value of the {@code short_term_ref_pic_set_idx} field. */
    @NativeType("uint8_t")
    public byte short_term_ref_pic_set_idx() { return nshort_term_ref_pic_set_idx(address()); }
    /** @return the value of the {@code num_long_term_sps} field. */
    @NativeType("uint8_t")
    public byte num_long_term_sps() { return nnum_long_term_sps(address()); }
    /** @return the value of the {@code num_long_term_pics} field. */
    @NativeType("uint8_t")
    public byte num_long_term_pics() { return nnum_long_term_pics(address()); }
    /** @return the value of the {@code collocated_ref_idx} field. */
    @NativeType("uint8_t")
    public byte collocated_ref_idx() { return ncollocated_ref_idx(address()); }
    /** [0, 14] */
    @NativeType("uint8_t")
    public byte num_ref_idx_l0_active_minus1() { return nnum_ref_idx_l0_active_minus1(address()); }
    /** [0, 14] */
    @NativeType("uint8_t")
    public byte num_ref_idx_l1_active_minus1() { return nnum_ref_idx_l1_active_minus1(address()); }
    /** [0, 7] */
    @NativeType("uint8_t")
    public byte luma_log2_weight_denom() { return nluma_log2_weight_denom(address()); }
    /** @return the value of the {@code delta_chroma_log2_weight_denom} field. */
    @NativeType("int8_t")
    public byte delta_chroma_log2_weight_denom() { return ndelta_chroma_log2_weight_denom(address()); }
    /** @return a {@link ByteBuffer} view of the {@code delta_luma_weight_l0} field. */
    @NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]")
    public ByteBuffer delta_luma_weight_l0() { return ndelta_luma_weight_l0(address()); }
    /** @return the value at the specified index of the {@code delta_luma_weight_l0} field. */
    @NativeType("int8_t")
    public byte delta_luma_weight_l0(int index) { return ndelta_luma_weight_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code luma_offset_l0} field. */
    @NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]")
    public ByteBuffer luma_offset_l0() { return nluma_offset_l0(address()); }
    /** @return the value at the specified index of the {@code luma_offset_l0} field. */
    @NativeType("int8_t")
    public byte luma_offset_l0(int index) { return nluma_offset_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_chroma_weight_l0} field. */
    @NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]")
    public ByteBuffer delta_chroma_weight_l0() { return ndelta_chroma_weight_l0(address()); }
    /** @return the value at the specified index of the {@code delta_chroma_weight_l0} field. */
    @NativeType("int8_t")
    public byte delta_chroma_weight_l0(int index) { return ndelta_chroma_weight_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_chroma_offset_l0} field. */
    @NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]")
    public ByteBuffer delta_chroma_offset_l0() { return ndelta_chroma_offset_l0(address()); }
    /** @return the value at the specified index of the {@code delta_chroma_offset_l0} field. */
    @NativeType("int8_t")
    public byte delta_chroma_offset_l0(int index) { return ndelta_chroma_offset_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_luma_weight_l1} field. */
    @NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]")
    public ByteBuffer delta_luma_weight_l1() { return ndelta_luma_weight_l1(address()); }
    /** @return the value at the specified index of the {@code delta_luma_weight_l1} field. */
    @NativeType("int8_t")
    public byte delta_luma_weight_l1(int index) { return ndelta_luma_weight_l1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code luma_offset_l1} field. */
    @NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]")
    public ByteBuffer luma_offset_l1() { return nluma_offset_l1(address()); }
    /** @return the value at the specified index of the {@code luma_offset_l1} field. */
    @NativeType("int8_t")
    public byte luma_offset_l1(int index) { return nluma_offset_l1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_chroma_weight_l1} field. */
    @NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]")
    public ByteBuffer delta_chroma_weight_l1() { return ndelta_chroma_weight_l1(address()); }
    /** @return the value at the specified index of the {@code delta_chroma_weight_l1} field. */
    @NativeType("int8_t")
    public byte delta_chroma_weight_l1(int index) { return ndelta_chroma_weight_l1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_chroma_offset_l1} field. */
    @NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]")
    public ByteBuffer delta_chroma_offset_l1() { return ndelta_chroma_offset_l1(address()); }
    /** @return the value at the specified index of the {@code delta_chroma_offset_l1} field. */
    @NativeType("int8_t")
    public byte delta_chroma_offset_l1(int index) { return ndelta_chroma_offset_l1(address(), index); }
    /** @return the value of the {@code MaxNumMergeCand} field. */
    @NativeType("uint8_t")
    public byte MaxNumMergeCand() { return nMaxNumMergeCand(address()); }
    /** @return the value of the {@code slice_qp_delta} field. */
    @NativeType("int8_t")
    public byte slice_qp_delta() { return nslice_qp_delta(address()); }
    /** [-12, 12] */
    @NativeType("int8_t")
    public byte slice_cb_qp_offset() { return nslice_cb_qp_offset(address()); }
    /** [-12, 12] */
    @NativeType("int8_t")
    public byte slice_cr_qp_offset() { return nslice_cr_qp_offset(address()); }
    /** [-6, 6] */
    @NativeType("int8_t")
    public byte slice_beta_offset_div2() { return nslice_beta_offset_div2(address()); }
    /** [-6, 6] */
    @NativeType("int8_t")
    public byte slice_tc_offset_div2() { return nslice_tc_offset_div2(address()); }
    /** @return the value of the {@code slice_act_y_qp_offset} field. */
    @NativeType("int8_t")
    public byte slice_act_y_qp_offset() { return nslice_act_y_qp_offset(address()); }
    /** @return the value of the {@code slice_act_cb_qp_offset} field. */
    @NativeType("int8_t")
    public byte slice_act_cb_qp_offset() { return nslice_act_cb_qp_offset(address()); }
    /** @return the value of the {@code slice_act_cr_qp_offset} field. */
    @NativeType("int8_t")
    public byte slice_act_cr_qp_offset() { return nslice_act_cr_qp_offset(address()); }
    /** @return a {@link StdVideoEncodeH265SliceHeaderFlags} view of the {@code flags} field. */
    public StdVideoEncodeH265SliceHeaderFlags flags() { return nflags(address()); }

    /** Sets the specified value to the {@code slice_type} field. */
    public StdVideoEncodeH265SliceHeader slice_type(@NativeType("StdVideoH265SliceType") int value) { nslice_type(address(), value); return this; }
    /** Sets the specified value to the {@code slice_pic_parameter_set_id} field. */
    public StdVideoEncodeH265SliceHeader slice_pic_parameter_set_id(@NativeType("uint8_t") byte value) { nslice_pic_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code num_short_term_ref_pic_sets} field. */
    public StdVideoEncodeH265SliceHeader num_short_term_ref_pic_sets(@NativeType("uint8_t") byte value) { nnum_short_term_ref_pic_sets(address(), value); return this; }
    /** Sets the specified value to the {@code slice_segment_address} field. */
    public StdVideoEncodeH265SliceHeader slice_segment_address(@NativeType("uint32_t") int value) { nslice_segment_address(address(), value); return this; }
    /** Sets the specified value to the {@code short_term_ref_pic_set_idx} field. */
    public StdVideoEncodeH265SliceHeader short_term_ref_pic_set_idx(@NativeType("uint8_t") byte value) { nshort_term_ref_pic_set_idx(address(), value); return this; }
    /** Sets the specified value to the {@code num_long_term_sps} field. */
    public StdVideoEncodeH265SliceHeader num_long_term_sps(@NativeType("uint8_t") byte value) { nnum_long_term_sps(address(), value); return this; }
    /** Sets the specified value to the {@code num_long_term_pics} field. */
    public StdVideoEncodeH265SliceHeader num_long_term_pics(@NativeType("uint8_t") byte value) { nnum_long_term_pics(address(), value); return this; }
    /** Sets the specified value to the {@code collocated_ref_idx} field. */
    public StdVideoEncodeH265SliceHeader collocated_ref_idx(@NativeType("uint8_t") byte value) { ncollocated_ref_idx(address(), value); return this; }
    /** Sets the specified value to the {@link #num_ref_idx_l0_active_minus1} field. */
    public StdVideoEncodeH265SliceHeader num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l0_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@link #num_ref_idx_l1_active_minus1} field. */
    public StdVideoEncodeH265SliceHeader num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l1_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@link #luma_log2_weight_denom} field. */
    public StdVideoEncodeH265SliceHeader luma_log2_weight_denom(@NativeType("uint8_t") byte value) { nluma_log2_weight_denom(address(), value); return this; }
    /** Sets the specified value to the {@code delta_chroma_log2_weight_denom} field. */
    public StdVideoEncodeH265SliceHeader delta_chroma_log2_weight_denom(@NativeType("int8_t") byte value) { ndelta_chroma_log2_weight_denom(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_luma_weight_l0} field. */
    public StdVideoEncodeH265SliceHeader delta_luma_weight_l0(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]") ByteBuffer value) { ndelta_luma_weight_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_luma_weight_l0} field. */
    public StdVideoEncodeH265SliceHeader delta_luma_weight_l0(int index, @NativeType("int8_t") byte value) { ndelta_luma_weight_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l0} field. */
    public StdVideoEncodeH265SliceHeader luma_offset_l0(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]") ByteBuffer value) { nluma_offset_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code luma_offset_l0} field. */
    public StdVideoEncodeH265SliceHeader luma_offset_l0(int index, @NativeType("int8_t") byte value) { nluma_offset_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_weight_l0} field. */
    public StdVideoEncodeH265SliceHeader delta_chroma_weight_l0(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]") ByteBuffer value) { ndelta_chroma_weight_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_chroma_weight_l0} field. */
    public StdVideoEncodeH265SliceHeader delta_chroma_weight_l0(int index, @NativeType("int8_t") byte value) { ndelta_chroma_weight_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_offset_l0} field. */
    public StdVideoEncodeH265SliceHeader delta_chroma_offset_l0(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]") ByteBuffer value) { ndelta_chroma_offset_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_chroma_offset_l0} field. */
    public StdVideoEncodeH265SliceHeader delta_chroma_offset_l0(int index, @NativeType("int8_t") byte value) { ndelta_chroma_offset_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_luma_weight_l1} field. */
    public StdVideoEncodeH265SliceHeader delta_luma_weight_l1(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]") ByteBuffer value) { ndelta_luma_weight_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_luma_weight_l1} field. */
    public StdVideoEncodeH265SliceHeader delta_luma_weight_l1(int index, @NativeType("int8_t") byte value) { ndelta_luma_weight_l1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l1} field. */
    public StdVideoEncodeH265SliceHeader luma_offset_l1(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]") ByteBuffer value) { nluma_offset_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code luma_offset_l1} field. */
    public StdVideoEncodeH265SliceHeader luma_offset_l1(int index, @NativeType("int8_t") byte value) { nluma_offset_l1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_weight_l1} field. */
    public StdVideoEncodeH265SliceHeader delta_chroma_weight_l1(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]") ByteBuffer value) { ndelta_chroma_weight_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_chroma_weight_l1} field. */
    public StdVideoEncodeH265SliceHeader delta_chroma_weight_l1(int index, @NativeType("int8_t") byte value) { ndelta_chroma_weight_l1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_offset_l1} field. */
    public StdVideoEncodeH265SliceHeader delta_chroma_offset_l1(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]") ByteBuffer value) { ndelta_chroma_offset_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_chroma_offset_l1} field. */
    public StdVideoEncodeH265SliceHeader delta_chroma_offset_l1(int index, @NativeType("int8_t") byte value) { ndelta_chroma_offset_l1(address(), index, value); return this; }
    /** Sets the specified value to the {@code MaxNumMergeCand} field. */
    public StdVideoEncodeH265SliceHeader MaxNumMergeCand(@NativeType("uint8_t") byte value) { nMaxNumMergeCand(address(), value); return this; }
    /** Sets the specified value to the {@code slice_qp_delta} field. */
    public StdVideoEncodeH265SliceHeader slice_qp_delta(@NativeType("int8_t") byte value) { nslice_qp_delta(address(), value); return this; }
    /** Sets the specified value to the {@link #slice_cb_qp_offset} field. */
    public StdVideoEncodeH265SliceHeader slice_cb_qp_offset(@NativeType("int8_t") byte value) { nslice_cb_qp_offset(address(), value); return this; }
    /** Sets the specified value to the {@link #slice_cr_qp_offset} field. */
    public StdVideoEncodeH265SliceHeader slice_cr_qp_offset(@NativeType("int8_t") byte value) { nslice_cr_qp_offset(address(), value); return this; }
    /** Sets the specified value to the {@link #slice_beta_offset_div2} field. */
    public StdVideoEncodeH265SliceHeader slice_beta_offset_div2(@NativeType("int8_t") byte value) { nslice_beta_offset_div2(address(), value); return this; }
    /** Sets the specified value to the {@link #slice_tc_offset_div2} field. */
    public StdVideoEncodeH265SliceHeader slice_tc_offset_div2(@NativeType("int8_t") byte value) { nslice_tc_offset_div2(address(), value); return this; }
    /** Sets the specified value to the {@code slice_act_y_qp_offset} field. */
    public StdVideoEncodeH265SliceHeader slice_act_y_qp_offset(@NativeType("int8_t") byte value) { nslice_act_y_qp_offset(address(), value); return this; }
    /** Sets the specified value to the {@code slice_act_cb_qp_offset} field. */
    public StdVideoEncodeH265SliceHeader slice_act_cb_qp_offset(@NativeType("int8_t") byte value) { nslice_act_cb_qp_offset(address(), value); return this; }
    /** Sets the specified value to the {@code slice_act_cr_qp_offset} field. */
    public StdVideoEncodeH265SliceHeader slice_act_cr_qp_offset(@NativeType("int8_t") byte value) { nslice_act_cr_qp_offset(address(), value); return this; }
    /** Copies the specified {@link StdVideoEncodeH265SliceHeaderFlags} to the {@code flags} field. */
    public StdVideoEncodeH265SliceHeader flags(StdVideoEncodeH265SliceHeaderFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH265SliceHeader flags(java.util.function.Consumer<StdVideoEncodeH265SliceHeaderFlags> consumer) { consumer.accept(flags()); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265SliceHeader set(
        int slice_type,
        byte slice_pic_parameter_set_id,
        byte num_short_term_ref_pic_sets,
        int slice_segment_address,
        byte short_term_ref_pic_set_idx,
        byte num_long_term_sps,
        byte num_long_term_pics,
        byte collocated_ref_idx,
        byte num_ref_idx_l0_active_minus1,
        byte num_ref_idx_l1_active_minus1,
        byte luma_log2_weight_denom,
        byte delta_chroma_log2_weight_denom,
        ByteBuffer delta_luma_weight_l0,
        ByteBuffer luma_offset_l0,
        ByteBuffer delta_chroma_weight_l0,
        ByteBuffer delta_chroma_offset_l0,
        ByteBuffer delta_luma_weight_l1,
        ByteBuffer luma_offset_l1,
        ByteBuffer delta_chroma_weight_l1,
        ByteBuffer delta_chroma_offset_l1,
        byte MaxNumMergeCand,
        byte slice_qp_delta,
        byte slice_cb_qp_offset,
        byte slice_cr_qp_offset,
        byte slice_beta_offset_div2,
        byte slice_tc_offset_div2,
        byte slice_act_y_qp_offset,
        byte slice_act_cb_qp_offset,
        byte slice_act_cr_qp_offset,
        StdVideoEncodeH265SliceHeaderFlags flags
    ) {
        slice_type(slice_type);
        slice_pic_parameter_set_id(slice_pic_parameter_set_id);
        num_short_term_ref_pic_sets(num_short_term_ref_pic_sets);
        slice_segment_address(slice_segment_address);
        short_term_ref_pic_set_idx(short_term_ref_pic_set_idx);
        num_long_term_sps(num_long_term_sps);
        num_long_term_pics(num_long_term_pics);
        collocated_ref_idx(collocated_ref_idx);
        num_ref_idx_l0_active_minus1(num_ref_idx_l0_active_minus1);
        num_ref_idx_l1_active_minus1(num_ref_idx_l1_active_minus1);
        luma_log2_weight_denom(luma_log2_weight_denom);
        delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom);
        delta_luma_weight_l0(delta_luma_weight_l0);
        luma_offset_l0(luma_offset_l0);
        delta_chroma_weight_l0(delta_chroma_weight_l0);
        delta_chroma_offset_l0(delta_chroma_offset_l0);
        delta_luma_weight_l1(delta_luma_weight_l1);
        luma_offset_l1(luma_offset_l1);
        delta_chroma_weight_l1(delta_chroma_weight_l1);
        delta_chroma_offset_l1(delta_chroma_offset_l1);
        MaxNumMergeCand(MaxNumMergeCand);
        slice_qp_delta(slice_qp_delta);
        slice_cb_qp_offset(slice_cb_qp_offset);
        slice_cr_qp_offset(slice_cr_qp_offset);
        slice_beta_offset_div2(slice_beta_offset_div2);
        slice_tc_offset_div2(slice_tc_offset_div2);
        slice_act_y_qp_offset(slice_act_y_qp_offset);
        slice_act_cb_qp_offset(slice_act_cb_qp_offset);
        slice_act_cr_qp_offset(slice_act_cr_qp_offset);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265SliceHeader set(StdVideoEncodeH265SliceHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265SliceHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265SliceHeader malloc() {
        return wrap(StdVideoEncodeH265SliceHeader.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265SliceHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265SliceHeader calloc() {
        return wrap(StdVideoEncodeH265SliceHeader.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265SliceHeader} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265SliceHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH265SliceHeader.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265SliceHeader} instance for the specified memory address. */
    public static StdVideoEncodeH265SliceHeader create(long address) {
        return wrap(StdVideoEncodeH265SliceHeader.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265SliceHeader createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH265SliceHeader.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeader.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeader.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH265SliceHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeader.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265SliceHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265SliceHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265SliceHeader malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265SliceHeader.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH265SliceHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265SliceHeader calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265SliceHeader.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #slice_type}. */
    public static int nslice_type(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265SliceHeader.SLICE_TYPE); }
    /** Unsafe version of {@link #slice_pic_parameter_set_id}. */
    public static byte nslice_pic_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_PIC_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #num_short_term_ref_pic_sets}. */
    public static byte nnum_short_term_ref_pic_sets(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.NUM_SHORT_TERM_REF_PIC_SETS); }
    /** Unsafe version of {@link #slice_segment_address}. */
    public static int nslice_segment_address(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265SliceHeader.SLICE_SEGMENT_ADDRESS); }
    /** Unsafe version of {@link #short_term_ref_pic_set_idx}. */
    public static byte nshort_term_ref_pic_set_idx(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.SHORT_TERM_REF_PIC_SET_IDX); }
    /** Unsafe version of {@link #num_long_term_sps}. */
    public static byte nnum_long_term_sps(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.NUM_LONG_TERM_SPS); }
    /** Unsafe version of {@link #num_long_term_pics}. */
    public static byte nnum_long_term_pics(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.NUM_LONG_TERM_PICS); }
    /** Unsafe version of {@link #collocated_ref_idx}. */
    public static byte ncollocated_ref_idx(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.COLLOCATED_REF_IDX); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1}. */
    public static byte nnum_ref_idx_l0_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.NUM_REF_IDX_L0_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1}. */
    public static byte nnum_ref_idx_l1_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.NUM_REF_IDX_L1_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #luma_log2_weight_denom}. */
    public static byte nluma_log2_weight_denom(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.LUMA_LOG2_WEIGHT_DENOM); }
    /** Unsafe version of {@link #delta_chroma_log2_weight_denom}. */
    public static byte ndelta_chroma_log2_weight_denom(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_LOG2_WEIGHT_DENOM); }
    /** Unsafe version of {@link #delta_luma_weight_l0}. */
    public static ByteBuffer ndelta_luma_weight_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceHeader.DELTA_LUMA_WEIGHT_L0, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE); }
    /** Unsafe version of {@link #delta_luma_weight_l0(int) delta_luma_weight_l0}. */
    public static byte ndelta_luma_weight_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_LUMA_WEIGHT_L0 + check(index, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #luma_offset_l0}. */
    public static ByteBuffer nluma_offset_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceHeader.LUMA_OFFSET_L0, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE); }
    /** Unsafe version of {@link #luma_offset_l0(int) luma_offset_l0}. */
    public static byte nluma_offset_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.LUMA_OFFSET_L0 + check(index, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l0}. */
    public static ByteBuffer ndelta_chroma_weight_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_WEIGHT_L0, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM); }
    /** Unsafe version of {@link #delta_chroma_weight_l0(int) delta_chroma_weight_l0}. */
    public static byte ndelta_chroma_weight_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_WEIGHT_L0 + check(index, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM) * 1);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l0}. */
    public static ByteBuffer ndelta_chroma_offset_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_OFFSET_L0, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM); }
    /** Unsafe version of {@link #delta_chroma_offset_l0(int) delta_chroma_offset_l0}. */
    public static byte ndelta_chroma_offset_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_OFFSET_L0 + check(index, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM) * 1);
    }
    /** Unsafe version of {@link #delta_luma_weight_l1}. */
    public static ByteBuffer ndelta_luma_weight_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceHeader.DELTA_LUMA_WEIGHT_L1, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE); }
    /** Unsafe version of {@link #delta_luma_weight_l1(int) delta_luma_weight_l1}. */
    public static byte ndelta_luma_weight_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_LUMA_WEIGHT_L1 + check(index, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #luma_offset_l1}. */
    public static ByteBuffer nluma_offset_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceHeader.LUMA_OFFSET_L1, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE); }
    /** Unsafe version of {@link #luma_offset_l1(int) luma_offset_l1}. */
    public static byte nluma_offset_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.LUMA_OFFSET_L1 + check(index, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l1}. */
    public static ByteBuffer ndelta_chroma_weight_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_WEIGHT_L1, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM); }
    /** Unsafe version of {@link #delta_chroma_weight_l1(int) delta_chroma_weight_l1}. */
    public static byte ndelta_chroma_weight_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_WEIGHT_L1 + check(index, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM) * 1);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l1}. */
    public static ByteBuffer ndelta_chroma_offset_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_OFFSET_L1, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM); }
    /** Unsafe version of {@link #delta_chroma_offset_l1(int) delta_chroma_offset_l1}. */
    public static byte ndelta_chroma_offset_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_OFFSET_L1 + check(index, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM) * 1);
    }
    /** Unsafe version of {@link #MaxNumMergeCand}. */
    public static byte nMaxNumMergeCand(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.MAXNUMMERGECAND); }
    /** Unsafe version of {@link #slice_qp_delta}. */
    public static byte nslice_qp_delta(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_QP_DELTA); }
    /** Unsafe version of {@link #slice_cb_qp_offset}. */
    public static byte nslice_cb_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_CB_QP_OFFSET); }
    /** Unsafe version of {@link #slice_cr_qp_offset}. */
    public static byte nslice_cr_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_CR_QP_OFFSET); }
    /** Unsafe version of {@link #slice_beta_offset_div2}. */
    public static byte nslice_beta_offset_div2(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_BETA_OFFSET_DIV2); }
    /** Unsafe version of {@link #slice_tc_offset_div2}. */
    public static byte nslice_tc_offset_div2(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_TC_OFFSET_DIV2); }
    /** Unsafe version of {@link #slice_act_y_qp_offset}. */
    public static byte nslice_act_y_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_ACT_Y_QP_OFFSET); }
    /** Unsafe version of {@link #slice_act_cb_qp_offset}. */
    public static byte nslice_act_cb_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_ACT_CB_QP_OFFSET); }
    /** Unsafe version of {@link #slice_act_cr_qp_offset}. */
    public static byte nslice_act_cr_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_ACT_CR_QP_OFFSET); }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH265SliceHeaderFlags nflags(long struct) { return StdVideoEncodeH265SliceHeaderFlags.create(struct + StdVideoEncodeH265SliceHeader.FLAGS); }

    /** Unsafe version of {@link #slice_type(int) slice_type}. */
    public static void nslice_type(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265SliceHeader.SLICE_TYPE, value); }
    /** Unsafe version of {@link #slice_pic_parameter_set_id(byte) slice_pic_parameter_set_id}. */
    public static void nslice_pic_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_PIC_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #num_short_term_ref_pic_sets(byte) num_short_term_ref_pic_sets}. */
    public static void nnum_short_term_ref_pic_sets(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.NUM_SHORT_TERM_REF_PIC_SETS, value); }
    /** Unsafe version of {@link #slice_segment_address(int) slice_segment_address}. */
    public static void nslice_segment_address(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265SliceHeader.SLICE_SEGMENT_ADDRESS, value); }
    /** Unsafe version of {@link #short_term_ref_pic_set_idx(byte) short_term_ref_pic_set_idx}. */
    public static void nshort_term_ref_pic_set_idx(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.SHORT_TERM_REF_PIC_SET_IDX, value); }
    /** Unsafe version of {@link #num_long_term_sps(byte) num_long_term_sps}. */
    public static void nnum_long_term_sps(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.NUM_LONG_TERM_SPS, value); }
    /** Unsafe version of {@link #num_long_term_pics(byte) num_long_term_pics}. */
    public static void nnum_long_term_pics(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.NUM_LONG_TERM_PICS, value); }
    /** Unsafe version of {@link #collocated_ref_idx(byte) collocated_ref_idx}. */
    public static void ncollocated_ref_idx(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.COLLOCATED_REF_IDX, value); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1(byte) num_ref_idx_l0_active_minus1}. */
    public static void nnum_ref_idx_l0_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.NUM_REF_IDX_L0_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1(byte) num_ref_idx_l1_active_minus1}. */
    public static void nnum_ref_idx_l1_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.NUM_REF_IDX_L1_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #luma_log2_weight_denom(byte) luma_log2_weight_denom}. */
    public static void nluma_log2_weight_denom(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.LUMA_LOG2_WEIGHT_DENOM, value); }
    /** Unsafe version of {@link #delta_chroma_log2_weight_denom(byte) delta_chroma_log2_weight_denom}. */
    public static void ndelta_chroma_log2_weight_denom(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_LOG2_WEIGHT_DENOM, value); }
    /** Unsafe version of {@link #delta_luma_weight_l0(ByteBuffer) delta_luma_weight_l0}. */
    public static void ndelta_luma_weight_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceHeader.DELTA_LUMA_WEIGHT_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_luma_weight_l0(int, byte) delta_luma_weight_l0}. */
    public static void ndelta_luma_weight_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_LUMA_WEIGHT_L0 + check(index, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #luma_offset_l0(ByteBuffer) luma_offset_l0}. */
    public static void nluma_offset_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceHeader.LUMA_OFFSET_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #luma_offset_l0(int, byte) luma_offset_l0}. */
    public static void nluma_offset_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.LUMA_OFFSET_L0 + check(index, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l0(ByteBuffer) delta_chroma_weight_l0}. */
    public static void ndelta_chroma_weight_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_WEIGHT_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l0(int, byte) delta_chroma_weight_l0}. */
    public static void ndelta_chroma_weight_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_WEIGHT_L0 + check(index, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM) * 1, value);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l0(ByteBuffer) delta_chroma_offset_l0}. */
    public static void ndelta_chroma_offset_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_OFFSET_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l0(int, byte) delta_chroma_offset_l0}. */
    public static void ndelta_chroma_offset_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_OFFSET_L0 + check(index, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM) * 1, value);
    }
    /** Unsafe version of {@link #delta_luma_weight_l1(ByteBuffer) delta_luma_weight_l1}. */
    public static void ndelta_luma_weight_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceHeader.DELTA_LUMA_WEIGHT_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_luma_weight_l1(int, byte) delta_luma_weight_l1}. */
    public static void ndelta_luma_weight_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_LUMA_WEIGHT_L1 + check(index, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #luma_offset_l1(ByteBuffer) luma_offset_l1}. */
    public static void nluma_offset_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceHeader.LUMA_OFFSET_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #luma_offset_l1(int, byte) luma_offset_l1}. */
    public static void nluma_offset_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.LUMA_OFFSET_L1 + check(index, STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l1(ByteBuffer) delta_chroma_weight_l1}. */
    public static void ndelta_chroma_weight_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_WEIGHT_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l1(int, byte) delta_chroma_weight_l1}. */
    public static void ndelta_chroma_weight_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_WEIGHT_L1 + check(index, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM) * 1, value);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l1(ByteBuffer) delta_chroma_offset_l1}. */
    public static void ndelta_chroma_offset_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_OFFSET_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l1(int, byte) delta_chroma_offset_l1}. */
    public static void ndelta_chroma_offset_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.DELTA_CHROMA_OFFSET_L1 + check(index, STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM) * 1, value);
    }
    /** Unsafe version of {@link #MaxNumMergeCand(byte) MaxNumMergeCand}. */
    public static void nMaxNumMergeCand(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.MAXNUMMERGECAND, value); }
    /** Unsafe version of {@link #slice_qp_delta(byte) slice_qp_delta}. */
    public static void nslice_qp_delta(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_QP_DELTA, value); }
    /** Unsafe version of {@link #slice_cb_qp_offset(byte) slice_cb_qp_offset}. */
    public static void nslice_cb_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_CB_QP_OFFSET, value); }
    /** Unsafe version of {@link #slice_cr_qp_offset(byte) slice_cr_qp_offset}. */
    public static void nslice_cr_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_CR_QP_OFFSET, value); }
    /** Unsafe version of {@link #slice_beta_offset_div2(byte) slice_beta_offset_div2}. */
    public static void nslice_beta_offset_div2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_BETA_OFFSET_DIV2, value); }
    /** Unsafe version of {@link #slice_tc_offset_div2(byte) slice_tc_offset_div2}. */
    public static void nslice_tc_offset_div2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_TC_OFFSET_DIV2, value); }
    /** Unsafe version of {@link #slice_act_y_qp_offset(byte) slice_act_y_qp_offset}. */
    public static void nslice_act_y_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_ACT_Y_QP_OFFSET, value); }
    /** Unsafe version of {@link #slice_act_cb_qp_offset(byte) slice_act_cb_qp_offset}. */
    public static void nslice_act_cb_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_ACT_CB_QP_OFFSET, value); }
    /** Unsafe version of {@link #slice_act_cr_qp_offset(byte) slice_act_cr_qp_offset}. */
    public static void nslice_act_cr_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceHeader.SLICE_ACT_CR_QP_OFFSET, value); }
    /** Unsafe version of {@link #flags(StdVideoEncodeH265SliceHeaderFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH265SliceHeaderFlags value) { memCopy(value.address(), struct + StdVideoEncodeH265SliceHeader.FLAGS, StdVideoEncodeH265SliceHeaderFlags.SIZEOF); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265SliceHeader} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265SliceHeader, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265SliceHeader ELEMENT_FACTORY = StdVideoEncodeH265SliceHeader.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265SliceHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265SliceHeader#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH265SliceHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code slice_type} field. */
        @NativeType("StdVideoH265SliceType")
        public int slice_type() { return StdVideoEncodeH265SliceHeader.nslice_type(address()); }
        /** @return the value of the {@code slice_pic_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte slice_pic_parameter_set_id() { return StdVideoEncodeH265SliceHeader.nslice_pic_parameter_set_id(address()); }
        /** @return the value of the {@code num_short_term_ref_pic_sets} field. */
        @NativeType("uint8_t")
        public byte num_short_term_ref_pic_sets() { return StdVideoEncodeH265SliceHeader.nnum_short_term_ref_pic_sets(address()); }
        /** @return the value of the {@code slice_segment_address} field. */
        @NativeType("uint32_t")
        public int slice_segment_address() { return StdVideoEncodeH265SliceHeader.nslice_segment_address(address()); }
        /** @return the value of the {@code short_term_ref_pic_set_idx} field. */
        @NativeType("uint8_t")
        public byte short_term_ref_pic_set_idx() { return StdVideoEncodeH265SliceHeader.nshort_term_ref_pic_set_idx(address()); }
        /** @return the value of the {@code num_long_term_sps} field. */
        @NativeType("uint8_t")
        public byte num_long_term_sps() { return StdVideoEncodeH265SliceHeader.nnum_long_term_sps(address()); }
        /** @return the value of the {@code num_long_term_pics} field. */
        @NativeType("uint8_t")
        public byte num_long_term_pics() { return StdVideoEncodeH265SliceHeader.nnum_long_term_pics(address()); }
        /** @return the value of the {@code collocated_ref_idx} field. */
        @NativeType("uint8_t")
        public byte collocated_ref_idx() { return StdVideoEncodeH265SliceHeader.ncollocated_ref_idx(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeader#num_ref_idx_l0_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l0_active_minus1() { return StdVideoEncodeH265SliceHeader.nnum_ref_idx_l0_active_minus1(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeader#num_ref_idx_l1_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l1_active_minus1() { return StdVideoEncodeH265SliceHeader.nnum_ref_idx_l1_active_minus1(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeader#luma_log2_weight_denom} field. */
        @NativeType("uint8_t")
        public byte luma_log2_weight_denom() { return StdVideoEncodeH265SliceHeader.nluma_log2_weight_denom(address()); }
        /** @return the value of the {@code delta_chroma_log2_weight_denom} field. */
        @NativeType("int8_t")
        public byte delta_chroma_log2_weight_denom() { return StdVideoEncodeH265SliceHeader.ndelta_chroma_log2_weight_denom(address()); }
        /** @return a {@link ByteBuffer} view of the {@code delta_luma_weight_l0} field. */
        @NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]")
        public ByteBuffer delta_luma_weight_l0() { return StdVideoEncodeH265SliceHeader.ndelta_luma_weight_l0(address()); }
        /** @return the value at the specified index of the {@code delta_luma_weight_l0} field. */
        @NativeType("int8_t")
        public byte delta_luma_weight_l0(int index) { return StdVideoEncodeH265SliceHeader.ndelta_luma_weight_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code luma_offset_l0} field. */
        @NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]")
        public ByteBuffer luma_offset_l0() { return StdVideoEncodeH265SliceHeader.nluma_offset_l0(address()); }
        /** @return the value at the specified index of the {@code luma_offset_l0} field. */
        @NativeType("int8_t")
        public byte luma_offset_l0(int index) { return StdVideoEncodeH265SliceHeader.nluma_offset_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_chroma_weight_l0} field. */
        @NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]")
        public ByteBuffer delta_chroma_weight_l0() { return StdVideoEncodeH265SliceHeader.ndelta_chroma_weight_l0(address()); }
        /** @return the value at the specified index of the {@code delta_chroma_weight_l0} field. */
        @NativeType("int8_t")
        public byte delta_chroma_weight_l0(int index) { return StdVideoEncodeH265SliceHeader.ndelta_chroma_weight_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_chroma_offset_l0} field. */
        @NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]")
        public ByteBuffer delta_chroma_offset_l0() { return StdVideoEncodeH265SliceHeader.ndelta_chroma_offset_l0(address()); }
        /** @return the value at the specified index of the {@code delta_chroma_offset_l0} field. */
        @NativeType("int8_t")
        public byte delta_chroma_offset_l0(int index) { return StdVideoEncodeH265SliceHeader.ndelta_chroma_offset_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_luma_weight_l1} field. */
        @NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]")
        public ByteBuffer delta_luma_weight_l1() { return StdVideoEncodeH265SliceHeader.ndelta_luma_weight_l1(address()); }
        /** @return the value at the specified index of the {@code delta_luma_weight_l1} field. */
        @NativeType("int8_t")
        public byte delta_luma_weight_l1(int index) { return StdVideoEncodeH265SliceHeader.ndelta_luma_weight_l1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code luma_offset_l1} field. */
        @NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]")
        public ByteBuffer luma_offset_l1() { return StdVideoEncodeH265SliceHeader.nluma_offset_l1(address()); }
        /** @return the value at the specified index of the {@code luma_offset_l1} field. */
        @NativeType("int8_t")
        public byte luma_offset_l1(int index) { return StdVideoEncodeH265SliceHeader.nluma_offset_l1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_chroma_weight_l1} field. */
        @NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]")
        public ByteBuffer delta_chroma_weight_l1() { return StdVideoEncodeH265SliceHeader.ndelta_chroma_weight_l1(address()); }
        /** @return the value at the specified index of the {@code delta_chroma_weight_l1} field. */
        @NativeType("int8_t")
        public byte delta_chroma_weight_l1(int index) { return StdVideoEncodeH265SliceHeader.ndelta_chroma_weight_l1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_chroma_offset_l1} field. */
        @NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]")
        public ByteBuffer delta_chroma_offset_l1() { return StdVideoEncodeH265SliceHeader.ndelta_chroma_offset_l1(address()); }
        /** @return the value at the specified index of the {@code delta_chroma_offset_l1} field. */
        @NativeType("int8_t")
        public byte delta_chroma_offset_l1(int index) { return StdVideoEncodeH265SliceHeader.ndelta_chroma_offset_l1(address(), index); }
        /** @return the value of the {@code MaxNumMergeCand} field. */
        @NativeType("uint8_t")
        public byte MaxNumMergeCand() { return StdVideoEncodeH265SliceHeader.nMaxNumMergeCand(address()); }
        /** @return the value of the {@code slice_qp_delta} field. */
        @NativeType("int8_t")
        public byte slice_qp_delta() { return StdVideoEncodeH265SliceHeader.nslice_qp_delta(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeader#slice_cb_qp_offset} field. */
        @NativeType("int8_t")
        public byte slice_cb_qp_offset() { return StdVideoEncodeH265SliceHeader.nslice_cb_qp_offset(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeader#slice_cr_qp_offset} field. */
        @NativeType("int8_t")
        public byte slice_cr_qp_offset() { return StdVideoEncodeH265SliceHeader.nslice_cr_qp_offset(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeader#slice_beta_offset_div2} field. */
        @NativeType("int8_t")
        public byte slice_beta_offset_div2() { return StdVideoEncodeH265SliceHeader.nslice_beta_offset_div2(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeader#slice_tc_offset_div2} field. */
        @NativeType("int8_t")
        public byte slice_tc_offset_div2() { return StdVideoEncodeH265SliceHeader.nslice_tc_offset_div2(address()); }
        /** @return the value of the {@code slice_act_y_qp_offset} field. */
        @NativeType("int8_t")
        public byte slice_act_y_qp_offset() { return StdVideoEncodeH265SliceHeader.nslice_act_y_qp_offset(address()); }
        /** @return the value of the {@code slice_act_cb_qp_offset} field. */
        @NativeType("int8_t")
        public byte slice_act_cb_qp_offset() { return StdVideoEncodeH265SliceHeader.nslice_act_cb_qp_offset(address()); }
        /** @return the value of the {@code slice_act_cr_qp_offset} field. */
        @NativeType("int8_t")
        public byte slice_act_cr_qp_offset() { return StdVideoEncodeH265SliceHeader.nslice_act_cr_qp_offset(address()); }
        /** @return a {@link StdVideoEncodeH265SliceHeaderFlags} view of the {@code flags} field. */
        public StdVideoEncodeH265SliceHeaderFlags flags() { return StdVideoEncodeH265SliceHeader.nflags(address()); }

        /** Sets the specified value to the {@code slice_type} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_type(@NativeType("StdVideoH265SliceType") int value) { StdVideoEncodeH265SliceHeader.nslice_type(address(), value); return this; }
        /** Sets the specified value to the {@code slice_pic_parameter_set_id} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_pic_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceHeader.nslice_pic_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code num_short_term_ref_pic_sets} field. */
        public StdVideoEncodeH265SliceHeader.Buffer num_short_term_ref_pic_sets(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceHeader.nnum_short_term_ref_pic_sets(address(), value); return this; }
        /** Sets the specified value to the {@code slice_segment_address} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_segment_address(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeader.nslice_segment_address(address(), value); return this; }
        /** Sets the specified value to the {@code short_term_ref_pic_set_idx} field. */
        public StdVideoEncodeH265SliceHeader.Buffer short_term_ref_pic_set_idx(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceHeader.nshort_term_ref_pic_set_idx(address(), value); return this; }
        /** Sets the specified value to the {@code num_long_term_sps} field. */
        public StdVideoEncodeH265SliceHeader.Buffer num_long_term_sps(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceHeader.nnum_long_term_sps(address(), value); return this; }
        /** Sets the specified value to the {@code num_long_term_pics} field. */
        public StdVideoEncodeH265SliceHeader.Buffer num_long_term_pics(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceHeader.nnum_long_term_pics(address(), value); return this; }
        /** Sets the specified value to the {@code collocated_ref_idx} field. */
        public StdVideoEncodeH265SliceHeader.Buffer collocated_ref_idx(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceHeader.ncollocated_ref_idx(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeader#num_ref_idx_l0_active_minus1} field. */
        public StdVideoEncodeH265SliceHeader.Buffer num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceHeader.nnum_ref_idx_l0_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeader#num_ref_idx_l1_active_minus1} field. */
        public StdVideoEncodeH265SliceHeader.Buffer num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceHeader.nnum_ref_idx_l1_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeader#luma_log2_weight_denom} field. */
        public StdVideoEncodeH265SliceHeader.Buffer luma_log2_weight_denom(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceHeader.nluma_log2_weight_denom(address(), value); return this; }
        /** Sets the specified value to the {@code delta_chroma_log2_weight_denom} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_chroma_log2_weight_denom(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.ndelta_chroma_log2_weight_denom(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_luma_weight_l0} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_luma_weight_l0(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]") ByteBuffer value) { StdVideoEncodeH265SliceHeader.ndelta_luma_weight_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_luma_weight_l0} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_luma_weight_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.ndelta_luma_weight_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l0} field. */
        public StdVideoEncodeH265SliceHeader.Buffer luma_offset_l0(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]") ByteBuffer value) { StdVideoEncodeH265SliceHeader.nluma_offset_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code luma_offset_l0} field. */
        public StdVideoEncodeH265SliceHeader.Buffer luma_offset_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.nluma_offset_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_weight_l0} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_chroma_weight_l0(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]") ByteBuffer value) { StdVideoEncodeH265SliceHeader.ndelta_chroma_weight_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_chroma_weight_l0} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_chroma_weight_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.ndelta_chroma_weight_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_offset_l0} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_chroma_offset_l0(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]") ByteBuffer value) { StdVideoEncodeH265SliceHeader.ndelta_chroma_offset_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_chroma_offset_l0} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_chroma_offset_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.ndelta_chroma_offset_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_luma_weight_l1} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_luma_weight_l1(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]") ByteBuffer value) { StdVideoEncodeH265SliceHeader.ndelta_luma_weight_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_luma_weight_l1} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_luma_weight_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.ndelta_luma_weight_l1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l1} field. */
        public StdVideoEncodeH265SliceHeader.Buffer luma_offset_l1(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE]") ByteBuffer value) { StdVideoEncodeH265SliceHeader.nluma_offset_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code luma_offset_l1} field. */
        public StdVideoEncodeH265SliceHeader.Buffer luma_offset_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.nluma_offset_l1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_weight_l1} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_chroma_weight_l1(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]") ByteBuffer value) { StdVideoEncodeH265SliceHeader.ndelta_chroma_weight_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_chroma_weight_l1} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_chroma_weight_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.ndelta_chroma_weight_l1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_offset_l1} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_chroma_offset_l1(@NativeType("int8_t[STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM]") ByteBuffer value) { StdVideoEncodeH265SliceHeader.ndelta_chroma_offset_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_chroma_offset_l1} field. */
        public StdVideoEncodeH265SliceHeader.Buffer delta_chroma_offset_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.ndelta_chroma_offset_l1(address(), index, value); return this; }
        /** Sets the specified value to the {@code MaxNumMergeCand} field. */
        public StdVideoEncodeH265SliceHeader.Buffer MaxNumMergeCand(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceHeader.nMaxNumMergeCand(address(), value); return this; }
        /** Sets the specified value to the {@code slice_qp_delta} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_qp_delta(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.nslice_qp_delta(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeader#slice_cb_qp_offset} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_cb_qp_offset(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.nslice_cb_qp_offset(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeader#slice_cr_qp_offset} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_cr_qp_offset(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.nslice_cr_qp_offset(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeader#slice_beta_offset_div2} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_beta_offset_div2(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.nslice_beta_offset_div2(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeader#slice_tc_offset_div2} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_tc_offset_div2(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.nslice_tc_offset_div2(address(), value); return this; }
        /** Sets the specified value to the {@code slice_act_y_qp_offset} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_act_y_qp_offset(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.nslice_act_y_qp_offset(address(), value); return this; }
        /** Sets the specified value to the {@code slice_act_cb_qp_offset} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_act_cb_qp_offset(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.nslice_act_cb_qp_offset(address(), value); return this; }
        /** Sets the specified value to the {@code slice_act_cr_qp_offset} field. */
        public StdVideoEncodeH265SliceHeader.Buffer slice_act_cr_qp_offset(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceHeader.nslice_act_cr_qp_offset(address(), value); return this; }
        /** Copies the specified {@link StdVideoEncodeH265SliceHeaderFlags} to the {@code flags} field. */
        public StdVideoEncodeH265SliceHeader.Buffer flags(StdVideoEncodeH265SliceHeaderFlags value) { StdVideoEncodeH265SliceHeader.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH265SliceHeader.Buffer flags(java.util.function.Consumer<StdVideoEncodeH265SliceHeaderFlags> consumer) { consumer.accept(flags()); return this; }

    }

}