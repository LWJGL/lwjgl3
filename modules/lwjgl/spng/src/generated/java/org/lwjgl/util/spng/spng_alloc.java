/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct spng_alloc {
 *     {@link spng_malloc_fnI spng_malloc_fn} * malloc_fn;
 *     {@link spng_realloc_fnI spng_realloc_fn} * realloc_fn;
 *     {@link spng_calloc_fnI spng_calloc_fn} * calloc_fn;
 *     {@link spng_free_fnI spng_free_fn} * free_fn;
 * }</code></pre>
 */
@NativeType("struct spng_alloc")
public class spng_alloc extends Struct<spng_alloc> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MALLOC_FN,
        REALLOC_FN,
        CALLOC_FN,
        FREE_FN;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MALLOC_FN = layout.offsetof(0);
        REALLOC_FN = layout.offsetof(1);
        CALLOC_FN = layout.offsetof(2);
        FREE_FN = layout.offsetof(3);
    }

    protected spng_alloc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_alloc create(long address, @Nullable ByteBuffer container) {
        return new spng_alloc(address, container);
    }

    /**
     * Creates a {@code spng_alloc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_alloc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code malloc_fn} field. */
    @NativeType("spng_malloc_fn *")
    public PointerBuffer malloc_fn(int capacity) { return nmalloc_fn(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code realloc_fn} field. */
    @NativeType("spng_realloc_fn *")
    public PointerBuffer realloc_fn(int capacity) { return nrealloc_fn(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code calloc_fn} field. */
    @NativeType("spng_calloc_fn *")
    public PointerBuffer calloc_fn(int capacity) { return ncalloc_fn(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code free_fn} field. */
    @NativeType("spng_free_fn *")
    public PointerBuffer free_fn(int capacity) { return nfree_fn(address(), capacity); }

    /** Sets the address of the specified {@link PointerBuffer} to the {@code malloc_fn} field. */
    public spng_alloc malloc_fn(@NativeType("spng_malloc_fn *") PointerBuffer value) { nmalloc_fn(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code realloc_fn} field. */
    public spng_alloc realloc_fn(@NativeType("spng_realloc_fn *") PointerBuffer value) { nrealloc_fn(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code calloc_fn} field. */
    public spng_alloc calloc_fn(@NativeType("spng_calloc_fn *") PointerBuffer value) { ncalloc_fn(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code free_fn} field. */
    public spng_alloc free_fn(@NativeType("spng_free_fn *") PointerBuffer value) { nfree_fn(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_alloc set(
        PointerBuffer malloc_fn,
        PointerBuffer realloc_fn,
        PointerBuffer calloc_fn,
        PointerBuffer free_fn
    ) {
        malloc_fn(malloc_fn);
        realloc_fn(realloc_fn);
        calloc_fn(calloc_fn);
        free_fn(free_fn);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_alloc set(spng_alloc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_alloc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_alloc malloc() {
        return new spng_alloc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_alloc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_alloc calloc() {
        return new spng_alloc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_alloc} instance allocated with {@link BufferUtils}. */
    public static spng_alloc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_alloc(memAddress(container), container);
    }

    /** Returns a new {@code spng_alloc} instance for the specified memory address. */
    public static spng_alloc create(long address) {
        return new spng_alloc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_alloc createSafe(long address) {
        return address == NULL ? null : new spng_alloc(address, null);
    }

    /**
     * Returns a new {@link spng_alloc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_alloc.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_alloc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_alloc.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_alloc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_alloc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_alloc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_alloc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_alloc.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_alloc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_alloc malloc(MemoryStack stack) {
        return new spng_alloc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_alloc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_alloc calloc(MemoryStack stack) {
        return new spng_alloc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_alloc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_alloc.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_alloc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_alloc.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #malloc_fn(int) malloc_fn}. */
    public static PointerBuffer nmalloc_fn(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + spng_alloc.MALLOC_FN), capacity); }
    /** Unsafe version of {@link #realloc_fn(int) realloc_fn}. */
    public static PointerBuffer nrealloc_fn(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + spng_alloc.REALLOC_FN), capacity); }
    /** Unsafe version of {@link #calloc_fn(int) calloc_fn}. */
    public static PointerBuffer ncalloc_fn(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + spng_alloc.CALLOC_FN), capacity); }
    /** Unsafe version of {@link #free_fn(int) free_fn}. */
    public static PointerBuffer nfree_fn(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + spng_alloc.FREE_FN), capacity); }

    /** Unsafe version of {@link #malloc_fn(PointerBuffer) malloc_fn}. */
    public static void nmalloc_fn(long struct, PointerBuffer value) { memPutAddress(struct + spng_alloc.MALLOC_FN, memAddress(value)); }
    /** Unsafe version of {@link #realloc_fn(PointerBuffer) realloc_fn}. */
    public static void nrealloc_fn(long struct, PointerBuffer value) { memPutAddress(struct + spng_alloc.REALLOC_FN, memAddress(value)); }
    /** Unsafe version of {@link #calloc_fn(PointerBuffer) calloc_fn}. */
    public static void ncalloc_fn(long struct, PointerBuffer value) { memPutAddress(struct + spng_alloc.CALLOC_FN, memAddress(value)); }
    /** Unsafe version of {@link #free_fn(PointerBuffer) free_fn}. */
    public static void nfree_fn(long struct, PointerBuffer value) { memPutAddress(struct + spng_alloc.FREE_FN, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + spng_alloc.MALLOC_FN));
        check(memGetAddress(struct + spng_alloc.REALLOC_FN));
        check(memGetAddress(struct + spng_alloc.CALLOC_FN));
        check(memGetAddress(struct + spng_alloc.FREE_FN));
    }

    // -----------------------------------

    /** An array of {@link spng_alloc} structs. */
    public static class Buffer extends StructBuffer<spng_alloc, Buffer> implements NativeResource {

        private static final spng_alloc ELEMENT_FACTORY = spng_alloc.create(-1L);

        /**
         * Creates a new {@code spng_alloc.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_alloc#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_alloc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code malloc_fn} field. */
        @NativeType("spng_malloc_fn *")
        public PointerBuffer malloc_fn(int capacity) { return spng_alloc.nmalloc_fn(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code realloc_fn} field. */
        @NativeType("spng_realloc_fn *")
        public PointerBuffer realloc_fn(int capacity) { return spng_alloc.nrealloc_fn(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code calloc_fn} field. */
        @NativeType("spng_calloc_fn *")
        public PointerBuffer calloc_fn(int capacity) { return spng_alloc.ncalloc_fn(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code free_fn} field. */
        @NativeType("spng_free_fn *")
        public PointerBuffer free_fn(int capacity) { return spng_alloc.nfree_fn(address(), capacity); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@code malloc_fn} field. */
        public spng_alloc.Buffer malloc_fn(@NativeType("spng_malloc_fn *") PointerBuffer value) { spng_alloc.nmalloc_fn(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code realloc_fn} field. */
        public spng_alloc.Buffer realloc_fn(@NativeType("spng_realloc_fn *") PointerBuffer value) { spng_alloc.nrealloc_fn(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code calloc_fn} field. */
        public spng_alloc.Buffer calloc_fn(@NativeType("spng_calloc_fn *") PointerBuffer value) { spng_alloc.ncalloc_fn(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code free_fn} field. */
        public spng_alloc.Buffer free_fn(@NativeType("spng_free_fn *") PointerBuffer value) { spng_alloc.nfree_fn(address(), value); return this; }

    }

}