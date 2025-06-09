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
 * struct io_uring_zcrx_area_reg {
 *     __u64 addr;
 *     __u64 len;
 *     __u64 rq_area_token;
 *     __u32 flags;
 *     __u32 dmabuf_fd;
 *     __u64 __resv2[2];
 * }}</pre>
 */
@NativeType("struct io_uring_zcrx_area_reg")
public class IOURingZCRXAreaReg extends Struct<IOURingZCRXAreaReg> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ADDR,
        LEN,
        RQ_AREA_TOKEN,
        FLAGS,
        DMABUF_FD,
        __RESV2;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __array(8, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADDR = layout.offsetof(0);
        LEN = layout.offsetof(1);
        RQ_AREA_TOKEN = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        DMABUF_FD = layout.offsetof(4);
        __RESV2 = layout.offsetof(5);
    }

    protected IOURingZCRXAreaReg(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingZCRXAreaReg create(long address, @Nullable ByteBuffer container) {
        return new IOURingZCRXAreaReg(address, container);
    }

    /**
     * Creates a {@code IOURingZCRXAreaReg} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingZCRXAreaReg(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code addr} field. */
    @NativeType("__u64")
    public long addr() { return naddr(address()); }
    /** @return the value of the {@code len} field. */
    @NativeType("__u64")
    public long len() { return nlen(address()); }
    /** @return the value of the {@code rq_area_token} field. */
    @NativeType("__u64")
    public long rq_area_token() { return nrq_area_token(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code dmabuf_fd} field. */
    @NativeType("__u32")
    public int dmabuf_fd() { return ndmabuf_fd(address()); }

    /** Sets the specified value to the {@code addr} field. */
    public IOURingZCRXAreaReg addr(@NativeType("__u64") long value) { naddr(address(), value); return this; }
    /** Sets the specified value to the {@code len} field. */
    public IOURingZCRXAreaReg len(@NativeType("__u64") long value) { nlen(address(), value); return this; }
    /** Sets the specified value to the {@code rq_area_token} field. */
    public IOURingZCRXAreaReg rq_area_token(@NativeType("__u64") long value) { nrq_area_token(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingZCRXAreaReg flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code dmabuf_fd} field. */
    public IOURingZCRXAreaReg dmabuf_fd(@NativeType("__u32") int value) { ndmabuf_fd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingZCRXAreaReg set(
        long addr,
        long len,
        long rq_area_token,
        int flags,
        int dmabuf_fd
    ) {
        addr(addr);
        len(len);
        rq_area_token(rq_area_token);
        flags(flags);
        dmabuf_fd(dmabuf_fd);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingZCRXAreaReg set(IOURingZCRXAreaReg src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingZCRXAreaReg} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingZCRXAreaReg malloc() {
        return new IOURingZCRXAreaReg(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXAreaReg} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingZCRXAreaReg calloc() {
        return new IOURingZCRXAreaReg(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXAreaReg} instance allocated with {@link BufferUtils}. */
    public static IOURingZCRXAreaReg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXAreaReg(memAddress(container), container);
    }

    /** Returns a new {@code IOURingZCRXAreaReg} instance for the specified memory address. */
    public static IOURingZCRXAreaReg create(long address) {
        return new IOURingZCRXAreaReg(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingZCRXAreaReg createSafe(long address) {
        return address == NULL ? null : new IOURingZCRXAreaReg(address, null);
    }

    /**
     * Returns a new {@link IOURingZCRXAreaReg.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXAreaReg.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXAreaReg.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXAreaReg.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXAreaReg.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXAreaReg.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingZCRXAreaReg.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXAreaReg.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingZCRXAreaReg.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingZCRXAreaReg} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXAreaReg malloc(MemoryStack stack) {
        return new IOURingZCRXAreaReg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingZCRXAreaReg} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXAreaReg calloc(MemoryStack stack) {
        return new IOURingZCRXAreaReg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingZCRXAreaReg.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXAreaReg.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXAreaReg.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXAreaReg.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #addr}. */
    public static long naddr(long struct) { return memGetLong(struct + IOURingZCRXAreaReg.ADDR); }
    /** Unsafe version of {@link #len}. */
    public static long nlen(long struct) { return memGetLong(struct + IOURingZCRXAreaReg.LEN); }
    /** Unsafe version of {@link #rq_area_token}. */
    public static long nrq_area_token(long struct) { return memGetLong(struct + IOURingZCRXAreaReg.RQ_AREA_TOKEN); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + IOURingZCRXAreaReg.FLAGS); }
    /** Unsafe version of {@link #dmabuf_fd}. */
    public static int ndmabuf_fd(long struct) { return memGetInt(struct + IOURingZCRXAreaReg.DMABUF_FD); }
    public static LongBuffer n__resv2(long struct) { return memLongBuffer(struct + IOURingZCRXAreaReg.__RESV2, 2); }
    public static long n__resv2(long struct, int index) {
        return memGetLong(struct + IOURingZCRXAreaReg.__RESV2 + check(index, 2) * 8);
    }

    /** Unsafe version of {@link #addr(long) addr}. */
    public static void naddr(long struct, long value) { memPutLong(struct + IOURingZCRXAreaReg.ADDR, value); }
    /** Unsafe version of {@link #len(long) len}. */
    public static void nlen(long struct, long value) { memPutLong(struct + IOURingZCRXAreaReg.LEN, value); }
    /** Unsafe version of {@link #rq_area_token(long) rq_area_token}. */
    public static void nrq_area_token(long struct, long value) { memPutLong(struct + IOURingZCRXAreaReg.RQ_AREA_TOKEN, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + IOURingZCRXAreaReg.FLAGS, value); }
    /** Unsafe version of {@link #dmabuf_fd(int) dmabuf_fd}. */
    public static void ndmabuf_fd(long struct, int value) { memPutInt(struct + IOURingZCRXAreaReg.DMABUF_FD, value); }
    public static void n__resv2(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + IOURingZCRXAreaReg.__RESV2, value.remaining() * 8);
    }
    public static void n__resv2(long struct, int index, long value) {
        memPutLong(struct + IOURingZCRXAreaReg.__RESV2 + check(index, 2) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingZCRXAreaReg} structs. */
    public static class Buffer extends StructBuffer<IOURingZCRXAreaReg, Buffer> implements NativeResource {

        private static final IOURingZCRXAreaReg ELEMENT_FACTORY = IOURingZCRXAreaReg.create(-1L);

        /**
         * Creates a new {@code IOURingZCRXAreaReg.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingZCRXAreaReg#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingZCRXAreaReg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code addr} field. */
        @NativeType("__u64")
        public long addr() { return IOURingZCRXAreaReg.naddr(address()); }
        /** @return the value of the {@code len} field. */
        @NativeType("__u64")
        public long len() { return IOURingZCRXAreaReg.nlen(address()); }
        /** @return the value of the {@code rq_area_token} field. */
        @NativeType("__u64")
        public long rq_area_token() { return IOURingZCRXAreaReg.nrq_area_token(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingZCRXAreaReg.nflags(address()); }
        /** @return the value of the {@code dmabuf_fd} field. */
        @NativeType("__u32")
        public int dmabuf_fd() { return IOURingZCRXAreaReg.ndmabuf_fd(address()); }

        /** Sets the specified value to the {@code addr} field. */
        public IOURingZCRXAreaReg.Buffer addr(@NativeType("__u64") long value) { IOURingZCRXAreaReg.naddr(address(), value); return this; }
        /** Sets the specified value to the {@code len} field. */
        public IOURingZCRXAreaReg.Buffer len(@NativeType("__u64") long value) { IOURingZCRXAreaReg.nlen(address(), value); return this; }
        /** Sets the specified value to the {@code rq_area_token} field. */
        public IOURingZCRXAreaReg.Buffer rq_area_token(@NativeType("__u64") long value) { IOURingZCRXAreaReg.nrq_area_token(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingZCRXAreaReg.Buffer flags(@NativeType("__u32") int value) { IOURingZCRXAreaReg.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code dmabuf_fd} field. */
        public IOURingZCRXAreaReg.Buffer dmabuf_fd(@NativeType("__u32") int value) { IOURingZCRXAreaReg.ndmabuf_fd(address(), value); return this; }

    }

}