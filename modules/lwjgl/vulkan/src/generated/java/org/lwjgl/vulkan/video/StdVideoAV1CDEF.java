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
 * struct StdVideoAV1CDEF {
 *     uint8_t cdef_damping_minus_3;
 *     uint8_t cdef_bits;
 *     uint8_t cdef_y_pri_strength[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS];
 *     uint8_t cdef_y_sec_strength[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS];
 *     uint8_t cdef_uv_pri_strength[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS];
 *     uint8_t cdef_uv_sec_strength[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS];
 * }}</pre>
 */
public class StdVideoAV1CDEF extends Struct<StdVideoAV1CDEF> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CDEF_DAMPING_MINUS_3,
        CDEF_BITS,
        CDEF_Y_PRI_STRENGTH,
        CDEF_Y_SEC_STRENGTH,
        CDEF_UV_PRI_STRENGTH,
        CDEF_UV_SEC_STRENGTH;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS),
            __array(1, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS),
            __array(1, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS),
            __array(1, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CDEF_DAMPING_MINUS_3 = layout.offsetof(0);
        CDEF_BITS = layout.offsetof(1);
        CDEF_Y_PRI_STRENGTH = layout.offsetof(2);
        CDEF_Y_SEC_STRENGTH = layout.offsetof(3);
        CDEF_UV_PRI_STRENGTH = layout.offsetof(4);
        CDEF_UV_SEC_STRENGTH = layout.offsetof(5);
    }

    protected StdVideoAV1CDEF(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1CDEF create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1CDEF(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1CDEF} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1CDEF(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code cdef_damping_minus_3} field. */
    @NativeType("uint8_t")
    public byte cdef_damping_minus_3() { return ncdef_damping_minus_3(address()); }
    /** @return the value of the {@code cdef_bits} field. */
    @NativeType("uint8_t")
    public byte cdef_bits() { return ncdef_bits(address()); }
    /** @return a {@link ByteBuffer} view of the {@code cdef_y_pri_strength} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public ByteBuffer cdef_y_pri_strength() { return ncdef_y_pri_strength(address()); }
    /** @return the value at the specified index of the {@code cdef_y_pri_strength} field. */
    @NativeType("uint8_t")
    public byte cdef_y_pri_strength(int index) { return ncdef_y_pri_strength(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code cdef_y_sec_strength} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public ByteBuffer cdef_y_sec_strength() { return ncdef_y_sec_strength(address()); }
    /** @return the value at the specified index of the {@code cdef_y_sec_strength} field. */
    @NativeType("uint8_t")
    public byte cdef_y_sec_strength(int index) { return ncdef_y_sec_strength(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code cdef_uv_pri_strength} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public ByteBuffer cdef_uv_pri_strength() { return ncdef_uv_pri_strength(address()); }
    /** @return the value at the specified index of the {@code cdef_uv_pri_strength} field. */
    @NativeType("uint8_t")
    public byte cdef_uv_pri_strength(int index) { return ncdef_uv_pri_strength(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code cdef_uv_sec_strength} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
    public ByteBuffer cdef_uv_sec_strength() { return ncdef_uv_sec_strength(address()); }
    /** @return the value at the specified index of the {@code cdef_uv_sec_strength} field. */
    @NativeType("uint8_t")
    public byte cdef_uv_sec_strength(int index) { return ncdef_uv_sec_strength(address(), index); }

    /** Sets the specified value to the {@code cdef_damping_minus_3} field. */
    public StdVideoAV1CDEF cdef_damping_minus_3(@NativeType("uint8_t") byte value) { ncdef_damping_minus_3(address(), value); return this; }
    /** Sets the specified value to the {@code cdef_bits} field. */
    public StdVideoAV1CDEF cdef_bits(@NativeType("uint8_t") byte value) { ncdef_bits(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code cdef_y_pri_strength} field. */
    public StdVideoAV1CDEF cdef_y_pri_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) { ncdef_y_pri_strength(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cdef_y_pri_strength} field. */
    public StdVideoAV1CDEF cdef_y_pri_strength(int index, @NativeType("uint8_t") byte value) { ncdef_y_pri_strength(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code cdef_y_sec_strength} field. */
    public StdVideoAV1CDEF cdef_y_sec_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) { ncdef_y_sec_strength(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cdef_y_sec_strength} field. */
    public StdVideoAV1CDEF cdef_y_sec_strength(int index, @NativeType("uint8_t") byte value) { ncdef_y_sec_strength(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code cdef_uv_pri_strength} field. */
    public StdVideoAV1CDEF cdef_uv_pri_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) { ncdef_uv_pri_strength(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cdef_uv_pri_strength} field. */
    public StdVideoAV1CDEF cdef_uv_pri_strength(int index, @NativeType("uint8_t") byte value) { ncdef_uv_pri_strength(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code cdef_uv_sec_strength} field. */
    public StdVideoAV1CDEF cdef_uv_sec_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) { ncdef_uv_sec_strength(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cdef_uv_sec_strength} field. */
    public StdVideoAV1CDEF cdef_uv_sec_strength(int index, @NativeType("uint8_t") byte value) { ncdef_uv_sec_strength(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1CDEF set(
        byte cdef_damping_minus_3,
        byte cdef_bits,
        ByteBuffer cdef_y_pri_strength,
        ByteBuffer cdef_y_sec_strength,
        ByteBuffer cdef_uv_pri_strength,
        ByteBuffer cdef_uv_sec_strength
    ) {
        cdef_damping_minus_3(cdef_damping_minus_3);
        cdef_bits(cdef_bits);
        cdef_y_pri_strength(cdef_y_pri_strength);
        cdef_y_sec_strength(cdef_y_sec_strength);
        cdef_uv_pri_strength(cdef_uv_pri_strength);
        cdef_uv_sec_strength(cdef_uv_sec_strength);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1CDEF set(StdVideoAV1CDEF src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1CDEF} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1CDEF malloc() {
        return new StdVideoAV1CDEF(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1CDEF} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1CDEF calloc() {
        return new StdVideoAV1CDEF(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1CDEF} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1CDEF create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1CDEF(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1CDEF} instance for the specified memory address. */
    public static StdVideoAV1CDEF create(long address) {
        return new StdVideoAV1CDEF(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1CDEF createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1CDEF(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1CDEF.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1CDEF.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1CDEF.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1CDEF.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1CDEF.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1CDEF.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1CDEF.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1CDEF.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1CDEF.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1CDEF} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1CDEF malloc(MemoryStack stack) {
        return new StdVideoAV1CDEF(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1CDEF} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1CDEF calloc(MemoryStack stack) {
        return new StdVideoAV1CDEF(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1CDEF.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1CDEF.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1CDEF.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1CDEF.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cdef_damping_minus_3}. */
    public static byte ncdef_damping_minus_3(long struct) { return memGetByte(struct + StdVideoAV1CDEF.CDEF_DAMPING_MINUS_3); }
    /** Unsafe version of {@link #cdef_bits}. */
    public static byte ncdef_bits(long struct) { return memGetByte(struct + StdVideoAV1CDEF.CDEF_BITS); }
    /** Unsafe version of {@link #cdef_y_pri_strength}. */
    public static ByteBuffer ncdef_y_pri_strength(long struct) { return memByteBuffer(struct + StdVideoAV1CDEF.CDEF_Y_PRI_STRENGTH, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS); }
    /** Unsafe version of {@link #cdef_y_pri_strength(int) cdef_y_pri_strength}. */
    public static byte ncdef_y_pri_strength(long struct, int index) {
        return memGetByte(struct + StdVideoAV1CDEF.CDEF_Y_PRI_STRENGTH + check(index, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS) * 1);
    }
    /** Unsafe version of {@link #cdef_y_sec_strength}. */
    public static ByteBuffer ncdef_y_sec_strength(long struct) { return memByteBuffer(struct + StdVideoAV1CDEF.CDEF_Y_SEC_STRENGTH, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS); }
    /** Unsafe version of {@link #cdef_y_sec_strength(int) cdef_y_sec_strength}. */
    public static byte ncdef_y_sec_strength(long struct, int index) {
        return memGetByte(struct + StdVideoAV1CDEF.CDEF_Y_SEC_STRENGTH + check(index, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS) * 1);
    }
    /** Unsafe version of {@link #cdef_uv_pri_strength}. */
    public static ByteBuffer ncdef_uv_pri_strength(long struct) { return memByteBuffer(struct + StdVideoAV1CDEF.CDEF_UV_PRI_STRENGTH, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS); }
    /** Unsafe version of {@link #cdef_uv_pri_strength(int) cdef_uv_pri_strength}. */
    public static byte ncdef_uv_pri_strength(long struct, int index) {
        return memGetByte(struct + StdVideoAV1CDEF.CDEF_UV_PRI_STRENGTH + check(index, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS) * 1);
    }
    /** Unsafe version of {@link #cdef_uv_sec_strength}. */
    public static ByteBuffer ncdef_uv_sec_strength(long struct) { return memByteBuffer(struct + StdVideoAV1CDEF.CDEF_UV_SEC_STRENGTH, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS); }
    /** Unsafe version of {@link #cdef_uv_sec_strength(int) cdef_uv_sec_strength}. */
    public static byte ncdef_uv_sec_strength(long struct, int index) {
        return memGetByte(struct + StdVideoAV1CDEF.CDEF_UV_SEC_STRENGTH + check(index, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS) * 1);
    }

    /** Unsafe version of {@link #cdef_damping_minus_3(byte) cdef_damping_minus_3}. */
    public static void ncdef_damping_minus_3(long struct, byte value) { memPutByte(struct + StdVideoAV1CDEF.CDEF_DAMPING_MINUS_3, value); }
    /** Unsafe version of {@link #cdef_bits(byte) cdef_bits}. */
    public static void ncdef_bits(long struct, byte value) { memPutByte(struct + StdVideoAV1CDEF.CDEF_BITS, value); }
    /** Unsafe version of {@link #cdef_y_pri_strength(ByteBuffer) cdef_y_pri_strength}. */
    public static void ncdef_y_pri_strength(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS); }
        memCopy(memAddress(value), struct + StdVideoAV1CDEF.CDEF_Y_PRI_STRENGTH, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cdef_y_pri_strength(int, byte) cdef_y_pri_strength}. */
    public static void ncdef_y_pri_strength(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1CDEF.CDEF_Y_PRI_STRENGTH + check(index, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS) * 1, value);
    }
    /** Unsafe version of {@link #cdef_y_sec_strength(ByteBuffer) cdef_y_sec_strength}. */
    public static void ncdef_y_sec_strength(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS); }
        memCopy(memAddress(value), struct + StdVideoAV1CDEF.CDEF_Y_SEC_STRENGTH, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cdef_y_sec_strength(int, byte) cdef_y_sec_strength}. */
    public static void ncdef_y_sec_strength(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1CDEF.CDEF_Y_SEC_STRENGTH + check(index, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS) * 1, value);
    }
    /** Unsafe version of {@link #cdef_uv_pri_strength(ByteBuffer) cdef_uv_pri_strength}. */
    public static void ncdef_uv_pri_strength(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS); }
        memCopy(memAddress(value), struct + StdVideoAV1CDEF.CDEF_UV_PRI_STRENGTH, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cdef_uv_pri_strength(int, byte) cdef_uv_pri_strength}. */
    public static void ncdef_uv_pri_strength(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1CDEF.CDEF_UV_PRI_STRENGTH + check(index, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS) * 1, value);
    }
    /** Unsafe version of {@link #cdef_uv_sec_strength(ByteBuffer) cdef_uv_sec_strength}. */
    public static void ncdef_uv_sec_strength(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS); }
        memCopy(memAddress(value), struct + StdVideoAV1CDEF.CDEF_UV_SEC_STRENGTH, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cdef_uv_sec_strength(int, byte) cdef_uv_sec_strength}. */
    public static void ncdef_uv_sec_strength(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1CDEF.CDEF_UV_SEC_STRENGTH + check(index, STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoAV1CDEF} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1CDEF, Buffer> implements NativeResource {

        private static final StdVideoAV1CDEF ELEMENT_FACTORY = StdVideoAV1CDEF.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1CDEF.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1CDEF#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1CDEF getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code cdef_damping_minus_3} field. */
        @NativeType("uint8_t")
        public byte cdef_damping_minus_3() { return StdVideoAV1CDEF.ncdef_damping_minus_3(address()); }
        /** @return the value of the {@code cdef_bits} field. */
        @NativeType("uint8_t")
        public byte cdef_bits() { return StdVideoAV1CDEF.ncdef_bits(address()); }
        /** @return a {@link ByteBuffer} view of the {@code cdef_y_pri_strength} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public ByteBuffer cdef_y_pri_strength() { return StdVideoAV1CDEF.ncdef_y_pri_strength(address()); }
        /** @return the value at the specified index of the {@code cdef_y_pri_strength} field. */
        @NativeType("uint8_t")
        public byte cdef_y_pri_strength(int index) { return StdVideoAV1CDEF.ncdef_y_pri_strength(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code cdef_y_sec_strength} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public ByteBuffer cdef_y_sec_strength() { return StdVideoAV1CDEF.ncdef_y_sec_strength(address()); }
        /** @return the value at the specified index of the {@code cdef_y_sec_strength} field. */
        @NativeType("uint8_t")
        public byte cdef_y_sec_strength(int index) { return StdVideoAV1CDEF.ncdef_y_sec_strength(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code cdef_uv_pri_strength} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public ByteBuffer cdef_uv_pri_strength() { return StdVideoAV1CDEF.ncdef_uv_pri_strength(address()); }
        /** @return the value at the specified index of the {@code cdef_uv_pri_strength} field. */
        @NativeType("uint8_t")
        public byte cdef_uv_pri_strength(int index) { return StdVideoAV1CDEF.ncdef_uv_pri_strength(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code cdef_uv_sec_strength} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]")
        public ByteBuffer cdef_uv_sec_strength() { return StdVideoAV1CDEF.ncdef_uv_sec_strength(address()); }
        /** @return the value at the specified index of the {@code cdef_uv_sec_strength} field. */
        @NativeType("uint8_t")
        public byte cdef_uv_sec_strength(int index) { return StdVideoAV1CDEF.ncdef_uv_sec_strength(address(), index); }

        /** Sets the specified value to the {@code cdef_damping_minus_3} field. */
        public StdVideoAV1CDEF.Buffer cdef_damping_minus_3(@NativeType("uint8_t") byte value) { StdVideoAV1CDEF.ncdef_damping_minus_3(address(), value); return this; }
        /** Sets the specified value to the {@code cdef_bits} field. */
        public StdVideoAV1CDEF.Buffer cdef_bits(@NativeType("uint8_t") byte value) { StdVideoAV1CDEF.ncdef_bits(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code cdef_y_pri_strength} field. */
        public StdVideoAV1CDEF.Buffer cdef_y_pri_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) { StdVideoAV1CDEF.ncdef_y_pri_strength(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cdef_y_pri_strength} field. */
        public StdVideoAV1CDEF.Buffer cdef_y_pri_strength(int index, @NativeType("uint8_t") byte value) { StdVideoAV1CDEF.ncdef_y_pri_strength(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code cdef_y_sec_strength} field. */
        public StdVideoAV1CDEF.Buffer cdef_y_sec_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) { StdVideoAV1CDEF.ncdef_y_sec_strength(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cdef_y_sec_strength} field. */
        public StdVideoAV1CDEF.Buffer cdef_y_sec_strength(int index, @NativeType("uint8_t") byte value) { StdVideoAV1CDEF.ncdef_y_sec_strength(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code cdef_uv_pri_strength} field. */
        public StdVideoAV1CDEF.Buffer cdef_uv_pri_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) { StdVideoAV1CDEF.ncdef_uv_pri_strength(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cdef_uv_pri_strength} field. */
        public StdVideoAV1CDEF.Buffer cdef_uv_pri_strength(int index, @NativeType("uint8_t") byte value) { StdVideoAV1CDEF.ncdef_uv_pri_strength(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code cdef_uv_sec_strength} field. */
        public StdVideoAV1CDEF.Buffer cdef_uv_sec_strength(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS]") ByteBuffer value) { StdVideoAV1CDEF.ncdef_uv_sec_strength(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cdef_uv_sec_strength} field. */
        public StdVideoAV1CDEF.Buffer cdef_uv_sec_strength(int index, @NativeType("uint8_t") byte value) { StdVideoAV1CDEF.ncdef_uv_sec_strength(address(), index, value); return this; }

    }

}