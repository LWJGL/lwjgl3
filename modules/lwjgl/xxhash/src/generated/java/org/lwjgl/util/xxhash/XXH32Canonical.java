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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * 32-bit canonical representation.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code digest[4]} &ndash; the digest in canonical representation</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XXH32_canonical_t {
 *     unsigned char digest[4];
 * }</code></pre>
 */
@NativeType("struct XXH32_canonical_t")
public class XXH32Canonical extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DIGEST;

    static {
        Layout layout = __struct(
            __array(1, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DIGEST = layout.offsetof(0);
    }

    /**
     * Creates a {@code XXH32Canonical} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XXH32Canonical(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code digest} field. */
    @NativeType("unsigned char[4]")
    public ByteBuffer digest() { return ndigest(address()); }
    /** Returns the value at the specified index of the {@code digest} field. */
    @NativeType("unsigned char")
    public byte digest(int index) { return ndigest(address(), index); }

    // -----------------------------------

    /** Returns a new {@code XXH32Canonical} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XXH32Canonical malloc() {
        return wrap(XXH32Canonical.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XXH32Canonical} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XXH32Canonical calloc() {
        return wrap(XXH32Canonical.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XXH32Canonical} instance allocated with {@link BufferUtils}. */
    public static XXH32Canonical create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XXH32Canonical.class, memAddress(container), container);
    }

    /** Returns a new {@code XXH32Canonical} instance for the specified memory address. */
    public static XXH32Canonical create(long address) {
        return wrap(XXH32Canonical.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH32Canonical createSafe(long address) {
        return address == NULL ? null : wrap(XXH32Canonical.class, address);
    }

    /**
     * Returns a new {@link XXH32Canonical.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32Canonical.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XXH32Canonical.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32Canonical.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH32Canonical.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32Canonical.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XXH32Canonical.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XXH32Canonical.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH32Canonical.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XXH32Canonical} instance allocated on the thread-local {@link MemoryStack}. */
    public static XXH32Canonical mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XXH32Canonical} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XXH32Canonical callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XXH32Canonical} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH32Canonical mallocStack(MemoryStack stack) {
        return wrap(XXH32Canonical.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XXH32Canonical} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH32Canonical callocStack(MemoryStack stack) {
        return wrap(XXH32Canonical.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XXH32Canonical.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32Canonical.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XXH32Canonical.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32Canonical.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XXH32Canonical.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH32Canonical.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH32Canonical.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH32Canonical.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #digest}. */
    public static ByteBuffer ndigest(long struct) { return memByteBuffer(struct + XXH32Canonical.DIGEST, 4); }
    /** Unsafe version of {@link #digest(int) digest}. */
    public static byte ndigest(long struct, int index) {
        return UNSAFE.getByte(null, struct + XXH32Canonical.DIGEST + check(index, 4) * 1);
    }

    // -----------------------------------

    /** An array of {@link XXH32Canonical} structs. */
    public static class Buffer extends StructBuffer<XXH32Canonical, Buffer> implements NativeResource {

        private static final XXH32Canonical ELEMENT_FACTORY = XXH32Canonical.create(-1L);

        /**
         * Creates a new {@code XXH32Canonical.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XXH32Canonical#SIZEOF}, and its mark will be undefined.
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
        protected XXH32Canonical getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ByteBuffer} view of the {@code digest} field. */
        @NativeType("unsigned char[4]")
        public ByteBuffer digest() { return XXH32Canonical.ndigest(address()); }
        /** Returns the value at the specified index of the {@code digest} field. */
        @NativeType("unsigned char")
        public byte digest(int index) { return XXH32Canonical.ndigest(address(), index); }

    }

}