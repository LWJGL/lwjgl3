/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct msdf_allocator {
 *     msdf_allocator_alloc_callback alloc_callback;
 *     msdf_allocator_realloc_callback realloc_callback;
 *     msdf_free_allocator_free_callback free_callback;
 * }</code></pre>
 */
@NativeType("struct msdf_allocator")
public class MSDFGenAllocator extends Struct<MSDFGenAllocator> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOC_CALLBACK,
        REALLOC_CALLBACK,
        FREE_CALLBACK;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOC_CALLBACK = layout.offsetof(0);
        REALLOC_CALLBACK = layout.offsetof(1);
        FREE_CALLBACK = layout.offsetof(2);
    }

    protected MSDFGenAllocator(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MSDFGenAllocator create(long address, @Nullable ByteBuffer container) {
        return new MSDFGenAllocator(address, container);
    }

    /**
     * Creates a {@code MSDFGenAllocator} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MSDFGenAllocator(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code alloc_callback} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("msdf_allocator_alloc_callback")
    public ByteBuffer alloc_callback(int capacity) { return nalloc_callback(address(), capacity); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code realloc_callback} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("msdf_allocator_realloc_callback")
    public ByteBuffer realloc_callback(int capacity) { return nrealloc_callback(address(), capacity); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code free_callback} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("msdf_free_allocator_free_callback")
    public ByteBuffer free_callback(int capacity) { return nfree_callback(address(), capacity); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code alloc_callback} field. */
    public MSDFGenAllocator alloc_callback(@NativeType("msdf_allocator_alloc_callback") ByteBuffer value) { nalloc_callback(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code realloc_callback} field. */
    public MSDFGenAllocator realloc_callback(@NativeType("msdf_allocator_realloc_callback") ByteBuffer value) { nrealloc_callback(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code free_callback} field. */
    public MSDFGenAllocator free_callback(@NativeType("msdf_free_allocator_free_callback") ByteBuffer value) { nfree_callback(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MSDFGenAllocator set(
        ByteBuffer alloc_callback,
        ByteBuffer realloc_callback,
        ByteBuffer free_callback
    ) {
        alloc_callback(alloc_callback);
        realloc_callback(realloc_callback);
        free_callback(free_callback);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MSDFGenAllocator set(MSDFGenAllocator src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MSDFGenAllocator} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MSDFGenAllocator malloc() {
        return new MSDFGenAllocator(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenAllocator} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MSDFGenAllocator calloc() {
        return new MSDFGenAllocator(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenAllocator} instance allocated with {@link BufferUtils}. */
    public static MSDFGenAllocator create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MSDFGenAllocator(memAddress(container), container);
    }

    /** Returns a new {@code MSDFGenAllocator} instance for the specified memory address. */
    public static MSDFGenAllocator create(long address) {
        return new MSDFGenAllocator(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MSDFGenAllocator createSafe(long address) {
        return address == NULL ? null : new MSDFGenAllocator(address, null);
    }

    /**
     * Returns a new {@link MSDFGenAllocator.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenAllocator.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MSDFGenAllocator.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenAllocator.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenAllocator.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenAllocator.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MSDFGenAllocator.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MSDFGenAllocator.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MSDFGenAllocator.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MSDFGenAllocator} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenAllocator malloc(MemoryStack stack) {
        return new MSDFGenAllocator(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MSDFGenAllocator} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenAllocator calloc(MemoryStack stack) {
        return new MSDFGenAllocator(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MSDFGenAllocator.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenAllocator.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenAllocator.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenAllocator.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #alloc_callback(int) alloc_callback}. */
    public static ByteBuffer nalloc_callback(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + MSDFGenAllocator.ALLOC_CALLBACK), capacity); }
    /** Unsafe version of {@link #realloc_callback(int) realloc_callback}. */
    public static ByteBuffer nrealloc_callback(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + MSDFGenAllocator.REALLOC_CALLBACK), capacity); }
    /** Unsafe version of {@link #free_callback(int) free_callback}. */
    public static ByteBuffer nfree_callback(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + MSDFGenAllocator.FREE_CALLBACK), capacity); }

    /** Unsafe version of {@link #alloc_callback(ByteBuffer) alloc_callback}. */
    public static void nalloc_callback(long struct, ByteBuffer value) { memPutAddress(struct + MSDFGenAllocator.ALLOC_CALLBACK, memAddress(value)); }
    /** Unsafe version of {@link #realloc_callback(ByteBuffer) realloc_callback}. */
    public static void nrealloc_callback(long struct, ByteBuffer value) { memPutAddress(struct + MSDFGenAllocator.REALLOC_CALLBACK, memAddress(value)); }
    /** Unsafe version of {@link #free_callback(ByteBuffer) free_callback}. */
    public static void nfree_callback(long struct, ByteBuffer value) { memPutAddress(struct + MSDFGenAllocator.FREE_CALLBACK, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + MSDFGenAllocator.ALLOC_CALLBACK));
        check(memGetAddress(struct + MSDFGenAllocator.REALLOC_CALLBACK));
        check(memGetAddress(struct + MSDFGenAllocator.FREE_CALLBACK));
    }

    // -----------------------------------

    /** An array of {@link MSDFGenAllocator} structs. */
    public static class Buffer extends StructBuffer<MSDFGenAllocator, Buffer> implements NativeResource {

        private static final MSDFGenAllocator ELEMENT_FACTORY = MSDFGenAllocator.create(-1L);

        /**
         * Creates a new {@code MSDFGenAllocator.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MSDFGenAllocator#SIZEOF}, and its mark will be undefined.</p>
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
        protected MSDFGenAllocator getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code alloc_callback} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("msdf_allocator_alloc_callback")
        public ByteBuffer alloc_callback(int capacity) { return MSDFGenAllocator.nalloc_callback(address(), capacity); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code realloc_callback} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("msdf_allocator_realloc_callback")
        public ByteBuffer realloc_callback(int capacity) { return MSDFGenAllocator.nrealloc_callback(address(), capacity); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code free_callback} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("msdf_free_allocator_free_callback")
        public ByteBuffer free_callback(int capacity) { return MSDFGenAllocator.nfree_callback(address(), capacity); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code alloc_callback} field. */
        public MSDFGenAllocator.Buffer alloc_callback(@NativeType("msdf_allocator_alloc_callback") ByteBuffer value) { MSDFGenAllocator.nalloc_callback(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code realloc_callback} field. */
        public MSDFGenAllocator.Buffer realloc_callback(@NativeType("msdf_allocator_realloc_callback") ByteBuffer value) { MSDFGenAllocator.nrealloc_callback(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code free_callback} field. */
        public MSDFGenAllocator.Buffer free_callback(@NativeType("msdf_free_allocator_free_callback") ByteBuffer value) { MSDFGenAllocator.nfree_callback(address(), value); return this; }

    }

}