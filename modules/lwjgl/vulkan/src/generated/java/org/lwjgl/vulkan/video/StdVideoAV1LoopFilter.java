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

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*;

/**
 * <pre>{@code
 * struct StdVideoAV1LoopFilter {
 *     {@link StdVideoAV1LoopFilterFlags StdVideoAV1LoopFilterFlags} flags;
 *     uint8_t loop_filter_level[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS];
 *     uint8_t loop_filter_sharpness;
 *     uint8_t update_ref_delta;
 *     int8_t loop_filter_ref_deltas[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME];
 *     uint8_t update_mode_delta;
 *     int8_t loop_filter_mode_deltas[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS];
 * }}</pre>
 */
public class StdVideoAV1LoopFilter extends Struct<StdVideoAV1LoopFilter> implements NativeResource {

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
            __member(StdVideoAV1LoopFilterFlags.SIZEOF, StdVideoAV1LoopFilterFlags.ALIGNOF),
            __array(1, STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME),
            __member(1),
            __array(1, STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS)
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

    protected StdVideoAV1LoopFilter(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1LoopFilter create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1LoopFilter(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1LoopFilter} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1LoopFilter(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoAV1LoopFilterFlags} view of the {@code flags} field. */
    public StdVideoAV1LoopFilterFlags flags() { return nflags(address()); }
    /** @return a {@link ByteBuffer} view of the {@code loop_filter_level} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]")
    public ByteBuffer loop_filter_level() { return nloop_filter_level(address()); }
    /** @return the value at the specified index of the {@code loop_filter_level} field. */
    @NativeType("uint8_t")
    public byte loop_filter_level(int index) { return nloop_filter_level(address(), index); }
    /** @return the value of the {@code loop_filter_sharpness} field. */
    @NativeType("uint8_t")
    public byte loop_filter_sharpness() { return nloop_filter_sharpness(address()); }
    /** @return the value of the {@code update_ref_delta} field. */
    @NativeType("uint8_t")
    public byte update_ref_delta() { return nupdate_ref_delta(address()); }
    /** @return a {@link ByteBuffer} view of the {@code loop_filter_ref_deltas} field. */
    @NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]")
    public ByteBuffer loop_filter_ref_deltas() { return nloop_filter_ref_deltas(address()); }
    /** @return the value at the specified index of the {@code loop_filter_ref_deltas} field. */
    @NativeType("int8_t")
    public byte loop_filter_ref_deltas(int index) { return nloop_filter_ref_deltas(address(), index); }
    /** @return the value of the {@code update_mode_delta} field. */
    @NativeType("uint8_t")
    public byte update_mode_delta() { return nupdate_mode_delta(address()); }
    /** @return a {@link ByteBuffer} view of the {@code loop_filter_mode_deltas} field. */
    @NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]")
    public ByteBuffer loop_filter_mode_deltas() { return nloop_filter_mode_deltas(address()); }
    /** @return the value at the specified index of the {@code loop_filter_mode_deltas} field. */
    @NativeType("int8_t")
    public byte loop_filter_mode_deltas(int index) { return nloop_filter_mode_deltas(address(), index); }

    /** Copies the specified {@link StdVideoAV1LoopFilterFlags} to the {@code flags} field. */
    public StdVideoAV1LoopFilter flags(StdVideoAV1LoopFilterFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoAV1LoopFilter flags(java.util.function.Consumer<StdVideoAV1LoopFilterFlags> consumer) { consumer.accept(flags()); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code loop_filter_level} field. */
    public StdVideoAV1LoopFilter loop_filter_level(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]") ByteBuffer value) { nloop_filter_level(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code loop_filter_level} field. */
    public StdVideoAV1LoopFilter loop_filter_level(int index, @NativeType("uint8_t") byte value) { nloop_filter_level(address(), index, value); return this; }
    /** Sets the specified value to the {@code loop_filter_sharpness} field. */
    public StdVideoAV1LoopFilter loop_filter_sharpness(@NativeType("uint8_t") byte value) { nloop_filter_sharpness(address(), value); return this; }
    /** Sets the specified value to the {@code update_ref_delta} field. */
    public StdVideoAV1LoopFilter update_ref_delta(@NativeType("uint8_t") byte value) { nupdate_ref_delta(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code loop_filter_ref_deltas} field. */
    public StdVideoAV1LoopFilter loop_filter_ref_deltas(@NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]") ByteBuffer value) { nloop_filter_ref_deltas(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code loop_filter_ref_deltas} field. */
    public StdVideoAV1LoopFilter loop_filter_ref_deltas(int index, @NativeType("int8_t") byte value) { nloop_filter_ref_deltas(address(), index, value); return this; }
    /** Sets the specified value to the {@code update_mode_delta} field. */
    public StdVideoAV1LoopFilter update_mode_delta(@NativeType("uint8_t") byte value) { nupdate_mode_delta(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code loop_filter_mode_deltas} field. */
    public StdVideoAV1LoopFilter loop_filter_mode_deltas(@NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]") ByteBuffer value) { nloop_filter_mode_deltas(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code loop_filter_mode_deltas} field. */
    public StdVideoAV1LoopFilter loop_filter_mode_deltas(int index, @NativeType("int8_t") byte value) { nloop_filter_mode_deltas(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1LoopFilter set(
        StdVideoAV1LoopFilterFlags flags,
        ByteBuffer loop_filter_level,
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
    public StdVideoAV1LoopFilter set(StdVideoAV1LoopFilter src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1LoopFilter} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1LoopFilter malloc() {
        return new StdVideoAV1LoopFilter(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1LoopFilter} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1LoopFilter calloc() {
        return new StdVideoAV1LoopFilter(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1LoopFilter} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1LoopFilter create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1LoopFilter(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1LoopFilter} instance for the specified memory address. */
    public static StdVideoAV1LoopFilter create(long address) {
        return new StdVideoAV1LoopFilter(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1LoopFilter createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1LoopFilter(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1LoopFilter.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopFilter.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1LoopFilter.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopFilter.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1LoopFilter.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopFilter.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1LoopFilter.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopFilter.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1LoopFilter.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1LoopFilter} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1LoopFilter malloc(MemoryStack stack) {
        return new StdVideoAV1LoopFilter(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1LoopFilter} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1LoopFilter calloc(MemoryStack stack) {
        return new StdVideoAV1LoopFilter(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1LoopFilter.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopFilter.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1LoopFilter.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopFilter.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoAV1LoopFilterFlags nflags(long struct) { return StdVideoAV1LoopFilterFlags.create(struct + StdVideoAV1LoopFilter.FLAGS); }
    /** Unsafe version of {@link #loop_filter_level}. */
    public static ByteBuffer nloop_filter_level(long struct) { return memByteBuffer(struct + StdVideoAV1LoopFilter.LOOP_FILTER_LEVEL, STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS); }
    /** Unsafe version of {@link #loop_filter_level(int) loop_filter_level}. */
    public static byte nloop_filter_level(long struct, int index) {
        return memGetByte(struct + StdVideoAV1LoopFilter.LOOP_FILTER_LEVEL + check(index, STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS) * 1);
    }
    /** Unsafe version of {@link #loop_filter_sharpness}. */
    public static byte nloop_filter_sharpness(long struct) { return memGetByte(struct + StdVideoAV1LoopFilter.LOOP_FILTER_SHARPNESS); }
    /** Unsafe version of {@link #update_ref_delta}. */
    public static byte nupdate_ref_delta(long struct) { return memGetByte(struct + StdVideoAV1LoopFilter.UPDATE_REF_DELTA); }
    /** Unsafe version of {@link #loop_filter_ref_deltas}. */
    public static ByteBuffer nloop_filter_ref_deltas(long struct) { return memByteBuffer(struct + StdVideoAV1LoopFilter.LOOP_FILTER_REF_DELTAS, STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME); }
    /** Unsafe version of {@link #loop_filter_ref_deltas(int) loop_filter_ref_deltas}. */
    public static byte nloop_filter_ref_deltas(long struct, int index) {
        return memGetByte(struct + StdVideoAV1LoopFilter.LOOP_FILTER_REF_DELTAS + check(index, STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME) * 1);
    }
    /** Unsafe version of {@link #update_mode_delta}. */
    public static byte nupdate_mode_delta(long struct) { return memGetByte(struct + StdVideoAV1LoopFilter.UPDATE_MODE_DELTA); }
    /** Unsafe version of {@link #loop_filter_mode_deltas}. */
    public static ByteBuffer nloop_filter_mode_deltas(long struct) { return memByteBuffer(struct + StdVideoAV1LoopFilter.LOOP_FILTER_MODE_DELTAS, STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS); }
    /** Unsafe version of {@link #loop_filter_mode_deltas(int) loop_filter_mode_deltas}. */
    public static byte nloop_filter_mode_deltas(long struct, int index) {
        return memGetByte(struct + StdVideoAV1LoopFilter.LOOP_FILTER_MODE_DELTAS + check(index, STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS) * 1);
    }

    /** Unsafe version of {@link #flags(StdVideoAV1LoopFilterFlags) flags}. */
    public static void nflags(long struct, StdVideoAV1LoopFilterFlags value) { memCopy(value.address(), struct + StdVideoAV1LoopFilter.FLAGS, StdVideoAV1LoopFilterFlags.SIZEOF); }
    /** Unsafe version of {@link #loop_filter_level(ByteBuffer) loop_filter_level}. */
    public static void nloop_filter_level(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS); }
        memCopy(memAddress(value), struct + StdVideoAV1LoopFilter.LOOP_FILTER_LEVEL, value.remaining() * 1);
    }
    /** Unsafe version of {@link #loop_filter_level(int, byte) loop_filter_level}. */
    public static void nloop_filter_level(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1LoopFilter.LOOP_FILTER_LEVEL + check(index, STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS) * 1, value);
    }
    /** Unsafe version of {@link #loop_filter_sharpness(byte) loop_filter_sharpness}. */
    public static void nloop_filter_sharpness(long struct, byte value) { memPutByte(struct + StdVideoAV1LoopFilter.LOOP_FILTER_SHARPNESS, value); }
    /** Unsafe version of {@link #update_ref_delta(byte) update_ref_delta}. */
    public static void nupdate_ref_delta(long struct, byte value) { memPutByte(struct + StdVideoAV1LoopFilter.UPDATE_REF_DELTA, value); }
    /** Unsafe version of {@link #loop_filter_ref_deltas(ByteBuffer) loop_filter_ref_deltas}. */
    public static void nloop_filter_ref_deltas(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME); }
        memCopy(memAddress(value), struct + StdVideoAV1LoopFilter.LOOP_FILTER_REF_DELTAS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #loop_filter_ref_deltas(int, byte) loop_filter_ref_deltas}. */
    public static void nloop_filter_ref_deltas(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1LoopFilter.LOOP_FILTER_REF_DELTAS + check(index, STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME) * 1, value);
    }
    /** Unsafe version of {@link #update_mode_delta(byte) update_mode_delta}. */
    public static void nupdate_mode_delta(long struct, byte value) { memPutByte(struct + StdVideoAV1LoopFilter.UPDATE_MODE_DELTA, value); }
    /** Unsafe version of {@link #loop_filter_mode_deltas(ByteBuffer) loop_filter_mode_deltas}. */
    public static void nloop_filter_mode_deltas(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS); }
        memCopy(memAddress(value), struct + StdVideoAV1LoopFilter.LOOP_FILTER_MODE_DELTAS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #loop_filter_mode_deltas(int, byte) loop_filter_mode_deltas}. */
    public static void nloop_filter_mode_deltas(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1LoopFilter.LOOP_FILTER_MODE_DELTAS + check(index, STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoAV1LoopFilter} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1LoopFilter, Buffer> implements NativeResource {

        private static final StdVideoAV1LoopFilter ELEMENT_FACTORY = StdVideoAV1LoopFilter.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1LoopFilter.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1LoopFilter#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1LoopFilter getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoAV1LoopFilterFlags} view of the {@code flags} field. */
        public StdVideoAV1LoopFilterFlags flags() { return StdVideoAV1LoopFilter.nflags(address()); }
        /** @return a {@link ByteBuffer} view of the {@code loop_filter_level} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]")
        public ByteBuffer loop_filter_level() { return StdVideoAV1LoopFilter.nloop_filter_level(address()); }
        /** @return the value at the specified index of the {@code loop_filter_level} field. */
        @NativeType("uint8_t")
        public byte loop_filter_level(int index) { return StdVideoAV1LoopFilter.nloop_filter_level(address(), index); }
        /** @return the value of the {@code loop_filter_sharpness} field. */
        @NativeType("uint8_t")
        public byte loop_filter_sharpness() { return StdVideoAV1LoopFilter.nloop_filter_sharpness(address()); }
        /** @return the value of the {@code update_ref_delta} field. */
        @NativeType("uint8_t")
        public byte update_ref_delta() { return StdVideoAV1LoopFilter.nupdate_ref_delta(address()); }
        /** @return a {@link ByteBuffer} view of the {@code loop_filter_ref_deltas} field. */
        @NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]")
        public ByteBuffer loop_filter_ref_deltas() { return StdVideoAV1LoopFilter.nloop_filter_ref_deltas(address()); }
        /** @return the value at the specified index of the {@code loop_filter_ref_deltas} field. */
        @NativeType("int8_t")
        public byte loop_filter_ref_deltas(int index) { return StdVideoAV1LoopFilter.nloop_filter_ref_deltas(address(), index); }
        /** @return the value of the {@code update_mode_delta} field. */
        @NativeType("uint8_t")
        public byte update_mode_delta() { return StdVideoAV1LoopFilter.nupdate_mode_delta(address()); }
        /** @return a {@link ByteBuffer} view of the {@code loop_filter_mode_deltas} field. */
        @NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]")
        public ByteBuffer loop_filter_mode_deltas() { return StdVideoAV1LoopFilter.nloop_filter_mode_deltas(address()); }
        /** @return the value at the specified index of the {@code loop_filter_mode_deltas} field. */
        @NativeType("int8_t")
        public byte loop_filter_mode_deltas(int index) { return StdVideoAV1LoopFilter.nloop_filter_mode_deltas(address(), index); }

        /** Copies the specified {@link StdVideoAV1LoopFilterFlags} to the {@code flags} field. */
        public StdVideoAV1LoopFilter.Buffer flags(StdVideoAV1LoopFilterFlags value) { StdVideoAV1LoopFilter.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoAV1LoopFilter.Buffer flags(java.util.function.Consumer<StdVideoAV1LoopFilterFlags> consumer) { consumer.accept(flags()); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code loop_filter_level} field. */
        public StdVideoAV1LoopFilter.Buffer loop_filter_level(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]") ByteBuffer value) { StdVideoAV1LoopFilter.nloop_filter_level(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code loop_filter_level} field. */
        public StdVideoAV1LoopFilter.Buffer loop_filter_level(int index, @NativeType("uint8_t") byte value) { StdVideoAV1LoopFilter.nloop_filter_level(address(), index, value); return this; }
        /** Sets the specified value to the {@code loop_filter_sharpness} field. */
        public StdVideoAV1LoopFilter.Buffer loop_filter_sharpness(@NativeType("uint8_t") byte value) { StdVideoAV1LoopFilter.nloop_filter_sharpness(address(), value); return this; }
        /** Sets the specified value to the {@code update_ref_delta} field. */
        public StdVideoAV1LoopFilter.Buffer update_ref_delta(@NativeType("uint8_t") byte value) { StdVideoAV1LoopFilter.nupdate_ref_delta(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code loop_filter_ref_deltas} field. */
        public StdVideoAV1LoopFilter.Buffer loop_filter_ref_deltas(@NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]") ByteBuffer value) { StdVideoAV1LoopFilter.nloop_filter_ref_deltas(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code loop_filter_ref_deltas} field. */
        public StdVideoAV1LoopFilter.Buffer loop_filter_ref_deltas(int index, @NativeType("int8_t") byte value) { StdVideoAV1LoopFilter.nloop_filter_ref_deltas(address(), index, value); return this; }
        /** Sets the specified value to the {@code update_mode_delta} field. */
        public StdVideoAV1LoopFilter.Buffer update_mode_delta(@NativeType("uint8_t") byte value) { StdVideoAV1LoopFilter.nupdate_mode_delta(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code loop_filter_mode_deltas} field. */
        public StdVideoAV1LoopFilter.Buffer loop_filter_mode_deltas(@NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]") ByteBuffer value) { StdVideoAV1LoopFilter.nloop_filter_mode_deltas(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code loop_filter_mode_deltas} field. */
        public StdVideoAV1LoopFilter.Buffer loop_filter_mode_deltas(int index, @NativeType("int8_t") byte value) { StdVideoAV1LoopFilter.nloop_filter_mode_deltas(address(), index, value); return this; }

    }

}