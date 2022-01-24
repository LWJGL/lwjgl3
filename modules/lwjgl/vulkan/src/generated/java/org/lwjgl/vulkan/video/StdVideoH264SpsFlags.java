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
 * struct StdVideoH264SpsFlags {
 *     uint32_t constraint_set0_flag : 1;
 *     uint32_t constraint_set1_flag : 1;
 *     uint32_t constraint_set2_flag : 1;
 *     uint32_t constraint_set3_flag : 1;
 *     uint32_t constraint_set4_flag : 1;
 *     uint32_t constraint_set5_flag : 1;
 *     uint32_t direct_8x8_inference_flag : 1;
 *     uint32_t mb_adaptive_frame_field_flag : 1;
 *     uint32_t frame_mbs_only_flag : 1;
 *     uint32_t delta_pic_order_always_zero_flag : 1;
 *     uint32_t separate_colour_plane_flag : 1;
 *     uint32_t gaps_in_frame_num_value_allowed_flag : 1;
 *     uint32_t qpprime_y_zero_transform_bypass_flag : 1;
 *     uint32_t frame_cropping_flag : 1;
 *     uint32_t seq_scaling_matrix_present_flag : 1;
 *     uint32_t vui_parameters_present_flag : 1;
 * }</code></pre>
 */
public class StdVideoH264SpsFlags extends Struct implements NativeResource {

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
     * Creates a {@code StdVideoH264SpsFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH264SpsFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code constraint_set0_flag} field. */
    @NativeType("uint32_t")
    public boolean constraint_set0_flag() { return nconstraint_set0_flag(address()) != 0; }
    /** @return the value of the {@code constraint_set1_flag} field. */
    @NativeType("uint32_t")
    public boolean constraint_set1_flag() { return nconstraint_set1_flag(address()) != 0; }
    /** @return the value of the {@code constraint_set2_flag} field. */
    @NativeType("uint32_t")
    public boolean constraint_set2_flag() { return nconstraint_set2_flag(address()) != 0; }
    /** @return the value of the {@code constraint_set3_flag} field. */
    @NativeType("uint32_t")
    public boolean constraint_set3_flag() { return nconstraint_set3_flag(address()) != 0; }
    /** @return the value of the {@code constraint_set4_flag} field. */
    @NativeType("uint32_t")
    public boolean constraint_set4_flag() { return nconstraint_set4_flag(address()) != 0; }
    /** @return the value of the {@code constraint_set5_flag} field. */
    @NativeType("uint32_t")
    public boolean constraint_set5_flag() { return nconstraint_set5_flag(address()) != 0; }
    /** @return the value of the {@code direct_8x8_inference_flag} field. */
    @NativeType("uint32_t")
    public boolean direct_8x8_inference_flag() { return ndirect_8x8_inference_flag(address()) != 0; }
    /** @return the value of the {@code mb_adaptive_frame_field_flag} field. */
    @NativeType("uint32_t")
    public boolean mb_adaptive_frame_field_flag() { return nmb_adaptive_frame_field_flag(address()) != 0; }
    /** @return the value of the {@code frame_mbs_only_flag} field. */
    @NativeType("uint32_t")
    public boolean frame_mbs_only_flag() { return nframe_mbs_only_flag(address()) != 0; }
    /** @return the value of the {@code delta_pic_order_always_zero_flag} field. */
    @NativeType("uint32_t")
    public boolean delta_pic_order_always_zero_flag() { return ndelta_pic_order_always_zero_flag(address()) != 0; }
    /** @return the value of the {@code separate_colour_plane_flag} field. */
    @NativeType("uint32_t")
    public boolean separate_colour_plane_flag() { return nseparate_colour_plane_flag(address()) != 0; }
    /** @return the value of the {@code gaps_in_frame_num_value_allowed_flag} field. */
    @NativeType("uint32_t")
    public boolean gaps_in_frame_num_value_allowed_flag() { return ngaps_in_frame_num_value_allowed_flag(address()) != 0; }
    /** @return the value of the {@code qpprime_y_zero_transform_bypass_flag} field. */
    @NativeType("uint32_t")
    public boolean qpprime_y_zero_transform_bypass_flag() { return nqpprime_y_zero_transform_bypass_flag(address()) != 0; }
    /** @return the value of the {@code frame_cropping_flag} field. */
    @NativeType("uint32_t")
    public boolean frame_cropping_flag() { return nframe_cropping_flag(address()) != 0; }
    /** @return the value of the {@code seq_scaling_matrix_present_flag} field. */
    @NativeType("uint32_t")
    public boolean seq_scaling_matrix_present_flag() { return nseq_scaling_matrix_present_flag(address()) != 0; }
    /** @return the value of the {@code vui_parameters_present_flag} field. */
    @NativeType("uint32_t")
    public boolean vui_parameters_present_flag() { return nvui_parameters_present_flag(address()) != 0; }

    /** Sets the specified value to the {@code constraint_set0_flag} field. */
    public StdVideoH264SpsFlags constraint_set0_flag(@NativeType("uint32_t") boolean value) { nconstraint_set0_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code constraint_set1_flag} field. */
    public StdVideoH264SpsFlags constraint_set1_flag(@NativeType("uint32_t") boolean value) { nconstraint_set1_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code constraint_set2_flag} field. */
    public StdVideoH264SpsFlags constraint_set2_flag(@NativeType("uint32_t") boolean value) { nconstraint_set2_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code constraint_set3_flag} field. */
    public StdVideoH264SpsFlags constraint_set3_flag(@NativeType("uint32_t") boolean value) { nconstraint_set3_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code constraint_set4_flag} field. */
    public StdVideoH264SpsFlags constraint_set4_flag(@NativeType("uint32_t") boolean value) { nconstraint_set4_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code constraint_set5_flag} field. */
    public StdVideoH264SpsFlags constraint_set5_flag(@NativeType("uint32_t") boolean value) { nconstraint_set5_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code direct_8x8_inference_flag} field. */
    public StdVideoH264SpsFlags direct_8x8_inference_flag(@NativeType("uint32_t") boolean value) { ndirect_8x8_inference_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code mb_adaptive_frame_field_flag} field. */
    public StdVideoH264SpsFlags mb_adaptive_frame_field_flag(@NativeType("uint32_t") boolean value) { nmb_adaptive_frame_field_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code frame_mbs_only_flag} field. */
    public StdVideoH264SpsFlags frame_mbs_only_flag(@NativeType("uint32_t") boolean value) { nframe_mbs_only_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code delta_pic_order_always_zero_flag} field. */
    public StdVideoH264SpsFlags delta_pic_order_always_zero_flag(@NativeType("uint32_t") boolean value) { ndelta_pic_order_always_zero_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code separate_colour_plane_flag} field. */
    public StdVideoH264SpsFlags separate_colour_plane_flag(@NativeType("uint32_t") boolean value) { nseparate_colour_plane_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code gaps_in_frame_num_value_allowed_flag} field. */
    public StdVideoH264SpsFlags gaps_in_frame_num_value_allowed_flag(@NativeType("uint32_t") boolean value) { ngaps_in_frame_num_value_allowed_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code qpprime_y_zero_transform_bypass_flag} field. */
    public StdVideoH264SpsFlags qpprime_y_zero_transform_bypass_flag(@NativeType("uint32_t") boolean value) { nqpprime_y_zero_transform_bypass_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code frame_cropping_flag} field. */
    public StdVideoH264SpsFlags frame_cropping_flag(@NativeType("uint32_t") boolean value) { nframe_cropping_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code seq_scaling_matrix_present_flag} field. */
    public StdVideoH264SpsFlags seq_scaling_matrix_present_flag(@NativeType("uint32_t") boolean value) { nseq_scaling_matrix_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vui_parameters_present_flag} field. */
    public StdVideoH264SpsFlags vui_parameters_present_flag(@NativeType("uint32_t") boolean value) { nvui_parameters_present_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH264SpsFlags set(
        boolean constraint_set0_flag,
        boolean constraint_set1_flag,
        boolean constraint_set2_flag,
        boolean constraint_set3_flag,
        boolean constraint_set4_flag,
        boolean constraint_set5_flag,
        boolean direct_8x8_inference_flag,
        boolean mb_adaptive_frame_field_flag,
        boolean frame_mbs_only_flag,
        boolean delta_pic_order_always_zero_flag,
        boolean separate_colour_plane_flag,
        boolean gaps_in_frame_num_value_allowed_flag,
        boolean qpprime_y_zero_transform_bypass_flag,
        boolean frame_cropping_flag,
        boolean seq_scaling_matrix_present_flag,
        boolean vui_parameters_present_flag
    ) {
        constraint_set0_flag(constraint_set0_flag);
        constraint_set1_flag(constraint_set1_flag);
        constraint_set2_flag(constraint_set2_flag);
        constraint_set3_flag(constraint_set3_flag);
        constraint_set4_flag(constraint_set4_flag);
        constraint_set5_flag(constraint_set5_flag);
        direct_8x8_inference_flag(direct_8x8_inference_flag);
        mb_adaptive_frame_field_flag(mb_adaptive_frame_field_flag);
        frame_mbs_only_flag(frame_mbs_only_flag);
        delta_pic_order_always_zero_flag(delta_pic_order_always_zero_flag);
        separate_colour_plane_flag(separate_colour_plane_flag);
        gaps_in_frame_num_value_allowed_flag(gaps_in_frame_num_value_allowed_flag);
        qpprime_y_zero_transform_bypass_flag(qpprime_y_zero_transform_bypass_flag);
        frame_cropping_flag(frame_cropping_flag);
        seq_scaling_matrix_present_flag(seq_scaling_matrix_present_flag);
        vui_parameters_present_flag(vui_parameters_present_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH264SpsFlags set(StdVideoH264SpsFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH264SpsFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH264SpsFlags malloc() {
        return wrap(StdVideoH264SpsFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH264SpsFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH264SpsFlags calloc() {
        return wrap(StdVideoH264SpsFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH264SpsFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoH264SpsFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH264SpsFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH264SpsFlags} instance for the specified memory address. */
    public static StdVideoH264SpsFlags create(long address) {
        return wrap(StdVideoH264SpsFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264SpsFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH264SpsFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoH264SpsFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SpsFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SpsFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH264SpsFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264SpsFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH264SpsFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264SpsFlags malloc(MemoryStack stack) {
        return wrap(StdVideoH264SpsFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH264SpsFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264SpsFlags calloc(MemoryStack stack) {
        return wrap(StdVideoH264SpsFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH264SpsFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SpsFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SpsFlags.BITFIELD0); }
    /** Unsafe version of {@link #constraint_set0_flag}. */
    public static int nconstraint_set0_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #constraint_set1_flag}. */
    public static int nconstraint_set1_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #constraint_set2_flag}. */
    public static int nconstraint_set2_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #constraint_set3_flag}. */
    public static int nconstraint_set3_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #constraint_set4_flag}. */
    public static int nconstraint_set4_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #constraint_set5_flag}. */
    public static int nconstraint_set5_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #direct_8x8_inference_flag}. */
    public static int ndirect_8x8_inference_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #mb_adaptive_frame_field_flag}. */
    public static int nmb_adaptive_frame_field_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #frame_mbs_only_flag}. */
    public static int nframe_mbs_only_flag(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }
    /** Unsafe version of {@link #delta_pic_order_always_zero_flag}. */
    public static int ndelta_pic_order_always_zero_flag(long struct) { return (nbitfield0(struct) & 0x00_00_02_00) >>> 9; }
    /** Unsafe version of {@link #separate_colour_plane_flag}. */
    public static int nseparate_colour_plane_flag(long struct) { return (nbitfield0(struct) & 0x00_00_04_00) >>> 10; }
    /** Unsafe version of {@link #gaps_in_frame_num_value_allowed_flag}. */
    public static int ngaps_in_frame_num_value_allowed_flag(long struct) { return (nbitfield0(struct) & 0x00_00_08_00) >>> 11; }
    /** Unsafe version of {@link #qpprime_y_zero_transform_bypass_flag}. */
    public static int nqpprime_y_zero_transform_bypass_flag(long struct) { return (nbitfield0(struct) & 0x00_00_10_00) >>> 12; }
    /** Unsafe version of {@link #frame_cropping_flag}. */
    public static int nframe_cropping_flag(long struct) { return (nbitfield0(struct) & 0x00_00_20_00) >>> 13; }
    /** Unsafe version of {@link #seq_scaling_matrix_present_flag}. */
    public static int nseq_scaling_matrix_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_40_00) >>> 14; }
    /** Unsafe version of {@link #vui_parameters_present_flag}. */
    public static int nvui_parameters_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_80_00) >>> 15; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SpsFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #constraint_set0_flag(boolean) constraint_set0_flag}. */
    public static void nconstraint_set0_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #constraint_set1_flag(boolean) constraint_set1_flag}. */
    public static void nconstraint_set1_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #constraint_set2_flag(boolean) constraint_set2_flag}. */
    public static void nconstraint_set2_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #constraint_set3_flag(boolean) constraint_set3_flag}. */
    public static void nconstraint_set3_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #constraint_set4_flag(boolean) constraint_set4_flag}. */
    public static void nconstraint_set4_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #constraint_set5_flag(boolean) constraint_set5_flag}. */
    public static void nconstraint_set5_flag(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #direct_8x8_inference_flag(boolean) direct_8x8_inference_flag}. */
    public static void ndirect_8x8_inference_flag(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #mb_adaptive_frame_field_flag(boolean) mb_adaptive_frame_field_flag}. */
    public static void nmb_adaptive_frame_field_flag(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #frame_mbs_only_flag(boolean) frame_mbs_only_flag}. */
    public static void nframe_mbs_only_flag(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }
    /** Unsafe version of {@link #delta_pic_order_always_zero_flag(boolean) delta_pic_order_always_zero_flag}. */
    public static void ndelta_pic_order_always_zero_flag(long struct, int value) { nbitfield0(struct, ((value << 9) & 0x00_00_02_00) | (nbitfield0(struct) & 0xFF_FF_FD_FF)); }
    /** Unsafe version of {@link #separate_colour_plane_flag(boolean) separate_colour_plane_flag}. */
    public static void nseparate_colour_plane_flag(long struct, int value) { nbitfield0(struct, ((value << 10) & 0x00_00_04_00) | (nbitfield0(struct) & 0xFF_FF_FB_FF)); }
    /** Unsafe version of {@link #gaps_in_frame_num_value_allowed_flag(boolean) gaps_in_frame_num_value_allowed_flag}. */
    public static void ngaps_in_frame_num_value_allowed_flag(long struct, int value) { nbitfield0(struct, ((value << 11) & 0x00_00_08_00) | (nbitfield0(struct) & 0xFF_FF_F7_FF)); }
    /** Unsafe version of {@link #qpprime_y_zero_transform_bypass_flag(boolean) qpprime_y_zero_transform_bypass_flag}. */
    public static void nqpprime_y_zero_transform_bypass_flag(long struct, int value) { nbitfield0(struct, ((value << 12) & 0x00_00_10_00) | (nbitfield0(struct) & 0xFF_FF_EF_FF)); }
    /** Unsafe version of {@link #frame_cropping_flag(boolean) frame_cropping_flag}. */
    public static void nframe_cropping_flag(long struct, int value) { nbitfield0(struct, ((value << 13) & 0x00_00_20_00) | (nbitfield0(struct) & 0xFF_FF_DF_FF)); }
    /** Unsafe version of {@link #seq_scaling_matrix_present_flag(boolean) seq_scaling_matrix_present_flag}. */
    public static void nseq_scaling_matrix_present_flag(long struct, int value) { nbitfield0(struct, ((value << 14) & 0x00_00_40_00) | (nbitfield0(struct) & 0xFF_FF_BF_FF)); }
    /** Unsafe version of {@link #vui_parameters_present_flag(boolean) vui_parameters_present_flag}. */
    public static void nvui_parameters_present_flag(long struct, int value) { nbitfield0(struct, ((value << 15) & 0x00_00_80_00) | (nbitfield0(struct) & 0xFF_FF_7F_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoH264SpsFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoH264SpsFlags, Buffer> implements NativeResource {

        private static final StdVideoH264SpsFlags ELEMENT_FACTORY = StdVideoH264SpsFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoH264SpsFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH264SpsFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH264SpsFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code constraint_set0_flag} field. */
        @NativeType("uint32_t")
        public boolean constraint_set0_flag() { return StdVideoH264SpsFlags.nconstraint_set0_flag(address()) != 0; }
        /** @return the value of the {@code constraint_set1_flag} field. */
        @NativeType("uint32_t")
        public boolean constraint_set1_flag() { return StdVideoH264SpsFlags.nconstraint_set1_flag(address()) != 0; }
        /** @return the value of the {@code constraint_set2_flag} field. */
        @NativeType("uint32_t")
        public boolean constraint_set2_flag() { return StdVideoH264SpsFlags.nconstraint_set2_flag(address()) != 0; }
        /** @return the value of the {@code constraint_set3_flag} field. */
        @NativeType("uint32_t")
        public boolean constraint_set3_flag() { return StdVideoH264SpsFlags.nconstraint_set3_flag(address()) != 0; }
        /** @return the value of the {@code constraint_set4_flag} field. */
        @NativeType("uint32_t")
        public boolean constraint_set4_flag() { return StdVideoH264SpsFlags.nconstraint_set4_flag(address()) != 0; }
        /** @return the value of the {@code constraint_set5_flag} field. */
        @NativeType("uint32_t")
        public boolean constraint_set5_flag() { return StdVideoH264SpsFlags.nconstraint_set5_flag(address()) != 0; }
        /** @return the value of the {@code direct_8x8_inference_flag} field. */
        @NativeType("uint32_t")
        public boolean direct_8x8_inference_flag() { return StdVideoH264SpsFlags.ndirect_8x8_inference_flag(address()) != 0; }
        /** @return the value of the {@code mb_adaptive_frame_field_flag} field. */
        @NativeType("uint32_t")
        public boolean mb_adaptive_frame_field_flag() { return StdVideoH264SpsFlags.nmb_adaptive_frame_field_flag(address()) != 0; }
        /** @return the value of the {@code frame_mbs_only_flag} field. */
        @NativeType("uint32_t")
        public boolean frame_mbs_only_flag() { return StdVideoH264SpsFlags.nframe_mbs_only_flag(address()) != 0; }
        /** @return the value of the {@code delta_pic_order_always_zero_flag} field. */
        @NativeType("uint32_t")
        public boolean delta_pic_order_always_zero_flag() { return StdVideoH264SpsFlags.ndelta_pic_order_always_zero_flag(address()) != 0; }
        /** @return the value of the {@code separate_colour_plane_flag} field. */
        @NativeType("uint32_t")
        public boolean separate_colour_plane_flag() { return StdVideoH264SpsFlags.nseparate_colour_plane_flag(address()) != 0; }
        /** @return the value of the {@code gaps_in_frame_num_value_allowed_flag} field. */
        @NativeType("uint32_t")
        public boolean gaps_in_frame_num_value_allowed_flag() { return StdVideoH264SpsFlags.ngaps_in_frame_num_value_allowed_flag(address()) != 0; }
        /** @return the value of the {@code qpprime_y_zero_transform_bypass_flag} field. */
        @NativeType("uint32_t")
        public boolean qpprime_y_zero_transform_bypass_flag() { return StdVideoH264SpsFlags.nqpprime_y_zero_transform_bypass_flag(address()) != 0; }
        /** @return the value of the {@code frame_cropping_flag} field. */
        @NativeType("uint32_t")
        public boolean frame_cropping_flag() { return StdVideoH264SpsFlags.nframe_cropping_flag(address()) != 0; }
        /** @return the value of the {@code seq_scaling_matrix_present_flag} field. */
        @NativeType("uint32_t")
        public boolean seq_scaling_matrix_present_flag() { return StdVideoH264SpsFlags.nseq_scaling_matrix_present_flag(address()) != 0; }
        /** @return the value of the {@code vui_parameters_present_flag} field. */
        @NativeType("uint32_t")
        public boolean vui_parameters_present_flag() { return StdVideoH264SpsFlags.nvui_parameters_present_flag(address()) != 0; }

        /** Sets the specified value to the {@code constraint_set0_flag} field. */
        public StdVideoH264SpsFlags.Buffer constraint_set0_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nconstraint_set0_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code constraint_set1_flag} field. */
        public StdVideoH264SpsFlags.Buffer constraint_set1_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nconstraint_set1_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code constraint_set2_flag} field. */
        public StdVideoH264SpsFlags.Buffer constraint_set2_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nconstraint_set2_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code constraint_set3_flag} field. */
        public StdVideoH264SpsFlags.Buffer constraint_set3_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nconstraint_set3_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code constraint_set4_flag} field. */
        public StdVideoH264SpsFlags.Buffer constraint_set4_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nconstraint_set4_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code constraint_set5_flag} field. */
        public StdVideoH264SpsFlags.Buffer constraint_set5_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nconstraint_set5_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code direct_8x8_inference_flag} field. */
        public StdVideoH264SpsFlags.Buffer direct_8x8_inference_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.ndirect_8x8_inference_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code mb_adaptive_frame_field_flag} field. */
        public StdVideoH264SpsFlags.Buffer mb_adaptive_frame_field_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nmb_adaptive_frame_field_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code frame_mbs_only_flag} field. */
        public StdVideoH264SpsFlags.Buffer frame_mbs_only_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nframe_mbs_only_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code delta_pic_order_always_zero_flag} field. */
        public StdVideoH264SpsFlags.Buffer delta_pic_order_always_zero_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.ndelta_pic_order_always_zero_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code separate_colour_plane_flag} field. */
        public StdVideoH264SpsFlags.Buffer separate_colour_plane_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nseparate_colour_plane_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code gaps_in_frame_num_value_allowed_flag} field. */
        public StdVideoH264SpsFlags.Buffer gaps_in_frame_num_value_allowed_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.ngaps_in_frame_num_value_allowed_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code qpprime_y_zero_transform_bypass_flag} field. */
        public StdVideoH264SpsFlags.Buffer qpprime_y_zero_transform_bypass_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nqpprime_y_zero_transform_bypass_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code frame_cropping_flag} field. */
        public StdVideoH264SpsFlags.Buffer frame_cropping_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nframe_cropping_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code seq_scaling_matrix_present_flag} field. */
        public StdVideoH264SpsFlags.Buffer seq_scaling_matrix_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nseq_scaling_matrix_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vui_parameters_present_flag} field. */
        public StdVideoH264SpsFlags.Buffer vui_parameters_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsFlags.nvui_parameters_present_flag(address(), value ? 1 : 0); return this; }

    }

}