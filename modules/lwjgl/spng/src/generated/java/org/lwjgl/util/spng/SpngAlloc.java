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
 * <pre>{@code
 * struct spng_alloc {
 *     {@link SpngMallocFnI spng_malloc_fn} * malloc_fn;
 *     {@link SpngReallocFnI spng_realloc_fn} * realloc_fn;
 *     {@link SpngCallocFnI spng_calloc_fn} * calloc_fn;
 *     {@link SpngFreeFnI spng_free_fn} * free_fn;
 * }}</pre>
 */
@NativeType("struct spng_alloc")
public class SpngAlloc extends Struct<SpngAlloc> implements NativeResource {

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

    protected SpngAlloc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngAlloc create(long address, @Nullable ByteBuffer container) {
        return new SpngAlloc(address, container);
    }

    /**
     * Creates a {@code SpngAlloc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngAlloc(ByteBuffer container) {
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
    public SpngAlloc malloc_fn(@NativeType("spng_malloc_fn *") PointerBuffer value) { nmalloc_fn(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code realloc_fn} field. */
    public SpngAlloc realloc_fn(@NativeType("spng_realloc_fn *") PointerBuffer value) { nrealloc_fn(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code calloc_fn} field. */
    public SpngAlloc calloc_fn(@NativeType("spng_calloc_fn *") PointerBuffer value) { ncalloc_fn(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code free_fn} field. */
    public SpngAlloc free_fn(@NativeType("spng_free_fn *") PointerBuffer value) { nfree_fn(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngAlloc set(
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
    public SpngAlloc set(SpngAlloc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngAlloc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngAlloc malloc() {
        return new SpngAlloc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngAlloc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngAlloc calloc() {
        return new SpngAlloc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngAlloc} instance allocated with {@link BufferUtils}. */
    public static SpngAlloc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngAlloc(memAddress(container), container);
    }

    /** Returns a new {@code SpngAlloc} instance for the specified memory address. */
    public static SpngAlloc create(long address) {
        return new SpngAlloc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngAlloc createSafe(long address) {
        return address == NULL ? null : new SpngAlloc(address, null);
    }

    /**
     * Returns a new {@link SpngAlloc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngAlloc.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngAlloc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngAlloc.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngAlloc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngAlloc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngAlloc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngAlloc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngAlloc.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngAlloc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngAlloc malloc(MemoryStack stack) {
        return new SpngAlloc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngAlloc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngAlloc calloc(MemoryStack stack) {
        return new SpngAlloc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngAlloc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngAlloc.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngAlloc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngAlloc.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #malloc_fn(int) malloc_fn}. */
    public static PointerBuffer nmalloc_fn(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + SpngAlloc.MALLOC_FN), capacity); }
    /** Unsafe version of {@link #realloc_fn(int) realloc_fn}. */
    public static PointerBuffer nrealloc_fn(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + SpngAlloc.REALLOC_FN), capacity); }
    /** Unsafe version of {@link #calloc_fn(int) calloc_fn}. */
    public static PointerBuffer ncalloc_fn(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + SpngAlloc.CALLOC_FN), capacity); }
    /** Unsafe version of {@link #free_fn(int) free_fn}. */
    public static PointerBuffer nfree_fn(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + SpngAlloc.FREE_FN), capacity); }

    /** Unsafe version of {@link #malloc_fn(PointerBuffer) malloc_fn}. */
    public static void nmalloc_fn(long struct, PointerBuffer value) { memPutAddress(struct + SpngAlloc.MALLOC_FN, memAddress(value)); }
    /** Unsafe version of {@link #realloc_fn(PointerBuffer) realloc_fn}. */
    public static void nrealloc_fn(long struct, PointerBuffer value) { memPutAddress(struct + SpngAlloc.REALLOC_FN, memAddress(value)); }
    /** Unsafe version of {@link #calloc_fn(PointerBuffer) calloc_fn}. */
    public static void ncalloc_fn(long struct, PointerBuffer value) { memPutAddress(struct + SpngAlloc.CALLOC_FN, memAddress(value)); }
    /** Unsafe version of {@link #free_fn(PointerBuffer) free_fn}. */
    public static void nfree_fn(long struct, PointerBuffer value) { memPutAddress(struct + SpngAlloc.FREE_FN, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SpngAlloc.MALLOC_FN));
        check(memGetAddress(struct + SpngAlloc.REALLOC_FN));
        check(memGetAddress(struct + SpngAlloc.CALLOC_FN));
        check(memGetAddress(struct + SpngAlloc.FREE_FN));
    }

    // -----------------------------------

    /** An array of {@link SpngAlloc} structs. */
    public static class Buffer extends StructBuffer<SpngAlloc, Buffer> implements NativeResource {

        private static final SpngAlloc ELEMENT_FACTORY = SpngAlloc.create(-1L);

        /**
         * Creates a new {@code SpngAlloc.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngAlloc#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngAlloc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code malloc_fn} field. */
        @NativeType("spng_malloc_fn *")
        public PointerBuffer malloc_fn(int capacity) { return SpngAlloc.nmalloc_fn(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code realloc_fn} field. */
        @NativeType("spng_realloc_fn *")
        public PointerBuffer realloc_fn(int capacity) { return SpngAlloc.nrealloc_fn(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code calloc_fn} field. */
        @NativeType("spng_calloc_fn *")
        public PointerBuffer calloc_fn(int capacity) { return SpngAlloc.ncalloc_fn(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code free_fn} field. */
        @NativeType("spng_free_fn *")
        public PointerBuffer free_fn(int capacity) { return SpngAlloc.nfree_fn(address(), capacity); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@code malloc_fn} field. */
        public SpngAlloc.Buffer malloc_fn(@NativeType("spng_malloc_fn *") PointerBuffer value) { SpngAlloc.nmalloc_fn(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code realloc_fn} field. */
        public SpngAlloc.Buffer realloc_fn(@NativeType("spng_realloc_fn *") PointerBuffer value) { SpngAlloc.nrealloc_fn(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code calloc_fn} field. */
        public SpngAlloc.Buffer calloc_fn(@NativeType("spng_calloc_fn *") PointerBuffer value) { SpngAlloc.ncalloc_fn(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code free_fn} field. */
        public SpngAlloc.Buffer free_fn(@NativeType("spng_free_fn *") PointerBuffer value) { SpngAlloc.nfree_fn(address(), value); return this; }

    }

}