/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_buf {
 *     __u64 addr;
 *     __u32 len;
 *     __u16 bid;
 *     __u16 resv;
 * }</code></pre>
 */
@NativeType("struct io_uring_buf")
public class IOURingBuf extends Struct<IOURingBuf> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ADDR,
        LEN,
        BID,
        RESV;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADDR = layout.offsetof(0);
        LEN = layout.offsetof(1);
        BID = layout.offsetof(2);
        RESV = layout.offsetof(3);
    }

    protected IOURingBuf(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingBuf create(long address, @Nullable ByteBuffer container) {
        return new IOURingBuf(address, container);
    }

    /**
     * Creates a {@code IOURingBuf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingBuf(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code addr} field. */
    @NativeType("__u64")
    public long addr() { return naddr(address()); }
    /** @return the value of the {@code len} field. */
    @NativeType("__u32")
    public int len() { return nlen(address()); }
    /** @return the value of the {@code bid} field. */
    @NativeType("__u16")
    public short bid() { return nbid(address()); }
    /** @return the value of the {@code resv} field. */
    @NativeType("__u16")
    public short resv() { return nresv(address()); }

    /** Sets the specified value to the {@code addr} field. */
    public IOURingBuf addr(@NativeType("__u64") long value) { naddr(address(), value); return this; }
    /** Sets the specified value to the {@code len} field. */
    public IOURingBuf len(@NativeType("__u32") int value) { nlen(address(), value); return this; }
    /** Sets the specified value to the {@code bid} field. */
    public IOURingBuf bid(@NativeType("__u16") short value) { nbid(address(), value); return this; }
    /** Sets the specified value to the {@code resv} field. */
    public IOURingBuf resv(@NativeType("__u16") short value) { nresv(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingBuf set(
        long addr,
        int len,
        short bid,
        short resv
    ) {
        addr(addr);
        len(len);
        bid(bid);
        resv(resv);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingBuf set(IOURingBuf src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingBuf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingBuf malloc() {
        return new IOURingBuf(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingBuf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingBuf calloc() {
        return new IOURingBuf(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingBuf} instance allocated with {@link BufferUtils}. */
    public static IOURingBuf create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingBuf(memAddress(container), container);
    }

    /** Returns a new {@code IOURingBuf} instance for the specified memory address. */
    public static IOURingBuf create(long address) {
        return new IOURingBuf(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingBuf createSafe(long address) {
        return address == NULL ? null : new IOURingBuf(address, null);
    }

    /**
     * Returns a new {@link IOURingBuf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBuf.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingBuf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBuf.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBuf.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBuf.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingBuf.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingBuf.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingBuf.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingBuf} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBuf malloc(MemoryStack stack) {
        return new IOURingBuf(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingBuf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBuf calloc(MemoryStack stack) {
        return new IOURingBuf(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingBuf.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBuf.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBuf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBuf.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #addr}. */
    public static long naddr(long struct) { return UNSAFE.getLong(null, struct + IOURingBuf.ADDR); }
    /** Unsafe version of {@link #len}. */
    public static int nlen(long struct) { return UNSAFE.getInt(null, struct + IOURingBuf.LEN); }
    /** Unsafe version of {@link #bid}. */
    public static short nbid(long struct) { return UNSAFE.getShort(null, struct + IOURingBuf.BID); }
    /** Unsafe version of {@link #resv}. */
    public static short nresv(long struct) { return UNSAFE.getShort(null, struct + IOURingBuf.RESV); }

    /** Unsafe version of {@link #addr(long) addr}. */
    public static void naddr(long struct, long value) { UNSAFE.putLong(null, struct + IOURingBuf.ADDR, value); }
    /** Unsafe version of {@link #len(int) len}. */
    public static void nlen(long struct, int value) { UNSAFE.putInt(null, struct + IOURingBuf.LEN, value); }
    /** Unsafe version of {@link #bid(short) bid}. */
    public static void nbid(long struct, short value) { UNSAFE.putShort(null, struct + IOURingBuf.BID, value); }
    /** Unsafe version of {@link #resv(short) resv}. */
    public static void nresv(long struct, short value) { UNSAFE.putShort(null, struct + IOURingBuf.RESV, value); }

    // -----------------------------------

    /** An array of {@link IOURingBuf} structs. */
    public static class Buffer extends StructBuffer<IOURingBuf, Buffer> implements NativeResource {

        private static final IOURingBuf ELEMENT_FACTORY = IOURingBuf.create(-1L);

        /**
         * Creates a new {@code IOURingBuf.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingBuf#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingBuf getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code addr} field. */
        @NativeType("__u64")
        public long addr() { return IOURingBuf.naddr(address()); }
        /** @return the value of the {@code len} field. */
        @NativeType("__u32")
        public int len() { return IOURingBuf.nlen(address()); }
        /** @return the value of the {@code bid} field. */
        @NativeType("__u16")
        public short bid() { return IOURingBuf.nbid(address()); }
        /** @return the value of the {@code resv} field. */
        @NativeType("__u16")
        public short resv() { return IOURingBuf.nresv(address()); }

        /** Sets the specified value to the {@code addr} field. */
        public IOURingBuf.Buffer addr(@NativeType("__u64") long value) { IOURingBuf.naddr(address(), value); return this; }
        /** Sets the specified value to the {@code len} field. */
        public IOURingBuf.Buffer len(@NativeType("__u32") int value) { IOURingBuf.nlen(address(), value); return this; }
        /** Sets the specified value to the {@code bid} field. */
        public IOURingBuf.Buffer bid(@NativeType("__u16") short value) { IOURingBuf.nbid(address(), value); return this; }
        /** Sets the specified value to the {@code resv} field. */
        public IOURingBuf.Buffer resv(@NativeType("__u16") short value) { IOURingBuf.nresv(address(), value); return this; }

    }

}