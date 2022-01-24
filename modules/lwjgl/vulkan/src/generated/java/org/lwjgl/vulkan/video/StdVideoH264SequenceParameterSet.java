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
 * struct StdVideoH264SequenceParameterSet {
 *     StdVideoH264ProfileIdc profile_idc;
 *     StdVideoH264Level level_idc;
 *     uint8_t seq_parameter_set_id;
 *     StdVideoH264ChromaFormatIdc chroma_format_idc;
 *     uint8_t bit_depth_luma_minus8;
 *     uint8_t bit_depth_chroma_minus8;
 *     uint8_t log2_max_frame_num_minus4;
 *     StdVideoH264PocType pic_order_cnt_type;
 *     uint8_t log2_max_pic_order_cnt_lsb_minus4;
 *     int32_t offset_for_non_ref_pic;
 *     int32_t offset_for_top_to_bottom_field;
 *     uint8_t num_ref_frames_in_pic_order_cnt_cycle;
 *     uint8_t max_num_ref_frames;
 *     uint32_t pic_width_in_mbs_minus1;
 *     uint32_t pic_height_in_map_units_minus1;
 *     uint32_t frame_crop_left_offset;
 *     uint32_t frame_crop_right_offset;
 *     uint32_t frame_crop_top_offset;
 *     uint32_t frame_crop_bottom_offset;
 *     {@link StdVideoH264SpsFlags StdVideoH264SpsFlags} flags;
 *     int32_t * {@link #pOffsetForRefFrame};
 *     {@link StdVideoH264ScalingLists StdVideoH264ScalingLists} * {@link #pScalingLists};
 *     {@link StdVideoH264SequenceParameterSetVui StdVideoH264SequenceParameterSetVui} * {@link #pSequenceParameterSetVui};
 * }</code></pre>
 */
public class StdVideoH264SequenceParameterSet extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROFILE_IDC,
        LEVEL_IDC,
        SEQ_PARAMETER_SET_ID,
        CHROMA_FORMAT_IDC,
        BIT_DEPTH_LUMA_MINUS8,
        BIT_DEPTH_CHROMA_MINUS8,
        LOG2_MAX_FRAME_NUM_MINUS4,
        PIC_ORDER_CNT_TYPE,
        LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4,
        OFFSET_FOR_NON_REF_PIC,
        OFFSET_FOR_TOP_TO_BOTTOM_FIELD,
        NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE,
        MAX_NUM_REF_FRAMES,
        PIC_WIDTH_IN_MBS_MINUS1,
        PIC_HEIGHT_IN_MAP_UNITS_MINUS1,
        FRAME_CROP_LEFT_OFFSET,
        FRAME_CROP_RIGHT_OFFSET,
        FRAME_CROP_TOP_OFFSET,
        FRAME_CROP_BOTTOM_OFFSET,
        FLAGS,
        POFFSETFORREFFRAME,
        PSCALINGLISTS,
        PSEQUENCEPARAMETERSETVUI;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(1),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(1),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(StdVideoH264SpsFlags.SIZEOF, StdVideoH264SpsFlags.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROFILE_IDC = layout.offsetof(0);
        LEVEL_IDC = layout.offsetof(1);
        SEQ_PARAMETER_SET_ID = layout.offsetof(2);
        CHROMA_FORMAT_IDC = layout.offsetof(3);
        BIT_DEPTH_LUMA_MINUS8 = layout.offsetof(4);
        BIT_DEPTH_CHROMA_MINUS8 = layout.offsetof(5);
        LOG2_MAX_FRAME_NUM_MINUS4 = layout.offsetof(6);
        PIC_ORDER_CNT_TYPE = layout.offsetof(7);
        LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4 = layout.offsetof(8);
        OFFSET_FOR_NON_REF_PIC = layout.offsetof(9);
        OFFSET_FOR_TOP_TO_BOTTOM_FIELD = layout.offsetof(10);
        NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE = layout.offsetof(11);
        MAX_NUM_REF_FRAMES = layout.offsetof(12);
        PIC_WIDTH_IN_MBS_MINUS1 = layout.offsetof(13);
        PIC_HEIGHT_IN_MAP_UNITS_MINUS1 = layout.offsetof(14);
        FRAME_CROP_LEFT_OFFSET = layout.offsetof(15);
        FRAME_CROP_RIGHT_OFFSET = layout.offsetof(16);
        FRAME_CROP_TOP_OFFSET = layout.offsetof(17);
        FRAME_CROP_BOTTOM_OFFSET = layout.offsetof(18);
        FLAGS = layout.offsetof(19);
        POFFSETFORREFFRAME = layout.offsetof(20);
        PSCALINGLISTS = layout.offsetof(21);
        PSEQUENCEPARAMETERSETVUI = layout.offsetof(22);
    }

    /**
     * Creates a {@code StdVideoH264SequenceParameterSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH264SequenceParameterSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code profile_idc} field. */
    @NativeType("StdVideoH264ProfileIdc")
    public int profile_idc() { return nprofile_idc(address()); }
    /** @return the value of the {@code level_idc} field. */
    @NativeType("StdVideoH264Level")
    public int level_idc() { return nlevel_idc(address()); }
    /** @return the value of the {@code seq_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte seq_parameter_set_id() { return nseq_parameter_set_id(address()); }
    /** @return the value of the {@code chroma_format_idc} field. */
    @NativeType("StdVideoH264ChromaFormatIdc")
    public int chroma_format_idc() { return nchroma_format_idc(address()); }
    /** @return the value of the {@code bit_depth_luma_minus8} field. */
    @NativeType("uint8_t")
    public byte bit_depth_luma_minus8() { return nbit_depth_luma_minus8(address()); }
    /** @return the value of the {@code bit_depth_chroma_minus8} field. */
    @NativeType("uint8_t")
    public byte bit_depth_chroma_minus8() { return nbit_depth_chroma_minus8(address()); }
    /** @return the value of the {@code log2_max_frame_num_minus4} field. */
    @NativeType("uint8_t")
    public byte log2_max_frame_num_minus4() { return nlog2_max_frame_num_minus4(address()); }
    /** @return the value of the {@code pic_order_cnt_type} field. */
    @NativeType("StdVideoH264PocType")
    public int pic_order_cnt_type() { return npic_order_cnt_type(address()); }
    /** @return the value of the {@code log2_max_pic_order_cnt_lsb_minus4} field. */
    @NativeType("uint8_t")
    public byte log2_max_pic_order_cnt_lsb_minus4() { return nlog2_max_pic_order_cnt_lsb_minus4(address()); }
    /** @return the value of the {@code offset_for_non_ref_pic} field. */
    @NativeType("int32_t")
    public int offset_for_non_ref_pic() { return noffset_for_non_ref_pic(address()); }
    /** @return the value of the {@code offset_for_top_to_bottom_field} field. */
    @NativeType("int32_t")
    public int offset_for_top_to_bottom_field() { return noffset_for_top_to_bottom_field(address()); }
    /** @return the value of the {@code num_ref_frames_in_pic_order_cnt_cycle} field. */
    @NativeType("uint8_t")
    public byte num_ref_frames_in_pic_order_cnt_cycle() { return nnum_ref_frames_in_pic_order_cnt_cycle(address()); }
    /** @return the value of the {@code max_num_ref_frames} field. */
    @NativeType("uint8_t")
    public byte max_num_ref_frames() { return nmax_num_ref_frames(address()); }
    /** @return the value of the {@code pic_width_in_mbs_minus1} field. */
    @NativeType("uint32_t")
    public int pic_width_in_mbs_minus1() { return npic_width_in_mbs_minus1(address()); }
    /** @return the value of the {@code pic_height_in_map_units_minus1} field. */
    @NativeType("uint32_t")
    public int pic_height_in_map_units_minus1() { return npic_height_in_map_units_minus1(address()); }
    /** @return the value of the {@code frame_crop_left_offset} field. */
    @NativeType("uint32_t")
    public int frame_crop_left_offset() { return nframe_crop_left_offset(address()); }
    /** @return the value of the {@code frame_crop_right_offset} field. */
    @NativeType("uint32_t")
    public int frame_crop_right_offset() { return nframe_crop_right_offset(address()); }
    /** @return the value of the {@code frame_crop_top_offset} field. */
    @NativeType("uint32_t")
    public int frame_crop_top_offset() { return nframe_crop_top_offset(address()); }
    /** @return the value of the {@code frame_crop_bottom_offset} field. */
    @NativeType("uint32_t")
    public int frame_crop_bottom_offset() { return nframe_crop_bottom_offset(address()); }
    /** @return a {@link StdVideoH264SpsFlags} view of the {@code flags} field. */
    public StdVideoH264SpsFlags flags() { return nflags(address()); }
    /**
     * a pointer representing the {@code offset_for_ref_frame} array with {@code num_ref_frames_in_pic_order_cnt_cycle} number of elements.
     * 
     * <p>If {@code pOffsetForRefFrame} has {@code nullptr} value, then {@code num_ref_frames_in_pic_order_cnt_cycle} must also be "0".</p>
     */
    @Nullable
    @NativeType("int32_t *")
    public IntBuffer pOffsetForRefFrame() { return npOffsetForRefFrame(address()); }
    /** must be a valid pointer if scaling_matrix_present_flag is set */
    @NativeType("StdVideoH264ScalingLists *")
    public StdVideoH264ScalingLists pScalingLists() { return npScalingLists(address()); }
    /** must be a valid pointer if StdVideoH264SpsFlags:vui_parameters_present_flag is set */
    @NativeType("StdVideoH264SequenceParameterSetVui *")
    public StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui() { return npSequenceParameterSetVui(address()); }

    /** Sets the specified value to the {@code profile_idc} field. */
    public StdVideoH264SequenceParameterSet profile_idc(@NativeType("StdVideoH264ProfileIdc") int value) { nprofile_idc(address(), value); return this; }
    /** Sets the specified value to the {@code level_idc} field. */
    public StdVideoH264SequenceParameterSet level_idc(@NativeType("StdVideoH264Level") int value) { nlevel_idc(address(), value); return this; }
    /** Sets the specified value to the {@code seq_parameter_set_id} field. */
    public StdVideoH264SequenceParameterSet seq_parameter_set_id(@NativeType("uint8_t") byte value) { nseq_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_format_idc} field. */
    public StdVideoH264SequenceParameterSet chroma_format_idc(@NativeType("StdVideoH264ChromaFormatIdc") int value) { nchroma_format_idc(address(), value); return this; }
    /** Sets the specified value to the {@code bit_depth_luma_minus8} field. */
    public StdVideoH264SequenceParameterSet bit_depth_luma_minus8(@NativeType("uint8_t") byte value) { nbit_depth_luma_minus8(address(), value); return this; }
    /** Sets the specified value to the {@code bit_depth_chroma_minus8} field. */
    public StdVideoH264SequenceParameterSet bit_depth_chroma_minus8(@NativeType("uint8_t") byte value) { nbit_depth_chroma_minus8(address(), value); return this; }
    /** Sets the specified value to the {@code log2_max_frame_num_minus4} field. */
    public StdVideoH264SequenceParameterSet log2_max_frame_num_minus4(@NativeType("uint8_t") byte value) { nlog2_max_frame_num_minus4(address(), value); return this; }
    /** Sets the specified value to the {@code pic_order_cnt_type} field. */
    public StdVideoH264SequenceParameterSet pic_order_cnt_type(@NativeType("StdVideoH264PocType") int value) { npic_order_cnt_type(address(), value); return this; }
    /** Sets the specified value to the {@code log2_max_pic_order_cnt_lsb_minus4} field. */
    public StdVideoH264SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(@NativeType("uint8_t") byte value) { nlog2_max_pic_order_cnt_lsb_minus4(address(), value); return this; }
    /** Sets the specified value to the {@code offset_for_non_ref_pic} field. */
    public StdVideoH264SequenceParameterSet offset_for_non_ref_pic(@NativeType("int32_t") int value) { noffset_for_non_ref_pic(address(), value); return this; }
    /** Sets the specified value to the {@code offset_for_top_to_bottom_field} field. */
    public StdVideoH264SequenceParameterSet offset_for_top_to_bottom_field(@NativeType("int32_t") int value) { noffset_for_top_to_bottom_field(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_frames_in_pic_order_cnt_cycle} field. */
    public StdVideoH264SequenceParameterSet num_ref_frames_in_pic_order_cnt_cycle(@NativeType("uint8_t") byte value) { nnum_ref_frames_in_pic_order_cnt_cycle(address(), value); return this; }
    /** Sets the specified value to the {@code max_num_ref_frames} field. */
    public StdVideoH264SequenceParameterSet max_num_ref_frames(@NativeType("uint8_t") byte value) { nmax_num_ref_frames(address(), value); return this; }
    /** Sets the specified value to the {@code pic_width_in_mbs_minus1} field. */
    public StdVideoH264SequenceParameterSet pic_width_in_mbs_minus1(@NativeType("uint32_t") int value) { npic_width_in_mbs_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code pic_height_in_map_units_minus1} field. */
    public StdVideoH264SequenceParameterSet pic_height_in_map_units_minus1(@NativeType("uint32_t") int value) { npic_height_in_map_units_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code frame_crop_left_offset} field. */
    public StdVideoH264SequenceParameterSet frame_crop_left_offset(@NativeType("uint32_t") int value) { nframe_crop_left_offset(address(), value); return this; }
    /** Sets the specified value to the {@code frame_crop_right_offset} field. */
    public StdVideoH264SequenceParameterSet frame_crop_right_offset(@NativeType("uint32_t") int value) { nframe_crop_right_offset(address(), value); return this; }
    /** Sets the specified value to the {@code frame_crop_top_offset} field. */
    public StdVideoH264SequenceParameterSet frame_crop_top_offset(@NativeType("uint32_t") int value) { nframe_crop_top_offset(address(), value); return this; }
    /** Sets the specified value to the {@code frame_crop_bottom_offset} field. */
    public StdVideoH264SequenceParameterSet frame_crop_bottom_offset(@NativeType("uint32_t") int value) { nframe_crop_bottom_offset(address(), value); return this; }
    /** Copies the specified {@link StdVideoH264SpsFlags} to the {@code flags} field. */
    public StdVideoH264SequenceParameterSet flags(StdVideoH264SpsFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH264SequenceParameterSet flags(java.util.function.Consumer<StdVideoH264SpsFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pOffsetForRefFrame} field. */
    public StdVideoH264SequenceParameterSet pOffsetForRefFrame(@Nullable @NativeType("int32_t *") IntBuffer value) { npOffsetForRefFrame(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264ScalingLists} to the {@link #pScalingLists} field. */
    public StdVideoH264SequenceParameterSet pScalingLists(@NativeType("StdVideoH264ScalingLists *") StdVideoH264ScalingLists value) { npScalingLists(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264SequenceParameterSetVui} to the {@link #pSequenceParameterSetVui} field. */
    public StdVideoH264SequenceParameterSet pSequenceParameterSetVui(@NativeType("StdVideoH264SequenceParameterSetVui *") StdVideoH264SequenceParameterSetVui value) { npSequenceParameterSetVui(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH264SequenceParameterSet set(
        int profile_idc,
        int level_idc,
        byte seq_parameter_set_id,
        int chroma_format_idc,
        byte bit_depth_luma_minus8,
        byte bit_depth_chroma_minus8,
        byte log2_max_frame_num_minus4,
        int pic_order_cnt_type,
        byte log2_max_pic_order_cnt_lsb_minus4,
        int offset_for_non_ref_pic,
        int offset_for_top_to_bottom_field,
        byte num_ref_frames_in_pic_order_cnt_cycle,
        byte max_num_ref_frames,
        int pic_width_in_mbs_minus1,
        int pic_height_in_map_units_minus1,
        int frame_crop_left_offset,
        int frame_crop_right_offset,
        int frame_crop_top_offset,
        int frame_crop_bottom_offset,
        StdVideoH264SpsFlags flags,
        @Nullable IntBuffer pOffsetForRefFrame,
        StdVideoH264ScalingLists pScalingLists,
        StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui
    ) {
        profile_idc(profile_idc);
        level_idc(level_idc);
        seq_parameter_set_id(seq_parameter_set_id);
        chroma_format_idc(chroma_format_idc);
        bit_depth_luma_minus8(bit_depth_luma_minus8);
        bit_depth_chroma_minus8(bit_depth_chroma_minus8);
        log2_max_frame_num_minus4(log2_max_frame_num_minus4);
        pic_order_cnt_type(pic_order_cnt_type);
        log2_max_pic_order_cnt_lsb_minus4(log2_max_pic_order_cnt_lsb_minus4);
        offset_for_non_ref_pic(offset_for_non_ref_pic);
        offset_for_top_to_bottom_field(offset_for_top_to_bottom_field);
        num_ref_frames_in_pic_order_cnt_cycle(num_ref_frames_in_pic_order_cnt_cycle);
        max_num_ref_frames(max_num_ref_frames);
        pic_width_in_mbs_minus1(pic_width_in_mbs_minus1);
        pic_height_in_map_units_minus1(pic_height_in_map_units_minus1);
        frame_crop_left_offset(frame_crop_left_offset);
        frame_crop_right_offset(frame_crop_right_offset);
        frame_crop_top_offset(frame_crop_top_offset);
        frame_crop_bottom_offset(frame_crop_bottom_offset);
        flags(flags);
        pOffsetForRefFrame(pOffsetForRefFrame);
        pScalingLists(pScalingLists);
        pSequenceParameterSetVui(pSequenceParameterSetVui);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH264SequenceParameterSet set(StdVideoH264SequenceParameterSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH264SequenceParameterSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH264SequenceParameterSet malloc() {
        return wrap(StdVideoH264SequenceParameterSet.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH264SequenceParameterSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH264SequenceParameterSet calloc() {
        return wrap(StdVideoH264SequenceParameterSet.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH264SequenceParameterSet} instance allocated with {@link BufferUtils}. */
    public static StdVideoH264SequenceParameterSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH264SequenceParameterSet.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH264SequenceParameterSet} instance for the specified memory address. */
    public static StdVideoH264SequenceParameterSet create(long address) {
        return wrap(StdVideoH264SequenceParameterSet.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264SequenceParameterSet createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH264SequenceParameterSet.class, address);
    }

    /**
     * Returns a new {@link StdVideoH264SequenceParameterSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSet.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SequenceParameterSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSet.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SequenceParameterSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH264SequenceParameterSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSet.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264SequenceParameterSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH264SequenceParameterSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264SequenceParameterSet malloc(MemoryStack stack) {
        return wrap(StdVideoH264SequenceParameterSet.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH264SequenceParameterSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264SequenceParameterSet calloc(MemoryStack stack) {
        return wrap(StdVideoH264SequenceParameterSet.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH264SequenceParameterSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSet.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SequenceParameterSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSet.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #profile_idc}. */
    public static int nprofile_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.PROFILE_IDC); }
    /** Unsafe version of {@link #level_idc}. */
    public static int nlevel_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.LEVEL_IDC); }
    /** Unsafe version of {@link #seq_parameter_set_id}. */
    public static byte nseq_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSet.SEQ_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #chroma_format_idc}. */
    public static int nchroma_format_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.CHROMA_FORMAT_IDC); }
    /** Unsafe version of {@link #bit_depth_luma_minus8}. */
    public static byte nbit_depth_luma_minus8(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSet.BIT_DEPTH_LUMA_MINUS8); }
    /** Unsafe version of {@link #bit_depth_chroma_minus8}. */
    public static byte nbit_depth_chroma_minus8(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSet.BIT_DEPTH_CHROMA_MINUS8); }
    /** Unsafe version of {@link #log2_max_frame_num_minus4}. */
    public static byte nlog2_max_frame_num_minus4(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSet.LOG2_MAX_FRAME_NUM_MINUS4); }
    /** Unsafe version of {@link #pic_order_cnt_type}. */
    public static int npic_order_cnt_type(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.PIC_ORDER_CNT_TYPE); }
    /** Unsafe version of {@link #log2_max_pic_order_cnt_lsb_minus4}. */
    public static byte nlog2_max_pic_order_cnt_lsb_minus4(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSet.LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4); }
    /** Unsafe version of {@link #offset_for_non_ref_pic}. */
    public static int noffset_for_non_ref_pic(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.OFFSET_FOR_NON_REF_PIC); }
    /** Unsafe version of {@link #offset_for_top_to_bottom_field}. */
    public static int noffset_for_top_to_bottom_field(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.OFFSET_FOR_TOP_TO_BOTTOM_FIELD); }
    /** Unsafe version of {@link #num_ref_frames_in_pic_order_cnt_cycle}. */
    public static byte nnum_ref_frames_in_pic_order_cnt_cycle(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSet.NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE); }
    /** Unsafe version of {@link #max_num_ref_frames}. */
    public static byte nmax_num_ref_frames(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSet.MAX_NUM_REF_FRAMES); }
    /** Unsafe version of {@link #pic_width_in_mbs_minus1}. */
    public static int npic_width_in_mbs_minus1(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.PIC_WIDTH_IN_MBS_MINUS1); }
    /** Unsafe version of {@link #pic_height_in_map_units_minus1}. */
    public static int npic_height_in_map_units_minus1(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.PIC_HEIGHT_IN_MAP_UNITS_MINUS1); }
    /** Unsafe version of {@link #frame_crop_left_offset}. */
    public static int nframe_crop_left_offset(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.FRAME_CROP_LEFT_OFFSET); }
    /** Unsafe version of {@link #frame_crop_right_offset}. */
    public static int nframe_crop_right_offset(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.FRAME_CROP_RIGHT_OFFSET); }
    /** Unsafe version of {@link #frame_crop_top_offset}. */
    public static int nframe_crop_top_offset(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.FRAME_CROP_TOP_OFFSET); }
    /** Unsafe version of {@link #frame_crop_bottom_offset}. */
    public static int nframe_crop_bottom_offset(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSet.FRAME_CROP_BOTTOM_OFFSET); }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoH264SpsFlags nflags(long struct) { return StdVideoH264SpsFlags.create(struct + StdVideoH264SequenceParameterSet.FLAGS); }
    /** Unsafe version of {@link #pOffsetForRefFrame() pOffsetForRefFrame}. */
    @Nullable public static IntBuffer npOffsetForRefFrame(long struct) { return memIntBufferSafe(memGetAddress(struct + StdVideoH264SequenceParameterSet.POFFSETFORREFFRAME), Byte.toUnsignedInt(nnum_ref_frames_in_pic_order_cnt_cycle(struct))); }
    /** Unsafe version of {@link #pScalingLists}. */
    public static StdVideoH264ScalingLists npScalingLists(long struct) { return StdVideoH264ScalingLists.create(memGetAddress(struct + StdVideoH264SequenceParameterSet.PSCALINGLISTS)); }
    /** Unsafe version of {@link #pSequenceParameterSetVui}. */
    public static StdVideoH264SequenceParameterSetVui npSequenceParameterSetVui(long struct) { return StdVideoH264SequenceParameterSetVui.create(memGetAddress(struct + StdVideoH264SequenceParameterSet.PSEQUENCEPARAMETERSETVUI)); }

    /** Unsafe version of {@link #profile_idc(int) profile_idc}. */
    public static void nprofile_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.PROFILE_IDC, value); }
    /** Unsafe version of {@link #level_idc(int) level_idc}. */
    public static void nlevel_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.LEVEL_IDC, value); }
    /** Unsafe version of {@link #seq_parameter_set_id(byte) seq_parameter_set_id}. */
    public static void nseq_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSet.SEQ_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #chroma_format_idc(int) chroma_format_idc}. */
    public static void nchroma_format_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.CHROMA_FORMAT_IDC, value); }
    /** Unsafe version of {@link #bit_depth_luma_minus8(byte) bit_depth_luma_minus8}. */
    public static void nbit_depth_luma_minus8(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSet.BIT_DEPTH_LUMA_MINUS8, value); }
    /** Unsafe version of {@link #bit_depth_chroma_minus8(byte) bit_depth_chroma_minus8}. */
    public static void nbit_depth_chroma_minus8(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSet.BIT_DEPTH_CHROMA_MINUS8, value); }
    /** Unsafe version of {@link #log2_max_frame_num_minus4(byte) log2_max_frame_num_minus4}. */
    public static void nlog2_max_frame_num_minus4(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSet.LOG2_MAX_FRAME_NUM_MINUS4, value); }
    /** Unsafe version of {@link #pic_order_cnt_type(int) pic_order_cnt_type}. */
    public static void npic_order_cnt_type(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.PIC_ORDER_CNT_TYPE, value); }
    /** Unsafe version of {@link #log2_max_pic_order_cnt_lsb_minus4(byte) log2_max_pic_order_cnt_lsb_minus4}. */
    public static void nlog2_max_pic_order_cnt_lsb_minus4(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSet.LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4, value); }
    /** Unsafe version of {@link #offset_for_non_ref_pic(int) offset_for_non_ref_pic}. */
    public static void noffset_for_non_ref_pic(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.OFFSET_FOR_NON_REF_PIC, value); }
    /** Unsafe version of {@link #offset_for_top_to_bottom_field(int) offset_for_top_to_bottom_field}. */
    public static void noffset_for_top_to_bottom_field(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.OFFSET_FOR_TOP_TO_BOTTOM_FIELD, value); }
    /** Sets the specified value to the {@code num_ref_frames_in_pic_order_cnt_cycle} field of the specified {@code struct}. */
    public static void nnum_ref_frames_in_pic_order_cnt_cycle(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSet.NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE, value); }
    /** Unsafe version of {@link #max_num_ref_frames(byte) max_num_ref_frames}. */
    public static void nmax_num_ref_frames(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSet.MAX_NUM_REF_FRAMES, value); }
    /** Unsafe version of {@link #pic_width_in_mbs_minus1(int) pic_width_in_mbs_minus1}. */
    public static void npic_width_in_mbs_minus1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.PIC_WIDTH_IN_MBS_MINUS1, value); }
    /** Unsafe version of {@link #pic_height_in_map_units_minus1(int) pic_height_in_map_units_minus1}. */
    public static void npic_height_in_map_units_minus1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.PIC_HEIGHT_IN_MAP_UNITS_MINUS1, value); }
    /** Unsafe version of {@link #frame_crop_left_offset(int) frame_crop_left_offset}. */
    public static void nframe_crop_left_offset(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.FRAME_CROP_LEFT_OFFSET, value); }
    /** Unsafe version of {@link #frame_crop_right_offset(int) frame_crop_right_offset}. */
    public static void nframe_crop_right_offset(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.FRAME_CROP_RIGHT_OFFSET, value); }
    /** Unsafe version of {@link #frame_crop_top_offset(int) frame_crop_top_offset}. */
    public static void nframe_crop_top_offset(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.FRAME_CROP_TOP_OFFSET, value); }
    /** Unsafe version of {@link #frame_crop_bottom_offset(int) frame_crop_bottom_offset}. */
    public static void nframe_crop_bottom_offset(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSet.FRAME_CROP_BOTTOM_OFFSET, value); }
    /** Unsafe version of {@link #flags(StdVideoH264SpsFlags) flags}. */
    public static void nflags(long struct, StdVideoH264SpsFlags value) { memCopy(value.address(), struct + StdVideoH264SequenceParameterSet.FLAGS, StdVideoH264SpsFlags.SIZEOF); }
    /** Unsafe version of {@link #pOffsetForRefFrame(IntBuffer) pOffsetForRefFrame}. */
    public static void npOffsetForRefFrame(long struct, @Nullable IntBuffer value) { memPutAddress(struct + StdVideoH264SequenceParameterSet.POFFSETFORREFFRAME, memAddressSafe(value)); nnum_ref_frames_in_pic_order_cnt_cycle(struct, value == null ? 0 : (byte)value.remaining()); }
    /** Unsafe version of {@link #pScalingLists(StdVideoH264ScalingLists) pScalingLists}. */
    public static void npScalingLists(long struct, StdVideoH264ScalingLists value) { memPutAddress(struct + StdVideoH264SequenceParameterSet.PSCALINGLISTS, value.address()); }
    /** Unsafe version of {@link #pSequenceParameterSetVui(StdVideoH264SequenceParameterSetVui) pSequenceParameterSetVui}. */
    public static void npSequenceParameterSetVui(long struct, StdVideoH264SequenceParameterSetVui value) { memPutAddress(struct + StdVideoH264SequenceParameterSet.PSEQUENCEPARAMETERSETVUI, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoH264SequenceParameterSet.PSCALINGLISTS));
        long pSequenceParameterSetVui = memGetAddress(struct + StdVideoH264SequenceParameterSet.PSEQUENCEPARAMETERSETVUI);
        check(pSequenceParameterSetVui);
        StdVideoH264SequenceParameterSetVui.validate(pSequenceParameterSetVui);
    }

    // -----------------------------------

    /** An array of {@link StdVideoH264SequenceParameterSet} structs. */
    public static class Buffer extends StructBuffer<StdVideoH264SequenceParameterSet, Buffer> implements NativeResource {

        private static final StdVideoH264SequenceParameterSet ELEMENT_FACTORY = StdVideoH264SequenceParameterSet.create(-1L);

        /**
         * Creates a new {@code StdVideoH264SequenceParameterSet.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH264SequenceParameterSet#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH264SequenceParameterSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code profile_idc} field. */
        @NativeType("StdVideoH264ProfileIdc")
        public int profile_idc() { return StdVideoH264SequenceParameterSet.nprofile_idc(address()); }
        /** @return the value of the {@code level_idc} field. */
        @NativeType("StdVideoH264Level")
        public int level_idc() { return StdVideoH264SequenceParameterSet.nlevel_idc(address()); }
        /** @return the value of the {@code seq_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte seq_parameter_set_id() { return StdVideoH264SequenceParameterSet.nseq_parameter_set_id(address()); }
        /** @return the value of the {@code chroma_format_idc} field. */
        @NativeType("StdVideoH264ChromaFormatIdc")
        public int chroma_format_idc() { return StdVideoH264SequenceParameterSet.nchroma_format_idc(address()); }
        /** @return the value of the {@code bit_depth_luma_minus8} field. */
        @NativeType("uint8_t")
        public byte bit_depth_luma_minus8() { return StdVideoH264SequenceParameterSet.nbit_depth_luma_minus8(address()); }
        /** @return the value of the {@code bit_depth_chroma_minus8} field. */
        @NativeType("uint8_t")
        public byte bit_depth_chroma_minus8() { return StdVideoH264SequenceParameterSet.nbit_depth_chroma_minus8(address()); }
        /** @return the value of the {@code log2_max_frame_num_minus4} field. */
        @NativeType("uint8_t")
        public byte log2_max_frame_num_minus4() { return StdVideoH264SequenceParameterSet.nlog2_max_frame_num_minus4(address()); }
        /** @return the value of the {@code pic_order_cnt_type} field. */
        @NativeType("StdVideoH264PocType")
        public int pic_order_cnt_type() { return StdVideoH264SequenceParameterSet.npic_order_cnt_type(address()); }
        /** @return the value of the {@code log2_max_pic_order_cnt_lsb_minus4} field. */
        @NativeType("uint8_t")
        public byte log2_max_pic_order_cnt_lsb_minus4() { return StdVideoH264SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(address()); }
        /** @return the value of the {@code offset_for_non_ref_pic} field. */
        @NativeType("int32_t")
        public int offset_for_non_ref_pic() { return StdVideoH264SequenceParameterSet.noffset_for_non_ref_pic(address()); }
        /** @return the value of the {@code offset_for_top_to_bottom_field} field. */
        @NativeType("int32_t")
        public int offset_for_top_to_bottom_field() { return StdVideoH264SequenceParameterSet.noffset_for_top_to_bottom_field(address()); }
        /** @return the value of the {@code num_ref_frames_in_pic_order_cnt_cycle} field. */
        @NativeType("uint8_t")
        public byte num_ref_frames_in_pic_order_cnt_cycle() { return StdVideoH264SequenceParameterSet.nnum_ref_frames_in_pic_order_cnt_cycle(address()); }
        /** @return the value of the {@code max_num_ref_frames} field. */
        @NativeType("uint8_t")
        public byte max_num_ref_frames() { return StdVideoH264SequenceParameterSet.nmax_num_ref_frames(address()); }
        /** @return the value of the {@code pic_width_in_mbs_minus1} field. */
        @NativeType("uint32_t")
        public int pic_width_in_mbs_minus1() { return StdVideoH264SequenceParameterSet.npic_width_in_mbs_minus1(address()); }
        /** @return the value of the {@code pic_height_in_map_units_minus1} field. */
        @NativeType("uint32_t")
        public int pic_height_in_map_units_minus1() { return StdVideoH264SequenceParameterSet.npic_height_in_map_units_minus1(address()); }
        /** @return the value of the {@code frame_crop_left_offset} field. */
        @NativeType("uint32_t")
        public int frame_crop_left_offset() { return StdVideoH264SequenceParameterSet.nframe_crop_left_offset(address()); }
        /** @return the value of the {@code frame_crop_right_offset} field. */
        @NativeType("uint32_t")
        public int frame_crop_right_offset() { return StdVideoH264SequenceParameterSet.nframe_crop_right_offset(address()); }
        /** @return the value of the {@code frame_crop_top_offset} field. */
        @NativeType("uint32_t")
        public int frame_crop_top_offset() { return StdVideoH264SequenceParameterSet.nframe_crop_top_offset(address()); }
        /** @return the value of the {@code frame_crop_bottom_offset} field. */
        @NativeType("uint32_t")
        public int frame_crop_bottom_offset() { return StdVideoH264SequenceParameterSet.nframe_crop_bottom_offset(address()); }
        /** @return a {@link StdVideoH264SpsFlags} view of the {@code flags} field. */
        public StdVideoH264SpsFlags flags() { return StdVideoH264SequenceParameterSet.nflags(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link StdVideoH264SequenceParameterSet#pOffsetForRefFrame} field. */
        @Nullable
        @NativeType("int32_t *")
        public IntBuffer pOffsetForRefFrame() { return StdVideoH264SequenceParameterSet.npOffsetForRefFrame(address()); }
        /** @return a {@link StdVideoH264ScalingLists} view of the struct pointed to by the {@link StdVideoH264SequenceParameterSet#pScalingLists} field. */
        @NativeType("StdVideoH264ScalingLists *")
        public StdVideoH264ScalingLists pScalingLists() { return StdVideoH264SequenceParameterSet.npScalingLists(address()); }
        /** @return a {@link StdVideoH264SequenceParameterSetVui} view of the struct pointed to by the {@link StdVideoH264SequenceParameterSet#pSequenceParameterSetVui} field. */
        @NativeType("StdVideoH264SequenceParameterSetVui *")
        public StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui() { return StdVideoH264SequenceParameterSet.npSequenceParameterSetVui(address()); }

        /** Sets the specified value to the {@code profile_idc} field. */
        public StdVideoH264SequenceParameterSet.Buffer profile_idc(@NativeType("StdVideoH264ProfileIdc") int value) { StdVideoH264SequenceParameterSet.nprofile_idc(address(), value); return this; }
        /** Sets the specified value to the {@code level_idc} field. */
        public StdVideoH264SequenceParameterSet.Buffer level_idc(@NativeType("StdVideoH264Level") int value) { StdVideoH264SequenceParameterSet.nlevel_idc(address(), value); return this; }
        /** Sets the specified value to the {@code seq_parameter_set_id} field. */
        public StdVideoH264SequenceParameterSet.Buffer seq_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.nseq_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_format_idc} field. */
        public StdVideoH264SequenceParameterSet.Buffer chroma_format_idc(@NativeType("StdVideoH264ChromaFormatIdc") int value) { StdVideoH264SequenceParameterSet.nchroma_format_idc(address(), value); return this; }
        /** Sets the specified value to the {@code bit_depth_luma_minus8} field. */
        public StdVideoH264SequenceParameterSet.Buffer bit_depth_luma_minus8(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.nbit_depth_luma_minus8(address(), value); return this; }
        /** Sets the specified value to the {@code bit_depth_chroma_minus8} field. */
        public StdVideoH264SequenceParameterSet.Buffer bit_depth_chroma_minus8(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.nbit_depth_chroma_minus8(address(), value); return this; }
        /** Sets the specified value to the {@code log2_max_frame_num_minus4} field. */
        public StdVideoH264SequenceParameterSet.Buffer log2_max_frame_num_minus4(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.nlog2_max_frame_num_minus4(address(), value); return this; }
        /** Sets the specified value to the {@code pic_order_cnt_type} field. */
        public StdVideoH264SequenceParameterSet.Buffer pic_order_cnt_type(@NativeType("StdVideoH264PocType") int value) { StdVideoH264SequenceParameterSet.npic_order_cnt_type(address(), value); return this; }
        /** Sets the specified value to the {@code log2_max_pic_order_cnt_lsb_minus4} field. */
        public StdVideoH264SequenceParameterSet.Buffer log2_max_pic_order_cnt_lsb_minus4(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.nlog2_max_pic_order_cnt_lsb_minus4(address(), value); return this; }
        /** Sets the specified value to the {@code offset_for_non_ref_pic} field. */
        public StdVideoH264SequenceParameterSet.Buffer offset_for_non_ref_pic(@NativeType("int32_t") int value) { StdVideoH264SequenceParameterSet.noffset_for_non_ref_pic(address(), value); return this; }
        /** Sets the specified value to the {@code offset_for_top_to_bottom_field} field. */
        public StdVideoH264SequenceParameterSet.Buffer offset_for_top_to_bottom_field(@NativeType("int32_t") int value) { StdVideoH264SequenceParameterSet.noffset_for_top_to_bottom_field(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_frames_in_pic_order_cnt_cycle} field. */
        public StdVideoH264SequenceParameterSet.Buffer num_ref_frames_in_pic_order_cnt_cycle(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.nnum_ref_frames_in_pic_order_cnt_cycle(address(), value); return this; }
        /** Sets the specified value to the {@code max_num_ref_frames} field. */
        public StdVideoH264SequenceParameterSet.Buffer max_num_ref_frames(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSet.nmax_num_ref_frames(address(), value); return this; }
        /** Sets the specified value to the {@code pic_width_in_mbs_minus1} field. */
        public StdVideoH264SequenceParameterSet.Buffer pic_width_in_mbs_minus1(@NativeType("uint32_t") int value) { StdVideoH264SequenceParameterSet.npic_width_in_mbs_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code pic_height_in_map_units_minus1} field. */
        public StdVideoH264SequenceParameterSet.Buffer pic_height_in_map_units_minus1(@NativeType("uint32_t") int value) { StdVideoH264SequenceParameterSet.npic_height_in_map_units_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code frame_crop_left_offset} field. */
        public StdVideoH264SequenceParameterSet.Buffer frame_crop_left_offset(@NativeType("uint32_t") int value) { StdVideoH264SequenceParameterSet.nframe_crop_left_offset(address(), value); return this; }
        /** Sets the specified value to the {@code frame_crop_right_offset} field. */
        public StdVideoH264SequenceParameterSet.Buffer frame_crop_right_offset(@NativeType("uint32_t") int value) { StdVideoH264SequenceParameterSet.nframe_crop_right_offset(address(), value); return this; }
        /** Sets the specified value to the {@code frame_crop_top_offset} field. */
        public StdVideoH264SequenceParameterSet.Buffer frame_crop_top_offset(@NativeType("uint32_t") int value) { StdVideoH264SequenceParameterSet.nframe_crop_top_offset(address(), value); return this; }
        /** Sets the specified value to the {@code frame_crop_bottom_offset} field. */
        public StdVideoH264SequenceParameterSet.Buffer frame_crop_bottom_offset(@NativeType("uint32_t") int value) { StdVideoH264SequenceParameterSet.nframe_crop_bottom_offset(address(), value); return this; }
        /** Copies the specified {@link StdVideoH264SpsFlags} to the {@code flags} field. */
        public StdVideoH264SequenceParameterSet.Buffer flags(StdVideoH264SpsFlags value) { StdVideoH264SequenceParameterSet.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH264SequenceParameterSet.Buffer flags(java.util.function.Consumer<StdVideoH264SpsFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link StdVideoH264SequenceParameterSet#pOffsetForRefFrame} field. */
        public StdVideoH264SequenceParameterSet.Buffer pOffsetForRefFrame(@Nullable @NativeType("int32_t *") IntBuffer value) { StdVideoH264SequenceParameterSet.npOffsetForRefFrame(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264ScalingLists} to the {@link StdVideoH264SequenceParameterSet#pScalingLists} field. */
        public StdVideoH264SequenceParameterSet.Buffer pScalingLists(@NativeType("StdVideoH264ScalingLists *") StdVideoH264ScalingLists value) { StdVideoH264SequenceParameterSet.npScalingLists(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264SequenceParameterSetVui} to the {@link StdVideoH264SequenceParameterSet#pSequenceParameterSetVui} field. */
        public StdVideoH264SequenceParameterSet.Buffer pSequenceParameterSetVui(@NativeType("StdVideoH264SequenceParameterSetVui *") StdVideoH264SequenceParameterSetVui value) { StdVideoH264SequenceParameterSet.npSequenceParameterSetVui(address(), value); return this; }

    }

}