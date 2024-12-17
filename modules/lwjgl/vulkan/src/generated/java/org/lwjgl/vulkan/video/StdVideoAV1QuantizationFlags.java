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
 * struct StdVideoAV1QuantizationFlags {
 *     uint32_t using_qmatrix : 1;
 *     uint32_t diff_uv_delta : 1;
 *     uint32_t reserved : 30;
 * }}</pre>
 */
public class StdVideoAV1QuantizationFlags extends Struct<StdVideoAV1QuantizationFlags> implements NativeResource {

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

    protected StdVideoAV1QuantizationFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1QuantizationFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1QuantizationFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1QuantizationFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1QuantizationFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code using_qmatrix} field. */
    @NativeType("uint32_t")
    public boolean using_qmatrix() { return nusing_qmatrix(address()) != 0; }
    /** @return the value of the {@code diff_uv_delta} field. */
    @NativeType("uint32_t")
    public boolean diff_uv_delta() { return ndiff_uv_delta(address()) != 0; }

    /** Sets the specified value to the {@code using_qmatrix} field. */
    public StdVideoAV1QuantizationFlags using_qmatrix(@NativeType("uint32_t") boolean value) { nusing_qmatrix(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code diff_uv_delta} field. */
    public StdVideoAV1QuantizationFlags diff_uv_delta(@NativeType("uint32_t") boolean value) { ndiff_uv_delta(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1QuantizationFlags set(
        boolean using_qmatrix,
        boolean diff_uv_delta
    ) {
        using_qmatrix(using_qmatrix);
        diff_uv_delta(diff_uv_delta);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1QuantizationFlags set(StdVideoAV1QuantizationFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1QuantizationFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1QuantizationFlags malloc() {
        return new StdVideoAV1QuantizationFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1QuantizationFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1QuantizationFlags calloc() {
        return new StdVideoAV1QuantizationFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1QuantizationFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1QuantizationFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1QuantizationFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1QuantizationFlags} instance for the specified memory address. */
    public static StdVideoAV1QuantizationFlags create(long address) {
        return new StdVideoAV1QuantizationFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1QuantizationFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1QuantizationFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1QuantizationFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1QuantizationFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1QuantizationFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1QuantizationFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1QuantizationFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1QuantizationFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1QuantizationFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1QuantizationFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1QuantizationFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1QuantizationFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1QuantizationFlags malloc(MemoryStack stack) {
        return new StdVideoAV1QuantizationFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1QuantizationFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1QuantizationFlags calloc(MemoryStack stack) {
        return new StdVideoAV1QuantizationFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1QuantizationFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1QuantizationFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1QuantizationFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1QuantizationFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoAV1QuantizationFlags.BITFIELD0); }
    /** Unsafe version of {@link #using_qmatrix}. */
    public static int nusing_qmatrix(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #diff_uv_delta}. */
    public static int ndiff_uv_delta(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoAV1QuantizationFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x3F_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoAV1QuantizationFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #using_qmatrix(boolean) using_qmatrix}. */
    public static void nusing_qmatrix(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #diff_uv_delta(boolean) diff_uv_delta}. */
    public static void ndiff_uv_delta(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoAV1QuantizationFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xC0_00_00_00) | (value & 0x3F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoAV1QuantizationFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1QuantizationFlags, Buffer> implements NativeResource {

        private static final StdVideoAV1QuantizationFlags ELEMENT_FACTORY = StdVideoAV1QuantizationFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1QuantizationFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1QuantizationFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1QuantizationFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code using_qmatrix} field. */
        @NativeType("uint32_t")
        public boolean using_qmatrix() { return StdVideoAV1QuantizationFlags.nusing_qmatrix(address()) != 0; }
        /** @return the value of the {@code diff_uv_delta} field. */
        @NativeType("uint32_t")
        public boolean diff_uv_delta() { return StdVideoAV1QuantizationFlags.ndiff_uv_delta(address()) != 0; }

        /** Sets the specified value to the {@code using_qmatrix} field. */
        public StdVideoAV1QuantizationFlags.Buffer using_qmatrix(@NativeType("uint32_t") boolean value) { StdVideoAV1QuantizationFlags.nusing_qmatrix(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code diff_uv_delta} field. */
        public StdVideoAV1QuantizationFlags.Buffer diff_uv_delta(@NativeType("uint32_t") boolean value) { StdVideoAV1QuantizationFlags.ndiff_uv_delta(address(), value ? 1 : 0); return this; }

    }

}