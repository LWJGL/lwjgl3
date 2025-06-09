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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct io_uring_zcrx_rqe {
 *     __u64 off;
 *     __u32 len;
 *     __u32 __pad;
 * }}</pre>
 */
@NativeType("struct io_uring_zcrx_rqe")
public class IOURingZCRXRQE extends Struct<IOURingZCRXRQE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFF,
        LEN,
        __PAD;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFF = layout.offsetof(0);
        LEN = layout.offsetof(1);
        __PAD = layout.offsetof(2);
    }

    protected IOURingZCRXRQE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingZCRXRQE create(long address, @Nullable ByteBuffer container) {
        return new IOURingZCRXRQE(address, container);
    }

    /**
     * Creates a {@code IOURingZCRXRQE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingZCRXRQE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code off} field. */
    @NativeType("__u64")
    public long off() { return noff(address()); }
    /** @return the value of the {@code len} field. */
    @NativeType("__u32")
    public int len() { return nlen(address()); }

    /** Sets the specified value to the {@code off} field. */
    public IOURingZCRXRQE off(@NativeType("__u64") long value) { noff(address(), value); return this; }
    /** Sets the specified value to the {@code len} field. */
    public IOURingZCRXRQE len(@NativeType("__u32") int value) { nlen(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingZCRXRQE set(
        long off,
        int len
    ) {
        off(off);
        len(len);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingZCRXRQE set(IOURingZCRXRQE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingZCRXRQE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingZCRXRQE malloc() {
        return new IOURingZCRXRQE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXRQE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingZCRXRQE calloc() {
        return new IOURingZCRXRQE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXRQE} instance allocated with {@link BufferUtils}. */
    public static IOURingZCRXRQE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXRQE(memAddress(container), container);
    }

    /** Returns a new {@code IOURingZCRXRQE} instance for the specified memory address. */
    public static IOURingZCRXRQE create(long address) {
        return new IOURingZCRXRQE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingZCRXRQE createSafe(long address) {
        return address == NULL ? null : new IOURingZCRXRQE(address, null);
    }

    /**
     * Returns a new {@link IOURingZCRXRQE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXRQE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXRQE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingZCRXRQE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingZCRXRQE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingZCRXRQE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXRQE malloc(MemoryStack stack) {
        return new IOURingZCRXRQE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingZCRXRQE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXRQE calloc(MemoryStack stack) {
        return new IOURingZCRXRQE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingZCRXRQE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXRQE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #off}. */
    public static long noff(long struct) { return memGetLong(struct + IOURingZCRXRQE.OFF); }
    /** Unsafe version of {@link #len}. */
    public static int nlen(long struct) { return memGetInt(struct + IOURingZCRXRQE.LEN); }
    public static int n__pad(long struct) { return memGetInt(struct + IOURingZCRXRQE.__PAD); }

    /** Unsafe version of {@link #off(long) off}. */
    public static void noff(long struct, long value) { memPutLong(struct + IOURingZCRXRQE.OFF, value); }
    /** Unsafe version of {@link #len(int) len}. */
    public static void nlen(long struct, int value) { memPutInt(struct + IOURingZCRXRQE.LEN, value); }
    public static void n__pad(long struct, int value) { memPutInt(struct + IOURingZCRXRQE.__PAD, value); }

    // -----------------------------------

    /** An array of {@link IOURingZCRXRQE} structs. */
    public static class Buffer extends StructBuffer<IOURingZCRXRQE, Buffer> implements NativeResource {

        private static final IOURingZCRXRQE ELEMENT_FACTORY = IOURingZCRXRQE.create(-1L);

        /**
         * Creates a new {@code IOURingZCRXRQE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingZCRXRQE#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingZCRXRQE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code off} field. */
        @NativeType("__u64")
        public long off() { return IOURingZCRXRQE.noff(address()); }
        /** @return the value of the {@code len} field. */
        @NativeType("__u32")
        public int len() { return IOURingZCRXRQE.nlen(address()); }

        /** Sets the specified value to the {@code off} field. */
        public IOURingZCRXRQE.Buffer off(@NativeType("__u64") long value) { IOURingZCRXRQE.noff(address(), value); return this; }
        /** Sets the specified value to the {@code len} field. */
        public IOURingZCRXRQE.Buffer len(@NativeType("__u32") int value) { IOURingZCRXRQE.nlen(address(), value); return this; }

    }

}