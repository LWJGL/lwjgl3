/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The memory usage of a CXTranslationUnit, broken into categories.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXTUResourceUsage {
 *     void * {@link #data};
 *     unsigned {@link #numEntries};
 *     {@link CXTUResourceUsageEntry CXTUResourceUsageEntry} * {@link #entries};
 * }</code></pre>
 */
public class CXTUResourceUsage extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        NUMENTRIES,
        ENTRIES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        NUMENTRIES = layout.offsetof(1);
        ENTRIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code CXTUResourceUsage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXTUResourceUsage(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** private data member, used for queries */
    @NativeType("void *")
    public long data() { return ndata(address()); }
    /** the number of entries in the {@code entries} array. */
    @NativeType("unsigned")
    public int numEntries() { return nnumEntries(address()); }
    /** an array of key-value pairs, representing the breakdown of memory usage */
    @NativeType("CXTUResourceUsageEntry *")
    public CXTUResourceUsageEntry.Buffer entries() { return nentries(address()); }

    // -----------------------------------

    /** Returns a new {@code CXTUResourceUsage} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXTUResourceUsage malloc() {
        return wrap(CXTUResourceUsage.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CXTUResourceUsage} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXTUResourceUsage calloc() {
        return wrap(CXTUResourceUsage.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CXTUResourceUsage} instance allocated with {@link BufferUtils}. */
    public static CXTUResourceUsage create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CXTUResourceUsage.class, memAddress(container), container);
    }

    /** Returns a new {@code CXTUResourceUsage} instance for the specified memory address. */
    public static CXTUResourceUsage create(long address) {
        return wrap(CXTUResourceUsage.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXTUResourceUsage createSafe(long address) {
        return address == NULL ? null : wrap(CXTUResourceUsage.class, address);
    }

    /**
     * Returns a new {@link CXTUResourceUsage.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsage.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXTUResourceUsage.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsage.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXTUResourceUsage.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsage.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CXTUResourceUsage.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsage.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXTUResourceUsage.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsage mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsage callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsage mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsage callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsage.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsage.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsage.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXTUResourceUsage.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXTUResourceUsage} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXTUResourceUsage malloc(MemoryStack stack) {
        return wrap(CXTUResourceUsage.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CXTUResourceUsage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXTUResourceUsage calloc(MemoryStack stack) {
        return wrap(CXTUResourceUsage.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CXTUResourceUsage.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsage.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXTUResourceUsage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsage.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data}. */
    public static long ndata(long struct) { return memGetAddress(struct + CXTUResourceUsage.DATA); }
    /** Unsafe version of {@link #numEntries}. */
    public static int nnumEntries(long struct) { return UNSAFE.getInt(null, struct + CXTUResourceUsage.NUMENTRIES); }
    /** Unsafe version of {@link #entries}. */
    public static CXTUResourceUsageEntry.Buffer nentries(long struct) { return CXTUResourceUsageEntry.create(memGetAddress(struct + CXTUResourceUsage.ENTRIES), nnumEntries(struct)); }

    // -----------------------------------

    /** An array of {@link CXTUResourceUsage} structs. */
    public static class Buffer extends StructBuffer<CXTUResourceUsage, Buffer> implements NativeResource {

        private static final CXTUResourceUsage ELEMENT_FACTORY = CXTUResourceUsage.create(-1L);

        /**
         * Creates a new {@code CXTUResourceUsage.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXTUResourceUsage#SIZEOF}, and its mark will be undefined.
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
        protected CXTUResourceUsage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CXTUResourceUsage#data} field. */
        @NativeType("void *")
        public long data() { return CXTUResourceUsage.ndata(address()); }
        /** @return the value of the {@link CXTUResourceUsage#numEntries} field. */
        @NativeType("unsigned")
        public int numEntries() { return CXTUResourceUsage.nnumEntries(address()); }
        /** @return a {@link CXTUResourceUsageEntry.Buffer} view of the struct array pointed to by the {@link CXTUResourceUsage#entries} field. */
        @NativeType("CXTUResourceUsageEntry *")
        public CXTUResourceUsageEntry.Buffer entries() { return CXTUResourceUsage.nentries(address()); }

    }

}