/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct cl_mutable_dispatch_arg_khr {
 *     cl_uint arg_index;
 *     size_t arg_size;
 *     void const * arg_value;
 * }}</pre>
 */
@NativeType("struct cl_mutable_dispatch_arg_khr")
public class CLMutableDispatchArgKHR extends Struct<CLMutableDispatchArgKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ARG_INDEX,
        ARG_SIZE,
        ARG_VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ARG_INDEX = layout.offsetof(0);
        ARG_SIZE = layout.offsetof(1);
        ARG_VALUE = layout.offsetof(2);
    }

    protected CLMutableDispatchArgKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CLMutableDispatchArgKHR create(long address, @Nullable ByteBuffer container) {
        return new CLMutableDispatchArgKHR(address, container);
    }

    /**
     * Creates a {@code CLMutableDispatchArgKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLMutableDispatchArgKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code arg_index} field. */
    @NativeType("cl_uint")
    public int arg_index() { return narg_index(address()); }
    /** @return the value of the {@code arg_size} field. */
    @NativeType("size_t")
    public long arg_size() { return narg_size(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code arg_value} field. */
    @NativeType("void const *")
    public @Nullable ByteBuffer arg_value() { return narg_value(address()); }

    /** Sets the specified value to the {@code arg_index} field. */
    public CLMutableDispatchArgKHR arg_index(@NativeType("cl_uint") int value) { narg_index(address(), value); return this; }
    /** Sets the specified value to the {@code arg_size} field. */
    public CLMutableDispatchArgKHR arg_size(@NativeType("size_t") long value) { narg_size(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code arg_value} field. */
    public CLMutableDispatchArgKHR arg_value(@Nullable @NativeType("void const *") ByteBuffer value) { narg_value(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CLMutableDispatchArgKHR set(
        int arg_index,
        long arg_size,
        @Nullable ByteBuffer arg_value
    ) {
        arg_index(arg_index);
        arg_size(arg_size);
        arg_value(arg_value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLMutableDispatchArgKHR set(CLMutableDispatchArgKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CLMutableDispatchArgKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLMutableDispatchArgKHR malloc() {
        return new CLMutableDispatchArgKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CLMutableDispatchArgKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLMutableDispatchArgKHR calloc() {
        return new CLMutableDispatchArgKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CLMutableDispatchArgKHR} instance allocated with {@link BufferUtils}. */
    public static CLMutableDispatchArgKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CLMutableDispatchArgKHR(memAddress(container), container);
    }

    /** Returns a new {@code CLMutableDispatchArgKHR} instance for the specified memory address. */
    public static CLMutableDispatchArgKHR create(long address) {
        return new CLMutableDispatchArgKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CLMutableDispatchArgKHR createSafe(long address) {
        return address == NULL ? null : new CLMutableDispatchArgKHR(address, null);
    }

    /**
     * Returns a new {@link CLMutableDispatchArgKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchArgKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLMutableDispatchArgKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchArgKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLMutableDispatchArgKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchArgKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CLMutableDispatchArgKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchArgKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CLMutableDispatchArgKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CLMutableDispatchArgKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLMutableDispatchArgKHR malloc(MemoryStack stack) {
        return new CLMutableDispatchArgKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CLMutableDispatchArgKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLMutableDispatchArgKHR calloc(MemoryStack stack) {
        return new CLMutableDispatchArgKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CLMutableDispatchArgKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchArgKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLMutableDispatchArgKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchArgKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #arg_index}. */
    public static int narg_index(long struct) { return memGetInt(struct + CLMutableDispatchArgKHR.ARG_INDEX); }
    /** Unsafe version of {@link #arg_size}. */
    public static long narg_size(long struct) { return memGetAddress(struct + CLMutableDispatchArgKHR.ARG_SIZE); }
    /** Unsafe version of {@link #arg_value() arg_value}. */
    public static @Nullable ByteBuffer narg_value(long struct) { return memByteBufferSafe(memGetAddress(struct + CLMutableDispatchArgKHR.ARG_VALUE), (int)narg_size(struct)); }

    /** Unsafe version of {@link #arg_index(int) arg_index}. */
    public static void narg_index(long struct, int value) { memPutInt(struct + CLMutableDispatchArgKHR.ARG_INDEX, value); }
    /** Sets the specified value to the {@code arg_size} field of the specified {@code struct}. */
    public static void narg_size(long struct, long value) { memPutAddress(struct + CLMutableDispatchArgKHR.ARG_SIZE, value); }
    /** Unsafe version of {@link #arg_value(ByteBuffer) arg_value}. */
    public static void narg_value(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + CLMutableDispatchArgKHR.ARG_VALUE, memAddressSafe(value)); narg_size(struct, value == null ? 0 : value.remaining()); }

    // -----------------------------------

    /** An array of {@link CLMutableDispatchArgKHR} structs. */
    public static class Buffer extends StructBuffer<CLMutableDispatchArgKHR, Buffer> implements NativeResource {

        private static final CLMutableDispatchArgKHR ELEMENT_FACTORY = CLMutableDispatchArgKHR.create(-1L);

        /**
         * Creates a new {@code CLMutableDispatchArgKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLMutableDispatchArgKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected CLMutableDispatchArgKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code arg_index} field. */
        @NativeType("cl_uint")
        public int arg_index() { return CLMutableDispatchArgKHR.narg_index(address()); }
        /** @return the value of the {@code arg_size} field. */
        @NativeType("size_t")
        public long arg_size() { return CLMutableDispatchArgKHR.narg_size(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code arg_value} field. */
        @NativeType("void const *")
        public @Nullable ByteBuffer arg_value() { return CLMutableDispatchArgKHR.narg_value(address()); }

        /** Sets the specified value to the {@code arg_index} field. */
        public CLMutableDispatchArgKHR.Buffer arg_index(@NativeType("cl_uint") int value) { CLMutableDispatchArgKHR.narg_index(address(), value); return this; }
        /** Sets the specified value to the {@code arg_size} field. */
        public CLMutableDispatchArgKHR.Buffer arg_size(@NativeType("size_t") long value) { CLMutableDispatchArgKHR.narg_size(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code arg_value} field. */
        public CLMutableDispatchArgKHR.Buffer arg_value(@Nullable @NativeType("void const *") ByteBuffer value) { CLMutableDispatchArgKHR.narg_value(address(), value); return this; }

    }

}