/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_row_info {
 *     uint32_t scanline_idx;
 *     uint32_t row_num;
 *     int pass;
 *     uint8_t filter;
 * }}</pre>
 */
@NativeType("struct spng_row_info")
public class SpngRowInfo extends Struct<SpngRowInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SCANLINE_IDX,
        ROW_NUM,
        PASS,
        FILTER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SCANLINE_IDX = layout.offsetof(0);
        ROW_NUM = layout.offsetof(1);
        PASS = layout.offsetof(2);
        FILTER = layout.offsetof(3);
    }

    protected SpngRowInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngRowInfo create(long address, @Nullable ByteBuffer container) {
        return new SpngRowInfo(address, container);
    }

    /**
     * Creates a {@code SpngRowInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngRowInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code scanline_idx} field. */
    @NativeType("uint32_t")
    public int scanline_idx() { return nscanline_idx(address()); }
    /** @return the value of the {@code row_num} field. */
    @NativeType("uint32_t")
    public int row_num() { return nrow_num(address()); }
    /** @return the value of the {@code pass} field. */
    public int pass() { return npass(address()); }
    /** @return the value of the {@code filter} field. */
    @NativeType("uint8_t")
    public byte filter() { return nfilter(address()); }

    /** Sets the specified value to the {@code scanline_idx} field. */
    public SpngRowInfo scanline_idx(@NativeType("uint32_t") int value) { nscanline_idx(address(), value); return this; }
    /** Sets the specified value to the {@code row_num} field. */
    public SpngRowInfo row_num(@NativeType("uint32_t") int value) { nrow_num(address(), value); return this; }
    /** Sets the specified value to the {@code pass} field. */
    public SpngRowInfo pass(int value) { npass(address(), value); return this; }
    /** Sets the specified value to the {@code filter} field. */
    public SpngRowInfo filter(@NativeType("uint8_t") byte value) { nfilter(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngRowInfo set(
        int scanline_idx,
        int row_num,
        int pass,
        byte filter
    ) {
        scanline_idx(scanline_idx);
        row_num(row_num);
        pass(pass);
        filter(filter);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpngRowInfo set(SpngRowInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngRowInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngRowInfo malloc() {
        return new SpngRowInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngRowInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngRowInfo calloc() {
        return new SpngRowInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngRowInfo} instance allocated with {@link BufferUtils}. */
    public static SpngRowInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngRowInfo(memAddress(container), container);
    }

    /** Returns a new {@code SpngRowInfo} instance for the specified memory address. */
    public static SpngRowInfo create(long address) {
        return new SpngRowInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngRowInfo createSafe(long address) {
        return address == NULL ? null : new SpngRowInfo(address, null);
    }

    /**
     * Returns a new {@link SpngRowInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngRowInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngRowInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngRowInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngRowInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngRowInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngRowInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngRowInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngRowInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngRowInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngRowInfo malloc(MemoryStack stack) {
        return new SpngRowInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngRowInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngRowInfo calloc(MemoryStack stack) {
        return new SpngRowInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngRowInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngRowInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngRowInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngRowInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #scanline_idx}. */
    public static int nscanline_idx(long struct) { return memGetInt(struct + SpngRowInfo.SCANLINE_IDX); }
    /** Unsafe version of {@link #row_num}. */
    public static int nrow_num(long struct) { return memGetInt(struct + SpngRowInfo.ROW_NUM); }
    /** Unsafe version of {@link #pass}. */
    public static int npass(long struct) { return memGetInt(struct + SpngRowInfo.PASS); }
    /** Unsafe version of {@link #filter}. */
    public static byte nfilter(long struct) { return memGetByte(struct + SpngRowInfo.FILTER); }

    /** Unsafe version of {@link #scanline_idx(int) scanline_idx}. */
    public static void nscanline_idx(long struct, int value) { memPutInt(struct + SpngRowInfo.SCANLINE_IDX, value); }
    /** Unsafe version of {@link #row_num(int) row_num}. */
    public static void nrow_num(long struct, int value) { memPutInt(struct + SpngRowInfo.ROW_NUM, value); }
    /** Unsafe version of {@link #pass(int) pass}. */
    public static void npass(long struct, int value) { memPutInt(struct + SpngRowInfo.PASS, value); }
    /** Unsafe version of {@link #filter(byte) filter}. */
    public static void nfilter(long struct, byte value) { memPutByte(struct + SpngRowInfo.FILTER, value); }

    // -----------------------------------

    /** An array of {@link SpngRowInfo} structs. */
    public static class Buffer extends StructBuffer<SpngRowInfo, Buffer> implements NativeResource {

        private static final SpngRowInfo ELEMENT_FACTORY = SpngRowInfo.create(-1L);

        /**
         * Creates a new {@code SpngRowInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngRowInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngRowInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code scanline_idx} field. */
        @NativeType("uint32_t")
        public int scanline_idx() { return SpngRowInfo.nscanline_idx(address()); }
        /** @return the value of the {@code row_num} field. */
        @NativeType("uint32_t")
        public int row_num() { return SpngRowInfo.nrow_num(address()); }
        /** @return the value of the {@code pass} field. */
        public int pass() { return SpngRowInfo.npass(address()); }
        /** @return the value of the {@code filter} field. */
        @NativeType("uint8_t")
        public byte filter() { return SpngRowInfo.nfilter(address()); }

        /** Sets the specified value to the {@code scanline_idx} field. */
        public SpngRowInfo.Buffer scanline_idx(@NativeType("uint32_t") int value) { SpngRowInfo.nscanline_idx(address(), value); return this; }
        /** Sets the specified value to the {@code row_num} field. */
        public SpngRowInfo.Buffer row_num(@NativeType("uint32_t") int value) { SpngRowInfo.nrow_num(address(), value); return this; }
        /** Sets the specified value to the {@code pass} field. */
        public SpngRowInfo.Buffer pass(int value) { SpngRowInfo.npass(address(), value); return this; }
        /** Sets the specified value to the {@code filter} field. */
        public SpngRowInfo.Buffer filter(@NativeType("uint8_t") byte value) { SpngRowInfo.nfilter(address(), value); return this; }

    }

}