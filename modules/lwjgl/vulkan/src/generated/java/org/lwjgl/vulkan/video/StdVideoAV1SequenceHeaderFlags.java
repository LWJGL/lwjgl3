/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct StdVideoAV1SequenceHeaderFlags {
 *     uint32_t still_picture : 1;
 *     uint32_t reduced_still_picture_header : 1;
 *     uint32_t use_128x128_superblock : 1;
 *     uint32_t enable_filter_intra : 1;
 *     uint32_t enable_intra_edge_filter : 1;
 *     uint32_t enable_interintra_compound : 1;
 *     uint32_t enable_masked_compound : 1;
 *     uint32_t enable_warped_motion : 1;
 *     uint32_t enable_dual_filter : 1;
 *     uint32_t enable_order_hint : 1;
 *     uint32_t enable_jnt_comp : 1;
 *     uint32_t enable_ref_frame_mvs : 1;
 *     uint32_t frame_id_numbers_present_flag : 1;
 *     uint32_t enable_superres : 1;
 *     uint32_t enable_cdef : 1;
 *     uint32_t enable_restoration : 1;
 *     uint32_t film_grain_params_present : 1;
 *     uint32_t timing_info_present_flag : 1;
 *     uint32_t initial_display_delay_present_flag : 1;
 *     uint32_t reserved : 13;
 * }}</pre>
 */
public class StdVideoAV1SequenceHeaderFlags extends Struct<StdVideoAV1SequenceHeaderFlags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0,
        BITFIELD1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoAV1SequenceHeaderFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1SequenceHeaderFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1SequenceHeaderFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1SequenceHeaderFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1SequenceHeaderFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code still_picture} field. */
    @NativeType("uint32_t")
    public boolean still_picture() { return nstill_picture(address()) != 0; }
    /** @return the value of the {@code reduced_still_picture_header} field. */
    @NativeType("uint32_t")
    public boolean reduced_still_picture_header() { return nreduced_still_picture_header(address()) != 0; }
    /** @return the value of the {@code use_128x128_superblock} field. */
    @NativeType("uint32_t")
    public boolean use_128x128_superblock() { return nuse_128x128_superblock(address()) != 0; }
    /** @return the value of the {@code enable_filter_intra} field. */
    @NativeType("uint32_t")
    public boolean enable_filter_intra() { return nenable_filter_intra(address()) != 0; }
    /** @return the value of the {@code enable_intra_edge_filter} field. */
    @NativeType("uint32_t")
    public boolean enable_intra_edge_filter() { return nenable_intra_edge_filter(address()) != 0; }
    /** @return the value of the {@code enable_interintra_compound} field. */
    @NativeType("uint32_t")
    public boolean enable_interintra_compound() { return nenable_interintra_compound(address()) != 0; }
    /** @return the value of the {@code enable_masked_compound} field. */
    @NativeType("uint32_t")
    public boolean enable_masked_compound() { return nenable_masked_compound(address()) != 0; }
    /** @return the value of the {@code enable_warped_motion} field. */
    @NativeType("uint32_t")
    public boolean enable_warped_motion() { return nenable_warped_motion(address()) != 0; }
    /** @return the value of the {@code enable_dual_filter} field. */
    @NativeType("uint32_t")
    public boolean enable_dual_filter() { return nenable_dual_filter(address()) != 0; }
    /** @return the value of the {@code enable_order_hint} field. */
    @NativeType("uint32_t")
    public boolean enable_order_hint() { return nenable_order_hint(address()) != 0; }
    /** @return the value of the {@code enable_jnt_comp} field. */
    @NativeType("uint32_t")
    public boolean enable_jnt_comp() { return nenable_jnt_comp(address()) != 0; }
    /** @return the value of the {@code enable_ref_frame_mvs} field. */
    @NativeType("uint32_t")
    public boolean enable_ref_frame_mvs() { return nenable_ref_frame_mvs(address()) != 0; }
    /** @return the value of the {@code frame_id_numbers_present_flag} field. */
    @NativeType("uint32_t")
    public boolean frame_id_numbers_present_flag() { return nframe_id_numbers_present_flag(address()) != 0; }
    /** @return the value of the {@code enable_superres} field. */
    @NativeType("uint32_t")
    public boolean enable_superres() { return nenable_superres(address()) != 0; }
    /** @return the value of the {@code enable_cdef} field. */
    @NativeType("uint32_t")
    public boolean enable_cdef() { return nenable_cdef(address()) != 0; }
    /** @return the value of the {@code enable_restoration} field. */
    @NativeType("uint32_t")
    public boolean enable_restoration() { return nenable_restoration(address()) != 0; }
    /** @return the value of the {@code film_grain_params_present} field. */
    @NativeType("uint32_t")
    public boolean film_grain_params_present() { return nfilm_grain_params_present(address()) != 0; }
    /** @return the value of the {@code timing_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean timing_info_present_flag() { return ntiming_info_present_flag(address()) != 0; }
    /** @return the value of the {@code initial_display_delay_present_flag} field. */
    @NativeType("uint32_t")
    public boolean initial_display_delay_present_flag() { return ninitial_display_delay_present_flag(address()) != 0; }

    /** Sets the specified value to the {@code still_picture} field. */
    public StdVideoAV1SequenceHeaderFlags still_picture(@NativeType("uint32_t") boolean value) { nstill_picture(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code reduced_still_picture_header} field. */
    public StdVideoAV1SequenceHeaderFlags reduced_still_picture_header(@NativeType("uint32_t") boolean value) { nreduced_still_picture_header(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code use_128x128_superblock} field. */
    public StdVideoAV1SequenceHeaderFlags use_128x128_superblock(@NativeType("uint32_t") boolean value) { nuse_128x128_superblock(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_filter_intra} field. */
    public StdVideoAV1SequenceHeaderFlags enable_filter_intra(@NativeType("uint32_t") boolean value) { nenable_filter_intra(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_intra_edge_filter} field. */
    public StdVideoAV1SequenceHeaderFlags enable_intra_edge_filter(@NativeType("uint32_t") boolean value) { nenable_intra_edge_filter(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_interintra_compound} field. */
    public StdVideoAV1SequenceHeaderFlags enable_interintra_compound(@NativeType("uint32_t") boolean value) { nenable_interintra_compound(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_masked_compound} field. */
    public StdVideoAV1SequenceHeaderFlags enable_masked_compound(@NativeType("uint32_t") boolean value) { nenable_masked_compound(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_warped_motion} field. */
    public StdVideoAV1SequenceHeaderFlags enable_warped_motion(@NativeType("uint32_t") boolean value) { nenable_warped_motion(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_dual_filter} field. */
    public StdVideoAV1SequenceHeaderFlags enable_dual_filter(@NativeType("uint32_t") boolean value) { nenable_dual_filter(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_order_hint} field. */
    public StdVideoAV1SequenceHeaderFlags enable_order_hint(@NativeType("uint32_t") boolean value) { nenable_order_hint(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_jnt_comp} field. */
    public StdVideoAV1SequenceHeaderFlags enable_jnt_comp(@NativeType("uint32_t") boolean value) { nenable_jnt_comp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_ref_frame_mvs} field. */
    public StdVideoAV1SequenceHeaderFlags enable_ref_frame_mvs(@NativeType("uint32_t") boolean value) { nenable_ref_frame_mvs(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code frame_id_numbers_present_flag} field. */
    public StdVideoAV1SequenceHeaderFlags frame_id_numbers_present_flag(@NativeType("uint32_t") boolean value) { nframe_id_numbers_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_superres} field. */
    public StdVideoAV1SequenceHeaderFlags enable_superres(@NativeType("uint32_t") boolean value) { nenable_superres(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_cdef} field. */
    public StdVideoAV1SequenceHeaderFlags enable_cdef(@NativeType("uint32_t") boolean value) { nenable_cdef(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code enable_restoration} field. */
    public StdVideoAV1SequenceHeaderFlags enable_restoration(@NativeType("uint32_t") boolean value) { nenable_restoration(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code film_grain_params_present} field. */
    public StdVideoAV1SequenceHeaderFlags film_grain_params_present(@NativeType("uint32_t") boolean value) { nfilm_grain_params_present(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code timing_info_present_flag} field. */
    public StdVideoAV1SequenceHeaderFlags timing_info_present_flag(@NativeType("uint32_t") boolean value) { ntiming_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code initial_display_delay_present_flag} field. */
    public StdVideoAV1SequenceHeaderFlags initial_display_delay_present_flag(@NativeType("uint32_t") boolean value) { ninitial_display_delay_present_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1SequenceHeaderFlags set(
        boolean still_picture,
        boolean reduced_still_picture_header,
        boolean use_128x128_superblock,
        boolean enable_filter_intra,
        boolean enable_intra_edge_filter,
        boolean enable_interintra_compound,
        boolean enable_masked_compound,
        boolean enable_warped_motion,
        boolean enable_dual_filter,
        boolean enable_order_hint,
        boolean enable_jnt_comp,
        boolean enable_ref_frame_mvs,
        boolean frame_id_numbers_present_flag,
        boolean enable_superres,
        boolean enable_cdef,
        boolean enable_restoration,
        boolean film_grain_params_present,
        boolean timing_info_present_flag,
        boolean initial_display_delay_present_flag
    ) {
        still_picture(still_picture);
        reduced_still_picture_header(reduced_still_picture_header);
        use_128x128_superblock(use_128x128_superblock);
        enable_filter_intra(enable_filter_intra);
        enable_intra_edge_filter(enable_intra_edge_filter);
        enable_interintra_compound(enable_interintra_compound);
        enable_masked_compound(enable_masked_compound);
        enable_warped_motion(enable_warped_motion);
        enable_dual_filter(enable_dual_filter);
        enable_order_hint(enable_order_hint);
        enable_jnt_comp(enable_jnt_comp);
        enable_ref_frame_mvs(enable_ref_frame_mvs);
        frame_id_numbers_present_flag(frame_id_numbers_present_flag);
        enable_superres(enable_superres);
        enable_cdef(enable_cdef);
        enable_restoration(enable_restoration);
        film_grain_params_present(film_grain_params_present);
        timing_info_present_flag(timing_info_present_flag);
        initial_display_delay_present_flag(initial_display_delay_present_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1SequenceHeaderFlags set(StdVideoAV1SequenceHeaderFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1SequenceHeaderFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1SequenceHeaderFlags malloc() {
        return new StdVideoAV1SequenceHeaderFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1SequenceHeaderFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1SequenceHeaderFlags calloc() {
        return new StdVideoAV1SequenceHeaderFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1SequenceHeaderFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1SequenceHeaderFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1SequenceHeaderFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1SequenceHeaderFlags} instance for the specified memory address. */
    public static StdVideoAV1SequenceHeaderFlags create(long address) {
        return new StdVideoAV1SequenceHeaderFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1SequenceHeaderFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1SequenceHeaderFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1SequenceHeaderFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeaderFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1SequenceHeaderFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeaderFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1SequenceHeaderFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeaderFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1SequenceHeaderFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeaderFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1SequenceHeaderFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1SequenceHeaderFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1SequenceHeaderFlags malloc(MemoryStack stack) {
        return new StdVideoAV1SequenceHeaderFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1SequenceHeaderFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1SequenceHeaderFlags calloc(MemoryStack stack) {
        return new StdVideoAV1SequenceHeaderFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1SequenceHeaderFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeaderFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1SequenceHeaderFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeaderFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoAV1SequenceHeaderFlags.BITFIELD0); }
    /** Unsafe version of {@link #still_picture}. */
    public static int nstill_picture(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #reduced_still_picture_header}. */
    public static int nreduced_still_picture_header(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #use_128x128_superblock}. */
    public static int nuse_128x128_superblock(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #enable_filter_intra}. */
    public static int nenable_filter_intra(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #enable_intra_edge_filter}. */
    public static int nenable_intra_edge_filter(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #enable_interintra_compound}. */
    public static int nenable_interintra_compound(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #enable_masked_compound}. */
    public static int nenable_masked_compound(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #enable_warped_motion}. */
    public static int nenable_warped_motion(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #enable_dual_filter}. */
    public static int nenable_dual_filter(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }
    /** Unsafe version of {@link #enable_order_hint}. */
    public static int nenable_order_hint(long struct) { return (nbitfield0(struct) & 0x00_00_02_00) >>> 9; }
    /** Unsafe version of {@link #enable_jnt_comp}. */
    public static int nenable_jnt_comp(long struct) { return (nbitfield0(struct) & 0x00_00_04_00) >>> 10; }
    /** Unsafe version of {@link #enable_ref_frame_mvs}. */
    public static int nenable_ref_frame_mvs(long struct) { return (nbitfield0(struct) & 0x00_00_08_00) >>> 11; }
    /** Unsafe version of {@link #frame_id_numbers_present_flag}. */
    public static int nframe_id_numbers_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_10_00) >>> 12; }
    /** Unsafe version of {@link #enable_superres}. */
    public static int nenable_superres(long struct) { return (nbitfield0(struct) & 0x00_00_20_00) >>> 13; }
    /** Unsafe version of {@link #enable_cdef}. */
    public static int nenable_cdef(long struct) { return (nbitfield0(struct) & 0x00_00_40_00) >>> 14; }
    /** Unsafe version of {@link #enable_restoration}. */
    public static int nenable_restoration(long struct) { return (nbitfield0(struct) & 0x00_00_80_00) >>> 15; }
    /** Unsafe version of {@link #film_grain_params_present}. */
    public static int nfilm_grain_params_present(long struct) { return (nbitfield0(struct) & 0x00_01_00_00) >>> 16; }
    /** Unsafe version of {@link #timing_info_present_flag}. */
    public static int ntiming_info_present_flag(long struct) { return (nbitfield0(struct) & 0x00_02_00_00) >>> 17; }
    /** Unsafe version of {@link #initial_display_delay_present_flag}. */
    public static int ninitial_display_delay_present_flag(long struct) { return (nbitfield0(struct) & 0x00_04_00_00) >>> 18; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoAV1SequenceHeaderFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x00_00_1F_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoAV1SequenceHeaderFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #still_picture(boolean) still_picture}. */
    public static void nstill_picture(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #reduced_still_picture_header(boolean) reduced_still_picture_header}. */
    public static void nreduced_still_picture_header(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #use_128x128_superblock(boolean) use_128x128_superblock}. */
    public static void nuse_128x128_superblock(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #enable_filter_intra(boolean) enable_filter_intra}. */
    public static void nenable_filter_intra(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #enable_intra_edge_filter(boolean) enable_intra_edge_filter}. */
    public static void nenable_intra_edge_filter(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #enable_interintra_compound(boolean) enable_interintra_compound}. */
    public static void nenable_interintra_compound(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #enable_masked_compound(boolean) enable_masked_compound}. */
    public static void nenable_masked_compound(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #enable_warped_motion(boolean) enable_warped_motion}. */
    public static void nenable_warped_motion(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #enable_dual_filter(boolean) enable_dual_filter}. */
    public static void nenable_dual_filter(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }
    /** Unsafe version of {@link #enable_order_hint(boolean) enable_order_hint}. */
    public static void nenable_order_hint(long struct, int value) { nbitfield0(struct, ((value << 9) & 0x00_00_02_00) | (nbitfield0(struct) & 0xFF_FF_FD_FF)); }
    /** Unsafe version of {@link #enable_jnt_comp(boolean) enable_jnt_comp}. */
    public static void nenable_jnt_comp(long struct, int value) { nbitfield0(struct, ((value << 10) & 0x00_00_04_00) | (nbitfield0(struct) & 0xFF_FF_FB_FF)); }
    /** Unsafe version of {@link #enable_ref_frame_mvs(boolean) enable_ref_frame_mvs}. */
    public static void nenable_ref_frame_mvs(long struct, int value) { nbitfield0(struct, ((value << 11) & 0x00_00_08_00) | (nbitfield0(struct) & 0xFF_FF_F7_FF)); }
    /** Unsafe version of {@link #frame_id_numbers_present_flag(boolean) frame_id_numbers_present_flag}. */
    public static void nframe_id_numbers_present_flag(long struct, int value) { nbitfield0(struct, ((value << 12) & 0x00_00_10_00) | (nbitfield0(struct) & 0xFF_FF_EF_FF)); }
    /** Unsafe version of {@link #enable_superres(boolean) enable_superres}. */
    public static void nenable_superres(long struct, int value) { nbitfield0(struct, ((value << 13) & 0x00_00_20_00) | (nbitfield0(struct) & 0xFF_FF_DF_FF)); }
    /** Unsafe version of {@link #enable_cdef(boolean) enable_cdef}. */
    public static void nenable_cdef(long struct, int value) { nbitfield0(struct, ((value << 14) & 0x00_00_40_00) | (nbitfield0(struct) & 0xFF_FF_BF_FF)); }
    /** Unsafe version of {@link #enable_restoration(boolean) enable_restoration}. */
    public static void nenable_restoration(long struct, int value) { nbitfield0(struct, ((value << 15) & 0x00_00_80_00) | (nbitfield0(struct) & 0xFF_FF_7F_FF)); }
    /** Unsafe version of {@link #film_grain_params_present(boolean) film_grain_params_present}. */
    public static void nfilm_grain_params_present(long struct, int value) { nbitfield0(struct, ((value << 16) & 0x00_01_00_00) | (nbitfield0(struct) & 0xFF_FE_FF_FF)); }
    /** Unsafe version of {@link #timing_info_present_flag(boolean) timing_info_present_flag}. */
    public static void ntiming_info_present_flag(long struct, int value) { nbitfield0(struct, ((value << 17) & 0x00_02_00_00) | (nbitfield0(struct) & 0xFF_FD_FF_FF)); }
    /** Unsafe version of {@link #initial_display_delay_present_flag(boolean) initial_display_delay_present_flag}. */
    public static void ninitial_display_delay_present_flag(long struct, int value) { nbitfield0(struct, ((value << 18) & 0x00_04_00_00) | (nbitfield0(struct) & 0xFF_FB_FF_FF)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoAV1SequenceHeaderFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xFF_FF_E0_00) | (value & 0x00_00_1F_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoAV1SequenceHeaderFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1SequenceHeaderFlags, Buffer> implements NativeResource {

        private static final StdVideoAV1SequenceHeaderFlags ELEMENT_FACTORY = StdVideoAV1SequenceHeaderFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1SequenceHeaderFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1SequenceHeaderFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected StdVideoAV1SequenceHeaderFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code still_picture} field. */
        @NativeType("uint32_t")
        public boolean still_picture() { return StdVideoAV1SequenceHeaderFlags.nstill_picture(address()) != 0; }
        /** @return the value of the {@code reduced_still_picture_header} field. */
        @NativeType("uint32_t")
        public boolean reduced_still_picture_header() { return StdVideoAV1SequenceHeaderFlags.nreduced_still_picture_header(address()) != 0; }
        /** @return the value of the {@code use_128x128_superblock} field. */
        @NativeType("uint32_t")
        public boolean use_128x128_superblock() { return StdVideoAV1SequenceHeaderFlags.nuse_128x128_superblock(address()) != 0; }
        /** @return the value of the {@code enable_filter_intra} field. */
        @NativeType("uint32_t")
        public boolean enable_filter_intra() { return StdVideoAV1SequenceHeaderFlags.nenable_filter_intra(address()) != 0; }
        /** @return the value of the {@code enable_intra_edge_filter} field. */
        @NativeType("uint32_t")
        public boolean enable_intra_edge_filter() { return StdVideoAV1SequenceHeaderFlags.nenable_intra_edge_filter(address()) != 0; }
        /** @return the value of the {@code enable_interintra_compound} field. */
        @NativeType("uint32_t")
        public boolean enable_interintra_compound() { return StdVideoAV1SequenceHeaderFlags.nenable_interintra_compound(address()) != 0; }
        /** @return the value of the {@code enable_masked_compound} field. */
        @NativeType("uint32_t")
        public boolean enable_masked_compound() { return StdVideoAV1SequenceHeaderFlags.nenable_masked_compound(address()) != 0; }
        /** @return the value of the {@code enable_warped_motion} field. */
        @NativeType("uint32_t")
        public boolean enable_warped_motion() { return StdVideoAV1SequenceHeaderFlags.nenable_warped_motion(address()) != 0; }
        /** @return the value of the {@code enable_dual_filter} field. */
        @NativeType("uint32_t")
        public boolean enable_dual_filter() { return StdVideoAV1SequenceHeaderFlags.nenable_dual_filter(address()) != 0; }
        /** @return the value of the {@code enable_order_hint} field. */
        @NativeType("uint32_t")
        public boolean enable_order_hint() { return StdVideoAV1SequenceHeaderFlags.nenable_order_hint(address()) != 0; }
        /** @return the value of the {@code enable_jnt_comp} field. */
        @NativeType("uint32_t")
        public boolean enable_jnt_comp() { return StdVideoAV1SequenceHeaderFlags.nenable_jnt_comp(address()) != 0; }
        /** @return the value of the {@code enable_ref_frame_mvs} field. */
        @NativeType("uint32_t")
        public boolean enable_ref_frame_mvs() { return StdVideoAV1SequenceHeaderFlags.nenable_ref_frame_mvs(address()) != 0; }
        /** @return the value of the {@code frame_id_numbers_present_flag} field. */
        @NativeType("uint32_t")
        public boolean frame_id_numbers_present_flag() { return StdVideoAV1SequenceHeaderFlags.nframe_id_numbers_present_flag(address()) != 0; }
        /** @return the value of the {@code enable_superres} field. */
        @NativeType("uint32_t")
        public boolean enable_superres() { return StdVideoAV1SequenceHeaderFlags.nenable_superres(address()) != 0; }
        /** @return the value of the {@code enable_cdef} field. */
        @NativeType("uint32_t")
        public boolean enable_cdef() { return StdVideoAV1SequenceHeaderFlags.nenable_cdef(address()) != 0; }
        /** @return the value of the {@code enable_restoration} field. */
        @NativeType("uint32_t")
        public boolean enable_restoration() { return StdVideoAV1SequenceHeaderFlags.nenable_restoration(address()) != 0; }
        /** @return the value of the {@code film_grain_params_present} field. */
        @NativeType("uint32_t")
        public boolean film_grain_params_present() { return StdVideoAV1SequenceHeaderFlags.nfilm_grain_params_present(address()) != 0; }
        /** @return the value of the {@code timing_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean timing_info_present_flag() { return StdVideoAV1SequenceHeaderFlags.ntiming_info_present_flag(address()) != 0; }
        /** @return the value of the {@code initial_display_delay_present_flag} field. */
        @NativeType("uint32_t")
        public boolean initial_display_delay_present_flag() { return StdVideoAV1SequenceHeaderFlags.ninitial_display_delay_present_flag(address()) != 0; }

        /** Sets the specified value to the {@code still_picture} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer still_picture(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nstill_picture(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code reduced_still_picture_header} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer reduced_still_picture_header(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nreduced_still_picture_header(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code use_128x128_superblock} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer use_128x128_superblock(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nuse_128x128_superblock(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_filter_intra} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_filter_intra(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_filter_intra(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_intra_edge_filter} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_intra_edge_filter(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_intra_edge_filter(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_interintra_compound} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_interintra_compound(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_interintra_compound(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_masked_compound} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_masked_compound(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_masked_compound(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_warped_motion} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_warped_motion(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_warped_motion(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_dual_filter} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_dual_filter(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_dual_filter(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_order_hint} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_order_hint(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_order_hint(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_jnt_comp} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_jnt_comp(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_jnt_comp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_ref_frame_mvs} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_ref_frame_mvs(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_ref_frame_mvs(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code frame_id_numbers_present_flag} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer frame_id_numbers_present_flag(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nframe_id_numbers_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_superres} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_superres(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_superres(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_cdef} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_cdef(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_cdef(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code enable_restoration} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer enable_restoration(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nenable_restoration(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code film_grain_params_present} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer film_grain_params_present(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.nfilm_grain_params_present(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code timing_info_present_flag} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer timing_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.ntiming_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code initial_display_delay_present_flag} field. */
        public StdVideoAV1SequenceHeaderFlags.Buffer initial_display_delay_present_flag(@NativeType("uint32_t") boolean value) { StdVideoAV1SequenceHeaderFlags.ninitial_display_delay_present_flag(address(), value ? 1 : 0); return this; }

    }

}