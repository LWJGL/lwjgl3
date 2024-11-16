/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

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
 * struct ZSTD_bounds {
 *     size_t error;
 *     int lowerBound;
 *     int upperBound;
 * }</code></pre>
 */
@NativeType("struct ZSTD_bounds")
public class ZSTDBounds extends Struct<ZSTDBounds> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ERROR,
        LOWERBOUND,
        UPPERBOUND;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ERROR = layout.offsetof(0);
        LOWERBOUND = layout.offsetof(1);
        UPPERBOUND = layout.offsetof(2);
    }

    protected ZSTDBounds(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ZSTDBounds create(long address, @Nullable ByteBuffer container) {
        return new ZSTDBounds(address, container);
    }

    /**
     * Creates a {@code ZSTDBounds} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDBounds(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code error} field. */
    @NativeType("size_t")
    public long error() { return nerror(address()); }
    /** @return the value of the {@code lowerBound} field. */
    public int lowerBound() { return nlowerBound(address()); }
    /** @return the value of the {@code upperBound} field. */
    public int upperBound() { return nupperBound(address()); }

    // -----------------------------------

    /** Returns a new {@code ZSTDBounds} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDBounds malloc() {
        return new ZSTDBounds(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ZSTDBounds} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDBounds calloc() {
        return new ZSTDBounds(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ZSTDBounds} instance allocated with {@link BufferUtils}. */
    public static ZSTDBounds create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ZSTDBounds(memAddress(container), container);
    }

    /** Returns a new {@code ZSTDBounds} instance for the specified memory address. */
    public static ZSTDBounds create(long address) {
        return new ZSTDBounds(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ZSTDBounds createSafe(long address) {
        return address == NULL ? null : new ZSTDBounds(address, null);
    }

    /**
     * Returns a new {@link ZSTDBounds.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDBounds.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZSTDBounds.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDBounds.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDBounds.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDBounds.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ZSTDBounds.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDBounds.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ZSTDBounds.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDBounds mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDBounds callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDBounds mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDBounds callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDBounds.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDBounds.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDBounds.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDBounds.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ZSTDBounds} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDBounds malloc(MemoryStack stack) {
        return new ZSTDBounds(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ZSTDBounds} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDBounds calloc(MemoryStack stack) {
        return new ZSTDBounds(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ZSTDBounds.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDBounds.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDBounds.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDBounds.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #error}. */
    public static long nerror(long struct) { return memGetAddress(struct + ZSTDBounds.ERROR); }
    /** Unsafe version of {@link #lowerBound}. */
    public static int nlowerBound(long struct) { return memGetInt(struct + ZSTDBounds.LOWERBOUND); }
    /** Unsafe version of {@link #upperBound}. */
    public static int nupperBound(long struct) { return memGetInt(struct + ZSTDBounds.UPPERBOUND); }

    // -----------------------------------

    /** An array of {@link ZSTDBounds} structs. */
    public static class Buffer extends StructBuffer<ZSTDBounds, Buffer> implements NativeResource {

        private static final ZSTDBounds ELEMENT_FACTORY = ZSTDBounds.create(-1L);

        /**
         * Creates a new {@code ZSTDBounds.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDBounds#SIZEOF}, and its mark will be undefined.</p>
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
        protected ZSTDBounds getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code error} field. */
        @NativeType("size_t")
        public long error() { return ZSTDBounds.nerror(address()); }
        /** @return the value of the {@code lowerBound} field. */
        public int lowerBound() { return ZSTDBounds.nlowerBound(address()); }
        /** @return the value of the {@code upperBound} field. */
        public int upperBound() { return ZSTDBounds.nupperBound(address()); }

    }

}