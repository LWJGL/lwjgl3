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
 * struct StdVideoVP9LoopFilterFlags {
 *     uint32_t loop_filter_delta_enabled : 1;
 *     uint32_t loop_filter_delta_update : 1;
 *     uint32_t reserved : 30;
 * }}</pre>
 */
public class StdVideoVP9LoopFilterFlags extends Struct<StdVideoVP9LoopFilterFlags> implements NativeResource {

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

    protected StdVideoVP9LoopFilterFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoVP9LoopFilterFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoVP9LoopFilterFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoVP9LoopFilterFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoVP9LoopFilterFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code loop_filter_delta_enabled} field. */
    @NativeType("uint32_t")
    public boolean loop_filter_delta_enabled() { return nloop_filter_delta_enabled(address()) != 0; }
    /** @return the value of the {@code loop_filter_delta_update} field. */
    @NativeType("uint32_t")
    public boolean loop_filter_delta_update() { return nloop_filter_delta_update(address()) != 0; }

    /** Sets the specified value to the {@code loop_filter_delta_enabled} field. */
    public StdVideoVP9LoopFilterFlags loop_filter_delta_enabled(@NativeType("uint32_t") boolean value) { nloop_filter_delta_enabled(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code loop_filter_delta_update} field. */
    public StdVideoVP9LoopFilterFlags loop_filter_delta_update(@NativeType("uint32_t") boolean value) { nloop_filter_delta_update(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoVP9LoopFilterFlags set(
        boolean loop_filter_delta_enabled,
        boolean loop_filter_delta_update
    ) {
        loop_filter_delta_enabled(loop_filter_delta_enabled);
        loop_filter_delta_update(loop_filter_delta_update);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoVP9LoopFilterFlags set(StdVideoVP9LoopFilterFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoVP9LoopFilterFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoVP9LoopFilterFlags malloc() {
        return new StdVideoVP9LoopFilterFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoVP9LoopFilterFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoVP9LoopFilterFlags calloc() {
        return new StdVideoVP9LoopFilterFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoVP9LoopFilterFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoVP9LoopFilterFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoVP9LoopFilterFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoVP9LoopFilterFlags} instance for the specified memory address. */
    public static StdVideoVP9LoopFilterFlags create(long address) {
        return new StdVideoVP9LoopFilterFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoVP9LoopFilterFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoVP9LoopFilterFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoVP9LoopFilterFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilterFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9LoopFilterFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilterFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9LoopFilterFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilterFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoVP9LoopFilterFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilterFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoVP9LoopFilterFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoVP9LoopFilterFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoVP9LoopFilterFlags malloc(MemoryStack stack) {
        return new StdVideoVP9LoopFilterFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoVP9LoopFilterFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoVP9LoopFilterFlags calloc(MemoryStack stack) {
        return new StdVideoVP9LoopFilterFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoVP9LoopFilterFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilterFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9LoopFilterFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilterFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoVP9LoopFilterFlags.BITFIELD0); }
    /** Unsafe version of {@link #loop_filter_delta_enabled}. */
    public static int nloop_filter_delta_enabled(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #loop_filter_delta_update}. */
    public static int nloop_filter_delta_update(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoVP9LoopFilterFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x3F_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoVP9LoopFilterFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #loop_filter_delta_enabled(boolean) loop_filter_delta_enabled}. */
    public static void nloop_filter_delta_enabled(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #loop_filter_delta_update(boolean) loop_filter_delta_update}. */
    public static void nloop_filter_delta_update(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoVP9LoopFilterFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xC0_00_00_00) | (value & 0x3F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoVP9LoopFilterFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoVP9LoopFilterFlags, Buffer> implements NativeResource {

        private static final StdVideoVP9LoopFilterFlags ELEMENT_FACTORY = StdVideoVP9LoopFilterFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoVP9LoopFilterFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoVP9LoopFilterFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoVP9LoopFilterFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code loop_filter_delta_enabled} field. */
        @NativeType("uint32_t")
        public boolean loop_filter_delta_enabled() { return StdVideoVP9LoopFilterFlags.nloop_filter_delta_enabled(address()) != 0; }
        /** @return the value of the {@code loop_filter_delta_update} field. */
        @NativeType("uint32_t")
        public boolean loop_filter_delta_update() { return StdVideoVP9LoopFilterFlags.nloop_filter_delta_update(address()) != 0; }

        /** Sets the specified value to the {@code loop_filter_delta_enabled} field. */
        public StdVideoVP9LoopFilterFlags.Buffer loop_filter_delta_enabled(@NativeType("uint32_t") boolean value) { StdVideoVP9LoopFilterFlags.nloop_filter_delta_enabled(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code loop_filter_delta_update} field. */
        public StdVideoVP9LoopFilterFlags.Buffer loop_filter_delta_update(@NativeType("uint32_t") boolean value) { StdVideoVP9LoopFilterFlags.nloop_filter_delta_update(address(), value ? 1 : 0); return this; }

    }

}