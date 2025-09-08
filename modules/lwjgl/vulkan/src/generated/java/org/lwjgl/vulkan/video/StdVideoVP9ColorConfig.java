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
 * <pre><code>
 * struct StdVideoVP9ColorConfig {
 *     {@link StdVideoVP9ColorConfigFlags StdVideoVP9ColorConfigFlags} flags;
 *     uint8_t BitDepth;
 *     uint8_t subsampling_x;
 *     uint8_t subsampling_y;
 *     uint8_t reserved1;
 *     StdVideoVP9ColorSpace color_space;
 * }</code></pre>
 */
public class StdVideoVP9ColorConfig extends Struct<StdVideoVP9ColorConfig> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        BITDEPTH,
        SUBSAMPLING_X,
        SUBSAMPLING_Y,
        RESERVED1,
        COLOR_SPACE;

    static {
        Layout layout = __struct(
            __member(StdVideoVP9ColorConfigFlags.SIZEOF, StdVideoVP9ColorConfigFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        BITDEPTH = layout.offsetof(1);
        SUBSAMPLING_X = layout.offsetof(2);
        SUBSAMPLING_Y = layout.offsetof(3);
        RESERVED1 = layout.offsetof(4);
        COLOR_SPACE = layout.offsetof(5);
    }

    protected StdVideoVP9ColorConfig(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoVP9ColorConfig create(long address, @Nullable ByteBuffer container) {
        return new StdVideoVP9ColorConfig(address, container);
    }

    /**
     * Creates a {@code StdVideoVP9ColorConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoVP9ColorConfig(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoVP9ColorConfigFlags} view of the {@code flags} field. */
    public StdVideoVP9ColorConfigFlags flags() { return nflags(address()); }
    /** @return the value of the {@code BitDepth} field. */
    @NativeType("uint8_t")
    public byte BitDepth() { return nBitDepth(address()); }
    /** @return the value of the {@code subsampling_x} field. */
    @NativeType("uint8_t")
    public byte subsampling_x() { return nsubsampling_x(address()); }
    /** @return the value of the {@code subsampling_y} field. */
    @NativeType("uint8_t")
    public byte subsampling_y() { return nsubsampling_y(address()); }
    /** @return the value of the {@code color_space} field. */
    @NativeType("StdVideoVP9ColorSpace")
    public int color_space() { return ncolor_space(address()); }

    /** Copies the specified {@link StdVideoVP9ColorConfigFlags} to the {@code flags} field. */
    public StdVideoVP9ColorConfig flags(StdVideoVP9ColorConfigFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoVP9ColorConfig flags(java.util.function.Consumer<StdVideoVP9ColorConfigFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code BitDepth} field. */
    public StdVideoVP9ColorConfig BitDepth(@NativeType("uint8_t") byte value) { nBitDepth(address(), value); return this; }
    /** Sets the specified value to the {@code subsampling_x} field. */
    public StdVideoVP9ColorConfig subsampling_x(@NativeType("uint8_t") byte value) { nsubsampling_x(address(), value); return this; }
    /** Sets the specified value to the {@code subsampling_y} field. */
    public StdVideoVP9ColorConfig subsampling_y(@NativeType("uint8_t") byte value) { nsubsampling_y(address(), value); return this; }
    /** Sets the specified value to the {@code color_space} field. */
    public StdVideoVP9ColorConfig color_space(@NativeType("StdVideoVP9ColorSpace") int value) { ncolor_space(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoVP9ColorConfig set(
        StdVideoVP9ColorConfigFlags flags,
        byte BitDepth,
        byte subsampling_x,
        byte subsampling_y,
        int color_space
    ) {
        flags(flags);
        BitDepth(BitDepth);
        subsampling_x(subsampling_x);
        subsampling_y(subsampling_y);
        color_space(color_space);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoVP9ColorConfig set(StdVideoVP9ColorConfig src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoVP9ColorConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoVP9ColorConfig malloc() {
        return new StdVideoVP9ColorConfig(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoVP9ColorConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoVP9ColorConfig calloc() {
        return new StdVideoVP9ColorConfig(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoVP9ColorConfig} instance allocated with {@link BufferUtils}. */
    public static StdVideoVP9ColorConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoVP9ColorConfig(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoVP9ColorConfig} instance for the specified memory address. */
    public static StdVideoVP9ColorConfig create(long address) {
        return new StdVideoVP9ColorConfig(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoVP9ColorConfig createSafe(long address) {
        return address == NULL ? null : new StdVideoVP9ColorConfig(address, null);
    }

    /**
     * Returns a new {@link StdVideoVP9ColorConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9ColorConfig.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9ColorConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9ColorConfig.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9ColorConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9ColorConfig.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoVP9ColorConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9ColorConfig.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoVP9ColorConfig.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoVP9ColorConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoVP9ColorConfig malloc(MemoryStack stack) {
        return new StdVideoVP9ColorConfig(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoVP9ColorConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoVP9ColorConfig calloc(MemoryStack stack) {
        return new StdVideoVP9ColorConfig(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoVP9ColorConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9ColorConfig.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9ColorConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9ColorConfig.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoVP9ColorConfigFlags nflags(long struct) { return StdVideoVP9ColorConfigFlags.create(struct + StdVideoVP9ColorConfig.FLAGS); }
    /** Unsafe version of {@link #BitDepth}. */
    public static byte nBitDepth(long struct) { return memGetByte(struct + StdVideoVP9ColorConfig.BITDEPTH); }
    /** Unsafe version of {@link #subsampling_x}. */
    public static byte nsubsampling_x(long struct) { return memGetByte(struct + StdVideoVP9ColorConfig.SUBSAMPLING_X); }
    /** Unsafe version of {@link #subsampling_y}. */
    public static byte nsubsampling_y(long struct) { return memGetByte(struct + StdVideoVP9ColorConfig.SUBSAMPLING_Y); }
    public static byte nreserved1(long struct) { return memGetByte(struct + StdVideoVP9ColorConfig.RESERVED1); }
    /** Unsafe version of {@link #color_space}. */
    public static int ncolor_space(long struct) { return memGetInt(struct + StdVideoVP9ColorConfig.COLOR_SPACE); }

    /** Unsafe version of {@link #flags(StdVideoVP9ColorConfigFlags) flags}. */
    public static void nflags(long struct, StdVideoVP9ColorConfigFlags value) { memCopy(value.address(), struct + StdVideoVP9ColorConfig.FLAGS, StdVideoVP9ColorConfigFlags.SIZEOF); }
    /** Unsafe version of {@link #BitDepth(byte) BitDepth}. */
    public static void nBitDepth(long struct, byte value) { memPutByte(struct + StdVideoVP9ColorConfig.BITDEPTH, value); }
    /** Unsafe version of {@link #subsampling_x(byte) subsampling_x}. */
    public static void nsubsampling_x(long struct, byte value) { memPutByte(struct + StdVideoVP9ColorConfig.SUBSAMPLING_X, value); }
    /** Unsafe version of {@link #subsampling_y(byte) subsampling_y}. */
    public static void nsubsampling_y(long struct, byte value) { memPutByte(struct + StdVideoVP9ColorConfig.SUBSAMPLING_Y, value); }
    public static void nreserved1(long struct, byte value) { memPutByte(struct + StdVideoVP9ColorConfig.RESERVED1, value); }
    /** Unsafe version of {@link #color_space(int) color_space}. */
    public static void ncolor_space(long struct, int value) { memPutInt(struct + StdVideoVP9ColorConfig.COLOR_SPACE, value); }

    // -----------------------------------

    /** An array of {@link StdVideoVP9ColorConfig} structs. */
    public static class Buffer extends StructBuffer<StdVideoVP9ColorConfig, Buffer> implements NativeResource {

        private static final StdVideoVP9ColorConfig ELEMENT_FACTORY = StdVideoVP9ColorConfig.create(-1L);

        /**
         * Creates a new {@code StdVideoVP9ColorConfig.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoVP9ColorConfig#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoVP9ColorConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoVP9ColorConfigFlags} view of the {@code flags} field. */
        public StdVideoVP9ColorConfigFlags flags() { return StdVideoVP9ColorConfig.nflags(address()); }
        /** @return the value of the {@code BitDepth} field. */
        @NativeType("uint8_t")
        public byte BitDepth() { return StdVideoVP9ColorConfig.nBitDepth(address()); }
        /** @return the value of the {@code subsampling_x} field. */
        @NativeType("uint8_t")
        public byte subsampling_x() { return StdVideoVP9ColorConfig.nsubsampling_x(address()); }
        /** @return the value of the {@code subsampling_y} field. */
        @NativeType("uint8_t")
        public byte subsampling_y() { return StdVideoVP9ColorConfig.nsubsampling_y(address()); }
        /** @return the value of the {@code color_space} field. */
        @NativeType("StdVideoVP9ColorSpace")
        public int color_space() { return StdVideoVP9ColorConfig.ncolor_space(address()); }

        /** Copies the specified {@link StdVideoVP9ColorConfigFlags} to the {@code flags} field. */
        public StdVideoVP9ColorConfig.Buffer flags(StdVideoVP9ColorConfigFlags value) { StdVideoVP9ColorConfig.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoVP9ColorConfig.Buffer flags(java.util.function.Consumer<StdVideoVP9ColorConfigFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code BitDepth} field. */
        public StdVideoVP9ColorConfig.Buffer BitDepth(@NativeType("uint8_t") byte value) { StdVideoVP9ColorConfig.nBitDepth(address(), value); return this; }
        /** Sets the specified value to the {@code subsampling_x} field. */
        public StdVideoVP9ColorConfig.Buffer subsampling_x(@NativeType("uint8_t") byte value) { StdVideoVP9ColorConfig.nsubsampling_x(address(), value); return this; }
        /** Sets the specified value to the {@code subsampling_y} field. */
        public StdVideoVP9ColorConfig.Buffer subsampling_y(@NativeType("uint8_t") byte value) { StdVideoVP9ColorConfig.nsubsampling_y(address(), value); return this; }
        /** Sets the specified value to the {@code color_space} field. */
        public StdVideoVP9ColorConfig.Buffer color_space(@NativeType("StdVideoVP9ColorSpace") int value) { StdVideoVP9ColorConfig.ncolor_space(address(), value); return this; }

    }

}