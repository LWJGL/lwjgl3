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
 * struct io_uring_zcrx_offsets {
 *     __u32 head;
 *     __u32 tail;
 *     __u32 rqes;
 *     __u32 __resv2;
 *     __u64 __resv[2];
 * }}</pre>
 */
@NativeType("struct io_uring_zcrx_offsets")
public class IOURingZCRXOffsets extends Struct<IOURingZCRXOffsets> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAD,
        TAIL,
        RQES,
        __RESV2,
        __RESV;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(8, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        TAIL = layout.offsetof(1);
        RQES = layout.offsetof(2);
        __RESV2 = layout.offsetof(3);
        __RESV = layout.offsetof(4);
    }

    protected IOURingZCRXOffsets(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingZCRXOffsets create(long address, @Nullable ByteBuffer container) {
        return new IOURingZCRXOffsets(address, container);
    }

    /**
     * Creates a {@code IOURingZCRXOffsets} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingZCRXOffsets(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code head} field. */
    @NativeType("__u32")
    public int head() { return nhead(address()); }
    /** @return the value of the {@code tail} field. */
    @NativeType("__u32")
    public int tail() { return ntail(address()); }
    /** @return the value of the {@code rqes} field. */
    @NativeType("__u32")
    public int rqes() { return nrqes(address()); }

    /** Sets the specified value to the {@code head} field. */
    public IOURingZCRXOffsets head(@NativeType("__u32") int value) { nhead(address(), value); return this; }
    /** Sets the specified value to the {@code tail} field. */
    public IOURingZCRXOffsets tail(@NativeType("__u32") int value) { ntail(address(), value); return this; }
    /** Sets the specified value to the {@code rqes} field. */
    public IOURingZCRXOffsets rqes(@NativeType("__u32") int value) { nrqes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingZCRXOffsets set(
        int head,
        int tail,
        int rqes
    ) {
        head(head);
        tail(tail);
        rqes(rqes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingZCRXOffsets set(IOURingZCRXOffsets src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingZCRXOffsets} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingZCRXOffsets malloc() {
        return new IOURingZCRXOffsets(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXOffsets} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingZCRXOffsets calloc() {
        return new IOURingZCRXOffsets(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXOffsets} instance allocated with {@link BufferUtils}. */
    public static IOURingZCRXOffsets create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXOffsets(memAddress(container), container);
    }

    /** Returns a new {@code IOURingZCRXOffsets} instance for the specified memory address. */
    public static IOURingZCRXOffsets create(long address) {
        return new IOURingZCRXOffsets(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingZCRXOffsets createSafe(long address) {
        return address == NULL ? null : new IOURingZCRXOffsets(address, null);
    }

    /**
     * Returns a new {@link IOURingZCRXOffsets.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXOffsets.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXOffsets.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXOffsets.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXOffsets.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXOffsets.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingZCRXOffsets.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXOffsets.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingZCRXOffsets.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingZCRXOffsets} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXOffsets malloc(MemoryStack stack) {
        return new IOURingZCRXOffsets(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingZCRXOffsets} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXOffsets calloc(MemoryStack stack) {
        return new IOURingZCRXOffsets(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingZCRXOffsets.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXOffsets.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXOffsets.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXOffsets.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #head}. */
    public static int nhead(long struct) { return memGetInt(struct + IOURingZCRXOffsets.HEAD); }
    /** Unsafe version of {@link #tail}. */
    public static int ntail(long struct) { return memGetInt(struct + IOURingZCRXOffsets.TAIL); }
    /** Unsafe version of {@link #rqes}. */
    public static int nrqes(long struct) { return memGetInt(struct + IOURingZCRXOffsets.RQES); }
    public static int n__resv2(long struct) { return memGetInt(struct + IOURingZCRXOffsets.__RESV2); }
    public static LongBuffer n__resv(long struct) { return memLongBuffer(struct + IOURingZCRXOffsets.__RESV, 2); }
    public static long n__resv(long struct, int index) {
        return memGetLong(struct + IOURingZCRXOffsets.__RESV + check(index, 2) * 8);
    }

    /** Unsafe version of {@link #head(int) head}. */
    public static void nhead(long struct, int value) { memPutInt(struct + IOURingZCRXOffsets.HEAD, value); }
    /** Unsafe version of {@link #tail(int) tail}. */
    public static void ntail(long struct, int value) { memPutInt(struct + IOURingZCRXOffsets.TAIL, value); }
    /** Unsafe version of {@link #rqes(int) rqes}. */
    public static void nrqes(long struct, int value) { memPutInt(struct + IOURingZCRXOffsets.RQES, value); }
    public static void n__resv2(long struct, int value) { memPutInt(struct + IOURingZCRXOffsets.__RESV2, value); }
    public static void n__resv(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + IOURingZCRXOffsets.__RESV, value.remaining() * 8);
    }
    public static void n__resv(long struct, int index, long value) {
        memPutLong(struct + IOURingZCRXOffsets.__RESV + check(index, 2) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingZCRXOffsets} structs. */
    public static class Buffer extends StructBuffer<IOURingZCRXOffsets, Buffer> implements NativeResource {

        private static final IOURingZCRXOffsets ELEMENT_FACTORY = IOURingZCRXOffsets.create(-1L);

        /**
         * Creates a new {@code IOURingZCRXOffsets.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingZCRXOffsets#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingZCRXOffsets getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code head} field. */
        @NativeType("__u32")
        public int head() { return IOURingZCRXOffsets.nhead(address()); }
        /** @return the value of the {@code tail} field. */
        @NativeType("__u32")
        public int tail() { return IOURingZCRXOffsets.ntail(address()); }
        /** @return the value of the {@code rqes} field. */
        @NativeType("__u32")
        public int rqes() { return IOURingZCRXOffsets.nrqes(address()); }

        /** Sets the specified value to the {@code head} field. */
        public IOURingZCRXOffsets.Buffer head(@NativeType("__u32") int value) { IOURingZCRXOffsets.nhead(address(), value); return this; }
        /** Sets the specified value to the {@code tail} field. */
        public IOURingZCRXOffsets.Buffer tail(@NativeType("__u32") int value) { IOURingZCRXOffsets.ntail(address(), value); return this; }
        /** Sets the specified value to the {@code rqes} field. */
        public IOURingZCRXOffsets.Buffer rqes(@NativeType("__u32") int value) { IOURingZCRXOffsets.nrqes(address(), value); return this; }

    }

}