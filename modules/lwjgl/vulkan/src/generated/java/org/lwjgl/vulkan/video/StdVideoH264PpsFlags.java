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
 * struct StdVideoH264PpsFlags {
 *     uint32_t transform_8x8_mode_flag : 1;
 *     uint32_t redundant_pic_cnt_present_flag : 1;
 *     uint32_t constrained_intra_pred_flag : 1;
 *     uint32_t deblocking_filter_control_present_flag : 1;
 *     uint32_t weighted_bipred_idc_flag : 1;
 *     uint32_t weighted_pred_flag : 1;
 *     uint32_t pic_order_present_flag : 1;
 *     uint32_t entropy_coding_mode_flag : 1;
 *     uint32_t pic_scaling_matrix_present_flag : 1;
 * }</code></pre>
 */
public class StdVideoH264PpsFlags extends Struct implements NativeResource {

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
     * Creates a {@code StdVideoH264PpsFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH264PpsFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code transform_8x8_mode_flag} field. */
    @NativeType("uint32_t")
    public boolean transform_8x8_mode_flag() { return ntransform_8x8_mode_flag(address()) != 0; }
    /** @return the value of the {@code redundant_pic_cnt_present_flag} field. */
    @NativeType("uint32_t")
    public boolean redundant_pic_cnt_present_flag() { return nredundant_pic_cnt_present_flag(address()) != 0; }
    /** @return the value of the {@code constrained_intra_pred_flag} field. */
    @NativeType("uint32_t")
    public boolean constrained_intra_pred_flag() { return nconstrained_intra_pred_flag(address()) != 0; }
    /** @return the value of the {@code deblocking_filter_control_present_flag} field. */
    @NativeType("uint32_t")
    public boolean deblocking_filter_control_present_flag() { return ndeblocking_filter_control_present_flag(address()) != 0; }
    /** @return the value of the {@code weighted_bipred_idc_flag} field. */
    @NativeType("uint32_t")
    public boolean weighted_bipred_idc_flag() { return nweighted_bipred_idc_flag(address()) != 0; }
    /** @return the value of the {@code weighted_pred_flag} field. */
    @NativeType("uint32_t")
    public boolean weighted_pred_flag() { return nweighted_pred_flag(address()) != 0; }
    /** @return the value of the {@code pic_order_present_flag} field. */
    @NativeType("uint32_t")
    public boolean pic_order_present_flag() { return npic_order_present_flag(address()) != 0; }
    /** @return the value of the {@code entropy_coding_mode_flag} field. */
    @NativeType("uint32_t")
    public boolean entropy_coding_mode_flag() { return nentropy_coding_mode_flag(address()) != 0; }
    /** @return the value of the {@code pic_scaling_matrix_present_flag} field. */
    @NativeType("uint32_t")
    public boolean pic_scaling_matrix_present_flag() { return npic_scaling_matrix_present_flag(address()) != 0; }

    /** Sets the specified value to the {@code transform_8x8_mode_flag} field. */
    public StdVideoH264PpsFlags transform_8x8_mode_flag(@NativeType("uint32_t") boolean value) { ntransform_8x8_mode_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code redundant_pic_cnt_present_flag} field. */
    public StdVideoH264PpsFlags redundant_pic_cnt_present_flag(@NativeType("uint32_t") boolean value) { nredundant_pic_cnt_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code constrained_intra_pred_flag} field. */
    public StdVideoH264PpsFlags constrained_intra_pred_flag(@NativeType("uint32_t") boolean value) { nconstrained_intra_pred_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code deblocking_filter_control_present_flag} field. */
    public StdVideoH264PpsFlags deblocking_filter_control_present_flag(@NativeType("uint32_t") boolean value) { ndeblocking_filter_control_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code weighted_bipred_idc_flag} field. */
    public StdVideoH264PpsFlags weighted_bipred_idc_flag(@NativeType("uint32_t") boolean value) { nweighted_bipred_idc_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code weighted_pred_flag} field. */
    public StdVideoH264PpsFlags weighted_pred_flag(@NativeType("uint32_t") boolean value) { nweighted_pred_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pic_order_present_flag} field. */
    public StdVideoH264PpsFlags pic_order_present_flag(@NativeType("uint32_t") boolean value) { npic_order_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code entropy_coding_mode_flag} field. */
    public StdVideoH264PpsFlags entropy_coding_mode_flag(@NativeType("uint32_t") boolean value) { nentropy_coding_mode_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pic_scaling_matrix_present_flag} field. */
    public StdVideoH264PpsFlags pic_scaling_matrix_present_flag(@NativeType("uint32_t") boolean value) { npic_scaling_matrix_present_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH264PpsFlags set(
        boolean transform_8x8_mode_flag,
        boolean redundant_pic_cnt_present_flag,
        boolean constrained_intra_pred_flag,
        boolean deblocking_filter_control_present_flag,
        boolean weighted_bipred_idc_flag,
        boolean weighted_pred_flag,
        boolean pic_order_present_flag,
        boolean entropy_coding_mode_flag,
        boolean pic_scaling_matrix_present_flag
    ) {
        transform_8x8_mode_flag(transform_8x8_mode_flag);
        redundant_pic_cnt_present_flag(redundant_pic_cnt_present_flag);
        constrained_intra_pred_flag(constrained_intra_pred_flag);
        deblocking_filter_control_present_flag(deblocking_filter_control_present_flag);
        weighted_bipred_idc_flag(weighted_bipred_idc_flag);
        weighted_pred_flag(weighted_pred_flag);
        pic_order_present_flag(pic_order_present_flag);
        entropy_coding_mode_flag(entropy_coding_mode_flag);
        pic_scaling_matrix_present_flag(pic_scaling_matrix_present_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH264PpsFlags set(StdVideoH264PpsFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH264PpsFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH264PpsFlags malloc() {
        return wrap(StdVideoH264PpsFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH264PpsFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH264PpsFlags calloc() {
        return wrap(StdVideoH264PpsFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH264PpsFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoH264PpsFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH264PpsFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH264PpsFlags} instance for the specified memory address. */
    public static StdVideoH264PpsFlags create(long address) {
        return wrap(StdVideoH264PpsFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264PpsFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH264PpsFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoH264PpsFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PpsFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264PpsFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PpsFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264PpsFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PpsFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH264PpsFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PpsFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264PpsFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH264PpsFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264PpsFlags malloc(MemoryStack stack) {
        return wrap(StdVideoH264PpsFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH264PpsFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264PpsFlags calloc(MemoryStack stack) {
        return wrap(StdVideoH264PpsFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH264PpsFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PpsFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264PpsFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PpsFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264PpsFlags.BITFIELD0); }
    /** Unsafe version of {@link #transform_8x8_mode_flag}. */
    public static int ntransform_8x8_mode_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #redundant_pic_cnt_present_flag}. */
    public static int nredundant_pic_cnt_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #constrained_intra_pred_flag}. */
    public static int nconstrained_intra_pred_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #deblocking_filter_control_present_flag}. */
    public static int ndeblocking_filter_control_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #weighted_bipred_idc_flag}. */
    public static int nweighted_bipred_idc_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #weighted_pred_flag}. */
    public static int nweighted_pred_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #pic_order_present_flag}. */
    public static int npic_order_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #entropy_coding_mode_flag}. */
    public static int nentropy_coding_mode_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #pic_scaling_matrix_present_flag}. */
    public static int npic_scaling_matrix_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264PpsFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #transform_8x8_mode_flag(boolean) transform_8x8_mode_flag}. */
    public static void ntransform_8x8_mode_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #redundant_pic_cnt_present_flag(boolean) redundant_pic_cnt_present_flag}. */
    public static void nredundant_pic_cnt_present_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #constrained_intra_pred_flag(boolean) constrained_intra_pred_flag}. */
    public static void nconstrained_intra_pred_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #deblocking_filter_control_present_flag(boolean) deblocking_filter_control_present_flag}. */
    public static void ndeblocking_filter_control_present_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #weighted_bipred_idc_flag(boolean) weighted_bipred_idc_flag}. */
    public static void nweighted_bipred_idc_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #weighted_pred_flag(boolean) weighted_pred_flag}. */
    public static void nweighted_pred_flag(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #pic_order_present_flag(boolean) pic_order_present_flag}. */
    public static void npic_order_present_flag(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #entropy_coding_mode_flag(boolean) entropy_coding_mode_flag}. */
    public static void nentropy_coding_mode_flag(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #pic_scaling_matrix_present_flag(boolean) pic_scaling_matrix_present_flag}. */
    public static void npic_scaling_matrix_present_flag(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoH264PpsFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoH264PpsFlags, Buffer> implements NativeResource {

        private static final StdVideoH264PpsFlags ELEMENT_FACTORY = StdVideoH264PpsFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoH264PpsFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH264PpsFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH264PpsFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code transform_8x8_mode_flag} field. */
        @NativeType("uint32_t")
        public boolean transform_8x8_mode_flag() { return StdVideoH264PpsFlags.ntransform_8x8_mode_flag(address()) != 0; }
        /** @return the value of the {@code redundant_pic_cnt_present_flag} field. */
        @NativeType("uint32_t")
        public boolean redundant_pic_cnt_present_flag() { return StdVideoH264PpsFlags.nredundant_pic_cnt_present_flag(address()) != 0; }
        /** @return the value of the {@code constrained_intra_pred_flag} field. */
        @NativeType("uint32_t")
        public boolean constrained_intra_pred_flag() { return StdVideoH264PpsFlags.nconstrained_intra_pred_flag(address()) != 0; }
        /** @return the value of the {@code deblocking_filter_control_present_flag} field. */
        @NativeType("uint32_t")
        public boolean deblocking_filter_control_present_flag() { return StdVideoH264PpsFlags.ndeblocking_filter_control_present_flag(address()) != 0; }
        /** @return the value of the {@code weighted_bipred_idc_flag} field. */
        @NativeType("uint32_t")
        public boolean weighted_bipred_idc_flag() { return StdVideoH264PpsFlags.nweighted_bipred_idc_flag(address()) != 0; }
        /** @return the value of the {@code weighted_pred_flag} field. */
        @NativeType("uint32_t")
        public boolean weighted_pred_flag() { return StdVideoH264PpsFlags.nweighted_pred_flag(address()) != 0; }
        /** @return the value of the {@code pic_order_present_flag} field. */
        @NativeType("uint32_t")
        public boolean pic_order_present_flag() { return StdVideoH264PpsFlags.npic_order_present_flag(address()) != 0; }
        /** @return the value of the {@code entropy_coding_mode_flag} field. */
        @NativeType("uint32_t")
        public boolean entropy_coding_mode_flag() { return StdVideoH264PpsFlags.nentropy_coding_mode_flag(address()) != 0; }
        /** @return the value of the {@code pic_scaling_matrix_present_flag} field. */
        @NativeType("uint32_t")
        public boolean pic_scaling_matrix_present_flag() { return StdVideoH264PpsFlags.npic_scaling_matrix_present_flag(address()) != 0; }

        /** Sets the specified value to the {@code transform_8x8_mode_flag} field. */
        public StdVideoH264PpsFlags.Buffer transform_8x8_mode_flag(@NativeType("uint32_t") boolean value) { StdVideoH264PpsFlags.ntransform_8x8_mode_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code redundant_pic_cnt_present_flag} field. */
        public StdVideoH264PpsFlags.Buffer redundant_pic_cnt_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264PpsFlags.nredundant_pic_cnt_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code constrained_intra_pred_flag} field. */
        public StdVideoH264PpsFlags.Buffer constrained_intra_pred_flag(@NativeType("uint32_t") boolean value) { StdVideoH264PpsFlags.nconstrained_intra_pred_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code deblocking_filter_control_present_flag} field. */
        public StdVideoH264PpsFlags.Buffer deblocking_filter_control_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264PpsFlags.ndeblocking_filter_control_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code weighted_bipred_idc_flag} field. */
        public StdVideoH264PpsFlags.Buffer weighted_bipred_idc_flag(@NativeType("uint32_t") boolean value) { StdVideoH264PpsFlags.nweighted_bipred_idc_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code weighted_pred_flag} field. */
        public StdVideoH264PpsFlags.Buffer weighted_pred_flag(@NativeType("uint32_t") boolean value) { StdVideoH264PpsFlags.nweighted_pred_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pic_order_present_flag} field. */
        public StdVideoH264PpsFlags.Buffer pic_order_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264PpsFlags.npic_order_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code entropy_coding_mode_flag} field. */
        public StdVideoH264PpsFlags.Buffer entropy_coding_mode_flag(@NativeType("uint32_t") boolean value) { StdVideoH264PpsFlags.nentropy_coding_mode_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pic_scaling_matrix_present_flag} field. */
        public StdVideoH264PpsFlags.Buffer pic_scaling_matrix_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264PpsFlags.npic_scaling_matrix_present_flag(address(), value ? 1 : 0); return this; }

    }

}