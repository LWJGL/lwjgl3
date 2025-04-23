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
 * struct cl_mutable_dispatch_exec_info_khr {
 *     cl_uint param_name;
 *     size_t param_value_size;
 *     void const * param_value;
 * }}</pre>
 */
@NativeType("struct cl_mutable_dispatch_exec_info_khr")
public class CLMutableDispatchExecInfoKHR extends Struct<CLMutableDispatchExecInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PARAM_NAME,
        PARAM_VALUE_SIZE,
        PARAM_VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PARAM_NAME = layout.offsetof(0);
        PARAM_VALUE_SIZE = layout.offsetof(1);
        PARAM_VALUE = layout.offsetof(2);
    }

    protected CLMutableDispatchExecInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CLMutableDispatchExecInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new CLMutableDispatchExecInfoKHR(address, container);
    }

    /**
     * Creates a {@code CLMutableDispatchExecInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLMutableDispatchExecInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code param_name} field. */
    @NativeType("cl_uint")
    public int param_name() { return nparam_name(address()); }
    /** @return the value of the {@code param_value_size} field. */
    @NativeType("size_t")
    public long param_value_size() { return nparam_value_size(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code param_value} field. */
    @NativeType("void const *")
    public @Nullable ByteBuffer param_value() { return nparam_value(address()); }

    /** Sets the specified value to the {@code param_name} field. */
    public CLMutableDispatchExecInfoKHR param_name(@NativeType("cl_uint") int value) { nparam_name(address(), value); return this; }
    /** Sets the specified value to the {@code param_value_size} field. */
    public CLMutableDispatchExecInfoKHR param_value_size(@NativeType("size_t") long value) { nparam_value_size(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code param_value} field. */
    public CLMutableDispatchExecInfoKHR param_value(@Nullable @NativeType("void const *") ByteBuffer value) { nparam_value(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CLMutableDispatchExecInfoKHR set(
        int param_name,
        long param_value_size,
        @Nullable ByteBuffer param_value
    ) {
        param_name(param_name);
        param_value_size(param_value_size);
        param_value(param_value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLMutableDispatchExecInfoKHR set(CLMutableDispatchExecInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CLMutableDispatchExecInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLMutableDispatchExecInfoKHR malloc() {
        return new CLMutableDispatchExecInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CLMutableDispatchExecInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLMutableDispatchExecInfoKHR calloc() {
        return new CLMutableDispatchExecInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CLMutableDispatchExecInfoKHR} instance allocated with {@link BufferUtils}. */
    public static CLMutableDispatchExecInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CLMutableDispatchExecInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code CLMutableDispatchExecInfoKHR} instance for the specified memory address. */
    public static CLMutableDispatchExecInfoKHR create(long address) {
        return new CLMutableDispatchExecInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CLMutableDispatchExecInfoKHR createSafe(long address) {
        return address == NULL ? null : new CLMutableDispatchExecInfoKHR(address, null);
    }

    /**
     * Returns a new {@link CLMutableDispatchExecInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchExecInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLMutableDispatchExecInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchExecInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLMutableDispatchExecInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchExecInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CLMutableDispatchExecInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchExecInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CLMutableDispatchExecInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CLMutableDispatchExecInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLMutableDispatchExecInfoKHR malloc(MemoryStack stack) {
        return new CLMutableDispatchExecInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CLMutableDispatchExecInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLMutableDispatchExecInfoKHR calloc(MemoryStack stack) {
        return new CLMutableDispatchExecInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CLMutableDispatchExecInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchExecInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLMutableDispatchExecInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLMutableDispatchExecInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #param_name}. */
    public static int nparam_name(long struct) { return memGetInt(struct + CLMutableDispatchExecInfoKHR.PARAM_NAME); }
    /** Unsafe version of {@link #param_value_size}. */
    public static long nparam_value_size(long struct) { return memGetAddress(struct + CLMutableDispatchExecInfoKHR.PARAM_VALUE_SIZE); }
    /** Unsafe version of {@link #param_value() param_value}. */
    public static @Nullable ByteBuffer nparam_value(long struct) { return memByteBufferSafe(memGetAddress(struct + CLMutableDispatchExecInfoKHR.PARAM_VALUE), (int)nparam_value_size(struct)); }

    /** Unsafe version of {@link #param_name(int) param_name}. */
    public static void nparam_name(long struct, int value) { memPutInt(struct + CLMutableDispatchExecInfoKHR.PARAM_NAME, value); }
    /** Sets the specified value to the {@code param_value_size} field of the specified {@code struct}. */
    public static void nparam_value_size(long struct, long value) { memPutAddress(struct + CLMutableDispatchExecInfoKHR.PARAM_VALUE_SIZE, value); }
    /** Unsafe version of {@link #param_value(ByteBuffer) param_value}. */
    public static void nparam_value(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + CLMutableDispatchExecInfoKHR.PARAM_VALUE, memAddressSafe(value)); nparam_value_size(struct, value == null ? 0 : value.remaining()); }

    // -----------------------------------

    /** An array of {@link CLMutableDispatchExecInfoKHR} structs. */
    public static class Buffer extends StructBuffer<CLMutableDispatchExecInfoKHR, Buffer> implements NativeResource {

        private static final CLMutableDispatchExecInfoKHR ELEMENT_FACTORY = CLMutableDispatchExecInfoKHR.create(-1L);

        /**
         * Creates a new {@code CLMutableDispatchExecInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLMutableDispatchExecInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected CLMutableDispatchExecInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code param_name} field. */
        @NativeType("cl_uint")
        public int param_name() { return CLMutableDispatchExecInfoKHR.nparam_name(address()); }
        /** @return the value of the {@code param_value_size} field. */
        @NativeType("size_t")
        public long param_value_size() { return CLMutableDispatchExecInfoKHR.nparam_value_size(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code param_value} field. */
        @NativeType("void const *")
        public @Nullable ByteBuffer param_value() { return CLMutableDispatchExecInfoKHR.nparam_value(address()); }

        /** Sets the specified value to the {@code param_name} field. */
        public CLMutableDispatchExecInfoKHR.Buffer param_name(@NativeType("cl_uint") int value) { CLMutableDispatchExecInfoKHR.nparam_name(address(), value); return this; }
        /** Sets the specified value to the {@code param_value_size} field. */
        public CLMutableDispatchExecInfoKHR.Buffer param_value_size(@NativeType("size_t") long value) { CLMutableDispatchExecInfoKHR.nparam_value_size(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code param_value} field. */
        public CLMutableDispatchExecInfoKHR.Buffer param_value(@Nullable @NativeType("void const *") ByteBuffer value) { CLMutableDispatchExecInfoKHR.nparam_value(address(), value); return this; }

    }

}