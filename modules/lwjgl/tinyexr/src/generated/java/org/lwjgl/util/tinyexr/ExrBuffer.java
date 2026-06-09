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
 * struct ExrBuffer {
 *     void * data;
 *     size_t size;
 *     size_t offset;
 * }}</pre>
 */
public class ExrBuffer extends Struct<ExrBuffer> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        SIZE,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
    }

    protected ExrBuffer(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrBuffer create(long address, @Nullable ByteBuffer container) {
        return new ExrBuffer(address, container);
    }

    /**
     * Creates a {@code ExrBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
    @NativeType("void *")
    public ByteBuffer data() { return ndata(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("size_t")
    public long offset() { return noffset(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public ExrBuffer data(@NativeType("void *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public ExrBuffer offset(@NativeType("size_t") long value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrBuffer set(
        ByteBuffer data,
        long offset
    ) {
        data(data);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrBuffer set(ExrBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrBuffer malloc() {
        return new ExrBuffer(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrBuffer calloc() {
        return new ExrBuffer(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrBuffer} instance allocated with {@link BufferUtils}. */
    public static ExrBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrBuffer(memAddress(container), container);
    }

    /** Returns a new {@code ExrBuffer} instance for the specified memory address. */
    public static ExrBuffer create(long address) {
        return new ExrBuffer(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrBuffer createSafe(long address) {
        return address == NULL ? null : new ExrBuffer(address, null);
    }

    /**
     * Returns a new {@link ExrBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrBuffer.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrBuffer.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrBuffer.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrBuffer.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrBuffer malloc(MemoryStack stack) {
        return new ExrBuffer(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrBuffer calloc(MemoryStack stack) {
        return new ExrBuffer(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + ExrBuffer.DATA), (int)nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + ExrBuffer.SIZE); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetAddress(struct + ExrBuffer.OFFSET); }

    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + ExrBuffer.DATA, memAddress(value)); nsize(struct, value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + ExrBuffer.SIZE, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutAddress(struct + ExrBuffer.OFFSET, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrBuffer.DATA));
    }

    // -----------------------------------

    /** An array of {@link ExrBuffer} structs. */
    public static class Buffer extends StructBuffer<ExrBuffer, Buffer> implements NativeResource {

        private static final ExrBuffer ELEMENT_FACTORY = ExrBuffer.create(-1L);

        /**
         * Creates a new {@code ExrBuffer.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrBuffer#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
        @NativeType("void *")
        public ByteBuffer data() { return ExrBuffer.ndata(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return ExrBuffer.nsize(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("size_t")
        public long offset() { return ExrBuffer.noffset(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public ExrBuffer.Buffer data(@NativeType("void *") ByteBuffer value) { ExrBuffer.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public ExrBuffer.Buffer offset(@NativeType("size_t") long value) { ExrBuffer.noffset(address(), value); return this; }

    }

}