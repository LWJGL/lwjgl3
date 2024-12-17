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
 * struct io_uring_napi {
 *     __u32 busy_poll_to;
 *     __u8 prefer_busy_poll;
 *     __u8 pad[3];
 *     __u64 resv;
 * }}</pre>
 */
@NativeType("struct io_uring_napi")
public class IOURingNAPI extends Struct<IOURingNAPI> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUSY_POLL_TO,
        PREFER_BUSY_POLL,
        PAD,
        RESV;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __array(1, 3),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUSY_POLL_TO = layout.offsetof(0);
        PREFER_BUSY_POLL = layout.offsetof(1);
        PAD = layout.offsetof(2);
        RESV = layout.offsetof(3);
    }

    protected IOURingNAPI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingNAPI create(long address, @Nullable ByteBuffer container) {
        return new IOURingNAPI(address, container);
    }

    /**
     * Creates a {@code IOURingNAPI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingNAPI(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code busy_poll_to} field. */
    @NativeType("__u32")
    public int busy_poll_to() { return nbusy_poll_to(address()); }
    /** @return the value of the {@code prefer_busy_poll} field. */
    @NativeType("__u8")
    public byte prefer_busy_poll() { return nprefer_busy_poll(address()); }

    /** Sets the specified value to the {@code busy_poll_to} field. */
    public IOURingNAPI busy_poll_to(@NativeType("__u32") int value) { nbusy_poll_to(address(), value); return this; }
    /** Sets the specified value to the {@code prefer_busy_poll} field. */
    public IOURingNAPI prefer_busy_poll(@NativeType("__u8") byte value) { nprefer_busy_poll(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingNAPI set(
        int busy_poll_to,
        byte prefer_busy_poll
    ) {
        busy_poll_to(busy_poll_to);
        prefer_busy_poll(prefer_busy_poll);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingNAPI set(IOURingNAPI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingNAPI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingNAPI malloc() {
        return new IOURingNAPI(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingNAPI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingNAPI calloc() {
        return new IOURingNAPI(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingNAPI} instance allocated with {@link BufferUtils}. */
    public static IOURingNAPI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingNAPI(memAddress(container), container);
    }

    /** Returns a new {@code IOURingNAPI} instance for the specified memory address. */
    public static IOURingNAPI create(long address) {
        return new IOURingNAPI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingNAPI createSafe(long address) {
        return address == NULL ? null : new IOURingNAPI(address, null);
    }

    /**
     * Returns a new {@link IOURingNAPI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingNAPI.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingNAPI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingNAPI.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingNAPI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingNAPI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingNAPI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingNAPI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingNAPI.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingNAPI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingNAPI malloc(MemoryStack stack) {
        return new IOURingNAPI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingNAPI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingNAPI calloc(MemoryStack stack) {
        return new IOURingNAPI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingNAPI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingNAPI.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingNAPI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingNAPI.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #busy_poll_to}. */
    public static int nbusy_poll_to(long struct) { return memGetInt(struct + IOURingNAPI.BUSY_POLL_TO); }
    /** Unsafe version of {@link #prefer_busy_poll}. */
    public static byte nprefer_busy_poll(long struct) { return memGetByte(struct + IOURingNAPI.PREFER_BUSY_POLL); }
    public static ByteBuffer npad(long struct) { return memByteBuffer(struct + IOURingNAPI.PAD, 3); }
    public static byte npad(long struct, int index) {
        return memGetByte(struct + IOURingNAPI.PAD + check(index, 3) * 1);
    }
    public static long nresv(long struct) { return memGetLong(struct + IOURingNAPI.RESV); }

    /** Unsafe version of {@link #busy_poll_to(int) busy_poll_to}. */
    public static void nbusy_poll_to(long struct, int value) { memPutInt(struct + IOURingNAPI.BUSY_POLL_TO, value); }
    /** Unsafe version of {@link #prefer_busy_poll(byte) prefer_busy_poll}. */
    public static void nprefer_busy_poll(long struct, byte value) { memPutByte(struct + IOURingNAPI.PREFER_BUSY_POLL, value); }
    public static void npad(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingNAPI.PAD, value.remaining() * 1);
    }
    public static void npad(long struct, int index, byte value) {
        memPutByte(struct + IOURingNAPI.PAD + check(index, 3) * 1, value);
    }
    public static void nresv(long struct, long value) { memPutLong(struct + IOURingNAPI.RESV, value); }

    // -----------------------------------

    /** An array of {@link IOURingNAPI} structs. */
    public static class Buffer extends StructBuffer<IOURingNAPI, Buffer> implements NativeResource {

        private static final IOURingNAPI ELEMENT_FACTORY = IOURingNAPI.create(-1L);

        /**
         * Creates a new {@code IOURingNAPI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingNAPI#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingNAPI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code busy_poll_to} field. */
        @NativeType("__u32")
        public int busy_poll_to() { return IOURingNAPI.nbusy_poll_to(address()); }
        /** @return the value of the {@code prefer_busy_poll} field. */
        @NativeType("__u8")
        public byte prefer_busy_poll() { return IOURingNAPI.nprefer_busy_poll(address()); }

        /** Sets the specified value to the {@code busy_poll_to} field. */
        public IOURingNAPI.Buffer busy_poll_to(@NativeType("__u32") int value) { IOURingNAPI.nbusy_poll_to(address(), value); return this; }
        /** Sets the specified value to the {@code prefer_busy_poll} field. */
        public IOURingNAPI.Buffer prefer_busy_poll(@NativeType("__u8") byte value) { IOURingNAPI.nprefer_busy_poll(address(), value); return this; }

    }

}