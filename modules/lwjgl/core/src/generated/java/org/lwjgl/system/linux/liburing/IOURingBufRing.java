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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_buf_ring {
 *     union {
 *         struct {
 *             __u64 resv1;
 *             __u32 resv2;
 *             __u16 resv3;
 *             __u16 tail;
 *         };
 *         {@link IOURingBuf struct io_uring_buf} bufs[0];
 *     };
 * }</code></pre>
 */
@NativeType("struct io_uring_buf_ring")
public class IOURingBufRing extends Struct<IOURingBufRing> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESV1,
        RESV2,
        RESV3,
        TAIL,
        BUFS;

    static {
        Layout layout = __struct(
            __union(
                __struct(
                    __member(8),
                    __member(4),
                    __member(2),
                    __member(2)
                ),
                __array(IOURingBuf.SIZEOF, IOURingBuf.ALIGNOF, 0)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESV1 = layout.offsetof(2);
        RESV2 = layout.offsetof(3);
        RESV3 = layout.offsetof(4);
        TAIL = layout.offsetof(5);
        BUFS = layout.offsetof(6);
    }

    protected IOURingBufRing(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingBufRing create(long address, @Nullable ByteBuffer container) {
        return new IOURingBufRing(address, container);
    }

    /**
     * Creates a {@code IOURingBufRing} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingBufRing(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code resv1} field. */
    @NativeType("__u64")
    public long resv1() { return nresv1(address()); }
    /** @return the value of the {@code resv2} field. */
    @NativeType("__u32")
    public int resv2() { return nresv2(address()); }
    /** @return the value of the {@code resv3} field. */
    @NativeType("__u16")
    public short resv3() { return nresv3(address()); }
    /** @return the value of the {@code tail} field. */
    @NativeType("__u16")
    public short tail() { return ntail(address()); }
    /** @return a {@link IOURingBuf}.Buffer view of the {@code bufs} field. */
    @NativeType("struct io_uring_buf[0]")
    public IOURingBuf.Buffer bufs() { return nbufs(address()); }
    /** @return a {@link IOURingBuf} view of the struct at the specified index of the {@code bufs} field. */
    @NativeType("struct io_uring_buf")
    public IOURingBuf bufs(int index) { return nbufs(address(), index); }

    /** Sets the specified value to the {@code resv1} field. */
    public IOURingBufRing resv1(@NativeType("__u64") long value) { nresv1(address(), value); return this; }
    /** Sets the specified value to the {@code resv2} field. */
    public IOURingBufRing resv2(@NativeType("__u32") int value) { nresv2(address(), value); return this; }
    /** Sets the specified value to the {@code resv3} field. */
    public IOURingBufRing resv3(@NativeType("__u16") short value) { nresv3(address(), value); return this; }
    /** Sets the specified value to the {@code tail} field. */
    public IOURingBufRing tail(@NativeType("__u16") short value) { ntail(address(), value); return this; }
    /** Copies the specified {@link IOURingBuf.Buffer} to the {@code bufs} field. */
    public IOURingBufRing bufs(@NativeType("struct io_uring_buf[0]") IOURingBuf.Buffer value) { nbufs(address(), value); return this; }
    /** Copies the specified {@link IOURingBuf} at the specified index of the {@code bufs} field. */
    public IOURingBufRing bufs(int index, @NativeType("struct io_uring_buf") IOURingBuf value) { nbufs(address(), index, value); return this; }
    /** Passes the {@code bufs} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingBufRing bufs(java.util.function.Consumer<IOURingBuf.Buffer> consumer) { consumer.accept(bufs()); return this; }
    /** Passes the element at {@code index} of the {@code bufs} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingBufRing bufs(int index, java.util.function.Consumer<IOURingBuf> consumer) { consumer.accept(bufs(index)); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingBufRing set(IOURingBufRing src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingBufRing} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingBufRing malloc() {
        return new IOURingBufRing(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingBufRing} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingBufRing calloc() {
        return new IOURingBufRing(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingBufRing} instance allocated with {@link BufferUtils}. */
    public static IOURingBufRing create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingBufRing(memAddress(container), container);
    }

    /** Returns a new {@code IOURingBufRing} instance for the specified memory address. */
    public static IOURingBufRing create(long address) {
        return new IOURingBufRing(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingBufRing createSafe(long address) {
        return address == NULL ? null : new IOURingBufRing(address, null);
    }

    /**
     * Returns a new {@link IOURingBufRing.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBufRing.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingBufRing.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBufRing.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBufRing.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBufRing.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingBufRing.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingBufRing.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingBufRing.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingBufRing} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBufRing malloc(MemoryStack stack) {
        return new IOURingBufRing(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingBufRing} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBufRing calloc(MemoryStack stack) {
        return new IOURingBufRing(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingBufRing.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBufRing.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBufRing.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBufRing.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #resv1}. */
    public static long nresv1(long struct) { return UNSAFE.getLong(null, struct + IOURingBufRing.RESV1); }
    /** Unsafe version of {@link #resv2}. */
    public static int nresv2(long struct) { return UNSAFE.getInt(null, struct + IOURingBufRing.RESV2); }
    /** Unsafe version of {@link #resv3}. */
    public static short nresv3(long struct) { return UNSAFE.getShort(null, struct + IOURingBufRing.RESV3); }
    /** Unsafe version of {@link #tail}. */
    public static short ntail(long struct) { return UNSAFE.getShort(null, struct + IOURingBufRing.TAIL); }
    /** Unsafe version of {@link #bufs}. */
    public static IOURingBuf.Buffer nbufs(long struct) { return IOURingBuf.create(struct + IOURingBufRing.BUFS, 0); }
    /** Unsafe version of {@link #bufs(int) bufs}. */
    public static IOURingBuf nbufs(long struct, int index) {
        return IOURingBuf.create(struct + IOURingBufRing.BUFS + check(index, 0) * IOURingBuf.SIZEOF);
    }

    /** Unsafe version of {@link #resv1(long) resv1}. */
    public static void nresv1(long struct, long value) { UNSAFE.putLong(null, struct + IOURingBufRing.RESV1, value); }
    /** Unsafe version of {@link #resv2(int) resv2}. */
    public static void nresv2(long struct, int value) { UNSAFE.putInt(null, struct + IOURingBufRing.RESV2, value); }
    /** Unsafe version of {@link #resv3(short) resv3}. */
    public static void nresv3(long struct, short value) { UNSAFE.putShort(null, struct + IOURingBufRing.RESV3, value); }
    /** Unsafe version of {@link #tail(short) tail}. */
    public static void ntail(long struct, short value) { UNSAFE.putShort(null, struct + IOURingBufRing.TAIL, value); }
    /** Unsafe version of {@link #bufs(IOURingBuf.Buffer) bufs}. */
    public static void nbufs(long struct, IOURingBuf.Buffer value) {
        if (CHECKS) { checkGT(value, 0); }
        memCopy(value.address(), struct + IOURingBufRing.BUFS, value.remaining() * IOURingBuf.SIZEOF);
    }
    /** Unsafe version of {@link #bufs(int, IOURingBuf) bufs}. */
    public static void nbufs(long struct, int index, IOURingBuf value) {
        memCopy(value.address(), struct + IOURingBufRing.BUFS + check(index, 0) * IOURingBuf.SIZEOF, IOURingBuf.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link IOURingBufRing} structs. */
    public static class Buffer extends StructBuffer<IOURingBufRing, Buffer> implements NativeResource {

        private static final IOURingBufRing ELEMENT_FACTORY = IOURingBufRing.create(-1L);

        /**
         * Creates a new {@code IOURingBufRing.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingBufRing#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingBufRing getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code resv1} field. */
        @NativeType("__u64")
        public long resv1() { return IOURingBufRing.nresv1(address()); }
        /** @return the value of the {@code resv2} field. */
        @NativeType("__u32")
        public int resv2() { return IOURingBufRing.nresv2(address()); }
        /** @return the value of the {@code resv3} field. */
        @NativeType("__u16")
        public short resv3() { return IOURingBufRing.nresv3(address()); }
        /** @return the value of the {@code tail} field. */
        @NativeType("__u16")
        public short tail() { return IOURingBufRing.ntail(address()); }
        /** @return a {@link IOURingBuf}.Buffer view of the {@code bufs} field. */
        @NativeType("struct io_uring_buf[0]")
        public IOURingBuf.Buffer bufs() { return IOURingBufRing.nbufs(address()); }
        /** @return a {@link IOURingBuf} view of the struct at the specified index of the {@code bufs} field. */
        @NativeType("struct io_uring_buf")
        public IOURingBuf bufs(int index) { return IOURingBufRing.nbufs(address(), index); }

        /** Sets the specified value to the {@code resv1} field. */
        public IOURingBufRing.Buffer resv1(@NativeType("__u64") long value) { IOURingBufRing.nresv1(address(), value); return this; }
        /** Sets the specified value to the {@code resv2} field. */
        public IOURingBufRing.Buffer resv2(@NativeType("__u32") int value) { IOURingBufRing.nresv2(address(), value); return this; }
        /** Sets the specified value to the {@code resv3} field. */
        public IOURingBufRing.Buffer resv3(@NativeType("__u16") short value) { IOURingBufRing.nresv3(address(), value); return this; }
        /** Sets the specified value to the {@code tail} field. */
        public IOURingBufRing.Buffer tail(@NativeType("__u16") short value) { IOURingBufRing.ntail(address(), value); return this; }
        /** Copies the specified {@link IOURingBuf.Buffer} to the {@code bufs} field. */
        public IOURingBufRing.Buffer bufs(@NativeType("struct io_uring_buf[0]") IOURingBuf.Buffer value) { IOURingBufRing.nbufs(address(), value); return this; }
        /** Copies the specified {@link IOURingBuf} at the specified index of the {@code bufs} field. */
        public IOURingBufRing.Buffer bufs(int index, @NativeType("struct io_uring_buf") IOURingBuf value) { IOURingBufRing.nbufs(address(), index, value); return this; }
        /** Passes the {@code bufs} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingBufRing.Buffer bufs(java.util.function.Consumer<IOURingBuf.Buffer> consumer) { consumer.accept(bufs()); return this; }
        /** Passes the element at {@code index} of the {@code bufs} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingBufRing.Buffer bufs(int index, java.util.function.Consumer<IOURingBuf> consumer) { consumer.accept(bufs(index)); return this; }

    }

}