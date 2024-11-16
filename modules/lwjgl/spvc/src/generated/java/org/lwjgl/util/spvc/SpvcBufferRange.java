/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_buffer_range {
 *     unsigned int index;
 *     size_t offset;
 *     size_t range;
 * }</code></pre>
 */
@NativeType("struct spvc_buffer_range")
public class SpvcBufferRange extends Struct<SpvcBufferRange> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INDEX,
        OFFSET,
        RANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INDEX = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        RANGE = layout.offsetof(2);
    }

    protected SpvcBufferRange(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpvcBufferRange create(long address, @Nullable ByteBuffer container) {
        return new SpvcBufferRange(address, container);
    }

    /**
     * Creates a {@code SpvcBufferRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcBufferRange(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code index} field. */
    @NativeType("unsigned int")
    public int index() { return nindex(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("size_t")
    public long offset() { return noffset(address()); }
    /** @return the value of the {@code range} field. */
    @NativeType("size_t")
    public long range() { return nrange(address()); }

    /** Sets the specified value to the {@code index} field. */
    public SpvcBufferRange index(@NativeType("unsigned int") int value) { nindex(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public SpvcBufferRange offset(@NativeType("size_t") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code range} field. */
    public SpvcBufferRange range(@NativeType("size_t") long value) { nrange(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcBufferRange set(
        int index,
        long offset,
        long range
    ) {
        index(index);
        offset(offset);
        range(range);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcBufferRange set(SpvcBufferRange src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcBufferRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcBufferRange malloc() {
        return new SpvcBufferRange(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpvcBufferRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcBufferRange calloc() {
        return new SpvcBufferRange(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpvcBufferRange} instance allocated with {@link BufferUtils}. */
    public static SpvcBufferRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcBufferRange(memAddress(container), container);
    }

    /** Returns a new {@code SpvcBufferRange} instance for the specified memory address. */
    public static SpvcBufferRange create(long address) {
        return new SpvcBufferRange(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpvcBufferRange createSafe(long address) {
        return address == NULL ? null : new SpvcBufferRange(address, null);
    }

    /**
     * Returns a new {@link SpvcBufferRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcBufferRange.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcBufferRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcBufferRange.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcBufferRange.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcBufferRange.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpvcBufferRange.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcBufferRange.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpvcBufferRange.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpvcBufferRange} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcBufferRange malloc(MemoryStack stack) {
        return new SpvcBufferRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpvcBufferRange} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcBufferRange calloc(MemoryStack stack) {
        return new SpvcBufferRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpvcBufferRange.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcBufferRange.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcBufferRange.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcBufferRange.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #index}. */
    public static int nindex(long struct) { return memGetInt(struct + SpvcBufferRange.INDEX); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetAddress(struct + SpvcBufferRange.OFFSET); }
    /** Unsafe version of {@link #range}. */
    public static long nrange(long struct) { return memGetAddress(struct + SpvcBufferRange.RANGE); }

    /** Unsafe version of {@link #index(int) index}. */
    public static void nindex(long struct, int value) { memPutInt(struct + SpvcBufferRange.INDEX, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutAddress(struct + SpvcBufferRange.OFFSET, value); }
    /** Unsafe version of {@link #range(long) range}. */
    public static void nrange(long struct, long value) { memPutAddress(struct + SpvcBufferRange.RANGE, value); }

    // -----------------------------------

    /** An array of {@link SpvcBufferRange} structs. */
    public static class Buffer extends StructBuffer<SpvcBufferRange, Buffer> implements NativeResource {

        private static final SpvcBufferRange ELEMENT_FACTORY = SpvcBufferRange.create(-1L);

        /**
         * Creates a new {@code SpvcBufferRange.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcBufferRange#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpvcBufferRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code index} field. */
        @NativeType("unsigned int")
        public int index() { return SpvcBufferRange.nindex(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("size_t")
        public long offset() { return SpvcBufferRange.noffset(address()); }
        /** @return the value of the {@code range} field. */
        @NativeType("size_t")
        public long range() { return SpvcBufferRange.nrange(address()); }

        /** Sets the specified value to the {@code index} field. */
        public SpvcBufferRange.Buffer index(@NativeType("unsigned int") int value) { SpvcBufferRange.nindex(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public SpvcBufferRange.Buffer offset(@NativeType("size_t") long value) { SpvcBufferRange.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code range} field. */
        public SpvcBufferRange.Buffer range(@NativeType("size_t") long value) { SpvcBufferRange.nrange(address(), value); return this; }

    }

}