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
 * struct StdVideoAV1TimingInfoFlags {
 *     uint32_t equal_picture_interval : 1;
 *     uint32_t reserved : 31;
 * }}</pre>
 */
public class StdVideoAV1TimingInfoFlags extends Struct<StdVideoAV1TimingInfoFlags> implements NativeResource {

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

    protected StdVideoAV1TimingInfoFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1TimingInfoFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1TimingInfoFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1TimingInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1TimingInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code equal_picture_interval} field. */
    @NativeType("uint32_t")
    public boolean equal_picture_interval() { return nequal_picture_interval(address()) != 0; }

    /** Sets the specified value to the {@code equal_picture_interval} field. */
    public StdVideoAV1TimingInfoFlags equal_picture_interval(@NativeType("uint32_t") boolean value) { nequal_picture_interval(address(), value ? 1 : 0); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1TimingInfoFlags set(StdVideoAV1TimingInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1TimingInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1TimingInfoFlags malloc() {
        return new StdVideoAV1TimingInfoFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1TimingInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1TimingInfoFlags calloc() {
        return new StdVideoAV1TimingInfoFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1TimingInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1TimingInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1TimingInfoFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1TimingInfoFlags} instance for the specified memory address. */
    public static StdVideoAV1TimingInfoFlags create(long address) {
        return new StdVideoAV1TimingInfoFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1TimingInfoFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1TimingInfoFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1TimingInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfoFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TimingInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfoFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TimingInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1TimingInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfoFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1TimingInfoFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1TimingInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1TimingInfoFlags malloc(MemoryStack stack) {
        return new StdVideoAV1TimingInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1TimingInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1TimingInfoFlags calloc(MemoryStack stack) {
        return new StdVideoAV1TimingInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1TimingInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TimingInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoAV1TimingInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #equal_picture_interval}. */
    public static int nequal_picture_interval(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoAV1TimingInfoFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x7F_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoAV1TimingInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #equal_picture_interval(boolean) equal_picture_interval}. */
    public static void nequal_picture_interval(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoAV1TimingInfoFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0x80_00_00_00) | (value & 0x7F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoAV1TimingInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1TimingInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoAV1TimingInfoFlags ELEMENT_FACTORY = StdVideoAV1TimingInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1TimingInfoFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1TimingInfoFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1TimingInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code equal_picture_interval} field. */
        @NativeType("uint32_t")
        public boolean equal_picture_interval() { return StdVideoAV1TimingInfoFlags.nequal_picture_interval(address()) != 0; }

        /** Sets the specified value to the {@code equal_picture_interval} field. */
        public StdVideoAV1TimingInfoFlags.Buffer equal_picture_interval(@NativeType("uint32_t") boolean value) { StdVideoAV1TimingInfoFlags.nequal_picture_interval(address(), value ? 1 : 0); return this; }

    }

}