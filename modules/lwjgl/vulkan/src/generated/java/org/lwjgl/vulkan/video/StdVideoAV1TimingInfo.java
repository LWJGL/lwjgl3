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
 * struct StdVideoAV1TimingInfo {
 *     {@link StdVideoAV1TimingInfoFlags StdVideoAV1TimingInfoFlags} flags;
 *     uint32_t num_units_in_display_tick;
 *     uint32_t time_scale;
 *     uint32_t num_ticks_per_picture_minus_1;
 * }}</pre>
 */
public class StdVideoAV1TimingInfo extends Struct<StdVideoAV1TimingInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        NUM_UNITS_IN_DISPLAY_TICK,
        TIME_SCALE,
        NUM_TICKS_PER_PICTURE_MINUS_1;

    static {
        Layout layout = __struct(
            __member(StdVideoAV1TimingInfoFlags.SIZEOF, StdVideoAV1TimingInfoFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        NUM_UNITS_IN_DISPLAY_TICK = layout.offsetof(1);
        TIME_SCALE = layout.offsetof(2);
        NUM_TICKS_PER_PICTURE_MINUS_1 = layout.offsetof(3);
    }

    protected StdVideoAV1TimingInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1TimingInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1TimingInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1TimingInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1TimingInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoAV1TimingInfoFlags} view of the {@code flags} field. */
    public StdVideoAV1TimingInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code num_units_in_display_tick} field. */
    @NativeType("uint32_t")
    public int num_units_in_display_tick() { return nnum_units_in_display_tick(address()); }
    /** @return the value of the {@code time_scale} field. */
    @NativeType("uint32_t")
    public int time_scale() { return ntime_scale(address()); }
    /** @return the value of the {@code num_ticks_per_picture_minus_1} field. */
    @NativeType("uint32_t")
    public int num_ticks_per_picture_minus_1() { return nnum_ticks_per_picture_minus_1(address()); }

    /** Copies the specified {@link StdVideoAV1TimingInfoFlags} to the {@code flags} field. */
    public StdVideoAV1TimingInfo flags(StdVideoAV1TimingInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoAV1TimingInfo flags(java.util.function.Consumer<StdVideoAV1TimingInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code num_units_in_display_tick} field. */
    public StdVideoAV1TimingInfo num_units_in_display_tick(@NativeType("uint32_t") int value) { nnum_units_in_display_tick(address(), value); return this; }
    /** Sets the specified value to the {@code time_scale} field. */
    public StdVideoAV1TimingInfo time_scale(@NativeType("uint32_t") int value) { ntime_scale(address(), value); return this; }
    /** Sets the specified value to the {@code num_ticks_per_picture_minus_1} field. */
    public StdVideoAV1TimingInfo num_ticks_per_picture_minus_1(@NativeType("uint32_t") int value) { nnum_ticks_per_picture_minus_1(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1TimingInfo set(
        StdVideoAV1TimingInfoFlags flags,
        int num_units_in_display_tick,
        int time_scale,
        int num_ticks_per_picture_minus_1
    ) {
        flags(flags);
        num_units_in_display_tick(num_units_in_display_tick);
        time_scale(time_scale);
        num_ticks_per_picture_minus_1(num_ticks_per_picture_minus_1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1TimingInfo set(StdVideoAV1TimingInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1TimingInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1TimingInfo malloc() {
        return new StdVideoAV1TimingInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1TimingInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1TimingInfo calloc() {
        return new StdVideoAV1TimingInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1TimingInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1TimingInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1TimingInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1TimingInfo} instance for the specified memory address. */
    public static StdVideoAV1TimingInfo create(long address) {
        return new StdVideoAV1TimingInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1TimingInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1TimingInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1TimingInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TimingInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TimingInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1TimingInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1TimingInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1TimingInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1TimingInfo malloc(MemoryStack stack) {
        return new StdVideoAV1TimingInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1TimingInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1TimingInfo calloc(MemoryStack stack) {
        return new StdVideoAV1TimingInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1TimingInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TimingInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TimingInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoAV1TimingInfoFlags nflags(long struct) { return StdVideoAV1TimingInfoFlags.create(struct + StdVideoAV1TimingInfo.FLAGS); }
    /** Unsafe version of {@link #num_units_in_display_tick}. */
    public static int nnum_units_in_display_tick(long struct) { return memGetInt(struct + StdVideoAV1TimingInfo.NUM_UNITS_IN_DISPLAY_TICK); }
    /** Unsafe version of {@link #time_scale}. */
    public static int ntime_scale(long struct) { return memGetInt(struct + StdVideoAV1TimingInfo.TIME_SCALE); }
    /** Unsafe version of {@link #num_ticks_per_picture_minus_1}. */
    public static int nnum_ticks_per_picture_minus_1(long struct) { return memGetInt(struct + StdVideoAV1TimingInfo.NUM_TICKS_PER_PICTURE_MINUS_1); }

    /** Unsafe version of {@link #flags(StdVideoAV1TimingInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoAV1TimingInfoFlags value) { memCopy(value.address(), struct + StdVideoAV1TimingInfo.FLAGS, StdVideoAV1TimingInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #num_units_in_display_tick(int) num_units_in_display_tick}. */
    public static void nnum_units_in_display_tick(long struct, int value) { memPutInt(struct + StdVideoAV1TimingInfo.NUM_UNITS_IN_DISPLAY_TICK, value); }
    /** Unsafe version of {@link #time_scale(int) time_scale}. */
    public static void ntime_scale(long struct, int value) { memPutInt(struct + StdVideoAV1TimingInfo.TIME_SCALE, value); }
    /** Unsafe version of {@link #num_ticks_per_picture_minus_1(int) num_ticks_per_picture_minus_1}. */
    public static void nnum_ticks_per_picture_minus_1(long struct, int value) { memPutInt(struct + StdVideoAV1TimingInfo.NUM_TICKS_PER_PICTURE_MINUS_1, value); }

    // -----------------------------------

    /** An array of {@link StdVideoAV1TimingInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1TimingInfo, Buffer> implements NativeResource {

        private static final StdVideoAV1TimingInfo ELEMENT_FACTORY = StdVideoAV1TimingInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1TimingInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1TimingInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1TimingInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoAV1TimingInfoFlags} view of the {@code flags} field. */
        public StdVideoAV1TimingInfoFlags flags() { return StdVideoAV1TimingInfo.nflags(address()); }
        /** @return the value of the {@code num_units_in_display_tick} field. */
        @NativeType("uint32_t")
        public int num_units_in_display_tick() { return StdVideoAV1TimingInfo.nnum_units_in_display_tick(address()); }
        /** @return the value of the {@code time_scale} field. */
        @NativeType("uint32_t")
        public int time_scale() { return StdVideoAV1TimingInfo.ntime_scale(address()); }
        /** @return the value of the {@code num_ticks_per_picture_minus_1} field. */
        @NativeType("uint32_t")
        public int num_ticks_per_picture_minus_1() { return StdVideoAV1TimingInfo.nnum_ticks_per_picture_minus_1(address()); }

        /** Copies the specified {@link StdVideoAV1TimingInfoFlags} to the {@code flags} field. */
        public StdVideoAV1TimingInfo.Buffer flags(StdVideoAV1TimingInfoFlags value) { StdVideoAV1TimingInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoAV1TimingInfo.Buffer flags(java.util.function.Consumer<StdVideoAV1TimingInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code num_units_in_display_tick} field. */
        public StdVideoAV1TimingInfo.Buffer num_units_in_display_tick(@NativeType("uint32_t") int value) { StdVideoAV1TimingInfo.nnum_units_in_display_tick(address(), value); return this; }
        /** Sets the specified value to the {@code time_scale} field. */
        public StdVideoAV1TimingInfo.Buffer time_scale(@NativeType("uint32_t") int value) { StdVideoAV1TimingInfo.ntime_scale(address(), value); return this; }
        /** Sets the specified value to the {@code num_ticks_per_picture_minus_1} field. */
        public StdVideoAV1TimingInfo.Buffer num_ticks_per_picture_minus_1(@NativeType("uint32_t") int value) { StdVideoAV1TimingInfo.nnum_ticks_per_picture_minus_1(address(), value); return this; }

    }

}