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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_hist {
 *     uint16_t frequency[256];
 * }}</pre>
 */
@NativeType("struct spng_hist")
public class spng_hist extends Struct<spng_hist> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FREQUENCY;

    static {
        Layout layout = __struct(
            __array(2, 256)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FREQUENCY = layout.offsetof(0);
    }

    protected spng_hist(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_hist create(long address, @Nullable ByteBuffer container) {
        return new spng_hist(address, container);
    }

    /**
     * Creates a {@code spng_hist} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_hist(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ShortBuffer} view of the {@code frequency} field. */
    @NativeType("uint16_t[256]")
    public ShortBuffer frequency() { return nfrequency(address()); }
    /** @return the value at the specified index of the {@code frequency} field. */
    @NativeType("uint16_t")
    public short frequency(int index) { return nfrequency(address(), index); }

    /** Copies the specified {@link ShortBuffer} to the {@code frequency} field. */
    public spng_hist frequency(@NativeType("uint16_t[256]") ShortBuffer value) { nfrequency(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code frequency} field. */
    public spng_hist frequency(int index, @NativeType("uint16_t") short value) { nfrequency(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_hist set(spng_hist src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_hist} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_hist malloc() {
        return new spng_hist(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_hist} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_hist calloc() {
        return new spng_hist(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_hist} instance allocated with {@link BufferUtils}. */
    public static spng_hist create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_hist(memAddress(container), container);
    }

    /** Returns a new {@code spng_hist} instance for the specified memory address. */
    public static spng_hist create(long address) {
        return new spng_hist(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_hist createSafe(long address) {
        return address == NULL ? null : new spng_hist(address, null);
    }

    /**
     * Returns a new {@link spng_hist.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_hist.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_hist.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_hist.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_hist.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_hist.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_hist.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_hist.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_hist.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_hist} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_hist malloc(MemoryStack stack) {
        return new spng_hist(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_hist} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_hist calloc(MemoryStack stack) {
        return new spng_hist(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_hist.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_hist.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_hist.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_hist.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #frequency}. */
    public static ShortBuffer nfrequency(long struct) { return memShortBuffer(struct + spng_hist.FREQUENCY, 256); }
    /** Unsafe version of {@link #frequency(int) frequency}. */
    public static short nfrequency(long struct, int index) {
        return memGetShort(struct + spng_hist.FREQUENCY + check(index, 256) * 2);
    }

    /** Unsafe version of {@link #frequency(ShortBuffer) frequency}. */
    public static void nfrequency(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 256); }
        memCopy(memAddress(value), struct + spng_hist.FREQUENCY, value.remaining() * 2);
    }
    /** Unsafe version of {@link #frequency(int, short) frequency}. */
    public static void nfrequency(long struct, int index, short value) {
        memPutShort(struct + spng_hist.FREQUENCY + check(index, 256) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link spng_hist} structs. */
    public static class Buffer extends StructBuffer<spng_hist, Buffer> implements NativeResource {

        private static final spng_hist ELEMENT_FACTORY = spng_hist.create(-1L);

        /**
         * Creates a new {@code spng_hist.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_hist#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_hist getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ShortBuffer} view of the {@code frequency} field. */
        @NativeType("uint16_t[256]")
        public ShortBuffer frequency() { return spng_hist.nfrequency(address()); }
        /** @return the value at the specified index of the {@code frequency} field. */
        @NativeType("uint16_t")
        public short frequency(int index) { return spng_hist.nfrequency(address(), index); }

        /** Copies the specified {@link ShortBuffer} to the {@code frequency} field. */
        public spng_hist.Buffer frequency(@NativeType("uint16_t[256]") ShortBuffer value) { spng_hist.nfrequency(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code frequency} field. */
        public spng_hist.Buffer frequency(int index, @NativeType("uint16_t") short value) { spng_hist.nfrequency(address(), index, value); return this; }

    }

}