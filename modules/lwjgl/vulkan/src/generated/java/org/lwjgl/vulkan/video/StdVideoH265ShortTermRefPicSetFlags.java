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
 * struct StdVideoH265ShortTermRefPicSetFlags {
 *     uint32_t inter_ref_pic_set_prediction_flag : 1;
 *     uint32_t delta_rps_sign : 1;
 * }</code></pre>
 */
public class StdVideoH265ShortTermRefPicSetFlags extends Struct<StdVideoH265ShortTermRefPicSetFlags> implements NativeResource {

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

    protected StdVideoH265ShortTermRefPicSetFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoH265ShortTermRefPicSetFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoH265ShortTermRefPicSetFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoH265ShortTermRefPicSetFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265ShortTermRefPicSetFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code inter_ref_pic_set_prediction_flag} field. */
    @NativeType("uint32_t")
    public boolean inter_ref_pic_set_prediction_flag() { return ninter_ref_pic_set_prediction_flag(address()) != 0; }
    /** @return the value of the {@code delta_rps_sign} field. */
    @NativeType("uint32_t")
    public boolean delta_rps_sign() { return ndelta_rps_sign(address()) != 0; }

    /** Sets the specified value to the {@code inter_ref_pic_set_prediction_flag} field. */
    public StdVideoH265ShortTermRefPicSetFlags inter_ref_pic_set_prediction_flag(@NativeType("uint32_t") boolean value) { ninter_ref_pic_set_prediction_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code delta_rps_sign} field. */
    public StdVideoH265ShortTermRefPicSetFlags delta_rps_sign(@NativeType("uint32_t") boolean value) { ndelta_rps_sign(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265ShortTermRefPicSetFlags set(
        boolean inter_ref_pic_set_prediction_flag,
        boolean delta_rps_sign
    ) {
        inter_ref_pic_set_prediction_flag(inter_ref_pic_set_prediction_flag);
        delta_rps_sign(delta_rps_sign);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265ShortTermRefPicSetFlags set(StdVideoH265ShortTermRefPicSetFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265ShortTermRefPicSetFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265ShortTermRefPicSetFlags malloc() {
        return new StdVideoH265ShortTermRefPicSetFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265ShortTermRefPicSetFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265ShortTermRefPicSetFlags calloc() {
        return new StdVideoH265ShortTermRefPicSetFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265ShortTermRefPicSetFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265ShortTermRefPicSetFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265ShortTermRefPicSetFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265ShortTermRefPicSetFlags} instance for the specified memory address. */
    public static StdVideoH265ShortTermRefPicSetFlags create(long address) {
        return new StdVideoH265ShortTermRefPicSetFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265ShortTermRefPicSetFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoH265ShortTermRefPicSetFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoH265ShortTermRefPicSetFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSetFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ShortTermRefPicSetFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSetFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ShortTermRefPicSetFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSetFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoH265ShortTermRefPicSetFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSetFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265ShortTermRefPicSetFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265ShortTermRefPicSetFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265ShortTermRefPicSetFlags malloc(MemoryStack stack) {
        return new StdVideoH265ShortTermRefPicSetFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoH265ShortTermRefPicSetFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265ShortTermRefPicSetFlags calloc(MemoryStack stack) {
        return new StdVideoH265ShortTermRefPicSetFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoH265ShortTermRefPicSetFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSetFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ShortTermRefPicSetFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSetFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265ShortTermRefPicSetFlags.BITFIELD0); }
    /** Unsafe version of {@link #inter_ref_pic_set_prediction_flag}. */
    public static int ninter_ref_pic_set_prediction_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #delta_rps_sign}. */
    public static int ndelta_rps_sign(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265ShortTermRefPicSetFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #inter_ref_pic_set_prediction_flag(boolean) inter_ref_pic_set_prediction_flag}. */
    public static void ninter_ref_pic_set_prediction_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #delta_rps_sign(boolean) delta_rps_sign}. */
    public static void ndelta_rps_sign(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }

    // -----------------------------------

    /** An array of {@link StdVideoH265ShortTermRefPicSetFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265ShortTermRefPicSetFlags, Buffer> implements NativeResource {

        private static final StdVideoH265ShortTermRefPicSetFlags ELEMENT_FACTORY = StdVideoH265ShortTermRefPicSetFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoH265ShortTermRefPicSetFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265ShortTermRefPicSetFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoH265ShortTermRefPicSetFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code inter_ref_pic_set_prediction_flag} field. */
        @NativeType("uint32_t")
        public boolean inter_ref_pic_set_prediction_flag() { return StdVideoH265ShortTermRefPicSetFlags.ninter_ref_pic_set_prediction_flag(address()) != 0; }
        /** @return the value of the {@code delta_rps_sign} field. */
        @NativeType("uint32_t")
        public boolean delta_rps_sign() { return StdVideoH265ShortTermRefPicSetFlags.ndelta_rps_sign(address()) != 0; }

        /** Sets the specified value to the {@code inter_ref_pic_set_prediction_flag} field. */
        public StdVideoH265ShortTermRefPicSetFlags.Buffer inter_ref_pic_set_prediction_flag(@NativeType("uint32_t") boolean value) { StdVideoH265ShortTermRefPicSetFlags.ninter_ref_pic_set_prediction_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code delta_rps_sign} field. */
        public StdVideoH265ShortTermRefPicSetFlags.Buffer delta_rps_sign(@NativeType("uint32_t") boolean value) { StdVideoH265ShortTermRefPicSetFlags.ndelta_rps_sign(address(), value ? 1 : 0); return this; }

    }

}