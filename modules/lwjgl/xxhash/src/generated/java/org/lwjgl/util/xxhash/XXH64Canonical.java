/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * 64-bit canonical representation.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XXH64_canonical_t {
 *     unsigned char {@link #digest}[8];
 * }</code></pre>
 */
@NativeType("struct XXH64_canonical_t")
public class XXH64Canonical extends Struct<XXH64Canonical> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DIGEST;

    static {
        Layout layout = __struct(
            __array(1, 8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DIGEST = layout.offsetof(0);
    }

    protected XXH64Canonical(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XXH64Canonical create(long address, @Nullable ByteBuffer container) {
        return new XXH64Canonical(address, container);
    }

    /**
     * Creates a {@code XXH64Canonical} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XXH64Canonical(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the digest in canonical representation */
    @NativeType("unsigned char[8]")
    public ByteBuffer digest() { return ndigest(address()); }
    /** the digest in canonical representation */
    @NativeType("unsigned char")
    public byte digest(int index) { return ndigest(address(), index); }

    // -----------------------------------

    /** Returns a new {@code XXH64Canonical} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XXH64Canonical malloc() {
        return new XXH64Canonical(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XXH64Canonical} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XXH64Canonical calloc() {
        return new XXH64Canonical(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XXH64Canonical} instance allocated with {@link BufferUtils}. */
    public static XXH64Canonical create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XXH64Canonical(memAddress(container), container);
    }

    /** Returns a new {@code XXH64Canonical} instance for the specified memory address. */
    public static XXH64Canonical create(long address) {
        return new XXH64Canonical(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XXH64Canonical createSafe(long address) {
        return address == NULL ? null : new XXH64Canonical(address, null);
    }

    /**
     * Returns a new {@link XXH64Canonical.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64Canonical.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XXH64Canonical.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64Canonical.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH64Canonical.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64Canonical.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XXH64Canonical.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XXH64Canonical.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XXH64Canonical.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XXH64Canonical mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XXH64Canonical callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XXH64Canonical mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XXH64Canonical callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH64Canonical.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH64Canonical.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH64Canonical.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH64Canonical.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XXH64Canonical} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH64Canonical malloc(MemoryStack stack) {
        return new XXH64Canonical(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XXH64Canonical} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH64Canonical calloc(MemoryStack stack) {
        return new XXH64Canonical(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XXH64Canonical.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH64Canonical.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH64Canonical.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH64Canonical.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #digest}. */
    public static ByteBuffer ndigest(long struct) { return memByteBuffer(struct + XXH64Canonical.DIGEST, 8); }
    /** Unsafe version of {@link #digest(int) digest}. */
    public static byte ndigest(long struct, int index) {
        return memGetByte(struct + XXH64Canonical.DIGEST + check(index, 8) * 1);
    }

    // -----------------------------------

    /** An array of {@link XXH64Canonical} structs. */
    public static class Buffer extends StructBuffer<XXH64Canonical, Buffer> implements NativeResource {

        private static final XXH64Canonical ELEMENT_FACTORY = XXH64Canonical.create(-1L);

        /**
         * Creates a new {@code XXH64Canonical.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XXH64Canonical#SIZEOF}, and its mark will be undefined.</p>
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
        protected XXH64Canonical getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link XXH64Canonical#digest} field. */
        @NativeType("unsigned char[8]")
        public ByteBuffer digest() { return XXH64Canonical.ndigest(address()); }
        /** @return the value at the specified index of the {@link XXH64Canonical#digest} field. */
        @NativeType("unsigned char")
        public byte digest(int index) { return XXH64Canonical.ndigest(address(), index); }

    }

}