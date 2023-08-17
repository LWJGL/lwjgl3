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
 * struct StdVideoEncodeH265PictureInfoFlags {
 *     uint32_t is_reference : 1;
 *     uint32_t IrapPicFlag : 1;
 *     uint32_t used_for_long_term_reference : 1;
 *     uint32_t discardable_flag : 1;
 *     uint32_t cross_layer_bla_flag : 1;
 *     uint32_t pic_output_flag : 1;
 *     uint32_t no_output_of_prior_pics_flag : 1;
 *     uint32_t short_term_ref_pic_set_sps_flag : 1;
 *     uint32_t slice_temporal_mvp_enabled_flag : 1;
 *     uint32_t reserved : 23;
 * }</code></pre>
 */
public class StdVideoEncodeH265PictureInfoFlags extends Struct<StdVideoEncodeH265PictureInfoFlags> implements NativeResource {

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

    protected StdVideoEncodeH265PictureInfoFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH265PictureInfoFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH265PictureInfoFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH265PictureInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265PictureInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code is_reference} field. */
    @NativeType("uint32_t")
    public boolean is_reference() { return nis_reference(address()) != 0; }
    /** @return the value of the {@code IrapPicFlag} field. */
    @NativeType("uint32_t")
    public boolean IrapPicFlag() { return nIrapPicFlag(address()) != 0; }
    /** @return the value of the {@code used_for_long_term_reference} field. */
    @NativeType("uint32_t")
    public boolean used_for_long_term_reference() { return nused_for_long_term_reference(address()) != 0; }
    /** @return the value of the {@code discardable_flag} field. */
    @NativeType("uint32_t")
    public boolean discardable_flag() { return ndiscardable_flag(address()) != 0; }
    /** @return the value of the {@code cross_layer_bla_flag} field. */
    @NativeType("uint32_t")
    public boolean cross_layer_bla_flag() { return ncross_layer_bla_flag(address()) != 0; }
    /** @return the value of the {@code pic_output_flag} field. */
    @NativeType("uint32_t")
    public boolean pic_output_flag() { return npic_output_flag(address()) != 0; }
    /** @return the value of the {@code no_output_of_prior_pics_flag} field. */
    @NativeType("uint32_t")
    public boolean no_output_of_prior_pics_flag() { return nno_output_of_prior_pics_flag(address()) != 0; }
    /** @return the value of the {@code short_term_ref_pic_set_sps_flag} field. */
    @NativeType("uint32_t")
    public boolean short_term_ref_pic_set_sps_flag() { return nshort_term_ref_pic_set_sps_flag(address()) != 0; }
    /** @return the value of the {@code slice_temporal_mvp_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean slice_temporal_mvp_enabled_flag() { return nslice_temporal_mvp_enabled_flag(address()) != 0; }

    /** Sets the specified value to the {@code is_reference} field. */
    public StdVideoEncodeH265PictureInfoFlags is_reference(@NativeType("uint32_t") boolean value) { nis_reference(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code IrapPicFlag} field. */
    public StdVideoEncodeH265PictureInfoFlags IrapPicFlag(@NativeType("uint32_t") boolean value) { nIrapPicFlag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code used_for_long_term_reference} field. */
    public StdVideoEncodeH265PictureInfoFlags used_for_long_term_reference(@NativeType("uint32_t") boolean value) { nused_for_long_term_reference(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code discardable_flag} field. */
    public StdVideoEncodeH265PictureInfoFlags discardable_flag(@NativeType("uint32_t") boolean value) { ndiscardable_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cross_layer_bla_flag} field. */
    public StdVideoEncodeH265PictureInfoFlags cross_layer_bla_flag(@NativeType("uint32_t") boolean value) { ncross_layer_bla_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pic_output_flag} field. */
    public StdVideoEncodeH265PictureInfoFlags pic_output_flag(@NativeType("uint32_t") boolean value) { npic_output_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code no_output_of_prior_pics_flag} field. */
    public StdVideoEncodeH265PictureInfoFlags no_output_of_prior_pics_flag(@NativeType("uint32_t") boolean value) { nno_output_of_prior_pics_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code short_term_ref_pic_set_sps_flag} field. */
    public StdVideoEncodeH265PictureInfoFlags short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") boolean value) { nshort_term_ref_pic_set_sps_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code slice_temporal_mvp_enabled_flag} field. */
    public StdVideoEncodeH265PictureInfoFlags slice_temporal_mvp_enabled_flag(@NativeType("uint32_t") boolean value) { nslice_temporal_mvp_enabled_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265PictureInfoFlags set(
        boolean is_reference,
        boolean IrapPicFlag,
        boolean used_for_long_term_reference,
        boolean discardable_flag,
        boolean cross_layer_bla_flag,
        boolean pic_output_flag,
        boolean no_output_of_prior_pics_flag,
        boolean short_term_ref_pic_set_sps_flag,
        boolean slice_temporal_mvp_enabled_flag
    ) {
        is_reference(is_reference);
        IrapPicFlag(IrapPicFlag);
        used_for_long_term_reference(used_for_long_term_reference);
        discardable_flag(discardable_flag);
        cross_layer_bla_flag(cross_layer_bla_flag);
        pic_output_flag(pic_output_flag);
        no_output_of_prior_pics_flag(no_output_of_prior_pics_flag);
        short_term_ref_pic_set_sps_flag(short_term_ref_pic_set_sps_flag);
        slice_temporal_mvp_enabled_flag(slice_temporal_mvp_enabled_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265PictureInfoFlags set(StdVideoEncodeH265PictureInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265PictureInfoFlags malloc() {
        return new StdVideoEncodeH265PictureInfoFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265PictureInfoFlags calloc() {
        return new StdVideoEncodeH265PictureInfoFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265PictureInfoFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance for the specified memory address. */
    public static StdVideoEncodeH265PictureInfoFlags create(long address) {
        return new StdVideoEncodeH265PictureInfoFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265PictureInfoFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH265PictureInfoFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265PictureInfoFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH265PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH265PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265PictureInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #is_reference}. */
    public static int nis_reference(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #IrapPicFlag}. */
    public static int nIrapPicFlag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #used_for_long_term_reference}. */
    public static int nused_for_long_term_reference(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #discardable_flag}. */
    public static int ndiscardable_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #cross_layer_bla_flag}. */
    public static int ncross_layer_bla_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #pic_output_flag}. */
    public static int npic_output_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #no_output_of_prior_pics_flag}. */
    public static int nno_output_of_prior_pics_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #short_term_ref_pic_set_sps_flag}. */
    public static int nshort_term_ref_pic_set_sps_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #slice_temporal_mvp_enabled_flag}. */
    public static int nslice_temporal_mvp_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }
    public static int nbitfield1(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265PictureInfoFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x00_7F_FF_FF; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265PictureInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #is_reference(boolean) is_reference}. */
    public static void nis_reference(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #IrapPicFlag(boolean) IrapPicFlag}. */
    public static void nIrapPicFlag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #used_for_long_term_reference(boolean) used_for_long_term_reference}. */
    public static void nused_for_long_term_reference(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #discardable_flag(boolean) discardable_flag}. */
    public static void ndiscardable_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #cross_layer_bla_flag(boolean) cross_layer_bla_flag}. */
    public static void ncross_layer_bla_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #pic_output_flag(boolean) pic_output_flag}. */
    public static void npic_output_flag(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #no_output_of_prior_pics_flag(boolean) no_output_of_prior_pics_flag}. */
    public static void nno_output_of_prior_pics_flag(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #short_term_ref_pic_set_sps_flag(boolean) short_term_ref_pic_set_sps_flag}. */
    public static void nshort_term_ref_pic_set_sps_flag(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #slice_temporal_mvp_enabled_flag(boolean) slice_temporal_mvp_enabled_flag}. */
    public static void nslice_temporal_mvp_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }
    public static void nbitfield1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265PictureInfoFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xFF_80_00_00) | (value & 0x00_7F_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265PictureInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265PictureInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265PictureInfoFlags ELEMENT_FACTORY = StdVideoEncodeH265PictureInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265PictureInfoFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265PictureInfoFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH265PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code is_reference} field. */
        @NativeType("uint32_t")
        public boolean is_reference() { return StdVideoEncodeH265PictureInfoFlags.nis_reference(address()) != 0; }
        /** @return the value of the {@code IrapPicFlag} field. */
        @NativeType("uint32_t")
        public boolean IrapPicFlag() { return StdVideoEncodeH265PictureInfoFlags.nIrapPicFlag(address()) != 0; }
        /** @return the value of the {@code used_for_long_term_reference} field. */
        @NativeType("uint32_t")
        public boolean used_for_long_term_reference() { return StdVideoEncodeH265PictureInfoFlags.nused_for_long_term_reference(address()) != 0; }
        /** @return the value of the {@code discardable_flag} field. */
        @NativeType("uint32_t")
        public boolean discardable_flag() { return StdVideoEncodeH265PictureInfoFlags.ndiscardable_flag(address()) != 0; }
        /** @return the value of the {@code cross_layer_bla_flag} field. */
        @NativeType("uint32_t")
        public boolean cross_layer_bla_flag() { return StdVideoEncodeH265PictureInfoFlags.ncross_layer_bla_flag(address()) != 0; }
        /** @return the value of the {@code pic_output_flag} field. */
        @NativeType("uint32_t")
        public boolean pic_output_flag() { return StdVideoEncodeH265PictureInfoFlags.npic_output_flag(address()) != 0; }
        /** @return the value of the {@code no_output_of_prior_pics_flag} field. */
        @NativeType("uint32_t")
        public boolean no_output_of_prior_pics_flag() { return StdVideoEncodeH265PictureInfoFlags.nno_output_of_prior_pics_flag(address()) != 0; }
        /** @return the value of the {@code short_term_ref_pic_set_sps_flag} field. */
        @NativeType("uint32_t")
        public boolean short_term_ref_pic_set_sps_flag() { return StdVideoEncodeH265PictureInfoFlags.nshort_term_ref_pic_set_sps_flag(address()) != 0; }
        /** @return the value of the {@code slice_temporal_mvp_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean slice_temporal_mvp_enabled_flag() { return StdVideoEncodeH265PictureInfoFlags.nslice_temporal_mvp_enabled_flag(address()) != 0; }

        /** Sets the specified value to the {@code is_reference} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer is_reference(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265PictureInfoFlags.nis_reference(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code IrapPicFlag} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer IrapPicFlag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265PictureInfoFlags.nIrapPicFlag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code used_for_long_term_reference} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer used_for_long_term_reference(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265PictureInfoFlags.nused_for_long_term_reference(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code discardable_flag} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer discardable_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265PictureInfoFlags.ndiscardable_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cross_layer_bla_flag} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer cross_layer_bla_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265PictureInfoFlags.ncross_layer_bla_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pic_output_flag} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer pic_output_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265PictureInfoFlags.npic_output_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code no_output_of_prior_pics_flag} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer no_output_of_prior_pics_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265PictureInfoFlags.nno_output_of_prior_pics_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code short_term_ref_pic_set_sps_flag} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265PictureInfoFlags.nshort_term_ref_pic_set_sps_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code slice_temporal_mvp_enabled_flag} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer slice_temporal_mvp_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265PictureInfoFlags.nslice_temporal_mvp_enabled_flag(address(), value ? 1 : 0); return this; }

    }

}