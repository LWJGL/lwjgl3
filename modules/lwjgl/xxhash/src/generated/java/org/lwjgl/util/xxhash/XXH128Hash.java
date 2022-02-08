/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The return value from 128-bit hashes.
 * 
 * <p>Stored in little endian order, although the fields themselves are in native endianness.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XXH128_hash_t {
 *     XXH64_hash_t {@link #low64};
 *     XXH64_hash_t {@link #high64};
 * }</code></pre>
 */
@NativeType("struct XXH128_hash_t")
public class XXH128Hash extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOW64,
        HIGH64;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOW64 = layout.offsetof(0);
        HIGH64 = layout.offsetof(1);
    }

    /**
     * Creates a {@code XXH128Hash} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XXH128Hash(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code value & 0xFFFFFFFFFFFFFFFF} */
    @NativeType("XXH64_hash_t")
    public long low64() { return nlow64(address()); }
    /** {@code value >> 64} */
    @NativeType("XXH64_hash_t")
    public long high64() { return nhigh64(address()); }

    // -----------------------------------

    /** Returns a new {@code XXH128Hash} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XXH128Hash malloc() {
        return wrap(XXH128Hash.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XXH128Hash} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XXH128Hash calloc() {
        return wrap(XXH128Hash.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XXH128Hash} instance allocated with {@link BufferUtils}. */
    public static XXH128Hash create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XXH128Hash.class, memAddress(container), container);
    }

    /** Returns a new {@code XXH128Hash} instance for the specified memory address. */
    public static XXH128Hash create(long address) {
        return wrap(XXH128Hash.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH128Hash createSafe(long address) {
        return address == NULL ? null : wrap(XXH128Hash.class, address);
    }

    /**
     * Returns a new {@link XXH128Hash.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH128Hash.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XXH128Hash.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH128Hash.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH128Hash.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH128Hash.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XXH128Hash.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XXH128Hash.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH128Hash.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XXH128Hash mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XXH128Hash callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XXH128Hash mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XXH128Hash callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH128Hash.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH128Hash.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH128Hash.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH128Hash.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XXH128Hash} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH128Hash malloc(MemoryStack stack) {
        return wrap(XXH128Hash.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XXH128Hash} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH128Hash calloc(MemoryStack stack) {
        return wrap(XXH128Hash.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XXH128Hash.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH128Hash.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH128Hash.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH128Hash.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #low64}. */
    public static long nlow64(long struct) { return UNSAFE.getLong(null, struct + XXH128Hash.LOW64); }
    /** Unsafe version of {@link #high64}. */
    public static long nhigh64(long struct) { return UNSAFE.getLong(null, struct + XXH128Hash.HIGH64); }

    // -----------------------------------

    /** An array of {@link XXH128Hash} structs. */
    public static class Buffer extends StructBuffer<XXH128Hash, Buffer> implements NativeResource {

        private static final XXH128Hash ELEMENT_FACTORY = XXH128Hash.create(-1L);

        /**
         * Creates a new {@code XXH128Hash.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XXH128Hash#SIZEOF}, and its mark will be undefined.
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
        protected XXH128Hash getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XXH128Hash#low64} field. */
        @NativeType("XXH64_hash_t")
        public long low64() { return XXH128Hash.nlow64(address()); }
        /** @return the value of the {@link XXH128Hash#high64} field. */
        @NativeType("XXH64_hash_t")
        public long high64() { return XXH128Hash.nhigh64(address()); }

    }

}