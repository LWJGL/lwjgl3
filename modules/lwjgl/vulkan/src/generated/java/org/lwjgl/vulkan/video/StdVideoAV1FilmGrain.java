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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*;

/**
 * <pre>{@code
 * struct StdVideoAV1FilmGrain {
 *     {@link StdVideoAV1FilmGrainFlags StdVideoAV1FilmGrainFlags} flags;
 *     uint8_t grain_scaling_minus_8;
 *     uint8_t ar_coeff_lag;
 *     uint8_t ar_coeff_shift_minus_6;
 *     uint8_t grain_scale_shift;
 *     uint16_t grain_seed;
 *     uint8_t film_grain_params_ref_idx;
 *     uint8_t num_y_points;
 *     uint8_t point_y_value[STD_VIDEO_AV1_MAX_NUM_Y_POINTS];
 *     uint8_t point_y_scaling[STD_VIDEO_AV1_MAX_NUM_Y_POINTS];
 *     uint8_t num_cb_points;
 *     uint8_t point_cb_value[STD_VIDEO_AV1_MAX_NUM_CB_POINTS];
 *     uint8_t point_cb_scaling[STD_VIDEO_AV1_MAX_NUM_CB_POINTS];
 *     uint8_t num_cr_points;
 *     uint8_t point_cr_value[STD_VIDEO_AV1_MAX_NUM_CR_POINTS];
 *     uint8_t point_cr_scaling[STD_VIDEO_AV1_MAX_NUM_CR_POINTS];
 *     int8_t ar_coeffs_y_plus_128[STD_VIDEO_AV1_MAX_NUM_POS_LUMA];
 *     int8_t ar_coeffs_cb_plus_128[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA];
 *     int8_t ar_coeffs_cr_plus_128[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA];
 *     uint8_t cb_mult;
 *     uint8_t cb_luma_mult;
 *     uint16_t cb_offset;
 *     uint8_t cr_mult;
 *     uint8_t cr_luma_mult;
 *     uint16_t cr_offset;
 * }}</pre>
 */
public class StdVideoAV1FilmGrain extends Struct<StdVideoAV1FilmGrain> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        GRAIN_SCALING_MINUS_8,
        AR_COEFF_LAG,
        AR_COEFF_SHIFT_MINUS_6,
        GRAIN_SCALE_SHIFT,
        GRAIN_SEED,
        FILM_GRAIN_PARAMS_REF_IDX,
        NUM_Y_POINTS,
        POINT_Y_VALUE,
        POINT_Y_SCALING,
        NUM_CB_POINTS,
        POINT_CB_VALUE,
        POINT_CB_SCALING,
        NUM_CR_POINTS,
        POINT_CR_VALUE,
        POINT_CR_SCALING,
        AR_COEFFS_Y_PLUS_128,
        AR_COEFFS_CB_PLUS_128,
        AR_COEFFS_CR_PLUS_128,
        CB_MULT,
        CB_LUMA_MULT,
        CB_OFFSET,
        CR_MULT,
        CR_LUMA_MULT,
        CR_OFFSET;

    static {
        Layout layout = __struct(
            __member(StdVideoAV1FilmGrainFlags.SIZEOF, StdVideoAV1FilmGrainFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(2),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_AV1_MAX_NUM_Y_POINTS),
            __array(1, STD_VIDEO_AV1_MAX_NUM_Y_POINTS),
            __member(1),
            __array(1, STD_VIDEO_AV1_MAX_NUM_CB_POINTS),
            __array(1, STD_VIDEO_AV1_MAX_NUM_CB_POINTS),
            __member(1),
            __array(1, STD_VIDEO_AV1_MAX_NUM_CR_POINTS),
            __array(1, STD_VIDEO_AV1_MAX_NUM_CR_POINTS),
            __array(1, STD_VIDEO_AV1_MAX_NUM_POS_LUMA),
            __array(1, STD_VIDEO_AV1_MAX_NUM_POS_CHROMA),
            __array(1, STD_VIDEO_AV1_MAX_NUM_POS_CHROMA),
            __member(1),
            __member(1),
            __member(2),
            __member(1),
            __member(1),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        GRAIN_SCALING_MINUS_8 = layout.offsetof(1);
        AR_COEFF_LAG = layout.offsetof(2);
        AR_COEFF_SHIFT_MINUS_6 = layout.offsetof(3);
        GRAIN_SCALE_SHIFT = layout.offsetof(4);
        GRAIN_SEED = layout.offsetof(5);
        FILM_GRAIN_PARAMS_REF_IDX = layout.offsetof(6);
        NUM_Y_POINTS = layout.offsetof(7);
        POINT_Y_VALUE = layout.offsetof(8);
        POINT_Y_SCALING = layout.offsetof(9);
        NUM_CB_POINTS = layout.offsetof(10);
        POINT_CB_VALUE = layout.offsetof(11);
        POINT_CB_SCALING = layout.offsetof(12);
        NUM_CR_POINTS = layout.offsetof(13);
        POINT_CR_VALUE = layout.offsetof(14);
        POINT_CR_SCALING = layout.offsetof(15);
        AR_COEFFS_Y_PLUS_128 = layout.offsetof(16);
        AR_COEFFS_CB_PLUS_128 = layout.offsetof(17);
        AR_COEFFS_CR_PLUS_128 = layout.offsetof(18);
        CB_MULT = layout.offsetof(19);
        CB_LUMA_MULT = layout.offsetof(20);
        CB_OFFSET = layout.offsetof(21);
        CR_MULT = layout.offsetof(22);
        CR_LUMA_MULT = layout.offsetof(23);
        CR_OFFSET = layout.offsetof(24);
    }

    protected StdVideoAV1FilmGrain(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1FilmGrain create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1FilmGrain(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1FilmGrain} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1FilmGrain(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoAV1FilmGrainFlags} view of the {@code flags} field. */
    public StdVideoAV1FilmGrainFlags flags() { return nflags(address()); }
    /** @return the value of the {@code grain_scaling_minus_8} field. */
    @NativeType("uint8_t")
    public byte grain_scaling_minus_8() { return ngrain_scaling_minus_8(address()); }
    /** @return the value of the {@code ar_coeff_lag} field. */
    @NativeType("uint8_t")
    public byte ar_coeff_lag() { return nar_coeff_lag(address()); }
    /** @return the value of the {@code ar_coeff_shift_minus_6} field. */
    @NativeType("uint8_t")
    public byte ar_coeff_shift_minus_6() { return nar_coeff_shift_minus_6(address()); }
    /** @return the value of the {@code grain_scale_shift} field. */
    @NativeType("uint8_t")
    public byte grain_scale_shift() { return ngrain_scale_shift(address()); }
    /** @return the value of the {@code grain_seed} field. */
    @NativeType("uint16_t")
    public short grain_seed() { return ngrain_seed(address()); }
    /** @return the value of the {@code film_grain_params_ref_idx} field. */
    @NativeType("uint8_t")
    public byte film_grain_params_ref_idx() { return nfilm_grain_params_ref_idx(address()); }
    /** @return the value of the {@code num_y_points} field. */
    @NativeType("uint8_t")
    public byte num_y_points() { return nnum_y_points(address()); }
    /** @return a {@link ByteBuffer} view of the {@code point_y_value} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
    public ByteBuffer point_y_value() { return npoint_y_value(address()); }
    /** @return the value at the specified index of the {@code point_y_value} field. */
    @NativeType("uint8_t")
    public byte point_y_value(int index) { return npoint_y_value(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code point_y_scaling} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
    public ByteBuffer point_y_scaling() { return npoint_y_scaling(address()); }
    /** @return the value at the specified index of the {@code point_y_scaling} field. */
    @NativeType("uint8_t")
    public byte point_y_scaling(int index) { return npoint_y_scaling(address(), index); }
    /** @return the value of the {@code num_cb_points} field. */
    @NativeType("uint8_t")
    public byte num_cb_points() { return nnum_cb_points(address()); }
    /** @return a {@link ByteBuffer} view of the {@code point_cb_value} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
    public ByteBuffer point_cb_value() { return npoint_cb_value(address()); }
    /** @return the value at the specified index of the {@code point_cb_value} field. */
    @NativeType("uint8_t")
    public byte point_cb_value(int index) { return npoint_cb_value(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code point_cb_scaling} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
    public ByteBuffer point_cb_scaling() { return npoint_cb_scaling(address()); }
    /** @return the value at the specified index of the {@code point_cb_scaling} field. */
    @NativeType("uint8_t")
    public byte point_cb_scaling(int index) { return npoint_cb_scaling(address(), index); }
    /** @return the value of the {@code num_cr_points} field. */
    @NativeType("uint8_t")
    public byte num_cr_points() { return nnum_cr_points(address()); }
    /** @return a {@link ByteBuffer} view of the {@code point_cr_value} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
    public ByteBuffer point_cr_value() { return npoint_cr_value(address()); }
    /** @return the value at the specified index of the {@code point_cr_value} field. */
    @NativeType("uint8_t")
    public byte point_cr_value(int index) { return npoint_cr_value(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code point_cr_scaling} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
    public ByteBuffer point_cr_scaling() { return npoint_cr_scaling(address()); }
    /** @return the value at the specified index of the {@code point_cr_scaling} field. */
    @NativeType("uint8_t")
    public byte point_cr_scaling(int index) { return npoint_cr_scaling(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code ar_coeffs_y_plus_128} field. */
    @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]")
    public ByteBuffer ar_coeffs_y_plus_128() { return nar_coeffs_y_plus_128(address()); }
    /** @return the value at the specified index of the {@code ar_coeffs_y_plus_128} field. */
    @NativeType("int8_t")
    public byte ar_coeffs_y_plus_128(int index) { return nar_coeffs_y_plus_128(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code ar_coeffs_cb_plus_128} field. */
    @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
    public ByteBuffer ar_coeffs_cb_plus_128() { return nar_coeffs_cb_plus_128(address()); }
    /** @return the value at the specified index of the {@code ar_coeffs_cb_plus_128} field. */
    @NativeType("int8_t")
    public byte ar_coeffs_cb_plus_128(int index) { return nar_coeffs_cb_plus_128(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code ar_coeffs_cr_plus_128} field. */
    @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
    public ByteBuffer ar_coeffs_cr_plus_128() { return nar_coeffs_cr_plus_128(address()); }
    /** @return the value at the specified index of the {@code ar_coeffs_cr_plus_128} field. */
    @NativeType("int8_t")
    public byte ar_coeffs_cr_plus_128(int index) { return nar_coeffs_cr_plus_128(address(), index); }
    /** @return the value of the {@code cb_mult} field. */
    @NativeType("uint8_t")
    public byte cb_mult() { return ncb_mult(address()); }
    /** @return the value of the {@code cb_luma_mult} field. */
    @NativeType("uint8_t")
    public byte cb_luma_mult() { return ncb_luma_mult(address()); }
    /** @return the value of the {@code cb_offset} field. */
    @NativeType("uint16_t")
    public short cb_offset() { return ncb_offset(address()); }
    /** @return the value of the {@code cr_mult} field. */
    @NativeType("uint8_t")
    public byte cr_mult() { return ncr_mult(address()); }
    /** @return the value of the {@code cr_luma_mult} field. */
    @NativeType("uint8_t")
    public byte cr_luma_mult() { return ncr_luma_mult(address()); }
    /** @return the value of the {@code cr_offset} field. */
    @NativeType("uint16_t")
    public short cr_offset() { return ncr_offset(address()); }

    /** Copies the specified {@link StdVideoAV1FilmGrainFlags} to the {@code flags} field. */
    public StdVideoAV1FilmGrain flags(StdVideoAV1FilmGrainFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoAV1FilmGrain flags(java.util.function.Consumer<StdVideoAV1FilmGrainFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code grain_scaling_minus_8} field. */
    public StdVideoAV1FilmGrain grain_scaling_minus_8(@NativeType("uint8_t") byte value) { ngrain_scaling_minus_8(address(), value); return this; }
    /** Sets the specified value to the {@code ar_coeff_lag} field. */
    public StdVideoAV1FilmGrain ar_coeff_lag(@NativeType("uint8_t") byte value) { nar_coeff_lag(address(), value); return this; }
    /** Sets the specified value to the {@code ar_coeff_shift_minus_6} field. */
    public StdVideoAV1FilmGrain ar_coeff_shift_minus_6(@NativeType("uint8_t") byte value) { nar_coeff_shift_minus_6(address(), value); return this; }
    /** Sets the specified value to the {@code grain_scale_shift} field. */
    public StdVideoAV1FilmGrain grain_scale_shift(@NativeType("uint8_t") byte value) { ngrain_scale_shift(address(), value); return this; }
    /** Sets the specified value to the {@code grain_seed} field. */
    public StdVideoAV1FilmGrain grain_seed(@NativeType("uint16_t") short value) { ngrain_seed(address(), value); return this; }
    /** Sets the specified value to the {@code film_grain_params_ref_idx} field. */
    public StdVideoAV1FilmGrain film_grain_params_ref_idx(@NativeType("uint8_t") byte value) { nfilm_grain_params_ref_idx(address(), value); return this; }
    /** Sets the specified value to the {@code num_y_points} field. */
    public StdVideoAV1FilmGrain num_y_points(@NativeType("uint8_t") byte value) { nnum_y_points(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code point_y_value} field. */
    public StdVideoAV1FilmGrain point_y_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") ByteBuffer value) { npoint_y_value(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code point_y_value} field. */
    public StdVideoAV1FilmGrain point_y_value(int index, @NativeType("uint8_t") byte value) { npoint_y_value(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code point_y_scaling} field. */
    public StdVideoAV1FilmGrain point_y_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") ByteBuffer value) { npoint_y_scaling(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code point_y_scaling} field. */
    public StdVideoAV1FilmGrain point_y_scaling(int index, @NativeType("uint8_t") byte value) { npoint_y_scaling(address(), index, value); return this; }
    /** Sets the specified value to the {@code num_cb_points} field. */
    public StdVideoAV1FilmGrain num_cb_points(@NativeType("uint8_t") byte value) { nnum_cb_points(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code point_cb_value} field. */
    public StdVideoAV1FilmGrain point_cb_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") ByteBuffer value) { npoint_cb_value(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code point_cb_value} field. */
    public StdVideoAV1FilmGrain point_cb_value(int index, @NativeType("uint8_t") byte value) { npoint_cb_value(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code point_cb_scaling} field. */
    public StdVideoAV1FilmGrain point_cb_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") ByteBuffer value) { npoint_cb_scaling(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code point_cb_scaling} field. */
    public StdVideoAV1FilmGrain point_cb_scaling(int index, @NativeType("uint8_t") byte value) { npoint_cb_scaling(address(), index, value); return this; }
    /** Sets the specified value to the {@code num_cr_points} field. */
    public StdVideoAV1FilmGrain num_cr_points(@NativeType("uint8_t") byte value) { nnum_cr_points(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code point_cr_value} field. */
    public StdVideoAV1FilmGrain point_cr_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") ByteBuffer value) { npoint_cr_value(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code point_cr_value} field. */
    public StdVideoAV1FilmGrain point_cr_value(int index, @NativeType("uint8_t") byte value) { npoint_cr_value(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code point_cr_scaling} field. */
    public StdVideoAV1FilmGrain point_cr_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") ByteBuffer value) { npoint_cr_scaling(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code point_cr_scaling} field. */
    public StdVideoAV1FilmGrain point_cr_scaling(int index, @NativeType("uint8_t") byte value) { npoint_cr_scaling(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code ar_coeffs_y_plus_128} field. */
    public StdVideoAV1FilmGrain ar_coeffs_y_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]") ByteBuffer value) { nar_coeffs_y_plus_128(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ar_coeffs_y_plus_128} field. */
    public StdVideoAV1FilmGrain ar_coeffs_y_plus_128(int index, @NativeType("int8_t") byte value) { nar_coeffs_y_plus_128(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code ar_coeffs_cb_plus_128} field. */
    public StdVideoAV1FilmGrain ar_coeffs_cb_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") ByteBuffer value) { nar_coeffs_cb_plus_128(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ar_coeffs_cb_plus_128} field. */
    public StdVideoAV1FilmGrain ar_coeffs_cb_plus_128(int index, @NativeType("int8_t") byte value) { nar_coeffs_cb_plus_128(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code ar_coeffs_cr_plus_128} field. */
    public StdVideoAV1FilmGrain ar_coeffs_cr_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") ByteBuffer value) { nar_coeffs_cr_plus_128(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ar_coeffs_cr_plus_128} field. */
    public StdVideoAV1FilmGrain ar_coeffs_cr_plus_128(int index, @NativeType("int8_t") byte value) { nar_coeffs_cr_plus_128(address(), index, value); return this; }
    /** Sets the specified value to the {@code cb_mult} field. */
    public StdVideoAV1FilmGrain cb_mult(@NativeType("uint8_t") byte value) { ncb_mult(address(), value); return this; }
    /** Sets the specified value to the {@code cb_luma_mult} field. */
    public StdVideoAV1FilmGrain cb_luma_mult(@NativeType("uint8_t") byte value) { ncb_luma_mult(address(), value); return this; }
    /** Sets the specified value to the {@code cb_offset} field. */
    public StdVideoAV1FilmGrain cb_offset(@NativeType("uint16_t") short value) { ncb_offset(address(), value); return this; }
    /** Sets the specified value to the {@code cr_mult} field. */
    public StdVideoAV1FilmGrain cr_mult(@NativeType("uint8_t") byte value) { ncr_mult(address(), value); return this; }
    /** Sets the specified value to the {@code cr_luma_mult} field. */
    public StdVideoAV1FilmGrain cr_luma_mult(@NativeType("uint8_t") byte value) { ncr_luma_mult(address(), value); return this; }
    /** Sets the specified value to the {@code cr_offset} field. */
    public StdVideoAV1FilmGrain cr_offset(@NativeType("uint16_t") short value) { ncr_offset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1FilmGrain set(
        StdVideoAV1FilmGrainFlags flags,
        byte grain_scaling_minus_8,
        byte ar_coeff_lag,
        byte ar_coeff_shift_minus_6,
        byte grain_scale_shift,
        short grain_seed,
        byte film_grain_params_ref_idx,
        byte num_y_points,
        ByteBuffer point_y_value,
        ByteBuffer point_y_scaling,
        byte num_cb_points,
        ByteBuffer point_cb_value,
        ByteBuffer point_cb_scaling,
        byte num_cr_points,
        ByteBuffer point_cr_value,
        ByteBuffer point_cr_scaling,
        ByteBuffer ar_coeffs_y_plus_128,
        ByteBuffer ar_coeffs_cb_plus_128,
        ByteBuffer ar_coeffs_cr_plus_128,
        byte cb_mult,
        byte cb_luma_mult,
        short cb_offset,
        byte cr_mult,
        byte cr_luma_mult,
        short cr_offset
    ) {
        flags(flags);
        grain_scaling_minus_8(grain_scaling_minus_8);
        ar_coeff_lag(ar_coeff_lag);
        ar_coeff_shift_minus_6(ar_coeff_shift_minus_6);
        grain_scale_shift(grain_scale_shift);
        grain_seed(grain_seed);
        film_grain_params_ref_idx(film_grain_params_ref_idx);
        num_y_points(num_y_points);
        point_y_value(point_y_value);
        point_y_scaling(point_y_scaling);
        num_cb_points(num_cb_points);
        point_cb_value(point_cb_value);
        point_cb_scaling(point_cb_scaling);
        num_cr_points(num_cr_points);
        point_cr_value(point_cr_value);
        point_cr_scaling(point_cr_scaling);
        ar_coeffs_y_plus_128(ar_coeffs_y_plus_128);
        ar_coeffs_cb_plus_128(ar_coeffs_cb_plus_128);
        ar_coeffs_cr_plus_128(ar_coeffs_cr_plus_128);
        cb_mult(cb_mult);
        cb_luma_mult(cb_luma_mult);
        cb_offset(cb_offset);
        cr_mult(cr_mult);
        cr_luma_mult(cr_luma_mult);
        cr_offset(cr_offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1FilmGrain set(StdVideoAV1FilmGrain src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1FilmGrain} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1FilmGrain malloc() {
        return new StdVideoAV1FilmGrain(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1FilmGrain} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1FilmGrain calloc() {
        return new StdVideoAV1FilmGrain(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1FilmGrain} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1FilmGrain create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1FilmGrain(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1FilmGrain} instance for the specified memory address. */
    public static StdVideoAV1FilmGrain create(long address) {
        return new StdVideoAV1FilmGrain(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1FilmGrain createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1FilmGrain(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1FilmGrain.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrain.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1FilmGrain.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrain.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1FilmGrain.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrain.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1FilmGrain.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrain.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1FilmGrain.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1FilmGrain} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1FilmGrain malloc(MemoryStack stack) {
        return new StdVideoAV1FilmGrain(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1FilmGrain} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1FilmGrain calloc(MemoryStack stack) {
        return new StdVideoAV1FilmGrain(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1FilmGrain.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrain.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1FilmGrain.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrain.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoAV1FilmGrainFlags nflags(long struct) { return StdVideoAV1FilmGrainFlags.create(struct + StdVideoAV1FilmGrain.FLAGS); }
    /** Unsafe version of {@link #grain_scaling_minus_8}. */
    public static byte ngrain_scaling_minus_8(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.GRAIN_SCALING_MINUS_8); }
    /** Unsafe version of {@link #ar_coeff_lag}. */
    public static byte nar_coeff_lag(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.AR_COEFF_LAG); }
    /** Unsafe version of {@link #ar_coeff_shift_minus_6}. */
    public static byte nar_coeff_shift_minus_6(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.AR_COEFF_SHIFT_MINUS_6); }
    /** Unsafe version of {@link #grain_scale_shift}. */
    public static byte ngrain_scale_shift(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.GRAIN_SCALE_SHIFT); }
    /** Unsafe version of {@link #grain_seed}. */
    public static short ngrain_seed(long struct) { return memGetShort(struct + StdVideoAV1FilmGrain.GRAIN_SEED); }
    /** Unsafe version of {@link #film_grain_params_ref_idx}. */
    public static byte nfilm_grain_params_ref_idx(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.FILM_GRAIN_PARAMS_REF_IDX); }
    /** Unsafe version of {@link #num_y_points}. */
    public static byte nnum_y_points(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.NUM_Y_POINTS); }
    /** Unsafe version of {@link #point_y_value}. */
    public static ByteBuffer npoint_y_value(long struct) { return memByteBuffer(struct + StdVideoAV1FilmGrain.POINT_Y_VALUE, STD_VIDEO_AV1_MAX_NUM_Y_POINTS); }
    /** Unsafe version of {@link #point_y_value(int) point_y_value}. */
    public static byte npoint_y_value(long struct, int index) {
        return memGetByte(struct + StdVideoAV1FilmGrain.POINT_Y_VALUE + check(index, STD_VIDEO_AV1_MAX_NUM_Y_POINTS) * 1);
    }
    /** Unsafe version of {@link #point_y_scaling}. */
    public static ByteBuffer npoint_y_scaling(long struct) { return memByteBuffer(struct + StdVideoAV1FilmGrain.POINT_Y_SCALING, STD_VIDEO_AV1_MAX_NUM_Y_POINTS); }
    /** Unsafe version of {@link #point_y_scaling(int) point_y_scaling}. */
    public static byte npoint_y_scaling(long struct, int index) {
        return memGetByte(struct + StdVideoAV1FilmGrain.POINT_Y_SCALING + check(index, STD_VIDEO_AV1_MAX_NUM_Y_POINTS) * 1);
    }
    /** Unsafe version of {@link #num_cb_points}. */
    public static byte nnum_cb_points(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.NUM_CB_POINTS); }
    /** Unsafe version of {@link #point_cb_value}. */
    public static ByteBuffer npoint_cb_value(long struct) { return memByteBuffer(struct + StdVideoAV1FilmGrain.POINT_CB_VALUE, STD_VIDEO_AV1_MAX_NUM_CB_POINTS); }
    /** Unsafe version of {@link #point_cb_value(int) point_cb_value}. */
    public static byte npoint_cb_value(long struct, int index) {
        return memGetByte(struct + StdVideoAV1FilmGrain.POINT_CB_VALUE + check(index, STD_VIDEO_AV1_MAX_NUM_CB_POINTS) * 1);
    }
    /** Unsafe version of {@link #point_cb_scaling}. */
    public static ByteBuffer npoint_cb_scaling(long struct) { return memByteBuffer(struct + StdVideoAV1FilmGrain.POINT_CB_SCALING, STD_VIDEO_AV1_MAX_NUM_CB_POINTS); }
    /** Unsafe version of {@link #point_cb_scaling(int) point_cb_scaling}. */
    public static byte npoint_cb_scaling(long struct, int index) {
        return memGetByte(struct + StdVideoAV1FilmGrain.POINT_CB_SCALING + check(index, STD_VIDEO_AV1_MAX_NUM_CB_POINTS) * 1);
    }
    /** Unsafe version of {@link #num_cr_points}. */
    public static byte nnum_cr_points(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.NUM_CR_POINTS); }
    /** Unsafe version of {@link #point_cr_value}. */
    public static ByteBuffer npoint_cr_value(long struct) { return memByteBuffer(struct + StdVideoAV1FilmGrain.POINT_CR_VALUE, STD_VIDEO_AV1_MAX_NUM_CR_POINTS); }
    /** Unsafe version of {@link #point_cr_value(int) point_cr_value}. */
    public static byte npoint_cr_value(long struct, int index) {
        return memGetByte(struct + StdVideoAV1FilmGrain.POINT_CR_VALUE + check(index, STD_VIDEO_AV1_MAX_NUM_CR_POINTS) * 1);
    }
    /** Unsafe version of {@link #point_cr_scaling}. */
    public static ByteBuffer npoint_cr_scaling(long struct) { return memByteBuffer(struct + StdVideoAV1FilmGrain.POINT_CR_SCALING, STD_VIDEO_AV1_MAX_NUM_CR_POINTS); }
    /** Unsafe version of {@link #point_cr_scaling(int) point_cr_scaling}. */
    public static byte npoint_cr_scaling(long struct, int index) {
        return memGetByte(struct + StdVideoAV1FilmGrain.POINT_CR_SCALING + check(index, STD_VIDEO_AV1_MAX_NUM_CR_POINTS) * 1);
    }
    /** Unsafe version of {@link #ar_coeffs_y_plus_128}. */
    public static ByteBuffer nar_coeffs_y_plus_128(long struct) { return memByteBuffer(struct + StdVideoAV1FilmGrain.AR_COEFFS_Y_PLUS_128, STD_VIDEO_AV1_MAX_NUM_POS_LUMA); }
    /** Unsafe version of {@link #ar_coeffs_y_plus_128(int) ar_coeffs_y_plus_128}. */
    public static byte nar_coeffs_y_plus_128(long struct, int index) {
        return memGetByte(struct + StdVideoAV1FilmGrain.AR_COEFFS_Y_PLUS_128 + check(index, STD_VIDEO_AV1_MAX_NUM_POS_LUMA) * 1);
    }
    /** Unsafe version of {@link #ar_coeffs_cb_plus_128}. */
    public static ByteBuffer nar_coeffs_cb_plus_128(long struct) { return memByteBuffer(struct + StdVideoAV1FilmGrain.AR_COEFFS_CB_PLUS_128, STD_VIDEO_AV1_MAX_NUM_POS_CHROMA); }
    /** Unsafe version of {@link #ar_coeffs_cb_plus_128(int) ar_coeffs_cb_plus_128}. */
    public static byte nar_coeffs_cb_plus_128(long struct, int index) {
        return memGetByte(struct + StdVideoAV1FilmGrain.AR_COEFFS_CB_PLUS_128 + check(index, STD_VIDEO_AV1_MAX_NUM_POS_CHROMA) * 1);
    }
    /** Unsafe version of {@link #ar_coeffs_cr_plus_128}. */
    public static ByteBuffer nar_coeffs_cr_plus_128(long struct) { return memByteBuffer(struct + StdVideoAV1FilmGrain.AR_COEFFS_CR_PLUS_128, STD_VIDEO_AV1_MAX_NUM_POS_CHROMA); }
    /** Unsafe version of {@link #ar_coeffs_cr_plus_128(int) ar_coeffs_cr_plus_128}. */
    public static byte nar_coeffs_cr_plus_128(long struct, int index) {
        return memGetByte(struct + StdVideoAV1FilmGrain.AR_COEFFS_CR_PLUS_128 + check(index, STD_VIDEO_AV1_MAX_NUM_POS_CHROMA) * 1);
    }
    /** Unsafe version of {@link #cb_mult}. */
    public static byte ncb_mult(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.CB_MULT); }
    /** Unsafe version of {@link #cb_luma_mult}. */
    public static byte ncb_luma_mult(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.CB_LUMA_MULT); }
    /** Unsafe version of {@link #cb_offset}. */
    public static short ncb_offset(long struct) { return memGetShort(struct + StdVideoAV1FilmGrain.CB_OFFSET); }
    /** Unsafe version of {@link #cr_mult}. */
    public static byte ncr_mult(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.CR_MULT); }
    /** Unsafe version of {@link #cr_luma_mult}. */
    public static byte ncr_luma_mult(long struct) { return memGetByte(struct + StdVideoAV1FilmGrain.CR_LUMA_MULT); }
    /** Unsafe version of {@link #cr_offset}. */
    public static short ncr_offset(long struct) { return memGetShort(struct + StdVideoAV1FilmGrain.CR_OFFSET); }

    /** Unsafe version of {@link #flags(StdVideoAV1FilmGrainFlags) flags}. */
    public static void nflags(long struct, StdVideoAV1FilmGrainFlags value) { memCopy(value.address(), struct + StdVideoAV1FilmGrain.FLAGS, StdVideoAV1FilmGrainFlags.SIZEOF); }
    /** Unsafe version of {@link #grain_scaling_minus_8(byte) grain_scaling_minus_8}. */
    public static void ngrain_scaling_minus_8(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.GRAIN_SCALING_MINUS_8, value); }
    /** Unsafe version of {@link #ar_coeff_lag(byte) ar_coeff_lag}. */
    public static void nar_coeff_lag(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.AR_COEFF_LAG, value); }
    /** Unsafe version of {@link #ar_coeff_shift_minus_6(byte) ar_coeff_shift_minus_6}. */
    public static void nar_coeff_shift_minus_6(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.AR_COEFF_SHIFT_MINUS_6, value); }
    /** Unsafe version of {@link #grain_scale_shift(byte) grain_scale_shift}. */
    public static void ngrain_scale_shift(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.GRAIN_SCALE_SHIFT, value); }
    /** Unsafe version of {@link #grain_seed(short) grain_seed}. */
    public static void ngrain_seed(long struct, short value) { memPutShort(struct + StdVideoAV1FilmGrain.GRAIN_SEED, value); }
    /** Unsafe version of {@link #film_grain_params_ref_idx(byte) film_grain_params_ref_idx}. */
    public static void nfilm_grain_params_ref_idx(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.FILM_GRAIN_PARAMS_REF_IDX, value); }
    /** Unsafe version of {@link #num_y_points(byte) num_y_points}. */
    public static void nnum_y_points(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.NUM_Y_POINTS, value); }
    /** Unsafe version of {@link #point_y_value(ByteBuffer) point_y_value}. */
    public static void npoint_y_value(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_Y_POINTS); }
        memCopy(memAddress(value), struct + StdVideoAV1FilmGrain.POINT_Y_VALUE, value.remaining() * 1);
    }
    /** Unsafe version of {@link #point_y_value(int, byte) point_y_value}. */
    public static void npoint_y_value(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1FilmGrain.POINT_Y_VALUE + check(index, STD_VIDEO_AV1_MAX_NUM_Y_POINTS) * 1, value);
    }
    /** Unsafe version of {@link #point_y_scaling(ByteBuffer) point_y_scaling}. */
    public static void npoint_y_scaling(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_Y_POINTS); }
        memCopy(memAddress(value), struct + StdVideoAV1FilmGrain.POINT_Y_SCALING, value.remaining() * 1);
    }
    /** Unsafe version of {@link #point_y_scaling(int, byte) point_y_scaling}. */
    public static void npoint_y_scaling(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1FilmGrain.POINT_Y_SCALING + check(index, STD_VIDEO_AV1_MAX_NUM_Y_POINTS) * 1, value);
    }
    /** Unsafe version of {@link #num_cb_points(byte) num_cb_points}. */
    public static void nnum_cb_points(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.NUM_CB_POINTS, value); }
    /** Unsafe version of {@link #point_cb_value(ByteBuffer) point_cb_value}. */
    public static void npoint_cb_value(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_CB_POINTS); }
        memCopy(memAddress(value), struct + StdVideoAV1FilmGrain.POINT_CB_VALUE, value.remaining() * 1);
    }
    /** Unsafe version of {@link #point_cb_value(int, byte) point_cb_value}. */
    public static void npoint_cb_value(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1FilmGrain.POINT_CB_VALUE + check(index, STD_VIDEO_AV1_MAX_NUM_CB_POINTS) * 1, value);
    }
    /** Unsafe version of {@link #point_cb_scaling(ByteBuffer) point_cb_scaling}. */
    public static void npoint_cb_scaling(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_CB_POINTS); }
        memCopy(memAddress(value), struct + StdVideoAV1FilmGrain.POINT_CB_SCALING, value.remaining() * 1);
    }
    /** Unsafe version of {@link #point_cb_scaling(int, byte) point_cb_scaling}. */
    public static void npoint_cb_scaling(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1FilmGrain.POINT_CB_SCALING + check(index, STD_VIDEO_AV1_MAX_NUM_CB_POINTS) * 1, value);
    }
    /** Unsafe version of {@link #num_cr_points(byte) num_cr_points}. */
    public static void nnum_cr_points(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.NUM_CR_POINTS, value); }
    /** Unsafe version of {@link #point_cr_value(ByteBuffer) point_cr_value}. */
    public static void npoint_cr_value(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_CR_POINTS); }
        memCopy(memAddress(value), struct + StdVideoAV1FilmGrain.POINT_CR_VALUE, value.remaining() * 1);
    }
    /** Unsafe version of {@link #point_cr_value(int, byte) point_cr_value}. */
    public static void npoint_cr_value(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1FilmGrain.POINT_CR_VALUE + check(index, STD_VIDEO_AV1_MAX_NUM_CR_POINTS) * 1, value);
    }
    /** Unsafe version of {@link #point_cr_scaling(ByteBuffer) point_cr_scaling}. */
    public static void npoint_cr_scaling(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_CR_POINTS); }
        memCopy(memAddress(value), struct + StdVideoAV1FilmGrain.POINT_CR_SCALING, value.remaining() * 1);
    }
    /** Unsafe version of {@link #point_cr_scaling(int, byte) point_cr_scaling}. */
    public static void npoint_cr_scaling(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1FilmGrain.POINT_CR_SCALING + check(index, STD_VIDEO_AV1_MAX_NUM_CR_POINTS) * 1, value);
    }
    /** Unsafe version of {@link #ar_coeffs_y_plus_128(ByteBuffer) ar_coeffs_y_plus_128}. */
    public static void nar_coeffs_y_plus_128(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_POS_LUMA); }
        memCopy(memAddress(value), struct + StdVideoAV1FilmGrain.AR_COEFFS_Y_PLUS_128, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ar_coeffs_y_plus_128(int, byte) ar_coeffs_y_plus_128}. */
    public static void nar_coeffs_y_plus_128(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1FilmGrain.AR_COEFFS_Y_PLUS_128 + check(index, STD_VIDEO_AV1_MAX_NUM_POS_LUMA) * 1, value);
    }
    /** Unsafe version of {@link #ar_coeffs_cb_plus_128(ByteBuffer) ar_coeffs_cb_plus_128}. */
    public static void nar_coeffs_cb_plus_128(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_POS_CHROMA); }
        memCopy(memAddress(value), struct + StdVideoAV1FilmGrain.AR_COEFFS_CB_PLUS_128, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ar_coeffs_cb_plus_128(int, byte) ar_coeffs_cb_plus_128}. */
    public static void nar_coeffs_cb_plus_128(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1FilmGrain.AR_COEFFS_CB_PLUS_128 + check(index, STD_VIDEO_AV1_MAX_NUM_POS_CHROMA) * 1, value);
    }
    /** Unsafe version of {@link #ar_coeffs_cr_plus_128(ByteBuffer) ar_coeffs_cr_plus_128}. */
    public static void nar_coeffs_cr_plus_128(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_POS_CHROMA); }
        memCopy(memAddress(value), struct + StdVideoAV1FilmGrain.AR_COEFFS_CR_PLUS_128, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ar_coeffs_cr_plus_128(int, byte) ar_coeffs_cr_plus_128}. */
    public static void nar_coeffs_cr_plus_128(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1FilmGrain.AR_COEFFS_CR_PLUS_128 + check(index, STD_VIDEO_AV1_MAX_NUM_POS_CHROMA) * 1, value);
    }
    /** Unsafe version of {@link #cb_mult(byte) cb_mult}. */
    public static void ncb_mult(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.CB_MULT, value); }
    /** Unsafe version of {@link #cb_luma_mult(byte) cb_luma_mult}. */
    public static void ncb_luma_mult(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.CB_LUMA_MULT, value); }
    /** Unsafe version of {@link #cb_offset(short) cb_offset}. */
    public static void ncb_offset(long struct, short value) { memPutShort(struct + StdVideoAV1FilmGrain.CB_OFFSET, value); }
    /** Unsafe version of {@link #cr_mult(byte) cr_mult}. */
    public static void ncr_mult(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.CR_MULT, value); }
    /** Unsafe version of {@link #cr_luma_mult(byte) cr_luma_mult}. */
    public static void ncr_luma_mult(long struct, byte value) { memPutByte(struct + StdVideoAV1FilmGrain.CR_LUMA_MULT, value); }
    /** Unsafe version of {@link #cr_offset(short) cr_offset}. */
    public static void ncr_offset(long struct, short value) { memPutShort(struct + StdVideoAV1FilmGrain.CR_OFFSET, value); }

    // -----------------------------------

    /** An array of {@link StdVideoAV1FilmGrain} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1FilmGrain, Buffer> implements NativeResource {

        private static final StdVideoAV1FilmGrain ELEMENT_FACTORY = StdVideoAV1FilmGrain.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1FilmGrain.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1FilmGrain#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1FilmGrain getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoAV1FilmGrainFlags} view of the {@code flags} field. */
        public StdVideoAV1FilmGrainFlags flags() { return StdVideoAV1FilmGrain.nflags(address()); }
        /** @return the value of the {@code grain_scaling_minus_8} field. */
        @NativeType("uint8_t")
        public byte grain_scaling_minus_8() { return StdVideoAV1FilmGrain.ngrain_scaling_minus_8(address()); }
        /** @return the value of the {@code ar_coeff_lag} field. */
        @NativeType("uint8_t")
        public byte ar_coeff_lag() { return StdVideoAV1FilmGrain.nar_coeff_lag(address()); }
        /** @return the value of the {@code ar_coeff_shift_minus_6} field. */
        @NativeType("uint8_t")
        public byte ar_coeff_shift_minus_6() { return StdVideoAV1FilmGrain.nar_coeff_shift_minus_6(address()); }
        /** @return the value of the {@code grain_scale_shift} field. */
        @NativeType("uint8_t")
        public byte grain_scale_shift() { return StdVideoAV1FilmGrain.ngrain_scale_shift(address()); }
        /** @return the value of the {@code grain_seed} field. */
        @NativeType("uint16_t")
        public short grain_seed() { return StdVideoAV1FilmGrain.ngrain_seed(address()); }
        /** @return the value of the {@code film_grain_params_ref_idx} field. */
        @NativeType("uint8_t")
        public byte film_grain_params_ref_idx() { return StdVideoAV1FilmGrain.nfilm_grain_params_ref_idx(address()); }
        /** @return the value of the {@code num_y_points} field. */
        @NativeType("uint8_t")
        public byte num_y_points() { return StdVideoAV1FilmGrain.nnum_y_points(address()); }
        /** @return a {@link ByteBuffer} view of the {@code point_y_value} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
        public ByteBuffer point_y_value() { return StdVideoAV1FilmGrain.npoint_y_value(address()); }
        /** @return the value at the specified index of the {@code point_y_value} field. */
        @NativeType("uint8_t")
        public byte point_y_value(int index) { return StdVideoAV1FilmGrain.npoint_y_value(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code point_y_scaling} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
        public ByteBuffer point_y_scaling() { return StdVideoAV1FilmGrain.npoint_y_scaling(address()); }
        /** @return the value at the specified index of the {@code point_y_scaling} field. */
        @NativeType("uint8_t")
        public byte point_y_scaling(int index) { return StdVideoAV1FilmGrain.npoint_y_scaling(address(), index); }
        /** @return the value of the {@code num_cb_points} field. */
        @NativeType("uint8_t")
        public byte num_cb_points() { return StdVideoAV1FilmGrain.nnum_cb_points(address()); }
        /** @return a {@link ByteBuffer} view of the {@code point_cb_value} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
        public ByteBuffer point_cb_value() { return StdVideoAV1FilmGrain.npoint_cb_value(address()); }
        /** @return the value at the specified index of the {@code point_cb_value} field. */
        @NativeType("uint8_t")
        public byte point_cb_value(int index) { return StdVideoAV1FilmGrain.npoint_cb_value(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code point_cb_scaling} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
        public ByteBuffer point_cb_scaling() { return StdVideoAV1FilmGrain.npoint_cb_scaling(address()); }
        /** @return the value at the specified index of the {@code point_cb_scaling} field. */
        @NativeType("uint8_t")
        public byte point_cb_scaling(int index) { return StdVideoAV1FilmGrain.npoint_cb_scaling(address(), index); }
        /** @return the value of the {@code num_cr_points} field. */
        @NativeType("uint8_t")
        public byte num_cr_points() { return StdVideoAV1FilmGrain.nnum_cr_points(address()); }
        /** @return a {@link ByteBuffer} view of the {@code point_cr_value} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
        public ByteBuffer point_cr_value() { return StdVideoAV1FilmGrain.npoint_cr_value(address()); }
        /** @return the value at the specified index of the {@code point_cr_value} field. */
        @NativeType("uint8_t")
        public byte point_cr_value(int index) { return StdVideoAV1FilmGrain.npoint_cr_value(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code point_cr_scaling} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
        public ByteBuffer point_cr_scaling() { return StdVideoAV1FilmGrain.npoint_cr_scaling(address()); }
        /** @return the value at the specified index of the {@code point_cr_scaling} field. */
        @NativeType("uint8_t")
        public byte point_cr_scaling(int index) { return StdVideoAV1FilmGrain.npoint_cr_scaling(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code ar_coeffs_y_plus_128} field. */
        @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]")
        public ByteBuffer ar_coeffs_y_plus_128() { return StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(address()); }
        /** @return the value at the specified index of the {@code ar_coeffs_y_plus_128} field. */
        @NativeType("int8_t")
        public byte ar_coeffs_y_plus_128(int index) { return StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code ar_coeffs_cb_plus_128} field. */
        @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
        public ByteBuffer ar_coeffs_cb_plus_128() { return StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(address()); }
        /** @return the value at the specified index of the {@code ar_coeffs_cb_plus_128} field. */
        @NativeType("int8_t")
        public byte ar_coeffs_cb_plus_128(int index) { return StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code ar_coeffs_cr_plus_128} field. */
        @NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
        public ByteBuffer ar_coeffs_cr_plus_128() { return StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(address()); }
        /** @return the value at the specified index of the {@code ar_coeffs_cr_plus_128} field. */
        @NativeType("int8_t")
        public byte ar_coeffs_cr_plus_128(int index) { return StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(address(), index); }
        /** @return the value of the {@code cb_mult} field. */
        @NativeType("uint8_t")
        public byte cb_mult() { return StdVideoAV1FilmGrain.ncb_mult(address()); }
        /** @return the value of the {@code cb_luma_mult} field. */
        @NativeType("uint8_t")
        public byte cb_luma_mult() { return StdVideoAV1FilmGrain.ncb_luma_mult(address()); }
        /** @return the value of the {@code cb_offset} field. */
        @NativeType("uint16_t")
        public short cb_offset() { return StdVideoAV1FilmGrain.ncb_offset(address()); }
        /** @return the value of the {@code cr_mult} field. */
        @NativeType("uint8_t")
        public byte cr_mult() { return StdVideoAV1FilmGrain.ncr_mult(address()); }
        /** @return the value of the {@code cr_luma_mult} field. */
        @NativeType("uint8_t")
        public byte cr_luma_mult() { return StdVideoAV1FilmGrain.ncr_luma_mult(address()); }
        /** @return the value of the {@code cr_offset} field. */
        @NativeType("uint16_t")
        public short cr_offset() { return StdVideoAV1FilmGrain.ncr_offset(address()); }

        /** Copies the specified {@link StdVideoAV1FilmGrainFlags} to the {@code flags} field. */
        public StdVideoAV1FilmGrain.Buffer flags(StdVideoAV1FilmGrainFlags value) { StdVideoAV1FilmGrain.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoAV1FilmGrain.Buffer flags(java.util.function.Consumer<StdVideoAV1FilmGrainFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code grain_scaling_minus_8} field. */
        public StdVideoAV1FilmGrain.Buffer grain_scaling_minus_8(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.ngrain_scaling_minus_8(address(), value); return this; }
        /** Sets the specified value to the {@code ar_coeff_lag} field. */
        public StdVideoAV1FilmGrain.Buffer ar_coeff_lag(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.nar_coeff_lag(address(), value); return this; }
        /** Sets the specified value to the {@code ar_coeff_shift_minus_6} field. */
        public StdVideoAV1FilmGrain.Buffer ar_coeff_shift_minus_6(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.nar_coeff_shift_minus_6(address(), value); return this; }
        /** Sets the specified value to the {@code grain_scale_shift} field. */
        public StdVideoAV1FilmGrain.Buffer grain_scale_shift(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.ngrain_scale_shift(address(), value); return this; }
        /** Sets the specified value to the {@code grain_seed} field. */
        public StdVideoAV1FilmGrain.Buffer grain_seed(@NativeType("uint16_t") short value) { StdVideoAV1FilmGrain.ngrain_seed(address(), value); return this; }
        /** Sets the specified value to the {@code film_grain_params_ref_idx} field. */
        public StdVideoAV1FilmGrain.Buffer film_grain_params_ref_idx(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.nfilm_grain_params_ref_idx(address(), value); return this; }
        /** Sets the specified value to the {@code num_y_points} field. */
        public StdVideoAV1FilmGrain.Buffer num_y_points(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.nnum_y_points(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code point_y_value} field. */
        public StdVideoAV1FilmGrain.Buffer point_y_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") ByteBuffer value) { StdVideoAV1FilmGrain.npoint_y_value(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code point_y_value} field. */
        public StdVideoAV1FilmGrain.Buffer point_y_value(int index, @NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.npoint_y_value(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code point_y_scaling} field. */
        public StdVideoAV1FilmGrain.Buffer point_y_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") ByteBuffer value) { StdVideoAV1FilmGrain.npoint_y_scaling(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code point_y_scaling} field. */
        public StdVideoAV1FilmGrain.Buffer point_y_scaling(int index, @NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.npoint_y_scaling(address(), index, value); return this; }
        /** Sets the specified value to the {@code num_cb_points} field. */
        public StdVideoAV1FilmGrain.Buffer num_cb_points(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.nnum_cb_points(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code point_cb_value} field. */
        public StdVideoAV1FilmGrain.Buffer point_cb_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") ByteBuffer value) { StdVideoAV1FilmGrain.npoint_cb_value(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code point_cb_value} field. */
        public StdVideoAV1FilmGrain.Buffer point_cb_value(int index, @NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.npoint_cb_value(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code point_cb_scaling} field. */
        public StdVideoAV1FilmGrain.Buffer point_cb_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") ByteBuffer value) { StdVideoAV1FilmGrain.npoint_cb_scaling(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code point_cb_scaling} field. */
        public StdVideoAV1FilmGrain.Buffer point_cb_scaling(int index, @NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.npoint_cb_scaling(address(), index, value); return this; }
        /** Sets the specified value to the {@code num_cr_points} field. */
        public StdVideoAV1FilmGrain.Buffer num_cr_points(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.nnum_cr_points(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code point_cr_value} field. */
        public StdVideoAV1FilmGrain.Buffer point_cr_value(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") ByteBuffer value) { StdVideoAV1FilmGrain.npoint_cr_value(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code point_cr_value} field. */
        public StdVideoAV1FilmGrain.Buffer point_cr_value(int index, @NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.npoint_cr_value(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code point_cr_scaling} field. */
        public StdVideoAV1FilmGrain.Buffer point_cr_scaling(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") ByteBuffer value) { StdVideoAV1FilmGrain.npoint_cr_scaling(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code point_cr_scaling} field. */
        public StdVideoAV1FilmGrain.Buffer point_cr_scaling(int index, @NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.npoint_cr_scaling(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code ar_coeffs_y_plus_128} field. */
        public StdVideoAV1FilmGrain.Buffer ar_coeffs_y_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]") ByteBuffer value) { StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ar_coeffs_y_plus_128} field. */
        public StdVideoAV1FilmGrain.Buffer ar_coeffs_y_plus_128(int index, @NativeType("int8_t") byte value) { StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code ar_coeffs_cb_plus_128} field. */
        public StdVideoAV1FilmGrain.Buffer ar_coeffs_cb_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") ByteBuffer value) { StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ar_coeffs_cb_plus_128} field. */
        public StdVideoAV1FilmGrain.Buffer ar_coeffs_cb_plus_128(int index, @NativeType("int8_t") byte value) { StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code ar_coeffs_cr_plus_128} field. */
        public StdVideoAV1FilmGrain.Buffer ar_coeffs_cr_plus_128(@NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") ByteBuffer value) { StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ar_coeffs_cr_plus_128} field. */
        public StdVideoAV1FilmGrain.Buffer ar_coeffs_cr_plus_128(int index, @NativeType("int8_t") byte value) { StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(address(), index, value); return this; }
        /** Sets the specified value to the {@code cb_mult} field. */
        public StdVideoAV1FilmGrain.Buffer cb_mult(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.ncb_mult(address(), value); return this; }
        /** Sets the specified value to the {@code cb_luma_mult} field. */
        public StdVideoAV1FilmGrain.Buffer cb_luma_mult(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.ncb_luma_mult(address(), value); return this; }
        /** Sets the specified value to the {@code cb_offset} field. */
        public StdVideoAV1FilmGrain.Buffer cb_offset(@NativeType("uint16_t") short value) { StdVideoAV1FilmGrain.ncb_offset(address(), value); return this; }
        /** Sets the specified value to the {@code cr_mult} field. */
        public StdVideoAV1FilmGrain.Buffer cr_mult(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.ncr_mult(address(), value); return this; }
        /** Sets the specified value to the {@code cr_luma_mult} field. */
        public StdVideoAV1FilmGrain.Buffer cr_luma_mult(@NativeType("uint8_t") byte value) { StdVideoAV1FilmGrain.ncr_luma_mult(address(), value); return this; }
        /** Sets the specified value to the {@code cr_offset} field. */
        public StdVideoAV1FilmGrain.Buffer cr_offset(@NativeType("uint16_t") short value) { StdVideoAV1FilmGrain.ncr_offset(address(), value); return this; }

    }

}