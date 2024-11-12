/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

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
 * struct CUDA_EVENT_WAIT_NODE_PARAMS {
 *     CUevent event;
 * }</code></pre>
 */
public class CUDA_EVENT_WAIT_NODE_PARAMS extends Struct<CUDA_EVENT_WAIT_NODE_PARAMS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EVENT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EVENT = layout.offsetof(0);
    }

    protected CUDA_EVENT_WAIT_NODE_PARAMS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_EVENT_WAIT_NODE_PARAMS create(long address, @Nullable ByteBuffer container) {
        return new CUDA_EVENT_WAIT_NODE_PARAMS(address, container);
    }

    /**
     * Creates a {@code CUDA_EVENT_WAIT_NODE_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_EVENT_WAIT_NODE_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code event} field. */
    @NativeType("CUevent")
    public long event() { return nevent(address()); }

    /** Sets the specified value to the {@code event} field. */
    public CUDA_EVENT_WAIT_NODE_PARAMS event(@NativeType("CUevent") long value) { nevent(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_EVENT_WAIT_NODE_PARAMS set(CUDA_EVENT_WAIT_NODE_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_EVENT_WAIT_NODE_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_EVENT_WAIT_NODE_PARAMS malloc() {
        return new CUDA_EVENT_WAIT_NODE_PARAMS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_EVENT_WAIT_NODE_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_EVENT_WAIT_NODE_PARAMS calloc() {
        return new CUDA_EVENT_WAIT_NODE_PARAMS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_EVENT_WAIT_NODE_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_EVENT_WAIT_NODE_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_EVENT_WAIT_NODE_PARAMS(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_EVENT_WAIT_NODE_PARAMS} instance for the specified memory address. */
    public static CUDA_EVENT_WAIT_NODE_PARAMS create(long address) {
        return new CUDA_EVENT_WAIT_NODE_PARAMS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_EVENT_WAIT_NODE_PARAMS createSafe(long address) {
        return address == NULL ? null : new CUDA_EVENT_WAIT_NODE_PARAMS(address, null);
    }

    /**
     * Returns a new {@link CUDA_EVENT_WAIT_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EVENT_WAIT_NODE_PARAMS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_EVENT_WAIT_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EVENT_WAIT_NODE_PARAMS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EVENT_WAIT_NODE_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EVENT_WAIT_NODE_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_EVENT_WAIT_NODE_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_EVENT_WAIT_NODE_PARAMS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_EVENT_WAIT_NODE_PARAMS.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_EVENT_WAIT_NODE_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EVENT_WAIT_NODE_PARAMS malloc(MemoryStack stack) {
        return new CUDA_EVENT_WAIT_NODE_PARAMS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_EVENT_WAIT_NODE_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EVENT_WAIT_NODE_PARAMS calloc(MemoryStack stack) {
        return new CUDA_EVENT_WAIT_NODE_PARAMS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_EVENT_WAIT_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EVENT_WAIT_NODE_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EVENT_WAIT_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EVENT_WAIT_NODE_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #event}. */
    public static long nevent(long struct) { return memGetAddress(struct + CUDA_EVENT_WAIT_NODE_PARAMS.EVENT); }

    /** Unsafe version of {@link #event(long) event}. */
    public static void nevent(long struct, long value) { memPutAddress(struct + CUDA_EVENT_WAIT_NODE_PARAMS.EVENT, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_EVENT_WAIT_NODE_PARAMS.EVENT));
    }

    // -----------------------------------

    /** An array of {@link CUDA_EVENT_WAIT_NODE_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_EVENT_WAIT_NODE_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_EVENT_WAIT_NODE_PARAMS ELEMENT_FACTORY = CUDA_EVENT_WAIT_NODE_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_EVENT_WAIT_NODE_PARAMS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_EVENT_WAIT_NODE_PARAMS#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_EVENT_WAIT_NODE_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code event} field. */
        @NativeType("CUevent")
        public long event() { return CUDA_EVENT_WAIT_NODE_PARAMS.nevent(address()); }

        /** Sets the specified value to the {@code event} field. */
        public CUDA_EVENT_WAIT_NODE_PARAMS.Buffer event(@NativeType("CUevent") long value) { CUDA_EVENT_WAIT_NODE_PARAMS.nevent(address(), value); return this; }

    }

}