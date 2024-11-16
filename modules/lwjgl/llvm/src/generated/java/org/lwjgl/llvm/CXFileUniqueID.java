/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Uniquely identifies a CXFile, that refers to the same underlying file, across an indexing session.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXFileUniqueID {
 *     unsigned long long data[3];
 * }</code></pre>
 */
public class CXFileUniqueID extends Struct<CXFileUniqueID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA;

    static {
        Layout layout = __struct(
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
    }

    protected CXFileUniqueID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CXFileUniqueID create(long address, @Nullable ByteBuffer container) {
        return new CXFileUniqueID(address, container);
    }

    /**
     * Creates a {@code CXFileUniqueID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXFileUniqueID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link LongBuffer} view of the {@code data} field. */
    @NativeType("unsigned long long[3]")
    public LongBuffer data() { return ndata(address()); }
    /** @return the value at the specified index of the {@code data} field. */
    @NativeType("unsigned long long")
    public long data(int index) { return ndata(address(), index); }

    // -----------------------------------

    /** Returns a new {@code CXFileUniqueID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXFileUniqueID malloc() {
        return new CXFileUniqueID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CXFileUniqueID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXFileUniqueID calloc() {
        return new CXFileUniqueID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CXFileUniqueID} instance allocated with {@link BufferUtils}. */
    public static CXFileUniqueID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CXFileUniqueID(memAddress(container), container);
    }

    /** Returns a new {@code CXFileUniqueID} instance for the specified memory address. */
    public static CXFileUniqueID create(long address) {
        return new CXFileUniqueID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CXFileUniqueID createSafe(long address) {
        return address == NULL ? null : new CXFileUniqueID(address, null);
    }

    /**
     * Returns a new {@link CXFileUniqueID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXFileUniqueID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXFileUniqueID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXFileUniqueID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXFileUniqueID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXFileUniqueID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CXFileUniqueID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXFileUniqueID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CXFileUniqueID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXFileUniqueID mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXFileUniqueID callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXFileUniqueID mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXFileUniqueID callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXFileUniqueID.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXFileUniqueID.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXFileUniqueID.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXFileUniqueID.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXFileUniqueID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXFileUniqueID malloc(MemoryStack stack) {
        return new CXFileUniqueID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CXFileUniqueID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXFileUniqueID calloc(MemoryStack stack) {
        return new CXFileUniqueID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CXFileUniqueID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXFileUniqueID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXFileUniqueID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXFileUniqueID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data}. */
    public static LongBuffer ndata(long struct) { return memLongBuffer(struct + CXFileUniqueID.DATA, 3); }
    /** Unsafe version of {@link #data(int) data}. */
    public static long ndata(long struct, int index) {
        return memGetLong(struct + CXFileUniqueID.DATA + check(index, 3) * 8);
    }

    // -----------------------------------

    /** An array of {@link CXFileUniqueID} structs. */
    public static class Buffer extends StructBuffer<CXFileUniqueID, Buffer> implements NativeResource {

        private static final CXFileUniqueID ELEMENT_FACTORY = CXFileUniqueID.create(-1L);

        /**
         * Creates a new {@code CXFileUniqueID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXFileUniqueID#SIZEOF}, and its mark will be undefined.</p>
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
        protected CXFileUniqueID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link LongBuffer} view of the {@code data} field. */
        @NativeType("unsigned long long[3]")
        public LongBuffer data() { return CXFileUniqueID.ndata(address()); }
        /** @return the value at the specified index of the {@code data} field. */
        @NativeType("unsigned long long")
        public long data(int index) { return CXFileUniqueID.ndata(address(), index); }

    }

}