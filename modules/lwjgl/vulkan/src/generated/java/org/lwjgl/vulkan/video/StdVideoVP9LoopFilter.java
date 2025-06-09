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

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecVP9.*;

/**
 * <pre>{@code
 * struct StdVideoVP9LoopFilter {
 *     {@link StdVideoVP9LoopFilterFlags StdVideoVP9LoopFilterFlags} flags;
 *     uint8_t loop_filter_level;
 *     uint8_t loop_filter_sharpness;
 *     uint8_t update_ref_delta;
 *     int8_t loop_filter_ref_deltas[STD_VIDEO_VP9_MAX_REF_FRAMES];
 *     uint8_t update_mode_delta;
 *     int8_t loop_filter_mode_deltas[STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS];
 * }}</pre>
 */
public class StdVideoVP9LoopFilter extends Struct<StdVideoVP9LoopFilter> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        LOOP_FILTER_LEVEL,
        LOOP_FILTER_SHARPNESS,
        UPDATE_REF_DELTA,
        LOOP_FILTER_REF_DELTAS,
        UPDATE_MODE_DELTA,
        LOOP_FILTER_MODE_DELTAS;

    static {
        Layout layout = __struct(
            __member(StdVideoVP9LoopFilterFlags.SIZEOF, StdVideoVP9LoopFilterFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_VP9_MAX_REF_FRAMES),
            __member(1),
            __array(1, STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        LOOP_FILTER_LEVEL = layout.offsetof(1);
        LOOP_FILTER_SHARPNESS = layout.offsetof(2);
        UPDATE_REF_DELTA = layout.offsetof(3);
        LOOP_FILTER_REF_DELTAS = layout.offsetof(4);
        UPDATE_MODE_DELTA = layout.offsetof(5);
        LOOP_FILTER_MODE_DELTAS = layout.offsetof(6);
    }

    protected StdVideoVP9LoopFilter(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoVP9LoopFilter create(long address, @Nullable ByteBuffer container) {
        return new StdVideoVP9LoopFilter(address, container);
    }

    /**
     * Creates a {@code StdVideoVP9LoopFilter} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoVP9LoopFilter(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoVP9LoopFilterFlags} view of the {@code flags} field. */
    public StdVideoVP9LoopFilterFlags flags() { return nflags(address()); }
    /** @return the value of the {@code loop_filter_level} field. */
    @NativeType("uint8_t")
    public byte loop_filter_level() { return nloop_filter_level(address()); }
    /** @return the value of the {@code loop_filter_sharpness} field. */
    @NativeType("uint8_t")
    public byte loop_filter_sharpness() { return nloop_filter_sharpness(address()); }
    /** @return the value of the {@code update_ref_delta} field. */
    @NativeType("uint8_t")
    public byte update_ref_delta() { return nupdate_ref_delta(address()); }
    /** @return a {@link ByteBuffer} view of the {@code loop_filter_ref_deltas} field. */
    @NativeType("int8_t[STD_VIDEO_VP9_MAX_REF_FRAMES]")
    public ByteBuffer loop_filter_ref_deltas() { return nloop_filter_ref_deltas(address()); }
    /** @return the value at the specified index of the {@code loop_filter_ref_deltas} field. */
    @NativeType("int8_t")
    public byte loop_filter_ref_deltas(int index) { return nloop_filter_ref_deltas(address(), index); }
    /** @return the value of the {@code update_mode_delta} field. */
    @NativeType("uint8_t")
    public byte update_mode_delta() { return nupdate_mode_delta(address()); }
    /** @return a {@link ByteBuffer} view of the {@code loop_filter_mode_deltas} field. */
    @NativeType("int8_t[STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS]")
    public ByteBuffer loop_filter_mode_deltas() { return nloop_filter_mode_deltas(address()); }
    /** @return the value at the specified index of the {@code loop_filter_mode_deltas} field. */
    @NativeType("int8_t")
    public byte loop_filter_mode_deltas(int index) { return nloop_filter_mode_deltas(address(), index); }

    /** Copies the specified {@link StdVideoVP9LoopFilterFlags} to the {@code flags} field. */
    public StdVideoVP9LoopFilter flags(StdVideoVP9LoopFilterFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoVP9LoopFilter flags(java.util.function.Consumer<StdVideoVP9LoopFilterFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code loop_filter_level} field. */
    public StdVideoVP9LoopFilter loop_filter_level(@NativeType("uint8_t") byte value) { nloop_filter_level(address(), value); return this; }
    /** Sets the specified value to the {@code loop_filter_sharpness} field. */
    public StdVideoVP9LoopFilter loop_filter_sharpness(@NativeType("uint8_t") byte value) { nloop_filter_sharpness(address(), value); return this; }
    /** Sets the specified value to the {@code update_ref_delta} field. */
    public StdVideoVP9LoopFilter update_ref_delta(@NativeType("uint8_t") byte value) { nupdate_ref_delta(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code loop_filter_ref_deltas} field. */
    public StdVideoVP9LoopFilter loop_filter_ref_deltas(@NativeType("int8_t[STD_VIDEO_VP9_MAX_REF_FRAMES]") ByteBuffer value) { nloop_filter_ref_deltas(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code loop_filter_ref_deltas} field. */
    public StdVideoVP9LoopFilter loop_filter_ref_deltas(int index, @NativeType("int8_t") byte value) { nloop_filter_ref_deltas(address(), index, value); return this; }
    /** Sets the specified value to the {@code update_mode_delta} field. */
    public StdVideoVP9LoopFilter update_mode_delta(@NativeType("uint8_t") byte value) { nupdate_mode_delta(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code loop_filter_mode_deltas} field. */
    public StdVideoVP9LoopFilter loop_filter_mode_deltas(@NativeType("int8_t[STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS]") ByteBuffer value) { nloop_filter_mode_deltas(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code loop_filter_mode_deltas} field. */
    public StdVideoVP9LoopFilter loop_filter_mode_deltas(int index, @NativeType("int8_t") byte value) { nloop_filter_mode_deltas(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoVP9LoopFilter set(
        StdVideoVP9LoopFilterFlags flags,
        byte loop_filter_level,
        byte loop_filter_sharpness,
        byte update_ref_delta,
        ByteBuffer loop_filter_ref_deltas,
        byte update_mode_delta,
        ByteBuffer loop_filter_mode_deltas
    ) {
        flags(flags);
        loop_filter_level(loop_filter_level);
        loop_filter_sharpness(loop_filter_sharpness);
        update_ref_delta(update_ref_delta);
        loop_filter_ref_deltas(loop_filter_ref_deltas);
        update_mode_delta(update_mode_delta);
        loop_filter_mode_deltas(loop_filter_mode_deltas);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoVP9LoopFilter set(StdVideoVP9LoopFilter src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoVP9LoopFilter} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoVP9LoopFilter malloc() {
        return new StdVideoVP9LoopFilter(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoVP9LoopFilter} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoVP9LoopFilter calloc() {
        return new StdVideoVP9LoopFilter(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoVP9LoopFilter} instance allocated with {@link BufferUtils}. */
    public static StdVideoVP9LoopFilter create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoVP9LoopFilter(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoVP9LoopFilter} instance for the specified memory address. */
    public static StdVideoVP9LoopFilter create(long address) {
        return new StdVideoVP9LoopFilter(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoVP9LoopFilter createSafe(long address) {
        return address == NULL ? null : new StdVideoVP9LoopFilter(address, null);
    }

    /**
     * Returns a new {@link StdVideoVP9LoopFilter.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilter.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9LoopFilter.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilter.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9LoopFilter.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilter.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoVP9LoopFilter.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilter.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoVP9LoopFilter.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoVP9LoopFilter} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoVP9LoopFilter malloc(MemoryStack stack) {
        return new StdVideoVP9LoopFilter(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoVP9LoopFilter} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoVP9LoopFilter calloc(MemoryStack stack) {
        return new StdVideoVP9LoopFilter(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoVP9LoopFilter.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilter.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9LoopFilter.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9LoopFilter.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoVP9LoopFilterFlags nflags(long struct) { return StdVideoVP9LoopFilterFlags.create(struct + StdVideoVP9LoopFilter.FLAGS); }
    /** Unsafe version of {@link #loop_filter_level}. */
    public static byte nloop_filter_level(long struct) { return memGetByte(struct + StdVideoVP9LoopFilter.LOOP_FILTER_LEVEL); }
    /** Unsafe version of {@link #loop_filter_sharpness}. */
    public static byte nloop_filter_sharpness(long struct) { return memGetByte(struct + StdVideoVP9LoopFilter.LOOP_FILTER_SHARPNESS); }
    /** Unsafe version of {@link #update_ref_delta}. */
    public static byte nupdate_ref_delta(long struct) { return memGetByte(struct + StdVideoVP9LoopFilter.UPDATE_REF_DELTA); }
    /** Unsafe version of {@link #loop_filter_ref_deltas}. */
    public static ByteBuffer nloop_filter_ref_deltas(long struct) { return memByteBuffer(struct + StdVideoVP9LoopFilter.LOOP_FILTER_REF_DELTAS, STD_VIDEO_VP9_MAX_REF_FRAMES); }
    /** Unsafe version of {@link #loop_filter_ref_deltas(int) loop_filter_ref_deltas}. */
    public static byte nloop_filter_ref_deltas(long struct, int index) {
        return memGetByte(struct + StdVideoVP9LoopFilter.LOOP_FILTER_REF_DELTAS + check(index, STD_VIDEO_VP9_MAX_REF_FRAMES) * 1);
    }
    /** Unsafe version of {@link #update_mode_delta}. */
    public static byte nupdate_mode_delta(long struct) { return memGetByte(struct + StdVideoVP9LoopFilter.UPDATE_MODE_DELTA); }
    /** Unsafe version of {@link #loop_filter_mode_deltas}. */
    public static ByteBuffer nloop_filter_mode_deltas(long struct) { return memByteBuffer(struct + StdVideoVP9LoopFilter.LOOP_FILTER_MODE_DELTAS, STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS); }
    /** Unsafe version of {@link #loop_filter_mode_deltas(int) loop_filter_mode_deltas}. */
    public static byte nloop_filter_mode_deltas(long struct, int index) {
        return memGetByte(struct + StdVideoVP9LoopFilter.LOOP_FILTER_MODE_DELTAS + check(index, STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS) * 1);
    }

    /** Unsafe version of {@link #flags(StdVideoVP9LoopFilterFlags) flags}. */
    public static void nflags(long struct, StdVideoVP9LoopFilterFlags value) { memCopy(value.address(), struct + StdVideoVP9LoopFilter.FLAGS, StdVideoVP9LoopFilterFlags.SIZEOF); }
    /** Unsafe version of {@link #loop_filter_level(byte) loop_filter_level}. */
    public static void nloop_filter_level(long struct, byte value) { memPutByte(struct + StdVideoVP9LoopFilter.LOOP_FILTER_LEVEL, value); }
    /** Unsafe version of {@link #loop_filter_sharpness(byte) loop_filter_sharpness}. */
    public static void nloop_filter_sharpness(long struct, byte value) { memPutByte(struct + StdVideoVP9LoopFilter.LOOP_FILTER_SHARPNESS, value); }
    /** Unsafe version of {@link #update_ref_delta(byte) update_ref_delta}. */
    public static void nupdate_ref_delta(long struct, byte value) { memPutByte(struct + StdVideoVP9LoopFilter.UPDATE_REF_DELTA, value); }
    /** Unsafe version of {@link #loop_filter_ref_deltas(ByteBuffer) loop_filter_ref_deltas}. */
    public static void nloop_filter_ref_deltas(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_VP9_MAX_REF_FRAMES); }
        memCopy(memAddress(value), struct + StdVideoVP9LoopFilter.LOOP_FILTER_REF_DELTAS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #loop_filter_ref_deltas(int, byte) loop_filter_ref_deltas}. */
    public static void nloop_filter_ref_deltas(long struct, int index, byte value) {
        memPutByte(struct + StdVideoVP9LoopFilter.LOOP_FILTER_REF_DELTAS + check(index, STD_VIDEO_VP9_MAX_REF_FRAMES) * 1, value);
    }
    /** Unsafe version of {@link #update_mode_delta(byte) update_mode_delta}. */
    public static void nupdate_mode_delta(long struct, byte value) { memPutByte(struct + StdVideoVP9LoopFilter.UPDATE_MODE_DELTA, value); }
    /** Unsafe version of {@link #loop_filter_mode_deltas(ByteBuffer) loop_filter_mode_deltas}. */
    public static void nloop_filter_mode_deltas(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS); }
        memCopy(memAddress(value), struct + StdVideoVP9LoopFilter.LOOP_FILTER_MODE_DELTAS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #loop_filter_mode_deltas(int, byte) loop_filter_mode_deltas}. */
    public static void nloop_filter_mode_deltas(long struct, int index, byte value) {
        memPutByte(struct + StdVideoVP9LoopFilter.LOOP_FILTER_MODE_DELTAS + check(index, STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoVP9LoopFilter} structs. */
    public static class Buffer extends StructBuffer<StdVideoVP9LoopFilter, Buffer> implements NativeResource {

        private static final StdVideoVP9LoopFilter ELEMENT_FACTORY = StdVideoVP9LoopFilter.create(-1L);

        /**
         * Creates a new {@code StdVideoVP9LoopFilter.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoVP9LoopFilter#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoVP9LoopFilter getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoVP9LoopFilterFlags} view of the {@code flags} field. */
        public StdVideoVP9LoopFilterFlags flags() { return StdVideoVP9LoopFilter.nflags(address()); }
        /** @return the value of the {@code loop_filter_level} field. */
        @NativeType("uint8_t")
        public byte loop_filter_level() { return StdVideoVP9LoopFilter.nloop_filter_level(address()); }
        /** @return the value of the {@code loop_filter_sharpness} field. */
        @NativeType("uint8_t")
        public byte loop_filter_sharpness() { return StdVideoVP9LoopFilter.nloop_filter_sharpness(address()); }
        /** @return the value of the {@code update_ref_delta} field. */
        @NativeType("uint8_t")
        public byte update_ref_delta() { return StdVideoVP9LoopFilter.nupdate_ref_delta(address()); }
        /** @return a {@link ByteBuffer} view of the {@code loop_filter_ref_deltas} field. */
        @NativeType("int8_t[STD_VIDEO_VP9_MAX_REF_FRAMES]")
        public ByteBuffer loop_filter_ref_deltas() { return StdVideoVP9LoopFilter.nloop_filter_ref_deltas(address()); }
        /** @return the value at the specified index of the {@code loop_filter_ref_deltas} field. */
        @NativeType("int8_t")
        public byte loop_filter_ref_deltas(int index) { return StdVideoVP9LoopFilter.nloop_filter_ref_deltas(address(), index); }
        /** @return the value of the {@code update_mode_delta} field. */
        @NativeType("uint8_t")
        public byte update_mode_delta() { return StdVideoVP9LoopFilter.nupdate_mode_delta(address()); }
        /** @return a {@link ByteBuffer} view of the {@code loop_filter_mode_deltas} field. */
        @NativeType("int8_t[STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS]")
        public ByteBuffer loop_filter_mode_deltas() { return StdVideoVP9LoopFilter.nloop_filter_mode_deltas(address()); }
        /** @return the value at the specified index of the {@code loop_filter_mode_deltas} field. */
        @NativeType("int8_t")
        public byte loop_filter_mode_deltas(int index) { return StdVideoVP9LoopFilter.nloop_filter_mode_deltas(address(), index); }

        /** Copies the specified {@link StdVideoVP9LoopFilterFlags} to the {@code flags} field. */
        public StdVideoVP9LoopFilter.Buffer flags(StdVideoVP9LoopFilterFlags value) { StdVideoVP9LoopFilter.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoVP9LoopFilter.Buffer flags(java.util.function.Consumer<StdVideoVP9LoopFilterFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code loop_filter_level} field. */
        public StdVideoVP9LoopFilter.Buffer loop_filter_level(@NativeType("uint8_t") byte value) { StdVideoVP9LoopFilter.nloop_filter_level(address(), value); return this; }
        /** Sets the specified value to the {@code loop_filter_sharpness} field. */
        public StdVideoVP9LoopFilter.Buffer loop_filter_sharpness(@NativeType("uint8_t") byte value) { StdVideoVP9LoopFilter.nloop_filter_sharpness(address(), value); return this; }
        /** Sets the specified value to the {@code update_ref_delta} field. */
        public StdVideoVP9LoopFilter.Buffer update_ref_delta(@NativeType("uint8_t") byte value) { StdVideoVP9LoopFilter.nupdate_ref_delta(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code loop_filter_ref_deltas} field. */
        public StdVideoVP9LoopFilter.Buffer loop_filter_ref_deltas(@NativeType("int8_t[STD_VIDEO_VP9_MAX_REF_FRAMES]") ByteBuffer value) { StdVideoVP9LoopFilter.nloop_filter_ref_deltas(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code loop_filter_ref_deltas} field. */
        public StdVideoVP9LoopFilter.Buffer loop_filter_ref_deltas(int index, @NativeType("int8_t") byte value) { StdVideoVP9LoopFilter.nloop_filter_ref_deltas(address(), index, value); return this; }
        /** Sets the specified value to the {@code update_mode_delta} field. */
        public StdVideoVP9LoopFilter.Buffer update_mode_delta(@NativeType("uint8_t") byte value) { StdVideoVP9LoopFilter.nupdate_mode_delta(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code loop_filter_mode_deltas} field. */
        public StdVideoVP9LoopFilter.Buffer loop_filter_mode_deltas(@NativeType("int8_t[STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS]") ByteBuffer value) { StdVideoVP9LoopFilter.nloop_filter_mode_deltas(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code loop_filter_mode_deltas} field. */
        public StdVideoVP9LoopFilter.Buffer loop_filter_mode_deltas(int index, @NativeType("int8_t") byte value) { StdVideoVP9LoopFilter.nloop_filter_mode_deltas(address(), index, value); return this; }

    }

}