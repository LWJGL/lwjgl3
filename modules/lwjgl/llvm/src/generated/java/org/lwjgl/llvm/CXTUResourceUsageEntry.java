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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct CXTUResourceUsageEntry {
 *     enum CXTUResourceUsageKind kind;
 *     unsigned long amount;
 * }}</pre>
 */
public class CXTUResourceUsageEntry extends Struct<CXTUResourceUsageEntry> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KIND,
        AMOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KIND = layout.offsetof(0);
        AMOUNT = layout.offsetof(1);
    }

    protected CXTUResourceUsageEntry(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CXTUResourceUsageEntry create(long address, @Nullable ByteBuffer container) {
        return new CXTUResourceUsageEntry(address, container);
    }

    /**
     * Creates a {@code CXTUResourceUsageEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXTUResourceUsageEntry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code kind} field. */
    @NativeType("enum CXTUResourceUsageKind")
    public int kind() { return nkind(address()); }
    /** @return the value of the {@code amount} field. */
    @NativeType("unsigned long")
    public long amount() { return namount(address()); }

    // -----------------------------------

    /** Returns a new {@code CXTUResourceUsageEntry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXTUResourceUsageEntry malloc() {
        return new CXTUResourceUsageEntry(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CXTUResourceUsageEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXTUResourceUsageEntry calloc() {
        return new CXTUResourceUsageEntry(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CXTUResourceUsageEntry} instance allocated with {@link BufferUtils}. */
    public static CXTUResourceUsageEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CXTUResourceUsageEntry(memAddress(container), container);
    }

    /** Returns a new {@code CXTUResourceUsageEntry} instance for the specified memory address. */
    public static CXTUResourceUsageEntry create(long address) {
        return new CXTUResourceUsageEntry(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CXTUResourceUsageEntry createSafe(long address) {
        return address == NULL ? null : new CXTUResourceUsageEntry(address, null);
    }

    /**
     * Returns a new {@link CXTUResourceUsageEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsageEntry.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXTUResourceUsageEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsageEntry.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXTUResourceUsageEntry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsageEntry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CXTUResourceUsageEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsageEntry.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CXTUResourceUsageEntry.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsageEntry mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsageEntry callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsageEntry mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsageEntry callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsageEntry.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsageEntry.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsageEntry.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsageEntry.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXTUResourceUsageEntry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXTUResourceUsageEntry malloc(MemoryStack stack) {
        return new CXTUResourceUsageEntry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CXTUResourceUsageEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXTUResourceUsageEntry calloc(MemoryStack stack) {
        return new CXTUResourceUsageEntry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CXTUResourceUsageEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsageEntry.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXTUResourceUsageEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsageEntry.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #kind}. */
    public static int nkind(long struct) { return memGetInt(struct + CXTUResourceUsageEntry.KIND); }
    /** Unsafe version of {@link #amount}. */
    public static long namount(long struct) { return memGetCLong(struct + CXTUResourceUsageEntry.AMOUNT); }

    // -----------------------------------

    /** An array of {@link CXTUResourceUsageEntry} structs. */
    public static class Buffer extends StructBuffer<CXTUResourceUsageEntry, Buffer> implements NativeResource {

        private static final CXTUResourceUsageEntry ELEMENT_FACTORY = CXTUResourceUsageEntry.create(-1L);

        /**
         * Creates a new {@code CXTUResourceUsageEntry.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXTUResourceUsageEntry#SIZEOF}, and its mark will be undefined.</p>
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
        protected CXTUResourceUsageEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code kind} field. */
        @NativeType("enum CXTUResourceUsageKind")
        public int kind() { return CXTUResourceUsageEntry.nkind(address()); }
        /** @return the value of the {@code amount} field. */
        @NativeType("unsigned long")
        public long amount() { return CXTUResourceUsageEntry.namount(address()); }

    }

}