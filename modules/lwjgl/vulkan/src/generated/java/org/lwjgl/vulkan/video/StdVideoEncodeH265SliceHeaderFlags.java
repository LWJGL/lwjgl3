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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH265SliceHeaderFlags {
 *     uint32_t first_slice_segment_in_pic_flag : 1;
 *     uint32_t no_output_of_prior_pics_flag : 1;
 *     uint32_t dependent_slice_segment_flag : 1;
 *     uint32_t short_term_ref_pic_set_sps_flag : 1;
 *     uint32_t slice_temporal_mvp_enable_flag : 1;
 *     uint32_t slice_sao_luma_flag : 1;
 *     uint32_t slice_sao_chroma_flag : 1;
 *     uint32_t num_ref_idx_active_override_flag : 1;
 *     uint32_t mvd_l1_zero_flag : 1;
 *     uint32_t cabac_init_flag : 1;
 *     uint32_t slice_deblocking_filter_disable_flag : 1;
 *     uint32_t collocated_from_l0_flag : 1;
 *     uint32_t slice_loop_filter_across_slices_enabled_flag : 1;
 *     uint32_t bLastSliceInPic : 1;
 *     uint32_t reservedBits : 18;
 *     uint16_t {@link #luma_weight_l0_flag};
 *     uint16_t {@link #chroma_weight_l0_flag};
 *     uint16_t {@link #luma_weight_l1_flag};
 *     uint16_t {@link #chroma_weight_l1_flag};
 * }</code></pre>
 */
public class StdVideoEncodeH265SliceHeaderFlags extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0,
        LUMA_WEIGHT_L0_FLAG,
        CHROMA_WEIGHT_L0_FLAG,
        LUMA_WEIGHT_L1_FLAG,
        CHROMA_WEIGHT_L1_FLAG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
        LUMA_WEIGHT_L0_FLAG = layout.offsetof(1);
        CHROMA_WEIGHT_L0_FLAG = layout.offsetof(2);
        LUMA_WEIGHT_L1_FLAG = layout.offsetof(3);
        CHROMA_WEIGHT_L1_FLAG = layout.offsetof(4);
    }

    /**
     * Creates a {@code StdVideoEncodeH265SliceHeaderFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265SliceHeaderFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code first_slice_segment_in_pic_flag} field. */
    @NativeType("uint32_t")
    public int first_slice_segment_in_pic_flag() { return nfirst_slice_segment_in_pic_flag(address()); }
    /** @return the value of the {@code no_output_of_prior_pics_flag} field. */
    @NativeType("uint32_t")
    public int no_output_of_prior_pics_flag() { return nno_output_of_prior_pics_flag(address()); }
    /** @return the value of the {@code dependent_slice_segment_flag} field. */
    @NativeType("uint32_t")
    public int dependent_slice_segment_flag() { return ndependent_slice_segment_flag(address()); }
    /** @return the value of the {@code short_term_ref_pic_set_sps_flag} field. */
    @NativeType("uint32_t")
    public int short_term_ref_pic_set_sps_flag() { return nshort_term_ref_pic_set_sps_flag(address()); }
    /** @return the value of the {@code slice_temporal_mvp_enable_flag} field. */
    @NativeType("uint32_t")
    public int slice_temporal_mvp_enable_flag() { return nslice_temporal_mvp_enable_flag(address()); }
    /** @return the value of the {@code slice_sao_luma_flag} field. */
    @NativeType("uint32_t")
    public int slice_sao_luma_flag() { return nslice_sao_luma_flag(address()); }
    /** @return the value of the {@code slice_sao_chroma_flag} field. */
    @NativeType("uint32_t")
    public int slice_sao_chroma_flag() { return nslice_sao_chroma_flag(address()); }
    /** @return the value of the {@code num_ref_idx_active_override_flag} field. */
    @NativeType("uint32_t")
    public int num_ref_idx_active_override_flag() { return nnum_ref_idx_active_override_flag(address()); }
    /** @return the value of the {@code mvd_l1_zero_flag} field. */
    @NativeType("uint32_t")
    public int mvd_l1_zero_flag() { return nmvd_l1_zero_flag(address()); }
    /** @return the value of the {@code cabac_init_flag} field. */
    @NativeType("uint32_t")
    public int cabac_init_flag() { return ncabac_init_flag(address()); }
    /** @return the value of the {@code slice_deblocking_filter_disable_flag} field. */
    @NativeType("uint32_t")
    public int slice_deblocking_filter_disable_flag() { return nslice_deblocking_filter_disable_flag(address()); }
    /** @return the value of the {@code collocated_from_l0_flag} field. */
    @NativeType("uint32_t")
    public int collocated_from_l0_flag() { return ncollocated_from_l0_flag(address()); }
    /** @return the value of the {@code slice_loop_filter_across_slices_enabled_flag} field. */
    @NativeType("uint32_t")
    public int slice_loop_filter_across_slices_enabled_flag() { return nslice_loop_filter_across_slices_enabled_flag(address()); }
    /** @return the value of the {@code bLastSliceInPic} field. */
    @NativeType("uint32_t")
    public int bLastSliceInPic() { return nbLastSliceInPic(address()); }
    /** @return the value of the {@code reservedBits} field. */
    @NativeType("uint32_t")
    public int reservedBits() { return nreservedBits(address()); }
    /** bit 0 - num_ref_idx_l0_active_minus1 */
    @NativeType("uint16_t")
    public short luma_weight_l0_flag() { return nluma_weight_l0_flag(address()); }
    /** bit 0 - num_ref_idx_l0_active_minus1 */
    @NativeType("uint16_t")
    public short chroma_weight_l0_flag() { return nchroma_weight_l0_flag(address()); }
    /** bit 0 - num_ref_idx_l1_active_minus1 */
    @NativeType("uint16_t")
    public short luma_weight_l1_flag() { return nluma_weight_l1_flag(address()); }
    /** bit 0 - num_ref_idx_l1_active_minus1 */
    @NativeType("uint16_t")
    public short chroma_weight_l1_flag() { return nchroma_weight_l1_flag(address()); }

    /** Sets the specified value to the {@code first_slice_segment_in_pic_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags first_slice_segment_in_pic_flag(@NativeType("uint32_t") int value) { nfirst_slice_segment_in_pic_flag(address(), value); return this; }
    /** Sets the specified value to the {@code no_output_of_prior_pics_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags no_output_of_prior_pics_flag(@NativeType("uint32_t") int value) { nno_output_of_prior_pics_flag(address(), value); return this; }
    /** Sets the specified value to the {@code dependent_slice_segment_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags dependent_slice_segment_flag(@NativeType("uint32_t") int value) { ndependent_slice_segment_flag(address(), value); return this; }
    /** Sets the specified value to the {@code short_term_ref_pic_set_sps_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") int value) { nshort_term_ref_pic_set_sps_flag(address(), value); return this; }
    /** Sets the specified value to the {@code slice_temporal_mvp_enable_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags slice_temporal_mvp_enable_flag(@NativeType("uint32_t") int value) { nslice_temporal_mvp_enable_flag(address(), value); return this; }
    /** Sets the specified value to the {@code slice_sao_luma_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags slice_sao_luma_flag(@NativeType("uint32_t") int value) { nslice_sao_luma_flag(address(), value); return this; }
    /** Sets the specified value to the {@code slice_sao_chroma_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags slice_sao_chroma_flag(@NativeType("uint32_t") int value) { nslice_sao_chroma_flag(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_idx_active_override_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags num_ref_idx_active_override_flag(@NativeType("uint32_t") int value) { nnum_ref_idx_active_override_flag(address(), value); return this; }
    /** Sets the specified value to the {@code mvd_l1_zero_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags mvd_l1_zero_flag(@NativeType("uint32_t") int value) { nmvd_l1_zero_flag(address(), value); return this; }
    /** Sets the specified value to the {@code cabac_init_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags cabac_init_flag(@NativeType("uint32_t") int value) { ncabac_init_flag(address(), value); return this; }
    /** Sets the specified value to the {@code slice_deblocking_filter_disable_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags slice_deblocking_filter_disable_flag(@NativeType("uint32_t") int value) { nslice_deblocking_filter_disable_flag(address(), value); return this; }
    /** Sets the specified value to the {@code collocated_from_l0_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags collocated_from_l0_flag(@NativeType("uint32_t") int value) { ncollocated_from_l0_flag(address(), value); return this; }
    /** Sets the specified value to the {@code slice_loop_filter_across_slices_enabled_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags slice_loop_filter_across_slices_enabled_flag(@NativeType("uint32_t") int value) { nslice_loop_filter_across_slices_enabled_flag(address(), value); return this; }
    /** Sets the specified value to the {@code bLastSliceInPic} field. */
    public StdVideoEncodeH265SliceHeaderFlags bLastSliceInPic(@NativeType("uint32_t") int value) { nbLastSliceInPic(address(), value); return this; }
    /** Sets the specified value to the {@code reservedBits} field. */
    public StdVideoEncodeH265SliceHeaderFlags reservedBits(@NativeType("uint32_t") int value) { nreservedBits(address(), value); return this; }
    /** Sets the specified value to the {@link #luma_weight_l0_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags luma_weight_l0_flag(@NativeType("uint16_t") short value) { nluma_weight_l0_flag(address(), value); return this; }
    /** Sets the specified value to the {@link #chroma_weight_l0_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags chroma_weight_l0_flag(@NativeType("uint16_t") short value) { nchroma_weight_l0_flag(address(), value); return this; }
    /** Sets the specified value to the {@link #luma_weight_l1_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags luma_weight_l1_flag(@NativeType("uint16_t") short value) { nluma_weight_l1_flag(address(), value); return this; }
    /** Sets the specified value to the {@link #chroma_weight_l1_flag} field. */
    public StdVideoEncodeH265SliceHeaderFlags chroma_weight_l1_flag(@NativeType("uint16_t") short value) { nchroma_weight_l1_flag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265SliceHeaderFlags set(
        int first_slice_segment_in_pic_flag,
        int no_output_of_prior_pics_flag,
        int dependent_slice_segment_flag,
        int short_term_ref_pic_set_sps_flag,
        int slice_temporal_mvp_enable_flag,
        int slice_sao_luma_flag,
        int slice_sao_chroma_flag,
        int num_ref_idx_active_override_flag,
        int mvd_l1_zero_flag,
        int cabac_init_flag,
        int slice_deblocking_filter_disable_flag,
        int collocated_from_l0_flag,
        int slice_loop_filter_across_slices_enabled_flag,
        int bLastSliceInPic,
        int reservedBits,
        short luma_weight_l0_flag,
        short chroma_weight_l0_flag,
        short luma_weight_l1_flag,
        short chroma_weight_l1_flag
    ) {
        first_slice_segment_in_pic_flag(first_slice_segment_in_pic_flag);
        no_output_of_prior_pics_flag(no_output_of_prior_pics_flag);
        dependent_slice_segment_flag(dependent_slice_segment_flag);
        short_term_ref_pic_set_sps_flag(short_term_ref_pic_set_sps_flag);
        slice_temporal_mvp_enable_flag(slice_temporal_mvp_enable_flag);
        slice_sao_luma_flag(slice_sao_luma_flag);
        slice_sao_chroma_flag(slice_sao_chroma_flag);
        num_ref_idx_active_override_flag(num_ref_idx_active_override_flag);
        mvd_l1_zero_flag(mvd_l1_zero_flag);
        cabac_init_flag(cabac_init_flag);
        slice_deblocking_filter_disable_flag(slice_deblocking_filter_disable_flag);
        collocated_from_l0_flag(collocated_from_l0_flag);
        slice_loop_filter_across_slices_enabled_flag(slice_loop_filter_across_slices_enabled_flag);
        bLastSliceInPic(bLastSliceInPic);
        reservedBits(reservedBits);
        luma_weight_l0_flag(luma_weight_l0_flag);
        chroma_weight_l0_flag(chroma_weight_l0_flag);
        luma_weight_l1_flag(luma_weight_l1_flag);
        chroma_weight_l1_flag(chroma_weight_l1_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265SliceHeaderFlags set(StdVideoEncodeH265SliceHeaderFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265SliceHeaderFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265SliceHeaderFlags malloc() {
        return wrap(StdVideoEncodeH265SliceHeaderFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265SliceHeaderFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265SliceHeaderFlags calloc() {
        return wrap(StdVideoEncodeH265SliceHeaderFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265SliceHeaderFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265SliceHeaderFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH265SliceHeaderFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265SliceHeaderFlags} instance for the specified memory address. */
    public static StdVideoEncodeH265SliceHeaderFlags create(long address) {
        return wrap(StdVideoEncodeH265SliceHeaderFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265SliceHeaderFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH265SliceHeaderFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceHeaderFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeaderFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceHeaderFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeaderFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceHeaderFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeaderFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH265SliceHeaderFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeaderFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265SliceHeaderFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265SliceHeaderFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265SliceHeaderFlags malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265SliceHeaderFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH265SliceHeaderFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265SliceHeaderFlags calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265SliceHeaderFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceHeaderFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeaderFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceHeaderFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceHeaderFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265SliceHeaderFlags.BITFIELD0); }
    /** Unsafe version of {@link #first_slice_segment_in_pic_flag}. */
    public static int nfirst_slice_segment_in_pic_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #no_output_of_prior_pics_flag}. */
    public static int nno_output_of_prior_pics_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #dependent_slice_segment_flag}. */
    public static int ndependent_slice_segment_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #short_term_ref_pic_set_sps_flag}. */
    public static int nshort_term_ref_pic_set_sps_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #slice_temporal_mvp_enable_flag}. */
    public static int nslice_temporal_mvp_enable_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #slice_sao_luma_flag}. */
    public static int nslice_sao_luma_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #slice_sao_chroma_flag}. */
    public static int nslice_sao_chroma_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #num_ref_idx_active_override_flag}. */
    public static int nnum_ref_idx_active_override_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #mvd_l1_zero_flag}. */
    public static int nmvd_l1_zero_flag(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }
    /** Unsafe version of {@link #cabac_init_flag}. */
    public static int ncabac_init_flag(long struct) { return (nbitfield0(struct) & 0x00_00_02_00) >>> 9; }
    /** Unsafe version of {@link #slice_deblocking_filter_disable_flag}. */
    public static int nslice_deblocking_filter_disable_flag(long struct) { return (nbitfield0(struct) & 0x00_00_04_00) >>> 10; }
    /** Unsafe version of {@link #collocated_from_l0_flag}. */
    public static int ncollocated_from_l0_flag(long struct) { return (nbitfield0(struct) & 0x00_00_08_00) >>> 11; }
    /** Unsafe version of {@link #slice_loop_filter_across_slices_enabled_flag}. */
    public static int nslice_loop_filter_across_slices_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_10_00) >>> 12; }
    /** Unsafe version of {@link #bLastSliceInPic}. */
    public static int nbLastSliceInPic(long struct) { return (nbitfield0(struct) & 0x00_00_20_00) >>> 13; }
    /** Unsafe version of {@link #reservedBits}. */
    public static int nreservedBits(long struct) { return nbitfield0(struct) >>> 14; }
    /** Unsafe version of {@link #luma_weight_l0_flag}. */
    public static short nluma_weight_l0_flag(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH265SliceHeaderFlags.LUMA_WEIGHT_L0_FLAG); }
    /** Unsafe version of {@link #chroma_weight_l0_flag}. */
    public static short nchroma_weight_l0_flag(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH265SliceHeaderFlags.CHROMA_WEIGHT_L0_FLAG); }
    /** Unsafe version of {@link #luma_weight_l1_flag}. */
    public static short nluma_weight_l1_flag(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH265SliceHeaderFlags.LUMA_WEIGHT_L1_FLAG); }
    /** Unsafe version of {@link #chroma_weight_l1_flag}. */
    public static short nchroma_weight_l1_flag(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH265SliceHeaderFlags.CHROMA_WEIGHT_L1_FLAG); }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265SliceHeaderFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #first_slice_segment_in_pic_flag(int) first_slice_segment_in_pic_flag}. */
    public static void nfirst_slice_segment_in_pic_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #no_output_of_prior_pics_flag(int) no_output_of_prior_pics_flag}. */
    public static void nno_output_of_prior_pics_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #dependent_slice_segment_flag(int) dependent_slice_segment_flag}. */
    public static void ndependent_slice_segment_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #short_term_ref_pic_set_sps_flag(int) short_term_ref_pic_set_sps_flag}. */
    public static void nshort_term_ref_pic_set_sps_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #slice_temporal_mvp_enable_flag(int) slice_temporal_mvp_enable_flag}. */
    public static void nslice_temporal_mvp_enable_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #slice_sao_luma_flag(int) slice_sao_luma_flag}. */
    public static void nslice_sao_luma_flag(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #slice_sao_chroma_flag(int) slice_sao_chroma_flag}. */
    public static void nslice_sao_chroma_flag(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #num_ref_idx_active_override_flag(int) num_ref_idx_active_override_flag}. */
    public static void nnum_ref_idx_active_override_flag(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #mvd_l1_zero_flag(int) mvd_l1_zero_flag}. */
    public static void nmvd_l1_zero_flag(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }
    /** Unsafe version of {@link #cabac_init_flag(int) cabac_init_flag}. */
    public static void ncabac_init_flag(long struct, int value) { nbitfield0(struct, ((value << 9) & 0x00_00_02_00) | (nbitfield0(struct) & 0xFF_FF_FD_FF)); }
    /** Unsafe version of {@link #slice_deblocking_filter_disable_flag(int) slice_deblocking_filter_disable_flag}. */
    public static void nslice_deblocking_filter_disable_flag(long struct, int value) { nbitfield0(struct, ((value << 10) & 0x00_00_04_00) | (nbitfield0(struct) & 0xFF_FF_FB_FF)); }
    /** Unsafe version of {@link #collocated_from_l0_flag(int) collocated_from_l0_flag}. */
    public static void ncollocated_from_l0_flag(long struct, int value) { nbitfield0(struct, ((value << 11) & 0x00_00_08_00) | (nbitfield0(struct) & 0xFF_FF_F7_FF)); }
    /** Unsafe version of {@link #slice_loop_filter_across_slices_enabled_flag(int) slice_loop_filter_across_slices_enabled_flag}. */
    public static void nslice_loop_filter_across_slices_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 12) & 0x00_00_10_00) | (nbitfield0(struct) & 0xFF_FF_EF_FF)); }
    /** Unsafe version of {@link #bLastSliceInPic(int) bLastSliceInPic}. */
    public static void nbLastSliceInPic(long struct, int value) { nbitfield0(struct, ((value << 13) & 0x00_00_20_00) | (nbitfield0(struct) & 0xFF_FF_DF_FF)); }
    /** Unsafe version of {@link #reservedBits(int) reservedBits}. */
    public static void nreservedBits(long struct, int value) { nbitfield0(struct, (value << 14) | (nbitfield0(struct) & 0x00_00_3F_FF)); }
    /** Unsafe version of {@link #luma_weight_l0_flag(short) luma_weight_l0_flag}. */
    public static void nluma_weight_l0_flag(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH265SliceHeaderFlags.LUMA_WEIGHT_L0_FLAG, value); }
    /** Unsafe version of {@link #chroma_weight_l0_flag(short) chroma_weight_l0_flag}. */
    public static void nchroma_weight_l0_flag(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH265SliceHeaderFlags.CHROMA_WEIGHT_L0_FLAG, value); }
    /** Unsafe version of {@link #luma_weight_l1_flag(short) luma_weight_l1_flag}. */
    public static void nluma_weight_l1_flag(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH265SliceHeaderFlags.LUMA_WEIGHT_L1_FLAG, value); }
    /** Unsafe version of {@link #chroma_weight_l1_flag(short) chroma_weight_l1_flag}. */
    public static void nchroma_weight_l1_flag(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH265SliceHeaderFlags.CHROMA_WEIGHT_L1_FLAG, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265SliceHeaderFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265SliceHeaderFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265SliceHeaderFlags ELEMENT_FACTORY = StdVideoEncodeH265SliceHeaderFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265SliceHeaderFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265SliceHeaderFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH265SliceHeaderFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code first_slice_segment_in_pic_flag} field. */
        @NativeType("uint32_t")
        public int first_slice_segment_in_pic_flag() { return StdVideoEncodeH265SliceHeaderFlags.nfirst_slice_segment_in_pic_flag(address()); }
        /** @return the value of the {@code no_output_of_prior_pics_flag} field. */
        @NativeType("uint32_t")
        public int no_output_of_prior_pics_flag() { return StdVideoEncodeH265SliceHeaderFlags.nno_output_of_prior_pics_flag(address()); }
        /** @return the value of the {@code dependent_slice_segment_flag} field. */
        @NativeType("uint32_t")
        public int dependent_slice_segment_flag() { return StdVideoEncodeH265SliceHeaderFlags.ndependent_slice_segment_flag(address()); }
        /** @return the value of the {@code short_term_ref_pic_set_sps_flag} field. */
        @NativeType("uint32_t")
        public int short_term_ref_pic_set_sps_flag() { return StdVideoEncodeH265SliceHeaderFlags.nshort_term_ref_pic_set_sps_flag(address()); }
        /** @return the value of the {@code slice_temporal_mvp_enable_flag} field. */
        @NativeType("uint32_t")
        public int slice_temporal_mvp_enable_flag() { return StdVideoEncodeH265SliceHeaderFlags.nslice_temporal_mvp_enable_flag(address()); }
        /** @return the value of the {@code slice_sao_luma_flag} field. */
        @NativeType("uint32_t")
        public int slice_sao_luma_flag() { return StdVideoEncodeH265SliceHeaderFlags.nslice_sao_luma_flag(address()); }
        /** @return the value of the {@code slice_sao_chroma_flag} field. */
        @NativeType("uint32_t")
        public int slice_sao_chroma_flag() { return StdVideoEncodeH265SliceHeaderFlags.nslice_sao_chroma_flag(address()); }
        /** @return the value of the {@code num_ref_idx_active_override_flag} field. */
        @NativeType("uint32_t")
        public int num_ref_idx_active_override_flag() { return StdVideoEncodeH265SliceHeaderFlags.nnum_ref_idx_active_override_flag(address()); }
        /** @return the value of the {@code mvd_l1_zero_flag} field. */
        @NativeType("uint32_t")
        public int mvd_l1_zero_flag() { return StdVideoEncodeH265SliceHeaderFlags.nmvd_l1_zero_flag(address()); }
        /** @return the value of the {@code cabac_init_flag} field. */
        @NativeType("uint32_t")
        public int cabac_init_flag() { return StdVideoEncodeH265SliceHeaderFlags.ncabac_init_flag(address()); }
        /** @return the value of the {@code slice_deblocking_filter_disable_flag} field. */
        @NativeType("uint32_t")
        public int slice_deblocking_filter_disable_flag() { return StdVideoEncodeH265SliceHeaderFlags.nslice_deblocking_filter_disable_flag(address()); }
        /** @return the value of the {@code collocated_from_l0_flag} field. */
        @NativeType("uint32_t")
        public int collocated_from_l0_flag() { return StdVideoEncodeH265SliceHeaderFlags.ncollocated_from_l0_flag(address()); }
        /** @return the value of the {@code slice_loop_filter_across_slices_enabled_flag} field. */
        @NativeType("uint32_t")
        public int slice_loop_filter_across_slices_enabled_flag() { return StdVideoEncodeH265SliceHeaderFlags.nslice_loop_filter_across_slices_enabled_flag(address()); }
        /** @return the value of the {@code bLastSliceInPic} field. */
        @NativeType("uint32_t")
        public int bLastSliceInPic() { return StdVideoEncodeH265SliceHeaderFlags.nbLastSliceInPic(address()); }
        /** @return the value of the {@code reservedBits} field. */
        @NativeType("uint32_t")
        public int reservedBits() { return StdVideoEncodeH265SliceHeaderFlags.nreservedBits(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeaderFlags#luma_weight_l0_flag} field. */
        @NativeType("uint16_t")
        public short luma_weight_l0_flag() { return StdVideoEncodeH265SliceHeaderFlags.nluma_weight_l0_flag(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeaderFlags#chroma_weight_l0_flag} field. */
        @NativeType("uint16_t")
        public short chroma_weight_l0_flag() { return StdVideoEncodeH265SliceHeaderFlags.nchroma_weight_l0_flag(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeaderFlags#luma_weight_l1_flag} field. */
        @NativeType("uint16_t")
        public short luma_weight_l1_flag() { return StdVideoEncodeH265SliceHeaderFlags.nluma_weight_l1_flag(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceHeaderFlags#chroma_weight_l1_flag} field. */
        @NativeType("uint16_t")
        public short chroma_weight_l1_flag() { return StdVideoEncodeH265SliceHeaderFlags.nchroma_weight_l1_flag(address()); }

        /** Sets the specified value to the {@code first_slice_segment_in_pic_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer first_slice_segment_in_pic_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nfirst_slice_segment_in_pic_flag(address(), value); return this; }
        /** Sets the specified value to the {@code no_output_of_prior_pics_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer no_output_of_prior_pics_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nno_output_of_prior_pics_flag(address(), value); return this; }
        /** Sets the specified value to the {@code dependent_slice_segment_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer dependent_slice_segment_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.ndependent_slice_segment_flag(address(), value); return this; }
        /** Sets the specified value to the {@code short_term_ref_pic_set_sps_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nshort_term_ref_pic_set_sps_flag(address(), value); return this; }
        /** Sets the specified value to the {@code slice_temporal_mvp_enable_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer slice_temporal_mvp_enable_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nslice_temporal_mvp_enable_flag(address(), value); return this; }
        /** Sets the specified value to the {@code slice_sao_luma_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer slice_sao_luma_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nslice_sao_luma_flag(address(), value); return this; }
        /** Sets the specified value to the {@code slice_sao_chroma_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer slice_sao_chroma_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nslice_sao_chroma_flag(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_idx_active_override_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer num_ref_idx_active_override_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nnum_ref_idx_active_override_flag(address(), value); return this; }
        /** Sets the specified value to the {@code mvd_l1_zero_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer mvd_l1_zero_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nmvd_l1_zero_flag(address(), value); return this; }
        /** Sets the specified value to the {@code cabac_init_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer cabac_init_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.ncabac_init_flag(address(), value); return this; }
        /** Sets the specified value to the {@code slice_deblocking_filter_disable_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer slice_deblocking_filter_disable_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nslice_deblocking_filter_disable_flag(address(), value); return this; }
        /** Sets the specified value to the {@code collocated_from_l0_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer collocated_from_l0_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.ncollocated_from_l0_flag(address(), value); return this; }
        /** Sets the specified value to the {@code slice_loop_filter_across_slices_enabled_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer slice_loop_filter_across_slices_enabled_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nslice_loop_filter_across_slices_enabled_flag(address(), value); return this; }
        /** Sets the specified value to the {@code bLastSliceInPic} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer bLastSliceInPic(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nbLastSliceInPic(address(), value); return this; }
        /** Sets the specified value to the {@code reservedBits} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer reservedBits(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceHeaderFlags.nreservedBits(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeaderFlags#luma_weight_l0_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer luma_weight_l0_flag(@NativeType("uint16_t") short value) { StdVideoEncodeH265SliceHeaderFlags.nluma_weight_l0_flag(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeaderFlags#chroma_weight_l0_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer chroma_weight_l0_flag(@NativeType("uint16_t") short value) { StdVideoEncodeH265SliceHeaderFlags.nchroma_weight_l0_flag(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeaderFlags#luma_weight_l1_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer luma_weight_l1_flag(@NativeType("uint16_t") short value) { StdVideoEncodeH265SliceHeaderFlags.nluma_weight_l1_flag(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceHeaderFlags#chroma_weight_l1_flag} field. */
        public StdVideoEncodeH265SliceHeaderFlags.Buffer chroma_weight_l1_flag(@NativeType("uint16_t") short value) { StdVideoEncodeH265SliceHeaderFlags.nchroma_weight_l1_flag(address(), value); return this; }

    }

}