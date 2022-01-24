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
 * struct StdVideoH265SpsVuiFlags {
 *     uint32_t aspect_ratio_info_present_flag : 1;
 *     uint32_t overscan_info_present_flag : 1;
 *     uint32_t overscan_appropriate_flag : 1;
 *     uint32_t video_signal_type_present_flag : 1;
 *     uint32_t video_full_range_flag : 1;
 *     uint32_t colour_description_present_flag : 1;
 *     uint32_t chroma_loc_info_present_flag : 1;
 *     uint32_t neutral_chroma_indication_flag : 1;
 *     uint32_t field_seq_flag : 1;
 *     uint32_t frame_field_info_present_flag : 1;
 *     uint32_t default_display_window_flag : 1;
 *     uint32_t vui_timing_info_present_flag : 1;
 *     uint32_t vui_poc_proportional_to_timing_flag : 1;
 *     uint32_t vui_hrd_parameters_present_flag : 1;
 *     uint32_t bitstream_restriction_flag : 1;
 *     uint32_t tiles_fixed_structure_flag : 1;
 *     uint32_t motion_vectors_over_pic_boundaries_flag : 1;
 *     uint32_t restricted_ref_pic_lists_flag : 1;
 * }</code></pre>
 */
public class StdVideoH265SpsVuiFlags extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
    }

    /**
     * Creates a {@code StdVideoH265SpsVuiFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265SpsVuiFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aspect_ratio_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean aspect_ratio_info_present_flag() { return naspect_ratio_info_present_flag(address()) != 0; }
    /** @return the value of the {@code overscan_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean overscan_info_present_flag() { return noverscan_info_present_flag(address()) != 0; }
    /** @return the value of the {@code overscan_appropriate_flag} field. */
    @NativeType("uint32_t")
    public boolean overscan_appropriate_flag() { return noverscan_appropriate_flag(address()) != 0; }
    /** @return the value of the {@code video_signal_type_present_flag} field. */
    @NativeType("uint32_t")
    public boolean video_signal_type_present_flag() { return nvideo_signal_type_present_flag(address()) != 0; }
    /** @return the value of the {@code video_full_range_flag} field. */
    @NativeType("uint32_t")
    public boolean video_full_range_flag() { return nvideo_full_range_flag(address()) != 0; }
    /** @return the value of the {@code colour_description_present_flag} field. */
    @NativeType("uint32_t")
    public boolean colour_description_present_flag() { return ncolour_description_present_flag(address()) != 0; }
    /** @return the value of the {@code chroma_loc_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean chroma_loc_info_present_flag() { return nchroma_loc_info_present_flag(address()) != 0; }
    /** @return the value of the {@code neutral_chroma_indication_flag} field. */
    @NativeType("uint32_t")
    public boolean neutral_chroma_indication_flag() { return nneutral_chroma_indication_flag(address()) != 0; }
    /** @return the value of the {@code field_seq_flag} field. */
    @NativeType("uint32_t")
    public boolean field_seq_flag() { return nfield_seq_flag(address()) != 0; }
    /** @return the value of the {@code frame_field_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean frame_field_info_present_flag() { return nframe_field_info_present_flag(address()) != 0; }
    /** @return the value of the {@code default_display_window_flag} field. */
    @NativeType("uint32_t")
    public boolean default_display_window_flag() { return ndefault_display_window_flag(address()) != 0; }
    /** @return the value of the {@code vui_timing_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean vui_timing_info_present_flag() { return nvui_timing_info_present_flag(address()) != 0; }
    /** @return the value of the {@code vui_poc_proportional_to_timing_flag} field. */
    @NativeType("uint32_t")
    public boolean vui_poc_proportional_to_timing_flag() { return nvui_poc_proportional_to_timing_flag(address()) != 0; }
    /** @return the value of the {@code vui_hrd_parameters_present_flag} field. */
    @NativeType("uint32_t")
    public boolean vui_hrd_parameters_present_flag() { return nvui_hrd_parameters_present_flag(address()) != 0; }
    /** @return the value of the {@code bitstream_restriction_flag} field. */
    @NativeType("uint32_t")
    public boolean bitstream_restriction_flag() { return nbitstream_restriction_flag(address()) != 0; }
    /** @return the value of the {@code tiles_fixed_structure_flag} field. */
    @NativeType("uint32_t")
    public boolean tiles_fixed_structure_flag() { return ntiles_fixed_structure_flag(address()) != 0; }
    /** @return the value of the {@code motion_vectors_over_pic_boundaries_flag} field. */
    @NativeType("uint32_t")
    public boolean motion_vectors_over_pic_boundaries_flag() { return nmotion_vectors_over_pic_boundaries_flag(address()) != 0; }
    /** @return the value of the {@code restricted_ref_pic_lists_flag} field. */
    @NativeType("uint32_t")
    public boolean restricted_ref_pic_lists_flag() { return nrestricted_ref_pic_lists_flag(address()) != 0; }

    /** Sets the specified value to the {@code aspect_ratio_info_present_flag} field. */
    public StdVideoH265SpsVuiFlags aspect_ratio_info_present_flag(@NativeType("uint32_t") boolean value) { naspect_ratio_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code overscan_info_present_flag} field. */
    public StdVideoH265SpsVuiFlags overscan_info_present_flag(@NativeType("uint32_t") boolean value) { noverscan_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code overscan_appropriate_flag} field. */
    public StdVideoH265SpsVuiFlags overscan_appropriate_flag(@NativeType("uint32_t") boolean value) { noverscan_appropriate_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code video_signal_type_present_flag} field. */
    public StdVideoH265SpsVuiFlags video_signal_type_present_flag(@NativeType("uint32_t") boolean value) { nvideo_signal_type_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code video_full_range_flag} field. */
    public StdVideoH265SpsVuiFlags video_full_range_flag(@NativeType("uint32_t") boolean value) { nvideo_full_range_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code colour_description_present_flag} field. */
    public StdVideoH265SpsVuiFlags colour_description_present_flag(@NativeType("uint32_t") boolean value) { ncolour_description_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code chroma_loc_info_present_flag} field. */
    public StdVideoH265SpsVuiFlags chroma_loc_info_present_flag(@NativeType("uint32_t") boolean value) { nchroma_loc_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code neutral_chroma_indication_flag} field. */
    public StdVideoH265SpsVuiFlags neutral_chroma_indication_flag(@NativeType("uint32_t") boolean value) { nneutral_chroma_indication_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code field_seq_flag} field. */
    public StdVideoH265SpsVuiFlags field_seq_flag(@NativeType("uint32_t") boolean value) { nfield_seq_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code frame_field_info_present_flag} field. */
    public StdVideoH265SpsVuiFlags frame_field_info_present_flag(@NativeType("uint32_t") boolean value) { nframe_field_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code default_display_window_flag} field. */
    public StdVideoH265SpsVuiFlags default_display_window_flag(@NativeType("uint32_t") boolean value) { ndefault_display_window_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vui_timing_info_present_flag} field. */
    public StdVideoH265SpsVuiFlags vui_timing_info_present_flag(@NativeType("uint32_t") boolean value) { nvui_timing_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vui_poc_proportional_to_timing_flag} field. */
    public StdVideoH265SpsVuiFlags vui_poc_proportional_to_timing_flag(@NativeType("uint32_t") boolean value) { nvui_poc_proportional_to_timing_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vui_hrd_parameters_present_flag} field. */
    public StdVideoH265SpsVuiFlags vui_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) { nvui_hrd_parameters_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bitstream_restriction_flag} field. */
    public StdVideoH265SpsVuiFlags bitstream_restriction_flag(@NativeType("uint32_t") boolean value) { nbitstream_restriction_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tiles_fixed_structure_flag} field. */
    public StdVideoH265SpsVuiFlags tiles_fixed_structure_flag(@NativeType("uint32_t") boolean value) { ntiles_fixed_structure_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code motion_vectors_over_pic_boundaries_flag} field. */
    public StdVideoH265SpsVuiFlags motion_vectors_over_pic_boundaries_flag(@NativeType("uint32_t") boolean value) { nmotion_vectors_over_pic_boundaries_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code restricted_ref_pic_lists_flag} field. */
    public StdVideoH265SpsVuiFlags restricted_ref_pic_lists_flag(@NativeType("uint32_t") boolean value) { nrestricted_ref_pic_lists_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265SpsVuiFlags set(
        boolean aspect_ratio_info_present_flag,
        boolean overscan_info_present_flag,
        boolean overscan_appropriate_flag,
        boolean video_signal_type_present_flag,
        boolean video_full_range_flag,
        boolean colour_description_present_flag,
        boolean chroma_loc_info_present_flag,
        boolean neutral_chroma_indication_flag,
        boolean field_seq_flag,
        boolean frame_field_info_present_flag,
        boolean default_display_window_flag,
        boolean vui_timing_info_present_flag,
        boolean vui_poc_proportional_to_timing_flag,
        boolean vui_hrd_parameters_present_flag,
        boolean bitstream_restriction_flag,
        boolean tiles_fixed_structure_flag,
        boolean motion_vectors_over_pic_boundaries_flag,
        boolean restricted_ref_pic_lists_flag
    ) {
        aspect_ratio_info_present_flag(aspect_ratio_info_present_flag);
        overscan_info_present_flag(overscan_info_present_flag);
        overscan_appropriate_flag(overscan_appropriate_flag);
        video_signal_type_present_flag(video_signal_type_present_flag);
        video_full_range_flag(video_full_range_flag);
        colour_description_present_flag(colour_description_present_flag);
        chroma_loc_info_present_flag(chroma_loc_info_present_flag);
        neutral_chroma_indication_flag(neutral_chroma_indication_flag);
        field_seq_flag(field_seq_flag);
        frame_field_info_present_flag(frame_field_info_present_flag);
        default_display_window_flag(default_display_window_flag);
        vui_timing_info_present_flag(vui_timing_info_present_flag);
        vui_poc_proportional_to_timing_flag(vui_poc_proportional_to_timing_flag);
        vui_hrd_parameters_present_flag(vui_hrd_parameters_present_flag);
        bitstream_restriction_flag(bitstream_restriction_flag);
        tiles_fixed_structure_flag(tiles_fixed_structure_flag);
        motion_vectors_over_pic_boundaries_flag(motion_vectors_over_pic_boundaries_flag);
        restricted_ref_pic_lists_flag(restricted_ref_pic_lists_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265SpsVuiFlags set(StdVideoH265SpsVuiFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265SpsVuiFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265SpsVuiFlags malloc() {
        return wrap(StdVideoH265SpsVuiFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH265SpsVuiFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265SpsVuiFlags calloc() {
        return wrap(StdVideoH265SpsVuiFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH265SpsVuiFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265SpsVuiFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH265SpsVuiFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265SpsVuiFlags} instance for the specified memory address. */
    public static StdVideoH265SpsVuiFlags create(long address) {
        return wrap(StdVideoH265SpsVuiFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265SpsVuiFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH265SpsVuiFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoH265SpsVuiFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsVuiFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SpsVuiFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsVuiFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SpsVuiFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsVuiFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH265SpsVuiFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsVuiFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265SpsVuiFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265SpsVuiFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265SpsVuiFlags malloc(MemoryStack stack) {
        return wrap(StdVideoH265SpsVuiFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH265SpsVuiFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265SpsVuiFlags calloc(MemoryStack stack) {
        return wrap(StdVideoH265SpsVuiFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH265SpsVuiFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsVuiFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SpsVuiFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsVuiFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SpsVuiFlags.BITFIELD0); }
    /** Unsafe version of {@link #aspect_ratio_info_present_flag}. */
    public static int naspect_ratio_info_present_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #overscan_info_present_flag}. */
    public static int noverscan_info_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #overscan_appropriate_flag}. */
    public static int noverscan_appropriate_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #video_signal_type_present_flag}. */
    public static int nvideo_signal_type_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #video_full_range_flag}. */
    public static int nvideo_full_range_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #colour_description_present_flag}. */
    public static int ncolour_description_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #chroma_loc_info_present_flag}. */
    public static int nchroma_loc_info_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #neutral_chroma_indication_flag}. */
    public static int nneutral_chroma_indication_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #field_seq_flag}. */
    public static int nfield_seq_flag(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }
    /** Unsafe version of {@link #frame_field_info_present_flag}. */
    public static int nframe_field_info_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_02_00) >>> 9; }
    /** Unsafe version of {@link #default_display_window_flag}. */
    public static int ndefault_display_window_flag(long struct) { return (nbitfield0(struct) & 0x00_00_04_00) >>> 10; }
    /** Unsafe version of {@link #vui_timing_info_present_flag}. */
    public static int nvui_timing_info_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_08_00) >>> 11; }
    /** Unsafe version of {@link #vui_poc_proportional_to_timing_flag}. */
    public static int nvui_poc_proportional_to_timing_flag(long struct) { return (nbitfield0(struct) & 0x00_00_10_00) >>> 12; }
    /** Unsafe version of {@link #vui_hrd_parameters_present_flag}. */
    public static int nvui_hrd_parameters_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_20_00) >>> 13; }
    /** Unsafe version of {@link #bitstream_restriction_flag}. */
    public static int nbitstream_restriction_flag(long struct) { return (nbitfield0(struct) & 0x00_00_40_00) >>> 14; }
    /** Unsafe version of {@link #tiles_fixed_structure_flag}. */
    public static int ntiles_fixed_structure_flag(long struct) { return (nbitfield0(struct) & 0x00_00_80_00) >>> 15; }
    /** Unsafe version of {@link #motion_vectors_over_pic_boundaries_flag}. */
    public static int nmotion_vectors_over_pic_boundaries_flag(long struct) { return (nbitfield0(struct) & 0x00_01_00_00) >>> 16; }
    /** Unsafe version of {@link #restricted_ref_pic_lists_flag}. */
    public static int nrestricted_ref_pic_lists_flag(long struct) { return (nbitfield0(struct) & 0x00_02_00_00) >>> 17; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SpsVuiFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #aspect_ratio_info_present_flag(boolean) aspect_ratio_info_present_flag}. */
    public static void naspect_ratio_info_present_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #overscan_info_present_flag(boolean) overscan_info_present_flag}. */
    public static void noverscan_info_present_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #overscan_appropriate_flag(boolean) overscan_appropriate_flag}. */
    public static void noverscan_appropriate_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #video_signal_type_present_flag(boolean) video_signal_type_present_flag}. */
    public static void nvideo_signal_type_present_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #video_full_range_flag(boolean) video_full_range_flag}. */
    public static void nvideo_full_range_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #colour_description_present_flag(boolean) colour_description_present_flag}. */
    public static void ncolour_description_present_flag(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #chroma_loc_info_present_flag(boolean) chroma_loc_info_present_flag}. */
    public static void nchroma_loc_info_present_flag(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #neutral_chroma_indication_flag(boolean) neutral_chroma_indication_flag}. */
    public static void nneutral_chroma_indication_flag(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #field_seq_flag(boolean) field_seq_flag}. */
    public static void nfield_seq_flag(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }
    /** Unsafe version of {@link #frame_field_info_present_flag(boolean) frame_field_info_present_flag}. */
    public static void nframe_field_info_present_flag(long struct, int value) { nbitfield0(struct, ((value << 9) & 0x00_00_02_00) | (nbitfield0(struct) & 0xFF_FF_FD_FF)); }
    /** Unsafe version of {@link #default_display_window_flag(boolean) default_display_window_flag}. */
    public static void ndefault_display_window_flag(long struct, int value) { nbitfield0(struct, ((value << 10) & 0x00_00_04_00) | (nbitfield0(struct) & 0xFF_FF_FB_FF)); }
    /** Unsafe version of {@link #vui_timing_info_present_flag(boolean) vui_timing_info_present_flag}. */
    public static void nvui_timing_info_present_flag(long struct, int value) { nbitfield0(struct, ((value << 11) & 0x00_00_08_00) | (nbitfield0(struct) & 0xFF_FF_F7_FF)); }
    /** Unsafe version of {@link #vui_poc_proportional_to_timing_flag(boolean) vui_poc_proportional_to_timing_flag}. */
    public static void nvui_poc_proportional_to_timing_flag(long struct, int value) { nbitfield0(struct, ((value << 12) & 0x00_00_10_00) | (nbitfield0(struct) & 0xFF_FF_EF_FF)); }
    /** Unsafe version of {@link #vui_hrd_parameters_present_flag(boolean) vui_hrd_parameters_present_flag}. */
    public static void nvui_hrd_parameters_present_flag(long struct, int value) { nbitfield0(struct, ((value << 13) & 0x00_00_20_00) | (nbitfield0(struct) & 0xFF_FF_DF_FF)); }
    /** Unsafe version of {@link #bitstream_restriction_flag(boolean) bitstream_restriction_flag}. */
    public static void nbitstream_restriction_flag(long struct, int value) { nbitfield0(struct, ((value << 14) & 0x00_00_40_00) | (nbitfield0(struct) & 0xFF_FF_BF_FF)); }
    /** Unsafe version of {@link #tiles_fixed_structure_flag(boolean) tiles_fixed_structure_flag}. */
    public static void ntiles_fixed_structure_flag(long struct, int value) { nbitfield0(struct, ((value << 15) & 0x00_00_80_00) | (nbitfield0(struct) & 0xFF_FF_7F_FF)); }
    /** Unsafe version of {@link #motion_vectors_over_pic_boundaries_flag(boolean) motion_vectors_over_pic_boundaries_flag}. */
    public static void nmotion_vectors_over_pic_boundaries_flag(long struct, int value) { nbitfield0(struct, ((value << 16) & 0x00_01_00_00) | (nbitfield0(struct) & 0xFF_FE_FF_FF)); }
    /** Unsafe version of {@link #restricted_ref_pic_lists_flag(boolean) restricted_ref_pic_lists_flag}. */
    public static void nrestricted_ref_pic_lists_flag(long struct, int value) { nbitfield0(struct, ((value << 17) & 0x00_02_00_00) | (nbitfield0(struct) & 0xFF_FD_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoH265SpsVuiFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265SpsVuiFlags, Buffer> implements NativeResource {

        private static final StdVideoH265SpsVuiFlags ELEMENT_FACTORY = StdVideoH265SpsVuiFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoH265SpsVuiFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265SpsVuiFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH265SpsVuiFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aspect_ratio_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean aspect_ratio_info_present_flag() { return StdVideoH265SpsVuiFlags.naspect_ratio_info_present_flag(address()) != 0; }
        /** @return the value of the {@code overscan_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean overscan_info_present_flag() { return StdVideoH265SpsVuiFlags.noverscan_info_present_flag(address()) != 0; }
        /** @return the value of the {@code overscan_appropriate_flag} field. */
        @NativeType("uint32_t")
        public boolean overscan_appropriate_flag() { return StdVideoH265SpsVuiFlags.noverscan_appropriate_flag(address()) != 0; }
        /** @return the value of the {@code video_signal_type_present_flag} field. */
        @NativeType("uint32_t")
        public boolean video_signal_type_present_flag() { return StdVideoH265SpsVuiFlags.nvideo_signal_type_present_flag(address()) != 0; }
        /** @return the value of the {@code video_full_range_flag} field. */
        @NativeType("uint32_t")
        public boolean video_full_range_flag() { return StdVideoH265SpsVuiFlags.nvideo_full_range_flag(address()) != 0; }
        /** @return the value of the {@code colour_description_present_flag} field. */
        @NativeType("uint32_t")
        public boolean colour_description_present_flag() { return StdVideoH265SpsVuiFlags.ncolour_description_present_flag(address()) != 0; }
        /** @return the value of the {@code chroma_loc_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean chroma_loc_info_present_flag() { return StdVideoH265SpsVuiFlags.nchroma_loc_info_present_flag(address()) != 0; }
        /** @return the value of the {@code neutral_chroma_indication_flag} field. */
        @NativeType("uint32_t")
        public boolean neutral_chroma_indication_flag() { return StdVideoH265SpsVuiFlags.nneutral_chroma_indication_flag(address()) != 0; }
        /** @return the value of the {@code field_seq_flag} field. */
        @NativeType("uint32_t")
        public boolean field_seq_flag() { return StdVideoH265SpsVuiFlags.nfield_seq_flag(address()) != 0; }
        /** @return the value of the {@code frame_field_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean frame_field_info_present_flag() { return StdVideoH265SpsVuiFlags.nframe_field_info_present_flag(address()) != 0; }
        /** @return the value of the {@code default_display_window_flag} field. */
        @NativeType("uint32_t")
        public boolean default_display_window_flag() { return StdVideoH265SpsVuiFlags.ndefault_display_window_flag(address()) != 0; }
        /** @return the value of the {@code vui_timing_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean vui_timing_info_present_flag() { return StdVideoH265SpsVuiFlags.nvui_timing_info_present_flag(address()) != 0; }
        /** @return the value of the {@code vui_poc_proportional_to_timing_flag} field. */
        @NativeType("uint32_t")
        public boolean vui_poc_proportional_to_timing_flag() { return StdVideoH265SpsVuiFlags.nvui_poc_proportional_to_timing_flag(address()) != 0; }
        /** @return the value of the {@code vui_hrd_parameters_present_flag} field. */
        @NativeType("uint32_t")
        public boolean vui_hrd_parameters_present_flag() { return StdVideoH265SpsVuiFlags.nvui_hrd_parameters_present_flag(address()) != 0; }
        /** @return the value of the {@code bitstream_restriction_flag} field. */
        @NativeType("uint32_t")
        public boolean bitstream_restriction_flag() { return StdVideoH265SpsVuiFlags.nbitstream_restriction_flag(address()) != 0; }
        /** @return the value of the {@code tiles_fixed_structure_flag} field. */
        @NativeType("uint32_t")
        public boolean tiles_fixed_structure_flag() { return StdVideoH265SpsVuiFlags.ntiles_fixed_structure_flag(address()) != 0; }
        /** @return the value of the {@code motion_vectors_over_pic_boundaries_flag} field. */
        @NativeType("uint32_t")
        public boolean motion_vectors_over_pic_boundaries_flag() { return StdVideoH265SpsVuiFlags.nmotion_vectors_over_pic_boundaries_flag(address()) != 0; }
        /** @return the value of the {@code restricted_ref_pic_lists_flag} field. */
        @NativeType("uint32_t")
        public boolean restricted_ref_pic_lists_flag() { return StdVideoH265SpsVuiFlags.nrestricted_ref_pic_lists_flag(address()) != 0; }

        /** Sets the specified value to the {@code aspect_ratio_info_present_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer aspect_ratio_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.naspect_ratio_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code overscan_info_present_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer overscan_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.noverscan_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code overscan_appropriate_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer overscan_appropriate_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.noverscan_appropriate_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code video_signal_type_present_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer video_signal_type_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nvideo_signal_type_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code video_full_range_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer video_full_range_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nvideo_full_range_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code colour_description_present_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer colour_description_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.ncolour_description_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code chroma_loc_info_present_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer chroma_loc_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nchroma_loc_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code neutral_chroma_indication_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer neutral_chroma_indication_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nneutral_chroma_indication_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code field_seq_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer field_seq_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nfield_seq_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code frame_field_info_present_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer frame_field_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nframe_field_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code default_display_window_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer default_display_window_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.ndefault_display_window_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vui_timing_info_present_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer vui_timing_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nvui_timing_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vui_poc_proportional_to_timing_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer vui_poc_proportional_to_timing_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nvui_poc_proportional_to_timing_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vui_hrd_parameters_present_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer vui_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nvui_hrd_parameters_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bitstream_restriction_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer bitstream_restriction_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nbitstream_restriction_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tiles_fixed_structure_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer tiles_fixed_structure_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.ntiles_fixed_structure_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code motion_vectors_over_pic_boundaries_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer motion_vectors_over_pic_boundaries_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nmotion_vectors_over_pic_boundaries_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code restricted_ref_pic_lists_flag} field. */
        public StdVideoH265SpsVuiFlags.Buffer restricted_ref_pic_lists_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsVuiFlags.nrestricted_ref_pic_lists_flag(address(), value ? 1 : 0); return this; }

    }

}