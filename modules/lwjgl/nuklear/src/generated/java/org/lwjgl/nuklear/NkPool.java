/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_pool {
 *     {@link NkAllocator struct nk_allocator} alloc;
 *     enum nk_allocation_type type;
 *     unsigned int page_count;
 *     struct nk_page * pages;
 *     struct nk_page_element * freelist;
 *     unsigned capacity;
 *     nk_size size;
 *     nk_size cap;
 * }</code></pre>
 */
@NativeType("struct nk_pool")
class NkPool extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOC,
        TYPE,
        PAGE_COUNT,
        PAGES,
        FREELIST,
        CAPACITY,
        SIZE,
        CAP;

    static {
        Layout layout = __struct(
            __member(NkAllocator.SIZEOF, NkAllocator.ALIGNOF),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOC = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        PAGE_COUNT = layout.offsetof(2);
        PAGES = layout.offsetof(3);
        FREELIST = layout.offsetof(4);
        CAPACITY = layout.offsetof(5);
        SIZE = layout.offsetof(6);
        CAP = layout.offsetof(7);
    }

    /**
     * Creates a {@code NkPool} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    NkPool(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkAllocator} view of the {@code alloc} field. */
    @NativeType("struct nk_allocator")
    public NkAllocator alloc() { return nalloc(address()); }
    /** Returns the value of the {@code type} field. */
    @NativeType("enum nk_allocation_type")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code page_count} field. */
    @NativeType("unsigned int")
    public int page_count() { return npage_count(address()); }
    /** Returns the value of the {@code pages} field. */
    @NativeType("struct nk_page *")
    public long pages() { return npages(address()); }
    /** Returns the value of the {@code freelist} field. */
    @NativeType("struct nk_page_element *")
    public long freelist() { return nfreelist(address()); }
    /** Returns the value of the {@code capacity} field. */
    @NativeType("unsigned")
    public int capacity$() { return ncapacity$(address()); }
    /** Returns the value of the {@code size} field. */
    @NativeType("nk_size")
    public long size() { return nsize(address()); }
    /** Returns the value of the {@code cap} field. */
    @NativeType("nk_size")
    public long cap() { return ncap(address()); }

    // -----------------------------------

    /** Returns a new {@code NkPool} instance for the specified memory address. */
    public static NkPool create(long address) {
        return wrap(NkPool.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkPool createSafe(long address) {
        return address == NULL ? null : wrap(NkPool.class, address);
    }

    /**
     * Create a {@link NkPool.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkPool.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkPool.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #alloc}. */
    public static NkAllocator nalloc(long struct) { return NkAllocator.create(struct + NkPool.ALLOC); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + NkPool.TYPE); }
    /** Unsafe version of {@link #page_count}. */
    public static int npage_count(long struct) { return UNSAFE.getInt(null, struct + NkPool.PAGE_COUNT); }
    /** Unsafe version of {@link #pages}. */
    public static long npages(long struct) { return memGetAddress(struct + NkPool.PAGES); }
    /** Unsafe version of {@link #freelist}. */
    public static long nfreelist(long struct) { return memGetAddress(struct + NkPool.FREELIST); }
    /** Unsafe version of {@link #capacity$}. */
    public static int ncapacity$(long struct) { return UNSAFE.getInt(null, struct + NkPool.CAPACITY); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + NkPool.SIZE); }
    /** Unsafe version of {@link #cap}. */
    public static long ncap(long struct) { return memGetAddress(struct + NkPool.CAP); }

    // -----------------------------------

    /** An array of {@link NkPool} structs. */
    public static class Buffer extends StructBuffer<NkPool, Buffer> {

        private static final NkPool ELEMENT_FACTORY = NkPool.create(-1L);

        /**
         * Creates a new {@code NkPool.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkPool#SIZEOF}, and its mark will be undefined.
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
        protected NkPool getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkAllocator} view of the {@code alloc} field. */
        @NativeType("struct nk_allocator")
        public NkAllocator alloc() { return NkPool.nalloc(address()); }
        /** Returns the value of the {@code type} field. */
        @NativeType("enum nk_allocation_type")
        public int type() { return NkPool.ntype(address()); }
        /** Returns the value of the {@code page_count} field. */
        @NativeType("unsigned int")
        public int page_count() { return NkPool.npage_count(address()); }
        /** Returns the value of the {@code pages} field. */
        @NativeType("struct nk_page *")
        public long pages() { return NkPool.npages(address()); }
        /** Returns the value of the {@code freelist} field. */
        @NativeType("struct nk_page_element *")
        public long freelist() { return NkPool.nfreelist(address()); }
        /** Returns the value of the {@code capacity} field. */
        @NativeType("unsigned")
        public int capacity$() { return NkPool.ncapacity$(address()); }
        /** Returns the value of the {@code size} field. */
        @NativeType("nk_size")
        public long size() { return NkPool.nsize(address()); }
        /** Returns the value of the {@code cap} field. */
        @NativeType("nk_size")
        public long cap() { return NkPool.ncap(address()); }

    }

}