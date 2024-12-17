/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct io_uring_clock_register {
 *     __u32 clockid;
 *     __u32 __resv[3];
 * }}</pre>
 */
@NativeType("struct io_uring_clock_register")
public class IOURingClockRegister extends Struct<IOURingClockRegister> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CLOCKID,
        __RESV;

    static {
        Layout layout = __struct(
            __member(4),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CLOCKID = layout.offsetof(0);
        __RESV = layout.offsetof(1);
    }

    protected IOURingClockRegister(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingClockRegister create(long address, @Nullable ByteBuffer container) {
        return new IOURingClockRegister(address, container);
    }

    /**
     * Creates a {@code IOURingClockRegister} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingClockRegister(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code clockid} field. */
    @NativeType("__u32")
    public int clockid() { return nclockid(address()); }

    /** Sets the specified value to the {@code clockid} field. */
    public IOURingClockRegister clockid(@NativeType("__u32") int value) { nclockid(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingClockRegister set(IOURingClockRegister src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingClockRegister} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingClockRegister malloc() {
        return new IOURingClockRegister(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingClockRegister} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingClockRegister calloc() {
        return new IOURingClockRegister(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingClockRegister} instance allocated with {@link BufferUtils}. */
    public static IOURingClockRegister create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingClockRegister(memAddress(container), container);
    }

    /** Returns a new {@code IOURingClockRegister} instance for the specified memory address. */
    public static IOURingClockRegister create(long address) {
        return new IOURingClockRegister(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingClockRegister createSafe(long address) {
        return address == NULL ? null : new IOURingClockRegister(address, null);
    }

    /**
     * Returns a new {@link IOURingClockRegister.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingClockRegister.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingClockRegister.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingClockRegister.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingClockRegister.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingClockRegister.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingClockRegister.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingClockRegister.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingClockRegister.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingClockRegister} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingClockRegister malloc(MemoryStack stack) {
        return new IOURingClockRegister(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingClockRegister} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingClockRegister calloc(MemoryStack stack) {
        return new IOURingClockRegister(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingClockRegister.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingClockRegister.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingClockRegister.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingClockRegister.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #clockid}. */
    public static int nclockid(long struct) { return memGetInt(struct + IOURingClockRegister.CLOCKID); }
    public static IntBuffer n__resv(long struct) { return memIntBuffer(struct + IOURingClockRegister.__RESV, 3); }
    public static int n__resv(long struct, int index) {
        return memGetInt(struct + IOURingClockRegister.__RESV + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #clockid(int) clockid}. */
    public static void nclockid(long struct, int value) { memPutInt(struct + IOURingClockRegister.CLOCKID, value); }
    public static void n__resv(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingClockRegister.__RESV, value.remaining() * 4);
    }
    public static void n__resv(long struct, int index, int value) {
        memPutInt(struct + IOURingClockRegister.__RESV + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingClockRegister} structs. */
    public static class Buffer extends StructBuffer<IOURingClockRegister, Buffer> implements NativeResource {

        private static final IOURingClockRegister ELEMENT_FACTORY = IOURingClockRegister.create(-1L);

        /**
         * Creates a new {@code IOURingClockRegister.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingClockRegister#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingClockRegister getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code clockid} field. */
        @NativeType("__u32")
        public int clockid() { return IOURingClockRegister.nclockid(address()); }

        /** Sets the specified value to the {@code clockid} field. */
        public IOURingClockRegister.Buffer clockid(@NativeType("__u32") int value) { IOURingClockRegister.nclockid(address(), value); return this; }

    }

}