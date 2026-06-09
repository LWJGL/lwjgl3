/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ExrAllocator {
 *     void * userdata;
 *     void * (* alloc) (void * userdata, size_t size, size_t alignment);
 *     void * (* realloc) (void * userdata, void * ptr, size_t old_size, size_t new_size, size_t alignment);
 *     void (* free) (void * userdata, void * ptr, size_t size);
 * }}</pre>
 */
public class ExrAllocator extends Struct<ExrAllocator> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USERDATA,
        ALLOC,
        REALLOC,
        FREE;

    static {
        java.util.Objects.requireNonNull(ExrAllocI.DESCRIPTOR);
        java.util.Objects.requireNonNull(ExrReallocI.DESCRIPTOR);
        java.util.Objects.requireNonNull(ExrFreeI.DESCRIPTOR);

        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USERDATA = layout.offsetof(0);
        ALLOC = layout.offsetof(1);
        REALLOC = layout.offsetof(2);
        FREE = layout.offsetof(3);
    }

    protected ExrAllocator(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrAllocator create(long address, @Nullable ByteBuffer container) {
        return new ExrAllocator(address, container);
    }

    /**
     * Creates a {@code ExrAllocator} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrAllocator(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code userdata} field. */
    @NativeType("void *")
    public long userdata() { return nuserdata(address()); }
    /** @return the value of the {@code alloc} field. */
    @NativeType("void * (*) (void *, size_t, size_t)")
    public ExrAlloc alloc() { return nalloc(address()); }
    /** @return the value of the {@code realloc} field. */
    @NativeType("void * (*) (void *, void *, size_t, size_t, size_t)")
    public ExrRealloc realloc() { return nrealloc(address()); }
    /** @return the value of the {@code free} field. */
    @NativeType("void (*) (void *, void *, size_t)")
    public ExrFree free$() { return nfree$(address()); }

    /** Sets the specified value to the {@code userdata} field. */
    public ExrAllocator userdata(@NativeType("void *") long value) { nuserdata(address(), value); return this; }
    /** Sets the specified value to the {@code alloc} field. */
    public ExrAllocator alloc(@NativeType("void * (*) (void *, size_t, size_t)") ExrAllocI value) { nalloc(address(), value); return this; }
    /** Sets the specified value to the {@code realloc} field. */
    public ExrAllocator realloc(@NativeType("void * (*) (void *, void *, size_t, size_t, size_t)") ExrReallocI value) { nrealloc(address(), value); return this; }
    /** Sets the specified value to the {@code free} field. */
    public ExrAllocator free$(@NativeType("void (*) (void *, void *, size_t)") ExrFreeI value) { nfree$(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrAllocator set(
        long userdata,
        ExrAllocI alloc,
        ExrReallocI realloc,
        ExrFreeI free$
    ) {
        userdata(userdata);
        alloc(alloc);
        realloc(realloc);
        free$(free$);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrAllocator set(ExrAllocator src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrAllocator} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrAllocator malloc() {
        return new ExrAllocator(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrAllocator} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrAllocator calloc() {
        return new ExrAllocator(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrAllocator} instance allocated with {@link BufferUtils}. */
    public static ExrAllocator create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrAllocator(memAddress(container), container);
    }

    /** Returns a new {@code ExrAllocator} instance for the specified memory address. */
    public static ExrAllocator create(long address) {
        return new ExrAllocator(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrAllocator createSafe(long address) {
        return address == NULL ? null : new ExrAllocator(address, null);
    }

    /**
     * Returns a new {@link ExrAllocator.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrAllocator.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrAllocator.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrAllocator.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrAllocator.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrAllocator.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrAllocator.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrAllocator.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrAllocator.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrAllocator} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrAllocator malloc(MemoryStack stack) {
        return new ExrAllocator(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrAllocator} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrAllocator calloc(MemoryStack stack) {
        return new ExrAllocator(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrAllocator.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrAllocator.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrAllocator.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrAllocator.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #userdata}. */
    public static long nuserdata(long struct) { return memGetAddress(struct + ExrAllocator.USERDATA); }
    /** Unsafe version of {@link #alloc}. */
    public static ExrAlloc nalloc(long struct) { return ExrAlloc.create(memGetAddress(struct + ExrAllocator.ALLOC)); }
    /** Unsafe version of {@link #realloc}. */
    public static ExrRealloc nrealloc(long struct) { return ExrRealloc.create(memGetAddress(struct + ExrAllocator.REALLOC)); }
    /** Unsafe version of {@link #free$}. */
    public static ExrFree nfree$(long struct) { return ExrFree.create(memGetAddress(struct + ExrAllocator.FREE)); }

    /** Unsafe version of {@link #userdata(long) userdata}. */
    public static void nuserdata(long struct, long value) { memPutAddress(struct + ExrAllocator.USERDATA, value); }
    /** Unsafe version of {@link #alloc(ExrAllocI) alloc}. */
    public static void nalloc(long struct, ExrAllocI value) { memPutAddress(struct + ExrAllocator.ALLOC, value.address()); }
    /** Unsafe version of {@link #realloc(ExrReallocI) realloc}. */
    public static void nrealloc(long struct, ExrReallocI value) { memPutAddress(struct + ExrAllocator.REALLOC, value.address()); }
    /** Unsafe version of {@link #free$(ExrFreeI) free$}. */
    public static void nfree$(long struct, ExrFreeI value) { memPutAddress(struct + ExrAllocator.FREE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrAllocator.ALLOC));
        check(memGetAddress(struct + ExrAllocator.REALLOC));
        check(memGetAddress(struct + ExrAllocator.FREE));
    }

    // -----------------------------------

    /** An array of {@link ExrAllocator} structs. */
    public static class Buffer extends StructBuffer<ExrAllocator, Buffer> implements NativeResource {

        private static final ExrAllocator ELEMENT_FACTORY = ExrAllocator.create(-1L);

        /**
         * Creates a new {@code ExrAllocator.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrAllocator#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrAllocator getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code userdata} field. */
        @NativeType("void *")
        public long userdata() { return ExrAllocator.nuserdata(address()); }
        /** @return the value of the {@code alloc} field. */
        @NativeType("void * (*) (void *, size_t, size_t)")
        public ExrAlloc alloc() { return ExrAllocator.nalloc(address()); }
        /** @return the value of the {@code realloc} field. */
        @NativeType("void * (*) (void *, void *, size_t, size_t, size_t)")
        public ExrRealloc realloc() { return ExrAllocator.nrealloc(address()); }
        /** @return the value of the {@code free} field. */
        @NativeType("void (*) (void *, void *, size_t)")
        public ExrFree free$() { return ExrAllocator.nfree$(address()); }

        /** Sets the specified value to the {@code userdata} field. */
        public ExrAllocator.Buffer userdata(@NativeType("void *") long value) { ExrAllocator.nuserdata(address(), value); return this; }
        /** Sets the specified value to the {@code alloc} field. */
        public ExrAllocator.Buffer alloc(@NativeType("void * (*) (void *, size_t, size_t)") ExrAllocI value) { ExrAllocator.nalloc(address(), value); return this; }
        /** Sets the specified value to the {@code realloc} field. */
        public ExrAllocator.Buffer realloc(@NativeType("void * (*) (void *, void *, size_t, size_t, size_t)") ExrReallocI value) { ExrAllocator.nrealloc(address(), value); return this; }
        /** Sets the specified value to the {@code free} field. */
        public ExrAllocator.Buffer free$(@NativeType("void (*) (void *, void *, size_t)") ExrFreeI value) { ExrAllocator.nfree$(address(), value); return this; }

    }

}