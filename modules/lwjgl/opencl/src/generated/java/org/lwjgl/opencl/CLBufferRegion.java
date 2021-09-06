/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Buffer region struct.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_buffer_region {
 *     size_t {@link #origin};
 *     size_t {@link #size};
 * }</code></pre>
 */
@NativeType("struct cl_buffer_region")
public class CLBufferRegion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ORIGIN,
        SIZE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ORIGIN = layout.offsetof(0);
        SIZE = layout.offsetof(1);
    }

    /**
     * Creates a {@code CLBufferRegion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLBufferRegion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the region offset, in bytes */
    @NativeType("size_t")
    public long origin() { return norigin(address()); }
    /** the region size, in bytes */
    @NativeType("size_t")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@link #origin} field. */
    public CLBufferRegion origin(@NativeType("size_t") long value) { norigin(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public CLBufferRegion size(@NativeType("size_t") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CLBufferRegion set(
        long origin,
        long size
    ) {
        origin(origin);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLBufferRegion set(CLBufferRegion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CLBufferRegion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLBufferRegion malloc() {
        return wrap(CLBufferRegion.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CLBufferRegion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLBufferRegion calloc() {
        return wrap(CLBufferRegion.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CLBufferRegion} instance allocated with {@link BufferUtils}. */
    public static CLBufferRegion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CLBufferRegion.class, memAddress(container), container);
    }

    /** Returns a new {@code CLBufferRegion} instance for the specified memory address. */
    public static CLBufferRegion create(long address) {
        return wrap(CLBufferRegion.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLBufferRegion createSafe(long address) {
        return address == NULL ? null : wrap(CLBufferRegion.class, address);
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CLBufferRegion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLBufferRegion.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLBufferRegion mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLBufferRegion callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLBufferRegion mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLBufferRegion callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLBufferRegion.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLBufferRegion.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLBufferRegion.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLBufferRegion.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CLBufferRegion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLBufferRegion malloc(MemoryStack stack) {
        return wrap(CLBufferRegion.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CLBufferRegion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLBufferRegion calloc(MemoryStack stack) {
        return wrap(CLBufferRegion.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #origin}. */
    public static long norigin(long struct) { return memGetAddress(struct + CLBufferRegion.ORIGIN); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + CLBufferRegion.SIZE); }

    /** Unsafe version of {@link #origin(long) origin}. */
    public static void norigin(long struct, long value) { memPutAddress(struct + CLBufferRegion.ORIGIN, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + CLBufferRegion.SIZE, value); }

    // -----------------------------------

    /** An array of {@link CLBufferRegion} structs. */
    public static class Buffer extends StructBuffer<CLBufferRegion, Buffer> implements NativeResource {

        private static final CLBufferRegion ELEMENT_FACTORY = CLBufferRegion.create(-1L);

        /**
         * Creates a new {@code CLBufferRegion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLBufferRegion#SIZEOF}, and its mark will be undefined.
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
        protected CLBufferRegion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CLBufferRegion#origin} field. */
        @NativeType("size_t")
        public long origin() { return CLBufferRegion.norigin(address()); }
        /** @return the value of the {@link CLBufferRegion#size} field. */
        @NativeType("size_t")
        public long size() { return CLBufferRegion.nsize(address()); }

        /** Sets the specified value to the {@link CLBufferRegion#origin} field. */
        public CLBufferRegion.Buffer origin(@NativeType("size_t") long value) { CLBufferRegion.norigin(address(), value); return this; }
        /** Sets the specified value to the {@link CLBufferRegion#size} field. */
        public CLBufferRegion.Buffer size(@NativeType("size_t") long value) { CLBufferRegion.nsize(address(), value); return this; }

    }

}