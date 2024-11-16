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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH265WeightTableFlags {
 *     uint16_t luma_weight_l0_flag;
 *     uint16_t chroma_weight_l0_flag;
 *     uint16_t luma_weight_l1_flag;
 *     uint16_t chroma_weight_l1_flag;
 * }</code></pre>
 */
public class StdVideoEncodeH265WeightTableFlags extends Struct<StdVideoEncodeH265WeightTableFlags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LUMA_WEIGHT_L0_FLAG,
        CHROMA_WEIGHT_L0_FLAG,
        LUMA_WEIGHT_L1_FLAG,
        CHROMA_WEIGHT_L1_FLAG;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LUMA_WEIGHT_L0_FLAG = layout.offsetof(0);
        CHROMA_WEIGHT_L0_FLAG = layout.offsetof(1);
        LUMA_WEIGHT_L1_FLAG = layout.offsetof(2);
        CHROMA_WEIGHT_L1_FLAG = layout.offsetof(3);
    }

    protected StdVideoEncodeH265WeightTableFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH265WeightTableFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH265WeightTableFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH265WeightTableFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265WeightTableFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code luma_weight_l0_flag} field. */
    @NativeType("uint16_t")
    public short luma_weight_l0_flag() { return nluma_weight_l0_flag(address()); }
    /** @return the value of the {@code chroma_weight_l0_flag} field. */
    @NativeType("uint16_t")
    public short chroma_weight_l0_flag() { return nchroma_weight_l0_flag(address()); }
    /** @return the value of the {@code luma_weight_l1_flag} field. */
    @NativeType("uint16_t")
    public short luma_weight_l1_flag() { return nluma_weight_l1_flag(address()); }
    /** @return the value of the {@code chroma_weight_l1_flag} field. */
    @NativeType("uint16_t")
    public short chroma_weight_l1_flag() { return nchroma_weight_l1_flag(address()); }

    /** Sets the specified value to the {@code luma_weight_l0_flag} field. */
    public StdVideoEncodeH265WeightTableFlags luma_weight_l0_flag(@NativeType("uint16_t") short value) { nluma_weight_l0_flag(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_weight_l0_flag} field. */
    public StdVideoEncodeH265WeightTableFlags chroma_weight_l0_flag(@NativeType("uint16_t") short value) { nchroma_weight_l0_flag(address(), value); return this; }
    /** Sets the specified value to the {@code luma_weight_l1_flag} field. */
    public StdVideoEncodeH265WeightTableFlags luma_weight_l1_flag(@NativeType("uint16_t") short value) { nluma_weight_l1_flag(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_weight_l1_flag} field. */
    public StdVideoEncodeH265WeightTableFlags chroma_weight_l1_flag(@NativeType("uint16_t") short value) { nchroma_weight_l1_flag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265WeightTableFlags set(
        short luma_weight_l0_flag,
        short chroma_weight_l0_flag,
        short luma_weight_l1_flag,
        short chroma_weight_l1_flag
    ) {
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
    public StdVideoEncodeH265WeightTableFlags set(StdVideoEncodeH265WeightTableFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265WeightTableFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265WeightTableFlags malloc() {
        return new StdVideoEncodeH265WeightTableFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265WeightTableFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265WeightTableFlags calloc() {
        return new StdVideoEncodeH265WeightTableFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265WeightTableFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265WeightTableFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265WeightTableFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265WeightTableFlags} instance for the specified memory address. */
    public static StdVideoEncodeH265WeightTableFlags create(long address) {
        return new StdVideoEncodeH265WeightTableFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoEncodeH265WeightTableFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH265WeightTableFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265WeightTableFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTableFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265WeightTableFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTableFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265WeightTableFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTableFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH265WeightTableFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTableFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoEncodeH265WeightTableFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265WeightTableFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265WeightTableFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH265WeightTableFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265WeightTableFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265WeightTableFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH265WeightTableFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265WeightTableFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTableFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265WeightTableFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTableFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #luma_weight_l0_flag}. */
    public static short nluma_weight_l0_flag(long struct) { return memGetShort(struct + StdVideoEncodeH265WeightTableFlags.LUMA_WEIGHT_L0_FLAG); }
    /** Unsafe version of {@link #chroma_weight_l0_flag}. */
    public static short nchroma_weight_l0_flag(long struct) { return memGetShort(struct + StdVideoEncodeH265WeightTableFlags.CHROMA_WEIGHT_L0_FLAG); }
    /** Unsafe version of {@link #luma_weight_l1_flag}. */
    public static short nluma_weight_l1_flag(long struct) { return memGetShort(struct + StdVideoEncodeH265WeightTableFlags.LUMA_WEIGHT_L1_FLAG); }
    /** Unsafe version of {@link #chroma_weight_l1_flag}. */
    public static short nchroma_weight_l1_flag(long struct) { return memGetShort(struct + StdVideoEncodeH265WeightTableFlags.CHROMA_WEIGHT_L1_FLAG); }

    /** Unsafe version of {@link #luma_weight_l0_flag(short) luma_weight_l0_flag}. */
    public static void nluma_weight_l0_flag(long struct, short value) { memPutShort(struct + StdVideoEncodeH265WeightTableFlags.LUMA_WEIGHT_L0_FLAG, value); }
    /** Unsafe version of {@link #chroma_weight_l0_flag(short) chroma_weight_l0_flag}. */
    public static void nchroma_weight_l0_flag(long struct, short value) { memPutShort(struct + StdVideoEncodeH265WeightTableFlags.CHROMA_WEIGHT_L0_FLAG, value); }
    /** Unsafe version of {@link #luma_weight_l1_flag(short) luma_weight_l1_flag}. */
    public static void nluma_weight_l1_flag(long struct, short value) { memPutShort(struct + StdVideoEncodeH265WeightTableFlags.LUMA_WEIGHT_L1_FLAG, value); }
    /** Unsafe version of {@link #chroma_weight_l1_flag(short) chroma_weight_l1_flag}. */
    public static void nchroma_weight_l1_flag(long struct, short value) { memPutShort(struct + StdVideoEncodeH265WeightTableFlags.CHROMA_WEIGHT_L1_FLAG, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265WeightTableFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265WeightTableFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265WeightTableFlags ELEMENT_FACTORY = StdVideoEncodeH265WeightTableFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265WeightTableFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265WeightTableFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH265WeightTableFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code luma_weight_l0_flag} field. */
        @NativeType("uint16_t")
        public short luma_weight_l0_flag() { return StdVideoEncodeH265WeightTableFlags.nluma_weight_l0_flag(address()); }
        /** @return the value of the {@code chroma_weight_l0_flag} field. */
        @NativeType("uint16_t")
        public short chroma_weight_l0_flag() { return StdVideoEncodeH265WeightTableFlags.nchroma_weight_l0_flag(address()); }
        /** @return the value of the {@code luma_weight_l1_flag} field. */
        @NativeType("uint16_t")
        public short luma_weight_l1_flag() { return StdVideoEncodeH265WeightTableFlags.nluma_weight_l1_flag(address()); }
        /** @return the value of the {@code chroma_weight_l1_flag} field. */
        @NativeType("uint16_t")
        public short chroma_weight_l1_flag() { return StdVideoEncodeH265WeightTableFlags.nchroma_weight_l1_flag(address()); }

        /** Sets the specified value to the {@code luma_weight_l0_flag} field. */
        public StdVideoEncodeH265WeightTableFlags.Buffer luma_weight_l0_flag(@NativeType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.nluma_weight_l0_flag(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_weight_l0_flag} field. */
        public StdVideoEncodeH265WeightTableFlags.Buffer chroma_weight_l0_flag(@NativeType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.nchroma_weight_l0_flag(address(), value); return this; }
        /** Sets the specified value to the {@code luma_weight_l1_flag} field. */
        public StdVideoEncodeH265WeightTableFlags.Buffer luma_weight_l1_flag(@NativeType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.nluma_weight_l1_flag(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_weight_l1_flag} field. */
        public StdVideoEncodeH265WeightTableFlags.Buffer chroma_weight_l1_flag(@NativeType("uint16_t") short value) { StdVideoEncodeH265WeightTableFlags.nchroma_weight_l1_flag(address(), value); return this; }

    }

}